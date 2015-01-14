/*
* generated by Xtext
*/
package org.fuin.dsl.cqrs.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.fuin.dsl.cqrs.services.CqrsDSLGrammarAccess;

public class CqrsDSLParser extends AbstractContentAssistParser {
	
	@Inject
	private CqrsDSLGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.fuin.dsl.cqrs.ui.contentassist.antlr.internal.InternalCqrsDSLParser createParser() {
		org.fuin.dsl.cqrs.ui.contentassist.antlr.internal.InternalCqrsDSLParser result = new org.fuin.dsl.cqrs.ui.contentassist.antlr.internal.InternalCqrsDSLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getImportAccess().getImportedNamespaceAlternatives_1_0(), "rule__Import__ImportedNamespaceAlternatives_1_0");
					put(grammarAccess.getAbstractElementAccess().getAlternatives(), "rule__AbstractElement__Alternatives");
					put(grammarAccess.getLiteralAccess().getAlternatives(), "rule__Literal__Alternatives");
					put(grammarAccess.getBooleanLiteralAccess().getValueAlternatives_1_0(), "rule__BooleanLiteral__ValueAlternatives_1_0");
					put(grammarAccess.getNumberAccess().getAlternatives(), "rule__Number__Alternatives");
					put(grammarAccess.getNumberAccess().getAlternatives_1_0(), "rule__Number__Alternatives_1_0");
					put(grammarAccess.getNumberAccess().getAlternatives_1_1_1(), "rule__Number__Alternatives_1_1_1");
					put(grammarAccess.getContextAccess().getGroup(), "rule__Context__Group__0");
					put(grammarAccess.getNamespaceAccess().getGroup(), "rule__Namespace__Group__0");
					put(grammarAccess.getImportAccess().getGroup(), "rule__Import__Group__0");
					put(grammarAccess.getCommandAccess().getGroup(), "rule__Command__Group__0");
					put(grammarAccess.getCommandAccess().getGroup_3(), "rule__Command__Group_3__0");
					put(grammarAccess.getCommandAccess().getGroup_6(), "rule__Command__Group_6__0");
					put(grammarAccess.getCommandHandlerAccess().getGroup(), "rule__CommandHandler__Group__0");
					put(grammarAccess.getCommandHandlerAccess().getGroup_5(), "rule__CommandHandler__Group_5__0");
					put(grammarAccess.getCommandHandlerAccess().getGroup_6(), "rule__CommandHandler__Group_6__0");
					put(grammarAccess.getCommandHandlerAccess().getGroup_6_2(), "rule__CommandHandler__Group_6_2__0");
					put(grammarAccess.getProjectionAccess().getGroup(), "rule__Projection__Group__0");
					put(grammarAccess.getProjectionAccess().getGroup_3(), "rule__Projection__Group_3__0");
					put(grammarAccess.getProjectionAccess().getGroup_3_2(), "rule__Projection__Group_3_2__0");
					put(grammarAccess.getViewAccess().getGroup(), "rule__View__Group__0");
					put(grammarAccess.getTypeMetaInfoAccess().getGroup(), "rule__TypeMetaInfo__Group__0");
					put(grammarAccess.getTypeMetaInfoAccess().getGroup_1(), "rule__TypeMetaInfo__Group_1__0");
					put(grammarAccess.getTypeMetaInfoAccess().getGroup_2(), "rule__TypeMetaInfo__Group_2__0");
					put(grammarAccess.getTypeMetaInfoAccess().getGroup_3(), "rule__TypeMetaInfo__Group_3__0");
					put(grammarAccess.getTypeMetaInfoAccess().getGroup_4(), "rule__TypeMetaInfo__Group_4__0");
					put(grammarAccess.getTypeMetaInfoAccess().getGroup_5(), "rule__TypeMetaInfo__Group_5__0");
					put(grammarAccess.getVariableAccess().getGroup(), "rule__Variable__Group__0");
					put(grammarAccess.getInvariantsAccess().getGroup(), "rule__Invariants__Group__0");
					put(grammarAccess.getInvariantsAccess().getGroup_2(), "rule__Invariants__Group_2__0");
					put(grammarAccess.getOverriddenTypeMetaInfoAccess().getGroup(), "rule__OverriddenTypeMetaInfo__Group__0");
					put(grammarAccess.getConstraintInstanceAccess().getGroup(), "rule__ConstraintInstance__Group__0");
					put(grammarAccess.getConstraintInstanceAccess().getGroup_1(), "rule__ConstraintInstance__Group_1__0");
					put(grammarAccess.getConstraintInstanceAccess().getGroup_1_2(), "rule__ConstraintInstance__Group_1_2__0");
					put(grammarAccess.getBooleanLiteralAccess().getGroup(), "rule__BooleanLiteral__Group__0");
					put(grammarAccess.getNullLiteralAccess().getGroup(), "rule__NullLiteral__Group__0");
					put(grammarAccess.getNumberLiteralAccess().getGroup(), "rule__NumberLiteral__Group__0");
					put(grammarAccess.getStringLiteralAccess().getGroup(), "rule__StringLiteral__Group__0");
					put(grammarAccess.getFQNAccess().getGroup(), "rule__FQN__Group__0");
					put(grammarAccess.getFQNAccess().getGroup_1(), "rule__FQN__Group_1__0");
					put(grammarAccess.getFQNWithWildcardAccess().getGroup(), "rule__FQNWithWildcard__Group__0");
					put(grammarAccess.getNumberAccess().getGroup_1(), "rule__Number__Group_1__0");
					put(grammarAccess.getNumberAccess().getGroup_1_1(), "rule__Number__Group_1_1__0");
					put(grammarAccess.getDomainModelAccess().getContextsAssignment(), "rule__DomainModel__ContextsAssignment");
					put(grammarAccess.getContextAccess().getNameAssignment_1(), "rule__Context__NameAssignment_1");
					put(grammarAccess.getContextAccess().getNamespacesAssignment_3(), "rule__Context__NamespacesAssignment_3");
					put(grammarAccess.getNamespaceAccess().getNameAssignment_1(), "rule__Namespace__NameAssignment_1");
					put(grammarAccess.getNamespaceAccess().getImportsAssignment_3(), "rule__Namespace__ImportsAssignment_3");
					put(grammarAccess.getNamespaceAccess().getElementsAssignment_4(), "rule__Namespace__ElementsAssignment_4");
					put(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1(), "rule__Import__ImportedNamespaceAssignment_1");
					put(grammarAccess.getCommandAccess().getDocAssignment_0(), "rule__Command__DocAssignment_0");
					put(grammarAccess.getCommandAccess().getNameAssignment_2(), "rule__Command__NameAssignment_2");
					put(grammarAccess.getCommandAccess().getTargetAssignment_3_1(), "rule__Command__TargetAssignment_3_1");
					put(grammarAccess.getCommandAccess().getVariablesAssignment_5(), "rule__Command__VariablesAssignment_5");
					put(grammarAccess.getCommandAccess().getMessageAssignment_6_1(), "rule__Command__MessageAssignment_6_1");
					put(grammarAccess.getCommandHandlerAccess().getDocAssignment_0(), "rule__CommandHandler__DocAssignment_0");
					put(grammarAccess.getCommandHandlerAccess().getNameAssignment_2(), "rule__CommandHandler__NameAssignment_2");
					put(grammarAccess.getCommandHandlerAccess().getCommandsAssignment_4(), "rule__CommandHandler__CommandsAssignment_4");
					put(grammarAccess.getCommandHandlerAccess().getCommandsAssignment_5_1(), "rule__CommandHandler__CommandsAssignment_5_1");
					put(grammarAccess.getCommandHandlerAccess().getAggregatesAssignment_6_1(), "rule__CommandHandler__AggregatesAssignment_6_1");
					put(grammarAccess.getCommandHandlerAccess().getAggregatesAssignment_6_2_1(), "rule__CommandHandler__AggregatesAssignment_6_2_1");
					put(grammarAccess.getProjectionAccess().getDocAssignment_0(), "rule__Projection__DocAssignment_0");
					put(grammarAccess.getProjectionAccess().getNameAssignment_2(), "rule__Projection__NameAssignment_2");
					put(grammarAccess.getProjectionAccess().getEventsAssignment_3_1(), "rule__Projection__EventsAssignment_3_1");
					put(grammarAccess.getProjectionAccess().getEventsAssignment_3_2_1(), "rule__Projection__EventsAssignment_3_2_1");
					put(grammarAccess.getViewAccess().getDocAssignment_0(), "rule__View__DocAssignment_0");
					put(grammarAccess.getViewAccess().getNameAssignment_2(), "rule__View__NameAssignment_2");
					put(grammarAccess.getViewAccess().getProjectionAssignment_4(), "rule__View__ProjectionAssignment_4");
					put(grammarAccess.getTypeMetaInfoAccess().getSlabelAssignment_1_1(), "rule__TypeMetaInfo__SlabelAssignment_1_1");
					put(grammarAccess.getTypeMetaInfoAccess().getLabelAssignment_2_1(), "rule__TypeMetaInfo__LabelAssignment_2_1");
					put(grammarAccess.getTypeMetaInfoAccess().getTooltipAssignment_3_1(), "rule__TypeMetaInfo__TooltipAssignment_3_1");
					put(grammarAccess.getTypeMetaInfoAccess().getPromptAssignment_4_1(), "rule__TypeMetaInfo__PromptAssignment_4_1");
					put(grammarAccess.getTypeMetaInfoAccess().getExamplesAssignment_5_1(), "rule__TypeMetaInfo__ExamplesAssignment_5_1");
					put(grammarAccess.getVariableAccess().getDocAssignment_0(), "rule__Variable__DocAssignment_0");
					put(grammarAccess.getVariableAccess().getNullableAssignment_1(), "rule__Variable__NullableAssignment_1");
					put(grammarAccess.getVariableAccess().getTypeAssignment_2(), "rule__Variable__TypeAssignment_2");
					put(grammarAccess.getVariableAccess().getMultiplicityAssignment_3(), "rule__Variable__MultiplicityAssignment_3");
					put(grammarAccess.getVariableAccess().getNameAssignment_4(), "rule__Variable__NameAssignment_4");
					put(grammarAccess.getVariableAccess().getInvariantsAssignment_5(), "rule__Variable__InvariantsAssignment_5");
					put(grammarAccess.getVariableAccess().getOverriddenAssignment_6(), "rule__Variable__OverriddenAssignment_6");
					put(grammarAccess.getInvariantsAccess().getInstancesAssignment_1(), "rule__Invariants__InstancesAssignment_1");
					put(grammarAccess.getInvariantsAccess().getInstancesAssignment_2_1(), "rule__Invariants__InstancesAssignment_2_1");
					put(grammarAccess.getOverriddenTypeMetaInfoAccess().getMetaInfoAssignment_1(), "rule__OverriddenTypeMetaInfo__MetaInfoAssignment_1");
					put(grammarAccess.getConstraintInstanceAccess().getConstraintAssignment_0(), "rule__ConstraintInstance__ConstraintAssignment_0");
					put(grammarAccess.getConstraintInstanceAccess().getParamsAssignment_1_1(), "rule__ConstraintInstance__ParamsAssignment_1_1");
					put(grammarAccess.getConstraintInstanceAccess().getParamsAssignment_1_2_1(), "rule__ConstraintInstance__ParamsAssignment_1_2_1");
					put(grammarAccess.getBooleanLiteralAccess().getValueAssignment_1(), "rule__BooleanLiteral__ValueAssignment_1");
					put(grammarAccess.getNullLiteralAccess().getValueAssignment_1(), "rule__NullLiteral__ValueAssignment_1");
					put(grammarAccess.getNumberLiteralAccess().getValueAssignment_1(), "rule__NumberLiteral__ValueAssignment_1");
					put(grammarAccess.getStringLiteralAccess().getValueAssignment_1(), "rule__StringLiteral__ValueAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.fuin.dsl.cqrs.ui.contentassist.antlr.internal.InternalCqrsDSLParser typedParser = (org.fuin.dsl.cqrs.ui.contentassist.antlr.internal.InternalCqrsDSLParser) parser;
			typedParser.entryRuleDomainModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public CqrsDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(CqrsDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
