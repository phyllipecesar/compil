package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected MyDslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_FunctionDeclaration_ConstKeyword_1_q;
	protected AbstractElementAlias match_NamespaceDefinition_IDTerminalRuleCall_2_q;
	protected AbstractElementAlias match_NamespaceDefinition_InlineKeyword_0_q;
	protected AbstractElementAlias match_NoPtrFor___IDTerminalRuleCall_2_0_IDTerminalRuleCall_2_1___EqualsSignKeyword_2_2_0___IDTerminalRuleCall_2_2_1_0_or_INTTerminalRuleCall_2_2_1_1____q__q;
	protected AbstractElementAlias match_NoPtrFor___IDTerminalRuleCall_4_0_____AmpersandAmpersandKeyword_4_1_0_4_or_EqualsSignEqualsSignKeyword_4_1_0_2_or_ExclamationMarkEqualsSignKeyword_4_1_0_3_or_GreaterThanSignKeyword_4_1_0_1_or_LessThanSignKeyword_4_1_0_0_or_VerticalLineKeyword_4_1_0_5___IDTerminalRuleCall_4_1_1__q__q;
	protected AbstractElementAlias match_NoPtrFor___IDTerminalRuleCall_6_0_PlusSignEqualsSignKeyword_6_1_INTTerminalRuleCall_6_2__q;
	protected AbstractElementAlias match_NoPtrStatement_BreakKeyword_1_0_a;
	protected AbstractElementAlias match_NoPtrTerminalExpression_ExclamationMarkKeyword_0_1_a;
	protected AbstractElementAlias match_NoPtrTerminalExpression_ExclamationMarkKeyword_1_1_a;
	protected AbstractElementAlias match_NoPtrWhile___IDTerminalRuleCall_2_0_____AmpersandAmpersandKeyword_2_1_0_4_or_EqualsSignEqualsSignKeyword_2_1_0_2_or_ExclamationMarkEqualsSignKeyword_2_1_0_3_or_GreaterThanSignKeyword_2_1_0_1_or_LessThanSignKeyword_2_1_0_0_or_VerticalLineKeyword_2_1_0_5___IDTerminalRuleCall_2_1_1__q__q;
	protected AbstractElementAlias match_Parameter_AmpersandKeyword_3_1_a_or_AsteriskKeyword_3_0_a;
	protected AbstractElementAlias match_Parameter_ConstKeyword_1_q;
	protected AbstractElementAlias match_Parameter_ExclamationMarkKeyword_6_1_a;
	protected AbstractElementAlias match_Parameter___LeftSquareBracketKeyword_5_0_INTTerminalRuleCall_5_1_q_RightSquareBracketKeyword_5_2__a;
	protected AbstractElementAlias match_VarDecl_AmpersandKeyword_3_1_a_or_AsteriskKeyword_3_0_a;
	protected AbstractElementAlias match_VarDecl_ConstKeyword_1_q;
	protected AbstractElementAlias match_VarDecl_ExclamationMarkKeyword_6_1_a;
	protected AbstractElementAlias match_VarDecl___LeftSquareBracketKeyword_5_0_INTTerminalRuleCall_5_1_RightSquareBracketKeyword_5_2__a;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (MyDslGrammarAccess) access;
		match_FunctionDeclaration_ConstKeyword_1_q = new TokenAlias(false, true, grammarAccess.getFunctionDeclarationAccess().getConstKeyword_1());
		match_NamespaceDefinition_IDTerminalRuleCall_2_q = new TokenAlias(false, true, grammarAccess.getNamespaceDefinitionAccess().getIDTerminalRuleCall_2());
		match_NamespaceDefinition_InlineKeyword_0_q = new TokenAlias(false, true, grammarAccess.getNamespaceDefinitionAccess().getInlineKeyword_0());
		match_NoPtrFor___IDTerminalRuleCall_2_0_IDTerminalRuleCall_2_1___EqualsSignKeyword_2_2_0___IDTerminalRuleCall_2_2_1_0_or_INTTerminalRuleCall_2_2_1_1____q__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getNoPtrForAccess().getIDTerminalRuleCall_2_0()), new TokenAlias(false, false, grammarAccess.getNoPtrForAccess().getIDTerminalRuleCall_2_1()), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getNoPtrForAccess().getEqualsSignKeyword_2_2_0()), new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getNoPtrForAccess().getIDTerminalRuleCall_2_2_1_0()), new TokenAlias(false, false, grammarAccess.getNoPtrForAccess().getINTTerminalRuleCall_2_2_1_1()))));
		match_NoPtrFor___IDTerminalRuleCall_4_0_____AmpersandAmpersandKeyword_4_1_0_4_or_EqualsSignEqualsSignKeyword_4_1_0_2_or_ExclamationMarkEqualsSignKeyword_4_1_0_3_or_GreaterThanSignKeyword_4_1_0_1_or_LessThanSignKeyword_4_1_0_0_or_VerticalLineKeyword_4_1_0_5___IDTerminalRuleCall_4_1_1__q__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getNoPtrForAccess().getIDTerminalRuleCall_4_0()), new GroupAlias(false, true, new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getNoPtrForAccess().getAmpersandAmpersandKeyword_4_1_0_4()), new TokenAlias(false, false, grammarAccess.getNoPtrForAccess().getEqualsSignEqualsSignKeyword_4_1_0_2()), new TokenAlias(false, false, grammarAccess.getNoPtrForAccess().getExclamationMarkEqualsSignKeyword_4_1_0_3()), new TokenAlias(false, false, grammarAccess.getNoPtrForAccess().getGreaterThanSignKeyword_4_1_0_1()), new TokenAlias(false, false, grammarAccess.getNoPtrForAccess().getLessThanSignKeyword_4_1_0_0()), new TokenAlias(false, false, grammarAccess.getNoPtrForAccess().getVerticalLineKeyword_4_1_0_5())), new TokenAlias(false, false, grammarAccess.getNoPtrForAccess().getIDTerminalRuleCall_4_1_1())));
		match_NoPtrFor___IDTerminalRuleCall_6_0_PlusSignEqualsSignKeyword_6_1_INTTerminalRuleCall_6_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getNoPtrForAccess().getIDTerminalRuleCall_6_0()), new TokenAlias(false, false, grammarAccess.getNoPtrForAccess().getPlusSignEqualsSignKeyword_6_1()), new TokenAlias(false, false, grammarAccess.getNoPtrForAccess().getINTTerminalRuleCall_6_2()));
		match_NoPtrStatement_BreakKeyword_1_0_a = new TokenAlias(true, true, grammarAccess.getNoPtrStatementAccess().getBreakKeyword_1_0());
		match_NoPtrTerminalExpression_ExclamationMarkKeyword_0_1_a = new TokenAlias(true, true, grammarAccess.getNoPtrTerminalExpressionAccess().getExclamationMarkKeyword_0_1());
		match_NoPtrTerminalExpression_ExclamationMarkKeyword_1_1_a = new TokenAlias(true, true, grammarAccess.getNoPtrTerminalExpressionAccess().getExclamationMarkKeyword_1_1());
		match_NoPtrWhile___IDTerminalRuleCall_2_0_____AmpersandAmpersandKeyword_2_1_0_4_or_EqualsSignEqualsSignKeyword_2_1_0_2_or_ExclamationMarkEqualsSignKeyword_2_1_0_3_or_GreaterThanSignKeyword_2_1_0_1_or_LessThanSignKeyword_2_1_0_0_or_VerticalLineKeyword_2_1_0_5___IDTerminalRuleCall_2_1_1__q__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getNoPtrWhileAccess().getIDTerminalRuleCall_2_0()), new GroupAlias(false, true, new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getNoPtrWhileAccess().getAmpersandAmpersandKeyword_2_1_0_4()), new TokenAlias(false, false, grammarAccess.getNoPtrWhileAccess().getEqualsSignEqualsSignKeyword_2_1_0_2()), new TokenAlias(false, false, grammarAccess.getNoPtrWhileAccess().getExclamationMarkEqualsSignKeyword_2_1_0_3()), new TokenAlias(false, false, grammarAccess.getNoPtrWhileAccess().getGreaterThanSignKeyword_2_1_0_1()), new TokenAlias(false, false, grammarAccess.getNoPtrWhileAccess().getLessThanSignKeyword_2_1_0_0()), new TokenAlias(false, false, grammarAccess.getNoPtrWhileAccess().getVerticalLineKeyword_2_1_0_5())), new TokenAlias(false, false, grammarAccess.getNoPtrWhileAccess().getIDTerminalRuleCall_2_1_1())));
		match_Parameter_AmpersandKeyword_3_1_a_or_AsteriskKeyword_3_0_a = new AlternativeAlias(false, false, new TokenAlias(true, true, grammarAccess.getParameterAccess().getAmpersandKeyword_3_1()), new TokenAlias(true, true, grammarAccess.getParameterAccess().getAsteriskKeyword_3_0()));
		match_Parameter_ConstKeyword_1_q = new TokenAlias(false, true, grammarAccess.getParameterAccess().getConstKeyword_1());
		match_Parameter_ExclamationMarkKeyword_6_1_a = new TokenAlias(true, true, grammarAccess.getParameterAccess().getExclamationMarkKeyword_6_1());
		match_Parameter___LeftSquareBracketKeyword_5_0_INTTerminalRuleCall_5_1_q_RightSquareBracketKeyword_5_2__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getParameterAccess().getLeftSquareBracketKeyword_5_0()), new TokenAlias(false, true, grammarAccess.getParameterAccess().getINTTerminalRuleCall_5_1()), new TokenAlias(false, false, grammarAccess.getParameterAccess().getRightSquareBracketKeyword_5_2()));
		match_VarDecl_AmpersandKeyword_3_1_a_or_AsteriskKeyword_3_0_a = new AlternativeAlias(false, false, new TokenAlias(true, true, grammarAccess.getVarDeclAccess().getAmpersandKeyword_3_1()), new TokenAlias(true, true, grammarAccess.getVarDeclAccess().getAsteriskKeyword_3_0()));
		match_VarDecl_ConstKeyword_1_q = new TokenAlias(false, true, grammarAccess.getVarDeclAccess().getConstKeyword_1());
		match_VarDecl_ExclamationMarkKeyword_6_1_a = new TokenAlias(true, true, grammarAccess.getVarDeclAccess().getExclamationMarkKeyword_6_1());
		match_VarDecl___LeftSquareBracketKeyword_5_0_INTTerminalRuleCall_5_1_RightSquareBracketKeyword_5_2__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getVarDeclAccess().getLeftSquareBracketKeyword_5_0()), new TokenAlias(false, false, grammarAccess.getVarDeclAccess().getINTTerminalRuleCall_5_1()), new TokenAlias(false, false, grammarAccess.getVarDeclAccess().getRightSquareBracketKeyword_5_2()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getIDRule())
			return getIDToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getINTRule())
			return getINTToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSTRINGRule())
			return getSTRINGToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getPreprocessing_fileRule())
			return getpreprocessing_fileToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal ID:
	 * 	(NONDIGIT | UNIVERSAL_CHARACTER_NAME) (('0'..'9') | NONDIGIT | UNIVERSAL_CHARACTER_NAME)*;
	 */
	protected String getIDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * terminal INT returns ecore::EInt: ('0'..'9')+;
	 */
	protected String getINTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * terminal STRING	: 
	 * 			'"' ( '\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\') | !('\\'|'"') )* '"' |
	 * 			"'" ( '\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\') | !('\\'|"'") )* "'"
	 * 		;
	 */
	protected String getSTRINGToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\"\"";
	}
	
	/**
	 * preprocessing_file:
	 * 	group?
	 * ;
	 */
	protected String getpreprocessing_fileToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_FunctionDeclaration_ConstKeyword_1_q.equals(syntax))
				emit_FunctionDeclaration_ConstKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_NamespaceDefinition_IDTerminalRuleCall_2_q.equals(syntax))
				emit_NamespaceDefinition_IDTerminalRuleCall_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_NamespaceDefinition_InlineKeyword_0_q.equals(syntax))
				emit_NamespaceDefinition_InlineKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_NoPtrFor___IDTerminalRuleCall_2_0_IDTerminalRuleCall_2_1___EqualsSignKeyword_2_2_0___IDTerminalRuleCall_2_2_1_0_or_INTTerminalRuleCall_2_2_1_1____q__q.equals(syntax))
				emit_NoPtrFor___IDTerminalRuleCall_2_0_IDTerminalRuleCall_2_1___EqualsSignKeyword_2_2_0___IDTerminalRuleCall_2_2_1_0_or_INTTerminalRuleCall_2_2_1_1____q__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_NoPtrFor___IDTerminalRuleCall_4_0_____AmpersandAmpersandKeyword_4_1_0_4_or_EqualsSignEqualsSignKeyword_4_1_0_2_or_ExclamationMarkEqualsSignKeyword_4_1_0_3_or_GreaterThanSignKeyword_4_1_0_1_or_LessThanSignKeyword_4_1_0_0_or_VerticalLineKeyword_4_1_0_5___IDTerminalRuleCall_4_1_1__q__q.equals(syntax))
				emit_NoPtrFor___IDTerminalRuleCall_4_0_____AmpersandAmpersandKeyword_4_1_0_4_or_EqualsSignEqualsSignKeyword_4_1_0_2_or_ExclamationMarkEqualsSignKeyword_4_1_0_3_or_GreaterThanSignKeyword_4_1_0_1_or_LessThanSignKeyword_4_1_0_0_or_VerticalLineKeyword_4_1_0_5___IDTerminalRuleCall_4_1_1__q__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_NoPtrFor___IDTerminalRuleCall_6_0_PlusSignEqualsSignKeyword_6_1_INTTerminalRuleCall_6_2__q.equals(syntax))
				emit_NoPtrFor___IDTerminalRuleCall_6_0_PlusSignEqualsSignKeyword_6_1_INTTerminalRuleCall_6_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_NoPtrStatement_BreakKeyword_1_0_a.equals(syntax))
				emit_NoPtrStatement_BreakKeyword_1_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_NoPtrTerminalExpression_ExclamationMarkKeyword_0_1_a.equals(syntax))
				emit_NoPtrTerminalExpression_ExclamationMarkKeyword_0_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_NoPtrTerminalExpression_ExclamationMarkKeyword_1_1_a.equals(syntax))
				emit_NoPtrTerminalExpression_ExclamationMarkKeyword_1_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_NoPtrWhile___IDTerminalRuleCall_2_0_____AmpersandAmpersandKeyword_2_1_0_4_or_EqualsSignEqualsSignKeyword_2_1_0_2_or_ExclamationMarkEqualsSignKeyword_2_1_0_3_or_GreaterThanSignKeyword_2_1_0_1_or_LessThanSignKeyword_2_1_0_0_or_VerticalLineKeyword_2_1_0_5___IDTerminalRuleCall_2_1_1__q__q.equals(syntax))
				emit_NoPtrWhile___IDTerminalRuleCall_2_0_____AmpersandAmpersandKeyword_2_1_0_4_or_EqualsSignEqualsSignKeyword_2_1_0_2_or_ExclamationMarkEqualsSignKeyword_2_1_0_3_or_GreaterThanSignKeyword_2_1_0_1_or_LessThanSignKeyword_2_1_0_0_or_VerticalLineKeyword_2_1_0_5___IDTerminalRuleCall_2_1_1__q__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Parameter_AmpersandKeyword_3_1_a_or_AsteriskKeyword_3_0_a.equals(syntax))
				emit_Parameter_AmpersandKeyword_3_1_a_or_AsteriskKeyword_3_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Parameter_ConstKeyword_1_q.equals(syntax))
				emit_Parameter_ConstKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Parameter_ExclamationMarkKeyword_6_1_a.equals(syntax))
				emit_Parameter_ExclamationMarkKeyword_6_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Parameter___LeftSquareBracketKeyword_5_0_INTTerminalRuleCall_5_1_q_RightSquareBracketKeyword_5_2__a.equals(syntax))
				emit_Parameter___LeftSquareBracketKeyword_5_0_INTTerminalRuleCall_5_1_q_RightSquareBracketKeyword_5_2__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_VarDecl_AmpersandKeyword_3_1_a_or_AsteriskKeyword_3_0_a.equals(syntax))
				emit_VarDecl_AmpersandKeyword_3_1_a_or_AsteriskKeyword_3_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_VarDecl_ConstKeyword_1_q.equals(syntax))
				emit_VarDecl_ConstKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_VarDecl_ExclamationMarkKeyword_6_1_a.equals(syntax))
				emit_VarDecl_ExclamationMarkKeyword_6_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_VarDecl___LeftSquareBracketKeyword_5_0_INTTerminalRuleCall_5_1_RightSquareBracketKeyword_5_2__a.equals(syntax))
				emit_VarDecl___LeftSquareBracketKeyword_5_0_INTTerminalRuleCall_5_1_RightSquareBracketKeyword_5_2__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     'const'?
	 */
	protected void emit_FunctionDeclaration_ConstKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ID?
	 */
	protected void emit_NamespaceDefinition_IDTerminalRuleCall_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'inline'?
	 */
	protected void emit_NamespaceDefinition_InlineKeyword_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (ID ID ('=' (INT | ID))?)?
	 */
	protected void emit_NoPtrFor___IDTerminalRuleCall_2_0_IDTerminalRuleCall_2_1___EqualsSignKeyword_2_2_0___IDTerminalRuleCall_2_2_1_0_or_INTTerminalRuleCall_2_2_1_1____q__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (
	     ID 
	     (
	         (
	             '>' | 
	             '|' | 
	             '==' | 
	             '!=' | 
	             '<' | 
	             '&&'
	         ) 
	         ID
	     )?
	 )?
	 */
	protected void emit_NoPtrFor___IDTerminalRuleCall_4_0_____AmpersandAmpersandKeyword_4_1_0_4_or_EqualsSignEqualsSignKeyword_4_1_0_2_or_ExclamationMarkEqualsSignKeyword_4_1_0_3_or_GreaterThanSignKeyword_4_1_0_1_or_LessThanSignKeyword_4_1_0_0_or_VerticalLineKeyword_4_1_0_5___IDTerminalRuleCall_4_1_1__q__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (ID '+=' INT)?
	 */
	protected void emit_NoPtrFor___IDTerminalRuleCall_6_0_PlusSignEqualsSignKeyword_6_1_INTTerminalRuleCall_6_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'break;'*
	 */
	protected void emit_NoPtrStatement_BreakKeyword_1_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '!'*
	 */
	protected void emit_NoPtrTerminalExpression_ExclamationMarkKeyword_0_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '!'*
	 */
	protected void emit_NoPtrTerminalExpression_ExclamationMarkKeyword_1_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (
	     ID 
	     (
	         (
	             '>' | 
	             '&&' | 
	             '!=' | 
	             '|' | 
	             '<' | 
	             '=='
	         ) 
	         ID
	     )?
	 )?
	 */
	protected void emit_NoPtrWhile___IDTerminalRuleCall_2_0_____AmpersandAmpersandKeyword_2_1_0_4_or_EqualsSignEqualsSignKeyword_2_1_0_2_or_ExclamationMarkEqualsSignKeyword_2_1_0_3_or_GreaterThanSignKeyword_2_1_0_1_or_LessThanSignKeyword_2_1_0_0_or_VerticalLineKeyword_2_1_0_5___IDTerminalRuleCall_2_1_1__q__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '&'* | '*'*
	 */
	protected void emit_Parameter_AmpersandKeyword_3_1_a_or_AsteriskKeyword_3_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'const'?
	 */
	protected void emit_Parameter_ConstKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '!'*
	 */
	protected void emit_Parameter_ExclamationMarkKeyword_6_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('[' INT? ']')*
	 */
	protected void emit_Parameter___LeftSquareBracketKeyword_5_0_INTTerminalRuleCall_5_1_q_RightSquareBracketKeyword_5_2__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '&'* | '*'*
	 */
	protected void emit_VarDecl_AmpersandKeyword_3_1_a_or_AsteriskKeyword_3_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'const'?
	 */
	protected void emit_VarDecl_ConstKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '!'*
	 */
	protected void emit_VarDecl_ExclamationMarkKeyword_6_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('[' INT ']')*
	 */
	protected void emit_VarDecl___LeftSquareBracketKeyword_5_0_INTTerminalRuleCall_5_1_RightSquareBracketKeyword_5_2__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
