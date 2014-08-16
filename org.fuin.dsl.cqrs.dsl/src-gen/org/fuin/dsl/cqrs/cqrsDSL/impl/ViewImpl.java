/**
 */
package org.fuin.dsl.cqrs.cqrsDSL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.fuin.dsl.cqrs.cqrsDSL.CqrsDSLPackage;
import org.fuin.dsl.cqrs.cqrsDSL.Projection;
import org.fuin.dsl.cqrs.cqrsDSL.View;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.fuin.dsl.cqrs.cqrsDSL.impl.ViewImpl#getProjection <em>Projection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ViewImpl extends AbstractElementImpl implements View
{
  /**
   * The cached value of the '{@link #getProjection() <em>Projection</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProjection()
   * @generated
   * @ordered
   */
  protected Projection projection;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ViewImpl()
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
    return CqrsDSLPackage.Literals.VIEW;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Projection getProjection()
  {
    if (projection != null && projection.eIsProxy())
    {
      InternalEObject oldProjection = (InternalEObject)projection;
      projection = (Projection)eResolveProxy(oldProjection);
      if (projection != oldProjection)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CqrsDSLPackage.VIEW__PROJECTION, oldProjection, projection));
      }
    }
    return projection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Projection basicGetProjection()
  {
    return projection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProjection(Projection newProjection)
  {
    Projection oldProjection = projection;
    projection = newProjection;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CqrsDSLPackage.VIEW__PROJECTION, oldProjection, projection));
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
      case CqrsDSLPackage.VIEW__PROJECTION:
        if (resolve) return getProjection();
        return basicGetProjection();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CqrsDSLPackage.VIEW__PROJECTION:
        setProjection((Projection)newValue);
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
      case CqrsDSLPackage.VIEW__PROJECTION:
        setProjection((Projection)null);
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
      case CqrsDSLPackage.VIEW__PROJECTION:
        return projection != null;
    }
    return super.eIsSet(featureID);
  }

} //ViewImpl
