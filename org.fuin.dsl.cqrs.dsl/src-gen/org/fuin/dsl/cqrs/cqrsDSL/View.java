/**
 */
package org.fuin.dsl.cqrs.cqrsDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.fuin.dsl.cqrs.cqrsDSL.View#getProjection <em>Projection</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.fuin.dsl.cqrs.cqrsDSL.CqrsDSLPackage#getView()
 * @model
 * @generated
 */
public interface View extends AbstractElement
{
  /**
   * Returns the value of the '<em><b>Projection</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Projection</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Projection</em>' reference.
   * @see #setProjection(Projection)
   * @see org.fuin.dsl.cqrs.cqrsDSL.CqrsDSLPackage#getView_Projection()
   * @model
   * @generated
   */
  Projection getProjection();

  /**
   * Sets the value of the '{@link org.fuin.dsl.cqrs.cqrsDSL.View#getProjection <em>Projection</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Projection</em>' reference.
   * @see #getProjection()
   * @generated
   */
  void setProjection(Projection value);

} // View
