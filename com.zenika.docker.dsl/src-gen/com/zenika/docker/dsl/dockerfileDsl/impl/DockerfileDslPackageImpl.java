/**
 */
package com.zenika.docker.dsl.dockerfileDsl.impl;

import com.zenika.docker.dsl.dockerfileDsl.Cmd;
import com.zenika.docker.dsl.dockerfileDsl.Dockerfile;
import com.zenika.docker.dsl.dockerfileDsl.DockerfileDslFactory;
import com.zenika.docker.dsl.dockerfileDsl.DockerfileDslPackage;
import com.zenika.docker.dsl.dockerfileDsl.From;
import com.zenika.docker.dsl.dockerfileDsl.Instruction;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DockerfileDslPackageImpl extends EPackageImpl implements DockerfileDslPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dockerfileEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instructionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cmdEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fromEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see com.zenika.docker.dsl.dockerfileDsl.DockerfileDslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private DockerfileDslPackageImpl()
  {
    super(eNS_URI, DockerfileDslFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link DockerfileDslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static DockerfileDslPackage init()
  {
    if (isInited) return (DockerfileDslPackage)EPackage.Registry.INSTANCE.getEPackage(DockerfileDslPackage.eNS_URI);

    // Obtain or create and register package
    DockerfileDslPackageImpl theDockerfileDslPackage = (DockerfileDslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DockerfileDslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DockerfileDslPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theDockerfileDslPackage.createPackageContents();

    // Initialize created meta-data
    theDockerfileDslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theDockerfileDslPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(DockerfileDslPackage.eNS_URI, theDockerfileDslPackage);
    return theDockerfileDslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDockerfile()
  {
    return dockerfileEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDockerfile_Instructions()
  {
    return (EReference)dockerfileEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstruction()
  {
    return instructionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCmd()
  {
    return cmdEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCmd_Executable()
  {
    return (EAttribute)cmdEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCmd_Params()
  {
    return (EAttribute)cmdEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFrom()
  {
    return fromEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFrom_Name()
  {
    return (EAttribute)fromEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFrom_Tag()
  {
    return (EAttribute)fromEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DockerfileDslFactory getDockerfileDslFactory()
  {
    return (DockerfileDslFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    dockerfileEClass = createEClass(DOCKERFILE);
    createEReference(dockerfileEClass, DOCKERFILE__INSTRUCTIONS);

    instructionEClass = createEClass(INSTRUCTION);

    cmdEClass = createEClass(CMD);
    createEAttribute(cmdEClass, CMD__EXECUTABLE);
    createEAttribute(cmdEClass, CMD__PARAMS);

    fromEClass = createEClass(FROM);
    createEAttribute(fromEClass, FROM__NAME);
    createEAttribute(fromEClass, FROM__TAG);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    cmdEClass.getESuperTypes().add(this.getInstruction());
    fromEClass.getESuperTypes().add(this.getInstruction());

    // Initialize classes and features; add operations and parameters
    initEClass(dockerfileEClass, Dockerfile.class, "Dockerfile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDockerfile_Instructions(), this.getInstruction(), null, "instructions", null, 0, -1, Dockerfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instructionEClass, Instruction.class, "Instruction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(cmdEClass, Cmd.class, "Cmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCmd_Executable(), ecorePackage.getEString(), "executable", null, 0, 1, Cmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCmd_Params(), ecorePackage.getEString(), "params", null, 0, -1, Cmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fromEClass, From.class, "From", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFrom_Name(), ecorePackage.getEString(), "name", null, 0, 1, From.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFrom_Tag(), ecorePackage.getEString(), "tag", null, 0, 1, From.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //DockerfileDslPackageImpl
