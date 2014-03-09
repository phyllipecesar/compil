/**
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LKS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.LKS#getDirty <em>Dirty</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getLKS()
 * @model
 * @generated
 */
public interface LKS extends LinkageSpecification
{
  /**
   * Returns the value of the '<em><b>Dirty</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dirty</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dirty</em>' containment reference.
   * @see #setDirty(Declaration)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getLKS_Dirty()
   * @model containment="true"
   * @generated
   */
  Declaration getDirty();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.LKS#getDirty <em>Dirty</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dirty</em>' containment reference.
   * @see #getDirty()
   * @generated
   */
  void setDirty(Declaration value);

} // LKS
