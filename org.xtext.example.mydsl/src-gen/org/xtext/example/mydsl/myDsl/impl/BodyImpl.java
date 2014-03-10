/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.myDsl.Body;
import org.xtext.example.mydsl.myDsl.Declaration;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.VarDecl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.BodyImpl#getVariaveis <em>Variaveis</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.BodyImpl#getDeclarations <em>Declarations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BodyImpl extends ModelImpl implements Body
{
  /**
   * The cached value of the '{@link #getVariaveis() <em>Variaveis</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariaveis()
   * @generated
   * @ordered
   */
  protected EList<VarDecl> variaveis;

  /**
   * The cached value of the '{@link #getDeclarations() <em>Declarations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclarations()
   * @generated
   * @ordered
   */
  protected EList<Declaration> declarations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BodyImpl()
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
    return MyDslPackage.Literals.BODY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<VarDecl> getVariaveis()
  {
    if (variaveis == null)
    {
      variaveis = new EObjectContainmentEList<VarDecl>(VarDecl.class, this, MyDslPackage.BODY__VARIAVEIS);
    }
    return variaveis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Declaration> getDeclarations()
  {
    if (declarations == null)
    {
      declarations = new EObjectContainmentEList<Declaration>(Declaration.class, this, MyDslPackage.BODY__DECLARATIONS);
    }
    return declarations;
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
      case MyDslPackage.BODY__VARIAVEIS:
        return ((InternalEList<?>)getVariaveis()).basicRemove(otherEnd, msgs);
      case MyDslPackage.BODY__DECLARATIONS:
        return ((InternalEList<?>)getDeclarations()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.BODY__VARIAVEIS:
        return getVariaveis();
      case MyDslPackage.BODY__DECLARATIONS:
        return getDeclarations();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.BODY__VARIAVEIS:
        getVariaveis().clear();
        getVariaveis().addAll((Collection<? extends VarDecl>)newValue);
        return;
      case MyDslPackage.BODY__DECLARATIONS:
        getDeclarations().clear();
        getDeclarations().addAll((Collection<? extends Declaration>)newValue);
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
      case MyDslPackage.BODY__VARIAVEIS:
        getVariaveis().clear();
        return;
      case MyDslPackage.BODY__DECLARATIONS:
        getDeclarations().clear();
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
      case MyDslPackage.BODY__VARIAVEIS:
        return variaveis != null && !variaveis.isEmpty();
      case MyDslPackage.BODY__DECLARATIONS:
        return declarations != null && !declarations.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //BodyImpl
