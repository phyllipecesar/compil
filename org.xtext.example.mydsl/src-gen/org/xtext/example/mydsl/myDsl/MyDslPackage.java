/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.myDsl.MyDslFactory
 * @model kind="package"
 * @generated
 */
public interface MyDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "myDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/mydsl/MyDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "myDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyDslPackage eINSTANCE = org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ModelImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.BodyImpl <em>Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.BodyImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getBody()
   * @generated
   */
  int BODY = 1;

  /**
   * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY__DECLARATIONS = MODEL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_FEATURE_COUNT = MODEL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.DeclarationImpl <em>Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.DeclarationImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDeclaration()
   * @generated
   */
  int DECLARATION = 2;

  /**
   * The feature id for the '<em><b>Variaveis</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__VARIAVEIS = 0;

  /**
   * The feature id for the '<em><b>Ditry D</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__DITRY_D = 1;

  /**
   * The feature id for the '<em><b>Chamada</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__CHAMADA = 2;

  /**
   * The feature id for the '<em><b>Funcao</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__FUNCAO = 3;

  /**
   * The feature id for the '<em><b>Dirty E</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__DIRTY_E = 4;

  /**
   * The feature id for the '<em><b>Dirty A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__DIRTY_A = 5;

  /**
   * The feature id for the '<em><b>Dirty B</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__DIRTY_B = 6;

  /**
   * The feature id for the '<em><b>Dirty C</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__DIRTY_C = 7;

  /**
   * The feature id for the '<em><b>Dirty D</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__DIRTY_D = 8;

  /**
   * The feature id for the '<em><b>Dirty</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__DIRTY = 9;

  /**
   * The number of structural features of the '<em>Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION_FEATURE_COUNT = 10;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.NamespaceDefinitionImpl <em>Namespace Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.NamespaceDefinitionImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getNamespaceDefinition()
   * @generated
   */
  int NAMESPACE_DEFINITION = 3;

  /**
   * The feature id for the '<em><b>Dirty</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE_DEFINITION__DIRTY = 0;

  /**
   * The number of structural features of the '<em>Namespace Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE_DEFINITION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.LinkageSpecificationImpl <em>Linkage Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.LinkageSpecificationImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getLinkageSpecification()
   * @generated
   */
  int LINKAGE_SPECIFICATION = 4;

  /**
   * The number of structural features of the '<em>Linkage Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINKAGE_SPECIFICATION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.FunctionDeclarationImpl <em>Function Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.FunctionDeclarationImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getFunctionDeclaration()
   * @generated
   */
  int FUNCTION_DECLARATION = 5;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECLARATION__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECLARATION__NAME = 1;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECLARATION__PARAMS = 2;

  /**
   * The feature id for the '<em><b>Escopo</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECLARATION__ESCOPO = 3;

  /**
   * The number of structural features of the '<em>Function Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECLARATION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.FunctionChamadaImpl <em>Function Chamada</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.FunctionChamadaImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getFunctionChamada()
   * @generated
   */
  int FUNCTION_CHAMADA = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CHAMADA__NAME = 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CHAMADA__PARAMS = 1;

  /**
   * The number of structural features of the '<em>Function Chamada</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CHAMADA_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.NoPtrStatementImpl <em>No Ptr Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.NoPtrStatementImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getNoPtrStatement()
   * @generated
   */
  int NO_PTR_STATEMENT = 7;

  /**
   * The feature id for the '<em><b>Variaveis</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NO_PTR_STATEMENT__VARIAVEIS = 0;

  /**
   * The feature id for the '<em><b>Mudancas</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NO_PTR_STATEMENT__MUDANCAS = 1;

  /**
   * The feature id for the '<em><b>Lixo V</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NO_PTR_STATEMENT__LIXO_V = 2;

  /**
   * The feature id for the '<em><b>Switches</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NO_PTR_STATEMENT__SWITCHES = 3;

  /**
   * The feature id for the '<em><b>Dirty B</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NO_PTR_STATEMENT__DIRTY_B = 4;

  /**
   * The feature id for the '<em><b>Dirty</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NO_PTR_STATEMENT__DIRTY = 5;

  /**
   * The feature id for the '<em><b>Dirty V</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NO_PTR_STATEMENT__DIRTY_V = 6;

  /**
   * The number of structural features of the '<em>No Ptr Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NO_PTR_STATEMENT_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.NoPtrMudancaImpl <em>No Ptr Mudanca</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.NoPtrMudancaImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getNoPtrMudanca()
   * @generated
   */
  int NO_PTR_MUDANCA = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NO_PTR_MUDANCA__NAME = 0;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NO_PTR_MUDANCA__EXPR = 1;

  /**
   * The number of structural features of the '<em>No Ptr Mudanca</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NO_PTR_MUDANCA_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.NoPtrExpressionImpl <em>No Ptr Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.NoPtrExpressionImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getNoPtrExpression()
   * @generated
   */
  int NO_PTR_EXPRESSION = 9;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NO_PTR_EXPRESSION__LEFT = 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NO_PTR_EXPRESSION__OP = 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NO_PTR_EXPRESSION__RIGHT = 2;

  /**
   * The number of structural features of the '<em>No Ptr Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NO_PTR_EXPRESSION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.NoPtrTerminalExpressionImpl <em>No Ptr Terminal Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.NoPtrTerminalExpressionImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getNoPtrTerminalExpression()
   * @generated
   */
  int NO_PTR_TERMINAL_EXPRESSION = 10;

  /**
   * The feature id for the '<em><b>Inside</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NO_PTR_TERMINAL_EXPRESSION__INSIDE = 0;

  /**
   * The number of structural features of the '<em>No Ptr Terminal Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NO_PTR_TERMINAL_EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.NoPtrSelectImpl <em>No Ptr Select</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.NoPtrSelectImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getNoPtrSelect()
   * @generated
   */
  int NO_PTR_SELECT = 11;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NO_PTR_SELECT__EXPR = 0;

  /**
   * The feature id for the '<em><b>Cases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NO_PTR_SELECT__CASES = 1;

  /**
   * The number of structural features of the '<em>No Ptr Select</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NO_PTR_SELECT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.NoPtrCasesImpl <em>No Ptr Cases</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.NoPtrCasesImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getNoPtrCases()
   * @generated
   */
  int NO_PTR_CASES = 12;

  /**
   * The number of structural features of the '<em>No Ptr Cases</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NO_PTR_CASES_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ParameterImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 13;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__NAME = 1;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__EXPR = 2;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.VarDeclImpl <em>Var Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.VarDeclImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getVarDecl()
   * @generated
   */
  int VAR_DECL = 14;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECL__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECL__NAME = 1;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECL__EXPR = 2;

  /**
   * The number of structural features of the '<em>Var Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.TypeImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getType()
   * @generated
   */
  int TYPE = 15;

  /**
   * The feature id for the '<em><b>Sts</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__STS = 0;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.simple_type_specifierImpl <em>simple type specifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.simple_type_specifierImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getsimple_type_specifier()
   * @generated
   */
  int SIMPLE_TYPE_SPECIFIER = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_TYPE_SPECIFIER__NAME = 0;

  /**
   * The number of structural features of the '<em>simple type specifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_TYPE_SPECIFIER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.simple_declarationImpl <em>simple declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.simple_declarationImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getsimple_declaration()
   * @generated
   */
  int SIMPLE_DECLARATION = 17;

  /**
   * The feature id for the '<em><b>Variavel</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_DECLARATION__VARIAVEL = 0;

  /**
   * The number of structural features of the '<em>simple declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_DECLARATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ReturnImpl <em>Return</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ReturnImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getReturn()
   * @generated
   */
  int RETURN = 18;

  /**
   * The feature id for the '<em><b>Rettype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN__RETTYPE = 0;

  /**
   * The number of structural features of the '<em>Return</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ReturnExprImpl <em>Return Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ReturnExprImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getReturnExpr()
   * @generated
   */
  int RETURN_EXPR = 19;

  /**
   * The number of structural features of the '<em>Return Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_EXPR_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.declaration_statementImpl <em>declaration statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.declaration_statementImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getdeclaration_statement()
   * @generated
   */
  int DECLARATION_STATEMENT = 20;

  /**
   * The feature id for the '<em><b>Variaveis</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION_STATEMENT__VARIAVEIS = 0;

  /**
   * The number of structural features of the '<em>declaration statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION_STATEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.block_declarationImpl <em>block declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.block_declarationImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getblock_declaration()
   * @generated
   */
  int BLOCK_DECLARATION = 21;

  /**
   * The feature id for the '<em><b>Variavel</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_DECLARATION__VARIAVEL = 0;

  /**
   * The number of structural features of the '<em>block declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_DECLARATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.LKSImpl <em>LKS</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.LKSImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getLKS()
   * @generated
   */
  int LKS = 22;

  /**
   * The feature id for the '<em><b>Dirty</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LKS__DIRTY = LINKAGE_SPECIFICATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>LKS</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LKS_FEATURE_COUNT = LINKAGE_SPECIFICATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.AtomicImpl <em>Atomic</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.AtomicImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getAtomic()
   * @generated
   */
  int ATOMIC = 23;

  /**
   * The feature id for the '<em><b>Inside</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC__INSIDE = NO_PTR_TERMINAL_EXPRESSION__INSIDE;

  /**
   * The feature id for the '<em><b>Atomic</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC__ATOMIC = NO_PTR_TERMINAL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Atomic</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_FEATURE_COUNT = NO_PTR_TERMINAL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.DefaultCaseImpl <em>Default Case</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.DefaultCaseImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDefaultCase()
   * @generated
   */
  int DEFAULT_CASE = 24;

  /**
   * The number of structural features of the '<em>Default Case</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_CASE_FEATURE_COUNT = NO_PTR_CASES_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.CaseNormalImpl <em>Case Normal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.CaseNormalImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getCaseNormal()
   * @generated
   */
  int CASE_NORMAL = 25;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_NORMAL__EXPR = NO_PTR_CASES_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Case Normal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_NORMAL_FEATURE_COUNT = NO_PTR_CASES_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.IntTypeImpl <em>Int Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.IntTypeImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getIntType()
   * @generated
   */
  int INT_TYPE = 26;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_TYPE__NAME = SIMPLE_TYPE_SPECIFIER__NAME;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_TYPE__VALUE = SIMPLE_TYPE_SPECIFIER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Int Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_TYPE_FEATURE_COUNT = SIMPLE_TYPE_SPECIFIER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.BooleanTypeImpl <em>Boolean Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.BooleanTypeImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getBooleanType()
   * @generated
   */
  int BOOLEAN_TYPE = 27;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_TYPE__NAME = SIMPLE_TYPE_SPECIFIER__NAME;

  /**
   * The number of structural features of the '<em>Boolean Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_TYPE_FEATURE_COUNT = SIMPLE_TYPE_SPECIFIER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.StringTypeImpl <em>String Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.StringTypeImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getStringType()
   * @generated
   */
  int STRING_TYPE = 28;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_TYPE__NAME = SIMPLE_TYPE_SPECIFIER__NAME;

  /**
   * The number of structural features of the '<em>String Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_TYPE_FEATURE_COUNT = SIMPLE_TYPE_SPECIFIER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.UnknownTypeImpl <em>Unknown Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.UnknownTypeImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getUnknownType()
   * @generated
   */
  int UNKNOWN_TYPE = 29;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNKNOWN_TYPE__NAME = SIMPLE_TYPE_SPECIFIER__NAME;

  /**
   * The number of structural features of the '<em>Unknown Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNKNOWN_TYPE_FEATURE_COUNT = SIMPLE_TYPE_SPECIFIER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.BooleanhTypeImpl <em>Booleanh Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.BooleanhTypeImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getBooleanhType()
   * @generated
   */
  int BOOLEANH_TYPE = 30;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEANH_TYPE__VALUE = RETURN_EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Booleanh Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEANH_TYPE_FEATURE_COUNT = RETURN_EXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.StringhTypeImpl <em>Stringh Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.StringhTypeImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getStringhType()
   * @generated
   */
  int STRINGH_TYPE = 31;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRINGH_TYPE__VALUE = RETURN_EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Stringh Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRINGH_TYPE_FEATURE_COUNT = RETURN_EXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.FunctionTypeImpl <em>Function Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.FunctionTypeImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getFunctionType()
   * @generated
   */
  int FUNCTION_TYPE = 32;

  /**
   * The feature id for the '<em><b>Call</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_TYPE__CALL = RETURN_EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Function Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_TYPE_FEATURE_COUNT = RETURN_EXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.VariableImpl <em>Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.VariableImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getVariable()
   * @generated
   */
  int VARIABLE = 33;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__NAME = RETURN_EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__EXPR = RETURN_EXPR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_FEATURE_COUNT = RETURN_EXPR_FEATURE_COUNT + 2;


  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.xtext.example.mydsl.myDsl.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Body <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Body</em>'.
   * @see org.xtext.example.mydsl.myDsl.Body
   * @generated
   */
  EClass getBody();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Body#getDeclarations <em>Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Declarations</em>'.
   * @see org.xtext.example.mydsl.myDsl.Body#getDeclarations()
   * @see #getBody()
   * @generated
   */
  EReference getBody_Declarations();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Declaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Declaration</em>'.
   * @see org.xtext.example.mydsl.myDsl.Declaration
   * @generated
   */
  EClass getDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Declaration#getVariaveis <em>Variaveis</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variaveis</em>'.
   * @see org.xtext.example.mydsl.myDsl.Declaration#getVariaveis()
   * @see #getDeclaration()
   * @generated
   */
  EReference getDeclaration_Variaveis();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Declaration#getDitryD <em>Ditry D</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ditry D</em>'.
   * @see org.xtext.example.mydsl.myDsl.Declaration#getDitryD()
   * @see #getDeclaration()
   * @generated
   */
  EReference getDeclaration_DitryD();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Declaration#getChamada <em>Chamada</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Chamada</em>'.
   * @see org.xtext.example.mydsl.myDsl.Declaration#getChamada()
   * @see #getDeclaration()
   * @generated
   */
  EReference getDeclaration_Chamada();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Declaration#getFuncao <em>Funcao</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Funcao</em>'.
   * @see org.xtext.example.mydsl.myDsl.Declaration#getFuncao()
   * @see #getDeclaration()
   * @generated
   */
  EReference getDeclaration_Funcao();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Declaration#getDirtyE <em>Dirty E</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dirty E</em>'.
   * @see org.xtext.example.mydsl.myDsl.Declaration#getDirtyE()
   * @see #getDeclaration()
   * @generated
   */
  EAttribute getDeclaration_DirtyE();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Declaration#getDirtyA <em>Dirty A</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dirty A</em>'.
   * @see org.xtext.example.mydsl.myDsl.Declaration#getDirtyA()
   * @see #getDeclaration()
   * @generated
   */
  EAttribute getDeclaration_DirtyA();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Declaration#getDirtyB <em>Dirty B</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dirty B</em>'.
   * @see org.xtext.example.mydsl.myDsl.Declaration#getDirtyB()
   * @see #getDeclaration()
   * @generated
   */
  EAttribute getDeclaration_DirtyB();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Declaration#getDirtyC <em>Dirty C</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dirty C</em>'.
   * @see org.xtext.example.mydsl.myDsl.Declaration#getDirtyC()
   * @see #getDeclaration()
   * @generated
   */
  EAttribute getDeclaration_DirtyC();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Declaration#getDirtyD <em>Dirty D</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dirty D</em>'.
   * @see org.xtext.example.mydsl.myDsl.Declaration#getDirtyD()
   * @see #getDeclaration()
   * @generated
   */
  EAttribute getDeclaration_DirtyD();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Declaration#getDirty <em>Dirty</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dirty</em>'.
   * @see org.xtext.example.mydsl.myDsl.Declaration#getDirty()
   * @see #getDeclaration()
   * @generated
   */
  EReference getDeclaration_Dirty();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.NamespaceDefinition <em>Namespace Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Namespace Definition</em>'.
   * @see org.xtext.example.mydsl.myDsl.NamespaceDefinition
   * @generated
   */
  EClass getNamespaceDefinition();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.NamespaceDefinition#getDirty <em>Dirty</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dirty</em>'.
   * @see org.xtext.example.mydsl.myDsl.NamespaceDefinition#getDirty()
   * @see #getNamespaceDefinition()
   * @generated
   */
  EReference getNamespaceDefinition_Dirty();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.LinkageSpecification <em>Linkage Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Linkage Specification</em>'.
   * @see org.xtext.example.mydsl.myDsl.LinkageSpecification
   * @generated
   */
  EClass getLinkageSpecification();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.FunctionDeclaration <em>Function Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Declaration</em>'.
   * @see org.xtext.example.mydsl.myDsl.FunctionDeclaration
   * @generated
   */
  EClass getFunctionDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.FunctionDeclaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.FunctionDeclaration#getType()
   * @see #getFunctionDeclaration()
   * @generated
   */
  EReference getFunctionDeclaration_Type();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.FunctionDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.FunctionDeclaration#getName()
   * @see #getFunctionDeclaration()
   * @generated
   */
  EAttribute getFunctionDeclaration_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.FunctionDeclaration#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see org.xtext.example.mydsl.myDsl.FunctionDeclaration#getParams()
   * @see #getFunctionDeclaration()
   * @generated
   */
  EReference getFunctionDeclaration_Params();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.FunctionDeclaration#getEscopo <em>Escopo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Escopo</em>'.
   * @see org.xtext.example.mydsl.myDsl.FunctionDeclaration#getEscopo()
   * @see #getFunctionDeclaration()
   * @generated
   */
  EReference getFunctionDeclaration_Escopo();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.FunctionChamada <em>Function Chamada</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Chamada</em>'.
   * @see org.xtext.example.mydsl.myDsl.FunctionChamada
   * @generated
   */
  EClass getFunctionChamada();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.FunctionChamada#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.FunctionChamada#getName()
   * @see #getFunctionChamada()
   * @generated
   */
  EAttribute getFunctionChamada_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.FunctionChamada#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see org.xtext.example.mydsl.myDsl.FunctionChamada#getParams()
   * @see #getFunctionChamada()
   * @generated
   */
  EReference getFunctionChamada_Params();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.NoPtrStatement <em>No Ptr Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>No Ptr Statement</em>'.
   * @see org.xtext.example.mydsl.myDsl.NoPtrStatement
   * @generated
   */
  EClass getNoPtrStatement();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.NoPtrStatement#getVariaveis <em>Variaveis</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variaveis</em>'.
   * @see org.xtext.example.mydsl.myDsl.NoPtrStatement#getVariaveis()
   * @see #getNoPtrStatement()
   * @generated
   */
  EReference getNoPtrStatement_Variaveis();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.NoPtrStatement#getMudancas <em>Mudancas</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mudancas</em>'.
   * @see org.xtext.example.mydsl.myDsl.NoPtrStatement#getMudancas()
   * @see #getNoPtrStatement()
   * @generated
   */
  EReference getNoPtrStatement_Mudancas();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.NoPtrStatement#getLixoV <em>Lixo V</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Lixo V</em>'.
   * @see org.xtext.example.mydsl.myDsl.NoPtrStatement#getLixoV()
   * @see #getNoPtrStatement()
   * @generated
   */
  EReference getNoPtrStatement_LixoV();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.NoPtrStatement#getSwitches <em>Switches</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Switches</em>'.
   * @see org.xtext.example.mydsl.myDsl.NoPtrStatement#getSwitches()
   * @see #getNoPtrStatement()
   * @generated
   */
  EReference getNoPtrStatement_Switches();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.NoPtrStatement#getDirtyB <em>Dirty B</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dirty B</em>'.
   * @see org.xtext.example.mydsl.myDsl.NoPtrStatement#getDirtyB()
   * @see #getNoPtrStatement()
   * @generated
   */
  EReference getNoPtrStatement_DirtyB();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.mydsl.myDsl.NoPtrStatement#getDirty <em>Dirty</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Dirty</em>'.
   * @see org.xtext.example.mydsl.myDsl.NoPtrStatement#getDirty()
   * @see #getNoPtrStatement()
   * @generated
   */
  EAttribute getNoPtrStatement_Dirty();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.NoPtrStatement#getDirtyV <em>Dirty V</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dirty V</em>'.
   * @see org.xtext.example.mydsl.myDsl.NoPtrStatement#getDirtyV()
   * @see #getNoPtrStatement()
   * @generated
   */
  EReference getNoPtrStatement_DirtyV();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.NoPtrMudanca <em>No Ptr Mudanca</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>No Ptr Mudanca</em>'.
   * @see org.xtext.example.mydsl.myDsl.NoPtrMudanca
   * @generated
   */
  EClass getNoPtrMudanca();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.NoPtrMudanca#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.NoPtrMudanca#getName()
   * @see #getNoPtrMudanca()
   * @generated
   */
  EAttribute getNoPtrMudanca_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.NoPtrMudanca#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.xtext.example.mydsl.myDsl.NoPtrMudanca#getExpr()
   * @see #getNoPtrMudanca()
   * @generated
   */
  EReference getNoPtrMudanca_Expr();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.NoPtrExpression <em>No Ptr Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>No Ptr Expression</em>'.
   * @see org.xtext.example.mydsl.myDsl.NoPtrExpression
   * @generated
   */
  EClass getNoPtrExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.NoPtrExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.example.mydsl.myDsl.NoPtrExpression#getLeft()
   * @see #getNoPtrExpression()
   * @generated
   */
  EReference getNoPtrExpression_Left();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.NoPtrExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.xtext.example.mydsl.myDsl.NoPtrExpression#getOp()
   * @see #getNoPtrExpression()
   * @generated
   */
  EAttribute getNoPtrExpression_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.NoPtrExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.example.mydsl.myDsl.NoPtrExpression#getRight()
   * @see #getNoPtrExpression()
   * @generated
   */
  EReference getNoPtrExpression_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.NoPtrTerminalExpression <em>No Ptr Terminal Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>No Ptr Terminal Expression</em>'.
   * @see org.xtext.example.mydsl.myDsl.NoPtrTerminalExpression
   * @generated
   */
  EClass getNoPtrTerminalExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.NoPtrTerminalExpression#getInside <em>Inside</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Inside</em>'.
   * @see org.xtext.example.mydsl.myDsl.NoPtrTerminalExpression#getInside()
   * @see #getNoPtrTerminalExpression()
   * @generated
   */
  EReference getNoPtrTerminalExpression_Inside();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.NoPtrSelect <em>No Ptr Select</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>No Ptr Select</em>'.
   * @see org.xtext.example.mydsl.myDsl.NoPtrSelect
   * @generated
   */
  EClass getNoPtrSelect();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.NoPtrSelect#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.xtext.example.mydsl.myDsl.NoPtrSelect#getExpr()
   * @see #getNoPtrSelect()
   * @generated
   */
  EReference getNoPtrSelect_Expr();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.NoPtrSelect#getCases <em>Cases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cases</em>'.
   * @see org.xtext.example.mydsl.myDsl.NoPtrSelect#getCases()
   * @see #getNoPtrSelect()
   * @generated
   */
  EReference getNoPtrSelect_Cases();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.NoPtrCases <em>No Ptr Cases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>No Ptr Cases</em>'.
   * @see org.xtext.example.mydsl.myDsl.NoPtrCases
   * @generated
   */
  EClass getNoPtrCases();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see org.xtext.example.mydsl.myDsl.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Parameter#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.Parameter#getType()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_Type();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Parameter#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Parameter#getName()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Parameter#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.xtext.example.mydsl.myDsl.Parameter#getExpr()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_Expr();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.VarDecl <em>Var Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Var Decl</em>'.
   * @see org.xtext.example.mydsl.myDsl.VarDecl
   * @generated
   */
  EClass getVarDecl();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.VarDecl#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.VarDecl#getType()
   * @see #getVarDecl()
   * @generated
   */
  EReference getVarDecl_Type();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.VarDecl#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.VarDecl#getName()
   * @see #getVarDecl()
   * @generated
   */
  EAttribute getVarDecl_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.VarDecl#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.xtext.example.mydsl.myDsl.VarDecl#getExpr()
   * @see #getVarDecl()
   * @generated
   */
  EReference getVarDecl_Expr();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Type#getSts <em>Sts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sts</em>'.
   * @see org.xtext.example.mydsl.myDsl.Type#getSts()
   * @see #getType()
   * @generated
   */
  EReference getType_Sts();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.simple_type_specifier <em>simple type specifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>simple type specifier</em>'.
   * @see org.xtext.example.mydsl.myDsl.simple_type_specifier
   * @generated
   */
  EClass getsimple_type_specifier();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.simple_type_specifier#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.simple_type_specifier#getName()
   * @see #getsimple_type_specifier()
   * @generated
   */
  EAttribute getsimple_type_specifier_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.simple_declaration <em>simple declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>simple declaration</em>'.
   * @see org.xtext.example.mydsl.myDsl.simple_declaration
   * @generated
   */
  EClass getsimple_declaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.simple_declaration#getVariavel <em>Variavel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variavel</em>'.
   * @see org.xtext.example.mydsl.myDsl.simple_declaration#getVariavel()
   * @see #getsimple_declaration()
   * @generated
   */
  EReference getsimple_declaration_Variavel();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Return <em>Return</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Return</em>'.
   * @see org.xtext.example.mydsl.myDsl.Return
   * @generated
   */
  EClass getReturn();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Return#getRettype <em>Rettype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rettype</em>'.
   * @see org.xtext.example.mydsl.myDsl.Return#getRettype()
   * @see #getReturn()
   * @generated
   */
  EReference getReturn_Rettype();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.ReturnExpr <em>Return Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Return Expr</em>'.
   * @see org.xtext.example.mydsl.myDsl.ReturnExpr
   * @generated
   */
  EClass getReturnExpr();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.declaration_statement <em>declaration statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>declaration statement</em>'.
   * @see org.xtext.example.mydsl.myDsl.declaration_statement
   * @generated
   */
  EClass getdeclaration_statement();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.declaration_statement#getVariaveis <em>Variaveis</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variaveis</em>'.
   * @see org.xtext.example.mydsl.myDsl.declaration_statement#getVariaveis()
   * @see #getdeclaration_statement()
   * @generated
   */
  EReference getdeclaration_statement_Variaveis();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.block_declaration <em>block declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>block declaration</em>'.
   * @see org.xtext.example.mydsl.myDsl.block_declaration
   * @generated
   */
  EClass getblock_declaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.block_declaration#getVariavel <em>Variavel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variavel</em>'.
   * @see org.xtext.example.mydsl.myDsl.block_declaration#getVariavel()
   * @see #getblock_declaration()
   * @generated
   */
  EReference getblock_declaration_Variavel();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.LKS <em>LKS</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LKS</em>'.
   * @see org.xtext.example.mydsl.myDsl.LKS
   * @generated
   */
  EClass getLKS();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.LKS#getDirty <em>Dirty</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dirty</em>'.
   * @see org.xtext.example.mydsl.myDsl.LKS#getDirty()
   * @see #getLKS()
   * @generated
   */
  EReference getLKS_Dirty();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Atomic <em>Atomic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Atomic</em>'.
   * @see org.xtext.example.mydsl.myDsl.Atomic
   * @generated
   */
  EClass getAtomic();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Atomic#getAtomic <em>Atomic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Atomic</em>'.
   * @see org.xtext.example.mydsl.myDsl.Atomic#getAtomic()
   * @see #getAtomic()
   * @generated
   */
  EReference getAtomic_Atomic();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.DefaultCase <em>Default Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Default Case</em>'.
   * @see org.xtext.example.mydsl.myDsl.DefaultCase
   * @generated
   */
  EClass getDefaultCase();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.CaseNormal <em>Case Normal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Case Normal</em>'.
   * @see org.xtext.example.mydsl.myDsl.CaseNormal
   * @generated
   */
  EClass getCaseNormal();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.CaseNormal#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.xtext.example.mydsl.myDsl.CaseNormal#getExpr()
   * @see #getCaseNormal()
   * @generated
   */
  EReference getCaseNormal_Expr();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.IntType <em>Int Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.IntType
   * @generated
   */
  EClass getIntType();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.IntType#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.example.mydsl.myDsl.IntType#getValue()
   * @see #getIntType()
   * @generated
   */
  EAttribute getIntType_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.BooleanType <em>Boolean Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.BooleanType
   * @generated
   */
  EClass getBooleanType();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.StringType <em>String Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.StringType
   * @generated
   */
  EClass getStringType();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.UnknownType <em>Unknown Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unknown Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.UnknownType
   * @generated
   */
  EClass getUnknownType();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.BooleanhType <em>Booleanh Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Booleanh Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.BooleanhType
   * @generated
   */
  EClass getBooleanhType();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.BooleanhType#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.example.mydsl.myDsl.BooleanhType#getValue()
   * @see #getBooleanhType()
   * @generated
   */
  EAttribute getBooleanhType_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.StringhType <em>Stringh Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Stringh Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.StringhType
   * @generated
   */
  EClass getStringhType();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.StringhType#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.example.mydsl.myDsl.StringhType#getValue()
   * @see #getStringhType()
   * @generated
   */
  EAttribute getStringhType_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.FunctionType <em>Function Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.FunctionType
   * @generated
   */
  EClass getFunctionType();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.FunctionType#getCall <em>Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Call</em>'.
   * @see org.xtext.example.mydsl.myDsl.FunctionType#getCall()
   * @see #getFunctionType()
   * @generated
   */
  EReference getFunctionType_Call();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable</em>'.
   * @see org.xtext.example.mydsl.myDsl.Variable
   * @generated
   */
  EClass getVariable();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Variable#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Variable#getName()
   * @see #getVariable()
   * @generated
   */
  EAttribute getVariable_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Variable#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.xtext.example.mydsl.myDsl.Variable#getExpr()
   * @see #getVariable()
   * @generated
   */
  EReference getVariable_Expr();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MyDslFactory getMyDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ModelImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.BodyImpl <em>Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.BodyImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getBody()
     * @generated
     */
    EClass BODY = eINSTANCE.getBody();

    /**
     * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BODY__DECLARATIONS = eINSTANCE.getBody_Declarations();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.DeclarationImpl <em>Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.DeclarationImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDeclaration()
     * @generated
     */
    EClass DECLARATION = eINSTANCE.getDeclaration();

    /**
     * The meta object literal for the '<em><b>Variaveis</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECLARATION__VARIAVEIS = eINSTANCE.getDeclaration_Variaveis();

    /**
     * The meta object literal for the '<em><b>Ditry D</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECLARATION__DITRY_D = eINSTANCE.getDeclaration_DitryD();

    /**
     * The meta object literal for the '<em><b>Chamada</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECLARATION__CHAMADA = eINSTANCE.getDeclaration_Chamada();

    /**
     * The meta object literal for the '<em><b>Funcao</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECLARATION__FUNCAO = eINSTANCE.getDeclaration_Funcao();

    /**
     * The meta object literal for the '<em><b>Dirty E</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECLARATION__DIRTY_E = eINSTANCE.getDeclaration_DirtyE();

    /**
     * The meta object literal for the '<em><b>Dirty A</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECLARATION__DIRTY_A = eINSTANCE.getDeclaration_DirtyA();

    /**
     * The meta object literal for the '<em><b>Dirty B</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECLARATION__DIRTY_B = eINSTANCE.getDeclaration_DirtyB();

    /**
     * The meta object literal for the '<em><b>Dirty C</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECLARATION__DIRTY_C = eINSTANCE.getDeclaration_DirtyC();

    /**
     * The meta object literal for the '<em><b>Dirty D</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECLARATION__DIRTY_D = eINSTANCE.getDeclaration_DirtyD();

    /**
     * The meta object literal for the '<em><b>Dirty</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECLARATION__DIRTY = eINSTANCE.getDeclaration_Dirty();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.NamespaceDefinitionImpl <em>Namespace Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.NamespaceDefinitionImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getNamespaceDefinition()
     * @generated
     */
    EClass NAMESPACE_DEFINITION = eINSTANCE.getNamespaceDefinition();

    /**
     * The meta object literal for the '<em><b>Dirty</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAMESPACE_DEFINITION__DIRTY = eINSTANCE.getNamespaceDefinition_Dirty();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.LinkageSpecificationImpl <em>Linkage Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.LinkageSpecificationImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getLinkageSpecification()
     * @generated
     */
    EClass LINKAGE_SPECIFICATION = eINSTANCE.getLinkageSpecification();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.FunctionDeclarationImpl <em>Function Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.FunctionDeclarationImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getFunctionDeclaration()
     * @generated
     */
    EClass FUNCTION_DECLARATION = eINSTANCE.getFunctionDeclaration();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_DECLARATION__TYPE = eINSTANCE.getFunctionDeclaration_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_DECLARATION__NAME = eINSTANCE.getFunctionDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_DECLARATION__PARAMS = eINSTANCE.getFunctionDeclaration_Params();

    /**
     * The meta object literal for the '<em><b>Escopo</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_DECLARATION__ESCOPO = eINSTANCE.getFunctionDeclaration_Escopo();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.FunctionChamadaImpl <em>Function Chamada</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.FunctionChamadaImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getFunctionChamada()
     * @generated
     */
    EClass FUNCTION_CHAMADA = eINSTANCE.getFunctionChamada();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_CHAMADA__NAME = eINSTANCE.getFunctionChamada_Name();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_CHAMADA__PARAMS = eINSTANCE.getFunctionChamada_Params();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.NoPtrStatementImpl <em>No Ptr Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.NoPtrStatementImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getNoPtrStatement()
     * @generated
     */
    EClass NO_PTR_STATEMENT = eINSTANCE.getNoPtrStatement();

    /**
     * The meta object literal for the '<em><b>Variaveis</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NO_PTR_STATEMENT__VARIAVEIS = eINSTANCE.getNoPtrStatement_Variaveis();

    /**
     * The meta object literal for the '<em><b>Mudancas</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NO_PTR_STATEMENT__MUDANCAS = eINSTANCE.getNoPtrStatement_Mudancas();

    /**
     * The meta object literal for the '<em><b>Lixo V</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NO_PTR_STATEMENT__LIXO_V = eINSTANCE.getNoPtrStatement_LixoV();

    /**
     * The meta object literal for the '<em><b>Switches</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NO_PTR_STATEMENT__SWITCHES = eINSTANCE.getNoPtrStatement_Switches();

    /**
     * The meta object literal for the '<em><b>Dirty B</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NO_PTR_STATEMENT__DIRTY_B = eINSTANCE.getNoPtrStatement_DirtyB();

    /**
     * The meta object literal for the '<em><b>Dirty</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NO_PTR_STATEMENT__DIRTY = eINSTANCE.getNoPtrStatement_Dirty();

    /**
     * The meta object literal for the '<em><b>Dirty V</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NO_PTR_STATEMENT__DIRTY_V = eINSTANCE.getNoPtrStatement_DirtyV();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.NoPtrMudancaImpl <em>No Ptr Mudanca</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.NoPtrMudancaImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getNoPtrMudanca()
     * @generated
     */
    EClass NO_PTR_MUDANCA = eINSTANCE.getNoPtrMudanca();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NO_PTR_MUDANCA__NAME = eINSTANCE.getNoPtrMudanca_Name();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NO_PTR_MUDANCA__EXPR = eINSTANCE.getNoPtrMudanca_Expr();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.NoPtrExpressionImpl <em>No Ptr Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.NoPtrExpressionImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getNoPtrExpression()
     * @generated
     */
    EClass NO_PTR_EXPRESSION = eINSTANCE.getNoPtrExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NO_PTR_EXPRESSION__LEFT = eINSTANCE.getNoPtrExpression_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NO_PTR_EXPRESSION__OP = eINSTANCE.getNoPtrExpression_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NO_PTR_EXPRESSION__RIGHT = eINSTANCE.getNoPtrExpression_Right();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.NoPtrTerminalExpressionImpl <em>No Ptr Terminal Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.NoPtrTerminalExpressionImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getNoPtrTerminalExpression()
     * @generated
     */
    EClass NO_PTR_TERMINAL_EXPRESSION = eINSTANCE.getNoPtrTerminalExpression();

    /**
     * The meta object literal for the '<em><b>Inside</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NO_PTR_TERMINAL_EXPRESSION__INSIDE = eINSTANCE.getNoPtrTerminalExpression_Inside();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.NoPtrSelectImpl <em>No Ptr Select</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.NoPtrSelectImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getNoPtrSelect()
     * @generated
     */
    EClass NO_PTR_SELECT = eINSTANCE.getNoPtrSelect();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NO_PTR_SELECT__EXPR = eINSTANCE.getNoPtrSelect_Expr();

    /**
     * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NO_PTR_SELECT__CASES = eINSTANCE.getNoPtrSelect_Cases();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.NoPtrCasesImpl <em>No Ptr Cases</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.NoPtrCasesImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getNoPtrCases()
     * @generated
     */
    EClass NO_PTR_CASES = eINSTANCE.getNoPtrCases();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ParameterImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getParameter()
     * @generated
     */
    EClass PARAMETER = eINSTANCE.getParameter();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__TYPE = eINSTANCE.getParameter_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__EXPR = eINSTANCE.getParameter_Expr();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.VarDeclImpl <em>Var Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.VarDeclImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getVarDecl()
     * @generated
     */
    EClass VAR_DECL = eINSTANCE.getVarDecl();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VAR_DECL__TYPE = eINSTANCE.getVarDecl_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VAR_DECL__NAME = eINSTANCE.getVarDecl_Name();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VAR_DECL__EXPR = eINSTANCE.getVarDecl_Expr();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.TypeImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '<em><b>Sts</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE__STS = eINSTANCE.getType_Sts();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.simple_type_specifierImpl <em>simple type specifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.simple_type_specifierImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getsimple_type_specifier()
     * @generated
     */
    EClass SIMPLE_TYPE_SPECIFIER = eINSTANCE.getsimple_type_specifier();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_TYPE_SPECIFIER__NAME = eINSTANCE.getsimple_type_specifier_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.simple_declarationImpl <em>simple declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.simple_declarationImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getsimple_declaration()
     * @generated
     */
    EClass SIMPLE_DECLARATION = eINSTANCE.getsimple_declaration();

    /**
     * The meta object literal for the '<em><b>Variavel</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_DECLARATION__VARIAVEL = eINSTANCE.getsimple_declaration_Variavel();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ReturnImpl <em>Return</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ReturnImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getReturn()
     * @generated
     */
    EClass RETURN = eINSTANCE.getReturn();

    /**
     * The meta object literal for the '<em><b>Rettype</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RETURN__RETTYPE = eINSTANCE.getReturn_Rettype();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ReturnExprImpl <em>Return Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ReturnExprImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getReturnExpr()
     * @generated
     */
    EClass RETURN_EXPR = eINSTANCE.getReturnExpr();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.declaration_statementImpl <em>declaration statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.declaration_statementImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getdeclaration_statement()
     * @generated
     */
    EClass DECLARATION_STATEMENT = eINSTANCE.getdeclaration_statement();

    /**
     * The meta object literal for the '<em><b>Variaveis</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECLARATION_STATEMENT__VARIAVEIS = eINSTANCE.getdeclaration_statement_Variaveis();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.block_declarationImpl <em>block declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.block_declarationImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getblock_declaration()
     * @generated
     */
    EClass BLOCK_DECLARATION = eINSTANCE.getblock_declaration();

    /**
     * The meta object literal for the '<em><b>Variavel</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BLOCK_DECLARATION__VARIAVEL = eINSTANCE.getblock_declaration_Variavel();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.LKSImpl <em>LKS</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.LKSImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getLKS()
     * @generated
     */
    EClass LKS = eINSTANCE.getLKS();

    /**
     * The meta object literal for the '<em><b>Dirty</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LKS__DIRTY = eINSTANCE.getLKS_Dirty();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.AtomicImpl <em>Atomic</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.AtomicImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getAtomic()
     * @generated
     */
    EClass ATOMIC = eINSTANCE.getAtomic();

    /**
     * The meta object literal for the '<em><b>Atomic</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATOMIC__ATOMIC = eINSTANCE.getAtomic_Atomic();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.DefaultCaseImpl <em>Default Case</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.DefaultCaseImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDefaultCase()
     * @generated
     */
    EClass DEFAULT_CASE = eINSTANCE.getDefaultCase();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.CaseNormalImpl <em>Case Normal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.CaseNormalImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getCaseNormal()
     * @generated
     */
    EClass CASE_NORMAL = eINSTANCE.getCaseNormal();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASE_NORMAL__EXPR = eINSTANCE.getCaseNormal_Expr();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.IntTypeImpl <em>Int Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.IntTypeImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getIntType()
     * @generated
     */
    EClass INT_TYPE = eINSTANCE.getIntType();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INT_TYPE__VALUE = eINSTANCE.getIntType_Value();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.BooleanTypeImpl <em>Boolean Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.BooleanTypeImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getBooleanType()
     * @generated
     */
    EClass BOOLEAN_TYPE = eINSTANCE.getBooleanType();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.StringTypeImpl <em>String Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.StringTypeImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getStringType()
     * @generated
     */
    EClass STRING_TYPE = eINSTANCE.getStringType();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.UnknownTypeImpl <em>Unknown Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.UnknownTypeImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getUnknownType()
     * @generated
     */
    EClass UNKNOWN_TYPE = eINSTANCE.getUnknownType();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.BooleanhTypeImpl <em>Booleanh Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.BooleanhTypeImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getBooleanhType()
     * @generated
     */
    EClass BOOLEANH_TYPE = eINSTANCE.getBooleanhType();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEANH_TYPE__VALUE = eINSTANCE.getBooleanhType_Value();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.StringhTypeImpl <em>Stringh Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.StringhTypeImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getStringhType()
     * @generated
     */
    EClass STRINGH_TYPE = eINSTANCE.getStringhType();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRINGH_TYPE__VALUE = eINSTANCE.getStringhType_Value();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.FunctionTypeImpl <em>Function Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.FunctionTypeImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getFunctionType()
     * @generated
     */
    EClass FUNCTION_TYPE = eINSTANCE.getFunctionType();

    /**
     * The meta object literal for the '<em><b>Call</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_TYPE__CALL = eINSTANCE.getFunctionType_Call();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.VariableImpl <em>Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.VariableImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getVariable()
     * @generated
     */
    EClass VARIABLE = eINSTANCE.getVariable();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE__EXPR = eINSTANCE.getVariable_Expr();

  }

} //MyDslPackage
