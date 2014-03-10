/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Return#getRettype <em>Rettype</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getReturn()
 * @model
 * @generated
 */
public interface Return extends EObject
{
  /**
   * Returns the value of the '<em><b>Rettype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rettype</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rettype</em>' containment reference.
   * @see #setRettype(NoPtrExpression)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getReturn_Rettype()
   * @model containment="true"
   * @generated
   */
  NoPtrExpression getRettype();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Return#getRettype <em>Rettype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rettype</em>' containment reference.
   * @see #getRettype()
   * @generated
   */
  void setRettype(NoPtrExpression value);

} // Return
