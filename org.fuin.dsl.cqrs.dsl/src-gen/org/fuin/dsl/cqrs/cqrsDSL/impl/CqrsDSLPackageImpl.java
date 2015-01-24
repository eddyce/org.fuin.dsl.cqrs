/**
 */
package org.fuin.dsl.cqrs.cqrsDSL.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.fuin.dsl.cqrs.cqrsDSL.AbstractElement;
import org.fuin.dsl.cqrs.cqrsDSL.BooleanLiteral;
import org.fuin.dsl.cqrs.cqrsDSL.Command;
import org.fuin.dsl.cqrs.cqrsDSL.CommandHandler;
import org.fuin.dsl.cqrs.cqrsDSL.Context;
import org.fuin.dsl.cqrs.cqrsDSL.CqrsDSLFactory;
import org.fuin.dsl.cqrs.cqrsDSL.CqrsDSLPackage;
import org.fuin.dsl.cqrs.cqrsDSL.DomainModel;
import org.fuin.dsl.cqrs.cqrsDSL.Namespace;
import org.fuin.dsl.cqrs.cqrsDSL.NullLiteral;
import org.fuin.dsl.cqrs.cqrsDSL.NumberLiteral;
import org.fuin.dsl.cqrs.cqrsDSL.Projection;
import org.fuin.dsl.cqrs.cqrsDSL.StringLiteral;
import org.fuin.dsl.cqrs.cqrsDSL.TypeMetaInfo;
import org.fuin.dsl.cqrs.cqrsDSL.View;

