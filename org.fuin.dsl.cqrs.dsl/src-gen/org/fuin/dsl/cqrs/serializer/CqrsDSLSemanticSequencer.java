package org.fuin.dsl.cqrs.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.fuin.dsl.cqrs.cqrsDSL.BooleanLiteral;
import org.fuin.dsl.cqrs.cqrsDSL.Command;
import org.fuin.dsl.cqrs.cqrsDSL.CommandHandler;
import org.fuin.dsl.cqrs.cqrsDSL.Context;
import org.fuin.dsl.cqrs.cqrsDSL.CqrsDSLPackage;
import org.fuin.dsl.cqrs.cqrsDSL.DomainModel;
import org.fuin.dsl.cqrs.cqrsDSL.Namespace;
import org.fuin.dsl.cqrs.cqrsDSL.NullLiteral;
import org.fuin.dsl.cqrs.cqrsDSL.NumberLiteral;
import org.fuin.dsl.cqrs.cqrsDSL.Projection;
import org.fuin.dsl.cqrs.cqrsDSL.StringLiteral;
import org.fuin.dsl.cqrs.cqrsDSL.TypeMetaInfo;
import org.fuin.dsl.cqrs.cqrsDSL.View;
import org.fuin.dsl.cqrs.services.CqrsDSLGrammarAccess;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.ConstraintInstance;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.DomainDrivenDesignDslPackage;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Import;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Invariants;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.OverriddenTypeMetaInfo;
import org.fuin.dsl.ddd.domainDrivenDesignDsl.Variable;

