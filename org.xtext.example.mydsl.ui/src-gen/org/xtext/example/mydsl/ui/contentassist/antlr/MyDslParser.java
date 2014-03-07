/*
* generated by Xtext
*/
package org.xtext.example.mydsl.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.xtext.example.mydsl.services.MyDslGrammarAccess;

public class MyDslParser extends AbstractContentAssistParser {
	
	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalMyDslParser createParser() {
		org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalMyDslParser result = new org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalMyDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getSimple_type_specifierAccess().getAlternatives(), "rule__Simple_type_specifier__Alternatives");
					put(grammarAccess.getNew_lineAccess().getAlternatives(), "rule__New_line__Alternatives");
					put(grammarAccess.getGroup_partAccess().getAlternatives(), "rule__Group_part__Alternatives");
					put(grammarAccess.getIf_groupAccess().getAlternatives(), "rule__If_group__Alternatives");
					put(grammarAccess.getPreprocessing_tokenAccess().getAlternatives(), "rule__Preprocessing_token__Alternatives");
					put(grammarAccess.getControl_lineAccess().getAlternatives(), "rule__Control_line__Alternatives");
					put(grammarAccess.getSIGNAccess().getAlternatives(), "rule__SIGN__Alternatives");
					put(grammarAccess.getPreProcessingTokenAccess().getAlternatives(), "rule__PreProcessingToken__Alternatives");
					put(grammarAccess.getPreProcessingTokenAccess().getAlternatives_2_0(), "rule__PreProcessingToken__Alternatives_2_0");
					put(grammarAccess.getPreProcessingTokenAccess().getAlternatives_2_1(), "rule__PreProcessingToken__Alternatives_2_1");
					put(grammarAccess.getPreProcessingTokenAccess().getAlternatives_2_1_2_0(), "rule__PreProcessingToken__Alternatives_2_1_2_0");
					put(grammarAccess.getPreProcessingTokenAccess().getAlternatives_2_1_2_1(), "rule__PreProcessingToken__Alternatives_2_1_2_1");
					put(grammarAccess.getTokenAccess().getAlternatives(), "rule__Token__Alternatives");
					put(grammarAccess.getLiteralAccess().getAlternatives(), "rule__Literal__Alternatives");
					put(grammarAccess.getLiteralAccess().getAlternatives_4(), "rule__Literal__Alternatives_4");
					put(grammarAccess.getBodyAccess().getGroup(), "rule__Body__Group__0");
					put(grammarAccess.getFunctionDeclarationAccess().getGroup(), "rule__FunctionDeclaration__Group__0");
					put(grammarAccess.getFunctionDeclarationAccess().getGroup_4(), "rule__FunctionDeclaration__Group_4__0");
					put(grammarAccess.getFunctionDeclarationAccess().getGroup_4_1(), "rule__FunctionDeclaration__Group_4_1__0");
					put(grammarAccess.getParameterAccess().getGroup(), "rule__Parameter__Group__0");
					put(grammarAccess.getVarDeclAccess().getGroup(), "rule__VarDecl__Group__0");
					put(grammarAccess.getSimple_type_specifierAccess().getGroup_0(), "rule__Simple_type_specifier__Group_0__0");
					put(grammarAccess.getSimple_type_specifierAccess().getGroup_1(), "rule__Simple_type_specifier__Group_1__0");
					put(grammarAccess.getIf_actionAccess().getGroup(), "rule__If_action__Group__0");
					put(grammarAccess.getIf_groupAccess().getGroup_0(), "rule__If_group__Group_0__0");
					put(grammarAccess.getIf_groupAccess().getGroup_1(), "rule__If_group__Group_1__0");
					put(grammarAccess.getIf_groupAccess().getGroup_2(), "rule__If_group__Group_2__0");
					put(grammarAccess.getElif_groupAccess().getGroup(), "rule__Elif_group__Group__0");
					put(grammarAccess.getStatementAccess().getGroup(), "rule__Statement__Group__0");
					put(grammarAccess.getSimple_declarationAccess().getGroup(), "rule__Simple_declaration__Group__0");
					put(grammarAccess.getBlock_declarationAccess().getGroup(), "rule__Block_declaration__Group__0");
					put(grammarAccess.getElse_groupAccess().getGroup(), "rule__Else_group__Group__0");
					put(grammarAccess.getEndif_lineAccess().getGroup(), "rule__Endif_line__Group__0");
					put(grammarAccess.getControl_lineAccess().getGroup_0(), "rule__Control_line__Group_0__0");
					put(grammarAccess.getControl_lineAccess().getGroup_1(), "rule__Control_line__Group_1__0");
					put(grammarAccess.getControl_lineAccess().getGroup_2(), "rule__Control_line__Group_2__0");
					put(grammarAccess.getControl_lineAccess().getGroup_3(), "rule__Control_line__Group_3__0");
					put(grammarAccess.getControl_lineAccess().getGroup_4(), "rule__Control_line__Group_4__0");
					put(grammarAccess.getControl_lineAccess().getGroup_5(), "rule__Control_line__Group_5__0");
					put(grammarAccess.getControl_lineAccess().getGroup_6(), "rule__Control_line__Group_6__0");
					put(grammarAccess.getControl_lineAccess().getGroup_7(), "rule__Control_line__Group_7__0");
					put(grammarAccess.getPreProcessingTokenAccess().getGroup_2(), "rule__PreProcessingToken__Group_2__0");
					put(grammarAccess.getPreProcessingTokenAccess().getGroup_2_0_1(), "rule__PreProcessingToken__Group_2_0_1__0");
					put(grammarAccess.getPreProcessingTokenAccess().getGroup_2_1_2(), "rule__PreProcessingToken__Group_2_1_2__0");
					put(grammarAccess.getTokenAccess().getGroup_2(), "rule__Token__Group_2__0");
					put(grammarAccess.getBodyAccess().getFuncoesAssignment_4(), "rule__Body__FuncoesAssignment_4");
					put(grammarAccess.getFunctionDeclarationAccess().getTypeAssignment_1(), "rule__FunctionDeclaration__TypeAssignment_1");
					put(grammarAccess.getFunctionDeclarationAccess().getNameAssignment_2(), "rule__FunctionDeclaration__NameAssignment_2");
					put(grammarAccess.getFunctionDeclarationAccess().getParamsAssignment_4_0(), "rule__FunctionDeclaration__ParamsAssignment_4_0");
					put(grammarAccess.getFunctionDeclarationAccess().getParamsAssignment_4_1_1(), "rule__FunctionDeclaration__ParamsAssignment_4_1_1");
					put(grammarAccess.getFunctionDeclarationAccess().getEscopoAssignment_8(), "rule__FunctionDeclaration__EscopoAssignment_8");
					put(grammarAccess.getParameterAccess().getTypeAssignment_1(), "rule__Parameter__TypeAssignment_1");
					put(grammarAccess.getParameterAccess().getNameAssignment_2(), "rule__Parameter__NameAssignment_2");
					put(grammarAccess.getVarDeclAccess().getTypeAssignment_1(), "rule__VarDecl__TypeAssignment_1");
					put(grammarAccess.getVarDeclAccess().getNameAssignment_2(), "rule__VarDecl__NameAssignment_2");
					put(grammarAccess.getStatementAccess().getVariavelAssignment_1(), "rule__Statement__VariavelAssignment_1");
					put(grammarAccess.getSimple_declarationAccess().getVariavelAssignment_0(), "rule__Simple_declaration__VariavelAssignment_0");
					put(grammarAccess.getDeclaration_statementAccess().getVariaveisAssignment(), "rule__Declaration_statement__VariaveisAssignment");
					put(grammarAccess.getBlock_declarationAccess().getVariavelAssignment_1(), "rule__Block_declaration__VariavelAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalMyDslParser typedParser = (org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalMyDslParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public MyDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
