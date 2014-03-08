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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_KEYWORD", "RULE_PREPROCESSING_OP_OR_PUNC", "RULE_ID", "RULE_INT", "RULE_CHARACTER_LITERAL", "RULE_FLOATING_LITERAL", "RULE_STRING_LITERAL", "RULE_HEXADECIMAL_DIGIT", "RULE_HEX_QUAD", "RULE_UNIVERSAL_CHARACTER_NAME", "RULE_H_CHAR", "RULE_Q_CHAR", "RULE_HEADER_NAME", "RULE_NONDIGIT", "RULE_DIGIT", "RULE_DECIMAL_LITERAL", "RULE_OCTAL_LITERAL", "RULE_HEXADECIMAL_LITERAL", "RULE_INTEGER_SUFFIX", "RULE_OCTAL_DIGIT", "RULE_C_CHAR", "RULE_ESCAPE_SEQUENCE", "RULE_SIMPLE_ESCAPE_SEQUENCE", "RULE_OCTAL_ESCAPE_SEQUENCE", "RULE_HEXADECIMAL_ESCAPE_SEQUENCE", "RULE_FRACTIONAL_CONSTANT", "RULE_EXPONENT_PART", "RULE_ENC_PREFIX", "RULE_SCHAR", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'nullptr'", "'::'", "'['", "']'", "'alignas'", "'('", "'...'", "')'", "','", "'const'", "'volatile'", "'&'", "'&&'", "'->'", "'*'", "'operator'", "'<'", "'>'", "'new'", "'delete'", "'+'", "'-'", "'/'", "'%'", "'^'", "'|'", "'~'", "'!'", "'='", "'+='", "'-='", "'*='", "'/='", "'%='", "'^='", "'&='", "'|='", "'<<'", "'>>'", "'>>='", "'<<='", "'=='", "'!='", "'<='", "'>='", "'||'", "'++'", "'--'", "'->*'", "'()'", "'[]'", "'\"'", "'class'", "'typename'", "'template'", "'catch'", "'throw'", "'noexcept'", "'ConstantExpression'", "'TypeId'", "'IdExpression'", "'ParameterDeclaration'", "'Declaration'", "'NestedNameSpecifier'", "'AssignmentExpression'", "'AlignmentExpression'", "'TypeSpecifier'", "'AbstractDeclarator'", "'CompoundStatement'", "'CtorInitializer'", "'TypeIdList'", "'UnqualifiedId'", "'ParameterDeclarationClause'", "'TrailingTypeSpecifier'", "'ClassName'", "'Initializer'"
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
    public static final int RULE_NONDIGIT=17;
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
    public static final int RULE_STRING_LITERAL=10;
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
    public static final int RULE_INT=7;
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


    // $ANTLR start "entryRuleNamespaceBody"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:237:1: entryRuleNamespaceBody returns [String current=null] : iv_ruleNamespaceBody= ruleNamespaceBody EOF ;
    public final String entryRuleNamespaceBody() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNamespaceBody = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:238:2: (iv_ruleNamespaceBody= ruleNamespaceBody EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:239:2: iv_ruleNamespaceBody= ruleNamespaceBody EOF
            {
             newCompositeNode(grammarAccess.getNamespaceBodyRule()); 
            pushFollow(FOLLOW_ruleNamespaceBody_in_entryRuleNamespaceBody579);
            iv_ruleNamespaceBody=ruleNamespaceBody();

            state._fsp--;

             current =iv_ruleNamespaceBody.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamespaceBody590); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:246:1: ruleNamespaceBody returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Declaration_0= ruleDeclaration )* ;
    public final AntlrDatatypeRuleToken ruleNamespaceBody() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Declaration_0 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:249:28: ( (this_Declaration_0= ruleDeclaration )* )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:250:1: (this_Declaration_0= ruleDeclaration )*
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:250:1: (this_Declaration_0= ruleDeclaration )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==102) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:251:5: this_Declaration_0= ruleDeclaration
            	    {
            	     
            	            newCompositeNode(grammarAccess.getNamespaceBodyAccess().getDeclarationParserRuleCall()); 
            	        
            	    pushFollow(FOLLOW_ruleDeclaration_in_ruleNamespaceBody637);
            	    this_Declaration_0=ruleDeclaration();

            	    state._fsp--;


            	    		current.merge(this_Declaration_0);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop5;
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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:271:1: entryRuleQualifiedNamespaceSpecifier returns [String current=null] : iv_ruleQualifiedNamespaceSpecifier= ruleQualifiedNamespaceSpecifier EOF ;
    public final String entryRuleQualifiedNamespaceSpecifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNamespaceSpecifier = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:272:2: (iv_ruleQualifiedNamespaceSpecifier= ruleQualifiedNamespaceSpecifier EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:273:2: iv_ruleQualifiedNamespaceSpecifier= ruleQualifiedNamespaceSpecifier EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNamespaceSpecifierRule()); 
            pushFollow(FOLLOW_ruleQualifiedNamespaceSpecifier_in_entryRuleQualifiedNamespaceSpecifier686);
            iv_ruleQualifiedNamespaceSpecifier=ruleQualifiedNamespaceSpecifier();

            state._fsp--;

             current =iv_ruleQualifiedNamespaceSpecifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNamespaceSpecifier697); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:280:1: ruleQualifiedNamespaceSpecifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '::' )? (this_NestedNameSpecifier_1= ruleNestedNameSpecifier )? this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNamespaceSpecifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;
        AntlrDatatypeRuleToken this_NestedNameSpecifier_1 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:283:28: ( ( (kw= '::' )? (this_NestedNameSpecifier_1= ruleNestedNameSpecifier )? this_ID_2= RULE_ID ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:284:1: ( (kw= '::' )? (this_NestedNameSpecifier_1= ruleNestedNameSpecifier )? this_ID_2= RULE_ID )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:284:1: ( (kw= '::' )? (this_NestedNameSpecifier_1= ruleNestedNameSpecifier )? this_ID_2= RULE_ID )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:284:2: (kw= '::' )? (this_NestedNameSpecifier_1= ruleNestedNameSpecifier )? this_ID_2= RULE_ID
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:284:2: (kw= '::' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==41) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:285:2: kw= '::'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleQualifiedNamespaceSpecifier736); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQualifiedNamespaceSpecifierAccess().getColonColonKeyword_0()); 
                        

                    }
                    break;

            }

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:290:3: (this_NestedNameSpecifier_1= ruleNestedNameSpecifier )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==103) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:291:5: this_NestedNameSpecifier_1= ruleNestedNameSpecifier
                    {
                     
                            newCompositeNode(grammarAccess.getQualifiedNamespaceSpecifierAccess().getNestedNameSpecifierParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNestedNameSpecifier_in_ruleQualifiedNamespaceSpecifier761);
                    this_NestedNameSpecifier_1=ruleNestedNameSpecifier();

                    state._fsp--;


                    		current.merge(this_NestedNameSpecifier_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedNamespaceSpecifier783); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:324:1: entryRuleAttributeSpecifier returns [String current=null] : iv_ruleAttributeSpecifier= ruleAttributeSpecifier EOF ;
    public final String entryRuleAttributeSpecifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAttributeSpecifier = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:325:2: (iv_ruleAttributeSpecifier= ruleAttributeSpecifier EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:326:2: iv_ruleAttributeSpecifier= ruleAttributeSpecifier EOF
            {
             newCompositeNode(grammarAccess.getAttributeSpecifierRule()); 
            pushFollow(FOLLOW_ruleAttributeSpecifier_in_entryRuleAttributeSpecifier837);
            iv_ruleAttributeSpecifier=ruleAttributeSpecifier();

            state._fsp--;

             current =iv_ruleAttributeSpecifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeSpecifier848); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:333:1: ruleAttributeSpecifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '[' kw= '[' this_AttributeList_2= ruleAttributeList kw= ']' kw= ']' ) | this_AlignmentSpecifier_5= ruleAlignmentSpecifier ) ;
    public final AntlrDatatypeRuleToken ruleAttributeSpecifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_AttributeList_2 = null;

        AntlrDatatypeRuleToken this_AlignmentSpecifier_5 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:336:28: ( ( (kw= '[' kw= '[' this_AttributeList_2= ruleAttributeList kw= ']' kw= ']' ) | this_AlignmentSpecifier_5= ruleAlignmentSpecifier ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:337:1: ( (kw= '[' kw= '[' this_AttributeList_2= ruleAttributeList kw= ']' kw= ']' ) | this_AlignmentSpecifier_5= ruleAlignmentSpecifier )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:337:1: ( (kw= '[' kw= '[' this_AttributeList_2= ruleAttributeList kw= ']' kw= ']' ) | this_AlignmentSpecifier_5= ruleAlignmentSpecifier )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==42) ) {
                alt8=1;
            }
            else if ( (LA8_0==44) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:337:2: (kw= '[' kw= '[' this_AttributeList_2= ruleAttributeList kw= ']' kw= ']' )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:337:2: (kw= '[' kw= '[' this_AttributeList_2= ruleAttributeList kw= ']' kw= ']' )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:338:2: kw= '[' kw= '[' this_AttributeList_2= ruleAttributeList kw= ']' kw= ']'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleAttributeSpecifier887); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAttributeSpecifierAccess().getLeftSquareBracketKeyword_0_0()); 
                        
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleAttributeSpecifier900); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAttributeSpecifierAccess().getLeftSquareBracketKeyword_0_1()); 
                        
                     
                            newCompositeNode(grammarAccess.getAttributeSpecifierAccess().getAttributeListParserRuleCall_0_2()); 
                        
                    pushFollow(FOLLOW_ruleAttributeList_in_ruleAttributeSpecifier922);
                    this_AttributeList_2=ruleAttributeList();

                    state._fsp--;


                    		current.merge(this_AttributeList_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleAttributeSpecifier940); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAttributeSpecifierAccess().getRightSquareBracketKeyword_0_3()); 
                        
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleAttributeSpecifier953); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAttributeSpecifierAccess().getRightSquareBracketKeyword_0_4()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:374:5: this_AlignmentSpecifier_5= ruleAlignmentSpecifier
                    {
                     
                            newCompositeNode(grammarAccess.getAttributeSpecifierAccess().getAlignmentSpecifierParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAlignmentSpecifier_in_ruleAttributeSpecifier982);
                    this_AlignmentSpecifier_5=ruleAlignmentSpecifier();

                    state._fsp--;


                    		current.merge(this_AlignmentSpecifier_5);
                        
                     
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
    // $ANTLR end "ruleAttributeSpecifier"


    // $ANTLR start "entryRuleAlignmentSpecifier"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:392:1: entryRuleAlignmentSpecifier returns [String current=null] : iv_ruleAlignmentSpecifier= ruleAlignmentSpecifier EOF ;
    public final String entryRuleAlignmentSpecifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAlignmentSpecifier = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:393:2: (iv_ruleAlignmentSpecifier= ruleAlignmentSpecifier EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:394:2: iv_ruleAlignmentSpecifier= ruleAlignmentSpecifier EOF
            {
             newCompositeNode(grammarAccess.getAlignmentSpecifierRule()); 
            pushFollow(FOLLOW_ruleAlignmentSpecifier_in_entryRuleAlignmentSpecifier1028);
            iv_ruleAlignmentSpecifier=ruleAlignmentSpecifier();

            state._fsp--;

             current =iv_ruleAlignmentSpecifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlignmentSpecifier1039); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlignmentSpecifier"


    // $ANTLR start "ruleAlignmentSpecifier"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:401:1: ruleAlignmentSpecifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'alignas' kw= '(' this_TypeId_2= ruleTypeId (kw= '...' )? kw= ')' ) | (kw= 'alignas' kw= '(' this_AlignmentExpression_7= ruleAlignmentExpression (kw= '...' )? kw= ')' ) ) ;
    public final AntlrDatatypeRuleToken ruleAlignmentSpecifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_TypeId_2 = null;

        AntlrDatatypeRuleToken this_AlignmentExpression_7 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:404:28: ( ( (kw= 'alignas' kw= '(' this_TypeId_2= ruleTypeId (kw= '...' )? kw= ')' ) | (kw= 'alignas' kw= '(' this_AlignmentExpression_7= ruleAlignmentExpression (kw= '...' )? kw= ')' ) ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:405:1: ( (kw= 'alignas' kw= '(' this_TypeId_2= ruleTypeId (kw= '...' )? kw= ')' ) | (kw= 'alignas' kw= '(' this_AlignmentExpression_7= ruleAlignmentExpression (kw= '...' )? kw= ')' ) )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:405:1: ( (kw= 'alignas' kw= '(' this_TypeId_2= ruleTypeId (kw= '...' )? kw= ')' ) | (kw= 'alignas' kw= '(' this_AlignmentExpression_7= ruleAlignmentExpression (kw= '...' )? kw= ')' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==44) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==45) ) {
                    int LA11_2 = input.LA(3);

                    if ( (LA11_2==99) ) {
                        alt11=1;
                    }
                    else if ( (LA11_2==105) ) {
                        alt11=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:405:2: (kw= 'alignas' kw= '(' this_TypeId_2= ruleTypeId (kw= '...' )? kw= ')' )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:405:2: (kw= 'alignas' kw= '(' this_TypeId_2= ruleTypeId (kw= '...' )? kw= ')' )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:406:2: kw= 'alignas' kw= '(' this_TypeId_2= ruleTypeId (kw= '...' )? kw= ')'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleAlignmentSpecifier1078); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAlignmentSpecifierAccess().getAlignasKeyword_0_0()); 
                        
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleAlignmentSpecifier1091); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAlignmentSpecifierAccess().getLeftParenthesisKeyword_0_1()); 
                        
                     
                            newCompositeNode(grammarAccess.getAlignmentSpecifierAccess().getTypeIdParserRuleCall_0_2()); 
                        
                    pushFollow(FOLLOW_ruleTypeId_in_ruleAlignmentSpecifier1113);
                    this_TypeId_2=ruleTypeId();

                    state._fsp--;


                    		current.merge(this_TypeId_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:428:1: (kw= '...' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==46) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:429:2: kw= '...'
                            {
                            kw=(Token)match(input,46,FOLLOW_46_in_ruleAlignmentSpecifier1132); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getAlignmentSpecifierAccess().getFullStopFullStopFullStopKeyword_0_3()); 
                                

                            }
                            break;

                    }

                    kw=(Token)match(input,47,FOLLOW_47_in_ruleAlignmentSpecifier1147); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAlignmentSpecifierAccess().getRightParenthesisKeyword_0_4()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:441:6: (kw= 'alignas' kw= '(' this_AlignmentExpression_7= ruleAlignmentExpression (kw= '...' )? kw= ')' )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:441:6: (kw= 'alignas' kw= '(' this_AlignmentExpression_7= ruleAlignmentExpression (kw= '...' )? kw= ')' )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:442:2: kw= 'alignas' kw= '(' this_AlignmentExpression_7= ruleAlignmentExpression (kw= '...' )? kw= ')'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleAlignmentSpecifier1168); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAlignmentSpecifierAccess().getAlignasKeyword_1_0()); 
                        
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleAlignmentSpecifier1181); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAlignmentSpecifierAccess().getLeftParenthesisKeyword_1_1()); 
                        
                     
                            newCompositeNode(grammarAccess.getAlignmentSpecifierAccess().getAlignmentExpressionParserRuleCall_1_2()); 
                        
                    pushFollow(FOLLOW_ruleAlignmentExpression_in_ruleAlignmentSpecifier1203);
                    this_AlignmentExpression_7=ruleAlignmentExpression();

                    state._fsp--;


                    		current.merge(this_AlignmentExpression_7);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:464:1: (kw= '...' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==46) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:465:2: kw= '...'
                            {
                            kw=(Token)match(input,46,FOLLOW_46_in_ruleAlignmentSpecifier1222); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getAlignmentSpecifierAccess().getFullStopFullStopFullStopKeyword_1_3()); 
                                

                            }
                            break;

                    }

                    kw=(Token)match(input,47,FOLLOW_47_in_ruleAlignmentSpecifier1237); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAlignmentSpecifierAccess().getRightParenthesisKeyword_1_4()); 
                        

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
    // $ANTLR end "ruleAlignmentSpecifier"


    // $ANTLR start "entryRuleAttributeList"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:484:1: entryRuleAttributeList returns [String current=null] : iv_ruleAttributeList= ruleAttributeList EOF ;
    public final String entryRuleAttributeList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAttributeList = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:485:2: (iv_ruleAttributeList= ruleAttributeList EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:486:2: iv_ruleAttributeList= ruleAttributeList EOF
            {
             newCompositeNode(grammarAccess.getAttributeListRule()); 
            pushFollow(FOLLOW_ruleAttributeList_in_entryRuleAttributeList1279);
            iv_ruleAttributeList=ruleAttributeList();

            state._fsp--;

             current =iv_ruleAttributeList.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeList1290); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:493:1: ruleAttributeList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_Attribute_0= ruleAttribute (kw= '...' )? ) (kw= ',' (this_Attribute_3= ruleAttribute (kw= '...' )? )? )* ) ;
    public final AntlrDatatypeRuleToken ruleAttributeList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Attribute_0 = null;

        AntlrDatatypeRuleToken this_Attribute_3 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:496:28: ( ( (this_Attribute_0= ruleAttribute (kw= '...' )? ) (kw= ',' (this_Attribute_3= ruleAttribute (kw= '...' )? )? )* ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:497:1: ( (this_Attribute_0= ruleAttribute (kw= '...' )? ) (kw= ',' (this_Attribute_3= ruleAttribute (kw= '...' )? )? )* )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:497:1: ( (this_Attribute_0= ruleAttribute (kw= '...' )? ) (kw= ',' (this_Attribute_3= ruleAttribute (kw= '...' )? )? )* )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:497:2: (this_Attribute_0= ruleAttribute (kw= '...' )? ) (kw= ',' (this_Attribute_3= ruleAttribute (kw= '...' )? )? )*
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:497:2: (this_Attribute_0= ruleAttribute (kw= '...' )? )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:498:5: this_Attribute_0= ruleAttribute (kw= '...' )?
            {
             
                    newCompositeNode(grammarAccess.getAttributeListAccess().getAttributeParserRuleCall_0_0()); 
                
            pushFollow(FOLLOW_ruleAttribute_in_ruleAttributeList1338);
            this_Attribute_0=ruleAttribute();

            state._fsp--;


            		current.merge(this_Attribute_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:508:1: (kw= '...' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==46) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:509:2: kw= '...'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleAttributeList1357); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAttributeListAccess().getFullStopFullStopFullStopKeyword_0_1()); 
                        

                    }
                    break;

            }


            }

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:514:4: (kw= ',' (this_Attribute_3= ruleAttribute (kw= '...' )? )? )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==48) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:515:2: kw= ',' (this_Attribute_3= ruleAttribute (kw= '...' )? )?
            	    {
            	    kw=(Token)match(input,48,FOLLOW_48_in_ruleAttributeList1374); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getAttributeListAccess().getCommaKeyword_1_0()); 
            	        
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:520:1: (this_Attribute_3= ruleAttribute (kw= '...' )? )?
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==RULE_ID) ) {
            	        alt14=1;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:521:5: this_Attribute_3= ruleAttribute (kw= '...' )?
            	            {
            	             
            	                    newCompositeNode(grammarAccess.getAttributeListAccess().getAttributeParserRuleCall_1_1_0()); 
            	                
            	            pushFollow(FOLLOW_ruleAttribute_in_ruleAttributeList1397);
            	            this_Attribute_3=ruleAttribute();

            	            state._fsp--;


            	            		current.merge(this_Attribute_3);
            	                
            	             
            	                    afterParserOrEnumRuleCall();
            	                
            	            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:531:1: (kw= '...' )?
            	            int alt13=2;
            	            int LA13_0 = input.LA(1);

            	            if ( (LA13_0==46) ) {
            	                alt13=1;
            	            }
            	            switch (alt13) {
            	                case 1 :
            	                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:532:2: kw= '...'
            	                    {
            	                    kw=(Token)match(input,46,FOLLOW_46_in_ruleAttributeList1416); 

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
            	    break loop15;
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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:545:1: entryRuleAttribute returns [String current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final String entryRuleAttribute() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAttribute = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:546:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:547:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute1463);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute1474); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:554:1: ruleAttribute returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_AttributeToken_0= ruleAttributeToken (this_AttributeArgumentClause_1= ruleAttributeArgumentClause )? ) ;
    public final AntlrDatatypeRuleToken ruleAttribute() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_AttributeToken_0 = null;

        AntlrDatatypeRuleToken this_AttributeArgumentClause_1 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:557:28: ( (this_AttributeToken_0= ruleAttributeToken (this_AttributeArgumentClause_1= ruleAttributeArgumentClause )? ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:558:1: (this_AttributeToken_0= ruleAttributeToken (this_AttributeArgumentClause_1= ruleAttributeArgumentClause )? )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:558:1: (this_AttributeToken_0= ruleAttributeToken (this_AttributeArgumentClause_1= ruleAttributeArgumentClause )? )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:559:5: this_AttributeToken_0= ruleAttributeToken (this_AttributeArgumentClause_1= ruleAttributeArgumentClause )?
            {
             
                    newCompositeNode(grammarAccess.getAttributeAccess().getAttributeTokenParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleAttributeToken_in_ruleAttribute1521);
            this_AttributeToken_0=ruleAttributeToken();

            state._fsp--;


            		current.merge(this_AttributeToken_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:569:1: (this_AttributeArgumentClause_1= ruleAttributeArgumentClause )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==45) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:570:5: this_AttributeArgumentClause_1= ruleAttributeArgumentClause
                    {
                     
                            newCompositeNode(grammarAccess.getAttributeAccess().getAttributeArgumentClauseParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAttributeArgumentClause_in_ruleAttribute1549);
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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:588:1: entryRuleAttributeToken returns [String current=null] : iv_ruleAttributeToken= ruleAttributeToken EOF ;
    public final String entryRuleAttributeToken() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAttributeToken = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:589:2: (iv_ruleAttributeToken= ruleAttributeToken EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:590:2: iv_ruleAttributeToken= ruleAttributeToken EOF
            {
             newCompositeNode(grammarAccess.getAttributeTokenRule()); 
            pushFollow(FOLLOW_ruleAttributeToken_in_entryRuleAttributeToken1597);
            iv_ruleAttributeToken=ruleAttributeToken();

            state._fsp--;

             current =iv_ruleAttributeToken.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeToken1608); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:597:1: ruleAttributeToken returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID kw= '::' )? this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleAttributeToken() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:600:28: ( ( (this_ID_0= RULE_ID kw= '::' )? this_ID_2= RULE_ID ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:601:1: ( (this_ID_0= RULE_ID kw= '::' )? this_ID_2= RULE_ID )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:601:1: ( (this_ID_0= RULE_ID kw= '::' )? this_ID_2= RULE_ID )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:601:2: (this_ID_0= RULE_ID kw= '::' )? this_ID_2= RULE_ID
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:601:2: (this_ID_0= RULE_ID kw= '::' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==41) ) {
                    alt17=1;
                }
            }
            switch (alt17) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:601:7: this_ID_0= RULE_ID kw= '::'
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttributeToken1649); 

                    		current.merge(this_ID_0);
                        
                     
                        newLeafNode(this_ID_0, grammarAccess.getAttributeTokenAccess().getIDTerminalRuleCall_0_0()); 
                        
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleAttributeToken1667); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAttributeTokenAccess().getColonColonKeyword_0_1()); 
                        

                    }
                    break;

            }

            this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttributeToken1684); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:629:1: entryRuleAttributeArgumentClause returns [String current=null] : iv_ruleAttributeArgumentClause= ruleAttributeArgumentClause EOF ;
    public final String entryRuleAttributeArgumentClause() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAttributeArgumentClause = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:630:2: (iv_ruleAttributeArgumentClause= ruleAttributeArgumentClause EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:631:2: iv_ruleAttributeArgumentClause= ruleAttributeArgumentClause EOF
            {
             newCompositeNode(grammarAccess.getAttributeArgumentClauseRule()); 
            pushFollow(FOLLOW_ruleAttributeArgumentClause_in_entryRuleAttributeArgumentClause1730);
            iv_ruleAttributeArgumentClause=ruleAttributeArgumentClause();

            state._fsp--;

             current =iv_ruleAttributeArgumentClause.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeArgumentClause1741); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:638:1: ruleAttributeArgumentClause returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '(' this_Token_1= ruleToken kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleAttributeArgumentClause() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Token_1 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:641:28: ( (kw= '(' this_Token_1= ruleToken kw= ')' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:642:1: (kw= '(' this_Token_1= ruleToken kw= ')' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:642:1: (kw= '(' this_Token_1= ruleToken kw= ')' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:643:2: kw= '(' this_Token_1= ruleToken kw= ')'
            {
            kw=(Token)match(input,45,FOLLOW_45_in_ruleAttributeArgumentClause1779); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getAttributeArgumentClauseAccess().getLeftParenthesisKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getAttributeArgumentClauseAccess().getTokenParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleToken_in_ruleAttributeArgumentClause1801);
            this_Token_1=ruleToken();

            state._fsp--;


            		current.merge(this_Token_1);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,47,FOLLOW_47_in_ruleAttributeArgumentClause1819); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:675:1: entryRuleInitDeclarator returns [String current=null] : iv_ruleInitDeclarator= ruleInitDeclarator EOF ;
    public final String entryRuleInitDeclarator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInitDeclarator = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:676:2: (iv_ruleInitDeclarator= ruleInitDeclarator EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:677:2: iv_ruleInitDeclarator= ruleInitDeclarator EOF
            {
             newCompositeNode(grammarAccess.getInitDeclaratorRule()); 
            pushFollow(FOLLOW_ruleInitDeclarator_in_entryRuleInitDeclarator1862);
            iv_ruleInitDeclarator=ruleInitDeclarator();

            state._fsp--;

             current =iv_ruleInitDeclarator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInitDeclarator1873); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:684:1: ruleInitDeclarator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Declarator_0= ruleDeclarator (this_Initializer_1= ruleInitializer )? ) ;
    public final AntlrDatatypeRuleToken ruleInitDeclarator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Declarator_0 = null;

        AntlrDatatypeRuleToken this_Initializer_1 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:687:28: ( (this_Declarator_0= ruleDeclarator (this_Initializer_1= ruleInitializer )? ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:688:1: (this_Declarator_0= ruleDeclarator (this_Initializer_1= ruleInitializer )? )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:688:1: (this_Declarator_0= ruleDeclarator (this_Initializer_1= ruleInitializer )? )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:689:5: this_Declarator_0= ruleDeclarator (this_Initializer_1= ruleInitializer )?
            {
             
                    newCompositeNode(grammarAccess.getInitDeclaratorAccess().getDeclaratorParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleDeclarator_in_ruleInitDeclarator1920);
            this_Declarator_0=ruleDeclarator();

            state._fsp--;


            		current.merge(this_Declarator_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:699:1: (this_Initializer_1= ruleInitializer )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==115) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:700:5: this_Initializer_1= ruleInitializer
                    {
                     
                            newCompositeNode(grammarAccess.getInitDeclaratorAccess().getInitializerParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleInitializer_in_ruleInitDeclarator1948);
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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:718:1: entryRuleDeclarator returns [String current=null] : iv_ruleDeclarator= ruleDeclarator EOF ;
    public final String entryRuleDeclarator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDeclarator = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:719:2: (iv_ruleDeclarator= ruleDeclarator EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:720:2: iv_ruleDeclarator= ruleDeclarator EOF
            {
             newCompositeNode(grammarAccess.getDeclaratorRule()); 
            pushFollow(FOLLOW_ruleDeclarator_in_entryRuleDeclarator1996);
            iv_ruleDeclarator=ruleDeclarator();

            state._fsp--;

             current =iv_ruleDeclarator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclarator2007); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:727:1: ruleDeclarator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_PtrOperator_0= rulePtrOperator )+ this_NoptrDeclarator_1= ruleNoptrDeclarator ) | (this_NoptrDeclarator_2= ruleNoptrDeclarator (this_ParametersAndQualifiers_3= ruleParametersAndQualifiers this_TrailingReturnType_4= ruleTrailingReturnType )? ) ) ;
    public final AntlrDatatypeRuleToken ruleDeclarator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_PtrOperator_0 = null;

        AntlrDatatypeRuleToken this_NoptrDeclarator_1 = null;

        AntlrDatatypeRuleToken this_NoptrDeclarator_2 = null;

        AntlrDatatypeRuleToken this_ParametersAndQualifiers_3 = null;

        AntlrDatatypeRuleToken this_TrailingReturnType_4 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:730:28: ( ( ( (this_PtrOperator_0= rulePtrOperator )+ this_NoptrDeclarator_1= ruleNoptrDeclarator ) | (this_NoptrDeclarator_2= ruleNoptrDeclarator (this_ParametersAndQualifiers_3= ruleParametersAndQualifiers this_TrailingReturnType_4= ruleTrailingReturnType )? ) ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:731:1: ( ( (this_PtrOperator_0= rulePtrOperator )+ this_NoptrDeclarator_1= ruleNoptrDeclarator ) | (this_NoptrDeclarator_2= ruleNoptrDeclarator (this_ParametersAndQualifiers_3= ruleParametersAndQualifiers this_TrailingReturnType_4= ruleTrailingReturnType )? ) )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:731:1: ( ( (this_PtrOperator_0= rulePtrOperator )+ this_NoptrDeclarator_1= ruleNoptrDeclarator ) | (this_NoptrDeclarator_2= ruleNoptrDeclarator (this_ParametersAndQualifiers_3= ruleParametersAndQualifiers this_TrailingReturnType_4= ruleTrailingReturnType )? ) )
            int alt21=2;
            switch ( input.LA(1) ) {
            case 51:
            case 52:
            case 54:
                {
                alt21=1;
                }
                break;
            case 41:
                {
                int LA21_2 = input.LA(2);

                if ( (LA21_2==103) ) {
                    int LA21_3 = input.LA(3);

                    if ( (LA21_3==114) ) {
                        alt21=2;
                    }
                    else if ( (LA21_3==54) ) {
                        alt21=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA21_2==114) ) {
                    alt21=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 2, input);

                    throw nvae;
                }
                }
                break;
            case 103:
                {
                int LA21_3 = input.LA(2);

                if ( (LA21_3==114) ) {
                    alt21=2;
                }
                else if ( (LA21_3==54) ) {
                    alt21=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 3, input);

                    throw nvae;
                }
                }
                break;
            case 45:
            case 46:
            case 100:
            case 114:
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
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:731:2: ( (this_PtrOperator_0= rulePtrOperator )+ this_NoptrDeclarator_1= ruleNoptrDeclarator )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:731:2: ( (this_PtrOperator_0= rulePtrOperator )+ this_NoptrDeclarator_1= ruleNoptrDeclarator )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:731:3: (this_PtrOperator_0= rulePtrOperator )+ this_NoptrDeclarator_1= ruleNoptrDeclarator
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:731:3: (this_PtrOperator_0= rulePtrOperator )+
                    int cnt19=0;
                    loop19:
                    do {
                        int alt19=2;
                        switch ( input.LA(1) ) {
                        case 41:
                            {
                            int LA19_2 = input.LA(2);

                            if ( (LA19_2==103) ) {
                                int LA19_3 = input.LA(3);

                                if ( (LA19_3==54) ) {
                                    alt19=1;
                                }


                            }


                            }
                            break;
                        case 103:
                            {
                            int LA19_3 = input.LA(2);

                            if ( (LA19_3==54) ) {
                                alt19=1;
                            }


                            }
                            break;
                        case 51:
                        case 52:
                        case 54:
                            {
                            alt19=1;
                            }
                            break;

                        }

                        switch (alt19) {
                    	case 1 :
                    	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:732:5: this_PtrOperator_0= rulePtrOperator
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getDeclaratorAccess().getPtrOperatorParserRuleCall_0_0()); 
                    	        
                    	    pushFollow(FOLLOW_rulePtrOperator_in_ruleDeclarator2056);
                    	    this_PtrOperator_0=rulePtrOperator();

                    	    state._fsp--;


                    	    		current.merge(this_PtrOperator_0);
                    	        
                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt19 >= 1 ) break loop19;
                                EarlyExitException eee =
                                    new EarlyExitException(19, input);
                                throw eee;
                        }
                        cnt19++;
                    } while (true);

                     
                            newCompositeNode(grammarAccess.getDeclaratorAccess().getNoptrDeclaratorParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleNoptrDeclarator_in_ruleDeclarator2085);
                    this_NoptrDeclarator_1=ruleNoptrDeclarator();

                    state._fsp--;


                    		current.merge(this_NoptrDeclarator_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:754:6: (this_NoptrDeclarator_2= ruleNoptrDeclarator (this_ParametersAndQualifiers_3= ruleParametersAndQualifiers this_TrailingReturnType_4= ruleTrailingReturnType )? )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:754:6: (this_NoptrDeclarator_2= ruleNoptrDeclarator (this_ParametersAndQualifiers_3= ruleParametersAndQualifiers this_TrailingReturnType_4= ruleTrailingReturnType )? )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:755:5: this_NoptrDeclarator_2= ruleNoptrDeclarator (this_ParametersAndQualifiers_3= ruleParametersAndQualifiers this_TrailingReturnType_4= ruleTrailingReturnType )?
                    {
                     
                            newCompositeNode(grammarAccess.getDeclaratorAccess().getNoptrDeclaratorParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_ruleNoptrDeclarator_in_ruleDeclarator2120);
                    this_NoptrDeclarator_2=ruleNoptrDeclarator();

                    state._fsp--;


                    		current.merge(this_NoptrDeclarator_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:765:1: (this_ParametersAndQualifiers_3= ruleParametersAndQualifiers this_TrailingReturnType_4= ruleTrailingReturnType )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==45) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:766:5: this_ParametersAndQualifiers_3= ruleParametersAndQualifiers this_TrailingReturnType_4= ruleTrailingReturnType
                            {
                             
                                    newCompositeNode(grammarAccess.getDeclaratorAccess().getParametersAndQualifiersParserRuleCall_1_1_0()); 
                                
                            pushFollow(FOLLOW_ruleParametersAndQualifiers_in_ruleDeclarator2148);
                            this_ParametersAndQualifiers_3=ruleParametersAndQualifiers();

                            state._fsp--;


                            		current.merge(this_ParametersAndQualifiers_3);
                                
                             
                                    afterParserOrEnumRuleCall();
                                
                             
                                    newCompositeNode(grammarAccess.getDeclaratorAccess().getTrailingReturnTypeParserRuleCall_1_1_1()); 
                                
                            pushFollow(FOLLOW_ruleTrailingReturnType_in_ruleDeclarator2175);
                            this_TrailingReturnType_4=ruleTrailingReturnType();

                            state._fsp--;


                            		current.merge(this_TrailingReturnType_4);
                                
                             
                                    afterParserOrEnumRuleCall();
                                

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
    // $ANTLR end "ruleDeclarator"


    // $ANTLR start "entryRulePtrDeclarator"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:795:1: entryRulePtrDeclarator returns [String current=null] : iv_rulePtrDeclarator= rulePtrDeclarator EOF ;
    public final String entryRulePtrDeclarator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePtrDeclarator = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:796:2: (iv_rulePtrDeclarator= rulePtrDeclarator EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:797:2: iv_rulePtrDeclarator= rulePtrDeclarator EOF
            {
             newCompositeNode(grammarAccess.getPtrDeclaratorRule()); 
            pushFollow(FOLLOW_rulePtrDeclarator_in_entryRulePtrDeclarator2224);
            iv_rulePtrDeclarator=rulePtrDeclarator();

            state._fsp--;

             current =iv_rulePtrDeclarator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePtrDeclarator2235); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePtrDeclarator"


    // $ANTLR start "rulePtrDeclarator"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:804:1: rulePtrDeclarator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_PtrOperator_0= rulePtrOperator )* this_NoptrDeclarator_1= ruleNoptrDeclarator ) ;
    public final AntlrDatatypeRuleToken rulePtrDeclarator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_PtrOperator_0 = null;

        AntlrDatatypeRuleToken this_NoptrDeclarator_1 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:807:28: ( ( (this_PtrOperator_0= rulePtrOperator )* this_NoptrDeclarator_1= ruleNoptrDeclarator ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:808:1: ( (this_PtrOperator_0= rulePtrOperator )* this_NoptrDeclarator_1= ruleNoptrDeclarator )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:808:1: ( (this_PtrOperator_0= rulePtrOperator )* this_NoptrDeclarator_1= ruleNoptrDeclarator )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:808:2: (this_PtrOperator_0= rulePtrOperator )* this_NoptrDeclarator_1= ruleNoptrDeclarator
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:808:2: (this_PtrOperator_0= rulePtrOperator )*
            loop22:
            do {
                int alt22=2;
                switch ( input.LA(1) ) {
                case 41:
                    {
                    int LA22_2 = input.LA(2);

                    if ( (LA22_2==103) ) {
                        int LA22_3 = input.LA(3);

                        if ( (LA22_3==54) ) {
                            alt22=1;
                        }


                    }


                    }
                    break;
                case 103:
                    {
                    int LA22_3 = input.LA(2);

                    if ( (LA22_3==54) ) {
                        alt22=1;
                    }


                    }
                    break;
                case 51:
                case 52:
                case 54:
                    {
                    alt22=1;
                    }
                    break;

                }

                switch (alt22) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:809:5: this_PtrOperator_0= rulePtrOperator
            	    {
            	     
            	            newCompositeNode(grammarAccess.getPtrDeclaratorAccess().getPtrOperatorParserRuleCall_0()); 
            	        
            	    pushFollow(FOLLOW_rulePtrOperator_in_rulePtrDeclarator2283);
            	    this_PtrOperator_0=rulePtrOperator();

            	    state._fsp--;


            	    		current.merge(this_PtrOperator_0);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             
                    newCompositeNode(grammarAccess.getPtrDeclaratorAccess().getNoptrDeclaratorParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleNoptrDeclarator_in_rulePtrDeclarator2312);
            this_NoptrDeclarator_1=ruleNoptrDeclarator();

            state._fsp--;


            		current.merge(this_NoptrDeclarator_1);
                
             
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
    // $ANTLR end "rulePtrDeclarator"


    // $ANTLR start "entryRuleNoptrDeclarator"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:838:1: entryRuleNoptrDeclarator returns [String current=null] : iv_ruleNoptrDeclarator= ruleNoptrDeclarator EOF ;
    public final String entryRuleNoptrDeclarator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNoptrDeclarator = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:839:2: (iv_ruleNoptrDeclarator= ruleNoptrDeclarator EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:840:2: iv_ruleNoptrDeclarator= ruleNoptrDeclarator EOF
            {
             newCompositeNode(grammarAccess.getNoptrDeclaratorRule()); 
            pushFollow(FOLLOW_ruleNoptrDeclarator_in_entryRuleNoptrDeclarator2358);
            iv_ruleNoptrDeclarator=ruleNoptrDeclarator();

            state._fsp--;

             current =iv_ruleNoptrDeclarator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoptrDeclarator2369); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:847:1: ruleNoptrDeclarator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this__NoptrDeclarator_0= rule_NoptrDeclarator (this___NoptrDeclarator_1= rule__NoptrDeclarator )* ) ;
    public final AntlrDatatypeRuleToken ruleNoptrDeclarator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this__NoptrDeclarator_0 = null;

        AntlrDatatypeRuleToken this___NoptrDeclarator_1 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:850:28: ( (this__NoptrDeclarator_0= rule_NoptrDeclarator (this___NoptrDeclarator_1= rule__NoptrDeclarator )* ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:851:1: (this__NoptrDeclarator_0= rule_NoptrDeclarator (this___NoptrDeclarator_1= rule__NoptrDeclarator )* )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:851:1: (this__NoptrDeclarator_0= rule_NoptrDeclarator (this___NoptrDeclarator_1= rule__NoptrDeclarator )* )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:852:5: this__NoptrDeclarator_0= rule_NoptrDeclarator (this___NoptrDeclarator_1= rule__NoptrDeclarator )*
            {
             
                    newCompositeNode(grammarAccess.getNoptrDeclaratorAccess().get_NoptrDeclaratorParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rule_NoptrDeclarator_in_ruleNoptrDeclarator2416);
            this__NoptrDeclarator_0=rule_NoptrDeclarator();

            state._fsp--;


            		current.merge(this__NoptrDeclarator_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:862:1: (this___NoptrDeclarator_1= rule__NoptrDeclarator )*
            loop23:
            do {
                int alt23=2;
                alt23 = dfa23.predict(input);
                switch (alt23) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:863:5: this___NoptrDeclarator_1= rule__NoptrDeclarator
            	    {
            	     
            	            newCompositeNode(grammarAccess.getNoptrDeclaratorAccess().get__NoptrDeclaratorParserRuleCall_1()); 
            	        
            	    pushFollow(FOLLOW_rule__NoptrDeclarator_in_ruleNoptrDeclarator2444);
            	    this___NoptrDeclarator_1=rule__NoptrDeclarator();

            	    state._fsp--;


            	    		current.merge(this___NoptrDeclarator_1);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop23;
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
    // $ANTLR end "ruleNoptrDeclarator"


    // $ANTLR start "entryRule_NoptrDeclarator"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:881:1: entryRule_NoptrDeclarator returns [String current=null] : iv_rule_NoptrDeclarator= rule_NoptrDeclarator EOF ;
    public final String entryRule_NoptrDeclarator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rule_NoptrDeclarator = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:882:2: (iv_rule_NoptrDeclarator= rule_NoptrDeclarator EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:883:2: iv_rule_NoptrDeclarator= rule_NoptrDeclarator EOF
            {
             newCompositeNode(grammarAccess.get_NoptrDeclaratorRule()); 
            pushFollow(FOLLOW_rule_NoptrDeclarator_in_entryRule_NoptrDeclarator2492);
            iv_rule_NoptrDeclarator=rule_NoptrDeclarator();

            state._fsp--;

             current =iv_rule_NoptrDeclarator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRule_NoptrDeclarator2503); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRule_NoptrDeclarator"


    // $ANTLR start "rule_NoptrDeclarator"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:890:1: rule_NoptrDeclarator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_DeclaratorId_0= ruleDeclaratorId (this_AttributeSpecifier_1= ruleAttributeSpecifier )* ) | (kw= '(' this_PtrDeclarator_3= rulePtrDeclarator kw= ')' ) ) ;
    public final AntlrDatatypeRuleToken rule_NoptrDeclarator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_DeclaratorId_0 = null;

        AntlrDatatypeRuleToken this_AttributeSpecifier_1 = null;

        AntlrDatatypeRuleToken this_PtrDeclarator_3 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:893:28: ( ( (this_DeclaratorId_0= ruleDeclaratorId (this_AttributeSpecifier_1= ruleAttributeSpecifier )* ) | (kw= '(' this_PtrDeclarator_3= rulePtrDeclarator kw= ')' ) ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:894:1: ( (this_DeclaratorId_0= ruleDeclaratorId (this_AttributeSpecifier_1= ruleAttributeSpecifier )* ) | (kw= '(' this_PtrDeclarator_3= rulePtrDeclarator kw= ')' ) )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:894:1: ( (this_DeclaratorId_0= ruleDeclaratorId (this_AttributeSpecifier_1= ruleAttributeSpecifier )* ) | (kw= '(' this_PtrDeclarator_3= rulePtrDeclarator kw= ')' ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==41||LA25_0==46||LA25_0==100||LA25_0==103||LA25_0==114) ) {
                alt25=1;
            }
            else if ( (LA25_0==45) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:894:2: (this_DeclaratorId_0= ruleDeclaratorId (this_AttributeSpecifier_1= ruleAttributeSpecifier )* )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:894:2: (this_DeclaratorId_0= ruleDeclaratorId (this_AttributeSpecifier_1= ruleAttributeSpecifier )* )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:895:5: this_DeclaratorId_0= ruleDeclaratorId (this_AttributeSpecifier_1= ruleAttributeSpecifier )*
                    {
                     
                            newCompositeNode(grammarAccess.get_NoptrDeclaratorAccess().getDeclaratorIdParserRuleCall_0_0()); 
                        
                    pushFollow(FOLLOW_ruleDeclaratorId_in_rule_NoptrDeclarator2551);
                    this_DeclaratorId_0=ruleDeclaratorId();

                    state._fsp--;


                    		current.merge(this_DeclaratorId_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:905:1: (this_AttributeSpecifier_1= ruleAttributeSpecifier )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==42) ) {
                            int LA24_2 = input.LA(2);

                            if ( (LA24_2==42) ) {
                                alt24=1;
                            }


                        }
                        else if ( (LA24_0==44) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:906:5: this_AttributeSpecifier_1= ruleAttributeSpecifier
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.get_NoptrDeclaratorAccess().getAttributeSpecifierParserRuleCall_0_1()); 
                    	        
                    	    pushFollow(FOLLOW_ruleAttributeSpecifier_in_rule_NoptrDeclarator2579);
                    	    this_AttributeSpecifier_1=ruleAttributeSpecifier();

                    	    state._fsp--;


                    	    		current.merge(this_AttributeSpecifier_1);
                    	        
                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:917:6: (kw= '(' this_PtrDeclarator_3= rulePtrDeclarator kw= ')' )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:917:6: (kw= '(' this_PtrDeclarator_3= rulePtrDeclarator kw= ')' )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:918:2: kw= '(' this_PtrDeclarator_3= rulePtrDeclarator kw= ')'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_rule_NoptrDeclarator2607); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.get_NoptrDeclaratorAccess().getLeftParenthesisKeyword_1_0()); 
                        
                     
                            newCompositeNode(grammarAccess.get_NoptrDeclaratorAccess().getPtrDeclaratorParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_rulePtrDeclarator_in_rule_NoptrDeclarator2629);
                    this_PtrDeclarator_3=rulePtrDeclarator();

                    state._fsp--;


                    		current.merge(this_PtrDeclarator_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,47,FOLLOW_47_in_rule_NoptrDeclarator2647); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.get_NoptrDeclaratorAccess().getRightParenthesisKeyword_1_2()); 
                        

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
    // $ANTLR end "rule_NoptrDeclarator"


    // $ANTLR start "entryRule__NoptrDeclarator"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:948:1: entryRule__NoptrDeclarator returns [String current=null] : iv_rule__NoptrDeclarator= rule__NoptrDeclarator EOF ;
    public final String entryRule__NoptrDeclarator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rule__NoptrDeclarator = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:949:2: (iv_rule__NoptrDeclarator= rule__NoptrDeclarator EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:950:2: iv_rule__NoptrDeclarator= rule__NoptrDeclarator EOF
            {
             newCompositeNode(grammarAccess.get__NoptrDeclaratorRule()); 
            pushFollow(FOLLOW_rule__NoptrDeclarator_in_entryRule__NoptrDeclarator2689);
            iv_rule__NoptrDeclarator=rule__NoptrDeclarator();

            state._fsp--;

             current =iv_rule__NoptrDeclarator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRule__NoptrDeclarator2700); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRule__NoptrDeclarator"


    // $ANTLR start "rule__NoptrDeclarator"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:957:1: rule__NoptrDeclarator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ParametersAndQualifiers_0= ruleParametersAndQualifiers | (kw= '[' this_ConstantExpression_2= ruleConstantExpression kw= ']' (this_AttributeSpecifier_4= ruleAttributeSpecifier )* ) ) ;
    public final AntlrDatatypeRuleToken rule__NoptrDeclarator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ParametersAndQualifiers_0 = null;

        AntlrDatatypeRuleToken this_ConstantExpression_2 = null;

        AntlrDatatypeRuleToken this_AttributeSpecifier_4 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:960:28: ( (this_ParametersAndQualifiers_0= ruleParametersAndQualifiers | (kw= '[' this_ConstantExpression_2= ruleConstantExpression kw= ']' (this_AttributeSpecifier_4= ruleAttributeSpecifier )* ) ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:961:1: (this_ParametersAndQualifiers_0= ruleParametersAndQualifiers | (kw= '[' this_ConstantExpression_2= ruleConstantExpression kw= ']' (this_AttributeSpecifier_4= ruleAttributeSpecifier )* ) )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:961:1: (this_ParametersAndQualifiers_0= ruleParametersAndQualifiers | (kw= '[' this_ConstantExpression_2= ruleConstantExpression kw= ']' (this_AttributeSpecifier_4= ruleAttributeSpecifier )* ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==45) ) {
                alt27=1;
            }
            else if ( (LA27_0==42) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:962:5: this_ParametersAndQualifiers_0= ruleParametersAndQualifiers
                    {
                     
                            newCompositeNode(grammarAccess.get__NoptrDeclaratorAccess().getParametersAndQualifiersParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleParametersAndQualifiers_in_rule__NoptrDeclarator2747);
                    this_ParametersAndQualifiers_0=ruleParametersAndQualifiers();

                    state._fsp--;


                    		current.merge(this_ParametersAndQualifiers_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:973:6: (kw= '[' this_ConstantExpression_2= ruleConstantExpression kw= ']' (this_AttributeSpecifier_4= ruleAttributeSpecifier )* )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:973:6: (kw= '[' this_ConstantExpression_2= ruleConstantExpression kw= ']' (this_AttributeSpecifier_4= ruleAttributeSpecifier )* )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:974:2: kw= '[' this_ConstantExpression_2= ruleConstantExpression kw= ']' (this_AttributeSpecifier_4= ruleAttributeSpecifier )*
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_rule__NoptrDeclarator2772); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.get__NoptrDeclaratorAccess().getLeftSquareBracketKeyword_1_0()); 
                        
                     
                            newCompositeNode(grammarAccess.get__NoptrDeclaratorAccess().getConstantExpressionParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleConstantExpression_in_rule__NoptrDeclarator2794);
                    this_ConstantExpression_2=ruleConstantExpression();

                    state._fsp--;


                    		current.merge(this_ConstantExpression_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,43,FOLLOW_43_in_rule__NoptrDeclarator2812); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.get__NoptrDeclaratorAccess().getRightSquareBracketKeyword_1_2()); 
                        
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:996:1: (this_AttributeSpecifier_4= ruleAttributeSpecifier )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==42) ) {
                            int LA26_2 = input.LA(2);

                            if ( (LA26_2==42) ) {
                                alt26=1;
                            }


                        }
                        else if ( (LA26_0==44) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:997:5: this_AttributeSpecifier_4= ruleAttributeSpecifier
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.get__NoptrDeclaratorAccess().getAttributeSpecifierParserRuleCall_1_3()); 
                    	        
                    	    pushFollow(FOLLOW_ruleAttributeSpecifier_in_rule__NoptrDeclarator2835);
                    	    this_AttributeSpecifier_4=ruleAttributeSpecifier();

                    	    state._fsp--;


                    	    		current.merge(this_AttributeSpecifier_4);
                    	        
                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);


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
    // $ANTLR end "rule__NoptrDeclarator"


    // $ANTLR start "entryRuleParametersAndQualifiers"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1015:1: entryRuleParametersAndQualifiers returns [String current=null] : iv_ruleParametersAndQualifiers= ruleParametersAndQualifiers EOF ;
    public final String entryRuleParametersAndQualifiers() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleParametersAndQualifiers = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1016:2: (iv_ruleParametersAndQualifiers= ruleParametersAndQualifiers EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1017:2: iv_ruleParametersAndQualifiers= ruleParametersAndQualifiers EOF
            {
             newCompositeNode(grammarAccess.getParametersAndQualifiersRule()); 
            pushFollow(FOLLOW_ruleParametersAndQualifiers_in_entryRuleParametersAndQualifiers2884);
            iv_ruleParametersAndQualifiers=ruleParametersAndQualifiers();

            state._fsp--;

             current =iv_ruleParametersAndQualifiers.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParametersAndQualifiers2895); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1024:1: ruleParametersAndQualifiers returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '(' this_ParameterDeclarationClause_1= ruleParameterDeclarationClause kw= ')' (this_AttributeSpecifier_3= ruleAttributeSpecifier )* (kw= 'const' | kw= 'volatile' )* (kw= '&' | kw= '&&' )* (this_ExceptionSpecification_8= ruleExceptionSpecification )? ) ;
    public final AntlrDatatypeRuleToken ruleParametersAndQualifiers() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ParameterDeclarationClause_1 = null;

        AntlrDatatypeRuleToken this_AttributeSpecifier_3 = null;

        AntlrDatatypeRuleToken this_ExceptionSpecification_8 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1027:28: ( (kw= '(' this_ParameterDeclarationClause_1= ruleParameterDeclarationClause kw= ')' (this_AttributeSpecifier_3= ruleAttributeSpecifier )* (kw= 'const' | kw= 'volatile' )* (kw= '&' | kw= '&&' )* (this_ExceptionSpecification_8= ruleExceptionSpecification )? ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1028:1: (kw= '(' this_ParameterDeclarationClause_1= ruleParameterDeclarationClause kw= ')' (this_AttributeSpecifier_3= ruleAttributeSpecifier )* (kw= 'const' | kw= 'volatile' )* (kw= '&' | kw= '&&' )* (this_ExceptionSpecification_8= ruleExceptionSpecification )? )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1028:1: (kw= '(' this_ParameterDeclarationClause_1= ruleParameterDeclarationClause kw= ')' (this_AttributeSpecifier_3= ruleAttributeSpecifier )* (kw= 'const' | kw= 'volatile' )* (kw= '&' | kw= '&&' )* (this_ExceptionSpecification_8= ruleExceptionSpecification )? )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1029:2: kw= '(' this_ParameterDeclarationClause_1= ruleParameterDeclarationClause kw= ')' (this_AttributeSpecifier_3= ruleAttributeSpecifier )* (kw= 'const' | kw= 'volatile' )* (kw= '&' | kw= '&&' )* (this_ExceptionSpecification_8= ruleExceptionSpecification )?
            {
            kw=(Token)match(input,45,FOLLOW_45_in_ruleParametersAndQualifiers2933); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getParametersAndQualifiersAccess().getLeftParenthesisKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getParametersAndQualifiersAccess().getParameterDeclarationClauseParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleParameterDeclarationClause_in_ruleParametersAndQualifiers2955);
            this_ParameterDeclarationClause_1=ruleParameterDeclarationClause();

            state._fsp--;


            		current.merge(this_ParameterDeclarationClause_1);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,47,FOLLOW_47_in_ruleParametersAndQualifiers2973); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getParametersAndQualifiersAccess().getRightParenthesisKeyword_2()); 
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1051:1: (this_AttributeSpecifier_3= ruleAttributeSpecifier )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==42) ) {
                    int LA28_2 = input.LA(2);

                    if ( (LA28_2==42) ) {
                        alt28=1;
                    }


                }
                else if ( (LA28_0==44) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1052:5: this_AttributeSpecifier_3= ruleAttributeSpecifier
            	    {
            	     
            	            newCompositeNode(grammarAccess.getParametersAndQualifiersAccess().getAttributeSpecifierParserRuleCall_3()); 
            	        
            	    pushFollow(FOLLOW_ruleAttributeSpecifier_in_ruleParametersAndQualifiers2996);
            	    this_AttributeSpecifier_3=ruleAttributeSpecifier();

            	    state._fsp--;


            	    		current.merge(this_AttributeSpecifier_3);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1062:3: (kw= 'const' | kw= 'volatile' )*
            loop29:
            do {
                int alt29=3;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==49) ) {
                    alt29=1;
                }
                else if ( (LA29_0==50) ) {
                    alt29=2;
                }


                switch (alt29) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1063:2: kw= 'const'
            	    {
            	    kw=(Token)match(input,49,FOLLOW_49_in_ruleParametersAndQualifiers3017); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getParametersAndQualifiersAccess().getConstKeyword_4_0()); 
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1070:2: kw= 'volatile'
            	    {
            	    kw=(Token)match(input,50,FOLLOW_50_in_ruleParametersAndQualifiers3036); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getParametersAndQualifiersAccess().getVolatileKeyword_4_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1075:3: (kw= '&' | kw= '&&' )*
            loop30:
            do {
                int alt30=3;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==51) ) {
                    alt30=1;
                }
                else if ( (LA30_0==52) ) {
                    alt30=2;
                }


                switch (alt30) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1076:2: kw= '&'
            	    {
            	    kw=(Token)match(input,51,FOLLOW_51_in_ruleParametersAndQualifiers3052); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getParametersAndQualifiersAccess().getAmpersandKeyword_5_0()); 
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1083:2: kw= '&&'
            	    {
            	    kw=(Token)match(input,52,FOLLOW_52_in_ruleParametersAndQualifiers3071); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getParametersAndQualifiersAccess().getAmpersandAmpersandKeyword_5_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1088:3: (this_ExceptionSpecification_8= ruleExceptionSpecification )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=96 && LA31_0<=97)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1089:5: this_ExceptionSpecification_8= ruleExceptionSpecification
                    {
                     
                            newCompositeNode(grammarAccess.getParametersAndQualifiersAccess().getExceptionSpecificationParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleExceptionSpecification_in_ruleParametersAndQualifiers3096);
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


    // $ANTLR start "entryRuleTrailingReturnType"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1107:1: entryRuleTrailingReturnType returns [String current=null] : iv_ruleTrailingReturnType= ruleTrailingReturnType EOF ;
    public final String entryRuleTrailingReturnType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTrailingReturnType = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1108:2: (iv_ruleTrailingReturnType= ruleTrailingReturnType EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1109:2: iv_ruleTrailingReturnType= ruleTrailingReturnType EOF
            {
             newCompositeNode(grammarAccess.getTrailingReturnTypeRule()); 
            pushFollow(FOLLOW_ruleTrailingReturnType_in_entryRuleTrailingReturnType3144);
            iv_ruleTrailingReturnType=ruleTrailingReturnType();

            state._fsp--;

             current =iv_ruleTrailingReturnType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTrailingReturnType3155); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTrailingReturnType"


    // $ANTLR start "ruleTrailingReturnType"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1116:1: ruleTrailingReturnType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' (this_TrailingTypeSpecifier_1= ruleTrailingTypeSpecifier )+ (this_AbstractDeclarator_2= ruleAbstractDeclarator )? ) ;
    public final AntlrDatatypeRuleToken ruleTrailingReturnType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_TrailingTypeSpecifier_1 = null;

        AntlrDatatypeRuleToken this_AbstractDeclarator_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1119:28: ( (kw= '->' (this_TrailingTypeSpecifier_1= ruleTrailingTypeSpecifier )+ (this_AbstractDeclarator_2= ruleAbstractDeclarator )? ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1120:1: (kw= '->' (this_TrailingTypeSpecifier_1= ruleTrailingTypeSpecifier )+ (this_AbstractDeclarator_2= ruleAbstractDeclarator )? )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1120:1: (kw= '->' (this_TrailingTypeSpecifier_1= ruleTrailingTypeSpecifier )+ (this_AbstractDeclarator_2= ruleAbstractDeclarator )? )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1121:2: kw= '->' (this_TrailingTypeSpecifier_1= ruleTrailingTypeSpecifier )+ (this_AbstractDeclarator_2= ruleAbstractDeclarator )?
            {
            kw=(Token)match(input,53,FOLLOW_53_in_ruleTrailingReturnType3193); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getTrailingReturnTypeAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1126:1: (this_TrailingTypeSpecifier_1= ruleTrailingTypeSpecifier )+
            int cnt32=0;
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==113) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1127:5: this_TrailingTypeSpecifier_1= ruleTrailingTypeSpecifier
            	    {
            	     
            	            newCompositeNode(grammarAccess.getTrailingReturnTypeAccess().getTrailingTypeSpecifierParserRuleCall_1()); 
            	        
            	    pushFollow(FOLLOW_ruleTrailingTypeSpecifier_in_ruleTrailingReturnType3216);
            	    this_TrailingTypeSpecifier_1=ruleTrailingTypeSpecifier();

            	    state._fsp--;


            	    		current.merge(this_TrailingTypeSpecifier_1);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt32 >= 1 ) break loop32;
                        EarlyExitException eee =
                            new EarlyExitException(32, input);
                        throw eee;
                }
                cnt32++;
            } while (true);

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1137:3: (this_AbstractDeclarator_2= ruleAbstractDeclarator )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==107) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1138:5: this_AbstractDeclarator_2= ruleAbstractDeclarator
                    {
                     
                            newCompositeNode(grammarAccess.getTrailingReturnTypeAccess().getAbstractDeclaratorParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleAbstractDeclarator_in_ruleTrailingReturnType3246);
                    this_AbstractDeclarator_2=ruleAbstractDeclarator();

                    state._fsp--;


                    		current.merge(this_AbstractDeclarator_2);
                        
                     
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
    // $ANTLR end "ruleTrailingReturnType"


    // $ANTLR start "entryRulePtrOperator"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1156:1: entryRulePtrOperator returns [String current=null] : iv_rulePtrOperator= rulePtrOperator EOF ;
    public final String entryRulePtrOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePtrOperator = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1157:2: (iv_rulePtrOperator= rulePtrOperator EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1158:2: iv_rulePtrOperator= rulePtrOperator EOF
            {
             newCompositeNode(grammarAccess.getPtrOperatorRule()); 
            pushFollow(FOLLOW_rulePtrOperator_in_entryRulePtrOperator3294);
            iv_rulePtrOperator=rulePtrOperator();

            state._fsp--;

             current =iv_rulePtrOperator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePtrOperator3305); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePtrOperator"


    // $ANTLR start "rulePtrOperator"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1165:1: rulePtrOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '*' (this_AttributeSpecifier_1= ruleAttributeSpecifier )* (kw= 'const' | kw= 'volatile' )* ) | (kw= '&' (this_AttributeSpecifier_5= ruleAttributeSpecifier )* ) | (kw= '&&' (this_AttributeSpecifier_7= ruleAttributeSpecifier )* ) | ( (kw= '::' )? this_NestedNameSpecifier_9= ruleNestedNameSpecifier kw= '*' (this_AttributeSpecifier_11= ruleAttributeSpecifier )* (kw= 'const' | kw= 'volatile' )* ) ) ;
    public final AntlrDatatypeRuleToken rulePtrOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_AttributeSpecifier_1 = null;

        AntlrDatatypeRuleToken this_AttributeSpecifier_5 = null;

        AntlrDatatypeRuleToken this_AttributeSpecifier_7 = null;

        AntlrDatatypeRuleToken this_NestedNameSpecifier_9 = null;

        AntlrDatatypeRuleToken this_AttributeSpecifier_11 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1168:28: ( ( (kw= '*' (this_AttributeSpecifier_1= ruleAttributeSpecifier )* (kw= 'const' | kw= 'volatile' )* ) | (kw= '&' (this_AttributeSpecifier_5= ruleAttributeSpecifier )* ) | (kw= '&&' (this_AttributeSpecifier_7= ruleAttributeSpecifier )* ) | ( (kw= '::' )? this_NestedNameSpecifier_9= ruleNestedNameSpecifier kw= '*' (this_AttributeSpecifier_11= ruleAttributeSpecifier )* (kw= 'const' | kw= 'volatile' )* ) ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1169:1: ( (kw= '*' (this_AttributeSpecifier_1= ruleAttributeSpecifier )* (kw= 'const' | kw= 'volatile' )* ) | (kw= '&' (this_AttributeSpecifier_5= ruleAttributeSpecifier )* ) | (kw= '&&' (this_AttributeSpecifier_7= ruleAttributeSpecifier )* ) | ( (kw= '::' )? this_NestedNameSpecifier_9= ruleNestedNameSpecifier kw= '*' (this_AttributeSpecifier_11= ruleAttributeSpecifier )* (kw= 'const' | kw= 'volatile' )* ) )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1169:1: ( (kw= '*' (this_AttributeSpecifier_1= ruleAttributeSpecifier )* (kw= 'const' | kw= 'volatile' )* ) | (kw= '&' (this_AttributeSpecifier_5= ruleAttributeSpecifier )* ) | (kw= '&&' (this_AttributeSpecifier_7= ruleAttributeSpecifier )* ) | ( (kw= '::' )? this_NestedNameSpecifier_9= ruleNestedNameSpecifier kw= '*' (this_AttributeSpecifier_11= ruleAttributeSpecifier )* (kw= 'const' | kw= 'volatile' )* ) )
            int alt41=4;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt41=1;
                }
                break;
            case 51:
                {
                alt41=2;
                }
                break;
            case 52:
                {
                alt41=3;
                }
                break;
            case 41:
            case 103:
                {
                alt41=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1169:2: (kw= '*' (this_AttributeSpecifier_1= ruleAttributeSpecifier )* (kw= 'const' | kw= 'volatile' )* )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1169:2: (kw= '*' (this_AttributeSpecifier_1= ruleAttributeSpecifier )* (kw= 'const' | kw= 'volatile' )* )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1170:2: kw= '*' (this_AttributeSpecifier_1= ruleAttributeSpecifier )* (kw= 'const' | kw= 'volatile' )*
                    {
                    kw=(Token)match(input,54,FOLLOW_54_in_rulePtrOperator3344); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPtrOperatorAccess().getAsteriskKeyword_0_0()); 
                        
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1175:1: (this_AttributeSpecifier_1= ruleAttributeSpecifier )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==42||LA34_0==44) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1176:5: this_AttributeSpecifier_1= ruleAttributeSpecifier
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getPtrOperatorAccess().getAttributeSpecifierParserRuleCall_0_1()); 
                    	        
                    	    pushFollow(FOLLOW_ruleAttributeSpecifier_in_rulePtrOperator3367);
                    	    this_AttributeSpecifier_1=ruleAttributeSpecifier();

                    	    state._fsp--;


                    	    		current.merge(this_AttributeSpecifier_1);
                    	        
                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);

                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1186:3: (kw= 'const' | kw= 'volatile' )*
                    loop35:
                    do {
                        int alt35=3;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==49) ) {
                            alt35=1;
                        }
                        else if ( (LA35_0==50) ) {
                            alt35=2;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1187:2: kw= 'const'
                    	    {
                    	    kw=(Token)match(input,49,FOLLOW_49_in_rulePtrOperator3388); 

                    	            current.merge(kw);
                    	            newLeafNode(kw, grammarAccess.getPtrOperatorAccess().getConstKeyword_0_2_0()); 
                    	        

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1194:2: kw= 'volatile'
                    	    {
                    	    kw=(Token)match(input,50,FOLLOW_50_in_rulePtrOperator3407); 

                    	            current.merge(kw);
                    	            newLeafNode(kw, grammarAccess.getPtrOperatorAccess().getVolatileKeyword_0_2_1()); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1200:6: (kw= '&' (this_AttributeSpecifier_5= ruleAttributeSpecifier )* )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1200:6: (kw= '&' (this_AttributeSpecifier_5= ruleAttributeSpecifier )* )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1201:2: kw= '&' (this_AttributeSpecifier_5= ruleAttributeSpecifier )*
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_rulePtrOperator3430); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPtrOperatorAccess().getAmpersandKeyword_1_0()); 
                        
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1206:1: (this_AttributeSpecifier_5= ruleAttributeSpecifier )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==42||LA36_0==44) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1207:5: this_AttributeSpecifier_5= ruleAttributeSpecifier
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getPtrOperatorAccess().getAttributeSpecifierParserRuleCall_1_1()); 
                    	        
                    	    pushFollow(FOLLOW_ruleAttributeSpecifier_in_rulePtrOperator3453);
                    	    this_AttributeSpecifier_5=ruleAttributeSpecifier();

                    	    state._fsp--;


                    	    		current.merge(this_AttributeSpecifier_5);
                    	        
                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 3 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1218:6: (kw= '&&' (this_AttributeSpecifier_7= ruleAttributeSpecifier )* )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1218:6: (kw= '&&' (this_AttributeSpecifier_7= ruleAttributeSpecifier )* )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1219:2: kw= '&&' (this_AttributeSpecifier_7= ruleAttributeSpecifier )*
                    {
                    kw=(Token)match(input,52,FOLLOW_52_in_rulePtrOperator3481); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPtrOperatorAccess().getAmpersandAmpersandKeyword_2_0()); 
                        
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1224:1: (this_AttributeSpecifier_7= ruleAttributeSpecifier )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==42||LA37_0==44) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1225:5: this_AttributeSpecifier_7= ruleAttributeSpecifier
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getPtrOperatorAccess().getAttributeSpecifierParserRuleCall_2_1()); 
                    	        
                    	    pushFollow(FOLLOW_ruleAttributeSpecifier_in_rulePtrOperator3504);
                    	    this_AttributeSpecifier_7=ruleAttributeSpecifier();

                    	    state._fsp--;


                    	    		current.merge(this_AttributeSpecifier_7);
                    	        
                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 4 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1236:6: ( (kw= '::' )? this_NestedNameSpecifier_9= ruleNestedNameSpecifier kw= '*' (this_AttributeSpecifier_11= ruleAttributeSpecifier )* (kw= 'const' | kw= 'volatile' )* )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1236:6: ( (kw= '::' )? this_NestedNameSpecifier_9= ruleNestedNameSpecifier kw= '*' (this_AttributeSpecifier_11= ruleAttributeSpecifier )* (kw= 'const' | kw= 'volatile' )* )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1236:7: (kw= '::' )? this_NestedNameSpecifier_9= ruleNestedNameSpecifier kw= '*' (this_AttributeSpecifier_11= ruleAttributeSpecifier )* (kw= 'const' | kw= 'volatile' )*
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1236:7: (kw= '::' )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==41) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1237:2: kw= '::'
                            {
                            kw=(Token)match(input,41,FOLLOW_41_in_rulePtrOperator3533); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getPtrOperatorAccess().getColonColonKeyword_3_0()); 
                                

                            }
                            break;

                    }

                     
                            newCompositeNode(grammarAccess.getPtrOperatorAccess().getNestedNameSpecifierParserRuleCall_3_1()); 
                        
                    pushFollow(FOLLOW_ruleNestedNameSpecifier_in_rulePtrOperator3557);
                    this_NestedNameSpecifier_9=ruleNestedNameSpecifier();

                    state._fsp--;


                    		current.merge(this_NestedNameSpecifier_9);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,54,FOLLOW_54_in_rulePtrOperator3575); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPtrOperatorAccess().getAsteriskKeyword_3_2()); 
                        
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1259:1: (this_AttributeSpecifier_11= ruleAttributeSpecifier )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==42||LA39_0==44) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1260:5: this_AttributeSpecifier_11= ruleAttributeSpecifier
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getPtrOperatorAccess().getAttributeSpecifierParserRuleCall_3_3()); 
                    	        
                    	    pushFollow(FOLLOW_ruleAttributeSpecifier_in_rulePtrOperator3598);
                    	    this_AttributeSpecifier_11=ruleAttributeSpecifier();

                    	    state._fsp--;


                    	    		current.merge(this_AttributeSpecifier_11);
                    	        
                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);

                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1270:3: (kw= 'const' | kw= 'volatile' )*
                    loop40:
                    do {
                        int alt40=3;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==49) ) {
                            alt40=1;
                        }
                        else if ( (LA40_0==50) ) {
                            alt40=2;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1271:2: kw= 'const'
                    	    {
                    	    kw=(Token)match(input,49,FOLLOW_49_in_rulePtrOperator3619); 

                    	            current.merge(kw);
                    	            newLeafNode(kw, grammarAccess.getPtrOperatorAccess().getConstKeyword_3_4_0()); 
                    	        

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1278:2: kw= 'volatile'
                    	    {
                    	    kw=(Token)match(input,50,FOLLOW_50_in_rulePtrOperator3638); 

                    	            current.merge(kw);
                    	            newLeafNode(kw, grammarAccess.getPtrOperatorAccess().getVolatileKeyword_3_4_1()); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);


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
    // $ANTLR end "rulePtrOperator"


    // $ANTLR start "entryRuleDeclaratorId"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1291:1: entryRuleDeclaratorId returns [String current=null] : iv_ruleDeclaratorId= ruleDeclaratorId EOF ;
    public final String entryRuleDeclaratorId() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDeclaratorId = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1292:2: (iv_ruleDeclaratorId= ruleDeclaratorId EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1293:2: iv_ruleDeclaratorId= ruleDeclaratorId EOF
            {
             newCompositeNode(grammarAccess.getDeclaratorIdRule()); 
            pushFollow(FOLLOW_ruleDeclaratorId_in_entryRuleDeclaratorId3682);
            iv_ruleDeclaratorId=ruleDeclaratorId();

            state._fsp--;

             current =iv_ruleDeclaratorId.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaratorId3693); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1300:1: ruleDeclaratorId returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= '...' )? this_IdExpression_1= ruleIdExpression ) | ( (kw= '::' )? (this_NestedNameSpecifier_3= ruleNestedNameSpecifier )? this_ClassName_4= ruleClassName ) ) ;
    public final AntlrDatatypeRuleToken ruleDeclaratorId() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_IdExpression_1 = null;

        AntlrDatatypeRuleToken this_NestedNameSpecifier_3 = null;

        AntlrDatatypeRuleToken this_ClassName_4 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1303:28: ( ( ( (kw= '...' )? this_IdExpression_1= ruleIdExpression ) | ( (kw= '::' )? (this_NestedNameSpecifier_3= ruleNestedNameSpecifier )? this_ClassName_4= ruleClassName ) ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1304:1: ( ( (kw= '...' )? this_IdExpression_1= ruleIdExpression ) | ( (kw= '::' )? (this_NestedNameSpecifier_3= ruleNestedNameSpecifier )? this_ClassName_4= ruleClassName ) )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1304:1: ( ( (kw= '...' )? this_IdExpression_1= ruleIdExpression ) | ( (kw= '::' )? (this_NestedNameSpecifier_3= ruleNestedNameSpecifier )? this_ClassName_4= ruleClassName ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==46||LA45_0==100) ) {
                alt45=1;
            }
            else if ( (LA45_0==41||LA45_0==103||LA45_0==114) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1304:2: ( (kw= '...' )? this_IdExpression_1= ruleIdExpression )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1304:2: ( (kw= '...' )? this_IdExpression_1= ruleIdExpression )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1304:3: (kw= '...' )? this_IdExpression_1= ruleIdExpression
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1304:3: (kw= '...' )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==46) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1305:2: kw= '...'
                            {
                            kw=(Token)match(input,46,FOLLOW_46_in_ruleDeclaratorId3733); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getDeclaratorIdAccess().getFullStopFullStopFullStopKeyword_0_0()); 
                                

                            }
                            break;

                    }

                     
                            newCompositeNode(grammarAccess.getDeclaratorIdAccess().getIdExpressionParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleIdExpression_in_ruleDeclaratorId3757);
                    this_IdExpression_1=ruleIdExpression();

                    state._fsp--;


                    		current.merge(this_IdExpression_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1322:6: ( (kw= '::' )? (this_NestedNameSpecifier_3= ruleNestedNameSpecifier )? this_ClassName_4= ruleClassName )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1322:6: ( (kw= '::' )? (this_NestedNameSpecifier_3= ruleNestedNameSpecifier )? this_ClassName_4= ruleClassName )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1322:7: (kw= '::' )? (this_NestedNameSpecifier_3= ruleNestedNameSpecifier )? this_ClassName_4= ruleClassName
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1322:7: (kw= '::' )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==41) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1323:2: kw= '::'
                            {
                            kw=(Token)match(input,41,FOLLOW_41_in_ruleDeclaratorId3784); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getDeclaratorIdAccess().getColonColonKeyword_1_0()); 
                                

                            }
                            break;

                    }

                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1328:3: (this_NestedNameSpecifier_3= ruleNestedNameSpecifier )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==103) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1329:5: this_NestedNameSpecifier_3= ruleNestedNameSpecifier
                            {
                             
                                    newCompositeNode(grammarAccess.getDeclaratorIdAccess().getNestedNameSpecifierParserRuleCall_1_1()); 
                                
                            pushFollow(FOLLOW_ruleNestedNameSpecifier_in_ruleDeclaratorId3809);
                            this_NestedNameSpecifier_3=ruleNestedNameSpecifier();

                            state._fsp--;


                            		current.merge(this_NestedNameSpecifier_3);
                                
                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                     
                            newCompositeNode(grammarAccess.getDeclaratorIdAccess().getClassNameParserRuleCall_1_2()); 
                        
                    pushFollow(FOLLOW_ruleClassName_in_ruleDeclaratorId3838);
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


    // $ANTLR start "entryRuleOperatorFunctionId"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1358:1: entryRuleOperatorFunctionId returns [String current=null] : iv_ruleOperatorFunctionId= ruleOperatorFunctionId EOF ;
    public final String entryRuleOperatorFunctionId() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperatorFunctionId = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1359:2: (iv_ruleOperatorFunctionId= ruleOperatorFunctionId EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1360:2: iv_ruleOperatorFunctionId= ruleOperatorFunctionId EOF
            {
             newCompositeNode(grammarAccess.getOperatorFunctionIdRule()); 
            pushFollow(FOLLOW_ruleOperatorFunctionId_in_entryRuleOperatorFunctionId3885);
            iv_ruleOperatorFunctionId=ruleOperatorFunctionId();

            state._fsp--;

             current =iv_ruleOperatorFunctionId.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperatorFunctionId3896); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1367:1: ruleOperatorFunctionId returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'operator' this_OverloadableOperator_1= ruleOverloadableOperator (kw= '<' (this_TemplateArgument_3= ruleTemplateArgument )* kw= '>' )? ) ;
    public final AntlrDatatypeRuleToken ruleOperatorFunctionId() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_OverloadableOperator_1 = null;

        AntlrDatatypeRuleToken this_TemplateArgument_3 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1370:28: ( (kw= 'operator' this_OverloadableOperator_1= ruleOverloadableOperator (kw= '<' (this_TemplateArgument_3= ruleTemplateArgument )* kw= '>' )? ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1371:1: (kw= 'operator' this_OverloadableOperator_1= ruleOverloadableOperator (kw= '<' (this_TemplateArgument_3= ruleTemplateArgument )* kw= '>' )? )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1371:1: (kw= 'operator' this_OverloadableOperator_1= ruleOverloadableOperator (kw= '<' (this_TemplateArgument_3= ruleTemplateArgument )* kw= '>' )? )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1372:2: kw= 'operator' this_OverloadableOperator_1= ruleOverloadableOperator (kw= '<' (this_TemplateArgument_3= ruleTemplateArgument )* kw= '>' )?
            {
            kw=(Token)match(input,55,FOLLOW_55_in_ruleOperatorFunctionId3934); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getOperatorFunctionIdAccess().getOperatorKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getOperatorFunctionIdAccess().getOverloadableOperatorParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleOverloadableOperator_in_ruleOperatorFunctionId3956);
            this_OverloadableOperator_1=ruleOverloadableOperator();

            state._fsp--;


            		current.merge(this_OverloadableOperator_1);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1388:1: (kw= '<' (this_TemplateArgument_3= ruleTemplateArgument )* kw= '>' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==56) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1389:2: kw= '<' (this_TemplateArgument_3= ruleTemplateArgument )* kw= '>'
                    {
                    kw=(Token)match(input,56,FOLLOW_56_in_ruleOperatorFunctionId3975); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOperatorFunctionIdAccess().getLessThanSignKeyword_2_0()); 
                        
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1394:1: (this_TemplateArgument_3= ruleTemplateArgument )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( ((LA46_0>=98 && LA46_0<=100)) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1395:5: this_TemplateArgument_3= ruleTemplateArgument
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getOperatorFunctionIdAccess().getTemplateArgumentParserRuleCall_2_1()); 
                    	        
                    	    pushFollow(FOLLOW_ruleTemplateArgument_in_ruleOperatorFunctionId3998);
                    	    this_TemplateArgument_3=ruleTemplateArgument();

                    	    state._fsp--;


                    	    		current.merge(this_TemplateArgument_3);
                    	        
                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);

                    kw=(Token)match(input,57,FOLLOW_57_in_ruleOperatorFunctionId4018); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1419:1: entryRuleOverloadableOperator returns [String current=null] : iv_ruleOverloadableOperator= ruleOverloadableOperator EOF ;
    public final String entryRuleOverloadableOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOverloadableOperator = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1420:2: (iv_ruleOverloadableOperator= ruleOverloadableOperator EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1421:2: iv_ruleOverloadableOperator= ruleOverloadableOperator EOF
            {
             newCompositeNode(grammarAccess.getOverloadableOperatorRule()); 
            pushFollow(FOLLOW_ruleOverloadableOperator_in_entryRuleOverloadableOperator4061);
            iv_ruleOverloadableOperator=ruleOverloadableOperator();

            state._fsp--;

             current =iv_ruleOverloadableOperator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOverloadableOperator4072); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1428:1: ruleOverloadableOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'new' | kw= 'delete' | (kw= 'new' kw= '[' kw= ']' ) | (kw= 'delete' kw= '[' kw= ']' ) | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= '^' | kw= '&' | kw= '|' | kw= '~' | kw= '!' | kw= '=' | kw= '<' | kw= '>' | kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' | kw= '^=' | kw= '&=' | kw= '|=' | kw= '<<' | kw= '>>' | kw= '>>=' | kw= '<<=' | kw= '==' | kw= '!=' | kw= '<=' | kw= '>=' | kw= '&&' | kw= '||' | kw= '++' | kw= '--' | kw= ',' | kw= '->*' | kw= '->' | kw= '()' | kw= '[]' ) ;
    public final AntlrDatatypeRuleToken ruleOverloadableOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1431:28: ( (kw= 'new' | kw= 'delete' | (kw= 'new' kw= '[' kw= ']' ) | (kw= 'delete' kw= '[' kw= ']' ) | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= '^' | kw= '&' | kw= '|' | kw= '~' | kw= '!' | kw= '=' | kw= '<' | kw= '>' | kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' | kw= '^=' | kw= '&=' | kw= '|=' | kw= '<<' | kw= '>>' | kw= '>>=' | kw= '<<=' | kw= '==' | kw= '!=' | kw= '<=' | kw= '>=' | kw= '&&' | kw= '||' | kw= '++' | kw= '--' | kw= ',' | kw= '->*' | kw= '->' | kw= '()' | kw= '[]' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1432:1: (kw= 'new' | kw= 'delete' | (kw= 'new' kw= '[' kw= ']' ) | (kw= 'delete' kw= '[' kw= ']' ) | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= '^' | kw= '&' | kw= '|' | kw= '~' | kw= '!' | kw= '=' | kw= '<' | kw= '>' | kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' | kw= '^=' | kw= '&=' | kw= '|=' | kw= '<<' | kw= '>>' | kw= '>>=' | kw= '<<=' | kw= '==' | kw= '!=' | kw= '<=' | kw= '>=' | kw= '&&' | kw= '||' | kw= '++' | kw= '--' | kw= ',' | kw= '->*' | kw= '->' | kw= '()' | kw= '[]' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1432:1: (kw= 'new' | kw= 'delete' | (kw= 'new' kw= '[' kw= ']' ) | (kw= 'delete' kw= '[' kw= ']' ) | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= '^' | kw= '&' | kw= '|' | kw= '~' | kw= '!' | kw= '=' | kw= '<' | kw= '>' | kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' | kw= '^=' | kw= '&=' | kw= '|=' | kw= '<<' | kw= '>>' | kw= '>>=' | kw= '<<=' | kw= '==' | kw= '!=' | kw= '<=' | kw= '>=' | kw= '&&' | kw= '||' | kw= '++' | kw= '--' | kw= ',' | kw= '->*' | kw= '->' | kw= '()' | kw= '[]' )
            int alt48=42;
            alt48 = dfa48.predict(input);
            switch (alt48) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1433:2: kw= 'new'
                    {
                    kw=(Token)match(input,58,FOLLOW_58_in_ruleOverloadableOperator4110); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getNewKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1440:2: kw= 'delete'
                    {
                    kw=(Token)match(input,59,FOLLOW_59_in_ruleOverloadableOperator4129); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getDeleteKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1446:6: (kw= 'new' kw= '[' kw= ']' )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1446:6: (kw= 'new' kw= '[' kw= ']' )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1447:2: kw= 'new' kw= '[' kw= ']'
                    {
                    kw=(Token)match(input,58,FOLLOW_58_in_ruleOverloadableOperator4149); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getNewKeyword_2_0()); 
                        
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleOverloadableOperator4162); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getLeftSquareBracketKeyword_2_1()); 
                        
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleOverloadableOperator4175); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getRightSquareBracketKeyword_2_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1465:6: (kw= 'delete' kw= '[' kw= ']' )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1465:6: (kw= 'delete' kw= '[' kw= ']' )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1466:2: kw= 'delete' kw= '[' kw= ']'
                    {
                    kw=(Token)match(input,59,FOLLOW_59_in_ruleOverloadableOperator4196); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getDeleteKeyword_3_0()); 
                        
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleOverloadableOperator4209); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getLeftSquareBracketKeyword_3_1()); 
                        
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleOverloadableOperator4222); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getRightSquareBracketKeyword_3_2()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1485:2: kw= '+'
                    {
                    kw=(Token)match(input,60,FOLLOW_60_in_ruleOverloadableOperator4242); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getPlusSignKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1492:2: kw= '-'
                    {
                    kw=(Token)match(input,61,FOLLOW_61_in_ruleOverloadableOperator4261); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getHyphenMinusKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1499:2: kw= '*'
                    {
                    kw=(Token)match(input,54,FOLLOW_54_in_ruleOverloadableOperator4280); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getAsteriskKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1506:2: kw= '/'
                    {
                    kw=(Token)match(input,62,FOLLOW_62_in_ruleOverloadableOperator4299); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getSolidusKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1513:2: kw= '%'
                    {
                    kw=(Token)match(input,63,FOLLOW_63_in_ruleOverloadableOperator4318); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getPercentSignKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1520:2: kw= '^'
                    {
                    kw=(Token)match(input,64,FOLLOW_64_in_ruleOverloadableOperator4337); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getCircumflexAccentKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1527:2: kw= '&'
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_ruleOverloadableOperator4356); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getAmpersandKeyword_10()); 
                        

                    }
                    break;
                case 12 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1534:2: kw= '|'
                    {
                    kw=(Token)match(input,65,FOLLOW_65_in_ruleOverloadableOperator4375); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getVerticalLineKeyword_11()); 
                        

                    }
                    break;
                case 13 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1541:2: kw= '~'
                    {
                    kw=(Token)match(input,66,FOLLOW_66_in_ruleOverloadableOperator4394); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getTildeKeyword_12()); 
                        

                    }
                    break;
                case 14 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1548:2: kw= '!'
                    {
                    kw=(Token)match(input,67,FOLLOW_67_in_ruleOverloadableOperator4413); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getExclamationMarkKeyword_13()); 
                        

                    }
                    break;
                case 15 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1555:2: kw= '='
                    {
                    kw=(Token)match(input,68,FOLLOW_68_in_ruleOverloadableOperator4432); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getEqualsSignKeyword_14()); 
                        

                    }
                    break;
                case 16 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1562:2: kw= '<'
                    {
                    kw=(Token)match(input,56,FOLLOW_56_in_ruleOverloadableOperator4451); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getLessThanSignKeyword_15()); 
                        

                    }
                    break;
                case 17 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1569:2: kw= '>'
                    {
                    kw=(Token)match(input,57,FOLLOW_57_in_ruleOverloadableOperator4470); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getGreaterThanSignKeyword_16()); 
                        

                    }
                    break;
                case 18 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1576:2: kw= '+='
                    {
                    kw=(Token)match(input,69,FOLLOW_69_in_ruleOverloadableOperator4489); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getPlusSignEqualsSignKeyword_17()); 
                        

                    }
                    break;
                case 19 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1583:2: kw= '-='
                    {
                    kw=(Token)match(input,70,FOLLOW_70_in_ruleOverloadableOperator4508); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getHyphenMinusEqualsSignKeyword_18()); 
                        

                    }
                    break;
                case 20 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1590:2: kw= '*='
                    {
                    kw=(Token)match(input,71,FOLLOW_71_in_ruleOverloadableOperator4527); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getAsteriskEqualsSignKeyword_19()); 
                        

                    }
                    break;
                case 21 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1597:2: kw= '/='
                    {
                    kw=(Token)match(input,72,FOLLOW_72_in_ruleOverloadableOperator4546); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getSolidusEqualsSignKeyword_20()); 
                        

                    }
                    break;
                case 22 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1604:2: kw= '%='
                    {
                    kw=(Token)match(input,73,FOLLOW_73_in_ruleOverloadableOperator4565); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getPercentSignEqualsSignKeyword_21()); 
                        

                    }
                    break;
                case 23 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1611:2: kw= '^='
                    {
                    kw=(Token)match(input,74,FOLLOW_74_in_ruleOverloadableOperator4584); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getCircumflexAccentEqualsSignKeyword_22()); 
                        

                    }
                    break;
                case 24 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1618:2: kw= '&='
                    {
                    kw=(Token)match(input,75,FOLLOW_75_in_ruleOverloadableOperator4603); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getAmpersandEqualsSignKeyword_23()); 
                        

                    }
                    break;
                case 25 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1625:2: kw= '|='
                    {
                    kw=(Token)match(input,76,FOLLOW_76_in_ruleOverloadableOperator4622); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getVerticalLineEqualsSignKeyword_24()); 
                        

                    }
                    break;
                case 26 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1632:2: kw= '<<'
                    {
                    kw=(Token)match(input,77,FOLLOW_77_in_ruleOverloadableOperator4641); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getLessThanSignLessThanSignKeyword_25()); 
                        

                    }
                    break;
                case 27 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1639:2: kw= '>>'
                    {
                    kw=(Token)match(input,78,FOLLOW_78_in_ruleOverloadableOperator4660); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getGreaterThanSignGreaterThanSignKeyword_26()); 
                        

                    }
                    break;
                case 28 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1646:2: kw= '>>='
                    {
                    kw=(Token)match(input,79,FOLLOW_79_in_ruleOverloadableOperator4679); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getGreaterThanSignGreaterThanSignEqualsSignKeyword_27()); 
                        

                    }
                    break;
                case 29 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1653:2: kw= '<<='
                    {
                    kw=(Token)match(input,80,FOLLOW_80_in_ruleOverloadableOperator4698); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getLessThanSignLessThanSignEqualsSignKeyword_28()); 
                        

                    }
                    break;
                case 30 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1660:2: kw= '=='
                    {
                    kw=(Token)match(input,81,FOLLOW_81_in_ruleOverloadableOperator4717); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getEqualsSignEqualsSignKeyword_29()); 
                        

                    }
                    break;
                case 31 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1667:2: kw= '!='
                    {
                    kw=(Token)match(input,82,FOLLOW_82_in_ruleOverloadableOperator4736); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getExclamationMarkEqualsSignKeyword_30()); 
                        

                    }
                    break;
                case 32 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1674:2: kw= '<='
                    {
                    kw=(Token)match(input,83,FOLLOW_83_in_ruleOverloadableOperator4755); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getLessThanSignEqualsSignKeyword_31()); 
                        

                    }
                    break;
                case 33 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1681:2: kw= '>='
                    {
                    kw=(Token)match(input,84,FOLLOW_84_in_ruleOverloadableOperator4774); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getGreaterThanSignEqualsSignKeyword_32()); 
                        

                    }
                    break;
                case 34 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1688:2: kw= '&&'
                    {
                    kw=(Token)match(input,52,FOLLOW_52_in_ruleOverloadableOperator4793); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getAmpersandAmpersandKeyword_33()); 
                        

                    }
                    break;
                case 35 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1695:2: kw= '||'
                    {
                    kw=(Token)match(input,85,FOLLOW_85_in_ruleOverloadableOperator4812); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getVerticalLineVerticalLineKeyword_34()); 
                        

                    }
                    break;
                case 36 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1702:2: kw= '++'
                    {
                    kw=(Token)match(input,86,FOLLOW_86_in_ruleOverloadableOperator4831); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getPlusSignPlusSignKeyword_35()); 
                        

                    }
                    break;
                case 37 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1709:2: kw= '--'
                    {
                    kw=(Token)match(input,87,FOLLOW_87_in_ruleOverloadableOperator4850); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getHyphenMinusHyphenMinusKeyword_36()); 
                        

                    }
                    break;
                case 38 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1716:2: kw= ','
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleOverloadableOperator4869); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getCommaKeyword_37()); 
                        

                    }
                    break;
                case 39 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1723:2: kw= '->*'
                    {
                    kw=(Token)match(input,88,FOLLOW_88_in_ruleOverloadableOperator4888); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getHyphenMinusGreaterThanSignAsteriskKeyword_38()); 
                        

                    }
                    break;
                case 40 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1730:2: kw= '->'
                    {
                    kw=(Token)match(input,53,FOLLOW_53_in_ruleOverloadableOperator4907); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getHyphenMinusGreaterThanSignKeyword_39()); 
                        

                    }
                    break;
                case 41 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1737:2: kw= '()'
                    {
                    kw=(Token)match(input,89,FOLLOW_89_in_ruleOverloadableOperator4926); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOverloadableOperatorAccess().getLeftParenthesisRightParenthesisKeyword_40()); 
                        

                    }
                    break;
                case 42 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1744:2: kw= '[]'
                    {
                    kw=(Token)match(input,90,FOLLOW_90_in_ruleOverloadableOperator4945); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1757:1: entryRuleLiteralOperatorId returns [String current=null] : iv_ruleLiteralOperatorId= ruleLiteralOperatorId EOF ;
    public final String entryRuleLiteralOperatorId() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteralOperatorId = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1758:2: (iv_ruleLiteralOperatorId= ruleLiteralOperatorId EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1759:2: iv_ruleLiteralOperatorId= ruleLiteralOperatorId EOF
            {
             newCompositeNode(grammarAccess.getLiteralOperatorIdRule()); 
            pushFollow(FOLLOW_ruleLiteralOperatorId_in_entryRuleLiteralOperatorId4986);
            iv_ruleLiteralOperatorId=ruleLiteralOperatorId();

            state._fsp--;

             current =iv_ruleLiteralOperatorId.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralOperatorId4997); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1766:1: ruleLiteralOperatorId returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'operator' kw= '\"' kw= '\"' ) ;
    public final AntlrDatatypeRuleToken ruleLiteralOperatorId() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1769:28: ( (kw= 'operator' kw= '\"' kw= '\"' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1770:1: (kw= 'operator' kw= '\"' kw= '\"' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1770:1: (kw= 'operator' kw= '\"' kw= '\"' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1771:2: kw= 'operator' kw= '\"' kw= '\"'
            {
            kw=(Token)match(input,55,FOLLOW_55_in_ruleLiteralOperatorId5035); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getLiteralOperatorIdAccess().getOperatorKeyword_0()); 
                
            kw=(Token)match(input,91,FOLLOW_91_in_ruleLiteralOperatorId5048); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getLiteralOperatorIdAccess().getQuotationMarkKeyword_1()); 
                
            kw=(Token)match(input,91,FOLLOW_91_in_ruleLiteralOperatorId5061); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1798:1: entryRuleTemplateParameterList returns [String current=null] : iv_ruleTemplateParameterList= ruleTemplateParameterList EOF ;
    public final String entryRuleTemplateParameterList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTemplateParameterList = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1799:2: (iv_ruleTemplateParameterList= ruleTemplateParameterList EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1800:2: iv_ruleTemplateParameterList= ruleTemplateParameterList EOF
            {
             newCompositeNode(grammarAccess.getTemplateParameterListRule()); 
            pushFollow(FOLLOW_ruleTemplateParameterList_in_entryRuleTemplateParameterList5104);
            iv_ruleTemplateParameterList=ruleTemplateParameterList();

            state._fsp--;

             current =iv_ruleTemplateParameterList.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateParameterList5115); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1807:1: ruleTemplateParameterList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TemplateParameter_0= ruleTemplateParameter (kw= ',' this_TemplateParameter_2= ruleTemplateParameter )* ) ;
    public final AntlrDatatypeRuleToken ruleTemplateParameterList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_TemplateParameter_0 = null;

        AntlrDatatypeRuleToken this_TemplateParameter_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1810:28: ( (this_TemplateParameter_0= ruleTemplateParameter (kw= ',' this_TemplateParameter_2= ruleTemplateParameter )* ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1811:1: (this_TemplateParameter_0= ruleTemplateParameter (kw= ',' this_TemplateParameter_2= ruleTemplateParameter )* )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1811:1: (this_TemplateParameter_0= ruleTemplateParameter (kw= ',' this_TemplateParameter_2= ruleTemplateParameter )* )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1812:5: this_TemplateParameter_0= ruleTemplateParameter (kw= ',' this_TemplateParameter_2= ruleTemplateParameter )*
            {
             
                    newCompositeNode(grammarAccess.getTemplateParameterListAccess().getTemplateParameterParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleTemplateParameter_in_ruleTemplateParameterList5162);
            this_TemplateParameter_0=ruleTemplateParameter();

            state._fsp--;


            		current.merge(this_TemplateParameter_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1822:1: (kw= ',' this_TemplateParameter_2= ruleTemplateParameter )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==48) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1823:2: kw= ',' this_TemplateParameter_2= ruleTemplateParameter
            	    {
            	    kw=(Token)match(input,48,FOLLOW_48_in_ruleTemplateParameterList5181); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getTemplateParameterListAccess().getCommaKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getTemplateParameterListAccess().getTemplateParameterParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_ruleTemplateParameter_in_ruleTemplateParameterList5203);
            	    this_TemplateParameter_2=ruleTemplateParameter();

            	    state._fsp--;


            	    		current.merge(this_TemplateParameter_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop49;
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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1847:1: entryRuleTemplateParameter returns [String current=null] : iv_ruleTemplateParameter= ruleTemplateParameter EOF ;
    public final String entryRuleTemplateParameter() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTemplateParameter = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1848:2: (iv_ruleTemplateParameter= ruleTemplateParameter EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1849:2: iv_ruleTemplateParameter= ruleTemplateParameter EOF
            {
             newCompositeNode(grammarAccess.getTemplateParameterRule()); 
            pushFollow(FOLLOW_ruleTemplateParameter_in_entryRuleTemplateParameter5251);
            iv_ruleTemplateParameter=ruleTemplateParameter();

            state._fsp--;

             current =iv_ruleTemplateParameter.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateParameter5262); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1856:1: ruleTemplateParameter returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TypeParameter_0= ruleTypeParameter | this_ParameterDeclaration_1= ruleParameterDeclaration ) ;
    public final AntlrDatatypeRuleToken ruleTemplateParameter() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_TypeParameter_0 = null;

        AntlrDatatypeRuleToken this_ParameterDeclaration_1 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1859:28: ( (this_TypeParameter_0= ruleTypeParameter | this_ParameterDeclaration_1= ruleParameterDeclaration ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1860:1: (this_TypeParameter_0= ruleTypeParameter | this_ParameterDeclaration_1= ruleParameterDeclaration )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1860:1: (this_TypeParameter_0= ruleTypeParameter | this_ParameterDeclaration_1= ruleParameterDeclaration )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=92 && LA50_0<=94)) ) {
                alt50=1;
            }
            else if ( (LA50_0==101) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1861:5: this_TypeParameter_0= ruleTypeParameter
                    {
                     
                            newCompositeNode(grammarAccess.getTemplateParameterAccess().getTypeParameterParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleTypeParameter_in_ruleTemplateParameter5309);
                    this_TypeParameter_0=ruleTypeParameter();

                    state._fsp--;


                    		current.merge(this_TypeParameter_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1873:5: this_ParameterDeclaration_1= ruleParameterDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getTemplateParameterAccess().getParameterDeclarationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleParameterDeclaration_in_ruleTemplateParameter5342);
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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1891:1: entryRuleTypeParameter returns [String current=null] : iv_ruleTypeParameter= ruleTypeParameter EOF ;
    public final String entryRuleTypeParameter() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeParameter = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1892:2: (iv_ruleTypeParameter= ruleTypeParameter EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1893:2: iv_ruleTypeParameter= ruleTypeParameter EOF
            {
             newCompositeNode(grammarAccess.getTypeParameterRule()); 
            pushFollow(FOLLOW_ruleTypeParameter_in_entryRuleTypeParameter5388);
            iv_ruleTypeParameter=ruleTypeParameter();

            state._fsp--;

             current =iv_ruleTypeParameter.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeParameter5399); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1900:1: ruleTypeParameter returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'class' ( ( (kw= '...' )? (this_ID_2= RULE_ID )? ) | ( (this_ID_3= RULE_ID )? kw= '=' this_TypeId_5= ruleTypeId ) ) ) | (kw= 'typename' ( ( (kw= '...' )? (this_ID_8= RULE_ID )? ) | ( (this_ID_9= RULE_ID )? kw= '=' this_TypeId_11= ruleTypeId ) ) ) | (kw= 'template' kw= '<' this_TemplateParameterList_14= ruleTemplateParameterList kw= '>' kw= 'class' ( ( (kw= '...' )? (this_ID_18= RULE_ID )? ) | ( (this_ID_19= RULE_ID )? kw= '=' this_IdExpression_21= ruleIdExpression ) ) ) ) ;
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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1903:28: ( ( (kw= 'class' ( ( (kw= '...' )? (this_ID_2= RULE_ID )? ) | ( (this_ID_3= RULE_ID )? kw= '=' this_TypeId_5= ruleTypeId ) ) ) | (kw= 'typename' ( ( (kw= '...' )? (this_ID_8= RULE_ID )? ) | ( (this_ID_9= RULE_ID )? kw= '=' this_TypeId_11= ruleTypeId ) ) ) | (kw= 'template' kw= '<' this_TemplateParameterList_14= ruleTemplateParameterList kw= '>' kw= 'class' ( ( (kw= '...' )? (this_ID_18= RULE_ID )? ) | ( (this_ID_19= RULE_ID )? kw= '=' this_IdExpression_21= ruleIdExpression ) ) ) ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1904:1: ( (kw= 'class' ( ( (kw= '...' )? (this_ID_2= RULE_ID )? ) | ( (this_ID_3= RULE_ID )? kw= '=' this_TypeId_5= ruleTypeId ) ) ) | (kw= 'typename' ( ( (kw= '...' )? (this_ID_8= RULE_ID )? ) | ( (this_ID_9= RULE_ID )? kw= '=' this_TypeId_11= ruleTypeId ) ) ) | (kw= 'template' kw= '<' this_TemplateParameterList_14= ruleTemplateParameterList kw= '>' kw= 'class' ( ( (kw= '...' )? (this_ID_18= RULE_ID )? ) | ( (this_ID_19= RULE_ID )? kw= '=' this_IdExpression_21= ruleIdExpression ) ) ) )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1904:1: ( (kw= 'class' ( ( (kw= '...' )? (this_ID_2= RULE_ID )? ) | ( (this_ID_3= RULE_ID )? kw= '=' this_TypeId_5= ruleTypeId ) ) ) | (kw= 'typename' ( ( (kw= '...' )? (this_ID_8= RULE_ID )? ) | ( (this_ID_9= RULE_ID )? kw= '=' this_TypeId_11= ruleTypeId ) ) ) | (kw= 'template' kw= '<' this_TemplateParameterList_14= ruleTemplateParameterList kw= '>' kw= 'class' ( ( (kw= '...' )? (this_ID_18= RULE_ID )? ) | ( (this_ID_19= RULE_ID )? kw= '=' this_IdExpression_21= ruleIdExpression ) ) ) )
            int alt63=3;
            switch ( input.LA(1) ) {
            case 92:
                {
                alt63=1;
                }
                break;
            case 93:
                {
                alt63=2;
                }
                break;
            case 94:
                {
                alt63=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }

            switch (alt63) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1904:2: (kw= 'class' ( ( (kw= '...' )? (this_ID_2= RULE_ID )? ) | ( (this_ID_3= RULE_ID )? kw= '=' this_TypeId_5= ruleTypeId ) ) )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1904:2: (kw= 'class' ( ( (kw= '...' )? (this_ID_2= RULE_ID )? ) | ( (this_ID_3= RULE_ID )? kw= '=' this_TypeId_5= ruleTypeId ) ) )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1905:2: kw= 'class' ( ( (kw= '...' )? (this_ID_2= RULE_ID )? ) | ( (this_ID_3= RULE_ID )? kw= '=' this_TypeId_5= ruleTypeId ) )
                    {
                    kw=(Token)match(input,92,FOLLOW_92_in_ruleTypeParameter5438); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeParameterAccess().getClassKeyword_0_0()); 
                        
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1910:1: ( ( (kw= '...' )? (this_ID_2= RULE_ID )? ) | ( (this_ID_3= RULE_ID )? kw= '=' this_TypeId_5= ruleTypeId ) )
                    int alt54=2;
                    switch ( input.LA(1) ) {
                    case EOF:
                    case 46:
                    case 48:
                    case 57:
                        {
                        alt54=1;
                        }
                        break;
                    case RULE_ID:
                        {
                        int LA54_2 = input.LA(2);

                        if ( (LA54_2==68) ) {
                            alt54=2;
                        }
                        else if ( (LA54_2==EOF||LA54_2==48||LA54_2==57) ) {
                            alt54=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 54, 2, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 68:
                        {
                        alt54=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 54, 0, input);

                        throw nvae;
                    }

                    switch (alt54) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1910:2: ( (kw= '...' )? (this_ID_2= RULE_ID )? )
                            {
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1910:2: ( (kw= '...' )? (this_ID_2= RULE_ID )? )
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1910:3: (kw= '...' )? (this_ID_2= RULE_ID )?
                            {
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1910:3: (kw= '...' )?
                            int alt51=2;
                            int LA51_0 = input.LA(1);

                            if ( (LA51_0==46) ) {
                                alt51=1;
                            }
                            switch (alt51) {
                                case 1 :
                                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1911:2: kw= '...'
                                    {
                                    kw=(Token)match(input,46,FOLLOW_46_in_ruleTypeParameter5454); 

                                            current.merge(kw);
                                            newLeafNode(kw, grammarAccess.getTypeParameterAccess().getFullStopFullStopFullStopKeyword_0_1_0_0()); 
                                        

                                    }
                                    break;

                            }

                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1916:3: (this_ID_2= RULE_ID )?
                            int alt52=2;
                            int LA52_0 = input.LA(1);

                            if ( (LA52_0==RULE_ID) ) {
                                alt52=1;
                            }
                            switch (alt52) {
                                case 1 :
                                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1916:8: this_ID_2= RULE_ID
                                    {
                                    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeParameter5472); 

                                    		current.merge(this_ID_2);
                                        
                                     
                                        newLeafNode(this_ID_2, grammarAccess.getTypeParameterAccess().getIDTerminalRuleCall_0_1_0_1()); 
                                        

                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1924:6: ( (this_ID_3= RULE_ID )? kw= '=' this_TypeId_5= ruleTypeId )
                            {
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1924:6: ( (this_ID_3= RULE_ID )? kw= '=' this_TypeId_5= ruleTypeId )
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1924:7: (this_ID_3= RULE_ID )? kw= '=' this_TypeId_5= ruleTypeId
                            {
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1924:7: (this_ID_3= RULE_ID )?
                            int alt53=2;
                            int LA53_0 = input.LA(1);

                            if ( (LA53_0==RULE_ID) ) {
                                alt53=1;
                            }
                            switch (alt53) {
                                case 1 :
                                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1924:12: this_ID_3= RULE_ID
                                    {
                                    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeParameter5503); 

                                    		current.merge(this_ID_3);
                                        
                                     
                                        newLeafNode(this_ID_3, grammarAccess.getTypeParameterAccess().getIDTerminalRuleCall_0_1_1_0()); 
                                        

                                    }
                                    break;

                            }

                            kw=(Token)match(input,68,FOLLOW_68_in_ruleTypeParameter5523); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getTypeParameterAccess().getEqualsSignKeyword_0_1_1_1()); 
                                
                             
                                    newCompositeNode(grammarAccess.getTypeParameterAccess().getTypeIdParserRuleCall_0_1_1_2()); 
                                
                            pushFollow(FOLLOW_ruleTypeId_in_ruleTypeParameter5545);
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
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1949:6: (kw= 'typename' ( ( (kw= '...' )? (this_ID_8= RULE_ID )? ) | ( (this_ID_9= RULE_ID )? kw= '=' this_TypeId_11= ruleTypeId ) ) )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1949:6: (kw= 'typename' ( ( (kw= '...' )? (this_ID_8= RULE_ID )? ) | ( (this_ID_9= RULE_ID )? kw= '=' this_TypeId_11= ruleTypeId ) ) )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1950:2: kw= 'typename' ( ( (kw= '...' )? (this_ID_8= RULE_ID )? ) | ( (this_ID_9= RULE_ID )? kw= '=' this_TypeId_11= ruleTypeId ) )
                    {
                    kw=(Token)match(input,93,FOLLOW_93_in_ruleTypeParameter5573); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeParameterAccess().getTypenameKeyword_1_0()); 
                        
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1955:1: ( ( (kw= '...' )? (this_ID_8= RULE_ID )? ) | ( (this_ID_9= RULE_ID )? kw= '=' this_TypeId_11= ruleTypeId ) )
                    int alt58=2;
                    switch ( input.LA(1) ) {
                    case EOF:
                    case 46:
                    case 48:
                    case 57:
                        {
                        alt58=1;
                        }
                        break;
                    case RULE_ID:
                        {
                        int LA58_2 = input.LA(2);

                        if ( (LA58_2==EOF||LA58_2==48||LA58_2==57) ) {
                            alt58=1;
                        }
                        else if ( (LA58_2==68) ) {
                            alt58=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 58, 2, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 68:
                        {
                        alt58=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 58, 0, input);

                        throw nvae;
                    }

                    switch (alt58) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1955:2: ( (kw= '...' )? (this_ID_8= RULE_ID )? )
                            {
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1955:2: ( (kw= '...' )? (this_ID_8= RULE_ID )? )
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1955:3: (kw= '...' )? (this_ID_8= RULE_ID )?
                            {
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1955:3: (kw= '...' )?
                            int alt55=2;
                            int LA55_0 = input.LA(1);

                            if ( (LA55_0==46) ) {
                                alt55=1;
                            }
                            switch (alt55) {
                                case 1 :
                                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1956:2: kw= '...'
                                    {
                                    kw=(Token)match(input,46,FOLLOW_46_in_ruleTypeParameter5589); 

                                            current.merge(kw);
                                            newLeafNode(kw, grammarAccess.getTypeParameterAccess().getFullStopFullStopFullStopKeyword_1_1_0_0()); 
                                        

                                    }
                                    break;

                            }

                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1961:3: (this_ID_8= RULE_ID )?
                            int alt56=2;
                            int LA56_0 = input.LA(1);

                            if ( (LA56_0==RULE_ID) ) {
                                alt56=1;
                            }
                            switch (alt56) {
                                case 1 :
                                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1961:8: this_ID_8= RULE_ID
                                    {
                                    this_ID_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeParameter5607); 

                                    		current.merge(this_ID_8);
                                        
                                     
                                        newLeafNode(this_ID_8, grammarAccess.getTypeParameterAccess().getIDTerminalRuleCall_1_1_0_1()); 
                                        

                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1969:6: ( (this_ID_9= RULE_ID )? kw= '=' this_TypeId_11= ruleTypeId )
                            {
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1969:6: ( (this_ID_9= RULE_ID )? kw= '=' this_TypeId_11= ruleTypeId )
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1969:7: (this_ID_9= RULE_ID )? kw= '=' this_TypeId_11= ruleTypeId
                            {
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1969:7: (this_ID_9= RULE_ID )?
                            int alt57=2;
                            int LA57_0 = input.LA(1);

                            if ( (LA57_0==RULE_ID) ) {
                                alt57=1;
                            }
                            switch (alt57) {
                                case 1 :
                                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1969:12: this_ID_9= RULE_ID
                                    {
                                    this_ID_9=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeParameter5638); 

                                    		current.merge(this_ID_9);
                                        
                                     
                                        newLeafNode(this_ID_9, grammarAccess.getTypeParameterAccess().getIDTerminalRuleCall_1_1_1_0()); 
                                        

                                    }
                                    break;

                            }

                            kw=(Token)match(input,68,FOLLOW_68_in_ruleTypeParameter5658); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getTypeParameterAccess().getEqualsSignKeyword_1_1_1_1()); 
                                
                             
                                    newCompositeNode(grammarAccess.getTypeParameterAccess().getTypeIdParserRuleCall_1_1_1_2()); 
                                
                            pushFollow(FOLLOW_ruleTypeId_in_ruleTypeParameter5680);
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
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1994:6: (kw= 'template' kw= '<' this_TemplateParameterList_14= ruleTemplateParameterList kw= '>' kw= 'class' ( ( (kw= '...' )? (this_ID_18= RULE_ID )? ) | ( (this_ID_19= RULE_ID )? kw= '=' this_IdExpression_21= ruleIdExpression ) ) )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1994:6: (kw= 'template' kw= '<' this_TemplateParameterList_14= ruleTemplateParameterList kw= '>' kw= 'class' ( ( (kw= '...' )? (this_ID_18= RULE_ID )? ) | ( (this_ID_19= RULE_ID )? kw= '=' this_IdExpression_21= ruleIdExpression ) ) )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1995:2: kw= 'template' kw= '<' this_TemplateParameterList_14= ruleTemplateParameterList kw= '>' kw= 'class' ( ( (kw= '...' )? (this_ID_18= RULE_ID )? ) | ( (this_ID_19= RULE_ID )? kw= '=' this_IdExpression_21= ruleIdExpression ) )
                    {
                    kw=(Token)match(input,94,FOLLOW_94_in_ruleTypeParameter5708); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeParameterAccess().getTemplateKeyword_2_0()); 
                        
                    kw=(Token)match(input,56,FOLLOW_56_in_ruleTypeParameter5721); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeParameterAccess().getLessThanSignKeyword_2_1()); 
                        
                     
                            newCompositeNode(grammarAccess.getTypeParameterAccess().getTemplateParameterListParserRuleCall_2_2()); 
                        
                    pushFollow(FOLLOW_ruleTemplateParameterList_in_ruleTypeParameter5743);
                    this_TemplateParameterList_14=ruleTemplateParameterList();

                    state._fsp--;


                    		current.merge(this_TemplateParameterList_14);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,57,FOLLOW_57_in_ruleTypeParameter5761); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeParameterAccess().getGreaterThanSignKeyword_2_3()); 
                        
                    kw=(Token)match(input,92,FOLLOW_92_in_ruleTypeParameter5774); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeParameterAccess().getClassKeyword_2_4()); 
                        
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2029:1: ( ( (kw= '...' )? (this_ID_18= RULE_ID )? ) | ( (this_ID_19= RULE_ID )? kw= '=' this_IdExpression_21= ruleIdExpression ) )
                    int alt62=2;
                    switch ( input.LA(1) ) {
                    case EOF:
                    case 46:
                    case 48:
                    case 57:
                        {
                        alt62=1;
                        }
                        break;
                    case RULE_ID:
                        {
                        int LA62_2 = input.LA(2);

                        if ( (LA62_2==68) ) {
                            alt62=2;
                        }
                        else if ( (LA62_2==EOF||LA62_2==48||LA62_2==57) ) {
                            alt62=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 62, 2, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 68:
                        {
                        alt62=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 62, 0, input);

                        throw nvae;
                    }

                    switch (alt62) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2029:2: ( (kw= '...' )? (this_ID_18= RULE_ID )? )
                            {
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2029:2: ( (kw= '...' )? (this_ID_18= RULE_ID )? )
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2029:3: (kw= '...' )? (this_ID_18= RULE_ID )?
                            {
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2029:3: (kw= '...' )?
                            int alt59=2;
                            int LA59_0 = input.LA(1);

                            if ( (LA59_0==46) ) {
                                alt59=1;
                            }
                            switch (alt59) {
                                case 1 :
                                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2030:2: kw= '...'
                                    {
                                    kw=(Token)match(input,46,FOLLOW_46_in_ruleTypeParameter5790); 

                                            current.merge(kw);
                                            newLeafNode(kw, grammarAccess.getTypeParameterAccess().getFullStopFullStopFullStopKeyword_2_5_0_0()); 
                                        

                                    }
                                    break;

                            }

                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2035:3: (this_ID_18= RULE_ID )?
                            int alt60=2;
                            int LA60_0 = input.LA(1);

                            if ( (LA60_0==RULE_ID) ) {
                                alt60=1;
                            }
                            switch (alt60) {
                                case 1 :
                                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2035:8: this_ID_18= RULE_ID
                                    {
                                    this_ID_18=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeParameter5808); 

                                    		current.merge(this_ID_18);
                                        
                                     
                                        newLeafNode(this_ID_18, grammarAccess.getTypeParameterAccess().getIDTerminalRuleCall_2_5_0_1()); 
                                        

                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2043:6: ( (this_ID_19= RULE_ID )? kw= '=' this_IdExpression_21= ruleIdExpression )
                            {
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2043:6: ( (this_ID_19= RULE_ID )? kw= '=' this_IdExpression_21= ruleIdExpression )
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2043:7: (this_ID_19= RULE_ID )? kw= '=' this_IdExpression_21= ruleIdExpression
                            {
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2043:7: (this_ID_19= RULE_ID )?
                            int alt61=2;
                            int LA61_0 = input.LA(1);

                            if ( (LA61_0==RULE_ID) ) {
                                alt61=1;
                            }
                            switch (alt61) {
                                case 1 :
                                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2043:12: this_ID_19= RULE_ID
                                    {
                                    this_ID_19=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeParameter5839); 

                                    		current.merge(this_ID_19);
                                        
                                     
                                        newLeafNode(this_ID_19, grammarAccess.getTypeParameterAccess().getIDTerminalRuleCall_2_5_1_0()); 
                                        

                                    }
                                    break;

                            }

                            kw=(Token)match(input,68,FOLLOW_68_in_ruleTypeParameter5859); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getTypeParameterAccess().getEqualsSignKeyword_2_5_1_1()); 
                                
                             
                                    newCompositeNode(grammarAccess.getTypeParameterAccess().getIdExpressionParserRuleCall_2_5_1_2()); 
                                
                            pushFollow(FOLLOW_ruleIdExpression_in_ruleTypeParameter5881);
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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2075:1: entryRuleSimpleTemplateId returns [String current=null] : iv_ruleSimpleTemplateId= ruleSimpleTemplateId EOF ;
    public final String entryRuleSimpleTemplateId() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSimpleTemplateId = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2076:2: (iv_ruleSimpleTemplateId= ruleSimpleTemplateId EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2077:2: iv_ruleSimpleTemplateId= ruleSimpleTemplateId EOF
            {
             newCompositeNode(grammarAccess.getSimpleTemplateIdRule()); 
            pushFollow(FOLLOW_ruleSimpleTemplateId_in_entryRuleSimpleTemplateId5930);
            iv_ruleSimpleTemplateId=ruleSimpleTemplateId();

            state._fsp--;

             current =iv_ruleSimpleTemplateId.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleTemplateId5941); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2084:1: ruleSimpleTemplateId returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID kw= '<' this_TemplateArgumentList_2= ruleTemplateArgumentList kw= '>' ) ;
    public final AntlrDatatypeRuleToken ruleSimpleTemplateId() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_TemplateArgumentList_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2087:28: ( (this_ID_0= RULE_ID kw= '<' this_TemplateArgumentList_2= ruleTemplateArgumentList kw= '>' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2088:1: (this_ID_0= RULE_ID kw= '<' this_TemplateArgumentList_2= ruleTemplateArgumentList kw= '>' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2088:1: (this_ID_0= RULE_ID kw= '<' this_TemplateArgumentList_2= ruleTemplateArgumentList kw= '>' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2088:6: this_ID_0= RULE_ID kw= '<' this_TemplateArgumentList_2= ruleTemplateArgumentList kw= '>'
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSimpleTemplateId5981); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getSimpleTemplateIdAccess().getIDTerminalRuleCall_0()); 
                
            kw=(Token)match(input,56,FOLLOW_56_in_ruleSimpleTemplateId5999); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getSimpleTemplateIdAccess().getLessThanSignKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getSimpleTemplateIdAccess().getTemplateArgumentListParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleTemplateArgumentList_in_ruleSimpleTemplateId6021);
            this_TemplateArgumentList_2=ruleTemplateArgumentList();

            state._fsp--;


            		current.merge(this_TemplateArgumentList_2);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,57,FOLLOW_57_in_ruleSimpleTemplateId6039); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2128:1: entryRuleTemplateArgumentList returns [String current=null] : iv_ruleTemplateArgumentList= ruleTemplateArgumentList EOF ;
    public final String entryRuleTemplateArgumentList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTemplateArgumentList = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2129:2: (iv_ruleTemplateArgumentList= ruleTemplateArgumentList EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2130:2: iv_ruleTemplateArgumentList= ruleTemplateArgumentList EOF
            {
             newCompositeNode(grammarAccess.getTemplateArgumentListRule()); 
            pushFollow(FOLLOW_ruleTemplateArgumentList_in_entryRuleTemplateArgumentList6082);
            iv_ruleTemplateArgumentList=ruleTemplateArgumentList();

            state._fsp--;

             current =iv_ruleTemplateArgumentList.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateArgumentList6093); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2137:1: ruleTemplateArgumentList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TemplateArgument_0= ruleTemplateArgument (kw= '...' )? (kw= ',' this_TemplateArgument_3= ruleTemplateArgument (kw= '...' )? )* ) ;
    public final AntlrDatatypeRuleToken ruleTemplateArgumentList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_TemplateArgument_0 = null;

        AntlrDatatypeRuleToken this_TemplateArgument_3 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2140:28: ( (this_TemplateArgument_0= ruleTemplateArgument (kw= '...' )? (kw= ',' this_TemplateArgument_3= ruleTemplateArgument (kw= '...' )? )* ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2141:1: (this_TemplateArgument_0= ruleTemplateArgument (kw= '...' )? (kw= ',' this_TemplateArgument_3= ruleTemplateArgument (kw= '...' )? )* )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2141:1: (this_TemplateArgument_0= ruleTemplateArgument (kw= '...' )? (kw= ',' this_TemplateArgument_3= ruleTemplateArgument (kw= '...' )? )* )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2142:5: this_TemplateArgument_0= ruleTemplateArgument (kw= '...' )? (kw= ',' this_TemplateArgument_3= ruleTemplateArgument (kw= '...' )? )*
            {
             
                    newCompositeNode(grammarAccess.getTemplateArgumentListAccess().getTemplateArgumentParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleTemplateArgument_in_ruleTemplateArgumentList6140);
            this_TemplateArgument_0=ruleTemplateArgument();

            state._fsp--;


            		current.merge(this_TemplateArgument_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2152:1: (kw= '...' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==46) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2153:2: kw= '...'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleTemplateArgumentList6159); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTemplateArgumentListAccess().getFullStopFullStopFullStopKeyword_1()); 
                        

                    }
                    break;

            }

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2158:3: (kw= ',' this_TemplateArgument_3= ruleTemplateArgument (kw= '...' )? )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==48) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2159:2: kw= ',' this_TemplateArgument_3= ruleTemplateArgument (kw= '...' )?
            	    {
            	    kw=(Token)match(input,48,FOLLOW_48_in_ruleTemplateArgumentList6175); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getTemplateArgumentListAccess().getCommaKeyword_2_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getTemplateArgumentListAccess().getTemplateArgumentParserRuleCall_2_1()); 
            	        
            	    pushFollow(FOLLOW_ruleTemplateArgument_in_ruleTemplateArgumentList6197);
            	    this_TemplateArgument_3=ruleTemplateArgument();

            	    state._fsp--;


            	    		current.merge(this_TemplateArgument_3);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2175:1: (kw= '...' )?
            	    int alt65=2;
            	    int LA65_0 = input.LA(1);

            	    if ( (LA65_0==46) ) {
            	        alt65=1;
            	    }
            	    switch (alt65) {
            	        case 1 :
            	            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2176:2: kw= '...'
            	            {
            	            kw=(Token)match(input,46,FOLLOW_46_in_ruleTemplateArgumentList6216); 

            	                    current.merge(kw);
            	                    newLeafNode(kw, grammarAccess.getTemplateArgumentListAccess().getFullStopFullStopFullStopKeyword_2_2()); 
            	                

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop66;
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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2189:1: entryRuleTemplateArgument returns [String current=null] : iv_ruleTemplateArgument= ruleTemplateArgument EOF ;
    public final String entryRuleTemplateArgument() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTemplateArgument = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2190:2: (iv_ruleTemplateArgument= ruleTemplateArgument EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2191:2: iv_ruleTemplateArgument= ruleTemplateArgument EOF
            {
             newCompositeNode(grammarAccess.getTemplateArgumentRule()); 
            pushFollow(FOLLOW_ruleTemplateArgument_in_entryRuleTemplateArgument6261);
            iv_ruleTemplateArgument=ruleTemplateArgument();

            state._fsp--;

             current =iv_ruleTemplateArgument.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateArgument6272); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2198:1: ruleTemplateArgument returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ConstantExpression_0= ruleConstantExpression | this_TypeId_1= ruleTypeId | this_IdExpression_2= ruleIdExpression ) ;
    public final AntlrDatatypeRuleToken ruleTemplateArgument() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_ConstantExpression_0 = null;

        AntlrDatatypeRuleToken this_TypeId_1 = null;

        AntlrDatatypeRuleToken this_IdExpression_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2201:28: ( (this_ConstantExpression_0= ruleConstantExpression | this_TypeId_1= ruleTypeId | this_IdExpression_2= ruleIdExpression ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2202:1: (this_ConstantExpression_0= ruleConstantExpression | this_TypeId_1= ruleTypeId | this_IdExpression_2= ruleIdExpression )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2202:1: (this_ConstantExpression_0= ruleConstantExpression | this_TypeId_1= ruleTypeId | this_IdExpression_2= ruleIdExpression )
            int alt67=3;
            switch ( input.LA(1) ) {
            case 98:
                {
                alt67=1;
                }
                break;
            case 99:
                {
                alt67=2;
                }
                break;
            case 100:
                {
                alt67=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }

            switch (alt67) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2203:5: this_ConstantExpression_0= ruleConstantExpression
                    {
                     
                            newCompositeNode(grammarAccess.getTemplateArgumentAccess().getConstantExpressionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleConstantExpression_in_ruleTemplateArgument6319);
                    this_ConstantExpression_0=ruleConstantExpression();

                    state._fsp--;


                    		current.merge(this_ConstantExpression_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2215:5: this_TypeId_1= ruleTypeId
                    {
                     
                            newCompositeNode(grammarAccess.getTemplateArgumentAccess().getTypeIdParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleTypeId_in_ruleTemplateArgument6352);
                    this_TypeId_1=ruleTypeId();

                    state._fsp--;


                    		current.merge(this_TypeId_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2227:5: this_IdExpression_2= ruleIdExpression
                    {
                     
                            newCompositeNode(grammarAccess.getTemplateArgumentAccess().getIdExpressionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleIdExpression_in_ruleTemplateArgument6385);
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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2255:1: entryRuleHandler returns [String current=null] : iv_ruleHandler= ruleHandler EOF ;
    public final String entryRuleHandler() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleHandler = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2256:2: (iv_ruleHandler= ruleHandler EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2257:2: iv_ruleHandler= ruleHandler EOF
            {
             newCompositeNode(grammarAccess.getHandlerRule()); 
            pushFollow(FOLLOW_ruleHandler_in_entryRuleHandler6441);
            iv_ruleHandler=ruleHandler();

            state._fsp--;

             current =iv_ruleHandler.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHandler6452); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2264:1: ruleHandler returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'catch' kw= '(' this_ExceptionDeclaration_2= ruleExceptionDeclaration kw= ')' this_CompoundStatement_4= ruleCompoundStatement ) ;
    public final AntlrDatatypeRuleToken ruleHandler() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ExceptionDeclaration_2 = null;

        AntlrDatatypeRuleToken this_CompoundStatement_4 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2267:28: ( (kw= 'catch' kw= '(' this_ExceptionDeclaration_2= ruleExceptionDeclaration kw= ')' this_CompoundStatement_4= ruleCompoundStatement ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2268:1: (kw= 'catch' kw= '(' this_ExceptionDeclaration_2= ruleExceptionDeclaration kw= ')' this_CompoundStatement_4= ruleCompoundStatement )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2268:1: (kw= 'catch' kw= '(' this_ExceptionDeclaration_2= ruleExceptionDeclaration kw= ')' this_CompoundStatement_4= ruleCompoundStatement )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2269:2: kw= 'catch' kw= '(' this_ExceptionDeclaration_2= ruleExceptionDeclaration kw= ')' this_CompoundStatement_4= ruleCompoundStatement
            {
            kw=(Token)match(input,95,FOLLOW_95_in_ruleHandler6490); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getHandlerAccess().getCatchKeyword_0()); 
                
            kw=(Token)match(input,45,FOLLOW_45_in_ruleHandler6503); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getHandlerAccess().getLeftParenthesisKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getHandlerAccess().getExceptionDeclarationParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleExceptionDeclaration_in_ruleHandler6525);
            this_ExceptionDeclaration_2=ruleExceptionDeclaration();

            state._fsp--;


            		current.merge(this_ExceptionDeclaration_2);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,47,FOLLOW_47_in_ruleHandler6543); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getHandlerAccess().getRightParenthesisKeyword_3()); 
                
             
                    newCompositeNode(grammarAccess.getHandlerAccess().getCompoundStatementParserRuleCall_4()); 
                
            pushFollow(FOLLOW_ruleCompoundStatement_in_ruleHandler6565);
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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2316:1: entryRuleExceptionDeclaration returns [String current=null] : iv_ruleExceptionDeclaration= ruleExceptionDeclaration EOF ;
    public final String entryRuleExceptionDeclaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExceptionDeclaration = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2317:2: (iv_ruleExceptionDeclaration= ruleExceptionDeclaration EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2318:2: iv_ruleExceptionDeclaration= ruleExceptionDeclaration EOF
            {
             newCompositeNode(grammarAccess.getExceptionDeclarationRule()); 
            pushFollow(FOLLOW_ruleExceptionDeclaration_in_entryRuleExceptionDeclaration6611);
            iv_ruleExceptionDeclaration=ruleExceptionDeclaration();

            state._fsp--;

             current =iv_ruleExceptionDeclaration.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExceptionDeclaration6622); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2325:1: ruleExceptionDeclaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_AttributeSpecifier_0= ruleAttributeSpecifier )* (this_TypeSpecifier_1= ruleTypeSpecifier )+ (this_Declarator_2= ruleDeclarator | (this_AbstractDeclarator_3= ruleAbstractDeclarator )? ) ) | kw= '...' ) ;
    public final AntlrDatatypeRuleToken ruleExceptionDeclaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_AttributeSpecifier_0 = null;

        AntlrDatatypeRuleToken this_TypeSpecifier_1 = null;

        AntlrDatatypeRuleToken this_Declarator_2 = null;

        AntlrDatatypeRuleToken this_AbstractDeclarator_3 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2328:28: ( ( ( (this_AttributeSpecifier_0= ruleAttributeSpecifier )* (this_TypeSpecifier_1= ruleTypeSpecifier )+ (this_Declarator_2= ruleDeclarator | (this_AbstractDeclarator_3= ruleAbstractDeclarator )? ) ) | kw= '...' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2329:1: ( ( (this_AttributeSpecifier_0= ruleAttributeSpecifier )* (this_TypeSpecifier_1= ruleTypeSpecifier )+ (this_Declarator_2= ruleDeclarator | (this_AbstractDeclarator_3= ruleAbstractDeclarator )? ) ) | kw= '...' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2329:1: ( ( (this_AttributeSpecifier_0= ruleAttributeSpecifier )* (this_TypeSpecifier_1= ruleTypeSpecifier )+ (this_Declarator_2= ruleDeclarator | (this_AbstractDeclarator_3= ruleAbstractDeclarator )? ) ) | kw= '...' )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==42||LA72_0==44||LA72_0==106) ) {
                alt72=1;
            }
            else if ( (LA72_0==46) ) {
                alt72=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }
            switch (alt72) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2329:2: ( (this_AttributeSpecifier_0= ruleAttributeSpecifier )* (this_TypeSpecifier_1= ruleTypeSpecifier )+ (this_Declarator_2= ruleDeclarator | (this_AbstractDeclarator_3= ruleAbstractDeclarator )? ) )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2329:2: ( (this_AttributeSpecifier_0= ruleAttributeSpecifier )* (this_TypeSpecifier_1= ruleTypeSpecifier )+ (this_Declarator_2= ruleDeclarator | (this_AbstractDeclarator_3= ruleAbstractDeclarator )? ) )
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2329:3: (this_AttributeSpecifier_0= ruleAttributeSpecifier )* (this_TypeSpecifier_1= ruleTypeSpecifier )+ (this_Declarator_2= ruleDeclarator | (this_AbstractDeclarator_3= ruleAbstractDeclarator )? )
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2329:3: (this_AttributeSpecifier_0= ruleAttributeSpecifier )*
                    loop68:
                    do {
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( (LA68_0==42||LA68_0==44) ) {
                            alt68=1;
                        }


                        switch (alt68) {
                    	case 1 :
                    	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2330:5: this_AttributeSpecifier_0= ruleAttributeSpecifier
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getExceptionDeclarationAccess().getAttributeSpecifierParserRuleCall_0_0()); 
                    	        
                    	    pushFollow(FOLLOW_ruleAttributeSpecifier_in_ruleExceptionDeclaration6671);
                    	    this_AttributeSpecifier_0=ruleAttributeSpecifier();

                    	    state._fsp--;


                    	    		current.merge(this_AttributeSpecifier_0);
                    	        
                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop68;
                        }
                    } while (true);

                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2340:3: (this_TypeSpecifier_1= ruleTypeSpecifier )+
                    int cnt69=0;
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==106) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2341:5: this_TypeSpecifier_1= ruleTypeSpecifier
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getExceptionDeclarationAccess().getTypeSpecifierParserRuleCall_0_1()); 
                    	        
                    	    pushFollow(FOLLOW_ruleTypeSpecifier_in_ruleExceptionDeclaration6701);
                    	    this_TypeSpecifier_1=ruleTypeSpecifier();

                    	    state._fsp--;


                    	    		current.merge(this_TypeSpecifier_1);
                    	        
                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt69 >= 1 ) break loop69;
                                EarlyExitException eee =
                                    new EarlyExitException(69, input);
                                throw eee;
                        }
                        cnt69++;
                    } while (true);

                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2351:3: (this_Declarator_2= ruleDeclarator | (this_AbstractDeclarator_3= ruleAbstractDeclarator )? )
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==41||(LA71_0>=45 && LA71_0<=46)||(LA71_0>=51 && LA71_0<=52)||LA71_0==54||LA71_0==100||LA71_0==103||LA71_0==114) ) {
                        alt71=1;
                    }
                    else if ( (LA71_0==EOF||LA71_0==47||LA71_0==107) ) {
                        alt71=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 71, 0, input);

                        throw nvae;
                    }
                    switch (alt71) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2352:5: this_Declarator_2= ruleDeclarator
                            {
                             
                                    newCompositeNode(grammarAccess.getExceptionDeclarationAccess().getDeclaratorParserRuleCall_0_2_0()); 
                                
                            pushFollow(FOLLOW_ruleDeclarator_in_ruleExceptionDeclaration6731);
                            this_Declarator_2=ruleDeclarator();

                            state._fsp--;


                            		current.merge(this_Declarator_2);
                                
                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;
                        case 2 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2363:6: (this_AbstractDeclarator_3= ruleAbstractDeclarator )?
                            {
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2363:6: (this_AbstractDeclarator_3= ruleAbstractDeclarator )?
                            int alt70=2;
                            int LA70_0 = input.LA(1);

                            if ( (LA70_0==107) ) {
                                alt70=1;
                            }
                            switch (alt70) {
                                case 1 :
                                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2364:5: this_AbstractDeclarator_3= ruleAbstractDeclarator
                                    {
                                     
                                            newCompositeNode(grammarAccess.getExceptionDeclarationAccess().getAbstractDeclaratorParserRuleCall_0_2_1()); 
                                        
                                    pushFollow(FOLLOW_ruleAbstractDeclarator_in_ruleExceptionDeclaration6765);
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
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2376:2: kw= '...'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleExceptionDeclaration6793); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2391:1: entryRuleExceptionSpecification returns [String current=null] : iv_ruleExceptionSpecification= ruleExceptionSpecification EOF ;
    public final String entryRuleExceptionSpecification() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExceptionSpecification = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2392:2: (iv_ruleExceptionSpecification= ruleExceptionSpecification EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2393:2: iv_ruleExceptionSpecification= ruleExceptionSpecification EOF
            {
             newCompositeNode(grammarAccess.getExceptionSpecificationRule()); 
            pushFollow(FOLLOW_ruleExceptionSpecification_in_entryRuleExceptionSpecification6836);
            iv_ruleExceptionSpecification=ruleExceptionSpecification();

            state._fsp--;

             current =iv_ruleExceptionSpecification.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExceptionSpecification6847); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2400:1: ruleExceptionSpecification returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DynamicExceptionSpecification_0= ruleDynamicExceptionSpecification | this_NoexceptSpecification_1= ruleNoexceptSpecification ) ;
    public final AntlrDatatypeRuleToken ruleExceptionSpecification() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_DynamicExceptionSpecification_0 = null;

        AntlrDatatypeRuleToken this_NoexceptSpecification_1 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2403:28: ( (this_DynamicExceptionSpecification_0= ruleDynamicExceptionSpecification | this_NoexceptSpecification_1= ruleNoexceptSpecification ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2404:1: (this_DynamicExceptionSpecification_0= ruleDynamicExceptionSpecification | this_NoexceptSpecification_1= ruleNoexceptSpecification )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2404:1: (this_DynamicExceptionSpecification_0= ruleDynamicExceptionSpecification | this_NoexceptSpecification_1= ruleNoexceptSpecification )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==96) ) {
                alt73=1;
            }
            else if ( (LA73_0==97) ) {
                alt73=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2405:5: this_DynamicExceptionSpecification_0= ruleDynamicExceptionSpecification
                    {
                     
                            newCompositeNode(grammarAccess.getExceptionSpecificationAccess().getDynamicExceptionSpecificationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDynamicExceptionSpecification_in_ruleExceptionSpecification6894);
                    this_DynamicExceptionSpecification_0=ruleDynamicExceptionSpecification();

                    state._fsp--;


                    		current.merge(this_DynamicExceptionSpecification_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2417:5: this_NoexceptSpecification_1= ruleNoexceptSpecification
                    {
                     
                            newCompositeNode(grammarAccess.getExceptionSpecificationAccess().getNoexceptSpecificationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNoexceptSpecification_in_ruleExceptionSpecification6927);
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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2435:1: entryRuleDynamicExceptionSpecification returns [String current=null] : iv_ruleDynamicExceptionSpecification= ruleDynamicExceptionSpecification EOF ;
    public final String entryRuleDynamicExceptionSpecification() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDynamicExceptionSpecification = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2436:2: (iv_ruleDynamicExceptionSpecification= ruleDynamicExceptionSpecification EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2437:2: iv_ruleDynamicExceptionSpecification= ruleDynamicExceptionSpecification EOF
            {
             newCompositeNode(grammarAccess.getDynamicExceptionSpecificationRule()); 
            pushFollow(FOLLOW_ruleDynamicExceptionSpecification_in_entryRuleDynamicExceptionSpecification6973);
            iv_ruleDynamicExceptionSpecification=ruleDynamicExceptionSpecification();

            state._fsp--;

             current =iv_ruleDynamicExceptionSpecification.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDynamicExceptionSpecification6984); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2444:1: ruleDynamicExceptionSpecification returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'throw' kw= '(' this_TypeIdList_2= ruleTypeIdList kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleDynamicExceptionSpecification() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_TypeIdList_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2447:28: ( (kw= 'throw' kw= '(' this_TypeIdList_2= ruleTypeIdList kw= ')' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2448:1: (kw= 'throw' kw= '(' this_TypeIdList_2= ruleTypeIdList kw= ')' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2448:1: (kw= 'throw' kw= '(' this_TypeIdList_2= ruleTypeIdList kw= ')' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2449:2: kw= 'throw' kw= '(' this_TypeIdList_2= ruleTypeIdList kw= ')'
            {
            kw=(Token)match(input,96,FOLLOW_96_in_ruleDynamicExceptionSpecification7022); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDynamicExceptionSpecificationAccess().getThrowKeyword_0()); 
                
            kw=(Token)match(input,45,FOLLOW_45_in_ruleDynamicExceptionSpecification7035); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDynamicExceptionSpecificationAccess().getLeftParenthesisKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getDynamicExceptionSpecificationAccess().getTypeIdListParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleTypeIdList_in_ruleDynamicExceptionSpecification7057);
            this_TypeIdList_2=ruleTypeIdList();

            state._fsp--;


            		current.merge(this_TypeIdList_2);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,47,FOLLOW_47_in_ruleDynamicExceptionSpecification7075); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2485:1: entryRuleNoexceptSpecification returns [String current=null] : iv_ruleNoexceptSpecification= ruleNoexceptSpecification EOF ;
    public final String entryRuleNoexceptSpecification() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNoexceptSpecification = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2486:2: (iv_ruleNoexceptSpecification= ruleNoexceptSpecification EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2487:2: iv_ruleNoexceptSpecification= ruleNoexceptSpecification EOF
            {
             newCompositeNode(grammarAccess.getNoexceptSpecificationRule()); 
            pushFollow(FOLLOW_ruleNoexceptSpecification_in_entryRuleNoexceptSpecification7116);
            iv_ruleNoexceptSpecification=ruleNoexceptSpecification();

            state._fsp--;

             current =iv_ruleNoexceptSpecification.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoexceptSpecification7127); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2494:1: ruleNoexceptSpecification returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'noexcept' (kw= '(' this_ConstantExpression_2= ruleConstantExpression kw= ')' )? ) ;
    public final AntlrDatatypeRuleToken ruleNoexceptSpecification() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ConstantExpression_2 = null;


         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2497:28: ( (kw= 'noexcept' (kw= '(' this_ConstantExpression_2= ruleConstantExpression kw= ')' )? ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2498:1: (kw= 'noexcept' (kw= '(' this_ConstantExpression_2= ruleConstantExpression kw= ')' )? )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2498:1: (kw= 'noexcept' (kw= '(' this_ConstantExpression_2= ruleConstantExpression kw= ')' )? )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2499:2: kw= 'noexcept' (kw= '(' this_ConstantExpression_2= ruleConstantExpression kw= ')' )?
            {
            kw=(Token)match(input,97,FOLLOW_97_in_ruleNoexceptSpecification7165); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getNoexceptSpecificationAccess().getNoexceptKeyword_0()); 
                
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2504:1: (kw= '(' this_ConstantExpression_2= ruleConstantExpression kw= ')' )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==45) ) {
                int LA74_1 = input.LA(2);

                if ( (LA74_1==98) ) {
                    alt74=1;
                }
            }
            switch (alt74) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2505:2: kw= '(' this_ConstantExpression_2= ruleConstantExpression kw= ')'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleNoexceptSpecification7179); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNoexceptSpecificationAccess().getLeftParenthesisKeyword_1_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getNoexceptSpecificationAccess().getConstantExpressionParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleConstantExpression_in_ruleNoexceptSpecification7201);
                    this_ConstantExpression_2=ruleConstantExpression();

                    state._fsp--;


                    		current.merge(this_ConstantExpression_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleNoexceptSpecification7219); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2535:1: entryRuleConstantExpression returns [String current=null] : iv_ruleConstantExpression= ruleConstantExpression EOF ;
    public final String entryRuleConstantExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConstantExpression = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2536:2: (iv_ruleConstantExpression= ruleConstantExpression EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2537:2: iv_ruleConstantExpression= ruleConstantExpression EOF
            {
             newCompositeNode(grammarAccess.getConstantExpressionRule()); 
            pushFollow(FOLLOW_ruleConstantExpression_in_entryRuleConstantExpression7262);
            iv_ruleConstantExpression=ruleConstantExpression();

            state._fsp--;

             current =iv_ruleConstantExpression.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantExpression7273); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2544:1: ruleConstantExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'ConstantExpression' ;
    public final AntlrDatatypeRuleToken ruleConstantExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2547:28: (kw= 'ConstantExpression' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2549:2: kw= 'ConstantExpression'
            {
            kw=(Token)match(input,98,FOLLOW_98_in_ruleConstantExpression7310); 

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


    // $ANTLR start "entryRuleTypeId"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2562:1: entryRuleTypeId returns [String current=null] : iv_ruleTypeId= ruleTypeId EOF ;
    public final String entryRuleTypeId() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeId = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2563:2: (iv_ruleTypeId= ruleTypeId EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2564:2: iv_ruleTypeId= ruleTypeId EOF
            {
             newCompositeNode(grammarAccess.getTypeIdRule()); 
            pushFollow(FOLLOW_ruleTypeId_in_entryRuleTypeId7350);
            iv_ruleTypeId=ruleTypeId();

            state._fsp--;

             current =iv_ruleTypeId.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeId7361); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2571:1: ruleTypeId returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'TypeId' ;
    public final AntlrDatatypeRuleToken ruleTypeId() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2574:28: (kw= 'TypeId' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2576:2: kw= 'TypeId'
            {
            kw=(Token)match(input,99,FOLLOW_99_in_ruleTypeId7398); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getTypeIdAccess().getTypeIdKeyword()); 
                

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2589:1: entryRuleIdExpression returns [String current=null] : iv_ruleIdExpression= ruleIdExpression EOF ;
    public final String entryRuleIdExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdExpression = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2590:2: (iv_ruleIdExpression= ruleIdExpression EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2591:2: iv_ruleIdExpression= ruleIdExpression EOF
            {
             newCompositeNode(grammarAccess.getIdExpressionRule()); 
            pushFollow(FOLLOW_ruleIdExpression_in_entryRuleIdExpression7438);
            iv_ruleIdExpression=ruleIdExpression();

            state._fsp--;

             current =iv_ruleIdExpression.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdExpression7449); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2598:1: ruleIdExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'IdExpression' ;
    public final AntlrDatatypeRuleToken ruleIdExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2601:28: (kw= 'IdExpression' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2603:2: kw= 'IdExpression'
            {
            kw=(Token)match(input,100,FOLLOW_100_in_ruleIdExpression7486); 

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


    // $ANTLR start "entryRuleParameterDeclaration"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2616:1: entryRuleParameterDeclaration returns [String current=null] : iv_ruleParameterDeclaration= ruleParameterDeclaration EOF ;
    public final String entryRuleParameterDeclaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleParameterDeclaration = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2617:2: (iv_ruleParameterDeclaration= ruleParameterDeclaration EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2618:2: iv_ruleParameterDeclaration= ruleParameterDeclaration EOF
            {
             newCompositeNode(grammarAccess.getParameterDeclarationRule()); 
            pushFollow(FOLLOW_ruleParameterDeclaration_in_entryRuleParameterDeclaration7526);
            iv_ruleParameterDeclaration=ruleParameterDeclaration();

            state._fsp--;

             current =iv_ruleParameterDeclaration.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterDeclaration7537); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2625:1: ruleParameterDeclaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'ParameterDeclaration' ;
    public final AntlrDatatypeRuleToken ruleParameterDeclaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2628:28: (kw= 'ParameterDeclaration' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2630:2: kw= 'ParameterDeclaration'
            {
            kw=(Token)match(input,101,FOLLOW_101_in_ruleParameterDeclaration7574); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getParameterDeclarationAccess().getParameterDeclarationKeyword()); 
                

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2643:1: entryRuleDeclaration returns [String current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final String entryRuleDeclaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDeclaration = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2644:2: (iv_ruleDeclaration= ruleDeclaration EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2645:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration7614);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;

             current =iv_ruleDeclaration.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration7625); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2652:1: ruleDeclaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Declaration' ;
    public final AntlrDatatypeRuleToken ruleDeclaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2655:28: (kw= 'Declaration' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2657:2: kw= 'Declaration'
            {
            kw=(Token)match(input,102,FOLLOW_102_in_ruleDeclaration7662); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2670:1: entryRuleNestedNameSpecifier returns [String current=null] : iv_ruleNestedNameSpecifier= ruleNestedNameSpecifier EOF ;
    public final String entryRuleNestedNameSpecifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNestedNameSpecifier = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2671:2: (iv_ruleNestedNameSpecifier= ruleNestedNameSpecifier EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2672:2: iv_ruleNestedNameSpecifier= ruleNestedNameSpecifier EOF
            {
             newCompositeNode(grammarAccess.getNestedNameSpecifierRule()); 
            pushFollow(FOLLOW_ruleNestedNameSpecifier_in_entryRuleNestedNameSpecifier7702);
            iv_ruleNestedNameSpecifier=ruleNestedNameSpecifier();

            state._fsp--;

             current =iv_ruleNestedNameSpecifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNestedNameSpecifier7713); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2679:1: ruleNestedNameSpecifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'NestedNameSpecifier' ;
    public final AntlrDatatypeRuleToken ruleNestedNameSpecifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2682:28: (kw= 'NestedNameSpecifier' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2684:2: kw= 'NestedNameSpecifier'
            {
            kw=(Token)match(input,103,FOLLOW_103_in_ruleNestedNameSpecifier7750); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2697:1: entryRuleAssignmentExpression returns [String current=null] : iv_ruleAssignmentExpression= ruleAssignmentExpression EOF ;
    public final String entryRuleAssignmentExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAssignmentExpression = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2698:2: (iv_ruleAssignmentExpression= ruleAssignmentExpression EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2699:2: iv_ruleAssignmentExpression= ruleAssignmentExpression EOF
            {
             newCompositeNode(grammarAccess.getAssignmentExpressionRule()); 
            pushFollow(FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression7790);
            iv_ruleAssignmentExpression=ruleAssignmentExpression();

            state._fsp--;

             current =iv_ruleAssignmentExpression.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignmentExpression7801); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2706:1: ruleAssignmentExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'AssignmentExpression' ;
    public final AntlrDatatypeRuleToken ruleAssignmentExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2709:28: (kw= 'AssignmentExpression' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2711:2: kw= 'AssignmentExpression'
            {
            kw=(Token)match(input,104,FOLLOW_104_in_ruleAssignmentExpression7838); 

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


    // $ANTLR start "entryRuleAlignmentExpression"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2724:1: entryRuleAlignmentExpression returns [String current=null] : iv_ruleAlignmentExpression= ruleAlignmentExpression EOF ;
    public final String entryRuleAlignmentExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAlignmentExpression = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2725:2: (iv_ruleAlignmentExpression= ruleAlignmentExpression EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2726:2: iv_ruleAlignmentExpression= ruleAlignmentExpression EOF
            {
             newCompositeNode(grammarAccess.getAlignmentExpressionRule()); 
            pushFollow(FOLLOW_ruleAlignmentExpression_in_entryRuleAlignmentExpression7878);
            iv_ruleAlignmentExpression=ruleAlignmentExpression();

            state._fsp--;

             current =iv_ruleAlignmentExpression.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlignmentExpression7889); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlignmentExpression"


    // $ANTLR start "ruleAlignmentExpression"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2733:1: ruleAlignmentExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'AlignmentExpression' ;
    public final AntlrDatatypeRuleToken ruleAlignmentExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2736:28: (kw= 'AlignmentExpression' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2738:2: kw= 'AlignmentExpression'
            {
            kw=(Token)match(input,105,FOLLOW_105_in_ruleAlignmentExpression7926); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getAlignmentExpressionAccess().getAlignmentExpressionKeyword()); 
                

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
    // $ANTLR end "ruleAlignmentExpression"


    // $ANTLR start "entryRuleTypeSpecifier"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2751:1: entryRuleTypeSpecifier returns [String current=null] : iv_ruleTypeSpecifier= ruleTypeSpecifier EOF ;
    public final String entryRuleTypeSpecifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeSpecifier = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2752:2: (iv_ruleTypeSpecifier= ruleTypeSpecifier EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2753:2: iv_ruleTypeSpecifier= ruleTypeSpecifier EOF
            {
             newCompositeNode(grammarAccess.getTypeSpecifierRule()); 
            pushFollow(FOLLOW_ruleTypeSpecifier_in_entryRuleTypeSpecifier7966);
            iv_ruleTypeSpecifier=ruleTypeSpecifier();

            state._fsp--;

             current =iv_ruleTypeSpecifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeSpecifier7977); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2760:1: ruleTypeSpecifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'TypeSpecifier' ;
    public final AntlrDatatypeRuleToken ruleTypeSpecifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2763:28: (kw= 'TypeSpecifier' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2765:2: kw= 'TypeSpecifier'
            {
            kw=(Token)match(input,106,FOLLOW_106_in_ruleTypeSpecifier8014); 

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


    // $ANTLR start "entryRuleAbstractDeclarator"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2778:1: entryRuleAbstractDeclarator returns [String current=null] : iv_ruleAbstractDeclarator= ruleAbstractDeclarator EOF ;
    public final String entryRuleAbstractDeclarator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAbstractDeclarator = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2779:2: (iv_ruleAbstractDeclarator= ruleAbstractDeclarator EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2780:2: iv_ruleAbstractDeclarator= ruleAbstractDeclarator EOF
            {
             newCompositeNode(grammarAccess.getAbstractDeclaratorRule()); 
            pushFollow(FOLLOW_ruleAbstractDeclarator_in_entryRuleAbstractDeclarator8054);
            iv_ruleAbstractDeclarator=ruleAbstractDeclarator();

            state._fsp--;

             current =iv_ruleAbstractDeclarator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractDeclarator8065); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2787:1: ruleAbstractDeclarator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'AbstractDeclarator' ;
    public final AntlrDatatypeRuleToken ruleAbstractDeclarator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2790:28: (kw= 'AbstractDeclarator' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2792:2: kw= 'AbstractDeclarator'
            {
            kw=(Token)match(input,107,FOLLOW_107_in_ruleAbstractDeclarator8102); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getAbstractDeclaratorAccess().getAbstractDeclaratorKeyword()); 
                

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2805:1: entryRuleCompoundStatement returns [String current=null] : iv_ruleCompoundStatement= ruleCompoundStatement EOF ;
    public final String entryRuleCompoundStatement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCompoundStatement = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2806:2: (iv_ruleCompoundStatement= ruleCompoundStatement EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2807:2: iv_ruleCompoundStatement= ruleCompoundStatement EOF
            {
             newCompositeNode(grammarAccess.getCompoundStatementRule()); 
            pushFollow(FOLLOW_ruleCompoundStatement_in_entryRuleCompoundStatement8142);
            iv_ruleCompoundStatement=ruleCompoundStatement();

            state._fsp--;

             current =iv_ruleCompoundStatement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompoundStatement8153); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2814:1: ruleCompoundStatement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'CompoundStatement' ;
    public final AntlrDatatypeRuleToken ruleCompoundStatement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2817:28: (kw= 'CompoundStatement' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2819:2: kw= 'CompoundStatement'
            {
            kw=(Token)match(input,108,FOLLOW_108_in_ruleCompoundStatement8190); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2832:1: entryRuleCtorInitializer returns [String current=null] : iv_ruleCtorInitializer= ruleCtorInitializer EOF ;
    public final String entryRuleCtorInitializer() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCtorInitializer = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2833:2: (iv_ruleCtorInitializer= ruleCtorInitializer EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2834:2: iv_ruleCtorInitializer= ruleCtorInitializer EOF
            {
             newCompositeNode(grammarAccess.getCtorInitializerRule()); 
            pushFollow(FOLLOW_ruleCtorInitializer_in_entryRuleCtorInitializer8230);
            iv_ruleCtorInitializer=ruleCtorInitializer();

            state._fsp--;

             current =iv_ruleCtorInitializer.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCtorInitializer8241); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2841:1: ruleCtorInitializer returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'CtorInitializer' ;
    public final AntlrDatatypeRuleToken ruleCtorInitializer() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2844:28: (kw= 'CtorInitializer' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2846:2: kw= 'CtorInitializer'
            {
            kw=(Token)match(input,109,FOLLOW_109_in_ruleCtorInitializer8278); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2859:1: entryRuleTypeIdList returns [String current=null] : iv_ruleTypeIdList= ruleTypeIdList EOF ;
    public final String entryRuleTypeIdList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeIdList = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2860:2: (iv_ruleTypeIdList= ruleTypeIdList EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2861:2: iv_ruleTypeIdList= ruleTypeIdList EOF
            {
             newCompositeNode(grammarAccess.getTypeIdListRule()); 
            pushFollow(FOLLOW_ruleTypeIdList_in_entryRuleTypeIdList8318);
            iv_ruleTypeIdList=ruleTypeIdList();

            state._fsp--;

             current =iv_ruleTypeIdList.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeIdList8329); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2868:1: ruleTypeIdList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'TypeIdList' ;
    public final AntlrDatatypeRuleToken ruleTypeIdList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2871:28: (kw= 'TypeIdList' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2873:2: kw= 'TypeIdList'
            {
            kw=(Token)match(input,110,FOLLOW_110_in_ruleTypeIdList8366); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2886:1: entryRuleUnqualifiedId returns [String current=null] : iv_ruleUnqualifiedId= ruleUnqualifiedId EOF ;
    public final String entryRuleUnqualifiedId() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnqualifiedId = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2887:2: (iv_ruleUnqualifiedId= ruleUnqualifiedId EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2888:2: iv_ruleUnqualifiedId= ruleUnqualifiedId EOF
            {
             newCompositeNode(grammarAccess.getUnqualifiedIdRule()); 
            pushFollow(FOLLOW_ruleUnqualifiedId_in_entryRuleUnqualifiedId8406);
            iv_ruleUnqualifiedId=ruleUnqualifiedId();

            state._fsp--;

             current =iv_ruleUnqualifiedId.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnqualifiedId8417); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2895:1: ruleUnqualifiedId returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'UnqualifiedId' ;
    public final AntlrDatatypeRuleToken ruleUnqualifiedId() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2898:28: (kw= 'UnqualifiedId' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2900:2: kw= 'UnqualifiedId'
            {
            kw=(Token)match(input,111,FOLLOW_111_in_ruleUnqualifiedId8454); 

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


    // $ANTLR start "entryRuleParameterDeclarationClause"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2913:1: entryRuleParameterDeclarationClause returns [String current=null] : iv_ruleParameterDeclarationClause= ruleParameterDeclarationClause EOF ;
    public final String entryRuleParameterDeclarationClause() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleParameterDeclarationClause = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2914:2: (iv_ruleParameterDeclarationClause= ruleParameterDeclarationClause EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2915:2: iv_ruleParameterDeclarationClause= ruleParameterDeclarationClause EOF
            {
             newCompositeNode(grammarAccess.getParameterDeclarationClauseRule()); 
            pushFollow(FOLLOW_ruleParameterDeclarationClause_in_entryRuleParameterDeclarationClause8494);
            iv_ruleParameterDeclarationClause=ruleParameterDeclarationClause();

            state._fsp--;

             current =iv_ruleParameterDeclarationClause.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterDeclarationClause8505); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2922:1: ruleParameterDeclarationClause returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'ParameterDeclarationClause' ;
    public final AntlrDatatypeRuleToken ruleParameterDeclarationClause() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2925:28: (kw= 'ParameterDeclarationClause' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2927:2: kw= 'ParameterDeclarationClause'
            {
            kw=(Token)match(input,112,FOLLOW_112_in_ruleParameterDeclarationClause8542); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getParameterDeclarationClauseAccess().getParameterDeclarationClauseKeyword()); 
                

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


    // $ANTLR start "entryRuleTrailingTypeSpecifier"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2940:1: entryRuleTrailingTypeSpecifier returns [String current=null] : iv_ruleTrailingTypeSpecifier= ruleTrailingTypeSpecifier EOF ;
    public final String entryRuleTrailingTypeSpecifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTrailingTypeSpecifier = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2941:2: (iv_ruleTrailingTypeSpecifier= ruleTrailingTypeSpecifier EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2942:2: iv_ruleTrailingTypeSpecifier= ruleTrailingTypeSpecifier EOF
            {
             newCompositeNode(grammarAccess.getTrailingTypeSpecifierRule()); 
            pushFollow(FOLLOW_ruleTrailingTypeSpecifier_in_entryRuleTrailingTypeSpecifier8582);
            iv_ruleTrailingTypeSpecifier=ruleTrailingTypeSpecifier();

            state._fsp--;

             current =iv_ruleTrailingTypeSpecifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTrailingTypeSpecifier8593); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2949:1: ruleTrailingTypeSpecifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'TrailingTypeSpecifier' ;
    public final AntlrDatatypeRuleToken ruleTrailingTypeSpecifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2952:28: (kw= 'TrailingTypeSpecifier' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2954:2: kw= 'TrailingTypeSpecifier'
            {
            kw=(Token)match(input,113,FOLLOW_113_in_ruleTrailingTypeSpecifier8630); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getTrailingTypeSpecifierAccess().getTrailingTypeSpecifierKeyword()); 
                

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


    // $ANTLR start "entryRuleClassName"
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2967:1: entryRuleClassName returns [String current=null] : iv_ruleClassName= ruleClassName EOF ;
    public final String entryRuleClassName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleClassName = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2968:2: (iv_ruleClassName= ruleClassName EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2969:2: iv_ruleClassName= ruleClassName EOF
            {
             newCompositeNode(grammarAccess.getClassNameRule()); 
            pushFollow(FOLLOW_ruleClassName_in_entryRuleClassName8670);
            iv_ruleClassName=ruleClassName();

            state._fsp--;

             current =iv_ruleClassName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassName8681); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2976:1: ruleClassName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'ClassName' ;
    public final AntlrDatatypeRuleToken ruleClassName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2979:28: (kw= 'ClassName' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2981:2: kw= 'ClassName'
            {
            kw=(Token)match(input,114,FOLLOW_114_in_ruleClassName8718); 

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2994:1: entryRuleInitializer returns [String current=null] : iv_ruleInitializer= ruleInitializer EOF ;
    public final String entryRuleInitializer() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInitializer = null;


        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2995:2: (iv_ruleInitializer= ruleInitializer EOF )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:2996:2: iv_ruleInitializer= ruleInitializer EOF
            {
             newCompositeNode(grammarAccess.getInitializerRule()); 
            pushFollow(FOLLOW_ruleInitializer_in_entryRuleInitializer8758);
            iv_ruleInitializer=ruleInitializer();

            state._fsp--;

             current =iv_ruleInitializer.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInitializer8769); 

            }

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
    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3003:1: ruleInitializer returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Initializer' ;
    public final AntlrDatatypeRuleToken ruleInitializer() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3006:28: (kw= 'Initializer' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3008:2: kw= 'Initializer'
            {
            kw=(Token)match(input,115,FOLLOW_115_in_ruleInitializer8806); 

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


    protected DFA23 dfa23 = new DFA23(this);
    protected DFA48 dfa48 = new DFA48(this);
    static final String DFA23_eotS =
        "\77\uffff";
    static final String DFA23_eofS =
        "\1\1\4\uffff\1\3\2\uffff\4\3\1\uffff\1\3\17\uffff\1\3\1\uffff\3"+
        "\3\12\uffff\1\3\22\uffff";
    static final String DFA23_minS =
        "\1\52\1\uffff\1\160\1\uffff\1\57\2\52\1\55\4\52\1\55\1\52\1\6\1"+
        "\143\1\156\1\142\1\51\2\56\2\57\1\6\1\4\1\53\1\6\1\53\1\57\1\52"+
        "\1\57\3\52\1\53\5\57\2\50\1\6\1\51\1\52\1\53\2\57\1\4\1\53\1\6\5"+
        "\57\2\50\1\6\2\53\2\57";
    static final String DFA23_maxS =
        "\1\163\1\uffff\1\160\1\uffff\1\57\1\163\1\142\1\55\4\163\1\55\1"+
        "\163\1\6\1\151\1\156\1\160\1\60\4\57\1\6\1\47\2\60\1\53\1\57\1\163"+
        "\1\57\3\163\1\60\5\57\2\50\1\6\1\60\1\163\1\60\2\57\1\47\1\60\1"+
        "\6\5\57\2\50\1\6\2\60\2\57";
    static final String DFA23_acceptS =
        "\1\uffff\1\2\1\uffff\1\1\73\uffff";
    static final String DFA23_specialS =
        "\77\uffff}>";
    static final String[] DFA23_transitionS = {
            "\1\3\2\uffff\1\2\1\uffff\1\1\103\uffff\1\1",
            "",
            "\1\4",
            "",
            "\1\5",
            "\1\6\1\uffff\1\7\1\3\1\uffff\1\3\1\uffff\1\10\1\11\1\12\1"+
            "\13\1\1\52\uffff\1\14\1\15\21\uffff\1\3",
            "\1\16\67\uffff\1\3",
            "\1\17",
            "\1\3\2\uffff\1\3\1\uffff\1\3\1\uffff\1\10\1\11\1\12\1\13\1"+
            "\1\52\uffff\1\14\1\15\21\uffff\1\3",
            "\1\3\2\uffff\1\3\1\uffff\1\3\1\uffff\1\10\1\11\1\12\1\13\1"+
            "\1\52\uffff\1\14\1\15\21\uffff\1\3",
            "\1\3\2\uffff\1\3\1\uffff\1\3\3\uffff\1\12\1\13\1\1\52\uffff"+
            "\1\14\1\15\21\uffff\1\3",
            "\1\3\2\uffff\1\3\1\uffff\1\3\3\uffff\1\12\1\13\1\1\52\uffff"+
            "\1\14\1\15\21\uffff\1\3",
            "\1\20",
            "\1\3\2\uffff\1\21\1\uffff\1\3\5\uffff\1\1\75\uffff\1\3",
            "\1\22",
            "\1\23\5\uffff\1\24",
            "\1\25",
            "\1\26\15\uffff\1\3",
            "\1\27\1\uffff\1\33\1\uffff\1\30\1\31\1\uffff\1\32",
            "\1\34\1\35",
            "\1\36\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\43\1\52\1\uffff\1\44\1\45\1\46\1\47\33\uffff\1\50\1\51",
            "\1\33\4\uffff\1\32",
            "\1\53\44\uffff\1\33\4\uffff\1\32",
            "\1\54",
            "\1\35",
            "\1\6\1\uffff\1\7\1\3\1\uffff\1\3\1\uffff\1\10\1\11\1\12\1"+
            "\13\1\1\52\uffff\1\14\1\15\21\uffff\1\3",
            "\1\37",
            "\1\6\1\uffff\1\7\1\3\1\uffff\1\3\1\uffff\1\10\1\11\1\12\1"+
            "\13\1\1\52\uffff\1\14\1\15\21\uffff\1\3",
            "\1\3\2\uffff\1\3\1\uffff\1\3\5\uffff\1\1\75\uffff\1\3",
            "\1\3\2\uffff\1\3\1\uffff\1\3\5\uffff\1\1\75\uffff\1\3",
            "\1\33\1\uffff\1\30\1\31\1\uffff\1\32",
            "\1\55",
            "\1\55",
            "\1\55",
            "\1\55",
            "\1\55",
            "\1\56",
            "\1\56",
            "\1\57",
            "\1\62\1\uffff\1\33\1\uffff\1\60\1\61\1\uffff\1\32",
            "\1\6\1\uffff\1\7\1\3\1\uffff\1\3\1\uffff\1\10\1\11\1\12\1"+
            "\13\1\1\52\uffff\1\14\1\15\21\uffff\1\3",
            "\1\33\2\uffff\1\31\1\uffff\1\32",
            "\1\55",
            "\1\55",
            "\1\63\1\72\1\uffff\1\64\1\65\1\66\1\67\33\uffff\1\70\1\71",
            "\1\33\4\uffff\1\32",
            "\1\73",
            "\1\74",
            "\1\74",
            "\1\74",
            "\1\74",
            "\1\74",
            "\1\75",
            "\1\75",
            "\1\76",
            "\1\33\1\uffff\1\60\1\61\1\uffff\1\32",
            "\1\33\2\uffff\1\61\1\uffff\1\32",
            "\1\74",
            "\1\74"
    };

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "()* loopback of 862:1: (this___NoptrDeclarator_1= rule__NoptrDeclarator )*";
        }
    }
    static final String DFA48_eotS =
        "\55\uffff";
    static final String DFA48_eofS =
        "\1\uffff\1\52\1\54\52\uffff";
    static final String DFA48_minS =
        "\1\60\2\52\52\uffff";
    static final String DFA48_maxS =
        "\1\132\2\70\52\uffff";
    static final String DFA48_acceptS =
        "\3\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1"+
        "\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34"+
        "\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51"+
        "\1\52\1\3\1\1\1\4\1\2";
    static final String DFA48_specialS =
        "\55\uffff}>";
    static final String[] DFA48_transitionS = {
            "\1\44\2\uffff\1\11\1\40\1\46\1\5\1\uffff\1\16\1\17\1\1\1\2"+
            "\1\3\1\4\1\6\1\7\1\10\1\12\1\13\1\14\1\15\1\20\1\21\1\22\1\23"+
            "\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37"+
            "\1\41\1\42\1\43\1\45\1\47\1\50",
            "\1\51\15\uffff\1\52",
            "\1\53\15\uffff\1\54",
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

    static final short[] DFA48_eot = DFA.unpackEncodedString(DFA48_eotS);
    static final short[] DFA48_eof = DFA.unpackEncodedString(DFA48_eofS);
    static final char[] DFA48_min = DFA.unpackEncodedStringToUnsignedChars(DFA48_minS);
    static final char[] DFA48_max = DFA.unpackEncodedStringToUnsignedChars(DFA48_maxS);
    static final short[] DFA48_accept = DFA.unpackEncodedString(DFA48_acceptS);
    static final short[] DFA48_special = DFA.unpackEncodedString(DFA48_specialS);
    static final short[][] DFA48_transition;

    static {
        int numStates = DFA48_transitionS.length;
        DFA48_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA48_transition[i] = DFA.unpackEncodedString(DFA48_transitionS[i]);
        }
    }

    class DFA48 extends DFA {

        public DFA48(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 48;
            this.eot = DFA48_eot;
            this.eof = DFA48_eof;
            this.min = DFA48_min;
            this.max = DFA48_max;
            this.accept = DFA48_accept;
            this.special = DFA48_special;
            this.transition = DFA48_transition;
        }
        public String getDescription() {
            return "1432:1: (kw= 'new' | kw= 'delete' | (kw= 'new' kw= '[' kw= ']' ) | (kw= 'delete' kw= '[' kw= ']' ) | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= '^' | kw= '&' | kw= '|' | kw= '~' | kw= '!' | kw= '=' | kw= '<' | kw= '>' | kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' | kw= '^=' | kw= '&=' | kw= '|=' | kw= '<<' | kw= '>>' | kw= '>>=' | kw= '<<=' | kw= '==' | kw= '!=' | kw= '<=' | kw= '>=' | kw= '&&' | kw= '||' | kw= '++' | kw= '--' | kw= ',' | kw= '->*' | kw= '->' | kw= '()' | kw= '[]' )";
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
    public static final BitSet FOLLOW_ruleNamespaceBody_in_entryRuleNamespaceBody579 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamespaceBody590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleNamespaceBody637 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_ruleQualifiedNamespaceSpecifier_in_entryRuleQualifiedNamespaceSpecifier686 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNamespaceSpecifier697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleQualifiedNamespaceSpecifier736 = new BitSet(new long[]{0x0000000000000040L,0x0000008000000000L});
    public static final BitSet FOLLOW_ruleNestedNameSpecifier_in_ruleQualifiedNamespaceSpecifier761 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedNamespaceSpecifier783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeSpecifier_in_entryRuleAttributeSpecifier837 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeSpecifier848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleAttributeSpecifier887 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleAttributeSpecifier900 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleAttributeList_in_ruleAttributeSpecifier922 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleAttributeSpecifier940 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleAttributeSpecifier953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlignmentSpecifier_in_ruleAttributeSpecifier982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlignmentSpecifier_in_entryRuleAlignmentSpecifier1028 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlignmentSpecifier1039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleAlignmentSpecifier1078 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleAlignmentSpecifier1091 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_ruleTypeId_in_ruleAlignmentSpecifier1113 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_46_in_ruleAlignmentSpecifier1132 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleAlignmentSpecifier1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleAlignmentSpecifier1168 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleAlignmentSpecifier1181 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_ruleAlignmentExpression_in_ruleAlignmentSpecifier1203 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_46_in_ruleAlignmentSpecifier1222 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleAlignmentSpecifier1237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeList_in_entryRuleAttributeList1279 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeList1290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleAttributeList1338 = new BitSet(new long[]{0x0001400000000002L});
    public static final BitSet FOLLOW_46_in_ruleAttributeList1357 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_ruleAttributeList1374 = new BitSet(new long[]{0x0001000000000042L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleAttributeList1397 = new BitSet(new long[]{0x0001400000000002L});
    public static final BitSet FOLLOW_46_in_ruleAttributeList1416 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute1463 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeToken_in_ruleAttribute1521 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_ruleAttributeArgumentClause_in_ruleAttribute1549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeToken_in_entryRuleAttributeToken1597 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeToken1608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttributeToken1649 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleAttributeToken1667 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttributeToken1684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeArgumentClause_in_entryRuleAttributeArgumentClause1730 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeArgumentClause1741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleAttributeArgumentClause1779 = new BitSet(new long[]{0x000080C0000007B0L});
    public static final BitSet FOLLOW_ruleToken_in_ruleAttributeArgumentClause1801 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleAttributeArgumentClause1819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitDeclarator_in_entryRuleInitDeclarator1862 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInitDeclarator1873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarator_in_ruleInitDeclarator1920 = new BitSet(new long[]{0x0000000000000002L,0x0008000000000000L});
    public static final BitSet FOLLOW_ruleInitializer_in_ruleInitDeclarator1948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarator_in_entryRuleDeclarator1996 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclarator2007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePtrOperator_in_ruleDeclarator2056 = new BitSet(new long[]{0x0058620000000000L,0x0004009000000000L});
    public static final BitSet FOLLOW_ruleNoptrDeclarator_in_ruleDeclarator2085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoptrDeclarator_in_ruleDeclarator2120 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_ruleParametersAndQualifiers_in_ruleDeclarator2148 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_ruleTrailingReturnType_in_ruleDeclarator2175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePtrDeclarator_in_entryRulePtrDeclarator2224 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePtrDeclarator2235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePtrOperator_in_rulePtrDeclarator2283 = new BitSet(new long[]{0x0058620000000000L,0x0004009000000000L});
    public static final BitSet FOLLOW_ruleNoptrDeclarator_in_rulePtrDeclarator2312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoptrDeclarator_in_entryRuleNoptrDeclarator2358 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoptrDeclarator2369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule_NoptrDeclarator_in_ruleNoptrDeclarator2416 = new BitSet(new long[]{0x0000240000000002L});
    public static final BitSet FOLLOW_rule__NoptrDeclarator_in_ruleNoptrDeclarator2444 = new BitSet(new long[]{0x0000240000000002L});
    public static final BitSet FOLLOW_rule_NoptrDeclarator_in_entryRule_NoptrDeclarator2492 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRule_NoptrDeclarator2503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaratorId_in_rule_NoptrDeclarator2551 = new BitSet(new long[]{0x0000140000000002L});
    public static final BitSet FOLLOW_ruleAttributeSpecifier_in_rule_NoptrDeclarator2579 = new BitSet(new long[]{0x0000140000000002L});
    public static final BitSet FOLLOW_45_in_rule_NoptrDeclarator2607 = new BitSet(new long[]{0x0058620000000000L,0x0004009000000000L});
    public static final BitSet FOLLOW_rulePtrDeclarator_in_rule_NoptrDeclarator2629 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_rule_NoptrDeclarator2647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoptrDeclarator_in_entryRule__NoptrDeclarator2689 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRule__NoptrDeclarator2700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParametersAndQualifiers_in_rule__NoptrDeclarator2747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__NoptrDeclarator2772 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_ruleConstantExpression_in_rule__NoptrDeclarator2794 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_rule__NoptrDeclarator2812 = new BitSet(new long[]{0x0000140000000002L});
    public static final BitSet FOLLOW_ruleAttributeSpecifier_in_rule__NoptrDeclarator2835 = new BitSet(new long[]{0x0000140000000002L});
    public static final BitSet FOLLOW_ruleParametersAndQualifiers_in_entryRuleParametersAndQualifiers2884 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParametersAndQualifiers2895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleParametersAndQualifiers2933 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_ruleParameterDeclarationClause_in_ruleParametersAndQualifiers2955 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleParametersAndQualifiers2973 = new BitSet(new long[]{0x001E140000000002L,0x0000000300000000L});
    public static final BitSet FOLLOW_ruleAttributeSpecifier_in_ruleParametersAndQualifiers2996 = new BitSet(new long[]{0x001E140000000002L,0x0000000300000000L});
    public static final BitSet FOLLOW_49_in_ruleParametersAndQualifiers3017 = new BitSet(new long[]{0x001E000000000002L,0x0000000300000000L});
    public static final BitSet FOLLOW_50_in_ruleParametersAndQualifiers3036 = new BitSet(new long[]{0x001E000000000002L,0x0000000300000000L});
    public static final BitSet FOLLOW_51_in_ruleParametersAndQualifiers3052 = new BitSet(new long[]{0x0018000000000002L,0x0000000300000000L});
    public static final BitSet FOLLOW_52_in_ruleParametersAndQualifiers3071 = new BitSet(new long[]{0x0018000000000002L,0x0000000300000000L});
    public static final BitSet FOLLOW_ruleExceptionSpecification_in_ruleParametersAndQualifiers3096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrailingReturnType_in_entryRuleTrailingReturnType3144 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrailingReturnType3155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleTrailingReturnType3193 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_ruleTrailingTypeSpecifier_in_ruleTrailingReturnType3216 = new BitSet(new long[]{0x0000000000000002L,0x0002080000000000L});
    public static final BitSet FOLLOW_ruleAbstractDeclarator_in_ruleTrailingReturnType3246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePtrOperator_in_entryRulePtrOperator3294 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePtrOperator3305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rulePtrOperator3344 = new BitSet(new long[]{0x0006140000000002L});
    public static final BitSet FOLLOW_ruleAttributeSpecifier_in_rulePtrOperator3367 = new BitSet(new long[]{0x0006140000000002L});
    public static final BitSet FOLLOW_49_in_rulePtrOperator3388 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_50_in_rulePtrOperator3407 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_51_in_rulePtrOperator3430 = new BitSet(new long[]{0x0000140000000002L});
    public static final BitSet FOLLOW_ruleAttributeSpecifier_in_rulePtrOperator3453 = new BitSet(new long[]{0x0000140000000002L});
    public static final BitSet FOLLOW_52_in_rulePtrOperator3481 = new BitSet(new long[]{0x0000140000000002L});
    public static final BitSet FOLLOW_ruleAttributeSpecifier_in_rulePtrOperator3504 = new BitSet(new long[]{0x0000140000000002L});
    public static final BitSet FOLLOW_41_in_rulePtrOperator3533 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_ruleNestedNameSpecifier_in_rulePtrOperator3557 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_rulePtrOperator3575 = new BitSet(new long[]{0x0006140000000002L});
    public static final BitSet FOLLOW_ruleAttributeSpecifier_in_rulePtrOperator3598 = new BitSet(new long[]{0x0006140000000002L});
    public static final BitSet FOLLOW_49_in_rulePtrOperator3619 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_50_in_rulePtrOperator3638 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_ruleDeclaratorId_in_entryRuleDeclaratorId3682 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaratorId3693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleDeclaratorId3733 = new BitSet(new long[]{0x0000400000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_ruleIdExpression_in_ruleDeclaratorId3757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleDeclaratorId3784 = new BitSet(new long[]{0x0000420000000000L,0x0004009000000000L});
    public static final BitSet FOLLOW_ruleNestedNameSpecifier_in_ruleDeclaratorId3809 = new BitSet(new long[]{0x0000420000000000L,0x0004009000000000L});
    public static final BitSet FOLLOW_ruleClassName_in_ruleDeclaratorId3838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperatorFunctionId_in_entryRuleOperatorFunctionId3885 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperatorFunctionId3896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleOperatorFunctionId3934 = new BitSet(new long[]{0xFF79000000000000L,0x0000000007FFFFFFL});
    public static final BitSet FOLLOW_ruleOverloadableOperator_in_ruleOperatorFunctionId3956 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_ruleOperatorFunctionId3975 = new BitSet(new long[]{0x0200400000000000L,0x0000001C00000000L});
    public static final BitSet FOLLOW_ruleTemplateArgument_in_ruleOperatorFunctionId3998 = new BitSet(new long[]{0x0200400000000000L,0x0000001C00000000L});
    public static final BitSet FOLLOW_57_in_ruleOperatorFunctionId4018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOverloadableOperator_in_entryRuleOverloadableOperator4061 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOverloadableOperator4072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleOverloadableOperator4110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleOverloadableOperator4129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleOverloadableOperator4149 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleOverloadableOperator4162 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleOverloadableOperator4175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleOverloadableOperator4196 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleOverloadableOperator4209 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleOverloadableOperator4222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleOverloadableOperator4242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleOverloadableOperator4261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleOverloadableOperator4280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleOverloadableOperator4299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleOverloadableOperator4318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleOverloadableOperator4337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleOverloadableOperator4356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleOverloadableOperator4375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleOverloadableOperator4394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleOverloadableOperator4413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleOverloadableOperator4432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleOverloadableOperator4451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleOverloadableOperator4470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleOverloadableOperator4489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleOverloadableOperator4508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleOverloadableOperator4527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleOverloadableOperator4546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleOverloadableOperator4565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleOverloadableOperator4584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleOverloadableOperator4603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleOverloadableOperator4622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleOverloadableOperator4641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleOverloadableOperator4660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleOverloadableOperator4679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleOverloadableOperator4698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleOverloadableOperator4717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleOverloadableOperator4736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleOverloadableOperator4755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleOverloadableOperator4774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleOverloadableOperator4793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleOverloadableOperator4812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleOverloadableOperator4831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleOverloadableOperator4850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleOverloadableOperator4869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleOverloadableOperator4888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleOverloadableOperator4907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleOverloadableOperator4926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleOverloadableOperator4945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralOperatorId_in_entryRuleLiteralOperatorId4986 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralOperatorId4997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleLiteralOperatorId5035 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_ruleLiteralOperatorId5048 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_ruleLiteralOperatorId5061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateParameterList_in_entryRuleTemplateParameterList5104 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateParameterList5115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateParameter_in_ruleTemplateParameterList5162 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_ruleTemplateParameterList5181 = new BitSet(new long[]{0x0000000000000000L,0x0000002070000000L});
    public static final BitSet FOLLOW_ruleTemplateParameter_in_ruleTemplateParameterList5203 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_ruleTemplateParameter_in_entryRuleTemplateParameter5251 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateParameter5262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeParameter_in_ruleTemplateParameter5309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleTemplateParameter5342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeParameter_in_entryRuleTypeParameter5388 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeParameter5399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleTypeParameter5438 = new BitSet(new long[]{0x0000400000000042L,0x0000000000000010L});
    public static final BitSet FOLLOW_46_in_ruleTypeParameter5454 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeParameter5472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeParameter5503 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleTypeParameter5523 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_ruleTypeId_in_ruleTypeParameter5545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleTypeParameter5573 = new BitSet(new long[]{0x0000400000000042L,0x0000000000000010L});
    public static final BitSet FOLLOW_46_in_ruleTypeParameter5589 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeParameter5607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeParameter5638 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleTypeParameter5658 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_ruleTypeId_in_ruleTypeParameter5680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleTypeParameter5708 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleTypeParameter5721 = new BitSet(new long[]{0x0000000000000000L,0x0000002070000000L});
    public static final BitSet FOLLOW_ruleTemplateParameterList_in_ruleTypeParameter5743 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleTypeParameter5761 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_ruleTypeParameter5774 = new BitSet(new long[]{0x0000400000000042L,0x0000000000000010L});
    public static final BitSet FOLLOW_46_in_ruleTypeParameter5790 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeParameter5808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeParameter5839 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleTypeParameter5859 = new BitSet(new long[]{0x0000400000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_ruleIdExpression_in_ruleTypeParameter5881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleTemplateId_in_entryRuleSimpleTemplateId5930 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleTemplateId5941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSimpleTemplateId5981 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleSimpleTemplateId5999 = new BitSet(new long[]{0x0000400000000000L,0x0000001C00000000L});
    public static final BitSet FOLLOW_ruleTemplateArgumentList_in_ruleSimpleTemplateId6021 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleSimpleTemplateId6039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateArgumentList_in_entryRuleTemplateArgumentList6082 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateArgumentList6093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateArgument_in_ruleTemplateArgumentList6140 = new BitSet(new long[]{0x0001400000000002L});
    public static final BitSet FOLLOW_46_in_ruleTemplateArgumentList6159 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_ruleTemplateArgumentList6175 = new BitSet(new long[]{0x0000400000000000L,0x0000001C00000000L});
    public static final BitSet FOLLOW_ruleTemplateArgument_in_ruleTemplateArgumentList6197 = new BitSet(new long[]{0x0001400000000002L});
    public static final BitSet FOLLOW_46_in_ruleTemplateArgumentList6216 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_ruleTemplateArgument_in_entryRuleTemplateArgument6261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateArgument6272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantExpression_in_ruleTemplateArgument6319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeId_in_ruleTemplateArgument6352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdExpression_in_ruleTemplateArgument6385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHandler_in_entryRuleHandler6441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHandler6452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleHandler6490 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleHandler6503 = new BitSet(new long[]{0x0000540000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_ruleExceptionDeclaration_in_ruleHandler6525 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleHandler6543 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_ruleCompoundStatement_in_ruleHandler6565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExceptionDeclaration_in_entryRuleExceptionDeclaration6611 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExceptionDeclaration6622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeSpecifier_in_ruleExceptionDeclaration6671 = new BitSet(new long[]{0x0000140000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_ruleTypeSpecifier_in_ruleExceptionDeclaration6701 = new BitSet(new long[]{0x0058760000000002L,0x00040C9000000000L});
    public static final BitSet FOLLOW_ruleDeclarator_in_ruleExceptionDeclaration6731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractDeclarator_in_ruleExceptionDeclaration6765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleExceptionDeclaration6793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExceptionSpecification_in_entryRuleExceptionSpecification6836 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExceptionSpecification6847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDynamicExceptionSpecification_in_ruleExceptionSpecification6894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoexceptSpecification_in_ruleExceptionSpecification6927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDynamicExceptionSpecification_in_entryRuleDynamicExceptionSpecification6973 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDynamicExceptionSpecification6984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleDynamicExceptionSpecification7022 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleDynamicExceptionSpecification7035 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_ruleTypeIdList_in_ruleDynamicExceptionSpecification7057 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleDynamicExceptionSpecification7075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoexceptSpecification_in_entryRuleNoexceptSpecification7116 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoexceptSpecification7127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleNoexceptSpecification7165 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_ruleNoexceptSpecification7179 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_ruleConstantExpression_in_ruleNoexceptSpecification7201 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleNoexceptSpecification7219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantExpression_in_entryRuleConstantExpression7262 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantExpression7273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_ruleConstantExpression7310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeId_in_entryRuleTypeId7350 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeId7361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_ruleTypeId7398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdExpression_in_entryRuleIdExpression7438 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdExpression7449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_ruleIdExpression7486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_entryRuleParameterDeclaration7526 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterDeclaration7537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_ruleParameterDeclaration7574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration7614 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration7625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_ruleDeclaration7662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNestedNameSpecifier_in_entryRuleNestedNameSpecifier7702 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNestedNameSpecifier7713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_ruleNestedNameSpecifier7750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression7790 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignmentExpression7801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_ruleAssignmentExpression7838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlignmentExpression_in_entryRuleAlignmentExpression7878 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlignmentExpression7889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_ruleAlignmentExpression7926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeSpecifier_in_entryRuleTypeSpecifier7966 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeSpecifier7977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_ruleTypeSpecifier8014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractDeclarator_in_entryRuleAbstractDeclarator8054 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractDeclarator8065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_ruleAbstractDeclarator8102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundStatement_in_entryRuleCompoundStatement8142 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompoundStatement8153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_ruleCompoundStatement8190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCtorInitializer_in_entryRuleCtorInitializer8230 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCtorInitializer8241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_ruleCtorInitializer8278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeIdList_in_entryRuleTypeIdList8318 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeIdList8329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_ruleTypeIdList8366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnqualifiedId_in_entryRuleUnqualifiedId8406 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnqualifiedId8417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_ruleUnqualifiedId8454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclarationClause_in_entryRuleParameterDeclarationClause8494 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterDeclarationClause8505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_ruleParameterDeclarationClause8542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrailingTypeSpecifier_in_entryRuleTrailingTypeSpecifier8582 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrailingTypeSpecifier8593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_ruleTrailingTypeSpecifier8630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassName_in_entryRuleClassName8670 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassName8681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_ruleClassName8718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitializer_in_entryRuleInitializer8758 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInitializer8769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_ruleInitializer8806 = new BitSet(new long[]{0x0000000000000002L});

}