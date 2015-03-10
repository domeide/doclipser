/**
 */
package com.zenika.docker.dsl.dockerfileDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.zenika.docker.dsl.dockerfileDsl.DockerfileDslFactory
 * @model kind="package"
 * @generated
 */
public interface DockerfileDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "dockerfileDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.zenika.com/docker/dsl/DockerfileDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "dockerfileDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DockerfileDslPackage eINSTANCE = com.zenika.docker.dsl.dockerfileDsl.impl.DockerfileDslPackageImpl.init();

  /**
   * The meta object id for the '{@link com.zenika.docker.dsl.dockerfileDsl.impl.DockerfileImpl <em>Dockerfile</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.zenika.docker.dsl.dockerfileDsl.impl.DockerfileImpl
   * @see com.zenika.docker.dsl.dockerfileDsl.impl.DockerfileDslPackageImpl#getDockerfile()
   * @generated
   */
  int DOCKERFILE = 0;

  /**
   * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCKERFILE__INSTRUCTIONS = 0;

  /**
   * The number of structural features of the '<em>Dockerfile</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCKERFILE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.zenika.docker.dsl.dockerfileDsl.impl.InstructionImpl <em>Instruction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.zenika.docker.dsl.dockerfileDsl.impl.InstructionImpl
   * @see com.zenika.docker.dsl.dockerfileDsl.impl.DockerfileDslPackageImpl#getInstruction()
   * @generated
   */
  int INSTRUCTION = 1;

  /**
   * The number of structural features of the '<em>Instruction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.zenika.docker.dsl.dockerfileDsl.impl.CmdImpl <em>Cmd</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.zenika.docker.dsl.dockerfileDsl.impl.CmdImpl
   * @see com.zenika.docker.dsl.dockerfileDsl.impl.DockerfileDslPackageImpl#getCmd()
   * @generated
   */
  int CMD = 2;

  /**
   * The feature id for the '<em><b>Executable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CMD__EXECUTABLE = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CMD__PARAMS = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Cmd</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CMD_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.zenika.docker.dsl.dockerfileDsl.impl.FromImpl <em>From</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.zenika.docker.dsl.dockerfileDsl.impl.FromImpl
   * @see com.zenika.docker.dsl.dockerfileDsl.impl.DockerfileDslPackageImpl#getFrom()
   * @generated
   */
  int FROM = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM__NAME = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM__TAG = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>From</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;


  /**
   * Returns the meta object for class '{@link com.zenika.docker.dsl.dockerfileDsl.Dockerfile <em>Dockerfile</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dockerfile</em>'.
   * @see com.zenika.docker.dsl.dockerfileDsl.Dockerfile
   * @generated
   */
  EClass getDockerfile();

  /**
   * Returns the meta object for the containment reference list '{@link com.zenika.docker.dsl.dockerfileDsl.Dockerfile#getInstructions <em>Instructions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Instructions</em>'.
   * @see com.zenika.docker.dsl.dockerfileDsl.Dockerfile#getInstructions()
   * @see #getDockerfile()
   * @generated
   */
  EReference getDockerfile_Instructions();

  /**
   * Returns the meta object for class '{@link com.zenika.docker.dsl.dockerfileDsl.Instruction <em>Instruction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction</em>'.
   * @see com.zenika.docker.dsl.dockerfileDsl.Instruction
   * @generated
   */
  EClass getInstruction();

  /**
   * Returns the meta object for class '{@link com.zenika.docker.dsl.dockerfileDsl.Cmd <em>Cmd</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cmd</em>'.
   * @see com.zenika.docker.dsl.dockerfileDsl.Cmd
   * @generated
   */
  EClass getCmd();

  /**
   * Returns the meta object for the attribute '{@link com.zenika.docker.dsl.dockerfileDsl.Cmd#getExecutable <em>Executable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Executable</em>'.
   * @see com.zenika.docker.dsl.dockerfileDsl.Cmd#getExecutable()
   * @see #getCmd()
   * @generated
   */
  EAttribute getCmd_Executable();

  /**
   * Returns the meta object for the attribute list '{@link com.zenika.docker.dsl.dockerfileDsl.Cmd#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Params</em>'.
   * @see com.zenika.docker.dsl.dockerfileDsl.Cmd#getParams()
   * @see #getCmd()
   * @generated
   */
  EAttribute getCmd_Params();

  /**
   * Returns the meta object for class '{@link com.zenika.docker.dsl.dockerfileDsl.From <em>From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>From</em>'.
   * @see com.zenika.docker.dsl.dockerfileDsl.From
   * @generated
   */
  EClass getFrom();

  /**
   * Returns the meta object for the attribute '{@link com.zenika.docker.dsl.dockerfileDsl.From#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.zenika.docker.dsl.dockerfileDsl.From#getName()
   * @see #getFrom()
   * @generated
   */
  EAttribute getFrom_Name();

  /**
   * Returns the meta object for the attribute '{@link com.zenika.docker.dsl.dockerfileDsl.From#getTag <em>Tag</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tag</em>'.
   * @see com.zenika.docker.dsl.dockerfileDsl.From#getTag()
   * @see #getFrom()
   * @generated
   */
  EAttribute getFrom_Tag();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DockerfileDslFactory getDockerfileDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.zenika.docker.dsl.dockerfileDsl.impl.DockerfileImpl <em>Dockerfile</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.zenika.docker.dsl.dockerfileDsl.impl.DockerfileImpl
     * @see com.zenika.docker.dsl.dockerfileDsl.impl.DockerfileDslPackageImpl#getDockerfile()
     * @generated
     */
    EClass DOCKERFILE = eINSTANCE.getDockerfile();

    /**
     * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCKERFILE__INSTRUCTIONS = eINSTANCE.getDockerfile_Instructions();

    /**
     * The meta object literal for the '{@link com.zenika.docker.dsl.dockerfileDsl.impl.InstructionImpl <em>Instruction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.zenika.docker.dsl.dockerfileDsl.impl.InstructionImpl
     * @see com.zenika.docker.dsl.dockerfileDsl.impl.DockerfileDslPackageImpl#getInstruction()
     * @generated
     */
    EClass INSTRUCTION = eINSTANCE.getInstruction();

    /**
     * The meta object literal for the '{@link com.zenika.docker.dsl.dockerfileDsl.impl.CmdImpl <em>Cmd</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.zenika.docker.dsl.dockerfileDsl.impl.CmdImpl
     * @see com.zenika.docker.dsl.dockerfileDsl.impl.DockerfileDslPackageImpl#getCmd()
     * @generated
     */
    EClass CMD = eINSTANCE.getCmd();

    /**
     * The meta object literal for the '<em><b>Executable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CMD__EXECUTABLE = eINSTANCE.getCmd_Executable();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CMD__PARAMS = eINSTANCE.getCmd_Params();

    /**
     * The meta object literal for the '{@link com.zenika.docker.dsl.dockerfileDsl.impl.FromImpl <em>From</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.zenika.docker.dsl.dockerfileDsl.impl.FromImpl
     * @see com.zenika.docker.dsl.dockerfileDsl.impl.DockerfileDslPackageImpl#getFrom()
     * @generated
     */
    EClass FROM = eINSTANCE.getFrom();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FROM__NAME = eINSTANCE.getFrom_Name();

    /**
     * The meta object literal for the '<em><b>Tag</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FROM__TAG = eINSTANCE.getFrom_Tag();

  }

} //DockerfileDslPackage
