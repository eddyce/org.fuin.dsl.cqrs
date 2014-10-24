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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCqrsDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_DOC", "RULE_STRING", "RULE_HEX", "RULE_INT", "RULE_DECIMAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'context'", "'{'", "'}'", "'namespace'", "'import'", "'command'", "'message'", "'command-handler'", "'handles'", "','", "'uses'", "'projection'", "'input'", "'view'", "'slabel'", "'label'", "'tooltip'", "'prompt'", "'examples'", "'nullable'", "'*'", "'invariants'", "'('", "')'", "'false'", "'true'", "'null'", "'.'"
    };
    public static final int RULE_ID=4;
    public static final int T__40=40;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_DOC=5;
    public static final int RULE_SL_COMMENT=11;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_HEX=7;
    public static final int RULE_STRING=6;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=8;
    public static final int RULE_WS=12;
    public static final int RULE_DECIMAL=9;

    // delegates
    // delegators


        public InternalCqrsDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCqrsDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCqrsDSLParser.tokenNames; }
    public String getGrammarFileName() { return "../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g"; }



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



    // $ANTLR start "entryRuleDomainModel"
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:67:1: entryRuleDomainModel returns [EObject current=null] : iv_ruleDomainModel= ruleDomainModel EOF ;
    public final EObject entryRuleDomainModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainModel = null;


        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:68:2: (iv_ruleDomainModel= ruleDomainModel EOF )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:69:2: iv_ruleDomainModel= ruleDomainModel EOF
            {
             newCompositeNode(grammarAccess.getDomainModelRule()); 
            pushFollow(FOLLOW_ruleDomainModel_in_entryRuleDomainModel75);
            iv_ruleDomainModel=ruleDomainModel();

            state._fsp--;

             current =iv_ruleDomainModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDomainModel"


    // $ANTLR start "ruleDomainModel"
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:76:1: ruleDomainModel returns [EObject current=null] : ( (lv_contexts_0_0= ruleContext ) )* ;
    public final EObject ruleDomainModel() throws RecognitionException {
        EObject current = null;

        EObject lv_contexts_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:79:28: ( ( (lv_contexts_0_0= ruleContext ) )* )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:80:1: ( (lv_contexts_0_0= ruleContext ) )*
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:80:1: ( (lv_contexts_0_0= ruleContext ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:81:1: (lv_contexts_0_0= ruleContext )
            	    {
            	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:81:1: (lv_contexts_0_0= ruleContext )
            	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:82:3: lv_contexts_0_0= ruleContext
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDomainModelAccess().getContextsContextParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleContext_in_ruleDomainModel130);
            	    lv_contexts_0_0=ruleContext();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDomainModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"contexts",
            	            		lv_contexts_0_0, 
            	            		"Context");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDomainModel"


    // $ANTLR start "entryRuleContext"
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:106:1: entryRuleContext returns [EObject current=null] : iv_ruleContext= ruleContext EOF ;
    public final EObject entryRuleContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContext = null;


        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:107:2: (iv_ruleContext= ruleContext EOF )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:108:2: iv_ruleContext= ruleContext EOF
            {
             newCompositeNode(grammarAccess.getContextRule()); 
            pushFollow(FOLLOW_ruleContext_in_entryRuleContext166);
            iv_ruleContext=ruleContext();

            state._fsp--;

             current =iv_ruleContext; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContext176); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContext"


    // $ANTLR start "ruleContext"
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:115:1: ruleContext returns [EObject current=null] : (otherlv_0= 'context' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_namespaces_3_0= ruleNamespace ) )* otherlv_4= '}' ) ;
    public final EObject ruleContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_namespaces_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:118:28: ( (otherlv_0= 'context' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_namespaces_3_0= ruleNamespace ) )* otherlv_4= '}' ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:119:1: (otherlv_0= 'context' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_namespaces_3_0= ruleNamespace ) )* otherlv_4= '}' )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:119:1: (otherlv_0= 'context' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_namespaces_3_0= ruleNamespace ) )* otherlv_4= '}' )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:119:3: otherlv_0= 'context' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_namespaces_3_0= ruleNamespace ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleContext213); 

                	newLeafNode(otherlv_0, grammarAccess.getContextAccess().getContextKeyword_0());
                
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:123:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:124:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:124:1: (lv_name_1_0= RULE_ID )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:125:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContext230); 

            			newLeafNode(lv_name_1_0, grammarAccess.getContextAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getContextRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleContext247); 

                	newLeafNode(otherlv_2, grammarAccess.getContextAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:145:1: ( (lv_namespaces_3_0= ruleNamespace ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:146:1: (lv_namespaces_3_0= ruleNamespace )
            	    {
            	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:146:1: (lv_namespaces_3_0= ruleNamespace )
            	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:147:3: lv_namespaces_3_0= ruleNamespace
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContextAccess().getNamespacesNamespaceParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNamespace_in_ruleContext268);
            	    lv_namespaces_3_0=ruleNamespace();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getContextRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"namespaces",
            	            		lv_namespaces_3_0, 
            	            		"Namespace");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleContext281); 

                	newLeafNode(otherlv_4, grammarAccess.getContextAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContext"


    // $ANTLR start "entryRuleNamespace"
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:175:1: entryRuleNamespace returns [EObject current=null] : iv_ruleNamespace= ruleNamespace EOF ;
    public final EObject entryRuleNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamespace = null;


        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:176:2: (iv_ruleNamespace= ruleNamespace EOF )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:177:2: iv_ruleNamespace= ruleNamespace EOF
            {
             newCompositeNode(grammarAccess.getNamespaceRule()); 
            pushFollow(FOLLOW_ruleNamespace_in_entryRuleNamespace317);
            iv_ruleNamespace=ruleNamespace();

            state._fsp--;

             current =iv_ruleNamespace; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamespace327); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNamespace"


    // $ANTLR start "ruleNamespace"
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:184:1: ruleNamespace returns [EObject current=null] : (otherlv_0= 'namespace' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* ( (lv_elements_4_0= ruleAbstractElement ) )* otherlv_5= '}' ) ;
    public final EObject ruleNamespace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_imports_3_0 = null;

        EObject lv_elements_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:187:28: ( (otherlv_0= 'namespace' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* ( (lv_elements_4_0= ruleAbstractElement ) )* otherlv_5= '}' ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:188:1: (otherlv_0= 'namespace' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* ( (lv_elements_4_0= ruleAbstractElement ) )* otherlv_5= '}' )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:188:1: (otherlv_0= 'namespace' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* ( (lv_elements_4_0= ruleAbstractElement ) )* otherlv_5= '}' )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:188:3: otherlv_0= 'namespace' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* ( (lv_elements_4_0= ruleAbstractElement ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleNamespace364); 

                	newLeafNode(otherlv_0, grammarAccess.getNamespaceAccess().getNamespaceKeyword_0());
                
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:192:1: ( (lv_name_1_0= ruleFQN ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:193:1: (lv_name_1_0= ruleFQN )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:193:1: (lv_name_1_0= ruleFQN )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:194:3: lv_name_1_0= ruleFQN
            {
             
            	        newCompositeNode(grammarAccess.getNamespaceAccess().getNameFQNParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_ruleNamespace385);
            lv_name_1_0=ruleFQN();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNamespaceRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"FQN");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleNamespace397); 

                	newLeafNode(otherlv_2, grammarAccess.getNamespaceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:214:1: ( (lv_imports_3_0= ruleImport ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:215:1: (lv_imports_3_0= ruleImport )
            	    {
            	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:215:1: (lv_imports_3_0= ruleImport )
            	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:216:3: lv_imports_3_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNamespaceAccess().getImportsImportParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleNamespace418);
            	    lv_imports_3_0=ruleImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNamespaceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_3_0, 
            	            		"Import");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:232:3: ( (lv_elements_4_0= ruleAbstractElement ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_DOC||LA4_0==18||LA4_0==20||LA4_0==24||LA4_0==26) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:233:1: (lv_elements_4_0= ruleAbstractElement )
            	    {
            	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:233:1: (lv_elements_4_0= ruleAbstractElement )
            	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:234:3: lv_elements_4_0= ruleAbstractElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNamespaceAccess().getElementsAbstractElementParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractElement_in_ruleNamespace440);
            	    lv_elements_4_0=ruleAbstractElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNamespaceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_4_0, 
            	            		"AbstractElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleNamespace453); 

                	newLeafNode(otherlv_5, grammarAccess.getNamespaceAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNamespace"


    // $ANTLR start "entryRuleImport"
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:262:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:263:2: (iv_ruleImport= ruleImport EOF )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:264:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport489);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport499); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:271:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( ( (lv_importedNamespace_1_1= ruleFQN | lv_importedNamespace_1_2= ruleFQNWithWildcard ) ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_1 = null;

        AntlrDatatypeRuleToken lv_importedNamespace_1_2 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:274:28: ( (otherlv_0= 'import' ( ( (lv_importedNamespace_1_1= ruleFQN | lv_importedNamespace_1_2= ruleFQNWithWildcard ) ) ) ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:275:1: (otherlv_0= 'import' ( ( (lv_importedNamespace_1_1= ruleFQN | lv_importedNamespace_1_2= ruleFQNWithWildcard ) ) ) )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:275:1: (otherlv_0= 'import' ( ( (lv_importedNamespace_1_1= ruleFQN | lv_importedNamespace_1_2= ruleFQNWithWildcard ) ) ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:275:3: otherlv_0= 'import' ( ( (lv_importedNamespace_1_1= ruleFQN | lv_importedNamespace_1_2= ruleFQNWithWildcard ) ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleImport536); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:279:1: ( ( (lv_importedNamespace_1_1= ruleFQN | lv_importedNamespace_1_2= ruleFQNWithWildcard ) ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:280:1: ( (lv_importedNamespace_1_1= ruleFQN | lv_importedNamespace_1_2= ruleFQNWithWildcard ) )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:280:1: ( (lv_importedNamespace_1_1= ruleFQN | lv_importedNamespace_1_2= ruleFQNWithWildcard ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:281:1: (lv_importedNamespace_1_1= ruleFQN | lv_importedNamespace_1_2= ruleFQNWithWildcard )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:281:1: (lv_importedNamespace_1_1= ruleFQN | lv_importedNamespace_1_2= ruleFQNWithWildcard )
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:282:3: lv_importedNamespace_1_1= ruleFQN
                    {
                     
                    	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceFQNParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleImport559);
                    lv_importedNamespace_1_1=ruleFQN();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getImportRule());
                    	        }
                           		set(
                           			current, 
                           			"importedNamespace",
                            		lv_importedNamespace_1_1, 
                            		"FQN");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:297:8: lv_importedNamespace_1_2= ruleFQNWithWildcard
                    {
                     
                    	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceFQNWithWildcardParserRuleCall_1_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleFQNWithWildcard_in_ruleImport578);
                    lv_importedNamespace_1_2=ruleFQNWithWildcard();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getImportRule());
                    	        }
                           		set(
                           			current, 
                           			"importedNamespace",
                            		lv_importedNamespace_1_2, 
                            		"FQNWithWildcard");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleAbstractElement"
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:323:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:324:2: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:325:2: iv_ruleAbstractElement= ruleAbstractElement EOF
            {
             newCompositeNode(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement617);
            iv_ruleAbstractElement=ruleAbstractElement();

            state._fsp--;

             current =iv_ruleAbstractElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractElement627); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:332:1: ruleAbstractElement returns [EObject current=null] : (this_Command_0= ruleCommand | this_CommandHandler_1= ruleCommandHandler | this_Projection_2= ruleProjection | this_View_3= ruleView ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_Command_0 = null;

        EObject this_CommandHandler_1 = null;

        EObject this_Projection_2 = null;

        EObject this_View_3 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:335:28: ( (this_Command_0= ruleCommand | this_CommandHandler_1= ruleCommandHandler | this_Projection_2= ruleProjection | this_View_3= ruleView ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:336:1: (this_Command_0= ruleCommand | this_CommandHandler_1= ruleCommandHandler | this_Projection_2= ruleProjection | this_View_3= ruleView )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:336:1: (this_Command_0= ruleCommand | this_CommandHandler_1= ruleCommandHandler | this_Projection_2= ruleProjection | this_View_3= ruleView )
            int alt6=4;
            switch ( input.LA(1) ) {
            case RULE_DOC:
                {
                switch ( input.LA(2) ) {
                case 26:
                    {
                    alt6=4;
                    }
                    break;
                case 24:
                    {
                    alt6=3;
                    }
                    break;
                case 20:
                    {
                    alt6=2;
                    }
                    break;
                case 18:
                    {
                    alt6=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }

                }
                break;
            case 18:
                {
                alt6=1;
                }
                break;
            case 20:
                {
                alt6=2;
                }
                break;
            case 24:
                {
                alt6=3;
                }
                break;
            case 26:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:337:5: this_Command_0= ruleCommand
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractElementAccess().getCommandParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleCommand_in_ruleAbstractElement674);
                    this_Command_0=ruleCommand();

                    state._fsp--;

                     
                            current = this_Command_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:347:5: this_CommandHandler_1= ruleCommandHandler
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractElementAccess().getCommandHandlerParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleCommandHandler_in_ruleAbstractElement701);
                    this_CommandHandler_1=ruleCommandHandler();

                    state._fsp--;

                     
                            current = this_CommandHandler_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:357:5: this_Projection_2= ruleProjection
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractElementAccess().getProjectionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleProjection_in_ruleAbstractElement728);
                    this_Projection_2=ruleProjection();

                    state._fsp--;

                     
                            current = this_Projection_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:367:5: this_View_3= ruleView
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractElementAccess().getViewParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleView_in_ruleAbstractElement755);
                    this_View_3=ruleView();

                    state._fsp--;

                     
                            current = this_View_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleCommand"
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:383:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:384:2: (iv_ruleCommand= ruleCommand EOF )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:385:2: iv_ruleCommand= ruleCommand EOF
            {
             newCompositeNode(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_ruleCommand_in_entryRuleCommand790);
            iv_ruleCommand=ruleCommand();

            state._fsp--;

             current =iv_ruleCommand; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommand800); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:392:1: ruleCommand returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'command' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_variables_4_0= ruleVariable ) )* (otherlv_5= 'message' ( (lv_message_6_0= RULE_STRING ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        Token lv_doc_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_message_6_0=null;
        Token otherlv_7=null;
        EObject lv_variables_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:395:28: ( ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'command' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_variables_4_0= ruleVariable ) )* (otherlv_5= 'message' ( (lv_message_6_0= RULE_STRING ) ) )? otherlv_7= '}' ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:396:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'command' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_variables_4_0= ruleVariable ) )* (otherlv_5= 'message' ( (lv_message_6_0= RULE_STRING ) ) )? otherlv_7= '}' )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:396:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'command' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_variables_4_0= ruleVariable ) )* (otherlv_5= 'message' ( (lv_message_6_0= RULE_STRING ) ) )? otherlv_7= '}' )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:396:2: ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'command' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_variables_4_0= ruleVariable ) )* (otherlv_5= 'message' ( (lv_message_6_0= RULE_STRING ) ) )? otherlv_7= '}'
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:396:2: ( (lv_doc_0_0= RULE_DOC ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_DOC) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:397:1: (lv_doc_0_0= RULE_DOC )
                    {
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:397:1: (lv_doc_0_0= RULE_DOC )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:398:3: lv_doc_0_0= RULE_DOC
                    {
                    lv_doc_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleCommand842); 

                    			newLeafNode(lv_doc_0_0, grammarAccess.getCommandAccess().getDocDOCTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCommandRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"doc",
                            		lv_doc_0_0, 
                            		"DOC");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleCommand860); 

                	newLeafNode(otherlv_1, grammarAccess.getCommandAccess().getCommandKeyword_1());
                
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:418:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:419:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:419:1: (lv_name_2_0= RULE_ID )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:420:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCommand877); 

            			newLeafNode(lv_name_2_0, grammarAccess.getCommandAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCommandRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleCommand894); 

                	newLeafNode(otherlv_3, grammarAccess.getCommandAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:440:1: ( (lv_variables_4_0= ruleVariable ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_ID && LA8_0<=RULE_DOC)||LA8_0==32) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:441:1: (lv_variables_4_0= ruleVariable )
            	    {
            	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:441:1: (lv_variables_4_0= ruleVariable )
            	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:442:3: lv_variables_4_0= ruleVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCommandAccess().getVariablesVariableParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVariable_in_ruleCommand915);
            	    lv_variables_4_0=ruleVariable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCommandRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"variables",
            	            		lv_variables_4_0, 
            	            		"Variable");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:458:3: (otherlv_5= 'message' ( (lv_message_6_0= RULE_STRING ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:458:5: otherlv_5= 'message' ( (lv_message_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleCommand929); 

                        	newLeafNode(otherlv_5, grammarAccess.getCommandAccess().getMessageKeyword_5_0());
                        
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:462:1: ( (lv_message_6_0= RULE_STRING ) )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:463:1: (lv_message_6_0= RULE_STRING )
                    {
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:463:1: (lv_message_6_0= RULE_STRING )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:464:3: lv_message_6_0= RULE_STRING
                    {
                    lv_message_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCommand946); 

                    			newLeafNode(lv_message_6_0, grammarAccess.getCommandAccess().getMessageSTRINGTerminalRuleCall_5_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCommandRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"message",
                            		lv_message_6_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleCommand965); 

                	newLeafNode(otherlv_7, grammarAccess.getCommandAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleCommandHandler"
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:492:1: entryRuleCommandHandler returns [EObject current=null] : iv_ruleCommandHandler= ruleCommandHandler EOF ;
    public final EObject entryRuleCommandHandler() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommandHandler = null;


        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:493:2: (iv_ruleCommandHandler= ruleCommandHandler EOF )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:494:2: iv_ruleCommandHandler= ruleCommandHandler EOF
            {
             newCompositeNode(grammarAccess.getCommandHandlerRule()); 
            pushFollow(FOLLOW_ruleCommandHandler_in_entryRuleCommandHandler1001);
            iv_ruleCommandHandler=ruleCommandHandler();

            state._fsp--;

             current =iv_ruleCommandHandler; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommandHandler1011); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommandHandler"


    // $ANTLR start "ruleCommandHandler"
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:501:1: ruleCommandHandler returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'command-handler' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'handles' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'uses' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? ) ;
    public final EObject ruleCommandHandler() throws RecognitionException {
        EObject current = null;

        Token lv_doc_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;

         enterRule(); 
            
        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:504:28: ( ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'command-handler' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'handles' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'uses' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:505:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'command-handler' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'handles' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'uses' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:505:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'command-handler' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'handles' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'uses' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:505:2: ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'command-handler' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'handles' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'uses' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )?
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:505:2: ( (lv_doc_0_0= RULE_DOC ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_DOC) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:506:1: (lv_doc_0_0= RULE_DOC )
                    {
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:506:1: (lv_doc_0_0= RULE_DOC )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:507:3: lv_doc_0_0= RULE_DOC
                    {
                    lv_doc_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleCommandHandler1053); 

                    			newLeafNode(lv_doc_0_0, grammarAccess.getCommandHandlerAccess().getDocDOCTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCommandHandlerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"doc",
                            		lv_doc_0_0, 
                            		"DOC");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleCommandHandler1071); 

                	newLeafNode(otherlv_1, grammarAccess.getCommandHandlerAccess().getCommandHandlerKeyword_1());
                
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:527:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:528:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:528:1: (lv_name_2_0= RULE_ID )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:529:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCommandHandler1088); 

            			newLeafNode(lv_name_2_0, grammarAccess.getCommandHandlerAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCommandHandlerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleCommandHandler1105); 

                	newLeafNode(otherlv_3, grammarAccess.getCommandHandlerAccess().getHandlesKeyword_3());
                
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:549:1: ( (otherlv_4= RULE_ID ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:550:1: (otherlv_4= RULE_ID )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:550:1: (otherlv_4= RULE_ID )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:551:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getCommandHandlerRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCommandHandler1125); 

            		newLeafNode(otherlv_4, grammarAccess.getCommandHandlerAccess().getCommandsCommandCrossReference_4_0()); 
            	

            }


            }

            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:562:2: (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==22) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:562:4: otherlv_5= ',' ( (otherlv_6= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleCommandHandler1138); 

            	        	newLeafNode(otherlv_5, grammarAccess.getCommandHandlerAccess().getCommaKeyword_5_0());
            	        
            	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:566:1: ( (otherlv_6= RULE_ID ) )
            	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:567:1: (otherlv_6= RULE_ID )
            	    {
            	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:567:1: (otherlv_6= RULE_ID )
            	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:568:3: otherlv_6= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getCommandHandlerRule());
            	    	        }
            	            
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCommandHandler1158); 

            	    		newLeafNode(otherlv_6, grammarAccess.getCommandHandlerAccess().getCommandsCommandCrossReference_5_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:579:4: (otherlv_7= 'uses' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:579:6: otherlv_7= 'uses' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )*
                    {
                    otherlv_7=(Token)match(input,23,FOLLOW_23_in_ruleCommandHandler1173); 

                        	newLeafNode(otherlv_7, grammarAccess.getCommandHandlerAccess().getUsesKeyword_6_0());
                        
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:583:1: ( (otherlv_8= RULE_ID ) )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:584:1: (otherlv_8= RULE_ID )
                    {
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:584:1: (otherlv_8= RULE_ID )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:585:3: otherlv_8= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getCommandHandlerRule());
                    	        }
                            
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCommandHandler1193); 

                    		newLeafNode(otherlv_8, grammarAccess.getCommandHandlerAccess().getAggregatesAggregateCrossReference_6_1_0()); 
                    	

                    }


                    }

                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:596:2: (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==22) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:596:4: otherlv_9= ',' ( (otherlv_10= RULE_ID ) )
                    	    {
                    	    otherlv_9=(Token)match(input,22,FOLLOW_22_in_ruleCommandHandler1206); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getCommandHandlerAccess().getCommaKeyword_6_2_0());
                    	        
                    	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:600:1: ( (otherlv_10= RULE_ID ) )
                    	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:601:1: (otherlv_10= RULE_ID )
                    	    {
                    	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:601:1: (otherlv_10= RULE_ID )
                    	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:602:3: otherlv_10= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getCommandHandlerRule());
                    	    	        }
                    	            
                    	    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCommandHandler1226); 

                    	    		newLeafNode(otherlv_10, grammarAccess.getCommandHandlerAccess().getAggregatesAggregateCrossReference_6_2_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommandHandler"


    // $ANTLR start "entryRuleProjection"
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:621:1: entryRuleProjection returns [EObject current=null] : iv_ruleProjection= ruleProjection EOF ;
    public final EObject entryRuleProjection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProjection = null;


        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:622:2: (iv_ruleProjection= ruleProjection EOF )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:623:2: iv_ruleProjection= ruleProjection EOF
            {
             newCompositeNode(grammarAccess.getProjectionRule()); 
            pushFollow(FOLLOW_ruleProjection_in_entryRuleProjection1266);
            iv_ruleProjection=ruleProjection();

            state._fsp--;

             current =iv_ruleProjection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProjection1276); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProjection"


    // $ANTLR start "ruleProjection"
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:630:1: ruleProjection returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'projection' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'input' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? ) ;
    public final EObject ruleProjection() throws RecognitionException {
        EObject current = null;

        Token lv_doc_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:633:28: ( ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'projection' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'input' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:634:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'projection' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'input' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:634:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'projection' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'input' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:634:2: ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'projection' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'input' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )?
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:634:2: ( (lv_doc_0_0= RULE_DOC ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_DOC) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:635:1: (lv_doc_0_0= RULE_DOC )
                    {
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:635:1: (lv_doc_0_0= RULE_DOC )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:636:3: lv_doc_0_0= RULE_DOC
                    {
                    lv_doc_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleProjection1318); 

                    			newLeafNode(lv_doc_0_0, grammarAccess.getProjectionAccess().getDocDOCTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProjectionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"doc",
                            		lv_doc_0_0, 
                            		"DOC");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleProjection1336); 

                	newLeafNode(otherlv_1, grammarAccess.getProjectionAccess().getProjectionKeyword_1());
                
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:656:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:657:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:657:1: (lv_name_2_0= RULE_ID )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:658:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProjection1353); 

            			newLeafNode(lv_name_2_0, grammarAccess.getProjectionAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProjectionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:674:2: (otherlv_3= 'input' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==25) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:674:4: otherlv_3= 'input' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleProjection1371); 

                        	newLeafNode(otherlv_3, grammarAccess.getProjectionAccess().getInputKeyword_3_0());
                        
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:678:1: ( (otherlv_4= RULE_ID ) )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:679:1: (otherlv_4= RULE_ID )
                    {
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:679:1: (otherlv_4= RULE_ID )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:680:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getProjectionRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProjection1391); 

                    		newLeafNode(otherlv_4, grammarAccess.getProjectionAccess().getEventsEventCrossReference_3_1_0()); 
                    	

                    }


                    }

                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:691:2: (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==22) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:691:4: otherlv_5= ',' ( (otherlv_6= RULE_ID ) )
                    	    {
                    	    otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleProjection1404); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getProjectionAccess().getCommaKeyword_3_2_0());
                    	        
                    	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:695:1: ( (otherlv_6= RULE_ID ) )
                    	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:696:1: (otherlv_6= RULE_ID )
                    	    {
                    	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:696:1: (otherlv_6= RULE_ID )
                    	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:697:3: otherlv_6= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getProjectionRule());
                    	    	        }
                    	            
                    	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProjection1424); 

                    	    		newLeafNode(otherlv_6, grammarAccess.getProjectionAccess().getEventsEventCrossReference_3_2_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProjection"


    // $ANTLR start "entryRuleView"
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:716:1: entryRuleView returns [EObject current=null] : iv_ruleView= ruleView EOF ;
    public final EObject entryRuleView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleView = null;


        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:717:2: (iv_ruleView= ruleView EOF )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:718:2: iv_ruleView= ruleView EOF
            {
             newCompositeNode(grammarAccess.getViewRule()); 
            pushFollow(FOLLOW_ruleView_in_entryRuleView1464);
            iv_ruleView=ruleView();

            state._fsp--;

             current =iv_ruleView; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleView1474); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleView"


    // $ANTLR start "ruleView"
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:725:1: ruleView returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'view' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'uses' ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleView() throws RecognitionException {
        EObject current = null;

        Token lv_doc_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:728:28: ( ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'view' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'uses' ( (otherlv_4= RULE_ID ) ) ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:729:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'view' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'uses' ( (otherlv_4= RULE_ID ) ) )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:729:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'view' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'uses' ( (otherlv_4= RULE_ID ) ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:729:2: ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'view' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'uses' ( (otherlv_4= RULE_ID ) )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:729:2: ( (lv_doc_0_0= RULE_DOC ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_DOC) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:730:1: (lv_doc_0_0= RULE_DOC )
                    {
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:730:1: (lv_doc_0_0= RULE_DOC )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:731:3: lv_doc_0_0= RULE_DOC
                    {
                    lv_doc_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleView1516); 

                    			newLeafNode(lv_doc_0_0, grammarAccess.getViewAccess().getDocDOCTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getViewRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"doc",
                            		lv_doc_0_0, 
                            		"DOC");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleView1534); 

                	newLeafNode(otherlv_1, grammarAccess.getViewAccess().getViewKeyword_1());
                
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:751:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:752:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:752:1: (lv_name_2_0= RULE_ID )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:753:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleView1551); 

            			newLeafNode(lv_name_2_0, grammarAccess.getViewAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getViewRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleView1568); 

                	newLeafNode(otherlv_3, grammarAccess.getViewAccess().getUsesKeyword_3());
                
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:773:1: ( (otherlv_4= RULE_ID ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:774:1: (otherlv_4= RULE_ID )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:774:1: (otherlv_4= RULE_ID )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:775:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getViewRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleView1588); 

            		newLeafNode(otherlv_4, grammarAccess.getViewAccess().getProjectionProjectionCrossReference_4_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleView"


    // $ANTLR start "entryRuleTypeMetaInfo"
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:794:1: entryRuleTypeMetaInfo returns [EObject current=null] : iv_ruleTypeMetaInfo= ruleTypeMetaInfo EOF ;
    public final EObject entryRuleTypeMetaInfo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeMetaInfo = null;


        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:795:2: (iv_ruleTypeMetaInfo= ruleTypeMetaInfo EOF )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:796:2: iv_ruleTypeMetaInfo= ruleTypeMetaInfo EOF
            {
             newCompositeNode(grammarAccess.getTypeMetaInfoRule()); 
            pushFollow(FOLLOW_ruleTypeMetaInfo_in_entryRuleTypeMetaInfo1624);
            iv_ruleTypeMetaInfo=ruleTypeMetaInfo();

            state._fsp--;

             current =iv_ruleTypeMetaInfo; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeMetaInfo1634); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeMetaInfo"


    // $ANTLR start "ruleTypeMetaInfo"
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:803:1: ruleTypeMetaInfo returns [EObject current=null] : ( () (otherlv_1= 'slabel' ( (lv_slabel_2_0= RULE_STRING ) ) )? (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )? (otherlv_5= 'tooltip' ( (lv_tooltip_6_0= RULE_STRING ) ) )? (otherlv_7= 'prompt' ( (lv_prompt_8_0= RULE_STRING ) ) )? (otherlv_9= 'examples' ( (lv_examples_10_0= RULE_STRING ) )* )? ) ;
    public final EObject ruleTypeMetaInfo() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_slabel_2_0=null;
        Token otherlv_3=null;
        Token lv_label_4_0=null;
        Token otherlv_5=null;
        Token lv_tooltip_6_0=null;
        Token otherlv_7=null;
        Token lv_prompt_8_0=null;
        Token otherlv_9=null;
        Token lv_examples_10_0=null;

         enterRule(); 
            
        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:806:28: ( ( () (otherlv_1= 'slabel' ( (lv_slabel_2_0= RULE_STRING ) ) )? (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )? (otherlv_5= 'tooltip' ( (lv_tooltip_6_0= RULE_STRING ) ) )? (otherlv_7= 'prompt' ( (lv_prompt_8_0= RULE_STRING ) ) )? (otherlv_9= 'examples' ( (lv_examples_10_0= RULE_STRING ) )* )? ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:807:1: ( () (otherlv_1= 'slabel' ( (lv_slabel_2_0= RULE_STRING ) ) )? (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )? (otherlv_5= 'tooltip' ( (lv_tooltip_6_0= RULE_STRING ) ) )? (otherlv_7= 'prompt' ( (lv_prompt_8_0= RULE_STRING ) ) )? (otherlv_9= 'examples' ( (lv_examples_10_0= RULE_STRING ) )* )? )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:807:1: ( () (otherlv_1= 'slabel' ( (lv_slabel_2_0= RULE_STRING ) ) )? (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )? (otherlv_5= 'tooltip' ( (lv_tooltip_6_0= RULE_STRING ) ) )? (otherlv_7= 'prompt' ( (lv_prompt_8_0= RULE_STRING ) ) )? (otherlv_9= 'examples' ( (lv_examples_10_0= RULE_STRING ) )* )? )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:807:2: () (otherlv_1= 'slabel' ( (lv_slabel_2_0= RULE_STRING ) ) )? (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )? (otherlv_5= 'tooltip' ( (lv_tooltip_6_0= RULE_STRING ) ) )? (otherlv_7= 'prompt' ( (lv_prompt_8_0= RULE_STRING ) ) )? (otherlv_9= 'examples' ( (lv_examples_10_0= RULE_STRING ) )* )?
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:807:2: ()
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:808:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTypeMetaInfoAccess().getTypeMetaInfoAction_0(),
                        current);
                

            }

            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:813:2: (otherlv_1= 'slabel' ( (lv_slabel_2_0= RULE_STRING ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==27) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:813:4: otherlv_1= 'slabel' ( (lv_slabel_2_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleTypeMetaInfo1681); 

                        	newLeafNode(otherlv_1, grammarAccess.getTypeMetaInfoAccess().getSlabelKeyword_1_0());
                        
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:817:1: ( (lv_slabel_2_0= RULE_STRING ) )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:818:1: (lv_slabel_2_0= RULE_STRING )
                    {
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:818:1: (lv_slabel_2_0= RULE_STRING )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:819:3: lv_slabel_2_0= RULE_STRING
                    {
                    lv_slabel_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTypeMetaInfo1698); 

                    			newLeafNode(lv_slabel_2_0, grammarAccess.getTypeMetaInfoAccess().getSlabelSTRINGTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeMetaInfoRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"slabel",
                            		lv_slabel_2_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:835:4: (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==28) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:835:6: otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleTypeMetaInfo1718); 

                        	newLeafNode(otherlv_3, grammarAccess.getTypeMetaInfoAccess().getLabelKeyword_2_0());
                        
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:839:1: ( (lv_label_4_0= RULE_STRING ) )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:840:1: (lv_label_4_0= RULE_STRING )
                    {
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:840:1: (lv_label_4_0= RULE_STRING )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:841:3: lv_label_4_0= RULE_STRING
                    {
                    lv_label_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTypeMetaInfo1735); 

                    			newLeafNode(lv_label_4_0, grammarAccess.getTypeMetaInfoAccess().getLabelSTRINGTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeMetaInfoRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"label",
                            		lv_label_4_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:857:4: (otherlv_5= 'tooltip' ( (lv_tooltip_6_0= RULE_STRING ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==29) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:857:6: otherlv_5= 'tooltip' ( (lv_tooltip_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,29,FOLLOW_29_in_ruleTypeMetaInfo1755); 

                        	newLeafNode(otherlv_5, grammarAccess.getTypeMetaInfoAccess().getTooltipKeyword_3_0());
                        
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:861:1: ( (lv_tooltip_6_0= RULE_STRING ) )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:862:1: (lv_tooltip_6_0= RULE_STRING )
                    {
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:862:1: (lv_tooltip_6_0= RULE_STRING )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:863:3: lv_tooltip_6_0= RULE_STRING
                    {
                    lv_tooltip_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTypeMetaInfo1772); 

                    			newLeafNode(lv_tooltip_6_0, grammarAccess.getTypeMetaInfoAccess().getTooltipSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeMetaInfoRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"tooltip",
                            		lv_tooltip_6_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:879:4: (otherlv_7= 'prompt' ( (lv_prompt_8_0= RULE_STRING ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==30) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:879:6: otherlv_7= 'prompt' ( (lv_prompt_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,30,FOLLOW_30_in_ruleTypeMetaInfo1792); 

                        	newLeafNode(otherlv_7, grammarAccess.getTypeMetaInfoAccess().getPromptKeyword_4_0());
                        
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:883:1: ( (lv_prompt_8_0= RULE_STRING ) )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:884:1: (lv_prompt_8_0= RULE_STRING )
                    {
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:884:1: (lv_prompt_8_0= RULE_STRING )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:885:3: lv_prompt_8_0= RULE_STRING
                    {
                    lv_prompt_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTypeMetaInfo1809); 

                    			newLeafNode(lv_prompt_8_0, grammarAccess.getTypeMetaInfoAccess().getPromptSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeMetaInfoRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"prompt",
                            		lv_prompt_8_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:901:4: (otherlv_9= 'examples' ( (lv_examples_10_0= RULE_STRING ) )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==31) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:901:6: otherlv_9= 'examples' ( (lv_examples_10_0= RULE_STRING ) )*
                    {
                    otherlv_9=(Token)match(input,31,FOLLOW_31_in_ruleTypeMetaInfo1829); 

                        	newLeafNode(otherlv_9, grammarAccess.getTypeMetaInfoAccess().getExamplesKeyword_5_0());
                        
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:905:1: ( (lv_examples_10_0= RULE_STRING ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==RULE_STRING) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:906:1: (lv_examples_10_0= RULE_STRING )
                    	    {
                    	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:906:1: (lv_examples_10_0= RULE_STRING )
                    	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:907:3: lv_examples_10_0= RULE_STRING
                    	    {
                    	    lv_examples_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTypeMetaInfo1846); 

                    	    			newLeafNode(lv_examples_10_0, grammarAccess.getTypeMetaInfoAccess().getExamplesSTRINGTerminalRuleCall_5_1_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getTypeMetaInfoRule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"examples",
                    	            		lv_examples_10_0, 
                    	            		"STRING");
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeMetaInfo"


    // $ANTLR start "entryRuleVariable"
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:931:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:932:2: (iv_ruleVariable= ruleVariable EOF )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:933:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable1890);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable1900); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:940:1: ruleVariable returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) )? ( (lv_nullable_1_0= 'nullable' ) )? ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= '*' ) )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_invariants_5_0= ruleInvariants ) )? ( (lv_overridden_6_0= ruleOverriddenTypeMetaInfo ) )? ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_doc_0_0=null;
        Token lv_nullable_1_0=null;
        Token otherlv_2=null;
        Token lv_multiplicity_3_0=null;
        Token lv_name_4_0=null;
        EObject lv_invariants_5_0 = null;

        EObject lv_overridden_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:943:28: ( ( ( (lv_doc_0_0= RULE_DOC ) )? ( (lv_nullable_1_0= 'nullable' ) )? ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= '*' ) )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_invariants_5_0= ruleInvariants ) )? ( (lv_overridden_6_0= ruleOverriddenTypeMetaInfo ) )? ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:944:1: ( ( (lv_doc_0_0= RULE_DOC ) )? ( (lv_nullable_1_0= 'nullable' ) )? ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= '*' ) )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_invariants_5_0= ruleInvariants ) )? ( (lv_overridden_6_0= ruleOverriddenTypeMetaInfo ) )? )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:944:1: ( ( (lv_doc_0_0= RULE_DOC ) )? ( (lv_nullable_1_0= 'nullable' ) )? ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= '*' ) )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_invariants_5_0= ruleInvariants ) )? ( (lv_overridden_6_0= ruleOverriddenTypeMetaInfo ) )? )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:944:2: ( (lv_doc_0_0= RULE_DOC ) )? ( (lv_nullable_1_0= 'nullable' ) )? ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= '*' ) )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_invariants_5_0= ruleInvariants ) )? ( (lv_overridden_6_0= ruleOverriddenTypeMetaInfo ) )?
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:944:2: ( (lv_doc_0_0= RULE_DOC ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_DOC) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:945:1: (lv_doc_0_0= RULE_DOC )
                    {
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:945:1: (lv_doc_0_0= RULE_DOC )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:946:3: lv_doc_0_0= RULE_DOC
                    {
                    lv_doc_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleVariable1942); 

                    			newLeafNode(lv_doc_0_0, grammarAccess.getVariableAccess().getDocDOCTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVariableRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"doc",
                            		lv_doc_0_0, 
                            		"DOC");
                    	    

                    }


                    }
                    break;

            }

            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:962:3: ( (lv_nullable_1_0= 'nullable' ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==32) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:963:1: (lv_nullable_1_0= 'nullable' )
                    {
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:963:1: (lv_nullable_1_0= 'nullable' )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:964:3: lv_nullable_1_0= 'nullable'
                    {
                    lv_nullable_1_0=(Token)match(input,32,FOLLOW_32_in_ruleVariable1966); 

                            newLeafNode(lv_nullable_1_0, grammarAccess.getVariableAccess().getNullableNullableKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVariableRule());
                    	        }
                           		setWithLastConsumed(current, "nullable", lv_nullable_1_0, "nullable");
                    	    

                    }


                    }
                    break;

            }

            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:977:3: ( (otherlv_2= RULE_ID ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:978:1: (otherlv_2= RULE_ID )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:978:1: (otherlv_2= RULE_ID )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:979:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getVariableRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable2000); 

            		newLeafNode(otherlv_2, grammarAccess.getVariableAccess().getTypeTypeCrossReference_2_0()); 
            	

            }


            }

            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:990:2: ( (lv_multiplicity_3_0= '*' ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==33) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:991:1: (lv_multiplicity_3_0= '*' )
                    {
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:991:1: (lv_multiplicity_3_0= '*' )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:992:3: lv_multiplicity_3_0= '*'
                    {
                    lv_multiplicity_3_0=(Token)match(input,33,FOLLOW_33_in_ruleVariable2018); 

                            newLeafNode(lv_multiplicity_3_0, grammarAccess.getVariableAccess().getMultiplicityAsteriskKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVariableRule());
                    	        }
                           		setWithLastConsumed(current, "multiplicity", lv_multiplicity_3_0, "*");
                    	    

                    }


                    }
                    break;

            }

            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1005:3: ( (lv_name_4_0= RULE_ID ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1006:1: (lv_name_4_0= RULE_ID )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1006:1: (lv_name_4_0= RULE_ID )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1007:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable2049); 

            			newLeafNode(lv_name_4_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVariableRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"ID");
            	    

            }


            }

            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1023:2: ( (lv_invariants_5_0= ruleInvariants ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==34) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1024:1: (lv_invariants_5_0= ruleInvariants )
                    {
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1024:1: (lv_invariants_5_0= ruleInvariants )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1025:3: lv_invariants_5_0= ruleInvariants
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableAccess().getInvariantsInvariantsParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleInvariants_in_ruleVariable2075);
                    lv_invariants_5_0=ruleInvariants();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariableRule());
                    	        }
                           		set(
                           			current, 
                           			"invariants",
                            		lv_invariants_5_0, 
                            		"Invariants");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1041:3: ( (lv_overridden_6_0= ruleOverriddenTypeMetaInfo ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==14) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1042:1: (lv_overridden_6_0= ruleOverriddenTypeMetaInfo )
                    {
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1042:1: (lv_overridden_6_0= ruleOverriddenTypeMetaInfo )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1043:3: lv_overridden_6_0= ruleOverriddenTypeMetaInfo
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableAccess().getOverriddenOverriddenTypeMetaInfoParserRuleCall_6_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOverriddenTypeMetaInfo_in_ruleVariable2097);
                    lv_overridden_6_0=ruleOverriddenTypeMetaInfo();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariableRule());
                    	        }
                           		set(
                           			current, 
                           			"overridden",
                            		lv_overridden_6_0, 
                            		"OverriddenTypeMetaInfo");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleInvariants"
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1067:1: entryRuleInvariants returns [EObject current=null] : iv_ruleInvariants= ruleInvariants EOF ;
    public final EObject entryRuleInvariants() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvariants = null;


        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1068:2: (iv_ruleInvariants= ruleInvariants EOF )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1069:2: iv_ruleInvariants= ruleInvariants EOF
            {
             newCompositeNode(grammarAccess.getInvariantsRule()); 
            pushFollow(FOLLOW_ruleInvariants_in_entryRuleInvariants2134);
            iv_ruleInvariants=ruleInvariants();

            state._fsp--;

             current =iv_ruleInvariants; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInvariants2144); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInvariants"


    // $ANTLR start "ruleInvariants"
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1076:1: ruleInvariants returns [EObject current=null] : (otherlv_0= 'invariants' ( (lv_calls_1_0= ruleConstraintCall ) ) (otherlv_2= ',' ( (lv_calls_3_0= ruleConstraintCall ) ) )* ) ;
    public final EObject ruleInvariants() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_calls_1_0 = null;

        EObject lv_calls_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1079:28: ( (otherlv_0= 'invariants' ( (lv_calls_1_0= ruleConstraintCall ) ) (otherlv_2= ',' ( (lv_calls_3_0= ruleConstraintCall ) ) )* ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1080:1: (otherlv_0= 'invariants' ( (lv_calls_1_0= ruleConstraintCall ) ) (otherlv_2= ',' ( (lv_calls_3_0= ruleConstraintCall ) ) )* )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1080:1: (otherlv_0= 'invariants' ( (lv_calls_1_0= ruleConstraintCall ) ) (otherlv_2= ',' ( (lv_calls_3_0= ruleConstraintCall ) ) )* )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1080:3: otherlv_0= 'invariants' ( (lv_calls_1_0= ruleConstraintCall ) ) (otherlv_2= ',' ( (lv_calls_3_0= ruleConstraintCall ) ) )*
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleInvariants2181); 

                	newLeafNode(otherlv_0, grammarAccess.getInvariantsAccess().getInvariantsKeyword_0());
                
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1084:1: ( (lv_calls_1_0= ruleConstraintCall ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1085:1: (lv_calls_1_0= ruleConstraintCall )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1085:1: (lv_calls_1_0= ruleConstraintCall )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1086:3: lv_calls_1_0= ruleConstraintCall
            {
             
            	        newCompositeNode(grammarAccess.getInvariantsAccess().getCallsConstraintCallParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleConstraintCall_in_ruleInvariants2202);
            lv_calls_1_0=ruleConstraintCall();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInvariantsRule());
            	        }
                   		add(
                   			current, 
                   			"calls",
                    		lv_calls_1_0, 
                    		"ConstraintCall");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1102:2: (otherlv_2= ',' ( (lv_calls_3_0= ruleConstraintCall ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==22) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1102:4: otherlv_2= ',' ( (lv_calls_3_0= ruleConstraintCall ) )
            	    {
            	    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleInvariants2215); 

            	        	newLeafNode(otherlv_2, grammarAccess.getInvariantsAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1106:1: ( (lv_calls_3_0= ruleConstraintCall ) )
            	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1107:1: (lv_calls_3_0= ruleConstraintCall )
            	    {
            	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1107:1: (lv_calls_3_0= ruleConstraintCall )
            	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1108:3: lv_calls_3_0= ruleConstraintCall
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInvariantsAccess().getCallsConstraintCallParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConstraintCall_in_ruleInvariants2236);
            	    lv_calls_3_0=ruleConstraintCall();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInvariantsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"calls",
            	            		lv_calls_3_0, 
            	            		"ConstraintCall");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInvariants"


    // $ANTLR start "entryRuleOverriddenTypeMetaInfo"
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1132:1: entryRuleOverriddenTypeMetaInfo returns [EObject current=null] : iv_ruleOverriddenTypeMetaInfo= ruleOverriddenTypeMetaInfo EOF ;
    public final EObject entryRuleOverriddenTypeMetaInfo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOverriddenTypeMetaInfo = null;


        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1133:2: (iv_ruleOverriddenTypeMetaInfo= ruleOverriddenTypeMetaInfo EOF )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1134:2: iv_ruleOverriddenTypeMetaInfo= ruleOverriddenTypeMetaInfo EOF
            {
             newCompositeNode(grammarAccess.getOverriddenTypeMetaInfoRule()); 
            pushFollow(FOLLOW_ruleOverriddenTypeMetaInfo_in_entryRuleOverriddenTypeMetaInfo2274);
            iv_ruleOverriddenTypeMetaInfo=ruleOverriddenTypeMetaInfo();

            state._fsp--;

             current =iv_ruleOverriddenTypeMetaInfo; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOverriddenTypeMetaInfo2284); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOverriddenTypeMetaInfo"


    // $ANTLR start "ruleOverriddenTypeMetaInfo"
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1141:1: ruleOverriddenTypeMetaInfo returns [EObject current=null] : (otherlv_0= '{' ( (lv_metaInfo_1_0= ruleTypeMetaInfo ) ) otherlv_2= '}' ) ;
    public final EObject ruleOverriddenTypeMetaInfo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_metaInfo_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1144:28: ( (otherlv_0= '{' ( (lv_metaInfo_1_0= ruleTypeMetaInfo ) ) otherlv_2= '}' ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1145:1: (otherlv_0= '{' ( (lv_metaInfo_1_0= ruleTypeMetaInfo ) ) otherlv_2= '}' )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1145:1: (otherlv_0= '{' ( (lv_metaInfo_1_0= ruleTypeMetaInfo ) ) otherlv_2= '}' )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1145:3: otherlv_0= '{' ( (lv_metaInfo_1_0= ruleTypeMetaInfo ) ) otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleOverriddenTypeMetaInfo2321); 

                	newLeafNode(otherlv_0, grammarAccess.getOverriddenTypeMetaInfoAccess().getLeftCurlyBracketKeyword_0());
                
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1149:1: ( (lv_metaInfo_1_0= ruleTypeMetaInfo ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1150:1: (lv_metaInfo_1_0= ruleTypeMetaInfo )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1150:1: (lv_metaInfo_1_0= ruleTypeMetaInfo )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1151:3: lv_metaInfo_1_0= ruleTypeMetaInfo
            {
             
            	        newCompositeNode(grammarAccess.getOverriddenTypeMetaInfoAccess().getMetaInfoTypeMetaInfoParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeMetaInfo_in_ruleOverriddenTypeMetaInfo2342);
            lv_metaInfo_1_0=ruleTypeMetaInfo();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOverriddenTypeMetaInfoRule());
            	        }
                   		set(
                   			current, 
                   			"metaInfo",
                    		lv_metaInfo_1_0, 
                    		"TypeMetaInfo");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleOverriddenTypeMetaInfo2354); 

                	newLeafNode(otherlv_2, grammarAccess.getOverriddenTypeMetaInfoAccess().getRightCurlyBracketKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOverriddenTypeMetaInfo"


    // $ANTLR start "entryRuleConstraintCall"
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1179:1: entryRuleConstraintCall returns [EObject current=null] : iv_ruleConstraintCall= ruleConstraintCall EOF ;
    public final EObject entryRuleConstraintCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraintCall = null;


        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1180:2: (iv_ruleConstraintCall= ruleConstraintCall EOF )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1181:2: iv_ruleConstraintCall= ruleConstraintCall EOF
            {
             newCompositeNode(grammarAccess.getConstraintCallRule()); 
            pushFollow(FOLLOW_ruleConstraintCall_in_entryRuleConstraintCall2390);
            iv_ruleConstraintCall=ruleConstraintCall();

            state._fsp--;

             current =iv_ruleConstraintCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraintCall2400); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstraintCall"


    // $ANTLR start "ruleConstraintCall"
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1188:1: ruleConstraintCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_params_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleLiteral ) ) )* otherlv_5= ')' )? ) ;
    public final EObject ruleConstraintCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_params_2_0 = null;

        EObject lv_params_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1191:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_params_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleLiteral ) ) )* otherlv_5= ')' )? ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1192:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_params_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleLiteral ) ) )* otherlv_5= ')' )? )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1192:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_params_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleLiteral ) ) )* otherlv_5= ')' )? )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1192:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_params_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleLiteral ) ) )* otherlv_5= ')' )?
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1192:2: ( (otherlv_0= RULE_ID ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1193:1: (otherlv_0= RULE_ID )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1193:1: (otherlv_0= RULE_ID )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1194:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getConstraintCallRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstraintCall2445); 

            		newLeafNode(otherlv_0, grammarAccess.getConstraintCallAccess().getConstraintConstraintCrossReference_0_0()); 
            	

            }


            }

            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1205:2: (otherlv_1= '(' ( (lv_params_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleLiteral ) ) )* otherlv_5= ')' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==35) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1205:4: otherlv_1= '(' ( (lv_params_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleLiteral ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleConstraintCall2458); 

                        	newLeafNode(otherlv_1, grammarAccess.getConstraintCallAccess().getLeftParenthesisKeyword_1_0());
                        
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1209:1: ( (lv_params_2_0= ruleLiteral ) )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1210:1: (lv_params_2_0= ruleLiteral )
                    {
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1210:1: (lv_params_2_0= ruleLiteral )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1211:3: lv_params_2_0= ruleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getConstraintCallAccess().getParamsLiteralParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLiteral_in_ruleConstraintCall2479);
                    lv_params_2_0=ruleLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConstraintCallRule());
                    	        }
                           		add(
                           			current, 
                           			"params",
                            		lv_params_2_0, 
                            		"Literal");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1227:2: (otherlv_3= ',' ( (lv_params_4_0= ruleLiteral ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==22) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1227:4: otherlv_3= ',' ( (lv_params_4_0= ruleLiteral ) )
                    	    {
                    	    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleConstraintCall2492); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getConstraintCallAccess().getCommaKeyword_1_2_0());
                    	        
                    	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1231:1: ( (lv_params_4_0= ruleLiteral ) )
                    	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1232:1: (lv_params_4_0= ruleLiteral )
                    	    {
                    	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1232:1: (lv_params_4_0= ruleLiteral )
                    	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1233:3: lv_params_4_0= ruleLiteral
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getConstraintCallAccess().getParamsLiteralParserRuleCall_1_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleLiteral_in_ruleConstraintCall2513);
                    	    lv_params_4_0=ruleLiteral();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getConstraintCallRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"params",
                    	            		lv_params_4_0, 
                    	            		"Literal");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,36,FOLLOW_36_in_ruleConstraintCall2527); 

                        	newLeafNode(otherlv_5, grammarAccess.getConstraintCallAccess().getRightParenthesisKeyword_1_3());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstraintCall"


    // $ANTLR start "entryRuleLiteral"
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1261:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1262:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1263:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral2565);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral2575); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1270:1: ruleLiteral returns [EObject current=null] : (this_NullLiteral_0= ruleNullLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NumberLiteral_2= ruleNumberLiteral | this_StringLiteral_3= ruleStringLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_NullLiteral_0 = null;

        EObject this_BooleanLiteral_1 = null;

        EObject this_NumberLiteral_2 = null;

        EObject this_StringLiteral_3 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1273:28: ( (this_NullLiteral_0= ruleNullLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NumberLiteral_2= ruleNumberLiteral | this_StringLiteral_3= ruleStringLiteral ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1274:1: (this_NullLiteral_0= ruleNullLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NumberLiteral_2= ruleNumberLiteral | this_StringLiteral_3= ruleStringLiteral )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1274:1: (this_NullLiteral_0= ruleNullLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NumberLiteral_2= ruleNumberLiteral | this_StringLiteral_3= ruleStringLiteral )
            int alt32=4;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt32=1;
                }
                break;
            case 37:
            case 38:
                {
                alt32=2;
                }
                break;
            case RULE_HEX:
            case RULE_INT:
            case RULE_DECIMAL:
                {
                alt32=3;
                }
                break;
            case RULE_STRING:
                {
                alt32=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1275:5: this_NullLiteral_0= ruleNullLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getNullLiteralParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleNullLiteral_in_ruleLiteral2622);
                    this_NullLiteral_0=ruleNullLiteral();

                    state._fsp--;

                     
                            current = this_NullLiteral_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1285:5: this_BooleanLiteral_1= ruleBooleanLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_ruleLiteral2649);
                    this_BooleanLiteral_1=ruleBooleanLiteral();

                    state._fsp--;

                     
                            current = this_BooleanLiteral_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1295:5: this_NumberLiteral_2= ruleNumberLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getNumberLiteralParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleNumberLiteral_in_ruleLiteral2676);
                    this_NumberLiteral_2=ruleNumberLiteral();

                    state._fsp--;

                     
                            current = this_NumberLiteral_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1305:5: this_StringLiteral_3= ruleStringLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleLiteral2703);
                    this_StringLiteral_3=ruleStringLiteral();

                    state._fsp--;

                     
                            current = this_StringLiteral_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleBooleanLiteral"
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1321:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1322:2: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1323:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
             newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral2738);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;

             current =iv_ruleBooleanLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral2748); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1330:1: ruleBooleanLiteral returns [EObject current=null] : ( () ( ( (lv_value_1_1= 'false' | lv_value_1_2= 'true' ) ) ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_1=null;
        Token lv_value_1_2=null;

         enterRule(); 
            
        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1333:28: ( ( () ( ( (lv_value_1_1= 'false' | lv_value_1_2= 'true' ) ) ) ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1334:1: ( () ( ( (lv_value_1_1= 'false' | lv_value_1_2= 'true' ) ) ) )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1334:1: ( () ( ( (lv_value_1_1= 'false' | lv_value_1_2= 'true' ) ) ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1334:2: () ( ( (lv_value_1_1= 'false' | lv_value_1_2= 'true' ) ) )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1334:2: ()
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1335:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_0(),
                        current);
                

            }

            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1340:2: ( ( (lv_value_1_1= 'false' | lv_value_1_2= 'true' ) ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1341:1: ( (lv_value_1_1= 'false' | lv_value_1_2= 'true' ) )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1341:1: ( (lv_value_1_1= 'false' | lv_value_1_2= 'true' ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1342:1: (lv_value_1_1= 'false' | lv_value_1_2= 'true' )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1342:1: (lv_value_1_1= 'false' | lv_value_1_2= 'true' )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==37) ) {
                alt33=1;
            }
            else if ( (LA33_0==38) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1343:3: lv_value_1_1= 'false'
                    {
                    lv_value_1_1=(Token)match(input,37,FOLLOW_37_in_ruleBooleanLiteral2802); 

                            newLeafNode(lv_value_1_1, grammarAccess.getBooleanLiteralAccess().getValueFalseKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBooleanLiteralRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_1_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1355:8: lv_value_1_2= 'true'
                    {
                    lv_value_1_2=(Token)match(input,38,FOLLOW_38_in_ruleBooleanLiteral2831); 

                            newLeafNode(lv_value_1_2, grammarAccess.getBooleanLiteralAccess().getValueTrueKeyword_1_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBooleanLiteralRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_1_2, null);
                    	    

                    }
                    break;

            }


            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "entryRuleNullLiteral"
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1378:1: entryRuleNullLiteral returns [EObject current=null] : iv_ruleNullLiteral= ruleNullLiteral EOF ;
    public final EObject entryRuleNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullLiteral = null;


        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1379:2: (iv_ruleNullLiteral= ruleNullLiteral EOF )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1380:2: iv_ruleNullLiteral= ruleNullLiteral EOF
            {
             newCompositeNode(grammarAccess.getNullLiteralRule()); 
            pushFollow(FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral2883);
            iv_ruleNullLiteral=ruleNullLiteral();

            state._fsp--;

             current =iv_ruleNullLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullLiteral2893); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNullLiteral"


    // $ANTLR start "ruleNullLiteral"
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1387:1: ruleNullLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= 'null' ) ) ) ;
    public final EObject ruleNullLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1390:28: ( ( () ( (lv_value_1_0= 'null' ) ) ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1391:1: ( () ( (lv_value_1_0= 'null' ) ) )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1391:1: ( () ( (lv_value_1_0= 'null' ) ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1391:2: () ( (lv_value_1_0= 'null' ) )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1391:2: ()
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1392:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getNullLiteralAccess().getNullLiteralAction_0(),
                        current);
                

            }

            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1397:2: ( (lv_value_1_0= 'null' ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1398:1: (lv_value_1_0= 'null' )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1398:1: (lv_value_1_0= 'null' )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1399:3: lv_value_1_0= 'null'
            {
            lv_value_1_0=(Token)match(input,39,FOLLOW_39_in_ruleNullLiteral2945); 

                    newLeafNode(lv_value_1_0, grammarAccess.getNullLiteralAccess().getValueNullKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNullLiteralRule());
            	        }
                   		setWithLastConsumed(current, "value", lv_value_1_0, "null");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNullLiteral"


    // $ANTLR start "entryRuleNumberLiteral"
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1420:1: entryRuleNumberLiteral returns [EObject current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final EObject entryRuleNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteral = null;


        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1421:2: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1422:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
            {
             newCompositeNode(grammarAccess.getNumberLiteralRule()); 
            pushFollow(FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral2994);
            iv_ruleNumberLiteral=ruleNumberLiteral();

            state._fsp--;

             current =iv_ruleNumberLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberLiteral3004); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumberLiteral"


    // $ANTLR start "ruleNumberLiteral"
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1429:1: ruleNumberLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleNumber ) ) ) ;
    public final EObject ruleNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1432:28: ( ( () ( (lv_value_1_0= ruleNumber ) ) ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1433:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1433:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1433:2: () ( (lv_value_1_0= ruleNumber ) )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1433:2: ()
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1434:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getNumberLiteralAccess().getNumberLiteralAction_0(),
                        current);
                

            }

            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1439:2: ( (lv_value_1_0= ruleNumber ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1440:1: (lv_value_1_0= ruleNumber )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1440:1: (lv_value_1_0= ruleNumber )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1441:3: lv_value_1_0= ruleNumber
            {
             
            	        newCompositeNode(grammarAccess.getNumberLiteralAccess().getValueNumberParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleNumber_in_ruleNumberLiteral3059);
            lv_value_1_0=ruleNumber();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNumberLiteralRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"Number");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumberLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1465:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1466:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1467:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             newCompositeNode(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral3095);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;

             current =iv_ruleStringLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral3105); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1474:1: ruleStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1477:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1478:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1478:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1478:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1478:2: ()
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1479:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStringLiteralAccess().getStringLiteralAction_0(),
                        current);
                

            }

            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1484:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1485:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1485:1: (lv_value_1_0= RULE_STRING )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1486:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral3156); 

            			newLeafNode(lv_value_1_0, grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStringLiteralRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleFQN"
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1510:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1511:2: (iv_ruleFQN= ruleFQN EOF )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1512:2: iv_ruleFQN= ruleFQN EOF
            {
             newCompositeNode(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN3198);
            iv_ruleFQN=ruleFQN();

            state._fsp--;

             current =iv_ruleFQN.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN3209); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1519:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1522:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1523:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1523:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1523:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN3249); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1530:1: (kw= '.' this_ID_2= RULE_ID )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==40) ) {
                    int LA34_2 = input.LA(2);

                    if ( (LA34_2==RULE_ID) ) {
                        alt34=1;
                    }


                }


                switch (alt34) {
            	case 1 :
            	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1531:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,40,FOLLOW_40_in_ruleFQN3268); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN3283); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleFQNWithWildcard"
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1551:1: entryRuleFQNWithWildcard returns [String current=null] : iv_ruleFQNWithWildcard= ruleFQNWithWildcard EOF ;
    public final String entryRuleFQNWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQNWithWildcard = null;


        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1552:2: (iv_ruleFQNWithWildcard= ruleFQNWithWildcard EOF )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1553:2: iv_ruleFQNWithWildcard= ruleFQNWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getFQNWithWildcardRule()); 
            pushFollow(FOLLOW_ruleFQNWithWildcard_in_entryRuleFQNWithWildcard3331);
            iv_ruleFQNWithWildcard=ruleFQNWithWildcard();

            state._fsp--;

             current =iv_ruleFQNWithWildcard.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQNWithWildcard3342); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFQNWithWildcard"


    // $ANTLR start "ruleFQNWithWildcard"
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1560:1: ruleFQNWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FQN_0= ruleFQN kw= '.' kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleFQNWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FQN_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1563:28: ( (this_FQN_0= ruleFQN kw= '.' kw= '*' ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1564:1: (this_FQN_0= ruleFQN kw= '.' kw= '*' )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1564:1: (this_FQN_0= ruleFQN kw= '.' kw= '*' )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1565:5: this_FQN_0= ruleFQN kw= '.' kw= '*'
            {
             
                    newCompositeNode(grammarAccess.getFQNWithWildcardAccess().getFQNParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleFQN_in_ruleFQNWithWildcard3389);
            this_FQN_0=ruleFQN();

            state._fsp--;


            		current.merge(this_FQN_0);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,40,FOLLOW_40_in_ruleFQNWithWildcard3407); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getFQNWithWildcardAccess().getFullStopKeyword_1()); 
                
            kw=(Token)match(input,33,FOLLOW_33_in_ruleFQNWithWildcard3420); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getFQNWithWildcardAccess().getAsteriskKeyword_2()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFQNWithWildcard"


    // $ANTLR start "entryRuleNumber"
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1595:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1599:2: (iv_ruleNumber= ruleNumber EOF )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1600:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber3467);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber3478); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1610:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_HEX_0=null;
        Token this_INT_1=null;
        Token this_DECIMAL_2=null;
        Token kw=null;
        Token this_INT_4=null;
        Token this_DECIMAL_5=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1614:28: ( (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1615:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1615:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_HEX) ) {
                alt38=1;
            }
            else if ( ((LA38_0>=RULE_INT && LA38_0<=RULE_DECIMAL)) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1615:6: this_HEX_0= RULE_HEX
                    {
                    this_HEX_0=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleNumber3522); 

                    		current.merge(this_HEX_0);
                        
                     
                        newLeafNode(this_HEX_0, grammarAccess.getNumberAccess().getHEXTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1623:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    {
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1623:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1623:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    {
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1623:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL )
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==RULE_INT) ) {
                        alt35=1;
                    }
                    else if ( (LA35_0==RULE_DECIMAL) ) {
                        alt35=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 0, input);

                        throw nvae;
                    }
                    switch (alt35) {
                        case 1 :
                            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1623:12: this_INT_1= RULE_INT
                            {
                            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber3550); 

                            		current.merge(this_INT_1);
                                
                             
                                newLeafNode(this_INT_1, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_0_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1631:10: this_DECIMAL_2= RULE_DECIMAL
                            {
                            this_DECIMAL_2=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber3576); 

                            		current.merge(this_DECIMAL_2);
                                
                             
                                newLeafNode(this_DECIMAL_2, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_0_1()); 
                                

                            }
                            break;

                    }

                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1638:2: (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==40) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1639:2: kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            {
                            kw=(Token)match(input,40,FOLLOW_40_in_ruleNumber3596); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getNumberAccess().getFullStopKeyword_1_1_0()); 
                                
                            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1644:1: (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            int alt36=2;
                            int LA36_0 = input.LA(1);

                            if ( (LA36_0==RULE_INT) ) {
                                alt36=1;
                            }
                            else if ( (LA36_0==RULE_DECIMAL) ) {
                                alt36=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 36, 0, input);

                                throw nvae;
                            }
                            switch (alt36) {
                                case 1 :
                                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1644:6: this_INT_4= RULE_INT
                                    {
                                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber3612); 

                                    		current.merge(this_INT_4);
                                        
                                     
                                        newLeafNode(this_INT_4, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1_1_0()); 
                                        

                                    }
                                    break;
                                case 2 :
                                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1652:10: this_DECIMAL_5= RULE_DECIMAL
                                    {
                                    this_DECIMAL_5=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber3638); 

                                    		current.merge(this_DECIMAL_5);
                                        
                                     
                                        newLeafNode(this_DECIMAL_5, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_1_1_1()); 
                                        

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleNumber"

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\6\uffff";
    static final String DFA5_eofS =
        "\1\uffff\1\3\2\uffff\1\3\1\uffff";
    static final String DFA5_minS =
        "\1\4\1\5\1\4\1\uffff\1\5\1\uffff";
    static final String DFA5_maxS =
        "\1\4\1\50\1\41\1\uffff\1\50\1\uffff";
    static final String DFA5_acceptS =
        "\3\uffff\1\1\1\uffff\1\2";
    static final String DFA5_specialS =
        "\6\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1",
            "\1\3\11\uffff\1\3\1\uffff\2\3\1\uffff\1\3\3\uffff\1\3\1\uffff\1\3\15\uffff\1\2",
            "\1\4\34\uffff\1\5",
            "",
            "\1\3\11\uffff\1\3\1\uffff\2\3\1\uffff\1\3\3\uffff\1\3\1\uffff\1\3\15\uffff\1\2",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "281:1: (lv_importedNamespace_1_1= ruleFQN | lv_importedNamespace_1_2= ruleFQNWithWildcard )";
        }
    }
 

    public static final BitSet FOLLOW_ruleDomainModel_in_entryRuleDomainModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContext_in_ruleDomainModel130 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleContext_in_entryRuleContext166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContext176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleContext213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContext230 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleContext247 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_ruleNamespace_in_ruleContext268 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleContext281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespace_in_entryRuleNamespace317 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamespace327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleNamespace364 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleNamespace385 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleNamespace397 = new BitSet(new long[]{0x0000000005168020L});
    public static final BitSet FOLLOW_ruleImport_in_ruleNamespace418 = new BitSet(new long[]{0x0000000005168020L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_ruleNamespace440 = new BitSet(new long[]{0x0000000005148020L});
    public static final BitSet FOLLOW_15_in_ruleNamespace453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport489 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleImport536 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleImport559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQNWithWildcard_in_ruleImport578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement617 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_ruleAbstractElement674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandHandler_in_ruleAbstractElement701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProjection_in_ruleAbstractElement728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleView_in_ruleAbstractElement755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_entryRuleCommand790 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommand800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleCommand842 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleCommand860 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCommand877 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCommand894 = new BitSet(new long[]{0x0000000100088030L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleCommand915 = new BitSet(new long[]{0x0000000100088030L});
    public static final BitSet FOLLOW_19_in_ruleCommand929 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCommand946 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCommand965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandHandler_in_entryRuleCommandHandler1001 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommandHandler1011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleCommandHandler1053 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleCommandHandler1071 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCommandHandler1088 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleCommandHandler1105 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCommandHandler1125 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_22_in_ruleCommandHandler1138 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCommandHandler1158 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_23_in_ruleCommandHandler1173 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCommandHandler1193 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleCommandHandler1206 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCommandHandler1226 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleProjection_in_entryRuleProjection1266 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProjection1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleProjection1318 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleProjection1336 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProjection1353 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleProjection1371 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProjection1391 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleProjection1404 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProjection1424 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleView_in_entryRuleView1464 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleView1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleView1516 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleView1534 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleView1551 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleView1568 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleView1588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeMetaInfo_in_entryRuleTypeMetaInfo1624 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeMetaInfo1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleTypeMetaInfo1681 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTypeMetaInfo1698 = new BitSet(new long[]{0x00000000F0000002L});
    public static final BitSet FOLLOW_28_in_ruleTypeMetaInfo1718 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTypeMetaInfo1735 = new BitSet(new long[]{0x00000000E0000002L});
    public static final BitSet FOLLOW_29_in_ruleTypeMetaInfo1755 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTypeMetaInfo1772 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_30_in_ruleTypeMetaInfo1792 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTypeMetaInfo1809 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_ruleTypeMetaInfo1829 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTypeMetaInfo1846 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable1890 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable1900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleVariable1942 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_32_in_ruleVariable1966 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable2000 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_33_in_ruleVariable2018 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable2049 = new BitSet(new long[]{0x0000000400004002L});
    public static final BitSet FOLLOW_ruleInvariants_in_ruleVariable2075 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleOverriddenTypeMetaInfo_in_ruleVariable2097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvariants_in_entryRuleInvariants2134 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInvariants2144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleInvariants2181 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleConstraintCall_in_ruleInvariants2202 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleInvariants2215 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleConstraintCall_in_ruleInvariants2236 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleOverriddenTypeMetaInfo_in_entryRuleOverriddenTypeMetaInfo2274 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOverriddenTypeMetaInfo2284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleOverriddenTypeMetaInfo2321 = new BitSet(new long[]{0x00000000F8008000L});
    public static final BitSet FOLLOW_ruleTypeMetaInfo_in_ruleOverriddenTypeMetaInfo2342 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleOverriddenTypeMetaInfo2354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraintCall_in_entryRuleConstraintCall2390 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraintCall2400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstraintCall2445 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_ruleConstraintCall2458 = new BitSet(new long[]{0x000000E0000003C0L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleConstraintCall2479 = new BitSet(new long[]{0x0000001000400000L});
    public static final BitSet FOLLOW_22_in_ruleConstraintCall2492 = new BitSet(new long[]{0x000000E0000003C0L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleConstraintCall2513 = new BitSet(new long[]{0x0000001000400000L});
    public static final BitSet FOLLOW_36_in_ruleConstraintCall2527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral2565 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral2575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_ruleLiteral2622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleLiteral2649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_ruleLiteral2676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleLiteral2703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral2738 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral2748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleBooleanLiteral2802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleBooleanLiteral2831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral2883 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullLiteral2893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleNullLiteral2945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral2994 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberLiteral3004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleNumberLiteral3059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral3095 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral3105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral3156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN3198 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN3209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN3249 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_ruleFQN3268 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN3283 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ruleFQNWithWildcard_in_entryRuleFQNWithWildcard3331 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQNWithWildcard3342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleFQNWithWildcard3389 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleFQNWithWildcard3407 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleFQNWithWildcard3420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber3467 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber3478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleNumber3522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber3550 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber3576 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_ruleNumber3596 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber3612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber3638 = new BitSet(new long[]{0x0000000000000002L});

}