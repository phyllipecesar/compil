/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>block declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.block_declaration#getVariavel <em>Variavel</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getblock_declaration()
 * @model
 * @generated
 */
public interface block_declaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Variavel</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variavel</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variavel</em>' containment reference.
   * @see #setVariavel(simple_declaration)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getblock_declaration_Variavel()
   * @model containment="true"
   * @generated
   */
  simple_declaration getVariavel();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.block_declaration#getVariavel <em>Variavel</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variavel</em>' containment reference.
   * @see #getVariavel()
   * @generated
   */
  void setVariavel(simple_declaration value);

} // block_declaration
