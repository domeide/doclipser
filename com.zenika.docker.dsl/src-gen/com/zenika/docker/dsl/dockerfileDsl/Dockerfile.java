/**
 */
package com.zenika.docker.dsl.dockerfileDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dockerfile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.zenika.docker.dsl.dockerfileDsl.Dockerfile#getInstructions <em>Instructions</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.zenika.docker.dsl.dockerfileDsl.DockerfileDslPackage#getDockerfile()
 * @model
 * @generated
 */
public interface Dockerfile extends EObject
{
  /**
   * Returns the value of the '<em><b>Instructions</b></em>' containment reference list.
   * The list contents are of type {@link com.zenika.docker.dsl.dockerfileDsl.Instruction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instructions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instructions</em>' containment reference list.
   * @see com.zenika.docker.dsl.dockerfileDsl.DockerfileDslPackage#getDockerfile_Instructions()
   * @model containment="true"
   * @generated
   */
  EList<Instruction> getInstructions();

} // Dockerfile
