package org.xtext.example.mydsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_IDENTIFIER", "RULE_KEYWORD", "RULE_PPOPORPUNC", "RULE_SIGN", "RULE_NONZERODIGIT", "RULE_OCTALDIGIT", "RULE_HEXADECIMALDIGIT", "RULE_UNSIGNEDSUFFIX", "RULE_LONGSUFFIX", "RULE_LONGLONGSUFFIX", "RULE_PPNUMBER", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_ID=15;
    public static final int RULE_ANY_OTHER=21;
    public static final int RULE_HEXADECIMALDIGIT=10;
    public static final int RULE_IDENTIFIER=4;
    public static final int RULE_OCTALDIGIT=9;
    public static final int RULE_SIGN=7;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=19;
    public static final int RULE_ML_COMMENT=18;
    public static final int RULE_STRING=17;
    public static final int RULE_LONGLONGSUFFIX=13;
    public static final int RULE_KEYWORD=5;
    public static final int RULE_NONZERODIGIT=8;
    public static final int RULE_INT=16;
    public static final int RULE_PPOPORPUNC=6;
    public static final int RULE_LONGSUFFIX=12;
    public static final int RULE_PPNUMBER=14;
    public static final int RULE_WS=20;
    public static final int RULE_UNSIGNEDSUFFIX=11;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;
     	
        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:76:1: ruleModel returns [EObject current=null] : ( (lv_greetings_0_0= ruleToken ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_greetings_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:79:28: ( ( (lv_greetings_0_0= ruleToken ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:1: ( (lv_greetings_0_0= ruleToken ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:1: ( (lv_greetings_0_0= ruleToken ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:81:1: (lv_greetings_0_0= ruleToken )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:81:1: (lv_greetings_0_0= ruleToken )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:82:3: lv_greetings_0_0= ruleToken
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getGreetingsTokenParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleToken_in_ruleModel130);
            lv_greetings_0_0=ruleToken();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		add(
                   			current, 
                   			"greetings",
                    		lv_greetings_0_0, 
                    		"Token");
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleToken"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:116:1: entryRuleToken returns [String current=null] : iv_ruleToken= ruleToken EOF ;
    public final String entryRuleToken() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleToken = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:117:2: (iv_ruleToken= ruleToken EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:118:2: iv_ruleToken= ruleToken EOF
            {
             newCompositeNode(grammarAccess.getTokenRule()); 
            pushFollow(FOLLOW_ruleToken_in_entryRuleToken176);
            iv_ruleToken=ruleToken();

            state._fsp--;

             current =iv_ruleToken.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleToken187); 

            }

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:125:1: ruleToken returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Identifier_0= RULE_IDENTIFIER | this_KEYWORD_1= RULE_KEYWORD | this_PPOPorPUNC_2= RULE_PPOPORPUNC ) ;
    public final AntlrDatatypeRuleToken ruleToken() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_Identifier_0=null;
        Token this_KEYWORD_1=null;
        Token this_PPOPorPUNC_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:128:28: ( (this_Identifier_0= RULE_IDENTIFIER | this_KEYWORD_1= RULE_KEYWORD | this_PPOPorPUNC_2= RULE_PPOPORPUNC ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:129:1: (this_Identifier_0= RULE_IDENTIFIER | this_KEYWORD_1= RULE_KEYWORD | this_PPOPorPUNC_2= RULE_PPOPORPUNC )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:129:1: (this_Identifier_0= RULE_IDENTIFIER | this_KEYWORD_1= RULE_KEYWORD | this_PPOPorPUNC_2= RULE_PPOPORPUNC )
            int alt1=3;
            switch ( input.LA(1) ) {
            case RULE_IDENTIFIER:
                {
                alt1=1;
                }
                break;
            case RULE_KEYWORD:
                {
                alt1=2;
                }
                break;
            case RULE_PPOPORPUNC:
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
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:129:6: this_Identifier_0= RULE_IDENTIFIER
                    {
                    this_Identifier_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleToken227); 

                    		current.merge(this_Identifier_0);
                        
                     
                        newLeafNode(this_Identifier_0, grammarAccess.getTokenAccess().getIdentifierTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:137:10: this_KEYWORD_1= RULE_KEYWORD
                    {
                    this_KEYWORD_1=(Token)match(input,RULE_KEYWORD,FOLLOW_RULE_KEYWORD_in_ruleToken253); 

                    		current.merge(this_KEYWORD_1);
                        
                     
                        newLeafNode(this_KEYWORD_1, grammarAccess.getTokenAccess().getKEYWORDTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:145:10: this_PPOPorPUNC_2= RULE_PPOPORPUNC
                    {
                    this_PPOPorPUNC_2=(Token)match(input,RULE_PPOPORPUNC,FOLLOW_RULE_PPOPORPUNC_in_ruleToken279); 

                    		current.merge(this_PPOPorPUNC_2);
                        
                     
                        newLeafNode(this_PPOPorPUNC_2, grammarAccess.getTokenAccess().getPPOPorPUNCTerminalRuleCall_2()); 
                        

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

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleToken_in_ruleModel130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleToken_in_entryRuleToken176 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleToken187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleToken227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KEYWORD_in_ruleToken253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PPOPORPUNC_in_ruleToken279 = new BitSet(new long[]{0x0000000000000002L});

}