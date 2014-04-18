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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_HEX", "RULE_INT", "RULE_DECIMAL", "RULE_DOC", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'namespace'", "'{'", "'}'", "'import'", "';'", "'.'", "'*'", "'false'", "'true'", "'null'"
    };
    public static final int RULE_ID=4;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_DOC=9;
    public static final int RULE_SL_COMMENT=11;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__19=19;
    public static final int RULE_STRING=5;
    public static final int RULE_HEX=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=7;
    public static final int RULE_WS=12;
    public static final int RULE_DECIMAL=8;

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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:76:1: ruleDomainModel returns [EObject current=null] : ( (lv_namespace_0_0= ruleNamespace ) ) ;
    public final EObject ruleDomainModel() throws RecognitionException {
        EObject current = null;

        EObject lv_namespace_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:79:28: ( ( (lv_namespace_0_0= ruleNamespace ) ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:80:1: ( (lv_namespace_0_0= ruleNamespace ) )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:80:1: ( (lv_namespace_0_0= ruleNamespace ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:81:1: (lv_namespace_0_0= ruleNamespace )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:81:1: (lv_namespace_0_0= ruleNamespace )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:82:3: lv_namespace_0_0= ruleNamespace
            {
             
            	        newCompositeNode(grammarAccess.getDomainModelAccess().getNamespaceNamespaceParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleNamespace_in_ruleDomainModel130);
            lv_namespace_0_0=ruleNamespace();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDomainModelRule());
            	        }
                   		set(
                   			current, 
                   			"namespace",
                    		lv_namespace_0_0, 
                    		"Namespace");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleDomainModel"


    // $ANTLR start "entryRuleNamespace"
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:106:1: entryRuleNamespace returns [EObject current=null] : iv_ruleNamespace= ruleNamespace EOF ;
    public final EObject entryRuleNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamespace = null;


        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:107:2: (iv_ruleNamespace= ruleNamespace EOF )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:108:2: iv_ruleNamespace= ruleNamespace EOF
            {
             newCompositeNode(grammarAccess.getNamespaceRule()); 
            pushFollow(FOLLOW_ruleNamespace_in_entryRuleNamespace165);
            iv_ruleNamespace=ruleNamespace();

            state._fsp--;

             current =iv_ruleNamespace; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamespace175); 

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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:115:1: ruleNamespace returns [EObject current=null] : (otherlv_0= 'namespace' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* otherlv_4= '}' ) ;
    public final EObject ruleNamespace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_imports_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:118:28: ( (otherlv_0= 'namespace' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* otherlv_4= '}' ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:119:1: (otherlv_0= 'namespace' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* otherlv_4= '}' )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:119:1: (otherlv_0= 'namespace' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* otherlv_4= '}' )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:119:3: otherlv_0= 'namespace' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleNamespace212); 

                	newLeafNode(otherlv_0, grammarAccess.getNamespaceAccess().getNamespaceKeyword_0());
                
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:123:1: ( (lv_name_1_0= ruleFQN ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:124:1: (lv_name_1_0= ruleFQN )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:124:1: (lv_name_1_0= ruleFQN )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:125:3: lv_name_1_0= ruleFQN
            {
             
            	        newCompositeNode(grammarAccess.getNamespaceAccess().getNameFQNParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_ruleNamespace233);
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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleNamespace245); 

                	newLeafNode(otherlv_2, grammarAccess.getNamespaceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:145:1: ( (lv_imports_3_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:146:1: (lv_imports_3_0= ruleImport )
            	    {
            	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:146:1: (lv_imports_3_0= ruleImport )
            	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:147:3: lv_imports_3_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNamespaceAccess().getImportsImportParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleNamespace266);
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
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleNamespace279); 

                	newLeafNode(otherlv_4, grammarAccess.getNamespaceAccess().getRightCurlyBracketKeyword_4());
                

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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:175:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:176:2: (iv_ruleImport= ruleImport EOF )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:177:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport315);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport325); 

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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:184:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( ( (lv_importedNamespace_1_1= ruleFQN | lv_importedNamespace_1_2= ruleFQNWithWildcard ) ) ) otherlv_2= ';' ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_1 = null;

        AntlrDatatypeRuleToken lv_importedNamespace_1_2 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:187:28: ( (otherlv_0= 'import' ( ( (lv_importedNamespace_1_1= ruleFQN | lv_importedNamespace_1_2= ruleFQNWithWildcard ) ) ) otherlv_2= ';' ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:188:1: (otherlv_0= 'import' ( ( (lv_importedNamespace_1_1= ruleFQN | lv_importedNamespace_1_2= ruleFQNWithWildcard ) ) ) otherlv_2= ';' )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:188:1: (otherlv_0= 'import' ( ( (lv_importedNamespace_1_1= ruleFQN | lv_importedNamespace_1_2= ruleFQNWithWildcard ) ) ) otherlv_2= ';' )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:188:3: otherlv_0= 'import' ( ( (lv_importedNamespace_1_1= ruleFQN | lv_importedNamespace_1_2= ruleFQNWithWildcard ) ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleImport362); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:192:1: ( ( (lv_importedNamespace_1_1= ruleFQN | lv_importedNamespace_1_2= ruleFQNWithWildcard ) ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:193:1: ( (lv_importedNamespace_1_1= ruleFQN | lv_importedNamespace_1_2= ruleFQNWithWildcard ) )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:193:1: ( (lv_importedNamespace_1_1= ruleFQN | lv_importedNamespace_1_2= ruleFQNWithWildcard ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:194:1: (lv_importedNamespace_1_1= ruleFQN | lv_importedNamespace_1_2= ruleFQNWithWildcard )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:194:1: (lv_importedNamespace_1_1= ruleFQN | lv_importedNamespace_1_2= ruleFQNWithWildcard )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:195:3: lv_importedNamespace_1_1= ruleFQN
                    {
                     
                    	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceFQNParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleImport385);
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
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:210:8: lv_importedNamespace_1_2= ruleFQNWithWildcard
                    {
                     
                    	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceFQNWithWildcardParserRuleCall_1_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleFQNWithWildcard_in_ruleImport404);
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

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleImport419); 

                	newLeafNode(otherlv_2, grammarAccess.getImportAccess().getSemicolonKeyword_2());
                

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


    // $ANTLR start "entryRuleFQN"
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:242:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:243:2: (iv_ruleFQN= ruleFQN EOF )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:244:2: iv_ruleFQN= ruleFQN EOF
            {
             newCompositeNode(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN458);
            iv_ruleFQN=ruleFQN();

            state._fsp--;

             current =iv_ruleFQN.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN469); 

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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:251:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:254:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:255:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:255:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:255:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN509); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:262:1: (kw= '.' this_ID_2= RULE_ID )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    int LA3_2 = input.LA(2);

                    if ( (LA3_2==RULE_ID) ) {
                        alt3=1;
                    }


                }


                switch (alt3) {
            	case 1 :
            	    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:263:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,18,FOLLOW_18_in_ruleFQN528); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN543); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop3;
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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:283:1: entryRuleFQNWithWildcard returns [String current=null] : iv_ruleFQNWithWildcard= ruleFQNWithWildcard EOF ;
    public final String entryRuleFQNWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQNWithWildcard = null;


        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:284:2: (iv_ruleFQNWithWildcard= ruleFQNWithWildcard EOF )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:285:2: iv_ruleFQNWithWildcard= ruleFQNWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getFQNWithWildcardRule()); 
            pushFollow(FOLLOW_ruleFQNWithWildcard_in_entryRuleFQNWithWildcard591);
            iv_ruleFQNWithWildcard=ruleFQNWithWildcard();

            state._fsp--;

             current =iv_ruleFQNWithWildcard.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQNWithWildcard602); 

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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:292:1: ruleFQNWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FQN_0= ruleFQN kw= '.' kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleFQNWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FQN_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:295:28: ( (this_FQN_0= ruleFQN kw= '.' kw= '*' ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:296:1: (this_FQN_0= ruleFQN kw= '.' kw= '*' )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:296:1: (this_FQN_0= ruleFQN kw= '.' kw= '*' )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:297:5: this_FQN_0= ruleFQN kw= '.' kw= '*'
            {
             
                    newCompositeNode(grammarAccess.getFQNWithWildcardAccess().getFQNParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleFQN_in_ruleFQNWithWildcard649);
            this_FQN_0=ruleFQN();

            state._fsp--;


            		current.merge(this_FQN_0);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,18,FOLLOW_18_in_ruleFQNWithWildcard667); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getFQNWithWildcardAccess().getFullStopKeyword_1()); 
                
            kw=(Token)match(input,19,FOLLOW_19_in_ruleFQNWithWildcard680); 

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


    // $ANTLR start "entryRuleBooleanLiteral"
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:327:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:328:2: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:329:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
             newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral720);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;

             current =iv_ruleBooleanLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral730); 

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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:336:1: ruleBooleanLiteral returns [EObject current=null] : ( () ( ( (lv_value_1_1= 'false' | lv_value_1_2= 'true' ) ) ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_1=null;
        Token lv_value_1_2=null;

         enterRule(); 
            
        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:339:28: ( ( () ( ( (lv_value_1_1= 'false' | lv_value_1_2= 'true' ) ) ) ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:340:1: ( () ( ( (lv_value_1_1= 'false' | lv_value_1_2= 'true' ) ) ) )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:340:1: ( () ( ( (lv_value_1_1= 'false' | lv_value_1_2= 'true' ) ) ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:340:2: () ( ( (lv_value_1_1= 'false' | lv_value_1_2= 'true' ) ) )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:340:2: ()
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:341:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_0(),
                        current);
                

            }

            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:346:2: ( ( (lv_value_1_1= 'false' | lv_value_1_2= 'true' ) ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:347:1: ( (lv_value_1_1= 'false' | lv_value_1_2= 'true' ) )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:347:1: ( (lv_value_1_1= 'false' | lv_value_1_2= 'true' ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:348:1: (lv_value_1_1= 'false' | lv_value_1_2= 'true' )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:348:1: (lv_value_1_1= 'false' | lv_value_1_2= 'true' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            else if ( (LA4_0==21) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:349:3: lv_value_1_1= 'false'
                    {
                    lv_value_1_1=(Token)match(input,20,FOLLOW_20_in_ruleBooleanLiteral784); 

                            newLeafNode(lv_value_1_1, grammarAccess.getBooleanLiteralAccess().getValueFalseKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBooleanLiteralRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_1_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:361:8: lv_value_1_2= 'true'
                    {
                    lv_value_1_2=(Token)match(input,21,FOLLOW_21_in_ruleBooleanLiteral813); 

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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:384:1: entryRuleNullLiteral returns [EObject current=null] : iv_ruleNullLiteral= ruleNullLiteral EOF ;
    public final EObject entryRuleNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullLiteral = null;


        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:385:2: (iv_ruleNullLiteral= ruleNullLiteral EOF )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:386:2: iv_ruleNullLiteral= ruleNullLiteral EOF
            {
             newCompositeNode(grammarAccess.getNullLiteralRule()); 
            pushFollow(FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral865);
            iv_ruleNullLiteral=ruleNullLiteral();

            state._fsp--;

             current =iv_ruleNullLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullLiteral875); 

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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:393:1: ruleNullLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= 'null' ) ) ) ;
    public final EObject ruleNullLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:396:28: ( ( () ( (lv_value_1_0= 'null' ) ) ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:397:1: ( () ( (lv_value_1_0= 'null' ) ) )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:397:1: ( () ( (lv_value_1_0= 'null' ) ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:397:2: () ( (lv_value_1_0= 'null' ) )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:397:2: ()
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:398:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getNullLiteralAccess().getNullLiteralAction_0(),
                        current);
                

            }

            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:403:2: ( (lv_value_1_0= 'null' ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:404:1: (lv_value_1_0= 'null' )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:404:1: (lv_value_1_0= 'null' )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:405:3: lv_value_1_0= 'null'
            {
            lv_value_1_0=(Token)match(input,22,FOLLOW_22_in_ruleNullLiteral927); 

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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:426:1: entryRuleNumberLiteral returns [EObject current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final EObject entryRuleNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteral = null;


        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:427:2: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:428:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
            {
             newCompositeNode(grammarAccess.getNumberLiteralRule()); 
            pushFollow(FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral976);
            iv_ruleNumberLiteral=ruleNumberLiteral();

            state._fsp--;

             current =iv_ruleNumberLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberLiteral986); 

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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:435:1: ruleNumberLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleNumber ) ) ) ;
    public final EObject ruleNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:438:28: ( ( () ( (lv_value_1_0= ruleNumber ) ) ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:439:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:439:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:439:2: () ( (lv_value_1_0= ruleNumber ) )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:439:2: ()
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:440:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getNumberLiteralAccess().getNumberLiteralAction_0(),
                        current);
                

            }

            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:445:2: ( (lv_value_1_0= ruleNumber ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:446:1: (lv_value_1_0= ruleNumber )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:446:1: (lv_value_1_0= ruleNumber )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:447:3: lv_value_1_0= ruleNumber
            {
             
            	        newCompositeNode(grammarAccess.getNumberLiteralAccess().getValueNumberParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleNumber_in_ruleNumberLiteral1041);
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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:471:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:472:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:473:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             newCompositeNode(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1077);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;

             current =iv_ruleStringLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral1087); 

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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:480:1: ruleStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:483:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:484:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:484:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:484:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:484:2: ()
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:485:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStringLiteralAccess().getStringLiteralAction_0(),
                        current);
                

            }

            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:490:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:491:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:491:1: (lv_value_1_0= RULE_STRING )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:492:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral1138); 

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


    // $ANTLR start "entryRuleNumber"
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:516:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:520:2: (iv_ruleNumber= ruleNumber EOF )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:521:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber1186);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber1197); 

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
    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:531:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) ;
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
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:535:28: ( (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) )
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:536:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            {
            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:536:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_HEX) ) {
                alt8=1;
            }
            else if ( ((LA8_0>=RULE_INT && LA8_0<=RULE_DECIMAL)) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:536:6: this_HEX_0= RULE_HEX
                    {
                    this_HEX_0=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleNumber1241); 

                    		current.merge(this_HEX_0);
                        
                     
                        newLeafNode(this_HEX_0, grammarAccess.getNumberAccess().getHEXTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:544:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    {
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:544:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:544:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    {
                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:544:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL )
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==RULE_INT) ) {
                        alt5=1;
                    }
                    else if ( (LA5_0==RULE_DECIMAL) ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);

                        throw nvae;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:544:12: this_INT_1= RULE_INT
                            {
                            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber1269); 

                            		current.merge(this_INT_1);
                                
                             
                                newLeafNode(this_INT_1, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_0_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:552:10: this_DECIMAL_2= RULE_DECIMAL
                            {
                            this_DECIMAL_2=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber1295); 

                            		current.merge(this_DECIMAL_2);
                                
                             
                                newLeafNode(this_DECIMAL_2, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_0_1()); 
                                

                            }
                            break;

                    }

                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:559:2: (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==18) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:560:2: kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            {
                            kw=(Token)match(input,18,FOLLOW_18_in_ruleNumber1315); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getNumberAccess().getFullStopKeyword_1_1_0()); 
                                
                            // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:565:1: (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            int alt6=2;
                            int LA6_0 = input.LA(1);

                            if ( (LA6_0==RULE_INT) ) {
                                alt6=1;
                            }
                            else if ( (LA6_0==RULE_DECIMAL) ) {
                                alt6=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 6, 0, input);

                                throw nvae;
                            }
                            switch (alt6) {
                                case 1 :
                                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:565:6: this_INT_4= RULE_INT
                                    {
                                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber1331); 

                                    		current.merge(this_INT_4);
                                        
                                     
                                        newLeafNode(this_INT_4, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1_1_0()); 
                                        

                                    }
                                    break;
                                case 2 :
                                    // ../org.fuin.dsl.cqrs.dsl/src-gen/org/fuin/dsl/cqrs/parser/antlr/internal/InternalCqrsDSL.g:573:10: this_DECIMAL_5= RULE_DECIMAL
                                    {
                                    this_DECIMAL_5=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber1357); 

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


    protected DFA2 dfa2 = new DFA2(this);
    static final String DFA2_eotS =
        "\6\uffff";
    static final String DFA2_eofS =
        "\6\uffff";
    static final String DFA2_minS =
        "\1\4\1\21\1\4\1\uffff\1\21\1\uffff";
    static final String DFA2_maxS =
        "\1\4\1\22\1\23\1\uffff\1\22\1\uffff";
    static final String DFA2_acceptS =
        "\3\uffff\1\1\1\uffff\1\2";
    static final String DFA2_specialS =
        "\6\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\1",
            "\1\3\1\2",
            "\1\4\16\uffff\1\5",
            "",
            "\1\3\1\2",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "194:1: (lv_importedNamespace_1_1= ruleFQN | lv_importedNamespace_1_2= ruleFQNWithWildcard )";
        }
    }
 

    public static final BitSet FOLLOW_ruleDomainModel_in_entryRuleDomainModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespace_in_ruleDomainModel130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespace_in_entryRuleNamespace165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamespace175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleNamespace212 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleNamespace233 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleNamespace245 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_ruleImport_in_ruleNamespace266 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleNamespace279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport315 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleImport362 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleImport385 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleFQNWithWildcard_in_ruleImport404 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleImport419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN458 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN509 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleFQN528 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN543 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleFQNWithWildcard_in_entryRuleFQNWithWildcard591 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQNWithWildcard602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleFQNWithWildcard649 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFQNWithWildcard667 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleFQNWithWildcard680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleBooleanLiteral784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleBooleanLiteral813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral865 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullLiteral875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleNullLiteral927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral976 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberLiteral986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleNumberLiteral1041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1077 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral1138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber1186 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber1197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleNumber1241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber1269 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber1295 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleNumber1315 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber1331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber1357 = new BitSet(new long[]{0x0000000000000002L});

}