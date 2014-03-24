package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.mydsl.myDsl.Atomic;
import org.xtext.example.mydsl.myDsl.Body;
import org.xtext.example.mydsl.myDsl.BooleanType;
import org.xtext.example.mydsl.myDsl.BooleanhType;
import org.xtext.example.mydsl.myDsl.CaseNormal;
import org.xtext.example.mydsl.myDsl.Declaration;
import org.xtext.example.mydsl.myDsl.DefaultCase;
import org.xtext.example.mydsl.myDsl.FunctionChamada;
import org.xtext.example.mydsl.myDsl.FunctionDeclaration;
import org.xtext.example.mydsl.myDsl.FunctionType;
import org.xtext.example.mydsl.myDsl.IntType;
import org.xtext.example.mydsl.myDsl.LKS;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.NamespaceDefinition;
import org.xtext.example.mydsl.myDsl.NoPtrExpression;
import org.xtext.example.mydsl.myDsl.NoPtrMudanca;
import org.xtext.example.mydsl.myDsl.NoPtrSelect;
import org.xtext.example.mydsl.myDsl.NoPtrStatement;
import org.xtext.example.mydsl.myDsl.NoPtrTerminalExpression;
import org.xtext.example.mydsl.myDsl.Parameter;
import org.xtext.example.mydsl.myDsl.Return;
import org.xtext.example.mydsl.myDsl.StringType;
import org.xtext.example.mydsl.myDsl.StringhType;
import org.xtext.example.mydsl.myDsl.Type;
import org.xtext.example.mydsl.myDsl.UnknownType;
import org.xtext.example.mydsl.myDsl.VarDecl;
import org.xtext.example.mydsl.myDsl.Variable;
import org.xtext.example.mydsl.myDsl.block_declaration;
import org.xtext.example.mydsl.myDsl.declaration_statement;
import org.xtext.example.mydsl.myDsl.simple_declaration;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == MyDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case MyDslPackage.ATOMIC:
				if(context == grammarAccess.getNoPtrTerminalExpressionRule()) {
					sequence_NoPtrTerminalExpression(context, (Atomic) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.BODY:
				if(context == grammarAccess.getBodyRule() ||
				   context == grammarAccess.getModelRule()) {
					sequence_Body(context, (Body) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.BOOLEAN_TYPE:
				if(context == grammarAccess.getSimple_type_specifierRule()) {
					sequence_simple_type_specifier(context, (BooleanType) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.BOOLEANH_TYPE:
				if(context == grammarAccess.getReturnExprRule()) {
					sequence_ReturnExpr(context, (BooleanhType) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.CASE_NORMAL:
				if(context == grammarAccess.getNoPtrCasesRule()) {
					sequence_NoPtrCases(context, (CaseNormal) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.DECLARATION:
				if(context == grammarAccess.getDeclarationRule()) {
					sequence_Declaration(context, (Declaration) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.DEFAULT_CASE:
				if(context == grammarAccess.getNoPtrCasesRule()) {
					sequence_NoPtrCases(context, (DefaultCase) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.FUNCTION_CHAMADA:
				if(context == grammarAccess.getFunctionChamadaRule()) {
					sequence_FunctionChamada(context, (FunctionChamada) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.FUNCTION_DECLARATION:
				if(context == grammarAccess.getFunctionDeclarationRule()) {
					sequence_FunctionDeclaration(context, (FunctionDeclaration) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.FUNCTION_TYPE:
				if(context == grammarAccess.getReturnExprRule()) {
					sequence_ReturnExpr(context, (FunctionType) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.INT_TYPE:
				if(context == grammarAccess.getReturnExprRule()) {
					sequence_ReturnExpr(context, (IntType) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getSimple_type_specifierRule()) {
					sequence_simple_type_specifier(context, (IntType) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.LKS:
				if(context == grammarAccess.getLinkageSpecificationRule()) {
					sequence_LinkageSpecification(context, (LKS) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.NAMESPACE_DEFINITION:
				if(context == grammarAccess.getNamespaceDefinitionRule()) {
					sequence_NamespaceDefinition(context, (NamespaceDefinition) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.NO_PTR_EXPRESSION:
				if(context == grammarAccess.getNoPtrExpressionRule()) {
					sequence_NoPtrExpression(context, (NoPtrExpression) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.NO_PTR_MUDANCA:
				if(context == grammarAccess.getNoPtrMudancaRule()) {
					sequence_NoPtrMudanca(context, (NoPtrMudanca) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.NO_PTR_SELECT:
				if(context == grammarAccess.getNoPtrSelectRule()) {
					sequence_NoPtrSelect(context, (NoPtrSelect) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.NO_PTR_STATEMENT:
				if(context == grammarAccess.getNoPtrStatementRule()) {
					sequence_NoPtrStatement(context, (NoPtrStatement) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.NO_PTR_TERMINAL_EXPRESSION:
				if(context == grammarAccess.getNoPtrTerminalExpressionRule()) {
					sequence_NoPtrTerminalExpression(context, (NoPtrTerminalExpression) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.PARAMETER:
				if(context == grammarAccess.getParameterRule()) {
					sequence_Parameter(context, (Parameter) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.RETURN:
				if(context == grammarAccess.getReturnRule()) {
					sequence_Return(context, (Return) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.STRING_TYPE:
				if(context == grammarAccess.getSimple_type_specifierRule()) {
					sequence_simple_type_specifier(context, (StringType) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.STRINGH_TYPE:
				if(context == grammarAccess.getReturnExprRule()) {
					sequence_ReturnExpr(context, (StringhType) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.TYPE:
				if(context == grammarAccess.getTypeRule()) {
					sequence_Type(context, (Type) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.UNKNOWN_TYPE:
				if(context == grammarAccess.getSimple_type_specifierRule()) {
					sequence_simple_type_specifier(context, (UnknownType) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.VAR_DECL:
				if(context == grammarAccess.getVarDeclRule()) {
					sequence_VarDecl(context, (VarDecl) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.VARIABLE:
				if(context == grammarAccess.getReturnExprRule()) {
					sequence_ReturnExpr(context, (Variable) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.BLOCK_DECLARATION:
				if(context == grammarAccess.getBlock_declarationRule()) {
					sequence_block_declaration(context, (block_declaration) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.DECLARATION_STATEMENT:
				if(context == grammarAccess.getDeclaration_statementRule()) {
					sequence_declaration_statement(context, (declaration_statement) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.SIMPLE_DECLARATION:
				if(context == grammarAccess.getSimple_declarationRule()) {
					sequence_simple_declaration(context, (simple_declaration) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (declarations+=Declaration*)
	 */
	protected void sequence_Body(EObject context, Body semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         variaveis=VarDecl | 
	 *         ditryD=Return | 
	 *         chamada=FunctionChamada | 
	 *         funcao=FunctionDeclaration | 
	 *         dirtyE=SimpleOrFunctionDeclaration | 
	 *         dirtyA=BlockDeclaration | 
	 *         dirtyB=TemplateDeclaration | 
	 *         dirtyC=ExplicitInstantiation | 
	 *         dirtyD=ExplicitSpecialization | 
	 *         dirty=LinkageSpecification | 
	 *         dirty=NamespaceDefinition
	 *     )
	 */
	protected void sequence_Declaration(EObject context, Declaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (params+=ReturnExpr params+=ReturnExpr*)?)
	 */
	protected void sequence_FunctionChamada(EObject context, FunctionChamada semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=Type name=ID (params+=Parameter params+=Parameter*)? escopo=NoPtrStatement)
	 */
	protected void sequence_FunctionDeclaration(EObject context, FunctionDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (dirty=Declaration | dirty=Declaration*)
	 */
	protected void sequence_LinkageSpecification(EObject context, LKS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     dirty=Declaration*
	 */
	protected void sequence_NamespaceDefinition(EObject context, NamespaceDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expr=NoPtrExpression
	 */
	protected void sequence_NoPtrCases(EObject context, CaseNormal semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.CASE_NORMAL__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.CASE_NORMAL__EXPR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNoPtrCasesAccess().getExprNoPtrExpressionParserRuleCall_1_2_0(), semanticObject.getExpr());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {DefaultCase}
	 */
	protected void sequence_NoPtrCases(EObject context, DefaultCase semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=NoPtrTerminalExpression ((op='&&' | op='||' | op='==' | op='!=') right=NoPtrTerminalExpression)?)
	 */
	protected void sequence_NoPtrExpression(EObject context, NoPtrExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID expr=NoPtrExpression)
	 */
	protected void sequence_NoPtrMudanca(EObject context, NoPtrMudanca semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.NO_PTR_MUDANCA__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.NO_PTR_MUDANCA__NAME));
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.NO_PTR_MUDANCA__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.NO_PTR_MUDANCA__EXPR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNoPtrMudancaAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getNoPtrMudancaAccess().getExprNoPtrExpressionParserRuleCall_2_1_0(), semanticObject.getExpr());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (expr=NoPtrExpression cases+=NoPtrCases*)
	 */
	protected void sequence_NoPtrSelect(EObject context, NoPtrSelect semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             variaveis+=VarDecl | 
	 *             mudancas+=NoPtrMudanca | 
	 *             lixoV+=NoPtrExpression | 
	 *             switches+=NoPtrSelect | 
	 *             dirtyB+=Return | 
	 *             dirty+=Statement | 
	 *             dirtyV+=FunctionChamada
	 *         )*
	 *     )
	 */
	protected void sequence_NoPtrStatement(EObject context, NoPtrStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     atomic=ReturnExpr
	 */
	protected void sequence_NoPtrTerminalExpression(EObject context, Atomic semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     inside=NoPtrExpression
	 */
	protected void sequence_NoPtrTerminalExpression(EObject context, NoPtrTerminalExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.NO_PTR_TERMINAL_EXPRESSION__INSIDE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.NO_PTR_TERMINAL_EXPRESSION__INSIDE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNoPtrTerminalExpressionAccess().getInsideNoPtrExpressionParserRuleCall_0_3_0(), semanticObject.getInside());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=Type name=ID expr=NoPtrExpression?)
	 */
	protected void sequence_Parameter(EObject context, Parameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value='false' | value='true')
	 */
	protected void sequence_ReturnExpr(EObject context, BooleanhType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     call=FunctionChamada
	 */
	protected void sequence_ReturnExpr(EObject context, FunctionType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.FUNCTION_TYPE__CALL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.FUNCTION_TYPE__CALL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getReturnExprAccess().getCallFunctionChamadaParserRuleCall_3_1_0(), semanticObject.getCall());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_ReturnExpr(EObject context, IntType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_ReturnExpr(EObject context, StringhType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.STRINGH_TYPE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.STRINGH_TYPE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getReturnExprAccess().getValueSTRINGTerminalRuleCall_2_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID expr=ReturnExpr?)
	 */
	protected void sequence_ReturnExpr(EObject context, Variable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (rettype=NoPtrExpression?)
	 */
	protected void sequence_Return(EObject context, Return semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     sts=simple_type_specifier
	 */
	protected void sequence_Type(EObject context, Type semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.TYPE__STS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.TYPE__STS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTypeAccess().getStsSimple_type_specifierParserRuleCall_1_0(), semanticObject.getSts());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=Type name=ID expr=NoPtrExpression?)
	 */
	protected void sequence_VarDecl(EObject context, VarDecl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     variavel=simple_declaration
	 */
	protected void sequence_block_declaration(EObject context, block_declaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.BLOCK_DECLARATION__VARIAVEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.BLOCK_DECLARATION__VARIAVEL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBlock_declarationAccess().getVariavelSimple_declarationParserRuleCall_1_0(), semanticObject.getVariavel());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     variaveis+=block_declaration+
	 */
	protected void sequence_declaration_statement(EObject context, declaration_statement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     variavel=VarDecl
	 */
	protected void sequence_simple_declaration(EObject context, simple_declaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.SIMPLE_DECLARATION__VARIAVEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.SIMPLE_DECLARATION__VARIAVEL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSimple_declarationAccess().getVariavelVarDeclParserRuleCall_0_0(), semanticObject.getVariavel());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name='bool'
	 */
	protected void sequence_simple_type_specifier(EObject context, BooleanType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.SIMPLE_TYPE_SPECIFIER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.SIMPLE_TYPE_SPECIFIER__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSimple_type_specifierAccess().getNameBoolKeyword_1_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name='int'
	 */
	protected void sequence_simple_type_specifier(EObject context, IntType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name='string'
	 */
	protected void sequence_simple_type_specifier(EObject context, StringType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.SIMPLE_TYPE_SPECIFIER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.SIMPLE_TYPE_SPECIFIER__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSimple_type_specifierAccess().getNameStringKeyword_2_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_simple_type_specifier(EObject context, UnknownType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.SIMPLE_TYPE_SPECIFIER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.SIMPLE_TYPE_SPECIFIER__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSimple_type_specifierAccess().getNameIDTerminalRuleCall_3_1_0(), semanticObject.getName());
		feeder.finish();
	}
}
