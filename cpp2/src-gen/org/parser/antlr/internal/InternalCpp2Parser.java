package org.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.services.Cpp2GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCpp2Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_CHARACTER_LITERAL", "RULE_FLOATING_LITERAL", "RULE_STRING_LITERAL", "RULE_ID", "RULE_HEXADECIMAL_DIGIT", "RULE_HEX_QUAD", "RULE_UNIVERSAL_CHARACTER_NAME", "RULE_KEYWORD", "RULE_PREPROCESSING_OP_OR_PUNC", "RULE_NONDIGIT", "RULE_DIGIT", "RULE_DECIMAL_LITERAL", "RULE_OCTAL_LITERAL", "RULE_HEXADECIMAL_LITERAL", "RULE_INTEGER_SUFFIX", "RULE_OCTAL_DIGIT", "RULE_C_CHAR", "RULE_ESCAPE_SEQUENCE", "RULE_SIMPLE_ESCAPE_SEQUENCE", "RULE_OCTAL_ESCAPE_SEQUENCE", "RULE_HEXADECIMAL_ESCAPE_SEQUENCE", "RULE_FRACTIONAL_CONSTANT", "RULE_EXPONENT_PART", "RULE_ENC_PREFIX", "RULE_SCHAR", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'nullptr'", "'using'", "'='", "';'", "'default'", "'delete'", "'static_assert'", "'('", "','", "')'", "'friend'", "'typedef'", "'constexpr'", "'register'", "'static'", "'thread_local'", "'extern'", "'mutable'", "'inline'", "'virtual'", "'explicit'", "'::'", "'template'", "'char'", "'char16_t'", "'char32_t'", "'wchar_t'", "'bool'", "'short'", "'int'", "'long'", "'signed'", "'unsigned'", "'float'", "'double'", "'void'", "'auto'", "'decltype'", "'{'", "'}'", "'enum'", "'class'", "'struct'", "':'", "'namespace'", "'typename'", "'asm'", "'const'", "'volatile'", "'&'", "'&&'", "'...'", "'final'", "'union'", "'override'", "'new'", "'0'", "'private'", "'protected'", "'public'", "'operator'", "'<'", "'>'", "'['", "']'", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'|'", "'~'", "'!'", "'+='", "'-='", "'*='", "'/='", "'%='", "'^='", "'&='", "'|='", "'<<'", "'>>'", "'>>='", "'<<='", "'=='", "'!='", "'<='", "'>='", "'||'", "'++'", "'--'", "'->*'", "'->'", "'()'", "'[]'", "'\"'", "'try'", "'catch'", "'throw'", "'noexcept'", "'Expression'", "'ExplicitSpecialization'", "'ExplicitInstantiation'", "'CvQualifier'", "'ConstantExpression'", "'IdExpression'", "'NestedNameSpecifier'", "'AssignmentExpression'", "'CompoundStatement'", "'CtorInitializer'", "'TypeIdList'", "'UnqualifiedId'"
    };
    public static final int RULE_ID=8;
    public static final int RULE_FLOATING_LITERAL=6;
    public static final int RULE_ANY_OTHER=34;
    public static final int EOF=-1;
    public static final int T__93=93;
    public static final int RULE_OCTAL_DIGIT=20;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__148=148;
    public static final int T__147=147;
    public static final int T__90=90;
    public static final int T__149=149;
    public static final int RULE_KEYWORD=12;
    public static final int RULE_DECIMAL_LITERAL=16;
    public static final int RULE_OCTAL_LITERAL=17;
    public static final int RULE_NONDIGIT=14;
    public static final int T__99=99;
    public static final int T__150=150;
    public static final int T__98=98;
    public static final int RULE_CHARACTER_LITERAL=5;
    public static final int T__97=97;
    public static final int RULE_HEX_QUAD=10;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int RULE_HEXADECIMAL_LITERAL=18;
    public static final int T__139=139;
    public static final int T__138=138;
    public static final int T__137=137;
    public static final int T__136=136;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_SCHAR=29;
    public static final int RULE_C_CHAR=21;
    public static final int T__141=141;
    public static final int T__85=85;
    public static final int T__142=142;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__140=140;
    public static final int T__86=86;
    public static final int T__145=145;
    public static final int T__89=89;
    public static final int T__146=146;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=31;
    public static final int T__143=143;
    public static final int T__144=144;
    public static final int T__126=126;
    public static final int T__125=125;
    public static final int T__128=128;
    public static final int RULE_STRING=30;
    public static final int T__127=127;
    public static final int T__71=71;
    public static final int T__129=129;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int RULE_OCTAL_ESCAPE_SEQUENCE=24;
    public static final int T__76=76;
    public static final int RULE_DIGIT=15;
    public static final int T__75=75;
    public static final int T__130=130;
    public static final int T__74=74;
    public static final int RULE_INTEGER_SUFFIX=19;
    public static final int T__131=131;
    public static final int T__73=73;
    public static final int T__132=132;
    public static final int T__133=133;
    public static final int T__79=79;
    public static final int RULE_SIMPLE_ESCAPE_SEQUENCE=23;
    public static final int T__134=134;
    public static final int T__78=78;
    public static final int T__135=135;
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
    public static final int T__118=118;
    public static final int RULE_HEXADECIMAL_ESCAPE_SEQUENCE=25;
    public static final int T__119=119;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int RULE_ENC_PREFIX=28;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int T__124=124;
    public static final int T__123=123;
    public static final int T__122=122;
    public static final int T__121=121;
    public static final int T__120=120;
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
    public static final int RULE_STRING_LITERAL=7;
    public static final int T__54=54;
    public static final int RULE_FRACTIONAL_CONSTANT=26;
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
    public static final int RULE_INT=4;
    public static final int T__113=113;
    public static final int T__112=112;
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
    public static final int RULE_PREPROCESSING_OP_OR_PUNC=13;
    public static final int T__100=100;
    public static final int RULE_SL_COMMENT=32;
    public static final int RULE_HEXADECIMAL_DIGIT=9;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_UNIVERSAL_CHARACTER_NAME=11;
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
    public String getGrammarFileName() { return "../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g"; }



     	private Cpp2GrammarAccess grammarAccess;
     	
        public InternalCpp2Parser(TokenStream input, Cpp2GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Test";	
       	}
       	
       	@Override
       	protected Cpp2GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleTest"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:67:1: entryRuleTest returns [EObject current=null] : iv_ruleTest= ruleTest EOF ;
    public final EObject entryRuleTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTest = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:68:2: (iv_ruleTest= ruleTest EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:69:2: iv_ruleTest= ruleTest EOF
            {
             newCompositeNode(grammarAccess.getTestRule()); 
            pushFollow(FOLLOW_ruleTest_in_entryRuleTest75);
            iv_ruleTest=ruleTest();

            state._fsp--;

             current =iv_ruleTest; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTest85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTest"


    // $ANTLR start "ruleTest"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:76:1: ruleTest returns [EObject current=null] : ( (lv_elements_0_0= ruleDeclaration ) )* ;
    public final EObject ruleTest() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_elements_0_0 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:79:28: ( ( (lv_elements_0_0= ruleDeclaration ) )* )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:80:1: ( (lv_elements_0_0= ruleDeclaration ) )*
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:80:1: ( (lv_elements_0_0= ruleDeclaration ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==38||LA1_0==40||LA1_0==43||(LA1_0>=47 && LA1_0<=58)||(LA1_0>=59 && LA1_0<=74)||(LA1_0>=77 && LA1_0<=79)||(LA1_0>=81 && LA1_0<=83)||LA1_0==88||LA1_0==90||(LA1_0>=140 && LA1_0<=142)||(LA1_0>=144 && LA1_0<=145)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:81:1: (lv_elements_0_0= ruleDeclaration )
            	    {
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:81:1: (lv_elements_0_0= ruleDeclaration )
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:82:3: lv_elements_0_0= ruleDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTestAccess().getElementsDeclarationParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDeclaration_in_ruleTest130);
            	    lv_elements_0_0=ruleDeclaration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTestRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_0_0, 
            	            		"Declaration");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTest"


    // $ANTLR start "entryRuleLiteral"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:108:1: entryRuleLiteral returns [String current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final String entryRuleLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteral = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:109:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:110:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral169);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral180); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:117:1: ruleLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_CHARACTER_LITERAL_1= RULE_CHARACTER_LITERAL | this_FLOATING_LITERAL_2= RULE_FLOATING_LITERAL | this_STRING_LITERAL_3= RULE_STRING_LITERAL | ( (kw= 'true' | kw= 'false' ) kw= 'nullptr' ) ) ;
    public final AntlrDatatypeRuleToken ruleLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_CHARACTER_LITERAL_1=null;
        Token this_FLOATING_LITERAL_2=null;
        Token this_STRING_LITERAL_3=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:120:28: ( (this_INT_0= RULE_INT | this_CHARACTER_LITERAL_1= RULE_CHARACTER_LITERAL | this_FLOATING_LITERAL_2= RULE_FLOATING_LITERAL | this_STRING_LITERAL_3= RULE_STRING_LITERAL | ( (kw= 'true' | kw= 'false' ) kw= 'nullptr' ) ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:121:1: (this_INT_0= RULE_INT | this_CHARACTER_LITERAL_1= RULE_CHARACTER_LITERAL | this_FLOATING_LITERAL_2= RULE_FLOATING_LITERAL | this_STRING_LITERAL_3= RULE_STRING_LITERAL | ( (kw= 'true' | kw= 'false' ) kw= 'nullptr' ) )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:121:1: (this_INT_0= RULE_INT | this_CHARACTER_LITERAL_1= RULE_CHARACTER_LITERAL | this_FLOATING_LITERAL_2= RULE_FLOATING_LITERAL | this_STRING_LITERAL_3= RULE_STRING_LITERAL | ( (kw= 'true' | kw= 'false' ) kw= 'nullptr' ) )
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
            case 35:
            case 36:
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
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:121:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLiteral220); 

                    		current.merge(this_INT_0);
                        
                     
                        newLeafNode(this_INT_0, grammarAccess.getLiteralAccess().getINTTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:129:10: this_CHARACTER_LITERAL_1= RULE_CHARACTER_LITERAL
                    {
                    this_CHARACTER_LITERAL_1=(Token)match(input,RULE_CHARACTER_LITERAL,FOLLOW_RULE_CHARACTER_LITERAL_in_ruleLiteral246); 

                    		current.merge(this_CHARACTER_LITERAL_1);
                        
                     
                        newLeafNode(this_CHARACTER_LITERAL_1, grammarAccess.getLiteralAccess().getCHARACTER_LITERALTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:137:10: this_FLOATING_LITERAL_2= RULE_FLOATING_LITERAL
                    {
                    this_FLOATING_LITERAL_2=(Token)match(input,RULE_FLOATING_LITERAL,FOLLOW_RULE_FLOATING_LITERAL_in_ruleLiteral272); 

                    		current.merge(this_FLOATING_LITERAL_2);
                        
                     
                        newLeafNode(this_FLOATING_LITERAL_2, grammarAccess.getLiteralAccess().getFLOATING_LITERALTerminalRuleCall_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:145:10: this_STRING_LITERAL_3= RULE_STRING_LITERAL
                    {
                    this_STRING_LITERAL_3=(Token)match(input,RULE_STRING_LITERAL,FOLLOW_RULE_STRING_LITERAL_in_ruleLiteral298); 

                    		current.merge(this_STRING_LITERAL_3);
                        
                     
                        newLeafNode(this_STRING_LITERAL_3, grammarAccess.getLiteralAccess().getSTRING_LITERALTerminalRuleCall_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:153:6: ( (kw= 'true' | kw= 'false' ) kw= 'nullptr' )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:153:6: ( (kw= 'true' | kw= 'false' ) kw= 'nullptr' )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:153:7: (kw= 'true' | kw= 'false' ) kw= 'nullptr'
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:153:7: (kw= 'true' | kw= 'false' )
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==35) ) {
                        alt2=1;
                    }
                    else if ( (LA2_0==36) ) {
                        alt2=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 0, input);

                        throw nvae;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:154:2: kw= 'true'
                            {
                            kw=(Token)match(input,35,FOLLOW_35_in_ruleLiteral324); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getLiteralAccess().getTrueKeyword_4_0_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:161:2: kw= 'false'
                            {
                            kw=(Token)match(input,36,FOLLOW_36_in_ruleLiteral343); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getLiteralAccess().getFalseKeyword_4_0_1()); 
                                

                            }
                            break;

                    }

                    kw=(Token)match(input,37,FOLLOW_37_in_ruleLiteral357); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLiteralAccess().getNullptrKeyword_4_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleDeclaration"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:182:1: entryRuleDeclaration returns [String current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final String entryRuleDeclaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDeclaration = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:183:2: (iv_ruleDeclaration= ruleDeclaration EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:184:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration401);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;

             current =iv_ruleDeclaration.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration412); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:191:1: ruleDeclaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SimpleOrFunctionDeclaration_0= ruleSimpleOrFunctionDeclaration | this_BlockDeclaration_1= ruleBlockDeclaration | this_TemplateDeclaration_2= ruleTemplateDeclaration | this_ExplicitInstantiation_3= ruleExplicitInstantiation | this_ExplicitSpecialization_4= ruleExplicitSpecialization | this_LinkageSpecification_5= ruleLinkageSpecification | this_NamespaceDefinition_6= ruleNamespaceDefinition ) ;
    public final AntlrDatatypeRuleToken ruleDeclaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_SimpleOrFunctionDeclaration_0 = null;

        AntlrDatatypeRuleToken this_BlockDeclaration_1 = null;

        AntlrDatatypeRuleToken this_TemplateDeclaration_2 = null;

        AntlrDatatypeRuleToken this_ExplicitInstantiation_3 = null;

        AntlrDatatypeRuleToken this_ExplicitSpecialization_4 = null;

        AntlrDatatypeRuleToken this_LinkageSpecification_5 = null;

        AntlrDatatypeRuleToken this_NamespaceDefinition_6 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:194:28: ( (this_SimpleOrFunctionDeclaration_0= ruleSimpleOrFunctionDeclaration | this_BlockDeclaration_1= ruleBlockDeclaration | this_TemplateDeclaration_2= ruleTemplateDeclaration | this_ExplicitInstantiation_3= ruleExplicitInstantiation | this_ExplicitSpecialization_4= ruleExplicitSpecialization | this_LinkageSpecification_5= ruleLinkageSpecification | this_NamespaceDefinition_6= ruleNamespaceDefinition ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:195:1: (this_SimpleOrFunctionDeclaration_0= ruleSimpleOrFunctionDeclaration | this_BlockDeclaration_1= ruleBlockDeclaration | this_TemplateDeclaration_2= ruleTemplateDeclaration | this_ExplicitInstantiation_3= ruleExplicitInstantiation | this_ExplicitSpecialization_4= ruleExplicitSpecialization | this_LinkageSpecification_5= ruleLinkageSpecification | this_NamespaceDefinition_6= ruleNamespaceDefinition )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:195:1: (this_SimpleOrFunctionDeclaration_0= ruleSimpleOrFunctionDeclaration | this_BlockDeclaration_1= ruleBlockDeclaration | this_TemplateDeclaration_2= ruleTemplateDeclaration | this_ExplicitInstantiation_3= ruleExplicitInstantiation | this_ExplicitSpecialization_4= ruleExplicitSpecialization | this_LinkageSpecification_5= ruleLinkageSpecification | this_NamespaceDefinition_6= ruleNamespaceDefinition )
            int alt4=7;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:196:5: this_SimpleOrFunctionDeclaration_0= ruleSimpleOrFunctionDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getDeclarationAccess().getSimpleOrFunctionDeclarationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSimpleOrFunctionDeclaration_in_ruleDeclaration459);
                    this_SimpleOrFunctionDeclaration_0=ruleSimpleOrFunctionDeclaration();

                    state._fsp--;


                    		current.merge(this_SimpleOrFunctionDeclaration_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:208:5: this_BlockDeclaration_1= ruleBlockDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getDeclarationAccess().getBlockDeclarationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBlockDeclaration_in_ruleDeclaration492);
                    this_BlockDeclaration_1=ruleBlockDeclaration();

                    state._fsp--;


                    		current.merge(this_BlockDeclaration_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:220:5: this_TemplateDeclaration_2= ruleTemplateDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getDeclarationAccess().getTemplateDeclarationParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleTemplateDeclaration_in_ruleDeclaration525);
                    this_TemplateDeclaration_2=ruleTemplateDeclaration();

                    state._fsp--;


                    		current.merge(this_TemplateDeclaration_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:232:5: this_ExplicitInstantiation_3= ruleExplicitInstantiation
                    {
                     
                            newCompositeNode(grammarAccess.getDeclarationAccess().getExplicitInstantiationParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleExplicitInstantiation_in_ruleDeclaration558);
                    this_ExplicitInstantiation_3=ruleExplicitInstantiation();

                    state._fsp--;


                    		current.merge(this_ExplicitInstantiation_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:244:5: this_ExplicitSpecialization_4= ruleExplicitSpecialization
                    {
                     
                            newCompositeNode(grammarAccess.getDeclarationAccess().getExplicitSpecializationParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleExplicitSpecialization_in_ruleDeclaration591);
                    this_ExplicitSpecialization_4=ruleExplicitSpecialization();

                    state._fsp--;


                    		current.merge(this_ExplicitSpecialization_4);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:256:5: this_LinkageSpecification_5= ruleLinkageSpecification
                    {
                     
                            newCompositeNode(grammarAccess.getDeclarationAccess().getLinkageSpecificationParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleLinkageSpecification_in_ruleDeclaration624);
                    this_LinkageSpecification_5=ruleLinkageSpecification();

                    state._fsp--;


                    		current.merge(this_LinkageSpecification_5);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:268:5: this_NamespaceDefinition_6= ruleNamespaceDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getDeclarationAccess().getNamespaceDefinitionParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleNamespaceDefinition_in_ruleDeclaration657);
                    this_NamespaceDefinition_6=ruleNamespaceDefinition();

                    state._fsp--;


                    		current.merge(this_NamespaceDefinition_6);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleBlockDeclaration"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:286:1: entryRuleBlockDeclaration returns [String current=null] : iv_ruleBlockDeclaration= ruleBlockDeclaration EOF ;
    public final String entryRuleBlockDeclaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBlockDeclaration = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:287:2: (iv_ruleBlockDeclaration= ruleBlockDeclaration EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:288:2: iv_ruleBlockDeclaration= ruleBlockDeclaration EOF
            {
             newCompositeNode(grammarAccess.getBlockDeclarationRule()); 
            pushFollow(FOLLOW_ruleBlockDeclaration_in_entryRuleBlockDeclaration703);
            iv_ruleBlockDeclaration=ruleBlockDeclaration();

            state._fsp--;

             current =iv_ruleBlockDeclaration.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlockDeclaration714); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBlockDeclaration"


    // $ANTLR start "ruleBlockDeclaration"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:295:1: ruleBlockDeclaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_AsmDefinition_0= ruleAsmDefinition | this_NamespaceAliasDefinition_1= ruleNamespaceAliasDefinition | this_UsingDeclaration_2= ruleUsingDeclaration | this_StaticAssertDeclaration_3= ruleStaticAssertDeclaration | this_AliasDeclaration_4= ruleAliasDeclaration ) ;
    public final AntlrDatatypeRuleToken ruleBlockDeclaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_AsmDefinition_0 = null;

        AntlrDatatypeRuleToken this_NamespaceAliasDefinition_1 = null;

        AntlrDatatypeRuleToken this_UsingDeclaration_2 = null;

        AntlrDatatypeRuleToken this_StaticAssertDeclaration_3 = null;

        AntlrDatatypeRuleToken this_AliasDeclaration_4 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:298:28: ( (this_AsmDefinition_0= ruleAsmDefinition | this_NamespaceAliasDefinition_1= ruleNamespaceAliasDefinition | this_UsingDeclaration_2= ruleUsingDeclaration | this_StaticAssertDeclaration_3= ruleStaticAssertDeclaration | this_AliasDeclaration_4= ruleAliasDeclaration ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:299:1: (this_AsmDefinition_0= ruleAsmDefinition | this_NamespaceAliasDefinition_1= ruleNamespaceAliasDefinition | this_UsingDeclaration_2= ruleUsingDeclaration | this_StaticAssertDeclaration_3= ruleStaticAssertDeclaration | this_AliasDeclaration_4= ruleAliasDeclaration )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:299:1: (this_AsmDefinition_0= ruleAsmDefinition | this_NamespaceAliasDefinition_1= ruleNamespaceAliasDefinition | this_UsingDeclaration_2= ruleUsingDeclaration | this_StaticAssertDeclaration_3= ruleStaticAssertDeclaration | this_AliasDeclaration_4= ruleAliasDeclaration )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 83:
                {
                alt5=1;
                }
                break;
            case 81:
                {
                alt5=2;
                }
                break;
            case 38:
                {
                int LA5_3 = input.LA(2);

                if ( (LA5_3==58||LA5_3==82||LA5_3==145) ) {
                    alt5=3;
                }
                else if ( (LA5_3==RULE_ID) ) {
                    alt5=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 3, input);

                    throw nvae;
                }
                }
                break;
            case 43:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:300:5: this_AsmDefinition_0= ruleAsmDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getBlockDeclarationAccess().getAsmDefinitionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAsmDefinition_in_ruleBlockDeclaration761);
                    this_AsmDefinition_0=ruleAsmDefinition();

                    state._fsp--;


                    		current.merge(this_AsmDefinition_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:312:5: this_NamespaceAliasDefinition_1= ruleNamespaceAliasDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getBlockDeclarationAccess().getNamespaceAliasDefinitionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNamespaceAliasDefinition_in_ruleBlockDeclaration794);
                    this_NamespaceAliasDefinition_1=ruleNamespaceAliasDefinition();

                    state._fsp--;


                    		current.merge(this_NamespaceAliasDefinition_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:324:5: this_UsingDeclaration_2= ruleUsingDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getBlockDeclarationAccess().getUsingDeclarationParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleUsingDeclaration_in_ruleBlockDeclaration827);
                    this_UsingDeclaration_2=ruleUsingDeclaration();

                    state._fsp--;


                    		current.merge(this_UsingDeclaration_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:336:5: this_StaticAssertDeclaration_3= ruleStaticAssertDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getBlockDeclarationAccess().getStaticAssertDeclarationParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleStaticAssertDeclaration_in_ruleBlockDeclaration860);
                    this_StaticAssertDeclaration_3=ruleStaticAssertDeclaration();

                    state._fsp--;


                    		current.merge(this_StaticAssertDeclaration_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:348:5: this_AliasDeclaration_4= ruleAliasDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getBlockDeclarationAccess().getAliasDeclarationParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleAliasDeclaration_in_ruleBlockDeclaration893);
                    this_AliasDeclaration_4=ruleAliasDeclaration();

                    state._fsp--;


                    		current.merge(this_AliasDeclaration_4);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBlockDeclaration"


    // $ANTLR start "entryRuleAliasDeclaration"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:366:1: entryRuleAliasDeclaration returns [String current=null] : iv_ruleAliasDeclaration= ruleAliasDeclaration EOF ;
    public final String entryRuleAliasDeclaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAliasDeclaration = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:367:2: (iv_ruleAliasDeclaration= ruleAliasDeclaration EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:368:2: iv_ruleAliasDeclaration= ruleAliasDeclaration EOF
            {
             newCompositeNode(grammarAccess.getAliasDeclarationRule()); 
            pushFollow(FOLLOW_ruleAliasDeclaration_in_entryRuleAliasDeclaration939);
            iv_ruleAliasDeclaration=ruleAliasDeclaration();

            state._fsp--;

             current =iv_ruleAliasDeclaration.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAliasDeclaration950); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAliasDeclaration"


    // $ANTLR start "ruleAliasDeclaration"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:375:1: ruleAliasDeclaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'using' this_ID_1= RULE_ID kw= '=' this_TypeId_3= ruleTypeId kw= ';' ) ;
    public final AntlrDatatypeRuleToken ruleAliasDeclaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        AntlrDatatypeRuleToken this_TypeId_3 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:378:28: ( (kw= 'using' this_ID_1= RULE_ID kw= '=' this_TypeId_3= ruleTypeId kw= ';' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:379:1: (kw= 'using' this_ID_1= RULE_ID kw= '=' this_TypeId_3= ruleTypeId kw= ';' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:379:1: (kw= 'using' this_ID_1= RULE_ID kw= '=' this_TypeId_3= ruleTypeId kw= ';' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:380:2: kw= 'using' this_ID_1= RULE_ID kw= '=' this_TypeId_3= ruleTypeId kw= ';'
            {
            kw=(Token)match(input,38,FOLLOW_38_in_ruleAliasDeclaration988); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getAliasDeclarationAccess().getUsingKeyword_0()); 
                
            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAliasDeclaration1003); 

            		current.merge(this_ID_1);
                
             
                newLeafNode(this_ID_1, grammarAccess.getAliasDeclarationAccess().getIDTerminalRuleCall_1()); 
                
            kw=(Token)match(input,39,FOLLOW_39_in_ruleAliasDeclaration1021); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getAliasDeclarationAccess().getEqualsSignKeyword_2()); 
                
             
                    newCompositeNode(grammarAccess.getAliasDeclarationAccess().getTypeIdParserRuleCall_3()); 
                
            pushFollow(FOLLOW_ruleTypeId_in_ruleAliasDeclaration1043);
            this_TypeId_3=ruleTypeId();

            state._fsp--;


            		current.merge(this_TypeId_3);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,40,FOLLOW_40_in_ruleAliasDeclaration1061); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getAliasDeclarationAccess().getSemicolonKeyword_4()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAliasDeclaration"


    // $ANTLR start "entryRuleSimpleDeclaration"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:423:1: entryRuleSimpleDeclaration returns [String current=null] : iv_ruleSimpleDeclaration= ruleSimpleDeclaration EOF ;
    public final String entryRuleSimpleDeclaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSimpleDeclaration = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:424:2: (iv_ruleSimpleDeclaration= ruleSimpleDeclaration EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:425:2: iv_ruleSimpleDeclaration= ruleSimpleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getSimpleDeclarationRule()); 
            pushFollow(FOLLOW_ruleSimpleDeclaration_in_entryRuleSimpleDeclaration1102);
            iv_ruleSimpleDeclaration=ruleSimpleDeclaration();

            state._fsp--;

             current =iv_ruleSimpleDeclaration.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleDeclaration1113); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleDeclaration"


    // $ANTLR start "ruleSimpleDeclaration"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:432:1: ruleSimpleDeclaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_DeclarationSpecifier_0= ruleDeclarationSpecifier )* this_SimpleDeclarationSuffix_1= ruleSimpleDeclarationSuffix ) ;
    public final AntlrDatatypeRuleToken ruleSimpleDeclaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_DeclarationSpecifier_0 = null;

        AntlrDatatypeRuleToken this_SimpleDeclarationSuffix_1 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:435:28: ( ( (this_DeclarationSpecifier_0= ruleDeclarationSpecifier )* this_SimpleDeclarationSuffix_1= ruleSimpleDeclarationSuffix ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:436:1: ( (this_DeclarationSpecifier_0= ruleDeclarationSpecifier )* this_SimpleDeclarationSuffix_1= ruleSimpleDeclarationSuffix )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:436:1: ( (this_DeclarationSpecifier_0= ruleDeclarationSpecifier )* this_SimpleDeclarationSuffix_1= ruleSimpleDeclarationSuffix )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:436:2: (this_DeclarationSpecifier_0= ruleDeclarationSpecifier )* this_SimpleDeclarationSuffix_1= ruleSimpleDeclarationSuffix
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:436:2: (this_DeclarationSpecifier_0= ruleDeclarationSpecifier )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||(LA6_0>=47 && LA6_0<=58)||(LA6_0>=60 && LA6_0<=74)||(LA6_0>=77 && LA6_0<=79)||LA6_0==82||LA6_0==90||LA6_0==142||LA6_0==145) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:437:5: this_DeclarationSpecifier_0= ruleDeclarationSpecifier
            	    {
            	     
            	            newCompositeNode(grammarAccess.getSimpleDeclarationAccess().getDeclarationSpecifierParserRuleCall_0()); 
            	        
            	    pushFollow(FOLLOW_ruleDeclarationSpecifier_in_ruleSimpleDeclaration1161);
            	    this_DeclarationSpecifier_0=ruleDeclarationSpecifier();

            	    state._fsp--;


            	    		current.merge(this_DeclarationSpecifier_0);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             
                    newCompositeNode(grammarAccess.getSimpleDeclarationAccess().getSimpleDeclarationSuffixParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleSimpleDeclarationSuffix_in_ruleSimpleDeclaration1190);
            this_SimpleDeclarationSuffix_1=ruleSimpleDeclarationSuffix();

            state._fsp--;


            		current.merge(this_SimpleDeclarationSuffix_1);
                
             
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleDeclaration"


    // $ANTLR start "entryRuleSimpleOrFunctionDeclaration"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:466:1: entryRuleSimpleOrFunctionDeclaration returns [String current=null] : iv_ruleSimpleOrFunctionDeclaration= ruleSimpleOrFunctionDeclaration EOF ;
    public final String entryRuleSimpleOrFunctionDeclaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSimpleOrFunctionDeclaration = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:467:2: (iv_ruleSimpleOrFunctionDeclaration= ruleSimpleOrFunctionDeclaration EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:468:2: iv_ruleSimpleOrFunctionDeclaration= ruleSimpleOrFunctionDeclaration EOF
            {
             newCompositeNode(grammarAccess.getSimpleOrFunctionDeclarationRule()); 
            pushFollow(FOLLOW_ruleSimpleOrFunctionDeclaration_in_entryRuleSimpleOrFunctionDeclaration1236);
            iv_ruleSimpleOrFunctionDeclaration=ruleSimpleOrFunctionDeclaration();

            state._fsp--;

             current =iv_ruleSimpleOrFunctionDeclaration.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleOrFunctionDeclaration1247); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleOrFunctionDeclaration"


    // $ANTLR start "ruleSimpleOrFunctionDeclaration"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:475:1: ruleSimpleOrFunctionDeclaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_DeclarationSpecifier_0= ruleDeclarationSpecifier )* (this_SimpleDeclarationSuffix_1= ruleSimpleDeclarationSuffix | this_FunctionDeclarationSuffix_2= ruleFunctionDeclarationSuffix ) ) ;
    public final AntlrDatatypeRuleToken ruleSimpleOrFunctionDeclaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_DeclarationSpecifier_0 = null;

        AntlrDatatypeRuleToken this_SimpleDeclarationSuffix_1 = null;

        AntlrDatatypeRuleToken this_FunctionDeclarationSuffix_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:478:28: ( ( (this_DeclarationSpecifier_0= ruleDeclarationSpecifier )* (this_SimpleDeclarationSuffix_1= ruleSimpleDeclarationSuffix | this_FunctionDeclarationSuffix_2= ruleFunctionDeclarationSuffix ) ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:479:1: ( (this_DeclarationSpecifier_0= ruleDeclarationSpecifier )* (this_SimpleDeclarationSuffix_1= ruleSimpleDeclarationSuffix | this_FunctionDeclarationSuffix_2= ruleFunctionDeclarationSuffix ) )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:479:1: ( (this_DeclarationSpecifier_0= ruleDeclarationSpecifier )* (this_SimpleDeclarationSuffix_1= ruleSimpleDeclarationSuffix | this_FunctionDeclarationSuffix_2= ruleFunctionDeclarationSuffix ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:479:2: (this_DeclarationSpecifier_0= ruleDeclarationSpecifier )* (this_SimpleDeclarationSuffix_1= ruleSimpleDeclarationSuffix | this_FunctionDeclarationSuffix_2= ruleFunctionDeclarationSuffix )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:479:2: (this_DeclarationSpecifier_0= ruleDeclarationSpecifier )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||(LA7_0>=47 && LA7_0<=58)||(LA7_0>=60 && LA7_0<=74)||(LA7_0>=77 && LA7_0<=79)||LA7_0==82||LA7_0==90||LA7_0==142||LA7_0==145) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:480:5: this_DeclarationSpecifier_0= ruleDeclarationSpecifier
            	    {
            	     
            	            newCompositeNode(grammarAccess.getSimpleOrFunctionDeclarationAccess().getDeclarationSpecifierParserRuleCall_0()); 
            	        
            	    pushFollow(FOLLOW_ruleDeclarationSpecifier_in_ruleSimpleOrFunctionDeclaration1295);
            	    this_DeclarationSpecifier_0=ruleDeclarationSpecifier();

            	    state._fsp--;


            	    		current.merge(this_DeclarationSpecifier_0);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:490:3: (this_SimpleDeclarationSuffix_1= ruleSimpleDeclarationSuffix | this_FunctionDeclarationSuffix_2= ruleFunctionDeclarationSuffix )
            int alt8=2;
            switch ( input.LA(1) ) {
            case 88:
                {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==144) ) {
                    int LA8_2 = input.LA(3);

                    if ( (LA8_2==44) ) {
                        int LA8_4 = input.LA(4);

                        if ( (LA8_4==RULE_ID||(LA8_4>=46 && LA8_4<=58)||(LA8_4>=60 && LA8_4<=74)||(LA8_4>=77 && LA8_4<=79)||LA8_4==82||LA8_4==88||LA8_4==90||LA8_4==142||LA8_4==145) ) {
                            alt8=2;
                        }
                        else if ( (LA8_4==139) ) {
                            alt8=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 8, 4, input);

                            throw nvae;
                        }
                    }
                    else if ( ((LA8_2>=39 && LA8_2<=40)||LA8_2==45||LA8_2==75) ) {
                        alt8=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
                }
                break;
            case 144:
                {
                int LA8_2 = input.LA(2);

                if ( (LA8_2==44) ) {
                    int LA8_4 = input.LA(3);

                    if ( (LA8_4==RULE_ID||(LA8_4>=46 && LA8_4<=58)||(LA8_4>=60 && LA8_4<=74)||(LA8_4>=77 && LA8_4<=79)||LA8_4==82||LA8_4==88||LA8_4==90||LA8_4==142||LA8_4==145) ) {
                        alt8=2;
                    }
                    else if ( (LA8_4==139) ) {
                        alt8=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 4, input);

                        throw nvae;
                    }
                }
                else if ( ((LA8_2>=39 && LA8_2<=40)||LA8_2==45||LA8_2==75) ) {
                    alt8=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 2, input);

                    throw nvae;
                }
                }
                break;
            case 40:
                {
                alt8=1;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:491:5: this_SimpleDeclarationSuffix_1= ruleSimpleDeclarationSuffix
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleOrFunctionDeclarationAccess().getSimpleDeclarationSuffixParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_ruleSimpleDeclarationSuffix_in_ruleSimpleOrFunctionDeclaration1325);
                    this_SimpleDeclarationSuffix_1=ruleSimpleDeclarationSuffix();

                    state._fsp--;


                    		current.merge(this_SimpleDeclarationSuffix_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:503:5: this_FunctionDeclarationSuffix_2= ruleFunctionDeclarationSuffix
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleOrFunctionDeclarationAccess().getFunctionDeclarationSuffixParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleFunctionDeclarationSuffix_in_ruleSimpleOrFunctionDeclaration1358);
                    this_FunctionDeclarationSuffix_2=ruleFunctionDeclarationSuffix();

                    state._fsp--;


                    		current.merge(this_FunctionDeclarationSuffix_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleOrFunctionDeclaration"


    // $ANTLR start "entryRuleSimpleDeclarationSuffix"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:521:1: entryRuleSimpleDeclarationSuffix returns [String current=null] : iv_ruleSimpleDeclarationSuffix= ruleSimpleDeclarationSuffix EOF ;
    public final String entryRuleSimpleDeclarationSuffix() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSimpleDeclarationSuffix = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:522:2: (iv_ruleSimpleDeclarationSuffix= ruleSimpleDeclarationSuffix EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:523:2: iv_ruleSimpleDeclarationSuffix= ruleSimpleDeclarationSuffix EOF
            {
             newCompositeNode(grammarAccess.getSimpleDeclarationSuffixRule()); 
            pushFollow(FOLLOW_ruleSimpleDeclarationSuffix_in_entryRuleSimpleDeclarationSuffix1405);
            iv_ruleSimpleDeclarationSuffix=ruleSimpleDeclarationSuffix();

            state._fsp--;

             current =iv_ruleSimpleDeclarationSuffix.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleDeclarationSuffix1416); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleDeclarationSuffix"


    // $ANTLR start "ruleSimpleDeclarationSuffix"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:530:1: ruleSimpleDeclarationSuffix returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_InitDeclaratorList_0= ruleInitDeclaratorList )? kw= ';' ) ;
    public final AntlrDatatypeRuleToken ruleSimpleDeclarationSuffix() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_InitDeclaratorList_0 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:533:28: ( ( (this_InitDeclaratorList_0= ruleInitDeclaratorList )? kw= ';' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:534:1: ( (this_InitDeclaratorList_0= ruleInitDeclaratorList )? kw= ';' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:534:1: ( (this_InitDeclaratorList_0= ruleInitDeclaratorList )? kw= ';' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:534:2: (this_InitDeclaratorList_0= ruleInitDeclaratorList )? kw= ';'
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:534:2: (this_InitDeclaratorList_0= ruleInitDeclaratorList )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==88||LA9_0==144) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:535:5: this_InitDeclaratorList_0= ruleInitDeclaratorList
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleDeclarationSuffixAccess().getInitDeclaratorListParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleInitDeclaratorList_in_ruleSimpleDeclarationSuffix1464);
                    this_InitDeclaratorList_0=ruleInitDeclaratorList();

                    state._fsp--;


                    		current.merge(this_InitDeclaratorList_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            kw=(Token)match(input,40,FOLLOW_40_in_ruleSimpleDeclarationSuffix1484); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getSimpleDeclarationSuffixAccess().getSemicolonKeyword_1()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleDeclarationSuffix"


    // $ANTLR start "entryRuleFunctionDeclarationSuffix"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:559:1: entryRuleFunctionDeclarationSuffix returns [String current=null] : iv_ruleFunctionDeclarationSuffix= ruleFunctionDeclarationSuffix EOF ;
    public final String entryRuleFunctionDeclarationSuffix() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunctionDeclarationSuffix = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:560:2: (iv_ruleFunctionDeclarationSuffix= ruleFunctionDeclarationSuffix EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:561:2: iv_ruleFunctionDeclarationSuffix= ruleFunctionDeclarationSuffix EOF
            {
             newCompositeNode(grammarAccess.getFunctionDeclarationSuffixRule()); 
            pushFollow(FOLLOW_ruleFunctionDeclarationSuffix_in_entryRuleFunctionDeclarationSuffix1525);
            iv_ruleFunctionDeclarationSuffix=ruleFunctionDeclarationSuffix();

            state._fsp--;

             current =iv_ruleFunctionDeclarationSuffix.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionDeclarationSuffix1536); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionDeclarationSuffix"


    // $ANTLR start "ruleFunctionDeclarationSuffix"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:568:1: ruleFunctionDeclarationSuffix returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FunctionDeclarator_0= ruleFunctionDeclarator (this_FunctionBody_1= ruleFunctionBody | (kw= '=' kw= 'default' kw= ';' ) | (kw= '=' kw= 'delete' kw= ';' ) ) ) ;
    public final AntlrDatatypeRuleToken ruleFunctionDeclarationSuffix() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FunctionDeclarator_0 = null;

        AntlrDatatypeRuleToken this_FunctionBody_1 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:571:28: ( (this_FunctionDeclarator_0= ruleFunctionDeclarator (this_FunctionBody_1= ruleFunctionBody | (kw= '=' kw= 'default' kw= ';' ) | (kw= '=' kw= 'delete' kw= ';' ) ) ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:572:1: (this_FunctionDeclarator_0= ruleFunctionDeclarator (this_FunctionBody_1= ruleFunctionBody | (kw= '=' kw= 'default' kw= ';' ) | (kw= '=' kw= 'delete' kw= ';' ) ) )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:572:1: (this_FunctionDeclarator_0= ruleFunctionDeclarator (this_FunctionBody_1= ruleFunctionBody | (kw= '=' kw= 'default' kw= ';' ) | (kw= '=' kw= 'delete' kw= ';' ) ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:573:5: this_FunctionDeclarator_0= ruleFunctionDeclarator (this_FunctionBody_1= ruleFunctionBody | (kw= '=' kw= 'default' kw= ';' ) | (kw= '=' kw= 'delete' kw= ';' ) )
            {
             
                    newCompositeNode(grammarAccess.getFunctionDeclarationSuffixAccess().getFunctionDeclaratorParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleFunctionDeclarator_in_ruleFunctionDeclarationSuffix1583);
            this_FunctionDeclarator_0=ruleFunctionDeclarator();

            state._fsp--;


            		current.merge(this_FunctionDeclarator_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:583:1: (this_FunctionBody_1= ruleFunctionBody | (kw= '=' kw= 'default' kw= ';' ) | (kw= '=' kw= 'delete' kw= ';' ) )
            int alt10=3;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==135||(LA10_0>=147 && LA10_0<=148)) ) {
                alt10=1;
            }
            else if ( (LA10_0==39) ) {
                int LA10_2 = input.LA(2);

                if ( (LA10_2==41) ) {
                    alt10=2;
                }
                else if ( (LA10_2==42) ) {
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
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:584:5: this_FunctionBody_1= ruleFunctionBody
                    {
                     
                            newCompositeNode(grammarAccess.getFunctionDeclarationSuffixAccess().getFunctionBodyParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_ruleFunctionBody_in_ruleFunctionDeclarationSuffix1611);
                    this_FunctionBody_1=ruleFunctionBody();

                    state._fsp--;


                    		current.merge(this_FunctionBody_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:595:6: (kw= '=' kw= 'default' kw= ';' )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:595:6: (kw= '=' kw= 'default' kw= ';' )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:596:2: kw= '=' kw= 'default' kw= ';'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleFunctionDeclarationSuffix1636); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionDeclarationSuffixAccess().getEqualsSignKeyword_1_1_0()); 
                        
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleFunctionDeclarationSuffix1649); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionDeclarationSuffixAccess().getDefaultKeyword_1_1_1()); 
                        
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleFunctionDeclarationSuffix1662); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionDeclarationSuffixAccess().getSemicolonKeyword_1_1_2()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:614:6: (kw= '=' kw= 'delete' kw= ';' )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:614:6: (kw= '=' kw= 'delete' kw= ';' )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:615:2: kw= '=' kw= 'delete' kw= ';'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleFunctionDeclarationSuffix1683); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionDeclarationSuffixAccess().getEqualsSignKeyword_1_2_0()); 
                        
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleFunctionDeclarationSuffix1696); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionDeclarationSuffixAccess().getDeleteKeyword_1_2_1()); 
                        
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleFunctionDeclarationSuffix1709); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionDeclarationSuffixAccess().getSemicolonKeyword_1_2_2()); 
                        

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionDeclarationSuffix"


    // $ANTLR start "entryRuleStaticAssertDeclaration"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:640:1: entryRuleStaticAssertDeclaration returns [String current=null] : iv_ruleStaticAssertDeclaration= ruleStaticAssertDeclaration EOF ;
    public final String entryRuleStaticAssertDeclaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticAssertDeclaration = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:641:2: (iv_ruleStaticAssertDeclaration= ruleStaticAssertDeclaration EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:642:2: iv_ruleStaticAssertDeclaration= ruleStaticAssertDeclaration EOF
            {
             newCompositeNode(grammarAccess.getStaticAssertDeclarationRule()); 
            pushFollow(FOLLOW_ruleStaticAssertDeclaration_in_entryRuleStaticAssertDeclaration1752);
            iv_ruleStaticAssertDeclaration=ruleStaticAssertDeclaration();

            state._fsp--;

             current =iv_ruleStaticAssertDeclaration.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticAssertDeclaration1763); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStaticAssertDeclaration"


    // $ANTLR start "ruleStaticAssertDeclaration"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:649:1: ruleStaticAssertDeclaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'static_assert' kw= '(' this_ConstantExpression_2= ruleConstantExpression kw= ',' this_STRING_LITERAL_4= RULE_STRING_LITERAL kw= ')' kw= ';' ) ;
    public final AntlrDatatypeRuleToken ruleStaticAssertDeclaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_STRING_LITERAL_4=null;
        AntlrDatatypeRuleToken this_ConstantExpression_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:652:28: ( (kw= 'static_assert' kw= '(' this_ConstantExpression_2= ruleConstantExpression kw= ',' this_STRING_LITERAL_4= RULE_STRING_LITERAL kw= ')' kw= ';' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:653:1: (kw= 'static_assert' kw= '(' this_ConstantExpression_2= ruleConstantExpression kw= ',' this_STRING_LITERAL_4= RULE_STRING_LITERAL kw= ')' kw= ';' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:653:1: (kw= 'static_assert' kw= '(' this_ConstantExpression_2= ruleConstantExpression kw= ',' this_STRING_LITERAL_4= RULE_STRING_LITERAL kw= ')' kw= ';' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:654:2: kw= 'static_assert' kw= '(' this_ConstantExpression_2= ruleConstantExpression kw= ',' this_STRING_LITERAL_4= RULE_STRING_LITERAL kw= ')' kw= ';'
            {
            kw=(Token)match(input,43,FOLLOW_43_in_ruleStaticAssertDeclaration1801); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getStaticAssertDeclarationAccess().getStatic_assertKeyword_0()); 
                
            kw=(Token)match(input,44,FOLLOW_44_in_ruleStaticAssertDeclaration1814); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getStaticAssertDeclarationAccess().getLeftParenthesisKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getStaticAssertDeclarationAccess().getConstantExpressionParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleConstantExpression_in_ruleStaticAssertDeclaration1836);
            this_ConstantExpression_2=ruleConstantExpression();

            state._fsp--;


            		current.merge(this_ConstantExpression_2);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,45,FOLLOW_45_in_ruleStaticAssertDeclaration1854); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getStaticAssertDeclarationAccess().getCommaKeyword_3()); 
                
            this_STRING_LITERAL_4=(Token)match(input,RULE_STRING_LITERAL,FOLLOW_RULE_STRING_LITERAL_in_ruleStaticAssertDeclaration1869); 

            		current.merge(this_STRING_LITERAL_4);
                
             
                newLeafNode(this_STRING_LITERAL_4, grammarAccess.getStaticAssertDeclarationAccess().getSTRING_LITERALTerminalRuleCall_4()); 
                
            kw=(Token)match(input,46,FOLLOW_46_in_ruleStaticAssertDeclaration1887); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getStaticAssertDeclarationAccess().getRightParenthesisKeyword_5()); 
                
            kw=(Token)match(input,40,FOLLOW_40_in_ruleStaticAssertDeclaration1900); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getStaticAssertDeclarationAccess().getSemicolonKeyword_6()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStaticAssertDeclaration"


    // $ANTLR start "entryRuleDeclarationSpecifier"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:709:1: entryRuleDeclarationSpecifier returns [String current=null] : iv_ruleDeclarationSpecifier= ruleDeclarationSpecifier EOF ;
    public final String entryRuleDeclarationSpecifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDeclarationSpecifier = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:710:2: (iv_ruleDeclarationSpecifier= ruleDeclarationSpecifier EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:711:2: iv_ruleDeclarationSpecifier= ruleDeclarationSpecifier EOF
            {
             newCompositeNode(grammarAccess.getDeclarationSpecifierRule()); 
            pushFollow(FOLLOW_ruleDeclarationSpecifier_in_entryRuleDeclarationSpecifier1941);
            iv_ruleDeclarationSpecifier=ruleDeclarationSpecifier();

            state._fsp--;

             current =iv_ruleDeclarationSpecifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclarationSpecifier1952); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclarationSpecifier"


    // $ANTLR start "ruleDeclarationSpecifier"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:718:1: ruleDeclarationSpecifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_StorageClassSpecifier_0= ruleStorageClassSpecifier | this_TypeSpecifier_1= ruleTypeSpecifier | this_FunctionSpecifier_2= ruleFunctionSpecifier | kw= 'friend' | kw= 'typedef' | kw= 'constexpr' ) ;
    public final AntlrDatatypeRuleToken ruleDeclarationSpecifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_StorageClassSpecifier_0 = null;

        AntlrDatatypeRuleToken this_TypeSpecifier_1 = null;

        AntlrDatatypeRuleToken this_FunctionSpecifier_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:721:28: ( (this_StorageClassSpecifier_0= ruleStorageClassSpecifier | this_TypeSpecifier_1= ruleTypeSpecifier | this_FunctionSpecifier_2= ruleFunctionSpecifier | kw= 'friend' | kw= 'typedef' | kw= 'constexpr' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:722:1: (this_StorageClassSpecifier_0= ruleStorageClassSpecifier | this_TypeSpecifier_1= ruleTypeSpecifier | this_FunctionSpecifier_2= ruleFunctionSpecifier | kw= 'friend' | kw= 'typedef' | kw= 'constexpr' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:722:1: (this_StorageClassSpecifier_0= ruleStorageClassSpecifier | this_TypeSpecifier_1= ruleTypeSpecifier | this_FunctionSpecifier_2= ruleFunctionSpecifier | kw= 'friend' | kw= 'typedef' | kw= 'constexpr' )
            int alt11=6;
            switch ( input.LA(1) ) {
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
                {
                alt11=1;
                }
                break;
            case RULE_ID:
            case 58:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 77:
            case 78:
            case 79:
            case 82:
            case 90:
            case 142:
            case 145:
                {
                alt11=2;
                }
                break;
            case 55:
            case 56:
            case 57:
                {
                alt11=3;
                }
                break;
            case 47:
                {
                alt11=4;
                }
                break;
            case 48:
                {
                alt11=5;
                }
                break;
            case 49:
                {
                alt11=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:723:5: this_StorageClassSpecifier_0= ruleStorageClassSpecifier
                    {
                     
                            newCompositeNode(grammarAccess.getDeclarationSpecifierAccess().getStorageClassSpecifierParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStorageClassSpecifier_in_ruleDeclarationSpecifier1999);
                    this_StorageClassSpecifier_0=ruleStorageClassSpecifier();

                    state._fsp--;


                    		current.merge(this_StorageClassSpecifier_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:735:5: this_TypeSpecifier_1= ruleTypeSpecifier
                    {
                     
                            newCompositeNode(grammarAccess.getDeclarationSpecifierAccess().getTypeSpecifierParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleTypeSpecifier_in_ruleDeclarationSpecifier2032);
                    this_TypeSpecifier_1=ruleTypeSpecifier();

                    state._fsp--;


                    		current.merge(this_TypeSpecifier_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:747:5: this_FunctionSpecifier_2= ruleFunctionSpecifier
                    {
                     
                            newCompositeNode(grammarAccess.getDeclarationSpecifierAccess().getFunctionSpecifierParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleFunctionSpecifier_in_ruleDeclarationSpecifier2065);
                    this_FunctionSpecifier_2=ruleFunctionSpecifier();

                    state._fsp--;


                    		current.merge(this_FunctionSpecifier_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:759:2: kw= 'friend'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleDeclarationSpecifier2089); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDeclarationSpecifierAccess().getFriendKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:766:2: kw= 'typedef'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleDeclarationSpecifier2108); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDeclarationSpecifierAccess().getTypedefKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:773:2: kw= 'constexpr'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleDeclarationSpecifier2127); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDeclarationSpecifierAccess().getConstexprKeyword_5()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclarationSpecifier"


    // $ANTLR start "entryRuleStorageClassSpecifier"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:786:1: entryRuleStorageClassSpecifier returns [String current=null] : iv_ruleStorageClassSpecifier= ruleStorageClassSpecifier EOF ;
    public final String entryRuleStorageClassSpecifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStorageClassSpecifier = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:787:2: (iv_ruleStorageClassSpecifier= ruleStorageClassSpecifier EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:788:2: iv_ruleStorageClassSpecifier= ruleStorageClassSpecifier EOF
            {
             newCompositeNode(grammarAccess.getStorageClassSpecifierRule()); 
            pushFollow(FOLLOW_ruleStorageClassSpecifier_in_entryRuleStorageClassSpecifier2168);
            iv_ruleStorageClassSpecifier=ruleStorageClassSpecifier();

            state._fsp--;

             current =iv_ruleStorageClassSpecifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStorageClassSpecifier2179); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStorageClassSpecifier"


    // $ANTLR start "ruleStorageClassSpecifier"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:795:1: ruleStorageClassSpecifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'register' | kw= 'static' | kw= 'thread_local' | kw= 'extern' | kw= 'mutable' ) ;
    public final AntlrDatatypeRuleToken ruleStorageClassSpecifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:798:28: ( (kw= 'register' | kw= 'static' | kw= 'thread_local' | kw= 'extern' | kw= 'mutable' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:799:1: (kw= 'register' | kw= 'static' | kw= 'thread_local' | kw= 'extern' | kw= 'mutable' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:799:1: (kw= 'register' | kw= 'static' | kw= 'thread_local' | kw= 'extern' | kw= 'mutable' )
            int alt12=5;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt12=1;
                }
                break;
            case 51:
                {
                alt12=2;
                }
                break;
            case 52:
                {
                alt12=3;
                }
                break;
            case 53:
                {
                alt12=4;
                }
                break;
            case 54:
                {
                alt12=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:800:2: kw= 'register'
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleStorageClassSpecifier2217); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStorageClassSpecifierAccess().getRegisterKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:807:2: kw= 'static'
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_ruleStorageClassSpecifier2236); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStorageClassSpecifierAccess().getStaticKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:814:2: kw= 'thread_local'
                    {
                    kw=(Token)match(input,52,FOLLOW_52_in_ruleStorageClassSpecifier2255); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStorageClassSpecifierAccess().getThread_localKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:821:2: kw= 'extern'
                    {
                    kw=(Token)match(input,53,FOLLOW_53_in_ruleStorageClassSpecifier2274); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStorageClassSpecifierAccess().getExternKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:828:2: kw= 'mutable'
                    {
                    kw=(Token)match(input,54,FOLLOW_54_in_ruleStorageClassSpecifier2293); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStorageClassSpecifierAccess().getMutableKeyword_4()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStorageClassSpecifier"


    // $ANTLR start "entryRuleFunctionSpecifier"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:841:1: entryRuleFunctionSpecifier returns [String current=null] : iv_ruleFunctionSpecifier= ruleFunctionSpecifier EOF ;
    public final String entryRuleFunctionSpecifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunctionSpecifier = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:842:2: (iv_ruleFunctionSpecifier= ruleFunctionSpecifier EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:843:2: iv_ruleFunctionSpecifier= ruleFunctionSpecifier EOF
            {
             newCompositeNode(grammarAccess.getFunctionSpecifierRule()); 
            pushFollow(FOLLOW_ruleFunctionSpecifier_in_entryRuleFunctionSpecifier2334);
            iv_ruleFunctionSpecifier=ruleFunctionSpecifier();

            state._fsp--;

             current =iv_ruleFunctionSpecifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionSpecifier2345); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionSpecifier"


    // $ANTLR start "ruleFunctionSpecifier"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:850:1: ruleFunctionSpecifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'inline' | kw= 'virtual' | kw= 'explicit' ) ;
    public final AntlrDatatypeRuleToken ruleFunctionSpecifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:853:28: ( (kw= 'inline' | kw= 'virtual' | kw= 'explicit' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:854:1: (kw= 'inline' | kw= 'virtual' | kw= 'explicit' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:854:1: (kw= 'inline' | kw= 'virtual' | kw= 'explicit' )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt13=1;
                }
                break;
            case 56:
                {
                alt13=2;
                }
                break;
            case 57:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:855:2: kw= 'inline'
                    {
                    kw=(Token)match(input,55,FOLLOW_55_in_ruleFunctionSpecifier2383); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionSpecifierAccess().getInlineKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:862:2: kw= 'virtual'
                    {
                    kw=(Token)match(input,56,FOLLOW_56_in_ruleFunctionSpecifier2402); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionSpecifierAccess().getVirtualKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:869:2: kw= 'explicit'
                    {
                    kw=(Token)match(input,57,FOLLOW_57_in_ruleFunctionSpecifier2421); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionSpecifierAccess().getExplicitKeyword_2()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionSpecifier"


    // $ANTLR start "entryRuleTypeSpecifier"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:882:1: entryRuleTypeSpecifier returns [String current=null] : iv_ruleTypeSpecifier= ruleTypeSpecifier EOF ;
    public final String entryRuleTypeSpecifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeSpecifier = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:883:2: (iv_ruleTypeSpecifier= ruleTypeSpecifier EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:884:2: iv_ruleTypeSpecifier= ruleTypeSpecifier EOF
            {
             newCompositeNode(grammarAccess.getTypeSpecifierRule()); 
            pushFollow(FOLLOW_ruleTypeSpecifier_in_entryRuleTypeSpecifier2462);
            iv_ruleTypeSpecifier=ruleTypeSpecifier();

            state._fsp--;

             current =iv_ruleTypeSpecifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeSpecifier2473); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeSpecifier"


    // $ANTLR start "ruleTypeSpecifier"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:891:1: ruleTypeSpecifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TrailingTypeSpecifier_0= ruleTrailingTypeSpecifier | this_ClassSpecifier_1= ruleClassSpecifier | this_EnumSpecifier_2= ruleEnumSpecifier ) ;
    public final AntlrDatatypeRuleToken ruleTypeSpecifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_TrailingTypeSpecifier_0 = null;

        AntlrDatatypeRuleToken this_ClassSpecifier_1 = null;

        AntlrDatatypeRuleToken this_EnumSpecifier_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:894:28: ( (this_TrailingTypeSpecifier_0= ruleTrailingTypeSpecifier | this_ClassSpecifier_1= ruleClassSpecifier | this_EnumSpecifier_2= ruleEnumSpecifier ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:895:1: (this_TrailingTypeSpecifier_0= ruleTrailingTypeSpecifier | this_ClassSpecifier_1= ruleClassSpecifier | this_EnumSpecifier_2= ruleEnumSpecifier )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:895:1: (this_TrailingTypeSpecifier_0= ruleTrailingTypeSpecifier | this_ClassSpecifier_1= ruleClassSpecifier | this_EnumSpecifier_2= ruleEnumSpecifier )
            int alt14=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 58:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 82:
            case 142:
            case 145:
                {
                alt14=1;
                }
                break;
            case 78:
            case 79:
            case 90:
                {
                alt14=2;
                }
                break;
            case 77:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:896:5: this_TrailingTypeSpecifier_0= ruleTrailingTypeSpecifier
                    {
                     
                            newCompositeNode(grammarAccess.getTypeSpecifierAccess().getTrailingTypeSpecifierParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleTrailingTypeSpecifier_in_ruleTypeSpecifier2520);
                    this_TrailingTypeSpecifier_0=ruleTrailingTypeSpecifier();

                    state._fsp--;


                    		current.merge(this_TrailingTypeSpecifier_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:908:5: this_ClassSpecifier_1= ruleClassSpecifier
                    {
                     
                            newCompositeNode(grammarAccess.getTypeSpecifierAccess().getClassSpecifierParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleClassSpecifier_in_ruleTypeSpecifier2553);
                    this_ClassSpecifier_1=ruleClassSpecifier();

                    state._fsp--;


                    		current.merge(this_ClassSpecifier_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:920:5: this_EnumSpecifier_2= ruleEnumSpecifier
                    {
                     
                            newCompositeNode(grammarAccess.getTypeSpecifierAccess().getEnumSpecifierParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleEnumSpecifier_in_ruleTypeSpecifier2586);
                    this_EnumSpecifier_2=ruleEnumSpecifier();

                    state._fsp--;


                    		current.merge(this_EnumSpecifier_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeSpecifier"


    // $ANTLR start "entryRuleTrailingTypeSpecifier"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:938:1: entryRuleTrailingTypeSpecifier returns [String current=null] : iv_ruleTrailingTypeSpecifier= ruleTrailingTypeSpecifier EOF ;
    public final String entryRuleTrailingTypeSpecifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTrailingTypeSpecifier = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:939:2: (iv_ruleTrailingTypeSpecifier= ruleTrailingTypeSpecifier EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:940:2: iv_ruleTrailingTypeSpecifier= ruleTrailingTypeSpecifier EOF
            {
             newCompositeNode(grammarAccess.getTrailingTypeSpecifierRule()); 
            pushFollow(FOLLOW_ruleTrailingTypeSpecifier_in_entryRuleTrailingTypeSpecifier2632);
            iv_ruleTrailingTypeSpecifier=ruleTrailingTypeSpecifier();

            state._fsp--;

             current =iv_ruleTrailingTypeSpecifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTrailingTypeSpecifier2643); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTrailingTypeSpecifier"


    // $ANTLR start "ruleTrailingTypeSpecifier"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:947:1: ruleTrailingTypeSpecifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SimpleTypeSpecifier_0= ruleSimpleTypeSpecifier | this_TypenameSpecifier_1= ruleTypenameSpecifier | this_CvQualifier_2= ruleCvQualifier ) ;
    public final AntlrDatatypeRuleToken ruleTrailingTypeSpecifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_SimpleTypeSpecifier_0 = null;

        AntlrDatatypeRuleToken this_TypenameSpecifier_1 = null;

        AntlrDatatypeRuleToken this_CvQualifier_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:950:28: ( (this_SimpleTypeSpecifier_0= ruleSimpleTypeSpecifier | this_TypenameSpecifier_1= ruleTypenameSpecifier | this_CvQualifier_2= ruleCvQualifier ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:951:1: (this_SimpleTypeSpecifier_0= ruleSimpleTypeSpecifier | this_TypenameSpecifier_1= ruleTypenameSpecifier | this_CvQualifier_2= ruleCvQualifier )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:951:1: (this_SimpleTypeSpecifier_0= ruleSimpleTypeSpecifier | this_TypenameSpecifier_1= ruleTypenameSpecifier | this_CvQualifier_2= ruleCvQualifier )
            int alt15=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 58:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 145:
                {
                alt15=1;
                }
                break;
            case 82:
                {
                alt15=2;
                }
                break;
            case 142:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:952:5: this_SimpleTypeSpecifier_0= ruleSimpleTypeSpecifier
                    {
                     
                            newCompositeNode(grammarAccess.getTrailingTypeSpecifierAccess().getSimpleTypeSpecifierParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSimpleTypeSpecifier_in_ruleTrailingTypeSpecifier2690);
                    this_SimpleTypeSpecifier_0=ruleSimpleTypeSpecifier();

                    state._fsp--;


                    		current.merge(this_SimpleTypeSpecifier_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:964:5: this_TypenameSpecifier_1= ruleTypenameSpecifier
                    {
                     
                            newCompositeNode(grammarAccess.getTrailingTypeSpecifierAccess().getTypenameSpecifierParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleTypenameSpecifier_in_ruleTrailingTypeSpecifier2723);
                    this_TypenameSpecifier_1=ruleTypenameSpecifier();

                    state._fsp--;


                    		current.merge(this_TypenameSpecifier_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:976:5: this_CvQualifier_2= ruleCvQualifier
                    {
                     
                            newCompositeNode(grammarAccess.getTrailingTypeSpecifierAccess().getCvQualifierParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleCvQualifier_in_ruleTrailingTypeSpecifier2756);
                    this_CvQualifier_2=ruleCvQualifier();

                    state._fsp--;


                    		current.merge(this_CvQualifier_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTrailingTypeSpecifier"


    // $ANTLR start "entryRuleSimpleTypeSpecifier"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:994:1: entryRuleSimpleTypeSpecifier returns [String current=null] : iv_ruleSimpleTypeSpecifier= ruleSimpleTypeSpecifier EOF ;
    public final String entryRuleSimpleTypeSpecifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSimpleTypeSpecifier = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:995:2: (iv_ruleSimpleTypeSpecifier= ruleSimpleTypeSpecifier EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:996:2: iv_ruleSimpleTypeSpecifier= ruleSimpleTypeSpecifier EOF
            {
             newCompositeNode(grammarAccess.getSimpleTypeSpecifierRule()); 
            pushFollow(FOLLOW_ruleSimpleTypeSpecifier_in_entryRuleSimpleTypeSpecifier2802);
            iv_ruleSimpleTypeSpecifier=ruleSimpleTypeSpecifier();

            state._fsp--;

             current =iv_ruleSimpleTypeSpecifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleTypeSpecifier2813); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleTypeSpecifier"


    // $ANTLR start "ruleSimpleTypeSpecifier"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1003:1: ruleSimpleTypeSpecifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= '::' )? (this_TypeName_1= ruleTypeName | (this_NestedNameSpecifier_2= ruleNestedNameSpecifier (this_TypeName_3= ruleTypeName | (kw= 'template' this_SimpleTemplateId_5= ruleSimpleTemplateId ) ) ) ) ) | kw= 'char' | kw= 'char16_t' | kw= 'char32_t' | kw= 'wchar_t' | kw= 'bool' | kw= 'short' | kw= 'int' | kw= 'long' | kw= 'signed' | kw= 'unsigned' | kw= 'float' | kw= 'double' | kw= 'void' | kw= 'auto' | this_DeclarationTypeSpecifier_20= ruleDeclarationTypeSpecifier ) ;
    public final AntlrDatatypeRuleToken ruleSimpleTypeSpecifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_TypeName_1 = null;

        AntlrDatatypeRuleToken this_NestedNameSpecifier_2 = null;

        AntlrDatatypeRuleToken this_TypeName_3 = null;

        AntlrDatatypeRuleToken this_SimpleTemplateId_5 = null;

        AntlrDatatypeRuleToken this_DeclarationTypeSpecifier_20 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1006:28: ( ( ( (kw= '::' )? (this_TypeName_1= ruleTypeName | (this_NestedNameSpecifier_2= ruleNestedNameSpecifier (this_TypeName_3= ruleTypeName | (kw= 'template' this_SimpleTemplateId_5= ruleSimpleTemplateId ) ) ) ) ) | kw= 'char' | kw= 'char16_t' | kw= 'char32_t' | kw= 'wchar_t' | kw= 'bool' | kw= 'short' | kw= 'int' | kw= 'long' | kw= 'signed' | kw= 'unsigned' | kw= 'float' | kw= 'double' | kw= 'void' | kw= 'auto' | this_DeclarationTypeSpecifier_20= ruleDeclarationTypeSpecifier ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1007:1: ( ( (kw= '::' )? (this_TypeName_1= ruleTypeName | (this_NestedNameSpecifier_2= ruleNestedNameSpecifier (this_TypeName_3= ruleTypeName | (kw= 'template' this_SimpleTemplateId_5= ruleSimpleTemplateId ) ) ) ) ) | kw= 'char' | kw= 'char16_t' | kw= 'char32_t' | kw= 'wchar_t' | kw= 'bool' | kw= 'short' | kw= 'int' | kw= 'long' | kw= 'signed' | kw= 'unsigned' | kw= 'float' | kw= 'double' | kw= 'void' | kw= 'auto' | this_DeclarationTypeSpecifier_20= ruleDeclarationTypeSpecifier )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1007:1: ( ( (kw= '::' )? (this_TypeName_1= ruleTypeName | (this_NestedNameSpecifier_2= ruleNestedNameSpecifier (this_TypeName_3= ruleTypeName | (kw= 'template' this_SimpleTemplateId_5= ruleSimpleTemplateId ) ) ) ) ) | kw= 'char' | kw= 'char16_t' | kw= 'char32_t' | kw= 'wchar_t' | kw= 'bool' | kw= 'short' | kw= 'int' | kw= 'long' | kw= 'signed' | kw= 'unsigned' | kw= 'float' | kw= 'double' | kw= 'void' | kw= 'auto' | this_DeclarationTypeSpecifier_20= ruleDeclarationTypeSpecifier )
            int alt19=16;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 58:
            case 145:
                {
                alt19=1;
                }
                break;
            case 60:
                {
                alt19=2;
                }
                break;
            case 61:
                {
                alt19=3;
                }
                break;
            case 62:
                {
                alt19=4;
                }
                break;
            case 63:
                {
                alt19=5;
                }
                break;
            case 64:
                {
                alt19=6;
                }
                break;
            case 65:
                {
                alt19=7;
                }
                break;
            case 66:
                {
                alt19=8;
                }
                break;
            case 67:
                {
                alt19=9;
                }
                break;
            case 68:
                {
                alt19=10;
                }
                break;
            case 69:
                {
                alt19=11;
                }
                break;
            case 70:
                {
                alt19=12;
                }
                break;
            case 71:
                {
                alt19=13;
                }
                break;
            case 72:
                {
                alt19=14;
                }
                break;
            case 73:
                {
                alt19=15;
                }
                break;
            case 74:
                {
                alt19=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1007:2: ( (kw= '::' )? (this_TypeName_1= ruleTypeName | (this_NestedNameSpecifier_2= ruleNestedNameSpecifier (this_TypeName_3= ruleTypeName | (kw= 'template' this_SimpleTemplateId_5= ruleSimpleTemplateId ) ) ) ) )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1007:2: ( (kw= '::' )? (this_TypeName_1= ruleTypeName | (this_NestedNameSpecifier_2= ruleNestedNameSpecifier (this_TypeName_3= ruleTypeName | (kw= 'template' this_SimpleTemplateId_5= ruleSimpleTemplateId ) ) ) ) )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1007:3: (kw= '::' )? (this_TypeName_1= ruleTypeName | (this_NestedNameSpecifier_2= ruleNestedNameSpecifier (this_TypeName_3= ruleTypeName | (kw= 'template' this_SimpleTemplateId_5= ruleSimpleTemplateId ) ) ) )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1007:3: (kw= '::' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==58) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1008:2: kw= '::'
                            {
                            kw=(Token)match(input,58,FOLLOW_58_in_ruleSimpleTypeSpecifier2853); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getSimpleTypeSpecifierAccess().getColonColonKeyword_0_0()); 
                                

                            }
                            break;

                    }

                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1013:3: (this_TypeName_1= ruleTypeName | (this_NestedNameSpecifier_2= ruleNestedNameSpecifier (this_TypeName_3= ruleTypeName | (kw= 'template' this_SimpleTemplateId_5= ruleSimpleTemplateId ) ) ) )
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==RULE_ID) ) {
                        alt18=1;
                    }
                    else if ( (LA18_0==145) ) {
                        alt18=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 0, input);

                        throw nvae;
                    }
                    switch (alt18) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1014:5: this_TypeName_1= ruleTypeName
                            {
                             
                                    newCompositeNode(grammarAccess.getSimpleTypeSpecifierAccess().getTypeNameParserRuleCall_0_1_0()); 
                                
                            pushFollow(FOLLOW_ruleTypeName_in_ruleSimpleTypeSpecifier2878);
                            this_TypeName_1=ruleTypeName();

                            state._fsp--;


                            		current.merge(this_TypeName_1);
                                
                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;
                        case 2 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1025:6: (this_NestedNameSpecifier_2= ruleNestedNameSpecifier (this_TypeName_3= ruleTypeName | (kw= 'template' this_SimpleTemplateId_5= ruleSimpleTemplateId ) ) )
                            {
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1025:6: (this_NestedNameSpecifier_2= ruleNestedNameSpecifier (this_TypeName_3= ruleTypeName | (kw= 'template' this_SimpleTemplateId_5= ruleSimpleTemplateId ) ) )
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1026:5: this_NestedNameSpecifier_2= ruleNestedNameSpecifier (this_TypeName_3= ruleTypeName | (kw= 'template' this_SimpleTemplateId_5= ruleSimpleTemplateId ) )
                            {
                             
                                    newCompositeNode(grammarAccess.getSimpleTypeSpecifierAccess().getNestedNameSpecifierParserRuleCall_0_1_1_0()); 
                                
                            pushFollow(FOLLOW_ruleNestedNameSpecifier_in_ruleSimpleTypeSpecifier2912);
                            this_NestedNameSpecifier_2=ruleNestedNameSpecifier();

                            state._fsp--;


                            		current.merge(this_NestedNameSpecifier_2);
                                
                             
                                    afterParserOrEnumRuleCall();
                                
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1036:1: (this_TypeName_3= ruleTypeName | (kw= 'template' this_SimpleTemplateId_5= ruleSimpleTemplateId ) )
                            int alt17=2;
                            int LA17_0 = input.LA(1);

                            if ( (LA17_0==RULE_ID) ) {
                                alt17=1;
                            }
                            else if ( (LA17_0==59) ) {
                                alt17=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 17, 0, input);

                                throw nvae;
                            }
                            switch (alt17) {
                                case 1 :
                                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1037:5: this_TypeName_3= ruleTypeName
                                    {
                                     
                                            newCompositeNode(grammarAccess.getSimpleTypeSpecifierAccess().getTypeNameParserRuleCall_0_1_1_1_0()); 
                                        
                                    pushFollow(FOLLOW_ruleTypeName_in_ruleSimpleTypeSpecifier2940);
                                    this_TypeName_3=ruleTypeName();

                                    state._fsp--;


                                    		current.merge(this_TypeName_3);
                                        
                                     
                                            afterParserOrEnumRuleCall();
                                        

                                    }
                                    break;
                                case 2 :
                                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1048:6: (kw= 'template' this_SimpleTemplateId_5= ruleSimpleTemplateId )
                                    {
                                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1048:6: (kw= 'template' this_SimpleTemplateId_5= ruleSimpleTemplateId )
                                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1049:2: kw= 'template' this_SimpleTemplateId_5= ruleSimpleTemplateId
                                    {
                                    kw=(Token)match(input,59,FOLLOW_59_in_ruleSimpleTypeSpecifier2965); 

                                            current.merge(kw);
                                            newLeafNode(kw, grammarAccess.getSimpleTypeSpecifierAccess().getTemplateKeyword_0_1_1_1_1_0()); 
                                        
                                     
                                            newCompositeNode(grammarAccess.getSimpleTypeSpecifierAccess().getSimpleTemplateIdParserRuleCall_0_1_1_1_1_1()); 
                                        
                                    pushFollow(FOLLOW_ruleSimpleTemplateId_in_ruleSimpleTypeSpecifier2987);
                                    this_SimpleTemplateId_5=ruleSimpleTemplateId();

                                    state._fsp--;


                                    		current.merge(this_SimpleTemplateId_5);
                                        
                                     
                                            afterParserOrEnumRuleCall();
                                        

                                    }


                                    }
                                    break;

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1067:2: kw= 'char'
                    {
                    kw=(Token)match(input,60,FOLLOW_60_in_ruleSimpleTypeSpecifier3016); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSimpleTypeSpecifierAccess().getCharKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1074:2: kw= 'char16_t'
                    {
                    kw=(Token)match(input,61,FOLLOW_61_in_ruleSimpleTypeSpecifier3035); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSimpleTypeSpecifierAccess().getChar16_tKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1081:2: kw= 'char32_t'
                    {
                    kw=(Token)match(input,62,FOLLOW_62_in_ruleSimpleTypeSpecifier3054); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSimpleTypeSpecifierAccess().getChar32_tKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1088:2: kw= 'wchar_t'
                    {
                    kw=(Token)match(input,63,FOLLOW_63_in_ruleSimpleTypeSpecifier3073); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSimpleTypeSpecifierAccess().getWchar_tKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1095:2: kw= 'bool'
                    {
                    kw=(Token)match(input,64,FOLLOW_64_in_ruleSimpleTypeSpecifier3092); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSimpleTypeSpecifierAccess().getBoolKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1102:2: kw= 'short'
                    {
                    kw=(Token)match(input,65,FOLLOW_65_in_ruleSimpleTypeSpecifier3111); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSimpleTypeSpecifierAccess().getShortKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1109:2: kw= 'int'
                    {
                    kw=(Token)match(input,66,FOLLOW_66_in_ruleSimpleTypeSpecifier3130); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSimpleTypeSpecifierAccess().getIntKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1116:2: kw= 'long'
                    {
                    kw=(Token)match(input,67,FOLLOW_67_in_ruleSimpleTypeSpecifier3149); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSimpleTypeSpecifierAccess().getLongKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1123:2: kw= 'signed'
                    {
                    kw=(Token)match(input,68,FOLLOW_68_in_ruleSimpleTypeSpecifier3168); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSimpleTypeSpecifierAccess().getSignedKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1130:2: kw= 'unsigned'
                    {
                    kw=(Token)match(input,69,FOLLOW_69_in_ruleSimpleTypeSpecifier3187); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSimpleTypeSpecifierAccess().getUnsignedKeyword_10()); 
                        

                    }
                    break;
                case 12 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1137:2: kw= 'float'
                    {
                    kw=(Token)match(input,70,FOLLOW_70_in_ruleSimpleTypeSpecifier3206); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSimpleTypeSpecifierAccess().getFloatKeyword_11()); 
                        

                    }
                    break;
                case 13 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1144:2: kw= 'double'
                    {
                    kw=(Token)match(input,71,FOLLOW_71_in_ruleSimpleTypeSpecifier3225); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSimpleTypeSpecifierAccess().getDoubleKeyword_12()); 
                        

                    }
                    break;
                case 14 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1151:2: kw= 'void'
                    {
                    kw=(Token)match(input,72,FOLLOW_72_in_ruleSimpleTypeSpecifier3244); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSimpleTypeSpecifierAccess().getVoidKeyword_13()); 
                        

                    }
                    break;
                case 15 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1158:2: kw= 'auto'
                    {
                    kw=(Token)match(input,73,FOLLOW_73_in_ruleSimpleTypeSpecifier3263); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSimpleTypeSpecifierAccess().getAutoKeyword_14()); 
                        

                    }
                    break;
                case 16 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1165:5: this_DeclarationTypeSpecifier_20= ruleDeclarationTypeSpecifier
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleTypeSpecifierAccess().getDeclarationTypeSpecifierParserRuleCall_15()); 
                        
                    pushFollow(FOLLOW_ruleDeclarationTypeSpecifier_in_ruleSimpleTypeSpecifier3291);
                    this_DeclarationTypeSpecifier_20=ruleDeclarationTypeSpecifier();

                    state._fsp--;


                    		current.merge(this_DeclarationTypeSpecifier_20);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleTypeSpecifier"


    // $ANTLR start "entryRuleTypeName"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1183:1: entryRuleTypeName returns [String current=null] : iv_ruleTypeName= ruleTypeName EOF ;
    public final String entryRuleTypeName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeName = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1184:2: (iv_ruleTypeName= ruleTypeName EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1185:2: iv_ruleTypeName= ruleTypeName EOF
            {
             newCompositeNode(grammarAccess.getTypeNameRule()); 
            pushFollow(FOLLOW_ruleTypeName_in_entryRuleTypeName3337);
            iv_ruleTypeName=ruleTypeName();

            state._fsp--;

             current =iv_ruleTypeName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeName3348); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeName"


    // $ANTLR start "ruleTypeName"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1192:1: ruleTypeName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SimpleTemplateId_0= ruleSimpleTemplateId | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleTypeName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_1=null;
        AntlrDatatypeRuleToken this_SimpleTemplateId_0 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1195:28: ( (this_SimpleTemplateId_0= ruleSimpleTemplateId | this_ID_1= RULE_ID ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1196:1: (this_SimpleTemplateId_0= ruleSimpleTemplateId | this_ID_1= RULE_ID )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1196:1: (this_SimpleTemplateId_0= ruleSimpleTemplateId | this_ID_1= RULE_ID )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==EOF||LA20_1==RULE_ID||LA20_1==40||(LA20_1>=45 && LA20_1<=58)||(LA20_1>=60 && LA20_1<=75)||(LA20_1>=77 && LA20_1<=80)||LA20_1==82||(LA20_1>=88 && LA20_1<=90)||LA20_1==99||(LA20_1>=142 && LA20_1<=145)) ) {
                    alt20=2;
                }
                else if ( (LA20_1==98) ) {
                    alt20=1;
                }
                else {
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
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1197:5: this_SimpleTemplateId_0= ruleSimpleTemplateId
                    {
                     
                            newCompositeNode(grammarAccess.getTypeNameAccess().getSimpleTemplateIdParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSimpleTemplateId_in_ruleTypeName3395);
                    this_SimpleTemplateId_0=ruleSimpleTemplateId();

                    state._fsp--;


                    		current.merge(this_SimpleTemplateId_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1208:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeName3421); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getTypeNameAccess().getIDTerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeName"


    // $ANTLR start "entryRuleDeclarationTypeSpecifier"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1223:1: entryRuleDeclarationTypeSpecifier returns [String current=null] : iv_ruleDeclarationTypeSpecifier= ruleDeclarationTypeSpecifier EOF ;
    public final String entryRuleDeclarationTypeSpecifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDeclarationTypeSpecifier = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1224:2: (iv_ruleDeclarationTypeSpecifier= ruleDeclarationTypeSpecifier EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1225:2: iv_ruleDeclarationTypeSpecifier= ruleDeclarationTypeSpecifier EOF
            {
             newCompositeNode(grammarAccess.getDeclarationTypeSpecifierRule()); 
            pushFollow(FOLLOW_ruleDeclarationTypeSpecifier_in_entryRuleDeclarationTypeSpecifier3467);
            iv_ruleDeclarationTypeSpecifier=ruleDeclarationTypeSpecifier();

            state._fsp--;

             current =iv_ruleDeclarationTypeSpecifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclarationTypeSpecifier3478); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclarationTypeSpecifier"


    // $ANTLR start "ruleDeclarationTypeSpecifier"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1232:1: ruleDeclarationTypeSpecifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'decltype' kw= '(' this_Expression_2= ruleExpression kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleDeclarationTypeSpecifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Expression_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1235:28: ( (kw= 'decltype' kw= '(' this_Expression_2= ruleExpression kw= ')' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1236:1: (kw= 'decltype' kw= '(' this_Expression_2= ruleExpression kw= ')' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1236:1: (kw= 'decltype' kw= '(' this_Expression_2= ruleExpression kw= ')' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1237:2: kw= 'decltype' kw= '(' this_Expression_2= ruleExpression kw= ')'
            {
            kw=(Token)match(input,74,FOLLOW_74_in_ruleDeclarationTypeSpecifier3516); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDeclarationTypeSpecifierAccess().getDecltypeKeyword_0()); 
                
            kw=(Token)match(input,44,FOLLOW_44_in_ruleDeclarationTypeSpecifier3529); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDeclarationTypeSpecifierAccess().getLeftParenthesisKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getDeclarationTypeSpecifierAccess().getExpressionParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleExpression_in_ruleDeclarationTypeSpecifier3551);
            this_Expression_2=ruleExpression();

            state._fsp--;


            		current.merge(this_Expression_2);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,46,FOLLOW_46_in_ruleDeclarationTypeSpecifier3569); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDeclarationTypeSpecifierAccess().getRightParenthesisKeyword_3()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclarationTypeSpecifier"


    // $ANTLR start "entryRuleEnumSpecifier"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1275:1: entryRuleEnumSpecifier returns [String current=null] : iv_ruleEnumSpecifier= ruleEnumSpecifier EOF ;
    public final String entryRuleEnumSpecifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEnumSpecifier = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1276:2: (iv_ruleEnumSpecifier= ruleEnumSpecifier EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1277:2: iv_ruleEnumSpecifier= ruleEnumSpecifier EOF
            {
             newCompositeNode(grammarAccess.getEnumSpecifierRule()); 
            pushFollow(FOLLOW_ruleEnumSpecifier_in_entryRuleEnumSpecifier3612);
            iv_ruleEnumSpecifier=ruleEnumSpecifier();

            state._fsp--;

             current =iv_ruleEnumSpecifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumSpecifier3623); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumSpecifier"


    // $ANTLR start "ruleEnumSpecifier"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1284:1: ruleEnumSpecifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EnumHead_0= ruleEnumHead kw= '{' (this_EnumeratorList_2= ruleEnumeratorList (kw= ',' )? )? kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleEnumSpecifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_EnumHead_0 = null;

        AntlrDatatypeRuleToken this_EnumeratorList_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1287:28: ( (this_EnumHead_0= ruleEnumHead kw= '{' (this_EnumeratorList_2= ruleEnumeratorList (kw= ',' )? )? kw= '}' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1288:1: (this_EnumHead_0= ruleEnumHead kw= '{' (this_EnumeratorList_2= ruleEnumeratorList (kw= ',' )? )? kw= '}' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1288:1: (this_EnumHead_0= ruleEnumHead kw= '{' (this_EnumeratorList_2= ruleEnumeratorList (kw= ',' )? )? kw= '}' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1289:5: this_EnumHead_0= ruleEnumHead kw= '{' (this_EnumeratorList_2= ruleEnumeratorList (kw= ',' )? )? kw= '}'
            {
             
                    newCompositeNode(grammarAccess.getEnumSpecifierAccess().getEnumHeadParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleEnumHead_in_ruleEnumSpecifier3670);
            this_EnumHead_0=ruleEnumHead();

            state._fsp--;


            		current.merge(this_EnumHead_0);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,75,FOLLOW_75_in_ruleEnumSpecifier3688); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEnumSpecifierAccess().getLeftCurlyBracketKeyword_1()); 
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1305:1: (this_EnumeratorList_2= ruleEnumeratorList (kw= ',' )? )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1306:5: this_EnumeratorList_2= ruleEnumeratorList (kw= ',' )?
                    {
                     
                            newCompositeNode(grammarAccess.getEnumSpecifierAccess().getEnumeratorListParserRuleCall_2_0()); 
                        
                    pushFollow(FOLLOW_ruleEnumeratorList_in_ruleEnumSpecifier3711);
                    this_EnumeratorList_2=ruleEnumeratorList();

                    state._fsp--;


                    		current.merge(this_EnumeratorList_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1316:1: (kw= ',' )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==45) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1317:2: kw= ','
                            {
                            kw=(Token)match(input,45,FOLLOW_45_in_ruleEnumSpecifier3730); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEnumSpecifierAccess().getCommaKeyword_2_1()); 
                                

                            }
                            break;

                    }


                    }
                    break;

            }

            kw=(Token)match(input,76,FOLLOW_76_in_ruleEnumSpecifier3747); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEnumSpecifierAccess().getRightCurlyBracketKeyword_3()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumSpecifier"


    // $ANTLR start "entryRuleEnumHead"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1336:1: entryRuleEnumHead returns [String current=null] : iv_ruleEnumHead= ruleEnumHead EOF ;
    public final String entryRuleEnumHead() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEnumHead = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1337:2: (iv_ruleEnumHead= ruleEnumHead EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1338:2: iv_ruleEnumHead= ruleEnumHead EOF
            {
             newCompositeNode(grammarAccess.getEnumHeadRule()); 
            pushFollow(FOLLOW_ruleEnumHead_in_entryRuleEnumHead3788);
            iv_ruleEnumHead=ruleEnumHead();

            state._fsp--;

             current =iv_ruleEnumHead.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumHead3799); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumHead"


    // $ANTLR start "ruleEnumHead"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1345:1: ruleEnumHead returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EnumKey_0= ruleEnumKey ( (this_ID_1= RULE_ID )? | (this_NestedNameSpecifier_2= ruleNestedNameSpecifier this_ID_3= RULE_ID ) ) (this_EnumBase_4= ruleEnumBase )? ) ;
    public final AntlrDatatypeRuleToken ruleEnumHead() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_1=null;
        Token this_ID_3=null;
        AntlrDatatypeRuleToken this_EnumKey_0 = null;

        AntlrDatatypeRuleToken this_NestedNameSpecifier_2 = null;

        AntlrDatatypeRuleToken this_EnumBase_4 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1348:28: ( (this_EnumKey_0= ruleEnumKey ( (this_ID_1= RULE_ID )? | (this_NestedNameSpecifier_2= ruleNestedNameSpecifier this_ID_3= RULE_ID ) ) (this_EnumBase_4= ruleEnumBase )? ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1349:1: (this_EnumKey_0= ruleEnumKey ( (this_ID_1= RULE_ID )? | (this_NestedNameSpecifier_2= ruleNestedNameSpecifier this_ID_3= RULE_ID ) ) (this_EnumBase_4= ruleEnumBase )? )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1349:1: (this_EnumKey_0= ruleEnumKey ( (this_ID_1= RULE_ID )? | (this_NestedNameSpecifier_2= ruleNestedNameSpecifier this_ID_3= RULE_ID ) ) (this_EnumBase_4= ruleEnumBase )? )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1350:5: this_EnumKey_0= ruleEnumKey ( (this_ID_1= RULE_ID )? | (this_NestedNameSpecifier_2= ruleNestedNameSpecifier this_ID_3= RULE_ID ) ) (this_EnumBase_4= ruleEnumBase )?
            {
             
                    newCompositeNode(grammarAccess.getEnumHeadAccess().getEnumKeyParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleEnumKey_in_ruleEnumHead3846);
            this_EnumKey_0=ruleEnumKey();

            state._fsp--;


            		current.merge(this_EnumKey_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1360:1: ( (this_ID_1= RULE_ID )? | (this_NestedNameSpecifier_2= ruleNestedNameSpecifier this_ID_3= RULE_ID ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==EOF||LA24_0==RULE_ID||LA24_0==75||LA24_0==80) ) {
                alt24=1;
            }
            else if ( (LA24_0==145) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1360:2: (this_ID_1= RULE_ID )?
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1360:2: (this_ID_1= RULE_ID )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==RULE_ID) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1360:7: this_ID_1= RULE_ID
                            {
                            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumHead3868); 

                            		current.merge(this_ID_1);
                                
                             
                                newLeafNode(this_ID_1, grammarAccess.getEnumHeadAccess().getIDTerminalRuleCall_1_0()); 
                                

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1368:6: (this_NestedNameSpecifier_2= ruleNestedNameSpecifier this_ID_3= RULE_ID )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1368:6: (this_NestedNameSpecifier_2= ruleNestedNameSpecifier this_ID_3= RULE_ID )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1369:5: this_NestedNameSpecifier_2= ruleNestedNameSpecifier this_ID_3= RULE_ID
                    {
                     
                            newCompositeNode(grammarAccess.getEnumHeadAccess().getNestedNameSpecifierParserRuleCall_1_1_0()); 
                        
                    pushFollow(FOLLOW_ruleNestedNameSpecifier_in_ruleEnumHead3904);
                    this_NestedNameSpecifier_2=ruleNestedNameSpecifier();

                    state._fsp--;


                    		current.merge(this_NestedNameSpecifier_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumHead3924); 

                    		current.merge(this_ID_3);
                        
                     
                        newLeafNode(this_ID_3, grammarAccess.getEnumHeadAccess().getIDTerminalRuleCall_1_1_1()); 
                        

                    }


                    }
                    break;

            }

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1386:3: (this_EnumBase_4= ruleEnumBase )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==80) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1387:5: this_EnumBase_4= ruleEnumBase
                    {
                     
                            newCompositeNode(grammarAccess.getEnumHeadAccess().getEnumBaseParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleEnumBase_in_ruleEnumHead3954);
                    this_EnumBase_4=ruleEnumBase();

                    state._fsp--;


                    		current.merge(this_EnumBase_4);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumHead"


    // $ANTLR start "entryRuleEnumKey"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1405:1: entryRuleEnumKey returns [String current=null] : iv_ruleEnumKey= ruleEnumKey EOF ;
    public final String entryRuleEnumKey() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEnumKey = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1406:2: (iv_ruleEnumKey= ruleEnumKey EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1407:2: iv_ruleEnumKey= ruleEnumKey EOF
            {
             newCompositeNode(grammarAccess.getEnumKeyRule()); 
            pushFollow(FOLLOW_ruleEnumKey_in_entryRuleEnumKey4002);
            iv_ruleEnumKey=ruleEnumKey();

            state._fsp--;

             current =iv_ruleEnumKey.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumKey4013); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumKey"


    // $ANTLR start "ruleEnumKey"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1414:1: ruleEnumKey returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'enum' | (kw= 'enum' kw= 'class' ) | (kw= 'enum' kw= 'struct' ) ) ;
    public final AntlrDatatypeRuleToken ruleEnumKey() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1417:28: ( (kw= 'enum' | (kw= 'enum' kw= 'class' ) | (kw= 'enum' kw= 'struct' ) ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1418:1: (kw= 'enum' | (kw= 'enum' kw= 'class' ) | (kw= 'enum' kw= 'struct' ) )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1418:1: (kw= 'enum' | (kw= 'enum' kw= 'class' ) | (kw= 'enum' kw= 'struct' ) )
            int alt26=3;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==77) ) {
                switch ( input.LA(2) ) {
                case 78:
                    {
                    alt26=2;
                    }
                    break;
                case 79:
                    {
                    alt26=3;
                    }
                    break;
                case EOF:
                case RULE_ID:
                case 75:
                case 80:
                case 145:
                    {
                    alt26=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1419:2: kw= 'enum'
                    {
                    kw=(Token)match(input,77,FOLLOW_77_in_ruleEnumKey4051); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEnumKeyAccess().getEnumKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1425:6: (kw= 'enum' kw= 'class' )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1425:6: (kw= 'enum' kw= 'class' )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1426:2: kw= 'enum' kw= 'class'
                    {
                    kw=(Token)match(input,77,FOLLOW_77_in_ruleEnumKey4071); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEnumKeyAccess().getEnumKeyword_1_0()); 
                        
                    kw=(Token)match(input,78,FOLLOW_78_in_ruleEnumKey4084); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEnumKeyAccess().getClassKeyword_1_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1438:6: (kw= 'enum' kw= 'struct' )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1438:6: (kw= 'enum' kw= 'struct' )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1439:2: kw= 'enum' kw= 'struct'
                    {
                    kw=(Token)match(input,77,FOLLOW_77_in_ruleEnumKey4105); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEnumKeyAccess().getEnumKeyword_2_0()); 
                        
                    kw=(Token)match(input,79,FOLLOW_79_in_ruleEnumKey4118); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEnumKeyAccess().getStructKeyword_2_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumKey"


    // $ANTLR start "entryRuleEnumBase"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1458:1: entryRuleEnumBase returns [String current=null] : iv_ruleEnumBase= ruleEnumBase EOF ;
    public final String entryRuleEnumBase() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEnumBase = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1459:2: (iv_ruleEnumBase= ruleEnumBase EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1460:2: iv_ruleEnumBase= ruleEnumBase EOF
            {
             newCompositeNode(grammarAccess.getEnumBaseRule()); 
            pushFollow(FOLLOW_ruleEnumBase_in_entryRuleEnumBase4160);
            iv_ruleEnumBase=ruleEnumBase();

            state._fsp--;

             current =iv_ruleEnumBase.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumBase4171); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumBase"


    // $ANTLR start "ruleEnumBase"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1467:1: ruleEnumBase returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= ':' (this_TypeSpecifier_1= ruleTypeSpecifier )+ ) ;
    public final AntlrDatatypeRuleToken ruleEnumBase() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_TypeSpecifier_1 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1470:28: ( (kw= ':' (this_TypeSpecifier_1= ruleTypeSpecifier )+ ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1471:1: (kw= ':' (this_TypeSpecifier_1= ruleTypeSpecifier )+ )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1471:1: (kw= ':' (this_TypeSpecifier_1= ruleTypeSpecifier )+ )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1472:2: kw= ':' (this_TypeSpecifier_1= ruleTypeSpecifier )+
            {
            kw=(Token)match(input,80,FOLLOW_80_in_ruleEnumBase4209); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEnumBaseAccess().getColonKeyword_0()); 
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1477:1: (this_TypeSpecifier_1= ruleTypeSpecifier )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID||LA27_0==58||(LA27_0>=60 && LA27_0<=74)||(LA27_0>=77 && LA27_0<=79)||LA27_0==82||LA27_0==90||LA27_0==142||LA27_0==145) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1478:5: this_TypeSpecifier_1= ruleTypeSpecifier
            	    {
            	     
            	            newCompositeNode(grammarAccess.getEnumBaseAccess().getTypeSpecifierParserRuleCall_1()); 
            	        
            	    pushFollow(FOLLOW_ruleTypeSpecifier_in_ruleEnumBase4232);
            	    this_TypeSpecifier_1=ruleTypeSpecifier();

            	    state._fsp--;


            	    		current.merge(this_TypeSpecifier_1);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

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


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumBase"


    // $ANTLR start "entryRuleEnumeratorList"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1496:1: entryRuleEnumeratorList returns [String current=null] : iv_ruleEnumeratorList= ruleEnumeratorList EOF ;
    public final String entryRuleEnumeratorList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEnumeratorList = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1497:2: (iv_ruleEnumeratorList= ruleEnumeratorList EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1498:2: iv_ruleEnumeratorList= ruleEnumeratorList EOF
            {
             newCompositeNode(grammarAccess.getEnumeratorListRule()); 
            pushFollow(FOLLOW_ruleEnumeratorList_in_entryRuleEnumeratorList4280);
            iv_ruleEnumeratorList=ruleEnumeratorList();

            state._fsp--;

             current =iv_ruleEnumeratorList.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumeratorList4291); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumeratorList"


    // $ANTLR start "ruleEnumeratorList"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1505:1: ruleEnumeratorList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EnumerationDefinition_0= ruleEnumerationDefinition (kw= ',' this_EnumerationDefinition_2= ruleEnumerationDefinition )* ) ;
    public final AntlrDatatypeRuleToken ruleEnumeratorList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_EnumerationDefinition_0 = null;

        AntlrDatatypeRuleToken this_EnumerationDefinition_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1508:28: ( (this_EnumerationDefinition_0= ruleEnumerationDefinition (kw= ',' this_EnumerationDefinition_2= ruleEnumerationDefinition )* ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1509:1: (this_EnumerationDefinition_0= ruleEnumerationDefinition (kw= ',' this_EnumerationDefinition_2= ruleEnumerationDefinition )* )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1509:1: (this_EnumerationDefinition_0= ruleEnumerationDefinition (kw= ',' this_EnumerationDefinition_2= ruleEnumerationDefinition )* )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1510:5: this_EnumerationDefinition_0= ruleEnumerationDefinition (kw= ',' this_EnumerationDefinition_2= ruleEnumerationDefinition )*
            {
             
                    newCompositeNode(grammarAccess.getEnumeratorListAccess().getEnumerationDefinitionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleEnumerationDefinition_in_ruleEnumeratorList4338);
            this_EnumerationDefinition_0=ruleEnumerationDefinition();

            state._fsp--;


            		current.merge(this_EnumerationDefinition_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1520:1: (kw= ',' this_EnumerationDefinition_2= ruleEnumerationDefinition )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==45) ) {
                    int LA28_1 = input.LA(2);

                    if ( (LA28_1==RULE_ID) ) {
                        alt28=1;
                    }


                }


                switch (alt28) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1521:2: kw= ',' this_EnumerationDefinition_2= ruleEnumerationDefinition
            	    {
            	    kw=(Token)match(input,45,FOLLOW_45_in_ruleEnumeratorList4357); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getEnumeratorListAccess().getCommaKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getEnumeratorListAccess().getEnumerationDefinitionParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_ruleEnumerationDefinition_in_ruleEnumeratorList4379);
            	    this_EnumerationDefinition_2=ruleEnumerationDefinition();

            	    state._fsp--;


            	    		current.merge(this_EnumerationDefinition_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumeratorList"


    // $ANTLR start "entryRuleEnumerationDefinition"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1545:1: entryRuleEnumerationDefinition returns [String current=null] : iv_ruleEnumerationDefinition= ruleEnumerationDefinition EOF ;
    public final String entryRuleEnumerationDefinition() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEnumerationDefinition = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1546:2: (iv_ruleEnumerationDefinition= ruleEnumerationDefinition EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1547:2: iv_ruleEnumerationDefinition= ruleEnumerationDefinition EOF
            {
             newCompositeNode(grammarAccess.getEnumerationDefinitionRule()); 
            pushFollow(FOLLOW_ruleEnumerationDefinition_in_entryRuleEnumerationDefinition4427);
            iv_ruleEnumerationDefinition=ruleEnumerationDefinition();

            state._fsp--;

             current =iv_ruleEnumerationDefinition.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumerationDefinition4438); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumerationDefinition"


    // $ANTLR start "ruleEnumerationDefinition"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1554:1: ruleEnumerationDefinition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Enumerator_0= ruleEnumerator (kw= '=' this_ConstantExpression_2= ruleConstantExpression )? ) ;
    public final AntlrDatatypeRuleToken ruleEnumerationDefinition() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Enumerator_0 = null;

        AntlrDatatypeRuleToken this_ConstantExpression_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1557:28: ( (this_Enumerator_0= ruleEnumerator (kw= '=' this_ConstantExpression_2= ruleConstantExpression )? ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1558:1: (this_Enumerator_0= ruleEnumerator (kw= '=' this_ConstantExpression_2= ruleConstantExpression )? )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1558:1: (this_Enumerator_0= ruleEnumerator (kw= '=' this_ConstantExpression_2= ruleConstantExpression )? )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1559:5: this_Enumerator_0= ruleEnumerator (kw= '=' this_ConstantExpression_2= ruleConstantExpression )?
            {
             
                    newCompositeNode(grammarAccess.getEnumerationDefinitionAccess().getEnumeratorParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleEnumerator_in_ruleEnumerationDefinition4485);
            this_Enumerator_0=ruleEnumerator();

            state._fsp--;


            		current.merge(this_Enumerator_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1569:1: (kw= '=' this_ConstantExpression_2= ruleConstantExpression )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==39) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1570:2: kw= '=' this_ConstantExpression_2= ruleConstantExpression
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleEnumerationDefinition4504); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEnumerationDefinitionAccess().getEqualsSignKeyword_1_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getEnumerationDefinitionAccess().getConstantExpressionParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleConstantExpression_in_ruleEnumerationDefinition4526);
                    this_ConstantExpression_2=ruleConstantExpression();

                    state._fsp--;


                    		current.merge(this_ConstantExpression_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumerationDefinition"


    // $ANTLR start "entryRuleEnumerator"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1594:1: entryRuleEnumerator returns [String current=null] : iv_ruleEnumerator= ruleEnumerator EOF ;
    public final String entryRuleEnumerator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEnumerator = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1595:2: (iv_ruleEnumerator= ruleEnumerator EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1596:2: iv_ruleEnumerator= ruleEnumerator EOF
            {
             newCompositeNode(grammarAccess.getEnumeratorRule()); 
            pushFollow(FOLLOW_ruleEnumerator_in_entryRuleEnumerator4574);
            iv_ruleEnumerator=ruleEnumerator();

            state._fsp--;

             current =iv_ruleEnumerator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumerator4585); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumerator"


    // $ANTLR start "ruleEnumerator"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1603:1: ruleEnumerator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleEnumerator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1606:28: (this_ID_0= RULE_ID )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1607:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumerator4624); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getEnumeratorAccess().getIDTerminalRuleCall()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumerator"


    // $ANTLR start "entryRuleNamespaceDefinition"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1622:1: entryRuleNamespaceDefinition returns [String current=null] : iv_ruleNamespaceDefinition= ruleNamespaceDefinition EOF ;
    public final String entryRuleNamespaceDefinition() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNamespaceDefinition = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1623:2: (iv_ruleNamespaceDefinition= ruleNamespaceDefinition EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1624:2: iv_ruleNamespaceDefinition= ruleNamespaceDefinition EOF
            {
             newCompositeNode(grammarAccess.getNamespaceDefinitionRule()); 
            pushFollow(FOLLOW_ruleNamespaceDefinition_in_entryRuleNamespaceDefinition4669);
            iv_ruleNamespaceDefinition=ruleNamespaceDefinition();

            state._fsp--;

             current =iv_ruleNamespaceDefinition.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamespaceDefinition4680); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNamespaceDefinition"


    // $ANTLR start "ruleNamespaceDefinition"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1631:1: ruleNamespaceDefinition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'inline' )? kw= 'namespace' (this_ID_2= RULE_ID )? kw= '{' (this_Declaration_4= ruleDeclaration )* kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleNamespaceDefinition() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;
        AntlrDatatypeRuleToken this_Declaration_4 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1634:28: ( ( (kw= 'inline' )? kw= 'namespace' (this_ID_2= RULE_ID )? kw= '{' (this_Declaration_4= ruleDeclaration )* kw= '}' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1635:1: ( (kw= 'inline' )? kw= 'namespace' (this_ID_2= RULE_ID )? kw= '{' (this_Declaration_4= ruleDeclaration )* kw= '}' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1635:1: ( (kw= 'inline' )? kw= 'namespace' (this_ID_2= RULE_ID )? kw= '{' (this_Declaration_4= ruleDeclaration )* kw= '}' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1635:2: (kw= 'inline' )? kw= 'namespace' (this_ID_2= RULE_ID )? kw= '{' (this_Declaration_4= ruleDeclaration )* kw= '}'
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1635:2: (kw= 'inline' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==55) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1636:2: kw= 'inline'
                    {
                    kw=(Token)match(input,55,FOLLOW_55_in_ruleNamespaceDefinition4719); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNamespaceDefinitionAccess().getInlineKeyword_0()); 
                        

                    }
                    break;

            }

            kw=(Token)match(input,81,FOLLOW_81_in_ruleNamespaceDefinition4734); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getNamespaceDefinitionAccess().getNamespaceKeyword_1()); 
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1647:1: (this_ID_2= RULE_ID )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ID) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1647:6: this_ID_2= RULE_ID
                    {
                    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNamespaceDefinition4750); 

                    		current.merge(this_ID_2);
                        
                     
                        newLeafNode(this_ID_2, grammarAccess.getNamespaceDefinitionAccess().getIDTerminalRuleCall_2()); 
                        

                    }
                    break;

            }

            kw=(Token)match(input,75,FOLLOW_75_in_ruleNamespaceDefinition4770); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getNamespaceDefinitionAccess().getLeftCurlyBracketKeyword_3()); 
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1660:1: (this_Declaration_4= ruleDeclaration )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_ID||LA32_0==38||LA32_0==40||LA32_0==43||(LA32_0>=47 && LA32_0<=58)||(LA32_0>=59 && LA32_0<=74)||(LA32_0>=77 && LA32_0<=79)||(LA32_0>=81 && LA32_0<=83)||LA32_0==88||LA32_0==90||(LA32_0>=140 && LA32_0<=142)||(LA32_0>=144 && LA32_0<=145)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1661:5: this_Declaration_4= ruleDeclaration
            	    {
            	     
            	            newCompositeNode(grammarAccess.getNamespaceDefinitionAccess().getDeclarationParserRuleCall_4()); 
            	        
            	    pushFollow(FOLLOW_ruleDeclaration_in_ruleNamespaceDefinition4793);
            	    this_Declaration_4=ruleDeclaration();

            	    state._fsp--;


            	    		current.merge(this_Declaration_4);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            kw=(Token)match(input,76,FOLLOW_76_in_ruleNamespaceDefinition4813); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getNamespaceDefinitionAccess().getRightCurlyBracketKeyword_5()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNamespaceDefinition"


    // $ANTLR start "entryRuleNamespaceAliasDefinition"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1685:1: entryRuleNamespaceAliasDefinition returns [String current=null] : iv_ruleNamespaceAliasDefinition= ruleNamespaceAliasDefinition EOF ;
    public final String entryRuleNamespaceAliasDefinition() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNamespaceAliasDefinition = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1686:2: (iv_ruleNamespaceAliasDefinition= ruleNamespaceAliasDefinition EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1687:2: iv_ruleNamespaceAliasDefinition= ruleNamespaceAliasDefinition EOF
            {
             newCompositeNode(grammarAccess.getNamespaceAliasDefinitionRule()); 
            pushFollow(FOLLOW_ruleNamespaceAliasDefinition_in_entryRuleNamespaceAliasDefinition4854);
            iv_ruleNamespaceAliasDefinition=ruleNamespaceAliasDefinition();

            state._fsp--;

             current =iv_ruleNamespaceAliasDefinition.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamespaceAliasDefinition4865); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNamespaceAliasDefinition"


    // $ANTLR start "ruleNamespaceAliasDefinition"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1694:1: ruleNamespaceAliasDefinition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'namespace' this_ID_1= RULE_ID kw= '=' this_QualifiedNamespaceSpecifier_3= ruleQualifiedNamespaceSpecifier kw= ';' ) ;
    public final AntlrDatatypeRuleToken ruleNamespaceAliasDefinition() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        AntlrDatatypeRuleToken this_QualifiedNamespaceSpecifier_3 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1697:28: ( (kw= 'namespace' this_ID_1= RULE_ID kw= '=' this_QualifiedNamespaceSpecifier_3= ruleQualifiedNamespaceSpecifier kw= ';' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1698:1: (kw= 'namespace' this_ID_1= RULE_ID kw= '=' this_QualifiedNamespaceSpecifier_3= ruleQualifiedNamespaceSpecifier kw= ';' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1698:1: (kw= 'namespace' this_ID_1= RULE_ID kw= '=' this_QualifiedNamespaceSpecifier_3= ruleQualifiedNamespaceSpecifier kw= ';' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1699:2: kw= 'namespace' this_ID_1= RULE_ID kw= '=' this_QualifiedNamespaceSpecifier_3= ruleQualifiedNamespaceSpecifier kw= ';'
            {
            kw=(Token)match(input,81,FOLLOW_81_in_ruleNamespaceAliasDefinition4903); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getNamespaceAliasDefinitionAccess().getNamespaceKeyword_0()); 
                
            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNamespaceAliasDefinition4918); 

            		current.merge(this_ID_1);
                
             
                newLeafNode(this_ID_1, grammarAccess.getNamespaceAliasDefinitionAccess().getIDTerminalRuleCall_1()); 
                
            kw=(Token)match(input,39,FOLLOW_39_in_ruleNamespaceAliasDefinition4936); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getNamespaceAliasDefinitionAccess().getEqualsSignKeyword_2()); 
                
             
                    newCompositeNode(grammarAccess.getNamespaceAliasDefinitionAccess().getQualifiedNamespaceSpecifierParserRuleCall_3()); 
                
            pushFollow(FOLLOW_ruleQualifiedNamespaceSpecifier_in_ruleNamespaceAliasDefinition4958);
            this_QualifiedNamespaceSpecifier_3=ruleQualifiedNamespaceSpecifier();

            state._fsp--;


            		current.merge(this_QualifiedNamespaceSpecifier_3);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,40,FOLLOW_40_in_ruleNamespaceAliasDefinition4976); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getNamespaceAliasDefinitionAccess().getSemicolonKeyword_4()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNamespaceAliasDefinition"


    // $ANTLR start "entryRuleQualifiedNamespaceSpecifier"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1742:1: entryRuleQualifiedNamespaceSpecifier returns [String current=null] : iv_ruleQualifiedNamespaceSpecifier= ruleQualifiedNamespaceSpecifier EOF ;
    public final String entryRuleQualifiedNamespaceSpecifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNamespaceSpecifier = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1743:2: (iv_ruleQualifiedNamespaceSpecifier= ruleQualifiedNamespaceSpecifier EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1744:2: iv_ruleQualifiedNamespaceSpecifier= ruleQualifiedNamespaceSpecifier EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNamespaceSpecifierRule()); 
            pushFollow(FOLLOW_ruleQualifiedNamespaceSpecifier_in_entryRuleQualifiedNamespaceSpecifier5017);
            iv_ruleQualifiedNamespaceSpecifier=ruleQualifiedNamespaceSpecifier();

            state._fsp--;

             current =iv_ruleQualifiedNamespaceSpecifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNamespaceSpecifier5028); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNamespaceSpecifier"


    // $ANTLR start "ruleQualifiedNamespaceSpecifier"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1751:1: ruleQualifiedNamespaceSpecifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '::' )? (this_NestedNameSpecifier_1= ruleNestedNameSpecifier )? this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNamespaceSpecifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;
        AntlrDatatypeRuleToken this_NestedNameSpecifier_1 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1754:28: ( ( (kw= '::' )? (this_NestedNameSpecifier_1= ruleNestedNameSpecifier )? this_ID_2= RULE_ID ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1755:1: ( (kw= '::' )? (this_NestedNameSpecifier_1= ruleNestedNameSpecifier )? this_ID_2= RULE_ID )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1755:1: ( (kw= '::' )? (this_NestedNameSpecifier_1= ruleNestedNameSpecifier )? this_ID_2= RULE_ID )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1755:2: (kw= '::' )? (this_NestedNameSpecifier_1= ruleNestedNameSpecifier )? this_ID_2= RULE_ID
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1755:2: (kw= '::' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==58) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1756:2: kw= '::'
                    {
                    kw=(Token)match(input,58,FOLLOW_58_in_ruleQualifiedNamespaceSpecifier5067); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQualifiedNamespaceSpecifierAccess().getColonColonKeyword_0()); 
                        

                    }
                    break;

            }

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1761:3: (this_NestedNameSpecifier_1= ruleNestedNameSpecifier )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==145) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1762:5: this_NestedNameSpecifier_1= ruleNestedNameSpecifier
                    {
                     
                            newCompositeNode(grammarAccess.getQualifiedNamespaceSpecifierAccess().getNestedNameSpecifierParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNestedNameSpecifier_in_ruleQualifiedNamespaceSpecifier5092);
                    this_NestedNameSpecifier_1=ruleNestedNameSpecifier();

                    state._fsp--;


                    		current.merge(this_NestedNameSpecifier_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedNamespaceSpecifier5114); 

            		current.merge(this_ID_2);
                
             
                newLeafNode(this_ID_2, grammarAccess.getQualifiedNamespaceSpecifierAccess().getIDTerminalRuleCall_2()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNamespaceSpecifier"


    // $ANTLR start "entryRuleUsingDeclaration"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1787:1: entryRuleUsingDeclaration returns [String current=null] : iv_ruleUsingDeclaration= ruleUsingDeclaration EOF ;
    public final String entryRuleUsingDeclaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUsingDeclaration = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1788:2: (iv_ruleUsingDeclaration= ruleUsingDeclaration EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1789:2: iv_ruleUsingDeclaration= ruleUsingDeclaration EOF
            {
             newCompositeNode(grammarAccess.getUsingDeclarationRule()); 
            pushFollow(FOLLOW_ruleUsingDeclaration_in_entryRuleUsingDeclaration5160);
            iv_ruleUsingDeclaration=ruleUsingDeclaration();

            state._fsp--;

             current =iv_ruleUsingDeclaration.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUsingDeclaration5171); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUsingDeclaration"


    // $ANTLR start "ruleUsingDeclaration"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1796:1: ruleUsingDeclaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'using' (kw= '::' | ( (kw= 'typename' )? (kw= '::' )? this_NestedNameSpecifier_4= ruleNestedNameSpecifier ) ) this_UnqualifiedId_5= ruleUnqualifiedId kw= ';' ) ;
    public final AntlrDatatypeRuleToken ruleUsingDeclaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_NestedNameSpecifier_4 = null;

        AntlrDatatypeRuleToken this_UnqualifiedId_5 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1799:28: ( (kw= 'using' (kw= '::' | ( (kw= 'typename' )? (kw= '::' )? this_NestedNameSpecifier_4= ruleNestedNameSpecifier ) ) this_UnqualifiedId_5= ruleUnqualifiedId kw= ';' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1800:1: (kw= 'using' (kw= '::' | ( (kw= 'typename' )? (kw= '::' )? this_NestedNameSpecifier_4= ruleNestedNameSpecifier ) ) this_UnqualifiedId_5= ruleUnqualifiedId kw= ';' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1800:1: (kw= 'using' (kw= '::' | ( (kw= 'typename' )? (kw= '::' )? this_NestedNameSpecifier_4= ruleNestedNameSpecifier ) ) this_UnqualifiedId_5= ruleUnqualifiedId kw= ';' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1801:2: kw= 'using' (kw= '::' | ( (kw= 'typename' )? (kw= '::' )? this_NestedNameSpecifier_4= ruleNestedNameSpecifier ) ) this_UnqualifiedId_5= ruleUnqualifiedId kw= ';'
            {
            kw=(Token)match(input,38,FOLLOW_38_in_ruleUsingDeclaration5209); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getUsingDeclarationAccess().getUsingKeyword_0()); 
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1806:1: (kw= '::' | ( (kw= 'typename' )? (kw= '::' )? this_NestedNameSpecifier_4= ruleNestedNameSpecifier ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==58) ) {
                int LA37_1 = input.LA(2);

                if ( (LA37_1==145) ) {
                    alt37=2;
                }
                else if ( (LA37_1==150) ) {
                    alt37=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA37_0==82||LA37_0==145) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1807:2: kw= '::'
                    {
                    kw=(Token)match(input,58,FOLLOW_58_in_ruleUsingDeclaration5223); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getUsingDeclarationAccess().getColonColonKeyword_1_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1813:6: ( (kw= 'typename' )? (kw= '::' )? this_NestedNameSpecifier_4= ruleNestedNameSpecifier )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1813:6: ( (kw= 'typename' )? (kw= '::' )? this_NestedNameSpecifier_4= ruleNestedNameSpecifier )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1813:7: (kw= 'typename' )? (kw= '::' )? this_NestedNameSpecifier_4= ruleNestedNameSpecifier
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1813:7: (kw= 'typename' )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==82) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1814:2: kw= 'typename'
                            {
                            kw=(Token)match(input,82,FOLLOW_82_in_ruleUsingDeclaration5244); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getUsingDeclarationAccess().getTypenameKeyword_1_1_0()); 
                                

                            }
                            break;

                    }

                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1819:3: (kw= '::' )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==58) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1820:2: kw= '::'
                            {
                            kw=(Token)match(input,58,FOLLOW_58_in_ruleUsingDeclaration5260); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getUsingDeclarationAccess().getColonColonKeyword_1_1_1()); 
                                

                            }
                            break;

                    }

                     
                            newCompositeNode(grammarAccess.getUsingDeclarationAccess().getNestedNameSpecifierParserRuleCall_1_1_2()); 
                        
                    pushFollow(FOLLOW_ruleNestedNameSpecifier_in_ruleUsingDeclaration5284);
                    this_NestedNameSpecifier_4=ruleNestedNameSpecifier();

                    state._fsp--;


                    		current.merge(this_NestedNameSpecifier_4);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getUsingDeclarationAccess().getUnqualifiedIdParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleUnqualifiedId_in_ruleUsingDeclaration5313);
            this_UnqualifiedId_5=ruleUnqualifiedId();

            state._fsp--;


            		current.merge(this_UnqualifiedId_5);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,40,FOLLOW_40_in_ruleUsingDeclaration5331); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getUsingDeclarationAccess().getSemicolonKeyword_3()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUsingDeclaration"


    // $ANTLR start "entryRuleAsmDefinition"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1863:1: entryRuleAsmDefinition returns [String current=null] : iv_ruleAsmDefinition= ruleAsmDefinition EOF ;
    public final String entryRuleAsmDefinition() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAsmDefinition = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1864:2: (iv_ruleAsmDefinition= ruleAsmDefinition EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1865:2: iv_ruleAsmDefinition= ruleAsmDefinition EOF
            {
             newCompositeNode(grammarAccess.getAsmDefinitionRule()); 
            pushFollow(FOLLOW_ruleAsmDefinition_in_entryRuleAsmDefinition5374);
            iv_ruleAsmDefinition=ruleAsmDefinition();

            state._fsp--;

             current =iv_ruleAsmDefinition.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAsmDefinition5385); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAsmDefinition"


    // $ANTLR start "ruleAsmDefinition"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1872:1: ruleAsmDefinition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'asm' kw= '(' this_STRING_LITERAL_2= RULE_STRING_LITERAL kw= ')' kw= ';' ) ;
    public final AntlrDatatypeRuleToken ruleAsmDefinition() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_STRING_LITERAL_2=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1875:28: ( (kw= 'asm' kw= '(' this_STRING_LITERAL_2= RULE_STRING_LITERAL kw= ')' kw= ';' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1876:1: (kw= 'asm' kw= '(' this_STRING_LITERAL_2= RULE_STRING_LITERAL kw= ')' kw= ';' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1876:1: (kw= 'asm' kw= '(' this_STRING_LITERAL_2= RULE_STRING_LITERAL kw= ')' kw= ';' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1877:2: kw= 'asm' kw= '(' this_STRING_LITERAL_2= RULE_STRING_LITERAL kw= ')' kw= ';'
            {
            kw=(Token)match(input,83,FOLLOW_83_in_ruleAsmDefinition5423); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getAsmDefinitionAccess().getAsmKeyword_0()); 
                
            kw=(Token)match(input,44,FOLLOW_44_in_ruleAsmDefinition5436); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getAsmDefinitionAccess().getLeftParenthesisKeyword_1()); 
                
            this_STRING_LITERAL_2=(Token)match(input,RULE_STRING_LITERAL,FOLLOW_RULE_STRING_LITERAL_in_ruleAsmDefinition5451); 

            		current.merge(this_STRING_LITERAL_2);
                
             
                newLeafNode(this_STRING_LITERAL_2, grammarAccess.getAsmDefinitionAccess().getSTRING_LITERALTerminalRuleCall_2()); 
                
            kw=(Token)match(input,46,FOLLOW_46_in_ruleAsmDefinition5469); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getAsmDefinitionAccess().getRightParenthesisKeyword_3()); 
                
            kw=(Token)match(input,40,FOLLOW_40_in_ruleAsmDefinition5482); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getAsmDefinitionAccess().getSemicolonKeyword_4()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAsmDefinition"


    // $ANTLR start "entryRuleLinkageSpecification"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1915:1: entryRuleLinkageSpecification returns [String current=null] : iv_ruleLinkageSpecification= ruleLinkageSpecification EOF ;
    public final String entryRuleLinkageSpecification() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLinkageSpecification = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1916:2: (iv_ruleLinkageSpecification= ruleLinkageSpecification EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1917:2: iv_ruleLinkageSpecification= ruleLinkageSpecification EOF
            {
             newCompositeNode(grammarAccess.getLinkageSpecificationRule()); 
            pushFollow(FOLLOW_ruleLinkageSpecification_in_entryRuleLinkageSpecification5523);
            iv_ruleLinkageSpecification=ruleLinkageSpecification();

            state._fsp--;

             current =iv_ruleLinkageSpecification.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLinkageSpecification5534); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLinkageSpecification"


    // $ANTLR start "ruleLinkageSpecification"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1924:1: ruleLinkageSpecification returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'extern' this_STRING_LITERAL_1= RULE_STRING_LITERAL (this_Declaration_2= ruleDeclaration | (kw= '{' (this_Declaration_4= ruleDeclaration )* kw= '}' ) ) ) ;
    public final AntlrDatatypeRuleToken ruleLinkageSpecification() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_STRING_LITERAL_1=null;
        AntlrDatatypeRuleToken this_Declaration_2 = null;

        AntlrDatatypeRuleToken this_Declaration_4 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1927:28: ( (kw= 'extern' this_STRING_LITERAL_1= RULE_STRING_LITERAL (this_Declaration_2= ruleDeclaration | (kw= '{' (this_Declaration_4= ruleDeclaration )* kw= '}' ) ) ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1928:1: (kw= 'extern' this_STRING_LITERAL_1= RULE_STRING_LITERAL (this_Declaration_2= ruleDeclaration | (kw= '{' (this_Declaration_4= ruleDeclaration )* kw= '}' ) ) )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1928:1: (kw= 'extern' this_STRING_LITERAL_1= RULE_STRING_LITERAL (this_Declaration_2= ruleDeclaration | (kw= '{' (this_Declaration_4= ruleDeclaration )* kw= '}' ) ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1929:2: kw= 'extern' this_STRING_LITERAL_1= RULE_STRING_LITERAL (this_Declaration_2= ruleDeclaration | (kw= '{' (this_Declaration_4= ruleDeclaration )* kw= '}' ) )
            {
            kw=(Token)match(input,53,FOLLOW_53_in_ruleLinkageSpecification5572); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getLinkageSpecificationAccess().getExternKeyword_0()); 
                
            this_STRING_LITERAL_1=(Token)match(input,RULE_STRING_LITERAL,FOLLOW_RULE_STRING_LITERAL_in_ruleLinkageSpecification5587); 

            		current.merge(this_STRING_LITERAL_1);
                
             
                newLeafNode(this_STRING_LITERAL_1, grammarAccess.getLinkageSpecificationAccess().getSTRING_LITERALTerminalRuleCall_1()); 
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1941:1: (this_Declaration_2= ruleDeclaration | (kw= '{' (this_Declaration_4= ruleDeclaration )* kw= '}' ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_ID||LA39_0==38||LA39_0==40||LA39_0==43||(LA39_0>=47 && LA39_0<=58)||(LA39_0>=59 && LA39_0<=74)||(LA39_0>=77 && LA39_0<=79)||(LA39_0>=81 && LA39_0<=83)||LA39_0==88||LA39_0==90||(LA39_0>=140 && LA39_0<=142)||(LA39_0>=144 && LA39_0<=145)) ) {
                alt39=1;
            }
            else if ( (LA39_0==75) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1942:5: this_Declaration_2= ruleDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getLinkageSpecificationAccess().getDeclarationParserRuleCall_2_0()); 
                        
                    pushFollow(FOLLOW_ruleDeclaration_in_ruleLinkageSpecification5615);
                    this_Declaration_2=ruleDeclaration();

                    state._fsp--;


                    		current.merge(this_Declaration_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1953:6: (kw= '{' (this_Declaration_4= ruleDeclaration )* kw= '}' )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1953:6: (kw= '{' (this_Declaration_4= ruleDeclaration )* kw= '}' )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1954:2: kw= '{' (this_Declaration_4= ruleDeclaration )* kw= '}'
                    {
                    kw=(Token)match(input,75,FOLLOW_75_in_ruleLinkageSpecification5640); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLinkageSpecificationAccess().getLeftCurlyBracketKeyword_2_1_0()); 
                        
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1959:1: (this_Declaration_4= ruleDeclaration )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==RULE_ID||LA38_0==38||LA38_0==40||LA38_0==43||(LA38_0>=47 && LA38_0<=58)||(LA38_0>=59 && LA38_0<=74)||(LA38_0>=77 && LA38_0<=79)||(LA38_0>=81 && LA38_0<=83)||LA38_0==88||LA38_0==90||(LA38_0>=140 && LA38_0<=142)||(LA38_0>=144 && LA38_0<=145)) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1960:5: this_Declaration_4= ruleDeclaration
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getLinkageSpecificationAccess().getDeclarationParserRuleCall_2_1_1()); 
                    	        
                    	    pushFollow(FOLLOW_ruleDeclaration_in_ruleLinkageSpecification5663);
                    	    this_Declaration_4=ruleDeclaration();

                    	    state._fsp--;


                    	    		current.merge(this_Declaration_4);
                    	        
                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);

                    kw=(Token)match(input,76,FOLLOW_76_in_ruleLinkageSpecification5683); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLinkageSpecificationAccess().getRightCurlyBracketKeyword_2_1_2()); 
                        

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLinkageSpecification"


    // $ANTLR start "entryRuleInitDeclaratorList"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1984:1: entryRuleInitDeclaratorList returns [String current=null] : iv_ruleInitDeclaratorList= ruleInitDeclaratorList EOF ;
    public final String entryRuleInitDeclaratorList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInitDeclaratorList = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1985:2: (iv_ruleInitDeclaratorList= ruleInitDeclaratorList EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1986:2: iv_ruleInitDeclaratorList= ruleInitDeclaratorList EOF
            {
             newCompositeNode(grammarAccess.getInitDeclaratorListRule()); 
            pushFollow(FOLLOW_ruleInitDeclaratorList_in_entryRuleInitDeclaratorList5726);
            iv_ruleInitDeclaratorList=ruleInitDeclaratorList();

            state._fsp--;

             current =iv_ruleInitDeclaratorList.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInitDeclaratorList5737); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInitDeclaratorList"


    // $ANTLR start "ruleInitDeclaratorList"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1993:1: ruleInitDeclaratorList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_InitDeclarator_0= ruleInitDeclarator (kw= ',' this_InitDeclarator_2= ruleInitDeclarator )* ) ;
    public final AntlrDatatypeRuleToken ruleInitDeclaratorList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_InitDeclarator_0 = null;

        AntlrDatatypeRuleToken this_InitDeclarator_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1996:28: ( (this_InitDeclarator_0= ruleInitDeclarator (kw= ',' this_InitDeclarator_2= ruleInitDeclarator )* ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1997:1: (this_InitDeclarator_0= ruleInitDeclarator (kw= ',' this_InitDeclarator_2= ruleInitDeclarator )* )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1997:1: (this_InitDeclarator_0= ruleInitDeclarator (kw= ',' this_InitDeclarator_2= ruleInitDeclarator )* )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1998:5: this_InitDeclarator_0= ruleInitDeclarator (kw= ',' this_InitDeclarator_2= ruleInitDeclarator )*
            {
             
                    newCompositeNode(grammarAccess.getInitDeclaratorListAccess().getInitDeclaratorParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleInitDeclarator_in_ruleInitDeclaratorList5784);
            this_InitDeclarator_0=ruleInitDeclarator();

            state._fsp--;


            		current.merge(this_InitDeclarator_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2008:1: (kw= ',' this_InitDeclarator_2= ruleInitDeclarator )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==45) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2009:2: kw= ',' this_InitDeclarator_2= ruleInitDeclarator
            	    {
            	    kw=(Token)match(input,45,FOLLOW_45_in_ruleInitDeclaratorList5803); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getInitDeclaratorListAccess().getCommaKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getInitDeclaratorListAccess().getInitDeclaratorParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_ruleInitDeclarator_in_ruleInitDeclaratorList5825);
            	    this_InitDeclarator_2=ruleInitDeclarator();

            	    state._fsp--;


            	    		current.merge(this_InitDeclarator_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInitDeclaratorList"


    // $ANTLR start "entryRuleInitDeclarator"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2033:1: entryRuleInitDeclarator returns [String current=null] : iv_ruleInitDeclarator= ruleInitDeclarator EOF ;
    public final String entryRuleInitDeclarator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInitDeclarator = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2034:2: (iv_ruleInitDeclarator= ruleInitDeclarator EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2035:2: iv_ruleInitDeclarator= ruleInitDeclarator EOF
            {
             newCompositeNode(grammarAccess.getInitDeclaratorRule()); 
            pushFollow(FOLLOW_ruleInitDeclarator_in_entryRuleInitDeclarator5873);
            iv_ruleInitDeclarator=ruleInitDeclarator();

            state._fsp--;

             current =iv_ruleInitDeclarator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInitDeclarator5884); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInitDeclarator"


    // $ANTLR start "ruleInitDeclarator"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2042:1: ruleInitDeclarator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DeclaratorId_0= ruleDeclaratorId (this_Initializer_1= ruleInitializer )? ) ;
    public final AntlrDatatypeRuleToken ruleInitDeclarator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_DeclaratorId_0 = null;

        AntlrDatatypeRuleToken this_Initializer_1 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2045:28: ( (this_DeclaratorId_0= ruleDeclaratorId (this_Initializer_1= ruleInitializer )? ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2046:1: (this_DeclaratorId_0= ruleDeclaratorId (this_Initializer_1= ruleInitializer )? )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2046:1: (this_DeclaratorId_0= ruleDeclaratorId (this_Initializer_1= ruleInitializer )? )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2047:5: this_DeclaratorId_0= ruleDeclaratorId (this_Initializer_1= ruleInitializer )?
            {
             
                    newCompositeNode(grammarAccess.getInitDeclaratorAccess().getDeclaratorIdParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleDeclaratorId_in_ruleInitDeclarator5931);
            this_DeclaratorId_0=ruleDeclaratorId();

            state._fsp--;


            		current.merge(this_DeclaratorId_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2057:1: (this_Initializer_1= ruleInitializer )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==39||LA41_0==44||LA41_0==75) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2058:5: this_Initializer_1= ruleInitializer
                    {
                     
                            newCompositeNode(grammarAccess.getInitDeclaratorAccess().getInitializerParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleInitializer_in_ruleInitDeclarator5959);
                    this_Initializer_1=ruleInitializer();

                    state._fsp--;


                    		current.merge(this_Initializer_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInitDeclarator"


    // $ANTLR start "entryRuleFunctionDeclarator"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2076:1: entryRuleFunctionDeclarator returns [String current=null] : iv_ruleFunctionDeclarator= ruleFunctionDeclarator EOF ;
    public final String entryRuleFunctionDeclarator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunctionDeclarator = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2077:2: (iv_ruleFunctionDeclarator= ruleFunctionDeclarator EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2078:2: iv_ruleFunctionDeclarator= ruleFunctionDeclarator EOF
            {
             newCompositeNode(grammarAccess.getFunctionDeclaratorRule()); 
            pushFollow(FOLLOW_ruleFunctionDeclarator_in_entryRuleFunctionDeclarator6007);
            iv_ruleFunctionDeclarator=ruleFunctionDeclarator();

            state._fsp--;

             current =iv_ruleFunctionDeclarator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionDeclarator6018); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionDeclarator"


    // $ANTLR start "ruleFunctionDeclarator"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2085:1: ruleFunctionDeclarator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DeclaratorId_0= ruleDeclaratorId this_ParametersAndQualifiers_1= ruleParametersAndQualifiers ) ;
    public final AntlrDatatypeRuleToken ruleFunctionDeclarator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_DeclaratorId_0 = null;

        AntlrDatatypeRuleToken this_ParametersAndQualifiers_1 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2088:28: ( (this_DeclaratorId_0= ruleDeclaratorId this_ParametersAndQualifiers_1= ruleParametersAndQualifiers ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2089:1: (this_DeclaratorId_0= ruleDeclaratorId this_ParametersAndQualifiers_1= ruleParametersAndQualifiers )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2089:1: (this_DeclaratorId_0= ruleDeclaratorId this_ParametersAndQualifiers_1= ruleParametersAndQualifiers )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2090:5: this_DeclaratorId_0= ruleDeclaratorId this_ParametersAndQualifiers_1= ruleParametersAndQualifiers
            {
             
                    newCompositeNode(grammarAccess.getFunctionDeclaratorAccess().getDeclaratorIdParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleDeclaratorId_in_ruleFunctionDeclarator6065);
            this_DeclaratorId_0=ruleDeclaratorId();

            state._fsp--;


            		current.merge(this_DeclaratorId_0);
                
             
                    afterParserOrEnumRuleCall();
                
             
                    newCompositeNode(grammarAccess.getFunctionDeclaratorAccess().getParametersAndQualifiersParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleParametersAndQualifiers_in_ruleFunctionDeclarator6092);
            this_ParametersAndQualifiers_1=ruleParametersAndQualifiers();

            state._fsp--;


            		current.merge(this_ParametersAndQualifiers_1);
                
             
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionDeclarator"


    // $ANTLR start "entryRuleParametersAndQualifiers"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2119:1: entryRuleParametersAndQualifiers returns [String current=null] : iv_ruleParametersAndQualifiers= ruleParametersAndQualifiers EOF ;
    public final String entryRuleParametersAndQualifiers() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleParametersAndQualifiers = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2120:2: (iv_ruleParametersAndQualifiers= ruleParametersAndQualifiers EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2121:2: iv_ruleParametersAndQualifiers= ruleParametersAndQualifiers EOF
            {
             newCompositeNode(grammarAccess.getParametersAndQualifiersRule()); 
            pushFollow(FOLLOW_ruleParametersAndQualifiers_in_entryRuleParametersAndQualifiers6138);
            iv_ruleParametersAndQualifiers=ruleParametersAndQualifiers();

            state._fsp--;

             current =iv_ruleParametersAndQualifiers.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParametersAndQualifiers6149); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParametersAndQualifiers"


    // $ANTLR start "ruleParametersAndQualifiers"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2128:1: ruleParametersAndQualifiers returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '(' (this_ParameterDeclarationClause_1= ruleParameterDeclarationClause )? kw= ')' (kw= 'const' | kw= 'volatile' )? (kw= '&' | kw= '&&' )? (this_ExceptionSpecification_7= ruleExceptionSpecification )? ) ;
    public final AntlrDatatypeRuleToken ruleParametersAndQualifiers() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ParameterDeclarationClause_1 = null;

        AntlrDatatypeRuleToken this_ExceptionSpecification_7 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2131:28: ( (kw= '(' (this_ParameterDeclarationClause_1= ruleParameterDeclarationClause )? kw= ')' (kw= 'const' | kw= 'volatile' )? (kw= '&' | kw= '&&' )? (this_ExceptionSpecification_7= ruleExceptionSpecification )? ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2132:1: (kw= '(' (this_ParameterDeclarationClause_1= ruleParameterDeclarationClause )? kw= ')' (kw= 'const' | kw= 'volatile' )? (kw= '&' | kw= '&&' )? (this_ExceptionSpecification_7= ruleExceptionSpecification )? )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2132:1: (kw= '(' (this_ParameterDeclarationClause_1= ruleParameterDeclarationClause )? kw= ')' (kw= 'const' | kw= 'volatile' )? (kw= '&' | kw= '&&' )? (this_ExceptionSpecification_7= ruleExceptionSpecification )? )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2133:2: kw= '(' (this_ParameterDeclarationClause_1= ruleParameterDeclarationClause )? kw= ')' (kw= 'const' | kw= 'volatile' )? (kw= '&' | kw= '&&' )? (this_ExceptionSpecification_7= ruleExceptionSpecification )?
            {
            kw=(Token)match(input,44,FOLLOW_44_in_ruleParametersAndQualifiers6187); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getParametersAndQualifiersAccess().getLeftParenthesisKeyword_0()); 
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2138:1: (this_ParameterDeclarationClause_1= ruleParameterDeclarationClause )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_ID||(LA42_0>=47 && LA42_0<=58)||(LA42_0>=60 && LA42_0<=74)||(LA42_0>=77 && LA42_0<=79)||LA42_0==82||LA42_0==88||LA42_0==90||LA42_0==142||LA42_0==145) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2139:5: this_ParameterDeclarationClause_1= ruleParameterDeclarationClause
                    {
                     
                            newCompositeNode(grammarAccess.getParametersAndQualifiersAccess().getParameterDeclarationClauseParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleParameterDeclarationClause_in_ruleParametersAndQualifiers6210);
                    this_ParameterDeclarationClause_1=ruleParameterDeclarationClause();

                    state._fsp--;


                    		current.merge(this_ParameterDeclarationClause_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            kw=(Token)match(input,46,FOLLOW_46_in_ruleParametersAndQualifiers6230); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getParametersAndQualifiersAccess().getRightParenthesisKeyword_2()); 
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2155:1: (kw= 'const' | kw= 'volatile' )?
            int alt43=3;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==84) ) {
                alt43=1;
            }
            else if ( (LA43_0==85) ) {
                alt43=2;
            }
            switch (alt43) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2156:2: kw= 'const'
                    {
                    kw=(Token)match(input,84,FOLLOW_84_in_ruleParametersAndQualifiers6244); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getParametersAndQualifiersAccess().getConstKeyword_3_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2163:2: kw= 'volatile'
                    {
                    kw=(Token)match(input,85,FOLLOW_85_in_ruleParametersAndQualifiers6263); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getParametersAndQualifiersAccess().getVolatileKeyword_3_1()); 
                        

                    }
                    break;

            }

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2168:3: (kw= '&' | kw= '&&' )?
            int alt44=3;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==86) ) {
                alt44=1;
            }
            else if ( (LA44_0==87) ) {
                alt44=2;
            }
            switch (alt44) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2169:2: kw= '&'
                    {
                    kw=(Token)match(input,86,FOLLOW_86_in_ruleParametersAndQualifiers6279); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getParametersAndQualifiersAccess().getAmpersandKeyword_4_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2176:2: kw= '&&'
                    {
                    kw=(Token)match(input,87,FOLLOW_87_in_ruleParametersAndQualifiers6298); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getParametersAndQualifiersAccess().getAmpersandAmpersandKeyword_4_1()); 
                        

                    }
                    break;

            }

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2181:3: (this_ExceptionSpecification_7= ruleExceptionSpecification )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=137 && LA45_0<=138)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2182:5: this_ExceptionSpecification_7= ruleExceptionSpecification
                    {
                     
                            newCompositeNode(grammarAccess.getParametersAndQualifiersAccess().getExceptionSpecificationParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleExceptionSpecification_in_ruleParametersAndQualifiers6323);
                    this_ExceptionSpecification_7=ruleExceptionSpecification();

                    state._fsp--;


                    		current.merge(this_ExceptionSpecification_7);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParametersAndQualifiers"


    // $ANTLR start "entryRuleDeclaratorId"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2200:1: entryRuleDeclaratorId returns [String current=null] : iv_ruleDeclaratorId= ruleDeclaratorId EOF ;
    public final String entryRuleDeclaratorId() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDeclaratorId = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2201:2: (iv_ruleDeclaratorId= ruleDeclaratorId EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2202:2: iv_ruleDeclaratorId= ruleDeclaratorId EOF
            {
             newCompositeNode(grammarAccess.getDeclaratorIdRule()); 
            pushFollow(FOLLOW_ruleDeclaratorId_in_entryRuleDeclaratorId6371);
            iv_ruleDeclaratorId=ruleDeclaratorId();

            state._fsp--;

             current =iv_ruleDeclaratorId.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaratorId6382); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaratorId"


    // $ANTLR start "ruleDeclaratorId"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2209:1: ruleDeclaratorId returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '...' )? this_IdExpression_1= ruleIdExpression ) ;
    public final AntlrDatatypeRuleToken ruleDeclaratorId() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_IdExpression_1 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2212:28: ( ( (kw= '...' )? this_IdExpression_1= ruleIdExpression ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2213:1: ( (kw= '...' )? this_IdExpression_1= ruleIdExpression )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2213:1: ( (kw= '...' )? this_IdExpression_1= ruleIdExpression )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2213:2: (kw= '...' )? this_IdExpression_1= ruleIdExpression
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2213:2: (kw= '...' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==88) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2214:2: kw= '...'
                    {
                    kw=(Token)match(input,88,FOLLOW_88_in_ruleDeclaratorId6421); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDeclaratorIdAccess().getFullStopFullStopFullStopKeyword_0()); 
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getDeclaratorIdAccess().getIdExpressionParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleIdExpression_in_ruleDeclaratorId6445);
            this_IdExpression_1=ruleIdExpression();

            state._fsp--;


            		current.merge(this_IdExpression_1);
                
             
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclaratorId"


    // $ANTLR start "entryRuleTypeId"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2238:1: entryRuleTypeId returns [String current=null] : iv_ruleTypeId= ruleTypeId EOF ;
    public final String entryRuleTypeId() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeId = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2239:2: (iv_ruleTypeId= ruleTypeId EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2240:2: iv_ruleTypeId= ruleTypeId EOF
            {
             newCompositeNode(grammarAccess.getTypeIdRule()); 
            pushFollow(FOLLOW_ruleTypeId_in_entryRuleTypeId6491);
            iv_ruleTypeId=ruleTypeId();

            state._fsp--;

             current =iv_ruleTypeId.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeId6502); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeId"


    // $ANTLR start "ruleTypeId"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2247:1: ruleTypeId returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TypeSpecifier_0= ruleTypeSpecifier )+ ;
    public final AntlrDatatypeRuleToken ruleTypeId() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_TypeSpecifier_0 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2250:28: ( (this_TypeSpecifier_0= ruleTypeSpecifier )+ )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2251:1: (this_TypeSpecifier_0= ruleTypeSpecifier )+
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2251:1: (this_TypeSpecifier_0= ruleTypeSpecifier )+
            int cnt47=0;
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==RULE_ID||LA47_0==58||(LA47_0>=60 && LA47_0<=74)||(LA47_0>=77 && LA47_0<=79)||LA47_0==82||LA47_0==90||LA47_0==142||LA47_0==145) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2252:5: this_TypeSpecifier_0= ruleTypeSpecifier
            	    {
            	     
            	            newCompositeNode(grammarAccess.getTypeIdAccess().getTypeSpecifierParserRuleCall()); 
            	        
            	    pushFollow(FOLLOW_ruleTypeSpecifier_in_ruleTypeId6549);
            	    this_TypeSpecifier_0=ruleTypeSpecifier();

            	    state._fsp--;


            	    		current.merge(this_TypeSpecifier_0);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

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

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeId"


    // $ANTLR start "entryRuleParameterDeclarationClause"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2270:1: entryRuleParameterDeclarationClause returns [String current=null] : iv_ruleParameterDeclarationClause= ruleParameterDeclarationClause EOF ;
    public final String entryRuleParameterDeclarationClause() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleParameterDeclarationClause = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2271:2: (iv_ruleParameterDeclarationClause= ruleParameterDeclarationClause EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2272:2: iv_ruleParameterDeclarationClause= ruleParameterDeclarationClause EOF
            {
             newCompositeNode(grammarAccess.getParameterDeclarationClauseRule()); 
            pushFollow(FOLLOW_ruleParameterDeclarationClause_in_entryRuleParameterDeclarationClause6596);
            iv_ruleParameterDeclarationClause=ruleParameterDeclarationClause();

            state._fsp--;

             current =iv_ruleParameterDeclarationClause.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterDeclarationClause6607); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterDeclarationClause"


    // $ANTLR start "ruleParameterDeclarationClause"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2279:1: ruleParameterDeclarationClause returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '...' | (this_ParameterDeclarationList_1= ruleParameterDeclarationList ( (kw= ',' )? kw= '...' )? ) ) ;
    public final AntlrDatatypeRuleToken ruleParameterDeclarationClause() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ParameterDeclarationList_1 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2282:28: ( (kw= '...' | (this_ParameterDeclarationList_1= ruleParameterDeclarationList ( (kw= ',' )? kw= '...' )? ) ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2283:1: (kw= '...' | (this_ParameterDeclarationList_1= ruleParameterDeclarationList ( (kw= ',' )? kw= '...' )? ) )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2283:1: (kw= '...' | (this_ParameterDeclarationList_1= ruleParameterDeclarationList ( (kw= ',' )? kw= '...' )? ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==88) ) {
                alt50=1;
            }
            else if ( (LA50_0==RULE_ID||(LA50_0>=47 && LA50_0<=58)||(LA50_0>=60 && LA50_0<=74)||(LA50_0>=77 && LA50_0<=79)||LA50_0==82||LA50_0==90||LA50_0==142||LA50_0==145) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2284:2: kw= '...'
                    {
                    kw=(Token)match(input,88,FOLLOW_88_in_ruleParameterDeclarationClause6645); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getParameterDeclarationClauseAccess().getFullStopFullStopFullStopKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2290:6: (this_ParameterDeclarationList_1= ruleParameterDeclarationList ( (kw= ',' )? kw= '...' )? )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2290:6: (this_ParameterDeclarationList_1= ruleParameterDeclarationList ( (kw= ',' )? kw= '...' )? )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2291:5: this_ParameterDeclarationList_1= ruleParameterDeclarationList ( (kw= ',' )? kw= '...' )?
                    {
                     
                            newCompositeNode(grammarAccess.getParameterDeclarationClauseAccess().getParameterDeclarationListParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_ruleParameterDeclarationList_in_ruleParameterDeclarationClause6674);
                    this_ParameterDeclarationList_1=ruleParameterDeclarationList();

                    state._fsp--;


                    		current.merge(this_ParameterDeclarationList_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2301:1: ( (kw= ',' )? kw= '...' )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==45||LA49_0==88) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2301:2: (kw= ',' )? kw= '...'
                            {
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2301:2: (kw= ',' )?
                            int alt48=2;
                            int LA48_0 = input.LA(1);

                            if ( (LA48_0==45) ) {
                                alt48=1;
                            }
                            switch (alt48) {
                                case 1 :
                                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2302:2: kw= ','
                                    {
                                    kw=(Token)match(input,45,FOLLOW_45_in_ruleParameterDeclarationClause6694); 

                                            current.merge(kw);
                                            newLeafNode(kw, grammarAccess.getParameterDeclarationClauseAccess().getCommaKeyword_1_1_0()); 
                                        

                                    }
                                    break;

                            }

                            kw=(Token)match(input,88,FOLLOW_88_in_ruleParameterDeclarationClause6709); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getParameterDeclarationClauseAccess().getFullStopFullStopFullStopKeyword_1_1_1()); 
                                

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterDeclarationClause"


    // $ANTLR start "entryRuleParameterDeclarationList"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2321:1: entryRuleParameterDeclarationList returns [String current=null] : iv_ruleParameterDeclarationList= ruleParameterDeclarationList EOF ;
    public final String entryRuleParameterDeclarationList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleParameterDeclarationList = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2322:2: (iv_ruleParameterDeclarationList= ruleParameterDeclarationList EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2323:2: iv_ruleParameterDeclarationList= ruleParameterDeclarationList EOF
            {
             newCompositeNode(grammarAccess.getParameterDeclarationListRule()); 
            pushFollow(FOLLOW_ruleParameterDeclarationList_in_entryRuleParameterDeclarationList6753);
            iv_ruleParameterDeclarationList=ruleParameterDeclarationList();

            state._fsp--;

             current =iv_ruleParameterDeclarationList.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterDeclarationList6764); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterDeclarationList"


    // $ANTLR start "ruleParameterDeclarationList"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2330:1: ruleParameterDeclarationList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ParameterDeclaration_0= ruleParameterDeclaration (kw= ',' this_ParameterDeclaration_2= ruleParameterDeclaration )* ) ;
    public final AntlrDatatypeRuleToken ruleParameterDeclarationList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ParameterDeclaration_0 = null;

        AntlrDatatypeRuleToken this_ParameterDeclaration_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2333:28: ( (this_ParameterDeclaration_0= ruleParameterDeclaration (kw= ',' this_ParameterDeclaration_2= ruleParameterDeclaration )* ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2334:1: (this_ParameterDeclaration_0= ruleParameterDeclaration (kw= ',' this_ParameterDeclaration_2= ruleParameterDeclaration )* )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2334:1: (this_ParameterDeclaration_0= ruleParameterDeclaration (kw= ',' this_ParameterDeclaration_2= ruleParameterDeclaration )* )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2335:5: this_ParameterDeclaration_0= ruleParameterDeclaration (kw= ',' this_ParameterDeclaration_2= ruleParameterDeclaration )*
            {
             
                    newCompositeNode(grammarAccess.getParameterDeclarationListAccess().getParameterDeclarationParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleParameterDeclaration_in_ruleParameterDeclarationList6811);
            this_ParameterDeclaration_0=ruleParameterDeclaration();

            state._fsp--;


            		current.merge(this_ParameterDeclaration_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2345:1: (kw= ',' this_ParameterDeclaration_2= ruleParameterDeclaration )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==45) ) {
                    int LA51_1 = input.LA(2);

                    if ( (LA51_1==RULE_ID||(LA51_1>=47 && LA51_1<=58)||(LA51_1>=60 && LA51_1<=74)||(LA51_1>=77 && LA51_1<=79)||LA51_1==82||LA51_1==90||LA51_1==142||LA51_1==145) ) {
                        alt51=1;
                    }


                }


                switch (alt51) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2346:2: kw= ',' this_ParameterDeclaration_2= ruleParameterDeclaration
            	    {
            	    kw=(Token)match(input,45,FOLLOW_45_in_ruleParameterDeclarationList6830); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getParameterDeclarationListAccess().getCommaKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getParameterDeclarationListAccess().getParameterDeclarationParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_ruleParameterDeclaration_in_ruleParameterDeclarationList6852);
            	    this_ParameterDeclaration_2=ruleParameterDeclaration();

            	    state._fsp--;


            	    		current.merge(this_ParameterDeclaration_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterDeclarationList"


    // $ANTLR start "entryRuleParameterDeclaration"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2370:1: entryRuleParameterDeclaration returns [String current=null] : iv_ruleParameterDeclaration= ruleParameterDeclaration EOF ;
    public final String entryRuleParameterDeclaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleParameterDeclaration = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2371:2: (iv_ruleParameterDeclaration= ruleParameterDeclaration EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2372:2: iv_ruleParameterDeclaration= ruleParameterDeclaration EOF
            {
             newCompositeNode(grammarAccess.getParameterDeclarationRule()); 
            pushFollow(FOLLOW_ruleParameterDeclaration_in_entryRuleParameterDeclaration6900);
            iv_ruleParameterDeclaration=ruleParameterDeclaration();

            state._fsp--;

             current =iv_ruleParameterDeclaration.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterDeclaration6911); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterDeclaration"


    // $ANTLR start "ruleParameterDeclaration"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2379:1: ruleParameterDeclaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_DeclarationSpecifier_0= ruleDeclarationSpecifier )+ this_InitDeclarator_1= ruleInitDeclarator ) ;
    public final AntlrDatatypeRuleToken ruleParameterDeclaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_DeclarationSpecifier_0 = null;

        AntlrDatatypeRuleToken this_InitDeclarator_1 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2382:28: ( ( (this_DeclarationSpecifier_0= ruleDeclarationSpecifier )+ this_InitDeclarator_1= ruleInitDeclarator ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2383:1: ( (this_DeclarationSpecifier_0= ruleDeclarationSpecifier )+ this_InitDeclarator_1= ruleInitDeclarator )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2383:1: ( (this_DeclarationSpecifier_0= ruleDeclarationSpecifier )+ this_InitDeclarator_1= ruleInitDeclarator )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2383:2: (this_DeclarationSpecifier_0= ruleDeclarationSpecifier )+ this_InitDeclarator_1= ruleInitDeclarator
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2383:2: (this_DeclarationSpecifier_0= ruleDeclarationSpecifier )+
            int cnt52=0;
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==RULE_ID||(LA52_0>=47 && LA52_0<=58)||(LA52_0>=60 && LA52_0<=74)||(LA52_0>=77 && LA52_0<=79)||LA52_0==82||LA52_0==90||LA52_0==142||LA52_0==145) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2384:5: this_DeclarationSpecifier_0= ruleDeclarationSpecifier
            	    {
            	     
            	            newCompositeNode(grammarAccess.getParameterDeclarationAccess().getDeclarationSpecifierParserRuleCall_0()); 
            	        
            	    pushFollow(FOLLOW_ruleDeclarationSpecifier_in_ruleParameterDeclaration6959);
            	    this_DeclarationSpecifier_0=ruleDeclarationSpecifier();

            	    state._fsp--;


            	    		current.merge(this_DeclarationSpecifier_0);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt52 >= 1 ) break loop52;
                        EarlyExitException eee =
                            new EarlyExitException(52, input);
                        throw eee;
                }
                cnt52++;
            } while (true);

             
                    newCompositeNode(grammarAccess.getParameterDeclarationAccess().getInitDeclaratorParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleInitDeclarator_in_ruleParameterDeclaration6988);
            this_InitDeclarator_1=ruleInitDeclarator();

            state._fsp--;


            		current.merge(this_InitDeclarator_1);
                
             
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterDeclaration"


    // $ANTLR start "entryRuleFunctionBody"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2413:1: entryRuleFunctionBody returns [String current=null] : iv_ruleFunctionBody= ruleFunctionBody EOF ;
    public final String entryRuleFunctionBody() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunctionBody = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2414:2: (iv_ruleFunctionBody= ruleFunctionBody EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2415:2: iv_ruleFunctionBody= ruleFunctionBody EOF
            {
             newCompositeNode(grammarAccess.getFunctionBodyRule()); 
            pushFollow(FOLLOW_ruleFunctionBody_in_entryRuleFunctionBody7034);
            iv_ruleFunctionBody=ruleFunctionBody();

            state._fsp--;

             current =iv_ruleFunctionBody.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionBody7045); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionBody"


    // $ANTLR start "ruleFunctionBody"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2422:1: ruleFunctionBody returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_CtorInitializer_0= ruleCtorInitializer )? this_CompoundStatement_1= ruleCompoundStatement ) | this_FunctionTryBlock_2= ruleFunctionTryBlock ) ;
    public final AntlrDatatypeRuleToken ruleFunctionBody() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_CtorInitializer_0 = null;

        AntlrDatatypeRuleToken this_CompoundStatement_1 = null;

        AntlrDatatypeRuleToken this_FunctionTryBlock_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2425:28: ( ( ( (this_CtorInitializer_0= ruleCtorInitializer )? this_CompoundStatement_1= ruleCompoundStatement ) | this_FunctionTryBlock_2= ruleFunctionTryBlock ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2426:1: ( ( (this_CtorInitializer_0= ruleCtorInitializer )? this_CompoundStatement_1= ruleCompoundStatement ) | this_FunctionTryBlock_2= ruleFunctionTryBlock )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2426:1: ( ( (this_CtorInitializer_0= ruleCtorInitializer )? this_CompoundStatement_1= ruleCompoundStatement ) | this_FunctionTryBlock_2= ruleFunctionTryBlock )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( ((LA54_0>=147 && LA54_0<=148)) ) {
                alt54=1;
            }
            else if ( (LA54_0==135) ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2426:2: ( (this_CtorInitializer_0= ruleCtorInitializer )? this_CompoundStatement_1= ruleCompoundStatement )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2426:2: ( (this_CtorInitializer_0= ruleCtorInitializer )? this_CompoundStatement_1= ruleCompoundStatement )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2426:3: (this_CtorInitializer_0= ruleCtorInitializer )? this_CompoundStatement_1= ruleCompoundStatement
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2426:3: (this_CtorInitializer_0= ruleCtorInitializer )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==148) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2427:5: this_CtorInitializer_0= ruleCtorInitializer
                            {
                             
                                    newCompositeNode(grammarAccess.getFunctionBodyAccess().getCtorInitializerParserRuleCall_0_0()); 
                                
                            pushFollow(FOLLOW_ruleCtorInitializer_in_ruleFunctionBody7094);
                            this_CtorInitializer_0=ruleCtorInitializer();

                            state._fsp--;


                            		current.merge(this_CtorInitializer_0);
                                
                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                     
                            newCompositeNode(grammarAccess.getFunctionBodyAccess().getCompoundStatementParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleCompoundStatement_in_ruleFunctionBody7123);
                    this_CompoundStatement_1=ruleCompoundStatement();

                    state._fsp--;


                    		current.merge(this_CompoundStatement_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2450:5: this_FunctionTryBlock_2= ruleFunctionTryBlock
                    {
                     
                            newCompositeNode(grammarAccess.getFunctionBodyAccess().getFunctionTryBlockParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleFunctionTryBlock_in_ruleFunctionBody7157);
                    this_FunctionTryBlock_2=ruleFunctionTryBlock();

                    state._fsp--;


                    		current.merge(this_FunctionTryBlock_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionBody"


    // $ANTLR start "entryRuleInitializer"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2468:1: entryRuleInitializer returns [String current=null] : iv_ruleInitializer= ruleInitializer EOF ;
    public final String entryRuleInitializer() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInitializer = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2469:2: (iv_ruleInitializer= ruleInitializer EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2470:2: iv_ruleInitializer= ruleInitializer EOF
            {
             newCompositeNode(grammarAccess.getInitializerRule()); 
            pushFollow(FOLLOW_ruleInitializer_in_entryRuleInitializer7203);
            iv_ruleInitializer=ruleInitializer();

            state._fsp--;

             current =iv_ruleInitializer.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInitializer7214); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInitializer"


    // $ANTLR start "ruleInitializer"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2477:1: ruleInitializer returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_BraceOrEqualInitializer_0= ruleBraceOrEqualInitializer | (kw= '(' this_ExpressionList_2= ruleExpressionList kw= ')' ) ) ;
    public final AntlrDatatypeRuleToken ruleInitializer() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_BraceOrEqualInitializer_0 = null;

        AntlrDatatypeRuleToken this_ExpressionList_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2480:28: ( (this_BraceOrEqualInitializer_0= ruleBraceOrEqualInitializer | (kw= '(' this_ExpressionList_2= ruleExpressionList kw= ')' ) ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2481:1: (this_BraceOrEqualInitializer_0= ruleBraceOrEqualInitializer | (kw= '(' this_ExpressionList_2= ruleExpressionList kw= ')' ) )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2481:1: (this_BraceOrEqualInitializer_0= ruleBraceOrEqualInitializer | (kw= '(' this_ExpressionList_2= ruleExpressionList kw= ')' ) )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==39||LA55_0==75) ) {
                alt55=1;
            }
            else if ( (LA55_0==44) ) {
                alt55=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2482:5: this_BraceOrEqualInitializer_0= ruleBraceOrEqualInitializer
                    {
                     
                            newCompositeNode(grammarAccess.getInitializerAccess().getBraceOrEqualInitializerParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleBraceOrEqualInitializer_in_ruleInitializer7261);
                    this_BraceOrEqualInitializer_0=ruleBraceOrEqualInitializer();

                    state._fsp--;


                    		current.merge(this_BraceOrEqualInitializer_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2493:6: (kw= '(' this_ExpressionList_2= ruleExpressionList kw= ')' )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2493:6: (kw= '(' this_ExpressionList_2= ruleExpressionList kw= ')' )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2494:2: kw= '(' this_ExpressionList_2= ruleExpressionList kw= ')'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleInitializer7286); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInitializerAccess().getLeftParenthesisKeyword_1_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getInitializerAccess().getExpressionListParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleExpressionList_in_ruleInitializer7308);
                    this_ExpressionList_2=ruleExpressionList();

                    state._fsp--;


                    		current.merge(this_ExpressionList_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleInitializer7326); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInitializerAccess().getRightParenthesisKeyword_1_2()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInitializer"


    // $ANTLR start "entryRuleBraceOrEqualInitializer"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2524:1: entryRuleBraceOrEqualInitializer returns [String current=null] : iv_ruleBraceOrEqualInitializer= ruleBraceOrEqualInitializer EOF ;
    public final String entryRuleBraceOrEqualInitializer() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBraceOrEqualInitializer = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2525:2: (iv_ruleBraceOrEqualInitializer= ruleBraceOrEqualInitializer EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2526:2: iv_ruleBraceOrEqualInitializer= ruleBraceOrEqualInitializer EOF
            {
             newCompositeNode(grammarAccess.getBraceOrEqualInitializerRule()); 
            pushFollow(FOLLOW_ruleBraceOrEqualInitializer_in_entryRuleBraceOrEqualInitializer7368);
            iv_ruleBraceOrEqualInitializer=ruleBraceOrEqualInitializer();

            state._fsp--;

             current =iv_ruleBraceOrEqualInitializer.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBraceOrEqualInitializer7379); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBraceOrEqualInitializer"


    // $ANTLR start "ruleBraceOrEqualInitializer"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2533:1: ruleBraceOrEqualInitializer returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '=' this_InitializerClause_1= ruleInitializerClause ) | this_BracedInitializerList_2= ruleBracedInitializerList ) ;
    public final AntlrDatatypeRuleToken ruleBraceOrEqualInitializer() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_InitializerClause_1 = null;

        AntlrDatatypeRuleToken this_BracedInitializerList_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2536:28: ( ( (kw= '=' this_InitializerClause_1= ruleInitializerClause ) | this_BracedInitializerList_2= ruleBracedInitializerList ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2537:1: ( (kw= '=' this_InitializerClause_1= ruleInitializerClause ) | this_BracedInitializerList_2= ruleBracedInitializerList )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2537:1: ( (kw= '=' this_InitializerClause_1= ruleInitializerClause ) | this_BracedInitializerList_2= ruleBracedInitializerList )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==39) ) {
                alt56=1;
            }
            else if ( (LA56_0==75) ) {
                alt56=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2537:2: (kw= '=' this_InitializerClause_1= ruleInitializerClause )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2537:2: (kw= '=' this_InitializerClause_1= ruleInitializerClause )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2538:2: kw= '=' this_InitializerClause_1= ruleInitializerClause
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleBraceOrEqualInitializer7418); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBraceOrEqualInitializerAccess().getEqualsSignKeyword_0_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getBraceOrEqualInitializerAccess().getInitializerClauseParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleInitializerClause_in_ruleBraceOrEqualInitializer7440);
                    this_InitializerClause_1=ruleInitializerClause();

                    state._fsp--;


                    		current.merge(this_InitializerClause_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2556:5: this_BracedInitializerList_2= ruleBracedInitializerList
                    {
                     
                            newCompositeNode(grammarAccess.getBraceOrEqualInitializerAccess().getBracedInitializerListParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBracedInitializerList_in_ruleBraceOrEqualInitializer7474);
                    this_BracedInitializerList_2=ruleBracedInitializerList();

                    state._fsp--;


                    		current.merge(this_BracedInitializerList_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBraceOrEqualInitializer"


    // $ANTLR start "entryRuleInitializerClause"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2574:1: entryRuleInitializerClause returns [String current=null] : iv_ruleInitializerClause= ruleInitializerClause EOF ;
    public final String entryRuleInitializerClause() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInitializerClause = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2575:2: (iv_ruleInitializerClause= ruleInitializerClause EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2576:2: iv_ruleInitializerClause= ruleInitializerClause EOF
            {
             newCompositeNode(grammarAccess.getInitializerClauseRule()); 
            pushFollow(FOLLOW_ruleInitializerClause_in_entryRuleInitializerClause7520);
            iv_ruleInitializerClause=ruleInitializerClause();

            state._fsp--;

             current =iv_ruleInitializerClause.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInitializerClause7531); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInitializerClause"


    // $ANTLR start "ruleInitializerClause"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2583:1: ruleInitializerClause returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_AssignmentExpression_0= ruleAssignmentExpression | this_BracedInitializerList_1= ruleBracedInitializerList ) ;
    public final AntlrDatatypeRuleToken ruleInitializerClause() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_AssignmentExpression_0 = null;

        AntlrDatatypeRuleToken this_BracedInitializerList_1 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2586:28: ( (this_AssignmentExpression_0= ruleAssignmentExpression | this_BracedInitializerList_1= ruleBracedInitializerList ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2587:1: (this_AssignmentExpression_0= ruleAssignmentExpression | this_BracedInitializerList_1= ruleBracedInitializerList )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2587:1: (this_AssignmentExpression_0= ruleAssignmentExpression | this_BracedInitializerList_1= ruleBracedInitializerList )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==146) ) {
                alt57=1;
            }
            else if ( (LA57_0==75) ) {
                alt57=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2588:5: this_AssignmentExpression_0= ruleAssignmentExpression
                    {
                     
                            newCompositeNode(grammarAccess.getInitializerClauseAccess().getAssignmentExpressionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAssignmentExpression_in_ruleInitializerClause7578);
                    this_AssignmentExpression_0=ruleAssignmentExpression();

                    state._fsp--;


                    		current.merge(this_AssignmentExpression_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2600:5: this_BracedInitializerList_1= ruleBracedInitializerList
                    {
                     
                            newCompositeNode(grammarAccess.getInitializerClauseAccess().getBracedInitializerListParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBracedInitializerList_in_ruleInitializerClause7611);
                    this_BracedInitializerList_1=ruleBracedInitializerList();

                    state._fsp--;


                    		current.merge(this_BracedInitializerList_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInitializerClause"


    // $ANTLR start "entryRuleInitializerList"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2618:1: entryRuleInitializerList returns [String current=null] : iv_ruleInitializerList= ruleInitializerList EOF ;
    public final String entryRuleInitializerList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInitializerList = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2619:2: (iv_ruleInitializerList= ruleInitializerList EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2620:2: iv_ruleInitializerList= ruleInitializerList EOF
            {
             newCompositeNode(grammarAccess.getInitializerListRule()); 
            pushFollow(FOLLOW_ruleInitializerList_in_entryRuleInitializerList7657);
            iv_ruleInitializerList=ruleInitializerList();

            state._fsp--;

             current =iv_ruleInitializerList.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInitializerList7668); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInitializerList"


    // $ANTLR start "ruleInitializerList"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2627:1: ruleInitializerList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_InitializerClause_0= ruleInitializerClause (kw= '...' )? (kw= ',' this_InitializerClause_3= ruleInitializerClause (kw= '...' )? )* ) ;
    public final AntlrDatatypeRuleToken ruleInitializerList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_InitializerClause_0 = null;

        AntlrDatatypeRuleToken this_InitializerClause_3 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2630:28: ( (this_InitializerClause_0= ruleInitializerClause (kw= '...' )? (kw= ',' this_InitializerClause_3= ruleInitializerClause (kw= '...' )? )* ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2631:1: (this_InitializerClause_0= ruleInitializerClause (kw= '...' )? (kw= ',' this_InitializerClause_3= ruleInitializerClause (kw= '...' )? )* )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2631:1: (this_InitializerClause_0= ruleInitializerClause (kw= '...' )? (kw= ',' this_InitializerClause_3= ruleInitializerClause (kw= '...' )? )* )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2632:5: this_InitializerClause_0= ruleInitializerClause (kw= '...' )? (kw= ',' this_InitializerClause_3= ruleInitializerClause (kw= '...' )? )*
            {
             
                    newCompositeNode(grammarAccess.getInitializerListAccess().getInitializerClauseParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleInitializerClause_in_ruleInitializerList7715);
            this_InitializerClause_0=ruleInitializerClause();

            state._fsp--;


            		current.merge(this_InitializerClause_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2642:1: (kw= '...' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==88) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2643:2: kw= '...'
                    {
                    kw=(Token)match(input,88,FOLLOW_88_in_ruleInitializerList7734); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInitializerListAccess().getFullStopFullStopFullStopKeyword_1()); 
                        

                    }
                    break;

            }

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2648:3: (kw= ',' this_InitializerClause_3= ruleInitializerClause (kw= '...' )? )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==45) ) {
                    int LA60_2 = input.LA(2);

                    if ( (LA60_2==75||LA60_2==146) ) {
                        alt60=1;
                    }


                }


                switch (alt60) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2649:2: kw= ',' this_InitializerClause_3= ruleInitializerClause (kw= '...' )?
            	    {
            	    kw=(Token)match(input,45,FOLLOW_45_in_ruleInitializerList7750); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getInitializerListAccess().getCommaKeyword_2_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getInitializerListAccess().getInitializerClauseParserRuleCall_2_1()); 
            	        
            	    pushFollow(FOLLOW_ruleInitializerClause_in_ruleInitializerList7772);
            	    this_InitializerClause_3=ruleInitializerClause();

            	    state._fsp--;


            	    		current.merge(this_InitializerClause_3);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2665:1: (kw= '...' )?
            	    int alt59=2;
            	    int LA59_0 = input.LA(1);

            	    if ( (LA59_0==88) ) {
            	        alt59=1;
            	    }
            	    switch (alt59) {
            	        case 1 :
            	            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2666:2: kw= '...'
            	            {
            	            kw=(Token)match(input,88,FOLLOW_88_in_ruleInitializerList7791); 

            	                    current.merge(kw);
            	                    newLeafNode(kw, grammarAccess.getInitializerListAccess().getFullStopFullStopFullStopKeyword_2_2()); 
            	                

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInitializerList"


    // $ANTLR start "entryRuleBracedInitializerList"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2679:1: entryRuleBracedInitializerList returns [String current=null] : iv_ruleBracedInitializerList= ruleBracedInitializerList EOF ;
    public final String entryRuleBracedInitializerList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBracedInitializerList = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2680:2: (iv_ruleBracedInitializerList= ruleBracedInitializerList EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2681:2: iv_ruleBracedInitializerList= ruleBracedInitializerList EOF
            {
             newCompositeNode(grammarAccess.getBracedInitializerListRule()); 
            pushFollow(FOLLOW_ruleBracedInitializerList_in_entryRuleBracedInitializerList7836);
            iv_ruleBracedInitializerList=ruleBracedInitializerList();

            state._fsp--;

             current =iv_ruleBracedInitializerList.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBracedInitializerList7847); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBracedInitializerList"


    // $ANTLR start "ruleBracedInitializerList"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2688:1: ruleBracedInitializerList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '{' (this_InitializerList_1= ruleInitializerList (kw= ',' )? )? kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleBracedInitializerList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_InitializerList_1 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2691:28: ( (kw= '{' (this_InitializerList_1= ruleInitializerList (kw= ',' )? )? kw= '}' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2692:1: (kw= '{' (this_InitializerList_1= ruleInitializerList (kw= ',' )? )? kw= '}' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2692:1: (kw= '{' (this_InitializerList_1= ruleInitializerList (kw= ',' )? )? kw= '}' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2693:2: kw= '{' (this_InitializerList_1= ruleInitializerList (kw= ',' )? )? kw= '}'
            {
            kw=(Token)match(input,75,FOLLOW_75_in_ruleBracedInitializerList7885); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getBracedInitializerListAccess().getLeftCurlyBracketKeyword_0()); 
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2698:1: (this_InitializerList_1= ruleInitializerList (kw= ',' )? )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==75||LA62_0==146) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2699:5: this_InitializerList_1= ruleInitializerList (kw= ',' )?
                    {
                     
                            newCompositeNode(grammarAccess.getBracedInitializerListAccess().getInitializerListParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_ruleInitializerList_in_ruleBracedInitializerList7908);
                    this_InitializerList_1=ruleInitializerList();

                    state._fsp--;


                    		current.merge(this_InitializerList_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2709:1: (kw= ',' )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==45) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2710:2: kw= ','
                            {
                            kw=(Token)match(input,45,FOLLOW_45_in_ruleBracedInitializerList7927); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getBracedInitializerListAccess().getCommaKeyword_1_1()); 
                                

                            }
                            break;

                    }


                    }
                    break;

            }

            kw=(Token)match(input,76,FOLLOW_76_in_ruleBracedInitializerList7944); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getBracedInitializerListAccess().getRightCurlyBracketKeyword_2()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBracedInitializerList"


    // $ANTLR start "entryRuleClassSpecifier"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2729:1: entryRuleClassSpecifier returns [String current=null] : iv_ruleClassSpecifier= ruleClassSpecifier EOF ;
    public final String entryRuleClassSpecifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleClassSpecifier = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2730:2: (iv_ruleClassSpecifier= ruleClassSpecifier EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2731:2: iv_ruleClassSpecifier= ruleClassSpecifier EOF
            {
             newCompositeNode(grammarAccess.getClassSpecifierRule()); 
            pushFollow(FOLLOW_ruleClassSpecifier_in_entryRuleClassSpecifier7985);
            iv_ruleClassSpecifier=ruleClassSpecifier();

            state._fsp--;

             current =iv_ruleClassSpecifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassSpecifier7996); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassSpecifier"


    // $ANTLR start "ruleClassSpecifier"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2738:1: ruleClassSpecifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ClassHead_0= ruleClassHead kw= '{' (this_MemberSpecification_2= ruleMemberSpecification )? kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleClassSpecifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ClassHead_0 = null;

        AntlrDatatypeRuleToken this_MemberSpecification_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2741:28: ( (this_ClassHead_0= ruleClassHead kw= '{' (this_MemberSpecification_2= ruleMemberSpecification )? kw= '}' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2742:1: (this_ClassHead_0= ruleClassHead kw= '{' (this_MemberSpecification_2= ruleMemberSpecification )? kw= '}' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2742:1: (this_ClassHead_0= ruleClassHead kw= '{' (this_MemberSpecification_2= ruleMemberSpecification )? kw= '}' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2743:5: this_ClassHead_0= ruleClassHead kw= '{' (this_MemberSpecification_2= ruleMemberSpecification )? kw= '}'
            {
             
                    newCompositeNode(grammarAccess.getClassSpecifierAccess().getClassHeadParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleClassHead_in_ruleClassSpecifier8043);
            this_ClassHead_0=ruleClassHead();

            state._fsp--;


            		current.merge(this_ClassHead_0);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,75,FOLLOW_75_in_ruleClassSpecifier8061); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getClassSpecifierAccess().getLeftCurlyBracketKeyword_1()); 
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2759:1: (this_MemberSpecification_2= ruleMemberSpecification )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==EOF||LA63_0==RULE_ID||LA63_0==38||LA63_0==40||LA63_0==43||(LA63_0>=47 && LA63_0<=74)||(LA63_0>=77 && LA63_0<=79)||LA63_0==82||LA63_0==88||LA63_0==90||(LA63_0>=94 && LA63_0<=96)||LA63_0==142||(LA63_0>=144 && LA63_0<=145)) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2760:5: this_MemberSpecification_2= ruleMemberSpecification
                    {
                     
                            newCompositeNode(grammarAccess.getClassSpecifierAccess().getMemberSpecificationParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleMemberSpecification_in_ruleClassSpecifier8084);
                    this_MemberSpecification_2=ruleMemberSpecification();

                    state._fsp--;


                    		current.merge(this_MemberSpecification_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            kw=(Token)match(input,76,FOLLOW_76_in_ruleClassSpecifier8104); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getClassSpecifierAccess().getRightCurlyBracketKeyword_3()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassSpecifier"


    // $ANTLR start "entryRuleClassHead"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2784:1: entryRuleClassHead returns [String current=null] : iv_ruleClassHead= ruleClassHead EOF ;
    public final String entryRuleClassHead() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleClassHead = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2785:2: (iv_ruleClassHead= ruleClassHead EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2786:2: iv_ruleClassHead= ruleClassHead EOF
            {
             newCompositeNode(grammarAccess.getClassHeadRule()); 
            pushFollow(FOLLOW_ruleClassHead_in_entryRuleClassHead8145);
            iv_ruleClassHead=ruleClassHead();

            state._fsp--;

             current =iv_ruleClassHead.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassHead8156); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassHead"


    // $ANTLR start "ruleClassHead"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2793:1: ruleClassHead returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ClassKey_0= ruleClassKey ( (this_NestedNameSpecifier_1= ruleNestedNameSpecifier )? this_TypeName_2= ruleTypeName (this_ClassVirtualSpecifier_3= ruleClassVirtualSpecifier )* )? (this_BaseClause_4= ruleBaseClause )? ) ;
    public final AntlrDatatypeRuleToken ruleClassHead() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_ClassKey_0 = null;

        AntlrDatatypeRuleToken this_NestedNameSpecifier_1 = null;

        AntlrDatatypeRuleToken this_TypeName_2 = null;

        AntlrDatatypeRuleToken this_ClassVirtualSpecifier_3 = null;

        AntlrDatatypeRuleToken this_BaseClause_4 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2796:28: ( (this_ClassKey_0= ruleClassKey ( (this_NestedNameSpecifier_1= ruleNestedNameSpecifier )? this_TypeName_2= ruleTypeName (this_ClassVirtualSpecifier_3= ruleClassVirtualSpecifier )* )? (this_BaseClause_4= ruleBaseClause )? ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2797:1: (this_ClassKey_0= ruleClassKey ( (this_NestedNameSpecifier_1= ruleNestedNameSpecifier )? this_TypeName_2= ruleTypeName (this_ClassVirtualSpecifier_3= ruleClassVirtualSpecifier )* )? (this_BaseClause_4= ruleBaseClause )? )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2797:1: (this_ClassKey_0= ruleClassKey ( (this_NestedNameSpecifier_1= ruleNestedNameSpecifier )? this_TypeName_2= ruleTypeName (this_ClassVirtualSpecifier_3= ruleClassVirtualSpecifier )* )? (this_BaseClause_4= ruleBaseClause )? )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2798:5: this_ClassKey_0= ruleClassKey ( (this_NestedNameSpecifier_1= ruleNestedNameSpecifier )? this_TypeName_2= ruleTypeName (this_ClassVirtualSpecifier_3= ruleClassVirtualSpecifier )* )? (this_BaseClause_4= ruleBaseClause )?
            {
             
                    newCompositeNode(grammarAccess.getClassHeadAccess().getClassKeyParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleClassKey_in_ruleClassHead8203);
            this_ClassKey_0=ruleClassKey();

            state._fsp--;


            		current.merge(this_ClassKey_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2808:1: ( (this_NestedNameSpecifier_1= ruleNestedNameSpecifier )? this_TypeName_2= ruleTypeName (this_ClassVirtualSpecifier_3= ruleClassVirtualSpecifier )* )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_ID||LA66_0==145) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2808:2: (this_NestedNameSpecifier_1= ruleNestedNameSpecifier )? this_TypeName_2= ruleTypeName (this_ClassVirtualSpecifier_3= ruleClassVirtualSpecifier )*
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2808:2: (this_NestedNameSpecifier_1= ruleNestedNameSpecifier )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==145) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2809:5: this_NestedNameSpecifier_1= ruleNestedNameSpecifier
                            {
                             
                                    newCompositeNode(grammarAccess.getClassHeadAccess().getNestedNameSpecifierParserRuleCall_1_0()); 
                                
                            pushFollow(FOLLOW_ruleNestedNameSpecifier_in_ruleClassHead8232);
                            this_NestedNameSpecifier_1=ruleNestedNameSpecifier();

                            state._fsp--;


                            		current.merge(this_NestedNameSpecifier_1);
                                
                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                     
                            newCompositeNode(grammarAccess.getClassHeadAccess().getTypeNameParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleTypeName_in_ruleClassHead8261);
                    this_TypeName_2=ruleTypeName();

                    state._fsp--;


                    		current.merge(this_TypeName_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2830:1: (this_ClassVirtualSpecifier_3= ruleClassVirtualSpecifier )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==57||LA65_0==89) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2831:5: this_ClassVirtualSpecifier_3= ruleClassVirtualSpecifier
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getClassHeadAccess().getClassVirtualSpecifierParserRuleCall_1_2()); 
                    	        
                    	    pushFollow(FOLLOW_ruleClassVirtualSpecifier_in_ruleClassHead8289);
                    	    this_ClassVirtualSpecifier_3=ruleClassVirtualSpecifier();

                    	    state._fsp--;


                    	    		current.merge(this_ClassVirtualSpecifier_3);
                    	        
                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop65;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2841:5: (this_BaseClause_4= ruleBaseClause )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==80) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2842:5: this_BaseClause_4= ruleBaseClause
                    {
                     
                            newCompositeNode(grammarAccess.getClassHeadAccess().getBaseClauseParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleBaseClause_in_ruleClassHead8321);
                    this_BaseClause_4=ruleBaseClause();

                    state._fsp--;


                    		current.merge(this_BaseClause_4);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassHead"


    // $ANTLR start "entryRuleClassVirtualSpecifier"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2860:1: entryRuleClassVirtualSpecifier returns [String current=null] : iv_ruleClassVirtualSpecifier= ruleClassVirtualSpecifier EOF ;
    public final String entryRuleClassVirtualSpecifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleClassVirtualSpecifier = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2861:2: (iv_ruleClassVirtualSpecifier= ruleClassVirtualSpecifier EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2862:2: iv_ruleClassVirtualSpecifier= ruleClassVirtualSpecifier EOF
            {
             newCompositeNode(grammarAccess.getClassVirtualSpecifierRule()); 
            pushFollow(FOLLOW_ruleClassVirtualSpecifier_in_entryRuleClassVirtualSpecifier8369);
            iv_ruleClassVirtualSpecifier=ruleClassVirtualSpecifier();

            state._fsp--;

             current =iv_ruleClassVirtualSpecifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassVirtualSpecifier8380); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassVirtualSpecifier"


    // $ANTLR start "ruleClassVirtualSpecifier"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2869:1: ruleClassVirtualSpecifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'final' | kw= 'explicit' ) ;
    public final AntlrDatatypeRuleToken ruleClassVirtualSpecifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2872:28: ( (kw= 'final' | kw= 'explicit' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2873:1: (kw= 'final' | kw= 'explicit' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2873:1: (kw= 'final' | kw= 'explicit' )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==89) ) {
                alt68=1;
            }
            else if ( (LA68_0==57) ) {
                alt68=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2874:2: kw= 'final'
                    {
                    kw=(Token)match(input,89,FOLLOW_89_in_ruleClassVirtualSpecifier8418); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getClassVirtualSpecifierAccess().getFinalKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2881:2: kw= 'explicit'
                    {
                    kw=(Token)match(input,57,FOLLOW_57_in_ruleClassVirtualSpecifier8437); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getClassVirtualSpecifierAccess().getExplicitKeyword_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassVirtualSpecifier"


    // $ANTLR start "entryRuleClassKey"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2894:1: entryRuleClassKey returns [String current=null] : iv_ruleClassKey= ruleClassKey EOF ;
    public final String entryRuleClassKey() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleClassKey = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2895:2: (iv_ruleClassKey= ruleClassKey EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2896:2: iv_ruleClassKey= ruleClassKey EOF
            {
             newCompositeNode(grammarAccess.getClassKeyRule()); 
            pushFollow(FOLLOW_ruleClassKey_in_entryRuleClassKey8478);
            iv_ruleClassKey=ruleClassKey();

            state._fsp--;

             current =iv_ruleClassKey.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassKey8489); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassKey"


    // $ANTLR start "ruleClassKey"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2903:1: ruleClassKey returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'class' | kw= 'struct' | kw= 'union' ) ;
    public final AntlrDatatypeRuleToken ruleClassKey() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2906:28: ( (kw= 'class' | kw= 'struct' | kw= 'union' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2907:1: (kw= 'class' | kw= 'struct' | kw= 'union' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2907:1: (kw= 'class' | kw= 'struct' | kw= 'union' )
            int alt69=3;
            switch ( input.LA(1) ) {
            case 78:
                {
                alt69=1;
                }
                break;
            case 79:
                {
                alt69=2;
                }
                break;
            case 90:
                {
                alt69=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }

            switch (alt69) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2908:2: kw= 'class'
                    {
                    kw=(Token)match(input,78,FOLLOW_78_in_ruleClassKey8527); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getClassKeyAccess().getClassKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2915:2: kw= 'struct'
                    {
                    kw=(Token)match(input,79,FOLLOW_79_in_ruleClassKey8546); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getClassKeyAccess().getStructKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2922:2: kw= 'union'
                    {
                    kw=(Token)match(input,90,FOLLOW_90_in_ruleClassKey8565); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getClassKeyAccess().getUnionKeyword_2()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassKey"


    // $ANTLR start "entryRuleMemberSpecification"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2935:1: entryRuleMemberSpecification returns [String current=null] : iv_ruleMemberSpecification= ruleMemberSpecification EOF ;
    public final String entryRuleMemberSpecification() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMemberSpecification = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2936:2: (iv_ruleMemberSpecification= ruleMemberSpecification EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2937:2: iv_ruleMemberSpecification= ruleMemberSpecification EOF
            {
             newCompositeNode(grammarAccess.getMemberSpecificationRule()); 
            pushFollow(FOLLOW_ruleMemberSpecification_in_entryRuleMemberSpecification8606);
            iv_ruleMemberSpecification=ruleMemberSpecification();

            state._fsp--;

             current =iv_ruleMemberSpecification.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMemberSpecification8617); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMemberSpecification"


    // $ANTLR start "ruleMemberSpecification"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2944:1: ruleMemberSpecification returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_MemberDeclaration_0= ruleMemberDeclaration | (this_AccessSpecifier_1= ruleAccessSpecifier kw= ':' ) ) (this_MemberSpecification_3= ruleMemberSpecification )? ) ;
    public final AntlrDatatypeRuleToken ruleMemberSpecification() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_MemberDeclaration_0 = null;

        AntlrDatatypeRuleToken this_AccessSpecifier_1 = null;

        AntlrDatatypeRuleToken this_MemberSpecification_3 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2947:28: ( ( (this_MemberDeclaration_0= ruleMemberDeclaration | (this_AccessSpecifier_1= ruleAccessSpecifier kw= ':' ) ) (this_MemberSpecification_3= ruleMemberSpecification )? ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2948:1: ( (this_MemberDeclaration_0= ruleMemberDeclaration | (this_AccessSpecifier_1= ruleAccessSpecifier kw= ':' ) ) (this_MemberSpecification_3= ruleMemberSpecification )? )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2948:1: ( (this_MemberDeclaration_0= ruleMemberDeclaration | (this_AccessSpecifier_1= ruleAccessSpecifier kw= ':' ) ) (this_MemberSpecification_3= ruleMemberSpecification )? )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2948:2: (this_MemberDeclaration_0= ruleMemberDeclaration | (this_AccessSpecifier_1= ruleAccessSpecifier kw= ':' ) ) (this_MemberSpecification_3= ruleMemberSpecification )?
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2948:2: (this_MemberDeclaration_0= ruleMemberDeclaration | (this_AccessSpecifier_1= ruleAccessSpecifier kw= ':' ) )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==EOF||LA70_0==RULE_ID||LA70_0==38||LA70_0==40||LA70_0==43||(LA70_0>=47 && LA70_0<=74)||(LA70_0>=77 && LA70_0<=79)||LA70_0==82||LA70_0==88||LA70_0==90||LA70_0==142||(LA70_0>=144 && LA70_0<=145)) ) {
                alt70=1;
            }
            else if ( ((LA70_0>=94 && LA70_0<=96)) ) {
                alt70=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2949:5: this_MemberDeclaration_0= ruleMemberDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getMemberSpecificationAccess().getMemberDeclarationParserRuleCall_0_0()); 
                        
                    pushFollow(FOLLOW_ruleMemberDeclaration_in_ruleMemberSpecification8665);
                    this_MemberDeclaration_0=ruleMemberDeclaration();

                    state._fsp--;


                    		current.merge(this_MemberDeclaration_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2960:6: (this_AccessSpecifier_1= ruleAccessSpecifier kw= ':' )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2960:6: (this_AccessSpecifier_1= ruleAccessSpecifier kw= ':' )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2961:5: this_AccessSpecifier_1= ruleAccessSpecifier kw= ':'
                    {
                     
                            newCompositeNode(grammarAccess.getMemberSpecificationAccess().getAccessSpecifierParserRuleCall_0_1_0()); 
                        
                    pushFollow(FOLLOW_ruleAccessSpecifier_in_ruleMemberSpecification8699);
                    this_AccessSpecifier_1=ruleAccessSpecifier();

                    state._fsp--;


                    		current.merge(this_AccessSpecifier_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,80,FOLLOW_80_in_ruleMemberSpecification8717); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMemberSpecificationAccess().getColonKeyword_0_1_1()); 
                        

                    }


                    }
                    break;

            }

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2977:3: (this_MemberSpecification_3= ruleMemberSpecification )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==RULE_ID||LA71_0==38||LA71_0==40||LA71_0==43||(LA71_0>=47 && LA71_0<=74)||(LA71_0>=77 && LA71_0<=79)||LA71_0==82||LA71_0==88||LA71_0==90||(LA71_0>=94 && LA71_0<=96)||LA71_0==142||(LA71_0>=144 && LA71_0<=145)) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2978:5: this_MemberSpecification_3= ruleMemberSpecification
                    {
                     
                            newCompositeNode(grammarAccess.getMemberSpecificationAccess().getMemberSpecificationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleMemberSpecification_in_ruleMemberSpecification8742);
                    this_MemberSpecification_3=ruleMemberSpecification();

                    state._fsp--;


                    		current.merge(this_MemberSpecification_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMemberSpecification"


    // $ANTLR start "entryRuleMemberDeclaration"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2996:1: entryRuleMemberDeclaration returns [String current=null] : iv_ruleMemberDeclaration= ruleMemberDeclaration EOF ;
    public final String entryRuleMemberDeclaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMemberDeclaration = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2997:2: (iv_ruleMemberDeclaration= ruleMemberDeclaration EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2998:2: iv_ruleMemberDeclaration= ruleMemberDeclaration EOF
            {
             newCompositeNode(grammarAccess.getMemberDeclarationRule()); 
            pushFollow(FOLLOW_ruleMemberDeclaration_in_entryRuleMemberDeclaration8790);
            iv_ruleMemberDeclaration=ruleMemberDeclaration();

            state._fsp--;

             current =iv_ruleMemberDeclaration.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMemberDeclaration8801); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMemberDeclaration"


    // $ANTLR start "ruleMemberDeclaration"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3005:1: ruleMemberDeclaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_MemberOrFunctionDeclaration_0= ruleMemberOrFunctionDeclaration | this_UsingDeclaration_1= ruleUsingDeclaration | this_StaticAssertDeclaration_2= ruleStaticAssertDeclaration | this_TemplateDeclaration_3= ruleTemplateDeclaration | this_AliasDeclaration_4= ruleAliasDeclaration ) ;
    public final AntlrDatatypeRuleToken ruleMemberDeclaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_MemberOrFunctionDeclaration_0 = null;

        AntlrDatatypeRuleToken this_UsingDeclaration_1 = null;

        AntlrDatatypeRuleToken this_StaticAssertDeclaration_2 = null;

        AntlrDatatypeRuleToken this_TemplateDeclaration_3 = null;

        AntlrDatatypeRuleToken this_AliasDeclaration_4 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3008:28: ( (this_MemberOrFunctionDeclaration_0= ruleMemberOrFunctionDeclaration | this_UsingDeclaration_1= ruleUsingDeclaration | this_StaticAssertDeclaration_2= ruleStaticAssertDeclaration | this_TemplateDeclaration_3= ruleTemplateDeclaration | this_AliasDeclaration_4= ruleAliasDeclaration ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3009:1: (this_MemberOrFunctionDeclaration_0= ruleMemberOrFunctionDeclaration | this_UsingDeclaration_1= ruleUsingDeclaration | this_StaticAssertDeclaration_2= ruleStaticAssertDeclaration | this_TemplateDeclaration_3= ruleTemplateDeclaration | this_AliasDeclaration_4= ruleAliasDeclaration )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3009:1: (this_MemberOrFunctionDeclaration_0= ruleMemberOrFunctionDeclaration | this_UsingDeclaration_1= ruleUsingDeclaration | this_StaticAssertDeclaration_2= ruleStaticAssertDeclaration | this_TemplateDeclaration_3= ruleTemplateDeclaration | this_AliasDeclaration_4= ruleAliasDeclaration )
            int alt72=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 40:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 77:
            case 78:
            case 79:
            case 82:
            case 88:
            case 90:
            case 142:
            case 144:
            case 145:
                {
                alt72=1;
                }
                break;
            case 38:
                {
                int LA72_2 = input.LA(2);

                if ( (LA72_2==58||LA72_2==82||LA72_2==145) ) {
                    alt72=2;
                }
                else if ( (LA72_2==RULE_ID) ) {
                    alt72=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 72, 2, input);

                    throw nvae;
                }
                }
                break;
            case 43:
                {
                alt72=3;
                }
                break;
            case 59:
                {
                alt72=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }

            switch (alt72) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3010:5: this_MemberOrFunctionDeclaration_0= ruleMemberOrFunctionDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getMemberDeclarationAccess().getMemberOrFunctionDeclarationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleMemberOrFunctionDeclaration_in_ruleMemberDeclaration8848);
                    this_MemberOrFunctionDeclaration_0=ruleMemberOrFunctionDeclaration();

                    state._fsp--;


                    		current.merge(this_MemberOrFunctionDeclaration_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3022:5: this_UsingDeclaration_1= ruleUsingDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getMemberDeclarationAccess().getUsingDeclarationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleUsingDeclaration_in_ruleMemberDeclaration8881);
                    this_UsingDeclaration_1=ruleUsingDeclaration();

                    state._fsp--;


                    		current.merge(this_UsingDeclaration_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:5: this_StaticAssertDeclaration_2= ruleStaticAssertDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getMemberDeclarationAccess().getStaticAssertDeclarationParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleStaticAssertDeclaration_in_ruleMemberDeclaration8914);
                    this_StaticAssertDeclaration_2=ruleStaticAssertDeclaration();

                    state._fsp--;


                    		current.merge(this_StaticAssertDeclaration_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3046:5: this_TemplateDeclaration_3= ruleTemplateDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getMemberDeclarationAccess().getTemplateDeclarationParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleTemplateDeclaration_in_ruleMemberDeclaration8947);
                    this_TemplateDeclaration_3=ruleTemplateDeclaration();

                    state._fsp--;


                    		current.merge(this_TemplateDeclaration_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3058:5: this_AliasDeclaration_4= ruleAliasDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getMemberDeclarationAccess().getAliasDeclarationParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleAliasDeclaration_in_ruleMemberDeclaration8980);
                    this_AliasDeclaration_4=ruleAliasDeclaration();

                    state._fsp--;


                    		current.merge(this_AliasDeclaration_4);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMemberDeclaration"


    // $ANTLR start "entryRuleMemberOrFunctionDeclaration"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3076:1: entryRuleMemberOrFunctionDeclaration returns [String current=null] : iv_ruleMemberOrFunctionDeclaration= ruleMemberOrFunctionDeclaration EOF ;
    public final String entryRuleMemberOrFunctionDeclaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMemberOrFunctionDeclaration = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3077:2: (iv_ruleMemberOrFunctionDeclaration= ruleMemberOrFunctionDeclaration EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3078:2: iv_ruleMemberOrFunctionDeclaration= ruleMemberOrFunctionDeclaration EOF
            {
             newCompositeNode(grammarAccess.getMemberOrFunctionDeclarationRule()); 
            pushFollow(FOLLOW_ruleMemberOrFunctionDeclaration_in_entryRuleMemberOrFunctionDeclaration9026);
            iv_ruleMemberOrFunctionDeclaration=ruleMemberOrFunctionDeclaration();

            state._fsp--;

             current =iv_ruleMemberOrFunctionDeclaration.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMemberOrFunctionDeclaration9037); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMemberOrFunctionDeclaration"


    // $ANTLR start "ruleMemberOrFunctionDeclaration"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3085:1: ruleMemberOrFunctionDeclaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_DeclarationSpecifier_0= ruleDeclarationSpecifier )* (this_FunctionDeclarationSuffix_1= ruleFunctionDeclarationSuffix | (this_MemberDeclarationSuffix_2= ruleMemberDeclarationSuffix kw= ';' ) ) ) ;
    public final AntlrDatatypeRuleToken ruleMemberOrFunctionDeclaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_DeclarationSpecifier_0 = null;

        AntlrDatatypeRuleToken this_FunctionDeclarationSuffix_1 = null;

        AntlrDatatypeRuleToken this_MemberDeclarationSuffix_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3088:28: ( ( (this_DeclarationSpecifier_0= ruleDeclarationSpecifier )* (this_FunctionDeclarationSuffix_1= ruleFunctionDeclarationSuffix | (this_MemberDeclarationSuffix_2= ruleMemberDeclarationSuffix kw= ';' ) ) ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3089:1: ( (this_DeclarationSpecifier_0= ruleDeclarationSpecifier )* (this_FunctionDeclarationSuffix_1= ruleFunctionDeclarationSuffix | (this_MemberDeclarationSuffix_2= ruleMemberDeclarationSuffix kw= ';' ) ) )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3089:1: ( (this_DeclarationSpecifier_0= ruleDeclarationSpecifier )* (this_FunctionDeclarationSuffix_1= ruleFunctionDeclarationSuffix | (this_MemberDeclarationSuffix_2= ruleMemberDeclarationSuffix kw= ';' ) ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3089:2: (this_DeclarationSpecifier_0= ruleDeclarationSpecifier )* (this_FunctionDeclarationSuffix_1= ruleFunctionDeclarationSuffix | (this_MemberDeclarationSuffix_2= ruleMemberDeclarationSuffix kw= ';' ) )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3089:2: (this_DeclarationSpecifier_0= ruleDeclarationSpecifier )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==RULE_ID||(LA73_0>=47 && LA73_0<=58)||(LA73_0>=60 && LA73_0<=74)||(LA73_0>=77 && LA73_0<=79)||LA73_0==82||LA73_0==90||LA73_0==142||LA73_0==145) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3090:5: this_DeclarationSpecifier_0= ruleDeclarationSpecifier
            	    {
            	     
            	            newCompositeNode(grammarAccess.getMemberOrFunctionDeclarationAccess().getDeclarationSpecifierParserRuleCall_0()); 
            	        
            	    pushFollow(FOLLOW_ruleDeclarationSpecifier_in_ruleMemberOrFunctionDeclaration9085);
            	    this_DeclarationSpecifier_0=ruleDeclarationSpecifier();

            	    state._fsp--;


            	    		current.merge(this_DeclarationSpecifier_0);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop73;
                }
            } while (true);

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3100:3: (this_FunctionDeclarationSuffix_1= ruleFunctionDeclarationSuffix | (this_MemberDeclarationSuffix_2= ruleMemberDeclarationSuffix kw= ';' ) )
            int alt74=2;
            switch ( input.LA(1) ) {
            case 88:
                {
                int LA74_1 = input.LA(2);

                if ( (LA74_1==144) ) {
                    int LA74_2 = input.LA(3);

                    if ( ((LA74_2>=39 && LA74_2<=40)||LA74_2==45||LA74_2==75||LA74_2==89||(LA74_2>=91 && LA74_2<=92)) ) {
                        alt74=2;
                    }
                    else if ( (LA74_2==44) ) {
                        alt74=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 74, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 74, 1, input);

                    throw nvae;
                }
                }
                break;
            case 144:
                {
                int LA74_2 = input.LA(2);

                if ( ((LA74_2>=39 && LA74_2<=40)||LA74_2==45||LA74_2==75||LA74_2==89||(LA74_2>=91 && LA74_2<=92)) ) {
                    alt74=2;
                }
                else if ( (LA74_2==44) ) {
                    alt74=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 74, 2, input);

                    throw nvae;
                }
                }
                break;
            case 40:
                {
                alt74=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }

            switch (alt74) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3101:5: this_FunctionDeclarationSuffix_1= ruleFunctionDeclarationSuffix
                    {
                     
                            newCompositeNode(grammarAccess.getMemberOrFunctionDeclarationAccess().getFunctionDeclarationSuffixParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_ruleFunctionDeclarationSuffix_in_ruleMemberOrFunctionDeclaration9115);
                    this_FunctionDeclarationSuffix_1=ruleFunctionDeclarationSuffix();

                    state._fsp--;


                    		current.merge(this_FunctionDeclarationSuffix_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3112:6: (this_MemberDeclarationSuffix_2= ruleMemberDeclarationSuffix kw= ';' )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3112:6: (this_MemberDeclarationSuffix_2= ruleMemberDeclarationSuffix kw= ';' )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3113:5: this_MemberDeclarationSuffix_2= ruleMemberDeclarationSuffix kw= ';'
                    {
                     
                            newCompositeNode(grammarAccess.getMemberOrFunctionDeclarationAccess().getMemberDeclarationSuffixParserRuleCall_1_1_0()); 
                        
                    pushFollow(FOLLOW_ruleMemberDeclarationSuffix_in_ruleMemberOrFunctionDeclaration9149);
                    this_MemberDeclarationSuffix_2=ruleMemberDeclarationSuffix();

                    state._fsp--;


                    		current.merge(this_MemberDeclarationSuffix_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleMemberOrFunctionDeclaration9167); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMemberOrFunctionDeclarationAccess().getSemicolonKeyword_1_1_1()); 
                        

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMemberOrFunctionDeclaration"


    // $ANTLR start "entryRuleMemberDeclarationSuffix"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3137:1: entryRuleMemberDeclarationSuffix returns [String current=null] : iv_ruleMemberDeclarationSuffix= ruleMemberDeclarationSuffix EOF ;
    public final String entryRuleMemberDeclarationSuffix() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMemberDeclarationSuffix = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3138:2: (iv_ruleMemberDeclarationSuffix= ruleMemberDeclarationSuffix EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3139:2: iv_ruleMemberDeclarationSuffix= ruleMemberDeclarationSuffix EOF
            {
             newCompositeNode(grammarAccess.getMemberDeclarationSuffixRule()); 
            pushFollow(FOLLOW_ruleMemberDeclarationSuffix_in_entryRuleMemberDeclarationSuffix9210);
            iv_ruleMemberDeclarationSuffix=ruleMemberDeclarationSuffix();

            state._fsp--;

             current =iv_ruleMemberDeclarationSuffix.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMemberDeclarationSuffix9221); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMemberDeclarationSuffix"


    // $ANTLR start "ruleMemberDeclarationSuffix"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3146:1: ruleMemberDeclarationSuffix returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_MemberDeclaratorList_0= ruleMemberDeclaratorList )? ;
    public final AntlrDatatypeRuleToken ruleMemberDeclarationSuffix() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_MemberDeclaratorList_0 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3149:28: ( (this_MemberDeclaratorList_0= ruleMemberDeclaratorList )? )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3150:1: (this_MemberDeclaratorList_0= ruleMemberDeclaratorList )?
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3150:1: (this_MemberDeclaratorList_0= ruleMemberDeclaratorList )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==88||LA75_0==144) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3151:5: this_MemberDeclaratorList_0= ruleMemberDeclaratorList
                    {
                     
                            newCompositeNode(grammarAccess.getMemberDeclarationSuffixAccess().getMemberDeclaratorListParserRuleCall()); 
                        
                    pushFollow(FOLLOW_ruleMemberDeclaratorList_in_ruleMemberDeclarationSuffix9268);
                    this_MemberDeclaratorList_0=ruleMemberDeclaratorList();

                    state._fsp--;


                    		current.merge(this_MemberDeclaratorList_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMemberDeclarationSuffix"


    // $ANTLR start "entryRuleMemberDeclaratorList"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3169:1: entryRuleMemberDeclaratorList returns [String current=null] : iv_ruleMemberDeclaratorList= ruleMemberDeclaratorList EOF ;
    public final String entryRuleMemberDeclaratorList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMemberDeclaratorList = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3170:2: (iv_ruleMemberDeclaratorList= ruleMemberDeclaratorList EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3171:2: iv_ruleMemberDeclaratorList= ruleMemberDeclaratorList EOF
            {
             newCompositeNode(grammarAccess.getMemberDeclaratorListRule()); 
            pushFollow(FOLLOW_ruleMemberDeclaratorList_in_entryRuleMemberDeclaratorList9315);
            iv_ruleMemberDeclaratorList=ruleMemberDeclaratorList();

            state._fsp--;

             current =iv_ruleMemberDeclaratorList.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMemberDeclaratorList9326); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMemberDeclaratorList"


    // $ANTLR start "ruleMemberDeclaratorList"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3178:1: ruleMemberDeclaratorList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_MemberDeclarator_0= ruleMemberDeclarator (kw= ',' this_MemberDeclarator_2= ruleMemberDeclarator )* ) ;
    public final AntlrDatatypeRuleToken ruleMemberDeclaratorList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_MemberDeclarator_0 = null;

        AntlrDatatypeRuleToken this_MemberDeclarator_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3181:28: ( (this_MemberDeclarator_0= ruleMemberDeclarator (kw= ',' this_MemberDeclarator_2= ruleMemberDeclarator )* ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3182:1: (this_MemberDeclarator_0= ruleMemberDeclarator (kw= ',' this_MemberDeclarator_2= ruleMemberDeclarator )* )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3182:1: (this_MemberDeclarator_0= ruleMemberDeclarator (kw= ',' this_MemberDeclarator_2= ruleMemberDeclarator )* )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3183:5: this_MemberDeclarator_0= ruleMemberDeclarator (kw= ',' this_MemberDeclarator_2= ruleMemberDeclarator )*
            {
             
                    newCompositeNode(grammarAccess.getMemberDeclaratorListAccess().getMemberDeclaratorParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleMemberDeclarator_in_ruleMemberDeclaratorList9373);
            this_MemberDeclarator_0=ruleMemberDeclarator();

            state._fsp--;


            		current.merge(this_MemberDeclarator_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3193:1: (kw= ',' this_MemberDeclarator_2= ruleMemberDeclarator )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==45) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3194:2: kw= ',' this_MemberDeclarator_2= ruleMemberDeclarator
            	    {
            	    kw=(Token)match(input,45,FOLLOW_45_in_ruleMemberDeclaratorList9392); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getMemberDeclaratorListAccess().getCommaKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getMemberDeclaratorListAccess().getMemberDeclaratorParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_ruleMemberDeclarator_in_ruleMemberDeclaratorList9414);
            	    this_MemberDeclarator_2=ruleMemberDeclarator();

            	    state._fsp--;


            	    		current.merge(this_MemberDeclarator_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop76;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMemberDeclaratorList"


    // $ANTLR start "entryRuleMemberDeclarator"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3218:1: entryRuleMemberDeclarator returns [String current=null] : iv_ruleMemberDeclarator= ruleMemberDeclarator EOF ;
    public final String entryRuleMemberDeclarator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMemberDeclarator = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3219:2: (iv_ruleMemberDeclarator= ruleMemberDeclarator EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3220:2: iv_ruleMemberDeclarator= ruleMemberDeclarator EOF
            {
             newCompositeNode(grammarAccess.getMemberDeclaratorRule()); 
            pushFollow(FOLLOW_ruleMemberDeclarator_in_entryRuleMemberDeclarator9462);
            iv_ruleMemberDeclarator=ruleMemberDeclarator();

            state._fsp--;

             current =iv_ruleMemberDeclarator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMemberDeclarator9473); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMemberDeclarator"


    // $ANTLR start "ruleMemberDeclarator"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3227:1: ruleMemberDeclarator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DeclaratorId_0= ruleDeclaratorId (this_VirtualSpecifier_1= ruleVirtualSpecifier )* ( (this_PureSpecifier_2= rulePureSpecifier )? | this_BraceOrEqualInitializer_3= ruleBraceOrEqualInitializer ) ) ;
    public final AntlrDatatypeRuleToken ruleMemberDeclarator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_DeclaratorId_0 = null;

        AntlrDatatypeRuleToken this_VirtualSpecifier_1 = null;

        AntlrDatatypeRuleToken this_PureSpecifier_2 = null;

        AntlrDatatypeRuleToken this_BraceOrEqualInitializer_3 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3230:28: ( (this_DeclaratorId_0= ruleDeclaratorId (this_VirtualSpecifier_1= ruleVirtualSpecifier )* ( (this_PureSpecifier_2= rulePureSpecifier )? | this_BraceOrEqualInitializer_3= ruleBraceOrEqualInitializer ) ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3231:1: (this_DeclaratorId_0= ruleDeclaratorId (this_VirtualSpecifier_1= ruleVirtualSpecifier )* ( (this_PureSpecifier_2= rulePureSpecifier )? | this_BraceOrEqualInitializer_3= ruleBraceOrEqualInitializer ) )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3231:1: (this_DeclaratorId_0= ruleDeclaratorId (this_VirtualSpecifier_1= ruleVirtualSpecifier )* ( (this_PureSpecifier_2= rulePureSpecifier )? | this_BraceOrEqualInitializer_3= ruleBraceOrEqualInitializer ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3232:5: this_DeclaratorId_0= ruleDeclaratorId (this_VirtualSpecifier_1= ruleVirtualSpecifier )* ( (this_PureSpecifier_2= rulePureSpecifier )? | this_BraceOrEqualInitializer_3= ruleBraceOrEqualInitializer )
            {
             
                    newCompositeNode(grammarAccess.getMemberDeclaratorAccess().getDeclaratorIdParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleDeclaratorId_in_ruleMemberDeclarator9520);
            this_DeclaratorId_0=ruleDeclaratorId();

            state._fsp--;


            		current.merge(this_DeclaratorId_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3242:1: (this_VirtualSpecifier_1= ruleVirtualSpecifier )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==89||(LA77_0>=91 && LA77_0<=92)) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3243:5: this_VirtualSpecifier_1= ruleVirtualSpecifier
            	    {
            	     
            	            newCompositeNode(grammarAccess.getMemberDeclaratorAccess().getVirtualSpecifierParserRuleCall_1()); 
            	        
            	    pushFollow(FOLLOW_ruleVirtualSpecifier_in_ruleMemberDeclarator9548);
            	    this_VirtualSpecifier_1=ruleVirtualSpecifier();

            	    state._fsp--;


            	    		current.merge(this_VirtualSpecifier_1);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop77;
                }
            } while (true);

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3253:3: ( (this_PureSpecifier_2= rulePureSpecifier )? | this_BraceOrEqualInitializer_3= ruleBraceOrEqualInitializer )
            int alt79=2;
            switch ( input.LA(1) ) {
            case 39:
                {
                int LA79_1 = input.LA(2);

                if ( (LA79_1==93) ) {
                    alt79=1;
                }
                else if ( (LA79_1==75||LA79_1==146) ) {
                    alt79=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 79, 1, input);

                    throw nvae;
                }
                }
                break;
            case EOF:
            case 40:
            case 45:
                {
                alt79=1;
                }
                break;
            case 75:
                {
                alt79=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }

            switch (alt79) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3253:4: (this_PureSpecifier_2= rulePureSpecifier )?
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3253:4: (this_PureSpecifier_2= rulePureSpecifier )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==39) ) {
                        alt78=1;
                    }
                    switch (alt78) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3254:5: this_PureSpecifier_2= rulePureSpecifier
                            {
                             
                                    newCompositeNode(grammarAccess.getMemberDeclaratorAccess().getPureSpecifierParserRuleCall_2_0()); 
                                
                            pushFollow(FOLLOW_rulePureSpecifier_in_ruleMemberDeclarator9579);
                            this_PureSpecifier_2=rulePureSpecifier();

                            state._fsp--;


                            		current.merge(this_PureSpecifier_2);
                                
                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3266:5: this_BraceOrEqualInitializer_3= ruleBraceOrEqualInitializer
                    {
                     
                            newCompositeNode(grammarAccess.getMemberDeclaratorAccess().getBraceOrEqualInitializerParserRuleCall_2_1()); 
                        
                    pushFollow(FOLLOW_ruleBraceOrEqualInitializer_in_ruleMemberDeclarator9614);
                    this_BraceOrEqualInitializer_3=ruleBraceOrEqualInitializer();

                    state._fsp--;


                    		current.merge(this_BraceOrEqualInitializer_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMemberDeclarator"


    // $ANTLR start "entryRuleVirtualSpecifier"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3284:1: entryRuleVirtualSpecifier returns [String current=null] : iv_ruleVirtualSpecifier= ruleVirtualSpecifier EOF ;
    public final String entryRuleVirtualSpecifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVirtualSpecifier = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3285:2: (iv_ruleVirtualSpecifier= ruleVirtualSpecifier EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3286:2: iv_ruleVirtualSpecifier= ruleVirtualSpecifier EOF
            {
             newCompositeNode(grammarAccess.getVirtualSpecifierRule()); 
            pushFollow(FOLLOW_ruleVirtualSpecifier_in_entryRuleVirtualSpecifier9661);
            iv_ruleVirtualSpecifier=ruleVirtualSpecifier();

            state._fsp--;

             current =iv_ruleVirtualSpecifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVirtualSpecifier9672); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVirtualSpecifier"


    // $ANTLR start "ruleVirtualSpecifier"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3293:1: ruleVirtualSpecifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'override' | kw= 'final' | kw= 'new' ) ;
    public final AntlrDatatypeRuleToken ruleVirtualSpecifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3296:28: ( (kw= 'override' | kw= 'final' | kw= 'new' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3297:1: (kw= 'override' | kw= 'final' | kw= 'new' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3297:1: (kw= 'override' | kw= 'final' | kw= 'new' )
            int alt80=3;
            switch ( input.LA(1) ) {
            case 91:
                {
                alt80=1;
                }
                break;
            case 89:
                {
                alt80=2;
                }
                break;
            case 92:
                {
                alt80=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }

            switch (alt80) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3298:2: kw= 'override'
                    {
                    kw=(Token)match(input,91,FOLLOW_91_in_ruleVirtualSpecifier9710); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVirtualSpecifierAccess().getOverrideKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3305:2: kw= 'final'
                    {
                    kw=(Token)match(input,89,FOLLOW_89_in_ruleVirtualSpecifier9729); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVirtualSpecifierAccess().getFinalKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3312:2: kw= 'new'
                    {
                    kw=(Token)match(input,92,FOLLOW_92_in_ruleVirtualSpecifier9748); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVirtualSpecifierAccess().getNewKeyword_2()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVirtualSpecifier"


    // $ANTLR start "entryRulePureSpecifier"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3325:1: entryRulePureSpecifier returns [String current=null] : iv_rulePureSpecifier= rulePureSpecifier EOF ;
    public final String entryRulePureSpecifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePureSpecifier = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3326:2: (iv_rulePureSpecifier= rulePureSpecifier EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3327:2: iv_rulePureSpecifier= rulePureSpecifier EOF
            {
             newCompositeNode(grammarAccess.getPureSpecifierRule()); 
            pushFollow(FOLLOW_rulePureSpecifier_in_entryRulePureSpecifier9789);
            iv_rulePureSpecifier=rulePureSpecifier();

            state._fsp--;

             current =iv_rulePureSpecifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePureSpecifier9800); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePureSpecifier"


    // $ANTLR start "rulePureSpecifier"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3334:1: rulePureSpecifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '=' kw= '0' ) ;
    public final AntlrDatatypeRuleToken rulePureSpecifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3337:28: ( (kw= '=' kw= '0' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3338:1: (kw= '=' kw= '0' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3338:1: (kw= '=' kw= '0' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3339:2: kw= '=' kw= '0'
            {
            kw=(Token)match(input,39,FOLLOW_39_in_rulePureSpecifier9838); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getPureSpecifierAccess().getEqualsSignKeyword_0()); 
                
            kw=(Token)match(input,93,FOLLOW_93_in_rulePureSpecifier9851); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getPureSpecifierAccess().getDigitZeroKeyword_1()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePureSpecifier"


    // $ANTLR start "entryRuleBaseClause"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3358:1: entryRuleBaseClause returns [String current=null] : iv_ruleBaseClause= ruleBaseClause EOF ;
    public final String entryRuleBaseClause() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBaseClause = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3359:2: (iv_ruleBaseClause= ruleBaseClause EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3360:2: iv_ruleBaseClause= ruleBaseClause EOF
            {
             newCompositeNode(grammarAccess.getBaseClauseRule()); 
            pushFollow(FOLLOW_ruleBaseClause_in_entryRuleBaseClause9892);
            iv_ruleBaseClause=ruleBaseClause();

            state._fsp--;

             current =iv_ruleBaseClause.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBaseClause9903); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBaseClause"


    // $ANTLR start "ruleBaseClause"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3367:1: ruleBaseClause returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= ':' this_BaseSpecifierList_1= ruleBaseSpecifierList ) ;
    public final AntlrDatatypeRuleToken ruleBaseClause() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_BaseSpecifierList_1 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3370:28: ( (kw= ':' this_BaseSpecifierList_1= ruleBaseSpecifierList ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3371:1: (kw= ':' this_BaseSpecifierList_1= ruleBaseSpecifierList )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3371:1: (kw= ':' this_BaseSpecifierList_1= ruleBaseSpecifierList )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3372:2: kw= ':' this_BaseSpecifierList_1= ruleBaseSpecifierList
            {
            kw=(Token)match(input,80,FOLLOW_80_in_ruleBaseClause9941); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getBaseClauseAccess().getColonKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getBaseClauseAccess().getBaseSpecifierListParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleBaseSpecifierList_in_ruleBaseClause9963);
            this_BaseSpecifierList_1=ruleBaseSpecifierList();

            state._fsp--;


            		current.merge(this_BaseSpecifierList_1);
                
             
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBaseClause"


    // $ANTLR start "entryRuleBaseSpecifierList"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3396:1: entryRuleBaseSpecifierList returns [String current=null] : iv_ruleBaseSpecifierList= ruleBaseSpecifierList EOF ;
    public final String entryRuleBaseSpecifierList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBaseSpecifierList = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3397:2: (iv_ruleBaseSpecifierList= ruleBaseSpecifierList EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3398:2: iv_ruleBaseSpecifierList= ruleBaseSpecifierList EOF
            {
             newCompositeNode(grammarAccess.getBaseSpecifierListRule()); 
            pushFollow(FOLLOW_ruleBaseSpecifierList_in_entryRuleBaseSpecifierList10009);
            iv_ruleBaseSpecifierList=ruleBaseSpecifierList();

            state._fsp--;

             current =iv_ruleBaseSpecifierList.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBaseSpecifierList10020); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBaseSpecifierList"


    // $ANTLR start "ruleBaseSpecifierList"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3405:1: ruleBaseSpecifierList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_BaseSpecifier_0= ruleBaseSpecifier (kw= '...' )? (kw= ',' this_BaseSpecifier_3= ruleBaseSpecifier (kw= '...' )? )* ) ;
    public final AntlrDatatypeRuleToken ruleBaseSpecifierList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_BaseSpecifier_0 = null;

        AntlrDatatypeRuleToken this_BaseSpecifier_3 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3408:28: ( (this_BaseSpecifier_0= ruleBaseSpecifier (kw= '...' )? (kw= ',' this_BaseSpecifier_3= ruleBaseSpecifier (kw= '...' )? )* ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3409:1: (this_BaseSpecifier_0= ruleBaseSpecifier (kw= '...' )? (kw= ',' this_BaseSpecifier_3= ruleBaseSpecifier (kw= '...' )? )* )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3409:1: (this_BaseSpecifier_0= ruleBaseSpecifier (kw= '...' )? (kw= ',' this_BaseSpecifier_3= ruleBaseSpecifier (kw= '...' )? )* )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3410:5: this_BaseSpecifier_0= ruleBaseSpecifier (kw= '...' )? (kw= ',' this_BaseSpecifier_3= ruleBaseSpecifier (kw= '...' )? )*
            {
             
                    newCompositeNode(grammarAccess.getBaseSpecifierListAccess().getBaseSpecifierParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleBaseSpecifier_in_ruleBaseSpecifierList10067);
            this_BaseSpecifier_0=ruleBaseSpecifier();

            state._fsp--;


            		current.merge(this_BaseSpecifier_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3420:1: (kw= '...' )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==88) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3421:2: kw= '...'
                    {
                    kw=(Token)match(input,88,FOLLOW_88_in_ruleBaseSpecifierList10086); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBaseSpecifierListAccess().getFullStopFullStopFullStopKeyword_1()); 
                        

                    }
                    break;

            }

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3426:3: (kw= ',' this_BaseSpecifier_3= ruleBaseSpecifier (kw= '...' )? )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==45) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3427:2: kw= ',' this_BaseSpecifier_3= ruleBaseSpecifier (kw= '...' )?
            	    {
            	    kw=(Token)match(input,45,FOLLOW_45_in_ruleBaseSpecifierList10102); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getBaseSpecifierListAccess().getCommaKeyword_2_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getBaseSpecifierListAccess().getBaseSpecifierParserRuleCall_2_1()); 
            	        
            	    pushFollow(FOLLOW_ruleBaseSpecifier_in_ruleBaseSpecifierList10124);
            	    this_BaseSpecifier_3=ruleBaseSpecifier();

            	    state._fsp--;


            	    		current.merge(this_BaseSpecifier_3);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3443:1: (kw= '...' )?
            	    int alt82=2;
            	    int LA82_0 = input.LA(1);

            	    if ( (LA82_0==88) ) {
            	        alt82=1;
            	    }
            	    switch (alt82) {
            	        case 1 :
            	            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3444:2: kw= '...'
            	            {
            	            kw=(Token)match(input,88,FOLLOW_88_in_ruleBaseSpecifierList10143); 

            	                    current.merge(kw);
            	                    newLeafNode(kw, grammarAccess.getBaseSpecifierListAccess().getFullStopFullStopFullStopKeyword_2_2()); 
            	                

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop83;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBaseSpecifierList"


    // $ANTLR start "entryRuleBaseSpecifier"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3457:1: entryRuleBaseSpecifier returns [String current=null] : iv_ruleBaseSpecifier= ruleBaseSpecifier EOF ;
    public final String entryRuleBaseSpecifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBaseSpecifier = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3458:2: (iv_ruleBaseSpecifier= ruleBaseSpecifier EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3459:2: iv_ruleBaseSpecifier= ruleBaseSpecifier EOF
            {
             newCompositeNode(grammarAccess.getBaseSpecifierRule()); 
            pushFollow(FOLLOW_ruleBaseSpecifier_in_entryRuleBaseSpecifier10188);
            iv_ruleBaseSpecifier=ruleBaseSpecifier();

            state._fsp--;

             current =iv_ruleBaseSpecifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBaseSpecifier10199); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBaseSpecifier"


    // $ANTLR start "ruleBaseSpecifier"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3466:1: ruleBaseSpecifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= 'virtual' (this_AccessSpecifier_1= ruleAccessSpecifier )? ) | (this_AccessSpecifier_2= ruleAccessSpecifier (kw= 'virtual' )? ) )? this_ClassOrDeclarationType_4= ruleClassOrDeclarationType ) ;
    public final AntlrDatatypeRuleToken ruleBaseSpecifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_AccessSpecifier_1 = null;

        AntlrDatatypeRuleToken this_AccessSpecifier_2 = null;

        AntlrDatatypeRuleToken this_ClassOrDeclarationType_4 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3469:28: ( ( ( (kw= 'virtual' (this_AccessSpecifier_1= ruleAccessSpecifier )? ) | (this_AccessSpecifier_2= ruleAccessSpecifier (kw= 'virtual' )? ) )? this_ClassOrDeclarationType_4= ruleClassOrDeclarationType ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3470:1: ( ( (kw= 'virtual' (this_AccessSpecifier_1= ruleAccessSpecifier )? ) | (this_AccessSpecifier_2= ruleAccessSpecifier (kw= 'virtual' )? ) )? this_ClassOrDeclarationType_4= ruleClassOrDeclarationType )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3470:1: ( ( (kw= 'virtual' (this_AccessSpecifier_1= ruleAccessSpecifier )? ) | (this_AccessSpecifier_2= ruleAccessSpecifier (kw= 'virtual' )? ) )? this_ClassOrDeclarationType_4= ruleClassOrDeclarationType )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3470:2: ( (kw= 'virtual' (this_AccessSpecifier_1= ruleAccessSpecifier )? ) | (this_AccessSpecifier_2= ruleAccessSpecifier (kw= 'virtual' )? ) )? this_ClassOrDeclarationType_4= ruleClassOrDeclarationType
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3470:2: ( (kw= 'virtual' (this_AccessSpecifier_1= ruleAccessSpecifier )? ) | (this_AccessSpecifier_2= ruleAccessSpecifier (kw= 'virtual' )? ) )?
            int alt86=3;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==56) ) {
                alt86=1;
            }
            else if ( ((LA86_0>=94 && LA86_0<=96)) ) {
                alt86=2;
            }
            switch (alt86) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3470:3: (kw= 'virtual' (this_AccessSpecifier_1= ruleAccessSpecifier )? )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3470:3: (kw= 'virtual' (this_AccessSpecifier_1= ruleAccessSpecifier )? )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3471:2: kw= 'virtual' (this_AccessSpecifier_1= ruleAccessSpecifier )?
                    {
                    kw=(Token)match(input,56,FOLLOW_56_in_ruleBaseSpecifier10239); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBaseSpecifierAccess().getVirtualKeyword_0_0_0()); 
                        
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3476:1: (this_AccessSpecifier_1= ruleAccessSpecifier )?
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( ((LA84_0>=94 && LA84_0<=96)) ) {
                        alt84=1;
                    }
                    switch (alt84) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3477:5: this_AccessSpecifier_1= ruleAccessSpecifier
                            {
                             
                                    newCompositeNode(grammarAccess.getBaseSpecifierAccess().getAccessSpecifierParserRuleCall_0_0_1()); 
                                
                            pushFollow(FOLLOW_ruleAccessSpecifier_in_ruleBaseSpecifier10262);
                            this_AccessSpecifier_1=ruleAccessSpecifier();

                            state._fsp--;


                            		current.merge(this_AccessSpecifier_1);
                                
                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3488:6: (this_AccessSpecifier_2= ruleAccessSpecifier (kw= 'virtual' )? )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3488:6: (this_AccessSpecifier_2= ruleAccessSpecifier (kw= 'virtual' )? )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3489:5: this_AccessSpecifier_2= ruleAccessSpecifier (kw= 'virtual' )?
                    {
                     
                            newCompositeNode(grammarAccess.getBaseSpecifierAccess().getAccessSpecifierParserRuleCall_0_1_0()); 
                        
                    pushFollow(FOLLOW_ruleAccessSpecifier_in_ruleBaseSpecifier10299);
                    this_AccessSpecifier_2=ruleAccessSpecifier();

                    state._fsp--;


                    		current.merge(this_AccessSpecifier_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3499:1: (kw= 'virtual' )?
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==56) ) {
                        alt85=1;
                    }
                    switch (alt85) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3500:2: kw= 'virtual'
                            {
                            kw=(Token)match(input,56,FOLLOW_56_in_ruleBaseSpecifier10318); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getBaseSpecifierAccess().getVirtualKeyword_0_1_1()); 
                                

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getBaseSpecifierAccess().getClassOrDeclarationTypeParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleClassOrDeclarationType_in_ruleBaseSpecifier10345);
            this_ClassOrDeclarationType_4=ruleClassOrDeclarationType();

            state._fsp--;


            		current.merge(this_ClassOrDeclarationType_4);
                
             
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBaseSpecifier"


    // $ANTLR start "entryRuleClassOrDeclarationType"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3524:1: entryRuleClassOrDeclarationType returns [String current=null] : iv_ruleClassOrDeclarationType= ruleClassOrDeclarationType EOF ;
    public final String entryRuleClassOrDeclarationType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleClassOrDeclarationType = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3525:2: (iv_ruleClassOrDeclarationType= ruleClassOrDeclarationType EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3526:2: iv_ruleClassOrDeclarationType= ruleClassOrDeclarationType EOF
            {
             newCompositeNode(grammarAccess.getClassOrDeclarationTypeRule()); 
            pushFollow(FOLLOW_ruleClassOrDeclarationType_in_entryRuleClassOrDeclarationType10391);
            iv_ruleClassOrDeclarationType=ruleClassOrDeclarationType();

            state._fsp--;

             current =iv_ruleClassOrDeclarationType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassOrDeclarationType10402); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassOrDeclarationType"


    // $ANTLR start "ruleClassOrDeclarationType"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3533:1: ruleClassOrDeclarationType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= '::' )? (this_NestedNameSpecifier_1= ruleNestedNameSpecifier )? this_TypeName_2= ruleTypeName ) | this_DeclarationTypeSpecifier_3= ruleDeclarationTypeSpecifier ) ;
    public final AntlrDatatypeRuleToken ruleClassOrDeclarationType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_NestedNameSpecifier_1 = null;

        AntlrDatatypeRuleToken this_TypeName_2 = null;

        AntlrDatatypeRuleToken this_DeclarationTypeSpecifier_3 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3536:28: ( ( ( (kw= '::' )? (this_NestedNameSpecifier_1= ruleNestedNameSpecifier )? this_TypeName_2= ruleTypeName ) | this_DeclarationTypeSpecifier_3= ruleDeclarationTypeSpecifier ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3537:1: ( ( (kw= '::' )? (this_NestedNameSpecifier_1= ruleNestedNameSpecifier )? this_TypeName_2= ruleTypeName ) | this_DeclarationTypeSpecifier_3= ruleDeclarationTypeSpecifier )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3537:1: ( ( (kw= '::' )? (this_NestedNameSpecifier_1= ruleNestedNameSpecifier )? this_TypeName_2= ruleTypeName ) | this_DeclarationTypeSpecifier_3= ruleDeclarationTypeSpecifier )
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==RULE_ID||LA89_0==58||LA89_0==145) ) {
                alt89=1;
            }
            else if ( (LA89_0==74) ) {
                alt89=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }
            switch (alt89) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3537:2: ( (kw= '::' )? (this_NestedNameSpecifier_1= ruleNestedNameSpecifier )? this_TypeName_2= ruleTypeName )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3537:2: ( (kw= '::' )? (this_NestedNameSpecifier_1= ruleNestedNameSpecifier )? this_TypeName_2= ruleTypeName )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3537:3: (kw= '::' )? (this_NestedNameSpecifier_1= ruleNestedNameSpecifier )? this_TypeName_2= ruleTypeName
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3537:3: (kw= '::' )?
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==58) ) {
                        alt87=1;
                    }
                    switch (alt87) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3538:2: kw= '::'
                            {
                            kw=(Token)match(input,58,FOLLOW_58_in_ruleClassOrDeclarationType10442); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getClassOrDeclarationTypeAccess().getColonColonKeyword_0_0()); 
                                

                            }
                            break;

                    }

                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3543:3: (this_NestedNameSpecifier_1= ruleNestedNameSpecifier )?
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==145) ) {
                        alt88=1;
                    }
                    switch (alt88) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3544:5: this_NestedNameSpecifier_1= ruleNestedNameSpecifier
                            {
                             
                                    newCompositeNode(grammarAccess.getClassOrDeclarationTypeAccess().getNestedNameSpecifierParserRuleCall_0_1()); 
                                
                            pushFollow(FOLLOW_ruleNestedNameSpecifier_in_ruleClassOrDeclarationType10467);
                            this_NestedNameSpecifier_1=ruleNestedNameSpecifier();

                            state._fsp--;


                            		current.merge(this_NestedNameSpecifier_1);
                                
                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                     
                            newCompositeNode(grammarAccess.getClassOrDeclarationTypeAccess().getTypeNameParserRuleCall_0_2()); 
                        
                    pushFollow(FOLLOW_ruleTypeName_in_ruleClassOrDeclarationType10496);
                    this_TypeName_2=ruleTypeName();

                    state._fsp--;


                    		current.merge(this_TypeName_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3567:5: this_DeclarationTypeSpecifier_3= ruleDeclarationTypeSpecifier
                    {
                     
                            newCompositeNode(grammarAccess.getClassOrDeclarationTypeAccess().getDeclarationTypeSpecifierParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDeclarationTypeSpecifier_in_ruleClassOrDeclarationType10530);
                    this_DeclarationTypeSpecifier_3=ruleDeclarationTypeSpecifier();

                    state._fsp--;


                    		current.merge(this_DeclarationTypeSpecifier_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassOrDeclarationType"


    // $ANTLR start "entryRuleAccessSpecifier"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3585:1: entryRuleAccessSpecifier returns [String current=null] : iv_ruleAccessSpecifier= ruleAccessSpecifier EOF ;
    public final String entryRuleAccessSpecifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAccessSpecifier = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3586:2: (iv_ruleAccessSpecifier= ruleAccessSpecifier EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3587:2: iv_ruleAccessSpecifier= ruleAccessSpecifier EOF
            {
             newCompositeNode(grammarAccess.getAccessSpecifierRule()); 
            pushFollow(FOLLOW_ruleAccessSpecifier_in_entryRuleAccessSpecifier10576);
            iv_ruleAccessSpecifier=ruleAccessSpecifier();

            state._fsp--;

             current =iv_ruleAccessSpecifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAccessSpecifier10587); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAccessSpecifier"


    // $ANTLR start "ruleAccessSpecifier"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3594:1: ruleAccessSpecifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'private' | kw= 'protected' | kw= 'public' ) ;
    public final AntlrDatatypeRuleToken ruleAccessSpecifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3597:28: ( (kw= 'private' | kw= 'protected' | kw= 'public' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3598:1: (kw= 'private' | kw= 'protected' | kw= 'public' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3598:1: (kw= 'private' | kw= 'protected' | kw= 'public' )
            int alt90=3;
            switch ( input.LA(1) ) {
            case 94:
                {
                alt90=1;
                }
                break;
            case 95:
                {
                alt90=2;
                }
                break;
            case 96:
                {
                alt90=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }

            switch (alt90) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3599:2: kw= 'private'
                    {
                    kw=(Token)match(input,94,FOLLOW_94_in_ruleAccessSpecifier10625); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAccessSpecifierAccess().getPrivateKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3606:2: kw= 'protected'
                    {
                    kw=(Token)match(input,95,FOLLOW_95_in_ruleAccessSpecifier10644); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAccessSpecifierAccess().getProtectedKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3613:2: kw= 'public'
                    {
                    kw=(Token)match(input,96,FOLLOW_96_in_ruleAccessSpecifier10663); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAccessSpecifierAccess().getPublicKeyword_2()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAccessSpecifier"


    // $ANTLR start "entryRuleOperatorFunctionId"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3626:1: entryRuleOperatorFunctionId returns [String current=null] : iv_ruleOperatorFunctionId= ruleOperatorFunctionId EOF ;
    public final String entryRuleOperatorFunctionId() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperatorFunctionId = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3627:2: (iv_ruleOperatorFunctionId= ruleOperatorFunctionId EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3628:2: iv_ruleOperatorFunctionId= ruleOperatorFunctionId EOF
            {
             newCompositeNode(grammarAccess.getOperatorFunctionIdRule()); 
            pushFollow(FOLLOW_ruleOperatorFunctionId_in_entryRuleOperatorFunctionId10704);
            iv_ruleOperatorFunctionId=ruleOperatorFunctionId();

            state._fsp--;

             current =iv_ruleOperatorFunctionId.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperatorFunctionId10715); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperatorFunctionId"


    // $ANTLR start "ruleOperatorFunctionId"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3635:1: ruleOperatorFunctionId returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'operator' this_OverloadableOperator_1= ruleOverloadableOperator (kw= '<' (this_ConstantExpression_3= ruleConstantExpression | this_TypeSpecifier_4= ruleTypeSpecifier | this_IdExpression_5= ruleIdExpression )* kw= '>' )? ) ;
    public final AntlrDatatypeRuleToken ruleOperatorFunctionId() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_OverloadableOperator_1 = null;

        AntlrDatatypeRuleToken this_ConstantExpression_3 = null;

        AntlrDatatypeRuleToken this_TypeSpecifier_4 = null;

        AntlrDatatypeRuleToken this_IdExpression_5 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3638:28: ( (kw= 'operator' this_OverloadableOperator_1= ruleOverloadableOperator (kw= '<' (this_ConstantExpression_3= ruleConstantExpression | this_TypeSpecifier_4= ruleTypeSpecifier | this_IdExpression_5= ruleIdExpression )* kw= '>' )? ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3639:1: (kw= 'operator' this_OverloadableOperator_1= ruleOverloadableOperator (kw= '<' (this_ConstantExpression_3= ruleConstantExpression | this_TypeSpecifier_4= ruleTypeSpecifier | this_IdExpression_5= ruleIdExpression )* kw= '>' )? )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3639:1: (kw= 'operator' this_OverloadableOperator_1= ruleOverloadableOperator (kw= '<' (this_ConstantExpression_3= ruleConstantExpression | this_TypeSpecifier_4= ruleTypeSpecifier | this_IdExpression_5= ruleIdExpression )* kw= '>' )? )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3640:2: kw= 'operator' this_OverloadableOperator_1= ruleOverloadableOperator (kw= '<' (this_ConstantExpression_3= ruleConstantExpression | this_TypeSpecifier_4= ruleTypeSpecifier | this_IdExpression_5= ruleIdExpression )* kw= '>' )?
            {
            kw=(Token)match(input,97,FOLLOW_97_in_ruleOperatorFunctionId10753); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getOperatorFunctionIdAccess().getOperatorKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getOperatorFunctionIdAccess().getOverloadableOperatorParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleOverloadableOperator_in_ruleOperatorFunctionId10775);
            this_OverloadableOperator_1=ruleOverloadableOperator();

            state._fsp--;


            		current.merge(this_OverloadableOperator_1);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3656:1: (kw= '<' (this_ConstantExpression_3= ruleConstantExpression | this_TypeSpecifier_4= ruleTypeSpecifier | this_IdExpression_5= ruleIdExpression )* kw= '>' )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==98) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3657:2: kw= '<' (this_ConstantExpression_3= ruleConstantExpression | this_TypeSpecifier_4= ruleTypeSpecifier | this_IdExpression_5= ruleIdExpression )* kw= '>'
                    {
                    kw=(Token)match(input,98,FOLLOW_98_in_ruleOperatorFunctionId10794); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOperatorFunctionIdAccess().getLessThanSignKeyword_2_0()); 
                        
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3662:1: (this_ConstantExpression_3= ruleConstantExpression | this_TypeSpecifier_4= ruleTypeSpecifier | this_IdExpression_5= ruleIdExpression )*
                    loop91:
                    do {
                        int alt91=4;
                        switch ( input.LA(1) ) {
                        case 143:
                            {
                            alt91=1;
                            }
                            break;
                        case RULE_ID:
                        case 58:
                        case 60:
                        case 61:
                        case 62:
                        case 63:
                        case 64:
                        case 65:
                        case 66:
                        case 67:
                        case 68:
                        case 69:
                        case 70:
                        case 71:
                        case 72:
                        case 73:
                        case 74:
                        case 77:
                        case 78:
                        case 79:
                        case 82:
                        case 90:
                        case 142:
                        case 145:
                            {
                            alt91=2;
                            }
                            break;
                        case 144:
                            {
                            alt91=3;
                            }
                            break;

                        }

                        switch (alt91) {
                    	case 1 :
                    	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3663:5: this_ConstantExpression_3= ruleConstantExpression
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getOperatorFunctionIdAccess().getConstantExpressionParserRuleCall_2_1_0()); 
                    	        
                    	    pushFollow(FOLLOW_ruleConstantExpression_in_ruleOperatorFunctionId10817);
                    	    this_ConstantExpression_3=ruleConstantExpression();

                    	    state._fsp--;


                    	    		current.merge(this_ConstantExpression_3);
                    	        
                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3675:5: this_TypeSpecifier_4= ruleTypeSpecifier
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getOperatorFunctionIdAccess().getTypeSpecifierParserRuleCall_2_1_1()); 
                    	        
                    	    pushFollow(FOLLOW_ruleTypeSpecifier_in_ruleOperatorFunctionId10850);
                    	    this_TypeSpecifier_4=ruleTypeSpecifier();

                    	    state._fsp--;


                    	    		current.merge(this_TypeSpecifier_4);
                    	        
                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;
                    	case 3 :
                    	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3687:5: this_IdExpression_5= ruleIdExpression
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getOperatorFunctionIdAccess().getIdExpressionParserRuleCall_2_1_2()); 
                    	        
                    	    pushFollow(FOLLOW_ruleIdExpression_in_ruleOperatorFunctionId10883);
                    	    this_IdExpression_5=ruleIdExpression();

                    	    state._fsp--;


                    	    		current.merge(this_IdExpression_5);
                    	        
                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop91;
                        }
                    } while (true);

                    kw=(Token)match(input,99,FOLLOW_99_in_ruleOperatorFunctionId10903); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOperatorFunctionIdAccess().getGreaterThanSignKeyword_2_2()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperatorFunctionId"


    // $ANTLR start "entryRuleOverloadableOperator"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3711:1: entryRuleOverloadableOperator returns [String current=null] : iv_ruleOverloadableOperator= ruleOverloadableOperator EOF ;
    public final String entryRuleOverloadableOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOverloadableOperator = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3712:2: (iv_ruleOverloadableOperator= ruleOverloadableOperator EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3713:2: iv_ruleOverloadableOperator= ruleOverloadableOperator EOF
            {
             newCompositeNode(grammarAccess.getOverloadableOperatorRule()); 
            pushFollow(FOLLOW_ruleOverloadableOperator_in_entryRuleOverloadableOperator10946);
            iv_ruleOverloadableOperator=ruleOverloadableOperator();

            state._fsp--;

             current =iv_ruleOverloadableOperator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOverloadableOperator10957); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOverloadableOperator"


    // $ANTLR start "ruleOverloadableOperator"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3720:1: ruleOverloadableOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'new' | kw= 'delete' | (kw= 'new' kw= '[' kw= ']' ) | (kw= 'delete' kw= '[' kw= ']' ) | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= '^' | kw= '&' | kw= '|' | kw= '~' | kw= '!' | kw= '=' | kw= '<' | kw= '>' | kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' | kw= '^=' | kw= '&=' | kw= '|=' | kw= '<<' | kw= '>>' | kw= '>>=' | kw= '<<=' | kw= '==' | kw= '!=' | kw= '<=' | kw= '>=' | kw= '&&' | kw= '||' | kw= '++' | kw= '--' | kw= ',' | kw= '->*' | kw= '->' | kw= '()' | kw= '[]' ) ;
    public final AntlrDatatypeRuleToken ruleOverloadableOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3723:28: ( (kw= 'new' | kw= 'delete' | (kw= 'new' kw= '[' kw= ']' ) | (kw= 'delete' kw= '[' kw= ']' ) | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= '^' | kw= '&' | kw= '|' | kw= '~' | kw= '!' | kw= '=' | kw= '<' | kw= '>' | kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' | kw= '^=' | kw= '&=' | kw= '|=' | kw= '<<' | kw= '>>' | kw= '>>=' | kw= '<<=' | kw= '==' | kw= '!=' | kw= '<=' | kw= '>=' | kw= '&&' | kw= '||' | kw= '++' | kw= '--' | kw= ',' | kw= '->*' | kw= '->' | kw= '()' | kw= '[]' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3724:1: (kw= 'new' | kw= 'delete' | (kw= 'new' kw= '[' kw= ']' ) | (kw= 'delete' kw= '[' kw= ']' ) | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= '^' | kw= '&' | kw= '|' | kw= '~' | kw= '!' | kw= '=' | kw= '<' | kw= '>' | kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' | kw= '^=' | kw= '&=' | kw= '|=' | kw= '<<' | kw= '>>' | kw= '>>=' | kw= '<<=' | kw= '==' | kw= '!=' | kw= '<=' | kw= '>=' | kw= '&&' | kw= '||' | kw= '++' | kw= '--' | kw= ',' | kw= '->*' | kw= '->' | kw= '()' | kw= '[]' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3724:1: (kw= 'new' | kw= 'delete' | (kw= 'new' kw= '[' kw= ']' ) | (kw= 'delete' kw= '[' kw= ']' ) | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= '^' | kw= '&' | kw= '|' | kw= '~' | kw= '!' | kw= '=' | kw= '<' | kw= '>' | kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' | kw= '^=' | kw= '&=' | kw= '|=' | kw= '<<' | kw= '>>' | kw= '>>=' | kw= '<<=' | kw= '==' | kw= '!=' | kw= '<=' | kw= '>=' | kw= '&&' | kw= '||' | kw= '++' | kw= '--' | kw= ',' | kw= '->*' | kw= '->' | kw= '()' | kw= '[]' )
            int alt93=42;
            alt93 = dfa93.predict(input);
            switch (alt93) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3725:2: kw= 'new'
                    {
                    kw=(Token)match(input,92,FOLLOW_92_in_ruleOverloadableOperator10995); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getNewKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3732:2: kw= 'delete'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleOverloadableOperator11014); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getDeleteKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3738:6: (kw= 'new' kw= '[' kw= ']' )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3738:6: (kw= 'new' kw= '[' kw= ']' )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3739:2: kw= 'new' kw= '[' kw= ']'
                    {
                    kw=(Token)match(input,92,FOLLOW_92_in_ruleOverloadableOperator11034); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getNewKeyword_2_0()); 
                        
                    kw=(Token)match(input,100,FOLLOW_100_in_ruleOverloadableOperator11047); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getLeftSquareBracketKeyword_2_1()); 
                        
                    kw=(Token)match(input,101,FOLLOW_101_in_ruleOverloadableOperator11060); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getRightSquareBracketKeyword_2_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3757:6: (kw= 'delete' kw= '[' kw= ']' )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3757:6: (kw= 'delete' kw= '[' kw= ']' )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3758:2: kw= 'delete' kw= '[' kw= ']'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleOverloadableOperator11081); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getDeleteKeyword_3_0()); 
                        
                    kw=(Token)match(input,100,FOLLOW_100_in_ruleOverloadableOperator11094); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getLeftSquareBracketKeyword_3_1()); 
                        
                    kw=(Token)match(input,101,FOLLOW_101_in_ruleOverloadableOperator11107); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getRightSquareBracketKeyword_3_2()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3777:2: kw= '+'
                    {
                    kw=(Token)match(input,102,FOLLOW_102_in_ruleOverloadableOperator11127); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getPlusSignKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3784:2: kw= '-'
                    {
                    kw=(Token)match(input,103,FOLLOW_103_in_ruleOverloadableOperator11146); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getHyphenMinusKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3791:2: kw= '*'
                    {
                    kw=(Token)match(input,104,FOLLOW_104_in_ruleOverloadableOperator11165); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getAsteriskKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3798:2: kw= '/'
                    {
                    kw=(Token)match(input,105,FOLLOW_105_in_ruleOverloadableOperator11184); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getSolidusKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3805:2: kw= '%'
                    {
                    kw=(Token)match(input,106,FOLLOW_106_in_ruleOverloadableOperator11203); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getPercentSignKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3812:2: kw= '^'
                    {
                    kw=(Token)match(input,107,FOLLOW_107_in_ruleOverloadableOperator11222); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getCircumflexAccentKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3819:2: kw= '&'
                    {
                    kw=(Token)match(input,86,FOLLOW_86_in_ruleOverloadableOperator11241); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getAmpersandKeyword_10()); 
                        

                    }
                    break;
                case 12 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3826:2: kw= '|'
                    {
                    kw=(Token)match(input,108,FOLLOW_108_in_ruleOverloadableOperator11260); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getVerticalLineKeyword_11()); 
                        

                    }
                    break;
                case 13 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3833:2: kw= '~'
                    {
                    kw=(Token)match(input,109,FOLLOW_109_in_ruleOverloadableOperator11279); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getTildeKeyword_12()); 
                        

                    }
                    break;
                case 14 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3840:2: kw= '!'
                    {
                    kw=(Token)match(input,110,FOLLOW_110_in_ruleOverloadableOperator11298); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getExclamationMarkKeyword_13()); 
                        

                    }
                    break;
                case 15 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3847:2: kw= '='
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleOverloadableOperator11317); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getEqualsSignKeyword_14()); 
                        

                    }
                    break;
                case 16 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3854:2: kw= '<'
                    {
                    kw=(Token)match(input,98,FOLLOW_98_in_ruleOverloadableOperator11336); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getLessThanSignKeyword_15()); 
                        

                    }
                    break;
                case 17 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3861:2: kw= '>'
                    {
                    kw=(Token)match(input,99,FOLLOW_99_in_ruleOverloadableOperator11355); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getGreaterThanSignKeyword_16()); 
                        

                    }
                    break;
                case 18 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3868:2: kw= '+='
                    {
                    kw=(Token)match(input,111,FOLLOW_111_in_ruleOverloadableOperator11374); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getPlusSignEqualsSignKeyword_17()); 
                        

                    }
                    break;
                case 19 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3875:2: kw= '-='
                    {
                    kw=(Token)match(input,112,FOLLOW_112_in_ruleOverloadableOperator11393); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getHyphenMinusEqualsSignKeyword_18()); 
                        

                    }
                    break;
                case 20 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3882:2: kw= '*='
                    {
                    kw=(Token)match(input,113,FOLLOW_113_in_ruleOverloadableOperator11412); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getAsteriskEqualsSignKeyword_19()); 
                        

                    }
                    break;
                case 21 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3889:2: kw= '/='
                    {
                    kw=(Token)match(input,114,FOLLOW_114_in_ruleOverloadableOperator11431); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getSolidusEqualsSignKeyword_20()); 
                        

                    }
                    break;
                case 22 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3896:2: kw= '%='
                    {
                    kw=(Token)match(input,115,FOLLOW_115_in_ruleOverloadableOperator11450); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getPercentSignEqualsSignKeyword_21()); 
                        

                    }
                    break;
                case 23 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3903:2: kw= '^='
                    {
                    kw=(Token)match(input,116,FOLLOW_116_in_ruleOverloadableOperator11469); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getCircumflexAccentEqualsSignKeyword_22()); 
                        

                    }
                    break;
                case 24 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3910:2: kw= '&='
                    {
                    kw=(Token)match(input,117,FOLLOW_117_in_ruleOverloadableOperator11488); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getAmpersandEqualsSignKeyword_23()); 
                        

                    }
                    break;
                case 25 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3917:2: kw= '|='
                    {
                    kw=(Token)match(input,118,FOLLOW_118_in_ruleOverloadableOperator11507); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getVerticalLineEqualsSignKeyword_24()); 
                        

                    }
                    break;
                case 26 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3924:2: kw= '<<'
                    {
                    kw=(Token)match(input,119,FOLLOW_119_in_ruleOverloadableOperator11526); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getLessThanSignLessThanSignKeyword_25()); 
                        

                    }
                    break;
                case 27 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3931:2: kw= '>>'
                    {
                    kw=(Token)match(input,120,FOLLOW_120_in_ruleOverloadableOperator11545); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getGreaterThanSignGreaterThanSignKeyword_26()); 
                        

                    }
                    break;
                case 28 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3938:2: kw= '>>='
                    {
                    kw=(Token)match(input,121,FOLLOW_121_in_ruleOverloadableOperator11564); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getGreaterThanSignGreaterThanSignEqualsSignKeyword_27()); 
                        

                    }
                    break;
                case 29 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3945:2: kw= '<<='
                    {
                    kw=(Token)match(input,122,FOLLOW_122_in_ruleOverloadableOperator11583); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getLessThanSignLessThanSignEqualsSignKeyword_28()); 
                        

                    }
                    break;
                case 30 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3952:2: kw= '=='
                    {
                    kw=(Token)match(input,123,FOLLOW_123_in_ruleOverloadableOperator11602); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getEqualsSignEqualsSignKeyword_29()); 
                        

                    }
                    break;
                case 31 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3959:2: kw= '!='
                    {
                    kw=(Token)match(input,124,FOLLOW_124_in_ruleOverloadableOperator11621); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getExclamationMarkEqualsSignKeyword_30()); 
                        

                    }
                    break;
                case 32 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3966:2: kw= '<='
                    {
                    kw=(Token)match(input,125,FOLLOW_125_in_ruleOverloadableOperator11640); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getLessThanSignEqualsSignKeyword_31()); 
                        

                    }
                    break;
                case 33 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3973:2: kw= '>='
                    {
                    kw=(Token)match(input,126,FOLLOW_126_in_ruleOverloadableOperator11659); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getGreaterThanSignEqualsSignKeyword_32()); 
                        

                    }
                    break;
                case 34 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3980:2: kw= '&&'
                    {
                    kw=(Token)match(input,87,FOLLOW_87_in_ruleOverloadableOperator11678); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getAmpersandAmpersandKeyword_33()); 
                        

                    }
                    break;
                case 35 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3987:2: kw= '||'
                    {
                    kw=(Token)match(input,127,FOLLOW_127_in_ruleOverloadableOperator11697); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getVerticalLineVerticalLineKeyword_34()); 
                        

                    }
                    break;
                case 36 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3994:2: kw= '++'
                    {
                    kw=(Token)match(input,128,FOLLOW_128_in_ruleOverloadableOperator11716); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getPlusSignPlusSignKeyword_35()); 
                        

                    }
                    break;
                case 37 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4001:2: kw= '--'
                    {
                    kw=(Token)match(input,129,FOLLOW_129_in_ruleOverloadableOperator11735); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getHyphenMinusHyphenMinusKeyword_36()); 
                        

                    }
                    break;
                case 38 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4008:2: kw= ','
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleOverloadableOperator11754); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getCommaKeyword_37()); 
                        

                    }
                    break;
                case 39 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4015:2: kw= '->*'
                    {
                    kw=(Token)match(input,130,FOLLOW_130_in_ruleOverloadableOperator11773); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getHyphenMinusGreaterThanSignAsteriskKeyword_38()); 
                        

                    }
                    break;
                case 40 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4022:2: kw= '->'
                    {
                    kw=(Token)match(input,131,FOLLOW_131_in_ruleOverloadableOperator11792); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getHyphenMinusGreaterThanSignKeyword_39()); 
                        

                    }
                    break;
                case 41 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4029:2: kw= '()'
                    {
                    kw=(Token)match(input,132,FOLLOW_132_in_ruleOverloadableOperator11811); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getLeftParenthesisRightParenthesisKeyword_40()); 
                        

                    }
                    break;
                case 42 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4036:2: kw= '[]'
                    {
                    kw=(Token)match(input,133,FOLLOW_133_in_ruleOverloadableOperator11830); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getLeftSquareBracketRightSquareBracketKeyword_41()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOverloadableOperator"


    // $ANTLR start "entryRuleLiteralOperatorId"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4049:1: entryRuleLiteralOperatorId returns [String current=null] : iv_ruleLiteralOperatorId= ruleLiteralOperatorId EOF ;
    public final String entryRuleLiteralOperatorId() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteralOperatorId = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4050:2: (iv_ruleLiteralOperatorId= ruleLiteralOperatorId EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4051:2: iv_ruleLiteralOperatorId= ruleLiteralOperatorId EOF
            {
             newCompositeNode(grammarAccess.getLiteralOperatorIdRule()); 
            pushFollow(FOLLOW_ruleLiteralOperatorId_in_entryRuleLiteralOperatorId11871);
            iv_ruleLiteralOperatorId=ruleLiteralOperatorId();

            state._fsp--;

             current =iv_ruleLiteralOperatorId.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralOperatorId11882); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteralOperatorId"


    // $ANTLR start "ruleLiteralOperatorId"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4058:1: ruleLiteralOperatorId returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'operator' kw= '\"' kw= '\"' ) ;
    public final AntlrDatatypeRuleToken ruleLiteralOperatorId() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4061:28: ( (kw= 'operator' kw= '\"' kw= '\"' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4062:1: (kw= 'operator' kw= '\"' kw= '\"' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4062:1: (kw= 'operator' kw= '\"' kw= '\"' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4063:2: kw= 'operator' kw= '\"' kw= '\"'
            {
            kw=(Token)match(input,97,FOLLOW_97_in_ruleLiteralOperatorId11920); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getLiteralOperatorIdAccess().getOperatorKeyword_0()); 
                
            kw=(Token)match(input,134,FOLLOW_134_in_ruleLiteralOperatorId11933); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getLiteralOperatorIdAccess().getQuotationMarkKeyword_1()); 
                
            kw=(Token)match(input,134,FOLLOW_134_in_ruleLiteralOperatorId11946); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getLiteralOperatorIdAccess().getQuotationMarkKeyword_2()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteralOperatorId"


    // $ANTLR start "entryRuleTemplateDeclaration"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4088:1: entryRuleTemplateDeclaration returns [String current=null] : iv_ruleTemplateDeclaration= ruleTemplateDeclaration EOF ;
    public final String entryRuleTemplateDeclaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTemplateDeclaration = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4089:2: (iv_ruleTemplateDeclaration= ruleTemplateDeclaration EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4090:2: iv_ruleTemplateDeclaration= ruleTemplateDeclaration EOF
            {
             newCompositeNode(grammarAccess.getTemplateDeclarationRule()); 
            pushFollow(FOLLOW_ruleTemplateDeclaration_in_entryRuleTemplateDeclaration11987);
            iv_ruleTemplateDeclaration=ruleTemplateDeclaration();

            state._fsp--;

             current =iv_ruleTemplateDeclaration.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateDeclaration11998); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTemplateDeclaration"


    // $ANTLR start "ruleTemplateDeclaration"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4097:1: ruleTemplateDeclaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'template' kw= '<' this_TemplateParameterList_2= ruleTemplateParameterList kw= '>' ) ;
    public final AntlrDatatypeRuleToken ruleTemplateDeclaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_TemplateParameterList_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4100:28: ( (kw= 'template' kw= '<' this_TemplateParameterList_2= ruleTemplateParameterList kw= '>' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4101:1: (kw= 'template' kw= '<' this_TemplateParameterList_2= ruleTemplateParameterList kw= '>' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4101:1: (kw= 'template' kw= '<' this_TemplateParameterList_2= ruleTemplateParameterList kw= '>' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4102:2: kw= 'template' kw= '<' this_TemplateParameterList_2= ruleTemplateParameterList kw= '>'
            {
            kw=(Token)match(input,59,FOLLOW_59_in_ruleTemplateDeclaration12036); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getTemplateDeclarationAccess().getTemplateKeyword_0()); 
                
            kw=(Token)match(input,98,FOLLOW_98_in_ruleTemplateDeclaration12049); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getTemplateDeclarationAccess().getLessThanSignKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getTemplateDeclarationAccess().getTemplateParameterListParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleTemplateParameterList_in_ruleTemplateDeclaration12071);
            this_TemplateParameterList_2=ruleTemplateParameterList();

            state._fsp--;


            		current.merge(this_TemplateParameterList_2);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,99,FOLLOW_99_in_ruleTemplateDeclaration12089); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getTemplateDeclarationAccess().getGreaterThanSignKeyword_3()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTemplateDeclaration"


    // $ANTLR start "entryRuleTemplateParameterList"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4138:1: entryRuleTemplateParameterList returns [String current=null] : iv_ruleTemplateParameterList= ruleTemplateParameterList EOF ;
    public final String entryRuleTemplateParameterList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTemplateParameterList = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4139:2: (iv_ruleTemplateParameterList= ruleTemplateParameterList EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4140:2: iv_ruleTemplateParameterList= ruleTemplateParameterList EOF
            {
             newCompositeNode(grammarAccess.getTemplateParameterListRule()); 
            pushFollow(FOLLOW_ruleTemplateParameterList_in_entryRuleTemplateParameterList12130);
            iv_ruleTemplateParameterList=ruleTemplateParameterList();

            state._fsp--;

             current =iv_ruleTemplateParameterList.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateParameterList12141); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTemplateParameterList"


    // $ANTLR start "ruleTemplateParameterList"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4147:1: ruleTemplateParameterList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TemplateParameter_0= ruleTemplateParameter (kw= ',' this_TemplateParameter_2= ruleTemplateParameter )* ) ;
    public final AntlrDatatypeRuleToken ruleTemplateParameterList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_TemplateParameter_0 = null;

        AntlrDatatypeRuleToken this_TemplateParameter_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4150:28: ( (this_TemplateParameter_0= ruleTemplateParameter (kw= ',' this_TemplateParameter_2= ruleTemplateParameter )* ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4151:1: (this_TemplateParameter_0= ruleTemplateParameter (kw= ',' this_TemplateParameter_2= ruleTemplateParameter )* )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4151:1: (this_TemplateParameter_0= ruleTemplateParameter (kw= ',' this_TemplateParameter_2= ruleTemplateParameter )* )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4152:5: this_TemplateParameter_0= ruleTemplateParameter (kw= ',' this_TemplateParameter_2= ruleTemplateParameter )*
            {
             
                    newCompositeNode(grammarAccess.getTemplateParameterListAccess().getTemplateParameterParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleTemplateParameter_in_ruleTemplateParameterList12188);
            this_TemplateParameter_0=ruleTemplateParameter();

            state._fsp--;


            		current.merge(this_TemplateParameter_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4162:1: (kw= ',' this_TemplateParameter_2= ruleTemplateParameter )*
            loop94:
            do {
                int alt94=2;
                int LA94_0 = input.LA(1);

                if ( (LA94_0==45) ) {
                    alt94=1;
                }


                switch (alt94) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4163:2: kw= ',' this_TemplateParameter_2= ruleTemplateParameter
            	    {
            	    kw=(Token)match(input,45,FOLLOW_45_in_ruleTemplateParameterList12207); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getTemplateParameterListAccess().getCommaKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getTemplateParameterListAccess().getTemplateParameterParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_ruleTemplateParameter_in_ruleTemplateParameterList12229);
            	    this_TemplateParameter_2=ruleTemplateParameter();

            	    state._fsp--;


            	    		current.merge(this_TemplateParameter_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop94;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTemplateParameterList"


    // $ANTLR start "entryRuleTemplateParameter"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4187:1: entryRuleTemplateParameter returns [String current=null] : iv_ruleTemplateParameter= ruleTemplateParameter EOF ;
    public final String entryRuleTemplateParameter() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTemplateParameter = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4188:2: (iv_ruleTemplateParameter= ruleTemplateParameter EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4189:2: iv_ruleTemplateParameter= ruleTemplateParameter EOF
            {
             newCompositeNode(grammarAccess.getTemplateParameterRule()); 
            pushFollow(FOLLOW_ruleTemplateParameter_in_entryRuleTemplateParameter12277);
            iv_ruleTemplateParameter=ruleTemplateParameter();

            state._fsp--;

             current =iv_ruleTemplateParameter.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateParameter12288); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTemplateParameter"


    // $ANTLR start "ruleTemplateParameter"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4196:1: ruleTemplateParameter returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TypeParameter_0= ruleTypeParameter | this_ParameterDeclaration_1= ruleParameterDeclaration ) ;
    public final AntlrDatatypeRuleToken ruleTemplateParameter() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_TypeParameter_0 = null;

        AntlrDatatypeRuleToken this_ParameterDeclaration_1 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4199:28: ( (this_TypeParameter_0= ruleTypeParameter | this_ParameterDeclaration_1= ruleParameterDeclaration ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4200:1: (this_TypeParameter_0= ruleTypeParameter | this_ParameterDeclaration_1= ruleParameterDeclaration )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4200:1: (this_TypeParameter_0= ruleTypeParameter | this_ParameterDeclaration_1= ruleParameterDeclaration )
            int alt95=2;
            switch ( input.LA(1) ) {
            case 78:
                {
                switch ( input.LA(2) ) {
                case 75:
                case 80:
                case 145:
                    {
                    alt95=2;
                    }
                    break;
                case RULE_ID:
                    {
                    int LA95_4 = input.LA(3);

                    if ( (LA95_4==EOF||LA95_4==39||LA95_4==45||LA95_4==99) ) {
                        alt95=1;
                    }
                    else if ( (LA95_4==57||LA95_4==75||LA95_4==80||LA95_4==89||LA95_4==98) ) {
                        alt95=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 95, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case 39:
                case 45:
                case 88:
                case 99:
                    {
                    alt95=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 95, 1, input);

                    throw nvae;
                }

                }
                break;
            case 82:
                {
                int LA95_2 = input.LA(2);

                if ( (LA95_2==EOF||LA95_2==RULE_ID||LA95_2==39||LA95_2==45||LA95_2==88||LA95_2==99) ) {
                    alt95=1;
                }
                else if ( (LA95_2==58||LA95_2==145) ) {
                    alt95=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 95, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 77:
            case 79:
            case 90:
            case 142:
            case 145:
                {
                alt95=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }

            switch (alt95) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4201:5: this_TypeParameter_0= ruleTypeParameter
                    {
                     
                            newCompositeNode(grammarAccess.getTemplateParameterAccess().getTypeParameterParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleTypeParameter_in_ruleTemplateParameter12335);
                    this_TypeParameter_0=ruleTypeParameter();

                    state._fsp--;


                    		current.merge(this_TypeParameter_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4213:5: this_ParameterDeclaration_1= ruleParameterDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getTemplateParameterAccess().getParameterDeclarationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleParameterDeclaration_in_ruleTemplateParameter12368);
                    this_ParameterDeclaration_1=ruleParameterDeclaration();

                    state._fsp--;


                    		current.merge(this_ParameterDeclaration_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTemplateParameter"


    // $ANTLR start "entryRuleTypeParameter"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4231:1: entryRuleTypeParameter returns [String current=null] : iv_ruleTypeParameter= ruleTypeParameter EOF ;
    public final String entryRuleTypeParameter() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeParameter = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4232:2: (iv_ruleTypeParameter= ruleTypeParameter EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4233:2: iv_ruleTypeParameter= ruleTypeParameter EOF
            {
             newCompositeNode(grammarAccess.getTypeParameterRule()); 
            pushFollow(FOLLOW_ruleTypeParameter_in_entryRuleTypeParameter12414);
            iv_ruleTypeParameter=ruleTypeParameter();

            state._fsp--;

             current =iv_ruleTypeParameter.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeParameter12425); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeParameter"


    // $ANTLR start "ruleTypeParameter"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4240:1: ruleTypeParameter returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'class' | kw= 'typename' ) ( ( (kw= '...' )? (this_ID_3= RULE_ID )? ) | ( (this_ID_4= RULE_ID )? kw= '=' this_TypeId_6= ruleTypeId ) ) ) ;
    public final AntlrDatatypeRuleToken ruleTypeParameter() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_3=null;
        Token this_ID_4=null;
        AntlrDatatypeRuleToken this_TypeId_6 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4243:28: ( ( (kw= 'class' | kw= 'typename' ) ( ( (kw= '...' )? (this_ID_3= RULE_ID )? ) | ( (this_ID_4= RULE_ID )? kw= '=' this_TypeId_6= ruleTypeId ) ) ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4244:1: ( (kw= 'class' | kw= 'typename' ) ( ( (kw= '...' )? (this_ID_3= RULE_ID )? ) | ( (this_ID_4= RULE_ID )? kw= '=' this_TypeId_6= ruleTypeId ) ) )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4244:1: ( (kw= 'class' | kw= 'typename' ) ( ( (kw= '...' )? (this_ID_3= RULE_ID )? ) | ( (this_ID_4= RULE_ID )? kw= '=' this_TypeId_6= ruleTypeId ) ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4244:2: (kw= 'class' | kw= 'typename' ) ( ( (kw= '...' )? (this_ID_3= RULE_ID )? ) | ( (this_ID_4= RULE_ID )? kw= '=' this_TypeId_6= ruleTypeId ) )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4244:2: (kw= 'class' | kw= 'typename' )
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==78) ) {
                alt96=1;
            }
            else if ( (LA96_0==82) ) {
                alt96=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }
            switch (alt96) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4245:2: kw= 'class'
                    {
                    kw=(Token)match(input,78,FOLLOW_78_in_ruleTypeParameter12464); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeParameterAccess().getClassKeyword_0_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4252:2: kw= 'typename'
                    {
                    kw=(Token)match(input,82,FOLLOW_82_in_ruleTypeParameter12483); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeParameterAccess().getTypenameKeyword_0_1()); 
                        

                    }
                    break;

            }

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4257:2: ( ( (kw= '...' )? (this_ID_3= RULE_ID )? ) | ( (this_ID_4= RULE_ID )? kw= '=' this_TypeId_6= ruleTypeId ) )
            int alt100=2;
            switch ( input.LA(1) ) {
            case EOF:
            case 45:
            case 88:
            case 99:
                {
                alt100=1;
                }
                break;
            case RULE_ID:
                {
                int LA100_2 = input.LA(2);

                if ( (LA100_2==39) ) {
                    alt100=2;
                }
                else if ( (LA100_2==EOF||LA100_2==45||LA100_2==99) ) {
                    alt100=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 100, 2, input);

                    throw nvae;
                }
                }
                break;
            case 39:
                {
                alt100=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;
            }

            switch (alt100) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4257:3: ( (kw= '...' )? (this_ID_3= RULE_ID )? )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4257:3: ( (kw= '...' )? (this_ID_3= RULE_ID )? )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4257:4: (kw= '...' )? (this_ID_3= RULE_ID )?
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4257:4: (kw= '...' )?
                    int alt97=2;
                    int LA97_0 = input.LA(1);

                    if ( (LA97_0==88) ) {
                        alt97=1;
                    }
                    switch (alt97) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4258:2: kw= '...'
                            {
                            kw=(Token)match(input,88,FOLLOW_88_in_ruleTypeParameter12500); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getTypeParameterAccess().getFullStopFullStopFullStopKeyword_1_0_0()); 
                                

                            }
                            break;

                    }

                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4263:3: (this_ID_3= RULE_ID )?
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==RULE_ID) ) {
                        alt98=1;
                    }
                    switch (alt98) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4263:8: this_ID_3= RULE_ID
                            {
                            this_ID_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeParameter12518); 

                            		current.merge(this_ID_3);
                                
                             
                                newLeafNode(this_ID_3, grammarAccess.getTypeParameterAccess().getIDTerminalRuleCall_1_0_1()); 
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4271:6: ( (this_ID_4= RULE_ID )? kw= '=' this_TypeId_6= ruleTypeId )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4271:6: ( (this_ID_4= RULE_ID )? kw= '=' this_TypeId_6= ruleTypeId )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4271:7: (this_ID_4= RULE_ID )? kw= '=' this_TypeId_6= ruleTypeId
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4271:7: (this_ID_4= RULE_ID )?
                    int alt99=2;
                    int LA99_0 = input.LA(1);

                    if ( (LA99_0==RULE_ID) ) {
                        alt99=1;
                    }
                    switch (alt99) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4271:12: this_ID_4= RULE_ID
                            {
                            this_ID_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeParameter12549); 

                            		current.merge(this_ID_4);
                                
                             
                                newLeafNode(this_ID_4, grammarAccess.getTypeParameterAccess().getIDTerminalRuleCall_1_1_0()); 
                                

                            }
                            break;

                    }

                    kw=(Token)match(input,39,FOLLOW_39_in_ruleTypeParameter12569); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeParameterAccess().getEqualsSignKeyword_1_1_1()); 
                        
                     
                            newCompositeNode(grammarAccess.getTypeParameterAccess().getTypeIdParserRuleCall_1_1_2()); 
                        
                    pushFollow(FOLLOW_ruleTypeId_in_ruleTypeParameter12591);
                    this_TypeId_6=ruleTypeId();

                    state._fsp--;


                    		current.merge(this_TypeId_6);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeParameter"


    // $ANTLR start "entryRuleSimpleTemplateId"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4303:1: entryRuleSimpleTemplateId returns [String current=null] : iv_ruleSimpleTemplateId= ruleSimpleTemplateId EOF ;
    public final String entryRuleSimpleTemplateId() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSimpleTemplateId = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4304:2: (iv_ruleSimpleTemplateId= ruleSimpleTemplateId EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4305:2: iv_ruleSimpleTemplateId= ruleSimpleTemplateId EOF
            {
             newCompositeNode(grammarAccess.getSimpleTemplateIdRule()); 
            pushFollow(FOLLOW_ruleSimpleTemplateId_in_entryRuleSimpleTemplateId12639);
            iv_ruleSimpleTemplateId=ruleSimpleTemplateId();

            state._fsp--;

             current =iv_ruleSimpleTemplateId.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleTemplateId12650); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleTemplateId"


    // $ANTLR start "ruleSimpleTemplateId"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4312:1: ruleSimpleTemplateId returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID kw= '<' this_TemplateArgumentList_2= ruleTemplateArgumentList kw= '>' ) ;
    public final AntlrDatatypeRuleToken ruleSimpleTemplateId() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_TemplateArgumentList_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4315:28: ( (this_ID_0= RULE_ID kw= '<' this_TemplateArgumentList_2= ruleTemplateArgumentList kw= '>' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4316:1: (this_ID_0= RULE_ID kw= '<' this_TemplateArgumentList_2= ruleTemplateArgumentList kw= '>' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4316:1: (this_ID_0= RULE_ID kw= '<' this_TemplateArgumentList_2= ruleTemplateArgumentList kw= '>' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4316:6: this_ID_0= RULE_ID kw= '<' this_TemplateArgumentList_2= ruleTemplateArgumentList kw= '>'
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSimpleTemplateId12690); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getSimpleTemplateIdAccess().getIDTerminalRuleCall_0()); 
                
            kw=(Token)match(input,98,FOLLOW_98_in_ruleSimpleTemplateId12708); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getSimpleTemplateIdAccess().getLessThanSignKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getSimpleTemplateIdAccess().getTemplateArgumentListParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleTemplateArgumentList_in_ruleSimpleTemplateId12730);
            this_TemplateArgumentList_2=ruleTemplateArgumentList();

            state._fsp--;


            		current.merge(this_TemplateArgumentList_2);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,99,FOLLOW_99_in_ruleSimpleTemplateId12748); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getSimpleTemplateIdAccess().getGreaterThanSignKeyword_3()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleTemplateId"


    // $ANTLR start "entryRuleTemplateArgumentList"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4356:1: entryRuleTemplateArgumentList returns [String current=null] : iv_ruleTemplateArgumentList= ruleTemplateArgumentList EOF ;
    public final String entryRuleTemplateArgumentList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTemplateArgumentList = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4357:2: (iv_ruleTemplateArgumentList= ruleTemplateArgumentList EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4358:2: iv_ruleTemplateArgumentList= ruleTemplateArgumentList EOF
            {
             newCompositeNode(grammarAccess.getTemplateArgumentListRule()); 
            pushFollow(FOLLOW_ruleTemplateArgumentList_in_entryRuleTemplateArgumentList12791);
            iv_ruleTemplateArgumentList=ruleTemplateArgumentList();

            state._fsp--;

             current =iv_ruleTemplateArgumentList.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateArgumentList12802); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTemplateArgumentList"


    // $ANTLR start "ruleTemplateArgumentList"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4365:1: ruleTemplateArgumentList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TemplateArgument_0= ruleTemplateArgument (kw= '...' )? (kw= ',' this_TemplateArgument_3= ruleTemplateArgument (kw= '...' )? )* ) ;
    public final AntlrDatatypeRuleToken ruleTemplateArgumentList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_TemplateArgument_0 = null;

        AntlrDatatypeRuleToken this_TemplateArgument_3 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4368:28: ( (this_TemplateArgument_0= ruleTemplateArgument (kw= '...' )? (kw= ',' this_TemplateArgument_3= ruleTemplateArgument (kw= '...' )? )* ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4369:1: (this_TemplateArgument_0= ruleTemplateArgument (kw= '...' )? (kw= ',' this_TemplateArgument_3= ruleTemplateArgument (kw= '...' )? )* )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4369:1: (this_TemplateArgument_0= ruleTemplateArgument (kw= '...' )? (kw= ',' this_TemplateArgument_3= ruleTemplateArgument (kw= '...' )? )* )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4370:5: this_TemplateArgument_0= ruleTemplateArgument (kw= '...' )? (kw= ',' this_TemplateArgument_3= ruleTemplateArgument (kw= '...' )? )*
            {
             
                    newCompositeNode(grammarAccess.getTemplateArgumentListAccess().getTemplateArgumentParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleTemplateArgument_in_ruleTemplateArgumentList12849);
            this_TemplateArgument_0=ruleTemplateArgument();

            state._fsp--;


            		current.merge(this_TemplateArgument_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4380:1: (kw= '...' )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==88) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4381:2: kw= '...'
                    {
                    kw=(Token)match(input,88,FOLLOW_88_in_ruleTemplateArgumentList12868); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTemplateArgumentListAccess().getFullStopFullStopFullStopKeyword_1()); 
                        

                    }
                    break;

            }

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4386:3: (kw= ',' this_TemplateArgument_3= ruleTemplateArgument (kw= '...' )? )*
            loop103:
            do {
                int alt103=2;
                int LA103_0 = input.LA(1);

                if ( (LA103_0==45) ) {
                    alt103=1;
                }


                switch (alt103) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4387:2: kw= ',' this_TemplateArgument_3= ruleTemplateArgument (kw= '...' )?
            	    {
            	    kw=(Token)match(input,45,FOLLOW_45_in_ruleTemplateArgumentList12884); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getTemplateArgumentListAccess().getCommaKeyword_2_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getTemplateArgumentListAccess().getTemplateArgumentParserRuleCall_2_1()); 
            	        
            	    pushFollow(FOLLOW_ruleTemplateArgument_in_ruleTemplateArgumentList12906);
            	    this_TemplateArgument_3=ruleTemplateArgument();

            	    state._fsp--;


            	    		current.merge(this_TemplateArgument_3);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4403:1: (kw= '...' )?
            	    int alt102=2;
            	    int LA102_0 = input.LA(1);

            	    if ( (LA102_0==88) ) {
            	        alt102=1;
            	    }
            	    switch (alt102) {
            	        case 1 :
            	            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4404:2: kw= '...'
            	            {
            	            kw=(Token)match(input,88,FOLLOW_88_in_ruleTemplateArgumentList12925); 

            	                    current.merge(kw);
            	                    newLeafNode(kw, grammarAccess.getTemplateArgumentListAccess().getFullStopFullStopFullStopKeyword_2_2()); 
            	                

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop103;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTemplateArgumentList"


    // $ANTLR start "entryRuleTemplateArgument"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4417:1: entryRuleTemplateArgument returns [String current=null] : iv_ruleTemplateArgument= ruleTemplateArgument EOF ;
    public final String entryRuleTemplateArgument() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTemplateArgument = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4418:2: (iv_ruleTemplateArgument= ruleTemplateArgument EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4419:2: iv_ruleTemplateArgument= ruleTemplateArgument EOF
            {
             newCompositeNode(grammarAccess.getTemplateArgumentRule()); 
            pushFollow(FOLLOW_ruleTemplateArgument_in_entryRuleTemplateArgument12970);
            iv_ruleTemplateArgument=ruleTemplateArgument();

            state._fsp--;

             current =iv_ruleTemplateArgument.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateArgument12981); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTemplateArgument"


    // $ANTLR start "ruleTemplateArgument"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4426:1: ruleTemplateArgument returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ConstantExpression_0= ruleConstantExpression | this_TypeId_1= ruleTypeId | this_IdExpression_2= ruleIdExpression ) ;
    public final AntlrDatatypeRuleToken ruleTemplateArgument() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_ConstantExpression_0 = null;

        AntlrDatatypeRuleToken this_TypeId_1 = null;

        AntlrDatatypeRuleToken this_IdExpression_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4429:28: ( (this_ConstantExpression_0= ruleConstantExpression | this_TypeId_1= ruleTypeId | this_IdExpression_2= ruleIdExpression ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4430:1: (this_ConstantExpression_0= ruleConstantExpression | this_TypeId_1= ruleTypeId | this_IdExpression_2= ruleIdExpression )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4430:1: (this_ConstantExpression_0= ruleConstantExpression | this_TypeId_1= ruleTypeId | this_IdExpression_2= ruleIdExpression )
            int alt104=3;
            switch ( input.LA(1) ) {
            case 143:
                {
                alt104=1;
                }
                break;
            case RULE_ID:
            case 58:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 77:
            case 78:
            case 79:
            case 82:
            case 90:
            case 142:
            case 145:
                {
                alt104=2;
                }
                break;
            case 144:
                {
                alt104=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 104, 0, input);

                throw nvae;
            }

            switch (alt104) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4431:5: this_ConstantExpression_0= ruleConstantExpression
                    {
                     
                            newCompositeNode(grammarAccess.getTemplateArgumentAccess().getConstantExpressionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleConstantExpression_in_ruleTemplateArgument13028);
                    this_ConstantExpression_0=ruleConstantExpression();

                    state._fsp--;


                    		current.merge(this_ConstantExpression_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4443:5: this_TypeId_1= ruleTypeId
                    {
                     
                            newCompositeNode(grammarAccess.getTemplateArgumentAccess().getTypeIdParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleTypeId_in_ruleTemplateArgument13061);
                    this_TypeId_1=ruleTypeId();

                    state._fsp--;


                    		current.merge(this_TypeId_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4455:5: this_IdExpression_2= ruleIdExpression
                    {
                     
                            newCompositeNode(grammarAccess.getTemplateArgumentAccess().getIdExpressionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleIdExpression_in_ruleTemplateArgument13094);
                    this_IdExpression_2=ruleIdExpression();

                    state._fsp--;


                    		current.merge(this_IdExpression_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTemplateArgument"


    // $ANTLR start "entryRuleTypenameSpecifier"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4473:1: entryRuleTypenameSpecifier returns [String current=null] : iv_ruleTypenameSpecifier= ruleTypenameSpecifier EOF ;
    public final String entryRuleTypenameSpecifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypenameSpecifier = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4474:2: (iv_ruleTypenameSpecifier= ruleTypenameSpecifier EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4475:2: iv_ruleTypenameSpecifier= ruleTypenameSpecifier EOF
            {
             newCompositeNode(grammarAccess.getTypenameSpecifierRule()); 
            pushFollow(FOLLOW_ruleTypenameSpecifier_in_entryRuleTypenameSpecifier13140);
            iv_ruleTypenameSpecifier=ruleTypenameSpecifier();

            state._fsp--;

             current =iv_ruleTypenameSpecifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypenameSpecifier13151); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypenameSpecifier"


    // $ANTLR start "ruleTypenameSpecifier"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4482:1: ruleTypenameSpecifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'typename' (kw= '::' )? this_NestedNameSpecifier_2= ruleNestedNameSpecifier (this_ID_3= RULE_ID | ( (kw= 'template' )? this_ID_5= RULE_ID kw= '<' this_TemplateArgumentList_7= ruleTemplateArgumentList kw= '>' ) ) ) ;
    public final AntlrDatatypeRuleToken ruleTypenameSpecifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_3=null;
        Token this_ID_5=null;
        AntlrDatatypeRuleToken this_NestedNameSpecifier_2 = null;

        AntlrDatatypeRuleToken this_TemplateArgumentList_7 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4485:28: ( (kw= 'typename' (kw= '::' )? this_NestedNameSpecifier_2= ruleNestedNameSpecifier (this_ID_3= RULE_ID | ( (kw= 'template' )? this_ID_5= RULE_ID kw= '<' this_TemplateArgumentList_7= ruleTemplateArgumentList kw= '>' ) ) ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4486:1: (kw= 'typename' (kw= '::' )? this_NestedNameSpecifier_2= ruleNestedNameSpecifier (this_ID_3= RULE_ID | ( (kw= 'template' )? this_ID_5= RULE_ID kw= '<' this_TemplateArgumentList_7= ruleTemplateArgumentList kw= '>' ) ) )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4486:1: (kw= 'typename' (kw= '::' )? this_NestedNameSpecifier_2= ruleNestedNameSpecifier (this_ID_3= RULE_ID | ( (kw= 'template' )? this_ID_5= RULE_ID kw= '<' this_TemplateArgumentList_7= ruleTemplateArgumentList kw= '>' ) ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4487:2: kw= 'typename' (kw= '::' )? this_NestedNameSpecifier_2= ruleNestedNameSpecifier (this_ID_3= RULE_ID | ( (kw= 'template' )? this_ID_5= RULE_ID kw= '<' this_TemplateArgumentList_7= ruleTemplateArgumentList kw= '>' ) )
            {
            kw=(Token)match(input,82,FOLLOW_82_in_ruleTypenameSpecifier13189); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getTypenameSpecifierAccess().getTypenameKeyword_0()); 
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4492:1: (kw= '::' )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==58) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4493:2: kw= '::'
                    {
                    kw=(Token)match(input,58,FOLLOW_58_in_ruleTypenameSpecifier13203); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypenameSpecifierAccess().getColonColonKeyword_1()); 
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getTypenameSpecifierAccess().getNestedNameSpecifierParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleNestedNameSpecifier_in_ruleTypenameSpecifier13227);
            this_NestedNameSpecifier_2=ruleNestedNameSpecifier();

            state._fsp--;


            		current.merge(this_NestedNameSpecifier_2);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4509:1: (this_ID_3= RULE_ID | ( (kw= 'template' )? this_ID_5= RULE_ID kw= '<' this_TemplateArgumentList_7= ruleTemplateArgumentList kw= '>' ) )
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==RULE_ID) ) {
                int LA107_1 = input.LA(2);

                if ( (LA107_1==EOF||LA107_1==RULE_ID||LA107_1==40||(LA107_1>=45 && LA107_1<=58)||(LA107_1>=60 && LA107_1<=75)||(LA107_1>=77 && LA107_1<=79)||LA107_1==82||LA107_1==88||LA107_1==90||LA107_1==99||(LA107_1>=142 && LA107_1<=145)) ) {
                    alt107=1;
                }
                else if ( (LA107_1==98) ) {
                    alt107=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 107, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA107_0==59) ) {
                alt107=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 107, 0, input);

                throw nvae;
            }
            switch (alt107) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4509:6: this_ID_3= RULE_ID
                    {
                    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypenameSpecifier13248); 

                    		current.merge(this_ID_3);
                        
                     
                        newLeafNode(this_ID_3, grammarAccess.getTypenameSpecifierAccess().getIDTerminalRuleCall_3_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4517:6: ( (kw= 'template' )? this_ID_5= RULE_ID kw= '<' this_TemplateArgumentList_7= ruleTemplateArgumentList kw= '>' )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4517:6: ( (kw= 'template' )? this_ID_5= RULE_ID kw= '<' this_TemplateArgumentList_7= ruleTemplateArgumentList kw= '>' )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4517:7: (kw= 'template' )? this_ID_5= RULE_ID kw= '<' this_TemplateArgumentList_7= ruleTemplateArgumentList kw= '>'
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4517:7: (kw= 'template' )?
                    int alt106=2;
                    int LA106_0 = input.LA(1);

                    if ( (LA106_0==59) ) {
                        alt106=1;
                    }
                    switch (alt106) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4518:2: kw= 'template'
                            {
                            kw=(Token)match(input,59,FOLLOW_59_in_ruleTypenameSpecifier13274); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getTypenameSpecifierAccess().getTemplateKeyword_3_1_0()); 
                                

                            }
                            break;

                    }

                    this_ID_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypenameSpecifier13291); 

                    		current.merge(this_ID_5);
                        
                     
                        newLeafNode(this_ID_5, grammarAccess.getTypenameSpecifierAccess().getIDTerminalRuleCall_3_1_1()); 
                        
                    kw=(Token)match(input,98,FOLLOW_98_in_ruleTypenameSpecifier13309); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypenameSpecifierAccess().getLessThanSignKeyword_3_1_2()); 
                        
                     
                            newCompositeNode(grammarAccess.getTypenameSpecifierAccess().getTemplateArgumentListParserRuleCall_3_1_3()); 
                        
                    pushFollow(FOLLOW_ruleTemplateArgumentList_in_ruleTypenameSpecifier13331);
                    this_TemplateArgumentList_7=ruleTemplateArgumentList();

                    state._fsp--;


                    		current.merge(this_TemplateArgumentList_7);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,99,FOLLOW_99_in_ruleTypenameSpecifier13349); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypenameSpecifierAccess().getGreaterThanSignKeyword_3_1_4()); 
                        

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypenameSpecifier"


    // $ANTLR start "entryRuleFunctionTryBlock"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4563:1: entryRuleFunctionTryBlock returns [String current=null] : iv_ruleFunctionTryBlock= ruleFunctionTryBlock EOF ;
    public final String entryRuleFunctionTryBlock() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunctionTryBlock = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4564:2: (iv_ruleFunctionTryBlock= ruleFunctionTryBlock EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4565:2: iv_ruleFunctionTryBlock= ruleFunctionTryBlock EOF
            {
             newCompositeNode(grammarAccess.getFunctionTryBlockRule()); 
            pushFollow(FOLLOW_ruleFunctionTryBlock_in_entryRuleFunctionTryBlock13394);
            iv_ruleFunctionTryBlock=ruleFunctionTryBlock();

            state._fsp--;

             current =iv_ruleFunctionTryBlock.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionTryBlock13405); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionTryBlock"


    // $ANTLR start "ruleFunctionTryBlock"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4572:1: ruleFunctionTryBlock returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'try' (this_CtorInitializer_1= ruleCtorInitializer )? this_CompoundStatement_2= ruleCompoundStatement (this_Handler_3= ruleHandler )+ ) ;
    public final AntlrDatatypeRuleToken ruleFunctionTryBlock() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_CtorInitializer_1 = null;

        AntlrDatatypeRuleToken this_CompoundStatement_2 = null;

        AntlrDatatypeRuleToken this_Handler_3 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4575:28: ( (kw= 'try' (this_CtorInitializer_1= ruleCtorInitializer )? this_CompoundStatement_2= ruleCompoundStatement (this_Handler_3= ruleHandler )+ ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4576:1: (kw= 'try' (this_CtorInitializer_1= ruleCtorInitializer )? this_CompoundStatement_2= ruleCompoundStatement (this_Handler_3= ruleHandler )+ )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4576:1: (kw= 'try' (this_CtorInitializer_1= ruleCtorInitializer )? this_CompoundStatement_2= ruleCompoundStatement (this_Handler_3= ruleHandler )+ )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4577:2: kw= 'try' (this_CtorInitializer_1= ruleCtorInitializer )? this_CompoundStatement_2= ruleCompoundStatement (this_Handler_3= ruleHandler )+
            {
            kw=(Token)match(input,135,FOLLOW_135_in_ruleFunctionTryBlock13443); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getFunctionTryBlockAccess().getTryKeyword_0()); 
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4582:1: (this_CtorInitializer_1= ruleCtorInitializer )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==148) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4583:5: this_CtorInitializer_1= ruleCtorInitializer
                    {
                     
                            newCompositeNode(grammarAccess.getFunctionTryBlockAccess().getCtorInitializerParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleCtorInitializer_in_ruleFunctionTryBlock13466);
                    this_CtorInitializer_1=ruleCtorInitializer();

                    state._fsp--;


                    		current.merge(this_CtorInitializer_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getFunctionTryBlockAccess().getCompoundStatementParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleCompoundStatement_in_ruleFunctionTryBlock13495);
            this_CompoundStatement_2=ruleCompoundStatement();

            state._fsp--;


            		current.merge(this_CompoundStatement_2);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4604:1: (this_Handler_3= ruleHandler )+
            int cnt109=0;
            loop109:
            do {
                int alt109=2;
                int LA109_0 = input.LA(1);

                if ( (LA109_0==136) ) {
                    alt109=1;
                }


                switch (alt109) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4605:5: this_Handler_3= ruleHandler
            	    {
            	     
            	            newCompositeNode(grammarAccess.getFunctionTryBlockAccess().getHandlerParserRuleCall_3()); 
            	        
            	    pushFollow(FOLLOW_ruleHandler_in_ruleFunctionTryBlock13523);
            	    this_Handler_3=ruleHandler();

            	    state._fsp--;


            	    		current.merge(this_Handler_3);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt109 >= 1 ) break loop109;
                        EarlyExitException eee =
                            new EarlyExitException(109, input);
                        throw eee;
                }
                cnt109++;
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionTryBlock"


    // $ANTLR start "entryRuleHandler"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4623:1: entryRuleHandler returns [String current=null] : iv_ruleHandler= ruleHandler EOF ;
    public final String entryRuleHandler() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleHandler = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4624:2: (iv_ruleHandler= ruleHandler EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4625:2: iv_ruleHandler= ruleHandler EOF
            {
             newCompositeNode(grammarAccess.getHandlerRule()); 
            pushFollow(FOLLOW_ruleHandler_in_entryRuleHandler13571);
            iv_ruleHandler=ruleHandler();

            state._fsp--;

             current =iv_ruleHandler.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHandler13582); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHandler"


    // $ANTLR start "ruleHandler"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4632:1: ruleHandler returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'catch' kw= '(' this_ExceptionDeclaration_2= ruleExceptionDeclaration kw= ')' this_CompoundStatement_4= ruleCompoundStatement ) ;
    public final AntlrDatatypeRuleToken ruleHandler() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ExceptionDeclaration_2 = null;

        AntlrDatatypeRuleToken this_CompoundStatement_4 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4635:28: ( (kw= 'catch' kw= '(' this_ExceptionDeclaration_2= ruleExceptionDeclaration kw= ')' this_CompoundStatement_4= ruleCompoundStatement ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4636:1: (kw= 'catch' kw= '(' this_ExceptionDeclaration_2= ruleExceptionDeclaration kw= ')' this_CompoundStatement_4= ruleCompoundStatement )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4636:1: (kw= 'catch' kw= '(' this_ExceptionDeclaration_2= ruleExceptionDeclaration kw= ')' this_CompoundStatement_4= ruleCompoundStatement )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4637:2: kw= 'catch' kw= '(' this_ExceptionDeclaration_2= ruleExceptionDeclaration kw= ')' this_CompoundStatement_4= ruleCompoundStatement
            {
            kw=(Token)match(input,136,FOLLOW_136_in_ruleHandler13620); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getHandlerAccess().getCatchKeyword_0()); 
                
            kw=(Token)match(input,44,FOLLOW_44_in_ruleHandler13633); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getHandlerAccess().getLeftParenthesisKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getHandlerAccess().getExceptionDeclarationParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleExceptionDeclaration_in_ruleHandler13655);
            this_ExceptionDeclaration_2=ruleExceptionDeclaration();

            state._fsp--;


            		current.merge(this_ExceptionDeclaration_2);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,46,FOLLOW_46_in_ruleHandler13673); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getHandlerAccess().getRightParenthesisKeyword_3()); 
                
             
                    newCompositeNode(grammarAccess.getHandlerAccess().getCompoundStatementParserRuleCall_4()); 
                
            pushFollow(FOLLOW_ruleCompoundStatement_in_ruleHandler13695);
            this_CompoundStatement_4=ruleCompoundStatement();

            state._fsp--;


            		current.merge(this_CompoundStatement_4);
                
             
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHandler"


    // $ANTLR start "entryRuleExceptionDeclaration"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4684:1: entryRuleExceptionDeclaration returns [String current=null] : iv_ruleExceptionDeclaration= ruleExceptionDeclaration EOF ;
    public final String entryRuleExceptionDeclaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExceptionDeclaration = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4685:2: (iv_ruleExceptionDeclaration= ruleExceptionDeclaration EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4686:2: iv_ruleExceptionDeclaration= ruleExceptionDeclaration EOF
            {
             newCompositeNode(grammarAccess.getExceptionDeclarationRule()); 
            pushFollow(FOLLOW_ruleExceptionDeclaration_in_entryRuleExceptionDeclaration13741);
            iv_ruleExceptionDeclaration=ruleExceptionDeclaration();

            state._fsp--;

             current =iv_ruleExceptionDeclaration.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExceptionDeclaration13752); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExceptionDeclaration"


    // $ANTLR start "ruleExceptionDeclaration"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4693:1: ruleExceptionDeclaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_TypeSpecifier_0= ruleTypeSpecifier )+ (this_DeclaratorId_1= ruleDeclaratorId )? ) | kw= '...' ) ;
    public final AntlrDatatypeRuleToken ruleExceptionDeclaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_TypeSpecifier_0 = null;

        AntlrDatatypeRuleToken this_DeclaratorId_1 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4696:28: ( ( ( (this_TypeSpecifier_0= ruleTypeSpecifier )+ (this_DeclaratorId_1= ruleDeclaratorId )? ) | kw= '...' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4697:1: ( ( (this_TypeSpecifier_0= ruleTypeSpecifier )+ (this_DeclaratorId_1= ruleDeclaratorId )? ) | kw= '...' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4697:1: ( ( (this_TypeSpecifier_0= ruleTypeSpecifier )+ (this_DeclaratorId_1= ruleDeclaratorId )? ) | kw= '...' )
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==RULE_ID||LA112_0==58||(LA112_0>=60 && LA112_0<=74)||(LA112_0>=77 && LA112_0<=79)||LA112_0==82||LA112_0==90||LA112_0==142||LA112_0==145) ) {
                alt112=1;
            }
            else if ( (LA112_0==88) ) {
                alt112=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 112, 0, input);

                throw nvae;
            }
            switch (alt112) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4697:2: ( (this_TypeSpecifier_0= ruleTypeSpecifier )+ (this_DeclaratorId_1= ruleDeclaratorId )? )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4697:2: ( (this_TypeSpecifier_0= ruleTypeSpecifier )+ (this_DeclaratorId_1= ruleDeclaratorId )? )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4697:3: (this_TypeSpecifier_0= ruleTypeSpecifier )+ (this_DeclaratorId_1= ruleDeclaratorId )?
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4697:3: (this_TypeSpecifier_0= ruleTypeSpecifier )+
                    int cnt110=0;
                    loop110:
                    do {
                        int alt110=2;
                        int LA110_0 = input.LA(1);

                        if ( (LA110_0==RULE_ID||LA110_0==58||(LA110_0>=60 && LA110_0<=74)||(LA110_0>=77 && LA110_0<=79)||LA110_0==82||LA110_0==90||LA110_0==142||LA110_0==145) ) {
                            alt110=1;
                        }


                        switch (alt110) {
                    	case 1 :
                    	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4698:5: this_TypeSpecifier_0= ruleTypeSpecifier
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getExceptionDeclarationAccess().getTypeSpecifierParserRuleCall_0_0()); 
                    	        
                    	    pushFollow(FOLLOW_ruleTypeSpecifier_in_ruleExceptionDeclaration13801);
                    	    this_TypeSpecifier_0=ruleTypeSpecifier();

                    	    state._fsp--;


                    	    		current.merge(this_TypeSpecifier_0);
                    	        
                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt110 >= 1 ) break loop110;
                                EarlyExitException eee =
                                    new EarlyExitException(110, input);
                                throw eee;
                        }
                        cnt110++;
                    } while (true);

                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4708:3: (this_DeclaratorId_1= ruleDeclaratorId )?
                    int alt111=2;
                    int LA111_0 = input.LA(1);

                    if ( (LA111_0==88||LA111_0==144) ) {
                        alt111=1;
                    }
                    switch (alt111) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4709:5: this_DeclaratorId_1= ruleDeclaratorId
                            {
                             
                                    newCompositeNode(grammarAccess.getExceptionDeclarationAccess().getDeclaratorIdParserRuleCall_0_1()); 
                                
                            pushFollow(FOLLOW_ruleDeclaratorId_in_ruleExceptionDeclaration13831);
                            this_DeclaratorId_1=ruleDeclaratorId();

                            state._fsp--;


                            		current.merge(this_DeclaratorId_1);
                                
                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4721:2: kw= '...'
                    {
                    kw=(Token)match(input,88,FOLLOW_88_in_ruleExceptionDeclaration13858); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getExceptionDeclarationAccess().getFullStopFullStopFullStopKeyword_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExceptionDeclaration"


    // $ANTLR start "entryRuleExceptionSpecification"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4736:1: entryRuleExceptionSpecification returns [String current=null] : iv_ruleExceptionSpecification= ruleExceptionSpecification EOF ;
    public final String entryRuleExceptionSpecification() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExceptionSpecification = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4737:2: (iv_ruleExceptionSpecification= ruleExceptionSpecification EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4738:2: iv_ruleExceptionSpecification= ruleExceptionSpecification EOF
            {
             newCompositeNode(grammarAccess.getExceptionSpecificationRule()); 
            pushFollow(FOLLOW_ruleExceptionSpecification_in_entryRuleExceptionSpecification13901);
            iv_ruleExceptionSpecification=ruleExceptionSpecification();

            state._fsp--;

             current =iv_ruleExceptionSpecification.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExceptionSpecification13912); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExceptionSpecification"


    // $ANTLR start "ruleExceptionSpecification"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4745:1: ruleExceptionSpecification returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DynamicExceptionSpecification_0= ruleDynamicExceptionSpecification | this_NoexceptSpecification_1= ruleNoexceptSpecification ) ;
    public final AntlrDatatypeRuleToken ruleExceptionSpecification() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_DynamicExceptionSpecification_0 = null;

        AntlrDatatypeRuleToken this_NoexceptSpecification_1 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4748:28: ( (this_DynamicExceptionSpecification_0= ruleDynamicExceptionSpecification | this_NoexceptSpecification_1= ruleNoexceptSpecification ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4749:1: (this_DynamicExceptionSpecification_0= ruleDynamicExceptionSpecification | this_NoexceptSpecification_1= ruleNoexceptSpecification )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4749:1: (this_DynamicExceptionSpecification_0= ruleDynamicExceptionSpecification | this_NoexceptSpecification_1= ruleNoexceptSpecification )
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==137) ) {
                alt113=1;
            }
            else if ( (LA113_0==138) ) {
                alt113=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 113, 0, input);

                throw nvae;
            }
            switch (alt113) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4750:5: this_DynamicExceptionSpecification_0= ruleDynamicExceptionSpecification
                    {
                     
                            newCompositeNode(grammarAccess.getExceptionSpecificationAccess().getDynamicExceptionSpecificationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDynamicExceptionSpecification_in_ruleExceptionSpecification13959);
                    this_DynamicExceptionSpecification_0=ruleDynamicExceptionSpecification();

                    state._fsp--;


                    		current.merge(this_DynamicExceptionSpecification_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4762:5: this_NoexceptSpecification_1= ruleNoexceptSpecification
                    {
                     
                            newCompositeNode(grammarAccess.getExceptionSpecificationAccess().getNoexceptSpecificationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNoexceptSpecification_in_ruleExceptionSpecification13992);
                    this_NoexceptSpecification_1=ruleNoexceptSpecification();

                    state._fsp--;


                    		current.merge(this_NoexceptSpecification_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExceptionSpecification"


    // $ANTLR start "entryRuleDynamicExceptionSpecification"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4780:1: entryRuleDynamicExceptionSpecification returns [String current=null] : iv_ruleDynamicExceptionSpecification= ruleDynamicExceptionSpecification EOF ;
    public final String entryRuleDynamicExceptionSpecification() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDynamicExceptionSpecification = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4781:2: (iv_ruleDynamicExceptionSpecification= ruleDynamicExceptionSpecification EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4782:2: iv_ruleDynamicExceptionSpecification= ruleDynamicExceptionSpecification EOF
            {
             newCompositeNode(grammarAccess.getDynamicExceptionSpecificationRule()); 
            pushFollow(FOLLOW_ruleDynamicExceptionSpecification_in_entryRuleDynamicExceptionSpecification14038);
            iv_ruleDynamicExceptionSpecification=ruleDynamicExceptionSpecification();

            state._fsp--;

             current =iv_ruleDynamicExceptionSpecification.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDynamicExceptionSpecification14049); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDynamicExceptionSpecification"


    // $ANTLR start "ruleDynamicExceptionSpecification"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4789:1: ruleDynamicExceptionSpecification returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'throw' kw= '(' this_TypeIdList_2= ruleTypeIdList kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleDynamicExceptionSpecification() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_TypeIdList_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4792:28: ( (kw= 'throw' kw= '(' this_TypeIdList_2= ruleTypeIdList kw= ')' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4793:1: (kw= 'throw' kw= '(' this_TypeIdList_2= ruleTypeIdList kw= ')' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4793:1: (kw= 'throw' kw= '(' this_TypeIdList_2= ruleTypeIdList kw= ')' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4794:2: kw= 'throw' kw= '(' this_TypeIdList_2= ruleTypeIdList kw= ')'
            {
            kw=(Token)match(input,137,FOLLOW_137_in_ruleDynamicExceptionSpecification14087); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDynamicExceptionSpecificationAccess().getThrowKeyword_0()); 
                
            kw=(Token)match(input,44,FOLLOW_44_in_ruleDynamicExceptionSpecification14100); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDynamicExceptionSpecificationAccess().getLeftParenthesisKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getDynamicExceptionSpecificationAccess().getTypeIdListParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleTypeIdList_in_ruleDynamicExceptionSpecification14122);
            this_TypeIdList_2=ruleTypeIdList();

            state._fsp--;


            		current.merge(this_TypeIdList_2);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,46,FOLLOW_46_in_ruleDynamicExceptionSpecification14140); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDynamicExceptionSpecificationAccess().getRightParenthesisKeyword_3()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDynamicExceptionSpecification"


    // $ANTLR start "entryRuleNoexceptSpecification"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4830:1: entryRuleNoexceptSpecification returns [String current=null] : iv_ruleNoexceptSpecification= ruleNoexceptSpecification EOF ;
    public final String entryRuleNoexceptSpecification() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNoexceptSpecification = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4831:2: (iv_ruleNoexceptSpecification= ruleNoexceptSpecification EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4832:2: iv_ruleNoexceptSpecification= ruleNoexceptSpecification EOF
            {
             newCompositeNode(grammarAccess.getNoexceptSpecificationRule()); 
            pushFollow(FOLLOW_ruleNoexceptSpecification_in_entryRuleNoexceptSpecification14181);
            iv_ruleNoexceptSpecification=ruleNoexceptSpecification();

            state._fsp--;

             current =iv_ruleNoexceptSpecification.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoexceptSpecification14192); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNoexceptSpecification"


    // $ANTLR start "ruleNoexceptSpecification"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4839:1: ruleNoexceptSpecification returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'noexcept' (kw= '(' this_ConstantExpression_2= ruleConstantExpression kw= ')' )? ) ;
    public final AntlrDatatypeRuleToken ruleNoexceptSpecification() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ConstantExpression_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4842:28: ( (kw= 'noexcept' (kw= '(' this_ConstantExpression_2= ruleConstantExpression kw= ')' )? ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4843:1: (kw= 'noexcept' (kw= '(' this_ConstantExpression_2= ruleConstantExpression kw= ')' )? )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4843:1: (kw= 'noexcept' (kw= '(' this_ConstantExpression_2= ruleConstantExpression kw= ')' )? )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4844:2: kw= 'noexcept' (kw= '(' this_ConstantExpression_2= ruleConstantExpression kw= ')' )?
            {
            kw=(Token)match(input,138,FOLLOW_138_in_ruleNoexceptSpecification14230); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getNoexceptSpecificationAccess().getNoexceptKeyword_0()); 
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4849:1: (kw= '(' this_ConstantExpression_2= ruleConstantExpression kw= ')' )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==44) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4850:2: kw= '(' this_ConstantExpression_2= ruleConstantExpression kw= ')'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleNoexceptSpecification14244); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNoexceptSpecificationAccess().getLeftParenthesisKeyword_1_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getNoexceptSpecificationAccess().getConstantExpressionParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleConstantExpression_in_ruleNoexceptSpecification14266);
                    this_ConstantExpression_2=ruleConstantExpression();

                    state._fsp--;


                    		current.merge(this_ConstantExpression_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleNoexceptSpecification14284); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNoexceptSpecificationAccess().getRightParenthesisKeyword_1_2()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNoexceptSpecification"


    // $ANTLR start "entryRuleExpression"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4880:1: entryRuleExpression returns [String current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final String entryRuleExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpression = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4881:2: (iv_ruleExpression= ruleExpression EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4882:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression14327);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression14338); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4889:1: ruleExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Expression' ;
    public final AntlrDatatypeRuleToken ruleExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4892:28: (kw= 'Expression' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4894:2: kw= 'Expression'
            {
            kw=(Token)match(input,139,FOLLOW_139_in_ruleExpression14375); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getExpressionAccess().getExpressionKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleExpressionList"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4907:1: entryRuleExpressionList returns [String current=null] : iv_ruleExpressionList= ruleExpressionList EOF ;
    public final String entryRuleExpressionList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpressionList = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4908:2: (iv_ruleExpressionList= ruleExpressionList EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4909:2: iv_ruleExpressionList= ruleExpressionList EOF
            {
             newCompositeNode(grammarAccess.getExpressionListRule()); 
            pushFollow(FOLLOW_ruleExpressionList_in_entryRuleExpressionList14415);
            iv_ruleExpressionList=ruleExpressionList();

            state._fsp--;

             current =iv_ruleExpressionList.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionList14426); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressionList"


    // $ANTLR start "ruleExpressionList"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4916:1: ruleExpressionList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Expression_0= ruleExpression (kw= ',' this_Expression_2= ruleExpression )* ) ;
    public final AntlrDatatypeRuleToken ruleExpressionList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Expression_0 = null;

        AntlrDatatypeRuleToken this_Expression_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4919:28: ( (this_Expression_0= ruleExpression (kw= ',' this_Expression_2= ruleExpression )* ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4920:1: (this_Expression_0= ruleExpression (kw= ',' this_Expression_2= ruleExpression )* )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4920:1: (this_Expression_0= ruleExpression (kw= ',' this_Expression_2= ruleExpression )* )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4921:5: this_Expression_0= ruleExpression (kw= ',' this_Expression_2= ruleExpression )*
            {
             
                    newCompositeNode(grammarAccess.getExpressionListAccess().getExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleExpression_in_ruleExpressionList14473);
            this_Expression_0=ruleExpression();

            state._fsp--;


            		current.merge(this_Expression_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4931:1: (kw= ',' this_Expression_2= ruleExpression )*
            loop115:
            do {
                int alt115=2;
                int LA115_0 = input.LA(1);

                if ( (LA115_0==45) ) {
                    alt115=1;
                }


                switch (alt115) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4932:2: kw= ',' this_Expression_2= ruleExpression
            	    {
            	    kw=(Token)match(input,45,FOLLOW_45_in_ruleExpressionList14492); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getExpressionListAccess().getCommaKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getExpressionListAccess().getExpressionParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_ruleExpression_in_ruleExpressionList14514);
            	    this_Expression_2=ruleExpression();

            	    state._fsp--;


            	    		current.merge(this_Expression_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop115;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpressionList"


    // $ANTLR start "entryRuleExplicitSpecialization"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4956:1: entryRuleExplicitSpecialization returns [String current=null] : iv_ruleExplicitSpecialization= ruleExplicitSpecialization EOF ;
    public final String entryRuleExplicitSpecialization() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExplicitSpecialization = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4957:2: (iv_ruleExplicitSpecialization= ruleExplicitSpecialization EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4958:2: iv_ruleExplicitSpecialization= ruleExplicitSpecialization EOF
            {
             newCompositeNode(grammarAccess.getExplicitSpecializationRule()); 
            pushFollow(FOLLOW_ruleExplicitSpecialization_in_entryRuleExplicitSpecialization14562);
            iv_ruleExplicitSpecialization=ruleExplicitSpecialization();

            state._fsp--;

             current =iv_ruleExplicitSpecialization.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExplicitSpecialization14573); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExplicitSpecialization"


    // $ANTLR start "ruleExplicitSpecialization"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4965:1: ruleExplicitSpecialization returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'ExplicitSpecialization' ;
    public final AntlrDatatypeRuleToken ruleExplicitSpecialization() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4968:28: (kw= 'ExplicitSpecialization' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4970:2: kw= 'ExplicitSpecialization'
            {
            kw=(Token)match(input,140,FOLLOW_140_in_ruleExplicitSpecialization14610); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getExplicitSpecializationAccess().getExplicitSpecializationKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExplicitSpecialization"


    // $ANTLR start "entryRuleExplicitInstantiation"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4983:1: entryRuleExplicitInstantiation returns [String current=null] : iv_ruleExplicitInstantiation= ruleExplicitInstantiation EOF ;
    public final String entryRuleExplicitInstantiation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExplicitInstantiation = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4984:2: (iv_ruleExplicitInstantiation= ruleExplicitInstantiation EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4985:2: iv_ruleExplicitInstantiation= ruleExplicitInstantiation EOF
            {
             newCompositeNode(grammarAccess.getExplicitInstantiationRule()); 
            pushFollow(FOLLOW_ruleExplicitInstantiation_in_entryRuleExplicitInstantiation14650);
            iv_ruleExplicitInstantiation=ruleExplicitInstantiation();

            state._fsp--;

             current =iv_ruleExplicitInstantiation.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExplicitInstantiation14661); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExplicitInstantiation"


    // $ANTLR start "ruleExplicitInstantiation"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4992:1: ruleExplicitInstantiation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'ExplicitInstantiation' ;
    public final AntlrDatatypeRuleToken ruleExplicitInstantiation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4995:28: (kw= 'ExplicitInstantiation' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4997:2: kw= 'ExplicitInstantiation'
            {
            kw=(Token)match(input,141,FOLLOW_141_in_ruleExplicitInstantiation14698); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getExplicitInstantiationAccess().getExplicitInstantiationKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExplicitInstantiation"


    // $ANTLR start "entryRuleCvQualifier"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5010:1: entryRuleCvQualifier returns [String current=null] : iv_ruleCvQualifier= ruleCvQualifier EOF ;
    public final String entryRuleCvQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCvQualifier = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5011:2: (iv_ruleCvQualifier= ruleCvQualifier EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5012:2: iv_ruleCvQualifier= ruleCvQualifier EOF
            {
             newCompositeNode(grammarAccess.getCvQualifierRule()); 
            pushFollow(FOLLOW_ruleCvQualifier_in_entryRuleCvQualifier14738);
            iv_ruleCvQualifier=ruleCvQualifier();

            state._fsp--;

             current =iv_ruleCvQualifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCvQualifier14749); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCvQualifier"


    // $ANTLR start "ruleCvQualifier"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5019:1: ruleCvQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'CvQualifier' ;
    public final AntlrDatatypeRuleToken ruleCvQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5022:28: (kw= 'CvQualifier' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5024:2: kw= 'CvQualifier'
            {
            kw=(Token)match(input,142,FOLLOW_142_in_ruleCvQualifier14786); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getCvQualifierAccess().getCvQualifierKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCvQualifier"


    // $ANTLR start "entryRuleConstantExpression"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5037:1: entryRuleConstantExpression returns [String current=null] : iv_ruleConstantExpression= ruleConstantExpression EOF ;
    public final String entryRuleConstantExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConstantExpression = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5038:2: (iv_ruleConstantExpression= ruleConstantExpression EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5039:2: iv_ruleConstantExpression= ruleConstantExpression EOF
            {
             newCompositeNode(grammarAccess.getConstantExpressionRule()); 
            pushFollow(FOLLOW_ruleConstantExpression_in_entryRuleConstantExpression14826);
            iv_ruleConstantExpression=ruleConstantExpression();

            state._fsp--;

             current =iv_ruleConstantExpression.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantExpression14837); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstantExpression"


    // $ANTLR start "ruleConstantExpression"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5046:1: ruleConstantExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'ConstantExpression' ;
    public final AntlrDatatypeRuleToken ruleConstantExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5049:28: (kw= 'ConstantExpression' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5051:2: kw= 'ConstantExpression'
            {
            kw=(Token)match(input,143,FOLLOW_143_in_ruleConstantExpression14874); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getConstantExpressionAccess().getConstantExpressionKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstantExpression"


    // $ANTLR start "entryRuleIdExpression"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5064:1: entryRuleIdExpression returns [String current=null] : iv_ruleIdExpression= ruleIdExpression EOF ;
    public final String entryRuleIdExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdExpression = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5065:2: (iv_ruleIdExpression= ruleIdExpression EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5066:2: iv_ruleIdExpression= ruleIdExpression EOF
            {
             newCompositeNode(grammarAccess.getIdExpressionRule()); 
            pushFollow(FOLLOW_ruleIdExpression_in_entryRuleIdExpression14914);
            iv_ruleIdExpression=ruleIdExpression();

            state._fsp--;

             current =iv_ruleIdExpression.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdExpression14925); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIdExpression"


    // $ANTLR start "ruleIdExpression"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5073:1: ruleIdExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'IdExpression' ;
    public final AntlrDatatypeRuleToken ruleIdExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5076:28: (kw= 'IdExpression' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5078:2: kw= 'IdExpression'
            {
            kw=(Token)match(input,144,FOLLOW_144_in_ruleIdExpression14962); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getIdExpressionAccess().getIdExpressionKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIdExpression"


    // $ANTLR start "entryRuleNestedNameSpecifier"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5091:1: entryRuleNestedNameSpecifier returns [String current=null] : iv_ruleNestedNameSpecifier= ruleNestedNameSpecifier EOF ;
    public final String entryRuleNestedNameSpecifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNestedNameSpecifier = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5092:2: (iv_ruleNestedNameSpecifier= ruleNestedNameSpecifier EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5093:2: iv_ruleNestedNameSpecifier= ruleNestedNameSpecifier EOF
            {
             newCompositeNode(grammarAccess.getNestedNameSpecifierRule()); 
            pushFollow(FOLLOW_ruleNestedNameSpecifier_in_entryRuleNestedNameSpecifier15002);
            iv_ruleNestedNameSpecifier=ruleNestedNameSpecifier();

            state._fsp--;

             current =iv_ruleNestedNameSpecifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNestedNameSpecifier15013); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNestedNameSpecifier"


    // $ANTLR start "ruleNestedNameSpecifier"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5100:1: ruleNestedNameSpecifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'NestedNameSpecifier' ;
    public final AntlrDatatypeRuleToken ruleNestedNameSpecifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5103:28: (kw= 'NestedNameSpecifier' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5105:2: kw= 'NestedNameSpecifier'
            {
            kw=(Token)match(input,145,FOLLOW_145_in_ruleNestedNameSpecifier15050); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getNestedNameSpecifierAccess().getNestedNameSpecifierKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNestedNameSpecifier"


    // $ANTLR start "entryRuleAssignmentExpression"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5118:1: entryRuleAssignmentExpression returns [String current=null] : iv_ruleAssignmentExpression= ruleAssignmentExpression EOF ;
    public final String entryRuleAssignmentExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAssignmentExpression = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5119:2: (iv_ruleAssignmentExpression= ruleAssignmentExpression EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5120:2: iv_ruleAssignmentExpression= ruleAssignmentExpression EOF
            {
             newCompositeNode(grammarAccess.getAssignmentExpressionRule()); 
            pushFollow(FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression15090);
            iv_ruleAssignmentExpression=ruleAssignmentExpression();

            state._fsp--;

             current =iv_ruleAssignmentExpression.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignmentExpression15101); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignmentExpression"


    // $ANTLR start "ruleAssignmentExpression"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5127:1: ruleAssignmentExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'AssignmentExpression' ;
    public final AntlrDatatypeRuleToken ruleAssignmentExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5130:28: (kw= 'AssignmentExpression' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5132:2: kw= 'AssignmentExpression'
            {
            kw=(Token)match(input,146,FOLLOW_146_in_ruleAssignmentExpression15138); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getAssignmentExpressionAccess().getAssignmentExpressionKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssignmentExpression"


    // $ANTLR start "entryRuleCompoundStatement"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5145:1: entryRuleCompoundStatement returns [String current=null] : iv_ruleCompoundStatement= ruleCompoundStatement EOF ;
    public final String entryRuleCompoundStatement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCompoundStatement = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5146:2: (iv_ruleCompoundStatement= ruleCompoundStatement EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5147:2: iv_ruleCompoundStatement= ruleCompoundStatement EOF
            {
             newCompositeNode(grammarAccess.getCompoundStatementRule()); 
            pushFollow(FOLLOW_ruleCompoundStatement_in_entryRuleCompoundStatement15178);
            iv_ruleCompoundStatement=ruleCompoundStatement();

            state._fsp--;

             current =iv_ruleCompoundStatement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompoundStatement15189); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompoundStatement"


    // $ANTLR start "ruleCompoundStatement"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5154:1: ruleCompoundStatement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'CompoundStatement' ;
    public final AntlrDatatypeRuleToken ruleCompoundStatement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5157:28: (kw= 'CompoundStatement' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5159:2: kw= 'CompoundStatement'
            {
            kw=(Token)match(input,147,FOLLOW_147_in_ruleCompoundStatement15226); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getCompoundStatementAccess().getCompoundStatementKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompoundStatement"


    // $ANTLR start "entryRuleCtorInitializer"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5172:1: entryRuleCtorInitializer returns [String current=null] : iv_ruleCtorInitializer= ruleCtorInitializer EOF ;
    public final String entryRuleCtorInitializer() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCtorInitializer = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5173:2: (iv_ruleCtorInitializer= ruleCtorInitializer EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5174:2: iv_ruleCtorInitializer= ruleCtorInitializer EOF
            {
             newCompositeNode(grammarAccess.getCtorInitializerRule()); 
            pushFollow(FOLLOW_ruleCtorInitializer_in_entryRuleCtorInitializer15266);
            iv_ruleCtorInitializer=ruleCtorInitializer();

            state._fsp--;

             current =iv_ruleCtorInitializer.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCtorInitializer15277); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCtorInitializer"


    // $ANTLR start "ruleCtorInitializer"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5181:1: ruleCtorInitializer returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'CtorInitializer' ;
    public final AntlrDatatypeRuleToken ruleCtorInitializer() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5184:28: (kw= 'CtorInitializer' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5186:2: kw= 'CtorInitializer'
            {
            kw=(Token)match(input,148,FOLLOW_148_in_ruleCtorInitializer15314); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getCtorInitializerAccess().getCtorInitializerKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCtorInitializer"


    // $ANTLR start "entryRuleTypeIdList"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5199:1: entryRuleTypeIdList returns [String current=null] : iv_ruleTypeIdList= ruleTypeIdList EOF ;
    public final String entryRuleTypeIdList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeIdList = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5200:2: (iv_ruleTypeIdList= ruleTypeIdList EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5201:2: iv_ruleTypeIdList= ruleTypeIdList EOF
            {
             newCompositeNode(grammarAccess.getTypeIdListRule()); 
            pushFollow(FOLLOW_ruleTypeIdList_in_entryRuleTypeIdList15354);
            iv_ruleTypeIdList=ruleTypeIdList();

            state._fsp--;

             current =iv_ruleTypeIdList.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeIdList15365); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeIdList"


    // $ANTLR start "ruleTypeIdList"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5208:1: ruleTypeIdList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'TypeIdList' ;
    public final AntlrDatatypeRuleToken ruleTypeIdList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5211:28: (kw= 'TypeIdList' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5213:2: kw= 'TypeIdList'
            {
            kw=(Token)match(input,149,FOLLOW_149_in_ruleTypeIdList15402); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getTypeIdListAccess().getTypeIdListKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeIdList"


    // $ANTLR start "entryRuleUnqualifiedId"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5226:1: entryRuleUnqualifiedId returns [String current=null] : iv_ruleUnqualifiedId= ruleUnqualifiedId EOF ;
    public final String entryRuleUnqualifiedId() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnqualifiedId = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5227:2: (iv_ruleUnqualifiedId= ruleUnqualifiedId EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5228:2: iv_ruleUnqualifiedId= ruleUnqualifiedId EOF
            {
             newCompositeNode(grammarAccess.getUnqualifiedIdRule()); 
            pushFollow(FOLLOW_ruleUnqualifiedId_in_entryRuleUnqualifiedId15442);
            iv_ruleUnqualifiedId=ruleUnqualifiedId();

            state._fsp--;

             current =iv_ruleUnqualifiedId.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnqualifiedId15453); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnqualifiedId"


    // $ANTLR start "ruleUnqualifiedId"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5235:1: ruleUnqualifiedId returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'UnqualifiedId' ;
    public final AntlrDatatypeRuleToken ruleUnqualifiedId() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5238:28: (kw= 'UnqualifiedId' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5240:2: kw= 'UnqualifiedId'
            {
            kw=(Token)match(input,150,FOLLOW_150_in_ruleUnqualifiedId15490); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getUnqualifiedIdAccess().getUnqualifiedIdKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnqualifiedId"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA93 dfa93 = new DFA93(this);
    static final String DFA4_eotS =
        "\14\uffff";
    static final String DFA4_eofS =
        "\14\uffff";
    static final String DFA4_minS =
        "\1\10\1\uffff\1\7\1\10\1\uffff\1\10\5\uffff\1\47";
    static final String DFA4_maxS =
        "\1\u0091\1\uffff\2\u0091\1\uffff\1\113\5\uffff\1\113";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\1\uffff\1\3\1\4\1\5\1\6\1\7\1\uffff";
    static final String DFA4_specialS =
        "\14\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\1\35\uffff\1\4\1\uffff\1\1\2\uffff\1\4\3\uffff\6\1\1\2\1"+
            "\1\1\3\3\1\1\6\17\1\2\uffff\3\1\1\uffff\1\5\1\1\1\4\4\uffff"+
            "\1\1\1\uffff\1\1\61\uffff\1\10\1\7\1\1\1\uffff\2\1",
            "",
            "\1\11\1\1\37\uffff\1\1\6\uffff\14\1\1\uffff\17\1\2\uffff\3"+
            "\1\2\uffff\1\1\5\uffff\1\1\1\uffff\1\1\63\uffff\1\1\1\uffff"+
            "\2\1",
            "\1\1\37\uffff\1\1\6\uffff\14\1\1\uffff\17\1\2\uffff\3\1\1"+
            "\uffff\1\12\1\1\5\uffff\1\1\1\uffff\1\1\63\uffff\1\1\1\uffff"+
            "\2\1",
            "",
            "\1\13\102\uffff\1\12",
            "",
            "",
            "",
            "",
            "",
            "\1\4\43\uffff\1\12"
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "195:1: (this_SimpleOrFunctionDeclaration_0= ruleSimpleOrFunctionDeclaration | this_BlockDeclaration_1= ruleBlockDeclaration | this_TemplateDeclaration_2= ruleTemplateDeclaration | this_ExplicitInstantiation_3= ruleExplicitInstantiation | this_ExplicitSpecialization_4= ruleExplicitSpecialization | this_LinkageSpecification_5= ruleLinkageSpecification | this_NamespaceDefinition_6= ruleNamespaceDefinition )";
        }
    }
    static final String DFA93_eotS =
        "\55\uffff";
    static final String DFA93_eofS =
        "\1\uffff\1\51\1\53\52\uffff";
    static final String DFA93_minS =
        "\1\47\2\142\52\uffff";
    static final String DFA93_maxS =
        "\1\u0085\2\144\52\uffff";
    static final String DFA93_acceptS =
        "\3\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1"+
        "\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34"+
        "\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51"+
        "\1\52\1\1\1\3\1\2\1\4";
    static final String DFA93_specialS =
        "\55\uffff}>";
    static final String[] DFA93_transitionS = {
            "\1\15\2\uffff\1\2\2\uffff\1\44\50\uffff\1\11\1\40\4\uffff\1"+
            "\1\5\uffff\1\16\1\17\2\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\12\1"+
            "\13\1\14\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1"+
            "\32\1\33\1\34\1\35\1\36\1\37\1\41\1\42\1\43\1\45\1\46\1\47\1"+
            "\50",
            "\1\51\1\uffff\1\52",
            "\1\53\1\uffff\1\54",
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

    static final short[] DFA93_eot = DFA.unpackEncodedString(DFA93_eotS);
    static final short[] DFA93_eof = DFA.unpackEncodedString(DFA93_eofS);
    static final char[] DFA93_min = DFA.unpackEncodedStringToUnsignedChars(DFA93_minS);
    static final char[] DFA93_max = DFA.unpackEncodedStringToUnsignedChars(DFA93_maxS);
    static final short[] DFA93_accept = DFA.unpackEncodedString(DFA93_acceptS);
    static final short[] DFA93_special = DFA.unpackEncodedString(DFA93_specialS);
    static final short[][] DFA93_transition;

    static {
        int numStates = DFA93_transitionS.length;
        DFA93_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA93_transition[i] = DFA.unpackEncodedString(DFA93_transitionS[i]);
        }
    }

    class DFA93 extends DFA {

        public DFA93(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 93;
            this.eot = DFA93_eot;
            this.eof = DFA93_eof;
            this.min = DFA93_min;
            this.max = DFA93_max;
            this.accept = DFA93_accept;
            this.special = DFA93_special;
            this.transition = DFA93_transition;
        }
        public String getDescription() {
            return "3724:1: (kw= 'new' | kw= 'delete' | (kw= 'new' kw= '[' kw= ']' ) | (kw= 'delete' kw= '[' kw= ']' ) | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= '^' | kw= '&' | kw= '|' | kw= '~' | kw= '!' | kw= '=' | kw= '<' | kw= '>' | kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' | kw= '^=' | kw= '&=' | kw= '|=' | kw= '<<' | kw= '>>' | kw= '>>=' | kw= '<<=' | kw= '==' | kw= '!=' | kw= '<=' | kw= '>=' | kw= '&&' | kw= '||' | kw= '++' | kw= '--' | kw= ',' | kw= '->*' | kw= '->' | kw= '()' | kw= '[]' )";
        }
    }
 

    public static final BitSet FOLLOW_ruleTest_in_entryRuleTest75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTest85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleTest130 = new BitSet(new long[]{0xFFFF894000000102L,0x00000000050EE7FFL,0x0000000000037000L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral169 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLiteral220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CHARACTER_LITERAL_in_ruleLiteral246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOATING_LITERAL_in_ruleLiteral272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_LITERAL_in_ruleLiteral298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleLiteral324 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_36_in_ruleLiteral343 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleLiteral357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration401 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleOrFunctionDeclaration_in_ruleDeclaration459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockDeclaration_in_ruleDeclaration492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateDeclaration_in_ruleDeclaration525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExplicitInstantiation_in_ruleDeclaration558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExplicitSpecialization_in_ruleDeclaration591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkageSpecification_in_ruleDeclaration624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespaceDefinition_in_ruleDeclaration657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockDeclaration_in_entryRuleBlockDeclaration703 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlockDeclaration714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsmDefinition_in_ruleBlockDeclaration761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespaceAliasDefinition_in_ruleBlockDeclaration794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsingDeclaration_in_ruleBlockDeclaration827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticAssertDeclaration_in_ruleBlockDeclaration860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAliasDeclaration_in_ruleBlockDeclaration893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAliasDeclaration_in_entryRuleAliasDeclaration939 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAliasDeclaration950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleAliasDeclaration988 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAliasDeclaration1003 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleAliasDeclaration1021 = new BitSet(new long[]{0xF400000000000100L,0x000000000404E7FFL,0x0000000000024000L});
    public static final BitSet FOLLOW_ruleTypeId_in_ruleAliasDeclaration1043 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleAliasDeclaration1061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleDeclaration_in_entryRuleSimpleDeclaration1102 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleDeclaration1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarationSpecifier_in_ruleSimpleDeclaration1161 = new BitSet(new long[]{0xF7FF810000000100L,0x000000000504E7FFL,0x0000000000034000L});
    public static final BitSet FOLLOW_ruleSimpleDeclarationSuffix_in_ruleSimpleDeclaration1190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleOrFunctionDeclaration_in_entryRuleSimpleOrFunctionDeclaration1236 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleOrFunctionDeclaration1247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarationSpecifier_in_ruleSimpleOrFunctionDeclaration1295 = new BitSet(new long[]{0xF7FF810000000100L,0x000000000504E7FFL,0x0000000000034000L});
    public static final BitSet FOLLOW_ruleSimpleDeclarationSuffix_in_ruleSimpleOrFunctionDeclaration1325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDeclarationSuffix_in_ruleSimpleOrFunctionDeclaration1358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleDeclarationSuffix_in_entryRuleSimpleDeclarationSuffix1405 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleDeclarationSuffix1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitDeclaratorList_in_ruleSimpleDeclarationSuffix1464 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleSimpleDeclarationSuffix1484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDeclarationSuffix_in_entryRuleFunctionDeclarationSuffix1525 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionDeclarationSuffix1536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDeclarator_in_ruleFunctionDeclarationSuffix1583 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000000L,0x0000000000180080L});
    public static final BitSet FOLLOW_ruleFunctionBody_in_ruleFunctionDeclarationSuffix1611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleFunctionDeclarationSuffix1636 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleFunctionDeclarationSuffix1649 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleFunctionDeclarationSuffix1662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleFunctionDeclarationSuffix1683 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleFunctionDeclarationSuffix1696 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleFunctionDeclarationSuffix1709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticAssertDeclaration_in_entryRuleStaticAssertDeclaration1752 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticAssertDeclaration1763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleStaticAssertDeclaration1801 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleStaticAssertDeclaration1814 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleConstantExpression_in_ruleStaticAssertDeclaration1836 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleStaticAssertDeclaration1854 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_LITERAL_in_ruleStaticAssertDeclaration1869 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleStaticAssertDeclaration1887 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleStaticAssertDeclaration1900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarationSpecifier_in_entryRuleDeclarationSpecifier1941 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclarationSpecifier1952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStorageClassSpecifier_in_ruleDeclarationSpecifier1999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeSpecifier_in_ruleDeclarationSpecifier2032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionSpecifier_in_ruleDeclarationSpecifier2065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleDeclarationSpecifier2089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleDeclarationSpecifier2108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleDeclarationSpecifier2127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStorageClassSpecifier_in_entryRuleStorageClassSpecifier2168 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStorageClassSpecifier2179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleStorageClassSpecifier2217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleStorageClassSpecifier2236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleStorageClassSpecifier2255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleStorageClassSpecifier2274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleStorageClassSpecifier2293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionSpecifier_in_entryRuleFunctionSpecifier2334 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionSpecifier2345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleFunctionSpecifier2383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleFunctionSpecifier2402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleFunctionSpecifier2421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeSpecifier_in_entryRuleTypeSpecifier2462 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeSpecifier2473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrailingTypeSpecifier_in_ruleTypeSpecifier2520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassSpecifier_in_ruleTypeSpecifier2553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumSpecifier_in_ruleTypeSpecifier2586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrailingTypeSpecifier_in_entryRuleTrailingTypeSpecifier2632 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrailingTypeSpecifier2643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleTypeSpecifier_in_ruleTrailingTypeSpecifier2690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypenameSpecifier_in_ruleTrailingTypeSpecifier2723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCvQualifier_in_ruleTrailingTypeSpecifier2756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleTypeSpecifier_in_entryRuleSimpleTypeSpecifier2802 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleTypeSpecifier2813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleSimpleTypeSpecifier2853 = new BitSet(new long[]{0x0400000000000100L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ruleTypeName_in_ruleSimpleTypeSpecifier2878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNestedNameSpecifier_in_ruleSimpleTypeSpecifier2912 = new BitSet(new long[]{0x0800000000000100L});
    public static final BitSet FOLLOW_ruleTypeName_in_ruleSimpleTypeSpecifier2940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleSimpleTypeSpecifier2965 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleSimpleTemplateId_in_ruleSimpleTypeSpecifier2987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleSimpleTypeSpecifier3016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleSimpleTypeSpecifier3035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleSimpleTypeSpecifier3054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleSimpleTypeSpecifier3073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleSimpleTypeSpecifier3092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleSimpleTypeSpecifier3111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleSimpleTypeSpecifier3130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleSimpleTypeSpecifier3149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleSimpleTypeSpecifier3168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleSimpleTypeSpecifier3187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleSimpleTypeSpecifier3206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleSimpleTypeSpecifier3225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleSimpleTypeSpecifier3244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleSimpleTypeSpecifier3263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarationTypeSpecifier_in_ruleSimpleTypeSpecifier3291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeName_in_entryRuleTypeName3337 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeName3348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleTemplateId_in_ruleTypeName3395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeName3421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarationTypeSpecifier_in_entryRuleDeclarationTypeSpecifier3467 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclarationTypeSpecifier3478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleDeclarationTypeSpecifier3516 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleDeclarationTypeSpecifier3529 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleDeclarationTypeSpecifier3551 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleDeclarationTypeSpecifier3569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumSpecifier_in_entryRuleEnumSpecifier3612 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumSpecifier3623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumHead_in_ruleEnumSpecifier3670 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_ruleEnumSpecifier3688 = new BitSet(new long[]{0x0000000000000100L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleEnumeratorList_in_ruleEnumSpecifier3711 = new BitSet(new long[]{0x0000200000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_45_in_ruleEnumSpecifier3730 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_ruleEnumSpecifier3747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumHead_in_entryRuleEnumHead3788 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumHead3799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumKey_in_ruleEnumHead3846 = new BitSet(new long[]{0x0400000000000102L,0x0000000000010000L,0x0000000000020000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumHead3868 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleNestedNameSpecifier_in_ruleEnumHead3904 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumHead3924 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleEnumBase_in_ruleEnumHead3954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumKey_in_entryRuleEnumKey4002 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumKey4013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleEnumKey4051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleEnumKey4071 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_ruleEnumKey4084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleEnumKey4105 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_ruleEnumKey4118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumBase_in_entryRuleEnumBase4160 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumBase4171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleEnumBase4209 = new BitSet(new long[]{0xF400000000000100L,0x000000000404E7FFL,0x0000000000024000L});
    public static final BitSet FOLLOW_ruleTypeSpecifier_in_ruleEnumBase4232 = new BitSet(new long[]{0xF400000000000102L,0x000000000404E7FFL,0x0000000000024000L});
    public static final BitSet FOLLOW_ruleEnumeratorList_in_entryRuleEnumeratorList4280 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumeratorList4291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationDefinition_in_ruleEnumeratorList4338 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_ruleEnumeratorList4357 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleEnumerationDefinition_in_ruleEnumeratorList4379 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_ruleEnumerationDefinition_in_entryRuleEnumerationDefinition4427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationDefinition4438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerator_in_ruleEnumerationDefinition4485 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_ruleEnumerationDefinition4504 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleConstantExpression_in_ruleEnumerationDefinition4526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerator_in_entryRuleEnumerator4574 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumerator4585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumerator4624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespaceDefinition_in_entryRuleNamespaceDefinition4669 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamespaceDefinition4680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleNamespaceDefinition4719 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_ruleNamespaceDefinition4734 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNamespaceDefinition4750 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_ruleNamespaceDefinition4770 = new BitSet(new long[]{0xFFFF894000000100L,0x00000000050EF7FFL,0x0000000000037000L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleNamespaceDefinition4793 = new BitSet(new long[]{0xFFFF894000000100L,0x00000000050EF7FFL,0x0000000000037000L});
    public static final BitSet FOLLOW_76_in_ruleNamespaceDefinition4813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespaceAliasDefinition_in_entryRuleNamespaceAliasDefinition4854 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamespaceAliasDefinition4865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleNamespaceAliasDefinition4903 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNamespaceAliasDefinition4918 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleNamespaceAliasDefinition4936 = new BitSet(new long[]{0x0400000000000100L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ruleQualifiedNamespaceSpecifier_in_ruleNamespaceAliasDefinition4958 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleNamespaceAliasDefinition4976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNamespaceSpecifier_in_entryRuleQualifiedNamespaceSpecifier5017 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNamespaceSpecifier5028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleQualifiedNamespaceSpecifier5067 = new BitSet(new long[]{0x0400000000000100L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ruleNestedNameSpecifier_in_ruleQualifiedNamespaceSpecifier5092 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedNamespaceSpecifier5114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsingDeclaration_in_entryRuleUsingDeclaration5160 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUsingDeclaration5171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleUsingDeclaration5209 = new BitSet(new long[]{0x0400000000000100L,0x0000000000040000L,0x0000000000020000L});
    public static final BitSet FOLLOW_58_in_ruleUsingDeclaration5223 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_82_in_ruleUsingDeclaration5244 = new BitSet(new long[]{0x0400000000000100L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_58_in_ruleUsingDeclaration5260 = new BitSet(new long[]{0x0400000000000100L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ruleNestedNameSpecifier_in_ruleUsingDeclaration5284 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleUnqualifiedId_in_ruleUsingDeclaration5313 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleUsingDeclaration5331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsmDefinition_in_entryRuleAsmDefinition5374 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAsmDefinition5385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleAsmDefinition5423 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleAsmDefinition5436 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_LITERAL_in_ruleAsmDefinition5451 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleAsmDefinition5469 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleAsmDefinition5482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkageSpecification_in_entryRuleLinkageSpecification5523 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLinkageSpecification5534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleLinkageSpecification5572 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_LITERAL_in_ruleLinkageSpecification5587 = new BitSet(new long[]{0xFFFF894000000100L,0x00000000050EEFFFL,0x0000000000037000L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleLinkageSpecification5615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleLinkageSpecification5640 = new BitSet(new long[]{0xFFFF894000000100L,0x00000000050EF7FFL,0x0000000000037000L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleLinkageSpecification5663 = new BitSet(new long[]{0xFFFF894000000100L,0x00000000050EF7FFL,0x0000000000037000L});
    public static final BitSet FOLLOW_76_in_ruleLinkageSpecification5683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitDeclaratorList_in_entryRuleInitDeclaratorList5726 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInitDeclaratorList5737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitDeclarator_in_ruleInitDeclaratorList5784 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_ruleInitDeclaratorList5803 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleInitDeclarator_in_ruleInitDeclaratorList5825 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_ruleInitDeclarator_in_entryRuleInitDeclarator5873 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInitDeclarator5884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaratorId_in_ruleInitDeclarator5931 = new BitSet(new long[]{0x0000108000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleInitializer_in_ruleInitDeclarator5959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDeclarator_in_entryRuleFunctionDeclarator6007 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionDeclarator6018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaratorId_in_ruleFunctionDeclarator6065 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ruleParametersAndQualifiers_in_ruleFunctionDeclarator6092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParametersAndQualifiers_in_entryRuleParametersAndQualifiers6138 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParametersAndQualifiers6149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleParametersAndQualifiers6187 = new BitSet(new long[]{0xF7FFC00000000100L,0x000000000504E7FFL,0x0000000000024000L});
    public static final BitSet FOLLOW_ruleParameterDeclarationClause_in_ruleParametersAndQualifiers6210 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleParametersAndQualifiers6230 = new BitSet(new long[]{0x0000000000000002L,0x0000000000F00000L,0x0000000000000600L});
    public static final BitSet FOLLOW_84_in_ruleParametersAndQualifiers6244 = new BitSet(new long[]{0x0000000000000002L,0x0000000000C00000L,0x0000000000000600L});
    public static final BitSet FOLLOW_85_in_ruleParametersAndQualifiers6263 = new BitSet(new long[]{0x0000000000000002L,0x0000000000C00000L,0x0000000000000600L});
    public static final BitSet FOLLOW_86_in_ruleParametersAndQualifiers6279 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000600L});
    public static final BitSet FOLLOW_87_in_ruleParametersAndQualifiers6298 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000600L});
    public static final BitSet FOLLOW_ruleExceptionSpecification_in_ruleParametersAndQualifiers6323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaratorId_in_entryRuleDeclaratorId6371 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaratorId6382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleDeclaratorId6421 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleIdExpression_in_ruleDeclaratorId6445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeId_in_entryRuleTypeId6491 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeId6502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeSpecifier_in_ruleTypeId6549 = new BitSet(new long[]{0xF400000000000102L,0x000000000404E7FFL,0x0000000000024000L});
    public static final BitSet FOLLOW_ruleParameterDeclarationClause_in_entryRuleParameterDeclarationClause6596 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterDeclarationClause6607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleParameterDeclarationClause6645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclarationList_in_ruleParameterDeclarationClause6674 = new BitSet(new long[]{0x0000200000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_45_in_ruleParameterDeclarationClause6694 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_ruleParameterDeclarationClause6709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclarationList_in_entryRuleParameterDeclarationList6753 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterDeclarationList6764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleParameterDeclarationList6811 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_ruleParameterDeclarationList6830 = new BitSet(new long[]{0xF7FF800000000100L,0x000000000504E7FFL,0x0000000000024000L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleParameterDeclarationList6852 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_entryRuleParameterDeclaration6900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterDeclaration6911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarationSpecifier_in_ruleParameterDeclaration6959 = new BitSet(new long[]{0xF7FF800000000100L,0x000000000504E7FFL,0x0000000000034000L});
    public static final BitSet FOLLOW_ruleInitDeclarator_in_ruleParameterDeclaration6988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionBody_in_entryRuleFunctionBody7034 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionBody7045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCtorInitializer_in_ruleFunctionBody7094 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000180000L});
    public static final BitSet FOLLOW_ruleCompoundStatement_in_ruleFunctionBody7123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionTryBlock_in_ruleFunctionBody7157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitializer_in_entryRuleInitializer7203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInitializer7214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBraceOrEqualInitializer_in_ruleInitializer7261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleInitializer7286 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleExpressionList_in_ruleInitializer7308 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleInitializer7326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBraceOrEqualInitializer_in_entryRuleBraceOrEqualInitializer7368 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBraceOrEqualInitializer7379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleBraceOrEqualInitializer7418 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000800L,0x0000000000040000L});
    public static final BitSet FOLLOW_ruleInitializerClause_in_ruleBraceOrEqualInitializer7440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBracedInitializerList_in_ruleBraceOrEqualInitializer7474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitializerClause_in_entryRuleInitializerClause7520 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInitializerClause7531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_ruleInitializerClause7578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBracedInitializerList_in_ruleInitializerClause7611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitializerList_in_entryRuleInitializerList7657 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInitializerList7668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitializerClause_in_ruleInitializerList7715 = new BitSet(new long[]{0x0000200000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_ruleInitializerList7734 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_ruleInitializerList7750 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000800L,0x0000000000040000L});
    public static final BitSet FOLLOW_ruleInitializerClause_in_ruleInitializerList7772 = new BitSet(new long[]{0x0000200000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_ruleInitializerList7791 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_ruleBracedInitializerList_in_entryRuleBracedInitializerList7836 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBracedInitializerList7847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleBracedInitializerList7885 = new BitSet(new long[]{0x0000008000000000L,0x0000000000001800L,0x0000000000040000L});
    public static final BitSet FOLLOW_ruleInitializerList_in_ruleBracedInitializerList7908 = new BitSet(new long[]{0x0000200000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_45_in_ruleBracedInitializerList7927 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_ruleBracedInitializerList7944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassSpecifier_in_entryRuleClassSpecifier7985 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassSpecifier7996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassHead_in_ruleClassSpecifier8043 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_ruleClassSpecifier8061 = new BitSet(new long[]{0xFFFF894000000100L,0x00000001C50EF7FFL,0x0000000000034000L});
    public static final BitSet FOLLOW_ruleMemberSpecification_in_ruleClassSpecifier8084 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_ruleClassSpecifier8104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassHead_in_entryRuleClassHead8145 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassHead8156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassKey_in_ruleClassHead8203 = new BitSet(new long[]{0x0400000000000102L,0x0000000000010000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ruleNestedNameSpecifier_in_ruleClassHead8232 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleTypeName_in_ruleClassHead8261 = new BitSet(new long[]{0x0200000000000002L,0x0000000002010000L});
    public static final BitSet FOLLOW_ruleClassVirtualSpecifier_in_ruleClassHead8289 = new BitSet(new long[]{0x0200000000000002L,0x0000000002010000L});
    public static final BitSet FOLLOW_ruleBaseClause_in_ruleClassHead8321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassVirtualSpecifier_in_entryRuleClassVirtualSpecifier8369 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassVirtualSpecifier8380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleClassVirtualSpecifier8418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleClassVirtualSpecifier8437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassKey_in_entryRuleClassKey8478 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassKey8489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleClassKey8527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleClassKey8546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleClassKey8565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMemberSpecification_in_entryRuleMemberSpecification8606 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMemberSpecification8617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMemberDeclaration_in_ruleMemberSpecification8665 = new BitSet(new long[]{0xFFFF894000000102L,0x00000001C50EE7FFL,0x0000000000034000L});
    public static final BitSet FOLLOW_ruleAccessSpecifier_in_ruleMemberSpecification8699 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleMemberSpecification8717 = new BitSet(new long[]{0xFFFF894000000102L,0x00000001C50EE7FFL,0x0000000000034000L});
    public static final BitSet FOLLOW_ruleMemberSpecification_in_ruleMemberSpecification8742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMemberDeclaration_in_entryRuleMemberDeclaration8790 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMemberDeclaration8801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMemberOrFunctionDeclaration_in_ruleMemberDeclaration8848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsingDeclaration_in_ruleMemberDeclaration8881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticAssertDeclaration_in_ruleMemberDeclaration8914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateDeclaration_in_ruleMemberDeclaration8947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAliasDeclaration_in_ruleMemberDeclaration8980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMemberOrFunctionDeclaration_in_entryRuleMemberOrFunctionDeclaration9026 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMemberOrFunctionDeclaration9037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarationSpecifier_in_ruleMemberOrFunctionDeclaration9085 = new BitSet(new long[]{0xF7FF810000000100L,0x000000000504E7FFL,0x0000000000034000L});
    public static final BitSet FOLLOW_ruleFunctionDeclarationSuffix_in_ruleMemberOrFunctionDeclaration9115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMemberDeclarationSuffix_in_ruleMemberOrFunctionDeclaration9149 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleMemberOrFunctionDeclaration9167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMemberDeclarationSuffix_in_entryRuleMemberDeclarationSuffix9210 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMemberDeclarationSuffix9221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMemberDeclaratorList_in_ruleMemberDeclarationSuffix9268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMemberDeclaratorList_in_entryRuleMemberDeclaratorList9315 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMemberDeclaratorList9326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMemberDeclarator_in_ruleMemberDeclaratorList9373 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_ruleMemberDeclaratorList9392 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleMemberDeclarator_in_ruleMemberDeclaratorList9414 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_ruleMemberDeclarator_in_entryRuleMemberDeclarator9462 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMemberDeclarator9473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaratorId_in_ruleMemberDeclarator9520 = new BitSet(new long[]{0x0000008000000002L,0x000000001A000800L});
    public static final BitSet FOLLOW_ruleVirtualSpecifier_in_ruleMemberDeclarator9548 = new BitSet(new long[]{0x0000008000000002L,0x000000001A000800L});
    public static final BitSet FOLLOW_rulePureSpecifier_in_ruleMemberDeclarator9579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBraceOrEqualInitializer_in_ruleMemberDeclarator9614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVirtualSpecifier_in_entryRuleVirtualSpecifier9661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVirtualSpecifier9672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleVirtualSpecifier9710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleVirtualSpecifier9729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleVirtualSpecifier9748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePureSpecifier_in_entryRulePureSpecifier9789 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePureSpecifier9800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rulePureSpecifier9838 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_rulePureSpecifier9851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseClause_in_entryRuleBaseClause9892 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBaseClause9903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleBaseClause9941 = new BitSet(new long[]{0xFFFF894000000100L,0x00000001C50EE7FFL,0x0000000000034000L});
    public static final BitSet FOLLOW_ruleBaseSpecifierList_in_ruleBaseClause9963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseSpecifierList_in_entryRuleBaseSpecifierList10009 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBaseSpecifierList10020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseSpecifier_in_ruleBaseSpecifierList10067 = new BitSet(new long[]{0x0000200000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_ruleBaseSpecifierList10086 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_ruleBaseSpecifierList10102 = new BitSet(new long[]{0xFFFF894000000100L,0x00000001C50EE7FFL,0x0000000000034000L});
    public static final BitSet FOLLOW_ruleBaseSpecifier_in_ruleBaseSpecifierList10124 = new BitSet(new long[]{0x0000200000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_ruleBaseSpecifierList10143 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_ruleBaseSpecifier_in_entryRuleBaseSpecifier10188 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBaseSpecifier10199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleBaseSpecifier10239 = new BitSet(new long[]{0xFFFF894000000100L,0x00000001C50EE7FFL,0x0000000000034000L});
    public static final BitSet FOLLOW_ruleAccessSpecifier_in_ruleBaseSpecifier10262 = new BitSet(new long[]{0xFFFF894000000100L,0x00000001C50EE7FFL,0x0000000000034000L});
    public static final BitSet FOLLOW_ruleAccessSpecifier_in_ruleBaseSpecifier10299 = new BitSet(new long[]{0xFFFF894000000100L,0x00000001C50EE7FFL,0x0000000000034000L});
    public static final BitSet FOLLOW_56_in_ruleBaseSpecifier10318 = new BitSet(new long[]{0xFFFF894000000100L,0x00000001C50EE7FFL,0x0000000000034000L});
    public static final BitSet FOLLOW_ruleClassOrDeclarationType_in_ruleBaseSpecifier10345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassOrDeclarationType_in_entryRuleClassOrDeclarationType10391 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassOrDeclarationType10402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleClassOrDeclarationType10442 = new BitSet(new long[]{0x0400000000000100L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ruleNestedNameSpecifier_in_ruleClassOrDeclarationType10467 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleTypeName_in_ruleClassOrDeclarationType10496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarationTypeSpecifier_in_ruleClassOrDeclarationType10530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAccessSpecifier_in_entryRuleAccessSpecifier10576 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAccessSpecifier10587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleAccessSpecifier10625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleAccessSpecifier10644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleAccessSpecifier10663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperatorFunctionId_in_entryRuleOperatorFunctionId10704 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperatorFunctionId10715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleOperatorFunctionId10753 = new BitSet(new long[]{0x0000248000000000L,0xFFFFFFCC10C00000L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleOverloadableOperator_in_ruleOperatorFunctionId10775 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_ruleOperatorFunctionId10794 = new BitSet(new long[]{0xF400000000000100L,0x000000080504E7FFL,0x000000000003C000L});
    public static final BitSet FOLLOW_ruleConstantExpression_in_ruleOperatorFunctionId10817 = new BitSet(new long[]{0xF400000000000100L,0x000000080504E7FFL,0x000000000003C000L});
    public static final BitSet FOLLOW_ruleTypeSpecifier_in_ruleOperatorFunctionId10850 = new BitSet(new long[]{0xF400000000000100L,0x000000080504E7FFL,0x000000000003C000L});
    public static final BitSet FOLLOW_ruleIdExpression_in_ruleOperatorFunctionId10883 = new BitSet(new long[]{0xF400000000000100L,0x000000080504E7FFL,0x000000000003C000L});
    public static final BitSet FOLLOW_99_in_ruleOperatorFunctionId10903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOverloadableOperator_in_entryRuleOverloadableOperator10946 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOverloadableOperator10957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleOverloadableOperator10995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleOverloadableOperator11014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleOverloadableOperator11034 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_100_in_ruleOverloadableOperator11047 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_101_in_ruleOverloadableOperator11060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleOverloadableOperator11081 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_100_in_ruleOverloadableOperator11094 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_101_in_ruleOverloadableOperator11107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_ruleOverloadableOperator11127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_ruleOverloadableOperator11146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_ruleOverloadableOperator11165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_ruleOverloadableOperator11184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_ruleOverloadableOperator11203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_ruleOverloadableOperator11222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleOverloadableOperator11241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_ruleOverloadableOperator11260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_ruleOverloadableOperator11279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_ruleOverloadableOperator11298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOverloadableOperator11317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_ruleOverloadableOperator11336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_ruleOverloadableOperator11355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_ruleOverloadableOperator11374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_ruleOverloadableOperator11393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_ruleOverloadableOperator11412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_ruleOverloadableOperator11431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_ruleOverloadableOperator11450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_ruleOverloadableOperator11469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_ruleOverloadableOperator11488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_118_in_ruleOverloadableOperator11507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_ruleOverloadableOperator11526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_ruleOverloadableOperator11545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_ruleOverloadableOperator11564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_ruleOverloadableOperator11583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_ruleOverloadableOperator11602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_ruleOverloadableOperator11621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_ruleOverloadableOperator11640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_ruleOverloadableOperator11659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleOverloadableOperator11678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_ruleOverloadableOperator11697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_ruleOverloadableOperator11716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_ruleOverloadableOperator11735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleOverloadableOperator11754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_ruleOverloadableOperator11773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_ruleOverloadableOperator11792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_ruleOverloadableOperator11811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_ruleOverloadableOperator11830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralOperatorId_in_entryRuleLiteralOperatorId11871 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralOperatorId11882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleLiteralOperatorId11920 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_134_in_ruleLiteralOperatorId11933 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_134_in_ruleLiteralOperatorId11946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateDeclaration_in_entryRuleTemplateDeclaration11987 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateDeclaration11998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleTemplateDeclaration12036 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_ruleTemplateDeclaration12049 = new BitSet(new long[]{0xF7FF800000000100L,0x000000000504E7FFL,0x0000000000024000L});
    public static final BitSet FOLLOW_ruleTemplateParameterList_in_ruleTemplateDeclaration12071 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_ruleTemplateDeclaration12089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateParameterList_in_entryRuleTemplateParameterList12130 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateParameterList12141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateParameter_in_ruleTemplateParameterList12188 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_ruleTemplateParameterList12207 = new BitSet(new long[]{0xF7FF800000000100L,0x000000000504E7FFL,0x0000000000024000L});
    public static final BitSet FOLLOW_ruleTemplateParameter_in_ruleTemplateParameterList12229 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_ruleTemplateParameter_in_entryRuleTemplateParameter12277 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateParameter12288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeParameter_in_ruleTemplateParameter12335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleTemplateParameter12368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeParameter_in_entryRuleTypeParameter12414 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeParameter12425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleTypeParameter12464 = new BitSet(new long[]{0x0000008000000102L,0x0000000001000000L});
    public static final BitSet FOLLOW_82_in_ruleTypeParameter12483 = new BitSet(new long[]{0x0000008000000102L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_ruleTypeParameter12500 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeParameter12518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeParameter12549 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleTypeParameter12569 = new BitSet(new long[]{0xF400000000000100L,0x000000000404E7FFL,0x0000000000024000L});
    public static final BitSet FOLLOW_ruleTypeId_in_ruleTypeParameter12591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleTemplateId_in_entryRuleSimpleTemplateId12639 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleTemplateId12650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSimpleTemplateId12690 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_ruleSimpleTemplateId12708 = new BitSet(new long[]{0xF400000000000100L,0x000000000504E7FFL,0x000000000003C000L});
    public static final BitSet FOLLOW_ruleTemplateArgumentList_in_ruleSimpleTemplateId12730 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_ruleSimpleTemplateId12748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateArgumentList_in_entryRuleTemplateArgumentList12791 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateArgumentList12802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateArgument_in_ruleTemplateArgumentList12849 = new BitSet(new long[]{0x0000200000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_ruleTemplateArgumentList12868 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_ruleTemplateArgumentList12884 = new BitSet(new long[]{0xF400000000000100L,0x000000000504E7FFL,0x000000000003C000L});
    public static final BitSet FOLLOW_ruleTemplateArgument_in_ruleTemplateArgumentList12906 = new BitSet(new long[]{0x0000200000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_ruleTemplateArgumentList12925 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_ruleTemplateArgument_in_entryRuleTemplateArgument12970 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateArgument12981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantExpression_in_ruleTemplateArgument13028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeId_in_ruleTemplateArgument13061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdExpression_in_ruleTemplateArgument13094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypenameSpecifier_in_entryRuleTypenameSpecifier13140 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypenameSpecifier13151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleTypenameSpecifier13189 = new BitSet(new long[]{0x0400000000000100L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_58_in_ruleTypenameSpecifier13203 = new BitSet(new long[]{0x0400000000000100L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ruleNestedNameSpecifier_in_ruleTypenameSpecifier13227 = new BitSet(new long[]{0x0800000000000100L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypenameSpecifier13248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleTypenameSpecifier13274 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypenameSpecifier13291 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_ruleTypenameSpecifier13309 = new BitSet(new long[]{0xF400000000000100L,0x000000000504E7FFL,0x000000000003C000L});
    public static final BitSet FOLLOW_ruleTemplateArgumentList_in_ruleTypenameSpecifier13331 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_ruleTypenameSpecifier13349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionTryBlock_in_entryRuleFunctionTryBlock13394 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionTryBlock13405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_135_in_ruleFunctionTryBlock13443 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000180000L});
    public static final BitSet FOLLOW_ruleCtorInitializer_in_ruleFunctionTryBlock13466 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000180000L});
    public static final BitSet FOLLOW_ruleCompoundStatement_in_ruleFunctionTryBlock13495 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleHandler_in_ruleFunctionTryBlock13523 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleHandler_in_entryRuleHandler13571 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHandler13582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_136_in_ruleHandler13620 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleHandler13633 = new BitSet(new long[]{0xF400000000000100L,0x000000000504E7FFL,0x0000000000024000L});
    public static final BitSet FOLLOW_ruleExceptionDeclaration_in_ruleHandler13655 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleHandler13673 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000180000L});
    public static final BitSet FOLLOW_ruleCompoundStatement_in_ruleHandler13695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExceptionDeclaration_in_entryRuleExceptionDeclaration13741 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExceptionDeclaration13752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeSpecifier_in_ruleExceptionDeclaration13801 = new BitSet(new long[]{0xF400000000000102L,0x000000000504E7FFL,0x0000000000034000L});
    public static final BitSet FOLLOW_ruleDeclaratorId_in_ruleExceptionDeclaration13831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleExceptionDeclaration13858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExceptionSpecification_in_entryRuleExceptionSpecification13901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExceptionSpecification13912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDynamicExceptionSpecification_in_ruleExceptionSpecification13959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoexceptSpecification_in_ruleExceptionSpecification13992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDynamicExceptionSpecification_in_entryRuleDynamicExceptionSpecification14038 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDynamicExceptionSpecification14049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_ruleDynamicExceptionSpecification14087 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleDynamicExceptionSpecification14100 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ruleTypeIdList_in_ruleDynamicExceptionSpecification14122 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleDynamicExceptionSpecification14140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoexceptSpecification_in_entryRuleNoexceptSpecification14181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoexceptSpecification14192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_138_in_ruleNoexceptSpecification14230 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_ruleNoexceptSpecification14244 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleConstantExpression_in_ruleNoexceptSpecification14266 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleNoexceptSpecification14284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression14327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression14338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_139_in_ruleExpression14375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionList_in_entryRuleExpressionList14415 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionList14426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionList14473 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_ruleExpressionList14492 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionList14514 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_ruleExplicitSpecialization_in_entryRuleExplicitSpecialization14562 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExplicitSpecialization14573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_140_in_ruleExplicitSpecialization14610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExplicitInstantiation_in_entryRuleExplicitInstantiation14650 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExplicitInstantiation14661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_141_in_ruleExplicitInstantiation14698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCvQualifier_in_entryRuleCvQualifier14738 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCvQualifier14749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_142_in_ruleCvQualifier14786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantExpression_in_entryRuleConstantExpression14826 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantExpression14837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_143_in_ruleConstantExpression14874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdExpression_in_entryRuleIdExpression14914 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdExpression14925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_144_in_ruleIdExpression14962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNestedNameSpecifier_in_entryRuleNestedNameSpecifier15002 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNestedNameSpecifier15013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_145_in_ruleNestedNameSpecifier15050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression15090 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignmentExpression15101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_146_in_ruleAssignmentExpression15138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundStatement_in_entryRuleCompoundStatement15178 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompoundStatement15189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_147_in_ruleCompoundStatement15226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCtorInitializer_in_entryRuleCtorInitializer15266 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCtorInitializer15277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_148_in_ruleCtorInitializer15314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeIdList_in_entryRuleTypeIdList15354 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeIdList15365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_149_in_ruleTypeIdList15402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnqualifiedId_in_entryRuleUnqualifiedId15442 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnqualifiedId15453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_150_in_ruleUnqualifiedId15490 = new BitSet(new long[]{0x0000000000000002L});

}