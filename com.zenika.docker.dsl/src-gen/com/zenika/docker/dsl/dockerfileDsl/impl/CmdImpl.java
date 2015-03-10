/**
 */
package com.zenika.docker.dsl.dockerfileDsl.impl;

import com.zenika.docker.dsl.dockerfileDsl.Cmd;
import com.zenika.docker.dsl.dockerfileDsl.DockerfileDslPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cmd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.zenika.docker.dsl.dockerfileDsl.impl.CmdImpl#getExecutable <em>Executable</em>}</li>
 *   <li>{@link com.zenika.docker.dsl.dockerfileDsl.impl.CmdImpl#getParams <em>Params</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CmdImpl extends InstructionImpl implements Cmd
{
  /**
   * The default value of the '{@link #getExecutable() <em>Executable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExecutable()
   * @generated
   * @ordered
   */
  protected static final String EXECUTABLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExecutable() <em>Executable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExecutable()
   * @generated
   * @ordered
   */
  protected String executable = EXECUTABLE_EDEFAULT;

  /**
   * The cached value of the '{@link #getParams() <em>Params</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParams()
   * @generated
   * @ordered
   */
  protected EList<String> params;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CmdImpl()
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
    return DockerfileDslPackage.Literals.CMD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getExecutable()
  {
    return executable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExecutable(String newExecutable)
  {
    String oldExecutable = executable;
    executable = newExecutable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DockerfileDslPackage.CMD__EXECUTABLE, oldExecutable, executable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getParams()
  {
    if (params == null)
    {
      params = new EDataTypeEList<String>(String.class, this, DockerfileDslPackage.CMD__PARAMS);
    }
    return params;
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
      case DockerfileDslPackage.CMD__EXECUTABLE:
        return getExecutable();
      case DockerfileDslPackage.CMD__PARAMS:
        return getParams();
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
      case DockerfileDslPackage.CMD__EXECUTABLE:
        setExecutable((String)newValue);
        return;
      case DockerfileDslPackage.CMD__PARAMS:
        getParams().clear();
        getParams().addAll((Collection<? extends String>)newValue);
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
      case DockerfileDslPackage.CMD__EXECUTABLE:
        setExecutable(EXECUTABLE_EDEFAULT);
        return;
      case DockerfileDslPackage.CMD__PARAMS:
        getParams().clear();
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
      case DockerfileDslPackage.CMD__EXECUTABLE:
        return EXECUTABLE_EDEFAULT == null ? executable != null : !EXECUTABLE_EDEFAULT.equals(executable);
      case DockerfileDslPackage.CMD__PARAMS:
        return params != null && !params.isEmpty();
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
    result.append(" (executable: ");
    result.append(executable);
    result.append(", params: ");
    result.append(params);
    result.append(')');
    return result.toString();
  }

} //CmdImpl
