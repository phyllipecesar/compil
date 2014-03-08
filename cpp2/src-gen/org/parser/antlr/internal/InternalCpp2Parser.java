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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_CHARACTER_LITERAL", "RULE_FLOATING_LITERAL", "RULE_STRING_LITERAL", "RULE_ID", "RULE_HEXADECIMAL_DIGIT", "RULE_HEX_QUAD", "RULE_UNIVERSAL_CHARACTER_NAME", "RULE_KEYWORD", "RULE_PREPROCESSING_OP_OR_PUNC", "RULE_NONDIGIT", "RULE_DIGIT", "RULE_DECIMAL_LITERAL", "RULE_OCTAL_LITERAL", "RULE_HEXADECIMAL_LITERAL", "RULE_INTEGER_SUFFIX", "RULE_OCTAL_DIGIT", "RULE_C_CHAR", "RULE_ESCAPE_SEQUENCE", "RULE_SIMPLE_ESCAPE_SEQUENCE", "RULE_OCTAL_ESCAPE_SEQUENCE", "RULE_HEXADECIMAL_ESCAPE_SEQUENCE", "RULE_FRACTIONAL_CONSTANT", "RULE_EXPONENT_PART", "RULE_ENC_PREFIX", "RULE_SCHAR", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'nullptr'", "'using'", "'='", "';'", "'default'", "'delete'", "'static_assert'", "'('", "','", "')'", "'friend'", "'typedef'", "'constexpr'", "'register'", "'static'", "'thread_local'", "'extern'", "'mutable'", "'inline'", "'virtual'", "'explicit'", "'::'", "'template'", "'char'", "'char16_t'", "'char32_t'", "'wchar_t'", "'bool'", "'short'", "'int'", "'long'", "'signed'", "'unsigned'", "'float'", "'double'", "'void'", "'auto'", "'decltype'", "'{'", "'}'", "'enum'", "'class'", "'struct'", "':'", "'namespace'", "'typename'", "'asm'", "'const'", "'volatile'", "'&'", "'&&'", "'...'", "'operator'", "'<'", "'>'", "'new'", "'['", "']'", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'|'", "'~'", "'!'", "'+='", "'-='", "'*='", "'/='", "'%='", "'^='", "'&='", "'|='", "'<<'", "'>>'", "'>>='", "'<<='", "'=='", "'!='", "'<='", "'>='", "'||'", "'++'", "'--'", "'->*'", "'->'", "'()'", "'[]'", "'\"'", "'try'", "'catch'", "'throw'", "'noexcept'", "'Expression'", "'ClassKey'", "'ExplicitSpecialization'", "'ExplicitInstantiation'", "'ClassSpecifier'", "'CvQualifier'", "'ConstantExpression'", "'IdExpression'", "'NestedNameSpecifier'", "'AssignmentExpression'", "'CompoundStatement'", "'CtorInitializer'", "'TypeIdList'", "'UnqualifiedId'", "'ClassName'", "'Initializer'"
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
    public static final int T__147=147;
    public static final int T__90=90;
    public static final int RULE_KEYWORD=12;
    public static final int RULE_DECIMAL_LITERAL=16;
    public static final int RULE_OCTAL_LITERAL=17;
    public static final int RULE_NONDIGIT=14;
    public static final int T__99=99;
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

                if ( (LA1_0==RULE_ID||LA1_0==38||LA1_0==40||LA1_0==43||(LA1_0>=47 && LA1_0<=58)||(LA1_0>=59 && LA1_0<=74)||LA1_0==77||(LA1_0>=81 && LA1_0<=83)||LA1_0==88||(LA1_0>=133 && LA1_0<=137)||(LA1_0>=139 && LA1_0<=140)||LA1_0==146) ) {
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

                if ( (LA5_3==RULE_ID) ) {
                    alt5=5;
                }
                else if ( (LA5_3==58||LA5_3==82||LA5_3==140) ) {
                    alt5=3;
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

                if ( (LA6_0==RULE_ID||(LA6_0>=47 && LA6_0<=58)||(LA6_0>=60 && LA6_0<=74)||LA6_0==77||LA6_0==82||LA6_0==133||(LA6_0>=136 && LA6_0<=137)||LA6_0==140||LA6_0==146) ) {
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

                if ( (LA7_0==RULE_ID||(LA7_0>=47 && LA7_0<=58)||(LA7_0>=60 && LA7_0<=74)||LA7_0==77||LA7_0==82||LA7_0==133||(LA7_0>=136 && LA7_0<=137)||LA7_0==140||LA7_0==146) ) {
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

                if ( (LA8_1==139) ) {
                    int LA8_2 = input.LA(3);

                    if ( (LA8_2==44) ) {
                        alt8=2;
                    }
                    else if ( (LA8_2==40||LA8_2==45||LA8_2==147) ) {
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
            case 139:
                {
                int LA8_2 = input.LA(2);

                if ( (LA8_2==44) ) {
                    alt8=2;
                }
                else if ( (LA8_2==40||LA8_2==45||LA8_2==147) ) {
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

            if ( (LA9_0==88||LA9_0==139) ) {
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

            if ( (LA10_0==128||(LA10_0>=142 && LA10_0<=143)) ) {
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
            case 82:
            case 133:
            case 136:
            case 137:
            case 140:
            case 146:
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
            case 133:
            case 137:
            case 140:
            case 146:
                {
                alt14=1;
                }
                break;
            case 136:
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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:947:1: ruleTrailingTypeSpecifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SimpleTypeSpecifier_0= ruleSimpleTypeSpecifier | this_ElaboratedTypeSpecifier_1= ruleElaboratedTypeSpecifier | this_TypenameSpecifier_2= ruleTypenameSpecifier | this_CvQualifier_3= ruleCvQualifier ) ;
    public final AntlrDatatypeRuleToken ruleTrailingTypeSpecifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_SimpleTypeSpecifier_0 = null;

        AntlrDatatypeRuleToken this_ElaboratedTypeSpecifier_1 = null;

        AntlrDatatypeRuleToken this_TypenameSpecifier_2 = null;

        AntlrDatatypeRuleToken this_CvQualifier_3 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:950:28: ( (this_SimpleTypeSpecifier_0= ruleSimpleTypeSpecifier | this_ElaboratedTypeSpecifier_1= ruleElaboratedTypeSpecifier | this_TypenameSpecifier_2= ruleTypenameSpecifier | this_CvQualifier_3= ruleCvQualifier ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:951:1: (this_SimpleTypeSpecifier_0= ruleSimpleTypeSpecifier | this_ElaboratedTypeSpecifier_1= ruleElaboratedTypeSpecifier | this_TypenameSpecifier_2= ruleTypenameSpecifier | this_CvQualifier_3= ruleCvQualifier )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:951:1: (this_SimpleTypeSpecifier_0= ruleSimpleTypeSpecifier | this_ElaboratedTypeSpecifier_1= ruleElaboratedTypeSpecifier | this_TypenameSpecifier_2= ruleTypenameSpecifier | this_CvQualifier_3= ruleCvQualifier )
            int alt15=4;
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
            case 140:
            case 146:
                {
                alt15=1;
                }
                break;
            case 133:
                {
                alt15=2;
                }
                break;
            case 82:
                {
                alt15=3;
                }
                break;
            case 137:
                {
                alt15=4;
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
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:964:5: this_ElaboratedTypeSpecifier_1= ruleElaboratedTypeSpecifier
                    {
                     
                            newCompositeNode(grammarAccess.getTrailingTypeSpecifierAccess().getElaboratedTypeSpecifierParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleElaboratedTypeSpecifier_in_ruleTrailingTypeSpecifier2723);
                    this_ElaboratedTypeSpecifier_1=ruleElaboratedTypeSpecifier();

                    state._fsp--;


                    		current.merge(this_ElaboratedTypeSpecifier_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:976:5: this_TypenameSpecifier_2= ruleTypenameSpecifier
                    {
                     
                            newCompositeNode(grammarAccess.getTrailingTypeSpecifierAccess().getTypenameSpecifierParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleTypenameSpecifier_in_ruleTrailingTypeSpecifier2756);
                    this_TypenameSpecifier_2=ruleTypenameSpecifier();

                    state._fsp--;


                    		current.merge(this_TypenameSpecifier_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:988:5: this_CvQualifier_3= ruleCvQualifier
                    {
                     
                            newCompositeNode(grammarAccess.getTrailingTypeSpecifierAccess().getCvQualifierParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleCvQualifier_in_ruleTrailingTypeSpecifier2789);
                    this_CvQualifier_3=ruleCvQualifier();

                    state._fsp--;


                    		current.merge(this_CvQualifier_3);
                        
                     
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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1006:1: entryRuleSimpleTypeSpecifier returns [String current=null] : iv_ruleSimpleTypeSpecifier= ruleSimpleTypeSpecifier EOF ;
    public final String entryRuleSimpleTypeSpecifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSimpleTypeSpecifier = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1007:2: (iv_ruleSimpleTypeSpecifier= ruleSimpleTypeSpecifier EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1008:2: iv_ruleSimpleTypeSpecifier= ruleSimpleTypeSpecifier EOF
            {
             newCompositeNode(grammarAccess.getSimpleTypeSpecifierRule()); 
            pushFollow(FOLLOW_ruleSimpleTypeSpecifier_in_entryRuleSimpleTypeSpecifier2835);
            iv_ruleSimpleTypeSpecifier=ruleSimpleTypeSpecifier();

            state._fsp--;

             current =iv_ruleSimpleTypeSpecifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleTypeSpecifier2846); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1015:1: ruleSimpleTypeSpecifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= '::' )? (this_TypeName_1= ruleTypeName | (this_NestedNameSpecifier_2= ruleNestedNameSpecifier (this_TypeName_3= ruleTypeName | (kw= 'template' this_SimpleTemplateId_5= ruleSimpleTemplateId ) ) ) ) ) | kw= 'char' | kw= 'char16_t' | kw= 'char32_t' | kw= 'wchar_t' | kw= 'bool' | kw= 'short' | kw= 'int' | kw= 'long' | kw= 'signed' | kw= 'unsigned' | kw= 'float' | kw= 'double' | kw= 'void' | kw= 'auto' | this_DeclarationTypeSpecifier_20= ruleDeclarationTypeSpecifier ) ;
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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1018:28: ( ( ( (kw= '::' )? (this_TypeName_1= ruleTypeName | (this_NestedNameSpecifier_2= ruleNestedNameSpecifier (this_TypeName_3= ruleTypeName | (kw= 'template' this_SimpleTemplateId_5= ruleSimpleTemplateId ) ) ) ) ) | kw= 'char' | kw= 'char16_t' | kw= 'char32_t' | kw= 'wchar_t' | kw= 'bool' | kw= 'short' | kw= 'int' | kw= 'long' | kw= 'signed' | kw= 'unsigned' | kw= 'float' | kw= 'double' | kw= 'void' | kw= 'auto' | this_DeclarationTypeSpecifier_20= ruleDeclarationTypeSpecifier ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1019:1: ( ( (kw= '::' )? (this_TypeName_1= ruleTypeName | (this_NestedNameSpecifier_2= ruleNestedNameSpecifier (this_TypeName_3= ruleTypeName | (kw= 'template' this_SimpleTemplateId_5= ruleSimpleTemplateId ) ) ) ) ) | kw= 'char' | kw= 'char16_t' | kw= 'char32_t' | kw= 'wchar_t' | kw= 'bool' | kw= 'short' | kw= 'int' | kw= 'long' | kw= 'signed' | kw= 'unsigned' | kw= 'float' | kw= 'double' | kw= 'void' | kw= 'auto' | this_DeclarationTypeSpecifier_20= ruleDeclarationTypeSpecifier )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1019:1: ( ( (kw= '::' )? (this_TypeName_1= ruleTypeName | (this_NestedNameSpecifier_2= ruleNestedNameSpecifier (this_TypeName_3= ruleTypeName | (kw= 'template' this_SimpleTemplateId_5= ruleSimpleTemplateId ) ) ) ) ) | kw= 'char' | kw= 'char16_t' | kw= 'char32_t' | kw= 'wchar_t' | kw= 'bool' | kw= 'short' | kw= 'int' | kw= 'long' | kw= 'signed' | kw= 'unsigned' | kw= 'float' | kw= 'double' | kw= 'void' | kw= 'auto' | this_DeclarationTypeSpecifier_20= ruleDeclarationTypeSpecifier )
            int alt19=16;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 58:
            case 140:
            case 146:
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
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1019:2: ( (kw= '::' )? (this_TypeName_1= ruleTypeName | (this_NestedNameSpecifier_2= ruleNestedNameSpecifier (this_TypeName_3= ruleTypeName | (kw= 'template' this_SimpleTemplateId_5= ruleSimpleTemplateId ) ) ) ) )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1019:2: ( (kw= '::' )? (this_TypeName_1= ruleTypeName | (this_NestedNameSpecifier_2= ruleNestedNameSpecifier (this_TypeName_3= ruleTypeName | (kw= 'template' this_SimpleTemplateId_5= ruleSimpleTemplateId ) ) ) ) )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1019:3: (kw= '::' )? (this_TypeName_1= ruleTypeName | (this_NestedNameSpecifier_2= ruleNestedNameSpecifier (this_TypeName_3= ruleTypeName | (kw= 'template' this_SimpleTemplateId_5= ruleSimpleTemplateId ) ) ) )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1019:3: (kw= '::' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==58) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1020:2: kw= '::'
                            {
                            kw=(Token)match(input,58,FOLLOW_58_in_ruleSimpleTypeSpecifier2886); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getSimpleTypeSpecifierAccess().getColonColonKeyword_0_0()); 
                                

                            }
                            break;

                    }

                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1025:3: (this_TypeName_1= ruleTypeName | (this_NestedNameSpecifier_2= ruleNestedNameSpecifier (this_TypeName_3= ruleTypeName | (kw= 'template' this_SimpleTemplateId_5= ruleSimpleTemplateId ) ) ) )
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==RULE_ID||LA18_0==146) ) {
                        alt18=1;
                    }
                    else if ( (LA18_0==140) ) {
                        alt18=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 0, input);

                        throw nvae;
                    }
                    switch (alt18) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1026:5: this_TypeName_1= ruleTypeName
                            {
                             
                                    newCompositeNode(grammarAccess.getSimpleTypeSpecifierAccess().getTypeNameParserRuleCall_0_1_0()); 
                                
                            pushFollow(FOLLOW_ruleTypeName_in_ruleSimpleTypeSpecifier2911);
                            this_TypeName_1=ruleTypeName();

                            state._fsp--;


                            		current.merge(this_TypeName_1);
                                
                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;
                        case 2 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1037:6: (this_NestedNameSpecifier_2= ruleNestedNameSpecifier (this_TypeName_3= ruleTypeName | (kw= 'template' this_SimpleTemplateId_5= ruleSimpleTemplateId ) ) )
                            {
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1037:6: (this_NestedNameSpecifier_2= ruleNestedNameSpecifier (this_TypeName_3= ruleTypeName | (kw= 'template' this_SimpleTemplateId_5= ruleSimpleTemplateId ) ) )
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1038:5: this_NestedNameSpecifier_2= ruleNestedNameSpecifier (this_TypeName_3= ruleTypeName | (kw= 'template' this_SimpleTemplateId_5= ruleSimpleTemplateId ) )
                            {
                             
                                    newCompositeNode(grammarAccess.getSimpleTypeSpecifierAccess().getNestedNameSpecifierParserRuleCall_0_1_1_0()); 
                                
                            pushFollow(FOLLOW_ruleNestedNameSpecifier_in_ruleSimpleTypeSpecifier2945);
                            this_NestedNameSpecifier_2=ruleNestedNameSpecifier();

                            state._fsp--;


                            		current.merge(this_NestedNameSpecifier_2);
                                
                             
                                    afterParserOrEnumRuleCall();
                                
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1048:1: (this_TypeName_3= ruleTypeName | (kw= 'template' this_SimpleTemplateId_5= ruleSimpleTemplateId ) )
                            int alt17=2;
                            int LA17_0 = input.LA(1);

                            if ( (LA17_0==RULE_ID||LA17_0==146) ) {
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
                                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1049:5: this_TypeName_3= ruleTypeName
                                    {
                                     
                                            newCompositeNode(grammarAccess.getSimpleTypeSpecifierAccess().getTypeNameParserRuleCall_0_1_1_1_0()); 
                                        
                                    pushFollow(FOLLOW_ruleTypeName_in_ruleSimpleTypeSpecifier2973);
                                    this_TypeName_3=ruleTypeName();

                                    state._fsp--;


                                    		current.merge(this_TypeName_3);
                                        
                                     
                                            afterParserOrEnumRuleCall();
                                        

                                    }
                                    break;
                                case 2 :
                                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1060:6: (kw= 'template' this_SimpleTemplateId_5= ruleSimpleTemplateId )
                                    {
                                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1060:6: (kw= 'template' this_SimpleTemplateId_5= ruleSimpleTemplateId )
                                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1061:2: kw= 'template' this_SimpleTemplateId_5= ruleSimpleTemplateId
                                    {
                                    kw=(Token)match(input,59,FOLLOW_59_in_ruleSimpleTypeSpecifier2998); 

                                            current.merge(kw);
                                            newLeafNode(kw, grammarAccess.getSimpleTypeSpecifierAccess().getTemplateKeyword_0_1_1_1_1_0()); 
                                        
                                     
                                            newCompositeNode(grammarAccess.getSimpleTypeSpecifierAccess().getSimpleTemplateIdParserRuleCall_0_1_1_1_1_1()); 
                                        
                                    pushFollow(FOLLOW_ruleSimpleTemplateId_in_ruleSimpleTypeSpecifier3020);
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
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1079:2: kw= 'char'
                    {
                    kw=(Token)match(input,60,FOLLOW_60_in_ruleSimpleTypeSpecifier3049); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSimpleTypeSpecifierAccess().getCharKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1086:2: kw= 'char16_t'
                    {
                    kw=(Token)match(input,61,FOLLOW_61_in_ruleSimpleTypeSpecifier3068); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSimpleTypeSpecifierAccess().getChar16_tKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1093:2: kw= 'char32_t'
                    {
                    kw=(Token)match(input,62,FOLLOW_62_in_ruleSimpleTypeSpecifier3087); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSimpleTypeSpecifierAccess().getChar32_tKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1100:2: kw= 'wchar_t'
                    {
                    kw=(Token)match(input,63,FOLLOW_63_in_ruleSimpleTypeSpecifier3106); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSimpleTypeSpecifierAccess().getWchar_tKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1107:2: kw= 'bool'
                    {
                    kw=(Token)match(input,64,FOLLOW_64_in_ruleSimpleTypeSpecifier3125); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSimpleTypeSpecifierAccess().getBoolKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1114:2: kw= 'short'
                    {
                    kw=(Token)match(input,65,FOLLOW_65_in_ruleSimpleTypeSpecifier3144); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSimpleTypeSpecifierAccess().getShortKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1121:2: kw= 'int'
                    {
                    kw=(Token)match(input,66,FOLLOW_66_in_ruleSimpleTypeSpecifier3163); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSimpleTypeSpecifierAccess().getIntKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1128:2: kw= 'long'
                    {
                    kw=(Token)match(input,67,FOLLOW_67_in_ruleSimpleTypeSpecifier3182); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSimpleTypeSpecifierAccess().getLongKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1135:2: kw= 'signed'
                    {
                    kw=(Token)match(input,68,FOLLOW_68_in_ruleSimpleTypeSpecifier3201); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSimpleTypeSpecifierAccess().getSignedKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1142:2: kw= 'unsigned'
                    {
                    kw=(Token)match(input,69,FOLLOW_69_in_ruleSimpleTypeSpecifier3220); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSimpleTypeSpecifierAccess().getUnsignedKeyword_10()); 
                        

                    }
                    break;
                case 12 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1149:2: kw= 'float'
                    {
                    kw=(Token)match(input,70,FOLLOW_70_in_ruleSimpleTypeSpecifier3239); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSimpleTypeSpecifierAccess().getFloatKeyword_11()); 
                        

                    }
                    break;
                case 13 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1156:2: kw= 'double'
                    {
                    kw=(Token)match(input,71,FOLLOW_71_in_ruleSimpleTypeSpecifier3258); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSimpleTypeSpecifierAccess().getDoubleKeyword_12()); 
                        

                    }
                    break;
                case 14 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1163:2: kw= 'void'
                    {
                    kw=(Token)match(input,72,FOLLOW_72_in_ruleSimpleTypeSpecifier3277); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSimpleTypeSpecifierAccess().getVoidKeyword_13()); 
                        

                    }
                    break;
                case 15 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1170:2: kw= 'auto'
                    {
                    kw=(Token)match(input,73,FOLLOW_73_in_ruleSimpleTypeSpecifier3296); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSimpleTypeSpecifierAccess().getAutoKeyword_14()); 
                        

                    }
                    break;
                case 16 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1177:5: this_DeclarationTypeSpecifier_20= ruleDeclarationTypeSpecifier
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleTypeSpecifierAccess().getDeclarationTypeSpecifierParserRuleCall_15()); 
                        
                    pushFollow(FOLLOW_ruleDeclarationTypeSpecifier_in_ruleSimpleTypeSpecifier3324);
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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1195:1: entryRuleTypeName returns [String current=null] : iv_ruleTypeName= ruleTypeName EOF ;
    public final String entryRuleTypeName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeName = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1196:2: (iv_ruleTypeName= ruleTypeName EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1197:2: iv_ruleTypeName= ruleTypeName EOF
            {
             newCompositeNode(grammarAccess.getTypeNameRule()); 
            pushFollow(FOLLOW_ruleTypeName_in_entryRuleTypeName3370);
            iv_ruleTypeName=ruleTypeName();

            state._fsp--;

             current =iv_ruleTypeName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeName3381); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1204:1: ruleTypeName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ClassName_0= ruleClassName | this_SimpleTemplateId_1= ruleSimpleTemplateId | this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleTypeName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_2=null;
        AntlrDatatypeRuleToken this_ClassName_0 = null;

        AntlrDatatypeRuleToken this_SimpleTemplateId_1 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1207:28: ( (this_ClassName_0= ruleClassName | this_SimpleTemplateId_1= ruleSimpleTemplateId | this_ID_2= RULE_ID ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1208:1: (this_ClassName_0= ruleClassName | this_SimpleTemplateId_1= ruleSimpleTemplateId | this_ID_2= RULE_ID )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1208:1: (this_ClassName_0= ruleClassName | this_SimpleTemplateId_1= ruleSimpleTemplateId | this_ID_2= RULE_ID )
            int alt20=3;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==146) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_ID) ) {
                int LA20_2 = input.LA(2);

                if ( (LA20_2==EOF||LA20_2==RULE_ID||LA20_2==40||(LA20_2>=45 && LA20_2<=58)||(LA20_2>=60 && LA20_2<=75)||LA20_2==77||LA20_2==82||LA20_2==88||LA20_2==91||LA20_2==133||(LA20_2>=136 && LA20_2<=140)||LA20_2==146) ) {
                    alt20=3;
                }
                else if ( (LA20_2==90) ) {
                    alt20=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 2, input);

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
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1209:5: this_ClassName_0= ruleClassName
                    {
                     
                            newCompositeNode(grammarAccess.getTypeNameAccess().getClassNameParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleClassName_in_ruleTypeName3428);
                    this_ClassName_0=ruleClassName();

                    state._fsp--;


                    		current.merge(this_ClassName_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1221:5: this_SimpleTemplateId_1= ruleSimpleTemplateId
                    {
                     
                            newCompositeNode(grammarAccess.getTypeNameAccess().getSimpleTemplateIdParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSimpleTemplateId_in_ruleTypeName3461);
                    this_SimpleTemplateId_1=ruleSimpleTemplateId();

                    state._fsp--;


                    		current.merge(this_SimpleTemplateId_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1232:10: this_ID_2= RULE_ID
                    {
                    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeName3487); 

                    		current.merge(this_ID_2);
                        
                     
                        newLeafNode(this_ID_2, grammarAccess.getTypeNameAccess().getIDTerminalRuleCall_2()); 
                        

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1247:1: entryRuleDeclarationTypeSpecifier returns [String current=null] : iv_ruleDeclarationTypeSpecifier= ruleDeclarationTypeSpecifier EOF ;
    public final String entryRuleDeclarationTypeSpecifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDeclarationTypeSpecifier = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1248:2: (iv_ruleDeclarationTypeSpecifier= ruleDeclarationTypeSpecifier EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1249:2: iv_ruleDeclarationTypeSpecifier= ruleDeclarationTypeSpecifier EOF
            {
             newCompositeNode(grammarAccess.getDeclarationTypeSpecifierRule()); 
            pushFollow(FOLLOW_ruleDeclarationTypeSpecifier_in_entryRuleDeclarationTypeSpecifier3533);
            iv_ruleDeclarationTypeSpecifier=ruleDeclarationTypeSpecifier();

            state._fsp--;

             current =iv_ruleDeclarationTypeSpecifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclarationTypeSpecifier3544); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1256:1: ruleDeclarationTypeSpecifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'decltype' kw= '(' this_Expression_2= ruleExpression kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleDeclarationTypeSpecifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Expression_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1259:28: ( (kw= 'decltype' kw= '(' this_Expression_2= ruleExpression kw= ')' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1260:1: (kw= 'decltype' kw= '(' this_Expression_2= ruleExpression kw= ')' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1260:1: (kw= 'decltype' kw= '(' this_Expression_2= ruleExpression kw= ')' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1261:2: kw= 'decltype' kw= '(' this_Expression_2= ruleExpression kw= ')'
            {
            kw=(Token)match(input,74,FOLLOW_74_in_ruleDeclarationTypeSpecifier3582); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDeclarationTypeSpecifierAccess().getDecltypeKeyword_0()); 
                
            kw=(Token)match(input,44,FOLLOW_44_in_ruleDeclarationTypeSpecifier3595); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDeclarationTypeSpecifierAccess().getLeftParenthesisKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getDeclarationTypeSpecifierAccess().getExpressionParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleExpression_in_ruleDeclarationTypeSpecifier3617);
            this_Expression_2=ruleExpression();

            state._fsp--;


            		current.merge(this_Expression_2);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,46,FOLLOW_46_in_ruleDeclarationTypeSpecifier3635); 

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


    // $ANTLR start "entryRuleElaboratedTypeSpecifier"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1297:1: entryRuleElaboratedTypeSpecifier returns [String current=null] : iv_ruleElaboratedTypeSpecifier= ruleElaboratedTypeSpecifier EOF ;
    public final String entryRuleElaboratedTypeSpecifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleElaboratedTypeSpecifier = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1298:2: (iv_ruleElaboratedTypeSpecifier= ruleElaboratedTypeSpecifier EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1299:2: iv_ruleElaboratedTypeSpecifier= ruleElaboratedTypeSpecifier EOF
            {
             newCompositeNode(grammarAccess.getElaboratedTypeSpecifierRule()); 
            pushFollow(FOLLOW_ruleElaboratedTypeSpecifier_in_entryRuleElaboratedTypeSpecifier3676);
            iv_ruleElaboratedTypeSpecifier=ruleElaboratedTypeSpecifier();

            state._fsp--;

             current =iv_ruleElaboratedTypeSpecifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElaboratedTypeSpecifier3687); 

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
    // $ANTLR end "entryRuleElaboratedTypeSpecifier"


    // $ANTLR start "ruleElaboratedTypeSpecifier"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1306:1: ruleElaboratedTypeSpecifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ClassKey_0= ruleClassKey (kw= '::' )? (this_NestedNameSpecifier_2= ruleNestedNameSpecifier )? (this_ID_3= RULE_ID | ( (kw= 'template' )? this_SimpleTemplateId_5= ruleSimpleTemplateId ) ) ) ;
    public final AntlrDatatypeRuleToken ruleElaboratedTypeSpecifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_3=null;
        AntlrDatatypeRuleToken this_ClassKey_0 = null;

        AntlrDatatypeRuleToken this_NestedNameSpecifier_2 = null;

        AntlrDatatypeRuleToken this_SimpleTemplateId_5 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1309:28: ( (this_ClassKey_0= ruleClassKey (kw= '::' )? (this_NestedNameSpecifier_2= ruleNestedNameSpecifier )? (this_ID_3= RULE_ID | ( (kw= 'template' )? this_SimpleTemplateId_5= ruleSimpleTemplateId ) ) ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1310:1: (this_ClassKey_0= ruleClassKey (kw= '::' )? (this_NestedNameSpecifier_2= ruleNestedNameSpecifier )? (this_ID_3= RULE_ID | ( (kw= 'template' )? this_SimpleTemplateId_5= ruleSimpleTemplateId ) ) )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1310:1: (this_ClassKey_0= ruleClassKey (kw= '::' )? (this_NestedNameSpecifier_2= ruleNestedNameSpecifier )? (this_ID_3= RULE_ID | ( (kw= 'template' )? this_SimpleTemplateId_5= ruleSimpleTemplateId ) ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1311:5: this_ClassKey_0= ruleClassKey (kw= '::' )? (this_NestedNameSpecifier_2= ruleNestedNameSpecifier )? (this_ID_3= RULE_ID | ( (kw= 'template' )? this_SimpleTemplateId_5= ruleSimpleTemplateId ) )
            {
             
                    newCompositeNode(grammarAccess.getElaboratedTypeSpecifierAccess().getClassKeyParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleClassKey_in_ruleElaboratedTypeSpecifier3734);
            this_ClassKey_0=ruleClassKey();

            state._fsp--;


            		current.merge(this_ClassKey_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1321:1: (kw= '::' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==58) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1322:2: kw= '::'
                    {
                    kw=(Token)match(input,58,FOLLOW_58_in_ruleElaboratedTypeSpecifier3753); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getElaboratedTypeSpecifierAccess().getColonColonKeyword_1()); 
                        

                    }
                    break;

            }

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1327:3: (this_NestedNameSpecifier_2= ruleNestedNameSpecifier )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==140) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1328:5: this_NestedNameSpecifier_2= ruleNestedNameSpecifier
                    {
                     
                            newCompositeNode(grammarAccess.getElaboratedTypeSpecifierAccess().getNestedNameSpecifierParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleNestedNameSpecifier_in_ruleElaboratedTypeSpecifier3778);
                    this_NestedNameSpecifier_2=ruleNestedNameSpecifier();

                    state._fsp--;


                    		current.merge(this_NestedNameSpecifier_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1338:3: (this_ID_3= RULE_ID | ( (kw= 'template' )? this_SimpleTemplateId_5= ruleSimpleTemplateId ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==90) ) {
                    alt24=2;
                }
                else if ( (LA24_1==EOF||LA24_1==RULE_ID||LA24_1==40||(LA24_1>=45 && LA24_1<=58)||(LA24_1>=60 && LA24_1<=75)||LA24_1==77||LA24_1==82||LA24_1==88||LA24_1==91||LA24_1==133||(LA24_1>=136 && LA24_1<=140)||LA24_1==146) ) {
                    alt24=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA24_0==59) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1338:8: this_ID_3= RULE_ID
                    {
                    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleElaboratedTypeSpecifier3801); 

                    		current.merge(this_ID_3);
                        
                     
                        newLeafNode(this_ID_3, grammarAccess.getElaboratedTypeSpecifierAccess().getIDTerminalRuleCall_3_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1346:6: ( (kw= 'template' )? this_SimpleTemplateId_5= ruleSimpleTemplateId )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1346:6: ( (kw= 'template' )? this_SimpleTemplateId_5= ruleSimpleTemplateId )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1346:7: (kw= 'template' )? this_SimpleTemplateId_5= ruleSimpleTemplateId
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1346:7: (kw= 'template' )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==59) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1347:2: kw= 'template'
                            {
                            kw=(Token)match(input,59,FOLLOW_59_in_ruleElaboratedTypeSpecifier3827); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getElaboratedTypeSpecifierAccess().getTemplateKeyword_3_1_0()); 
                                

                            }
                            break;

                    }

                     
                            newCompositeNode(grammarAccess.getElaboratedTypeSpecifierAccess().getSimpleTemplateIdParserRuleCall_3_1_1()); 
                        
                    pushFollow(FOLLOW_ruleSimpleTemplateId_in_ruleElaboratedTypeSpecifier3851);
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
    // $ANTLR end "ruleElaboratedTypeSpecifier"


    // $ANTLR start "entryRuleEnumSpecifier"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1373:1: entryRuleEnumSpecifier returns [String current=null] : iv_ruleEnumSpecifier= ruleEnumSpecifier EOF ;
    public final String entryRuleEnumSpecifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEnumSpecifier = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1374:2: (iv_ruleEnumSpecifier= ruleEnumSpecifier EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1375:2: iv_ruleEnumSpecifier= ruleEnumSpecifier EOF
            {
             newCompositeNode(grammarAccess.getEnumSpecifierRule()); 
            pushFollow(FOLLOW_ruleEnumSpecifier_in_entryRuleEnumSpecifier3901);
            iv_ruleEnumSpecifier=ruleEnumSpecifier();

            state._fsp--;

             current =iv_ruleEnumSpecifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumSpecifier3912); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1382:1: ruleEnumSpecifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EnumHead_0= ruleEnumHead kw= '{' (this_EnumeratorList_2= ruleEnumeratorList (kw= ',' )? )? kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleEnumSpecifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_EnumHead_0 = null;

        AntlrDatatypeRuleToken this_EnumeratorList_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1385:28: ( (this_EnumHead_0= ruleEnumHead kw= '{' (this_EnumeratorList_2= ruleEnumeratorList (kw= ',' )? )? kw= '}' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1386:1: (this_EnumHead_0= ruleEnumHead kw= '{' (this_EnumeratorList_2= ruleEnumeratorList (kw= ',' )? )? kw= '}' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1386:1: (this_EnumHead_0= ruleEnumHead kw= '{' (this_EnumeratorList_2= ruleEnumeratorList (kw= ',' )? )? kw= '}' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1387:5: this_EnumHead_0= ruleEnumHead kw= '{' (this_EnumeratorList_2= ruleEnumeratorList (kw= ',' )? )? kw= '}'
            {
             
                    newCompositeNode(grammarAccess.getEnumSpecifierAccess().getEnumHeadParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleEnumHead_in_ruleEnumSpecifier3959);
            this_EnumHead_0=ruleEnumHead();

            state._fsp--;


            		current.merge(this_EnumHead_0);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,75,FOLLOW_75_in_ruleEnumSpecifier3977); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEnumSpecifierAccess().getLeftCurlyBracketKeyword_1()); 
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1403:1: (this_EnumeratorList_2= ruleEnumeratorList (kw= ',' )? )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1404:5: this_EnumeratorList_2= ruleEnumeratorList (kw= ',' )?
                    {
                     
                            newCompositeNode(grammarAccess.getEnumSpecifierAccess().getEnumeratorListParserRuleCall_2_0()); 
                        
                    pushFollow(FOLLOW_ruleEnumeratorList_in_ruleEnumSpecifier4000);
                    this_EnumeratorList_2=ruleEnumeratorList();

                    state._fsp--;


                    		current.merge(this_EnumeratorList_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1414:1: (kw= ',' )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==45) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1415:2: kw= ','
                            {
                            kw=(Token)match(input,45,FOLLOW_45_in_ruleEnumSpecifier4019); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEnumSpecifierAccess().getCommaKeyword_2_1()); 
                                

                            }
                            break;

                    }


                    }
                    break;

            }

            kw=(Token)match(input,76,FOLLOW_76_in_ruleEnumSpecifier4036); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1434:1: entryRuleEnumHead returns [String current=null] : iv_ruleEnumHead= ruleEnumHead EOF ;
    public final String entryRuleEnumHead() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEnumHead = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1435:2: (iv_ruleEnumHead= ruleEnumHead EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1436:2: iv_ruleEnumHead= ruleEnumHead EOF
            {
             newCompositeNode(grammarAccess.getEnumHeadRule()); 
            pushFollow(FOLLOW_ruleEnumHead_in_entryRuleEnumHead4077);
            iv_ruleEnumHead=ruleEnumHead();

            state._fsp--;

             current =iv_ruleEnumHead.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumHead4088); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1443:1: ruleEnumHead returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EnumKey_0= ruleEnumKey ( (this_ID_1= RULE_ID )? | (this_NestedNameSpecifier_2= ruleNestedNameSpecifier this_ID_3= RULE_ID ) ) (this_EnumBase_4= ruleEnumBase )? ) ;
    public final AntlrDatatypeRuleToken ruleEnumHead() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_1=null;
        Token this_ID_3=null;
        AntlrDatatypeRuleToken this_EnumKey_0 = null;

        AntlrDatatypeRuleToken this_NestedNameSpecifier_2 = null;

        AntlrDatatypeRuleToken this_EnumBase_4 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1446:28: ( (this_EnumKey_0= ruleEnumKey ( (this_ID_1= RULE_ID )? | (this_NestedNameSpecifier_2= ruleNestedNameSpecifier this_ID_3= RULE_ID ) ) (this_EnumBase_4= ruleEnumBase )? ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1447:1: (this_EnumKey_0= ruleEnumKey ( (this_ID_1= RULE_ID )? | (this_NestedNameSpecifier_2= ruleNestedNameSpecifier this_ID_3= RULE_ID ) ) (this_EnumBase_4= ruleEnumBase )? )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1447:1: (this_EnumKey_0= ruleEnumKey ( (this_ID_1= RULE_ID )? | (this_NestedNameSpecifier_2= ruleNestedNameSpecifier this_ID_3= RULE_ID ) ) (this_EnumBase_4= ruleEnumBase )? )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1448:5: this_EnumKey_0= ruleEnumKey ( (this_ID_1= RULE_ID )? | (this_NestedNameSpecifier_2= ruleNestedNameSpecifier this_ID_3= RULE_ID ) ) (this_EnumBase_4= ruleEnumBase )?
            {
             
                    newCompositeNode(grammarAccess.getEnumHeadAccess().getEnumKeyParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleEnumKey_in_ruleEnumHead4135);
            this_EnumKey_0=ruleEnumKey();

            state._fsp--;


            		current.merge(this_EnumKey_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1458:1: ( (this_ID_1= RULE_ID )? | (this_NestedNameSpecifier_2= ruleNestedNameSpecifier this_ID_3= RULE_ID ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==EOF||LA28_0==RULE_ID||LA28_0==75||LA28_0==80) ) {
                alt28=1;
            }
            else if ( (LA28_0==140) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1458:2: (this_ID_1= RULE_ID )?
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1458:2: (this_ID_1= RULE_ID )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==RULE_ID) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1458:7: this_ID_1= RULE_ID
                            {
                            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumHead4157); 

                            		current.merge(this_ID_1);
                                
                             
                                newLeafNode(this_ID_1, grammarAccess.getEnumHeadAccess().getIDTerminalRuleCall_1_0()); 
                                

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1466:6: (this_NestedNameSpecifier_2= ruleNestedNameSpecifier this_ID_3= RULE_ID )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1466:6: (this_NestedNameSpecifier_2= ruleNestedNameSpecifier this_ID_3= RULE_ID )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1467:5: this_NestedNameSpecifier_2= ruleNestedNameSpecifier this_ID_3= RULE_ID
                    {
                     
                            newCompositeNode(grammarAccess.getEnumHeadAccess().getNestedNameSpecifierParserRuleCall_1_1_0()); 
                        
                    pushFollow(FOLLOW_ruleNestedNameSpecifier_in_ruleEnumHead4193);
                    this_NestedNameSpecifier_2=ruleNestedNameSpecifier();

                    state._fsp--;


                    		current.merge(this_NestedNameSpecifier_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumHead4213); 

                    		current.merge(this_ID_3);
                        
                     
                        newLeafNode(this_ID_3, grammarAccess.getEnumHeadAccess().getIDTerminalRuleCall_1_1_1()); 
                        

                    }


                    }
                    break;

            }

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1484:3: (this_EnumBase_4= ruleEnumBase )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==80) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1485:5: this_EnumBase_4= ruleEnumBase
                    {
                     
                            newCompositeNode(grammarAccess.getEnumHeadAccess().getEnumBaseParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleEnumBase_in_ruleEnumHead4243);
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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1503:1: entryRuleEnumKey returns [String current=null] : iv_ruleEnumKey= ruleEnumKey EOF ;
    public final String entryRuleEnumKey() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEnumKey = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1504:2: (iv_ruleEnumKey= ruleEnumKey EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1505:2: iv_ruleEnumKey= ruleEnumKey EOF
            {
             newCompositeNode(grammarAccess.getEnumKeyRule()); 
            pushFollow(FOLLOW_ruleEnumKey_in_entryRuleEnumKey4291);
            iv_ruleEnumKey=ruleEnumKey();

            state._fsp--;

             current =iv_ruleEnumKey.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumKey4302); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1512:1: ruleEnumKey returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'enum' | (kw= 'enum' kw= 'class' ) | (kw= 'enum' kw= 'struct' ) ) ;
    public final AntlrDatatypeRuleToken ruleEnumKey() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1515:28: ( (kw= 'enum' | (kw= 'enum' kw= 'class' ) | (kw= 'enum' kw= 'struct' ) ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1516:1: (kw= 'enum' | (kw= 'enum' kw= 'class' ) | (kw= 'enum' kw= 'struct' ) )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1516:1: (kw= 'enum' | (kw= 'enum' kw= 'class' ) | (kw= 'enum' kw= 'struct' ) )
            int alt30=3;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==77) ) {
                switch ( input.LA(2) ) {
                case EOF:
                case RULE_ID:
                case 75:
                case 80:
                case 140:
                    {
                    alt30=1;
                    }
                    break;
                case 79:
                    {
                    alt30=3;
                    }
                    break;
                case 78:
                    {
                    alt30=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1517:2: kw= 'enum'
                    {
                    kw=(Token)match(input,77,FOLLOW_77_in_ruleEnumKey4340); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEnumKeyAccess().getEnumKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1523:6: (kw= 'enum' kw= 'class' )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1523:6: (kw= 'enum' kw= 'class' )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1524:2: kw= 'enum' kw= 'class'
                    {
                    kw=(Token)match(input,77,FOLLOW_77_in_ruleEnumKey4360); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEnumKeyAccess().getEnumKeyword_1_0()); 
                        
                    kw=(Token)match(input,78,FOLLOW_78_in_ruleEnumKey4373); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEnumKeyAccess().getClassKeyword_1_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1536:6: (kw= 'enum' kw= 'struct' )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1536:6: (kw= 'enum' kw= 'struct' )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1537:2: kw= 'enum' kw= 'struct'
                    {
                    kw=(Token)match(input,77,FOLLOW_77_in_ruleEnumKey4394); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEnumKeyAccess().getEnumKeyword_2_0()); 
                        
                    kw=(Token)match(input,79,FOLLOW_79_in_ruleEnumKey4407); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1556:1: entryRuleEnumBase returns [String current=null] : iv_ruleEnumBase= ruleEnumBase EOF ;
    public final String entryRuleEnumBase() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEnumBase = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1557:2: (iv_ruleEnumBase= ruleEnumBase EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1558:2: iv_ruleEnumBase= ruleEnumBase EOF
            {
             newCompositeNode(grammarAccess.getEnumBaseRule()); 
            pushFollow(FOLLOW_ruleEnumBase_in_entryRuleEnumBase4449);
            iv_ruleEnumBase=ruleEnumBase();

            state._fsp--;

             current =iv_ruleEnumBase.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumBase4460); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1565:1: ruleEnumBase returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= ':' (this_TypeSpecifier_1= ruleTypeSpecifier )+ ) ;
    public final AntlrDatatypeRuleToken ruleEnumBase() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_TypeSpecifier_1 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1568:28: ( (kw= ':' (this_TypeSpecifier_1= ruleTypeSpecifier )+ ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1569:1: (kw= ':' (this_TypeSpecifier_1= ruleTypeSpecifier )+ )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1569:1: (kw= ':' (this_TypeSpecifier_1= ruleTypeSpecifier )+ )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1570:2: kw= ':' (this_TypeSpecifier_1= ruleTypeSpecifier )+
            {
            kw=(Token)match(input,80,FOLLOW_80_in_ruleEnumBase4498); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEnumBaseAccess().getColonKeyword_0()); 
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1575:1: (this_TypeSpecifier_1= ruleTypeSpecifier )+
            int cnt31=0;
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ID||LA31_0==58||(LA31_0>=60 && LA31_0<=74)||LA31_0==77||LA31_0==82||LA31_0==133||(LA31_0>=136 && LA31_0<=137)||LA31_0==140||LA31_0==146) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1576:5: this_TypeSpecifier_1= ruleTypeSpecifier
            	    {
            	     
            	            newCompositeNode(grammarAccess.getEnumBaseAccess().getTypeSpecifierParserRuleCall_1()); 
            	        
            	    pushFollow(FOLLOW_ruleTypeSpecifier_in_ruleEnumBase4521);
            	    this_TypeSpecifier_1=ruleTypeSpecifier();

            	    state._fsp--;


            	    		current.merge(this_TypeSpecifier_1);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1594:1: entryRuleEnumeratorList returns [String current=null] : iv_ruleEnumeratorList= ruleEnumeratorList EOF ;
    public final String entryRuleEnumeratorList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEnumeratorList = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1595:2: (iv_ruleEnumeratorList= ruleEnumeratorList EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1596:2: iv_ruleEnumeratorList= ruleEnumeratorList EOF
            {
             newCompositeNode(grammarAccess.getEnumeratorListRule()); 
            pushFollow(FOLLOW_ruleEnumeratorList_in_entryRuleEnumeratorList4569);
            iv_ruleEnumeratorList=ruleEnumeratorList();

            state._fsp--;

             current =iv_ruleEnumeratorList.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumeratorList4580); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1603:1: ruleEnumeratorList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EnumerationDefinition_0= ruleEnumerationDefinition (kw= ',' this_EnumerationDefinition_2= ruleEnumerationDefinition )* ) ;
    public final AntlrDatatypeRuleToken ruleEnumeratorList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_EnumerationDefinition_0 = null;

        AntlrDatatypeRuleToken this_EnumerationDefinition_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1606:28: ( (this_EnumerationDefinition_0= ruleEnumerationDefinition (kw= ',' this_EnumerationDefinition_2= ruleEnumerationDefinition )* ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1607:1: (this_EnumerationDefinition_0= ruleEnumerationDefinition (kw= ',' this_EnumerationDefinition_2= ruleEnumerationDefinition )* )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1607:1: (this_EnumerationDefinition_0= ruleEnumerationDefinition (kw= ',' this_EnumerationDefinition_2= ruleEnumerationDefinition )* )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1608:5: this_EnumerationDefinition_0= ruleEnumerationDefinition (kw= ',' this_EnumerationDefinition_2= ruleEnumerationDefinition )*
            {
             
                    newCompositeNode(grammarAccess.getEnumeratorListAccess().getEnumerationDefinitionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleEnumerationDefinition_in_ruleEnumeratorList4627);
            this_EnumerationDefinition_0=ruleEnumerationDefinition();

            state._fsp--;


            		current.merge(this_EnumerationDefinition_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1618:1: (kw= ',' this_EnumerationDefinition_2= ruleEnumerationDefinition )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==45) ) {
                    int LA32_1 = input.LA(2);

                    if ( (LA32_1==RULE_ID) ) {
                        alt32=1;
                    }


                }


                switch (alt32) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1619:2: kw= ',' this_EnumerationDefinition_2= ruleEnumerationDefinition
            	    {
            	    kw=(Token)match(input,45,FOLLOW_45_in_ruleEnumeratorList4646); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getEnumeratorListAccess().getCommaKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getEnumeratorListAccess().getEnumerationDefinitionParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_ruleEnumerationDefinition_in_ruleEnumeratorList4668);
            	    this_EnumerationDefinition_2=ruleEnumerationDefinition();

            	    state._fsp--;


            	    		current.merge(this_EnumerationDefinition_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop32;
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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1643:1: entryRuleEnumerationDefinition returns [String current=null] : iv_ruleEnumerationDefinition= ruleEnumerationDefinition EOF ;
    public final String entryRuleEnumerationDefinition() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEnumerationDefinition = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1644:2: (iv_ruleEnumerationDefinition= ruleEnumerationDefinition EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1645:2: iv_ruleEnumerationDefinition= ruleEnumerationDefinition EOF
            {
             newCompositeNode(grammarAccess.getEnumerationDefinitionRule()); 
            pushFollow(FOLLOW_ruleEnumerationDefinition_in_entryRuleEnumerationDefinition4716);
            iv_ruleEnumerationDefinition=ruleEnumerationDefinition();

            state._fsp--;

             current =iv_ruleEnumerationDefinition.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumerationDefinition4727); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1652:1: ruleEnumerationDefinition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Enumerator_0= ruleEnumerator (kw= '=' this_ConstantExpression_2= ruleConstantExpression )? ) ;
    public final AntlrDatatypeRuleToken ruleEnumerationDefinition() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Enumerator_0 = null;

        AntlrDatatypeRuleToken this_ConstantExpression_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1655:28: ( (this_Enumerator_0= ruleEnumerator (kw= '=' this_ConstantExpression_2= ruleConstantExpression )? ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1656:1: (this_Enumerator_0= ruleEnumerator (kw= '=' this_ConstantExpression_2= ruleConstantExpression )? )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1656:1: (this_Enumerator_0= ruleEnumerator (kw= '=' this_ConstantExpression_2= ruleConstantExpression )? )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1657:5: this_Enumerator_0= ruleEnumerator (kw= '=' this_ConstantExpression_2= ruleConstantExpression )?
            {
             
                    newCompositeNode(grammarAccess.getEnumerationDefinitionAccess().getEnumeratorParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleEnumerator_in_ruleEnumerationDefinition4774);
            this_Enumerator_0=ruleEnumerator();

            state._fsp--;


            		current.merge(this_Enumerator_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1667:1: (kw= '=' this_ConstantExpression_2= ruleConstantExpression )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==39) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1668:2: kw= '=' this_ConstantExpression_2= ruleConstantExpression
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleEnumerationDefinition4793); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEnumerationDefinitionAccess().getEqualsSignKeyword_1_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getEnumerationDefinitionAccess().getConstantExpressionParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleConstantExpression_in_ruleEnumerationDefinition4815);
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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1692:1: entryRuleEnumerator returns [String current=null] : iv_ruleEnumerator= ruleEnumerator EOF ;
    public final String entryRuleEnumerator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEnumerator = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1693:2: (iv_ruleEnumerator= ruleEnumerator EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1694:2: iv_ruleEnumerator= ruleEnumerator EOF
            {
             newCompositeNode(grammarAccess.getEnumeratorRule()); 
            pushFollow(FOLLOW_ruleEnumerator_in_entryRuleEnumerator4863);
            iv_ruleEnumerator=ruleEnumerator();

            state._fsp--;

             current =iv_ruleEnumerator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumerator4874); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1701:1: ruleEnumerator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleEnumerator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1704:28: (this_ID_0= RULE_ID )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1705:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumerator4913); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1720:1: entryRuleNamespaceDefinition returns [String current=null] : iv_ruleNamespaceDefinition= ruleNamespaceDefinition EOF ;
    public final String entryRuleNamespaceDefinition() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNamespaceDefinition = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1721:2: (iv_ruleNamespaceDefinition= ruleNamespaceDefinition EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1722:2: iv_ruleNamespaceDefinition= ruleNamespaceDefinition EOF
            {
             newCompositeNode(grammarAccess.getNamespaceDefinitionRule()); 
            pushFollow(FOLLOW_ruleNamespaceDefinition_in_entryRuleNamespaceDefinition4958);
            iv_ruleNamespaceDefinition=ruleNamespaceDefinition();

            state._fsp--;

             current =iv_ruleNamespaceDefinition.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamespaceDefinition4969); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1729:1: ruleNamespaceDefinition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'inline' )? kw= 'namespace' (this_ID_2= RULE_ID )? kw= '{' (this_Declaration_4= ruleDeclaration )* kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleNamespaceDefinition() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;
        AntlrDatatypeRuleToken this_Declaration_4 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1732:28: ( ( (kw= 'inline' )? kw= 'namespace' (this_ID_2= RULE_ID )? kw= '{' (this_Declaration_4= ruleDeclaration )* kw= '}' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1733:1: ( (kw= 'inline' )? kw= 'namespace' (this_ID_2= RULE_ID )? kw= '{' (this_Declaration_4= ruleDeclaration )* kw= '}' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1733:1: ( (kw= 'inline' )? kw= 'namespace' (this_ID_2= RULE_ID )? kw= '{' (this_Declaration_4= ruleDeclaration )* kw= '}' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1733:2: (kw= 'inline' )? kw= 'namespace' (this_ID_2= RULE_ID )? kw= '{' (this_Declaration_4= ruleDeclaration )* kw= '}'
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1733:2: (kw= 'inline' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==55) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1734:2: kw= 'inline'
                    {
                    kw=(Token)match(input,55,FOLLOW_55_in_ruleNamespaceDefinition5008); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNamespaceDefinitionAccess().getInlineKeyword_0()); 
                        

                    }
                    break;

            }

            kw=(Token)match(input,81,FOLLOW_81_in_ruleNamespaceDefinition5023); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getNamespaceDefinitionAccess().getNamespaceKeyword_1()); 
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1745:1: (this_ID_2= RULE_ID )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ID) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1745:6: this_ID_2= RULE_ID
                    {
                    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNamespaceDefinition5039); 

                    		current.merge(this_ID_2);
                        
                     
                        newLeafNode(this_ID_2, grammarAccess.getNamespaceDefinitionAccess().getIDTerminalRuleCall_2()); 
                        

                    }
                    break;

            }

            kw=(Token)match(input,75,FOLLOW_75_in_ruleNamespaceDefinition5059); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getNamespaceDefinitionAccess().getLeftCurlyBracketKeyword_3()); 
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1758:1: (this_Declaration_4= ruleDeclaration )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_ID||LA36_0==38||LA36_0==40||LA36_0==43||(LA36_0>=47 && LA36_0<=58)||(LA36_0>=59 && LA36_0<=74)||LA36_0==77||(LA36_0>=81 && LA36_0<=83)||LA36_0==88||(LA36_0>=133 && LA36_0<=137)||(LA36_0>=139 && LA36_0<=140)||LA36_0==146) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1759:5: this_Declaration_4= ruleDeclaration
            	    {
            	     
            	            newCompositeNode(grammarAccess.getNamespaceDefinitionAccess().getDeclarationParserRuleCall_4()); 
            	        
            	    pushFollow(FOLLOW_ruleDeclaration_in_ruleNamespaceDefinition5082);
            	    this_Declaration_4=ruleDeclaration();

            	    state._fsp--;


            	    		current.merge(this_Declaration_4);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            kw=(Token)match(input,76,FOLLOW_76_in_ruleNamespaceDefinition5102); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1783:1: entryRuleNamespaceAliasDefinition returns [String current=null] : iv_ruleNamespaceAliasDefinition= ruleNamespaceAliasDefinition EOF ;
    public final String entryRuleNamespaceAliasDefinition() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNamespaceAliasDefinition = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1784:2: (iv_ruleNamespaceAliasDefinition= ruleNamespaceAliasDefinition EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1785:2: iv_ruleNamespaceAliasDefinition= ruleNamespaceAliasDefinition EOF
            {
             newCompositeNode(grammarAccess.getNamespaceAliasDefinitionRule()); 
            pushFollow(FOLLOW_ruleNamespaceAliasDefinition_in_entryRuleNamespaceAliasDefinition5143);
            iv_ruleNamespaceAliasDefinition=ruleNamespaceAliasDefinition();

            state._fsp--;

             current =iv_ruleNamespaceAliasDefinition.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamespaceAliasDefinition5154); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1792:1: ruleNamespaceAliasDefinition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'namespace' this_ID_1= RULE_ID kw= '=' this_QualifiedNamespaceSpecifier_3= ruleQualifiedNamespaceSpecifier kw= ';' ) ;
    public final AntlrDatatypeRuleToken ruleNamespaceAliasDefinition() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        AntlrDatatypeRuleToken this_QualifiedNamespaceSpecifier_3 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1795:28: ( (kw= 'namespace' this_ID_1= RULE_ID kw= '=' this_QualifiedNamespaceSpecifier_3= ruleQualifiedNamespaceSpecifier kw= ';' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1796:1: (kw= 'namespace' this_ID_1= RULE_ID kw= '=' this_QualifiedNamespaceSpecifier_3= ruleQualifiedNamespaceSpecifier kw= ';' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1796:1: (kw= 'namespace' this_ID_1= RULE_ID kw= '=' this_QualifiedNamespaceSpecifier_3= ruleQualifiedNamespaceSpecifier kw= ';' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1797:2: kw= 'namespace' this_ID_1= RULE_ID kw= '=' this_QualifiedNamespaceSpecifier_3= ruleQualifiedNamespaceSpecifier kw= ';'
            {
            kw=(Token)match(input,81,FOLLOW_81_in_ruleNamespaceAliasDefinition5192); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getNamespaceAliasDefinitionAccess().getNamespaceKeyword_0()); 
                
            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNamespaceAliasDefinition5207); 

            		current.merge(this_ID_1);
                
             
                newLeafNode(this_ID_1, grammarAccess.getNamespaceAliasDefinitionAccess().getIDTerminalRuleCall_1()); 
                
            kw=(Token)match(input,39,FOLLOW_39_in_ruleNamespaceAliasDefinition5225); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getNamespaceAliasDefinitionAccess().getEqualsSignKeyword_2()); 
                
             
                    newCompositeNode(grammarAccess.getNamespaceAliasDefinitionAccess().getQualifiedNamespaceSpecifierParserRuleCall_3()); 
                
            pushFollow(FOLLOW_ruleQualifiedNamespaceSpecifier_in_ruleNamespaceAliasDefinition5247);
            this_QualifiedNamespaceSpecifier_3=ruleQualifiedNamespaceSpecifier();

            state._fsp--;


            		current.merge(this_QualifiedNamespaceSpecifier_3);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,40,FOLLOW_40_in_ruleNamespaceAliasDefinition5265); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1840:1: entryRuleQualifiedNamespaceSpecifier returns [String current=null] : iv_ruleQualifiedNamespaceSpecifier= ruleQualifiedNamespaceSpecifier EOF ;
    public final String entryRuleQualifiedNamespaceSpecifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNamespaceSpecifier = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1841:2: (iv_ruleQualifiedNamespaceSpecifier= ruleQualifiedNamespaceSpecifier EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1842:2: iv_ruleQualifiedNamespaceSpecifier= ruleQualifiedNamespaceSpecifier EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNamespaceSpecifierRule()); 
            pushFollow(FOLLOW_ruleQualifiedNamespaceSpecifier_in_entryRuleQualifiedNamespaceSpecifier5306);
            iv_ruleQualifiedNamespaceSpecifier=ruleQualifiedNamespaceSpecifier();

            state._fsp--;

             current =iv_ruleQualifiedNamespaceSpecifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNamespaceSpecifier5317); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1849:1: ruleQualifiedNamespaceSpecifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '::' )? (this_NestedNameSpecifier_1= ruleNestedNameSpecifier )? this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNamespaceSpecifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;
        AntlrDatatypeRuleToken this_NestedNameSpecifier_1 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1852:28: ( ( (kw= '::' )? (this_NestedNameSpecifier_1= ruleNestedNameSpecifier )? this_ID_2= RULE_ID ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1853:1: ( (kw= '::' )? (this_NestedNameSpecifier_1= ruleNestedNameSpecifier )? this_ID_2= RULE_ID )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1853:1: ( (kw= '::' )? (this_NestedNameSpecifier_1= ruleNestedNameSpecifier )? this_ID_2= RULE_ID )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1853:2: (kw= '::' )? (this_NestedNameSpecifier_1= ruleNestedNameSpecifier )? this_ID_2= RULE_ID
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1853:2: (kw= '::' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==58) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1854:2: kw= '::'
                    {
                    kw=(Token)match(input,58,FOLLOW_58_in_ruleQualifiedNamespaceSpecifier5356); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQualifiedNamespaceSpecifierAccess().getColonColonKeyword_0()); 
                        

                    }
                    break;

            }

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1859:3: (this_NestedNameSpecifier_1= ruleNestedNameSpecifier )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==140) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1860:5: this_NestedNameSpecifier_1= ruleNestedNameSpecifier
                    {
                     
                            newCompositeNode(grammarAccess.getQualifiedNamespaceSpecifierAccess().getNestedNameSpecifierParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNestedNameSpecifier_in_ruleQualifiedNamespaceSpecifier5381);
                    this_NestedNameSpecifier_1=ruleNestedNameSpecifier();

                    state._fsp--;


                    		current.merge(this_NestedNameSpecifier_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedNamespaceSpecifier5403); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1885:1: entryRuleUsingDeclaration returns [String current=null] : iv_ruleUsingDeclaration= ruleUsingDeclaration EOF ;
    public final String entryRuleUsingDeclaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUsingDeclaration = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1886:2: (iv_ruleUsingDeclaration= ruleUsingDeclaration EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1887:2: iv_ruleUsingDeclaration= ruleUsingDeclaration EOF
            {
             newCompositeNode(grammarAccess.getUsingDeclarationRule()); 
            pushFollow(FOLLOW_ruleUsingDeclaration_in_entryRuleUsingDeclaration5449);
            iv_ruleUsingDeclaration=ruleUsingDeclaration();

            state._fsp--;

             current =iv_ruleUsingDeclaration.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUsingDeclaration5460); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1894:1: ruleUsingDeclaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'using' (kw= '::' | ( (kw= 'typename' )? (kw= '::' )? this_NestedNameSpecifier_4= ruleNestedNameSpecifier ) ) this_UnqualifiedId_5= ruleUnqualifiedId kw= ';' ) ;
    public final AntlrDatatypeRuleToken ruleUsingDeclaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_NestedNameSpecifier_4 = null;

        AntlrDatatypeRuleToken this_UnqualifiedId_5 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1897:28: ( (kw= 'using' (kw= '::' | ( (kw= 'typename' )? (kw= '::' )? this_NestedNameSpecifier_4= ruleNestedNameSpecifier ) ) this_UnqualifiedId_5= ruleUnqualifiedId kw= ';' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1898:1: (kw= 'using' (kw= '::' | ( (kw= 'typename' )? (kw= '::' )? this_NestedNameSpecifier_4= ruleNestedNameSpecifier ) ) this_UnqualifiedId_5= ruleUnqualifiedId kw= ';' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1898:1: (kw= 'using' (kw= '::' | ( (kw= 'typename' )? (kw= '::' )? this_NestedNameSpecifier_4= ruleNestedNameSpecifier ) ) this_UnqualifiedId_5= ruleUnqualifiedId kw= ';' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1899:2: kw= 'using' (kw= '::' | ( (kw= 'typename' )? (kw= '::' )? this_NestedNameSpecifier_4= ruleNestedNameSpecifier ) ) this_UnqualifiedId_5= ruleUnqualifiedId kw= ';'
            {
            kw=(Token)match(input,38,FOLLOW_38_in_ruleUsingDeclaration5498); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getUsingDeclarationAccess().getUsingKeyword_0()); 
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1904:1: (kw= '::' | ( (kw= 'typename' )? (kw= '::' )? this_NestedNameSpecifier_4= ruleNestedNameSpecifier ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==58) ) {
                int LA41_1 = input.LA(2);

                if ( (LA41_1==145) ) {
                    alt41=1;
                }
                else if ( (LA41_1==140) ) {
                    alt41=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA41_0==82||LA41_0==140) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1905:2: kw= '::'
                    {
                    kw=(Token)match(input,58,FOLLOW_58_in_ruleUsingDeclaration5512); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getUsingDeclarationAccess().getColonColonKeyword_1_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1911:6: ( (kw= 'typename' )? (kw= '::' )? this_NestedNameSpecifier_4= ruleNestedNameSpecifier )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1911:6: ( (kw= 'typename' )? (kw= '::' )? this_NestedNameSpecifier_4= ruleNestedNameSpecifier )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1911:7: (kw= 'typename' )? (kw= '::' )? this_NestedNameSpecifier_4= ruleNestedNameSpecifier
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1911:7: (kw= 'typename' )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==82) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1912:2: kw= 'typename'
                            {
                            kw=(Token)match(input,82,FOLLOW_82_in_ruleUsingDeclaration5533); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getUsingDeclarationAccess().getTypenameKeyword_1_1_0()); 
                                

                            }
                            break;

                    }

                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1917:3: (kw= '::' )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==58) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1918:2: kw= '::'
                            {
                            kw=(Token)match(input,58,FOLLOW_58_in_ruleUsingDeclaration5549); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getUsingDeclarationAccess().getColonColonKeyword_1_1_1()); 
                                

                            }
                            break;

                    }

                     
                            newCompositeNode(grammarAccess.getUsingDeclarationAccess().getNestedNameSpecifierParserRuleCall_1_1_2()); 
                        
                    pushFollow(FOLLOW_ruleNestedNameSpecifier_in_ruleUsingDeclaration5573);
                    this_NestedNameSpecifier_4=ruleNestedNameSpecifier();

                    state._fsp--;


                    		current.merge(this_NestedNameSpecifier_4);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getUsingDeclarationAccess().getUnqualifiedIdParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleUnqualifiedId_in_ruleUsingDeclaration5602);
            this_UnqualifiedId_5=ruleUnqualifiedId();

            state._fsp--;


            		current.merge(this_UnqualifiedId_5);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,40,FOLLOW_40_in_ruleUsingDeclaration5620); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1961:1: entryRuleAsmDefinition returns [String current=null] : iv_ruleAsmDefinition= ruleAsmDefinition EOF ;
    public final String entryRuleAsmDefinition() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAsmDefinition = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1962:2: (iv_ruleAsmDefinition= ruleAsmDefinition EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1963:2: iv_ruleAsmDefinition= ruleAsmDefinition EOF
            {
             newCompositeNode(grammarAccess.getAsmDefinitionRule()); 
            pushFollow(FOLLOW_ruleAsmDefinition_in_entryRuleAsmDefinition5663);
            iv_ruleAsmDefinition=ruleAsmDefinition();

            state._fsp--;

             current =iv_ruleAsmDefinition.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAsmDefinition5674); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1970:1: ruleAsmDefinition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'asm' kw= '(' this_STRING_LITERAL_2= RULE_STRING_LITERAL kw= ')' kw= ';' ) ;
    public final AntlrDatatypeRuleToken ruleAsmDefinition() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_STRING_LITERAL_2=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1973:28: ( (kw= 'asm' kw= '(' this_STRING_LITERAL_2= RULE_STRING_LITERAL kw= ')' kw= ';' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1974:1: (kw= 'asm' kw= '(' this_STRING_LITERAL_2= RULE_STRING_LITERAL kw= ')' kw= ';' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1974:1: (kw= 'asm' kw= '(' this_STRING_LITERAL_2= RULE_STRING_LITERAL kw= ')' kw= ';' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1975:2: kw= 'asm' kw= '(' this_STRING_LITERAL_2= RULE_STRING_LITERAL kw= ')' kw= ';'
            {
            kw=(Token)match(input,83,FOLLOW_83_in_ruleAsmDefinition5712); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getAsmDefinitionAccess().getAsmKeyword_0()); 
                
            kw=(Token)match(input,44,FOLLOW_44_in_ruleAsmDefinition5725); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getAsmDefinitionAccess().getLeftParenthesisKeyword_1()); 
                
            this_STRING_LITERAL_2=(Token)match(input,RULE_STRING_LITERAL,FOLLOW_RULE_STRING_LITERAL_in_ruleAsmDefinition5740); 

            		current.merge(this_STRING_LITERAL_2);
                
             
                newLeafNode(this_STRING_LITERAL_2, grammarAccess.getAsmDefinitionAccess().getSTRING_LITERALTerminalRuleCall_2()); 
                
            kw=(Token)match(input,46,FOLLOW_46_in_ruleAsmDefinition5758); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getAsmDefinitionAccess().getRightParenthesisKeyword_3()); 
                
            kw=(Token)match(input,40,FOLLOW_40_in_ruleAsmDefinition5771); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2013:1: entryRuleLinkageSpecification returns [String current=null] : iv_ruleLinkageSpecification= ruleLinkageSpecification EOF ;
    public final String entryRuleLinkageSpecification() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLinkageSpecification = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2014:2: (iv_ruleLinkageSpecification= ruleLinkageSpecification EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2015:2: iv_ruleLinkageSpecification= ruleLinkageSpecification EOF
            {
             newCompositeNode(grammarAccess.getLinkageSpecificationRule()); 
            pushFollow(FOLLOW_ruleLinkageSpecification_in_entryRuleLinkageSpecification5812);
            iv_ruleLinkageSpecification=ruleLinkageSpecification();

            state._fsp--;

             current =iv_ruleLinkageSpecification.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLinkageSpecification5823); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2022:1: ruleLinkageSpecification returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'extern' this_STRING_LITERAL_1= RULE_STRING_LITERAL (this_Declaration_2= ruleDeclaration | (kw= '{' (this_Declaration_4= ruleDeclaration )* kw= '}' ) ) ) ;
    public final AntlrDatatypeRuleToken ruleLinkageSpecification() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_STRING_LITERAL_1=null;
        AntlrDatatypeRuleToken this_Declaration_2 = null;

        AntlrDatatypeRuleToken this_Declaration_4 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2025:28: ( (kw= 'extern' this_STRING_LITERAL_1= RULE_STRING_LITERAL (this_Declaration_2= ruleDeclaration | (kw= '{' (this_Declaration_4= ruleDeclaration )* kw= '}' ) ) ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2026:1: (kw= 'extern' this_STRING_LITERAL_1= RULE_STRING_LITERAL (this_Declaration_2= ruleDeclaration | (kw= '{' (this_Declaration_4= ruleDeclaration )* kw= '}' ) ) )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2026:1: (kw= 'extern' this_STRING_LITERAL_1= RULE_STRING_LITERAL (this_Declaration_2= ruleDeclaration | (kw= '{' (this_Declaration_4= ruleDeclaration )* kw= '}' ) ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2027:2: kw= 'extern' this_STRING_LITERAL_1= RULE_STRING_LITERAL (this_Declaration_2= ruleDeclaration | (kw= '{' (this_Declaration_4= ruleDeclaration )* kw= '}' ) )
            {
            kw=(Token)match(input,53,FOLLOW_53_in_ruleLinkageSpecification5861); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getLinkageSpecificationAccess().getExternKeyword_0()); 
                
            this_STRING_LITERAL_1=(Token)match(input,RULE_STRING_LITERAL,FOLLOW_RULE_STRING_LITERAL_in_ruleLinkageSpecification5876); 

            		current.merge(this_STRING_LITERAL_1);
                
             
                newLeafNode(this_STRING_LITERAL_1, grammarAccess.getLinkageSpecificationAccess().getSTRING_LITERALTerminalRuleCall_1()); 
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2039:1: (this_Declaration_2= ruleDeclaration | (kw= '{' (this_Declaration_4= ruleDeclaration )* kw= '}' ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_ID||LA43_0==38||LA43_0==40||LA43_0==43||(LA43_0>=47 && LA43_0<=58)||(LA43_0>=59 && LA43_0<=74)||LA43_0==77||(LA43_0>=81 && LA43_0<=83)||LA43_0==88||(LA43_0>=133 && LA43_0<=137)||(LA43_0>=139 && LA43_0<=140)||LA43_0==146) ) {
                alt43=1;
            }
            else if ( (LA43_0==75) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2040:5: this_Declaration_2= ruleDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getLinkageSpecificationAccess().getDeclarationParserRuleCall_2_0()); 
                        
                    pushFollow(FOLLOW_ruleDeclaration_in_ruleLinkageSpecification5904);
                    this_Declaration_2=ruleDeclaration();

                    state._fsp--;


                    		current.merge(this_Declaration_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2051:6: (kw= '{' (this_Declaration_4= ruleDeclaration )* kw= '}' )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2051:6: (kw= '{' (this_Declaration_4= ruleDeclaration )* kw= '}' )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2052:2: kw= '{' (this_Declaration_4= ruleDeclaration )* kw= '}'
                    {
                    kw=(Token)match(input,75,FOLLOW_75_in_ruleLinkageSpecification5929); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLinkageSpecificationAccess().getLeftCurlyBracketKeyword_2_1_0()); 
                        
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2057:1: (this_Declaration_4= ruleDeclaration )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==RULE_ID||LA42_0==38||LA42_0==40||LA42_0==43||(LA42_0>=47 && LA42_0<=58)||(LA42_0>=59 && LA42_0<=74)||LA42_0==77||(LA42_0>=81 && LA42_0<=83)||LA42_0==88||(LA42_0>=133 && LA42_0<=137)||(LA42_0>=139 && LA42_0<=140)||LA42_0==146) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2058:5: this_Declaration_4= ruleDeclaration
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getLinkageSpecificationAccess().getDeclarationParserRuleCall_2_1_1()); 
                    	        
                    	    pushFollow(FOLLOW_ruleDeclaration_in_ruleLinkageSpecification5952);
                    	    this_Declaration_4=ruleDeclaration();

                    	    state._fsp--;


                    	    		current.merge(this_Declaration_4);
                    	        
                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);

                    kw=(Token)match(input,76,FOLLOW_76_in_ruleLinkageSpecification5972); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2082:1: entryRuleInitDeclaratorList returns [String current=null] : iv_ruleInitDeclaratorList= ruleInitDeclaratorList EOF ;
    public final String entryRuleInitDeclaratorList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInitDeclaratorList = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2083:2: (iv_ruleInitDeclaratorList= ruleInitDeclaratorList EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2084:2: iv_ruleInitDeclaratorList= ruleInitDeclaratorList EOF
            {
             newCompositeNode(grammarAccess.getInitDeclaratorListRule()); 
            pushFollow(FOLLOW_ruleInitDeclaratorList_in_entryRuleInitDeclaratorList6015);
            iv_ruleInitDeclaratorList=ruleInitDeclaratorList();

            state._fsp--;

             current =iv_ruleInitDeclaratorList.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInitDeclaratorList6026); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2091:1: ruleInitDeclaratorList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_InitDeclarator_0= ruleInitDeclarator (kw= ',' this_InitDeclarator_2= ruleInitDeclarator )* ) ;
    public final AntlrDatatypeRuleToken ruleInitDeclaratorList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_InitDeclarator_0 = null;

        AntlrDatatypeRuleToken this_InitDeclarator_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2094:28: ( (this_InitDeclarator_0= ruleInitDeclarator (kw= ',' this_InitDeclarator_2= ruleInitDeclarator )* ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2095:1: (this_InitDeclarator_0= ruleInitDeclarator (kw= ',' this_InitDeclarator_2= ruleInitDeclarator )* )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2095:1: (this_InitDeclarator_0= ruleInitDeclarator (kw= ',' this_InitDeclarator_2= ruleInitDeclarator )* )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2096:5: this_InitDeclarator_0= ruleInitDeclarator (kw= ',' this_InitDeclarator_2= ruleInitDeclarator )*
            {
             
                    newCompositeNode(grammarAccess.getInitDeclaratorListAccess().getInitDeclaratorParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleInitDeclarator_in_ruleInitDeclaratorList6073);
            this_InitDeclarator_0=ruleInitDeclarator();

            state._fsp--;


            		current.merge(this_InitDeclarator_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2106:1: (kw= ',' this_InitDeclarator_2= ruleInitDeclarator )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==45) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2107:2: kw= ',' this_InitDeclarator_2= ruleInitDeclarator
            	    {
            	    kw=(Token)match(input,45,FOLLOW_45_in_ruleInitDeclaratorList6092); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getInitDeclaratorListAccess().getCommaKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getInitDeclaratorListAccess().getInitDeclaratorParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_ruleInitDeclarator_in_ruleInitDeclaratorList6114);
            	    this_InitDeclarator_2=ruleInitDeclarator();

            	    state._fsp--;


            	    		current.merge(this_InitDeclarator_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop44;
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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2131:1: entryRuleInitDeclarator returns [String current=null] : iv_ruleInitDeclarator= ruleInitDeclarator EOF ;
    public final String entryRuleInitDeclarator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInitDeclarator = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2132:2: (iv_ruleInitDeclarator= ruleInitDeclarator EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2133:2: iv_ruleInitDeclarator= ruleInitDeclarator EOF
            {
             newCompositeNode(grammarAccess.getInitDeclaratorRule()); 
            pushFollow(FOLLOW_ruleInitDeclarator_in_entryRuleInitDeclarator6162);
            iv_ruleInitDeclarator=ruleInitDeclarator();

            state._fsp--;

             current =iv_ruleInitDeclarator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInitDeclarator6173); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2140:1: ruleInitDeclarator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DeclaratorId_0= ruleDeclaratorId (this_Initializer_1= ruleInitializer )? ) ;
    public final AntlrDatatypeRuleToken ruleInitDeclarator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_DeclaratorId_0 = null;

        AntlrDatatypeRuleToken this_Initializer_1 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2143:28: ( (this_DeclaratorId_0= ruleDeclaratorId (this_Initializer_1= ruleInitializer )? ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2144:1: (this_DeclaratorId_0= ruleDeclaratorId (this_Initializer_1= ruleInitializer )? )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2144:1: (this_DeclaratorId_0= ruleDeclaratorId (this_Initializer_1= ruleInitializer )? )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2145:5: this_DeclaratorId_0= ruleDeclaratorId (this_Initializer_1= ruleInitializer )?
            {
             
                    newCompositeNode(grammarAccess.getInitDeclaratorAccess().getDeclaratorIdParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleDeclaratorId_in_ruleInitDeclarator6220);
            this_DeclaratorId_0=ruleDeclaratorId();

            state._fsp--;


            		current.merge(this_DeclaratorId_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2155:1: (this_Initializer_1= ruleInitializer )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==147) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2156:5: this_Initializer_1= ruleInitializer
                    {
                     
                            newCompositeNode(grammarAccess.getInitDeclaratorAccess().getInitializerParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleInitializer_in_ruleInitDeclarator6248);
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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2174:1: entryRuleFunctionDeclarator returns [String current=null] : iv_ruleFunctionDeclarator= ruleFunctionDeclarator EOF ;
    public final String entryRuleFunctionDeclarator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunctionDeclarator = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2175:2: (iv_ruleFunctionDeclarator= ruleFunctionDeclarator EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2176:2: iv_ruleFunctionDeclarator= ruleFunctionDeclarator EOF
            {
             newCompositeNode(grammarAccess.getFunctionDeclaratorRule()); 
            pushFollow(FOLLOW_ruleFunctionDeclarator_in_entryRuleFunctionDeclarator6296);
            iv_ruleFunctionDeclarator=ruleFunctionDeclarator();

            state._fsp--;

             current =iv_ruleFunctionDeclarator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionDeclarator6307); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2183:1: ruleFunctionDeclarator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DeclaratorId_0= ruleDeclaratorId this_ParametersAndQualifiers_1= ruleParametersAndQualifiers ) ;
    public final AntlrDatatypeRuleToken ruleFunctionDeclarator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_DeclaratorId_0 = null;

        AntlrDatatypeRuleToken this_ParametersAndQualifiers_1 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2186:28: ( (this_DeclaratorId_0= ruleDeclaratorId this_ParametersAndQualifiers_1= ruleParametersAndQualifiers ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2187:1: (this_DeclaratorId_0= ruleDeclaratorId this_ParametersAndQualifiers_1= ruleParametersAndQualifiers )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2187:1: (this_DeclaratorId_0= ruleDeclaratorId this_ParametersAndQualifiers_1= ruleParametersAndQualifiers )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2188:5: this_DeclaratorId_0= ruleDeclaratorId this_ParametersAndQualifiers_1= ruleParametersAndQualifiers
            {
             
                    newCompositeNode(grammarAccess.getFunctionDeclaratorAccess().getDeclaratorIdParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleDeclaratorId_in_ruleFunctionDeclarator6354);
            this_DeclaratorId_0=ruleDeclaratorId();

            state._fsp--;


            		current.merge(this_DeclaratorId_0);
                
             
                    afterParserOrEnumRuleCall();
                
             
                    newCompositeNode(grammarAccess.getFunctionDeclaratorAccess().getParametersAndQualifiersParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleParametersAndQualifiers_in_ruleFunctionDeclarator6381);
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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2217:1: entryRuleParametersAndQualifiers returns [String current=null] : iv_ruleParametersAndQualifiers= ruleParametersAndQualifiers EOF ;
    public final String entryRuleParametersAndQualifiers() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleParametersAndQualifiers = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2218:2: (iv_ruleParametersAndQualifiers= ruleParametersAndQualifiers EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2219:2: iv_ruleParametersAndQualifiers= ruleParametersAndQualifiers EOF
            {
             newCompositeNode(grammarAccess.getParametersAndQualifiersRule()); 
            pushFollow(FOLLOW_ruleParametersAndQualifiers_in_entryRuleParametersAndQualifiers6427);
            iv_ruleParametersAndQualifiers=ruleParametersAndQualifiers();

            state._fsp--;

             current =iv_ruleParametersAndQualifiers.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParametersAndQualifiers6438); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2226:1: ruleParametersAndQualifiers returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '(' (this_ParameterDeclarationClause_1= ruleParameterDeclarationClause )? kw= ')' (kw= 'const' | kw= 'volatile' )? (kw= '&' | kw= '&&' )? (this_ExceptionSpecification_7= ruleExceptionSpecification )? ) ;
    public final AntlrDatatypeRuleToken ruleParametersAndQualifiers() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ParameterDeclarationClause_1 = null;

        AntlrDatatypeRuleToken this_ExceptionSpecification_7 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2229:28: ( (kw= '(' (this_ParameterDeclarationClause_1= ruleParameterDeclarationClause )? kw= ')' (kw= 'const' | kw= 'volatile' )? (kw= '&' | kw= '&&' )? (this_ExceptionSpecification_7= ruleExceptionSpecification )? ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2230:1: (kw= '(' (this_ParameterDeclarationClause_1= ruleParameterDeclarationClause )? kw= ')' (kw= 'const' | kw= 'volatile' )? (kw= '&' | kw= '&&' )? (this_ExceptionSpecification_7= ruleExceptionSpecification )? )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2230:1: (kw= '(' (this_ParameterDeclarationClause_1= ruleParameterDeclarationClause )? kw= ')' (kw= 'const' | kw= 'volatile' )? (kw= '&' | kw= '&&' )? (this_ExceptionSpecification_7= ruleExceptionSpecification )? )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2231:2: kw= '(' (this_ParameterDeclarationClause_1= ruleParameterDeclarationClause )? kw= ')' (kw= 'const' | kw= 'volatile' )? (kw= '&' | kw= '&&' )? (this_ExceptionSpecification_7= ruleExceptionSpecification )?
            {
            kw=(Token)match(input,44,FOLLOW_44_in_ruleParametersAndQualifiers6476); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getParametersAndQualifiersAccess().getLeftParenthesisKeyword_0()); 
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2236:1: (this_ParameterDeclarationClause_1= ruleParameterDeclarationClause )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_ID||(LA46_0>=47 && LA46_0<=58)||(LA46_0>=60 && LA46_0<=74)||LA46_0==77||LA46_0==82||LA46_0==88||LA46_0==133||(LA46_0>=136 && LA46_0<=137)||LA46_0==140||LA46_0==146) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2237:5: this_ParameterDeclarationClause_1= ruleParameterDeclarationClause
                    {
                     
                            newCompositeNode(grammarAccess.getParametersAndQualifiersAccess().getParameterDeclarationClauseParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleParameterDeclarationClause_in_ruleParametersAndQualifiers6499);
                    this_ParameterDeclarationClause_1=ruleParameterDeclarationClause();

                    state._fsp--;


                    		current.merge(this_ParameterDeclarationClause_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            kw=(Token)match(input,46,FOLLOW_46_in_ruleParametersAndQualifiers6519); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getParametersAndQualifiersAccess().getRightParenthesisKeyword_2()); 
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2253:1: (kw= 'const' | kw= 'volatile' )?
            int alt47=3;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==84) ) {
                alt47=1;
            }
            else if ( (LA47_0==85) ) {
                alt47=2;
            }
            switch (alt47) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2254:2: kw= 'const'
                    {
                    kw=(Token)match(input,84,FOLLOW_84_in_ruleParametersAndQualifiers6533); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getParametersAndQualifiersAccess().getConstKeyword_3_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2261:2: kw= 'volatile'
                    {
                    kw=(Token)match(input,85,FOLLOW_85_in_ruleParametersAndQualifiers6552); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getParametersAndQualifiersAccess().getVolatileKeyword_3_1()); 
                        

                    }
                    break;

            }

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2266:3: (kw= '&' | kw= '&&' )?
            int alt48=3;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==86) ) {
                alt48=1;
            }
            else if ( (LA48_0==87) ) {
                alt48=2;
            }
            switch (alt48) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2267:2: kw= '&'
                    {
                    kw=(Token)match(input,86,FOLLOW_86_in_ruleParametersAndQualifiers6568); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getParametersAndQualifiersAccess().getAmpersandKeyword_4_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2274:2: kw= '&&'
                    {
                    kw=(Token)match(input,87,FOLLOW_87_in_ruleParametersAndQualifiers6587); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getParametersAndQualifiersAccess().getAmpersandAmpersandKeyword_4_1()); 
                        

                    }
                    break;

            }

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2279:3: (this_ExceptionSpecification_7= ruleExceptionSpecification )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=130 && LA49_0<=131)) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2280:5: this_ExceptionSpecification_7= ruleExceptionSpecification
                    {
                     
                            newCompositeNode(grammarAccess.getParametersAndQualifiersAccess().getExceptionSpecificationParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleExceptionSpecification_in_ruleParametersAndQualifiers6612);
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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2298:1: entryRuleDeclaratorId returns [String current=null] : iv_ruleDeclaratorId= ruleDeclaratorId EOF ;
    public final String entryRuleDeclaratorId() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDeclaratorId = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2299:2: (iv_ruleDeclaratorId= ruleDeclaratorId EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2300:2: iv_ruleDeclaratorId= ruleDeclaratorId EOF
            {
             newCompositeNode(grammarAccess.getDeclaratorIdRule()); 
            pushFollow(FOLLOW_ruleDeclaratorId_in_entryRuleDeclaratorId6660);
            iv_ruleDeclaratorId=ruleDeclaratorId();

            state._fsp--;

             current =iv_ruleDeclaratorId.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaratorId6671); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2307:1: ruleDeclaratorId returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '...' )? this_IdExpression_1= ruleIdExpression ) ;
    public final AntlrDatatypeRuleToken ruleDeclaratorId() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_IdExpression_1 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2310:28: ( ( (kw= '...' )? this_IdExpression_1= ruleIdExpression ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2311:1: ( (kw= '...' )? this_IdExpression_1= ruleIdExpression )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2311:1: ( (kw= '...' )? this_IdExpression_1= ruleIdExpression )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2311:2: (kw= '...' )? this_IdExpression_1= ruleIdExpression
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2311:2: (kw= '...' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==88) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2312:2: kw= '...'
                    {
                    kw=(Token)match(input,88,FOLLOW_88_in_ruleDeclaratorId6710); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDeclaratorIdAccess().getFullStopFullStopFullStopKeyword_0()); 
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getDeclaratorIdAccess().getIdExpressionParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleIdExpression_in_ruleDeclaratorId6734);
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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2336:1: entryRuleTypeId returns [String current=null] : iv_ruleTypeId= ruleTypeId EOF ;
    public final String entryRuleTypeId() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeId = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2337:2: (iv_ruleTypeId= ruleTypeId EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2338:2: iv_ruleTypeId= ruleTypeId EOF
            {
             newCompositeNode(grammarAccess.getTypeIdRule()); 
            pushFollow(FOLLOW_ruleTypeId_in_entryRuleTypeId6780);
            iv_ruleTypeId=ruleTypeId();

            state._fsp--;

             current =iv_ruleTypeId.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeId6791); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2345:1: ruleTypeId returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TypeSpecifier_0= ruleTypeSpecifier )+ ;
    public final AntlrDatatypeRuleToken ruleTypeId() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_TypeSpecifier_0 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2348:28: ( (this_TypeSpecifier_0= ruleTypeSpecifier )+ )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2349:1: (this_TypeSpecifier_0= ruleTypeSpecifier )+
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2349:1: (this_TypeSpecifier_0= ruleTypeSpecifier )+
            int cnt51=0;
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==RULE_ID||LA51_0==58||(LA51_0>=60 && LA51_0<=74)||LA51_0==77||LA51_0==82||LA51_0==133||(LA51_0>=136 && LA51_0<=137)||LA51_0==140||LA51_0==146) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2350:5: this_TypeSpecifier_0= ruleTypeSpecifier
            	    {
            	     
            	            newCompositeNode(grammarAccess.getTypeIdAccess().getTypeSpecifierParserRuleCall()); 
            	        
            	    pushFollow(FOLLOW_ruleTypeSpecifier_in_ruleTypeId6838);
            	    this_TypeSpecifier_0=ruleTypeSpecifier();

            	    state._fsp--;


            	    		current.merge(this_TypeSpecifier_0);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt51 >= 1 ) break loop51;
                        EarlyExitException eee =
                            new EarlyExitException(51, input);
                        throw eee;
                }
                cnt51++;
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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2368:1: entryRuleParameterDeclarationClause returns [String current=null] : iv_ruleParameterDeclarationClause= ruleParameterDeclarationClause EOF ;
    public final String entryRuleParameterDeclarationClause() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleParameterDeclarationClause = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2369:2: (iv_ruleParameterDeclarationClause= ruleParameterDeclarationClause EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2370:2: iv_ruleParameterDeclarationClause= ruleParameterDeclarationClause EOF
            {
             newCompositeNode(grammarAccess.getParameterDeclarationClauseRule()); 
            pushFollow(FOLLOW_ruleParameterDeclarationClause_in_entryRuleParameterDeclarationClause6885);
            iv_ruleParameterDeclarationClause=ruleParameterDeclarationClause();

            state._fsp--;

             current =iv_ruleParameterDeclarationClause.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterDeclarationClause6896); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2377:1: ruleParameterDeclarationClause returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '...' | (this_ParameterDeclarationList_1= ruleParameterDeclarationList ( (kw= ',' )? kw= '...' )? ) ) ;
    public final AntlrDatatypeRuleToken ruleParameterDeclarationClause() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ParameterDeclarationList_1 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2380:28: ( (kw= '...' | (this_ParameterDeclarationList_1= ruleParameterDeclarationList ( (kw= ',' )? kw= '...' )? ) ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2381:1: (kw= '...' | (this_ParameterDeclarationList_1= ruleParameterDeclarationList ( (kw= ',' )? kw= '...' )? ) )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2381:1: (kw= '...' | (this_ParameterDeclarationList_1= ruleParameterDeclarationList ( (kw= ',' )? kw= '...' )? ) )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==88) ) {
                alt54=1;
            }
            else if ( (LA54_0==RULE_ID||(LA54_0>=47 && LA54_0<=58)||(LA54_0>=60 && LA54_0<=74)||LA54_0==77||LA54_0==82||LA54_0==133||(LA54_0>=136 && LA54_0<=137)||LA54_0==140||LA54_0==146) ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2382:2: kw= '...'
                    {
                    kw=(Token)match(input,88,FOLLOW_88_in_ruleParameterDeclarationClause6934); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getParameterDeclarationClauseAccess().getFullStopFullStopFullStopKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2388:6: (this_ParameterDeclarationList_1= ruleParameterDeclarationList ( (kw= ',' )? kw= '...' )? )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2388:6: (this_ParameterDeclarationList_1= ruleParameterDeclarationList ( (kw= ',' )? kw= '...' )? )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2389:5: this_ParameterDeclarationList_1= ruleParameterDeclarationList ( (kw= ',' )? kw= '...' )?
                    {
                     
                            newCompositeNode(grammarAccess.getParameterDeclarationClauseAccess().getParameterDeclarationListParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_ruleParameterDeclarationList_in_ruleParameterDeclarationClause6963);
                    this_ParameterDeclarationList_1=ruleParameterDeclarationList();

                    state._fsp--;


                    		current.merge(this_ParameterDeclarationList_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2399:1: ( (kw= ',' )? kw= '...' )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==45||LA53_0==88) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2399:2: (kw= ',' )? kw= '...'
                            {
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2399:2: (kw= ',' )?
                            int alt52=2;
                            int LA52_0 = input.LA(1);

                            if ( (LA52_0==45) ) {
                                alt52=1;
                            }
                            switch (alt52) {
                                case 1 :
                                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2400:2: kw= ','
                                    {
                                    kw=(Token)match(input,45,FOLLOW_45_in_ruleParameterDeclarationClause6983); 

                                            current.merge(kw);
                                            newLeafNode(kw, grammarAccess.getParameterDeclarationClauseAccess().getCommaKeyword_1_1_0()); 
                                        

                                    }
                                    break;

                            }

                            kw=(Token)match(input,88,FOLLOW_88_in_ruleParameterDeclarationClause6998); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2419:1: entryRuleParameterDeclarationList returns [String current=null] : iv_ruleParameterDeclarationList= ruleParameterDeclarationList EOF ;
    public final String entryRuleParameterDeclarationList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleParameterDeclarationList = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2420:2: (iv_ruleParameterDeclarationList= ruleParameterDeclarationList EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2421:2: iv_ruleParameterDeclarationList= ruleParameterDeclarationList EOF
            {
             newCompositeNode(grammarAccess.getParameterDeclarationListRule()); 
            pushFollow(FOLLOW_ruleParameterDeclarationList_in_entryRuleParameterDeclarationList7042);
            iv_ruleParameterDeclarationList=ruleParameterDeclarationList();

            state._fsp--;

             current =iv_ruleParameterDeclarationList.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterDeclarationList7053); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2428:1: ruleParameterDeclarationList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ParameterDeclaration_0= ruleParameterDeclaration (kw= ',' this_ParameterDeclaration_2= ruleParameterDeclaration )* ) ;
    public final AntlrDatatypeRuleToken ruleParameterDeclarationList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ParameterDeclaration_0 = null;

        AntlrDatatypeRuleToken this_ParameterDeclaration_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2431:28: ( (this_ParameterDeclaration_0= ruleParameterDeclaration (kw= ',' this_ParameterDeclaration_2= ruleParameterDeclaration )* ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2432:1: (this_ParameterDeclaration_0= ruleParameterDeclaration (kw= ',' this_ParameterDeclaration_2= ruleParameterDeclaration )* )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2432:1: (this_ParameterDeclaration_0= ruleParameterDeclaration (kw= ',' this_ParameterDeclaration_2= ruleParameterDeclaration )* )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2433:5: this_ParameterDeclaration_0= ruleParameterDeclaration (kw= ',' this_ParameterDeclaration_2= ruleParameterDeclaration )*
            {
             
                    newCompositeNode(grammarAccess.getParameterDeclarationListAccess().getParameterDeclarationParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleParameterDeclaration_in_ruleParameterDeclarationList7100);
            this_ParameterDeclaration_0=ruleParameterDeclaration();

            state._fsp--;


            		current.merge(this_ParameterDeclaration_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2443:1: (kw= ',' this_ParameterDeclaration_2= ruleParameterDeclaration )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==45) ) {
                    int LA55_1 = input.LA(2);

                    if ( (LA55_1==RULE_ID||(LA55_1>=47 && LA55_1<=58)||(LA55_1>=60 && LA55_1<=74)||LA55_1==77||LA55_1==82||LA55_1==133||(LA55_1>=136 && LA55_1<=137)||LA55_1==140||LA55_1==146) ) {
                        alt55=1;
                    }


                }


                switch (alt55) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2444:2: kw= ',' this_ParameterDeclaration_2= ruleParameterDeclaration
            	    {
            	    kw=(Token)match(input,45,FOLLOW_45_in_ruleParameterDeclarationList7119); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getParameterDeclarationListAccess().getCommaKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getParameterDeclarationListAccess().getParameterDeclarationParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_ruleParameterDeclaration_in_ruleParameterDeclarationList7141);
            	    this_ParameterDeclaration_2=ruleParameterDeclaration();

            	    state._fsp--;


            	    		current.merge(this_ParameterDeclaration_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop55;
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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2468:1: entryRuleParameterDeclaration returns [String current=null] : iv_ruleParameterDeclaration= ruleParameterDeclaration EOF ;
    public final String entryRuleParameterDeclaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleParameterDeclaration = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2469:2: (iv_ruleParameterDeclaration= ruleParameterDeclaration EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2470:2: iv_ruleParameterDeclaration= ruleParameterDeclaration EOF
            {
             newCompositeNode(grammarAccess.getParameterDeclarationRule()); 
            pushFollow(FOLLOW_ruleParameterDeclaration_in_entryRuleParameterDeclaration7189);
            iv_ruleParameterDeclaration=ruleParameterDeclaration();

            state._fsp--;

             current =iv_ruleParameterDeclaration.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterDeclaration7200); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2477:1: ruleParameterDeclaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_DeclarationSpecifier_0= ruleDeclarationSpecifier )+ this_InitDeclarator_1= ruleInitDeclarator ) ;
    public final AntlrDatatypeRuleToken ruleParameterDeclaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_DeclarationSpecifier_0 = null;

        AntlrDatatypeRuleToken this_InitDeclarator_1 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2480:28: ( ( (this_DeclarationSpecifier_0= ruleDeclarationSpecifier )+ this_InitDeclarator_1= ruleInitDeclarator ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2481:1: ( (this_DeclarationSpecifier_0= ruleDeclarationSpecifier )+ this_InitDeclarator_1= ruleInitDeclarator )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2481:1: ( (this_DeclarationSpecifier_0= ruleDeclarationSpecifier )+ this_InitDeclarator_1= ruleInitDeclarator )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2481:2: (this_DeclarationSpecifier_0= ruleDeclarationSpecifier )+ this_InitDeclarator_1= ruleInitDeclarator
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2481:2: (this_DeclarationSpecifier_0= ruleDeclarationSpecifier )+
            int cnt56=0;
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==RULE_ID||(LA56_0>=47 && LA56_0<=58)||(LA56_0>=60 && LA56_0<=74)||LA56_0==77||LA56_0==82||LA56_0==133||(LA56_0>=136 && LA56_0<=137)||LA56_0==140||LA56_0==146) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2482:5: this_DeclarationSpecifier_0= ruleDeclarationSpecifier
            	    {
            	     
            	            newCompositeNode(grammarAccess.getParameterDeclarationAccess().getDeclarationSpecifierParserRuleCall_0()); 
            	        
            	    pushFollow(FOLLOW_ruleDeclarationSpecifier_in_ruleParameterDeclaration7248);
            	    this_DeclarationSpecifier_0=ruleDeclarationSpecifier();

            	    state._fsp--;


            	    		current.merge(this_DeclarationSpecifier_0);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt56 >= 1 ) break loop56;
                        EarlyExitException eee =
                            new EarlyExitException(56, input);
                        throw eee;
                }
                cnt56++;
            } while (true);

             
                    newCompositeNode(grammarAccess.getParameterDeclarationAccess().getInitDeclaratorParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleInitDeclarator_in_ruleParameterDeclaration7277);
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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2511:1: entryRuleFunctionBody returns [String current=null] : iv_ruleFunctionBody= ruleFunctionBody EOF ;
    public final String entryRuleFunctionBody() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunctionBody = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2512:2: (iv_ruleFunctionBody= ruleFunctionBody EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2513:2: iv_ruleFunctionBody= ruleFunctionBody EOF
            {
             newCompositeNode(grammarAccess.getFunctionBodyRule()); 
            pushFollow(FOLLOW_ruleFunctionBody_in_entryRuleFunctionBody7323);
            iv_ruleFunctionBody=ruleFunctionBody();

            state._fsp--;

             current =iv_ruleFunctionBody.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionBody7334); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2520:1: ruleFunctionBody returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_CtorInitializer_0= ruleCtorInitializer )? this_CompoundStatement_1= ruleCompoundStatement ) | this_FunctionTryBlock_2= ruleFunctionTryBlock ) ;
    public final AntlrDatatypeRuleToken ruleFunctionBody() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_CtorInitializer_0 = null;

        AntlrDatatypeRuleToken this_CompoundStatement_1 = null;

        AntlrDatatypeRuleToken this_FunctionTryBlock_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2523:28: ( ( ( (this_CtorInitializer_0= ruleCtorInitializer )? this_CompoundStatement_1= ruleCompoundStatement ) | this_FunctionTryBlock_2= ruleFunctionTryBlock ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2524:1: ( ( (this_CtorInitializer_0= ruleCtorInitializer )? this_CompoundStatement_1= ruleCompoundStatement ) | this_FunctionTryBlock_2= ruleFunctionTryBlock )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2524:1: ( ( (this_CtorInitializer_0= ruleCtorInitializer )? this_CompoundStatement_1= ruleCompoundStatement ) | this_FunctionTryBlock_2= ruleFunctionTryBlock )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( ((LA58_0>=142 && LA58_0<=143)) ) {
                alt58=1;
            }
            else if ( (LA58_0==128) ) {
                alt58=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2524:2: ( (this_CtorInitializer_0= ruleCtorInitializer )? this_CompoundStatement_1= ruleCompoundStatement )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2524:2: ( (this_CtorInitializer_0= ruleCtorInitializer )? this_CompoundStatement_1= ruleCompoundStatement )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2524:3: (this_CtorInitializer_0= ruleCtorInitializer )? this_CompoundStatement_1= ruleCompoundStatement
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2524:3: (this_CtorInitializer_0= ruleCtorInitializer )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==143) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2525:5: this_CtorInitializer_0= ruleCtorInitializer
                            {
                             
                                    newCompositeNode(grammarAccess.getFunctionBodyAccess().getCtorInitializerParserRuleCall_0_0()); 
                                
                            pushFollow(FOLLOW_ruleCtorInitializer_in_ruleFunctionBody7383);
                            this_CtorInitializer_0=ruleCtorInitializer();

                            state._fsp--;


                            		current.merge(this_CtorInitializer_0);
                                
                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                     
                            newCompositeNode(grammarAccess.getFunctionBodyAccess().getCompoundStatementParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleCompoundStatement_in_ruleFunctionBody7412);
                    this_CompoundStatement_1=ruleCompoundStatement();

                    state._fsp--;


                    		current.merge(this_CompoundStatement_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2548:5: this_FunctionTryBlock_2= ruleFunctionTryBlock
                    {
                     
                            newCompositeNode(grammarAccess.getFunctionBodyAccess().getFunctionTryBlockParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleFunctionTryBlock_in_ruleFunctionBody7446);
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


    // $ANTLR start "entryRuleOperatorFunctionId"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2566:1: entryRuleOperatorFunctionId returns [String current=null] : iv_ruleOperatorFunctionId= ruleOperatorFunctionId EOF ;
    public final String entryRuleOperatorFunctionId() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperatorFunctionId = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2567:2: (iv_ruleOperatorFunctionId= ruleOperatorFunctionId EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2568:2: iv_ruleOperatorFunctionId= ruleOperatorFunctionId EOF
            {
             newCompositeNode(grammarAccess.getOperatorFunctionIdRule()); 
            pushFollow(FOLLOW_ruleOperatorFunctionId_in_entryRuleOperatorFunctionId7492);
            iv_ruleOperatorFunctionId=ruleOperatorFunctionId();

            state._fsp--;

             current =iv_ruleOperatorFunctionId.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperatorFunctionId7503); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2575:1: ruleOperatorFunctionId returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'operator' this_OverloadableOperator_1= ruleOverloadableOperator (kw= '<' (this_ConstantExpression_3= ruleConstantExpression | this_TypeSpecifier_4= ruleTypeSpecifier | this_IdExpression_5= ruleIdExpression )* kw= '>' )? ) ;
    public final AntlrDatatypeRuleToken ruleOperatorFunctionId() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_OverloadableOperator_1 = null;

        AntlrDatatypeRuleToken this_ConstantExpression_3 = null;

        AntlrDatatypeRuleToken this_TypeSpecifier_4 = null;

        AntlrDatatypeRuleToken this_IdExpression_5 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2578:28: ( (kw= 'operator' this_OverloadableOperator_1= ruleOverloadableOperator (kw= '<' (this_ConstantExpression_3= ruleConstantExpression | this_TypeSpecifier_4= ruleTypeSpecifier | this_IdExpression_5= ruleIdExpression )* kw= '>' )? ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2579:1: (kw= 'operator' this_OverloadableOperator_1= ruleOverloadableOperator (kw= '<' (this_ConstantExpression_3= ruleConstantExpression | this_TypeSpecifier_4= ruleTypeSpecifier | this_IdExpression_5= ruleIdExpression )* kw= '>' )? )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2579:1: (kw= 'operator' this_OverloadableOperator_1= ruleOverloadableOperator (kw= '<' (this_ConstantExpression_3= ruleConstantExpression | this_TypeSpecifier_4= ruleTypeSpecifier | this_IdExpression_5= ruleIdExpression )* kw= '>' )? )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2580:2: kw= 'operator' this_OverloadableOperator_1= ruleOverloadableOperator (kw= '<' (this_ConstantExpression_3= ruleConstantExpression | this_TypeSpecifier_4= ruleTypeSpecifier | this_IdExpression_5= ruleIdExpression )* kw= '>' )?
            {
            kw=(Token)match(input,89,FOLLOW_89_in_ruleOperatorFunctionId7541); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getOperatorFunctionIdAccess().getOperatorKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getOperatorFunctionIdAccess().getOverloadableOperatorParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleOverloadableOperator_in_ruleOperatorFunctionId7563);
            this_OverloadableOperator_1=ruleOverloadableOperator();

            state._fsp--;


            		current.merge(this_OverloadableOperator_1);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2596:1: (kw= '<' (this_ConstantExpression_3= ruleConstantExpression | this_TypeSpecifier_4= ruleTypeSpecifier | this_IdExpression_5= ruleIdExpression )* kw= '>' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==90) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2597:2: kw= '<' (this_ConstantExpression_3= ruleConstantExpression | this_TypeSpecifier_4= ruleTypeSpecifier | this_IdExpression_5= ruleIdExpression )* kw= '>'
                    {
                    kw=(Token)match(input,90,FOLLOW_90_in_ruleOperatorFunctionId7582); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOperatorFunctionIdAccess().getLessThanSignKeyword_2_0()); 
                        
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2602:1: (this_ConstantExpression_3= ruleConstantExpression | this_TypeSpecifier_4= ruleTypeSpecifier | this_IdExpression_5= ruleIdExpression )*
                    loop59:
                    do {
                        int alt59=4;
                        switch ( input.LA(1) ) {
                        case 138:
                            {
                            alt59=1;
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
                        case 82:
                        case 133:
                        case 136:
                        case 137:
                        case 140:
                        case 146:
                            {
                            alt59=2;
                            }
                            break;
                        case 139:
                            {
                            alt59=3;
                            }
                            break;

                        }

                        switch (alt59) {
                    	case 1 :
                    	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2603:5: this_ConstantExpression_3= ruleConstantExpression
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getOperatorFunctionIdAccess().getConstantExpressionParserRuleCall_2_1_0()); 
                    	        
                    	    pushFollow(FOLLOW_ruleConstantExpression_in_ruleOperatorFunctionId7605);
                    	    this_ConstantExpression_3=ruleConstantExpression();

                    	    state._fsp--;


                    	    		current.merge(this_ConstantExpression_3);
                    	        
                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2615:5: this_TypeSpecifier_4= ruleTypeSpecifier
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getOperatorFunctionIdAccess().getTypeSpecifierParserRuleCall_2_1_1()); 
                    	        
                    	    pushFollow(FOLLOW_ruleTypeSpecifier_in_ruleOperatorFunctionId7638);
                    	    this_TypeSpecifier_4=ruleTypeSpecifier();

                    	    state._fsp--;


                    	    		current.merge(this_TypeSpecifier_4);
                    	        
                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;
                    	case 3 :
                    	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2627:5: this_IdExpression_5= ruleIdExpression
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getOperatorFunctionIdAccess().getIdExpressionParserRuleCall_2_1_2()); 
                    	        
                    	    pushFollow(FOLLOW_ruleIdExpression_in_ruleOperatorFunctionId7671);
                    	    this_IdExpression_5=ruleIdExpression();

                    	    state._fsp--;


                    	    		current.merge(this_IdExpression_5);
                    	        
                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop59;
                        }
                    } while (true);

                    kw=(Token)match(input,91,FOLLOW_91_in_ruleOperatorFunctionId7691); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2651:1: entryRuleOverloadableOperator returns [String current=null] : iv_ruleOverloadableOperator= ruleOverloadableOperator EOF ;
    public final String entryRuleOverloadableOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOverloadableOperator = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2652:2: (iv_ruleOverloadableOperator= ruleOverloadableOperator EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2653:2: iv_ruleOverloadableOperator= ruleOverloadableOperator EOF
            {
             newCompositeNode(grammarAccess.getOverloadableOperatorRule()); 
            pushFollow(FOLLOW_ruleOverloadableOperator_in_entryRuleOverloadableOperator7734);
            iv_ruleOverloadableOperator=ruleOverloadableOperator();

            state._fsp--;

             current =iv_ruleOverloadableOperator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOverloadableOperator7745); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2660:1: ruleOverloadableOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'new' | kw= 'delete' | (kw= 'new' kw= '[' kw= ']' ) | (kw= 'delete' kw= '[' kw= ']' ) | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= '^' | kw= '&' | kw= '|' | kw= '~' | kw= '!' | kw= '=' | kw= '<' | kw= '>' | kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' | kw= '^=' | kw= '&=' | kw= '|=' | kw= '<<' | kw= '>>' | kw= '>>=' | kw= '<<=' | kw= '==' | kw= '!=' | kw= '<=' | kw= '>=' | kw= '&&' | kw= '||' | kw= '++' | kw= '--' | kw= ',' | kw= '->*' | kw= '->' | kw= '()' | kw= '[]' ) ;
    public final AntlrDatatypeRuleToken ruleOverloadableOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2663:28: ( (kw= 'new' | kw= 'delete' | (kw= 'new' kw= '[' kw= ']' ) | (kw= 'delete' kw= '[' kw= ']' ) | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= '^' | kw= '&' | kw= '|' | kw= '~' | kw= '!' | kw= '=' | kw= '<' | kw= '>' | kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' | kw= '^=' | kw= '&=' | kw= '|=' | kw= '<<' | kw= '>>' | kw= '>>=' | kw= '<<=' | kw= '==' | kw= '!=' | kw= '<=' | kw= '>=' | kw= '&&' | kw= '||' | kw= '++' | kw= '--' | kw= ',' | kw= '->*' | kw= '->' | kw= '()' | kw= '[]' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2664:1: (kw= 'new' | kw= 'delete' | (kw= 'new' kw= '[' kw= ']' ) | (kw= 'delete' kw= '[' kw= ']' ) | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= '^' | kw= '&' | kw= '|' | kw= '~' | kw= '!' | kw= '=' | kw= '<' | kw= '>' | kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' | kw= '^=' | kw= '&=' | kw= '|=' | kw= '<<' | kw= '>>' | kw= '>>=' | kw= '<<=' | kw= '==' | kw= '!=' | kw= '<=' | kw= '>=' | kw= '&&' | kw= '||' | kw= '++' | kw= '--' | kw= ',' | kw= '->*' | kw= '->' | kw= '()' | kw= '[]' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2664:1: (kw= 'new' | kw= 'delete' | (kw= 'new' kw= '[' kw= ']' ) | (kw= 'delete' kw= '[' kw= ']' ) | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= '^' | kw= '&' | kw= '|' | kw= '~' | kw= '!' | kw= '=' | kw= '<' | kw= '>' | kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' | kw= '^=' | kw= '&=' | kw= '|=' | kw= '<<' | kw= '>>' | kw= '>>=' | kw= '<<=' | kw= '==' | kw= '!=' | kw= '<=' | kw= '>=' | kw= '&&' | kw= '||' | kw= '++' | kw= '--' | kw= ',' | kw= '->*' | kw= '->' | kw= '()' | kw= '[]' )
            int alt61=42;
            alt61 = dfa61.predict(input);
            switch (alt61) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2665:2: kw= 'new'
                    {
                    kw=(Token)match(input,92,FOLLOW_92_in_ruleOverloadableOperator7783); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getNewKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2672:2: kw= 'delete'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleOverloadableOperator7802); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getDeleteKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2678:6: (kw= 'new' kw= '[' kw= ']' )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2678:6: (kw= 'new' kw= '[' kw= ']' )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2679:2: kw= 'new' kw= '[' kw= ']'
                    {
                    kw=(Token)match(input,92,FOLLOW_92_in_ruleOverloadableOperator7822); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getNewKeyword_2_0()); 
                        
                    kw=(Token)match(input,93,FOLLOW_93_in_ruleOverloadableOperator7835); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getLeftSquareBracketKeyword_2_1()); 
                        
                    kw=(Token)match(input,94,FOLLOW_94_in_ruleOverloadableOperator7848); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getRightSquareBracketKeyword_2_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2697:6: (kw= 'delete' kw= '[' kw= ']' )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2697:6: (kw= 'delete' kw= '[' kw= ']' )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2698:2: kw= 'delete' kw= '[' kw= ']'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleOverloadableOperator7869); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getDeleteKeyword_3_0()); 
                        
                    kw=(Token)match(input,93,FOLLOW_93_in_ruleOverloadableOperator7882); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getLeftSquareBracketKeyword_3_1()); 
                        
                    kw=(Token)match(input,94,FOLLOW_94_in_ruleOverloadableOperator7895); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getRightSquareBracketKeyword_3_2()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2717:2: kw= '+'
                    {
                    kw=(Token)match(input,95,FOLLOW_95_in_ruleOverloadableOperator7915); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getPlusSignKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2724:2: kw= '-'
                    {
                    kw=(Token)match(input,96,FOLLOW_96_in_ruleOverloadableOperator7934); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getHyphenMinusKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2731:2: kw= '*'
                    {
                    kw=(Token)match(input,97,FOLLOW_97_in_ruleOverloadableOperator7953); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getAsteriskKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2738:2: kw= '/'
                    {
                    kw=(Token)match(input,98,FOLLOW_98_in_ruleOverloadableOperator7972); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getSolidusKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2745:2: kw= '%'
                    {
                    kw=(Token)match(input,99,FOLLOW_99_in_ruleOverloadableOperator7991); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getPercentSignKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2752:2: kw= '^'
                    {
                    kw=(Token)match(input,100,FOLLOW_100_in_ruleOverloadableOperator8010); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getCircumflexAccentKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2759:2: kw= '&'
                    {
                    kw=(Token)match(input,86,FOLLOW_86_in_ruleOverloadableOperator8029); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getAmpersandKeyword_10()); 
                        

                    }
                    break;
                case 12 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2766:2: kw= '|'
                    {
                    kw=(Token)match(input,101,FOLLOW_101_in_ruleOverloadableOperator8048); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getVerticalLineKeyword_11()); 
                        

                    }
                    break;
                case 13 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2773:2: kw= '~'
                    {
                    kw=(Token)match(input,102,FOLLOW_102_in_ruleOverloadableOperator8067); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getTildeKeyword_12()); 
                        

                    }
                    break;
                case 14 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2780:2: kw= '!'
                    {
                    kw=(Token)match(input,103,FOLLOW_103_in_ruleOverloadableOperator8086); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getExclamationMarkKeyword_13()); 
                        

                    }
                    break;
                case 15 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2787:2: kw= '='
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleOverloadableOperator8105); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getEqualsSignKeyword_14()); 
                        

                    }
                    break;
                case 16 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2794:2: kw= '<'
                    {
                    kw=(Token)match(input,90,FOLLOW_90_in_ruleOverloadableOperator8124); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getLessThanSignKeyword_15()); 
                        

                    }
                    break;
                case 17 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2801:2: kw= '>'
                    {
                    kw=(Token)match(input,91,FOLLOW_91_in_ruleOverloadableOperator8143); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getGreaterThanSignKeyword_16()); 
                        

                    }
                    break;
                case 18 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2808:2: kw= '+='
                    {
                    kw=(Token)match(input,104,FOLLOW_104_in_ruleOverloadableOperator8162); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getPlusSignEqualsSignKeyword_17()); 
                        

                    }
                    break;
                case 19 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2815:2: kw= '-='
                    {
                    kw=(Token)match(input,105,FOLLOW_105_in_ruleOverloadableOperator8181); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getHyphenMinusEqualsSignKeyword_18()); 
                        

                    }
                    break;
                case 20 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2822:2: kw= '*='
                    {
                    kw=(Token)match(input,106,FOLLOW_106_in_ruleOverloadableOperator8200); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getAsteriskEqualsSignKeyword_19()); 
                        

                    }
                    break;
                case 21 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2829:2: kw= '/='
                    {
                    kw=(Token)match(input,107,FOLLOW_107_in_ruleOverloadableOperator8219); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getSolidusEqualsSignKeyword_20()); 
                        

                    }
                    break;
                case 22 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2836:2: kw= '%='
                    {
                    kw=(Token)match(input,108,FOLLOW_108_in_ruleOverloadableOperator8238); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getPercentSignEqualsSignKeyword_21()); 
                        

                    }
                    break;
                case 23 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2843:2: kw= '^='
                    {
                    kw=(Token)match(input,109,FOLLOW_109_in_ruleOverloadableOperator8257); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getCircumflexAccentEqualsSignKeyword_22()); 
                        

                    }
                    break;
                case 24 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2850:2: kw= '&='
                    {
                    kw=(Token)match(input,110,FOLLOW_110_in_ruleOverloadableOperator8276); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getAmpersandEqualsSignKeyword_23()); 
                        

                    }
                    break;
                case 25 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2857:2: kw= '|='
                    {
                    kw=(Token)match(input,111,FOLLOW_111_in_ruleOverloadableOperator8295); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getVerticalLineEqualsSignKeyword_24()); 
                        

                    }
                    break;
                case 26 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2864:2: kw= '<<'
                    {
                    kw=(Token)match(input,112,FOLLOW_112_in_ruleOverloadableOperator8314); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getLessThanSignLessThanSignKeyword_25()); 
                        

                    }
                    break;
                case 27 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2871:2: kw= '>>'
                    {
                    kw=(Token)match(input,113,FOLLOW_113_in_ruleOverloadableOperator8333); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getGreaterThanSignGreaterThanSignKeyword_26()); 
                        

                    }
                    break;
                case 28 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2878:2: kw= '>>='
                    {
                    kw=(Token)match(input,114,FOLLOW_114_in_ruleOverloadableOperator8352); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getGreaterThanSignGreaterThanSignEqualsSignKeyword_27()); 
                        

                    }
                    break;
                case 29 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2885:2: kw= '<<='
                    {
                    kw=(Token)match(input,115,FOLLOW_115_in_ruleOverloadableOperator8371); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getLessThanSignLessThanSignEqualsSignKeyword_28()); 
                        

                    }
                    break;
                case 30 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2892:2: kw= '=='
                    {
                    kw=(Token)match(input,116,FOLLOW_116_in_ruleOverloadableOperator8390); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getEqualsSignEqualsSignKeyword_29()); 
                        

                    }
                    break;
                case 31 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2899:2: kw= '!='
                    {
                    kw=(Token)match(input,117,FOLLOW_117_in_ruleOverloadableOperator8409); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getExclamationMarkEqualsSignKeyword_30()); 
                        

                    }
                    break;
                case 32 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2906:2: kw= '<='
                    {
                    kw=(Token)match(input,118,FOLLOW_118_in_ruleOverloadableOperator8428); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getLessThanSignEqualsSignKeyword_31()); 
                        

                    }
                    break;
                case 33 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2913:2: kw= '>='
                    {
                    kw=(Token)match(input,119,FOLLOW_119_in_ruleOverloadableOperator8447); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getGreaterThanSignEqualsSignKeyword_32()); 
                        

                    }
                    break;
                case 34 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2920:2: kw= '&&'
                    {
                    kw=(Token)match(input,87,FOLLOW_87_in_ruleOverloadableOperator8466); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getAmpersandAmpersandKeyword_33()); 
                        

                    }
                    break;
                case 35 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2927:2: kw= '||'
                    {
                    kw=(Token)match(input,120,FOLLOW_120_in_ruleOverloadableOperator8485); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getVerticalLineVerticalLineKeyword_34()); 
                        

                    }
                    break;
                case 36 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2934:2: kw= '++'
                    {
                    kw=(Token)match(input,121,FOLLOW_121_in_ruleOverloadableOperator8504); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getPlusSignPlusSignKeyword_35()); 
                        

                    }
                    break;
                case 37 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2941:2: kw= '--'
                    {
                    kw=(Token)match(input,122,FOLLOW_122_in_ruleOverloadableOperator8523); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getHyphenMinusHyphenMinusKeyword_36()); 
                        

                    }
                    break;
                case 38 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2948:2: kw= ','
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleOverloadableOperator8542); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getCommaKeyword_37()); 
                        

                    }
                    break;
                case 39 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2955:2: kw= '->*'
                    {
                    kw=(Token)match(input,123,FOLLOW_123_in_ruleOverloadableOperator8561); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getHyphenMinusGreaterThanSignAsteriskKeyword_38()); 
                        

                    }
                    break;
                case 40 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2962:2: kw= '->'
                    {
                    kw=(Token)match(input,124,FOLLOW_124_in_ruleOverloadableOperator8580); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getHyphenMinusGreaterThanSignKeyword_39()); 
                        

                    }
                    break;
                case 41 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2969:2: kw= '()'
                    {
                    kw=(Token)match(input,125,FOLLOW_125_in_ruleOverloadableOperator8599); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getLeftParenthesisRightParenthesisKeyword_40()); 
                        

                    }
                    break;
                case 42 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2976:2: kw= '[]'
                    {
                    kw=(Token)match(input,126,FOLLOW_126_in_ruleOverloadableOperator8618); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2989:1: entryRuleLiteralOperatorId returns [String current=null] : iv_ruleLiteralOperatorId= ruleLiteralOperatorId EOF ;
    public final String entryRuleLiteralOperatorId() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteralOperatorId = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2990:2: (iv_ruleLiteralOperatorId= ruleLiteralOperatorId EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2991:2: iv_ruleLiteralOperatorId= ruleLiteralOperatorId EOF
            {
             newCompositeNode(grammarAccess.getLiteralOperatorIdRule()); 
            pushFollow(FOLLOW_ruleLiteralOperatorId_in_entryRuleLiteralOperatorId8659);
            iv_ruleLiteralOperatorId=ruleLiteralOperatorId();

            state._fsp--;

             current =iv_ruleLiteralOperatorId.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralOperatorId8670); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2998:1: ruleLiteralOperatorId returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'operator' kw= '\"' kw= '\"' ) ;
    public final AntlrDatatypeRuleToken ruleLiteralOperatorId() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3001:28: ( (kw= 'operator' kw= '\"' kw= '\"' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3002:1: (kw= 'operator' kw= '\"' kw= '\"' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3002:1: (kw= 'operator' kw= '\"' kw= '\"' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3003:2: kw= 'operator' kw= '\"' kw= '\"'
            {
            kw=(Token)match(input,89,FOLLOW_89_in_ruleLiteralOperatorId8708); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getLiteralOperatorIdAccess().getOperatorKeyword_0()); 
                
            kw=(Token)match(input,127,FOLLOW_127_in_ruleLiteralOperatorId8721); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getLiteralOperatorIdAccess().getQuotationMarkKeyword_1()); 
                
            kw=(Token)match(input,127,FOLLOW_127_in_ruleLiteralOperatorId8734); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3028:1: entryRuleTemplateDeclaration returns [String current=null] : iv_ruleTemplateDeclaration= ruleTemplateDeclaration EOF ;
    public final String entryRuleTemplateDeclaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTemplateDeclaration = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3029:2: (iv_ruleTemplateDeclaration= ruleTemplateDeclaration EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3030:2: iv_ruleTemplateDeclaration= ruleTemplateDeclaration EOF
            {
             newCompositeNode(grammarAccess.getTemplateDeclarationRule()); 
            pushFollow(FOLLOW_ruleTemplateDeclaration_in_entryRuleTemplateDeclaration8775);
            iv_ruleTemplateDeclaration=ruleTemplateDeclaration();

            state._fsp--;

             current =iv_ruleTemplateDeclaration.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateDeclaration8786); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3037:1: ruleTemplateDeclaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'template' kw= '<' this_TemplateParameterList_2= ruleTemplateParameterList kw= '>' ) ;
    public final AntlrDatatypeRuleToken ruleTemplateDeclaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_TemplateParameterList_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3040:28: ( (kw= 'template' kw= '<' this_TemplateParameterList_2= ruleTemplateParameterList kw= '>' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3041:1: (kw= 'template' kw= '<' this_TemplateParameterList_2= ruleTemplateParameterList kw= '>' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3041:1: (kw= 'template' kw= '<' this_TemplateParameterList_2= ruleTemplateParameterList kw= '>' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3042:2: kw= 'template' kw= '<' this_TemplateParameterList_2= ruleTemplateParameterList kw= '>'
            {
            kw=(Token)match(input,59,FOLLOW_59_in_ruleTemplateDeclaration8824); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getTemplateDeclarationAccess().getTemplateKeyword_0()); 
                
            kw=(Token)match(input,90,FOLLOW_90_in_ruleTemplateDeclaration8837); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getTemplateDeclarationAccess().getLessThanSignKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getTemplateDeclarationAccess().getTemplateParameterListParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleTemplateParameterList_in_ruleTemplateDeclaration8859);
            this_TemplateParameterList_2=ruleTemplateParameterList();

            state._fsp--;


            		current.merge(this_TemplateParameterList_2);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,91,FOLLOW_91_in_ruleTemplateDeclaration8877); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3078:1: entryRuleTemplateParameterList returns [String current=null] : iv_ruleTemplateParameterList= ruleTemplateParameterList EOF ;
    public final String entryRuleTemplateParameterList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTemplateParameterList = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3079:2: (iv_ruleTemplateParameterList= ruleTemplateParameterList EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3080:2: iv_ruleTemplateParameterList= ruleTemplateParameterList EOF
            {
             newCompositeNode(grammarAccess.getTemplateParameterListRule()); 
            pushFollow(FOLLOW_ruleTemplateParameterList_in_entryRuleTemplateParameterList8918);
            iv_ruleTemplateParameterList=ruleTemplateParameterList();

            state._fsp--;

             current =iv_ruleTemplateParameterList.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateParameterList8929); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3087:1: ruleTemplateParameterList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TemplateParameter_0= ruleTemplateParameter (kw= ',' this_TemplateParameter_2= ruleTemplateParameter )* ) ;
    public final AntlrDatatypeRuleToken ruleTemplateParameterList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_TemplateParameter_0 = null;

        AntlrDatatypeRuleToken this_TemplateParameter_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3090:28: ( (this_TemplateParameter_0= ruleTemplateParameter (kw= ',' this_TemplateParameter_2= ruleTemplateParameter )* ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3091:1: (this_TemplateParameter_0= ruleTemplateParameter (kw= ',' this_TemplateParameter_2= ruleTemplateParameter )* )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3091:1: (this_TemplateParameter_0= ruleTemplateParameter (kw= ',' this_TemplateParameter_2= ruleTemplateParameter )* )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3092:5: this_TemplateParameter_0= ruleTemplateParameter (kw= ',' this_TemplateParameter_2= ruleTemplateParameter )*
            {
             
                    newCompositeNode(grammarAccess.getTemplateParameterListAccess().getTemplateParameterParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleTemplateParameter_in_ruleTemplateParameterList8976);
            this_TemplateParameter_0=ruleTemplateParameter();

            state._fsp--;


            		current.merge(this_TemplateParameter_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3102:1: (kw= ',' this_TemplateParameter_2= ruleTemplateParameter )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==45) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3103:2: kw= ',' this_TemplateParameter_2= ruleTemplateParameter
            	    {
            	    kw=(Token)match(input,45,FOLLOW_45_in_ruleTemplateParameterList8995); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getTemplateParameterListAccess().getCommaKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getTemplateParameterListAccess().getTemplateParameterParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_ruleTemplateParameter_in_ruleTemplateParameterList9017);
            	    this_TemplateParameter_2=ruleTemplateParameter();

            	    state._fsp--;


            	    		current.merge(this_TemplateParameter_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop62;
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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3127:1: entryRuleTemplateParameter returns [String current=null] : iv_ruleTemplateParameter= ruleTemplateParameter EOF ;
    public final String entryRuleTemplateParameter() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTemplateParameter = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3128:2: (iv_ruleTemplateParameter= ruleTemplateParameter EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3129:2: iv_ruleTemplateParameter= ruleTemplateParameter EOF
            {
             newCompositeNode(grammarAccess.getTemplateParameterRule()); 
            pushFollow(FOLLOW_ruleTemplateParameter_in_entryRuleTemplateParameter9065);
            iv_ruleTemplateParameter=ruleTemplateParameter();

            state._fsp--;

             current =iv_ruleTemplateParameter.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateParameter9076); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3136:1: ruleTemplateParameter returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TypeParameter_0= ruleTypeParameter | this_ParameterDeclaration_1= ruleParameterDeclaration ) ;
    public final AntlrDatatypeRuleToken ruleTemplateParameter() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_TypeParameter_0 = null;

        AntlrDatatypeRuleToken this_ParameterDeclaration_1 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3139:28: ( (this_TypeParameter_0= ruleTypeParameter | this_ParameterDeclaration_1= ruleParameterDeclaration ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3140:1: (this_TypeParameter_0= ruleTypeParameter | this_ParameterDeclaration_1= ruleParameterDeclaration )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3140:1: (this_TypeParameter_0= ruleTypeParameter | this_ParameterDeclaration_1= ruleParameterDeclaration )
            int alt63=2;
            switch ( input.LA(1) ) {
            case 78:
                {
                alt63=1;
                }
                break;
            case 82:
                {
                int LA63_2 = input.LA(2);

                if ( (LA63_2==58||LA63_2==140) ) {
                    alt63=2;
                }
                else if ( (LA63_2==EOF||LA63_2==RULE_ID||LA63_2==39||LA63_2==45||LA63_2==88||LA63_2==91) ) {
                    alt63=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 63, 2, input);

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
            case 133:
            case 136:
            case 137:
            case 140:
            case 146:
                {
                alt63=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }

            switch (alt63) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3141:5: this_TypeParameter_0= ruleTypeParameter
                    {
                     
                            newCompositeNode(grammarAccess.getTemplateParameterAccess().getTypeParameterParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleTypeParameter_in_ruleTemplateParameter9123);
                    this_TypeParameter_0=ruleTypeParameter();

                    state._fsp--;


                    		current.merge(this_TypeParameter_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3153:5: this_ParameterDeclaration_1= ruleParameterDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getTemplateParameterAccess().getParameterDeclarationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleParameterDeclaration_in_ruleTemplateParameter9156);
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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3171:1: entryRuleTypeParameter returns [String current=null] : iv_ruleTypeParameter= ruleTypeParameter EOF ;
    public final String entryRuleTypeParameter() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeParameter = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3172:2: (iv_ruleTypeParameter= ruleTypeParameter EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3173:2: iv_ruleTypeParameter= ruleTypeParameter EOF
            {
             newCompositeNode(grammarAccess.getTypeParameterRule()); 
            pushFollow(FOLLOW_ruleTypeParameter_in_entryRuleTypeParameter9202);
            iv_ruleTypeParameter=ruleTypeParameter();

            state._fsp--;

             current =iv_ruleTypeParameter.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeParameter9213); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3180:1: ruleTypeParameter returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'class' | kw= 'typename' ) ( ( (kw= '...' )? (this_ID_3= RULE_ID )? ) | ( (this_ID_4= RULE_ID )? kw= '=' this_TypeId_6= ruleTypeId ) ) ) ;
    public final AntlrDatatypeRuleToken ruleTypeParameter() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_3=null;
        Token this_ID_4=null;
        AntlrDatatypeRuleToken this_TypeId_6 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3183:28: ( ( (kw= 'class' | kw= 'typename' ) ( ( (kw= '...' )? (this_ID_3= RULE_ID )? ) | ( (this_ID_4= RULE_ID )? kw= '=' this_TypeId_6= ruleTypeId ) ) ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3184:1: ( (kw= 'class' | kw= 'typename' ) ( ( (kw= '...' )? (this_ID_3= RULE_ID )? ) | ( (this_ID_4= RULE_ID )? kw= '=' this_TypeId_6= ruleTypeId ) ) )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3184:1: ( (kw= 'class' | kw= 'typename' ) ( ( (kw= '...' )? (this_ID_3= RULE_ID )? ) | ( (this_ID_4= RULE_ID )? kw= '=' this_TypeId_6= ruleTypeId ) ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3184:2: (kw= 'class' | kw= 'typename' ) ( ( (kw= '...' )? (this_ID_3= RULE_ID )? ) | ( (this_ID_4= RULE_ID )? kw= '=' this_TypeId_6= ruleTypeId ) )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3184:2: (kw= 'class' | kw= 'typename' )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==78) ) {
                alt64=1;
            }
            else if ( (LA64_0==82) ) {
                alt64=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3185:2: kw= 'class'
                    {
                    kw=(Token)match(input,78,FOLLOW_78_in_ruleTypeParameter9252); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeParameterAccess().getClassKeyword_0_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3192:2: kw= 'typename'
                    {
                    kw=(Token)match(input,82,FOLLOW_82_in_ruleTypeParameter9271); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeParameterAccess().getTypenameKeyword_0_1()); 
                        

                    }
                    break;

            }

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3197:2: ( ( (kw= '...' )? (this_ID_3= RULE_ID )? ) | ( (this_ID_4= RULE_ID )? kw= '=' this_TypeId_6= ruleTypeId ) )
            int alt68=2;
            switch ( input.LA(1) ) {
            case EOF:
            case 45:
            case 88:
            case 91:
                {
                alt68=1;
                }
                break;
            case RULE_ID:
                {
                int LA68_2 = input.LA(2);

                if ( (LA68_2==39) ) {
                    alt68=2;
                }
                else if ( (LA68_2==EOF||LA68_2==45||LA68_2==91) ) {
                    alt68=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 68, 2, input);

                    throw nvae;
                }
                }
                break;
            case 39:
                {
                alt68=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }

            switch (alt68) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3197:3: ( (kw= '...' )? (this_ID_3= RULE_ID )? )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3197:3: ( (kw= '...' )? (this_ID_3= RULE_ID )? )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3197:4: (kw= '...' )? (this_ID_3= RULE_ID )?
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3197:4: (kw= '...' )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==88) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3198:2: kw= '...'
                            {
                            kw=(Token)match(input,88,FOLLOW_88_in_ruleTypeParameter9288); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getTypeParameterAccess().getFullStopFullStopFullStopKeyword_1_0_0()); 
                                

                            }
                            break;

                    }

                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3203:3: (this_ID_3= RULE_ID )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==RULE_ID) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3203:8: this_ID_3= RULE_ID
                            {
                            this_ID_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeParameter9306); 

                            		current.merge(this_ID_3);
                                
                             
                                newLeafNode(this_ID_3, grammarAccess.getTypeParameterAccess().getIDTerminalRuleCall_1_0_1()); 
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3211:6: ( (this_ID_4= RULE_ID )? kw= '=' this_TypeId_6= ruleTypeId )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3211:6: ( (this_ID_4= RULE_ID )? kw= '=' this_TypeId_6= ruleTypeId )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3211:7: (this_ID_4= RULE_ID )? kw= '=' this_TypeId_6= ruleTypeId
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3211:7: (this_ID_4= RULE_ID )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==RULE_ID) ) {
                        alt67=1;
                    }
                    switch (alt67) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3211:12: this_ID_4= RULE_ID
                            {
                            this_ID_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeParameter9337); 

                            		current.merge(this_ID_4);
                                
                             
                                newLeafNode(this_ID_4, grammarAccess.getTypeParameterAccess().getIDTerminalRuleCall_1_1_0()); 
                                

                            }
                            break;

                    }

                    kw=(Token)match(input,39,FOLLOW_39_in_ruleTypeParameter9357); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeParameterAccess().getEqualsSignKeyword_1_1_1()); 
                        
                     
                            newCompositeNode(grammarAccess.getTypeParameterAccess().getTypeIdParserRuleCall_1_1_2()); 
                        
                    pushFollow(FOLLOW_ruleTypeId_in_ruleTypeParameter9379);
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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3243:1: entryRuleSimpleTemplateId returns [String current=null] : iv_ruleSimpleTemplateId= ruleSimpleTemplateId EOF ;
    public final String entryRuleSimpleTemplateId() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSimpleTemplateId = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3244:2: (iv_ruleSimpleTemplateId= ruleSimpleTemplateId EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3245:2: iv_ruleSimpleTemplateId= ruleSimpleTemplateId EOF
            {
             newCompositeNode(grammarAccess.getSimpleTemplateIdRule()); 
            pushFollow(FOLLOW_ruleSimpleTemplateId_in_entryRuleSimpleTemplateId9427);
            iv_ruleSimpleTemplateId=ruleSimpleTemplateId();

            state._fsp--;

             current =iv_ruleSimpleTemplateId.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleTemplateId9438); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3252:1: ruleSimpleTemplateId returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID kw= '<' this_TemplateArgumentList_2= ruleTemplateArgumentList kw= '>' ) ;
    public final AntlrDatatypeRuleToken ruleSimpleTemplateId() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_TemplateArgumentList_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3255:28: ( (this_ID_0= RULE_ID kw= '<' this_TemplateArgumentList_2= ruleTemplateArgumentList kw= '>' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3256:1: (this_ID_0= RULE_ID kw= '<' this_TemplateArgumentList_2= ruleTemplateArgumentList kw= '>' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3256:1: (this_ID_0= RULE_ID kw= '<' this_TemplateArgumentList_2= ruleTemplateArgumentList kw= '>' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3256:6: this_ID_0= RULE_ID kw= '<' this_TemplateArgumentList_2= ruleTemplateArgumentList kw= '>'
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSimpleTemplateId9478); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getSimpleTemplateIdAccess().getIDTerminalRuleCall_0()); 
                
            kw=(Token)match(input,90,FOLLOW_90_in_ruleSimpleTemplateId9496); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getSimpleTemplateIdAccess().getLessThanSignKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getSimpleTemplateIdAccess().getTemplateArgumentListParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleTemplateArgumentList_in_ruleSimpleTemplateId9518);
            this_TemplateArgumentList_2=ruleTemplateArgumentList();

            state._fsp--;


            		current.merge(this_TemplateArgumentList_2);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,91,FOLLOW_91_in_ruleSimpleTemplateId9536); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3296:1: entryRuleTemplateArgumentList returns [String current=null] : iv_ruleTemplateArgumentList= ruleTemplateArgumentList EOF ;
    public final String entryRuleTemplateArgumentList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTemplateArgumentList = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3297:2: (iv_ruleTemplateArgumentList= ruleTemplateArgumentList EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3298:2: iv_ruleTemplateArgumentList= ruleTemplateArgumentList EOF
            {
             newCompositeNode(grammarAccess.getTemplateArgumentListRule()); 
            pushFollow(FOLLOW_ruleTemplateArgumentList_in_entryRuleTemplateArgumentList9579);
            iv_ruleTemplateArgumentList=ruleTemplateArgumentList();

            state._fsp--;

             current =iv_ruleTemplateArgumentList.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateArgumentList9590); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3305:1: ruleTemplateArgumentList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TemplateArgument_0= ruleTemplateArgument (kw= '...' )? (kw= ',' this_TemplateArgument_3= ruleTemplateArgument (kw= '...' )? )* ) ;
    public final AntlrDatatypeRuleToken ruleTemplateArgumentList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_TemplateArgument_0 = null;

        AntlrDatatypeRuleToken this_TemplateArgument_3 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3308:28: ( (this_TemplateArgument_0= ruleTemplateArgument (kw= '...' )? (kw= ',' this_TemplateArgument_3= ruleTemplateArgument (kw= '...' )? )* ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3309:1: (this_TemplateArgument_0= ruleTemplateArgument (kw= '...' )? (kw= ',' this_TemplateArgument_3= ruleTemplateArgument (kw= '...' )? )* )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3309:1: (this_TemplateArgument_0= ruleTemplateArgument (kw= '...' )? (kw= ',' this_TemplateArgument_3= ruleTemplateArgument (kw= '...' )? )* )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3310:5: this_TemplateArgument_0= ruleTemplateArgument (kw= '...' )? (kw= ',' this_TemplateArgument_3= ruleTemplateArgument (kw= '...' )? )*
            {
             
                    newCompositeNode(grammarAccess.getTemplateArgumentListAccess().getTemplateArgumentParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleTemplateArgument_in_ruleTemplateArgumentList9637);
            this_TemplateArgument_0=ruleTemplateArgument();

            state._fsp--;


            		current.merge(this_TemplateArgument_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3320:1: (kw= '...' )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==88) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3321:2: kw= '...'
                    {
                    kw=(Token)match(input,88,FOLLOW_88_in_ruleTemplateArgumentList9656); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTemplateArgumentListAccess().getFullStopFullStopFullStopKeyword_1()); 
                        

                    }
                    break;

            }

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3326:3: (kw= ',' this_TemplateArgument_3= ruleTemplateArgument (kw= '...' )? )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==45) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3327:2: kw= ',' this_TemplateArgument_3= ruleTemplateArgument (kw= '...' )?
            	    {
            	    kw=(Token)match(input,45,FOLLOW_45_in_ruleTemplateArgumentList9672); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getTemplateArgumentListAccess().getCommaKeyword_2_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getTemplateArgumentListAccess().getTemplateArgumentParserRuleCall_2_1()); 
            	        
            	    pushFollow(FOLLOW_ruleTemplateArgument_in_ruleTemplateArgumentList9694);
            	    this_TemplateArgument_3=ruleTemplateArgument();

            	    state._fsp--;


            	    		current.merge(this_TemplateArgument_3);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3343:1: (kw= '...' )?
            	    int alt70=2;
            	    int LA70_0 = input.LA(1);

            	    if ( (LA70_0==88) ) {
            	        alt70=1;
            	    }
            	    switch (alt70) {
            	        case 1 :
            	            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3344:2: kw= '...'
            	            {
            	            kw=(Token)match(input,88,FOLLOW_88_in_ruleTemplateArgumentList9713); 

            	                    current.merge(kw);
            	                    newLeafNode(kw, grammarAccess.getTemplateArgumentListAccess().getFullStopFullStopFullStopKeyword_2_2()); 
            	                

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop71;
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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3357:1: entryRuleTemplateArgument returns [String current=null] : iv_ruleTemplateArgument= ruleTemplateArgument EOF ;
    public final String entryRuleTemplateArgument() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTemplateArgument = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3358:2: (iv_ruleTemplateArgument= ruleTemplateArgument EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3359:2: iv_ruleTemplateArgument= ruleTemplateArgument EOF
            {
             newCompositeNode(grammarAccess.getTemplateArgumentRule()); 
            pushFollow(FOLLOW_ruleTemplateArgument_in_entryRuleTemplateArgument9758);
            iv_ruleTemplateArgument=ruleTemplateArgument();

            state._fsp--;

             current =iv_ruleTemplateArgument.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateArgument9769); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3366:1: ruleTemplateArgument returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ConstantExpression_0= ruleConstantExpression | this_TypeId_1= ruleTypeId | this_IdExpression_2= ruleIdExpression ) ;
    public final AntlrDatatypeRuleToken ruleTemplateArgument() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_ConstantExpression_0 = null;

        AntlrDatatypeRuleToken this_TypeId_1 = null;

        AntlrDatatypeRuleToken this_IdExpression_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3369:28: ( (this_ConstantExpression_0= ruleConstantExpression | this_TypeId_1= ruleTypeId | this_IdExpression_2= ruleIdExpression ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3370:1: (this_ConstantExpression_0= ruleConstantExpression | this_TypeId_1= ruleTypeId | this_IdExpression_2= ruleIdExpression )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3370:1: (this_ConstantExpression_0= ruleConstantExpression | this_TypeId_1= ruleTypeId | this_IdExpression_2= ruleIdExpression )
            int alt72=3;
            switch ( input.LA(1) ) {
            case 138:
                {
                alt72=1;
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
            case 82:
            case 133:
            case 136:
            case 137:
            case 140:
            case 146:
                {
                alt72=2;
                }
                break;
            case 139:
                {
                alt72=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }

            switch (alt72) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3371:5: this_ConstantExpression_0= ruleConstantExpression
                    {
                     
                            newCompositeNode(grammarAccess.getTemplateArgumentAccess().getConstantExpressionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleConstantExpression_in_ruleTemplateArgument9816);
                    this_ConstantExpression_0=ruleConstantExpression();

                    state._fsp--;


                    		current.merge(this_ConstantExpression_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3383:5: this_TypeId_1= ruleTypeId
                    {
                     
                            newCompositeNode(grammarAccess.getTemplateArgumentAccess().getTypeIdParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleTypeId_in_ruleTemplateArgument9849);
                    this_TypeId_1=ruleTypeId();

                    state._fsp--;


                    		current.merge(this_TypeId_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3395:5: this_IdExpression_2= ruleIdExpression
                    {
                     
                            newCompositeNode(grammarAccess.getTemplateArgumentAccess().getIdExpressionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleIdExpression_in_ruleTemplateArgument9882);
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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3413:1: entryRuleTypenameSpecifier returns [String current=null] : iv_ruleTypenameSpecifier= ruleTypenameSpecifier EOF ;
    public final String entryRuleTypenameSpecifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypenameSpecifier = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3414:2: (iv_ruleTypenameSpecifier= ruleTypenameSpecifier EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3415:2: iv_ruleTypenameSpecifier= ruleTypenameSpecifier EOF
            {
             newCompositeNode(grammarAccess.getTypenameSpecifierRule()); 
            pushFollow(FOLLOW_ruleTypenameSpecifier_in_entryRuleTypenameSpecifier9928);
            iv_ruleTypenameSpecifier=ruleTypenameSpecifier();

            state._fsp--;

             current =iv_ruleTypenameSpecifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypenameSpecifier9939); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3422:1: ruleTypenameSpecifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'typename' (kw= '::' )? this_NestedNameSpecifier_2= ruleNestedNameSpecifier (this_ID_3= RULE_ID | ( (kw= 'template' )? this_ID_5= RULE_ID kw= '<' this_TemplateArgumentList_7= ruleTemplateArgumentList kw= '>' ) ) ) ;
    public final AntlrDatatypeRuleToken ruleTypenameSpecifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_3=null;
        Token this_ID_5=null;
        AntlrDatatypeRuleToken this_NestedNameSpecifier_2 = null;

        AntlrDatatypeRuleToken this_TemplateArgumentList_7 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3425:28: ( (kw= 'typename' (kw= '::' )? this_NestedNameSpecifier_2= ruleNestedNameSpecifier (this_ID_3= RULE_ID | ( (kw= 'template' )? this_ID_5= RULE_ID kw= '<' this_TemplateArgumentList_7= ruleTemplateArgumentList kw= '>' ) ) ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3426:1: (kw= 'typename' (kw= '::' )? this_NestedNameSpecifier_2= ruleNestedNameSpecifier (this_ID_3= RULE_ID | ( (kw= 'template' )? this_ID_5= RULE_ID kw= '<' this_TemplateArgumentList_7= ruleTemplateArgumentList kw= '>' ) ) )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3426:1: (kw= 'typename' (kw= '::' )? this_NestedNameSpecifier_2= ruleNestedNameSpecifier (this_ID_3= RULE_ID | ( (kw= 'template' )? this_ID_5= RULE_ID kw= '<' this_TemplateArgumentList_7= ruleTemplateArgumentList kw= '>' ) ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3427:2: kw= 'typename' (kw= '::' )? this_NestedNameSpecifier_2= ruleNestedNameSpecifier (this_ID_3= RULE_ID | ( (kw= 'template' )? this_ID_5= RULE_ID kw= '<' this_TemplateArgumentList_7= ruleTemplateArgumentList kw= '>' ) )
            {
            kw=(Token)match(input,82,FOLLOW_82_in_ruleTypenameSpecifier9977); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getTypenameSpecifierAccess().getTypenameKeyword_0()); 
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3432:1: (kw= '::' )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==58) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3433:2: kw= '::'
                    {
                    kw=(Token)match(input,58,FOLLOW_58_in_ruleTypenameSpecifier9991); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypenameSpecifierAccess().getColonColonKeyword_1()); 
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getTypenameSpecifierAccess().getNestedNameSpecifierParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleNestedNameSpecifier_in_ruleTypenameSpecifier10015);
            this_NestedNameSpecifier_2=ruleNestedNameSpecifier();

            state._fsp--;


            		current.merge(this_NestedNameSpecifier_2);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3449:1: (this_ID_3= RULE_ID | ( (kw= 'template' )? this_ID_5= RULE_ID kw= '<' this_TemplateArgumentList_7= ruleTemplateArgumentList kw= '>' ) )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==RULE_ID) ) {
                int LA75_1 = input.LA(2);

                if ( (LA75_1==EOF||LA75_1==RULE_ID||LA75_1==40||(LA75_1>=45 && LA75_1<=58)||(LA75_1>=60 && LA75_1<=75)||LA75_1==77||LA75_1==82||LA75_1==88||LA75_1==91||LA75_1==133||(LA75_1>=136 && LA75_1<=140)||LA75_1==146) ) {
                    alt75=1;
                }
                else if ( (LA75_1==90) ) {
                    alt75=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 75, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA75_0==59) ) {
                alt75=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3449:6: this_ID_3= RULE_ID
                    {
                    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypenameSpecifier10036); 

                    		current.merge(this_ID_3);
                        
                     
                        newLeafNode(this_ID_3, grammarAccess.getTypenameSpecifierAccess().getIDTerminalRuleCall_3_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3457:6: ( (kw= 'template' )? this_ID_5= RULE_ID kw= '<' this_TemplateArgumentList_7= ruleTemplateArgumentList kw= '>' )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3457:6: ( (kw= 'template' )? this_ID_5= RULE_ID kw= '<' this_TemplateArgumentList_7= ruleTemplateArgumentList kw= '>' )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3457:7: (kw= 'template' )? this_ID_5= RULE_ID kw= '<' this_TemplateArgumentList_7= ruleTemplateArgumentList kw= '>'
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3457:7: (kw= 'template' )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==59) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3458:2: kw= 'template'
                            {
                            kw=(Token)match(input,59,FOLLOW_59_in_ruleTypenameSpecifier10062); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getTypenameSpecifierAccess().getTemplateKeyword_3_1_0()); 
                                

                            }
                            break;

                    }

                    this_ID_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypenameSpecifier10079); 

                    		current.merge(this_ID_5);
                        
                     
                        newLeafNode(this_ID_5, grammarAccess.getTypenameSpecifierAccess().getIDTerminalRuleCall_3_1_1()); 
                        
                    kw=(Token)match(input,90,FOLLOW_90_in_ruleTypenameSpecifier10097); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypenameSpecifierAccess().getLessThanSignKeyword_3_1_2()); 
                        
                     
                            newCompositeNode(grammarAccess.getTypenameSpecifierAccess().getTemplateArgumentListParserRuleCall_3_1_3()); 
                        
                    pushFollow(FOLLOW_ruleTemplateArgumentList_in_ruleTypenameSpecifier10119);
                    this_TemplateArgumentList_7=ruleTemplateArgumentList();

                    state._fsp--;


                    		current.merge(this_TemplateArgumentList_7);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,91,FOLLOW_91_in_ruleTypenameSpecifier10137); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3503:1: entryRuleFunctionTryBlock returns [String current=null] : iv_ruleFunctionTryBlock= ruleFunctionTryBlock EOF ;
    public final String entryRuleFunctionTryBlock() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunctionTryBlock = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3504:2: (iv_ruleFunctionTryBlock= ruleFunctionTryBlock EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3505:2: iv_ruleFunctionTryBlock= ruleFunctionTryBlock EOF
            {
             newCompositeNode(grammarAccess.getFunctionTryBlockRule()); 
            pushFollow(FOLLOW_ruleFunctionTryBlock_in_entryRuleFunctionTryBlock10182);
            iv_ruleFunctionTryBlock=ruleFunctionTryBlock();

            state._fsp--;

             current =iv_ruleFunctionTryBlock.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionTryBlock10193); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3512:1: ruleFunctionTryBlock returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'try' (this_CtorInitializer_1= ruleCtorInitializer )? this_CompoundStatement_2= ruleCompoundStatement (this_Handler_3= ruleHandler )+ ) ;
    public final AntlrDatatypeRuleToken ruleFunctionTryBlock() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_CtorInitializer_1 = null;

        AntlrDatatypeRuleToken this_CompoundStatement_2 = null;

        AntlrDatatypeRuleToken this_Handler_3 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3515:28: ( (kw= 'try' (this_CtorInitializer_1= ruleCtorInitializer )? this_CompoundStatement_2= ruleCompoundStatement (this_Handler_3= ruleHandler )+ ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3516:1: (kw= 'try' (this_CtorInitializer_1= ruleCtorInitializer )? this_CompoundStatement_2= ruleCompoundStatement (this_Handler_3= ruleHandler )+ )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3516:1: (kw= 'try' (this_CtorInitializer_1= ruleCtorInitializer )? this_CompoundStatement_2= ruleCompoundStatement (this_Handler_3= ruleHandler )+ )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3517:2: kw= 'try' (this_CtorInitializer_1= ruleCtorInitializer )? this_CompoundStatement_2= ruleCompoundStatement (this_Handler_3= ruleHandler )+
            {
            kw=(Token)match(input,128,FOLLOW_128_in_ruleFunctionTryBlock10231); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getFunctionTryBlockAccess().getTryKeyword_0()); 
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3522:1: (this_CtorInitializer_1= ruleCtorInitializer )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==143) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3523:5: this_CtorInitializer_1= ruleCtorInitializer
                    {
                     
                            newCompositeNode(grammarAccess.getFunctionTryBlockAccess().getCtorInitializerParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleCtorInitializer_in_ruleFunctionTryBlock10254);
                    this_CtorInitializer_1=ruleCtorInitializer();

                    state._fsp--;


                    		current.merge(this_CtorInitializer_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getFunctionTryBlockAccess().getCompoundStatementParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleCompoundStatement_in_ruleFunctionTryBlock10283);
            this_CompoundStatement_2=ruleCompoundStatement();

            state._fsp--;


            		current.merge(this_CompoundStatement_2);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3544:1: (this_Handler_3= ruleHandler )+
            int cnt77=0;
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==129) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3545:5: this_Handler_3= ruleHandler
            	    {
            	     
            	            newCompositeNode(grammarAccess.getFunctionTryBlockAccess().getHandlerParserRuleCall_3()); 
            	        
            	    pushFollow(FOLLOW_ruleHandler_in_ruleFunctionTryBlock10311);
            	    this_Handler_3=ruleHandler();

            	    state._fsp--;


            	    		current.merge(this_Handler_3);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt77 >= 1 ) break loop77;
                        EarlyExitException eee =
                            new EarlyExitException(77, input);
                        throw eee;
                }
                cnt77++;
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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3563:1: entryRuleHandler returns [String current=null] : iv_ruleHandler= ruleHandler EOF ;
    public final String entryRuleHandler() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleHandler = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3564:2: (iv_ruleHandler= ruleHandler EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3565:2: iv_ruleHandler= ruleHandler EOF
            {
             newCompositeNode(grammarAccess.getHandlerRule()); 
            pushFollow(FOLLOW_ruleHandler_in_entryRuleHandler10359);
            iv_ruleHandler=ruleHandler();

            state._fsp--;

             current =iv_ruleHandler.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHandler10370); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3572:1: ruleHandler returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'catch' kw= '(' this_ExceptionDeclaration_2= ruleExceptionDeclaration kw= ')' this_CompoundStatement_4= ruleCompoundStatement ) ;
    public final AntlrDatatypeRuleToken ruleHandler() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ExceptionDeclaration_2 = null;

        AntlrDatatypeRuleToken this_CompoundStatement_4 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3575:28: ( (kw= 'catch' kw= '(' this_ExceptionDeclaration_2= ruleExceptionDeclaration kw= ')' this_CompoundStatement_4= ruleCompoundStatement ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3576:1: (kw= 'catch' kw= '(' this_ExceptionDeclaration_2= ruleExceptionDeclaration kw= ')' this_CompoundStatement_4= ruleCompoundStatement )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3576:1: (kw= 'catch' kw= '(' this_ExceptionDeclaration_2= ruleExceptionDeclaration kw= ')' this_CompoundStatement_4= ruleCompoundStatement )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3577:2: kw= 'catch' kw= '(' this_ExceptionDeclaration_2= ruleExceptionDeclaration kw= ')' this_CompoundStatement_4= ruleCompoundStatement
            {
            kw=(Token)match(input,129,FOLLOW_129_in_ruleHandler10408); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getHandlerAccess().getCatchKeyword_0()); 
                
            kw=(Token)match(input,44,FOLLOW_44_in_ruleHandler10421); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getHandlerAccess().getLeftParenthesisKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getHandlerAccess().getExceptionDeclarationParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleExceptionDeclaration_in_ruleHandler10443);
            this_ExceptionDeclaration_2=ruleExceptionDeclaration();

            state._fsp--;


            		current.merge(this_ExceptionDeclaration_2);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,46,FOLLOW_46_in_ruleHandler10461); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getHandlerAccess().getRightParenthesisKeyword_3()); 
                
             
                    newCompositeNode(grammarAccess.getHandlerAccess().getCompoundStatementParserRuleCall_4()); 
                
            pushFollow(FOLLOW_ruleCompoundStatement_in_ruleHandler10483);
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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3624:1: entryRuleExceptionDeclaration returns [String current=null] : iv_ruleExceptionDeclaration= ruleExceptionDeclaration EOF ;
    public final String entryRuleExceptionDeclaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExceptionDeclaration = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3625:2: (iv_ruleExceptionDeclaration= ruleExceptionDeclaration EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3626:2: iv_ruleExceptionDeclaration= ruleExceptionDeclaration EOF
            {
             newCompositeNode(grammarAccess.getExceptionDeclarationRule()); 
            pushFollow(FOLLOW_ruleExceptionDeclaration_in_entryRuleExceptionDeclaration10529);
            iv_ruleExceptionDeclaration=ruleExceptionDeclaration();

            state._fsp--;

             current =iv_ruleExceptionDeclaration.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExceptionDeclaration10540); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3633:1: ruleExceptionDeclaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_TypeSpecifier_0= ruleTypeSpecifier )+ (this_DeclaratorId_1= ruleDeclaratorId )? ) | kw= '...' ) ;
    public final AntlrDatatypeRuleToken ruleExceptionDeclaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_TypeSpecifier_0 = null;

        AntlrDatatypeRuleToken this_DeclaratorId_1 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3636:28: ( ( ( (this_TypeSpecifier_0= ruleTypeSpecifier )+ (this_DeclaratorId_1= ruleDeclaratorId )? ) | kw= '...' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3637:1: ( ( (this_TypeSpecifier_0= ruleTypeSpecifier )+ (this_DeclaratorId_1= ruleDeclaratorId )? ) | kw= '...' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3637:1: ( ( (this_TypeSpecifier_0= ruleTypeSpecifier )+ (this_DeclaratorId_1= ruleDeclaratorId )? ) | kw= '...' )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==RULE_ID||LA80_0==58||(LA80_0>=60 && LA80_0<=74)||LA80_0==77||LA80_0==82||LA80_0==133||(LA80_0>=136 && LA80_0<=137)||LA80_0==140||LA80_0==146) ) {
                alt80=1;
            }
            else if ( (LA80_0==88) ) {
                alt80=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }
            switch (alt80) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3637:2: ( (this_TypeSpecifier_0= ruleTypeSpecifier )+ (this_DeclaratorId_1= ruleDeclaratorId )? )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3637:2: ( (this_TypeSpecifier_0= ruleTypeSpecifier )+ (this_DeclaratorId_1= ruleDeclaratorId )? )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3637:3: (this_TypeSpecifier_0= ruleTypeSpecifier )+ (this_DeclaratorId_1= ruleDeclaratorId )?
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3637:3: (this_TypeSpecifier_0= ruleTypeSpecifier )+
                    int cnt78=0;
                    loop78:
                    do {
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( (LA78_0==RULE_ID||LA78_0==58||(LA78_0>=60 && LA78_0<=74)||LA78_0==77||LA78_0==82||LA78_0==133||(LA78_0>=136 && LA78_0<=137)||LA78_0==140||LA78_0==146) ) {
                            alt78=1;
                        }


                        switch (alt78) {
                    	case 1 :
                    	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3638:5: this_TypeSpecifier_0= ruleTypeSpecifier
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getExceptionDeclarationAccess().getTypeSpecifierParserRuleCall_0_0()); 
                    	        
                    	    pushFollow(FOLLOW_ruleTypeSpecifier_in_ruleExceptionDeclaration10589);
                    	    this_TypeSpecifier_0=ruleTypeSpecifier();

                    	    state._fsp--;


                    	    		current.merge(this_TypeSpecifier_0);
                    	        
                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt78 >= 1 ) break loop78;
                                EarlyExitException eee =
                                    new EarlyExitException(78, input);
                                throw eee;
                        }
                        cnt78++;
                    } while (true);

                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3648:3: (this_DeclaratorId_1= ruleDeclaratorId )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==88||LA79_0==139) ) {
                        alt79=1;
                    }
                    switch (alt79) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3649:5: this_DeclaratorId_1= ruleDeclaratorId
                            {
                             
                                    newCompositeNode(grammarAccess.getExceptionDeclarationAccess().getDeclaratorIdParserRuleCall_0_1()); 
                                
                            pushFollow(FOLLOW_ruleDeclaratorId_in_ruleExceptionDeclaration10619);
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
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3661:2: kw= '...'
                    {
                    kw=(Token)match(input,88,FOLLOW_88_in_ruleExceptionDeclaration10646); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3676:1: entryRuleExceptionSpecification returns [String current=null] : iv_ruleExceptionSpecification= ruleExceptionSpecification EOF ;
    public final String entryRuleExceptionSpecification() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExceptionSpecification = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3677:2: (iv_ruleExceptionSpecification= ruleExceptionSpecification EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3678:2: iv_ruleExceptionSpecification= ruleExceptionSpecification EOF
            {
             newCompositeNode(grammarAccess.getExceptionSpecificationRule()); 
            pushFollow(FOLLOW_ruleExceptionSpecification_in_entryRuleExceptionSpecification10689);
            iv_ruleExceptionSpecification=ruleExceptionSpecification();

            state._fsp--;

             current =iv_ruleExceptionSpecification.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExceptionSpecification10700); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3685:1: ruleExceptionSpecification returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DynamicExceptionSpecification_0= ruleDynamicExceptionSpecification | this_NoexceptSpecification_1= ruleNoexceptSpecification ) ;
    public final AntlrDatatypeRuleToken ruleExceptionSpecification() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_DynamicExceptionSpecification_0 = null;

        AntlrDatatypeRuleToken this_NoexceptSpecification_1 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3688:28: ( (this_DynamicExceptionSpecification_0= ruleDynamicExceptionSpecification | this_NoexceptSpecification_1= ruleNoexceptSpecification ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3689:1: (this_DynamicExceptionSpecification_0= ruleDynamicExceptionSpecification | this_NoexceptSpecification_1= ruleNoexceptSpecification )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3689:1: (this_DynamicExceptionSpecification_0= ruleDynamicExceptionSpecification | this_NoexceptSpecification_1= ruleNoexceptSpecification )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==130) ) {
                alt81=1;
            }
            else if ( (LA81_0==131) ) {
                alt81=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3690:5: this_DynamicExceptionSpecification_0= ruleDynamicExceptionSpecification
                    {
                     
                            newCompositeNode(grammarAccess.getExceptionSpecificationAccess().getDynamicExceptionSpecificationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDynamicExceptionSpecification_in_ruleExceptionSpecification10747);
                    this_DynamicExceptionSpecification_0=ruleDynamicExceptionSpecification();

                    state._fsp--;


                    		current.merge(this_DynamicExceptionSpecification_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3702:5: this_NoexceptSpecification_1= ruleNoexceptSpecification
                    {
                     
                            newCompositeNode(grammarAccess.getExceptionSpecificationAccess().getNoexceptSpecificationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNoexceptSpecification_in_ruleExceptionSpecification10780);
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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3720:1: entryRuleDynamicExceptionSpecification returns [String current=null] : iv_ruleDynamicExceptionSpecification= ruleDynamicExceptionSpecification EOF ;
    public final String entryRuleDynamicExceptionSpecification() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDynamicExceptionSpecification = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3721:2: (iv_ruleDynamicExceptionSpecification= ruleDynamicExceptionSpecification EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3722:2: iv_ruleDynamicExceptionSpecification= ruleDynamicExceptionSpecification EOF
            {
             newCompositeNode(grammarAccess.getDynamicExceptionSpecificationRule()); 
            pushFollow(FOLLOW_ruleDynamicExceptionSpecification_in_entryRuleDynamicExceptionSpecification10826);
            iv_ruleDynamicExceptionSpecification=ruleDynamicExceptionSpecification();

            state._fsp--;

             current =iv_ruleDynamicExceptionSpecification.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDynamicExceptionSpecification10837); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3729:1: ruleDynamicExceptionSpecification returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'throw' kw= '(' this_TypeIdList_2= ruleTypeIdList kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleDynamicExceptionSpecification() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_TypeIdList_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3732:28: ( (kw= 'throw' kw= '(' this_TypeIdList_2= ruleTypeIdList kw= ')' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3733:1: (kw= 'throw' kw= '(' this_TypeIdList_2= ruleTypeIdList kw= ')' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3733:1: (kw= 'throw' kw= '(' this_TypeIdList_2= ruleTypeIdList kw= ')' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3734:2: kw= 'throw' kw= '(' this_TypeIdList_2= ruleTypeIdList kw= ')'
            {
            kw=(Token)match(input,130,FOLLOW_130_in_ruleDynamicExceptionSpecification10875); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDynamicExceptionSpecificationAccess().getThrowKeyword_0()); 
                
            kw=(Token)match(input,44,FOLLOW_44_in_ruleDynamicExceptionSpecification10888); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDynamicExceptionSpecificationAccess().getLeftParenthesisKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getDynamicExceptionSpecificationAccess().getTypeIdListParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleTypeIdList_in_ruleDynamicExceptionSpecification10910);
            this_TypeIdList_2=ruleTypeIdList();

            state._fsp--;


            		current.merge(this_TypeIdList_2);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,46,FOLLOW_46_in_ruleDynamicExceptionSpecification10928); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3770:1: entryRuleNoexceptSpecification returns [String current=null] : iv_ruleNoexceptSpecification= ruleNoexceptSpecification EOF ;
    public final String entryRuleNoexceptSpecification() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNoexceptSpecification = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3771:2: (iv_ruleNoexceptSpecification= ruleNoexceptSpecification EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3772:2: iv_ruleNoexceptSpecification= ruleNoexceptSpecification EOF
            {
             newCompositeNode(grammarAccess.getNoexceptSpecificationRule()); 
            pushFollow(FOLLOW_ruleNoexceptSpecification_in_entryRuleNoexceptSpecification10969);
            iv_ruleNoexceptSpecification=ruleNoexceptSpecification();

            state._fsp--;

             current =iv_ruleNoexceptSpecification.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoexceptSpecification10980); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3779:1: ruleNoexceptSpecification returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'noexcept' (kw= '(' this_ConstantExpression_2= ruleConstantExpression kw= ')' )? ) ;
    public final AntlrDatatypeRuleToken ruleNoexceptSpecification() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ConstantExpression_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3782:28: ( (kw= 'noexcept' (kw= '(' this_ConstantExpression_2= ruleConstantExpression kw= ')' )? ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3783:1: (kw= 'noexcept' (kw= '(' this_ConstantExpression_2= ruleConstantExpression kw= ')' )? )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3783:1: (kw= 'noexcept' (kw= '(' this_ConstantExpression_2= ruleConstantExpression kw= ')' )? )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3784:2: kw= 'noexcept' (kw= '(' this_ConstantExpression_2= ruleConstantExpression kw= ')' )?
            {
            kw=(Token)match(input,131,FOLLOW_131_in_ruleNoexceptSpecification11018); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getNoexceptSpecificationAccess().getNoexceptKeyword_0()); 
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3789:1: (kw= '(' this_ConstantExpression_2= ruleConstantExpression kw= ')' )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==44) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3790:2: kw= '(' this_ConstantExpression_2= ruleConstantExpression kw= ')'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleNoexceptSpecification11032); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNoexceptSpecificationAccess().getLeftParenthesisKeyword_1_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getNoexceptSpecificationAccess().getConstantExpressionParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleConstantExpression_in_ruleNoexceptSpecification11054);
                    this_ConstantExpression_2=ruleConstantExpression();

                    state._fsp--;


                    		current.merge(this_ConstantExpression_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleNoexceptSpecification11072); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3820:1: entryRuleExpression returns [String current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final String entryRuleExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpression = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3821:2: (iv_ruleExpression= ruleExpression EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3822:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression11115);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression11126); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3829:1: ruleExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Expression' ;
    public final AntlrDatatypeRuleToken ruleExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3832:28: (kw= 'Expression' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3834:2: kw= 'Expression'
            {
            kw=(Token)match(input,132,FOLLOW_132_in_ruleExpression11163); 

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


    // $ANTLR start "entryRuleClassKey"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3847:1: entryRuleClassKey returns [String current=null] : iv_ruleClassKey= ruleClassKey EOF ;
    public final String entryRuleClassKey() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleClassKey = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3848:2: (iv_ruleClassKey= ruleClassKey EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3849:2: iv_ruleClassKey= ruleClassKey EOF
            {
             newCompositeNode(grammarAccess.getClassKeyRule()); 
            pushFollow(FOLLOW_ruleClassKey_in_entryRuleClassKey11203);
            iv_ruleClassKey=ruleClassKey();

            state._fsp--;

             current =iv_ruleClassKey.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassKey11214); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3856:1: ruleClassKey returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'ClassKey' ;
    public final AntlrDatatypeRuleToken ruleClassKey() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3859:28: (kw= 'ClassKey' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3861:2: kw= 'ClassKey'
            {
            kw=(Token)match(input,133,FOLLOW_133_in_ruleClassKey11251); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getClassKeyAccess().getClassKeyKeyword()); 
                

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


    // $ANTLR start "entryRuleExplicitSpecialization"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3874:1: entryRuleExplicitSpecialization returns [String current=null] : iv_ruleExplicitSpecialization= ruleExplicitSpecialization EOF ;
    public final String entryRuleExplicitSpecialization() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExplicitSpecialization = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3875:2: (iv_ruleExplicitSpecialization= ruleExplicitSpecialization EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3876:2: iv_ruleExplicitSpecialization= ruleExplicitSpecialization EOF
            {
             newCompositeNode(grammarAccess.getExplicitSpecializationRule()); 
            pushFollow(FOLLOW_ruleExplicitSpecialization_in_entryRuleExplicitSpecialization11291);
            iv_ruleExplicitSpecialization=ruleExplicitSpecialization();

            state._fsp--;

             current =iv_ruleExplicitSpecialization.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExplicitSpecialization11302); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3883:1: ruleExplicitSpecialization returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'ExplicitSpecialization' ;
    public final AntlrDatatypeRuleToken ruleExplicitSpecialization() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3886:28: (kw= 'ExplicitSpecialization' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3888:2: kw= 'ExplicitSpecialization'
            {
            kw=(Token)match(input,134,FOLLOW_134_in_ruleExplicitSpecialization11339); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3901:1: entryRuleExplicitInstantiation returns [String current=null] : iv_ruleExplicitInstantiation= ruleExplicitInstantiation EOF ;
    public final String entryRuleExplicitInstantiation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExplicitInstantiation = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3902:2: (iv_ruleExplicitInstantiation= ruleExplicitInstantiation EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3903:2: iv_ruleExplicitInstantiation= ruleExplicitInstantiation EOF
            {
             newCompositeNode(grammarAccess.getExplicitInstantiationRule()); 
            pushFollow(FOLLOW_ruleExplicitInstantiation_in_entryRuleExplicitInstantiation11379);
            iv_ruleExplicitInstantiation=ruleExplicitInstantiation();

            state._fsp--;

             current =iv_ruleExplicitInstantiation.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExplicitInstantiation11390); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3910:1: ruleExplicitInstantiation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'ExplicitInstantiation' ;
    public final AntlrDatatypeRuleToken ruleExplicitInstantiation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3913:28: (kw= 'ExplicitInstantiation' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3915:2: kw= 'ExplicitInstantiation'
            {
            kw=(Token)match(input,135,FOLLOW_135_in_ruleExplicitInstantiation11427); 

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


    // $ANTLR start "entryRuleClassSpecifier"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3928:1: entryRuleClassSpecifier returns [String current=null] : iv_ruleClassSpecifier= ruleClassSpecifier EOF ;
    public final String entryRuleClassSpecifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleClassSpecifier = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3929:2: (iv_ruleClassSpecifier= ruleClassSpecifier EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3930:2: iv_ruleClassSpecifier= ruleClassSpecifier EOF
            {
             newCompositeNode(grammarAccess.getClassSpecifierRule()); 
            pushFollow(FOLLOW_ruleClassSpecifier_in_entryRuleClassSpecifier11467);
            iv_ruleClassSpecifier=ruleClassSpecifier();

            state._fsp--;

             current =iv_ruleClassSpecifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassSpecifier11478); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3937:1: ruleClassSpecifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'ClassSpecifier' ;
    public final AntlrDatatypeRuleToken ruleClassSpecifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3940:28: (kw= 'ClassSpecifier' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3942:2: kw= 'ClassSpecifier'
            {
            kw=(Token)match(input,136,FOLLOW_136_in_ruleClassSpecifier11515); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getClassSpecifierAccess().getClassSpecifierKeyword()); 
                

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


    // $ANTLR start "entryRuleCvQualifier"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3955:1: entryRuleCvQualifier returns [String current=null] : iv_ruleCvQualifier= ruleCvQualifier EOF ;
    public final String entryRuleCvQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCvQualifier = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3956:2: (iv_ruleCvQualifier= ruleCvQualifier EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3957:2: iv_ruleCvQualifier= ruleCvQualifier EOF
            {
             newCompositeNode(grammarAccess.getCvQualifierRule()); 
            pushFollow(FOLLOW_ruleCvQualifier_in_entryRuleCvQualifier11555);
            iv_ruleCvQualifier=ruleCvQualifier();

            state._fsp--;

             current =iv_ruleCvQualifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCvQualifier11566); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3964:1: ruleCvQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'CvQualifier' ;
    public final AntlrDatatypeRuleToken ruleCvQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3967:28: (kw= 'CvQualifier' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3969:2: kw= 'CvQualifier'
            {
            kw=(Token)match(input,137,FOLLOW_137_in_ruleCvQualifier11603); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3982:1: entryRuleConstantExpression returns [String current=null] : iv_ruleConstantExpression= ruleConstantExpression EOF ;
    public final String entryRuleConstantExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConstantExpression = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3983:2: (iv_ruleConstantExpression= ruleConstantExpression EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3984:2: iv_ruleConstantExpression= ruleConstantExpression EOF
            {
             newCompositeNode(grammarAccess.getConstantExpressionRule()); 
            pushFollow(FOLLOW_ruleConstantExpression_in_entryRuleConstantExpression11643);
            iv_ruleConstantExpression=ruleConstantExpression();

            state._fsp--;

             current =iv_ruleConstantExpression.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantExpression11654); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3991:1: ruleConstantExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'ConstantExpression' ;
    public final AntlrDatatypeRuleToken ruleConstantExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3994:28: (kw= 'ConstantExpression' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3996:2: kw= 'ConstantExpression'
            {
            kw=(Token)match(input,138,FOLLOW_138_in_ruleConstantExpression11691); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4009:1: entryRuleIdExpression returns [String current=null] : iv_ruleIdExpression= ruleIdExpression EOF ;
    public final String entryRuleIdExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdExpression = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4010:2: (iv_ruleIdExpression= ruleIdExpression EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4011:2: iv_ruleIdExpression= ruleIdExpression EOF
            {
             newCompositeNode(grammarAccess.getIdExpressionRule()); 
            pushFollow(FOLLOW_ruleIdExpression_in_entryRuleIdExpression11731);
            iv_ruleIdExpression=ruleIdExpression();

            state._fsp--;

             current =iv_ruleIdExpression.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdExpression11742); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4018:1: ruleIdExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'IdExpression' ;
    public final AntlrDatatypeRuleToken ruleIdExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4021:28: (kw= 'IdExpression' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4023:2: kw= 'IdExpression'
            {
            kw=(Token)match(input,139,FOLLOW_139_in_ruleIdExpression11779); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4036:1: entryRuleNestedNameSpecifier returns [String current=null] : iv_ruleNestedNameSpecifier= ruleNestedNameSpecifier EOF ;
    public final String entryRuleNestedNameSpecifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNestedNameSpecifier = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4037:2: (iv_ruleNestedNameSpecifier= ruleNestedNameSpecifier EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4038:2: iv_ruleNestedNameSpecifier= ruleNestedNameSpecifier EOF
            {
             newCompositeNode(grammarAccess.getNestedNameSpecifierRule()); 
            pushFollow(FOLLOW_ruleNestedNameSpecifier_in_entryRuleNestedNameSpecifier11819);
            iv_ruleNestedNameSpecifier=ruleNestedNameSpecifier();

            state._fsp--;

             current =iv_ruleNestedNameSpecifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNestedNameSpecifier11830); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4045:1: ruleNestedNameSpecifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'NestedNameSpecifier' ;
    public final AntlrDatatypeRuleToken ruleNestedNameSpecifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4048:28: (kw= 'NestedNameSpecifier' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4050:2: kw= 'NestedNameSpecifier'
            {
            kw=(Token)match(input,140,FOLLOW_140_in_ruleNestedNameSpecifier11867); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4063:1: entryRuleAssignmentExpression returns [String current=null] : iv_ruleAssignmentExpression= ruleAssignmentExpression EOF ;
    public final String entryRuleAssignmentExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAssignmentExpression = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4064:2: (iv_ruleAssignmentExpression= ruleAssignmentExpression EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4065:2: iv_ruleAssignmentExpression= ruleAssignmentExpression EOF
            {
             newCompositeNode(grammarAccess.getAssignmentExpressionRule()); 
            pushFollow(FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression11907);
            iv_ruleAssignmentExpression=ruleAssignmentExpression();

            state._fsp--;

             current =iv_ruleAssignmentExpression.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignmentExpression11918); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4072:1: ruleAssignmentExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'AssignmentExpression' ;
    public final AntlrDatatypeRuleToken ruleAssignmentExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4075:28: (kw= 'AssignmentExpression' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4077:2: kw= 'AssignmentExpression'
            {
            kw=(Token)match(input,141,FOLLOW_141_in_ruleAssignmentExpression11955); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4090:1: entryRuleCompoundStatement returns [String current=null] : iv_ruleCompoundStatement= ruleCompoundStatement EOF ;
    public final String entryRuleCompoundStatement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCompoundStatement = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4091:2: (iv_ruleCompoundStatement= ruleCompoundStatement EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4092:2: iv_ruleCompoundStatement= ruleCompoundStatement EOF
            {
             newCompositeNode(grammarAccess.getCompoundStatementRule()); 
            pushFollow(FOLLOW_ruleCompoundStatement_in_entryRuleCompoundStatement11995);
            iv_ruleCompoundStatement=ruleCompoundStatement();

            state._fsp--;

             current =iv_ruleCompoundStatement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompoundStatement12006); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4099:1: ruleCompoundStatement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'CompoundStatement' ;
    public final AntlrDatatypeRuleToken ruleCompoundStatement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4102:28: (kw= 'CompoundStatement' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4104:2: kw= 'CompoundStatement'
            {
            kw=(Token)match(input,142,FOLLOW_142_in_ruleCompoundStatement12043); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4117:1: entryRuleCtorInitializer returns [String current=null] : iv_ruleCtorInitializer= ruleCtorInitializer EOF ;
    public final String entryRuleCtorInitializer() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCtorInitializer = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4118:2: (iv_ruleCtorInitializer= ruleCtorInitializer EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4119:2: iv_ruleCtorInitializer= ruleCtorInitializer EOF
            {
             newCompositeNode(grammarAccess.getCtorInitializerRule()); 
            pushFollow(FOLLOW_ruleCtorInitializer_in_entryRuleCtorInitializer12083);
            iv_ruleCtorInitializer=ruleCtorInitializer();

            state._fsp--;

             current =iv_ruleCtorInitializer.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCtorInitializer12094); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4126:1: ruleCtorInitializer returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'CtorInitializer' ;
    public final AntlrDatatypeRuleToken ruleCtorInitializer() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4129:28: (kw= 'CtorInitializer' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4131:2: kw= 'CtorInitializer'
            {
            kw=(Token)match(input,143,FOLLOW_143_in_ruleCtorInitializer12131); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4144:1: entryRuleTypeIdList returns [String current=null] : iv_ruleTypeIdList= ruleTypeIdList EOF ;
    public final String entryRuleTypeIdList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeIdList = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4145:2: (iv_ruleTypeIdList= ruleTypeIdList EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4146:2: iv_ruleTypeIdList= ruleTypeIdList EOF
            {
             newCompositeNode(grammarAccess.getTypeIdListRule()); 
            pushFollow(FOLLOW_ruleTypeIdList_in_entryRuleTypeIdList12171);
            iv_ruleTypeIdList=ruleTypeIdList();

            state._fsp--;

             current =iv_ruleTypeIdList.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeIdList12182); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4153:1: ruleTypeIdList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'TypeIdList' ;
    public final AntlrDatatypeRuleToken ruleTypeIdList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4156:28: (kw= 'TypeIdList' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4158:2: kw= 'TypeIdList'
            {
            kw=(Token)match(input,144,FOLLOW_144_in_ruleTypeIdList12219); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4171:1: entryRuleUnqualifiedId returns [String current=null] : iv_ruleUnqualifiedId= ruleUnqualifiedId EOF ;
    public final String entryRuleUnqualifiedId() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnqualifiedId = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4172:2: (iv_ruleUnqualifiedId= ruleUnqualifiedId EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4173:2: iv_ruleUnqualifiedId= ruleUnqualifiedId EOF
            {
             newCompositeNode(grammarAccess.getUnqualifiedIdRule()); 
            pushFollow(FOLLOW_ruleUnqualifiedId_in_entryRuleUnqualifiedId12259);
            iv_ruleUnqualifiedId=ruleUnqualifiedId();

            state._fsp--;

             current =iv_ruleUnqualifiedId.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnqualifiedId12270); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4180:1: ruleUnqualifiedId returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'UnqualifiedId' ;
    public final AntlrDatatypeRuleToken ruleUnqualifiedId() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4183:28: (kw= 'UnqualifiedId' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4185:2: kw= 'UnqualifiedId'
            {
            kw=(Token)match(input,145,FOLLOW_145_in_ruleUnqualifiedId12307); 

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


    // $ANTLR start "entryRuleClassName"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4198:1: entryRuleClassName returns [String current=null] : iv_ruleClassName= ruleClassName EOF ;
    public final String entryRuleClassName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleClassName = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4199:2: (iv_ruleClassName= ruleClassName EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4200:2: iv_ruleClassName= ruleClassName EOF
            {
             newCompositeNode(grammarAccess.getClassNameRule()); 
            pushFollow(FOLLOW_ruleClassName_in_entryRuleClassName12347);
            iv_ruleClassName=ruleClassName();

            state._fsp--;

             current =iv_ruleClassName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassName12358); 

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
    // $ANTLR end "entryRuleClassName"


    // $ANTLR start "ruleClassName"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4207:1: ruleClassName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'ClassName' ;
    public final AntlrDatatypeRuleToken ruleClassName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4210:28: (kw= 'ClassName' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4212:2: kw= 'ClassName'
            {
            kw=(Token)match(input,146,FOLLOW_146_in_ruleClassName12395); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getClassNameAccess().getClassNameKeyword()); 
                

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
    // $ANTLR end "ruleClassName"


    // $ANTLR start "entryRuleInitializer"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4225:1: entryRuleInitializer returns [String current=null] : iv_ruleInitializer= ruleInitializer EOF ;
    public final String entryRuleInitializer() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInitializer = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4226:2: (iv_ruleInitializer= ruleInitializer EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4227:2: iv_ruleInitializer= ruleInitializer EOF
            {
             newCompositeNode(grammarAccess.getInitializerRule()); 
            pushFollow(FOLLOW_ruleInitializer_in_entryRuleInitializer12435);
            iv_ruleInitializer=ruleInitializer();

            state._fsp--;

             current =iv_ruleInitializer.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInitializer12446); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4234:1: ruleInitializer returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Initializer' ;
    public final AntlrDatatypeRuleToken ruleInitializer() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4237:28: (kw= 'Initializer' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4239:2: kw= 'Initializer'
            {
            kw=(Token)match(input,147,FOLLOW_147_in_ruleInitializer12483); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getInitializerAccess().getInitializerKeyword()); 
                

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

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA61 dfa61 = new DFA61(this);
    static final String DFA4_eotS =
        "\14\uffff";
    static final String DFA4_eofS =
        "\14\uffff";
    static final String DFA4_minS =
        "\1\10\1\uffff\1\7\1\10\1\uffff\1\10\5\uffff\1\47";
    static final String DFA4_maxS =
        "\1\u0092\1\uffff\2\u0092\1\uffff\1\113\5\uffff\1\113";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\1\uffff\1\3\1\4\1\5\1\6\1\7\1\uffff";
    static final String DFA4_specialS =
        "\14\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\1\35\uffff\1\4\1\uffff\1\1\2\uffff\1\4\3\uffff\6\1\1\2\1"+
            "\1\1\3\3\1\1\6\17\1\2\uffff\1\1\3\uffff\1\5\1\1\1\4\4\uffff"+
            "\1\1\54\uffff\1\1\1\10\1\7\2\1\1\uffff\2\1\5\uffff\1\1",
            "",
            "\1\11\1\1\37\uffff\1\1\6\uffff\14\1\1\uffff\17\1\2\uffff\1"+
            "\1\4\uffff\1\1\5\uffff\1\1\54\uffff\1\1\2\uffff\2\1\1\uffff"+
            "\2\1\5\uffff\1\1",
            "\1\1\37\uffff\1\1\6\uffff\14\1\1\uffff\17\1\2\uffff\1\1\3"+
            "\uffff\1\12\1\1\5\uffff\1\1\54\uffff\1\1\2\uffff\2\1\1\uffff"+
            "\2\1\5\uffff\1\1",
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
    static final String DFA61_eotS =
        "\55\uffff";
    static final String DFA61_eofS =
        "\1\uffff\1\52\1\53\52\uffff";
    static final String DFA61_minS =
        "\1\47\2\132\52\uffff";
    static final String DFA61_maxS =
        "\1\176\2\135\52\uffff";
    static final String DFA61_acceptS =
        "\3\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1"+
        "\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34"+
        "\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51"+
        "\1\52\1\3\1\1\1\2\1\4";
    static final String DFA61_specialS =
        "\55\uffff}>";
    static final String[] DFA61_transitionS = {
            "\1\15\2\uffff\1\2\2\uffff\1\44\50\uffff\1\11\1\40\2\uffff\1"+
            "\16\1\17\1\1\2\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\12\1\13\1\14"+
            "\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33"+
            "\1\34\1\35\1\36\1\37\1\41\1\42\1\43\1\45\1\46\1\47\1\50",
            "\1\52\2\uffff\1\51",
            "\1\53\2\uffff\1\54",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA61_eot = DFA.unpackEncodedString(DFA61_eotS);
    static final short[] DFA61_eof = DFA.unpackEncodedString(DFA61_eofS);
    static final char[] DFA61_min = DFA.unpackEncodedStringToUnsignedChars(DFA61_minS);
    static final char[] DFA61_max = DFA.unpackEncodedStringToUnsignedChars(DFA61_maxS);
    static final short[] DFA61_accept = DFA.unpackEncodedString(DFA61_acceptS);
    static final short[] DFA61_special = DFA.unpackEncodedString(DFA61_specialS);
    static final short[][] DFA61_transition;

    static {
        int numStates = DFA61_transitionS.length;
        DFA61_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA61_transition[i] = DFA.unpackEncodedString(DFA61_transitionS[i]);
        }
    }

    class DFA61 extends DFA {

        public DFA61(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 61;
            this.eot = DFA61_eot;
            this.eof = DFA61_eof;
            this.min = DFA61_min;
            this.max = DFA61_max;
            this.accept = DFA61_accept;
            this.special = DFA61_special;
            this.transition = DFA61_transition;
        }
        public String getDescription() {
            return "2664:1: (kw= 'new' | kw= 'delete' | (kw= 'new' kw= '[' kw= ']' ) | (kw= 'delete' kw= '[' kw= ']' ) | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= '^' | kw= '&' | kw= '|' | kw= '~' | kw= '!' | kw= '=' | kw= '<' | kw= '>' | kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' | kw= '^=' | kw= '&=' | kw= '|=' | kw= '<<' | kw= '>>' | kw= '>>=' | kw= '<<=' | kw= '==' | kw= '!=' | kw= '<=' | kw= '>=' | kw= '&&' | kw= '||' | kw= '++' | kw= '--' | kw= ',' | kw= '->*' | kw= '->' | kw= '()' | kw= '[]' )";
        }
    }
 

    public static final BitSet FOLLOW_ruleTest_in_entryRuleTest75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTest85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleTest130 = new BitSet(new long[]{0xFFFF894000000102L,0x00000000010E27FFL,0x0000000000041BE0L});
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
    public static final BitSet FOLLOW_39_in_ruleAliasDeclaration1021 = new BitSet(new long[]{0xF400000000000100L,0x00000000000427FFL,0x0000000000041320L});
    public static final BitSet FOLLOW_ruleTypeId_in_ruleAliasDeclaration1043 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleAliasDeclaration1061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleDeclaration_in_entryRuleSimpleDeclaration1102 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleDeclaration1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarationSpecifier_in_ruleSimpleDeclaration1161 = new BitSet(new long[]{0xF7FF810000000100L,0x00000000010427FFL,0x0000000000041B20L});
    public static final BitSet FOLLOW_ruleSimpleDeclarationSuffix_in_ruleSimpleDeclaration1190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleOrFunctionDeclaration_in_entryRuleSimpleOrFunctionDeclaration1236 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleOrFunctionDeclaration1247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarationSpecifier_in_ruleSimpleOrFunctionDeclaration1295 = new BitSet(new long[]{0xF7FF810000000100L,0x00000000010427FFL,0x0000000000041B20L});
    public static final BitSet FOLLOW_ruleSimpleDeclarationSuffix_in_ruleSimpleOrFunctionDeclaration1325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDeclarationSuffix_in_ruleSimpleOrFunctionDeclaration1358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleDeclarationSuffix_in_entryRuleSimpleDeclarationSuffix1405 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleDeclarationSuffix1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitDeclaratorList_in_ruleSimpleDeclarationSuffix1464 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleSimpleDeclarationSuffix1484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDeclarationSuffix_in_entryRuleFunctionDeclarationSuffix1525 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionDeclarationSuffix1536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDeclarator_in_ruleFunctionDeclarationSuffix1583 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000000L,0x000000000000C001L});
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
    public static final BitSet FOLLOW_44_in_ruleStaticAssertDeclaration1814 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
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
    public static final BitSet FOLLOW_ruleElaboratedTypeSpecifier_in_ruleTrailingTypeSpecifier2723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypenameSpecifier_in_ruleTrailingTypeSpecifier2756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCvQualifier_in_ruleTrailingTypeSpecifier2789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleTypeSpecifier_in_entryRuleSimpleTypeSpecifier2835 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleTypeSpecifier2846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleSimpleTypeSpecifier2886 = new BitSet(new long[]{0x0400000000000100L,0x0000000000000000L,0x0000000000041000L});
    public static final BitSet FOLLOW_ruleTypeName_in_ruleSimpleTypeSpecifier2911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNestedNameSpecifier_in_ruleSimpleTypeSpecifier2945 = new BitSet(new long[]{0x0800000000000100L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_ruleTypeName_in_ruleSimpleTypeSpecifier2973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleSimpleTypeSpecifier2998 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleSimpleTemplateId_in_ruleSimpleTypeSpecifier3020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleSimpleTypeSpecifier3049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleSimpleTypeSpecifier3068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleSimpleTypeSpecifier3087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleSimpleTypeSpecifier3106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleSimpleTypeSpecifier3125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleSimpleTypeSpecifier3144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleSimpleTypeSpecifier3163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleSimpleTypeSpecifier3182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleSimpleTypeSpecifier3201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleSimpleTypeSpecifier3220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleSimpleTypeSpecifier3239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleSimpleTypeSpecifier3258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleSimpleTypeSpecifier3277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleSimpleTypeSpecifier3296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarationTypeSpecifier_in_ruleSimpleTypeSpecifier3324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeName_in_entryRuleTypeName3370 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeName3381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassName_in_ruleTypeName3428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleTemplateId_in_ruleTypeName3461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeName3487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarationTypeSpecifier_in_entryRuleDeclarationTypeSpecifier3533 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclarationTypeSpecifier3544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleDeclarationTypeSpecifier3582 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleDeclarationTypeSpecifier3595 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleDeclarationTypeSpecifier3617 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleDeclarationTypeSpecifier3635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElaboratedTypeSpecifier_in_entryRuleElaboratedTypeSpecifier3676 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElaboratedTypeSpecifier3687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassKey_in_ruleElaboratedTypeSpecifier3734 = new BitSet(new long[]{0x0C00000000000100L,0x0000000000000000L,0x0000000000041000L});
    public static final BitSet FOLLOW_58_in_ruleElaboratedTypeSpecifier3753 = new BitSet(new long[]{0x0C00000000000100L,0x0000000000000000L,0x0000000000041000L});
    public static final BitSet FOLLOW_ruleNestedNameSpecifier_in_ruleElaboratedTypeSpecifier3778 = new BitSet(new long[]{0x0800000000000100L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleElaboratedTypeSpecifier3801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleElaboratedTypeSpecifier3827 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleSimpleTemplateId_in_ruleElaboratedTypeSpecifier3851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumSpecifier_in_entryRuleEnumSpecifier3901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumSpecifier3912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumHead_in_ruleEnumSpecifier3959 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_ruleEnumSpecifier3977 = new BitSet(new long[]{0x0000000000000100L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleEnumeratorList_in_ruleEnumSpecifier4000 = new BitSet(new long[]{0x0000200000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_45_in_ruleEnumSpecifier4019 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_ruleEnumSpecifier4036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumHead_in_entryRuleEnumHead4077 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumHead4088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumKey_in_ruleEnumHead4135 = new BitSet(new long[]{0x0400000000000102L,0x0000000000010000L,0x0000000000041000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumHead4157 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleNestedNameSpecifier_in_ruleEnumHead4193 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumHead4213 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleEnumBase_in_ruleEnumHead4243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumKey_in_entryRuleEnumKey4291 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumKey4302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleEnumKey4340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleEnumKey4360 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_ruleEnumKey4373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleEnumKey4394 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_ruleEnumKey4407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumBase_in_entryRuleEnumBase4449 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumBase4460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleEnumBase4498 = new BitSet(new long[]{0xF400000000000100L,0x00000000000427FFL,0x0000000000041320L});
    public static final BitSet FOLLOW_ruleTypeSpecifier_in_ruleEnumBase4521 = new BitSet(new long[]{0xF400000000000102L,0x00000000000427FFL,0x0000000000041320L});
    public static final BitSet FOLLOW_ruleEnumeratorList_in_entryRuleEnumeratorList4569 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumeratorList4580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationDefinition_in_ruleEnumeratorList4627 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_ruleEnumeratorList4646 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleEnumerationDefinition_in_ruleEnumeratorList4668 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_ruleEnumerationDefinition_in_entryRuleEnumerationDefinition4716 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationDefinition4727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerator_in_ruleEnumerationDefinition4774 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_ruleEnumerationDefinition4793 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleConstantExpression_in_ruleEnumerationDefinition4815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerator_in_entryRuleEnumerator4863 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumerator4874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumerator4913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespaceDefinition_in_entryRuleNamespaceDefinition4958 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamespaceDefinition4969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleNamespaceDefinition5008 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_ruleNamespaceDefinition5023 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNamespaceDefinition5039 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_ruleNamespaceDefinition5059 = new BitSet(new long[]{0xFFFF894000000100L,0x00000000010E37FFL,0x0000000000041BE0L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleNamespaceDefinition5082 = new BitSet(new long[]{0xFFFF894000000100L,0x00000000010E37FFL,0x0000000000041BE0L});
    public static final BitSet FOLLOW_76_in_ruleNamespaceDefinition5102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespaceAliasDefinition_in_entryRuleNamespaceAliasDefinition5143 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamespaceAliasDefinition5154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleNamespaceAliasDefinition5192 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNamespaceAliasDefinition5207 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleNamespaceAliasDefinition5225 = new BitSet(new long[]{0x0400000000000100L,0x0000000000000000L,0x0000000000041000L});
    public static final BitSet FOLLOW_ruleQualifiedNamespaceSpecifier_in_ruleNamespaceAliasDefinition5247 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleNamespaceAliasDefinition5265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNamespaceSpecifier_in_entryRuleQualifiedNamespaceSpecifier5306 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNamespaceSpecifier5317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleQualifiedNamespaceSpecifier5356 = new BitSet(new long[]{0x0400000000000100L,0x0000000000000000L,0x0000000000041000L});
    public static final BitSet FOLLOW_ruleNestedNameSpecifier_in_ruleQualifiedNamespaceSpecifier5381 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedNamespaceSpecifier5403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsingDeclaration_in_entryRuleUsingDeclaration5449 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUsingDeclaration5460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleUsingDeclaration5498 = new BitSet(new long[]{0x0400000000000100L,0x0000000000040000L,0x0000000000041000L});
    public static final BitSet FOLLOW_58_in_ruleUsingDeclaration5512 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_82_in_ruleUsingDeclaration5533 = new BitSet(new long[]{0x0400000000000100L,0x0000000000000000L,0x0000000000041000L});
    public static final BitSet FOLLOW_58_in_ruleUsingDeclaration5549 = new BitSet(new long[]{0x0400000000000100L,0x0000000000000000L,0x0000000000041000L});
    public static final BitSet FOLLOW_ruleNestedNameSpecifier_in_ruleUsingDeclaration5573 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ruleUnqualifiedId_in_ruleUsingDeclaration5602 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleUsingDeclaration5620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsmDefinition_in_entryRuleAsmDefinition5663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAsmDefinition5674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleAsmDefinition5712 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleAsmDefinition5725 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_LITERAL_in_ruleAsmDefinition5740 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleAsmDefinition5758 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleAsmDefinition5771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkageSpecification_in_entryRuleLinkageSpecification5812 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLinkageSpecification5823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleLinkageSpecification5861 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_LITERAL_in_ruleLinkageSpecification5876 = new BitSet(new long[]{0xFFFF894000000100L,0x00000000010E2FFFL,0x0000000000041BE0L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleLinkageSpecification5904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleLinkageSpecification5929 = new BitSet(new long[]{0xFFFF894000000100L,0x00000000010E37FFL,0x0000000000041BE0L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleLinkageSpecification5952 = new BitSet(new long[]{0xFFFF894000000100L,0x00000000010E37FFL,0x0000000000041BE0L});
    public static final BitSet FOLLOW_76_in_ruleLinkageSpecification5972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitDeclaratorList_in_entryRuleInitDeclaratorList6015 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInitDeclaratorList6026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitDeclarator_in_ruleInitDeclaratorList6073 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_ruleInitDeclaratorList6092 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleInitDeclarator_in_ruleInitDeclaratorList6114 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_ruleInitDeclarator_in_entryRuleInitDeclarator6162 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInitDeclarator6173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaratorId_in_ruleInitDeclarator6220 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_ruleInitializer_in_ruleInitDeclarator6248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDeclarator_in_entryRuleFunctionDeclarator6296 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionDeclarator6307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaratorId_in_ruleFunctionDeclarator6354 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ruleParametersAndQualifiers_in_ruleFunctionDeclarator6381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParametersAndQualifiers_in_entryRuleParametersAndQualifiers6427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParametersAndQualifiers6438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleParametersAndQualifiers6476 = new BitSet(new long[]{0xF7FFC00000000100L,0x00000000010427FFL,0x0000000000041320L});
    public static final BitSet FOLLOW_ruleParameterDeclarationClause_in_ruleParametersAndQualifiers6499 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleParametersAndQualifiers6519 = new BitSet(new long[]{0x0000000000000002L,0x0000000000F00000L,0x000000000000000CL});
    public static final BitSet FOLLOW_84_in_ruleParametersAndQualifiers6533 = new BitSet(new long[]{0x0000000000000002L,0x0000000000C00000L,0x000000000000000CL});
    public static final BitSet FOLLOW_85_in_ruleParametersAndQualifiers6552 = new BitSet(new long[]{0x0000000000000002L,0x0000000000C00000L,0x000000000000000CL});
    public static final BitSet FOLLOW_86_in_ruleParametersAndQualifiers6568 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_87_in_ruleParametersAndQualifiers6587 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_ruleExceptionSpecification_in_ruleParametersAndQualifiers6612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaratorId_in_entryRuleDeclaratorId6660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaratorId6671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleDeclaratorId6710 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleIdExpression_in_ruleDeclaratorId6734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeId_in_entryRuleTypeId6780 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeId6791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeSpecifier_in_ruleTypeId6838 = new BitSet(new long[]{0xF400000000000102L,0x00000000000427FFL,0x0000000000041320L});
    public static final BitSet FOLLOW_ruleParameterDeclarationClause_in_entryRuleParameterDeclarationClause6885 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterDeclarationClause6896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleParameterDeclarationClause6934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclarationList_in_ruleParameterDeclarationClause6963 = new BitSet(new long[]{0x0000200000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_45_in_ruleParameterDeclarationClause6983 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_ruleParameterDeclarationClause6998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclarationList_in_entryRuleParameterDeclarationList7042 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterDeclarationList7053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleParameterDeclarationList7100 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_ruleParameterDeclarationList7119 = new BitSet(new long[]{0xF7FF800000000100L,0x00000000010427FFL,0x0000000000041320L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleParameterDeclarationList7141 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_entryRuleParameterDeclaration7189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterDeclaration7200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarationSpecifier_in_ruleParameterDeclaration7248 = new BitSet(new long[]{0xF7FF800000000100L,0x00000000010427FFL,0x0000000000041B20L});
    public static final BitSet FOLLOW_ruleInitDeclarator_in_ruleParameterDeclaration7277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionBody_in_entryRuleFunctionBody7323 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionBody7334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCtorInitializer_in_ruleFunctionBody7383 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_ruleCompoundStatement_in_ruleFunctionBody7412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionTryBlock_in_ruleFunctionBody7446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperatorFunctionId_in_entryRuleOperatorFunctionId7492 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperatorFunctionId7503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleOperatorFunctionId7541 = new BitSet(new long[]{0x0000248000000000L,0x7FFFFFFF9CC00000L});
    public static final BitSet FOLLOW_ruleOverloadableOperator_in_ruleOperatorFunctionId7563 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_ruleOperatorFunctionId7582 = new BitSet(new long[]{0xF400000000000100L,0x00000000090427FFL,0x0000000000041F20L});
    public static final BitSet FOLLOW_ruleConstantExpression_in_ruleOperatorFunctionId7605 = new BitSet(new long[]{0xF400000000000100L,0x00000000090427FFL,0x0000000000041F20L});
    public static final BitSet FOLLOW_ruleTypeSpecifier_in_ruleOperatorFunctionId7638 = new BitSet(new long[]{0xF400000000000100L,0x00000000090427FFL,0x0000000000041F20L});
    public static final BitSet FOLLOW_ruleIdExpression_in_ruleOperatorFunctionId7671 = new BitSet(new long[]{0xF400000000000100L,0x00000000090427FFL,0x0000000000041F20L});
    public static final BitSet FOLLOW_91_in_ruleOperatorFunctionId7691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOverloadableOperator_in_entryRuleOverloadableOperator7734 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOverloadableOperator7745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleOverloadableOperator7783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleOverloadableOperator7802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleOverloadableOperator7822 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_ruleOverloadableOperator7835 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_ruleOverloadableOperator7848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleOverloadableOperator7869 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_ruleOverloadableOperator7882 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_ruleOverloadableOperator7895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleOverloadableOperator7915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleOverloadableOperator7934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleOverloadableOperator7953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_ruleOverloadableOperator7972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_ruleOverloadableOperator7991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_ruleOverloadableOperator8010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleOverloadableOperator8029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_ruleOverloadableOperator8048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_ruleOverloadableOperator8067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_ruleOverloadableOperator8086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOverloadableOperator8105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleOverloadableOperator8124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleOverloadableOperator8143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_ruleOverloadableOperator8162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_ruleOverloadableOperator8181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_ruleOverloadableOperator8200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_ruleOverloadableOperator8219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_ruleOverloadableOperator8238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_ruleOverloadableOperator8257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_ruleOverloadableOperator8276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_ruleOverloadableOperator8295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_ruleOverloadableOperator8314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_ruleOverloadableOperator8333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_ruleOverloadableOperator8352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_ruleOverloadableOperator8371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_ruleOverloadableOperator8390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_ruleOverloadableOperator8409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_118_in_ruleOverloadableOperator8428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_ruleOverloadableOperator8447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleOverloadableOperator8466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_ruleOverloadableOperator8485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_ruleOverloadableOperator8504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_ruleOverloadableOperator8523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleOverloadableOperator8542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_ruleOverloadableOperator8561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_ruleOverloadableOperator8580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_ruleOverloadableOperator8599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_ruleOverloadableOperator8618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralOperatorId_in_entryRuleLiteralOperatorId8659 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralOperatorId8670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleLiteralOperatorId8708 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_127_in_ruleLiteralOperatorId8721 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_127_in_ruleLiteralOperatorId8734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateDeclaration_in_entryRuleTemplateDeclaration8775 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateDeclaration8786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleTemplateDeclaration8824 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_ruleTemplateDeclaration8837 = new BitSet(new long[]{0xF7FF800000000100L,0x00000000010467FFL,0x0000000000041320L});
    public static final BitSet FOLLOW_ruleTemplateParameterList_in_ruleTemplateDeclaration8859 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_ruleTemplateDeclaration8877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateParameterList_in_entryRuleTemplateParameterList8918 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateParameterList8929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateParameter_in_ruleTemplateParameterList8976 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_ruleTemplateParameterList8995 = new BitSet(new long[]{0xF7FF800000000100L,0x00000000010467FFL,0x0000000000041320L});
    public static final BitSet FOLLOW_ruleTemplateParameter_in_ruleTemplateParameterList9017 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_ruleTemplateParameter_in_entryRuleTemplateParameter9065 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateParameter9076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeParameter_in_ruleTemplateParameter9123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleTemplateParameter9156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeParameter_in_entryRuleTypeParameter9202 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeParameter9213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleTypeParameter9252 = new BitSet(new long[]{0x0000008000000102L,0x0000000001000000L});
    public static final BitSet FOLLOW_82_in_ruleTypeParameter9271 = new BitSet(new long[]{0x0000008000000102L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_ruleTypeParameter9288 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeParameter9306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeParameter9337 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleTypeParameter9357 = new BitSet(new long[]{0xF400000000000100L,0x00000000000427FFL,0x0000000000041320L});
    public static final BitSet FOLLOW_ruleTypeId_in_ruleTypeParameter9379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleTemplateId_in_entryRuleSimpleTemplateId9427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleTemplateId9438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSimpleTemplateId9478 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_ruleSimpleTemplateId9496 = new BitSet(new long[]{0xF400000000000100L,0x00000000010427FFL,0x0000000000041F20L});
    public static final BitSet FOLLOW_ruleTemplateArgumentList_in_ruleSimpleTemplateId9518 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_ruleSimpleTemplateId9536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateArgumentList_in_entryRuleTemplateArgumentList9579 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateArgumentList9590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateArgument_in_ruleTemplateArgumentList9637 = new BitSet(new long[]{0x0000200000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_ruleTemplateArgumentList9656 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_ruleTemplateArgumentList9672 = new BitSet(new long[]{0xF400000000000100L,0x00000000010427FFL,0x0000000000041F20L});
    public static final BitSet FOLLOW_ruleTemplateArgument_in_ruleTemplateArgumentList9694 = new BitSet(new long[]{0x0000200000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_ruleTemplateArgumentList9713 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_ruleTemplateArgument_in_entryRuleTemplateArgument9758 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateArgument9769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantExpression_in_ruleTemplateArgument9816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeId_in_ruleTemplateArgument9849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdExpression_in_ruleTemplateArgument9882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypenameSpecifier_in_entryRuleTypenameSpecifier9928 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypenameSpecifier9939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleTypenameSpecifier9977 = new BitSet(new long[]{0x0400000000000100L,0x0000000000000000L,0x0000000000041000L});
    public static final BitSet FOLLOW_58_in_ruleTypenameSpecifier9991 = new BitSet(new long[]{0x0400000000000100L,0x0000000000000000L,0x0000000000041000L});
    public static final BitSet FOLLOW_ruleNestedNameSpecifier_in_ruleTypenameSpecifier10015 = new BitSet(new long[]{0x0800000000000100L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypenameSpecifier10036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleTypenameSpecifier10062 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypenameSpecifier10079 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_ruleTypenameSpecifier10097 = new BitSet(new long[]{0xF400000000000100L,0x00000000010427FFL,0x0000000000041F20L});
    public static final BitSet FOLLOW_ruleTemplateArgumentList_in_ruleTypenameSpecifier10119 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_ruleTypenameSpecifier10137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionTryBlock_in_entryRuleFunctionTryBlock10182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionTryBlock10193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_ruleFunctionTryBlock10231 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_ruleCtorInitializer_in_ruleFunctionTryBlock10254 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_ruleCompoundStatement_in_ruleFunctionTryBlock10283 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHandler_in_ruleFunctionTryBlock10311 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHandler_in_entryRuleHandler10359 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHandler10370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_ruleHandler10408 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleHandler10421 = new BitSet(new long[]{0xF400000000000100L,0x00000000010427FFL,0x0000000000041320L});
    public static final BitSet FOLLOW_ruleExceptionDeclaration_in_ruleHandler10443 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleHandler10461 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_ruleCompoundStatement_in_ruleHandler10483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExceptionDeclaration_in_entryRuleExceptionDeclaration10529 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExceptionDeclaration10540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeSpecifier_in_ruleExceptionDeclaration10589 = new BitSet(new long[]{0xF400000000000102L,0x00000000010427FFL,0x0000000000041B20L});
    public static final BitSet FOLLOW_ruleDeclaratorId_in_ruleExceptionDeclaration10619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleExceptionDeclaration10646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExceptionSpecification_in_entryRuleExceptionSpecification10689 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExceptionSpecification10700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDynamicExceptionSpecification_in_ruleExceptionSpecification10747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoexceptSpecification_in_ruleExceptionSpecification10780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDynamicExceptionSpecification_in_entryRuleDynamicExceptionSpecification10826 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDynamicExceptionSpecification10837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_ruleDynamicExceptionSpecification10875 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleDynamicExceptionSpecification10888 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleTypeIdList_in_ruleDynamicExceptionSpecification10910 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleDynamicExceptionSpecification10928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoexceptSpecification_in_entryRuleNoexceptSpecification10969 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoexceptSpecification10980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_ruleNoexceptSpecification11018 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_ruleNoexceptSpecification11032 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleConstantExpression_in_ruleNoexceptSpecification11054 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleNoexceptSpecification11072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression11115 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression11126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_ruleExpression11163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassKey_in_entryRuleClassKey11203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassKey11214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_ruleClassKey11251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExplicitSpecialization_in_entryRuleExplicitSpecialization11291 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExplicitSpecialization11302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_ruleExplicitSpecialization11339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExplicitInstantiation_in_entryRuleExplicitInstantiation11379 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExplicitInstantiation11390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_135_in_ruleExplicitInstantiation11427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassSpecifier_in_entryRuleClassSpecifier11467 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassSpecifier11478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_136_in_ruleClassSpecifier11515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCvQualifier_in_entryRuleCvQualifier11555 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCvQualifier11566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_ruleCvQualifier11603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantExpression_in_entryRuleConstantExpression11643 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantExpression11654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_138_in_ruleConstantExpression11691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdExpression_in_entryRuleIdExpression11731 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdExpression11742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_139_in_ruleIdExpression11779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNestedNameSpecifier_in_entryRuleNestedNameSpecifier11819 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNestedNameSpecifier11830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_140_in_ruleNestedNameSpecifier11867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression11907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignmentExpression11918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_141_in_ruleAssignmentExpression11955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundStatement_in_entryRuleCompoundStatement11995 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompoundStatement12006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_142_in_ruleCompoundStatement12043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCtorInitializer_in_entryRuleCtorInitializer12083 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCtorInitializer12094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_143_in_ruleCtorInitializer12131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeIdList_in_entryRuleTypeIdList12171 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeIdList12182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_144_in_ruleTypeIdList12219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnqualifiedId_in_entryRuleUnqualifiedId12259 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnqualifiedId12270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_145_in_ruleUnqualifiedId12307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassName_in_entryRuleClassName12347 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassName12358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_146_in_ruleClassName12395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitializer_in_entryRuleInitializer12435 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInitializer12446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_147_in_ruleInitializer12483 = new BitSet(new long[]{0x0000000000000002L});

}