/**
 */
package org.fuin.dsl.cqrs.cqrsDSL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.fuin.dsl.cqrs.cqrsDSL.CqrsDSLFactory
 * @model kind="package"
 * @generated
 */
public interface CqrsDSLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "cqrsDSL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.fuin.org/cqrs-dsl/CqrsDSL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "cqrsDSL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CqrsDSLPackage eINSTANCE = org.fuin.dsl.cqrs.cqrsDSL.impl.CqrsDSLPackageImpl.init();

  /**
   * The meta object id for the '{@link org.fuin.dsl.cqrs.cqrsDSL.impl.DomainModelImpl <em>Domain Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.fuin.dsl.cqrs.cqrsDSL.impl.DomainModelImpl
   * @see org.fuin.dsl.cqrs.cqrsDSL.impl.CqrsDSLPackageImpl#getDomainModel()
   * @generated
   */
  int DOMAIN_MODEL = 0;

  /**
   * The feature id for the '<em><b>Contexts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_MODEL__CONTEXTS = 0;

  /**
   * The number of structural features of the '<em>Domain Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.fuin.dsl.cqrs.cqrsDSL.impl.ContextImpl <em>Context</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.fuin.dsl.cqrs.cqrsDSL.impl.ContextImpl
   * @see org.fuin.dsl.cqrs.cqrsDSL.impl.CqrsDSLPackageImpl#getContext()
   * @generated
   */
  int CONTEXT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT__NAME = 0;

  /**
   * The feature id for the '<em><b>Namespaces</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT__NAMESPACES = 1;

  /**
   * The number of structural features of the '<em>Context</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.fuin.dsl.cqrs.cqrsDSL.impl.NamespaceImpl <em>Namespace</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.fuin.dsl.cqrs.cqrsDSL.impl.NamespaceImpl
   * @see org.fuin.dsl.cqrs.cqrsDSL.impl.CqrsDSLPackageImpl#getNamespace()
   * @generated
   */
  int NAMESPACE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE__NAME = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE__IMPORTS = 1;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE__ELEMENTS = 2;

  /**
   * The number of structural features of the '<em>Namespace</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.fuin.dsl.cqrs.cqrsDSL.impl.AbstractElementImpl <em>Abstract Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.fuin.dsl.cqrs.cqrsDSL.impl.AbstractElementImpl
   * @see org.fuin.dsl.cqrs.cqrsDSL.impl.CqrsDSLPackageImpl#getAbstractElement()
   * @generated
   */
  int ABSTRACT_ELEMENT = 3;

  /**
   * The feature id for the '<em><b>Doc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ELEMENT__DOC = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ELEMENT__NAME = 1;

  /**
   * The number of structural features of the '<em>Abstract Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ELEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.fuin.dsl.cqrs.cqrsDSL.impl.CommandImpl <em>Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.fuin.dsl.cqrs.cqrsDSL.impl.CommandImpl
   * @see org.fuin.dsl.cqrs.cqrsDSL.impl.CqrsDSLPackageImpl#getCommand()
   * @generated
   */
  int COMMAND = 4;

  /**
   * The feature id for the '<em><b>Doc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__DOC = ABSTRACT_ELEMENT__DOC;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__NAME = ABSTRACT_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__TARGET = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__ATTRIBUTES = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Message</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__MESSAGE = ABSTRACT_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.fuin.dsl.cqrs.cqrsDSL.impl.CommandHandlerImpl <em>Command Handler</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.fuin.dsl.cqrs.cqrsDSL.impl.CommandHandlerImpl
   * @see org.fuin.dsl.cqrs.cqrsDSL.impl.CqrsDSLPackageImpl#getCommandHandler()
   * @generated
   */
  int COMMAND_HANDLER = 5;

  /**
   * The feature id for the '<em><b>Doc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND_HANDLER__DOC = ABSTRACT_ELEMENT__DOC;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND_HANDLER__NAME = ABSTRACT_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Commands</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND_HANDLER__COMMANDS = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Aggregates</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND_HANDLER__AGGREGATES = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Command Handler</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND_HANDLER_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.fuin.dsl.cqrs.cqrsDSL.impl.ProjectionImpl <em>Projection</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.fuin.dsl.cqrs.cqrsDSL.impl.ProjectionImpl
   * @see org.fuin.dsl.cqrs.cqrsDSL.impl.CqrsDSLPackageImpl#getProjection()
   * @generated
   */
  int PROJECTION = 6;

  /**
   * The feature id for the '<em><b>Doc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECTION__DOC = ABSTRACT_ELEMENT__DOC;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECTION__NAME = ABSTRACT_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Events</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECTION__EVENTS = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Projection</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECTION_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.fuin.dsl.cqrs.cqrsDSL.impl.ViewImpl <em>View</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.fuin.dsl.cqrs.cqrsDSL.impl.ViewImpl
   * @see org.fuin.dsl.cqrs.cqrsDSL.impl.CqrsDSLPackageImpl#getView()
   * @generated
   */
  int VIEW = 7;

  /**
   * The feature id for the '<em><b>Doc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW__DOC = ABSTRACT_ELEMENT__DOC;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW__NAME = ABSTRACT_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Projection</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW__PROJECTION = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>View</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.fuin.dsl.cqrs.cqrsDSL.impl.TypeMetaInfoImpl <em>Type Meta Info</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.fuin.dsl.cqrs.cqrsDSL.impl.TypeMetaInfoImpl
   * @see org.fuin.dsl.cqrs.cqrsDSL.impl.CqrsDSLPackageImpl#getTypeMetaInfo()
   * @generated
   */
  int TYPE_META_INFO = 8;

  /**
   * The feature id for the '<em><b>Slabel</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_META_INFO__SLABEL = DomainDrivenDesignDslPackage.TYPE_META_INFO__SLABEL;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_META_INFO__LABEL = DomainDrivenDesignDslPackage.TYPE_META_INFO__LABEL;

  /**
   * The feature id for the '<em><b>Tooltip</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_META_INFO__TOOLTIP = DomainDrivenDesignDslPackage.TYPE_META_INFO__TOOLTIP;

  /**
   * The feature id for the '<em><b>Prompt</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_META_INFO__PROMPT = DomainDrivenDesignDslPackage.TYPE_META_INFO__PROMPT;

  /**
   * The feature id for the '<em><b>Examples</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_META_INFO__EXAMPLES = DomainDrivenDesignDslPackage.TYPE_META_INFO__EXAMPLES;

  /**
   * The number of structural features of the '<em>Type Meta Info</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_META_INFO_FEATURE_COUNT = DomainDrivenDesignDslPackage.TYPE_META_INFO_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.fuin.dsl.cqrs.cqrsDSL.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.fuin.dsl.cqrs.cqrsDSL.impl.BooleanLiteralImpl
   * @see org.fuin.dsl.cqrs.cqrsDSL.impl.CqrsDSLPackageImpl#getBooleanLiteral()
   * @generated
   */
  int BOOLEAN_LITERAL = 9;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL__VALUE = DomainDrivenDesignDslPackage.BOOLEAN_LITERAL__VALUE;

  /**
   * The number of structural features of the '<em>Boolean Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL_FEATURE_COUNT = DomainDrivenDesignDslPackage.BOOLEAN_LITERAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.fuin.dsl.cqrs.cqrsDSL.impl.NullLiteralImpl <em>Null Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.fuin.dsl.cqrs.cqrsDSL.impl.NullLiteralImpl
   * @see org.fuin.dsl.cqrs.cqrsDSL.impl.CqrsDSLPackageImpl#getNullLiteral()
   * @generated
   */
  int NULL_LITERAL = 10;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULL_LITERAL__VALUE = DomainDrivenDesignDslPackage.NULL_LITERAL__VALUE;

  /**
   * The number of structural features of the '<em>Null Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULL_LITERAL_FEATURE_COUNT = DomainDrivenDesignDslPackage.NULL_LITERAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.fuin.dsl.cqrs.cqrsDSL.impl.NumberLiteralImpl <em>Number Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.fuin.dsl.cqrs.cqrsDSL.impl.NumberLiteralImpl
   * @see org.fuin.dsl.cqrs.cqrsDSL.impl.CqrsDSLPackageImpl#getNumberLiteral()
   * @generated
   */
  int NUMBER_LITERAL = 11;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_LITERAL__VALUE = DomainDrivenDesignDslPackage.NUMBER_LITERAL__VALUE;

  /**
   * The number of structural features of the '<em>Number Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_LITERAL_FEATURE_COUNT = DomainDrivenDesignDslPackage.NUMBER_LITERAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.fuin.dsl.cqrs.cqrsDSL.impl.StringLiteralImpl <em>String Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.fuin.dsl.cqrs.cqrsDSL.impl.StringLiteralImpl
   * @see org.fuin.dsl.cqrs.cqrsDSL.impl.CqrsDSLPackageImpl#getStringLiteral()
   * @generated
   */
  int STRING_LITERAL = 12;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__VALUE = DomainDrivenDesignDslPackage.STRING_LITERAL__VALUE;

  /**
   * The number of structural features of the '<em>String Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL_FEATURE_COUNT = DomainDrivenDesignDslPackage.STRING_LITERAL_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link org.fuin.dsl.cqrs.cqrsDSL.DomainModel <em>Domain Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Domain Model</em>'.
   * @see org.fuin.dsl.cqrs.cqrsDSL.DomainModel
   * @generated
   */
  EClass getDomainModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.fuin.dsl.cqrs.cqrsDSL.DomainModel#getContexts <em>Contexts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Contexts</em>'.
   * @see org.fuin.dsl.cqrs.cqrsDSL.DomainModel#getContexts()
   * @see #getDomainModel()
   * @generated
   */
  EReference getDomainModel_Contexts();

  /**
   * Returns the meta object for class '{@link org.fuin.dsl.cqrs.cqrsDSL.Context <em>Context</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Context</em>'.
   * @see org.fuin.dsl.cqrs.cqrsDSL.Context
   * @generated
   */
  EClass getContext();

  /**
   * Returns the meta object for the attribute '{@link org.fuin.dsl.cqrs.cqrsDSL.Context#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.fuin.dsl.cqrs.cqrsDSL.Context#getName()
   * @see #getContext()
   * @generated
   */
  EAttribute getContext_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.fuin.dsl.cqrs.cqrsDSL.Context#getNamespaces <em>Namespaces</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Namespaces</em>'.
   * @see org.fuin.dsl.cqrs.cqrsDSL.Context#getNamespaces()
   * @see #getContext()
   * @generated
   */
  EReference getContext_Namespaces();

  /**
   * Returns the meta object for class '{@link org.fuin.dsl.cqrs.cqrsDSL.Namespace <em>Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Namespace</em>'.
   * @see org.fuin.dsl.cqrs.cqrsDSL.Namespace
   * @generated
   */
  EClass getNamespace();

  /**
   * Returns the meta object for the attribute '{@link org.fuin.dsl.cqrs.cqrsDSL.Namespace#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.fuin.dsl.cqrs.cqrsDSL.Namespace#getName()
   * @see #getNamespace()
   * @generated
   */
  EAttribute getNamespace_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.fuin.dsl.cqrs.cqrsDSL.Namespace#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see org.fuin.dsl.cqrs.cqrsDSL.Namespace#getImports()
   * @see #getNamespace()
   * @generated
   */
  EReference getNamespace_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link org.fuin.dsl.cqrs.cqrsDSL.Namespace#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.fuin.dsl.cqrs.cqrsDSL.Namespace#getElements()
   * @see #getNamespace()
   * @generated
   */
  EReference getNamespace_Elements();

  /**
   * Returns the meta object for class '{@link org.fuin.dsl.cqrs.cqrsDSL.AbstractElement <em>Abstract Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Element</em>'.
   * @see org.fuin.dsl.cqrs.cqrsDSL.AbstractElement
   * @generated
   */
  EClass getAbstractElement();

  /**
   * Returns the meta object for the attribute '{@link org.fuin.dsl.cqrs.cqrsDSL.AbstractElement#getDoc <em>Doc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Doc</em>'.
   * @see org.fuin.dsl.cqrs.cqrsDSL.AbstractElement#getDoc()
   * @see #getAbstractElement()
   * @generated
   */
  EAttribute getAbstractElement_Doc();

  /**
   * Returns the meta object for the attribute '{@link org.fuin.dsl.cqrs.cqrsDSL.AbstractElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.fuin.dsl.cqrs.cqrsDSL.AbstractElement#getName()
   * @see #getAbstractElement()
   * @generated
   */
  EAttribute getAbstractElement_Name();

  /**
   * Returns the meta object for class '{@link org.fuin.dsl.cqrs.cqrsDSL.Command <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Command</em>'.
   * @see org.fuin.dsl.cqrs.cqrsDSL.Command
   * @generated
   */
  EClass getCommand();

  /**
   * Returns the meta object for the reference '{@link org.fuin.dsl.cqrs.cqrsDSL.Command#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see org.fuin.dsl.cqrs.cqrsDSL.Command#getTarget()
   * @see #getCommand()
   * @generated
   */
  EReference getCommand_Target();

  /**
   * Returns the meta object for the containment reference list '{@link org.fuin.dsl.cqrs.cqrsDSL.Command#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see org.fuin.dsl.cqrs.cqrsDSL.Command#getAttributes()
   * @see #getCommand()
   * @generated
   */
  EReference getCommand_Attributes();

  /**
   * Returns the meta object for the attribute '{@link org.fuin.dsl.cqrs.cqrsDSL.Command#getMessage <em>Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Message</em>'.
   * @see org.fuin.dsl.cqrs.cqrsDSL.Command#getMessage()
   * @see #getCommand()
   * @generated
   */
  EAttribute getCommand_Message();

  /**
   * Returns the meta object for class '{@link org.fuin.dsl.cqrs.cqrsDSL.CommandHandler <em>Command Handler</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Command Handler</em>'.
   * @see org.fuin.dsl.cqrs.cqrsDSL.CommandHandler
   * @generated
   */
  EClass getCommandHandler();

  /**
   * Returns the meta object for the reference list '{@link org.fuin.dsl.cqrs.cqrsDSL.CommandHandler#getCommands <em>Commands</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Commands</em>'.
   * @see org.fuin.dsl.cqrs.cqrsDSL.CommandHandler#getCommands()
   * @see #getCommandHandler()
   * @generated
   */
  EReference getCommandHandler_Commands();

  /**
   * Returns the meta object for the reference list '{@link org.fuin.dsl.cqrs.cqrsDSL.CommandHandler#getAggregates <em>Aggregates</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Aggregates</em>'.
   * @see org.fuin.dsl.cqrs.cqrsDSL.CommandHandler#getAggregates()
   * @see #getCommandHandler()
   * @generated
   */
  EReference getCommandHandler_Aggregates();

  /**
   * Returns the meta object for class '{@link org.fuin.dsl.cqrs.cqrsDSL.Projection <em>Projection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Projection</em>'.
   * @see org.fuin.dsl.cqrs.cqrsDSL.Projection
   * @generated
   */
  EClass getProjection();

  /**
   * Returns the meta object for the reference list '{@link org.fuin.dsl.cqrs.cqrsDSL.Projection#getEvents <em>Events</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Events</em>'.
   * @see org.fuin.dsl.cqrs.cqrsDSL.Projection#getEvents()
   * @see #getProjection()
   * @generated
   */
  EReference getProjection_Events();

  /**
   * Returns the meta object for class '{@link org.fuin.dsl.cqrs.cqrsDSL.View <em>View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>View</em>'.
   * @see org.fuin.dsl.cqrs.cqrsDSL.View
   * @generated
   */
  EClass getView();

  /**
   * Returns the meta object for the reference '{@link org.fuin.dsl.cqrs.cqrsDSL.View#getProjection <em>Projection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Projection</em>'.
   * @see org.fuin.dsl.cqrs.cqrsDSL.View#getProjection()
   * @see #getView()
   * @generated
   */
  EReference getView_Projection();

  /**
   * Returns the meta object for class '{@link org.fuin.dsl.cqrs.cqrsDSL.TypeMetaInfo <em>Type Meta Info</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Meta Info</em>'.
   * @see org.fuin.dsl.cqrs.cqrsDSL.TypeMetaInfo
   * @generated
   */
  EClass getTypeMetaInfo();

  /**
   * Returns the meta object for class '{@link org.fuin.dsl.cqrs.cqrsDSL.BooleanLiteral <em>Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Literal</em>'.
   * @see org.fuin.dsl.cqrs.cqrsDSL.BooleanLiteral
   * @generated
   */
  EClass getBooleanLiteral();

  /**
   * Returns the meta object for class '{@link org.fuin.dsl.cqrs.cqrsDSL.NullLiteral <em>Null Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Null Literal</em>'.
   * @see org.fuin.dsl.cqrs.cqrsDSL.NullLiteral
   * @generated
   */
  EClass getNullLiteral();

  /**
   * Returns the meta object for class '{@link org.fuin.dsl.cqrs.cqrsDSL.NumberLiteral <em>Number Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Literal</em>'.
   * @see org.fuin.dsl.cqrs.cqrsDSL.NumberLiteral
   * @generated
   */
  EClass getNumberLiteral();

  /**
   * Returns the meta object for class '{@link org.fuin.dsl.cqrs.cqrsDSL.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Literal</em>'.
   * @see org.fuin.dsl.cqrs.cqrsDSL.StringLiteral
   * @generated
   */
  EClass getStringLiteral();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  CqrsDSLFactory getCqrsDSLFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.fuin.dsl.cqrs.cqrsDSL.impl.DomainModelImpl <em>Domain Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.fuin.dsl.cqrs.cqrsDSL.impl.DomainModelImpl
     * @see org.fuin.dsl.cqrs.cqrsDSL.impl.CqrsDSLPackageImpl#getDomainModel()
     * @generated
     */
    EClass DOMAIN_MODEL = eINSTANCE.getDomainModel();

    /**
     * The meta object literal for the '<em><b>Contexts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN_MODEL__CONTEXTS = eINSTANCE.getDomainModel_Contexts();

    /**
     * The meta object literal for the '{@link org.fuin.dsl.cqrs.cqrsDSL.impl.ContextImpl <em>Context</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.fuin.dsl.cqrs.cqrsDSL.impl.ContextImpl
     * @see org.fuin.dsl.cqrs.cqrsDSL.impl.CqrsDSLPackageImpl#getContext()
     * @generated
     */
    EClass CONTEXT = eINSTANCE.getContext();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTEXT__NAME = eINSTANCE.getContext_Name();

    /**
     * The meta object literal for the '<em><b>Namespaces</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTEXT__NAMESPACES = eINSTANCE.getContext_Namespaces();

    /**
     * The meta object literal for the '{@link org.fuin.dsl.cqrs.cqrsDSL.impl.NamespaceImpl <em>Namespace</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.fuin.dsl.cqrs.cqrsDSL.impl.NamespaceImpl
     * @see org.fuin.dsl.cqrs.cqrsDSL.impl.CqrsDSLPackageImpl#getNamespace()
     * @generated
     */
    EClass NAMESPACE = eINSTANCE.getNamespace();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAMESPACE__NAME = eINSTANCE.getNamespace_Name();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAMESPACE__IMPORTS = eINSTANCE.getNamespace_Imports();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAMESPACE__ELEMENTS = eINSTANCE.getNamespace_Elements();

    /**
     * The meta object literal for the '{@link org.fuin.dsl.cqrs.cqrsDSL.impl.AbstractElementImpl <em>Abstract Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.fuin.dsl.cqrs.cqrsDSL.impl.AbstractElementImpl
     * @see org.fuin.dsl.cqrs.cqrsDSL.impl.CqrsDSLPackageImpl#getAbstractElement()
     * @generated
     */
    EClass ABSTRACT_ELEMENT = eINSTANCE.getAbstractElement();

    /**
     * The meta object literal for the '<em><b>Doc</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_ELEMENT__DOC = eINSTANCE.getAbstractElement_Doc();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_ELEMENT__NAME = eINSTANCE.getAbstractElement_Name();

    /**
     * The meta object literal for the '{@link org.fuin.dsl.cqrs.cqrsDSL.impl.CommandImpl <em>Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.fuin.dsl.cqrs.cqrsDSL.impl.CommandImpl
     * @see org.fuin.dsl.cqrs.cqrsDSL.impl.CqrsDSLPackageImpl#getCommand()
     * @generated
     */
    EClass COMMAND = eINSTANCE.getCommand();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__TARGET = eINSTANCE.getCommand_Target();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__ATTRIBUTES = eINSTANCE.getCommand_Attributes();

    /**
     * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMAND__MESSAGE = eINSTANCE.getCommand_Message();

    /**
     * The meta object literal for the '{@link org.fuin.dsl.cqrs.cqrsDSL.impl.CommandHandlerImpl <em>Command Handler</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.fuin.dsl.cqrs.cqrsDSL.impl.CommandHandlerImpl
     * @see org.fuin.dsl.cqrs.cqrsDSL.impl.CqrsDSLPackageImpl#getCommandHandler()
     * @generated
     */
    EClass COMMAND_HANDLER = eINSTANCE.getCommandHandler();

    /**
     * The meta object literal for the '<em><b>Commands</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND_HANDLER__COMMANDS = eINSTANCE.getCommandHandler_Commands();

    /**
     * The meta object literal for the '<em><b>Aggregates</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND_HANDLER__AGGREGATES = eINSTANCE.getCommandHandler_Aggregates();

    /**
     * The meta object literal for the '{@link org.fuin.dsl.cqrs.cqrsDSL.impl.ProjectionImpl <em>Projection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.fuin.dsl.cqrs.cqrsDSL.impl.ProjectionImpl
     * @see org.fuin.dsl.cqrs.cqrsDSL.impl.CqrsDSLPackageImpl#getProjection()
     * @generated
     */
    EClass PROJECTION = eINSTANCE.getProjection();

    /**
     * The meta object literal for the '<em><b>Events</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROJECTION__EVENTS = eINSTANCE.getProjection_Events();

    /**
     * The meta object literal for the '{@link org.fuin.dsl.cqrs.cqrsDSL.impl.ViewImpl <em>View</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.fuin.dsl.cqrs.cqrsDSL.impl.ViewImpl
     * @see org.fuin.dsl.cqrs.cqrsDSL.impl.CqrsDSLPackageImpl#getView()
     * @generated
     */
    EClass VIEW = eINSTANCE.getView();

    /**
     * The meta object literal for the '<em><b>Projection</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW__PROJECTION = eINSTANCE.getView_Projection();

    /**
     * The meta object literal for the '{@link org.fuin.dsl.cqrs.cqrsDSL.impl.TypeMetaInfoImpl <em>Type Meta Info</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.fuin.dsl.cqrs.cqrsDSL.impl.TypeMetaInfoImpl
     * @see org.fuin.dsl.cqrs.cqrsDSL.impl.CqrsDSLPackageImpl#getTypeMetaInfo()
     * @generated
     */
    EClass TYPE_META_INFO = eINSTANCE.getTypeMetaInfo();

    /**
     * The meta object literal for the '{@link org.fuin.dsl.cqrs.cqrsDSL.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.fuin.dsl.cqrs.cqrsDSL.impl.BooleanLiteralImpl
     * @see org.fuin.dsl.cqrs.cqrsDSL.impl.CqrsDSLPackageImpl#getBooleanLiteral()
     * @generated
     */
    EClass BOOLEAN_LITERAL = eINSTANCE.getBooleanLiteral();

    /**
     * The meta object literal for the '{@link org.fuin.dsl.cqrs.cqrsDSL.impl.NullLiteralImpl <em>Null Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.fuin.dsl.cqrs.cqrsDSL.impl.NullLiteralImpl
     * @see org.fuin.dsl.cqrs.cqrsDSL.impl.CqrsDSLPackageImpl#getNullLiteral()
     * @generated
     */
    EClass NULL_LITERAL = eINSTANCE.getNullLiteral();

    /**
     * The meta object literal for the '{@link org.fuin.dsl.cqrs.cqrsDSL.impl.NumberLiteralImpl <em>Number Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.fuin.dsl.cqrs.cqrsDSL.impl.NumberLiteralImpl
     * @see org.fuin.dsl.cqrs.cqrsDSL.impl.CqrsDSLPackageImpl#getNumberLiteral()
     * @generated
     */
    EClass NUMBER_LITERAL = eINSTANCE.getNumberLiteral();

    /**
     * The meta object literal for the '{@link org.fuin.dsl.cqrs.cqrsDSL.impl.StringLiteralImpl <em>String Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.fuin.dsl.cqrs.cqrsDSL.impl.StringLiteralImpl
     * @see org.fuin.dsl.cqrs.cqrsDSL.impl.CqrsDSLPackageImpl#getStringLiteral()
     * @generated
     */
    EClass STRING_LITERAL = eINSTANCE.getStringLiteral();

  }

} //CqrsDSLPackage
