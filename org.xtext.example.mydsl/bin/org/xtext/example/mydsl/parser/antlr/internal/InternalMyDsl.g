/*
* generated by Xtext
*/
grammar InternalMyDsl;

options {
	superClass=AbstractInternalAntlrParser;
	backtrack=true;
	
}

@lexer::header {
package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

/*
  This grammar contains a lot of empty actions to work around a bug in ANTLR.
  Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
*/
 
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
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	 iv_ruleModel=ruleModel 
	 { $current=$iv_ruleModel.current; } 
	 EOF 
;

// Rule Model
ruleModel returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:

	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getModelAccess().getBodyParserRuleCall()); 
    }
    this_Body_0=ruleBody
    { 
        $current = $this_Body_0.current; 
        afterParserOrEnumRuleCall();
    }

;





// Entry rule entryRuleBody
entryRuleBody returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getBodyRule()); }
	 iv_ruleBody=ruleBody 
	 { $current=$iv_ruleBody.current; } 
	 EOF 
;

// Rule Body
ruleBody returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElement(
            grammarAccess.getBodyAccess().getBodyAction_0(),
            $current);
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getBodyAccess().getFuncoesFunctionDeclarationParserRuleCall_1_0()); 
	    }
		lv_funcoes_1_0=ruleFunctionDeclaration		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBodyRule());
	        }
       		add(
       			$current, 
       			"funcoes",
        		lv_funcoes_1_0, 
        		"FunctionDeclaration");
	        afterParserOrEnumRuleCall();
	    }

)
)*)
;





// Entry rule entryRuleFunctionDeclaration
entryRuleFunctionDeclaration returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFunctionDeclarationRule()); }
	 iv_ruleFunctionDeclaration=ruleFunctionDeclaration 
	 { $current=$iv_ruleFunctionDeclaration.current; } 
	 EOF 
;

// Rule FunctionDeclaration
ruleFunctionDeclaration returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElement(
            grammarAccess.getFunctionDeclarationAccess().getFunctionDeclarationAction_0(),
            $current);
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getTypeTypeParserRuleCall_1_0()); 
	    }
		lv_type_1_0=ruleType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFunctionDeclarationRule());
	        }
       		set(
       			$current, 
       			"type",
        		lv_type_1_0, 
        		"Type");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getFunctionDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFunctionDeclarationRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"ID");
	    }

)
)	otherlv_3='(' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getFunctionDeclarationAccess().getLeftParenthesisKeyword_3());
    }
((
(
		{ 
	        newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getParamsParameterParserRuleCall_4_0_0()); 
	    }
		lv_params_4_0=ruleParameter		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFunctionDeclarationRule());
	        }
       		add(
       			$current, 
       			"params",
        		lv_params_4_0, 
        		"Parameter");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_5=',' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getFunctionDeclarationAccess().getCommaKeyword_4_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getParamsParameterParserRuleCall_4_1_1_0()); 
	    }
		lv_params_6_0=ruleParameter		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFunctionDeclarationRule());
	        }
       		add(
       			$current, 
       			"params",
        		lv_params_6_0, 
        		"Parameter");
	        afterParserOrEnumRuleCall();
	    }

)
))*)?	otherlv_7=')' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getFunctionDeclarationAccess().getRightParenthesisKeyword_5());
    }
	otherlv_8='{' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getFunctionDeclarationAccess().getLeftCurlyBracketKeyword_6());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getEscopoStatementParserRuleCall_7_0()); 
	    }
		lv_escopo_9_0=rulestatement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFunctionDeclarationRule());
	        }
       		set(
       			$current, 
       			"escopo",
        		lv_escopo_9_0, 
        		"statement");
	        afterParserOrEnumRuleCall();
	    }

)
)?	otherlv_10='}' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getFunctionDeclarationAccess().getRightCurlyBracketKeyword_8());
    }
)
;





// Entry rule entryRuleParameter
entryRuleParameter returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getParameterRule()); }
	 iv_ruleParameter=ruleParameter 
	 { $current=$iv_ruleParameter.current; } 
	 EOF 
;

// Rule Parameter
ruleParameter returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElement(
            grammarAccess.getParameterAccess().getParameterAction_0(),
            $current);
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_1_0()); 
	    }
		lv_type_1_0=ruleType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getParameterRule());
	        }
       		set(
       			$current, 
       			"type",
        		lv_type_1_0, 
        		"Type");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getParameterRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"ID");
	    }

)
))
;





// Entry rule entryRuleVarDecl
entryRuleVarDecl returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getVarDeclRule()); }
	 iv_ruleVarDecl=ruleVarDecl 
	 { $current=$iv_ruleVarDecl.current; } 
	 EOF 
;

