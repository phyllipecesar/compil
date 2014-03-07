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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_KEYWORD", "RULE_PREPROCESSING_OP_OR_PUNC", "RULE_ID", "RULE_INT", "RULE_CHARACTER_LITERAL", "RULE_FLOATING_LITERAL", "RULE_STRING_LITERAL", "RULE_HEXADECIMAL_DIGIT", "RULE_HEX_QUAD", "RULE_UNIVERSAL_CHARACTER_NAME", "RULE_H_CHAR", "RULE_Q_CHAR", "RULE_HEADER_NAME", "RULE_DIGIT", "RULE_NONDIGIT", "RULE_DECIMAL_LITERAL", "RULE_OCTAL_LITERAL", "RULE_HEXADECIMAL_LITERAL", "RULE_INTEGER_SUFFIX", "RULE_OCTAL_DIGIT", "RULE_C_CHAR", "RULE_ESCAPE_SEQUENCE", "RULE_SIMPLE_ESCAPE_SEQUENCE", "RULE_OCTAL_ESCAPE_SEQUENCE", "RULE_HEXADECIMAL_ESCAPE_SEQUENCE", "RULE_FRACTIONAL_CONSTANT", "RULE_EXPONENT_PART", "RULE_ENC_PREFIX", "RULE_SCHAR", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'"
    };
    public static final int RULE_HEXADECIMAL_LITERAL=21;
    public static final int RULE_ID=6;
    public static final int RULE_FLOATING_LITERAL=9;
    public static final int RULE_ESCAPE_SEQUENCE=25;
    public static final int RULE_HEXADECIMAL_ESCAPE_SEQUENCE=28;
    public static final int RULE_ANY_OTHER=37;
    public static final int RULE_ENC_PREFIX=31;
    public static final int RULE_H_CHAR=14;
    public static final int RULE_PREPROCESSING_OP_OR_PUNC=5;
    public static final int RULE_SCHAR=32;
    public static final int RULE_C_CHAR=24;
    public static final int RULE_SL_COMMENT=35;
    public static final int EOF=-1;
    public static final int RULE_HEXADECIMAL_DIGIT=11;
    public static final int RULE_ML_COMMENT=34;
    public static final int RULE_EXPONENT_PART=30;
    public static final int RULE_OCTAL_DIGIT=23;
    public static final int RULE_STRING=33;
    public static final int RULE_STRING_LITERAL=10;
    public static final int RULE_FRACTIONAL_CONSTANT=29;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_KEYWORD=4;
    public static final int RULE_UNIVERSAL_CHARACTER_NAME=13;
    public static final int RULE_DECIMAL_LITERAL=19;
    public static final int RULE_INT=7;
    public static final int RULE_OCTAL_LITERAL=20;
    public static final int RULE_OCTAL_ESCAPE_SEQUENCE=27;
    public static final int RULE_WS=36;
    public static final int RULE_Q_CHAR=15;
    public static final int RULE_DIGIT=17;
    public static final int RULE_NONDIGIT=18;
    public static final int RULE_INTEGER_SUFFIX=22;
    public static final int RULE_CHARACTER_LITERAL=8;
    public static final int RULE_SIMPLE_ESCAPE_SEQUENCE=26;
    public static final int RULE_HEX_QUAD=12;
    public static final int RULE_HEADER_NAME=16;

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:172:1: ruleLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_CHARACTER_LITERAL_1= RULE_CHARACTER_LITERAL | this_FLOATING_LITERAL_2= RULE_FLOATING_LITERAL | this_STRING_LITERAL_3= RULE_STRING_LITERAL | (kw= 'true' | kw= 'false' ) ) ;
    public final AntlrDatatypeRuleToken ruleLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_CHARACTER_LITERAL_1=null;
        Token this_FLOATING_LITERAL_2=null;
        Token this_STRING_LITERAL_3=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:175:28: ( (this_INT_0= RULE_INT | this_CHARACTER_LITERAL_1= RULE_CHARACTER_LITERAL | this_FLOATING_LITERAL_2= RULE_FLOATING_LITERAL | this_STRING_LITERAL_3= RULE_STRING_LITERAL | (kw= 'true' | kw= 'false' ) ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:176:1: (this_INT_0= RULE_INT | this_CHARACTER_LITERAL_1= RULE_CHARACTER_LITERAL | this_FLOATING_LITERAL_2= RULE_FLOATING_LITERAL | this_STRING_LITERAL_3= RULE_STRING_LITERAL | (kw= 'true' | kw= 'false' ) )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:176:1: (this_INT_0= RULE_INT | this_CHARACTER_LITERAL_1= RULE_CHARACTER_LITERAL | this_FLOATING_LITERAL_2= RULE_FLOATING_LITERAL | this_STRING_LITERAL_3= RULE_STRING_LITERAL | (kw= 'true' | kw= 'false' ) )
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
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:208:6: (kw= 'true' | kw= 'false' )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:208:6: (kw= 'true' | kw= 'false' )
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
                            kw=(Token)match(input,38,FOLLOW_38_in_ruleLiteral501); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getLiteralAccess().getTrueKeyword_4_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:216:2: kw= 'false'
                            {
                            kw=(Token)match(input,39,FOLLOW_39_in_ruleLiteral520); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getLiteralAccess().getFalseKeyword_4_1()); 
                                

                            }
                            break;

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

    // Delegated rules


 

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
    public static final BitSet FOLLOW_38_in_ruleLiteral501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleLiteral520 = new BitSet(new long[]{0x0000000000000002L});

}