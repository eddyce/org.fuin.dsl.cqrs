/**
 */
package org.fuin.dsl.cqrs.cqrsDSL;

import org.eclipse.emf.common.util.EList;

import org.fuin.dsl.ddd.domainDrivenDesignDsl.Aggregate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.fuin.dsl.cqrs.cqrsDSL.CommandHandler#getCommands <em>Commands</em>}</li>
 *   <li>{@link org.fuin.dsl.cqrs.cqrsDSL.CommandHandler#getAggregates <em>Aggregates</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.fuin.dsl.cqrs.cqrsDSL.CqrsDSLPackage#getCommandHandler()
 * @model
 * @generated
 */
public interface CommandHandler extends AbstractElement
{
  /**
   * Returns the value of the '<em><b>Commands</b></em>' reference list.
   * The list contents are of type {@link org.fuin.dsl.cqrs.cqrsDSL.Command}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Commands</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Commands</em>' reference list.
   * @see org.fuin.dsl.cqrs.cqrsDSL.CqrsDSLPackage#getCommandHandler_Commands()
   * @model
   * @generated
   */
  EList<Command> getCommands();

  /**
   * Returns the value of the '<em><b>Aggregates</b></em>' reference list.
   * The list contents are of type {@link org.fuin.dsl.ddd.domainDrivenDesignDsl.Aggregate}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Aggregates</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aggregates</em>' reference list.
   * @see org.fuin.dsl.cqrs.cqrsDSL.CqrsDSLPackage#getCommandHandler_Aggregates()
   * @model
   * @generated
   */
  EList<Aggregate> getAggregates();

} // CommandHandler
