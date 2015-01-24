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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_HEX", "RULE_INT", "RULE_DECIMAL", "RULE_ID", "RULE_DOC", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'false'", "'true'", "'millis'", "'seconds'", "'minutes'", "'hours'", "'days'", "'context'", "'{'", "'}'", "'namespace'", "'import'", "'command'", "'target'", "'sla'", "'message'", "'command-handler'", "'handles'", "','", "'uses'", "'projection'", "'input'", "'view'", "'slabel'", "'label'", "'tooltip'", "'prompt'", "'examples'", "'invariants'", "'('", "')'", "'.'", "'*'", "'nullable'", "'null'"
    };
    public static final int RULE_ID=7;
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
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int RULE_HEX=4;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_DECIMAL=6;
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
    public static final int RULE_STRING=9;
    public static final int T__32=32;
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

                if ( (LA1_0==20) ) {
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


    // $ANTLR start "entryRuleDuration"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:200:1: entryRuleDuration : ruleDuration EOF ;
    public final void entryRuleDuration() throws RecognitionException {
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:201:1: ( ruleDuration EOF )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:202:1: ruleDuration EOF
            {
             before(grammarAccess.getDurationRule()); 
            pushFollow(FOLLOW_ruleDuration_in_entryRuleDuration362);
            ruleDuration();

            state._fsp--;

             after(grammarAccess.getDurationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDuration369); 

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
    // $ANTLR end "entryRuleDuration"


    // $ANTLR start "ruleDuration"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:209:1: ruleDuration : ( ( rule__Duration__Group__0 ) ) ;
    public final void ruleDuration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:213:2: ( ( ( rule__Duration__Group__0 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:214:1: ( ( rule__Duration__Group__0 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:214:1: ( ( rule__Duration__Group__0 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:215:1: ( rule__Duration__Group__0 )
            {
             before(grammarAccess.getDurationAccess().getGroup()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:216:1: ( rule__Duration__Group__0 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:216:2: rule__Duration__Group__0
            {
            pushFollow(FOLLOW_rule__Duration__Group__0_in_ruleDuration395);
            rule__Duration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDurationAccess().getGroup()); 

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
    // $ANTLR end "ruleDuration"


    // $ANTLR start "entryRuleCommand"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:228:1: entryRuleCommand : ruleCommand EOF ;
    public final void entryRuleCommand() throws RecognitionException {
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:229:1: ( ruleCommand EOF )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:230:1: ruleCommand EOF
            {
             before(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_ruleCommand_in_entryRuleCommand422);
            ruleCommand();

            state._fsp--;

             after(grammarAccess.getCommandRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommand429); 

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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:237:1: ruleCommand : ( ( rule__Command__Group__0 ) ) ;
    public final void ruleCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:241:2: ( ( ( rule__Command__Group__0 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:242:1: ( ( rule__Command__Group__0 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:242:1: ( ( rule__Command__Group__0 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:243:1: ( rule__Command__Group__0 )
            {
             before(grammarAccess.getCommandAccess().getGroup()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:244:1: ( rule__Command__Group__0 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:244:2: rule__Command__Group__0
            {
            pushFollow(FOLLOW_rule__Command__Group__0_in_ruleCommand455);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:256:1: entryRuleCommandHandler : ruleCommandHandler EOF ;
    public final void entryRuleCommandHandler() throws RecognitionException {
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:257:1: ( ruleCommandHandler EOF )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:258:1: ruleCommandHandler EOF
            {
             before(grammarAccess.getCommandHandlerRule()); 
            pushFollow(FOLLOW_ruleCommandHandler_in_entryRuleCommandHandler482);
            ruleCommandHandler();

            state._fsp--;

             after(grammarAccess.getCommandHandlerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommandHandler489); 

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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:265:1: ruleCommandHandler : ( ( rule__CommandHandler__Group__0 ) ) ;
    public final void ruleCommandHandler() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:269:2: ( ( ( rule__CommandHandler__Group__0 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:270:1: ( ( rule__CommandHandler__Group__0 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:270:1: ( ( rule__CommandHandler__Group__0 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:271:1: ( rule__CommandHandler__Group__0 )
            {
             before(grammarAccess.getCommandHandlerAccess().getGroup()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:272:1: ( rule__CommandHandler__Group__0 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:272:2: rule__CommandHandler__Group__0
            {
            pushFollow(FOLLOW_rule__CommandHandler__Group__0_in_ruleCommandHandler515);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:284:1: entryRuleProjection : ruleProjection EOF ;
    public final void entryRuleProjection() throws RecognitionException {
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:285:1: ( ruleProjection EOF )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:286:1: ruleProjection EOF
            {
             before(grammarAccess.getProjectionRule()); 
            pushFollow(FOLLOW_ruleProjection_in_entryRuleProjection542);
            ruleProjection();

            state._fsp--;

             after(grammarAccess.getProjectionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProjection549); 

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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:293:1: ruleProjection : ( ( rule__Projection__Group__0 ) ) ;
    public final void ruleProjection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:297:2: ( ( ( rule__Projection__Group__0 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:298:1: ( ( rule__Projection__Group__0 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:298:1: ( ( rule__Projection__Group__0 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:299:1: ( rule__Projection__Group__0 )
            {
             before(grammarAccess.getProjectionAccess().getGroup()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:300:1: ( rule__Projection__Group__0 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:300:2: rule__Projection__Group__0
            {
            pushFollow(FOLLOW_rule__Projection__Group__0_in_ruleProjection575);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:312:1: entryRuleView : ruleView EOF ;
    public final void entryRuleView() throws RecognitionException {
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:313:1: ( ruleView EOF )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:314:1: ruleView EOF
            {
             before(grammarAccess.getViewRule()); 
            pushFollow(FOLLOW_ruleView_in_entryRuleView602);
            ruleView();

            state._fsp--;

             after(grammarAccess.getViewRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleView609); 

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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:321:1: ruleView : ( ( rule__View__Group__0 ) ) ;
    public final void ruleView() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:325:2: ( ( ( rule__View__Group__0 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:326:1: ( ( rule__View__Group__0 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:326:1: ( ( rule__View__Group__0 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:327:1: ( rule__View__Group__0 )
            {
             before(grammarAccess.getViewAccess().getGroup()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:328:1: ( rule__View__Group__0 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:328:2: rule__View__Group__0
            {
            pushFollow(FOLLOW_rule__View__Group__0_in_ruleView635);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:340:1: entryRuleTypeMetaInfo : ruleTypeMetaInfo EOF ;
    public final void entryRuleTypeMetaInfo() throws RecognitionException {
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:341:1: ( ruleTypeMetaInfo EOF )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:342:1: ruleTypeMetaInfo EOF
            {
             before(grammarAccess.getTypeMetaInfoRule()); 
            pushFollow(FOLLOW_ruleTypeMetaInfo_in_entryRuleTypeMetaInfo662);
            ruleTypeMetaInfo();

            state._fsp--;

             after(grammarAccess.getTypeMetaInfoRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeMetaInfo669); 

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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:349:1: ruleTypeMetaInfo : ( ( rule__TypeMetaInfo__Group__0 ) ) ;
    public final void ruleTypeMetaInfo() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:353:2: ( ( ( rule__TypeMetaInfo__Group__0 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:354:1: ( ( rule__TypeMetaInfo__Group__0 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:354:1: ( ( rule__TypeMetaInfo__Group__0 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:355:1: ( rule__TypeMetaInfo__Group__0 )
            {
             before(grammarAccess.getTypeMetaInfoAccess().getGroup()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:356:1: ( rule__TypeMetaInfo__Group__0 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:356:2: rule__TypeMetaInfo__Group__0
            {
            pushFollow(FOLLOW_rule__TypeMetaInfo__Group__0_in_ruleTypeMetaInfo695);
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


    // $ANTLR start "entryRuleAttribute"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:368:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:369:1: ( ruleAttribute EOF )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:370:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute722);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute729); 

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:377:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:381:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:382:1: ( ( rule__Attribute__Group__0 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:382:1: ( ( rule__Attribute__Group__0 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:383:1: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:384:1: ( rule__Attribute__Group__0 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:384:2: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0_in_ruleAttribute755);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleInvariants"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:396:1: entryRuleInvariants : ruleInvariants EOF ;
    public final void entryRuleInvariants() throws RecognitionException {
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:397:1: ( ruleInvariants EOF )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:398:1: ruleInvariants EOF
            {
             before(grammarAccess.getInvariantsRule()); 
            pushFollow(FOLLOW_ruleInvariants_in_entryRuleInvariants782);
            ruleInvariants();

            state._fsp--;

             after(grammarAccess.getInvariantsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInvariants789); 

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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:405:1: ruleInvariants : ( ( rule__Invariants__Group__0 ) ) ;
    public final void ruleInvariants() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:409:2: ( ( ( rule__Invariants__Group__0 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:410:1: ( ( rule__Invariants__Group__0 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:410:1: ( ( rule__Invariants__Group__0 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:411:1: ( rule__Invariants__Group__0 )
            {
             before(grammarAccess.getInvariantsAccess().getGroup()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:412:1: ( rule__Invariants__Group__0 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:412:2: rule__Invariants__Group__0
            {
            pushFollow(FOLLOW_rule__Invariants__Group__0_in_ruleInvariants815);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:424:1: entryRuleOverriddenTypeMetaInfo : ruleOverriddenTypeMetaInfo EOF ;
    public final void entryRuleOverriddenTypeMetaInfo() throws RecognitionException {
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:425:1: ( ruleOverriddenTypeMetaInfo EOF )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:426:1: ruleOverriddenTypeMetaInfo EOF
            {
             before(grammarAccess.getOverriddenTypeMetaInfoRule()); 
            pushFollow(FOLLOW_ruleOverriddenTypeMetaInfo_in_entryRuleOverriddenTypeMetaInfo842);
            ruleOverriddenTypeMetaInfo();

            state._fsp--;

             after(grammarAccess.getOverriddenTypeMetaInfoRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOverriddenTypeMetaInfo849); 

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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:433:1: ruleOverriddenTypeMetaInfo : ( ( rule__OverriddenTypeMetaInfo__Group__0 ) ) ;
    public final void ruleOverriddenTypeMetaInfo() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:437:2: ( ( ( rule__OverriddenTypeMetaInfo__Group__0 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:438:1: ( ( rule__OverriddenTypeMetaInfo__Group__0 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:438:1: ( ( rule__OverriddenTypeMetaInfo__Group__0 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:439:1: ( rule__OverriddenTypeMetaInfo__Group__0 )
            {
             before(grammarAccess.getOverriddenTypeMetaInfoAccess().getGroup()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:440:1: ( rule__OverriddenTypeMetaInfo__Group__0 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:440:2: rule__OverriddenTypeMetaInfo__Group__0
            {
            pushFollow(FOLLOW_rule__OverriddenTypeMetaInfo__Group__0_in_ruleOverriddenTypeMetaInfo875);
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


    // $ANTLR start "entryRuleConstraintInstance"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:452:1: entryRuleConstraintInstance : ruleConstraintInstance EOF ;
    public final void entryRuleConstraintInstance() throws RecognitionException {
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:453:1: ( ruleConstraintInstance EOF )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:454:1: ruleConstraintInstance EOF
            {
             before(grammarAccess.getConstraintInstanceRule()); 
            pushFollow(FOLLOW_ruleConstraintInstance_in_entryRuleConstraintInstance902);
            ruleConstraintInstance();

            state._fsp--;

             after(grammarAccess.getConstraintInstanceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraintInstance909); 

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
    // $ANTLR end "entryRuleConstraintInstance"


    // $ANTLR start "ruleConstraintInstance"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:461:1: ruleConstraintInstance : ( ( rule__ConstraintInstance__Group__0 ) ) ;
    public final void ruleConstraintInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:465:2: ( ( ( rule__ConstraintInstance__Group__0 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:466:1: ( ( rule__ConstraintInstance__Group__0 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:466:1: ( ( rule__ConstraintInstance__Group__0 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:467:1: ( rule__ConstraintInstance__Group__0 )
            {
             before(grammarAccess.getConstraintInstanceAccess().getGroup()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:468:1: ( rule__ConstraintInstance__Group__0 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:468:2: rule__ConstraintInstance__Group__0
            {
            pushFollow(FOLLOW_rule__ConstraintInstance__Group__0_in_ruleConstraintInstance935);
            rule__ConstraintInstance__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstraintInstanceAccess().getGroup()); 

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
    // $ANTLR end "ruleConstraintInstance"


    // $ANTLR start "entryRuleLiteral"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:480:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:481:1: ( ruleLiteral EOF )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:482:1: ruleLiteral EOF
            {
             before(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral962);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral969); 

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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:489:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:493:2: ( ( ( rule__Literal__Alternatives ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:494:1: ( ( rule__Literal__Alternatives ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:494:1: ( ( rule__Literal__Alternatives ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:495:1: ( rule__Literal__Alternatives )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:496:1: ( rule__Literal__Alternatives )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:496:2: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_rule__Literal__Alternatives_in_ruleLiteral995);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:508:1: entryRuleBooleanLiteral : ruleBooleanLiteral EOF ;
    public final void entryRuleBooleanLiteral() throws RecognitionException {
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:509:1: ( ruleBooleanLiteral EOF )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:510:1: ruleBooleanLiteral EOF
            {
             before(grammarAccess.getBooleanLiteralRule()); 
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral1022);
            ruleBooleanLiteral();

            state._fsp--;

             after(grammarAccess.getBooleanLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral1029); 

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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:517:1: ruleBooleanLiteral : ( ( rule__BooleanLiteral__Group__0 ) ) ;
    public final void ruleBooleanLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:521:2: ( ( ( rule__BooleanLiteral__Group__0 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:522:1: ( ( rule__BooleanLiteral__Group__0 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:522:1: ( ( rule__BooleanLiteral__Group__0 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:523:1: ( rule__BooleanLiteral__Group__0 )
            {
             before(grammarAccess.getBooleanLiteralAccess().getGroup()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:524:1: ( rule__BooleanLiteral__Group__0 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:524:2: rule__BooleanLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__BooleanLiteral__Group__0_in_ruleBooleanLiteral1055);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:536:1: entryRuleNullLiteral : ruleNullLiteral EOF ;
    public final void entryRuleNullLiteral() throws RecognitionException {
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:537:1: ( ruleNullLiteral EOF )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:538:1: ruleNullLiteral EOF
            {
             before(grammarAccess.getNullLiteralRule()); 
            pushFollow(FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral1082);
            ruleNullLiteral();

            state._fsp--;

             after(grammarAccess.getNullLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullLiteral1089); 

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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:545:1: ruleNullLiteral : ( ( rule__NullLiteral__Group__0 ) ) ;
    public final void ruleNullLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:549:2: ( ( ( rule__NullLiteral__Group__0 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:550:1: ( ( rule__NullLiteral__Group__0 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:550:1: ( ( rule__NullLiteral__Group__0 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:551:1: ( rule__NullLiteral__Group__0 )
            {
             before(grammarAccess.getNullLiteralAccess().getGroup()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:552:1: ( rule__NullLiteral__Group__0 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:552:2: rule__NullLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__NullLiteral__Group__0_in_ruleNullLiteral1115);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:564:1: entryRuleNumberLiteral : ruleNumberLiteral EOF ;
    public final void entryRuleNumberLiteral() throws RecognitionException {
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:565:1: ( ruleNumberLiteral EOF )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:566:1: ruleNumberLiteral EOF
            {
             before(grammarAccess.getNumberLiteralRule()); 
            pushFollow(FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral1142);
            ruleNumberLiteral();

            state._fsp--;

             after(grammarAccess.getNumberLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberLiteral1149); 

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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:573:1: ruleNumberLiteral : ( ( rule__NumberLiteral__Group__0 ) ) ;
    public final void ruleNumberLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:577:2: ( ( ( rule__NumberLiteral__Group__0 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:578:1: ( ( rule__NumberLiteral__Group__0 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:578:1: ( ( rule__NumberLiteral__Group__0 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:579:1: ( rule__NumberLiteral__Group__0 )
            {
             before(grammarAccess.getNumberLiteralAccess().getGroup()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:580:1: ( rule__NumberLiteral__Group__0 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:580:2: rule__NumberLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__NumberLiteral__Group__0_in_ruleNumberLiteral1175);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:592:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:593:1: ( ruleStringLiteral EOF )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:594:1: ruleStringLiteral EOF
            {
             before(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1202);
            ruleStringLiteral();

            state._fsp--;

             after(grammarAccess.getStringLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral1209); 

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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:601:1: ruleStringLiteral : ( ( rule__StringLiteral__Group__0 ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:605:2: ( ( ( rule__StringLiteral__Group__0 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:606:1: ( ( rule__StringLiteral__Group__0 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:606:1: ( ( rule__StringLiteral__Group__0 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:607:1: ( rule__StringLiteral__Group__0 )
            {
             before(grammarAccess.getStringLiteralAccess().getGroup()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:608:1: ( rule__StringLiteral__Group__0 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:608:2: rule__StringLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__StringLiteral__Group__0_in_ruleStringLiteral1235);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:620:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:621:1: ( ruleFQN EOF )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:622:1: ruleFQN EOF
            {
             before(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN1262);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getFQNRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN1269); 

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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:629:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:633:2: ( ( ( rule__FQN__Group__0 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:634:1: ( ( rule__FQN__Group__0 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:634:1: ( ( rule__FQN__Group__0 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:635:1: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:636:1: ( rule__FQN__Group__0 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:636:2: rule__FQN__Group__0
            {
            pushFollow(FOLLOW_rule__FQN__Group__0_in_ruleFQN1295);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:648:1: entryRuleFQNWithWildcard : ruleFQNWithWildcard EOF ;
    public final void entryRuleFQNWithWildcard() throws RecognitionException {
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:649:1: ( ruleFQNWithWildcard EOF )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:650:1: ruleFQNWithWildcard EOF
            {
             before(grammarAccess.getFQNWithWildcardRule()); 
            pushFollow(FOLLOW_ruleFQNWithWildcard_in_entryRuleFQNWithWildcard1322);
            ruleFQNWithWildcard();

            state._fsp--;

             after(grammarAccess.getFQNWithWildcardRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQNWithWildcard1329); 

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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:657:1: ruleFQNWithWildcard : ( ( rule__FQNWithWildcard__Group__0 ) ) ;
    public final void ruleFQNWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:661:2: ( ( ( rule__FQNWithWildcard__Group__0 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:662:1: ( ( rule__FQNWithWildcard__Group__0 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:662:1: ( ( rule__FQNWithWildcard__Group__0 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:663:1: ( rule__FQNWithWildcard__Group__0 )
            {
             before(grammarAccess.getFQNWithWildcardAccess().getGroup()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:664:1: ( rule__FQNWithWildcard__Group__0 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:664:2: rule__FQNWithWildcard__Group__0
            {
            pushFollow(FOLLOW_rule__FQNWithWildcard__Group__0_in_ruleFQNWithWildcard1355);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:676:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:680:1: ( ruleNumber EOF )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:681:1: ruleNumber EOF
            {
             before(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber1387);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getNumberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber1394); 

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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:691:1: ruleNumber : ( ( rule__Number__Alternatives ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:696:2: ( ( ( rule__Number__Alternatives ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:697:1: ( ( rule__Number__Alternatives ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:697:1: ( ( rule__Number__Alternatives ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:698:1: ( rule__Number__Alternatives )
            {
             before(grammarAccess.getNumberAccess().getAlternatives()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:699:1: ( rule__Number__Alternatives )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:699:2: rule__Number__Alternatives
            {
            pushFollow(FOLLOW_rule__Number__Alternatives_in_ruleNumber1424);
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


    // $ANTLR start "ruleTimeUnit"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:713:1: ruleTimeUnit : ( ( rule__TimeUnit__Alternatives ) ) ;
    public final void ruleTimeUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:717:1: ( ( ( rule__TimeUnit__Alternatives ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:718:1: ( ( rule__TimeUnit__Alternatives ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:718:1: ( ( rule__TimeUnit__Alternatives ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:719:1: ( rule__TimeUnit__Alternatives )
            {
             before(grammarAccess.getTimeUnitAccess().getAlternatives()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:720:1: ( rule__TimeUnit__Alternatives )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:720:2: rule__TimeUnit__Alternatives
            {
            pushFollow(FOLLOW_rule__TimeUnit__Alternatives_in_ruleTimeUnit1461);
            rule__TimeUnit__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTimeUnitAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTimeUnit"


    // $ANTLR start "rule__Import__ImportedNamespaceAlternatives_1_0"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:731:1: rule__Import__ImportedNamespaceAlternatives_1_0 : ( ( ruleFQN ) | ( ruleFQNWithWildcard ) );
    public final void rule__Import__ImportedNamespaceAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:735:1: ( ( ruleFQN ) | ( ruleFQNWithWildcard ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:736:1: ( ruleFQN )
                    {
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:736:1: ( ruleFQN )
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:737:1: ruleFQN
                    {
                     before(grammarAccess.getImportAccess().getImportedNamespaceFQNParserRuleCall_1_0_0()); 
                    pushFollow(FOLLOW_ruleFQN_in_rule__Import__ImportedNamespaceAlternatives_1_01496);
                    ruleFQN();

                    state._fsp--;

                     after(grammarAccess.getImportAccess().getImportedNamespaceFQNParserRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:742:6: ( ruleFQNWithWildcard )
                    {
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:742:6: ( ruleFQNWithWildcard )
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:743:1: ruleFQNWithWildcard
                    {
                     before(grammarAccess.getImportAccess().getImportedNamespaceFQNWithWildcardParserRuleCall_1_0_1()); 
                    pushFollow(FOLLOW_ruleFQNWithWildcard_in_rule__Import__ImportedNamespaceAlternatives_1_01513);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:753:1: rule__AbstractElement__Alternatives : ( ( ruleCommand ) | ( ruleCommandHandler ) | ( ruleProjection ) | ( ruleView ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:757:1: ( ( ruleCommand ) | ( ruleCommandHandler ) | ( ruleProjection ) | ( ruleView ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case RULE_DOC:
                {
                switch ( input.LA(2) ) {
                case 29:
                    {
                    alt3=2;
                    }
                    break;
                case 33:
                    {
                    alt3=3;
                    }
                    break;
                case 35:
                    {
                    alt3=4;
                    }
                    break;
                case 25:
                    {
                    alt3=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }

                }
                break;
            case 25:
                {
                alt3=1;
                }
                break;
            case 29:
                {
                alt3=2;
                }
                break;
            case 33:
                {
                alt3=3;
                }
                break;
            case 35:
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
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:758:1: ( ruleCommand )
                    {
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:758:1: ( ruleCommand )
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:759:1: ruleCommand
                    {
                     before(grammarAccess.getAbstractElementAccess().getCommandParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleCommand_in_rule__AbstractElement__Alternatives1545);
                    ruleCommand();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getCommandParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:764:6: ( ruleCommandHandler )
                    {
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:764:6: ( ruleCommandHandler )
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:765:1: ruleCommandHandler
                    {
                     before(grammarAccess.getAbstractElementAccess().getCommandHandlerParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleCommandHandler_in_rule__AbstractElement__Alternatives1562);
                    ruleCommandHandler();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getCommandHandlerParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:770:6: ( ruleProjection )
                    {
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:770:6: ( ruleProjection )
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:771:1: ruleProjection
                    {
                     before(grammarAccess.getAbstractElementAccess().getProjectionParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleProjection_in_rule__AbstractElement__Alternatives1579);
                    ruleProjection();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getProjectionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:776:6: ( ruleView )
                    {
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:776:6: ( ruleView )
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:777:1: ruleView
                    {
                     before(grammarAccess.getAbstractElementAccess().getViewParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleView_in_rule__AbstractElement__Alternatives1596);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:787:1: rule__Literal__Alternatives : ( ( ruleNullLiteral ) | ( ruleBooleanLiteral ) | ( ruleNumberLiteral ) | ( ruleStringLiteral ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:791:1: ( ( ruleNullLiteral ) | ( ruleBooleanLiteral ) | ( ruleNumberLiteral ) | ( ruleStringLiteral ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 47:
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
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:792:1: ( ruleNullLiteral )
                    {
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:792:1: ( ruleNullLiteral )
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:793:1: ruleNullLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getNullLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleNullLiteral_in_rule__Literal__Alternatives1628);
                    ruleNullLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getNullLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:798:6: ( ruleBooleanLiteral )
                    {
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:798:6: ( ruleBooleanLiteral )
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:799:1: ruleBooleanLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_rule__Literal__Alternatives1645);
                    ruleBooleanLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:804:6: ( ruleNumberLiteral )
                    {
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:804:6: ( ruleNumberLiteral )
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:805:1: ruleNumberLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getNumberLiteralParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleNumberLiteral_in_rule__Literal__Alternatives1662);
                    ruleNumberLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getNumberLiteralParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:810:6: ( ruleStringLiteral )
                    {
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:810:6: ( ruleStringLiteral )
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:811:1: ruleStringLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleStringLiteral_in_rule__Literal__Alternatives1679);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:821:1: rule__BooleanLiteral__ValueAlternatives_1_0 : ( ( 'false' ) | ( 'true' ) );
    public final void rule__BooleanLiteral__ValueAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:825:1: ( ( 'false' ) | ( 'true' ) )
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
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:826:1: ( 'false' )
                    {
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:826:1: ( 'false' )
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:827:1: 'false'
                    {
                     before(grammarAccess.getBooleanLiteralAccess().getValueFalseKeyword_1_0_0()); 
                    match(input,13,FOLLOW_13_in_rule__BooleanLiteral__ValueAlternatives_1_01712); 
                     after(grammarAccess.getBooleanLiteralAccess().getValueFalseKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:834:6: ( 'true' )
                    {
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:834:6: ( 'true' )
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:835:1: 'true'
                    {
                     before(grammarAccess.getBooleanLiteralAccess().getValueTrueKeyword_1_0_1()); 
                    match(input,14,FOLLOW_14_in_rule__BooleanLiteral__ValueAlternatives_1_01732); 
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:847:1: rule__Number__Alternatives : ( ( RULE_HEX ) | ( ( rule__Number__Group_1__0 ) ) );
    public final void rule__Number__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:851:1: ( ( RULE_HEX ) | ( ( rule__Number__Group_1__0 ) ) )
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
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:852:1: ( RULE_HEX )
                    {
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:852:1: ( RULE_HEX )
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:853:1: RULE_HEX
                    {
                     before(grammarAccess.getNumberAccess().getHEXTerminalRuleCall_0()); 
                    match(input,RULE_HEX,FOLLOW_RULE_HEX_in_rule__Number__Alternatives1766); 
                     after(grammarAccess.getNumberAccess().getHEXTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:858:6: ( ( rule__Number__Group_1__0 ) )
                    {
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:858:6: ( ( rule__Number__Group_1__0 ) )
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:859:1: ( rule__Number__Group_1__0 )
                    {
                     before(grammarAccess.getNumberAccess().getGroup_1()); 
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:860:1: ( rule__Number__Group_1__0 )
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:860:2: rule__Number__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Number__Group_1__0_in_rule__Number__Alternatives1783);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:869:1: rule__Number__Alternatives_1_0 : ( ( RULE_INT ) | ( RULE_DECIMAL ) );
    public final void rule__Number__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:873:1: ( ( RULE_INT ) | ( RULE_DECIMAL ) )
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
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:874:1: ( RULE_INT )
                    {
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:874:1: ( RULE_INT )
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:875:1: RULE_INT
                    {
                     before(grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_0_0()); 
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Number__Alternatives_1_01816); 
                     after(grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:880:6: ( RULE_DECIMAL )
                    {
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:880:6: ( RULE_DECIMAL )
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:881:1: RULE_DECIMAL
                    {
                     before(grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_0_1()); 
                    match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_rule__Number__Alternatives_1_01833); 
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:891:1: rule__Number__Alternatives_1_1_1 : ( ( RULE_INT ) | ( RULE_DECIMAL ) );
    public final void rule__Number__Alternatives_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:895:1: ( ( RULE_INT ) | ( RULE_DECIMAL ) )
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
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:896:1: ( RULE_INT )
                    {
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:896:1: ( RULE_INT )
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:897:1: RULE_INT
                    {
                     before(grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1_1_0()); 
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Number__Alternatives_1_1_11865); 
                     after(grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:902:6: ( RULE_DECIMAL )
                    {
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:902:6: ( RULE_DECIMAL )
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:903:1: RULE_DECIMAL
                    {
                     before(grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_1_1_1()); 
                    match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_rule__Number__Alternatives_1_1_11882); 
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


    // $ANTLR start "rule__TimeUnit__Alternatives"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:913:1: rule__TimeUnit__Alternatives : ( ( ( 'millis' ) ) | ( ( 'seconds' ) ) | ( ( 'minutes' ) ) | ( ( 'hours' ) ) | ( ( 'days' ) ) );
    public final void rule__TimeUnit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:917:1: ( ( ( 'millis' ) ) | ( ( 'seconds' ) ) | ( ( 'minutes' ) ) | ( ( 'hours' ) ) | ( ( 'days' ) ) )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt9=1;
                }
                break;
            case 16:
                {
                alt9=2;
                }
                break;
            case 17:
                {
                alt9=3;
                }
                break;
            case 18:
                {
                alt9=4;
                }
                break;
            case 19:
                {
                alt9=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:918:1: ( ( 'millis' ) )
                    {
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:918:1: ( ( 'millis' ) )
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:919:1: ( 'millis' )
                    {
                     before(grammarAccess.getTimeUnitAccess().getMillisEnumLiteralDeclaration_0()); 
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:920:1: ( 'millis' )
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:920:3: 'millis'
                    {
                    match(input,15,FOLLOW_15_in_rule__TimeUnit__Alternatives1915); 

                    }

                     after(grammarAccess.getTimeUnitAccess().getMillisEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:925:6: ( ( 'seconds' ) )
                    {
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:925:6: ( ( 'seconds' ) )
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:926:1: ( 'seconds' )
                    {
                     before(grammarAccess.getTimeUnitAccess().getSecondsEnumLiteralDeclaration_1()); 
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:927:1: ( 'seconds' )
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:927:3: 'seconds'
                    {
                    match(input,16,FOLLOW_16_in_rule__TimeUnit__Alternatives1936); 

                    }

                     after(grammarAccess.getTimeUnitAccess().getSecondsEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:932:6: ( ( 'minutes' ) )
                    {
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:932:6: ( ( 'minutes' ) )
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:933:1: ( 'minutes' )
                    {
                     before(grammarAccess.getTimeUnitAccess().getMinutesEnumLiteralDeclaration_2()); 
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:934:1: ( 'minutes' )
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:934:3: 'minutes'
                    {
                    match(input,17,FOLLOW_17_in_rule__TimeUnit__Alternatives1957); 

                    }

                     after(grammarAccess.getTimeUnitAccess().getMinutesEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:939:6: ( ( 'hours' ) )
                    {
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:939:6: ( ( 'hours' ) )
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:940:1: ( 'hours' )
                    {
                     before(grammarAccess.getTimeUnitAccess().getHoursEnumLiteralDeclaration_3()); 
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:941:1: ( 'hours' )
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:941:3: 'hours'
                    {
                    match(input,18,FOLLOW_18_in_rule__TimeUnit__Alternatives1978); 

                    }

                     after(grammarAccess.getTimeUnitAccess().getHoursEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:946:6: ( ( 'days' ) )
                    {
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:946:6: ( ( 'days' ) )
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:947:1: ( 'days' )
                    {
                     before(grammarAccess.getTimeUnitAccess().getDaysEnumLiteralDeclaration_4()); 
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:948:1: ( 'days' )
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:948:3: 'days'
                    {
                    match(input,19,FOLLOW_19_in_rule__TimeUnit__Alternatives1999); 

                    }

                     after(grammarAccess.getTimeUnitAccess().getDaysEnumLiteralDeclaration_4()); 

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
    // $ANTLR end "rule__TimeUnit__Alternatives"


    // $ANTLR start "rule__Context__Group__0"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:960:1: rule__Context__Group__0 : rule__Context__Group__0__Impl rule__Context__Group__1 ;
    public final void rule__Context__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:964:1: ( rule__Context__Group__0__Impl rule__Context__Group__1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:965:2: rule__Context__Group__0__Impl rule__Context__Group__1
            {
            pushFollow(FOLLOW_rule__Context__Group__0__Impl_in_rule__Context__Group__02032);
            rule__Context__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Context__Group__1_in_rule__Context__Group__02035);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:972:1: rule__Context__Group__0__Impl : ( 'context' ) ;
    public final void rule__Context__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:976:1: ( ( 'context' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:977:1: ( 'context' )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:977:1: ( 'context' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:978:1: 'context'
            {
             before(grammarAccess.getContextAccess().getContextKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__Context__Group__0__Impl2063); 
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:991:1: rule__Context__Group__1 : rule__Context__Group__1__Impl rule__Context__Group__2 ;
    public final void rule__Context__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:995:1: ( rule__Context__Group__1__Impl rule__Context__Group__2 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:996:2: rule__Context__Group__1__Impl rule__Context__Group__2
            {
            pushFollow(FOLLOW_rule__Context__Group__1__Impl_in_rule__Context__Group__12094);
            rule__Context__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Context__Group__2_in_rule__Context__Group__12097);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1003:1: rule__Context__Group__1__Impl : ( ( rule__Context__NameAssignment_1 ) ) ;
    public final void rule__Context__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1007:1: ( ( ( rule__Context__NameAssignment_1 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1008:1: ( ( rule__Context__NameAssignment_1 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1008:1: ( ( rule__Context__NameAssignment_1 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1009:1: ( rule__Context__NameAssignment_1 )
            {
             before(grammarAccess.getContextAccess().getNameAssignment_1()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1010:1: ( rule__Context__NameAssignment_1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1010:2: rule__Context__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Context__NameAssignment_1_in_rule__Context__Group__1__Impl2124);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1020:1: rule__Context__Group__2 : rule__Context__Group__2__Impl rule__Context__Group__3 ;
    public final void rule__Context__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1024:1: ( rule__Context__Group__2__Impl rule__Context__Group__3 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1025:2: rule__Context__Group__2__Impl rule__Context__Group__3
            {
            pushFollow(FOLLOW_rule__Context__Group__2__Impl_in_rule__Context__Group__22154);
            rule__Context__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Context__Group__3_in_rule__Context__Group__22157);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1032:1: rule__Context__Group__2__Impl : ( '{' ) ;
    public final void rule__Context__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1036:1: ( ( '{' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1037:1: ( '{' )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1037:1: ( '{' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1038:1: '{'
            {
             before(grammarAccess.getContextAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,21,FOLLOW_21_in_rule__Context__Group__2__Impl2185); 
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1051:1: rule__Context__Group__3 : rule__Context__Group__3__Impl rule__Context__Group__4 ;
    public final void rule__Context__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1055:1: ( rule__Context__Group__3__Impl rule__Context__Group__4 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1056:2: rule__Context__Group__3__Impl rule__Context__Group__4
            {
            pushFollow(FOLLOW_rule__Context__Group__3__Impl_in_rule__Context__Group__32216);
            rule__Context__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Context__Group__4_in_rule__Context__Group__32219);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1063:1: rule__Context__Group__3__Impl : ( ( rule__Context__NamespacesAssignment_3 )* ) ;
    public final void rule__Context__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1067:1: ( ( ( rule__Context__NamespacesAssignment_3 )* ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1068:1: ( ( rule__Context__NamespacesAssignment_3 )* )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1068:1: ( ( rule__Context__NamespacesAssignment_3 )* )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1069:1: ( rule__Context__NamespacesAssignment_3 )*
            {
             before(grammarAccess.getContextAccess().getNamespacesAssignment_3()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1070:1: ( rule__Context__NamespacesAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==23) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1070:2: rule__Context__NamespacesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Context__NamespacesAssignment_3_in_rule__Context__Group__3__Impl2246);
            	    rule__Context__NamespacesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1080:1: rule__Context__Group__4 : rule__Context__Group__4__Impl ;
    public final void rule__Context__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1084:1: ( rule__Context__Group__4__Impl )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1085:2: rule__Context__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Context__Group__4__Impl_in_rule__Context__Group__42277);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1091:1: rule__Context__Group__4__Impl : ( '}' ) ;
    public final void rule__Context__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1095:1: ( ( '}' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1096:1: ( '}' )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1096:1: ( '}' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1097:1: '}'
            {
             before(grammarAccess.getContextAccess().getRightCurlyBracketKeyword_4()); 
            match(input,22,FOLLOW_22_in_rule__Context__Group__4__Impl2305); 
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1120:1: rule__Namespace__Group__0 : rule__Namespace__Group__0__Impl rule__Namespace__Group__1 ;
    public final void rule__Namespace__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1124:1: ( rule__Namespace__Group__0__Impl rule__Namespace__Group__1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1125:2: rule__Namespace__Group__0__Impl rule__Namespace__Group__1
            {
            pushFollow(FOLLOW_rule__Namespace__Group__0__Impl_in_rule__Namespace__Group__02346);
            rule__Namespace__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Namespace__Group__1_in_rule__Namespace__Group__02349);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1132:1: rule__Namespace__Group__0__Impl : ( 'namespace' ) ;
    public final void rule__Namespace__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1136:1: ( ( 'namespace' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1137:1: ( 'namespace' )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1137:1: ( 'namespace' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1138:1: 'namespace'
            {
             before(grammarAccess.getNamespaceAccess().getNamespaceKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__Namespace__Group__0__Impl2377); 
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1151:1: rule__Namespace__Group__1 : rule__Namespace__Group__1__Impl rule__Namespace__Group__2 ;
    public final void rule__Namespace__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1155:1: ( rule__Namespace__Group__1__Impl rule__Namespace__Group__2 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1156:2: rule__Namespace__Group__1__Impl rule__Namespace__Group__2
            {
            pushFollow(FOLLOW_rule__Namespace__Group__1__Impl_in_rule__Namespace__Group__12408);
            rule__Namespace__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Namespace__Group__2_in_rule__Namespace__Group__12411);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1163:1: rule__Namespace__Group__1__Impl : ( ( rule__Namespace__NameAssignment_1 ) ) ;
    public final void rule__Namespace__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1167:1: ( ( ( rule__Namespace__NameAssignment_1 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1168:1: ( ( rule__Namespace__NameAssignment_1 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1168:1: ( ( rule__Namespace__NameAssignment_1 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1169:1: ( rule__Namespace__NameAssignment_1 )
            {
             before(grammarAccess.getNamespaceAccess().getNameAssignment_1()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1170:1: ( rule__Namespace__NameAssignment_1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1170:2: rule__Namespace__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Namespace__NameAssignment_1_in_rule__Namespace__Group__1__Impl2438);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1180:1: rule__Namespace__Group__2 : rule__Namespace__Group__2__Impl rule__Namespace__Group__3 ;
    public final void rule__Namespace__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1184:1: ( rule__Namespace__Group__2__Impl rule__Namespace__Group__3 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1185:2: rule__Namespace__Group__2__Impl rule__Namespace__Group__3
            {
            pushFollow(FOLLOW_rule__Namespace__Group__2__Impl_in_rule__Namespace__Group__22468);
            rule__Namespace__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Namespace__Group__3_in_rule__Namespace__Group__22471);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1192:1: rule__Namespace__Group__2__Impl : ( '{' ) ;
    public final void rule__Namespace__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1196:1: ( ( '{' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1197:1: ( '{' )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1197:1: ( '{' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1198:1: '{'
            {
             before(grammarAccess.getNamespaceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,21,FOLLOW_21_in_rule__Namespace__Group__2__Impl2499); 
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1211:1: rule__Namespace__Group__3 : rule__Namespace__Group__3__Impl rule__Namespace__Group__4 ;
    public final void rule__Namespace__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1215:1: ( rule__Namespace__Group__3__Impl rule__Namespace__Group__4 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1216:2: rule__Namespace__Group__3__Impl rule__Namespace__Group__4
            {
            pushFollow(FOLLOW_rule__Namespace__Group__3__Impl_in_rule__Namespace__Group__32530);
            rule__Namespace__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Namespace__Group__4_in_rule__Namespace__Group__32533);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1223:1: rule__Namespace__Group__3__Impl : ( ( rule__Namespace__ImportsAssignment_3 )* ) ;
    public final void rule__Namespace__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1227:1: ( ( ( rule__Namespace__ImportsAssignment_3 )* ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1228:1: ( ( rule__Namespace__ImportsAssignment_3 )* )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1228:1: ( ( rule__Namespace__ImportsAssignment_3 )* )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1229:1: ( rule__Namespace__ImportsAssignment_3 )*
            {
             before(grammarAccess.getNamespaceAccess().getImportsAssignment_3()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1230:1: ( rule__Namespace__ImportsAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==24) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1230:2: rule__Namespace__ImportsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Namespace__ImportsAssignment_3_in_rule__Namespace__Group__3__Impl2560);
            	    rule__Namespace__ImportsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1240:1: rule__Namespace__Group__4 : rule__Namespace__Group__4__Impl rule__Namespace__Group__5 ;
    public final void rule__Namespace__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1244:1: ( rule__Namespace__Group__4__Impl rule__Namespace__Group__5 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1245:2: rule__Namespace__Group__4__Impl rule__Namespace__Group__5
            {
            pushFollow(FOLLOW_rule__Namespace__Group__4__Impl_in_rule__Namespace__Group__42591);
            rule__Namespace__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Namespace__Group__5_in_rule__Namespace__Group__42594);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1252:1: rule__Namespace__Group__4__Impl : ( ( rule__Namespace__ElementsAssignment_4 )* ) ;
    public final void rule__Namespace__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1256:1: ( ( ( rule__Namespace__ElementsAssignment_4 )* ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1257:1: ( ( rule__Namespace__ElementsAssignment_4 )* )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1257:1: ( ( rule__Namespace__ElementsAssignment_4 )* )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1258:1: ( rule__Namespace__ElementsAssignment_4 )*
            {
             before(grammarAccess.getNamespaceAccess().getElementsAssignment_4()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1259:1: ( rule__Namespace__ElementsAssignment_4 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_DOC||LA12_0==25||LA12_0==29||LA12_0==33||LA12_0==35) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1259:2: rule__Namespace__ElementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Namespace__ElementsAssignment_4_in_rule__Namespace__Group__4__Impl2621);
            	    rule__Namespace__ElementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1269:1: rule__Namespace__Group__5 : rule__Namespace__Group__5__Impl ;
    public final void rule__Namespace__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1273:1: ( rule__Namespace__Group__5__Impl )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1274:2: rule__Namespace__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Namespace__Group__5__Impl_in_rule__Namespace__Group__52652);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1280:1: rule__Namespace__Group__5__Impl : ( '}' ) ;
    public final void rule__Namespace__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1284:1: ( ( '}' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1285:1: ( '}' )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1285:1: ( '}' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1286:1: '}'
            {
             before(grammarAccess.getNamespaceAccess().getRightCurlyBracketKeyword_5()); 
            match(input,22,FOLLOW_22_in_rule__Namespace__Group__5__Impl2680); 
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1311:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1315:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1316:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02723);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02726);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1323:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1327:1: ( ( 'import' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1328:1: ( 'import' )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1328:1: ( 'import' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1329:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__Import__Group__0__Impl2754); 
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1342:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1346:1: ( rule__Import__Group__1__Impl )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1347:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12785);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1353:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1357:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1358:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1358:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1359:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1360:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1360:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl2812);
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


    // $ANTLR start "rule__Duration__Group__0"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1374:1: rule__Duration__Group__0 : rule__Duration__Group__0__Impl rule__Duration__Group__1 ;
    public final void rule__Duration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1378:1: ( rule__Duration__Group__0__Impl rule__Duration__Group__1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1379:2: rule__Duration__Group__0__Impl rule__Duration__Group__1
            {
            pushFollow(FOLLOW_rule__Duration__Group__0__Impl_in_rule__Duration__Group__02846);
            rule__Duration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Duration__Group__1_in_rule__Duration__Group__02849);
            rule__Duration__Group__1();

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
    // $ANTLR end "rule__Duration__Group__0"


    // $ANTLR start "rule__Duration__Group__0__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1386:1: rule__Duration__Group__0__Impl : ( ( rule__Duration__TimeAssignment_0 ) ) ;
    public final void rule__Duration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1390:1: ( ( ( rule__Duration__TimeAssignment_0 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1391:1: ( ( rule__Duration__TimeAssignment_0 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1391:1: ( ( rule__Duration__TimeAssignment_0 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1392:1: ( rule__Duration__TimeAssignment_0 )
            {
             before(grammarAccess.getDurationAccess().getTimeAssignment_0()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1393:1: ( rule__Duration__TimeAssignment_0 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1393:2: rule__Duration__TimeAssignment_0
            {
            pushFollow(FOLLOW_rule__Duration__TimeAssignment_0_in_rule__Duration__Group__0__Impl2876);
            rule__Duration__TimeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDurationAccess().getTimeAssignment_0()); 

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
    // $ANTLR end "rule__Duration__Group__0__Impl"


    // $ANTLR start "rule__Duration__Group__1"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1403:1: rule__Duration__Group__1 : rule__Duration__Group__1__Impl ;
    public final void rule__Duration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1407:1: ( rule__Duration__Group__1__Impl )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1408:2: rule__Duration__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Duration__Group__1__Impl_in_rule__Duration__Group__12906);
            rule__Duration__Group__1__Impl();

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
    // $ANTLR end "rule__Duration__Group__1"


    // $ANTLR start "rule__Duration__Group__1__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1414:1: rule__Duration__Group__1__Impl : ( ( rule__Duration__UnitAssignment_1 ) ) ;
    public final void rule__Duration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1418:1: ( ( ( rule__Duration__UnitAssignment_1 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1419:1: ( ( rule__Duration__UnitAssignment_1 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1419:1: ( ( rule__Duration__UnitAssignment_1 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1420:1: ( rule__Duration__UnitAssignment_1 )
            {
             before(grammarAccess.getDurationAccess().getUnitAssignment_1()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1421:1: ( rule__Duration__UnitAssignment_1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1421:2: rule__Duration__UnitAssignment_1
            {
            pushFollow(FOLLOW_rule__Duration__UnitAssignment_1_in_rule__Duration__Group__1__Impl2933);
            rule__Duration__UnitAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDurationAccess().getUnitAssignment_1()); 

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
    // $ANTLR end "rule__Duration__Group__1__Impl"


    // $ANTLR start "rule__Command__Group__0"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1435:1: rule__Command__Group__0 : rule__Command__Group__0__Impl rule__Command__Group__1 ;
    public final void rule__Command__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1439:1: ( rule__Command__Group__0__Impl rule__Command__Group__1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1440:2: rule__Command__Group__0__Impl rule__Command__Group__1
            {
            pushFollow(FOLLOW_rule__Command__Group__0__Impl_in_rule__Command__Group__02967);
            rule__Command__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Command__Group__1_in_rule__Command__Group__02970);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1447:1: rule__Command__Group__0__Impl : ( ( rule__Command__DocAssignment_0 )? ) ;
    public final void rule__Command__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1451:1: ( ( ( rule__Command__DocAssignment_0 )? ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1452:1: ( ( rule__Command__DocAssignment_0 )? )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1452:1: ( ( rule__Command__DocAssignment_0 )? )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1453:1: ( rule__Command__DocAssignment_0 )?
            {
             before(grammarAccess.getCommandAccess().getDocAssignment_0()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1454:1: ( rule__Command__DocAssignment_0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_DOC) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1454:2: rule__Command__DocAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Command__DocAssignment_0_in_rule__Command__Group__0__Impl2997);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1464:1: rule__Command__Group__1 : rule__Command__Group__1__Impl rule__Command__Group__2 ;
    public final void rule__Command__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1468:1: ( rule__Command__Group__1__Impl rule__Command__Group__2 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1469:2: rule__Command__Group__1__Impl rule__Command__Group__2
            {
            pushFollow(FOLLOW_rule__Command__Group__1__Impl_in_rule__Command__Group__13028);
            rule__Command__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Command__Group__2_in_rule__Command__Group__13031);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1476:1: rule__Command__Group__1__Impl : ( 'command' ) ;
    public final void rule__Command__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1480:1: ( ( 'command' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1481:1: ( 'command' )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1481:1: ( 'command' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1482:1: 'command'
            {
             before(grammarAccess.getCommandAccess().getCommandKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__Command__Group__1__Impl3059); 
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1495:1: rule__Command__Group__2 : rule__Command__Group__2__Impl rule__Command__Group__3 ;
    public final void rule__Command__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1499:1: ( rule__Command__Group__2__Impl rule__Command__Group__3 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1500:2: rule__Command__Group__2__Impl rule__Command__Group__3
            {
            pushFollow(FOLLOW_rule__Command__Group__2__Impl_in_rule__Command__Group__23090);
            rule__Command__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Command__Group__3_in_rule__Command__Group__23093);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1507:1: rule__Command__Group__2__Impl : ( ( rule__Command__NameAssignment_2 ) ) ;
    public final void rule__Command__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1511:1: ( ( ( rule__Command__NameAssignment_2 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1512:1: ( ( rule__Command__NameAssignment_2 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1512:1: ( ( rule__Command__NameAssignment_2 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1513:1: ( rule__Command__NameAssignment_2 )
            {
             before(grammarAccess.getCommandAccess().getNameAssignment_2()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1514:1: ( rule__Command__NameAssignment_2 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1514:2: rule__Command__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Command__NameAssignment_2_in_rule__Command__Group__2__Impl3120);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1524:1: rule__Command__Group__3 : rule__Command__Group__3__Impl rule__Command__Group__4 ;
    public final void rule__Command__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1528:1: ( rule__Command__Group__3__Impl rule__Command__Group__4 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1529:2: rule__Command__Group__3__Impl rule__Command__Group__4
            {
            pushFollow(FOLLOW_rule__Command__Group__3__Impl_in_rule__Command__Group__33150);
            rule__Command__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Command__Group__4_in_rule__Command__Group__33153);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1536:1: rule__Command__Group__3__Impl : ( ( rule__Command__Group_3__0 )? ) ;
    public final void rule__Command__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1540:1: ( ( ( rule__Command__Group_3__0 )? ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1541:1: ( ( rule__Command__Group_3__0 )? )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1541:1: ( ( rule__Command__Group_3__0 )? )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1542:1: ( rule__Command__Group_3__0 )?
            {
             before(grammarAccess.getCommandAccess().getGroup_3()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1543:1: ( rule__Command__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1543:2: rule__Command__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Command__Group_3__0_in_rule__Command__Group__3__Impl3180);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1553:1: rule__Command__Group__4 : rule__Command__Group__4__Impl rule__Command__Group__5 ;
    public final void rule__Command__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1557:1: ( rule__Command__Group__4__Impl rule__Command__Group__5 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1558:2: rule__Command__Group__4__Impl rule__Command__Group__5
            {
            pushFollow(FOLLOW_rule__Command__Group__4__Impl_in_rule__Command__Group__43211);
            rule__Command__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Command__Group__5_in_rule__Command__Group__43214);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1565:1: rule__Command__Group__4__Impl : ( ( rule__Command__Group_4__0 )? ) ;
    public final void rule__Command__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1569:1: ( ( ( rule__Command__Group_4__0 )? ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1570:1: ( ( rule__Command__Group_4__0 )? )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1570:1: ( ( rule__Command__Group_4__0 )? )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1571:1: ( rule__Command__Group_4__0 )?
            {
             before(grammarAccess.getCommandAccess().getGroup_4()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1572:1: ( rule__Command__Group_4__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1572:2: rule__Command__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Command__Group_4__0_in_rule__Command__Group__4__Impl3241);
                    rule__Command__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCommandAccess().getGroup_4()); 

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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1582:1: rule__Command__Group__5 : rule__Command__Group__5__Impl rule__Command__Group__6 ;
    public final void rule__Command__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1586:1: ( rule__Command__Group__5__Impl rule__Command__Group__6 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1587:2: rule__Command__Group__5__Impl rule__Command__Group__6
            {
            pushFollow(FOLLOW_rule__Command__Group__5__Impl_in_rule__Command__Group__53272);
            rule__Command__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Command__Group__6_in_rule__Command__Group__53275);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1594:1: rule__Command__Group__5__Impl : ( '{' ) ;
    public final void rule__Command__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1598:1: ( ( '{' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1599:1: ( '{' )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1599:1: ( '{' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1600:1: '{'
            {
             before(grammarAccess.getCommandAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,21,FOLLOW_21_in_rule__Command__Group__5__Impl3303); 
             after(grammarAccess.getCommandAccess().getLeftCurlyBracketKeyword_5()); 

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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1613:1: rule__Command__Group__6 : rule__Command__Group__6__Impl rule__Command__Group__7 ;
    public final void rule__Command__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1617:1: ( rule__Command__Group__6__Impl rule__Command__Group__7 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1618:2: rule__Command__Group__6__Impl rule__Command__Group__7
            {
            pushFollow(FOLLOW_rule__Command__Group__6__Impl_in_rule__Command__Group__63334);
            rule__Command__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Command__Group__7_in_rule__Command__Group__63337);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1625:1: rule__Command__Group__6__Impl : ( ( rule__Command__AttributesAssignment_6 )* ) ;
    public final void rule__Command__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1629:1: ( ( ( rule__Command__AttributesAssignment_6 )* ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1630:1: ( ( rule__Command__AttributesAssignment_6 )* )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1630:1: ( ( rule__Command__AttributesAssignment_6 )* )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1631:1: ( rule__Command__AttributesAssignment_6 )*
            {
             before(grammarAccess.getCommandAccess().getAttributesAssignment_6()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1632:1: ( rule__Command__AttributesAssignment_6 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_DOC)||LA16_0==46) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1632:2: rule__Command__AttributesAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Command__AttributesAssignment_6_in_rule__Command__Group__6__Impl3364);
            	    rule__Command__AttributesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getCommandAccess().getAttributesAssignment_6()); 

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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1642:1: rule__Command__Group__7 : rule__Command__Group__7__Impl rule__Command__Group__8 ;
    public final void rule__Command__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1646:1: ( rule__Command__Group__7__Impl rule__Command__Group__8 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1647:2: rule__Command__Group__7__Impl rule__Command__Group__8
            {
            pushFollow(FOLLOW_rule__Command__Group__7__Impl_in_rule__Command__Group__73395);
            rule__Command__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Command__Group__8_in_rule__Command__Group__73398);
            rule__Command__Group__8();

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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1654:1: rule__Command__Group__7__Impl : ( ( rule__Command__Group_7__0 )? ) ;
    public final void rule__Command__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1658:1: ( ( ( rule__Command__Group_7__0 )? ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1659:1: ( ( rule__Command__Group_7__0 )? )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1659:1: ( ( rule__Command__Group_7__0 )? )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1660:1: ( rule__Command__Group_7__0 )?
            {
             before(grammarAccess.getCommandAccess().getGroup_7()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1661:1: ( rule__Command__Group_7__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==28) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1661:2: rule__Command__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Command__Group_7__0_in_rule__Command__Group__7__Impl3425);
                    rule__Command__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCommandAccess().getGroup_7()); 

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


    // $ANTLR start "rule__Command__Group__8"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1671:1: rule__Command__Group__8 : rule__Command__Group__8__Impl ;
    public final void rule__Command__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1675:1: ( rule__Command__Group__8__Impl )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1676:2: rule__Command__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Command__Group__8__Impl_in_rule__Command__Group__83456);
            rule__Command__Group__8__Impl();

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
    // $ANTLR end "rule__Command__Group__8"


    // $ANTLR start "rule__Command__Group__8__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1682:1: rule__Command__Group__8__Impl : ( '}' ) ;
    public final void rule__Command__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1686:1: ( ( '}' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1687:1: ( '}' )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1687:1: ( '}' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1688:1: '}'
            {
             before(grammarAccess.getCommandAccess().getRightCurlyBracketKeyword_8()); 
            match(input,22,FOLLOW_22_in_rule__Command__Group__8__Impl3484); 
             after(grammarAccess.getCommandAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__Command__Group__8__Impl"


    // $ANTLR start "rule__Command__Group_3__0"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1719:1: rule__Command__Group_3__0 : rule__Command__Group_3__0__Impl rule__Command__Group_3__1 ;
    public final void rule__Command__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1723:1: ( rule__Command__Group_3__0__Impl rule__Command__Group_3__1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1724:2: rule__Command__Group_3__0__Impl rule__Command__Group_3__1
            {
            pushFollow(FOLLOW_rule__Command__Group_3__0__Impl_in_rule__Command__Group_3__03533);
            rule__Command__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Command__Group_3__1_in_rule__Command__Group_3__03536);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1731:1: rule__Command__Group_3__0__Impl : ( 'target' ) ;
    public final void rule__Command__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1735:1: ( ( 'target' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1736:1: ( 'target' )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1736:1: ( 'target' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1737:1: 'target'
            {
             before(grammarAccess.getCommandAccess().getTargetKeyword_3_0()); 
            match(input,26,FOLLOW_26_in_rule__Command__Group_3__0__Impl3564); 
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1750:1: rule__Command__Group_3__1 : rule__Command__Group_3__1__Impl ;
    public final void rule__Command__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1754:1: ( rule__Command__Group_3__1__Impl )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1755:2: rule__Command__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Command__Group_3__1__Impl_in_rule__Command__Group_3__13595);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1761:1: rule__Command__Group_3__1__Impl : ( ( rule__Command__TargetAssignment_3_1 ) ) ;
    public final void rule__Command__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1765:1: ( ( ( rule__Command__TargetAssignment_3_1 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1766:1: ( ( rule__Command__TargetAssignment_3_1 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1766:1: ( ( rule__Command__TargetAssignment_3_1 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1767:1: ( rule__Command__TargetAssignment_3_1 )
            {
             before(grammarAccess.getCommandAccess().getTargetAssignment_3_1()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1768:1: ( rule__Command__TargetAssignment_3_1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1768:2: rule__Command__TargetAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Command__TargetAssignment_3_1_in_rule__Command__Group_3__1__Impl3622);
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


    // $ANTLR start "rule__Command__Group_4__0"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1782:1: rule__Command__Group_4__0 : rule__Command__Group_4__0__Impl rule__Command__Group_4__1 ;
    public final void rule__Command__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1786:1: ( rule__Command__Group_4__0__Impl rule__Command__Group_4__1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1787:2: rule__Command__Group_4__0__Impl rule__Command__Group_4__1
            {
            pushFollow(FOLLOW_rule__Command__Group_4__0__Impl_in_rule__Command__Group_4__03656);
            rule__Command__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Command__Group_4__1_in_rule__Command__Group_4__03659);
            rule__Command__Group_4__1();

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
    // $ANTLR end "rule__Command__Group_4__0"


    // $ANTLR start "rule__Command__Group_4__0__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1794:1: rule__Command__Group_4__0__Impl : ( 'sla' ) ;
    public final void rule__Command__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1798:1: ( ( 'sla' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1799:1: ( 'sla' )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1799:1: ( 'sla' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1800:1: 'sla'
            {
             before(grammarAccess.getCommandAccess().getSlaKeyword_4_0()); 
            match(input,27,FOLLOW_27_in_rule__Command__Group_4__0__Impl3687); 
             after(grammarAccess.getCommandAccess().getSlaKeyword_4_0()); 

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
    // $ANTLR end "rule__Command__Group_4__0__Impl"


    // $ANTLR start "rule__Command__Group_4__1"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1813:1: rule__Command__Group_4__1 : rule__Command__Group_4__1__Impl ;
    public final void rule__Command__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1817:1: ( rule__Command__Group_4__1__Impl )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1818:2: rule__Command__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Command__Group_4__1__Impl_in_rule__Command__Group_4__13718);
            rule__Command__Group_4__1__Impl();

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
    // $ANTLR end "rule__Command__Group_4__1"


    // $ANTLR start "rule__Command__Group_4__1__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1824:1: rule__Command__Group_4__1__Impl : ( ( rule__Command__AcceptableAssignment_4_1 ) ) ;
    public final void rule__Command__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1828:1: ( ( ( rule__Command__AcceptableAssignment_4_1 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1829:1: ( ( rule__Command__AcceptableAssignment_4_1 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1829:1: ( ( rule__Command__AcceptableAssignment_4_1 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1830:1: ( rule__Command__AcceptableAssignment_4_1 )
            {
             before(grammarAccess.getCommandAccess().getAcceptableAssignment_4_1()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1831:1: ( rule__Command__AcceptableAssignment_4_1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1831:2: rule__Command__AcceptableAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Command__AcceptableAssignment_4_1_in_rule__Command__Group_4__1__Impl3745);
            rule__Command__AcceptableAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getCommandAccess().getAcceptableAssignment_4_1()); 

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
    // $ANTLR end "rule__Command__Group_4__1__Impl"


    // $ANTLR start "rule__Command__Group_7__0"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1845:1: rule__Command__Group_7__0 : rule__Command__Group_7__0__Impl rule__Command__Group_7__1 ;
    public final void rule__Command__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1849:1: ( rule__Command__Group_7__0__Impl rule__Command__Group_7__1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1850:2: rule__Command__Group_7__0__Impl rule__Command__Group_7__1
            {
            pushFollow(FOLLOW_rule__Command__Group_7__0__Impl_in_rule__Command__Group_7__03779);
            rule__Command__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Command__Group_7__1_in_rule__Command__Group_7__03782);
            rule__Command__Group_7__1();

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
    // $ANTLR end "rule__Command__Group_7__0"


    // $ANTLR start "rule__Command__Group_7__0__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1857:1: rule__Command__Group_7__0__Impl : ( 'message' ) ;
    public final void rule__Command__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1861:1: ( ( 'message' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1862:1: ( 'message' )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1862:1: ( 'message' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1863:1: 'message'
            {
             before(grammarAccess.getCommandAccess().getMessageKeyword_7_0()); 
            match(input,28,FOLLOW_28_in_rule__Command__Group_7__0__Impl3810); 
             after(grammarAccess.getCommandAccess().getMessageKeyword_7_0()); 

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
    // $ANTLR end "rule__Command__Group_7__0__Impl"


    // $ANTLR start "rule__Command__Group_7__1"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1876:1: rule__Command__Group_7__1 : rule__Command__Group_7__1__Impl ;
    public final void rule__Command__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1880:1: ( rule__Command__Group_7__1__Impl )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1881:2: rule__Command__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__Command__Group_7__1__Impl_in_rule__Command__Group_7__13841);
            rule__Command__Group_7__1__Impl();

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
    // $ANTLR end "rule__Command__Group_7__1"


    // $ANTLR start "rule__Command__Group_7__1__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1887:1: rule__Command__Group_7__1__Impl : ( ( rule__Command__MessageAssignment_7_1 ) ) ;
    public final void rule__Command__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1891:1: ( ( ( rule__Command__MessageAssignment_7_1 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1892:1: ( ( rule__Command__MessageAssignment_7_1 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1892:1: ( ( rule__Command__MessageAssignment_7_1 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1893:1: ( rule__Command__MessageAssignment_7_1 )
            {
             before(grammarAccess.getCommandAccess().getMessageAssignment_7_1()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1894:1: ( rule__Command__MessageAssignment_7_1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1894:2: rule__Command__MessageAssignment_7_1
            {
            pushFollow(FOLLOW_rule__Command__MessageAssignment_7_1_in_rule__Command__Group_7__1__Impl3868);
            rule__Command__MessageAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getCommandAccess().getMessageAssignment_7_1()); 

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
    // $ANTLR end "rule__Command__Group_7__1__Impl"


    // $ANTLR start "rule__CommandHandler__Group__0"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1908:1: rule__CommandHandler__Group__0 : rule__CommandHandler__Group__0__Impl rule__CommandHandler__Group__1 ;
    public final void rule__CommandHandler__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1912:1: ( rule__CommandHandler__Group__0__Impl rule__CommandHandler__Group__1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1913:2: rule__CommandHandler__Group__0__Impl rule__CommandHandler__Group__1
            {
            pushFollow(FOLLOW_rule__CommandHandler__Group__0__Impl_in_rule__CommandHandler__Group__03902);
            rule__CommandHandler__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CommandHandler__Group__1_in_rule__CommandHandler__Group__03905);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1920:1: rule__CommandHandler__Group__0__Impl : ( ( rule__CommandHandler__DocAssignment_0 )? ) ;
    public final void rule__CommandHandler__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1924:1: ( ( ( rule__CommandHandler__DocAssignment_0 )? ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1925:1: ( ( rule__CommandHandler__DocAssignment_0 )? )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1925:1: ( ( rule__CommandHandler__DocAssignment_0 )? )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1926:1: ( rule__CommandHandler__DocAssignment_0 )?
            {
             before(grammarAccess.getCommandHandlerAccess().getDocAssignment_0()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1927:1: ( rule__CommandHandler__DocAssignment_0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_DOC) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1927:2: rule__CommandHandler__DocAssignment_0
                    {
                    pushFollow(FOLLOW_rule__CommandHandler__DocAssignment_0_in_rule__CommandHandler__Group__0__Impl3932);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1937:1: rule__CommandHandler__Group__1 : rule__CommandHandler__Group__1__Impl rule__CommandHandler__Group__2 ;
    public final void rule__CommandHandler__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1941:1: ( rule__CommandHandler__Group__1__Impl rule__CommandHandler__Group__2 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1942:2: rule__CommandHandler__Group__1__Impl rule__CommandHandler__Group__2
            {
            pushFollow(FOLLOW_rule__CommandHandler__Group__1__Impl_in_rule__CommandHandler__Group__13963);
            rule__CommandHandler__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CommandHandler__Group__2_in_rule__CommandHandler__Group__13966);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1949:1: rule__CommandHandler__Group__1__Impl : ( 'command-handler' ) ;
    public final void rule__CommandHandler__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1953:1: ( ( 'command-handler' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1954:1: ( 'command-handler' )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1954:1: ( 'command-handler' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1955:1: 'command-handler'
            {
             before(grammarAccess.getCommandHandlerAccess().getCommandHandlerKeyword_1()); 
            match(input,29,FOLLOW_29_in_rule__CommandHandler__Group__1__Impl3994); 
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1968:1: rule__CommandHandler__Group__2 : rule__CommandHandler__Group__2__Impl rule__CommandHandler__Group__3 ;
    public final void rule__CommandHandler__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1972:1: ( rule__CommandHandler__Group__2__Impl rule__CommandHandler__Group__3 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1973:2: rule__CommandHandler__Group__2__Impl rule__CommandHandler__Group__3
            {
            pushFollow(FOLLOW_rule__CommandHandler__Group__2__Impl_in_rule__CommandHandler__Group__24025);
            rule__CommandHandler__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CommandHandler__Group__3_in_rule__CommandHandler__Group__24028);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1980:1: rule__CommandHandler__Group__2__Impl : ( ( rule__CommandHandler__NameAssignment_2 ) ) ;
    public final void rule__CommandHandler__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1984:1: ( ( ( rule__CommandHandler__NameAssignment_2 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1985:1: ( ( rule__CommandHandler__NameAssignment_2 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1985:1: ( ( rule__CommandHandler__NameAssignment_2 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1986:1: ( rule__CommandHandler__NameAssignment_2 )
            {
             before(grammarAccess.getCommandHandlerAccess().getNameAssignment_2()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1987:1: ( rule__CommandHandler__NameAssignment_2 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1987:2: rule__CommandHandler__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__CommandHandler__NameAssignment_2_in_rule__CommandHandler__Group__2__Impl4055);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1997:1: rule__CommandHandler__Group__3 : rule__CommandHandler__Group__3__Impl rule__CommandHandler__Group__4 ;
    public final void rule__CommandHandler__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2001:1: ( rule__CommandHandler__Group__3__Impl rule__CommandHandler__Group__4 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2002:2: rule__CommandHandler__Group__3__Impl rule__CommandHandler__Group__4
            {
            pushFollow(FOLLOW_rule__CommandHandler__Group__3__Impl_in_rule__CommandHandler__Group__34085);
            rule__CommandHandler__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CommandHandler__Group__4_in_rule__CommandHandler__Group__34088);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2009:1: rule__CommandHandler__Group__3__Impl : ( 'handles' ) ;
    public final void rule__CommandHandler__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2013:1: ( ( 'handles' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2014:1: ( 'handles' )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2014:1: ( 'handles' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2015:1: 'handles'
            {
             before(grammarAccess.getCommandHandlerAccess().getHandlesKeyword_3()); 
            match(input,30,FOLLOW_30_in_rule__CommandHandler__Group__3__Impl4116); 
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2028:1: rule__CommandHandler__Group__4 : rule__CommandHandler__Group__4__Impl rule__CommandHandler__Group__5 ;
    public final void rule__CommandHandler__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2032:1: ( rule__CommandHandler__Group__4__Impl rule__CommandHandler__Group__5 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2033:2: rule__CommandHandler__Group__4__Impl rule__CommandHandler__Group__5
            {
            pushFollow(FOLLOW_rule__CommandHandler__Group__4__Impl_in_rule__CommandHandler__Group__44147);
            rule__CommandHandler__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CommandHandler__Group__5_in_rule__CommandHandler__Group__44150);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2040:1: rule__CommandHandler__Group__4__Impl : ( ( rule__CommandHandler__CommandsAssignment_4 ) ) ;
    public final void rule__CommandHandler__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2044:1: ( ( ( rule__CommandHandler__CommandsAssignment_4 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2045:1: ( ( rule__CommandHandler__CommandsAssignment_4 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2045:1: ( ( rule__CommandHandler__CommandsAssignment_4 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2046:1: ( rule__CommandHandler__CommandsAssignment_4 )
            {
             before(grammarAccess.getCommandHandlerAccess().getCommandsAssignment_4()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2047:1: ( rule__CommandHandler__CommandsAssignment_4 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2047:2: rule__CommandHandler__CommandsAssignment_4
            {
            pushFollow(FOLLOW_rule__CommandHandler__CommandsAssignment_4_in_rule__CommandHandler__Group__4__Impl4177);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2057:1: rule__CommandHandler__Group__5 : rule__CommandHandler__Group__5__Impl rule__CommandHandler__Group__6 ;
    public final void rule__CommandHandler__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2061:1: ( rule__CommandHandler__Group__5__Impl rule__CommandHandler__Group__6 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2062:2: rule__CommandHandler__Group__5__Impl rule__CommandHandler__Group__6
            {
            pushFollow(FOLLOW_rule__CommandHandler__Group__5__Impl_in_rule__CommandHandler__Group__54207);
            rule__CommandHandler__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CommandHandler__Group__6_in_rule__CommandHandler__Group__54210);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2069:1: rule__CommandHandler__Group__5__Impl : ( ( rule__CommandHandler__Group_5__0 )* ) ;
    public final void rule__CommandHandler__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2073:1: ( ( ( rule__CommandHandler__Group_5__0 )* ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2074:1: ( ( rule__CommandHandler__Group_5__0 )* )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2074:1: ( ( rule__CommandHandler__Group_5__0 )* )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2075:1: ( rule__CommandHandler__Group_5__0 )*
            {
             before(grammarAccess.getCommandHandlerAccess().getGroup_5()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2076:1: ( rule__CommandHandler__Group_5__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==31) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2076:2: rule__CommandHandler__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__CommandHandler__Group_5__0_in_rule__CommandHandler__Group__5__Impl4237);
            	    rule__CommandHandler__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2086:1: rule__CommandHandler__Group__6 : rule__CommandHandler__Group__6__Impl ;
    public final void rule__CommandHandler__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2090:1: ( rule__CommandHandler__Group__6__Impl )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2091:2: rule__CommandHandler__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__CommandHandler__Group__6__Impl_in_rule__CommandHandler__Group__64268);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2097:1: rule__CommandHandler__Group__6__Impl : ( ( rule__CommandHandler__Group_6__0 )? ) ;
    public final void rule__CommandHandler__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2101:1: ( ( ( rule__CommandHandler__Group_6__0 )? ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2102:1: ( ( rule__CommandHandler__Group_6__0 )? )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2102:1: ( ( rule__CommandHandler__Group_6__0 )? )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2103:1: ( rule__CommandHandler__Group_6__0 )?
            {
             before(grammarAccess.getCommandHandlerAccess().getGroup_6()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2104:1: ( rule__CommandHandler__Group_6__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==32) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2104:2: rule__CommandHandler__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__CommandHandler__Group_6__0_in_rule__CommandHandler__Group__6__Impl4295);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2128:1: rule__CommandHandler__Group_5__0 : rule__CommandHandler__Group_5__0__Impl rule__CommandHandler__Group_5__1 ;
    public final void rule__CommandHandler__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2132:1: ( rule__CommandHandler__Group_5__0__Impl rule__CommandHandler__Group_5__1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2133:2: rule__CommandHandler__Group_5__0__Impl rule__CommandHandler__Group_5__1
            {
            pushFollow(FOLLOW_rule__CommandHandler__Group_5__0__Impl_in_rule__CommandHandler__Group_5__04340);
            rule__CommandHandler__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CommandHandler__Group_5__1_in_rule__CommandHandler__Group_5__04343);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2140:1: rule__CommandHandler__Group_5__0__Impl : ( ',' ) ;
    public final void rule__CommandHandler__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2144:1: ( ( ',' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2145:1: ( ',' )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2145:1: ( ',' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2146:1: ','
            {
             before(grammarAccess.getCommandHandlerAccess().getCommaKeyword_5_0()); 
            match(input,31,FOLLOW_31_in_rule__CommandHandler__Group_5__0__Impl4371); 
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2159:1: rule__CommandHandler__Group_5__1 : rule__CommandHandler__Group_5__1__Impl ;
    public final void rule__CommandHandler__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2163:1: ( rule__CommandHandler__Group_5__1__Impl )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2164:2: rule__CommandHandler__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__CommandHandler__Group_5__1__Impl_in_rule__CommandHandler__Group_5__14402);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2170:1: rule__CommandHandler__Group_5__1__Impl : ( ( rule__CommandHandler__CommandsAssignment_5_1 ) ) ;
    public final void rule__CommandHandler__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2174:1: ( ( ( rule__CommandHandler__CommandsAssignment_5_1 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2175:1: ( ( rule__CommandHandler__CommandsAssignment_5_1 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2175:1: ( ( rule__CommandHandler__CommandsAssignment_5_1 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2176:1: ( rule__CommandHandler__CommandsAssignment_5_1 )
            {
             before(grammarAccess.getCommandHandlerAccess().getCommandsAssignment_5_1()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2177:1: ( rule__CommandHandler__CommandsAssignment_5_1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2177:2: rule__CommandHandler__CommandsAssignment_5_1
            {
            pushFollow(FOLLOW_rule__CommandHandler__CommandsAssignment_5_1_in_rule__CommandHandler__Group_5__1__Impl4429);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2191:1: rule__CommandHandler__Group_6__0 : rule__CommandHandler__Group_6__0__Impl rule__CommandHandler__Group_6__1 ;
    public final void rule__CommandHandler__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2195:1: ( rule__CommandHandler__Group_6__0__Impl rule__CommandHandler__Group_6__1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2196:2: rule__CommandHandler__Group_6__0__Impl rule__CommandHandler__Group_6__1
            {
            pushFollow(FOLLOW_rule__CommandHandler__Group_6__0__Impl_in_rule__CommandHandler__Group_6__04463);
            rule__CommandHandler__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CommandHandler__Group_6__1_in_rule__CommandHandler__Group_6__04466);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2203:1: rule__CommandHandler__Group_6__0__Impl : ( 'uses' ) ;
    public final void rule__CommandHandler__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2207:1: ( ( 'uses' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2208:1: ( 'uses' )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2208:1: ( 'uses' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2209:1: 'uses'
            {
             before(grammarAccess.getCommandHandlerAccess().getUsesKeyword_6_0()); 
            match(input,32,FOLLOW_32_in_rule__CommandHandler__Group_6__0__Impl4494); 
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2222:1: rule__CommandHandler__Group_6__1 : rule__CommandHandler__Group_6__1__Impl rule__CommandHandler__Group_6__2 ;
    public final void rule__CommandHandler__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2226:1: ( rule__CommandHandler__Group_6__1__Impl rule__CommandHandler__Group_6__2 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2227:2: rule__CommandHandler__Group_6__1__Impl rule__CommandHandler__Group_6__2
            {
            pushFollow(FOLLOW_rule__CommandHandler__Group_6__1__Impl_in_rule__CommandHandler__Group_6__14525);
            rule__CommandHandler__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CommandHandler__Group_6__2_in_rule__CommandHandler__Group_6__14528);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2234:1: rule__CommandHandler__Group_6__1__Impl : ( ( rule__CommandHandler__AggregatesAssignment_6_1 ) ) ;
    public final void rule__CommandHandler__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2238:1: ( ( ( rule__CommandHandler__AggregatesAssignment_6_1 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2239:1: ( ( rule__CommandHandler__AggregatesAssignment_6_1 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2239:1: ( ( rule__CommandHandler__AggregatesAssignment_6_1 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2240:1: ( rule__CommandHandler__AggregatesAssignment_6_1 )
            {
             before(grammarAccess.getCommandHandlerAccess().getAggregatesAssignment_6_1()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2241:1: ( rule__CommandHandler__AggregatesAssignment_6_1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2241:2: rule__CommandHandler__AggregatesAssignment_6_1
            {
            pushFollow(FOLLOW_rule__CommandHandler__AggregatesAssignment_6_1_in_rule__CommandHandler__Group_6__1__Impl4555);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2251:1: rule__CommandHandler__Group_6__2 : rule__CommandHandler__Group_6__2__Impl ;
    public final void rule__CommandHandler__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2255:1: ( rule__CommandHandler__Group_6__2__Impl )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2256:2: rule__CommandHandler__Group_6__2__Impl
            {
            pushFollow(FOLLOW_rule__CommandHandler__Group_6__2__Impl_in_rule__CommandHandler__Group_6__24585);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2262:1: rule__CommandHandler__Group_6__2__Impl : ( ( rule__CommandHandler__Group_6_2__0 )* ) ;
    public final void rule__CommandHandler__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2266:1: ( ( ( rule__CommandHandler__Group_6_2__0 )* ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2267:1: ( ( rule__CommandHandler__Group_6_2__0 )* )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2267:1: ( ( rule__CommandHandler__Group_6_2__0 )* )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2268:1: ( rule__CommandHandler__Group_6_2__0 )*
            {
             before(grammarAccess.getCommandHandlerAccess().getGroup_6_2()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2269:1: ( rule__CommandHandler__Group_6_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==31) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2269:2: rule__CommandHandler__Group_6_2__0
            	    {
            	    pushFollow(FOLLOW_rule__CommandHandler__Group_6_2__0_in_rule__CommandHandler__Group_6__2__Impl4612);
            	    rule__CommandHandler__Group_6_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2285:1: rule__CommandHandler__Group_6_2__0 : rule__CommandHandler__Group_6_2__0__Impl rule__CommandHandler__Group_6_2__1 ;
    public final void rule__CommandHandler__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2289:1: ( rule__CommandHandler__Group_6_2__0__Impl rule__CommandHandler__Group_6_2__1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2290:2: rule__CommandHandler__Group_6_2__0__Impl rule__CommandHandler__Group_6_2__1
            {
            pushFollow(FOLLOW_rule__CommandHandler__Group_6_2__0__Impl_in_rule__CommandHandler__Group_6_2__04649);
            rule__CommandHandler__Group_6_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CommandHandler__Group_6_2__1_in_rule__CommandHandler__Group_6_2__04652);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2297:1: rule__CommandHandler__Group_6_2__0__Impl : ( ',' ) ;
    public final void rule__CommandHandler__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2301:1: ( ( ',' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2302:1: ( ',' )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2302:1: ( ',' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2303:1: ','
            {
             before(grammarAccess.getCommandHandlerAccess().getCommaKeyword_6_2_0()); 
            match(input,31,FOLLOW_31_in_rule__CommandHandler__Group_6_2__0__Impl4680); 
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2316:1: rule__CommandHandler__Group_6_2__1 : rule__CommandHandler__Group_6_2__1__Impl ;
    public final void rule__CommandHandler__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2320:1: ( rule__CommandHandler__Group_6_2__1__Impl )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2321:2: rule__CommandHandler__Group_6_2__1__Impl
            {
            pushFollow(FOLLOW_rule__CommandHandler__Group_6_2__1__Impl_in_rule__CommandHandler__Group_6_2__14711);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2327:1: rule__CommandHandler__Group_6_2__1__Impl : ( ( rule__CommandHandler__AggregatesAssignment_6_2_1 ) ) ;
    public final void rule__CommandHandler__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2331:1: ( ( ( rule__CommandHandler__AggregatesAssignment_6_2_1 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2332:1: ( ( rule__CommandHandler__AggregatesAssignment_6_2_1 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2332:1: ( ( rule__CommandHandler__AggregatesAssignment_6_2_1 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2333:1: ( rule__CommandHandler__AggregatesAssignment_6_2_1 )
            {
             before(grammarAccess.getCommandHandlerAccess().getAggregatesAssignment_6_2_1()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2334:1: ( rule__CommandHandler__AggregatesAssignment_6_2_1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2334:2: rule__CommandHandler__AggregatesAssignment_6_2_1
            {
            pushFollow(FOLLOW_rule__CommandHandler__AggregatesAssignment_6_2_1_in_rule__CommandHandler__Group_6_2__1__Impl4738);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2348:1: rule__Projection__Group__0 : rule__Projection__Group__0__Impl rule__Projection__Group__1 ;
    public final void rule__Projection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2352:1: ( rule__Projection__Group__0__Impl rule__Projection__Group__1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2353:2: rule__Projection__Group__0__Impl rule__Projection__Group__1
            {
            pushFollow(FOLLOW_rule__Projection__Group__0__Impl_in_rule__Projection__Group__04772);
            rule__Projection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Projection__Group__1_in_rule__Projection__Group__04775);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2360:1: rule__Projection__Group__0__Impl : ( ( rule__Projection__DocAssignment_0 )? ) ;
    public final void rule__Projection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2364:1: ( ( ( rule__Projection__DocAssignment_0 )? ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2365:1: ( ( rule__Projection__DocAssignment_0 )? )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2365:1: ( ( rule__Projection__DocAssignment_0 )? )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2366:1: ( rule__Projection__DocAssignment_0 )?
            {
             before(grammarAccess.getProjectionAccess().getDocAssignment_0()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2367:1: ( rule__Projection__DocAssignment_0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_DOC) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2367:2: rule__Projection__DocAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Projection__DocAssignment_0_in_rule__Projection__Group__0__Impl4802);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2377:1: rule__Projection__Group__1 : rule__Projection__Group__1__Impl rule__Projection__Group__2 ;
    public final void rule__Projection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2381:1: ( rule__Projection__Group__1__Impl rule__Projection__Group__2 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2382:2: rule__Projection__Group__1__Impl rule__Projection__Group__2
            {
            pushFollow(FOLLOW_rule__Projection__Group__1__Impl_in_rule__Projection__Group__14833);
            rule__Projection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Projection__Group__2_in_rule__Projection__Group__14836);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2389:1: rule__Projection__Group__1__Impl : ( 'projection' ) ;
    public final void rule__Projection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2393:1: ( ( 'projection' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2394:1: ( 'projection' )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2394:1: ( 'projection' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2395:1: 'projection'
            {
             before(grammarAccess.getProjectionAccess().getProjectionKeyword_1()); 
            match(input,33,FOLLOW_33_in_rule__Projection__Group__1__Impl4864); 
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2408:1: rule__Projection__Group__2 : rule__Projection__Group__2__Impl rule__Projection__Group__3 ;
    public final void rule__Projection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2412:1: ( rule__Projection__Group__2__Impl rule__Projection__Group__3 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2413:2: rule__Projection__Group__2__Impl rule__Projection__Group__3
            {
            pushFollow(FOLLOW_rule__Projection__Group__2__Impl_in_rule__Projection__Group__24895);
            rule__Projection__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Projection__Group__3_in_rule__Projection__Group__24898);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2420:1: rule__Projection__Group__2__Impl : ( ( rule__Projection__NameAssignment_2 ) ) ;
    public final void rule__Projection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2424:1: ( ( ( rule__Projection__NameAssignment_2 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2425:1: ( ( rule__Projection__NameAssignment_2 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2425:1: ( ( rule__Projection__NameAssignment_2 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2426:1: ( rule__Projection__NameAssignment_2 )
            {
             before(grammarAccess.getProjectionAccess().getNameAssignment_2()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2427:1: ( rule__Projection__NameAssignment_2 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2427:2: rule__Projection__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Projection__NameAssignment_2_in_rule__Projection__Group__2__Impl4925);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2437:1: rule__Projection__Group__3 : rule__Projection__Group__3__Impl ;
    public final void rule__Projection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2441:1: ( rule__Projection__Group__3__Impl )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2442:2: rule__Projection__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Projection__Group__3__Impl_in_rule__Projection__Group__34955);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2448:1: rule__Projection__Group__3__Impl : ( ( rule__Projection__Group_3__0 )? ) ;
    public final void rule__Projection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2452:1: ( ( ( rule__Projection__Group_3__0 )? ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2453:1: ( ( rule__Projection__Group_3__0 )? )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2453:1: ( ( rule__Projection__Group_3__0 )? )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2454:1: ( rule__Projection__Group_3__0 )?
            {
             before(grammarAccess.getProjectionAccess().getGroup_3()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2455:1: ( rule__Projection__Group_3__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==34) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2455:2: rule__Projection__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Projection__Group_3__0_in_rule__Projection__Group__3__Impl4982);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2473:1: rule__Projection__Group_3__0 : rule__Projection__Group_3__0__Impl rule__Projection__Group_3__1 ;
    public final void rule__Projection__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2477:1: ( rule__Projection__Group_3__0__Impl rule__Projection__Group_3__1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2478:2: rule__Projection__Group_3__0__Impl rule__Projection__Group_3__1
            {
            pushFollow(FOLLOW_rule__Projection__Group_3__0__Impl_in_rule__Projection__Group_3__05021);
            rule__Projection__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Projection__Group_3__1_in_rule__Projection__Group_3__05024);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2485:1: rule__Projection__Group_3__0__Impl : ( 'input' ) ;
    public final void rule__Projection__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2489:1: ( ( 'input' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2490:1: ( 'input' )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2490:1: ( 'input' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2491:1: 'input'
            {
             before(grammarAccess.getProjectionAccess().getInputKeyword_3_0()); 
            match(input,34,FOLLOW_34_in_rule__Projection__Group_3__0__Impl5052); 
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2504:1: rule__Projection__Group_3__1 : rule__Projection__Group_3__1__Impl rule__Projection__Group_3__2 ;
    public final void rule__Projection__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2508:1: ( rule__Projection__Group_3__1__Impl rule__Projection__Group_3__2 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2509:2: rule__Projection__Group_3__1__Impl rule__Projection__Group_3__2
            {
            pushFollow(FOLLOW_rule__Projection__Group_3__1__Impl_in_rule__Projection__Group_3__15083);
            rule__Projection__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Projection__Group_3__2_in_rule__Projection__Group_3__15086);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2516:1: rule__Projection__Group_3__1__Impl : ( ( rule__Projection__EventsAssignment_3_1 ) ) ;
    public final void rule__Projection__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2520:1: ( ( ( rule__Projection__EventsAssignment_3_1 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2521:1: ( ( rule__Projection__EventsAssignment_3_1 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2521:1: ( ( rule__Projection__EventsAssignment_3_1 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2522:1: ( rule__Projection__EventsAssignment_3_1 )
            {
             before(grammarAccess.getProjectionAccess().getEventsAssignment_3_1()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2523:1: ( rule__Projection__EventsAssignment_3_1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2523:2: rule__Projection__EventsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Projection__EventsAssignment_3_1_in_rule__Projection__Group_3__1__Impl5113);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2533:1: rule__Projection__Group_3__2 : rule__Projection__Group_3__2__Impl ;
    public final void rule__Projection__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2537:1: ( rule__Projection__Group_3__2__Impl )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2538:2: rule__Projection__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Projection__Group_3__2__Impl_in_rule__Projection__Group_3__25143);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2544:1: rule__Projection__Group_3__2__Impl : ( ( rule__Projection__Group_3_2__0 )* ) ;
    public final void rule__Projection__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2548:1: ( ( ( rule__Projection__Group_3_2__0 )* ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2549:1: ( ( rule__Projection__Group_3_2__0 )* )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2549:1: ( ( rule__Projection__Group_3_2__0 )* )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2550:1: ( rule__Projection__Group_3_2__0 )*
            {
             before(grammarAccess.getProjectionAccess().getGroup_3_2()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2551:1: ( rule__Projection__Group_3_2__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==31) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2551:2: rule__Projection__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Projection__Group_3_2__0_in_rule__Projection__Group_3__2__Impl5170);
            	    rule__Projection__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2567:1: rule__Projection__Group_3_2__0 : rule__Projection__Group_3_2__0__Impl rule__Projection__Group_3_2__1 ;
    public final void rule__Projection__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2571:1: ( rule__Projection__Group_3_2__0__Impl rule__Projection__Group_3_2__1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2572:2: rule__Projection__Group_3_2__0__Impl rule__Projection__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__Projection__Group_3_2__0__Impl_in_rule__Projection__Group_3_2__05207);
            rule__Projection__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Projection__Group_3_2__1_in_rule__Projection__Group_3_2__05210);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2579:1: rule__Projection__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__Projection__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2583:1: ( ( ',' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2584:1: ( ',' )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2584:1: ( ',' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2585:1: ','
            {
             before(grammarAccess.getProjectionAccess().getCommaKeyword_3_2_0()); 
            match(input,31,FOLLOW_31_in_rule__Projection__Group_3_2__0__Impl5238); 
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2598:1: rule__Projection__Group_3_2__1 : rule__Projection__Group_3_2__1__Impl ;
    public final void rule__Projection__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2602:1: ( rule__Projection__Group_3_2__1__Impl )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2603:2: rule__Projection__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Projection__Group_3_2__1__Impl_in_rule__Projection__Group_3_2__15269);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2609:1: rule__Projection__Group_3_2__1__Impl : ( ( rule__Projection__EventsAssignment_3_2_1 ) ) ;
    public final void rule__Projection__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2613:1: ( ( ( rule__Projection__EventsAssignment_3_2_1 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2614:1: ( ( rule__Projection__EventsAssignment_3_2_1 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2614:1: ( ( rule__Projection__EventsAssignment_3_2_1 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2615:1: ( rule__Projection__EventsAssignment_3_2_1 )
            {
             before(grammarAccess.getProjectionAccess().getEventsAssignment_3_2_1()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2616:1: ( rule__Projection__EventsAssignment_3_2_1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2616:2: rule__Projection__EventsAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__Projection__EventsAssignment_3_2_1_in_rule__Projection__Group_3_2__1__Impl5296);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2630:1: rule__View__Group__0 : rule__View__Group__0__Impl rule__View__Group__1 ;
    public final void rule__View__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2634:1: ( rule__View__Group__0__Impl rule__View__Group__1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2635:2: rule__View__Group__0__Impl rule__View__Group__1
            {
            pushFollow(FOLLOW_rule__View__Group__0__Impl_in_rule__View__Group__05330);
            rule__View__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__View__Group__1_in_rule__View__Group__05333);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2642:1: rule__View__Group__0__Impl : ( ( rule__View__DocAssignment_0 )? ) ;
    public final void rule__View__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2646:1: ( ( ( rule__View__DocAssignment_0 )? ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2647:1: ( ( rule__View__DocAssignment_0 )? )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2647:1: ( ( rule__View__DocAssignment_0 )? )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2648:1: ( rule__View__DocAssignment_0 )?
            {
             before(grammarAccess.getViewAccess().getDocAssignment_0()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2649:1: ( rule__View__DocAssignment_0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_DOC) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2649:2: rule__View__DocAssignment_0
                    {
                    pushFollow(FOLLOW_rule__View__DocAssignment_0_in_rule__View__Group__0__Impl5360);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2659:1: rule__View__Group__1 : rule__View__Group__1__Impl rule__View__Group__2 ;
    public final void rule__View__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2663:1: ( rule__View__Group__1__Impl rule__View__Group__2 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2664:2: rule__View__Group__1__Impl rule__View__Group__2
            {
            pushFollow(FOLLOW_rule__View__Group__1__Impl_in_rule__View__Group__15391);
            rule__View__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__View__Group__2_in_rule__View__Group__15394);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2671:1: rule__View__Group__1__Impl : ( 'view' ) ;
    public final void rule__View__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2675:1: ( ( 'view' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2676:1: ( 'view' )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2676:1: ( 'view' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2677:1: 'view'
            {
             before(grammarAccess.getViewAccess().getViewKeyword_1()); 
            match(input,35,FOLLOW_35_in_rule__View__Group__1__Impl5422); 
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2690:1: rule__View__Group__2 : rule__View__Group__2__Impl rule__View__Group__3 ;
    public final void rule__View__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2694:1: ( rule__View__Group__2__Impl rule__View__Group__3 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2695:2: rule__View__Group__2__Impl rule__View__Group__3
            {
            pushFollow(FOLLOW_rule__View__Group__2__Impl_in_rule__View__Group__25453);
            rule__View__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__View__Group__3_in_rule__View__Group__25456);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2702:1: rule__View__Group__2__Impl : ( ( rule__View__NameAssignment_2 ) ) ;
    public final void rule__View__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2706:1: ( ( ( rule__View__NameAssignment_2 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2707:1: ( ( rule__View__NameAssignment_2 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2707:1: ( ( rule__View__NameAssignment_2 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2708:1: ( rule__View__NameAssignment_2 )
            {
             before(grammarAccess.getViewAccess().getNameAssignment_2()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2709:1: ( rule__View__NameAssignment_2 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2709:2: rule__View__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__View__NameAssignment_2_in_rule__View__Group__2__Impl5483);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2719:1: rule__View__Group__3 : rule__View__Group__3__Impl rule__View__Group__4 ;
    public final void rule__View__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2723:1: ( rule__View__Group__3__Impl rule__View__Group__4 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2724:2: rule__View__Group__3__Impl rule__View__Group__4
            {
            pushFollow(FOLLOW_rule__View__Group__3__Impl_in_rule__View__Group__35513);
            rule__View__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__View__Group__4_in_rule__View__Group__35516);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2731:1: rule__View__Group__3__Impl : ( 'uses' ) ;
    public final void rule__View__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2735:1: ( ( 'uses' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2736:1: ( 'uses' )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2736:1: ( 'uses' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2737:1: 'uses'
            {
             before(grammarAccess.getViewAccess().getUsesKeyword_3()); 
            match(input,32,FOLLOW_32_in_rule__View__Group__3__Impl5544); 
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2750:1: rule__View__Group__4 : rule__View__Group__4__Impl ;
    public final void rule__View__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2754:1: ( rule__View__Group__4__Impl )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2755:2: rule__View__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__View__Group__4__Impl_in_rule__View__Group__45575);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2761:1: rule__View__Group__4__Impl : ( ( rule__View__ProjectionAssignment_4 ) ) ;
    public final void rule__View__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2765:1: ( ( ( rule__View__ProjectionAssignment_4 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2766:1: ( ( rule__View__ProjectionAssignment_4 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2766:1: ( ( rule__View__ProjectionAssignment_4 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2767:1: ( rule__View__ProjectionAssignment_4 )
            {
             before(grammarAccess.getViewAccess().getProjectionAssignment_4()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2768:1: ( rule__View__ProjectionAssignment_4 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2768:2: rule__View__ProjectionAssignment_4
            {
            pushFollow(FOLLOW_rule__View__ProjectionAssignment_4_in_rule__View__Group__4__Impl5602);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2788:1: rule__TypeMetaInfo__Group__0 : rule__TypeMetaInfo__Group__0__Impl rule__TypeMetaInfo__Group__1 ;
    public final void rule__TypeMetaInfo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2792:1: ( rule__TypeMetaInfo__Group__0__Impl rule__TypeMetaInfo__Group__1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2793:2: rule__TypeMetaInfo__Group__0__Impl rule__TypeMetaInfo__Group__1
            {
            pushFollow(FOLLOW_rule__TypeMetaInfo__Group__0__Impl_in_rule__TypeMetaInfo__Group__05642);
            rule__TypeMetaInfo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeMetaInfo__Group__1_in_rule__TypeMetaInfo__Group__05645);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2800:1: rule__TypeMetaInfo__Group__0__Impl : ( () ) ;
    public final void rule__TypeMetaInfo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2804:1: ( ( () ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2805:1: ( () )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2805:1: ( () )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2806:1: ()
            {
             before(grammarAccess.getTypeMetaInfoAccess().getTypeMetaInfoAction_0()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2807:1: ()
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2809:1: 
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2819:1: rule__TypeMetaInfo__Group__1 : rule__TypeMetaInfo__Group__1__Impl rule__TypeMetaInfo__Group__2 ;
    public final void rule__TypeMetaInfo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2823:1: ( rule__TypeMetaInfo__Group__1__Impl rule__TypeMetaInfo__Group__2 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2824:2: rule__TypeMetaInfo__Group__1__Impl rule__TypeMetaInfo__Group__2
            {
            pushFollow(FOLLOW_rule__TypeMetaInfo__Group__1__Impl_in_rule__TypeMetaInfo__Group__15703);
            rule__TypeMetaInfo__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeMetaInfo__Group__2_in_rule__TypeMetaInfo__Group__15706);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2831:1: rule__TypeMetaInfo__Group__1__Impl : ( ( rule__TypeMetaInfo__Group_1__0 )? ) ;
    public final void rule__TypeMetaInfo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2835:1: ( ( ( rule__TypeMetaInfo__Group_1__0 )? ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2836:1: ( ( rule__TypeMetaInfo__Group_1__0 )? )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2836:1: ( ( rule__TypeMetaInfo__Group_1__0 )? )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2837:1: ( rule__TypeMetaInfo__Group_1__0 )?
            {
             before(grammarAccess.getTypeMetaInfoAccess().getGroup_1()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2838:1: ( rule__TypeMetaInfo__Group_1__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==36) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2838:2: rule__TypeMetaInfo__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__TypeMetaInfo__Group_1__0_in_rule__TypeMetaInfo__Group__1__Impl5733);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2848:1: rule__TypeMetaInfo__Group__2 : rule__TypeMetaInfo__Group__2__Impl rule__TypeMetaInfo__Group__3 ;
    public final void rule__TypeMetaInfo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2852:1: ( rule__TypeMetaInfo__Group__2__Impl rule__TypeMetaInfo__Group__3 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2853:2: rule__TypeMetaInfo__Group__2__Impl rule__TypeMetaInfo__Group__3
            {
            pushFollow(FOLLOW_rule__TypeMetaInfo__Group__2__Impl_in_rule__TypeMetaInfo__Group__25764);
            rule__TypeMetaInfo__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeMetaInfo__Group__3_in_rule__TypeMetaInfo__Group__25767);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2860:1: rule__TypeMetaInfo__Group__2__Impl : ( ( rule__TypeMetaInfo__Group_2__0 )? ) ;
    public final void rule__TypeMetaInfo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2864:1: ( ( ( rule__TypeMetaInfo__Group_2__0 )? ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2865:1: ( ( rule__TypeMetaInfo__Group_2__0 )? )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2865:1: ( ( rule__TypeMetaInfo__Group_2__0 )? )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2866:1: ( rule__TypeMetaInfo__Group_2__0 )?
            {
             before(grammarAccess.getTypeMetaInfoAccess().getGroup_2()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2867:1: ( rule__TypeMetaInfo__Group_2__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==37) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2867:2: rule__TypeMetaInfo__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__TypeMetaInfo__Group_2__0_in_rule__TypeMetaInfo__Group__2__Impl5794);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2877:1: rule__TypeMetaInfo__Group__3 : rule__TypeMetaInfo__Group__3__Impl rule__TypeMetaInfo__Group__4 ;
    public final void rule__TypeMetaInfo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2881:1: ( rule__TypeMetaInfo__Group__3__Impl rule__TypeMetaInfo__Group__4 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2882:2: rule__TypeMetaInfo__Group__3__Impl rule__TypeMetaInfo__Group__4
            {
            pushFollow(FOLLOW_rule__TypeMetaInfo__Group__3__Impl_in_rule__TypeMetaInfo__Group__35825);
            rule__TypeMetaInfo__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeMetaInfo__Group__4_in_rule__TypeMetaInfo__Group__35828);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2889:1: rule__TypeMetaInfo__Group__3__Impl : ( ( rule__TypeMetaInfo__Group_3__0 )? ) ;
    public final void rule__TypeMetaInfo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2893:1: ( ( ( rule__TypeMetaInfo__Group_3__0 )? ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2894:1: ( ( rule__TypeMetaInfo__Group_3__0 )? )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2894:1: ( ( rule__TypeMetaInfo__Group_3__0 )? )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2895:1: ( rule__TypeMetaInfo__Group_3__0 )?
            {
             before(grammarAccess.getTypeMetaInfoAccess().getGroup_3()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2896:1: ( rule__TypeMetaInfo__Group_3__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==38) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2896:2: rule__TypeMetaInfo__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__TypeMetaInfo__Group_3__0_in_rule__TypeMetaInfo__Group__3__Impl5855);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2906:1: rule__TypeMetaInfo__Group__4 : rule__TypeMetaInfo__Group__4__Impl rule__TypeMetaInfo__Group__5 ;
    public final void rule__TypeMetaInfo__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2910:1: ( rule__TypeMetaInfo__Group__4__Impl rule__TypeMetaInfo__Group__5 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2911:2: rule__TypeMetaInfo__Group__4__Impl rule__TypeMetaInfo__Group__5
            {
            pushFollow(FOLLOW_rule__TypeMetaInfo__Group__4__Impl_in_rule__TypeMetaInfo__Group__45886);
            rule__TypeMetaInfo__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeMetaInfo__Group__5_in_rule__TypeMetaInfo__Group__45889);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2918:1: rule__TypeMetaInfo__Group__4__Impl : ( ( rule__TypeMetaInfo__Group_4__0 )? ) ;
    public final void rule__TypeMetaInfo__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2922:1: ( ( ( rule__TypeMetaInfo__Group_4__0 )? ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2923:1: ( ( rule__TypeMetaInfo__Group_4__0 )? )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2923:1: ( ( rule__TypeMetaInfo__Group_4__0 )? )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2924:1: ( rule__TypeMetaInfo__Group_4__0 )?
            {
             before(grammarAccess.getTypeMetaInfoAccess().getGroup_4()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2925:1: ( rule__TypeMetaInfo__Group_4__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==39) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2925:2: rule__TypeMetaInfo__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__TypeMetaInfo__Group_4__0_in_rule__TypeMetaInfo__Group__4__Impl5916);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2935:1: rule__TypeMetaInfo__Group__5 : rule__TypeMetaInfo__Group__5__Impl ;
    public final void rule__TypeMetaInfo__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2939:1: ( rule__TypeMetaInfo__Group__5__Impl )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2940:2: rule__TypeMetaInfo__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__TypeMetaInfo__Group__5__Impl_in_rule__TypeMetaInfo__Group__55947);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2946:1: rule__TypeMetaInfo__Group__5__Impl : ( ( rule__TypeMetaInfo__Group_5__0 )? ) ;
    public final void rule__TypeMetaInfo__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2950:1: ( ( ( rule__TypeMetaInfo__Group_5__0 )? ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2951:1: ( ( rule__TypeMetaInfo__Group_5__0 )? )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2951:1: ( ( rule__TypeMetaInfo__Group_5__0 )? )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2952:1: ( rule__TypeMetaInfo__Group_5__0 )?
            {
             before(grammarAccess.getTypeMetaInfoAccess().getGroup_5()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2953:1: ( rule__TypeMetaInfo__Group_5__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==40) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2953:2: rule__TypeMetaInfo__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__TypeMetaInfo__Group_5__0_in_rule__TypeMetaInfo__Group__5__Impl5974);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2975:1: rule__TypeMetaInfo__Group_1__0 : rule__TypeMetaInfo__Group_1__0__Impl rule__TypeMetaInfo__Group_1__1 ;
    public final void rule__TypeMetaInfo__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2979:1: ( rule__TypeMetaInfo__Group_1__0__Impl rule__TypeMetaInfo__Group_1__1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2980:2: rule__TypeMetaInfo__Group_1__0__Impl rule__TypeMetaInfo__Group_1__1
            {
            pushFollow(FOLLOW_rule__TypeMetaInfo__Group_1__0__Impl_in_rule__TypeMetaInfo__Group_1__06017);
            rule__TypeMetaInfo__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeMetaInfo__Group_1__1_in_rule__TypeMetaInfo__Group_1__06020);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2987:1: rule__TypeMetaInfo__Group_1__0__Impl : ( 'slabel' ) ;
    public final void rule__TypeMetaInfo__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2991:1: ( ( 'slabel' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2992:1: ( 'slabel' )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2992:1: ( 'slabel' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:2993:1: 'slabel'
            {
             before(grammarAccess.getTypeMetaInfoAccess().getSlabelKeyword_1_0()); 
            match(input,36,FOLLOW_36_in_rule__TypeMetaInfo__Group_1__0__Impl6048); 
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3006:1: rule__TypeMetaInfo__Group_1__1 : rule__TypeMetaInfo__Group_1__1__Impl ;
    public final void rule__TypeMetaInfo__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3010:1: ( rule__TypeMetaInfo__Group_1__1__Impl )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3011:2: rule__TypeMetaInfo__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeMetaInfo__Group_1__1__Impl_in_rule__TypeMetaInfo__Group_1__16079);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3017:1: rule__TypeMetaInfo__Group_1__1__Impl : ( ( rule__TypeMetaInfo__SlabelAssignment_1_1 ) ) ;
    public final void rule__TypeMetaInfo__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3021:1: ( ( ( rule__TypeMetaInfo__SlabelAssignment_1_1 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3022:1: ( ( rule__TypeMetaInfo__SlabelAssignment_1_1 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3022:1: ( ( rule__TypeMetaInfo__SlabelAssignment_1_1 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3023:1: ( rule__TypeMetaInfo__SlabelAssignment_1_1 )
            {
             before(grammarAccess.getTypeMetaInfoAccess().getSlabelAssignment_1_1()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3024:1: ( rule__TypeMetaInfo__SlabelAssignment_1_1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3024:2: rule__TypeMetaInfo__SlabelAssignment_1_1
            {
            pushFollow(FOLLOW_rule__TypeMetaInfo__SlabelAssignment_1_1_in_rule__TypeMetaInfo__Group_1__1__Impl6106);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3038:1: rule__TypeMetaInfo__Group_2__0 : rule__TypeMetaInfo__Group_2__0__Impl rule__TypeMetaInfo__Group_2__1 ;
    public final void rule__TypeMetaInfo__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3042:1: ( rule__TypeMetaInfo__Group_2__0__Impl rule__TypeMetaInfo__Group_2__1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3043:2: rule__TypeMetaInfo__Group_2__0__Impl rule__TypeMetaInfo__Group_2__1
            {
            pushFollow(FOLLOW_rule__TypeMetaInfo__Group_2__0__Impl_in_rule__TypeMetaInfo__Group_2__06140);
            rule__TypeMetaInfo__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeMetaInfo__Group_2__1_in_rule__TypeMetaInfo__Group_2__06143);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3050:1: rule__TypeMetaInfo__Group_2__0__Impl : ( 'label' ) ;
    public final void rule__TypeMetaInfo__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3054:1: ( ( 'label' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3055:1: ( 'label' )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3055:1: ( 'label' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3056:1: 'label'
            {
             before(grammarAccess.getTypeMetaInfoAccess().getLabelKeyword_2_0()); 
            match(input,37,FOLLOW_37_in_rule__TypeMetaInfo__Group_2__0__Impl6171); 
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3069:1: rule__TypeMetaInfo__Group_2__1 : rule__TypeMetaInfo__Group_2__1__Impl ;
    public final void rule__TypeMetaInfo__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3073:1: ( rule__TypeMetaInfo__Group_2__1__Impl )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3074:2: rule__TypeMetaInfo__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeMetaInfo__Group_2__1__Impl_in_rule__TypeMetaInfo__Group_2__16202);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3080:1: rule__TypeMetaInfo__Group_2__1__Impl : ( ( rule__TypeMetaInfo__LabelAssignment_2_1 ) ) ;
    public final void rule__TypeMetaInfo__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3084:1: ( ( ( rule__TypeMetaInfo__LabelAssignment_2_1 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3085:1: ( ( rule__TypeMetaInfo__LabelAssignment_2_1 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3085:1: ( ( rule__TypeMetaInfo__LabelAssignment_2_1 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3086:1: ( rule__TypeMetaInfo__LabelAssignment_2_1 )
            {
             before(grammarAccess.getTypeMetaInfoAccess().getLabelAssignment_2_1()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3087:1: ( rule__TypeMetaInfo__LabelAssignment_2_1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3087:2: rule__TypeMetaInfo__LabelAssignment_2_1
            {
            pushFollow(FOLLOW_rule__TypeMetaInfo__LabelAssignment_2_1_in_rule__TypeMetaInfo__Group_2__1__Impl6229);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3101:1: rule__TypeMetaInfo__Group_3__0 : rule__TypeMetaInfo__Group_3__0__Impl rule__TypeMetaInfo__Group_3__1 ;
    public final void rule__TypeMetaInfo__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3105:1: ( rule__TypeMetaInfo__Group_3__0__Impl rule__TypeMetaInfo__Group_3__1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3106:2: rule__TypeMetaInfo__Group_3__0__Impl rule__TypeMetaInfo__Group_3__1
            {
            pushFollow(FOLLOW_rule__TypeMetaInfo__Group_3__0__Impl_in_rule__TypeMetaInfo__Group_3__06263);
            rule__TypeMetaInfo__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeMetaInfo__Group_3__1_in_rule__TypeMetaInfo__Group_3__06266);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3113:1: rule__TypeMetaInfo__Group_3__0__Impl : ( 'tooltip' ) ;
    public final void rule__TypeMetaInfo__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3117:1: ( ( 'tooltip' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3118:1: ( 'tooltip' )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3118:1: ( 'tooltip' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3119:1: 'tooltip'
            {
             before(grammarAccess.getTypeMetaInfoAccess().getTooltipKeyword_3_0()); 
            match(input,38,FOLLOW_38_in_rule__TypeMetaInfo__Group_3__0__Impl6294); 
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3132:1: rule__TypeMetaInfo__Group_3__1 : rule__TypeMetaInfo__Group_3__1__Impl ;
    public final void rule__TypeMetaInfo__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3136:1: ( rule__TypeMetaInfo__Group_3__1__Impl )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3137:2: rule__TypeMetaInfo__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeMetaInfo__Group_3__1__Impl_in_rule__TypeMetaInfo__Group_3__16325);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3143:1: rule__TypeMetaInfo__Group_3__1__Impl : ( ( rule__TypeMetaInfo__TooltipAssignment_3_1 ) ) ;
    public final void rule__TypeMetaInfo__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3147:1: ( ( ( rule__TypeMetaInfo__TooltipAssignment_3_1 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3148:1: ( ( rule__TypeMetaInfo__TooltipAssignment_3_1 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3148:1: ( ( rule__TypeMetaInfo__TooltipAssignment_3_1 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3149:1: ( rule__TypeMetaInfo__TooltipAssignment_3_1 )
            {
             before(grammarAccess.getTypeMetaInfoAccess().getTooltipAssignment_3_1()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3150:1: ( rule__TypeMetaInfo__TooltipAssignment_3_1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3150:2: rule__TypeMetaInfo__TooltipAssignment_3_1
            {
            pushFollow(FOLLOW_rule__TypeMetaInfo__TooltipAssignment_3_1_in_rule__TypeMetaInfo__Group_3__1__Impl6352);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3164:1: rule__TypeMetaInfo__Group_4__0 : rule__TypeMetaInfo__Group_4__0__Impl rule__TypeMetaInfo__Group_4__1 ;
    public final void rule__TypeMetaInfo__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3168:1: ( rule__TypeMetaInfo__Group_4__0__Impl rule__TypeMetaInfo__Group_4__1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3169:2: rule__TypeMetaInfo__Group_4__0__Impl rule__TypeMetaInfo__Group_4__1
            {
            pushFollow(FOLLOW_rule__TypeMetaInfo__Group_4__0__Impl_in_rule__TypeMetaInfo__Group_4__06386);
            rule__TypeMetaInfo__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeMetaInfo__Group_4__1_in_rule__TypeMetaInfo__Group_4__06389);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3176:1: rule__TypeMetaInfo__Group_4__0__Impl : ( 'prompt' ) ;
    public final void rule__TypeMetaInfo__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3180:1: ( ( 'prompt' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3181:1: ( 'prompt' )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3181:1: ( 'prompt' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3182:1: 'prompt'
            {
             before(grammarAccess.getTypeMetaInfoAccess().getPromptKeyword_4_0()); 
            match(input,39,FOLLOW_39_in_rule__TypeMetaInfo__Group_4__0__Impl6417); 
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3195:1: rule__TypeMetaInfo__Group_4__1 : rule__TypeMetaInfo__Group_4__1__Impl ;
    public final void rule__TypeMetaInfo__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3199:1: ( rule__TypeMetaInfo__Group_4__1__Impl )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3200:2: rule__TypeMetaInfo__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeMetaInfo__Group_4__1__Impl_in_rule__TypeMetaInfo__Group_4__16448);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3206:1: rule__TypeMetaInfo__Group_4__1__Impl : ( ( rule__TypeMetaInfo__PromptAssignment_4_1 ) ) ;
    public final void rule__TypeMetaInfo__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3210:1: ( ( ( rule__TypeMetaInfo__PromptAssignment_4_1 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3211:1: ( ( rule__TypeMetaInfo__PromptAssignment_4_1 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3211:1: ( ( rule__TypeMetaInfo__PromptAssignment_4_1 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3212:1: ( rule__TypeMetaInfo__PromptAssignment_4_1 )
            {
             before(grammarAccess.getTypeMetaInfoAccess().getPromptAssignment_4_1()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3213:1: ( rule__TypeMetaInfo__PromptAssignment_4_1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3213:2: rule__TypeMetaInfo__PromptAssignment_4_1
            {
            pushFollow(FOLLOW_rule__TypeMetaInfo__PromptAssignment_4_1_in_rule__TypeMetaInfo__Group_4__1__Impl6475);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3227:1: rule__TypeMetaInfo__Group_5__0 : rule__TypeMetaInfo__Group_5__0__Impl rule__TypeMetaInfo__Group_5__1 ;
    public final void rule__TypeMetaInfo__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3231:1: ( rule__TypeMetaInfo__Group_5__0__Impl rule__TypeMetaInfo__Group_5__1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3232:2: rule__TypeMetaInfo__Group_5__0__Impl rule__TypeMetaInfo__Group_5__1
            {
            pushFollow(FOLLOW_rule__TypeMetaInfo__Group_5__0__Impl_in_rule__TypeMetaInfo__Group_5__06509);
            rule__TypeMetaInfo__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeMetaInfo__Group_5__1_in_rule__TypeMetaInfo__Group_5__06512);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3239:1: rule__TypeMetaInfo__Group_5__0__Impl : ( 'examples' ) ;
    public final void rule__TypeMetaInfo__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3243:1: ( ( 'examples' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3244:1: ( 'examples' )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3244:1: ( 'examples' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3245:1: 'examples'
            {
             before(grammarAccess.getTypeMetaInfoAccess().getExamplesKeyword_5_0()); 
            match(input,40,FOLLOW_40_in_rule__TypeMetaInfo__Group_5__0__Impl6540); 
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3258:1: rule__TypeMetaInfo__Group_5__1 : rule__TypeMetaInfo__Group_5__1__Impl ;
    public final void rule__TypeMetaInfo__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3262:1: ( rule__TypeMetaInfo__Group_5__1__Impl )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3263:2: rule__TypeMetaInfo__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeMetaInfo__Group_5__1__Impl_in_rule__TypeMetaInfo__Group_5__16571);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3269:1: rule__TypeMetaInfo__Group_5__1__Impl : ( ( rule__TypeMetaInfo__ExamplesAssignment_5_1 )* ) ;
    public final void rule__TypeMetaInfo__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3273:1: ( ( ( rule__TypeMetaInfo__ExamplesAssignment_5_1 )* ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3274:1: ( ( rule__TypeMetaInfo__ExamplesAssignment_5_1 )* )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3274:1: ( ( rule__TypeMetaInfo__ExamplesAssignment_5_1 )* )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3275:1: ( rule__TypeMetaInfo__ExamplesAssignment_5_1 )*
            {
             before(grammarAccess.getTypeMetaInfoAccess().getExamplesAssignment_5_1()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3276:1: ( rule__TypeMetaInfo__ExamplesAssignment_5_1 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=RULE_HEX && LA31_0<=RULE_DECIMAL)||LA31_0==RULE_STRING||(LA31_0>=13 && LA31_0<=14)||LA31_0==47) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3276:2: rule__TypeMetaInfo__ExamplesAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_rule__TypeMetaInfo__ExamplesAssignment_5_1_in_rule__TypeMetaInfo__Group_5__1__Impl6598);
            	    rule__TypeMetaInfo__ExamplesAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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


    // $ANTLR start "rule__Attribute__Group__0"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3290:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3294:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3295:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__06633);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__06636);
            rule__Attribute__Group__1();

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
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3302:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__DocAssignment_0 )? ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3306:1: ( ( ( rule__Attribute__DocAssignment_0 )? ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3307:1: ( ( rule__Attribute__DocAssignment_0 )? )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3307:1: ( ( rule__Attribute__DocAssignment_0 )? )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3308:1: ( rule__Attribute__DocAssignment_0 )?
            {
             before(grammarAccess.getAttributeAccess().getDocAssignment_0()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3309:1: ( rule__Attribute__DocAssignment_0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_DOC) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3309:2: rule__Attribute__DocAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Attribute__DocAssignment_0_in_rule__Attribute__Group__0__Impl6663);
                    rule__Attribute__DocAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getDocAssignment_0()); 

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
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3319:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3323:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3324:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__16694);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__16697);
            rule__Attribute__Group__2();

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
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3331:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NullableAssignment_1 )? ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3335:1: ( ( ( rule__Attribute__NullableAssignment_1 )? ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3336:1: ( ( rule__Attribute__NullableAssignment_1 )? )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3336:1: ( ( rule__Attribute__NullableAssignment_1 )? )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3337:1: ( rule__Attribute__NullableAssignment_1 )?
            {
             before(grammarAccess.getAttributeAccess().getNullableAssignment_1()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3338:1: ( rule__Attribute__NullableAssignment_1 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==46) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3338:2: rule__Attribute__NullableAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Attribute__NullableAssignment_1_in_rule__Attribute__Group__1__Impl6724);
                    rule__Attribute__NullableAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getNullableAssignment_1()); 

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
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3348:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3352:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3353:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__26755);
            rule__Attribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__3_in_rule__Attribute__Group__26758);
            rule__Attribute__Group__3();

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
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3360:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__TypeAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3364:1: ( ( ( rule__Attribute__TypeAssignment_2 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3365:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3365:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3366:1: ( rule__Attribute__TypeAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_2()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3367:1: ( rule__Attribute__TypeAssignment_2 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3367:2: rule__Attribute__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Attribute__TypeAssignment_2_in_rule__Attribute__Group__2__Impl6785);
            rule__Attribute__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeAssignment_2()); 

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
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Attribute__Group__3"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3377:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3381:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3382:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FOLLOW_rule__Attribute__Group__3__Impl_in_rule__Attribute__Group__36815);
            rule__Attribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__4_in_rule__Attribute__Group__36818);
            rule__Attribute__Group__4();

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
    // $ANTLR end "rule__Attribute__Group__3"


    // $ANTLR start "rule__Attribute__Group__3__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3389:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__MultiplicityAssignment_3 )? ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3393:1: ( ( ( rule__Attribute__MultiplicityAssignment_3 )? ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3394:1: ( ( rule__Attribute__MultiplicityAssignment_3 )? )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3394:1: ( ( rule__Attribute__MultiplicityAssignment_3 )? )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3395:1: ( rule__Attribute__MultiplicityAssignment_3 )?
            {
             before(grammarAccess.getAttributeAccess().getMultiplicityAssignment_3()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3396:1: ( rule__Attribute__MultiplicityAssignment_3 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==45) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3396:2: rule__Attribute__MultiplicityAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Attribute__MultiplicityAssignment_3_in_rule__Attribute__Group__3__Impl6845);
                    rule__Attribute__MultiplicityAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getMultiplicityAssignment_3()); 

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
    // $ANTLR end "rule__Attribute__Group__3__Impl"


    // $ANTLR start "rule__Attribute__Group__4"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3406:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl rule__Attribute__Group__5 ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3410:1: ( rule__Attribute__Group__4__Impl rule__Attribute__Group__5 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3411:2: rule__Attribute__Group__4__Impl rule__Attribute__Group__5
            {
            pushFollow(FOLLOW_rule__Attribute__Group__4__Impl_in_rule__Attribute__Group__46876);
            rule__Attribute__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__5_in_rule__Attribute__Group__46879);
            rule__Attribute__Group__5();

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
    // $ANTLR end "rule__Attribute__Group__4"


    // $ANTLR start "rule__Attribute__Group__4__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3418:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__NameAssignment_4 ) ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3422:1: ( ( ( rule__Attribute__NameAssignment_4 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3423:1: ( ( rule__Attribute__NameAssignment_4 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3423:1: ( ( rule__Attribute__NameAssignment_4 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3424:1: ( rule__Attribute__NameAssignment_4 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_4()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3425:1: ( rule__Attribute__NameAssignment_4 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3425:2: rule__Attribute__NameAssignment_4
            {
            pushFollow(FOLLOW_rule__Attribute__NameAssignment_4_in_rule__Attribute__Group__4__Impl6906);
            rule__Attribute__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_4()); 

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
    // $ANTLR end "rule__Attribute__Group__4__Impl"


    // $ANTLR start "rule__Attribute__Group__5"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3435:1: rule__Attribute__Group__5 : rule__Attribute__Group__5__Impl rule__Attribute__Group__6 ;
    public final void rule__Attribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3439:1: ( rule__Attribute__Group__5__Impl rule__Attribute__Group__6 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3440:2: rule__Attribute__Group__5__Impl rule__Attribute__Group__6
            {
            pushFollow(FOLLOW_rule__Attribute__Group__5__Impl_in_rule__Attribute__Group__56936);
            rule__Attribute__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__6_in_rule__Attribute__Group__56939);
            rule__Attribute__Group__6();

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
    // $ANTLR end "rule__Attribute__Group__5"


    // $ANTLR start "rule__Attribute__Group__5__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3447:1: rule__Attribute__Group__5__Impl : ( ( rule__Attribute__InvariantsAssignment_5 )? ) ;
    public final void rule__Attribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3451:1: ( ( ( rule__Attribute__InvariantsAssignment_5 )? ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3452:1: ( ( rule__Attribute__InvariantsAssignment_5 )? )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3452:1: ( ( rule__Attribute__InvariantsAssignment_5 )? )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3453:1: ( rule__Attribute__InvariantsAssignment_5 )?
            {
             before(grammarAccess.getAttributeAccess().getInvariantsAssignment_5()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3454:1: ( rule__Attribute__InvariantsAssignment_5 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==41) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3454:2: rule__Attribute__InvariantsAssignment_5
                    {
                    pushFollow(FOLLOW_rule__Attribute__InvariantsAssignment_5_in_rule__Attribute__Group__5__Impl6966);
                    rule__Attribute__InvariantsAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getInvariantsAssignment_5()); 

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
    // $ANTLR end "rule__Attribute__Group__5__Impl"


    // $ANTLR start "rule__Attribute__Group__6"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3464:1: rule__Attribute__Group__6 : rule__Attribute__Group__6__Impl ;
    public final void rule__Attribute__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3468:1: ( rule__Attribute__Group__6__Impl )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3469:2: rule__Attribute__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group__6__Impl_in_rule__Attribute__Group__66997);
            rule__Attribute__Group__6__Impl();

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
    // $ANTLR end "rule__Attribute__Group__6"


    // $ANTLR start "rule__Attribute__Group__6__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3475:1: rule__Attribute__Group__6__Impl : ( ( rule__Attribute__OverriddenAssignment_6 )? ) ;
    public final void rule__Attribute__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3479:1: ( ( ( rule__Attribute__OverriddenAssignment_6 )? ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3480:1: ( ( rule__Attribute__OverriddenAssignment_6 )? )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3480:1: ( ( rule__Attribute__OverriddenAssignment_6 )? )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3481:1: ( rule__Attribute__OverriddenAssignment_6 )?
            {
             before(grammarAccess.getAttributeAccess().getOverriddenAssignment_6()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3482:1: ( rule__Attribute__OverriddenAssignment_6 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==21) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3482:2: rule__Attribute__OverriddenAssignment_6
                    {
                    pushFollow(FOLLOW_rule__Attribute__OverriddenAssignment_6_in_rule__Attribute__Group__6__Impl7024);
                    rule__Attribute__OverriddenAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getOverriddenAssignment_6()); 

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
    // $ANTLR end "rule__Attribute__Group__6__Impl"


    // $ANTLR start "rule__Invariants__Group__0"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3506:1: rule__Invariants__Group__0 : rule__Invariants__Group__0__Impl rule__Invariants__Group__1 ;
    public final void rule__Invariants__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3510:1: ( rule__Invariants__Group__0__Impl rule__Invariants__Group__1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3511:2: rule__Invariants__Group__0__Impl rule__Invariants__Group__1
            {
            pushFollow(FOLLOW_rule__Invariants__Group__0__Impl_in_rule__Invariants__Group__07069);
            rule__Invariants__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Invariants__Group__1_in_rule__Invariants__Group__07072);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3518:1: rule__Invariants__Group__0__Impl : ( 'invariants' ) ;
    public final void rule__Invariants__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3522:1: ( ( 'invariants' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3523:1: ( 'invariants' )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3523:1: ( 'invariants' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3524:1: 'invariants'
            {
             before(grammarAccess.getInvariantsAccess().getInvariantsKeyword_0()); 
            match(input,41,FOLLOW_41_in_rule__Invariants__Group__0__Impl7100); 
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3537:1: rule__Invariants__Group__1 : rule__Invariants__Group__1__Impl rule__Invariants__Group__2 ;
    public final void rule__Invariants__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3541:1: ( rule__Invariants__Group__1__Impl rule__Invariants__Group__2 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3542:2: rule__Invariants__Group__1__Impl rule__Invariants__Group__2
            {
            pushFollow(FOLLOW_rule__Invariants__Group__1__Impl_in_rule__Invariants__Group__17131);
            rule__Invariants__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Invariants__Group__2_in_rule__Invariants__Group__17134);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3549:1: rule__Invariants__Group__1__Impl : ( ( rule__Invariants__ConstraintInstancesAssignment_1 ) ) ;
    public final void rule__Invariants__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3553:1: ( ( ( rule__Invariants__ConstraintInstancesAssignment_1 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3554:1: ( ( rule__Invariants__ConstraintInstancesAssignment_1 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3554:1: ( ( rule__Invariants__ConstraintInstancesAssignment_1 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3555:1: ( rule__Invariants__ConstraintInstancesAssignment_1 )
            {
             before(grammarAccess.getInvariantsAccess().getConstraintInstancesAssignment_1()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3556:1: ( rule__Invariants__ConstraintInstancesAssignment_1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3556:2: rule__Invariants__ConstraintInstancesAssignment_1
            {
            pushFollow(FOLLOW_rule__Invariants__ConstraintInstancesAssignment_1_in_rule__Invariants__Group__1__Impl7161);
            rule__Invariants__ConstraintInstancesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInvariantsAccess().getConstraintInstancesAssignment_1()); 

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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3566:1: rule__Invariants__Group__2 : rule__Invariants__Group__2__Impl ;
    public final void rule__Invariants__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3570:1: ( rule__Invariants__Group__2__Impl )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3571:2: rule__Invariants__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Invariants__Group__2__Impl_in_rule__Invariants__Group__27191);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3577:1: rule__Invariants__Group__2__Impl : ( ( rule__Invariants__Group_2__0 )* ) ;
    public final void rule__Invariants__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3581:1: ( ( ( rule__Invariants__Group_2__0 )* ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3582:1: ( ( rule__Invariants__Group_2__0 )* )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3582:1: ( ( rule__Invariants__Group_2__0 )* )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3583:1: ( rule__Invariants__Group_2__0 )*
            {
             before(grammarAccess.getInvariantsAccess().getGroup_2()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3584:1: ( rule__Invariants__Group_2__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==31) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3584:2: rule__Invariants__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Invariants__Group_2__0_in_rule__Invariants__Group__2__Impl7218);
            	    rule__Invariants__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3600:1: rule__Invariants__Group_2__0 : rule__Invariants__Group_2__0__Impl rule__Invariants__Group_2__1 ;
    public final void rule__Invariants__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3604:1: ( rule__Invariants__Group_2__0__Impl rule__Invariants__Group_2__1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3605:2: rule__Invariants__Group_2__0__Impl rule__Invariants__Group_2__1
            {
            pushFollow(FOLLOW_rule__Invariants__Group_2__0__Impl_in_rule__Invariants__Group_2__07255);
            rule__Invariants__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Invariants__Group_2__1_in_rule__Invariants__Group_2__07258);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3612:1: rule__Invariants__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Invariants__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3616:1: ( ( ',' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3617:1: ( ',' )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3617:1: ( ',' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3618:1: ','
            {
             before(grammarAccess.getInvariantsAccess().getCommaKeyword_2_0()); 
            match(input,31,FOLLOW_31_in_rule__Invariants__Group_2__0__Impl7286); 
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3631:1: rule__Invariants__Group_2__1 : rule__Invariants__Group_2__1__Impl ;
    public final void rule__Invariants__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3635:1: ( rule__Invariants__Group_2__1__Impl )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3636:2: rule__Invariants__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Invariants__Group_2__1__Impl_in_rule__Invariants__Group_2__17317);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3642:1: rule__Invariants__Group_2__1__Impl : ( ( rule__Invariants__ConstraintInstancesAssignment_2_1 ) ) ;
    public final void rule__Invariants__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3646:1: ( ( ( rule__Invariants__ConstraintInstancesAssignment_2_1 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3647:1: ( ( rule__Invariants__ConstraintInstancesAssignment_2_1 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3647:1: ( ( rule__Invariants__ConstraintInstancesAssignment_2_1 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3648:1: ( rule__Invariants__ConstraintInstancesAssignment_2_1 )
            {
             before(grammarAccess.getInvariantsAccess().getConstraintInstancesAssignment_2_1()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3649:1: ( rule__Invariants__ConstraintInstancesAssignment_2_1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3649:2: rule__Invariants__ConstraintInstancesAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Invariants__ConstraintInstancesAssignment_2_1_in_rule__Invariants__Group_2__1__Impl7344);
            rule__Invariants__ConstraintInstancesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getInvariantsAccess().getConstraintInstancesAssignment_2_1()); 

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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3663:1: rule__OverriddenTypeMetaInfo__Group__0 : rule__OverriddenTypeMetaInfo__Group__0__Impl rule__OverriddenTypeMetaInfo__Group__1 ;
    public final void rule__OverriddenTypeMetaInfo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3667:1: ( rule__OverriddenTypeMetaInfo__Group__0__Impl rule__OverriddenTypeMetaInfo__Group__1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3668:2: rule__OverriddenTypeMetaInfo__Group__0__Impl rule__OverriddenTypeMetaInfo__Group__1
            {
            pushFollow(FOLLOW_rule__OverriddenTypeMetaInfo__Group__0__Impl_in_rule__OverriddenTypeMetaInfo__Group__07378);
            rule__OverriddenTypeMetaInfo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OverriddenTypeMetaInfo__Group__1_in_rule__OverriddenTypeMetaInfo__Group__07381);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3675:1: rule__OverriddenTypeMetaInfo__Group__0__Impl : ( '{' ) ;
    public final void rule__OverriddenTypeMetaInfo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3679:1: ( ( '{' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3680:1: ( '{' )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3680:1: ( '{' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3681:1: '{'
            {
             before(grammarAccess.getOverriddenTypeMetaInfoAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__OverriddenTypeMetaInfo__Group__0__Impl7409); 
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3694:1: rule__OverriddenTypeMetaInfo__Group__1 : rule__OverriddenTypeMetaInfo__Group__1__Impl rule__OverriddenTypeMetaInfo__Group__2 ;
    public final void rule__OverriddenTypeMetaInfo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3698:1: ( rule__OverriddenTypeMetaInfo__Group__1__Impl rule__OverriddenTypeMetaInfo__Group__2 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3699:2: rule__OverriddenTypeMetaInfo__Group__1__Impl rule__OverriddenTypeMetaInfo__Group__2
            {
            pushFollow(FOLLOW_rule__OverriddenTypeMetaInfo__Group__1__Impl_in_rule__OverriddenTypeMetaInfo__Group__17440);
            rule__OverriddenTypeMetaInfo__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OverriddenTypeMetaInfo__Group__2_in_rule__OverriddenTypeMetaInfo__Group__17443);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3706:1: rule__OverriddenTypeMetaInfo__Group__1__Impl : ( ( rule__OverriddenTypeMetaInfo__MetaInfoAssignment_1 ) ) ;
    public final void rule__OverriddenTypeMetaInfo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3710:1: ( ( ( rule__OverriddenTypeMetaInfo__MetaInfoAssignment_1 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3711:1: ( ( rule__OverriddenTypeMetaInfo__MetaInfoAssignment_1 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3711:1: ( ( rule__OverriddenTypeMetaInfo__MetaInfoAssignment_1 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3712:1: ( rule__OverriddenTypeMetaInfo__MetaInfoAssignment_1 )
            {
             before(grammarAccess.getOverriddenTypeMetaInfoAccess().getMetaInfoAssignment_1()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3713:1: ( rule__OverriddenTypeMetaInfo__MetaInfoAssignment_1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3713:2: rule__OverriddenTypeMetaInfo__MetaInfoAssignment_1
            {
            pushFollow(FOLLOW_rule__OverriddenTypeMetaInfo__MetaInfoAssignment_1_in_rule__OverriddenTypeMetaInfo__Group__1__Impl7470);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3723:1: rule__OverriddenTypeMetaInfo__Group__2 : rule__OverriddenTypeMetaInfo__Group__2__Impl ;
    public final void rule__OverriddenTypeMetaInfo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3727:1: ( rule__OverriddenTypeMetaInfo__Group__2__Impl )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3728:2: rule__OverriddenTypeMetaInfo__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__OverriddenTypeMetaInfo__Group__2__Impl_in_rule__OverriddenTypeMetaInfo__Group__27500);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3734:1: rule__OverriddenTypeMetaInfo__Group__2__Impl : ( '}' ) ;
    public final void rule__OverriddenTypeMetaInfo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3738:1: ( ( '}' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3739:1: ( '}' )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3739:1: ( '}' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3740:1: '}'
            {
             before(grammarAccess.getOverriddenTypeMetaInfoAccess().getRightCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_22_in_rule__OverriddenTypeMetaInfo__Group__2__Impl7528); 
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


    // $ANTLR start "rule__ConstraintInstance__Group__0"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3759:1: rule__ConstraintInstance__Group__0 : rule__ConstraintInstance__Group__0__Impl rule__ConstraintInstance__Group__1 ;
    public final void rule__ConstraintInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3763:1: ( rule__ConstraintInstance__Group__0__Impl rule__ConstraintInstance__Group__1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3764:2: rule__ConstraintInstance__Group__0__Impl rule__ConstraintInstance__Group__1
            {
            pushFollow(FOLLOW_rule__ConstraintInstance__Group__0__Impl_in_rule__ConstraintInstance__Group__07565);
            rule__ConstraintInstance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstraintInstance__Group__1_in_rule__ConstraintInstance__Group__07568);
            rule__ConstraintInstance__Group__1();

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
    // $ANTLR end "rule__ConstraintInstance__Group__0"


    // $ANTLR start "rule__ConstraintInstance__Group__0__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3771:1: rule__ConstraintInstance__Group__0__Impl : ( ( rule__ConstraintInstance__ConstraintAssignment_0 ) ) ;
    public final void rule__ConstraintInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3775:1: ( ( ( rule__ConstraintInstance__ConstraintAssignment_0 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3776:1: ( ( rule__ConstraintInstance__ConstraintAssignment_0 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3776:1: ( ( rule__ConstraintInstance__ConstraintAssignment_0 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3777:1: ( rule__ConstraintInstance__ConstraintAssignment_0 )
            {
             before(grammarAccess.getConstraintInstanceAccess().getConstraintAssignment_0()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3778:1: ( rule__ConstraintInstance__ConstraintAssignment_0 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3778:2: rule__ConstraintInstance__ConstraintAssignment_0
            {
            pushFollow(FOLLOW_rule__ConstraintInstance__ConstraintAssignment_0_in_rule__ConstraintInstance__Group__0__Impl7595);
            rule__ConstraintInstance__ConstraintAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConstraintInstanceAccess().getConstraintAssignment_0()); 

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
    // $ANTLR end "rule__ConstraintInstance__Group__0__Impl"


    // $ANTLR start "rule__ConstraintInstance__Group__1"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3788:1: rule__ConstraintInstance__Group__1 : rule__ConstraintInstance__Group__1__Impl ;
    public final void rule__ConstraintInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3792:1: ( rule__ConstraintInstance__Group__1__Impl )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3793:2: rule__ConstraintInstance__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ConstraintInstance__Group__1__Impl_in_rule__ConstraintInstance__Group__17625);
            rule__ConstraintInstance__Group__1__Impl();

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
    // $ANTLR end "rule__ConstraintInstance__Group__1"


    // $ANTLR start "rule__ConstraintInstance__Group__1__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3799:1: rule__ConstraintInstance__Group__1__Impl : ( ( rule__ConstraintInstance__Group_1__0 )? ) ;
    public final void rule__ConstraintInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3803:1: ( ( ( rule__ConstraintInstance__Group_1__0 )? ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3804:1: ( ( rule__ConstraintInstance__Group_1__0 )? )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3804:1: ( ( rule__ConstraintInstance__Group_1__0 )? )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3805:1: ( rule__ConstraintInstance__Group_1__0 )?
            {
             before(grammarAccess.getConstraintInstanceAccess().getGroup_1()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3806:1: ( rule__ConstraintInstance__Group_1__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==42) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3806:2: rule__ConstraintInstance__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ConstraintInstance__Group_1__0_in_rule__ConstraintInstance__Group__1__Impl7652);
                    rule__ConstraintInstance__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstraintInstanceAccess().getGroup_1()); 

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
    // $ANTLR end "rule__ConstraintInstance__Group__1__Impl"


    // $ANTLR start "rule__ConstraintInstance__Group_1__0"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3820:1: rule__ConstraintInstance__Group_1__0 : rule__ConstraintInstance__Group_1__0__Impl rule__ConstraintInstance__Group_1__1 ;
    public final void rule__ConstraintInstance__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3824:1: ( rule__ConstraintInstance__Group_1__0__Impl rule__ConstraintInstance__Group_1__1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3825:2: rule__ConstraintInstance__Group_1__0__Impl rule__ConstraintInstance__Group_1__1
            {
            pushFollow(FOLLOW_rule__ConstraintInstance__Group_1__0__Impl_in_rule__ConstraintInstance__Group_1__07687);
            rule__ConstraintInstance__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstraintInstance__Group_1__1_in_rule__ConstraintInstance__Group_1__07690);
            rule__ConstraintInstance__Group_1__1();

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
    // $ANTLR end "rule__ConstraintInstance__Group_1__0"


    // $ANTLR start "rule__ConstraintInstance__Group_1__0__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3832:1: rule__ConstraintInstance__Group_1__0__Impl : ( '(' ) ;
    public final void rule__ConstraintInstance__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3836:1: ( ( '(' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3837:1: ( '(' )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3837:1: ( '(' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3838:1: '('
            {
             before(grammarAccess.getConstraintInstanceAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,42,FOLLOW_42_in_rule__ConstraintInstance__Group_1__0__Impl7718); 
             after(grammarAccess.getConstraintInstanceAccess().getLeftParenthesisKeyword_1_0()); 

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
    // $ANTLR end "rule__ConstraintInstance__Group_1__0__Impl"


    // $ANTLR start "rule__ConstraintInstance__Group_1__1"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3851:1: rule__ConstraintInstance__Group_1__1 : rule__ConstraintInstance__Group_1__1__Impl rule__ConstraintInstance__Group_1__2 ;
    public final void rule__ConstraintInstance__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3855:1: ( rule__ConstraintInstance__Group_1__1__Impl rule__ConstraintInstance__Group_1__2 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3856:2: rule__ConstraintInstance__Group_1__1__Impl rule__ConstraintInstance__Group_1__2
            {
            pushFollow(FOLLOW_rule__ConstraintInstance__Group_1__1__Impl_in_rule__ConstraintInstance__Group_1__17749);
            rule__ConstraintInstance__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstraintInstance__Group_1__2_in_rule__ConstraintInstance__Group_1__17752);
            rule__ConstraintInstance__Group_1__2();

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
    // $ANTLR end "rule__ConstraintInstance__Group_1__1"


    // $ANTLR start "rule__ConstraintInstance__Group_1__1__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3863:1: rule__ConstraintInstance__Group_1__1__Impl : ( ( rule__ConstraintInstance__ParamsAssignment_1_1 ) ) ;
    public final void rule__ConstraintInstance__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3867:1: ( ( ( rule__ConstraintInstance__ParamsAssignment_1_1 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3868:1: ( ( rule__ConstraintInstance__ParamsAssignment_1_1 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3868:1: ( ( rule__ConstraintInstance__ParamsAssignment_1_1 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3869:1: ( rule__ConstraintInstance__ParamsAssignment_1_1 )
            {
             before(grammarAccess.getConstraintInstanceAccess().getParamsAssignment_1_1()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3870:1: ( rule__ConstraintInstance__ParamsAssignment_1_1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3870:2: rule__ConstraintInstance__ParamsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ConstraintInstance__ParamsAssignment_1_1_in_rule__ConstraintInstance__Group_1__1__Impl7779);
            rule__ConstraintInstance__ParamsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getConstraintInstanceAccess().getParamsAssignment_1_1()); 

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
    // $ANTLR end "rule__ConstraintInstance__Group_1__1__Impl"


    // $ANTLR start "rule__ConstraintInstance__Group_1__2"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3880:1: rule__ConstraintInstance__Group_1__2 : rule__ConstraintInstance__Group_1__2__Impl rule__ConstraintInstance__Group_1__3 ;
    public final void rule__ConstraintInstance__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3884:1: ( rule__ConstraintInstance__Group_1__2__Impl rule__ConstraintInstance__Group_1__3 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3885:2: rule__ConstraintInstance__Group_1__2__Impl rule__ConstraintInstance__Group_1__3
            {
            pushFollow(FOLLOW_rule__ConstraintInstance__Group_1__2__Impl_in_rule__ConstraintInstance__Group_1__27809);
            rule__ConstraintInstance__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstraintInstance__Group_1__3_in_rule__ConstraintInstance__Group_1__27812);
            rule__ConstraintInstance__Group_1__3();

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
    // $ANTLR end "rule__ConstraintInstance__Group_1__2"


    // $ANTLR start "rule__ConstraintInstance__Group_1__2__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3892:1: rule__ConstraintInstance__Group_1__2__Impl : ( ( rule__ConstraintInstance__Group_1_2__0 )* ) ;
    public final void rule__ConstraintInstance__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3896:1: ( ( ( rule__ConstraintInstance__Group_1_2__0 )* ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3897:1: ( ( rule__ConstraintInstance__Group_1_2__0 )* )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3897:1: ( ( rule__ConstraintInstance__Group_1_2__0 )* )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3898:1: ( rule__ConstraintInstance__Group_1_2__0 )*
            {
             before(grammarAccess.getConstraintInstanceAccess().getGroup_1_2()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3899:1: ( rule__ConstraintInstance__Group_1_2__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==31) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3899:2: rule__ConstraintInstance__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__ConstraintInstance__Group_1_2__0_in_rule__ConstraintInstance__Group_1__2__Impl7839);
            	    rule__ConstraintInstance__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getConstraintInstanceAccess().getGroup_1_2()); 

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
    // $ANTLR end "rule__ConstraintInstance__Group_1__2__Impl"


    // $ANTLR start "rule__ConstraintInstance__Group_1__3"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3909:1: rule__ConstraintInstance__Group_1__3 : rule__ConstraintInstance__Group_1__3__Impl ;
    public final void rule__ConstraintInstance__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3913:1: ( rule__ConstraintInstance__Group_1__3__Impl )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3914:2: rule__ConstraintInstance__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__ConstraintInstance__Group_1__3__Impl_in_rule__ConstraintInstance__Group_1__37870);
            rule__ConstraintInstance__Group_1__3__Impl();

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
    // $ANTLR end "rule__ConstraintInstance__Group_1__3"


    // $ANTLR start "rule__ConstraintInstance__Group_1__3__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3920:1: rule__ConstraintInstance__Group_1__3__Impl : ( ')' ) ;
    public final void rule__ConstraintInstance__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3924:1: ( ( ')' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3925:1: ( ')' )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3925:1: ( ')' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3926:1: ')'
            {
             before(grammarAccess.getConstraintInstanceAccess().getRightParenthesisKeyword_1_3()); 
            match(input,43,FOLLOW_43_in_rule__ConstraintInstance__Group_1__3__Impl7898); 
             after(grammarAccess.getConstraintInstanceAccess().getRightParenthesisKeyword_1_3()); 

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
    // $ANTLR end "rule__ConstraintInstance__Group_1__3__Impl"


    // $ANTLR start "rule__ConstraintInstance__Group_1_2__0"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3947:1: rule__ConstraintInstance__Group_1_2__0 : rule__ConstraintInstance__Group_1_2__0__Impl rule__ConstraintInstance__Group_1_2__1 ;
    public final void rule__ConstraintInstance__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3951:1: ( rule__ConstraintInstance__Group_1_2__0__Impl rule__ConstraintInstance__Group_1_2__1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3952:2: rule__ConstraintInstance__Group_1_2__0__Impl rule__ConstraintInstance__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__ConstraintInstance__Group_1_2__0__Impl_in_rule__ConstraintInstance__Group_1_2__07937);
            rule__ConstraintInstance__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstraintInstance__Group_1_2__1_in_rule__ConstraintInstance__Group_1_2__07940);
            rule__ConstraintInstance__Group_1_2__1();

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
    // $ANTLR end "rule__ConstraintInstance__Group_1_2__0"


    // $ANTLR start "rule__ConstraintInstance__Group_1_2__0__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3959:1: rule__ConstraintInstance__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__ConstraintInstance__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3963:1: ( ( ',' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3964:1: ( ',' )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3964:1: ( ',' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3965:1: ','
            {
             before(grammarAccess.getConstraintInstanceAccess().getCommaKeyword_1_2_0()); 
            match(input,31,FOLLOW_31_in_rule__ConstraintInstance__Group_1_2__0__Impl7968); 
             after(grammarAccess.getConstraintInstanceAccess().getCommaKeyword_1_2_0()); 

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
    // $ANTLR end "rule__ConstraintInstance__Group_1_2__0__Impl"


    // $ANTLR start "rule__ConstraintInstance__Group_1_2__1"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3978:1: rule__ConstraintInstance__Group_1_2__1 : rule__ConstraintInstance__Group_1_2__1__Impl ;
    public final void rule__ConstraintInstance__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3982:1: ( rule__ConstraintInstance__Group_1_2__1__Impl )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3983:2: rule__ConstraintInstance__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ConstraintInstance__Group_1_2__1__Impl_in_rule__ConstraintInstance__Group_1_2__17999);
            rule__ConstraintInstance__Group_1_2__1__Impl();

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
    // $ANTLR end "rule__ConstraintInstance__Group_1_2__1"


    // $ANTLR start "rule__ConstraintInstance__Group_1_2__1__Impl"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3989:1: rule__ConstraintInstance__Group_1_2__1__Impl : ( ( rule__ConstraintInstance__ParamsAssignment_1_2_1 ) ) ;
    public final void rule__ConstraintInstance__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3993:1: ( ( ( rule__ConstraintInstance__ParamsAssignment_1_2_1 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3994:1: ( ( rule__ConstraintInstance__ParamsAssignment_1_2_1 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3994:1: ( ( rule__ConstraintInstance__ParamsAssignment_1_2_1 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3995:1: ( rule__ConstraintInstance__ParamsAssignment_1_2_1 )
            {
             before(grammarAccess.getConstraintInstanceAccess().getParamsAssignment_1_2_1()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3996:1: ( rule__ConstraintInstance__ParamsAssignment_1_2_1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:3996:2: rule__ConstraintInstance__ParamsAssignment_1_2_1
            {
            pushFollow(FOLLOW_rule__ConstraintInstance__ParamsAssignment_1_2_1_in_rule__ConstraintInstance__Group_1_2__1__Impl8026);
            rule__ConstraintInstance__ParamsAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getConstraintInstanceAccess().getParamsAssignment_1_2_1()); 

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
    // $ANTLR end "rule__ConstraintInstance__Group_1_2__1__Impl"


    // $ANTLR start "rule__BooleanLiteral__Group__0"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4010:1: rule__BooleanLiteral__Group__0 : rule__BooleanLiteral__Group__0__Impl rule__BooleanLiteral__Group__1 ;
    public final void rule__BooleanLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4014:1: ( rule__BooleanLiteral__Group__0__Impl rule__BooleanLiteral__Group__1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4015:2: rule__BooleanLiteral__Group__0__Impl rule__BooleanLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__BooleanLiteral__Group__0__Impl_in_rule__BooleanLiteral__Group__08060);
            rule__BooleanLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BooleanLiteral__Group__1_in_rule__BooleanLiteral__Group__08063);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4022:1: rule__BooleanLiteral__Group__0__Impl : ( () ) ;
    public final void rule__BooleanLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4026:1: ( ( () ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4027:1: ( () )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4027:1: ( () )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4028:1: ()
            {
             before(grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_0()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4029:1: ()
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4031:1: 
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4041:1: rule__BooleanLiteral__Group__1 : rule__BooleanLiteral__Group__1__Impl ;
    public final void rule__BooleanLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4045:1: ( rule__BooleanLiteral__Group__1__Impl )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4046:2: rule__BooleanLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BooleanLiteral__Group__1__Impl_in_rule__BooleanLiteral__Group__18121);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4052:1: rule__BooleanLiteral__Group__1__Impl : ( ( rule__BooleanLiteral__ValueAssignment_1 ) ) ;
    public final void rule__BooleanLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4056:1: ( ( ( rule__BooleanLiteral__ValueAssignment_1 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4057:1: ( ( rule__BooleanLiteral__ValueAssignment_1 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4057:1: ( ( rule__BooleanLiteral__ValueAssignment_1 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4058:1: ( rule__BooleanLiteral__ValueAssignment_1 )
            {
             before(grammarAccess.getBooleanLiteralAccess().getValueAssignment_1()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4059:1: ( rule__BooleanLiteral__ValueAssignment_1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4059:2: rule__BooleanLiteral__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__BooleanLiteral__ValueAssignment_1_in_rule__BooleanLiteral__Group__1__Impl8148);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4073:1: rule__NullLiteral__Group__0 : rule__NullLiteral__Group__0__Impl rule__NullLiteral__Group__1 ;
    public final void rule__NullLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4077:1: ( rule__NullLiteral__Group__0__Impl rule__NullLiteral__Group__1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4078:2: rule__NullLiteral__Group__0__Impl rule__NullLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__NullLiteral__Group__0__Impl_in_rule__NullLiteral__Group__08182);
            rule__NullLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NullLiteral__Group__1_in_rule__NullLiteral__Group__08185);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4085:1: rule__NullLiteral__Group__0__Impl : ( () ) ;
    public final void rule__NullLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4089:1: ( ( () ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4090:1: ( () )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4090:1: ( () )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4091:1: ()
            {
             before(grammarAccess.getNullLiteralAccess().getNullLiteralAction_0()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4092:1: ()
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4094:1: 
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4104:1: rule__NullLiteral__Group__1 : rule__NullLiteral__Group__1__Impl ;
    public final void rule__NullLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4108:1: ( rule__NullLiteral__Group__1__Impl )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4109:2: rule__NullLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NullLiteral__Group__1__Impl_in_rule__NullLiteral__Group__18243);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4115:1: rule__NullLiteral__Group__1__Impl : ( ( rule__NullLiteral__ValueAssignment_1 ) ) ;
    public final void rule__NullLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4119:1: ( ( ( rule__NullLiteral__ValueAssignment_1 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4120:1: ( ( rule__NullLiteral__ValueAssignment_1 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4120:1: ( ( rule__NullLiteral__ValueAssignment_1 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4121:1: ( rule__NullLiteral__ValueAssignment_1 )
            {
             before(grammarAccess.getNullLiteralAccess().getValueAssignment_1()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4122:1: ( rule__NullLiteral__ValueAssignment_1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4122:2: rule__NullLiteral__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__NullLiteral__ValueAssignment_1_in_rule__NullLiteral__Group__1__Impl8270);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4136:1: rule__NumberLiteral__Group__0 : rule__NumberLiteral__Group__0__Impl rule__NumberLiteral__Group__1 ;
    public final void rule__NumberLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4140:1: ( rule__NumberLiteral__Group__0__Impl rule__NumberLiteral__Group__1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4141:2: rule__NumberLiteral__Group__0__Impl rule__NumberLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__NumberLiteral__Group__0__Impl_in_rule__NumberLiteral__Group__08304);
            rule__NumberLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumberLiteral__Group__1_in_rule__NumberLiteral__Group__08307);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4148:1: rule__NumberLiteral__Group__0__Impl : ( () ) ;
    public final void rule__NumberLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4152:1: ( ( () ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4153:1: ( () )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4153:1: ( () )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4154:1: ()
            {
             before(grammarAccess.getNumberLiteralAccess().getNumberLiteralAction_0()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4155:1: ()
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4157:1: 
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4167:1: rule__NumberLiteral__Group__1 : rule__NumberLiteral__Group__1__Impl ;
    public final void rule__NumberLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4171:1: ( rule__NumberLiteral__Group__1__Impl )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4172:2: rule__NumberLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NumberLiteral__Group__1__Impl_in_rule__NumberLiteral__Group__18365);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4178:1: rule__NumberLiteral__Group__1__Impl : ( ( rule__NumberLiteral__ValueAssignment_1 ) ) ;
    public final void rule__NumberLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4182:1: ( ( ( rule__NumberLiteral__ValueAssignment_1 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4183:1: ( ( rule__NumberLiteral__ValueAssignment_1 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4183:1: ( ( rule__NumberLiteral__ValueAssignment_1 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4184:1: ( rule__NumberLiteral__ValueAssignment_1 )
            {
             before(grammarAccess.getNumberLiteralAccess().getValueAssignment_1()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4185:1: ( rule__NumberLiteral__ValueAssignment_1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4185:2: rule__NumberLiteral__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__NumberLiteral__ValueAssignment_1_in_rule__NumberLiteral__Group__1__Impl8392);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4199:1: rule__StringLiteral__Group__0 : rule__StringLiteral__Group__0__Impl rule__StringLiteral__Group__1 ;
    public final void rule__StringLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4203:1: ( rule__StringLiteral__Group__0__Impl rule__StringLiteral__Group__1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4204:2: rule__StringLiteral__Group__0__Impl rule__StringLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__StringLiteral__Group__0__Impl_in_rule__StringLiteral__Group__08426);
            rule__StringLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringLiteral__Group__1_in_rule__StringLiteral__Group__08429);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4211:1: rule__StringLiteral__Group__0__Impl : ( () ) ;
    public final void rule__StringLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4215:1: ( ( () ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4216:1: ( () )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4216:1: ( () )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4217:1: ()
            {
             before(grammarAccess.getStringLiteralAccess().getStringLiteralAction_0()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4218:1: ()
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4220:1: 
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4230:1: rule__StringLiteral__Group__1 : rule__StringLiteral__Group__1__Impl ;
    public final void rule__StringLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4234:1: ( rule__StringLiteral__Group__1__Impl )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4235:2: rule__StringLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__StringLiteral__Group__1__Impl_in_rule__StringLiteral__Group__18487);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4241:1: rule__StringLiteral__Group__1__Impl : ( ( rule__StringLiteral__ValueAssignment_1 ) ) ;
    public final void rule__StringLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4245:1: ( ( ( rule__StringLiteral__ValueAssignment_1 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4246:1: ( ( rule__StringLiteral__ValueAssignment_1 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4246:1: ( ( rule__StringLiteral__ValueAssignment_1 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4247:1: ( rule__StringLiteral__ValueAssignment_1 )
            {
             before(grammarAccess.getStringLiteralAccess().getValueAssignment_1()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4248:1: ( rule__StringLiteral__ValueAssignment_1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4248:2: rule__StringLiteral__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__StringLiteral__ValueAssignment_1_in_rule__StringLiteral__Group__1__Impl8514);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4262:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4266:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4267:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__08548);
            rule__FQN__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__08551);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4274:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4278:1: ( ( RULE_ID ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4279:1: ( RULE_ID )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4279:1: ( RULE_ID )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4280:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl8578); 
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4291:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4295:1: ( rule__FQN__Group__1__Impl )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4296:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__18607);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4302:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4306:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4307:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4307:1: ( ( rule__FQN__Group_1__0 )* )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4308:1: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4309:1: ( rule__FQN__Group_1__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==44) ) {
                    int LA40_2 = input.LA(2);

                    if ( (LA40_2==RULE_ID) ) {
                        alt40=1;
                    }


                }


                switch (alt40) {
            	case 1 :
            	    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4309:2: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl8634);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4323:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4327:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4328:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__08669);
            rule__FQN__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__08672);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4335:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4339:1: ( ( '.' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4340:1: ( '.' )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4340:1: ( '.' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4341:1: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,44,FOLLOW_44_in_rule__FQN__Group_1__0__Impl8700); 
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4354:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4358:1: ( rule__FQN__Group_1__1__Impl )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4359:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__18731);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4365:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4369:1: ( ( RULE_ID ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4370:1: ( RULE_ID )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4370:1: ( RULE_ID )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4371:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl8758); 
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4386:1: rule__FQNWithWildcard__Group__0 : rule__FQNWithWildcard__Group__0__Impl rule__FQNWithWildcard__Group__1 ;
    public final void rule__FQNWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4390:1: ( rule__FQNWithWildcard__Group__0__Impl rule__FQNWithWildcard__Group__1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4391:2: rule__FQNWithWildcard__Group__0__Impl rule__FQNWithWildcard__Group__1
            {
            pushFollow(FOLLOW_rule__FQNWithWildcard__Group__0__Impl_in_rule__FQNWithWildcard__Group__08791);
            rule__FQNWithWildcard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FQNWithWildcard__Group__1_in_rule__FQNWithWildcard__Group__08794);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4398:1: rule__FQNWithWildcard__Group__0__Impl : ( ruleFQN ) ;
    public final void rule__FQNWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4402:1: ( ( ruleFQN ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4403:1: ( ruleFQN )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4403:1: ( ruleFQN )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4404:1: ruleFQN
            {
             before(grammarAccess.getFQNWithWildcardAccess().getFQNParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__FQNWithWildcard__Group__0__Impl8821);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4415:1: rule__FQNWithWildcard__Group__1 : rule__FQNWithWildcard__Group__1__Impl rule__FQNWithWildcard__Group__2 ;
    public final void rule__FQNWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4419:1: ( rule__FQNWithWildcard__Group__1__Impl rule__FQNWithWildcard__Group__2 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4420:2: rule__FQNWithWildcard__Group__1__Impl rule__FQNWithWildcard__Group__2
            {
            pushFollow(FOLLOW_rule__FQNWithWildcard__Group__1__Impl_in_rule__FQNWithWildcard__Group__18850);
            rule__FQNWithWildcard__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FQNWithWildcard__Group__2_in_rule__FQNWithWildcard__Group__18853);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4427:1: rule__FQNWithWildcard__Group__1__Impl : ( '.' ) ;
    public final void rule__FQNWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4431:1: ( ( '.' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4432:1: ( '.' )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4432:1: ( '.' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4433:1: '.'
            {
             before(grammarAccess.getFQNWithWildcardAccess().getFullStopKeyword_1()); 
            match(input,44,FOLLOW_44_in_rule__FQNWithWildcard__Group__1__Impl8881); 
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4446:1: rule__FQNWithWildcard__Group__2 : rule__FQNWithWildcard__Group__2__Impl ;
    public final void rule__FQNWithWildcard__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4450:1: ( rule__FQNWithWildcard__Group__2__Impl )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4451:2: rule__FQNWithWildcard__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__FQNWithWildcard__Group__2__Impl_in_rule__FQNWithWildcard__Group__28912);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4457:1: rule__FQNWithWildcard__Group__2__Impl : ( '*' ) ;
    public final void rule__FQNWithWildcard__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4461:1: ( ( '*' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4462:1: ( '*' )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4462:1: ( '*' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4463:1: '*'
            {
             before(grammarAccess.getFQNWithWildcardAccess().getAsteriskKeyword_2()); 
            match(input,45,FOLLOW_45_in_rule__FQNWithWildcard__Group__2__Impl8940); 
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4482:1: rule__Number__Group_1__0 : rule__Number__Group_1__0__Impl rule__Number__Group_1__1 ;
    public final void rule__Number__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4486:1: ( rule__Number__Group_1__0__Impl rule__Number__Group_1__1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4487:2: rule__Number__Group_1__0__Impl rule__Number__Group_1__1
            {
            pushFollow(FOLLOW_rule__Number__Group_1__0__Impl_in_rule__Number__Group_1__08977);
            rule__Number__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Number__Group_1__1_in_rule__Number__Group_1__08980);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4494:1: rule__Number__Group_1__0__Impl : ( ( rule__Number__Alternatives_1_0 ) ) ;
    public final void rule__Number__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4498:1: ( ( ( rule__Number__Alternatives_1_0 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4499:1: ( ( rule__Number__Alternatives_1_0 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4499:1: ( ( rule__Number__Alternatives_1_0 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4500:1: ( rule__Number__Alternatives_1_0 )
            {
             before(grammarAccess.getNumberAccess().getAlternatives_1_0()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4501:1: ( rule__Number__Alternatives_1_0 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4501:2: rule__Number__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__Number__Alternatives_1_0_in_rule__Number__Group_1__0__Impl9007);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4511:1: rule__Number__Group_1__1 : rule__Number__Group_1__1__Impl ;
    public final void rule__Number__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4515:1: ( rule__Number__Group_1__1__Impl )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4516:2: rule__Number__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Number__Group_1__1__Impl_in_rule__Number__Group_1__19037);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4522:1: rule__Number__Group_1__1__Impl : ( ( rule__Number__Group_1_1__0 )? ) ;
    public final void rule__Number__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4526:1: ( ( ( rule__Number__Group_1_1__0 )? ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4527:1: ( ( rule__Number__Group_1_1__0 )? )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4527:1: ( ( rule__Number__Group_1_1__0 )? )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4528:1: ( rule__Number__Group_1_1__0 )?
            {
             before(grammarAccess.getNumberAccess().getGroup_1_1()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4529:1: ( rule__Number__Group_1_1__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==44) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4529:2: rule__Number__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__Number__Group_1_1__0_in_rule__Number__Group_1__1__Impl9064);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4543:1: rule__Number__Group_1_1__0 : rule__Number__Group_1_1__0__Impl rule__Number__Group_1_1__1 ;
    public final void rule__Number__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4547:1: ( rule__Number__Group_1_1__0__Impl rule__Number__Group_1_1__1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4548:2: rule__Number__Group_1_1__0__Impl rule__Number__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Number__Group_1_1__0__Impl_in_rule__Number__Group_1_1__09099);
            rule__Number__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Number__Group_1_1__1_in_rule__Number__Group_1_1__09102);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4555:1: rule__Number__Group_1_1__0__Impl : ( '.' ) ;
    public final void rule__Number__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4559:1: ( ( '.' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4560:1: ( '.' )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4560:1: ( '.' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4561:1: '.'
            {
             before(grammarAccess.getNumberAccess().getFullStopKeyword_1_1_0()); 
            match(input,44,FOLLOW_44_in_rule__Number__Group_1_1__0__Impl9130); 
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4574:1: rule__Number__Group_1_1__1 : rule__Number__Group_1_1__1__Impl ;
    public final void rule__Number__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4578:1: ( rule__Number__Group_1_1__1__Impl )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4579:2: rule__Number__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Number__Group_1_1__1__Impl_in_rule__Number__Group_1_1__19161);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4585:1: rule__Number__Group_1_1__1__Impl : ( ( rule__Number__Alternatives_1_1_1 ) ) ;
    public final void rule__Number__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4589:1: ( ( ( rule__Number__Alternatives_1_1_1 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4590:1: ( ( rule__Number__Alternatives_1_1_1 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4590:1: ( ( rule__Number__Alternatives_1_1_1 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4591:1: ( rule__Number__Alternatives_1_1_1 )
            {
             before(grammarAccess.getNumberAccess().getAlternatives_1_1_1()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4592:1: ( rule__Number__Alternatives_1_1_1 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4592:2: rule__Number__Alternatives_1_1_1
            {
            pushFollow(FOLLOW_rule__Number__Alternatives_1_1_1_in_rule__Number__Group_1_1__1__Impl9188);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4607:1: rule__DomainModel__ContextsAssignment : ( ruleContext ) ;
    public final void rule__DomainModel__ContextsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4611:1: ( ( ruleContext ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4612:1: ( ruleContext )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4612:1: ( ruleContext )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4613:1: ruleContext
            {
             before(grammarAccess.getDomainModelAccess().getContextsContextParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleContext_in_rule__DomainModel__ContextsAssignment9227);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4622:1: rule__Context__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Context__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4626:1: ( ( RULE_ID ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4627:1: ( RULE_ID )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4627:1: ( RULE_ID )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4628:1: RULE_ID
            {
             before(grammarAccess.getContextAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Context__NameAssignment_19258); 
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4637:1: rule__Context__NamespacesAssignment_3 : ( ruleNamespace ) ;
    public final void rule__Context__NamespacesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4641:1: ( ( ruleNamespace ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4642:1: ( ruleNamespace )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4642:1: ( ruleNamespace )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4643:1: ruleNamespace
            {
             before(grammarAccess.getContextAccess().getNamespacesNamespaceParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleNamespace_in_rule__Context__NamespacesAssignment_39289);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4652:1: rule__Namespace__NameAssignment_1 : ( ruleFQN ) ;
    public final void rule__Namespace__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4656:1: ( ( ruleFQN ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4657:1: ( ruleFQN )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4657:1: ( ruleFQN )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4658:1: ruleFQN
            {
             before(grammarAccess.getNamespaceAccess().getNameFQNParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Namespace__NameAssignment_19320);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4667:1: rule__Namespace__ImportsAssignment_3 : ( ruleImport ) ;
    public final void rule__Namespace__ImportsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4671:1: ( ( ruleImport ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4672:1: ( ruleImport )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4672:1: ( ruleImport )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4673:1: ruleImport
            {
             before(grammarAccess.getNamespaceAccess().getImportsImportParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__Namespace__ImportsAssignment_39351);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4682:1: rule__Namespace__ElementsAssignment_4 : ( ruleAbstractElement ) ;
    public final void rule__Namespace__ElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4686:1: ( ( ruleAbstractElement ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4687:1: ( ruleAbstractElement )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4687:1: ( ruleAbstractElement )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4688:1: ruleAbstractElement
            {
             before(grammarAccess.getNamespaceAccess().getElementsAbstractElementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_rule__Namespace__ElementsAssignment_49382);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4697:1: rule__Import__ImportedNamespaceAssignment_1 : ( ( rule__Import__ImportedNamespaceAlternatives_1_0 ) ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4701:1: ( ( ( rule__Import__ImportedNamespaceAlternatives_1_0 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4702:1: ( ( rule__Import__ImportedNamespaceAlternatives_1_0 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4702:1: ( ( rule__Import__ImportedNamespaceAlternatives_1_0 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4703:1: ( rule__Import__ImportedNamespaceAlternatives_1_0 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAlternatives_1_0()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4704:1: ( rule__Import__ImportedNamespaceAlternatives_1_0 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4704:2: rule__Import__ImportedNamespaceAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAlternatives_1_0_in_rule__Import__ImportedNamespaceAssignment_19413);
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


    // $ANTLR start "rule__Duration__TimeAssignment_0"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4713:1: rule__Duration__TimeAssignment_0 : ( RULE_INT ) ;
    public final void rule__Duration__TimeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4717:1: ( ( RULE_INT ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4718:1: ( RULE_INT )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4718:1: ( RULE_INT )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4719:1: RULE_INT
            {
             before(grammarAccess.getDurationAccess().getTimeINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Duration__TimeAssignment_09446); 
             after(grammarAccess.getDurationAccess().getTimeINTTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Duration__TimeAssignment_0"


    // $ANTLR start "rule__Duration__UnitAssignment_1"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4728:1: rule__Duration__UnitAssignment_1 : ( ruleTimeUnit ) ;
    public final void rule__Duration__UnitAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4732:1: ( ( ruleTimeUnit ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4733:1: ( ruleTimeUnit )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4733:1: ( ruleTimeUnit )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4734:1: ruleTimeUnit
            {
             before(grammarAccess.getDurationAccess().getUnitTimeUnitEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTimeUnit_in_rule__Duration__UnitAssignment_19477);
            ruleTimeUnit();

            state._fsp--;

             after(grammarAccess.getDurationAccess().getUnitTimeUnitEnumRuleCall_1_0()); 

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
    // $ANTLR end "rule__Duration__UnitAssignment_1"


    // $ANTLR start "rule__Command__DocAssignment_0"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4743:1: rule__Command__DocAssignment_0 : ( RULE_DOC ) ;
    public final void rule__Command__DocAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4747:1: ( ( RULE_DOC ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4748:1: ( RULE_DOC )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4748:1: ( RULE_DOC )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4749:1: RULE_DOC
            {
             before(grammarAccess.getCommandAccess().getDocDOCTerminalRuleCall_0_0()); 
            match(input,RULE_DOC,FOLLOW_RULE_DOC_in_rule__Command__DocAssignment_09508); 
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4758:1: rule__Command__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Command__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4762:1: ( ( RULE_ID ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4763:1: ( RULE_ID )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4763:1: ( RULE_ID )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4764:1: RULE_ID
            {
             before(grammarAccess.getCommandAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Command__NameAssignment_29539); 
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4773:1: rule__Command__TargetAssignment_3_1 : ( ( ruleFQN ) ) ;
    public final void rule__Command__TargetAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4777:1: ( ( ( ruleFQN ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4778:1: ( ( ruleFQN ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4778:1: ( ( ruleFQN ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4779:1: ( ruleFQN )
            {
             before(grammarAccess.getCommandAccess().getTargetAbstractMethodCrossReference_3_1_0()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4780:1: ( ruleFQN )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4781:1: ruleFQN
            {
             before(grammarAccess.getCommandAccess().getTargetAbstractMethodFQNParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Command__TargetAssignment_3_19574);
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


    // $ANTLR start "rule__Command__AcceptableAssignment_4_1"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4792:1: rule__Command__AcceptableAssignment_4_1 : ( ruleDuration ) ;
    public final void rule__Command__AcceptableAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4796:1: ( ( ruleDuration ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4797:1: ( ruleDuration )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4797:1: ( ruleDuration )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4798:1: ruleDuration
            {
             before(grammarAccess.getCommandAccess().getAcceptableDurationParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleDuration_in_rule__Command__AcceptableAssignment_4_19609);
            ruleDuration();

            state._fsp--;

             after(grammarAccess.getCommandAccess().getAcceptableDurationParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Command__AcceptableAssignment_4_1"


    // $ANTLR start "rule__Command__AttributesAssignment_6"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4807:1: rule__Command__AttributesAssignment_6 : ( ruleAttribute ) ;
    public final void rule__Command__AttributesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4811:1: ( ( ruleAttribute ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4812:1: ( ruleAttribute )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4812:1: ( ruleAttribute )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4813:1: ruleAttribute
            {
             before(grammarAccess.getCommandAccess().getAttributesAttributeParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__Command__AttributesAssignment_69640);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getCommandAccess().getAttributesAttributeParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Command__AttributesAssignment_6"


    // $ANTLR start "rule__Command__MessageAssignment_7_1"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4822:1: rule__Command__MessageAssignment_7_1 : ( RULE_STRING ) ;
    public final void rule__Command__MessageAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4826:1: ( ( RULE_STRING ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4827:1: ( RULE_STRING )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4827:1: ( RULE_STRING )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4828:1: RULE_STRING
            {
             before(grammarAccess.getCommandAccess().getMessageSTRINGTerminalRuleCall_7_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Command__MessageAssignment_7_19671); 
             after(grammarAccess.getCommandAccess().getMessageSTRINGTerminalRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__Command__MessageAssignment_7_1"


    // $ANTLR start "rule__CommandHandler__DocAssignment_0"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4837:1: rule__CommandHandler__DocAssignment_0 : ( RULE_DOC ) ;
    public final void rule__CommandHandler__DocAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4841:1: ( ( RULE_DOC ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4842:1: ( RULE_DOC )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4842:1: ( RULE_DOC )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4843:1: RULE_DOC
            {
             before(grammarAccess.getCommandHandlerAccess().getDocDOCTerminalRuleCall_0_0()); 
            match(input,RULE_DOC,FOLLOW_RULE_DOC_in_rule__CommandHandler__DocAssignment_09702); 
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4852:1: rule__CommandHandler__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__CommandHandler__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4856:1: ( ( RULE_ID ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4857:1: ( RULE_ID )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4857:1: ( RULE_ID )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4858:1: RULE_ID
            {
             before(grammarAccess.getCommandHandlerAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CommandHandler__NameAssignment_29733); 
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4867:1: rule__CommandHandler__CommandsAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__CommandHandler__CommandsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4871:1: ( ( ( RULE_ID ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4872:1: ( ( RULE_ID ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4872:1: ( ( RULE_ID ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4873:1: ( RULE_ID )
            {
             before(grammarAccess.getCommandHandlerAccess().getCommandsCommandCrossReference_4_0()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4874:1: ( RULE_ID )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4875:1: RULE_ID
            {
             before(grammarAccess.getCommandHandlerAccess().getCommandsCommandIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CommandHandler__CommandsAssignment_49768); 
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4886:1: rule__CommandHandler__CommandsAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__CommandHandler__CommandsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4890:1: ( ( ( RULE_ID ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4891:1: ( ( RULE_ID ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4891:1: ( ( RULE_ID ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4892:1: ( RULE_ID )
            {
             before(grammarAccess.getCommandHandlerAccess().getCommandsCommandCrossReference_5_1_0()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4893:1: ( RULE_ID )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4894:1: RULE_ID
            {
             before(grammarAccess.getCommandHandlerAccess().getCommandsCommandIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CommandHandler__CommandsAssignment_5_19807); 
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4905:1: rule__CommandHandler__AggregatesAssignment_6_1 : ( ( ruleFQN ) ) ;
    public final void rule__CommandHandler__AggregatesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4909:1: ( ( ( ruleFQN ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4910:1: ( ( ruleFQN ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4910:1: ( ( ruleFQN ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4911:1: ( ruleFQN )
            {
             before(grammarAccess.getCommandHandlerAccess().getAggregatesAggregateCrossReference_6_1_0()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4912:1: ( ruleFQN )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4913:1: ruleFQN
            {
             before(grammarAccess.getCommandHandlerAccess().getAggregatesAggregateFQNParserRuleCall_6_1_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__CommandHandler__AggregatesAssignment_6_19846);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4924:1: rule__CommandHandler__AggregatesAssignment_6_2_1 : ( ( ruleFQN ) ) ;
    public final void rule__CommandHandler__AggregatesAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4928:1: ( ( ( ruleFQN ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4929:1: ( ( ruleFQN ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4929:1: ( ( ruleFQN ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4930:1: ( ruleFQN )
            {
             before(grammarAccess.getCommandHandlerAccess().getAggregatesAggregateCrossReference_6_2_1_0()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4931:1: ( ruleFQN )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4932:1: ruleFQN
            {
             before(grammarAccess.getCommandHandlerAccess().getAggregatesAggregateFQNParserRuleCall_6_2_1_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__CommandHandler__AggregatesAssignment_6_2_19885);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4943:1: rule__Projection__DocAssignment_0 : ( RULE_DOC ) ;
    public final void rule__Projection__DocAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4947:1: ( ( RULE_DOC ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4948:1: ( RULE_DOC )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4948:1: ( RULE_DOC )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4949:1: RULE_DOC
            {
             before(grammarAccess.getProjectionAccess().getDocDOCTerminalRuleCall_0_0()); 
            match(input,RULE_DOC,FOLLOW_RULE_DOC_in_rule__Projection__DocAssignment_09920); 
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4958:1: rule__Projection__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Projection__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4962:1: ( ( RULE_ID ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4963:1: ( RULE_ID )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4963:1: ( RULE_ID )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4964:1: RULE_ID
            {
             before(grammarAccess.getProjectionAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Projection__NameAssignment_29951); 
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4973:1: rule__Projection__EventsAssignment_3_1 : ( ( ruleFQN ) ) ;
    public final void rule__Projection__EventsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4977:1: ( ( ( ruleFQN ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4978:1: ( ( ruleFQN ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4978:1: ( ( ruleFQN ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4979:1: ( ruleFQN )
            {
             before(grammarAccess.getProjectionAccess().getEventsEventCrossReference_3_1_0()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4980:1: ( ruleFQN )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4981:1: ruleFQN
            {
             before(grammarAccess.getProjectionAccess().getEventsEventFQNParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Projection__EventsAssignment_3_19986);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4992:1: rule__Projection__EventsAssignment_3_2_1 : ( ( ruleFQN ) ) ;
    public final void rule__Projection__EventsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4996:1: ( ( ( ruleFQN ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4997:1: ( ( ruleFQN ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4997:1: ( ( ruleFQN ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4998:1: ( ruleFQN )
            {
             before(grammarAccess.getProjectionAccess().getEventsEventCrossReference_3_2_1_0()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:4999:1: ( ruleFQN )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5000:1: ruleFQN
            {
             before(grammarAccess.getProjectionAccess().getEventsEventFQNParserRuleCall_3_2_1_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Projection__EventsAssignment_3_2_110025);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5011:1: rule__View__DocAssignment_0 : ( RULE_DOC ) ;
    public final void rule__View__DocAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5015:1: ( ( RULE_DOC ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5016:1: ( RULE_DOC )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5016:1: ( RULE_DOC )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5017:1: RULE_DOC
            {
             before(grammarAccess.getViewAccess().getDocDOCTerminalRuleCall_0_0()); 
            match(input,RULE_DOC,FOLLOW_RULE_DOC_in_rule__View__DocAssignment_010060); 
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5026:1: rule__View__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__View__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5030:1: ( ( RULE_ID ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5031:1: ( RULE_ID )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5031:1: ( RULE_ID )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5032:1: RULE_ID
            {
             before(grammarAccess.getViewAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__View__NameAssignment_210091); 
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5041:1: rule__View__ProjectionAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__View__ProjectionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5045:1: ( ( ( RULE_ID ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5046:1: ( ( RULE_ID ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5046:1: ( ( RULE_ID ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5047:1: ( RULE_ID )
            {
             before(grammarAccess.getViewAccess().getProjectionProjectionCrossReference_4_0()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5048:1: ( RULE_ID )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5049:1: RULE_ID
            {
             before(grammarAccess.getViewAccess().getProjectionProjectionIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__View__ProjectionAssignment_410126); 
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5060:1: rule__TypeMetaInfo__SlabelAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__TypeMetaInfo__SlabelAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5064:1: ( ( RULE_STRING ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5065:1: ( RULE_STRING )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5065:1: ( RULE_STRING )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5066:1: RULE_STRING
            {
             before(grammarAccess.getTypeMetaInfoAccess().getSlabelSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TypeMetaInfo__SlabelAssignment_1_110161); 
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5075:1: rule__TypeMetaInfo__LabelAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__TypeMetaInfo__LabelAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5079:1: ( ( RULE_STRING ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5080:1: ( RULE_STRING )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5080:1: ( RULE_STRING )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5081:1: RULE_STRING
            {
             before(grammarAccess.getTypeMetaInfoAccess().getLabelSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TypeMetaInfo__LabelAssignment_2_110192); 
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5090:1: rule__TypeMetaInfo__TooltipAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__TypeMetaInfo__TooltipAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5094:1: ( ( RULE_STRING ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5095:1: ( RULE_STRING )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5095:1: ( RULE_STRING )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5096:1: RULE_STRING
            {
             before(grammarAccess.getTypeMetaInfoAccess().getTooltipSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TypeMetaInfo__TooltipAssignment_3_110223); 
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5105:1: rule__TypeMetaInfo__PromptAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__TypeMetaInfo__PromptAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5109:1: ( ( RULE_STRING ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5110:1: ( RULE_STRING )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5110:1: ( RULE_STRING )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5111:1: RULE_STRING
            {
             before(grammarAccess.getTypeMetaInfoAccess().getPromptSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TypeMetaInfo__PromptAssignment_4_110254); 
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5120:1: rule__TypeMetaInfo__ExamplesAssignment_5_1 : ( ruleLiteral ) ;
    public final void rule__TypeMetaInfo__ExamplesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5124:1: ( ( ruleLiteral ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5125:1: ( ruleLiteral )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5125:1: ( ruleLiteral )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5126:1: ruleLiteral
            {
             before(grammarAccess.getTypeMetaInfoAccess().getExamplesLiteralParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleLiteral_in_rule__TypeMetaInfo__ExamplesAssignment_5_110285);
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


    // $ANTLR start "rule__Attribute__DocAssignment_0"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5135:1: rule__Attribute__DocAssignment_0 : ( RULE_DOC ) ;
    public final void rule__Attribute__DocAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5139:1: ( ( RULE_DOC ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5140:1: ( RULE_DOC )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5140:1: ( RULE_DOC )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5141:1: RULE_DOC
            {
             before(grammarAccess.getAttributeAccess().getDocDOCTerminalRuleCall_0_0()); 
            match(input,RULE_DOC,FOLLOW_RULE_DOC_in_rule__Attribute__DocAssignment_010316); 
             after(grammarAccess.getAttributeAccess().getDocDOCTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Attribute__DocAssignment_0"


    // $ANTLR start "rule__Attribute__NullableAssignment_1"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5150:1: rule__Attribute__NullableAssignment_1 : ( ( 'nullable' ) ) ;
    public final void rule__Attribute__NullableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5154:1: ( ( ( 'nullable' ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5155:1: ( ( 'nullable' ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5155:1: ( ( 'nullable' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5156:1: ( 'nullable' )
            {
             before(grammarAccess.getAttributeAccess().getNullableNullableKeyword_1_0()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5157:1: ( 'nullable' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5158:1: 'nullable'
            {
             before(grammarAccess.getAttributeAccess().getNullableNullableKeyword_1_0()); 
            match(input,46,FOLLOW_46_in_rule__Attribute__NullableAssignment_110352); 
             after(grammarAccess.getAttributeAccess().getNullableNullableKeyword_1_0()); 

            }

             after(grammarAccess.getAttributeAccess().getNullableNullableKeyword_1_0()); 

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
    // $ANTLR end "rule__Attribute__NullableAssignment_1"


    // $ANTLR start "rule__Attribute__TypeAssignment_2"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5173:1: rule__Attribute__TypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Attribute__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5177:1: ( ( ( RULE_ID ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5178:1: ( ( RULE_ID ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5178:1: ( ( RULE_ID ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5179:1: ( RULE_ID )
            {
             before(grammarAccess.getAttributeAccess().getTypeTypeCrossReference_2_0()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5180:1: ( RULE_ID )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5181:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getTypeTypeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__TypeAssignment_210395); 
             after(grammarAccess.getAttributeAccess().getTypeTypeIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getAttributeAccess().getTypeTypeCrossReference_2_0()); 

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
    // $ANTLR end "rule__Attribute__TypeAssignment_2"


    // $ANTLR start "rule__Attribute__MultiplicityAssignment_3"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5192:1: rule__Attribute__MultiplicityAssignment_3 : ( ( '*' ) ) ;
    public final void rule__Attribute__MultiplicityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5196:1: ( ( ( '*' ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5197:1: ( ( '*' ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5197:1: ( ( '*' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5198:1: ( '*' )
            {
             before(grammarAccess.getAttributeAccess().getMultiplicityAsteriskKeyword_3_0()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5199:1: ( '*' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5200:1: '*'
            {
             before(grammarAccess.getAttributeAccess().getMultiplicityAsteriskKeyword_3_0()); 
            match(input,45,FOLLOW_45_in_rule__Attribute__MultiplicityAssignment_310435); 
             after(grammarAccess.getAttributeAccess().getMultiplicityAsteriskKeyword_3_0()); 

            }

             after(grammarAccess.getAttributeAccess().getMultiplicityAsteriskKeyword_3_0()); 

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
    // $ANTLR end "rule__Attribute__MultiplicityAssignment_3"


    // $ANTLR start "rule__Attribute__NameAssignment_4"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5215:1: rule__Attribute__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5219:1: ( ( RULE_ID ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5220:1: ( RULE_ID )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5220:1: ( RULE_ID )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5221:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_410474); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__Attribute__NameAssignment_4"


    // $ANTLR start "rule__Attribute__InvariantsAssignment_5"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5230:1: rule__Attribute__InvariantsAssignment_5 : ( ruleInvariants ) ;
    public final void rule__Attribute__InvariantsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5234:1: ( ( ruleInvariants ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5235:1: ( ruleInvariants )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5235:1: ( ruleInvariants )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5236:1: ruleInvariants
            {
             before(grammarAccess.getAttributeAccess().getInvariantsInvariantsParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleInvariants_in_rule__Attribute__InvariantsAssignment_510505);
            ruleInvariants();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getInvariantsInvariantsParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Attribute__InvariantsAssignment_5"


    // $ANTLR start "rule__Attribute__OverriddenAssignment_6"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5245:1: rule__Attribute__OverriddenAssignment_6 : ( ruleOverriddenTypeMetaInfo ) ;
    public final void rule__Attribute__OverriddenAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5249:1: ( ( ruleOverriddenTypeMetaInfo ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5250:1: ( ruleOverriddenTypeMetaInfo )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5250:1: ( ruleOverriddenTypeMetaInfo )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5251:1: ruleOverriddenTypeMetaInfo
            {
             before(grammarAccess.getAttributeAccess().getOverriddenOverriddenTypeMetaInfoParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleOverriddenTypeMetaInfo_in_rule__Attribute__OverriddenAssignment_610536);
            ruleOverriddenTypeMetaInfo();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getOverriddenOverriddenTypeMetaInfoParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Attribute__OverriddenAssignment_6"


    // $ANTLR start "rule__Invariants__ConstraintInstancesAssignment_1"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5260:1: rule__Invariants__ConstraintInstancesAssignment_1 : ( ruleConstraintInstance ) ;
    public final void rule__Invariants__ConstraintInstancesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5264:1: ( ( ruleConstraintInstance ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5265:1: ( ruleConstraintInstance )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5265:1: ( ruleConstraintInstance )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5266:1: ruleConstraintInstance
            {
             before(grammarAccess.getInvariantsAccess().getConstraintInstancesConstraintInstanceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleConstraintInstance_in_rule__Invariants__ConstraintInstancesAssignment_110567);
            ruleConstraintInstance();

            state._fsp--;

             after(grammarAccess.getInvariantsAccess().getConstraintInstancesConstraintInstanceParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Invariants__ConstraintInstancesAssignment_1"


    // $ANTLR start "rule__Invariants__ConstraintInstancesAssignment_2_1"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5275:1: rule__Invariants__ConstraintInstancesAssignment_2_1 : ( ruleConstraintInstance ) ;
    public final void rule__Invariants__ConstraintInstancesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5279:1: ( ( ruleConstraintInstance ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5280:1: ( ruleConstraintInstance )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5280:1: ( ruleConstraintInstance )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5281:1: ruleConstraintInstance
            {
             before(grammarAccess.getInvariantsAccess().getConstraintInstancesConstraintInstanceParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleConstraintInstance_in_rule__Invariants__ConstraintInstancesAssignment_2_110598);
            ruleConstraintInstance();

            state._fsp--;

             after(grammarAccess.getInvariantsAccess().getConstraintInstancesConstraintInstanceParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Invariants__ConstraintInstancesAssignment_2_1"


    // $ANTLR start "rule__OverriddenTypeMetaInfo__MetaInfoAssignment_1"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5290:1: rule__OverriddenTypeMetaInfo__MetaInfoAssignment_1 : ( ruleTypeMetaInfo ) ;
    public final void rule__OverriddenTypeMetaInfo__MetaInfoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5294:1: ( ( ruleTypeMetaInfo ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5295:1: ( ruleTypeMetaInfo )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5295:1: ( ruleTypeMetaInfo )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5296:1: ruleTypeMetaInfo
            {
             before(grammarAccess.getOverriddenTypeMetaInfoAccess().getMetaInfoTypeMetaInfoParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTypeMetaInfo_in_rule__OverriddenTypeMetaInfo__MetaInfoAssignment_110629);
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


    // $ANTLR start "rule__ConstraintInstance__ConstraintAssignment_0"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5305:1: rule__ConstraintInstance__ConstraintAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ConstraintInstance__ConstraintAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5309:1: ( ( ( RULE_ID ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5310:1: ( ( RULE_ID ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5310:1: ( ( RULE_ID ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5311:1: ( RULE_ID )
            {
             before(grammarAccess.getConstraintInstanceAccess().getConstraintConstraintCrossReference_0_0()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5312:1: ( RULE_ID )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5313:1: RULE_ID
            {
             before(grammarAccess.getConstraintInstanceAccess().getConstraintConstraintIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ConstraintInstance__ConstraintAssignment_010664); 
             after(grammarAccess.getConstraintInstanceAccess().getConstraintConstraintIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getConstraintInstanceAccess().getConstraintConstraintCrossReference_0_0()); 

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
    // $ANTLR end "rule__ConstraintInstance__ConstraintAssignment_0"


    // $ANTLR start "rule__ConstraintInstance__ParamsAssignment_1_1"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5324:1: rule__ConstraintInstance__ParamsAssignment_1_1 : ( ruleLiteral ) ;
    public final void rule__ConstraintInstance__ParamsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5328:1: ( ( ruleLiteral ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5329:1: ( ruleLiteral )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5329:1: ( ruleLiteral )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5330:1: ruleLiteral
            {
             before(grammarAccess.getConstraintInstanceAccess().getParamsLiteralParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleLiteral_in_rule__ConstraintInstance__ParamsAssignment_1_110699);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getConstraintInstanceAccess().getParamsLiteralParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__ConstraintInstance__ParamsAssignment_1_1"


    // $ANTLR start "rule__ConstraintInstance__ParamsAssignment_1_2_1"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5339:1: rule__ConstraintInstance__ParamsAssignment_1_2_1 : ( ruleLiteral ) ;
    public final void rule__ConstraintInstance__ParamsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5343:1: ( ( ruleLiteral ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5344:1: ( ruleLiteral )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5344:1: ( ruleLiteral )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5345:1: ruleLiteral
            {
             before(grammarAccess.getConstraintInstanceAccess().getParamsLiteralParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_ruleLiteral_in_rule__ConstraintInstance__ParamsAssignment_1_2_110730);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getConstraintInstanceAccess().getParamsLiteralParserRuleCall_1_2_1_0()); 

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
    // $ANTLR end "rule__ConstraintInstance__ParamsAssignment_1_2_1"


    // $ANTLR start "rule__BooleanLiteral__ValueAssignment_1"
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5354:1: rule__BooleanLiteral__ValueAssignment_1 : ( ( rule__BooleanLiteral__ValueAlternatives_1_0 ) ) ;
    public final void rule__BooleanLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5358:1: ( ( ( rule__BooleanLiteral__ValueAlternatives_1_0 ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5359:1: ( ( rule__BooleanLiteral__ValueAlternatives_1_0 ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5359:1: ( ( rule__BooleanLiteral__ValueAlternatives_1_0 ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5360:1: ( rule__BooleanLiteral__ValueAlternatives_1_0 )
            {
             before(grammarAccess.getBooleanLiteralAccess().getValueAlternatives_1_0()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5361:1: ( rule__BooleanLiteral__ValueAlternatives_1_0 )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5361:2: rule__BooleanLiteral__ValueAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__BooleanLiteral__ValueAlternatives_1_0_in_rule__BooleanLiteral__ValueAssignment_110761);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5370:1: rule__NullLiteral__ValueAssignment_1 : ( ( 'null' ) ) ;
    public final void rule__NullLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5374:1: ( ( ( 'null' ) ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5375:1: ( ( 'null' ) )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5375:1: ( ( 'null' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5376:1: ( 'null' )
            {
             before(grammarAccess.getNullLiteralAccess().getValueNullKeyword_1_0()); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5377:1: ( 'null' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5378:1: 'null'
            {
             before(grammarAccess.getNullLiteralAccess().getValueNullKeyword_1_0()); 
            match(input,47,FOLLOW_47_in_rule__NullLiteral__ValueAssignment_110799); 
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5393:1: rule__NumberLiteral__ValueAssignment_1 : ( ruleNumber ) ;
    public final void rule__NumberLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5397:1: ( ( ruleNumber ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5398:1: ( ruleNumber )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5398:1: ( ruleNumber )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5399:1: ruleNumber
            {
             before(grammarAccess.getNumberLiteralAccess().getValueNumberParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleNumber_in_rule__NumberLiteral__ValueAssignment_110838);
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
    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5408:1: rule__StringLiteral__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5412:1: ( ( RULE_STRING ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5413:1: ( RULE_STRING )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5413:1: ( RULE_STRING )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:5414:1: RULE_STRING
            {
             before(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment_110869); 
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
        "\1\7\1\54\1\55\2\uffff\1\54";
    static final String DFA2_acceptS =
        "\3\uffff\1\1\1\2\1\uffff";
    static final String DFA2_specialS =
        "\6\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\1",
            "\1\3\15\uffff\1\3\1\uffff\2\3\3\uffff\1\3\3\uffff\1\3\1\uffff\1\3\10\uffff\1\2",
            "\1\5\45\uffff\1\4",
            "",
            "",
            "\1\3\15\uffff\1\3\1\uffff\2\3\3\uffff\1\3\3\uffff\1\3\1\uffff\1\3\10\uffff\1\2"
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
            return "731:1: rule__Import__ImportedNamespaceAlternatives_1_0 : ( ( ruleFQN ) | ( ruleFQNWithWildcard ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleDomainModel_in_entryRuleDomainModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainModel__ContextsAssignment_in_ruleDomainModel94 = new BitSet(new long[]{0x0000000000100002L});
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
    public static final BitSet FOLLOW_ruleDuration_in_entryRuleDuration362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDuration369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Duration__Group__0_in_ruleDuration395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_entryRuleCommand422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommand429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group__0_in_ruleCommand455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandHandler_in_entryRuleCommandHandler482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommandHandler489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandHandler__Group__0_in_ruleCommandHandler515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProjection_in_entryRuleProjection542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProjection549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Projection__Group__0_in_ruleProjection575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleView_in_entryRuleView602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleView609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group__0_in_ruleView635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeMetaInfo_in_entryRuleTypeMetaInfo662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeMetaInfo669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group__0_in_ruleTypeMetaInfo695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0_in_ruleAttribute755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvariants_in_entryRuleInvariants782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInvariants789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Invariants__Group__0_in_ruleInvariants815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOverriddenTypeMetaInfo_in_entryRuleOverriddenTypeMetaInfo842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOverriddenTypeMetaInfo849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OverriddenTypeMetaInfo__Group__0_in_ruleOverriddenTypeMetaInfo875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraintInstance_in_entryRuleConstraintInstance902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraintInstance909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintInstance__Group__0_in_ruleConstraintInstance935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Alternatives_in_ruleLiteral995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral1022 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanLiteral__Group__0_in_ruleBooleanLiteral1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral1082 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullLiteral1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NullLiteral__Group__0_in_ruleNullLiteral1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral1142 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberLiteral1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberLiteral__Group__0_in_ruleNumberLiteral1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1202 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__Group__0_in_ruleStringLiteral1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN1262 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0_in_ruleFQN1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQNWithWildcard_in_entryRuleFQNWithWildcard1322 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQNWithWildcard1329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQNWithWildcard__Group__0_in_ruleFQNWithWildcard1355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber1387 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Alternatives_in_ruleNumber1424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeUnit__Alternatives_in_ruleTimeUnit1461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Import__ImportedNamespaceAlternatives_1_01496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQNWithWildcard_in_rule__Import__ImportedNamespaceAlternatives_1_01513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_rule__AbstractElement__Alternatives1545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandHandler_in_rule__AbstractElement__Alternatives1562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProjection_in_rule__AbstractElement__Alternatives1579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleView_in_rule__AbstractElement__Alternatives1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_rule__Literal__Alternatives1628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_rule__Literal__Alternatives1645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_rule__Literal__Alternatives1662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rule__Literal__Alternatives1679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__BooleanLiteral__ValueAlternatives_1_01712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__BooleanLiteral__ValueAlternatives_1_01732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_rule__Number__Alternatives1766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Group_1__0_in_rule__Number__Alternatives1783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Number__Alternatives_1_01816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_rule__Number__Alternatives_1_01833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Number__Alternatives_1_1_11865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_rule__Number__Alternatives_1_1_11882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__TimeUnit__Alternatives1915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__TimeUnit__Alternatives1936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__TimeUnit__Alternatives1957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__TimeUnit__Alternatives1978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__TimeUnit__Alternatives1999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Context__Group__0__Impl_in_rule__Context__Group__02032 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Context__Group__1_in_rule__Context__Group__02035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Context__Group__0__Impl2063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Context__Group__1__Impl_in_rule__Context__Group__12094 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Context__Group__2_in_rule__Context__Group__12097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Context__NameAssignment_1_in_rule__Context__Group__1__Impl2124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Context__Group__2__Impl_in_rule__Context__Group__22154 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_rule__Context__Group__3_in_rule__Context__Group__22157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Context__Group__2__Impl2185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Context__Group__3__Impl_in_rule__Context__Group__32216 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_rule__Context__Group__4_in_rule__Context__Group__32219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Context__NamespacesAssignment_3_in_rule__Context__Group__3__Impl2246 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__Context__Group__4__Impl_in_rule__Context__Group__42277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Context__Group__4__Impl2305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__Group__0__Impl_in_rule__Namespace__Group__02346 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Namespace__Group__1_in_rule__Namespace__Group__02349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Namespace__Group__0__Impl2377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__Group__1__Impl_in_rule__Namespace__Group__12408 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Namespace__Group__2_in_rule__Namespace__Group__12411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__NameAssignment_1_in_rule__Namespace__Group__1__Impl2438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__Group__2__Impl_in_rule__Namespace__Group__22468 = new BitSet(new long[]{0x0000000A23400100L});
    public static final BitSet FOLLOW_rule__Namespace__Group__3_in_rule__Namespace__Group__22471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Namespace__Group__2__Impl2499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__Group__3__Impl_in_rule__Namespace__Group__32530 = new BitSet(new long[]{0x0000000A23400100L});
    public static final BitSet FOLLOW_rule__Namespace__Group__4_in_rule__Namespace__Group__32533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__ImportsAssignment_3_in_rule__Namespace__Group__3__Impl2560 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Namespace__Group__4__Impl_in_rule__Namespace__Group__42591 = new BitSet(new long[]{0x0000000A23400100L});
    public static final BitSet FOLLOW_rule__Namespace__Group__5_in_rule__Namespace__Group__42594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__ElementsAssignment_4_in_rule__Namespace__Group__4__Impl2621 = new BitSet(new long[]{0x0000000A22000102L});
    public static final BitSet FOLLOW_rule__Namespace__Group__5__Impl_in_rule__Namespace__Group__52652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Namespace__Group__5__Impl2680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02723 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Import__Group__0__Impl2754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl2812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Duration__Group__0__Impl_in_rule__Duration__Group__02846 = new BitSet(new long[]{0x00000000000F8000L});
    public static final BitSet FOLLOW_rule__Duration__Group__1_in_rule__Duration__Group__02849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Duration__TimeAssignment_0_in_rule__Duration__Group__0__Impl2876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Duration__Group__1__Impl_in_rule__Duration__Group__12906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Duration__UnitAssignment_1_in_rule__Duration__Group__1__Impl2933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group__0__Impl_in_rule__Command__Group__02967 = new BitSet(new long[]{0x0000000002000100L});
    public static final BitSet FOLLOW_rule__Command__Group__1_in_rule__Command__Group__02970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__DocAssignment_0_in_rule__Command__Group__0__Impl2997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group__1__Impl_in_rule__Command__Group__13028 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Command__Group__2_in_rule__Command__Group__13031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Command__Group__1__Impl3059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group__2__Impl_in_rule__Command__Group__23090 = new BitSet(new long[]{0x000000000C200000L});
    public static final BitSet FOLLOW_rule__Command__Group__3_in_rule__Command__Group__23093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__NameAssignment_2_in_rule__Command__Group__2__Impl3120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group__3__Impl_in_rule__Command__Group__33150 = new BitSet(new long[]{0x000000000C200000L});
    public static final BitSet FOLLOW_rule__Command__Group__4_in_rule__Command__Group__33153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_3__0_in_rule__Command__Group__3__Impl3180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group__4__Impl_in_rule__Command__Group__43211 = new BitSet(new long[]{0x000000000C200000L});
    public static final BitSet FOLLOW_rule__Command__Group__5_in_rule__Command__Group__43214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_4__0_in_rule__Command__Group__4__Impl3241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group__5__Impl_in_rule__Command__Group__53272 = new BitSet(new long[]{0x0000400010400180L});
    public static final BitSet FOLLOW_rule__Command__Group__6_in_rule__Command__Group__53275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Command__Group__5__Impl3303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group__6__Impl_in_rule__Command__Group__63334 = new BitSet(new long[]{0x0000400010400180L});
    public static final BitSet FOLLOW_rule__Command__Group__7_in_rule__Command__Group__63337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__AttributesAssignment_6_in_rule__Command__Group__6__Impl3364 = new BitSet(new long[]{0x0000400000000182L});
    public static final BitSet FOLLOW_rule__Command__Group__7__Impl_in_rule__Command__Group__73395 = new BitSet(new long[]{0x0000400010400180L});
    public static final BitSet FOLLOW_rule__Command__Group__8_in_rule__Command__Group__73398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_7__0_in_rule__Command__Group__7__Impl3425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group__8__Impl_in_rule__Command__Group__83456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Command__Group__8__Impl3484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_3__0__Impl_in_rule__Command__Group_3__03533 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Command__Group_3__1_in_rule__Command__Group_3__03536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Command__Group_3__0__Impl3564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_3__1__Impl_in_rule__Command__Group_3__13595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__TargetAssignment_3_1_in_rule__Command__Group_3__1__Impl3622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_4__0__Impl_in_rule__Command__Group_4__03656 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Command__Group_4__1_in_rule__Command__Group_4__03659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Command__Group_4__0__Impl3687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_4__1__Impl_in_rule__Command__Group_4__13718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__AcceptableAssignment_4_1_in_rule__Command__Group_4__1__Impl3745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_7__0__Impl_in_rule__Command__Group_7__03779 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Command__Group_7__1_in_rule__Command__Group_7__03782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Command__Group_7__0__Impl3810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_7__1__Impl_in_rule__Command__Group_7__13841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__MessageAssignment_7_1_in_rule__Command__Group_7__1__Impl3868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandHandler__Group__0__Impl_in_rule__CommandHandler__Group__03902 = new BitSet(new long[]{0x0000000020000100L});
    public static final BitSet FOLLOW_rule__CommandHandler__Group__1_in_rule__CommandHandler__Group__03905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandHandler__DocAssignment_0_in_rule__CommandHandler__Group__0__Impl3932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandHandler__Group__1__Impl_in_rule__CommandHandler__Group__13963 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__CommandHandler__Group__2_in_rule__CommandHandler__Group__13966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__CommandHandler__Group__1__Impl3994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandHandler__Group__2__Impl_in_rule__CommandHandler__Group__24025 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__CommandHandler__Group__3_in_rule__CommandHandler__Group__24028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandHandler__NameAssignment_2_in_rule__CommandHandler__Group__2__Impl4055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandHandler__Group__3__Impl_in_rule__CommandHandler__Group__34085 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__CommandHandler__Group__4_in_rule__CommandHandler__Group__34088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__CommandHandler__Group__3__Impl4116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandHandler__Group__4__Impl_in_rule__CommandHandler__Group__44147 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_rule__CommandHandler__Group__5_in_rule__CommandHandler__Group__44150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandHandler__CommandsAssignment_4_in_rule__CommandHandler__Group__4__Impl4177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandHandler__Group__5__Impl_in_rule__CommandHandler__Group__54207 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_rule__CommandHandler__Group__6_in_rule__CommandHandler__Group__54210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandHandler__Group_5__0_in_rule__CommandHandler__Group__5__Impl4237 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__CommandHandler__Group__6__Impl_in_rule__CommandHandler__Group__64268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandHandler__Group_6__0_in_rule__CommandHandler__Group__6__Impl4295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandHandler__Group_5__0__Impl_in_rule__CommandHandler__Group_5__04340 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__CommandHandler__Group_5__1_in_rule__CommandHandler__Group_5__04343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__CommandHandler__Group_5__0__Impl4371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandHandler__Group_5__1__Impl_in_rule__CommandHandler__Group_5__14402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandHandler__CommandsAssignment_5_1_in_rule__CommandHandler__Group_5__1__Impl4429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandHandler__Group_6__0__Impl_in_rule__CommandHandler__Group_6__04463 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__CommandHandler__Group_6__1_in_rule__CommandHandler__Group_6__04466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__CommandHandler__Group_6__0__Impl4494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandHandler__Group_6__1__Impl_in_rule__CommandHandler__Group_6__14525 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__CommandHandler__Group_6__2_in_rule__CommandHandler__Group_6__14528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandHandler__AggregatesAssignment_6_1_in_rule__CommandHandler__Group_6__1__Impl4555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandHandler__Group_6__2__Impl_in_rule__CommandHandler__Group_6__24585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandHandler__Group_6_2__0_in_rule__CommandHandler__Group_6__2__Impl4612 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__CommandHandler__Group_6_2__0__Impl_in_rule__CommandHandler__Group_6_2__04649 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__CommandHandler__Group_6_2__1_in_rule__CommandHandler__Group_6_2__04652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__CommandHandler__Group_6_2__0__Impl4680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandHandler__Group_6_2__1__Impl_in_rule__CommandHandler__Group_6_2__14711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandHandler__AggregatesAssignment_6_2_1_in_rule__CommandHandler__Group_6_2__1__Impl4738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Projection__Group__0__Impl_in_rule__Projection__Group__04772 = new BitSet(new long[]{0x0000000200000100L});
    public static final BitSet FOLLOW_rule__Projection__Group__1_in_rule__Projection__Group__04775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Projection__DocAssignment_0_in_rule__Projection__Group__0__Impl4802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Projection__Group__1__Impl_in_rule__Projection__Group__14833 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Projection__Group__2_in_rule__Projection__Group__14836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Projection__Group__1__Impl4864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Projection__Group__2__Impl_in_rule__Projection__Group__24895 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Projection__Group__3_in_rule__Projection__Group__24898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Projection__NameAssignment_2_in_rule__Projection__Group__2__Impl4925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Projection__Group__3__Impl_in_rule__Projection__Group__34955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Projection__Group_3__0_in_rule__Projection__Group__3__Impl4982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Projection__Group_3__0__Impl_in_rule__Projection__Group_3__05021 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Projection__Group_3__1_in_rule__Projection__Group_3__05024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Projection__Group_3__0__Impl5052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Projection__Group_3__1__Impl_in_rule__Projection__Group_3__15083 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Projection__Group_3__2_in_rule__Projection__Group_3__15086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Projection__EventsAssignment_3_1_in_rule__Projection__Group_3__1__Impl5113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Projection__Group_3__2__Impl_in_rule__Projection__Group_3__25143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Projection__Group_3_2__0_in_rule__Projection__Group_3__2__Impl5170 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__Projection__Group_3_2__0__Impl_in_rule__Projection__Group_3_2__05207 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Projection__Group_3_2__1_in_rule__Projection__Group_3_2__05210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Projection__Group_3_2__0__Impl5238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Projection__Group_3_2__1__Impl_in_rule__Projection__Group_3_2__15269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Projection__EventsAssignment_3_2_1_in_rule__Projection__Group_3_2__1__Impl5296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group__0__Impl_in_rule__View__Group__05330 = new BitSet(new long[]{0x0000000A22000100L});
    public static final BitSet FOLLOW_rule__View__Group__1_in_rule__View__Group__05333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__DocAssignment_0_in_rule__View__Group__0__Impl5360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group__1__Impl_in_rule__View__Group__15391 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__View__Group__2_in_rule__View__Group__15394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__View__Group__1__Impl5422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group__2__Impl_in_rule__View__Group__25453 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__View__Group__3_in_rule__View__Group__25456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__NameAssignment_2_in_rule__View__Group__2__Impl5483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group__3__Impl_in_rule__View__Group__35513 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__View__Group__4_in_rule__View__Group__35516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__View__Group__3__Impl5544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__Group__4__Impl_in_rule__View__Group__45575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__View__ProjectionAssignment_4_in_rule__View__Group__4__Impl5602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group__0__Impl_in_rule__TypeMetaInfo__Group__05642 = new BitSet(new long[]{0x000001F000000000L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group__1_in_rule__TypeMetaInfo__Group__05645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group__1__Impl_in_rule__TypeMetaInfo__Group__15703 = new BitSet(new long[]{0x000001F000000000L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group__2_in_rule__TypeMetaInfo__Group__15706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group_1__0_in_rule__TypeMetaInfo__Group__1__Impl5733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group__2__Impl_in_rule__TypeMetaInfo__Group__25764 = new BitSet(new long[]{0x000001F000000000L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group__3_in_rule__TypeMetaInfo__Group__25767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group_2__0_in_rule__TypeMetaInfo__Group__2__Impl5794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group__3__Impl_in_rule__TypeMetaInfo__Group__35825 = new BitSet(new long[]{0x000001F000000000L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group__4_in_rule__TypeMetaInfo__Group__35828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group_3__0_in_rule__TypeMetaInfo__Group__3__Impl5855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group__4__Impl_in_rule__TypeMetaInfo__Group__45886 = new BitSet(new long[]{0x000001F000000000L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group__5_in_rule__TypeMetaInfo__Group__45889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group_4__0_in_rule__TypeMetaInfo__Group__4__Impl5916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group__5__Impl_in_rule__TypeMetaInfo__Group__55947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group_5__0_in_rule__TypeMetaInfo__Group__5__Impl5974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group_1__0__Impl_in_rule__TypeMetaInfo__Group_1__06017 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group_1__1_in_rule__TypeMetaInfo__Group_1__06020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__TypeMetaInfo__Group_1__0__Impl6048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group_1__1__Impl_in_rule__TypeMetaInfo__Group_1__16079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__SlabelAssignment_1_1_in_rule__TypeMetaInfo__Group_1__1__Impl6106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group_2__0__Impl_in_rule__TypeMetaInfo__Group_2__06140 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group_2__1_in_rule__TypeMetaInfo__Group_2__06143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__TypeMetaInfo__Group_2__0__Impl6171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group_2__1__Impl_in_rule__TypeMetaInfo__Group_2__16202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__LabelAssignment_2_1_in_rule__TypeMetaInfo__Group_2__1__Impl6229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group_3__0__Impl_in_rule__TypeMetaInfo__Group_3__06263 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group_3__1_in_rule__TypeMetaInfo__Group_3__06266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__TypeMetaInfo__Group_3__0__Impl6294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group_3__1__Impl_in_rule__TypeMetaInfo__Group_3__16325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__TooltipAssignment_3_1_in_rule__TypeMetaInfo__Group_3__1__Impl6352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group_4__0__Impl_in_rule__TypeMetaInfo__Group_4__06386 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group_4__1_in_rule__TypeMetaInfo__Group_4__06389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__TypeMetaInfo__Group_4__0__Impl6417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group_4__1__Impl_in_rule__TypeMetaInfo__Group_4__16448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__PromptAssignment_4_1_in_rule__TypeMetaInfo__Group_4__1__Impl6475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group_5__0__Impl_in_rule__TypeMetaInfo__Group_5__06509 = new BitSet(new long[]{0x0000800000006270L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group_5__1_in_rule__TypeMetaInfo__Group_5__06512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__TypeMetaInfo__Group_5__0__Impl6540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__Group_5__1__Impl_in_rule__TypeMetaInfo__Group_5__16571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeMetaInfo__ExamplesAssignment_5_1_in_rule__TypeMetaInfo__Group_5__1__Impl6598 = new BitSet(new long[]{0x0000800000006272L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__06633 = new BitSet(new long[]{0x0000400000000180L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__06636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__DocAssignment_0_in_rule__Attribute__Group__0__Impl6663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__16694 = new BitSet(new long[]{0x0000400000000180L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__16697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NullableAssignment_1_in_rule__Attribute__Group__1__Impl6724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__26755 = new BitSet(new long[]{0x0000200000000080L});
    public static final BitSet FOLLOW_rule__Attribute__Group__3_in_rule__Attribute__Group__26758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__TypeAssignment_2_in_rule__Attribute__Group__2__Impl6785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__3__Impl_in_rule__Attribute__Group__36815 = new BitSet(new long[]{0x0000200000000080L});
    public static final BitSet FOLLOW_rule__Attribute__Group__4_in_rule__Attribute__Group__36818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__MultiplicityAssignment_3_in_rule__Attribute__Group__3__Impl6845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__4__Impl_in_rule__Attribute__Group__46876 = new BitSet(new long[]{0x0000020000200000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__5_in_rule__Attribute__Group__46879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NameAssignment_4_in_rule__Attribute__Group__4__Impl6906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__5__Impl_in_rule__Attribute__Group__56936 = new BitSet(new long[]{0x0000020000200000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__6_in_rule__Attribute__Group__56939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__InvariantsAssignment_5_in_rule__Attribute__Group__5__Impl6966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__6__Impl_in_rule__Attribute__Group__66997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__OverriddenAssignment_6_in_rule__Attribute__Group__6__Impl7024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Invariants__Group__0__Impl_in_rule__Invariants__Group__07069 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Invariants__Group__1_in_rule__Invariants__Group__07072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Invariants__Group__0__Impl7100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Invariants__Group__1__Impl_in_rule__Invariants__Group__17131 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Invariants__Group__2_in_rule__Invariants__Group__17134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Invariants__ConstraintInstancesAssignment_1_in_rule__Invariants__Group__1__Impl7161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Invariants__Group__2__Impl_in_rule__Invariants__Group__27191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Invariants__Group_2__0_in_rule__Invariants__Group__2__Impl7218 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__Invariants__Group_2__0__Impl_in_rule__Invariants__Group_2__07255 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Invariants__Group_2__1_in_rule__Invariants__Group_2__07258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Invariants__Group_2__0__Impl7286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Invariants__Group_2__1__Impl_in_rule__Invariants__Group_2__17317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Invariants__ConstraintInstancesAssignment_2_1_in_rule__Invariants__Group_2__1__Impl7344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OverriddenTypeMetaInfo__Group__0__Impl_in_rule__OverriddenTypeMetaInfo__Group__07378 = new BitSet(new long[]{0x000001F000000000L});
    public static final BitSet FOLLOW_rule__OverriddenTypeMetaInfo__Group__1_in_rule__OverriddenTypeMetaInfo__Group__07381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__OverriddenTypeMetaInfo__Group__0__Impl7409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OverriddenTypeMetaInfo__Group__1__Impl_in_rule__OverriddenTypeMetaInfo__Group__17440 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__OverriddenTypeMetaInfo__Group__2_in_rule__OverriddenTypeMetaInfo__Group__17443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OverriddenTypeMetaInfo__MetaInfoAssignment_1_in_rule__OverriddenTypeMetaInfo__Group__1__Impl7470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OverriddenTypeMetaInfo__Group__2__Impl_in_rule__OverriddenTypeMetaInfo__Group__27500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__OverriddenTypeMetaInfo__Group__2__Impl7528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintInstance__Group__0__Impl_in_rule__ConstraintInstance__Group__07565 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__ConstraintInstance__Group__1_in_rule__ConstraintInstance__Group__07568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintInstance__ConstraintAssignment_0_in_rule__ConstraintInstance__Group__0__Impl7595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintInstance__Group__1__Impl_in_rule__ConstraintInstance__Group__17625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintInstance__Group_1__0_in_rule__ConstraintInstance__Group__1__Impl7652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintInstance__Group_1__0__Impl_in_rule__ConstraintInstance__Group_1__07687 = new BitSet(new long[]{0x0000800000006270L});
    public static final BitSet FOLLOW_rule__ConstraintInstance__Group_1__1_in_rule__ConstraintInstance__Group_1__07690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__ConstraintInstance__Group_1__0__Impl7718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintInstance__Group_1__1__Impl_in_rule__ConstraintInstance__Group_1__17749 = new BitSet(new long[]{0x0000080080000000L});
    public static final BitSet FOLLOW_rule__ConstraintInstance__Group_1__2_in_rule__ConstraintInstance__Group_1__17752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintInstance__ParamsAssignment_1_1_in_rule__ConstraintInstance__Group_1__1__Impl7779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintInstance__Group_1__2__Impl_in_rule__ConstraintInstance__Group_1__27809 = new BitSet(new long[]{0x0000080080000000L});
    public static final BitSet FOLLOW_rule__ConstraintInstance__Group_1__3_in_rule__ConstraintInstance__Group_1__27812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintInstance__Group_1_2__0_in_rule__ConstraintInstance__Group_1__2__Impl7839 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__ConstraintInstance__Group_1__3__Impl_in_rule__ConstraintInstance__Group_1__37870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__ConstraintInstance__Group_1__3__Impl7898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintInstance__Group_1_2__0__Impl_in_rule__ConstraintInstance__Group_1_2__07937 = new BitSet(new long[]{0x0000800000006270L});
    public static final BitSet FOLLOW_rule__ConstraintInstance__Group_1_2__1_in_rule__ConstraintInstance__Group_1_2__07940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ConstraintInstance__Group_1_2__0__Impl7968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintInstance__Group_1_2__1__Impl_in_rule__ConstraintInstance__Group_1_2__17999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintInstance__ParamsAssignment_1_2_1_in_rule__ConstraintInstance__Group_1_2__1__Impl8026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanLiteral__Group__0__Impl_in_rule__BooleanLiteral__Group__08060 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__BooleanLiteral__Group__1_in_rule__BooleanLiteral__Group__08063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanLiteral__Group__1__Impl_in_rule__BooleanLiteral__Group__18121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanLiteral__ValueAssignment_1_in_rule__BooleanLiteral__Group__1__Impl8148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NullLiteral__Group__0__Impl_in_rule__NullLiteral__Group__08182 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__NullLiteral__Group__1_in_rule__NullLiteral__Group__08185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NullLiteral__Group__1__Impl_in_rule__NullLiteral__Group__18243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NullLiteral__ValueAssignment_1_in_rule__NullLiteral__Group__1__Impl8270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberLiteral__Group__0__Impl_in_rule__NumberLiteral__Group__08304 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__NumberLiteral__Group__1_in_rule__NumberLiteral__Group__08307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberLiteral__Group__1__Impl_in_rule__NumberLiteral__Group__18365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberLiteral__ValueAssignment_1_in_rule__NumberLiteral__Group__1__Impl8392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__Group__0__Impl_in_rule__StringLiteral__Group__08426 = new BitSet(new long[]{0x0000800000006270L});
    public static final BitSet FOLLOW_rule__StringLiteral__Group__1_in_rule__StringLiteral__Group__08429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__Group__1__Impl_in_rule__StringLiteral__Group__18487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__ValueAssignment_1_in_rule__StringLiteral__Group__1__Impl8514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__08548 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__08551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl8578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__18607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl8634 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__08669 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__08672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__FQN__Group_1__0__Impl8700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__18731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl8758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQNWithWildcard__Group__0__Impl_in_rule__FQNWithWildcard__Group__08791 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__FQNWithWildcard__Group__1_in_rule__FQNWithWildcard__Group__08794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__FQNWithWildcard__Group__0__Impl8821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQNWithWildcard__Group__1__Impl_in_rule__FQNWithWildcard__Group__18850 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__FQNWithWildcard__Group__2_in_rule__FQNWithWildcard__Group__18853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__FQNWithWildcard__Group__1__Impl8881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQNWithWildcard__Group__2__Impl_in_rule__FQNWithWildcard__Group__28912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__FQNWithWildcard__Group__2__Impl8940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Group_1__0__Impl_in_rule__Number__Group_1__08977 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__Number__Group_1__1_in_rule__Number__Group_1__08980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Alternatives_1_0_in_rule__Number__Group_1__0__Impl9007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Group_1__1__Impl_in_rule__Number__Group_1__19037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Group_1_1__0_in_rule__Number__Group_1__1__Impl9064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Group_1_1__0__Impl_in_rule__Number__Group_1_1__09099 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__Number__Group_1_1__1_in_rule__Number__Group_1_1__09102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Number__Group_1_1__0__Impl9130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Group_1_1__1__Impl_in_rule__Number__Group_1_1__19161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Alternatives_1_1_1_in_rule__Number__Group_1_1__1__Impl9188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContext_in_rule__DomainModel__ContextsAssignment9227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Context__NameAssignment_19258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespace_in_rule__Context__NamespacesAssignment_39289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Namespace__NameAssignment_19320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Namespace__ImportsAssignment_39351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_rule__Namespace__ElementsAssignment_49382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAlternatives_1_0_in_rule__Import__ImportedNamespaceAssignment_19413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Duration__TimeAssignment_09446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeUnit_in_rule__Duration__UnitAssignment_19477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_rule__Command__DocAssignment_09508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Command__NameAssignment_29539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Command__TargetAssignment_3_19574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDuration_in_rule__Command__AcceptableAssignment_4_19609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Command__AttributesAssignment_69640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Command__MessageAssignment_7_19671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_rule__CommandHandler__DocAssignment_09702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CommandHandler__NameAssignment_29733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CommandHandler__CommandsAssignment_49768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CommandHandler__CommandsAssignment_5_19807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__CommandHandler__AggregatesAssignment_6_19846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__CommandHandler__AggregatesAssignment_6_2_19885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_rule__Projection__DocAssignment_09920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Projection__NameAssignment_29951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Projection__EventsAssignment_3_19986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Projection__EventsAssignment_3_2_110025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_rule__View__DocAssignment_010060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__View__NameAssignment_210091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__View__ProjectionAssignment_410126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TypeMetaInfo__SlabelAssignment_1_110161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TypeMetaInfo__LabelAssignment_2_110192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TypeMetaInfo__TooltipAssignment_3_110223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TypeMetaInfo__PromptAssignment_4_110254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__TypeMetaInfo__ExamplesAssignment_5_110285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOC_in_rule__Attribute__DocAssignment_010316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Attribute__NullableAssignment_110352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__TypeAssignment_210395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Attribute__MultiplicityAssignment_310435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_410474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvariants_in_rule__Attribute__InvariantsAssignment_510505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOverriddenTypeMetaInfo_in_rule__Attribute__OverriddenAssignment_610536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraintInstance_in_rule__Invariants__ConstraintInstancesAssignment_110567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraintInstance_in_rule__Invariants__ConstraintInstancesAssignment_2_110598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeMetaInfo_in_rule__OverriddenTypeMetaInfo__MetaInfoAssignment_110629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ConstraintInstance__ConstraintAssignment_010664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__ConstraintInstance__ParamsAssignment_1_110699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__ConstraintInstance__ParamsAssignment_1_2_110730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanLiteral__ValueAlternatives_1_0_in_rule__BooleanLiteral__ValueAssignment_110761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__NullLiteral__ValueAssignment_110799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_rule__NumberLiteral__ValueAssignment_110838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment_110869 = new BitSet(new long[]{0x0000000000000002L});

}