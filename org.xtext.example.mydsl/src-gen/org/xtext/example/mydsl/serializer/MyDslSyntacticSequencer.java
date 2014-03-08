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
	protected AbstractElementAlias match_jump_statement___BreakKeyword_0_or_ContinueKeyword_1___or___GotoKeyword_3_0_IDTerminalRuleCall_3_1_SemicolonKeyword_3_2__;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (MyDslGrammarAccess) access;
		match_jump_statement___BreakKeyword_0_or_ContinueKeyword_1___or___GotoKeyword_3_0_IDTerminalRuleCall_3_1_SemicolonKeyword_3_2__ = new AlternativeAlias(false, false, new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getJump_statementAccess().getBreakKeyword_0()), new TokenAlias(false, false, grammarAccess.getJump_statementAccess().getContinueKeyword_1())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getJump_statementAccess().getGotoKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getJump_statementAccess().getIDTerminalRuleCall_3_1()), new TokenAlias(false, false, grammarAccess.getJump_statementAccess().getSemicolonKeyword_3_2())));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getIDRule())
			return getIDToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getPreprocessing_fileRule())
			return getpreprocessing_fileToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal ID  		: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	 */
	protected String getIDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
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
			if(match_jump_statement___BreakKeyword_0_or_ContinueKeyword_1___or___GotoKeyword_3_0_IDTerminalRuleCall_3_1_SemicolonKeyword_3_2__.equals(syntax))
				emit_jump_statement___BreakKeyword_0_or_ContinueKeyword_1___or___GotoKeyword_3_0_IDTerminalRuleCall_3_1_SemicolonKeyword_3_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ('break;' | 'continue;') | ('goto' ID ';')
	 */
	protected void emit_jump_statement___BreakKeyword_0_or_ContinueKeyword_1___or___GotoKeyword_3_0_IDTerminalRuleCall_3_1_SemicolonKeyword_3_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
