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
import org.xtext.example.mydsl.myDsl.NoPtrExpression;
import org.xtext.example.mydsl.myDsl.Return;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Return</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ReturnImpl#getRettype <em>Rettype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReturnImpl extends MinimalEObjectImpl.Container implements Return
{
  /**
   * The cached value of the '{@link #getRettype() <em>Rettype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRettype()
   * @generated
   * @ordered
   */
  protected NoPtrExpression rettype;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReturnImpl()
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
    return MyDslPackage.Literals.RETURN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NoPtrExpression getRettype()
  {
    return rettype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRettype(NoPtrExpression newRettype, NotificationChain msgs)
  {
    NoPtrExpression oldRettype = rettype;
    rettype = newRettype;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.RETURN__RETTYPE, oldRettype, newRettype);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRettype(NoPtrExpression newRettype)
  {
    if (newRettype != rettype)
    {
      NotificationChain msgs = null;
      if (rettype != null)
        msgs = ((InternalEObject)rettype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.RETURN__RETTYPE, null, msgs);
      if (newRettype != null)
        msgs = ((InternalEObject)newRettype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.RETURN__RETTYPE, null, msgs);
      msgs = basicSetRettype(newRettype, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.RETURN__RETTYPE, newRettype, newRettype));
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
      case MyDslPackage.RETURN__RETTYPE:
        return basicSetRettype(null, msgs);
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
      case MyDslPackage.RETURN__RETTYPE:
        return getRettype();
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
      case MyDslPackage.RETURN__RETTYPE:
        setRettype((NoPtrExpression)newValue);
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
      case MyDslPackage.RETURN__RETTYPE:
        setRettype((NoPtrExpression)null);
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
      case MyDslPackage.RETURN__RETTYPE:
        return rettype != null;
    }
    return super.eIsSet(featureID);
  }

} //ReturnImpl
