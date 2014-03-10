/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Body#getVariaveis <em>Variaveis</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Body#getDeclarations <em>Declarations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getBody()
 * @model
 * @generated
 */
public interface Body extends Model
{
  /**
   * Returns the value of the '<em><b>Variaveis</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.VarDecl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variaveis</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variaveis</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getBody_Variaveis()
   * @model containment="true"
   * @generated
   */
  EList<VarDecl> getVariaveis();

  /**
   * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Declaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declarations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declarations</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getBody_Declarations()
   * @model containment="true"
   * @generated
   */
  EList<Declaration> getDeclarations();

} // Body
