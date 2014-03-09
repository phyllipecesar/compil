/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.Declaration;
import org.xtext.example.mydsl.myDsl.FunctionDeclaration;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DeclarationImpl#getFuncao <em>Funcao</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DeclarationImpl#getDirtyE <em>Dirty E</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DeclarationImpl#getDirtyA <em>Dirty A</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DeclarationImpl#getDirtyB <em>Dirty B</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DeclarationImpl#getDirtyC <em>Dirty C</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DeclarationImpl#getDirtyD <em>Dirty D</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DeclarationImpl#getDirty <em>Dirty</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeclarationImpl extends MinimalEObjectImpl.Container implements Declaration
{
  /**
   * The cached value of the '{@link #getFuncao() <em>Funcao</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFuncao()
   * @generated
   * @ordered
   */
  protected FunctionDeclaration funcao;

  /**
   * The default value of the '{@link #getDirtyE() <em>Dirty E</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDirtyE()
   * @generated
   * @ordered
   */
  protected static final String DIRTY_E_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDirtyE() <em>Dirty E</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDirtyE()
   * @generated
   * @ordered
   */
  protected String dirtyE = DIRTY_E_EDEFAULT;

  /**
   * The default value of the '{@link #getDirtyA() <em>Dirty A</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDirtyA()
   * @generated
   * @ordered
   */
  protected static final String DIRTY_A_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDirtyA() <em>Dirty A</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDirtyA()
   * @generated
   * @ordered
   */
  protected String dirtyA = DIRTY_A_EDEFAULT;

  /**
   * The default value of the '{@link #getDirtyB() <em>Dirty B</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDirtyB()
   * @generated
   * @ordered
   */
  protected static final String DIRTY_B_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDirtyB() <em>Dirty B</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDirtyB()
   * @generated
   * @ordered
   */
  protected String dirtyB = DIRTY_B_EDEFAULT;

  /**
   * The default value of the '{@link #getDirtyC() <em>Dirty C</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDirtyC()
   * @generated
   * @ordered
   */
  protected static final String DIRTY_C_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDirtyC() <em>Dirty C</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDirtyC()
   * @generated
   * @ordered
   */
  protected String dirtyC = DIRTY_C_EDEFAULT;

  /**
   * The default value of the '{@link #getDirtyD() <em>Dirty D</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDirtyD()
   * @generated
   * @ordered
   */
  protected static final String DIRTY_D_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDirtyD() <em>Dirty D</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDirtyD()
   * @generated
   * @ordered
   */
  protected String dirtyD = DIRTY_D_EDEFAULT;

  /**
   * The cached value of the '{@link #getDirty() <em>Dirty</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDirty()
   * @generated
   * @ordered
   */
  protected EObject dirty;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeclarationImpl()
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
    return MyDslPackage.Literals.DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionDeclaration getFuncao()
  {
    return funcao;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFuncao(FunctionDeclaration newFuncao, NotificationChain msgs)
  {
    FunctionDeclaration oldFuncao = funcao;
    funcao = newFuncao;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.DECLARATION__FUNCAO, oldFuncao, newFuncao);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFuncao(FunctionDeclaration newFuncao)
  {
    if (newFuncao != funcao)
    {
      NotificationChain msgs = null;
      if (funcao != null)
        msgs = ((InternalEObject)funcao).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DECLARATION__FUNCAO, null, msgs);
      if (newFuncao != null)
        msgs = ((InternalEObject)newFuncao).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DECLARATION__FUNCAO, null, msgs);
      msgs = basicSetFuncao(newFuncao, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DECLARATION__FUNCAO, newFuncao, newFuncao));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDirtyE()
  {
    return dirtyE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDirtyE(String newDirtyE)
  {
    String oldDirtyE = dirtyE;
    dirtyE = newDirtyE;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DECLARATION__DIRTY_E, oldDirtyE, dirtyE));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDirtyA()
  {
    return dirtyA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDirtyA(String newDirtyA)
  {
    String oldDirtyA = dirtyA;
    dirtyA = newDirtyA;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DECLARATION__DIRTY_A, oldDirtyA, dirtyA));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDirtyB()
  {
    return dirtyB;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDirtyB(String newDirtyB)
  {
    String oldDirtyB = dirtyB;
    dirtyB = newDirtyB;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DECLARATION__DIRTY_B, oldDirtyB, dirtyB));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDirtyC()
  {
    return dirtyC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDirtyC(String newDirtyC)
  {
    String oldDirtyC = dirtyC;
    dirtyC = newDirtyC;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DECLARATION__DIRTY_C, oldDirtyC, dirtyC));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDirtyD()
  {
    return dirtyD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDirtyD(String newDirtyD)
  {
    String oldDirtyD = dirtyD;
    dirtyD = newDirtyD;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DECLARATION__DIRTY_D, oldDirtyD, dirtyD));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getDirty()
  {
    return dirty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDirty(EObject newDirty, NotificationChain msgs)
  {
    EObject oldDirty = dirty;
    dirty = newDirty;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.DECLARATION__DIRTY, oldDirty, newDirty);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDirty(EObject newDirty)
  {
    if (newDirty != dirty)
    {
      NotificationChain msgs = null;
      if (dirty != null)
        msgs = ((InternalEObject)dirty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DECLARATION__DIRTY, null, msgs);
      if (newDirty != null)
        msgs = ((InternalEObject)newDirty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DECLARATION__DIRTY, null, msgs);
      msgs = basicSetDirty(newDirty, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DECLARATION__DIRTY, newDirty, newDirty));
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
      case MyDslPackage.DECLARATION__FUNCAO:
        return basicSetFuncao(null, msgs);
      case MyDslPackage.DECLARATION__DIRTY:
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
      case MyDslPackage.DECLARATION__FUNCAO:
        return getFuncao();
      case MyDslPackage.DECLARATION__DIRTY_E:
        return getDirtyE();
      case MyDslPackage.DECLARATION__DIRTY_A:
        return getDirtyA();
      case MyDslPackage.DECLARATION__DIRTY_B:
        return getDirtyB();
      case MyDslPackage.DECLARATION__DIRTY_C:
        return getDirtyC();
      case MyDslPackage.DECLARATION__DIRTY_D:
        return getDirtyD();
      case MyDslPackage.DECLARATION__DIRTY:
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
      case MyDslPackage.DECLARATION__FUNCAO:
        setFuncao((FunctionDeclaration)newValue);
        return;
      case MyDslPackage.DECLARATION__DIRTY_E:
        setDirtyE((String)newValue);
        return;
      case MyDslPackage.DECLARATION__DIRTY_A:
        setDirtyA((String)newValue);
        return;
      case MyDslPackage.DECLARATION__DIRTY_B:
        setDirtyB((String)newValue);
        return;
      case MyDslPackage.DECLARATION__DIRTY_C:
        setDirtyC((String)newValue);
        return;
      case MyDslPackage.DECLARATION__DIRTY_D:
        setDirtyD((String)newValue);
        return;
      case MyDslPackage.DECLARATION__DIRTY:
        setDirty((EObject)newValue);
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
      case MyDslPackage.DECLARATION__FUNCAO:
        setFuncao((FunctionDeclaration)null);
        return;
      case MyDslPackage.DECLARATION__DIRTY_E:
        setDirtyE(DIRTY_E_EDEFAULT);
        return;
      case MyDslPackage.DECLARATION__DIRTY_A:
        setDirtyA(DIRTY_A_EDEFAULT);
        return;
      case MyDslPackage.DECLARATION__DIRTY_B:
        setDirtyB(DIRTY_B_EDEFAULT);
        return;
      case MyDslPackage.DECLARATION__DIRTY_C:
        setDirtyC(DIRTY_C_EDEFAULT);
        return;
      case MyDslPackage.DECLARATION__DIRTY_D:
        setDirtyD(DIRTY_D_EDEFAULT);
        return;
      case MyDslPackage.DECLARATION__DIRTY:
        setDirty((EObject)null);
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
      case MyDslPackage.DECLARATION__FUNCAO:
        return funcao != null;
      case MyDslPackage.DECLARATION__DIRTY_E:
        return DIRTY_E_EDEFAULT == null ? dirtyE != null : !DIRTY_E_EDEFAULT.equals(dirtyE);
      case MyDslPackage.DECLARATION__DIRTY_A:
        return DIRTY_A_EDEFAULT == null ? dirtyA != null : !DIRTY_A_EDEFAULT.equals(dirtyA);
      case MyDslPackage.DECLARATION__DIRTY_B:
        return DIRTY_B_EDEFAULT == null ? dirtyB != null : !DIRTY_B_EDEFAULT.equals(dirtyB);
      case MyDslPackage.DECLARATION__DIRTY_C:
        return DIRTY_C_EDEFAULT == null ? dirtyC != null : !DIRTY_C_EDEFAULT.equals(dirtyC);
      case MyDslPackage.DECLARATION__DIRTY_D:
        return DIRTY_D_EDEFAULT == null ? dirtyD != null : !DIRTY_D_EDEFAULT.equals(dirtyD);
      case MyDslPackage.DECLARATION__DIRTY:
        return dirty != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (dirtyE: ");
    result.append(dirtyE);
    result.append(", dirtyA: ");
    result.append(dirtyA);
    result.append(", dirtyB: ");
    result.append(dirtyB);
    result.append(", dirtyC: ");
    result.append(dirtyC);
    result.append(", dirtyD: ");
    result.append(dirtyD);
    result.append(')');
    return result.toString();
  }

} //DeclarationImpl
