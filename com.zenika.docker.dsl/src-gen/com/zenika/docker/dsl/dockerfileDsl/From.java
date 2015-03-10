/**
 */
package com.zenika.docker.dsl.dockerfileDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>From</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.zenika.docker.dsl.dockerfileDsl.From#getName <em>Name</em>}</li>
 *   <li>{@link com.zenika.docker.dsl.dockerfileDsl.From#getTag <em>Tag</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.zenika.docker.dsl.dockerfileDsl.DockerfileDslPackage#getFrom()
 * @model
 * @generated
 */
public interface From extends Instruction
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.zenika.docker.dsl.dockerfileDsl.DockerfileDslPackage#getFrom_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.zenika.docker.dsl.dockerfileDsl.From#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Tag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tag</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tag</em>' attribute.
   * @see #setTag(String)
   * @see com.zenika.docker.dsl.dockerfileDsl.DockerfileDslPackage#getFrom_Tag()
   * @model
   * @generated
   */
  String getTag();

  /**
   * Sets the value of the '{@link com.zenika.docker.dsl.dockerfileDsl.From#getTag <em>Tag</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tag</em>' attribute.
   * @see #getTag()
   * @generated
   */
  void setTag(String value);

} // From
