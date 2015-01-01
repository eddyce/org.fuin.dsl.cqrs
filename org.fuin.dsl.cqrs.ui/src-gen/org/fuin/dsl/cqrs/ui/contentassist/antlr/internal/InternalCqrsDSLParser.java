package org.fuin.dsl.cqrs.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.fuin.dsl.cqrs.services.CqrsDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCqrsDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_HEX", "RULE_INT", "RULE_DECIMAL", "RULE_ID", "RULE_DOC", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'false'", "'true'", "'context'", "'{'", "'}'", "'namespace'", "'import'", "'command'", "'target'", "'message'", "'command-handler'", "'handles'", "','", "'uses'", "'projection'", "'input'", "'view'", "'slabel'", "'label'", "'tooltip'", "'prompt'", "'examples'", "'invariants'", "'('", "')'", "'.'", "'*'", "'nullable'", "'null'"
    };
    public static final int RULE_ID=7;
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
    public static final int RULE_DOC=8;
    public static final int RULE_SL_COMMENT=11;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=9;
    public static final int RULE_HEX=4;
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
    public static final int RULE_INT=5;
    public static final int RULE_WS=12;
    public static final int RULE_DECIMAL=6;

    // delegates
    // delegators


        public InternalCqrsDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCqrsDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCqrsDSLParser.tokenNames; }
    public String getGrammarFileName() { return "../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g"; }


     
     	private CqrsDSLGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(CqrsDSLGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleDomainModel"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:60:1: entryRuleDomainModel : ruleDomainModel EOF ;
    public final void entryRuleDomainModel() throws RecognitionException {
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:61:1: ( ruleDomainModel EOF )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:62:1: ruleDomainModel EOF
            {
             before(grammarAccess.getDomainModelRule()); 
            pushFollow(FOLLOW_ruleDomainModel_in_entryRuleDomainModel61);
            ruleDomainModel();

            state._fsp--;

             after(grammarAccess.getDomainModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDomainModel"


    // $ANTLR start "ruleDomainModel"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:69:1: ruleDomainModel : ( ( rule__DomainModel__ContextsAssignment )* ) ;
    public final void ruleDomainModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:73:2: ( ( ( rule__DomainModel__ContextsAssignment )* ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:74:1: ( ( rule__DomainModel__ContextsAssignment )* )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:74:1: ( ( rule__DomainModel__ContextsAssignment )* )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:75:1: ( rule__DomainModel__ContextsAssignment )*
            {
             before(grammarAccess.getDomainModelAccess().getContextsAssignment()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:76:1: ( rule__DomainModel__ContextsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:76:2: rule__DomainModel__ContextsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__DomainModel__ContextsAssignment_in_ruleDomainModel94);
            	    rule__DomainModel__ContextsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getDomainModelAccess().getContextsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDomainModel"


    // $ANTLR start "entryRuleContext"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:88:1: entryRuleContext : ruleContext EOF ;
    public final void entryRuleContext() throws RecognitionException {
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:89:1: ( ruleContext EOF )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:90:1: ruleContext EOF
            {
             before(grammarAccess.getContextRule()); 
            pushFollow(FOLLOW_ruleContext_in_entryRuleContext122);
            ruleContext();

            state._fsp--;

             after(grammarAccess.getContextRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContext129); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleContext"


    // $ANTLR start "ruleContext"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:97:1: ruleContext : ( ( rule__Context__Group__0 ) ) ;
    public final void ruleContext() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:101:2: ( ( ( rule__Context__Group__0 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:102:1: ( ( rule__Context__Group__0 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:102:1: ( ( rule__Context__Group__0 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:103:1: ( rule__Context__Group__0 )
            {
             before(grammarAccess.getContextAccess().getGroup()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:104:1: ( rule__Context__Group__0 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:104:2: rule__Context__Group__0
            {
            pushFollow(FOLLOW_rule__Context__Group__0_in_ruleContext155);
            rule__Context__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContextAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContext"


    // $ANTLR start "entryRuleNamespace"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:116:1: entryRuleNamespace : ruleNamespace EOF ;
    public final void entryRuleNamespace() throws RecognitionException {
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:117:1: ( ruleNamespace EOF )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:118:1: ruleNamespace EOF
            {
             before(grammarAccess.getNamespaceRule()); 
            pushFollow(FOLLOW_ruleNamespace_in_entryRuleNamespace182);
            ruleNamespace();

            state._fsp--;

             after(grammarAccess.getNamespaceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamespace189); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNamespace"


    // $ANTLR start "ruleNamespace"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:125:1: ruleNamespace : ( ( rule__Namespace__Group__0 ) ) ;
    public final void ruleNamespace() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:129:2: ( ( ( rule__Namespace__Group__0 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:130:1: ( ( rule__Namespace__Group__0 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:130:1: ( ( rule__Namespace__Group__0 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:131:1: ( rule__Namespace__Group__0 )
            {
             before(grammarAccess.getNamespaceAccess().getGroup()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:132:1: ( rule__Namespace__Group__0 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:132:2: rule__Namespace__Group__0
            {
            pushFollow(FOLLOW_rule__Namespace__Group__0_in_ruleNamespace215);
            rule__Namespace__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNamespaceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNamespace"


    // $ANTLR start "entryRuleImport"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:144:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:145:1: ( ruleImport EOF )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:146:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport242);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport249); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:153:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:157:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:158:1: ( ( rule__Import__Group__0 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:158:1: ( ( rule__Import__Group__0 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:159:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:160:1: ( rule__Import__Group__0 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:160:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport275);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleAbstractElement"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:172:1: entryRuleAbstractElement : ruleAbstractElement EOF ;
    public final void entryRuleAbstractElement() throws RecognitionException {
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:173:1: ( ruleAbstractElement EOF )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:174:1: ruleAbstractElement EOF
            {
             before(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement302);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getAbstractElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractElement309); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:181:1: ruleAbstractElement : ( ( rule__AbstractElement__Alternatives ) ) ;
    public final void ruleAbstractElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:185:2: ( ( ( rule__AbstractElement__Alternatives ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:186:1: ( ( rule__AbstractElement__Alternatives ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:186:1: ( ( rule__AbstractElement__Alternatives ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:187:1: ( rule__AbstractElement__Alternatives )
            {
             before(grammarAccess.getAbstractElementAccess().getAlternatives()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:188:1: ( rule__AbstractElement__Alternatives )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:188:2: rule__AbstractElement__Alternatives
            {
            pushFollow(FOLLOW_rule__AbstractElement__Alternatives_in_ruleAbstractElement335);
            rule__AbstractElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleCommand"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:200:1: entryRuleCommand : ruleCommand EOF ;
    public final void entryRuleCommand() throws RecognitionException {
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:201:1: ( ruleCommand EOF )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:202:1: ruleCommand EOF
            {
             before(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_ruleCommand_in_entryRuleCommand362);
            ruleCommand();

            state._fsp--;

             after(grammarAccess.getCommandRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommand369); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:209:1: ruleCommand : ( ( rule__Command__Group__0 ) ) ;
    public final void ruleCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:213:2: ( ( ( rule__Command__Group__0 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:214:1: ( ( rule__Command__Group__0 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:214:1: ( ( rule__Command__Group__0 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:215:1: ( rule__Command__Group__0 )
            {
             before(grammarAccess.getCommandAccess().getGroup()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:216:1: ( rule__Command__Group__0 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:216:2: rule__Command__Group__0
            {
            pushFollow(FOLLOW_rule__Command__Group__0_in_ruleCommand395);
            rule__Command__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCommandAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleCommandHandler"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:228:1: entryRuleCommandHandler : ruleCommandHandler EOF ;
    public final void entryRuleCommandHandler() throws RecognitionException {
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:229:1: ( ruleCommandHandler EOF )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:230:1: ruleCommandHandler EOF
            {
             before(grammarAccess.getCommandHandlerRule()); 
            pushFollow(FOLLOW_ruleCommandHandler_in_entryRuleCommandHandler422);
            ruleCommandHandler();

            state._fsp--;

             after(grammarAccess.getCommandHandlerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommandHandler429); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCommandHandler"


    // $ANTLR start "ruleCommandHandler"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:237:1: ruleCommandHandler : ( ( rule__CommandHandler__Group__0 ) ) ;
    public final void ruleCommandHandler() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:241:2: ( ( ( rule__CommandHandler__Group__0 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:242:1: ( ( rule__CommandHandler__Group__0 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:242:1: ( ( rule__CommandHandler__Group__0 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:243:1: ( rule__CommandHandler__Group__0 )
            {
             before(grammarAccess.getCommandHandlerAccess().getGroup()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:244:1: ( rule__CommandHandler__Group__0 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:244:2: rule__CommandHandler__Group__0
            {
            pushFollow(FOLLOW_rule__CommandHandler__Group__0_in_ruleCommandHandler455);
            rule__CommandHandler__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCommandHandlerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommandHandler"


    // $ANTLR start "entryRuleProjection"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:256:1: entryRuleProjection : ruleProjection EOF ;
    public final void entryRuleProjection() throws RecognitionException {
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:257:1: ( ruleProjection EOF )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:258:1: ruleProjection EOF
            {
             before(grammarAccess.getProjectionRule()); 
            pushFollow(FOLLOW_ruleProjection_in_entryRuleProjection482);
            ruleProjection();

            state._fsp--;

             after(grammarAccess.getProjectionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProjection489); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProjection"


    // $ANTLR start "ruleProjection"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:265:1: ruleProjection : ( ( rule__Projection__Group__0 ) ) ;
    public final void ruleProjection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:269:2: ( ( ( rule__Projection__Group__0 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:270:1: ( ( rule__Projection__Group__0 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:270:1: ( ( rule__Projection__Group__0 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:271:1: ( rule__Projection__Group__0 )
            {
             before(grammarAccess.getProjectionAccess().getGroup()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:272:1: ( rule__Projection__Group__0 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:272:2: rule__Projection__Group__0
            {
            pushFollow(FOLLOW_rule__Projection__Group__0_in_ruleProjection515);
            rule__Projection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProjectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProjection"


    // $ANTLR start "entryRuleView"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:284:1: entryRuleView : ruleView EOF ;
    public final void entryRuleView() throws RecognitionException {
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:285:1: ( ruleView EOF )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:286:1: ruleView EOF
            {
             before(grammarAccess.getViewRule()); 
            pushFollow(FOLLOW_ruleView_in_entryRuleView542);
            ruleView();

            state._fsp--;

             after(grammarAccess.getViewRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleView549); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleView"


    // $ANTLR start "ruleView"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:293:1: ruleView : ( ( rule__View__Group__0 ) ) ;
    public final void ruleView() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:297:2: ( ( ( rule__View__Group__0 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:298:1: ( ( rule__View__Group__0 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:298:1: ( ( rule__View__Group__0 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:299:1: ( rule__View__Group__0 )
            {
             before(grammarAccess.getViewAccess().getGroup()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:300:1: ( rule__View__Group__0 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:300:2: rule__View__Group__0
            {
            pushFollow(FOLLOW_rule__View__Group__0_in_ruleView575);
            rule__View__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getViewAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleView"


    // $ANTLR start "entryRuleTypeMetaInfo"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:312:1: entryRuleTypeMetaInfo : ruleTypeMetaInfo EOF ;
    public final void entryRuleTypeMetaInfo() throws RecognitionException {
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:313:1: ( ruleTypeMetaInfo EOF )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:314:1: ruleTypeMetaInfo EOF
            {
             before(grammarAccess.getTypeMetaInfoRule()); 
            pushFollow(FOLLOW_ruleTypeMetaInfo_in_entryRuleTypeMetaInfo602);
            ruleTypeMetaInfo();

            state._fsp--;

             after(grammarAccess.getTypeMetaInfoRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeMetaInfo609); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypeMetaInfo"


    // $ANTLR start "ruleTypeMetaInfo"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:321:1: ruleTypeMetaInfo : ( ( rule__TypeMetaInfo__Group__0 ) ) ;
    public final void ruleTypeMetaInfo() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:325:2: ( ( ( rule__TypeMetaInfo__Group__0 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:326:1: ( ( rule__TypeMetaInfo__Group__0 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:326:1: ( ( rule__TypeMetaInfo__Group__0 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:327:1: ( rule__TypeMetaInfo__Group__0 )
            {
             before(grammarAccess.getTypeMetaInfoAccess().getGroup()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:328:1: ( rule__TypeMetaInfo__Group__0 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:328:2: rule__TypeMetaInfo__Group__0
            {
            pushFollow(FOLLOW_rule__TypeMetaInfo__Group__0_in_ruleTypeMetaInfo635);
            rule__TypeMetaInfo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeMetaInfoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeMetaInfo"


    // $ANTLR start "entryRuleVariable"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:340:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:341:1: ( ruleVariable EOF )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:342:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable662);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable669); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:349:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:353:2: ( ( ( rule__Variable__Group__0 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:354:1: ( ( rule__Variable__Group__0 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:354:1: ( ( rule__Variable__Group__0 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:355:1: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:356:1: ( rule__Variable__Group__0 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:356:2: rule__Variable__Group__0
            {
            pushFollow(FOLLOW_rule__Variable__Group__0_in_ruleVariable695);
            rule__Variable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleInvariants"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:368:1: entryRuleInvariants : ruleInvariants EOF ;
    public final void entryRuleInvariants() throws RecognitionException {
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:369:1: ( ruleInvariants EOF )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:370:1: ruleInvariants EOF
            {
             before(grammarAccess.getInvariantsRule()); 
            pushFollow(FOLLOW_ruleInvariants_in_entryRuleInvariants722);
            ruleInvariants();

            state._fsp--;

             after(grammarAccess.getInvariantsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInvariants729); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInvariants"


    // $ANTLR start "ruleInvariants"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:377:1: ruleInvariants : ( ( rule__Invariants__Group__0 ) ) ;
    public final void ruleInvariants() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:381:2: ( ( ( rule__Invariants__Group__0 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:382:1: ( ( rule__Invariants__Group__0 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:382:1: ( ( rule__Invariants__Group__0 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:383:1: ( rule__Invariants__Group__0 )
            {
             before(grammarAccess.getInvariantsAccess().getGroup()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:384:1: ( rule__Invariants__Group__0 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:384:2: rule__Invariants__Group__0
            {
            pushFollow(FOLLOW_rule__Invariants__Group__0_in_ruleInvariants755);
            rule__Invariants__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInvariantsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInvariants"


    // $ANTLR start "entryRuleOverriddenTypeMetaInfo"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:396:1: entryRuleOverriddenTypeMetaInfo : ruleOverriddenTypeMetaInfo EOF ;
    public final void entryRuleOverriddenTypeMetaInfo() throws RecognitionException {
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:397:1: ( ruleOverriddenTypeMetaInfo EOF )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:398:1: ruleOverriddenTypeMetaInfo EOF
            {
             before(grammarAccess.getOverriddenTypeMetaInfoRule()); 
            pushFollow(FOLLOW_ruleOverriddenTypeMetaInfo_in_entryRuleOverriddenTypeMetaInfo782);
            ruleOverriddenTypeMetaInfo();

            state._fsp--;

             after(grammarAccess.getOverriddenTypeMetaInfoRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOverriddenTypeMetaInfo789); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOverriddenTypeMetaInfo"


    // $ANTLR start "ruleOverriddenTypeMetaInfo"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:405:1: ruleOverriddenTypeMetaInfo : ( ( rule__OverriddenTypeMetaInfo__Group__0 ) ) ;
    public final void ruleOverriddenTypeMetaInfo() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:409:2: ( ( ( rule__OverriddenTypeMetaInfo__Group__0 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:410:1: ( ( rule__OverriddenTypeMetaInfo__Group__0 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:410:1: ( ( rule__OverriddenTypeMetaInfo__Group__0 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:411:1: ( rule__OverriddenTypeMetaInfo__Group__0 )
            {
             before(grammarAccess.getOverriddenTypeMetaInfoAccess().getGroup()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:412:1: ( rule__OverriddenTypeMetaInfo__Group__0 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:412:2: rule__OverriddenTypeMetaInfo__Group__0
            {
            pushFollow(FOLLOW_rule__OverriddenTypeMetaInfo__Group__0_in_ruleOverriddenTypeMetaInfo815);
            rule__OverriddenTypeMetaInfo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOverriddenTypeMetaInfoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOverriddenTypeMetaInfo"


    // $ANTLR start "entryRuleConstraintCall"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:424:1: entryRuleConstraintCall : ruleConstraintCall EOF ;
    public final void entryRuleConstraintCall() throws RecognitionException {
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:425:1: ( ruleConstraintCall EOF )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:426:1: ruleConstraintCall EOF
            {
             before(grammarAccess.getConstraintCallRule()); 
            pushFollow(FOLLOW_ruleConstraintCall_in_entryRuleConstraintCall842);
            ruleConstraintCall();

            state._fsp--;

             after(grammarAccess.getConstraintCallRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraintCall849); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstraintCall"


    // $ANTLR start "ruleConstraintCall"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:433:1: ruleConstraintCall : ( ( rule__ConstraintCall__Group__0 ) ) ;
    public final void ruleConstraintCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:437:2: ( ( ( rule__ConstraintCall__Group__0 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:438:1: ( ( rule__ConstraintCall__Group__0 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:438:1: ( ( rule__ConstraintCall__Group__0 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:439:1: ( rule__ConstraintCall__Group__0 )
            {
             before(grammarAccess.getConstraintCallAccess().getGroup()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:440:1: ( rule__ConstraintCall__Group__0 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:440:2: rule__ConstraintCall__Group__0
            {
            pushFollow(FOLLOW_rule__ConstraintCall__Group__0_in_ruleConstraintCall875);
            rule__ConstraintCall__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstraintCallAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstraintCall"


    // $ANTLR start "entryRuleLiteral"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:452:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:453:1: ( ruleLiteral EOF )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:454:1: ruleLiteral EOF
            {
             before(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral902);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral909); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:461:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:465:2: ( ( ( rule__Literal__Alternatives ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:466:1: ( ( rule__Literal__Alternatives ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:466:1: ( ( rule__Literal__Alternatives ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:467:1: ( rule__Literal__Alternatives )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:468:1: ( rule__Literal__Alternatives )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:468:2: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_rule__Literal__Alternatives_in_ruleLiteral935);
            rule__Literal__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLiteralAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleBooleanLiteral"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:480:1: entryRuleBooleanLiteral : ruleBooleanLiteral EOF ;
    public final void entryRuleBooleanLiteral() throws RecognitionException {
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:481:1: ( ruleBooleanLiteral EOF )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:482:1: ruleBooleanLiteral EOF
            {
             before(grammarAccess.getBooleanLiteralRule()); 
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral962);
            ruleBooleanLiteral();

            state._fsp--;

             after(grammarAccess.getBooleanLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral969); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:489:1: ruleBooleanLiteral : ( ( rule__BooleanLiteral__Group__0 ) ) ;
    public final void ruleBooleanLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:493:2: ( ( ( rule__BooleanLiteral__Group__0 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:494:1: ( ( rule__BooleanLiteral__Group__0 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:494:1: ( ( rule__BooleanLiteral__Group__0 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:495:1: ( rule__BooleanLiteral__Group__0 )
            {
             before(grammarAccess.getBooleanLiteralAccess().getGroup()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:496:1: ( rule__BooleanLiteral__Group__0 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:496:2: rule__BooleanLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__BooleanLiteral__Group__0_in_ruleBooleanLiteral995);
            rule__BooleanLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanLiteralAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "entryRuleNullLiteral"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:508:1: entryRuleNullLiteral : ruleNullLiteral EOF ;
    public final void entryRuleNullLiteral() throws RecognitionException {
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:509:1: ( ruleNullLiteral EOF )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:510:1: ruleNullLiteral EOF
            {
             before(grammarAccess.getNullLiteralRule()); 
            pushFollow(FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral1022);
            ruleNullLiteral();

            state._fsp--;

             after(grammarAccess.getNullLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullLiteral1029); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNullLiteral"


    // $ANTLR start "ruleNullLiteral"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:517:1: ruleNullLiteral : ( ( rule__NullLiteral__Group__0 ) ) ;
    public final void ruleNullLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:521:2: ( ( ( rule__NullLiteral__Group__0 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:522:1: ( ( rule__NullLiteral__Group__0 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:522:1: ( ( rule__NullLiteral__Group__0 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:523:1: ( rule__NullLiteral__Group__0 )
            {
             before(grammarAccess.getNullLiteralAccess().getGroup()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:524:1: ( rule__NullLiteral__Group__0 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:524:2: rule__NullLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__NullLiteral__Group__0_in_ruleNullLiteral1055);
            rule__NullLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNullLiteralAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNullLiteral"


    // $ANTLR start "entryRuleNumberLiteral"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:536:1: entryRuleNumberLiteral : ruleNumberLiteral EOF ;
    public final void entryRuleNumberLiteral() throws RecognitionException {
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:537:1: ( ruleNumberLiteral EOF )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:538:1: ruleNumberLiteral EOF
            {
             before(grammarAccess.getNumberLiteralRule()); 
            pushFollow(FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral1082);
            ruleNumberLiteral();

            state._fsp--;

             after(grammarAccess.getNumberLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberLiteral1089); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumberLiteral"


    // $ANTLR start "ruleNumberLiteral"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:545:1: ruleNumberLiteral : ( ( rule__NumberLiteral__Group__0 ) ) ;
    public final void ruleNumberLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:549:2: ( ( ( rule__NumberLiteral__Group__0 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:550:1: ( ( rule__NumberLiteral__Group__0 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:550:1: ( ( rule__NumberLiteral__Group__0 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:551:1: ( rule__NumberLiteral__Group__0 )
            {
             before(grammarAccess.getNumberLiteralAccess().getGroup()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:552:1: ( rule__NumberLiteral__Group__0 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:552:2: rule__NumberLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__NumberLiteral__Group__0_in_ruleNumberLiteral1115);
            rule__NumberLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNumberLiteralAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumberLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:564:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:565:1: ( ruleStringLiteral EOF )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:566:1: ruleStringLiteral EOF
            {
             before(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1142);
            ruleStringLiteral();

            state._fsp--;

             after(grammarAccess.getStringLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral1149); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:573:1: ruleStringLiteral : ( ( rule__StringLiteral__Group__0 ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:577:2: ( ( ( rule__StringLiteral__Group__0 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:578:1: ( ( rule__StringLiteral__Group__0 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:578:1: ( ( rule__StringLiteral__Group__0 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:579:1: ( rule__StringLiteral__Group__0 )
            {
             before(grammarAccess.getStringLiteralAccess().getGroup()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:580:1: ( rule__StringLiteral__Group__0 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:580:2: rule__StringLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__StringLiteral__Group__0_in_ruleStringLiteral1175);
            rule__StringLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringLiteralAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleFQN"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:592:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:593:1: ( ruleFQN EOF )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:594:1: ruleFQN EOF
            {
             before(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN1202);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getFQNRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN1209); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:601:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:605:2: ( ( ( rule__FQN__Group__0 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:606:1: ( ( rule__FQN__Group__0 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:606:1: ( ( rule__FQN__Group__0 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:607:1: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:608:1: ( rule__FQN__Group__0 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:608:2: rule__FQN__Group__0
            {
            pushFollow(FOLLOW_rule__FQN__Group__0_in_ruleFQN1235);
            rule__FQN__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFQNAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleFQNWithWildcard"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:620:1: entryRuleFQNWithWildcard : ruleFQNWithWildcard EOF ;
    public final void entryRuleFQNWithWildcard() throws RecognitionException {
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:621:1: ( ruleFQNWithWildcard EOF )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:622:1: ruleFQNWithWildcard EOF
            {
             before(grammarAccess.getFQNWithWildcardRule()); 
            pushFollow(FOLLOW_ruleFQNWithWildcard_in_entryRuleFQNWithWildcard1262);
            ruleFQNWithWildcard();

            state._fsp--;

             after(grammarAccess.getFQNWithWildcardRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQNWithWildcard1269); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFQNWithWildcard"


    // $ANTLR start "ruleFQNWithWildcard"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:629:1: ruleFQNWithWildcard : ( ( rule__FQNWithWildcard__Group__0 ) ) ;
    public final void ruleFQNWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:633:2: ( ( ( rule__FQNWithWildcard__Group__0 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:634:1: ( ( rule__FQNWithWildcard__Group__0 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:634:1: ( ( rule__FQNWithWildcard__Group__0 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:635:1: ( rule__FQNWithWildcard__Group__0 )
            {
             before(grammarAccess.getFQNWithWildcardAccess().getGroup()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:636:1: ( rule__FQNWithWildcard__Group__0 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:636:2: rule__FQNWithWildcard__Group__0
            {
            pushFollow(FOLLOW_rule__FQNWithWildcard__Group__0_in_ruleFQNWithWildcard1295);
            rule__FQNWithWildcard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFQNWithWildcardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFQNWithWildcard"


    // $ANTLR start "entryRuleNumber"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:648:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:652:1: ( ruleNumber EOF )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:653:1: ruleNumber EOF
            {
             before(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber1327);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getNumberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber1334); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:663:1: ruleNumber : ( ( rule__Number__Alternatives ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:668:2: ( ( ( rule__Number__Alternatives ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:669:1: ( ( rule__Number__Alternatives ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:669:1: ( ( rule__Number__Alternatives ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:670:1: ( rule__Number__Alternatives )
            {
             before(grammarAccess.getNumberAccess().getAlternatives()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:671:1: ( rule__Number__Alternatives )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:671:2: rule__Number__Alternatives
            {
            pushFollow(FOLLOW_rule__Number__Alternatives_in_ruleNumber1364);
            rule__Number__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "rule__Import__ImportedNamespaceAlternatives_1_0"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:684:1: rule__Import__ImportedNamespaceAlternatives_1_0 : ( ( ruleFQN ) | ( ruleFQNWithWildcard ) );
    public final void rule__Import__ImportedNamespaceAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:688:1: ( ( ruleFQN ) | ( ruleFQNWithWildcard ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:689:1: ( ruleFQN )
                    {
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:689:1: ( ruleFQN )
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:690:1: ruleFQN
                    {
                     before(grammarAccess.getImportAccess().getImportedNamespaceFQNParserRuleCall_1_0_0()); 
                    pushFollow(FOLLOW_ruleFQN_in_rule__Import__ImportedNamespaceAlternatives_1_01400);
                    ruleFQN();

                    state._fsp--;

                     after(grammarAccess.getImportAccess().getImportedNamespaceFQNParserRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:695:6: ( ruleFQNWithWildcard )
                    {
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:695:6: ( ruleFQNWithWildcard )
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:696:1: ruleFQNWithWildcard
                    {
                     before(grammarAccess.getImportAccess().getImportedNamespaceFQNWithWildcardParserRuleCall_1_0_1()); 
                    pushFollow(FOLLOW_ruleFQNWithWildcard_in_rule__Import__ImportedNamespaceAlternatives_1_01417);
                    ruleFQNWithWildcard();

                    state._fsp--;

                     after(grammarAccess.getImportAccess().getImportedNamespaceFQNWithWildcardParserRuleCall_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportedNamespaceAlternatives_1_0"


    // $ANTLR start "rule__AbstractElement__Alternatives"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:706:1: rule__AbstractElement__Alternatives : ( ( ruleCommand ) | ( ruleCommandHandler ) | ( ruleProjection ) | ( ruleView ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:710:1: ( ( ruleCommand ) | ( ruleCommandHandler ) | ( ruleProjection ) | ( ruleView ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case RULE_DOC:
                {
                switch ( input.LA(2) ) {
                case 23:
                    {
                    alt3=2;
                    }
                    break;
                case 20:
                    {
                    alt3=1;
                    }
                    break;
                case 29:
                    {
                    alt3=4;
                    }
                    break;
                case 27:
                    {
                    alt3=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }

                }
                break;
            case 20:
                {
                alt3=1;
                }
                break;
            case 23:
                {
                alt3=2;
                }
                break;
            case 27:
                {
                alt3=3;
                }
                break;
            case 29:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:711:1: ( ruleCommand )
                    {
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:711:1: ( ruleCommand )
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:712:1: ruleCommand
                    {
                     before(grammarAccess.getAbstractElementAccess().getCommandParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleCommand_in_rule__AbstractElement__Alternatives1449);
                    ruleCommand();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getCommandParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:717:6: ( ruleCommandHandler )
                    {
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:717:6: ( ruleCommandHandler )
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:718:1: ruleCommandHandler
                    {
                     before(grammarAccess.getAbstractElementAccess().getCommandHandlerParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleCommandHandler_in_rule__AbstractElement__Alternatives1466);
                    ruleCommandHandler();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getCommandHandlerParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:723:6: ( ruleProjection )
                    {
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:723:6: ( ruleProjection )
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:724:1: ruleProjection
                    {
                     before(grammarAccess.getAbstractElementAccess().getProjectionParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleProjection_in_rule__AbstractElement__Alternatives1483);
                    ruleProjection();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getProjectionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:729:6: ( ruleView )
                    {
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:729:6: ( ruleView )
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:730:1: ruleView
                    {
                     before(grammarAccess.getAbstractElementAccess().getViewParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleView_in_rule__AbstractElement__Alternatives1500);
                    ruleView();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getViewParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractElement__Alternatives"


    // $ANTLR start "rule__Literal__Alternatives"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:740:1: rule__Literal__Alternatives : ( ( ruleNullLiteral ) | ( ruleBooleanLiteral ) | ( ruleNumberLiteral ) | ( ruleStringLiteral ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:744:1: ( ( ruleNullLiteral ) | ( ruleBooleanLiteral ) | ( ruleNumberLiteral ) | ( ruleStringLiteral ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt4=1;
                }
                break;
            case 13:
            case 14:
                {
                alt4=2;
                }
                break;
            case RULE_HEX:
            case RULE_INT:
            case RULE_DECIMAL:
                {
                alt4=3;
                }
                break;
            case RULE_STRING:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:745:1: ( ruleNullLiteral )
                    {
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:745:1: ( ruleNullLiteral )
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:746:1: ruleNullLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getNullLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleNullLiteral_in_rule__Literal__Alternatives1532);
                    ruleNullLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getNullLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:751:6: ( ruleBooleanLiteral )
                    {
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:751:6: ( ruleBooleanLiteral )
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:752:1: ruleBooleanLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_rule__Literal__Alternatives1549);
                    ruleBooleanLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:757:6: ( ruleNumberLiteral )
                    {
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:757:6: ( ruleNumberLiteral )
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:758:1: ruleNumberLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getNumberLiteralParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleNumberLiteral_in_rule__Literal__Alternatives1566);
                    ruleNumberLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getNumberLiteralParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:763:6: ( ruleStringLiteral )
                    {
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:763:6: ( ruleStringLiteral )
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:764:1: ruleStringLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleStringLiteral_in_rule__Literal__Alternatives1583);
                    ruleStringLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Alternatives"


    // $ANTLR start "rule__BooleanLiteral__ValueAlternatives_1_0"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:774:1: rule__BooleanLiteral__ValueAlternatives_1_0 : ( ( 'false' ) | ( 'true' ) );
    public final void rule__BooleanLiteral__ValueAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:778:1: ( ( 'false' ) | ( 'true' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            else if ( (LA5_0==14) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:779:1: ( 'false' )
                    {
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:779:1: ( 'false' )
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:780:1: 'false'
                    {
                     before(grammarAccess.getBooleanLiteralAccess().getValueFalseKeyword_1_0_0()); 
                    match(input,13,FOLLOW_13_in_rule__BooleanLiteral__ValueAlternatives_1_01616); 
                     after(grammarAccess.getBooleanLiteralAccess().getValueFalseKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:787:6: ( 'true' )
                    {
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:787:6: ( 'true' )
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:788:1: 'true'
                    {
                     before(grammarAccess.getBooleanLiteralAccess().getValueTrueKeyword_1_0_1()); 
                    match(input,14,FOLLOW_14_in_rule__BooleanLiteral__ValueAlternatives_1_01636); 
                     after(grammarAccess.getBooleanLiteralAccess().getValueTrueKeyword_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanLiteral__ValueAlternatives_1_0"


    // $ANTLR start "rule__Number__Alternatives"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:800:1: rule__Number__Alternatives : ( ( RULE_HEX ) | ( ( rule__Number__Group_1__0 ) ) );
    public final void rule__Number__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:804:1: ( ( RULE_HEX ) | ( ( rule__Number__Group_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_HEX) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=RULE_INT && LA6_0<=RULE_DECIMAL)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:805:1: ( RULE_HEX )
                    {
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:805:1: ( RULE_HEX )
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:806:1: RULE_HEX
                    {
                     before(grammarAccess.getNumberAccess().getHEXTerminalRuleCall_0()); 
                    match(input,RULE_HEX,FOLLOW_RULE_HEX_in_rule__Number__Alternatives1670); 
                     after(grammarAccess.getNumberAccess().getHEXTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:811:6: ( ( rule__Number__Group_1__0 ) )
                    {
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:811:6: ( ( rule__Number__Group_1__0 ) )
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:812:1: ( rule__Number__Group_1__0 )
                    {
                     before(grammarAccess.getNumberAccess().getGroup_1()); 
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:813:1: ( rule__Number__Group_1__0 )
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:813:2: rule__Number__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Number__Group_1__0_in_rule__Number__Alternatives1687);
                    rule__Number__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNumberAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Alternatives"


    // $ANTLR start "rule__Number__Alternatives_1_0"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:822:1: rule__Number__Alternatives_1_0 : ( ( RULE_INT ) | ( RULE_DECIMAL ) );
    public final void rule__Number__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:826:1: ( ( RULE_INT ) | ( RULE_DECIMAL ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_DECIMAL) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:827:1: ( RULE_INT )
                    {
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:827:1: ( RULE_INT )
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:828:1: RULE_INT
                    {
                     before(grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_0_0()); 
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Number__Alternatives_1_01720); 
                     after(grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:833:6: ( RULE_DECIMAL )
                    {
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:833:6: ( RULE_DECIMAL )
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:834:1: RULE_DECIMAL
                    {
                     before(grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_0_1()); 
                    match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_rule__Number__Alternatives_1_01737); 
                     after(grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Alternatives_1_0"


    // $ANTLR start "rule__Number__Alternatives_1_1_1"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:844:1: rule__Number__Alternatives_1_1_1 : ( ( RULE_INT ) | ( RULE_DECIMAL ) );
    public final void rule__Number__Alternatives_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:848:1: ( ( RULE_INT ) | ( RULE_DECIMAL ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_DECIMAL) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:849:1: ( RULE_INT )
                    {
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:849:1: ( RULE_INT )
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:850:1: RULE_INT
                    {
                     before(grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1_1_0()); 
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Number__Alternatives_1_1_11769); 
                     after(grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:855:6: ( RULE_DECIMAL )
                    {
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:855:6: ( RULE_DECIMAL )
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:856:1: RULE_DECIMAL
                    {
                     before(grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_1_1_1()); 
                    match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_rule__Number__Alternatives_1_1_11786); 
                     after(grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_1_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Alternatives_1_1_1"


    // $ANTLR start "rule__Context__Group__0"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:868:1: rule__Context__Group__0 : rule__Context__Group__0__Impl rule__Context__Group__1 ;
    public final void rule__Context__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:872:1: ( rule__Context__Group__0__Impl rule__Context__Group__1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:873:2: rule__Context__Group__0__Impl rule__Context__Group__1
            {
            pushFollow(FOLLOW_rule__Context__Group__0__Impl_in_rule__Context__Group__01816);
            rule__Context__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Context__Group__1_in_rule__Context__Group__01819);
            rule__Context__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__0"


    // $ANTLR start "rule__Context__Group__0__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:880:1: rule__Context__Group__0__Impl : ( 'context' ) ;
    public final void rule__Context__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:884:1: ( ( 'context' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:885:1: ( 'context' )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:885:1: ( 'context' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:886:1: 'context'
            {
             before(grammarAccess.getContextAccess().getContextKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Context__Group__0__Impl1847); 
             after(grammarAccess.getContextAccess().getContextKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__0__Impl"


    // $ANTLR start "rule__Context__Group__1"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:899:1: rule__Context__Group__1 : rule__Context__Group__1__Impl rule__Context__Group__2 ;
    public final void rule__Context__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:903:1: ( rule__Context__Group__1__Impl rule__Context__Group__2 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:904:2: rule__Context__Group__1__Impl rule__Context__Group__2
            {
            pushFollow(FOLLOW_rule__Context__Group__1__Impl_in_rule__Context__Group__11878);
            rule__Context__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Context__Group__2_in_rule__Context__Group__11881);
            rule__Context__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__1"


    // $ANTLR start "rule__Context__Group__1__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:911:1: rule__Context__Group__1__Impl : ( ( rule__Context__NameAssignment_1 ) ) ;
    public final void rule__Context__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:915:1: ( ( ( rule__Context__NameAssignment_1 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:916:1: ( ( rule__Context__NameAssignment_1 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:916:1: ( ( rule__Context__NameAssignment_1 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:917:1: ( rule__Context__NameAssignment_1 )
            {
             before(grammarAccess.getContextAccess().getNameAssignment_1()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:918:1: ( rule__Context__NameAssignment_1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:918:2: rule__Context__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Context__NameAssignment_1_in_rule__Context__Group__1__Impl1908);
            rule__Context__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getContextAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__1__Impl"


    // $ANTLR start "rule__Context__Group__2"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:928:1: rule__Context__Group__2 : rule__Context__Group__2__Impl rule__Context__Group__3 ;
    public final void rule__Context__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:932:1: ( rule__Context__Group__2__Impl rule__Context__Group__3 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:933:2: rule__Context__Group__2__Impl rule__Context__Group__3
            {
            pushFollow(FOLLOW_rule__Context__Group__2__Impl_in_rule__Context__Group__21938);
            rule__Context__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Context__Group__3_in_rule__Context__Group__21941);
            rule__Context__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__2"


    // $ANTLR start "rule__Context__Group__2__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:940:1: rule__Context__Group__2__Impl : ( '{' ) ;
    public final void rule__Context__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:944:1: ( ( '{' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:945:1: ( '{' )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:945:1: ( '{' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:946:1: '{'
            {
             before(grammarAccess.getContextAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__Context__Group__2__Impl1969); 
             after(grammarAccess.getContextAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__2__Impl"


    // $ANTLR start "rule__Context__Group__3"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:959:1: rule__Context__Group__3 : rule__Context__Group__3__Impl rule__Context__Group__4 ;
    public final void rule__Context__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:963:1: ( rule__Context__Group__3__Impl rule__Context__Group__4 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:964:2: rule__Context__Group__3__Impl rule__Context__Group__4
            {
            pushFollow(FOLLOW_rule__Context__Group__3__Impl_in_rule__Context__Group__32000);
            rule__Context__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Context__Group__4_in_rule__Context__Group__32003);
            rule__Context__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__3"


    // $ANTLR start "rule__Context__Group__3__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:971:1: rule__Context__Group__3__Impl : ( ( rule__Context__NamespacesAssignment_3 )* ) ;
    public final void rule__Context__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:975:1: ( ( ( rule__Context__NamespacesAssignment_3 )* ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:976:1: ( ( rule__Context__NamespacesAssignment_3 )* )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:976:1: ( ( rule__Context__NamespacesAssignment_3 )* )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:977:1: ( rule__Context__NamespacesAssignment_3 )*
            {
             before(grammarAccess.getContextAccess().getNamespacesAssignment_3()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:978:1: ( rule__Context__NamespacesAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==18) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:978:2: rule__Context__NamespacesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Context__NamespacesAssignment_3_in_rule__Context__Group__3__Impl2030);
            	    rule__Context__NamespacesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getContextAccess().getNamespacesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__3__Impl"


    // $ANTLR start "rule__Context__Group__4"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:988:1: rule__Context__Group__4 : rule__Context__Group__4__Impl ;
    public final void rule__Context__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:992:1: ( rule__Context__Group__4__Impl )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:993:2: rule__Context__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Context__Group__4__Impl_in_rule__Context__Group__42061);
            rule__Context__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__4"


    // $ANTLR start "rule__Context__Group__4__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:999:1: rule__Context__Group__4__Impl : ( '}' ) ;
    public final void rule__Context__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1003:1: ( ( '}' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1004:1: ( '}' )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1004:1: ( '}' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1005:1: '}'
            {
             before(grammarAccess.getContextAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_17_in_rule__Context__Group__4__Impl2089); 
             after(grammarAccess.getContextAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__4__Impl"


    // $ANTLR start "rule__Namespace__Group__0"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1028:1: rule__Namespace__Group__0 : rule__Namespace__Group__0__Impl rule__Namespace__Group__1 ;
    public final void rule__Namespace__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1032:1: ( rule__Namespace__Group__0__Impl rule__Namespace__Group__1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1033:2: rule__Namespace__Group__0__Impl rule__Namespace__Group__1
            {
            pushFollow(FOLLOW_rule__Namespace__Group__0__Impl_in_rule__Namespace__Group__02130);
            rule__Namespace__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Namespace__Group__1_in_rule__Namespace__Group__02133);
            rule__Namespace__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__0"


    // $ANTLR start "rule__Namespace__Group__0__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1040:1: rule__Namespace__Group__0__Impl : ( 'namespace' ) ;
    public final void rule__Namespace__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1044:1: ( ( 'namespace' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1045:1: ( 'namespace' )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1045:1: ( 'namespace' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1046:1: 'namespace'
            {
             before(grammarAccess.getNamespaceAccess().getNamespaceKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__Namespace__Group__0__Impl2161); 
             after(grammarAccess.getNamespaceAccess().getNamespaceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__0__Impl"


    // $ANTLR start "rule__Namespace__Group__1"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1059:1: rule__Namespace__Group__1 : rule__Namespace__Group__1__Impl rule__Namespace__Group__2 ;
    public final void rule__Namespace__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1063:1: ( rule__Namespace__Group__1__Impl rule__Namespace__Group__2 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1064:2: rule__Namespace__Group__1__Impl rule__Namespace__Group__2
            {
            pushFollow(FOLLOW_rule__Namespace__Group__1__Impl_in_rule__Namespace__Group__12192);
            rule__Namespace__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Namespace__Group__2_in_rule__Namespace__Group__12195);
            rule__Namespace__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__1"


    // $ANTLR start "rule__Namespace__Group__1__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1071:1: rule__Namespace__Group__1__Impl : ( ( rule__Namespace__NameAssignment_1 ) ) ;
    public final void rule__Namespace__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1075:1: ( ( ( rule__Namespace__NameAssignment_1 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1076:1: ( ( rule__Namespace__NameAssignment_1 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1076:1: ( ( rule__Namespace__NameAssignment_1 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1077:1: ( rule__Namespace__NameAssignment_1 )
            {
             before(grammarAccess.getNamespaceAccess().getNameAssignment_1()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1078:1: ( rule__Namespace__NameAssignment_1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1078:2: rule__Namespace__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Namespace__NameAssignment_1_in_rule__Namespace__Group__1__Impl2222);
            rule__Namespace__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNamespaceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__1__Impl"


    // $ANTLR start "rule__Namespace__Group__2"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1088:1: rule__Namespace__Group__2 : rule__Namespace__Group__2__Impl rule__Namespace__Group__3 ;
    public final void rule__Namespace__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1092:1: ( rule__Namespace__Group__2__Impl rule__Namespace__Group__3 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1093:2: rule__Namespace__Group__2__Impl rule__Namespace__Group__3
            {
            pushFollow(FOLLOW_rule__Namespace__Group__2__Impl_in_rule__Namespace__Group__22252);
            rule__Namespace__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Namespace__Group__3_in_rule__Namespace__Group__22255);
            rule__Namespace__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__2"


    // $ANTLR start "rule__Namespace__Group__2__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1100:1: rule__Namespace__Group__2__Impl : ( '{' ) ;
    public final void rule__Namespace__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1104:1: ( ( '{' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1105:1: ( '{' )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1105:1: ( '{' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1106:1: '{'
            {
             before(grammarAccess.getNamespaceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__Namespace__Group__2__Impl2283); 
             after(grammarAccess.getNamespaceAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__2__Impl"


    // $ANTLR start "rule__Namespace__Group__3"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1119:1: rule__Namespace__Group__3 : rule__Namespace__Group__3__Impl rule__Namespace__Group__4 ;
    public final void rule__Namespace__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1123:1: ( rule__Namespace__Group__3__Impl rule__Namespace__Group__4 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1124:2: rule__Namespace__Group__3__Impl rule__Namespace__Group__4
            {
            pushFollow(FOLLOW_rule__Namespace__Group__3__Impl_in_rule__Namespace__Group__32314);
            rule__Namespace__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Namespace__Group__4_in_rule__Namespace__Group__32317);
            rule__Namespace__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__3"


    // $ANTLR start "rule__Namespace__Group__3__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1131:1: rule__Namespace__Group__3__Impl : ( ( rule__Namespace__ImportsAssignment_3 )* ) ;
    public final void rule__Namespace__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1135:1: ( ( ( rule__Namespace__ImportsAssignment_3 )* ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1136:1: ( ( rule__Namespace__ImportsAssignment_3 )* )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1136:1: ( ( rule__Namespace__ImportsAssignment_3 )* )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1137:1: ( rule__Namespace__ImportsAssignment_3 )*
            {
             before(grammarAccess.getNamespaceAccess().getImportsAssignment_3()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1138:1: ( rule__Namespace__ImportsAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==19) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1138:2: rule__Namespace__ImportsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Namespace__ImportsAssignment_3_in_rule__Namespace__Group__3__Impl2344);
            	    rule__Namespace__ImportsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getNamespaceAccess().getImportsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__3__Impl"


    // $ANTLR start "rule__Namespace__Group__4"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1148:1: rule__Namespace__Group__4 : rule__Namespace__Group__4__Impl rule__Namespace__Group__5 ;
    public final void rule__Namespace__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1152:1: ( rule__Namespace__Group__4__Impl rule__Namespace__Group__5 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1153:2: rule__Namespace__Group__4__Impl rule__Namespace__Group__5
            {
            pushFollow(FOLLOW_rule__Namespace__Group__4__Impl_in_rule__Namespace__Group__42375);
            rule__Namespace__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Namespace__Group__5_in_rule__Namespace__Group__42378);
            rule__Namespace__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__4"


    // $ANTLR start "rule__Namespace__Group__4__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1160:1: rule__Namespace__Group__4__Impl : ( ( rule__Namespace__ElementsAssignment_4 )* ) ;
    public final void rule__Namespace__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1164:1: ( ( ( rule__Namespace__ElementsAssignment_4 )* ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1165:1: ( ( rule__Namespace__ElementsAssignment_4 )* )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1165:1: ( ( rule__Namespace__ElementsAssignment_4 )* )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1166:1: ( rule__Namespace__ElementsAssignment_4 )*
            {
             before(grammarAccess.getNamespaceAccess().getElementsAssignment_4()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1167:1: ( rule__Namespace__ElementsAssignment_4 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_DOC||LA11_0==20||LA11_0==23||LA11_0==27||LA11_0==29) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1167:2: rule__Namespace__ElementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Namespace__ElementsAssignment_4_in_rule__Namespace__Group__4__Impl2405);
            	    rule__Namespace__ElementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getNamespaceAccess().getElementsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__4__Impl"


    // $ANTLR start "rule__Namespace__Group__5"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1177:1: rule__Namespace__Group__5 : rule__Namespace__Group__5__Impl ;
    public final void rule__Namespace__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1181:1: ( rule__Namespace__Group__5__Impl )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1182:2: rule__Namespace__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Namespace__Group__5__Impl_in_rule__Namespace__Group__52436);
            rule__Namespace__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__5"


    // $ANTLR start "rule__Namespace__Group__5__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1188:1: rule__Namespace__Group__5__Impl : ( '}' ) ;
    public final void rule__Namespace__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1192:1: ( ( '}' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1193:1: ( '}' )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1193:1: ( '}' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1194:1: '}'
            {
             before(grammarAccess.getNamespaceAccess().getRightCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_17_in_rule__Namespace__Group__5__Impl2464); 
             after(grammarAccess.getNamespaceAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__5__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1219:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1223:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1224:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02507);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02510);
            rule__Import__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1231:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1235:1: ( ( 'import' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1236:1: ( 'import' )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1236:1: ( 'import' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1237:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Import__Group__0__Impl2538); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1250:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1254:1: ( rule__Import__Group__1__Impl )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1255:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12569);
            rule__Import__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1261:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1265:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1266:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1266:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1267:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1268:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1268:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl2596);
            rule__Import__ImportedNamespaceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__Command__Group__0"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1282:1: rule__Command__Group__0 : rule__Command__Group__0__Impl rule__Command__Group__1 ;
    public final void rule__Command__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1286:1: ( rule__Command__Group__0__Impl rule__Command__Group__1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1287:2: rule__Command__Group__0__Impl rule__Command__Group__1
            {
            pushFollow(FOLLOW_rule__Command__Group__0__Impl_in_rule__Command__Group__02630);
            rule__Command__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Command__Group__1_in_rule__Command__Group__02633);
            rule__Command__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group__0"


    // $ANTLR start "rule__Command__Group__0__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1294:1: rule__Command__Group__0__Impl : ( ( rule__Command__DocAssignment_0 )? ) ;
    public final void rule__Command__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1298:1: ( ( ( rule__Command__DocAssignment_0 )? ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1299:1: ( ( rule__Command__DocAssignment_0 )? )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1299:1: ( ( rule__Command__DocAssignment_0 )? )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1300:1: ( rule__Command__DocAssignment_0 )?
            {
             before(grammarAccess.getCommandAccess().getDocAssignment_0()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1301:1: ( rule__Command__DocAssignment_0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_DOC) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1301:2: rule__Command__DocAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Command__DocAssignment_0_in_rule__Command__Group__0__Impl2660);
                    rule__Command__DocAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCommandAccess().getDocAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group__0__Impl"


    // $ANTLR start "rule__Command__Group__1"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1311:1: rule__Command__Group__1 : rule__Command__Group__1__Impl rule__Command__Group__2 ;
    public final void rule__Command__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1315:1: ( rule__Command__Group__1__Impl rule__Command__Group__2 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1316:2: rule__Command__Group__1__Impl rule__Command__Group__2
            {
            pushFollow(FOLLOW_rule__Command__Group__1__Impl_in_rule__Command__Group__12691);
            rule__Command__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Command__Group__2_in_rule__Command__Group__12694);
            rule__Command__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group__1"


    // $ANTLR start "rule__Command__Group__1__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1323:1: rule__Command__Group__1__Impl : ( 'command' ) ;
    public final void rule__Command__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1327:1: ( ( 'command' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1328:1: ( 'command' )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1328:1: ( 'command' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1329:1: 'command'
            {
             before(grammarAccess.getCommandAccess().getCommandKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__Command__Group__1__Impl2722); 
             after(grammarAccess.getCommandAccess().getCommandKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group__1__Impl"


    // $ANTLR start "rule__Command__Group__2"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1342:1: rule__Command__Group__2 : rule__Command__Group__2__Impl rule__Command__Group__3 ;
    public final void rule__Command__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1346:1: ( rule__Command__Group__2__Impl rule__Command__Group__3 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1347:2: rule__Command__Group__2__Impl rule__Command__Group__3
            {
            pushFollow(FOLLOW_rule__Command__Group__2__Impl_in_rule__Command__Group__22753);
            rule__Command__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Command__Group__3_in_rule__Command__Group__22756);
            rule__Command__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group__2"


    // $ANTLR start "rule__Command__Group__2__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1354:1: rule__Command__Group__2__Impl : ( ( rule__Command__NameAssignment_2 ) ) ;
    public final void rule__Command__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1358:1: ( ( ( rule__Command__NameAssignment_2 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1359:1: ( ( rule__Command__NameAssignment_2 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1359:1: ( ( rule__Command__NameAssignment_2 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1360:1: ( rule__Command__NameAssignment_2 )
            {
             before(grammarAccess.getCommandAccess().getNameAssignment_2()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1361:1: ( rule__Command__NameAssignment_2 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1361:2: rule__Command__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Command__NameAssignment_2_in_rule__Command__Group__2__Impl2783);
            rule__Command__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCommandAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group__2__Impl"


    // $ANTLR start "rule__Command__Group__3"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1371:1: rule__Command__Group__3 : rule__Command__Group__3__Impl rule__Command__Group__4 ;
    public final void rule__Command__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1375:1: ( rule__Command__Group__3__Impl rule__Command__Group__4 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1376:2: rule__Command__Group__3__Impl rule__Command__Group__4
            {
            pushFollow(FOLLOW_rule__Command__Group__3__Impl_in_rule__Command__Group__32813);
            rule__Command__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Command__Group__4_in_rule__Command__Group__32816);
            rule__Command__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group__3"


    // $ANTLR start "rule__Command__Group__3__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1383:1: rule__Command__Group__3__Impl : ( ( rule__Command__Group_3__0 )? ) ;
    public final void rule__Command__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1387:1: ( ( ( rule__Command__Group_3__0 )? ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1388:1: ( ( rule__Command__Group_3__0 )? )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1388:1: ( ( rule__Command__Group_3__0 )? )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1389:1: ( rule__Command__Group_3__0 )?
            {
             before(grammarAccess.getCommandAccess().getGroup_3()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1390:1: ( rule__Command__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1390:2: rule__Command__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Command__Group_3__0_in_rule__Command__Group__3__Impl2843);
                    rule__Command__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCommandAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group__3__Impl"


    // $ANTLR start "rule__Command__Group__4"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1400:1: rule__Command__Group__4 : rule__Command__Group__4__Impl rule__Command__Group__5 ;
    public final void rule__Command__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1404:1: ( rule__Command__Group__4__Impl rule__Command__Group__5 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1405:2: rule__Command__Group__4__Impl rule__Command__Group__5
            {
            pushFollow(FOLLOW_rule__Command__Group__4__Impl_in_rule__Command__Group__42874);
            rule__Command__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Command__Group__5_in_rule__Command__Group__42877);
            rule__Command__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group__4"


    // $ANTLR start "rule__Command__Group__4__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1412:1: rule__Command__Group__4__Impl : ( '{' ) ;
    public final void rule__Command__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1416:1: ( ( '{' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1417:1: ( '{' )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1417:1: ( '{' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1418:1: '{'
            {
             before(grammarAccess.getCommandAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,16,FOLLOW_16_in_rule__Command__Group__4__Impl2905); 
             after(grammarAccess.getCommandAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group__4__Impl"


    // $ANTLR start "rule__Command__Group__5"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1431:1: rule__Command__Group__5 : rule__Command__Group__5__Impl rule__Command__Group__6 ;
    public final void rule__Command__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1435:1: ( rule__Command__Group__5__Impl rule__Command__Group__6 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1436:2: rule__Command__Group__5__Impl rule__Command__Group__6
            {
            pushFollow(FOLLOW_rule__Command__Group__5__Impl_in_rule__Command__Group__52936);
            rule__Command__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Command__Group__6_in_rule__Command__Group__52939);
            rule__Command__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group__5"


    // $ANTLR start "rule__Command__Group__5__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1443:1: rule__Command__Group__5__Impl : ( ( rule__Command__VariablesAssignment_5 )* ) ;
    public final void rule__Command__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1447:1: ( ( ( rule__Command__VariablesAssignment_5 )* ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1448:1: ( ( rule__Command__VariablesAssignment_5 )* )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1448:1: ( ( rule__Command__VariablesAssignment_5 )* )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1449:1: ( rule__Command__VariablesAssignment_5 )*
            {
             before(grammarAccess.getCommandAccess().getVariablesAssignment_5()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1450:1: ( rule__Command__VariablesAssignment_5 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_DOC)||LA14_0==40) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1450:2: rule__Command__VariablesAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Command__VariablesAssignment_5_in_rule__Command__Group__5__Impl2966);
            	    rule__Command__VariablesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getCommandAccess().getVariablesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group__5__Impl"


    // $ANTLR start "rule__Command__Group__6"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1460:1: rule__Command__Group__6 : rule__Command__Group__6__Impl rule__Command__Group__7 ;
    public final void rule__Command__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1464:1: ( rule__Command__Group__6__Impl rule__Command__Group__7 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1465:2: rule__Command__Group__6__Impl rule__Command__Group__7
            {
            pushFollow(FOLLOW_rule__Command__Group__6__Impl_in_rule__Command__Group__62997);
            rule__Command__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Command__Group__7_in_rule__Command__Group__63000);
            rule__Command__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group__6"


    // $ANTLR start "rule__Command__Group__6__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1472:1: rule__Command__Group__6__Impl : ( ( rule__Command__Group_6__0 )? ) ;
    public final void rule__Command__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1476:1: ( ( ( rule__Command__Group_6__0 )? ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1477:1: ( ( rule__Command__Group_6__0 )? )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1477:1: ( ( rule__Command__Group_6__0 )? )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1478:1: ( rule__Command__Group_6__0 )?
            {
             before(grammarAccess.getCommandAccess().getGroup_6()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1479:1: ( rule__Command__Group_6__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==22) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1479:2: rule__Command__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Command__Group_6__0_in_rule__Command__Group__6__Impl3027);
                    rule__Command__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCommandAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group__6__Impl"


    // $ANTLR start "rule__Command__Group__7"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1489:1: rule__Command__Group__7 : rule__Command__Group__7__Impl ;
    public final void rule__Command__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1493:1: ( rule__Command__Group__7__Impl )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1494:2: rule__Command__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Command__Group__7__Impl_in_rule__Command__Group__73058);
            rule__Command__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group__7"


    // $ANTLR start "rule__Command__Group__7__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1500:1: rule__Command__Group__7__Impl : ( '}' ) ;
    public final void rule__Command__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1504:1: ( ( '}' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1505:1: ( '}' )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1505:1: ( '}' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1506:1: '}'
            {
             before(grammarAccess.getCommandAccess().getRightCurlyBracketKeyword_7()); 
            match(input,17,FOLLOW_17_in_rule__Command__Group__7__Impl3086); 
             after(grammarAccess.getCommandAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group__7__Impl"


    // $ANTLR start "rule__Command__Group_3__0"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1535:1: rule__Command__Group_3__0 : rule__Command__Group_3__0__Impl rule__Command__Group_3__1 ;
    public final void rule__Command__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1539:1: ( rule__Command__Group_3__0__Impl rule__Command__Group_3__1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1540:2: rule__Command__Group_3__0__Impl rule__Command__Group_3__1
            {
            pushFollow(FOLLOW_rule__Command__Group_3__0__Impl_in_rule__Command__Group_3__03133);
            rule__Command__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Command__Group_3__1_in_rule__Command__Group_3__03136);
            rule__Command__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_3__0"


    // $ANTLR start "rule__Command__Group_3__0__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1547:1: rule__Command__Group_3__0__Impl : ( 'target' ) ;
    public final void rule__Command__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1551:1: ( ( 'target' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1552:1: ( 'target' )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1552:1: ( 'target' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1553:1: 'target'
            {
             before(grammarAccess.getCommandAccess().getTargetKeyword_3_0()); 
            match(input,21,FOLLOW_21_in_rule__Command__Group_3__0__Impl3164); 
             after(grammarAccess.getCommandAccess().getTargetKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_3__0__Impl"


    // $ANTLR start "rule__Command__Group_3__1"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1566:1: rule__Command__Group_3__1 : rule__Command__Group_3__1__Impl ;
    public final void rule__Command__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1570:1: ( rule__Command__Group_3__1__Impl )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1571:2: rule__Command__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Command__Group_3__1__Impl_in_rule__Command__Group_3__13195);
            rule__Command__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_3__1"


    // $ANTLR start "rule__Command__Group_3__1__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1577:1: rule__Command__Group_3__1__Impl : ( ( rule__Command__TargetAssignment_3_1 ) ) ;
    public final void rule__Command__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1581:1: ( ( ( rule__Command__TargetAssignment_3_1 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1582:1: ( ( rule__Command__TargetAssignment_3_1 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1582:1: ( ( rule__Command__TargetAssignment_3_1 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1583:1: ( rule__Command__TargetAssignment_3_1 )
            {
             before(grammarAccess.getCommandAccess().getTargetAssignment_3_1()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1584:1: ( rule__Command__TargetAssignment_3_1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1584:2: rule__Command__TargetAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Command__TargetAssignment_3_1_in_rule__Command__Group_3__1__Impl3222);
            rule__Command__TargetAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCommandAccess().getTargetAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_3__1__Impl"


    // $ANTLR start "rule__Command__Group_6__0"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1598:1: rule__Command__Group_6__0 : rule__Command__Group_6__0__Impl rule__Command__Group_6__1 ;
    public final void rule__Command__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1602:1: ( rule__Command__Group_6__0__Impl rule__Command__Group_6__1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1603:2: rule__Command__Group_6__0__Impl rule__Command__Group_6__1
            {
            pushFollow(FOLLOW_rule__Command__Group_6__0__Impl_in_rule__Command__Group_6__03256);
            rule__Command__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Command__Group_6__1_in_rule__Command__Group_6__03259);
            rule__Command__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_6__0"


    // $ANTLR start "rule__Command__Group_6__0__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1610:1: rule__Command__Group_6__0__Impl : ( 'message' ) ;
    public final void rule__Command__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1614:1: ( ( 'message' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1615:1: ( 'message' )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1615:1: ( 'message' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1616:1: 'message'
            {
             before(grammarAccess.getCommandAccess().getMessageKeyword_6_0()); 
            match(input,22,FOLLOW_22_in_rule__Command__Group_6__0__Impl3287); 
             after(grammarAccess.getCommandAccess().getMessageKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_6__0__Impl"


    // $ANTLR start "rule__Command__Group_6__1"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1629:1: rule__Command__Group_6__1 : rule__Command__Group_6__1__Impl ;
    public final void rule__Command__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1633:1: ( rule__Command__Group_6__1__Impl )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1634:2: rule__Command__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Command__Group_6__1__Impl_in_rule__Command__Group_6__13318);
            rule__Command__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_6__1"


    // $ANTLR start "rule__Command__Group_6__1__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1640:1: rule__Command__Group_6__1__Impl : ( ( rule__Command__MessageAssignment_6_1 ) ) ;
    public final void rule__Command__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1644:1: ( ( ( rule__Command__MessageAssignment_6_1 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1645:1: ( ( rule__Command__MessageAssignment_6_1 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1645:1: ( ( rule__Command__MessageAssignment_6_1 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1646:1: ( rule__Command__MessageAssignment_6_1 )
            {
             before(grammarAccess.getCommandAccess().getMessageAssignment_6_1()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1647:1: ( rule__Command__MessageAssignment_6_1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1647:2: rule__Command__MessageAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Command__MessageAssignment_6_1_in_rule__Command__Group_6__1__Impl3345);
            rule__Command__MessageAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getCommandAccess().getMessageAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_6__1__Impl"


    // $ANTLR start "rule__CommandHandler__Group__0"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1661:1: rule__CommandHandler__Group__0 : rule__CommandHandler__Group__0__Impl rule__CommandHandler__Group__1 ;
    public final void rule__CommandHandler__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1665:1: ( rule__CommandHandler__Group__0__Impl rule__CommandHandler__Group__1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1666:2: rule__CommandHandler__Group__0__Impl rule__CommandHandler__Group__1
            {
            pushFollow(FOLLOW_rule__CommandHandler__Group__0__Impl_in_rule__CommandHandler__Group__03379);
            rule__CommandHandler__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CommandHandler__Group__1_in_rule__CommandHandler__Group__03382);
            rule__CommandHandler__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandHandler__Group__0"


    // $ANTLR start "rule__CommandHandler__Group__0__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1673:1: rule__CommandHandler__Group__0__Impl : ( ( rule__CommandHandler__DocAssignment_0 )? ) ;
    public final void rule__CommandHandler__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1677:1: ( ( ( rule__CommandHandler__DocAssignment_0 )? ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1678:1: ( ( rule__CommandHandler__DocAssignment_0 )? )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1678:1: ( ( rule__CommandHandler__DocAssignment_0 )? )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1679:1: ( rule__CommandHandler__DocAssignment_0 )?
            {
             before(grammarAccess.getCommandHandlerAccess().getDocAssignment_0()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1680:1: ( rule__CommandHandler__DocAssignment_0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_DOC) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1680:2: rule__CommandHandler__DocAssignment_0
                    {
                    pushFollow(FOLLOW_rule__CommandHandler__DocAssignment_0_in_rule__CommandHandler__Group__0__Impl3409);
                    rule__CommandHandler__DocAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCommandHandlerAccess().getDocAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandHandler__Group__0__Impl"


    // $ANTLR start "rule__CommandHandler__Group__1"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1690:1: rule__CommandHandler__Group__1 : rule__CommandHandler__Group__1__Impl rule__CommandHandler__Group__2 ;
    public final void rule__CommandHandler__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1694:1: ( rule__CommandHandler__Group__1__Impl rule__CommandHandler__Group__2 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1695:2: rule__CommandHandler__Group__1__Impl rule__CommandHandler__Group__2
            {
            pushFollow(FOLLOW_rule__CommandHandler__Group__1__Impl_in_rule__CommandHandler__Group__13440);
            rule__CommandHandler__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CommandHandler__Group__2_in_rule__CommandHandler__Group__13443);
            rule__CommandHandler__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandHandler__Group__1"


    // $ANTLR start "rule__CommandHandler__Group__1__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1702:1: rule__CommandHandler__Group__1__Impl : ( 'command-handler' ) ;
    public final void rule__CommandHandler__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1706:1: ( ( 'command-handler' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1707:1: ( 'command-handler' )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1707:1: ( 'command-handler' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1708:1: 'command-handler'
            {
             before(grammarAccess.getCommandHandlerAccess().getCommandHandlerKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__CommandHandler__Group__1__Impl3471); 
             after(grammarAccess.getCommandHandlerAccess().getCommandHandlerKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandHandler__Group__1__Impl"


    // $ANTLR start "rule__CommandHandler__Group__2"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1721:1: rule__CommandHandler__Group__2 : rule__CommandHandler__Group__2__Impl rule__CommandHandler__Group__3 ;
    public final void rule__CommandHandler__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1725:1: ( rule__CommandHandler__Group__2__Impl rule__CommandHandler__Group__3 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1726:2: rule__CommandHandler__Group__2__Impl rule__CommandHandler__Group__3
            {
            pushFollow(FOLLOW_rule__CommandHandler__Group__2__Impl_in_rule__CommandHandler__Group__23502);
            rule__CommandHandler__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CommandHandler__Group__3_in_rule__CommandHandler__Group__23505);
            rule__CommandHandler__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandHandler__Group__2"


    // $ANTLR start "rule__CommandHandler__Group__2__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1733:1: rule__CommandHandler__Group__2__Impl : ( ( rule__CommandHandler__NameAssignment_2 ) ) ;
    public final void rule__CommandHandler__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1737:1: ( ( ( rule__CommandHandler__NameAssignment_2 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1738:1: ( ( rule__CommandHandler__NameAssignment_2 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1738:1: ( ( rule__CommandHandler__NameAssignment_2 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1739:1: ( rule__CommandHandler__NameAssignment_2 )
            {
             before(grammarAccess.getCommandHandlerAccess().getNameAssignment_2()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1740:1: ( rule__CommandHandler__NameAssignment_2 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1740:2: rule__CommandHandler__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__CommandHandler__NameAssignment_2_in_rule__CommandHandler__Group__2__Impl3532);
            rule__CommandHandler__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCommandHandlerAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandHandler__Group__2__Impl"


    // $ANTLR start "rule__CommandHandler__Group__3"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1750:1: rule__CommandHandler__Group__3 : rule__CommandHandler__Group__3__Impl rule__CommandHandler__Group__4 ;
    public final void rule__CommandHandler__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1754:1: ( rule__CommandHandler__Group__3__Impl rule__CommandHandler__Group__4 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1755:2: rule__CommandHandler__Group__3__Impl rule__CommandHandler__Group__4
            {
            pushFollow(FOLLOW_rule__CommandHandler__Group__3__Impl_in_rule__CommandHandler__Group__33562);
            rule__CommandHandler__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CommandHandler__Group__4_in_rule__CommandHandler__Group__33565);
            rule__CommandHandler__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandHandler__Group__3"


    // $ANTLR start "rule__CommandHandler__Group__3__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1762:1: rule__CommandHandler__Group__3__Impl : ( 'handles' ) ;
    public final void rule__CommandHandler__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1766:1: ( ( 'handles' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1767:1: ( 'handles' )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1767:1: ( 'handles' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1768:1: 'handles'
            {
             before(grammarAccess.getCommandHandlerAccess().getHandlesKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__CommandHandler__Group__3__Impl3593); 
             after(grammarAccess.getCommandHandlerAccess().getHandlesKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandHandler__Group__3__Impl"


    // $ANTLR start "rule__CommandHandler__Group__4"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1781:1: rule__CommandHandler__Group__4 : rule__CommandHandler__Group__4__Impl rule__CommandHandler__Group__5 ;
    public final void rule__CommandHandler__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1785:1: ( rule__CommandHandler__Group__4__Impl rule__CommandHandler__Group__5 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1786:2: rule__CommandHandler__Group__4__Impl rule__CommandHandler__Group__5
            {
            pushFollow(FOLLOW_rule__CommandHandler__Group__4__Impl_in_rule__CommandHandler__Group__43624);
            rule__CommandHandler__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CommandHandler__Group__5_in_rule__CommandHandler__Group__43627);
            rule__CommandHandler__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandHandler__Group__4"


    // $ANTLR start "rule__CommandHandler__Group__4__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1793:1: rule__CommandHandler__Group__4__Impl : ( ( rule__CommandHandler__CommandsAssignment_4 ) ) ;
    public final void rule__CommandHandler__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1797:1: ( ( ( rule__CommandHandler__CommandsAssignment_4 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1798:1: ( ( rule__CommandHandler__CommandsAssignment_4 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1798:1: ( ( rule__CommandHandler__CommandsAssignment_4 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1799:1: ( rule__CommandHandler__CommandsAssignment_4 )
            {
             before(grammarAccess.getCommandHandlerAccess().getCommandsAssignment_4()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1800:1: ( rule__CommandHandler__CommandsAssignment_4 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1800:2: rule__CommandHandler__CommandsAssignment_4
            {
            pushFollow(FOLLOW_rule__CommandHandler__CommandsAssignment_4_in_rule__CommandHandler__Group__4__Impl3654);
            rule__CommandHandler__CommandsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCommandHandlerAccess().getCommandsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandHandler__Group__4__Impl"


    // $ANTLR start "rule__CommandHandler__Group__5"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1810:1: rule__CommandHandler__Group__5 : rule__CommandHandler__Group__5__Impl rule__CommandHandler__Group__6 ;
    public final void rule__CommandHandler__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1814:1: ( rule__CommandHandler__Group__5__Impl rule__CommandHandler__Group__6 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1815:2: rule__CommandHandler__Group__5__Impl rule__CommandHandler__Group__6
            {
            pushFollow(FOLLOW_rule__CommandHandler__Group__5__Impl_in_rule__CommandHandler__Group__53684);
            rule__CommandHandler__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CommandHandler__Group__6_in_rule__CommandHandler__Group__53687);
            rule__CommandHandler__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandHandler__Group__5"


    // $ANTLR start "rule__CommandHandler__Group__5__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1822:1: rule__CommandHandler__Group__5__Impl : ( ( rule__CommandHandler__Group_5__0 )* ) ;
    public final void rule__CommandHandler__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1826:1: ( ( ( rule__CommandHandler__Group_5__0 )* ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1827:1: ( ( rule__CommandHandler__Group_5__0 )* )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1827:1: ( ( rule__CommandHandler__Group_5__0 )* )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1828:1: ( rule__CommandHandler__Group_5__0 )*
            {
             before(grammarAccess.getCommandHandlerAccess().getGroup_5()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1829:1: ( rule__CommandHandler__Group_5__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==25) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1829:2: rule__CommandHandler__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__CommandHandler__Group_5__0_in_rule__CommandHandler__Group__5__Impl3714);
            	    rule__CommandHandler__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getCommandHandlerAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandHandler__Group__5__Impl"


    // $ANTLR start "rule__CommandHandler__Group__6"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1839:1: rule__CommandHandler__Group__6 : rule__CommandHandler__Group__6__Impl ;
    public final void rule__CommandHandler__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1843:1: ( rule__CommandHandler__Group__6__Impl )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1844:2: rule__CommandHandler__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__CommandHandler__Group__6__Impl_in_rule__CommandHandler__Group__63745);
            rule__CommandHandler__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandHandler__Group__6"


    // $ANTLR start "rule__CommandHandler__Group__6__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1850:1: rule__CommandHandler__Group__6__Impl : ( ( rule__CommandHandler__Group_6__0 )? ) ;
    public final void rule__CommandHandler__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1854:1: ( ( ( rule__CommandHandler__Group_6__0 )? ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1855:1: ( ( rule__CommandHandler__Group_6__0 )? )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1855:1: ( ( rule__CommandHandler__Group_6__0 )? )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1856:1: ( rule__CommandHandler__Group_6__0 )?
            {
             before(grammarAccess.getCommandHandlerAccess().getGroup_6()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1857:1: ( rule__CommandHandler__Group_6__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==26) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1857:2: rule__CommandHandler__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__CommandHandler__Group_6__0_in_rule__CommandHandler__Group__6__Impl3772);
                    rule__CommandHandler__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCommandHandlerAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandHandler__Group__6__Impl"


    // $ANTLR start "rule__CommandHandler__Group_5__0"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1881:1: rule__CommandHandler__Group_5__0 : rule__CommandHandler__Group_5__0__Impl rule__CommandHandler__Group_5__1 ;
    public final void rule__CommandHandler__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1885:1: ( rule__CommandHandler__Group_5__0__Impl rule__CommandHandler__Group_5__1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1886:2: rule__CommandHandler__Group_5__0__Impl rule__CommandHandler__Group_5__1
            {
            pushFollow(FOLLOW_rule__CommandHandler__Group_5__0__Impl_in_rule__CommandHandler__Group_5__03817);
            rule__CommandHandler__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CommandHandler__Group_5__1_in_rule__CommandHandler__Group_5__03820);
            rule__CommandHandler__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandHandler__Group_5__0"


    // $ANTLR start "rule__CommandHandler__Group_5__0__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1893:1: rule__CommandHandler__Group_5__0__Impl : ( ',' ) ;
    public final void rule__CommandHandler__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1897:1: ( ( ',' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1898:1: ( ',' )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1898:1: ( ',' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1899:1: ','
            {
             before(grammarAccess.getCommandHandlerAccess().getCommaKeyword_5_0()); 
            match(input,25,FOLLOW_25_in_rule__CommandHandler__Group_5__0__Impl3848); 
             after(grammarAccess.getCommandHandlerAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandHandler__Group_5__0__Impl"


    // $ANTLR start "rule__CommandHandler__Group_5__1"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1912:1: rule__CommandHandler__Group_5__1 : rule__CommandHandler__Group_5__1__Impl ;
    public final void rule__CommandHandler__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1916:1: ( rule__CommandHandler__Group_5__1__Impl )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1917:2: rule__CommandHandler__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__CommandHandler__Group_5__1__Impl_in_rule__CommandHandler__Group_5__13879);
            rule__CommandHandler__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandHandler__Group_5__1"


    // $ANTLR start "rule__CommandHandler__Group_5__1__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1923:1: rule__CommandHandler__Group_5__1__Impl : ( ( rule__CommandHandler__CommandsAssignment_5_1 ) ) ;
    public final void rule__CommandHandler__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1927:1: ( ( ( rule__CommandHandler__CommandsAssignment_5_1 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1928:1: ( ( rule__CommandHandler__CommandsAssignment_5_1 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1928:1: ( ( rule__CommandHandler__CommandsAssignment_5_1 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1929:1: ( rule__CommandHandler__CommandsAssignment_5_1 )
            {
             before(grammarAccess.getCommandHandlerAccess().getCommandsAssignment_5_1()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1930:1: ( rule__CommandHandler__CommandsAssignment_5_1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1930:2: rule__CommandHandler__CommandsAssignment_5_1
            {
            pushFollow(FOLLOW_rule__CommandHandler__CommandsAssignment_5_1_in_rule__CommandHandler__Group_5__1__Impl3906);
            rule__CommandHandler__CommandsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getCommandHandlerAccess().getCommandsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandHandler__Group_5__1__Impl"


    // $ANTLR start "rule__CommandHandler__Group_6__0"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1944:1: rule__CommandHandler__Group_6__0 : rule__CommandHandler__Group_6__0__Impl rule__CommandHandler__Group_6__1 ;
    public final void rule__CommandHandler__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1948:1: ( rule__CommandHandler__Group_6__0__Impl rule__CommandHandler__Group_6__1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1949:2: rule__CommandHandler__Group_6__0__Impl rule__CommandHandler__Group_6__1
            {
            pushFollow(FOLLOW_rule__CommandHandler__Group_6__0__Impl_in_rule__CommandHandler__Group_6__03940);
            rule__CommandHandler__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CommandHandler__Group_6__1_in_rule__CommandHandler__Group_6__03943);
            rule__CommandHandler__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandHandler__Group_6__0"


    // $ANTLR start "rule__CommandHandler__Group_6__0__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1956:1: rule__CommandHandler__Group_6__0__Impl : ( 'uses' ) ;
    public final void rule__CommandHandler__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1960:1: ( ( 'uses' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1961:1: ( 'uses' )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1961:1: ( 'uses' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1962:1: 'uses'
            {
             before(grammarAccess.getCommandHandlerAccess().getUsesKeyword_6_0()); 
            match(input,26,FOLLOW_26_in_rule__CommandHandler__Group_6__0__Impl3971); 
             after(grammarAccess.getCommandHandlerAccess().getUsesKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandHandler__Group_6__0__Impl"


    // $ANTLR start "rule__CommandHandler__Group_6__1"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1975:1: rule__CommandHandler__Group_6__1 : rule__CommandHandler__Group_6__1__Impl rule__CommandHandler__Group_6__2 ;
    public final void rule__CommandHandler__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1979:1: ( rule__CommandHandler__Group_6__1__Impl rule__CommandHandler__Group_6__2 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1980:2: rule__CommandHandler__Group_6__1__Impl rule__CommandHandler__Group_6__2
            {
            pushFollow(FOLLOW_rule__CommandHandler__Group_6__1__Impl_in_rule__CommandHandler__Group_6__14002);
            rule__CommandHandler__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CommandHandler__Group_6__2_in_rule__CommandHandler__Group_6__14005);
            rule__CommandHandler__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandHandler__Group_6__1"


    // $ANTLR start "rule__CommandHandler__Group_6__1__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1987:1: rule__CommandHandler__Group_6__1__Impl : ( ( rule__CommandHandler__AggregatesAssignment_6_1 ) ) ;
    public final void rule__CommandHandler__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1991:1: ( ( ( rule__CommandHandler__AggregatesAssignment_6_1 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1992:1: ( ( rule__CommandHandler__AggregatesAssignment_6_1 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1992:1: ( ( rule__CommandHandler__AggregatesAssignment_6_1 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1993:1: ( rule__CommandHandler__AggregatesAssignment_6_1 )
            {
             before(grammarAccess.getCommandHandlerAccess().getAggregatesAssignment_6_1()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1994:1: ( rule__CommandHandler__AggregatesAssignment_6_1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1994:2: rule__CommandHandler__AggregatesAssignment_6_1
            {
            pushFollow(FOLLOW_rule__CommandHandler__AggregatesAssignment_6_1_in_rule__CommandHandler__Group_6__1__Impl4032);
            rule__CommandHandler__AggregatesAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getCommandHandlerAccess().getAggregatesAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandHandler__Group_6__1__Impl"


    // $ANTLR start "rule__CommandHandler__Group_6__2"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2004:1: rule__CommandHandler__Group_6__2 : rule__CommandHandler__Group_6__2__Impl ;
    public final void rule__CommandHandler__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2008:1: ( rule__CommandHandler__Group_6__2__Impl )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2009:2: rule__CommandHandler__Group_6__2__Impl
            {
            pushFollow(FOLLOW_rule__CommandHandler__Group_6__2__Impl_in_rule__CommandHandler__Group_6__24062);
            rule__CommandHandler__Group_6__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandHandler__Group_6__2"


    // $ANTLR start "rule__CommandHandler__Group_6__2__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2015:1: rule__CommandHandler__Group_6__2__Impl : ( ( rule__CommandHandler__Group_6_2__0 )* ) ;
    public final void rule__CommandHandler__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2019:1: ( ( ( rule__CommandHandler__Group_6_2__0 )* ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2020:1: ( ( rule__CommandHandler__Group_6_2__0 )* )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2020:1: ( ( rule__CommandHandler__Group_6_2__0 )* )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2021:1: ( rule__CommandHandler__Group_6_2__0 )*
            {
             before(grammarAccess.getCommandHandlerAccess().getGroup_6_2()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2022:1: ( rule__CommandHandler__Group_6_2__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==25) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2022:2: rule__CommandHandler__Group_6_2__0
            	    {
            	    pushFollow(FOLLOW_rule__CommandHandler__Group_6_2__0_in_rule__CommandHandler__Group_6__2__Impl4089);
            	    rule__CommandHandler__Group_6_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getCommandHandlerAccess().getGroup_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandHandler__Group_6__2__Impl"


    // $ANTLR start "rule__CommandHandler__Group_6_2__0"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2038:1: rule__CommandHandler__Group_6_2__0 : rule__CommandHandler__Group_6_2__0__Impl rule__CommandHandler__Group_6_2__1 ;
    public final void rule__CommandHandler__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2042:1: ( rule__CommandHandler__Group_6_2__0__Impl rule__CommandHandler__Group_6_2__1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2043:2: rule__CommandHandler__Group_6_2__0__Impl rule__CommandHandler__Group_6_2__1
            {
            pushFollow(FOLLOW_rule__CommandHandler__Group_6_2__0__Impl_in_rule__CommandHandler__Group_6_2__04126);
            rule__CommandHandler__Group_6_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CommandHandler__Group_6_2__1_in_rule__CommandHandler__Group_6_2__04129);
            rule__CommandHandler__Group_6_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandHandler__Group_6_2__0"


    // $ANTLR start "rule__CommandHandler__Group_6_2__0__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2050:1: rule__CommandHandler__Group_6_2__0__Impl : ( ',' ) ;
    public final void rule__CommandHandler__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2054:1: ( ( ',' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2055:1: ( ',' )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2055:1: ( ',' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2056:1: ','
            {
             before(grammarAccess.getCommandHandlerAccess().getCommaKeyword_6_2_0()); 
            match(input,25,FOLLOW_25_in_rule__CommandHandler__Group_6_2__0__Impl4157); 
             after(grammarAccess.getCommandHandlerAccess().getCommaKeyword_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandHandler__Group_6_2__0__Impl"


    // $ANTLR start "rule__CommandHandler__Group_6_2__1"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2069:1: rule__CommandHandler__Group_6_2__1 : rule__CommandHandler__Group_6_2__1__Impl ;
    public final void rule__CommandHandler__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2073:1: ( rule__CommandHandler__Group_6_2__1__Impl )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2074:2: rule__CommandHandler__Group_6_2__1__Impl
            {
            pushFollow(FOLLOW_rule__CommandHandler__Group_6_2__1__Impl_in_rule__CommandHandler__Group_6_2__14188);
            rule__CommandHandler__Group_6_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandHandler__Group_6_2__1"


    // $ANTLR start "rule__CommandHandler__Group_6_2__1__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2080:1: rule__CommandHandler__Group_6_2__1__Impl : ( ( rule__CommandHandler__AggregatesAssignment_6_2_1 ) ) ;
    public final void rule__CommandHandler__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2084:1: ( ( ( rule__CommandHandler__AggregatesAssignment_6_2_1 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2085:1: ( ( rule__CommandHandler__AggregatesAssignment_6_2_1 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2085:1: ( ( rule__CommandHandler__AggregatesAssignment_6_2_1 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2086:1: ( rule__CommandHandler__AggregatesAssignment_6_2_1 )
            {
             before(grammarAccess.getCommandHandlerAccess().getAggregatesAssignment_6_2_1()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2087:1: ( rule__CommandHandler__AggregatesAssignment_6_2_1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2087:2: rule__CommandHandler__AggregatesAssignment_6_2_1
            {
            pushFollow(FOLLOW_rule__CommandHandler__AggregatesAssignment_6_2_1_in_rule__CommandHandler__Group_6_2__1__Impl4215);
            rule__CommandHandler__AggregatesAssignment_6_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCommandHandlerAccess().getAggregatesAssignment_6_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandHandler__Group_6_2__1__Impl"


    // $ANTLR start "rule__Projection__Group__0"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2101:1: rule__Projection__Group__0 : rule__Projection__Group__0__Impl rule__Projection__Group__1 ;
    public final void rule__Projection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2105:1: ( rule__Projection__Group__0__Impl rule__Projection__Group__1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2106:2: rule__Projection__Group__0__Impl rule__Projection__Group__1
            {
            pushFollow(FOLLOW_rule__Projection__Group__0__Impl_in_rule__Projection__Group__04249);
            rule__Projection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Projection__Group__1_in_rule__Projection__Group__04252);
            rule__Projection__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Projection__Group__0"


    // $ANTLR start "rule__Projection__Group__0__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2113:1: rule__Projection__Group__0__Impl : ( ( rule__Projection__DocAssignment_0 )? ) ;
    public final void rule__Projection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2117:1: ( ( ( rule__Projection__DocAssignment_0 )? ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2118:1: ( ( rule__Projection__DocAssignment_0 )? )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2118:1: ( ( rule__Projection__DocAssignment_0 )? )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2119:1: ( rule__Projection__DocAssignment_0 )?
            {
             before(grammarAccess.getProjectionAccess().getDocAssignment_0()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2120:1: ( rule__Projection__DocAssignment_0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_DOC) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2120:2: rule__Projection__DocAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Projection__DocAssignment_0_in_rule__Projection__Group__0__Impl4279);
                    rule__Projection__DocAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProjectionAccess().getDocAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Projection__Group__0__Impl"


    // $ANTLR start "rule__Projection__Group__1"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2130:1: rule__Projection__Group__1 : rule__Projection__Group__1__Impl rule__Projection__Group__2 ;
    public final void rule__Projection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2134:1: ( rule__Projection__Group__1__Impl rule__Projection__Group__2 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2135:2: rule__Projection__Group__1__Impl rule__Projection__Group__2
            {
            pushFollow(FOLLOW_rule__Projection__Group__1__Impl_in_rule__Projection__Group__14310);
            rule__Projection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Projection__Group__2_in_rule__Projection__Group__14313);
            rule__Projection__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Projection__Group__1"


    // $ANTLR start "rule__Projection__Group__1__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2142:1: rule__Projection__Group__1__Impl : ( 'projection' ) ;
    public final void rule__Projection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2146:1: ( ( 'projection' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2147:1: ( 'projection' )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2147:1: ( 'projection' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2148:1: 'projection'
            {
             before(grammarAccess.getProjectionAccess().getProjectionKeyword_1()); 
            match(input,27,FOLLOW_27_in_rule__Projection__Group__1__Impl4341); 
             after(grammarAccess.getProjectionAccess().getProjectionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Projection__Group__1__Impl"


    // $ANTLR start "rule__Projection__Group__2"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2161:1: rule__Projection__Group__2 : rule__Projection__Group__2__Impl rule__Projection__Group__3 ;
    public final void rule__Projection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2165:1: ( rule__Projection__Group__2__Impl rule__Projection__Group__3 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2166:2: rule__Projection__Group__2__Impl rule__Projection__Group__3
            {
            pushFollow(FOLLOW_rule__Projection__Group__2__Impl_in_rule__Projection__Group__24372);
            rule__Projection__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Projection__Group__3_in_rule__Projection__Group__24375);
            rule__Projection__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Projection__Group__2"


    // $ANTLR start "rule__Projection__Group__2__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2173:1: rule__Projection__Group__2__Impl : ( ( rule__Projection__NameAssignment_2 ) ) ;
    public final void rule__Projection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2177:1: ( ( ( rule__Projection__NameAssignment_2 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2178:1: ( ( rule__Projection__NameAssignment_2 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2178:1: ( ( rule__Projection__NameAssignment_2 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2179:1: ( rule__Projection__NameAssignment_2 )
            {
             before(grammarAccess.getProjectionAccess().getNameAssignment_2()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2180:1: ( rule__Projection__NameAssignment_2 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2180:2: rule__Projection__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Projection__NameAssignment_2_in_rule__Projection__Group__2__Impl4402);
            rule__Projection__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getProjectionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Projection__Group__2__Impl"


    // $ANTLR start "rule__Projection__Group__3"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2190:1: rule__Projection__Group__3 : rule__Projection__Group__3__Impl ;
    public final void rule__Projection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2194:1: ( rule__Projection__Group__3__Impl )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2195:2: rule__Projection__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Projection__Group__3__Impl_in_rule__Projection__Group__34432);
            rule__Projection__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Projection__Group__3"


    // $ANTLR start "rule__Projection__Group__3__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2201:1: rule__Projection__Group__3__Impl : ( ( rule__Projection__Group_3__0 )? ) ;
    public final void rule__Projection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2205:1: ( ( ( rule__Projection__Group_3__0 )? ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2206:1: ( ( rule__Projection__Group_3__0 )? )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2206:1: ( ( rule__Projection__Group_3__0 )? )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2207:1: ( rule__Projection__Group_3__0 )?
            {
             before(grammarAccess.getProjectionAccess().getGroup_3()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2208:1: ( rule__Projection__Group_3__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==28) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2208:2: rule__Projection__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Projection__Group_3__0_in_rule__Projection__Group__3__Impl4459);
                    rule__Projection__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProjectionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Projection__Group__3__Impl"


    // $ANTLR start "rule__Projection__Group_3__0"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2226:1: rule__Projection__Group_3__0 : rule__Projection__Group_3__0__Impl rule__Projection__Group_3__1 ;
    public final void rule__Projection__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2230:1: ( rule__Projection__Group_3__0__Impl rule__Projection__Group_3__1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2231:2: rule__Projection__Group_3__0__Impl rule__Projection__Group_3__1
            {
            pushFollow(FOLLOW_rule__Projection__Group_3__0__Impl_in_rule__Projection__Group_3__04498);
            rule__Projection__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Projection__Group_3__1_in_rule__Projection__Group_3__04501);
            rule__Projection__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Projection__Group_3__0"


    // $ANTLR start "rule__Projection__Group_3__0__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2238:1: rule__Projection__Group_3__0__Impl : ( 'input' ) ;
    public final void rule__Projection__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2242:1: ( ( 'input' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2243:1: ( 'input' )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2243:1: ( 'input' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2244:1: 'input'
            {
             before(grammarAccess.getProjectionAccess().getInputKeyword_3_0()); 
            match(input,28,FOLLOW_28_in_rule__Projection__Group_3__0__Impl4529); 
             after(grammarAccess.getProjectionAccess().getInputKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Projection__Group_3__0__Impl"


    // $ANTLR start "rule__Projection__Group_3__1"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2257:1: rule__Projection__Group_3__1 : rule__Projection__Group_3__1__Impl rule__Projection__Group_3__2 ;
    public final void rule__Projection__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2261:1: ( rule__Projection__Group_3__1__Impl rule__Projection__Group_3__2 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2262:2: rule__Projection__Group_3__1__Impl rule__Projection__Group_3__2
            {
            pushFollow(FOLLOW_rule__Projection__Group_3__1__Impl_in_rule__Projection__Group_3__14560);
            rule__Projection__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Projection__Group_3__2_in_rule__Projection__Group_3__14563);
            rule__Projection__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Projection__Group_3__1"


    // $ANTLR start "rule__Projection__Group_3__1__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2269:1: rule__Projection__Group_3__1__Impl : ( ( rule__Projection__EventsAssignment_3_1 ) ) ;
    public final void rule__Projection__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2273:1: ( ( ( rule__Projection__EventsAssignment_3_1 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2274:1: ( ( rule__Projection__EventsAssignment_3_1 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2274:1: ( ( rule__Projection__EventsAssignment_3_1 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2275:1: ( rule__Projection__EventsAssignment_3_1 )
            {
             before(grammarAccess.getProjectionAccess().getEventsAssignment_3_1()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2276:1: ( rule__Projection__EventsAssignment_3_1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2276:2: rule__Projection__EventsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Projection__EventsAssignment_3_1_in_rule__Projection__Group_3__1__Impl4590);
            rule__Projection__EventsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getProjectionAccess().getEventsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Projection__Group_3__1__Impl"


    // $ANTLR start "rule__Projection__Group_3__2"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2286:1: rule__Projection__Group_3__2 : rule__Projection__Group_3__2__Impl ;
    public final void rule__Projection__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2290:1: ( rule__Projection__Group_3__2__Impl )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2291:2: rule__Projection__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Projection__Group_3__2__Impl_in_rule__Projection__Group_3__24620);
            rule__Projection__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Projection__Group_3__2"


    // $ANTLR start "rule__Projection__Group_3__2__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2297:1: rule__Projection__Group_3__2__Impl : ( ( rule__Projection__Group_3_2__0 )* ) ;
    public final void rule__Projection__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2301:1: ( ( ( rule__Projection__Group_3_2__0 )* ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2302:1: ( ( rule__Projection__Group_3_2__0 )* )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2302:1: ( ( rule__Projection__Group_3_2__0 )* )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2303:1: ( rule__Projection__Group_3_2__0 )*
            {
             before(grammarAccess.getProjectionAccess().getGroup_3_2()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2304:1: ( rule__Projection__Group_3_2__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==25) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2304:2: rule__Projection__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Projection__Group_3_2__0_in_rule__Projection__Group_3__2__Impl4647);
            	    rule__Projection__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getProjectionAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Projection__Group_3__2__Impl"


    // $ANTLR start "rule__Projection__Group_3_2__0"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2320:1: rule__Projection__Group_3_2__0 : rule__Projection__Group_3_2__0__Impl rule__Projection__Group_3_2__1 ;
    public final void rule__Projection__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2324:1: ( rule__Projection__Group_3_2__0__Impl rule__Projection__Group_3_2__1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2325:2: rule__Projection__Group_3_2__0__Impl rule__Projection__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__Projection__Group_3_2__0__Impl_in_rule__Projection__Group_3_2__04684);
            rule__Projection__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Projection__Group_3_2__1_in_rule__Projection__Group_3_2__04687);
            rule__Projection__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Projection__Group_3_2__0"


    // $ANTLR start "rule__Projection__Group_3_2__0__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2332:1: rule__Projection__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__Projection__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2336:1: ( ( ',' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2337:1: ( ',' )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2337:1: ( ',' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2338:1: ','
            {
             before(grammarAccess.getProjectionAccess().getCommaKeyword_3_2_0()); 
            match(input,25,FOLLOW_25_in_rule__Projection__Group_3_2__0__Impl4715); 
             after(grammarAccess.getProjectionAccess().getCommaKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Projection__Group_3_2__0__Impl"


    // $ANTLR start "rule__Projection__Group_3_2__1"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2351:1: rule__Projection__Group_3_2__1 : rule__Projection__Group_3_2__1__Impl ;
    public final void rule__Projection__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2355:1: ( rule__Projection__Group_3_2__1__Impl )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2356:2: rule__Projection__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Projection__Group_3_2__1__Impl_in_rule__Projection__Group_3_2__14746);
            rule__Projection__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Projection__Group_3_2__1"


    // $ANTLR start "rule__Projection__Group_3_2__1__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2362:1: rule__Projection__Group_3_2__1__Impl : ( ( rule__Projection__EventsAssignment_3_2_1 ) ) ;
    public final void rule__Projection__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2366:1: ( ( ( rule__Projection__EventsAssignment_3_2_1 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2367:1: ( ( rule__Projection__EventsAssignment_3_2_1 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2367:1: ( ( rule__Projection__EventsAssignment_3_2_1 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2368:1: ( rule__Projection__EventsAssignment_3_2_1 )
            {
             before(grammarAccess.getProjectionAccess().getEventsAssignment_3_2_1()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2369:1: ( rule__Projection__EventsAssignment_3_2_1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2369:2: rule__Projection__EventsAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__Projection__EventsAssignment_3_2_1_in_rule__Projection__Group_3_2__1__Impl4773);
            rule__Projection__EventsAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getProjectionAccess().getEventsAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Projection__Group_3_2__1__Impl"


    // $ANTLR start "rule__View__Group__0"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2383:1: rule__View__Group__0 : rule__View__Group__0__Impl rule__View__Group__1 ;
    public final void rule__View__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2387:1: ( rule__View__Group__0__Impl rule__View__Group__1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2388:2: rule__View__Group__0__Impl rule__View__Group__1
            {
            pushFollow(FOLLOW_rule__View__Group__0__Impl_in_rule__View__Group__04807);
            rule__View__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__View__Group__1_in_rule__View__Group__04810);
            rule__View__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__0"


    // $ANTLR start "rule__View__Group__0__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2395:1: rule__View__Group__0__Impl : ( ( rule__View__DocAssignment_0 )? ) ;
    public final void rule__View__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2399:1: ( ( ( rule__View__DocAssignment_0 )? ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2400:1: ( ( rule__View__DocAssignment_0 )? )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2400:1: ( ( rule__View__DocAssignment_0 )? )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2401:1: ( rule__View__DocAssignment_0 )?
            {
             before(grammarAccess.getViewAccess().getDocAssignment_0()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2402:1: ( rule__View__DocAssignment_0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_DOC) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2402:2: rule__View__DocAssignment_0
                    {
                    pushFollow(FOLLOW_rule__View__DocAssignment_0_in_rule__View__Group__0__Impl4837);
                    rule__View__DocAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getViewAccess().getDocAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__0__Impl"


    // $ANTLR start "rule__View__Group__1"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2412:1: rule__View__Group__1 : rule__View__Group__1__Impl rule__View__Group__2 ;
    public final void rule__View__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2416:1: ( rule__View__Group__1__Impl rule__View__Group__2 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2417:2: rule__View__Group__1__Impl rule__View__Group__2
            {
            pushFollow(FOLLOW_rule__View__Group__1__Impl_in_rule__View__Group__14868);
            rule__View__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__View__Group__2_in_rule__View__Group__14871);
            rule__View__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__1"


    // $ANTLR start "rule__View__Group__1__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2424:1: rule__View__Group__1__Impl : ( 'view' ) ;
    public final void rule__View__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2428:1: ( ( 'view' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2429:1: ( 'view' )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2429:1: ( 'view' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2430:1: 'view'
            {
             before(grammarAccess.getViewAccess().getViewKeyword_1()); 
            match(input,29,FOLLOW_29_in_rule__View__Group__1__Impl4899); 
             after(grammarAccess.getViewAccess().getViewKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__1__Impl"


    // $ANTLR start "rule__View__Group__2"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2443:1: rule__View__Group__2 : rule__View__Group__2__Impl rule__View__Group__3 ;
    public final void rule__View__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2447:1: ( rule__View__Group__2__Impl rule__View__Group__3 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2448:2: rule__View__Group__2__Impl rule__View__Group__3
            {
            pushFollow(FOLLOW_rule__View__Group__2__Impl_in_rule__View__Group__24930);
            rule__View__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__View__Group__3_in_rule__View__Group__24933);
            rule__View__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__2"


    // $ANTLR start "rule__View__Group__2__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2455:1: rule__View__Group__2__Impl : ( ( rule__View__NameAssignment_2 ) ) ;
    public final void rule__View__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2459:1: ( ( ( rule__View__NameAssignment_2 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2460:1: ( ( rule__View__NameAssignment_2 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2460:1: ( ( rule__View__NameAssignment_2 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2461:1: ( rule__View__NameAssignment_2 )
            {
             before(grammarAccess.getViewAccess().getNameAssignment_2()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2462:1: ( rule__View__NameAssignment_2 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2462:2: rule__View__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__View__NameAssignment_2_in_rule__View__Group__2__Impl4960);
            rule__View__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getViewAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__2__Impl"


    // $ANTLR start "rule__View__Group__3"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2472:1: rule__View__Group__3 : rule__View__Group__3__Impl rule__View__Group__4 ;
    public final void rule__View__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2476:1: ( rule__View__Group__3__Impl rule__View__Group__4 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2477:2: rule__View__Group__3__Impl rule__View__Group__4
            {
            pushFollow(FOLLOW_rule__View__Group__3__Impl_in_rule__View__Group__34990);
            rule__View__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__View__Group__4_in_rule__View__Group__34993);
            rule__View__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__3"


    // $ANTLR start "rule__View__Group__3__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2484:1: rule__View__Group__3__Impl : ( 'uses' ) ;
    public final void rule__View__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2488:1: ( ( 'uses' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2489:1: ( 'uses' )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2489:1: ( 'uses' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2490:1: 'uses'
            {
             before(grammarAccess.getViewAccess().getUsesKeyword_3()); 
            match(input,26,FOLLOW_26_in_rule__View__Group__3__Impl5021); 
             after(grammarAccess.getViewAccess().getUsesKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__3__Impl"


    // $ANTLR start "rule__View__Group__4"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2503:1: rule__View__Group__4 : rule__View__Group__4__Impl ;
    public final void rule__View__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2507:1: ( rule__View__Group__4__Impl )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2508:2: rule__View__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__View__Group__4__Impl_in_rule__View__Group__45052);
            rule__View__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__4"


    // $ANTLR start "rule__View__Group__4__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2514:1: rule__View__Group__4__Impl : ( ( rule__View__ProjectionAssignment_4 ) ) ;
    public final void rule__View__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2518:1: ( ( ( rule__View__ProjectionAssignment_4 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2519:1: ( ( rule__View__ProjectionAssignment_4 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2519:1: ( ( rule__View__ProjectionAssignment_4 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2520:1: ( rule__View__ProjectionAssignment_4 )
            {
             before(grammarAccess.getViewAccess().getProjectionAssignment_4()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2521:1: ( rule__View__ProjectionAssignment_4 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2521:2: rule__View__ProjectionAssignment_4
            {
            pushFollow(FOLLOW_rule__View__ProjectionAssignment_4_in_rule__View__Group__4__Impl5079);
            rule__View__ProjectionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getViewAccess().getProjectionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__4__Impl"


    // $ANTLR start "rule__TypeMetaInfo__Group__0"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2541:1: rule__TypeMetaInfo__Group__0 : rule__TypeMetaInfo__Group__0__Impl rule__TypeMetaInfo__Group__1 ;
    public final void rule__TypeMetaInfo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2545:1: ( rule__TypeMetaInfo__Group__0__Impl rule__TypeMetaInfo__Group__1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2546:2: rule__TypeMetaInfo__Group__0__Impl rule__TypeMetaInfo__Group__1
            {
            pushFollow(FOLLOW_rule__TypeMetaInfo__Group__0__Impl_in_rule__TypeMetaInfo__Group__05119);
            rule__TypeMetaInfo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeMetaInfo__Group__1_in_rule__TypeMetaInfo__Group__05122);
            rule__TypeMetaInfo__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMetaInfo__Group__0"


    // $ANTLR start "rule__TypeMetaInfo__Group__0__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2553:1: rule__TypeMetaInfo__Group__0__Impl : ( () ) ;
    public final void rule__TypeMetaInfo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2557:1: ( ( () ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2558:1: ( () )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2558:1: ( () )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2559:1: ()
            {
             before(grammarAccess.getTypeMetaInfoAccess().getTypeMetaInfoAction_0()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2560:1: ()
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2562:1: 
            {
            }

             after(grammarAccess.getTypeMetaInfoAccess().getTypeMetaInfoAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMetaInfo__Group__0__Impl"


    // $ANTLR start "rule__TypeMetaInfo__Group__1"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2572:1: rule__TypeMetaInfo__Group__1 : rule__TypeMetaInfo__Group__1__Impl rule__TypeMetaInfo__Group__2 ;
    public final void rule__TypeMetaInfo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2576:1: ( rule__TypeMetaInfo__Group__1__Impl rule__TypeMetaInfo__Group__2 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2577:2: rule__TypeMetaInfo__Group__1__Impl rule__TypeMetaInfo__Group__2
            {
            pushFollow(FOLLOW_rule__TypeMetaInfo__Group__1__Impl_in_rule__TypeMetaInfo__Group__15180);
            rule__TypeMetaInfo__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeMetaInfo__Group__2_in_rule__TypeMetaInfo__Group__15183);
            rule__TypeMetaInfo__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMetaInfo__Group__1"


    // $ANTLR start "rule__TypeMetaInfo__Group__1__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2584:1: rule__TypeMetaInfo__Group__1__Impl : ( ( rule__TypeMetaInfo__Group_1__0 )? ) ;
    public final void rule__TypeMetaInfo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2588:1: ( ( ( rule__TypeMetaInfo__Group_1__0 )? ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2589:1: ( ( rule__TypeMetaInfo__Group_1__0 )? )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2589:1: ( ( rule__TypeMetaInfo__Group_1__0 )? )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2590:1: ( rule__TypeMetaInfo__Group_1__0 )?
            {
             before(grammarAccess.getTypeMetaInfoAccess().getGroup_1()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2591:1: ( rule__TypeMetaInfo__Group_1__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==30) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2591:2: rule__TypeMetaInfo__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__TypeMetaInfo__Group_1__0_in_rule__TypeMetaInfo__Group__1__Impl5210);
                    rule__TypeMetaInfo__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeMetaInfoAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMetaInfo__Group__1__Impl"


    // $ANTLR start "rule__TypeMetaInfo__Group__2"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2601:1: rule__TypeMetaInfo__Group__2 : rule__TypeMetaInfo__Group__2__Impl rule__TypeMetaInfo__Group__3 ;
    public final void rule__TypeMetaInfo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2605:1: ( rule__TypeMetaInfo__Group__2__Impl rule__TypeMetaInfo__Group__3 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2606:2: rule__TypeMetaInfo__Group__2__Impl rule__TypeMetaInfo__Group__3
            {
            pushFollow(FOLLOW_rule__TypeMetaInfo__Group__2__Impl_in_rule__TypeMetaInfo__Group__25241);
            rule__TypeMetaInfo__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeMetaInfo__Group__3_in_rule__TypeMetaInfo__Group__25244);
            rule__TypeMetaInfo__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMetaInfo__Group__2"


    // $ANTLR start "rule__TypeMetaInfo__Group__2__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2613:1: rule__TypeMetaInfo__Group__2__Impl : ( ( rule__TypeMetaInfo__Group_2__0 )? ) ;
    public final void rule__TypeMetaInfo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2617:1: ( ( ( rule__TypeMetaInfo__Group_2__0 )? ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2618:1: ( ( rule__TypeMetaInfo__Group_2__0 )? )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2618:1: ( ( rule__TypeMetaInfo__Group_2__0 )? )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2619:1: ( rule__TypeMetaInfo__Group_2__0 )?
            {
             before(grammarAccess.getTypeMetaInfoAccess().getGroup_2()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2620:1: ( rule__TypeMetaInfo__Group_2__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==31) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2620:2: rule__TypeMetaInfo__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__TypeMetaInfo__Group_2__0_in_rule__TypeMetaInfo__Group__2__Impl5271);
                    rule__TypeMetaInfo__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeMetaInfoAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMetaInfo__Group__2__Impl"


    // $ANTLR start "rule__TypeMetaInfo__Group__3"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2630:1: rule__TypeMetaInfo__Group__3 : rule__TypeMetaInfo__Group__3__Impl rule__TypeMetaInfo__Group__4 ;
    public final void rule__TypeMetaInfo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2634:1: ( rule__TypeMetaInfo__Group__3__Impl rule__TypeMetaInfo__Group__4 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2635:2: rule__TypeMetaInfo__Group__3__Impl rule__TypeMetaInfo__Group__4
            {
            pushFollow(FOLLOW_rule__TypeMetaInfo__Group__3__Impl_in_rule__TypeMetaInfo__Group__35302);
            rule__TypeMetaInfo__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeMetaInfo__Group__4_in_rule__TypeMetaInfo__Group__35305);
            rule__TypeMetaInfo__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMetaInfo__Group__3"


    // $ANTLR start "rule__TypeMetaInfo__Group__3__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2642:1: rule__TypeMetaInfo__Group__3__Impl : ( ( rule__TypeMetaInfo__Group_3__0 )? ) ;
    public final void rule__TypeMetaInfo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2646:1: ( ( ( rule__TypeMetaInfo__Group_3__0 )? ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2647:1: ( ( rule__TypeMetaInfo__Group_3__0 )? )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2647:1: ( ( rule__TypeMetaInfo__Group_3__0 )? )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2648:1: ( rule__TypeMetaInfo__Group_3__0 )?
            {
             before(grammarAccess.getTypeMetaInfoAccess().getGroup_3()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2649:1: ( rule__TypeMetaInfo__Group_3__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==32) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2649:2: rule__TypeMetaInfo__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__TypeMetaInfo__Group_3__0_in_rule__TypeMetaInfo__Group__3__Impl5332);
                    rule__TypeMetaInfo__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeMetaInfoAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMetaInfo__Group__3__Impl"


    // $ANTLR start "rule__TypeMetaInfo__Group__4"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2659:1: rule__TypeMetaInfo__Group__4 : rule__TypeMetaInfo__Group__4__Impl rule__TypeMetaInfo__Group__5 ;
    public final void rule__TypeMetaInfo__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2663:1: ( rule__TypeMetaInfo__Group__4__Impl rule__TypeMetaInfo__Group__5 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2664:2: rule__TypeMetaInfo__Group__4__Impl rule__TypeMetaInfo__Group__5
            {
            pushFollow(FOLLOW_rule__TypeMetaInfo__Group__4__Impl_in_rule__TypeMetaInfo__Group__45363);
            rule__TypeMetaInfo__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeMetaInfo__Group__5_in_rule__TypeMetaInfo__Group__45366);
            rule__TypeMetaInfo__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMetaInfo__Group__4"


    // $ANTLR start "rule__TypeMetaInfo__Group__4__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2671:1: rule__TypeMetaInfo__Group__4__Impl : ( ( rule__TypeMetaInfo__Group_4__0 )? ) ;
    public final void rule__TypeMetaInfo__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2675:1: ( ( ( rule__TypeMetaInfo__Group_4__0 )? ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2676:1: ( ( rule__TypeMetaInfo__Group_4__0 )? )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2676:1: ( ( rule__TypeMetaInfo__Group_4__0 )? )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2677:1: ( rule__TypeMetaInfo__Group_4__0 )?
            {
             before(grammarAccess.getTypeMetaInfoAccess().getGroup_4()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2678:1: ( rule__TypeMetaInfo__Group_4__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==33) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2678:2: rule__TypeMetaInfo__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__TypeMetaInfo__Group_4__0_in_rule__TypeMetaInfo__Group__4__Impl5393);
                    rule__TypeMetaInfo__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeMetaInfoAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMetaInfo__Group__4__Impl"


    // $ANTLR start "rule__TypeMetaInfo__Group__5"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2688:1: rule__TypeMetaInfo__Group__5 : rule__TypeMetaInfo__Group__5__Impl ;
    public final void rule__TypeMetaInfo__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2692:1: ( rule__TypeMetaInfo__Group__5__Impl )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2693:2: rule__TypeMetaInfo__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__TypeMetaInfo__Group__5__Impl_in_rule__TypeMetaInfo__Group__55424);
            rule__TypeMetaInfo__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMetaInfo__Group__5"


    // $ANTLR start "rule__TypeMetaInfo__Group__5__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2699:1: rule__TypeMetaInfo__Group__5__Impl : ( ( rule__TypeMetaInfo__Group_5__0 )? ) ;
    public final void rule__TypeMetaInfo__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2703:1: ( ( ( rule__TypeMetaInfo__Group_5__0 )? ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2704:1: ( ( rule__TypeMetaInfo__Group_5__0 )? )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2704:1: ( ( rule__TypeMetaInfo__Group_5__0 )? )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2705:1: ( rule__TypeMetaInfo__Group_5__0 )?
            {
             before(grammarAccess.getTypeMetaInfoAccess().getGroup_5()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2706:1: ( rule__TypeMetaInfo__Group_5__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==34) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2706:2: rule__TypeMetaInfo__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__TypeMetaInfo__Group_5__0_in_rule__TypeMetaInfo__Group__5__Impl5451);
                    rule__TypeMetaInfo__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeMetaInfoAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMetaInfo__Group__5__Impl"


    // $ANTLR start "rule__TypeMetaInfo__Group_1__0"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2728:1: rule__TypeMetaInfo__Group_1__0 : rule__TypeMetaInfo__Group_1__0__Impl rule__TypeMetaInfo__Group_1__1 ;
    public final void rule__TypeMetaInfo__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2732:1: ( rule__TypeMetaInfo__Group_1__0__Impl rule__TypeMetaInfo__Group_1__1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2733:2: rule__TypeMetaInfo__Group_1__0__Impl rule__TypeMetaInfo__Group_1__1
            {
            pushFollow(FOLLOW_rule__TypeMetaInfo__Group_1__0__Impl_in_rule__TypeMetaInfo__Group_1__05494);
            rule__TypeMetaInfo__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeMetaInfo__Group_1__1_in_rule__TypeMetaInfo__Group_1__05497);
            rule__TypeMetaInfo__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMetaInfo__Group_1__0"


    // $ANTLR start "rule__TypeMetaInfo__Group_1__0__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2740:1: rule__TypeMetaInfo__Group_1__0__Impl : ( 'slabel' ) ;
    public final void rule__TypeMetaInfo__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2744:1: ( ( 'slabel' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2745:1: ( 'slabel' )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2745:1: ( 'slabel' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2746:1: 'slabel'
            {
             before(grammarAccess.getTypeMetaInfoAccess().getSlabelKeyword_1_0()); 
            match(input,30,FOLLOW_30_in_rule__TypeMetaInfo__Group_1__0__Impl5525); 
             after(grammarAccess.getTypeMetaInfoAccess().getSlabelKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMetaInfo__Group_1__0__Impl"


    // $ANTLR start "rule__TypeMetaInfo__Group_1__1"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2759:1: rule__TypeMetaInfo__Group_1__1 : rule__TypeMetaInfo__Group_1__1__Impl ;
    public final void rule__TypeMetaInfo__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2763:1: ( rule__TypeMetaInfo__Group_1__1__Impl )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2764:2: rule__TypeMetaInfo__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeMetaInfo__Group_1__1__Impl_in_rule__TypeMetaInfo__Group_1__15556);
            rule__TypeMetaInfo__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMetaInfo__Group_1__1"


    // $ANTLR start "rule__TypeMetaInfo__Group_1__1__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2770:1: rule__TypeMetaInfo__Group_1__1__Impl : ( ( rule__TypeMetaInfo__SlabelAssignment_1_1 ) ) ;
    public final void rule__TypeMetaInfo__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2774:1: ( ( ( rule__TypeMetaInfo__SlabelAssignment_1_1 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2775:1: ( ( rule__TypeMetaInfo__SlabelAssignment_1_1 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2775:1: ( ( rule__TypeMetaInfo__SlabelAssignment_1_1 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2776:1: ( rule__TypeMetaInfo__SlabelAssignment_1_1 )
            {
             before(grammarAccess.getTypeMetaInfoAccess().getSlabelAssignment_1_1()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2777:1: ( rule__TypeMetaInfo__SlabelAssignment_1_1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2777:2: rule__TypeMetaInfo__SlabelAssignment_1_1
            {
            pushFollow(FOLLOW_rule__TypeMetaInfo__SlabelAssignment_1_1_in_rule__TypeMetaInfo__Group_1__1__Impl5583);
            rule__TypeMetaInfo__SlabelAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeMetaInfoAccess().getSlabelAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMetaInfo__Group_1__1__Impl"


    // $ANTLR start "rule__TypeMetaInfo__Group_2__0"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2791:1: rule__TypeMetaInfo__Group_2__0 : rule__TypeMetaInfo__Group_2__0__Impl rule__TypeMetaInfo__Group_2__1 ;
    public final void rule__TypeMetaInfo__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2795:1: ( rule__TypeMetaInfo__Group_2__0__Impl rule__TypeMetaInfo__Group_2__1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2796:2: rule__TypeMetaInfo__Group_2__0__Impl rule__TypeMetaInfo__Group_2__1
            {
            pushFollow(FOLLOW_rule__TypeMetaInfo__Group_2__0__Impl_in_rule__TypeMetaInfo__Group_2__05617);
            rule__TypeMetaInfo__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeMetaInfo__Group_2__1_in_rule__TypeMetaInfo__Group_2__05620);
            rule__TypeMetaInfo__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMetaInfo__Group_2__0"


    // $ANTLR start "rule__TypeMetaInfo__Group_2__0__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2803:1: rule__TypeMetaInfo__Group_2__0__Impl : ( 'label' ) ;
    public final void rule__TypeMetaInfo__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2807:1: ( ( 'label' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2808:1: ( 'label' )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2808:1: ( 'label' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2809:1: 'label'
            {
             before(grammarAccess.getTypeMetaInfoAccess().getLabelKeyword_2_0()); 
            match(input,31,FOLLOW_31_in_rule__TypeMetaInfo__Group_2__0__Impl5648); 
             after(grammarAccess.getTypeMetaInfoAccess().getLabelKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMetaInfo__Group_2__0__Impl"


    // $ANTLR start "rule__TypeMetaInfo__Group_2__1"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2822:1: rule__TypeMetaInfo__Group_2__1 : rule__TypeMetaInfo__Group_2__1__Impl ;
    public final void rule__TypeMetaInfo__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2826:1: ( rule__TypeMetaInfo__Group_2__1__Impl )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2827:2: rule__TypeMetaInfo__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeMetaInfo__Group_2__1__Impl_in_rule__TypeMetaInfo__Group_2__15679);
            rule__TypeMetaInfo__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMetaInfo__Group_2__1"


    // $ANTLR start "rule__TypeMetaInfo__Group_2__1__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2833:1: rule__TypeMetaInfo__Group_2__1__Impl : ( ( rule__TypeMetaInfo__LabelAssignment_2_1 ) ) ;
    public final void rule__TypeMetaInfo__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2837:1: ( ( ( rule__TypeMetaInfo__LabelAssignment_2_1 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2838:1: ( ( rule__TypeMetaInfo__LabelAssignment_2_1 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2838:1: ( ( rule__TypeMetaInfo__LabelAssignment_2_1 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2839:1: ( rule__TypeMetaInfo__LabelAssignment_2_1 )
            {
             before(grammarAccess.getTypeMetaInfoAccess().getLabelAssignment_2_1()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2840:1: ( rule__TypeMetaInfo__LabelAssignment_2_1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2840:2: rule__TypeMetaInfo__LabelAssignment_2_1
            {
            pushFollow(FOLLOW_rule__TypeMetaInfo__LabelAssignment_2_1_in_rule__TypeMetaInfo__Group_2__1__Impl5706);
            rule__TypeMetaInfo__LabelAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeMetaInfoAccess().getLabelAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMetaInfo__Group_2__1__Impl"


    // $ANTLR start "rule__TypeMetaInfo__Group_3__0"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2854:1: rule__TypeMetaInfo__Group_3__0 : rule__TypeMetaInfo__Group_3__0__Impl rule__TypeMetaInfo__Group_3__1 ;
    public final void rule__TypeMetaInfo__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2858:1: ( rule__TypeMetaInfo__Group_3__0__Impl rule__TypeMetaInfo__Group_3__1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2859:2: rule__TypeMetaInfo__Group_3__0__Impl rule__TypeMetaInfo__Group_3__1
            {
            pushFollow(FOLLOW_rule__TypeMetaInfo__Group_3__0__Impl_in_rule__TypeMetaInfo__Group_3__05740);
            rule__TypeMetaInfo__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeMetaInfo__Group_3__1_in_rule__TypeMetaInfo__Group_3__05743);
            rule__TypeMetaInfo__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMetaInfo__Group_3__0"


    // $ANTLR start "rule__TypeMetaInfo__Group_3__0__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2866:1: rule__TypeMetaInfo__Group_3__0__Impl : ( 'tooltip' ) ;
    public final void rule__TypeMetaInfo__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2870:1: ( ( 'tooltip' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2871:1: ( 'tooltip' )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2871:1: ( 'tooltip' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2872:1: 'tooltip'
            {
             before(grammarAccess.getTypeMetaInfoAccess().getTooltipKeyword_3_0()); 
            match(input,32,FOLLOW_32_in_rule__TypeMetaInfo__Group_3__0__Impl5771); 
             after(grammarAccess.getTypeMetaInfoAccess().getTooltipKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMetaInfo__Group_3__0__Impl"


    // $ANTLR start "rule__TypeMetaInfo__Group_3__1"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2885:1: rule__TypeMetaInfo__Group_3__1 : rule__TypeMetaInfo__Group_3__1__Impl ;
    public final void rule__TypeMetaInfo__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2889:1: ( rule__TypeMetaInfo__Group_3__1__Impl )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2890:2: rule__TypeMetaInfo__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeMetaInfo__Group_3__1__Impl_in_rule__TypeMetaInfo__Group_3__15802);
            rule__TypeMetaInfo__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMetaInfo__Group_3__1"


    // $ANTLR start "rule__TypeMetaInfo__Group_3__1__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2896:1: rule__TypeMetaInfo__Group_3__1__Impl : ( ( rule__TypeMetaInfo__TooltipAssignment_3_1 ) ) ;
    public final void rule__TypeMetaInfo__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2900:1: ( ( ( rule__TypeMetaInfo__TooltipAssignment_3_1 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2901:1: ( ( rule__TypeMetaInfo__TooltipAssignment_3_1 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2901:1: ( ( rule__TypeMetaInfo__TooltipAssignment_3_1 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2902:1: ( rule__TypeMetaInfo__TooltipAssignment_3_1 )
            {
             before(grammarAccess.getTypeMetaInfoAccess().getTooltipAssignment_3_1()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2903:1: ( rule__TypeMetaInfo__TooltipAssignment_3_1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2903:2: rule__TypeMetaInfo__TooltipAssignment_3_1
            {
            pushFollow(FOLLOW_rule__TypeMetaInfo__TooltipAssignment_3_1_in_rule__TypeMetaInfo__Group_3__1__Impl5829);
            rule__TypeMetaInfo__TooltipAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeMetaInfoAccess().getTooltipAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMetaInfo__Group_3__1__Impl"


    // $ANTLR start "rule__TypeMetaInfo__Group_4__0"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2917:1: rule__TypeMetaInfo__Group_4__0 : rule__TypeMetaInfo__Group_4__0__Impl rule__TypeMetaInfo__Group_4__1 ;
    public final void rule__TypeMetaInfo__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2921:1: ( rule__TypeMetaInfo__Group_4__0__Impl rule__TypeMetaInfo__Group_4__1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2922:2: rule__TypeMetaInfo__Group_4__0__Impl rule__TypeMetaInfo__Group_4__1
            {
            pushFollow(FOLLOW_rule__TypeMetaInfo__Group_4__0__Impl_in_rule__TypeMetaInfo__Group_4__05863);
            rule__TypeMetaInfo__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeMetaInfo__Group_4__1_in_rule__TypeMetaInfo__Group_4__05866);
            rule__TypeMetaInfo__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMetaInfo__Group_4__0"


    // $ANTLR start "rule__TypeMetaInfo__Group_4__0__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2929:1: rule__TypeMetaInfo__Group_4__0__Impl : ( 'prompt' ) ;
    public final void rule__TypeMetaInfo__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2933:1: ( ( 'prompt' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2934:1: ( 'prompt' )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2934:1: ( 'prompt' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2935:1: 'prompt'
            {
             before(grammarAccess.getTypeMetaInfoAccess().getPromptKeyword_4_0()); 
            match(input,33,FOLLOW_33_in_rule__TypeMetaInfo__Group_4__0__Impl5894); 
             after(grammarAccess.getTypeMetaInfoAccess().getPromptKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMetaInfo__Group_4__0__Impl"


    // $ANTLR start "rule__TypeMetaInfo__Group_4__1"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2948:1: rule__TypeMetaInfo__Group_4__1 : rule__TypeMetaInfo__Group_4__1__Impl ;
    public final void rule__TypeMetaInfo__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2952:1: ( rule__TypeMetaInfo__Group_4__1__Impl )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2953:2: rule__TypeMetaInfo__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeMetaInfo__Group_4__1__Impl_in_rule__TypeMetaInfo__Group_4__15925);
            rule__TypeMetaInfo__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMetaInfo__Group_4__1"


    // $ANTLR start "rule__TypeMetaInfo__Group_4__1__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2959:1: rule__TypeMetaInfo__Group_4__1__Impl : ( ( rule__TypeMetaInfo__PromptAssignment_4_1 ) ) ;
    public final void rule__TypeMetaInfo__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2963:1: ( ( ( rule__TypeMetaInfo__PromptAssignment_4_1 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2964:1: ( ( rule__TypeMetaInfo__PromptAssignment_4_1 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2964:1: ( ( rule__TypeMetaInfo__PromptAssignment_4_1 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2965:1: ( rule__TypeMetaInfo__PromptAssignment_4_1 )
            {
             before(grammarAccess.getTypeMetaInfoAccess().getPromptAssignment_4_1()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2966:1: ( rule__TypeMetaInfo__PromptAssignment_4_1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2966:2: rule__TypeMetaInfo__PromptAssignment_4_1
            {
            pushFollow(FOLLOW_rule__TypeMetaInfo__PromptAssignment_4_1_in_rule__TypeMetaInfo__Group_4__1__Impl5952);
            rule__TypeMetaInfo__PromptAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeMetaInfoAccess().getPromptAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMetaInfo__Group_4__1__Impl"


    // $ANTLR start "rule__TypeMetaInfo__Group_5__0"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2980:1: rule__TypeMetaInfo__Group_5__0 : rule__TypeMetaInfo__Group_5__0__Impl rule__TypeMetaInfo__Group_5__1 ;
    public final void rule__TypeMetaInfo__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2984:1: ( rule__TypeMetaInfo__Group_5__0__Impl rule__TypeMetaInfo__Group_5__1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2985:2: rule__TypeMetaInfo__Group_5__0__Impl rule__TypeMetaInfo__Group_5__1
            {
            pushFollow(FOLLOW_rule__TypeMetaInfo__Group_5__0__Impl_in_rule__TypeMetaInfo__Group_5__05986);
            rule__TypeMetaInfo__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeMetaInfo__Group_5__1_in_rule__TypeMetaInfo__Group_5__05989);
            rule__TypeMetaInfo__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMetaInfo__Group_5__0"


    // $ANTLR start "rule__TypeMetaInfo__Group_5__0__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2992:1: rule__TypeMetaInfo__Group_5__0__Impl : ( 'examples' ) ;
    public final void rule__TypeMetaInfo__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2996:1: ( ( 'examples' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2997:1: ( 'examples' )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2997:1: ( 'examples' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2998:1: 'examples'
            {
             before(grammarAccess.getTypeMetaInfoAccess().getExamplesKeyword_5_0()); 
            match(input,34,FOLLOW_34_in_rule__TypeMetaInfo__Group_5__0__Impl6017); 
             after(grammarAccess.getTypeMetaInfoAccess().getExamplesKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMetaInfo__Group_5__0__Impl"


    // $ANTLR start "rule__TypeMetaInfo__Group_5__1"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3011:1: rule__TypeMetaInfo__Group_5__1 : rule__TypeMetaInfo__Group_5__1__Impl ;
    public final void rule__TypeMetaInfo__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3015:1: ( rule__TypeMetaInfo__Group_5__1__Impl )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3016:2: rule__TypeMetaInfo__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeMetaInfo__Group_5__1__Impl_in_rule__TypeMetaInfo__Group_5__16048);
            rule__TypeMetaInfo__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMetaInfo__Group_5__1"


    // $ANTLR start "rule__TypeMetaInfo__Group_5__1__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3022:1: rule__TypeMetaInfo__Group_5__1__Impl : ( ( rule__TypeMetaInfo__ExamplesAssignment_5_1 )* ) ;
    public final void rule__TypeMetaInfo__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3026:1: ( ( ( rule__TypeMetaInfo__ExamplesAssignment_5_1 )* ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3027:1: ( ( rule__TypeMetaInfo__ExamplesAssignment_5_1 )* )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3027:1: ( ( rule__TypeMetaInfo__ExamplesAssignment_5_1 )* )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3028:1: ( rule__TypeMetaInfo__ExamplesAssignment_5_1 )*
            {
             before(grammarAccess.getTypeMetaInfoAccess().getExamplesAssignment_5_1()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3029:1: ( rule__TypeMetaInfo__ExamplesAssignment_5_1 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=RULE_HEX && LA29_0<=RULE_DECIMAL)||LA29_0==RULE_STRING||(LA29_0>=13 && LA29_0<=14)||LA29_0==41) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3029:2: rule__TypeMetaInfo__ExamplesAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_rule__TypeMetaInfo__ExamplesAssignment_5_1_in_rule__TypeMetaInfo__Group_5__1__Impl6075);
            	    rule__TypeMetaInfo__ExamplesAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getTypeMetaInfoAccess().getExamplesAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMetaInfo__Group_5__1__Impl"


    // $ANTLR start "rule__Variable__Group__0"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3043:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3047:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3048:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_rule__Variable__Group__0__Impl_in_rule__Variable__Group__06110);
            rule__Variable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Variable__Group__1_in_rule__Variable__Group__06113);
            rule__Variable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0"


    // $ANTLR start "rule__Variable__Group__0__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3055:1: rule__Variable__Group__0__Impl : ( ( rule__Variable__DocAssignment_0 )? ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3059:1: ( ( ( rule__Variable__DocAssignment_0 )? ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3060:1: ( ( rule__Variable__DocAssignment_0 )? )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3060:1: ( ( rule__Variable__DocAssignment_0 )? )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3061:1: ( rule__Variable__DocAssignment_0 )?
            {
             before(grammarAccess.getVariableAccess().getDocAssignment_0()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3062:1: ( rule__Variable__DocAssignment_0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_DOC) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3062:2: rule__Variable__DocAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Variable__DocAssignment_0_in_rule__Variable__Group__0__Impl6140);
                    rule__Variable__DocAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVariableAccess().getDocAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0__Impl"


    // $ANTLR start "rule__Variable__Group__1"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3072:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3076:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3077:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
            {
            pushFollow(FOLLOW_rule__Variable__Group__1__Impl_in_rule__Variable__Group__16171);
            rule__Variable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Variable__Group__2_in_rule__Variable__Group__16174);
            rule__Variable__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1"


    // $ANTLR start "rule__Variable__Group__1__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3084:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__NullableAssignment_1 )? ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3088:1: ( ( ( rule__Variable__NullableAssignment_1 )? ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3089:1: ( ( rule__Variable__NullableAssignment_1 )? )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3089:1: ( ( rule__Variable__NullableAssignment_1 )? )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3090:1: ( rule__Variable__NullableAssignment_1 )?
            {
             before(grammarAccess.getVariableAccess().getNullableAssignment_1()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3091:1: ( rule__Variable__NullableAssignment_1 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==40) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3091:2: rule__Variable__NullableAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Variable__NullableAssignment_1_in_rule__Variable__Group__1__Impl6201);
                    rule__Variable__NullableAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVariableAccess().getNullableAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1__Impl"


    // $ANTLR start "rule__Variable__Group__2"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3101:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl rule__Variable__Group__3 ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3105:1: ( rule__Variable__Group__2__Impl rule__Variable__Group__3 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3106:2: rule__Variable__Group__2__Impl rule__Variable__Group__3
            {
            pushFollow(FOLLOW_rule__Variable__Group__2__Impl_in_rule__Variable__Group__26232);
            rule__Variable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Variable__Group__3_in_rule__Variable__Group__26235);
            rule__Variable__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__2"


    // $ANTLR start "rule__Variable__Group__2__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3113:1: rule__Variable__Group__2__Impl : ( ( rule__Variable__TypeAssignment_2 ) ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3117:1: ( ( ( rule__Variable__TypeAssignment_2 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3118:1: ( ( rule__Variable__TypeAssignment_2 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3118:1: ( ( rule__Variable__TypeAssignment_2 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3119:1: ( rule__Variable__TypeAssignment_2 )
            {
             before(grammarAccess.getVariableAccess().getTypeAssignment_2()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3120:1: ( rule__Variable__TypeAssignment_2 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3120:2: rule__Variable__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Variable__TypeAssignment_2_in_rule__Variable__Group__2__Impl6262);
            rule__Variable__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__2__Impl"


    // $ANTLR start "rule__Variable__Group__3"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3130:1: rule__Variable__Group__3 : rule__Variable__Group__3__Impl rule__Variable__Group__4 ;
    public final void rule__Variable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3134:1: ( rule__Variable__Group__3__Impl rule__Variable__Group__4 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3135:2: rule__Variable__Group__3__Impl rule__Variable__Group__4
            {
            pushFollow(FOLLOW_rule__Variable__Group__3__Impl_in_rule__Variable__Group__36292);
            rule__Variable__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Variable__Group__4_in_rule__Variable__Group__36295);
            rule__Variable__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__3"


    // $ANTLR start "rule__Variable__Group__3__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3142:1: rule__Variable__Group__3__Impl : ( ( rule__Variable__MultiplicityAssignment_3 )? ) ;
    public final void rule__Variable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3146:1: ( ( ( rule__Variable__MultiplicityAssignment_3 )? ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3147:1: ( ( rule__Variable__MultiplicityAssignment_3 )? )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3147:1: ( ( rule__Variable__MultiplicityAssignment_3 )? )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3148:1: ( rule__Variable__MultiplicityAssignment_3 )?
            {
             before(grammarAccess.getVariableAccess().getMultiplicityAssignment_3()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3149:1: ( rule__Variable__MultiplicityAssignment_3 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==39) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3149:2: rule__Variable__MultiplicityAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Variable__MultiplicityAssignment_3_in_rule__Variable__Group__3__Impl6322);
                    rule__Variable__MultiplicityAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVariableAccess().getMultiplicityAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__3__Impl"


    // $ANTLR start "rule__Variable__Group__4"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3159:1: rule__Variable__Group__4 : rule__Variable__Group__4__Impl rule__Variable__Group__5 ;
    public final void rule__Variable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3163:1: ( rule__Variable__Group__4__Impl rule__Variable__Group__5 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3164:2: rule__Variable__Group__4__Impl rule__Variable__Group__5
            {
            pushFollow(FOLLOW_rule__Variable__Group__4__Impl_in_rule__Variable__Group__46353);
            rule__Variable__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Variable__Group__5_in_rule__Variable__Group__46356);
            rule__Variable__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__4"


    // $ANTLR start "rule__Variable__Group__4__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3171:1: rule__Variable__Group__4__Impl : ( ( rule__Variable__NameAssignment_4 ) ) ;
    public final void rule__Variable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3175:1: ( ( ( rule__Variable__NameAssignment_4 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3176:1: ( ( rule__Variable__NameAssignment_4 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3176:1: ( ( rule__Variable__NameAssignment_4 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3177:1: ( rule__Variable__NameAssignment_4 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_4()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3178:1: ( rule__Variable__NameAssignment_4 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3178:2: rule__Variable__NameAssignment_4
            {
            pushFollow(FOLLOW_rule__Variable__NameAssignment_4_in_rule__Variable__Group__4__Impl6383);
            rule__Variable__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__4__Impl"


    // $ANTLR start "rule__Variable__Group__5"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3188:1: rule__Variable__Group__5 : rule__Variable__Group__5__Impl rule__Variable__Group__6 ;
    public final void rule__Variable__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3192:1: ( rule__Variable__Group__5__Impl rule__Variable__Group__6 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3193:2: rule__Variable__Group__5__Impl rule__Variable__Group__6
            {
            pushFollow(FOLLOW_rule__Variable__Group__5__Impl_in_rule__Variable__Group__56413);
            rule__Variable__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Variable__Group__6_in_rule__Variable__Group__56416);
            rule__Variable__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__5"


    // $ANTLR start "rule__Variable__Group__5__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3200:1: rule__Variable__Group__5__Impl : ( ( rule__Variable__InvariantsAssignment_5 )? ) ;
    public final void rule__Variable__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3204:1: ( ( ( rule__Variable__InvariantsAssignment_5 )? ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3205:1: ( ( rule__Variable__InvariantsAssignment_5 )? )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3205:1: ( ( rule__Variable__InvariantsAssignment_5 )? )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3206:1: ( rule__Variable__InvariantsAssignment_5 )?
            {
             before(grammarAccess.getVariableAccess().getInvariantsAssignment_5()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3207:1: ( rule__Variable__InvariantsAssignment_5 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==35) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3207:2: rule__Variable__InvariantsAssignment_5
                    {
                    pushFollow(FOLLOW_rule__Variable__InvariantsAssignment_5_in_rule__Variable__Group__5__Impl6443);
                    rule__Variable__InvariantsAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVariableAccess().getInvariantsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__5__Impl"


    // $ANTLR start "rule__Variable__Group__6"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3217:1: rule__Variable__Group__6 : rule__Variable__Group__6__Impl ;
    public final void rule__Variable__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3221:1: ( rule__Variable__Group__6__Impl )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3222:2: rule__Variable__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Variable__Group__6__Impl_in_rule__Variable__Group__66474);
            rule__Variable__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__6"


    // $ANTLR start "rule__Variable__Group__6__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3228:1: rule__Variable__Group__6__Impl : ( ( rule__Variable__OverriddenAssignment_6 )? ) ;
    public final void rule__Variable__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3232:1: ( ( ( rule__Variable__OverriddenAssignment_6 )? ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3233:1: ( ( rule__Variable__OverriddenAssignment_6 )? )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3233:1: ( ( rule__Variable__OverriddenAssignment_6 )? )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3234:1: ( rule__Variable__OverriddenAssignment_6 )?
            {
             before(grammarAccess.getVariableAccess().getOverriddenAssignment_6()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3235:1: ( rule__Variable__OverriddenAssignment_6 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==16) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3235:2: rule__Variable__OverriddenAssignment_6
                    {
                    pushFollow(FOLLOW_rule__Variable__OverriddenAssignment_6_in_rule__Variable__Group__6__Impl6501);
                    rule__Variable__OverriddenAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVariableAccess().getOverriddenAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__6__Impl"


    // $ANTLR start "rule__Invariants__Group__0"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3259:1: rule__Invariants__Group__0 : rule__Invariants__Group__0__Impl rule__Invariants__Group__1 ;
    public final void rule__Invariants__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3263:1: ( rule__Invariants__Group__0__Impl rule__Invariants__Group__1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3264:2: rule__Invariants__Group__0__Impl rule__Invariants__Group__1
            {
            pushFollow(FOLLOW_rule__Invariants__Group__0__Impl_in_rule__Invariants__Group__06546);
            rule__Invariants__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Invariants__Group__1_in_rule__Invariants__Group__06549);
            rule__Invariants__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariants__Group__0"


    // $ANTLR start "rule__Invariants__Group__0__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3271:1: rule__Invariants__Group__0__Impl : ( 'invariants' ) ;
    public final void rule__Invariants__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3275:1: ( ( 'invariants' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3276:1: ( 'invariants' )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3276:1: ( 'invariants' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3277:1: 'invariants'
            {
             before(grammarAccess.getInvariantsAccess().getInvariantsKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__Invariants__Group__0__Impl6577); 
             after(grammarAccess.getInvariantsAccess().getInvariantsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariants__Group__0__Impl"


    // $ANTLR start "rule__Invariants__Group__1"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3290:1: rule__Invariants__Group__1 : rule__Invariants__Group__1__Impl rule__Invariants__Group__2 ;
    public final void rule__Invariants__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3294:1: ( rule__Invariants__Group__1__Impl rule__Invariants__Group__2 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3295:2: rule__Invariants__Group__1__Impl rule__Invariants__Group__2
            {
            pushFollow(FOLLOW_rule__Invariants__Group__1__Impl_in_rule__Invariants__Group__16608);
            rule__Invariants__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Invariants__Group__2_in_rule__Invariants__Group__16611);
            rule__Invariants__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariants__Group__1"


    // $ANTLR start "rule__Invariants__Group__1__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3302:1: rule__Invariants__Group__1__Impl : ( ( rule__Invariants__CallsAssignment_1 ) ) ;
    public final void rule__Invariants__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3306:1: ( ( ( rule__Invariants__CallsAssignment_1 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3307:1: ( ( rule__Invariants__CallsAssignment_1 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3307:1: ( ( rule__Invariants__CallsAssignment_1 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3308:1: ( rule__Invariants__CallsAssignment_1 )
            {
             before(grammarAccess.getInvariantsAccess().getCallsAssignment_1()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3309:1: ( rule__Invariants__CallsAssignment_1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3309:2: rule__Invariants__CallsAssignment_1
            {
            pushFollow(FOLLOW_rule__Invariants__CallsAssignment_1_in_rule__Invariants__Group__1__Impl6638);
            rule__Invariants__CallsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInvariantsAccess().getCallsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariants__Group__1__Impl"


    // $ANTLR start "rule__Invariants__Group__2"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3319:1: rule__Invariants__Group__2 : rule__Invariants__Group__2__Impl ;
    public final void rule__Invariants__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3323:1: ( rule__Invariants__Group__2__Impl )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3324:2: rule__Invariants__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Invariants__Group__2__Impl_in_rule__Invariants__Group__26668);
            rule__Invariants__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariants__Group__2"


    // $ANTLR start "rule__Invariants__Group__2__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3330:1: rule__Invariants__Group__2__Impl : ( ( rule__Invariants__Group_2__0 )* ) ;
    public final void rule__Invariants__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3334:1: ( ( ( rule__Invariants__Group_2__0 )* ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3335:1: ( ( rule__Invariants__Group_2__0 )* )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3335:1: ( ( rule__Invariants__Group_2__0 )* )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3336:1: ( rule__Invariants__Group_2__0 )*
            {
             before(grammarAccess.getInvariantsAccess().getGroup_2()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3337:1: ( rule__Invariants__Group_2__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==25) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3337:2: rule__Invariants__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Invariants__Group_2__0_in_rule__Invariants__Group__2__Impl6695);
            	    rule__Invariants__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getInvariantsAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariants__Group__2__Impl"


    // $ANTLR start "rule__Invariants__Group_2__0"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3353:1: rule__Invariants__Group_2__0 : rule__Invariants__Group_2__0__Impl rule__Invariants__Group_2__1 ;
    public final void rule__Invariants__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3357:1: ( rule__Invariants__Group_2__0__Impl rule__Invariants__Group_2__1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3358:2: rule__Invariants__Group_2__0__Impl rule__Invariants__Group_2__1
            {
            pushFollow(FOLLOW_rule__Invariants__Group_2__0__Impl_in_rule__Invariants__Group_2__06732);
            rule__Invariants__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Invariants__Group_2__1_in_rule__Invariants__Group_2__06735);
            rule__Invariants__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariants__Group_2__0"


    // $ANTLR start "rule__Invariants__Group_2__0__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3365:1: rule__Invariants__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Invariants__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3369:1: ( ( ',' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3370:1: ( ',' )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3370:1: ( ',' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3371:1: ','
            {
             before(grammarAccess.getInvariantsAccess().getCommaKeyword_2_0()); 
            match(input,25,FOLLOW_25_in_rule__Invariants__Group_2__0__Impl6763); 
             after(grammarAccess.getInvariantsAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariants__Group_2__0__Impl"


    // $ANTLR start "rule__Invariants__Group_2__1"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3384:1: rule__Invariants__Group_2__1 : rule__Invariants__Group_2__1__Impl ;
    public final void rule__Invariants__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3388:1: ( rule__Invariants__Group_2__1__Impl )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3389:2: rule__Invariants__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Invariants__Group_2__1__Impl_in_rule__Invariants__Group_2__16794);
            rule__Invariants__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariants__Group_2__1"


    // $ANTLR start "rule__Invariants__Group_2__1__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3395:1: rule__Invariants__Group_2__1__Impl : ( ( rule__Invariants__CallsAssignment_2_1 ) ) ;
    public final void rule__Invariants__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3399:1: ( ( ( rule__Invariants__CallsAssignment_2_1 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3400:1: ( ( rule__Invariants__CallsAssignment_2_1 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3400:1: ( ( rule__Invariants__CallsAssignment_2_1 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3401:1: ( rule__Invariants__CallsAssignment_2_1 )
            {
             before(grammarAccess.getInvariantsAccess().getCallsAssignment_2_1()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3402:1: ( rule__Invariants__CallsAssignment_2_1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3402:2: rule__Invariants__CallsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Invariants__CallsAssignment_2_1_in_rule__Invariants__Group_2__1__Impl6821);
            rule__Invariants__CallsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getInvariantsAccess().getCallsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariants__Group_2__1__Impl"


    // $ANTLR start "rule__OverriddenTypeMetaInfo__Group__0"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3416:1: rule__OverriddenTypeMetaInfo__Group__0 : rule__OverriddenTypeMetaInfo__Group__0__Impl rule__OverriddenTypeMetaInfo__Group__1 ;
    public final void rule__OverriddenTypeMetaInfo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3420:1: ( rule__OverriddenTypeMetaInfo__Group__0__Impl rule__OverriddenTypeMetaInfo__Group__1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3421:2: rule__OverriddenTypeMetaInfo__Group__0__Impl rule__OverriddenTypeMetaInfo__Group__1
            {
            pushFollow(FOLLOW_rule__OverriddenTypeMetaInfo__Group__0__Impl_in_rule__OverriddenTypeMetaInfo__Group__06855);
            rule__OverriddenTypeMetaInfo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OverriddenTypeMetaInfo__Group__1_in_rule__OverriddenTypeMetaInfo__Group__06858);
            rule__OverriddenTypeMetaInfo__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OverriddenTypeMetaInfo__Group__0"


    // $ANTLR start "rule__OverriddenTypeMetaInfo__Group__0__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3428:1: rule__OverriddenTypeMetaInfo__Group__0__Impl : ( '{' ) ;
    public final void rule__OverriddenTypeMetaInfo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3432:1: ( ( '{' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3433:1: ( '{' )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3433:1: ( '{' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3434:1: '{'
            {
             before(grammarAccess.getOverriddenTypeMetaInfoAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__OverriddenTypeMetaInfo__Group__0__Impl6886); 
             after(grammarAccess.getOverriddenTypeMetaInfoAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OverriddenTypeMetaInfo__Group__0__Impl"


    // $ANTLR start "rule__OverriddenTypeMetaInfo__Group__1"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3447:1: rule__OverriddenTypeMetaInfo__Group__1 : rule__OverriddenTypeMetaInfo__Group__1__Impl rule__OverriddenTypeMetaInfo__Group__2 ;
    public final void rule__OverriddenTypeMetaInfo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3451:1: ( rule__OverriddenTypeMetaInfo__Group__1__Impl rule__OverriddenTypeMetaInfo__Group__2 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3452:2: rule__OverriddenTypeMetaInfo__Group__1__Impl rule__OverriddenTypeMetaInfo__Group__2
            {
            pushFollow(FOLLOW_rule__OverriddenTypeMetaInfo__Group__1__Impl_in_rule__OverriddenTypeMetaInfo__Group__16917);
            rule__OverriddenTypeMetaInfo__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OverriddenTypeMetaInfo__Group__2_in_rule__OverriddenTypeMetaInfo__Group__16920);
            rule__OverriddenTypeMetaInfo__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OverriddenTypeMetaInfo__Group__1"


    // $ANTLR start "rule__OverriddenTypeMetaInfo__Group__1__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3459:1: rule__OverriddenTypeMetaInfo__Group__1__Impl : ( ( rule__OverriddenTypeMetaInfo__MetaInfoAssignment_1 ) ) ;
    public final void rule__OverriddenTypeMetaInfo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3463:1: ( ( ( rule__OverriddenTypeMetaInfo__MetaInfoAssignment_1 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3464:1: ( ( rule__OverriddenTypeMetaInfo__MetaInfoAssignment_1 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3464:1: ( ( rule__OverriddenTypeMetaInfo__MetaInfoAssignment_1 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3465:1: ( rule__OverriddenTypeMetaInfo__MetaInfoAssignment_1 )
            {
             before(grammarAccess.getOverriddenTypeMetaInfoAccess().getMetaInfoAssignment_1()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3466:1: ( rule__OverriddenTypeMetaInfo__MetaInfoAssignment_1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3466:2: rule__OverriddenTypeMetaInfo__MetaInfoAssignment_1
            {
            pushFollow(FOLLOW_rule__OverriddenTypeMetaInfo__MetaInfoAssignment_1_in_rule__OverriddenTypeMetaInfo__Group__1__Impl6947);
            rule__OverriddenTypeMetaInfo__MetaInfoAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOverriddenTypeMetaInfoAccess().getMetaInfoAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OverriddenTypeMetaInfo__Group__1__Impl"


    // $ANTLR start "rule__OverriddenTypeMetaInfo__Group__2"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3476:1: rule__OverriddenTypeMetaInfo__Group__2 : rule__OverriddenTypeMetaInfo__Group__2__Impl ;
    public final void rule__OverriddenTypeMetaInfo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3480:1: ( rule__OverriddenTypeMetaInfo__Group__2__Impl )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3481:2: rule__OverriddenTypeMetaInfo__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__OverriddenTypeMetaInfo__Group__2__Impl_in_rule__OverriddenTypeMetaInfo__Group__26977);
            rule__OverriddenTypeMetaInfo__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OverriddenTypeMetaInfo__Group__2"


    // $ANTLR start "rule__OverriddenTypeMetaInfo__Group__2__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3487:1: rule__OverriddenTypeMetaInfo__Group__2__Impl : ( '}' ) ;
    public final void rule__OverriddenTypeMetaInfo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3491:1: ( ( '}' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3492:1: ( '}' )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3492:1: ( '}' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3493:1: '}'
            {
             before(grammarAccess.getOverriddenTypeMetaInfoAccess().getRightCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__OverriddenTypeMetaInfo__Group__2__Impl7005); 
             after(grammarAccess.getOverriddenTypeMetaInfoAccess().getRightCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OverriddenTypeMetaInfo__Group__2__Impl"


    // $ANTLR start "rule__ConstraintCall__Group__0"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3512:1: rule__ConstraintCall__Group__0 : rule__ConstraintCall__Group__0__Impl rule__ConstraintCall__Group__1 ;
    public final void rule__ConstraintCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3516:1: ( rule__ConstraintCall__Group__0__Impl rule__ConstraintCall__Group__1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3517:2: rule__ConstraintCall__Group__0__Impl rule__ConstraintCall__Group__1
            {
            pushFollow(FOLLOW_rule__ConstraintCall__Group__0__Impl_in_rule__ConstraintCall__Group__07042);
            rule__ConstraintCall__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstraintCall__Group__1_in_rule__ConstraintCall__Group__07045);
            rule__ConstraintCall__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintCall__Group__0"


    // $ANTLR start "rule__ConstraintCall__Group__0__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3524:1: rule__ConstraintCall__Group__0__Impl : ( ( rule__ConstraintCall__ConstraintAssignment_0 ) ) ;
    public final void rule__ConstraintCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3528:1: ( ( ( rule__ConstraintCall__ConstraintAssignment_0 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3529:1: ( ( rule__ConstraintCall__ConstraintAssignment_0 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3529:1: ( ( rule__ConstraintCall__ConstraintAssignment_0 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3530:1: ( rule__ConstraintCall__ConstraintAssignment_0 )
            {
             before(grammarAccess.getConstraintCallAccess().getConstraintAssignment_0()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3531:1: ( rule__ConstraintCall__ConstraintAssignment_0 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3531:2: rule__ConstraintCall__ConstraintAssignment_0
            {
            pushFollow(FOLLOW_rule__ConstraintCall__ConstraintAssignment_0_in_rule__ConstraintCall__Group__0__Impl7072);
            rule__ConstraintCall__ConstraintAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConstraintCallAccess().getConstraintAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintCall__Group__0__Impl"


    // $ANTLR start "rule__ConstraintCall__Group__1"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3541:1: rule__ConstraintCall__Group__1 : rule__ConstraintCall__Group__1__Impl ;
    public final void rule__ConstraintCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3545:1: ( rule__ConstraintCall__Group__1__Impl )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3546:2: rule__ConstraintCall__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ConstraintCall__Group__1__Impl_in_rule__ConstraintCall__Group__17102);
            rule__ConstraintCall__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintCall__Group__1"


    // $ANTLR start "rule__ConstraintCall__Group__1__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3552:1: rule__ConstraintCall__Group__1__Impl : ( ( rule__ConstraintCall__Group_1__0 )? ) ;
    public final void rule__ConstraintCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3556:1: ( ( ( rule__ConstraintCall__Group_1__0 )? ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3557:1: ( ( rule__ConstraintCall__Group_1__0 )? )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3557:1: ( ( rule__ConstraintCall__Group_1__0 )? )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3558:1: ( rule__ConstraintCall__Group_1__0 )?
            {
             before(grammarAccess.getConstraintCallAccess().getGroup_1()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3559:1: ( rule__ConstraintCall__Group_1__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==36) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3559:2: rule__ConstraintCall__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ConstraintCall__Group_1__0_in_rule__ConstraintCall__Group__1__Impl7129);
                    rule__ConstraintCall__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstraintCallAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintCall__Group__1__Impl"


    // $ANTLR start "rule__ConstraintCall__Group_1__0"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3573:1: rule__ConstraintCall__Group_1__0 : rule__ConstraintCall__Group_1__0__Impl rule__ConstraintCall__Group_1__1 ;
    public final void rule__ConstraintCall__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3577:1: ( rule__ConstraintCall__Group_1__0__Impl rule__ConstraintCall__Group_1__1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3578:2: rule__ConstraintCall__Group_1__0__Impl rule__ConstraintCall__Group_1__1
            {
            pushFollow(FOLLOW_rule__ConstraintCall__Group_1__0__Impl_in_rule__ConstraintCall__Group_1__07164);
            rule__ConstraintCall__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstraintCall__Group_1__1_in_rule__ConstraintCall__Group_1__07167);
            rule__ConstraintCall__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintCall__Group_1__0"


    // $ANTLR start "rule__ConstraintCall__Group_1__0__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3585:1: rule__ConstraintCall__Group_1__0__Impl : ( '(' ) ;
    public final void rule__ConstraintCall__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3589:1: ( ( '(' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3590:1: ( '(' )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3590:1: ( '(' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3591:1: '('
            {
             before(grammarAccess.getConstraintCallAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,36,FOLLOW_36_in_rule__ConstraintCall__Group_1__0__Impl7195); 
             after(grammarAccess.getConstraintCallAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintCall__Group_1__0__Impl"


    // $ANTLR start "rule__ConstraintCall__Group_1__1"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3604:1: rule__ConstraintCall__Group_1__1 : rule__ConstraintCall__Group_1__1__Impl rule__ConstraintCall__Group_1__2 ;
    public final void rule__ConstraintCall__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3608:1: ( rule__ConstraintCall__Group_1__1__Impl rule__ConstraintCall__Group_1__2 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3609:2: rule__ConstraintCall__Group_1__1__Impl rule__ConstraintCall__Group_1__2
            {
            pushFollow(FOLLOW_rule__ConstraintCall__Group_1__1__Impl_in_rule__ConstraintCall__Group_1__17226);
            rule__ConstraintCall__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstraintCall__Group_1__2_in_rule__ConstraintCall__Group_1__17229);
            rule__ConstraintCall__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintCall__Group_1__1"


    // $ANTLR start "rule__ConstraintCall__Group_1__1__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3616:1: rule__ConstraintCall__Group_1__1__Impl : ( ( rule__ConstraintCall__ParamsAssignment_1_1 ) ) ;
    public final void rule__ConstraintCall__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3620:1: ( ( ( rule__ConstraintCall__ParamsAssignment_1_1 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3621:1: ( ( rule__ConstraintCall__ParamsAssignment_1_1 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3621:1: ( ( rule__ConstraintCall__ParamsAssignment_1_1 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3622:1: ( rule__ConstraintCall__ParamsAssignment_1_1 )
            {
             before(grammarAccess.getConstraintCallAccess().getParamsAssignment_1_1()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3623:1: ( rule__ConstraintCall__ParamsAssignment_1_1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3623:2: rule__ConstraintCall__ParamsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ConstraintCall__ParamsAssignment_1_1_in_rule__ConstraintCall__Group_1__1__Impl7256);
            rule__ConstraintCall__ParamsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getConstraintCallAccess().getParamsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintCall__Group_1__1__Impl"


    // $ANTLR start "rule__ConstraintCall__Group_1__2"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3633:1: rule__ConstraintCall__Group_1__2 : rule__ConstraintCall__Group_1__2__Impl rule__ConstraintCall__Group_1__3 ;
    public final void rule__ConstraintCall__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3637:1: ( rule__ConstraintCall__Group_1__2__Impl rule__ConstraintCall__Group_1__3 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3638:2: rule__ConstraintCall__Group_1__2__Impl rule__ConstraintCall__Group_1__3
            {
            pushFollow(FOLLOW_rule__ConstraintCall__Group_1__2__Impl_in_rule__ConstraintCall__Group_1__27286);
            rule__ConstraintCall__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstraintCall__Group_1__3_in_rule__ConstraintCall__Group_1__27289);
            rule__ConstraintCall__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintCall__Group_1__2"


    // $ANTLR start "rule__ConstraintCall__Group_1__2__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3645:1: rule__ConstraintCall__Group_1__2__Impl : ( ( rule__ConstraintCall__Group_1_2__0 )* ) ;
    public final void rule__ConstraintCall__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3649:1: ( ( ( rule__ConstraintCall__Group_1_2__0 )* ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3650:1: ( ( rule__ConstraintCall__Group_1_2__0 )* )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3650:1: ( ( rule__ConstraintCall__Group_1_2__0 )* )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3651:1: ( rule__ConstraintCall__Group_1_2__0 )*
            {
             before(grammarAccess.getConstraintCallAccess().getGroup_1_2()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3652:1: ( rule__ConstraintCall__Group_1_2__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==25) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3652:2: rule__ConstraintCall__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__ConstraintCall__Group_1_2__0_in_rule__ConstraintCall__Group_1__2__Impl7316);
            	    rule__ConstraintCall__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getConstraintCallAccess().getGroup_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintCall__Group_1__2__Impl"


    // $ANTLR start "rule__ConstraintCall__Group_1__3"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3662:1: rule__ConstraintCall__Group_1__3 : rule__ConstraintCall__Group_1__3__Impl ;
    public final void rule__ConstraintCall__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3666:1: ( rule__ConstraintCall__Group_1__3__Impl )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3667:2: rule__ConstraintCall__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__ConstraintCall__Group_1__3__Impl_in_rule__ConstraintCall__Group_1__37347);
            rule__ConstraintCall__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintCall__Group_1__3"


    // $ANTLR start "rule__ConstraintCall__Group_1__3__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3673:1: rule__ConstraintCall__Group_1__3__Impl : ( ')' ) ;
    public final void rule__ConstraintCall__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3677:1: ( ( ')' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3678:1: ( ')' )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3678:1: ( ')' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3679:1: ')'
            {
             before(grammarAccess.getConstraintCallAccess().getRightParenthesisKeyword_1_3()); 
            match(input,37,FOLLOW_37_in_rule__ConstraintCall__Group_1__3__Impl7375); 
             after(grammarAccess.getConstraintCallAccess().getRightParenthesisKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintCall__Group_1__3__Impl"


    // $ANTLR start "rule__ConstraintCall__Group_1_2__0"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3700:1: rule__ConstraintCall__Group_1_2__0 : rule__ConstraintCall__Group_1_2__0__Impl rule__ConstraintCall__Group_1_2__1 ;
    public final void rule__ConstraintCall__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3704:1: ( rule__ConstraintCall__Group_1_2__0__Impl rule__ConstraintCall__Group_1_2__1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3705:2: rule__ConstraintCall__Group_1_2__0__Impl rule__ConstraintCall__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__ConstraintCall__Group_1_2__0__Impl_in_rule__ConstraintCall__Group_1_2__07414);
            rule__ConstraintCall__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstraintCall__Group_1_2__1_in_rule__ConstraintCall__Group_1_2__07417);
            rule__ConstraintCall__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintCall__Group_1_2__0"


    // $ANTLR start "rule__ConstraintCall__Group_1_2__0__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3712:1: rule__ConstraintCall__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__ConstraintCall__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3716:1: ( ( ',' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3717:1: ( ',' )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3717:1: ( ',' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3718:1: ','
            {
             before(grammarAccess.getConstraintCallAccess().getCommaKeyword_1_2_0()); 
            match(input,25,FOLLOW_25_in_rule__ConstraintCall__Group_1_2__0__Impl7445); 
             after(grammarAccess.getConstraintCallAccess().getCommaKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintCall__Group_1_2__0__Impl"


    // $ANTLR start "rule__ConstraintCall__Group_1_2__1"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3731:1: rule__ConstraintCall__Group_1_2__1 : rule__ConstraintCall__Group_1_2__1__Impl ;
    public final void rule__ConstraintCall__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3735:1: ( rule__ConstraintCall__Group_1_2__1__Impl )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3736:2: rule__ConstraintCall__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ConstraintCall__Group_1_2__1__Impl_in_rule__ConstraintCall__Group_1_2__17476);
            rule__ConstraintCall__Group_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintCall__Group_1_2__1"


    // $ANTLR start "rule__ConstraintCall__Group_1_2__1__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3742:1: rule__ConstraintCall__Group_1_2__1__Impl : ( ( rule__ConstraintCall__ParamsAssignment_1_2_1 ) ) ;
    public final void rule__ConstraintCall__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3746:1: ( ( ( rule__ConstraintCall__ParamsAssignment_1_2_1 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3747:1: ( ( rule__ConstraintCall__ParamsAssignment_1_2_1 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3747:1: ( ( rule__ConstraintCall__ParamsAssignment_1_2_1 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3748:1: ( rule__ConstraintCall__ParamsAssignment_1_2_1 )
            {
             before(grammarAccess.getConstraintCallAccess().getParamsAssignment_1_2_1()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3749:1: ( rule__ConstraintCall__ParamsAssignment_1_2_1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3749:2: rule__ConstraintCall__ParamsAssignment_1_2_1
            {
            pushFollow(FOLLOW_rule__ConstraintCall__ParamsAssignment_1_2_1_in_rule__ConstraintCall__Group_1_2__1__Impl7503);
            rule__ConstraintCall__ParamsAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getConstraintCallAccess().getParamsAssignment_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintCall__Group_1_2__1__Impl"


    // $ANTLR start "rule__BooleanLiteral__Group__0"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3763:1: rule__BooleanLiteral__Group__0 : rule__BooleanLiteral__Group__0__Impl rule__BooleanLiteral__Group__1 ;
    public final void rule__BooleanLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3767:1: ( rule__BooleanLiteral__Group__0__Impl rule__BooleanLiteral__Group__1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3768:2: rule__BooleanLiteral__Group__0__Impl rule__BooleanLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__BooleanLiteral__Group__0__Impl_in_rule__BooleanLiteral__Group__07537);
            rule__BooleanLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BooleanLiteral__Group__1_in_rule__BooleanLiteral__Group__07540);
            rule__BooleanLiteral__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanLiteral__Group__0"


    // $ANTLR start "rule__BooleanLiteral__Group__0__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3775:1: rule__BooleanLiteral__Group__0__Impl : ( () ) ;
    public final void rule__BooleanLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3779:1: ( ( () ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3780:1: ( () )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3780:1: ( () )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3781:1: ()
            {
             before(grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_0()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3782:1: ()
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3784:1: 
            {
            }

             after(grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanLiteral__Group__0__Impl"


    // $ANTLR start "rule__BooleanLiteral__Group__1"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3794:1: rule__BooleanLiteral__Group__1 : rule__BooleanLiteral__Group__1__Impl ;
    public final void rule__BooleanLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3798:1: ( rule__BooleanLiteral__Group__1__Impl )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3799:2: rule__BooleanLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BooleanLiteral__Group__1__Impl_in_rule__BooleanLiteral__Group__17598);
            rule__BooleanLiteral__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanLiteral__Group__1"


    // $ANTLR start "rule__BooleanLiteral__Group__1__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3805:1: rule__BooleanLiteral__Group__1__Impl : ( ( rule__BooleanLiteral__ValueAssignment_1 ) ) ;
    public final void rule__BooleanLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3809:1: ( ( ( rule__BooleanLiteral__ValueAssignment_1 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3810:1: ( ( rule__BooleanLiteral__ValueAssignment_1 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3810:1: ( ( rule__BooleanLiteral__ValueAssignment_1 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3811:1: ( rule__BooleanLiteral__ValueAssignment_1 )
            {
             before(grammarAccess.getBooleanLiteralAccess().getValueAssignment_1()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3812:1: ( rule__BooleanLiteral__ValueAssignment_1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3812:2: rule__BooleanLiteral__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__BooleanLiteral__ValueAssignment_1_in_rule__BooleanLiteral__Group__1__Impl7625);
            rule__BooleanLiteral__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBooleanLiteralAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanLiteral__Group__1__Impl"


    // $ANTLR start "rule__NullLiteral__Group__0"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3826:1: rule__NullLiteral__Group__0 : rule__NullLiteral__Group__0__Impl rule__NullLiteral__Group__1 ;
    public final void rule__NullLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3830:1: ( rule__NullLiteral__Group__0__Impl rule__NullLiteral__Group__1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3831:2: rule__NullLiteral__Group__0__Impl rule__NullLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__NullLiteral__Group__0__Impl_in_rule__NullLiteral__Group__07659);
            rule__NullLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NullLiteral__Group__1_in_rule__NullLiteral__Group__07662);
            rule__NullLiteral__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullLiteral__Group__0"


    // $ANTLR start "rule__NullLiteral__Group__0__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3838:1: rule__NullLiteral__Group__0__Impl : ( () ) ;
    public final void rule__NullLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3842:1: ( ( () ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3843:1: ( () )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3843:1: ( () )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3844:1: ()
            {
             before(grammarAccess.getNullLiteralAccess().getNullLiteralAction_0()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3845:1: ()
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3847:1: 
            {
            }

             after(grammarAccess.getNullLiteralAccess().getNullLiteralAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullLiteral__Group__0__Impl"


    // $ANTLR start "rule__NullLiteral__Group__1"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3857:1: rule__NullLiteral__Group__1 : rule__NullLiteral__Group__1__Impl ;
    public final void rule__NullLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3861:1: ( rule__NullLiteral__Group__1__Impl )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3862:2: rule__NullLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NullLiteral__Group__1__Impl_in_rule__NullLiteral__Group__17720);
            rule__NullLiteral__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullLiteral__Group__1"


    // $ANTLR start "rule__NullLiteral__Group__1__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3868:1: rule__NullLiteral__Group__1__Impl : ( ( rule__NullLiteral__ValueAssignment_1 ) ) ;
    public final void rule__NullLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3872:1: ( ( ( rule__NullLiteral__ValueAssignment_1 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3873:1: ( ( rule__NullLiteral__ValueAssignment_1 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3873:1: ( ( rule__NullLiteral__ValueAssignment_1 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3874:1: ( rule__NullLiteral__ValueAssignment_1 )
            {
             before(grammarAccess.getNullLiteralAccess().getValueAssignment_1()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3875:1: ( rule__NullLiteral__ValueAssignment_1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3875:2: rule__NullLiteral__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__NullLiteral__ValueAssignment_1_in_rule__NullLiteral__Group__1__Impl7747);
            rule__NullLiteral__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNullLiteralAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullLiteral__Group__1__Impl"


    // $ANTLR start "rule__NumberLiteral__Group__0"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3889:1: rule__NumberLiteral__Group__0 : rule__NumberLiteral__Group__0__Impl rule__NumberLiteral__Group__1 ;
    public final void rule__NumberLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3893:1: ( rule__NumberLiteral__Group__0__Impl rule__NumberLiteral__Group__1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3894:2: rule__NumberLiteral__Group__0__Impl rule__NumberLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__NumberLiteral__Group__0__Impl_in_rule__NumberLiteral__Group__07781);
            rule__NumberLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumberLiteral__Group__1_in_rule__NumberLiteral__Group__07784);
            rule__NumberLiteral__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberLiteral__Group__0"


    // $ANTLR start "rule__NumberLiteral__Group__0__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3901:1: rule__NumberLiteral__Group__0__Impl : ( () ) ;
    public final void rule__NumberLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3905:1: ( ( () ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3906:1: ( () )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3906:1: ( () )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3907:1: ()
            {
             before(grammarAccess.getNumberLiteralAccess().getNumberLiteralAction_0()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3908:1: ()
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3910:1: 
            {
            }

             after(grammarAccess.getNumberLiteralAccess().getNumberLiteralAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberLiteral__Group__0__Impl"


    // $ANTLR start "rule__NumberLiteral__Group__1"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3920:1: rule__NumberLiteral__Group__1 : rule__NumberLiteral__Group__1__Impl ;
    public final void rule__NumberLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3924:1: ( rule__NumberLiteral__Group__1__Impl )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3925:2: rule__NumberLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NumberLiteral__Group__1__Impl_in_rule__NumberLiteral__Group__17842);
            rule__NumberLiteral__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberLiteral__Group__1"


    // $ANTLR start "rule__NumberLiteral__Group__1__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3931:1: rule__NumberLiteral__Group__1__Impl : ( ( rule__NumberLiteral__ValueAssignment_1 ) ) ;
    public final void rule__NumberLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3935:1: ( ( ( rule__NumberLiteral__ValueAssignment_1 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3936:1: ( ( rule__NumberLiteral__ValueAssignment_1 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3936:1: ( ( rule__NumberLiteral__ValueAssignment_1 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3937:1: ( rule__NumberLiteral__ValueAssignment_1 )
            {
             before(grammarAccess.getNumberLiteralAccess().getValueAssignment_1()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3938:1: ( rule__NumberLiteral__ValueAssignment_1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3938:2: rule__NumberLiteral__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__NumberLiteral__ValueAssignment_1_in_rule__NumberLiteral__Group__1__Impl7869);
            rule__NumberLiteral__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNumberLiteralAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberLiteral__Group__1__Impl"


    // $ANTLR start "rule__StringLiteral__Group__0"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3952:1: rule__StringLiteral__Group__0 : rule__StringLiteral__Group__0__Impl rule__StringLiteral__Group__1 ;
    public final void rule__StringLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3956:1: ( rule__StringLiteral__Group__0__Impl rule__StringLiteral__Group__1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3957:2: rule__StringLiteral__Group__0__Impl rule__StringLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__StringLiteral__Group__0__Impl_in_rule__StringLiteral__Group__07903);
            rule__StringLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringLiteral__Group__1_in_rule__StringLiteral__Group__07906);
            rule__StringLiteral__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__Group__0"


    // $ANTLR start "rule__StringLiteral__Group__0__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3964:1: rule__StringLiteral__Group__0__Impl : ( () ) ;
    public final void rule__StringLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3968:1: ( ( () ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3969:1: ( () )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3969:1: ( () )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3970:1: ()
            {
             before(grammarAccess.getStringLiteralAccess().getStringLiteralAction_0()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3971:1: ()
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3973:1: 
            {
            }

             after(grammarAccess.getStringLiteralAccess().getStringLiteralAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__Group__0__Impl"


    // $ANTLR start "rule__StringLiteral__Group__1"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3983:1: rule__StringLiteral__Group__1 : rule__StringLiteral__Group__1__Impl ;
    public final void rule__StringLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3987:1: ( rule__StringLiteral__Group__1__Impl )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3988:2: rule__StringLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__StringLiteral__Group__1__Impl_in_rule__StringLiteral__Group__17964);
            rule__StringLiteral__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__Group__1"


    // $ANTLR start "rule__StringLiteral__Group__1__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3994:1: rule__StringLiteral__Group__1__Impl : ( ( rule__StringLiteral__ValueAssignment_1 ) ) ;
    public final void rule__StringLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3998:1: ( ( ( rule__StringLiteral__ValueAssignment_1 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3999:1: ( ( rule__StringLiteral__ValueAssignment_1 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3999:1: ( ( rule__StringLiteral__ValueAssignment_1 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4000:1: ( rule__StringLiteral__ValueAssignment_1 )
            {
             before(grammarAccess.getStringLiteralAccess().getValueAssignment_1()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4001:1: ( rule__StringLiteral__ValueAssignment_1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4001:2: rule__StringLiteral__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__StringLiteral__ValueAssignment_1_in_rule__StringLiteral__Group__1__Impl7991);
            rule__StringLiteral__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStringLiteralAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__Group__1__Impl"


    // $ANTLR start "rule__FQN__Group__0"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4015:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4019:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4020:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__08025);
            rule__FQN__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__08028);
            rule__FQN__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__0"


    // $ANTLR start "rule__FQN__Group__0__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4027:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4031:1: ( ( RULE_ID ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4032:1: ( RULE_ID )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4032:1: ( RULE_ID )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4033:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl8055); 
             after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__0__Impl"


    // $ANTLR start "rule__FQN__Group__1"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4044:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4048:1: ( rule__FQN__Group__1__Impl )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4049:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__18084);
            rule__FQN__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__1"


    // $ANTLR start "rule__FQN__Group__1__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4055:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4059:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4060:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4060:1: ( ( rule__FQN__Group_1__0 )* )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4061:1: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4062:1: ( rule__FQN__Group_1__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==38) ) {
                    int LA38_2 = input.LA(2);

                    if ( (LA38_2==RULE_ID) ) {
                        alt38=1;
                    }


                }


                switch (alt38) {
            	case 1 :
            	    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4062:2: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl8111);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getFQNAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__1__Impl"


    // $ANTLR start "rule__FQN__Group_1__0"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4076:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4080:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4081:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__08146);
            rule__FQN__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__08149);
            rule__FQN__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__0"


    // $ANTLR start "rule__FQN__Group_1__0__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4088:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4092:1: ( ( '.' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4093:1: ( '.' )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4093:1: ( '.' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4094:1: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,38,FOLLOW_38_in_rule__FQN__Group_1__0__Impl8177); 
             after(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__0__Impl"


    // $ANTLR start "rule__FQN__Group_1__1"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4107:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4111:1: ( rule__FQN__Group_1__1__Impl )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4112:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__18208);
            rule__FQN__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__1"


    // $ANTLR start "rule__FQN__Group_1__1__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4118:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4122:1: ( ( RULE_ID ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4123:1: ( RULE_ID )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4123:1: ( RULE_ID )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4124:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl8235); 
             after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__1__Impl"


    // $ANTLR start "rule__FQNWithWildcard__Group__0"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4139:1: rule__FQNWithWildcard__Group__0 : rule__FQNWithWildcard__Group__0__Impl rule__FQNWithWildcard__Group__1 ;
    public final void rule__FQNWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4143:1: ( rule__FQNWithWildcard__Group__0__Impl rule__FQNWithWildcard__Group__1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4144:2: rule__FQNWithWildcard__Group__0__Impl rule__FQNWithWildcard__Group__1
            {
            pushFollow(FOLLOW_rule__FQNWithWildcard__Group__0__Impl_in_rule__FQNWithWildcard__Group__08268);
            rule__FQNWithWildcard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FQNWithWildcard__Group__1_in_rule__FQNWithWildcard__Group__08271);
            rule__FQNWithWildcard__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQNWithWildcard__Group__0"


    // $ANTLR start "rule__FQNWithWildcard__Group__0__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4151:1: rule__FQNWithWildcard__Group__0__Impl : ( ruleFQN ) ;
    public final void rule__FQNWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4155:1: ( ( ruleFQN ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4156:1: ( ruleFQN )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4156:1: ( ruleFQN )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4157:1: ruleFQN
            {
             before(grammarAccess.getFQNWithWildcardAccess().getFQNParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__FQNWithWildcard__Group__0__Impl8298);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getFQNWithWildcardAccess().getFQNParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQNWithWildcard__Group__0__Impl"


    // $ANTLR start "rule__FQNWithWildcard__Group__1"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4168:1: rule__FQNWithWildcard__Group__1 : rule__FQNWithWildcard__Group__1__Impl rule__FQNWithWildcard__Group__2 ;
    public final void rule__FQNWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4172:1: ( rule__FQNWithWildcard__Group__1__Impl rule__FQNWithWildcard__Group__2 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4173:2: rule__FQNWithWildcard__Group__1__Impl rule__FQNWithWildcard__Group__2
            {
            pushFollow(FOLLOW_rule__FQNWithWildcard__Group__1__Impl_in_rule__FQNWithWildcard__Group__18327);
            rule__FQNWithWildcard__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FQNWithWildcard__Group__2_in_rule__FQNWithWildcard__Group__18330);
            rule__FQNWithWildcard__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQNWithWildcard__Group__1"


    // $ANTLR start "rule__FQNWithWildcard__Group__1__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4180:1: rule__FQNWithWildcard__Group__1__Impl : ( '.' ) ;
    public final void rule__FQNWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4184:1: ( ( '.' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4185:1: ( '.' )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4185:1: ( '.' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4186:1: '.'
            {
             before(grammarAccess.getFQNWithWildcardAccess().getFullStopKeyword_1()); 
            match(input,38,FOLLOW_38_in_rule__FQNWithWildcard__Group__1__Impl8358); 
             after(grammarAccess.getFQNWithWildcardAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQNWithWildcard__Group__1__Impl"


    // $ANTLR start "rule__FQNWithWildcard__Group__2"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4199:1: rule__FQNWithWildcard__Group__2 : rule__FQNWithWildcard__Group__2__Impl ;
    public final void rule__FQNWithWildcard__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4203:1: ( rule__FQNWithWildcard__Group__2__Impl )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4204:2: rule__FQNWithWildcard__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__FQNWithWildcard__Group__2__Impl_in_rule__FQNWithWildcard__Group__28389);
            rule__FQNWithWildcard__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQNWithWildcard__Group__2"


    // $ANTLR start "rule__FQNWithWildcard__Group__2__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4210:1: rule__FQNWithWildcard__Group__2__Impl : ( '*' ) ;
    public final void rule__FQNWithWildcard__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4214:1: ( ( '*' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4215:1: ( '*' )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4215:1: ( '*' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4216:1: '*'
            {
             before(grammarAccess.getFQNWithWildcardAccess().getAsteriskKeyword_2()); 
            match(input,39,FOLLOW_39_in_rule__FQNWithWildcard__Group__2__Impl8417); 
             after(grammarAccess.getFQNWithWildcardAccess().getAsteriskKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQNWithWildcard__Group__2__Impl"


    // $ANTLR start "rule__Number__Group_1__0"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4235:1: rule__Number__Group_1__0 : rule__Number__Group_1__0__Impl rule__Number__Group_1__1 ;
    public final void rule__Number__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4239:1: ( rule__Number__Group_1__0__Impl rule__Number__Group_1__1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4240:2: rule__Number__Group_1__0__Impl rule__Number__Group_1__1
            {
            pushFollow(FOLLOW_rule__Number__Group_1__0__Impl_in_rule__Number__Group_1__08454);
            rule__Number__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Number__Group_1__1_in_rule__Number__Group_1__08457);
            rule__Number__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group_1__0"


    // $ANTLR start "rule__Number__Group_1__0__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4247:1: rule__Number__Group_1__0__Impl : ( ( rule__Number__Alternatives_1_0 ) ) ;
    public final void rule__Number__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4251:1: ( ( ( rule__Number__Alternatives_1_0 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4252:1: ( ( rule__Number__Alternatives_1_0 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4252:1: ( ( rule__Number__Alternatives_1_0 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4253:1: ( rule__Number__Alternatives_1_0 )
            {
             before(grammarAccess.getNumberAccess().getAlternatives_1_0()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4254:1: ( rule__Number__Alternatives_1_0 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4254:2: rule__Number__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__Number__Alternatives_1_0_in_rule__Number__Group_1__0__Impl8484);
            rule__Number__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group_1__0__Impl"


    // $ANTLR start "rule__Number__Group_1__1"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4264:1: rule__Number__Group_1__1 : rule__Number__Group_1__1__Impl ;
    public final void rule__Number__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4268:1: ( rule__Number__Group_1__1__Impl )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4269:2: rule__Number__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Number__Group_1__1__Impl_in_rule__Number__Group_1__18514);
            rule__Number__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group_1__1"


    // $ANTLR start "rule__Number__Group_1__1__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4275:1: rule__Number__Group_1__1__Impl : ( ( rule__Number__Group_1_1__0 )? ) ;
    public final void rule__Number__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4279:1: ( ( ( rule__Number__Group_1_1__0 )? ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4280:1: ( ( rule__Number__Group_1_1__0 )? )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4280:1: ( ( rule__Number__Group_1_1__0 )? )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4281:1: ( rule__Number__Group_1_1__0 )?
            {
             before(grammarAccess.getNumberAccess().getGroup_1_1()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4282:1: ( rule__Number__Group_1_1__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==38) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4282:2: rule__Number__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__Number__Group_1_1__0_in_rule__Number__Group_1__1__Impl8541);
                    rule__Number__Group_1_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNumberAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group_1__1__Impl"


    // $ANTLR start "rule__Number__Group_1_1__0"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4296:1: rule__Number__Group_1_1__0 : rule__Number__Group_1_1__0__Impl rule__Number__Group_1_1__1 ;
    public final void rule__Number__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4300:1: ( rule__Number__Group_1_1__0__Impl rule__Number__Group_1_1__1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4301:2: rule__Number__Group_1_1__0__Impl rule__Number__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Number__Group_1_1__0__Impl_in_rule__Number__Group_1_1__08576);
            rule__Number__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Number__Group_1_1__1_in_rule__Number__Group_1_1__08579);
            rule__Number__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group_1_1__0"


    // $ANTLR start "rule__Number__Group_1_1__0__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4308:1: rule__Number__Group_1_1__0__Impl : ( '.' ) ;
    public final void rule__Number__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4312:1: ( ( '.' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4313:1: ( '.' )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4313:1: ( '.' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4314:1: '.'
            {
             before(grammarAccess.getNumberAccess().getFullStopKeyword_1_1_0()); 
            match(input,38,FOLLOW_38_in_rule__Number__Group_1_1__0__Impl8607); 
             after(grammarAccess.getNumberAccess().getFullStopKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group_1_1__0__Impl"


    // $ANTLR start "rule__Number__Group_1_1__1"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4327:1: rule__Number__Group_1_1__1 : rule__Number__Group_1_1__1__Impl ;
    public final void rule__Number__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4331:1: ( rule__Number__Group_1_1__1__Impl )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4332:2: rule__Number__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Number__Group_1_1__1__Impl_in_rule__Number__Group_1_1__18638);
            rule__Number__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group_1_1__1"


    // $ANTLR start "rule__Number__Group_1_1__1__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4338:1: rule__Number__Group_1_1__1__Impl : ( ( rule__Number__Alternatives_1_1_1 ) ) ;
    public final void rule__Number__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4342:1: ( ( ( rule__Number__Alternatives_1_1_1 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4343:1: ( ( rule__Number__Alternatives_1_1_1 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4343:1: ( ( rule__Number__Alternatives_1_1_1 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4344:1: ( rule__Number__Alternatives_1_1_1 )
            {
             before(grammarAccess.getNumberAccess().getAlternatives_1_1_1()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4345:1: ( rule__Number__Alternatives_1_1_1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4345:2: rule__Number__Alternatives_1_1_1
            {
            pushFollow(FOLLOW_rule__Number__Alternatives_1_1_1_in_rule__Number__Group_1_1__1__Impl8665);
            rule__Number__Alternatives_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getAlternatives_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group_1_1__1__Impl"


    // $ANTLR start "rule__DomainModel__ContextsAssignment"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4360:1: rule__DomainModel__ContextsAssignment : ( ruleContext ) ;
    public final void rule__DomainModel__ContextsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4364:1: ( ( ruleContext ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4365:1: ( ruleContext )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4365:1: ( ruleContext )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4366:1: ruleContext
            {
             before(grammarAccess.getDomainModelAccess().getContextsContextParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleContext_in_rule__DomainModel__ContextsAssignment8704);
            ruleContext();

            state._fsp--;

             after(grammarAccess.getDomainModelAccess().getContextsContextParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainModel__ContextsAssignment"


    // $ANTLR start "rule__Context__NameAssignment_1"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4375:1: rule__Context__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Context__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4379:1: ( ( RULE_ID ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4380:1: ( RULE_ID )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4380:1: ( RULE_ID )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4381:1: RULE_ID
            {
             before(grammarAccess.getContextAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Context__NameAssignment_18735); 
             after(grammarAccess.getContextAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__NameAssignment_1"


    // $ANTLR start "rule__Context__NamespacesAssignment_3"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4390:1: rule__Context__NamespacesAssignment_3 : ( ruleNamespace ) ;
    public final void rule__Context__NamespacesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4394:1: ( ( ruleNamespace ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4395:1: ( ruleNamespace )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4395:1: ( ruleNamespace )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4396:1: ruleNamespace
            {
             before(grammarAccess.getContextAccess().getNamespacesNamespaceParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleNamespace_in_rule__Context__NamespacesAssignment_38766);
            ruleNamespace();

            state._fsp--;

             after(grammarAccess.getContextAccess().getNamespacesNamespaceParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__NamespacesAssignment_3"


    // $ANTLR start "rule__Namespace__NameAssignment_1"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4405:1: rule__Namespace__NameAssignment_1 : ( ruleFQN ) ;
    public final void rule__Namespace__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4409:1: ( ( ruleFQN ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4410:1: ( ruleFQN )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4410:1: ( ruleFQN )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4411:1: ruleFQN
            {
             before(grammarAccess.getNamespaceAccess().getNameFQNParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Namespace__NameAssignment_18797);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getNamespaceAccess().getNameFQNParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__NameAssignment_1"


    // $ANTLR start "rule__Namespace__ImportsAssignment_3"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4420:1: rule__Namespace__ImportsAssignment_3 : ( ruleImport ) ;
    public final void rule__Namespace__ImportsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4424:1: ( ( ruleImport ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4425:1: ( ruleImport )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4425:1: ( ruleImport )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4426:1: ruleImport
            {
             before(grammarAccess.getNamespaceAccess().getImportsImportParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__Namespace__ImportsAssignment_38828);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getNamespaceAccess().getImportsImportParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__ImportsAssignment_3"


    // $ANTLR start "rule__Namespace__ElementsAssignment_4"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4435:1: rule__Namespace__ElementsAssignment_4 : ( ruleAbstractElement ) ;
    public final void rule__Namespace__ElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4439:1: ( ( ruleAbstractElement ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4440:1: ( ruleAbstractElement )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4440:1: ( ruleAbstractElement )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4441:1: ruleAbstractElement
            {
             before(grammarAccess.getNamespaceAccess().getElementsAbstractElementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_rule__Namespace__ElementsAssignment_48859);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getNamespaceAccess().getElementsAbstractElementParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__ElementsAssignment_4"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4450:1: rule__Import__ImportedNamespaceAssignment_1 : ( ( rule__Import__ImportedNamespaceAlternatives_1_0 ) ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4454:1: ( ( ( rule__Import__ImportedNamespaceAlternatives_1_0 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4455:1: ( ( rule__Import__ImportedNamespaceAlternatives_1_0 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4455:1: ( ( rule__Import__ImportedNamespaceAlternatives_1_0 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4456:1: ( rule__Import__ImportedNamespaceAlternatives_1_0 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAlternatives_1_0()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4457:1: ( rule__Import__ImportedNamespaceAlternatives_1_0 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4457:2: rule__Import__ImportedNamespaceAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAlternatives_1_0_in_rule__Import__ImportedNamespaceAssignment_18890);
            rule__Import__ImportedNamespaceAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportedNamespaceAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__Command__DocAssignment_0"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4466:1: rule__Command__DocAssignment_0 : ( RULE_DOC ) ;
    public final void rule__Command__DocAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4470:1: ( ( RULE_DOC ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4471:1: ( RULE_DOC )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4471:1: ( RULE_DOC )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4472:1: RULE_DOC
            {
             before(grammarAccess.getCommandAccess().getDocDOCTerminalRuleCall_0_0()); 
            match(input,RULE_DOC,FOLLOW_RULE_DOC_in_rule__Command__DocAssignment_08923); 
             after(grammarAccess.getCommandAccess().getDocDOCTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__DocAssignment_0"


    // $ANTLR start "rule__Command__NameAssignment_2"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4481:1: rule__Command__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Command__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4485:1: ( ( RULE_ID ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4486:1: ( RULE_ID )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4486:1: ( RULE_ID )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4487:1: RULE_ID
            {
             before(grammarAccess.getCommandAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Command__NameAssignment_28954); 
             after(grammarAccess.getCommandAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__NameAssignment_2"


    // $ANTLR start "rule__Command__TargetAssignment_3_1"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4496:1: rule__Command__TargetAssignment_3_1 : ( ( ruleFQN ) ) ;
    public final void rule__Command__TargetAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4500:1: ( ( ( ruleFQN ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4501:1: ( ( ruleFQN ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4501:1: ( ( ruleFQN ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4502:1: ( ruleFQN )
            {
             before(grammarAccess.getCommandAccess().getTargetAbstractMethodCrossReference_3_1_0()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4503:1: ( ruleFQN )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4504:1: ruleFQN
            {
             before(grammarAccess.getCommandAccess().getTargetAbstractMethodFQNParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Command__TargetAssignment_3_18989);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getCommandAccess().getTargetAbstractMethodFQNParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getCommandAccess().getTargetAbstractMethodCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__TargetAssignment_3_1"


    // $ANTLR start "rule__Command__VariablesAssignment_5"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4515:1: rule__Command__VariablesAssignment_5 : ( ruleVariable ) ;
    public final void rule__Command__VariablesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4519:1: ( ( ruleVariable ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4520:1: ( ruleVariable )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4520:1: ( ruleVariable )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4521:1: ruleVariable
            {
             before(grammarAccess.getCommandAccess().getVariablesVariableParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleVariable_in_rule__Command__VariablesAssignment_59024);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getCommandAccess().getVariablesVariableParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__VariablesAssignment_5"


    // $ANTLR start "rule__Command__MessageAssignment_6_1"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4530:1: rule__Command__MessageAssignment_6_1 : ( RULE_STRING ) ;
    public final void rule__Command__MessageAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4534:1: ( ( RULE_STRING ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4535:1: ( RULE_STRING )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4535:1: ( RULE_STRING )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4536:1: RULE_STRING
            {
             before(grammarAccess.getCommandAccess().getMessageSTRINGTerminalRuleCall_6_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Command__MessageAssignment_6_19055); 
             after(grammarAccess.getCommandAccess().getMessageSTRINGTerminalRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__MessageAssignment_6_1"


    // $ANTLR start "rule__CommandHandler__DocAssignment_0"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4545:1: rule__CommandHandler__DocAssignment_0 : ( RULE_DOC ) ;
    public final void rule__CommandHandler__DocAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4549:1: ( ( RULE_DOC ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4550:1: ( RULE_DOC )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4550:1: ( RULE_DOC )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4551:1: RULE_DOC
            {
             before(grammarAccess.getCommandHandlerAccess().getDocDOCTerminalRuleCall_0_0()); 
            match(input,RULE_DOC,FOLLOW_RULE_DOC_in_rule__CommandHandler__DocAssignment_09086); 
             after(grammarAccess.getCommandHandlerAccess().getDocDOCTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandHandler__DocAssignment_0"


    // $ANTLR start "rule__CommandHandler__NameAssignment_2"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4560:1: rule__CommandHandler__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__CommandHandler__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4564:1: ( ( RULE_ID ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4565:1: ( RULE_ID )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4565:1: ( RULE_ID )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4566:1: RULE_ID
            {
             before(grammarAccess.getCommandHandlerAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CommandHandler__NameAssignment_29117); 
             after(grammarAccess.getCommandHandlerAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandHandler__NameAssignment_2"


    // $ANTLR start "rule__CommandHandler__CommandsAssignment_4"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4575:1: rule__CommandHandler__CommandsAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__CommandHandler__CommandsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4579:1: ( ( ( RULE_ID ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4580:1: ( ( RULE_ID ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4580:1: ( ( RULE_ID ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4581:1: ( RULE_ID )
            {
             before(grammarAccess.getCommandHandlerAccess().getCommandsCommandCrossReference_4_0()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4582:1: ( RULE_ID )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4583:1: RULE_ID
            {
             before(grammarAccess.getCommandHandlerAccess().getCommandsCommandIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CommandHandler__CommandsAssignment_49152); 
             after(grammarAccess.getCommandHandlerAccess().getCommandsCommandIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getCommandHandlerAccess().getCommandsCommandCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandHandler__CommandsAssignment_4"


    // $ANTLR start "rule__CommandHandler__CommandsAssignment_5_1"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4594:1: rule__CommandHandler__CommandsAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__CommandHandler__CommandsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4598:1: ( ( ( RULE_ID ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4599:1: ( ( RULE_ID ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4599:1: ( ( RULE_ID ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4600:1: ( RULE_ID )
            {
             before(grammarAccess.getCommandHandlerAccess().getCommandsCommandCrossReference_5_1_0()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4601:1: ( RULE_ID )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4602:1: RULE_ID
            {
             before(grammarAccess.getCommandHandlerAccess().getCommandsCommandIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CommandHandler__CommandsAssignment_5_19191); 
             after(grammarAccess.getCommandHandlerAccess().getCommandsCommandIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getCommandHandlerAccess().getCommandsCommandCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandHandler__CommandsAssignment_5_1"


    // $ANTLR start "rule__CommandHandler__AggregatesAssignment_6_1"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4613:1: rule__CommandHandler__AggregatesAssignment_6_1 : ( ( ruleFQN ) ) ;
    public final void rule__CommandHandler__AggregatesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4617:1: ( ( ( ruleFQN ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4618:1: ( ( ruleFQN ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4618:1: ( ( ruleFQN ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4619:1: ( ruleFQN )
            {
             before(grammarAccess.getCommandHandlerAccess().getAggregatesAggregateCrossReference_6_1_0()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4620:1: ( ruleFQN )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4621:1: ruleFQN
            {
             before(grammarAccess.getCommandHandlerAccess().getAggregatesAggregateFQNParserRuleCall_6_1_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__CommandHandler__AggregatesAssignment_6_19230);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getCommandHandlerAccess().getAggregatesAggregateFQNParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getCommandHandlerAccess().getAggregatesAggregateCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandHandler__AggregatesAssignment_6_1"


    // $ANTLR start "rule__CommandHandler__AggregatesAssignment_6_2_1"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4632:1: rule__CommandHandler__AggregatesAssignment_6_2_1 : ( ( ruleFQN ) ) ;
    public final void rule__CommandHandler__AggregatesAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4636:1: ( ( ( ruleFQN ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4637:1: ( ( ruleFQN ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4637:1: ( ( ruleFQN ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4638:1: ( ruleFQN )
            {
             before(grammarAccess.getCommandHandlerAccess().getAggregatesAggregateCrossReference_6_2_1_0()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4639:1: ( ruleFQN )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4640:1: ruleFQN
            {
             before(grammarAccess.getCommandHandlerAccess().getAggregatesAggregateFQNParserRuleCall_6_2_1_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__CommandHandler__AggregatesAssignment_6_2_19269);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getCommandHandlerAccess().getAggregatesAggregateFQNParserRuleCall_6_2_1_0_1()); 

            }

             after(grammarAccess.getCommandHandlerAccess().getAggregatesAggregateCrossReference_6_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandHandler__AggregatesAssignment_6_2_1"


    // $ANTLR start "rule__Projection__DocAssignment_0"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4651:1: rule__Projection__DocAssignment_0 : ( RULE_DOC ) ;
    public final void rule__Projection__DocAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4655:1: ( ( RULE_DOC ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4656:1: ( RULE_DOC )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4656:1: ( RULE_DOC )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4657:1: RULE_DOC
            {
             before(grammarAccess.getProjectionAccess().getDocDOCTerminalRuleCall_0_0()); 
            match(input,RULE_DOC,FOLLOW_RULE_DOC_in_rule__Projection__DocAssignment_09304); 
             after(grammarAccess.getProjectionAccess().getDocDOCTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Projection__DocAssignment_0"


    // $ANTLR start "rule__Projection__NameAssignment_2"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4666:1: rule__Projection__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Projection__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4670:1: ( ( RULE_ID ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4671:1: ( RULE_ID )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4671:1: ( RULE_ID )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4672:1: RULE_ID
            {
             before(grammarAccess.getProjectionAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Projection__NameAssignment_29335); 
             after(grammarAccess.getProjectionAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Projection__NameAssignment_2"


    // $ANTLR start "rule__Projection__EventsAssignment_3_1"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4681:1: rule__Projection__EventsAssignment_3_1 : ( ( ruleFQN ) ) ;
    public final void rule__Projection__EventsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4685:1: ( ( ( ruleFQN ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4686:1: ( ( ruleFQN ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4686:1: ( ( ruleFQN ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4687:1: ( ruleFQN )
            {
             before(grammarAccess.getProjectionAccess().getEventsEventCrossReference_3_1_0()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4688:1: ( ruleFQN )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4689:1: ruleFQN
            {
             before(grammarAccess.getProjectionAccess().getEventsEventFQNParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Projection__EventsAssignment_3_19370);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getProjectionAccess().getEventsEventFQNParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getProjectionAccess().getEventsEventCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Projection__EventsAssignment_3_1"


    // $ANTLR start "rule__Projection__EventsAssignment_3_2_1"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4700:1: rule__Projection__EventsAssignment_3_2_1 : ( ( ruleFQN ) ) ;
    public final void rule__Projection__EventsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4704:1: ( ( ( ruleFQN ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4705:1: ( ( ruleFQN ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4705:1: ( ( ruleFQN ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4706:1: ( ruleFQN )
            {
             before(grammarAccess.getProjectionAccess().getEventsEventCrossReference_3_2_1_0()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4707:1: ( ruleFQN )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4708:1: ruleFQN
            {
             before(grammarAccess.getProjectionAccess().getEventsEventFQNParserRuleCall_3_2_1_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Projection__EventsAssignment_3_2_19409);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getProjectionAccess().getEventsEventFQNParserRuleCall_3_2_1_0_1()); 

            }

             after(grammarAccess.getProjectionAccess().getEventsEventCrossReference_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Projection__EventsAssignment_3_2_1"


    // $ANTLR start "rule__View__DocAssignment_0"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4719:1: rule__View__DocAssignment_0 : ( RULE_DOC ) ;
    public final void rule__View__DocAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4723:1: ( ( RULE_DOC ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4724:1: ( RULE_DOC )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4724:1: ( RULE_DOC )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4725:1: RULE_DOC
            {
             before(grammarAccess.getViewAccess().getDocDOCTerminalRuleCall_0_0()); 
            match(input,RULE_DOC,FOLLOW_RULE_DOC_in_rule__View__DocAssignment_09444); 
             after(grammarAccess.getViewAccess().getDocDOCTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__DocAssignment_0"


    // $ANTLR start "rule__View__NameAssignment_2"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4734:1: rule__View__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__View__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4738:1: ( ( RULE_ID ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4739:1: ( RULE_ID )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4739:1: ( RULE_ID )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4740:1: RULE_ID
            {
             before(grammarAccess.getViewAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__View__NameAssignment_29475); 
             after(grammarAccess.getViewAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__NameAssignment_2"


    // $ANTLR start "rule__View__ProjectionAssignment_4"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4749:1: rule__View__ProjectionAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__View__ProjectionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4753:1: ( ( ( RULE_ID ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4754:1: ( ( RULE_ID ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4754:1: ( ( RULE_ID ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4755:1: ( RULE_ID )
            {
             before(grammarAccess.getViewAccess().getProjectionProjectionCrossReference_4_0()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4756:1: ( RULE_ID )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4757:1: RULE_ID
            {
             before(grammarAccess.getViewAccess().getProjectionProjectionIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__View__ProjectionAssignment_49510); 
             after(grammarAccess.getViewAccess().getProjectionProjectionIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getViewAccess().getProjectionProjectionCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__ProjectionAssignment_4"


    // $ANTLR start "rule__TypeMetaInfo__SlabelAssignment_1_1"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4768:1: rule__TypeMetaInfo__SlabelAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__TypeMetaInfo__SlabelAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4772:1: ( ( RULE_STRING ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4773:1: ( RULE_STRING )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4773:1: ( RULE_STRING )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4774:1: RULE_STRING
            {
             before(grammarAccess.getTypeMetaInfoAccess().getSlabelSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TypeMetaInfo__SlabelAssignment_1_19545); 
             after(grammarAccess.getTypeMetaInfoAccess().getSlabelSTRINGTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMetaInfo__SlabelAssignment_1_1"


    // $ANTLR start "rule__TypeMetaInfo__LabelAssignment_2_1"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4783:1: rule__TypeMetaInfo__LabelAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__TypeMetaInfo__LabelAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4787:1: ( ( RULE_STRING ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4788:1: ( RULE_STRING )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4788:1: ( RULE_STRING )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4789:1: RULE_STRING
            {
             before(grammarAccess.getTypeMetaInfoAccess().getLabelSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TypeMetaInfo__LabelAssignment_2_19576); 
             after(grammarAccess.getTypeMetaInfoAccess().getLabelSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMetaInfo__LabelAssignment_2_1"


    // $ANTLR start "rule__TypeMetaInfo__TooltipAssignment_3_1"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4798:1: rule__TypeMetaInfo__TooltipAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__TypeMetaInfo__TooltipAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4802:1: ( ( RULE_STRING ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4803:1: ( RULE_STRING )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4803:1: ( RULE_STRING )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4804:1: RULE_STRING
            {
             before(grammarAccess.getTypeMetaInfoAccess().getTooltipSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TypeMetaInfo__TooltipAssignment_3_19607); 
             after(grammarAccess.getTypeMetaInfoAccess().getTooltipSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMetaInfo__TooltipAssignment_3_1"


    // $ANTLR start "rule__TypeMetaInfo__PromptAssignment_4_1"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4813:1: rule__TypeMetaInfo__PromptAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__TypeMetaInfo__PromptAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4817:1: ( ( RULE_STRING ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4818:1: ( RULE_STRING )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4818:1: ( RULE_STRING )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4819:1: RULE_STRING
            {
             before(grammarAccess.getTypeMetaInfoAccess().getPromptSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TypeMetaInfo__PromptAssignment_4_19638); 
             after(grammarAccess.getTypeMetaInfoAccess().getPromptSTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMetaInfo__PromptAssignment_4_1"


    // $ANTLR start "rule__TypeMetaInfo__ExamplesAssignment_5_1"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4828:1: rule__TypeMetaInfo__ExamplesAssignment_5_1 : ( ruleLiteral ) ;
    public final void rule__TypeMetaInfo__ExamplesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4832:1: ( ( ruleLiteral ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4833:1: ( ruleLiteral )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4833:1: ( ruleLiteral )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4834:1: ruleLiteral
            {
             before(grammarAccess.getTypeMetaInfoAccess().getExamplesLiteralParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleLiteral_in_rule__TypeMetaInfo__ExamplesAssignment_5_19669);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getTypeMetaInfoAccess().getExamplesLiteralParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeMetaInfo__ExamplesAssignment_5_1"


    // $ANTLR start "rule__Variable__DocAssignment_0"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4843:1: rule__Variable__DocAssignment_0 : ( RULE_DOC ) ;
    public final void rule__Variable__DocAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4847:1: ( ( RULE_DOC ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4848:1: ( RULE_DOC )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4848:1: ( RULE_DOC )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4849:1: RULE_DOC
            {
             before(grammarAccess.getVariableAccess().getDocDOCTerminalRuleCall_0_0()); 
            match(input,RULE_DOC,FOLLOW_RULE_DOC_in_rule__Variable__DocAssignment_09700); 
             after(grammarAccess.getVariableAccess().getDocDOCTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__DocAssignment_0"


    // $ANTLR start "rule__Variable__NullableAssignment_1"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4858:1: rule__Variable__NullableAssignment_1 : ( ( 'nullable' ) ) ;
    public final void rule__Variable__NullableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4862:1: ( ( ( 'nullable' ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4863:1: ( ( 'nullable' ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4863:1: ( ( 'nullable' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4864:1: ( 'nullable' )
            {
             before(grammarAccess.getVariableAccess().getNullableNullableKeyword_1_0()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4865:1: ( 'nullable' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4866:1: 'nullable'
            {
             before(grammarAccess.getVariableAccess().getNullableNullableKeyword_1_0()); 
            match(input,40,FOLLOW_40_in_rule__Variable__NullableAssignment_19736); 
             after(grammarAccess.getVariableAccess().getNullableNullableKeyword_1_0()); 

            }

             after(grammarAccess.getVariableAccess().getNullableNullableKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__NullableAssignment_1"


    // $ANTLR start "rule__Variable__TypeAssignment_2"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4881:1: rule__Variable__TypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Variable__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4885:1: ( ( ( RULE_ID ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4886:1: ( ( RULE_ID ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4886:1: ( ( RULE_ID ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4887:1: ( RULE_ID )
            {
             before(grammarAccess.getVariableAccess().getTypeTypeCrossReference_2_0()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4888:1: ( RULE_ID )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4889:1: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getTypeTypeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Variable__TypeAssignment_29779); 
             after(grammarAccess.getVariableAccess().getTypeTypeIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getVariableAccess().getTypeTypeCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__TypeAssignment_2"


    // $ANTLR start "rule__Variable__MultiplicityAssignment_3"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4900:1: rule__Variable__MultiplicityAssignment_3 : ( ( '*' ) ) ;
    public final void rule__Variable__MultiplicityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4904:1: ( ( ( '*' ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4905:1: ( ( '*' ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4905:1: ( ( '*' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4906:1: ( '*' )
            {
             before(grammarAccess.getVariableAccess().getMultiplicityAsteriskKeyword_3_0()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4907:1: ( '*' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4908:1: '*'
            {
             before(grammarAccess.getVariableAccess().getMultiplicityAsteriskKeyword_3_0()); 
            match(input,39,FOLLOW_39_in_rule__Variable__MultiplicityAssignment_39819); 
             after(grammarAccess.getVariableAccess().getMultiplicityAsteriskKeyword_3_0()); 

            }

             after(grammarAccess.getVariableAccess().getMultiplicityAsteriskKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__MultiplicityAssignment_3"


    // $ANTLR start "rule__Variable__NameAssignment_4"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4923:1: rule__Variable__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4927:1: ( ( RULE_ID ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4928:1: ( RULE_ID )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4928:1: ( RULE_ID )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4929:1: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Variable__NameAssignment_49858); 
             after(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__NameAssignment_4"


    // $ANTLR start "rule__Variable__InvariantsAssignment_5"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4938:1: rule__Variable__InvariantsAssignment_5 : ( ruleInvariants ) ;
    public final void rule__Variable__InvariantsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4942:1: ( ( ruleInvariants ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4943:1: ( ruleInvariants )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4943:1: ( ruleInvariants )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4944:1: ruleInvariants
            {
             before(grammarAccess.getVariableAccess().getInvariantsInvariantsParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleInvariants_in_rule__Variable__InvariantsAssignment_59889);
            ruleInvariants();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getInvariantsInvariantsParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__InvariantsAssignment_5"


    // $ANTLR start "rule__Variable__OverriddenAssignment_6"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4953:1: rule__Variable__OverriddenAssignment_6 : ( ruleOverriddenTypeMetaInfo ) ;
    public final void rule__Variable__OverriddenAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4957:1: ( ( ruleOverriddenTypeMetaInfo ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4958:1: ( ruleOverriddenTypeMetaInfo )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4958:1: ( ruleOverriddenTypeMetaInfo )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4959:1: ruleOverriddenTypeMetaInfo
            {
             before(grammarAccess.getVariableAccess().getOverriddenOverriddenTypeMetaInfoParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleOverriddenTypeMetaInfo_in_rule__Variable__OverriddenAssignment_69920);
            ruleOverriddenTypeMetaInfo();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getOverriddenOverriddenTypeMetaInfoParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__OverriddenAssignment_6"


    // $ANTLR start "rule__Invariants__CallsAssignment_1"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4968:1: rule__Invariants__CallsAssignment_1 : ( ruleConstraintCall ) ;
    public final void rule__Invariants__CallsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4972:1: ( ( ruleConstraintCall ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4973:1: ( ruleConstraintCall )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4973:1: ( ruleConstraintCall )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4974:1: ruleConstraintCall
            {
             before(grammarAccess.getInvariantsAccess().getCallsConstraintCallParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleConstraintCall_in_rule__Invariants__CallsAssignment_19951);
            ruleConstraintCall();

            state._fsp--;

             after(grammarAccess.getInvariantsAccess().getCallsConstraintCallParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariants__CallsAssignment_1"


    // $ANTLR start "rule__Invariants__CallsAssignment_2_1"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4983:1: rule__Invariants__CallsAssignment_2_1 : ( ruleConstraintCall ) ;
    public final void rule__Invariants__CallsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4987:1: ( ( ruleConstraintCall ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4988:1: ( ruleConstraintCall )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4988:1: ( ruleConstraintCall )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4989:1: ruleConstraintCall
            {
             before(grammarAccess.getInvariantsAccess().getCallsConstraintCallParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleConstraintCall_in_rule__Invariants__CallsAssignment_2_19982);
            ruleConstraintCall();

            state._fsp--;

             after(grammarAccess.getInvariantsAccess().getCallsConstraintCallParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariants__CallsAssignment_2_1"


    // $ANTLR start "rule__OverriddenTypeMetaInfo__MetaInfoAssignment_1"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4998:1: rule__OverriddenTypeMetaInfo__MetaInfoAssignment_1 : ( ruleTypeMetaInfo ) ;
    public final void rule__OverriddenTypeMetaInfo__MetaInfoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5002:1: ( ( ruleTypeMetaInfo ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5003:1: ( ruleTypeMetaInfo )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5003:1: ( ruleTypeMetaInfo )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5004:1: ruleTypeMetaInfo
            {
             before(grammarAccess.getOverriddenTypeMetaInfoAccess().getMetaInfoTypeMetaInfoParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTypeMetaInfo_in_rule__OverriddenTypeMetaInfo__MetaInfoAssignment_110013);
            ruleTypeMetaInfo();

            state._fsp--;

             after(grammarAccess.getOverriddenTypeMetaInfoAccess().getMetaInfoTypeMetaInfoParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OverriddenTypeMetaInfo__MetaInfoAssignment_1"


    // $ANTLR start "rule__ConstraintCall__ConstraintAssignment_0"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5013:1: rule__ConstraintCall__ConstraintAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ConstraintCall__ConstraintAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5017:1: ( ( ( RULE_ID ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5018:1: ( ( RULE_ID ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5018:1: ( ( RULE_ID ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5019:1: ( RULE_ID )
            {
             before(grammarAccess.getConstraintCallAccess().getConstraintConstraintCrossReference_0_0()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5020:1: ( RULE_ID )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5021:1: RULE_ID
            {
             before(grammarAccess.getConstraintCallAccess().getConstraintConstraintIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ConstraintCall__ConstraintAssignment_010048); 
             after(grammarAccess.getConstraintCallAccess().getConstraintConstraintIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getConstraintCallAccess().getConstraintConstraintCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintCall__ConstraintAssignment_0"


    // $ANTLR start "rule__ConstraintCall__ParamsAssignment_1_1"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5032:1: rule__ConstraintCall__ParamsAssignment_1_1 : ( ruleLiteral ) ;
    public final void rule__ConstraintCall__ParamsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5036:1: ( ( ruleLiteral ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5037:1: ( ruleLiteral )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5037:1: ( ruleLiteral )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5038:1: ruleLiteral
            {
             before(grammarAccess.getConstraintCallAccess().getParamsLiteralParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleLiteral_in_rule__ConstraintCall__ParamsAssignment_1_110083);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getConstraintCallAccess().getParamsLiteralParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintCall__ParamsAssignment_1_1"


    // $ANTLR start "rule__ConstraintCall__ParamsAssignment_1_2_1"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5047:1: rule__ConstraintCall__ParamsAssignment_1_2_1 : ( ruleLiteral ) ;
    public final void rule__ConstraintCall__ParamsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5051:1: ( ( ruleLiteral ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5052:1: ( ruleLiteral )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5052:1: ( ruleLiteral )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5053:1: ruleLiteral
            {
             before(grammarAccess.getConstraintCallAccess().getParamsLiteralParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_ruleLiteral_in_rule__ConstraintCall__ParamsAssignment_1_2_110114);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getConstraintCallAccess().getParamsLiteralParserRuleCall_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintCall__ParamsAssignment_1_2_1"


    // $ANTLR start "rule__BooleanLiteral__ValueAssignment_1"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5062:1: rule__BooleanLiteral__ValueAssignment_1 : ( ( rule__BooleanLiteral__ValueAlternatives_1_0 ) ) ;
    public final void rule__BooleanLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5066:1: ( ( ( rule__BooleanLiteral__ValueAlternatives_1_0 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5067:1: ( ( rule__BooleanLiteral__ValueAlternatives_1_0 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5067:1: ( ( rule__BooleanLiteral__ValueAlternatives_1_0 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5068:1: ( rule__BooleanLiteral__ValueAlternatives_1_0 )
            {
             before(grammarAccess.getBooleanLiteralAccess().getValueAlternatives_1_0()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5069:1: ( rule__BooleanLiteral__ValueAlternatives_1_0 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5069:2: rule__BooleanLiteral__ValueAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__BooleanLiteral__ValueAlternatives_1_0_in_rule__BooleanLiteral__ValueAssignment_110145);
            rule__BooleanLiteral__ValueAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanLiteralAccess().getValueAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanLiteral__ValueAssignment_1"


    // $ANTLR start "rule__NullLiteral__ValueAssignment_1"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5078:1: rule__NullLiteral__ValueAssignment_1 : ( ( 'null' ) ) ;
    public final void rule__NullLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5082:1: ( ( ( 'null' ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5083:1: ( ( 'null' ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5083:1: ( ( 'null' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5084:1: ( 'null' )
            {
             before(grammarAccess.getNullLiteralAccess().getValueNullKeyword_1_0()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5085:1: ( 'null' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5086:1: 'null'
            {
             before(grammarAccess.getNullLiteralAccess().getValueNullKeyword_1_0()); 
            match(input,41,FOLLOW_41_in_rule__NullLiteral__ValueAssignment_110183); 
             after(grammarAccess.getNullLiteralAccess().getValueNullKeyword_1_0()); 

            }

             after(grammarAccess.getNullLiteralAccess().getValueNullKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullLiteral__ValueAssignment_1"


    // $ANTLR start "rule__NumberLiteral__ValueAssignment_1"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5101:1: rule__NumberLiteral__ValueAssignment_1 : ( ruleNumber ) ;
    public final void rule__NumberLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5105:1: ( ( ruleNumber ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5106:1: ( ruleNumber )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5106:1: ( ruleNumber )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5107:1: ruleNumber
            {
             before(grammarAccess.getNumberLiteralAccess().getValueNumberParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleNumber_in_rule__NumberLiteral__ValueAssignment_110222);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getNumberLiteralAccess().getValueNumberParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberLiteral__ValueAssignment_1"


    // $ANTLR start "rule__StringLiteral__ValueAssignment_1"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5116:1: rule__StringLiteral__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5120:1: ( ( RULE_STRING ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5121:1: ( RULE_STRING )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5121:1: ( RULE_STRING )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5122:1: RULE_STRING
            {
             before(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment_110253); 
             after(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__ValueAssignment_1"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String DFA2_eotS =
        "\6\uffff";
    static final String DFA2_eofS =
        "\1\uffff\1\3\3\uffff\1\3";
    static final String DFA2_minS =
        "\1\7\1\10\1\7\2\uffff\1\10";
    static final String DFA2_maxS =
        "\1\7\1\46\1\47\2\uffff\1\46";
    static final String DFA2_acceptS =
        "\3\uffff\1\1\1\2\1\uffff";
    static final String DFA2_specialS =
        "\6\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\1",
            "\1\3\10\uffff\1\3\1\uffff\2\3\2\uffff\1\3\3\uffff\1\3\1\uffff\1\3\10\uffff\1\2",
            "\1\5\37\uffff\1\4",
            "",
            "",
            "\1\3\10\uffff\1\3\1\uffff\2\3\2\uffff\1\3\3\uffff\1\3\1\uffff\1\3\10\uffff\1\2"
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
            return "684:1: rule__Import__ImportedNamespaceAlternatives_1_0 : ( ( ruleFQN ) | ( ruleFQNWithWildcard ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleDomainModel_in_entryRuleDomainModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainModel__ContextsAssignment_in_ruleDomainModel94 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleContext_in_entryRuleContext122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContext129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Context__Group__0_in_ruleContext155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespace_in_entryRuleNamespace182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamespace189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__Group__0_in_ruleNamespace215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractElement__Alternatives_in_ruleAbstractElement335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_entryRuleCommand362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommand369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group__0_in_ruleCommand395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandHandler_in_entryRuleCommandHandler422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommandHandler429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandHandler__Group__0_in_ruleCommandHandler455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProjection_in_entryRuleProjection482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProjection489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Projection__Group__0_in_ruleProjection515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleView_in_entryRuleView542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleView549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group__0_in_ruleView575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeMetaInfo_in_entryRuleTypeMetaInfo602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeMetaInfo609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group__0_in_ruleTypeMetaInfo635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group__0_in_ruleVariable695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvariants_in_entryRuleInvariants722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInvariants729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Invariants__Group__0_in_ruleInvariants755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOverriddenTypeMetaInfo_in_entryRuleOverriddenTypeMetaInfo782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOverriddenTypeMetaInfo789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OverriddenTypeMetaInfo__Group__0_in_ruleOverriddenTypeMetaInfo815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraintCall_in_entryRuleConstraintCall842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraintCall849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintCall__Group__0_in_ruleConstraintCall875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Alternatives_in_ruleLiteral935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanLiteral__Group__0_in_ruleBooleanLiteral995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral1022 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullLiteral1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NullLiteral__Group__0_in_ruleNullLiteral1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral1082 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberLiteral1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberLiteral__Group__0_in_ruleNumberLiteral1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1142 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__Group__0_in_ruleStringLiteral1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN1202 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0_in_ruleFQN1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQNWithWildcard_in_entryRuleFQNWithWildcard1262 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQNWithWildcard1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQNWithWildcard__Group__0_in_ruleFQNWithWildcard1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber1327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Alternatives_in_ruleNumber1364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Import__ImportedNamespaceAlternatives_1_01400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQNWithWildcard_in_rule__Import__ImportedNamespaceAlternatives_1_01417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_rule__AbstractElement__Alternatives1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandHandler_in_rule__AbstractElement__Alternatives1466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProjection_in_rule__AbstractElement__Alternatives1483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleView_in_rule__AbstractElement__Alternatives1500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_rule__Literal__Alternatives1532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_rule__Literal__Alternatives1549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_rule__Literal__Alternatives1566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rule__Literal__Alternatives1583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__BooleanLiteral__ValueAlternatives_1_01616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__BooleanLiteral__ValueAlternatives_1_01636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_rule__Number__Alternatives1670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Group_1__0_in_rule__Number__Alternatives1687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Number__Alternatives_1_01720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_rule__Number__Alternatives_1_01737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Number__Alternatives_1_1_11769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_rule__Number__Alternatives_1_1_11786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Context__Group__0__Impl_in_rule__Context__Group__01816 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Context__Group__1_in_rule__Context__Group__01819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Context__Group__0__Impl1847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Context__Group__1__Impl_in_rule__Context__Group__11878 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Context__Group__2_in_rule__Context__Group__11881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Context__NameAssignment_1_in_rule__Context__Group__1__Impl1908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Context__Group__2__Impl_in_rule__Context__Group__21938 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_rule__Context__Group__3_in_rule__Context__Group__21941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Context__Group__2__Impl1969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Context__Group__3__Impl_in_rule__Context__Group__32000 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_rule__Context__Group__4_in_rule__Context__Group__32003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Context__NamespacesAssignment_3_in_rule__Context__Group__3__Impl2030 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__Context__Group__4__Impl_in_rule__Context__Group__42061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Context__Group__4__Impl2089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__Group__0__Impl_in_rule__Namespace__Group__02130 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Namespace__Group__1_in_rule__Namespace__Group__02133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Namespace__Group__0__Impl2161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__Group__1__Impl_in_rule__Namespace__Group__12192 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Namespace__Group__2_in_rule__Namespace__Group__12195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__NameAssignment_1_in_rule__Namespace__Group__1__Impl2222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__Group__2__Impl_in_rule__Namespace__Group__22252 = new BitSet(new long[]{0x00000000289A0100L});
    public static final BitSet FOLLOW_rule__Namespace__Group__3_in_rule__Namespace__Group__22255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Namespace__Group__2__Impl2283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__Group__3__Impl_in_rule__Namespace__Group__32314 = new BitSet(new long[]{0x00000000289A0100L});
    public static final BitSet FOLLOW_rule__Namespace__Group__4_in_rule__Namespace__Group__32317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__ImportsAssignment_3_in_rule__Namespace__Group__3__Impl2344 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__Namespace__Group__4__Impl_in_rule__Namespace__Group__42375 = new BitSet(new long[]{0x00000000289A0100L});
    public static final BitSet FOLLOW_rule__Namespace__Group__5_in_rule__Namespace__Group__42378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__ElementsAssignment_4_in_rule__Namespace__Group__4__Impl2405 = new BitSet(new long[]{0x0000000028900102L});
    public static final BitSet FOLLOW_rule__Namespace__Group__5__Impl_in_rule__Namespace__Group__52436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Namespace__Group__5__Impl2464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02507 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Import__Group__0__Impl2538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl2596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group__0__Impl_in_rule__Command__Group__02630 = new BitSet(new long[]{0x0000000000100100L});
    public static final BitSet FOLLOW_rule__Command__Group__1_in_rule__Command__Group__02633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__DocAssignment_0_in_rule__Command__Group__0__Impl2660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group__1__Impl_in_rule__Command__Group__12691 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Command__Group__2_in_rule__Command__Group__12694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Command__Group__1__Impl2722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group__2__Impl_in_rule__Command__Group__22753 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_rule__Command__Group__3_in_rule__Command__Group__22756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__NameAssignment_2_in_rule__Command__Group__2__Impl2783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group__3__Impl_in_rule__Command__Group__32813 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_rule__Command__Group__4_in_rule__Command__Group__32816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_3__0_in_rule__Command__Group__3__Impl2843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group__4__Impl_in_rule__Command__Group__42874 = new BitSet(new long[]{0x0000010000420180L});
    public static final BitSet FOLLOW_rule__Command__Group__5_in_rule__Command__Group__42877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Command__Group__4__Impl2905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group__5__Impl_in_rule__Command__Group__52936 = new BitSet(new long[]{0x0000010000420180L});
    public static final BitSet FOLLOW_rule__Command__Group__6_in_rule__Command__Group__52939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__VariablesAssignment_5_in_rule__Command__Group__5__Impl2966 = new BitSet(new long[]{0x0000010000000182L});
    public static final BitSet FOLLOW_rule__Command__Group__6__Impl_in_rule__Command__Group__62997 = new BitSet(new long[]{0x0000010000420180L});
    public static final BitSet FOLLOW_rule__Command__Group__7_in_rule__Command__Group__63000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_6__0_in_rule__Command__Group__6__Impl3027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group__7__Impl_in_rule__Command__Group__73058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Command__Group__7__Impl3086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_3__0__Impl_in_rule__Command__Group_3__03133 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Command__Group_3__1_in_rule__Command__Group_3__03136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Command__Group_3__0__Impl3164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_3__1__Impl_in_rule__Command__Group_3__13195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__TargetAssignment_3_1_in_rule__Command__Group_3__1__Impl3222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_6__0__Impl_in_rule__Command__Group_6__03256 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Command__Group_6__1_in_rule__Command__Group_6__03259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Command__Group_6__0__Impl3287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_6__1__Impl_in_rule__Command__Group_6__13318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__MessageAssignment_6_1_in_rule__Command__Group_6__1__Impl3345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandHandler__Group__0__Impl_in_rule__CommandHandler__Group__03379 = new BitSet(new long[]{0x0000000000800100L});
    public static final BitSet FOLLOW_rule__CommandHandler__Group__1_in_rule__CommandHandler__Group__03382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandHandler__DocAssignment_0_in_rule__CommandHandler__Group__0__Impl3409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandHandler__Group__1__Impl_in_rule__CommandHandler__Group__13440 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__CommandHandler__Group__2_in_rule__CommandHandler__Group__13443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__CommandHandler__Group__1__Impl3471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandHandler__Group__2__Impl_in_rule__CommandHandler__Group__23502 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__CommandHandler__Group__3_in_rule__CommandHandler__Group__23505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandHandler__NameAssignment_2_in_rule__CommandHandler__Group__2__Impl3532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandHandler__Group__3__Impl_in_rule__CommandHandler__Group__33562 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__CommandHandler__Group__4_in_rule__CommandHandler__Group__33565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__CommandHandler__Group__3__Impl3593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandHandler__Group__4__Impl_in_rule__CommandHandler__Group__43624 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_rule__CommandHandler__Group__5_in_rule__CommandHandler__Group__43627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandHandler__CommandsAssignment_4_in_rule__CommandHandler__Group__4__Impl3654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandHandler__Group__5__Impl_in_rule__CommandHandler__Group__53684 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_rule__CommandHandler__Group__6_in_rule__CommandHandler__Group__53687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandHandler__Group_5__0_in_rule__CommandHandler__Group__5__Impl3714 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__CommandHandler__Group__6__Impl_in_rule__CommandHandler__Group__63745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandHandler__Group_6__0_in_rule__CommandHandler__Group__6__Impl3772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandHandler__Group_5__0__Impl_in_rule__CommandHandler__Group_5__03817 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__CommandHandler__Group_5__1_in_rule__CommandHandler__Group_5__03820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__CommandHandler__Group_5__0__Impl3848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandHandler__Group_5__1__Impl_in_rule__CommandHandler__Group_5__13879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandHandler__CommandsAssignment_5_1_in_rule__CommandHandler__Group_5__1__Impl3906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandHandler__Group_6__0__Impl_in_rule__CommandHandler__Group_6__03940 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__CommandHandler__Group_6__1_in_rule__CommandHandler__Group_6__03943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__CommandHandler__Group_6__0__Impl3971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandHandler__Group_6__1__Impl_in_rule__CommandHandler__Group_6__14002 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__CommandHandler__Group_6__2_in_rule__CommandHandler__Group_6__14005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandHandler__AggregatesAssignment_6_1_in_rule__CommandHandler__Group_6__1__Impl4032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandHandler__Group_6__2__Impl_in_rule__CommandHandler__Group_6__24062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandHandler__Group_6_2__0_in_rule__CommandHandler__Group_6__2__Impl4089 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__CommandHandler__Group_6_2__0__Impl_in_rule__CommandHandler__Group_6_2__04126 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__CommandHandler__Group_6_2__1_in_rule__CommandHandler__Group_6_2__04129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__CommandHandler__Group_6_2__0__Impl4157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandHandler__Group_6_2__1__Impl_in_rule__CommandHandler__Group_6_2__14188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandHandler__AggregatesAssignment_6_2_1_in_rule__CommandHandler__Group_6_2__1__Impl4215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Projection__Group__0__Impl_in_rule__Projection__Group__04249 = new BitSet(new long[]{0x0000000008000100L});
    public static final BitSet FOLLOW_rule__Projection__Group__1_in_rule__Projection__Group__04252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Projection__DocAssignment_0_in_rule__Projection__Group__0__Impl4279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Projection__Group__1__Impl_in_rule__Projection__Group__14310 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Projection__Group__2_in_rule__Projection__Group__14313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Projection__Group__1__Impl4341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Projection__Group__2__Impl_in_rule__Projection__Group__24372 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Projection__Group__3_in_rule__Projection__Group__24375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Projection__NameAssignment_2_in_rule__Projection__Group__2__Impl4402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Projection__Group__3__Impl_in_rule__Projection__Group__34432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Projection__Group_3__0_in_rule__Projection__Group__3__Impl4459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Projection__Group_3__0__Impl_in_rule__Projection__Group_3__04498 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Projection__Group_3__1_in_rule__Projection__Group_3__04501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Projection__Group_3__0__Impl4529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Projection__Group_3__1__Impl_in_rule__Projection__Group_3__14560 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Projection__Group_3__2_in_rule__Projection__Group_3__14563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Projection__EventsAssignment_3_1_in_rule__Projection__Group_3__1__Impl4590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Projection__Group_3__2__Impl_in_rule__Projection__Group_3__24620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Projection__Group_3_2__0_in_rule__Projection__Group_3__2__Impl4647 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Projection__Group_3_2__0__Impl_in_rule__Projection__Group_3_2__04684 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Projection__Group_3_2__1_in_rule__Projection__Group_3_2__04687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Projection__Group_3_2__0__Impl4715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Projection__Group_3_2__1__Impl_in_rule__Projection__Group_3_2__14746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Projection__EventsAssignment_3_2_1_in_rule__Projection__Group_3_2__1__Impl4773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group__0__Impl_in_rule__View__Group__04807 = new BitSet(new long[]{0x0000000028900100L});
    public static final BitSet FOLLOW_rule__View__Group__1_in_rule__View__Group__04810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__DocAssignment_0_in_rule__View__Group__0__Impl4837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group__1__Impl_in_rule__View__Group__14868 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__View__Group__2_in_rule__View__Group__14871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__View__Group__1__Impl4899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group__2__Impl_in_rule__View__Group__24930 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__View__Group__3_in_rule__View__Group__24933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__NameAssignment_2_in_rule__View__Group__2__Impl4960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group__3__Impl_in_rule__View__Group__34990 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__View__Group__4_in_rule__View__Group__34993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__View__Group__3__Impl5021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group__4__Impl_in_rule__View__Group__45052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__ProjectionAssignment_4_in_rule__View__Group__4__Impl5079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group__0__Impl_in_rule__TypeMetaInfo__Group__05119 = new BitSet(new long[]{0x00000007C0000000L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group__1_in_rule__TypeMetaInfo__Group__05122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group__1__Impl_in_rule__TypeMetaInfo__Group__15180 = new BitSet(new long[]{0x00000007C0000000L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group__2_in_rule__TypeMetaInfo__Group__15183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group_1__0_in_rule__TypeMetaInfo__Group__1__Impl5210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group__2__Impl_in_rule__TypeMetaInfo__Group__25241 = new BitSet(new long[]{0x00000007C0000000L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group__3_in_rule__TypeMetaInfo__Group__25244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group_2__0_in_rule__TypeMetaInfo__Group__2__Impl5271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group__3__Impl_in_rule__TypeMetaInfo__Group__35302 = new BitSet(new long[]{0x00000007C0000000L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group__4_in_rule__TypeMetaInfo__Group__35305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group_3__0_in_rule__TypeMetaInfo__Group__3__Impl5332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group__4__Impl_in_rule__TypeMetaInfo__Group__45363 = new BitSet(new long[]{0x00000007C0000000L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group__5_in_rule__TypeMetaInfo__Group__45366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group_4__0_in_rule__TypeMetaInfo__Group__4__Impl5393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group__5__Impl_in_rule__TypeMetaInfo__Group__55424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group_5__0_in_rule__TypeMetaInfo__Group__5__Impl5451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group_1__0__Impl_in_rule__TypeMetaInfo__Group_1__05494 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group_1__1_in_rule__TypeMetaInfo__Group_1__05497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__TypeMetaInfo__Group_1__0__Impl5525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group_1__1__Impl_in_rule__TypeMetaInfo__Group_1__15556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__SlabelAssignment_1_1_in_rule__TypeMetaInfo__Group_1__1__Impl5583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group_2__0__Impl_in_rule__TypeMetaInfo__Group_2__05617 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group_2__1_in_rule__TypeMetaInfo__Group_2__05620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__TypeMetaInfo__Group_2__0__Impl5648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group_2__1__Impl_in_rule__TypeMetaInfo__Group_2__15679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__LabelAssignment_2_1_in_rule__TypeMetaInfo__Group_2__1__Impl5706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group_3__0__Impl_in_rule__TypeMetaInfo__Group_3__05740 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group_3__1_in_rule__TypeMetaInfo__Group_3__05743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__TypeMetaInfo__Group_3__0__Impl5771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group_3__1__Impl_in_rule__TypeMetaInfo__Group_3__15802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__TooltipAssignment_3_1_in_rule__TypeMetaInfo__Group_3__1__Impl5829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group_4__0__Impl_in_rule__TypeMetaInfo__Group_4__05863 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group_4__1_in_rule__TypeMetaInfo__Group_4__05866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__TypeMetaInfo__Group_4__0__Impl5894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group_4__1__Impl_in_rule__TypeMetaInfo__Group_4__15925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__PromptAssignment_4_1_in_rule__TypeMetaInfo__Group_4__1__Impl5952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group_5__0__Impl_in_rule__TypeMetaInfo__Group_5__05986 = new BitSet(new long[]{0x0000020000006270L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group_5__1_in_rule__TypeMetaInfo__Group_5__05989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__TypeMetaInfo__Group_5__0__Impl6017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group_5__1__Impl_in_rule__TypeMetaInfo__Group_5__16048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__ExamplesAssignment_5_1_in_rule__TypeMetaInfo__Group_5__1__Impl6075 = new BitSet(new long[]{0x0000020000006272L});
    public static final BitSet FOLLOW_rule__Variable__Group__0__Impl_in_rule__Variable__Group__06110 = new BitSet(new long[]{0x0000010000000180L});
    public static final BitSet FOLLOW_rule__Variable__Group__1_in_rule__Variable__Group__06113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__DocAssignment_0_in_rule__Variable__Group__0__Impl6140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group__1__Impl_in_rule__Variable__Group__16171 = new BitSet(new long[]{0x0000010000000180L});
    public static final BitSet FOLLOW_rule__Variable__Group__2_in_rule__Variable__Group__16174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__NullableAssignment_1_in_rule__Variable__Group__1__Impl6201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group__2__Impl_in_rule__Variable__Group__26232 = new BitSet(new long[]{0x0000008000000080L});
    public static final BitSet FOLLOW_rule__Variable__Group__3_in_rule__Variable__Group__26235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__TypeAssignment_2_in_rule__Variable__Group__2__Impl6262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group__3__Impl_in_rule__Variable__Group__36292 = new BitSet(new long[]{0x0000008000000080L});
    public static final BitSet FOLLOW_rule__Variable__Group__4_in_rule__Variable__Group__36295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__MultiplicityAssignment_3_in_rule__Variable__Group__3__Impl6322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group__4__Impl_in_rule__Variable__Group__46353 = new BitSet(new long[]{0x0000000800010000L});
    public static final BitSet FOLLOW_rule__Variable__Group__5_in_rule__Variable__Group__46356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__NameAssignment_4_in_rule__Variable__Group__4__Impl6383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group__5__Impl_in_rule__Variable__Group__56413 = new BitSet(new long[]{0x0000000800010000L});
    public static final BitSet FOLLOW_rule__Variable__Group__6_in_rule__Variable__Group__56416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__InvariantsAssignment_5_in_rule__Variable__Group__5__Impl6443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__Group__6__Impl_in_rule__Variable__Group__66474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__OverriddenAssignment_6_in_rule__Variable__Group__6__Impl6501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Invariants__Group__0__Impl_in_rule__Invariants__Group__06546 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Invariants__Group__1_in_rule__Invariants__Group__06549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Invariants__Group__0__Impl6577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Invariants__Group__1__Impl_in_rule__Invariants__Group__16608 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Invariants__Group__2_in_rule__Invariants__Group__16611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Invariants__CallsAssignment_1_in_rule__Invariants__Group__1__Impl6638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Invariants__Group__2__Impl_in_rule__Invariants__Group__26668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Invariants__Group_2__0_in_rule__Invariants__Group__2__Impl6695 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Invariants__Group_2__0__Impl_in_rule__Invariants__Group_2__06732 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Invariants__Group_2__1_in_rule__Invariants__Group_2__06735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Invariants__Group_2__0__Impl6763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Invariants__Group_2__1__Impl_in_rule__Invariants__Group_2__16794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Invariants__CallsAssignment_2_1_in_rule__Invariants__Group_2__1__Impl6821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OverriddenTypeMetaInfo__Group__0__Impl_in_rule__OverriddenTypeMetaInfo__Group__06855 = new BitSet(new long[]{0x00000007C0000000L});
    public static final BitSet FOLLOW_rule__OverriddenTypeMetaInfo__Group__1_in_rule__OverriddenTypeMetaInfo__Group__06858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__OverriddenTypeMetaInfo__Group__0__Impl6886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OverriddenTypeMetaInfo__Group__1__Impl_in_rule__OverriddenTypeMetaInfo__Group__16917 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__OverriddenTypeMetaInfo__Group__2_in_rule__OverriddenTypeMetaInfo__Group__16920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OverriddenTypeMetaInfo__MetaInfoAssignment_1_in_rule__OverriddenTypeMetaInfo__Group__1__Impl6947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OverriddenTypeMetaInfo__Group__2__Impl_in_rule__OverriddenTypeMetaInfo__Group__26977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__OverriddenTypeMetaInfo__Group__2__Impl7005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintCall__Group__0__Impl_in_rule__ConstraintCall__Group__07042 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__ConstraintCall__Group__1_in_rule__ConstraintCall__Group__07045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintCall__ConstraintAssignment_0_in_rule__ConstraintCall__Group__0__Impl7072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintCall__Group__1__Impl_in_rule__ConstraintCall__Group__17102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintCall__Group_1__0_in_rule__ConstraintCall__Group__1__Impl7129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintCall__Group_1__0__Impl_in_rule__ConstraintCall__Group_1__07164 = new BitSet(new long[]{0x0000020000006270L});
    public static final BitSet FOLLOW_rule__ConstraintCall__Group_1__1_in_rule__ConstraintCall__Group_1__07167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__ConstraintCall__Group_1__0__Impl7195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintCall__Group_1__1__Impl_in_rule__ConstraintCall__Group_1__17226 = new BitSet(new long[]{0x0000002002000000L});
    public static final BitSet FOLLOW_rule__ConstraintCall__Group_1__2_in_rule__ConstraintCall__Group_1__17229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintCall__ParamsAssignment_1_1_in_rule__ConstraintCall__Group_1__1__Impl7256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintCall__Group_1__2__Impl_in_rule__ConstraintCall__Group_1__27286 = new BitSet(new long[]{0x0000002002000000L});
    public static final BitSet FOLLOW_rule__ConstraintCall__Group_1__3_in_rule__ConstraintCall__Group_1__27289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintCall__Group_1_2__0_in_rule__ConstraintCall__Group_1__2__Impl7316 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__ConstraintCall__Group_1__3__Impl_in_rule__ConstraintCall__Group_1__37347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__ConstraintCall__Group_1__3__Impl7375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintCall__Group_1_2__0__Impl_in_rule__ConstraintCall__Group_1_2__07414 = new BitSet(new long[]{0x0000020000006270L});
    public static final BitSet FOLLOW_rule__ConstraintCall__Group_1_2__1_in_rule__ConstraintCall__Group_1_2__07417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ConstraintCall__Group_1_2__0__Impl7445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintCall__Group_1_2__1__Impl_in_rule__ConstraintCall__Group_1_2__17476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintCall__ParamsAssignment_1_2_1_in_rule__ConstraintCall__Group_1_2__1__Impl7503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanLiteral__Group__0__Impl_in_rule__BooleanLiteral__Group__07537 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__BooleanLiteral__Group__1_in_rule__BooleanLiteral__Group__07540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanLiteral__Group__1__Impl_in_rule__BooleanLiteral__Group__17598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanLiteral__ValueAssignment_1_in_rule__BooleanLiteral__Group__1__Impl7625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NullLiteral__Group__0__Impl_in_rule__NullLiteral__Group__07659 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__NullLiteral__Group__1_in_rule__NullLiteral__Group__07662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NullLiteral__Group__1__Impl_in_rule__NullLiteral__Group__17720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NullLiteral__ValueAssignment_1_in_rule__NullLiteral__Group__1__Impl7747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberLiteral__Group__0__Impl_in_rule__NumberLiteral__Group__07781 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__NumberLiteral__Group__1_in_rule__NumberLiteral__Group__07784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberLiteral__Group__1__Impl_in_rule__NumberLiteral__Group__17842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberLiteral__ValueAssignment_1_in_rule__NumberLiteral__Group__1__Impl7869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__Group__0__Impl_in_rule__StringLiteral__Group__07903 = new BitSet(new long[]{0x0000020000006270L});
    public static final BitSet FOLLOW_rule__StringLiteral__Group__1_in_rule__StringLiteral__Group__07906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__Group__1__Impl_in_rule__StringLiteral__Group__17964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__ValueAssignment_1_in_rule__StringLiteral__Group__1__Impl7991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__08025 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__08028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl8055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__18084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl8111 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__08146 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__08149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__FQN__Group_1__0__Impl8177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__18208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl8235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQNWithWildcard__Group__0__Impl_in_rule__FQNWithWildcard__Group__08268 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__FQNWithWildcard__Group__1_in_rule__FQNWithWildcard__Group__08271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__FQNWithWildcard__Group__0__Impl8298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQNWithWildcard__Group__1__Impl_in_rule__FQNWithWildcard__Group__18327 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__FQNWithWildcard__Group__2_in_rule__FQNWithWildcard__Group__18330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__FQNWithWildcard__Group__1__Impl8358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQNWithWildcard__Group__2__Impl_in_rule__FQNWithWildcard__Group__28389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__FQNWithWildcard__Group__2__Impl8417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Group_1__0__Impl_in_rule__Number__Group_1__08454 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Number__Group_1__1_in_rule__Number__Group_1__08457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Alternatives_1_0_in_rule__Number__Group_1__0__Impl8484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Group_1__1__Impl_in_rule__Number__Group_1__18514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Group_1_1__0_in_rule__Number__Group_1__1__Impl8541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Group_1_1__0__Impl_in_rule__Number__Group_1_1__08576 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__Number__Group_1_1__1_in_rule__Number__Group_1_1__08579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Number__Group_1_1__0__Impl8607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Group_1_1__1__Impl_in_rule__Number__Group_1_1__18638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Alternatives_1_1_1_in_rule__Number__Group_1_1__1__Impl8665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContext_in_rule__DomainModel__ContextsAssignment8704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Context__NameAssignment_18735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespace_in_rule__Context__NamespacesAssignment_38766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Namespace__NameAssignment_18797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Namespace__ImportsAssignment_38828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_rule__Namespace__ElementsAssignment_48859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAlternatives_1_0_in_rule__Import__ImportedNamespaceAssignment_18890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_rule__Command__DocAssignment_08923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Command__NameAssignment_28954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Command__TargetAssignment_3_18989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__Command__VariablesAssignment_59024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Command__MessageAssignment_6_19055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_rule__CommandHandler__DocAssignment_09086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CommandHandler__NameAssignment_29117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CommandHandler__CommandsAssignment_49152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CommandHandler__CommandsAssignment_5_19191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__CommandHandler__AggregatesAssignment_6_19230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__CommandHandler__AggregatesAssignment_6_2_19269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_rule__Projection__DocAssignment_09304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Projection__NameAssignment_29335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Projection__EventsAssignment_3_19370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Projection__EventsAssignment_3_2_19409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_rule__View__DocAssignment_09444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__View__NameAssignment_29475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__View__ProjectionAssignment_49510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TypeMetaInfo__SlabelAssignment_1_19545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TypeMetaInfo__LabelAssignment_2_19576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TypeMetaInfo__TooltipAssignment_3_19607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TypeMetaInfo__PromptAssignment_4_19638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__TypeMetaInfo__ExamplesAssignment_5_19669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_rule__Variable__DocAssignment_09700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Variable__NullableAssignment_19736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Variable__TypeAssignment_29779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Variable__MultiplicityAssignment_39819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Variable__NameAssignment_49858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvariants_in_rule__Variable__InvariantsAssignment_59889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOverriddenTypeMetaInfo_in_rule__Variable__OverriddenAssignment_69920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraintCall_in_rule__Invariants__CallsAssignment_19951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraintCall_in_rule__Invariants__CallsAssignment_2_19982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeMetaInfo_in_rule__OverriddenTypeMetaInfo__MetaInfoAssignment_110013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ConstraintCall__ConstraintAssignment_010048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__ConstraintCall__ParamsAssignment_1_110083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__ConstraintCall__ParamsAssignment_1_2_110114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanLiteral__ValueAlternatives_1_0_in_rule__BooleanLiteral__ValueAssignment_110145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__NullLiteral__ValueAssignment_110183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_rule__NumberLiteral__ValueAssignment_110222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment_110253 = new BitSet(new long[]{0x0000000000000002L});

}