import org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CqrsDSLPackageImpl extends EPackageImpl implements CqrsDSLPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass domainModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass contextEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass namespaceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass commandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass commandHandlerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass projectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass viewEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeMetaInfoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nullLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numberLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringLiteralEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.fuin.dsl.cqrs.cqrsDSL.CqrsDSLPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private CqrsDSLPackageImpl()
  {
    super(eNS_URI, CqrsDSLFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link CqrsDSLPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static CqrsDSLPackage init()
  {
    if (isInited) return (CqrsDSLPackage)EPackage.Registry.INSTANCE.getEPackage(CqrsDSLPackage.eNS_URI);

    // Obtain or create and register package
    CqrsDSLPackageImpl theCqrsDSLPackage = (CqrsDSLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CqrsDSLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CqrsDSLPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    DomainDrivenDesignDslPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theCqrsDSLPackage.createPackageContents();

    // Initialize created meta-data
    theCqrsDSLPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theCqrsDSLPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(CqrsDSLPackage.eNS_URI, theCqrsDSLPackage);
    return theCqrsDSLPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDomainModel()
  {
    return domainModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDomainModel_Contexts()
  {
    return (EReference)domainModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContext()
  {
    return contextEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContext_Name()
  {
    return (EAttribute)contextEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContext_Namespaces()
  {
    return (EReference)contextEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNamespace()
  {
    return namespaceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNamespace_Name()
  {
    return (EAttribute)namespaceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNamespace_Imports()
  {
    return (EReference)namespaceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNamespace_Elements()
  {
    return (EReference)namespaceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractElement()
  {
    return abstractElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractElement_Doc()
  {
    return (EAttribute)abstractElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractElement_Name()
  {
    return (EAttribute)abstractElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCommand()
  {
    return commandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCommand_Target()
  {
    return (EReference)commandEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCommand_Acceptable()
  {
    return (EReference)commandEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCommand_Attributes()
  {
    return (EReference)commandEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCommand_Message()
  {
    return (EAttribute)commandEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCommandHandler()
  {
    return commandHandlerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCommandHandler_Commands()
  {
    return (EReference)commandHandlerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCommandHandler_Aggregates()
  {
    return (EReference)commandHandlerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProjection()
  {
    return projectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProjection_Events()
  {
    return (EReference)projectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getView()
  {
    return viewEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getView_Projection()
  {
    return (EReference)viewEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeMetaInfo()
  {
    return typeMetaInfoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanLiteral()
  {
    return booleanLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNullLiteral()
  {
    return nullLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumberLiteral()
  {
    return numberLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringLiteral()
  {
    return stringLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CqrsDSLFactory getCqrsDSLFactory()
  {
    return (CqrsDSLFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    domainModelEClass = createEClass(DOMAIN_MODEL);
    createEReference(domainModelEClass, DOMAIN_MODEL__CONTEXTS);

    contextEClass = createEClass(CONTEXT);
    createEAttribute(contextEClass, CONTEXT__NAME);
    createEReference(contextEClass, CONTEXT__NAMESPACES);

    namespaceEClass = createEClass(NAMESPACE);
    createEAttribute(namespaceEClass, NAMESPACE__NAME);
    createEReference(namespaceEClass, NAMESPACE__IMPORTS);
    createEReference(namespaceEClass, NAMESPACE__ELEMENTS);

    abstractElementEClass = createEClass(ABSTRACT_ELEMENT);
    createEAttribute(abstractElementEClass, ABSTRACT_ELEMENT__DOC);
    createEAttribute(abstractElementEClass, ABSTRACT_ELEMENT__NAME);

    commandEClass = createEClass(COMMAND);
    createEReference(commandEClass, COMMAND__TARGET);
    createEReference(commandEClass, COMMAND__ACCEPTABLE);
    createEReference(commandEClass, COMMAND__ATTRIBUTES);
    createEAttribute(commandEClass, COMMAND__MESSAGE);

    commandHandlerEClass = createEClass(COMMAND_HANDLER);
    createEReference(commandHandlerEClass, COMMAND_HANDLER__COMMANDS);
    createEReference(commandHandlerEClass, COMMAND_HANDLER__AGGREGATES);

    projectionEClass = createEClass(PROJECTION);
    createEReference(projectionEClass, PROJECTION__EVENTS);

    viewEClass = createEClass(VIEW);
    createEReference(viewEClass, VIEW__PROJECTION);

    typeMetaInfoEClass = createEClass(TYPE_META_INFO);

    booleanLiteralEClass = createEClass(BOOLEAN_LITERAL);

    nullLiteralEClass = createEClass(NULL_LITERAL);

    numberLiteralEClass = createEClass(NUMBER_LITERAL);

    stringLiteralEClass = createEClass(STRING_LITERAL);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    DomainDrivenDesignDslPackage theDomainDrivenDesignDslPackage = (DomainDrivenDesignDslPackage)EPackage.Registry.INSTANCE.getEPackage(DomainDrivenDesignDslPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    commandEClass.getESuperTypes().add(this.getAbstractElement());
    commandHandlerEClass.getESuperTypes().add(this.getAbstractElement());
    projectionEClass.getESuperTypes().add(this.getAbstractElement());
    viewEClass.getESuperTypes().add(this.getAbstractElement());
    typeMetaInfoEClass.getESuperTypes().add(theDomainDrivenDesignDslPackage.getTypeMetaInfo());
    booleanLiteralEClass.getESuperTypes().add(theDomainDrivenDesignDslPackage.getBooleanLiteral());
    nullLiteralEClass.getESuperTypes().add(theDomainDrivenDesignDslPackage.getNullLiteral());
    numberLiteralEClass.getESuperTypes().add(theDomainDrivenDesignDslPackage.getNumberLiteral());
    stringLiteralEClass.getESuperTypes().add(theDomainDrivenDesignDslPackage.getStringLiteral());

    // Initialize classes and features; add operations and parameters
    initEClass(domainModelEClass, DomainModel.class, "DomainModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDomainModel_Contexts(), this.getContext(), null, "contexts", null, 0, -1, DomainModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(contextEClass, Context.class, "Context", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getContext_Name(), ecorePackage.getEString(), "name", null, 0, 1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContext_Namespaces(), this.getNamespace(), null, "namespaces", null, 0, -1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(namespaceEClass, Namespace.class, "Namespace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNamespace_Name(), ecorePackage.getEString(), "name", null, 0, 1, Namespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNamespace_Imports(), theDomainDrivenDesignDslPackage.getImport(), null, "imports", null, 0, -1, Namespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNamespace_Elements(), this.getAbstractElement(), null, "elements", null, 0, -1, Namespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractElementEClass, AbstractElement.class, "AbstractElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAbstractElement_Doc(), ecorePackage.getEString(), "doc", null, 0, 1, AbstractElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAbstractElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, AbstractElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(commandEClass, Command.class, "Command", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCommand_Target(), theDomainDrivenDesignDslPackage.getAbstractMethod(), null, "target", null, 0, 1, Command.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCommand_Acceptable(), theDomainDrivenDesignDslPackage.getDuration(), null, "acceptable", null, 0, 1, Command.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCommand_Attributes(), theDomainDrivenDesignDslPackage.getAttribute(), null, "attributes", null, 0, -1, Command.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCommand_Message(), ecorePackage.getEString(), "message", null, 0, 1, Command.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(commandHandlerEClass, CommandHandler.class, "CommandHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCommandHandler_Commands(), this.getCommand(), null, "commands", null, 0, -1, CommandHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCommandHandler_Aggregates(), theDomainDrivenDesignDslPackage.getAggregate(), null, "aggregates", null, 0, -1, CommandHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(projectionEClass, Projection.class, "Projection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getProjection_Events(), theDomainDrivenDesignDslPackage.getEvent(), null, "events", null, 0, -1, Projection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(viewEClass, View.class, "View", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getView_Projection(), this.getProjection(), null, "projection", null, 0, 1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeMetaInfoEClass, TypeMetaInfo.class, "TypeMetaInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(booleanLiteralEClass, BooleanLiteral.class, "BooleanLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(nullLiteralEClass, NullLiteral.class, "NullLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(numberLiteralEClass, NumberLiteral.class, "NumberLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(stringLiteralEClass, StringLiteral.class, "StringLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //CqrsDSLPackageImpl
