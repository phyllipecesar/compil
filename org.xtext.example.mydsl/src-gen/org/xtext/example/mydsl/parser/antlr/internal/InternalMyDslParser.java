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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_IDENTIFIER", "RULE_INTEGERLITERAL", "RULE_BOOLEANLITERAL", "RULE_POINTERLITERAL", "RULE_PPNUMBER", "RULE_LITERAL", "RULE_KEYWORD", "RULE_PPOPORPUNC", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'\\n'", "'#if'", "'#ifdef'", "'#ifndef'", "'#elif'", "'=='", "'!='", "'#else'", "'#endif'", "'#include'", "'#define'", "')'", "'#undef'", "'#line'", "'#error'", "'#pragma'", "'#'", "'('"
    };
    public static final int RULE_ID=12;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=18;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_INTEGERLITERAL=5;
    public static final int RULE_IDENTIFIER=4;
    public static final int RULE_SL_COMMENT=16;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=15;
    public static final int RULE_BOOLEANLITERAL=6;
    public static final int T__19=19;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=14;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int RULE_POINTERLITERAL=7;
    public static final int RULE_KEYWORD=10;
    public static final int RULE_INT=13;
    public static final int RULE_PPOPORPUNC=11;
    public static final int RULE_PPNUMBER=8;
    public static final int RULE_WS=17;
    public static final int RULE_LITERAL=9;

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:117:1: rulenew_line returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '\\n' ;
    public final AntlrDatatypeRuleToken rulenew_line() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:120:28: (kw= '\\n' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:122:2: kw= '\\n'
            {
            kw=(Token)match(input,19,FOLLOW_19_in_rulenew_line216); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getNew_lineAccess().getControl000aKeyword()); 
                

            }

             leaveRule(); 
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:135:1: entryRulepreprocessing_file returns [String current=null] : iv_rulepreprocessing_file= rulepreprocessing_file EOF ;
    public final String entryRulepreprocessing_file() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulepreprocessing_file = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:136:2: (iv_rulepreprocessing_file= rulepreprocessing_file EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:137:2: iv_rulepreprocessing_file= rulepreprocessing_file EOF
            {
             newCompositeNode(grammarAccess.getPreprocessing_fileRule()); 
            pushFollow(FOLLOW_rulepreprocessing_file_in_entryRulepreprocessing_file256);
            iv_rulepreprocessing_file=rulepreprocessing_file();

            state._fsp--;

             current =iv_rulepreprocessing_file.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulepreprocessing_file267); 

            }

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:144:1: rulepreprocessing_file returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_group_0= rulegroup )? ;
    public final AntlrDatatypeRuleToken rulepreprocessing_file() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_group_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:147:28: ( (this_group_0= rulegroup )? )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:148:1: (this_group_0= rulegroup )?
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:148:1: (this_group_0= rulegroup )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=19 && LA1_0<=22)||LA1_0==25||(LA1_0>=28 && LA1_0<=29)||(LA1_0>=31 && LA1_0<=35)) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:149:5: this_group_0= rulegroup
                    {
                     
                            newCompositeNode(grammarAccess.getPreprocessing_fileAccess().getGroupParserRuleCall()); 
                        
                    pushFollow(FOLLOW_rulegroup_in_rulepreprocessing_file314);
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:167:1: entryRulegroup returns [String current=null] : iv_rulegroup= rulegroup EOF ;
    public final String entryRulegroup() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulegroup = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:168:2: (iv_rulegroup= rulegroup EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:169:2: iv_rulegroup= rulegroup EOF
            {
             newCompositeNode(grammarAccess.getGroupRule()); 
            pushFollow(FOLLOW_rulegroup_in_entryRulegroup361);
            iv_rulegroup=rulegroup();

            state._fsp--;

             current =iv_rulegroup.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulegroup372); 

            }

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:176:1: rulegroup returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_group_part_0= rulegroup_part )+ ;
    public final AntlrDatatypeRuleToken rulegroup() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_group_part_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:179:28: ( (this_group_part_0= rulegroup_part )+ )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:180:1: (this_group_part_0= rulegroup_part )+
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:180:1: (this_group_part_0= rulegroup_part )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=19 && LA2_0<=22)||LA2_0==25||(LA2_0>=28 && LA2_0<=29)||(LA2_0>=31 && LA2_0<=35)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:181:5: this_group_part_0= rulegroup_part
            	    {
            	     
            	            newCompositeNode(grammarAccess.getGroupAccess().getGroup_partParserRuleCall()); 
            	        
            	    pushFollow(FOLLOW_rulegroup_part_in_rulegroup419);
            	    this_group_part_0=rulegroup_part();

            	    state._fsp--;


            	    		current.merge(this_group_part_0);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:199:1: entryRulegroup_part returns [String current=null] : iv_rulegroup_part= rulegroup_part EOF ;
    public final String entryRulegroup_part() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulegroup_part = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:200:2: (iv_rulegroup_part= rulegroup_part EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:201:2: iv_rulegroup_part= rulegroup_part EOF
            {
             newCompositeNode(grammarAccess.getGroup_partRule()); 
            pushFollow(FOLLOW_rulegroup_part_in_entryRulegroup_part466);
            iv_rulegroup_part=rulegroup_part();

            state._fsp--;

             current =iv_rulegroup_part.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulegroup_part477); 

            }

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:208:1: rulegroup_part returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_pp_tokens_0= rulepp_tokens )? this_new_line_1= rulenew_line ) | this_if_action_2= ruleif_action | this_control_line_3= rulecontrol_line ) ;
    public final AntlrDatatypeRuleToken rulegroup_part() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_pp_tokens_0 = null;

        AntlrDatatypeRuleToken this_new_line_1 = null;

        AntlrDatatypeRuleToken this_if_action_2 = null;

        AntlrDatatypeRuleToken this_control_line_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:211:28: ( ( ( (this_pp_tokens_0= rulepp_tokens )? this_new_line_1= rulenew_line ) | this_if_action_2= ruleif_action | this_control_line_3= rulecontrol_line ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:212:1: ( ( (this_pp_tokens_0= rulepp_tokens )? this_new_line_1= rulenew_line ) | this_if_action_2= ruleif_action | this_control_line_3= rulecontrol_line )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:212:1: ( ( (this_pp_tokens_0= rulepp_tokens )? this_new_line_1= rulenew_line ) | this_if_action_2= ruleif_action | this_control_line_3= rulecontrol_line )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 19:
            case 25:
                {
                alt4=1;
                }
                break;
            case 20:
            case 21:
            case 22:
                {
                alt4=2;
                }
                break;
            case 28:
            case 29:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:212:2: ( (this_pp_tokens_0= rulepp_tokens )? this_new_line_1= rulenew_line )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:212:2: ( (this_pp_tokens_0= rulepp_tokens )? this_new_line_1= rulenew_line )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:212:3: (this_pp_tokens_0= rulepp_tokens )? this_new_line_1= rulenew_line
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:212:3: (this_pp_tokens_0= rulepp_tokens )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==25) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:213:5: this_pp_tokens_0= rulepp_tokens
                            {
                             
                                    newCompositeNode(grammarAccess.getGroup_partAccess().getPp_tokensParserRuleCall_0_0()); 
                                
                            pushFollow(FOLLOW_rulepp_tokens_in_rulegroup_part526);
                            this_pp_tokens_0=rulepp_tokens();

                            state._fsp--;


                            		current.merge(this_pp_tokens_0);
                                
                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                     
                            newCompositeNode(grammarAccess.getGroup_partAccess().getNew_lineParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_rulenew_line_in_rulegroup_part555);
                    this_new_line_1=rulenew_line();

                    state._fsp--;


                    		current.merge(this_new_line_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:236:5: this_if_action_2= ruleif_action
                    {
                     
                            newCompositeNode(grammarAccess.getGroup_partAccess().getIf_actionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleif_action_in_rulegroup_part589);
                    this_if_action_2=ruleif_action();

                    state._fsp--;


                    		current.merge(this_if_action_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:248:5: this_control_line_3= rulecontrol_line
                    {
                     
                            newCompositeNode(grammarAccess.getGroup_partAccess().getControl_lineParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_rulecontrol_line_in_rulegroup_part622);
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:266:1: entryRuleif_action returns [String current=null] : iv_ruleif_action= ruleif_action EOF ;
    public final String entryRuleif_action() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleif_action = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:267:2: (iv_ruleif_action= ruleif_action EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:268:2: iv_ruleif_action= ruleif_action EOF
            {
             newCompositeNode(grammarAccess.getIf_actionRule()); 
            pushFollow(FOLLOW_ruleif_action_in_entryRuleif_action668);
            iv_ruleif_action=ruleif_action();

            state._fsp--;

             current =iv_ruleif_action.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleif_action679); 

            }

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:275:1: ruleif_action returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_if_group_0= ruleif_group (this_elif_groups_1= ruleelif_groups )? (this_else_group_2= ruleelse_group )? this_endif_line_3= ruleendif_line ) ;
    public final AntlrDatatypeRuleToken ruleif_action() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_if_group_0 = null;

        AntlrDatatypeRuleToken this_elif_groups_1 = null;

        AntlrDatatypeRuleToken this_else_group_2 = null;

        AntlrDatatypeRuleToken this_endif_line_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:278:28: ( (this_if_group_0= ruleif_group (this_elif_groups_1= ruleelif_groups )? (this_else_group_2= ruleelse_group )? this_endif_line_3= ruleendif_line ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:279:1: (this_if_group_0= ruleif_group (this_elif_groups_1= ruleelif_groups )? (this_else_group_2= ruleelse_group )? this_endif_line_3= ruleendif_line )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:279:1: (this_if_group_0= ruleif_group (this_elif_groups_1= ruleelif_groups )? (this_else_group_2= ruleelse_group )? this_endif_line_3= ruleendif_line )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:280:5: this_if_group_0= ruleif_group (this_elif_groups_1= ruleelif_groups )? (this_else_group_2= ruleelse_group )? this_endif_line_3= ruleendif_line
            {
             
                    newCompositeNode(grammarAccess.getIf_actionAccess().getIf_groupParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleif_group_in_ruleif_action726);
            this_if_group_0=ruleif_group();

            state._fsp--;


            		current.merge(this_if_group_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:290:1: (this_elif_groups_1= ruleelif_groups )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:291:5: this_elif_groups_1= ruleelif_groups
                    {
                     
                            newCompositeNode(grammarAccess.getIf_actionAccess().getElif_groupsParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleelif_groups_in_ruleif_action754);
                    this_elif_groups_1=ruleelif_groups();

                    state._fsp--;


                    		current.merge(this_elif_groups_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:301:3: (this_else_group_2= ruleelse_group )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==26) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:302:5: this_else_group_2= ruleelse_group
                    {
                     
                            newCompositeNode(grammarAccess.getIf_actionAccess().getElse_groupParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleelse_group_in_ruleif_action784);
                    this_else_group_2=ruleelse_group();

                    state._fsp--;


                    		current.merge(this_else_group_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getIf_actionAccess().getEndif_lineParserRuleCall_3()); 
                
            pushFollow(FOLLOW_ruleendif_line_in_ruleif_action813);
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:331:1: entryRuleif_group returns [String current=null] : iv_ruleif_group= ruleif_group EOF ;
    public final String entryRuleif_group() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleif_group = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:332:2: (iv_ruleif_group= ruleif_group EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:333:2: iv_ruleif_group= ruleif_group EOF
            {
             newCompositeNode(grammarAccess.getIf_groupRule()); 
            pushFollow(FOLLOW_ruleif_group_in_entryRuleif_group859);
            iv_ruleif_group=ruleif_group();

            state._fsp--;

             current =iv_ruleif_group.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleif_group870); 

            }

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:340:1: ruleif_group returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '#if' this_constant_expression_1= ruleconstant_expression this_new_line_2= rulenew_line (this_group_3= rulegroup )? ) | (kw= '#ifdef' this_IDENTIFIER_5= RULE_IDENTIFIER this_new_line_6= rulenew_line (this_group_7= rulegroup )? ) | (kw= '#ifndef' this_IDENTIFIER_9= RULE_IDENTIFIER this_new_line_10= rulenew_line (this_group_11= rulegroup )? ) ) ;
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
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:343:28: ( ( (kw= '#if' this_constant_expression_1= ruleconstant_expression this_new_line_2= rulenew_line (this_group_3= rulegroup )? ) | (kw= '#ifdef' this_IDENTIFIER_5= RULE_IDENTIFIER this_new_line_6= rulenew_line (this_group_7= rulegroup )? ) | (kw= '#ifndef' this_IDENTIFIER_9= RULE_IDENTIFIER this_new_line_10= rulenew_line (this_group_11= rulegroup )? ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:344:1: ( (kw= '#if' this_constant_expression_1= ruleconstant_expression this_new_line_2= rulenew_line (this_group_3= rulegroup )? ) | (kw= '#ifdef' this_IDENTIFIER_5= RULE_IDENTIFIER this_new_line_6= rulenew_line (this_group_7= rulegroup )? ) | (kw= '#ifndef' this_IDENTIFIER_9= RULE_IDENTIFIER this_new_line_10= rulenew_line (this_group_11= rulegroup )? ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:344:1: ( (kw= '#if' this_constant_expression_1= ruleconstant_expression this_new_line_2= rulenew_line (this_group_3= rulegroup )? ) | (kw= '#ifdef' this_IDENTIFIER_5= RULE_IDENTIFIER this_new_line_6= rulenew_line (this_group_7= rulegroup )? ) | (kw= '#ifndef' this_IDENTIFIER_9= RULE_IDENTIFIER this_new_line_10= rulenew_line (this_group_11= rulegroup )? ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt10=1;
                }
                break;
            case 21:
                {
                alt10=2;
                }
                break;
            case 22:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:344:2: (kw= '#if' this_constant_expression_1= ruleconstant_expression this_new_line_2= rulenew_line (this_group_3= rulegroup )? )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:344:2: (kw= '#if' this_constant_expression_1= ruleconstant_expression this_new_line_2= rulenew_line (this_group_3= rulegroup )? )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:345:2: kw= '#if' this_constant_expression_1= ruleconstant_expression this_new_line_2= rulenew_line (this_group_3= rulegroup )?
                    {
                    kw=(Token)match(input,20,FOLLOW_20_in_ruleif_group909); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getIf_groupAccess().getIfKeyword_0_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getIf_groupAccess().getConstant_expressionParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleconstant_expression_in_ruleif_group931);
                    this_constant_expression_1=ruleconstant_expression();

                    state._fsp--;


                    		current.merge(this_constant_expression_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                     
                            newCompositeNode(grammarAccess.getIf_groupAccess().getNew_lineParserRuleCall_0_2()); 
                        
                    pushFollow(FOLLOW_rulenew_line_in_ruleif_group958);
                    this_new_line_2=rulenew_line();

                    state._fsp--;


                    		current.merge(this_new_line_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:372:1: (this_group_3= rulegroup )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( ((LA7_0>=19 && LA7_0<=22)||LA7_0==25||(LA7_0>=28 && LA7_0<=29)||(LA7_0>=31 && LA7_0<=35)) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:373:5: this_group_3= rulegroup
                            {
                             
                                    newCompositeNode(grammarAccess.getIf_groupAccess().getGroupParserRuleCall_0_3()); 
                                
                            pushFollow(FOLLOW_rulegroup_in_ruleif_group986);
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
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:384:6: (kw= '#ifdef' this_IDENTIFIER_5= RULE_IDENTIFIER this_new_line_6= rulenew_line (this_group_7= rulegroup )? )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:384:6: (kw= '#ifdef' this_IDENTIFIER_5= RULE_IDENTIFIER this_new_line_6= rulenew_line (this_group_7= rulegroup )? )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:385:2: kw= '#ifdef' this_IDENTIFIER_5= RULE_IDENTIFIER this_new_line_6= rulenew_line (this_group_7= rulegroup )?
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleif_group1014); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getIf_groupAccess().getIfdefKeyword_1_0()); 
                        
                    this_IDENTIFIER_5=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleif_group1029); 

                    		current.merge(this_IDENTIFIER_5);
                        
                     
                        newLeafNode(this_IDENTIFIER_5, grammarAccess.getIf_groupAccess().getIDENTIFIERTerminalRuleCall_1_1()); 
                        
                     
                            newCompositeNode(grammarAccess.getIf_groupAccess().getNew_lineParserRuleCall_1_2()); 
                        
                    pushFollow(FOLLOW_rulenew_line_in_ruleif_group1056);
                    this_new_line_6=rulenew_line();

                    state._fsp--;


                    		current.merge(this_new_line_6);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:408:1: (this_group_7= rulegroup )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( ((LA8_0>=19 && LA8_0<=22)||LA8_0==25||(LA8_0>=28 && LA8_0<=29)||(LA8_0>=31 && LA8_0<=35)) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:409:5: this_group_7= rulegroup
                            {
                             
                                    newCompositeNode(grammarAccess.getIf_groupAccess().getGroupParserRuleCall_1_3()); 
                                
                            pushFollow(FOLLOW_rulegroup_in_ruleif_group1084);
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
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:420:6: (kw= '#ifndef' this_IDENTIFIER_9= RULE_IDENTIFIER this_new_line_10= rulenew_line (this_group_11= rulegroup )? )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:420:6: (kw= '#ifndef' this_IDENTIFIER_9= RULE_IDENTIFIER this_new_line_10= rulenew_line (this_group_11= rulegroup )? )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:421:2: kw= '#ifndef' this_IDENTIFIER_9= RULE_IDENTIFIER this_new_line_10= rulenew_line (this_group_11= rulegroup )?
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleif_group1112); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getIf_groupAccess().getIfndefKeyword_2_0()); 
                        
                    this_IDENTIFIER_9=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleif_group1127); 

                    		current.merge(this_IDENTIFIER_9);
                        
                     
                        newLeafNode(this_IDENTIFIER_9, grammarAccess.getIf_groupAccess().getIDENTIFIERTerminalRuleCall_2_1()); 
                        
                     
                            newCompositeNode(grammarAccess.getIf_groupAccess().getNew_lineParserRuleCall_2_2()); 
                        
                    pushFollow(FOLLOW_rulenew_line_in_ruleif_group1154);
                    this_new_line_10=rulenew_line();

                    state._fsp--;


                    		current.merge(this_new_line_10);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:444:1: (this_group_11= rulegroup )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( ((LA9_0>=19 && LA9_0<=22)||LA9_0==25||(LA9_0>=28 && LA9_0<=29)||(LA9_0>=31 && LA9_0<=35)) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:445:5: this_group_11= rulegroup
                            {
                             
                                    newCompositeNode(grammarAccess.getIf_groupAccess().getGroupParserRuleCall_2_3()); 
                                
                            pushFollow(FOLLOW_rulegroup_in_ruleif_group1182);
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:463:1: entryRuleelif_groups returns [String current=null] : iv_ruleelif_groups= ruleelif_groups EOF ;
    public final String entryRuleelif_groups() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleelif_groups = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:464:2: (iv_ruleelif_groups= ruleelif_groups EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:465:2: iv_ruleelif_groups= ruleelif_groups EOF
            {
             newCompositeNode(grammarAccess.getElif_groupsRule()); 
            pushFollow(FOLLOW_ruleelif_groups_in_entryRuleelif_groups1231);
            iv_ruleelif_groups=ruleelif_groups();

            state._fsp--;

             current =iv_ruleelif_groups.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleelif_groups1242); 

            }

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:472:1: ruleelif_groups returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_elif_group_0= ruleelif_group )+ ;
    public final AntlrDatatypeRuleToken ruleelif_groups() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_elif_group_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:475:28: ( (this_elif_group_0= ruleelif_group )+ )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:476:1: (this_elif_group_0= ruleelif_group )+
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:476:1: (this_elif_group_0= ruleelif_group )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==23) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:477:5: this_elif_group_0= ruleelif_group
            	    {
            	     
            	            newCompositeNode(grammarAccess.getElif_groupsAccess().getElif_groupParserRuleCall()); 
            	        
            	    pushFollow(FOLLOW_ruleelif_group_in_ruleelif_groups1289);
            	    this_elif_group_0=ruleelif_group();

            	    state._fsp--;


            	    		current.merge(this_elif_group_0);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:495:1: entryRuleelif_group returns [String current=null] : iv_ruleelif_group= ruleelif_group EOF ;
    public final String entryRuleelif_group() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleelif_group = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:496:2: (iv_ruleelif_group= ruleelif_group EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:497:2: iv_ruleelif_group= ruleelif_group EOF
            {
             newCompositeNode(grammarAccess.getElif_groupRule()); 
            pushFollow(FOLLOW_ruleelif_group_in_entryRuleelif_group1336);
            iv_ruleelif_group=ruleelif_group();

            state._fsp--;

             current =iv_ruleelif_group.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleelif_group1347); 

            }

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:504:1: ruleelif_group returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '#elif' this_constant_expression_1= ruleconstant_expression this_new_line_2= rulenew_line (this_group_3= rulegroup )? ) ;
    public final AntlrDatatypeRuleToken ruleelif_group() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_constant_expression_1 = null;

        AntlrDatatypeRuleToken this_new_line_2 = null;

        AntlrDatatypeRuleToken this_group_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:507:28: ( (kw= '#elif' this_constant_expression_1= ruleconstant_expression this_new_line_2= rulenew_line (this_group_3= rulegroup )? ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:508:1: (kw= '#elif' this_constant_expression_1= ruleconstant_expression this_new_line_2= rulenew_line (this_group_3= rulegroup )? )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:508:1: (kw= '#elif' this_constant_expression_1= ruleconstant_expression this_new_line_2= rulenew_line (this_group_3= rulegroup )? )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:509:2: kw= '#elif' this_constant_expression_1= ruleconstant_expression this_new_line_2= rulenew_line (this_group_3= rulegroup )?
            {
            kw=(Token)match(input,23,FOLLOW_23_in_ruleelif_group1385); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getElif_groupAccess().getElifKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getElif_groupAccess().getConstant_expressionParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleconstant_expression_in_ruleelif_group1407);
            this_constant_expression_1=ruleconstant_expression();

            state._fsp--;


            		current.merge(this_constant_expression_1);
                
             
                    afterParserOrEnumRuleCall();
                
             
                    newCompositeNode(grammarAccess.getElif_groupAccess().getNew_lineParserRuleCall_2()); 
                
            pushFollow(FOLLOW_rulenew_line_in_ruleelif_group1434);
            this_new_line_2=rulenew_line();

            state._fsp--;


            		current.merge(this_new_line_2);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:536:1: (this_group_3= rulegroup )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=19 && LA12_0<=22)||LA12_0==25||(LA12_0>=28 && LA12_0<=29)||(LA12_0>=31 && LA12_0<=35)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:537:5: this_group_3= rulegroup
                    {
                     
                            newCompositeNode(grammarAccess.getElif_groupAccess().getGroupParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_rulegroup_in_ruleelif_group1462);
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:555:1: entryRuleconstant_expression returns [String current=null] : iv_ruleconstant_expression= ruleconstant_expression EOF ;
    public final String entryRuleconstant_expression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleconstant_expression = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:556:2: (iv_ruleconstant_expression= ruleconstant_expression EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:557:2: iv_ruleconstant_expression= ruleconstant_expression EOF
            {
             newCompositeNode(grammarAccess.getConstant_expressionRule()); 
            pushFollow(FOLLOW_ruleconstant_expression_in_entryRuleconstant_expression1510);
            iv_ruleconstant_expression=ruleconstant_expression();

            state._fsp--;

             current =iv_ruleconstant_expression.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleconstant_expression1521); 

            }

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:564:1: ruleconstant_expression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '==' ;
    public final AntlrDatatypeRuleToken ruleconstant_expression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:567:28: (kw= '==' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:569:2: kw= '=='
            {
            kw=(Token)match(input,24,FOLLOW_24_in_ruleconstant_expression1558); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:582:1: entryRulepreprocessing_token returns [String current=null] : iv_rulepreprocessing_token= rulepreprocessing_token EOF ;
    public final String entryRulepreprocessing_token() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulepreprocessing_token = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:583:2: (iv_rulepreprocessing_token= rulepreprocessing_token EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:584:2: iv_rulepreprocessing_token= rulepreprocessing_token EOF
            {
             newCompositeNode(grammarAccess.getPreprocessing_tokenRule()); 
            pushFollow(FOLLOW_rulepreprocessing_token_in_entryRulepreprocessing_token1598);
            iv_rulepreprocessing_token=rulepreprocessing_token();

            state._fsp--;

             current =iv_rulepreprocessing_token.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulepreprocessing_token1609); 

            }

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:591:1: rulepreprocessing_token returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '!=' ;
    public final AntlrDatatypeRuleToken rulepreprocessing_token() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:594:28: (kw= '!=' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:596:2: kw= '!='
            {
            kw=(Token)match(input,25,FOLLOW_25_in_rulepreprocessing_token1646); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getPreprocessing_tokenAccess().getExclamationMarkEqualsSignKeyword()); 
                

            }

             leaveRule(); 
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:609:1: entryRuleelse_group returns [String current=null] : iv_ruleelse_group= ruleelse_group EOF ;
    public final String entryRuleelse_group() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleelse_group = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:610:2: (iv_ruleelse_group= ruleelse_group EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:611:2: iv_ruleelse_group= ruleelse_group EOF
            {
             newCompositeNode(grammarAccess.getElse_groupRule()); 
            pushFollow(FOLLOW_ruleelse_group_in_entryRuleelse_group1686);
            iv_ruleelse_group=ruleelse_group();

            state._fsp--;

             current =iv_ruleelse_group.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleelse_group1697); 

            }

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:618:1: ruleelse_group returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '#else' this_new_line_1= rulenew_line (this_group_2= rulegroup )? ) ;
    public final AntlrDatatypeRuleToken ruleelse_group() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_new_line_1 = null;

        AntlrDatatypeRuleToken this_group_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:621:28: ( (kw= '#else' this_new_line_1= rulenew_line (this_group_2= rulegroup )? ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:622:1: (kw= '#else' this_new_line_1= rulenew_line (this_group_2= rulegroup )? )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:622:1: (kw= '#else' this_new_line_1= rulenew_line (this_group_2= rulegroup )? )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:623:2: kw= '#else' this_new_line_1= rulenew_line (this_group_2= rulegroup )?
            {
            kw=(Token)match(input,26,FOLLOW_26_in_ruleelse_group1735); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getElse_groupAccess().getElseKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getElse_groupAccess().getNew_lineParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulenew_line_in_ruleelse_group1757);
            this_new_line_1=rulenew_line();

            state._fsp--;


            		current.merge(this_new_line_1);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:639:1: (this_group_2= rulegroup )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=19 && LA13_0<=22)||LA13_0==25||(LA13_0>=28 && LA13_0<=29)||(LA13_0>=31 && LA13_0<=35)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:640:5: this_group_2= rulegroup
                    {
                     
                            newCompositeNode(grammarAccess.getElse_groupAccess().getGroupParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_rulegroup_in_ruleelse_group1785);
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:658:1: entryRuleendif_line returns [String current=null] : iv_ruleendif_line= ruleendif_line EOF ;
    public final String entryRuleendif_line() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleendif_line = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:659:2: (iv_ruleendif_line= ruleendif_line EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:660:2: iv_ruleendif_line= ruleendif_line EOF
            {
             newCompositeNode(grammarAccess.getEndif_lineRule()); 
            pushFollow(FOLLOW_ruleendif_line_in_entryRuleendif_line1833);
            iv_ruleendif_line=ruleendif_line();

            state._fsp--;

             current =iv_ruleendif_line.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleendif_line1844); 

            }

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:667:1: ruleendif_line returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '#endif' this_new_line_1= rulenew_line ) ;
    public final AntlrDatatypeRuleToken ruleendif_line() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_new_line_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:670:28: ( (kw= '#endif' this_new_line_1= rulenew_line ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:671:1: (kw= '#endif' this_new_line_1= rulenew_line )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:671:1: (kw= '#endif' this_new_line_1= rulenew_line )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:672:2: kw= '#endif' this_new_line_1= rulenew_line
            {
            kw=(Token)match(input,27,FOLLOW_27_in_ruleendif_line1882); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEndif_lineAccess().getEndifKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getEndif_lineAccess().getNew_lineParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulenew_line_in_ruleendif_line1904);
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:696:1: entryRulecontrol_line returns [String current=null] : iv_rulecontrol_line= rulecontrol_line EOF ;
    public final String entryRulecontrol_line() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecontrol_line = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:697:2: (iv_rulecontrol_line= rulecontrol_line EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:698:2: iv_rulecontrol_line= rulecontrol_line EOF
            {
             newCompositeNode(grammarAccess.getControl_lineRule()); 
            pushFollow(FOLLOW_rulecontrol_line_in_entryRulecontrol_line1950);
            iv_rulecontrol_line=rulecontrol_line();

            state._fsp--;

             current =iv_rulecontrol_line.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecontrol_line1961); 

            }

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:705:1: rulecontrol_line returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '#include' this_pp_tokens_1= rulepp_tokens this_new_line_2= rulenew_line ) | (kw= '#define' this_IDENTIFIER_4= RULE_IDENTIFIER this_replacement_list_5= rulereplacement_list this_new_line_6= rulenew_line ) | (kw= '#define' this_IDENTIFIER_8= RULE_IDENTIFIER this_lparen_9= rulelparen (this_IDENTIFIER_10= RULE_IDENTIFIER )? kw= ')' this_replacement_list_12= rulereplacement_list this_new_line_13= rulenew_line ) | (kw= '#undef' this_IDENTIFIER_15= RULE_IDENTIFIER this_new_line_16= rulenew_line ) | (kw= '#line' this_pp_tokens_18= rulepp_tokens this_new_line_19= rulenew_line ) | (kw= '#error' (this_pp_tokens_21= rulepp_tokens )? this_new_line_22= rulenew_line ) | (kw= '#pragma' (this_pp_tokens_24= rulepp_tokens )? this_new_line_25= rulenew_line ) | (kw= '#' this_new_line_27= rulenew_line ) ) ;
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
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:708:28: ( ( (kw= '#include' this_pp_tokens_1= rulepp_tokens this_new_line_2= rulenew_line ) | (kw= '#define' this_IDENTIFIER_4= RULE_IDENTIFIER this_replacement_list_5= rulereplacement_list this_new_line_6= rulenew_line ) | (kw= '#define' this_IDENTIFIER_8= RULE_IDENTIFIER this_lparen_9= rulelparen (this_IDENTIFIER_10= RULE_IDENTIFIER )? kw= ')' this_replacement_list_12= rulereplacement_list this_new_line_13= rulenew_line ) | (kw= '#undef' this_IDENTIFIER_15= RULE_IDENTIFIER this_new_line_16= rulenew_line ) | (kw= '#line' this_pp_tokens_18= rulepp_tokens this_new_line_19= rulenew_line ) | (kw= '#error' (this_pp_tokens_21= rulepp_tokens )? this_new_line_22= rulenew_line ) | (kw= '#pragma' (this_pp_tokens_24= rulepp_tokens )? this_new_line_25= rulenew_line ) | (kw= '#' this_new_line_27= rulenew_line ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:709:1: ( (kw= '#include' this_pp_tokens_1= rulepp_tokens this_new_line_2= rulenew_line ) | (kw= '#define' this_IDENTIFIER_4= RULE_IDENTIFIER this_replacement_list_5= rulereplacement_list this_new_line_6= rulenew_line ) | (kw= '#define' this_IDENTIFIER_8= RULE_IDENTIFIER this_lparen_9= rulelparen (this_IDENTIFIER_10= RULE_IDENTIFIER )? kw= ')' this_replacement_list_12= rulereplacement_list this_new_line_13= rulenew_line ) | (kw= '#undef' this_IDENTIFIER_15= RULE_IDENTIFIER this_new_line_16= rulenew_line ) | (kw= '#line' this_pp_tokens_18= rulepp_tokens this_new_line_19= rulenew_line ) | (kw= '#error' (this_pp_tokens_21= rulepp_tokens )? this_new_line_22= rulenew_line ) | (kw= '#pragma' (this_pp_tokens_24= rulepp_tokens )? this_new_line_25= rulenew_line ) | (kw= '#' this_new_line_27= rulenew_line ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:709:1: ( (kw= '#include' this_pp_tokens_1= rulepp_tokens this_new_line_2= rulenew_line ) | (kw= '#define' this_IDENTIFIER_4= RULE_IDENTIFIER this_replacement_list_5= rulereplacement_list this_new_line_6= rulenew_line ) | (kw= '#define' this_IDENTIFIER_8= RULE_IDENTIFIER this_lparen_9= rulelparen (this_IDENTIFIER_10= RULE_IDENTIFIER )? kw= ')' this_replacement_list_12= rulereplacement_list this_new_line_13= rulenew_line ) | (kw= '#undef' this_IDENTIFIER_15= RULE_IDENTIFIER this_new_line_16= rulenew_line ) | (kw= '#line' this_pp_tokens_18= rulepp_tokens this_new_line_19= rulenew_line ) | (kw= '#error' (this_pp_tokens_21= rulepp_tokens )? this_new_line_22= rulenew_line ) | (kw= '#pragma' (this_pp_tokens_24= rulepp_tokens )? this_new_line_25= rulenew_line ) | (kw= '#' this_new_line_27= rulenew_line ) )
            int alt17=8;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:709:2: (kw= '#include' this_pp_tokens_1= rulepp_tokens this_new_line_2= rulenew_line )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:709:2: (kw= '#include' this_pp_tokens_1= rulepp_tokens this_new_line_2= rulenew_line )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:710:2: kw= '#include' this_pp_tokens_1= rulepp_tokens this_new_line_2= rulenew_line
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_rulecontrol_line2000); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getControl_lineAccess().getIncludeKeyword_0_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getControl_lineAccess().getPp_tokensParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_rulepp_tokens_in_rulecontrol_line2022);
                    this_pp_tokens_1=rulepp_tokens();

                    state._fsp--;


                    		current.merge(this_pp_tokens_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                     
                            newCompositeNode(grammarAccess.getControl_lineAccess().getNew_lineParserRuleCall_0_2()); 
                        
                    pushFollow(FOLLOW_rulenew_line_in_rulecontrol_line2049);
                    this_new_line_2=rulenew_line();

                    state._fsp--;


                    		current.merge(this_new_line_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:738:6: (kw= '#define' this_IDENTIFIER_4= RULE_IDENTIFIER this_replacement_list_5= rulereplacement_list this_new_line_6= rulenew_line )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:738:6: (kw= '#define' this_IDENTIFIER_4= RULE_IDENTIFIER this_replacement_list_5= rulereplacement_list this_new_line_6= rulenew_line )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:739:2: kw= '#define' this_IDENTIFIER_4= RULE_IDENTIFIER this_replacement_list_5= rulereplacement_list this_new_line_6= rulenew_line
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_rulecontrol_line2075); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getControl_lineAccess().getDefineKeyword_1_0()); 
                        
                    this_IDENTIFIER_4=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulecontrol_line2090); 

                    		current.merge(this_IDENTIFIER_4);
                        
                     
                        newLeafNode(this_IDENTIFIER_4, grammarAccess.getControl_lineAccess().getIDENTIFIERTerminalRuleCall_1_1()); 
                        
                     
                            newCompositeNode(grammarAccess.getControl_lineAccess().getReplacement_listParserRuleCall_1_2()); 
                        
                    pushFollow(FOLLOW_rulereplacement_list_in_rulecontrol_line2117);
                    this_replacement_list_5=rulereplacement_list();

                    state._fsp--;


                    		current.merge(this_replacement_list_5);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                     
                            newCompositeNode(grammarAccess.getControl_lineAccess().getNew_lineParserRuleCall_1_3()); 
                        
                    pushFollow(FOLLOW_rulenew_line_in_rulecontrol_line2144);
                    this_new_line_6=rulenew_line();

                    state._fsp--;


                    		current.merge(this_new_line_6);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:774:6: (kw= '#define' this_IDENTIFIER_8= RULE_IDENTIFIER this_lparen_9= rulelparen (this_IDENTIFIER_10= RULE_IDENTIFIER )? kw= ')' this_replacement_list_12= rulereplacement_list this_new_line_13= rulenew_line )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:774:6: (kw= '#define' this_IDENTIFIER_8= RULE_IDENTIFIER this_lparen_9= rulelparen (this_IDENTIFIER_10= RULE_IDENTIFIER )? kw= ')' this_replacement_list_12= rulereplacement_list this_new_line_13= rulenew_line )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:775:2: kw= '#define' this_IDENTIFIER_8= RULE_IDENTIFIER this_lparen_9= rulelparen (this_IDENTIFIER_10= RULE_IDENTIFIER )? kw= ')' this_replacement_list_12= rulereplacement_list this_new_line_13= rulenew_line
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_rulecontrol_line2170); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getControl_lineAccess().getDefineKeyword_2_0()); 
                        
                    this_IDENTIFIER_8=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulecontrol_line2185); 

                    		current.merge(this_IDENTIFIER_8);
                        
                     
                        newLeafNode(this_IDENTIFIER_8, grammarAccess.getControl_lineAccess().getIDENTIFIERTerminalRuleCall_2_1()); 
                        
                     
                            newCompositeNode(grammarAccess.getControl_lineAccess().getLparenParserRuleCall_2_2()); 
                        
                    pushFollow(FOLLOW_rulelparen_in_rulecontrol_line2212);
                    this_lparen_9=rulelparen();

                    state._fsp--;


                    		current.merge(this_lparen_9);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:798:1: (this_IDENTIFIER_10= RULE_IDENTIFIER )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==RULE_IDENTIFIER) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:798:6: this_IDENTIFIER_10= RULE_IDENTIFIER
                            {
                            this_IDENTIFIER_10=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulecontrol_line2233); 

                            		current.merge(this_IDENTIFIER_10);
                                
                             
                                newLeafNode(this_IDENTIFIER_10, grammarAccess.getControl_lineAccess().getIDENTIFIERTerminalRuleCall_2_3()); 
                                

                            }
                            break;

                    }

                    kw=(Token)match(input,30,FOLLOW_30_in_rulecontrol_line2253); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getControl_lineAccess().getRightParenthesisKeyword_2_4()); 
                        
                     
                            newCompositeNode(grammarAccess.getControl_lineAccess().getReplacement_listParserRuleCall_2_5()); 
                        
                    pushFollow(FOLLOW_rulereplacement_list_in_rulecontrol_line2275);
                    this_replacement_list_12=rulereplacement_list();

                    state._fsp--;


                    		current.merge(this_replacement_list_12);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                     
                            newCompositeNode(grammarAccess.getControl_lineAccess().getNew_lineParserRuleCall_2_6()); 
                        
                    pushFollow(FOLLOW_rulenew_line_in_rulecontrol_line2302);
                    this_new_line_13=rulenew_line();

                    state._fsp--;


                    		current.merge(this_new_line_13);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:834:6: (kw= '#undef' this_IDENTIFIER_15= RULE_IDENTIFIER this_new_line_16= rulenew_line )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:834:6: (kw= '#undef' this_IDENTIFIER_15= RULE_IDENTIFIER this_new_line_16= rulenew_line )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:835:2: kw= '#undef' this_IDENTIFIER_15= RULE_IDENTIFIER this_new_line_16= rulenew_line
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_rulecontrol_line2328); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getControl_lineAccess().getUndefKeyword_3_0()); 
                        
                    this_IDENTIFIER_15=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulecontrol_line2343); 

                    		current.merge(this_IDENTIFIER_15);
                        
                     
                        newLeafNode(this_IDENTIFIER_15, grammarAccess.getControl_lineAccess().getIDENTIFIERTerminalRuleCall_3_1()); 
                        
                     
                            newCompositeNode(grammarAccess.getControl_lineAccess().getNew_lineParserRuleCall_3_2()); 
                        
                    pushFollow(FOLLOW_rulenew_line_in_rulecontrol_line2370);
                    this_new_line_16=rulenew_line();

                    state._fsp--;


                    		current.merge(this_new_line_16);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:859:6: (kw= '#line' this_pp_tokens_18= rulepp_tokens this_new_line_19= rulenew_line )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:859:6: (kw= '#line' this_pp_tokens_18= rulepp_tokens this_new_line_19= rulenew_line )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:860:2: kw= '#line' this_pp_tokens_18= rulepp_tokens this_new_line_19= rulenew_line
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_rulecontrol_line2396); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getControl_lineAccess().getLineKeyword_4_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getControl_lineAccess().getPp_tokensParserRuleCall_4_1()); 
                        
                    pushFollow(FOLLOW_rulepp_tokens_in_rulecontrol_line2418);
                    this_pp_tokens_18=rulepp_tokens();

                    state._fsp--;


                    		current.merge(this_pp_tokens_18);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                     
                            newCompositeNode(grammarAccess.getControl_lineAccess().getNew_lineParserRuleCall_4_2()); 
                        
                    pushFollow(FOLLOW_rulenew_line_in_rulecontrol_line2445);
                    this_new_line_19=rulenew_line();

                    state._fsp--;


                    		current.merge(this_new_line_19);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:888:6: (kw= '#error' (this_pp_tokens_21= rulepp_tokens )? this_new_line_22= rulenew_line )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:888:6: (kw= '#error' (this_pp_tokens_21= rulepp_tokens )? this_new_line_22= rulenew_line )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:889:2: kw= '#error' (this_pp_tokens_21= rulepp_tokens )? this_new_line_22= rulenew_line
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_rulecontrol_line2471); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getControl_lineAccess().getErrorKeyword_5_0()); 
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:894:1: (this_pp_tokens_21= rulepp_tokens )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==25) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:895:5: this_pp_tokens_21= rulepp_tokens
                            {
                             
                                    newCompositeNode(grammarAccess.getControl_lineAccess().getPp_tokensParserRuleCall_5_1()); 
                                
                            pushFollow(FOLLOW_rulepp_tokens_in_rulecontrol_line2494);
                            this_pp_tokens_21=rulepp_tokens();

                            state._fsp--;


                            		current.merge(this_pp_tokens_21);
                                
                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                     
                            newCompositeNode(grammarAccess.getControl_lineAccess().getNew_lineParserRuleCall_5_2()); 
                        
                    pushFollow(FOLLOW_rulenew_line_in_rulecontrol_line2523);
                    this_new_line_22=rulenew_line();

                    state._fsp--;


                    		current.merge(this_new_line_22);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:917:6: (kw= '#pragma' (this_pp_tokens_24= rulepp_tokens )? this_new_line_25= rulenew_line )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:917:6: (kw= '#pragma' (this_pp_tokens_24= rulepp_tokens )? this_new_line_25= rulenew_line )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:918:2: kw= '#pragma' (this_pp_tokens_24= rulepp_tokens )? this_new_line_25= rulenew_line
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_rulecontrol_line2549); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getControl_lineAccess().getPragmaKeyword_6_0()); 
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:923:1: (this_pp_tokens_24= rulepp_tokens )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==25) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:924:5: this_pp_tokens_24= rulepp_tokens
                            {
                             
                                    newCompositeNode(grammarAccess.getControl_lineAccess().getPp_tokensParserRuleCall_6_1()); 
                                
                            pushFollow(FOLLOW_rulepp_tokens_in_rulecontrol_line2572);
                            this_pp_tokens_24=rulepp_tokens();

                            state._fsp--;


                            		current.merge(this_pp_tokens_24);
                                
                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                     
                            newCompositeNode(grammarAccess.getControl_lineAccess().getNew_lineParserRuleCall_6_2()); 
                        
                    pushFollow(FOLLOW_rulenew_line_in_rulecontrol_line2601);
                    this_new_line_25=rulenew_line();

                    state._fsp--;


                    		current.merge(this_new_line_25);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:946:6: (kw= '#' this_new_line_27= rulenew_line )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:946:6: (kw= '#' this_new_line_27= rulenew_line )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:947:2: kw= '#' this_new_line_27= rulenew_line
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_rulecontrol_line2627); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getControl_lineAccess().getNumberSignKeyword_7_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getControl_lineAccess().getNew_lineParserRuleCall_7_1()); 
                        
                    pushFollow(FOLLOW_rulenew_line_in_rulecontrol_line2649);
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:971:1: entryRulelparen returns [String current=null] : iv_rulelparen= rulelparen EOF ;
    public final String entryRulelparen() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulelparen = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:972:2: (iv_rulelparen= rulelparen EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:973:2: iv_rulelparen= rulelparen EOF
            {
             newCompositeNode(grammarAccess.getLparenRule()); 
            pushFollow(FOLLOW_rulelparen_in_entryRulelparen2696);
            iv_rulelparen=rulelparen();

            state._fsp--;

             current =iv_rulelparen.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulelparen2707); 

            }

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:980:1: rulelparen returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '(' ;
    public final AntlrDatatypeRuleToken rulelparen() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:983:28: (kw= '(' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:985:2: kw= '('
            {
            kw=(Token)match(input,36,FOLLOW_36_in_rulelparen2744); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:998:1: entryRulereplacement_list returns [String current=null] : iv_rulereplacement_list= rulereplacement_list EOF ;
    public final String entryRulereplacement_list() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulereplacement_list = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:999:2: (iv_rulereplacement_list= rulereplacement_list EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1000:2: iv_rulereplacement_list= rulereplacement_list EOF
            {
             newCompositeNode(grammarAccess.getReplacement_listRule()); 
            pushFollow(FOLLOW_rulereplacement_list_in_entryRulereplacement_list2784);
            iv_rulereplacement_list=rulereplacement_list();

            state._fsp--;

             current =iv_rulereplacement_list.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulereplacement_list2795); 

            }

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1007:1: rulereplacement_list returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_pp_tokens_0= rulepp_tokens )? ;
    public final AntlrDatatypeRuleToken rulereplacement_list() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_pp_tokens_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1010:28: ( (this_pp_tokens_0= rulepp_tokens )? )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1011:1: (this_pp_tokens_0= rulepp_tokens )?
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1011:1: (this_pp_tokens_0= rulepp_tokens )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==25) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1012:5: this_pp_tokens_0= rulepp_tokens
                    {
                     
                            newCompositeNode(grammarAccess.getReplacement_listAccess().getPp_tokensParserRuleCall()); 
                        
                    pushFollow(FOLLOW_rulepp_tokens_in_rulereplacement_list2842);
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1030:1: entryRulepp_tokens returns [String current=null] : iv_rulepp_tokens= rulepp_tokens EOF ;
    public final String entryRulepp_tokens() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulepp_tokens = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1031:2: (iv_rulepp_tokens= rulepp_tokens EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1032:2: iv_rulepp_tokens= rulepp_tokens EOF
            {
             newCompositeNode(grammarAccess.getPp_tokensRule()); 
            pushFollow(FOLLOW_rulepp_tokens_in_entryRulepp_tokens2889);
            iv_rulepp_tokens=rulepp_tokens();

            state._fsp--;

             current =iv_rulepp_tokens.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulepp_tokens2900); 

            }

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1039:1: rulepp_tokens returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_preprocessing_token_0= rulepreprocessing_token )+ ;
    public final AntlrDatatypeRuleToken rulepp_tokens() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_preprocessing_token_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1042:28: ( (this_preprocessing_token_0= rulepreprocessing_token )+ )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1043:1: (this_preprocessing_token_0= rulepreprocessing_token )+
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1043:1: (this_preprocessing_token_0= rulepreprocessing_token )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==25) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1044:5: this_preprocessing_token_0= rulepreprocessing_token
            	    {
            	     
            	            newCompositeNode(grammarAccess.getPp_tokensAccess().getPreprocessing_tokenParserRuleCall()); 
            	        
            	    pushFollow(FOLLOW_rulepreprocessing_token_in_rulepp_tokens2947);
            	    this_preprocessing_token_0=rulepreprocessing_token();

            	    state._fsp--;


            	    		current.merge(this_preprocessing_token_0);
            	        
            	     
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


            }

             leaveRule(); 
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


    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA17_eotS =
        "\13\uffff";
    static final String DFA17_eofS =
        "\13\uffff";
    static final String DFA17_minS =
        "\1\34\1\uffff\1\4\5\uffff\1\23\2\uffff";
    static final String DFA17_maxS =
        "\1\43\1\uffff\1\4\5\uffff\1\44\2\uffff";
    static final String DFA17_acceptS =
        "\1\uffff\1\1\1\uffff\1\4\1\5\1\6\1\7\1\10\1\uffff\1\2\1\3";
    static final String DFA17_specialS =
        "\13\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\1\1\2\1\uffff\1\3\1\4\1\5\1\6\1\7",
            "",
            "\1\10",
            "",
            "",
            "",
            "",
            "",
            "\1\11\5\uffff\1\11\12\uffff\1\12",
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
            return "709:1: ( (kw= '#include' this_pp_tokens_1= rulepp_tokens this_new_line_2= rulenew_line ) | (kw= '#define' this_IDENTIFIER_4= RULE_IDENTIFIER this_replacement_list_5= rulereplacement_list this_new_line_6= rulenew_line ) | (kw= '#define' this_IDENTIFIER_8= RULE_IDENTIFIER this_lparen_9= rulelparen (this_IDENTIFIER_10= RULE_IDENTIFIER )? kw= ')' this_replacement_list_12= rulereplacement_list this_new_line_13= rulenew_line ) | (kw= '#undef' this_IDENTIFIER_15= RULE_IDENTIFIER this_new_line_16= rulenew_line ) | (kw= '#line' this_pp_tokens_18= rulepp_tokens this_new_line_19= rulenew_line ) | (kw= '#error' (this_pp_tokens_21= rulepp_tokens )? this_new_line_22= rulenew_line ) | (kw= '#pragma' (this_pp_tokens_24= rulepp_tokens )? this_new_line_25= rulenew_line ) | (kw= '#' this_new_line_27= rulenew_line ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepreprocessing_file_in_ruleModel130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenew_line_in_entryRulenew_line168 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenew_line179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rulenew_line216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepreprocessing_file_in_entryRulepreprocessing_file256 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepreprocessing_file267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegroup_in_rulepreprocessing_file314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegroup_in_entryRulegroup361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulegroup372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegroup_part_in_rulegroup419 = new BitSet(new long[]{0x0000000FB2780002L});
    public static final BitSet FOLLOW_rulegroup_part_in_entryRulegroup_part466 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulegroup_part477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepp_tokens_in_rulegroup_part526 = new BitSet(new long[]{0x0000000002080000L});
    public static final BitSet FOLLOW_rulenew_line_in_rulegroup_part555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleif_action_in_rulegroup_part589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecontrol_line_in_rulegroup_part622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleif_action_in_entryRuleif_action668 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleif_action679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleif_group_in_ruleif_action726 = new BitSet(new long[]{0x000000000C800000L});
    public static final BitSet FOLLOW_ruleelif_groups_in_ruleif_action754 = new BitSet(new long[]{0x000000000C800000L});
    public static final BitSet FOLLOW_ruleelse_group_in_ruleif_action784 = new BitSet(new long[]{0x000000000C800000L});
    public static final BitSet FOLLOW_ruleendif_line_in_ruleif_action813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleif_group_in_entryRuleif_group859 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleif_group870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleif_group909 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleconstant_expression_in_ruleif_group931 = new BitSet(new long[]{0x0000000002080000L});
    public static final BitSet FOLLOW_rulenew_line_in_ruleif_group958 = new BitSet(new long[]{0x0000000FB2780002L});
    public static final BitSet FOLLOW_rulegroup_in_ruleif_group986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleif_group1014 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleif_group1029 = new BitSet(new long[]{0x0000000002080000L});
    public static final BitSet FOLLOW_rulenew_line_in_ruleif_group1056 = new BitSet(new long[]{0x0000000FB2780002L});
    public static final BitSet FOLLOW_rulegroup_in_ruleif_group1084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleif_group1112 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleif_group1127 = new BitSet(new long[]{0x0000000002080000L});
    public static final BitSet FOLLOW_rulenew_line_in_ruleif_group1154 = new BitSet(new long[]{0x0000000FB2780002L});
    public static final BitSet FOLLOW_rulegroup_in_ruleif_group1182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleelif_groups_in_entryRuleelif_groups1231 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleelif_groups1242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleelif_group_in_ruleelif_groups1289 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleelif_group_in_entryRuleelif_group1336 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleelif_group1347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleelif_group1385 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleconstant_expression_in_ruleelif_group1407 = new BitSet(new long[]{0x0000000002080000L});
    public static final BitSet FOLLOW_rulenew_line_in_ruleelif_group1434 = new BitSet(new long[]{0x0000000FB2780002L});
    public static final BitSet FOLLOW_rulegroup_in_ruleelif_group1462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstant_expression_in_entryRuleconstant_expression1510 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleconstant_expression1521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleconstant_expression1558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepreprocessing_token_in_entryRulepreprocessing_token1598 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepreprocessing_token1609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rulepreprocessing_token1646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleelse_group_in_entryRuleelse_group1686 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleelse_group1697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleelse_group1735 = new BitSet(new long[]{0x0000000002080000L});
    public static final BitSet FOLLOW_rulenew_line_in_ruleelse_group1757 = new BitSet(new long[]{0x0000000FB2780002L});
    public static final BitSet FOLLOW_rulegroup_in_ruleelse_group1785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleendif_line_in_entryRuleendif_line1833 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleendif_line1844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleendif_line1882 = new BitSet(new long[]{0x0000000002080000L});
    public static final BitSet FOLLOW_rulenew_line_in_ruleendif_line1904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecontrol_line_in_entryRulecontrol_line1950 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecontrol_line1961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rulecontrol_line2000 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rulepp_tokens_in_rulecontrol_line2022 = new BitSet(new long[]{0x0000000002080000L});
    public static final BitSet FOLLOW_rulenew_line_in_rulecontrol_line2049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rulecontrol_line2075 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulecontrol_line2090 = new BitSet(new long[]{0x0000000002080000L});
    public static final BitSet FOLLOW_rulereplacement_list_in_rulecontrol_line2117 = new BitSet(new long[]{0x0000000002080000L});
    public static final BitSet FOLLOW_rulenew_line_in_rulecontrol_line2144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rulecontrol_line2170 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulecontrol_line2185 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rulelparen_in_rulecontrol_line2212 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulecontrol_line2233 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_rulecontrol_line2253 = new BitSet(new long[]{0x0000000002080000L});
    public static final BitSet FOLLOW_rulereplacement_list_in_rulecontrol_line2275 = new BitSet(new long[]{0x0000000002080000L});
    public static final BitSet FOLLOW_rulenew_line_in_rulecontrol_line2302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rulecontrol_line2328 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulecontrol_line2343 = new BitSet(new long[]{0x0000000002080000L});
    public static final BitSet FOLLOW_rulenew_line_in_rulecontrol_line2370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rulecontrol_line2396 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rulepp_tokens_in_rulecontrol_line2418 = new BitSet(new long[]{0x0000000002080000L});
    public static final BitSet FOLLOW_rulenew_line_in_rulecontrol_line2445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rulecontrol_line2471 = new BitSet(new long[]{0x0000000002080000L});
    public static final BitSet FOLLOW_rulepp_tokens_in_rulecontrol_line2494 = new BitSet(new long[]{0x0000000002080000L});
    public static final BitSet FOLLOW_rulenew_line_in_rulecontrol_line2523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rulecontrol_line2549 = new BitSet(new long[]{0x0000000002080000L});
    public static final BitSet FOLLOW_rulepp_tokens_in_rulecontrol_line2572 = new BitSet(new long[]{0x0000000002080000L});
    public static final BitSet FOLLOW_rulenew_line_in_rulecontrol_line2601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rulecontrol_line2627 = new BitSet(new long[]{0x0000000002080000L});
    public static final BitSet FOLLOW_rulenew_line_in_rulecontrol_line2649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelparen_in_entryRulelparen2696 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulelparen2707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rulelparen2744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulereplacement_list_in_entryRulereplacement_list2784 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulereplacement_list2795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepp_tokens_in_rulereplacement_list2842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepp_tokens_in_entryRulepp_tokens2889 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepp_tokens2900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepreprocessing_token_in_rulepp_tokens2947 = new BitSet(new long[]{0x0000000002000002L});

}