package org.xtext.example.mydsl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_IDENTIFIER", "RULE_HEADERNAME", "RULE_PPNUMBER", "RULE_PPOPORPUNC", "RULE_STRING", "RULE_INTEGERLITERAL", "RULE_BOOLEANLITERAL", "RULE_POINTERLITERAL", "RULE_LITERAL", "RULE_KEYWORD", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'=='", "'('", "'\\n'", "'\\r\\n'", "'#if'", "'#ifdef'", "'#ifndef'", "'#elif'", "'#else'", "'#endif'", "'#include'", "'#define'", "')'", "'#undef'", "'#line'", "'#error'", "'#pragma'", "'#'"
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
    public String getGrammarFileName() { return "../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g"; }


     
     	private MyDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:61:1: ( ruleModel EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:69:1: ruleModel : ( ( rule__Model__GreetingsAssignment ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:73:2: ( ( ( rule__Model__GreetingsAssignment ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( rule__Model__GreetingsAssignment ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( rule__Model__GreetingsAssignment ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:75:1: ( rule__Model__GreetingsAssignment )
            {
             before(grammarAccess.getModelAccess().getGreetingsAssignment()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:76:1: ( rule__Model__GreetingsAssignment )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:76:2: rule__Model__GreetingsAssignment
            {
            pushFollow(FOLLOW_rule__Model__GreetingsAssignment_in_ruleModel94);
            rule__Model__GreetingsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGreetingsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulenew_line"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:90:1: entryRulenew_line : rulenew_line EOF ;
    public final void entryRulenew_line() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:91:1: ( rulenew_line EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:92:1: rulenew_line EOF
            {
             before(grammarAccess.getNew_lineRule()); 
            pushFollow(FOLLOW_rulenew_line_in_entryRulenew_line123);
            rulenew_line();

            state._fsp--;

             after(grammarAccess.getNew_lineRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulenew_line130); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulenew_line"


    // $ANTLR start "rulenew_line"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:99:1: rulenew_line : ( ( rule__New_line__Alternatives ) ) ;
    public final void rulenew_line() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:103:2: ( ( ( rule__New_line__Alternatives ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:104:1: ( ( rule__New_line__Alternatives ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:104:1: ( ( rule__New_line__Alternatives ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:105:1: ( rule__New_line__Alternatives )
            {
             before(grammarAccess.getNew_lineAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:106:1: ( rule__New_line__Alternatives )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:106:2: rule__New_line__Alternatives
            {
            pushFollow(FOLLOW_rule__New_line__Alternatives_in_rulenew_line156);
            rule__New_line__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNew_lineAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulenew_line"


    // $ANTLR start "entryRulepreprocessing_file"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:118:1: entryRulepreprocessing_file : rulepreprocessing_file EOF ;
    public final void entryRulepreprocessing_file() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:119:1: ( rulepreprocessing_file EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:120:1: rulepreprocessing_file EOF
            {
             before(grammarAccess.getPreprocessing_fileRule()); 
            pushFollow(FOLLOW_rulepreprocessing_file_in_entryRulepreprocessing_file183);
            rulepreprocessing_file();

            state._fsp--;

             after(grammarAccess.getPreprocessing_fileRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulepreprocessing_file190); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulepreprocessing_file"


    // $ANTLR start "rulepreprocessing_file"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:127:1: rulepreprocessing_file : ( ( rulegroup )? ) ;
    public final void rulepreprocessing_file() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:131:2: ( ( ( rulegroup )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:132:1: ( ( rulegroup )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:132:1: ( ( rulegroup )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:133:1: ( rulegroup )?
            {
             before(grammarAccess.getPreprocessing_fileAccess().getGroupParserRuleCall()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:134:1: ( rulegroup )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=RULE_IDENTIFIER && LA1_0<=RULE_PPOPORPUNC)||(LA1_0>=22 && LA1_0<=26)||(LA1_0>=30 && LA1_0<=31)||(LA1_0>=33 && LA1_0<=37)) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:134:3: rulegroup
                    {
                    pushFollow(FOLLOW_rulegroup_in_rulepreprocessing_file217);
                    rulegroup();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPreprocessing_fileAccess().getGroupParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulepreprocessing_file"


    // $ANTLR start "entryRulegroup"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:146:1: entryRulegroup : rulegroup EOF ;
    public final void entryRulegroup() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:147:1: ( rulegroup EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:148:1: rulegroup EOF
            {
             before(grammarAccess.getGroupRule()); 
            pushFollow(FOLLOW_rulegroup_in_entryRulegroup245);
            rulegroup();

            state._fsp--;

             after(grammarAccess.getGroupRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulegroup252); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulegroup"


    // $ANTLR start "rulegroup"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:155:1: rulegroup : ( ( ( rulegroup_part ) ) ( ( rulegroup_part )* ) ) ;
    public final void rulegroup() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:159:2: ( ( ( ( rulegroup_part ) ) ( ( rulegroup_part )* ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:160:1: ( ( ( rulegroup_part ) ) ( ( rulegroup_part )* ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:160:1: ( ( ( rulegroup_part ) ) ( ( rulegroup_part )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:161:1: ( ( rulegroup_part ) ) ( ( rulegroup_part )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:161:1: ( ( rulegroup_part ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:162:1: ( rulegroup_part )
            {
             before(grammarAccess.getGroupAccess().getGroup_partParserRuleCall()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:163:1: ( rulegroup_part )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:163:3: rulegroup_part
            {
            pushFollow(FOLLOW_rulegroup_part_in_rulegroup281);
            rulegroup_part();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getGroup_partParserRuleCall()); 

            }

            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:166:1: ( ( rulegroup_part )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:167:1: ( rulegroup_part )*
            {
             before(grammarAccess.getGroupAccess().getGroup_partParserRuleCall()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:168:1: ( rulegroup_part )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RULE_IDENTIFIER && LA2_0<=RULE_PPOPORPUNC)||(LA2_0>=22 && LA2_0<=26)||(LA2_0>=30 && LA2_0<=31)||(LA2_0>=33 && LA2_0<=37)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:168:3: rulegroup_part
            	    {
            	    pushFollow(FOLLOW_rulegroup_part_in_rulegroup294);
            	    rulegroup_part();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getGroupAccess().getGroup_partParserRuleCall()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulegroup"


    // $ANTLR start "entryRulegroup_part"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:181:1: entryRulegroup_part : rulegroup_part EOF ;
    public final void entryRulegroup_part() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:182:1: ( rulegroup_part EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:183:1: rulegroup_part EOF
            {
             before(grammarAccess.getGroup_partRule()); 
            pushFollow(FOLLOW_rulegroup_part_in_entryRulegroup_part324);
            rulegroup_part();

            state._fsp--;

             after(grammarAccess.getGroup_partRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulegroup_part331); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulegroup_part"


    // $ANTLR start "rulegroup_part"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:190:1: rulegroup_part : ( ( rule__Group_part__Alternatives ) ) ;
    public final void rulegroup_part() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:194:2: ( ( ( rule__Group_part__Alternatives ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:195:1: ( ( rule__Group_part__Alternatives ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:195:1: ( ( rule__Group_part__Alternatives ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:196:1: ( rule__Group_part__Alternatives )
            {
             before(grammarAccess.getGroup_partAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:197:1: ( rule__Group_part__Alternatives )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:197:2: rule__Group_part__Alternatives
            {
            pushFollow(FOLLOW_rule__Group_part__Alternatives_in_rulegroup_part357);
            rule__Group_part__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGroup_partAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulegroup_part"


    // $ANTLR start "entryRuleif_action"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:209:1: entryRuleif_action : ruleif_action EOF ;
    public final void entryRuleif_action() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:210:1: ( ruleif_action EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:211:1: ruleif_action EOF
            {
             before(grammarAccess.getIf_actionRule()); 
            pushFollow(FOLLOW_ruleif_action_in_entryRuleif_action384);
            ruleif_action();

            state._fsp--;

             after(grammarAccess.getIf_actionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleif_action391); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleif_action"


    // $ANTLR start "ruleif_action"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:218:1: ruleif_action : ( ( rule__If_action__Group__0 ) ) ;
    public final void ruleif_action() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:222:2: ( ( ( rule__If_action__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:223:1: ( ( rule__If_action__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:223:1: ( ( rule__If_action__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:224:1: ( rule__If_action__Group__0 )
            {
             before(grammarAccess.getIf_actionAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:225:1: ( rule__If_action__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:225:2: rule__If_action__Group__0
            {
            pushFollow(FOLLOW_rule__If_action__Group__0_in_ruleif_action417);
            rule__If_action__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIf_actionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleif_action"


    // $ANTLR start "entryRuleif_group"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:237:1: entryRuleif_group : ruleif_group EOF ;
    public final void entryRuleif_group() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:238:1: ( ruleif_group EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:239:1: ruleif_group EOF
            {
             before(grammarAccess.getIf_groupRule()); 
            pushFollow(FOLLOW_ruleif_group_in_entryRuleif_group444);
            ruleif_group();

            state._fsp--;

             after(grammarAccess.getIf_groupRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleif_group451); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleif_group"


    // $ANTLR start "ruleif_group"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:246:1: ruleif_group : ( ( rule__If_group__Alternatives ) ) ;
    public final void ruleif_group() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:250:2: ( ( ( rule__If_group__Alternatives ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:251:1: ( ( rule__If_group__Alternatives ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:251:1: ( ( rule__If_group__Alternatives ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:252:1: ( rule__If_group__Alternatives )
            {
             before(grammarAccess.getIf_groupAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:253:1: ( rule__If_group__Alternatives )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:253:2: rule__If_group__Alternatives
            {
            pushFollow(FOLLOW_rule__If_group__Alternatives_in_ruleif_group477);
            rule__If_group__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getIf_groupAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleif_group"


    // $ANTLR start "entryRuleelif_groups"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:265:1: entryRuleelif_groups : ruleelif_groups EOF ;
    public final void entryRuleelif_groups() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:266:1: ( ruleelif_groups EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:267:1: ruleelif_groups EOF
            {
             before(grammarAccess.getElif_groupsRule()); 
            pushFollow(FOLLOW_ruleelif_groups_in_entryRuleelif_groups504);
            ruleelif_groups();

            state._fsp--;

             after(grammarAccess.getElif_groupsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleelif_groups511); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleelif_groups"


    // $ANTLR start "ruleelif_groups"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:274:1: ruleelif_groups : ( ( ( ruleelif_group ) ) ( ( ruleelif_group )* ) ) ;
    public final void ruleelif_groups() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:278:2: ( ( ( ( ruleelif_group ) ) ( ( ruleelif_group )* ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:279:1: ( ( ( ruleelif_group ) ) ( ( ruleelif_group )* ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:279:1: ( ( ( ruleelif_group ) ) ( ( ruleelif_group )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:280:1: ( ( ruleelif_group ) ) ( ( ruleelif_group )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:280:1: ( ( ruleelif_group ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:281:1: ( ruleelif_group )
            {
             before(grammarAccess.getElif_groupsAccess().getElif_groupParserRuleCall()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:282:1: ( ruleelif_group )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:282:3: ruleelif_group
            {
            pushFollow(FOLLOW_ruleelif_group_in_ruleelif_groups540);
            ruleelif_group();

            state._fsp--;


            }

             after(grammarAccess.getElif_groupsAccess().getElif_groupParserRuleCall()); 

            }

            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:285:1: ( ( ruleelif_group )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:286:1: ( ruleelif_group )*
            {
             before(grammarAccess.getElif_groupsAccess().getElif_groupParserRuleCall()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:287:1: ( ruleelif_group )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==27) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:287:3: ruleelif_group
            	    {
            	    pushFollow(FOLLOW_ruleelif_group_in_ruleelif_groups553);
            	    ruleelif_group();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getElif_groupsAccess().getElif_groupParserRuleCall()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleelif_groups"


    // $ANTLR start "entryRuleelif_group"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:300:1: entryRuleelif_group : ruleelif_group EOF ;
    public final void entryRuleelif_group() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:301:1: ( ruleelif_group EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:302:1: ruleelif_group EOF
            {
             before(grammarAccess.getElif_groupRule()); 
            pushFollow(FOLLOW_ruleelif_group_in_entryRuleelif_group583);
            ruleelif_group();

            state._fsp--;

             after(grammarAccess.getElif_groupRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleelif_group590); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleelif_group"


    // $ANTLR start "ruleelif_group"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:309:1: ruleelif_group : ( ( rule__Elif_group__Group__0 ) ) ;
    public final void ruleelif_group() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:313:2: ( ( ( rule__Elif_group__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:314:1: ( ( rule__Elif_group__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:314:1: ( ( rule__Elif_group__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:315:1: ( rule__Elif_group__Group__0 )
            {
             before(grammarAccess.getElif_groupAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:316:1: ( rule__Elif_group__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:316:2: rule__Elif_group__Group__0
            {
            pushFollow(FOLLOW_rule__Elif_group__Group__0_in_ruleelif_group616);
            rule__Elif_group__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getElif_groupAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleelif_group"


    // $ANTLR start "entryRuleconstant_expression"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:328:1: entryRuleconstant_expression : ruleconstant_expression EOF ;
    public final void entryRuleconstant_expression() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:329:1: ( ruleconstant_expression EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:330:1: ruleconstant_expression EOF
            {
             before(grammarAccess.getConstant_expressionRule()); 
            pushFollow(FOLLOW_ruleconstant_expression_in_entryRuleconstant_expression643);
            ruleconstant_expression();

            state._fsp--;

             after(grammarAccess.getConstant_expressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleconstant_expression650); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleconstant_expression"


    // $ANTLR start "ruleconstant_expression"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:337:1: ruleconstant_expression : ( '==' ) ;
    public final void ruleconstant_expression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:341:2: ( ( '==' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:342:1: ( '==' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:342:1: ( '==' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:343:1: '=='
            {
             before(grammarAccess.getConstant_expressionAccess().getEqualsSignEqualsSignKeyword()); 
            match(input,20,FOLLOW_20_in_ruleconstant_expression677); 
             after(grammarAccess.getConstant_expressionAccess().getEqualsSignEqualsSignKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleconstant_expression"


    // $ANTLR start "entryRulepreprocessing_token"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:358:1: entryRulepreprocessing_token : rulepreprocessing_token EOF ;
    public final void entryRulepreprocessing_token() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:359:1: ( rulepreprocessing_token EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:360:1: rulepreprocessing_token EOF
            {
             before(grammarAccess.getPreprocessing_tokenRule()); 
            pushFollow(FOLLOW_rulepreprocessing_token_in_entryRulepreprocessing_token705);
            rulepreprocessing_token();

            state._fsp--;

             after(grammarAccess.getPreprocessing_tokenRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulepreprocessing_token712); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulepreprocessing_token"


    // $ANTLR start "rulepreprocessing_token"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:367:1: rulepreprocessing_token : ( ( rule__Preprocessing_token__Alternatives ) ) ;
    public final void rulepreprocessing_token() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:371:2: ( ( ( rule__Preprocessing_token__Alternatives ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:372:1: ( ( rule__Preprocessing_token__Alternatives ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:372:1: ( ( rule__Preprocessing_token__Alternatives ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:373:1: ( rule__Preprocessing_token__Alternatives )
            {
             before(grammarAccess.getPreprocessing_tokenAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:374:1: ( rule__Preprocessing_token__Alternatives )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:374:2: rule__Preprocessing_token__Alternatives
            {
            pushFollow(FOLLOW_rule__Preprocessing_token__Alternatives_in_rulepreprocessing_token738);
            rule__Preprocessing_token__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPreprocessing_tokenAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulepreprocessing_token"


    // $ANTLR start "entryRuleelse_group"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:386:1: entryRuleelse_group : ruleelse_group EOF ;
    public final void entryRuleelse_group() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:387:1: ( ruleelse_group EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:388:1: ruleelse_group EOF
            {
             before(grammarAccess.getElse_groupRule()); 
            pushFollow(FOLLOW_ruleelse_group_in_entryRuleelse_group765);
            ruleelse_group();

            state._fsp--;

             after(grammarAccess.getElse_groupRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleelse_group772); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleelse_group"


    // $ANTLR start "ruleelse_group"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:395:1: ruleelse_group : ( ( rule__Else_group__Group__0 ) ) ;
    public final void ruleelse_group() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:399:2: ( ( ( rule__Else_group__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:400:1: ( ( rule__Else_group__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:400:1: ( ( rule__Else_group__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:401:1: ( rule__Else_group__Group__0 )
            {
             before(grammarAccess.getElse_groupAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:402:1: ( rule__Else_group__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:402:2: rule__Else_group__Group__0
            {
            pushFollow(FOLLOW_rule__Else_group__Group__0_in_ruleelse_group798);
            rule__Else_group__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getElse_groupAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleelse_group"


    // $ANTLR start "entryRuleendif_line"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:414:1: entryRuleendif_line : ruleendif_line EOF ;
    public final void entryRuleendif_line() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:415:1: ( ruleendif_line EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:416:1: ruleendif_line EOF
            {
             before(grammarAccess.getEndif_lineRule()); 
            pushFollow(FOLLOW_ruleendif_line_in_entryRuleendif_line825);
            ruleendif_line();

            state._fsp--;

             after(grammarAccess.getEndif_lineRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleendif_line832); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleendif_line"


    // $ANTLR start "ruleendif_line"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:423:1: ruleendif_line : ( ( rule__Endif_line__Group__0 ) ) ;
    public final void ruleendif_line() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:427:2: ( ( ( rule__Endif_line__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:428:1: ( ( rule__Endif_line__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:428:1: ( ( rule__Endif_line__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:429:1: ( rule__Endif_line__Group__0 )
            {
             before(grammarAccess.getEndif_lineAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:430:1: ( rule__Endif_line__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:430:2: rule__Endif_line__Group__0
            {
            pushFollow(FOLLOW_rule__Endif_line__Group__0_in_ruleendif_line858);
            rule__Endif_line__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEndif_lineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleendif_line"


    // $ANTLR start "entryRulecontrol_line"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:442:1: entryRulecontrol_line : rulecontrol_line EOF ;
    public final void entryRulecontrol_line() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:443:1: ( rulecontrol_line EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:444:1: rulecontrol_line EOF
            {
             before(grammarAccess.getControl_lineRule()); 
            pushFollow(FOLLOW_rulecontrol_line_in_entryRulecontrol_line885);
            rulecontrol_line();

            state._fsp--;

             after(grammarAccess.getControl_lineRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecontrol_line892); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulecontrol_line"


    // $ANTLR start "rulecontrol_line"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:451:1: rulecontrol_line : ( ( rule__Control_line__Alternatives ) ) ;
    public final void rulecontrol_line() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:455:2: ( ( ( rule__Control_line__Alternatives ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:456:1: ( ( rule__Control_line__Alternatives ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:456:1: ( ( rule__Control_line__Alternatives ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:457:1: ( rule__Control_line__Alternatives )
            {
             before(grammarAccess.getControl_lineAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:458:1: ( rule__Control_line__Alternatives )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:458:2: rule__Control_line__Alternatives
            {
            pushFollow(FOLLOW_rule__Control_line__Alternatives_in_rulecontrol_line918);
            rule__Control_line__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getControl_lineAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulecontrol_line"


    // $ANTLR start "entryRulelparen"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:470:1: entryRulelparen : rulelparen EOF ;
    public final void entryRulelparen() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:471:1: ( rulelparen EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:472:1: rulelparen EOF
            {
             before(grammarAccess.getLparenRule()); 
            pushFollow(FOLLOW_rulelparen_in_entryRulelparen945);
            rulelparen();

            state._fsp--;

             after(grammarAccess.getLparenRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulelparen952); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulelparen"


    // $ANTLR start "rulelparen"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:479:1: rulelparen : ( '(' ) ;
    public final void rulelparen() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:483:2: ( ( '(' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:484:1: ( '(' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:484:1: ( '(' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:485:1: '('
            {
             before(grammarAccess.getLparenAccess().getLeftParenthesisKeyword()); 
            match(input,21,FOLLOW_21_in_rulelparen979); 
             after(grammarAccess.getLparenAccess().getLeftParenthesisKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulelparen"


    // $ANTLR start "entryRulereplacement_list"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:500:1: entryRulereplacement_list : rulereplacement_list EOF ;
    public final void entryRulereplacement_list() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:501:1: ( rulereplacement_list EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:502:1: rulereplacement_list EOF
            {
             before(grammarAccess.getReplacement_listRule()); 
            pushFollow(FOLLOW_rulereplacement_list_in_entryRulereplacement_list1007);
            rulereplacement_list();

            state._fsp--;

             after(grammarAccess.getReplacement_listRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulereplacement_list1014); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulereplacement_list"


    // $ANTLR start "rulereplacement_list"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:509:1: rulereplacement_list : ( ( rulepp_tokens )? ) ;
    public final void rulereplacement_list() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:513:2: ( ( ( rulepp_tokens )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:514:1: ( ( rulepp_tokens )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:514:1: ( ( rulepp_tokens )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:515:1: ( rulepp_tokens )?
            {
             before(grammarAccess.getReplacement_listAccess().getPp_tokensParserRuleCall()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:516:1: ( rulepp_tokens )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=RULE_IDENTIFIER && LA4_0<=RULE_PPOPORPUNC)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:516:3: rulepp_tokens
                    {
                    pushFollow(FOLLOW_rulepp_tokens_in_rulereplacement_list1041);
                    rulepp_tokens();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReplacement_listAccess().getPp_tokensParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulereplacement_list"


    // $ANTLR start "entryRulepp_tokens"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:528:1: entryRulepp_tokens : rulepp_tokens EOF ;
    public final void entryRulepp_tokens() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:529:1: ( rulepp_tokens EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:530:1: rulepp_tokens EOF
            {
             before(grammarAccess.getPp_tokensRule()); 
            pushFollow(FOLLOW_rulepp_tokens_in_entryRulepp_tokens1069);
            rulepp_tokens();

            state._fsp--;

             after(grammarAccess.getPp_tokensRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulepp_tokens1076); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulepp_tokens"


    // $ANTLR start "rulepp_tokens"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:537:1: rulepp_tokens : ( ( ( rulepreprocessing_token ) ) ( ( rulepreprocessing_token )* ) ) ;
    public final void rulepp_tokens() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:541:2: ( ( ( ( rulepreprocessing_token ) ) ( ( rulepreprocessing_token )* ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:542:1: ( ( ( rulepreprocessing_token ) ) ( ( rulepreprocessing_token )* ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:542:1: ( ( ( rulepreprocessing_token ) ) ( ( rulepreprocessing_token )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:543:1: ( ( rulepreprocessing_token ) ) ( ( rulepreprocessing_token )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:543:1: ( ( rulepreprocessing_token ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:544:1: ( rulepreprocessing_token )
            {
             before(grammarAccess.getPp_tokensAccess().getPreprocessing_tokenParserRuleCall()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:545:1: ( rulepreprocessing_token )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:545:3: rulepreprocessing_token
            {
            pushFollow(FOLLOW_rulepreprocessing_token_in_rulepp_tokens1105);
            rulepreprocessing_token();

            state._fsp--;


            }

             after(grammarAccess.getPp_tokensAccess().getPreprocessing_tokenParserRuleCall()); 

            }

            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:548:1: ( ( rulepreprocessing_token )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:549:1: ( rulepreprocessing_token )*
            {
             before(grammarAccess.getPp_tokensAccess().getPreprocessing_tokenParserRuleCall()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:550:1: ( rulepreprocessing_token )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=RULE_IDENTIFIER && LA5_0<=RULE_PPOPORPUNC)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:550:3: rulepreprocessing_token
            	    {
            	    pushFollow(FOLLOW_rulepreprocessing_token_in_rulepp_tokens1118);
            	    rulepreprocessing_token();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getPp_tokensAccess().getPreprocessing_tokenParserRuleCall()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulepp_tokens"


    // $ANTLR start "rule__New_line__Alternatives"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:567:1: rule__New_line__Alternatives : ( ( '\\n' ) | ( '\\r\\n' ) );
    public final void rule__New_line__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:571:1: ( ( '\\n' ) | ( '\\r\\n' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            else if ( (LA6_0==23) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:572:1: ( '\\n' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:572:1: ( '\\n' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:573:1: '\\n'
                    {
                     before(grammarAccess.getNew_lineAccess().getControl000aKeyword_0()); 
                    match(input,22,FOLLOW_22_in_rule__New_line__Alternatives1162); 
                     after(grammarAccess.getNew_lineAccess().getControl000aKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:580:6: ( '\\r\\n' )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:580:6: ( '\\r\\n' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:581:1: '\\r\\n'
                    {
                     before(grammarAccess.getNew_lineAccess().getControl000dControl000aKeyword_1()); 
                    match(input,23,FOLLOW_23_in_rule__New_line__Alternatives1182); 
                     after(grammarAccess.getNew_lineAccess().getControl000dControl000aKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__New_line__Alternatives"


    // $ANTLR start "rule__Group_part__Alternatives"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:593:1: rule__Group_part__Alternatives : ( ( ( rule__Group_part__Group_0__0 ) ) | ( ruleif_action ) | ( rulecontrol_line ) );
    public final void rule__Group_part__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:597:1: ( ( ( rule__Group_part__Group_0__0 ) ) | ( ruleif_action ) | ( rulecontrol_line ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_IDENTIFIER:
            case RULE_HEADERNAME:
            case RULE_PPNUMBER:
            case RULE_PPOPORPUNC:
            case 22:
            case 23:
                {
                alt7=1;
                }
                break;
            case 24:
            case 25:
            case 26:
                {
                alt7=2;
                }
                break;
            case 30:
            case 31:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:598:1: ( ( rule__Group_part__Group_0__0 ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:598:1: ( ( rule__Group_part__Group_0__0 ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:599:1: ( rule__Group_part__Group_0__0 )
                    {
                     before(grammarAccess.getGroup_partAccess().getGroup_0()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:600:1: ( rule__Group_part__Group_0__0 )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:600:2: rule__Group_part__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Group_part__Group_0__0_in_rule__Group_part__Alternatives1216);
                    rule__Group_part__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGroup_partAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:604:6: ( ruleif_action )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:604:6: ( ruleif_action )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:605:1: ruleif_action
                    {
                     before(grammarAccess.getGroup_partAccess().getIf_actionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleif_action_in_rule__Group_part__Alternatives1234);
                    ruleif_action();

                    state._fsp--;

                     after(grammarAccess.getGroup_partAccess().getIf_actionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:610:6: ( rulecontrol_line )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:610:6: ( rulecontrol_line )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:611:1: rulecontrol_line
                    {
                     before(grammarAccess.getGroup_partAccess().getControl_lineParserRuleCall_2()); 
                    pushFollow(FOLLOW_rulecontrol_line_in_rule__Group_part__Alternatives1251);
                    rulecontrol_line();

                    state._fsp--;

                     after(grammarAccess.getGroup_partAccess().getControl_lineParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group_part__Alternatives"


    // $ANTLR start "rule__If_group__Alternatives"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:621:1: rule__If_group__Alternatives : ( ( ( rule__If_group__Group_0__0 ) ) | ( ( rule__If_group__Group_1__0 ) ) | ( ( rule__If_group__Group_2__0 ) ) );
    public final void rule__If_group__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:625:1: ( ( ( rule__If_group__Group_0__0 ) ) | ( ( rule__If_group__Group_1__0 ) ) | ( ( rule__If_group__Group_2__0 ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt8=1;
                }
                break;
            case 25:
                {
                alt8=2;
                }
                break;
            case 26:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:626:1: ( ( rule__If_group__Group_0__0 ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:626:1: ( ( rule__If_group__Group_0__0 ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:627:1: ( rule__If_group__Group_0__0 )
                    {
                     before(grammarAccess.getIf_groupAccess().getGroup_0()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:628:1: ( rule__If_group__Group_0__0 )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:628:2: rule__If_group__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__If_group__Group_0__0_in_rule__If_group__Alternatives1283);
                    rule__If_group__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getIf_groupAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:632:6: ( ( rule__If_group__Group_1__0 ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:632:6: ( ( rule__If_group__Group_1__0 ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:633:1: ( rule__If_group__Group_1__0 )
                    {
                     before(grammarAccess.getIf_groupAccess().getGroup_1()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:634:1: ( rule__If_group__Group_1__0 )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:634:2: rule__If_group__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__If_group__Group_1__0_in_rule__If_group__Alternatives1301);
                    rule__If_group__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getIf_groupAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:638:6: ( ( rule__If_group__Group_2__0 ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:638:6: ( ( rule__If_group__Group_2__0 ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:639:1: ( rule__If_group__Group_2__0 )
                    {
                     before(grammarAccess.getIf_groupAccess().getGroup_2()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:640:1: ( rule__If_group__Group_2__0 )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:640:2: rule__If_group__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__If_group__Group_2__0_in_rule__If_group__Alternatives1319);
                    rule__If_group__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getIf_groupAccess().getGroup_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If_group__Alternatives"


    // $ANTLR start "rule__Preprocessing_token__Alternatives"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:649:1: rule__Preprocessing_token__Alternatives : ( ( RULE_IDENTIFIER ) | ( RULE_HEADERNAME ) | ( RULE_PPNUMBER ) | ( RULE_PPOPORPUNC ) );
    public final void rule__Preprocessing_token__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:653:1: ( ( RULE_IDENTIFIER ) | ( RULE_HEADERNAME ) | ( RULE_PPNUMBER ) | ( RULE_PPOPORPUNC ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case RULE_IDENTIFIER:
                {
                alt9=1;
                }
                break;
            case RULE_HEADERNAME:
                {
                alt9=2;
                }
                break;
            case RULE_PPNUMBER:
                {
                alt9=3;
                }
                break;
            case RULE_PPOPORPUNC:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:654:1: ( RULE_IDENTIFIER )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:654:1: ( RULE_IDENTIFIER )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:655:1: RULE_IDENTIFIER
                    {
                     before(grammarAccess.getPreprocessing_tokenAccess().getIDENTIFIERTerminalRuleCall_0()); 
                    match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rule__Preprocessing_token__Alternatives1352); 
                     after(grammarAccess.getPreprocessing_tokenAccess().getIDENTIFIERTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:660:6: ( RULE_HEADERNAME )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:660:6: ( RULE_HEADERNAME )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:661:1: RULE_HEADERNAME
                    {
                     before(grammarAccess.getPreprocessing_tokenAccess().getHEADERNAMETerminalRuleCall_1()); 
                    match(input,RULE_HEADERNAME,FOLLOW_RULE_HEADERNAME_in_rule__Preprocessing_token__Alternatives1369); 
                     after(grammarAccess.getPreprocessing_tokenAccess().getHEADERNAMETerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:666:6: ( RULE_PPNUMBER )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:666:6: ( RULE_PPNUMBER )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:667:1: RULE_PPNUMBER
                    {
                     before(grammarAccess.getPreprocessing_tokenAccess().getPPNUMBERTerminalRuleCall_2()); 
                    match(input,RULE_PPNUMBER,FOLLOW_RULE_PPNUMBER_in_rule__Preprocessing_token__Alternatives1386); 
                     after(grammarAccess.getPreprocessing_tokenAccess().getPPNUMBERTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:672:6: ( RULE_PPOPORPUNC )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:672:6: ( RULE_PPOPORPUNC )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:673:1: RULE_PPOPORPUNC
                    {
                     before(grammarAccess.getPreprocessing_tokenAccess().getPPOPorPUNCTerminalRuleCall_3()); 
                    match(input,RULE_PPOPORPUNC,FOLLOW_RULE_PPOPORPUNC_in_rule__Preprocessing_token__Alternatives1403); 
                     after(grammarAccess.getPreprocessing_tokenAccess().getPPOPorPUNCTerminalRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Preprocessing_token__Alternatives"


    // $ANTLR start "rule__Control_line__Alternatives"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:683:1: rule__Control_line__Alternatives : ( ( ( rule__Control_line__Group_0__0 ) ) | ( ( rule__Control_line__Group_1__0 ) ) | ( ( rule__Control_line__Group_2__0 ) ) | ( ( rule__Control_line__Group_3__0 ) ) | ( ( rule__Control_line__Group_4__0 ) ) | ( ( rule__Control_line__Group_5__0 ) ) | ( ( rule__Control_line__Group_6__0 ) ) | ( ( rule__Control_line__Group_7__0 ) ) );
    public final void rule__Control_line__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:687:1: ( ( ( rule__Control_line__Group_0__0 ) ) | ( ( rule__Control_line__Group_1__0 ) ) | ( ( rule__Control_line__Group_2__0 ) ) | ( ( rule__Control_line__Group_3__0 ) ) | ( ( rule__Control_line__Group_4__0 ) ) | ( ( rule__Control_line__Group_5__0 ) ) | ( ( rule__Control_line__Group_6__0 ) ) | ( ( rule__Control_line__Group_7__0 ) ) )
            int alt10=8;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:688:1: ( ( rule__Control_line__Group_0__0 ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:688:1: ( ( rule__Control_line__Group_0__0 ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:689:1: ( rule__Control_line__Group_0__0 )
                    {
                     before(grammarAccess.getControl_lineAccess().getGroup_0()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:690:1: ( rule__Control_line__Group_0__0 )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:690:2: rule__Control_line__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Control_line__Group_0__0_in_rule__Control_line__Alternatives1435);
                    rule__Control_line__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getControl_lineAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:694:6: ( ( rule__Control_line__Group_1__0 ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:694:6: ( ( rule__Control_line__Group_1__0 ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:695:1: ( rule__Control_line__Group_1__0 )
                    {
                     before(grammarAccess.getControl_lineAccess().getGroup_1()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:696:1: ( rule__Control_line__Group_1__0 )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:696:2: rule__Control_line__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Control_line__Group_1__0_in_rule__Control_line__Alternatives1453);
                    rule__Control_line__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getControl_lineAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:700:6: ( ( rule__Control_line__Group_2__0 ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:700:6: ( ( rule__Control_line__Group_2__0 ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:701:1: ( rule__Control_line__Group_2__0 )
                    {
                     before(grammarAccess.getControl_lineAccess().getGroup_2()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:702:1: ( rule__Control_line__Group_2__0 )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:702:2: rule__Control_line__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Control_line__Group_2__0_in_rule__Control_line__Alternatives1471);
                    rule__Control_line__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getControl_lineAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:706:6: ( ( rule__Control_line__Group_3__0 ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:706:6: ( ( rule__Control_line__Group_3__0 ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:707:1: ( rule__Control_line__Group_3__0 )
                    {
                     before(grammarAccess.getControl_lineAccess().getGroup_3()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:708:1: ( rule__Control_line__Group_3__0 )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:708:2: rule__Control_line__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Control_line__Group_3__0_in_rule__Control_line__Alternatives1489);
                    rule__Control_line__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getControl_lineAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:712:6: ( ( rule__Control_line__Group_4__0 ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:712:6: ( ( rule__Control_line__Group_4__0 ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:713:1: ( rule__Control_line__Group_4__0 )
                    {
                     before(grammarAccess.getControl_lineAccess().getGroup_4()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:714:1: ( rule__Control_line__Group_4__0 )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:714:2: rule__Control_line__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Control_line__Group_4__0_in_rule__Control_line__Alternatives1507);
                    rule__Control_line__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getControl_lineAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:718:6: ( ( rule__Control_line__Group_5__0 ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:718:6: ( ( rule__Control_line__Group_5__0 ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:719:1: ( rule__Control_line__Group_5__0 )
                    {
                     before(grammarAccess.getControl_lineAccess().getGroup_5()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:720:1: ( rule__Control_line__Group_5__0 )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:720:2: rule__Control_line__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Control_line__Group_5__0_in_rule__Control_line__Alternatives1525);
                    rule__Control_line__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getControl_lineAccess().getGroup_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:724:6: ( ( rule__Control_line__Group_6__0 ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:724:6: ( ( rule__Control_line__Group_6__0 ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:725:1: ( rule__Control_line__Group_6__0 )
                    {
                     before(grammarAccess.getControl_lineAccess().getGroup_6()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:726:1: ( rule__Control_line__Group_6__0 )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:726:2: rule__Control_line__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Control_line__Group_6__0_in_rule__Control_line__Alternatives1543);
                    rule__Control_line__Group_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getControl_lineAccess().getGroup_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:730:6: ( ( rule__Control_line__Group_7__0 ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:730:6: ( ( rule__Control_line__Group_7__0 ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:731:1: ( rule__Control_line__Group_7__0 )
                    {
                     before(grammarAccess.getControl_lineAccess().getGroup_7()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:732:1: ( rule__Control_line__Group_7__0 )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:732:2: rule__Control_line__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Control_line__Group_7__0_in_rule__Control_line__Alternatives1561);
                    rule__Control_line__Group_7__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getControl_lineAccess().getGroup_7()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Control_line__Alternatives"


    // $ANTLR start "rule__Group_part__Group_0__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:746:1: rule__Group_part__Group_0__0 : rule__Group_part__Group_0__0__Impl rule__Group_part__Group_0__1 ;
    public final void rule__Group_part__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:750:1: ( rule__Group_part__Group_0__0__Impl rule__Group_part__Group_0__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:751:2: rule__Group_part__Group_0__0__Impl rule__Group_part__Group_0__1
            {
            pushFollow(FOLLOW_rule__Group_part__Group_0__0__Impl_in_rule__Group_part__Group_0__01595);
            rule__Group_part__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Group_part__Group_0__1_in_rule__Group_part__Group_0__01598);
            rule__Group_part__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group_part__Group_0__0"


    // $ANTLR start "rule__Group_part__Group_0__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:758:1: rule__Group_part__Group_0__0__Impl : ( ( rulepp_tokens )? ) ;
    public final void rule__Group_part__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:762:1: ( ( ( rulepp_tokens )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:763:1: ( ( rulepp_tokens )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:763:1: ( ( rulepp_tokens )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:764:1: ( rulepp_tokens )?
            {
             before(grammarAccess.getGroup_partAccess().getPp_tokensParserRuleCall_0_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:765:1: ( rulepp_tokens )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=RULE_IDENTIFIER && LA11_0<=RULE_PPOPORPUNC)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:765:3: rulepp_tokens
                    {
                    pushFollow(FOLLOW_rulepp_tokens_in_rule__Group_part__Group_0__0__Impl1626);
                    rulepp_tokens();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGroup_partAccess().getPp_tokensParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group_part__Group_0__0__Impl"


    // $ANTLR start "rule__Group_part__Group_0__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:775:1: rule__Group_part__Group_0__1 : rule__Group_part__Group_0__1__Impl ;
    public final void rule__Group_part__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:779:1: ( rule__Group_part__Group_0__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:780:2: rule__Group_part__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Group_part__Group_0__1__Impl_in_rule__Group_part__Group_0__11657);
            rule__Group_part__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group_part__Group_0__1"


    // $ANTLR start "rule__Group_part__Group_0__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:786:1: rule__Group_part__Group_0__1__Impl : ( rulenew_line ) ;
    public final void rule__Group_part__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:790:1: ( ( rulenew_line ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:791:1: ( rulenew_line )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:791:1: ( rulenew_line )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:792:1: rulenew_line
            {
             before(grammarAccess.getGroup_partAccess().getNew_lineParserRuleCall_0_1()); 
            pushFollow(FOLLOW_rulenew_line_in_rule__Group_part__Group_0__1__Impl1684);
            rulenew_line();

            state._fsp--;

             after(grammarAccess.getGroup_partAccess().getNew_lineParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group_part__Group_0__1__Impl"


    // $ANTLR start "rule__If_action__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:807:1: rule__If_action__Group__0 : rule__If_action__Group__0__Impl rule__If_action__Group__1 ;
    public final void rule__If_action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:811:1: ( rule__If_action__Group__0__Impl rule__If_action__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:812:2: rule__If_action__Group__0__Impl rule__If_action__Group__1
            {
            pushFollow(FOLLOW_rule__If_action__Group__0__Impl_in_rule__If_action__Group__01717);
            rule__If_action__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__If_action__Group__1_in_rule__If_action__Group__01720);
            rule__If_action__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If_action__Group__0"


    // $ANTLR start "rule__If_action__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:819:1: rule__If_action__Group__0__Impl : ( ruleif_group ) ;
    public final void rule__If_action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:823:1: ( ( ruleif_group ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:824:1: ( ruleif_group )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:824:1: ( ruleif_group )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:825:1: ruleif_group
            {
             before(grammarAccess.getIf_actionAccess().getIf_groupParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleif_group_in_rule__If_action__Group__0__Impl1747);
            ruleif_group();

            state._fsp--;

             after(grammarAccess.getIf_actionAccess().getIf_groupParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If_action__Group__0__Impl"


    // $ANTLR start "rule__If_action__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:836:1: rule__If_action__Group__1 : rule__If_action__Group__1__Impl rule__If_action__Group__2 ;
    public final void rule__If_action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:840:1: ( rule__If_action__Group__1__Impl rule__If_action__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:841:2: rule__If_action__Group__1__Impl rule__If_action__Group__2
            {
            pushFollow(FOLLOW_rule__If_action__Group__1__Impl_in_rule__If_action__Group__11776);
            rule__If_action__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__If_action__Group__2_in_rule__If_action__Group__11779);
            rule__If_action__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If_action__Group__1"


    // $ANTLR start "rule__If_action__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:848:1: rule__If_action__Group__1__Impl : ( ( ruleelif_groups )? ) ;
    public final void rule__If_action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:852:1: ( ( ( ruleelif_groups )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:853:1: ( ( ruleelif_groups )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:853:1: ( ( ruleelif_groups )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:854:1: ( ruleelif_groups )?
            {
             before(grammarAccess.getIf_actionAccess().getElif_groupsParserRuleCall_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:855:1: ( ruleelif_groups )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:855:3: ruleelif_groups
                    {
                    pushFollow(FOLLOW_ruleelif_groups_in_rule__If_action__Group__1__Impl1807);
                    ruleelif_groups();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIf_actionAccess().getElif_groupsParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If_action__Group__1__Impl"


    // $ANTLR start "rule__If_action__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:865:1: rule__If_action__Group__2 : rule__If_action__Group__2__Impl rule__If_action__Group__3 ;
    public final void rule__If_action__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:869:1: ( rule__If_action__Group__2__Impl rule__If_action__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:870:2: rule__If_action__Group__2__Impl rule__If_action__Group__3
            {
            pushFollow(FOLLOW_rule__If_action__Group__2__Impl_in_rule__If_action__Group__21838);
            rule__If_action__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__If_action__Group__3_in_rule__If_action__Group__21841);
            rule__If_action__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If_action__Group__2"


    // $ANTLR start "rule__If_action__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:877:1: rule__If_action__Group__2__Impl : ( ( ruleelse_group )? ) ;
    public final void rule__If_action__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:881:1: ( ( ( ruleelse_group )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:882:1: ( ( ruleelse_group )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:882:1: ( ( ruleelse_group )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:883:1: ( ruleelse_group )?
            {
             before(grammarAccess.getIf_actionAccess().getElse_groupParserRuleCall_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:884:1: ( ruleelse_group )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:884:3: ruleelse_group
                    {
                    pushFollow(FOLLOW_ruleelse_group_in_rule__If_action__Group__2__Impl1869);
                    ruleelse_group();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIf_actionAccess().getElse_groupParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If_action__Group__2__Impl"


    // $ANTLR start "rule__If_action__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:894:1: rule__If_action__Group__3 : rule__If_action__Group__3__Impl ;
    public final void rule__If_action__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:898:1: ( rule__If_action__Group__3__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:899:2: rule__If_action__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__If_action__Group__3__Impl_in_rule__If_action__Group__31900);
            rule__If_action__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If_action__Group__3"


    // $ANTLR start "rule__If_action__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:905:1: rule__If_action__Group__3__Impl : ( ruleendif_line ) ;
    public final void rule__If_action__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:909:1: ( ( ruleendif_line ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:910:1: ( ruleendif_line )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:910:1: ( ruleendif_line )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:911:1: ruleendif_line
            {
             before(grammarAccess.getIf_actionAccess().getEndif_lineParserRuleCall_3()); 
            pushFollow(FOLLOW_ruleendif_line_in_rule__If_action__Group__3__Impl1927);
            ruleendif_line();

            state._fsp--;

             after(grammarAccess.getIf_actionAccess().getEndif_lineParserRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If_action__Group__3__Impl"


    // $ANTLR start "rule__If_group__Group_0__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:930:1: rule__If_group__Group_0__0 : rule__If_group__Group_0__0__Impl rule__If_group__Group_0__1 ;
    public final void rule__If_group__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:934:1: ( rule__If_group__Group_0__0__Impl rule__If_group__Group_0__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:935:2: rule__If_group__Group_0__0__Impl rule__If_group__Group_0__1
            {
            pushFollow(FOLLOW_rule__If_group__Group_0__0__Impl_in_rule__If_group__Group_0__01964);
            rule__If_group__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__If_group__Group_0__1_in_rule__If_group__Group_0__01967);
            rule__If_group__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If_group__Group_0__0"


    // $ANTLR start "rule__If_group__Group_0__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:942:1: rule__If_group__Group_0__0__Impl : ( '#if' ) ;
    public final void rule__If_group__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:946:1: ( ( '#if' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:947:1: ( '#if' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:947:1: ( '#if' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:948:1: '#if'
            {
             before(grammarAccess.getIf_groupAccess().getIfKeyword_0_0()); 
            match(input,24,FOLLOW_24_in_rule__If_group__Group_0__0__Impl1995); 
             after(grammarAccess.getIf_groupAccess().getIfKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If_group__Group_0__0__Impl"


    // $ANTLR start "rule__If_group__Group_0__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:961:1: rule__If_group__Group_0__1 : rule__If_group__Group_0__1__Impl rule__If_group__Group_0__2 ;
    public final void rule__If_group__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:965:1: ( rule__If_group__Group_0__1__Impl rule__If_group__Group_0__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:966:2: rule__If_group__Group_0__1__Impl rule__If_group__Group_0__2
            {
            pushFollow(FOLLOW_rule__If_group__Group_0__1__Impl_in_rule__If_group__Group_0__12026);
            rule__If_group__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__If_group__Group_0__2_in_rule__If_group__Group_0__12029);
            rule__If_group__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If_group__Group_0__1"


    // $ANTLR start "rule__If_group__Group_0__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:973:1: rule__If_group__Group_0__1__Impl : ( ruleconstant_expression ) ;
    public final void rule__If_group__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:977:1: ( ( ruleconstant_expression ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:978:1: ( ruleconstant_expression )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:978:1: ( ruleconstant_expression )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:979:1: ruleconstant_expression
            {
             before(grammarAccess.getIf_groupAccess().getConstant_expressionParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleconstant_expression_in_rule__If_group__Group_0__1__Impl2056);
            ruleconstant_expression();

            state._fsp--;

             after(grammarAccess.getIf_groupAccess().getConstant_expressionParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If_group__Group_0__1__Impl"


    // $ANTLR start "rule__If_group__Group_0__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:990:1: rule__If_group__Group_0__2 : rule__If_group__Group_0__2__Impl rule__If_group__Group_0__3 ;
    public final void rule__If_group__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:994:1: ( rule__If_group__Group_0__2__Impl rule__If_group__Group_0__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:995:2: rule__If_group__Group_0__2__Impl rule__If_group__Group_0__3
            {
            pushFollow(FOLLOW_rule__If_group__Group_0__2__Impl_in_rule__If_group__Group_0__22085);
            rule__If_group__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__If_group__Group_0__3_in_rule__If_group__Group_0__22088);
            rule__If_group__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If_group__Group_0__2"


    // $ANTLR start "rule__If_group__Group_0__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1002:1: rule__If_group__Group_0__2__Impl : ( rulenew_line ) ;
    public final void rule__If_group__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1006:1: ( ( rulenew_line ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1007:1: ( rulenew_line )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1007:1: ( rulenew_line )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1008:1: rulenew_line
            {
             before(grammarAccess.getIf_groupAccess().getNew_lineParserRuleCall_0_2()); 
            pushFollow(FOLLOW_rulenew_line_in_rule__If_group__Group_0__2__Impl2115);
            rulenew_line();

            state._fsp--;

             after(grammarAccess.getIf_groupAccess().getNew_lineParserRuleCall_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If_group__Group_0__2__Impl"


    // $ANTLR start "rule__If_group__Group_0__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1019:1: rule__If_group__Group_0__3 : rule__If_group__Group_0__3__Impl ;
    public final void rule__If_group__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1023:1: ( rule__If_group__Group_0__3__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1024:2: rule__If_group__Group_0__3__Impl
            {
            pushFollow(FOLLOW_rule__If_group__Group_0__3__Impl_in_rule__If_group__Group_0__32144);
            rule__If_group__Group_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If_group__Group_0__3"


    // $ANTLR start "rule__If_group__Group_0__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1030:1: rule__If_group__Group_0__3__Impl : ( ( rulegroup )? ) ;
    public final void rule__If_group__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1034:1: ( ( ( rulegroup )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1035:1: ( ( rulegroup )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1035:1: ( ( rulegroup )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1036:1: ( rulegroup )?
            {
             before(grammarAccess.getIf_groupAccess().getGroupParserRuleCall_0_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1037:1: ( rulegroup )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=RULE_IDENTIFIER && LA14_0<=RULE_PPOPORPUNC)||(LA14_0>=22 && LA14_0<=26)||(LA14_0>=30 && LA14_0<=31)||(LA14_0>=33 && LA14_0<=37)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1037:3: rulegroup
                    {
                    pushFollow(FOLLOW_rulegroup_in_rule__If_group__Group_0__3__Impl2172);
                    rulegroup();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIf_groupAccess().getGroupParserRuleCall_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If_group__Group_0__3__Impl"


    // $ANTLR start "rule__If_group__Group_1__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1055:1: rule__If_group__Group_1__0 : rule__If_group__Group_1__0__Impl rule__If_group__Group_1__1 ;
    public final void rule__If_group__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1059:1: ( rule__If_group__Group_1__0__Impl rule__If_group__Group_1__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1060:2: rule__If_group__Group_1__0__Impl rule__If_group__Group_1__1
            {
            pushFollow(FOLLOW_rule__If_group__Group_1__0__Impl_in_rule__If_group__Group_1__02211);
            rule__If_group__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__If_group__Group_1__1_in_rule__If_group__Group_1__02214);
            rule__If_group__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If_group__Group_1__0"


    // $ANTLR start "rule__If_group__Group_1__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1067:1: rule__If_group__Group_1__0__Impl : ( '#ifdef' ) ;
    public final void rule__If_group__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1071:1: ( ( '#ifdef' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1072:1: ( '#ifdef' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1072:1: ( '#ifdef' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1073:1: '#ifdef'
            {
             before(grammarAccess.getIf_groupAccess().getIfdefKeyword_1_0()); 
            match(input,25,FOLLOW_25_in_rule__If_group__Group_1__0__Impl2242); 
             after(grammarAccess.getIf_groupAccess().getIfdefKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If_group__Group_1__0__Impl"


    // $ANTLR start "rule__If_group__Group_1__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1086:1: rule__If_group__Group_1__1 : rule__If_group__Group_1__1__Impl rule__If_group__Group_1__2 ;
    public final void rule__If_group__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1090:1: ( rule__If_group__Group_1__1__Impl rule__If_group__Group_1__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1091:2: rule__If_group__Group_1__1__Impl rule__If_group__Group_1__2
            {
            pushFollow(FOLLOW_rule__If_group__Group_1__1__Impl_in_rule__If_group__Group_1__12273);
            rule__If_group__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__If_group__Group_1__2_in_rule__If_group__Group_1__12276);
            rule__If_group__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If_group__Group_1__1"


    // $ANTLR start "rule__If_group__Group_1__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1098:1: rule__If_group__Group_1__1__Impl : ( RULE_IDENTIFIER ) ;
    public final void rule__If_group__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1102:1: ( ( RULE_IDENTIFIER ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1103:1: ( RULE_IDENTIFIER )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1103:1: ( RULE_IDENTIFIER )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1104:1: RULE_IDENTIFIER
            {
             before(grammarAccess.getIf_groupAccess().getIDENTIFIERTerminalRuleCall_1_1()); 
            match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rule__If_group__Group_1__1__Impl2303); 
             after(grammarAccess.getIf_groupAccess().getIDENTIFIERTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If_group__Group_1__1__Impl"


    // $ANTLR start "rule__If_group__Group_1__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1115:1: rule__If_group__Group_1__2 : rule__If_group__Group_1__2__Impl rule__If_group__Group_1__3 ;
    public final void rule__If_group__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1119:1: ( rule__If_group__Group_1__2__Impl rule__If_group__Group_1__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1120:2: rule__If_group__Group_1__2__Impl rule__If_group__Group_1__3
            {
            pushFollow(FOLLOW_rule__If_group__Group_1__2__Impl_in_rule__If_group__Group_1__22332);
            rule__If_group__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__If_group__Group_1__3_in_rule__If_group__Group_1__22335);
            rule__If_group__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If_group__Group_1__2"


    // $ANTLR start "rule__If_group__Group_1__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1127:1: rule__If_group__Group_1__2__Impl : ( rulenew_line ) ;
    public final void rule__If_group__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1131:1: ( ( rulenew_line ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1132:1: ( rulenew_line )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1132:1: ( rulenew_line )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1133:1: rulenew_line
            {
             before(grammarAccess.getIf_groupAccess().getNew_lineParserRuleCall_1_2()); 
            pushFollow(FOLLOW_rulenew_line_in_rule__If_group__Group_1__2__Impl2362);
            rulenew_line();

            state._fsp--;

             after(grammarAccess.getIf_groupAccess().getNew_lineParserRuleCall_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If_group__Group_1__2__Impl"


    // $ANTLR start "rule__If_group__Group_1__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1144:1: rule__If_group__Group_1__3 : rule__If_group__Group_1__3__Impl ;
    public final void rule__If_group__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1148:1: ( rule__If_group__Group_1__3__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1149:2: rule__If_group__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__If_group__Group_1__3__Impl_in_rule__If_group__Group_1__32391);
            rule__If_group__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If_group__Group_1__3"


    // $ANTLR start "rule__If_group__Group_1__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1155:1: rule__If_group__Group_1__3__Impl : ( ( rulegroup )? ) ;
    public final void rule__If_group__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1159:1: ( ( ( rulegroup )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1160:1: ( ( rulegroup )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1160:1: ( ( rulegroup )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1161:1: ( rulegroup )?
            {
             before(grammarAccess.getIf_groupAccess().getGroupParserRuleCall_1_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1162:1: ( rulegroup )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=RULE_IDENTIFIER && LA15_0<=RULE_PPOPORPUNC)||(LA15_0>=22 && LA15_0<=26)||(LA15_0>=30 && LA15_0<=31)||(LA15_0>=33 && LA15_0<=37)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1162:3: rulegroup
                    {
                    pushFollow(FOLLOW_rulegroup_in_rule__If_group__Group_1__3__Impl2419);
                    rulegroup();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIf_groupAccess().getGroupParserRuleCall_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If_group__Group_1__3__Impl"


    // $ANTLR start "rule__If_group__Group_2__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1180:1: rule__If_group__Group_2__0 : rule__If_group__Group_2__0__Impl rule__If_group__Group_2__1 ;
    public final void rule__If_group__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1184:1: ( rule__If_group__Group_2__0__Impl rule__If_group__Group_2__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1185:2: rule__If_group__Group_2__0__Impl rule__If_group__Group_2__1
            {
            pushFollow(FOLLOW_rule__If_group__Group_2__0__Impl_in_rule__If_group__Group_2__02458);
            rule__If_group__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__If_group__Group_2__1_in_rule__If_group__Group_2__02461);
            rule__If_group__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If_group__Group_2__0"


    // $ANTLR start "rule__If_group__Group_2__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1192:1: rule__If_group__Group_2__0__Impl : ( '#ifndef' ) ;
    public final void rule__If_group__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1196:1: ( ( '#ifndef' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1197:1: ( '#ifndef' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1197:1: ( '#ifndef' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1198:1: '#ifndef'
            {
             before(grammarAccess.getIf_groupAccess().getIfndefKeyword_2_0()); 
            match(input,26,FOLLOW_26_in_rule__If_group__Group_2__0__Impl2489); 
             after(grammarAccess.getIf_groupAccess().getIfndefKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If_group__Group_2__0__Impl"


    // $ANTLR start "rule__If_group__Group_2__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1211:1: rule__If_group__Group_2__1 : rule__If_group__Group_2__1__Impl rule__If_group__Group_2__2 ;
    public final void rule__If_group__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1215:1: ( rule__If_group__Group_2__1__Impl rule__If_group__Group_2__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1216:2: rule__If_group__Group_2__1__Impl rule__If_group__Group_2__2
            {
            pushFollow(FOLLOW_rule__If_group__Group_2__1__Impl_in_rule__If_group__Group_2__12520);
            rule__If_group__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__If_group__Group_2__2_in_rule__If_group__Group_2__12523);
            rule__If_group__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If_group__Group_2__1"


    // $ANTLR start "rule__If_group__Group_2__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1223:1: rule__If_group__Group_2__1__Impl : ( RULE_IDENTIFIER ) ;
    public final void rule__If_group__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1227:1: ( ( RULE_IDENTIFIER ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1228:1: ( RULE_IDENTIFIER )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1228:1: ( RULE_IDENTIFIER )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1229:1: RULE_IDENTIFIER
            {
             before(grammarAccess.getIf_groupAccess().getIDENTIFIERTerminalRuleCall_2_1()); 
            match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rule__If_group__Group_2__1__Impl2550); 
             after(grammarAccess.getIf_groupAccess().getIDENTIFIERTerminalRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If_group__Group_2__1__Impl"


    // $ANTLR start "rule__If_group__Group_2__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1240:1: rule__If_group__Group_2__2 : rule__If_group__Group_2__2__Impl rule__If_group__Group_2__3 ;
    public final void rule__If_group__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1244:1: ( rule__If_group__Group_2__2__Impl rule__If_group__Group_2__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1245:2: rule__If_group__Group_2__2__Impl rule__If_group__Group_2__3
            {
            pushFollow(FOLLOW_rule__If_group__Group_2__2__Impl_in_rule__If_group__Group_2__22579);
            rule__If_group__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__If_group__Group_2__3_in_rule__If_group__Group_2__22582);
            rule__If_group__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If_group__Group_2__2"


    // $ANTLR start "rule__If_group__Group_2__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1252:1: rule__If_group__Group_2__2__Impl : ( rulenew_line ) ;
    public final void rule__If_group__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1256:1: ( ( rulenew_line ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1257:1: ( rulenew_line )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1257:1: ( rulenew_line )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1258:1: rulenew_line
            {
             before(grammarAccess.getIf_groupAccess().getNew_lineParserRuleCall_2_2()); 
            pushFollow(FOLLOW_rulenew_line_in_rule__If_group__Group_2__2__Impl2609);
            rulenew_line();

            state._fsp--;

             after(grammarAccess.getIf_groupAccess().getNew_lineParserRuleCall_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If_group__Group_2__2__Impl"


    // $ANTLR start "rule__If_group__Group_2__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1269:1: rule__If_group__Group_2__3 : rule__If_group__Group_2__3__Impl ;
    public final void rule__If_group__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1273:1: ( rule__If_group__Group_2__3__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1274:2: rule__If_group__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__If_group__Group_2__3__Impl_in_rule__If_group__Group_2__32638);
            rule__If_group__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If_group__Group_2__3"


    // $ANTLR start "rule__If_group__Group_2__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1280:1: rule__If_group__Group_2__3__Impl : ( ( rulegroup )? ) ;
    public final void rule__If_group__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1284:1: ( ( ( rulegroup )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1285:1: ( ( rulegroup )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1285:1: ( ( rulegroup )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1286:1: ( rulegroup )?
            {
             before(grammarAccess.getIf_groupAccess().getGroupParserRuleCall_2_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1287:1: ( rulegroup )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_IDENTIFIER && LA16_0<=RULE_PPOPORPUNC)||(LA16_0>=22 && LA16_0<=26)||(LA16_0>=30 && LA16_0<=31)||(LA16_0>=33 && LA16_0<=37)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1287:3: rulegroup
                    {
                    pushFollow(FOLLOW_rulegroup_in_rule__If_group__Group_2__3__Impl2666);
                    rulegroup();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIf_groupAccess().getGroupParserRuleCall_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If_group__Group_2__3__Impl"


    // $ANTLR start "rule__Elif_group__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1305:1: rule__Elif_group__Group__0 : rule__Elif_group__Group__0__Impl rule__Elif_group__Group__1 ;
    public final void rule__Elif_group__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1309:1: ( rule__Elif_group__Group__0__Impl rule__Elif_group__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1310:2: rule__Elif_group__Group__0__Impl rule__Elif_group__Group__1
            {
            pushFollow(FOLLOW_rule__Elif_group__Group__0__Impl_in_rule__Elif_group__Group__02705);
            rule__Elif_group__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Elif_group__Group__1_in_rule__Elif_group__Group__02708);
            rule__Elif_group__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Elif_group__Group__0"


    // $ANTLR start "rule__Elif_group__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1317:1: rule__Elif_group__Group__0__Impl : ( '#elif' ) ;
    public final void rule__Elif_group__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1321:1: ( ( '#elif' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1322:1: ( '#elif' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1322:1: ( '#elif' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1323:1: '#elif'
            {
             before(grammarAccess.getElif_groupAccess().getElifKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__Elif_group__Group__0__Impl2736); 
             after(grammarAccess.getElif_groupAccess().getElifKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Elif_group__Group__0__Impl"


    // $ANTLR start "rule__Elif_group__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1336:1: rule__Elif_group__Group__1 : rule__Elif_group__Group__1__Impl rule__Elif_group__Group__2 ;
    public final void rule__Elif_group__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1340:1: ( rule__Elif_group__Group__1__Impl rule__Elif_group__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1341:2: rule__Elif_group__Group__1__Impl rule__Elif_group__Group__2
            {
            pushFollow(FOLLOW_rule__Elif_group__Group__1__Impl_in_rule__Elif_group__Group__12767);
            rule__Elif_group__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Elif_group__Group__2_in_rule__Elif_group__Group__12770);
            rule__Elif_group__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Elif_group__Group__1"


    // $ANTLR start "rule__Elif_group__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1348:1: rule__Elif_group__Group__1__Impl : ( ruleconstant_expression ) ;
    public final void rule__Elif_group__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1352:1: ( ( ruleconstant_expression ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1353:1: ( ruleconstant_expression )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1353:1: ( ruleconstant_expression )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1354:1: ruleconstant_expression
            {
             before(grammarAccess.getElif_groupAccess().getConstant_expressionParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleconstant_expression_in_rule__Elif_group__Group__1__Impl2797);
            ruleconstant_expression();

            state._fsp--;

             after(grammarAccess.getElif_groupAccess().getConstant_expressionParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Elif_group__Group__1__Impl"


    // $ANTLR start "rule__Elif_group__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1365:1: rule__Elif_group__Group__2 : rule__Elif_group__Group__2__Impl rule__Elif_group__Group__3 ;
    public final void rule__Elif_group__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1369:1: ( rule__Elif_group__Group__2__Impl rule__Elif_group__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1370:2: rule__Elif_group__Group__2__Impl rule__Elif_group__Group__3
            {
            pushFollow(FOLLOW_rule__Elif_group__Group__2__Impl_in_rule__Elif_group__Group__22826);
            rule__Elif_group__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Elif_group__Group__3_in_rule__Elif_group__Group__22829);
            rule__Elif_group__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Elif_group__Group__2"


    // $ANTLR start "rule__Elif_group__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1377:1: rule__Elif_group__Group__2__Impl : ( rulenew_line ) ;
    public final void rule__Elif_group__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1381:1: ( ( rulenew_line ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1382:1: ( rulenew_line )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1382:1: ( rulenew_line )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1383:1: rulenew_line
            {
             before(grammarAccess.getElif_groupAccess().getNew_lineParserRuleCall_2()); 
            pushFollow(FOLLOW_rulenew_line_in_rule__Elif_group__Group__2__Impl2856);
            rulenew_line();

            state._fsp--;

             after(grammarAccess.getElif_groupAccess().getNew_lineParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Elif_group__Group__2__Impl"


    // $ANTLR start "rule__Elif_group__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1394:1: rule__Elif_group__Group__3 : rule__Elif_group__Group__3__Impl ;
    public final void rule__Elif_group__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1398:1: ( rule__Elif_group__Group__3__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1399:2: rule__Elif_group__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Elif_group__Group__3__Impl_in_rule__Elif_group__Group__32885);
            rule__Elif_group__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Elif_group__Group__3"


    // $ANTLR start "rule__Elif_group__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1405:1: rule__Elif_group__Group__3__Impl : ( ( rulegroup )? ) ;
    public final void rule__Elif_group__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1409:1: ( ( ( rulegroup )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1410:1: ( ( rulegroup )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1410:1: ( ( rulegroup )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1411:1: ( rulegroup )?
            {
             before(grammarAccess.getElif_groupAccess().getGroupParserRuleCall_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1412:1: ( rulegroup )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=RULE_IDENTIFIER && LA17_0<=RULE_PPOPORPUNC)||(LA17_0>=22 && LA17_0<=26)||(LA17_0>=30 && LA17_0<=31)||(LA17_0>=33 && LA17_0<=37)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1412:3: rulegroup
                    {
                    pushFollow(FOLLOW_rulegroup_in_rule__Elif_group__Group__3__Impl2913);
                    rulegroup();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getElif_groupAccess().getGroupParserRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Elif_group__Group__3__Impl"


    // $ANTLR start "rule__Else_group__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1430:1: rule__Else_group__Group__0 : rule__Else_group__Group__0__Impl rule__Else_group__Group__1 ;
    public final void rule__Else_group__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1434:1: ( rule__Else_group__Group__0__Impl rule__Else_group__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1435:2: rule__Else_group__Group__0__Impl rule__Else_group__Group__1
            {
            pushFollow(FOLLOW_rule__Else_group__Group__0__Impl_in_rule__Else_group__Group__02952);
            rule__Else_group__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Else_group__Group__1_in_rule__Else_group__Group__02955);
            rule__Else_group__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Else_group__Group__0"


    // $ANTLR start "rule__Else_group__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1442:1: rule__Else_group__Group__0__Impl : ( '#else' ) ;
    public final void rule__Else_group__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1446:1: ( ( '#else' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1447:1: ( '#else' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1447:1: ( '#else' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1448:1: '#else'
            {
             before(grammarAccess.getElse_groupAccess().getElseKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__Else_group__Group__0__Impl2983); 
             after(grammarAccess.getElse_groupAccess().getElseKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Else_group__Group__0__Impl"


    // $ANTLR start "rule__Else_group__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1461:1: rule__Else_group__Group__1 : rule__Else_group__Group__1__Impl rule__Else_group__Group__2 ;
    public final void rule__Else_group__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1465:1: ( rule__Else_group__Group__1__Impl rule__Else_group__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1466:2: rule__Else_group__Group__1__Impl rule__Else_group__Group__2
            {
            pushFollow(FOLLOW_rule__Else_group__Group__1__Impl_in_rule__Else_group__Group__13014);
            rule__Else_group__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Else_group__Group__2_in_rule__Else_group__Group__13017);
            rule__Else_group__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Else_group__Group__1"


    // $ANTLR start "rule__Else_group__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1473:1: rule__Else_group__Group__1__Impl : ( rulenew_line ) ;
    public final void rule__Else_group__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1477:1: ( ( rulenew_line ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1478:1: ( rulenew_line )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1478:1: ( rulenew_line )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1479:1: rulenew_line
            {
             before(grammarAccess.getElse_groupAccess().getNew_lineParserRuleCall_1()); 
            pushFollow(FOLLOW_rulenew_line_in_rule__Else_group__Group__1__Impl3044);
            rulenew_line();

            state._fsp--;

             after(grammarAccess.getElse_groupAccess().getNew_lineParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Else_group__Group__1__Impl"


    // $ANTLR start "rule__Else_group__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1490:1: rule__Else_group__Group__2 : rule__Else_group__Group__2__Impl ;
    public final void rule__Else_group__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1494:1: ( rule__Else_group__Group__2__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1495:2: rule__Else_group__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Else_group__Group__2__Impl_in_rule__Else_group__Group__23073);
            rule__Else_group__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Else_group__Group__2"


    // $ANTLR start "rule__Else_group__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1501:1: rule__Else_group__Group__2__Impl : ( ( rulegroup )? ) ;
    public final void rule__Else_group__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1505:1: ( ( ( rulegroup )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1506:1: ( ( rulegroup )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1506:1: ( ( rulegroup )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1507:1: ( rulegroup )?
            {
             before(grammarAccess.getElse_groupAccess().getGroupParserRuleCall_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1508:1: ( rulegroup )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_IDENTIFIER && LA18_0<=RULE_PPOPORPUNC)||(LA18_0>=22 && LA18_0<=26)||(LA18_0>=30 && LA18_0<=31)||(LA18_0>=33 && LA18_0<=37)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1508:3: rulegroup
                    {
                    pushFollow(FOLLOW_rulegroup_in_rule__Else_group__Group__2__Impl3101);
                    rulegroup();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getElse_groupAccess().getGroupParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Else_group__Group__2__Impl"


    // $ANTLR start "rule__Endif_line__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1524:1: rule__Endif_line__Group__0 : rule__Endif_line__Group__0__Impl rule__Endif_line__Group__1 ;
    public final void rule__Endif_line__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1528:1: ( rule__Endif_line__Group__0__Impl rule__Endif_line__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1529:2: rule__Endif_line__Group__0__Impl rule__Endif_line__Group__1
            {
            pushFollow(FOLLOW_rule__Endif_line__Group__0__Impl_in_rule__Endif_line__Group__03138);
            rule__Endif_line__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Endif_line__Group__1_in_rule__Endif_line__Group__03141);
            rule__Endif_line__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Endif_line__Group__0"


    // $ANTLR start "rule__Endif_line__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1536:1: rule__Endif_line__Group__0__Impl : ( '#endif' ) ;
    public final void rule__Endif_line__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1540:1: ( ( '#endif' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1541:1: ( '#endif' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1541:1: ( '#endif' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1542:1: '#endif'
            {
             before(grammarAccess.getEndif_lineAccess().getEndifKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__Endif_line__Group__0__Impl3169); 
             after(grammarAccess.getEndif_lineAccess().getEndifKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Endif_line__Group__0__Impl"


    // $ANTLR start "rule__Endif_line__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1555:1: rule__Endif_line__Group__1 : rule__Endif_line__Group__1__Impl ;
    public final void rule__Endif_line__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1559:1: ( rule__Endif_line__Group__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1560:2: rule__Endif_line__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Endif_line__Group__1__Impl_in_rule__Endif_line__Group__13200);
            rule__Endif_line__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Endif_line__Group__1"


    // $ANTLR start "rule__Endif_line__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1566:1: rule__Endif_line__Group__1__Impl : ( rulenew_line ) ;
    public final void rule__Endif_line__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1570:1: ( ( rulenew_line ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1571:1: ( rulenew_line )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1571:1: ( rulenew_line )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1572:1: rulenew_line
            {
             before(grammarAccess.getEndif_lineAccess().getNew_lineParserRuleCall_1()); 
            pushFollow(FOLLOW_rulenew_line_in_rule__Endif_line__Group__1__Impl3227);
            rulenew_line();

            state._fsp--;

             after(grammarAccess.getEndif_lineAccess().getNew_lineParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Endif_line__Group__1__Impl"


    // $ANTLR start "rule__Control_line__Group_0__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1587:1: rule__Control_line__Group_0__0 : rule__Control_line__Group_0__0__Impl rule__Control_line__Group_0__1 ;
    public final void rule__Control_line__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1591:1: ( rule__Control_line__Group_0__0__Impl rule__Control_line__Group_0__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1592:2: rule__Control_line__Group_0__0__Impl rule__Control_line__Group_0__1
            {
            pushFollow(FOLLOW_rule__Control_line__Group_0__0__Impl_in_rule__Control_line__Group_0__03260);
            rule__Control_line__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Control_line__Group_0__1_in_rule__Control_line__Group_0__03263);
            rule__Control_line__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Control_line__Group_0__0"


    // $ANTLR start "rule__Control_line__Group_0__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1599:1: rule__Control_line__Group_0__0__Impl : ( '#include' ) ;
    public final void rule__Control_line__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1603:1: ( ( '#include' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1604:1: ( '#include' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1604:1: ( '#include' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1605:1: '#include'
            {
             before(grammarAccess.getControl_lineAccess().getIncludeKeyword_0_0()); 
            match(input,30,FOLLOW_30_in_rule__Control_line__Group_0__0__Impl3291); 
             after(grammarAccess.getControl_lineAccess().getIncludeKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Control_line__Group_0__0__Impl"


    // $ANTLR start "rule__Control_line__Group_0__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1618:1: rule__Control_line__Group_0__1 : rule__Control_line__Group_0__1__Impl rule__Control_line__Group_0__2 ;
    public final void rule__Control_line__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1622:1: ( rule__Control_line__Group_0__1__Impl rule__Control_line__Group_0__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1623:2: rule__Control_line__Group_0__1__Impl rule__Control_line__Group_0__2
            {
            pushFollow(FOLLOW_rule__Control_line__Group_0__1__Impl_in_rule__Control_line__Group_0__13322);
            rule__Control_line__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Control_line__Group_0__2_in_rule__Control_line__Group_0__13325);
            rule__Control_line__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Control_line__Group_0__1"


    // $ANTLR start "rule__Control_line__Group_0__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1630:1: rule__Control_line__Group_0__1__Impl : ( rulepp_tokens ) ;
    public final void rule__Control_line__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1634:1: ( ( rulepp_tokens ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1635:1: ( rulepp_tokens )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1635:1: ( rulepp_tokens )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1636:1: rulepp_tokens
            {
             before(grammarAccess.getControl_lineAccess().getPp_tokensParserRuleCall_0_1()); 
            pushFollow(FOLLOW_rulepp_tokens_in_rule__Control_line__Group_0__1__Impl3352);
            rulepp_tokens();

            state._fsp--;

             after(grammarAccess.getControl_lineAccess().getPp_tokensParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Control_line__Group_0__1__Impl"


    // $ANTLR start "rule__Control_line__Group_0__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1647:1: rule__Control_line__Group_0__2 : rule__Control_line__Group_0__2__Impl ;
    public final void rule__Control_line__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1651:1: ( rule__Control_line__Group_0__2__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1652:2: rule__Control_line__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Control_line__Group_0__2__Impl_in_rule__Control_line__Group_0__23381);
            rule__Control_line__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Control_line__Group_0__2"


    // $ANTLR start "rule__Control_line__Group_0__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1658:1: rule__Control_line__Group_0__2__Impl : ( rulenew_line ) ;
    public final void rule__Control_line__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1662:1: ( ( rulenew_line ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1663:1: ( rulenew_line )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1663:1: ( rulenew_line )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1664:1: rulenew_line
            {
             before(grammarAccess.getControl_lineAccess().getNew_lineParserRuleCall_0_2()); 
            pushFollow(FOLLOW_rulenew_line_in_rule__Control_line__Group_0__2__Impl3408);
            rulenew_line();

            state._fsp--;

             after(grammarAccess.getControl_lineAccess().getNew_lineParserRuleCall_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Control_line__Group_0__2__Impl"


    // $ANTLR start "rule__Control_line__Group_1__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1681:1: rule__Control_line__Group_1__0 : rule__Control_line__Group_1__0__Impl rule__Control_line__Group_1__1 ;
    public final void rule__Control_line__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1685:1: ( rule__Control_line__Group_1__0__Impl rule__Control_line__Group_1__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1686:2: rule__Control_line__Group_1__0__Impl rule__Control_line__Group_1__1
            {
            pushFollow(FOLLOW_rule__Control_line__Group_1__0__Impl_in_rule__Control_line__Group_1__03443);
            rule__Control_line__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Control_line__Group_1__1_in_rule__Control_line__Group_1__03446);
            rule__Control_line__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Control_line__Group_1__0"


    // $ANTLR start "rule__Control_line__Group_1__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1693:1: rule__Control_line__Group_1__0__Impl : ( '#define' ) ;
    public final void rule__Control_line__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1697:1: ( ( '#define' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1698:1: ( '#define' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1698:1: ( '#define' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1699:1: '#define'
            {
             before(grammarAccess.getControl_lineAccess().getDefineKeyword_1_0()); 
            match(input,31,FOLLOW_31_in_rule__Control_line__Group_1__0__Impl3474); 
             after(grammarAccess.getControl_lineAccess().getDefineKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Control_line__Group_1__0__Impl"


    // $ANTLR start "rule__Control_line__Group_1__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1712:1: rule__Control_line__Group_1__1 : rule__Control_line__Group_1__1__Impl rule__Control_line__Group_1__2 ;
    public final void rule__Control_line__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1716:1: ( rule__Control_line__Group_1__1__Impl rule__Control_line__Group_1__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1717:2: rule__Control_line__Group_1__1__Impl rule__Control_line__Group_1__2
            {
            pushFollow(FOLLOW_rule__Control_line__Group_1__1__Impl_in_rule__Control_line__Group_1__13505);
            rule__Control_line__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Control_line__Group_1__2_in_rule__Control_line__Group_1__13508);
            rule__Control_line__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Control_line__Group_1__1"


    // $ANTLR start "rule__Control_line__Group_1__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1724:1: rule__Control_line__Group_1__1__Impl : ( RULE_IDENTIFIER ) ;
    public final void rule__Control_line__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1728:1: ( ( RULE_IDENTIFIER ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1729:1: ( RULE_IDENTIFIER )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1729:1: ( RULE_IDENTIFIER )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1730:1: RULE_IDENTIFIER
            {
             before(grammarAccess.getControl_lineAccess().getIDENTIFIERTerminalRuleCall_1_1()); 
            match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rule__Control_line__Group_1__1__Impl3535); 
             after(grammarAccess.getControl_lineAccess().getIDENTIFIERTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Control_line__Group_1__1__Impl"


    // $ANTLR start "rule__Control_line__Group_1__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1741:1: rule__Control_line__Group_1__2 : rule__Control_line__Group_1__2__Impl rule__Control_line__Group_1__3 ;
    public final void rule__Control_line__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1745:1: ( rule__Control_line__Group_1__2__Impl rule__Control_line__Group_1__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1746:2: rule__Control_line__Group_1__2__Impl rule__Control_line__Group_1__3
            {
            pushFollow(FOLLOW_rule__Control_line__Group_1__2__Impl_in_rule__Control_line__Group_1__23564);
            rule__Control_line__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Control_line__Group_1__3_in_rule__Control_line__Group_1__23567);
            rule__Control_line__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Control_line__Group_1__2"


    // $ANTLR start "rule__Control_line__Group_1__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1753:1: rule__Control_line__Group_1__2__Impl : ( rulereplacement_list ) ;
    public final void rule__Control_line__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1757:1: ( ( rulereplacement_list ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1758:1: ( rulereplacement_list )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1758:1: ( rulereplacement_list )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1759:1: rulereplacement_list
            {
             before(grammarAccess.getControl_lineAccess().getReplacement_listParserRuleCall_1_2()); 
            pushFollow(FOLLOW_rulereplacement_list_in_rule__Control_line__Group_1__2__Impl3594);
            rulereplacement_list();

            state._fsp--;

             after(grammarAccess.getControl_lineAccess().getReplacement_listParserRuleCall_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Control_line__Group_1__2__Impl"


    // $ANTLR start "rule__Control_line__Group_1__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1770:1: rule__Control_line__Group_1__3 : rule__Control_line__Group_1__3__Impl ;
    public final void rule__Control_line__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1774:1: ( rule__Control_line__Group_1__3__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1775:2: rule__Control_line__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Control_line__Group_1__3__Impl_in_rule__Control_line__Group_1__33623);
            rule__Control_line__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Control_line__Group_1__3"


    // $ANTLR start "rule__Control_line__Group_1__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1781:1: rule__Control_line__Group_1__3__Impl : ( rulenew_line ) ;
    public final void rule__Control_line__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1785:1: ( ( rulenew_line ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1786:1: ( rulenew_line )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1786:1: ( rulenew_line )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1787:1: rulenew_line
            {
             before(grammarAccess.getControl_lineAccess().getNew_lineParserRuleCall_1_3()); 
            pushFollow(FOLLOW_rulenew_line_in_rule__Control_line__Group_1__3__Impl3650);
            rulenew_line();

            state._fsp--;

             after(grammarAccess.getControl_lineAccess().getNew_lineParserRuleCall_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Control_line__Group_1__3__Impl"


    // $ANTLR start "rule__Control_line__Group_2__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1806:1: rule__Control_line__Group_2__0 : rule__Control_line__Group_2__0__Impl rule__Control_line__Group_2__1 ;
    public final void rule__Control_line__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1810:1: ( rule__Control_line__Group_2__0__Impl rule__Control_line__Group_2__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1811:2: rule__Control_line__Group_2__0__Impl rule__Control_line__Group_2__1
            {
            pushFollow(FOLLOW_rule__Control_line__Group_2__0__Impl_in_rule__Control_line__Group_2__03687);
            rule__Control_line__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Control_line__Group_2__1_in_rule__Control_line__Group_2__03690);
            rule__Control_line__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Control_line__Group_2__0"


    // $ANTLR start "rule__Control_line__Group_2__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1818:1: rule__Control_line__Group_2__0__Impl : ( '#define' ) ;
    public final void rule__Control_line__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1822:1: ( ( '#define' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1823:1: ( '#define' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1823:1: ( '#define' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1824:1: '#define'
            {
             before(grammarAccess.getControl_lineAccess().getDefineKeyword_2_0()); 
            match(input,31,FOLLOW_31_in_rule__Control_line__Group_2__0__Impl3718); 
             after(grammarAccess.getControl_lineAccess().getDefineKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Control_line__Group_2__0__Impl"


    // $ANTLR start "rule__Control_line__Group_2__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1837:1: rule__Control_line__Group_2__1 : rule__Control_line__Group_2__1__Impl rule__Control_line__Group_2__2 ;
    public final void rule__Control_line__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1841:1: ( rule__Control_line__Group_2__1__Impl rule__Control_line__Group_2__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1842:2: rule__Control_line__Group_2__1__Impl rule__Control_line__Group_2__2
            {
            pushFollow(FOLLOW_rule__Control_line__Group_2__1__Impl_in_rule__Control_line__Group_2__13749);
            rule__Control_line__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Control_line__Group_2__2_in_rule__Control_line__Group_2__13752);
            rule__Control_line__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Control_line__Group_2__1"


    // $ANTLR start "rule__Control_line__Group_2__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1849:1: rule__Control_line__Group_2__1__Impl : ( RULE_IDENTIFIER ) ;
    public final void rule__Control_line__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1853:1: ( ( RULE_IDENTIFIER ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1854:1: ( RULE_IDENTIFIER )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1854:1: ( RULE_IDENTIFIER )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1855:1: RULE_IDENTIFIER
            {
             before(grammarAccess.getControl_lineAccess().getIDENTIFIERTerminalRuleCall_2_1()); 
            match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rule__Control_line__Group_2__1__Impl3779); 
             after(grammarAccess.getControl_lineAccess().getIDENTIFIERTerminalRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Control_line__Group_2__1__Impl"


    // $ANTLR start "rule__Control_line__Group_2__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1866:1: rule__Control_line__Group_2__2 : rule__Control_line__Group_2__2__Impl rule__Control_line__Group_2__3 ;
    public final void rule__Control_line__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1870:1: ( rule__Control_line__Group_2__2__Impl rule__Control_line__Group_2__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1871:2: rule__Control_line__Group_2__2__Impl rule__Control_line__Group_2__3
            {
            pushFollow(FOLLOW_rule__Control_line__Group_2__2__Impl_in_rule__Control_line__Group_2__23808);
            rule__Control_line__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Control_line__Group_2__3_in_rule__Control_line__Group_2__23811);
            rule__Control_line__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Control_line__Group_2__2"


    // $ANTLR start "rule__Control_line__Group_2__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1878:1: rule__Control_line__Group_2__2__Impl : ( rulelparen ) ;
    public final void rule__Control_line__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1882:1: ( ( rulelparen ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1883:1: ( rulelparen )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1883:1: ( rulelparen )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1884:1: rulelparen
            {
             before(grammarAccess.getControl_lineAccess().getLparenParserRuleCall_2_2()); 
            pushFollow(FOLLOW_rulelparen_in_rule__Control_line__Group_2__2__Impl3838);
            rulelparen();

            state._fsp--;

             after(grammarAccess.getControl_lineAccess().getLparenParserRuleCall_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Control_line__Group_2__2__Impl"


    // $ANTLR start "rule__Control_line__Group_2__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1895:1: rule__Control_line__Group_2__3 : rule__Control_line__Group_2__3__Impl rule__Control_line__Group_2__4 ;
    public final void rule__Control_line__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1899:1: ( rule__Control_line__Group_2__3__Impl rule__Control_line__Group_2__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1900:2: rule__Control_line__Group_2__3__Impl rule__Control_line__Group_2__4
            {
            pushFollow(FOLLOW_rule__Control_line__Group_2__3__Impl_in_rule__Control_line__Group_2__33867);
            rule__Control_line__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Control_line__Group_2__4_in_rule__Control_line__Group_2__33870);
            rule__Control_line__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Control_line__Group_2__3"


    // $ANTLR start "rule__Control_line__Group_2__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1907:1: rule__Control_line__Group_2__3__Impl : ( ( RULE_IDENTIFIER )? ) ;
    public final void rule__Control_line__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1911:1: ( ( ( RULE_IDENTIFIER )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1912:1: ( ( RULE_IDENTIFIER )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1912:1: ( ( RULE_IDENTIFIER )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1913:1: ( RULE_IDENTIFIER )?
            {
             before(grammarAccess.getControl_lineAccess().getIDENTIFIERTerminalRuleCall_2_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1914:1: ( RULE_IDENTIFIER )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_IDENTIFIER) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1914:3: RULE_IDENTIFIER
                    {
                    match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rule__Control_line__Group_2__3__Impl3898); 

                    }
                    break;

            }

             after(grammarAccess.getControl_lineAccess().getIDENTIFIERTerminalRuleCall_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Control_line__Group_2__3__Impl"


    // $ANTLR start "rule__Control_line__Group_2__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1924:1: rule__Control_line__Group_2__4 : rule__Control_line__Group_2__4__Impl rule__Control_line__Group_2__5 ;
    public final void rule__Control_line__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1928:1: ( rule__Control_line__Group_2__4__Impl rule__Control_line__Group_2__5 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1929:2: rule__Control_line__Group_2__4__Impl rule__Control_line__Group_2__5
            {
            pushFollow(FOLLOW_rule__Control_line__Group_2__4__Impl_in_rule__Control_line__Group_2__43929);
            rule__Control_line__Group_2__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Control_line__Group_2__5_in_rule__Control_line__Group_2__43932);
            rule__Control_line__Group_2__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Control_line__Group_2__4"


    // $ANTLR start "rule__Control_line__Group_2__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1936:1: rule__Control_line__Group_2__4__Impl : ( ')' ) ;
    public final void rule__Control_line__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1940:1: ( ( ')' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1941:1: ( ')' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1941:1: ( ')' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1942:1: ')'
            {
             before(grammarAccess.getControl_lineAccess().getRightParenthesisKeyword_2_4()); 
            match(input,32,FOLLOW_32_in_rule__Control_line__Group_2__4__Impl3960); 
             after(grammarAccess.getControl_lineAccess().getRightParenthesisKeyword_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Control_line__Group_2__4__Impl"


    // $ANTLR start "rule__Control_line__Group_2__5"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1955:1: rule__Control_line__Group_2__5 : rule__Control_line__Group_2__5__Impl rule__Control_line__Group_2__6 ;
    public final void rule__Control_line__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1959:1: ( rule__Control_line__Group_2__5__Impl rule__Control_line__Group_2__6 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1960:2: rule__Control_line__Group_2__5__Impl rule__Control_line__Group_2__6
            {
            pushFollow(FOLLOW_rule__Control_line__Group_2__5__Impl_in_rule__Control_line__Group_2__53991);
            rule__Control_line__Group_2__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Control_line__Group_2__6_in_rule__Control_line__Group_2__53994);
            rule__Control_line__Group_2__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Control_line__Group_2__5"


    // $ANTLR start "rule__Control_line__Group_2__5__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1967:1: rule__Control_line__Group_2__5__Impl : ( rulereplacement_list ) ;
    public final void rule__Control_line__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1971:1: ( ( rulereplacement_list ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1972:1: ( rulereplacement_list )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1972:1: ( rulereplacement_list )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1973:1: rulereplacement_list
            {
             before(grammarAccess.getControl_lineAccess().getReplacement_listParserRuleCall_2_5()); 
            pushFollow(FOLLOW_rulereplacement_list_in_rule__Control_line__Group_2__5__Impl4021);
            rulereplacement_list();

            state._fsp--;

             after(grammarAccess.getControl_lineAccess().getReplacement_listParserRuleCall_2_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Control_line__Group_2__5__Impl"


    // $ANTLR start "rule__Control_line__Group_2__6"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1984:1: rule__Control_line__Group_2__6 : rule__Control_line__Group_2__6__Impl ;
    public final void rule__Control_line__Group_2__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1988:1: ( rule__Control_line__Group_2__6__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1989:2: rule__Control_line__Group_2__6__Impl
            {
            pushFollow(FOLLOW_rule__Control_line__Group_2__6__Impl_in_rule__Control_line__Group_2__64050);
            rule__Control_line__Group_2__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Control_line__Group_2__6"


    // $ANTLR start "rule__Control_line__Group_2__6__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1995:1: rule__Control_line__Group_2__6__Impl : ( rulenew_line ) ;
    public final void rule__Control_line__Group_2__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1999:1: ( ( rulenew_line ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2000:1: ( rulenew_line )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2000:1: ( rulenew_line )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2001:1: rulenew_line
            {
             before(grammarAccess.getControl_lineAccess().getNew_lineParserRuleCall_2_6()); 
            pushFollow(FOLLOW_rulenew_line_in_rule__Control_line__Group_2__6__Impl4077);
            rulenew_line();

            state._fsp--;

             after(grammarAccess.getControl_lineAccess().getNew_lineParserRuleCall_2_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Control_line__Group_2__6__Impl"


    // $ANTLR start "rule__Control_line__Group_3__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2026:1: rule__Control_line__Group_3__0 : rule__Control_line__Group_3__0__Impl rule__Control_line__Group_3__1 ;
    public final void rule__Control_line__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2030:1: ( rule__Control_line__Group_3__0__Impl rule__Control_line__Group_3__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2031:2: rule__Control_line__Group_3__0__Impl rule__Control_line__Group_3__1
            {
            pushFollow(FOLLOW_rule__Control_line__Group_3__0__Impl_in_rule__Control_line__Group_3__04120);
            rule__Control_line__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Control_line__Group_3__1_in_rule__Control_line__Group_3__04123);
            rule__Control_line__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Control_line__Group_3__0"


    // $ANTLR start "rule__Control_line__Group_3__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2038:1: rule__Control_line__Group_3__0__Impl : ( '#undef' ) ;
    public final void rule__Control_line__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2042:1: ( ( '#undef' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2043:1: ( '#undef' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2043:1: ( '#undef' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2044:1: '#undef'
            {
             before(grammarAccess.getControl_lineAccess().getUndefKeyword_3_0()); 
            match(input,33,FOLLOW_33_in_rule__Control_line__Group_3__0__Impl4151); 
             after(grammarAccess.getControl_lineAccess().getUndefKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Control_line__Group_3__0__Impl"


    // $ANTLR start "rule__Control_line__Group_3__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2057:1: rule__Control_line__Group_3__1 : rule__Control_line__Group_3__1__Impl rule__Control_line__Group_3__2 ;
    public final void rule__Control_line__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2061:1: ( rule__Control_line__Group_3__1__Impl rule__Control_line__Group_3__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2062:2: rule__Control_line__Group_3__1__Impl rule__Control_line__Group_3__2
            {
            pushFollow(FOLLOW_rule__Control_line__Group_3__1__Impl_in_rule__Control_line__Group_3__14182);
            rule__Control_line__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Control_line__Group_3__2_in_rule__Control_line__Group_3__14185);
            rule__Control_line__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Control_line__Group_3__1"


    // $ANTLR start "rule__Control_line__Group_3__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2069:1: rule__Control_line__Group_3__1__Impl : ( RULE_IDENTIFIER ) ;
    public final void rule__Control_line__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2073:1: ( ( RULE_IDENTIFIER ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2074:1: ( RULE_IDENTIFIER )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2074:1: ( RULE_IDENTIFIER )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2075:1: RULE_IDENTIFIER
            {
             before(grammarAccess.getControl_lineAccess().getIDENTIFIERTerminalRuleCall_3_1()); 
            match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rule__Control_line__Group_3__1__Impl4212); 
             after(grammarAccess.getControl_lineAccess().getIDENTIFIERTerminalRuleCall_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Control_line__Group_3__1__Impl"


    // $ANTLR start "rule__Control_line__Group_3__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2086:1: rule__Control_line__Group_3__2 : rule__Control_line__Group_3__2__Impl ;
    public final void rule__Control_line__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2090:1: ( rule__Control_line__Group_3__2__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2091:2: rule__Control_line__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Control_line__Group_3__2__Impl_in_rule__Control_line__Group_3__24241);
            rule__Control_line__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Control_line__Group_3__2"


    // $ANTLR start "rule__Control_line__Group_3__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2097:1: rule__Control_line__Group_3__2__Impl : ( rulenew_line ) ;
    public final void rule__Control_line__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2101:1: ( ( rulenew_line ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2102:1: ( rulenew_line )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2102:1: ( rulenew_line )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2103:1: rulenew_line
            {
             before(grammarAccess.getControl_lineAccess().getNew_lineParserRuleCall_3_2()); 
            pushFollow(FOLLOW_rulenew_line_in_rule__Control_line__Group_3__2__Impl4268);
            rulenew_line();

            state._fsp--;

             after(grammarAccess.getControl_lineAccess().getNew_lineParserRuleCall_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Control_line__Group_3__2__Impl"


    // $ANTLR start "rule__Control_line__Group_4__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2120:1: rule__Control_line__Group_4__0 : rule__Control_line__Group_4__0__Impl rule__Control_line__Group_4__1 ;
    public final void rule__Control_line__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2124:1: ( rule__Control_line__Group_4__0__Impl rule__Control_line__Group_4__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2125:2: rule__Control_line__Group_4__0__Impl rule__Control_line__Group_4__1
            {
            pushFollow(FOLLOW_rule__Control_line__Group_4__0__Impl_in_rule__Control_line__Group_4__04303);
            rule__Control_line__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Control_line__Group_4__1_in_rule__Control_line__Group_4__04306);
            rule__Control_line__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Control_line__Group_4__0"


    // $ANTLR start "rule__Control_line__Group_4__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2132:1: rule__Control_line__Group_4__0__Impl : ( '#line' ) ;
    public final void rule__Control_line__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2136:1: ( ( '#line' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2137:1: ( '#line' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2137:1: ( '#line' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2138:1: '#line'
            {
             before(grammarAccess.getControl_lineAccess().getLineKeyword_4_0()); 
            match(input,34,FOLLOW_34_in_rule__Control_line__Group_4__0__Impl4334); 
             after(grammarAccess.getControl_lineAccess().getLineKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Control_line__Group_4__0__Impl"


    // $ANTLR start "rule__Control_line__Group_4__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2151:1: rule__Control_line__Group_4__1 : rule__Control_line__Group_4__1__Impl rule__Control_line__Group_4__2 ;
    public final void rule__Control_line__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2155:1: ( rule__Control_line__Group_4__1__Impl rule__Control_line__Group_4__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2156:2: rule__Control_line__Group_4__1__Impl rule__Control_line__Group_4__2
            {
            pushFollow(FOLLOW_rule__Control_line__Group_4__1__Impl_in_rule__Control_line__Group_4__14365);
            rule__Control_line__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Control_line__Group_4__2_in_rule__Control_line__Group_4__14368);
            rule__Control_line__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Control_line__Group_4__1"


    // $ANTLR start "rule__Control_line__Group_4__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2163:1: rule__Control_line__Group_4__1__Impl : ( rulepp_tokens ) ;
    public final void rule__Control_line__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2167:1: ( ( rulepp_tokens ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2168:1: ( rulepp_tokens )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2168:1: ( rulepp_tokens )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2169:1: rulepp_tokens
            {
             before(grammarAccess.getControl_lineAccess().getPp_tokensParserRuleCall_4_1()); 
            pushFollow(FOLLOW_rulepp_tokens_in_rule__Control_line__Group_4__1__Impl4395);
            rulepp_tokens();

            state._fsp--;

             after(grammarAccess.getControl_lineAccess().getPp_tokensParserRuleCall_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Control_line__Group_4__1__Impl"


    // $ANTLR start "rule__Control_line__Group_4__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2180:1: rule__Control_line__Group_4__2 : rule__Control_line__Group_4__2__Impl ;
    public final void rule__Control_line__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2184:1: ( rule__Control_line__Group_4__2__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2185:2: rule__Control_line__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__Control_line__Group_4__2__Impl_in_rule__Control_line__Group_4__24424);
            rule__Control_line__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Control_line__Group_4__2"


    // $ANTLR start "rule__Control_line__Group_4__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2191:1: rule__Control_line__Group_4__2__Impl : ( rulenew_line ) ;
    public final void rule__Control_line__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2195:1: ( ( rulenew_line ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2196:1: ( rulenew_line )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2196:1: ( rulenew_line )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2197:1: rulenew_line
            {
             before(grammarAccess.getControl_lineAccess().getNew_lineParserRuleCall_4_2()); 
            pushFollow(FOLLOW_rulenew_line_in_rule__Control_line__Group_4__2__Impl4451);
            rulenew_line();

            state._fsp--;

             after(grammarAccess.getControl_lineAccess().getNew_lineParserRuleCall_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Control_line__Group_4__2__Impl"


    // $ANTLR start "rule__Control_line__Group_5__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2214:1: rule__Control_line__Group_5__0 : rule__Control_line__Group_5__0__Impl rule__Control_line__Group_5__1 ;
    public final void rule__Control_line__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2218:1: ( rule__Control_line__Group_5__0__Impl rule__Control_line__Group_5__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2219:2: rule__Control_line__Group_5__0__Impl rule__Control_line__Group_5__1
            {
            pushFollow(FOLLOW_rule__Control_line__Group_5__0__Impl_in_rule__Control_line__Group_5__04486);
            rule__Control_line__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Control_line__Group_5__1_in_rule__Control_line__Group_5__04489);
            rule__Control_line__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Control_line__Group_5__0"


    // $ANTLR start "rule__Control_line__Group_5__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2226:1: rule__Control_line__Group_5__0__Impl : ( '#error' ) ;
    public final void rule__Control_line__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2230:1: ( ( '#error' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2231:1: ( '#error' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2231:1: ( '#error' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2232:1: '#error'
            {
             before(grammarAccess.getControl_lineAccess().getErrorKeyword_5_0()); 
            match(input,35,FOLLOW_35_in_rule__Control_line__Group_5__0__Impl4517); 
             after(grammarAccess.getControl_lineAccess().getErrorKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Control_line__Group_5__0__Impl"


    // $ANTLR start "rule__Control_line__Group_5__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2245:1: rule__Control_line__Group_5__1 : rule__Control_line__Group_5__1__Impl rule__Control_line__Group_5__2 ;
    public final void rule__Control_line__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2249:1: ( rule__Control_line__Group_5__1__Impl rule__Control_line__Group_5__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2250:2: rule__Control_line__Group_5__1__Impl rule__Control_line__Group_5__2
            {
            pushFollow(FOLLOW_rule__Control_line__Group_5__1__Impl_in_rule__Control_line__Group_5__14548);
            rule__Control_line__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Control_line__Group_5__2_in_rule__Control_line__Group_5__14551);
            rule__Control_line__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Control_line__Group_5__1"


    // $ANTLR start "rule__Control_line__Group_5__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2257:1: rule__Control_line__Group_5__1__Impl : ( ( rulepp_tokens )? ) ;
    public final void rule__Control_line__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2261:1: ( ( ( rulepp_tokens )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2262:1: ( ( rulepp_tokens )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2262:1: ( ( rulepp_tokens )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2263:1: ( rulepp_tokens )?
            {
             before(grammarAccess.getControl_lineAccess().getPp_tokensParserRuleCall_5_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2264:1: ( rulepp_tokens )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=RULE_IDENTIFIER && LA20_0<=RULE_PPOPORPUNC)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2264:3: rulepp_tokens
                    {
                    pushFollow(FOLLOW_rulepp_tokens_in_rule__Control_line__Group_5__1__Impl4579);
                    rulepp_tokens();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getControl_lineAccess().getPp_tokensParserRuleCall_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Control_line__Group_5__1__Impl"


    // $ANTLR start "rule__Control_line__Group_5__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2274:1: rule__Control_line__Group_5__2 : rule__Control_line__Group_5__2__Impl ;
    public final void rule__Control_line__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2278:1: ( rule__Control_line__Group_5__2__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2279:2: rule__Control_line__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__Control_line__Group_5__2__Impl_in_rule__Control_line__Group_5__24610);
            rule__Control_line__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Control_line__Group_5__2"


    // $ANTLR start "rule__Control_line__Group_5__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2285:1: rule__Control_line__Group_5__2__Impl : ( rulenew_line ) ;
    public final void rule__Control_line__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2289:1: ( ( rulenew_line ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2290:1: ( rulenew_line )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2290:1: ( rulenew_line )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2291:1: rulenew_line
            {
             before(grammarAccess.getControl_lineAccess().getNew_lineParserRuleCall_5_2()); 
            pushFollow(FOLLOW_rulenew_line_in_rule__Control_line__Group_5__2__Impl4637);
            rulenew_line();

            state._fsp--;

             after(grammarAccess.getControl_lineAccess().getNew_lineParserRuleCall_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Control_line__Group_5__2__Impl"


    // $ANTLR start "rule__Control_line__Group_6__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2308:1: rule__Control_line__Group_6__0 : rule__Control_line__Group_6__0__Impl rule__Control_line__Group_6__1 ;
    public final void rule__Control_line__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2312:1: ( rule__Control_line__Group_6__0__Impl rule__Control_line__Group_6__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2313:2: rule__Control_line__Group_6__0__Impl rule__Control_line__Group_6__1
            {
            pushFollow(FOLLOW_rule__Control_line__Group_6__0__Impl_in_rule__Control_line__Group_6__04672);
            rule__Control_line__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Control_line__Group_6__1_in_rule__Control_line__Group_6__04675);
            rule__Control_line__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Control_line__Group_6__0"


    // $ANTLR start "rule__Control_line__Group_6__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2320:1: rule__Control_line__Group_6__0__Impl : ( '#pragma' ) ;
    public final void rule__Control_line__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2324:1: ( ( '#pragma' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2325:1: ( '#pragma' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2325:1: ( '#pragma' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2326:1: '#pragma'
            {
             before(grammarAccess.getControl_lineAccess().getPragmaKeyword_6_0()); 
            match(input,36,FOLLOW_36_in_rule__Control_line__Group_6__0__Impl4703); 
             after(grammarAccess.getControl_lineAccess().getPragmaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Control_line__Group_6__0__Impl"


    // $ANTLR start "rule__Control_line__Group_6__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2339:1: rule__Control_line__Group_6__1 : rule__Control_line__Group_6__1__Impl rule__Control_line__Group_6__2 ;
    public final void rule__Control_line__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2343:1: ( rule__Control_line__Group_6__1__Impl rule__Control_line__Group_6__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2344:2: rule__Control_line__Group_6__1__Impl rule__Control_line__Group_6__2
            {
            pushFollow(FOLLOW_rule__Control_line__Group_6__1__Impl_in_rule__Control_line__Group_6__14734);
            rule__Control_line__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Control_line__Group_6__2_in_rule__Control_line__Group_6__14737);
            rule__Control_line__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Control_line__Group_6__1"


    // $ANTLR start "rule__Control_line__Group_6__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2351:1: rule__Control_line__Group_6__1__Impl : ( ( rulepp_tokens )? ) ;
    public final void rule__Control_line__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2355:1: ( ( ( rulepp_tokens )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2356:1: ( ( rulepp_tokens )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2356:1: ( ( rulepp_tokens )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2357:1: ( rulepp_tokens )?
            {
             before(grammarAccess.getControl_lineAccess().getPp_tokensParserRuleCall_6_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2358:1: ( rulepp_tokens )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_IDENTIFIER && LA21_0<=RULE_PPOPORPUNC)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2358:3: rulepp_tokens
                    {
                    pushFollow(FOLLOW_rulepp_tokens_in_rule__Control_line__Group_6__1__Impl4765);
                    rulepp_tokens();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getControl_lineAccess().getPp_tokensParserRuleCall_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Control_line__Group_6__1__Impl"


    // $ANTLR start "rule__Control_line__Group_6__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2368:1: rule__Control_line__Group_6__2 : rule__Control_line__Group_6__2__Impl ;
    public final void rule__Control_line__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2372:1: ( rule__Control_line__Group_6__2__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2373:2: rule__Control_line__Group_6__2__Impl
            {
            pushFollow(FOLLOW_rule__Control_line__Group_6__2__Impl_in_rule__Control_line__Group_6__24796);
            rule__Control_line__Group_6__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Control_line__Group_6__2"


    // $ANTLR start "rule__Control_line__Group_6__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2379:1: rule__Control_line__Group_6__2__Impl : ( rulenew_line ) ;
    public final void rule__Control_line__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2383:1: ( ( rulenew_line ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2384:1: ( rulenew_line )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2384:1: ( rulenew_line )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2385:1: rulenew_line
            {
             before(grammarAccess.getControl_lineAccess().getNew_lineParserRuleCall_6_2()); 
            pushFollow(FOLLOW_rulenew_line_in_rule__Control_line__Group_6__2__Impl4823);
            rulenew_line();

            state._fsp--;

             after(grammarAccess.getControl_lineAccess().getNew_lineParserRuleCall_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Control_line__Group_6__2__Impl"


    // $ANTLR start "rule__Control_line__Group_7__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2402:1: rule__Control_line__Group_7__0 : rule__Control_line__Group_7__0__Impl rule__Control_line__Group_7__1 ;
    public final void rule__Control_line__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2406:1: ( rule__Control_line__Group_7__0__Impl rule__Control_line__Group_7__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2407:2: rule__Control_line__Group_7__0__Impl rule__Control_line__Group_7__1
            {
            pushFollow(FOLLOW_rule__Control_line__Group_7__0__Impl_in_rule__Control_line__Group_7__04858);
            rule__Control_line__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Control_line__Group_7__1_in_rule__Control_line__Group_7__04861);
            rule__Control_line__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Control_line__Group_7__0"


    // $ANTLR start "rule__Control_line__Group_7__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2414:1: rule__Control_line__Group_7__0__Impl : ( '#' ) ;
    public final void rule__Control_line__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2418:1: ( ( '#' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2419:1: ( '#' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2419:1: ( '#' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2420:1: '#'
            {
             before(grammarAccess.getControl_lineAccess().getNumberSignKeyword_7_0()); 
            match(input,37,FOLLOW_37_in_rule__Control_line__Group_7__0__Impl4889); 
             after(grammarAccess.getControl_lineAccess().getNumberSignKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Control_line__Group_7__0__Impl"


    // $ANTLR start "rule__Control_line__Group_7__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2433:1: rule__Control_line__Group_7__1 : rule__Control_line__Group_7__1__Impl ;
    public final void rule__Control_line__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2437:1: ( rule__Control_line__Group_7__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2438:2: rule__Control_line__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__Control_line__Group_7__1__Impl_in_rule__Control_line__Group_7__14920);
            rule__Control_line__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Control_line__Group_7__1"


    // $ANTLR start "rule__Control_line__Group_7__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2444:1: rule__Control_line__Group_7__1__Impl : ( rulenew_line ) ;
    public final void rule__Control_line__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2448:1: ( ( rulenew_line ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2449:1: ( rulenew_line )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2449:1: ( rulenew_line )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2450:1: rulenew_line
            {
             before(grammarAccess.getControl_lineAccess().getNew_lineParserRuleCall_7_1()); 
            pushFollow(FOLLOW_rulenew_line_in_rule__Control_line__Group_7__1__Impl4947);
            rulenew_line();

            state._fsp--;

             after(grammarAccess.getControl_lineAccess().getNew_lineParserRuleCall_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Control_line__Group_7__1__Impl"


    // $ANTLR start "rule__Model__GreetingsAssignment"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2466:1: rule__Model__GreetingsAssignment : ( rulepreprocessing_file ) ;
    public final void rule__Model__GreetingsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2470:1: ( ( rulepreprocessing_file ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2471:1: ( rulepreprocessing_file )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2471:1: ( rulepreprocessing_file )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2472:1: rulepreprocessing_file
            {
             before(grammarAccess.getModelAccess().getGreetingsPreprocessing_fileParserRuleCall_0()); 
            pushFollow(FOLLOW_rulepreprocessing_file_in_rule__Model__GreetingsAssignment4985);
            rulepreprocessing_file();

            state._fsp--;

             after(grammarAccess.getModelAccess().getGreetingsPreprocessing_fileParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__GreetingsAssignment"

    // Delegated rules


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\13\uffff";
    static final String DFA10_eofS =
        "\13\uffff";
    static final String DFA10_minS =
        "\1\36\1\uffff\1\4\5\uffff\1\4\2\uffff";
    static final String DFA10_maxS =
        "\1\45\1\uffff\1\4\5\uffff\1\27\2\uffff";
    static final String DFA10_acceptS =
        "\1\uffff\1\1\1\uffff\1\4\1\5\1\6\1\7\1\10\1\uffff\1\2\1\3";
    static final String DFA10_specialS =
        "\13\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\1\1\2\1\uffff\1\3\1\4\1\5\1\6\1\7",
            "",
            "\1\10",
            "",
            "",
            "",
            "",
            "",
            "\4\11\15\uffff\1\12\2\11",
            "",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "683:1: rule__Control_line__Alternatives : ( ( ( rule__Control_line__Group_0__0 ) ) | ( ( rule__Control_line__Group_1__0 ) ) | ( ( rule__Control_line__Group_2__0 ) ) | ( ( rule__Control_line__Group_3__0 ) ) | ( ( rule__Control_line__Group_4__0 ) ) | ( ( rule__Control_line__Group_5__0 ) ) | ( ( rule__Control_line__Group_6__0 ) ) | ( ( rule__Control_line__Group_7__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__GreetingsAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenew_line_in_entryRulenew_line123 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenew_line130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__New_line__Alternatives_in_rulenew_line156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepreprocessing_file_in_entryRulepreprocessing_file183 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepreprocessing_file190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegroup_in_rulepreprocessing_file217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegroup_in_entryRulegroup245 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulegroup252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegroup_part_in_rulegroup281 = new BitSet(new long[]{0x0000003EC7C000F2L});
    public static final BitSet FOLLOW_rulegroup_part_in_rulegroup294 = new BitSet(new long[]{0x0000003EC7C000F2L});
    public static final BitSet FOLLOW_rulegroup_part_in_entryRulegroup_part324 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulegroup_part331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group_part__Alternatives_in_rulegroup_part357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleif_action_in_entryRuleif_action384 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleif_action391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If_action__Group__0_in_ruleif_action417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleif_group_in_entryRuleif_group444 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleif_group451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If_group__Alternatives_in_ruleif_group477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleelif_groups_in_entryRuleelif_groups504 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleelif_groups511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleelif_group_in_ruleelif_groups540 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleelif_group_in_ruleelif_groups553 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleelif_group_in_entryRuleelif_group583 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleelif_group590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Elif_group__Group__0_in_ruleelif_group616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstant_expression_in_entryRuleconstant_expression643 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleconstant_expression650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleconstant_expression677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepreprocessing_token_in_entryRulepreprocessing_token705 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepreprocessing_token712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Preprocessing_token__Alternatives_in_rulepreprocessing_token738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleelse_group_in_entryRuleelse_group765 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleelse_group772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Else_group__Group__0_in_ruleelse_group798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleendif_line_in_entryRuleendif_line825 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleendif_line832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Endif_line__Group__0_in_ruleendif_line858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecontrol_line_in_entryRulecontrol_line885 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecontrol_line892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Control_line__Alternatives_in_rulecontrol_line918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelparen_in_entryRulelparen945 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulelparen952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rulelparen979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulereplacement_list_in_entryRulereplacement_list1007 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulereplacement_list1014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepp_tokens_in_rulereplacement_list1041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepp_tokens_in_entryRulepp_tokens1069 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepp_tokens1076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepreprocessing_token_in_rulepp_tokens1105 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_rulepreprocessing_token_in_rulepp_tokens1118 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_22_in_rule__New_line__Alternatives1162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__New_line__Alternatives1182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group_part__Group_0__0_in_rule__Group_part__Alternatives1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleif_action_in_rule__Group_part__Alternatives1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecontrol_line_in_rule__Group_part__Alternatives1251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If_group__Group_0__0_in_rule__If_group__Alternatives1283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If_group__Group_1__0_in_rule__If_group__Alternatives1301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If_group__Group_2__0_in_rule__If_group__Alternatives1319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rule__Preprocessing_token__Alternatives1352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEADERNAME_in_rule__Preprocessing_token__Alternatives1369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PPNUMBER_in_rule__Preprocessing_token__Alternatives1386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PPOPORPUNC_in_rule__Preprocessing_token__Alternatives1403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Control_line__Group_0__0_in_rule__Control_line__Alternatives1435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Control_line__Group_1__0_in_rule__Control_line__Alternatives1453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Control_line__Group_2__0_in_rule__Control_line__Alternatives1471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Control_line__Group_3__0_in_rule__Control_line__Alternatives1489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Control_line__Group_4__0_in_rule__Control_line__Alternatives1507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Control_line__Group_5__0_in_rule__Control_line__Alternatives1525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Control_line__Group_6__0_in_rule__Control_line__Alternatives1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Control_line__Group_7__0_in_rule__Control_line__Alternatives1561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group_part__Group_0__0__Impl_in_rule__Group_part__Group_0__01595 = new BitSet(new long[]{0x0000000000C000F0L});
    public static final BitSet FOLLOW_rule__Group_part__Group_0__1_in_rule__Group_part__Group_0__01598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepp_tokens_in_rule__Group_part__Group_0__0__Impl1626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group_part__Group_0__1__Impl_in_rule__Group_part__Group_0__11657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenew_line_in_rule__Group_part__Group_0__1__Impl1684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If_action__Group__0__Impl_in_rule__If_action__Group__01717 = new BitSet(new long[]{0x0000000038000000L});
    public static final BitSet FOLLOW_rule__If_action__Group__1_in_rule__If_action__Group__01720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleif_group_in_rule__If_action__Group__0__Impl1747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If_action__Group__1__Impl_in_rule__If_action__Group__11776 = new BitSet(new long[]{0x0000000038000000L});
    public static final BitSet FOLLOW_rule__If_action__Group__2_in_rule__If_action__Group__11779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleelif_groups_in_rule__If_action__Group__1__Impl1807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If_action__Group__2__Impl_in_rule__If_action__Group__21838 = new BitSet(new long[]{0x0000000038000000L});
    public static final BitSet FOLLOW_rule__If_action__Group__3_in_rule__If_action__Group__21841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleelse_group_in_rule__If_action__Group__2__Impl1869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If_action__Group__3__Impl_in_rule__If_action__Group__31900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleendif_line_in_rule__If_action__Group__3__Impl1927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If_group__Group_0__0__Impl_in_rule__If_group__Group_0__01964 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__If_group__Group_0__1_in_rule__If_group__Group_0__01967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__If_group__Group_0__0__Impl1995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If_group__Group_0__1__Impl_in_rule__If_group__Group_0__12026 = new BitSet(new long[]{0x0000000000C000F0L});
    public static final BitSet FOLLOW_rule__If_group__Group_0__2_in_rule__If_group__Group_0__12029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstant_expression_in_rule__If_group__Group_0__1__Impl2056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If_group__Group_0__2__Impl_in_rule__If_group__Group_0__22085 = new BitSet(new long[]{0x0000003EC7C000F0L});
    public static final BitSet FOLLOW_rule__If_group__Group_0__3_in_rule__If_group__Group_0__22088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenew_line_in_rule__If_group__Group_0__2__Impl2115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If_group__Group_0__3__Impl_in_rule__If_group__Group_0__32144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegroup_in_rule__If_group__Group_0__3__Impl2172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If_group__Group_1__0__Impl_in_rule__If_group__Group_1__02211 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__If_group__Group_1__1_in_rule__If_group__Group_1__02214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__If_group__Group_1__0__Impl2242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If_group__Group_1__1__Impl_in_rule__If_group__Group_1__12273 = new BitSet(new long[]{0x0000000000C000F0L});
    public static final BitSet FOLLOW_rule__If_group__Group_1__2_in_rule__If_group__Group_1__12276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rule__If_group__Group_1__1__Impl2303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If_group__Group_1__2__Impl_in_rule__If_group__Group_1__22332 = new BitSet(new long[]{0x0000003EC7C000F0L});
    public static final BitSet FOLLOW_rule__If_group__Group_1__3_in_rule__If_group__Group_1__22335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenew_line_in_rule__If_group__Group_1__2__Impl2362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If_group__Group_1__3__Impl_in_rule__If_group__Group_1__32391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegroup_in_rule__If_group__Group_1__3__Impl2419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If_group__Group_2__0__Impl_in_rule__If_group__Group_2__02458 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__If_group__Group_2__1_in_rule__If_group__Group_2__02461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__If_group__Group_2__0__Impl2489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If_group__Group_2__1__Impl_in_rule__If_group__Group_2__12520 = new BitSet(new long[]{0x0000000000C000F0L});
    public static final BitSet FOLLOW_rule__If_group__Group_2__2_in_rule__If_group__Group_2__12523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rule__If_group__Group_2__1__Impl2550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If_group__Group_2__2__Impl_in_rule__If_group__Group_2__22579 = new BitSet(new long[]{0x0000003EC7C000F0L});
    public static final BitSet FOLLOW_rule__If_group__Group_2__3_in_rule__If_group__Group_2__22582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenew_line_in_rule__If_group__Group_2__2__Impl2609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If_group__Group_2__3__Impl_in_rule__If_group__Group_2__32638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegroup_in_rule__If_group__Group_2__3__Impl2666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Elif_group__Group__0__Impl_in_rule__Elif_group__Group__02705 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Elif_group__Group__1_in_rule__Elif_group__Group__02708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Elif_group__Group__0__Impl2736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Elif_group__Group__1__Impl_in_rule__Elif_group__Group__12767 = new BitSet(new long[]{0x0000000000C000F0L});
    public static final BitSet FOLLOW_rule__Elif_group__Group__2_in_rule__Elif_group__Group__12770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstant_expression_in_rule__Elif_group__Group__1__Impl2797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Elif_group__Group__2__Impl_in_rule__Elif_group__Group__22826 = new BitSet(new long[]{0x0000003EC7C000F0L});
    public static final BitSet FOLLOW_rule__Elif_group__Group__3_in_rule__Elif_group__Group__22829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenew_line_in_rule__Elif_group__Group__2__Impl2856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Elif_group__Group__3__Impl_in_rule__Elif_group__Group__32885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegroup_in_rule__Elif_group__Group__3__Impl2913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Else_group__Group__0__Impl_in_rule__Else_group__Group__02952 = new BitSet(new long[]{0x0000000000C000F0L});
    public static final BitSet FOLLOW_rule__Else_group__Group__1_in_rule__Else_group__Group__02955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Else_group__Group__0__Impl2983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Else_group__Group__1__Impl_in_rule__Else_group__Group__13014 = new BitSet(new long[]{0x0000003EC7C000F0L});
    public static final BitSet FOLLOW_rule__Else_group__Group__2_in_rule__Else_group__Group__13017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenew_line_in_rule__Else_group__Group__1__Impl3044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Else_group__Group__2__Impl_in_rule__Else_group__Group__23073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegroup_in_rule__Else_group__Group__2__Impl3101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Endif_line__Group__0__Impl_in_rule__Endif_line__Group__03138 = new BitSet(new long[]{0x0000000000C000F0L});
    public static final BitSet FOLLOW_rule__Endif_line__Group__1_in_rule__Endif_line__Group__03141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Endif_line__Group__0__Impl3169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Endif_line__Group__1__Impl_in_rule__Endif_line__Group__13200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenew_line_in_rule__Endif_line__Group__1__Impl3227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Control_line__Group_0__0__Impl_in_rule__Control_line__Group_0__03260 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Control_line__Group_0__1_in_rule__Control_line__Group_0__03263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Control_line__Group_0__0__Impl3291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Control_line__Group_0__1__Impl_in_rule__Control_line__Group_0__13322 = new BitSet(new long[]{0x0000000000C000F0L});
    public static final BitSet FOLLOW_rule__Control_line__Group_0__2_in_rule__Control_line__Group_0__13325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepp_tokens_in_rule__Control_line__Group_0__1__Impl3352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Control_line__Group_0__2__Impl_in_rule__Control_line__Group_0__23381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenew_line_in_rule__Control_line__Group_0__2__Impl3408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Control_line__Group_1__0__Impl_in_rule__Control_line__Group_1__03443 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Control_line__Group_1__1_in_rule__Control_line__Group_1__03446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Control_line__Group_1__0__Impl3474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Control_line__Group_1__1__Impl_in_rule__Control_line__Group_1__13505 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Control_line__Group_1__2_in_rule__Control_line__Group_1__13508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rule__Control_line__Group_1__1__Impl3535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Control_line__Group_1__2__Impl_in_rule__Control_line__Group_1__23564 = new BitSet(new long[]{0x0000000000C000F0L});
    public static final BitSet FOLLOW_rule__Control_line__Group_1__3_in_rule__Control_line__Group_1__23567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulereplacement_list_in_rule__Control_line__Group_1__2__Impl3594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Control_line__Group_1__3__Impl_in_rule__Control_line__Group_1__33623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenew_line_in_rule__Control_line__Group_1__3__Impl3650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Control_line__Group_2__0__Impl_in_rule__Control_line__Group_2__03687 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Control_line__Group_2__1_in_rule__Control_line__Group_2__03690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Control_line__Group_2__0__Impl3718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Control_line__Group_2__1__Impl_in_rule__Control_line__Group_2__13749 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Control_line__Group_2__2_in_rule__Control_line__Group_2__13752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rule__Control_line__Group_2__1__Impl3779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Control_line__Group_2__2__Impl_in_rule__Control_line__Group_2__23808 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_rule__Control_line__Group_2__3_in_rule__Control_line__Group_2__23811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelparen_in_rule__Control_line__Group_2__2__Impl3838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Control_line__Group_2__3__Impl_in_rule__Control_line__Group_2__33867 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_rule__Control_line__Group_2__4_in_rule__Control_line__Group_2__33870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rule__Control_line__Group_2__3__Impl3898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Control_line__Group_2__4__Impl_in_rule__Control_line__Group_2__43929 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Control_line__Group_2__5_in_rule__Control_line__Group_2__43932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Control_line__Group_2__4__Impl3960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Control_line__Group_2__5__Impl_in_rule__Control_line__Group_2__53991 = new BitSet(new long[]{0x0000000000C000F0L});
    public static final BitSet FOLLOW_rule__Control_line__Group_2__6_in_rule__Control_line__Group_2__53994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulereplacement_list_in_rule__Control_line__Group_2__5__Impl4021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Control_line__Group_2__6__Impl_in_rule__Control_line__Group_2__64050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenew_line_in_rule__Control_line__Group_2__6__Impl4077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Control_line__Group_3__0__Impl_in_rule__Control_line__Group_3__04120 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Control_line__Group_3__1_in_rule__Control_line__Group_3__04123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Control_line__Group_3__0__Impl4151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Control_line__Group_3__1__Impl_in_rule__Control_line__Group_3__14182 = new BitSet(new long[]{0x0000000000C000F0L});
    public static final BitSet FOLLOW_rule__Control_line__Group_3__2_in_rule__Control_line__Group_3__14185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rule__Control_line__Group_3__1__Impl4212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Control_line__Group_3__2__Impl_in_rule__Control_line__Group_3__24241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenew_line_in_rule__Control_line__Group_3__2__Impl4268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Control_line__Group_4__0__Impl_in_rule__Control_line__Group_4__04303 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Control_line__Group_4__1_in_rule__Control_line__Group_4__04306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Control_line__Group_4__0__Impl4334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Control_line__Group_4__1__Impl_in_rule__Control_line__Group_4__14365 = new BitSet(new long[]{0x0000000000C000F0L});
    public static final BitSet FOLLOW_rule__Control_line__Group_4__2_in_rule__Control_line__Group_4__14368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepp_tokens_in_rule__Control_line__Group_4__1__Impl4395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Control_line__Group_4__2__Impl_in_rule__Control_line__Group_4__24424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenew_line_in_rule__Control_line__Group_4__2__Impl4451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Control_line__Group_5__0__Impl_in_rule__Control_line__Group_5__04486 = new BitSet(new long[]{0x0000000000C000F0L});
    public static final BitSet FOLLOW_rule__Control_line__Group_5__1_in_rule__Control_line__Group_5__04489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Control_line__Group_5__0__Impl4517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Control_line__Group_5__1__Impl_in_rule__Control_line__Group_5__14548 = new BitSet(new long[]{0x0000000000C000F0L});
    public static final BitSet FOLLOW_rule__Control_line__Group_5__2_in_rule__Control_line__Group_5__14551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepp_tokens_in_rule__Control_line__Group_5__1__Impl4579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Control_line__Group_5__2__Impl_in_rule__Control_line__Group_5__24610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenew_line_in_rule__Control_line__Group_5__2__Impl4637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Control_line__Group_6__0__Impl_in_rule__Control_line__Group_6__04672 = new BitSet(new long[]{0x0000000000C000F0L});
    public static final BitSet FOLLOW_rule__Control_line__Group_6__1_in_rule__Control_line__Group_6__04675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Control_line__Group_6__0__Impl4703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Control_line__Group_6__1__Impl_in_rule__Control_line__Group_6__14734 = new BitSet(new long[]{0x0000000000C000F0L});
    public static final BitSet FOLLOW_rule__Control_line__Group_6__2_in_rule__Control_line__Group_6__14737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepp_tokens_in_rule__Control_line__Group_6__1__Impl4765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Control_line__Group_6__2__Impl_in_rule__Control_line__Group_6__24796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenew_line_in_rule__Control_line__Group_6__2__Impl4823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Control_line__Group_7__0__Impl_in_rule__Control_line__Group_7__04858 = new BitSet(new long[]{0x0000000000C000F0L});
    public static final BitSet FOLLOW_rule__Control_line__Group_7__1_in_rule__Control_line__Group_7__04861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Control_line__Group_7__0__Impl4889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Control_line__Group_7__1__Impl_in_rule__Control_line__Group_7__14920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenew_line_in_rule__Control_line__Group_7__1__Impl4947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepreprocessing_file_in_rule__Model__GreetingsAssignment4985 = new BitSet(new long[]{0x0000000000000002L});

}