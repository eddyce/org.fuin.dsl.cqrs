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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_DOC", "RULE_STRING", "RULE_HEX", "RULE_INT", "RULE_DECIMAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'context'", "'{'", "'}'", "'namespace'", "'import'", "'command'", "'target'", "'message'", "'command-handler'", "'handles'", "','", "'uses'", "'projection'", "'input'", "'view'", "'slabel'", "'label'", "'tooltip'", "'prompt'", "'examples'", "'nullable'", "'*'", "'invariants'", "'('", "')'", "'false'", "'true'", "'null'", "'.'"
    };
    public static final int RULE_ID=4;
    public static final int T__40=40;
    public static final int T__41=41;
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

                if ( (LA4_0==RULE_DOC||LA4_0==18||LA4_0==21||LA4_0==25||LA4_0==27) ) {
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
                case 27:
                    {
                    alt6=4;
                    }
                    break;
                case 18:
                    {
                    alt6=1;
                    }
                    break;
                case 25:
                    {
                    alt6=3;
                    }
                    break;
                case 21:
                    {
                    alt6=2;
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
            case 21:
                {
                alt6=2;
                }
                break;
            case 25:
                {
                alt6=3;
                }
                break;
            case 27:
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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:392:1: ruleCommand returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'command' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'target' ( ( ruleFQN ) ) )? otherlv_5= '{' ( (lv_variables_6_0= ruleVariable ) )* (otherlv_7= 'message' ( (lv_message_8_0= RULE_STRING ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        Token lv_doc_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_message_8_0=null;
        Token otherlv_9=null;
        EObject lv_variables_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:395:28: ( ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'command' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'target' ( ( ruleFQN ) ) )? otherlv_5= '{' ( (lv_variables_6_0= ruleVariable ) )* (otherlv_7= 'message' ( (lv_message_8_0= RULE_STRING ) ) )? otherlv_9= '}' ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:396:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'command' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'target' ( ( ruleFQN ) ) )? otherlv_5= '{' ( (lv_variables_6_0= ruleVariable ) )* (otherlv_7= 'message' ( (lv_message_8_0= RULE_STRING ) ) )? otherlv_9= '}' )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:396:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'command' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'target' ( ( ruleFQN ) ) )? otherlv_5= '{' ( (lv_variables_6_0= ruleVariable ) )* (otherlv_7= 'message' ( (lv_message_8_0= RULE_STRING ) ) )? otherlv_9= '}' )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:396:2: ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'command' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'target' ( ( ruleFQN ) ) )? otherlv_5= '{' ( (lv_variables_6_0= ruleVariable ) )* (otherlv_7= 'message' ( (lv_message_8_0= RULE_STRING ) ) )? otherlv_9= '}'
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

            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:436:2: (otherlv_3= 'target' ( ( ruleFQN ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:436:4: otherlv_3= 'target' ( ( ruleFQN ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleCommand895); 

                        	newLeafNode(otherlv_3, grammarAccess.getCommandAccess().getTargetKeyword_3_0());
                        
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:440:1: ( ( ruleFQN ) )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:441:1: ( ruleFQN )
                    {
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:441:1: ( ruleFQN )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:442:3: ruleFQN
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getCommandRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getCommandAccess().getTargetAbstractMethodCrossReference_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleCommand918);
                    ruleFQN();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleCommand932); 

                	newLeafNode(otherlv_5, grammarAccess.getCommandAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:459:1: ( (lv_variables_6_0= ruleVariable ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_ID && LA9_0<=RULE_DOC)||LA9_0==33) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:460:1: (lv_variables_6_0= ruleVariable )
            	    {
            	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:460:1: (lv_variables_6_0= ruleVariable )
            	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:461:3: lv_variables_6_0= ruleVariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCommandAccess().getVariablesVariableParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVariable_in_ruleCommand953);
            	    lv_variables_6_0=ruleVariable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCommandRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"variables",
            	            		lv_variables_6_0, 
            	            		"Variable");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:477:3: (otherlv_7= 'message' ( (lv_message_8_0= RULE_STRING ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:477:5: otherlv_7= 'message' ( (lv_message_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleCommand967); 

                        	newLeafNode(otherlv_7, grammarAccess.getCommandAccess().getMessageKeyword_6_0());
                        
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:481:1: ( (lv_message_8_0= RULE_STRING ) )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:482:1: (lv_message_8_0= RULE_STRING )
                    {
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:482:1: (lv_message_8_0= RULE_STRING )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:483:3: lv_message_8_0= RULE_STRING
                    {
                    lv_message_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCommand984); 

                    			newLeafNode(lv_message_8_0, grammarAccess.getCommandAccess().getMessageSTRINGTerminalRuleCall_6_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCommandRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"message",
                            		lv_message_8_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleCommand1003); 

                	newLeafNode(otherlv_9, grammarAccess.getCommandAccess().getRightCurlyBracketKeyword_7());
                

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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:511:1: entryRuleCommandHandler returns [EObject current=null] : iv_ruleCommandHandler= ruleCommandHandler EOF ;
    public final EObject entryRuleCommandHandler() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommandHandler = null;


        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:512:2: (iv_ruleCommandHandler= ruleCommandHandler EOF )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:513:2: iv_ruleCommandHandler= ruleCommandHandler EOF
            {
             newCompositeNode(grammarAccess.getCommandHandlerRule()); 
            pushFollow(FOLLOW_ruleCommandHandler_in_entryRuleCommandHandler1039);
            iv_ruleCommandHandler=ruleCommandHandler();

            state._fsp--;

             current =iv_ruleCommandHandler; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommandHandler1049); 

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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:520:1: ruleCommandHandler returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'command-handler' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'handles' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'uses' ( ( ruleFQN ) ) (otherlv_9= ',' ( ( ruleFQN ) ) )* )? ) ;
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
        Token otherlv_9=null;

         enterRule(); 
            
        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:523:28: ( ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'command-handler' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'handles' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'uses' ( ( ruleFQN ) ) (otherlv_9= ',' ( ( ruleFQN ) ) )* )? ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:524:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'command-handler' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'handles' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'uses' ( ( ruleFQN ) ) (otherlv_9= ',' ( ( ruleFQN ) ) )* )? )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:524:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'command-handler' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'handles' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'uses' ( ( ruleFQN ) ) (otherlv_9= ',' ( ( ruleFQN ) ) )* )? )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:524:2: ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'command-handler' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'handles' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'uses' ( ( ruleFQN ) ) (otherlv_9= ',' ( ( ruleFQN ) ) )* )?
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:524:2: ( (lv_doc_0_0= RULE_DOC ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_DOC) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:525:1: (lv_doc_0_0= RULE_DOC )
                    {
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:525:1: (lv_doc_0_0= RULE_DOC )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:526:3: lv_doc_0_0= RULE_DOC
                    {
                    lv_doc_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleCommandHandler1091); 

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

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleCommandHandler1109); 

                	newLeafNode(otherlv_1, grammarAccess.getCommandHandlerAccess().getCommandHandlerKeyword_1());
                
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:546:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:547:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:547:1: (lv_name_2_0= RULE_ID )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:548:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCommandHandler1126); 

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

            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleCommandHandler1143); 

                	newLeafNode(otherlv_3, grammarAccess.getCommandHandlerAccess().getHandlesKeyword_3());
                
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:568:1: ( (otherlv_4= RULE_ID ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:569:1: (otherlv_4= RULE_ID )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:569:1: (otherlv_4= RULE_ID )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:570:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getCommandHandlerRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCommandHandler1163); 

            		newLeafNode(otherlv_4, grammarAccess.getCommandHandlerAccess().getCommandsCommandCrossReference_4_0()); 
            	

            }


            }

            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:581:2: (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==23) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:581:4: otherlv_5= ',' ( (otherlv_6= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,23,FOLLOW_23_in_ruleCommandHandler1176); 

            	        	newLeafNode(otherlv_5, grammarAccess.getCommandHandlerAccess().getCommaKeyword_5_0());
            	        
            	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:585:1: ( (otherlv_6= RULE_ID ) )
            	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:586:1: (otherlv_6= RULE_ID )
            	    {
            	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:586:1: (otherlv_6= RULE_ID )
            	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:587:3: otherlv_6= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getCommandHandlerRule());
            	    	        }
            	            
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCommandHandler1196); 

            	    		newLeafNode(otherlv_6, grammarAccess.getCommandHandlerAccess().getCommandsCommandCrossReference_5_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:598:4: (otherlv_7= 'uses' ( ( ruleFQN ) ) (otherlv_9= ',' ( ( ruleFQN ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:598:6: otherlv_7= 'uses' ( ( ruleFQN ) ) (otherlv_9= ',' ( ( ruleFQN ) ) )*
                    {
                    otherlv_7=(Token)match(input,24,FOLLOW_24_in_ruleCommandHandler1211); 

                        	newLeafNode(otherlv_7, grammarAccess.getCommandHandlerAccess().getUsesKeyword_6_0());
                        
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:602:1: ( ( ruleFQN ) )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:603:1: ( ruleFQN )
                    {
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:603:1: ( ruleFQN )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:604:3: ruleFQN
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getCommandHandlerRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getCommandHandlerAccess().getAggregatesAggregateCrossReference_6_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleCommandHandler1234);
                    ruleFQN();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:617:2: (otherlv_9= ',' ( ( ruleFQN ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==23) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:617:4: otherlv_9= ',' ( ( ruleFQN ) )
                    	    {
                    	    otherlv_9=(Token)match(input,23,FOLLOW_23_in_ruleCommandHandler1247); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getCommandHandlerAccess().getCommaKeyword_6_2_0());
                    	        
                    	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:621:1: ( ( ruleFQN ) )
                    	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:622:1: ( ruleFQN )
                    	    {
                    	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:622:1: ( ruleFQN )
                    	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:623:3: ruleFQN
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getCommandHandlerRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getCommandHandlerAccess().getAggregatesAggregateCrossReference_6_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleFQN_in_ruleCommandHandler1270);
                    	    ruleFQN();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:644:1: entryRuleProjection returns [EObject current=null] : iv_ruleProjection= ruleProjection EOF ;
    public final EObject entryRuleProjection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProjection = null;


        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:645:2: (iv_ruleProjection= ruleProjection EOF )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:646:2: iv_ruleProjection= ruleProjection EOF
            {
             newCompositeNode(grammarAccess.getProjectionRule()); 
            pushFollow(FOLLOW_ruleProjection_in_entryRuleProjection1310);
            iv_ruleProjection=ruleProjection();

            state._fsp--;

             current =iv_ruleProjection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProjection1320); 

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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:653:1: ruleProjection returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'projection' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'input' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )* )? ) ;
    public final EObject ruleProjection() throws RecognitionException {
        EObject current = null;

        Token lv_doc_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:656:28: ( ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'projection' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'input' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )* )? ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:657:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'projection' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'input' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )* )? )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:657:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'projection' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'input' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )* )? )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:657:2: ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'projection' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'input' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )* )?
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:657:2: ( (lv_doc_0_0= RULE_DOC ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_DOC) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:658:1: (lv_doc_0_0= RULE_DOC )
                    {
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:658:1: (lv_doc_0_0= RULE_DOC )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:659:3: lv_doc_0_0= RULE_DOC
                    {
                    lv_doc_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleProjection1362); 

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

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleProjection1380); 

                	newLeafNode(otherlv_1, grammarAccess.getProjectionAccess().getProjectionKeyword_1());
                
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:679:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:680:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:680:1: (lv_name_2_0= RULE_ID )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:681:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProjection1397); 

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

            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:697:2: (otherlv_3= 'input' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==26) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:697:4: otherlv_3= 'input' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )*
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleProjection1415); 

                        	newLeafNode(otherlv_3, grammarAccess.getProjectionAccess().getInputKeyword_3_0());
                        
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:701:1: ( ( ruleFQN ) )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:702:1: ( ruleFQN )
                    {
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:702:1: ( ruleFQN )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:703:3: ruleFQN
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getProjectionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getProjectionAccess().getEventsEventCrossReference_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleProjection1438);
                    ruleFQN();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:716:2: (otherlv_5= ',' ( ( ruleFQN ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==23) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:716:4: otherlv_5= ',' ( ( ruleFQN ) )
                    	    {
                    	    otherlv_5=(Token)match(input,23,FOLLOW_23_in_ruleProjection1451); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getProjectionAccess().getCommaKeyword_3_2_0());
                    	        
                    	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:720:1: ( ( ruleFQN ) )
                    	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:721:1: ( ruleFQN )
                    	    {
                    	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:721:1: ( ruleFQN )
                    	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:722:3: ruleFQN
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getProjectionRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getProjectionAccess().getEventsEventCrossReference_3_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleFQN_in_ruleProjection1474);
                    	    ruleFQN();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:743:1: entryRuleView returns [EObject current=null] : iv_ruleView= ruleView EOF ;
    public final EObject entryRuleView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleView = null;


        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:744:2: (iv_ruleView= ruleView EOF )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:745:2: iv_ruleView= ruleView EOF
            {
             newCompositeNode(grammarAccess.getViewRule()); 
            pushFollow(FOLLOW_ruleView_in_entryRuleView1514);
            iv_ruleView=ruleView();

            state._fsp--;

             current =iv_ruleView; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleView1524); 

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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:752:1: ruleView returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'view' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'uses' ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleView() throws RecognitionException {
        EObject current = null;

        Token lv_doc_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:755:28: ( ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'view' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'uses' ( (otherlv_4= RULE_ID ) ) ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:756:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'view' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'uses' ( (otherlv_4= RULE_ID ) ) )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:756:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'view' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'uses' ( (otherlv_4= RULE_ID ) ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:756:2: ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'view' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'uses' ( (otherlv_4= RULE_ID ) )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:756:2: ( (lv_doc_0_0= RULE_DOC ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_DOC) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:757:1: (lv_doc_0_0= RULE_DOC )
                    {
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:757:1: (lv_doc_0_0= RULE_DOC )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:758:3: lv_doc_0_0= RULE_DOC
                    {
                    lv_doc_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleView1566); 

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

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleView1584); 

                	newLeafNode(otherlv_1, grammarAccess.getViewAccess().getViewKeyword_1());
                
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:778:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:779:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:779:1: (lv_name_2_0= RULE_ID )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:780:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleView1601); 

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

            otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleView1618); 

                	newLeafNode(otherlv_3, grammarAccess.getViewAccess().getUsesKeyword_3());
                
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:800:1: ( (otherlv_4= RULE_ID ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:801:1: (otherlv_4= RULE_ID )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:801:1: (otherlv_4= RULE_ID )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:802:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getViewRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleView1638); 

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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:821:1: entryRuleTypeMetaInfo returns [EObject current=null] : iv_ruleTypeMetaInfo= ruleTypeMetaInfo EOF ;
    public final EObject entryRuleTypeMetaInfo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeMetaInfo = null;


        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:822:2: (iv_ruleTypeMetaInfo= ruleTypeMetaInfo EOF )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:823:2: iv_ruleTypeMetaInfo= ruleTypeMetaInfo EOF
            {
             newCompositeNode(grammarAccess.getTypeMetaInfoRule()); 
            pushFollow(FOLLOW_ruleTypeMetaInfo_in_entryRuleTypeMetaInfo1674);
            iv_ruleTypeMetaInfo=ruleTypeMetaInfo();

            state._fsp--;

             current =iv_ruleTypeMetaInfo; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeMetaInfo1684); 

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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:830:1: ruleTypeMetaInfo returns [EObject current=null] : ( () (otherlv_1= 'slabel' ( (lv_slabel_2_0= RULE_STRING ) ) )? (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )? (otherlv_5= 'tooltip' ( (lv_tooltip_6_0= RULE_STRING ) ) )? (otherlv_7= 'prompt' ( (lv_prompt_8_0= RULE_STRING ) ) )? (otherlv_9= 'examples' ( (lv_examples_10_0= ruleLiteral ) )* )? ) ;
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
        EObject lv_examples_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:833:28: ( ( () (otherlv_1= 'slabel' ( (lv_slabel_2_0= RULE_STRING ) ) )? (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )? (otherlv_5= 'tooltip' ( (lv_tooltip_6_0= RULE_STRING ) ) )? (otherlv_7= 'prompt' ( (lv_prompt_8_0= RULE_STRING ) ) )? (otherlv_9= 'examples' ( (lv_examples_10_0= ruleLiteral ) )* )? ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:834:1: ( () (otherlv_1= 'slabel' ( (lv_slabel_2_0= RULE_STRING ) ) )? (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )? (otherlv_5= 'tooltip' ( (lv_tooltip_6_0= RULE_STRING ) ) )? (otherlv_7= 'prompt' ( (lv_prompt_8_0= RULE_STRING ) ) )? (otherlv_9= 'examples' ( (lv_examples_10_0= ruleLiteral ) )* )? )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:834:1: ( () (otherlv_1= 'slabel' ( (lv_slabel_2_0= RULE_STRING ) ) )? (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )? (otherlv_5= 'tooltip' ( (lv_tooltip_6_0= RULE_STRING ) ) )? (otherlv_7= 'prompt' ( (lv_prompt_8_0= RULE_STRING ) ) )? (otherlv_9= 'examples' ( (lv_examples_10_0= ruleLiteral ) )* )? )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:834:2: () (otherlv_1= 'slabel' ( (lv_slabel_2_0= RULE_STRING ) ) )? (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )? (otherlv_5= 'tooltip' ( (lv_tooltip_6_0= RULE_STRING ) ) )? (otherlv_7= 'prompt' ( (lv_prompt_8_0= RULE_STRING ) ) )? (otherlv_9= 'examples' ( (lv_examples_10_0= ruleLiteral ) )* )?
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:834:2: ()
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:835:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTypeMetaInfoAccess().getTypeMetaInfoAction_0(),
                        current);
                

            }

            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:840:2: (otherlv_1= 'slabel' ( (lv_slabel_2_0= RULE_STRING ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==28) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:840:4: otherlv_1= 'slabel' ( (lv_slabel_2_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleTypeMetaInfo1731); 

                        	newLeafNode(otherlv_1, grammarAccess.getTypeMetaInfoAccess().getSlabelKeyword_1_0());
                        
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:844:1: ( (lv_slabel_2_0= RULE_STRING ) )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:845:1: (lv_slabel_2_0= RULE_STRING )
                    {
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:845:1: (lv_slabel_2_0= RULE_STRING )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:846:3: lv_slabel_2_0= RULE_STRING
                    {
                    lv_slabel_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTypeMetaInfo1748); 

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

            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:862:4: (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==29) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:862:6: otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleTypeMetaInfo1768); 

                        	newLeafNode(otherlv_3, grammarAccess.getTypeMetaInfoAccess().getLabelKeyword_2_0());
                        
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:866:1: ( (lv_label_4_0= RULE_STRING ) )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:867:1: (lv_label_4_0= RULE_STRING )
                    {
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:867:1: (lv_label_4_0= RULE_STRING )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:868:3: lv_label_4_0= RULE_STRING
                    {
                    lv_label_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTypeMetaInfo1785); 

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

            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:884:4: (otherlv_5= 'tooltip' ( (lv_tooltip_6_0= RULE_STRING ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==30) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:884:6: otherlv_5= 'tooltip' ( (lv_tooltip_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,30,FOLLOW_30_in_ruleTypeMetaInfo1805); 

                        	newLeafNode(otherlv_5, grammarAccess.getTypeMetaInfoAccess().getTooltipKeyword_3_0());
                        
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:888:1: ( (lv_tooltip_6_0= RULE_STRING ) )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:889:1: (lv_tooltip_6_0= RULE_STRING )
                    {
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:889:1: (lv_tooltip_6_0= RULE_STRING )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:890:3: lv_tooltip_6_0= RULE_STRING
                    {
                    lv_tooltip_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTypeMetaInfo1822); 

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

            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:906:4: (otherlv_7= 'prompt' ( (lv_prompt_8_0= RULE_STRING ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==31) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:906:6: otherlv_7= 'prompt' ( (lv_prompt_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,31,FOLLOW_31_in_ruleTypeMetaInfo1842); 

                        	newLeafNode(otherlv_7, grammarAccess.getTypeMetaInfoAccess().getPromptKeyword_4_0());
                        
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:910:1: ( (lv_prompt_8_0= RULE_STRING ) )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:911:1: (lv_prompt_8_0= RULE_STRING )
                    {
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:911:1: (lv_prompt_8_0= RULE_STRING )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:912:3: lv_prompt_8_0= RULE_STRING
                    {
                    lv_prompt_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTypeMetaInfo1859); 

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

            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:928:4: (otherlv_9= 'examples' ( (lv_examples_10_0= ruleLiteral ) )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==32) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:928:6: otherlv_9= 'examples' ( (lv_examples_10_0= ruleLiteral ) )*
                    {
                    otherlv_9=(Token)match(input,32,FOLLOW_32_in_ruleTypeMetaInfo1879); 

                        	newLeafNode(otherlv_9, grammarAccess.getTypeMetaInfoAccess().getExamplesKeyword_5_0());
                        
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:932:1: ( (lv_examples_10_0= ruleLiteral ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( ((LA23_0>=RULE_STRING && LA23_0<=RULE_DECIMAL)||(LA23_0>=38 && LA23_0<=40)) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:933:1: (lv_examples_10_0= ruleLiteral )
                    	    {
                    	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:933:1: (lv_examples_10_0= ruleLiteral )
                    	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:934:3: lv_examples_10_0= ruleLiteral
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTypeMetaInfoAccess().getExamplesLiteralParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleLiteral_in_ruleTypeMetaInfo1900);
                    	    lv_examples_10_0=ruleLiteral();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTypeMetaInfoRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"examples",
                    	            		lv_examples_10_0, 
                    	            		"Literal");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:958:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:959:2: (iv_ruleVariable= ruleVariable EOF )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:960:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable1939);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable1949); 

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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:967:1: ruleVariable returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) )? ( (lv_nullable_1_0= 'nullable' ) )? ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= '*' ) )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_invariants_5_0= ruleInvariants ) )? ( (lv_overridden_6_0= ruleOverriddenTypeMetaInfo ) )? ) ;
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
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:970:28: ( ( ( (lv_doc_0_0= RULE_DOC ) )? ( (lv_nullable_1_0= 'nullable' ) )? ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= '*' ) )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_invariants_5_0= ruleInvariants ) )? ( (lv_overridden_6_0= ruleOverriddenTypeMetaInfo ) )? ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:971:1: ( ( (lv_doc_0_0= RULE_DOC ) )? ( (lv_nullable_1_0= 'nullable' ) )? ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= '*' ) )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_invariants_5_0= ruleInvariants ) )? ( (lv_overridden_6_0= ruleOverriddenTypeMetaInfo ) )? )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:971:1: ( ( (lv_doc_0_0= RULE_DOC ) )? ( (lv_nullable_1_0= 'nullable' ) )? ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= '*' ) )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_invariants_5_0= ruleInvariants ) )? ( (lv_overridden_6_0= ruleOverriddenTypeMetaInfo ) )? )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:971:2: ( (lv_doc_0_0= RULE_DOC ) )? ( (lv_nullable_1_0= 'nullable' ) )? ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= '*' ) )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_invariants_5_0= ruleInvariants ) )? ( (lv_overridden_6_0= ruleOverriddenTypeMetaInfo ) )?
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:971:2: ( (lv_doc_0_0= RULE_DOC ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_DOC) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:972:1: (lv_doc_0_0= RULE_DOC )
                    {
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:972:1: (lv_doc_0_0= RULE_DOC )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:973:3: lv_doc_0_0= RULE_DOC
                    {
                    lv_doc_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleVariable1991); 

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

            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:989:3: ( (lv_nullable_1_0= 'nullable' ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==33) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:990:1: (lv_nullable_1_0= 'nullable' )
                    {
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:990:1: (lv_nullable_1_0= 'nullable' )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:991:3: lv_nullable_1_0= 'nullable'
                    {
                    lv_nullable_1_0=(Token)match(input,33,FOLLOW_33_in_ruleVariable2015); 

                            newLeafNode(lv_nullable_1_0, grammarAccess.getVariableAccess().getNullableNullableKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVariableRule());
                    	        }
                           		setWithLastConsumed(current, "nullable", lv_nullable_1_0, "nullable");
                    	    

                    }


                    }
                    break;

            }

            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1004:3: ( (otherlv_2= RULE_ID ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1005:1: (otherlv_2= RULE_ID )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1005:1: (otherlv_2= RULE_ID )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1006:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getVariableRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable2049); 

            		newLeafNode(otherlv_2, grammarAccess.getVariableAccess().getTypeTypeCrossReference_2_0()); 
            	

            }


            }

            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1017:2: ( (lv_multiplicity_3_0= '*' ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==34) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1018:1: (lv_multiplicity_3_0= '*' )
                    {
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1018:1: (lv_multiplicity_3_0= '*' )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1019:3: lv_multiplicity_3_0= '*'
                    {
                    lv_multiplicity_3_0=(Token)match(input,34,FOLLOW_34_in_ruleVariable2067); 

                            newLeafNode(lv_multiplicity_3_0, grammarAccess.getVariableAccess().getMultiplicityAsteriskKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVariableRule());
                    	        }
                           		setWithLastConsumed(current, "multiplicity", lv_multiplicity_3_0, "*");
                    	    

                    }


                    }
                    break;

            }

            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1032:3: ( (lv_name_4_0= RULE_ID ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1033:1: (lv_name_4_0= RULE_ID )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1033:1: (lv_name_4_0= RULE_ID )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1034:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable2098); 

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

            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1050:2: ( (lv_invariants_5_0= ruleInvariants ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==35) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1051:1: (lv_invariants_5_0= ruleInvariants )
                    {
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1051:1: (lv_invariants_5_0= ruleInvariants )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1052:3: lv_invariants_5_0= ruleInvariants
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableAccess().getInvariantsInvariantsParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleInvariants_in_ruleVariable2124);
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

            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1068:3: ( (lv_overridden_6_0= ruleOverriddenTypeMetaInfo ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==14) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1069:1: (lv_overridden_6_0= ruleOverriddenTypeMetaInfo )
                    {
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1069:1: (lv_overridden_6_0= ruleOverriddenTypeMetaInfo )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1070:3: lv_overridden_6_0= ruleOverriddenTypeMetaInfo
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariableAccess().getOverriddenOverriddenTypeMetaInfoParserRuleCall_6_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOverriddenTypeMetaInfo_in_ruleVariable2146);
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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1094:1: entryRuleInvariants returns [EObject current=null] : iv_ruleInvariants= ruleInvariants EOF ;
    public final EObject entryRuleInvariants() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvariants = null;


        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1095:2: (iv_ruleInvariants= ruleInvariants EOF )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1096:2: iv_ruleInvariants= ruleInvariants EOF
            {
             newCompositeNode(grammarAccess.getInvariantsRule()); 
            pushFollow(FOLLOW_ruleInvariants_in_entryRuleInvariants2183);
            iv_ruleInvariants=ruleInvariants();

            state._fsp--;

             current =iv_ruleInvariants; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInvariants2193); 

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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1103:1: ruleInvariants returns [EObject current=null] : (otherlv_0= 'invariants' ( (lv_instances_1_0= ruleConstraintInstance ) ) (otherlv_2= ',' ( (lv_instances_3_0= ruleConstraintInstance ) ) )* ) ;
    public final EObject ruleInvariants() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_instances_1_0 = null;

        EObject lv_instances_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1106:28: ( (otherlv_0= 'invariants' ( (lv_instances_1_0= ruleConstraintInstance ) ) (otherlv_2= ',' ( (lv_instances_3_0= ruleConstraintInstance ) ) )* ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1107:1: (otherlv_0= 'invariants' ( (lv_instances_1_0= ruleConstraintInstance ) ) (otherlv_2= ',' ( (lv_instances_3_0= ruleConstraintInstance ) ) )* )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1107:1: (otherlv_0= 'invariants' ( (lv_instances_1_0= ruleConstraintInstance ) ) (otherlv_2= ',' ( (lv_instances_3_0= ruleConstraintInstance ) ) )* )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1107:3: otherlv_0= 'invariants' ( (lv_instances_1_0= ruleConstraintInstance ) ) (otherlv_2= ',' ( (lv_instances_3_0= ruleConstraintInstance ) ) )*
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleInvariants2230); 

                	newLeafNode(otherlv_0, grammarAccess.getInvariantsAccess().getInvariantsKeyword_0());
                
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1111:1: ( (lv_instances_1_0= ruleConstraintInstance ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1112:1: (lv_instances_1_0= ruleConstraintInstance )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1112:1: (lv_instances_1_0= ruleConstraintInstance )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1113:3: lv_instances_1_0= ruleConstraintInstance
            {
             
            	        newCompositeNode(grammarAccess.getInvariantsAccess().getInstancesConstraintInstanceParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleConstraintInstance_in_ruleInvariants2251);
            lv_instances_1_0=ruleConstraintInstance();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInvariantsRule());
            	        }
                   		add(
                   			current, 
                   			"instances",
                    		lv_instances_1_0, 
                    		"ConstraintInstance");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1129:2: (otherlv_2= ',' ( (lv_instances_3_0= ruleConstraintInstance ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==23) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1129:4: otherlv_2= ',' ( (lv_instances_3_0= ruleConstraintInstance ) )
            	    {
            	    otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleInvariants2264); 

            	        	newLeafNode(otherlv_2, grammarAccess.getInvariantsAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1133:1: ( (lv_instances_3_0= ruleConstraintInstance ) )
            	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1134:1: (lv_instances_3_0= ruleConstraintInstance )
            	    {
            	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1134:1: (lv_instances_3_0= ruleConstraintInstance )
            	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1135:3: lv_instances_3_0= ruleConstraintInstance
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInvariantsAccess().getInstancesConstraintInstanceParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConstraintInstance_in_ruleInvariants2285);
            	    lv_instances_3_0=ruleConstraintInstance();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInvariantsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"instances",
            	            		lv_instances_3_0, 
            	            		"ConstraintInstance");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1159:1: entryRuleOverriddenTypeMetaInfo returns [EObject current=null] : iv_ruleOverriddenTypeMetaInfo= ruleOverriddenTypeMetaInfo EOF ;
    public final EObject entryRuleOverriddenTypeMetaInfo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOverriddenTypeMetaInfo = null;


        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1160:2: (iv_ruleOverriddenTypeMetaInfo= ruleOverriddenTypeMetaInfo EOF )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1161:2: iv_ruleOverriddenTypeMetaInfo= ruleOverriddenTypeMetaInfo EOF
            {
             newCompositeNode(grammarAccess.getOverriddenTypeMetaInfoRule()); 
            pushFollow(FOLLOW_ruleOverriddenTypeMetaInfo_in_entryRuleOverriddenTypeMetaInfo2323);
            iv_ruleOverriddenTypeMetaInfo=ruleOverriddenTypeMetaInfo();

            state._fsp--;

             current =iv_ruleOverriddenTypeMetaInfo; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOverriddenTypeMetaInfo2333); 

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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1168:1: ruleOverriddenTypeMetaInfo returns [EObject current=null] : (otherlv_0= '{' ( (lv_metaInfo_1_0= ruleTypeMetaInfo ) ) otherlv_2= '}' ) ;
    public final EObject ruleOverriddenTypeMetaInfo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_metaInfo_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1171:28: ( (otherlv_0= '{' ( (lv_metaInfo_1_0= ruleTypeMetaInfo ) ) otherlv_2= '}' ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1172:1: (otherlv_0= '{' ( (lv_metaInfo_1_0= ruleTypeMetaInfo ) ) otherlv_2= '}' )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1172:1: (otherlv_0= '{' ( (lv_metaInfo_1_0= ruleTypeMetaInfo ) ) otherlv_2= '}' )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1172:3: otherlv_0= '{' ( (lv_metaInfo_1_0= ruleTypeMetaInfo ) ) otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleOverriddenTypeMetaInfo2370); 

                	newLeafNode(otherlv_0, grammarAccess.getOverriddenTypeMetaInfoAccess().getLeftCurlyBracketKeyword_0());
                
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1176:1: ( (lv_metaInfo_1_0= ruleTypeMetaInfo ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1177:1: (lv_metaInfo_1_0= ruleTypeMetaInfo )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1177:1: (lv_metaInfo_1_0= ruleTypeMetaInfo )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1178:3: lv_metaInfo_1_0= ruleTypeMetaInfo
            {
             
            	        newCompositeNode(grammarAccess.getOverriddenTypeMetaInfoAccess().getMetaInfoTypeMetaInfoParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeMetaInfo_in_ruleOverriddenTypeMetaInfo2391);
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

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleOverriddenTypeMetaInfo2403); 

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


    // $ANTLR start "entryRuleConstraintInstance"
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1206:1: entryRuleConstraintInstance returns [EObject current=null] : iv_ruleConstraintInstance= ruleConstraintInstance EOF ;
    public final EObject entryRuleConstraintInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraintInstance = null;


        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1207:2: (iv_ruleConstraintInstance= ruleConstraintInstance EOF )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1208:2: iv_ruleConstraintInstance= ruleConstraintInstance EOF
            {
             newCompositeNode(grammarAccess.getConstraintInstanceRule()); 
            pushFollow(FOLLOW_ruleConstraintInstance_in_entryRuleConstraintInstance2439);
            iv_ruleConstraintInstance=ruleConstraintInstance();

            state._fsp--;

             current =iv_ruleConstraintInstance; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraintInstance2449); 

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
    // $ANTLR end "entryRuleConstraintInstance"


    // $ANTLR start "ruleConstraintInstance"
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1215:1: ruleConstraintInstance returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_params_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleLiteral ) ) )* otherlv_5= ')' )? ) ;
    public final EObject ruleConstraintInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_params_2_0 = null;

        EObject lv_params_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1218:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_params_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleLiteral ) ) )* otherlv_5= ')' )? ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1219:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_params_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleLiteral ) ) )* otherlv_5= ')' )? )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1219:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_params_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleLiteral ) ) )* otherlv_5= ')' )? )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1219:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_params_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleLiteral ) ) )* otherlv_5= ')' )?
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1219:2: ( (otherlv_0= RULE_ID ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1220:1: (otherlv_0= RULE_ID )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1220:1: (otherlv_0= RULE_ID )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1221:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getConstraintInstanceRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstraintInstance2494); 

            		newLeafNode(otherlv_0, grammarAccess.getConstraintInstanceAccess().getConstraintConstraintCrossReference_0_0()); 
            	

            }


            }

            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1232:2: (otherlv_1= '(' ( (lv_params_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleLiteral ) ) )* otherlv_5= ')' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==36) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1232:4: otherlv_1= '(' ( (lv_params_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleLiteral ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleConstraintInstance2507); 

                        	newLeafNode(otherlv_1, grammarAccess.getConstraintInstanceAccess().getLeftParenthesisKeyword_1_0());
                        
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1236:1: ( (lv_params_2_0= ruleLiteral ) )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1237:1: (lv_params_2_0= ruleLiteral )
                    {
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1237:1: (lv_params_2_0= ruleLiteral )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1238:3: lv_params_2_0= ruleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getConstraintInstanceAccess().getParamsLiteralParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLiteral_in_ruleConstraintInstance2528);
                    lv_params_2_0=ruleLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConstraintInstanceRule());
                    	        }
                           		add(
                           			current, 
                           			"params",
                            		lv_params_2_0, 
                            		"Literal");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1254:2: (otherlv_3= ',' ( (lv_params_4_0= ruleLiteral ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==23) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1254:4: otherlv_3= ',' ( (lv_params_4_0= ruleLiteral ) )
                    	    {
                    	    otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleConstraintInstance2541); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getConstraintInstanceAccess().getCommaKeyword_1_2_0());
                    	        
                    	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1258:1: ( (lv_params_4_0= ruleLiteral ) )
                    	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1259:1: (lv_params_4_0= ruleLiteral )
                    	    {
                    	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1259:1: (lv_params_4_0= ruleLiteral )
                    	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1260:3: lv_params_4_0= ruleLiteral
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getConstraintInstanceAccess().getParamsLiteralParserRuleCall_1_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleLiteral_in_ruleConstraintInstance2562);
                    	    lv_params_4_0=ruleLiteral();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getConstraintInstanceRule());
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
                    	    break loop31;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleConstraintInstance2576); 

                        	newLeafNode(otherlv_5, grammarAccess.getConstraintInstanceAccess().getRightParenthesisKeyword_1_3());
                        

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
    // $ANTLR end "ruleConstraintInstance"


    // $ANTLR start "entryRuleLiteral"
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1288:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1289:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1290:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral2614);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral2624); 

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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1297:1: ruleLiteral returns [EObject current=null] : (this_NullLiteral_0= ruleNullLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NumberLiteral_2= ruleNumberLiteral | this_StringLiteral_3= ruleStringLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_NullLiteral_0 = null;

        EObject this_BooleanLiteral_1 = null;

        EObject this_NumberLiteral_2 = null;

        EObject this_StringLiteral_3 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1300:28: ( (this_NullLiteral_0= ruleNullLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NumberLiteral_2= ruleNumberLiteral | this_StringLiteral_3= ruleStringLiteral ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1301:1: (this_NullLiteral_0= ruleNullLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NumberLiteral_2= ruleNumberLiteral | this_StringLiteral_3= ruleStringLiteral )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1301:1: (this_NullLiteral_0= ruleNullLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NumberLiteral_2= ruleNumberLiteral | this_StringLiteral_3= ruleStringLiteral )
            int alt33=4;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt33=1;
                }
                break;
            case 38:
            case 39:
                {
                alt33=2;
                }
                break;
            case RULE_HEX:
            case RULE_INT:
            case RULE_DECIMAL:
                {
                alt33=3;
                }
                break;
            case RULE_STRING:
                {
                alt33=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1302:5: this_NullLiteral_0= ruleNullLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getNullLiteralParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleNullLiteral_in_ruleLiteral2671);
                    this_NullLiteral_0=ruleNullLiteral();

                    state._fsp--;

                     
                            current = this_NullLiteral_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1312:5: this_BooleanLiteral_1= ruleBooleanLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_ruleLiteral2698);
                    this_BooleanLiteral_1=ruleBooleanLiteral();

                    state._fsp--;

                     
                            current = this_BooleanLiteral_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1322:5: this_NumberLiteral_2= ruleNumberLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getNumberLiteralParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleNumberLiteral_in_ruleLiteral2725);
                    this_NumberLiteral_2=ruleNumberLiteral();

                    state._fsp--;

                     
                            current = this_NumberLiteral_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1332:5: this_StringLiteral_3= ruleStringLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleLiteral2752);
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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1348:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1349:2: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1350:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
             newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral2787);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;

             current =iv_ruleBooleanLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral2797); 

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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1357:1: ruleBooleanLiteral returns [EObject current=null] : ( () ( ( (lv_value_1_1= 'false' | lv_value_1_2= 'true' ) ) ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_1=null;
        Token lv_value_1_2=null;

         enterRule(); 
            
        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1360:28: ( ( () ( ( (lv_value_1_1= 'false' | lv_value_1_2= 'true' ) ) ) ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1361:1: ( () ( ( (lv_value_1_1= 'false' | lv_value_1_2= 'true' ) ) ) )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1361:1: ( () ( ( (lv_value_1_1= 'false' | lv_value_1_2= 'true' ) ) ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1361:2: () ( ( (lv_value_1_1= 'false' | lv_value_1_2= 'true' ) ) )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1361:2: ()
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1362:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_0(),
                        current);
                

            }

            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1367:2: ( ( (lv_value_1_1= 'false' | lv_value_1_2= 'true' ) ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1368:1: ( (lv_value_1_1= 'false' | lv_value_1_2= 'true' ) )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1368:1: ( (lv_value_1_1= 'false' | lv_value_1_2= 'true' ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1369:1: (lv_value_1_1= 'false' | lv_value_1_2= 'true' )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1369:1: (lv_value_1_1= 'false' | lv_value_1_2= 'true' )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==38) ) {
                alt34=1;
            }
            else if ( (LA34_0==39) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1370:3: lv_value_1_1= 'false'
                    {
                    lv_value_1_1=(Token)match(input,38,FOLLOW_38_in_ruleBooleanLiteral2851); 

                            newLeafNode(lv_value_1_1, grammarAccess.getBooleanLiteralAccess().getValueFalseKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBooleanLiteralRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_1_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1382:8: lv_value_1_2= 'true'
                    {
                    lv_value_1_2=(Token)match(input,39,FOLLOW_39_in_ruleBooleanLiteral2880); 

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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1405:1: entryRuleNullLiteral returns [EObject current=null] : iv_ruleNullLiteral= ruleNullLiteral EOF ;
    public final EObject entryRuleNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullLiteral = null;


        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1406:2: (iv_ruleNullLiteral= ruleNullLiteral EOF )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1407:2: iv_ruleNullLiteral= ruleNullLiteral EOF
            {
             newCompositeNode(grammarAccess.getNullLiteralRule()); 
            pushFollow(FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral2932);
            iv_ruleNullLiteral=ruleNullLiteral();

            state._fsp--;

             current =iv_ruleNullLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullLiteral2942); 

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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1414:1: ruleNullLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= 'null' ) ) ) ;
    public final EObject ruleNullLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1417:28: ( ( () ( (lv_value_1_0= 'null' ) ) ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1418:1: ( () ( (lv_value_1_0= 'null' ) ) )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1418:1: ( () ( (lv_value_1_0= 'null' ) ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1418:2: () ( (lv_value_1_0= 'null' ) )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1418:2: ()
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1419:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getNullLiteralAccess().getNullLiteralAction_0(),
                        current);
                

            }

            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1424:2: ( (lv_value_1_0= 'null' ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1425:1: (lv_value_1_0= 'null' )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1425:1: (lv_value_1_0= 'null' )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1426:3: lv_value_1_0= 'null'
            {
            lv_value_1_0=(Token)match(input,40,FOLLOW_40_in_ruleNullLiteral2994); 

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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1447:1: entryRuleNumberLiteral returns [EObject current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final EObject entryRuleNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteral = null;


        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1448:2: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1449:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
            {
             newCompositeNode(grammarAccess.getNumberLiteralRule()); 
            pushFollow(FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral3043);
            iv_ruleNumberLiteral=ruleNumberLiteral();

            state._fsp--;

             current =iv_ruleNumberLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberLiteral3053); 

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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1456:1: ruleNumberLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleNumber ) ) ) ;
    public final EObject ruleNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1459:28: ( ( () ( (lv_value_1_0= ruleNumber ) ) ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1460:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1460:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1460:2: () ( (lv_value_1_0= ruleNumber ) )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1460:2: ()
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1461:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getNumberLiteralAccess().getNumberLiteralAction_0(),
                        current);
                

            }

            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1466:2: ( (lv_value_1_0= ruleNumber ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1467:1: (lv_value_1_0= ruleNumber )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1467:1: (lv_value_1_0= ruleNumber )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1468:3: lv_value_1_0= ruleNumber
            {
             
            	        newCompositeNode(grammarAccess.getNumberLiteralAccess().getValueNumberParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleNumber_in_ruleNumberLiteral3108);
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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1492:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1493:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1494:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             newCompositeNode(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral3144);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;

             current =iv_ruleStringLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral3154); 

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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1501:1: ruleStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1504:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1505:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1505:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1505:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1505:2: ()
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1506:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStringLiteralAccess().getStringLiteralAction_0(),
                        current);
                

            }

            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1511:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1512:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1512:1: (lv_value_1_0= RULE_STRING )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1513:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral3205); 

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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1537:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1538:2: (iv_ruleFQN= ruleFQN EOF )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1539:2: iv_ruleFQN= ruleFQN EOF
            {
             newCompositeNode(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN3247);
            iv_ruleFQN=ruleFQN();

            state._fsp--;

             current =iv_ruleFQN.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN3258); 

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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1546:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1549:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1550:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1550:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1550:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN3298); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1557:1: (kw= '.' this_ID_2= RULE_ID )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==41) ) {
                    int LA35_2 = input.LA(2);

                    if ( (LA35_2==RULE_ID) ) {
                        alt35=1;
                    }


                }


                switch (alt35) {
            	case 1 :
            	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1558:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,41,FOLLOW_41_in_ruleFQN3317); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN3332); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop35;
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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1578:1: entryRuleFQNWithWildcard returns [String current=null] : iv_ruleFQNWithWildcard= ruleFQNWithWildcard EOF ;
    public final String entryRuleFQNWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQNWithWildcard = null;


        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1579:2: (iv_ruleFQNWithWildcard= ruleFQNWithWildcard EOF )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1580:2: iv_ruleFQNWithWildcard= ruleFQNWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getFQNWithWildcardRule()); 
            pushFollow(FOLLOW_ruleFQNWithWildcard_in_entryRuleFQNWithWildcard3380);
            iv_ruleFQNWithWildcard=ruleFQNWithWildcard();

            state._fsp--;

             current =iv_ruleFQNWithWildcard.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQNWithWildcard3391); 

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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1587:1: ruleFQNWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FQN_0= ruleFQN kw= '.' kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleFQNWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FQN_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1590:28: ( (this_FQN_0= ruleFQN kw= '.' kw= '*' ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1591:1: (this_FQN_0= ruleFQN kw= '.' kw= '*' )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1591:1: (this_FQN_0= ruleFQN kw= '.' kw= '*' )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1592:5: this_FQN_0= ruleFQN kw= '.' kw= '*'
            {
             
                    newCompositeNode(grammarAccess.getFQNWithWildcardAccess().getFQNParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleFQN_in_ruleFQNWithWildcard3438);
            this_FQN_0=ruleFQN();

            state._fsp--;


            		current.merge(this_FQN_0);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,41,FOLLOW_41_in_ruleFQNWithWildcard3456); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getFQNWithWildcardAccess().getFullStopKeyword_1()); 
                
            kw=(Token)match(input,34,FOLLOW_34_in_ruleFQNWithWildcard3469); 

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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1622:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1626:2: (iv_ruleNumber= ruleNumber EOF )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1627:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber3516);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber3527); 

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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1637:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) ;
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
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1641:28: ( (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1642:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1642:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_HEX) ) {
                alt39=1;
            }
            else if ( ((LA39_0>=RULE_INT && LA39_0<=RULE_DECIMAL)) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1642:6: this_HEX_0= RULE_HEX
                    {
                    this_HEX_0=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleNumber3571); 

                    		current.merge(this_HEX_0);
                        
                     
                        newLeafNode(this_HEX_0, grammarAccess.getNumberAccess().getHEXTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1650:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    {
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1650:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1650:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    {
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1650:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL )
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
                            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1650:12: this_INT_1= RULE_INT
                            {
                            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber3599); 

                            		current.merge(this_INT_1);
                                
                             
                                newLeafNode(this_INT_1, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_0_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1658:10: this_DECIMAL_2= RULE_DECIMAL
                            {
                            this_DECIMAL_2=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber3625); 

                            		current.merge(this_DECIMAL_2);
                                
                             
                                newLeafNode(this_DECIMAL_2, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_0_1()); 
                                

                            }
                            break;

                    }

                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1665:2: (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==41) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1666:2: kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            {
                            kw=(Token)match(input,41,FOLLOW_41_in_ruleNumber3645); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getNumberAccess().getFullStopKeyword_1_1_0()); 
                                
                            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1671:1: (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            int alt37=2;
                            int LA37_0 = input.LA(1);

                            if ( (LA37_0==RULE_INT) ) {
                                alt37=1;
                            }
                            else if ( (LA37_0==RULE_DECIMAL) ) {
                                alt37=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 37, 0, input);

                                throw nvae;
                            }
                            switch (alt37) {
                                case 1 :
                                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1671:6: this_INT_4= RULE_INT
                                    {
                                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber3661); 

                                    		current.merge(this_INT_4);
                                        
                                     
                                        newLeafNode(this_INT_4, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1_1_0()); 
                                        

                                    }
                                    break;
                                case 2 :
                                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1679:10: this_DECIMAL_5= RULE_DECIMAL
                                    {
                                    this_DECIMAL_5=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber3687); 

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
        "\1\4\1\51\1\42\1\uffff\1\51\1\uffff";
    static final String DFA5_acceptS =
        "\3\uffff\1\1\1\uffff\1\2";
    static final String DFA5_specialS =
        "\6\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1",
            "\1\3\11\uffff\1\3\1\uffff\2\3\2\uffff\1\3\3\uffff\1\3\1\uffff\1\3\15\uffff\1\2",
            "\1\4\35\uffff\1\5",
            "",
            "\1\3\11\uffff\1\3\1\uffff\2\3\2\uffff\1\3\3\uffff\1\3\1\uffff\1\3\15\uffff\1\2",
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
    public static final BitSet FOLLOW_14_in_ruleNamespace397 = new BitSet(new long[]{0x000000000A268020L});
    public static final BitSet FOLLOW_ruleImport_in_ruleNamespace418 = new BitSet(new long[]{0x000000000A268020L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_ruleNamespace440 = new BitSet(new long[]{0x000000000A248020L});
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
    public static final BitSet FOLLOW_RULE_ID_in_ruleCommand877 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_19_in_ruleCommand895 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleCommand918 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCommand932 = new BitSet(new long[]{0x0000000200108030L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleCommand953 = new BitSet(new long[]{0x0000000200108030L});
    public static final BitSet FOLLOW_20_in_ruleCommand967 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCommand984 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCommand1003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandHandler_in_entryRuleCommandHandler1039 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommandHandler1049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleCommandHandler1091 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleCommandHandler1109 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCommandHandler1126 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleCommandHandler1143 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCommandHandler1163 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_23_in_ruleCommandHandler1176 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCommandHandler1196 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_24_in_ruleCommandHandler1211 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleCommandHandler1234 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleCommandHandler1247 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleCommandHandler1270 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleProjection_in_entryRuleProjection1310 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProjection1320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleProjection1362 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleProjection1380 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProjection1397 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleProjection1415 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleProjection1438 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleProjection1451 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleProjection1474 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleView_in_entryRuleView1514 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleView1524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleView1566 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleView1584 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleView1601 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleView1618 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleView1638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeMetaInfo_in_entryRuleTypeMetaInfo1674 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeMetaInfo1684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleTypeMetaInfo1731 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTypeMetaInfo1748 = new BitSet(new long[]{0x00000001E0000002L});
    public static final BitSet FOLLOW_29_in_ruleTypeMetaInfo1768 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTypeMetaInfo1785 = new BitSet(new long[]{0x00000001C0000002L});
    public static final BitSet FOLLOW_30_in_ruleTypeMetaInfo1805 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTypeMetaInfo1822 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_31_in_ruleTypeMetaInfo1842 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTypeMetaInfo1859 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruleTypeMetaInfo1879 = new BitSet(new long[]{0x000001C0000003C2L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleTypeMetaInfo1900 = new BitSet(new long[]{0x000001C0000003C2L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable1939 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable1949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleVariable1991 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_33_in_ruleVariable2015 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable2049 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_34_in_ruleVariable2067 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable2098 = new BitSet(new long[]{0x0000000800004002L});
    public static final BitSet FOLLOW_ruleInvariants_in_ruleVariable2124 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleOverriddenTypeMetaInfo_in_ruleVariable2146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvariants_in_entryRuleInvariants2183 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInvariants2193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleInvariants2230 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleConstraintInstance_in_ruleInvariants2251 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleInvariants2264 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleConstraintInstance_in_ruleInvariants2285 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleOverriddenTypeMetaInfo_in_entryRuleOverriddenTypeMetaInfo2323 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOverriddenTypeMetaInfo2333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleOverriddenTypeMetaInfo2370 = new BitSet(new long[]{0x00000001F0008000L});
    public static final BitSet FOLLOW_ruleTypeMetaInfo_in_ruleOverriddenTypeMetaInfo2391 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleOverriddenTypeMetaInfo2403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraintInstance_in_entryRuleConstraintInstance2439 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraintInstance2449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstraintInstance2494 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_ruleConstraintInstance2507 = new BitSet(new long[]{0x000001C0000003C0L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleConstraintInstance2528 = new BitSet(new long[]{0x0000002000800000L});
    public static final BitSet FOLLOW_23_in_ruleConstraintInstance2541 = new BitSet(new long[]{0x000001C0000003C0L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleConstraintInstance2562 = new BitSet(new long[]{0x0000002000800000L});
    public static final BitSet FOLLOW_37_in_ruleConstraintInstance2576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral2614 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral2624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_ruleLiteral2671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleLiteral2698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_ruleLiteral2725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleLiteral2752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral2787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral2797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleBooleanLiteral2851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleBooleanLiteral2880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral2932 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullLiteral2942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleNullLiteral2994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral3043 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberLiteral3053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleNumberLiteral3108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral3144 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral3154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral3205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN3247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN3258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN3298 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_ruleFQN3317 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN3332 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ruleFQNWithWildcard_in_entryRuleFQNWithWildcard3380 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQNWithWildcard3391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleFQNWithWildcard3438 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleFQNWithWildcard3456 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleFQNWithWildcard3469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber3516 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber3527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleNumber3571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber3599 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber3625 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_ruleNumber3645 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber3661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber3687 = new BitSet(new long[]{0x0000000000000002L});

}