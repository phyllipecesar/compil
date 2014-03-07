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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_IDENTIFIER", "RULE_HEADERNAME", "RULE_PPNUMBER", "RULE_PPOPORPUNC", "RULE_STRING", "RULE_INTEGERLITERAL", "RULE_BOOLEANLITERAL", "RULE_POINTERLITERAL", "RULE_LITERAL", "RULE_KEYWORD", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'\\n'", "'\\r\\n'", "'#if'", "'#ifdef'", "'#ifndef'", "'#elif'", "'=='", "'#else'", "'#endif'", "'#include'", "'#define'", "')'", "'#undef'", "'#line'", "'#error'", "'#pragma'", "'#'", "'('"
    };
    public static final int RULE_ID=14;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=19;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_INTEGERLITERAL=9;
    public static final int RULE_IDENTIFIER=4;
    public static final int RULE_SL_COMMENT=17;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=16;
    public static final int RULE_BOOLEANLITERAL=10;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=8;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int RULE_POINTERLITERAL=11;
    public static final int RULE_HEADERNAME=5;
    public static final int T__37=37;
    public static final int RULE_KEYWORD=13;
    public static final int RULE_INT=15;
    public static final int RULE_PPOPORPUNC=7;
    public static final int RULE_PPNUMBER=6;
    public static final int RULE_WS=18;
    public static final int RULE_LITERAL=12;

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:76:1: ruleModel returns [EObject current=null] : ( (lv_greetings_0_0= rulepreprocessing_file ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_greetings_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:79:28: ( ( (lv_greetings_0_0= rulepreprocessing_file ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:1: ( (lv_greetings_0_0= rulepreprocessing_file ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:1: ( (lv_greetings_0_0= rulepreprocessing_file ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:81:1: (lv_greetings_0_0= rulepreprocessing_file )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:81:1: (lv_greetings_0_0= rulepreprocessing_file )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:82:3: lv_greetings_0_0= rulepreprocessing_file
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getGreetingsPreprocessing_fileParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_rulepreprocessing_file_in_ruleModel130);
            lv_greetings_0_0=rulepreprocessing_file();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		add(
                   			current, 
                   			"greetings",
                    		lv_greetings_0_0, 
                    		"preprocessing_file");
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


    // $ANTLR start "entryRulenew_line"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:108:1: entryRulenew_line returns [String current=null] : iv_rulenew_line= rulenew_line EOF ;
    public final String entryRulenew_line() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulenew_line = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:109:2: (iv_rulenew_line= rulenew_line EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:110:2: iv_rulenew_line= rulenew_line EOF
            {
             newCompositeNode(grammarAccess.getNew_lineRule()); 
            pushFollow(FOLLOW_rulenew_line_in_entryRulenew_line168);
            iv_rulenew_line=rulenew_line();

            state._fsp--;

             current =iv_rulenew_line.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulenew_line179); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulenew_line"


    // $ANTLR start "rulenew_line"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:117:1: rulenew_line returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '\\n' | kw= '\\r\\n' ) ;
    public final AntlrDatatypeRuleToken rulenew_line() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:120:28: ( (kw= '\\n' | kw= '\\r\\n' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:121:1: (kw= '\\n' | kw= '\\r\\n' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:121:1: (kw= '\\n' | kw= '\\r\\n' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==20) ) {
                alt1=1;
            }
            else if ( (LA1_0==21) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:122:2: kw= '\\n'
                    {
                    kw=(Token)match(input,20,FOLLOW_20_in_rulenew_line217); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNew_lineAccess().getControl000aKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:129:2: kw= '\\r\\n'
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_rulenew_line236); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNew_lineAccess().getControl000dControl000aKeyword_1()); 
                        

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
    // $ANTLR end "rulenew_line"


    // $ANTLR start "entryRulepreprocessing_file"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:142:1: entryRulepreprocessing_file returns [String current=null] : iv_rulepreprocessing_file= rulepreprocessing_file EOF ;
    public final String entryRulepreprocessing_file() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulepreprocessing_file = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:143:2: (iv_rulepreprocessing_file= rulepreprocessing_file EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:144:2: iv_rulepreprocessing_file= rulepreprocessing_file EOF
            {
             newCompositeNode(grammarAccess.getPreprocessing_fileRule()); 
            pushFollow(FOLLOW_rulepreprocessing_file_in_entryRulepreprocessing_file277);
            iv_rulepreprocessing_file=rulepreprocessing_file();

            state._fsp--;

             current =iv_rulepreprocessing_file.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulepreprocessing_file288); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulepreprocessing_file"


    // $ANTLR start "rulepreprocessing_file"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:151:1: rulepreprocessing_file returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_group_0= rulegroup )? ;
    public final AntlrDatatypeRuleToken rulepreprocessing_file() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_group_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:154:28: ( (this_group_0= rulegroup )? )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:155:1: (this_group_0= rulegroup )?
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:155:1: (this_group_0= rulegroup )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_IDENTIFIER && LA2_0<=RULE_PPOPORPUNC)||(LA2_0>=20 && LA2_0<=24)||(LA2_0>=29 && LA2_0<=30)||(LA2_0>=32 && LA2_0<=36)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:156:5: this_group_0= rulegroup
                    {
                     
                            newCompositeNode(grammarAccess.getPreprocessing_fileAccess().getGroupParserRuleCall()); 
                        
                    pushFollow(FOLLOW_rulegroup_in_rulepreprocessing_file335);
                    this_group_0=rulegroup();

                    state._fsp--;


                    		current.merge(this_group_0);
                        
                     
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
    // $ANTLR end "rulepreprocessing_file"


    // $ANTLR start "entryRulegroup"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:174:1: entryRulegroup returns [String current=null] : iv_rulegroup= rulegroup EOF ;
    public final String entryRulegroup() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulegroup = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:175:2: (iv_rulegroup= rulegroup EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:176:2: iv_rulegroup= rulegroup EOF
            {
             newCompositeNode(grammarAccess.getGroupRule()); 
            pushFollow(FOLLOW_rulegroup_in_entryRulegroup382);
            iv_rulegroup=rulegroup();

            state._fsp--;

             current =iv_rulegroup.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulegroup393); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulegroup"


    // $ANTLR start "rulegroup"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:183:1: rulegroup returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_group_part_0= rulegroup_part )+ ;
    public final AntlrDatatypeRuleToken rulegroup() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_group_part_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:186:28: ( (this_group_part_0= rulegroup_part )+ )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:187:1: (this_group_part_0= rulegroup_part )+
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:187:1: (this_group_part_0= rulegroup_part )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=RULE_IDENTIFIER && LA3_0<=RULE_PPOPORPUNC)||(LA3_0>=20 && LA3_0<=24)||(LA3_0>=29 && LA3_0<=30)||(LA3_0>=32 && LA3_0<=36)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:188:5: this_group_part_0= rulegroup_part
            	    {
            	     
            	            newCompositeNode(grammarAccess.getGroupAccess().getGroup_partParserRuleCall()); 
            	        
            	    pushFollow(FOLLOW_rulegroup_part_in_rulegroup440);
            	    this_group_part_0=rulegroup_part();

            	    state._fsp--;


            	    		current.merge(this_group_part_0);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
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
    // $ANTLR end "rulegroup"


    // $ANTLR start "entryRulegroup_part"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:206:1: entryRulegroup_part returns [String current=null] : iv_rulegroup_part= rulegroup_part EOF ;
    public final String entryRulegroup_part() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulegroup_part = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:207:2: (iv_rulegroup_part= rulegroup_part EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:208:2: iv_rulegroup_part= rulegroup_part EOF
            {
             newCompositeNode(grammarAccess.getGroup_partRule()); 
            pushFollow(FOLLOW_rulegroup_part_in_entryRulegroup_part487);
            iv_rulegroup_part=rulegroup_part();

            state._fsp--;

             current =iv_rulegroup_part.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulegroup_part498); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulegroup_part"


    // $ANTLR start "rulegroup_part"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:215:1: rulegroup_part returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_pp_tokens_0= rulepp_tokens )? this_new_line_1= rulenew_line ) | this_if_action_2= ruleif_action | this_control_line_3= rulecontrol_line ) ;
    public final AntlrDatatypeRuleToken rulegroup_part() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_pp_tokens_0 = null;

        AntlrDatatypeRuleToken this_new_line_1 = null;

        AntlrDatatypeRuleToken this_if_action_2 = null;

        AntlrDatatypeRuleToken this_control_line_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:218:28: ( ( ( (this_pp_tokens_0= rulepp_tokens )? this_new_line_1= rulenew_line ) | this_if_action_2= ruleif_action | this_control_line_3= rulecontrol_line ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:219:1: ( ( (this_pp_tokens_0= rulepp_tokens )? this_new_line_1= rulenew_line ) | this_if_action_2= ruleif_action | this_control_line_3= rulecontrol_line )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:219:1: ( ( (this_pp_tokens_0= rulepp_tokens )? this_new_line_1= rulenew_line ) | this_if_action_2= ruleif_action | this_control_line_3= rulecontrol_line )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_IDENTIFIER:
            case RULE_HEADERNAME:
            case RULE_PPNUMBER:
            case RULE_PPOPORPUNC:
            case 20:
            case 21:
                {
                alt5=1;
                }
                break;
            case 22:
            case 23:
            case 24:
                {
                alt5=2;
                }
                break;
            case 29:
            case 30:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:219:2: ( (this_pp_tokens_0= rulepp_tokens )? this_new_line_1= rulenew_line )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:219:2: ( (this_pp_tokens_0= rulepp_tokens )? this_new_line_1= rulenew_line )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:219:3: (this_pp_tokens_0= rulepp_tokens )? this_new_line_1= rulenew_line
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:219:3: (this_pp_tokens_0= rulepp_tokens )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( ((LA4_0>=RULE_IDENTIFIER && LA4_0<=RULE_PPOPORPUNC)) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:220:5: this_pp_tokens_0= rulepp_tokens
                            {
                             
                                    newCompositeNode(grammarAccess.getGroup_partAccess().getPp_tokensParserRuleCall_0_0()); 
                                
                            pushFollow(FOLLOW_rulepp_tokens_in_rulegroup_part547);
                            this_pp_tokens_0=rulepp_tokens();

                            state._fsp--;


                            		current.merge(this_pp_tokens_0);
                                
                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                     
                            newCompositeNode(grammarAccess.getGroup_partAccess().getNew_lineParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_rulenew_line_in_rulegroup_part576);
                    this_new_line_1=rulenew_line();

                    state._fsp--;


                    		current.merge(this_new_line_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:243:5: this_if_action_2= ruleif_action
                    {
                     
                            newCompositeNode(grammarAccess.getGroup_partAccess().getIf_actionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleif_action_in_rulegroup_part610);
                    this_if_action_2=ruleif_action();

                    state._fsp--;


                    		current.merge(this_if_action_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:255:5: this_control_line_3= rulecontrol_line
                    {
                     
                            newCompositeNode(grammarAccess.getGroup_partAccess().getControl_lineParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_rulecontrol_line_in_rulegroup_part643);
                    this_control_line_3=rulecontrol_line();

                    state._fsp--;


                    		current.merge(this_control_line_3);
                        
                     
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
    // $ANTLR end "rulegroup_part"


    // $ANTLR start "entryRuleif_action"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:273:1: entryRuleif_action returns [String current=null] : iv_ruleif_action= ruleif_action EOF ;
    public final String entryRuleif_action() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleif_action = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:274:2: (iv_ruleif_action= ruleif_action EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:275:2: iv_ruleif_action= ruleif_action EOF
            {
             newCompositeNode(grammarAccess.getIf_actionRule()); 
            pushFollow(FOLLOW_ruleif_action_in_entryRuleif_action689);
            iv_ruleif_action=ruleif_action();

            state._fsp--;

             current =iv_ruleif_action.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleif_action700); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleif_action"


    // $ANTLR start "ruleif_action"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:282:1: ruleif_action returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_if_group_0= ruleif_group (this_elif_groups_1= ruleelif_groups )? (this_else_group_2= ruleelse_group )? this_endif_line_3= ruleendif_line ) ;
    public final AntlrDatatypeRuleToken ruleif_action() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_if_group_0 = null;

        AntlrDatatypeRuleToken this_elif_groups_1 = null;

        AntlrDatatypeRuleToken this_else_group_2 = null;

        AntlrDatatypeRuleToken this_endif_line_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:285:28: ( (this_if_group_0= ruleif_group (this_elif_groups_1= ruleelif_groups )? (this_else_group_2= ruleelse_group )? this_endif_line_3= ruleendif_line ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:286:1: (this_if_group_0= ruleif_group (this_elif_groups_1= ruleelif_groups )? (this_else_group_2= ruleelse_group )? this_endif_line_3= ruleendif_line )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:286:1: (this_if_group_0= ruleif_group (this_elif_groups_1= ruleelif_groups )? (this_else_group_2= ruleelse_group )? this_endif_line_3= ruleendif_line )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:287:5: this_if_group_0= ruleif_group (this_elif_groups_1= ruleelif_groups )? (this_else_group_2= ruleelse_group )? this_endif_line_3= ruleendif_line
            {
             
                    newCompositeNode(grammarAccess.getIf_actionAccess().getIf_groupParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleif_group_in_ruleif_action747);
            this_if_group_0=ruleif_group();

            state._fsp--;


            		current.merge(this_if_group_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:297:1: (this_elif_groups_1= ruleelif_groups )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==25) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:298:5: this_elif_groups_1= ruleelif_groups
                    {
                     
                            newCompositeNode(grammarAccess.getIf_actionAccess().getElif_groupsParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleelif_groups_in_ruleif_action775);
                    this_elif_groups_1=ruleelif_groups();

                    state._fsp--;


                    		current.merge(this_elif_groups_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:308:3: (this_else_group_2= ruleelse_group )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==27) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:309:5: this_else_group_2= ruleelse_group
                    {
                     
                            newCompositeNode(grammarAccess.getIf_actionAccess().getElse_groupParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleelse_group_in_ruleif_action805);
                    this_else_group_2=ruleelse_group();

                    state._fsp--;


                    		current.merge(this_else_group_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getIf_actionAccess().getEndif_lineParserRuleCall_3()); 
                
            pushFollow(FOLLOW_ruleendif_line_in_ruleif_action834);
            this_endif_line_3=ruleendif_line();

            state._fsp--;


            		current.merge(this_endif_line_3);
                
             
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
    // $ANTLR end "ruleif_action"


    // $ANTLR start "entryRuleif_group"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:338:1: entryRuleif_group returns [String current=null] : iv_ruleif_group= ruleif_group EOF ;
    public final String entryRuleif_group() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleif_group = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:339:2: (iv_ruleif_group= ruleif_group EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:340:2: iv_ruleif_group= ruleif_group EOF
            {
             newCompositeNode(grammarAccess.getIf_groupRule()); 
            pushFollow(FOLLOW_ruleif_group_in_entryRuleif_group880);
            iv_ruleif_group=ruleif_group();

            state._fsp--;

             current =iv_ruleif_group.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleif_group891); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleif_group"


    // $ANTLR start "ruleif_group"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:347:1: ruleif_group returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '#if' this_constant_expression_1= ruleconstant_expression this_new_line_2= rulenew_line (this_group_3= rulegroup )? ) | (kw= '#ifdef' this_IDENTIFIER_5= RULE_IDENTIFIER this_new_line_6= rulenew_line (this_group_7= rulegroup )? ) | (kw= '#ifndef' this_IDENTIFIER_9= RULE_IDENTIFIER this_new_line_10= rulenew_line (this_group_11= rulegroup )? ) ) ;
    public final AntlrDatatypeRuleToken ruleif_group() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_IDENTIFIER_5=null;
        Token this_IDENTIFIER_9=null;
        AntlrDatatypeRuleToken this_constant_expression_1 = null;

        AntlrDatatypeRuleToken this_new_line_2 = null;

        AntlrDatatypeRuleToken this_group_3 = null;

        AntlrDatatypeRuleToken this_new_line_6 = null;

        AntlrDatatypeRuleToken this_group_7 = null;

        AntlrDatatypeRuleToken this_new_line_10 = null;

        AntlrDatatypeRuleToken this_group_11 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:350:28: ( ( (kw= '#if' this_constant_expression_1= ruleconstant_expression this_new_line_2= rulenew_line (this_group_3= rulegroup )? ) | (kw= '#ifdef' this_IDENTIFIER_5= RULE_IDENTIFIER this_new_line_6= rulenew_line (this_group_7= rulegroup )? ) | (kw= '#ifndef' this_IDENTIFIER_9= RULE_IDENTIFIER this_new_line_10= rulenew_line (this_group_11= rulegroup )? ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:351:1: ( (kw= '#if' this_constant_expression_1= ruleconstant_expression this_new_line_2= rulenew_line (this_group_3= rulegroup )? ) | (kw= '#ifdef' this_IDENTIFIER_5= RULE_IDENTIFIER this_new_line_6= rulenew_line (this_group_7= rulegroup )? ) | (kw= '#ifndef' this_IDENTIFIER_9= RULE_IDENTIFIER this_new_line_10= rulenew_line (this_group_11= rulegroup )? ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:351:1: ( (kw= '#if' this_constant_expression_1= ruleconstant_expression this_new_line_2= rulenew_line (this_group_3= rulegroup )? ) | (kw= '#ifdef' this_IDENTIFIER_5= RULE_IDENTIFIER this_new_line_6= rulenew_line (this_group_7= rulegroup )? ) | (kw= '#ifndef' this_IDENTIFIER_9= RULE_IDENTIFIER this_new_line_10= rulenew_line (this_group_11= rulegroup )? ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt11=1;
                }
                break;
            case 23:
                {
                alt11=2;
                }
                break;
            case 24:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:351:2: (kw= '#if' this_constant_expression_1= ruleconstant_expression this_new_line_2= rulenew_line (this_group_3= rulegroup )? )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:351:2: (kw= '#if' this_constant_expression_1= ruleconstant_expression this_new_line_2= rulenew_line (this_group_3= rulegroup )? )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:352:2: kw= '#if' this_constant_expression_1= ruleconstant_expression this_new_line_2= rulenew_line (this_group_3= rulegroup )?
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleif_group930); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getIf_groupAccess().getIfKeyword_0_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getIf_groupAccess().getConstant_expressionParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleconstant_expression_in_ruleif_group952);
                    this_constant_expression_1=ruleconstant_expression();

                    state._fsp--;


                    		current.merge(this_constant_expression_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                     
                            newCompositeNode(grammarAccess.getIf_groupAccess().getNew_lineParserRuleCall_0_2()); 
                        
                    pushFollow(FOLLOW_rulenew_line_in_ruleif_group979);
                    this_new_line_2=rulenew_line();

                    state._fsp--;


                    		current.merge(this_new_line_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:379:1: (this_group_3= rulegroup )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( ((LA8_0>=RULE_IDENTIFIER && LA8_0<=RULE_PPOPORPUNC)||(LA8_0>=20 && LA8_0<=24)||(LA8_0>=29 && LA8_0<=30)||(LA8_0>=32 && LA8_0<=36)) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:380:5: this_group_3= rulegroup
                            {
                             
                                    newCompositeNode(grammarAccess.getIf_groupAccess().getGroupParserRuleCall_0_3()); 
                                
                            pushFollow(FOLLOW_rulegroup_in_ruleif_group1007);
                            this_group_3=rulegroup();

                            state._fsp--;


                            		current.merge(this_group_3);
                                
                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:391:6: (kw= '#ifdef' this_IDENTIFIER_5= RULE_IDENTIFIER this_new_line_6= rulenew_line (this_group_7= rulegroup )? )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:391:6: (kw= '#ifdef' this_IDENTIFIER_5= RULE_IDENTIFIER this_new_line_6= rulenew_line (this_group_7= rulegroup )? )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:392:2: kw= '#ifdef' this_IDENTIFIER_5= RULE_IDENTIFIER this_new_line_6= rulenew_line (this_group_7= rulegroup )?
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleif_group1035); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getIf_groupAccess().getIfdefKeyword_1_0()); 
                        
                    this_IDENTIFIER_5=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleif_group1050); 

                    		current.merge(this_IDENTIFIER_5);
                        
                     
                        newLeafNode(this_IDENTIFIER_5, grammarAccess.getIf_groupAccess().getIDENTIFIERTerminalRuleCall_1_1()); 
                        
                     
                            newCompositeNode(grammarAccess.getIf_groupAccess().getNew_lineParserRuleCall_1_2()); 
                        
                    pushFollow(FOLLOW_rulenew_line_in_ruleif_group1077);
                    this_new_line_6=rulenew_line();

                    state._fsp--;


                    		current.merge(this_new_line_6);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:415:1: (this_group_7= rulegroup )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( ((LA9_0>=RULE_IDENTIFIER && LA9_0<=RULE_PPOPORPUNC)||(LA9_0>=20 && LA9_0<=24)||(LA9_0>=29 && LA9_0<=30)||(LA9_0>=32 && LA9_0<=36)) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:416:5: this_group_7= rulegroup
                            {
                             
                                    newCompositeNode(grammarAccess.getIf_groupAccess().getGroupParserRuleCall_1_3()); 
                                
                            pushFollow(FOLLOW_rulegroup_in_ruleif_group1105);
                            this_group_7=rulegroup();

                            state._fsp--;


                            		current.merge(this_group_7);
                                
                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:427:6: (kw= '#ifndef' this_IDENTIFIER_9= RULE_IDENTIFIER this_new_line_10= rulenew_line (this_group_11= rulegroup )? )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:427:6: (kw= '#ifndef' this_IDENTIFIER_9= RULE_IDENTIFIER this_new_line_10= rulenew_line (this_group_11= rulegroup )? )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:428:2: kw= '#ifndef' this_IDENTIFIER_9= RULE_IDENTIFIER this_new_line_10= rulenew_line (this_group_11= rulegroup )?
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleif_group1133); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getIf_groupAccess().getIfndefKeyword_2_0()); 
                        
                    this_IDENTIFIER_9=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleif_group1148); 

                    		current.merge(this_IDENTIFIER_9);
                        
                     
                        newLeafNode(this_IDENTIFIER_9, grammarAccess.getIf_groupAccess().getIDENTIFIERTerminalRuleCall_2_1()); 
                        
                     
                            newCompositeNode(grammarAccess.getIf_groupAccess().getNew_lineParserRuleCall_2_2()); 
                        
                    pushFollow(FOLLOW_rulenew_line_in_ruleif_group1175);
                    this_new_line_10=rulenew_line();

                    state._fsp--;


                    		current.merge(this_new_line_10);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:451:1: (this_group_11= rulegroup )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( ((LA10_0>=RULE_IDENTIFIER && LA10_0<=RULE_PPOPORPUNC)||(LA10_0>=20 && LA10_0<=24)||(LA10_0>=29 && LA10_0<=30)||(LA10_0>=32 && LA10_0<=36)) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:452:5: this_group_11= rulegroup
                            {
                             
                                    newCompositeNode(grammarAccess.getIf_groupAccess().getGroupParserRuleCall_2_3()); 
                                
                            pushFollow(FOLLOW_rulegroup_in_ruleif_group1203);
                            this_group_11=rulegroup();

                            state._fsp--;


                            		current.merge(this_group_11);
                                
                             
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
    // $ANTLR end "ruleif_group"


    // $ANTLR start "entryRuleelif_groups"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:470:1: entryRuleelif_groups returns [String current=null] : iv_ruleelif_groups= ruleelif_groups EOF ;
    public final String entryRuleelif_groups() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleelif_groups = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:471:2: (iv_ruleelif_groups= ruleelif_groups EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:472:2: iv_ruleelif_groups= ruleelif_groups EOF
            {
             newCompositeNode(grammarAccess.getElif_groupsRule()); 
            pushFollow(FOLLOW_ruleelif_groups_in_entryRuleelif_groups1252);
            iv_ruleelif_groups=ruleelif_groups();

            state._fsp--;

             current =iv_ruleelif_groups.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleelif_groups1263); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleelif_groups"


    // $ANTLR start "ruleelif_groups"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:479:1: ruleelif_groups returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_elif_group_0= ruleelif_group )+ ;
    public final AntlrDatatypeRuleToken ruleelif_groups() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_elif_group_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:482:28: ( (this_elif_group_0= ruleelif_group )+ )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:483:1: (this_elif_group_0= ruleelif_group )+
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:483:1: (this_elif_group_0= ruleelif_group )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==25) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:484:5: this_elif_group_0= ruleelif_group
            	    {
            	     
            	            newCompositeNode(grammarAccess.getElif_groupsAccess().getElif_groupParserRuleCall()); 
            	        
            	    pushFollow(FOLLOW_ruleelif_group_in_ruleelif_groups1310);
            	    this_elif_group_0=ruleelif_group();

            	    state._fsp--;


            	    		current.merge(this_elif_group_0);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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
    // $ANTLR end "ruleelif_groups"


    // $ANTLR start "entryRuleelif_group"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:502:1: entryRuleelif_group returns [String current=null] : iv_ruleelif_group= ruleelif_group EOF ;
    public final String entryRuleelif_group() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleelif_group = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:503:2: (iv_ruleelif_group= ruleelif_group EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:504:2: iv_ruleelif_group= ruleelif_group EOF
            {
             newCompositeNode(grammarAccess.getElif_groupRule()); 
            pushFollow(FOLLOW_ruleelif_group_in_entryRuleelif_group1357);
            iv_ruleelif_group=ruleelif_group();

            state._fsp--;

             current =iv_ruleelif_group.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleelif_group1368); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleelif_group"


    // $ANTLR start "ruleelif_group"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:511:1: ruleelif_group returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '#elif' this_constant_expression_1= ruleconstant_expression this_new_line_2= rulenew_line (this_group_3= rulegroup )? ) ;
    public final AntlrDatatypeRuleToken ruleelif_group() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_constant_expression_1 = null;

        AntlrDatatypeRuleToken this_new_line_2 = null;

        AntlrDatatypeRuleToken this_group_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:514:28: ( (kw= '#elif' this_constant_expression_1= ruleconstant_expression this_new_line_2= rulenew_line (this_group_3= rulegroup )? ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:515:1: (kw= '#elif' this_constant_expression_1= ruleconstant_expression this_new_line_2= rulenew_line (this_group_3= rulegroup )? )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:515:1: (kw= '#elif' this_constant_expression_1= ruleconstant_expression this_new_line_2= rulenew_line (this_group_3= rulegroup )? )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:516:2: kw= '#elif' this_constant_expression_1= ruleconstant_expression this_new_line_2= rulenew_line (this_group_3= rulegroup )?
            {
            kw=(Token)match(input,25,FOLLOW_25_in_ruleelif_group1406); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getElif_groupAccess().getElifKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getElif_groupAccess().getConstant_expressionParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleconstant_expression_in_ruleelif_group1428);
            this_constant_expression_1=ruleconstant_expression();

            state._fsp--;


            		current.merge(this_constant_expression_1);
                
             
                    afterParserOrEnumRuleCall();
                
             
                    newCompositeNode(grammarAccess.getElif_groupAccess().getNew_lineParserRuleCall_2()); 
                
            pushFollow(FOLLOW_rulenew_line_in_ruleelif_group1455);
            this_new_line_2=rulenew_line();

            state._fsp--;


            		current.merge(this_new_line_2);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:543:1: (this_group_3= rulegroup )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=RULE_IDENTIFIER && LA13_0<=RULE_PPOPORPUNC)||(LA13_0>=20 && LA13_0<=24)||(LA13_0>=29 && LA13_0<=30)||(LA13_0>=32 && LA13_0<=36)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:544:5: this_group_3= rulegroup
                    {
                     
                            newCompositeNode(grammarAccess.getElif_groupAccess().getGroupParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_rulegroup_in_ruleelif_group1483);
                    this_group_3=rulegroup();

                    state._fsp--;


                    		current.merge(this_group_3);
                        
                     
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
    // $ANTLR end "ruleelif_group"


    // $ANTLR start "entryRuleconstant_expression"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:562:1: entryRuleconstant_expression returns [String current=null] : iv_ruleconstant_expression= ruleconstant_expression EOF ;
    public final String entryRuleconstant_expression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleconstant_expression = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:563:2: (iv_ruleconstant_expression= ruleconstant_expression EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:564:2: iv_ruleconstant_expression= ruleconstant_expression EOF
            {
             newCompositeNode(grammarAccess.getConstant_expressionRule()); 
            pushFollow(FOLLOW_ruleconstant_expression_in_entryRuleconstant_expression1531);
            iv_ruleconstant_expression=ruleconstant_expression();

            state._fsp--;

             current =iv_ruleconstant_expression.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleconstant_expression1542); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleconstant_expression"


    // $ANTLR start "ruleconstant_expression"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:571:1: ruleconstant_expression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '==' ;
    public final AntlrDatatypeRuleToken ruleconstant_expression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:574:28: (kw= '==' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:576:2: kw= '=='
            {
            kw=(Token)match(input,26,FOLLOW_26_in_ruleconstant_expression1579); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getConstant_expressionAccess().getEqualsSignEqualsSignKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleconstant_expression"


    // $ANTLR start "entryRulepreprocessing_token"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:589:1: entryRulepreprocessing_token returns [String current=null] : iv_rulepreprocessing_token= rulepreprocessing_token EOF ;
    public final String entryRulepreprocessing_token() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulepreprocessing_token = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:590:2: (iv_rulepreprocessing_token= rulepreprocessing_token EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:591:2: iv_rulepreprocessing_token= rulepreprocessing_token EOF
            {
             newCompositeNode(grammarAccess.getPreprocessing_tokenRule()); 
            pushFollow(FOLLOW_rulepreprocessing_token_in_entryRulepreprocessing_token1619);
            iv_rulepreprocessing_token=rulepreprocessing_token();

            state._fsp--;

             current =iv_rulepreprocessing_token.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulepreprocessing_token1630); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulepreprocessing_token"


    // $ANTLR start "rulepreprocessing_token"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:598:1: rulepreprocessing_token returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENTIFIER_0= RULE_IDENTIFIER | this_HEADERNAME_1= RULE_HEADERNAME | this_PPNUMBER_2= RULE_PPNUMBER | this_PPOPorPUNC_3= RULE_PPOPORPUNC ) ;
    public final AntlrDatatypeRuleToken rulepreprocessing_token() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFIER_0=null;
        Token this_HEADERNAME_1=null;
        Token this_PPNUMBER_2=null;
        Token this_PPOPorPUNC_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:601:28: ( (this_IDENTIFIER_0= RULE_IDENTIFIER | this_HEADERNAME_1= RULE_HEADERNAME | this_PPNUMBER_2= RULE_PPNUMBER | this_PPOPorPUNC_3= RULE_PPOPORPUNC ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:602:1: (this_IDENTIFIER_0= RULE_IDENTIFIER | this_HEADERNAME_1= RULE_HEADERNAME | this_PPNUMBER_2= RULE_PPNUMBER | this_PPOPorPUNC_3= RULE_PPOPORPUNC )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:602:1: (this_IDENTIFIER_0= RULE_IDENTIFIER | this_HEADERNAME_1= RULE_HEADERNAME | this_PPNUMBER_2= RULE_PPNUMBER | this_PPOPorPUNC_3= RULE_PPOPORPUNC )
            int alt14=4;
            switch ( input.LA(1) ) {
            case RULE_IDENTIFIER:
                {
                alt14=1;
                }
                break;
            case RULE_HEADERNAME:
                {
                alt14=2;
                }
                break;
            case RULE_PPNUMBER:
                {
                alt14=3;
                }
                break;
            case RULE_PPOPORPUNC:
                {
                alt14=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:602:6: this_IDENTIFIER_0= RULE_IDENTIFIER
                    {
                    this_IDENTIFIER_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulepreprocessing_token1670); 

                    		current.merge(this_IDENTIFIER_0);
                        
                     
                        newLeafNode(this_IDENTIFIER_0, grammarAccess.getPreprocessing_tokenAccess().getIDENTIFIERTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:610:10: this_HEADERNAME_1= RULE_HEADERNAME
                    {
                    this_HEADERNAME_1=(Token)match(input,RULE_HEADERNAME,FOLLOW_RULE_HEADERNAME_in_rulepreprocessing_token1696); 

                    		current.merge(this_HEADERNAME_1);
                        
                     
                        newLeafNode(this_HEADERNAME_1, grammarAccess.getPreprocessing_tokenAccess().getHEADERNAMETerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:618:10: this_PPNUMBER_2= RULE_PPNUMBER
                    {
                    this_PPNUMBER_2=(Token)match(input,RULE_PPNUMBER,FOLLOW_RULE_PPNUMBER_in_rulepreprocessing_token1722); 

                    		current.merge(this_PPNUMBER_2);
                        
                     
                        newLeafNode(this_PPNUMBER_2, grammarAccess.getPreprocessing_tokenAccess().getPPNUMBERTerminalRuleCall_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:626:10: this_PPOPorPUNC_3= RULE_PPOPORPUNC
                    {
                    this_PPOPorPUNC_3=(Token)match(input,RULE_PPOPORPUNC,FOLLOW_RULE_PPOPORPUNC_in_rulepreprocessing_token1748); 

                    		current.merge(this_PPOPorPUNC_3);
                        
                     
                        newLeafNode(this_PPOPorPUNC_3, grammarAccess.getPreprocessing_tokenAccess().getPPOPorPUNCTerminalRuleCall_3()); 
                        

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
    // $ANTLR end "rulepreprocessing_token"


    // $ANTLR start "entryRuleelse_group"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:641:1: entryRuleelse_group returns [String current=null] : iv_ruleelse_group= ruleelse_group EOF ;
    public final String entryRuleelse_group() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleelse_group = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:642:2: (iv_ruleelse_group= ruleelse_group EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:643:2: iv_ruleelse_group= ruleelse_group EOF
            {
             newCompositeNode(grammarAccess.getElse_groupRule()); 
            pushFollow(FOLLOW_ruleelse_group_in_entryRuleelse_group1794);
            iv_ruleelse_group=ruleelse_group();

            state._fsp--;

             current =iv_ruleelse_group.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleelse_group1805); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleelse_group"


    // $ANTLR start "ruleelse_group"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:650:1: ruleelse_group returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '#else' this_new_line_1= rulenew_line (this_group_2= rulegroup )? ) ;
    public final AntlrDatatypeRuleToken ruleelse_group() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_new_line_1 = null;

        AntlrDatatypeRuleToken this_group_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:653:28: ( (kw= '#else' this_new_line_1= rulenew_line (this_group_2= rulegroup )? ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:654:1: (kw= '#else' this_new_line_1= rulenew_line (this_group_2= rulegroup )? )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:654:1: (kw= '#else' this_new_line_1= rulenew_line (this_group_2= rulegroup )? )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:655:2: kw= '#else' this_new_line_1= rulenew_line (this_group_2= rulegroup )?
            {
            kw=(Token)match(input,27,FOLLOW_27_in_ruleelse_group1843); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getElse_groupAccess().getElseKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getElse_groupAccess().getNew_lineParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulenew_line_in_ruleelse_group1865);
            this_new_line_1=rulenew_line();

            state._fsp--;


            		current.merge(this_new_line_1);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:671:1: (this_group_2= rulegroup )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=RULE_IDENTIFIER && LA15_0<=RULE_PPOPORPUNC)||(LA15_0>=20 && LA15_0<=24)||(LA15_0>=29 && LA15_0<=30)||(LA15_0>=32 && LA15_0<=36)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:672:5: this_group_2= rulegroup
                    {
                     
                            newCompositeNode(grammarAccess.getElse_groupAccess().getGroupParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_rulegroup_in_ruleelse_group1893);
                    this_group_2=rulegroup();

                    state._fsp--;


                    		current.merge(this_group_2);
                        
                     
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
    // $ANTLR end "ruleelse_group"


    // $ANTLR start "entryRuleendif_line"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:690:1: entryRuleendif_line returns [String current=null] : iv_ruleendif_line= ruleendif_line EOF ;
    public final String entryRuleendif_line() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleendif_line = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:691:2: (iv_ruleendif_line= ruleendif_line EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:692:2: iv_ruleendif_line= ruleendif_line EOF
            {
             newCompositeNode(grammarAccess.getEndif_lineRule()); 
            pushFollow(FOLLOW_ruleendif_line_in_entryRuleendif_line1941);
            iv_ruleendif_line=ruleendif_line();

            state._fsp--;

             current =iv_ruleendif_line.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleendif_line1952); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleendif_line"


    // $ANTLR start "ruleendif_line"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:699:1: ruleendif_line returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '#endif' this_new_line_1= rulenew_line ) ;
    public final AntlrDatatypeRuleToken ruleendif_line() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_new_line_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:702:28: ( (kw= '#endif' this_new_line_1= rulenew_line ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:703:1: (kw= '#endif' this_new_line_1= rulenew_line )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:703:1: (kw= '#endif' this_new_line_1= rulenew_line )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:704:2: kw= '#endif' this_new_line_1= rulenew_line
            {
            kw=(Token)match(input,28,FOLLOW_28_in_ruleendif_line1990); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEndif_lineAccess().getEndifKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getEndif_lineAccess().getNew_lineParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulenew_line_in_ruleendif_line2012);
            this_new_line_1=rulenew_line();

            state._fsp--;


            		current.merge(this_new_line_1);
                
             
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
    // $ANTLR end "ruleendif_line"


    // $ANTLR start "entryRulecontrol_line"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:728:1: entryRulecontrol_line returns [String current=null] : iv_rulecontrol_line= rulecontrol_line EOF ;
    public final String entryRulecontrol_line() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecontrol_line = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:729:2: (iv_rulecontrol_line= rulecontrol_line EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:730:2: iv_rulecontrol_line= rulecontrol_line EOF
            {
             newCompositeNode(grammarAccess.getControl_lineRule()); 
            pushFollow(FOLLOW_rulecontrol_line_in_entryRulecontrol_line2058);
            iv_rulecontrol_line=rulecontrol_line();

            state._fsp--;

             current =iv_rulecontrol_line.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecontrol_line2069); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecontrol_line"


    // $ANTLR start "rulecontrol_line"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:737:1: rulecontrol_line returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '#include' this_pp_tokens_1= rulepp_tokens this_new_line_2= rulenew_line ) | (kw= '#define' this_IDENTIFIER_4= RULE_IDENTIFIER this_replacement_list_5= rulereplacement_list this_new_line_6= rulenew_line ) | (kw= '#define' this_IDENTIFIER_8= RULE_IDENTIFIER this_lparen_9= rulelparen (this_IDENTIFIER_10= RULE_IDENTIFIER )? kw= ')' this_replacement_list_12= rulereplacement_list this_new_line_13= rulenew_line ) | (kw= '#undef' this_IDENTIFIER_15= RULE_IDENTIFIER this_new_line_16= rulenew_line ) | (kw= '#line' this_pp_tokens_18= rulepp_tokens this_new_line_19= rulenew_line ) | (kw= '#error' (this_pp_tokens_21= rulepp_tokens )? this_new_line_22= rulenew_line ) | (kw= '#pragma' (this_pp_tokens_24= rulepp_tokens )? this_new_line_25= rulenew_line ) | (kw= '#' this_new_line_27= rulenew_line ) ) ;
    public final AntlrDatatypeRuleToken rulecontrol_line() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_IDENTIFIER_4=null;
        Token this_IDENTIFIER_8=null;
        Token this_IDENTIFIER_10=null;
        Token this_IDENTIFIER_15=null;
        AntlrDatatypeRuleToken this_pp_tokens_1 = null;

        AntlrDatatypeRuleToken this_new_line_2 = null;

        AntlrDatatypeRuleToken this_replacement_list_5 = null;

        AntlrDatatypeRuleToken this_new_line_6 = null;

        AntlrDatatypeRuleToken this_lparen_9 = null;

        AntlrDatatypeRuleToken this_replacement_list_12 = null;

        AntlrDatatypeRuleToken this_new_line_13 = null;

        AntlrDatatypeRuleToken this_new_line_16 = null;

        AntlrDatatypeRuleToken this_pp_tokens_18 = null;

        AntlrDatatypeRuleToken this_new_line_19 = null;

        AntlrDatatypeRuleToken this_pp_tokens_21 = null;

        AntlrDatatypeRuleToken this_new_line_22 = null;

        AntlrDatatypeRuleToken this_pp_tokens_24 = null;

        AntlrDatatypeRuleToken this_new_line_25 = null;

        AntlrDatatypeRuleToken this_new_line_27 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:740:28: ( ( (kw= '#include' this_pp_tokens_1= rulepp_tokens this_new_line_2= rulenew_line ) | (kw= '#define' this_IDENTIFIER_4= RULE_IDENTIFIER this_replacement_list_5= rulereplacement_list this_new_line_6= rulenew_line ) | (kw= '#define' this_IDENTIFIER_8= RULE_IDENTIFIER this_lparen_9= rulelparen (this_IDENTIFIER_10= RULE_IDENTIFIER )? kw= ')' this_replacement_list_12= rulereplacement_list this_new_line_13= rulenew_line ) | (kw= '#undef' this_IDENTIFIER_15= RULE_IDENTIFIER this_new_line_16= rulenew_line ) | (kw= '#line' this_pp_tokens_18= rulepp_tokens this_new_line_19= rulenew_line ) | (kw= '#error' (this_pp_tokens_21= rulepp_tokens )? this_new_line_22= rulenew_line ) | (kw= '#pragma' (this_pp_tokens_24= rulepp_tokens )? this_new_line_25= rulenew_line ) | (kw= '#' this_new_line_27= rulenew_line ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:741:1: ( (kw= '#include' this_pp_tokens_1= rulepp_tokens this_new_line_2= rulenew_line ) | (kw= '#define' this_IDENTIFIER_4= RULE_IDENTIFIER this_replacement_list_5= rulereplacement_list this_new_line_6= rulenew_line ) | (kw= '#define' this_IDENTIFIER_8= RULE_IDENTIFIER this_lparen_9= rulelparen (this_IDENTIFIER_10= RULE_IDENTIFIER )? kw= ')' this_replacement_list_12= rulereplacement_list this_new_line_13= rulenew_line ) | (kw= '#undef' this_IDENTIFIER_15= RULE_IDENTIFIER this_new_line_16= rulenew_line ) | (kw= '#line' this_pp_tokens_18= rulepp_tokens this_new_line_19= rulenew_line ) | (kw= '#error' (this_pp_tokens_21= rulepp_tokens )? this_new_line_22= rulenew_line ) | (kw= '#pragma' (this_pp_tokens_24= rulepp_tokens )? this_new_line_25= rulenew_line ) | (kw= '#' this_new_line_27= rulenew_line ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:741:1: ( (kw= '#include' this_pp_tokens_1= rulepp_tokens this_new_line_2= rulenew_line ) | (kw= '#define' this_IDENTIFIER_4= RULE_IDENTIFIER this_replacement_list_5= rulereplacement_list this_new_line_6= rulenew_line ) | (kw= '#define' this_IDENTIFIER_8= RULE_IDENTIFIER this_lparen_9= rulelparen (this_IDENTIFIER_10= RULE_IDENTIFIER )? kw= ')' this_replacement_list_12= rulereplacement_list this_new_line_13= rulenew_line ) | (kw= '#undef' this_IDENTIFIER_15= RULE_IDENTIFIER this_new_line_16= rulenew_line ) | (kw= '#line' this_pp_tokens_18= rulepp_tokens this_new_line_19= rulenew_line ) | (kw= '#error' (this_pp_tokens_21= rulepp_tokens )? this_new_line_22= rulenew_line ) | (kw= '#pragma' (this_pp_tokens_24= rulepp_tokens )? this_new_line_25= rulenew_line ) | (kw= '#' this_new_line_27= rulenew_line ) )
            int alt19=8;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:741:2: (kw= '#include' this_pp_tokens_1= rulepp_tokens this_new_line_2= rulenew_line )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:741:2: (kw= '#include' this_pp_tokens_1= rulepp_tokens this_new_line_2= rulenew_line )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:742:2: kw= '#include' this_pp_tokens_1= rulepp_tokens this_new_line_2= rulenew_line
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_rulecontrol_line2108); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getControl_lineAccess().getIncludeKeyword_0_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getControl_lineAccess().getPp_tokensParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_rulepp_tokens_in_rulecontrol_line2130);
                    this_pp_tokens_1=rulepp_tokens();

                    state._fsp--;


                    		current.merge(this_pp_tokens_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                     
                            newCompositeNode(grammarAccess.getControl_lineAccess().getNew_lineParserRuleCall_0_2()); 
                        
                    pushFollow(FOLLOW_rulenew_line_in_rulecontrol_line2157);
                    this_new_line_2=rulenew_line();

                    state._fsp--;


                    		current.merge(this_new_line_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:770:6: (kw= '#define' this_IDENTIFIER_4= RULE_IDENTIFIER this_replacement_list_5= rulereplacement_list this_new_line_6= rulenew_line )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:770:6: (kw= '#define' this_IDENTIFIER_4= RULE_IDENTIFIER this_replacement_list_5= rulereplacement_list this_new_line_6= rulenew_line )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:771:2: kw= '#define' this_IDENTIFIER_4= RULE_IDENTIFIER this_replacement_list_5= rulereplacement_list this_new_line_6= rulenew_line
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_rulecontrol_line2183); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getControl_lineAccess().getDefineKeyword_1_0()); 
                        
                    this_IDENTIFIER_4=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulecontrol_line2198); 

                    		current.merge(this_IDENTIFIER_4);
                        
                     
                        newLeafNode(this_IDENTIFIER_4, grammarAccess.getControl_lineAccess().getIDENTIFIERTerminalRuleCall_1_1()); 
                        
                     
                            newCompositeNode(grammarAccess.getControl_lineAccess().getReplacement_listParserRuleCall_1_2()); 
                        
                    pushFollow(FOLLOW_rulereplacement_list_in_rulecontrol_line2225);
                    this_replacement_list_5=rulereplacement_list();

                    state._fsp--;


                    		current.merge(this_replacement_list_5);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                     
                            newCompositeNode(grammarAccess.getControl_lineAccess().getNew_lineParserRuleCall_1_3()); 
                        
                    pushFollow(FOLLOW_rulenew_line_in_rulecontrol_line2252);
                    this_new_line_6=rulenew_line();

                    state._fsp--;


                    		current.merge(this_new_line_6);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:806:6: (kw= '#define' this_IDENTIFIER_8= RULE_IDENTIFIER this_lparen_9= rulelparen (this_IDENTIFIER_10= RULE_IDENTIFIER )? kw= ')' this_replacement_list_12= rulereplacement_list this_new_line_13= rulenew_line )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:806:6: (kw= '#define' this_IDENTIFIER_8= RULE_IDENTIFIER this_lparen_9= rulelparen (this_IDENTIFIER_10= RULE_IDENTIFIER )? kw= ')' this_replacement_list_12= rulereplacement_list this_new_line_13= rulenew_line )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:807:2: kw= '#define' this_IDENTIFIER_8= RULE_IDENTIFIER this_lparen_9= rulelparen (this_IDENTIFIER_10= RULE_IDENTIFIER )? kw= ')' this_replacement_list_12= rulereplacement_list this_new_line_13= rulenew_line
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_rulecontrol_line2278); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getControl_lineAccess().getDefineKeyword_2_0()); 
                        
                    this_IDENTIFIER_8=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulecontrol_line2293); 

                    		current.merge(this_IDENTIFIER_8);
                        
                     
                        newLeafNode(this_IDENTIFIER_8, grammarAccess.getControl_lineAccess().getIDENTIFIERTerminalRuleCall_2_1()); 
                        
                     
                            newCompositeNode(grammarAccess.getControl_lineAccess().getLparenParserRuleCall_2_2()); 
                        
                    pushFollow(FOLLOW_rulelparen_in_rulecontrol_line2320);
                    this_lparen_9=rulelparen();

                    state._fsp--;


                    		current.merge(this_lparen_9);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:830:1: (this_IDENTIFIER_10= RULE_IDENTIFIER )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==RULE_IDENTIFIER) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:830:6: this_IDENTIFIER_10= RULE_IDENTIFIER
                            {
                            this_IDENTIFIER_10=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulecontrol_line2341); 

                            		current.merge(this_IDENTIFIER_10);
                                
                             
                                newLeafNode(this_IDENTIFIER_10, grammarAccess.getControl_lineAccess().getIDENTIFIERTerminalRuleCall_2_3()); 
                                

                            }
                            break;

                    }

                    kw=(Token)match(input,31,FOLLOW_31_in_rulecontrol_line2361); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getControl_lineAccess().getRightParenthesisKeyword_2_4()); 
                        
                     
                            newCompositeNode(grammarAccess.getControl_lineAccess().getReplacement_listParserRuleCall_2_5()); 
                        
                    pushFollow(FOLLOW_rulereplacement_list_in_rulecontrol_line2383);
                    this_replacement_list_12=rulereplacement_list();

                    state._fsp--;


                    		current.merge(this_replacement_list_12);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                     
                            newCompositeNode(grammarAccess.getControl_lineAccess().getNew_lineParserRuleCall_2_6()); 
                        
                    pushFollow(FOLLOW_rulenew_line_in_rulecontrol_line2410);
                    this_new_line_13=rulenew_line();

                    state._fsp--;


                    		current.merge(this_new_line_13);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:866:6: (kw= '#undef' this_IDENTIFIER_15= RULE_IDENTIFIER this_new_line_16= rulenew_line )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:866:6: (kw= '#undef' this_IDENTIFIER_15= RULE_IDENTIFIER this_new_line_16= rulenew_line )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:867:2: kw= '#undef' this_IDENTIFIER_15= RULE_IDENTIFIER this_new_line_16= rulenew_line
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_rulecontrol_line2436); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getControl_lineAccess().getUndefKeyword_3_0()); 
                        
                    this_IDENTIFIER_15=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulecontrol_line2451); 

                    		current.merge(this_IDENTIFIER_15);
                        
                     
                        newLeafNode(this_IDENTIFIER_15, grammarAccess.getControl_lineAccess().getIDENTIFIERTerminalRuleCall_3_1()); 
                        
                     
                            newCompositeNode(grammarAccess.getControl_lineAccess().getNew_lineParserRuleCall_3_2()); 
                        
                    pushFollow(FOLLOW_rulenew_line_in_rulecontrol_line2478);
                    this_new_line_16=rulenew_line();

                    state._fsp--;


                    		current.merge(this_new_line_16);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:891:6: (kw= '#line' this_pp_tokens_18= rulepp_tokens this_new_line_19= rulenew_line )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:891:6: (kw= '#line' this_pp_tokens_18= rulepp_tokens this_new_line_19= rulenew_line )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:892:2: kw= '#line' this_pp_tokens_18= rulepp_tokens this_new_line_19= rulenew_line
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_rulecontrol_line2504); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getControl_lineAccess().getLineKeyword_4_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getControl_lineAccess().getPp_tokensParserRuleCall_4_1()); 
                        
                    pushFollow(FOLLOW_rulepp_tokens_in_rulecontrol_line2526);
                    this_pp_tokens_18=rulepp_tokens();

                    state._fsp--;


                    		current.merge(this_pp_tokens_18);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                     
                            newCompositeNode(grammarAccess.getControl_lineAccess().getNew_lineParserRuleCall_4_2()); 
                        
                    pushFollow(FOLLOW_rulenew_line_in_rulecontrol_line2553);
                    this_new_line_19=rulenew_line();

                    state._fsp--;


                    		current.merge(this_new_line_19);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:920:6: (kw= '#error' (this_pp_tokens_21= rulepp_tokens )? this_new_line_22= rulenew_line )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:920:6: (kw= '#error' (this_pp_tokens_21= rulepp_tokens )? this_new_line_22= rulenew_line )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:921:2: kw= '#error' (this_pp_tokens_21= rulepp_tokens )? this_new_line_22= rulenew_line
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_rulecontrol_line2579); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getControl_lineAccess().getErrorKeyword_5_0()); 
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:926:1: (this_pp_tokens_21= rulepp_tokens )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( ((LA17_0>=RULE_IDENTIFIER && LA17_0<=RULE_PPOPORPUNC)) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:927:5: this_pp_tokens_21= rulepp_tokens
                            {
                             
                                    newCompositeNode(grammarAccess.getControl_lineAccess().getPp_tokensParserRuleCall_5_1()); 
                                
                            pushFollow(FOLLOW_rulepp_tokens_in_rulecontrol_line2602);
                            this_pp_tokens_21=rulepp_tokens();

                            state._fsp--;


                            		current.merge(this_pp_tokens_21);
                                
                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                     
                            newCompositeNode(grammarAccess.getControl_lineAccess().getNew_lineParserRuleCall_5_2()); 
                        
                    pushFollow(FOLLOW_rulenew_line_in_rulecontrol_line2631);
                    this_new_line_22=rulenew_line();

                    state._fsp--;


                    		current.merge(this_new_line_22);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:949:6: (kw= '#pragma' (this_pp_tokens_24= rulepp_tokens )? this_new_line_25= rulenew_line )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:949:6: (kw= '#pragma' (this_pp_tokens_24= rulepp_tokens )? this_new_line_25= rulenew_line )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:950:2: kw= '#pragma' (this_pp_tokens_24= rulepp_tokens )? this_new_line_25= rulenew_line
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_rulecontrol_line2657); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getControl_lineAccess().getPragmaKeyword_6_0()); 
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:955:1: (this_pp_tokens_24= rulepp_tokens )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( ((LA18_0>=RULE_IDENTIFIER && LA18_0<=RULE_PPOPORPUNC)) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:956:5: this_pp_tokens_24= rulepp_tokens
                            {
                             
                                    newCompositeNode(grammarAccess.getControl_lineAccess().getPp_tokensParserRuleCall_6_1()); 
                                
                            pushFollow(FOLLOW_rulepp_tokens_in_rulecontrol_line2680);
                            this_pp_tokens_24=rulepp_tokens();

                            state._fsp--;


                            		current.merge(this_pp_tokens_24);
                                
                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                     
                            newCompositeNode(grammarAccess.getControl_lineAccess().getNew_lineParserRuleCall_6_2()); 
                        
                    pushFollow(FOLLOW_rulenew_line_in_rulecontrol_line2709);
                    this_new_line_25=rulenew_line();

                    state._fsp--;


                    		current.merge(this_new_line_25);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:978:6: (kw= '#' this_new_line_27= rulenew_line )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:978:6: (kw= '#' this_new_line_27= rulenew_line )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:979:2: kw= '#' this_new_line_27= rulenew_line
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_rulecontrol_line2735); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getControl_lineAccess().getNumberSignKeyword_7_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getControl_lineAccess().getNew_lineParserRuleCall_7_1()); 
                        
                    pushFollow(FOLLOW_rulenew_line_in_rulecontrol_line2757);
                    this_new_line_27=rulenew_line();

                    state._fsp--;


                    		current.merge(this_new_line_27);
                        
                     
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
    // $ANTLR end "rulecontrol_line"


    // $ANTLR start "entryRulelparen"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1003:1: entryRulelparen returns [String current=null] : iv_rulelparen= rulelparen EOF ;
    public final String entryRulelparen() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulelparen = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1004:2: (iv_rulelparen= rulelparen EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1005:2: iv_rulelparen= rulelparen EOF
            {
             newCompositeNode(grammarAccess.getLparenRule()); 
            pushFollow(FOLLOW_rulelparen_in_entryRulelparen2804);
            iv_rulelparen=rulelparen();

            state._fsp--;

             current =iv_rulelparen.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulelparen2815); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulelparen"


    // $ANTLR start "rulelparen"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1012:1: rulelparen returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '(' ;
    public final AntlrDatatypeRuleToken rulelparen() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1015:28: (kw= '(' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1017:2: kw= '('
            {
            kw=(Token)match(input,37,FOLLOW_37_in_rulelparen2852); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getLparenAccess().getLeftParenthesisKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulelparen"


    // $ANTLR start "entryRulereplacement_list"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1030:1: entryRulereplacement_list returns [String current=null] : iv_rulereplacement_list= rulereplacement_list EOF ;
    public final String entryRulereplacement_list() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulereplacement_list = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1031:2: (iv_rulereplacement_list= rulereplacement_list EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1032:2: iv_rulereplacement_list= rulereplacement_list EOF
            {
             newCompositeNode(grammarAccess.getReplacement_listRule()); 
            pushFollow(FOLLOW_rulereplacement_list_in_entryRulereplacement_list2892);
            iv_rulereplacement_list=rulereplacement_list();

            state._fsp--;

             current =iv_rulereplacement_list.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulereplacement_list2903); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulereplacement_list"


    // $ANTLR start "rulereplacement_list"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1039:1: rulereplacement_list returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_pp_tokens_0= rulepp_tokens )? ;
    public final AntlrDatatypeRuleToken rulereplacement_list() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_pp_tokens_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1042:28: ( (this_pp_tokens_0= rulepp_tokens )? )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1043:1: (this_pp_tokens_0= rulepp_tokens )?
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1043:1: (this_pp_tokens_0= rulepp_tokens )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=RULE_IDENTIFIER && LA20_0<=RULE_PPOPORPUNC)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1044:5: this_pp_tokens_0= rulepp_tokens
                    {
                     
                            newCompositeNode(grammarAccess.getReplacement_listAccess().getPp_tokensParserRuleCall()); 
                        
                    pushFollow(FOLLOW_rulepp_tokens_in_rulereplacement_list2950);
                    this_pp_tokens_0=rulepp_tokens();

                    state._fsp--;


                    		current.merge(this_pp_tokens_0);
                        
                     
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
    // $ANTLR end "rulereplacement_list"


    // $ANTLR start "entryRulepp_tokens"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1062:1: entryRulepp_tokens returns [String current=null] : iv_rulepp_tokens= rulepp_tokens EOF ;
    public final String entryRulepp_tokens() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulepp_tokens = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1063:2: (iv_rulepp_tokens= rulepp_tokens EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1064:2: iv_rulepp_tokens= rulepp_tokens EOF
            {
             newCompositeNode(grammarAccess.getPp_tokensRule()); 
            pushFollow(FOLLOW_rulepp_tokens_in_entryRulepp_tokens2997);
            iv_rulepp_tokens=rulepp_tokens();

            state._fsp--;

             current =iv_rulepp_tokens.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulepp_tokens3008); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulepp_tokens"


    // $ANTLR start "rulepp_tokens"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1071:1: rulepp_tokens returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_preprocessing_token_0= rulepreprocessing_token )+ ;
    public final AntlrDatatypeRuleToken rulepp_tokens() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_preprocessing_token_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1074:28: ( (this_preprocessing_token_0= rulepreprocessing_token )+ )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:1: (this_preprocessing_token_0= rulepreprocessing_token )+
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:1: (this_preprocessing_token_0= rulepreprocessing_token )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=RULE_IDENTIFIER && LA21_0<=RULE_PPOPORPUNC)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1076:5: this_preprocessing_token_0= rulepreprocessing_token
            	    {
            	     
            	            newCompositeNode(grammarAccess.getPp_tokensAccess().getPreprocessing_tokenParserRuleCall()); 
            	        
            	    pushFollow(FOLLOW_rulepreprocessing_token_in_rulepp_tokens3055);
            	    this_preprocessing_token_0=rulepreprocessing_token();

            	    state._fsp--;


            	    		current.merge(this_preprocessing_token_0);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
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
    // $ANTLR end "rulepp_tokens"

    // Delegated rules


    protected DFA19 dfa19 = new DFA19(this);
    static final String DFA19_eotS =
        "\13\uffff";
    static final String DFA19_eofS =
        "\13\uffff";
    static final String DFA19_minS =
        "\1\35\1\uffff\1\4\5\uffff\1\4\2\uffff";
    static final String DFA19_maxS =
        "\1\44\1\uffff\1\4\5\uffff\1\45\2\uffff";
    static final String DFA19_acceptS =
        "\1\uffff\1\1\1\uffff\1\4\1\5\1\6\1\7\1\10\1\uffff\1\3\1\2";
    static final String DFA19_specialS =
        "\13\uffff}>";
    static final String[] DFA19_transitionS = {
            "\1\1\1\2\1\uffff\1\3\1\4\1\5\1\6\1\7",
            "",
            "\1\10",
            "",
            "",
            "",
            "",
            "",
            "\4\12\14\uffff\2\12\17\uffff\1\11",
            "",
            ""
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
            return "741:1: ( (kw= '#include' this_pp_tokens_1= rulepp_tokens this_new_line_2= rulenew_line ) | (kw= '#define' this_IDENTIFIER_4= RULE_IDENTIFIER this_replacement_list_5= rulereplacement_list this_new_line_6= rulenew_line ) | (kw= '#define' this_IDENTIFIER_8= RULE_IDENTIFIER this_lparen_9= rulelparen (this_IDENTIFIER_10= RULE_IDENTIFIER )? kw= ')' this_replacement_list_12= rulereplacement_list this_new_line_13= rulenew_line ) | (kw= '#undef' this_IDENTIFIER_15= RULE_IDENTIFIER this_new_line_16= rulenew_line ) | (kw= '#line' this_pp_tokens_18= rulepp_tokens this_new_line_19= rulenew_line ) | (kw= '#error' (this_pp_tokens_21= rulepp_tokens )? this_new_line_22= rulenew_line ) | (kw= '#pragma' (this_pp_tokens_24= rulepp_tokens )? this_new_line_25= rulenew_line ) | (kw= '#' this_new_line_27= rulenew_line ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepreprocessing_file_in_ruleModel130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenew_line_in_entryRulenew_line168 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenew_line179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rulenew_line217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rulenew_line236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepreprocessing_file_in_entryRulepreprocessing_file277 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepreprocessing_file288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegroup_in_rulepreprocessing_file335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegroup_in_entryRulegroup382 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulegroup393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegroup_part_in_rulegroup440 = new BitSet(new long[]{0x0000001F61F000F2L});
    public static final BitSet FOLLOW_rulegroup_part_in_entryRulegroup_part487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulegroup_part498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepp_tokens_in_rulegroup_part547 = new BitSet(new long[]{0x00000000003000F0L});
    public static final BitSet FOLLOW_rulenew_line_in_rulegroup_part576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleif_action_in_rulegroup_part610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecontrol_line_in_rulegroup_part643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleif_action_in_entryRuleif_action689 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleif_action700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleif_group_in_ruleif_action747 = new BitSet(new long[]{0x000000001A000000L});
    public static final BitSet FOLLOW_ruleelif_groups_in_ruleif_action775 = new BitSet(new long[]{0x000000001A000000L});
    public static final BitSet FOLLOW_ruleelse_group_in_ruleif_action805 = new BitSet(new long[]{0x000000001A000000L});
    public static final BitSet FOLLOW_ruleendif_line_in_ruleif_action834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleif_group_in_entryRuleif_group880 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleif_group891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleif_group930 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleconstant_expression_in_ruleif_group952 = new BitSet(new long[]{0x00000000003000F0L});
    public static final BitSet FOLLOW_rulenew_line_in_ruleif_group979 = new BitSet(new long[]{0x0000001F61F000F2L});
    public static final BitSet FOLLOW_rulegroup_in_ruleif_group1007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleif_group1035 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleif_group1050 = new BitSet(new long[]{0x00000000003000F0L});
    public static final BitSet FOLLOW_rulenew_line_in_ruleif_group1077 = new BitSet(new long[]{0x0000001F61F000F2L});
    public static final BitSet FOLLOW_rulegroup_in_ruleif_group1105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleif_group1133 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleif_group1148 = new BitSet(new long[]{0x00000000003000F0L});
    public static final BitSet FOLLOW_rulenew_line_in_ruleif_group1175 = new BitSet(new long[]{0x0000001F61F000F2L});
    public static final BitSet FOLLOW_rulegroup_in_ruleif_group1203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleelif_groups_in_entryRuleelif_groups1252 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleelif_groups1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleelif_group_in_ruleelif_groups1310 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleelif_group_in_entryRuleelif_group1357 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleelif_group1368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleelif_group1406 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleconstant_expression_in_ruleelif_group1428 = new BitSet(new long[]{0x00000000003000F0L});
    public static final BitSet FOLLOW_rulenew_line_in_ruleelif_group1455 = new BitSet(new long[]{0x0000001F61F000F2L});
    public static final BitSet FOLLOW_rulegroup_in_ruleelif_group1483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstant_expression_in_entryRuleconstant_expression1531 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleconstant_expression1542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleconstant_expression1579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepreprocessing_token_in_entryRulepreprocessing_token1619 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepreprocessing_token1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulepreprocessing_token1670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEADERNAME_in_rulepreprocessing_token1696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PPNUMBER_in_rulepreprocessing_token1722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PPOPORPUNC_in_rulepreprocessing_token1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleelse_group_in_entryRuleelse_group1794 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleelse_group1805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleelse_group1843 = new BitSet(new long[]{0x00000000003000F0L});
    public static final BitSet FOLLOW_rulenew_line_in_ruleelse_group1865 = new BitSet(new long[]{0x0000001F61F000F2L});
    public static final BitSet FOLLOW_rulegroup_in_ruleelse_group1893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleendif_line_in_entryRuleendif_line1941 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleendif_line1952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleendif_line1990 = new BitSet(new long[]{0x00000000003000F0L});
    public static final BitSet FOLLOW_rulenew_line_in_ruleendif_line2012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecontrol_line_in_entryRulecontrol_line2058 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecontrol_line2069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rulecontrol_line2108 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rulepp_tokens_in_rulecontrol_line2130 = new BitSet(new long[]{0x00000000003000F0L});
    public static final BitSet FOLLOW_rulenew_line_in_rulecontrol_line2157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rulecontrol_line2183 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulecontrol_line2198 = new BitSet(new long[]{0x00000000003000F0L});
    public static final BitSet FOLLOW_rulereplacement_list_in_rulecontrol_line2225 = new BitSet(new long[]{0x00000000003000F0L});
    public static final BitSet FOLLOW_rulenew_line_in_rulecontrol_line2252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rulecontrol_line2278 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulecontrol_line2293 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rulelparen_in_rulecontrol_line2320 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulecontrol_line2341 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_rulecontrol_line2361 = new BitSet(new long[]{0x00000000003000F0L});
    public static final BitSet FOLLOW_rulereplacement_list_in_rulecontrol_line2383 = new BitSet(new long[]{0x00000000003000F0L});
    public static final BitSet FOLLOW_rulenew_line_in_rulecontrol_line2410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rulecontrol_line2436 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulecontrol_line2451 = new BitSet(new long[]{0x00000000003000F0L});
    public static final BitSet FOLLOW_rulenew_line_in_rulecontrol_line2478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rulecontrol_line2504 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rulepp_tokens_in_rulecontrol_line2526 = new BitSet(new long[]{0x00000000003000F0L});
    public static final BitSet FOLLOW_rulenew_line_in_rulecontrol_line2553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rulecontrol_line2579 = new BitSet(new long[]{0x00000000003000F0L});
    public static final BitSet FOLLOW_rulepp_tokens_in_rulecontrol_line2602 = new BitSet(new long[]{0x00000000003000F0L});
    public static final BitSet FOLLOW_rulenew_line_in_rulecontrol_line2631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rulecontrol_line2657 = new BitSet(new long[]{0x00000000003000F0L});
    public static final BitSet FOLLOW_rulepp_tokens_in_rulecontrol_line2680 = new BitSet(new long[]{0x00000000003000F0L});
    public static final BitSet FOLLOW_rulenew_line_in_rulecontrol_line2709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rulecontrol_line2735 = new BitSet(new long[]{0x00000000003000F0L});
    public static final BitSet FOLLOW_rulenew_line_in_rulecontrol_line2757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelparen_in_entryRulelparen2804 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulelparen2815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rulelparen2852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulereplacement_list_in_entryRulereplacement_list2892 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulereplacement_list2903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepp_tokens_in_rulereplacement_list2950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepp_tokens_in_entryRulepp_tokens2997 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepp_tokens3008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepreprocessing_token_in_rulepp_tokens3055 = new BitSet(new long[]{0x00000000000000F2L});

}