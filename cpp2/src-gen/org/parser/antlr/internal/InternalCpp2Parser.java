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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_KEYWORD", "RULE_PREPROCESSING_OP_OR_PUNC", "RULE_ID", "RULE_INT", "RULE_CHARACTER_LITERAL", "RULE_FLOATING_LITERAL", "RULE_STRING_LITERAL", "RULE_HEXADECIMAL_DIGIT", "RULE_HEX_QUAD", "RULE_UNIVERSAL_CHARACTER_NAME", "RULE_NONDIGIT", "RULE_DIGIT", "RULE_DECIMAL_LITERAL", "RULE_OCTAL_LITERAL", "RULE_HEXADECIMAL_LITERAL", "RULE_INTEGER_SUFFIX", "RULE_OCTAL_DIGIT", "RULE_C_CHAR", "RULE_ESCAPE_SEQUENCE", "RULE_SIMPLE_ESCAPE_SEQUENCE", "RULE_OCTAL_ESCAPE_SEQUENCE", "RULE_HEXADECIMAL_ESCAPE_SEQUENCE", "RULE_FRACTIONAL_CONSTANT", "RULE_EXPONENT_PART", "RULE_ENC_PREFIX", "RULE_SCHAR", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'nullptr'", "'::'", "'['", "']'", "'...'", "','", "'('", "')'", "'const'", "'volatile'", "'&'", "'&&'", "'='", "'default'", "';'", "'delete'", "'operator'", "'<'", "'>'", "'new'", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'|'", "'~'", "'!'", "'+='", "'-='", "'*='", "'/='", "'%='", "'^='", "'&='", "'|='", "'<<'", "'>>'", "'>>='", "'<<='", "'=='", "'!='", "'<='", "'>='", "'||'", "'++'", "'--'", "'->*'", "'->'", "'()'", "'[]'", "'\"'", "'template'", "'class'", "'typename'", "'try'", "'catch'", "'throw'", "'noexcept'", "'ConstantExpression'", "'IdExpression'", "'DeclarationSpecifier'", "'Declaration'", "'NestedNameSpecifier'", "'AssignmentExpression'", "'TypeSpecifier'", "'CompoundStatement'", "'CtorInitializer'", "'TypeIdList'", "'UnqualifiedId'", "'ClassName'", "'Initializer'"
    };
    public static final int RULE_ID=6;
    public static final int RULE_FLOATING_LITERAL=9;
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
    public static final int RULE_CHARACTER_LITERAL=8;
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
    public static final int RULE_STRING_LITERAL=10;
    public static final int RULE_FRACTIONAL_CONSTANT=26;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__59=59;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int RULE_INT=7;
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
    public static final int RULE_PREPROCESSING_OP_OR_PUNC=5;
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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:76:1: ruleTest returns [EObject current=null] : ( (lv_elements_0_0= ruleFunctionDefinition ) ) ;
    public final EObject ruleTest() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_elements_0_0 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:79:28: ( ( (lv_elements_0_0= ruleFunctionDefinition ) ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:80:1: ( (lv_elements_0_0= ruleFunctionDefinition ) )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:80:1: ( (lv_elements_0_0= ruleFunctionDefinition ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:81:1: (lv_elements_0_0= ruleFunctionDefinition )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:81:1: (lv_elements_0_0= ruleFunctionDefinition )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:82:3: lv_elements_0_0= ruleFunctionDefinition
            {
             
            	        newCompositeNode(grammarAccess.getTestAccess().getElementsFunctionDefinitionParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleFunctionDefinition_in_ruleTest130);
            lv_elements_0_0=ruleFunctionDefinition();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTestRule());
            	        }
                   		add(
                   			current, 
                   			"elements",
                    		lv_elements_0_0, 
                    		"FunctionDefinition");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleTest"


    // $ANTLR start "entryRuleToken"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:106:1: entryRuleToken returns [String current=null] : iv_ruleToken= ruleToken EOF ;
    public final String entryRuleToken() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleToken = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:107:2: (iv_ruleToken= ruleToken EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:108:2: iv_ruleToken= ruleToken EOF
            {
             newCompositeNode(grammarAccess.getTokenRule()); 
            pushFollow(FOLLOW_ruleToken_in_entryRuleToken166);
            iv_ruleToken=ruleToken();

            state._fsp--;

             current =iv_ruleToken.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleToken177); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleToken"


    // $ANTLR start "ruleToken"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:115:1: ruleToken returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_KEYWORD_0= RULE_KEYWORD | this_Literal_1= ruleLiteral | (this_PREPROCESSING_OP_OR_PUNC_2= RULE_PREPROCESSING_OP_OR_PUNC this_ID_3= RULE_ID ) ) ;
    public final AntlrDatatypeRuleToken ruleToken() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_KEYWORD_0=null;
        Token this_PREPROCESSING_OP_OR_PUNC_2=null;
        Token this_ID_3=null;
        AntlrDatatypeRuleToken this_Literal_1 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:118:28: ( (this_KEYWORD_0= RULE_KEYWORD | this_Literal_1= ruleLiteral | (this_PREPROCESSING_OP_OR_PUNC_2= RULE_PREPROCESSING_OP_OR_PUNC this_ID_3= RULE_ID ) ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:119:1: (this_KEYWORD_0= RULE_KEYWORD | this_Literal_1= ruleLiteral | (this_PREPROCESSING_OP_OR_PUNC_2= RULE_PREPROCESSING_OP_OR_PUNC this_ID_3= RULE_ID ) )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:119:1: (this_KEYWORD_0= RULE_KEYWORD | this_Literal_1= ruleLiteral | (this_PREPROCESSING_OP_OR_PUNC_2= RULE_PREPROCESSING_OP_OR_PUNC this_ID_3= RULE_ID ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case RULE_KEYWORD:
                {
                alt1=1;
                }
                break;
            case RULE_INT:
            case RULE_CHARACTER_LITERAL:
            case RULE_FLOATING_LITERAL:
            case RULE_STRING_LITERAL:
            case 35:
            case 36:
                {
                alt1=2;
                }
                break;
            case RULE_PREPROCESSING_OP_OR_PUNC:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:119:6: this_KEYWORD_0= RULE_KEYWORD
                    {
                    this_KEYWORD_0=(Token)match(input,RULE_KEYWORD,FOLLOW_RULE_KEYWORD_in_ruleToken217); 

                    		current.merge(this_KEYWORD_0);
                        
                     
                        newLeafNode(this_KEYWORD_0, grammarAccess.getTokenAccess().getKEYWORDTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:128:5: this_Literal_1= ruleLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getTokenAccess().getLiteralParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleLiteral_in_ruleToken250);
                    this_Literal_1=ruleLiteral();

                    state._fsp--;


                    		current.merge(this_Literal_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:139:6: (this_PREPROCESSING_OP_OR_PUNC_2= RULE_PREPROCESSING_OP_OR_PUNC this_ID_3= RULE_ID )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:139:6: (this_PREPROCESSING_OP_OR_PUNC_2= RULE_PREPROCESSING_OP_OR_PUNC this_ID_3= RULE_ID )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:139:11: this_PREPROCESSING_OP_OR_PUNC_2= RULE_PREPROCESSING_OP_OR_PUNC this_ID_3= RULE_ID
                    {
                    this_PREPROCESSING_OP_OR_PUNC_2=(Token)match(input,RULE_PREPROCESSING_OP_OR_PUNC,FOLLOW_RULE_PREPROCESSING_OP_OR_PUNC_in_ruleToken277); 

                    		current.merge(this_PREPROCESSING_OP_OR_PUNC_2);
                        
                     
                        newLeafNode(this_PREPROCESSING_OP_OR_PUNC_2, grammarAccess.getTokenAccess().getPREPROCESSING_OP_OR_PUNCTerminalRuleCall_2_0()); 
                        
                    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleToken297); 

                    		current.merge(this_ID_3);
                        
                     
                        newLeafNode(this_ID_3, grammarAccess.getTokenAccess().getIDTerminalRuleCall_2_1()); 
                        

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
    // $ANTLR end "ruleToken"


    // $ANTLR start "entryRuleLiteral"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:161:1: entryRuleLiteral returns [String current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final String entryRuleLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteral = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:162:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:163:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral344);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral355); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:170:1: ruleLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_CHARACTER_LITERAL_1= RULE_CHARACTER_LITERAL | this_FLOATING_LITERAL_2= RULE_FLOATING_LITERAL | this_STRING_LITERAL_3= RULE_STRING_LITERAL | ( (kw= 'true' | kw= 'false' ) kw= 'nullptr' ) ) ;
    public final AntlrDatatypeRuleToken ruleLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_CHARACTER_LITERAL_1=null;
        Token this_FLOATING_LITERAL_2=null;
        Token this_STRING_LITERAL_3=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:173:28: ( (this_INT_0= RULE_INT | this_CHARACTER_LITERAL_1= RULE_CHARACTER_LITERAL | this_FLOATING_LITERAL_2= RULE_FLOATING_LITERAL | this_STRING_LITERAL_3= RULE_STRING_LITERAL | ( (kw= 'true' | kw= 'false' ) kw= 'nullptr' ) ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:174:1: (this_INT_0= RULE_INT | this_CHARACTER_LITERAL_1= RULE_CHARACTER_LITERAL | this_FLOATING_LITERAL_2= RULE_FLOATING_LITERAL | this_STRING_LITERAL_3= RULE_STRING_LITERAL | ( (kw= 'true' | kw= 'false' ) kw= 'nullptr' ) )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:174:1: (this_INT_0= RULE_INT | this_CHARACTER_LITERAL_1= RULE_CHARACTER_LITERAL | this_FLOATING_LITERAL_2= RULE_FLOATING_LITERAL | this_STRING_LITERAL_3= RULE_STRING_LITERAL | ( (kw= 'true' | kw= 'false' ) kw= 'nullptr' ) )
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
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:174:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLiteral395); 

                    		current.merge(this_INT_0);
                        
                     
                        newLeafNode(this_INT_0, grammarAccess.getLiteralAccess().getINTTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:182:10: this_CHARACTER_LITERAL_1= RULE_CHARACTER_LITERAL
                    {
                    this_CHARACTER_LITERAL_1=(Token)match(input,RULE_CHARACTER_LITERAL,FOLLOW_RULE_CHARACTER_LITERAL_in_ruleLiteral421); 

                    		current.merge(this_CHARACTER_LITERAL_1);
                        
                     
                        newLeafNode(this_CHARACTER_LITERAL_1, grammarAccess.getLiteralAccess().getCHARACTER_LITERALTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:190:10: this_FLOATING_LITERAL_2= RULE_FLOATING_LITERAL
                    {
                    this_FLOATING_LITERAL_2=(Token)match(input,RULE_FLOATING_LITERAL,FOLLOW_RULE_FLOATING_LITERAL_in_ruleLiteral447); 

                    		current.merge(this_FLOATING_LITERAL_2);
                        
                     
                        newLeafNode(this_FLOATING_LITERAL_2, grammarAccess.getLiteralAccess().getFLOATING_LITERALTerminalRuleCall_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:198:10: this_STRING_LITERAL_3= RULE_STRING_LITERAL
                    {
                    this_STRING_LITERAL_3=(Token)match(input,RULE_STRING_LITERAL,FOLLOW_RULE_STRING_LITERAL_in_ruleLiteral473); 

                    		current.merge(this_STRING_LITERAL_3);
                        
                     
                        newLeafNode(this_STRING_LITERAL_3, grammarAccess.getLiteralAccess().getSTRING_LITERALTerminalRuleCall_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:206:6: ( (kw= 'true' | kw= 'false' ) kw= 'nullptr' )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:206:6: ( (kw= 'true' | kw= 'false' ) kw= 'nullptr' )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:206:7: (kw= 'true' | kw= 'false' ) kw= 'nullptr'
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:206:7: (kw= 'true' | kw= 'false' )
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
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:207:2: kw= 'true'
                            {
                            kw=(Token)match(input,35,FOLLOW_35_in_ruleLiteral499); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getLiteralAccess().getTrueKeyword_4_0_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:214:2: kw= 'false'
                            {
                            kw=(Token)match(input,36,FOLLOW_36_in_ruleLiteral518); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getLiteralAccess().getFalseKeyword_4_0_1()); 
                                

                            }
                            break;

                    }

                    kw=(Token)match(input,37,FOLLOW_37_in_ruleLiteral532); 

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


    // $ANTLR start "entryRuleNamespaceBody"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:235:1: entryRuleNamespaceBody returns [String current=null] : iv_ruleNamespaceBody= ruleNamespaceBody EOF ;
    public final String entryRuleNamespaceBody() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNamespaceBody = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:236:2: (iv_ruleNamespaceBody= ruleNamespaceBody EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:237:2: iv_ruleNamespaceBody= ruleNamespaceBody EOF
            {
             newCompositeNode(grammarAccess.getNamespaceBodyRule()); 
            pushFollow(FOLLOW_ruleNamespaceBody_in_entryRuleNamespaceBody576);
            iv_ruleNamespaceBody=ruleNamespaceBody();

            state._fsp--;

             current =iv_ruleNamespaceBody.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamespaceBody587); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNamespaceBody"


    // $ANTLR start "ruleNamespaceBody"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:244:1: ruleNamespaceBody returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Declaration_0= ruleDeclaration )* ;
    public final AntlrDatatypeRuleToken ruleNamespaceBody() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Declaration_0 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:247:28: ( (this_Declaration_0= ruleDeclaration )* )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:248:1: (this_Declaration_0= ruleDeclaration )*
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:248:1: (this_Declaration_0= ruleDeclaration )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==100) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:249:5: this_Declaration_0= ruleDeclaration
            	    {
            	     
            	            newCompositeNode(grammarAccess.getNamespaceBodyAccess().getDeclarationParserRuleCall()); 
            	        
            	    pushFollow(FOLLOW_ruleDeclaration_in_ruleNamespaceBody634);
            	    this_Declaration_0=ruleDeclaration();

            	    state._fsp--;


            	    		current.merge(this_Declaration_0);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop4;
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
    // $ANTLR end "ruleNamespaceBody"


    // $ANTLR start "entryRuleQualifiedNamespaceSpecifier"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:269:1: entryRuleQualifiedNamespaceSpecifier returns [String current=null] : iv_ruleQualifiedNamespaceSpecifier= ruleQualifiedNamespaceSpecifier EOF ;
    public final String entryRuleQualifiedNamespaceSpecifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNamespaceSpecifier = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:270:2: (iv_ruleQualifiedNamespaceSpecifier= ruleQualifiedNamespaceSpecifier EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:271:2: iv_ruleQualifiedNamespaceSpecifier= ruleQualifiedNamespaceSpecifier EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNamespaceSpecifierRule()); 
            pushFollow(FOLLOW_ruleQualifiedNamespaceSpecifier_in_entryRuleQualifiedNamespaceSpecifier683);
            iv_ruleQualifiedNamespaceSpecifier=ruleQualifiedNamespaceSpecifier();

            state._fsp--;

             current =iv_ruleQualifiedNamespaceSpecifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNamespaceSpecifier694); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:278:1: ruleQualifiedNamespaceSpecifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '::' )? (this_NestedNameSpecifier_1= ruleNestedNameSpecifier )? this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNamespaceSpecifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;
        AntlrDatatypeRuleToken this_NestedNameSpecifier_1 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:281:28: ( ( (kw= '::' )? (this_NestedNameSpecifier_1= ruleNestedNameSpecifier )? this_ID_2= RULE_ID ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:282:1: ( (kw= '::' )? (this_NestedNameSpecifier_1= ruleNestedNameSpecifier )? this_ID_2= RULE_ID )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:282:1: ( (kw= '::' )? (this_NestedNameSpecifier_1= ruleNestedNameSpecifier )? this_ID_2= RULE_ID )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:282:2: (kw= '::' )? (this_NestedNameSpecifier_1= ruleNestedNameSpecifier )? this_ID_2= RULE_ID
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:282:2: (kw= '::' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==38) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:283:2: kw= '::'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleQualifiedNamespaceSpecifier733); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQualifiedNamespaceSpecifierAccess().getColonColonKeyword_0()); 
                        

                    }
                    break;

            }

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:288:3: (this_NestedNameSpecifier_1= ruleNestedNameSpecifier )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==101) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:289:5: this_NestedNameSpecifier_1= ruleNestedNameSpecifier
                    {
                     
                            newCompositeNode(grammarAccess.getQualifiedNamespaceSpecifierAccess().getNestedNameSpecifierParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNestedNameSpecifier_in_ruleQualifiedNamespaceSpecifier758);
                    this_NestedNameSpecifier_1=ruleNestedNameSpecifier();

                    state._fsp--;


                    		current.merge(this_NestedNameSpecifier_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedNamespaceSpecifier780); 

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


    // $ANTLR start "entryRuleAttributeSpecifier"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:322:1: entryRuleAttributeSpecifier returns [String current=null] : iv_ruleAttributeSpecifier= ruleAttributeSpecifier EOF ;
    public final String entryRuleAttributeSpecifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAttributeSpecifier = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:323:2: (iv_ruleAttributeSpecifier= ruleAttributeSpecifier EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:324:2: iv_ruleAttributeSpecifier= ruleAttributeSpecifier EOF
            {
             newCompositeNode(grammarAccess.getAttributeSpecifierRule()); 
            pushFollow(FOLLOW_ruleAttributeSpecifier_in_entryRuleAttributeSpecifier834);
            iv_ruleAttributeSpecifier=ruleAttributeSpecifier();

            state._fsp--;

             current =iv_ruleAttributeSpecifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeSpecifier845); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttributeSpecifier"


    // $ANTLR start "ruleAttributeSpecifier"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:331:1: ruleAttributeSpecifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '[' kw= '[' this_AttributeList_2= ruleAttributeList kw= ']' kw= ']' ) ;
    public final AntlrDatatypeRuleToken ruleAttributeSpecifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_AttributeList_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:334:28: ( (kw= '[' kw= '[' this_AttributeList_2= ruleAttributeList kw= ']' kw= ']' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:335:1: (kw= '[' kw= '[' this_AttributeList_2= ruleAttributeList kw= ']' kw= ']' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:335:1: (kw= '[' kw= '[' this_AttributeList_2= ruleAttributeList kw= ']' kw= ']' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:336:2: kw= '[' kw= '[' this_AttributeList_2= ruleAttributeList kw= ']' kw= ']'
            {
            kw=(Token)match(input,39,FOLLOW_39_in_ruleAttributeSpecifier883); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getAttributeSpecifierAccess().getLeftSquareBracketKeyword_0()); 
                
            kw=(Token)match(input,39,FOLLOW_39_in_ruleAttributeSpecifier896); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getAttributeSpecifierAccess().getLeftSquareBracketKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getAttributeSpecifierAccess().getAttributeListParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleAttributeList_in_ruleAttributeSpecifier918);
            this_AttributeList_2=ruleAttributeList();

            state._fsp--;


            		current.merge(this_AttributeList_2);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,40,FOLLOW_40_in_ruleAttributeSpecifier936); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getAttributeSpecifierAccess().getRightSquareBracketKeyword_3()); 
                
            kw=(Token)match(input,40,FOLLOW_40_in_ruleAttributeSpecifier949); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getAttributeSpecifierAccess().getRightSquareBracketKeyword_4()); 
                

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
    // $ANTLR end "ruleAttributeSpecifier"


    // $ANTLR start "entryRuleAttributeList"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:378:1: entryRuleAttributeList returns [String current=null] : iv_ruleAttributeList= ruleAttributeList EOF ;
    public final String entryRuleAttributeList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAttributeList = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:379:2: (iv_ruleAttributeList= ruleAttributeList EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:380:2: iv_ruleAttributeList= ruleAttributeList EOF
            {
             newCompositeNode(grammarAccess.getAttributeListRule()); 
            pushFollow(FOLLOW_ruleAttributeList_in_entryRuleAttributeList990);
            iv_ruleAttributeList=ruleAttributeList();

            state._fsp--;

             current =iv_ruleAttributeList.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeList1001); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttributeList"


    // $ANTLR start "ruleAttributeList"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:387:1: ruleAttributeList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_Attribute_0= ruleAttribute (kw= '...' )? ) (kw= ',' (this_Attribute_3= ruleAttribute (kw= '...' )? )? )* ) ;
    public final AntlrDatatypeRuleToken ruleAttributeList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Attribute_0 = null;

        AntlrDatatypeRuleToken this_Attribute_3 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:390:28: ( ( (this_Attribute_0= ruleAttribute (kw= '...' )? ) (kw= ',' (this_Attribute_3= ruleAttribute (kw= '...' )? )? )* ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:391:1: ( (this_Attribute_0= ruleAttribute (kw= '...' )? ) (kw= ',' (this_Attribute_3= ruleAttribute (kw= '...' )? )? )* )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:391:1: ( (this_Attribute_0= ruleAttribute (kw= '...' )? ) (kw= ',' (this_Attribute_3= ruleAttribute (kw= '...' )? )? )* )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:391:2: (this_Attribute_0= ruleAttribute (kw= '...' )? ) (kw= ',' (this_Attribute_3= ruleAttribute (kw= '...' )? )? )*
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:391:2: (this_Attribute_0= ruleAttribute (kw= '...' )? )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:392:5: this_Attribute_0= ruleAttribute (kw= '...' )?
            {
             
                    newCompositeNode(grammarAccess.getAttributeListAccess().getAttributeParserRuleCall_0_0()); 
                
            pushFollow(FOLLOW_ruleAttribute_in_ruleAttributeList1049);
            this_Attribute_0=ruleAttribute();

            state._fsp--;


            		current.merge(this_Attribute_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:402:1: (kw= '...' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==41) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:403:2: kw= '...'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleAttributeList1068); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAttributeListAccess().getFullStopFullStopFullStopKeyword_0_1()); 
                        

                    }
                    break;

            }


            }

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:408:4: (kw= ',' (this_Attribute_3= ruleAttribute (kw= '...' )? )? )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==42) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:409:2: kw= ',' (this_Attribute_3= ruleAttribute (kw= '...' )? )?
            	    {
            	    kw=(Token)match(input,42,FOLLOW_42_in_ruleAttributeList1085); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getAttributeListAccess().getCommaKeyword_1_0()); 
            	        
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:414:1: (this_Attribute_3= ruleAttribute (kw= '...' )? )?
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==RULE_ID) ) {
            	        alt9=1;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:415:5: this_Attribute_3= ruleAttribute (kw= '...' )?
            	            {
            	             
            	                    newCompositeNode(grammarAccess.getAttributeListAccess().getAttributeParserRuleCall_1_1_0()); 
            	                
            	            pushFollow(FOLLOW_ruleAttribute_in_ruleAttributeList1108);
            	            this_Attribute_3=ruleAttribute();

            	            state._fsp--;


            	            		current.merge(this_Attribute_3);
            	                
            	             
            	                    afterParserOrEnumRuleCall();
            	                
            	            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:425:1: (kw= '...' )?
            	            int alt8=2;
            	            int LA8_0 = input.LA(1);

            	            if ( (LA8_0==41) ) {
            	                alt8=1;
            	            }
            	            switch (alt8) {
            	                case 1 :
            	                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:426:2: kw= '...'
            	                    {
            	                    kw=(Token)match(input,41,FOLLOW_41_in_ruleAttributeList1127); 

            	                            current.merge(kw);
            	                            newLeafNode(kw, grammarAccess.getAttributeListAccess().getFullStopFullStopFullStopKeyword_1_1_1()); 
            	                        

            	                    }
            	                    break;

            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // $ANTLR end "ruleAttributeList"


    // $ANTLR start "entryRuleAttribute"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:439:1: entryRuleAttribute returns [String current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final String entryRuleAttribute() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAttribute = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:440:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:441:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute1174);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute1185); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:448:1: ruleAttribute returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_AttributeToken_0= ruleAttributeToken (this_AttributeArgumentClause_1= ruleAttributeArgumentClause )? ) ;
    public final AntlrDatatypeRuleToken ruleAttribute() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_AttributeToken_0 = null;

        AntlrDatatypeRuleToken this_AttributeArgumentClause_1 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:451:28: ( (this_AttributeToken_0= ruleAttributeToken (this_AttributeArgumentClause_1= ruleAttributeArgumentClause )? ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:452:1: (this_AttributeToken_0= ruleAttributeToken (this_AttributeArgumentClause_1= ruleAttributeArgumentClause )? )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:452:1: (this_AttributeToken_0= ruleAttributeToken (this_AttributeArgumentClause_1= ruleAttributeArgumentClause )? )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:453:5: this_AttributeToken_0= ruleAttributeToken (this_AttributeArgumentClause_1= ruleAttributeArgumentClause )?
            {
             
                    newCompositeNode(grammarAccess.getAttributeAccess().getAttributeTokenParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleAttributeToken_in_ruleAttribute1232);
            this_AttributeToken_0=ruleAttributeToken();

            state._fsp--;


            		current.merge(this_AttributeToken_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:463:1: (this_AttributeArgumentClause_1= ruleAttributeArgumentClause )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==43) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:464:5: this_AttributeArgumentClause_1= ruleAttributeArgumentClause
                    {
                     
                            newCompositeNode(grammarAccess.getAttributeAccess().getAttributeArgumentClauseParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAttributeArgumentClause_in_ruleAttribute1260);
                    this_AttributeArgumentClause_1=ruleAttributeArgumentClause();

                    state._fsp--;


                    		current.merge(this_AttributeArgumentClause_1);
                        
                     
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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleAttributeToken"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:482:1: entryRuleAttributeToken returns [String current=null] : iv_ruleAttributeToken= ruleAttributeToken EOF ;
    public final String entryRuleAttributeToken() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAttributeToken = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:483:2: (iv_ruleAttributeToken= ruleAttributeToken EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:484:2: iv_ruleAttributeToken= ruleAttributeToken EOF
            {
             newCompositeNode(grammarAccess.getAttributeTokenRule()); 
            pushFollow(FOLLOW_ruleAttributeToken_in_entryRuleAttributeToken1308);
            iv_ruleAttributeToken=ruleAttributeToken();

            state._fsp--;

             current =iv_ruleAttributeToken.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeToken1319); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttributeToken"


    // $ANTLR start "ruleAttributeToken"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:491:1: ruleAttributeToken returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID kw= '::' )? this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleAttributeToken() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:494:28: ( ( (this_ID_0= RULE_ID kw= '::' )? this_ID_2= RULE_ID ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:495:1: ( (this_ID_0= RULE_ID kw= '::' )? this_ID_2= RULE_ID )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:495:1: ( (this_ID_0= RULE_ID kw= '::' )? this_ID_2= RULE_ID )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:495:2: (this_ID_0= RULE_ID kw= '::' )? this_ID_2= RULE_ID
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:495:2: (this_ID_0= RULE_ID kw= '::' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==38) ) {
                    alt12=1;
                }
            }
            switch (alt12) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:495:7: this_ID_0= RULE_ID kw= '::'
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttributeToken1360); 

                    		current.merge(this_ID_0);
                        
                     
                        newLeafNode(this_ID_0, grammarAccess.getAttributeTokenAccess().getIDTerminalRuleCall_0_0()); 
                        
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleAttributeToken1378); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAttributeTokenAccess().getColonColonKeyword_0_1()); 
                        

                    }
                    break;

            }

            this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttributeToken1395); 

            		current.merge(this_ID_2);
                
             
                newLeafNode(this_ID_2, grammarAccess.getAttributeTokenAccess().getIDTerminalRuleCall_1()); 
                

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
    // $ANTLR end "ruleAttributeToken"


    // $ANTLR start "entryRuleAttributeArgumentClause"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:523:1: entryRuleAttributeArgumentClause returns [String current=null] : iv_ruleAttributeArgumentClause= ruleAttributeArgumentClause EOF ;
    public final String entryRuleAttributeArgumentClause() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAttributeArgumentClause = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:524:2: (iv_ruleAttributeArgumentClause= ruleAttributeArgumentClause EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:525:2: iv_ruleAttributeArgumentClause= ruleAttributeArgumentClause EOF
            {
             newCompositeNode(grammarAccess.getAttributeArgumentClauseRule()); 
            pushFollow(FOLLOW_ruleAttributeArgumentClause_in_entryRuleAttributeArgumentClause1441);
            iv_ruleAttributeArgumentClause=ruleAttributeArgumentClause();

            state._fsp--;

             current =iv_ruleAttributeArgumentClause.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeArgumentClause1452); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttributeArgumentClause"


    // $ANTLR start "ruleAttributeArgumentClause"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:532:1: ruleAttributeArgumentClause returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '(' this_Token_1= ruleToken kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleAttributeArgumentClause() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Token_1 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:535:28: ( (kw= '(' this_Token_1= ruleToken kw= ')' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:536:1: (kw= '(' this_Token_1= ruleToken kw= ')' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:536:1: (kw= '(' this_Token_1= ruleToken kw= ')' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:537:2: kw= '(' this_Token_1= ruleToken kw= ')'
            {
            kw=(Token)match(input,43,FOLLOW_43_in_ruleAttributeArgumentClause1490); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getAttributeArgumentClauseAccess().getLeftParenthesisKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getAttributeArgumentClauseAccess().getTokenParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleToken_in_ruleAttributeArgumentClause1512);
            this_Token_1=ruleToken();

            state._fsp--;


            		current.merge(this_Token_1);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,44,FOLLOW_44_in_ruleAttributeArgumentClause1530); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getAttributeArgumentClauseAccess().getRightParenthesisKeyword_2()); 
                

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
    // $ANTLR end "ruleAttributeArgumentClause"


    // $ANTLR start "entryRuleInitDeclarator"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:567:1: entryRuleInitDeclarator returns [String current=null] : iv_ruleInitDeclarator= ruleInitDeclarator EOF ;
    public final String entryRuleInitDeclarator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInitDeclarator = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:568:2: (iv_ruleInitDeclarator= ruleInitDeclarator EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:569:2: iv_ruleInitDeclarator= ruleInitDeclarator EOF
            {
             newCompositeNode(grammarAccess.getInitDeclaratorRule()); 
            pushFollow(FOLLOW_ruleInitDeclarator_in_entryRuleInitDeclarator1571);
            iv_ruleInitDeclarator=ruleInitDeclarator();

            state._fsp--;

             current =iv_ruleInitDeclarator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInitDeclarator1582); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:576:1: ruleInitDeclarator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Declarator_0= ruleDeclarator (this_Initializer_1= ruleInitializer )? ) ;
    public final AntlrDatatypeRuleToken ruleInitDeclarator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Declarator_0 = null;

        AntlrDatatypeRuleToken this_Initializer_1 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:579:28: ( (this_Declarator_0= ruleDeclarator (this_Initializer_1= ruleInitializer )? ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:580:1: (this_Declarator_0= ruleDeclarator (this_Initializer_1= ruleInitializer )? )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:580:1: (this_Declarator_0= ruleDeclarator (this_Initializer_1= ruleInitializer )? )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:581:5: this_Declarator_0= ruleDeclarator (this_Initializer_1= ruleInitializer )?
            {
             
                    newCompositeNode(grammarAccess.getInitDeclaratorAccess().getDeclaratorParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleDeclarator_in_ruleInitDeclarator1629);
            this_Declarator_0=ruleDeclarator();

            state._fsp--;


            		current.merge(this_Declarator_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:591:1: (this_Initializer_1= ruleInitializer )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==109) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:592:5: this_Initializer_1= ruleInitializer
                    {
                     
                            newCompositeNode(grammarAccess.getInitDeclaratorAccess().getInitializerParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleInitializer_in_ruleInitDeclarator1657);
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


    // $ANTLR start "entryRuleDeclarator"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:610:1: entryRuleDeclarator returns [String current=null] : iv_ruleDeclarator= ruleDeclarator EOF ;
    public final String entryRuleDeclarator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDeclarator = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:611:2: (iv_ruleDeclarator= ruleDeclarator EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:612:2: iv_ruleDeclarator= ruleDeclarator EOF
            {
             newCompositeNode(grammarAccess.getDeclaratorRule()); 
            pushFollow(FOLLOW_ruleDeclarator_in_entryRuleDeclarator1705);
            iv_ruleDeclarator=ruleDeclarator();

            state._fsp--;

             current =iv_ruleDeclarator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclarator1716); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclarator"


    // $ANTLR start "ruleDeclarator"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:619:1: ruleDeclarator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_NoptrDeclarator_0= ruleNoptrDeclarator ;
    public final AntlrDatatypeRuleToken ruleDeclarator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_NoptrDeclarator_0 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:622:28: (this_NoptrDeclarator_0= ruleNoptrDeclarator )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:624:5: this_NoptrDeclarator_0= ruleNoptrDeclarator
            {
             
                    newCompositeNode(grammarAccess.getDeclaratorAccess().getNoptrDeclaratorParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleNoptrDeclarator_in_ruleDeclarator1762);
            this_NoptrDeclarator_0=ruleNoptrDeclarator();

            state._fsp--;


            		current.merge(this_NoptrDeclarator_0);
                
             
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleDeclarator"


    // $ANTLR start "entryRuleFunctionDeclarator"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:642:1: entryRuleFunctionDeclarator returns [String current=null] : iv_ruleFunctionDeclarator= ruleFunctionDeclarator EOF ;
    public final String entryRuleFunctionDeclarator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunctionDeclarator = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:643:2: (iv_ruleFunctionDeclarator= ruleFunctionDeclarator EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:644:2: iv_ruleFunctionDeclarator= ruleFunctionDeclarator EOF
            {
             newCompositeNode(grammarAccess.getFunctionDeclaratorRule()); 
            pushFollow(FOLLOW_ruleFunctionDeclarator_in_entryRuleFunctionDeclarator1807);
            iv_ruleFunctionDeclarator=ruleFunctionDeclarator();

            state._fsp--;

             current =iv_ruleFunctionDeclarator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionDeclarator1818); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:651:1: ruleFunctionDeclarator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_TemplateDeclaration_0= ruleTemplateDeclaration )? this_NoptrDeclarator_1= ruleNoptrDeclarator this_ParametersAndQualifiers_2= ruleParametersAndQualifiers ) ;
    public final AntlrDatatypeRuleToken ruleFunctionDeclarator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_TemplateDeclaration_0 = null;

        AntlrDatatypeRuleToken this_NoptrDeclarator_1 = null;

        AntlrDatatypeRuleToken this_ParametersAndQualifiers_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:654:28: ( ( (this_TemplateDeclaration_0= ruleTemplateDeclaration )? this_NoptrDeclarator_1= ruleNoptrDeclarator this_ParametersAndQualifiers_2= ruleParametersAndQualifiers ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:655:1: ( (this_TemplateDeclaration_0= ruleTemplateDeclaration )? this_NoptrDeclarator_1= ruleNoptrDeclarator this_ParametersAndQualifiers_2= ruleParametersAndQualifiers )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:655:1: ( (this_TemplateDeclaration_0= ruleTemplateDeclaration )? this_NoptrDeclarator_1= ruleNoptrDeclarator this_ParametersAndQualifiers_2= ruleParametersAndQualifiers )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:655:2: (this_TemplateDeclaration_0= ruleTemplateDeclaration )? this_NoptrDeclarator_1= ruleNoptrDeclarator this_ParametersAndQualifiers_2= ruleParametersAndQualifiers
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:655:2: (this_TemplateDeclaration_0= ruleTemplateDeclaration )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==90) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:656:5: this_TemplateDeclaration_0= ruleTemplateDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getFunctionDeclaratorAccess().getTemplateDeclarationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleTemplateDeclaration_in_ruleFunctionDeclarator1866);
                    this_TemplateDeclaration_0=ruleTemplateDeclaration();

                    state._fsp--;


                    		current.merge(this_TemplateDeclaration_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getFunctionDeclaratorAccess().getNoptrDeclaratorParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleNoptrDeclarator_in_ruleFunctionDeclarator1895);
            this_NoptrDeclarator_1=ruleNoptrDeclarator();

            state._fsp--;


            		current.merge(this_NoptrDeclarator_1);
                
             
                    afterParserOrEnumRuleCall();
                
             
                    newCompositeNode(grammarAccess.getFunctionDeclaratorAccess().getParametersAndQualifiersParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleParametersAndQualifiers_in_ruleFunctionDeclarator1922);
            this_ParametersAndQualifiers_2=ruleParametersAndQualifiers();

            state._fsp--;


            		current.merge(this_ParametersAndQualifiers_2);
                
             
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


    // $ANTLR start "entryRuleNoptrDeclarator"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:696:1: entryRuleNoptrDeclarator returns [String current=null] : iv_ruleNoptrDeclarator= ruleNoptrDeclarator EOF ;
    public final String entryRuleNoptrDeclarator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNoptrDeclarator = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:697:2: (iv_ruleNoptrDeclarator= ruleNoptrDeclarator EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:698:2: iv_ruleNoptrDeclarator= ruleNoptrDeclarator EOF
            {
             newCompositeNode(grammarAccess.getNoptrDeclaratorRule()); 
            pushFollow(FOLLOW_ruleNoptrDeclarator_in_entryRuleNoptrDeclarator1968);
            iv_ruleNoptrDeclarator=ruleNoptrDeclarator();

            state._fsp--;

             current =iv_ruleNoptrDeclarator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoptrDeclarator1979); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNoptrDeclarator"


    // $ANTLR start "ruleNoptrDeclarator"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:705:1: ruleNoptrDeclarator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DeclaratorId_0= ruleDeclaratorId ;
    public final AntlrDatatypeRuleToken ruleNoptrDeclarator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_DeclaratorId_0 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:708:28: (this_DeclaratorId_0= ruleDeclaratorId )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:710:5: this_DeclaratorId_0= ruleDeclaratorId
            {
             
                    newCompositeNode(grammarAccess.getNoptrDeclaratorAccess().getDeclaratorIdParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleDeclaratorId_in_ruleNoptrDeclarator2025);
            this_DeclaratorId_0=ruleDeclaratorId();

            state._fsp--;


            		current.merge(this_DeclaratorId_0);
                
             
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleNoptrDeclarator"


    // $ANTLR start "entryRuleParametersAndQualifiers"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:728:1: entryRuleParametersAndQualifiers returns [String current=null] : iv_ruleParametersAndQualifiers= ruleParametersAndQualifiers EOF ;
    public final String entryRuleParametersAndQualifiers() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleParametersAndQualifiers = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:729:2: (iv_ruleParametersAndQualifiers= ruleParametersAndQualifiers EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:730:2: iv_ruleParametersAndQualifiers= ruleParametersAndQualifiers EOF
            {
             newCompositeNode(grammarAccess.getParametersAndQualifiersRule()); 
            pushFollow(FOLLOW_ruleParametersAndQualifiers_in_entryRuleParametersAndQualifiers2070);
            iv_ruleParametersAndQualifiers=ruleParametersAndQualifiers();

            state._fsp--;

             current =iv_ruleParametersAndQualifiers.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParametersAndQualifiers2081); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:737:1: ruleParametersAndQualifiers returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '(' (this_ParameterDeclarationClause_1= ruleParameterDeclarationClause )? kw= ')' (this_AttributeSpecifier_3= ruleAttributeSpecifier )* (kw= 'const' | kw= 'volatile' )? (kw= '&' | kw= '&&' )? (this_ExceptionSpecification_8= ruleExceptionSpecification )? ) ;
    public final AntlrDatatypeRuleToken ruleParametersAndQualifiers() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ParameterDeclarationClause_1 = null;

        AntlrDatatypeRuleToken this_AttributeSpecifier_3 = null;

        AntlrDatatypeRuleToken this_ExceptionSpecification_8 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:740:28: ( (kw= '(' (this_ParameterDeclarationClause_1= ruleParameterDeclarationClause )? kw= ')' (this_AttributeSpecifier_3= ruleAttributeSpecifier )* (kw= 'const' | kw= 'volatile' )? (kw= '&' | kw= '&&' )? (this_ExceptionSpecification_8= ruleExceptionSpecification )? ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:741:1: (kw= '(' (this_ParameterDeclarationClause_1= ruleParameterDeclarationClause )? kw= ')' (this_AttributeSpecifier_3= ruleAttributeSpecifier )* (kw= 'const' | kw= 'volatile' )? (kw= '&' | kw= '&&' )? (this_ExceptionSpecification_8= ruleExceptionSpecification )? )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:741:1: (kw= '(' (this_ParameterDeclarationClause_1= ruleParameterDeclarationClause )? kw= ')' (this_AttributeSpecifier_3= ruleAttributeSpecifier )* (kw= 'const' | kw= 'volatile' )? (kw= '&' | kw= '&&' )? (this_ExceptionSpecification_8= ruleExceptionSpecification )? )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:742:2: kw= '(' (this_ParameterDeclarationClause_1= ruleParameterDeclarationClause )? kw= ')' (this_AttributeSpecifier_3= ruleAttributeSpecifier )* (kw= 'const' | kw= 'volatile' )? (kw= '&' | kw= '&&' )? (this_ExceptionSpecification_8= ruleExceptionSpecification )?
            {
            kw=(Token)match(input,43,FOLLOW_43_in_ruleParametersAndQualifiers2119); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getParametersAndQualifiersAccess().getLeftParenthesisKeyword_0()); 
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:747:1: (this_ParameterDeclarationClause_1= ruleParameterDeclarationClause )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==39||LA15_0==41||LA15_0==99) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:748:5: this_ParameterDeclarationClause_1= ruleParameterDeclarationClause
                    {
                     
                            newCompositeNode(grammarAccess.getParametersAndQualifiersAccess().getParameterDeclarationClauseParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleParameterDeclarationClause_in_ruleParametersAndQualifiers2142);
                    this_ParameterDeclarationClause_1=ruleParameterDeclarationClause();

                    state._fsp--;


                    		current.merge(this_ParameterDeclarationClause_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            kw=(Token)match(input,44,FOLLOW_44_in_ruleParametersAndQualifiers2162); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getParametersAndQualifiersAccess().getRightParenthesisKeyword_2()); 
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:764:1: (this_AttributeSpecifier_3= ruleAttributeSpecifier )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==39) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:765:5: this_AttributeSpecifier_3= ruleAttributeSpecifier
            	    {
            	     
            	            newCompositeNode(grammarAccess.getParametersAndQualifiersAccess().getAttributeSpecifierParserRuleCall_3()); 
            	        
            	    pushFollow(FOLLOW_ruleAttributeSpecifier_in_ruleParametersAndQualifiers2185);
            	    this_AttributeSpecifier_3=ruleAttributeSpecifier();

            	    state._fsp--;


            	    		current.merge(this_AttributeSpecifier_3);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:775:3: (kw= 'const' | kw= 'volatile' )?
            int alt17=3;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==45) ) {
                alt17=1;
            }
            else if ( (LA17_0==46) ) {
                alt17=2;
            }
            switch (alt17) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:776:2: kw= 'const'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleParametersAndQualifiers2206); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getParametersAndQualifiersAccess().getConstKeyword_4_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:783:2: kw= 'volatile'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleParametersAndQualifiers2225); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getParametersAndQualifiersAccess().getVolatileKeyword_4_1()); 
                        

                    }
                    break;

            }

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:788:3: (kw= '&' | kw= '&&' )?
            int alt18=3;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==47) ) {
                alt18=1;
            }
            else if ( (LA18_0==48) ) {
                alt18=2;
            }
            switch (alt18) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:789:2: kw= '&'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleParametersAndQualifiers2241); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getParametersAndQualifiersAccess().getAmpersandKeyword_5_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:796:2: kw= '&&'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleParametersAndQualifiers2260); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getParametersAndQualifiersAccess().getAmpersandAmpersandKeyword_5_1()); 
                        

                    }
                    break;

            }

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:801:3: (this_ExceptionSpecification_8= ruleExceptionSpecification )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=95 && LA19_0<=96)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:802:5: this_ExceptionSpecification_8= ruleExceptionSpecification
                    {
                     
                            newCompositeNode(grammarAccess.getParametersAndQualifiersAccess().getExceptionSpecificationParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleExceptionSpecification_in_ruleParametersAndQualifiers2285);
                    this_ExceptionSpecification_8=ruleExceptionSpecification();

                    state._fsp--;


                    		current.merge(this_ExceptionSpecification_8);
                        
                     
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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:820:1: entryRuleDeclaratorId returns [String current=null] : iv_ruleDeclaratorId= ruleDeclaratorId EOF ;
    public final String entryRuleDeclaratorId() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDeclaratorId = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:821:2: (iv_ruleDeclaratorId= ruleDeclaratorId EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:822:2: iv_ruleDeclaratorId= ruleDeclaratorId EOF
            {
             newCompositeNode(grammarAccess.getDeclaratorIdRule()); 
            pushFollow(FOLLOW_ruleDeclaratorId_in_entryRuleDeclaratorId2333);
            iv_ruleDeclaratorId=ruleDeclaratorId();

            state._fsp--;

             current =iv_ruleDeclaratorId.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaratorId2344); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:829:1: ruleDeclaratorId returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= '...' )? this_IdExpression_1= ruleIdExpression ) | ( (kw= '::' )? (this_NestedNameSpecifier_3= ruleNestedNameSpecifier )? this_ClassName_4= ruleClassName ) ) ;
    public final AntlrDatatypeRuleToken ruleDeclaratorId() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_IdExpression_1 = null;

        AntlrDatatypeRuleToken this_NestedNameSpecifier_3 = null;

        AntlrDatatypeRuleToken this_ClassName_4 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:832:28: ( ( ( (kw= '...' )? this_IdExpression_1= ruleIdExpression ) | ( (kw= '::' )? (this_NestedNameSpecifier_3= ruleNestedNameSpecifier )? this_ClassName_4= ruleClassName ) ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:833:1: ( ( (kw= '...' )? this_IdExpression_1= ruleIdExpression ) | ( (kw= '::' )? (this_NestedNameSpecifier_3= ruleNestedNameSpecifier )? this_ClassName_4= ruleClassName ) )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:833:1: ( ( (kw= '...' )? this_IdExpression_1= ruleIdExpression ) | ( (kw= '::' )? (this_NestedNameSpecifier_3= ruleNestedNameSpecifier )? this_ClassName_4= ruleClassName ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==41||LA23_0==98) ) {
                alt23=1;
            }
            else if ( (LA23_0==38||LA23_0==101||LA23_0==108) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:833:2: ( (kw= '...' )? this_IdExpression_1= ruleIdExpression )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:833:2: ( (kw= '...' )? this_IdExpression_1= ruleIdExpression )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:833:3: (kw= '...' )? this_IdExpression_1= ruleIdExpression
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:833:3: (kw= '...' )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==41) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:834:2: kw= '...'
                            {
                            kw=(Token)match(input,41,FOLLOW_41_in_ruleDeclaratorId2384); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getDeclaratorIdAccess().getFullStopFullStopFullStopKeyword_0_0()); 
                                

                            }
                            break;

                    }

                     
                            newCompositeNode(grammarAccess.getDeclaratorIdAccess().getIdExpressionParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleIdExpression_in_ruleDeclaratorId2408);
                    this_IdExpression_1=ruleIdExpression();

                    state._fsp--;


                    		current.merge(this_IdExpression_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:851:6: ( (kw= '::' )? (this_NestedNameSpecifier_3= ruleNestedNameSpecifier )? this_ClassName_4= ruleClassName )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:851:6: ( (kw= '::' )? (this_NestedNameSpecifier_3= ruleNestedNameSpecifier )? this_ClassName_4= ruleClassName )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:851:7: (kw= '::' )? (this_NestedNameSpecifier_3= ruleNestedNameSpecifier )? this_ClassName_4= ruleClassName
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:851:7: (kw= '::' )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==38) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:852:2: kw= '::'
                            {
                            kw=(Token)match(input,38,FOLLOW_38_in_ruleDeclaratorId2435); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getDeclaratorIdAccess().getColonColonKeyword_1_0()); 
                                

                            }
                            break;

                    }

                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:857:3: (this_NestedNameSpecifier_3= ruleNestedNameSpecifier )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==101) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:858:5: this_NestedNameSpecifier_3= ruleNestedNameSpecifier
                            {
                             
                                    newCompositeNode(grammarAccess.getDeclaratorIdAccess().getNestedNameSpecifierParserRuleCall_1_1()); 
                                
                            pushFollow(FOLLOW_ruleNestedNameSpecifier_in_ruleDeclaratorId2460);
                            this_NestedNameSpecifier_3=ruleNestedNameSpecifier();

                            state._fsp--;


                            		current.merge(this_NestedNameSpecifier_3);
                                
                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                     
                            newCompositeNode(grammarAccess.getDeclaratorIdAccess().getClassNameParserRuleCall_1_2()); 
                        
                    pushFollow(FOLLOW_ruleClassName_in_ruleDeclaratorId2489);
                    this_ClassName_4=ruleClassName();

                    state._fsp--;


                    		current.merge(this_ClassName_4);
                        
                     
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleDeclaratorId"


    // $ANTLR start "entryRuleTypeId"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:887:1: entryRuleTypeId returns [String current=null] : iv_ruleTypeId= ruleTypeId EOF ;
    public final String entryRuleTypeId() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeId = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:888:2: (iv_ruleTypeId= ruleTypeId EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:889:2: iv_ruleTypeId= ruleTypeId EOF
            {
             newCompositeNode(grammarAccess.getTypeIdRule()); 
            pushFollow(FOLLOW_ruleTypeId_in_entryRuleTypeId2536);
            iv_ruleTypeId=ruleTypeId();

            state._fsp--;

             current =iv_ruleTypeId.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeId2547); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:896:1: ruleTypeId returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TypeSpecifier_0= ruleTypeSpecifier )+ ;
    public final AntlrDatatypeRuleToken ruleTypeId() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_TypeSpecifier_0 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:899:28: ( (this_TypeSpecifier_0= ruleTypeSpecifier )+ )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:900:1: (this_TypeSpecifier_0= ruleTypeSpecifier )+
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:900:1: (this_TypeSpecifier_0= ruleTypeSpecifier )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==103) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:901:5: this_TypeSpecifier_0= ruleTypeSpecifier
            	    {
            	     
            	            newCompositeNode(grammarAccess.getTypeIdAccess().getTypeSpecifierParserRuleCall()); 
            	        
            	    pushFollow(FOLLOW_ruleTypeSpecifier_in_ruleTypeId2594);
            	    this_TypeSpecifier_0=ruleTypeSpecifier();

            	    state._fsp--;


            	    		current.merge(this_TypeSpecifier_0);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:919:1: entryRuleParameterDeclarationClause returns [String current=null] : iv_ruleParameterDeclarationClause= ruleParameterDeclarationClause EOF ;
    public final String entryRuleParameterDeclarationClause() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleParameterDeclarationClause = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:920:2: (iv_ruleParameterDeclarationClause= ruleParameterDeclarationClause EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:921:2: iv_ruleParameterDeclarationClause= ruleParameterDeclarationClause EOF
            {
             newCompositeNode(grammarAccess.getParameterDeclarationClauseRule()); 
            pushFollow(FOLLOW_ruleParameterDeclarationClause_in_entryRuleParameterDeclarationClause2641);
            iv_ruleParameterDeclarationClause=ruleParameterDeclarationClause();

            state._fsp--;

             current =iv_ruleParameterDeclarationClause.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterDeclarationClause2652); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:928:1: ruleParameterDeclarationClause returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '...' | (this_ParameterDeclarationList_1= ruleParameterDeclarationList ( (kw= ',' )? kw= '...' )? ) ) ;
    public final AntlrDatatypeRuleToken ruleParameterDeclarationClause() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ParameterDeclarationList_1 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:931:28: ( (kw= '...' | (this_ParameterDeclarationList_1= ruleParameterDeclarationList ( (kw= ',' )? kw= '...' )? ) ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:932:1: (kw= '...' | (this_ParameterDeclarationList_1= ruleParameterDeclarationList ( (kw= ',' )? kw= '...' )? ) )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:932:1: (kw= '...' | (this_ParameterDeclarationList_1= ruleParameterDeclarationList ( (kw= ',' )? kw= '...' )? ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==41) ) {
                alt27=1;
            }
            else if ( (LA27_0==39||LA27_0==99) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:933:2: kw= '...'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleParameterDeclarationClause2690); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getParameterDeclarationClauseAccess().getFullStopFullStopFullStopKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:939:6: (this_ParameterDeclarationList_1= ruleParameterDeclarationList ( (kw= ',' )? kw= '...' )? )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:939:6: (this_ParameterDeclarationList_1= ruleParameterDeclarationList ( (kw= ',' )? kw= '...' )? )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:940:5: this_ParameterDeclarationList_1= ruleParameterDeclarationList ( (kw= ',' )? kw= '...' )?
                    {
                     
                            newCompositeNode(grammarAccess.getParameterDeclarationClauseAccess().getParameterDeclarationListParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_ruleParameterDeclarationList_in_ruleParameterDeclarationClause2719);
                    this_ParameterDeclarationList_1=ruleParameterDeclarationList();

                    state._fsp--;


                    		current.merge(this_ParameterDeclarationList_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:950:1: ( (kw= ',' )? kw= '...' )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( ((LA26_0>=41 && LA26_0<=42)) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:950:2: (kw= ',' )? kw= '...'
                            {
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:950:2: (kw= ',' )?
                            int alt25=2;
                            int LA25_0 = input.LA(1);

                            if ( (LA25_0==42) ) {
                                alt25=1;
                            }
                            switch (alt25) {
                                case 1 :
                                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:951:2: kw= ','
                                    {
                                    kw=(Token)match(input,42,FOLLOW_42_in_ruleParameterDeclarationClause2739); 

                                            current.merge(kw);
                                            newLeafNode(kw, grammarAccess.getParameterDeclarationClauseAccess().getCommaKeyword_1_1_0()); 
                                        

                                    }
                                    break;

                            }

                            kw=(Token)match(input,41,FOLLOW_41_in_ruleParameterDeclarationClause2754); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:970:1: entryRuleParameterDeclarationList returns [String current=null] : iv_ruleParameterDeclarationList= ruleParameterDeclarationList EOF ;
    public final String entryRuleParameterDeclarationList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleParameterDeclarationList = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:971:2: (iv_ruleParameterDeclarationList= ruleParameterDeclarationList EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:972:2: iv_ruleParameterDeclarationList= ruleParameterDeclarationList EOF
            {
             newCompositeNode(grammarAccess.getParameterDeclarationListRule()); 
            pushFollow(FOLLOW_ruleParameterDeclarationList_in_entryRuleParameterDeclarationList2798);
            iv_ruleParameterDeclarationList=ruleParameterDeclarationList();

            state._fsp--;

             current =iv_ruleParameterDeclarationList.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterDeclarationList2809); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:979:1: ruleParameterDeclarationList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ParameterDeclaration_0= ruleParameterDeclaration (kw= ',' this_ParameterDeclaration_2= ruleParameterDeclaration )* ) ;
    public final AntlrDatatypeRuleToken ruleParameterDeclarationList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ParameterDeclaration_0 = null;

        AntlrDatatypeRuleToken this_ParameterDeclaration_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:982:28: ( (this_ParameterDeclaration_0= ruleParameterDeclaration (kw= ',' this_ParameterDeclaration_2= ruleParameterDeclaration )* ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:983:1: (this_ParameterDeclaration_0= ruleParameterDeclaration (kw= ',' this_ParameterDeclaration_2= ruleParameterDeclaration )* )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:983:1: (this_ParameterDeclaration_0= ruleParameterDeclaration (kw= ',' this_ParameterDeclaration_2= ruleParameterDeclaration )* )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:984:5: this_ParameterDeclaration_0= ruleParameterDeclaration (kw= ',' this_ParameterDeclaration_2= ruleParameterDeclaration )*
            {
             
                    newCompositeNode(grammarAccess.getParameterDeclarationListAccess().getParameterDeclarationParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleParameterDeclaration_in_ruleParameterDeclarationList2856);
            this_ParameterDeclaration_0=ruleParameterDeclaration();

            state._fsp--;


            		current.merge(this_ParameterDeclaration_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:994:1: (kw= ',' this_ParameterDeclaration_2= ruleParameterDeclaration )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==42) ) {
                    int LA28_1 = input.LA(2);

                    if ( (LA28_1==39||LA28_1==99) ) {
                        alt28=1;
                    }


                }


                switch (alt28) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:995:2: kw= ',' this_ParameterDeclaration_2= ruleParameterDeclaration
            	    {
            	    kw=(Token)match(input,42,FOLLOW_42_in_ruleParameterDeclarationList2875); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getParameterDeclarationListAccess().getCommaKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getParameterDeclarationListAccess().getParameterDeclarationParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_ruleParameterDeclaration_in_ruleParameterDeclarationList2897);
            	    this_ParameterDeclaration_2=ruleParameterDeclaration();

            	    state._fsp--;


            	    		current.merge(this_ParameterDeclaration_2);
            	        
            	     
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
    // $ANTLR end "ruleParameterDeclarationList"


    // $ANTLR start "entryRuleParameterDeclaration"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1019:1: entryRuleParameterDeclaration returns [String current=null] : iv_ruleParameterDeclaration= ruleParameterDeclaration EOF ;
    public final String entryRuleParameterDeclaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleParameterDeclaration = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1020:2: (iv_ruleParameterDeclaration= ruleParameterDeclaration EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1021:2: iv_ruleParameterDeclaration= ruleParameterDeclaration EOF
            {
             newCompositeNode(grammarAccess.getParameterDeclarationRule()); 
            pushFollow(FOLLOW_ruleParameterDeclaration_in_entryRuleParameterDeclaration2945);
            iv_ruleParameterDeclaration=ruleParameterDeclaration();

            state._fsp--;

             current =iv_ruleParameterDeclaration.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterDeclaration2956); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1028:1: ruleParameterDeclaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_AttributeSpecifier_0= ruleAttributeSpecifier )* (this_DeclarationSpecifier_1= ruleDeclarationSpecifier )+ this_InitDeclarator_2= ruleInitDeclarator ) ;
    public final AntlrDatatypeRuleToken ruleParameterDeclaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_AttributeSpecifier_0 = null;

        AntlrDatatypeRuleToken this_DeclarationSpecifier_1 = null;

        AntlrDatatypeRuleToken this_InitDeclarator_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1031:28: ( ( (this_AttributeSpecifier_0= ruleAttributeSpecifier )* (this_DeclarationSpecifier_1= ruleDeclarationSpecifier )+ this_InitDeclarator_2= ruleInitDeclarator ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1032:1: ( (this_AttributeSpecifier_0= ruleAttributeSpecifier )* (this_DeclarationSpecifier_1= ruleDeclarationSpecifier )+ this_InitDeclarator_2= ruleInitDeclarator )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1032:1: ( (this_AttributeSpecifier_0= ruleAttributeSpecifier )* (this_DeclarationSpecifier_1= ruleDeclarationSpecifier )+ this_InitDeclarator_2= ruleInitDeclarator )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1032:2: (this_AttributeSpecifier_0= ruleAttributeSpecifier )* (this_DeclarationSpecifier_1= ruleDeclarationSpecifier )+ this_InitDeclarator_2= ruleInitDeclarator
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1032:2: (this_AttributeSpecifier_0= ruleAttributeSpecifier )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==39) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1033:5: this_AttributeSpecifier_0= ruleAttributeSpecifier
            	    {
            	     
            	            newCompositeNode(grammarAccess.getParameterDeclarationAccess().getAttributeSpecifierParserRuleCall_0()); 
            	        
            	    pushFollow(FOLLOW_ruleAttributeSpecifier_in_ruleParameterDeclaration3004);
            	    this_AttributeSpecifier_0=ruleAttributeSpecifier();

            	    state._fsp--;


            	    		current.merge(this_AttributeSpecifier_0);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1043:3: (this_DeclarationSpecifier_1= ruleDeclarationSpecifier )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==99) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1044:5: this_DeclarationSpecifier_1= ruleDeclarationSpecifier
            	    {
            	     
            	            newCompositeNode(grammarAccess.getParameterDeclarationAccess().getDeclarationSpecifierParserRuleCall_1()); 
            	        
            	    pushFollow(FOLLOW_ruleDeclarationSpecifier_in_ruleParameterDeclaration3034);
            	    this_DeclarationSpecifier_1=ruleDeclarationSpecifier();

            	    state._fsp--;


            	    		current.merge(this_DeclarationSpecifier_1);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

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

             
                    newCompositeNode(grammarAccess.getParameterDeclarationAccess().getInitDeclaratorParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleInitDeclarator_in_ruleParameterDeclaration3063);
            this_InitDeclarator_2=ruleInitDeclarator();

            state._fsp--;


            		current.merge(this_InitDeclarator_2);
                
             
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


    // $ANTLR start "entryRuleFunctionDefinition"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1073:1: entryRuleFunctionDefinition returns [String current=null] : iv_ruleFunctionDefinition= ruleFunctionDefinition EOF ;
    public final String entryRuleFunctionDefinition() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunctionDefinition = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1074:2: (iv_ruleFunctionDefinition= ruleFunctionDefinition EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1075:2: iv_ruleFunctionDefinition= ruleFunctionDefinition EOF
            {
             newCompositeNode(grammarAccess.getFunctionDefinitionRule()); 
            pushFollow(FOLLOW_ruleFunctionDefinition_in_entryRuleFunctionDefinition3109);
            iv_ruleFunctionDefinition=ruleFunctionDefinition();

            state._fsp--;

             current =iv_ruleFunctionDefinition.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionDefinition3120); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionDefinition"


    // $ANTLR start "ruleFunctionDefinition"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1082:1: ruleFunctionDefinition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_AttributeSpecifier_0= ruleAttributeSpecifier )* (this_DeclarationSpecifier_1= ruleDeclarationSpecifier )* this_FunctionDeclarator_2= ruleFunctionDeclarator (this_FunctionBody_3= ruleFunctionBody | (kw= '=' kw= 'default' kw= ';' ) | (kw= '=' kw= 'delete' kw= ';' ) ) ) ;
    public final AntlrDatatypeRuleToken ruleFunctionDefinition() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_AttributeSpecifier_0 = null;

        AntlrDatatypeRuleToken this_DeclarationSpecifier_1 = null;

        AntlrDatatypeRuleToken this_FunctionDeclarator_2 = null;

        AntlrDatatypeRuleToken this_FunctionBody_3 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1085:28: ( ( (this_AttributeSpecifier_0= ruleAttributeSpecifier )* (this_DeclarationSpecifier_1= ruleDeclarationSpecifier )* this_FunctionDeclarator_2= ruleFunctionDeclarator (this_FunctionBody_3= ruleFunctionBody | (kw= '=' kw= 'default' kw= ';' ) | (kw= '=' kw= 'delete' kw= ';' ) ) ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1086:1: ( (this_AttributeSpecifier_0= ruleAttributeSpecifier )* (this_DeclarationSpecifier_1= ruleDeclarationSpecifier )* this_FunctionDeclarator_2= ruleFunctionDeclarator (this_FunctionBody_3= ruleFunctionBody | (kw= '=' kw= 'default' kw= ';' ) | (kw= '=' kw= 'delete' kw= ';' ) ) )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1086:1: ( (this_AttributeSpecifier_0= ruleAttributeSpecifier )* (this_DeclarationSpecifier_1= ruleDeclarationSpecifier )* this_FunctionDeclarator_2= ruleFunctionDeclarator (this_FunctionBody_3= ruleFunctionBody | (kw= '=' kw= 'default' kw= ';' ) | (kw= '=' kw= 'delete' kw= ';' ) ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1086:2: (this_AttributeSpecifier_0= ruleAttributeSpecifier )* (this_DeclarationSpecifier_1= ruleDeclarationSpecifier )* this_FunctionDeclarator_2= ruleFunctionDeclarator (this_FunctionBody_3= ruleFunctionBody | (kw= '=' kw= 'default' kw= ';' ) | (kw= '=' kw= 'delete' kw= ';' ) )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1086:2: (this_AttributeSpecifier_0= ruleAttributeSpecifier )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==39) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1087:5: this_AttributeSpecifier_0= ruleAttributeSpecifier
            	    {
            	     
            	            newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getAttributeSpecifierParserRuleCall_0()); 
            	        
            	    pushFollow(FOLLOW_ruleAttributeSpecifier_in_ruleFunctionDefinition3168);
            	    this_AttributeSpecifier_0=ruleAttributeSpecifier();

            	    state._fsp--;


            	    		current.merge(this_AttributeSpecifier_0);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1097:3: (this_DeclarationSpecifier_1= ruleDeclarationSpecifier )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==99) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1098:5: this_DeclarationSpecifier_1= ruleDeclarationSpecifier
            	    {
            	     
            	            newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getDeclarationSpecifierParserRuleCall_1()); 
            	        
            	    pushFollow(FOLLOW_ruleDeclarationSpecifier_in_ruleFunctionDefinition3198);
            	    this_DeclarationSpecifier_1=ruleDeclarationSpecifier();

            	    state._fsp--;


            	    		current.merge(this_DeclarationSpecifier_1);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             
                    newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getFunctionDeclaratorParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleFunctionDeclarator_in_ruleFunctionDefinition3227);
            this_FunctionDeclarator_2=ruleFunctionDeclarator();

            state._fsp--;


            		current.merge(this_FunctionDeclarator_2);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1119:1: (this_FunctionBody_3= ruleFunctionBody | (kw= '=' kw= 'default' kw= ';' ) | (kw= '=' kw= 'delete' kw= ';' ) )
            int alt33=3;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==93||(LA33_0>=104 && LA33_0<=105)) ) {
                alt33=1;
            }
            else if ( (LA33_0==49) ) {
                int LA33_2 = input.LA(2);

                if ( (LA33_2==52) ) {
                    alt33=3;
                }
                else if ( (LA33_2==50) ) {
                    alt33=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1120:5: this_FunctionBody_3= ruleFunctionBody
                    {
                     
                            newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getFunctionBodyParserRuleCall_3_0()); 
                        
                    pushFollow(FOLLOW_ruleFunctionBody_in_ruleFunctionDefinition3255);
                    this_FunctionBody_3=ruleFunctionBody();

                    state._fsp--;


                    		current.merge(this_FunctionBody_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1131:6: (kw= '=' kw= 'default' kw= ';' )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1131:6: (kw= '=' kw= 'default' kw= ';' )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1132:2: kw= '=' kw= 'default' kw= ';'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleFunctionDefinition3280); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionDefinitionAccess().getEqualsSignKeyword_3_1_0()); 
                        
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleFunctionDefinition3293); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionDefinitionAccess().getDefaultKeyword_3_1_1()); 
                        
                    kw=(Token)match(input,51,FOLLOW_51_in_ruleFunctionDefinition3306); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionDefinitionAccess().getSemicolonKeyword_3_1_2()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1150:6: (kw= '=' kw= 'delete' kw= ';' )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1150:6: (kw= '=' kw= 'delete' kw= ';' )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1151:2: kw= '=' kw= 'delete' kw= ';'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleFunctionDefinition3327); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionDefinitionAccess().getEqualsSignKeyword_3_2_0()); 
                        
                    kw=(Token)match(input,52,FOLLOW_52_in_ruleFunctionDefinition3340); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionDefinitionAccess().getDeleteKeyword_3_2_1()); 
                        
                    kw=(Token)match(input,51,FOLLOW_51_in_ruleFunctionDefinition3353); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionDefinitionAccess().getSemicolonKeyword_3_2_2()); 
                        

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
    // $ANTLR end "ruleFunctionDefinition"


    // $ANTLR start "entryRuleFunctionBody"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1176:1: entryRuleFunctionBody returns [String current=null] : iv_ruleFunctionBody= ruleFunctionBody EOF ;
    public final String entryRuleFunctionBody() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunctionBody = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1177:2: (iv_ruleFunctionBody= ruleFunctionBody EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1178:2: iv_ruleFunctionBody= ruleFunctionBody EOF
            {
             newCompositeNode(grammarAccess.getFunctionBodyRule()); 
            pushFollow(FOLLOW_ruleFunctionBody_in_entryRuleFunctionBody3396);
            iv_ruleFunctionBody=ruleFunctionBody();

            state._fsp--;

             current =iv_ruleFunctionBody.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionBody3407); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1185:1: ruleFunctionBody returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_CtorInitializer_0= ruleCtorInitializer )? this_CompoundStatement_1= ruleCompoundStatement ) | this_FunctionTryBlock_2= ruleFunctionTryBlock ) ;
    public final AntlrDatatypeRuleToken ruleFunctionBody() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_CtorInitializer_0 = null;

        AntlrDatatypeRuleToken this_CompoundStatement_1 = null;

        AntlrDatatypeRuleToken this_FunctionTryBlock_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1188:28: ( ( ( (this_CtorInitializer_0= ruleCtorInitializer )? this_CompoundStatement_1= ruleCompoundStatement ) | this_FunctionTryBlock_2= ruleFunctionTryBlock ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1189:1: ( ( (this_CtorInitializer_0= ruleCtorInitializer )? this_CompoundStatement_1= ruleCompoundStatement ) | this_FunctionTryBlock_2= ruleFunctionTryBlock )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1189:1: ( ( (this_CtorInitializer_0= ruleCtorInitializer )? this_CompoundStatement_1= ruleCompoundStatement ) | this_FunctionTryBlock_2= ruleFunctionTryBlock )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=104 && LA35_0<=105)) ) {
                alt35=1;
            }
            else if ( (LA35_0==93) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1189:2: ( (this_CtorInitializer_0= ruleCtorInitializer )? this_CompoundStatement_1= ruleCompoundStatement )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1189:2: ( (this_CtorInitializer_0= ruleCtorInitializer )? this_CompoundStatement_1= ruleCompoundStatement )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1189:3: (this_CtorInitializer_0= ruleCtorInitializer )? this_CompoundStatement_1= ruleCompoundStatement
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1189:3: (this_CtorInitializer_0= ruleCtorInitializer )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==105) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1190:5: this_CtorInitializer_0= ruleCtorInitializer
                            {
                             
                                    newCompositeNode(grammarAccess.getFunctionBodyAccess().getCtorInitializerParserRuleCall_0_0()); 
                                
                            pushFollow(FOLLOW_ruleCtorInitializer_in_ruleFunctionBody3456);
                            this_CtorInitializer_0=ruleCtorInitializer();

                            state._fsp--;


                            		current.merge(this_CtorInitializer_0);
                                
                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                     
                            newCompositeNode(grammarAccess.getFunctionBodyAccess().getCompoundStatementParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleCompoundStatement_in_ruleFunctionBody3485);
                    this_CompoundStatement_1=ruleCompoundStatement();

                    state._fsp--;


                    		current.merge(this_CompoundStatement_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1213:5: this_FunctionTryBlock_2= ruleFunctionTryBlock
                    {
                     
                            newCompositeNode(grammarAccess.getFunctionBodyAccess().getFunctionTryBlockParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleFunctionTryBlock_in_ruleFunctionBody3519);
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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1231:1: entryRuleOperatorFunctionId returns [String current=null] : iv_ruleOperatorFunctionId= ruleOperatorFunctionId EOF ;
    public final String entryRuleOperatorFunctionId() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperatorFunctionId = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1232:2: (iv_ruleOperatorFunctionId= ruleOperatorFunctionId EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1233:2: iv_ruleOperatorFunctionId= ruleOperatorFunctionId EOF
            {
             newCompositeNode(grammarAccess.getOperatorFunctionIdRule()); 
            pushFollow(FOLLOW_ruleOperatorFunctionId_in_entryRuleOperatorFunctionId3565);
            iv_ruleOperatorFunctionId=ruleOperatorFunctionId();

            state._fsp--;

             current =iv_ruleOperatorFunctionId.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperatorFunctionId3576); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1240:1: ruleOperatorFunctionId returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'operator' this_OverloadableOperator_1= ruleOverloadableOperator (kw= '<' (this_ConstantExpression_3= ruleConstantExpression | this_TypeSpecifier_4= ruleTypeSpecifier | this_IdExpression_5= ruleIdExpression )* kw= '>' )? ) ;
    public final AntlrDatatypeRuleToken ruleOperatorFunctionId() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_OverloadableOperator_1 = null;

        AntlrDatatypeRuleToken this_ConstantExpression_3 = null;

        AntlrDatatypeRuleToken this_TypeSpecifier_4 = null;

        AntlrDatatypeRuleToken this_IdExpression_5 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1243:28: ( (kw= 'operator' this_OverloadableOperator_1= ruleOverloadableOperator (kw= '<' (this_ConstantExpression_3= ruleConstantExpression | this_TypeSpecifier_4= ruleTypeSpecifier | this_IdExpression_5= ruleIdExpression )* kw= '>' )? ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1244:1: (kw= 'operator' this_OverloadableOperator_1= ruleOverloadableOperator (kw= '<' (this_ConstantExpression_3= ruleConstantExpression | this_TypeSpecifier_4= ruleTypeSpecifier | this_IdExpression_5= ruleIdExpression )* kw= '>' )? )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1244:1: (kw= 'operator' this_OverloadableOperator_1= ruleOverloadableOperator (kw= '<' (this_ConstantExpression_3= ruleConstantExpression | this_TypeSpecifier_4= ruleTypeSpecifier | this_IdExpression_5= ruleIdExpression )* kw= '>' )? )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1245:2: kw= 'operator' this_OverloadableOperator_1= ruleOverloadableOperator (kw= '<' (this_ConstantExpression_3= ruleConstantExpression | this_TypeSpecifier_4= ruleTypeSpecifier | this_IdExpression_5= ruleIdExpression )* kw= '>' )?
            {
            kw=(Token)match(input,53,FOLLOW_53_in_ruleOperatorFunctionId3614); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getOperatorFunctionIdAccess().getOperatorKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getOperatorFunctionIdAccess().getOverloadableOperatorParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleOverloadableOperator_in_ruleOperatorFunctionId3636);
            this_OverloadableOperator_1=ruleOverloadableOperator();

            state._fsp--;


            		current.merge(this_OverloadableOperator_1);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1261:1: (kw= '<' (this_ConstantExpression_3= ruleConstantExpression | this_TypeSpecifier_4= ruleTypeSpecifier | this_IdExpression_5= ruleIdExpression )* kw= '>' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==54) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1262:2: kw= '<' (this_ConstantExpression_3= ruleConstantExpression | this_TypeSpecifier_4= ruleTypeSpecifier | this_IdExpression_5= ruleIdExpression )* kw= '>'
                    {
                    kw=(Token)match(input,54,FOLLOW_54_in_ruleOperatorFunctionId3655); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOperatorFunctionIdAccess().getLessThanSignKeyword_2_0()); 
                        
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1267:1: (this_ConstantExpression_3= ruleConstantExpression | this_TypeSpecifier_4= ruleTypeSpecifier | this_IdExpression_5= ruleIdExpression )*
                    loop36:
                    do {
                        int alt36=4;
                        switch ( input.LA(1) ) {
                        case 97:
                            {
                            alt36=1;
                            }
                            break;
                        case 103:
                            {
                            alt36=2;
                            }
                            break;
                        case 98:
                            {
                            alt36=3;
                            }
                            break;

                        }

                        switch (alt36) {
                    	case 1 :
                    	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1268:5: this_ConstantExpression_3= ruleConstantExpression
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getOperatorFunctionIdAccess().getConstantExpressionParserRuleCall_2_1_0()); 
                    	        
                    	    pushFollow(FOLLOW_ruleConstantExpression_in_ruleOperatorFunctionId3678);
                    	    this_ConstantExpression_3=ruleConstantExpression();

                    	    state._fsp--;


                    	    		current.merge(this_ConstantExpression_3);
                    	        
                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1280:5: this_TypeSpecifier_4= ruleTypeSpecifier
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getOperatorFunctionIdAccess().getTypeSpecifierParserRuleCall_2_1_1()); 
                    	        
                    	    pushFollow(FOLLOW_ruleTypeSpecifier_in_ruleOperatorFunctionId3711);
                    	    this_TypeSpecifier_4=ruleTypeSpecifier();

                    	    state._fsp--;


                    	    		current.merge(this_TypeSpecifier_4);
                    	        
                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;
                    	case 3 :
                    	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1292:5: this_IdExpression_5= ruleIdExpression
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getOperatorFunctionIdAccess().getIdExpressionParserRuleCall_2_1_2()); 
                    	        
                    	    pushFollow(FOLLOW_ruleIdExpression_in_ruleOperatorFunctionId3744);
                    	    this_IdExpression_5=ruleIdExpression();

                    	    state._fsp--;


                    	    		current.merge(this_IdExpression_5);
                    	        
                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    kw=(Token)match(input,55,FOLLOW_55_in_ruleOperatorFunctionId3764); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1316:1: entryRuleOverloadableOperator returns [String current=null] : iv_ruleOverloadableOperator= ruleOverloadableOperator EOF ;
    public final String entryRuleOverloadableOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOverloadableOperator = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1317:2: (iv_ruleOverloadableOperator= ruleOverloadableOperator EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1318:2: iv_ruleOverloadableOperator= ruleOverloadableOperator EOF
            {
             newCompositeNode(grammarAccess.getOverloadableOperatorRule()); 
            pushFollow(FOLLOW_ruleOverloadableOperator_in_entryRuleOverloadableOperator3807);
            iv_ruleOverloadableOperator=ruleOverloadableOperator();

            state._fsp--;

             current =iv_ruleOverloadableOperator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOverloadableOperator3818); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1325:1: ruleOverloadableOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'new' | kw= 'delete' | (kw= 'new' kw= '[' kw= ']' ) | (kw= 'delete' kw= '[' kw= ']' ) | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= '^' | kw= '&' | kw= '|' | kw= '~' | kw= '!' | kw= '=' | kw= '<' | kw= '>' | kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' | kw= '^=' | kw= '&=' | kw= '|=' | kw= '<<' | kw= '>>' | kw= '>>=' | kw= '<<=' | kw= '==' | kw= '!=' | kw= '<=' | kw= '>=' | kw= '&&' | kw= '||' | kw= '++' | kw= '--' | kw= ',' | kw= '->*' | kw= '->' | kw= '()' | kw= '[]' ) ;
    public final AntlrDatatypeRuleToken ruleOverloadableOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1328:28: ( (kw= 'new' | kw= 'delete' | (kw= 'new' kw= '[' kw= ']' ) | (kw= 'delete' kw= '[' kw= ']' ) | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= '^' | kw= '&' | kw= '|' | kw= '~' | kw= '!' | kw= '=' | kw= '<' | kw= '>' | kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' | kw= '^=' | kw= '&=' | kw= '|=' | kw= '<<' | kw= '>>' | kw= '>>=' | kw= '<<=' | kw= '==' | kw= '!=' | kw= '<=' | kw= '>=' | kw= '&&' | kw= '||' | kw= '++' | kw= '--' | kw= ',' | kw= '->*' | kw= '->' | kw= '()' | kw= '[]' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1329:1: (kw= 'new' | kw= 'delete' | (kw= 'new' kw= '[' kw= ']' ) | (kw= 'delete' kw= '[' kw= ']' ) | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= '^' | kw= '&' | kw= '|' | kw= '~' | kw= '!' | kw= '=' | kw= '<' | kw= '>' | kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' | kw= '^=' | kw= '&=' | kw= '|=' | kw= '<<' | kw= '>>' | kw= '>>=' | kw= '<<=' | kw= '==' | kw= '!=' | kw= '<=' | kw= '>=' | kw= '&&' | kw= '||' | kw= '++' | kw= '--' | kw= ',' | kw= '->*' | kw= '->' | kw= '()' | kw= '[]' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1329:1: (kw= 'new' | kw= 'delete' | (kw= 'new' kw= '[' kw= ']' ) | (kw= 'delete' kw= '[' kw= ']' ) | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= '^' | kw= '&' | kw= '|' | kw= '~' | kw= '!' | kw= '=' | kw= '<' | kw= '>' | kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' | kw= '^=' | kw= '&=' | kw= '|=' | kw= '<<' | kw= '>>' | kw= '>>=' | kw= '<<=' | kw= '==' | kw= '!=' | kw= '<=' | kw= '>=' | kw= '&&' | kw= '||' | kw= '++' | kw= '--' | kw= ',' | kw= '->*' | kw= '->' | kw= '()' | kw= '[]' )
            int alt38=42;
            alt38 = dfa38.predict(input);
            switch (alt38) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1330:2: kw= 'new'
                    {
                    kw=(Token)match(input,56,FOLLOW_56_in_ruleOverloadableOperator3856); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getNewKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1337:2: kw= 'delete'
                    {
                    kw=(Token)match(input,52,FOLLOW_52_in_ruleOverloadableOperator3875); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getDeleteKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1343:6: (kw= 'new' kw= '[' kw= ']' )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1343:6: (kw= 'new' kw= '[' kw= ']' )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1344:2: kw= 'new' kw= '[' kw= ']'
                    {
                    kw=(Token)match(input,56,FOLLOW_56_in_ruleOverloadableOperator3895); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getNewKeyword_2_0()); 
                        
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleOverloadableOperator3908); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getLeftSquareBracketKeyword_2_1()); 
                        
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleOverloadableOperator3921); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getRightSquareBracketKeyword_2_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1362:6: (kw= 'delete' kw= '[' kw= ']' )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1362:6: (kw= 'delete' kw= '[' kw= ']' )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1363:2: kw= 'delete' kw= '[' kw= ']'
                    {
                    kw=(Token)match(input,52,FOLLOW_52_in_ruleOverloadableOperator3942); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getDeleteKeyword_3_0()); 
                        
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleOverloadableOperator3955); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getLeftSquareBracketKeyword_3_1()); 
                        
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleOverloadableOperator3968); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getRightSquareBracketKeyword_3_2()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1382:2: kw= '+'
                    {
                    kw=(Token)match(input,57,FOLLOW_57_in_ruleOverloadableOperator3988); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getPlusSignKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1389:2: kw= '-'
                    {
                    kw=(Token)match(input,58,FOLLOW_58_in_ruleOverloadableOperator4007); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getHyphenMinusKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1396:2: kw= '*'
                    {
                    kw=(Token)match(input,59,FOLLOW_59_in_ruleOverloadableOperator4026); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getAsteriskKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1403:2: kw= '/'
                    {
                    kw=(Token)match(input,60,FOLLOW_60_in_ruleOverloadableOperator4045); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getSolidusKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1410:2: kw= '%'
                    {
                    kw=(Token)match(input,61,FOLLOW_61_in_ruleOverloadableOperator4064); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getPercentSignKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1417:2: kw= '^'
                    {
                    kw=(Token)match(input,62,FOLLOW_62_in_ruleOverloadableOperator4083); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getCircumflexAccentKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1424:2: kw= '&'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleOverloadableOperator4102); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getAmpersandKeyword_10()); 
                        

                    }
                    break;
                case 12 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1431:2: kw= '|'
                    {
                    kw=(Token)match(input,63,FOLLOW_63_in_ruleOverloadableOperator4121); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getVerticalLineKeyword_11()); 
                        

                    }
                    break;
                case 13 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1438:2: kw= '~'
                    {
                    kw=(Token)match(input,64,FOLLOW_64_in_ruleOverloadableOperator4140); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getTildeKeyword_12()); 
                        

                    }
                    break;
                case 14 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1445:2: kw= '!'
                    {
                    kw=(Token)match(input,65,FOLLOW_65_in_ruleOverloadableOperator4159); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getExclamationMarkKeyword_13()); 
                        

                    }
                    break;
                case 15 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1452:2: kw= '='
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleOverloadableOperator4178); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getEqualsSignKeyword_14()); 
                        

                    }
                    break;
                case 16 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1459:2: kw= '<'
                    {
                    kw=(Token)match(input,54,FOLLOW_54_in_ruleOverloadableOperator4197); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getLessThanSignKeyword_15()); 
                        

                    }
                    break;
                case 17 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1466:2: kw= '>'
                    {
                    kw=(Token)match(input,55,FOLLOW_55_in_ruleOverloadableOperator4216); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getGreaterThanSignKeyword_16()); 
                        

                    }
                    break;
                case 18 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1473:2: kw= '+='
                    {
                    kw=(Token)match(input,66,FOLLOW_66_in_ruleOverloadableOperator4235); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getPlusSignEqualsSignKeyword_17()); 
                        

                    }
                    break;
                case 19 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1480:2: kw= '-='
                    {
                    kw=(Token)match(input,67,FOLLOW_67_in_ruleOverloadableOperator4254); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getHyphenMinusEqualsSignKeyword_18()); 
                        

                    }
                    break;
                case 20 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1487:2: kw= '*='
                    {
                    kw=(Token)match(input,68,FOLLOW_68_in_ruleOverloadableOperator4273); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getAsteriskEqualsSignKeyword_19()); 
                        

                    }
                    break;
                case 21 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1494:2: kw= '/='
                    {
                    kw=(Token)match(input,69,FOLLOW_69_in_ruleOverloadableOperator4292); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getSolidusEqualsSignKeyword_20()); 
                        

                    }
                    break;
                case 22 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1501:2: kw= '%='
                    {
                    kw=(Token)match(input,70,FOLLOW_70_in_ruleOverloadableOperator4311); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getPercentSignEqualsSignKeyword_21()); 
                        

                    }
                    break;
                case 23 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1508:2: kw= '^='
                    {
                    kw=(Token)match(input,71,FOLLOW_71_in_ruleOverloadableOperator4330); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getCircumflexAccentEqualsSignKeyword_22()); 
                        

                    }
                    break;
                case 24 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1515:2: kw= '&='
                    {
                    kw=(Token)match(input,72,FOLLOW_72_in_ruleOverloadableOperator4349); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getAmpersandEqualsSignKeyword_23()); 
                        

                    }
                    break;
                case 25 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1522:2: kw= '|='
                    {
                    kw=(Token)match(input,73,FOLLOW_73_in_ruleOverloadableOperator4368); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getVerticalLineEqualsSignKeyword_24()); 
                        

                    }
                    break;
                case 26 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1529:2: kw= '<<'
                    {
                    kw=(Token)match(input,74,FOLLOW_74_in_ruleOverloadableOperator4387); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getLessThanSignLessThanSignKeyword_25()); 
                        

                    }
                    break;
                case 27 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1536:2: kw= '>>'
                    {
                    kw=(Token)match(input,75,FOLLOW_75_in_ruleOverloadableOperator4406); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getGreaterThanSignGreaterThanSignKeyword_26()); 
                        

                    }
                    break;
                case 28 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1543:2: kw= '>>='
                    {
                    kw=(Token)match(input,76,FOLLOW_76_in_ruleOverloadableOperator4425); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getGreaterThanSignGreaterThanSignEqualsSignKeyword_27()); 
                        

                    }
                    break;
                case 29 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1550:2: kw= '<<='
                    {
                    kw=(Token)match(input,77,FOLLOW_77_in_ruleOverloadableOperator4444); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getLessThanSignLessThanSignEqualsSignKeyword_28()); 
                        

                    }
                    break;
                case 30 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1557:2: kw= '=='
                    {
                    kw=(Token)match(input,78,FOLLOW_78_in_ruleOverloadableOperator4463); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getEqualsSignEqualsSignKeyword_29()); 
                        

                    }
                    break;
                case 31 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1564:2: kw= '!='
                    {
                    kw=(Token)match(input,79,FOLLOW_79_in_ruleOverloadableOperator4482); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getExclamationMarkEqualsSignKeyword_30()); 
                        

                    }
                    break;
                case 32 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1571:2: kw= '<='
                    {
                    kw=(Token)match(input,80,FOLLOW_80_in_ruleOverloadableOperator4501); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getLessThanSignEqualsSignKeyword_31()); 
                        

                    }
                    break;
                case 33 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1578:2: kw= '>='
                    {
                    kw=(Token)match(input,81,FOLLOW_81_in_ruleOverloadableOperator4520); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getGreaterThanSignEqualsSignKeyword_32()); 
                        

                    }
                    break;
                case 34 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1585:2: kw= '&&'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleOverloadableOperator4539); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getAmpersandAmpersandKeyword_33()); 
                        

                    }
                    break;
                case 35 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1592:2: kw= '||'
                    {
                    kw=(Token)match(input,82,FOLLOW_82_in_ruleOverloadableOperator4558); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getVerticalLineVerticalLineKeyword_34()); 
                        

                    }
                    break;
                case 36 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1599:2: kw= '++'
                    {
                    kw=(Token)match(input,83,FOLLOW_83_in_ruleOverloadableOperator4577); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getPlusSignPlusSignKeyword_35()); 
                        

                    }
                    break;
                case 37 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1606:2: kw= '--'
                    {
                    kw=(Token)match(input,84,FOLLOW_84_in_ruleOverloadableOperator4596); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getHyphenMinusHyphenMinusKeyword_36()); 
                        

                    }
                    break;
                case 38 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1613:2: kw= ','
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleOverloadableOperator4615); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getCommaKeyword_37()); 
                        

                    }
                    break;
                case 39 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1620:2: kw= '->*'
                    {
                    kw=(Token)match(input,85,FOLLOW_85_in_ruleOverloadableOperator4634); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getHyphenMinusGreaterThanSignAsteriskKeyword_38()); 
                        

                    }
                    break;
                case 40 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1627:2: kw= '->'
                    {
                    kw=(Token)match(input,86,FOLLOW_86_in_ruleOverloadableOperator4653); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getHyphenMinusGreaterThanSignKeyword_39()); 
                        

                    }
                    break;
                case 41 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1634:2: kw= '()'
                    {
                    kw=(Token)match(input,87,FOLLOW_87_in_ruleOverloadableOperator4672); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getLeftParenthesisRightParenthesisKeyword_40()); 
                        

                    }
                    break;
                case 42 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1641:2: kw= '[]'
                    {
                    kw=(Token)match(input,88,FOLLOW_88_in_ruleOverloadableOperator4691); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1654:1: entryRuleLiteralOperatorId returns [String current=null] : iv_ruleLiteralOperatorId= ruleLiteralOperatorId EOF ;
    public final String entryRuleLiteralOperatorId() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteralOperatorId = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1655:2: (iv_ruleLiteralOperatorId= ruleLiteralOperatorId EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1656:2: iv_ruleLiteralOperatorId= ruleLiteralOperatorId EOF
            {
             newCompositeNode(grammarAccess.getLiteralOperatorIdRule()); 
            pushFollow(FOLLOW_ruleLiteralOperatorId_in_entryRuleLiteralOperatorId4732);
            iv_ruleLiteralOperatorId=ruleLiteralOperatorId();

            state._fsp--;

             current =iv_ruleLiteralOperatorId.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralOperatorId4743); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1663:1: ruleLiteralOperatorId returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'operator' kw= '\"' kw= '\"' ) ;
    public final AntlrDatatypeRuleToken ruleLiteralOperatorId() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1666:28: ( (kw= 'operator' kw= '\"' kw= '\"' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1667:1: (kw= 'operator' kw= '\"' kw= '\"' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1667:1: (kw= 'operator' kw= '\"' kw= '\"' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1668:2: kw= 'operator' kw= '\"' kw= '\"'
            {
            kw=(Token)match(input,53,FOLLOW_53_in_ruleLiteralOperatorId4781); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getLiteralOperatorIdAccess().getOperatorKeyword_0()); 
                
            kw=(Token)match(input,89,FOLLOW_89_in_ruleLiteralOperatorId4794); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getLiteralOperatorIdAccess().getQuotationMarkKeyword_1()); 
                
            kw=(Token)match(input,89,FOLLOW_89_in_ruleLiteralOperatorId4807); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1693:1: entryRuleTemplateDeclaration returns [String current=null] : iv_ruleTemplateDeclaration= ruleTemplateDeclaration EOF ;
    public final String entryRuleTemplateDeclaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTemplateDeclaration = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1694:2: (iv_ruleTemplateDeclaration= ruleTemplateDeclaration EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1695:2: iv_ruleTemplateDeclaration= ruleTemplateDeclaration EOF
            {
             newCompositeNode(grammarAccess.getTemplateDeclarationRule()); 
            pushFollow(FOLLOW_ruleTemplateDeclaration_in_entryRuleTemplateDeclaration4848);
            iv_ruleTemplateDeclaration=ruleTemplateDeclaration();

            state._fsp--;

             current =iv_ruleTemplateDeclaration.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateDeclaration4859); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1702:1: ruleTemplateDeclaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'template' kw= '<' this_TemplateParameterList_2= ruleTemplateParameterList kw= '>' ) ;
    public final AntlrDatatypeRuleToken ruleTemplateDeclaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_TemplateParameterList_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1705:28: ( (kw= 'template' kw= '<' this_TemplateParameterList_2= ruleTemplateParameterList kw= '>' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1706:1: (kw= 'template' kw= '<' this_TemplateParameterList_2= ruleTemplateParameterList kw= '>' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1706:1: (kw= 'template' kw= '<' this_TemplateParameterList_2= ruleTemplateParameterList kw= '>' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1707:2: kw= 'template' kw= '<' this_TemplateParameterList_2= ruleTemplateParameterList kw= '>'
            {
            kw=(Token)match(input,90,FOLLOW_90_in_ruleTemplateDeclaration4897); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getTemplateDeclarationAccess().getTemplateKeyword_0()); 
                
            kw=(Token)match(input,54,FOLLOW_54_in_ruleTemplateDeclaration4910); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getTemplateDeclarationAccess().getLessThanSignKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getTemplateDeclarationAccess().getTemplateParameterListParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleTemplateParameterList_in_ruleTemplateDeclaration4932);
            this_TemplateParameterList_2=ruleTemplateParameterList();

            state._fsp--;


            		current.merge(this_TemplateParameterList_2);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,55,FOLLOW_55_in_ruleTemplateDeclaration4950); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1743:1: entryRuleTemplateParameterList returns [String current=null] : iv_ruleTemplateParameterList= ruleTemplateParameterList EOF ;
    public final String entryRuleTemplateParameterList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTemplateParameterList = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1744:2: (iv_ruleTemplateParameterList= ruleTemplateParameterList EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1745:2: iv_ruleTemplateParameterList= ruleTemplateParameterList EOF
            {
             newCompositeNode(grammarAccess.getTemplateParameterListRule()); 
            pushFollow(FOLLOW_ruleTemplateParameterList_in_entryRuleTemplateParameterList4991);
            iv_ruleTemplateParameterList=ruleTemplateParameterList();

            state._fsp--;

             current =iv_ruleTemplateParameterList.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateParameterList5002); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1752:1: ruleTemplateParameterList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TemplateParameter_0= ruleTemplateParameter (kw= ',' this_TemplateParameter_2= ruleTemplateParameter )* ) ;
    public final AntlrDatatypeRuleToken ruleTemplateParameterList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_TemplateParameter_0 = null;

        AntlrDatatypeRuleToken this_TemplateParameter_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1755:28: ( (this_TemplateParameter_0= ruleTemplateParameter (kw= ',' this_TemplateParameter_2= ruleTemplateParameter )* ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1756:1: (this_TemplateParameter_0= ruleTemplateParameter (kw= ',' this_TemplateParameter_2= ruleTemplateParameter )* )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1756:1: (this_TemplateParameter_0= ruleTemplateParameter (kw= ',' this_TemplateParameter_2= ruleTemplateParameter )* )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1757:5: this_TemplateParameter_0= ruleTemplateParameter (kw= ',' this_TemplateParameter_2= ruleTemplateParameter )*
            {
             
                    newCompositeNode(grammarAccess.getTemplateParameterListAccess().getTemplateParameterParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleTemplateParameter_in_ruleTemplateParameterList5049);
            this_TemplateParameter_0=ruleTemplateParameter();

            state._fsp--;


            		current.merge(this_TemplateParameter_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1767:1: (kw= ',' this_TemplateParameter_2= ruleTemplateParameter )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==42) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1768:2: kw= ',' this_TemplateParameter_2= ruleTemplateParameter
            	    {
            	    kw=(Token)match(input,42,FOLLOW_42_in_ruleTemplateParameterList5068); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getTemplateParameterListAccess().getCommaKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getTemplateParameterListAccess().getTemplateParameterParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_ruleTemplateParameter_in_ruleTemplateParameterList5090);
            	    this_TemplateParameter_2=ruleTemplateParameter();

            	    state._fsp--;


            	    		current.merge(this_TemplateParameter_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop39;
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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1792:1: entryRuleTemplateParameter returns [String current=null] : iv_ruleTemplateParameter= ruleTemplateParameter EOF ;
    public final String entryRuleTemplateParameter() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTemplateParameter = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1793:2: (iv_ruleTemplateParameter= ruleTemplateParameter EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1794:2: iv_ruleTemplateParameter= ruleTemplateParameter EOF
            {
             newCompositeNode(grammarAccess.getTemplateParameterRule()); 
            pushFollow(FOLLOW_ruleTemplateParameter_in_entryRuleTemplateParameter5138);
            iv_ruleTemplateParameter=ruleTemplateParameter();

            state._fsp--;

             current =iv_ruleTemplateParameter.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateParameter5149); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1801:1: ruleTemplateParameter returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TypeParameter_0= ruleTypeParameter | this_ParameterDeclaration_1= ruleParameterDeclaration ) ;
    public final AntlrDatatypeRuleToken ruleTemplateParameter() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_TypeParameter_0 = null;

        AntlrDatatypeRuleToken this_ParameterDeclaration_1 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1804:28: ( (this_TypeParameter_0= ruleTypeParameter | this_ParameterDeclaration_1= ruleParameterDeclaration ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1805:1: (this_TypeParameter_0= ruleTypeParameter | this_ParameterDeclaration_1= ruleParameterDeclaration )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1805:1: (this_TypeParameter_0= ruleTypeParameter | this_ParameterDeclaration_1= ruleParameterDeclaration )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=91 && LA40_0<=92)) ) {
                alt40=1;
            }
            else if ( (LA40_0==39||LA40_0==99) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1806:5: this_TypeParameter_0= ruleTypeParameter
                    {
                     
                            newCompositeNode(grammarAccess.getTemplateParameterAccess().getTypeParameterParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleTypeParameter_in_ruleTemplateParameter5196);
                    this_TypeParameter_0=ruleTypeParameter();

                    state._fsp--;


                    		current.merge(this_TypeParameter_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1818:5: this_ParameterDeclaration_1= ruleParameterDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getTemplateParameterAccess().getParameterDeclarationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleParameterDeclaration_in_ruleTemplateParameter5229);
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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1836:1: entryRuleTypeParameter returns [String current=null] : iv_ruleTypeParameter= ruleTypeParameter EOF ;
    public final String entryRuleTypeParameter() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeParameter = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1837:2: (iv_ruleTypeParameter= ruleTypeParameter EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1838:2: iv_ruleTypeParameter= ruleTypeParameter EOF
            {
             newCompositeNode(grammarAccess.getTypeParameterRule()); 
            pushFollow(FOLLOW_ruleTypeParameter_in_entryRuleTypeParameter5275);
            iv_ruleTypeParameter=ruleTypeParameter();

            state._fsp--;

             current =iv_ruleTypeParameter.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeParameter5286); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1845:1: ruleTypeParameter returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'class' | kw= 'typename' ) ( ( (kw= '...' )? (this_ID_3= RULE_ID )? ) | ( (this_ID_4= RULE_ID )? kw= '=' this_TypeId_6= ruleTypeId ) ) ) ;
    public final AntlrDatatypeRuleToken ruleTypeParameter() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_3=null;
        Token this_ID_4=null;
        AntlrDatatypeRuleToken this_TypeId_6 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1848:28: ( ( (kw= 'class' | kw= 'typename' ) ( ( (kw= '...' )? (this_ID_3= RULE_ID )? ) | ( (this_ID_4= RULE_ID )? kw= '=' this_TypeId_6= ruleTypeId ) ) ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1849:1: ( (kw= 'class' | kw= 'typename' ) ( ( (kw= '...' )? (this_ID_3= RULE_ID )? ) | ( (this_ID_4= RULE_ID )? kw= '=' this_TypeId_6= ruleTypeId ) ) )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1849:1: ( (kw= 'class' | kw= 'typename' ) ( ( (kw= '...' )? (this_ID_3= RULE_ID )? ) | ( (this_ID_4= RULE_ID )? kw= '=' this_TypeId_6= ruleTypeId ) ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1849:2: (kw= 'class' | kw= 'typename' ) ( ( (kw= '...' )? (this_ID_3= RULE_ID )? ) | ( (this_ID_4= RULE_ID )? kw= '=' this_TypeId_6= ruleTypeId ) )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1849:2: (kw= 'class' | kw= 'typename' )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==91) ) {
                alt41=1;
            }
            else if ( (LA41_0==92) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1850:2: kw= 'class'
                    {
                    kw=(Token)match(input,91,FOLLOW_91_in_ruleTypeParameter5325); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeParameterAccess().getClassKeyword_0_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1857:2: kw= 'typename'
                    {
                    kw=(Token)match(input,92,FOLLOW_92_in_ruleTypeParameter5344); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeParameterAccess().getTypenameKeyword_0_1()); 
                        

                    }
                    break;

            }

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1862:2: ( ( (kw= '...' )? (this_ID_3= RULE_ID )? ) | ( (this_ID_4= RULE_ID )? kw= '=' this_TypeId_6= ruleTypeId ) )
            int alt45=2;
            switch ( input.LA(1) ) {
            case EOF:
            case 41:
            case 42:
            case 55:
                {
                alt45=1;
                }
                break;
            case RULE_ID:
                {
                int LA45_2 = input.LA(2);

                if ( (LA45_2==49) ) {
                    alt45=2;
                }
                else if ( (LA45_2==EOF||LA45_2==42||LA45_2==55) ) {
                    alt45=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 2, input);

                    throw nvae;
                }
                }
                break;
            case 49:
                {
                alt45=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1862:3: ( (kw= '...' )? (this_ID_3= RULE_ID )? )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1862:3: ( (kw= '...' )? (this_ID_3= RULE_ID )? )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1862:4: (kw= '...' )? (this_ID_3= RULE_ID )?
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1862:4: (kw= '...' )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==41) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1863:2: kw= '...'
                            {
                            kw=(Token)match(input,41,FOLLOW_41_in_ruleTypeParameter5361); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getTypeParameterAccess().getFullStopFullStopFullStopKeyword_1_0_0()); 
                                

                            }
                            break;

                    }

                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1868:3: (this_ID_3= RULE_ID )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==RULE_ID) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1868:8: this_ID_3= RULE_ID
                            {
                            this_ID_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeParameter5379); 

                            		current.merge(this_ID_3);
                                
                             
                                newLeafNode(this_ID_3, grammarAccess.getTypeParameterAccess().getIDTerminalRuleCall_1_0_1()); 
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1876:6: ( (this_ID_4= RULE_ID )? kw= '=' this_TypeId_6= ruleTypeId )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1876:6: ( (this_ID_4= RULE_ID )? kw= '=' this_TypeId_6= ruleTypeId )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1876:7: (this_ID_4= RULE_ID )? kw= '=' this_TypeId_6= ruleTypeId
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1876:7: (this_ID_4= RULE_ID )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==RULE_ID) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1876:12: this_ID_4= RULE_ID
                            {
                            this_ID_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeParameter5410); 

                            		current.merge(this_ID_4);
                                
                             
                                newLeafNode(this_ID_4, grammarAccess.getTypeParameterAccess().getIDTerminalRuleCall_1_1_0()); 
                                

                            }
                            break;

                    }

                    kw=(Token)match(input,49,FOLLOW_49_in_ruleTypeParameter5430); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeParameterAccess().getEqualsSignKeyword_1_1_1()); 
                        
                     
                            newCompositeNode(grammarAccess.getTypeParameterAccess().getTypeIdParserRuleCall_1_1_2()); 
                        
                    pushFollow(FOLLOW_ruleTypeId_in_ruleTypeParameter5452);
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


    // $ANTLR start "entryRuleTemplateArgumentList"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1910:1: entryRuleTemplateArgumentList returns [String current=null] : iv_ruleTemplateArgumentList= ruleTemplateArgumentList EOF ;
    public final String entryRuleTemplateArgumentList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTemplateArgumentList = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1911:2: (iv_ruleTemplateArgumentList= ruleTemplateArgumentList EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1912:2: iv_ruleTemplateArgumentList= ruleTemplateArgumentList EOF
            {
             newCompositeNode(grammarAccess.getTemplateArgumentListRule()); 
            pushFollow(FOLLOW_ruleTemplateArgumentList_in_entryRuleTemplateArgumentList5502);
            iv_ruleTemplateArgumentList=ruleTemplateArgumentList();

            state._fsp--;

             current =iv_ruleTemplateArgumentList.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateArgumentList5513); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1919:1: ruleTemplateArgumentList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TemplateArgument_0= ruleTemplateArgument (kw= '...' )? (kw= ',' this_TemplateArgument_3= ruleTemplateArgument (kw= '...' )? )* ) ;
    public final AntlrDatatypeRuleToken ruleTemplateArgumentList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_TemplateArgument_0 = null;

        AntlrDatatypeRuleToken this_TemplateArgument_3 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1922:28: ( (this_TemplateArgument_0= ruleTemplateArgument (kw= '...' )? (kw= ',' this_TemplateArgument_3= ruleTemplateArgument (kw= '...' )? )* ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1923:1: (this_TemplateArgument_0= ruleTemplateArgument (kw= '...' )? (kw= ',' this_TemplateArgument_3= ruleTemplateArgument (kw= '...' )? )* )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1923:1: (this_TemplateArgument_0= ruleTemplateArgument (kw= '...' )? (kw= ',' this_TemplateArgument_3= ruleTemplateArgument (kw= '...' )? )* )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1924:5: this_TemplateArgument_0= ruleTemplateArgument (kw= '...' )? (kw= ',' this_TemplateArgument_3= ruleTemplateArgument (kw= '...' )? )*
            {
             
                    newCompositeNode(grammarAccess.getTemplateArgumentListAccess().getTemplateArgumentParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleTemplateArgument_in_ruleTemplateArgumentList5560);
            this_TemplateArgument_0=ruleTemplateArgument();

            state._fsp--;


            		current.merge(this_TemplateArgument_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1934:1: (kw= '...' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==41) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1935:2: kw= '...'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleTemplateArgumentList5579); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTemplateArgumentListAccess().getFullStopFullStopFullStopKeyword_1()); 
                        

                    }
                    break;

            }

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1940:3: (kw= ',' this_TemplateArgument_3= ruleTemplateArgument (kw= '...' )? )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==42) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1941:2: kw= ',' this_TemplateArgument_3= ruleTemplateArgument (kw= '...' )?
            	    {
            	    kw=(Token)match(input,42,FOLLOW_42_in_ruleTemplateArgumentList5595); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getTemplateArgumentListAccess().getCommaKeyword_2_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getTemplateArgumentListAccess().getTemplateArgumentParserRuleCall_2_1()); 
            	        
            	    pushFollow(FOLLOW_ruleTemplateArgument_in_ruleTemplateArgumentList5617);
            	    this_TemplateArgument_3=ruleTemplateArgument();

            	    state._fsp--;


            	    		current.merge(this_TemplateArgument_3);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1957:1: (kw= '...' )?
            	    int alt47=2;
            	    int LA47_0 = input.LA(1);

            	    if ( (LA47_0==41) ) {
            	        alt47=1;
            	    }
            	    switch (alt47) {
            	        case 1 :
            	            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1958:2: kw= '...'
            	            {
            	            kw=(Token)match(input,41,FOLLOW_41_in_ruleTemplateArgumentList5636); 

            	                    current.merge(kw);
            	                    newLeafNode(kw, grammarAccess.getTemplateArgumentListAccess().getFullStopFullStopFullStopKeyword_2_2()); 
            	                

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop48;
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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1971:1: entryRuleTemplateArgument returns [String current=null] : iv_ruleTemplateArgument= ruleTemplateArgument EOF ;
    public final String entryRuleTemplateArgument() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTemplateArgument = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1972:2: (iv_ruleTemplateArgument= ruleTemplateArgument EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1973:2: iv_ruleTemplateArgument= ruleTemplateArgument EOF
            {
             newCompositeNode(grammarAccess.getTemplateArgumentRule()); 
            pushFollow(FOLLOW_ruleTemplateArgument_in_entryRuleTemplateArgument5681);
            iv_ruleTemplateArgument=ruleTemplateArgument();

            state._fsp--;

             current =iv_ruleTemplateArgument.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateArgument5692); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1980:1: ruleTemplateArgument returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ConstantExpression_0= ruleConstantExpression | this_TypeId_1= ruleTypeId | this_IdExpression_2= ruleIdExpression ) ;
    public final AntlrDatatypeRuleToken ruleTemplateArgument() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_ConstantExpression_0 = null;

        AntlrDatatypeRuleToken this_TypeId_1 = null;

        AntlrDatatypeRuleToken this_IdExpression_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1983:28: ( (this_ConstantExpression_0= ruleConstantExpression | this_TypeId_1= ruleTypeId | this_IdExpression_2= ruleIdExpression ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1984:1: (this_ConstantExpression_0= ruleConstantExpression | this_TypeId_1= ruleTypeId | this_IdExpression_2= ruleIdExpression )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1984:1: (this_ConstantExpression_0= ruleConstantExpression | this_TypeId_1= ruleTypeId | this_IdExpression_2= ruleIdExpression )
            int alt49=3;
            switch ( input.LA(1) ) {
            case 97:
                {
                alt49=1;
                }
                break;
            case 103:
                {
                alt49=2;
                }
                break;
            case 98:
                {
                alt49=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1985:5: this_ConstantExpression_0= ruleConstantExpression
                    {
                     
                            newCompositeNode(grammarAccess.getTemplateArgumentAccess().getConstantExpressionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleConstantExpression_in_ruleTemplateArgument5739);
                    this_ConstantExpression_0=ruleConstantExpression();

                    state._fsp--;


                    		current.merge(this_ConstantExpression_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1997:5: this_TypeId_1= ruleTypeId
                    {
                     
                            newCompositeNode(grammarAccess.getTemplateArgumentAccess().getTypeIdParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleTypeId_in_ruleTemplateArgument5772);
                    this_TypeId_1=ruleTypeId();

                    state._fsp--;


                    		current.merge(this_TypeId_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2009:5: this_IdExpression_2= ruleIdExpression
                    {
                     
                            newCompositeNode(grammarAccess.getTemplateArgumentAccess().getIdExpressionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleIdExpression_in_ruleTemplateArgument5805);
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


    // $ANTLR start "entryRuleFunctionTryBlock"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2031:1: entryRuleFunctionTryBlock returns [String current=null] : iv_ruleFunctionTryBlock= ruleFunctionTryBlock EOF ;
    public final String entryRuleFunctionTryBlock() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunctionTryBlock = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2032:2: (iv_ruleFunctionTryBlock= ruleFunctionTryBlock EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2033:2: iv_ruleFunctionTryBlock= ruleFunctionTryBlock EOF
            {
             newCompositeNode(grammarAccess.getFunctionTryBlockRule()); 
            pushFollow(FOLLOW_ruleFunctionTryBlock_in_entryRuleFunctionTryBlock5855);
            iv_ruleFunctionTryBlock=ruleFunctionTryBlock();

            state._fsp--;

             current =iv_ruleFunctionTryBlock.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionTryBlock5866); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2040:1: ruleFunctionTryBlock returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'try' (this_CtorInitializer_1= ruleCtorInitializer )? this_CompoundStatement_2= ruleCompoundStatement (this_Handler_3= ruleHandler )+ ) ;
    public final AntlrDatatypeRuleToken ruleFunctionTryBlock() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_CtorInitializer_1 = null;

        AntlrDatatypeRuleToken this_CompoundStatement_2 = null;

        AntlrDatatypeRuleToken this_Handler_3 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2043:28: ( (kw= 'try' (this_CtorInitializer_1= ruleCtorInitializer )? this_CompoundStatement_2= ruleCompoundStatement (this_Handler_3= ruleHandler )+ ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2044:1: (kw= 'try' (this_CtorInitializer_1= ruleCtorInitializer )? this_CompoundStatement_2= ruleCompoundStatement (this_Handler_3= ruleHandler )+ )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2044:1: (kw= 'try' (this_CtorInitializer_1= ruleCtorInitializer )? this_CompoundStatement_2= ruleCompoundStatement (this_Handler_3= ruleHandler )+ )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2045:2: kw= 'try' (this_CtorInitializer_1= ruleCtorInitializer )? this_CompoundStatement_2= ruleCompoundStatement (this_Handler_3= ruleHandler )+
            {
            kw=(Token)match(input,93,FOLLOW_93_in_ruleFunctionTryBlock5904); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getFunctionTryBlockAccess().getTryKeyword_0()); 
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2050:1: (this_CtorInitializer_1= ruleCtorInitializer )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==105) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2051:5: this_CtorInitializer_1= ruleCtorInitializer
                    {
                     
                            newCompositeNode(grammarAccess.getFunctionTryBlockAccess().getCtorInitializerParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleCtorInitializer_in_ruleFunctionTryBlock5927);
                    this_CtorInitializer_1=ruleCtorInitializer();

                    state._fsp--;


                    		current.merge(this_CtorInitializer_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getFunctionTryBlockAccess().getCompoundStatementParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleCompoundStatement_in_ruleFunctionTryBlock5956);
            this_CompoundStatement_2=ruleCompoundStatement();

            state._fsp--;


            		current.merge(this_CompoundStatement_2);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2072:1: (this_Handler_3= ruleHandler )+
            int cnt51=0;
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==94) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2073:5: this_Handler_3= ruleHandler
            	    {
            	     
            	            newCompositeNode(grammarAccess.getFunctionTryBlockAccess().getHandlerParserRuleCall_3()); 
            	        
            	    pushFollow(FOLLOW_ruleHandler_in_ruleFunctionTryBlock5984);
            	    this_Handler_3=ruleHandler();

            	    state._fsp--;


            	    		current.merge(this_Handler_3);
            	        
            	     
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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2091:1: entryRuleHandler returns [String current=null] : iv_ruleHandler= ruleHandler EOF ;
    public final String entryRuleHandler() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleHandler = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2092:2: (iv_ruleHandler= ruleHandler EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2093:2: iv_ruleHandler= ruleHandler EOF
            {
             newCompositeNode(grammarAccess.getHandlerRule()); 
            pushFollow(FOLLOW_ruleHandler_in_entryRuleHandler6032);
            iv_ruleHandler=ruleHandler();

            state._fsp--;

             current =iv_ruleHandler.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHandler6043); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2100:1: ruleHandler returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'catch' kw= '(' this_ExceptionDeclaration_2= ruleExceptionDeclaration kw= ')' this_CompoundStatement_4= ruleCompoundStatement ) ;
    public final AntlrDatatypeRuleToken ruleHandler() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ExceptionDeclaration_2 = null;

        AntlrDatatypeRuleToken this_CompoundStatement_4 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2103:28: ( (kw= 'catch' kw= '(' this_ExceptionDeclaration_2= ruleExceptionDeclaration kw= ')' this_CompoundStatement_4= ruleCompoundStatement ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2104:1: (kw= 'catch' kw= '(' this_ExceptionDeclaration_2= ruleExceptionDeclaration kw= ')' this_CompoundStatement_4= ruleCompoundStatement )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2104:1: (kw= 'catch' kw= '(' this_ExceptionDeclaration_2= ruleExceptionDeclaration kw= ')' this_CompoundStatement_4= ruleCompoundStatement )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2105:2: kw= 'catch' kw= '(' this_ExceptionDeclaration_2= ruleExceptionDeclaration kw= ')' this_CompoundStatement_4= ruleCompoundStatement
            {
            kw=(Token)match(input,94,FOLLOW_94_in_ruleHandler6081); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getHandlerAccess().getCatchKeyword_0()); 
                
            kw=(Token)match(input,43,FOLLOW_43_in_ruleHandler6094); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getHandlerAccess().getLeftParenthesisKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getHandlerAccess().getExceptionDeclarationParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleExceptionDeclaration_in_ruleHandler6116);
            this_ExceptionDeclaration_2=ruleExceptionDeclaration();

            state._fsp--;


            		current.merge(this_ExceptionDeclaration_2);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,44,FOLLOW_44_in_ruleHandler6134); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getHandlerAccess().getRightParenthesisKeyword_3()); 
                
             
                    newCompositeNode(grammarAccess.getHandlerAccess().getCompoundStatementParserRuleCall_4()); 
                
            pushFollow(FOLLOW_ruleCompoundStatement_in_ruleHandler6156);
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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2152:1: entryRuleExceptionDeclaration returns [String current=null] : iv_ruleExceptionDeclaration= ruleExceptionDeclaration EOF ;
    public final String entryRuleExceptionDeclaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExceptionDeclaration = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2153:2: (iv_ruleExceptionDeclaration= ruleExceptionDeclaration EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2154:2: iv_ruleExceptionDeclaration= ruleExceptionDeclaration EOF
            {
             newCompositeNode(grammarAccess.getExceptionDeclarationRule()); 
            pushFollow(FOLLOW_ruleExceptionDeclaration_in_entryRuleExceptionDeclaration6202);
            iv_ruleExceptionDeclaration=ruleExceptionDeclaration();

            state._fsp--;

             current =iv_ruleExceptionDeclaration.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExceptionDeclaration6213); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2161:1: ruleExceptionDeclaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_AttributeSpecifier_0= ruleAttributeSpecifier )* (this_TypeSpecifier_1= ruleTypeSpecifier )+ (this_Declarator_2= ruleDeclarator )? ) | kw= '...' ) ;
    public final AntlrDatatypeRuleToken ruleExceptionDeclaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_AttributeSpecifier_0 = null;

        AntlrDatatypeRuleToken this_TypeSpecifier_1 = null;

        AntlrDatatypeRuleToken this_Declarator_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2164:28: ( ( ( (this_AttributeSpecifier_0= ruleAttributeSpecifier )* (this_TypeSpecifier_1= ruleTypeSpecifier )+ (this_Declarator_2= ruleDeclarator )? ) | kw= '...' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2165:1: ( ( (this_AttributeSpecifier_0= ruleAttributeSpecifier )* (this_TypeSpecifier_1= ruleTypeSpecifier )+ (this_Declarator_2= ruleDeclarator )? ) | kw= '...' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2165:1: ( ( (this_AttributeSpecifier_0= ruleAttributeSpecifier )* (this_TypeSpecifier_1= ruleTypeSpecifier )+ (this_Declarator_2= ruleDeclarator )? ) | kw= '...' )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==39||LA55_0==103) ) {
                alt55=1;
            }
            else if ( (LA55_0==41) ) {
                alt55=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2165:2: ( (this_AttributeSpecifier_0= ruleAttributeSpecifier )* (this_TypeSpecifier_1= ruleTypeSpecifier )+ (this_Declarator_2= ruleDeclarator )? )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2165:2: ( (this_AttributeSpecifier_0= ruleAttributeSpecifier )* (this_TypeSpecifier_1= ruleTypeSpecifier )+ (this_Declarator_2= ruleDeclarator )? )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2165:3: (this_AttributeSpecifier_0= ruleAttributeSpecifier )* (this_TypeSpecifier_1= ruleTypeSpecifier )+ (this_Declarator_2= ruleDeclarator )?
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2165:3: (this_AttributeSpecifier_0= ruleAttributeSpecifier )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==39) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2166:5: this_AttributeSpecifier_0= ruleAttributeSpecifier
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getExceptionDeclarationAccess().getAttributeSpecifierParserRuleCall_0_0()); 
                    	        
                    	    pushFollow(FOLLOW_ruleAttributeSpecifier_in_ruleExceptionDeclaration6262);
                    	    this_AttributeSpecifier_0=ruleAttributeSpecifier();

                    	    state._fsp--;


                    	    		current.merge(this_AttributeSpecifier_0);
                    	        
                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop52;
                        }
                    } while (true);

                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2176:3: (this_TypeSpecifier_1= ruleTypeSpecifier )+
                    int cnt53=0;
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==103) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2177:5: this_TypeSpecifier_1= ruleTypeSpecifier
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getExceptionDeclarationAccess().getTypeSpecifierParserRuleCall_0_1()); 
                    	        
                    	    pushFollow(FOLLOW_ruleTypeSpecifier_in_ruleExceptionDeclaration6292);
                    	    this_TypeSpecifier_1=ruleTypeSpecifier();

                    	    state._fsp--;


                    	    		current.merge(this_TypeSpecifier_1);
                    	        
                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt53 >= 1 ) break loop53;
                                EarlyExitException eee =
                                    new EarlyExitException(53, input);
                                throw eee;
                        }
                        cnt53++;
                    } while (true);

                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2187:3: (this_Declarator_2= ruleDeclarator )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==38||LA54_0==41||LA54_0==98||LA54_0==101||LA54_0==108) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2188:5: this_Declarator_2= ruleDeclarator
                            {
                             
                                    newCompositeNode(grammarAccess.getExceptionDeclarationAccess().getDeclaratorParserRuleCall_0_2()); 
                                
                            pushFollow(FOLLOW_ruleDeclarator_in_ruleExceptionDeclaration6322);
                            this_Declarator_2=ruleDeclarator();

                            state._fsp--;


                            		current.merge(this_Declarator_2);
                                
                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2200:2: kw= '...'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleExceptionDeclaration6349); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2215:1: entryRuleExceptionSpecification returns [String current=null] : iv_ruleExceptionSpecification= ruleExceptionSpecification EOF ;
    public final String entryRuleExceptionSpecification() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExceptionSpecification = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2216:2: (iv_ruleExceptionSpecification= ruleExceptionSpecification EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2217:2: iv_ruleExceptionSpecification= ruleExceptionSpecification EOF
            {
             newCompositeNode(grammarAccess.getExceptionSpecificationRule()); 
            pushFollow(FOLLOW_ruleExceptionSpecification_in_entryRuleExceptionSpecification6392);
            iv_ruleExceptionSpecification=ruleExceptionSpecification();

            state._fsp--;

             current =iv_ruleExceptionSpecification.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExceptionSpecification6403); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2224:1: ruleExceptionSpecification returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DynamicExceptionSpecification_0= ruleDynamicExceptionSpecification | this_NoexceptSpecification_1= ruleNoexceptSpecification ) ;
    public final AntlrDatatypeRuleToken ruleExceptionSpecification() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_DynamicExceptionSpecification_0 = null;

        AntlrDatatypeRuleToken this_NoexceptSpecification_1 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2227:28: ( (this_DynamicExceptionSpecification_0= ruleDynamicExceptionSpecification | this_NoexceptSpecification_1= ruleNoexceptSpecification ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2228:1: (this_DynamicExceptionSpecification_0= ruleDynamicExceptionSpecification | this_NoexceptSpecification_1= ruleNoexceptSpecification )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2228:1: (this_DynamicExceptionSpecification_0= ruleDynamicExceptionSpecification | this_NoexceptSpecification_1= ruleNoexceptSpecification )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==95) ) {
                alt56=1;
            }
            else if ( (LA56_0==96) ) {
                alt56=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2229:5: this_DynamicExceptionSpecification_0= ruleDynamicExceptionSpecification
                    {
                     
                            newCompositeNode(grammarAccess.getExceptionSpecificationAccess().getDynamicExceptionSpecificationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDynamicExceptionSpecification_in_ruleExceptionSpecification6450);
                    this_DynamicExceptionSpecification_0=ruleDynamicExceptionSpecification();

                    state._fsp--;


                    		current.merge(this_DynamicExceptionSpecification_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2241:5: this_NoexceptSpecification_1= ruleNoexceptSpecification
                    {
                     
                            newCompositeNode(grammarAccess.getExceptionSpecificationAccess().getNoexceptSpecificationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNoexceptSpecification_in_ruleExceptionSpecification6483);
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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2259:1: entryRuleDynamicExceptionSpecification returns [String current=null] : iv_ruleDynamicExceptionSpecification= ruleDynamicExceptionSpecification EOF ;
    public final String entryRuleDynamicExceptionSpecification() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDynamicExceptionSpecification = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2260:2: (iv_ruleDynamicExceptionSpecification= ruleDynamicExceptionSpecification EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2261:2: iv_ruleDynamicExceptionSpecification= ruleDynamicExceptionSpecification EOF
            {
             newCompositeNode(grammarAccess.getDynamicExceptionSpecificationRule()); 
            pushFollow(FOLLOW_ruleDynamicExceptionSpecification_in_entryRuleDynamicExceptionSpecification6529);
            iv_ruleDynamicExceptionSpecification=ruleDynamicExceptionSpecification();

            state._fsp--;

             current =iv_ruleDynamicExceptionSpecification.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDynamicExceptionSpecification6540); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2268:1: ruleDynamicExceptionSpecification returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'throw' kw= '(' this_TypeIdList_2= ruleTypeIdList kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleDynamicExceptionSpecification() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_TypeIdList_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2271:28: ( (kw= 'throw' kw= '(' this_TypeIdList_2= ruleTypeIdList kw= ')' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2272:1: (kw= 'throw' kw= '(' this_TypeIdList_2= ruleTypeIdList kw= ')' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2272:1: (kw= 'throw' kw= '(' this_TypeIdList_2= ruleTypeIdList kw= ')' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2273:2: kw= 'throw' kw= '(' this_TypeIdList_2= ruleTypeIdList kw= ')'
            {
            kw=(Token)match(input,95,FOLLOW_95_in_ruleDynamicExceptionSpecification6578); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDynamicExceptionSpecificationAccess().getThrowKeyword_0()); 
                
            kw=(Token)match(input,43,FOLLOW_43_in_ruleDynamicExceptionSpecification6591); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDynamicExceptionSpecificationAccess().getLeftParenthesisKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getDynamicExceptionSpecificationAccess().getTypeIdListParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleTypeIdList_in_ruleDynamicExceptionSpecification6613);
            this_TypeIdList_2=ruleTypeIdList();

            state._fsp--;


            		current.merge(this_TypeIdList_2);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,44,FOLLOW_44_in_ruleDynamicExceptionSpecification6631); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2309:1: entryRuleNoexceptSpecification returns [String current=null] : iv_ruleNoexceptSpecification= ruleNoexceptSpecification EOF ;
    public final String entryRuleNoexceptSpecification() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNoexceptSpecification = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2310:2: (iv_ruleNoexceptSpecification= ruleNoexceptSpecification EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2311:2: iv_ruleNoexceptSpecification= ruleNoexceptSpecification EOF
            {
             newCompositeNode(grammarAccess.getNoexceptSpecificationRule()); 
            pushFollow(FOLLOW_ruleNoexceptSpecification_in_entryRuleNoexceptSpecification6672);
            iv_ruleNoexceptSpecification=ruleNoexceptSpecification();

            state._fsp--;

             current =iv_ruleNoexceptSpecification.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoexceptSpecification6683); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2318:1: ruleNoexceptSpecification returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'noexcept' (kw= '(' this_ConstantExpression_2= ruleConstantExpression kw= ')' )? ) ;
    public final AntlrDatatypeRuleToken ruleNoexceptSpecification() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ConstantExpression_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2321:28: ( (kw= 'noexcept' (kw= '(' this_ConstantExpression_2= ruleConstantExpression kw= ')' )? ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2322:1: (kw= 'noexcept' (kw= '(' this_ConstantExpression_2= ruleConstantExpression kw= ')' )? )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2322:1: (kw= 'noexcept' (kw= '(' this_ConstantExpression_2= ruleConstantExpression kw= ')' )? )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2323:2: kw= 'noexcept' (kw= '(' this_ConstantExpression_2= ruleConstantExpression kw= ')' )?
            {
            kw=(Token)match(input,96,FOLLOW_96_in_ruleNoexceptSpecification6721); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getNoexceptSpecificationAccess().getNoexceptKeyword_0()); 
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2328:1: (kw= '(' this_ConstantExpression_2= ruleConstantExpression kw= ')' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==43) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2329:2: kw= '(' this_ConstantExpression_2= ruleConstantExpression kw= ')'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleNoexceptSpecification6735); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNoexceptSpecificationAccess().getLeftParenthesisKeyword_1_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getNoexceptSpecificationAccess().getConstantExpressionParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleConstantExpression_in_ruleNoexceptSpecification6757);
                    this_ConstantExpression_2=ruleConstantExpression();

                    state._fsp--;


                    		current.merge(this_ConstantExpression_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleNoexceptSpecification6775); 

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


    // $ANTLR start "entryRuleConstantExpression"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2359:1: entryRuleConstantExpression returns [String current=null] : iv_ruleConstantExpression= ruleConstantExpression EOF ;
    public final String entryRuleConstantExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConstantExpression = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2360:2: (iv_ruleConstantExpression= ruleConstantExpression EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2361:2: iv_ruleConstantExpression= ruleConstantExpression EOF
            {
             newCompositeNode(grammarAccess.getConstantExpressionRule()); 
            pushFollow(FOLLOW_ruleConstantExpression_in_entryRuleConstantExpression6818);
            iv_ruleConstantExpression=ruleConstantExpression();

            state._fsp--;

             current =iv_ruleConstantExpression.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantExpression6829); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2368:1: ruleConstantExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'ConstantExpression' ;
    public final AntlrDatatypeRuleToken ruleConstantExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2371:28: (kw= 'ConstantExpression' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2373:2: kw= 'ConstantExpression'
            {
            kw=(Token)match(input,97,FOLLOW_97_in_ruleConstantExpression6866); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2386:1: entryRuleIdExpression returns [String current=null] : iv_ruleIdExpression= ruleIdExpression EOF ;
    public final String entryRuleIdExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdExpression = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2387:2: (iv_ruleIdExpression= ruleIdExpression EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2388:2: iv_ruleIdExpression= ruleIdExpression EOF
            {
             newCompositeNode(grammarAccess.getIdExpressionRule()); 
            pushFollow(FOLLOW_ruleIdExpression_in_entryRuleIdExpression6906);
            iv_ruleIdExpression=ruleIdExpression();

            state._fsp--;

             current =iv_ruleIdExpression.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdExpression6917); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2395:1: ruleIdExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'IdExpression' ;
    public final AntlrDatatypeRuleToken ruleIdExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2398:28: (kw= 'IdExpression' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2400:2: kw= 'IdExpression'
            {
            kw=(Token)match(input,98,FOLLOW_98_in_ruleIdExpression6954); 

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


    // $ANTLR start "entryRuleDeclarationSpecifier"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2413:1: entryRuleDeclarationSpecifier returns [String current=null] : iv_ruleDeclarationSpecifier= ruleDeclarationSpecifier EOF ;
    public final String entryRuleDeclarationSpecifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDeclarationSpecifier = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2414:2: (iv_ruleDeclarationSpecifier= ruleDeclarationSpecifier EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2415:2: iv_ruleDeclarationSpecifier= ruleDeclarationSpecifier EOF
            {
             newCompositeNode(grammarAccess.getDeclarationSpecifierRule()); 
            pushFollow(FOLLOW_ruleDeclarationSpecifier_in_entryRuleDeclarationSpecifier6994);
            iv_ruleDeclarationSpecifier=ruleDeclarationSpecifier();

            state._fsp--;

             current =iv_ruleDeclarationSpecifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclarationSpecifier7005); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2422:1: ruleDeclarationSpecifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'DeclarationSpecifier' ;
    public final AntlrDatatypeRuleToken ruleDeclarationSpecifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2425:28: (kw= 'DeclarationSpecifier' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2427:2: kw= 'DeclarationSpecifier'
            {
            kw=(Token)match(input,99,FOLLOW_99_in_ruleDeclarationSpecifier7042); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDeclarationSpecifierAccess().getDeclarationSpecifierKeyword()); 
                

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


    // $ANTLR start "entryRuleDeclaration"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2440:1: entryRuleDeclaration returns [String current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final String entryRuleDeclaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDeclaration = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2441:2: (iv_ruleDeclaration= ruleDeclaration EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2442:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration7082);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;

             current =iv_ruleDeclaration.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration7093); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2449:1: ruleDeclaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Declaration' ;
    public final AntlrDatatypeRuleToken ruleDeclaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2452:28: (kw= 'Declaration' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2454:2: kw= 'Declaration'
            {
            kw=(Token)match(input,100,FOLLOW_100_in_ruleDeclaration7130); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDeclarationAccess().getDeclarationKeyword()); 
                

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


    // $ANTLR start "entryRuleNestedNameSpecifier"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2467:1: entryRuleNestedNameSpecifier returns [String current=null] : iv_ruleNestedNameSpecifier= ruleNestedNameSpecifier EOF ;
    public final String entryRuleNestedNameSpecifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNestedNameSpecifier = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2468:2: (iv_ruleNestedNameSpecifier= ruleNestedNameSpecifier EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2469:2: iv_ruleNestedNameSpecifier= ruleNestedNameSpecifier EOF
            {
             newCompositeNode(grammarAccess.getNestedNameSpecifierRule()); 
            pushFollow(FOLLOW_ruleNestedNameSpecifier_in_entryRuleNestedNameSpecifier7170);
            iv_ruleNestedNameSpecifier=ruleNestedNameSpecifier();

            state._fsp--;

             current =iv_ruleNestedNameSpecifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNestedNameSpecifier7181); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2476:1: ruleNestedNameSpecifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'NestedNameSpecifier' ;
    public final AntlrDatatypeRuleToken ruleNestedNameSpecifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2479:28: (kw= 'NestedNameSpecifier' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2481:2: kw= 'NestedNameSpecifier'
            {
            kw=(Token)match(input,101,FOLLOW_101_in_ruleNestedNameSpecifier7218); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2494:1: entryRuleAssignmentExpression returns [String current=null] : iv_ruleAssignmentExpression= ruleAssignmentExpression EOF ;
    public final String entryRuleAssignmentExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAssignmentExpression = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2495:2: (iv_ruleAssignmentExpression= ruleAssignmentExpression EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2496:2: iv_ruleAssignmentExpression= ruleAssignmentExpression EOF
            {
             newCompositeNode(grammarAccess.getAssignmentExpressionRule()); 
            pushFollow(FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression7258);
            iv_ruleAssignmentExpression=ruleAssignmentExpression();

            state._fsp--;

             current =iv_ruleAssignmentExpression.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignmentExpression7269); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2503:1: ruleAssignmentExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'AssignmentExpression' ;
    public final AntlrDatatypeRuleToken ruleAssignmentExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2506:28: (kw= 'AssignmentExpression' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2508:2: kw= 'AssignmentExpression'
            {
            kw=(Token)match(input,102,FOLLOW_102_in_ruleAssignmentExpression7306); 

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


    // $ANTLR start "entryRuleTypeSpecifier"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2523:1: entryRuleTypeSpecifier returns [String current=null] : iv_ruleTypeSpecifier= ruleTypeSpecifier EOF ;
    public final String entryRuleTypeSpecifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeSpecifier = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2524:2: (iv_ruleTypeSpecifier= ruleTypeSpecifier EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2525:2: iv_ruleTypeSpecifier= ruleTypeSpecifier EOF
            {
             newCompositeNode(grammarAccess.getTypeSpecifierRule()); 
            pushFollow(FOLLOW_ruleTypeSpecifier_in_entryRuleTypeSpecifier7348);
            iv_ruleTypeSpecifier=ruleTypeSpecifier();

            state._fsp--;

             current =iv_ruleTypeSpecifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeSpecifier7359); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2532:1: ruleTypeSpecifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'TypeSpecifier' ;
    public final AntlrDatatypeRuleToken ruleTypeSpecifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2535:28: (kw= 'TypeSpecifier' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2537:2: kw= 'TypeSpecifier'
            {
            kw=(Token)match(input,103,FOLLOW_103_in_ruleTypeSpecifier7396); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getTypeSpecifierAccess().getTypeSpecifierKeyword()); 
                

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


    // $ANTLR start "entryRuleCompoundStatement"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2550:1: entryRuleCompoundStatement returns [String current=null] : iv_ruleCompoundStatement= ruleCompoundStatement EOF ;
    public final String entryRuleCompoundStatement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCompoundStatement = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2551:2: (iv_ruleCompoundStatement= ruleCompoundStatement EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2552:2: iv_ruleCompoundStatement= ruleCompoundStatement EOF
            {
             newCompositeNode(grammarAccess.getCompoundStatementRule()); 
            pushFollow(FOLLOW_ruleCompoundStatement_in_entryRuleCompoundStatement7436);
            iv_ruleCompoundStatement=ruleCompoundStatement();

            state._fsp--;

             current =iv_ruleCompoundStatement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompoundStatement7447); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2559:1: ruleCompoundStatement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'CompoundStatement' ;
    public final AntlrDatatypeRuleToken ruleCompoundStatement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2562:28: (kw= 'CompoundStatement' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2564:2: kw= 'CompoundStatement'
            {
            kw=(Token)match(input,104,FOLLOW_104_in_ruleCompoundStatement7484); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2577:1: entryRuleCtorInitializer returns [String current=null] : iv_ruleCtorInitializer= ruleCtorInitializer EOF ;
    public final String entryRuleCtorInitializer() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCtorInitializer = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2578:2: (iv_ruleCtorInitializer= ruleCtorInitializer EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2579:2: iv_ruleCtorInitializer= ruleCtorInitializer EOF
            {
             newCompositeNode(grammarAccess.getCtorInitializerRule()); 
            pushFollow(FOLLOW_ruleCtorInitializer_in_entryRuleCtorInitializer7524);
            iv_ruleCtorInitializer=ruleCtorInitializer();

            state._fsp--;

             current =iv_ruleCtorInitializer.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCtorInitializer7535); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2586:1: ruleCtorInitializer returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'CtorInitializer' ;
    public final AntlrDatatypeRuleToken ruleCtorInitializer() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2589:28: (kw= 'CtorInitializer' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2591:2: kw= 'CtorInitializer'
            {
            kw=(Token)match(input,105,FOLLOW_105_in_ruleCtorInitializer7572); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2604:1: entryRuleTypeIdList returns [String current=null] : iv_ruleTypeIdList= ruleTypeIdList EOF ;
    public final String entryRuleTypeIdList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeIdList = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2605:2: (iv_ruleTypeIdList= ruleTypeIdList EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2606:2: iv_ruleTypeIdList= ruleTypeIdList EOF
            {
             newCompositeNode(grammarAccess.getTypeIdListRule()); 
            pushFollow(FOLLOW_ruleTypeIdList_in_entryRuleTypeIdList7612);
            iv_ruleTypeIdList=ruleTypeIdList();

            state._fsp--;

             current =iv_ruleTypeIdList.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeIdList7623); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2613:1: ruleTypeIdList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'TypeIdList' ;
    public final AntlrDatatypeRuleToken ruleTypeIdList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2616:28: (kw= 'TypeIdList' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2618:2: kw= 'TypeIdList'
            {
            kw=(Token)match(input,106,FOLLOW_106_in_ruleTypeIdList7660); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2631:1: entryRuleUnqualifiedId returns [String current=null] : iv_ruleUnqualifiedId= ruleUnqualifiedId EOF ;
    public final String entryRuleUnqualifiedId() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnqualifiedId = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2632:2: (iv_ruleUnqualifiedId= ruleUnqualifiedId EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2633:2: iv_ruleUnqualifiedId= ruleUnqualifiedId EOF
            {
             newCompositeNode(grammarAccess.getUnqualifiedIdRule()); 
            pushFollow(FOLLOW_ruleUnqualifiedId_in_entryRuleUnqualifiedId7700);
            iv_ruleUnqualifiedId=ruleUnqualifiedId();

            state._fsp--;

             current =iv_ruleUnqualifiedId.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnqualifiedId7711); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2640:1: ruleUnqualifiedId returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'UnqualifiedId' ;
    public final AntlrDatatypeRuleToken ruleUnqualifiedId() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2643:28: (kw= 'UnqualifiedId' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2645:2: kw= 'UnqualifiedId'
            {
            kw=(Token)match(input,107,FOLLOW_107_in_ruleUnqualifiedId7748); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2658:1: entryRuleClassName returns [String current=null] : iv_ruleClassName= ruleClassName EOF ;
    public final String entryRuleClassName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleClassName = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2659:2: (iv_ruleClassName= ruleClassName EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2660:2: iv_ruleClassName= ruleClassName EOF
            {
             newCompositeNode(grammarAccess.getClassNameRule()); 
            pushFollow(FOLLOW_ruleClassName_in_entryRuleClassName7788);
            iv_ruleClassName=ruleClassName();

            state._fsp--;

             current =iv_ruleClassName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassName7799); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2667:1: ruleClassName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'ClassName' ;
    public final AntlrDatatypeRuleToken ruleClassName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2670:28: (kw= 'ClassName' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2672:2: kw= 'ClassName'
            {
            kw=(Token)match(input,108,FOLLOW_108_in_ruleClassName7836); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2685:1: entryRuleInitializer returns [String current=null] : iv_ruleInitializer= ruleInitializer EOF ;
    public final String entryRuleInitializer() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInitializer = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2686:2: (iv_ruleInitializer= ruleInitializer EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2687:2: iv_ruleInitializer= ruleInitializer EOF
            {
             newCompositeNode(grammarAccess.getInitializerRule()); 
            pushFollow(FOLLOW_ruleInitializer_in_entryRuleInitializer7876);
            iv_ruleInitializer=ruleInitializer();

            state._fsp--;

             current =iv_ruleInitializer.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInitializer7887); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2694:1: ruleInitializer returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Initializer' ;
    public final AntlrDatatypeRuleToken ruleInitializer() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2697:28: (kw= 'Initializer' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2699:2: kw= 'Initializer'
            {
            kw=(Token)match(input,109,FOLLOW_109_in_ruleInitializer7924); 

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


    protected DFA38 dfa38 = new DFA38(this);
    static final String DFA38_eotS =
        "\55\uffff";
    static final String DFA38_eofS =
        "\1\uffff\1\51\1\53\52\uffff";
    static final String DFA38_minS =
        "\1\52\2\47\52\uffff";
    static final String DFA38_maxS =
        "\1\130\2\66\52\uffff";
    static final String DFA38_acceptS =
        "\3\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1"+
        "\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34"+
        "\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51"+
        "\1\52\1\1\1\3\1\2\1\4";
    static final String DFA38_specialS =
        "\55\uffff}>";
    static final String[] DFA38_transitionS = {
            "\1\44\4\uffff\1\11\1\40\1\15\2\uffff\1\2\1\uffff\1\16\1\17"+
            "\1\1\1\3\1\4\1\5\1\6\1\7\1\10\1\12\1\13\1\14\1\20\1\21\1\22"+
            "\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36"+
            "\1\37\1\41\1\42\1\43\1\45\1\46\1\47\1\50",
            "\1\52\16\uffff\1\51",
            "\1\54\16\uffff\1\53",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA38_eot = DFA.unpackEncodedString(DFA38_eotS);
    static final short[] DFA38_eof = DFA.unpackEncodedString(DFA38_eofS);
    static final char[] DFA38_min = DFA.unpackEncodedStringToUnsignedChars(DFA38_minS);
    static final char[] DFA38_max = DFA.unpackEncodedStringToUnsignedChars(DFA38_maxS);
    static final short[] DFA38_accept = DFA.unpackEncodedString(DFA38_acceptS);
    static final short[] DFA38_special = DFA.unpackEncodedString(DFA38_specialS);
    static final short[][] DFA38_transition;

    static {
        int numStates = DFA38_transitionS.length;
        DFA38_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA38_transition[i] = DFA.unpackEncodedString(DFA38_transitionS[i]);
        }
    }

    class DFA38 extends DFA {

        public DFA38(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 38;
            this.eot = DFA38_eot;
            this.eof = DFA38_eof;
            this.min = DFA38_min;
            this.max = DFA38_max;
            this.accept = DFA38_accept;
            this.special = DFA38_special;
            this.transition = DFA38_transition;
        }
        public String getDescription() {
            return "1329:1: (kw= 'new' | kw= 'delete' | (kw= 'new' kw= '[' kw= ']' ) | (kw= 'delete' kw= '[' kw= ']' ) | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= '^' | kw= '&' | kw= '|' | kw= '~' | kw= '!' | kw= '=' | kw= '<' | kw= '>' | kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' | kw= '^=' | kw= '&=' | kw= '|=' | kw= '<<' | kw= '>>' | kw= '>>=' | kw= '<<=' | kw= '==' | kw= '!=' | kw= '<=' | kw= '>=' | kw= '&&' | kw= '||' | kw= '++' | kw= '--' | kw= ',' | kw= '->*' | kw= '->' | kw= '()' | kw= '[]' )";
        }
    }
 

    public static final BitSet FOLLOW_ruleTest_in_entryRuleTest75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTest85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDefinition_in_ruleTest130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleToken_in_entryRuleToken166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleToken177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KEYWORD_in_ruleToken217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleToken250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PREPROCESSING_OP_OR_PUNC_in_ruleToken277 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleToken297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral344 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLiteral395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CHARACTER_LITERAL_in_ruleLiteral421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOATING_LITERAL_in_ruleLiteral447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_LITERAL_in_ruleLiteral473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleLiteral499 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_36_in_ruleLiteral518 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleLiteral532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespaceBody_in_entryRuleNamespaceBody576 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamespaceBody587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleNamespaceBody634 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
    public static final BitSet FOLLOW_ruleQualifiedNamespaceSpecifier_in_entryRuleQualifiedNamespaceSpecifier683 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNamespaceSpecifier694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleQualifiedNamespaceSpecifier733 = new BitSet(new long[]{0x0000000000000040L,0x0000002000000000L});
    public static final BitSet FOLLOW_ruleNestedNameSpecifier_in_ruleQualifiedNamespaceSpecifier758 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedNamespaceSpecifier780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeSpecifier_in_entryRuleAttributeSpecifier834 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeSpecifier845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleAttributeSpecifier883 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleAttributeSpecifier896 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleAttributeList_in_ruleAttributeSpecifier918 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleAttributeSpecifier936 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleAttributeSpecifier949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeList_in_entryRuleAttributeList990 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeList1001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleAttributeList1049 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_41_in_ruleAttributeList1068 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_ruleAttributeList1085 = new BitSet(new long[]{0x0000040000000042L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleAttributeList1108 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_41_in_ruleAttributeList1127 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute1174 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute1185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeToken_in_ruleAttribute1232 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_ruleAttributeArgumentClause_in_ruleAttribute1260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeToken_in_entryRuleAttributeToken1308 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeToken1319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttributeToken1360 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleAttributeToken1378 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttributeToken1395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeArgumentClause_in_entryRuleAttributeArgumentClause1441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeArgumentClause1452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleAttributeArgumentClause1490 = new BitSet(new long[]{0x00000018000007B0L});
    public static final BitSet FOLLOW_ruleToken_in_ruleAttributeArgumentClause1512 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleAttributeArgumentClause1530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitDeclarator_in_entryRuleInitDeclarator1571 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInitDeclarator1582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarator_in_ruleInitDeclarator1629 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L});
    public static final BitSet FOLLOW_ruleInitializer_in_ruleInitDeclarator1657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarator_in_entryRuleDeclarator1705 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclarator1716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoptrDeclarator_in_ruleDeclarator1762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDeclarator_in_entryRuleFunctionDeclarator1807 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionDeclarator1818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateDeclaration_in_ruleFunctionDeclarator1866 = new BitSet(new long[]{0x0000024000000000L,0x0000102400000000L});
    public static final BitSet FOLLOW_ruleNoptrDeclarator_in_ruleFunctionDeclarator1895 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_ruleParametersAndQualifiers_in_ruleFunctionDeclarator1922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoptrDeclarator_in_entryRuleNoptrDeclarator1968 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoptrDeclarator1979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaratorId_in_ruleNoptrDeclarator2025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParametersAndQualifiers_in_entryRuleParametersAndQualifiers2070 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParametersAndQualifiers2081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleParametersAndQualifiers2119 = new BitSet(new long[]{0x0000128000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_ruleParameterDeclarationClause_in_ruleParametersAndQualifiers2142 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleParametersAndQualifiers2162 = new BitSet(new long[]{0x0001E08000000002L,0x0000000180000000L});
    public static final BitSet FOLLOW_ruleAttributeSpecifier_in_ruleParametersAndQualifiers2185 = new BitSet(new long[]{0x0001E08000000002L,0x0000000180000000L});
    public static final BitSet FOLLOW_45_in_ruleParametersAndQualifiers2206 = new BitSet(new long[]{0x0001800000000002L,0x0000000180000000L});
    public static final BitSet FOLLOW_46_in_ruleParametersAndQualifiers2225 = new BitSet(new long[]{0x0001800000000002L,0x0000000180000000L});
    public static final BitSet FOLLOW_47_in_ruleParametersAndQualifiers2241 = new BitSet(new long[]{0x0000000000000002L,0x0000000180000000L});
    public static final BitSet FOLLOW_48_in_ruleParametersAndQualifiers2260 = new BitSet(new long[]{0x0000000000000002L,0x0000000180000000L});
    public static final BitSet FOLLOW_ruleExceptionSpecification_in_ruleParametersAndQualifiers2285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaratorId_in_entryRuleDeclaratorId2333 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaratorId2344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleDeclaratorId2384 = new BitSet(new long[]{0x0000020000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_ruleIdExpression_in_ruleDeclaratorId2408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleDeclaratorId2435 = new BitSet(new long[]{0x0000024000000000L,0x0000102400000000L});
    public static final BitSet FOLLOW_ruleNestedNameSpecifier_in_ruleDeclaratorId2460 = new BitSet(new long[]{0x0000024000000000L,0x0000102400000000L});
    public static final BitSet FOLLOW_ruleClassName_in_ruleDeclaratorId2489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeId_in_entryRuleTypeId2536 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeId2547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeSpecifier_in_ruleTypeId2594 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L});
    public static final BitSet FOLLOW_ruleParameterDeclarationClause_in_entryRuleParameterDeclarationClause2641 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterDeclarationClause2652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleParameterDeclarationClause2690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclarationList_in_ruleParameterDeclarationClause2719 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_42_in_ruleParameterDeclarationClause2739 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleParameterDeclarationClause2754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclarationList_in_entryRuleParameterDeclarationList2798 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterDeclarationList2809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleParameterDeclarationList2856 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_ruleParameterDeclarationList2875 = new BitSet(new long[]{0x0000028000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleParameterDeclarationList2897 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_entryRuleParameterDeclaration2945 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterDeclaration2956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeSpecifier_in_ruleParameterDeclaration3004 = new BitSet(new long[]{0x0000028000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_ruleDeclarationSpecifier_in_ruleParameterDeclaration3034 = new BitSet(new long[]{0x000002C000000000L,0x0000102C00000000L});
    public static final BitSet FOLLOW_ruleInitDeclarator_in_ruleParameterDeclaration3063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDefinition_in_entryRuleFunctionDefinition3109 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionDefinition3120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeSpecifier_in_ruleFunctionDefinition3168 = new BitSet(new long[]{0x000002C000000000L,0x0000102C04000000L});
    public static final BitSet FOLLOW_ruleDeclarationSpecifier_in_ruleFunctionDefinition3198 = new BitSet(new long[]{0x000002C000000000L,0x0000102C04000000L});
    public static final BitSet FOLLOW_ruleFunctionDeclarator_in_ruleFunctionDefinition3227 = new BitSet(new long[]{0x0002000000000000L,0x0000030020000000L});
    public static final BitSet FOLLOW_ruleFunctionBody_in_ruleFunctionDefinition3255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleFunctionDefinition3280 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleFunctionDefinition3293 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleFunctionDefinition3306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleFunctionDefinition3327 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleFunctionDefinition3340 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleFunctionDefinition3353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionBody_in_entryRuleFunctionBody3396 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionBody3407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCtorInitializer_in_ruleFunctionBody3456 = new BitSet(new long[]{0x0000000000000000L,0x0000030000000000L});
    public static final BitSet FOLLOW_ruleCompoundStatement_in_ruleFunctionBody3485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionTryBlock_in_ruleFunctionBody3519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperatorFunctionId_in_entryRuleOperatorFunctionId3565 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperatorFunctionId3576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleOperatorFunctionId3614 = new BitSet(new long[]{0xFFD3840000000000L,0x0000000001FFFFFFL});
    public static final BitSet FOLLOW_ruleOverloadableOperator_in_ruleOperatorFunctionId3636 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_54_in_ruleOperatorFunctionId3655 = new BitSet(new long[]{0x0080020000000000L,0x0000008600000000L});
    public static final BitSet FOLLOW_ruleConstantExpression_in_ruleOperatorFunctionId3678 = new BitSet(new long[]{0x0080020000000000L,0x0000008600000000L});
    public static final BitSet FOLLOW_ruleTypeSpecifier_in_ruleOperatorFunctionId3711 = new BitSet(new long[]{0x0080020000000000L,0x0000008600000000L});
    public static final BitSet FOLLOW_ruleIdExpression_in_ruleOperatorFunctionId3744 = new BitSet(new long[]{0x0080020000000000L,0x0000008600000000L});
    public static final BitSet FOLLOW_55_in_ruleOperatorFunctionId3764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOverloadableOperator_in_entryRuleOverloadableOperator3807 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOverloadableOperator3818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleOverloadableOperator3856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleOverloadableOperator3875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleOverloadableOperator3895 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleOverloadableOperator3908 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleOverloadableOperator3921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleOverloadableOperator3942 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleOverloadableOperator3955 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleOverloadableOperator3968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleOverloadableOperator3988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleOverloadableOperator4007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleOverloadableOperator4026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleOverloadableOperator4045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleOverloadableOperator4064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleOverloadableOperator4083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleOverloadableOperator4102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleOverloadableOperator4121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleOverloadableOperator4140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleOverloadableOperator4159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleOverloadableOperator4178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleOverloadableOperator4197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleOverloadableOperator4216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleOverloadableOperator4235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleOverloadableOperator4254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleOverloadableOperator4273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleOverloadableOperator4292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleOverloadableOperator4311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleOverloadableOperator4330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleOverloadableOperator4349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleOverloadableOperator4368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleOverloadableOperator4387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleOverloadableOperator4406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleOverloadableOperator4425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleOverloadableOperator4444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleOverloadableOperator4463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleOverloadableOperator4482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleOverloadableOperator4501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleOverloadableOperator4520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleOverloadableOperator4539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleOverloadableOperator4558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleOverloadableOperator4577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleOverloadableOperator4596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleOverloadableOperator4615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleOverloadableOperator4634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleOverloadableOperator4653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleOverloadableOperator4672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleOverloadableOperator4691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralOperatorId_in_entryRuleLiteralOperatorId4732 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralOperatorId4743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleLiteralOperatorId4781 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_ruleLiteralOperatorId4794 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_ruleLiteralOperatorId4807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateDeclaration_in_entryRuleTemplateDeclaration4848 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateDeclaration4859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleTemplateDeclaration4897 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleTemplateDeclaration4910 = new BitSet(new long[]{0x0000028000000000L,0x0000000818000000L});
    public static final BitSet FOLLOW_ruleTemplateParameterList_in_ruleTemplateDeclaration4932 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleTemplateDeclaration4950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateParameterList_in_entryRuleTemplateParameterList4991 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateParameterList5002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateParameter_in_ruleTemplateParameterList5049 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_ruleTemplateParameterList5068 = new BitSet(new long[]{0x0000028000000000L,0x0000000818000000L});
    public static final BitSet FOLLOW_ruleTemplateParameter_in_ruleTemplateParameterList5090 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ruleTemplateParameter_in_entryRuleTemplateParameter5138 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateParameter5149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeParameter_in_ruleTemplateParameter5196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleTemplateParameter5229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeParameter_in_entryRuleTypeParameter5275 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeParameter5286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleTypeParameter5325 = new BitSet(new long[]{0x0002020000000042L});
    public static final BitSet FOLLOW_92_in_ruleTypeParameter5344 = new BitSet(new long[]{0x0002020000000042L});
    public static final BitSet FOLLOW_41_in_ruleTypeParameter5361 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeParameter5379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeParameter5410 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleTypeParameter5430 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_ruleTypeId_in_ruleTypeParameter5452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateArgumentList_in_entryRuleTemplateArgumentList5502 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateArgumentList5513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateArgument_in_ruleTemplateArgumentList5560 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_41_in_ruleTemplateArgumentList5579 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_ruleTemplateArgumentList5595 = new BitSet(new long[]{0x0000020000000000L,0x0000008600000000L});
    public static final BitSet FOLLOW_ruleTemplateArgument_in_ruleTemplateArgumentList5617 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_41_in_ruleTemplateArgumentList5636 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ruleTemplateArgument_in_entryRuleTemplateArgument5681 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateArgument5692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantExpression_in_ruleTemplateArgument5739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeId_in_ruleTemplateArgument5772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdExpression_in_ruleTemplateArgument5805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionTryBlock_in_entryRuleFunctionTryBlock5855 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionTryBlock5866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleFunctionTryBlock5904 = new BitSet(new long[]{0x0000000000000000L,0x0000030000000000L});
    public static final BitSet FOLLOW_ruleCtorInitializer_in_ruleFunctionTryBlock5927 = new BitSet(new long[]{0x0000000000000000L,0x0000030000000000L});
    public static final BitSet FOLLOW_ruleCompoundStatement_in_ruleFunctionTryBlock5956 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_ruleHandler_in_ruleFunctionTryBlock5984 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_ruleHandler_in_entryRuleHandler6032 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHandler6043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleHandler6081 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleHandler6094 = new BitSet(new long[]{0x000002C000000000L,0x000010A400000000L});
    public static final BitSet FOLLOW_ruleExceptionDeclaration_in_ruleHandler6116 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleHandler6134 = new BitSet(new long[]{0x0000000000000000L,0x0000030000000000L});
    public static final BitSet FOLLOW_ruleCompoundStatement_in_ruleHandler6156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExceptionDeclaration_in_entryRuleExceptionDeclaration6202 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExceptionDeclaration6213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeSpecifier_in_ruleExceptionDeclaration6262 = new BitSet(new long[]{0x000002C000000000L,0x000010A400000000L});
    public static final BitSet FOLLOW_ruleTypeSpecifier_in_ruleExceptionDeclaration6292 = new BitSet(new long[]{0x0000024000000002L,0x000010A400000000L});
    public static final BitSet FOLLOW_ruleDeclarator_in_ruleExceptionDeclaration6322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleExceptionDeclaration6349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExceptionSpecification_in_entryRuleExceptionSpecification6392 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExceptionSpecification6403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDynamicExceptionSpecification_in_ruleExceptionSpecification6450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoexceptSpecification_in_ruleExceptionSpecification6483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDynamicExceptionSpecification_in_entryRuleDynamicExceptionSpecification6529 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDynamicExceptionSpecification6540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleDynamicExceptionSpecification6578 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleDynamicExceptionSpecification6591 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_ruleTypeIdList_in_ruleDynamicExceptionSpecification6613 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleDynamicExceptionSpecification6631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoexceptSpecification_in_entryRuleNoexceptSpecification6672 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoexceptSpecification6683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleNoexceptSpecification6721 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_43_in_ruleNoexceptSpecification6735 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_ruleConstantExpression_in_ruleNoexceptSpecification6757 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleNoexceptSpecification6775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantExpression_in_entryRuleConstantExpression6818 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantExpression6829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleConstantExpression6866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdExpression_in_entryRuleIdExpression6906 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdExpression6917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_ruleIdExpression6954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarationSpecifier_in_entryRuleDeclarationSpecifier6994 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclarationSpecifier7005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_ruleDeclarationSpecifier7042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration7082 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration7093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_ruleDeclaration7130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNestedNameSpecifier_in_entryRuleNestedNameSpecifier7170 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNestedNameSpecifier7181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_ruleNestedNameSpecifier7218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression7258 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignmentExpression7269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_ruleAssignmentExpression7306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeSpecifier_in_entryRuleTypeSpecifier7348 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeSpecifier7359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_ruleTypeSpecifier7396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundStatement_in_entryRuleCompoundStatement7436 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompoundStatement7447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_ruleCompoundStatement7484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCtorInitializer_in_entryRuleCtorInitializer7524 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCtorInitializer7535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_ruleCtorInitializer7572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeIdList_in_entryRuleTypeIdList7612 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeIdList7623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_ruleTypeIdList7660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnqualifiedId_in_entryRuleUnqualifiedId7700 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnqualifiedId7711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_ruleUnqualifiedId7748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassName_in_entryRuleClassName7788 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassName7799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_ruleClassName7836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitializer_in_entryRuleInitializer7876 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInitializer7887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_ruleInitializer7924 = new BitSet(new long[]{0x0000000000000002L});

}