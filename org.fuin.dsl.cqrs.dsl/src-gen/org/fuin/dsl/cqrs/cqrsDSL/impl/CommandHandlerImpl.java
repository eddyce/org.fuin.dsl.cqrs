/**
 */
package org.fuin.dsl.cqrs.cqrsDSL.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.fuin.dsl.cqrs.cqrsDSL.Command;
import org.fuin.dsl.cqrs.cqrsDSL.CommandHandler;
import org.fuin.dsl.cqrs.cqrsDSL.CqrsDSLPackage;

import org.fuin.dsl.ddd.domainDrivenDesignDsl.Aggregate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Command Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.fuin.dsl.cqrs.cqrsDSL.impl.CommandHandlerImpl#getCommands <em>Commands</em>}</li>
 *   <li>{@link org.fuin.dsl.cqrs.cqrsDSL.impl.CommandHandlerImpl#getAggregates <em>Aggregates</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommandHandlerImpl extends AbstractElementImpl implements CommandHandler
{
  /**
   * The cached value of the '{@link #getCommands() <em>Commands</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCommands()
   * @generated
   * @ordered
   */
  protected EList<Command> commands;

  /**
   * The cached value of the '{@link #getAggregates() <em>Aggregates</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAggregates()
   * @generated
   * @ordered
   */
  protected EList<Aggregate> aggregates;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CommandHandlerImpl()
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
    return CqrsDSLPackage.Literals.COMMAND_HANDLER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Command> getCommands()
  {
    if (commands == null)
    {
      commands = new EObjectResolvingEList<Command>(Command.class, this, CqrsDSLPackage.COMMAND_HANDLER__COMMANDS);
    }
    return commands;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Aggregate> getAggregates()
  {
    if (aggregates == null)
    {
      aggregates = new EObjectResolvingEList<Aggregate>(Aggregate.class, this, CqrsDSLPackage.COMMAND_HANDLER__AGGREGATES);
    }
    return aggregates;
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
      case CqrsDSLPackage.COMMAND_HANDLER__COMMANDS:
        return getCommands();
      case CqrsDSLPackage.COMMAND_HANDLER__AGGREGATES:
        return getAggregates();
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
      case CqrsDSLPackage.COMMAND_HANDLER__COMMANDS:
        getCommands().clear();
        getCommands().addAll((Collection<? extends Command>)newValue);
        return;
      case CqrsDSLPackage.COMMAND_HANDLER__AGGREGATES:
        getAggregates().clear();
        getAggregates().addAll((Collection<? extends Aggregate>)newValue);
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
      case CqrsDSLPackage.COMMAND_HANDLER__COMMANDS:
        getCommands().clear();
        return;
      case CqrsDSLPackage.COMMAND_HANDLER__AGGREGATES:
        getAggregates().clear();
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
      case CqrsDSLPackage.COMMAND_HANDLER__COMMANDS:
        return commands != null && !commands.isEmpty();
      case CqrsDSLPackage.COMMAND_HANDLER__AGGREGATES:
        return aggregates != null && !aggregates.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //CommandHandlerImpl
