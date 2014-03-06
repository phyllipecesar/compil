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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_IDENTIFIER", "RULE_INTEGERLITERAL", "RULE_BOOLEANLITERAL", "RULE_POINTERLITERAL", "RULE_PPNUMBER", "RULE_LITERAL", "RULE_KEYWORD", "RULE_PPOPORPUNC", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'\\n'", "'=='", "'!='", "'('", "'#if'", "'#ifdef'", "'#ifndef'", "'#elif'", "'#else'", "'#endif'", "'#include'", "'#define'", "')'", "'#undef'", "'#line'", "'#error'", "'#pragma'", "'#'"
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:99:1: rulenew_line : ( '\\n' ) ;
    public final void rulenew_line() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:103:2: ( ( '\\n' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:104:1: ( '\\n' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:104:1: ( '\\n' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:105:1: '\\n'
            {
             before(grammarAccess.getNew_lineAccess().getControl000aKeyword()); 
            match(input,19,FOLLOW_19_in_rulenew_line157); 
             after(grammarAccess.getNew_lineAccess().getControl000aKeyword()); 

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:120:1: entryRulepreprocessing_file : rulepreprocessing_file EOF ;
    public final void entryRulepreprocessing_file() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:121:1: ( rulepreprocessing_file EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:122:1: rulepreprocessing_file EOF
            {
             before(grammarAccess.getPreprocessing_fileRule()); 
            pushFollow(FOLLOW_rulepreprocessing_file_in_entryRulepreprocessing_file185);
            rulepreprocessing_file();

            state._fsp--;

             after(grammarAccess.getPreprocessing_fileRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulepreprocessing_file192); 

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:129:1: rulepreprocessing_file : ( ( rulegroup )? ) ;
    public final void rulepreprocessing_file() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:133:2: ( ( ( rulegroup )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:134:1: ( ( rulegroup )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:134:1: ( ( rulegroup )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:135:1: ( rulegroup )?
            {
             before(grammarAccess.getPreprocessing_fileAccess().getGroupParserRuleCall()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:136:1: ( rulegroup )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==19||LA1_0==21||(LA1_0>=23 && LA1_0<=25)||(LA1_0>=29 && LA1_0<=30)||(LA1_0>=32 && LA1_0<=36)) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:136:3: rulegroup
                    {
                    pushFollow(FOLLOW_rulegroup_in_rulepreprocessing_file219);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:148:1: entryRulegroup : rulegroup EOF ;
    public final void entryRulegroup() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:149:1: ( rulegroup EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:150:1: rulegroup EOF
            {
             before(grammarAccess.getGroupRule()); 
            pushFollow(FOLLOW_rulegroup_in_entryRulegroup247);
            rulegroup();

            state._fsp--;

             after(grammarAccess.getGroupRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulegroup254); 

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:157:1: rulegroup : ( ( ( rulegroup_part ) ) ( ( rulegroup_part )* ) ) ;
    public final void rulegroup() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:161:2: ( ( ( ( rulegroup_part ) ) ( ( rulegroup_part )* ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:162:1: ( ( ( rulegroup_part ) ) ( ( rulegroup_part )* ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:162:1: ( ( ( rulegroup_part ) ) ( ( rulegroup_part )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:163:1: ( ( rulegroup_part ) ) ( ( rulegroup_part )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:163:1: ( ( rulegroup_part ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:164:1: ( rulegroup_part )
            {
             before(grammarAccess.getGroupAccess().getGroup_partParserRuleCall()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:165:1: ( rulegroup_part )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:165:3: rulegroup_part
            {
            pushFollow(FOLLOW_rulegroup_part_in_rulegroup283);
            rulegroup_part();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getGroup_partParserRuleCall()); 

            }

            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:168:1: ( ( rulegroup_part )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:169:1: ( rulegroup_part )*
            {
             before(grammarAccess.getGroupAccess().getGroup_partParserRuleCall()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:170:1: ( rulegroup_part )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==19||LA2_0==21||(LA2_0>=23 && LA2_0<=25)||(LA2_0>=29 && LA2_0<=30)||(LA2_0>=32 && LA2_0<=36)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:170:3: rulegroup_part
            	    {
            	    pushFollow(FOLLOW_rulegroup_part_in_rulegroup296);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:183:1: entryRulegroup_part : rulegroup_part EOF ;
    public final void entryRulegroup_part() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:184:1: ( rulegroup_part EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:185:1: rulegroup_part EOF
            {
             before(grammarAccess.getGroup_partRule()); 
            pushFollow(FOLLOW_rulegroup_part_in_entryRulegroup_part326);
            rulegroup_part();

            state._fsp--;

             after(grammarAccess.getGroup_partRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulegroup_part333); 

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:192:1: rulegroup_part : ( ( rule__Group_part__Alternatives ) ) ;
    public final void rulegroup_part() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:196:2: ( ( ( rule__Group_part__Alternatives ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:197:1: ( ( rule__Group_part__Alternatives ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:197:1: ( ( rule__Group_part__Alternatives ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:198:1: ( rule__Group_part__Alternatives )
            {
             before(grammarAccess.getGroup_partAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:199:1: ( rule__Group_part__Alternatives )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:199:2: rule__Group_part__Alternatives
            {
            pushFollow(FOLLOW_rule__Group_part__Alternatives_in_rulegroup_part359);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:211:1: entryRuleif_action : ruleif_action EOF ;
    public final void entryRuleif_action() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:212:1: ( ruleif_action EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:213:1: ruleif_action EOF
            {
             before(grammarAccess.getIf_actionRule()); 
            pushFollow(FOLLOW_ruleif_action_in_entryRuleif_action386);
            ruleif_action();

            state._fsp--;

             after(grammarAccess.getIf_actionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleif_action393); 

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:220:1: ruleif_action : ( ( rule__If_action__Group__0 ) ) ;
    public final void ruleif_action() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:224:2: ( ( ( rule__If_action__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:225:1: ( ( rule__If_action__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:225:1: ( ( rule__If_action__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:226:1: ( rule__If_action__Group__0 )
            {
             before(grammarAccess.getIf_actionAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:227:1: ( rule__If_action__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:227:2: rule__If_action__Group__0
            {
            pushFollow(FOLLOW_rule__If_action__Group__0_in_ruleif_action419);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:239:1: entryRuleif_group : ruleif_group EOF ;
    public final void entryRuleif_group() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:240:1: ( ruleif_group EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:241:1: ruleif_group EOF
            {
             before(grammarAccess.getIf_groupRule()); 
            pushFollow(FOLLOW_ruleif_group_in_entryRuleif_group446);
            ruleif_group();

            state._fsp--;

             after(grammarAccess.getIf_groupRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleif_group453); 

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:248:1: ruleif_group : ( ( rule__If_group__Alternatives ) ) ;
    public final void ruleif_group() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:252:2: ( ( ( rule__If_group__Alternatives ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:253:1: ( ( rule__If_group__Alternatives ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:253:1: ( ( rule__If_group__Alternatives ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:254:1: ( rule__If_group__Alternatives )
            {
             before(grammarAccess.getIf_groupAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:255:1: ( rule__If_group__Alternatives )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:255:2: rule__If_group__Alternatives
            {
            pushFollow(FOLLOW_rule__If_group__Alternatives_in_ruleif_group479);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:267:1: entryRuleelif_groups : ruleelif_groups EOF ;
    public final void entryRuleelif_groups() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:268:1: ( ruleelif_groups EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:269:1: ruleelif_groups EOF
            {
             before(grammarAccess.getElif_groupsRule()); 
            pushFollow(FOLLOW_ruleelif_groups_in_entryRuleelif_groups506);
            ruleelif_groups();

            state._fsp--;

             after(grammarAccess.getElif_groupsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleelif_groups513); 

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:276:1: ruleelif_groups : ( ( ( ruleelif_group ) ) ( ( ruleelif_group )* ) ) ;
    public final void ruleelif_groups() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:280:2: ( ( ( ( ruleelif_group ) ) ( ( ruleelif_group )* ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:281:1: ( ( ( ruleelif_group ) ) ( ( ruleelif_group )* ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:281:1: ( ( ( ruleelif_group ) ) ( ( ruleelif_group )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:282:1: ( ( ruleelif_group ) ) ( ( ruleelif_group )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:282:1: ( ( ruleelif_group ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:283:1: ( ruleelif_group )
            {
             before(grammarAccess.getElif_groupsAccess().getElif_groupParserRuleCall()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:284:1: ( ruleelif_group )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:284:3: ruleelif_group
            {
            pushFollow(FOLLOW_ruleelif_group_in_ruleelif_groups542);
            ruleelif_group();

            state._fsp--;


            }

             after(grammarAccess.getElif_groupsAccess().getElif_groupParserRuleCall()); 

            }

            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:287:1: ( ( ruleelif_group )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:288:1: ( ruleelif_group )*
            {
             before(grammarAccess.getElif_groupsAccess().getElif_groupParserRuleCall()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:289:1: ( ruleelif_group )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==26) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:289:3: ruleelif_group
            	    {
            	    pushFollow(FOLLOW_ruleelif_group_in_ruleelif_groups555);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:302:1: entryRuleelif_group : ruleelif_group EOF ;
    public final void entryRuleelif_group() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:303:1: ( ruleelif_group EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:304:1: ruleelif_group EOF
            {
             before(grammarAccess.getElif_groupRule()); 
            pushFollow(FOLLOW_ruleelif_group_in_entryRuleelif_group585);
            ruleelif_group();

            state._fsp--;

             after(grammarAccess.getElif_groupRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleelif_group592); 

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:311:1: ruleelif_group : ( ( rule__Elif_group__Group__0 ) ) ;
    public final void ruleelif_group() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:315:2: ( ( ( rule__Elif_group__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:316:1: ( ( rule__Elif_group__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:316:1: ( ( rule__Elif_group__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:317:1: ( rule__Elif_group__Group__0 )
            {
             before(grammarAccess.getElif_groupAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:318:1: ( rule__Elif_group__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:318:2: rule__Elif_group__Group__0
            {
            pushFollow(FOLLOW_rule__Elif_group__Group__0_in_ruleelif_group618);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:330:1: entryRuleconstant_expression : ruleconstant_expression EOF ;
    public final void entryRuleconstant_expression() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:331:1: ( ruleconstant_expression EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:332:1: ruleconstant_expression EOF
            {
             before(grammarAccess.getConstant_expressionRule()); 
            pushFollow(FOLLOW_ruleconstant_expression_in_entryRuleconstant_expression645);
            ruleconstant_expression();

            state._fsp--;

             after(grammarAccess.getConstant_expressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleconstant_expression652); 

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:339:1: ruleconstant_expression : ( '==' ) ;
    public final void ruleconstant_expression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:343:2: ( ( '==' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:344:1: ( '==' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:344:1: ( '==' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:345:1: '=='
            {
             before(grammarAccess.getConstant_expressionAccess().getEqualsSignEqualsSignKeyword()); 
            match(input,20,FOLLOW_20_in_ruleconstant_expression679); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:360:1: entryRulepreprocessing_token : rulepreprocessing_token EOF ;
    public final void entryRulepreprocessing_token() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:361:1: ( rulepreprocessing_token EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:362:1: rulepreprocessing_token EOF
            {
             before(grammarAccess.getPreprocessing_tokenRule()); 
            pushFollow(FOLLOW_rulepreprocessing_token_in_entryRulepreprocessing_token707);
            rulepreprocessing_token();

            state._fsp--;

             after(grammarAccess.getPreprocessing_tokenRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulepreprocessing_token714); 

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:369:1: rulepreprocessing_token : ( '!=' ) ;
    public final void rulepreprocessing_token() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:373:2: ( ( '!=' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:374:1: ( '!=' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:374:1: ( '!=' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:375:1: '!='
            {
             before(grammarAccess.getPreprocessing_tokenAccess().getExclamationMarkEqualsSignKeyword()); 
            match(input,21,FOLLOW_21_in_rulepreprocessing_token741); 
             after(grammarAccess.getPreprocessing_tokenAccess().getExclamationMarkEqualsSignKeyword()); 

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:390:1: entryRuleelse_group : ruleelse_group EOF ;
    public final void entryRuleelse_group() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:391:1: ( ruleelse_group EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:392:1: ruleelse_group EOF
            {
             before(grammarAccess.getElse_groupRule()); 
            pushFollow(FOLLOW_ruleelse_group_in_entryRuleelse_group769);
            ruleelse_group();

            state._fsp--;

             after(grammarAccess.getElse_groupRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleelse_group776); 

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:399:1: ruleelse_group : ( ( rule__Else_group__Group__0 ) ) ;
    public final void ruleelse_group() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:403:2: ( ( ( rule__Else_group__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:404:1: ( ( rule__Else_group__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:404:1: ( ( rule__Else_group__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:405:1: ( rule__Else_group__Group__0 )
            {
             before(grammarAccess.getElse_groupAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:406:1: ( rule__Else_group__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:406:2: rule__Else_group__Group__0
            {
            pushFollow(FOLLOW_rule__Else_group__Group__0_in_ruleelse_group802);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:418:1: entryRuleendif_line : ruleendif_line EOF ;
    public final void entryRuleendif_line() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:419:1: ( ruleendif_line EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:420:1: ruleendif_line EOF
            {
             before(grammarAccess.getEndif_lineRule()); 
            pushFollow(FOLLOW_ruleendif_line_in_entryRuleendif_line829);
            ruleendif_line();

            state._fsp--;

             after(grammarAccess.getEndif_lineRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleendif_line836); 

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:427:1: ruleendif_line : ( ( rule__Endif_line__Group__0 ) ) ;
    public final void ruleendif_line() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:431:2: ( ( ( rule__Endif_line__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:432:1: ( ( rule__Endif_line__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:432:1: ( ( rule__Endif_line__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:433:1: ( rule__Endif_line__Group__0 )
            {
             before(grammarAccess.getEndif_lineAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:434:1: ( rule__Endif_line__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:434:2: rule__Endif_line__Group__0
            {
            pushFollow(FOLLOW_rule__Endif_line__Group__0_in_ruleendif_line862);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:446:1: entryRulecontrol_line : rulecontrol_line EOF ;
    public final void entryRulecontrol_line() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:447:1: ( rulecontrol_line EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:448:1: rulecontrol_line EOF
            {
             before(grammarAccess.getControl_lineRule()); 
            pushFollow(FOLLOW_rulecontrol_line_in_entryRulecontrol_line889);
            rulecontrol_line();

            state._fsp--;

             after(grammarAccess.getControl_lineRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecontrol_line896); 

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:455:1: rulecontrol_line : ( ( rule__Control_line__Alternatives ) ) ;
    public final void rulecontrol_line() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:459:2: ( ( ( rule__Control_line__Alternatives ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:460:1: ( ( rule__Control_line__Alternatives ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:460:1: ( ( rule__Control_line__Alternatives ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:461:1: ( rule__Control_line__Alternatives )
            {
             before(grammarAccess.getControl_lineAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:462:1: ( rule__Control_line__Alternatives )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:462:2: rule__Control_line__Alternatives
            {
            pushFollow(FOLLOW_rule__Control_line__Alternatives_in_rulecontrol_line922);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:474:1: entryRulelparen : rulelparen EOF ;
    public final void entryRulelparen() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:475:1: ( rulelparen EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:476:1: rulelparen EOF
            {
             before(grammarAccess.getLparenRule()); 
            pushFollow(FOLLOW_rulelparen_in_entryRulelparen949);
            rulelparen();

            state._fsp--;

             after(grammarAccess.getLparenRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulelparen956); 

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:483:1: rulelparen : ( '(' ) ;
    public final void rulelparen() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:487:2: ( ( '(' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:488:1: ( '(' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:488:1: ( '(' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:489:1: '('
            {
             before(grammarAccess.getLparenAccess().getLeftParenthesisKeyword()); 
            match(input,22,FOLLOW_22_in_rulelparen983); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:504:1: entryRulereplacement_list : rulereplacement_list EOF ;
    public final void entryRulereplacement_list() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:505:1: ( rulereplacement_list EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:506:1: rulereplacement_list EOF
            {
             before(grammarAccess.getReplacement_listRule()); 
            pushFollow(FOLLOW_rulereplacement_list_in_entryRulereplacement_list1011);
            rulereplacement_list();

            state._fsp--;

             after(grammarAccess.getReplacement_listRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulereplacement_list1018); 

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:513:1: rulereplacement_list : ( ( rulepp_tokens )? ) ;
    public final void rulereplacement_list() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:517:2: ( ( ( rulepp_tokens )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:518:1: ( ( rulepp_tokens )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:518:1: ( ( rulepp_tokens )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:519:1: ( rulepp_tokens )?
            {
             before(grammarAccess.getReplacement_listAccess().getPp_tokensParserRuleCall()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:520:1: ( rulepp_tokens )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:520:3: rulepp_tokens
                    {
                    pushFollow(FOLLOW_rulepp_tokens_in_rulereplacement_list1045);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:532:1: entryRulepp_tokens : rulepp_tokens EOF ;
    public final void entryRulepp_tokens() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:533:1: ( rulepp_tokens EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:534:1: rulepp_tokens EOF
            {
             before(grammarAccess.getPp_tokensRule()); 
            pushFollow(FOLLOW_rulepp_tokens_in_entryRulepp_tokens1073);
            rulepp_tokens();

            state._fsp--;

             after(grammarAccess.getPp_tokensRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulepp_tokens1080); 

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:541:1: rulepp_tokens : ( ( ( rulepreprocessing_token ) ) ( ( rulepreprocessing_token )* ) ) ;
    public final void rulepp_tokens() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:545:2: ( ( ( ( rulepreprocessing_token ) ) ( ( rulepreprocessing_token )* ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:546:1: ( ( ( rulepreprocessing_token ) ) ( ( rulepreprocessing_token )* ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:546:1: ( ( ( rulepreprocessing_token ) ) ( ( rulepreprocessing_token )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:547:1: ( ( rulepreprocessing_token ) ) ( ( rulepreprocessing_token )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:547:1: ( ( rulepreprocessing_token ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:548:1: ( rulepreprocessing_token )
            {
             before(grammarAccess.getPp_tokensAccess().getPreprocessing_tokenParserRuleCall()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:549:1: ( rulepreprocessing_token )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:549:3: rulepreprocessing_token
            {
            pushFollow(FOLLOW_rulepreprocessing_token_in_rulepp_tokens1109);
            rulepreprocessing_token();

            state._fsp--;


            }

             after(grammarAccess.getPp_tokensAccess().getPreprocessing_tokenParserRuleCall()); 

            }

            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:552:1: ( ( rulepreprocessing_token )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:553:1: ( rulepreprocessing_token )*
            {
             before(grammarAccess.getPp_tokensAccess().getPreprocessing_tokenParserRuleCall()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:554:1: ( rulepreprocessing_token )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==21) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:554:3: rulepreprocessing_token
            	    {
            	    pushFollow(FOLLOW_rulepreprocessing_token_in_rulepp_tokens1122);
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


    // $ANTLR start "rule__Group_part__Alternatives"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:571:1: rule__Group_part__Alternatives : ( ( ( rule__Group_part__Group_0__0 ) ) | ( ruleif_action ) | ( rulecontrol_line ) );
    public final void rule__Group_part__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:575:1: ( ( ( rule__Group_part__Group_0__0 ) ) | ( ruleif_action ) | ( rulecontrol_line ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 19:
            case 21:
                {
                alt6=1;
                }
                break;
            case 23:
            case 24:
            case 25:
                {
                alt6=2;
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
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:576:1: ( ( rule__Group_part__Group_0__0 ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:576:1: ( ( rule__Group_part__Group_0__0 ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:577:1: ( rule__Group_part__Group_0__0 )
                    {
                     before(grammarAccess.getGroup_partAccess().getGroup_0()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:578:1: ( rule__Group_part__Group_0__0 )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:578:2: rule__Group_part__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Group_part__Group_0__0_in_rule__Group_part__Alternatives1165);
                    rule__Group_part__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGroup_partAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:582:6: ( ruleif_action )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:582:6: ( ruleif_action )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:583:1: ruleif_action
                    {
                     before(grammarAccess.getGroup_partAccess().getIf_actionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleif_action_in_rule__Group_part__Alternatives1183);
                    ruleif_action();

                    state._fsp--;

                     after(grammarAccess.getGroup_partAccess().getIf_actionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:588:6: ( rulecontrol_line )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:588:6: ( rulecontrol_line )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:589:1: rulecontrol_line
                    {
                     before(grammarAccess.getGroup_partAccess().getControl_lineParserRuleCall_2()); 
                    pushFollow(FOLLOW_rulecontrol_line_in_rule__Group_part__Alternatives1200);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:599:1: rule__If_group__Alternatives : ( ( ( rule__If_group__Group_0__0 ) ) | ( ( rule__If_group__Group_1__0 ) ) | ( ( rule__If_group__Group_2__0 ) ) );
    public final void rule__If_group__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:603:1: ( ( ( rule__If_group__Group_0__0 ) ) | ( ( rule__If_group__Group_1__0 ) ) | ( ( rule__If_group__Group_2__0 ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt7=1;
                }
                break;
            case 24:
                {
                alt7=2;
                }
                break;
            case 25:
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
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:604:1: ( ( rule__If_group__Group_0__0 ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:604:1: ( ( rule__If_group__Group_0__0 ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:605:1: ( rule__If_group__Group_0__0 )
                    {
                     before(grammarAccess.getIf_groupAccess().getGroup_0()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:606:1: ( rule__If_group__Group_0__0 )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:606:2: rule__If_group__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__If_group__Group_0__0_in_rule__If_group__Alternatives1232);
                    rule__If_group__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getIf_groupAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:610:6: ( ( rule__If_group__Group_1__0 ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:610:6: ( ( rule__If_group__Group_1__0 ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:611:1: ( rule__If_group__Group_1__0 )
                    {
                     before(grammarAccess.getIf_groupAccess().getGroup_1()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:612:1: ( rule__If_group__Group_1__0 )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:612:2: rule__If_group__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__If_group__Group_1__0_in_rule__If_group__Alternatives1250);
                    rule__If_group__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getIf_groupAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:616:6: ( ( rule__If_group__Group_2__0 ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:616:6: ( ( rule__If_group__Group_2__0 ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:617:1: ( rule__If_group__Group_2__0 )
                    {
                     before(grammarAccess.getIf_groupAccess().getGroup_2()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:618:1: ( rule__If_group__Group_2__0 )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:618:2: rule__If_group__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__If_group__Group_2__0_in_rule__If_group__Alternatives1268);
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


    // $ANTLR start "rule__Control_line__Alternatives"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:627:1: rule__Control_line__Alternatives : ( ( ( rule__Control_line__Group_0__0 ) ) | ( ( rule__Control_line__Group_1__0 ) ) | ( ( rule__Control_line__Group_2__0 ) ) | ( ( rule__Control_line__Group_3__0 ) ) | ( ( rule__Control_line__Group_4__0 ) ) | ( ( rule__Control_line__Group_5__0 ) ) | ( ( rule__Control_line__Group_6__0 ) ) | ( ( rule__Control_line__Group_7__0 ) ) );
    public final void rule__Control_line__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:631:1: ( ( ( rule__Control_line__Group_0__0 ) ) | ( ( rule__Control_line__Group_1__0 ) ) | ( ( rule__Control_line__Group_2__0 ) ) | ( ( rule__Control_line__Group_3__0 ) ) | ( ( rule__Control_line__Group_4__0 ) ) | ( ( rule__Control_line__Group_5__0 ) ) | ( ( rule__Control_line__Group_6__0 ) ) | ( ( rule__Control_line__Group_7__0 ) ) )
            int alt8=8;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:632:1: ( ( rule__Control_line__Group_0__0 ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:632:1: ( ( rule__Control_line__Group_0__0 ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:633:1: ( rule__Control_line__Group_0__0 )
                    {
                     before(grammarAccess.getControl_lineAccess().getGroup_0()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:634:1: ( rule__Control_line__Group_0__0 )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:634:2: rule__Control_line__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Control_line__Group_0__0_in_rule__Control_line__Alternatives1301);
                    rule__Control_line__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getControl_lineAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:638:6: ( ( rule__Control_line__Group_1__0 ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:638:6: ( ( rule__Control_line__Group_1__0 ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:639:1: ( rule__Control_line__Group_1__0 )
                    {
                     before(grammarAccess.getControl_lineAccess().getGroup_1()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:640:1: ( rule__Control_line__Group_1__0 )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:640:2: rule__Control_line__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Control_line__Group_1__0_in_rule__Control_line__Alternatives1319);
                    rule__Control_line__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getControl_lineAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:644:6: ( ( rule__Control_line__Group_2__0 ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:644:6: ( ( rule__Control_line__Group_2__0 ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:645:1: ( rule__Control_line__Group_2__0 )
                    {
                     before(grammarAccess.getControl_lineAccess().getGroup_2()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:646:1: ( rule__Control_line__Group_2__0 )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:646:2: rule__Control_line__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Control_line__Group_2__0_in_rule__Control_line__Alternatives1337);
                    rule__Control_line__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getControl_lineAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:650:6: ( ( rule__Control_line__Group_3__0 ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:650:6: ( ( rule__Control_line__Group_3__0 ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:651:1: ( rule__Control_line__Group_3__0 )
                    {
                     before(grammarAccess.getControl_lineAccess().getGroup_3()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:652:1: ( rule__Control_line__Group_3__0 )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:652:2: rule__Control_line__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Control_line__Group_3__0_in_rule__Control_line__Alternatives1355);
                    rule__Control_line__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getControl_lineAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:656:6: ( ( rule__Control_line__Group_4__0 ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:656:6: ( ( rule__Control_line__Group_4__0 ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:657:1: ( rule__Control_line__Group_4__0 )
                    {
                     before(grammarAccess.getControl_lineAccess().getGroup_4()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:658:1: ( rule__Control_line__Group_4__0 )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:658:2: rule__Control_line__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Control_line__Group_4__0_in_rule__Control_line__Alternatives1373);
                    rule__Control_line__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getControl_lineAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:662:6: ( ( rule__Control_line__Group_5__0 ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:662:6: ( ( rule__Control_line__Group_5__0 ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:663:1: ( rule__Control_line__Group_5__0 )
                    {
                     before(grammarAccess.getControl_lineAccess().getGroup_5()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:664:1: ( rule__Control_line__Group_5__0 )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:664:2: rule__Control_line__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Control_line__Group_5__0_in_rule__Control_line__Alternatives1391);
                    rule__Control_line__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getControl_lineAccess().getGroup_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:668:6: ( ( rule__Control_line__Group_6__0 ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:668:6: ( ( rule__Control_line__Group_6__0 ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:669:1: ( rule__Control_line__Group_6__0 )
                    {
                     before(grammarAccess.getControl_lineAccess().getGroup_6()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:670:1: ( rule__Control_line__Group_6__0 )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:670:2: rule__Control_line__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Control_line__Group_6__0_in_rule__Control_line__Alternatives1409);
                    rule__Control_line__Group_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getControl_lineAccess().getGroup_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:674:6: ( ( rule__Control_line__Group_7__0 ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:674:6: ( ( rule__Control_line__Group_7__0 ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:675:1: ( rule__Control_line__Group_7__0 )
                    {
                     before(grammarAccess.getControl_lineAccess().getGroup_7()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:676:1: ( rule__Control_line__Group_7__0 )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:676:2: rule__Control_line__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Control_line__Group_7__0_in_rule__Control_line__Alternatives1427);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:690:1: rule__Group_part__Group_0__0 : rule__Group_part__Group_0__0__Impl rule__Group_part__Group_0__1 ;
    public final void rule__Group_part__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:694:1: ( rule__Group_part__Group_0__0__Impl rule__Group_part__Group_0__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:695:2: rule__Group_part__Group_0__0__Impl rule__Group_part__Group_0__1
            {
            pushFollow(FOLLOW_rule__Group_part__Group_0__0__Impl_in_rule__Group_part__Group_0__01461);
            rule__Group_part__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Group_part__Group_0__1_in_rule__Group_part__Group_0__01464);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:702:1: rule__Group_part__Group_0__0__Impl : ( ( rulepp_tokens )? ) ;
    public final void rule__Group_part__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:706:1: ( ( ( rulepp_tokens )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:707:1: ( ( rulepp_tokens )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:707:1: ( ( rulepp_tokens )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:708:1: ( rulepp_tokens )?
            {
             before(grammarAccess.getGroup_partAccess().getPp_tokensParserRuleCall_0_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:709:1: ( rulepp_tokens )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:709:3: rulepp_tokens
                    {
                    pushFollow(FOLLOW_rulepp_tokens_in_rule__Group_part__Group_0__0__Impl1492);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:719:1: rule__Group_part__Group_0__1 : rule__Group_part__Group_0__1__Impl ;
    public final void rule__Group_part__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:723:1: ( rule__Group_part__Group_0__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:724:2: rule__Group_part__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Group_part__Group_0__1__Impl_in_rule__Group_part__Group_0__11523);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:730:1: rule__Group_part__Group_0__1__Impl : ( rulenew_line ) ;
    public final void rule__Group_part__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:734:1: ( ( rulenew_line ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:735:1: ( rulenew_line )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:735:1: ( rulenew_line )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:736:1: rulenew_line
            {
             before(grammarAccess.getGroup_partAccess().getNew_lineParserRuleCall_0_1()); 
            pushFollow(FOLLOW_rulenew_line_in_rule__Group_part__Group_0__1__Impl1550);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:751:1: rule__If_action__Group__0 : rule__If_action__Group__0__Impl rule__If_action__Group__1 ;
    public final void rule__If_action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:755:1: ( rule__If_action__Group__0__Impl rule__If_action__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:756:2: rule__If_action__Group__0__Impl rule__If_action__Group__1
            {
            pushFollow(FOLLOW_rule__If_action__Group__0__Impl_in_rule__If_action__Group__01583);
            rule__If_action__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__If_action__Group__1_in_rule__If_action__Group__01586);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:763:1: rule__If_action__Group__0__Impl : ( ruleif_group ) ;
    public final void rule__If_action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:767:1: ( ( ruleif_group ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:768:1: ( ruleif_group )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:768:1: ( ruleif_group )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:769:1: ruleif_group
            {
             before(grammarAccess.getIf_actionAccess().getIf_groupParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleif_group_in_rule__If_action__Group__0__Impl1613);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:780:1: rule__If_action__Group__1 : rule__If_action__Group__1__Impl rule__If_action__Group__2 ;
    public final void rule__If_action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:784:1: ( rule__If_action__Group__1__Impl rule__If_action__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:785:2: rule__If_action__Group__1__Impl rule__If_action__Group__2
            {
            pushFollow(FOLLOW_rule__If_action__Group__1__Impl_in_rule__If_action__Group__11642);
            rule__If_action__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__If_action__Group__2_in_rule__If_action__Group__11645);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:792:1: rule__If_action__Group__1__Impl : ( ( ruleelif_groups )? ) ;
    public final void rule__If_action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:796:1: ( ( ( ruleelif_groups )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:797:1: ( ( ruleelif_groups )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:797:1: ( ( ruleelif_groups )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:798:1: ( ruleelif_groups )?
            {
             before(grammarAccess.getIf_actionAccess().getElif_groupsParserRuleCall_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:799:1: ( ruleelif_groups )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:799:3: ruleelif_groups
                    {
                    pushFollow(FOLLOW_ruleelif_groups_in_rule__If_action__Group__1__Impl1673);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:809:1: rule__If_action__Group__2 : rule__If_action__Group__2__Impl rule__If_action__Group__3 ;
    public final void rule__If_action__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:813:1: ( rule__If_action__Group__2__Impl rule__If_action__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:814:2: rule__If_action__Group__2__Impl rule__If_action__Group__3
            {
            pushFollow(FOLLOW_rule__If_action__Group__2__Impl_in_rule__If_action__Group__21704);
            rule__If_action__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__If_action__Group__3_in_rule__If_action__Group__21707);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:821:1: rule__If_action__Group__2__Impl : ( ( ruleelse_group )? ) ;
    public final void rule__If_action__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:825:1: ( ( ( ruleelse_group )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:826:1: ( ( ruleelse_group )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:826:1: ( ( ruleelse_group )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:827:1: ( ruleelse_group )?
            {
             before(grammarAccess.getIf_actionAccess().getElse_groupParserRuleCall_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:828:1: ( ruleelse_group )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==27) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:828:3: ruleelse_group
                    {
                    pushFollow(FOLLOW_ruleelse_group_in_rule__If_action__Group__2__Impl1735);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:838:1: rule__If_action__Group__3 : rule__If_action__Group__3__Impl ;
    public final void rule__If_action__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:842:1: ( rule__If_action__Group__3__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:843:2: rule__If_action__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__If_action__Group__3__Impl_in_rule__If_action__Group__31766);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:849:1: rule__If_action__Group__3__Impl : ( ruleendif_line ) ;
    public final void rule__If_action__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:853:1: ( ( ruleendif_line ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:854:1: ( ruleendif_line )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:854:1: ( ruleendif_line )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:855:1: ruleendif_line
            {
             before(grammarAccess.getIf_actionAccess().getEndif_lineParserRuleCall_3()); 
            pushFollow(FOLLOW_ruleendif_line_in_rule__If_action__Group__3__Impl1793);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:874:1: rule__If_group__Group_0__0 : rule__If_group__Group_0__0__Impl rule__If_group__Group_0__1 ;
    public final void rule__If_group__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:878:1: ( rule__If_group__Group_0__0__Impl rule__If_group__Group_0__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:879:2: rule__If_group__Group_0__0__Impl rule__If_group__Group_0__1
            {
            pushFollow(FOLLOW_rule__If_group__Group_0__0__Impl_in_rule__If_group__Group_0__01830);
            rule__If_group__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__If_group__Group_0__1_in_rule__If_group__Group_0__01833);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:886:1: rule__If_group__Group_0__0__Impl : ( '#if' ) ;
    public final void rule__If_group__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:890:1: ( ( '#if' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:891:1: ( '#if' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:891:1: ( '#if' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:892:1: '#if'
            {
             before(grammarAccess.getIf_groupAccess().getIfKeyword_0_0()); 
            match(input,23,FOLLOW_23_in_rule__If_group__Group_0__0__Impl1861); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:905:1: rule__If_group__Group_0__1 : rule__If_group__Group_0__1__Impl rule__If_group__Group_0__2 ;
    public final void rule__If_group__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:909:1: ( rule__If_group__Group_0__1__Impl rule__If_group__Group_0__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:910:2: rule__If_group__Group_0__1__Impl rule__If_group__Group_0__2
            {
            pushFollow(FOLLOW_rule__If_group__Group_0__1__Impl_in_rule__If_group__Group_0__11892);
            rule__If_group__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__If_group__Group_0__2_in_rule__If_group__Group_0__11895);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:917:1: rule__If_group__Group_0__1__Impl : ( ruleconstant_expression ) ;
    public final void rule__If_group__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:921:1: ( ( ruleconstant_expression ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:922:1: ( ruleconstant_expression )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:922:1: ( ruleconstant_expression )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:923:1: ruleconstant_expression
            {
             before(grammarAccess.getIf_groupAccess().getConstant_expressionParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleconstant_expression_in_rule__If_group__Group_0__1__Impl1922);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:934:1: rule__If_group__Group_0__2 : rule__If_group__Group_0__2__Impl rule__If_group__Group_0__3 ;
    public final void rule__If_group__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:938:1: ( rule__If_group__Group_0__2__Impl rule__If_group__Group_0__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:939:2: rule__If_group__Group_0__2__Impl rule__If_group__Group_0__3
            {
            pushFollow(FOLLOW_rule__If_group__Group_0__2__Impl_in_rule__If_group__Group_0__21951);
            rule__If_group__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__If_group__Group_0__3_in_rule__If_group__Group_0__21954);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:946:1: rule__If_group__Group_0__2__Impl : ( rulenew_line ) ;
    public final void rule__If_group__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:950:1: ( ( rulenew_line ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:951:1: ( rulenew_line )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:951:1: ( rulenew_line )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:952:1: rulenew_line
            {
             before(grammarAccess.getIf_groupAccess().getNew_lineParserRuleCall_0_2()); 
            pushFollow(FOLLOW_rulenew_line_in_rule__If_group__Group_0__2__Impl1981);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:963:1: rule__If_group__Group_0__3 : rule__If_group__Group_0__3__Impl ;
    public final void rule__If_group__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:967:1: ( rule__If_group__Group_0__3__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:968:2: rule__If_group__Group_0__3__Impl
            {
            pushFollow(FOLLOW_rule__If_group__Group_0__3__Impl_in_rule__If_group__Group_0__32010);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:974:1: rule__If_group__Group_0__3__Impl : ( ( rulegroup )? ) ;
    public final void rule__If_group__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:978:1: ( ( ( rulegroup )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:979:1: ( ( rulegroup )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:979:1: ( ( rulegroup )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:980:1: ( rulegroup )?
            {
             before(grammarAccess.getIf_groupAccess().getGroupParserRuleCall_0_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:981:1: ( rulegroup )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==19||LA12_0==21||(LA12_0>=23 && LA12_0<=25)||(LA12_0>=29 && LA12_0<=30)||(LA12_0>=32 && LA12_0<=36)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:981:3: rulegroup
                    {
                    pushFollow(FOLLOW_rulegroup_in_rule__If_group__Group_0__3__Impl2038);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:999:1: rule__If_group__Group_1__0 : rule__If_group__Group_1__0__Impl rule__If_group__Group_1__1 ;
    public final void rule__If_group__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1003:1: ( rule__If_group__Group_1__0__Impl rule__If_group__Group_1__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1004:2: rule__If_group__Group_1__0__Impl rule__If_group__Group_1__1
            {
            pushFollow(FOLLOW_rule__If_group__Group_1__0__Impl_in_rule__If_group__Group_1__02077);
            rule__If_group__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__If_group__Group_1__1_in_rule__If_group__Group_1__02080);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1011:1: rule__If_group__Group_1__0__Impl : ( '#ifdef' ) ;
    public final void rule__If_group__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1015:1: ( ( '#ifdef' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1016:1: ( '#ifdef' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1016:1: ( '#ifdef' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1017:1: '#ifdef'
            {
             before(grammarAccess.getIf_groupAccess().getIfdefKeyword_1_0()); 
            match(input,24,FOLLOW_24_in_rule__If_group__Group_1__0__Impl2108); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1030:1: rule__If_group__Group_1__1 : rule__If_group__Group_1__1__Impl rule__If_group__Group_1__2 ;
    public final void rule__If_group__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1034:1: ( rule__If_group__Group_1__1__Impl rule__If_group__Group_1__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1035:2: rule__If_group__Group_1__1__Impl rule__If_group__Group_1__2
            {
            pushFollow(FOLLOW_rule__If_group__Group_1__1__Impl_in_rule__If_group__Group_1__12139);
            rule__If_group__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__If_group__Group_1__2_in_rule__If_group__Group_1__12142);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1042:1: rule__If_group__Group_1__1__Impl : ( RULE_IDENTIFIER ) ;
    public final void rule__If_group__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1046:1: ( ( RULE_IDENTIFIER ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1047:1: ( RULE_IDENTIFIER )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1047:1: ( RULE_IDENTIFIER )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1048:1: RULE_IDENTIFIER
            {
             before(grammarAccess.getIf_groupAccess().getIDENTIFIERTerminalRuleCall_1_1()); 
            match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rule__If_group__Group_1__1__Impl2169); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1059:1: rule__If_group__Group_1__2 : rule__If_group__Group_1__2__Impl rule__If_group__Group_1__3 ;
    public final void rule__If_group__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1063:1: ( rule__If_group__Group_1__2__Impl rule__If_group__Group_1__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1064:2: rule__If_group__Group_1__2__Impl rule__If_group__Group_1__3
            {
            pushFollow(FOLLOW_rule__If_group__Group_1__2__Impl_in_rule__If_group__Group_1__22198);
            rule__If_group__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__If_group__Group_1__3_in_rule__If_group__Group_1__22201);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1071:1: rule__If_group__Group_1__2__Impl : ( rulenew_line ) ;
    public final void rule__If_group__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1075:1: ( ( rulenew_line ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1076:1: ( rulenew_line )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1076:1: ( rulenew_line )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1077:1: rulenew_line
            {
             before(grammarAccess.getIf_groupAccess().getNew_lineParserRuleCall_1_2()); 
            pushFollow(FOLLOW_rulenew_line_in_rule__If_group__Group_1__2__Impl2228);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1088:1: rule__If_group__Group_1__3 : rule__If_group__Group_1__3__Impl ;
    public final void rule__If_group__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1092:1: ( rule__If_group__Group_1__3__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1093:2: rule__If_group__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__If_group__Group_1__3__Impl_in_rule__If_group__Group_1__32257);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1099:1: rule__If_group__Group_1__3__Impl : ( ( rulegroup )? ) ;
    public final void rule__If_group__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1103:1: ( ( ( rulegroup )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1104:1: ( ( rulegroup )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1104:1: ( ( rulegroup )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1105:1: ( rulegroup )?
            {
             before(grammarAccess.getIf_groupAccess().getGroupParserRuleCall_1_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1106:1: ( rulegroup )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==19||LA13_0==21||(LA13_0>=23 && LA13_0<=25)||(LA13_0>=29 && LA13_0<=30)||(LA13_0>=32 && LA13_0<=36)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1106:3: rulegroup
                    {
                    pushFollow(FOLLOW_rulegroup_in_rule__If_group__Group_1__3__Impl2285);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1124:1: rule__If_group__Group_2__0 : rule__If_group__Group_2__0__Impl rule__If_group__Group_2__1 ;
    public final void rule__If_group__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1128:1: ( rule__If_group__Group_2__0__Impl rule__If_group__Group_2__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1129:2: rule__If_group__Group_2__0__Impl rule__If_group__Group_2__1
            {
            pushFollow(FOLLOW_rule__If_group__Group_2__0__Impl_in_rule__If_group__Group_2__02324);
            rule__If_group__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__If_group__Group_2__1_in_rule__If_group__Group_2__02327);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1136:1: rule__If_group__Group_2__0__Impl : ( '#ifndef' ) ;
    public final void rule__If_group__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1140:1: ( ( '#ifndef' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1141:1: ( '#ifndef' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1141:1: ( '#ifndef' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1142:1: '#ifndef'
            {
             before(grammarAccess.getIf_groupAccess().getIfndefKeyword_2_0()); 
            match(input,25,FOLLOW_25_in_rule__If_group__Group_2__0__Impl2355); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1155:1: rule__If_group__Group_2__1 : rule__If_group__Group_2__1__Impl rule__If_group__Group_2__2 ;
    public final void rule__If_group__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1159:1: ( rule__If_group__Group_2__1__Impl rule__If_group__Group_2__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1160:2: rule__If_group__Group_2__1__Impl rule__If_group__Group_2__2
            {
            pushFollow(FOLLOW_rule__If_group__Group_2__1__Impl_in_rule__If_group__Group_2__12386);
            rule__If_group__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__If_group__Group_2__2_in_rule__If_group__Group_2__12389);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1167:1: rule__If_group__Group_2__1__Impl : ( RULE_IDENTIFIER ) ;
    public final void rule__If_group__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1171:1: ( ( RULE_IDENTIFIER ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1172:1: ( RULE_IDENTIFIER )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1172:1: ( RULE_IDENTIFIER )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1173:1: RULE_IDENTIFIER
            {
             before(grammarAccess.getIf_groupAccess().getIDENTIFIERTerminalRuleCall_2_1()); 
            match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rule__If_group__Group_2__1__Impl2416); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1184:1: rule__If_group__Group_2__2 : rule__If_group__Group_2__2__Impl rule__If_group__Group_2__3 ;
    public final void rule__If_group__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1188:1: ( rule__If_group__Group_2__2__Impl rule__If_group__Group_2__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1189:2: rule__If_group__Group_2__2__Impl rule__If_group__Group_2__3
            {
            pushFollow(FOLLOW_rule__If_group__Group_2__2__Impl_in_rule__If_group__Group_2__22445);
            rule__If_group__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__If_group__Group_2__3_in_rule__If_group__Group_2__22448);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1196:1: rule__If_group__Group_2__2__Impl : ( rulenew_line ) ;
    public final void rule__If_group__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1200:1: ( ( rulenew_line ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1201:1: ( rulenew_line )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1201:1: ( rulenew_line )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1202:1: rulenew_line
            {
             before(grammarAccess.getIf_groupAccess().getNew_lineParserRuleCall_2_2()); 
            pushFollow(FOLLOW_rulenew_line_in_rule__If_group__Group_2__2__Impl2475);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1213:1: rule__If_group__Group_2__3 : rule__If_group__Group_2__3__Impl ;
    public final void rule__If_group__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1217:1: ( rule__If_group__Group_2__3__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1218:2: rule__If_group__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__If_group__Group_2__3__Impl_in_rule__If_group__Group_2__32504);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1224:1: rule__If_group__Group_2__3__Impl : ( ( rulegroup )? ) ;
    public final void rule__If_group__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1228:1: ( ( ( rulegroup )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1229:1: ( ( rulegroup )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1229:1: ( ( rulegroup )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1230:1: ( rulegroup )?
            {
             before(grammarAccess.getIf_groupAccess().getGroupParserRuleCall_2_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1231:1: ( rulegroup )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==19||LA14_0==21||(LA14_0>=23 && LA14_0<=25)||(LA14_0>=29 && LA14_0<=30)||(LA14_0>=32 && LA14_0<=36)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1231:3: rulegroup
                    {
                    pushFollow(FOLLOW_rulegroup_in_rule__If_group__Group_2__3__Impl2532);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1249:1: rule__Elif_group__Group__0 : rule__Elif_group__Group__0__Impl rule__Elif_group__Group__1 ;
    public final void rule__Elif_group__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1253:1: ( rule__Elif_group__Group__0__Impl rule__Elif_group__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1254:2: rule__Elif_group__Group__0__Impl rule__Elif_group__Group__1
            {
            pushFollow(FOLLOW_rule__Elif_group__Group__0__Impl_in_rule__Elif_group__Group__02571);
            rule__Elif_group__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Elif_group__Group__1_in_rule__Elif_group__Group__02574);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1261:1: rule__Elif_group__Group__0__Impl : ( '#elif' ) ;
    public final void rule__Elif_group__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1265:1: ( ( '#elif' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1266:1: ( '#elif' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1266:1: ( '#elif' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1267:1: '#elif'
            {
             before(grammarAccess.getElif_groupAccess().getElifKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__Elif_group__Group__0__Impl2602); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1280:1: rule__Elif_group__Group__1 : rule__Elif_group__Group__1__Impl rule__Elif_group__Group__2 ;
    public final void rule__Elif_group__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1284:1: ( rule__Elif_group__Group__1__Impl rule__Elif_group__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1285:2: rule__Elif_group__Group__1__Impl rule__Elif_group__Group__2
            {
            pushFollow(FOLLOW_rule__Elif_group__Group__1__Impl_in_rule__Elif_group__Group__12633);
            rule__Elif_group__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Elif_group__Group__2_in_rule__Elif_group__Group__12636);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1292:1: rule__Elif_group__Group__1__Impl : ( ruleconstant_expression ) ;
    public final void rule__Elif_group__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1296:1: ( ( ruleconstant_expression ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1297:1: ( ruleconstant_expression )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1297:1: ( ruleconstant_expression )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1298:1: ruleconstant_expression
            {
             before(grammarAccess.getElif_groupAccess().getConstant_expressionParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleconstant_expression_in_rule__Elif_group__Group__1__Impl2663);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1309:1: rule__Elif_group__Group__2 : rule__Elif_group__Group__2__Impl rule__Elif_group__Group__3 ;
    public final void rule__Elif_group__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1313:1: ( rule__Elif_group__Group__2__Impl rule__Elif_group__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1314:2: rule__Elif_group__Group__2__Impl rule__Elif_group__Group__3
            {
            pushFollow(FOLLOW_rule__Elif_group__Group__2__Impl_in_rule__Elif_group__Group__22692);
            rule__Elif_group__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Elif_group__Group__3_in_rule__Elif_group__Group__22695);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1321:1: rule__Elif_group__Group__2__Impl : ( rulenew_line ) ;
    public final void rule__Elif_group__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1325:1: ( ( rulenew_line ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1326:1: ( rulenew_line )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1326:1: ( rulenew_line )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1327:1: rulenew_line
            {
             before(grammarAccess.getElif_groupAccess().getNew_lineParserRuleCall_2()); 
            pushFollow(FOLLOW_rulenew_line_in_rule__Elif_group__Group__2__Impl2722);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1338:1: rule__Elif_group__Group__3 : rule__Elif_group__Group__3__Impl ;
    public final void rule__Elif_group__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1342:1: ( rule__Elif_group__Group__3__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1343:2: rule__Elif_group__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Elif_group__Group__3__Impl_in_rule__Elif_group__Group__32751);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1349:1: rule__Elif_group__Group__3__Impl : ( ( rulegroup )? ) ;
    public final void rule__Elif_group__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1353:1: ( ( ( rulegroup )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1354:1: ( ( rulegroup )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1354:1: ( ( rulegroup )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1355:1: ( rulegroup )?
            {
             before(grammarAccess.getElif_groupAccess().getGroupParserRuleCall_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1356:1: ( rulegroup )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==19||LA15_0==21||(LA15_0>=23 && LA15_0<=25)||(LA15_0>=29 && LA15_0<=30)||(LA15_0>=32 && LA15_0<=36)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1356:3: rulegroup
                    {
                    pushFollow(FOLLOW_rulegroup_in_rule__Elif_group__Group__3__Impl2779);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1374:1: rule__Else_group__Group__0 : rule__Else_group__Group__0__Impl rule__Else_group__Group__1 ;
    public final void rule__Else_group__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1378:1: ( rule__Else_group__Group__0__Impl rule__Else_group__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1379:2: rule__Else_group__Group__0__Impl rule__Else_group__Group__1
            {
            pushFollow(FOLLOW_rule__Else_group__Group__0__Impl_in_rule__Else_group__Group__02818);
            rule__Else_group__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Else_group__Group__1_in_rule__Else_group__Group__02821);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1386:1: rule__Else_group__Group__0__Impl : ( '#else' ) ;
    public final void rule__Else_group__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1390:1: ( ( '#else' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1391:1: ( '#else' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1391:1: ( '#else' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1392:1: '#else'
            {
             before(grammarAccess.getElse_groupAccess().getElseKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__Else_group__Group__0__Impl2849); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1405:1: rule__Else_group__Group__1 : rule__Else_group__Group__1__Impl rule__Else_group__Group__2 ;
    public final void rule__Else_group__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1409:1: ( rule__Else_group__Group__1__Impl rule__Else_group__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1410:2: rule__Else_group__Group__1__Impl rule__Else_group__Group__2
            {
            pushFollow(FOLLOW_rule__Else_group__Group__1__Impl_in_rule__Else_group__Group__12880);
            rule__Else_group__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Else_group__Group__2_in_rule__Else_group__Group__12883);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1417:1: rule__Else_group__Group__1__Impl : ( rulenew_line ) ;
    public final void rule__Else_group__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1421:1: ( ( rulenew_line ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1422:1: ( rulenew_line )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1422:1: ( rulenew_line )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1423:1: rulenew_line
            {
             before(grammarAccess.getElse_groupAccess().getNew_lineParserRuleCall_1()); 
            pushFollow(FOLLOW_rulenew_line_in_rule__Else_group__Group__1__Impl2910);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1434:1: rule__Else_group__Group__2 : rule__Else_group__Group__2__Impl ;
    public final void rule__Else_group__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1438:1: ( rule__Else_group__Group__2__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1439:2: rule__Else_group__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Else_group__Group__2__Impl_in_rule__Else_group__Group__22939);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1445:1: rule__Else_group__Group__2__Impl : ( ( rulegroup )? ) ;
    public final void rule__Else_group__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1449:1: ( ( ( rulegroup )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1450:1: ( ( rulegroup )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1450:1: ( ( rulegroup )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1451:1: ( rulegroup )?
            {
             before(grammarAccess.getElse_groupAccess().getGroupParserRuleCall_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1452:1: ( rulegroup )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==19||LA16_0==21||(LA16_0>=23 && LA16_0<=25)||(LA16_0>=29 && LA16_0<=30)||(LA16_0>=32 && LA16_0<=36)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1452:3: rulegroup
                    {
                    pushFollow(FOLLOW_rulegroup_in_rule__Else_group__Group__2__Impl2967);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1468:1: rule__Endif_line__Group__0 : rule__Endif_line__Group__0__Impl rule__Endif_line__Group__1 ;
    public final void rule__Endif_line__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1472:1: ( rule__Endif_line__Group__0__Impl rule__Endif_line__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1473:2: rule__Endif_line__Group__0__Impl rule__Endif_line__Group__1
            {
            pushFollow(FOLLOW_rule__Endif_line__Group__0__Impl_in_rule__Endif_line__Group__03004);
            rule__Endif_line__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Endif_line__Group__1_in_rule__Endif_line__Group__03007);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1480:1: rule__Endif_line__Group__0__Impl : ( '#endif' ) ;
    public final void rule__Endif_line__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1484:1: ( ( '#endif' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1485:1: ( '#endif' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1485:1: ( '#endif' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1486:1: '#endif'
            {
             before(grammarAccess.getEndif_lineAccess().getEndifKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__Endif_line__Group__0__Impl3035); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1499:1: rule__Endif_line__Group__1 : rule__Endif_line__Group__1__Impl ;
    public final void rule__Endif_line__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1503:1: ( rule__Endif_line__Group__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1504:2: rule__Endif_line__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Endif_line__Group__1__Impl_in_rule__Endif_line__Group__13066);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1510:1: rule__Endif_line__Group__1__Impl : ( rulenew_line ) ;
    public final void rule__Endif_line__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1514:1: ( ( rulenew_line ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1515:1: ( rulenew_line )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1515:1: ( rulenew_line )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1516:1: rulenew_line
            {
             before(grammarAccess.getEndif_lineAccess().getNew_lineParserRuleCall_1()); 
            pushFollow(FOLLOW_rulenew_line_in_rule__Endif_line__Group__1__Impl3093);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1531:1: rule__Control_line__Group_0__0 : rule__Control_line__Group_0__0__Impl rule__Control_line__Group_0__1 ;
    public final void rule__Control_line__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1535:1: ( rule__Control_line__Group_0__0__Impl rule__Control_line__Group_0__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1536:2: rule__Control_line__Group_0__0__Impl rule__Control_line__Group_0__1
            {
            pushFollow(FOLLOW_rule__Control_line__Group_0__0__Impl_in_rule__Control_line__Group_0__03126);
            rule__Control_line__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Control_line__Group_0__1_in_rule__Control_line__Group_0__03129);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1543:1: rule__Control_line__Group_0__0__Impl : ( '#include' ) ;
    public final void rule__Control_line__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1547:1: ( ( '#include' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1548:1: ( '#include' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1548:1: ( '#include' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1549:1: '#include'
            {
             before(grammarAccess.getControl_lineAccess().getIncludeKeyword_0_0()); 
            match(input,29,FOLLOW_29_in_rule__Control_line__Group_0__0__Impl3157); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1562:1: rule__Control_line__Group_0__1 : rule__Control_line__Group_0__1__Impl rule__Control_line__Group_0__2 ;
    public final void rule__Control_line__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1566:1: ( rule__Control_line__Group_0__1__Impl rule__Control_line__Group_0__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1567:2: rule__Control_line__Group_0__1__Impl rule__Control_line__Group_0__2
            {
            pushFollow(FOLLOW_rule__Control_line__Group_0__1__Impl_in_rule__Control_line__Group_0__13188);
            rule__Control_line__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Control_line__Group_0__2_in_rule__Control_line__Group_0__13191);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1574:1: rule__Control_line__Group_0__1__Impl : ( rulepp_tokens ) ;
    public final void rule__Control_line__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1578:1: ( ( rulepp_tokens ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1579:1: ( rulepp_tokens )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1579:1: ( rulepp_tokens )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1580:1: rulepp_tokens
            {
             before(grammarAccess.getControl_lineAccess().getPp_tokensParserRuleCall_0_1()); 
            pushFollow(FOLLOW_rulepp_tokens_in_rule__Control_line__Group_0__1__Impl3218);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1591:1: rule__Control_line__Group_0__2 : rule__Control_line__Group_0__2__Impl ;
    public final void rule__Control_line__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1595:1: ( rule__Control_line__Group_0__2__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1596:2: rule__Control_line__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Control_line__Group_0__2__Impl_in_rule__Control_line__Group_0__23247);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1602:1: rule__Control_line__Group_0__2__Impl : ( rulenew_line ) ;
    public final void rule__Control_line__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1606:1: ( ( rulenew_line ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1607:1: ( rulenew_line )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1607:1: ( rulenew_line )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1608:1: rulenew_line
            {
             before(grammarAccess.getControl_lineAccess().getNew_lineParserRuleCall_0_2()); 
            pushFollow(FOLLOW_rulenew_line_in_rule__Control_line__Group_0__2__Impl3274);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1625:1: rule__Control_line__Group_1__0 : rule__Control_line__Group_1__0__Impl rule__Control_line__Group_1__1 ;
    public final void rule__Control_line__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1629:1: ( rule__Control_line__Group_1__0__Impl rule__Control_line__Group_1__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1630:2: rule__Control_line__Group_1__0__Impl rule__Control_line__Group_1__1
            {
            pushFollow(FOLLOW_rule__Control_line__Group_1__0__Impl_in_rule__Control_line__Group_1__03309);
            rule__Control_line__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Control_line__Group_1__1_in_rule__Control_line__Group_1__03312);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1637:1: rule__Control_line__Group_1__0__Impl : ( '#define' ) ;
    public final void rule__Control_line__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1641:1: ( ( '#define' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1642:1: ( '#define' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1642:1: ( '#define' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1643:1: '#define'
            {
             before(grammarAccess.getControl_lineAccess().getDefineKeyword_1_0()); 
            match(input,30,FOLLOW_30_in_rule__Control_line__Group_1__0__Impl3340); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1656:1: rule__Control_line__Group_1__1 : rule__Control_line__Group_1__1__Impl rule__Control_line__Group_1__2 ;
    public final void rule__Control_line__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1660:1: ( rule__Control_line__Group_1__1__Impl rule__Control_line__Group_1__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1661:2: rule__Control_line__Group_1__1__Impl rule__Control_line__Group_1__2
            {
            pushFollow(FOLLOW_rule__Control_line__Group_1__1__Impl_in_rule__Control_line__Group_1__13371);
            rule__Control_line__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Control_line__Group_1__2_in_rule__Control_line__Group_1__13374);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1668:1: rule__Control_line__Group_1__1__Impl : ( RULE_IDENTIFIER ) ;
    public final void rule__Control_line__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1672:1: ( ( RULE_IDENTIFIER ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1673:1: ( RULE_IDENTIFIER )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1673:1: ( RULE_IDENTIFIER )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1674:1: RULE_IDENTIFIER
            {
             before(grammarAccess.getControl_lineAccess().getIDENTIFIERTerminalRuleCall_1_1()); 
            match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rule__Control_line__Group_1__1__Impl3401); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1685:1: rule__Control_line__Group_1__2 : rule__Control_line__Group_1__2__Impl rule__Control_line__Group_1__3 ;
    public final void rule__Control_line__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1689:1: ( rule__Control_line__Group_1__2__Impl rule__Control_line__Group_1__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1690:2: rule__Control_line__Group_1__2__Impl rule__Control_line__Group_1__3
            {
            pushFollow(FOLLOW_rule__Control_line__Group_1__2__Impl_in_rule__Control_line__Group_1__23430);
            rule__Control_line__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Control_line__Group_1__3_in_rule__Control_line__Group_1__23433);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1697:1: rule__Control_line__Group_1__2__Impl : ( rulereplacement_list ) ;
    public final void rule__Control_line__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1701:1: ( ( rulereplacement_list ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1702:1: ( rulereplacement_list )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1702:1: ( rulereplacement_list )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1703:1: rulereplacement_list
            {
             before(grammarAccess.getControl_lineAccess().getReplacement_listParserRuleCall_1_2()); 
            pushFollow(FOLLOW_rulereplacement_list_in_rule__Control_line__Group_1__2__Impl3460);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1714:1: rule__Control_line__Group_1__3 : rule__Control_line__Group_1__3__Impl ;
    public final void rule__Control_line__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1718:1: ( rule__Control_line__Group_1__3__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1719:2: rule__Control_line__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Control_line__Group_1__3__Impl_in_rule__Control_line__Group_1__33489);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1725:1: rule__Control_line__Group_1__3__Impl : ( rulenew_line ) ;
    public final void rule__Control_line__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1729:1: ( ( rulenew_line ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1730:1: ( rulenew_line )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1730:1: ( rulenew_line )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1731:1: rulenew_line
            {
             before(grammarAccess.getControl_lineAccess().getNew_lineParserRuleCall_1_3()); 
            pushFollow(FOLLOW_rulenew_line_in_rule__Control_line__Group_1__3__Impl3516);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1750:1: rule__Control_line__Group_2__0 : rule__Control_line__Group_2__0__Impl rule__Control_line__Group_2__1 ;
    public final void rule__Control_line__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1754:1: ( rule__Control_line__Group_2__0__Impl rule__Control_line__Group_2__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1755:2: rule__Control_line__Group_2__0__Impl rule__Control_line__Group_2__1
            {
            pushFollow(FOLLOW_rule__Control_line__Group_2__0__Impl_in_rule__Control_line__Group_2__03553);
            rule__Control_line__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Control_line__Group_2__1_in_rule__Control_line__Group_2__03556);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1762:1: rule__Control_line__Group_2__0__Impl : ( '#define' ) ;
    public final void rule__Control_line__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1766:1: ( ( '#define' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1767:1: ( '#define' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1767:1: ( '#define' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1768:1: '#define'
            {
             before(grammarAccess.getControl_lineAccess().getDefineKeyword_2_0()); 
            match(input,30,FOLLOW_30_in_rule__Control_line__Group_2__0__Impl3584); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1781:1: rule__Control_line__Group_2__1 : rule__Control_line__Group_2__1__Impl rule__Control_line__Group_2__2 ;
    public final void rule__Control_line__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1785:1: ( rule__Control_line__Group_2__1__Impl rule__Control_line__Group_2__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1786:2: rule__Control_line__Group_2__1__Impl rule__Control_line__Group_2__2
            {
            pushFollow(FOLLOW_rule__Control_line__Group_2__1__Impl_in_rule__Control_line__Group_2__13615);
            rule__Control_line__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Control_line__Group_2__2_in_rule__Control_line__Group_2__13618);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1793:1: rule__Control_line__Group_2__1__Impl : ( RULE_IDENTIFIER ) ;
    public final void rule__Control_line__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1797:1: ( ( RULE_IDENTIFIER ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1798:1: ( RULE_IDENTIFIER )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1798:1: ( RULE_IDENTIFIER )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1799:1: RULE_IDENTIFIER
            {
             before(grammarAccess.getControl_lineAccess().getIDENTIFIERTerminalRuleCall_2_1()); 
            match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rule__Control_line__Group_2__1__Impl3645); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1810:1: rule__Control_line__Group_2__2 : rule__Control_line__Group_2__2__Impl rule__Control_line__Group_2__3 ;
    public final void rule__Control_line__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1814:1: ( rule__Control_line__Group_2__2__Impl rule__Control_line__Group_2__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1815:2: rule__Control_line__Group_2__2__Impl rule__Control_line__Group_2__3
            {
            pushFollow(FOLLOW_rule__Control_line__Group_2__2__Impl_in_rule__Control_line__Group_2__23674);
            rule__Control_line__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Control_line__Group_2__3_in_rule__Control_line__Group_2__23677);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1822:1: rule__Control_line__Group_2__2__Impl : ( rulelparen ) ;
    public final void rule__Control_line__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1826:1: ( ( rulelparen ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1827:1: ( rulelparen )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1827:1: ( rulelparen )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1828:1: rulelparen
            {
             before(grammarAccess.getControl_lineAccess().getLparenParserRuleCall_2_2()); 
            pushFollow(FOLLOW_rulelparen_in_rule__Control_line__Group_2__2__Impl3704);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1839:1: rule__Control_line__Group_2__3 : rule__Control_line__Group_2__3__Impl rule__Control_line__Group_2__4 ;
    public final void rule__Control_line__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1843:1: ( rule__Control_line__Group_2__3__Impl rule__Control_line__Group_2__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1844:2: rule__Control_line__Group_2__3__Impl rule__Control_line__Group_2__4
            {
            pushFollow(FOLLOW_rule__Control_line__Group_2__3__Impl_in_rule__Control_line__Group_2__33733);
            rule__Control_line__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Control_line__Group_2__4_in_rule__Control_line__Group_2__33736);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1851:1: rule__Control_line__Group_2__3__Impl : ( ( RULE_IDENTIFIER )? ) ;
    public final void rule__Control_line__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1855:1: ( ( ( RULE_IDENTIFIER )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1856:1: ( ( RULE_IDENTIFIER )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1856:1: ( ( RULE_IDENTIFIER )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1857:1: ( RULE_IDENTIFIER )?
            {
             before(grammarAccess.getControl_lineAccess().getIDENTIFIERTerminalRuleCall_2_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1858:1: ( RULE_IDENTIFIER )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_IDENTIFIER) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1858:3: RULE_IDENTIFIER
                    {
                    match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rule__Control_line__Group_2__3__Impl3764); 

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1868:1: rule__Control_line__Group_2__4 : rule__Control_line__Group_2__4__Impl rule__Control_line__Group_2__5 ;
    public final void rule__Control_line__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1872:1: ( rule__Control_line__Group_2__4__Impl rule__Control_line__Group_2__5 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1873:2: rule__Control_line__Group_2__4__Impl rule__Control_line__Group_2__5
            {
            pushFollow(FOLLOW_rule__Control_line__Group_2__4__Impl_in_rule__Control_line__Group_2__43795);
            rule__Control_line__Group_2__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Control_line__Group_2__5_in_rule__Control_line__Group_2__43798);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1880:1: rule__Control_line__Group_2__4__Impl : ( ')' ) ;
    public final void rule__Control_line__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1884:1: ( ( ')' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1885:1: ( ')' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1885:1: ( ')' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1886:1: ')'
            {
             before(grammarAccess.getControl_lineAccess().getRightParenthesisKeyword_2_4()); 
            match(input,31,FOLLOW_31_in_rule__Control_line__Group_2__4__Impl3826); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1899:1: rule__Control_line__Group_2__5 : rule__Control_line__Group_2__5__Impl rule__Control_line__Group_2__6 ;
    public final void rule__Control_line__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1903:1: ( rule__Control_line__Group_2__5__Impl rule__Control_line__Group_2__6 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1904:2: rule__Control_line__Group_2__5__Impl rule__Control_line__Group_2__6
            {
            pushFollow(FOLLOW_rule__Control_line__Group_2__5__Impl_in_rule__Control_line__Group_2__53857);
            rule__Control_line__Group_2__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Control_line__Group_2__6_in_rule__Control_line__Group_2__53860);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1911:1: rule__Control_line__Group_2__5__Impl : ( rulereplacement_list ) ;
    public final void rule__Control_line__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1915:1: ( ( rulereplacement_list ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1916:1: ( rulereplacement_list )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1916:1: ( rulereplacement_list )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1917:1: rulereplacement_list
            {
             before(grammarAccess.getControl_lineAccess().getReplacement_listParserRuleCall_2_5()); 
            pushFollow(FOLLOW_rulereplacement_list_in_rule__Control_line__Group_2__5__Impl3887);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1928:1: rule__Control_line__Group_2__6 : rule__Control_line__Group_2__6__Impl ;
    public final void rule__Control_line__Group_2__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1932:1: ( rule__Control_line__Group_2__6__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1933:2: rule__Control_line__Group_2__6__Impl
            {
            pushFollow(FOLLOW_rule__Control_line__Group_2__6__Impl_in_rule__Control_line__Group_2__63916);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1939:1: rule__Control_line__Group_2__6__Impl : ( rulenew_line ) ;
    public final void rule__Control_line__Group_2__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1943:1: ( ( rulenew_line ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1944:1: ( rulenew_line )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1944:1: ( rulenew_line )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1945:1: rulenew_line
            {
             before(grammarAccess.getControl_lineAccess().getNew_lineParserRuleCall_2_6()); 
            pushFollow(FOLLOW_rulenew_line_in_rule__Control_line__Group_2__6__Impl3943);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1970:1: rule__Control_line__Group_3__0 : rule__Control_line__Group_3__0__Impl rule__Control_line__Group_3__1 ;
    public final void rule__Control_line__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1974:1: ( rule__Control_line__Group_3__0__Impl rule__Control_line__Group_3__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1975:2: rule__Control_line__Group_3__0__Impl rule__Control_line__Group_3__1
            {
            pushFollow(FOLLOW_rule__Control_line__Group_3__0__Impl_in_rule__Control_line__Group_3__03986);
            rule__Control_line__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Control_line__Group_3__1_in_rule__Control_line__Group_3__03989);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1982:1: rule__Control_line__Group_3__0__Impl : ( '#undef' ) ;
    public final void rule__Control_line__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1986:1: ( ( '#undef' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1987:1: ( '#undef' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1987:1: ( '#undef' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1988:1: '#undef'
            {
             before(grammarAccess.getControl_lineAccess().getUndefKeyword_3_0()); 
            match(input,32,FOLLOW_32_in_rule__Control_line__Group_3__0__Impl4017); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2001:1: rule__Control_line__Group_3__1 : rule__Control_line__Group_3__1__Impl rule__Control_line__Group_3__2 ;
    public final void rule__Control_line__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2005:1: ( rule__Control_line__Group_3__1__Impl rule__Control_line__Group_3__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2006:2: rule__Control_line__Group_3__1__Impl rule__Control_line__Group_3__2
            {
            pushFollow(FOLLOW_rule__Control_line__Group_3__1__Impl_in_rule__Control_line__Group_3__14048);
            rule__Control_line__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Control_line__Group_3__2_in_rule__Control_line__Group_3__14051);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2013:1: rule__Control_line__Group_3__1__Impl : ( RULE_IDENTIFIER ) ;
    public final void rule__Control_line__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2017:1: ( ( RULE_IDENTIFIER ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2018:1: ( RULE_IDENTIFIER )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2018:1: ( RULE_IDENTIFIER )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2019:1: RULE_IDENTIFIER
            {
             before(grammarAccess.getControl_lineAccess().getIDENTIFIERTerminalRuleCall_3_1()); 
            match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rule__Control_line__Group_3__1__Impl4078); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2030:1: rule__Control_line__Group_3__2 : rule__Control_line__Group_3__2__Impl ;
    public final void rule__Control_line__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2034:1: ( rule__Control_line__Group_3__2__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2035:2: rule__Control_line__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Control_line__Group_3__2__Impl_in_rule__Control_line__Group_3__24107);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2041:1: rule__Control_line__Group_3__2__Impl : ( rulenew_line ) ;
    public final void rule__Control_line__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2045:1: ( ( rulenew_line ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2046:1: ( rulenew_line )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2046:1: ( rulenew_line )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2047:1: rulenew_line
            {
             before(grammarAccess.getControl_lineAccess().getNew_lineParserRuleCall_3_2()); 
            pushFollow(FOLLOW_rulenew_line_in_rule__Control_line__Group_3__2__Impl4134);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2064:1: rule__Control_line__Group_4__0 : rule__Control_line__Group_4__0__Impl rule__Control_line__Group_4__1 ;
    public final void rule__Control_line__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2068:1: ( rule__Control_line__Group_4__0__Impl rule__Control_line__Group_4__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2069:2: rule__Control_line__Group_4__0__Impl rule__Control_line__Group_4__1
            {
            pushFollow(FOLLOW_rule__Control_line__Group_4__0__Impl_in_rule__Control_line__Group_4__04169);
            rule__Control_line__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Control_line__Group_4__1_in_rule__Control_line__Group_4__04172);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2076:1: rule__Control_line__Group_4__0__Impl : ( '#line' ) ;
    public final void rule__Control_line__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2080:1: ( ( '#line' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2081:1: ( '#line' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2081:1: ( '#line' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2082:1: '#line'
            {
             before(grammarAccess.getControl_lineAccess().getLineKeyword_4_0()); 
            match(input,33,FOLLOW_33_in_rule__Control_line__Group_4__0__Impl4200); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2095:1: rule__Control_line__Group_4__1 : rule__Control_line__Group_4__1__Impl rule__Control_line__Group_4__2 ;
    public final void rule__Control_line__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2099:1: ( rule__Control_line__Group_4__1__Impl rule__Control_line__Group_4__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2100:2: rule__Control_line__Group_4__1__Impl rule__Control_line__Group_4__2
            {
            pushFollow(FOLLOW_rule__Control_line__Group_4__1__Impl_in_rule__Control_line__Group_4__14231);
            rule__Control_line__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Control_line__Group_4__2_in_rule__Control_line__Group_4__14234);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2107:1: rule__Control_line__Group_4__1__Impl : ( rulepp_tokens ) ;
    public final void rule__Control_line__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2111:1: ( ( rulepp_tokens ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2112:1: ( rulepp_tokens )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2112:1: ( rulepp_tokens )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2113:1: rulepp_tokens
            {
             before(grammarAccess.getControl_lineAccess().getPp_tokensParserRuleCall_4_1()); 
            pushFollow(FOLLOW_rulepp_tokens_in_rule__Control_line__Group_4__1__Impl4261);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2124:1: rule__Control_line__Group_4__2 : rule__Control_line__Group_4__2__Impl ;
    public final void rule__Control_line__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2128:1: ( rule__Control_line__Group_4__2__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2129:2: rule__Control_line__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__Control_line__Group_4__2__Impl_in_rule__Control_line__Group_4__24290);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2135:1: rule__Control_line__Group_4__2__Impl : ( rulenew_line ) ;
    public final void rule__Control_line__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2139:1: ( ( rulenew_line ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2140:1: ( rulenew_line )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2140:1: ( rulenew_line )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2141:1: rulenew_line
            {
             before(grammarAccess.getControl_lineAccess().getNew_lineParserRuleCall_4_2()); 
            pushFollow(FOLLOW_rulenew_line_in_rule__Control_line__Group_4__2__Impl4317);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2158:1: rule__Control_line__Group_5__0 : rule__Control_line__Group_5__0__Impl rule__Control_line__Group_5__1 ;
    public final void rule__Control_line__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2162:1: ( rule__Control_line__Group_5__0__Impl rule__Control_line__Group_5__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2163:2: rule__Control_line__Group_5__0__Impl rule__Control_line__Group_5__1
            {
            pushFollow(FOLLOW_rule__Control_line__Group_5__0__Impl_in_rule__Control_line__Group_5__04352);
            rule__Control_line__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Control_line__Group_5__1_in_rule__Control_line__Group_5__04355);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2170:1: rule__Control_line__Group_5__0__Impl : ( '#error' ) ;
    public final void rule__Control_line__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2174:1: ( ( '#error' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2175:1: ( '#error' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2175:1: ( '#error' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2176:1: '#error'
            {
             before(grammarAccess.getControl_lineAccess().getErrorKeyword_5_0()); 
            match(input,34,FOLLOW_34_in_rule__Control_line__Group_5__0__Impl4383); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2189:1: rule__Control_line__Group_5__1 : rule__Control_line__Group_5__1__Impl rule__Control_line__Group_5__2 ;
    public final void rule__Control_line__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2193:1: ( rule__Control_line__Group_5__1__Impl rule__Control_line__Group_5__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2194:2: rule__Control_line__Group_5__1__Impl rule__Control_line__Group_5__2
            {
            pushFollow(FOLLOW_rule__Control_line__Group_5__1__Impl_in_rule__Control_line__Group_5__14414);
            rule__Control_line__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Control_line__Group_5__2_in_rule__Control_line__Group_5__14417);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2201:1: rule__Control_line__Group_5__1__Impl : ( ( rulepp_tokens )? ) ;
    public final void rule__Control_line__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2205:1: ( ( ( rulepp_tokens )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2206:1: ( ( rulepp_tokens )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2206:1: ( ( rulepp_tokens )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2207:1: ( rulepp_tokens )?
            {
             before(grammarAccess.getControl_lineAccess().getPp_tokensParserRuleCall_5_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2208:1: ( rulepp_tokens )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==21) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2208:3: rulepp_tokens
                    {
                    pushFollow(FOLLOW_rulepp_tokens_in_rule__Control_line__Group_5__1__Impl4445);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2218:1: rule__Control_line__Group_5__2 : rule__Control_line__Group_5__2__Impl ;
    public final void rule__Control_line__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2222:1: ( rule__Control_line__Group_5__2__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2223:2: rule__Control_line__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__Control_line__Group_5__2__Impl_in_rule__Control_line__Group_5__24476);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2229:1: rule__Control_line__Group_5__2__Impl : ( rulenew_line ) ;
    public final void rule__Control_line__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2233:1: ( ( rulenew_line ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2234:1: ( rulenew_line )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2234:1: ( rulenew_line )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2235:1: rulenew_line
            {
             before(grammarAccess.getControl_lineAccess().getNew_lineParserRuleCall_5_2()); 
            pushFollow(FOLLOW_rulenew_line_in_rule__Control_line__Group_5__2__Impl4503);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2252:1: rule__Control_line__Group_6__0 : rule__Control_line__Group_6__0__Impl rule__Control_line__Group_6__1 ;
    public final void rule__Control_line__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2256:1: ( rule__Control_line__Group_6__0__Impl rule__Control_line__Group_6__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2257:2: rule__Control_line__Group_6__0__Impl rule__Control_line__Group_6__1
            {
            pushFollow(FOLLOW_rule__Control_line__Group_6__0__Impl_in_rule__Control_line__Group_6__04538);
            rule__Control_line__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Control_line__Group_6__1_in_rule__Control_line__Group_6__04541);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2264:1: rule__Control_line__Group_6__0__Impl : ( '#pragma' ) ;
    public final void rule__Control_line__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2268:1: ( ( '#pragma' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2269:1: ( '#pragma' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2269:1: ( '#pragma' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2270:1: '#pragma'
            {
             before(grammarAccess.getControl_lineAccess().getPragmaKeyword_6_0()); 
            match(input,35,FOLLOW_35_in_rule__Control_line__Group_6__0__Impl4569); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2283:1: rule__Control_line__Group_6__1 : rule__Control_line__Group_6__1__Impl rule__Control_line__Group_6__2 ;
    public final void rule__Control_line__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2287:1: ( rule__Control_line__Group_6__1__Impl rule__Control_line__Group_6__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2288:2: rule__Control_line__Group_6__1__Impl rule__Control_line__Group_6__2
            {
            pushFollow(FOLLOW_rule__Control_line__Group_6__1__Impl_in_rule__Control_line__Group_6__14600);
            rule__Control_line__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Control_line__Group_6__2_in_rule__Control_line__Group_6__14603);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2295:1: rule__Control_line__Group_6__1__Impl : ( ( rulepp_tokens )? ) ;
    public final void rule__Control_line__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2299:1: ( ( ( rulepp_tokens )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2300:1: ( ( rulepp_tokens )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2300:1: ( ( rulepp_tokens )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2301:1: ( rulepp_tokens )?
            {
             before(grammarAccess.getControl_lineAccess().getPp_tokensParserRuleCall_6_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2302:1: ( rulepp_tokens )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==21) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2302:3: rulepp_tokens
                    {
                    pushFollow(FOLLOW_rulepp_tokens_in_rule__Control_line__Group_6__1__Impl4631);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2312:1: rule__Control_line__Group_6__2 : rule__Control_line__Group_6__2__Impl ;
    public final void rule__Control_line__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2316:1: ( rule__Control_line__Group_6__2__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2317:2: rule__Control_line__Group_6__2__Impl
            {
            pushFollow(FOLLOW_rule__Control_line__Group_6__2__Impl_in_rule__Control_line__Group_6__24662);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2323:1: rule__Control_line__Group_6__2__Impl : ( rulenew_line ) ;
    public final void rule__Control_line__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2327:1: ( ( rulenew_line ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2328:1: ( rulenew_line )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2328:1: ( rulenew_line )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2329:1: rulenew_line
            {
             before(grammarAccess.getControl_lineAccess().getNew_lineParserRuleCall_6_2()); 
            pushFollow(FOLLOW_rulenew_line_in_rule__Control_line__Group_6__2__Impl4689);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2346:1: rule__Control_line__Group_7__0 : rule__Control_line__Group_7__0__Impl rule__Control_line__Group_7__1 ;
    public final void rule__Control_line__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2350:1: ( rule__Control_line__Group_7__0__Impl rule__Control_line__Group_7__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2351:2: rule__Control_line__Group_7__0__Impl rule__Control_line__Group_7__1
            {
            pushFollow(FOLLOW_rule__Control_line__Group_7__0__Impl_in_rule__Control_line__Group_7__04724);
            rule__Control_line__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Control_line__Group_7__1_in_rule__Control_line__Group_7__04727);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2358:1: rule__Control_line__Group_7__0__Impl : ( '#' ) ;
    public final void rule__Control_line__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2362:1: ( ( '#' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2363:1: ( '#' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2363:1: ( '#' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2364:1: '#'
            {
             before(grammarAccess.getControl_lineAccess().getNumberSignKeyword_7_0()); 
            match(input,36,FOLLOW_36_in_rule__Control_line__Group_7__0__Impl4755); 
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2377:1: rule__Control_line__Group_7__1 : rule__Control_line__Group_7__1__Impl ;
    public final void rule__Control_line__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2381:1: ( rule__Control_line__Group_7__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2382:2: rule__Control_line__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__Control_line__Group_7__1__Impl_in_rule__Control_line__Group_7__14786);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2388:1: rule__Control_line__Group_7__1__Impl : ( rulenew_line ) ;
    public final void rule__Control_line__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2392:1: ( ( rulenew_line ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2393:1: ( rulenew_line )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2393:1: ( rulenew_line )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2394:1: rulenew_line
            {
             before(grammarAccess.getControl_lineAccess().getNew_lineParserRuleCall_7_1()); 
            pushFollow(FOLLOW_rulenew_line_in_rule__Control_line__Group_7__1__Impl4813);
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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2410:1: rule__Model__GreetingsAssignment : ( rulepreprocessing_file ) ;
    public final void rule__Model__GreetingsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2414:1: ( ( rulepreprocessing_file ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2415:1: ( rulepreprocessing_file )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2415:1: ( rulepreprocessing_file )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2416:1: rulepreprocessing_file
            {
             before(grammarAccess.getModelAccess().getGreetingsPreprocessing_fileParserRuleCall_0()); 
            pushFollow(FOLLOW_rulepreprocessing_file_in_rule__Model__GreetingsAssignment4851);
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


    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA8_eotS =
        "\13\uffff";
    static final String DFA8_eofS =
        "\13\uffff";
    static final String DFA8_minS =
        "\1\35\1\uffff\1\4\5\uffff\1\23\2\uffff";
    static final String DFA8_maxS =
        "\1\44\1\uffff\1\4\5\uffff\1\26\2\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\1\1\1\uffff\1\4\1\5\1\6\1\7\1\10\1\uffff\1\3\1\2";
    static final String DFA8_specialS =
        "\13\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\1\1\2\1\uffff\1\3\1\4\1\5\1\6\1\7",
            "",
            "\1\10",
            "",
            "",
            "",
            "",
            "",
            "\1\12\1\uffff\1\12\1\11",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "627:1: rule__Control_line__Alternatives : ( ( ( rule__Control_line__Group_0__0 ) ) | ( ( rule__Control_line__Group_1__0 ) ) | ( ( rule__Control_line__Group_2__0 ) ) | ( ( rule__Control_line__Group_3__0 ) ) | ( ( rule__Control_line__Group_4__0 ) ) | ( ( rule__Control_line__Group_5__0 ) ) | ( ( rule__Control_line__Group_6__0 ) ) | ( ( rule__Control_line__Group_7__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__GreetingsAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenew_line_in_entryRulenew_line123 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenew_line130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rulenew_line157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepreprocessing_file_in_entryRulepreprocessing_file185 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepreprocessing_file192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegroup_in_rulepreprocessing_file219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegroup_in_entryRulegroup247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulegroup254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegroup_part_in_rulegroup283 = new BitSet(new long[]{0x0000001F63A80002L});
    public static final BitSet FOLLOW_rulegroup_part_in_rulegroup296 = new BitSet(new long[]{0x0000001F63A80002L});
    public static final BitSet FOLLOW_rulegroup_part_in_entryRulegroup_part326 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulegroup_part333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group_part__Alternatives_in_rulegroup_part359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleif_action_in_entryRuleif_action386 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleif_action393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If_action__Group__0_in_ruleif_action419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleif_group_in_entryRuleif_group446 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleif_group453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If_group__Alternatives_in_ruleif_group479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleelif_groups_in_entryRuleelif_groups506 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleelif_groups513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleelif_group_in_ruleelif_groups542 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleelif_group_in_ruleelif_groups555 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleelif_group_in_entryRuleelif_group585 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleelif_group592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Elif_group__Group__0_in_ruleelif_group618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstant_expression_in_entryRuleconstant_expression645 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleconstant_expression652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleconstant_expression679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepreprocessing_token_in_entryRulepreprocessing_token707 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepreprocessing_token714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rulepreprocessing_token741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleelse_group_in_entryRuleelse_group769 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleelse_group776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Else_group__Group__0_in_ruleelse_group802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleendif_line_in_entryRuleendif_line829 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleendif_line836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Endif_line__Group__0_in_ruleendif_line862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecontrol_line_in_entryRulecontrol_line889 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecontrol_line896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Control_line__Alternatives_in_rulecontrol_line922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelparen_in_entryRulelparen949 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulelparen956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rulelparen983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulereplacement_list_in_entryRulereplacement_list1011 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulereplacement_list1018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepp_tokens_in_rulereplacement_list1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepp_tokens_in_entryRulepp_tokens1073 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepp_tokens1080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepreprocessing_token_in_rulepp_tokens1109 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rulepreprocessing_token_in_rulepp_tokens1122 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Group_part__Group_0__0_in_rule__Group_part__Alternatives1165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleif_action_in_rule__Group_part__Alternatives1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecontrol_line_in_rule__Group_part__Alternatives1200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If_group__Group_0__0_in_rule__If_group__Alternatives1232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If_group__Group_1__0_in_rule__If_group__Alternatives1250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If_group__Group_2__0_in_rule__If_group__Alternatives1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Control_line__Group_0__0_in_rule__Control_line__Alternatives1301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Control_line__Group_1__0_in_rule__Control_line__Alternatives1319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Control_line__Group_2__0_in_rule__Control_line__Alternatives1337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Control_line__Group_3__0_in_rule__Control_line__Alternatives1355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Control_line__Group_4__0_in_rule__Control_line__Alternatives1373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Control_line__Group_5__0_in_rule__Control_line__Alternatives1391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Control_line__Group_6__0_in_rule__Control_line__Alternatives1409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Control_line__Group_7__0_in_rule__Control_line__Alternatives1427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group_part__Group_0__0__Impl_in_rule__Group_part__Group_0__01461 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_rule__Group_part__Group_0__1_in_rule__Group_part__Group_0__01464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepp_tokens_in_rule__Group_part__Group_0__0__Impl1492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Group_part__Group_0__1__Impl_in_rule__Group_part__Group_0__11523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenew_line_in_rule__Group_part__Group_0__1__Impl1550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If_action__Group__0__Impl_in_rule__If_action__Group__01583 = new BitSet(new long[]{0x000000001C000000L});
    public static final BitSet FOLLOW_rule__If_action__Group__1_in_rule__If_action__Group__01586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleif_group_in_rule__If_action__Group__0__Impl1613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If_action__Group__1__Impl_in_rule__If_action__Group__11642 = new BitSet(new long[]{0x000000001C000000L});
    public static final BitSet FOLLOW_rule__If_action__Group__2_in_rule__If_action__Group__11645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleelif_groups_in_rule__If_action__Group__1__Impl1673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If_action__Group__2__Impl_in_rule__If_action__Group__21704 = new BitSet(new long[]{0x000000001C000000L});
    public static final BitSet FOLLOW_rule__If_action__Group__3_in_rule__If_action__Group__21707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleelse_group_in_rule__If_action__Group__2__Impl1735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If_action__Group__3__Impl_in_rule__If_action__Group__31766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleendif_line_in_rule__If_action__Group__3__Impl1793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If_group__Group_0__0__Impl_in_rule__If_group__Group_0__01830 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__If_group__Group_0__1_in_rule__If_group__Group_0__01833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__If_group__Group_0__0__Impl1861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If_group__Group_0__1__Impl_in_rule__If_group__Group_0__11892 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_rule__If_group__Group_0__2_in_rule__If_group__Group_0__11895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstant_expression_in_rule__If_group__Group_0__1__Impl1922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If_group__Group_0__2__Impl_in_rule__If_group__Group_0__21951 = new BitSet(new long[]{0x0000001F63A80000L});
    public static final BitSet FOLLOW_rule__If_group__Group_0__3_in_rule__If_group__Group_0__21954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenew_line_in_rule__If_group__Group_0__2__Impl1981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If_group__Group_0__3__Impl_in_rule__If_group__Group_0__32010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegroup_in_rule__If_group__Group_0__3__Impl2038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If_group__Group_1__0__Impl_in_rule__If_group__Group_1__02077 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__If_group__Group_1__1_in_rule__If_group__Group_1__02080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__If_group__Group_1__0__Impl2108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If_group__Group_1__1__Impl_in_rule__If_group__Group_1__12139 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_rule__If_group__Group_1__2_in_rule__If_group__Group_1__12142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rule__If_group__Group_1__1__Impl2169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If_group__Group_1__2__Impl_in_rule__If_group__Group_1__22198 = new BitSet(new long[]{0x0000001F63A80000L});
    public static final BitSet FOLLOW_rule__If_group__Group_1__3_in_rule__If_group__Group_1__22201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenew_line_in_rule__If_group__Group_1__2__Impl2228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If_group__Group_1__3__Impl_in_rule__If_group__Group_1__32257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegroup_in_rule__If_group__Group_1__3__Impl2285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If_group__Group_2__0__Impl_in_rule__If_group__Group_2__02324 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__If_group__Group_2__1_in_rule__If_group__Group_2__02327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__If_group__Group_2__0__Impl2355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If_group__Group_2__1__Impl_in_rule__If_group__Group_2__12386 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_rule__If_group__Group_2__2_in_rule__If_group__Group_2__12389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rule__If_group__Group_2__1__Impl2416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If_group__Group_2__2__Impl_in_rule__If_group__Group_2__22445 = new BitSet(new long[]{0x0000001F63A80000L});
    public static final BitSet FOLLOW_rule__If_group__Group_2__3_in_rule__If_group__Group_2__22448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenew_line_in_rule__If_group__Group_2__2__Impl2475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__If_group__Group_2__3__Impl_in_rule__If_group__Group_2__32504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegroup_in_rule__If_group__Group_2__3__Impl2532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Elif_group__Group__0__Impl_in_rule__Elif_group__Group__02571 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Elif_group__Group__1_in_rule__Elif_group__Group__02574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Elif_group__Group__0__Impl2602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Elif_group__Group__1__Impl_in_rule__Elif_group__Group__12633 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_rule__Elif_group__Group__2_in_rule__Elif_group__Group__12636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstant_expression_in_rule__Elif_group__Group__1__Impl2663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Elif_group__Group__2__Impl_in_rule__Elif_group__Group__22692 = new BitSet(new long[]{0x0000001F63A80000L});
    public static final BitSet FOLLOW_rule__Elif_group__Group__3_in_rule__Elif_group__Group__22695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenew_line_in_rule__Elif_group__Group__2__Impl2722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Elif_group__Group__3__Impl_in_rule__Elif_group__Group__32751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegroup_in_rule__Elif_group__Group__3__Impl2779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Else_group__Group__0__Impl_in_rule__Else_group__Group__02818 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_rule__Else_group__Group__1_in_rule__Else_group__Group__02821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Else_group__Group__0__Impl2849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Else_group__Group__1__Impl_in_rule__Else_group__Group__12880 = new BitSet(new long[]{0x0000001F63A80000L});
    public static final BitSet FOLLOW_rule__Else_group__Group__2_in_rule__Else_group__Group__12883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenew_line_in_rule__Else_group__Group__1__Impl2910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Else_group__Group__2__Impl_in_rule__Else_group__Group__22939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegroup_in_rule__Else_group__Group__2__Impl2967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Endif_line__Group__0__Impl_in_rule__Endif_line__Group__03004 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_rule__Endif_line__Group__1_in_rule__Endif_line__Group__03007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Endif_line__Group__0__Impl3035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Endif_line__Group__1__Impl_in_rule__Endif_line__Group__13066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenew_line_in_rule__Endif_line__Group__1__Impl3093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Control_line__Group_0__0__Impl_in_rule__Control_line__Group_0__03126 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Control_line__Group_0__1_in_rule__Control_line__Group_0__03129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Control_line__Group_0__0__Impl3157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Control_line__Group_0__1__Impl_in_rule__Control_line__Group_0__13188 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_rule__Control_line__Group_0__2_in_rule__Control_line__Group_0__13191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepp_tokens_in_rule__Control_line__Group_0__1__Impl3218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Control_line__Group_0__2__Impl_in_rule__Control_line__Group_0__23247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenew_line_in_rule__Control_line__Group_0__2__Impl3274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Control_line__Group_1__0__Impl_in_rule__Control_line__Group_1__03309 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Control_line__Group_1__1_in_rule__Control_line__Group_1__03312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Control_line__Group_1__0__Impl3340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Control_line__Group_1__1__Impl_in_rule__Control_line__Group_1__13371 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Control_line__Group_1__2_in_rule__Control_line__Group_1__13374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rule__Control_line__Group_1__1__Impl3401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Control_line__Group_1__2__Impl_in_rule__Control_line__Group_1__23430 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_rule__Control_line__Group_1__3_in_rule__Control_line__Group_1__23433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulereplacement_list_in_rule__Control_line__Group_1__2__Impl3460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Control_line__Group_1__3__Impl_in_rule__Control_line__Group_1__33489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenew_line_in_rule__Control_line__Group_1__3__Impl3516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Control_line__Group_2__0__Impl_in_rule__Control_line__Group_2__03553 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Control_line__Group_2__1_in_rule__Control_line__Group_2__03556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Control_line__Group_2__0__Impl3584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Control_line__Group_2__1__Impl_in_rule__Control_line__Group_2__13615 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Control_line__Group_2__2_in_rule__Control_line__Group_2__13618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rule__Control_line__Group_2__1__Impl3645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Control_line__Group_2__2__Impl_in_rule__Control_line__Group_2__23674 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_rule__Control_line__Group_2__3_in_rule__Control_line__Group_2__23677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelparen_in_rule__Control_line__Group_2__2__Impl3704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Control_line__Group_2__3__Impl_in_rule__Control_line__Group_2__33733 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_rule__Control_line__Group_2__4_in_rule__Control_line__Group_2__33736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rule__Control_line__Group_2__3__Impl3764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Control_line__Group_2__4__Impl_in_rule__Control_line__Group_2__43795 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Control_line__Group_2__5_in_rule__Control_line__Group_2__43798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Control_line__Group_2__4__Impl3826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Control_line__Group_2__5__Impl_in_rule__Control_line__Group_2__53857 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_rule__Control_line__Group_2__6_in_rule__Control_line__Group_2__53860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulereplacement_list_in_rule__Control_line__Group_2__5__Impl3887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Control_line__Group_2__6__Impl_in_rule__Control_line__Group_2__63916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenew_line_in_rule__Control_line__Group_2__6__Impl3943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Control_line__Group_3__0__Impl_in_rule__Control_line__Group_3__03986 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Control_line__Group_3__1_in_rule__Control_line__Group_3__03989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Control_line__Group_3__0__Impl4017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Control_line__Group_3__1__Impl_in_rule__Control_line__Group_3__14048 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_rule__Control_line__Group_3__2_in_rule__Control_line__Group_3__14051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rule__Control_line__Group_3__1__Impl4078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Control_line__Group_3__2__Impl_in_rule__Control_line__Group_3__24107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenew_line_in_rule__Control_line__Group_3__2__Impl4134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Control_line__Group_4__0__Impl_in_rule__Control_line__Group_4__04169 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Control_line__Group_4__1_in_rule__Control_line__Group_4__04172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Control_line__Group_4__0__Impl4200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Control_line__Group_4__1__Impl_in_rule__Control_line__Group_4__14231 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_rule__Control_line__Group_4__2_in_rule__Control_line__Group_4__14234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepp_tokens_in_rule__Control_line__Group_4__1__Impl4261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Control_line__Group_4__2__Impl_in_rule__Control_line__Group_4__24290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenew_line_in_rule__Control_line__Group_4__2__Impl4317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Control_line__Group_5__0__Impl_in_rule__Control_line__Group_5__04352 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_rule__Control_line__Group_5__1_in_rule__Control_line__Group_5__04355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Control_line__Group_5__0__Impl4383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Control_line__Group_5__1__Impl_in_rule__Control_line__Group_5__14414 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_rule__Control_line__Group_5__2_in_rule__Control_line__Group_5__14417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepp_tokens_in_rule__Control_line__Group_5__1__Impl4445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Control_line__Group_5__2__Impl_in_rule__Control_line__Group_5__24476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenew_line_in_rule__Control_line__Group_5__2__Impl4503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Control_line__Group_6__0__Impl_in_rule__Control_line__Group_6__04538 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_rule__Control_line__Group_6__1_in_rule__Control_line__Group_6__04541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Control_line__Group_6__0__Impl4569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Control_line__Group_6__1__Impl_in_rule__Control_line__Group_6__14600 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_rule__Control_line__Group_6__2_in_rule__Control_line__Group_6__14603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepp_tokens_in_rule__Control_line__Group_6__1__Impl4631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Control_line__Group_6__2__Impl_in_rule__Control_line__Group_6__24662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenew_line_in_rule__Control_line__Group_6__2__Impl4689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Control_line__Group_7__0__Impl_in_rule__Control_line__Group_7__04724 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_rule__Control_line__Group_7__1_in_rule__Control_line__Group_7__04727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Control_line__Group_7__0__Impl4755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Control_line__Group_7__1__Impl_in_rule__Control_line__Group_7__14786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenew_line_in_rule__Control_line__Group_7__1__Impl4813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepreprocessing_file_in_rule__Model__GreetingsAssignment4851 = new BitSet(new long[]{0x0000000000000002L});

}