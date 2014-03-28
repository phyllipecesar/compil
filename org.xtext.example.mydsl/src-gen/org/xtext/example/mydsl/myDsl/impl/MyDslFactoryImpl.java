/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.mydsl.myDsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyDslFactoryImpl extends EFactoryImpl implements MyDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MyDslFactory init()
  {
    try
    {
      MyDslFactory theMyDslFactory = (MyDslFactory)EPackage.Registry.INSTANCE.getEFactory(MyDslPackage.eNS_URI);
      if (theMyDslFactory != null)
      {
        return theMyDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MyDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MyDslPackage.MODEL: return createModel();
      case MyDslPackage.BODY: return createBody();
      case MyDslPackage.DECLARATION: return createDeclaration();
      case MyDslPackage.NAMESPACE_DEFINITION: return createNamespaceDefinition();
      case MyDslPackage.LINKAGE_SPECIFICATION: return createLinkageSpecification();
      case MyDslPackage.FUNCTION_DECLARATION: return createFunctionDeclaration();
      case MyDslPackage.FUNCTION_CHAMADA: return createFunctionChamada();
      case MyDslPackage.NO_PTR_STATEMENT: return createNoPtrStatement();
      case MyDslPackage.NO_PTR_FOR: return createNoPtrFor();
      case MyDslPackage.NO_PTR_WHILE: return createNoPtrWhile();
      case MyDslPackage.NO_PTR_MUDANCA: return createNoPtrMudanca();
      case MyDslPackage.NO_PTR_EXPRESSION: return createNoPtrExpression();
      case MyDslPackage.NO_PTR_TERMINAL_EXPRESSION: return createNoPtrTerminalExpression();
      case MyDslPackage.NO_PTR_SELECT: return createNoPtrSelect();
      case MyDslPackage.NO_PTR_CASES: return createNoPtrCases();
      case MyDslPackage.PARAMETER: return createParameter();
      case MyDslPackage.VAR_DECL: return createVarDecl();
      case MyDslPackage.TYPE: return createType();
      case MyDslPackage.SIMPLE_TYPE_SPECIFIER: return createsimple_type_specifier();
      case MyDslPackage.SIMPLE_DECLARATION: return createsimple_declaration();
      case MyDslPackage.RETURN: return createReturn();
      case MyDslPackage.RETURN_EXPR: return createReturnExpr();
      case MyDslPackage.DECLARATION_STATEMENT: return createdeclaration_statement();
      case MyDslPackage.BLOCK_DECLARATION: return createblock_declaration();
      case MyDslPackage.LKS: return createLKS();
      case MyDslPackage.ATOMIC: return createAtomic();
      case MyDslPackage.DEFAULT_CASE: return createDefaultCase();
      case MyDslPackage.CASE_NORMAL: return createCaseNormal();
      case MyDslPackage.INT_TYPE: return createIntType();
      case MyDslPackage.BOOLEAN_TYPE: return createBooleanType();
      case MyDslPackage.STRING_TYPE: return createStringType();
      case MyDslPackage.UNKNOWN_TYPE: return createUnknownType();
      case MyDslPackage.BOOLEANH_TYPE: return createBooleanhType();
      case MyDslPackage.STRINGH_TYPE: return createStringhType();
      case MyDslPackage.FUNCTION_TYPE: return createFunctionType();
      case MyDslPackage.VARIABLE: return createVariable();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Body createBody()
  {
    BodyImpl body = new BodyImpl();
    return body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Declaration createDeclaration()
  {
    DeclarationImpl declaration = new DeclarationImpl();
    return declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamespaceDefinition createNamespaceDefinition()
  {
    NamespaceDefinitionImpl namespaceDefinition = new NamespaceDefinitionImpl();
    return namespaceDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LinkageSpecification createLinkageSpecification()
  {
    LinkageSpecificationImpl linkageSpecification = new LinkageSpecificationImpl();
    return linkageSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionDeclaration createFunctionDeclaration()
  {
    FunctionDeclarationImpl functionDeclaration = new FunctionDeclarationImpl();
    return functionDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionChamada createFunctionChamada()
  {
    FunctionChamadaImpl functionChamada = new FunctionChamadaImpl();
    return functionChamada;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NoPtrStatement createNoPtrStatement()
  {
    NoPtrStatementImpl noPtrStatement = new NoPtrStatementImpl();
    return noPtrStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NoPtrFor createNoPtrFor()
  {
    NoPtrForImpl noPtrFor = new NoPtrForImpl();
    return noPtrFor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NoPtrWhile createNoPtrWhile()
  {
    NoPtrWhileImpl noPtrWhile = new NoPtrWhileImpl();
    return noPtrWhile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NoPtrMudanca createNoPtrMudanca()
  {
    NoPtrMudancaImpl noPtrMudanca = new NoPtrMudancaImpl();
    return noPtrMudanca;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NoPtrExpression createNoPtrExpression()
  {
    NoPtrExpressionImpl noPtrExpression = new NoPtrExpressionImpl();
    return noPtrExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NoPtrTerminalExpression createNoPtrTerminalExpression()
  {
    NoPtrTerminalExpressionImpl noPtrTerminalExpression = new NoPtrTerminalExpressionImpl();
    return noPtrTerminalExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NoPtrSelect createNoPtrSelect()
  {
    NoPtrSelectImpl noPtrSelect = new NoPtrSelectImpl();
    return noPtrSelect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NoPtrCases createNoPtrCases()
  {
    NoPtrCasesImpl noPtrCases = new NoPtrCasesImpl();
    return noPtrCases;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarDecl createVarDecl()
  {
    VarDeclImpl varDecl = new VarDeclImpl();
    return varDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public simple_type_specifier createsimple_type_specifier()
  {
    simple_type_specifierImpl simple_type_specifier = new simple_type_specifierImpl();
    return simple_type_specifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public simple_declaration createsimple_declaration()
  {
    simple_declarationImpl simple_declaration = new simple_declarationImpl();
    return simple_declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Return createReturn()
  {
    ReturnImpl return_ = new ReturnImpl();
    return return_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReturnExpr createReturnExpr()
  {
    ReturnExprImpl returnExpr = new ReturnExprImpl();
    return returnExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public declaration_statement createdeclaration_statement()
  {
    declaration_statementImpl declaration_statement = new declaration_statementImpl();
    return declaration_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public block_declaration createblock_declaration()
  {
    block_declarationImpl block_declaration = new block_declarationImpl();
    return block_declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LKS createLKS()
  {
    LKSImpl lks = new LKSImpl();
    return lks;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Atomic createAtomic()
  {
    AtomicImpl atomic = new AtomicImpl();
    return atomic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefaultCase createDefaultCase()
  {
    DefaultCaseImpl defaultCase = new DefaultCaseImpl();
    return defaultCase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CaseNormal createCaseNormal()
  {
    CaseNormalImpl caseNormal = new CaseNormalImpl();
    return caseNormal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntType createIntType()
  {
    IntTypeImpl intType = new IntTypeImpl();
    return intType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanType createBooleanType()
  {
    BooleanTypeImpl booleanType = new BooleanTypeImpl();
    return booleanType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringType createStringType()
  {
    StringTypeImpl stringType = new StringTypeImpl();
    return stringType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnknownType createUnknownType()
  {
    UnknownTypeImpl unknownType = new UnknownTypeImpl();
    return unknownType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanhType createBooleanhType()
  {
    BooleanhTypeImpl booleanhType = new BooleanhTypeImpl();
    return booleanhType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringhType createStringhType()
  {
    StringhTypeImpl stringhType = new StringhTypeImpl();
    return stringhType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionType createFunctionType()
  {
    FunctionTypeImpl functionType = new FunctionTypeImpl();
    return functionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable createVariable()
  {
    VariableImpl variable = new VariableImpl();
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslPackage getMyDslPackage()
  {
    return (MyDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MyDslPackage getPackage()
  {
    return MyDslPackage.eINSTANCE;
  }

} //MyDslFactoryImpl
