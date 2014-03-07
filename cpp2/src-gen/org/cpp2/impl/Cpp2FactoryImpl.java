/**
 */
package org.cpp2.impl;

import org.cpp2.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Cpp2FactoryImpl extends EFactoryImpl implements Cpp2Factory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Cpp2Factory init()
  {
    try
    {
      Cpp2Factory theCpp2Factory = (Cpp2Factory)EPackage.Registry.INSTANCE.getEFactory(Cpp2Package.eNS_URI);
      if (theCpp2Factory != null)
      {
        return theCpp2Factory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new Cpp2FactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cpp2FactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case Cpp2Package.TEST: return createTest();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Test createTest()
  {
    TestImpl test = new TestImpl();
    return test;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cpp2Package getCpp2Package()
  {
    return (Cpp2Package)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static Cpp2Package getPackage()
  {
    return Cpp2Package.eINSTANCE;
  }

} //Cpp2FactoryImpl
