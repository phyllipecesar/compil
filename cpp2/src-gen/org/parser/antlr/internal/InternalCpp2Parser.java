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
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalCpp2Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_CHARACTER_LITERAL", "RULE_FLOATING_LITERAL", "RULE_STRING_LITERAL", "RULE_ID", "RULE_HEXADECIMAL_DIGIT", "RULE_HEX_QUAD", "RULE_UNIVERSAL_CHARACTER_NAME", "RULE_KEYWORD", "RULE_PREPROCESSING_OP_OR_PUNC", "RULE_NONDIGIT", "RULE_DIGIT", "RULE_DECIMAL_LITERAL", "RULE_OCTAL_LITERAL", "RULE_HEXADECIMAL_LITERAL", "RULE_INTEGER_SUFFIX", "RULE_OCTAL_DIGIT", "RULE_C_CHAR", "RULE_ESCAPE_SEQUENCE", "RULE_SIMPLE_ESCAPE_SEQUENCE", "RULE_OCTAL_ESCAPE_SEQUENCE", "RULE_HEXADECIMAL_ESCAPE_SEQUENCE", "RULE_FRACTIONAL_CONSTANT", "RULE_EXPONENT_PART", "RULE_ENC_PREFIX", "RULE_SCHAR", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'nullptr'", "':'", "'case'", "'default'", "';'", "'{'", "'}'", "'if'", "'('", "')'", "'else'", "'switch'", "'='", "'while'", "'do'", "'for'", "'break'", "'continue'", "'return'", "'goto'", "'using'", "'delete'", "'static_assert'", "','", "'friend'", "'typedef'", "'constexpr'", "'register'", "'static'", "'thread_local'", "'extern'", "'mutable'", "'inline'", "'virtual'", "'explicit'", "'::'", "'template'", "'char'", "'char16_t'", "'char32_t'", "'wchar_t'", "'bool'", "'short'", "'int'", "'long'", "'signed'", "'unsigned'", "'float'", "'double'", "'void'", "'auto'", "'decltype'", "'enum'", "'class'", "'struct'", "'namespace'", "'typename'", "'asm'", "'const'", "'volatile'", "'&'", "'&&'", "'...'", "'final'", "'union'", "'override'", "'new'", "'0'", "'private'", "'protected'", "'public'", "'operator'", "'<'", "'>'", "'['", "']'", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'|'", "'~'", "'!'", "'+='", "'-='", "'*='", "'/='", "'%='", "'^='", "'&='", "'|='", "'<<'", "'>>'", "'>>='", "'<<='", "'=='", "'!='", "'<='", "'>='", "'||'", "'++'", "'--'", "'->*'", "'->'", "'()'", "'[]'", "'\"'", "'try'", "'catch'", "'throw'", "'noexcept'", "'Expression'", "'ExplicitSpecialization'", "'ExplicitInstantiation'", "'CvQualifier'", "'ConstantExpression'", "'IdExpression'", "'NestedNameSpecifier'", "'AssignmentExpression'", "'CtorInitializer'", "'TypeIdList'", "'UnqualifiedId'"
    };
    public static final int RULE_ID=8;
    public static final int RULE_FLOATING_LITERAL=6;
    public static final int T__159=159;
    public static final int T__158=158;
    public static final int RULE_ANY_OTHER=34;
    public static final int T__160=160;
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
    public static final int T__154=154;
    public static final int T__155=155;
    public static final int RULE_NONDIGIT=14;
    public static final int T__156=156;
    public static final int T__157=157;
    public static final int T__99=99;
    public static final int T__150=150;
    public static final int T__98=98;
    public static final int RULE_CHARACTER_LITERAL=5;
    public static final int T__151=151;
    public static final int T__97=97;
    public static final int RULE_HEX_QUAD=10;
    public static final int T__152=152;
    public static final int T__96=96;
    public static final int T__153=153;
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
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTestRule()); 
            }
            pushFollow(FOLLOW_ruleTest_in_entryRuleTest75);
            iv_ruleTest=ruleTest();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTest; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTest85); if (state.failed) return current;

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

                if ( (LA1_0==RULE_ID||LA1_0==41||LA1_0==57||LA1_0==59||(LA1_0>=61 && LA1_0<=72)||(LA1_0>=73 && LA1_0<=94)||LA1_0==99||LA1_0==101||(LA1_0>=151 && LA1_0<=153)||(LA1_0>=155 && LA1_0<=156)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:81:1: (lv_elements_0_0= ruleDeclaration )
            	    {
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:81:1: (lv_elements_0_0= ruleDeclaration )
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:82:3: lv_elements_0_0= ruleDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTestAccess().getElementsDeclarationParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDeclaration_in_ruleTest130);
            	    lv_elements_0_0=ruleDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral169);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral180); if (state.failed) return current;

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
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:121:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLiteral220); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_0, grammarAccess.getLiteralAccess().getINTTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:129:10: this_CHARACTER_LITERAL_1= RULE_CHARACTER_LITERAL
                    {
                    this_CHARACTER_LITERAL_1=(Token)match(input,RULE_CHARACTER_LITERAL,FOLLOW_RULE_CHARACTER_LITERAL_in_ruleLiteral246); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_CHARACTER_LITERAL_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_CHARACTER_LITERAL_1, grammarAccess.getLiteralAccess().getCHARACTER_LITERALTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:137:10: this_FLOATING_LITERAL_2= RULE_FLOATING_LITERAL
                    {
                    this_FLOATING_LITERAL_2=(Token)match(input,RULE_FLOATING_LITERAL,FOLLOW_RULE_FLOATING_LITERAL_in_ruleLiteral272); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_FLOATING_LITERAL_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_FLOATING_LITERAL_2, grammarAccess.getLiteralAccess().getFLOATING_LITERALTerminalRuleCall_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:145:10: this_STRING_LITERAL_3= RULE_STRING_LITERAL
                    {
                    this_STRING_LITERAL_3=(Token)match(input,RULE_STRING_LITERAL,FOLLOW_RULE_STRING_LITERAL_in_ruleLiteral298); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_LITERAL_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_LITERAL_3, grammarAccess.getLiteralAccess().getSTRING_LITERALTerminalRuleCall_3()); 
                          
                    }

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
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 0, input);

                        throw nvae;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:154:2: kw= 'true'
                            {
                            kw=(Token)match(input,35,FOLLOW_35_in_ruleLiteral324); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getLiteralAccess().getTrueKeyword_4_0_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:161:2: kw= 'false'
                            {
                            kw=(Token)match(input,36,FOLLOW_36_in_ruleLiteral343); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getLiteralAccess().getFalseKeyword_4_0_1()); 
                                  
                            }

                            }
                            break;

                    }

                    kw=(Token)match(input,37,FOLLOW_37_in_ruleLiteral357); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getLiteralAccess().getNullptrKeyword_4_1()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleStatement"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:180:1: entryRuleStatement returns [String current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final String entryRuleStatement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStatement = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:181:2: (iv_ruleStatement= ruleStatement EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:182:2: iv_ruleStatement= ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement399);
            iv_ruleStatement=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement410); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:189:1: ruleStatement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_LabeledStatement_0= ruleLabeledStatement | this_ExpressionStatement_1= ruleExpressionStatement | this_CompoundStatement_2= ruleCompoundStatement | this_SelectionStatement_3= ruleSelectionStatement | this_IterationStatement_4= ruleIterationStatement | this_JumpStatement_5= ruleJumpStatement | this_DeclarationStatement_6= ruleDeclarationStatement | this_TryBlock_7= ruleTryBlock ) ;
    public final AntlrDatatypeRuleToken ruleStatement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_LabeledStatement_0 = null;

        AntlrDatatypeRuleToken this_ExpressionStatement_1 = null;

        AntlrDatatypeRuleToken this_CompoundStatement_2 = null;

        AntlrDatatypeRuleToken this_SelectionStatement_3 = null;

        AntlrDatatypeRuleToken this_IterationStatement_4 = null;

        AntlrDatatypeRuleToken this_JumpStatement_5 = null;

        AntlrDatatypeRuleToken this_DeclarationStatement_6 = null;

        AntlrDatatypeRuleToken this_TryBlock_7 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:192:28: ( (this_LabeledStatement_0= ruleLabeledStatement | this_ExpressionStatement_1= ruleExpressionStatement | this_CompoundStatement_2= ruleCompoundStatement | this_SelectionStatement_3= ruleSelectionStatement | this_IterationStatement_4= ruleIterationStatement | this_JumpStatement_5= ruleJumpStatement | this_DeclarationStatement_6= ruleDeclarationStatement | this_TryBlock_7= ruleTryBlock ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:193:1: (this_LabeledStatement_0= ruleLabeledStatement | this_ExpressionStatement_1= ruleExpressionStatement | this_CompoundStatement_2= ruleCompoundStatement | this_SelectionStatement_3= ruleSelectionStatement | this_IterationStatement_4= ruleIterationStatement | this_JumpStatement_5= ruleJumpStatement | this_DeclarationStatement_6= ruleDeclarationStatement | this_TryBlock_7= ruleTryBlock )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:193:1: (this_LabeledStatement_0= ruleLabeledStatement | this_ExpressionStatement_1= ruleExpressionStatement | this_CompoundStatement_2= ruleCompoundStatement | this_SelectionStatement_3= ruleSelectionStatement | this_IterationStatement_4= ruleIterationStatement | this_JumpStatement_5= ruleJumpStatement | this_DeclarationStatement_6= ruleDeclarationStatement | this_TryBlock_7= ruleTryBlock )
            int alt4=8;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:194:5: this_LabeledStatement_0= ruleLabeledStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getLabeledStatementParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLabeledStatement_in_ruleStatement457);
                    this_LabeledStatement_0=ruleLabeledStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LabeledStatement_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:206:5: this_ExpressionStatement_1= ruleExpressionStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getExpressionStatementParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpressionStatement_in_ruleStatement490);
                    this_ExpressionStatement_1=ruleExpressionStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ExpressionStatement_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:218:5: this_CompoundStatement_2= ruleCompoundStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getCompoundStatementParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCompoundStatement_in_ruleStatement523);
                    this_CompoundStatement_2=ruleCompoundStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_CompoundStatement_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:230:5: this_SelectionStatement_3= ruleSelectionStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getSelectionStatementParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSelectionStatement_in_ruleStatement556);
                    this_SelectionStatement_3=ruleSelectionStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_SelectionStatement_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:242:5: this_IterationStatement_4= ruleIterationStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getIterationStatementParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIterationStatement_in_ruleStatement589);
                    this_IterationStatement_4=ruleIterationStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_IterationStatement_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:254:5: this_JumpStatement_5= ruleJumpStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getJumpStatementParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJumpStatement_in_ruleStatement622);
                    this_JumpStatement_5=ruleJumpStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_JumpStatement_5);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:266:5: this_DeclarationStatement_6= ruleDeclarationStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getDeclarationStatementParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDeclarationStatement_in_ruleStatement655);
                    this_DeclarationStatement_6=ruleDeclarationStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_DeclarationStatement_6);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:278:5: this_TryBlock_7= ruleTryBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getTryBlockParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTryBlock_in_ruleStatement688);
                    this_TryBlock_7=ruleTryBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_TryBlock_7);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleLabeledStatement"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:296:1: entryRuleLabeledStatement returns [String current=null] : iv_ruleLabeledStatement= ruleLabeledStatement EOF ;
    public final String entryRuleLabeledStatement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLabeledStatement = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:297:2: (iv_ruleLabeledStatement= ruleLabeledStatement EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:298:2: iv_ruleLabeledStatement= ruleLabeledStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLabeledStatementRule()); 
            }
            pushFollow(FOLLOW_ruleLabeledStatement_in_entryRuleLabeledStatement734);
            iv_ruleLabeledStatement=ruleLabeledStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLabeledStatement.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabeledStatement745); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLabeledStatement"


    // $ANTLR start "ruleLabeledStatement"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:305:1: ruleLabeledStatement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID kw= ':' this_Statement_2= ruleStatement ) | (kw= 'case' this_ConstantExpression_4= ruleConstantExpression kw= ':' this_Statement_6= ruleStatement ) | (kw= 'default' kw= ':' this_Statement_9= ruleStatement ) ) ;
    public final AntlrDatatypeRuleToken ruleLabeledStatement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_Statement_2 = null;

        AntlrDatatypeRuleToken this_ConstantExpression_4 = null;

        AntlrDatatypeRuleToken this_Statement_6 = null;

        AntlrDatatypeRuleToken this_Statement_9 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:308:28: ( ( (this_ID_0= RULE_ID kw= ':' this_Statement_2= ruleStatement ) | (kw= 'case' this_ConstantExpression_4= ruleConstantExpression kw= ':' this_Statement_6= ruleStatement ) | (kw= 'default' kw= ':' this_Statement_9= ruleStatement ) ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:309:1: ( (this_ID_0= RULE_ID kw= ':' this_Statement_2= ruleStatement ) | (kw= 'case' this_ConstantExpression_4= ruleConstantExpression kw= ':' this_Statement_6= ruleStatement ) | (kw= 'default' kw= ':' this_Statement_9= ruleStatement ) )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:309:1: ( (this_ID_0= RULE_ID kw= ':' this_Statement_2= ruleStatement ) | (kw= 'case' this_ConstantExpression_4= ruleConstantExpression kw= ':' this_Statement_6= ruleStatement ) | (kw= 'default' kw= ':' this_Statement_9= ruleStatement ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt5=1;
                }
                break;
            case 39:
                {
                alt5=2;
                }
                break;
            case 40:
                {
                alt5=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:309:2: (this_ID_0= RULE_ID kw= ':' this_Statement_2= ruleStatement )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:309:2: (this_ID_0= RULE_ID kw= ':' this_Statement_2= ruleStatement )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:309:7: this_ID_0= RULE_ID kw= ':' this_Statement_2= ruleStatement
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLabeledStatement786); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_0, grammarAccess.getLabeledStatementAccess().getIDTerminalRuleCall_0_0()); 
                          
                    }
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleLabeledStatement804); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getLabeledStatementAccess().getColonKeyword_0_1()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLabeledStatementAccess().getStatementParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStatement_in_ruleLabeledStatement826);
                    this_Statement_2=ruleStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Statement_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:334:6: (kw= 'case' this_ConstantExpression_4= ruleConstantExpression kw= ':' this_Statement_6= ruleStatement )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:334:6: (kw= 'case' this_ConstantExpression_4= ruleConstantExpression kw= ':' this_Statement_6= ruleStatement )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:335:2: kw= 'case' this_ConstantExpression_4= ruleConstantExpression kw= ':' this_Statement_6= ruleStatement
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleLabeledStatement852); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getLabeledStatementAccess().getCaseKeyword_1_0()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLabeledStatementAccess().getConstantExpressionParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleConstantExpression_in_ruleLabeledStatement874);
                    this_ConstantExpression_4=ruleConstantExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ConstantExpression_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleLabeledStatement892); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getLabeledStatementAccess().getColonKeyword_1_2()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLabeledStatementAccess().getStatementParserRuleCall_1_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStatement_in_ruleLabeledStatement914);
                    this_Statement_6=ruleStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Statement_6);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:369:6: (kw= 'default' kw= ':' this_Statement_9= ruleStatement )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:369:6: (kw= 'default' kw= ':' this_Statement_9= ruleStatement )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:370:2: kw= 'default' kw= ':' this_Statement_9= ruleStatement
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleLabeledStatement940); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getLabeledStatementAccess().getDefaultKeyword_2_0()); 
                          
                    }
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleLabeledStatement953); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getLabeledStatementAccess().getColonKeyword_2_1()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLabeledStatementAccess().getStatementParserRuleCall_2_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStatement_in_ruleLabeledStatement975);
                    this_Statement_9=ruleStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Statement_9);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleLabeledStatement"


    // $ANTLR start "entryRuleExpressionStatement"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:400:1: entryRuleExpressionStatement returns [String current=null] : iv_ruleExpressionStatement= ruleExpressionStatement EOF ;
    public final String entryRuleExpressionStatement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpressionStatement = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:401:2: (iv_ruleExpressionStatement= ruleExpressionStatement EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:402:2: iv_ruleExpressionStatement= ruleExpressionStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionStatementRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionStatement_in_entryRuleExpressionStatement1022);
            iv_ruleExpressionStatement=ruleExpressionStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionStatement.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionStatement1033); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionStatement"


    // $ANTLR start "ruleExpressionStatement"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:409:1: ruleExpressionStatement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Expression_0= ruleExpression kw= ';' ) ;
    public final AntlrDatatypeRuleToken ruleExpressionStatement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Expression_0 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:412:28: ( (this_Expression_0= ruleExpression kw= ';' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:413:1: (this_Expression_0= ruleExpression kw= ';' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:413:1: (this_Expression_0= ruleExpression kw= ';' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:414:5: this_Expression_0= ruleExpression kw= ';'
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionStatementAccess().getExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleExpressionStatement1080);
            this_Expression_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Expression_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            kw=(Token)match(input,41,FOLLOW_41_in_ruleExpressionStatement1098); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getExpressionStatementAccess().getSemicolonKeyword_1()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleExpressionStatement"


    // $ANTLR start "entryRuleCompoundStatement"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:438:1: entryRuleCompoundStatement returns [String current=null] : iv_ruleCompoundStatement= ruleCompoundStatement EOF ;
    public final String entryRuleCompoundStatement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCompoundStatement = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:439:2: (iv_ruleCompoundStatement= ruleCompoundStatement EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:440:2: iv_ruleCompoundStatement= ruleCompoundStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompoundStatementRule()); 
            }
            pushFollow(FOLLOW_ruleCompoundStatement_in_entryRuleCompoundStatement1139);
            iv_ruleCompoundStatement=ruleCompoundStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompoundStatement.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompoundStatement1150); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:447:1: ruleCompoundStatement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '{' (this_Statement_1= ruleStatement )* kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleCompoundStatement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Statement_1 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:450:28: ( (kw= '{' (this_Statement_1= ruleStatement )* kw= '}' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:451:1: (kw= '{' (this_Statement_1= ruleStatement )* kw= '}' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:451:1: (kw= '{' (this_Statement_1= ruleStatement )* kw= '}' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:452:2: kw= '{' (this_Statement_1= ruleStatement )* kw= '}'
            {
            kw=(Token)match(input,42,FOLLOW_42_in_ruleCompoundStatement1188); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getCompoundStatementAccess().getLeftCurlyBracketKeyword_0()); 
                  
            }
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:457:1: (this_Statement_1= ruleStatement )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||(LA6_0>=39 && LA6_0<=42)||LA6_0==44||LA6_0==48||(LA6_0>=50 && LA6_0<=57)||LA6_0==59||(LA6_0>=61 && LA6_0<=72)||(LA6_0>=74 && LA6_0<=94)||LA6_0==99||LA6_0==101||LA6_0==146||LA6_0==150||LA6_0==153||(LA6_0>=155 && LA6_0<=156)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:458:5: this_Statement_1= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getCompoundStatementAccess().getStatementParserRuleCall_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleStatement_in_ruleCompoundStatement1211);
            	    this_Statement_1=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_Statement_1);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            kw=(Token)match(input,43,FOLLOW_43_in_ruleCompoundStatement1231); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getCompoundStatementAccess().getRightCurlyBracketKeyword_2()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleCompoundStatement"


    // $ANTLR start "entryRuleSelectionStatement"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:482:1: entryRuleSelectionStatement returns [String current=null] : iv_ruleSelectionStatement= ruleSelectionStatement EOF ;
    public final String entryRuleSelectionStatement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSelectionStatement = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:483:2: (iv_ruleSelectionStatement= ruleSelectionStatement EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:484:2: iv_ruleSelectionStatement= ruleSelectionStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectionStatementRule()); 
            }
            pushFollow(FOLLOW_ruleSelectionStatement_in_entryRuleSelectionStatement1272);
            iv_ruleSelectionStatement=ruleSelectionStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectionStatement.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectionStatement1283); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSelectionStatement"


    // $ANTLR start "ruleSelectionStatement"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:491:1: ruleSelectionStatement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'if' kw= '(' this_Condition_2= ruleCondition kw= ')' this_Statement_4= ruleStatement ( ( ( 'else' )=>kw= 'else' ) this_Statement_6= ruleStatement )? ) | (kw= 'switch' kw= '(' this_Condition_9= ruleCondition kw= ')' this_Statement_11= ruleStatement ) ) ;
    public final AntlrDatatypeRuleToken ruleSelectionStatement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Condition_2 = null;

        AntlrDatatypeRuleToken this_Statement_4 = null;

        AntlrDatatypeRuleToken this_Statement_6 = null;

        AntlrDatatypeRuleToken this_Condition_9 = null;

        AntlrDatatypeRuleToken this_Statement_11 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:494:28: ( ( (kw= 'if' kw= '(' this_Condition_2= ruleCondition kw= ')' this_Statement_4= ruleStatement ( ( ( 'else' )=>kw= 'else' ) this_Statement_6= ruleStatement )? ) | (kw= 'switch' kw= '(' this_Condition_9= ruleCondition kw= ')' this_Statement_11= ruleStatement ) ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:495:1: ( (kw= 'if' kw= '(' this_Condition_2= ruleCondition kw= ')' this_Statement_4= ruleStatement ( ( ( 'else' )=>kw= 'else' ) this_Statement_6= ruleStatement )? ) | (kw= 'switch' kw= '(' this_Condition_9= ruleCondition kw= ')' this_Statement_11= ruleStatement ) )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:495:1: ( (kw= 'if' kw= '(' this_Condition_2= ruleCondition kw= ')' this_Statement_4= ruleStatement ( ( ( 'else' )=>kw= 'else' ) this_Statement_6= ruleStatement )? ) | (kw= 'switch' kw= '(' this_Condition_9= ruleCondition kw= ')' this_Statement_11= ruleStatement ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==44) ) {
                alt8=1;
            }
            else if ( (LA8_0==48) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:495:2: (kw= 'if' kw= '(' this_Condition_2= ruleCondition kw= ')' this_Statement_4= ruleStatement ( ( ( 'else' )=>kw= 'else' ) this_Statement_6= ruleStatement )? )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:495:2: (kw= 'if' kw= '(' this_Condition_2= ruleCondition kw= ')' this_Statement_4= ruleStatement ( ( ( 'else' )=>kw= 'else' ) this_Statement_6= ruleStatement )? )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:496:2: kw= 'if' kw= '(' this_Condition_2= ruleCondition kw= ')' this_Statement_4= ruleStatement ( ( ( 'else' )=>kw= 'else' ) this_Statement_6= ruleStatement )?
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleSelectionStatement1322); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSelectionStatementAccess().getIfKeyword_0_0()); 
                          
                    }
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleSelectionStatement1335); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSelectionStatementAccess().getLeftParenthesisKeyword_0_1()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSelectionStatementAccess().getConditionParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCondition_in_ruleSelectionStatement1357);
                    this_Condition_2=ruleCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Condition_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleSelectionStatement1375); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSelectionStatementAccess().getRightParenthesisKeyword_0_3()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSelectionStatementAccess().getStatementParserRuleCall_0_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStatement_in_ruleSelectionStatement1397);
                    this_Statement_4=ruleStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Statement_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:535:1: ( ( ( 'else' )=>kw= 'else' ) this_Statement_6= ruleStatement )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==47) ) {
                        int LA7_1 = input.LA(2);

                        if ( (synpred1_InternalCpp2()) ) {
                            alt7=1;
                        }
                    }
                    switch (alt7) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:535:2: ( ( 'else' )=>kw= 'else' ) this_Statement_6= ruleStatement
                            {
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:535:2: ( ( 'else' )=>kw= 'else' )
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:535:3: ( 'else' )=>kw= 'else'
                            {
                            kw=(Token)match(input,47,FOLLOW_47_in_ruleSelectionStatement1425); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getSelectionStatementAccess().getElseKeyword_0_5_0()); 
                                  
                            }

                            }

                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getSelectionStatementAccess().getStatementParserRuleCall_0_5_1()); 
                                  
                            }
                            pushFollow(FOLLOW_ruleStatement_in_ruleSelectionStatement1448);
                            this_Statement_6=ruleStatement();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_Statement_6);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:555:6: (kw= 'switch' kw= '(' this_Condition_9= ruleCondition kw= ')' this_Statement_11= ruleStatement )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:555:6: (kw= 'switch' kw= '(' this_Condition_9= ruleCondition kw= ')' this_Statement_11= ruleStatement )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:556:2: kw= 'switch' kw= '(' this_Condition_9= ruleCondition kw= ')' this_Statement_11= ruleStatement
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleSelectionStatement1476); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSelectionStatementAccess().getSwitchKeyword_1_0()); 
                          
                    }
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleSelectionStatement1489); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSelectionStatementAccess().getLeftParenthesisKeyword_1_1()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSelectionStatementAccess().getConditionParserRuleCall_1_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCondition_in_ruleSelectionStatement1511);
                    this_Condition_9=ruleCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Condition_9);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleSelectionStatement1529); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSelectionStatementAccess().getRightParenthesisKeyword_1_3()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSelectionStatementAccess().getStatementParserRuleCall_1_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStatement_in_ruleSelectionStatement1551);
                    this_Statement_11=ruleStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Statement_11);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSelectionStatement"


    // $ANTLR start "entryRuleCondition"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:603:1: entryRuleCondition returns [String current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final String entryRuleCondition() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCondition = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:604:2: (iv_ruleCondition= ruleCondition EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:605:2: iv_ruleCondition= ruleCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionRule()); 
            }
            pushFollow(FOLLOW_ruleCondition_in_entryRuleCondition1598);
            iv_ruleCondition=ruleCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCondition.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondition1609); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:612:1: ruleCondition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Expression_0= ruleExpression | ( (this_DeclarationSpecifier_1= ruleDeclarationSpecifier )+ this_DeclaratorId_2= ruleDeclaratorId ( (kw= '=' this_InitializerClause_4= ruleInitializerClause ) | this_BracedInitializerList_5= ruleBracedInitializerList ) ) ) ;
    public final AntlrDatatypeRuleToken ruleCondition() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Expression_0 = null;

        AntlrDatatypeRuleToken this_DeclarationSpecifier_1 = null;

        AntlrDatatypeRuleToken this_DeclaratorId_2 = null;

        AntlrDatatypeRuleToken this_InitializerClause_4 = null;

        AntlrDatatypeRuleToken this_BracedInitializerList_5 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:615:28: ( (this_Expression_0= ruleExpression | ( (this_DeclarationSpecifier_1= ruleDeclarationSpecifier )+ this_DeclaratorId_2= ruleDeclaratorId ( (kw= '=' this_InitializerClause_4= ruleInitializerClause ) | this_BracedInitializerList_5= ruleBracedInitializerList ) ) ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:616:1: (this_Expression_0= ruleExpression | ( (this_DeclarationSpecifier_1= ruleDeclarationSpecifier )+ this_DeclaratorId_2= ruleDeclaratorId ( (kw= '=' this_InitializerClause_4= ruleInitializerClause ) | this_BracedInitializerList_5= ruleBracedInitializerList ) ) )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:616:1: (this_Expression_0= ruleExpression | ( (this_DeclarationSpecifier_1= ruleDeclarationSpecifier )+ this_DeclaratorId_2= ruleDeclaratorId ( (kw= '=' this_InitializerClause_4= ruleInitializerClause ) | this_BracedInitializerList_5= ruleBracedInitializerList ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==150) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID||(LA11_0>=61 && LA11_0<=72)||(LA11_0>=74 && LA11_0<=91)||LA11_0==93||LA11_0==101||LA11_0==153||LA11_0==156) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:617:5: this_Expression_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConditionAccess().getExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleCondition1656);
                    this_Expression_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Expression_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:628:6: ( (this_DeclarationSpecifier_1= ruleDeclarationSpecifier )+ this_DeclaratorId_2= ruleDeclaratorId ( (kw= '=' this_InitializerClause_4= ruleInitializerClause ) | this_BracedInitializerList_5= ruleBracedInitializerList ) )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:628:6: ( (this_DeclarationSpecifier_1= ruleDeclarationSpecifier )+ this_DeclaratorId_2= ruleDeclaratorId ( (kw= '=' this_InitializerClause_4= ruleInitializerClause ) | this_BracedInitializerList_5= ruleBracedInitializerList ) )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:628:7: (this_DeclarationSpecifier_1= ruleDeclarationSpecifier )+ this_DeclaratorId_2= ruleDeclaratorId ( (kw= '=' this_InitializerClause_4= ruleInitializerClause ) | this_BracedInitializerList_5= ruleBracedInitializerList )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:628:7: (this_DeclarationSpecifier_1= ruleDeclarationSpecifier )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_ID||(LA9_0>=61 && LA9_0<=72)||(LA9_0>=74 && LA9_0<=91)||LA9_0==93||LA9_0==101||LA9_0==153||LA9_0==156) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:629:5: this_DeclarationSpecifier_1= ruleDeclarationSpecifier
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getConditionAccess().getDeclarationSpecifierParserRuleCall_1_0()); 
                    	          
                    	    }
                    	    pushFollow(FOLLOW_ruleDeclarationSpecifier_in_ruleCondition1691);
                    	    this_DeclarationSpecifier_1=ruleDeclarationSpecifier();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		current.merge(this_DeclarationSpecifier_1);
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              afterParserOrEnumRuleCall();
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);

                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConditionAccess().getDeclaratorIdParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDeclaratorId_in_ruleCondition1720);
                    this_DeclaratorId_2=ruleDeclaratorId();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_DeclaratorId_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:650:1: ( (kw= '=' this_InitializerClause_4= ruleInitializerClause ) | this_BracedInitializerList_5= ruleBracedInitializerList )
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==49) ) {
                        alt10=1;
                    }
                    else if ( (LA10_0==42) ) {
                        alt10=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 0, input);

                        throw nvae;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:650:2: (kw= '=' this_InitializerClause_4= ruleInitializerClause )
                            {
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:650:2: (kw= '=' this_InitializerClause_4= ruleInitializerClause )
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:651:2: kw= '=' this_InitializerClause_4= ruleInitializerClause
                            {
                            kw=(Token)match(input,49,FOLLOW_49_in_ruleCondition1740); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getConditionAccess().getEqualsSignKeyword_1_2_0_0()); 
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getConditionAccess().getInitializerClauseParserRuleCall_1_2_0_1()); 
                                  
                            }
                            pushFollow(FOLLOW_ruleInitializerClause_in_ruleCondition1762);
                            this_InitializerClause_4=ruleInitializerClause();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_InitializerClause_4);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:669:5: this_BracedInitializerList_5= ruleBracedInitializerList
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getConditionAccess().getBracedInitializerListParserRuleCall_1_2_1()); 
                                  
                            }
                            pushFollow(FOLLOW_ruleBracedInitializerList_in_ruleCondition1796);
                            this_BracedInitializerList_5=ruleBracedInitializerList();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_BracedInitializerList_5);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
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

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleIterationStatement"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:687:1: entryRuleIterationStatement returns [String current=null] : iv_ruleIterationStatement= ruleIterationStatement EOF ;
    public final String entryRuleIterationStatement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIterationStatement = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:688:2: (iv_ruleIterationStatement= ruleIterationStatement EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:689:2: iv_ruleIterationStatement= ruleIterationStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIterationStatementRule()); 
            }
            pushFollow(FOLLOW_ruleIterationStatement_in_entryRuleIterationStatement1844);
            iv_ruleIterationStatement=ruleIterationStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIterationStatement.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIterationStatement1855); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIterationStatement"


    // $ANTLR start "ruleIterationStatement"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:696:1: ruleIterationStatement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'while' kw= '(' this_Condition_2= ruleCondition kw= ')' this_Statement_4= ruleStatement ) | (kw= 'do' this_Statement_6= ruleStatement kw= 'while' kw= '(' this_Expression_9= ruleExpression kw= ')' kw= ';' ) | (kw= 'for' kw= '(' this_ForInitializationStatement_14= ruleForInitializationStatement (this_Condition_15= ruleCondition )? kw= ';' (this_Expression_17= ruleExpression )? kw= ')' this_Statement_19= ruleStatement ) ) ;
    public final AntlrDatatypeRuleToken ruleIterationStatement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Condition_2 = null;

        AntlrDatatypeRuleToken this_Statement_4 = null;

        AntlrDatatypeRuleToken this_Statement_6 = null;

        AntlrDatatypeRuleToken this_Expression_9 = null;

        AntlrDatatypeRuleToken this_ForInitializationStatement_14 = null;

        AntlrDatatypeRuleToken this_Condition_15 = null;

        AntlrDatatypeRuleToken this_Expression_17 = null;

        AntlrDatatypeRuleToken this_Statement_19 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:699:28: ( ( (kw= 'while' kw= '(' this_Condition_2= ruleCondition kw= ')' this_Statement_4= ruleStatement ) | (kw= 'do' this_Statement_6= ruleStatement kw= 'while' kw= '(' this_Expression_9= ruleExpression kw= ')' kw= ';' ) | (kw= 'for' kw= '(' this_ForInitializationStatement_14= ruleForInitializationStatement (this_Condition_15= ruleCondition )? kw= ';' (this_Expression_17= ruleExpression )? kw= ')' this_Statement_19= ruleStatement ) ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:700:1: ( (kw= 'while' kw= '(' this_Condition_2= ruleCondition kw= ')' this_Statement_4= ruleStatement ) | (kw= 'do' this_Statement_6= ruleStatement kw= 'while' kw= '(' this_Expression_9= ruleExpression kw= ')' kw= ';' ) | (kw= 'for' kw= '(' this_ForInitializationStatement_14= ruleForInitializationStatement (this_Condition_15= ruleCondition )? kw= ';' (this_Expression_17= ruleExpression )? kw= ')' this_Statement_19= ruleStatement ) )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:700:1: ( (kw= 'while' kw= '(' this_Condition_2= ruleCondition kw= ')' this_Statement_4= ruleStatement ) | (kw= 'do' this_Statement_6= ruleStatement kw= 'while' kw= '(' this_Expression_9= ruleExpression kw= ')' kw= ';' ) | (kw= 'for' kw= '(' this_ForInitializationStatement_14= ruleForInitializationStatement (this_Condition_15= ruleCondition )? kw= ';' (this_Expression_17= ruleExpression )? kw= ')' this_Statement_19= ruleStatement ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt14=1;
                }
                break;
            case 51:
                {
                alt14=2;
                }
                break;
            case 52:
                {
                alt14=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:700:2: (kw= 'while' kw= '(' this_Condition_2= ruleCondition kw= ')' this_Statement_4= ruleStatement )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:700:2: (kw= 'while' kw= '(' this_Condition_2= ruleCondition kw= ')' this_Statement_4= ruleStatement )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:701:2: kw= 'while' kw= '(' this_Condition_2= ruleCondition kw= ')' this_Statement_4= ruleStatement
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleIterationStatement1894); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIterationStatementAccess().getWhileKeyword_0_0()); 
                          
                    }
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleIterationStatement1907); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIterationStatementAccess().getLeftParenthesisKeyword_0_1()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIterationStatementAccess().getConditionParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCondition_in_ruleIterationStatement1929);
                    this_Condition_2=ruleCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Condition_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleIterationStatement1947); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIterationStatementAccess().getRightParenthesisKeyword_0_3()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIterationStatementAccess().getStatementParserRuleCall_0_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStatement_in_ruleIterationStatement1969);
                    this_Statement_4=ruleStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Statement_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:741:6: (kw= 'do' this_Statement_6= ruleStatement kw= 'while' kw= '(' this_Expression_9= ruleExpression kw= ')' kw= ';' )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:741:6: (kw= 'do' this_Statement_6= ruleStatement kw= 'while' kw= '(' this_Expression_9= ruleExpression kw= ')' kw= ';' )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:742:2: kw= 'do' this_Statement_6= ruleStatement kw= 'while' kw= '(' this_Expression_9= ruleExpression kw= ')' kw= ';'
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_ruleIterationStatement1995); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIterationStatementAccess().getDoKeyword_1_0()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIterationStatementAccess().getStatementParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStatement_in_ruleIterationStatement2017);
                    this_Statement_6=ruleStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Statement_6);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleIterationStatement2035); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIterationStatementAccess().getWhileKeyword_1_2()); 
                          
                    }
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleIterationStatement2048); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIterationStatementAccess().getLeftParenthesisKeyword_1_3()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIterationStatementAccess().getExpressionParserRuleCall_1_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleIterationStatement2070);
                    this_Expression_9=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Expression_9);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleIterationStatement2088); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIterationStatementAccess().getRightParenthesisKeyword_1_5()); 
                          
                    }
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleIterationStatement2101); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIterationStatementAccess().getSemicolonKeyword_1_6()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:794:6: (kw= 'for' kw= '(' this_ForInitializationStatement_14= ruleForInitializationStatement (this_Condition_15= ruleCondition )? kw= ';' (this_Expression_17= ruleExpression )? kw= ')' this_Statement_19= ruleStatement )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:794:6: (kw= 'for' kw= '(' this_ForInitializationStatement_14= ruleForInitializationStatement (this_Condition_15= ruleCondition )? kw= ';' (this_Expression_17= ruleExpression )? kw= ')' this_Statement_19= ruleStatement )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:795:2: kw= 'for' kw= '(' this_ForInitializationStatement_14= ruleForInitializationStatement (this_Condition_15= ruleCondition )? kw= ';' (this_Expression_17= ruleExpression )? kw= ')' this_Statement_19= ruleStatement
                    {
                    kw=(Token)match(input,52,FOLLOW_52_in_ruleIterationStatement2122); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIterationStatementAccess().getForKeyword_2_0()); 
                          
                    }
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleIterationStatement2135); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIterationStatementAccess().getLeftParenthesisKeyword_2_1()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIterationStatementAccess().getForInitializationStatementParserRuleCall_2_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleForInitializationStatement_in_ruleIterationStatement2157);
                    this_ForInitializationStatement_14=ruleForInitializationStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ForInitializationStatement_14);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:817:1: (this_Condition_15= ruleCondition )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==RULE_ID||(LA12_0>=61 && LA12_0<=72)||(LA12_0>=74 && LA12_0<=91)||LA12_0==93||LA12_0==101||LA12_0==150||LA12_0==153||LA12_0==156) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:818:5: this_Condition_15= ruleCondition
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getIterationStatementAccess().getConditionParserRuleCall_2_3()); 
                                  
                            }
                            pushFollow(FOLLOW_ruleCondition_in_ruleIterationStatement2185);
                            this_Condition_15=ruleCondition();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_Condition_15);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }
                            break;

                    }

                    kw=(Token)match(input,41,FOLLOW_41_in_ruleIterationStatement2205); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIterationStatementAccess().getSemicolonKeyword_2_4()); 
                          
                    }
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:834:1: (this_Expression_17= ruleExpression )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==150) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:835:5: this_Expression_17= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getIterationStatementAccess().getExpressionParserRuleCall_2_5()); 
                                  
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleIterationStatement2228);
                            this_Expression_17=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_Expression_17);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }
                            break;

                    }

                    kw=(Token)match(input,46,FOLLOW_46_in_ruleIterationStatement2248); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIterationStatementAccess().getRightParenthesisKeyword_2_6()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIterationStatementAccess().getStatementParserRuleCall_2_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStatement_in_ruleIterationStatement2270);
                    this_Statement_19=ruleStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Statement_19);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleIterationStatement"


    // $ANTLR start "entryRuleForInitializationStatement"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:870:1: entryRuleForInitializationStatement returns [String current=null] : iv_ruleForInitializationStatement= ruleForInitializationStatement EOF ;
    public final String entryRuleForInitializationStatement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleForInitializationStatement = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:871:2: (iv_ruleForInitializationStatement= ruleForInitializationStatement EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:872:2: iv_ruleForInitializationStatement= ruleForInitializationStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForInitializationStatementRule()); 
            }
            pushFollow(FOLLOW_ruleForInitializationStatement_in_entryRuleForInitializationStatement2317);
            iv_ruleForInitializationStatement=ruleForInitializationStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForInitializationStatement.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleForInitializationStatement2328); if (state.failed) return current;

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
    // $ANTLR end "entryRuleForInitializationStatement"


    // $ANTLR start "ruleForInitializationStatement"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:879:1: ruleForInitializationStatement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ExpressionStatement_0= ruleExpressionStatement | this_SimpleDeclaration_1= ruleSimpleDeclaration ) ;
    public final AntlrDatatypeRuleToken ruleForInitializationStatement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_ExpressionStatement_0 = null;

        AntlrDatatypeRuleToken this_SimpleDeclaration_1 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:882:28: ( (this_ExpressionStatement_0= ruleExpressionStatement | this_SimpleDeclaration_1= ruleSimpleDeclaration ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:883:1: (this_ExpressionStatement_0= ruleExpressionStatement | this_SimpleDeclaration_1= ruleSimpleDeclaration )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:883:1: (this_ExpressionStatement_0= ruleExpressionStatement | this_SimpleDeclaration_1= ruleSimpleDeclaration )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==150) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_ID||LA15_0==41||(LA15_0>=61 && LA15_0<=72)||(LA15_0>=74 && LA15_0<=91)||LA15_0==93||LA15_0==99||LA15_0==101||LA15_0==153||(LA15_0>=155 && LA15_0<=156)) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:884:5: this_ExpressionStatement_0= ruleExpressionStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getForInitializationStatementAccess().getExpressionStatementParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpressionStatement_in_ruleForInitializationStatement2375);
                    this_ExpressionStatement_0=ruleExpressionStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ExpressionStatement_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:896:5: this_SimpleDeclaration_1= ruleSimpleDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getForInitializationStatementAccess().getSimpleDeclarationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSimpleDeclaration_in_ruleForInitializationStatement2408);
                    this_SimpleDeclaration_1=ruleSimpleDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_SimpleDeclaration_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleForInitializationStatement"


    // $ANTLR start "entryRuleJumpStatement"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:914:1: entryRuleJumpStatement returns [String current=null] : iv_ruleJumpStatement= ruleJumpStatement EOF ;
    public final String entryRuleJumpStatement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleJumpStatement = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:915:2: (iv_ruleJumpStatement= ruleJumpStatement EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:916:2: iv_ruleJumpStatement= ruleJumpStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJumpStatementRule()); 
            }
            pushFollow(FOLLOW_ruleJumpStatement_in_entryRuleJumpStatement2454);
            iv_ruleJumpStatement=ruleJumpStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJumpStatement.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJumpStatement2465); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJumpStatement"


    // $ANTLR start "ruleJumpStatement"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:923:1: ruleJumpStatement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'break' kw= ';' ) | (kw= 'continue' kw= ';' ) | (kw= 'return' (this_Expression_5= ruleExpression | this_BracedInitializerList_6= ruleBracedInitializerList )? kw= ';' ) | (kw= 'goto' this_ID_9= RULE_ID kw= ';' ) ) ;
    public final AntlrDatatypeRuleToken ruleJumpStatement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_9=null;
        AntlrDatatypeRuleToken this_Expression_5 = null;

        AntlrDatatypeRuleToken this_BracedInitializerList_6 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:926:28: ( ( (kw= 'break' kw= ';' ) | (kw= 'continue' kw= ';' ) | (kw= 'return' (this_Expression_5= ruleExpression | this_BracedInitializerList_6= ruleBracedInitializerList )? kw= ';' ) | (kw= 'goto' this_ID_9= RULE_ID kw= ';' ) ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:927:1: ( (kw= 'break' kw= ';' ) | (kw= 'continue' kw= ';' ) | (kw= 'return' (this_Expression_5= ruleExpression | this_BracedInitializerList_6= ruleBracedInitializerList )? kw= ';' ) | (kw= 'goto' this_ID_9= RULE_ID kw= ';' ) )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:927:1: ( (kw= 'break' kw= ';' ) | (kw= 'continue' kw= ';' ) | (kw= 'return' (this_Expression_5= ruleExpression | this_BracedInitializerList_6= ruleBracedInitializerList )? kw= ';' ) | (kw= 'goto' this_ID_9= RULE_ID kw= ';' ) )
            int alt17=4;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt17=1;
                }
                break;
            case 54:
                {
                alt17=2;
                }
                break;
            case 55:
                {
                alt17=3;
                }
                break;
            case 56:
                {
                alt17=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:927:2: (kw= 'break' kw= ';' )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:927:2: (kw= 'break' kw= ';' )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:928:2: kw= 'break' kw= ';'
                    {
                    kw=(Token)match(input,53,FOLLOW_53_in_ruleJumpStatement2504); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getJumpStatementAccess().getBreakKeyword_0_0()); 
                          
                    }
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleJumpStatement2517); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getJumpStatementAccess().getSemicolonKeyword_0_1()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:940:6: (kw= 'continue' kw= ';' )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:940:6: (kw= 'continue' kw= ';' )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:941:2: kw= 'continue' kw= ';'
                    {
                    kw=(Token)match(input,54,FOLLOW_54_in_ruleJumpStatement2538); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getJumpStatementAccess().getContinueKeyword_1_0()); 
                          
                    }
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleJumpStatement2551); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getJumpStatementAccess().getSemicolonKeyword_1_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:953:6: (kw= 'return' (this_Expression_5= ruleExpression | this_BracedInitializerList_6= ruleBracedInitializerList )? kw= ';' )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:953:6: (kw= 'return' (this_Expression_5= ruleExpression | this_BracedInitializerList_6= ruleBracedInitializerList )? kw= ';' )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:954:2: kw= 'return' (this_Expression_5= ruleExpression | this_BracedInitializerList_6= ruleBracedInitializerList )? kw= ';'
                    {
                    kw=(Token)match(input,55,FOLLOW_55_in_ruleJumpStatement2572); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getJumpStatementAccess().getReturnKeyword_2_0()); 
                          
                    }
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:959:1: (this_Expression_5= ruleExpression | this_BracedInitializerList_6= ruleBracedInitializerList )?
                    int alt16=3;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==150) ) {
                        alt16=1;
                    }
                    else if ( (LA16_0==42) ) {
                        alt16=2;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:960:5: this_Expression_5= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getJumpStatementAccess().getExpressionParserRuleCall_2_1_0()); 
                                  
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleJumpStatement2595);
                            this_Expression_5=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_Expression_5);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:972:5: this_BracedInitializerList_6= ruleBracedInitializerList
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getJumpStatementAccess().getBracedInitializerListParserRuleCall_2_1_1()); 
                                  
                            }
                            pushFollow(FOLLOW_ruleBracedInitializerList_in_ruleJumpStatement2628);
                            this_BracedInitializerList_6=ruleBracedInitializerList();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_BracedInitializerList_6);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }
                            break;

                    }

                    kw=(Token)match(input,41,FOLLOW_41_in_ruleJumpStatement2648); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getJumpStatementAccess().getSemicolonKeyword_2_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:989:6: (kw= 'goto' this_ID_9= RULE_ID kw= ';' )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:989:6: (kw= 'goto' this_ID_9= RULE_ID kw= ';' )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:990:2: kw= 'goto' this_ID_9= RULE_ID kw= ';'
                    {
                    kw=(Token)match(input,56,FOLLOW_56_in_ruleJumpStatement2669); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getJumpStatementAccess().getGotoKeyword_3_0()); 
                          
                    }
                    this_ID_9=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleJumpStatement2684); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_9);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_9, grammarAccess.getJumpStatementAccess().getIDTerminalRuleCall_3_1()); 
                          
                    }
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleJumpStatement2702); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getJumpStatementAccess().getSemicolonKeyword_3_2()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJumpStatement"


    // $ANTLR start "entryRuleDeclarationStatement"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1016:1: entryRuleDeclarationStatement returns [String current=null] : iv_ruleDeclarationStatement= ruleDeclarationStatement EOF ;
    public final String entryRuleDeclarationStatement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDeclarationStatement = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1017:2: (iv_ruleDeclarationStatement= ruleDeclarationStatement EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1018:2: iv_ruleDeclarationStatement= ruleDeclarationStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclarationStatementRule()); 
            }
            pushFollow(FOLLOW_ruleDeclarationStatement_in_entryRuleDeclarationStatement2744);
            iv_ruleDeclarationStatement=ruleDeclarationStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclarationStatement.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclarationStatement2755); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDeclarationStatement"


    // $ANTLR start "ruleDeclarationStatement"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1025:1: ruleDeclarationStatement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SimpleDeclaration_0= ruleSimpleDeclaration | this_BlockDeclaration_1= ruleBlockDeclaration ) ;
    public final AntlrDatatypeRuleToken ruleDeclarationStatement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_SimpleDeclaration_0 = null;

        AntlrDatatypeRuleToken this_BlockDeclaration_1 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1028:28: ( (this_SimpleDeclaration_0= ruleSimpleDeclaration | this_BlockDeclaration_1= ruleBlockDeclaration ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1029:1: (this_SimpleDeclaration_0= ruleSimpleDeclaration | this_BlockDeclaration_1= ruleBlockDeclaration )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1029:1: (this_SimpleDeclaration_0= ruleSimpleDeclaration | this_BlockDeclaration_1= ruleBlockDeclaration )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID||LA18_0==41||(LA18_0>=61 && LA18_0<=72)||(LA18_0>=74 && LA18_0<=91)||LA18_0==93||LA18_0==99||LA18_0==101||LA18_0==153||(LA18_0>=155 && LA18_0<=156)) ) {
                alt18=1;
            }
            else if ( (LA18_0==57||LA18_0==59||LA18_0==92||LA18_0==94) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1030:5: this_SimpleDeclaration_0= ruleSimpleDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationStatementAccess().getSimpleDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSimpleDeclaration_in_ruleDeclarationStatement2802);
                    this_SimpleDeclaration_0=ruleSimpleDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_SimpleDeclaration_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1042:5: this_BlockDeclaration_1= ruleBlockDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationStatementAccess().getBlockDeclarationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBlockDeclaration_in_ruleDeclarationStatement2835);
                    this_BlockDeclaration_1=ruleBlockDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BlockDeclaration_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDeclarationStatement"


    // $ANTLR start "entryRuleDeclaration"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1060:1: entryRuleDeclaration returns [String current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final String entryRuleDeclaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDeclaration = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1061:2: (iv_ruleDeclaration= ruleDeclaration EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1062:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration2881);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclaration.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration2892); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1069:1: ruleDeclaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SimpleOrFunctionDeclaration_0= ruleSimpleOrFunctionDeclaration | this_BlockDeclaration_1= ruleBlockDeclaration | this_TemplateDeclaration_2= ruleTemplateDeclaration | this_ExplicitInstantiation_3= ruleExplicitInstantiation | this_ExplicitSpecialization_4= ruleExplicitSpecialization | this_LinkageSpecification_5= ruleLinkageSpecification | this_NamespaceDefinition_6= ruleNamespaceDefinition ) ;
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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1072:28: ( (this_SimpleOrFunctionDeclaration_0= ruleSimpleOrFunctionDeclaration | this_BlockDeclaration_1= ruleBlockDeclaration | this_TemplateDeclaration_2= ruleTemplateDeclaration | this_ExplicitInstantiation_3= ruleExplicitInstantiation | this_ExplicitSpecialization_4= ruleExplicitSpecialization | this_LinkageSpecification_5= ruleLinkageSpecification | this_NamespaceDefinition_6= ruleNamespaceDefinition ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1073:1: (this_SimpleOrFunctionDeclaration_0= ruleSimpleOrFunctionDeclaration | this_BlockDeclaration_1= ruleBlockDeclaration | this_TemplateDeclaration_2= ruleTemplateDeclaration | this_ExplicitInstantiation_3= ruleExplicitInstantiation | this_ExplicitSpecialization_4= ruleExplicitSpecialization | this_LinkageSpecification_5= ruleLinkageSpecification | this_NamespaceDefinition_6= ruleNamespaceDefinition )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1073:1: (this_SimpleOrFunctionDeclaration_0= ruleSimpleOrFunctionDeclaration | this_BlockDeclaration_1= ruleBlockDeclaration | this_TemplateDeclaration_2= ruleTemplateDeclaration | this_ExplicitInstantiation_3= ruleExplicitInstantiation | this_ExplicitSpecialization_4= ruleExplicitSpecialization | this_LinkageSpecification_5= ruleLinkageSpecification | this_NamespaceDefinition_6= ruleNamespaceDefinition )
            int alt19=7;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1074:5: this_SimpleOrFunctionDeclaration_0= ruleSimpleOrFunctionDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getSimpleOrFunctionDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSimpleOrFunctionDeclaration_in_ruleDeclaration2939);
                    this_SimpleOrFunctionDeclaration_0=ruleSimpleOrFunctionDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_SimpleOrFunctionDeclaration_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1086:5: this_BlockDeclaration_1= ruleBlockDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getBlockDeclarationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBlockDeclaration_in_ruleDeclaration2972);
                    this_BlockDeclaration_1=ruleBlockDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BlockDeclaration_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1098:5: this_TemplateDeclaration_2= ruleTemplateDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getTemplateDeclarationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTemplateDeclaration_in_ruleDeclaration3005);
                    this_TemplateDeclaration_2=ruleTemplateDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_TemplateDeclaration_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1110:5: this_ExplicitInstantiation_3= ruleExplicitInstantiation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getExplicitInstantiationParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExplicitInstantiation_in_ruleDeclaration3038);
                    this_ExplicitInstantiation_3=ruleExplicitInstantiation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ExplicitInstantiation_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1122:5: this_ExplicitSpecialization_4= ruleExplicitSpecialization
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getExplicitSpecializationParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExplicitSpecialization_in_ruleDeclaration3071);
                    this_ExplicitSpecialization_4=ruleExplicitSpecialization();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ExplicitSpecialization_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1134:5: this_LinkageSpecification_5= ruleLinkageSpecification
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getLinkageSpecificationParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLinkageSpecification_in_ruleDeclaration3104);
                    this_LinkageSpecification_5=ruleLinkageSpecification();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LinkageSpecification_5);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1146:5: this_NamespaceDefinition_6= ruleNamespaceDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getNamespaceDefinitionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNamespaceDefinition_in_ruleDeclaration3137);
                    this_NamespaceDefinition_6=ruleNamespaceDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NamespaceDefinition_6);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleBlockDeclaration"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1164:1: entryRuleBlockDeclaration returns [String current=null] : iv_ruleBlockDeclaration= ruleBlockDeclaration EOF ;
    public final String entryRuleBlockDeclaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBlockDeclaration = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1165:2: (iv_ruleBlockDeclaration= ruleBlockDeclaration EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1166:2: iv_ruleBlockDeclaration= ruleBlockDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBlockDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleBlockDeclaration_in_entryRuleBlockDeclaration3183);
            iv_ruleBlockDeclaration=ruleBlockDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBlockDeclaration.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlockDeclaration3194); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1173:1: ruleBlockDeclaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_AsmDefinition_0= ruleAsmDefinition | this_NamespaceAliasDefinition_1= ruleNamespaceAliasDefinition | this_UsingDeclaration_2= ruleUsingDeclaration | this_StaticAssertDeclaration_3= ruleStaticAssertDeclaration | this_AliasDeclaration_4= ruleAliasDeclaration ) ;
    public final AntlrDatatypeRuleToken ruleBlockDeclaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_AsmDefinition_0 = null;

        AntlrDatatypeRuleToken this_NamespaceAliasDefinition_1 = null;

        AntlrDatatypeRuleToken this_UsingDeclaration_2 = null;

        AntlrDatatypeRuleToken this_StaticAssertDeclaration_3 = null;

        AntlrDatatypeRuleToken this_AliasDeclaration_4 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1176:28: ( (this_AsmDefinition_0= ruleAsmDefinition | this_NamespaceAliasDefinition_1= ruleNamespaceAliasDefinition | this_UsingDeclaration_2= ruleUsingDeclaration | this_StaticAssertDeclaration_3= ruleStaticAssertDeclaration | this_AliasDeclaration_4= ruleAliasDeclaration ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1177:1: (this_AsmDefinition_0= ruleAsmDefinition | this_NamespaceAliasDefinition_1= ruleNamespaceAliasDefinition | this_UsingDeclaration_2= ruleUsingDeclaration | this_StaticAssertDeclaration_3= ruleStaticAssertDeclaration | this_AliasDeclaration_4= ruleAliasDeclaration )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1177:1: (this_AsmDefinition_0= ruleAsmDefinition | this_NamespaceAliasDefinition_1= ruleNamespaceAliasDefinition | this_UsingDeclaration_2= ruleUsingDeclaration | this_StaticAssertDeclaration_3= ruleStaticAssertDeclaration | this_AliasDeclaration_4= ruleAliasDeclaration )
            int alt20=5;
            switch ( input.LA(1) ) {
            case 94:
                {
                alt20=1;
                }
                break;
            case 92:
                {
                alt20=2;
                }
                break;
            case 57:
                {
                int LA20_3 = input.LA(2);

                if ( (LA20_3==RULE_ID) ) {
                    alt20=5;
                }
                else if ( (LA20_3==72||LA20_3==93||LA20_3==156) ) {
                    alt20=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 3, input);

                    throw nvae;
                }
                }
                break;
            case 59:
                {
                alt20=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1178:5: this_AsmDefinition_0= ruleAsmDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBlockDeclarationAccess().getAsmDefinitionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAsmDefinition_in_ruleBlockDeclaration3241);
                    this_AsmDefinition_0=ruleAsmDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_AsmDefinition_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1190:5: this_NamespaceAliasDefinition_1= ruleNamespaceAliasDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBlockDeclarationAccess().getNamespaceAliasDefinitionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNamespaceAliasDefinition_in_ruleBlockDeclaration3274);
                    this_NamespaceAliasDefinition_1=ruleNamespaceAliasDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NamespaceAliasDefinition_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1202:5: this_UsingDeclaration_2= ruleUsingDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBlockDeclarationAccess().getUsingDeclarationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUsingDeclaration_in_ruleBlockDeclaration3307);
                    this_UsingDeclaration_2=ruleUsingDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_UsingDeclaration_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1214:5: this_StaticAssertDeclaration_3= ruleStaticAssertDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBlockDeclarationAccess().getStaticAssertDeclarationParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStaticAssertDeclaration_in_ruleBlockDeclaration3340);
                    this_StaticAssertDeclaration_3=ruleStaticAssertDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_StaticAssertDeclaration_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1226:5: this_AliasDeclaration_4= ruleAliasDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBlockDeclarationAccess().getAliasDeclarationParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAliasDeclaration_in_ruleBlockDeclaration3373);
                    this_AliasDeclaration_4=ruleAliasDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_AliasDeclaration_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBlockDeclaration"


    // $ANTLR start "entryRuleAliasDeclaration"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1244:1: entryRuleAliasDeclaration returns [String current=null] : iv_ruleAliasDeclaration= ruleAliasDeclaration EOF ;
    public final String entryRuleAliasDeclaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAliasDeclaration = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1245:2: (iv_ruleAliasDeclaration= ruleAliasDeclaration EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1246:2: iv_ruleAliasDeclaration= ruleAliasDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAliasDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleAliasDeclaration_in_entryRuleAliasDeclaration3419);
            iv_ruleAliasDeclaration=ruleAliasDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAliasDeclaration.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAliasDeclaration3430); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1253:1: ruleAliasDeclaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'using' this_ID_1= RULE_ID kw= '=' this_TypeId_3= ruleTypeId kw= ';' ) ;
    public final AntlrDatatypeRuleToken ruleAliasDeclaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        AntlrDatatypeRuleToken this_TypeId_3 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1256:28: ( (kw= 'using' this_ID_1= RULE_ID kw= '=' this_TypeId_3= ruleTypeId kw= ';' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1257:1: (kw= 'using' this_ID_1= RULE_ID kw= '=' this_TypeId_3= ruleTypeId kw= ';' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1257:1: (kw= 'using' this_ID_1= RULE_ID kw= '=' this_TypeId_3= ruleTypeId kw= ';' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1258:2: kw= 'using' this_ID_1= RULE_ID kw= '=' this_TypeId_3= ruleTypeId kw= ';'
            {
            kw=(Token)match(input,57,FOLLOW_57_in_ruleAliasDeclaration3468); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getAliasDeclarationAccess().getUsingKeyword_0()); 
                  
            }
            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAliasDeclaration3483); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_1, grammarAccess.getAliasDeclarationAccess().getIDTerminalRuleCall_1()); 
                  
            }
            kw=(Token)match(input,49,FOLLOW_49_in_ruleAliasDeclaration3501); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getAliasDeclarationAccess().getEqualsSignKeyword_2()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAliasDeclarationAccess().getTypeIdParserRuleCall_3()); 
                  
            }
            pushFollow(FOLLOW_ruleTypeId_in_ruleAliasDeclaration3523);
            this_TypeId_3=ruleTypeId();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_TypeId_3);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            kw=(Token)match(input,41,FOLLOW_41_in_ruleAliasDeclaration3541); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getAliasDeclarationAccess().getSemicolonKeyword_4()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAliasDeclaration"


    // $ANTLR start "entryRuleSimpleDeclaration"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1301:1: entryRuleSimpleDeclaration returns [String current=null] : iv_ruleSimpleDeclaration= ruleSimpleDeclaration EOF ;
    public final String entryRuleSimpleDeclaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSimpleDeclaration = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1302:2: (iv_ruleSimpleDeclaration= ruleSimpleDeclaration EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1303:2: iv_ruleSimpleDeclaration= ruleSimpleDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleSimpleDeclaration_in_entryRuleSimpleDeclaration3582);
            iv_ruleSimpleDeclaration=ruleSimpleDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleDeclaration.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleDeclaration3593); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1310:1: ruleSimpleDeclaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_DeclarationSpecifier_0= ruleDeclarationSpecifier )* this_SimpleDeclarationSuffix_1= ruleSimpleDeclarationSuffix ) ;
    public final AntlrDatatypeRuleToken ruleSimpleDeclaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_DeclarationSpecifier_0 = null;

        AntlrDatatypeRuleToken this_SimpleDeclarationSuffix_1 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1313:28: ( ( (this_DeclarationSpecifier_0= ruleDeclarationSpecifier )* this_SimpleDeclarationSuffix_1= ruleSimpleDeclarationSuffix ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1314:1: ( (this_DeclarationSpecifier_0= ruleDeclarationSpecifier )* this_SimpleDeclarationSuffix_1= ruleSimpleDeclarationSuffix )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1314:1: ( (this_DeclarationSpecifier_0= ruleDeclarationSpecifier )* this_SimpleDeclarationSuffix_1= ruleSimpleDeclarationSuffix )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1314:2: (this_DeclarationSpecifier_0= ruleDeclarationSpecifier )* this_SimpleDeclarationSuffix_1= ruleSimpleDeclarationSuffix
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1314:2: (this_DeclarationSpecifier_0= ruleDeclarationSpecifier )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID||(LA21_0>=61 && LA21_0<=72)||(LA21_0>=74 && LA21_0<=91)||LA21_0==93||LA21_0==101||LA21_0==153||LA21_0==156) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1315:5: this_DeclarationSpecifier_0= ruleDeclarationSpecifier
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getSimpleDeclarationAccess().getDeclarationSpecifierParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleDeclarationSpecifier_in_ruleSimpleDeclaration3641);
            	    this_DeclarationSpecifier_0=ruleDeclarationSpecifier();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_DeclarationSpecifier_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSimpleDeclarationAccess().getSimpleDeclarationSuffixParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleSimpleDeclarationSuffix_in_ruleSimpleDeclaration3670);
            this_SimpleDeclarationSuffix_1=ruleSimpleDeclarationSuffix();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_SimpleDeclarationSuffix_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSimpleDeclaration"


    // $ANTLR start "entryRuleSimpleOrFunctionDeclaration"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1344:1: entryRuleSimpleOrFunctionDeclaration returns [String current=null] : iv_ruleSimpleOrFunctionDeclaration= ruleSimpleOrFunctionDeclaration EOF ;
    public final String entryRuleSimpleOrFunctionDeclaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSimpleOrFunctionDeclaration = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1345:2: (iv_ruleSimpleOrFunctionDeclaration= ruleSimpleOrFunctionDeclaration EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1346:2: iv_ruleSimpleOrFunctionDeclaration= ruleSimpleOrFunctionDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleOrFunctionDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleSimpleOrFunctionDeclaration_in_entryRuleSimpleOrFunctionDeclaration3716);
            iv_ruleSimpleOrFunctionDeclaration=ruleSimpleOrFunctionDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleOrFunctionDeclaration.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleOrFunctionDeclaration3727); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1353:1: ruleSimpleOrFunctionDeclaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_DeclarationSpecifier_0= ruleDeclarationSpecifier )* (this_SimpleDeclarationSuffix_1= ruleSimpleDeclarationSuffix | this_FunctionDeclarationSuffix_2= ruleFunctionDeclarationSuffix ) ) ;
    public final AntlrDatatypeRuleToken ruleSimpleOrFunctionDeclaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_DeclarationSpecifier_0 = null;

        AntlrDatatypeRuleToken this_SimpleDeclarationSuffix_1 = null;

        AntlrDatatypeRuleToken this_FunctionDeclarationSuffix_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1356:28: ( ( (this_DeclarationSpecifier_0= ruleDeclarationSpecifier )* (this_SimpleDeclarationSuffix_1= ruleSimpleDeclarationSuffix | this_FunctionDeclarationSuffix_2= ruleFunctionDeclarationSuffix ) ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1357:1: ( (this_DeclarationSpecifier_0= ruleDeclarationSpecifier )* (this_SimpleDeclarationSuffix_1= ruleSimpleDeclarationSuffix | this_FunctionDeclarationSuffix_2= ruleFunctionDeclarationSuffix ) )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1357:1: ( (this_DeclarationSpecifier_0= ruleDeclarationSpecifier )* (this_SimpleDeclarationSuffix_1= ruleSimpleDeclarationSuffix | this_FunctionDeclarationSuffix_2= ruleFunctionDeclarationSuffix ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1357:2: (this_DeclarationSpecifier_0= ruleDeclarationSpecifier )* (this_SimpleDeclarationSuffix_1= ruleSimpleDeclarationSuffix | this_FunctionDeclarationSuffix_2= ruleFunctionDeclarationSuffix )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1357:2: (this_DeclarationSpecifier_0= ruleDeclarationSpecifier )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID||(LA22_0>=61 && LA22_0<=72)||(LA22_0>=74 && LA22_0<=91)||LA22_0==93||LA22_0==101||LA22_0==153||LA22_0==156) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1358:5: this_DeclarationSpecifier_0= ruleDeclarationSpecifier
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getSimpleOrFunctionDeclarationAccess().getDeclarationSpecifierParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleDeclarationSpecifier_in_ruleSimpleOrFunctionDeclaration3775);
            	    this_DeclarationSpecifier_0=ruleDeclarationSpecifier();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_DeclarationSpecifier_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1368:3: (this_SimpleDeclarationSuffix_1= ruleSimpleDeclarationSuffix | this_FunctionDeclarationSuffix_2= ruleFunctionDeclarationSuffix )
            int alt23=2;
            switch ( input.LA(1) ) {
            case 99:
                {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==155) ) {
                    int LA23_2 = input.LA(3);

                    if ( ((LA23_2>=41 && LA23_2<=42)||LA23_2==49||LA23_2==60) ) {
                        alt23=1;
                    }
                    else if ( (LA23_2==45) ) {
                        int LA23_4 = input.LA(4);

                        if ( (LA23_4==150) ) {
                            alt23=1;
                        }
                        else if ( (LA23_4==RULE_ID||LA23_4==46||(LA23_4>=61 && LA23_4<=72)||(LA23_4>=74 && LA23_4<=91)||LA23_4==93||LA23_4==99||LA23_4==101||LA23_4==153||LA23_4==156) ) {
                            alt23=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 23, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;
                }
                }
                break;
            case 155:
                {
                int LA23_2 = input.LA(2);

                if ( ((LA23_2>=41 && LA23_2<=42)||LA23_2==49||LA23_2==60) ) {
                    alt23=1;
                }
                else if ( (LA23_2==45) ) {
                    int LA23_4 = input.LA(3);

                    if ( (LA23_4==150) ) {
                        alt23=1;
                    }
                    else if ( (LA23_4==RULE_ID||LA23_4==46||(LA23_4>=61 && LA23_4<=72)||(LA23_4>=74 && LA23_4<=91)||LA23_4==93||LA23_4==99||LA23_4==101||LA23_4==153||LA23_4==156) ) {
                        alt23=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 4, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 2, input);

                    throw nvae;
                }
                }
                break;
            case 41:
                {
                alt23=1;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1369:5: this_SimpleDeclarationSuffix_1= ruleSimpleDeclarationSuffix
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSimpleOrFunctionDeclarationAccess().getSimpleDeclarationSuffixParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSimpleDeclarationSuffix_in_ruleSimpleOrFunctionDeclaration3805);
                    this_SimpleDeclarationSuffix_1=ruleSimpleDeclarationSuffix();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_SimpleDeclarationSuffix_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1381:5: this_FunctionDeclarationSuffix_2= ruleFunctionDeclarationSuffix
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSimpleOrFunctionDeclarationAccess().getFunctionDeclarationSuffixParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFunctionDeclarationSuffix_in_ruleSimpleOrFunctionDeclaration3838);
                    this_FunctionDeclarationSuffix_2=ruleFunctionDeclarationSuffix();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_FunctionDeclarationSuffix_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSimpleOrFunctionDeclaration"


    // $ANTLR start "entryRuleSimpleDeclarationSuffix"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1399:1: entryRuleSimpleDeclarationSuffix returns [String current=null] : iv_ruleSimpleDeclarationSuffix= ruleSimpleDeclarationSuffix EOF ;
    public final String entryRuleSimpleDeclarationSuffix() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSimpleDeclarationSuffix = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1400:2: (iv_ruleSimpleDeclarationSuffix= ruleSimpleDeclarationSuffix EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1401:2: iv_ruleSimpleDeclarationSuffix= ruleSimpleDeclarationSuffix EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleDeclarationSuffixRule()); 
            }
            pushFollow(FOLLOW_ruleSimpleDeclarationSuffix_in_entryRuleSimpleDeclarationSuffix3885);
            iv_ruleSimpleDeclarationSuffix=ruleSimpleDeclarationSuffix();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleDeclarationSuffix.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleDeclarationSuffix3896); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1408:1: ruleSimpleDeclarationSuffix returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_InitDeclaratorList_0= ruleInitDeclaratorList )? kw= ';' ) ;
    public final AntlrDatatypeRuleToken ruleSimpleDeclarationSuffix() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_InitDeclaratorList_0 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1411:28: ( ( (this_InitDeclaratorList_0= ruleInitDeclaratorList )? kw= ';' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1412:1: ( (this_InitDeclaratorList_0= ruleInitDeclaratorList )? kw= ';' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1412:1: ( (this_InitDeclaratorList_0= ruleInitDeclaratorList )? kw= ';' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1412:2: (this_InitDeclaratorList_0= ruleInitDeclaratorList )? kw= ';'
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1412:2: (this_InitDeclaratorList_0= ruleInitDeclaratorList )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==99||LA24_0==155) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1413:5: this_InitDeclaratorList_0= ruleInitDeclaratorList
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSimpleDeclarationSuffixAccess().getInitDeclaratorListParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInitDeclaratorList_in_ruleSimpleDeclarationSuffix3944);
                    this_InitDeclaratorList_0=ruleInitDeclaratorList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_InitDeclaratorList_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }

            kw=(Token)match(input,41,FOLLOW_41_in_ruleSimpleDeclarationSuffix3964); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getSimpleDeclarationSuffixAccess().getSemicolonKeyword_1()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSimpleDeclarationSuffix"


    // $ANTLR start "entryRuleFunctionDeclarationSuffix"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1437:1: entryRuleFunctionDeclarationSuffix returns [String current=null] : iv_ruleFunctionDeclarationSuffix= ruleFunctionDeclarationSuffix EOF ;
    public final String entryRuleFunctionDeclarationSuffix() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunctionDeclarationSuffix = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1438:2: (iv_ruleFunctionDeclarationSuffix= ruleFunctionDeclarationSuffix EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1439:2: iv_ruleFunctionDeclarationSuffix= ruleFunctionDeclarationSuffix EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionDeclarationSuffixRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionDeclarationSuffix_in_entryRuleFunctionDeclarationSuffix4005);
            iv_ruleFunctionDeclarationSuffix=ruleFunctionDeclarationSuffix();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionDeclarationSuffix.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionDeclarationSuffix4016); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1446:1: ruleFunctionDeclarationSuffix returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FunctionDeclarator_0= ruleFunctionDeclarator (this_FunctionBody_1= ruleFunctionBody | (kw= '=' kw= 'default' kw= ';' ) | (kw= '=' kw= 'delete' kw= ';' ) ) ) ;
    public final AntlrDatatypeRuleToken ruleFunctionDeclarationSuffix() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FunctionDeclarator_0 = null;

        AntlrDatatypeRuleToken this_FunctionBody_1 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1449:28: ( (this_FunctionDeclarator_0= ruleFunctionDeclarator (this_FunctionBody_1= ruleFunctionBody | (kw= '=' kw= 'default' kw= ';' ) | (kw= '=' kw= 'delete' kw= ';' ) ) ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1450:1: (this_FunctionDeclarator_0= ruleFunctionDeclarator (this_FunctionBody_1= ruleFunctionBody | (kw= '=' kw= 'default' kw= ';' ) | (kw= '=' kw= 'delete' kw= ';' ) ) )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1450:1: (this_FunctionDeclarator_0= ruleFunctionDeclarator (this_FunctionBody_1= ruleFunctionBody | (kw= '=' kw= 'default' kw= ';' ) | (kw= '=' kw= 'delete' kw= ';' ) ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1451:5: this_FunctionDeclarator_0= ruleFunctionDeclarator (this_FunctionBody_1= ruleFunctionBody | (kw= '=' kw= 'default' kw= ';' ) | (kw= '=' kw= 'delete' kw= ';' ) )
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getFunctionDeclarationSuffixAccess().getFunctionDeclaratorParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleFunctionDeclarator_in_ruleFunctionDeclarationSuffix4063);
            this_FunctionDeclarator_0=ruleFunctionDeclarator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_FunctionDeclarator_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1461:1: (this_FunctionBody_1= ruleFunctionBody | (kw= '=' kw= 'default' kw= ';' ) | (kw= '=' kw= 'delete' kw= ';' ) )
            int alt25=3;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==42||LA25_0==146||LA25_0==158) ) {
                alt25=1;
            }
            else if ( (LA25_0==49) ) {
                int LA25_2 = input.LA(2);

                if ( (LA25_2==58) ) {
                    alt25=3;
                }
                else if ( (LA25_2==40) ) {
                    alt25=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1462:5: this_FunctionBody_1= ruleFunctionBody
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFunctionDeclarationSuffixAccess().getFunctionBodyParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFunctionBody_in_ruleFunctionDeclarationSuffix4091);
                    this_FunctionBody_1=ruleFunctionBody();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_FunctionBody_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1473:6: (kw= '=' kw= 'default' kw= ';' )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1473:6: (kw= '=' kw= 'default' kw= ';' )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1474:2: kw= '=' kw= 'default' kw= ';'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleFunctionDeclarationSuffix4116); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFunctionDeclarationSuffixAccess().getEqualsSignKeyword_1_1_0()); 
                          
                    }
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleFunctionDeclarationSuffix4129); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFunctionDeclarationSuffixAccess().getDefaultKeyword_1_1_1()); 
                          
                    }
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleFunctionDeclarationSuffix4142); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFunctionDeclarationSuffixAccess().getSemicolonKeyword_1_1_2()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1492:6: (kw= '=' kw= 'delete' kw= ';' )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1492:6: (kw= '=' kw= 'delete' kw= ';' )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1493:2: kw= '=' kw= 'delete' kw= ';'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleFunctionDeclarationSuffix4163); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFunctionDeclarationSuffixAccess().getEqualsSignKeyword_1_2_0()); 
                          
                    }
                    kw=(Token)match(input,58,FOLLOW_58_in_ruleFunctionDeclarationSuffix4176); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFunctionDeclarationSuffixAccess().getDeleteKeyword_1_2_1()); 
                          
                    }
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleFunctionDeclarationSuffix4189); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFunctionDeclarationSuffixAccess().getSemicolonKeyword_1_2_2()); 
                          
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleFunctionDeclarationSuffix"


    // $ANTLR start "entryRuleStaticAssertDeclaration"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1518:1: entryRuleStaticAssertDeclaration returns [String current=null] : iv_ruleStaticAssertDeclaration= ruleStaticAssertDeclaration EOF ;
    public final String entryRuleStaticAssertDeclaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticAssertDeclaration = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1519:2: (iv_ruleStaticAssertDeclaration= ruleStaticAssertDeclaration EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1520:2: iv_ruleStaticAssertDeclaration= ruleStaticAssertDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticAssertDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleStaticAssertDeclaration_in_entryRuleStaticAssertDeclaration4232);
            iv_ruleStaticAssertDeclaration=ruleStaticAssertDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticAssertDeclaration.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticAssertDeclaration4243); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1527:1: ruleStaticAssertDeclaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'static_assert' kw= '(' this_ConstantExpression_2= ruleConstantExpression kw= ',' this_STRING_LITERAL_4= RULE_STRING_LITERAL kw= ')' kw= ';' ) ;
    public final AntlrDatatypeRuleToken ruleStaticAssertDeclaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_STRING_LITERAL_4=null;
        AntlrDatatypeRuleToken this_ConstantExpression_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1530:28: ( (kw= 'static_assert' kw= '(' this_ConstantExpression_2= ruleConstantExpression kw= ',' this_STRING_LITERAL_4= RULE_STRING_LITERAL kw= ')' kw= ';' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1531:1: (kw= 'static_assert' kw= '(' this_ConstantExpression_2= ruleConstantExpression kw= ',' this_STRING_LITERAL_4= RULE_STRING_LITERAL kw= ')' kw= ';' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1531:1: (kw= 'static_assert' kw= '(' this_ConstantExpression_2= ruleConstantExpression kw= ',' this_STRING_LITERAL_4= RULE_STRING_LITERAL kw= ')' kw= ';' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1532:2: kw= 'static_assert' kw= '(' this_ConstantExpression_2= ruleConstantExpression kw= ',' this_STRING_LITERAL_4= RULE_STRING_LITERAL kw= ')' kw= ';'
            {
            kw=(Token)match(input,59,FOLLOW_59_in_ruleStaticAssertDeclaration4281); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getStaticAssertDeclarationAccess().getStatic_assertKeyword_0()); 
                  
            }
            kw=(Token)match(input,45,FOLLOW_45_in_ruleStaticAssertDeclaration4294); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getStaticAssertDeclarationAccess().getLeftParenthesisKeyword_1()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getStaticAssertDeclarationAccess().getConstantExpressionParserRuleCall_2()); 
                  
            }
            pushFollow(FOLLOW_ruleConstantExpression_in_ruleStaticAssertDeclaration4316);
            this_ConstantExpression_2=ruleConstantExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ConstantExpression_2);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            kw=(Token)match(input,60,FOLLOW_60_in_ruleStaticAssertDeclaration4334); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getStaticAssertDeclarationAccess().getCommaKeyword_3()); 
                  
            }
            this_STRING_LITERAL_4=(Token)match(input,RULE_STRING_LITERAL,FOLLOW_RULE_STRING_LITERAL_in_ruleStaticAssertDeclaration4349); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_STRING_LITERAL_4);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_STRING_LITERAL_4, grammarAccess.getStaticAssertDeclarationAccess().getSTRING_LITERALTerminalRuleCall_4()); 
                  
            }
            kw=(Token)match(input,46,FOLLOW_46_in_ruleStaticAssertDeclaration4367); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getStaticAssertDeclarationAccess().getRightParenthesisKeyword_5()); 
                  
            }
            kw=(Token)match(input,41,FOLLOW_41_in_ruleStaticAssertDeclaration4380); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getStaticAssertDeclarationAccess().getSemicolonKeyword_6()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleStaticAssertDeclaration"


    // $ANTLR start "entryRuleDeclarationSpecifier"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1587:1: entryRuleDeclarationSpecifier returns [String current=null] : iv_ruleDeclarationSpecifier= ruleDeclarationSpecifier EOF ;
    public final String entryRuleDeclarationSpecifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDeclarationSpecifier = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1588:2: (iv_ruleDeclarationSpecifier= ruleDeclarationSpecifier EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1589:2: iv_ruleDeclarationSpecifier= ruleDeclarationSpecifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclarationSpecifierRule()); 
            }
            pushFollow(FOLLOW_ruleDeclarationSpecifier_in_entryRuleDeclarationSpecifier4421);
            iv_ruleDeclarationSpecifier=ruleDeclarationSpecifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclarationSpecifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclarationSpecifier4432); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1596:1: ruleDeclarationSpecifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_StorageClassSpecifier_0= ruleStorageClassSpecifier | this_TypeSpecifier_1= ruleTypeSpecifier | this_FunctionSpecifier_2= ruleFunctionSpecifier | kw= 'friend' | kw= 'typedef' | kw= 'constexpr' ) ;
    public final AntlrDatatypeRuleToken ruleDeclarationSpecifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_StorageClassSpecifier_0 = null;

        AntlrDatatypeRuleToken this_TypeSpecifier_1 = null;

        AntlrDatatypeRuleToken this_FunctionSpecifier_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1599:28: ( (this_StorageClassSpecifier_0= ruleStorageClassSpecifier | this_TypeSpecifier_1= ruleTypeSpecifier | this_FunctionSpecifier_2= ruleFunctionSpecifier | kw= 'friend' | kw= 'typedef' | kw= 'constexpr' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1600:1: (this_StorageClassSpecifier_0= ruleStorageClassSpecifier | this_TypeSpecifier_1= ruleTypeSpecifier | this_FunctionSpecifier_2= ruleFunctionSpecifier | kw= 'friend' | kw= 'typedef' | kw= 'constexpr' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1600:1: (this_StorageClassSpecifier_0= ruleStorageClassSpecifier | this_TypeSpecifier_1= ruleTypeSpecifier | this_FunctionSpecifier_2= ruleFunctionSpecifier | kw= 'friend' | kw= 'typedef' | kw= 'constexpr' )
            int alt26=6;
            switch ( input.LA(1) ) {
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                {
                alt26=1;
                }
                break;
            case RULE_ID:
            case 72:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 93:
            case 101:
            case 153:
            case 156:
                {
                alt26=2;
                }
                break;
            case 69:
            case 70:
            case 71:
                {
                alt26=3;
                }
                break;
            case 61:
                {
                alt26=4;
                }
                break;
            case 62:
                {
                alt26=5;
                }
                break;
            case 63:
                {
                alt26=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1601:5: this_StorageClassSpecifier_0= ruleStorageClassSpecifier
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationSpecifierAccess().getStorageClassSpecifierParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStorageClassSpecifier_in_ruleDeclarationSpecifier4479);
                    this_StorageClassSpecifier_0=ruleStorageClassSpecifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_StorageClassSpecifier_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1613:5: this_TypeSpecifier_1= ruleTypeSpecifier
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationSpecifierAccess().getTypeSpecifierParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTypeSpecifier_in_ruleDeclarationSpecifier4512);
                    this_TypeSpecifier_1=ruleTypeSpecifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_TypeSpecifier_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1625:5: this_FunctionSpecifier_2= ruleFunctionSpecifier
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationSpecifierAccess().getFunctionSpecifierParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFunctionSpecifier_in_ruleDeclarationSpecifier4545);
                    this_FunctionSpecifier_2=ruleFunctionSpecifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_FunctionSpecifier_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1637:2: kw= 'friend'
                    {
                    kw=(Token)match(input,61,FOLLOW_61_in_ruleDeclarationSpecifier4569); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getDeclarationSpecifierAccess().getFriendKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1644:2: kw= 'typedef'
                    {
                    kw=(Token)match(input,62,FOLLOW_62_in_ruleDeclarationSpecifier4588); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getDeclarationSpecifierAccess().getTypedefKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1651:2: kw= 'constexpr'
                    {
                    kw=(Token)match(input,63,FOLLOW_63_in_ruleDeclarationSpecifier4607); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getDeclarationSpecifierAccess().getConstexprKeyword_5()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDeclarationSpecifier"


    // $ANTLR start "entryRuleStorageClassSpecifier"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1664:1: entryRuleStorageClassSpecifier returns [String current=null] : iv_ruleStorageClassSpecifier= ruleStorageClassSpecifier EOF ;
    public final String entryRuleStorageClassSpecifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStorageClassSpecifier = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1665:2: (iv_ruleStorageClassSpecifier= ruleStorageClassSpecifier EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1666:2: iv_ruleStorageClassSpecifier= ruleStorageClassSpecifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStorageClassSpecifierRule()); 
            }
            pushFollow(FOLLOW_ruleStorageClassSpecifier_in_entryRuleStorageClassSpecifier4648);
            iv_ruleStorageClassSpecifier=ruleStorageClassSpecifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStorageClassSpecifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStorageClassSpecifier4659); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1673:1: ruleStorageClassSpecifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'register' | kw= 'static' | kw= 'thread_local' | kw= 'extern' | kw= 'mutable' ) ;
    public final AntlrDatatypeRuleToken ruleStorageClassSpecifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1676:28: ( (kw= 'register' | kw= 'static' | kw= 'thread_local' | kw= 'extern' | kw= 'mutable' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1677:1: (kw= 'register' | kw= 'static' | kw= 'thread_local' | kw= 'extern' | kw= 'mutable' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1677:1: (kw= 'register' | kw= 'static' | kw= 'thread_local' | kw= 'extern' | kw= 'mutable' )
            int alt27=5;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt27=1;
                }
                break;
            case 65:
                {
                alt27=2;
                }
                break;
            case 66:
                {
                alt27=3;
                }
                break;
            case 67:
                {
                alt27=4;
                }
                break;
            case 68:
                {
                alt27=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1678:2: kw= 'register'
                    {
                    kw=(Token)match(input,64,FOLLOW_64_in_ruleStorageClassSpecifier4697); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getStorageClassSpecifierAccess().getRegisterKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1685:2: kw= 'static'
                    {
                    kw=(Token)match(input,65,FOLLOW_65_in_ruleStorageClassSpecifier4716); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getStorageClassSpecifierAccess().getStaticKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1692:2: kw= 'thread_local'
                    {
                    kw=(Token)match(input,66,FOLLOW_66_in_ruleStorageClassSpecifier4735); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getStorageClassSpecifierAccess().getThread_localKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1699:2: kw= 'extern'
                    {
                    kw=(Token)match(input,67,FOLLOW_67_in_ruleStorageClassSpecifier4754); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getStorageClassSpecifierAccess().getExternKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1706:2: kw= 'mutable'
                    {
                    kw=(Token)match(input,68,FOLLOW_68_in_ruleStorageClassSpecifier4773); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getStorageClassSpecifierAccess().getMutableKeyword_4()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleStorageClassSpecifier"


    // $ANTLR start "entryRuleFunctionSpecifier"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1719:1: entryRuleFunctionSpecifier returns [String current=null] : iv_ruleFunctionSpecifier= ruleFunctionSpecifier EOF ;
    public final String entryRuleFunctionSpecifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunctionSpecifier = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1720:2: (iv_ruleFunctionSpecifier= ruleFunctionSpecifier EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1721:2: iv_ruleFunctionSpecifier= ruleFunctionSpecifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionSpecifierRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionSpecifier_in_entryRuleFunctionSpecifier4814);
            iv_ruleFunctionSpecifier=ruleFunctionSpecifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionSpecifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionSpecifier4825); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1728:1: ruleFunctionSpecifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'inline' | kw= 'virtual' | kw= 'explicit' ) ;
    public final AntlrDatatypeRuleToken ruleFunctionSpecifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1731:28: ( (kw= 'inline' | kw= 'virtual' | kw= 'explicit' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1732:1: (kw= 'inline' | kw= 'virtual' | kw= 'explicit' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1732:1: (kw= 'inline' | kw= 'virtual' | kw= 'explicit' )
            int alt28=3;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt28=1;
                }
                break;
            case 70:
                {
                alt28=2;
                }
                break;
            case 71:
                {
                alt28=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1733:2: kw= 'inline'
                    {
                    kw=(Token)match(input,69,FOLLOW_69_in_ruleFunctionSpecifier4863); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFunctionSpecifierAccess().getInlineKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1740:2: kw= 'virtual'
                    {
                    kw=(Token)match(input,70,FOLLOW_70_in_ruleFunctionSpecifier4882); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFunctionSpecifierAccess().getVirtualKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1747:2: kw= 'explicit'
                    {
                    kw=(Token)match(input,71,FOLLOW_71_in_ruleFunctionSpecifier4901); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFunctionSpecifierAccess().getExplicitKeyword_2()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleFunctionSpecifier"


    // $ANTLR start "entryRuleTypeSpecifier"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1760:1: entryRuleTypeSpecifier returns [String current=null] : iv_ruleTypeSpecifier= ruleTypeSpecifier EOF ;
    public final String entryRuleTypeSpecifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeSpecifier = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1761:2: (iv_ruleTypeSpecifier= ruleTypeSpecifier EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1762:2: iv_ruleTypeSpecifier= ruleTypeSpecifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeSpecifierRule()); 
            }
            pushFollow(FOLLOW_ruleTypeSpecifier_in_entryRuleTypeSpecifier4942);
            iv_ruleTypeSpecifier=ruleTypeSpecifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeSpecifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeSpecifier4953); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1769:1: ruleTypeSpecifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TrailingTypeSpecifier_0= ruleTrailingTypeSpecifier | this_ClassSpecifier_1= ruleClassSpecifier | this_EnumSpecifier_2= ruleEnumSpecifier ) ;
    public final AntlrDatatypeRuleToken ruleTypeSpecifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_TrailingTypeSpecifier_0 = null;

        AntlrDatatypeRuleToken this_ClassSpecifier_1 = null;

        AntlrDatatypeRuleToken this_EnumSpecifier_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1772:28: ( (this_TrailingTypeSpecifier_0= ruleTrailingTypeSpecifier | this_ClassSpecifier_1= ruleClassSpecifier | this_EnumSpecifier_2= ruleEnumSpecifier ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1773:1: (this_TrailingTypeSpecifier_0= ruleTrailingTypeSpecifier | this_ClassSpecifier_1= ruleClassSpecifier | this_EnumSpecifier_2= ruleEnumSpecifier )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1773:1: (this_TrailingTypeSpecifier_0= ruleTrailingTypeSpecifier | this_ClassSpecifier_1= ruleClassSpecifier | this_EnumSpecifier_2= ruleEnumSpecifier )
            int alt29=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 72:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 93:
            case 153:
            case 156:
                {
                alt29=1;
                }
                break;
            case 90:
            case 91:
            case 101:
                {
                alt29=2;
                }
                break;
            case 89:
                {
                alt29=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1774:5: this_TrailingTypeSpecifier_0= ruleTrailingTypeSpecifier
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeSpecifierAccess().getTrailingTypeSpecifierParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTrailingTypeSpecifier_in_ruleTypeSpecifier5000);
                    this_TrailingTypeSpecifier_0=ruleTrailingTypeSpecifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_TrailingTypeSpecifier_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1786:5: this_ClassSpecifier_1= ruleClassSpecifier
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeSpecifierAccess().getClassSpecifierParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleClassSpecifier_in_ruleTypeSpecifier5033);
                    this_ClassSpecifier_1=ruleClassSpecifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ClassSpecifier_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1798:5: this_EnumSpecifier_2= ruleEnumSpecifier
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeSpecifierAccess().getEnumSpecifierParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEnumSpecifier_in_ruleTypeSpecifier5066);
                    this_EnumSpecifier_2=ruleEnumSpecifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_EnumSpecifier_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTypeSpecifier"


    // $ANTLR start "entryRuleTrailingTypeSpecifier"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1816:1: entryRuleTrailingTypeSpecifier returns [String current=null] : iv_ruleTrailingTypeSpecifier= ruleTrailingTypeSpecifier EOF ;
    public final String entryRuleTrailingTypeSpecifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTrailingTypeSpecifier = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1817:2: (iv_ruleTrailingTypeSpecifier= ruleTrailingTypeSpecifier EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1818:2: iv_ruleTrailingTypeSpecifier= ruleTrailingTypeSpecifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTrailingTypeSpecifierRule()); 
            }
            pushFollow(FOLLOW_ruleTrailingTypeSpecifier_in_entryRuleTrailingTypeSpecifier5112);
            iv_ruleTrailingTypeSpecifier=ruleTrailingTypeSpecifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTrailingTypeSpecifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTrailingTypeSpecifier5123); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1825:1: ruleTrailingTypeSpecifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SimpleTypeSpecifier_0= ruleSimpleTypeSpecifier | this_TypenameSpecifier_1= ruleTypenameSpecifier | this_CvQualifier_2= ruleCvQualifier ) ;
    public final AntlrDatatypeRuleToken ruleTrailingTypeSpecifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_SimpleTypeSpecifier_0 = null;

        AntlrDatatypeRuleToken this_TypenameSpecifier_1 = null;

        AntlrDatatypeRuleToken this_CvQualifier_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1828:28: ( (this_SimpleTypeSpecifier_0= ruleSimpleTypeSpecifier | this_TypenameSpecifier_1= ruleTypenameSpecifier | this_CvQualifier_2= ruleCvQualifier ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1829:1: (this_SimpleTypeSpecifier_0= ruleSimpleTypeSpecifier | this_TypenameSpecifier_1= ruleTypenameSpecifier | this_CvQualifier_2= ruleCvQualifier )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1829:1: (this_SimpleTypeSpecifier_0= ruleSimpleTypeSpecifier | this_TypenameSpecifier_1= ruleTypenameSpecifier | this_CvQualifier_2= ruleCvQualifier )
            int alt30=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 72:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 156:
                {
                alt30=1;
                }
                break;
            case 93:
                {
                alt30=2;
                }
                break;
            case 153:
                {
                alt30=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1830:5: this_SimpleTypeSpecifier_0= ruleSimpleTypeSpecifier
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTrailingTypeSpecifierAccess().getSimpleTypeSpecifierParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSimpleTypeSpecifier_in_ruleTrailingTypeSpecifier5170);
                    this_SimpleTypeSpecifier_0=ruleSimpleTypeSpecifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_SimpleTypeSpecifier_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1842:5: this_TypenameSpecifier_1= ruleTypenameSpecifier
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTrailingTypeSpecifierAccess().getTypenameSpecifierParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTypenameSpecifier_in_ruleTrailingTypeSpecifier5203);
                    this_TypenameSpecifier_1=ruleTypenameSpecifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_TypenameSpecifier_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1854:5: this_CvQualifier_2= ruleCvQualifier
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTrailingTypeSpecifierAccess().getCvQualifierParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCvQualifier_in_ruleTrailingTypeSpecifier5236);
                    this_CvQualifier_2=ruleCvQualifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_CvQualifier_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTrailingTypeSpecifier"


    // $ANTLR start "entryRuleSimpleTypeSpecifier"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1872:1: entryRuleSimpleTypeSpecifier returns [String current=null] : iv_ruleSimpleTypeSpecifier= ruleSimpleTypeSpecifier EOF ;
    public final String entryRuleSimpleTypeSpecifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSimpleTypeSpecifier = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1873:2: (iv_ruleSimpleTypeSpecifier= ruleSimpleTypeSpecifier EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1874:2: iv_ruleSimpleTypeSpecifier= ruleSimpleTypeSpecifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleTypeSpecifierRule()); 
            }
            pushFollow(FOLLOW_ruleSimpleTypeSpecifier_in_entryRuleSimpleTypeSpecifier5282);
            iv_ruleSimpleTypeSpecifier=ruleSimpleTypeSpecifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleTypeSpecifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleTypeSpecifier5293); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1881:1: ruleSimpleTypeSpecifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= '::' )? (this_TypeName_1= ruleTypeName | (this_NestedNameSpecifier_2= ruleNestedNameSpecifier (this_TypeName_3= ruleTypeName | (kw= 'template' this_SimpleTemplateId_5= ruleSimpleTemplateId ) ) ) ) ) | kw= 'char' | kw= 'char16_t' | kw= 'char32_t' | kw= 'wchar_t' | kw= 'bool' | kw= 'short' | kw= 'int' | kw= 'long' | kw= 'signed' | kw= 'unsigned' | kw= 'float' | kw= 'double' | kw= 'void' | kw= 'auto' | this_DeclarationTypeSpecifier_20= ruleDeclarationTypeSpecifier ) ;
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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1884:28: ( ( ( (kw= '::' )? (this_TypeName_1= ruleTypeName | (this_NestedNameSpecifier_2= ruleNestedNameSpecifier (this_TypeName_3= ruleTypeName | (kw= 'template' this_SimpleTemplateId_5= ruleSimpleTemplateId ) ) ) ) ) | kw= 'char' | kw= 'char16_t' | kw= 'char32_t' | kw= 'wchar_t' | kw= 'bool' | kw= 'short' | kw= 'int' | kw= 'long' | kw= 'signed' | kw= 'unsigned' | kw= 'float' | kw= 'double' | kw= 'void' | kw= 'auto' | this_DeclarationTypeSpecifier_20= ruleDeclarationTypeSpecifier ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1885:1: ( ( (kw= '::' )? (this_TypeName_1= ruleTypeName | (this_NestedNameSpecifier_2= ruleNestedNameSpecifier (this_TypeName_3= ruleTypeName | (kw= 'template' this_SimpleTemplateId_5= ruleSimpleTemplateId ) ) ) ) ) | kw= 'char' | kw= 'char16_t' | kw= 'char32_t' | kw= 'wchar_t' | kw= 'bool' | kw= 'short' | kw= 'int' | kw= 'long' | kw= 'signed' | kw= 'unsigned' | kw= 'float' | kw= 'double' | kw= 'void' | kw= 'auto' | this_DeclarationTypeSpecifier_20= ruleDeclarationTypeSpecifier )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1885:1: ( ( (kw= '::' )? (this_TypeName_1= ruleTypeName | (this_NestedNameSpecifier_2= ruleNestedNameSpecifier (this_TypeName_3= ruleTypeName | (kw= 'template' this_SimpleTemplateId_5= ruleSimpleTemplateId ) ) ) ) ) | kw= 'char' | kw= 'char16_t' | kw= 'char32_t' | kw= 'wchar_t' | kw= 'bool' | kw= 'short' | kw= 'int' | kw= 'long' | kw= 'signed' | kw= 'unsigned' | kw= 'float' | kw= 'double' | kw= 'void' | kw= 'auto' | this_DeclarationTypeSpecifier_20= ruleDeclarationTypeSpecifier )
            int alt34=16;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 72:
            case 156:
                {
                alt34=1;
                }
                break;
            case 74:
                {
                alt34=2;
                }
                break;
            case 75:
                {
                alt34=3;
                }
                break;
            case 76:
                {
                alt34=4;
                }
                break;
            case 77:
                {
                alt34=5;
                }
                break;
            case 78:
                {
                alt34=6;
                }
                break;
            case 79:
                {
                alt34=7;
                }
                break;
            case 80:
                {
                alt34=8;
                }
                break;
            case 81:
                {
                alt34=9;
                }
                break;
            case 82:
                {
                alt34=10;
                }
                break;
            case 83:
                {
                alt34=11;
                }
                break;
            case 84:
                {
                alt34=12;
                }
                break;
            case 85:
                {
                alt34=13;
                }
                break;
            case 86:
                {
                alt34=14;
                }
                break;
            case 87:
                {
                alt34=15;
                }
                break;
            case 88:
                {
                alt34=16;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1885:2: ( (kw= '::' )? (this_TypeName_1= ruleTypeName | (this_NestedNameSpecifier_2= ruleNestedNameSpecifier (this_TypeName_3= ruleTypeName | (kw= 'template' this_SimpleTemplateId_5= ruleSimpleTemplateId ) ) ) ) )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1885:2: ( (kw= '::' )? (this_TypeName_1= ruleTypeName | (this_NestedNameSpecifier_2= ruleNestedNameSpecifier (this_TypeName_3= ruleTypeName | (kw= 'template' this_SimpleTemplateId_5= ruleSimpleTemplateId ) ) ) ) )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1885:3: (kw= '::' )? (this_TypeName_1= ruleTypeName | (this_NestedNameSpecifier_2= ruleNestedNameSpecifier (this_TypeName_3= ruleTypeName | (kw= 'template' this_SimpleTemplateId_5= ruleSimpleTemplateId ) ) ) )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1885:3: (kw= '::' )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==72) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1886:2: kw= '::'
                            {
                            kw=(Token)match(input,72,FOLLOW_72_in_ruleSimpleTypeSpecifier5333); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getSimpleTypeSpecifierAccess().getColonColonKeyword_0_0()); 
                                  
                            }

                            }
                            break;

                    }

                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1891:3: (this_TypeName_1= ruleTypeName | (this_NestedNameSpecifier_2= ruleNestedNameSpecifier (this_TypeName_3= ruleTypeName | (kw= 'template' this_SimpleTemplateId_5= ruleSimpleTemplateId ) ) ) )
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==RULE_ID) ) {
                        alt33=1;
                    }
                    else if ( (LA33_0==156) ) {
                        alt33=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 0, input);

                        throw nvae;
                    }
                    switch (alt33) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1892:5: this_TypeName_1= ruleTypeName
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getSimpleTypeSpecifierAccess().getTypeNameParserRuleCall_0_1_0()); 
                                  
                            }
                            pushFollow(FOLLOW_ruleTypeName_in_ruleSimpleTypeSpecifier5358);
                            this_TypeName_1=ruleTypeName();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_TypeName_1);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1903:6: (this_NestedNameSpecifier_2= ruleNestedNameSpecifier (this_TypeName_3= ruleTypeName | (kw= 'template' this_SimpleTemplateId_5= ruleSimpleTemplateId ) ) )
                            {
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1903:6: (this_NestedNameSpecifier_2= ruleNestedNameSpecifier (this_TypeName_3= ruleTypeName | (kw= 'template' this_SimpleTemplateId_5= ruleSimpleTemplateId ) ) )
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1904:5: this_NestedNameSpecifier_2= ruleNestedNameSpecifier (this_TypeName_3= ruleTypeName | (kw= 'template' this_SimpleTemplateId_5= ruleSimpleTemplateId ) )
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getSimpleTypeSpecifierAccess().getNestedNameSpecifierParserRuleCall_0_1_1_0()); 
                                  
                            }
                            pushFollow(FOLLOW_ruleNestedNameSpecifier_in_ruleSimpleTypeSpecifier5392);
                            this_NestedNameSpecifier_2=ruleNestedNameSpecifier();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_NestedNameSpecifier_2);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      afterParserOrEnumRuleCall();
                                  
                            }
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1914:1: (this_TypeName_3= ruleTypeName | (kw= 'template' this_SimpleTemplateId_5= ruleSimpleTemplateId ) )
                            int alt32=2;
                            int LA32_0 = input.LA(1);

                            if ( (LA32_0==RULE_ID) ) {
                                alt32=1;
                            }
                            else if ( (LA32_0==73) ) {
                                alt32=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 32, 0, input);

                                throw nvae;
                            }
                            switch (alt32) {
                                case 1 :
                                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1915:5: this_TypeName_3= ruleTypeName
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                              newCompositeNode(grammarAccess.getSimpleTypeSpecifierAccess().getTypeNameParserRuleCall_0_1_1_1_0()); 
                                          
                                    }
                                    pushFollow(FOLLOW_ruleTypeName_in_ruleSimpleTypeSpecifier5420);
                                    this_TypeName_3=ruleTypeName();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_TypeName_3);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                              afterParserOrEnumRuleCall();
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1926:6: (kw= 'template' this_SimpleTemplateId_5= ruleSimpleTemplateId )
                                    {
                                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1926:6: (kw= 'template' this_SimpleTemplateId_5= ruleSimpleTemplateId )
                                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1927:2: kw= 'template' this_SimpleTemplateId_5= ruleSimpleTemplateId
                                    {
                                    kw=(Token)match(input,73,FOLLOW_73_in_ruleSimpleTypeSpecifier5445); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                              current.merge(kw);
                                              newLeafNode(kw, grammarAccess.getSimpleTypeSpecifierAccess().getTemplateKeyword_0_1_1_1_1_0()); 
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                              newCompositeNode(grammarAccess.getSimpleTypeSpecifierAccess().getSimpleTemplateIdParserRuleCall_0_1_1_1_1_1()); 
                                          
                                    }
                                    pushFollow(FOLLOW_ruleSimpleTemplateId_in_ruleSimpleTypeSpecifier5467);
                                    this_SimpleTemplateId_5=ruleSimpleTemplateId();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_SimpleTemplateId_5);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                              afterParserOrEnumRuleCall();
                                          
                                    }

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
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1945:2: kw= 'char'
                    {
                    kw=(Token)match(input,74,FOLLOW_74_in_ruleSimpleTypeSpecifier5496); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSimpleTypeSpecifierAccess().getCharKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1952:2: kw= 'char16_t'
                    {
                    kw=(Token)match(input,75,FOLLOW_75_in_ruleSimpleTypeSpecifier5515); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSimpleTypeSpecifierAccess().getChar16_tKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1959:2: kw= 'char32_t'
                    {
                    kw=(Token)match(input,76,FOLLOW_76_in_ruleSimpleTypeSpecifier5534); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSimpleTypeSpecifierAccess().getChar32_tKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1966:2: kw= 'wchar_t'
                    {
                    kw=(Token)match(input,77,FOLLOW_77_in_ruleSimpleTypeSpecifier5553); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSimpleTypeSpecifierAccess().getWchar_tKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1973:2: kw= 'bool'
                    {
                    kw=(Token)match(input,78,FOLLOW_78_in_ruleSimpleTypeSpecifier5572); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSimpleTypeSpecifierAccess().getBoolKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1980:2: kw= 'short'
                    {
                    kw=(Token)match(input,79,FOLLOW_79_in_ruleSimpleTypeSpecifier5591); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSimpleTypeSpecifierAccess().getShortKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1987:2: kw= 'int'
                    {
                    kw=(Token)match(input,80,FOLLOW_80_in_ruleSimpleTypeSpecifier5610); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSimpleTypeSpecifierAccess().getIntKeyword_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1994:2: kw= 'long'
                    {
                    kw=(Token)match(input,81,FOLLOW_81_in_ruleSimpleTypeSpecifier5629); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSimpleTypeSpecifierAccess().getLongKeyword_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2001:2: kw= 'signed'
                    {
                    kw=(Token)match(input,82,FOLLOW_82_in_ruleSimpleTypeSpecifier5648); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSimpleTypeSpecifierAccess().getSignedKeyword_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2008:2: kw= 'unsigned'
                    {
                    kw=(Token)match(input,83,FOLLOW_83_in_ruleSimpleTypeSpecifier5667); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSimpleTypeSpecifierAccess().getUnsignedKeyword_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2015:2: kw= 'float'
                    {
                    kw=(Token)match(input,84,FOLLOW_84_in_ruleSimpleTypeSpecifier5686); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSimpleTypeSpecifierAccess().getFloatKeyword_11()); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2022:2: kw= 'double'
                    {
                    kw=(Token)match(input,85,FOLLOW_85_in_ruleSimpleTypeSpecifier5705); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSimpleTypeSpecifierAccess().getDoubleKeyword_12()); 
                          
                    }

                    }
                    break;
                case 14 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2029:2: kw= 'void'
                    {
                    kw=(Token)match(input,86,FOLLOW_86_in_ruleSimpleTypeSpecifier5724); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSimpleTypeSpecifierAccess().getVoidKeyword_13()); 
                          
                    }

                    }
                    break;
                case 15 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2036:2: kw= 'auto'
                    {
                    kw=(Token)match(input,87,FOLLOW_87_in_ruleSimpleTypeSpecifier5743); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSimpleTypeSpecifierAccess().getAutoKeyword_14()); 
                          
                    }

                    }
                    break;
                case 16 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2043:5: this_DeclarationTypeSpecifier_20= ruleDeclarationTypeSpecifier
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSimpleTypeSpecifierAccess().getDeclarationTypeSpecifierParserRuleCall_15()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDeclarationTypeSpecifier_in_ruleSimpleTypeSpecifier5771);
                    this_DeclarationTypeSpecifier_20=ruleDeclarationTypeSpecifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_DeclarationTypeSpecifier_20);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSimpleTypeSpecifier"


    // $ANTLR start "entryRuleTypeName"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2061:1: entryRuleTypeName returns [String current=null] : iv_ruleTypeName= ruleTypeName EOF ;
    public final String entryRuleTypeName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeName = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2062:2: (iv_ruleTypeName= ruleTypeName EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2063:2: iv_ruleTypeName= ruleTypeName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeNameRule()); 
            }
            pushFollow(FOLLOW_ruleTypeName_in_entryRuleTypeName5817);
            iv_ruleTypeName=ruleTypeName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeName5828); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2070:1: ruleTypeName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SimpleTemplateId_0= ruleSimpleTemplateId | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleTypeName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_1=null;
        AntlrDatatypeRuleToken this_SimpleTemplateId_0 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2073:28: ( (this_SimpleTemplateId_0= ruleSimpleTemplateId | this_ID_1= RULE_ID ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2074:1: (this_SimpleTemplateId_0= ruleSimpleTemplateId | this_ID_1= RULE_ID )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2074:1: (this_SimpleTemplateId_0= ruleSimpleTemplateId | this_ID_1= RULE_ID )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ID) ) {
                int LA35_1 = input.LA(2);

                if ( (LA35_1==109) ) {
                    alt35=1;
                }
                else if ( (LA35_1==EOF||LA35_1==RULE_ID||LA35_1==38||(LA35_1>=41 && LA35_1<=42)||LA35_1==46||(LA35_1>=60 && LA35_1<=72)||(LA35_1>=74 && LA35_1<=91)||LA35_1==93||(LA35_1>=99 && LA35_1<=101)||LA35_1==110||(LA35_1>=153 && LA35_1<=156)) ) {
                    alt35=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2075:5: this_SimpleTemplateId_0= ruleSimpleTemplateId
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeNameAccess().getSimpleTemplateIdParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSimpleTemplateId_in_ruleTypeName5875);
                    this_SimpleTemplateId_0=ruleSimpleTemplateId();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_SimpleTemplateId_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2086:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeName5901); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_1, grammarAccess.getTypeNameAccess().getIDTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTypeName"


    // $ANTLR start "entryRuleDeclarationTypeSpecifier"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2101:1: entryRuleDeclarationTypeSpecifier returns [String current=null] : iv_ruleDeclarationTypeSpecifier= ruleDeclarationTypeSpecifier EOF ;
    public final String entryRuleDeclarationTypeSpecifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDeclarationTypeSpecifier = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2102:2: (iv_ruleDeclarationTypeSpecifier= ruleDeclarationTypeSpecifier EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2103:2: iv_ruleDeclarationTypeSpecifier= ruleDeclarationTypeSpecifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclarationTypeSpecifierRule()); 
            }
            pushFollow(FOLLOW_ruleDeclarationTypeSpecifier_in_entryRuleDeclarationTypeSpecifier5947);
            iv_ruleDeclarationTypeSpecifier=ruleDeclarationTypeSpecifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclarationTypeSpecifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclarationTypeSpecifier5958); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2110:1: ruleDeclarationTypeSpecifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'decltype' kw= '(' this_Expression_2= ruleExpression kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleDeclarationTypeSpecifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Expression_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2113:28: ( (kw= 'decltype' kw= '(' this_Expression_2= ruleExpression kw= ')' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2114:1: (kw= 'decltype' kw= '(' this_Expression_2= ruleExpression kw= ')' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2114:1: (kw= 'decltype' kw= '(' this_Expression_2= ruleExpression kw= ')' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2115:2: kw= 'decltype' kw= '(' this_Expression_2= ruleExpression kw= ')'
            {
            kw=(Token)match(input,88,FOLLOW_88_in_ruleDeclarationTypeSpecifier5996); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getDeclarationTypeSpecifierAccess().getDecltypeKeyword_0()); 
                  
            }
            kw=(Token)match(input,45,FOLLOW_45_in_ruleDeclarationTypeSpecifier6009); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getDeclarationTypeSpecifierAccess().getLeftParenthesisKeyword_1()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDeclarationTypeSpecifierAccess().getExpressionParserRuleCall_2()); 
                  
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleDeclarationTypeSpecifier6031);
            this_Expression_2=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Expression_2);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            kw=(Token)match(input,46,FOLLOW_46_in_ruleDeclarationTypeSpecifier6049); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getDeclarationTypeSpecifierAccess().getRightParenthesisKeyword_3()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDeclarationTypeSpecifier"


    // $ANTLR start "entryRuleEnumSpecifier"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2153:1: entryRuleEnumSpecifier returns [String current=null] : iv_ruleEnumSpecifier= ruleEnumSpecifier EOF ;
    public final String entryRuleEnumSpecifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEnumSpecifier = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2154:2: (iv_ruleEnumSpecifier= ruleEnumSpecifier EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2155:2: iv_ruleEnumSpecifier= ruleEnumSpecifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumSpecifierRule()); 
            }
            pushFollow(FOLLOW_ruleEnumSpecifier_in_entryRuleEnumSpecifier6092);
            iv_ruleEnumSpecifier=ruleEnumSpecifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumSpecifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumSpecifier6103); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2162:1: ruleEnumSpecifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EnumHead_0= ruleEnumHead kw= '{' (this_EnumeratorList_2= ruleEnumeratorList (kw= ',' )? )? kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleEnumSpecifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_EnumHead_0 = null;

        AntlrDatatypeRuleToken this_EnumeratorList_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2165:28: ( (this_EnumHead_0= ruleEnumHead kw= '{' (this_EnumeratorList_2= ruleEnumeratorList (kw= ',' )? )? kw= '}' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2166:1: (this_EnumHead_0= ruleEnumHead kw= '{' (this_EnumeratorList_2= ruleEnumeratorList (kw= ',' )? )? kw= '}' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2166:1: (this_EnumHead_0= ruleEnumHead kw= '{' (this_EnumeratorList_2= ruleEnumeratorList (kw= ',' )? )? kw= '}' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2167:5: this_EnumHead_0= ruleEnumHead kw= '{' (this_EnumeratorList_2= ruleEnumeratorList (kw= ',' )? )? kw= '}'
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getEnumSpecifierAccess().getEnumHeadParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleEnumHead_in_ruleEnumSpecifier6150);
            this_EnumHead_0=ruleEnumHead();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_EnumHead_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            kw=(Token)match(input,42,FOLLOW_42_in_ruleEnumSpecifier6168); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getEnumSpecifierAccess().getLeftCurlyBracketKeyword_1()); 
                  
            }
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2183:1: (this_EnumeratorList_2= ruleEnumeratorList (kw= ',' )? )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2184:5: this_EnumeratorList_2= ruleEnumeratorList (kw= ',' )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEnumSpecifierAccess().getEnumeratorListParserRuleCall_2_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEnumeratorList_in_ruleEnumSpecifier6191);
                    this_EnumeratorList_2=ruleEnumeratorList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_EnumeratorList_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2194:1: (kw= ',' )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==60) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2195:2: kw= ','
                            {
                            kw=(Token)match(input,60,FOLLOW_60_in_ruleEnumSpecifier6210); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getEnumSpecifierAccess().getCommaKeyword_2_1()); 
                                  
                            }

                            }
                            break;

                    }


                    }
                    break;

            }

            kw=(Token)match(input,43,FOLLOW_43_in_ruleEnumSpecifier6227); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getEnumSpecifierAccess().getRightCurlyBracketKeyword_3()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleEnumSpecifier"


    // $ANTLR start "entryRuleEnumHead"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2214:1: entryRuleEnumHead returns [String current=null] : iv_ruleEnumHead= ruleEnumHead EOF ;
    public final String entryRuleEnumHead() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEnumHead = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2215:2: (iv_ruleEnumHead= ruleEnumHead EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2216:2: iv_ruleEnumHead= ruleEnumHead EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumHeadRule()); 
            }
            pushFollow(FOLLOW_ruleEnumHead_in_entryRuleEnumHead6268);
            iv_ruleEnumHead=ruleEnumHead();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumHead.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumHead6279); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2223:1: ruleEnumHead returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EnumKey_0= ruleEnumKey ( (this_ID_1= RULE_ID )? | (this_NestedNameSpecifier_2= ruleNestedNameSpecifier this_ID_3= RULE_ID ) ) (this_EnumBase_4= ruleEnumBase )? ) ;
    public final AntlrDatatypeRuleToken ruleEnumHead() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_1=null;
        Token this_ID_3=null;
        AntlrDatatypeRuleToken this_EnumKey_0 = null;

        AntlrDatatypeRuleToken this_NestedNameSpecifier_2 = null;

        AntlrDatatypeRuleToken this_EnumBase_4 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2226:28: ( (this_EnumKey_0= ruleEnumKey ( (this_ID_1= RULE_ID )? | (this_NestedNameSpecifier_2= ruleNestedNameSpecifier this_ID_3= RULE_ID ) ) (this_EnumBase_4= ruleEnumBase )? ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2227:1: (this_EnumKey_0= ruleEnumKey ( (this_ID_1= RULE_ID )? | (this_NestedNameSpecifier_2= ruleNestedNameSpecifier this_ID_3= RULE_ID ) ) (this_EnumBase_4= ruleEnumBase )? )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2227:1: (this_EnumKey_0= ruleEnumKey ( (this_ID_1= RULE_ID )? | (this_NestedNameSpecifier_2= ruleNestedNameSpecifier this_ID_3= RULE_ID ) ) (this_EnumBase_4= ruleEnumBase )? )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2228:5: this_EnumKey_0= ruleEnumKey ( (this_ID_1= RULE_ID )? | (this_NestedNameSpecifier_2= ruleNestedNameSpecifier this_ID_3= RULE_ID ) ) (this_EnumBase_4= ruleEnumBase )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getEnumHeadAccess().getEnumKeyParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleEnumKey_in_ruleEnumHead6326);
            this_EnumKey_0=ruleEnumKey();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_EnumKey_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2238:1: ( (this_ID_1= RULE_ID )? | (this_NestedNameSpecifier_2= ruleNestedNameSpecifier this_ID_3= RULE_ID ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==EOF||LA39_0==RULE_ID||LA39_0==38||LA39_0==42) ) {
                alt39=1;
            }
            else if ( (LA39_0==156) ) {
                alt39=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2238:2: (this_ID_1= RULE_ID )?
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2238:2: (this_ID_1= RULE_ID )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==RULE_ID) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2238:7: this_ID_1= RULE_ID
                            {
                            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumHead6348); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_ID_1);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_ID_1, grammarAccess.getEnumHeadAccess().getIDTerminalRuleCall_1_0()); 
                                  
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2246:6: (this_NestedNameSpecifier_2= ruleNestedNameSpecifier this_ID_3= RULE_ID )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2246:6: (this_NestedNameSpecifier_2= ruleNestedNameSpecifier this_ID_3= RULE_ID )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2247:5: this_NestedNameSpecifier_2= ruleNestedNameSpecifier this_ID_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEnumHeadAccess().getNestedNameSpecifierParserRuleCall_1_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNestedNameSpecifier_in_ruleEnumHead6384);
                    this_NestedNameSpecifier_2=ruleNestedNameSpecifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NestedNameSpecifier_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumHead6404); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_3, grammarAccess.getEnumHeadAccess().getIDTerminalRuleCall_1_1_1()); 
                          
                    }

                    }


                    }
                    break;

            }

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2264:3: (this_EnumBase_4= ruleEnumBase )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==38) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2265:5: this_EnumBase_4= ruleEnumBase
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEnumHeadAccess().getEnumBaseParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEnumBase_in_ruleEnumHead6434);
                    this_EnumBase_4=ruleEnumBase();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_EnumBase_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleEnumHead"


    // $ANTLR start "entryRuleEnumKey"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2283:1: entryRuleEnumKey returns [String current=null] : iv_ruleEnumKey= ruleEnumKey EOF ;
    public final String entryRuleEnumKey() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEnumKey = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2284:2: (iv_ruleEnumKey= ruleEnumKey EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2285:2: iv_ruleEnumKey= ruleEnumKey EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumKeyRule()); 
            }
            pushFollow(FOLLOW_ruleEnumKey_in_entryRuleEnumKey6482);
            iv_ruleEnumKey=ruleEnumKey();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumKey.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumKey6493); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2292:1: ruleEnumKey returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'enum' | (kw= 'enum' kw= 'class' ) | (kw= 'enum' kw= 'struct' ) ) ;
    public final AntlrDatatypeRuleToken ruleEnumKey() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2295:28: ( (kw= 'enum' | (kw= 'enum' kw= 'class' ) | (kw= 'enum' kw= 'struct' ) ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2296:1: (kw= 'enum' | (kw= 'enum' kw= 'class' ) | (kw= 'enum' kw= 'struct' ) )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2296:1: (kw= 'enum' | (kw= 'enum' kw= 'class' ) | (kw= 'enum' kw= 'struct' ) )
            int alt41=3;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==89) ) {
                switch ( input.LA(2) ) {
                case 91:
                    {
                    alt41=3;
                    }
                    break;
                case EOF:
                case RULE_ID:
                case 38:
                case 42:
                case 156:
                    {
                    alt41=1;
                    }
                    break;
                case 90:
                    {
                    alt41=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2297:2: kw= 'enum'
                    {
                    kw=(Token)match(input,89,FOLLOW_89_in_ruleEnumKey6531); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEnumKeyAccess().getEnumKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2303:6: (kw= 'enum' kw= 'class' )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2303:6: (kw= 'enum' kw= 'class' )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2304:2: kw= 'enum' kw= 'class'
                    {
                    kw=(Token)match(input,89,FOLLOW_89_in_ruleEnumKey6551); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEnumKeyAccess().getEnumKeyword_1_0()); 
                          
                    }
                    kw=(Token)match(input,90,FOLLOW_90_in_ruleEnumKey6564); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEnumKeyAccess().getClassKeyword_1_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2316:6: (kw= 'enum' kw= 'struct' )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2316:6: (kw= 'enum' kw= 'struct' )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2317:2: kw= 'enum' kw= 'struct'
                    {
                    kw=(Token)match(input,89,FOLLOW_89_in_ruleEnumKey6585); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEnumKeyAccess().getEnumKeyword_2_0()); 
                          
                    }
                    kw=(Token)match(input,91,FOLLOW_91_in_ruleEnumKey6598); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEnumKeyAccess().getStructKeyword_2_1()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleEnumKey"


    // $ANTLR start "entryRuleEnumBase"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2336:1: entryRuleEnumBase returns [String current=null] : iv_ruleEnumBase= ruleEnumBase EOF ;
    public final String entryRuleEnumBase() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEnumBase = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2337:2: (iv_ruleEnumBase= ruleEnumBase EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2338:2: iv_ruleEnumBase= ruleEnumBase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumBaseRule()); 
            }
            pushFollow(FOLLOW_ruleEnumBase_in_entryRuleEnumBase6640);
            iv_ruleEnumBase=ruleEnumBase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumBase.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumBase6651); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2345:1: ruleEnumBase returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= ':' (this_TypeSpecifier_1= ruleTypeSpecifier )+ ) ;
    public final AntlrDatatypeRuleToken ruleEnumBase() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_TypeSpecifier_1 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2348:28: ( (kw= ':' (this_TypeSpecifier_1= ruleTypeSpecifier )+ ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2349:1: (kw= ':' (this_TypeSpecifier_1= ruleTypeSpecifier )+ )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2349:1: (kw= ':' (this_TypeSpecifier_1= ruleTypeSpecifier )+ )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2350:2: kw= ':' (this_TypeSpecifier_1= ruleTypeSpecifier )+
            {
            kw=(Token)match(input,38,FOLLOW_38_in_ruleEnumBase6689); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getEnumBaseAccess().getColonKeyword_0()); 
                  
            }
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2355:1: (this_TypeSpecifier_1= ruleTypeSpecifier )+
            int cnt42=0;
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_ID||LA42_0==72||(LA42_0>=74 && LA42_0<=91)||LA42_0==93||LA42_0==101||LA42_0==153||LA42_0==156) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2356:5: this_TypeSpecifier_1= ruleTypeSpecifier
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getEnumBaseAccess().getTypeSpecifierParserRuleCall_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleTypeSpecifier_in_ruleEnumBase6712);
            	    this_TypeSpecifier_1=ruleTypeSpecifier();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_TypeSpecifier_1);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt42 >= 1 ) break loop42;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(42, input);
                        throw eee;
                }
                cnt42++;
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleEnumBase"


    // $ANTLR start "entryRuleEnumeratorList"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2374:1: entryRuleEnumeratorList returns [String current=null] : iv_ruleEnumeratorList= ruleEnumeratorList EOF ;
    public final String entryRuleEnumeratorList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEnumeratorList = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2375:2: (iv_ruleEnumeratorList= ruleEnumeratorList EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2376:2: iv_ruleEnumeratorList= ruleEnumeratorList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumeratorListRule()); 
            }
            pushFollow(FOLLOW_ruleEnumeratorList_in_entryRuleEnumeratorList6760);
            iv_ruleEnumeratorList=ruleEnumeratorList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumeratorList.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumeratorList6771); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2383:1: ruleEnumeratorList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EnumerationDefinition_0= ruleEnumerationDefinition (kw= ',' this_EnumerationDefinition_2= ruleEnumerationDefinition )* ) ;
    public final AntlrDatatypeRuleToken ruleEnumeratorList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_EnumerationDefinition_0 = null;

        AntlrDatatypeRuleToken this_EnumerationDefinition_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2386:28: ( (this_EnumerationDefinition_0= ruleEnumerationDefinition (kw= ',' this_EnumerationDefinition_2= ruleEnumerationDefinition )* ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2387:1: (this_EnumerationDefinition_0= ruleEnumerationDefinition (kw= ',' this_EnumerationDefinition_2= ruleEnumerationDefinition )* )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2387:1: (this_EnumerationDefinition_0= ruleEnumerationDefinition (kw= ',' this_EnumerationDefinition_2= ruleEnumerationDefinition )* )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2388:5: this_EnumerationDefinition_0= ruleEnumerationDefinition (kw= ',' this_EnumerationDefinition_2= ruleEnumerationDefinition )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getEnumeratorListAccess().getEnumerationDefinitionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleEnumerationDefinition_in_ruleEnumeratorList6818);
            this_EnumerationDefinition_0=ruleEnumerationDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_EnumerationDefinition_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2398:1: (kw= ',' this_EnumerationDefinition_2= ruleEnumerationDefinition )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==60) ) {
                    int LA43_1 = input.LA(2);

                    if ( (LA43_1==RULE_ID) ) {
                        alt43=1;
                    }


                }


                switch (alt43) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2399:2: kw= ',' this_EnumerationDefinition_2= ruleEnumerationDefinition
            	    {
            	    kw=(Token)match(input,60,FOLLOW_60_in_ruleEnumeratorList6837); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getEnumeratorListAccess().getCommaKeyword_1_0()); 
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getEnumeratorListAccess().getEnumerationDefinitionParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleEnumerationDefinition_in_ruleEnumeratorList6859);
            	    this_EnumerationDefinition_2=ruleEnumerationDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_EnumerationDefinition_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleEnumeratorList"


    // $ANTLR start "entryRuleEnumerationDefinition"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2423:1: entryRuleEnumerationDefinition returns [String current=null] : iv_ruleEnumerationDefinition= ruleEnumerationDefinition EOF ;
    public final String entryRuleEnumerationDefinition() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEnumerationDefinition = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2424:2: (iv_ruleEnumerationDefinition= ruleEnumerationDefinition EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2425:2: iv_ruleEnumerationDefinition= ruleEnumerationDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumerationDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleEnumerationDefinition_in_entryRuleEnumerationDefinition6907);
            iv_ruleEnumerationDefinition=ruleEnumerationDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumerationDefinition.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumerationDefinition6918); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2432:1: ruleEnumerationDefinition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Enumerator_0= ruleEnumerator (kw= '=' this_ConstantExpression_2= ruleConstantExpression )? ) ;
    public final AntlrDatatypeRuleToken ruleEnumerationDefinition() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Enumerator_0 = null;

        AntlrDatatypeRuleToken this_ConstantExpression_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2435:28: ( (this_Enumerator_0= ruleEnumerator (kw= '=' this_ConstantExpression_2= ruleConstantExpression )? ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2436:1: (this_Enumerator_0= ruleEnumerator (kw= '=' this_ConstantExpression_2= ruleConstantExpression )? )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2436:1: (this_Enumerator_0= ruleEnumerator (kw= '=' this_ConstantExpression_2= ruleConstantExpression )? )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2437:5: this_Enumerator_0= ruleEnumerator (kw= '=' this_ConstantExpression_2= ruleConstantExpression )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getEnumerationDefinitionAccess().getEnumeratorParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleEnumerator_in_ruleEnumerationDefinition6965);
            this_Enumerator_0=ruleEnumerator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Enumerator_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2447:1: (kw= '=' this_ConstantExpression_2= ruleConstantExpression )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==49) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2448:2: kw= '=' this_ConstantExpression_2= ruleConstantExpression
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleEnumerationDefinition6984); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEnumerationDefinitionAccess().getEqualsSignKeyword_1_0()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEnumerationDefinitionAccess().getConstantExpressionParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleConstantExpression_in_ruleEnumerationDefinition7006);
                    this_ConstantExpression_2=ruleConstantExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ConstantExpression_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleEnumerationDefinition"


    // $ANTLR start "entryRuleEnumerator"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2472:1: entryRuleEnumerator returns [String current=null] : iv_ruleEnumerator= ruleEnumerator EOF ;
    public final String entryRuleEnumerator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEnumerator = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2473:2: (iv_ruleEnumerator= ruleEnumerator EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2474:2: iv_ruleEnumerator= ruleEnumerator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumeratorRule()); 
            }
            pushFollow(FOLLOW_ruleEnumerator_in_entryRuleEnumerator7054);
            iv_ruleEnumerator=ruleEnumerator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumerator.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumerator7065); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2481:1: ruleEnumerator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleEnumerator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2484:28: (this_ID_0= RULE_ID )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2485:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumerator7104); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getEnumeratorAccess().getIDTerminalRuleCall()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleEnumerator"


    // $ANTLR start "entryRuleNamespaceDefinition"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2500:1: entryRuleNamespaceDefinition returns [String current=null] : iv_ruleNamespaceDefinition= ruleNamespaceDefinition EOF ;
    public final String entryRuleNamespaceDefinition() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNamespaceDefinition = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2501:2: (iv_ruleNamespaceDefinition= ruleNamespaceDefinition EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2502:2: iv_ruleNamespaceDefinition= ruleNamespaceDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNamespaceDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleNamespaceDefinition_in_entryRuleNamespaceDefinition7149);
            iv_ruleNamespaceDefinition=ruleNamespaceDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNamespaceDefinition.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamespaceDefinition7160); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2509:1: ruleNamespaceDefinition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'inline' )? kw= 'namespace' (this_ID_2= RULE_ID )? kw= '{' (this_Declaration_4= ruleDeclaration )* kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleNamespaceDefinition() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;
        AntlrDatatypeRuleToken this_Declaration_4 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2512:28: ( ( (kw= 'inline' )? kw= 'namespace' (this_ID_2= RULE_ID )? kw= '{' (this_Declaration_4= ruleDeclaration )* kw= '}' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2513:1: ( (kw= 'inline' )? kw= 'namespace' (this_ID_2= RULE_ID )? kw= '{' (this_Declaration_4= ruleDeclaration )* kw= '}' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2513:1: ( (kw= 'inline' )? kw= 'namespace' (this_ID_2= RULE_ID )? kw= '{' (this_Declaration_4= ruleDeclaration )* kw= '}' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2513:2: (kw= 'inline' )? kw= 'namespace' (this_ID_2= RULE_ID )? kw= '{' (this_Declaration_4= ruleDeclaration )* kw= '}'
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2513:2: (kw= 'inline' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==69) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2514:2: kw= 'inline'
                    {
                    kw=(Token)match(input,69,FOLLOW_69_in_ruleNamespaceDefinition7199); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNamespaceDefinitionAccess().getInlineKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            kw=(Token)match(input,92,FOLLOW_92_in_ruleNamespaceDefinition7214); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getNamespaceDefinitionAccess().getNamespaceKeyword_1()); 
                  
            }
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2525:1: (this_ID_2= RULE_ID )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_ID) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2525:6: this_ID_2= RULE_ID
                    {
                    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNamespaceDefinition7230); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_2, grammarAccess.getNamespaceDefinitionAccess().getIDTerminalRuleCall_2()); 
                          
                    }

                    }
                    break;

            }

            kw=(Token)match(input,42,FOLLOW_42_in_ruleNamespaceDefinition7250); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getNamespaceDefinitionAccess().getLeftCurlyBracketKeyword_3()); 
                  
            }
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2538:1: (this_Declaration_4= ruleDeclaration )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==RULE_ID||LA47_0==41||LA47_0==57||LA47_0==59||(LA47_0>=61 && LA47_0<=72)||(LA47_0>=73 && LA47_0<=94)||LA47_0==99||LA47_0==101||(LA47_0>=151 && LA47_0<=153)||(LA47_0>=155 && LA47_0<=156)) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2539:5: this_Declaration_4= ruleDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getNamespaceDefinitionAccess().getDeclarationParserRuleCall_4()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleDeclaration_in_ruleNamespaceDefinition7273);
            	    this_Declaration_4=ruleDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_Declaration_4);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            kw=(Token)match(input,43,FOLLOW_43_in_ruleNamespaceDefinition7293); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getNamespaceDefinitionAccess().getRightCurlyBracketKeyword_5()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNamespaceDefinition"


    // $ANTLR start "entryRuleNamespaceAliasDefinition"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2563:1: entryRuleNamespaceAliasDefinition returns [String current=null] : iv_ruleNamespaceAliasDefinition= ruleNamespaceAliasDefinition EOF ;
    public final String entryRuleNamespaceAliasDefinition() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNamespaceAliasDefinition = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2564:2: (iv_ruleNamespaceAliasDefinition= ruleNamespaceAliasDefinition EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2565:2: iv_ruleNamespaceAliasDefinition= ruleNamespaceAliasDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNamespaceAliasDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleNamespaceAliasDefinition_in_entryRuleNamespaceAliasDefinition7334);
            iv_ruleNamespaceAliasDefinition=ruleNamespaceAliasDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNamespaceAliasDefinition.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamespaceAliasDefinition7345); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2572:1: ruleNamespaceAliasDefinition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'namespace' this_ID_1= RULE_ID kw= '=' this_QualifiedNamespaceSpecifier_3= ruleQualifiedNamespaceSpecifier kw= ';' ) ;
    public final AntlrDatatypeRuleToken ruleNamespaceAliasDefinition() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        AntlrDatatypeRuleToken this_QualifiedNamespaceSpecifier_3 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2575:28: ( (kw= 'namespace' this_ID_1= RULE_ID kw= '=' this_QualifiedNamespaceSpecifier_3= ruleQualifiedNamespaceSpecifier kw= ';' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2576:1: (kw= 'namespace' this_ID_1= RULE_ID kw= '=' this_QualifiedNamespaceSpecifier_3= ruleQualifiedNamespaceSpecifier kw= ';' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2576:1: (kw= 'namespace' this_ID_1= RULE_ID kw= '=' this_QualifiedNamespaceSpecifier_3= ruleQualifiedNamespaceSpecifier kw= ';' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2577:2: kw= 'namespace' this_ID_1= RULE_ID kw= '=' this_QualifiedNamespaceSpecifier_3= ruleQualifiedNamespaceSpecifier kw= ';'
            {
            kw=(Token)match(input,92,FOLLOW_92_in_ruleNamespaceAliasDefinition7383); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getNamespaceAliasDefinitionAccess().getNamespaceKeyword_0()); 
                  
            }
            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNamespaceAliasDefinition7398); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_1, grammarAccess.getNamespaceAliasDefinitionAccess().getIDTerminalRuleCall_1()); 
                  
            }
            kw=(Token)match(input,49,FOLLOW_49_in_ruleNamespaceAliasDefinition7416); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getNamespaceAliasDefinitionAccess().getEqualsSignKeyword_2()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNamespaceAliasDefinitionAccess().getQualifiedNamespaceSpecifierParserRuleCall_3()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedNamespaceSpecifier_in_ruleNamespaceAliasDefinition7438);
            this_QualifiedNamespaceSpecifier_3=ruleQualifiedNamespaceSpecifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedNamespaceSpecifier_3);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            kw=(Token)match(input,41,FOLLOW_41_in_ruleNamespaceAliasDefinition7456); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getNamespaceAliasDefinitionAccess().getSemicolonKeyword_4()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNamespaceAliasDefinition"


    // $ANTLR start "entryRuleQualifiedNamespaceSpecifier"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2620:1: entryRuleQualifiedNamespaceSpecifier returns [String current=null] : iv_ruleQualifiedNamespaceSpecifier= ruleQualifiedNamespaceSpecifier EOF ;
    public final String entryRuleQualifiedNamespaceSpecifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNamespaceSpecifier = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2621:2: (iv_ruleQualifiedNamespaceSpecifier= ruleQualifiedNamespaceSpecifier EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2622:2: iv_ruleQualifiedNamespaceSpecifier= ruleQualifiedNamespaceSpecifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNamespaceSpecifierRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNamespaceSpecifier_in_entryRuleQualifiedNamespaceSpecifier7497);
            iv_ruleQualifiedNamespaceSpecifier=ruleQualifiedNamespaceSpecifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNamespaceSpecifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNamespaceSpecifier7508); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2629:1: ruleQualifiedNamespaceSpecifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '::' )? (this_NestedNameSpecifier_1= ruleNestedNameSpecifier )? this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNamespaceSpecifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;
        AntlrDatatypeRuleToken this_NestedNameSpecifier_1 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2632:28: ( ( (kw= '::' )? (this_NestedNameSpecifier_1= ruleNestedNameSpecifier )? this_ID_2= RULE_ID ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2633:1: ( (kw= '::' )? (this_NestedNameSpecifier_1= ruleNestedNameSpecifier )? this_ID_2= RULE_ID )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2633:1: ( (kw= '::' )? (this_NestedNameSpecifier_1= ruleNestedNameSpecifier )? this_ID_2= RULE_ID )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2633:2: (kw= '::' )? (this_NestedNameSpecifier_1= ruleNestedNameSpecifier )? this_ID_2= RULE_ID
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2633:2: (kw= '::' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==72) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2634:2: kw= '::'
                    {
                    kw=(Token)match(input,72,FOLLOW_72_in_ruleQualifiedNamespaceSpecifier7547); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNamespaceSpecifierAccess().getColonColonKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2639:3: (this_NestedNameSpecifier_1= ruleNestedNameSpecifier )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==156) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2640:5: this_NestedNameSpecifier_1= ruleNestedNameSpecifier
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQualifiedNamespaceSpecifierAccess().getNestedNameSpecifierParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNestedNameSpecifier_in_ruleQualifiedNamespaceSpecifier7572);
                    this_NestedNameSpecifier_1=ruleNestedNameSpecifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NestedNameSpecifier_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }

            this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedNamespaceSpecifier7594); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_2);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_2, grammarAccess.getQualifiedNamespaceSpecifierAccess().getIDTerminalRuleCall_2()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleQualifiedNamespaceSpecifier"


    // $ANTLR start "entryRuleUsingDeclaration"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2665:1: entryRuleUsingDeclaration returns [String current=null] : iv_ruleUsingDeclaration= ruleUsingDeclaration EOF ;
    public final String entryRuleUsingDeclaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUsingDeclaration = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2666:2: (iv_ruleUsingDeclaration= ruleUsingDeclaration EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2667:2: iv_ruleUsingDeclaration= ruleUsingDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUsingDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleUsingDeclaration_in_entryRuleUsingDeclaration7640);
            iv_ruleUsingDeclaration=ruleUsingDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUsingDeclaration.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUsingDeclaration7651); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2674:1: ruleUsingDeclaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'using' (kw= '::' | ( (kw= 'typename' )? (kw= '::' )? this_NestedNameSpecifier_4= ruleNestedNameSpecifier ) ) this_UnqualifiedId_5= ruleUnqualifiedId kw= ';' ) ;
    public final AntlrDatatypeRuleToken ruleUsingDeclaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_NestedNameSpecifier_4 = null;

        AntlrDatatypeRuleToken this_UnqualifiedId_5 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2677:28: ( (kw= 'using' (kw= '::' | ( (kw= 'typename' )? (kw= '::' )? this_NestedNameSpecifier_4= ruleNestedNameSpecifier ) ) this_UnqualifiedId_5= ruleUnqualifiedId kw= ';' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2678:1: (kw= 'using' (kw= '::' | ( (kw= 'typename' )? (kw= '::' )? this_NestedNameSpecifier_4= ruleNestedNameSpecifier ) ) this_UnqualifiedId_5= ruleUnqualifiedId kw= ';' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2678:1: (kw= 'using' (kw= '::' | ( (kw= 'typename' )? (kw= '::' )? this_NestedNameSpecifier_4= ruleNestedNameSpecifier ) ) this_UnqualifiedId_5= ruleUnqualifiedId kw= ';' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2679:2: kw= 'using' (kw= '::' | ( (kw= 'typename' )? (kw= '::' )? this_NestedNameSpecifier_4= ruleNestedNameSpecifier ) ) this_UnqualifiedId_5= ruleUnqualifiedId kw= ';'
            {
            kw=(Token)match(input,57,FOLLOW_57_in_ruleUsingDeclaration7689); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getUsingDeclarationAccess().getUsingKeyword_0()); 
                  
            }
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2684:1: (kw= '::' | ( (kw= 'typename' )? (kw= '::' )? this_NestedNameSpecifier_4= ruleNestedNameSpecifier ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==72) ) {
                int LA52_1 = input.LA(2);

                if ( (LA52_1==156) ) {
                    alt52=2;
                }
                else if ( (LA52_1==160) ) {
                    alt52=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 52, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA52_0==93||LA52_0==156) ) {
                alt52=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2685:2: kw= '::'
                    {
                    kw=(Token)match(input,72,FOLLOW_72_in_ruleUsingDeclaration7703); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getUsingDeclarationAccess().getColonColonKeyword_1_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2691:6: ( (kw= 'typename' )? (kw= '::' )? this_NestedNameSpecifier_4= ruleNestedNameSpecifier )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2691:6: ( (kw= 'typename' )? (kw= '::' )? this_NestedNameSpecifier_4= ruleNestedNameSpecifier )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2691:7: (kw= 'typename' )? (kw= '::' )? this_NestedNameSpecifier_4= ruleNestedNameSpecifier
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2691:7: (kw= 'typename' )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==93) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2692:2: kw= 'typename'
                            {
                            kw=(Token)match(input,93,FOLLOW_93_in_ruleUsingDeclaration7724); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getUsingDeclarationAccess().getTypenameKeyword_1_1_0()); 
                                  
                            }

                            }
                            break;

                    }

                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2697:3: (kw= '::' )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==72) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2698:2: kw= '::'
                            {
                            kw=(Token)match(input,72,FOLLOW_72_in_ruleUsingDeclaration7740); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getUsingDeclarationAccess().getColonColonKeyword_1_1_1()); 
                                  
                            }

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUsingDeclarationAccess().getNestedNameSpecifierParserRuleCall_1_1_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNestedNameSpecifier_in_ruleUsingDeclaration7764);
                    this_NestedNameSpecifier_4=ruleNestedNameSpecifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NestedNameSpecifier_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getUsingDeclarationAccess().getUnqualifiedIdParserRuleCall_2()); 
                  
            }
            pushFollow(FOLLOW_ruleUnqualifiedId_in_ruleUsingDeclaration7793);
            this_UnqualifiedId_5=ruleUnqualifiedId();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_UnqualifiedId_5);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            kw=(Token)match(input,41,FOLLOW_41_in_ruleUsingDeclaration7811); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getUsingDeclarationAccess().getSemicolonKeyword_3()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleUsingDeclaration"


    // $ANTLR start "entryRuleAsmDefinition"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2741:1: entryRuleAsmDefinition returns [String current=null] : iv_ruleAsmDefinition= ruleAsmDefinition EOF ;
    public final String entryRuleAsmDefinition() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAsmDefinition = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2742:2: (iv_ruleAsmDefinition= ruleAsmDefinition EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2743:2: iv_ruleAsmDefinition= ruleAsmDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAsmDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleAsmDefinition_in_entryRuleAsmDefinition7854);
            iv_ruleAsmDefinition=ruleAsmDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAsmDefinition.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAsmDefinition7865); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2750:1: ruleAsmDefinition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'asm' kw= '(' this_STRING_LITERAL_2= RULE_STRING_LITERAL kw= ')' kw= ';' ) ;
    public final AntlrDatatypeRuleToken ruleAsmDefinition() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_STRING_LITERAL_2=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2753:28: ( (kw= 'asm' kw= '(' this_STRING_LITERAL_2= RULE_STRING_LITERAL kw= ')' kw= ';' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2754:1: (kw= 'asm' kw= '(' this_STRING_LITERAL_2= RULE_STRING_LITERAL kw= ')' kw= ';' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2754:1: (kw= 'asm' kw= '(' this_STRING_LITERAL_2= RULE_STRING_LITERAL kw= ')' kw= ';' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2755:2: kw= 'asm' kw= '(' this_STRING_LITERAL_2= RULE_STRING_LITERAL kw= ')' kw= ';'
            {
            kw=(Token)match(input,94,FOLLOW_94_in_ruleAsmDefinition7903); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getAsmDefinitionAccess().getAsmKeyword_0()); 
                  
            }
            kw=(Token)match(input,45,FOLLOW_45_in_ruleAsmDefinition7916); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getAsmDefinitionAccess().getLeftParenthesisKeyword_1()); 
                  
            }
            this_STRING_LITERAL_2=(Token)match(input,RULE_STRING_LITERAL,FOLLOW_RULE_STRING_LITERAL_in_ruleAsmDefinition7931); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_STRING_LITERAL_2);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_STRING_LITERAL_2, grammarAccess.getAsmDefinitionAccess().getSTRING_LITERALTerminalRuleCall_2()); 
                  
            }
            kw=(Token)match(input,46,FOLLOW_46_in_ruleAsmDefinition7949); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getAsmDefinitionAccess().getRightParenthesisKeyword_3()); 
                  
            }
            kw=(Token)match(input,41,FOLLOW_41_in_ruleAsmDefinition7962); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getAsmDefinitionAccess().getSemicolonKeyword_4()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAsmDefinition"


    // $ANTLR start "entryRuleLinkageSpecification"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2793:1: entryRuleLinkageSpecification returns [String current=null] : iv_ruleLinkageSpecification= ruleLinkageSpecification EOF ;
    public final String entryRuleLinkageSpecification() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLinkageSpecification = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2794:2: (iv_ruleLinkageSpecification= ruleLinkageSpecification EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2795:2: iv_ruleLinkageSpecification= ruleLinkageSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLinkageSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleLinkageSpecification_in_entryRuleLinkageSpecification8003);
            iv_ruleLinkageSpecification=ruleLinkageSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLinkageSpecification.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLinkageSpecification8014); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2802:1: ruleLinkageSpecification returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'extern' this_STRING_LITERAL_1= RULE_STRING_LITERAL (this_Declaration_2= ruleDeclaration | (kw= '{' (this_Declaration_4= ruleDeclaration )* kw= '}' ) ) ) ;
    public final AntlrDatatypeRuleToken ruleLinkageSpecification() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_STRING_LITERAL_1=null;
        AntlrDatatypeRuleToken this_Declaration_2 = null;

        AntlrDatatypeRuleToken this_Declaration_4 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2805:28: ( (kw= 'extern' this_STRING_LITERAL_1= RULE_STRING_LITERAL (this_Declaration_2= ruleDeclaration | (kw= '{' (this_Declaration_4= ruleDeclaration )* kw= '}' ) ) ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2806:1: (kw= 'extern' this_STRING_LITERAL_1= RULE_STRING_LITERAL (this_Declaration_2= ruleDeclaration | (kw= '{' (this_Declaration_4= ruleDeclaration )* kw= '}' ) ) )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2806:1: (kw= 'extern' this_STRING_LITERAL_1= RULE_STRING_LITERAL (this_Declaration_2= ruleDeclaration | (kw= '{' (this_Declaration_4= ruleDeclaration )* kw= '}' ) ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2807:2: kw= 'extern' this_STRING_LITERAL_1= RULE_STRING_LITERAL (this_Declaration_2= ruleDeclaration | (kw= '{' (this_Declaration_4= ruleDeclaration )* kw= '}' ) )
            {
            kw=(Token)match(input,67,FOLLOW_67_in_ruleLinkageSpecification8052); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getLinkageSpecificationAccess().getExternKeyword_0()); 
                  
            }
            this_STRING_LITERAL_1=(Token)match(input,RULE_STRING_LITERAL,FOLLOW_RULE_STRING_LITERAL_in_ruleLinkageSpecification8067); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_STRING_LITERAL_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_STRING_LITERAL_1, grammarAccess.getLinkageSpecificationAccess().getSTRING_LITERALTerminalRuleCall_1()); 
                  
            }
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2819:1: (this_Declaration_2= ruleDeclaration | (kw= '{' (this_Declaration_4= ruleDeclaration )* kw= '}' ) )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_ID||LA54_0==41||LA54_0==57||LA54_0==59||(LA54_0>=61 && LA54_0<=72)||(LA54_0>=73 && LA54_0<=94)||LA54_0==99||LA54_0==101||(LA54_0>=151 && LA54_0<=153)||(LA54_0>=155 && LA54_0<=156)) ) {
                alt54=1;
            }
            else if ( (LA54_0==42) ) {
                alt54=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2820:5: this_Declaration_2= ruleDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLinkageSpecificationAccess().getDeclarationParserRuleCall_2_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDeclaration_in_ruleLinkageSpecification8095);
                    this_Declaration_2=ruleDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Declaration_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2831:6: (kw= '{' (this_Declaration_4= ruleDeclaration )* kw= '}' )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2831:6: (kw= '{' (this_Declaration_4= ruleDeclaration )* kw= '}' )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2832:2: kw= '{' (this_Declaration_4= ruleDeclaration )* kw= '}'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleLinkageSpecification8120); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getLinkageSpecificationAccess().getLeftCurlyBracketKeyword_2_1_0()); 
                          
                    }
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2837:1: (this_Declaration_4= ruleDeclaration )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==RULE_ID||LA53_0==41||LA53_0==57||LA53_0==59||(LA53_0>=61 && LA53_0<=72)||(LA53_0>=73 && LA53_0<=94)||LA53_0==99||LA53_0==101||(LA53_0>=151 && LA53_0<=153)||(LA53_0>=155 && LA53_0<=156)) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2838:5: this_Declaration_4= ruleDeclaration
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getLinkageSpecificationAccess().getDeclarationParserRuleCall_2_1_1()); 
                    	          
                    	    }
                    	    pushFollow(FOLLOW_ruleDeclaration_in_ruleLinkageSpecification8143);
                    	    this_Declaration_4=ruleDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		current.merge(this_Declaration_4);
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              afterParserOrEnumRuleCall();
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop53;
                        }
                    } while (true);

                    kw=(Token)match(input,43,FOLLOW_43_in_ruleLinkageSpecification8163); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getLinkageSpecificationAccess().getRightCurlyBracketKeyword_2_1_2()); 
                          
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleLinkageSpecification"


    // $ANTLR start "entryRuleInitDeclaratorList"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2862:1: entryRuleInitDeclaratorList returns [String current=null] : iv_ruleInitDeclaratorList= ruleInitDeclaratorList EOF ;
    public final String entryRuleInitDeclaratorList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInitDeclaratorList = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2863:2: (iv_ruleInitDeclaratorList= ruleInitDeclaratorList EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2864:2: iv_ruleInitDeclaratorList= ruleInitDeclaratorList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInitDeclaratorListRule()); 
            }
            pushFollow(FOLLOW_ruleInitDeclaratorList_in_entryRuleInitDeclaratorList8206);
            iv_ruleInitDeclaratorList=ruleInitDeclaratorList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInitDeclaratorList.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInitDeclaratorList8217); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2871:1: ruleInitDeclaratorList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_InitDeclarator_0= ruleInitDeclarator (kw= ',' this_InitDeclarator_2= ruleInitDeclarator )* ) ;
    public final AntlrDatatypeRuleToken ruleInitDeclaratorList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_InitDeclarator_0 = null;

        AntlrDatatypeRuleToken this_InitDeclarator_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2874:28: ( (this_InitDeclarator_0= ruleInitDeclarator (kw= ',' this_InitDeclarator_2= ruleInitDeclarator )* ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2875:1: (this_InitDeclarator_0= ruleInitDeclarator (kw= ',' this_InitDeclarator_2= ruleInitDeclarator )* )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2875:1: (this_InitDeclarator_0= ruleInitDeclarator (kw= ',' this_InitDeclarator_2= ruleInitDeclarator )* )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2876:5: this_InitDeclarator_0= ruleInitDeclarator (kw= ',' this_InitDeclarator_2= ruleInitDeclarator )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getInitDeclaratorListAccess().getInitDeclaratorParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleInitDeclarator_in_ruleInitDeclaratorList8264);
            this_InitDeclarator_0=ruleInitDeclarator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_InitDeclarator_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2886:1: (kw= ',' this_InitDeclarator_2= ruleInitDeclarator )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==60) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2887:2: kw= ',' this_InitDeclarator_2= ruleInitDeclarator
            	    {
            	    kw=(Token)match(input,60,FOLLOW_60_in_ruleInitDeclaratorList8283); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getInitDeclaratorListAccess().getCommaKeyword_1_0()); 
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getInitDeclaratorListAccess().getInitDeclaratorParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleInitDeclarator_in_ruleInitDeclaratorList8305);
            	    this_InitDeclarator_2=ruleInitDeclarator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_InitDeclarator_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleInitDeclaratorList"


    // $ANTLR start "entryRuleInitDeclarator"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2911:1: entryRuleInitDeclarator returns [String current=null] : iv_ruleInitDeclarator= ruleInitDeclarator EOF ;
    public final String entryRuleInitDeclarator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInitDeclarator = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2912:2: (iv_ruleInitDeclarator= ruleInitDeclarator EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2913:2: iv_ruleInitDeclarator= ruleInitDeclarator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInitDeclaratorRule()); 
            }
            pushFollow(FOLLOW_ruleInitDeclarator_in_entryRuleInitDeclarator8353);
            iv_ruleInitDeclarator=ruleInitDeclarator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInitDeclarator.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInitDeclarator8364); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2920:1: ruleInitDeclarator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DeclaratorId_0= ruleDeclaratorId (this_Initializer_1= ruleInitializer )? ) ;
    public final AntlrDatatypeRuleToken ruleInitDeclarator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_DeclaratorId_0 = null;

        AntlrDatatypeRuleToken this_Initializer_1 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2923:28: ( (this_DeclaratorId_0= ruleDeclaratorId (this_Initializer_1= ruleInitializer )? ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2924:1: (this_DeclaratorId_0= ruleDeclaratorId (this_Initializer_1= ruleInitializer )? )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2924:1: (this_DeclaratorId_0= ruleDeclaratorId (this_Initializer_1= ruleInitializer )? )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2925:5: this_DeclaratorId_0= ruleDeclaratorId (this_Initializer_1= ruleInitializer )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getInitDeclaratorAccess().getDeclaratorIdParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleDeclaratorId_in_ruleInitDeclarator8411);
            this_DeclaratorId_0=ruleDeclaratorId();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_DeclaratorId_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2935:1: (this_Initializer_1= ruleInitializer )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==42||LA56_0==45||LA56_0==49) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2936:5: this_Initializer_1= ruleInitializer
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInitDeclaratorAccess().getInitializerParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInitializer_in_ruleInitDeclarator8439);
                    this_Initializer_1=ruleInitializer();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Initializer_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleInitDeclarator"


    // $ANTLR start "entryRuleFunctionDeclarator"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2954:1: entryRuleFunctionDeclarator returns [String current=null] : iv_ruleFunctionDeclarator= ruleFunctionDeclarator EOF ;
    public final String entryRuleFunctionDeclarator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunctionDeclarator = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2955:2: (iv_ruleFunctionDeclarator= ruleFunctionDeclarator EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2956:2: iv_ruleFunctionDeclarator= ruleFunctionDeclarator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionDeclaratorRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionDeclarator_in_entryRuleFunctionDeclarator8487);
            iv_ruleFunctionDeclarator=ruleFunctionDeclarator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionDeclarator.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionDeclarator8498); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2963:1: ruleFunctionDeclarator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DeclaratorId_0= ruleDeclaratorId this_ParametersAndQualifiers_1= ruleParametersAndQualifiers ) ;
    public final AntlrDatatypeRuleToken ruleFunctionDeclarator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_DeclaratorId_0 = null;

        AntlrDatatypeRuleToken this_ParametersAndQualifiers_1 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2966:28: ( (this_DeclaratorId_0= ruleDeclaratorId this_ParametersAndQualifiers_1= ruleParametersAndQualifiers ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2967:1: (this_DeclaratorId_0= ruleDeclaratorId this_ParametersAndQualifiers_1= ruleParametersAndQualifiers )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2967:1: (this_DeclaratorId_0= ruleDeclaratorId this_ParametersAndQualifiers_1= ruleParametersAndQualifiers )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2968:5: this_DeclaratorId_0= ruleDeclaratorId this_ParametersAndQualifiers_1= ruleParametersAndQualifiers
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getFunctionDeclaratorAccess().getDeclaratorIdParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleDeclaratorId_in_ruleFunctionDeclarator8545);
            this_DeclaratorId_0=ruleDeclaratorId();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_DeclaratorId_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getFunctionDeclaratorAccess().getParametersAndQualifiersParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleParametersAndQualifiers_in_ruleFunctionDeclarator8572);
            this_ParametersAndQualifiers_1=ruleParametersAndQualifiers();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ParametersAndQualifiers_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleFunctionDeclarator"


    // $ANTLR start "entryRuleParametersAndQualifiers"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2997:1: entryRuleParametersAndQualifiers returns [String current=null] : iv_ruleParametersAndQualifiers= ruleParametersAndQualifiers EOF ;
    public final String entryRuleParametersAndQualifiers() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleParametersAndQualifiers = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2998:2: (iv_ruleParametersAndQualifiers= ruleParametersAndQualifiers EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2999:2: iv_ruleParametersAndQualifiers= ruleParametersAndQualifiers EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParametersAndQualifiersRule()); 
            }
            pushFollow(FOLLOW_ruleParametersAndQualifiers_in_entryRuleParametersAndQualifiers8618);
            iv_ruleParametersAndQualifiers=ruleParametersAndQualifiers();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParametersAndQualifiers.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParametersAndQualifiers8629); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3006:1: ruleParametersAndQualifiers returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '(' (this_ParameterDeclarationClause_1= ruleParameterDeclarationClause )? kw= ')' (kw= 'const' | kw= 'volatile' )? (kw= '&' | kw= '&&' )? (this_ExceptionSpecification_7= ruleExceptionSpecification )? ) ;
    public final AntlrDatatypeRuleToken ruleParametersAndQualifiers() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ParameterDeclarationClause_1 = null;

        AntlrDatatypeRuleToken this_ExceptionSpecification_7 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3009:28: ( (kw= '(' (this_ParameterDeclarationClause_1= ruleParameterDeclarationClause )? kw= ')' (kw= 'const' | kw= 'volatile' )? (kw= '&' | kw= '&&' )? (this_ExceptionSpecification_7= ruleExceptionSpecification )? ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3010:1: (kw= '(' (this_ParameterDeclarationClause_1= ruleParameterDeclarationClause )? kw= ')' (kw= 'const' | kw= 'volatile' )? (kw= '&' | kw= '&&' )? (this_ExceptionSpecification_7= ruleExceptionSpecification )? )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3010:1: (kw= '(' (this_ParameterDeclarationClause_1= ruleParameterDeclarationClause )? kw= ')' (kw= 'const' | kw= 'volatile' )? (kw= '&' | kw= '&&' )? (this_ExceptionSpecification_7= ruleExceptionSpecification )? )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3011:2: kw= '(' (this_ParameterDeclarationClause_1= ruleParameterDeclarationClause )? kw= ')' (kw= 'const' | kw= 'volatile' )? (kw= '&' | kw= '&&' )? (this_ExceptionSpecification_7= ruleExceptionSpecification )?
            {
            kw=(Token)match(input,45,FOLLOW_45_in_ruleParametersAndQualifiers8667); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getParametersAndQualifiersAccess().getLeftParenthesisKeyword_0()); 
                  
            }
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3016:1: (this_ParameterDeclarationClause_1= ruleParameterDeclarationClause )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_ID||(LA57_0>=61 && LA57_0<=72)||(LA57_0>=74 && LA57_0<=91)||LA57_0==93||LA57_0==99||LA57_0==101||LA57_0==153||LA57_0==156) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3017:5: this_ParameterDeclarationClause_1= ruleParameterDeclarationClause
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getParametersAndQualifiersAccess().getParameterDeclarationClauseParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParameterDeclarationClause_in_ruleParametersAndQualifiers8690);
                    this_ParameterDeclarationClause_1=ruleParameterDeclarationClause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ParameterDeclarationClause_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }

            kw=(Token)match(input,46,FOLLOW_46_in_ruleParametersAndQualifiers8710); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getParametersAndQualifiersAccess().getRightParenthesisKeyword_2()); 
                  
            }
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3033:1: (kw= 'const' | kw= 'volatile' )?
            int alt58=3;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==95) ) {
                alt58=1;
            }
            else if ( (LA58_0==96) ) {
                alt58=2;
            }
            switch (alt58) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:2: kw= 'const'
                    {
                    kw=(Token)match(input,95,FOLLOW_95_in_ruleParametersAndQualifiers8724); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getParametersAndQualifiersAccess().getConstKeyword_3_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3041:2: kw= 'volatile'
                    {
                    kw=(Token)match(input,96,FOLLOW_96_in_ruleParametersAndQualifiers8743); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getParametersAndQualifiersAccess().getVolatileKeyword_3_1()); 
                          
                    }

                    }
                    break;

            }

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3046:3: (kw= '&' | kw= '&&' )?
            int alt59=3;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==97) ) {
                alt59=1;
            }
            else if ( (LA59_0==98) ) {
                alt59=2;
            }
            switch (alt59) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3047:2: kw= '&'
                    {
                    kw=(Token)match(input,97,FOLLOW_97_in_ruleParametersAndQualifiers8759); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getParametersAndQualifiersAccess().getAmpersandKeyword_4_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3054:2: kw= '&&'
                    {
                    kw=(Token)match(input,98,FOLLOW_98_in_ruleParametersAndQualifiers8778); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getParametersAndQualifiersAccess().getAmpersandAmpersandKeyword_4_1()); 
                          
                    }

                    }
                    break;

            }

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3059:3: (this_ExceptionSpecification_7= ruleExceptionSpecification )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( ((LA60_0>=148 && LA60_0<=149)) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3060:5: this_ExceptionSpecification_7= ruleExceptionSpecification
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getParametersAndQualifiersAccess().getExceptionSpecificationParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExceptionSpecification_in_ruleParametersAndQualifiers8803);
                    this_ExceptionSpecification_7=ruleExceptionSpecification();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ExceptionSpecification_7);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleParametersAndQualifiers"


    // $ANTLR start "entryRuleDeclaratorId"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3078:1: entryRuleDeclaratorId returns [String current=null] : iv_ruleDeclaratorId= ruleDeclaratorId EOF ;
    public final String entryRuleDeclaratorId() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDeclaratorId = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3079:2: (iv_ruleDeclaratorId= ruleDeclaratorId EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3080:2: iv_ruleDeclaratorId= ruleDeclaratorId EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclaratorIdRule()); 
            }
            pushFollow(FOLLOW_ruleDeclaratorId_in_entryRuleDeclaratorId8851);
            iv_ruleDeclaratorId=ruleDeclaratorId();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclaratorId.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaratorId8862); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3087:1: ruleDeclaratorId returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '...' )? this_IdExpression_1= ruleIdExpression ) ;
    public final AntlrDatatypeRuleToken ruleDeclaratorId() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_IdExpression_1 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3090:28: ( ( (kw= '...' )? this_IdExpression_1= ruleIdExpression ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3091:1: ( (kw= '...' )? this_IdExpression_1= ruleIdExpression )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3091:1: ( (kw= '...' )? this_IdExpression_1= ruleIdExpression )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3091:2: (kw= '...' )? this_IdExpression_1= ruleIdExpression
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3091:2: (kw= '...' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==99) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3092:2: kw= '...'
                    {
                    kw=(Token)match(input,99,FOLLOW_99_in_ruleDeclaratorId8901); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getDeclaratorIdAccess().getFullStopFullStopFullStopKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDeclaratorIdAccess().getIdExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleIdExpression_in_ruleDeclaratorId8925);
            this_IdExpression_1=ruleIdExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_IdExpression_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDeclaratorId"


    // $ANTLR start "entryRuleTypeId"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3116:1: entryRuleTypeId returns [String current=null] : iv_ruleTypeId= ruleTypeId EOF ;
    public final String entryRuleTypeId() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeId = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3117:2: (iv_ruleTypeId= ruleTypeId EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3118:2: iv_ruleTypeId= ruleTypeId EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeIdRule()); 
            }
            pushFollow(FOLLOW_ruleTypeId_in_entryRuleTypeId8971);
            iv_ruleTypeId=ruleTypeId();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeId.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeId8982); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3125:1: ruleTypeId returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TypeSpecifier_0= ruleTypeSpecifier )+ ;
    public final AntlrDatatypeRuleToken ruleTypeId() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_TypeSpecifier_0 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3128:28: ( (this_TypeSpecifier_0= ruleTypeSpecifier )+ )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3129:1: (this_TypeSpecifier_0= ruleTypeSpecifier )+
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3129:1: (this_TypeSpecifier_0= ruleTypeSpecifier )+
            int cnt62=0;
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==RULE_ID||LA62_0==72||(LA62_0>=74 && LA62_0<=91)||LA62_0==93||LA62_0==101||LA62_0==153||LA62_0==156) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3130:5: this_TypeSpecifier_0= ruleTypeSpecifier
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getTypeIdAccess().getTypeSpecifierParserRuleCall()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleTypeSpecifier_in_ruleTypeId9029);
            	    this_TypeSpecifier_0=ruleTypeSpecifier();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_TypeSpecifier_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt62 >= 1 ) break loop62;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(62, input);
                        throw eee;
                }
                cnt62++;
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTypeId"


    // $ANTLR start "entryRuleParameterDeclarationClause"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3148:1: entryRuleParameterDeclarationClause returns [String current=null] : iv_ruleParameterDeclarationClause= ruleParameterDeclarationClause EOF ;
    public final String entryRuleParameterDeclarationClause() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleParameterDeclarationClause = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3149:2: (iv_ruleParameterDeclarationClause= ruleParameterDeclarationClause EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3150:2: iv_ruleParameterDeclarationClause= ruleParameterDeclarationClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterDeclarationClauseRule()); 
            }
            pushFollow(FOLLOW_ruleParameterDeclarationClause_in_entryRuleParameterDeclarationClause9076);
            iv_ruleParameterDeclarationClause=ruleParameterDeclarationClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterDeclarationClause.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterDeclarationClause9087); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3157:1: ruleParameterDeclarationClause returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '...' | (this_ParameterDeclarationList_1= ruleParameterDeclarationList ( (kw= ',' )? kw= '...' )? ) ) ;
    public final AntlrDatatypeRuleToken ruleParameterDeclarationClause() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ParameterDeclarationList_1 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3160:28: ( (kw= '...' | (this_ParameterDeclarationList_1= ruleParameterDeclarationList ( (kw= ',' )? kw= '...' )? ) ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3161:1: (kw= '...' | (this_ParameterDeclarationList_1= ruleParameterDeclarationList ( (kw= ',' )? kw= '...' )? ) )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3161:1: (kw= '...' | (this_ParameterDeclarationList_1= ruleParameterDeclarationList ( (kw= ',' )? kw= '...' )? ) )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==99) ) {
                alt65=1;
            }
            else if ( (LA65_0==RULE_ID||(LA65_0>=61 && LA65_0<=72)||(LA65_0>=74 && LA65_0<=91)||LA65_0==93||LA65_0==101||LA65_0==153||LA65_0==156) ) {
                alt65=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3162:2: kw= '...'
                    {
                    kw=(Token)match(input,99,FOLLOW_99_in_ruleParameterDeclarationClause9125); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getParameterDeclarationClauseAccess().getFullStopFullStopFullStopKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3168:6: (this_ParameterDeclarationList_1= ruleParameterDeclarationList ( (kw= ',' )? kw= '...' )? )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3168:6: (this_ParameterDeclarationList_1= ruleParameterDeclarationList ( (kw= ',' )? kw= '...' )? )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3169:5: this_ParameterDeclarationList_1= ruleParameterDeclarationList ( (kw= ',' )? kw= '...' )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getParameterDeclarationClauseAccess().getParameterDeclarationListParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParameterDeclarationList_in_ruleParameterDeclarationClause9154);
                    this_ParameterDeclarationList_1=ruleParameterDeclarationList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ParameterDeclarationList_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3179:1: ( (kw= ',' )? kw= '...' )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==60||LA64_0==99) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3179:2: (kw= ',' )? kw= '...'
                            {
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3179:2: (kw= ',' )?
                            int alt63=2;
                            int LA63_0 = input.LA(1);

                            if ( (LA63_0==60) ) {
                                alt63=1;
                            }
                            switch (alt63) {
                                case 1 :
                                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3180:2: kw= ','
                                    {
                                    kw=(Token)match(input,60,FOLLOW_60_in_ruleParameterDeclarationClause9174); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                              current.merge(kw);
                                              newLeafNode(kw, grammarAccess.getParameterDeclarationClauseAccess().getCommaKeyword_1_1_0()); 
                                          
                                    }

                                    }
                                    break;

                            }

                            kw=(Token)match(input,99,FOLLOW_99_in_ruleParameterDeclarationClause9189); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getParameterDeclarationClauseAccess().getFullStopFullStopFullStopKeyword_1_1_1()); 
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleParameterDeclarationClause"


    // $ANTLR start "entryRuleParameterDeclarationList"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3199:1: entryRuleParameterDeclarationList returns [String current=null] : iv_ruleParameterDeclarationList= ruleParameterDeclarationList EOF ;
    public final String entryRuleParameterDeclarationList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleParameterDeclarationList = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3200:2: (iv_ruleParameterDeclarationList= ruleParameterDeclarationList EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3201:2: iv_ruleParameterDeclarationList= ruleParameterDeclarationList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterDeclarationListRule()); 
            }
            pushFollow(FOLLOW_ruleParameterDeclarationList_in_entryRuleParameterDeclarationList9233);
            iv_ruleParameterDeclarationList=ruleParameterDeclarationList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterDeclarationList.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterDeclarationList9244); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3208:1: ruleParameterDeclarationList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ParameterDeclaration_0= ruleParameterDeclaration (kw= ',' this_ParameterDeclaration_2= ruleParameterDeclaration )* ) ;
    public final AntlrDatatypeRuleToken ruleParameterDeclarationList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ParameterDeclaration_0 = null;

        AntlrDatatypeRuleToken this_ParameterDeclaration_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3211:28: ( (this_ParameterDeclaration_0= ruleParameterDeclaration (kw= ',' this_ParameterDeclaration_2= ruleParameterDeclaration )* ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3212:1: (this_ParameterDeclaration_0= ruleParameterDeclaration (kw= ',' this_ParameterDeclaration_2= ruleParameterDeclaration )* )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3212:1: (this_ParameterDeclaration_0= ruleParameterDeclaration (kw= ',' this_ParameterDeclaration_2= ruleParameterDeclaration )* )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3213:5: this_ParameterDeclaration_0= ruleParameterDeclaration (kw= ',' this_ParameterDeclaration_2= ruleParameterDeclaration )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getParameterDeclarationListAccess().getParameterDeclarationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleParameterDeclaration_in_ruleParameterDeclarationList9291);
            this_ParameterDeclaration_0=ruleParameterDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ParameterDeclaration_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3223:1: (kw= ',' this_ParameterDeclaration_2= ruleParameterDeclaration )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==60) ) {
                    int LA66_1 = input.LA(2);

                    if ( (LA66_1==RULE_ID||(LA66_1>=61 && LA66_1<=72)||(LA66_1>=74 && LA66_1<=91)||LA66_1==93||LA66_1==101||LA66_1==153||LA66_1==156) ) {
                        alt66=1;
                    }


                }


                switch (alt66) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3224:2: kw= ',' this_ParameterDeclaration_2= ruleParameterDeclaration
            	    {
            	    kw=(Token)match(input,60,FOLLOW_60_in_ruleParameterDeclarationList9310); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getParameterDeclarationListAccess().getCommaKeyword_1_0()); 
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getParameterDeclarationListAccess().getParameterDeclarationParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleParameterDeclaration_in_ruleParameterDeclarationList9332);
            	    this_ParameterDeclaration_2=ruleParameterDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ParameterDeclaration_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleParameterDeclarationList"


    // $ANTLR start "entryRuleParameterDeclaration"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3248:1: entryRuleParameterDeclaration returns [String current=null] : iv_ruleParameterDeclaration= ruleParameterDeclaration EOF ;
    public final String entryRuleParameterDeclaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleParameterDeclaration = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3249:2: (iv_ruleParameterDeclaration= ruleParameterDeclaration EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3250:2: iv_ruleParameterDeclaration= ruleParameterDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleParameterDeclaration_in_entryRuleParameterDeclaration9380);
            iv_ruleParameterDeclaration=ruleParameterDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterDeclaration.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterDeclaration9391); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3257:1: ruleParameterDeclaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_DeclarationSpecifier_0= ruleDeclarationSpecifier )+ this_InitDeclarator_1= ruleInitDeclarator ) ;
    public final AntlrDatatypeRuleToken ruleParameterDeclaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_DeclarationSpecifier_0 = null;

        AntlrDatatypeRuleToken this_InitDeclarator_1 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3260:28: ( ( (this_DeclarationSpecifier_0= ruleDeclarationSpecifier )+ this_InitDeclarator_1= ruleInitDeclarator ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3261:1: ( (this_DeclarationSpecifier_0= ruleDeclarationSpecifier )+ this_InitDeclarator_1= ruleInitDeclarator )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3261:1: ( (this_DeclarationSpecifier_0= ruleDeclarationSpecifier )+ this_InitDeclarator_1= ruleInitDeclarator )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3261:2: (this_DeclarationSpecifier_0= ruleDeclarationSpecifier )+ this_InitDeclarator_1= ruleInitDeclarator
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3261:2: (this_DeclarationSpecifier_0= ruleDeclarationSpecifier )+
            int cnt67=0;
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==RULE_ID||(LA67_0>=61 && LA67_0<=72)||(LA67_0>=74 && LA67_0<=91)||LA67_0==93||LA67_0==101||LA67_0==153||LA67_0==156) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3262:5: this_DeclarationSpecifier_0= ruleDeclarationSpecifier
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getParameterDeclarationAccess().getDeclarationSpecifierParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleDeclarationSpecifier_in_ruleParameterDeclaration9439);
            	    this_DeclarationSpecifier_0=ruleDeclarationSpecifier();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_DeclarationSpecifier_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt67 >= 1 ) break loop67;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(67, input);
                        throw eee;
                }
                cnt67++;
            } while (true);

            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getParameterDeclarationAccess().getInitDeclaratorParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleInitDeclarator_in_ruleParameterDeclaration9468);
            this_InitDeclarator_1=ruleInitDeclarator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_InitDeclarator_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleParameterDeclaration"


    // $ANTLR start "entryRuleFunctionBody"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3291:1: entryRuleFunctionBody returns [String current=null] : iv_ruleFunctionBody= ruleFunctionBody EOF ;
    public final String entryRuleFunctionBody() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunctionBody = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3292:2: (iv_ruleFunctionBody= ruleFunctionBody EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3293:2: iv_ruleFunctionBody= ruleFunctionBody EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionBodyRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionBody_in_entryRuleFunctionBody9514);
            iv_ruleFunctionBody=ruleFunctionBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionBody.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionBody9525); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3300:1: ruleFunctionBody returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_CtorInitializer_0= ruleCtorInitializer )? this_CompoundStatement_1= ruleCompoundStatement ) | this_FunctionTryBlock_2= ruleFunctionTryBlock ) ;
    public final AntlrDatatypeRuleToken ruleFunctionBody() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_CtorInitializer_0 = null;

        AntlrDatatypeRuleToken this_CompoundStatement_1 = null;

        AntlrDatatypeRuleToken this_FunctionTryBlock_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3303:28: ( ( ( (this_CtorInitializer_0= ruleCtorInitializer )? this_CompoundStatement_1= ruleCompoundStatement ) | this_FunctionTryBlock_2= ruleFunctionTryBlock ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3304:1: ( ( (this_CtorInitializer_0= ruleCtorInitializer )? this_CompoundStatement_1= ruleCompoundStatement ) | this_FunctionTryBlock_2= ruleFunctionTryBlock )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3304:1: ( ( (this_CtorInitializer_0= ruleCtorInitializer )? this_CompoundStatement_1= ruleCompoundStatement ) | this_FunctionTryBlock_2= ruleFunctionTryBlock )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==42||LA69_0==158) ) {
                alt69=1;
            }
            else if ( (LA69_0==146) ) {
                alt69=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3304:2: ( (this_CtorInitializer_0= ruleCtorInitializer )? this_CompoundStatement_1= ruleCompoundStatement )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3304:2: ( (this_CtorInitializer_0= ruleCtorInitializer )? this_CompoundStatement_1= ruleCompoundStatement )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3304:3: (this_CtorInitializer_0= ruleCtorInitializer )? this_CompoundStatement_1= ruleCompoundStatement
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3304:3: (this_CtorInitializer_0= ruleCtorInitializer )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==158) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3305:5: this_CtorInitializer_0= ruleCtorInitializer
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getFunctionBodyAccess().getCtorInitializerParserRuleCall_0_0()); 
                                  
                            }
                            pushFollow(FOLLOW_ruleCtorInitializer_in_ruleFunctionBody9574);
                            this_CtorInitializer_0=ruleCtorInitializer();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_CtorInitializer_0);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFunctionBodyAccess().getCompoundStatementParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCompoundStatement_in_ruleFunctionBody9603);
                    this_CompoundStatement_1=ruleCompoundStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_CompoundStatement_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3328:5: this_FunctionTryBlock_2= ruleFunctionTryBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFunctionBodyAccess().getFunctionTryBlockParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFunctionTryBlock_in_ruleFunctionBody9637);
                    this_FunctionTryBlock_2=ruleFunctionTryBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_FunctionTryBlock_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleFunctionBody"


    // $ANTLR start "entryRuleInitializer"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3346:1: entryRuleInitializer returns [String current=null] : iv_ruleInitializer= ruleInitializer EOF ;
    public final String entryRuleInitializer() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInitializer = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3347:2: (iv_ruleInitializer= ruleInitializer EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3348:2: iv_ruleInitializer= ruleInitializer EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInitializerRule()); 
            }
            pushFollow(FOLLOW_ruleInitializer_in_entryRuleInitializer9683);
            iv_ruleInitializer=ruleInitializer();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInitializer.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInitializer9694); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3355:1: ruleInitializer returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_BraceOrEqualInitializer_0= ruleBraceOrEqualInitializer | (kw= '(' this_ExpressionList_2= ruleExpressionList kw= ')' ) ) ;
    public final AntlrDatatypeRuleToken ruleInitializer() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_BraceOrEqualInitializer_0 = null;

        AntlrDatatypeRuleToken this_ExpressionList_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3358:28: ( (this_BraceOrEqualInitializer_0= ruleBraceOrEqualInitializer | (kw= '(' this_ExpressionList_2= ruleExpressionList kw= ')' ) ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3359:1: (this_BraceOrEqualInitializer_0= ruleBraceOrEqualInitializer | (kw= '(' this_ExpressionList_2= ruleExpressionList kw= ')' ) )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3359:1: (this_BraceOrEqualInitializer_0= ruleBraceOrEqualInitializer | (kw= '(' this_ExpressionList_2= ruleExpressionList kw= ')' ) )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==42||LA70_0==49) ) {
                alt70=1;
            }
            else if ( (LA70_0==45) ) {
                alt70=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3360:5: this_BraceOrEqualInitializer_0= ruleBraceOrEqualInitializer
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInitializerAccess().getBraceOrEqualInitializerParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBraceOrEqualInitializer_in_ruleInitializer9741);
                    this_BraceOrEqualInitializer_0=ruleBraceOrEqualInitializer();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BraceOrEqualInitializer_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3371:6: (kw= '(' this_ExpressionList_2= ruleExpressionList kw= ')' )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3371:6: (kw= '(' this_ExpressionList_2= ruleExpressionList kw= ')' )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3372:2: kw= '(' this_ExpressionList_2= ruleExpressionList kw= ')'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleInitializer9766); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getInitializerAccess().getLeftParenthesisKeyword_1_0()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInitializerAccess().getExpressionListParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpressionList_in_ruleInitializer9788);
                    this_ExpressionList_2=ruleExpressionList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ExpressionList_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleInitializer9806); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getInitializerAccess().getRightParenthesisKeyword_1_2()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleInitializer"


    // $ANTLR start "entryRuleBraceOrEqualInitializer"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3402:1: entryRuleBraceOrEqualInitializer returns [String current=null] : iv_ruleBraceOrEqualInitializer= ruleBraceOrEqualInitializer EOF ;
    public final String entryRuleBraceOrEqualInitializer() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBraceOrEqualInitializer = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3403:2: (iv_ruleBraceOrEqualInitializer= ruleBraceOrEqualInitializer EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3404:2: iv_ruleBraceOrEqualInitializer= ruleBraceOrEqualInitializer EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBraceOrEqualInitializerRule()); 
            }
            pushFollow(FOLLOW_ruleBraceOrEqualInitializer_in_entryRuleBraceOrEqualInitializer9848);
            iv_ruleBraceOrEqualInitializer=ruleBraceOrEqualInitializer();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBraceOrEqualInitializer.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBraceOrEqualInitializer9859); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3411:1: ruleBraceOrEqualInitializer returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '=' this_InitializerClause_1= ruleInitializerClause ) | this_BracedInitializerList_2= ruleBracedInitializerList ) ;
    public final AntlrDatatypeRuleToken ruleBraceOrEqualInitializer() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_InitializerClause_1 = null;

        AntlrDatatypeRuleToken this_BracedInitializerList_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3414:28: ( ( (kw= '=' this_InitializerClause_1= ruleInitializerClause ) | this_BracedInitializerList_2= ruleBracedInitializerList ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3415:1: ( (kw= '=' this_InitializerClause_1= ruleInitializerClause ) | this_BracedInitializerList_2= ruleBracedInitializerList )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3415:1: ( (kw= '=' this_InitializerClause_1= ruleInitializerClause ) | this_BracedInitializerList_2= ruleBracedInitializerList )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==49) ) {
                alt71=1;
            }
            else if ( (LA71_0==42) ) {
                alt71=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3415:2: (kw= '=' this_InitializerClause_1= ruleInitializerClause )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3415:2: (kw= '=' this_InitializerClause_1= ruleInitializerClause )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3416:2: kw= '=' this_InitializerClause_1= ruleInitializerClause
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleBraceOrEqualInitializer9898); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBraceOrEqualInitializerAccess().getEqualsSignKeyword_0_0()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBraceOrEqualInitializerAccess().getInitializerClauseParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInitializerClause_in_ruleBraceOrEqualInitializer9920);
                    this_InitializerClause_1=ruleInitializerClause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_InitializerClause_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3434:5: this_BracedInitializerList_2= ruleBracedInitializerList
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBraceOrEqualInitializerAccess().getBracedInitializerListParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBracedInitializerList_in_ruleBraceOrEqualInitializer9954);
                    this_BracedInitializerList_2=ruleBracedInitializerList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BracedInitializerList_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBraceOrEqualInitializer"


    // $ANTLR start "entryRuleInitializerClause"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3452:1: entryRuleInitializerClause returns [String current=null] : iv_ruleInitializerClause= ruleInitializerClause EOF ;
    public final String entryRuleInitializerClause() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInitializerClause = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3453:2: (iv_ruleInitializerClause= ruleInitializerClause EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3454:2: iv_ruleInitializerClause= ruleInitializerClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInitializerClauseRule()); 
            }
            pushFollow(FOLLOW_ruleInitializerClause_in_entryRuleInitializerClause10000);
            iv_ruleInitializerClause=ruleInitializerClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInitializerClause.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInitializerClause10011); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3461:1: ruleInitializerClause returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_AssignmentExpression_0= ruleAssignmentExpression | this_BracedInitializerList_1= ruleBracedInitializerList ) ;
    public final AntlrDatatypeRuleToken ruleInitializerClause() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_AssignmentExpression_0 = null;

        AntlrDatatypeRuleToken this_BracedInitializerList_1 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3464:28: ( (this_AssignmentExpression_0= ruleAssignmentExpression | this_BracedInitializerList_1= ruleBracedInitializerList ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3465:1: (this_AssignmentExpression_0= ruleAssignmentExpression | this_BracedInitializerList_1= ruleBracedInitializerList )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3465:1: (this_AssignmentExpression_0= ruleAssignmentExpression | this_BracedInitializerList_1= ruleBracedInitializerList )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==157) ) {
                alt72=1;
            }
            else if ( (LA72_0==42) ) {
                alt72=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }
            switch (alt72) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3466:5: this_AssignmentExpression_0= ruleAssignmentExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInitializerClauseAccess().getAssignmentExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAssignmentExpression_in_ruleInitializerClause10058);
                    this_AssignmentExpression_0=ruleAssignmentExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_AssignmentExpression_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3478:5: this_BracedInitializerList_1= ruleBracedInitializerList
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInitializerClauseAccess().getBracedInitializerListParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBracedInitializerList_in_ruleInitializerClause10091);
                    this_BracedInitializerList_1=ruleBracedInitializerList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BracedInitializerList_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleInitializerClause"


    // $ANTLR start "entryRuleInitializerList"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3496:1: entryRuleInitializerList returns [String current=null] : iv_ruleInitializerList= ruleInitializerList EOF ;
    public final String entryRuleInitializerList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInitializerList = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3497:2: (iv_ruleInitializerList= ruleInitializerList EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3498:2: iv_ruleInitializerList= ruleInitializerList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInitializerListRule()); 
            }
            pushFollow(FOLLOW_ruleInitializerList_in_entryRuleInitializerList10137);
            iv_ruleInitializerList=ruleInitializerList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInitializerList.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInitializerList10148); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3505:1: ruleInitializerList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_InitializerClause_0= ruleInitializerClause (kw= '...' )? (kw= ',' this_InitializerClause_3= ruleInitializerClause (kw= '...' )? )* ) ;
    public final AntlrDatatypeRuleToken ruleInitializerList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_InitializerClause_0 = null;

        AntlrDatatypeRuleToken this_InitializerClause_3 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3508:28: ( (this_InitializerClause_0= ruleInitializerClause (kw= '...' )? (kw= ',' this_InitializerClause_3= ruleInitializerClause (kw= '...' )? )* ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3509:1: (this_InitializerClause_0= ruleInitializerClause (kw= '...' )? (kw= ',' this_InitializerClause_3= ruleInitializerClause (kw= '...' )? )* )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3509:1: (this_InitializerClause_0= ruleInitializerClause (kw= '...' )? (kw= ',' this_InitializerClause_3= ruleInitializerClause (kw= '...' )? )* )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3510:5: this_InitializerClause_0= ruleInitializerClause (kw= '...' )? (kw= ',' this_InitializerClause_3= ruleInitializerClause (kw= '...' )? )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getInitializerListAccess().getInitializerClauseParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleInitializerClause_in_ruleInitializerList10195);
            this_InitializerClause_0=ruleInitializerClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_InitializerClause_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3520:1: (kw= '...' )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==99) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3521:2: kw= '...'
                    {
                    kw=(Token)match(input,99,FOLLOW_99_in_ruleInitializerList10214); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getInitializerListAccess().getFullStopFullStopFullStopKeyword_1()); 
                          
                    }

                    }
                    break;

            }

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3526:3: (kw= ',' this_InitializerClause_3= ruleInitializerClause (kw= '...' )? )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==60) ) {
                    int LA75_2 = input.LA(2);

                    if ( (LA75_2==42||LA75_2==157) ) {
                        alt75=1;
                    }


                }


                switch (alt75) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3527:2: kw= ',' this_InitializerClause_3= ruleInitializerClause (kw= '...' )?
            	    {
            	    kw=(Token)match(input,60,FOLLOW_60_in_ruleInitializerList10230); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getInitializerListAccess().getCommaKeyword_2_0()); 
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getInitializerListAccess().getInitializerClauseParserRuleCall_2_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleInitializerClause_in_ruleInitializerList10252);
            	    this_InitializerClause_3=ruleInitializerClause();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_InitializerClause_3);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3543:1: (kw= '...' )?
            	    int alt74=2;
            	    int LA74_0 = input.LA(1);

            	    if ( (LA74_0==99) ) {
            	        alt74=1;
            	    }
            	    switch (alt74) {
            	        case 1 :
            	            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3544:2: kw= '...'
            	            {
            	            kw=(Token)match(input,99,FOLLOW_99_in_ruleInitializerList10271); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      current.merge(kw);
            	                      newLeafNode(kw, grammarAccess.getInitializerListAccess().getFullStopFullStopFullStopKeyword_2_2()); 
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop75;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleInitializerList"


    // $ANTLR start "entryRuleBracedInitializerList"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3557:1: entryRuleBracedInitializerList returns [String current=null] : iv_ruleBracedInitializerList= ruleBracedInitializerList EOF ;
    public final String entryRuleBracedInitializerList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBracedInitializerList = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3558:2: (iv_ruleBracedInitializerList= ruleBracedInitializerList EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3559:2: iv_ruleBracedInitializerList= ruleBracedInitializerList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBracedInitializerListRule()); 
            }
            pushFollow(FOLLOW_ruleBracedInitializerList_in_entryRuleBracedInitializerList10316);
            iv_ruleBracedInitializerList=ruleBracedInitializerList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBracedInitializerList.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBracedInitializerList10327); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3566:1: ruleBracedInitializerList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '{' (this_InitializerList_1= ruleInitializerList (kw= ',' )? )? kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleBracedInitializerList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_InitializerList_1 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3569:28: ( (kw= '{' (this_InitializerList_1= ruleInitializerList (kw= ',' )? )? kw= '}' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3570:1: (kw= '{' (this_InitializerList_1= ruleInitializerList (kw= ',' )? )? kw= '}' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3570:1: (kw= '{' (this_InitializerList_1= ruleInitializerList (kw= ',' )? )? kw= '}' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3571:2: kw= '{' (this_InitializerList_1= ruleInitializerList (kw= ',' )? )? kw= '}'
            {
            kw=(Token)match(input,42,FOLLOW_42_in_ruleBracedInitializerList10365); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getBracedInitializerListAccess().getLeftCurlyBracketKeyword_0()); 
                  
            }
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3576:1: (this_InitializerList_1= ruleInitializerList (kw= ',' )? )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==42||LA77_0==157) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3577:5: this_InitializerList_1= ruleInitializerList (kw= ',' )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBracedInitializerListAccess().getInitializerListParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInitializerList_in_ruleBracedInitializerList10388);
                    this_InitializerList_1=ruleInitializerList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_InitializerList_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3587:1: (kw= ',' )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==60) ) {
                        alt76=1;
                    }
                    switch (alt76) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3588:2: kw= ','
                            {
                            kw=(Token)match(input,60,FOLLOW_60_in_ruleBracedInitializerList10407); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getBracedInitializerListAccess().getCommaKeyword_1_1()); 
                                  
                            }

                            }
                            break;

                    }


                    }
                    break;

            }

            kw=(Token)match(input,43,FOLLOW_43_in_ruleBracedInitializerList10424); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getBracedInitializerListAccess().getRightCurlyBracketKeyword_2()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBracedInitializerList"


    // $ANTLR start "entryRuleClassSpecifier"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3607:1: entryRuleClassSpecifier returns [String current=null] : iv_ruleClassSpecifier= ruleClassSpecifier EOF ;
    public final String entryRuleClassSpecifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleClassSpecifier = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3608:2: (iv_ruleClassSpecifier= ruleClassSpecifier EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3609:2: iv_ruleClassSpecifier= ruleClassSpecifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassSpecifierRule()); 
            }
            pushFollow(FOLLOW_ruleClassSpecifier_in_entryRuleClassSpecifier10465);
            iv_ruleClassSpecifier=ruleClassSpecifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassSpecifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassSpecifier10476); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3616:1: ruleClassSpecifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ClassHead_0= ruleClassHead kw= '{' (this_MemberSpecification_2= ruleMemberSpecification )? kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleClassSpecifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ClassHead_0 = null;

        AntlrDatatypeRuleToken this_MemberSpecification_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3619:28: ( (this_ClassHead_0= ruleClassHead kw= '{' (this_MemberSpecification_2= ruleMemberSpecification )? kw= '}' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3620:1: (this_ClassHead_0= ruleClassHead kw= '{' (this_MemberSpecification_2= ruleMemberSpecification )? kw= '}' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3620:1: (this_ClassHead_0= ruleClassHead kw= '{' (this_MemberSpecification_2= ruleMemberSpecification )? kw= '}' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3621:5: this_ClassHead_0= ruleClassHead kw= '{' (this_MemberSpecification_2= ruleMemberSpecification )? kw= '}'
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getClassSpecifierAccess().getClassHeadParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleClassHead_in_ruleClassSpecifier10523);
            this_ClassHead_0=ruleClassHead();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ClassHead_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            kw=(Token)match(input,42,FOLLOW_42_in_ruleClassSpecifier10541); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getClassSpecifierAccess().getLeftCurlyBracketKeyword_1()); 
                  
            }
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3637:1: (this_MemberSpecification_2= ruleMemberSpecification )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==EOF||LA78_0==RULE_ID||LA78_0==41||LA78_0==57||LA78_0==59||(LA78_0>=61 && LA78_0<=91)||LA78_0==93||LA78_0==99||LA78_0==101||(LA78_0>=105 && LA78_0<=107)||LA78_0==153||(LA78_0>=155 && LA78_0<=156)) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3638:5: this_MemberSpecification_2= ruleMemberSpecification
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getClassSpecifierAccess().getMemberSpecificationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMemberSpecification_in_ruleClassSpecifier10564);
                    this_MemberSpecification_2=ruleMemberSpecification();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_MemberSpecification_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }

            kw=(Token)match(input,43,FOLLOW_43_in_ruleClassSpecifier10584); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getClassSpecifierAccess().getRightCurlyBracketKeyword_3()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleClassSpecifier"


    // $ANTLR start "entryRuleClassHead"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3662:1: entryRuleClassHead returns [String current=null] : iv_ruleClassHead= ruleClassHead EOF ;
    public final String entryRuleClassHead() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleClassHead = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3663:2: (iv_ruleClassHead= ruleClassHead EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3664:2: iv_ruleClassHead= ruleClassHead EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassHeadRule()); 
            }
            pushFollow(FOLLOW_ruleClassHead_in_entryRuleClassHead10625);
            iv_ruleClassHead=ruleClassHead();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassHead.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassHead10636); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3671:1: ruleClassHead returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ClassKey_0= ruleClassKey ( (this_NestedNameSpecifier_1= ruleNestedNameSpecifier )? this_TypeName_2= ruleTypeName (this_ClassVirtualSpecifier_3= ruleClassVirtualSpecifier )* )? (this_BaseClause_4= ruleBaseClause )? ) ;
    public final AntlrDatatypeRuleToken ruleClassHead() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_ClassKey_0 = null;

        AntlrDatatypeRuleToken this_NestedNameSpecifier_1 = null;

        AntlrDatatypeRuleToken this_TypeName_2 = null;

        AntlrDatatypeRuleToken this_ClassVirtualSpecifier_3 = null;

        AntlrDatatypeRuleToken this_BaseClause_4 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3674:28: ( (this_ClassKey_0= ruleClassKey ( (this_NestedNameSpecifier_1= ruleNestedNameSpecifier )? this_TypeName_2= ruleTypeName (this_ClassVirtualSpecifier_3= ruleClassVirtualSpecifier )* )? (this_BaseClause_4= ruleBaseClause )? ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3675:1: (this_ClassKey_0= ruleClassKey ( (this_NestedNameSpecifier_1= ruleNestedNameSpecifier )? this_TypeName_2= ruleTypeName (this_ClassVirtualSpecifier_3= ruleClassVirtualSpecifier )* )? (this_BaseClause_4= ruleBaseClause )? )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3675:1: (this_ClassKey_0= ruleClassKey ( (this_NestedNameSpecifier_1= ruleNestedNameSpecifier )? this_TypeName_2= ruleTypeName (this_ClassVirtualSpecifier_3= ruleClassVirtualSpecifier )* )? (this_BaseClause_4= ruleBaseClause )? )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3676:5: this_ClassKey_0= ruleClassKey ( (this_NestedNameSpecifier_1= ruleNestedNameSpecifier )? this_TypeName_2= ruleTypeName (this_ClassVirtualSpecifier_3= ruleClassVirtualSpecifier )* )? (this_BaseClause_4= ruleBaseClause )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getClassHeadAccess().getClassKeyParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleClassKey_in_ruleClassHead10683);
            this_ClassKey_0=ruleClassKey();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ClassKey_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3686:1: ( (this_NestedNameSpecifier_1= ruleNestedNameSpecifier )? this_TypeName_2= ruleTypeName (this_ClassVirtualSpecifier_3= ruleClassVirtualSpecifier )* )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==RULE_ID||LA81_0==156) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3686:2: (this_NestedNameSpecifier_1= ruleNestedNameSpecifier )? this_TypeName_2= ruleTypeName (this_ClassVirtualSpecifier_3= ruleClassVirtualSpecifier )*
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3686:2: (this_NestedNameSpecifier_1= ruleNestedNameSpecifier )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==156) ) {
                        alt79=1;
                    }
                    switch (alt79) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3687:5: this_NestedNameSpecifier_1= ruleNestedNameSpecifier
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getClassHeadAccess().getNestedNameSpecifierParserRuleCall_1_0()); 
                                  
                            }
                            pushFollow(FOLLOW_ruleNestedNameSpecifier_in_ruleClassHead10712);
                            this_NestedNameSpecifier_1=ruleNestedNameSpecifier();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_NestedNameSpecifier_1);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getClassHeadAccess().getTypeNameParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTypeName_in_ruleClassHead10741);
                    this_TypeName_2=ruleTypeName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_TypeName_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3708:1: (this_ClassVirtualSpecifier_3= ruleClassVirtualSpecifier )*
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( (LA80_0==71||LA80_0==100) ) {
                            alt80=1;
                        }


                        switch (alt80) {
                    	case 1 :
                    	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3709:5: this_ClassVirtualSpecifier_3= ruleClassVirtualSpecifier
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getClassHeadAccess().getClassVirtualSpecifierParserRuleCall_1_2()); 
                    	          
                    	    }
                    	    pushFollow(FOLLOW_ruleClassVirtualSpecifier_in_ruleClassHead10769);
                    	    this_ClassVirtualSpecifier_3=ruleClassVirtualSpecifier();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		current.merge(this_ClassVirtualSpecifier_3);
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              afterParserOrEnumRuleCall();
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop80;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3719:5: (this_BaseClause_4= ruleBaseClause )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==38) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3720:5: this_BaseClause_4= ruleBaseClause
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getClassHeadAccess().getBaseClauseParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBaseClause_in_ruleClassHead10801);
                    this_BaseClause_4=ruleBaseClause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BaseClause_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleClassHead"


    // $ANTLR start "entryRuleClassVirtualSpecifier"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3738:1: entryRuleClassVirtualSpecifier returns [String current=null] : iv_ruleClassVirtualSpecifier= ruleClassVirtualSpecifier EOF ;
    public final String entryRuleClassVirtualSpecifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleClassVirtualSpecifier = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3739:2: (iv_ruleClassVirtualSpecifier= ruleClassVirtualSpecifier EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3740:2: iv_ruleClassVirtualSpecifier= ruleClassVirtualSpecifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassVirtualSpecifierRule()); 
            }
            pushFollow(FOLLOW_ruleClassVirtualSpecifier_in_entryRuleClassVirtualSpecifier10849);
            iv_ruleClassVirtualSpecifier=ruleClassVirtualSpecifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassVirtualSpecifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassVirtualSpecifier10860); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3747:1: ruleClassVirtualSpecifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'final' | kw= 'explicit' ) ;
    public final AntlrDatatypeRuleToken ruleClassVirtualSpecifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3750:28: ( (kw= 'final' | kw= 'explicit' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3751:1: (kw= 'final' | kw= 'explicit' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3751:1: (kw= 'final' | kw= 'explicit' )
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==100) ) {
                alt83=1;
            }
            else if ( (LA83_0==71) ) {
                alt83=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }
            switch (alt83) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3752:2: kw= 'final'
                    {
                    kw=(Token)match(input,100,FOLLOW_100_in_ruleClassVirtualSpecifier10898); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getClassVirtualSpecifierAccess().getFinalKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3759:2: kw= 'explicit'
                    {
                    kw=(Token)match(input,71,FOLLOW_71_in_ruleClassVirtualSpecifier10917); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getClassVirtualSpecifierAccess().getExplicitKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleClassVirtualSpecifier"


    // $ANTLR start "entryRuleClassKey"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3772:1: entryRuleClassKey returns [String current=null] : iv_ruleClassKey= ruleClassKey EOF ;
    public final String entryRuleClassKey() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleClassKey = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3773:2: (iv_ruleClassKey= ruleClassKey EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3774:2: iv_ruleClassKey= ruleClassKey EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassKeyRule()); 
            }
            pushFollow(FOLLOW_ruleClassKey_in_entryRuleClassKey10958);
            iv_ruleClassKey=ruleClassKey();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassKey.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassKey10969); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3781:1: ruleClassKey returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'class' | kw= 'struct' | kw= 'union' ) ;
    public final AntlrDatatypeRuleToken ruleClassKey() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3784:28: ( (kw= 'class' | kw= 'struct' | kw= 'union' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3785:1: (kw= 'class' | kw= 'struct' | kw= 'union' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3785:1: (kw= 'class' | kw= 'struct' | kw= 'union' )
            int alt84=3;
            switch ( input.LA(1) ) {
            case 90:
                {
                alt84=1;
                }
                break;
            case 91:
                {
                alt84=2;
                }
                break;
            case 101:
                {
                alt84=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }

            switch (alt84) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3786:2: kw= 'class'
                    {
                    kw=(Token)match(input,90,FOLLOW_90_in_ruleClassKey11007); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getClassKeyAccess().getClassKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3793:2: kw= 'struct'
                    {
                    kw=(Token)match(input,91,FOLLOW_91_in_ruleClassKey11026); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getClassKeyAccess().getStructKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3800:2: kw= 'union'
                    {
                    kw=(Token)match(input,101,FOLLOW_101_in_ruleClassKey11045); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getClassKeyAccess().getUnionKeyword_2()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleClassKey"


    // $ANTLR start "entryRuleMemberSpecification"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3813:1: entryRuleMemberSpecification returns [String current=null] : iv_ruleMemberSpecification= ruleMemberSpecification EOF ;
    public final String entryRuleMemberSpecification() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMemberSpecification = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3814:2: (iv_ruleMemberSpecification= ruleMemberSpecification EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3815:2: iv_ruleMemberSpecification= ruleMemberSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMemberSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleMemberSpecification_in_entryRuleMemberSpecification11086);
            iv_ruleMemberSpecification=ruleMemberSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMemberSpecification.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMemberSpecification11097); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3822:1: ruleMemberSpecification returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_MemberDeclaration_0= ruleMemberDeclaration | (this_AccessSpecifier_1= ruleAccessSpecifier kw= ':' ) ) (this_MemberSpecification_3= ruleMemberSpecification )? ) ;
    public final AntlrDatatypeRuleToken ruleMemberSpecification() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_MemberDeclaration_0 = null;

        AntlrDatatypeRuleToken this_AccessSpecifier_1 = null;

        AntlrDatatypeRuleToken this_MemberSpecification_3 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3825:28: ( ( (this_MemberDeclaration_0= ruleMemberDeclaration | (this_AccessSpecifier_1= ruleAccessSpecifier kw= ':' ) ) (this_MemberSpecification_3= ruleMemberSpecification )? ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3826:1: ( (this_MemberDeclaration_0= ruleMemberDeclaration | (this_AccessSpecifier_1= ruleAccessSpecifier kw= ':' ) ) (this_MemberSpecification_3= ruleMemberSpecification )? )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3826:1: ( (this_MemberDeclaration_0= ruleMemberDeclaration | (this_AccessSpecifier_1= ruleAccessSpecifier kw= ':' ) ) (this_MemberSpecification_3= ruleMemberSpecification )? )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3826:2: (this_MemberDeclaration_0= ruleMemberDeclaration | (this_AccessSpecifier_1= ruleAccessSpecifier kw= ':' ) ) (this_MemberSpecification_3= ruleMemberSpecification )?
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3826:2: (this_MemberDeclaration_0= ruleMemberDeclaration | (this_AccessSpecifier_1= ruleAccessSpecifier kw= ':' ) )
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==EOF||LA85_0==RULE_ID||LA85_0==41||LA85_0==57||LA85_0==59||(LA85_0>=61 && LA85_0<=91)||LA85_0==93||LA85_0==99||LA85_0==101||LA85_0==153||(LA85_0>=155 && LA85_0<=156)) ) {
                alt85=1;
            }
            else if ( ((LA85_0>=105 && LA85_0<=107)) ) {
                alt85=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }
            switch (alt85) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3827:5: this_MemberDeclaration_0= ruleMemberDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMemberSpecificationAccess().getMemberDeclarationParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMemberDeclaration_in_ruleMemberSpecification11145);
                    this_MemberDeclaration_0=ruleMemberDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_MemberDeclaration_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3838:6: (this_AccessSpecifier_1= ruleAccessSpecifier kw= ':' )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3838:6: (this_AccessSpecifier_1= ruleAccessSpecifier kw= ':' )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3839:5: this_AccessSpecifier_1= ruleAccessSpecifier kw= ':'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMemberSpecificationAccess().getAccessSpecifierParserRuleCall_0_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAccessSpecifier_in_ruleMemberSpecification11179);
                    this_AccessSpecifier_1=ruleAccessSpecifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_AccessSpecifier_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleMemberSpecification11197); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getMemberSpecificationAccess().getColonKeyword_0_1_1()); 
                          
                    }

                    }


                    }
                    break;

            }

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3855:3: (this_MemberSpecification_3= ruleMemberSpecification )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==RULE_ID||LA86_0==41||LA86_0==57||LA86_0==59||(LA86_0>=61 && LA86_0<=91)||LA86_0==93||LA86_0==99||LA86_0==101||(LA86_0>=105 && LA86_0<=107)||LA86_0==153||(LA86_0>=155 && LA86_0<=156)) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3856:5: this_MemberSpecification_3= ruleMemberSpecification
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMemberSpecificationAccess().getMemberSpecificationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMemberSpecification_in_ruleMemberSpecification11222);
                    this_MemberSpecification_3=ruleMemberSpecification();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_MemberSpecification_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleMemberSpecification"


    // $ANTLR start "entryRuleMemberDeclaration"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3874:1: entryRuleMemberDeclaration returns [String current=null] : iv_ruleMemberDeclaration= ruleMemberDeclaration EOF ;
    public final String entryRuleMemberDeclaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMemberDeclaration = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3875:2: (iv_ruleMemberDeclaration= ruleMemberDeclaration EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3876:2: iv_ruleMemberDeclaration= ruleMemberDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMemberDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleMemberDeclaration_in_entryRuleMemberDeclaration11270);
            iv_ruleMemberDeclaration=ruleMemberDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMemberDeclaration.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMemberDeclaration11281); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3883:1: ruleMemberDeclaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_MemberOrFunctionDeclaration_0= ruleMemberOrFunctionDeclaration | this_UsingDeclaration_1= ruleUsingDeclaration | this_StaticAssertDeclaration_2= ruleStaticAssertDeclaration | this_TemplateDeclaration_3= ruleTemplateDeclaration | this_AliasDeclaration_4= ruleAliasDeclaration ) ;
    public final AntlrDatatypeRuleToken ruleMemberDeclaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_MemberOrFunctionDeclaration_0 = null;

        AntlrDatatypeRuleToken this_UsingDeclaration_1 = null;

        AntlrDatatypeRuleToken this_StaticAssertDeclaration_2 = null;

        AntlrDatatypeRuleToken this_TemplateDeclaration_3 = null;

        AntlrDatatypeRuleToken this_AliasDeclaration_4 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3886:28: ( (this_MemberOrFunctionDeclaration_0= ruleMemberOrFunctionDeclaration | this_UsingDeclaration_1= ruleUsingDeclaration | this_StaticAssertDeclaration_2= ruleStaticAssertDeclaration | this_TemplateDeclaration_3= ruleTemplateDeclaration | this_AliasDeclaration_4= ruleAliasDeclaration ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3887:1: (this_MemberOrFunctionDeclaration_0= ruleMemberOrFunctionDeclaration | this_UsingDeclaration_1= ruleUsingDeclaration | this_StaticAssertDeclaration_2= ruleStaticAssertDeclaration | this_TemplateDeclaration_3= ruleTemplateDeclaration | this_AliasDeclaration_4= ruleAliasDeclaration )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3887:1: (this_MemberOrFunctionDeclaration_0= ruleMemberOrFunctionDeclaration | this_UsingDeclaration_1= ruleUsingDeclaration | this_StaticAssertDeclaration_2= ruleStaticAssertDeclaration | this_TemplateDeclaration_3= ruleTemplateDeclaration | this_AliasDeclaration_4= ruleAliasDeclaration )
            int alt87=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 41:
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
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 93:
            case 99:
            case 101:
            case 153:
            case 155:
            case 156:
                {
                alt87=1;
                }
                break;
            case 57:
                {
                int LA87_2 = input.LA(2);

                if ( (LA87_2==72||LA87_2==93||LA87_2==156) ) {
                    alt87=2;
                }
                else if ( (LA87_2==RULE_ID) ) {
                    alt87=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 87, 2, input);

                    throw nvae;
                }
                }
                break;
            case 59:
                {
                alt87=3;
                }
                break;
            case 73:
                {
                alt87=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }

            switch (alt87) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3888:5: this_MemberOrFunctionDeclaration_0= ruleMemberOrFunctionDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMemberDeclarationAccess().getMemberOrFunctionDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMemberOrFunctionDeclaration_in_ruleMemberDeclaration11328);
                    this_MemberOrFunctionDeclaration_0=ruleMemberOrFunctionDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_MemberOrFunctionDeclaration_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3900:5: this_UsingDeclaration_1= ruleUsingDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMemberDeclarationAccess().getUsingDeclarationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUsingDeclaration_in_ruleMemberDeclaration11361);
                    this_UsingDeclaration_1=ruleUsingDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_UsingDeclaration_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3912:5: this_StaticAssertDeclaration_2= ruleStaticAssertDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMemberDeclarationAccess().getStaticAssertDeclarationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStaticAssertDeclaration_in_ruleMemberDeclaration11394);
                    this_StaticAssertDeclaration_2=ruleStaticAssertDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_StaticAssertDeclaration_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3924:5: this_TemplateDeclaration_3= ruleTemplateDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMemberDeclarationAccess().getTemplateDeclarationParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTemplateDeclaration_in_ruleMemberDeclaration11427);
                    this_TemplateDeclaration_3=ruleTemplateDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_TemplateDeclaration_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3936:5: this_AliasDeclaration_4= ruleAliasDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMemberDeclarationAccess().getAliasDeclarationParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAliasDeclaration_in_ruleMemberDeclaration11460);
                    this_AliasDeclaration_4=ruleAliasDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_AliasDeclaration_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleMemberDeclaration"


    // $ANTLR start "entryRuleMemberOrFunctionDeclaration"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3954:1: entryRuleMemberOrFunctionDeclaration returns [String current=null] : iv_ruleMemberOrFunctionDeclaration= ruleMemberOrFunctionDeclaration EOF ;
    public final String entryRuleMemberOrFunctionDeclaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMemberOrFunctionDeclaration = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3955:2: (iv_ruleMemberOrFunctionDeclaration= ruleMemberOrFunctionDeclaration EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3956:2: iv_ruleMemberOrFunctionDeclaration= ruleMemberOrFunctionDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMemberOrFunctionDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleMemberOrFunctionDeclaration_in_entryRuleMemberOrFunctionDeclaration11506);
            iv_ruleMemberOrFunctionDeclaration=ruleMemberOrFunctionDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMemberOrFunctionDeclaration.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMemberOrFunctionDeclaration11517); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3963:1: ruleMemberOrFunctionDeclaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_DeclarationSpecifier_0= ruleDeclarationSpecifier )* (this_FunctionDeclarationSuffix_1= ruleFunctionDeclarationSuffix | (this_MemberDeclarationSuffix_2= ruleMemberDeclarationSuffix kw= ';' ) ) ) ;
    public final AntlrDatatypeRuleToken ruleMemberOrFunctionDeclaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_DeclarationSpecifier_0 = null;

        AntlrDatatypeRuleToken this_FunctionDeclarationSuffix_1 = null;

        AntlrDatatypeRuleToken this_MemberDeclarationSuffix_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3966:28: ( ( (this_DeclarationSpecifier_0= ruleDeclarationSpecifier )* (this_FunctionDeclarationSuffix_1= ruleFunctionDeclarationSuffix | (this_MemberDeclarationSuffix_2= ruleMemberDeclarationSuffix kw= ';' ) ) ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3967:1: ( (this_DeclarationSpecifier_0= ruleDeclarationSpecifier )* (this_FunctionDeclarationSuffix_1= ruleFunctionDeclarationSuffix | (this_MemberDeclarationSuffix_2= ruleMemberDeclarationSuffix kw= ';' ) ) )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3967:1: ( (this_DeclarationSpecifier_0= ruleDeclarationSpecifier )* (this_FunctionDeclarationSuffix_1= ruleFunctionDeclarationSuffix | (this_MemberDeclarationSuffix_2= ruleMemberDeclarationSuffix kw= ';' ) ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3967:2: (this_DeclarationSpecifier_0= ruleDeclarationSpecifier )* (this_FunctionDeclarationSuffix_1= ruleFunctionDeclarationSuffix | (this_MemberDeclarationSuffix_2= ruleMemberDeclarationSuffix kw= ';' ) )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3967:2: (this_DeclarationSpecifier_0= ruleDeclarationSpecifier )*
            loop88:
            do {
                int alt88=2;
                int LA88_0 = input.LA(1);

                if ( (LA88_0==RULE_ID||(LA88_0>=61 && LA88_0<=72)||(LA88_0>=74 && LA88_0<=91)||LA88_0==93||LA88_0==101||LA88_0==153||LA88_0==156) ) {
                    alt88=1;
                }


                switch (alt88) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3968:5: this_DeclarationSpecifier_0= ruleDeclarationSpecifier
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getMemberOrFunctionDeclarationAccess().getDeclarationSpecifierParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleDeclarationSpecifier_in_ruleMemberOrFunctionDeclaration11565);
            	    this_DeclarationSpecifier_0=ruleDeclarationSpecifier();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_DeclarationSpecifier_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop88;
                }
            } while (true);

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3978:3: (this_FunctionDeclarationSuffix_1= ruleFunctionDeclarationSuffix | (this_MemberDeclarationSuffix_2= ruleMemberDeclarationSuffix kw= ';' ) )
            int alt89=2;
            switch ( input.LA(1) ) {
            case 99:
                {
                int LA89_1 = input.LA(2);

                if ( (LA89_1==155) ) {
                    int LA89_2 = input.LA(3);

                    if ( (LA89_2==45) ) {
                        alt89=1;
                    }
                    else if ( ((LA89_2>=41 && LA89_2<=42)||LA89_2==49||LA89_2==60||LA89_2==100||(LA89_2>=102 && LA89_2<=103)) ) {
                        alt89=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 89, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 89, 1, input);

                    throw nvae;
                }
                }
                break;
            case 155:
                {
                int LA89_2 = input.LA(2);

                if ( (LA89_2==45) ) {
                    alt89=1;
                }
                else if ( ((LA89_2>=41 && LA89_2<=42)||LA89_2==49||LA89_2==60||LA89_2==100||(LA89_2>=102 && LA89_2<=103)) ) {
                    alt89=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 89, 2, input);

                    throw nvae;
                }
                }
                break;
            case 41:
                {
                alt89=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }

            switch (alt89) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3979:5: this_FunctionDeclarationSuffix_1= ruleFunctionDeclarationSuffix
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMemberOrFunctionDeclarationAccess().getFunctionDeclarationSuffixParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFunctionDeclarationSuffix_in_ruleMemberOrFunctionDeclaration11595);
                    this_FunctionDeclarationSuffix_1=ruleFunctionDeclarationSuffix();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_FunctionDeclarationSuffix_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3990:6: (this_MemberDeclarationSuffix_2= ruleMemberDeclarationSuffix kw= ';' )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3990:6: (this_MemberDeclarationSuffix_2= ruleMemberDeclarationSuffix kw= ';' )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3991:5: this_MemberDeclarationSuffix_2= ruleMemberDeclarationSuffix kw= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMemberOrFunctionDeclarationAccess().getMemberDeclarationSuffixParserRuleCall_1_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMemberDeclarationSuffix_in_ruleMemberOrFunctionDeclaration11629);
                    this_MemberDeclarationSuffix_2=ruleMemberDeclarationSuffix();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_MemberDeclarationSuffix_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleMemberOrFunctionDeclaration11647); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getMemberOrFunctionDeclarationAccess().getSemicolonKeyword_1_1_1()); 
                          
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleMemberOrFunctionDeclaration"


    // $ANTLR start "entryRuleMemberDeclarationSuffix"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4015:1: entryRuleMemberDeclarationSuffix returns [String current=null] : iv_ruleMemberDeclarationSuffix= ruleMemberDeclarationSuffix EOF ;
    public final String entryRuleMemberDeclarationSuffix() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMemberDeclarationSuffix = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4016:2: (iv_ruleMemberDeclarationSuffix= ruleMemberDeclarationSuffix EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4017:2: iv_ruleMemberDeclarationSuffix= ruleMemberDeclarationSuffix EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMemberDeclarationSuffixRule()); 
            }
            pushFollow(FOLLOW_ruleMemberDeclarationSuffix_in_entryRuleMemberDeclarationSuffix11690);
            iv_ruleMemberDeclarationSuffix=ruleMemberDeclarationSuffix();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMemberDeclarationSuffix.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMemberDeclarationSuffix11701); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4024:1: ruleMemberDeclarationSuffix returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_MemberDeclaratorList_0= ruleMemberDeclaratorList )? ;
    public final AntlrDatatypeRuleToken ruleMemberDeclarationSuffix() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_MemberDeclaratorList_0 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4027:28: ( (this_MemberDeclaratorList_0= ruleMemberDeclaratorList )? )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4028:1: (this_MemberDeclaratorList_0= ruleMemberDeclaratorList )?
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4028:1: (this_MemberDeclaratorList_0= ruleMemberDeclaratorList )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==99||LA90_0==155) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4029:5: this_MemberDeclaratorList_0= ruleMemberDeclaratorList
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMemberDeclarationSuffixAccess().getMemberDeclaratorListParserRuleCall()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMemberDeclaratorList_in_ruleMemberDeclarationSuffix11748);
                    this_MemberDeclaratorList_0=ruleMemberDeclaratorList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_MemberDeclaratorList_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleMemberDeclarationSuffix"


    // $ANTLR start "entryRuleMemberDeclaratorList"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4047:1: entryRuleMemberDeclaratorList returns [String current=null] : iv_ruleMemberDeclaratorList= ruleMemberDeclaratorList EOF ;
    public final String entryRuleMemberDeclaratorList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMemberDeclaratorList = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4048:2: (iv_ruleMemberDeclaratorList= ruleMemberDeclaratorList EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4049:2: iv_ruleMemberDeclaratorList= ruleMemberDeclaratorList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMemberDeclaratorListRule()); 
            }
            pushFollow(FOLLOW_ruleMemberDeclaratorList_in_entryRuleMemberDeclaratorList11795);
            iv_ruleMemberDeclaratorList=ruleMemberDeclaratorList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMemberDeclaratorList.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMemberDeclaratorList11806); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4056:1: ruleMemberDeclaratorList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_MemberDeclarator_0= ruleMemberDeclarator (kw= ',' this_MemberDeclarator_2= ruleMemberDeclarator )* ) ;
    public final AntlrDatatypeRuleToken ruleMemberDeclaratorList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_MemberDeclarator_0 = null;

        AntlrDatatypeRuleToken this_MemberDeclarator_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4059:28: ( (this_MemberDeclarator_0= ruleMemberDeclarator (kw= ',' this_MemberDeclarator_2= ruleMemberDeclarator )* ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4060:1: (this_MemberDeclarator_0= ruleMemberDeclarator (kw= ',' this_MemberDeclarator_2= ruleMemberDeclarator )* )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4060:1: (this_MemberDeclarator_0= ruleMemberDeclarator (kw= ',' this_MemberDeclarator_2= ruleMemberDeclarator )* )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4061:5: this_MemberDeclarator_0= ruleMemberDeclarator (kw= ',' this_MemberDeclarator_2= ruleMemberDeclarator )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMemberDeclaratorListAccess().getMemberDeclaratorParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleMemberDeclarator_in_ruleMemberDeclaratorList11853);
            this_MemberDeclarator_0=ruleMemberDeclarator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_MemberDeclarator_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4071:1: (kw= ',' this_MemberDeclarator_2= ruleMemberDeclarator )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==60) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4072:2: kw= ',' this_MemberDeclarator_2= ruleMemberDeclarator
            	    {
            	    kw=(Token)match(input,60,FOLLOW_60_in_ruleMemberDeclaratorList11872); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getMemberDeclaratorListAccess().getCommaKeyword_1_0()); 
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getMemberDeclaratorListAccess().getMemberDeclaratorParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleMemberDeclarator_in_ruleMemberDeclaratorList11894);
            	    this_MemberDeclarator_2=ruleMemberDeclarator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_MemberDeclarator_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop91;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleMemberDeclaratorList"


    // $ANTLR start "entryRuleMemberDeclarator"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4096:1: entryRuleMemberDeclarator returns [String current=null] : iv_ruleMemberDeclarator= ruleMemberDeclarator EOF ;
    public final String entryRuleMemberDeclarator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMemberDeclarator = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4097:2: (iv_ruleMemberDeclarator= ruleMemberDeclarator EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4098:2: iv_ruleMemberDeclarator= ruleMemberDeclarator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMemberDeclaratorRule()); 
            }
            pushFollow(FOLLOW_ruleMemberDeclarator_in_entryRuleMemberDeclarator11942);
            iv_ruleMemberDeclarator=ruleMemberDeclarator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMemberDeclarator.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMemberDeclarator11953); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4105:1: ruleMemberDeclarator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DeclaratorId_0= ruleDeclaratorId (this_VirtualSpecifier_1= ruleVirtualSpecifier )* ( (this_PureSpecifier_2= rulePureSpecifier )? | this_BraceOrEqualInitializer_3= ruleBraceOrEqualInitializer ) ) ;
    public final AntlrDatatypeRuleToken ruleMemberDeclarator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_DeclaratorId_0 = null;

        AntlrDatatypeRuleToken this_VirtualSpecifier_1 = null;

        AntlrDatatypeRuleToken this_PureSpecifier_2 = null;

        AntlrDatatypeRuleToken this_BraceOrEqualInitializer_3 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4108:28: ( (this_DeclaratorId_0= ruleDeclaratorId (this_VirtualSpecifier_1= ruleVirtualSpecifier )* ( (this_PureSpecifier_2= rulePureSpecifier )? | this_BraceOrEqualInitializer_3= ruleBraceOrEqualInitializer ) ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4109:1: (this_DeclaratorId_0= ruleDeclaratorId (this_VirtualSpecifier_1= ruleVirtualSpecifier )* ( (this_PureSpecifier_2= rulePureSpecifier )? | this_BraceOrEqualInitializer_3= ruleBraceOrEqualInitializer ) )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4109:1: (this_DeclaratorId_0= ruleDeclaratorId (this_VirtualSpecifier_1= ruleVirtualSpecifier )* ( (this_PureSpecifier_2= rulePureSpecifier )? | this_BraceOrEqualInitializer_3= ruleBraceOrEqualInitializer ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4110:5: this_DeclaratorId_0= ruleDeclaratorId (this_VirtualSpecifier_1= ruleVirtualSpecifier )* ( (this_PureSpecifier_2= rulePureSpecifier )? | this_BraceOrEqualInitializer_3= ruleBraceOrEqualInitializer )
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMemberDeclaratorAccess().getDeclaratorIdParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleDeclaratorId_in_ruleMemberDeclarator12000);
            this_DeclaratorId_0=ruleDeclaratorId();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_DeclaratorId_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4120:1: (this_VirtualSpecifier_1= ruleVirtualSpecifier )*
            loop92:
            do {
                int alt92=2;
                int LA92_0 = input.LA(1);

                if ( (LA92_0==100||(LA92_0>=102 && LA92_0<=103)) ) {
                    alt92=1;
                }


                switch (alt92) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4121:5: this_VirtualSpecifier_1= ruleVirtualSpecifier
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getMemberDeclaratorAccess().getVirtualSpecifierParserRuleCall_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleVirtualSpecifier_in_ruleMemberDeclarator12028);
            	    this_VirtualSpecifier_1=ruleVirtualSpecifier();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_VirtualSpecifier_1);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop92;
                }
            } while (true);

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4131:3: ( (this_PureSpecifier_2= rulePureSpecifier )? | this_BraceOrEqualInitializer_3= ruleBraceOrEqualInitializer )
            int alt94=2;
            switch ( input.LA(1) ) {
            case 49:
                {
                int LA94_1 = input.LA(2);

                if ( (LA94_1==42||LA94_1==157) ) {
                    alt94=2;
                }
                else if ( (LA94_1==104) ) {
                    alt94=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 94, 1, input);

                    throw nvae;
                }
                }
                break;
            case EOF:
            case 41:
            case 60:
                {
                alt94=1;
                }
                break;
            case 42:
                {
                alt94=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }

            switch (alt94) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4131:4: (this_PureSpecifier_2= rulePureSpecifier )?
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4131:4: (this_PureSpecifier_2= rulePureSpecifier )?
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==49) ) {
                        alt93=1;
                    }
                    switch (alt93) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4132:5: this_PureSpecifier_2= rulePureSpecifier
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getMemberDeclaratorAccess().getPureSpecifierParserRuleCall_2_0()); 
                                  
                            }
                            pushFollow(FOLLOW_rulePureSpecifier_in_ruleMemberDeclarator12059);
                            this_PureSpecifier_2=rulePureSpecifier();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_PureSpecifier_2);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4144:5: this_BraceOrEqualInitializer_3= ruleBraceOrEqualInitializer
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMemberDeclaratorAccess().getBraceOrEqualInitializerParserRuleCall_2_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBraceOrEqualInitializer_in_ruleMemberDeclarator12094);
                    this_BraceOrEqualInitializer_3=ruleBraceOrEqualInitializer();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BraceOrEqualInitializer_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleMemberDeclarator"


    // $ANTLR start "entryRuleVirtualSpecifier"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4162:1: entryRuleVirtualSpecifier returns [String current=null] : iv_ruleVirtualSpecifier= ruleVirtualSpecifier EOF ;
    public final String entryRuleVirtualSpecifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVirtualSpecifier = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4163:2: (iv_ruleVirtualSpecifier= ruleVirtualSpecifier EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4164:2: iv_ruleVirtualSpecifier= ruleVirtualSpecifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVirtualSpecifierRule()); 
            }
            pushFollow(FOLLOW_ruleVirtualSpecifier_in_entryRuleVirtualSpecifier12141);
            iv_ruleVirtualSpecifier=ruleVirtualSpecifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVirtualSpecifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVirtualSpecifier12152); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4171:1: ruleVirtualSpecifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'override' | kw= 'final' | kw= 'new' ) ;
    public final AntlrDatatypeRuleToken ruleVirtualSpecifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4174:28: ( (kw= 'override' | kw= 'final' | kw= 'new' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4175:1: (kw= 'override' | kw= 'final' | kw= 'new' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4175:1: (kw= 'override' | kw= 'final' | kw= 'new' )
            int alt95=3;
            switch ( input.LA(1) ) {
            case 102:
                {
                alt95=1;
                }
                break;
            case 100:
                {
                alt95=2;
                }
                break;
            case 103:
                {
                alt95=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }

            switch (alt95) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4176:2: kw= 'override'
                    {
                    kw=(Token)match(input,102,FOLLOW_102_in_ruleVirtualSpecifier12190); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVirtualSpecifierAccess().getOverrideKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4183:2: kw= 'final'
                    {
                    kw=(Token)match(input,100,FOLLOW_100_in_ruleVirtualSpecifier12209); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVirtualSpecifierAccess().getFinalKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4190:2: kw= 'new'
                    {
                    kw=(Token)match(input,103,FOLLOW_103_in_ruleVirtualSpecifier12228); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVirtualSpecifierAccess().getNewKeyword_2()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleVirtualSpecifier"


    // $ANTLR start "entryRulePureSpecifier"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4203:1: entryRulePureSpecifier returns [String current=null] : iv_rulePureSpecifier= rulePureSpecifier EOF ;
    public final String entryRulePureSpecifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePureSpecifier = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4204:2: (iv_rulePureSpecifier= rulePureSpecifier EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4205:2: iv_rulePureSpecifier= rulePureSpecifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPureSpecifierRule()); 
            }
            pushFollow(FOLLOW_rulePureSpecifier_in_entryRulePureSpecifier12269);
            iv_rulePureSpecifier=rulePureSpecifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePureSpecifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePureSpecifier12280); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4212:1: rulePureSpecifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '=' kw= '0' ) ;
    public final AntlrDatatypeRuleToken rulePureSpecifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4215:28: ( (kw= '=' kw= '0' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4216:1: (kw= '=' kw= '0' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4216:1: (kw= '=' kw= '0' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4217:2: kw= '=' kw= '0'
            {
            kw=(Token)match(input,49,FOLLOW_49_in_rulePureSpecifier12318); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getPureSpecifierAccess().getEqualsSignKeyword_0()); 
                  
            }
            kw=(Token)match(input,104,FOLLOW_104_in_rulePureSpecifier12331); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getPureSpecifierAccess().getDigitZeroKeyword_1()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePureSpecifier"


    // $ANTLR start "entryRuleBaseClause"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4236:1: entryRuleBaseClause returns [String current=null] : iv_ruleBaseClause= ruleBaseClause EOF ;
    public final String entryRuleBaseClause() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBaseClause = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4237:2: (iv_ruleBaseClause= ruleBaseClause EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4238:2: iv_ruleBaseClause= ruleBaseClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBaseClauseRule()); 
            }
            pushFollow(FOLLOW_ruleBaseClause_in_entryRuleBaseClause12372);
            iv_ruleBaseClause=ruleBaseClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBaseClause.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBaseClause12383); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4245:1: ruleBaseClause returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= ':' this_BaseSpecifierList_1= ruleBaseSpecifierList ) ;
    public final AntlrDatatypeRuleToken ruleBaseClause() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_BaseSpecifierList_1 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4248:28: ( (kw= ':' this_BaseSpecifierList_1= ruleBaseSpecifierList ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4249:1: (kw= ':' this_BaseSpecifierList_1= ruleBaseSpecifierList )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4249:1: (kw= ':' this_BaseSpecifierList_1= ruleBaseSpecifierList )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4250:2: kw= ':' this_BaseSpecifierList_1= ruleBaseSpecifierList
            {
            kw=(Token)match(input,38,FOLLOW_38_in_ruleBaseClause12421); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getBaseClauseAccess().getColonKeyword_0()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBaseClauseAccess().getBaseSpecifierListParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleBaseSpecifierList_in_ruleBaseClause12443);
            this_BaseSpecifierList_1=ruleBaseSpecifierList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_BaseSpecifierList_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBaseClause"


    // $ANTLR start "entryRuleBaseSpecifierList"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4274:1: entryRuleBaseSpecifierList returns [String current=null] : iv_ruleBaseSpecifierList= ruleBaseSpecifierList EOF ;
    public final String entryRuleBaseSpecifierList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBaseSpecifierList = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4275:2: (iv_ruleBaseSpecifierList= ruleBaseSpecifierList EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4276:2: iv_ruleBaseSpecifierList= ruleBaseSpecifierList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBaseSpecifierListRule()); 
            }
            pushFollow(FOLLOW_ruleBaseSpecifierList_in_entryRuleBaseSpecifierList12489);
            iv_ruleBaseSpecifierList=ruleBaseSpecifierList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBaseSpecifierList.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBaseSpecifierList12500); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4283:1: ruleBaseSpecifierList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_BaseSpecifier_0= ruleBaseSpecifier (kw= '...' )? (kw= ',' this_BaseSpecifier_3= ruleBaseSpecifier (kw= '...' )? )* ) ;
    public final AntlrDatatypeRuleToken ruleBaseSpecifierList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_BaseSpecifier_0 = null;

        AntlrDatatypeRuleToken this_BaseSpecifier_3 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4286:28: ( (this_BaseSpecifier_0= ruleBaseSpecifier (kw= '...' )? (kw= ',' this_BaseSpecifier_3= ruleBaseSpecifier (kw= '...' )? )* ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4287:1: (this_BaseSpecifier_0= ruleBaseSpecifier (kw= '...' )? (kw= ',' this_BaseSpecifier_3= ruleBaseSpecifier (kw= '...' )? )* )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4287:1: (this_BaseSpecifier_0= ruleBaseSpecifier (kw= '...' )? (kw= ',' this_BaseSpecifier_3= ruleBaseSpecifier (kw= '...' )? )* )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4288:5: this_BaseSpecifier_0= ruleBaseSpecifier (kw= '...' )? (kw= ',' this_BaseSpecifier_3= ruleBaseSpecifier (kw= '...' )? )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBaseSpecifierListAccess().getBaseSpecifierParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBaseSpecifier_in_ruleBaseSpecifierList12547);
            this_BaseSpecifier_0=ruleBaseSpecifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_BaseSpecifier_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4298:1: (kw= '...' )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==99) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4299:2: kw= '...'
                    {
                    kw=(Token)match(input,99,FOLLOW_99_in_ruleBaseSpecifierList12566); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBaseSpecifierListAccess().getFullStopFullStopFullStopKeyword_1()); 
                          
                    }

                    }
                    break;

            }

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4304:3: (kw= ',' this_BaseSpecifier_3= ruleBaseSpecifier (kw= '...' )? )*
            loop98:
            do {
                int alt98=2;
                int LA98_0 = input.LA(1);

                if ( (LA98_0==60) ) {
                    alt98=1;
                }


                switch (alt98) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4305:2: kw= ',' this_BaseSpecifier_3= ruleBaseSpecifier (kw= '...' )?
            	    {
            	    kw=(Token)match(input,60,FOLLOW_60_in_ruleBaseSpecifierList12582); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getBaseSpecifierListAccess().getCommaKeyword_2_0()); 
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getBaseSpecifierListAccess().getBaseSpecifierParserRuleCall_2_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleBaseSpecifier_in_ruleBaseSpecifierList12604);
            	    this_BaseSpecifier_3=ruleBaseSpecifier();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_BaseSpecifier_3);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4321:1: (kw= '...' )?
            	    int alt97=2;
            	    int LA97_0 = input.LA(1);

            	    if ( (LA97_0==99) ) {
            	        alt97=1;
            	    }
            	    switch (alt97) {
            	        case 1 :
            	            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4322:2: kw= '...'
            	            {
            	            kw=(Token)match(input,99,FOLLOW_99_in_ruleBaseSpecifierList12623); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      current.merge(kw);
            	                      newLeafNode(kw, grammarAccess.getBaseSpecifierListAccess().getFullStopFullStopFullStopKeyword_2_2()); 
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop98;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBaseSpecifierList"


    // $ANTLR start "entryRuleBaseSpecifier"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4335:1: entryRuleBaseSpecifier returns [String current=null] : iv_ruleBaseSpecifier= ruleBaseSpecifier EOF ;
    public final String entryRuleBaseSpecifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBaseSpecifier = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4336:2: (iv_ruleBaseSpecifier= ruleBaseSpecifier EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4337:2: iv_ruleBaseSpecifier= ruleBaseSpecifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBaseSpecifierRule()); 
            }
            pushFollow(FOLLOW_ruleBaseSpecifier_in_entryRuleBaseSpecifier12668);
            iv_ruleBaseSpecifier=ruleBaseSpecifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBaseSpecifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBaseSpecifier12679); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4344:1: ruleBaseSpecifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= 'virtual' (this_AccessSpecifier_1= ruleAccessSpecifier )? ) | (this_AccessSpecifier_2= ruleAccessSpecifier (kw= 'virtual' )? ) )? this_ClassOrDeclarationType_4= ruleClassOrDeclarationType ) ;
    public final AntlrDatatypeRuleToken ruleBaseSpecifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_AccessSpecifier_1 = null;

        AntlrDatatypeRuleToken this_AccessSpecifier_2 = null;

        AntlrDatatypeRuleToken this_ClassOrDeclarationType_4 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4347:28: ( ( ( (kw= 'virtual' (this_AccessSpecifier_1= ruleAccessSpecifier )? ) | (this_AccessSpecifier_2= ruleAccessSpecifier (kw= 'virtual' )? ) )? this_ClassOrDeclarationType_4= ruleClassOrDeclarationType ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4348:1: ( ( (kw= 'virtual' (this_AccessSpecifier_1= ruleAccessSpecifier )? ) | (this_AccessSpecifier_2= ruleAccessSpecifier (kw= 'virtual' )? ) )? this_ClassOrDeclarationType_4= ruleClassOrDeclarationType )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4348:1: ( ( (kw= 'virtual' (this_AccessSpecifier_1= ruleAccessSpecifier )? ) | (this_AccessSpecifier_2= ruleAccessSpecifier (kw= 'virtual' )? ) )? this_ClassOrDeclarationType_4= ruleClassOrDeclarationType )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4348:2: ( (kw= 'virtual' (this_AccessSpecifier_1= ruleAccessSpecifier )? ) | (this_AccessSpecifier_2= ruleAccessSpecifier (kw= 'virtual' )? ) )? this_ClassOrDeclarationType_4= ruleClassOrDeclarationType
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4348:2: ( (kw= 'virtual' (this_AccessSpecifier_1= ruleAccessSpecifier )? ) | (this_AccessSpecifier_2= ruleAccessSpecifier (kw= 'virtual' )? ) )?
            int alt101=3;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==70) ) {
                alt101=1;
            }
            else if ( ((LA101_0>=105 && LA101_0<=107)) ) {
                alt101=2;
            }
            switch (alt101) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4348:3: (kw= 'virtual' (this_AccessSpecifier_1= ruleAccessSpecifier )? )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4348:3: (kw= 'virtual' (this_AccessSpecifier_1= ruleAccessSpecifier )? )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4349:2: kw= 'virtual' (this_AccessSpecifier_1= ruleAccessSpecifier )?
                    {
                    kw=(Token)match(input,70,FOLLOW_70_in_ruleBaseSpecifier12719); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBaseSpecifierAccess().getVirtualKeyword_0_0_0()); 
                          
                    }
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4354:1: (this_AccessSpecifier_1= ruleAccessSpecifier )?
                    int alt99=2;
                    int LA99_0 = input.LA(1);

                    if ( ((LA99_0>=105 && LA99_0<=107)) ) {
                        alt99=1;
                    }
                    switch (alt99) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4355:5: this_AccessSpecifier_1= ruleAccessSpecifier
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getBaseSpecifierAccess().getAccessSpecifierParserRuleCall_0_0_1()); 
                                  
                            }
                            pushFollow(FOLLOW_ruleAccessSpecifier_in_ruleBaseSpecifier12742);
                            this_AccessSpecifier_1=ruleAccessSpecifier();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_AccessSpecifier_1);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4366:6: (this_AccessSpecifier_2= ruleAccessSpecifier (kw= 'virtual' )? )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4366:6: (this_AccessSpecifier_2= ruleAccessSpecifier (kw= 'virtual' )? )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4367:5: this_AccessSpecifier_2= ruleAccessSpecifier (kw= 'virtual' )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBaseSpecifierAccess().getAccessSpecifierParserRuleCall_0_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAccessSpecifier_in_ruleBaseSpecifier12779);
                    this_AccessSpecifier_2=ruleAccessSpecifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_AccessSpecifier_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4377:1: (kw= 'virtual' )?
                    int alt100=2;
                    int LA100_0 = input.LA(1);

                    if ( (LA100_0==70) ) {
                        alt100=1;
                    }
                    switch (alt100) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4378:2: kw= 'virtual'
                            {
                            kw=(Token)match(input,70,FOLLOW_70_in_ruleBaseSpecifier12798); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getBaseSpecifierAccess().getVirtualKeyword_0_1_1()); 
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBaseSpecifierAccess().getClassOrDeclarationTypeParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleClassOrDeclarationType_in_ruleBaseSpecifier12825);
            this_ClassOrDeclarationType_4=ruleClassOrDeclarationType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ClassOrDeclarationType_4);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBaseSpecifier"


    // $ANTLR start "entryRuleClassOrDeclarationType"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4402:1: entryRuleClassOrDeclarationType returns [String current=null] : iv_ruleClassOrDeclarationType= ruleClassOrDeclarationType EOF ;
    public final String entryRuleClassOrDeclarationType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleClassOrDeclarationType = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4403:2: (iv_ruleClassOrDeclarationType= ruleClassOrDeclarationType EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4404:2: iv_ruleClassOrDeclarationType= ruleClassOrDeclarationType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassOrDeclarationTypeRule()); 
            }
            pushFollow(FOLLOW_ruleClassOrDeclarationType_in_entryRuleClassOrDeclarationType12871);
            iv_ruleClassOrDeclarationType=ruleClassOrDeclarationType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassOrDeclarationType.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassOrDeclarationType12882); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4411:1: ruleClassOrDeclarationType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= '::' )? (this_NestedNameSpecifier_1= ruleNestedNameSpecifier )? this_TypeName_2= ruleTypeName ) | this_DeclarationTypeSpecifier_3= ruleDeclarationTypeSpecifier ) ;
    public final AntlrDatatypeRuleToken ruleClassOrDeclarationType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_NestedNameSpecifier_1 = null;

        AntlrDatatypeRuleToken this_TypeName_2 = null;

        AntlrDatatypeRuleToken this_DeclarationTypeSpecifier_3 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4414:28: ( ( ( (kw= '::' )? (this_NestedNameSpecifier_1= ruleNestedNameSpecifier )? this_TypeName_2= ruleTypeName ) | this_DeclarationTypeSpecifier_3= ruleDeclarationTypeSpecifier ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4415:1: ( ( (kw= '::' )? (this_NestedNameSpecifier_1= ruleNestedNameSpecifier )? this_TypeName_2= ruleTypeName ) | this_DeclarationTypeSpecifier_3= ruleDeclarationTypeSpecifier )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4415:1: ( ( (kw= '::' )? (this_NestedNameSpecifier_1= ruleNestedNameSpecifier )? this_TypeName_2= ruleTypeName ) | this_DeclarationTypeSpecifier_3= ruleDeclarationTypeSpecifier )
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==RULE_ID||LA104_0==72||LA104_0==156) ) {
                alt104=1;
            }
            else if ( (LA104_0==88) ) {
                alt104=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 104, 0, input);

                throw nvae;
            }
            switch (alt104) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4415:2: ( (kw= '::' )? (this_NestedNameSpecifier_1= ruleNestedNameSpecifier )? this_TypeName_2= ruleTypeName )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4415:2: ( (kw= '::' )? (this_NestedNameSpecifier_1= ruleNestedNameSpecifier )? this_TypeName_2= ruleTypeName )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4415:3: (kw= '::' )? (this_NestedNameSpecifier_1= ruleNestedNameSpecifier )? this_TypeName_2= ruleTypeName
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4415:3: (kw= '::' )?
                    int alt102=2;
                    int LA102_0 = input.LA(1);

                    if ( (LA102_0==72) ) {
                        alt102=1;
                    }
                    switch (alt102) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4416:2: kw= '::'
                            {
                            kw=(Token)match(input,72,FOLLOW_72_in_ruleClassOrDeclarationType12922); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getClassOrDeclarationTypeAccess().getColonColonKeyword_0_0()); 
                                  
                            }

                            }
                            break;

                    }

                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4421:3: (this_NestedNameSpecifier_1= ruleNestedNameSpecifier )?
                    int alt103=2;
                    int LA103_0 = input.LA(1);

                    if ( (LA103_0==156) ) {
                        alt103=1;
                    }
                    switch (alt103) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4422:5: this_NestedNameSpecifier_1= ruleNestedNameSpecifier
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getClassOrDeclarationTypeAccess().getNestedNameSpecifierParserRuleCall_0_1()); 
                                  
                            }
                            pushFollow(FOLLOW_ruleNestedNameSpecifier_in_ruleClassOrDeclarationType12947);
                            this_NestedNameSpecifier_1=ruleNestedNameSpecifier();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_NestedNameSpecifier_1);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getClassOrDeclarationTypeAccess().getTypeNameParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTypeName_in_ruleClassOrDeclarationType12976);
                    this_TypeName_2=ruleTypeName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_TypeName_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4445:5: this_DeclarationTypeSpecifier_3= ruleDeclarationTypeSpecifier
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getClassOrDeclarationTypeAccess().getDeclarationTypeSpecifierParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDeclarationTypeSpecifier_in_ruleClassOrDeclarationType13010);
                    this_DeclarationTypeSpecifier_3=ruleDeclarationTypeSpecifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_DeclarationTypeSpecifier_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleClassOrDeclarationType"


    // $ANTLR start "entryRuleAccessSpecifier"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4463:1: entryRuleAccessSpecifier returns [String current=null] : iv_ruleAccessSpecifier= ruleAccessSpecifier EOF ;
    public final String entryRuleAccessSpecifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAccessSpecifier = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4464:2: (iv_ruleAccessSpecifier= ruleAccessSpecifier EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4465:2: iv_ruleAccessSpecifier= ruleAccessSpecifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAccessSpecifierRule()); 
            }
            pushFollow(FOLLOW_ruleAccessSpecifier_in_entryRuleAccessSpecifier13056);
            iv_ruleAccessSpecifier=ruleAccessSpecifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAccessSpecifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAccessSpecifier13067); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4472:1: ruleAccessSpecifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'private' | kw= 'protected' | kw= 'public' ) ;
    public final AntlrDatatypeRuleToken ruleAccessSpecifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4475:28: ( (kw= 'private' | kw= 'protected' | kw= 'public' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4476:1: (kw= 'private' | kw= 'protected' | kw= 'public' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4476:1: (kw= 'private' | kw= 'protected' | kw= 'public' )
            int alt105=3;
            switch ( input.LA(1) ) {
            case 105:
                {
                alt105=1;
                }
                break;
            case 106:
                {
                alt105=2;
                }
                break;
            case 107:
                {
                alt105=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 105, 0, input);

                throw nvae;
            }

            switch (alt105) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4477:2: kw= 'private'
                    {
                    kw=(Token)match(input,105,FOLLOW_105_in_ruleAccessSpecifier13105); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAccessSpecifierAccess().getPrivateKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4484:2: kw= 'protected'
                    {
                    kw=(Token)match(input,106,FOLLOW_106_in_ruleAccessSpecifier13124); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAccessSpecifierAccess().getProtectedKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4491:2: kw= 'public'
                    {
                    kw=(Token)match(input,107,FOLLOW_107_in_ruleAccessSpecifier13143); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAccessSpecifierAccess().getPublicKeyword_2()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAccessSpecifier"


    // $ANTLR start "entryRuleOperatorFunctionId"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4504:1: entryRuleOperatorFunctionId returns [String current=null] : iv_ruleOperatorFunctionId= ruleOperatorFunctionId EOF ;
    public final String entryRuleOperatorFunctionId() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperatorFunctionId = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4505:2: (iv_ruleOperatorFunctionId= ruleOperatorFunctionId EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4506:2: iv_ruleOperatorFunctionId= ruleOperatorFunctionId EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperatorFunctionIdRule()); 
            }
            pushFollow(FOLLOW_ruleOperatorFunctionId_in_entryRuleOperatorFunctionId13184);
            iv_ruleOperatorFunctionId=ruleOperatorFunctionId();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperatorFunctionId.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperatorFunctionId13195); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4513:1: ruleOperatorFunctionId returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'operator' this_OverloadableOperator_1= ruleOverloadableOperator (kw= '<' (this_ConstantExpression_3= ruleConstantExpression | this_TypeSpecifier_4= ruleTypeSpecifier | this_IdExpression_5= ruleIdExpression )* kw= '>' )? ) ;
    public final AntlrDatatypeRuleToken ruleOperatorFunctionId() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_OverloadableOperator_1 = null;

        AntlrDatatypeRuleToken this_ConstantExpression_3 = null;

        AntlrDatatypeRuleToken this_TypeSpecifier_4 = null;

        AntlrDatatypeRuleToken this_IdExpression_5 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4516:28: ( (kw= 'operator' this_OverloadableOperator_1= ruleOverloadableOperator (kw= '<' (this_ConstantExpression_3= ruleConstantExpression | this_TypeSpecifier_4= ruleTypeSpecifier | this_IdExpression_5= ruleIdExpression )* kw= '>' )? ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4517:1: (kw= 'operator' this_OverloadableOperator_1= ruleOverloadableOperator (kw= '<' (this_ConstantExpression_3= ruleConstantExpression | this_TypeSpecifier_4= ruleTypeSpecifier | this_IdExpression_5= ruleIdExpression )* kw= '>' )? )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4517:1: (kw= 'operator' this_OverloadableOperator_1= ruleOverloadableOperator (kw= '<' (this_ConstantExpression_3= ruleConstantExpression | this_TypeSpecifier_4= ruleTypeSpecifier | this_IdExpression_5= ruleIdExpression )* kw= '>' )? )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4518:2: kw= 'operator' this_OverloadableOperator_1= ruleOverloadableOperator (kw= '<' (this_ConstantExpression_3= ruleConstantExpression | this_TypeSpecifier_4= ruleTypeSpecifier | this_IdExpression_5= ruleIdExpression )* kw= '>' )?
            {
            kw=(Token)match(input,108,FOLLOW_108_in_ruleOperatorFunctionId13233); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOperatorFunctionIdAccess().getOperatorKeyword_0()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOperatorFunctionIdAccess().getOverloadableOperatorParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleOverloadableOperator_in_ruleOperatorFunctionId13255);
            this_OverloadableOperator_1=ruleOverloadableOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_OverloadableOperator_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4534:1: (kw= '<' (this_ConstantExpression_3= ruleConstantExpression | this_TypeSpecifier_4= ruleTypeSpecifier | this_IdExpression_5= ruleIdExpression )* kw= '>' )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==109) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4535:2: kw= '<' (this_ConstantExpression_3= ruleConstantExpression | this_TypeSpecifier_4= ruleTypeSpecifier | this_IdExpression_5= ruleIdExpression )* kw= '>'
                    {
                    kw=(Token)match(input,109,FOLLOW_109_in_ruleOperatorFunctionId13274); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorFunctionIdAccess().getLessThanSignKeyword_2_0()); 
                          
                    }
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4540:1: (this_ConstantExpression_3= ruleConstantExpression | this_TypeSpecifier_4= ruleTypeSpecifier | this_IdExpression_5= ruleIdExpression )*
                    loop106:
                    do {
                        int alt106=4;
                        switch ( input.LA(1) ) {
                        case 154:
                            {
                            alt106=1;
                            }
                            break;
                        case RULE_ID:
                        case 72:
                        case 74:
                        case 75:
                        case 76:
                        case 77:
                        case 78:
                        case 79:
                        case 80:
                        case 81:
                        case 82:
                        case 83:
                        case 84:
                        case 85:
                        case 86:
                        case 87:
                        case 88:
                        case 89:
                        case 90:
                        case 91:
                        case 93:
                        case 101:
                        case 153:
                        case 156:
                            {
                            alt106=2;
                            }
                            break;
                        case 155:
                            {
                            alt106=3;
                            }
                            break;

                        }

                        switch (alt106) {
                    	case 1 :
                    	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4541:5: this_ConstantExpression_3= ruleConstantExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getOperatorFunctionIdAccess().getConstantExpressionParserRuleCall_2_1_0()); 
                    	          
                    	    }
                    	    pushFollow(FOLLOW_ruleConstantExpression_in_ruleOperatorFunctionId13297);
                    	    this_ConstantExpression_3=ruleConstantExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		current.merge(this_ConstantExpression_3);
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              afterParserOrEnumRuleCall();
                    	          
                    	    }

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4553:5: this_TypeSpecifier_4= ruleTypeSpecifier
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getOperatorFunctionIdAccess().getTypeSpecifierParserRuleCall_2_1_1()); 
                    	          
                    	    }
                    	    pushFollow(FOLLOW_ruleTypeSpecifier_in_ruleOperatorFunctionId13330);
                    	    this_TypeSpecifier_4=ruleTypeSpecifier();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		current.merge(this_TypeSpecifier_4);
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              afterParserOrEnumRuleCall();
                    	          
                    	    }

                    	    }
                    	    break;
                    	case 3 :
                    	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4565:5: this_IdExpression_5= ruleIdExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getOperatorFunctionIdAccess().getIdExpressionParserRuleCall_2_1_2()); 
                    	          
                    	    }
                    	    pushFollow(FOLLOW_ruleIdExpression_in_ruleOperatorFunctionId13363);
                    	    this_IdExpression_5=ruleIdExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		current.merge(this_IdExpression_5);
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              afterParserOrEnumRuleCall();
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop106;
                        }
                    } while (true);

                    kw=(Token)match(input,110,FOLLOW_110_in_ruleOperatorFunctionId13383); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOperatorFunctionIdAccess().getGreaterThanSignKeyword_2_2()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOperatorFunctionId"


    // $ANTLR start "entryRuleOverloadableOperator"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4589:1: entryRuleOverloadableOperator returns [String current=null] : iv_ruleOverloadableOperator= ruleOverloadableOperator EOF ;
    public final String entryRuleOverloadableOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOverloadableOperator = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4590:2: (iv_ruleOverloadableOperator= ruleOverloadableOperator EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4591:2: iv_ruleOverloadableOperator= ruleOverloadableOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOverloadableOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleOverloadableOperator_in_entryRuleOverloadableOperator13426);
            iv_ruleOverloadableOperator=ruleOverloadableOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOverloadableOperator.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOverloadableOperator13437); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4598:1: ruleOverloadableOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'new' | kw= 'delete' | (kw= 'new' kw= '[' kw= ']' ) | (kw= 'delete' kw= '[' kw= ']' ) | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= '^' | kw= '&' | kw= '|' | kw= '~' | kw= '!' | kw= '=' | kw= '<' | kw= '>' | kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' | kw= '^=' | kw= '&=' | kw= '|=' | kw= '<<' | kw= '>>' | kw= '>>=' | kw= '<<=' | kw= '==' | kw= '!=' | kw= '<=' | kw= '>=' | kw= '&&' | kw= '||' | kw= '++' | kw= '--' | kw= ',' | kw= '->*' | kw= '->' | kw= '()' | kw= '[]' ) ;
    public final AntlrDatatypeRuleToken ruleOverloadableOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4601:28: ( (kw= 'new' | kw= 'delete' | (kw= 'new' kw= '[' kw= ']' ) | (kw= 'delete' kw= '[' kw= ']' ) | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= '^' | kw= '&' | kw= '|' | kw= '~' | kw= '!' | kw= '=' | kw= '<' | kw= '>' | kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' | kw= '^=' | kw= '&=' | kw= '|=' | kw= '<<' | kw= '>>' | kw= '>>=' | kw= '<<=' | kw= '==' | kw= '!=' | kw= '<=' | kw= '>=' | kw= '&&' | kw= '||' | kw= '++' | kw= '--' | kw= ',' | kw= '->*' | kw= '->' | kw= '()' | kw= '[]' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4602:1: (kw= 'new' | kw= 'delete' | (kw= 'new' kw= '[' kw= ']' ) | (kw= 'delete' kw= '[' kw= ']' ) | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= '^' | kw= '&' | kw= '|' | kw= '~' | kw= '!' | kw= '=' | kw= '<' | kw= '>' | kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' | kw= '^=' | kw= '&=' | kw= '|=' | kw= '<<' | kw= '>>' | kw= '>>=' | kw= '<<=' | kw= '==' | kw= '!=' | kw= '<=' | kw= '>=' | kw= '&&' | kw= '||' | kw= '++' | kw= '--' | kw= ',' | kw= '->*' | kw= '->' | kw= '()' | kw= '[]' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4602:1: (kw= 'new' | kw= 'delete' | (kw= 'new' kw= '[' kw= ']' ) | (kw= 'delete' kw= '[' kw= ']' ) | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= '^' | kw= '&' | kw= '|' | kw= '~' | kw= '!' | kw= '=' | kw= '<' | kw= '>' | kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' | kw= '^=' | kw= '&=' | kw= '|=' | kw= '<<' | kw= '>>' | kw= '>>=' | kw= '<<=' | kw= '==' | kw= '!=' | kw= '<=' | kw= '>=' | kw= '&&' | kw= '||' | kw= '++' | kw= '--' | kw= ',' | kw= '->*' | kw= '->' | kw= '()' | kw= '[]' )
            int alt108=42;
            alt108 = dfa108.predict(input);
            switch (alt108) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4603:2: kw= 'new'
                    {
                    kw=(Token)match(input,103,FOLLOW_103_in_ruleOverloadableOperator13475); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getNewKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4610:2: kw= 'delete'
                    {
                    kw=(Token)match(input,58,FOLLOW_58_in_ruleOverloadableOperator13494); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getDeleteKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4616:6: (kw= 'new' kw= '[' kw= ']' )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4616:6: (kw= 'new' kw= '[' kw= ']' )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4617:2: kw= 'new' kw= '[' kw= ']'
                    {
                    kw=(Token)match(input,103,FOLLOW_103_in_ruleOverloadableOperator13514); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getNewKeyword_2_0()); 
                          
                    }
                    kw=(Token)match(input,111,FOLLOW_111_in_ruleOverloadableOperator13527); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getLeftSquareBracketKeyword_2_1()); 
                          
                    }
                    kw=(Token)match(input,112,FOLLOW_112_in_ruleOverloadableOperator13540); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getRightSquareBracketKeyword_2_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4635:6: (kw= 'delete' kw= '[' kw= ']' )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4635:6: (kw= 'delete' kw= '[' kw= ']' )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4636:2: kw= 'delete' kw= '[' kw= ']'
                    {
                    kw=(Token)match(input,58,FOLLOW_58_in_ruleOverloadableOperator13561); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getDeleteKeyword_3_0()); 
                          
                    }
                    kw=(Token)match(input,111,FOLLOW_111_in_ruleOverloadableOperator13574); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getLeftSquareBracketKeyword_3_1()); 
                          
                    }
                    kw=(Token)match(input,112,FOLLOW_112_in_ruleOverloadableOperator13587); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getRightSquareBracketKeyword_3_2()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4655:2: kw= '+'
                    {
                    kw=(Token)match(input,113,FOLLOW_113_in_ruleOverloadableOperator13607); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getPlusSignKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4662:2: kw= '-'
                    {
                    kw=(Token)match(input,114,FOLLOW_114_in_ruleOverloadableOperator13626); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getHyphenMinusKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4669:2: kw= '*'
                    {
                    kw=(Token)match(input,115,FOLLOW_115_in_ruleOverloadableOperator13645); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getAsteriskKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4676:2: kw= '/'
                    {
                    kw=(Token)match(input,116,FOLLOW_116_in_ruleOverloadableOperator13664); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getSolidusKeyword_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4683:2: kw= '%'
                    {
                    kw=(Token)match(input,117,FOLLOW_117_in_ruleOverloadableOperator13683); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getPercentSignKeyword_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4690:2: kw= '^'
                    {
                    kw=(Token)match(input,118,FOLLOW_118_in_ruleOverloadableOperator13702); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getCircumflexAccentKeyword_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4697:2: kw= '&'
                    {
                    kw=(Token)match(input,97,FOLLOW_97_in_ruleOverloadableOperator13721); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getAmpersandKeyword_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4704:2: kw= '|'
                    {
                    kw=(Token)match(input,119,FOLLOW_119_in_ruleOverloadableOperator13740); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getVerticalLineKeyword_11()); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4711:2: kw= '~'
                    {
                    kw=(Token)match(input,120,FOLLOW_120_in_ruleOverloadableOperator13759); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getTildeKeyword_12()); 
                          
                    }

                    }
                    break;
                case 14 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4718:2: kw= '!'
                    {
                    kw=(Token)match(input,121,FOLLOW_121_in_ruleOverloadableOperator13778); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getExclamationMarkKeyword_13()); 
                          
                    }

                    }
                    break;
                case 15 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4725:2: kw= '='
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleOverloadableOperator13797); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getEqualsSignKeyword_14()); 
                          
                    }

                    }
                    break;
                case 16 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4732:2: kw= '<'
                    {
                    kw=(Token)match(input,109,FOLLOW_109_in_ruleOverloadableOperator13816); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getLessThanSignKeyword_15()); 
                          
                    }

                    }
                    break;
                case 17 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4739:2: kw= '>'
                    {
                    kw=(Token)match(input,110,FOLLOW_110_in_ruleOverloadableOperator13835); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getGreaterThanSignKeyword_16()); 
                          
                    }

                    }
                    break;
                case 18 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4746:2: kw= '+='
                    {
                    kw=(Token)match(input,122,FOLLOW_122_in_ruleOverloadableOperator13854); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getPlusSignEqualsSignKeyword_17()); 
                          
                    }

                    }
                    break;
                case 19 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4753:2: kw= '-='
                    {
                    kw=(Token)match(input,123,FOLLOW_123_in_ruleOverloadableOperator13873); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getHyphenMinusEqualsSignKeyword_18()); 
                          
                    }

                    }
                    break;
                case 20 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4760:2: kw= '*='
                    {
                    kw=(Token)match(input,124,FOLLOW_124_in_ruleOverloadableOperator13892); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getAsteriskEqualsSignKeyword_19()); 
                          
                    }

                    }
                    break;
                case 21 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4767:2: kw= '/='
                    {
                    kw=(Token)match(input,125,FOLLOW_125_in_ruleOverloadableOperator13911); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getSolidusEqualsSignKeyword_20()); 
                          
                    }

                    }
                    break;
                case 22 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4774:2: kw= '%='
                    {
                    kw=(Token)match(input,126,FOLLOW_126_in_ruleOverloadableOperator13930); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getPercentSignEqualsSignKeyword_21()); 
                          
                    }

                    }
                    break;
                case 23 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4781:2: kw= '^='
                    {
                    kw=(Token)match(input,127,FOLLOW_127_in_ruleOverloadableOperator13949); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getCircumflexAccentEqualsSignKeyword_22()); 
                          
                    }

                    }
                    break;
                case 24 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4788:2: kw= '&='
                    {
                    kw=(Token)match(input,128,FOLLOW_128_in_ruleOverloadableOperator13968); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getAmpersandEqualsSignKeyword_23()); 
                          
                    }

                    }
                    break;
                case 25 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4795:2: kw= '|='
                    {
                    kw=(Token)match(input,129,FOLLOW_129_in_ruleOverloadableOperator13987); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getVerticalLineEqualsSignKeyword_24()); 
                          
                    }

                    }
                    break;
                case 26 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4802:2: kw= '<<'
                    {
                    kw=(Token)match(input,130,FOLLOW_130_in_ruleOverloadableOperator14006); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getLessThanSignLessThanSignKeyword_25()); 
                          
                    }

                    }
                    break;
                case 27 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4809:2: kw= '>>'
                    {
                    kw=(Token)match(input,131,FOLLOW_131_in_ruleOverloadableOperator14025); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getGreaterThanSignGreaterThanSignKeyword_26()); 
                          
                    }

                    }
                    break;
                case 28 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4816:2: kw= '>>='
                    {
                    kw=(Token)match(input,132,FOLLOW_132_in_ruleOverloadableOperator14044); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getGreaterThanSignGreaterThanSignEqualsSignKeyword_27()); 
                          
                    }

                    }
                    break;
                case 29 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4823:2: kw= '<<='
                    {
                    kw=(Token)match(input,133,FOLLOW_133_in_ruleOverloadableOperator14063); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getLessThanSignLessThanSignEqualsSignKeyword_28()); 
                          
                    }

                    }
                    break;
                case 30 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4830:2: kw= '=='
                    {
                    kw=(Token)match(input,134,FOLLOW_134_in_ruleOverloadableOperator14082); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getEqualsSignEqualsSignKeyword_29()); 
                          
                    }

                    }
                    break;
                case 31 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4837:2: kw= '!='
                    {
                    kw=(Token)match(input,135,FOLLOW_135_in_ruleOverloadableOperator14101); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getExclamationMarkEqualsSignKeyword_30()); 
                          
                    }

                    }
                    break;
                case 32 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4844:2: kw= '<='
                    {
                    kw=(Token)match(input,136,FOLLOW_136_in_ruleOverloadableOperator14120); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getLessThanSignEqualsSignKeyword_31()); 
                          
                    }

                    }
                    break;
                case 33 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4851:2: kw= '>='
                    {
                    kw=(Token)match(input,137,FOLLOW_137_in_ruleOverloadableOperator14139); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getGreaterThanSignEqualsSignKeyword_32()); 
                          
                    }

                    }
                    break;
                case 34 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4858:2: kw= '&&'
                    {
                    kw=(Token)match(input,98,FOLLOW_98_in_ruleOverloadableOperator14158); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getAmpersandAmpersandKeyword_33()); 
                          
                    }

                    }
                    break;
                case 35 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4865:2: kw= '||'
                    {
                    kw=(Token)match(input,138,FOLLOW_138_in_ruleOverloadableOperator14177); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getVerticalLineVerticalLineKeyword_34()); 
                          
                    }

                    }
                    break;
                case 36 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4872:2: kw= '++'
                    {
                    kw=(Token)match(input,139,FOLLOW_139_in_ruleOverloadableOperator14196); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getPlusSignPlusSignKeyword_35()); 
                          
                    }

                    }
                    break;
                case 37 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4879:2: kw= '--'
                    {
                    kw=(Token)match(input,140,FOLLOW_140_in_ruleOverloadableOperator14215); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getHyphenMinusHyphenMinusKeyword_36()); 
                          
                    }

                    }
                    break;
                case 38 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4886:2: kw= ','
                    {
                    kw=(Token)match(input,60,FOLLOW_60_in_ruleOverloadableOperator14234); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getCommaKeyword_37()); 
                          
                    }

                    }
                    break;
                case 39 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4893:2: kw= '->*'
                    {
                    kw=(Token)match(input,141,FOLLOW_141_in_ruleOverloadableOperator14253); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getHyphenMinusGreaterThanSignAsteriskKeyword_38()); 
                          
                    }

                    }
                    break;
                case 40 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4900:2: kw= '->'
                    {
                    kw=(Token)match(input,142,FOLLOW_142_in_ruleOverloadableOperator14272); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getHyphenMinusGreaterThanSignKeyword_39()); 
                          
                    }

                    }
                    break;
                case 41 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4907:2: kw= '()'
                    {
                    kw=(Token)match(input,143,FOLLOW_143_in_ruleOverloadableOperator14291); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getLeftParenthesisRightParenthesisKeyword_40()); 
                          
                    }

                    }
                    break;
                case 42 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4914:2: kw= '[]'
                    {
                    kw=(Token)match(input,144,FOLLOW_144_in_ruleOverloadableOperator14310); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getLeftSquareBracketRightSquareBracketKeyword_41()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOverloadableOperator"


    // $ANTLR start "entryRuleLiteralOperatorId"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4927:1: entryRuleLiteralOperatorId returns [String current=null] : iv_ruleLiteralOperatorId= ruleLiteralOperatorId EOF ;
    public final String entryRuleLiteralOperatorId() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteralOperatorId = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4928:2: (iv_ruleLiteralOperatorId= ruleLiteralOperatorId EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4929:2: iv_ruleLiteralOperatorId= ruleLiteralOperatorId EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralOperatorIdRule()); 
            }
            pushFollow(FOLLOW_ruleLiteralOperatorId_in_entryRuleLiteralOperatorId14351);
            iv_ruleLiteralOperatorId=ruleLiteralOperatorId();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralOperatorId.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralOperatorId14362); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4936:1: ruleLiteralOperatorId returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'operator' kw= '\"' kw= '\"' ) ;
    public final AntlrDatatypeRuleToken ruleLiteralOperatorId() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4939:28: ( (kw= 'operator' kw= '\"' kw= '\"' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4940:1: (kw= 'operator' kw= '\"' kw= '\"' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4940:1: (kw= 'operator' kw= '\"' kw= '\"' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4941:2: kw= 'operator' kw= '\"' kw= '\"'
            {
            kw=(Token)match(input,108,FOLLOW_108_in_ruleLiteralOperatorId14400); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getLiteralOperatorIdAccess().getOperatorKeyword_0()); 
                  
            }
            kw=(Token)match(input,145,FOLLOW_145_in_ruleLiteralOperatorId14413); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getLiteralOperatorIdAccess().getQuotationMarkKeyword_1()); 
                  
            }
            kw=(Token)match(input,145,FOLLOW_145_in_ruleLiteralOperatorId14426); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getLiteralOperatorIdAccess().getQuotationMarkKeyword_2()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleLiteralOperatorId"


    // $ANTLR start "entryRuleTemplateDeclaration"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4966:1: entryRuleTemplateDeclaration returns [String current=null] : iv_ruleTemplateDeclaration= ruleTemplateDeclaration EOF ;
    public final String entryRuleTemplateDeclaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTemplateDeclaration = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4967:2: (iv_ruleTemplateDeclaration= ruleTemplateDeclaration EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4968:2: iv_ruleTemplateDeclaration= ruleTemplateDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTemplateDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleTemplateDeclaration_in_entryRuleTemplateDeclaration14467);
            iv_ruleTemplateDeclaration=ruleTemplateDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTemplateDeclaration.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateDeclaration14478); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4975:1: ruleTemplateDeclaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'template' kw= '<' this_TemplateParameterList_2= ruleTemplateParameterList kw= '>' ) ;
    public final AntlrDatatypeRuleToken ruleTemplateDeclaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_TemplateParameterList_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4978:28: ( (kw= 'template' kw= '<' this_TemplateParameterList_2= ruleTemplateParameterList kw= '>' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4979:1: (kw= 'template' kw= '<' this_TemplateParameterList_2= ruleTemplateParameterList kw= '>' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4979:1: (kw= 'template' kw= '<' this_TemplateParameterList_2= ruleTemplateParameterList kw= '>' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:4980:2: kw= 'template' kw= '<' this_TemplateParameterList_2= ruleTemplateParameterList kw= '>'
            {
            kw=(Token)match(input,73,FOLLOW_73_in_ruleTemplateDeclaration14516); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getTemplateDeclarationAccess().getTemplateKeyword_0()); 
                  
            }
            kw=(Token)match(input,109,FOLLOW_109_in_ruleTemplateDeclaration14529); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getTemplateDeclarationAccess().getLessThanSignKeyword_1()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getTemplateDeclarationAccess().getTemplateParameterListParserRuleCall_2()); 
                  
            }
            pushFollow(FOLLOW_ruleTemplateParameterList_in_ruleTemplateDeclaration14551);
            this_TemplateParameterList_2=ruleTemplateParameterList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_TemplateParameterList_2);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            kw=(Token)match(input,110,FOLLOW_110_in_ruleTemplateDeclaration14569); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getTemplateDeclarationAccess().getGreaterThanSignKeyword_3()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTemplateDeclaration"


    // $ANTLR start "entryRuleTemplateParameterList"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5016:1: entryRuleTemplateParameterList returns [String current=null] : iv_ruleTemplateParameterList= ruleTemplateParameterList EOF ;
    public final String entryRuleTemplateParameterList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTemplateParameterList = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5017:2: (iv_ruleTemplateParameterList= ruleTemplateParameterList EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5018:2: iv_ruleTemplateParameterList= ruleTemplateParameterList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTemplateParameterListRule()); 
            }
            pushFollow(FOLLOW_ruleTemplateParameterList_in_entryRuleTemplateParameterList14610);
            iv_ruleTemplateParameterList=ruleTemplateParameterList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTemplateParameterList.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateParameterList14621); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5025:1: ruleTemplateParameterList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TemplateParameter_0= ruleTemplateParameter (kw= ',' this_TemplateParameter_2= ruleTemplateParameter )* ) ;
    public final AntlrDatatypeRuleToken ruleTemplateParameterList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_TemplateParameter_0 = null;

        AntlrDatatypeRuleToken this_TemplateParameter_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5028:28: ( (this_TemplateParameter_0= ruleTemplateParameter (kw= ',' this_TemplateParameter_2= ruleTemplateParameter )* ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5029:1: (this_TemplateParameter_0= ruleTemplateParameter (kw= ',' this_TemplateParameter_2= ruleTemplateParameter )* )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5029:1: (this_TemplateParameter_0= ruleTemplateParameter (kw= ',' this_TemplateParameter_2= ruleTemplateParameter )* )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5030:5: this_TemplateParameter_0= ruleTemplateParameter (kw= ',' this_TemplateParameter_2= ruleTemplateParameter )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getTemplateParameterListAccess().getTemplateParameterParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleTemplateParameter_in_ruleTemplateParameterList14668);
            this_TemplateParameter_0=ruleTemplateParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_TemplateParameter_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5040:1: (kw= ',' this_TemplateParameter_2= ruleTemplateParameter )*
            loop109:
            do {
                int alt109=2;
                int LA109_0 = input.LA(1);

                if ( (LA109_0==60) ) {
                    alt109=1;
                }


                switch (alt109) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5041:2: kw= ',' this_TemplateParameter_2= ruleTemplateParameter
            	    {
            	    kw=(Token)match(input,60,FOLLOW_60_in_ruleTemplateParameterList14687); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getTemplateParameterListAccess().getCommaKeyword_1_0()); 
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getTemplateParameterListAccess().getTemplateParameterParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleTemplateParameter_in_ruleTemplateParameterList14709);
            	    this_TemplateParameter_2=ruleTemplateParameter();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_TemplateParameter_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop109;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTemplateParameterList"


    // $ANTLR start "entryRuleTemplateParameter"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5065:1: entryRuleTemplateParameter returns [String current=null] : iv_ruleTemplateParameter= ruleTemplateParameter EOF ;
    public final String entryRuleTemplateParameter() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTemplateParameter = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5066:2: (iv_ruleTemplateParameter= ruleTemplateParameter EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5067:2: iv_ruleTemplateParameter= ruleTemplateParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTemplateParameterRule()); 
            }
            pushFollow(FOLLOW_ruleTemplateParameter_in_entryRuleTemplateParameter14757);
            iv_ruleTemplateParameter=ruleTemplateParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTemplateParameter.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateParameter14768); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5074:1: ruleTemplateParameter returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TypeParameter_0= ruleTypeParameter | this_ParameterDeclaration_1= ruleParameterDeclaration ) ;
    public final AntlrDatatypeRuleToken ruleTemplateParameter() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_TypeParameter_0 = null;

        AntlrDatatypeRuleToken this_ParameterDeclaration_1 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5077:28: ( (this_TypeParameter_0= ruleTypeParameter | this_ParameterDeclaration_1= ruleParameterDeclaration ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5078:1: (this_TypeParameter_0= ruleTypeParameter | this_ParameterDeclaration_1= ruleParameterDeclaration )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5078:1: (this_TypeParameter_0= ruleTypeParameter | this_ParameterDeclaration_1= ruleParameterDeclaration )
            int alt110=2;
            switch ( input.LA(1) ) {
            case 90:
                {
                switch ( input.LA(2) ) {
                case 38:
                case 42:
                case 156:
                    {
                    alt110=2;
                    }
                    break;
                case RULE_ID:
                    {
                    int LA110_4 = input.LA(3);

                    if ( (LA110_4==EOF||LA110_4==49||LA110_4==60||LA110_4==110) ) {
                        alt110=1;
                    }
                    else if ( (LA110_4==38||LA110_4==42||LA110_4==71||LA110_4==100||LA110_4==109) ) {
                        alt110=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 110, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case 49:
                case 60:
                case 99:
                case 110:
                    {
                    alt110=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 110, 1, input);

                    throw nvae;
                }

                }
                break;
            case 93:
                {
                int LA110_2 = input.LA(2);

                if ( (LA110_2==72||LA110_2==156) ) {
                    alt110=2;
                }
                else if ( (LA110_2==EOF||LA110_2==RULE_ID||LA110_2==49||LA110_2==60||LA110_2==99||LA110_2==110) ) {
                    alt110=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 110, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
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
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 91:
            case 101:
            case 153:
            case 156:
                {
                alt110=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 110, 0, input);

                throw nvae;
            }

            switch (alt110) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5079:5: this_TypeParameter_0= ruleTypeParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTemplateParameterAccess().getTypeParameterParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTypeParameter_in_ruleTemplateParameter14815);
                    this_TypeParameter_0=ruleTypeParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_TypeParameter_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5091:5: this_ParameterDeclaration_1= ruleParameterDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTemplateParameterAccess().getParameterDeclarationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParameterDeclaration_in_ruleTemplateParameter14848);
                    this_ParameterDeclaration_1=ruleParameterDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ParameterDeclaration_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTemplateParameter"


    // $ANTLR start "entryRuleTypeParameter"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5109:1: entryRuleTypeParameter returns [String current=null] : iv_ruleTypeParameter= ruleTypeParameter EOF ;
    public final String entryRuleTypeParameter() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeParameter = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5110:2: (iv_ruleTypeParameter= ruleTypeParameter EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5111:2: iv_ruleTypeParameter= ruleTypeParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeParameterRule()); 
            }
            pushFollow(FOLLOW_ruleTypeParameter_in_entryRuleTypeParameter14894);
            iv_ruleTypeParameter=ruleTypeParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeParameter.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeParameter14905); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5118:1: ruleTypeParameter returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'class' | kw= 'typename' ) ( ( (kw= '...' )? (this_ID_3= RULE_ID )? ) | ( (this_ID_4= RULE_ID )? kw= '=' this_TypeId_6= ruleTypeId ) ) ) ;
    public final AntlrDatatypeRuleToken ruleTypeParameter() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_3=null;
        Token this_ID_4=null;
        AntlrDatatypeRuleToken this_TypeId_6 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5121:28: ( ( (kw= 'class' | kw= 'typename' ) ( ( (kw= '...' )? (this_ID_3= RULE_ID )? ) | ( (this_ID_4= RULE_ID )? kw= '=' this_TypeId_6= ruleTypeId ) ) ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5122:1: ( (kw= 'class' | kw= 'typename' ) ( ( (kw= '...' )? (this_ID_3= RULE_ID )? ) | ( (this_ID_4= RULE_ID )? kw= '=' this_TypeId_6= ruleTypeId ) ) )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5122:1: ( (kw= 'class' | kw= 'typename' ) ( ( (kw= '...' )? (this_ID_3= RULE_ID )? ) | ( (this_ID_4= RULE_ID )? kw= '=' this_TypeId_6= ruleTypeId ) ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5122:2: (kw= 'class' | kw= 'typename' ) ( ( (kw= '...' )? (this_ID_3= RULE_ID )? ) | ( (this_ID_4= RULE_ID )? kw= '=' this_TypeId_6= ruleTypeId ) )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5122:2: (kw= 'class' | kw= 'typename' )
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==90) ) {
                alt111=1;
            }
            else if ( (LA111_0==93) ) {
                alt111=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 111, 0, input);

                throw nvae;
            }
            switch (alt111) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5123:2: kw= 'class'
                    {
                    kw=(Token)match(input,90,FOLLOW_90_in_ruleTypeParameter14944); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTypeParameterAccess().getClassKeyword_0_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5130:2: kw= 'typename'
                    {
                    kw=(Token)match(input,93,FOLLOW_93_in_ruleTypeParameter14963); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTypeParameterAccess().getTypenameKeyword_0_1()); 
                          
                    }

                    }
                    break;

            }

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5135:2: ( ( (kw= '...' )? (this_ID_3= RULE_ID )? ) | ( (this_ID_4= RULE_ID )? kw= '=' this_TypeId_6= ruleTypeId ) )
            int alt115=2;
            switch ( input.LA(1) ) {
            case EOF:
            case 60:
            case 99:
            case 110:
                {
                alt115=1;
                }
                break;
            case RULE_ID:
                {
                int LA115_2 = input.LA(2);

                if ( (LA115_2==EOF||LA115_2==60||LA115_2==110) ) {
                    alt115=1;
                }
                else if ( (LA115_2==49) ) {
                    alt115=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 115, 2, input);

                    throw nvae;
                }
                }
                break;
            case 49:
                {
                alt115=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 115, 0, input);

                throw nvae;
            }

            switch (alt115) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5135:3: ( (kw= '...' )? (this_ID_3= RULE_ID )? )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5135:3: ( (kw= '...' )? (this_ID_3= RULE_ID )? )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5135:4: (kw= '...' )? (this_ID_3= RULE_ID )?
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5135:4: (kw= '...' )?
                    int alt112=2;
                    int LA112_0 = input.LA(1);

                    if ( (LA112_0==99) ) {
                        alt112=1;
                    }
                    switch (alt112) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5136:2: kw= '...'
                            {
                            kw=(Token)match(input,99,FOLLOW_99_in_ruleTypeParameter14980); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getTypeParameterAccess().getFullStopFullStopFullStopKeyword_1_0_0()); 
                                  
                            }

                            }
                            break;

                    }

                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5141:3: (this_ID_3= RULE_ID )?
                    int alt113=2;
                    int LA113_0 = input.LA(1);

                    if ( (LA113_0==RULE_ID) ) {
                        alt113=1;
                    }
                    switch (alt113) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5141:8: this_ID_3= RULE_ID
                            {
                            this_ID_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeParameter14998); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_ID_3);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_ID_3, grammarAccess.getTypeParameterAccess().getIDTerminalRuleCall_1_0_1()); 
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5149:6: ( (this_ID_4= RULE_ID )? kw= '=' this_TypeId_6= ruleTypeId )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5149:6: ( (this_ID_4= RULE_ID )? kw= '=' this_TypeId_6= ruleTypeId )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5149:7: (this_ID_4= RULE_ID )? kw= '=' this_TypeId_6= ruleTypeId
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5149:7: (this_ID_4= RULE_ID )?
                    int alt114=2;
                    int LA114_0 = input.LA(1);

                    if ( (LA114_0==RULE_ID) ) {
                        alt114=1;
                    }
                    switch (alt114) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5149:12: this_ID_4= RULE_ID
                            {
                            this_ID_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeParameter15029); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_ID_4);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_ID_4, grammarAccess.getTypeParameterAccess().getIDTerminalRuleCall_1_1_0()); 
                                  
                            }

                            }
                            break;

                    }

                    kw=(Token)match(input,49,FOLLOW_49_in_ruleTypeParameter15049); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTypeParameterAccess().getEqualsSignKeyword_1_1_1()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeParameterAccess().getTypeIdParserRuleCall_1_1_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTypeId_in_ruleTypeParameter15071);
                    this_TypeId_6=ruleTypeId();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_TypeId_6);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTypeParameter"


    // $ANTLR start "entryRuleSimpleTemplateId"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5181:1: entryRuleSimpleTemplateId returns [String current=null] : iv_ruleSimpleTemplateId= ruleSimpleTemplateId EOF ;
    public final String entryRuleSimpleTemplateId() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSimpleTemplateId = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5182:2: (iv_ruleSimpleTemplateId= ruleSimpleTemplateId EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5183:2: iv_ruleSimpleTemplateId= ruleSimpleTemplateId EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleTemplateIdRule()); 
            }
            pushFollow(FOLLOW_ruleSimpleTemplateId_in_entryRuleSimpleTemplateId15119);
            iv_ruleSimpleTemplateId=ruleSimpleTemplateId();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleTemplateId.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleTemplateId15130); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5190:1: ruleSimpleTemplateId returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID kw= '<' this_TemplateArgumentList_2= ruleTemplateArgumentList kw= '>' ) ;
    public final AntlrDatatypeRuleToken ruleSimpleTemplateId() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_TemplateArgumentList_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5193:28: ( (this_ID_0= RULE_ID kw= '<' this_TemplateArgumentList_2= ruleTemplateArgumentList kw= '>' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5194:1: (this_ID_0= RULE_ID kw= '<' this_TemplateArgumentList_2= ruleTemplateArgumentList kw= '>' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5194:1: (this_ID_0= RULE_ID kw= '<' this_TemplateArgumentList_2= ruleTemplateArgumentList kw= '>' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5194:6: this_ID_0= RULE_ID kw= '<' this_TemplateArgumentList_2= ruleTemplateArgumentList kw= '>'
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSimpleTemplateId15170); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getSimpleTemplateIdAccess().getIDTerminalRuleCall_0()); 
                  
            }
            kw=(Token)match(input,109,FOLLOW_109_in_ruleSimpleTemplateId15188); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getSimpleTemplateIdAccess().getLessThanSignKeyword_1()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSimpleTemplateIdAccess().getTemplateArgumentListParserRuleCall_2()); 
                  
            }
            pushFollow(FOLLOW_ruleTemplateArgumentList_in_ruleSimpleTemplateId15210);
            this_TemplateArgumentList_2=ruleTemplateArgumentList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_TemplateArgumentList_2);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            kw=(Token)match(input,110,FOLLOW_110_in_ruleSimpleTemplateId15228); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getSimpleTemplateIdAccess().getGreaterThanSignKeyword_3()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSimpleTemplateId"


    // $ANTLR start "entryRuleTemplateArgumentList"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5234:1: entryRuleTemplateArgumentList returns [String current=null] : iv_ruleTemplateArgumentList= ruleTemplateArgumentList EOF ;
    public final String entryRuleTemplateArgumentList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTemplateArgumentList = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5235:2: (iv_ruleTemplateArgumentList= ruleTemplateArgumentList EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5236:2: iv_ruleTemplateArgumentList= ruleTemplateArgumentList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTemplateArgumentListRule()); 
            }
            pushFollow(FOLLOW_ruleTemplateArgumentList_in_entryRuleTemplateArgumentList15271);
            iv_ruleTemplateArgumentList=ruleTemplateArgumentList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTemplateArgumentList.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateArgumentList15282); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5243:1: ruleTemplateArgumentList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TemplateArgument_0= ruleTemplateArgument (kw= '...' )? (kw= ',' this_TemplateArgument_3= ruleTemplateArgument (kw= '...' )? )* ) ;
    public final AntlrDatatypeRuleToken ruleTemplateArgumentList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_TemplateArgument_0 = null;

        AntlrDatatypeRuleToken this_TemplateArgument_3 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5246:28: ( (this_TemplateArgument_0= ruleTemplateArgument (kw= '...' )? (kw= ',' this_TemplateArgument_3= ruleTemplateArgument (kw= '...' )? )* ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5247:1: (this_TemplateArgument_0= ruleTemplateArgument (kw= '...' )? (kw= ',' this_TemplateArgument_3= ruleTemplateArgument (kw= '...' )? )* )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5247:1: (this_TemplateArgument_0= ruleTemplateArgument (kw= '...' )? (kw= ',' this_TemplateArgument_3= ruleTemplateArgument (kw= '...' )? )* )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5248:5: this_TemplateArgument_0= ruleTemplateArgument (kw= '...' )? (kw= ',' this_TemplateArgument_3= ruleTemplateArgument (kw= '...' )? )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getTemplateArgumentListAccess().getTemplateArgumentParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleTemplateArgument_in_ruleTemplateArgumentList15329);
            this_TemplateArgument_0=ruleTemplateArgument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_TemplateArgument_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5258:1: (kw= '...' )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==99) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5259:2: kw= '...'
                    {
                    kw=(Token)match(input,99,FOLLOW_99_in_ruleTemplateArgumentList15348); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTemplateArgumentListAccess().getFullStopFullStopFullStopKeyword_1()); 
                          
                    }

                    }
                    break;

            }

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5264:3: (kw= ',' this_TemplateArgument_3= ruleTemplateArgument (kw= '...' )? )*
            loop118:
            do {
                int alt118=2;
                int LA118_0 = input.LA(1);

                if ( (LA118_0==60) ) {
                    alt118=1;
                }


                switch (alt118) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5265:2: kw= ',' this_TemplateArgument_3= ruleTemplateArgument (kw= '...' )?
            	    {
            	    kw=(Token)match(input,60,FOLLOW_60_in_ruleTemplateArgumentList15364); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getTemplateArgumentListAccess().getCommaKeyword_2_0()); 
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getTemplateArgumentListAccess().getTemplateArgumentParserRuleCall_2_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleTemplateArgument_in_ruleTemplateArgumentList15386);
            	    this_TemplateArgument_3=ruleTemplateArgument();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_TemplateArgument_3);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5281:1: (kw= '...' )?
            	    int alt117=2;
            	    int LA117_0 = input.LA(1);

            	    if ( (LA117_0==99) ) {
            	        alt117=1;
            	    }
            	    switch (alt117) {
            	        case 1 :
            	            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5282:2: kw= '...'
            	            {
            	            kw=(Token)match(input,99,FOLLOW_99_in_ruleTemplateArgumentList15405); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      current.merge(kw);
            	                      newLeafNode(kw, grammarAccess.getTemplateArgumentListAccess().getFullStopFullStopFullStopKeyword_2_2()); 
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop118;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTemplateArgumentList"


    // $ANTLR start "entryRuleTemplateArgument"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5295:1: entryRuleTemplateArgument returns [String current=null] : iv_ruleTemplateArgument= ruleTemplateArgument EOF ;
    public final String entryRuleTemplateArgument() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTemplateArgument = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5296:2: (iv_ruleTemplateArgument= ruleTemplateArgument EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5297:2: iv_ruleTemplateArgument= ruleTemplateArgument EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTemplateArgumentRule()); 
            }
            pushFollow(FOLLOW_ruleTemplateArgument_in_entryRuleTemplateArgument15450);
            iv_ruleTemplateArgument=ruleTemplateArgument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTemplateArgument.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateArgument15461); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5304:1: ruleTemplateArgument returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ConstantExpression_0= ruleConstantExpression | this_TypeId_1= ruleTypeId | this_IdExpression_2= ruleIdExpression ) ;
    public final AntlrDatatypeRuleToken ruleTemplateArgument() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_ConstantExpression_0 = null;

        AntlrDatatypeRuleToken this_TypeId_1 = null;

        AntlrDatatypeRuleToken this_IdExpression_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5307:28: ( (this_ConstantExpression_0= ruleConstantExpression | this_TypeId_1= ruleTypeId | this_IdExpression_2= ruleIdExpression ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5308:1: (this_ConstantExpression_0= ruleConstantExpression | this_TypeId_1= ruleTypeId | this_IdExpression_2= ruleIdExpression )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5308:1: (this_ConstantExpression_0= ruleConstantExpression | this_TypeId_1= ruleTypeId | this_IdExpression_2= ruleIdExpression )
            int alt119=3;
            switch ( input.LA(1) ) {
            case 154:
                {
                alt119=1;
                }
                break;
            case RULE_ID:
            case 72:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 93:
            case 101:
            case 153:
            case 156:
                {
                alt119=2;
                }
                break;
            case 155:
                {
                alt119=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 119, 0, input);

                throw nvae;
            }

            switch (alt119) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5309:5: this_ConstantExpression_0= ruleConstantExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTemplateArgumentAccess().getConstantExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleConstantExpression_in_ruleTemplateArgument15508);
                    this_ConstantExpression_0=ruleConstantExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ConstantExpression_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5321:5: this_TypeId_1= ruleTypeId
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTemplateArgumentAccess().getTypeIdParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTypeId_in_ruleTemplateArgument15541);
                    this_TypeId_1=ruleTypeId();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_TypeId_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5333:5: this_IdExpression_2= ruleIdExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTemplateArgumentAccess().getIdExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIdExpression_in_ruleTemplateArgument15574);
                    this_IdExpression_2=ruleIdExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_IdExpression_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTemplateArgument"


    // $ANTLR start "entryRuleTypenameSpecifier"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5351:1: entryRuleTypenameSpecifier returns [String current=null] : iv_ruleTypenameSpecifier= ruleTypenameSpecifier EOF ;
    public final String entryRuleTypenameSpecifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypenameSpecifier = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5352:2: (iv_ruleTypenameSpecifier= ruleTypenameSpecifier EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5353:2: iv_ruleTypenameSpecifier= ruleTypenameSpecifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypenameSpecifierRule()); 
            }
            pushFollow(FOLLOW_ruleTypenameSpecifier_in_entryRuleTypenameSpecifier15620);
            iv_ruleTypenameSpecifier=ruleTypenameSpecifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypenameSpecifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypenameSpecifier15631); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5360:1: ruleTypenameSpecifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'typename' (kw= '::' )? this_NestedNameSpecifier_2= ruleNestedNameSpecifier (this_ID_3= RULE_ID | ( (kw= 'template' )? this_ID_5= RULE_ID kw= '<' this_TemplateArgumentList_7= ruleTemplateArgumentList kw= '>' ) ) ) ;
    public final AntlrDatatypeRuleToken ruleTypenameSpecifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_3=null;
        Token this_ID_5=null;
        AntlrDatatypeRuleToken this_NestedNameSpecifier_2 = null;

        AntlrDatatypeRuleToken this_TemplateArgumentList_7 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5363:28: ( (kw= 'typename' (kw= '::' )? this_NestedNameSpecifier_2= ruleNestedNameSpecifier (this_ID_3= RULE_ID | ( (kw= 'template' )? this_ID_5= RULE_ID kw= '<' this_TemplateArgumentList_7= ruleTemplateArgumentList kw= '>' ) ) ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5364:1: (kw= 'typename' (kw= '::' )? this_NestedNameSpecifier_2= ruleNestedNameSpecifier (this_ID_3= RULE_ID | ( (kw= 'template' )? this_ID_5= RULE_ID kw= '<' this_TemplateArgumentList_7= ruleTemplateArgumentList kw= '>' ) ) )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5364:1: (kw= 'typename' (kw= '::' )? this_NestedNameSpecifier_2= ruleNestedNameSpecifier (this_ID_3= RULE_ID | ( (kw= 'template' )? this_ID_5= RULE_ID kw= '<' this_TemplateArgumentList_7= ruleTemplateArgumentList kw= '>' ) ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5365:2: kw= 'typename' (kw= '::' )? this_NestedNameSpecifier_2= ruleNestedNameSpecifier (this_ID_3= RULE_ID | ( (kw= 'template' )? this_ID_5= RULE_ID kw= '<' this_TemplateArgumentList_7= ruleTemplateArgumentList kw= '>' ) )
            {
            kw=(Token)match(input,93,FOLLOW_93_in_ruleTypenameSpecifier15669); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getTypenameSpecifierAccess().getTypenameKeyword_0()); 
                  
            }
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5370:1: (kw= '::' )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==72) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5371:2: kw= '::'
                    {
                    kw=(Token)match(input,72,FOLLOW_72_in_ruleTypenameSpecifier15683); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTypenameSpecifierAccess().getColonColonKeyword_1()); 
                          
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getTypenameSpecifierAccess().getNestedNameSpecifierParserRuleCall_2()); 
                  
            }
            pushFollow(FOLLOW_ruleNestedNameSpecifier_in_ruleTypenameSpecifier15707);
            this_NestedNameSpecifier_2=ruleNestedNameSpecifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_NestedNameSpecifier_2);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5387:1: (this_ID_3= RULE_ID | ( (kw= 'template' )? this_ID_5= RULE_ID kw= '<' this_TemplateArgumentList_7= ruleTemplateArgumentList kw= '>' ) )
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==RULE_ID) ) {
                int LA122_1 = input.LA(2);

                if ( (LA122_1==109) ) {
                    alt122=2;
                }
                else if ( (LA122_1==EOF||LA122_1==RULE_ID||(LA122_1>=41 && LA122_1<=42)||LA122_1==46||(LA122_1>=60 && LA122_1<=72)||(LA122_1>=74 && LA122_1<=91)||LA122_1==93||LA122_1==99||LA122_1==101||LA122_1==110||(LA122_1>=153 && LA122_1<=156)) ) {
                    alt122=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 122, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA122_0==73) ) {
                alt122=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 122, 0, input);

                throw nvae;
            }
            switch (alt122) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5387:6: this_ID_3= RULE_ID
                    {
                    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypenameSpecifier15728); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_3, grammarAccess.getTypenameSpecifierAccess().getIDTerminalRuleCall_3_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5395:6: ( (kw= 'template' )? this_ID_5= RULE_ID kw= '<' this_TemplateArgumentList_7= ruleTemplateArgumentList kw= '>' )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5395:6: ( (kw= 'template' )? this_ID_5= RULE_ID kw= '<' this_TemplateArgumentList_7= ruleTemplateArgumentList kw= '>' )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5395:7: (kw= 'template' )? this_ID_5= RULE_ID kw= '<' this_TemplateArgumentList_7= ruleTemplateArgumentList kw= '>'
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5395:7: (kw= 'template' )?
                    int alt121=2;
                    int LA121_0 = input.LA(1);

                    if ( (LA121_0==73) ) {
                        alt121=1;
                    }
                    switch (alt121) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5396:2: kw= 'template'
                            {
                            kw=(Token)match(input,73,FOLLOW_73_in_ruleTypenameSpecifier15754); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getTypenameSpecifierAccess().getTemplateKeyword_3_1_0()); 
                                  
                            }

                            }
                            break;

                    }

                    this_ID_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypenameSpecifier15771); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_5);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_5, grammarAccess.getTypenameSpecifierAccess().getIDTerminalRuleCall_3_1_1()); 
                          
                    }
                    kw=(Token)match(input,109,FOLLOW_109_in_ruleTypenameSpecifier15789); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTypenameSpecifierAccess().getLessThanSignKeyword_3_1_2()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypenameSpecifierAccess().getTemplateArgumentListParserRuleCall_3_1_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTemplateArgumentList_in_ruleTypenameSpecifier15811);
                    this_TemplateArgumentList_7=ruleTemplateArgumentList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_TemplateArgumentList_7);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    kw=(Token)match(input,110,FOLLOW_110_in_ruleTypenameSpecifier15829); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTypenameSpecifierAccess().getGreaterThanSignKeyword_3_1_4()); 
                          
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTypenameSpecifier"


    // $ANTLR start "entryRuleTryBlock"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5439:1: entryRuleTryBlock returns [String current=null] : iv_ruleTryBlock= ruleTryBlock EOF ;
    public final String entryRuleTryBlock() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTryBlock = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5440:2: (iv_ruleTryBlock= ruleTryBlock EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5441:2: iv_ruleTryBlock= ruleTryBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTryBlockRule()); 
            }
            pushFollow(FOLLOW_ruleTryBlock_in_entryRuleTryBlock15872);
            iv_ruleTryBlock=ruleTryBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTryBlock.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTryBlock15883); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTryBlock"


    // $ANTLR start "ruleTryBlock"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5448:1: ruleTryBlock returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'try' this_CompoundStatement_1= ruleCompoundStatement (this_Handler_2= ruleHandler )+ ) ;
    public final AntlrDatatypeRuleToken ruleTryBlock() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_CompoundStatement_1 = null;

        AntlrDatatypeRuleToken this_Handler_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5451:28: ( (kw= 'try' this_CompoundStatement_1= ruleCompoundStatement (this_Handler_2= ruleHandler )+ ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5452:1: (kw= 'try' this_CompoundStatement_1= ruleCompoundStatement (this_Handler_2= ruleHandler )+ )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5452:1: (kw= 'try' this_CompoundStatement_1= ruleCompoundStatement (this_Handler_2= ruleHandler )+ )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5453:2: kw= 'try' this_CompoundStatement_1= ruleCompoundStatement (this_Handler_2= ruleHandler )+
            {
            kw=(Token)match(input,146,FOLLOW_146_in_ruleTryBlock15921); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getTryBlockAccess().getTryKeyword_0()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getTryBlockAccess().getCompoundStatementParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleCompoundStatement_in_ruleTryBlock15943);
            this_CompoundStatement_1=ruleCompoundStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_CompoundStatement_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5469:1: (this_Handler_2= ruleHandler )+
            int cnt123=0;
            loop123:
            do {
                int alt123=2;
                int LA123_0 = input.LA(1);

                if ( (LA123_0==147) ) {
                    alt123=1;
                }


                switch (alt123) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5470:5: this_Handler_2= ruleHandler
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getTryBlockAccess().getHandlerParserRuleCall_2()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleHandler_in_ruleTryBlock15971);
            	    this_Handler_2=ruleHandler();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_Handler_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt123 >= 1 ) break loop123;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(123, input);
                        throw eee;
                }
                cnt123++;
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTryBlock"


    // $ANTLR start "entryRuleFunctionTryBlock"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5488:1: entryRuleFunctionTryBlock returns [String current=null] : iv_ruleFunctionTryBlock= ruleFunctionTryBlock EOF ;
    public final String entryRuleFunctionTryBlock() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunctionTryBlock = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5489:2: (iv_ruleFunctionTryBlock= ruleFunctionTryBlock EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5490:2: iv_ruleFunctionTryBlock= ruleFunctionTryBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionTryBlockRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionTryBlock_in_entryRuleFunctionTryBlock16019);
            iv_ruleFunctionTryBlock=ruleFunctionTryBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionTryBlock.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionTryBlock16030); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5497:1: ruleFunctionTryBlock returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'try' (this_CtorInitializer_1= ruleCtorInitializer )? this_CompoundStatement_2= ruleCompoundStatement (this_Handler_3= ruleHandler )+ ) ;
    public final AntlrDatatypeRuleToken ruleFunctionTryBlock() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_CtorInitializer_1 = null;

        AntlrDatatypeRuleToken this_CompoundStatement_2 = null;

        AntlrDatatypeRuleToken this_Handler_3 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5500:28: ( (kw= 'try' (this_CtorInitializer_1= ruleCtorInitializer )? this_CompoundStatement_2= ruleCompoundStatement (this_Handler_3= ruleHandler )+ ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5501:1: (kw= 'try' (this_CtorInitializer_1= ruleCtorInitializer )? this_CompoundStatement_2= ruleCompoundStatement (this_Handler_3= ruleHandler )+ )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5501:1: (kw= 'try' (this_CtorInitializer_1= ruleCtorInitializer )? this_CompoundStatement_2= ruleCompoundStatement (this_Handler_3= ruleHandler )+ )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5502:2: kw= 'try' (this_CtorInitializer_1= ruleCtorInitializer )? this_CompoundStatement_2= ruleCompoundStatement (this_Handler_3= ruleHandler )+
            {
            kw=(Token)match(input,146,FOLLOW_146_in_ruleFunctionTryBlock16068); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getFunctionTryBlockAccess().getTryKeyword_0()); 
                  
            }
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5507:1: (this_CtorInitializer_1= ruleCtorInitializer )?
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==158) ) {
                alt124=1;
            }
            switch (alt124) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5508:5: this_CtorInitializer_1= ruleCtorInitializer
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFunctionTryBlockAccess().getCtorInitializerParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCtorInitializer_in_ruleFunctionTryBlock16091);
                    this_CtorInitializer_1=ruleCtorInitializer();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_CtorInitializer_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getFunctionTryBlockAccess().getCompoundStatementParserRuleCall_2()); 
                  
            }
            pushFollow(FOLLOW_ruleCompoundStatement_in_ruleFunctionTryBlock16120);
            this_CompoundStatement_2=ruleCompoundStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_CompoundStatement_2);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5529:1: (this_Handler_3= ruleHandler )+
            int cnt125=0;
            loop125:
            do {
                int alt125=2;
                int LA125_0 = input.LA(1);

                if ( (LA125_0==147) ) {
                    alt125=1;
                }


                switch (alt125) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5530:5: this_Handler_3= ruleHandler
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getFunctionTryBlockAccess().getHandlerParserRuleCall_3()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleHandler_in_ruleFunctionTryBlock16148);
            	    this_Handler_3=ruleHandler();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_Handler_3);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt125 >= 1 ) break loop125;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(125, input);
                        throw eee;
                }
                cnt125++;
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleFunctionTryBlock"


    // $ANTLR start "entryRuleHandler"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5548:1: entryRuleHandler returns [String current=null] : iv_ruleHandler= ruleHandler EOF ;
    public final String entryRuleHandler() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleHandler = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5549:2: (iv_ruleHandler= ruleHandler EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5550:2: iv_ruleHandler= ruleHandler EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHandlerRule()); 
            }
            pushFollow(FOLLOW_ruleHandler_in_entryRuleHandler16196);
            iv_ruleHandler=ruleHandler();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHandler.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHandler16207); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5557:1: ruleHandler returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'catch' kw= '(' this_ExceptionDeclaration_2= ruleExceptionDeclaration kw= ')' this_CompoundStatement_4= ruleCompoundStatement ) ;
    public final AntlrDatatypeRuleToken ruleHandler() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ExceptionDeclaration_2 = null;

        AntlrDatatypeRuleToken this_CompoundStatement_4 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5560:28: ( (kw= 'catch' kw= '(' this_ExceptionDeclaration_2= ruleExceptionDeclaration kw= ')' this_CompoundStatement_4= ruleCompoundStatement ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5561:1: (kw= 'catch' kw= '(' this_ExceptionDeclaration_2= ruleExceptionDeclaration kw= ')' this_CompoundStatement_4= ruleCompoundStatement )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5561:1: (kw= 'catch' kw= '(' this_ExceptionDeclaration_2= ruleExceptionDeclaration kw= ')' this_CompoundStatement_4= ruleCompoundStatement )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5562:2: kw= 'catch' kw= '(' this_ExceptionDeclaration_2= ruleExceptionDeclaration kw= ')' this_CompoundStatement_4= ruleCompoundStatement
            {
            kw=(Token)match(input,147,FOLLOW_147_in_ruleHandler16245); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getHandlerAccess().getCatchKeyword_0()); 
                  
            }
            kw=(Token)match(input,45,FOLLOW_45_in_ruleHandler16258); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getHandlerAccess().getLeftParenthesisKeyword_1()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getHandlerAccess().getExceptionDeclarationParserRuleCall_2()); 
                  
            }
            pushFollow(FOLLOW_ruleExceptionDeclaration_in_ruleHandler16280);
            this_ExceptionDeclaration_2=ruleExceptionDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ExceptionDeclaration_2);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            kw=(Token)match(input,46,FOLLOW_46_in_ruleHandler16298); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getHandlerAccess().getRightParenthesisKeyword_3()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getHandlerAccess().getCompoundStatementParserRuleCall_4()); 
                  
            }
            pushFollow(FOLLOW_ruleCompoundStatement_in_ruleHandler16320);
            this_CompoundStatement_4=ruleCompoundStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_CompoundStatement_4);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleHandler"


    // $ANTLR start "entryRuleExceptionDeclaration"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5609:1: entryRuleExceptionDeclaration returns [String current=null] : iv_ruleExceptionDeclaration= ruleExceptionDeclaration EOF ;
    public final String entryRuleExceptionDeclaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExceptionDeclaration = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5610:2: (iv_ruleExceptionDeclaration= ruleExceptionDeclaration EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5611:2: iv_ruleExceptionDeclaration= ruleExceptionDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExceptionDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleExceptionDeclaration_in_entryRuleExceptionDeclaration16366);
            iv_ruleExceptionDeclaration=ruleExceptionDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExceptionDeclaration.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExceptionDeclaration16377); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5618:1: ruleExceptionDeclaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_TypeSpecifier_0= ruleTypeSpecifier )+ (this_DeclaratorId_1= ruleDeclaratorId )? ) | kw= '...' ) ;
    public final AntlrDatatypeRuleToken ruleExceptionDeclaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_TypeSpecifier_0 = null;

        AntlrDatatypeRuleToken this_DeclaratorId_1 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5621:28: ( ( ( (this_TypeSpecifier_0= ruleTypeSpecifier )+ (this_DeclaratorId_1= ruleDeclaratorId )? ) | kw= '...' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5622:1: ( ( (this_TypeSpecifier_0= ruleTypeSpecifier )+ (this_DeclaratorId_1= ruleDeclaratorId )? ) | kw= '...' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5622:1: ( ( (this_TypeSpecifier_0= ruleTypeSpecifier )+ (this_DeclaratorId_1= ruleDeclaratorId )? ) | kw= '...' )
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==RULE_ID||LA128_0==72||(LA128_0>=74 && LA128_0<=91)||LA128_0==93||LA128_0==101||LA128_0==153||LA128_0==156) ) {
                alt128=1;
            }
            else if ( (LA128_0==99) ) {
                alt128=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 128, 0, input);

                throw nvae;
            }
            switch (alt128) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5622:2: ( (this_TypeSpecifier_0= ruleTypeSpecifier )+ (this_DeclaratorId_1= ruleDeclaratorId )? )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5622:2: ( (this_TypeSpecifier_0= ruleTypeSpecifier )+ (this_DeclaratorId_1= ruleDeclaratorId )? )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5622:3: (this_TypeSpecifier_0= ruleTypeSpecifier )+ (this_DeclaratorId_1= ruleDeclaratorId )?
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5622:3: (this_TypeSpecifier_0= ruleTypeSpecifier )+
                    int cnt126=0;
                    loop126:
                    do {
                        int alt126=2;
                        int LA126_0 = input.LA(1);

                        if ( (LA126_0==RULE_ID||LA126_0==72||(LA126_0>=74 && LA126_0<=91)||LA126_0==93||LA126_0==101||LA126_0==153||LA126_0==156) ) {
                            alt126=1;
                        }


                        switch (alt126) {
                    	case 1 :
                    	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5623:5: this_TypeSpecifier_0= ruleTypeSpecifier
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getExceptionDeclarationAccess().getTypeSpecifierParserRuleCall_0_0()); 
                    	          
                    	    }
                    	    pushFollow(FOLLOW_ruleTypeSpecifier_in_ruleExceptionDeclaration16426);
                    	    this_TypeSpecifier_0=ruleTypeSpecifier();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		current.merge(this_TypeSpecifier_0);
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              afterParserOrEnumRuleCall();
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt126 >= 1 ) break loop126;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(126, input);
                                throw eee;
                        }
                        cnt126++;
                    } while (true);

                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5633:3: (this_DeclaratorId_1= ruleDeclaratorId )?
                    int alt127=2;
                    int LA127_0 = input.LA(1);

                    if ( (LA127_0==99||LA127_0==155) ) {
                        alt127=1;
                    }
                    switch (alt127) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5634:5: this_DeclaratorId_1= ruleDeclaratorId
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getExceptionDeclarationAccess().getDeclaratorIdParserRuleCall_0_1()); 
                                  
                            }
                            pushFollow(FOLLOW_ruleDeclaratorId_in_ruleExceptionDeclaration16456);
                            this_DeclaratorId_1=ruleDeclaratorId();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_DeclaratorId_1);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5646:2: kw= '...'
                    {
                    kw=(Token)match(input,99,FOLLOW_99_in_ruleExceptionDeclaration16483); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExceptionDeclarationAccess().getFullStopFullStopFullStopKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleExceptionDeclaration"


    // $ANTLR start "entryRuleExceptionSpecification"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5661:1: entryRuleExceptionSpecification returns [String current=null] : iv_ruleExceptionSpecification= ruleExceptionSpecification EOF ;
    public final String entryRuleExceptionSpecification() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExceptionSpecification = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5662:2: (iv_ruleExceptionSpecification= ruleExceptionSpecification EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5663:2: iv_ruleExceptionSpecification= ruleExceptionSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExceptionSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleExceptionSpecification_in_entryRuleExceptionSpecification16526);
            iv_ruleExceptionSpecification=ruleExceptionSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExceptionSpecification.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExceptionSpecification16537); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5670:1: ruleExceptionSpecification returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DynamicExceptionSpecification_0= ruleDynamicExceptionSpecification | this_NoexceptSpecification_1= ruleNoexceptSpecification ) ;
    public final AntlrDatatypeRuleToken ruleExceptionSpecification() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_DynamicExceptionSpecification_0 = null;

        AntlrDatatypeRuleToken this_NoexceptSpecification_1 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5673:28: ( (this_DynamicExceptionSpecification_0= ruleDynamicExceptionSpecification | this_NoexceptSpecification_1= ruleNoexceptSpecification ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5674:1: (this_DynamicExceptionSpecification_0= ruleDynamicExceptionSpecification | this_NoexceptSpecification_1= ruleNoexceptSpecification )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5674:1: (this_DynamicExceptionSpecification_0= ruleDynamicExceptionSpecification | this_NoexceptSpecification_1= ruleNoexceptSpecification )
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==148) ) {
                alt129=1;
            }
            else if ( (LA129_0==149) ) {
                alt129=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 129, 0, input);

                throw nvae;
            }
            switch (alt129) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5675:5: this_DynamicExceptionSpecification_0= ruleDynamicExceptionSpecification
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExceptionSpecificationAccess().getDynamicExceptionSpecificationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDynamicExceptionSpecification_in_ruleExceptionSpecification16584);
                    this_DynamicExceptionSpecification_0=ruleDynamicExceptionSpecification();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_DynamicExceptionSpecification_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5687:5: this_NoexceptSpecification_1= ruleNoexceptSpecification
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExceptionSpecificationAccess().getNoexceptSpecificationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNoexceptSpecification_in_ruleExceptionSpecification16617);
                    this_NoexceptSpecification_1=ruleNoexceptSpecification();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NoexceptSpecification_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleExceptionSpecification"


    // $ANTLR start "entryRuleDynamicExceptionSpecification"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5705:1: entryRuleDynamicExceptionSpecification returns [String current=null] : iv_ruleDynamicExceptionSpecification= ruleDynamicExceptionSpecification EOF ;
    public final String entryRuleDynamicExceptionSpecification() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDynamicExceptionSpecification = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5706:2: (iv_ruleDynamicExceptionSpecification= ruleDynamicExceptionSpecification EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5707:2: iv_ruleDynamicExceptionSpecification= ruleDynamicExceptionSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDynamicExceptionSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleDynamicExceptionSpecification_in_entryRuleDynamicExceptionSpecification16663);
            iv_ruleDynamicExceptionSpecification=ruleDynamicExceptionSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDynamicExceptionSpecification.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDynamicExceptionSpecification16674); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5714:1: ruleDynamicExceptionSpecification returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'throw' kw= '(' this_TypeIdList_2= ruleTypeIdList kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleDynamicExceptionSpecification() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_TypeIdList_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5717:28: ( (kw= 'throw' kw= '(' this_TypeIdList_2= ruleTypeIdList kw= ')' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5718:1: (kw= 'throw' kw= '(' this_TypeIdList_2= ruleTypeIdList kw= ')' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5718:1: (kw= 'throw' kw= '(' this_TypeIdList_2= ruleTypeIdList kw= ')' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5719:2: kw= 'throw' kw= '(' this_TypeIdList_2= ruleTypeIdList kw= ')'
            {
            kw=(Token)match(input,148,FOLLOW_148_in_ruleDynamicExceptionSpecification16712); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getDynamicExceptionSpecificationAccess().getThrowKeyword_0()); 
                  
            }
            kw=(Token)match(input,45,FOLLOW_45_in_ruleDynamicExceptionSpecification16725); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getDynamicExceptionSpecificationAccess().getLeftParenthesisKeyword_1()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDynamicExceptionSpecificationAccess().getTypeIdListParserRuleCall_2()); 
                  
            }
            pushFollow(FOLLOW_ruleTypeIdList_in_ruleDynamicExceptionSpecification16747);
            this_TypeIdList_2=ruleTypeIdList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_TypeIdList_2);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            kw=(Token)match(input,46,FOLLOW_46_in_ruleDynamicExceptionSpecification16765); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getDynamicExceptionSpecificationAccess().getRightParenthesisKeyword_3()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDynamicExceptionSpecification"


    // $ANTLR start "entryRuleNoexceptSpecification"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5755:1: entryRuleNoexceptSpecification returns [String current=null] : iv_ruleNoexceptSpecification= ruleNoexceptSpecification EOF ;
    public final String entryRuleNoexceptSpecification() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNoexceptSpecification = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5756:2: (iv_ruleNoexceptSpecification= ruleNoexceptSpecification EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5757:2: iv_ruleNoexceptSpecification= ruleNoexceptSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNoexceptSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleNoexceptSpecification_in_entryRuleNoexceptSpecification16806);
            iv_ruleNoexceptSpecification=ruleNoexceptSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNoexceptSpecification.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoexceptSpecification16817); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5764:1: ruleNoexceptSpecification returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'noexcept' (kw= '(' this_ConstantExpression_2= ruleConstantExpression kw= ')' )? ) ;
    public final AntlrDatatypeRuleToken ruleNoexceptSpecification() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ConstantExpression_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5767:28: ( (kw= 'noexcept' (kw= '(' this_ConstantExpression_2= ruleConstantExpression kw= ')' )? ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5768:1: (kw= 'noexcept' (kw= '(' this_ConstantExpression_2= ruleConstantExpression kw= ')' )? )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5768:1: (kw= 'noexcept' (kw= '(' this_ConstantExpression_2= ruleConstantExpression kw= ')' )? )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5769:2: kw= 'noexcept' (kw= '(' this_ConstantExpression_2= ruleConstantExpression kw= ')' )?
            {
            kw=(Token)match(input,149,FOLLOW_149_in_ruleNoexceptSpecification16855); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getNoexceptSpecificationAccess().getNoexceptKeyword_0()); 
                  
            }
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5774:1: (kw= '(' this_ConstantExpression_2= ruleConstantExpression kw= ')' )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==45) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5775:2: kw= '(' this_ConstantExpression_2= ruleConstantExpression kw= ')'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleNoexceptSpecification16869); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNoexceptSpecificationAccess().getLeftParenthesisKeyword_1_0()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNoexceptSpecificationAccess().getConstantExpressionParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleConstantExpression_in_ruleNoexceptSpecification16891);
                    this_ConstantExpression_2=ruleConstantExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ConstantExpression_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleNoexceptSpecification16909); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNoexceptSpecificationAccess().getRightParenthesisKeyword_1_2()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNoexceptSpecification"


    // $ANTLR start "entryRuleExpression"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5805:1: entryRuleExpression returns [String current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final String entryRuleExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpression = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5806:2: (iv_ruleExpression= ruleExpression EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5807:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression16952);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression16963); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5814:1: ruleExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Expression' ;
    public final AntlrDatatypeRuleToken ruleExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5817:28: (kw= 'Expression' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5819:2: kw= 'Expression'
            {
            kw=(Token)match(input,150,FOLLOW_150_in_ruleExpression17000); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getExpressionAccess().getExpressionKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleExpressionList"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5832:1: entryRuleExpressionList returns [String current=null] : iv_ruleExpressionList= ruleExpressionList EOF ;
    public final String entryRuleExpressionList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpressionList = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5833:2: (iv_ruleExpressionList= ruleExpressionList EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5834:2: iv_ruleExpressionList= ruleExpressionList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionListRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionList_in_entryRuleExpressionList17040);
            iv_ruleExpressionList=ruleExpressionList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionList.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionList17051); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5841:1: ruleExpressionList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Expression_0= ruleExpression (kw= ',' this_Expression_2= ruleExpression )* ) ;
    public final AntlrDatatypeRuleToken ruleExpressionList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Expression_0 = null;

        AntlrDatatypeRuleToken this_Expression_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5844:28: ( (this_Expression_0= ruleExpression (kw= ',' this_Expression_2= ruleExpression )* ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5845:1: (this_Expression_0= ruleExpression (kw= ',' this_Expression_2= ruleExpression )* )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5845:1: (this_Expression_0= ruleExpression (kw= ',' this_Expression_2= ruleExpression )* )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5846:5: this_Expression_0= ruleExpression (kw= ',' this_Expression_2= ruleExpression )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionListAccess().getExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleExpressionList17098);
            this_Expression_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Expression_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5856:1: (kw= ',' this_Expression_2= ruleExpression )*
            loop131:
            do {
                int alt131=2;
                int LA131_0 = input.LA(1);

                if ( (LA131_0==60) ) {
                    alt131=1;
                }


                switch (alt131) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5857:2: kw= ',' this_Expression_2= ruleExpression
            	    {
            	    kw=(Token)match(input,60,FOLLOW_60_in_ruleExpressionList17117); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getExpressionListAccess().getCommaKeyword_1_0()); 
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getExpressionListAccess().getExpressionParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleExpressionList17139);
            	    this_Expression_2=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_Expression_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop131;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleExpressionList"


    // $ANTLR start "entryRuleExplicitSpecialization"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5881:1: entryRuleExplicitSpecialization returns [String current=null] : iv_ruleExplicitSpecialization= ruleExplicitSpecialization EOF ;
    public final String entryRuleExplicitSpecialization() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExplicitSpecialization = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5882:2: (iv_ruleExplicitSpecialization= ruleExplicitSpecialization EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5883:2: iv_ruleExplicitSpecialization= ruleExplicitSpecialization EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExplicitSpecializationRule()); 
            }
            pushFollow(FOLLOW_ruleExplicitSpecialization_in_entryRuleExplicitSpecialization17187);
            iv_ruleExplicitSpecialization=ruleExplicitSpecialization();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExplicitSpecialization.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExplicitSpecialization17198); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5890:1: ruleExplicitSpecialization returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'ExplicitSpecialization' ;
    public final AntlrDatatypeRuleToken ruleExplicitSpecialization() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5893:28: (kw= 'ExplicitSpecialization' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5895:2: kw= 'ExplicitSpecialization'
            {
            kw=(Token)match(input,151,FOLLOW_151_in_ruleExplicitSpecialization17235); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getExplicitSpecializationAccess().getExplicitSpecializationKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleExplicitSpecialization"


    // $ANTLR start "entryRuleExplicitInstantiation"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5908:1: entryRuleExplicitInstantiation returns [String current=null] : iv_ruleExplicitInstantiation= ruleExplicitInstantiation EOF ;
    public final String entryRuleExplicitInstantiation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExplicitInstantiation = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5909:2: (iv_ruleExplicitInstantiation= ruleExplicitInstantiation EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5910:2: iv_ruleExplicitInstantiation= ruleExplicitInstantiation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExplicitInstantiationRule()); 
            }
            pushFollow(FOLLOW_ruleExplicitInstantiation_in_entryRuleExplicitInstantiation17275);
            iv_ruleExplicitInstantiation=ruleExplicitInstantiation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExplicitInstantiation.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExplicitInstantiation17286); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5917:1: ruleExplicitInstantiation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'ExplicitInstantiation' ;
    public final AntlrDatatypeRuleToken ruleExplicitInstantiation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5920:28: (kw= 'ExplicitInstantiation' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5922:2: kw= 'ExplicitInstantiation'
            {
            kw=(Token)match(input,152,FOLLOW_152_in_ruleExplicitInstantiation17323); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getExplicitInstantiationAccess().getExplicitInstantiationKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleExplicitInstantiation"


    // $ANTLR start "entryRuleCvQualifier"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5935:1: entryRuleCvQualifier returns [String current=null] : iv_ruleCvQualifier= ruleCvQualifier EOF ;
    public final String entryRuleCvQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCvQualifier = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5936:2: (iv_ruleCvQualifier= ruleCvQualifier EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5937:2: iv_ruleCvQualifier= ruleCvQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCvQualifierRule()); 
            }
            pushFollow(FOLLOW_ruleCvQualifier_in_entryRuleCvQualifier17363);
            iv_ruleCvQualifier=ruleCvQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCvQualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCvQualifier17374); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5944:1: ruleCvQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'CvQualifier' ;
    public final AntlrDatatypeRuleToken ruleCvQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5947:28: (kw= 'CvQualifier' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5949:2: kw= 'CvQualifier'
            {
            kw=(Token)match(input,153,FOLLOW_153_in_ruleCvQualifier17411); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getCvQualifierAccess().getCvQualifierKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleCvQualifier"


    // $ANTLR start "entryRuleConstantExpression"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5962:1: entryRuleConstantExpression returns [String current=null] : iv_ruleConstantExpression= ruleConstantExpression EOF ;
    public final String entryRuleConstantExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConstantExpression = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5963:2: (iv_ruleConstantExpression= ruleConstantExpression EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5964:2: iv_ruleConstantExpression= ruleConstantExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleConstantExpression_in_entryRuleConstantExpression17451);
            iv_ruleConstantExpression=ruleConstantExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstantExpression.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantExpression17462); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5971:1: ruleConstantExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'ConstantExpression' ;
    public final AntlrDatatypeRuleToken ruleConstantExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5974:28: (kw= 'ConstantExpression' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5976:2: kw= 'ConstantExpression'
            {
            kw=(Token)match(input,154,FOLLOW_154_in_ruleConstantExpression17499); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getConstantExpressionAccess().getConstantExpressionKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleConstantExpression"


    // $ANTLR start "entryRuleIdExpression"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5989:1: entryRuleIdExpression returns [String current=null] : iv_ruleIdExpression= ruleIdExpression EOF ;
    public final String entryRuleIdExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdExpression = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5990:2: (iv_ruleIdExpression= ruleIdExpression EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5991:2: iv_ruleIdExpression= ruleIdExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleIdExpression_in_entryRuleIdExpression17539);
            iv_ruleIdExpression=ruleIdExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdExpression.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdExpression17550); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:5998:1: ruleIdExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'IdExpression' ;
    public final AntlrDatatypeRuleToken ruleIdExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6001:28: (kw= 'IdExpression' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6003:2: kw= 'IdExpression'
            {
            kw=(Token)match(input,155,FOLLOW_155_in_ruleIdExpression17587); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getIdExpressionAccess().getIdExpressionKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleIdExpression"


    // $ANTLR start "entryRuleNestedNameSpecifier"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6016:1: entryRuleNestedNameSpecifier returns [String current=null] : iv_ruleNestedNameSpecifier= ruleNestedNameSpecifier EOF ;
    public final String entryRuleNestedNameSpecifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNestedNameSpecifier = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6017:2: (iv_ruleNestedNameSpecifier= ruleNestedNameSpecifier EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6018:2: iv_ruleNestedNameSpecifier= ruleNestedNameSpecifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNestedNameSpecifierRule()); 
            }
            pushFollow(FOLLOW_ruleNestedNameSpecifier_in_entryRuleNestedNameSpecifier17627);
            iv_ruleNestedNameSpecifier=ruleNestedNameSpecifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNestedNameSpecifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNestedNameSpecifier17638); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6025:1: ruleNestedNameSpecifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'NestedNameSpecifier' ;
    public final AntlrDatatypeRuleToken ruleNestedNameSpecifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6028:28: (kw= 'NestedNameSpecifier' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6030:2: kw= 'NestedNameSpecifier'
            {
            kw=(Token)match(input,156,FOLLOW_156_in_ruleNestedNameSpecifier17675); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getNestedNameSpecifierAccess().getNestedNameSpecifierKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNestedNameSpecifier"


    // $ANTLR start "entryRuleAssignmentExpression"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6043:1: entryRuleAssignmentExpression returns [String current=null] : iv_ruleAssignmentExpression= ruleAssignmentExpression EOF ;
    public final String entryRuleAssignmentExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAssignmentExpression = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6044:2: (iv_ruleAssignmentExpression= ruleAssignmentExpression EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6045:2: iv_ruleAssignmentExpression= ruleAssignmentExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression17715);
            iv_ruleAssignmentExpression=ruleAssignmentExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignmentExpression.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignmentExpression17726); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6052:1: ruleAssignmentExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'AssignmentExpression' ;
    public final AntlrDatatypeRuleToken ruleAssignmentExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6055:28: (kw= 'AssignmentExpression' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6057:2: kw= 'AssignmentExpression'
            {
            kw=(Token)match(input,157,FOLLOW_157_in_ruleAssignmentExpression17763); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getAssignmentExpressionAccess().getAssignmentExpressionKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAssignmentExpression"


    // $ANTLR start "entryRuleCtorInitializer"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6070:1: entryRuleCtorInitializer returns [String current=null] : iv_ruleCtorInitializer= ruleCtorInitializer EOF ;
    public final String entryRuleCtorInitializer() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCtorInitializer = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6071:2: (iv_ruleCtorInitializer= ruleCtorInitializer EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6072:2: iv_ruleCtorInitializer= ruleCtorInitializer EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCtorInitializerRule()); 
            }
            pushFollow(FOLLOW_ruleCtorInitializer_in_entryRuleCtorInitializer17803);
            iv_ruleCtorInitializer=ruleCtorInitializer();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCtorInitializer.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCtorInitializer17814); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6079:1: ruleCtorInitializer returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'CtorInitializer' ;
    public final AntlrDatatypeRuleToken ruleCtorInitializer() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6082:28: (kw= 'CtorInitializer' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6084:2: kw= 'CtorInitializer'
            {
            kw=(Token)match(input,158,FOLLOW_158_in_ruleCtorInitializer17851); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getCtorInitializerAccess().getCtorInitializerKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleCtorInitializer"


    // $ANTLR start "entryRuleTypeIdList"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6097:1: entryRuleTypeIdList returns [String current=null] : iv_ruleTypeIdList= ruleTypeIdList EOF ;
    public final String entryRuleTypeIdList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeIdList = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6098:2: (iv_ruleTypeIdList= ruleTypeIdList EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6099:2: iv_ruleTypeIdList= ruleTypeIdList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeIdListRule()); 
            }
            pushFollow(FOLLOW_ruleTypeIdList_in_entryRuleTypeIdList17891);
            iv_ruleTypeIdList=ruleTypeIdList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeIdList.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeIdList17902); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6106:1: ruleTypeIdList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'TypeIdList' ;
    public final AntlrDatatypeRuleToken ruleTypeIdList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6109:28: (kw= 'TypeIdList' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6111:2: kw= 'TypeIdList'
            {
            kw=(Token)match(input,159,FOLLOW_159_in_ruleTypeIdList17939); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getTypeIdListAccess().getTypeIdListKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTypeIdList"


    // $ANTLR start "entryRuleUnqualifiedId"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6124:1: entryRuleUnqualifiedId returns [String current=null] : iv_ruleUnqualifiedId= ruleUnqualifiedId EOF ;
    public final String entryRuleUnqualifiedId() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnqualifiedId = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6125:2: (iv_ruleUnqualifiedId= ruleUnqualifiedId EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6126:2: iv_ruleUnqualifiedId= ruleUnqualifiedId EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnqualifiedIdRule()); 
            }
            pushFollow(FOLLOW_ruleUnqualifiedId_in_entryRuleUnqualifiedId17979);
            iv_ruleUnqualifiedId=ruleUnqualifiedId();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnqualifiedId.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnqualifiedId17990); if (state.failed) return current;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6133:1: ruleUnqualifiedId returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'UnqualifiedId' ;
    public final AntlrDatatypeRuleToken ruleUnqualifiedId() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6136:28: (kw= 'UnqualifiedId' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6138:2: kw= 'UnqualifiedId'
            {
            kw=(Token)match(input,160,FOLLOW_160_in_ruleUnqualifiedId18027); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getUnqualifiedIdAccess().getUnqualifiedIdKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleUnqualifiedId"

    // $ANTLR start synpred1_InternalCpp2
    public final void synpred1_InternalCpp2_fragment() throws RecognitionException {   
        // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:535:3: ( 'else' )
        // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:536:2: 'else'
        {
        match(input,47,FOLLOW_47_in_synpred1_InternalCpp21416); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalCpp2

    // Delegated rules

    public final boolean synpred1_InternalCpp2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalCpp2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA108 dfa108 = new DFA108(this);
    static final String DFA4_eotS =
        "\12\uffff";
    static final String DFA4_eofS =
        "\12\uffff";
    static final String DFA4_minS =
        "\2\10\10\uffff";
    static final String DFA4_maxS =
        "\2\u009c\10\uffff";
    static final String DFA4_acceptS =
        "\2\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10";
    static final String DFA4_specialS =
        "\12\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\1\36\uffff\2\2\1\10\1\4\1\uffff\1\5\3\uffff\1\5\1\uffff"+
            "\3\6\4\7\1\10\1\uffff\1\10\1\uffff\14\10\1\uffff\25\10\4\uffff"+
            "\1\10\1\uffff\1\10\54\uffff\1\11\3\uffff\1\3\2\uffff\1\10\1"+
            "\uffff\2\10",
            "\1\10\35\uffff\1\2\2\uffff\1\10\23\uffff\14\10\1\uffff\22"+
            "\10\1\uffff\1\10\5\uffff\1\10\1\uffff\1\10\7\uffff\1\10\53\uffff"+
            "\1\10\1\uffff\2\10",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
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
            return "193:1: (this_LabeledStatement_0= ruleLabeledStatement | this_ExpressionStatement_1= ruleExpressionStatement | this_CompoundStatement_2= ruleCompoundStatement | this_SelectionStatement_3= ruleSelectionStatement | this_IterationStatement_4= ruleIterationStatement | this_JumpStatement_5= ruleJumpStatement | this_DeclarationStatement_6= ruleDeclarationStatement | this_TryBlock_7= ruleTryBlock )";
        }
    }
    static final String DFA19_eotS =
        "\14\uffff";
    static final String DFA19_eofS =
        "\14\uffff";
    static final String DFA19_minS =
        "\1\10\1\uffff\1\7\1\10\1\uffff\1\10\5\uffff\1\52";
    static final String DFA19_maxS =
        "\1\u009c\1\uffff\2\u009c\1\uffff\1\52\5\uffff\1\61";
    static final String DFA19_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\1\uffff\1\3\1\4\1\5\1\6\1\7\1\uffff";
    static final String DFA19_specialS =
        "\14\uffff}>";
    static final String[] DFA19_transitionS = {
            "\1\1\40\uffff\1\1\17\uffff\1\4\1\uffff\1\4\1\uffff\6\1\1\2"+
            "\1\1\1\3\3\1\1\6\22\1\1\5\1\1\1\4\4\uffff\1\1\1\uffff\1\1\61"+
            "\uffff\1\10\1\7\1\1\1\uffff\2\1",
            "",
            "\1\11\1\1\40\uffff\1\1\23\uffff\14\1\1\uffff\22\1\1\uffff"+
            "\1\1\5\uffff\1\1\1\uffff\1\1\63\uffff\1\1\1\uffff\2\1",
            "\1\1\40\uffff\1\1\23\uffff\14\1\1\uffff\22\1\1\12\1\1\5\uffff"+
            "\1\1\1\uffff\1\1\63\uffff\1\1\1\uffff\2\1",
            "",
            "\1\13\41\uffff\1\12",
            "",
            "",
            "",
            "",
            "",
            "\1\12\6\uffff\1\4"
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "1073:1: (this_SimpleOrFunctionDeclaration_0= ruleSimpleOrFunctionDeclaration | this_BlockDeclaration_1= ruleBlockDeclaration | this_TemplateDeclaration_2= ruleTemplateDeclaration | this_ExplicitInstantiation_3= ruleExplicitInstantiation | this_ExplicitSpecialization_4= ruleExplicitSpecialization | this_LinkageSpecification_5= ruleLinkageSpecification | this_NamespaceDefinition_6= ruleNamespaceDefinition )";
        }
    }
    static final String DFA108_eotS =
        "\55\uffff";
    static final String DFA108_eofS =
        "\1\uffff\1\51\1\53\52\uffff";
    static final String DFA108_minS =
        "\1\61\2\155\52\uffff";
    static final String DFA108_maxS =
        "\1\u0090\2\157\52\uffff";
    static final String DFA108_acceptS =
        "\3\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1"+
        "\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34"+
        "\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51"+
        "\1\52\1\1\1\3\1\2\1\4";
    static final String DFA108_specialS =
        "\55\uffff}>";
    static final String[] DFA108_transitionS = {
            "\1\15\10\uffff\1\2\1\uffff\1\44\44\uffff\1\11\1\40\4\uffff"+
            "\1\1\5\uffff\1\16\1\17\2\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\12"+
            "\1\13\1\14\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
            "\1\32\1\33\1\34\1\35\1\36\1\37\1\41\1\42\1\43\1\45\1\46\1\47"+
            "\1\50",
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

    static final short[] DFA108_eot = DFA.unpackEncodedString(DFA108_eotS);
    static final short[] DFA108_eof = DFA.unpackEncodedString(DFA108_eofS);
    static final char[] DFA108_min = DFA.unpackEncodedStringToUnsignedChars(DFA108_minS);
    static final char[] DFA108_max = DFA.unpackEncodedStringToUnsignedChars(DFA108_maxS);
    static final short[] DFA108_accept = DFA.unpackEncodedString(DFA108_acceptS);
    static final short[] DFA108_special = DFA.unpackEncodedString(DFA108_specialS);
    static final short[][] DFA108_transition;

    static {
        int numStates = DFA108_transitionS.length;
        DFA108_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA108_transition[i] = DFA.unpackEncodedString(DFA108_transitionS[i]);
        }
    }

    class DFA108 extends DFA {

        public DFA108(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 108;
            this.eot = DFA108_eot;
            this.eof = DFA108_eof;
            this.min = DFA108_min;
            this.max = DFA108_max;
            this.accept = DFA108_accept;
            this.special = DFA108_special;
            this.transition = DFA108_transition;
        }
        public String getDescription() {
            return "4602:1: (kw= 'new' | kw= 'delete' | (kw= 'new' kw= '[' kw= ']' ) | (kw= 'delete' kw= '[' kw= ']' ) | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= '^' | kw= '&' | kw= '|' | kw= '~' | kw= '!' | kw= '=' | kw= '<' | kw= '>' | kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' | kw= '^=' | kw= '&=' | kw= '|=' | kw= '<<' | kw= '>>' | kw= '>>=' | kw= '<<=' | kw= '==' | kw= '!=' | kw= '<=' | kw= '>=' | kw= '&&' | kw= '||' | kw= '++' | kw= '--' | kw= ',' | kw= '->*' | kw= '->' | kw= '()' | kw= '[]' )";
        }
    }
 

    public static final BitSet FOLLOW_ruleTest_in_entryRuleTest75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTest85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleTest130 = new BitSet(new long[]{0xEA00020000000102L,0x000000287FFFFFFFL,0x000000001B800000L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral169 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLiteral220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CHARACTER_LITERAL_in_ruleLiteral246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOATING_LITERAL_in_ruleLiteral272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_LITERAL_in_ruleLiteral298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleLiteral324 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_36_in_ruleLiteral343 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleLiteral357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement399 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabeledStatement_in_ruleStatement457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionStatement_in_ruleStatement490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundStatement_in_ruleStatement523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectionStatement_in_ruleStatement556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIterationStatement_in_ruleStatement589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJumpStatement_in_ruleStatement622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarationStatement_in_ruleStatement655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTryBlock_in_ruleStatement688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabeledStatement_in_entryRuleLabeledStatement734 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabeledStatement745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLabeledStatement786 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleLabeledStatement804 = new BitSet(new long[]{0xEBFD178000000100L,0x000000287FFFFDFFL,0x000000001A440000L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleLabeledStatement826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleLabeledStatement852 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_ruleConstantExpression_in_ruleLabeledStatement874 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleLabeledStatement892 = new BitSet(new long[]{0xEBFD178000000100L,0x000000287FFFFDFFL,0x000000001A440000L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleLabeledStatement914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleLabeledStatement940 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleLabeledStatement953 = new BitSet(new long[]{0xEBFD178000000100L,0x000000287FFFFDFFL,0x000000001A440000L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleLabeledStatement975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionStatement_in_entryRuleExpressionStatement1022 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionStatement1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionStatement1080 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleExpressionStatement1098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundStatement_in_entryRuleCompoundStatement1139 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompoundStatement1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleCompoundStatement1188 = new BitSet(new long[]{0xEBFD1F8000000100L,0x000000287FFFFDFFL,0x000000001A440000L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleCompoundStatement1211 = new BitSet(new long[]{0xEBFD1F8000000100L,0x000000287FFFFDFFL,0x000000001A440000L});
    public static final BitSet FOLLOW_43_in_ruleCompoundStatement1231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectionStatement_in_entryRuleSelectionStatement1272 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectionStatement1283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleSelectionStatement1322 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleSelectionStatement1335 = new BitSet(new long[]{0xE000000000000100L,0x000000202FFFFDFFL,0x0000000012400000L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleSelectionStatement1357 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleSelectionStatement1375 = new BitSet(new long[]{0xEBFD178000000100L,0x000000287FFFFDFFL,0x000000001A440000L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleSelectionStatement1397 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_ruleSelectionStatement1425 = new BitSet(new long[]{0xEBFD178000000100L,0x000000287FFFFDFFL,0x000000001A440000L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleSelectionStatement1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleSelectionStatement1476 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleSelectionStatement1489 = new BitSet(new long[]{0xE000000000000100L,0x000000202FFFFDFFL,0x0000000012400000L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleSelectionStatement1511 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleSelectionStatement1529 = new BitSet(new long[]{0xEBFD178000000100L,0x000000287FFFFDFFL,0x000000001A440000L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleSelectionStatement1551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition1598 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondition1609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCondition1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarationSpecifier_in_ruleCondition1691 = new BitSet(new long[]{0xE000000000000100L,0x000000282FFFFDFFL,0x000000001A000000L});
    public static final BitSet FOLLOW_ruleDeclaratorId_in_ruleCondition1720 = new BitSet(new long[]{0x0002040000000000L});
    public static final BitSet FOLLOW_49_in_ruleCondition1740 = new BitSet(new long[]{0x0002040000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_ruleInitializerClause_in_ruleCondition1762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBracedInitializerList_in_ruleCondition1796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIterationStatement_in_entryRuleIterationStatement1844 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIterationStatement1855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleIterationStatement1894 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleIterationStatement1907 = new BitSet(new long[]{0xE000000000000100L,0x000000202FFFFDFFL,0x0000000012400000L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleIterationStatement1929 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleIterationStatement1947 = new BitSet(new long[]{0xEBFD178000000100L,0x000000287FFFFDFFL,0x000000001A440000L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleIterationStatement1969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleIterationStatement1995 = new BitSet(new long[]{0xEBFD178000000100L,0x000000287FFFFDFFL,0x000000001A440000L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleIterationStatement2017 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleIterationStatement2035 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleIterationStatement2048 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleIterationStatement2070 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleIterationStatement2088 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleIterationStatement2101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleIterationStatement2122 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleIterationStatement2135 = new BitSet(new long[]{0xE000020000000100L,0x000000282FFFFDFFL,0x000000001A400000L});
    public static final BitSet FOLLOW_ruleForInitializationStatement_in_ruleIterationStatement2157 = new BitSet(new long[]{0xE000020000000100L,0x000000202FFFFDFFL,0x0000000012400000L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleIterationStatement2185 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleIterationStatement2205 = new BitSet(new long[]{0x0000400000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleIterationStatement2228 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleIterationStatement2248 = new BitSet(new long[]{0xEBFD178000000100L,0x000000287FFFFDFFL,0x000000001A440000L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleIterationStatement2270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForInitializationStatement_in_entryRuleForInitializationStatement2317 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForInitializationStatement2328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionStatement_in_ruleForInitializationStatement2375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleDeclaration_in_ruleForInitializationStatement2408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJumpStatement_in_entryRuleJumpStatement2454 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJumpStatement2465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleJumpStatement2504 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleJumpStatement2517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleJumpStatement2538 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleJumpStatement2551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleJumpStatement2572 = new BitSet(new long[]{0x0002060000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleJumpStatement2595 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ruleBracedInitializerList_in_ruleJumpStatement2628 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleJumpStatement2648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleJumpStatement2669 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleJumpStatement2684 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleJumpStatement2702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarationStatement_in_entryRuleDeclarationStatement2744 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclarationStatement2755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleDeclaration_in_ruleDeclarationStatement2802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockDeclaration_in_ruleDeclarationStatement2835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration2881 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration2892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleOrFunctionDeclaration_in_ruleDeclaration2939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockDeclaration_in_ruleDeclaration2972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateDeclaration_in_ruleDeclaration3005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExplicitInstantiation_in_ruleDeclaration3038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExplicitSpecialization_in_ruleDeclaration3071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkageSpecification_in_ruleDeclaration3104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespaceDefinition_in_ruleDeclaration3137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockDeclaration_in_entryRuleBlockDeclaration3183 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlockDeclaration3194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsmDefinition_in_ruleBlockDeclaration3241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespaceAliasDefinition_in_ruleBlockDeclaration3274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsingDeclaration_in_ruleBlockDeclaration3307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticAssertDeclaration_in_ruleBlockDeclaration3340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAliasDeclaration_in_ruleBlockDeclaration3373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAliasDeclaration_in_entryRuleAliasDeclaration3419 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAliasDeclaration3430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleAliasDeclaration3468 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAliasDeclaration3483 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleAliasDeclaration3501 = new BitSet(new long[]{0x0000000000000100L,0x000000202FFFFD00L,0x0000000012000000L});
    public static final BitSet FOLLOW_ruleTypeId_in_ruleAliasDeclaration3523 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleAliasDeclaration3541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleDeclaration_in_entryRuleSimpleDeclaration3582 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleDeclaration3593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarationSpecifier_in_ruleSimpleDeclaration3641 = new BitSet(new long[]{0xE000020000000100L,0x000000282FFFFDFFL,0x000000001A000000L});
    public static final BitSet FOLLOW_ruleSimpleDeclarationSuffix_in_ruleSimpleDeclaration3670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleOrFunctionDeclaration_in_entryRuleSimpleOrFunctionDeclaration3716 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleOrFunctionDeclaration3727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarationSpecifier_in_ruleSimpleOrFunctionDeclaration3775 = new BitSet(new long[]{0xE000020000000100L,0x000000282FFFFDFFL,0x000000001A000000L});
    public static final BitSet FOLLOW_ruleSimpleDeclarationSuffix_in_ruleSimpleOrFunctionDeclaration3805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDeclarationSuffix_in_ruleSimpleOrFunctionDeclaration3838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleDeclarationSuffix_in_entryRuleSimpleDeclarationSuffix3885 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleDeclarationSuffix3896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitDeclaratorList_in_ruleSimpleDeclarationSuffix3944 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleSimpleDeclarationSuffix3964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDeclarationSuffix_in_entryRuleFunctionDeclarationSuffix4005 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionDeclarationSuffix4016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDeclarator_in_ruleFunctionDeclarationSuffix4063 = new BitSet(new long[]{0x0002040000000000L,0x0000000000000000L,0x0000000040040000L});
    public static final BitSet FOLLOW_ruleFunctionBody_in_ruleFunctionDeclarationSuffix4091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleFunctionDeclarationSuffix4116 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleFunctionDeclarationSuffix4129 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleFunctionDeclarationSuffix4142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleFunctionDeclarationSuffix4163 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ruleFunctionDeclarationSuffix4176 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleFunctionDeclarationSuffix4189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticAssertDeclaration_in_entryRuleStaticAssertDeclaration4232 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticAssertDeclaration4243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleStaticAssertDeclaration4281 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleStaticAssertDeclaration4294 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_ruleConstantExpression_in_ruleStaticAssertDeclaration4316 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleStaticAssertDeclaration4334 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_LITERAL_in_ruleStaticAssertDeclaration4349 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleStaticAssertDeclaration4367 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleStaticAssertDeclaration4380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarationSpecifier_in_entryRuleDeclarationSpecifier4421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclarationSpecifier4432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStorageClassSpecifier_in_ruleDeclarationSpecifier4479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeSpecifier_in_ruleDeclarationSpecifier4512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionSpecifier_in_ruleDeclarationSpecifier4545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleDeclarationSpecifier4569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleDeclarationSpecifier4588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleDeclarationSpecifier4607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStorageClassSpecifier_in_entryRuleStorageClassSpecifier4648 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStorageClassSpecifier4659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleStorageClassSpecifier4697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleStorageClassSpecifier4716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleStorageClassSpecifier4735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleStorageClassSpecifier4754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleStorageClassSpecifier4773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionSpecifier_in_entryRuleFunctionSpecifier4814 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionSpecifier4825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleFunctionSpecifier4863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleFunctionSpecifier4882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleFunctionSpecifier4901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeSpecifier_in_entryRuleTypeSpecifier4942 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeSpecifier4953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrailingTypeSpecifier_in_ruleTypeSpecifier5000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassSpecifier_in_ruleTypeSpecifier5033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumSpecifier_in_ruleTypeSpecifier5066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrailingTypeSpecifier_in_entryRuleTrailingTypeSpecifier5112 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrailingTypeSpecifier5123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleTypeSpecifier_in_ruleTrailingTypeSpecifier5170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypenameSpecifier_in_ruleTrailingTypeSpecifier5203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCvQualifier_in_ruleTrailingTypeSpecifier5236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleTypeSpecifier_in_entryRuleSimpleTypeSpecifier5282 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleTypeSpecifier5293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleSimpleTypeSpecifier5333 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000100L,0x0000000010000000L});
    public static final BitSet FOLLOW_ruleTypeName_in_ruleSimpleTypeSpecifier5358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNestedNameSpecifier_in_ruleSimpleTypeSpecifier5392 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleTypeName_in_ruleSimpleTypeSpecifier5420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleSimpleTypeSpecifier5445 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleSimpleTemplateId_in_ruleSimpleTypeSpecifier5467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleSimpleTypeSpecifier5496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleSimpleTypeSpecifier5515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleSimpleTypeSpecifier5534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleSimpleTypeSpecifier5553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleSimpleTypeSpecifier5572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleSimpleTypeSpecifier5591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleSimpleTypeSpecifier5610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleSimpleTypeSpecifier5629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleSimpleTypeSpecifier5648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleSimpleTypeSpecifier5667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleSimpleTypeSpecifier5686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleSimpleTypeSpecifier5705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleSimpleTypeSpecifier5724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleSimpleTypeSpecifier5743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarationTypeSpecifier_in_ruleSimpleTypeSpecifier5771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeName_in_entryRuleTypeName5817 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeName5828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleTemplateId_in_ruleTypeName5875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeName5901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarationTypeSpecifier_in_entryRuleDeclarationTypeSpecifier5947 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclarationTypeSpecifier5958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleDeclarationTypeSpecifier5996 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleDeclarationTypeSpecifier6009 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleDeclarationTypeSpecifier6031 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleDeclarationTypeSpecifier6049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumSpecifier_in_entryRuleEnumSpecifier6092 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumSpecifier6103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumHead_in_ruleEnumSpecifier6150 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleEnumSpecifier6168 = new BitSet(new long[]{0x0000080000000100L});
    public static final BitSet FOLLOW_ruleEnumeratorList_in_ruleEnumSpecifier6191 = new BitSet(new long[]{0x1000080000000000L});
    public static final BitSet FOLLOW_60_in_ruleEnumSpecifier6210 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleEnumSpecifier6227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumHead_in_entryRuleEnumHead6268 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumHead6279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumKey_in_ruleEnumHead6326 = new BitSet(new long[]{0x0000004000000102L,0x0000000000000100L,0x0000000010000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumHead6348 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_ruleNestedNameSpecifier_in_ruleEnumHead6384 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumHead6404 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_ruleEnumBase_in_ruleEnumHead6434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumKey_in_entryRuleEnumKey6482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumKey6493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleEnumKey6531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleEnumKey6551 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_ruleEnumKey6564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleEnumKey6585 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_ruleEnumKey6598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumBase_in_entryRuleEnumBase6640 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumBase6651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleEnumBase6689 = new BitSet(new long[]{0x0000000000000100L,0x000000202FFFFD00L,0x0000000012000000L});
    public static final BitSet FOLLOW_ruleTypeSpecifier_in_ruleEnumBase6712 = new BitSet(new long[]{0x0000000000000102L,0x000000202FFFFD00L,0x0000000012000000L});
    public static final BitSet FOLLOW_ruleEnumeratorList_in_entryRuleEnumeratorList6760 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumeratorList6771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationDefinition_in_ruleEnumeratorList6818 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleEnumeratorList6837 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleEnumerationDefinition_in_ruleEnumeratorList6859 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationDefinition_in_entryRuleEnumerationDefinition6907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationDefinition6918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerator_in_ruleEnumerationDefinition6965 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_ruleEnumerationDefinition6984 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_ruleConstantExpression_in_ruleEnumerationDefinition7006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerator_in_entryRuleEnumerator7054 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumerator7065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumerator7104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespaceDefinition_in_entryRuleNamespaceDefinition7149 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamespaceDefinition7160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleNamespaceDefinition7199 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_ruleNamespaceDefinition7214 = new BitSet(new long[]{0x0000040000000100L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNamespaceDefinition7230 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleNamespaceDefinition7250 = new BitSet(new long[]{0xEA000A0000000100L,0x000000287FFFFFFFL,0x000000001B800000L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleNamespaceDefinition7273 = new BitSet(new long[]{0xEA000A0000000100L,0x000000287FFFFFFFL,0x000000001B800000L});
    public static final BitSet FOLLOW_43_in_ruleNamespaceDefinition7293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespaceAliasDefinition_in_entryRuleNamespaceAliasDefinition7334 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamespaceAliasDefinition7345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleNamespaceAliasDefinition7383 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNamespaceAliasDefinition7398 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleNamespaceAliasDefinition7416 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000100L,0x0000000010000000L});
    public static final BitSet FOLLOW_ruleQualifiedNamespaceSpecifier_in_ruleNamespaceAliasDefinition7438 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleNamespaceAliasDefinition7456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNamespaceSpecifier_in_entryRuleQualifiedNamespaceSpecifier7497 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNamespaceSpecifier7508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleQualifiedNamespaceSpecifier7547 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000100L,0x0000000010000000L});
    public static final BitSet FOLLOW_ruleNestedNameSpecifier_in_ruleQualifiedNamespaceSpecifier7572 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedNamespaceSpecifier7594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsingDeclaration_in_entryRuleUsingDeclaration7640 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUsingDeclaration7651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleUsingDeclaration7689 = new BitSet(new long[]{0x0000000000000100L,0x0000000020000100L,0x0000000010000000L});
    public static final BitSet FOLLOW_72_in_ruleUsingDeclaration7703 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_93_in_ruleUsingDeclaration7724 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000100L,0x0000000010000000L});
    public static final BitSet FOLLOW_72_in_ruleUsingDeclaration7740 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000100L,0x0000000010000000L});
    public static final BitSet FOLLOW_ruleNestedNameSpecifier_in_ruleUsingDeclaration7764 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_ruleUnqualifiedId_in_ruleUsingDeclaration7793 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleUsingDeclaration7811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsmDefinition_in_entryRuleAsmDefinition7854 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAsmDefinition7865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleAsmDefinition7903 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleAsmDefinition7916 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_LITERAL_in_ruleAsmDefinition7931 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleAsmDefinition7949 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleAsmDefinition7962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkageSpecification_in_entryRuleLinkageSpecification8003 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLinkageSpecification8014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleLinkageSpecification8052 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_LITERAL_in_ruleLinkageSpecification8067 = new BitSet(new long[]{0xEA00060000000100L,0x000000287FFFFFFFL,0x000000001B800000L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleLinkageSpecification8095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleLinkageSpecification8120 = new BitSet(new long[]{0xEA000A0000000100L,0x000000287FFFFFFFL,0x000000001B800000L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleLinkageSpecification8143 = new BitSet(new long[]{0xEA000A0000000100L,0x000000287FFFFFFFL,0x000000001B800000L});
    public static final BitSet FOLLOW_43_in_ruleLinkageSpecification8163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitDeclaratorList_in_entryRuleInitDeclaratorList8206 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInitDeclaratorList8217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitDeclarator_in_ruleInitDeclaratorList8264 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleInitDeclaratorList8283 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_ruleInitDeclarator_in_ruleInitDeclaratorList8305 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_ruleInitDeclarator_in_entryRuleInitDeclarator8353 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInitDeclarator8364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaratorId_in_ruleInitDeclarator8411 = new BitSet(new long[]{0x0002240000000002L});
    public static final BitSet FOLLOW_ruleInitializer_in_ruleInitDeclarator8439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDeclarator_in_entryRuleFunctionDeclarator8487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionDeclarator8498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaratorId_in_ruleFunctionDeclarator8545 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_ruleParametersAndQualifiers_in_ruleFunctionDeclarator8572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParametersAndQualifiers_in_entryRuleParametersAndQualifiers8618 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParametersAndQualifiers8629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleParametersAndQualifiers8667 = new BitSet(new long[]{0xE000400000000100L,0x000000282FFFFDFFL,0x0000000012000000L});
    public static final BitSet FOLLOW_ruleParameterDeclarationClause_in_ruleParametersAndQualifiers8690 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleParametersAndQualifiers8710 = new BitSet(new long[]{0x0000000000000002L,0x0000000780000000L,0x0000000000300000L});
    public static final BitSet FOLLOW_95_in_ruleParametersAndQualifiers8724 = new BitSet(new long[]{0x0000000000000002L,0x0000000600000000L,0x0000000000300000L});
    public static final BitSet FOLLOW_96_in_ruleParametersAndQualifiers8743 = new BitSet(new long[]{0x0000000000000002L,0x0000000600000000L,0x0000000000300000L});
    public static final BitSet FOLLOW_97_in_ruleParametersAndQualifiers8759 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000300000L});
    public static final BitSet FOLLOW_98_in_ruleParametersAndQualifiers8778 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000300000L});
    public static final BitSet FOLLOW_ruleExceptionSpecification_in_ruleParametersAndQualifiers8803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaratorId_in_entryRuleDeclaratorId8851 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaratorId8862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_ruleDeclaratorId8901 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_ruleIdExpression_in_ruleDeclaratorId8925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeId_in_entryRuleTypeId8971 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeId8982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeSpecifier_in_ruleTypeId9029 = new BitSet(new long[]{0x0000000000000102L,0x000000202FFFFD00L,0x0000000012000000L});
    public static final BitSet FOLLOW_ruleParameterDeclarationClause_in_entryRuleParameterDeclarationClause9076 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterDeclarationClause9087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_ruleParameterDeclarationClause9125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclarationList_in_ruleParameterDeclarationClause9154 = new BitSet(new long[]{0x1000000000000002L,0x0000000800000000L});
    public static final BitSet FOLLOW_60_in_ruleParameterDeclarationClause9174 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_ruleParameterDeclarationClause9189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclarationList_in_entryRuleParameterDeclarationList9233 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterDeclarationList9244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleParameterDeclarationList9291 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleParameterDeclarationList9310 = new BitSet(new long[]{0xE000000000000100L,0x000000282FFFFDFFL,0x0000000012000000L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleParameterDeclarationList9332 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_entryRuleParameterDeclaration9380 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterDeclaration9391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarationSpecifier_in_ruleParameterDeclaration9439 = new BitSet(new long[]{0xE000000000000100L,0x000000282FFFFDFFL,0x000000001A000000L});
    public static final BitSet FOLLOW_ruleInitDeclarator_in_ruleParameterDeclaration9468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionBody_in_entryRuleFunctionBody9514 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionBody9525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCtorInitializer_in_ruleFunctionBody9574 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ruleCompoundStatement_in_ruleFunctionBody9603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionTryBlock_in_ruleFunctionBody9637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitializer_in_entryRuleInitializer9683 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInitializer9694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBraceOrEqualInitializer_in_ruleInitializer9741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleInitializer9766 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleExpressionList_in_ruleInitializer9788 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleInitializer9806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBraceOrEqualInitializer_in_entryRuleBraceOrEqualInitializer9848 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBraceOrEqualInitializer9859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleBraceOrEqualInitializer9898 = new BitSet(new long[]{0x0002040000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_ruleInitializerClause_in_ruleBraceOrEqualInitializer9920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBracedInitializerList_in_ruleBraceOrEqualInitializer9954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitializerClause_in_entryRuleInitializerClause10000 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInitializerClause10011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_ruleInitializerClause10058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBracedInitializerList_in_ruleInitializerClause10091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitializerList_in_entryRuleInitializerList10137 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInitializerList10148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitializerClause_in_ruleInitializerList10195 = new BitSet(new long[]{0x1000000000000002L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_ruleInitializerList10214 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleInitializerList10230 = new BitSet(new long[]{0x0002040000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_ruleInitializerClause_in_ruleInitializerList10252 = new BitSet(new long[]{0x1000000000000002L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_ruleInitializerList10271 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_ruleBracedInitializerList_in_entryRuleBracedInitializerList10316 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBracedInitializerList10327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleBracedInitializerList10365 = new BitSet(new long[]{0x00020C0000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_ruleInitializerList_in_ruleBracedInitializerList10388 = new BitSet(new long[]{0x1000080000000000L});
    public static final BitSet FOLLOW_60_in_ruleBracedInitializerList10407 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleBracedInitializerList10424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassSpecifier_in_entryRuleClassSpecifier10465 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassSpecifier10476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassHead_in_ruleClassSpecifier10523 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleClassSpecifier10541 = new BitSet(new long[]{0xEA000A0000000100L,0x00000E287FFFFFFFL,0x000000001A000000L});
    public static final BitSet FOLLOW_ruleMemberSpecification_in_ruleClassSpecifier10564 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleClassSpecifier10584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassHead_in_entryRuleClassHead10625 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassHead10636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassKey_in_ruleClassHead10683 = new BitSet(new long[]{0x0000004000000102L,0x0000000000000100L,0x0000000010000000L});
    public static final BitSet FOLLOW_ruleNestedNameSpecifier_in_ruleClassHead10712 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleTypeName_in_ruleClassHead10741 = new BitSet(new long[]{0x0000004000000002L,0x0000001000000080L});
    public static final BitSet FOLLOW_ruleClassVirtualSpecifier_in_ruleClassHead10769 = new BitSet(new long[]{0x0000004000000002L,0x0000001000000080L});
    public static final BitSet FOLLOW_ruleBaseClause_in_ruleClassHead10801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassVirtualSpecifier_in_entryRuleClassVirtualSpecifier10849 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassVirtualSpecifier10860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_ruleClassVirtualSpecifier10898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleClassVirtualSpecifier10917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassKey_in_entryRuleClassKey10958 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassKey10969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleClassKey11007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleClassKey11026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_ruleClassKey11045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMemberSpecification_in_entryRuleMemberSpecification11086 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMemberSpecification11097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMemberDeclaration_in_ruleMemberSpecification11145 = new BitSet(new long[]{0xEA00020000000102L,0x00000E287FFFFFFFL,0x000000001A000000L});
    public static final BitSet FOLLOW_ruleAccessSpecifier_in_ruleMemberSpecification11179 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleMemberSpecification11197 = new BitSet(new long[]{0xEA00020000000102L,0x00000E287FFFFFFFL,0x000000001A000000L});
    public static final BitSet FOLLOW_ruleMemberSpecification_in_ruleMemberSpecification11222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMemberDeclaration_in_entryRuleMemberDeclaration11270 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMemberDeclaration11281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMemberOrFunctionDeclaration_in_ruleMemberDeclaration11328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsingDeclaration_in_ruleMemberDeclaration11361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticAssertDeclaration_in_ruleMemberDeclaration11394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateDeclaration_in_ruleMemberDeclaration11427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAliasDeclaration_in_ruleMemberDeclaration11460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMemberOrFunctionDeclaration_in_entryRuleMemberOrFunctionDeclaration11506 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMemberOrFunctionDeclaration11517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarationSpecifier_in_ruleMemberOrFunctionDeclaration11565 = new BitSet(new long[]{0xE000020000000100L,0x000000282FFFFDFFL,0x000000001A000000L});
    public static final BitSet FOLLOW_ruleFunctionDeclarationSuffix_in_ruleMemberOrFunctionDeclaration11595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMemberDeclarationSuffix_in_ruleMemberOrFunctionDeclaration11629 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleMemberOrFunctionDeclaration11647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMemberDeclarationSuffix_in_entryRuleMemberDeclarationSuffix11690 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMemberDeclarationSuffix11701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMemberDeclaratorList_in_ruleMemberDeclarationSuffix11748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMemberDeclaratorList_in_entryRuleMemberDeclaratorList11795 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMemberDeclaratorList11806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMemberDeclarator_in_ruleMemberDeclaratorList11853 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleMemberDeclaratorList11872 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_ruleMemberDeclarator_in_ruleMemberDeclaratorList11894 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_ruleMemberDeclarator_in_entryRuleMemberDeclarator11942 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMemberDeclarator11953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaratorId_in_ruleMemberDeclarator12000 = new BitSet(new long[]{0x0002040000000002L,0x000000D000000000L});
    public static final BitSet FOLLOW_ruleVirtualSpecifier_in_ruleMemberDeclarator12028 = new BitSet(new long[]{0x0002040000000002L,0x000000D000000000L});
    public static final BitSet FOLLOW_rulePureSpecifier_in_ruleMemberDeclarator12059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBraceOrEqualInitializer_in_ruleMemberDeclarator12094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVirtualSpecifier_in_entryRuleVirtualSpecifier12141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVirtualSpecifier12152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_ruleVirtualSpecifier12190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_ruleVirtualSpecifier12209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_ruleVirtualSpecifier12228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePureSpecifier_in_entryRulePureSpecifier12269 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePureSpecifier12280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rulePureSpecifier12318 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_104_in_rulePureSpecifier12331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseClause_in_entryRuleBaseClause12372 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBaseClause12383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleBaseClause12421 = new BitSet(new long[]{0xEA00020000000100L,0x00000E287FFFFFFFL,0x000000001A000000L});
    public static final BitSet FOLLOW_ruleBaseSpecifierList_in_ruleBaseClause12443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseSpecifierList_in_entryRuleBaseSpecifierList12489 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBaseSpecifierList12500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseSpecifier_in_ruleBaseSpecifierList12547 = new BitSet(new long[]{0x1000000000000002L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_ruleBaseSpecifierList12566 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleBaseSpecifierList12582 = new BitSet(new long[]{0xEA00020000000100L,0x00000E287FFFFFFFL,0x000000001A000000L});
    public static final BitSet FOLLOW_ruleBaseSpecifier_in_ruleBaseSpecifierList12604 = new BitSet(new long[]{0x1000000000000002L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_ruleBaseSpecifierList12623 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_ruleBaseSpecifier_in_entryRuleBaseSpecifier12668 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBaseSpecifier12679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleBaseSpecifier12719 = new BitSet(new long[]{0xEA00020000000100L,0x00000E287FFFFFFFL,0x000000001A000000L});
    public static final BitSet FOLLOW_ruleAccessSpecifier_in_ruleBaseSpecifier12742 = new BitSet(new long[]{0xEA00020000000100L,0x00000E287FFFFFFFL,0x000000001A000000L});
    public static final BitSet FOLLOW_ruleAccessSpecifier_in_ruleBaseSpecifier12779 = new BitSet(new long[]{0xEA00020000000100L,0x00000E287FFFFFFFL,0x000000001A000000L});
    public static final BitSet FOLLOW_70_in_ruleBaseSpecifier12798 = new BitSet(new long[]{0xEA00020000000100L,0x00000E287FFFFFFFL,0x000000001A000000L});
    public static final BitSet FOLLOW_ruleClassOrDeclarationType_in_ruleBaseSpecifier12825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassOrDeclarationType_in_entryRuleClassOrDeclarationType12871 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassOrDeclarationType12882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleClassOrDeclarationType12922 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000100L,0x0000000010000000L});
    public static final BitSet FOLLOW_ruleNestedNameSpecifier_in_ruleClassOrDeclarationType12947 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleTypeName_in_ruleClassOrDeclarationType12976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarationTypeSpecifier_in_ruleClassOrDeclarationType13010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAccessSpecifier_in_entryRuleAccessSpecifier13056 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAccessSpecifier13067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_ruleAccessSpecifier13105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_ruleAccessSpecifier13124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_ruleAccessSpecifier13143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperatorFunctionId_in_entryRuleOperatorFunctionId13184 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperatorFunctionId13195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_ruleOperatorFunctionId13233 = new BitSet(new long[]{0x1402000000000000L,0xFFFE608600000000L,0x000000000001FFFFL});
    public static final BitSet FOLLOW_ruleOverloadableOperator_in_ruleOperatorFunctionId13255 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_ruleOperatorFunctionId13274 = new BitSet(new long[]{0x0000000000000100L,0x000040282FFFFD00L,0x000000001E000000L});
    public static final BitSet FOLLOW_ruleConstantExpression_in_ruleOperatorFunctionId13297 = new BitSet(new long[]{0x0000000000000100L,0x000040282FFFFD00L,0x000000001E000000L});
    public static final BitSet FOLLOW_ruleTypeSpecifier_in_ruleOperatorFunctionId13330 = new BitSet(new long[]{0x0000000000000100L,0x000040282FFFFD00L,0x000000001E000000L});
    public static final BitSet FOLLOW_ruleIdExpression_in_ruleOperatorFunctionId13363 = new BitSet(new long[]{0x0000000000000100L,0x000040282FFFFD00L,0x000000001E000000L});
    public static final BitSet FOLLOW_110_in_ruleOperatorFunctionId13383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOverloadableOperator_in_entryRuleOverloadableOperator13426 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOverloadableOperator13437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_ruleOverloadableOperator13475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleOverloadableOperator13494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_ruleOverloadableOperator13514 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_ruleOverloadableOperator13527 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_ruleOverloadableOperator13540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleOverloadableOperator13561 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_ruleOverloadableOperator13574 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_ruleOverloadableOperator13587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_ruleOverloadableOperator13607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_ruleOverloadableOperator13626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_ruleOverloadableOperator13645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_ruleOverloadableOperator13664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_ruleOverloadableOperator13683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_118_in_ruleOverloadableOperator13702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleOverloadableOperator13721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_ruleOverloadableOperator13740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_ruleOverloadableOperator13759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_ruleOverloadableOperator13778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleOverloadableOperator13797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_ruleOverloadableOperator13816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_ruleOverloadableOperator13835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_ruleOverloadableOperator13854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_ruleOverloadableOperator13873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_ruleOverloadableOperator13892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_ruleOverloadableOperator13911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_ruleOverloadableOperator13930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_ruleOverloadableOperator13949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_ruleOverloadableOperator13968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_ruleOverloadableOperator13987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_ruleOverloadableOperator14006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_ruleOverloadableOperator14025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_ruleOverloadableOperator14044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_ruleOverloadableOperator14063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_ruleOverloadableOperator14082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_135_in_ruleOverloadableOperator14101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_136_in_ruleOverloadableOperator14120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_ruleOverloadableOperator14139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_ruleOverloadableOperator14158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_138_in_ruleOverloadableOperator14177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_139_in_ruleOverloadableOperator14196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_140_in_ruleOverloadableOperator14215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleOverloadableOperator14234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_141_in_ruleOverloadableOperator14253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_142_in_ruleOverloadableOperator14272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_143_in_ruleOverloadableOperator14291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_144_in_ruleOverloadableOperator14310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralOperatorId_in_entryRuleLiteralOperatorId14351 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralOperatorId14362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_ruleLiteralOperatorId14400 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_145_in_ruleLiteralOperatorId14413 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_145_in_ruleLiteralOperatorId14426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateDeclaration_in_entryRuleTemplateDeclaration14467 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateDeclaration14478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleTemplateDeclaration14516 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_ruleTemplateDeclaration14529 = new BitSet(new long[]{0xE000000000000100L,0x000000282FFFFDFFL,0x0000000012000000L});
    public static final BitSet FOLLOW_ruleTemplateParameterList_in_ruleTemplateDeclaration14551 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_ruleTemplateDeclaration14569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateParameterList_in_entryRuleTemplateParameterList14610 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateParameterList14621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateParameter_in_ruleTemplateParameterList14668 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleTemplateParameterList14687 = new BitSet(new long[]{0xE000000000000100L,0x000000282FFFFDFFL,0x0000000012000000L});
    public static final BitSet FOLLOW_ruleTemplateParameter_in_ruleTemplateParameterList14709 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateParameter_in_entryRuleTemplateParameter14757 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateParameter14768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeParameter_in_ruleTemplateParameter14815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleTemplateParameter14848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeParameter_in_entryRuleTypeParameter14894 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeParameter14905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleTypeParameter14944 = new BitSet(new long[]{0x0002000000000102L,0x0000000800000000L});
    public static final BitSet FOLLOW_93_in_ruleTypeParameter14963 = new BitSet(new long[]{0x0002000000000102L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_ruleTypeParameter14980 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeParameter14998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeParameter15029 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleTypeParameter15049 = new BitSet(new long[]{0x0000000000000100L,0x000000202FFFFD00L,0x0000000012000000L});
    public static final BitSet FOLLOW_ruleTypeId_in_ruleTypeParameter15071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleTemplateId_in_entryRuleSimpleTemplateId15119 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleTemplateId15130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSimpleTemplateId15170 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_ruleSimpleTemplateId15188 = new BitSet(new long[]{0x0000000000000100L,0x000000282FFFFD00L,0x000000001E000000L});
    public static final BitSet FOLLOW_ruleTemplateArgumentList_in_ruleSimpleTemplateId15210 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_ruleSimpleTemplateId15228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateArgumentList_in_entryRuleTemplateArgumentList15271 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateArgumentList15282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateArgument_in_ruleTemplateArgumentList15329 = new BitSet(new long[]{0x1000000000000002L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_ruleTemplateArgumentList15348 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleTemplateArgumentList15364 = new BitSet(new long[]{0x0000000000000100L,0x000000282FFFFD00L,0x000000001E000000L});
    public static final BitSet FOLLOW_ruleTemplateArgument_in_ruleTemplateArgumentList15386 = new BitSet(new long[]{0x1000000000000002L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_ruleTemplateArgumentList15405 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateArgument_in_entryRuleTemplateArgument15450 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateArgument15461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantExpression_in_ruleTemplateArgument15508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeId_in_ruleTemplateArgument15541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdExpression_in_ruleTemplateArgument15574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypenameSpecifier_in_entryRuleTypenameSpecifier15620 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypenameSpecifier15631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleTypenameSpecifier15669 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000100L,0x0000000010000000L});
    public static final BitSet FOLLOW_72_in_ruleTypenameSpecifier15683 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000100L,0x0000000010000000L});
    public static final BitSet FOLLOW_ruleNestedNameSpecifier_in_ruleTypenameSpecifier15707 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypenameSpecifier15728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleTypenameSpecifier15754 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypenameSpecifier15771 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_ruleTypenameSpecifier15789 = new BitSet(new long[]{0x0000000000000100L,0x000000282FFFFD00L,0x000000001E000000L});
    public static final BitSet FOLLOW_ruleTemplateArgumentList_in_ruleTypenameSpecifier15811 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_ruleTypenameSpecifier15829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTryBlock_in_entryRuleTryBlock15872 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTryBlock15883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_146_in_ruleTryBlock15921 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ruleCompoundStatement_in_ruleTryBlock15943 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_ruleHandler_in_ruleTryBlock15971 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_ruleFunctionTryBlock_in_entryRuleFunctionTryBlock16019 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionTryBlock16030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_146_in_ruleFunctionTryBlock16068 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_ruleCtorInitializer_in_ruleFunctionTryBlock16091 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ruleCompoundStatement_in_ruleFunctionTryBlock16120 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_ruleHandler_in_ruleFunctionTryBlock16148 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_ruleHandler_in_entryRuleHandler16196 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHandler16207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_147_in_ruleHandler16245 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleHandler16258 = new BitSet(new long[]{0x0000000000000100L,0x000000282FFFFD00L,0x0000000012000000L});
    public static final BitSet FOLLOW_ruleExceptionDeclaration_in_ruleHandler16280 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleHandler16298 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ruleCompoundStatement_in_ruleHandler16320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExceptionDeclaration_in_entryRuleExceptionDeclaration16366 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExceptionDeclaration16377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeSpecifier_in_ruleExceptionDeclaration16426 = new BitSet(new long[]{0x0000000000000102L,0x000000282FFFFD00L,0x000000001A000000L});
    public static final BitSet FOLLOW_ruleDeclaratorId_in_ruleExceptionDeclaration16456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_ruleExceptionDeclaration16483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExceptionSpecification_in_entryRuleExceptionSpecification16526 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExceptionSpecification16537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDynamicExceptionSpecification_in_ruleExceptionSpecification16584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoexceptSpecification_in_ruleExceptionSpecification16617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDynamicExceptionSpecification_in_entryRuleDynamicExceptionSpecification16663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDynamicExceptionSpecification16674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_148_in_ruleDynamicExceptionSpecification16712 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleDynamicExceptionSpecification16725 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_ruleTypeIdList_in_ruleDynamicExceptionSpecification16747 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleDynamicExceptionSpecification16765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoexceptSpecification_in_entryRuleNoexceptSpecification16806 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoexceptSpecification16817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_149_in_ruleNoexceptSpecification16855 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_ruleNoexceptSpecification16869 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_ruleConstantExpression_in_ruleNoexceptSpecification16891 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleNoexceptSpecification16909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression16952 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression16963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_150_in_ruleExpression17000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionList_in_entryRuleExpressionList17040 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionList17051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionList17098 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleExpressionList17117 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionList17139 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_ruleExplicitSpecialization_in_entryRuleExplicitSpecialization17187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExplicitSpecialization17198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_151_in_ruleExplicitSpecialization17235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExplicitInstantiation_in_entryRuleExplicitInstantiation17275 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExplicitInstantiation17286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_152_in_ruleExplicitInstantiation17323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCvQualifier_in_entryRuleCvQualifier17363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCvQualifier17374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_153_in_ruleCvQualifier17411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantExpression_in_entryRuleConstantExpression17451 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantExpression17462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_154_in_ruleConstantExpression17499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdExpression_in_entryRuleIdExpression17539 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdExpression17550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_155_in_ruleIdExpression17587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNestedNameSpecifier_in_entryRuleNestedNameSpecifier17627 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNestedNameSpecifier17638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_156_in_ruleNestedNameSpecifier17675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression17715 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignmentExpression17726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_157_in_ruleAssignmentExpression17763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCtorInitializer_in_entryRuleCtorInitializer17803 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCtorInitializer17814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_158_in_ruleCtorInitializer17851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeIdList_in_entryRuleTypeIdList17891 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeIdList17902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_159_in_ruleTypeIdList17939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnqualifiedId_in_entryRuleUnqualifiedId17979 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnqualifiedId17990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_160_in_ruleUnqualifiedId18027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_synpred1_InternalCpp21416 = new BitSet(new long[]{0x0000000000000002L});

}