// Rule VarDecl
ruleVarDecl returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElement(
            grammarAccess.getVarDeclAccess().getVarDeclAction_0(),
            $current);
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getVarDeclAccess().getTypeTypeParserRuleCall_1_0()); 
	    }
		lv_type_1_0=ruleType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getVarDeclRule());
	        }
       		set(
       			$current, 
       			"type",
        		lv_type_1_0, 
        		"Type");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getVarDeclAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getVarDeclRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"ID");
	    }

)
))
;





// Entry rule entryRuleType
entryRuleType returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTypeRule()); }
	 iv_ruleType=ruleType 
	 { $current=$iv_ruleType.current; } 
	 EOF 
;

// Rule Type
ruleType returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:

	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getTypeAccess().getSimple_type_specifierParserRuleCall()); 
    }
    this_simple_type_specifier_0=rulesimple_type_specifier
    { 
        $current = $this_simple_type_specifier_0.current; 
        afterParserOrEnumRuleCall();
    }

;





// Entry rule entryRulesimple_type_specifier
entryRulesimple_type_specifier returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSimple_type_specifierRule()); }
	 iv_rulesimple_type_specifier=rulesimple_type_specifier 
	 { $current=$iv_rulesimple_type_specifier.current; } 
	 EOF 
;

// Rule simple_type_specifier
rulesimple_type_specifier returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElement(
            grammarAccess.getSimple_type_specifierAccess().getIntTypeAction_0_0(),
            $current);
    }
)	otherlv_1='int' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getSimple_type_specifierAccess().getIntKeyword_0_1());
    }
)
    |((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElement(
            grammarAccess.getSimple_type_specifierAccess().getBoolTypeAction_1_0(),
            $current);
    }
)	otherlv_3='bool' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getSimple_type_specifierAccess().getBoolKeyword_1_1());
    }
))
;





// Entry rule entryRulestatement
entryRulestatement returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getStatementRule()); }
	 iv_rulestatement=rulestatement 
	 { $current=$iv_rulestatement.current; } 
	 EOF 
;

// Rule statement
rulestatement returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElement(
            grammarAccess.getStatementAccess().getStatementAction_0(),
            $current);
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getStatementAccess().getVariavelDeclaration_statementParserRuleCall_1_0()); 
	    }
		lv_variavel_1_0=ruledeclaration_statement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getStatementRule());
	        }
       		set(
       			$current, 
       			"variavel",
        		lv_variavel_1_0, 
        		"declaration_statement");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRulesimple_declaration
entryRulesimple_declaration returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSimple_declarationRule()); }
	 iv_rulesimple_declaration=rulesimple_declaration 
	 { $current=$iv_rulesimple_declaration.current; } 
	 EOF 
;

// Rule simple_declaration
rulesimple_declaration returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getSimple_declarationAccess().getVariavelVarDeclParserRuleCall_0_0()); 
	    }
		lv_variavel_0_0=ruleVarDecl		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSimple_declarationRule());
	        }
       		set(
       			$current, 
       			"variavel",
        		lv_variavel_0_0, 
        		"VarDecl");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_1=';' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getSimple_declarationAccess().getSemicolonKeyword_1());
    }
)
;





// Entry rule entryRuledeclaration_statement
entryRuledeclaration_statement returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDeclaration_statementRule()); }
	 iv_ruledeclaration_statement=ruledeclaration_statement 
	 { $current=$iv_ruledeclaration_statement.current; } 
	 EOF 
;

// Rule declaration_statement
ruledeclaration_statement returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getDeclaration_statementAccess().getVariaveisBlock_declarationParserRuleCall_0()); 
	    }
		lv_variaveis_0_0=ruleblock_declaration		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDeclaration_statementRule());
	        }
       		add(
       			$current, 
       			"variaveis",
        		lv_variaveis_0_0, 
        		"block_declaration");
	        afterParserOrEnumRuleCall();
	    }

)
)+
;





// Entry rule entryRuleblock_declaration
entryRuleblock_declaration returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getBlock_declarationRule()); }
	 iv_ruleblock_declaration=ruleblock_declaration 
	 { $current=$iv_ruleblock_declaration.current; } 
	 EOF 
;

// Rule block_declaration
ruleblock_declaration returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElement(
            grammarAccess.getBlock_declarationAccess().getBlock_declarationAction_0(),
            $current);
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getBlock_declarationAccess().getVariavelSimple_declarationParserRuleCall_1_0()); 
	    }
		lv_variavel_1_0=rulesimple_declaration		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBlock_declarationRule());
	        }
       		set(
       			$current, 
       			"variavel",
        		lv_variavel_1_0, 
        		"simple_declaration");
	        afterParserOrEnumRuleCall();
	    }

)
))
;







// Entry rule entryRuleconditional_expression
entryRuleconditional_expression returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getConditional_expressionRule()); } 
	 iv_ruleconditional_expression=ruleconditional_expression 
	 { $current=$iv_ruleconditional_expression.current.getText(); }  
	 EOF 
;

// Rule conditional_expression
ruleconditional_expression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:

	kw='TODO' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getConditional_expressionAccess().getTODOKeyword()); 
    }

    ;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


