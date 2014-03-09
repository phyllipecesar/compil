/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.Declaration;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.NamespaceDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Namespace Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.NamespaceDefinitionImpl#getDirty <em>Dirty</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NamespaceDefinitionImpl extends MinimalEObjectImpl.Container implements NamespaceDefinition
{
  /**
   * The cached value of the '{@link #getDirty() <em>Dirty</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDirty()
   * @generated
   * @ordered
   */
  protected Declaration dirty;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NamespaceDefinitionImpl()
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
    return MyDslPackage.Literals.NAMESPACE_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Declaration getDirty()
  {
    return dirty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDirty(Declaration newDirty, NotificationChain msgs)
  {
    Declaration oldDirty = dirty;
    dirty = newDirty;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.NAMESPACE_DEFINITION__DIRTY, oldDirty, newDirty);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDirty(Declaration newDirty)
  {
    if (newDirty != dirty)
    {
      NotificationChain msgs = null;
      if (dirty != null)
        msgs = ((InternalEObject)dirty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.NAMESPACE_DEFINITION__DIRTY, null, msgs);
      if (newDirty != null)
        msgs = ((InternalEObject)newDirty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.NAMESPACE_DEFINITION__DIRTY, null, msgs);
      msgs = basicSetDirty(newDirty, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.NAMESPACE_DEFINITION__DIRTY, newDirty, newDirty));
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
      case MyDslPackage.NAMESPACE_DEFINITION__DIRTY:
        return basicSetDirty(null, msgs);
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
      case MyDslPackage.NAMESPACE_DEFINITION__DIRTY:
        return getDirty();
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
      case MyDslPackage.NAMESPACE_DEFINITION__DIRTY:
        setDirty((Declaration)newValue);
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
      case MyDslPackage.NAMESPACE_DEFINITION__DIRTY:
        setDirty((Declaration)null);
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
      case MyDslPackage.NAMESPACE_DEFINITION__DIRTY:
        return dirty != null;
    }
    return super.eIsSet(featureID);
  }

} //NamespaceDefinitionImpl
