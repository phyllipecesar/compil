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
   * The feature id for the '<em><b>Funcao</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__FUNCAO = 0;

  /**
   * The feature id for the '<em><b>Dirty E</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__DIRTY_E = 1;

  /**
   * The feature id for the '<em><b>Dirty A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__DIRTY_A = 2;

  /**
   * The feature id for the '<em><b>Dirty B</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__DIRTY_B = 3;

  /**
   * The feature id for the '<em><b>Dirty C</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__DIRTY_C = 4;

  /**
   * The feature id for the '<em><b>Dirty D</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__DIRTY_D = 5;

  /**
   * The feature id for the '<em><b>Dirty</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__DIRTY = 6;

  /**
   * The number of structural features of the '<em>Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION_FEATURE_COUNT = 7;

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
   * The feature id for the '<em><b>Escopo</b></em>' attribute.
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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ParameterImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 6;

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
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.VarDeclImpl <em>Var Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.VarDeclImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getVarDecl()
   * @generated
   */
  int VAR_DECL = 7;

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
   * The number of structural features of the '<em>Var Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.TypeImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getType()
   * @generated
   */
  int TYPE = 8;

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
  int SIMPLE_TYPE_SPECIFIER = 9;

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
  int SIMPLE_DECLARATION = 10;

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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.jump_statementImpl <em>jump statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.jump_statementImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getjump_statement()
   * @generated
   */
  int JUMP_STATEMENT = 11;

  /**
   * The number of structural features of the '<em>jump statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JUMP_STATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.declaration_statementImpl <em>declaration statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.declaration_statementImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getdeclaration_statement()
   * @generated
   */
  int DECLARATION_STATEMENT = 12;

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
  int BLOCK_DECLARATION = 13;

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
  int LKS = 14;

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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.IntTypeImpl <em>Int Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.IntTypeImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getIntType()
   * @generated
   */
  int INT_TYPE = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_TYPE__NAME = SIMPLE_TYPE_SPECIFIER__NAME;

  /**
   * The number of structural features of the '<em>Int Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_TYPE_FEATURE_COUNT = SIMPLE_TYPE_SPECIFIER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.BoolTypeImpl <em>Bool Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.BoolTypeImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getBoolType()
   * @generated
   */
  int BOOL_TYPE = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_TYPE__NAME = SIMPLE_TYPE_SPECIFIER__NAME;

  /**
   * The number of structural features of the '<em>Bool Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_TYPE_FEATURE_COUNT = SIMPLE_TYPE_SPECIFIER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.UnknownTypeImpl <em>Unknown Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.UnknownTypeImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getUnknownType()
   * @generated
   */
  int UNKNOWN_TYPE = 17;

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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ReturnImpl <em>Return</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ReturnImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getReturn()
   * @generated
   */
  int RETURN = 18;

  /**
   * The feature id for the '<em><b>Exp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN__EXP = JUMP_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Return</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_FEATURE_COUNT = JUMP_STATEMENT_FEATURE_COUNT + 1;


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
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.FunctionDeclaration#getEscopo <em>Escopo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Escopo</em>'.
   * @see org.xtext.example.mydsl.myDsl.FunctionDeclaration#getEscopo()
   * @see #getFunctionDeclaration()
   * @generated
   */
  EAttribute getFunctionDeclaration_Escopo();

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
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.jump_statement <em>jump statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>jump statement</em>'.
   * @see org.xtext.example.mydsl.myDsl.jump_statement
   * @generated
   */
  EClass getjump_statement();

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
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.IntType <em>Int Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.IntType
   * @generated
   */
  EClass getIntType();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.BoolType <em>Bool Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bool Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.BoolType
   * @generated
   */
  EClass getBoolType();

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
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Return <em>Return</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Return</em>'.
   * @see org.xtext.example.mydsl.myDsl.Return
   * @generated
   */
  EClass getReturn();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Return#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Exp</em>'.
   * @see org.xtext.example.mydsl.myDsl.Return#getExp()
   * @see #getReturn()
   * @generated
   */
  EAttribute getReturn_Exp();

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
     * The meta object literal for the '<em><b>Escopo</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_DECLARATION__ESCOPO = eINSTANCE.getFunctionDeclaration_Escopo();

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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.jump_statementImpl <em>jump statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.jump_statementImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getjump_statement()
     * @generated
     */
    EClass JUMP_STATEMENT = eINSTANCE.getjump_statement();

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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.IntTypeImpl <em>Int Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.IntTypeImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getIntType()
     * @generated
     */
    EClass INT_TYPE = eINSTANCE.getIntType();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.BoolTypeImpl <em>Bool Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.BoolTypeImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getBoolType()
     * @generated
     */
    EClass BOOL_TYPE = eINSTANCE.getBoolType();

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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ReturnImpl <em>Return</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ReturnImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getReturn()
     * @generated
     */
    EClass RETURN = eINSTANCE.getReturn();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RETURN__EXP = eINSTANCE.getReturn_Exp();

  }

} //MyDslPackage
