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
import org.xtext.example.mydsl.myDsl.Body;
import org.xtext.example.mydsl.myDsl.BoolType;
import org.xtext.example.mydsl.myDsl.Declaration;
import org.xtext.example.mydsl.myDsl.FunctionDeclaration;
import org.xtext.example.mydsl.myDsl.IntType;
import org.xtext.example.mydsl.myDsl.LKS;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.NamespaceDefinition;
import org.xtext.example.mydsl.myDsl.Parameter;
import org.xtext.example.mydsl.myDsl.Return;
import org.xtext.example.mydsl.myDsl.Type;
import org.xtext.example.mydsl.myDsl.UnknownType;
import org.xtext.example.mydsl.myDsl.VarDecl;
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
			case MyDslPackage.BODY:
				if(context == grammarAccess.getBodyRule() ||
				   context == grammarAccess.getModelRule()) {
					sequence_Body(context, (Body) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.BOOL_TYPE:
				if(context == grammarAccess.getSimple_type_specifierRule()) {
					sequence_simple_type_specifier(context, (BoolType) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.DECLARATION:
				if(context == grammarAccess.getDeclarationRule()) {
					sequence_Declaration(context, (Declaration) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.FUNCTION_DECLARATION:
				if(context == grammarAccess.getFunctionDeclarationRule()) {
					sequence_FunctionDeclaration(context, (FunctionDeclaration) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.INT_TYPE:
				if(context == grammarAccess.getSimple_type_specifierRule()) {
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
			case MyDslPackage.PARAMETER:
				if(context == grammarAccess.getParameterRule()) {
					sequence_Parameter(context, (Parameter) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.RETURN:
				if(context == grammarAccess.getJump_statementRule()) {
					sequence_jump_statement(context, (Return) semanticObject); 
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
	 *     (type=Type name=ID (params+=Parameter params+=Parameter*)? escopo=Statement?)
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
	 *     (type=Type name=ID)
	 */
	protected void sequence_Parameter(EObject context, Parameter semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.PARAMETER__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.PARAMETER__TYPE));
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.PARAMETER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.PARAMETER__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_1_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
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
	 *     (type=Type name=ID)
	 */
	protected void sequence_VarDecl(EObject context, VarDecl semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.VAR_DECL__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.VAR_DECL__TYPE));
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.VAR_DECL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.VAR_DECL__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVarDeclAccess().getTypeTypeParserRuleCall_1_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getVarDeclAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
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
	 *     (exp=Expression?)
	 */
	protected void sequence_jump_statement(EObject context, Return semanticObject) {
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
	protected void sequence_simple_type_specifier(EObject context, BoolType semanticObject) {
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
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.SIMPLE_TYPE_SPECIFIER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.SIMPLE_TYPE_SPECIFIER__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSimple_type_specifierAccess().getNameIntKeyword_0_1_0(), semanticObject.getName());
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
		feeder.accept(grammarAccess.getSimple_type_specifierAccess().getNameIDTerminalRuleCall_2_1_0(), semanticObject.getName());
		feeder.finish();
	}
}
