/*
* generated by Xtext
*/
package org.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.services.Cpp2GrammarAccess;

public class Cpp2Parser extends AbstractContentAssistParser {
	
	@Inject
	private Cpp2GrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.ui.contentassist.antlr.internal.InternalCpp2Parser createParser() {
		org.ui.contentassist.antlr.internal.InternalCpp2Parser result = new org.ui.contentassist.antlr.internal.InternalCpp2Parser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getPreProcessingTokenAccess().getAlternatives(), "rule__PreProcessingToken__Alternatives");
					put(grammarAccess.getPreProcessingTokenAccess().getAlternatives_2_0(), "rule__PreProcessingToken__Alternatives_2_0");
					put(grammarAccess.getPreProcessingTokenAccess().getAlternatives_2_1(), "rule__PreProcessingToken__Alternatives_2_1");
					put(grammarAccess.getPreProcessingTokenAccess().getAlternatives_2_1_2_0(), "rule__PreProcessingToken__Alternatives_2_1_2_0");
					put(grammarAccess.getPreProcessingTokenAccess().getAlternatives_2_1_2_1(), "rule__PreProcessingToken__Alternatives_2_1_2_1");
					put(grammarAccess.getTokenAccess().getAlternatives(), "rule__Token__Alternatives");
					put(grammarAccess.getLiteralAccess().getAlternatives(), "rule__Literal__Alternatives");
					put(grammarAccess.getLiteralAccess().getAlternatives_4(), "rule__Literal__Alternatives_4");
					put(grammarAccess.getPreProcessingTokenAccess().getGroup_2(), "rule__PreProcessingToken__Group_2__0");
					put(grammarAccess.getPreProcessingTokenAccess().getGroup_2_0_1(), "rule__PreProcessingToken__Group_2_0_1__0");
					put(grammarAccess.getPreProcessingTokenAccess().getGroup_2_1_2(), "rule__PreProcessingToken__Group_2_1_2__0");
					put(grammarAccess.getTokenAccess().getGroup_2(), "rule__Token__Group_2__0");
					put(grammarAccess.getTestAccess().getElementsAssignment(), "rule__Test__ElementsAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.ui.contentassist.antlr.internal.InternalCpp2Parser typedParser = (org.ui.contentassist.antlr.internal.InternalCpp2Parser) parser;
			typedParser.entryRuleTest();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public Cpp2GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(Cpp2GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
