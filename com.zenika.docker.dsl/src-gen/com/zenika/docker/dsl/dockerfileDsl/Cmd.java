/**
 */
package com.zenika.docker.dsl.dockerfileDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.zenika.docker.dsl.dockerfileDsl.Cmd#getExecutable <em>Executable</em>}</li>
 *   <li>{@link com.zenika.docker.dsl.dockerfileDsl.Cmd#getParams <em>Params</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.zenika.docker.dsl.dockerfileDsl.DockerfileDslPackage#getCmd()
 * @model
 * @generated
 */
public interface Cmd extends Instruction
{
  /**
   * Returns the value of the '<em><b>Executable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Executable</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Executable</em>' attribute.
   * @see #setExecutable(String)
   * @see com.zenika.docker.dsl.dockerfileDsl.DockerfileDslPackage#getCmd_Executable()
   * @model
   * @generated
   */
  String getExecutable();

  /**
   * Sets the value of the '{@link com.zenika.docker.dsl.dockerfileDsl.Cmd#getExecutable <em>Executable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Executable</em>' attribute.
   * @see #getExecutable()
   * @generated
   */
  void setExecutable(String value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' attribute list.
   * @see com.zenika.docker.dsl.dockerfileDsl.DockerfileDslPackage#getCmd_Params()
   * @model unique="false"
   * @generated
   */
  EList<String> getParams();

} // Cmd
