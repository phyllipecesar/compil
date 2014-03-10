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
	protected AbstractElementAlias match_NamespaceDefinition_IDTerminalRuleCall_2_q;
	protected AbstractElementAlias match_NamespaceDefinition_InlineKeyword_0_q;
	protected AbstractElementAlias match_VarDecl_AmpersandKeyword_3_1_a_or_AsteriskKeyword_3_0_a;
	protected AbstractElementAlias match_VarDecl_ConstKeyword_1_q;
	protected AbstractElementAlias match_VarDecl___LeftSquareBracketKeyword_5_0_INTTerminalRuleCall_5_1_RightSquareBracketKeyword_5_2__a;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (MyDslGrammarAccess) access;
		match_NamespaceDefinition_IDTerminalRuleCall_2_q = new TokenAlias(false, true, grammarAccess.getNamespaceDefinitionAccess().getIDTerminalRuleCall_2());
		match_NamespaceDefinition_InlineKeyword_0_q = new TokenAlias(false, true, grammarAccess.getNamespaceDefinitionAccess().getInlineKeyword_0());
		match_VarDecl_AmpersandKeyword_3_1_a_or_AsteriskKeyword_3_0_a = new AlternativeAlias(false, false, new TokenAlias(true, true, grammarAccess.getVarDeclAccess().getAmpersandKeyword_3_1()), new TokenAlias(true, true, grammarAccess.getVarDeclAccess().getAsteriskKeyword_3_0()));
		match_VarDecl_ConstKeyword_1_q = new TokenAlias(false, true, grammarAccess.getVarDeclAccess().getConstKeyword_1());
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
		else if(ruleCall.getRule() == grammarAccess.getSTRING_LITERALRule())
			return getSTRING_LITERALToken(semanticObject, ruleCall, node);
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
	 * terminal STRING_LITERAL:
	 * 	ENC_PREFIX? '\"' SCHAR+ '\"';
	 */
	protected String getSTRING_LITERALToken(EObject semanticObject, RuleCall ruleCall, INode node) {
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
			if(match_NamespaceDefinition_IDTerminalRuleCall_2_q.equals(syntax))
				emit_NamespaceDefinition_IDTerminalRuleCall_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_NamespaceDefinition_InlineKeyword_0_q.equals(syntax))
				emit_NamespaceDefinition_InlineKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_VarDecl_AmpersandKeyword_3_1_a_or_AsteriskKeyword_3_0_a.equals(syntax))
				emit_VarDecl_AmpersandKeyword_3_1_a_or_AsteriskKeyword_3_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_VarDecl_ConstKeyword_1_q.equals(syntax))
				emit_VarDecl_ConstKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_VarDecl___LeftSquareBracketKeyword_5_0_INTTerminalRuleCall_5_1_RightSquareBracketKeyword_5_2__a.equals(syntax))
				emit_VarDecl___LeftSquareBracketKeyword_5_0_INTTerminalRuleCall_5_1_RightSquareBracketKeyword_5_2__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
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
	 *     '*'* | '&'*
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
	 *     ('[' INT ']')*
	 */
	protected void emit_VarDecl___LeftSquareBracketKeyword_5_0_INTTerminalRuleCall_5_1_RightSquareBracketKeyword_5_2__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
