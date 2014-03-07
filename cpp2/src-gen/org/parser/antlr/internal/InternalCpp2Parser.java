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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_KEYWORD", "RULE_PREPROCESSING_OP_OR_PUNC", "RULE_ID", "RULE_INT", "RULE_CHARACTER_LITERAL", "RULE_FLOATING_LITERAL", "RULE_STRING_LITERAL", "RULE_HEXADECIMAL_DIGIT", "RULE_HEX_QUAD", "RULE_UNIVERSAL_CHARACTER_NAME", "RULE_H_CHAR", "RULE_Q_CHAR", "RULE_HEADER_NAME", "RULE_DIGIT", "RULE_NONDIGIT", "RULE_DECIMAL_LITERAL", "RULE_OCTAL_LITERAL", "RULE_HEXADECIMAL_LITERAL", "RULE_INTEGER_SUFFIX", "RULE_OCTAL_DIGIT", "RULE_C_CHAR", "RULE_ESCAPE_SEQUENCE", "RULE_SIMPLE_ESCAPE_SEQUENCE", "RULE_OCTAL_ESCAPE_SEQUENCE", "RULE_HEXADECIMAL_ESCAPE_SEQUENCE", "RULE_FRACTIONAL_CONSTANT", "RULE_EXPONENT_PART", "RULE_ENC_PREFIX", "RULE_SCHAR", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'nullptr'", "'operator'", "'<'", "'>'", "'new'", "'delete'", "'['", "']'", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'&'", "'|'", "'~'", "'!'", "'='", "'+='", "'-='", "'*='", "'/='", "'%='", "'^='", "'&='", "'|='", "'<<'", "'>>'", "'>>='", "'<<='", "'=='", "'!='", "'<='", "'>='", "'&&'", "'||'", "'++'", "'--'", "','", "'->*'", "'->'", "'()'", "'[]'", "'\"'", "'class'", "'...'", "'typename'", "'template'", "'catch'", "'('", "')'", "'throw'", "'noexcept'", "'DUMMY1'", "'DUMMY2'", "'DUMMY3'", "'DUMMY4'", "'DUMMY5'", "'DUMMY6'", "'DUMMY7'", "'DUMMY8'", "'DUMMY9'", "'DUMMY10'", "'DUMMY11'", "'DUMMY12'", "'DUMMY13'", "'DUMMY14'"
    };
    public static final int RULE_ID=6;
    public static final int RULE_FLOATING_LITERAL=9;
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
    public static final int RULE_CHARACTER_LITERAL=8;
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
    public static final int RULE_STRING_LITERAL=10;
    public static final int RULE_FRACTIONAL_CONSTANT=29;
    public static final int T__107=107;
    public static final int T__59=59;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int RULE_INT=7;
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
    public static final int RULE_PREPROCESSING_OP_OR_PUNC=5;
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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:76:1: ruleTest returns [EObject current=null] : ( (lv_elements_0_0= ruleToken ) )* ;
    public final EObject ruleTest() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_elements_0_0 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:79:28: ( ( (lv_elements_0_0= ruleToken ) )* )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:80:1: ( (lv_elements_0_0= ruleToken ) )*
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:80:1: ( (lv_elements_0_0= ruleToken ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_KEYWORD && LA1_0<=RULE_PREPROCESSING_OP_OR_PUNC)||(LA1_0>=RULE_INT && LA1_0<=RULE_STRING_LITERAL)||(LA1_0>=38 && LA1_0<=39)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:81:1: (lv_elements_0_0= ruleToken )
            	    {
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:81:1: (lv_elements_0_0= ruleToken )
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:82:3: lv_elements_0_0= ruleToken
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTestAccess().getElementsTokenParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleToken_in_ruleTest130);
            	    lv_elements_0_0=ruleToken();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTestRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_0_0, 
            	            		"Token");
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


    // $ANTLR start "entryRuleToken"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:108:1: entryRuleToken returns [String current=null] : iv_ruleToken= ruleToken EOF ;
    public final String entryRuleToken() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleToken = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:109:2: (iv_ruleToken= ruleToken EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:110:2: iv_ruleToken= ruleToken EOF
            {
             newCompositeNode(grammarAccess.getTokenRule()); 
            pushFollow(FOLLOW_ruleToken_in_entryRuleToken169);
            iv_ruleToken=ruleToken();

            state._fsp--;

             current =iv_ruleToken.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleToken180); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:117:1: ruleToken returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_KEYWORD_0= RULE_KEYWORD | this_Literal_1= ruleLiteral | (this_PREPROCESSING_OP_OR_PUNC_2= RULE_PREPROCESSING_OP_OR_PUNC this_ID_3= RULE_ID ) ) ;
    public final AntlrDatatypeRuleToken ruleToken() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_KEYWORD_0=null;
        Token this_PREPROCESSING_OP_OR_PUNC_2=null;
        Token this_ID_3=null;
        AntlrDatatypeRuleToken this_Literal_1 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:120:28: ( (this_KEYWORD_0= RULE_KEYWORD | this_Literal_1= ruleLiteral | (this_PREPROCESSING_OP_OR_PUNC_2= RULE_PREPROCESSING_OP_OR_PUNC this_ID_3= RULE_ID ) ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:121:1: (this_KEYWORD_0= RULE_KEYWORD | this_Literal_1= ruleLiteral | (this_PREPROCESSING_OP_OR_PUNC_2= RULE_PREPROCESSING_OP_OR_PUNC this_ID_3= RULE_ID ) )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:121:1: (this_KEYWORD_0= RULE_KEYWORD | this_Literal_1= ruleLiteral | (this_PREPROCESSING_OP_OR_PUNC_2= RULE_PREPROCESSING_OP_OR_PUNC this_ID_3= RULE_ID ) )
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
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:121:6: this_KEYWORD_0= RULE_KEYWORD
                    {
                    this_KEYWORD_0=(Token)match(input,RULE_KEYWORD,FOLLOW_RULE_KEYWORD_in_ruleToken220); 

                    		current.merge(this_KEYWORD_0);
                        
                     
                        newLeafNode(this_KEYWORD_0, grammarAccess.getTokenAccess().getKEYWORDTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:130:5: this_Literal_1= ruleLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getTokenAccess().getLiteralParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleLiteral_in_ruleToken253);
                    this_Literal_1=ruleLiteral();

                    state._fsp--;


                    		current.merge(this_Literal_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:141:6: (this_PREPROCESSING_OP_OR_PUNC_2= RULE_PREPROCESSING_OP_OR_PUNC this_ID_3= RULE_ID )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:141:6: (this_PREPROCESSING_OP_OR_PUNC_2= RULE_PREPROCESSING_OP_OR_PUNC this_ID_3= RULE_ID )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:141:11: this_PREPROCESSING_OP_OR_PUNC_2= RULE_PREPROCESSING_OP_OR_PUNC this_ID_3= RULE_ID
                    {
                    this_PREPROCESSING_OP_OR_PUNC_2=(Token)match(input,RULE_PREPROCESSING_OP_OR_PUNC,FOLLOW_RULE_PREPROCESSING_OP_OR_PUNC_in_ruleToken280); 

                    		current.merge(this_PREPROCESSING_OP_OR_PUNC_2);
                        
                     
                        newLeafNode(this_PREPROCESSING_OP_OR_PUNC_2, grammarAccess.getTokenAccess().getPREPROCESSING_OP_OR_PUNCTerminalRuleCall_2_0()); 
                        
                    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleToken300); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:163:1: entryRuleLiteral returns [String current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final String entryRuleLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteral = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:164:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:165:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral347);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral358); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:172:1: ruleLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_CHARACTER_LITERAL_1= RULE_CHARACTER_LITERAL | this_FLOATING_LITERAL_2= RULE_FLOATING_LITERAL | this_STRING_LITERAL_3= RULE_STRING_LITERAL | ( (kw= 'true' | kw= 'false' ) kw= 'nullptr' ) ) ;
    public final AntlrDatatypeRuleToken ruleLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_CHARACTER_LITERAL_1=null;
        Token this_FLOATING_LITERAL_2=null;
        Token this_STRING_LITERAL_3=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:175:28: ( (this_INT_0= RULE_INT | this_CHARACTER_LITERAL_1= RULE_CHARACTER_LITERAL | this_FLOATING_LITERAL_2= RULE_FLOATING_LITERAL | this_STRING_LITERAL_3= RULE_STRING_LITERAL | ( (kw= 'true' | kw= 'false' ) kw= 'nullptr' ) ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:176:1: (this_INT_0= RULE_INT | this_CHARACTER_LITERAL_1= RULE_CHARACTER_LITERAL | this_FLOATING_LITERAL_2= RULE_FLOATING_LITERAL | this_STRING_LITERAL_3= RULE_STRING_LITERAL | ( (kw= 'true' | kw= 'false' ) kw= 'nullptr' ) )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:176:1: (this_INT_0= RULE_INT | this_CHARACTER_LITERAL_1= RULE_CHARACTER_LITERAL | this_FLOATING_LITERAL_2= RULE_FLOATING_LITERAL | this_STRING_LITERAL_3= RULE_STRING_LITERAL | ( (kw= 'true' | kw= 'false' ) kw= 'nullptr' ) )
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
            case 38:
            case 39:
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
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:176:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLiteral398); 

                    		current.merge(this_INT_0);
                        
                     
                        newLeafNode(this_INT_0, grammarAccess.getLiteralAccess().getINTTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:184:10: this_CHARACTER_LITERAL_1= RULE_CHARACTER_LITERAL
                    {
                    this_CHARACTER_LITERAL_1=(Token)match(input,RULE_CHARACTER_LITERAL,FOLLOW_RULE_CHARACTER_LITERAL_in_ruleLiteral424); 

                    		current.merge(this_CHARACTER_LITERAL_1);
                        
                     
                        newLeafNode(this_CHARACTER_LITERAL_1, grammarAccess.getLiteralAccess().getCHARACTER_LITERALTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:192:10: this_FLOATING_LITERAL_2= RULE_FLOATING_LITERAL
                    {
                    this_FLOATING_LITERAL_2=(Token)match(input,RULE_FLOATING_LITERAL,FOLLOW_RULE_FLOATING_LITERAL_in_ruleLiteral450); 

                    		current.merge(this_FLOATING_LITERAL_2);
                        
                     
                        newLeafNode(this_FLOATING_LITERAL_2, grammarAccess.getLiteralAccess().getFLOATING_LITERALTerminalRuleCall_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:200:10: this_STRING_LITERAL_3= RULE_STRING_LITERAL
                    {
                    this_STRING_LITERAL_3=(Token)match(input,RULE_STRING_LITERAL,FOLLOW_RULE_STRING_LITERAL_in_ruleLiteral476); 

                    		current.merge(this_STRING_LITERAL_3);
                        
                     
                        newLeafNode(this_STRING_LITERAL_3, grammarAccess.getLiteralAccess().getSTRING_LITERALTerminalRuleCall_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:208:6: ( (kw= 'true' | kw= 'false' ) kw= 'nullptr' )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:208:6: ( (kw= 'true' | kw= 'false' ) kw= 'nullptr' )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:208:7: (kw= 'true' | kw= 'false' ) kw= 'nullptr'
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:208:7: (kw= 'true' | kw= 'false' )
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==38) ) {
                        alt3=1;
                    }
                    else if ( (LA3_0==39) ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 0, input);

                        throw nvae;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:209:2: kw= 'true'
                            {
                            kw=(Token)match(input,38,FOLLOW_38_in_ruleLiteral502); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getLiteralAccess().getTrueKeyword_4_0_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:216:2: kw= 'false'
                            {
                            kw=(Token)match(input,39,FOLLOW_39_in_ruleLiteral521); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getLiteralAccess().getFalseKeyword_4_0_1()); 
                                

                            }
                            break;

                    }

                    kw=(Token)match(input,40,FOLLOW_40_in_ruleLiteral535); 

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


    // $ANTLR start "entryRuleOperatorFunctionId"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:235:1: entryRuleOperatorFunctionId returns [String current=null] : iv_ruleOperatorFunctionId= ruleOperatorFunctionId EOF ;
    public final String entryRuleOperatorFunctionId() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperatorFunctionId = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:236:2: (iv_ruleOperatorFunctionId= ruleOperatorFunctionId EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:237:2: iv_ruleOperatorFunctionId= ruleOperatorFunctionId EOF
            {
             newCompositeNode(grammarAccess.getOperatorFunctionIdRule()); 
            pushFollow(FOLLOW_ruleOperatorFunctionId_in_entryRuleOperatorFunctionId577);
            iv_ruleOperatorFunctionId=ruleOperatorFunctionId();

            state._fsp--;

             current =iv_ruleOperatorFunctionId.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperatorFunctionId588); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:244:1: ruleOperatorFunctionId returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'operator' this_OverloadableOperator_1= ruleOverloadableOperator (kw= '<' (this_TemplateArgument_3= ruleTemplateArgument )* kw= '>' )? ) ;
    public final AntlrDatatypeRuleToken ruleOperatorFunctionId() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_OverloadableOperator_1 = null;

        AntlrDatatypeRuleToken this_TemplateArgument_3 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:247:28: ( (kw= 'operator' this_OverloadableOperator_1= ruleOverloadableOperator (kw= '<' (this_TemplateArgument_3= ruleTemplateArgument )* kw= '>' )? ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:248:1: (kw= 'operator' this_OverloadableOperator_1= ruleOverloadableOperator (kw= '<' (this_TemplateArgument_3= ruleTemplateArgument )* kw= '>' )? )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:248:1: (kw= 'operator' this_OverloadableOperator_1= ruleOverloadableOperator (kw= '<' (this_TemplateArgument_3= ruleTemplateArgument )* kw= '>' )? )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:249:2: kw= 'operator' this_OverloadableOperator_1= ruleOverloadableOperator (kw= '<' (this_TemplateArgument_3= ruleTemplateArgument )* kw= '>' )?
            {
            kw=(Token)match(input,41,FOLLOW_41_in_ruleOperatorFunctionId626); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getOperatorFunctionIdAccess().getOperatorKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getOperatorFunctionIdAccess().getOverloadableOperatorParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleOverloadableOperator_in_ruleOperatorFunctionId648);
            this_OverloadableOperator_1=ruleOverloadableOperator();

            state._fsp--;


            		current.merge(this_OverloadableOperator_1);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:265:1: (kw= '<' (this_TemplateArgument_3= ruleTemplateArgument )* kw= '>' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==42) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:266:2: kw= '<' (this_TemplateArgument_3= ruleTemplateArgument )* kw= '>'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleOperatorFunctionId667); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOperatorFunctionIdAccess().getLessThanSignKeyword_2_0()); 
                        
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:271:1: (this_TemplateArgument_3= ruleTemplateArgument )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>=94 && LA5_0<=96)) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:272:5: this_TemplateArgument_3= ruleTemplateArgument
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getOperatorFunctionIdAccess().getTemplateArgumentParserRuleCall_2_1()); 
                    	        
                    	    pushFollow(FOLLOW_ruleTemplateArgument_in_ruleOperatorFunctionId690);
                    	    this_TemplateArgument_3=ruleTemplateArgument();

                    	    state._fsp--;


                    	    		current.merge(this_TemplateArgument_3);
                    	        
                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    kw=(Token)match(input,43,FOLLOW_43_in_ruleOperatorFunctionId710); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:296:1: entryRuleOverloadableOperator returns [String current=null] : iv_ruleOverloadableOperator= ruleOverloadableOperator EOF ;
    public final String entryRuleOverloadableOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOverloadableOperator = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:297:2: (iv_ruleOverloadableOperator= ruleOverloadableOperator EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:298:2: iv_ruleOverloadableOperator= ruleOverloadableOperator EOF
            {
             newCompositeNode(grammarAccess.getOverloadableOperatorRule()); 
            pushFollow(FOLLOW_ruleOverloadableOperator_in_entryRuleOverloadableOperator753);
            iv_ruleOverloadableOperator=ruleOverloadableOperator();

            state._fsp--;

             current =iv_ruleOverloadableOperator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOverloadableOperator764); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:305:1: ruleOverloadableOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'new' | kw= 'delete' | (kw= 'new' kw= '[' kw= ']' ) | (kw= 'delete' kw= '[' kw= ']' ) | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= '^' | kw= '&' | kw= '|' | kw= '~' | kw= '!' | kw= '=' | kw= '<' | kw= '>' | kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' | kw= '^=' | kw= '&=' | kw= '|=' | kw= '<<' | kw= '>>' | kw= '>>=' | kw= '<<=' | kw= '==' | kw= '!=' | kw= '<=' | kw= '>=' | kw= '&&' | kw= '||' | kw= '++' | kw= '--' | kw= ',' | kw= '->*' | kw= '->' | kw= '()' | kw= '[]' ) ;
    public final AntlrDatatypeRuleToken ruleOverloadableOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:308:28: ( (kw= 'new' | kw= 'delete' | (kw= 'new' kw= '[' kw= ']' ) | (kw= 'delete' kw= '[' kw= ']' ) | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= '^' | kw= '&' | kw= '|' | kw= '~' | kw= '!' | kw= '=' | kw= '<' | kw= '>' | kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' | kw= '^=' | kw= '&=' | kw= '|=' | kw= '<<' | kw= '>>' | kw= '>>=' | kw= '<<=' | kw= '==' | kw= '!=' | kw= '<=' | kw= '>=' | kw= '&&' | kw= '||' | kw= '++' | kw= '--' | kw= ',' | kw= '->*' | kw= '->' | kw= '()' | kw= '[]' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:309:1: (kw= 'new' | kw= 'delete' | (kw= 'new' kw= '[' kw= ']' ) | (kw= 'delete' kw= '[' kw= ']' ) | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= '^' | kw= '&' | kw= '|' | kw= '~' | kw= '!' | kw= '=' | kw= '<' | kw= '>' | kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' | kw= '^=' | kw= '&=' | kw= '|=' | kw= '<<' | kw= '>>' | kw= '>>=' | kw= '<<=' | kw= '==' | kw= '!=' | kw= '<=' | kw= '>=' | kw= '&&' | kw= '||' | kw= '++' | kw= '--' | kw= ',' | kw= '->*' | kw= '->' | kw= '()' | kw= '[]' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:309:1: (kw= 'new' | kw= 'delete' | (kw= 'new' kw= '[' kw= ']' ) | (kw= 'delete' kw= '[' kw= ']' ) | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= '^' | kw= '&' | kw= '|' | kw= '~' | kw= '!' | kw= '=' | kw= '<' | kw= '>' | kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' | kw= '^=' | kw= '&=' | kw= '|=' | kw= '<<' | kw= '>>' | kw= '>>=' | kw= '<<=' | kw= '==' | kw= '!=' | kw= '<=' | kw= '>=' | kw= '&&' | kw= '||' | kw= '++' | kw= '--' | kw= ',' | kw= '->*' | kw= '->' | kw= '()' | kw= '[]' )
            int alt7=42;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:310:2: kw= 'new'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleOverloadableOperator802); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getNewKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:317:2: kw= 'delete'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleOverloadableOperator821); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getDeleteKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:323:6: (kw= 'new' kw= '[' kw= ']' )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:323:6: (kw= 'new' kw= '[' kw= ']' )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:324:2: kw= 'new' kw= '[' kw= ']'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleOverloadableOperator841); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getNewKeyword_2_0()); 
                        
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleOverloadableOperator854); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getLeftSquareBracketKeyword_2_1()); 
                        
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleOverloadableOperator867); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getRightSquareBracketKeyword_2_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:342:6: (kw= 'delete' kw= '[' kw= ']' )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:342:6: (kw= 'delete' kw= '[' kw= ']' )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:343:2: kw= 'delete' kw= '[' kw= ']'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleOverloadableOperator888); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getDeleteKeyword_3_0()); 
                        
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleOverloadableOperator901); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getLeftSquareBracketKeyword_3_1()); 
                        
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleOverloadableOperator914); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getRightSquareBracketKeyword_3_2()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:362:2: kw= '+'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleOverloadableOperator934); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getPlusSignKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:369:2: kw= '-'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleOverloadableOperator953); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getHyphenMinusKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:376:2: kw= '*'
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleOverloadableOperator972); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getAsteriskKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:383:2: kw= '/'
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_ruleOverloadableOperator991); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getSolidusKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:390:2: kw= '%'
                    {
                    kw=(Token)match(input,52,FOLLOW_52_in_ruleOverloadableOperator1010); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getPercentSignKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:397:2: kw= '^'
                    {
                    kw=(Token)match(input,53,FOLLOW_53_in_ruleOverloadableOperator1029); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getCircumflexAccentKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:404:2: kw= '&'
                    {
                    kw=(Token)match(input,54,FOLLOW_54_in_ruleOverloadableOperator1048); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getAmpersandKeyword_10()); 
                        

                    }
                    break;
                case 12 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:411:2: kw= '|'
                    {
                    kw=(Token)match(input,55,FOLLOW_55_in_ruleOverloadableOperator1067); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getVerticalLineKeyword_11()); 
                        

                    }
                    break;
                case 13 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:418:2: kw= '~'
                    {
                    kw=(Token)match(input,56,FOLLOW_56_in_ruleOverloadableOperator1086); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getTildeKeyword_12()); 
                        

                    }
                    break;
                case 14 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:425:2: kw= '!'
                    {
                    kw=(Token)match(input,57,FOLLOW_57_in_ruleOverloadableOperator1105); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getExclamationMarkKeyword_13()); 
                        

                    }
                    break;
                case 15 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:432:2: kw= '='
                    {
                    kw=(Token)match(input,58,FOLLOW_58_in_ruleOverloadableOperator1124); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getEqualsSignKeyword_14()); 
                        

                    }
                    break;
                case 16 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:439:2: kw= '<'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleOverloadableOperator1143); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getLessThanSignKeyword_15()); 
                        

                    }
                    break;
                case 17 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:446:2: kw= '>'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleOverloadableOperator1162); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getGreaterThanSignKeyword_16()); 
                        

                    }
                    break;
                case 18 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:453:2: kw= '+='
                    {
                    kw=(Token)match(input,59,FOLLOW_59_in_ruleOverloadableOperator1181); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getPlusSignEqualsSignKeyword_17()); 
                        

                    }
                    break;
                case 19 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:460:2: kw= '-='
                    {
                    kw=(Token)match(input,60,FOLLOW_60_in_ruleOverloadableOperator1200); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getHyphenMinusEqualsSignKeyword_18()); 
                        

                    }
                    break;
                case 20 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:467:2: kw= '*='
                    {
                    kw=(Token)match(input,61,FOLLOW_61_in_ruleOverloadableOperator1219); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getAsteriskEqualsSignKeyword_19()); 
                        

                    }
                    break;
                case 21 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:474:2: kw= '/='
                    {
                    kw=(Token)match(input,62,FOLLOW_62_in_ruleOverloadableOperator1238); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getSolidusEqualsSignKeyword_20()); 
                        

                    }
                    break;
                case 22 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:481:2: kw= '%='
                    {
                    kw=(Token)match(input,63,FOLLOW_63_in_ruleOverloadableOperator1257); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getPercentSignEqualsSignKeyword_21()); 
                        

                    }
                    break;
                case 23 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:488:2: kw= '^='
                    {
                    kw=(Token)match(input,64,FOLLOW_64_in_ruleOverloadableOperator1276); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getCircumflexAccentEqualsSignKeyword_22()); 
                        

                    }
                    break;
                case 24 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:495:2: kw= '&='
                    {
                    kw=(Token)match(input,65,FOLLOW_65_in_ruleOverloadableOperator1295); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getAmpersandEqualsSignKeyword_23()); 
                        

                    }
                    break;
                case 25 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:502:2: kw= '|='
                    {
                    kw=(Token)match(input,66,FOLLOW_66_in_ruleOverloadableOperator1314); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getVerticalLineEqualsSignKeyword_24()); 
                        

                    }
                    break;
                case 26 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:509:2: kw= '<<'
                    {
                    kw=(Token)match(input,67,FOLLOW_67_in_ruleOverloadableOperator1333); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getLessThanSignLessThanSignKeyword_25()); 
                        

                    }
                    break;
                case 27 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:516:2: kw= '>>'
                    {
                    kw=(Token)match(input,68,FOLLOW_68_in_ruleOverloadableOperator1352); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getGreaterThanSignGreaterThanSignKeyword_26()); 
                        

                    }
                    break;
                case 28 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:523:2: kw= '>>='
                    {
                    kw=(Token)match(input,69,FOLLOW_69_in_ruleOverloadableOperator1371); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getGreaterThanSignGreaterThanSignEqualsSignKeyword_27()); 
                        

                    }
                    break;
                case 29 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:530:2: kw= '<<='
                    {
                    kw=(Token)match(input,70,FOLLOW_70_in_ruleOverloadableOperator1390); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getLessThanSignLessThanSignEqualsSignKeyword_28()); 
                        

                    }
                    break;
                case 30 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:537:2: kw= '=='
                    {
                    kw=(Token)match(input,71,FOLLOW_71_in_ruleOverloadableOperator1409); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getEqualsSignEqualsSignKeyword_29()); 
                        

                    }
                    break;
                case 31 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:544:2: kw= '!='
                    {
                    kw=(Token)match(input,72,FOLLOW_72_in_ruleOverloadableOperator1428); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getExclamationMarkEqualsSignKeyword_30()); 
                        

                    }
                    break;
                case 32 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:551:2: kw= '<='
                    {
                    kw=(Token)match(input,73,FOLLOW_73_in_ruleOverloadableOperator1447); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getLessThanSignEqualsSignKeyword_31()); 
                        

                    }
                    break;
                case 33 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:558:2: kw= '>='
                    {
                    kw=(Token)match(input,74,FOLLOW_74_in_ruleOverloadableOperator1466); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getGreaterThanSignEqualsSignKeyword_32()); 
                        

                    }
                    break;
                case 34 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:565:2: kw= '&&'
                    {
                    kw=(Token)match(input,75,FOLLOW_75_in_ruleOverloadableOperator1485); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getAmpersandAmpersandKeyword_33()); 
                        

                    }
                    break;
                case 35 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:572:2: kw= '||'
                    {
                    kw=(Token)match(input,76,FOLLOW_76_in_ruleOverloadableOperator1504); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getVerticalLineVerticalLineKeyword_34()); 
                        

                    }
                    break;
                case 36 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:579:2: kw= '++'
                    {
                    kw=(Token)match(input,77,FOLLOW_77_in_ruleOverloadableOperator1523); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getPlusSignPlusSignKeyword_35()); 
                        

                    }
                    break;
                case 37 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:586:2: kw= '--'
                    {
                    kw=(Token)match(input,78,FOLLOW_78_in_ruleOverloadableOperator1542); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getHyphenMinusHyphenMinusKeyword_36()); 
                        

                    }
                    break;
                case 38 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:593:2: kw= ','
                    {
                    kw=(Token)match(input,79,FOLLOW_79_in_ruleOverloadableOperator1561); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getCommaKeyword_37()); 
                        

                    }
                    break;
                case 39 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:600:2: kw= '->*'
                    {
                    kw=(Token)match(input,80,FOLLOW_80_in_ruleOverloadableOperator1580); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getHyphenMinusGreaterThanSignAsteriskKeyword_38()); 
                        

                    }
                    break;
                case 40 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:607:2: kw= '->'
                    {
                    kw=(Token)match(input,81,FOLLOW_81_in_ruleOverloadableOperator1599); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getHyphenMinusGreaterThanSignKeyword_39()); 
                        

                    }
                    break;
                case 41 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:614:2: kw= '()'
                    {
                    kw=(Token)match(input,82,FOLLOW_82_in_ruleOverloadableOperator1618); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getLeftParenthesisRightParenthesisKeyword_40()); 
                        

                    }
                    break;
                case 42 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:621:2: kw= '[]'
                    {
                    kw=(Token)match(input,83,FOLLOW_83_in_ruleOverloadableOperator1637); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:634:1: entryRuleLiteralOperatorId returns [String current=null] : iv_ruleLiteralOperatorId= ruleLiteralOperatorId EOF ;
    public final String entryRuleLiteralOperatorId() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteralOperatorId = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:635:2: (iv_ruleLiteralOperatorId= ruleLiteralOperatorId EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:636:2: iv_ruleLiteralOperatorId= ruleLiteralOperatorId EOF
            {
             newCompositeNode(grammarAccess.getLiteralOperatorIdRule()); 
            pushFollow(FOLLOW_ruleLiteralOperatorId_in_entryRuleLiteralOperatorId1678);
            iv_ruleLiteralOperatorId=ruleLiteralOperatorId();

            state._fsp--;

             current =iv_ruleLiteralOperatorId.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralOperatorId1689); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:643:1: ruleLiteralOperatorId returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'operator' kw= '\"' kw= '\"' ) ;
    public final AntlrDatatypeRuleToken ruleLiteralOperatorId() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:646:28: ( (kw= 'operator' kw= '\"' kw= '\"' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:647:1: (kw= 'operator' kw= '\"' kw= '\"' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:647:1: (kw= 'operator' kw= '\"' kw= '\"' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:648:2: kw= 'operator' kw= '\"' kw= '\"'
            {
            kw=(Token)match(input,41,FOLLOW_41_in_ruleLiteralOperatorId1727); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getLiteralOperatorIdAccess().getOperatorKeyword_0()); 
                
            kw=(Token)match(input,84,FOLLOW_84_in_ruleLiteralOperatorId1740); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getLiteralOperatorIdAccess().getQuotationMarkKeyword_1()); 
                
            kw=(Token)match(input,84,FOLLOW_84_in_ruleLiteralOperatorId1753); 

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


    // $ANTLR start "entryRuleTemplateParameterList"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:675:1: entryRuleTemplateParameterList returns [String current=null] : iv_ruleTemplateParameterList= ruleTemplateParameterList EOF ;
    public final String entryRuleTemplateParameterList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTemplateParameterList = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:676:2: (iv_ruleTemplateParameterList= ruleTemplateParameterList EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:677:2: iv_ruleTemplateParameterList= ruleTemplateParameterList EOF
            {
             newCompositeNode(grammarAccess.getTemplateParameterListRule()); 
            pushFollow(FOLLOW_ruleTemplateParameterList_in_entryRuleTemplateParameterList1796);
            iv_ruleTemplateParameterList=ruleTemplateParameterList();

            state._fsp--;

             current =iv_ruleTemplateParameterList.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateParameterList1807); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:684:1: ruleTemplateParameterList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TemplateParameter_0= ruleTemplateParameter (kw= ',' this_TemplateParameter_2= ruleTemplateParameter )* ) ;
    public final AntlrDatatypeRuleToken ruleTemplateParameterList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_TemplateParameter_0 = null;

        AntlrDatatypeRuleToken this_TemplateParameter_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:687:28: ( (this_TemplateParameter_0= ruleTemplateParameter (kw= ',' this_TemplateParameter_2= ruleTemplateParameter )* ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:688:1: (this_TemplateParameter_0= ruleTemplateParameter (kw= ',' this_TemplateParameter_2= ruleTemplateParameter )* )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:688:1: (this_TemplateParameter_0= ruleTemplateParameter (kw= ',' this_TemplateParameter_2= ruleTemplateParameter )* )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:689:5: this_TemplateParameter_0= ruleTemplateParameter (kw= ',' this_TemplateParameter_2= ruleTemplateParameter )*
            {
             
                    newCompositeNode(grammarAccess.getTemplateParameterListAccess().getTemplateParameterParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleTemplateParameter_in_ruleTemplateParameterList1854);
            this_TemplateParameter_0=ruleTemplateParameter();

            state._fsp--;


            		current.merge(this_TemplateParameter_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:699:1: (kw= ',' this_TemplateParameter_2= ruleTemplateParameter )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==79) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:700:2: kw= ',' this_TemplateParameter_2= ruleTemplateParameter
            	    {
            	    kw=(Token)match(input,79,FOLLOW_79_in_ruleTemplateParameterList1873); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getTemplateParameterListAccess().getCommaKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getTemplateParameterListAccess().getTemplateParameterParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_ruleTemplateParameter_in_ruleTemplateParameterList1895);
            	    this_TemplateParameter_2=ruleTemplateParameter();

            	    state._fsp--;


            	    		current.merge(this_TemplateParameter_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop8;
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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:724:1: entryRuleTemplateParameter returns [String current=null] : iv_ruleTemplateParameter= ruleTemplateParameter EOF ;
    public final String entryRuleTemplateParameter() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTemplateParameter = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:725:2: (iv_ruleTemplateParameter= ruleTemplateParameter EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:726:2: iv_ruleTemplateParameter= ruleTemplateParameter EOF
            {
             newCompositeNode(grammarAccess.getTemplateParameterRule()); 
            pushFollow(FOLLOW_ruleTemplateParameter_in_entryRuleTemplateParameter1943);
            iv_ruleTemplateParameter=ruleTemplateParameter();

            state._fsp--;

             current =iv_ruleTemplateParameter.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateParameter1954); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:733:1: ruleTemplateParameter returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TypeParameter_0= ruleTypeParameter | this_ParameterDeclaration_1= ruleParameterDeclaration ) ;
    public final AntlrDatatypeRuleToken ruleTemplateParameter() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_TypeParameter_0 = null;

        AntlrDatatypeRuleToken this_ParameterDeclaration_1 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:736:28: ( (this_TypeParameter_0= ruleTypeParameter | this_ParameterDeclaration_1= ruleParameterDeclaration ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:737:1: (this_TypeParameter_0= ruleTypeParameter | this_ParameterDeclaration_1= ruleParameterDeclaration )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:737:1: (this_TypeParameter_0= ruleTypeParameter | this_ParameterDeclaration_1= ruleParameterDeclaration )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==85||(LA9_0>=87 && LA9_0<=88)) ) {
                alt9=1;
            }
            else if ( (LA9_0==97) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:738:5: this_TypeParameter_0= ruleTypeParameter
                    {
                     
                            newCompositeNode(grammarAccess.getTemplateParameterAccess().getTypeParameterParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleTypeParameter_in_ruleTemplateParameter2001);
                    this_TypeParameter_0=ruleTypeParameter();

                    state._fsp--;


                    		current.merge(this_TypeParameter_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:750:5: this_ParameterDeclaration_1= ruleParameterDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getTemplateParameterAccess().getParameterDeclarationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleParameterDeclaration_in_ruleTemplateParameter2034);
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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:768:1: entryRuleTypeParameter returns [String current=null] : iv_ruleTypeParameter= ruleTypeParameter EOF ;
    public final String entryRuleTypeParameter() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeParameter = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:769:2: (iv_ruleTypeParameter= ruleTypeParameter EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:770:2: iv_ruleTypeParameter= ruleTypeParameter EOF
            {
             newCompositeNode(grammarAccess.getTypeParameterRule()); 
            pushFollow(FOLLOW_ruleTypeParameter_in_entryRuleTypeParameter2080);
            iv_ruleTypeParameter=ruleTypeParameter();

            state._fsp--;

             current =iv_ruleTypeParameter.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeParameter2091); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:777:1: ruleTypeParameter returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'class' ( ( (kw= '...' )? (this_ID_2= RULE_ID )? ) | ( (this_ID_3= RULE_ID )? kw= '=' this_TypeId_5= ruleTypeId ) ) ) | (kw= 'typename' ( ( (kw= '...' )? (this_ID_8= RULE_ID )? ) | ( (this_ID_9= RULE_ID )? kw= '=' this_TypeId_11= ruleTypeId ) ) ) | (kw= 'template' kw= '<' this_TemplateParameterList_14= ruleTemplateParameterList kw= '>' kw= 'class' ( ( (kw= '...' )? (this_ID_18= RULE_ID )? ) | ( (this_ID_19= RULE_ID )? kw= '=' this_IdExpression_21= ruleIdExpression ) ) ) ) ;
    public final AntlrDatatypeRuleToken ruleTypeParameter() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;
        Token this_ID_3=null;
        Token this_ID_8=null;
        Token this_ID_9=null;
        Token this_ID_18=null;
        Token this_ID_19=null;
        AntlrDatatypeRuleToken this_TypeId_5 = null;

        AntlrDatatypeRuleToken this_TypeId_11 = null;

        AntlrDatatypeRuleToken this_TemplateParameterList_14 = null;

        AntlrDatatypeRuleToken this_IdExpression_21 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:780:28: ( ( (kw= 'class' ( ( (kw= '...' )? (this_ID_2= RULE_ID )? ) | ( (this_ID_3= RULE_ID )? kw= '=' this_TypeId_5= ruleTypeId ) ) ) | (kw= 'typename' ( ( (kw= '...' )? (this_ID_8= RULE_ID )? ) | ( (this_ID_9= RULE_ID )? kw= '=' this_TypeId_11= ruleTypeId ) ) ) | (kw= 'template' kw= '<' this_TemplateParameterList_14= ruleTemplateParameterList kw= '>' kw= 'class' ( ( (kw= '...' )? (this_ID_18= RULE_ID )? ) | ( (this_ID_19= RULE_ID )? kw= '=' this_IdExpression_21= ruleIdExpression ) ) ) ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:781:1: ( (kw= 'class' ( ( (kw= '...' )? (this_ID_2= RULE_ID )? ) | ( (this_ID_3= RULE_ID )? kw= '=' this_TypeId_5= ruleTypeId ) ) ) | (kw= 'typename' ( ( (kw= '...' )? (this_ID_8= RULE_ID )? ) | ( (this_ID_9= RULE_ID )? kw= '=' this_TypeId_11= ruleTypeId ) ) ) | (kw= 'template' kw= '<' this_TemplateParameterList_14= ruleTemplateParameterList kw= '>' kw= 'class' ( ( (kw= '...' )? (this_ID_18= RULE_ID )? ) | ( (this_ID_19= RULE_ID )? kw= '=' this_IdExpression_21= ruleIdExpression ) ) ) )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:781:1: ( (kw= 'class' ( ( (kw= '...' )? (this_ID_2= RULE_ID )? ) | ( (this_ID_3= RULE_ID )? kw= '=' this_TypeId_5= ruleTypeId ) ) ) | (kw= 'typename' ( ( (kw= '...' )? (this_ID_8= RULE_ID )? ) | ( (this_ID_9= RULE_ID )? kw= '=' this_TypeId_11= ruleTypeId ) ) ) | (kw= 'template' kw= '<' this_TemplateParameterList_14= ruleTemplateParameterList kw= '>' kw= 'class' ( ( (kw= '...' )? (this_ID_18= RULE_ID )? ) | ( (this_ID_19= RULE_ID )? kw= '=' this_IdExpression_21= ruleIdExpression ) ) ) )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 85:
                {
                alt22=1;
                }
                break;
            case 87:
                {
                alt22=2;
                }
                break;
            case 88:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:781:2: (kw= 'class' ( ( (kw= '...' )? (this_ID_2= RULE_ID )? ) | ( (this_ID_3= RULE_ID )? kw= '=' this_TypeId_5= ruleTypeId ) ) )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:781:2: (kw= 'class' ( ( (kw= '...' )? (this_ID_2= RULE_ID )? ) | ( (this_ID_3= RULE_ID )? kw= '=' this_TypeId_5= ruleTypeId ) ) )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:782:2: kw= 'class' ( ( (kw= '...' )? (this_ID_2= RULE_ID )? ) | ( (this_ID_3= RULE_ID )? kw= '=' this_TypeId_5= ruleTypeId ) )
                    {
                    kw=(Token)match(input,85,FOLLOW_85_in_ruleTypeParameter2130); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeParameterAccess().getClassKeyword_0_0()); 
                        
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:787:1: ( ( (kw= '...' )? (this_ID_2= RULE_ID )? ) | ( (this_ID_3= RULE_ID )? kw= '=' this_TypeId_5= ruleTypeId ) )
                    int alt13=2;
                    switch ( input.LA(1) ) {
                    case EOF:
                    case 43:
                    case 79:
                    case 86:
                        {
                        alt13=1;
                        }
                        break;
                    case RULE_ID:
                        {
                        int LA13_2 = input.LA(2);

                        if ( (LA13_2==58) ) {
                            alt13=2;
                        }
                        else if ( (LA13_2==EOF||LA13_2==43||LA13_2==79) ) {
                            alt13=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 13, 2, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 58:
                        {
                        alt13=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }

                    switch (alt13) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:787:2: ( (kw= '...' )? (this_ID_2= RULE_ID )? )
                            {
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:787:2: ( (kw= '...' )? (this_ID_2= RULE_ID )? )
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:787:3: (kw= '...' )? (this_ID_2= RULE_ID )?
                            {
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:787:3: (kw= '...' )?
                            int alt10=2;
                            int LA10_0 = input.LA(1);

                            if ( (LA10_0==86) ) {
                                alt10=1;
                            }
                            switch (alt10) {
                                case 1 :
                                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:788:2: kw= '...'
                                    {
                                    kw=(Token)match(input,86,FOLLOW_86_in_ruleTypeParameter2146); 

                                            current.merge(kw);
                                            newLeafNode(kw, grammarAccess.getTypeParameterAccess().getFullStopFullStopFullStopKeyword_0_1_0_0()); 
                                        

                                    }
                                    break;

                            }

                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:793:3: (this_ID_2= RULE_ID )?
                            int alt11=2;
                            int LA11_0 = input.LA(1);

                            if ( (LA11_0==RULE_ID) ) {
                                alt11=1;
                            }
                            switch (alt11) {
                                case 1 :
                                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:793:8: this_ID_2= RULE_ID
                                    {
                                    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeParameter2164); 

                                    		current.merge(this_ID_2);
                                        
                                     
                                        newLeafNode(this_ID_2, grammarAccess.getTypeParameterAccess().getIDTerminalRuleCall_0_1_0_1()); 
                                        

                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:801:6: ( (this_ID_3= RULE_ID )? kw= '=' this_TypeId_5= ruleTypeId )
                            {
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:801:6: ( (this_ID_3= RULE_ID )? kw= '=' this_TypeId_5= ruleTypeId )
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:801:7: (this_ID_3= RULE_ID )? kw= '=' this_TypeId_5= ruleTypeId
                            {
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:801:7: (this_ID_3= RULE_ID )?
                            int alt12=2;
                            int LA12_0 = input.LA(1);

                            if ( (LA12_0==RULE_ID) ) {
                                alt12=1;
                            }
                            switch (alt12) {
                                case 1 :
                                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:801:12: this_ID_3= RULE_ID
                                    {
                                    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeParameter2195); 

                                    		current.merge(this_ID_3);
                                        
                                     
                                        newLeafNode(this_ID_3, grammarAccess.getTypeParameterAccess().getIDTerminalRuleCall_0_1_1_0()); 
                                        

                                    }
                                    break;

                            }

                            kw=(Token)match(input,58,FOLLOW_58_in_ruleTypeParameter2215); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getTypeParameterAccess().getEqualsSignKeyword_0_1_1_1()); 
                                
                             
                                    newCompositeNode(grammarAccess.getTypeParameterAccess().getTypeIdParserRuleCall_0_1_1_2()); 
                                
                            pushFollow(FOLLOW_ruleTypeId_in_ruleTypeParameter2237);
                            this_TypeId_5=ruleTypeId();

                            state._fsp--;


                            		current.merge(this_TypeId_5);
                                
                             
                                    afterParserOrEnumRuleCall();
                                

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:826:6: (kw= 'typename' ( ( (kw= '...' )? (this_ID_8= RULE_ID )? ) | ( (this_ID_9= RULE_ID )? kw= '=' this_TypeId_11= ruleTypeId ) ) )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:826:6: (kw= 'typename' ( ( (kw= '...' )? (this_ID_8= RULE_ID )? ) | ( (this_ID_9= RULE_ID )? kw= '=' this_TypeId_11= ruleTypeId ) ) )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:827:2: kw= 'typename' ( ( (kw= '...' )? (this_ID_8= RULE_ID )? ) | ( (this_ID_9= RULE_ID )? kw= '=' this_TypeId_11= ruleTypeId ) )
                    {
                    kw=(Token)match(input,87,FOLLOW_87_in_ruleTypeParameter2265); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeParameterAccess().getTypenameKeyword_1_0()); 
                        
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:832:1: ( ( (kw= '...' )? (this_ID_8= RULE_ID )? ) | ( (this_ID_9= RULE_ID )? kw= '=' this_TypeId_11= ruleTypeId ) )
                    int alt17=2;
                    switch ( input.LA(1) ) {
                    case EOF:
                    case 43:
                    case 79:
                    case 86:
                        {
                        alt17=1;
                        }
                        break;
                    case RULE_ID:
                        {
                        int LA17_2 = input.LA(2);

                        if ( (LA17_2==EOF||LA17_2==43||LA17_2==79) ) {
                            alt17=1;
                        }
                        else if ( (LA17_2==58) ) {
                            alt17=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 17, 2, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 58:
                        {
                        alt17=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 0, input);

                        throw nvae;
                    }

                    switch (alt17) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:832:2: ( (kw= '...' )? (this_ID_8= RULE_ID )? )
                            {
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:832:2: ( (kw= '...' )? (this_ID_8= RULE_ID )? )
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:832:3: (kw= '...' )? (this_ID_8= RULE_ID )?
                            {
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:832:3: (kw= '...' )?
                            int alt14=2;
                            int LA14_0 = input.LA(1);

                            if ( (LA14_0==86) ) {
                                alt14=1;
                            }
                            switch (alt14) {
                                case 1 :
                                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:833:2: kw= '...'
                                    {
                                    kw=(Token)match(input,86,FOLLOW_86_in_ruleTypeParameter2281); 

                                            current.merge(kw);
                                            newLeafNode(kw, grammarAccess.getTypeParameterAccess().getFullStopFullStopFullStopKeyword_1_1_0_0()); 
                                        

                                    }
                                    break;

                            }

                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:838:3: (this_ID_8= RULE_ID )?
                            int alt15=2;
                            int LA15_0 = input.LA(1);

                            if ( (LA15_0==RULE_ID) ) {
                                alt15=1;
                            }
                            switch (alt15) {
                                case 1 :
                                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:838:8: this_ID_8= RULE_ID
                                    {
                                    this_ID_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeParameter2299); 

                                    		current.merge(this_ID_8);
                                        
                                     
                                        newLeafNode(this_ID_8, grammarAccess.getTypeParameterAccess().getIDTerminalRuleCall_1_1_0_1()); 
                                        

                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:846:6: ( (this_ID_9= RULE_ID )? kw= '=' this_TypeId_11= ruleTypeId )
                            {
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:846:6: ( (this_ID_9= RULE_ID )? kw= '=' this_TypeId_11= ruleTypeId )
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:846:7: (this_ID_9= RULE_ID )? kw= '=' this_TypeId_11= ruleTypeId
                            {
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:846:7: (this_ID_9= RULE_ID )?
                            int alt16=2;
                            int LA16_0 = input.LA(1);

                            if ( (LA16_0==RULE_ID) ) {
                                alt16=1;
                            }
                            switch (alt16) {
                                case 1 :
                                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:846:12: this_ID_9= RULE_ID
                                    {
                                    this_ID_9=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeParameter2330); 

                                    		current.merge(this_ID_9);
                                        
                                     
                                        newLeafNode(this_ID_9, grammarAccess.getTypeParameterAccess().getIDTerminalRuleCall_1_1_1_0()); 
                                        

                                    }
                                    break;

                            }

                            kw=(Token)match(input,58,FOLLOW_58_in_ruleTypeParameter2350); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getTypeParameterAccess().getEqualsSignKeyword_1_1_1_1()); 
                                
                             
                                    newCompositeNode(grammarAccess.getTypeParameterAccess().getTypeIdParserRuleCall_1_1_1_2()); 
                                
                            pushFollow(FOLLOW_ruleTypeId_in_ruleTypeParameter2372);
                            this_TypeId_11=ruleTypeId();

                            state._fsp--;


                            		current.merge(this_TypeId_11);
                                
                             
                                    afterParserOrEnumRuleCall();
                                

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:871:6: (kw= 'template' kw= '<' this_TemplateParameterList_14= ruleTemplateParameterList kw= '>' kw= 'class' ( ( (kw= '...' )? (this_ID_18= RULE_ID )? ) | ( (this_ID_19= RULE_ID )? kw= '=' this_IdExpression_21= ruleIdExpression ) ) )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:871:6: (kw= 'template' kw= '<' this_TemplateParameterList_14= ruleTemplateParameterList kw= '>' kw= 'class' ( ( (kw= '...' )? (this_ID_18= RULE_ID )? ) | ( (this_ID_19= RULE_ID )? kw= '=' this_IdExpression_21= ruleIdExpression ) ) )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:872:2: kw= 'template' kw= '<' this_TemplateParameterList_14= ruleTemplateParameterList kw= '>' kw= 'class' ( ( (kw= '...' )? (this_ID_18= RULE_ID )? ) | ( (this_ID_19= RULE_ID )? kw= '=' this_IdExpression_21= ruleIdExpression ) )
                    {
                    kw=(Token)match(input,88,FOLLOW_88_in_ruleTypeParameter2400); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeParameterAccess().getTemplateKeyword_2_0()); 
                        
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleTypeParameter2413); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeParameterAccess().getLessThanSignKeyword_2_1()); 
                        
                     
                            newCompositeNode(grammarAccess.getTypeParameterAccess().getTemplateParameterListParserRuleCall_2_2()); 
                        
                    pushFollow(FOLLOW_ruleTemplateParameterList_in_ruleTypeParameter2435);
                    this_TemplateParameterList_14=ruleTemplateParameterList();

                    state._fsp--;


                    		current.merge(this_TemplateParameterList_14);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleTypeParameter2453); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeParameterAccess().getGreaterThanSignKeyword_2_3()); 
                        
                    kw=(Token)match(input,85,FOLLOW_85_in_ruleTypeParameter2466); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeParameterAccess().getClassKeyword_2_4()); 
                        
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:906:1: ( ( (kw= '...' )? (this_ID_18= RULE_ID )? ) | ( (this_ID_19= RULE_ID )? kw= '=' this_IdExpression_21= ruleIdExpression ) )
                    int alt21=2;
                    switch ( input.LA(1) ) {
                    case EOF:
                    case 43:
                    case 79:
                    case 86:
                        {
                        alt21=1;
                        }
                        break;
                    case RULE_ID:
                        {
                        int LA21_2 = input.LA(2);

                        if ( (LA21_2==58) ) {
                            alt21=2;
                        }
                        else if ( (LA21_2==EOF||LA21_2==43||LA21_2==79) ) {
                            alt21=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 21, 2, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 58:
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
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:906:2: ( (kw= '...' )? (this_ID_18= RULE_ID )? )
                            {
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:906:2: ( (kw= '...' )? (this_ID_18= RULE_ID )? )
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:906:3: (kw= '...' )? (this_ID_18= RULE_ID )?
                            {
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:906:3: (kw= '...' )?
                            int alt18=2;
                            int LA18_0 = input.LA(1);

                            if ( (LA18_0==86) ) {
                                alt18=1;
                            }
                            switch (alt18) {
                                case 1 :
                                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:907:2: kw= '...'
                                    {
                                    kw=(Token)match(input,86,FOLLOW_86_in_ruleTypeParameter2482); 

                                            current.merge(kw);
                                            newLeafNode(kw, grammarAccess.getTypeParameterAccess().getFullStopFullStopFullStopKeyword_2_5_0_0()); 
                                        

                                    }
                                    break;

                            }

                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:912:3: (this_ID_18= RULE_ID )?
                            int alt19=2;
                            int LA19_0 = input.LA(1);

                            if ( (LA19_0==RULE_ID) ) {
                                alt19=1;
                            }
                            switch (alt19) {
                                case 1 :
                                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:912:8: this_ID_18= RULE_ID
                                    {
                                    this_ID_18=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeParameter2500); 

                                    		current.merge(this_ID_18);
                                        
                                     
                                        newLeafNode(this_ID_18, grammarAccess.getTypeParameterAccess().getIDTerminalRuleCall_2_5_0_1()); 
                                        

                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:920:6: ( (this_ID_19= RULE_ID )? kw= '=' this_IdExpression_21= ruleIdExpression )
                            {
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:920:6: ( (this_ID_19= RULE_ID )? kw= '=' this_IdExpression_21= ruleIdExpression )
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:920:7: (this_ID_19= RULE_ID )? kw= '=' this_IdExpression_21= ruleIdExpression
                            {
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:920:7: (this_ID_19= RULE_ID )?
                            int alt20=2;
                            int LA20_0 = input.LA(1);

                            if ( (LA20_0==RULE_ID) ) {
                                alt20=1;
                            }
                            switch (alt20) {
                                case 1 :
                                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:920:12: this_ID_19= RULE_ID
                                    {
                                    this_ID_19=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeParameter2531); 

                                    		current.merge(this_ID_19);
                                        
                                     
                                        newLeafNode(this_ID_19, grammarAccess.getTypeParameterAccess().getIDTerminalRuleCall_2_5_1_0()); 
                                        

                                    }
                                    break;

                            }

                            kw=(Token)match(input,58,FOLLOW_58_in_ruleTypeParameter2551); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getTypeParameterAccess().getEqualsSignKeyword_2_5_1_1()); 
                                
                             
                                    newCompositeNode(grammarAccess.getTypeParameterAccess().getIdExpressionParserRuleCall_2_5_1_2()); 
                                
                            pushFollow(FOLLOW_ruleIdExpression_in_ruleTypeParameter2573);
                            this_IdExpression_21=ruleIdExpression();

                            state._fsp--;


                            		current.merge(this_IdExpression_21);
                                
                             
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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:952:1: entryRuleSimpleTemplateId returns [String current=null] : iv_ruleSimpleTemplateId= ruleSimpleTemplateId EOF ;
    public final String entryRuleSimpleTemplateId() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSimpleTemplateId = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:953:2: (iv_ruleSimpleTemplateId= ruleSimpleTemplateId EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:954:2: iv_ruleSimpleTemplateId= ruleSimpleTemplateId EOF
            {
             newCompositeNode(grammarAccess.getSimpleTemplateIdRule()); 
            pushFollow(FOLLOW_ruleSimpleTemplateId_in_entryRuleSimpleTemplateId2622);
            iv_ruleSimpleTemplateId=ruleSimpleTemplateId();

            state._fsp--;

             current =iv_ruleSimpleTemplateId.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleTemplateId2633); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:961:1: ruleSimpleTemplateId returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID kw= '<' this_TemplateArgumentList_2= ruleTemplateArgumentList kw= '>' ) ;
    public final AntlrDatatypeRuleToken ruleSimpleTemplateId() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_TemplateArgumentList_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:964:28: ( (this_ID_0= RULE_ID kw= '<' this_TemplateArgumentList_2= ruleTemplateArgumentList kw= '>' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:965:1: (this_ID_0= RULE_ID kw= '<' this_TemplateArgumentList_2= ruleTemplateArgumentList kw= '>' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:965:1: (this_ID_0= RULE_ID kw= '<' this_TemplateArgumentList_2= ruleTemplateArgumentList kw= '>' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:965:6: this_ID_0= RULE_ID kw= '<' this_TemplateArgumentList_2= ruleTemplateArgumentList kw= '>'
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSimpleTemplateId2673); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getSimpleTemplateIdAccess().getIDTerminalRuleCall_0()); 
                
            kw=(Token)match(input,42,FOLLOW_42_in_ruleSimpleTemplateId2691); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getSimpleTemplateIdAccess().getLessThanSignKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getSimpleTemplateIdAccess().getTemplateArgumentListParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleTemplateArgumentList_in_ruleSimpleTemplateId2713);
            this_TemplateArgumentList_2=ruleTemplateArgumentList();

            state._fsp--;


            		current.merge(this_TemplateArgumentList_2);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,43,FOLLOW_43_in_ruleSimpleTemplateId2731); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1005:1: entryRuleTemplateArgumentList returns [String current=null] : iv_ruleTemplateArgumentList= ruleTemplateArgumentList EOF ;
    public final String entryRuleTemplateArgumentList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTemplateArgumentList = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1006:2: (iv_ruleTemplateArgumentList= ruleTemplateArgumentList EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1007:2: iv_ruleTemplateArgumentList= ruleTemplateArgumentList EOF
            {
             newCompositeNode(grammarAccess.getTemplateArgumentListRule()); 
            pushFollow(FOLLOW_ruleTemplateArgumentList_in_entryRuleTemplateArgumentList2774);
            iv_ruleTemplateArgumentList=ruleTemplateArgumentList();

            state._fsp--;

             current =iv_ruleTemplateArgumentList.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateArgumentList2785); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1014:1: ruleTemplateArgumentList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TemplateArgument_0= ruleTemplateArgument (kw= '...' )? (kw= ',' this_TemplateArgument_3= ruleTemplateArgument (kw= '...' )? )* ) ;
    public final AntlrDatatypeRuleToken ruleTemplateArgumentList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_TemplateArgument_0 = null;

        AntlrDatatypeRuleToken this_TemplateArgument_3 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1017:28: ( (this_TemplateArgument_0= ruleTemplateArgument (kw= '...' )? (kw= ',' this_TemplateArgument_3= ruleTemplateArgument (kw= '...' )? )* ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1018:1: (this_TemplateArgument_0= ruleTemplateArgument (kw= '...' )? (kw= ',' this_TemplateArgument_3= ruleTemplateArgument (kw= '...' )? )* )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1018:1: (this_TemplateArgument_0= ruleTemplateArgument (kw= '...' )? (kw= ',' this_TemplateArgument_3= ruleTemplateArgument (kw= '...' )? )* )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1019:5: this_TemplateArgument_0= ruleTemplateArgument (kw= '...' )? (kw= ',' this_TemplateArgument_3= ruleTemplateArgument (kw= '...' )? )*
            {
             
                    newCompositeNode(grammarAccess.getTemplateArgumentListAccess().getTemplateArgumentParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleTemplateArgument_in_ruleTemplateArgumentList2832);
            this_TemplateArgument_0=ruleTemplateArgument();

            state._fsp--;


            		current.merge(this_TemplateArgument_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1029:1: (kw= '...' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==86) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1030:2: kw= '...'
                    {
                    kw=(Token)match(input,86,FOLLOW_86_in_ruleTemplateArgumentList2851); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTemplateArgumentListAccess().getFullStopFullStopFullStopKeyword_1()); 
                        

                    }
                    break;

            }

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1035:3: (kw= ',' this_TemplateArgument_3= ruleTemplateArgument (kw= '...' )? )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==79) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1036:2: kw= ',' this_TemplateArgument_3= ruleTemplateArgument (kw= '...' )?
            	    {
            	    kw=(Token)match(input,79,FOLLOW_79_in_ruleTemplateArgumentList2867); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getTemplateArgumentListAccess().getCommaKeyword_2_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getTemplateArgumentListAccess().getTemplateArgumentParserRuleCall_2_1()); 
            	        
            	    pushFollow(FOLLOW_ruleTemplateArgument_in_ruleTemplateArgumentList2889);
            	    this_TemplateArgument_3=ruleTemplateArgument();

            	    state._fsp--;


            	    		current.merge(this_TemplateArgument_3);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1052:1: (kw= '...' )?
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0==86) ) {
            	        alt24=1;
            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1053:2: kw= '...'
            	            {
            	            kw=(Token)match(input,86,FOLLOW_86_in_ruleTemplateArgumentList2908); 

            	                    current.merge(kw);
            	                    newLeafNode(kw, grammarAccess.getTemplateArgumentListAccess().getFullStopFullStopFullStopKeyword_2_2()); 
            	                

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1066:1: entryRuleTemplateArgument returns [String current=null] : iv_ruleTemplateArgument= ruleTemplateArgument EOF ;
    public final String entryRuleTemplateArgument() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTemplateArgument = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1067:2: (iv_ruleTemplateArgument= ruleTemplateArgument EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1068:2: iv_ruleTemplateArgument= ruleTemplateArgument EOF
            {
             newCompositeNode(grammarAccess.getTemplateArgumentRule()); 
            pushFollow(FOLLOW_ruleTemplateArgument_in_entryRuleTemplateArgument2953);
            iv_ruleTemplateArgument=ruleTemplateArgument();

            state._fsp--;

             current =iv_ruleTemplateArgument.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateArgument2964); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1075:1: ruleTemplateArgument returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ConstantExpression_0= ruleConstantExpression | this_TypeId_1= ruleTypeId | this_IdExpression_2= ruleIdExpression ) ;
    public final AntlrDatatypeRuleToken ruleTemplateArgument() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_ConstantExpression_0 = null;

        AntlrDatatypeRuleToken this_TypeId_1 = null;

        AntlrDatatypeRuleToken this_IdExpression_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1078:28: ( (this_ConstantExpression_0= ruleConstantExpression | this_TypeId_1= ruleTypeId | this_IdExpression_2= ruleIdExpression ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1079:1: (this_ConstantExpression_0= ruleConstantExpression | this_TypeId_1= ruleTypeId | this_IdExpression_2= ruleIdExpression )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1079:1: (this_ConstantExpression_0= ruleConstantExpression | this_TypeId_1= ruleTypeId | this_IdExpression_2= ruleIdExpression )
            int alt26=3;
            switch ( input.LA(1) ) {
            case 94:
                {
                alt26=1;
                }
                break;
            case 95:
                {
                alt26=2;
                }
                break;
            case 96:
                {
                alt26=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1080:5: this_ConstantExpression_0= ruleConstantExpression
                    {
                     
                            newCompositeNode(grammarAccess.getTemplateArgumentAccess().getConstantExpressionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleConstantExpression_in_ruleTemplateArgument3011);
                    this_ConstantExpression_0=ruleConstantExpression();

                    state._fsp--;


                    		current.merge(this_ConstantExpression_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1092:5: this_TypeId_1= ruleTypeId
                    {
                     
                            newCompositeNode(grammarAccess.getTemplateArgumentAccess().getTypeIdParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleTypeId_in_ruleTemplateArgument3044);
                    this_TypeId_1=ruleTypeId();

                    state._fsp--;


                    		current.merge(this_TypeId_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1104:5: this_IdExpression_2= ruleIdExpression
                    {
                     
                            newCompositeNode(grammarAccess.getTemplateArgumentAccess().getIdExpressionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleIdExpression_in_ruleTemplateArgument3077);
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


    // $ANTLR start "entryRuleHandler"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1132:1: entryRuleHandler returns [String current=null] : iv_ruleHandler= ruleHandler EOF ;
    public final String entryRuleHandler() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleHandler = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1133:2: (iv_ruleHandler= ruleHandler EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1134:2: iv_ruleHandler= ruleHandler EOF
            {
             newCompositeNode(grammarAccess.getHandlerRule()); 
            pushFollow(FOLLOW_ruleHandler_in_entryRuleHandler3133);
            iv_ruleHandler=ruleHandler();

            state._fsp--;

             current =iv_ruleHandler.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHandler3144); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1141:1: ruleHandler returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'catch' kw= '(' this_ExceptionDeclaration_2= ruleExceptionDeclaration kw= ')' this_CompoundStatement_4= ruleCompoundStatement ) ;
    public final AntlrDatatypeRuleToken ruleHandler() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ExceptionDeclaration_2 = null;

        AntlrDatatypeRuleToken this_CompoundStatement_4 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1144:28: ( (kw= 'catch' kw= '(' this_ExceptionDeclaration_2= ruleExceptionDeclaration kw= ')' this_CompoundStatement_4= ruleCompoundStatement ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1145:1: (kw= 'catch' kw= '(' this_ExceptionDeclaration_2= ruleExceptionDeclaration kw= ')' this_CompoundStatement_4= ruleCompoundStatement )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1145:1: (kw= 'catch' kw= '(' this_ExceptionDeclaration_2= ruleExceptionDeclaration kw= ')' this_CompoundStatement_4= ruleCompoundStatement )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1146:2: kw= 'catch' kw= '(' this_ExceptionDeclaration_2= ruleExceptionDeclaration kw= ')' this_CompoundStatement_4= ruleCompoundStatement
            {
            kw=(Token)match(input,89,FOLLOW_89_in_ruleHandler3182); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getHandlerAccess().getCatchKeyword_0()); 
                
            kw=(Token)match(input,90,FOLLOW_90_in_ruleHandler3195); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getHandlerAccess().getLeftParenthesisKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getHandlerAccess().getExceptionDeclarationParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleExceptionDeclaration_in_ruleHandler3217);
            this_ExceptionDeclaration_2=ruleExceptionDeclaration();

            state._fsp--;


            		current.merge(this_ExceptionDeclaration_2);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,91,FOLLOW_91_in_ruleHandler3235); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getHandlerAccess().getRightParenthesisKeyword_3()); 
                
             
                    newCompositeNode(grammarAccess.getHandlerAccess().getCompoundStatementParserRuleCall_4()); 
                
            pushFollow(FOLLOW_ruleCompoundStatement_in_ruleHandler3257);
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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1193:1: entryRuleExceptionDeclaration returns [String current=null] : iv_ruleExceptionDeclaration= ruleExceptionDeclaration EOF ;
    public final String entryRuleExceptionDeclaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExceptionDeclaration = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1194:2: (iv_ruleExceptionDeclaration= ruleExceptionDeclaration EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1195:2: iv_ruleExceptionDeclaration= ruleExceptionDeclaration EOF
            {
             newCompositeNode(grammarAccess.getExceptionDeclarationRule()); 
            pushFollow(FOLLOW_ruleExceptionDeclaration_in_entryRuleExceptionDeclaration3303);
            iv_ruleExceptionDeclaration=ruleExceptionDeclaration();

            state._fsp--;

             current =iv_ruleExceptionDeclaration.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExceptionDeclaration3314); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1202:1: ruleExceptionDeclaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_AttributeSpecifier_0= ruleAttributeSpecifier )* (this_TypeSpecifier_1= ruleTypeSpecifier )+ (this_Declarator_2= ruleDeclarator | (this_AbstractDeclarator_3= ruleAbstractDeclarator )? ) ) | kw= '...' ) ;
    public final AntlrDatatypeRuleToken ruleExceptionDeclaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_AttributeSpecifier_0 = null;

        AntlrDatatypeRuleToken this_TypeSpecifier_1 = null;

        AntlrDatatypeRuleToken this_Declarator_2 = null;

        AntlrDatatypeRuleToken this_AbstractDeclarator_3 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1205:28: ( ( ( (this_AttributeSpecifier_0= ruleAttributeSpecifier )* (this_TypeSpecifier_1= ruleTypeSpecifier )+ (this_Declarator_2= ruleDeclarator | (this_AbstractDeclarator_3= ruleAbstractDeclarator )? ) ) | kw= '...' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1206:1: ( ( (this_AttributeSpecifier_0= ruleAttributeSpecifier )* (this_TypeSpecifier_1= ruleTypeSpecifier )+ (this_Declarator_2= ruleDeclarator | (this_AbstractDeclarator_3= ruleAbstractDeclarator )? ) ) | kw= '...' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1206:1: ( ( (this_AttributeSpecifier_0= ruleAttributeSpecifier )* (this_TypeSpecifier_1= ruleTypeSpecifier )+ (this_Declarator_2= ruleDeclarator | (this_AbstractDeclarator_3= ruleAbstractDeclarator )? ) ) | kw= '...' )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=101 && LA31_0<=102)) ) {
                alt31=1;
            }
            else if ( (LA31_0==86) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1206:2: ( (this_AttributeSpecifier_0= ruleAttributeSpecifier )* (this_TypeSpecifier_1= ruleTypeSpecifier )+ (this_Declarator_2= ruleDeclarator | (this_AbstractDeclarator_3= ruleAbstractDeclarator )? ) )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1206:2: ( (this_AttributeSpecifier_0= ruleAttributeSpecifier )* (this_TypeSpecifier_1= ruleTypeSpecifier )+ (this_Declarator_2= ruleDeclarator | (this_AbstractDeclarator_3= ruleAbstractDeclarator )? ) )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1206:3: (this_AttributeSpecifier_0= ruleAttributeSpecifier )* (this_TypeSpecifier_1= ruleTypeSpecifier )+ (this_Declarator_2= ruleDeclarator | (this_AbstractDeclarator_3= ruleAbstractDeclarator )? )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1206:3: (this_AttributeSpecifier_0= ruleAttributeSpecifier )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==101) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1207:5: this_AttributeSpecifier_0= ruleAttributeSpecifier
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getExceptionDeclarationAccess().getAttributeSpecifierParserRuleCall_0_0()); 
                    	        
                    	    pushFollow(FOLLOW_ruleAttributeSpecifier_in_ruleExceptionDeclaration3363);
                    	    this_AttributeSpecifier_0=ruleAttributeSpecifier();

                    	    state._fsp--;


                    	    		current.merge(this_AttributeSpecifier_0);
                    	        
                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1217:3: (this_TypeSpecifier_1= ruleTypeSpecifier )+
                    int cnt28=0;
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==102) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1218:5: this_TypeSpecifier_1= ruleTypeSpecifier
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getExceptionDeclarationAccess().getTypeSpecifierParserRuleCall_0_1()); 
                    	        
                    	    pushFollow(FOLLOW_ruleTypeSpecifier_in_ruleExceptionDeclaration3393);
                    	    this_TypeSpecifier_1=ruleTypeSpecifier();

                    	    state._fsp--;


                    	    		current.merge(this_TypeSpecifier_1);
                    	        
                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt28 >= 1 ) break loop28;
                                EarlyExitException eee =
                                    new EarlyExitException(28, input);
                                throw eee;
                        }
                        cnt28++;
                    } while (true);

                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1228:3: (this_Declarator_2= ruleDeclarator | (this_AbstractDeclarator_3= ruleAbstractDeclarator )? )
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==103) ) {
                        alt30=1;
                    }
                    else if ( (LA30_0==EOF||LA30_0==91||LA30_0==104) ) {
                        alt30=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 0, input);

                        throw nvae;
                    }
                    switch (alt30) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1229:5: this_Declarator_2= ruleDeclarator
                            {
                             
                                    newCompositeNode(grammarAccess.getExceptionDeclarationAccess().getDeclaratorParserRuleCall_0_2_0()); 
                                
                            pushFollow(FOLLOW_ruleDeclarator_in_ruleExceptionDeclaration3423);
                            this_Declarator_2=ruleDeclarator();

                            state._fsp--;


                            		current.merge(this_Declarator_2);
                                
                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;
                        case 2 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1240:6: (this_AbstractDeclarator_3= ruleAbstractDeclarator )?
                            {
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1240:6: (this_AbstractDeclarator_3= ruleAbstractDeclarator )?
                            int alt29=2;
                            int LA29_0 = input.LA(1);

                            if ( (LA29_0==104) ) {
                                alt29=1;
                            }
                            switch (alt29) {
                                case 1 :
                                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1241:5: this_AbstractDeclarator_3= ruleAbstractDeclarator
                                    {
                                     
                                            newCompositeNode(grammarAccess.getExceptionDeclarationAccess().getAbstractDeclaratorParserRuleCall_0_2_1()); 
                                        
                                    pushFollow(FOLLOW_ruleAbstractDeclarator_in_ruleExceptionDeclaration3457);
                                    this_AbstractDeclarator_3=ruleAbstractDeclarator();

                                    state._fsp--;


                                    		current.merge(this_AbstractDeclarator_3);
                                        
                                     
                                            afterParserOrEnumRuleCall();
                                        

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1253:2: kw= '...'
                    {
                    kw=(Token)match(input,86,FOLLOW_86_in_ruleExceptionDeclaration3485); 

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


    // $ANTLR start "entryRuleDynamicExceptionSpecification"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1270:1: entryRuleDynamicExceptionSpecification returns [String current=null] : iv_ruleDynamicExceptionSpecification= ruleDynamicExceptionSpecification EOF ;
    public final String entryRuleDynamicExceptionSpecification() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDynamicExceptionSpecification = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1271:2: (iv_ruleDynamicExceptionSpecification= ruleDynamicExceptionSpecification EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1272:2: iv_ruleDynamicExceptionSpecification= ruleDynamicExceptionSpecification EOF
            {
             newCompositeNode(grammarAccess.getDynamicExceptionSpecificationRule()); 
            pushFollow(FOLLOW_ruleDynamicExceptionSpecification_in_entryRuleDynamicExceptionSpecification3530);
            iv_ruleDynamicExceptionSpecification=ruleDynamicExceptionSpecification();

            state._fsp--;

             current =iv_ruleDynamicExceptionSpecification.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDynamicExceptionSpecification3541); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1279:1: ruleDynamicExceptionSpecification returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'throw' kw= '(' this_TypeIdList_2= ruleTypeIdList kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleDynamicExceptionSpecification() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_TypeIdList_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1282:28: ( (kw= 'throw' kw= '(' this_TypeIdList_2= ruleTypeIdList kw= ')' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1283:1: (kw= 'throw' kw= '(' this_TypeIdList_2= ruleTypeIdList kw= ')' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1283:1: (kw= 'throw' kw= '(' this_TypeIdList_2= ruleTypeIdList kw= ')' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1284:2: kw= 'throw' kw= '(' this_TypeIdList_2= ruleTypeIdList kw= ')'
            {
            kw=(Token)match(input,92,FOLLOW_92_in_ruleDynamicExceptionSpecification3579); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDynamicExceptionSpecificationAccess().getThrowKeyword_0()); 
                
            kw=(Token)match(input,90,FOLLOW_90_in_ruleDynamicExceptionSpecification3592); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDynamicExceptionSpecificationAccess().getLeftParenthesisKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getDynamicExceptionSpecificationAccess().getTypeIdListParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleTypeIdList_in_ruleDynamicExceptionSpecification3614);
            this_TypeIdList_2=ruleTypeIdList();

            state._fsp--;


            		current.merge(this_TypeIdList_2);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,91,FOLLOW_91_in_ruleDynamicExceptionSpecification3632); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1320:1: entryRuleNoexceptSpecification returns [String current=null] : iv_ruleNoexceptSpecification= ruleNoexceptSpecification EOF ;
    public final String entryRuleNoexceptSpecification() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNoexceptSpecification = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1321:2: (iv_ruleNoexceptSpecification= ruleNoexceptSpecification EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1322:2: iv_ruleNoexceptSpecification= ruleNoexceptSpecification EOF
            {
             newCompositeNode(grammarAccess.getNoexceptSpecificationRule()); 
            pushFollow(FOLLOW_ruleNoexceptSpecification_in_entryRuleNoexceptSpecification3673);
            iv_ruleNoexceptSpecification=ruleNoexceptSpecification();

            state._fsp--;

             current =iv_ruleNoexceptSpecification.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoexceptSpecification3684); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1329:1: ruleNoexceptSpecification returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'noexcept' (kw= '(' this_ConstantExpression_2= ruleConstantExpression kw= ')' )? ) ;
    public final AntlrDatatypeRuleToken ruleNoexceptSpecification() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ConstantExpression_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1332:28: ( (kw= 'noexcept' (kw= '(' this_ConstantExpression_2= ruleConstantExpression kw= ')' )? ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1333:1: (kw= 'noexcept' (kw= '(' this_ConstantExpression_2= ruleConstantExpression kw= ')' )? )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1333:1: (kw= 'noexcept' (kw= '(' this_ConstantExpression_2= ruleConstantExpression kw= ')' )? )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1334:2: kw= 'noexcept' (kw= '(' this_ConstantExpression_2= ruleConstantExpression kw= ')' )?
            {
            kw=(Token)match(input,93,FOLLOW_93_in_ruleNoexceptSpecification3722); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getNoexceptSpecificationAccess().getNoexceptKeyword_0()); 
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1339:1: (kw= '(' this_ConstantExpression_2= ruleConstantExpression kw= ')' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==90) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1340:2: kw= '(' this_ConstantExpression_2= ruleConstantExpression kw= ')'
                    {
                    kw=(Token)match(input,90,FOLLOW_90_in_ruleNoexceptSpecification3736); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNoexceptSpecificationAccess().getLeftParenthesisKeyword_1_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getNoexceptSpecificationAccess().getConstantExpressionParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleConstantExpression_in_ruleNoexceptSpecification3758);
                    this_ConstantExpression_2=ruleConstantExpression();

                    state._fsp--;


                    		current.merge(this_ConstantExpression_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,91,FOLLOW_91_in_ruleNoexceptSpecification3776); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1370:1: entryRuleConstantExpression returns [String current=null] : iv_ruleConstantExpression= ruleConstantExpression EOF ;
    public final String entryRuleConstantExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConstantExpression = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1371:2: (iv_ruleConstantExpression= ruleConstantExpression EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1372:2: iv_ruleConstantExpression= ruleConstantExpression EOF
            {
             newCompositeNode(grammarAccess.getConstantExpressionRule()); 
            pushFollow(FOLLOW_ruleConstantExpression_in_entryRuleConstantExpression3819);
            iv_ruleConstantExpression=ruleConstantExpression();

            state._fsp--;

             current =iv_ruleConstantExpression.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantExpression3830); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1379:1: ruleConstantExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'DUMMY1' ;
    public final AntlrDatatypeRuleToken ruleConstantExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1382:28: (kw= 'DUMMY1' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1384:2: kw= 'DUMMY1'
            {
            kw=(Token)match(input,94,FOLLOW_94_in_ruleConstantExpression3867); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getConstantExpressionAccess().getDUMMY1Keyword()); 
                

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


    // $ANTLR start "entryRuleTypeId"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1397:1: entryRuleTypeId returns [String current=null] : iv_ruleTypeId= ruleTypeId EOF ;
    public final String entryRuleTypeId() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeId = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1398:2: (iv_ruleTypeId= ruleTypeId EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1399:2: iv_ruleTypeId= ruleTypeId EOF
            {
             newCompositeNode(grammarAccess.getTypeIdRule()); 
            pushFollow(FOLLOW_ruleTypeId_in_entryRuleTypeId3907);
            iv_ruleTypeId=ruleTypeId();

            state._fsp--;

             current =iv_ruleTypeId.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeId3918); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1406:1: ruleTypeId returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'DUMMY2' ;
    public final AntlrDatatypeRuleToken ruleTypeId() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1409:28: (kw= 'DUMMY2' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1411:2: kw= 'DUMMY2'
            {
            kw=(Token)match(input,95,FOLLOW_95_in_ruleTypeId3955); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getTypeIdAccess().getDUMMY2Keyword()); 
                

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


    // $ANTLR start "entryRuleIdExpression"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1424:1: entryRuleIdExpression returns [String current=null] : iv_ruleIdExpression= ruleIdExpression EOF ;
    public final String entryRuleIdExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdExpression = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1425:2: (iv_ruleIdExpression= ruleIdExpression EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1426:2: iv_ruleIdExpression= ruleIdExpression EOF
            {
             newCompositeNode(grammarAccess.getIdExpressionRule()); 
            pushFollow(FOLLOW_ruleIdExpression_in_entryRuleIdExpression3995);
            iv_ruleIdExpression=ruleIdExpression();

            state._fsp--;

             current =iv_ruleIdExpression.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdExpression4006); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1433:1: ruleIdExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'DUMMY3' ;
    public final AntlrDatatypeRuleToken ruleIdExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1436:28: (kw= 'DUMMY3' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1438:2: kw= 'DUMMY3'
            {
            kw=(Token)match(input,96,FOLLOW_96_in_ruleIdExpression4043); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getIdExpressionAccess().getDUMMY3Keyword()); 
                

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


    // $ANTLR start "entryRuleParameterDeclaration"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1451:1: entryRuleParameterDeclaration returns [String current=null] : iv_ruleParameterDeclaration= ruleParameterDeclaration EOF ;
    public final String entryRuleParameterDeclaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleParameterDeclaration = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1452:2: (iv_ruleParameterDeclaration= ruleParameterDeclaration EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1453:2: iv_ruleParameterDeclaration= ruleParameterDeclaration EOF
            {
             newCompositeNode(grammarAccess.getParameterDeclarationRule()); 
            pushFollow(FOLLOW_ruleParameterDeclaration_in_entryRuleParameterDeclaration4083);
            iv_ruleParameterDeclaration=ruleParameterDeclaration();

            state._fsp--;

             current =iv_ruleParameterDeclaration.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterDeclaration4094); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1460:1: ruleParameterDeclaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'DUMMY4' ;
    public final AntlrDatatypeRuleToken ruleParameterDeclaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1463:28: (kw= 'DUMMY4' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1465:2: kw= 'DUMMY4'
            {
            kw=(Token)match(input,97,FOLLOW_97_in_ruleParameterDeclaration4131); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getParameterDeclarationAccess().getDUMMY4Keyword()); 
                

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


    // $ANTLR start "entryRuleDeclaration"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1478:1: entryRuleDeclaration returns [String current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final String entryRuleDeclaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDeclaration = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1479:2: (iv_ruleDeclaration= ruleDeclaration EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1480:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration4171);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;

             current =iv_ruleDeclaration.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration4182); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1487:1: ruleDeclaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'DUMMY5' ;
    public final AntlrDatatypeRuleToken ruleDeclaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1490:28: (kw= 'DUMMY5' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1492:2: kw= 'DUMMY5'
            {
            kw=(Token)match(input,98,FOLLOW_98_in_ruleDeclaration4219); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDeclarationAccess().getDUMMY5Keyword()); 
                

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1505:1: entryRuleNestedNameSpecifier returns [String current=null] : iv_ruleNestedNameSpecifier= ruleNestedNameSpecifier EOF ;
    public final String entryRuleNestedNameSpecifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNestedNameSpecifier = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1506:2: (iv_ruleNestedNameSpecifier= ruleNestedNameSpecifier EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1507:2: iv_ruleNestedNameSpecifier= ruleNestedNameSpecifier EOF
            {
             newCompositeNode(grammarAccess.getNestedNameSpecifierRule()); 
            pushFollow(FOLLOW_ruleNestedNameSpecifier_in_entryRuleNestedNameSpecifier4259);
            iv_ruleNestedNameSpecifier=ruleNestedNameSpecifier();

            state._fsp--;

             current =iv_ruleNestedNameSpecifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNestedNameSpecifier4270); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1514:1: ruleNestedNameSpecifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'DUMMY6' ;
    public final AntlrDatatypeRuleToken ruleNestedNameSpecifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1517:28: (kw= 'DUMMY6' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1519:2: kw= 'DUMMY6'
            {
            kw=(Token)match(input,99,FOLLOW_99_in_ruleNestedNameSpecifier4307); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getNestedNameSpecifierAccess().getDUMMY6Keyword()); 
                

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1532:1: entryRuleAssignmentExpression returns [String current=null] : iv_ruleAssignmentExpression= ruleAssignmentExpression EOF ;
    public final String entryRuleAssignmentExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAssignmentExpression = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1533:2: (iv_ruleAssignmentExpression= ruleAssignmentExpression EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1534:2: iv_ruleAssignmentExpression= ruleAssignmentExpression EOF
            {
             newCompositeNode(grammarAccess.getAssignmentExpressionRule()); 
            pushFollow(FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression4347);
            iv_ruleAssignmentExpression=ruleAssignmentExpression();

            state._fsp--;

             current =iv_ruleAssignmentExpression.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignmentExpression4358); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1541:1: ruleAssignmentExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'DUMMY7' ;
    public final AntlrDatatypeRuleToken ruleAssignmentExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1544:28: (kw= 'DUMMY7' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1546:2: kw= 'DUMMY7'
            {
            kw=(Token)match(input,100,FOLLOW_100_in_ruleAssignmentExpression4395); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getAssignmentExpressionAccess().getDUMMY7Keyword()); 
                

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


    // $ANTLR start "entryRuleAttributeSpecifier"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1559:1: entryRuleAttributeSpecifier returns [String current=null] : iv_ruleAttributeSpecifier= ruleAttributeSpecifier EOF ;
    public final String entryRuleAttributeSpecifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAttributeSpecifier = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1560:2: (iv_ruleAttributeSpecifier= ruleAttributeSpecifier EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1561:2: iv_ruleAttributeSpecifier= ruleAttributeSpecifier EOF
            {
             newCompositeNode(grammarAccess.getAttributeSpecifierRule()); 
            pushFollow(FOLLOW_ruleAttributeSpecifier_in_entryRuleAttributeSpecifier4435);
            iv_ruleAttributeSpecifier=ruleAttributeSpecifier();

            state._fsp--;

             current =iv_ruleAttributeSpecifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeSpecifier4446); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1568:1: ruleAttributeSpecifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'DUMMY8' ;
    public final AntlrDatatypeRuleToken ruleAttributeSpecifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1571:28: (kw= 'DUMMY8' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1573:2: kw= 'DUMMY8'
            {
            kw=(Token)match(input,101,FOLLOW_101_in_ruleAttributeSpecifier4483); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getAttributeSpecifierAccess().getDUMMY8Keyword()); 
                

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


    // $ANTLR start "entryRuleTypeSpecifier"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1586:1: entryRuleTypeSpecifier returns [String current=null] : iv_ruleTypeSpecifier= ruleTypeSpecifier EOF ;
    public final String entryRuleTypeSpecifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeSpecifier = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1587:2: (iv_ruleTypeSpecifier= ruleTypeSpecifier EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1588:2: iv_ruleTypeSpecifier= ruleTypeSpecifier EOF
            {
             newCompositeNode(grammarAccess.getTypeSpecifierRule()); 
            pushFollow(FOLLOW_ruleTypeSpecifier_in_entryRuleTypeSpecifier4523);
            iv_ruleTypeSpecifier=ruleTypeSpecifier();

            state._fsp--;

             current =iv_ruleTypeSpecifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeSpecifier4534); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1595:1: ruleTypeSpecifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'DUMMY9' ;
    public final AntlrDatatypeRuleToken ruleTypeSpecifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1598:28: (kw= 'DUMMY9' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1600:2: kw= 'DUMMY9'
            {
            kw=(Token)match(input,102,FOLLOW_102_in_ruleTypeSpecifier4571); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getTypeSpecifierAccess().getDUMMY9Keyword()); 
                

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


    // $ANTLR start "entryRuleDeclarator"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1613:1: entryRuleDeclarator returns [String current=null] : iv_ruleDeclarator= ruleDeclarator EOF ;
    public final String entryRuleDeclarator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDeclarator = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1614:2: (iv_ruleDeclarator= ruleDeclarator EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1615:2: iv_ruleDeclarator= ruleDeclarator EOF
            {
             newCompositeNode(grammarAccess.getDeclaratorRule()); 
            pushFollow(FOLLOW_ruleDeclarator_in_entryRuleDeclarator4611);
            iv_ruleDeclarator=ruleDeclarator();

            state._fsp--;

             current =iv_ruleDeclarator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclarator4622); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1622:1: ruleDeclarator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'DUMMY10' ;
    public final AntlrDatatypeRuleToken ruleDeclarator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1625:28: (kw= 'DUMMY10' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1627:2: kw= 'DUMMY10'
            {
            kw=(Token)match(input,103,FOLLOW_103_in_ruleDeclarator4659); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDeclaratorAccess().getDUMMY10Keyword()); 
                

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


    // $ANTLR start "entryRuleAbstractDeclarator"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1640:1: entryRuleAbstractDeclarator returns [String current=null] : iv_ruleAbstractDeclarator= ruleAbstractDeclarator EOF ;
    public final String entryRuleAbstractDeclarator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAbstractDeclarator = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1641:2: (iv_ruleAbstractDeclarator= ruleAbstractDeclarator EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1642:2: iv_ruleAbstractDeclarator= ruleAbstractDeclarator EOF
            {
             newCompositeNode(grammarAccess.getAbstractDeclaratorRule()); 
            pushFollow(FOLLOW_ruleAbstractDeclarator_in_entryRuleAbstractDeclarator4699);
            iv_ruleAbstractDeclarator=ruleAbstractDeclarator();

            state._fsp--;

             current =iv_ruleAbstractDeclarator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractDeclarator4710); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractDeclarator"


    // $ANTLR start "ruleAbstractDeclarator"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1649:1: ruleAbstractDeclarator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'DUMMY11' ;
    public final AntlrDatatypeRuleToken ruleAbstractDeclarator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1652:28: (kw= 'DUMMY11' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1654:2: kw= 'DUMMY11'
            {
            kw=(Token)match(input,104,FOLLOW_104_in_ruleAbstractDeclarator4747); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getAbstractDeclaratorAccess().getDUMMY11Keyword()); 
                

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
    // $ANTLR end "ruleAbstractDeclarator"


    // $ANTLR start "entryRuleCompoundStatement"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1667:1: entryRuleCompoundStatement returns [String current=null] : iv_ruleCompoundStatement= ruleCompoundStatement EOF ;
    public final String entryRuleCompoundStatement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCompoundStatement = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1668:2: (iv_ruleCompoundStatement= ruleCompoundStatement EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1669:2: iv_ruleCompoundStatement= ruleCompoundStatement EOF
            {
             newCompositeNode(grammarAccess.getCompoundStatementRule()); 
            pushFollow(FOLLOW_ruleCompoundStatement_in_entryRuleCompoundStatement4787);
            iv_ruleCompoundStatement=ruleCompoundStatement();

            state._fsp--;

             current =iv_ruleCompoundStatement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompoundStatement4798); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1676:1: ruleCompoundStatement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'DUMMY12' ;
    public final AntlrDatatypeRuleToken ruleCompoundStatement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1679:28: (kw= 'DUMMY12' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1681:2: kw= 'DUMMY12'
            {
            kw=(Token)match(input,105,FOLLOW_105_in_ruleCompoundStatement4835); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getCompoundStatementAccess().getDUMMY12Keyword()); 
                

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1694:1: entryRuleCtorInitializer returns [String current=null] : iv_ruleCtorInitializer= ruleCtorInitializer EOF ;
    public final String entryRuleCtorInitializer() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCtorInitializer = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1695:2: (iv_ruleCtorInitializer= ruleCtorInitializer EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1696:2: iv_ruleCtorInitializer= ruleCtorInitializer EOF
            {
             newCompositeNode(grammarAccess.getCtorInitializerRule()); 
            pushFollow(FOLLOW_ruleCtorInitializer_in_entryRuleCtorInitializer4875);
            iv_ruleCtorInitializer=ruleCtorInitializer();

            state._fsp--;

             current =iv_ruleCtorInitializer.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCtorInitializer4886); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1703:1: ruleCtorInitializer returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'DUMMY13' ;
    public final AntlrDatatypeRuleToken ruleCtorInitializer() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1706:28: (kw= 'DUMMY13' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1708:2: kw= 'DUMMY13'
            {
            kw=(Token)match(input,106,FOLLOW_106_in_ruleCtorInitializer4923); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getCtorInitializerAccess().getDUMMY13Keyword()); 
                

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1721:1: entryRuleTypeIdList returns [String current=null] : iv_ruleTypeIdList= ruleTypeIdList EOF ;
    public final String entryRuleTypeIdList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeIdList = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1722:2: (iv_ruleTypeIdList= ruleTypeIdList EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1723:2: iv_ruleTypeIdList= ruleTypeIdList EOF
            {
             newCompositeNode(grammarAccess.getTypeIdListRule()); 
            pushFollow(FOLLOW_ruleTypeIdList_in_entryRuleTypeIdList4963);
            iv_ruleTypeIdList=ruleTypeIdList();

            state._fsp--;

             current =iv_ruleTypeIdList.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeIdList4974); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1730:1: ruleTypeIdList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'DUMMY14' ;
    public final AntlrDatatypeRuleToken ruleTypeIdList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1733:28: (kw= 'DUMMY14' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1735:2: kw= 'DUMMY14'
            {
            kw=(Token)match(input,107,FOLLOW_107_in_ruleTypeIdList5011); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getTypeIdListAccess().getDUMMY14Keyword()); 
                

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

    // Delegated rules


    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA7_eotS =
        "\55\uffff";
    static final String DFA7_eofS =
        "\1\uffff\1\52\1\54\52\uffff";
    static final String DFA7_minS =
        "\3\52\52\uffff";
    static final String DFA7_maxS =
        "\1\123\2\56\52\uffff";
    static final String DFA7_acceptS =
        "\3\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1"+
        "\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34"+
        "\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51"+
        "\1\52\1\3\1\1\1\4\1\2";
    static final String DFA7_specialS =
        "\55\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\16\1\17\1\1\1\2\2\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1"+
            "\12\1\13\1\14\1\15\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1"+
            "\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1"+
            "\44\1\45\1\46\1\47\1\50",
            "\1\52\3\uffff\1\51",
            "\1\54\3\uffff\1\53",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "309:1: (kw= 'new' | kw= 'delete' | (kw= 'new' kw= '[' kw= ']' ) | (kw= 'delete' kw= '[' kw= ']' ) | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= '^' | kw= '&' | kw= '|' | kw= '~' | kw= '!' | kw= '=' | kw= '<' | kw= '>' | kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' | kw= '^=' | kw= '&=' | kw= '|=' | kw= '<<' | kw= '>>' | kw= '>>=' | kw= '<<=' | kw= '==' | kw= '!=' | kw= '<=' | kw= '>=' | kw= '&&' | kw= '||' | kw= '++' | kw= '--' | kw= ',' | kw= '->*' | kw= '->' | kw= '()' | kw= '[]' )";
        }
    }
 

    public static final BitSet FOLLOW_ruleTest_in_entryRuleTest75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTest85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleToken_in_ruleTest130 = new BitSet(new long[]{0x000000C0000007B2L});
    public static final BitSet FOLLOW_ruleToken_in_entryRuleToken169 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleToken180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KEYWORD_in_ruleToken220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleToken253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PREPROCESSING_OP_OR_PUNC_in_ruleToken280 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleToken300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral347 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLiteral398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CHARACTER_LITERAL_in_ruleLiteral424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOATING_LITERAL_in_ruleLiteral450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_LITERAL_in_ruleLiteral476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleLiteral502 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_39_in_ruleLiteral521 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleLiteral535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperatorFunctionId_in_entryRuleOperatorFunctionId577 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperatorFunctionId588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleOperatorFunctionId626 = new BitSet(new long[]{0xFFFF3C0000000000L,0x00000000000FFFFFL});
    public static final BitSet FOLLOW_ruleOverloadableOperator_in_ruleOperatorFunctionId648 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_ruleOperatorFunctionId667 = new BitSet(new long[]{0x0000080000000000L,0x00000001C0000000L});
    public static final BitSet FOLLOW_ruleTemplateArgument_in_ruleOperatorFunctionId690 = new BitSet(new long[]{0x0000080000000000L,0x00000001C0000000L});
    public static final BitSet FOLLOW_43_in_ruleOperatorFunctionId710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOverloadableOperator_in_entryRuleOverloadableOperator753 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOverloadableOperator764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleOverloadableOperator802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleOverloadableOperator821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleOverloadableOperator841 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleOverloadableOperator854 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleOverloadableOperator867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleOverloadableOperator888 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleOverloadableOperator901 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleOverloadableOperator914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleOverloadableOperator934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleOverloadableOperator953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleOverloadableOperator972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleOverloadableOperator991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleOverloadableOperator1010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleOverloadableOperator1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleOverloadableOperator1048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleOverloadableOperator1067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleOverloadableOperator1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleOverloadableOperator1105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleOverloadableOperator1124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleOverloadableOperator1143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleOverloadableOperator1162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleOverloadableOperator1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleOverloadableOperator1200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleOverloadableOperator1219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleOverloadableOperator1238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleOverloadableOperator1257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleOverloadableOperator1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleOverloadableOperator1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleOverloadableOperator1314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleOverloadableOperator1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleOverloadableOperator1352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleOverloadableOperator1371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleOverloadableOperator1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleOverloadableOperator1409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleOverloadableOperator1428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleOverloadableOperator1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleOverloadableOperator1466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleOverloadableOperator1485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleOverloadableOperator1504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleOverloadableOperator1523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleOverloadableOperator1542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleOverloadableOperator1561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleOverloadableOperator1580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleOverloadableOperator1599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleOverloadableOperator1618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleOverloadableOperator1637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralOperatorId_in_entryRuleLiteralOperatorId1678 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralOperatorId1689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleLiteralOperatorId1727 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_ruleLiteralOperatorId1740 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_ruleLiteralOperatorId1753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateParameterList_in_entryRuleTemplateParameterList1796 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateParameterList1807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateParameter_in_ruleTemplateParameterList1854 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_ruleTemplateParameterList1873 = new BitSet(new long[]{0x0000000000000000L,0x0000000201A00000L});
    public static final BitSet FOLLOW_ruleTemplateParameter_in_ruleTemplateParameterList1895 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleTemplateParameter_in_entryRuleTemplateParameter1943 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateParameter1954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeParameter_in_ruleTemplateParameter2001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleTemplateParameter2034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeParameter_in_entryRuleTypeParameter2080 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeParameter2091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleTypeParameter2130 = new BitSet(new long[]{0x0400000000000042L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_ruleTypeParameter2146 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeParameter2164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeParameter2195 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ruleTypeParameter2215 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_ruleTypeId_in_ruleTypeParameter2237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleTypeParameter2265 = new BitSet(new long[]{0x0400000000000042L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_ruleTypeParameter2281 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeParameter2299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeParameter2330 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ruleTypeParameter2350 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_ruleTypeId_in_ruleTypeParameter2372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleTypeParameter2400 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleTypeParameter2413 = new BitSet(new long[]{0x0000000000000000L,0x0000000201A00000L});
    public static final BitSet FOLLOW_ruleTemplateParameterList_in_ruleTypeParameter2435 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleTypeParameter2453 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_ruleTypeParameter2466 = new BitSet(new long[]{0x0400000000000042L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_ruleTypeParameter2482 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeParameter2500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeParameter2531 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ruleTypeParameter2551 = new BitSet(new long[]{0x0000000000000000L,0x00000001C0000000L});
    public static final BitSet FOLLOW_ruleIdExpression_in_ruleTypeParameter2573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleTemplateId_in_entryRuleSimpleTemplateId2622 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleTemplateId2633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSimpleTemplateId2673 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleSimpleTemplateId2691 = new BitSet(new long[]{0x0000000000000000L,0x00000001C0000000L});
    public static final BitSet FOLLOW_ruleTemplateArgumentList_in_ruleSimpleTemplateId2713 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleSimpleTemplateId2731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateArgumentList_in_entryRuleTemplateArgumentList2774 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateArgumentList2785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateArgument_in_ruleTemplateArgumentList2832 = new BitSet(new long[]{0x0000000000000002L,0x0000000000408000L});
    public static final BitSet FOLLOW_86_in_ruleTemplateArgumentList2851 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_ruleTemplateArgumentList2867 = new BitSet(new long[]{0x0000000000000000L,0x00000001C0000000L});
    public static final BitSet FOLLOW_ruleTemplateArgument_in_ruleTemplateArgumentList2889 = new BitSet(new long[]{0x0000000000000002L,0x0000000000408000L});
    public static final BitSet FOLLOW_86_in_ruleTemplateArgumentList2908 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleTemplateArgument_in_entryRuleTemplateArgument2953 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateArgument2964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantExpression_in_ruleTemplateArgument3011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeId_in_ruleTemplateArgument3044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdExpression_in_ruleTemplateArgument3077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHandler_in_entryRuleHandler3133 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHandler3144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleHandler3182 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_ruleHandler3195 = new BitSet(new long[]{0x0000000000000000L,0x0000006000400000L});
    public static final BitSet FOLLOW_ruleExceptionDeclaration_in_ruleHandler3217 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_ruleHandler3235 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_ruleCompoundStatement_in_ruleHandler3257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExceptionDeclaration_in_entryRuleExceptionDeclaration3303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExceptionDeclaration3314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeSpecifier_in_ruleExceptionDeclaration3363 = new BitSet(new long[]{0x0000000000000000L,0x0000006000000000L});
    public static final BitSet FOLLOW_ruleTypeSpecifier_in_ruleExceptionDeclaration3393 = new BitSet(new long[]{0x0000000000000002L,0x000001E000000000L});
    public static final BitSet FOLLOW_ruleDeclarator_in_ruleExceptionDeclaration3423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractDeclarator_in_ruleExceptionDeclaration3457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleExceptionDeclaration3485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDynamicExceptionSpecification_in_entryRuleDynamicExceptionSpecification3530 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDynamicExceptionSpecification3541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleDynamicExceptionSpecification3579 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_ruleDynamicExceptionSpecification3592 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_ruleTypeIdList_in_ruleDynamicExceptionSpecification3614 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_ruleDynamicExceptionSpecification3632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoexceptSpecification_in_entryRuleNoexceptSpecification3673 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoexceptSpecification3684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleNoexceptSpecification3722 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_ruleNoexceptSpecification3736 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_ruleConstantExpression_in_ruleNoexceptSpecification3758 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_ruleNoexceptSpecification3776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantExpression_in_entryRuleConstantExpression3819 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantExpression3830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleConstantExpression3867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeId_in_entryRuleTypeId3907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeId3918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleTypeId3955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdExpression_in_entryRuleIdExpression3995 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdExpression4006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleIdExpression4043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_entryRuleParameterDeclaration4083 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterDeclaration4094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleParameterDeclaration4131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration4171 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration4182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_ruleDeclaration4219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNestedNameSpecifier_in_entryRuleNestedNameSpecifier4259 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNestedNameSpecifier4270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_ruleNestedNameSpecifier4307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression4347 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignmentExpression4358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_ruleAssignmentExpression4395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeSpecifier_in_entryRuleAttributeSpecifier4435 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeSpecifier4446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_ruleAttributeSpecifier4483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeSpecifier_in_entryRuleTypeSpecifier4523 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeSpecifier4534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_ruleTypeSpecifier4571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarator_in_entryRuleDeclarator4611 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclarator4622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_ruleDeclarator4659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractDeclarator_in_entryRuleAbstractDeclarator4699 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractDeclarator4710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_ruleAbstractDeclarator4747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundStatement_in_entryRuleCompoundStatement4787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompoundStatement4798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_ruleCompoundStatement4835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCtorInitializer_in_entryRuleCtorInitializer4875 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCtorInitializer4886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_ruleCtorInitializer4923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeIdList_in_entryRuleTypeIdList4963 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeIdList4974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_ruleTypeIdList5011 = new BitSet(new long[]{0x0000000000000002L});

}