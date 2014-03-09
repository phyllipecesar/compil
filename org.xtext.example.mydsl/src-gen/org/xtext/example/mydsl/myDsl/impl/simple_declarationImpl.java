/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.VarDecl;
import org.xtext.example.mydsl.myDsl.simple_declaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>simple declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.simple_declarationImpl#getVariavel <em>Variavel</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class simple_declarationImpl extends MinimalEObjectImpl.Container implements simple_declaration
{
  /**
   * The cached value of the '{@link #getVariavel() <em>Variavel</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariavel()
   * @generated
   * @ordered
   */
  protected VarDecl variavel;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected simple_declarationImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyDslPackage.Literals.SIMPLE_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarDecl getVariavel()
  {
    return variavel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVariavel(VarDecl newVariavel, NotificationChain msgs)
  {
    VarDecl oldVariavel = variavel;
    variavel = newVariavel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.SIMPLE_DECLARATION__VARIAVEL, oldVariavel, newVariavel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariavel(VarDecl newVariavel)
  {
    if (newVariavel != variavel)
    {
      NotificationChain msgs = null;
      if (variavel != null)
        msgs = ((InternalEObject)variavel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SIMPLE_DECLARATION__VARIAVEL, null, msgs);
      if (newVariavel != null)
        msgs = ((InternalEObject)newVariavel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SIMPLE_DECLARATION__VARIAVEL, null, msgs);
      msgs = basicSetVariavel(newVariavel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SIMPLE_DECLARATION__VARIAVEL, newVariavel, newVariavel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MyDslPackage.SIMPLE_DECLARATION__VARIAVEL:
        return basicSetVariavel(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyDslPackage.SIMPLE_DECLARATION__VARIAVEL:
        return getVariavel();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.SIMPLE_DECLARATION__VARIAVEL:
        setVariavel((VarDecl)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.SIMPLE_DECLARATION__VARIAVEL:
        setVariavel((VarDecl)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.SIMPLE_DECLARATION__VARIAVEL:
        return variavel != null;
    }
    return super.eIsSet(featureID);
  }

} //simple_declarationImpl
