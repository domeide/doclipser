/**
 */
package com.zenika.docker.dsl.dockerfileDsl.impl;

import com.zenika.docker.dsl.dockerfileDsl.*;

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
public class DockerfileDslFactoryImpl extends EFactoryImpl implements DockerfileDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DockerfileDslFactory init()
  {
    try
    {
      DockerfileDslFactory theDockerfileDslFactory = (DockerfileDslFactory)EPackage.Registry.INSTANCE.getEFactory(DockerfileDslPackage.eNS_URI);
      if (theDockerfileDslFactory != null)
      {
        return theDockerfileDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DockerfileDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DockerfileDslFactoryImpl()
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
      case DockerfileDslPackage.DOCKERFILE: return createDockerfile();
      case DockerfileDslPackage.INSTRUCTION: return createInstruction();
      case DockerfileDslPackage.CMD: return createCmd();
      case DockerfileDslPackage.FROM: return createFrom();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dockerfile createDockerfile()
  {
    DockerfileImpl dockerfile = new DockerfileImpl();
    return dockerfile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instruction createInstruction()
  {
    InstructionImpl instruction = new InstructionImpl();
    return instruction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cmd createCmd()
  {
    CmdImpl cmd = new CmdImpl();
    return cmd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public From createFrom()
  {
    FromImpl from = new FromImpl();
    return from;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DockerfileDslPackage getDockerfileDslPackage()
  {
    return (DockerfileDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DockerfileDslPackage getPackage()
  {
    return DockerfileDslPackage.eINSTANCE;
  }

} //DockerfileDslFactoryImpl
