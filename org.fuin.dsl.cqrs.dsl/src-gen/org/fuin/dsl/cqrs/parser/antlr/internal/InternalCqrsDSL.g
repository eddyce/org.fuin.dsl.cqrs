/*
* generated by Xtext
*/
grammar InternalCqrsDSL;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package org.fuin.dsl.cqrs.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.fuin.dsl.cqrs.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.fuin.dsl.cqrs.services.CqrsDSLGrammarAccess;

}

@parser::members {

 	private CqrsDSLGrammarAccess grammarAccess;
 	
    public InternalCqrsDSLParser(TokenStream input, CqrsDSLGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "DomainModel";	
   	}
   	
   	@Override
   	protected CqrsDSLGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleDomainModel
entryRuleDomainModel returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDomainModelRule()); }
	 iv_ruleDomainModel=ruleDomainModel 
	 { $current=$iv_ruleDomainModel.current; } 
	 EOF 
;

// Rule DomainModel
ruleDomainModel returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getDomainModelAccess().getNamespaceNamespaceParserRuleCall_0()); 
	    }
		lv_namespace_0_0=ruleNamespace		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDomainModelRule());
	        }
       		set(
       			$current, 
       			"namespace",
        		lv_namespace_0_0, 
        		"Namespace");
	        afterParserOrEnumRuleCall();
	    }

)
)
;





// Entry rule entryRuleNamespace
entryRuleNamespace returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getNamespaceRule()); }
	 iv_ruleNamespace=ruleNamespace 
	 { $current=$iv_ruleNamespace.current; } 
	 EOF 
;

// Rule Namespace
ruleNamespace returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='namespace' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getNamespaceAccess().getNamespaceKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getNamespaceAccess().getNameFQNParserRuleCall_1_0()); 
	    }
		lv_name_1_0=ruleFQN		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getNamespaceRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"FQN");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getNamespaceAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getNamespaceAccess().getImportsImportParserRuleCall_3_0()); 
	    }
		lv_imports_3_0=ruleImport		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getNamespaceRule());
	        }
       		add(
       			$current, 
       			"imports",
        		lv_imports_3_0, 
        		"Import");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_4='}' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getNamespaceAccess().getRightCurlyBracketKeyword_4());
    }
)
;





// Entry rule entryRuleImport
entryRuleImport returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getImportRule()); }
	 iv_ruleImport=ruleImport 
	 { $current=$iv_ruleImport.current; } 
	 EOF 
;

// Rule Import
ruleImport returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='import' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
    }
(
(
(
		{ 
	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceFQNParserRuleCall_1_0_0()); 
	    }
		lv_importedNamespace_1_1=ruleFQN		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getImportRule());
	        }
       		set(
       			$current, 
       			"importedNamespace",
        		lv_importedNamespace_1_1, 
        		"FQN");
	        afterParserOrEnumRuleCall();
	    }

    |		{ 
	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceFQNWithWildcardParserRuleCall_1_0_1()); 
	    }
		lv_importedNamespace_1_2=ruleFQNWithWildcard		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getImportRule());
	        }
       		set(
       			$current, 
       			"importedNamespace",
        		lv_importedNamespace_1_2, 
        		"FQNWithWildcard");
	        afterParserOrEnumRuleCall();
	    }

)

)
)	otherlv_2=';' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getImportAccess().getSemicolonKeyword_2());
    }
)
;







// Entry rule entryRuleFQN
entryRuleFQN returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getFQNRule()); } 
	 iv_ruleFQN=ruleFQN 
	 { $current=$iv_ruleFQN.current.getText(); }  
	 EOF 
;

// Rule FQN
ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_ID_0=RULE_ID    {
		$current.merge(this_ID_0);
    }

    { 
    newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
    }
(
	kw='.' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
    }
    this_ID_2=RULE_ID    {
		$current.merge(this_ID_2);
    }

    { 
    newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
    }
)*)
    ;





// Entry rule entryRuleFQNWithWildcard
entryRuleFQNWithWildcard returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getFQNWithWildcardRule()); } 
	 iv_ruleFQNWithWildcard=ruleFQNWithWildcard 
	 { $current=$iv_ruleFQNWithWildcard.current.getText(); }  
	 EOF 
;

// Rule FQNWithWildcard
ruleFQNWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getFQNWithWildcardAccess().getFQNParserRuleCall_0()); 
    }
    this_FQN_0=ruleFQN    {
		$current.merge(this_FQN_0);
    }

    { 
        afterParserOrEnumRuleCall();
    }

	kw='.' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getFQNWithWildcardAccess().getFullStopKeyword_1()); 
    }

	kw='*' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getFQNWithWildcardAccess().getAsteriskKeyword_2()); 
    }
)
    ;





// Entry rule entryRuleBooleanLiteral
entryRuleBooleanLiteral returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getBooleanLiteralRule()); }
	 iv_ruleBooleanLiteral=ruleBooleanLiteral 
	 { $current=$iv_ruleBooleanLiteral.current; } 
	 EOF 
