/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Type#getSts <em>Sts</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getType()
 * @model
 * @generated
 */
public interface Type extends EObject
{
  /**
   * Returns the value of the '<em><b>Sts</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sts</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sts</em>' containment reference.
   * @see #setSts(simple_type_specifier)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getType_Sts()
   * @model containment="true"
   * @generated
   */
  simple_type_specifier getSts();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Type#getSts <em>Sts</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sts</em>' containment reference.
   * @see #getSts()
   * @generated
   */
  void setSts(simple_type_specifier value);

} // Type
