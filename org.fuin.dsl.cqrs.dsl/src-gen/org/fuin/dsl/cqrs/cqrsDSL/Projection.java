/**
 */
package org.fuin.dsl.cqrs.cqrsDSL;

import org.eclipse.emf.common.util.EList;

import org.fuin.dsl.ddd.domainDrivenDesignDsl.Event;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Projection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.fuin.dsl.cqrs.cqrsDSL.Projection#getEvents <em>Events</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.fuin.dsl.cqrs.cqrsDSL.CqrsDSLPackage#getProjection()
 * @model
 * @generated
 */
public interface Projection extends AbstractElement
{
  /**
   * Returns the value of the '<em><b>Events</b></em>' reference list.
   * The list contents are of type {@link org.fuin.dsl.ddd.domainDrivenDesignDsl.Event}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Events</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Events</em>' reference list.
   * @see org.fuin.dsl.cqrs.cqrsDSL.CqrsDSLPackage#getProjection_Events()
   * @model
   * @generated
   */
  EList<Event> getEvents();

} // Projection
