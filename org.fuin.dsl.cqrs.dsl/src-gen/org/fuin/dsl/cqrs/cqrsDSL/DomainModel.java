/**
 */
package org.fuin.dsl.cqrs.cqrsDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.fuin.dsl.cqrs.cqrsDSL.DomainModel#getContexts <em>Contexts</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.fuin.dsl.cqrs.cqrsDSL.CqrsDSLPackage#getDomainModel()
 * @model
 * @generated
 */
public interface DomainModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Contexts</b></em>' containment reference list.
   * The list contents are of type {@link org.fuin.dsl.cqrs.cqrsDSL.Context}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contexts</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contexts</em>' containment reference list.
   * @see org.fuin.dsl.cqrs.cqrsDSL.CqrsDSLPackage#getDomainModel_Contexts()
   * @model containment="true"
   * @generated
   */
  EList<Context> getContexts();

} // DomainModel
