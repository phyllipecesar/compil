/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.block_declaration;
import org.xtext.example.mydsl.myDsl.declaration_statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>declaration statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.declaration_statementImpl#getVariaveis <em>Variaveis</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class declaration_statementImpl extends MinimalEObjectImpl.Container implements declaration_statement
{
  /**
   * The cached value of the '{@link #getVariaveis() <em>Variaveis</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariaveis()
   * @generated
   * @ordered
   */
  protected EList<block_declaration> variaveis;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected declaration_statementImpl()
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
    return MyDslPackage.Literals.DECLARATION_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<block_declaration> getVariaveis()
  {
    if (variaveis == null)
    {
      variaveis = new EObjectContainmentEList<block_declaration>(block_declaration.class, this, MyDslPackage.DECLARATION_STATEMENT__VARIAVEIS);
    }
    return variaveis;
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
      case MyDslPackage.DECLARATION_STATEMENT__VARIAVEIS:
        return ((InternalEList<?>)getVariaveis()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.DECLARATION_STATEMENT__VARIAVEIS:
        return getVariaveis();
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
      case MyDslPackage.DECLARATION_STATEMENT__VARIAVEIS:
        getVariaveis().clear();
        getVariaveis().addAll((Collection<? extends block_declaration>)newValue);
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
      case MyDslPackage.DECLARATION_STATEMENT__VARIAVEIS:
        getVariaveis().clear();
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
      case MyDslPackage.DECLARATION_STATEMENT__VARIAVEIS:
        return variaveis != null && !variaveis.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //declaration_statementImpl