@SuppressWarnings("all")
public class CqrsDSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private CqrsDSLGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == CqrsDSLPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case CqrsDSLPackage.BOOLEAN_LITERAL:
				if(context == grammarAccess.getBooleanLiteralRule() ||
				   context == grammarAccess.getLiteralRule()) {
					sequence_BooleanLiteral(context, (BooleanLiteral) semanticObject); 
					return; 
				}
				else break;
			case CqrsDSLPackage.COMMAND:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getCommandRule()) {
					sequence_Command(context, (Command) semanticObject); 
					return; 
				}
				else break;
			case CqrsDSLPackage.COMMAND_HANDLER:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getCommandHandlerRule()) {
					sequence_CommandHandler(context, (CommandHandler) semanticObject); 
					return; 
				}
				else break;
			case CqrsDSLPackage.CONTEXT:
				if(context == grammarAccess.getContextRule()) {
					sequence_Context(context, (Context) semanticObject); 
					return; 
				}
				else break;
			case CqrsDSLPackage.DOMAIN_MODEL:
				if(context == grammarAccess.getDomainModelRule()) {
					sequence_DomainModel(context, (DomainModel) semanticObject); 
					return; 
				}
				else break;
			case CqrsDSLPackage.NAMESPACE:
				if(context == grammarAccess.getNamespaceRule()) {
					sequence_Namespace(context, (Namespace) semanticObject); 
					return; 
				}
				else break;
			case CqrsDSLPackage.NULL_LITERAL:
				if(context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getNullLiteralRule()) {
					sequence_NullLiteral(context, (NullLiteral) semanticObject); 
					return; 
				}
				else break;
			case CqrsDSLPackage.NUMBER_LITERAL:
				if(context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getNumberLiteralRule()) {
					sequence_NumberLiteral(context, (NumberLiteral) semanticObject); 
					return; 
				}
				else break;
			case CqrsDSLPackage.PROJECTION:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getProjectionRule()) {
					sequence_Projection(context, (Projection) semanticObject); 
					return; 
				}
				else break;
			case CqrsDSLPackage.STRING_LITERAL:
				if(context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getStringLiteralRule()) {
					sequence_StringLiteral(context, (StringLiteral) semanticObject); 
					return; 
				}
				else break;
			case CqrsDSLPackage.TYPE_META_INFO:
				if(context == grammarAccess.getTypeMetaInfoRule()) {
					sequence_TypeMetaInfo(context, (TypeMetaInfo) semanticObject); 
					return; 
				}
				else break;
			case CqrsDSLPackage.VIEW:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getViewRule()) {
					sequence_View(context, (View) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == DomainDrivenDesignDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case DomainDrivenDesignDslPackage.CONSTRAINT_INSTANCE:
				if(context == grammarAccess.getConstraintInstanceRule()) {
					sequence_ConstraintInstance(context, (ConstraintInstance) semanticObject); 
					return; 
				}
				else break;
			case DomainDrivenDesignDslPackage.IMPORT:
				if(context == grammarAccess.getImportRule()) {
					sequence_Import(context, (Import) semanticObject); 
					return; 
				}
				else break;
			case DomainDrivenDesignDslPackage.INVARIANTS:
				if(context == grammarAccess.getInvariantsRule()) {
					sequence_Invariants(context, (Invariants) semanticObject); 
					return; 
				}
				else break;
			case DomainDrivenDesignDslPackage.OVERRIDDEN_TYPE_META_INFO:
				if(context == grammarAccess.getOverriddenTypeMetaInfoRule()) {
					sequence_OverriddenTypeMetaInfo(context, (OverriddenTypeMetaInfo) semanticObject); 
					return; 
				}
				else break;
			case DomainDrivenDesignDslPackage.VARIABLE:
				if(context == grammarAccess.getVariableRule()) {
					sequence_Variable(context, (Variable) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (value='false' | value='true')
	 */
	protected void sequence_BooleanLiteral(EObject context, BooleanLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (doc=DOC? name=ID commands+=[Command|ID] commands+=[Command|ID]* (aggregates+=[Aggregate|FQN] aggregates+=[Aggregate|FQN]*)?)
	 */
	protected void sequence_CommandHandler(EObject context, CommandHandler semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (doc=DOC? name=ID target=[AbstractMethod|FQN]? variables+=Variable* message=STRING?)
	 */
	protected void sequence_Command(EObject context, Command semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (constraint=[Constraint|ID] (params+=Literal params+=Literal*)?)
	 */
	protected void sequence_ConstraintInstance(EObject context, ConstraintInstance semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID namespaces+=Namespace*)
	 */
	protected void sequence_Context(EObject context, Context semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     contexts+=Context*
	 */
	protected void sequence_DomainModel(EObject context, DomainModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (importedNamespace=FQN | importedNamespace=FQNWithWildcard)
	 */
	protected void sequence_Import(EObject context, Import semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (instances+=ConstraintInstance instances+=ConstraintInstance*)
	 */
	protected void sequence_Invariants(EObject context, Invariants semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=FQN imports+=Import* elements+=AbstractElement*)
	 */
	protected void sequence_Namespace(EObject context, Namespace semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value='null'
	 */
	protected void sequence_NullLiteral(EObject context, NullLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DomainDrivenDesignDslPackage.Literals.LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DomainDrivenDesignDslPackage.Literals.LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNullLiteralAccess().getValueNullKeyword_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=Number
	 */
	protected void sequence_NumberLiteral(EObject context, NumberLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DomainDrivenDesignDslPackage.Literals.LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DomainDrivenDesignDslPackage.Literals.LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNumberLiteralAccess().getValueNumberParserRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     metaInfo=TypeMetaInfo
	 */
	protected void sequence_OverriddenTypeMetaInfo(EObject context, OverriddenTypeMetaInfo semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DomainDrivenDesignDslPackage.Literals.OVERRIDDEN_TYPE_META_INFO__META_INFO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DomainDrivenDesignDslPackage.Literals.OVERRIDDEN_TYPE_META_INFO__META_INFO));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOverriddenTypeMetaInfoAccess().getMetaInfoTypeMetaInfoParserRuleCall_1_0(), semanticObject.getMetaInfo());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (doc=DOC? name=ID (events+=[Event|FQN] events+=[Event|FQN]*)?)
	 */
	protected void sequence_Projection(EObject context, Projection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_StringLiteral(EObject context, StringLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DomainDrivenDesignDslPackage.Literals.LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DomainDrivenDesignDslPackage.Literals.LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (slabel=STRING? label=STRING? tooltip=STRING? prompt=STRING? examples+=Literal*)
	 */
	protected void sequence_TypeMetaInfo(EObject context, TypeMetaInfo semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         doc=DOC? 
	 *         nullable='nullable'? 
	 *         type=[Type|ID] 
	 *         multiplicity='*'? 
	 *         name=ID 
	 *         invariants=Invariants? 
	 *         overridden=OverriddenTypeMetaInfo?
	 *     )
	 */
	protected void sequence_Variable(EObject context, Variable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (doc=DOC? name=ID projection=[Projection|ID])
	 */
	protected void sequence_View(EObject context, View semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
