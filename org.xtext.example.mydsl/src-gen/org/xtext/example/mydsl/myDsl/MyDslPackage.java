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
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.VarDeclImpl <em>Var Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.VarDeclImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getVarDecl()
   * @generated
   */
  int VAR_DECL = 1;

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
  int TYPE = 2;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.simple_type_specifierImpl <em>simple type specifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.simple_type_specifierImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getsimple_type_specifier()
   * @generated
   */
  int SIMPLE_TYPE_SPECIFIER = 3;

  /**
   * The number of structural features of the '<em>simple type specifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_TYPE_SPECIFIER_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.statementImpl <em>statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.statementImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getstatement()
   * @generated
   */
  int STATEMENT = 4;

  /**
   * The feature id for the '<em><b>Variavel</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__VARIAVEL = 0;

  /**
   * The number of structural features of the '<em>statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.simple_declarationImpl <em>simple declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.simple_declarationImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getsimple_declaration()
   * @generated
   */
  int SIMPLE_DECLARATION = 5;

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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.declaration_statementImpl <em>declaration statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.declaration_statementImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getdeclaration_statement()
   * @generated
   */
  int DECLARATION_STATEMENT = 6;

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
  int BLOCK_DECLARATION = 7;

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
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.IntTypeImpl <em>Int Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.IntTypeImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getIntType()
   * @generated
   */
  int INT_TYPE = 8;

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
  int BOOL_TYPE = 9;

  /**
   * The number of structural features of the '<em>Bool Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_TYPE_FEATURE_COUNT = SIMPLE_TYPE_SPECIFIER_FEATURE_COUNT + 0;


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
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Model#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.xtext.example.mydsl.myDsl.Model#getElements()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Elements();

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
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.simple_type_specifier <em>simple type specifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>simple type specifier</em>'.
   * @see org.xtext.example.mydsl.myDsl.simple_type_specifier
   * @generated
   */
  EClass getsimple_type_specifier();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.statement <em>statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>statement</em>'.
   * @see org.xtext.example.mydsl.myDsl.statement
   * @generated
   */
  EClass getstatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.statement#getVariavel <em>Variavel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variavel</em>'.
   * @see org.xtext.example.mydsl.myDsl.statement#getVariavel()
   * @see #getstatement()
   * @generated
   */
  EReference getstatement_Variavel();

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
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__ELEMENTS = eINSTANCE.getModel_Elements();

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
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.simple_type_specifierImpl <em>simple type specifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.simple_type_specifierImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getsimple_type_specifier()
     * @generated
     */
    EClass SIMPLE_TYPE_SPECIFIER = eINSTANCE.getsimple_type_specifier();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.statementImpl <em>statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.statementImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getstatement()
     * @generated
     */
    EClass STATEMENT = eINSTANCE.getstatement();

    /**
     * The meta object literal for the '<em><b>Variavel</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__VARIAVEL = eINSTANCE.getstatement_Variavel();

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

  }

} //MyDslPackage
