/**
 */
package org.fuin.dsl.cqrs.cqrsDSL;

import org.eclipse.emf.common.util.EList;

import org.fuin.dsl.ddd.domainDrivenDesignDsl.AbstractMethod;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Attribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.fuin.dsl.cqrs.cqrsDSL.Command#getTarget <em>Target</em>}</li>
 *   <li>{@link org.fuin.dsl.cqrs.cqrsDSL.Command#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.fuin.dsl.cqrs.cqrsDSL.Command#getMessage <em>Message</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.fuin.dsl.cqrs.cqrsDSL.CqrsDSLPackage#getCommand()
 * @model
 * @generated
 */
public interface Command extends AbstractElement
{
  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(AbstractMethod)
   * @see org.fuin.dsl.cqrs.cqrsDSL.CqrsDSLPackage#getCommand_Target()
   * @model
   * @generated
   */
  AbstractMethod getTarget();

  /**
   * Sets the value of the '{@link org.fuin.dsl.cqrs.cqrsDSL.Command#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(AbstractMethod value);

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link org.fuin.dsl.ddd.domainDrivenDesignDsl.Attribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see org.fuin.dsl.cqrs.cqrsDSL.CqrsDSLPackage#getCommand_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<Attribute> getAttributes();

  /**
   * Returns the value of the '<em><b>Message</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Message</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Message</em>' attribute.
   * @see #setMessage(String)
   * @see org.fuin.dsl.cqrs.cqrsDSL.CqrsDSLPackage#getCommand_Message()
   * @model
   * @generated
   */
  String getMessage();

  /**
   * Sets the value of the '{@link org.fuin.dsl.cqrs.cqrsDSL.Command#getMessage <em>Message</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Message</em>' attribute.
   * @see #getMessage()
   * @generated
   */
  void setMessage(String value);

} // Command
