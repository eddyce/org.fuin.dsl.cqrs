package org.fuin.dsl.cqrs.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_DOC", "RULE_STRING", "RULE_HEX", "RULE_DECIMAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'context'", "'{'", "'}'", "'namespace'", "'import'", "'command'", "'target'", "'sla'", "'message'", "'command-handler'", "'handles'", "','", "'uses'", "'projection'", "'input'", "'view'", "'slabel'", "'label'", "'tooltip'", "'prompt'", "'examples'", "'nullable'", "'*'", "'invariants'", "'('", "')'", "'false'", "'true'", "'null'", "'.'", "'millis'", "'seconds'", "'minutes'", "'hours'", "'days'"
    };
    public static final int RULE_ID=4;
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
    public static final int RULE_DOC=6;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int RULE_HEX=8;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_DECIMAL=9;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_SL_COMMENT=11;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=7;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=12;

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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:68:1: entryRuleDomainModel returns [EObject current=null] : iv_ruleDomainModel= ruleDomainModel EOF ;
    public final EObject entryRuleDomainModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainModel = null;


        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:69:2: (iv_ruleDomainModel= ruleDomainModel EOF )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:70:2: iv_ruleDomainModel= ruleDomainModel EOF
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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:77:1: ruleDomainModel returns [EObject current=null] : ( (lv_contexts_0_0= ruleContext ) )* ;
    public final EObject ruleDomainModel() throws RecognitionException {
        EObject current = null;

        EObject lv_contexts_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:80:28: ( ( (lv_contexts_0_0= ruleContext ) )* )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:81:1: ( (lv_contexts_0_0= ruleContext ) )*
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:81:1: ( (lv_contexts_0_0= ruleContext ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:82:1: (lv_contexts_0_0= ruleContext )
            	    {
            	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:82:1: (lv_contexts_0_0= ruleContext )
            	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:83:3: lv_contexts_0_0= ruleContext
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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:107:1: entryRuleContext returns [EObject current=null] : iv_ruleContext= ruleContext EOF ;
    public final EObject entryRuleContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContext = null;


        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:108:2: (iv_ruleContext= ruleContext EOF )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:109:2: iv_ruleContext= ruleContext EOF
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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:116:1: ruleContext returns [EObject current=null] : (otherlv_0= 'context' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_namespaces_3_0= ruleNamespace ) )* otherlv_4= '}' ) ;
    public final EObject ruleContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_namespaces_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:119:28: ( (otherlv_0= 'context' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_namespaces_3_0= ruleNamespace ) )* otherlv_4= '}' ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:120:1: (otherlv_0= 'context' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_namespaces_3_0= ruleNamespace ) )* otherlv_4= '}' )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:120:1: (otherlv_0= 'context' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_namespaces_3_0= ruleNamespace ) )* otherlv_4= '}' )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:120:3: otherlv_0= 'context' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_namespaces_3_0= ruleNamespace ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleContext213); 

                	newLeafNode(otherlv_0, grammarAccess.getContextAccess().getContextKeyword_0());
                
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:124:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:125:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:125:1: (lv_name_1_0= RULE_ID )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:126:3: lv_name_1_0= RULE_ID
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
                
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:146:1: ( (lv_namespaces_3_0= ruleNamespace ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:147:1: (lv_namespaces_3_0= ruleNamespace )
            	    {
            	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:147:1: (lv_namespaces_3_0= ruleNamespace )
            	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:148:3: lv_namespaces_3_0= ruleNamespace
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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:176:1: entryRuleNamespace returns [EObject current=null] : iv_ruleNamespace= ruleNamespace EOF ;
    public final EObject entryRuleNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamespace = null;


        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:177:2: (iv_ruleNamespace= ruleNamespace EOF )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:178:2: iv_ruleNamespace= ruleNamespace EOF
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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:185:1: ruleNamespace returns [EObject current=null] : (otherlv_0= 'namespace' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* ( (lv_elements_4_0= ruleAbstractElement ) )* otherlv_5= '}' ) ;
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
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:188:28: ( (otherlv_0= 'namespace' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* ( (lv_elements_4_0= ruleAbstractElement ) )* otherlv_5= '}' ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:189:1: (otherlv_0= 'namespace' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* ( (lv_elements_4_0= ruleAbstractElement ) )* otherlv_5= '}' )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:189:1: (otherlv_0= 'namespace' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* ( (lv_elements_4_0= ruleAbstractElement ) )* otherlv_5= '}' )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:189:3: otherlv_0= 'namespace' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* ( (lv_elements_4_0= ruleAbstractElement ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleNamespace364); 

                	newLeafNode(otherlv_0, grammarAccess.getNamespaceAccess().getNamespaceKeyword_0());
                
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:193:1: ( (lv_name_1_0= ruleFQN ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:194:1: (lv_name_1_0= ruleFQN )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:194:1: (lv_name_1_0= ruleFQN )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:195:3: lv_name_1_0= ruleFQN
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
                
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:215:1: ( (lv_imports_3_0= ruleImport ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:216:1: (lv_imports_3_0= ruleImport )
            	    {
            	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:216:1: (lv_imports_3_0= ruleImport )
            	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:217:3: lv_imports_3_0= ruleImport
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

            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:233:3: ( (lv_elements_4_0= ruleAbstractElement ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_DOC||LA4_0==18||LA4_0==22||LA4_0==26||LA4_0==28) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:234:1: (lv_elements_4_0= ruleAbstractElement )
            	    {
            	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:234:1: (lv_elements_4_0= ruleAbstractElement )
            	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:235:3: lv_elements_4_0= ruleAbstractElement
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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:263:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:264:2: (iv_ruleImport= ruleImport EOF )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:265:2: iv_ruleImport= ruleImport EOF
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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:272:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( ( (lv_importedNamespace_1_1= ruleFQN | lv_importedNamespace_1_2= ruleFQNWithWildcard ) ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_1 = null;

        AntlrDatatypeRuleToken lv_importedNamespace_1_2 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:275:28: ( (otherlv_0= 'import' ( ( (lv_importedNamespace_1_1= ruleFQN | lv_importedNamespace_1_2= ruleFQNWithWildcard ) ) ) ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:276:1: (otherlv_0= 'import' ( ( (lv_importedNamespace_1_1= ruleFQN | lv_importedNamespace_1_2= ruleFQNWithWildcard ) ) ) )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:276:1: (otherlv_0= 'import' ( ( (lv_importedNamespace_1_1= ruleFQN | lv_importedNamespace_1_2= ruleFQNWithWildcard ) ) ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:276:3: otherlv_0= 'import' ( ( (lv_importedNamespace_1_1= ruleFQN | lv_importedNamespace_1_2= ruleFQNWithWildcard ) ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleImport536); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:280:1: ( ( (lv_importedNamespace_1_1= ruleFQN | lv_importedNamespace_1_2= ruleFQNWithWildcard ) ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:281:1: ( (lv_importedNamespace_1_1= ruleFQN | lv_importedNamespace_1_2= ruleFQNWithWildcard ) )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:281:1: ( (lv_importedNamespace_1_1= ruleFQN | lv_importedNamespace_1_2= ruleFQNWithWildcard ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:282:1: (lv_importedNamespace_1_1= ruleFQN | lv_importedNamespace_1_2= ruleFQNWithWildcard )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:282:1: (lv_importedNamespace_1_1= ruleFQN | lv_importedNamespace_1_2= ruleFQNWithWildcard )
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:283:3: lv_importedNamespace_1_1= ruleFQN
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
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:298:8: lv_importedNamespace_1_2= ruleFQNWithWildcard
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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:324:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:325:2: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:326:2: iv_ruleAbstractElement= ruleAbstractElement EOF
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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:333:1: ruleAbstractElement returns [EObject current=null] : (this_Command_0= ruleCommand | this_CommandHandler_1= ruleCommandHandler | this_Projection_2= ruleProjection | this_View_3= ruleView ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_Command_0 = null;

        EObject this_CommandHandler_1 = null;

        EObject this_Projection_2 = null;

        EObject this_View_3 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:336:28: ( (this_Command_0= ruleCommand | this_CommandHandler_1= ruleCommandHandler | this_Projection_2= ruleProjection | this_View_3= ruleView ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:337:1: (this_Command_0= ruleCommand | this_CommandHandler_1= ruleCommandHandler | this_Projection_2= ruleProjection | this_View_3= ruleView )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:337:1: (this_Command_0= ruleCommand | this_CommandHandler_1= ruleCommandHandler | this_Projection_2= ruleProjection | this_View_3= ruleView )
            int alt6=4;
            switch ( input.LA(1) ) {
            case RULE_DOC:
                {
                switch ( input.LA(2) ) {
                case 18:
                    {
                    alt6=1;
                    }
                    break;
                case 26:
                    {
                    alt6=3;
                    }
                    break;
                case 28:
                    {
                    alt6=4;
                    }
                    break;
                case 22:
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
            case 22:
                {
                alt6=2;
                }
                break;
            case 26:
                {
                alt6=3;
                }
                break;
            case 28:
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
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:338:5: this_Command_0= ruleCommand
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
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:348:5: this_CommandHandler_1= ruleCommandHandler
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
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:358:5: this_Projection_2= ruleProjection
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
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:368:5: this_View_3= ruleView
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


    // $ANTLR start "entryRuleDuration"
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:384:1: entryRuleDuration returns [EObject current=null] : iv_ruleDuration= ruleDuration EOF ;
    public final EObject entryRuleDuration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDuration = null;


        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:385:2: (iv_ruleDuration= ruleDuration EOF )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:386:2: iv_ruleDuration= ruleDuration EOF
            {
             newCompositeNode(grammarAccess.getDurationRule()); 
            pushFollow(FOLLOW_ruleDuration_in_entryRuleDuration790);
            iv_ruleDuration=ruleDuration();

            state._fsp--;

             current =iv_ruleDuration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDuration800); 

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
    // $ANTLR end "entryRuleDuration"


    // $ANTLR start "ruleDuration"
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:393:1: ruleDuration returns [EObject current=null] : ( ( (lv_time_0_0= RULE_INT ) ) ( (lv_unit_1_0= ruleTimeUnit ) ) ) ;
    public final EObject ruleDuration() throws RecognitionException {
        EObject current = null;

        Token lv_time_0_0=null;
        Enumerator lv_unit_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:396:28: ( ( ( (lv_time_0_0= RULE_INT ) ) ( (lv_unit_1_0= ruleTimeUnit ) ) ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:397:1: ( ( (lv_time_0_0= RULE_INT ) ) ( (lv_unit_1_0= ruleTimeUnit ) ) )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:397:1: ( ( (lv_time_0_0= RULE_INT ) ) ( (lv_unit_1_0= ruleTimeUnit ) ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:397:2: ( (lv_time_0_0= RULE_INT ) ) ( (lv_unit_1_0= ruleTimeUnit ) )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:397:2: ( (lv_time_0_0= RULE_INT ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:398:1: (lv_time_0_0= RULE_INT )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:398:1: (lv_time_0_0= RULE_INT )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:399:3: lv_time_0_0= RULE_INT
            {
            lv_time_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDuration842); 

            			newLeafNode(lv_time_0_0, grammarAccess.getDurationAccess().getTimeINTTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDurationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"time",
                    		lv_time_0_0, 
                    		"INT");
            	    

            }


            }

            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:415:2: ( (lv_unit_1_0= ruleTimeUnit ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:416:1: (lv_unit_1_0= ruleTimeUnit )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:416:1: (lv_unit_1_0= ruleTimeUnit )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:417:3: lv_unit_1_0= ruleTimeUnit
            {
             
            	        newCompositeNode(grammarAccess.getDurationAccess().getUnitTimeUnitEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTimeUnit_in_ruleDuration868);
            lv_unit_1_0=ruleTimeUnit();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDurationRule());
            	        }
                   		set(
                   			current, 
                   			"unit",
                    		lv_unit_1_0, 
                    		"TimeUnit");
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
    // $ANTLR end "ruleDuration"


    // $ANTLR start "entryRuleCommand"
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:441:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:442:2: (iv_ruleCommand= ruleCommand EOF )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:443:2: iv_ruleCommand= ruleCommand EOF
            {
             newCompositeNode(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_ruleCommand_in_entryRuleCommand904);
            iv_ruleCommand=ruleCommand();

            state._fsp--;

             current =iv_ruleCommand; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommand914); 

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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:450:1: ruleCommand returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'command' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'target' ( ( ruleFQN ) ) )? (otherlv_5= 'sla' ( (lv_acceptable_6_0= ruleDuration ) ) )? otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* (otherlv_9= 'message' ( (lv_message_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        Token lv_doc_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token lv_message_10_0=null;
        Token otherlv_11=null;
        EObject lv_acceptable_6_0 = null;

        EObject lv_attributes_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:453:28: ( ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'command' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'target' ( ( ruleFQN ) ) )? (otherlv_5= 'sla' ( (lv_acceptable_6_0= ruleDuration ) ) )? otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* (otherlv_9= 'message' ( (lv_message_10_0= RULE_STRING ) ) )? otherlv_11= '}' ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:454:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'command' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'target' ( ( ruleFQN ) ) )? (otherlv_5= 'sla' ( (lv_acceptable_6_0= ruleDuration ) ) )? otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* (otherlv_9= 'message' ( (lv_message_10_0= RULE_STRING ) ) )? otherlv_11= '}' )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:454:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'command' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'target' ( ( ruleFQN ) ) )? (otherlv_5= 'sla' ( (lv_acceptable_6_0= ruleDuration ) ) )? otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* (otherlv_9= 'message' ( (lv_message_10_0= RULE_STRING ) ) )? otherlv_11= '}' )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:454:2: ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'command' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'target' ( ( ruleFQN ) ) )? (otherlv_5= 'sla' ( (lv_acceptable_6_0= ruleDuration ) ) )? otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* (otherlv_9= 'message' ( (lv_message_10_0= RULE_STRING ) ) )? otherlv_11= '}'
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:454:2: ( (lv_doc_0_0= RULE_DOC ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_DOC) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:455:1: (lv_doc_0_0= RULE_DOC )
                    {
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:455:1: (lv_doc_0_0= RULE_DOC )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:456:3: lv_doc_0_0= RULE_DOC
                    {
                    lv_doc_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleCommand956); 

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

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleCommand974); 

                	newLeafNode(otherlv_1, grammarAccess.getCommandAccess().getCommandKeyword_1());
                
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:476:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:477:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:477:1: (lv_name_2_0= RULE_ID )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:478:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCommand991); 

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

            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:494:2: (otherlv_3= 'target' ( ( ruleFQN ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:494:4: otherlv_3= 'target' ( ( ruleFQN ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleCommand1009); 

                        	newLeafNode(otherlv_3, grammarAccess.getCommandAccess().getTargetKeyword_3_0());
                        
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:498:1: ( ( ruleFQN ) )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:499:1: ( ruleFQN )
                    {
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:499:1: ( ruleFQN )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:500:3: ruleFQN
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getCommandRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getCommandAccess().getTargetAbstractMethodCrossReference_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleCommand1032);
                    ruleFQN();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:513:4: (otherlv_5= 'sla' ( (lv_acceptable_6_0= ruleDuration ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:513:6: otherlv_5= 'sla' ( (lv_acceptable_6_0= ruleDuration ) )
                    {
                    otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleCommand1047); 

                        	newLeafNode(otherlv_5, grammarAccess.getCommandAccess().getSlaKeyword_4_0());
                        
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:517:1: ( (lv_acceptable_6_0= ruleDuration ) )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:518:1: (lv_acceptable_6_0= ruleDuration )
                    {
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:518:1: (lv_acceptable_6_0= ruleDuration )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:519:3: lv_acceptable_6_0= ruleDuration
                    {
                     
                    	        newCompositeNode(grammarAccess.getCommandAccess().getAcceptableDurationParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDuration_in_ruleCommand1068);
                    lv_acceptable_6_0=ruleDuration();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCommandRule());
                    	        }
                           		set(
                           			current, 
                           			"acceptable",
                            		lv_acceptable_6_0, 
                            		"Duration");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleCommand1082); 

                	newLeafNode(otherlv_7, grammarAccess.getCommandAccess().getLeftCurlyBracketKeyword_5());
                
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:539:1: ( (lv_attributes_8_0= ruleAttribute ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||LA10_0==RULE_DOC||LA10_0==34) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:540:1: (lv_attributes_8_0= ruleAttribute )
            	    {
            	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:540:1: (lv_attributes_8_0= ruleAttribute )
            	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:541:3: lv_attributes_8_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCommandAccess().getAttributesAttributeParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleCommand1103);
            	    lv_attributes_8_0=ruleAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCommandRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attributes",
            	            		lv_attributes_8_0, 
            	            		"Attribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:557:3: (otherlv_9= 'message' ( (lv_message_10_0= RULE_STRING ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:557:5: otherlv_9= 'message' ( (lv_message_10_0= RULE_STRING ) )
                    {
                    otherlv_9=(Token)match(input,21,FOLLOW_21_in_ruleCommand1117); 

                        	newLeafNode(otherlv_9, grammarAccess.getCommandAccess().getMessageKeyword_7_0());
                        
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:561:1: ( (lv_message_10_0= RULE_STRING ) )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:562:1: (lv_message_10_0= RULE_STRING )
                    {
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:562:1: (lv_message_10_0= RULE_STRING )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:563:3: lv_message_10_0= RULE_STRING
                    {
                    lv_message_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCommand1134); 

                    			newLeafNode(lv_message_10_0, grammarAccess.getCommandAccess().getMessageSTRINGTerminalRuleCall_7_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCommandRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"message",
                            		lv_message_10_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,15,FOLLOW_15_in_ruleCommand1153); 

                	newLeafNode(otherlv_11, grammarAccess.getCommandAccess().getRightCurlyBracketKeyword_8());
                

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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:591:1: entryRuleCommandHandler returns [EObject current=null] : iv_ruleCommandHandler= ruleCommandHandler EOF ;
    public final EObject entryRuleCommandHandler() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommandHandler = null;


        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:592:2: (iv_ruleCommandHandler= ruleCommandHandler EOF )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:593:2: iv_ruleCommandHandler= ruleCommandHandler EOF
            {
             newCompositeNode(grammarAccess.getCommandHandlerRule()); 
            pushFollow(FOLLOW_ruleCommandHandler_in_entryRuleCommandHandler1189);
            iv_ruleCommandHandler=ruleCommandHandler();

            state._fsp--;

             current =iv_ruleCommandHandler; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommandHandler1199); 

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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:600:1: ruleCommandHandler returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'command-handler' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'handles' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'uses' ( ( ruleFQN ) ) (otherlv_9= ',' ( ( ruleFQN ) ) )* )? ) ;
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
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:603:28: ( ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'command-handler' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'handles' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'uses' ( ( ruleFQN ) ) (otherlv_9= ',' ( ( ruleFQN ) ) )* )? ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:604:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'command-handler' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'handles' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'uses' ( ( ruleFQN ) ) (otherlv_9= ',' ( ( ruleFQN ) ) )* )? )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:604:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'command-handler' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'handles' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'uses' ( ( ruleFQN ) ) (otherlv_9= ',' ( ( ruleFQN ) ) )* )? )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:604:2: ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'command-handler' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'handles' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'uses' ( ( ruleFQN ) ) (otherlv_9= ',' ( ( ruleFQN ) ) )* )?
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:604:2: ( (lv_doc_0_0= RULE_DOC ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_DOC) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:605:1: (lv_doc_0_0= RULE_DOC )
                    {
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:605:1: (lv_doc_0_0= RULE_DOC )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:606:3: lv_doc_0_0= RULE_DOC
                    {
                    lv_doc_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleCommandHandler1241); 

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

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleCommandHandler1259); 

                	newLeafNode(otherlv_1, grammarAccess.getCommandHandlerAccess().getCommandHandlerKeyword_1());
                
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:626:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:627:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:627:1: (lv_name_2_0= RULE_ID )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:628:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCommandHandler1276); 

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

            otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleCommandHandler1293); 

                	newLeafNode(otherlv_3, grammarAccess.getCommandHandlerAccess().getHandlesKeyword_3());
                
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:648:1: ( (otherlv_4= RULE_ID ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:649:1: (otherlv_4= RULE_ID )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:649:1: (otherlv_4= RULE_ID )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:650:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getCommandHandlerRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCommandHandler1313); 

            		newLeafNode(otherlv_4, grammarAccess.getCommandHandlerAccess().getCommandsCommandCrossReference_4_0()); 
            	

            }


            }

            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:661:2: (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==24) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:661:4: otherlv_5= ',' ( (otherlv_6= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,24,FOLLOW_24_in_ruleCommandHandler1326); 

            	        	newLeafNode(otherlv_5, grammarAccess.getCommandHandlerAccess().getCommaKeyword_5_0());
            	        
            	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:665:1: ( (otherlv_6= RULE_ID ) )
            	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:666:1: (otherlv_6= RULE_ID )
            	    {
            	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:666:1: (otherlv_6= RULE_ID )
            	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:667:3: otherlv_6= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getCommandHandlerRule());
            	    	        }
            	            
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCommandHandler1346); 

            	    		newLeafNode(otherlv_6, grammarAccess.getCommandHandlerAccess().getCommandsCommandCrossReference_5_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:678:4: (otherlv_7= 'uses' ( ( ruleFQN ) ) (otherlv_9= ',' ( ( ruleFQN ) ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:678:6: otherlv_7= 'uses' ( ( ruleFQN ) ) (otherlv_9= ',' ( ( ruleFQN ) ) )*
                    {
                    otherlv_7=(Token)match(input,25,FOLLOW_25_in_ruleCommandHandler1361); 

                        	newLeafNode(otherlv_7, grammarAccess.getCommandHandlerAccess().getUsesKeyword_6_0());
                        
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:682:1: ( ( ruleFQN ) )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:683:1: ( ruleFQN )
                    {
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:683:1: ( ruleFQN )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:684:3: ruleFQN
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getCommandHandlerRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getCommandHandlerAccess().getAggregatesAggregateCrossReference_6_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleCommandHandler1384);
                    ruleFQN();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:697:2: (otherlv_9= ',' ( ( ruleFQN ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==24) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:697:4: otherlv_9= ',' ( ( ruleFQN ) )
                    	    {
                    	    otherlv_9=(Token)match(input,24,FOLLOW_24_in_ruleCommandHandler1397); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getCommandHandlerAccess().getCommaKeyword_6_2_0());
                    	        
                    	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:701:1: ( ( ruleFQN ) )
                    	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:702:1: ( ruleFQN )
                    	    {
                    	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:702:1: ( ruleFQN )
                    	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:703:3: ruleFQN
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getCommandHandlerRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getCommandHandlerAccess().getAggregatesAggregateCrossReference_6_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleFQN_in_ruleCommandHandler1420);
                    	    ruleFQN();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:724:1: entryRuleProjection returns [EObject current=null] : iv_ruleProjection= ruleProjection EOF ;
    public final EObject entryRuleProjection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProjection = null;


        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:725:2: (iv_ruleProjection= ruleProjection EOF )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:726:2: iv_ruleProjection= ruleProjection EOF
            {
             newCompositeNode(grammarAccess.getProjectionRule()); 
            pushFollow(FOLLOW_ruleProjection_in_entryRuleProjection1460);
            iv_ruleProjection=ruleProjection();

            state._fsp--;

             current =iv_ruleProjection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProjection1470); 

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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:733:1: ruleProjection returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'projection' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'input' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )* )? ) ;
    public final EObject ruleProjection() throws RecognitionException {
        EObject current = null;

        Token lv_doc_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:736:28: ( ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'projection' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'input' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )* )? ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:737:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'projection' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'input' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )* )? )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:737:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'projection' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'input' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )* )? )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:737:2: ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'projection' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'input' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )* )?
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:737:2: ( (lv_doc_0_0= RULE_DOC ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_DOC) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:738:1: (lv_doc_0_0= RULE_DOC )
                    {
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:738:1: (lv_doc_0_0= RULE_DOC )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:739:3: lv_doc_0_0= RULE_DOC
                    {
                    lv_doc_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleProjection1512); 

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

            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleProjection1530); 

                	newLeafNode(otherlv_1, grammarAccess.getProjectionAccess().getProjectionKeyword_1());
                
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:759:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:760:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:760:1: (lv_name_2_0= RULE_ID )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:761:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProjection1547); 

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

            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:777:2: (otherlv_3= 'input' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==27) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:777:4: otherlv_3= 'input' ( ( ruleFQN ) ) (otherlv_5= ',' ( ( ruleFQN ) ) )*
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleProjection1565); 

                        	newLeafNode(otherlv_3, grammarAccess.getProjectionAccess().getInputKeyword_3_0());
                        
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:781:1: ( ( ruleFQN ) )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:782:1: ( ruleFQN )
                    {
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:782:1: ( ruleFQN )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:783:3: ruleFQN
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getProjectionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getProjectionAccess().getEventsEventCrossReference_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleProjection1588);
                    ruleFQN();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:796:2: (otherlv_5= ',' ( ( ruleFQN ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==24) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:796:4: otherlv_5= ',' ( ( ruleFQN ) )
                    	    {
                    	    otherlv_5=(Token)match(input,24,FOLLOW_24_in_ruleProjection1601); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getProjectionAccess().getCommaKeyword_3_2_0());
                    	        
                    	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:800:1: ( ( ruleFQN ) )
                    	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:801:1: ( ruleFQN )
                    	    {
                    	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:801:1: ( ruleFQN )
                    	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:802:3: ruleFQN
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getProjectionRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getProjectionAccess().getEventsEventCrossReference_3_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleFQN_in_ruleProjection1624);
                    	    ruleFQN();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:823:1: entryRuleView returns [EObject current=null] : iv_ruleView= ruleView EOF ;
    public final EObject entryRuleView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleView = null;


        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:824:2: (iv_ruleView= ruleView EOF )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:825:2: iv_ruleView= ruleView EOF
            {
             newCompositeNode(grammarAccess.getViewRule()); 
            pushFollow(FOLLOW_ruleView_in_entryRuleView1664);
            iv_ruleView=ruleView();

            state._fsp--;

             current =iv_ruleView; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleView1674); 

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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:832:1: ruleView returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'view' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'uses' ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleView() throws RecognitionException {
        EObject current = null;

        Token lv_doc_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:835:28: ( ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'view' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'uses' ( (otherlv_4= RULE_ID ) ) ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:836:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'view' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'uses' ( (otherlv_4= RULE_ID ) ) )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:836:1: ( ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'view' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'uses' ( (otherlv_4= RULE_ID ) ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:836:2: ( (lv_doc_0_0= RULE_DOC ) )? otherlv_1= 'view' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'uses' ( (otherlv_4= RULE_ID ) )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:836:2: ( (lv_doc_0_0= RULE_DOC ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_DOC) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:837:1: (lv_doc_0_0= RULE_DOC )
                    {
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:837:1: (lv_doc_0_0= RULE_DOC )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:838:3: lv_doc_0_0= RULE_DOC
                    {
                    lv_doc_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleView1716); 

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

            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleView1734); 

                	newLeafNode(otherlv_1, grammarAccess.getViewAccess().getViewKeyword_1());
                
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:858:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:859:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:859:1: (lv_name_2_0= RULE_ID )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:860:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleView1751); 

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

            otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleView1768); 

                	newLeafNode(otherlv_3, grammarAccess.getViewAccess().getUsesKeyword_3());
                
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:880:1: ( (otherlv_4= RULE_ID ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:881:1: (otherlv_4= RULE_ID )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:881:1: (otherlv_4= RULE_ID )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:882:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getViewRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleView1788); 

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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:901:1: entryRuleTypeMetaInfo returns [EObject current=null] : iv_ruleTypeMetaInfo= ruleTypeMetaInfo EOF ;
    public final EObject entryRuleTypeMetaInfo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeMetaInfo = null;


        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:902:2: (iv_ruleTypeMetaInfo= ruleTypeMetaInfo EOF )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:903:2: iv_ruleTypeMetaInfo= ruleTypeMetaInfo EOF
            {
             newCompositeNode(grammarAccess.getTypeMetaInfoRule()); 
            pushFollow(FOLLOW_ruleTypeMetaInfo_in_entryRuleTypeMetaInfo1824);
            iv_ruleTypeMetaInfo=ruleTypeMetaInfo();

            state._fsp--;

             current =iv_ruleTypeMetaInfo; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeMetaInfo1834); 

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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:910:1: ruleTypeMetaInfo returns [EObject current=null] : ( () (otherlv_1= 'slabel' ( (lv_slabel_2_0= RULE_STRING ) ) )? (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )? (otherlv_5= 'tooltip' ( (lv_tooltip_6_0= RULE_STRING ) ) )? (otherlv_7= 'prompt' ( (lv_prompt_8_0= RULE_STRING ) ) )? (otherlv_9= 'examples' ( (lv_examples_10_0= ruleLiteral ) )* )? ) ;
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
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:913:28: ( ( () (otherlv_1= 'slabel' ( (lv_slabel_2_0= RULE_STRING ) ) )? (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )? (otherlv_5= 'tooltip' ( (lv_tooltip_6_0= RULE_STRING ) ) )? (otherlv_7= 'prompt' ( (lv_prompt_8_0= RULE_STRING ) ) )? (otherlv_9= 'examples' ( (lv_examples_10_0= ruleLiteral ) )* )? ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:914:1: ( () (otherlv_1= 'slabel' ( (lv_slabel_2_0= RULE_STRING ) ) )? (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )? (otherlv_5= 'tooltip' ( (lv_tooltip_6_0= RULE_STRING ) ) )? (otherlv_7= 'prompt' ( (lv_prompt_8_0= RULE_STRING ) ) )? (otherlv_9= 'examples' ( (lv_examples_10_0= ruleLiteral ) )* )? )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:914:1: ( () (otherlv_1= 'slabel' ( (lv_slabel_2_0= RULE_STRING ) ) )? (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )? (otherlv_5= 'tooltip' ( (lv_tooltip_6_0= RULE_STRING ) ) )? (otherlv_7= 'prompt' ( (lv_prompt_8_0= RULE_STRING ) ) )? (otherlv_9= 'examples' ( (lv_examples_10_0= ruleLiteral ) )* )? )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:914:2: () (otherlv_1= 'slabel' ( (lv_slabel_2_0= RULE_STRING ) ) )? (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )? (otherlv_5= 'tooltip' ( (lv_tooltip_6_0= RULE_STRING ) ) )? (otherlv_7= 'prompt' ( (lv_prompt_8_0= RULE_STRING ) ) )? (otherlv_9= 'examples' ( (lv_examples_10_0= ruleLiteral ) )* )?
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:914:2: ()
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:915:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTypeMetaInfoAccess().getTypeMetaInfoAction_0(),
                        current);
                

            }

            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:920:2: (otherlv_1= 'slabel' ( (lv_slabel_2_0= RULE_STRING ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==29) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:920:4: otherlv_1= 'slabel' ( (lv_slabel_2_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleTypeMetaInfo1881); 

                        	newLeafNode(otherlv_1, grammarAccess.getTypeMetaInfoAccess().getSlabelKeyword_1_0());
                        
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:924:1: ( (lv_slabel_2_0= RULE_STRING ) )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:925:1: (lv_slabel_2_0= RULE_STRING )
                    {
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:925:1: (lv_slabel_2_0= RULE_STRING )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:926:3: lv_slabel_2_0= RULE_STRING
                    {
                    lv_slabel_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTypeMetaInfo1898); 

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

            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:942:4: (otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==30) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:942:6: otherlv_3= 'label' ( (lv_label_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleTypeMetaInfo1918); 

                        	newLeafNode(otherlv_3, grammarAccess.getTypeMetaInfoAccess().getLabelKeyword_2_0());
                        
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:946:1: ( (lv_label_4_0= RULE_STRING ) )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:947:1: (lv_label_4_0= RULE_STRING )
                    {
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:947:1: (lv_label_4_0= RULE_STRING )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:948:3: lv_label_4_0= RULE_STRING
                    {
                    lv_label_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTypeMetaInfo1935); 

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

            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:964:4: (otherlv_5= 'tooltip' ( (lv_tooltip_6_0= RULE_STRING ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==31) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:964:6: otherlv_5= 'tooltip' ( (lv_tooltip_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,31,FOLLOW_31_in_ruleTypeMetaInfo1955); 

                        	newLeafNode(otherlv_5, grammarAccess.getTypeMetaInfoAccess().getTooltipKeyword_3_0());
                        
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:968:1: ( (lv_tooltip_6_0= RULE_STRING ) )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:969:1: (lv_tooltip_6_0= RULE_STRING )
                    {
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:969:1: (lv_tooltip_6_0= RULE_STRING )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:970:3: lv_tooltip_6_0= RULE_STRING
                    {
                    lv_tooltip_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTypeMetaInfo1972); 

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

            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:986:4: (otherlv_7= 'prompt' ( (lv_prompt_8_0= RULE_STRING ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==32) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:986:6: otherlv_7= 'prompt' ( (lv_prompt_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,32,FOLLOW_32_in_ruleTypeMetaInfo1992); 

                        	newLeafNode(otherlv_7, grammarAccess.getTypeMetaInfoAccess().getPromptKeyword_4_0());
                        
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:990:1: ( (lv_prompt_8_0= RULE_STRING ) )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:991:1: (lv_prompt_8_0= RULE_STRING )
                    {
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:991:1: (lv_prompt_8_0= RULE_STRING )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:992:3: lv_prompt_8_0= RULE_STRING
                    {
                    lv_prompt_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTypeMetaInfo2009); 

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

            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1008:4: (otherlv_9= 'examples' ( (lv_examples_10_0= ruleLiteral ) )* )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==33) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1008:6: otherlv_9= 'examples' ( (lv_examples_10_0= ruleLiteral ) )*
                    {
                    otherlv_9=(Token)match(input,33,FOLLOW_33_in_ruleTypeMetaInfo2029); 

                        	newLeafNode(otherlv_9, grammarAccess.getTypeMetaInfoAccess().getExamplesKeyword_5_0());
                        
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1012:1: ( (lv_examples_10_0= ruleLiteral ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==RULE_INT||(LA24_0>=RULE_STRING && LA24_0<=RULE_DECIMAL)||(LA24_0>=39 && LA24_0<=41)) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1013:1: (lv_examples_10_0= ruleLiteral )
                    	    {
                    	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1013:1: (lv_examples_10_0= ruleLiteral )
                    	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1014:3: lv_examples_10_0= ruleLiteral
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTypeMetaInfoAccess().getExamplesLiteralParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleLiteral_in_ruleTypeMetaInfo2050);
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
                    	    break loop24;
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


    // $ANTLR start "entryRuleAttribute"
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1038:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1039:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1040:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute2089);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute2099); 

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1047:1: ruleAttribute returns [EObject current=null] : ( ( (lv_doc_0_0= RULE_DOC ) )? ( (lv_nullable_1_0= 'nullable' ) )? ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= '*' ) )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_invariants_5_0= ruleInvariants ) )? ( (lv_overridden_6_0= ruleOverriddenTypeMetaInfo ) )? ) ;
    public final EObject ruleAttribute() throws RecognitionException {
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
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1050:28: ( ( ( (lv_doc_0_0= RULE_DOC ) )? ( (lv_nullable_1_0= 'nullable' ) )? ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= '*' ) )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_invariants_5_0= ruleInvariants ) )? ( (lv_overridden_6_0= ruleOverriddenTypeMetaInfo ) )? ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1051:1: ( ( (lv_doc_0_0= RULE_DOC ) )? ( (lv_nullable_1_0= 'nullable' ) )? ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= '*' ) )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_invariants_5_0= ruleInvariants ) )? ( (lv_overridden_6_0= ruleOverriddenTypeMetaInfo ) )? )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1051:1: ( ( (lv_doc_0_0= RULE_DOC ) )? ( (lv_nullable_1_0= 'nullable' ) )? ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= '*' ) )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_invariants_5_0= ruleInvariants ) )? ( (lv_overridden_6_0= ruleOverriddenTypeMetaInfo ) )? )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1051:2: ( (lv_doc_0_0= RULE_DOC ) )? ( (lv_nullable_1_0= 'nullable' ) )? ( (otherlv_2= RULE_ID ) ) ( (lv_multiplicity_3_0= '*' ) )? ( (lv_name_4_0= RULE_ID ) ) ( (lv_invariants_5_0= ruleInvariants ) )? ( (lv_overridden_6_0= ruleOverriddenTypeMetaInfo ) )?
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1051:2: ( (lv_doc_0_0= RULE_DOC ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_DOC) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1052:1: (lv_doc_0_0= RULE_DOC )
                    {
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1052:1: (lv_doc_0_0= RULE_DOC )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1053:3: lv_doc_0_0= RULE_DOC
                    {
                    lv_doc_0_0=(Token)match(input,RULE_DOC,FOLLOW_RULE_DOC_in_ruleAttribute2141); 

                    			newLeafNode(lv_doc_0_0, grammarAccess.getAttributeAccess().getDocDOCTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
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

            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1069:3: ( (lv_nullable_1_0= 'nullable' ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==34) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1070:1: (lv_nullable_1_0= 'nullable' )
                    {
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1070:1: (lv_nullable_1_0= 'nullable' )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1071:3: lv_nullable_1_0= 'nullable'
                    {
                    lv_nullable_1_0=(Token)match(input,34,FOLLOW_34_in_ruleAttribute2165); 

                            newLeafNode(lv_nullable_1_0, grammarAccess.getAttributeAccess().getNullableNullableKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "nullable", lv_nullable_1_0, "nullable");
                    	    

                    }


                    }
                    break;

            }

            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1084:3: ( (otherlv_2= RULE_ID ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1085:1: (otherlv_2= RULE_ID )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1085:1: (otherlv_2= RULE_ID )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1086:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute2199); 

            		newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getTypeTypeCrossReference_2_0()); 
            	

            }


            }

            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1097:2: ( (lv_multiplicity_3_0= '*' ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==35) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1098:1: (lv_multiplicity_3_0= '*' )
                    {
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1098:1: (lv_multiplicity_3_0= '*' )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1099:3: lv_multiplicity_3_0= '*'
                    {
                    lv_multiplicity_3_0=(Token)match(input,35,FOLLOW_35_in_ruleAttribute2217); 

                            newLeafNode(lv_multiplicity_3_0, grammarAccess.getAttributeAccess().getMultiplicityAsteriskKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "multiplicity", lv_multiplicity_3_0, "*");
                    	    

                    }


                    }
                    break;

            }

            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1112:3: ( (lv_name_4_0= RULE_ID ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1113:1: (lv_name_4_0= RULE_ID )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1113:1: (lv_name_4_0= RULE_ID )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1114:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute2248); 

            			newLeafNode(lv_name_4_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"ID");
            	    

            }


            }

            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1130:2: ( (lv_invariants_5_0= ruleInvariants ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==36) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1131:1: (lv_invariants_5_0= ruleInvariants )
                    {
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1131:1: (lv_invariants_5_0= ruleInvariants )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1132:3: lv_invariants_5_0= ruleInvariants
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttributeAccess().getInvariantsInvariantsParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleInvariants_in_ruleAttribute2274);
                    lv_invariants_5_0=ruleInvariants();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAttributeRule());
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

            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1148:3: ( (lv_overridden_6_0= ruleOverriddenTypeMetaInfo ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==14) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1149:1: (lv_overridden_6_0= ruleOverriddenTypeMetaInfo )
                    {
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1149:1: (lv_overridden_6_0= ruleOverriddenTypeMetaInfo )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1150:3: lv_overridden_6_0= ruleOverriddenTypeMetaInfo
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttributeAccess().getOverriddenOverriddenTypeMetaInfoParserRuleCall_6_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOverriddenTypeMetaInfo_in_ruleAttribute2296);
                    lv_overridden_6_0=ruleOverriddenTypeMetaInfo();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAttributeRule());
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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleInvariants"
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1174:1: entryRuleInvariants returns [EObject current=null] : iv_ruleInvariants= ruleInvariants EOF ;
    public final EObject entryRuleInvariants() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvariants = null;


        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1175:2: (iv_ruleInvariants= ruleInvariants EOF )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1176:2: iv_ruleInvariants= ruleInvariants EOF
            {
             newCompositeNode(grammarAccess.getInvariantsRule()); 
            pushFollow(FOLLOW_ruleInvariants_in_entryRuleInvariants2333);
            iv_ruleInvariants=ruleInvariants();

            state._fsp--;

             current =iv_ruleInvariants; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInvariants2343); 

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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1183:1: ruleInvariants returns [EObject current=null] : (otherlv_0= 'invariants' ( (lv_constraintInstances_1_0= ruleConstraintInstance ) ) (otherlv_2= ',' ( (lv_constraintInstances_3_0= ruleConstraintInstance ) ) )* ) ;
    public final EObject ruleInvariants() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_constraintInstances_1_0 = null;

        EObject lv_constraintInstances_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1186:28: ( (otherlv_0= 'invariants' ( (lv_constraintInstances_1_0= ruleConstraintInstance ) ) (otherlv_2= ',' ( (lv_constraintInstances_3_0= ruleConstraintInstance ) ) )* ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1187:1: (otherlv_0= 'invariants' ( (lv_constraintInstances_1_0= ruleConstraintInstance ) ) (otherlv_2= ',' ( (lv_constraintInstances_3_0= ruleConstraintInstance ) ) )* )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1187:1: (otherlv_0= 'invariants' ( (lv_constraintInstances_1_0= ruleConstraintInstance ) ) (otherlv_2= ',' ( (lv_constraintInstances_3_0= ruleConstraintInstance ) ) )* )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1187:3: otherlv_0= 'invariants' ( (lv_constraintInstances_1_0= ruleConstraintInstance ) ) (otherlv_2= ',' ( (lv_constraintInstances_3_0= ruleConstraintInstance ) ) )*
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleInvariants2380); 

                	newLeafNode(otherlv_0, grammarAccess.getInvariantsAccess().getInvariantsKeyword_0());
                
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1191:1: ( (lv_constraintInstances_1_0= ruleConstraintInstance ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1192:1: (lv_constraintInstances_1_0= ruleConstraintInstance )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1192:1: (lv_constraintInstances_1_0= ruleConstraintInstance )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1193:3: lv_constraintInstances_1_0= ruleConstraintInstance
            {
             
            	        newCompositeNode(grammarAccess.getInvariantsAccess().getConstraintInstancesConstraintInstanceParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleConstraintInstance_in_ruleInvariants2401);
            lv_constraintInstances_1_0=ruleConstraintInstance();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInvariantsRule());
            	        }
                   		add(
                   			current, 
                   			"constraintInstances",
                    		lv_constraintInstances_1_0, 
                    		"ConstraintInstance");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1209:2: (otherlv_2= ',' ( (lv_constraintInstances_3_0= ruleConstraintInstance ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==24) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1209:4: otherlv_2= ',' ( (lv_constraintInstances_3_0= ruleConstraintInstance ) )
            	    {
            	    otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleInvariants2414); 

            	        	newLeafNode(otherlv_2, grammarAccess.getInvariantsAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1213:1: ( (lv_constraintInstances_3_0= ruleConstraintInstance ) )
            	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1214:1: (lv_constraintInstances_3_0= ruleConstraintInstance )
            	    {
            	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1214:1: (lv_constraintInstances_3_0= ruleConstraintInstance )
            	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1215:3: lv_constraintInstances_3_0= ruleConstraintInstance
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInvariantsAccess().getConstraintInstancesConstraintInstanceParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConstraintInstance_in_ruleInvariants2435);
            	    lv_constraintInstances_3_0=ruleConstraintInstance();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInvariantsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"constraintInstances",
            	            		lv_constraintInstances_3_0, 
            	            		"ConstraintInstance");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1239:1: entryRuleOverriddenTypeMetaInfo returns [EObject current=null] : iv_ruleOverriddenTypeMetaInfo= ruleOverriddenTypeMetaInfo EOF ;
    public final EObject entryRuleOverriddenTypeMetaInfo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOverriddenTypeMetaInfo = null;


        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1240:2: (iv_ruleOverriddenTypeMetaInfo= ruleOverriddenTypeMetaInfo EOF )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1241:2: iv_ruleOverriddenTypeMetaInfo= ruleOverriddenTypeMetaInfo EOF
            {
             newCompositeNode(grammarAccess.getOverriddenTypeMetaInfoRule()); 
            pushFollow(FOLLOW_ruleOverriddenTypeMetaInfo_in_entryRuleOverriddenTypeMetaInfo2473);
            iv_ruleOverriddenTypeMetaInfo=ruleOverriddenTypeMetaInfo();

            state._fsp--;

             current =iv_ruleOverriddenTypeMetaInfo; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOverriddenTypeMetaInfo2483); 

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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1248:1: ruleOverriddenTypeMetaInfo returns [EObject current=null] : (otherlv_0= '{' ( (lv_metaInfo_1_0= ruleTypeMetaInfo ) ) otherlv_2= '}' ) ;
    public final EObject ruleOverriddenTypeMetaInfo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_metaInfo_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1251:28: ( (otherlv_0= '{' ( (lv_metaInfo_1_0= ruleTypeMetaInfo ) ) otherlv_2= '}' ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1252:1: (otherlv_0= '{' ( (lv_metaInfo_1_0= ruleTypeMetaInfo ) ) otherlv_2= '}' )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1252:1: (otherlv_0= '{' ( (lv_metaInfo_1_0= ruleTypeMetaInfo ) ) otherlv_2= '}' )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1252:3: otherlv_0= '{' ( (lv_metaInfo_1_0= ruleTypeMetaInfo ) ) otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleOverriddenTypeMetaInfo2520); 

                	newLeafNode(otherlv_0, grammarAccess.getOverriddenTypeMetaInfoAccess().getLeftCurlyBracketKeyword_0());
                
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1256:1: ( (lv_metaInfo_1_0= ruleTypeMetaInfo ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1257:1: (lv_metaInfo_1_0= ruleTypeMetaInfo )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1257:1: (lv_metaInfo_1_0= ruleTypeMetaInfo )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1258:3: lv_metaInfo_1_0= ruleTypeMetaInfo
            {
             
            	        newCompositeNode(grammarAccess.getOverriddenTypeMetaInfoAccess().getMetaInfoTypeMetaInfoParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeMetaInfo_in_ruleOverriddenTypeMetaInfo2541);
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

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleOverriddenTypeMetaInfo2553); 

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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1286:1: entryRuleConstraintInstance returns [EObject current=null] : iv_ruleConstraintInstance= ruleConstraintInstance EOF ;
    public final EObject entryRuleConstraintInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraintInstance = null;


        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1287:2: (iv_ruleConstraintInstance= ruleConstraintInstance EOF )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1288:2: iv_ruleConstraintInstance= ruleConstraintInstance EOF
            {
             newCompositeNode(grammarAccess.getConstraintInstanceRule()); 
            pushFollow(FOLLOW_ruleConstraintInstance_in_entryRuleConstraintInstance2589);
            iv_ruleConstraintInstance=ruleConstraintInstance();

            state._fsp--;

             current =iv_ruleConstraintInstance; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraintInstance2599); 

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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1295:1: ruleConstraintInstance returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_params_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleLiteral ) ) )* otherlv_5= ')' )? ) ;
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
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1298:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_params_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleLiteral ) ) )* otherlv_5= ')' )? ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1299:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_params_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleLiteral ) ) )* otherlv_5= ')' )? )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1299:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_params_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleLiteral ) ) )* otherlv_5= ')' )? )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1299:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_params_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleLiteral ) ) )* otherlv_5= ')' )?
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1299:2: ( (otherlv_0= RULE_ID ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1300:1: (otherlv_0= RULE_ID )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1300:1: (otherlv_0= RULE_ID )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1301:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getConstraintInstanceRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstraintInstance2644); 

            		newLeafNode(otherlv_0, grammarAccess.getConstraintInstanceAccess().getConstraintConstraintCrossReference_0_0()); 
            	

            }


            }

            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1312:2: (otherlv_1= '(' ( (lv_params_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleLiteral ) ) )* otherlv_5= ')' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==37) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1312:4: otherlv_1= '(' ( (lv_params_2_0= ruleLiteral ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleLiteral ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleConstraintInstance2657); 

                        	newLeafNode(otherlv_1, grammarAccess.getConstraintInstanceAccess().getLeftParenthesisKeyword_1_0());
                        
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1316:1: ( (lv_params_2_0= ruleLiteral ) )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1317:1: (lv_params_2_0= ruleLiteral )
                    {
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1317:1: (lv_params_2_0= ruleLiteral )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1318:3: lv_params_2_0= ruleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getConstraintInstanceAccess().getParamsLiteralParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLiteral_in_ruleConstraintInstance2678);
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

                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1334:2: (otherlv_3= ',' ( (lv_params_4_0= ruleLiteral ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==24) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1334:4: otherlv_3= ',' ( (lv_params_4_0= ruleLiteral ) )
                    	    {
                    	    otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleConstraintInstance2691); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getConstraintInstanceAccess().getCommaKeyword_1_2_0());
                    	        
                    	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1338:1: ( (lv_params_4_0= ruleLiteral ) )
                    	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1339:1: (lv_params_4_0= ruleLiteral )
                    	    {
                    	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1339:1: (lv_params_4_0= ruleLiteral )
                    	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1340:3: lv_params_4_0= ruleLiteral
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getConstraintInstanceAccess().getParamsLiteralParserRuleCall_1_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleLiteral_in_ruleConstraintInstance2712);
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
                    	    break loop32;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,38,FOLLOW_38_in_ruleConstraintInstance2726); 

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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1368:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1369:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1370:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral2764);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral2774); 

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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1377:1: ruleLiteral returns [EObject current=null] : (this_NullLiteral_0= ruleNullLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NumberLiteral_2= ruleNumberLiteral | this_StringLiteral_3= ruleStringLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_NullLiteral_0 = null;

        EObject this_BooleanLiteral_1 = null;

        EObject this_NumberLiteral_2 = null;

        EObject this_StringLiteral_3 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1380:28: ( (this_NullLiteral_0= ruleNullLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NumberLiteral_2= ruleNumberLiteral | this_StringLiteral_3= ruleStringLiteral ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1381:1: (this_NullLiteral_0= ruleNullLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NumberLiteral_2= ruleNumberLiteral | this_StringLiteral_3= ruleStringLiteral )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1381:1: (this_NullLiteral_0= ruleNullLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NumberLiteral_2= ruleNumberLiteral | this_StringLiteral_3= ruleStringLiteral )
            int alt34=4;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt34=1;
                }
                break;
            case 39:
            case 40:
                {
                alt34=2;
                }
                break;
            case RULE_INT:
            case RULE_HEX:
            case RULE_DECIMAL:
                {
                alt34=3;
                }
                break;
            case RULE_STRING:
                {
                alt34=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1382:5: this_NullLiteral_0= ruleNullLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getNullLiteralParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleNullLiteral_in_ruleLiteral2821);
                    this_NullLiteral_0=ruleNullLiteral();

                    state._fsp--;

                     
                            current = this_NullLiteral_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1392:5: this_BooleanLiteral_1= ruleBooleanLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_ruleLiteral2848);
                    this_BooleanLiteral_1=ruleBooleanLiteral();

                    state._fsp--;

                     
                            current = this_BooleanLiteral_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1402:5: this_NumberLiteral_2= ruleNumberLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getNumberLiteralParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleNumberLiteral_in_ruleLiteral2875);
                    this_NumberLiteral_2=ruleNumberLiteral();

                    state._fsp--;

                     
                            current = this_NumberLiteral_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1412:5: this_StringLiteral_3= ruleStringLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleLiteral2902);
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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1428:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1429:2: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1430:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
             newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral2937);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;

             current =iv_ruleBooleanLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral2947); 

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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1437:1: ruleBooleanLiteral returns [EObject current=null] : ( () ( ( (lv_value_1_1= 'false' | lv_value_1_2= 'true' ) ) ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_1=null;
        Token lv_value_1_2=null;

         enterRule(); 
            
        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1440:28: ( ( () ( ( (lv_value_1_1= 'false' | lv_value_1_2= 'true' ) ) ) ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1441:1: ( () ( ( (lv_value_1_1= 'false' | lv_value_1_2= 'true' ) ) ) )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1441:1: ( () ( ( (lv_value_1_1= 'false' | lv_value_1_2= 'true' ) ) ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1441:2: () ( ( (lv_value_1_1= 'false' | lv_value_1_2= 'true' ) ) )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1441:2: ()
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1442:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_0(),
                        current);
                

            }

            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1447:2: ( ( (lv_value_1_1= 'false' | lv_value_1_2= 'true' ) ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1448:1: ( (lv_value_1_1= 'false' | lv_value_1_2= 'true' ) )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1448:1: ( (lv_value_1_1= 'false' | lv_value_1_2= 'true' ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1449:1: (lv_value_1_1= 'false' | lv_value_1_2= 'true' )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1449:1: (lv_value_1_1= 'false' | lv_value_1_2= 'true' )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==39) ) {
                alt35=1;
            }
            else if ( (LA35_0==40) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1450:3: lv_value_1_1= 'false'
                    {
                    lv_value_1_1=(Token)match(input,39,FOLLOW_39_in_ruleBooleanLiteral3001); 

                            newLeafNode(lv_value_1_1, grammarAccess.getBooleanLiteralAccess().getValueFalseKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBooleanLiteralRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_1_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1462:8: lv_value_1_2= 'true'
                    {
                    lv_value_1_2=(Token)match(input,40,FOLLOW_40_in_ruleBooleanLiteral3030); 

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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1485:1: entryRuleNullLiteral returns [EObject current=null] : iv_ruleNullLiteral= ruleNullLiteral EOF ;
    public final EObject entryRuleNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullLiteral = null;


        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1486:2: (iv_ruleNullLiteral= ruleNullLiteral EOF )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1487:2: iv_ruleNullLiteral= ruleNullLiteral EOF
            {
             newCompositeNode(grammarAccess.getNullLiteralRule()); 
            pushFollow(FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral3082);
            iv_ruleNullLiteral=ruleNullLiteral();

            state._fsp--;

             current =iv_ruleNullLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullLiteral3092); 

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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1494:1: ruleNullLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= 'null' ) ) ) ;
    public final EObject ruleNullLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1497:28: ( ( () ( (lv_value_1_0= 'null' ) ) ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1498:1: ( () ( (lv_value_1_0= 'null' ) ) )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1498:1: ( () ( (lv_value_1_0= 'null' ) ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1498:2: () ( (lv_value_1_0= 'null' ) )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1498:2: ()
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1499:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getNullLiteralAccess().getNullLiteralAction_0(),
                        current);
                

            }

            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1504:2: ( (lv_value_1_0= 'null' ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1505:1: (lv_value_1_0= 'null' )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1505:1: (lv_value_1_0= 'null' )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1506:3: lv_value_1_0= 'null'
            {
            lv_value_1_0=(Token)match(input,41,FOLLOW_41_in_ruleNullLiteral3144); 

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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1527:1: entryRuleNumberLiteral returns [EObject current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final EObject entryRuleNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteral = null;


        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1528:2: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1529:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
            {
             newCompositeNode(grammarAccess.getNumberLiteralRule()); 
            pushFollow(FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral3193);
            iv_ruleNumberLiteral=ruleNumberLiteral();

            state._fsp--;

             current =iv_ruleNumberLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberLiteral3203); 

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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1536:1: ruleNumberLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleNumber ) ) ) ;
    public final EObject ruleNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1539:28: ( ( () ( (lv_value_1_0= ruleNumber ) ) ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1540:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1540:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1540:2: () ( (lv_value_1_0= ruleNumber ) )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1540:2: ()
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1541:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getNumberLiteralAccess().getNumberLiteralAction_0(),
                        current);
                

            }

            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1546:2: ( (lv_value_1_0= ruleNumber ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1547:1: (lv_value_1_0= ruleNumber )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1547:1: (lv_value_1_0= ruleNumber )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1548:3: lv_value_1_0= ruleNumber
            {
             
            	        newCompositeNode(grammarAccess.getNumberLiteralAccess().getValueNumberParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleNumber_in_ruleNumberLiteral3258);
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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1572:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1573:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1574:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             newCompositeNode(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral3294);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;

             current =iv_ruleStringLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral3304); 

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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1581:1: ruleStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1584:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1585:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1585:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1585:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1585:2: ()
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1586:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStringLiteralAccess().getStringLiteralAction_0(),
                        current);
                

            }

            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1591:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1592:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1592:1: (lv_value_1_0= RULE_STRING )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1593:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral3355); 

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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1617:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1618:2: (iv_ruleFQN= ruleFQN EOF )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1619:2: iv_ruleFQN= ruleFQN EOF
            {
             newCompositeNode(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN3397);
            iv_ruleFQN=ruleFQN();

            state._fsp--;

             current =iv_ruleFQN.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN3408); 

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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1626:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1629:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1630:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1630:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1630:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN3448); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1637:1: (kw= '.' this_ID_2= RULE_ID )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==42) ) {
                    int LA36_2 = input.LA(2);

                    if ( (LA36_2==RULE_ID) ) {
                        alt36=1;
                    }


                }


                switch (alt36) {
            	case 1 :
            	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1638:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,42,FOLLOW_42_in_ruleFQN3467); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN3482); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop36;
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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1658:1: entryRuleFQNWithWildcard returns [String current=null] : iv_ruleFQNWithWildcard= ruleFQNWithWildcard EOF ;
    public final String entryRuleFQNWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQNWithWildcard = null;


        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1659:2: (iv_ruleFQNWithWildcard= ruleFQNWithWildcard EOF )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1660:2: iv_ruleFQNWithWildcard= ruleFQNWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getFQNWithWildcardRule()); 
            pushFollow(FOLLOW_ruleFQNWithWildcard_in_entryRuleFQNWithWildcard3530);
            iv_ruleFQNWithWildcard=ruleFQNWithWildcard();

            state._fsp--;

             current =iv_ruleFQNWithWildcard.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQNWithWildcard3541); 

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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1667:1: ruleFQNWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FQN_0= ruleFQN kw= '.' kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleFQNWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FQN_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1670:28: ( (this_FQN_0= ruleFQN kw= '.' kw= '*' ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1671:1: (this_FQN_0= ruleFQN kw= '.' kw= '*' )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1671:1: (this_FQN_0= ruleFQN kw= '.' kw= '*' )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1672:5: this_FQN_0= ruleFQN kw= '.' kw= '*'
            {
             
                    newCompositeNode(grammarAccess.getFQNWithWildcardAccess().getFQNParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleFQN_in_ruleFQNWithWildcard3588);
            this_FQN_0=ruleFQN();

            state._fsp--;


            		current.merge(this_FQN_0);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,42,FOLLOW_42_in_ruleFQNWithWildcard3606); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getFQNWithWildcardAccess().getFullStopKeyword_1()); 
                
            kw=(Token)match(input,35,FOLLOW_35_in_ruleFQNWithWildcard3619); 

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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1702:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1706:2: (iv_ruleNumber= ruleNumber EOF )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1707:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber3666);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber3677); 

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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1717:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) ;
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
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1721:28: ( (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1722:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1722:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_HEX) ) {
                alt40=1;
            }
            else if ( (LA40_0==RULE_INT||LA40_0==RULE_DECIMAL) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1722:6: this_HEX_0= RULE_HEX
                    {
                    this_HEX_0=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleNumber3721); 

                    		current.merge(this_HEX_0);
                        
                     
                        newLeafNode(this_HEX_0, grammarAccess.getNumberAccess().getHEXTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1730:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    {
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1730:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1730:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    {
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1730:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL )
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
                            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1730:12: this_INT_1= RULE_INT
                            {
                            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber3749); 

                            		current.merge(this_INT_1);
                                
                             
                                newLeafNode(this_INT_1, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_0_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1738:10: this_DECIMAL_2= RULE_DECIMAL
                            {
                            this_DECIMAL_2=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber3775); 

                            		current.merge(this_DECIMAL_2);
                                
                             
                                newLeafNode(this_DECIMAL_2, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_0_1()); 
                                

                            }
                            break;

                    }

                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1745:2: (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==42) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1746:2: kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            {
                            kw=(Token)match(input,42,FOLLOW_42_in_ruleNumber3795); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getNumberAccess().getFullStopKeyword_1_1_0()); 
                                
                            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1751:1: (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            int alt38=2;
                            int LA38_0 = input.LA(1);

                            if ( (LA38_0==RULE_INT) ) {
                                alt38=1;
                            }
                            else if ( (LA38_0==RULE_DECIMAL) ) {
                                alt38=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 38, 0, input);

                                throw nvae;
                            }
                            switch (alt38) {
                                case 1 :
                                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1751:6: this_INT_4= RULE_INT
                                    {
                                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber3811); 

                                    		current.merge(this_INT_4);
                                        
                                     
                                        newLeafNode(this_INT_4, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1_1_0()); 
                                        

                                    }
                                    break;
                                case 2 :
                                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1759:10: this_DECIMAL_5= RULE_DECIMAL
                                    {
                                    this_DECIMAL_5=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber3837); 

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


    // $ANTLR start "ruleTimeUnit"
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1777:1: ruleTimeUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'millis' ) | (enumLiteral_1= 'seconds' ) | (enumLiteral_2= 'minutes' ) | (enumLiteral_3= 'hours' ) | (enumLiteral_4= 'days' ) ) ;
    public final Enumerator ruleTimeUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1779:28: ( ( (enumLiteral_0= 'millis' ) | (enumLiteral_1= 'seconds' ) | (enumLiteral_2= 'minutes' ) | (enumLiteral_3= 'hours' ) | (enumLiteral_4= 'days' ) ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1780:1: ( (enumLiteral_0= 'millis' ) | (enumLiteral_1= 'seconds' ) | (enumLiteral_2= 'minutes' ) | (enumLiteral_3= 'hours' ) | (enumLiteral_4= 'days' ) )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1780:1: ( (enumLiteral_0= 'millis' ) | (enumLiteral_1= 'seconds' ) | (enumLiteral_2= 'minutes' ) | (enumLiteral_3= 'hours' ) | (enumLiteral_4= 'days' ) )
            int alt41=5;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt41=1;
                }
                break;
            case 44:
                {
                alt41=2;
                }
                break;
            case 45:
                {
                alt41=3;
                }
                break;
            case 46:
                {
                alt41=4;
                }
                break;
            case 47:
                {
                alt41=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1780:2: (enumLiteral_0= 'millis' )
                    {
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1780:2: (enumLiteral_0= 'millis' )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1780:4: enumLiteral_0= 'millis'
                    {
                    enumLiteral_0=(Token)match(input,43,FOLLOW_43_in_ruleTimeUnit3904); 

                            current = grammarAccess.getTimeUnitAccess().getMillisEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getTimeUnitAccess().getMillisEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1786:6: (enumLiteral_1= 'seconds' )
                    {
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1786:6: (enumLiteral_1= 'seconds' )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1786:8: enumLiteral_1= 'seconds'
                    {
                    enumLiteral_1=(Token)match(input,44,FOLLOW_44_in_ruleTimeUnit3921); 

                            current = grammarAccess.getTimeUnitAccess().getSecondsEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getTimeUnitAccess().getSecondsEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1792:6: (enumLiteral_2= 'minutes' )
                    {
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1792:6: (enumLiteral_2= 'minutes' )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1792:8: enumLiteral_2= 'minutes'
                    {
                    enumLiteral_2=(Token)match(input,45,FOLLOW_45_in_ruleTimeUnit3938); 

                            current = grammarAccess.getTimeUnitAccess().getMinutesEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getTimeUnitAccess().getMinutesEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1798:6: (enumLiteral_3= 'hours' )
                    {
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1798:6: (enumLiteral_3= 'hours' )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1798:8: enumLiteral_3= 'hours'
                    {
                    enumLiteral_3=(Token)match(input,46,FOLLOW_46_in_ruleTimeUnit3955); 

                            current = grammarAccess.getTimeUnitAccess().getHoursEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getTimeUnitAccess().getHoursEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1804:6: (enumLiteral_4= 'days' )
                    {
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1804:6: (enumLiteral_4= 'days' )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:1804:8: enumLiteral_4= 'days'
                    {
                    enumLiteral_4=(Token)match(input,47,FOLLOW_47_in_ruleTimeUnit3972); 

                            current = grammarAccess.getTimeUnitAccess().getDaysEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getTimeUnitAccess().getDaysEnumLiteralDeclaration_4()); 
                        

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
        }
        return current;
    }
    // $ANTLR end "ruleTimeUnit"

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\6\uffff";
    static final String DFA5_eofS =
        "\1\uffff\1\3\3\uffff\1\3";
    static final String DFA5_minS =
        "\1\4\1\6\1\4\2\uffff\1\6";
    static final String DFA5_maxS =
        "\1\4\1\52\1\43\2\uffff\1\52";
    static final String DFA5_acceptS =
        "\3\uffff\1\1\1\2\1\uffff";
    static final String DFA5_specialS =
        "\6\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1",
            "\1\3\10\uffff\1\3\1\uffff\2\3\3\uffff\1\3\3\uffff\1\3\1\uffff\1\3\15\uffff\1\2",
            "\1\5\36\uffff\1\4",
            "",
            "",
            "\1\3\10\uffff\1\3\1\uffff\2\3\3\uffff\1\3\3\uffff\1\3\1\uffff\1\3\15\uffff\1\2"
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
            return "282:1: (lv_importedNamespace_1_1= ruleFQN | lv_importedNamespace_1_2= ruleFQNWithWildcard )";
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
    public static final BitSet FOLLOW_14_in_ruleNamespace397 = new BitSet(new long[]{0x0000000014468040L});
    public static final BitSet FOLLOW_ruleImport_in_ruleNamespace418 = new BitSet(new long[]{0x0000000014468040L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_ruleNamespace440 = new BitSet(new long[]{0x0000000014448040L});
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
    public static final BitSet FOLLOW_ruleDuration_in_entryRuleDuration790 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDuration800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDuration842 = new BitSet(new long[]{0x0000F80000000000L});
    public static final BitSet FOLLOW_ruleTimeUnit_in_ruleDuration868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_entryRuleCommand904 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommand914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleCommand956 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleCommand974 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCommand991 = new BitSet(new long[]{0x0000000000184000L});
    public static final BitSet FOLLOW_19_in_ruleCommand1009 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleCommand1032 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_20_in_ruleCommand1047 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDuration_in_ruleCommand1068 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCommand1082 = new BitSet(new long[]{0x0000000400208050L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleCommand1103 = new BitSet(new long[]{0x0000000400208050L});
    public static final BitSet FOLLOW_21_in_ruleCommand1117 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCommand1134 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCommand1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandHandler_in_entryRuleCommandHandler1189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommandHandler1199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleCommandHandler1241 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleCommandHandler1259 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCommandHandler1276 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleCommandHandler1293 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCommandHandler1313 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_24_in_ruleCommandHandler1326 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCommandHandler1346 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_25_in_ruleCommandHandler1361 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleCommandHandler1384 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleCommandHandler1397 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleCommandHandler1420 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleProjection_in_entryRuleProjection1460 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProjection1470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleProjection1512 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleProjection1530 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProjection1547 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleProjection1565 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleProjection1588 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleProjection1601 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleProjection1624 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleView_in_entryRuleView1664 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleView1674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleView1716 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleView1734 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleView1751 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleView1768 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleView1788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeMetaInfo_in_entryRuleTypeMetaInfo1824 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeMetaInfo1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleTypeMetaInfo1881 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTypeMetaInfo1898 = new BitSet(new long[]{0x00000003C0000002L});
    public static final BitSet FOLLOW_30_in_ruleTypeMetaInfo1918 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTypeMetaInfo1935 = new BitSet(new long[]{0x0000000380000002L});
    public static final BitSet FOLLOW_31_in_ruleTypeMetaInfo1955 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTypeMetaInfo1972 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_32_in_ruleTypeMetaInfo1992 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTypeMetaInfo2009 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleTypeMetaInfo2029 = new BitSet(new long[]{0x00000380000003A2L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleTypeMetaInfo2050 = new BitSet(new long[]{0x00000380000003A2L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute2089 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute2099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_ruleAttribute2141 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_34_in_ruleAttribute2165 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute2199 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_35_in_ruleAttribute2217 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute2248 = new BitSet(new long[]{0x0000001000004002L});
    public static final BitSet FOLLOW_ruleInvariants_in_ruleAttribute2274 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleOverriddenTypeMetaInfo_in_ruleAttribute2296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvariants_in_entryRuleInvariants2333 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInvariants2343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleInvariants2380 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleConstraintInstance_in_ruleInvariants2401 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleInvariants2414 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleConstraintInstance_in_ruleInvariants2435 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleOverriddenTypeMetaInfo_in_entryRuleOverriddenTypeMetaInfo2473 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOverriddenTypeMetaInfo2483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleOverriddenTypeMetaInfo2520 = new BitSet(new long[]{0x00000003E0008000L});
    public static final BitSet FOLLOW_ruleTypeMetaInfo_in_ruleOverriddenTypeMetaInfo2541 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleOverriddenTypeMetaInfo2553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraintInstance_in_entryRuleConstraintInstance2589 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraintInstance2599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstraintInstance2644 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_ruleConstraintInstance2657 = new BitSet(new long[]{0x00000380000003A0L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleConstraintInstance2678 = new BitSet(new long[]{0x0000004001000000L});
    public static final BitSet FOLLOW_24_in_ruleConstraintInstance2691 = new BitSet(new long[]{0x00000380000003A0L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleConstraintInstance2712 = new BitSet(new long[]{0x0000004001000000L});
    public static final BitSet FOLLOW_38_in_ruleConstraintInstance2726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral2764 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral2774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_ruleLiteral2821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleLiteral2848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_ruleLiteral2875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleLiteral2902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral2937 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral2947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleBooleanLiteral3001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleBooleanLiteral3030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral3082 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullLiteral3092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleNullLiteral3144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral3193 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberLiteral3203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleNumberLiteral3258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral3294 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral3304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral3355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN3397 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN3408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN3448 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_ruleFQN3467 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN3482 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ruleFQNWithWildcard_in_entryRuleFQNWithWildcard3530 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQNWithWildcard3541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleFQNWithWildcard3588 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleFQNWithWildcard3606 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleFQNWithWildcard3619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber3666 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber3677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleNumber3721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber3749 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber3775 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_ruleNumber3795 = new BitSet(new long[]{0x0000000000000220L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber3811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber3837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleTimeUnit3904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleTimeUnit3921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleTimeUnit3938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleTimeUnit3955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleTimeUnit3972 = new BitSet(new long[]{0x0000000000000002L});

}