/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>declaration statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.declaration_statement#getVariaveis <em>Variaveis</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getdeclaration_statement()
 * @model
 * @generated
 */
public interface declaration_statement extends EObject
{
  /**
   * Returns the value of the '<em><b>Variaveis</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.block_declaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variaveis</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variaveis</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getdeclaration_statement_Variaveis()
   * @model containment="true"
   * @generated
   */
  EList<block_declaration> getVariaveis();

} // declaration_statement
