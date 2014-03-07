/**
 */
package org.cpp2;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see org.cpp2.Cpp2Factory
 * @model kind="package"
 * @generated
 */
public interface Cpp2Package extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "cpp2";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.Cpp2.org";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "cpp2";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  Cpp2Package eINSTANCE = org.cpp2.impl.Cpp2PackageImpl.init();

  /**
   * The meta object id for the '{@link org.cpp2.impl.TestImpl <em>Test</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.cpp2.impl.TestImpl
   * @see org.cpp2.impl.Cpp2PackageImpl#getTest()
   * @generated
   */
  int TEST = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Test</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link org.cpp2.Test <em>Test</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Test</em>'.
   * @see org.cpp2.Test
   * @generated
   */
  EClass getTest();

  /**
   * Returns the meta object for the attribute list '{@link org.cpp2.Test#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Elements</em>'.
   * @see org.cpp2.Test#getElements()
   * @see #getTest()
   * @generated
   */
  EAttribute getTest_Elements();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  Cpp2Factory getCpp2Factory();

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
     * The meta object literal for the '{@link org.cpp2.impl.TestImpl <em>Test</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.cpp2.impl.TestImpl
     * @see org.cpp2.impl.Cpp2PackageImpl#getTest()
     * @generated
     */
    EClass TEST = eINSTANCE.getTest();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEST__ELEMENTS = eINSTANCE.getTest_Elements();

  }

} //Cpp2Package
