/*
* generated by Xtext
*/
package org.fuin.dsl.cqrs.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.fuin.dsl.cqrs.services.CqrsDSLGrammarAccess;

public class CqrsDSLParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private CqrsDSLGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.fuin.dsl.cqrs.parser.antlr.internal.InternalCqrsDSLParser createParser(XtextTokenStream stream) {
		return new org.fuin.dsl.cqrs.parser.antlr.internal.InternalCqrsDSLParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "DomainModel";
	}
	
	public CqrsDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(CqrsDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
