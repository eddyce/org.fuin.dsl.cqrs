/**
 */
package org.fuin.dsl.cqrs.cqrsDSL.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.fuin.dsl.cqrs.cqrsDSL.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CqrsDSLFactoryImpl extends EFactoryImpl implements CqrsDSLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static CqrsDSLFactory init()
  {
    try
    {
      CqrsDSLFactory theCqrsDSLFactory = (CqrsDSLFactory)EPackage.Registry.INSTANCE.getEFactory(CqrsDSLPackage.eNS_URI);
      if (theCqrsDSLFactory != null)
      {
        return theCqrsDSLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new CqrsDSLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CqrsDSLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case CqrsDSLPackage.DOMAIN_MODEL: return createDomainModel();
      case CqrsDSLPackage.CONTEXT: return createContext();
      case CqrsDSLPackage.NAMESPACE: return createNamespace();
      case CqrsDSLPackage.ABSTRACT_ELEMENT: return createAbstractElement();
      case CqrsDSLPackage.COMMAND: return createCommand();
      case CqrsDSLPackage.COMMAND_HANDLER: return createCommandHandler();
      case CqrsDSLPackage.PROJECTION: return createProjection();
      case CqrsDSLPackage.VIEW: return createView();
      case CqrsDSLPackage.TYPE_META_INFO: return createTypeMetaInfo();
      case CqrsDSLPackage.BOOLEAN_LITERAL: return createBooleanLiteral();
      case CqrsDSLPackage.NULL_LITERAL: return createNullLiteral();
      case CqrsDSLPackage.NUMBER_LITERAL: return createNumberLiteral();
      case CqrsDSLPackage.STRING_LITERAL: return createStringLiteral();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainModel createDomainModel()
  {
    DomainModelImpl domainModel = new DomainModelImpl();
    return domainModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Context createContext()
  {
    ContextImpl context = new ContextImpl();
    return context;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Namespace createNamespace()
  {
    NamespaceImpl namespace = new NamespaceImpl();
    return namespace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractElement createAbstractElement()
  {
    AbstractElementImpl abstractElement = new AbstractElementImpl();
    return abstractElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Command createCommand()
  {
    CommandImpl command = new CommandImpl();
    return command;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CommandHandler createCommandHandler()
  {
    CommandHandlerImpl commandHandler = new CommandHandlerImpl();
    return commandHandler;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Projection createProjection()
  {
    ProjectionImpl projection = new ProjectionImpl();
    return projection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public View createView()
  {
    ViewImpl view = new ViewImpl();
    return view;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeMetaInfo createTypeMetaInfo()
  {
    TypeMetaInfoImpl typeMetaInfo = new TypeMetaInfoImpl();
    return typeMetaInfo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanLiteral createBooleanLiteral()
  {
    BooleanLiteralImpl booleanLiteral = new BooleanLiteralImpl();
    return booleanLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NullLiteral createNullLiteral()
  {
    NullLiteralImpl nullLiteral = new NullLiteralImpl();
    return nullLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberLiteral createNumberLiteral()
  {
    NumberLiteralImpl numberLiteral = new NumberLiteralImpl();
    return numberLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringLiteral createStringLiteral()
  {
    StringLiteralImpl stringLiteral = new StringLiteralImpl();
    return stringLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CqrsDSLPackage getCqrsDSLPackage()
  {
    return (CqrsDSLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static CqrsDSLPackage getPackage()
  {
    return CqrsDSLPackage.eINSTANCE;
  }

} //CqrsDSLFactoryImpl