;

// Rule BooleanLiteral
ruleBooleanLiteral returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_0(),
            $current);
    }
)(
(
(
		lv_value_1_1=	'false' 
    {
        newLeafNode(lv_value_1_1, grammarAccess.getBooleanLiteralAccess().getValueFalseKeyword_1_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getBooleanLiteralRule());
	        }
       		setWithLastConsumed($current, "value", lv_value_1_1, null);
	    }

    |		lv_value_1_2=	'true' 
    {
        newLeafNode(lv_value_1_2, grammarAccess.getBooleanLiteralAccess().getValueTrueKeyword_1_0_1());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getBooleanLiteralRule());
	        }
       		setWithLastConsumed($current, "value", lv_value_1_2, null);
	    }

)

)
))
;





// Entry rule entryRuleNullLiteral
entryRuleNullLiteral returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getNullLiteralRule()); }
	 iv_ruleNullLiteral=ruleNullLiteral 
	 { $current=$iv_ruleNullLiteral.current; } 
	 EOF 
;

// Rule NullLiteral
ruleNullLiteral returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getNullLiteralAccess().getNullLiteralAction_0(),
            $current);
    }
)(
(
		lv_value_1_0=	'null' 
    {
        newLeafNode(lv_value_1_0, grammarAccess.getNullLiteralAccess().getValueNullKeyword_1_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getNullLiteralRule());
	        }
       		setWithLastConsumed($current, "value", lv_value_1_0, "null");
	    }

)
))
;





// Entry rule entryRuleNumberLiteral
entryRuleNumberLiteral returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getNumberLiteralRule()); }
	 iv_ruleNumberLiteral=ruleNumberLiteral 
	 { $current=$iv_ruleNumberLiteral.current; } 
	 EOF 
;

// Rule NumberLiteral
ruleNumberLiteral returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getNumberLiteralAccess().getNumberLiteralAction_0(),
            $current);
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getNumberLiteralAccess().getValueNumberParserRuleCall_1_0()); 
	    }
		lv_value_1_0=ruleNumber		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getNumberLiteralRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_1_0, 
        		"Number");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleStringLiteral
entryRuleStringLiteral returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getStringLiteralRule()); }
	 iv_ruleStringLiteral=ruleStringLiteral 
	 { $current=$iv_ruleStringLiteral.current; } 
	 EOF 
;

// Rule StringLiteral
ruleStringLiteral returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getStringLiteralAccess().getStringLiteralAction_0(),
            $current);
    }
)(
(
		lv_value_1_0=RULE_STRING
		{
			newLeafNode(lv_value_1_0, grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getStringLiteralRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_1_0, 
        		"STRING");
	    }

)
))
;





// Entry rule entryRuleNumber
entryRuleNumber returns [String current=null] 
	@init { 
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
	}
	:
	{ newCompositeNode(grammarAccess.getNumberRule()); } 
	 iv_ruleNumber=ruleNumber 
	 { $current=$iv_ruleNumber.current.getText(); }  
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule Number
ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
    }
    @after { leaveRule(); }:
(    this_HEX_0=RULE_HEX    {
		$current.merge(this_HEX_0);
    }

    { 
    newLeafNode(this_HEX_0, grammarAccess.getNumberAccess().getHEXTerminalRuleCall_0()); 
    }

    |((    this_INT_1=RULE_INT    {
		$current.merge(this_INT_1);
    }

    { 
    newLeafNode(this_INT_1, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_0_0()); 
    }

    |    this_DECIMAL_2=RULE_DECIMAL    {
		$current.merge(this_DECIMAL_2);
    }

    { 
    newLeafNode(this_DECIMAL_2, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_0_1()); 
    }
)(
	kw='.' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getNumberAccess().getFullStopKeyword_1_1_0()); 
    }
(    this_INT_4=RULE_INT    {
		$current.merge(this_INT_4);
    }

    { 
    newLeafNode(this_INT_4, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1_1_0()); 
    }

    |    this_DECIMAL_5=RULE_DECIMAL    {
		$current.merge(this_DECIMAL_5);
    }

    { 
    newLeafNode(this_DECIMAL_5, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_1_1_1()); 
    }
))?))
    ;
finally {
	myHiddenTokenState.restore();
}





RULE_ID : ('A'..'Z'|'a'..'z') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_HEX : ('0x'|'0X') ('0'..'9'|'a'..'f'|'A'..'F'|'_')+ ('#' (('b'|'B') ('i'|'I')|('l'|'L')))?;

RULE_INT : '0'..'9' ('0'..'9'|'_')*;

RULE_DECIMAL : RULE_INT (('e'|'E') ('+'|'-')? RULE_INT)? (('b'|'B') ('i'|'I'|'d'|'D')|('l'|'L'|'d'|'D'|'f'|'F'))?;

RULE_DOC : '/**' ( options {greedy=false;} : . )*'*/';

RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;


