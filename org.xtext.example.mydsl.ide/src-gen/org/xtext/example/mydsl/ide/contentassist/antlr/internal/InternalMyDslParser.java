package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'line'", "'bar'", "'pie'", "'red'", "'blue'", "'green'", "'pink'", "'P'", "':'", "'{'", "'donner'", "'}'", "'colonne'", "'graphe'", "','", "'data'", "'='", "'type'", "'bagColor'", "'label'", "'color'", "'('", "')'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


    	private MyDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleProgramme"
    // InternalMyDsl.g:53:1: entryRuleProgramme : ruleProgramme EOF ;
    public final void entryRuleProgramme() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleProgramme EOF )
            // InternalMyDsl.g:55:1: ruleProgramme EOF
            {
             before(grammarAccess.getProgrammeRule()); 
            pushFollow(FOLLOW_1);
            ruleProgramme();

            state._fsp--;

             after(grammarAccess.getProgrammeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProgramme"


    // $ANTLR start "ruleProgramme"
    // InternalMyDsl.g:62:1: ruleProgramme : ( ( rule__Programme__Group__0 ) ) ;
    public final void ruleProgramme() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Programme__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__Programme__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Programme__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__Programme__Group__0 )
            {
             before(grammarAccess.getProgrammeAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__Programme__Group__0 )
            // InternalMyDsl.g:69:4: rule__Programme__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Programme__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProgrammeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProgramme"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:78:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleEString EOF )
            // InternalMyDsl.g:80:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:87:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__EString__Alternatives ) )
            // InternalMyDsl.g:93:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalMyDsl.g:94:3: ( rule__EString__Alternatives )
            // InternalMyDsl.g:94:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleGraphe"
    // InternalMyDsl.g:103:1: entryRuleGraphe : ruleGraphe EOF ;
    public final void entryRuleGraphe() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleGraphe EOF )
            // InternalMyDsl.g:105:1: ruleGraphe EOF
            {
             before(grammarAccess.getGrapheRule()); 
            pushFollow(FOLLOW_1);
            ruleGraphe();

            state._fsp--;

             after(grammarAccess.getGrapheRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGraphe"


    // $ANTLR start "ruleGraphe"
    // InternalMyDsl.g:112:1: ruleGraphe : ( ( rule__Graphe__Group__0 ) ) ;
    public final void ruleGraphe() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Graphe__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Graphe__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Graphe__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Graphe__Group__0 )
            {
             before(grammarAccess.getGrapheAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Graphe__Group__0 )
            // InternalMyDsl.g:119:4: rule__Graphe__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Graphe__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGrapheAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphe"


    // $ANTLR start "entryRuleColonne"
    // InternalMyDsl.g:128:1: entryRuleColonne : ruleColonne EOF ;
    public final void entryRuleColonne() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleColonne EOF )
            // InternalMyDsl.g:130:1: ruleColonne EOF
            {
             before(grammarAccess.getColonneRule()); 
            pushFollow(FOLLOW_1);
            ruleColonne();

            state._fsp--;

             after(grammarAccess.getColonneRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleColonne"


    // $ANTLR start "ruleColonne"
    // InternalMyDsl.g:137:1: ruleColonne : ( ( rule__Colonne__Group__0 ) ) ;
    public final void ruleColonne() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Colonne__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Colonne__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Colonne__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__Colonne__Group__0 )
            {
             before(grammarAccess.getColonneAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__Colonne__Group__0 )
            // InternalMyDsl.g:144:4: rule__Colonne__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Colonne__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getColonneAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColonne"


    // $ANTLR start "entryRuleDonner"
    // InternalMyDsl.g:153:1: entryRuleDonner : ruleDonner EOF ;
    public final void entryRuleDonner() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleDonner EOF )
            // InternalMyDsl.g:155:1: ruleDonner EOF
            {
             before(grammarAccess.getDonnerRule()); 
            pushFollow(FOLLOW_1);
            ruleDonner();

            state._fsp--;

             after(grammarAccess.getDonnerRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDonner"


    // $ANTLR start "ruleDonner"
    // InternalMyDsl.g:162:1: ruleDonner : ( ( rule__Donner__Group__0 ) ) ;
    public final void ruleDonner() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Donner__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Donner__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Donner__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__Donner__Group__0 )
            {
             before(grammarAccess.getDonnerAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__Donner__Group__0 )
            // InternalMyDsl.g:169:4: rule__Donner__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Donner__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDonnerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDonner"


    // $ANTLR start "ruleTypeGraphe"
    // InternalMyDsl.g:178:1: ruleTypeGraphe : ( ( rule__TypeGraphe__Alternatives ) ) ;
    public final void ruleTypeGraphe() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:182:1: ( ( ( rule__TypeGraphe__Alternatives ) ) )
            // InternalMyDsl.g:183:2: ( ( rule__TypeGraphe__Alternatives ) )
            {
            // InternalMyDsl.g:183:2: ( ( rule__TypeGraphe__Alternatives ) )
            // InternalMyDsl.g:184:3: ( rule__TypeGraphe__Alternatives )
            {
             before(grammarAccess.getTypeGrapheAccess().getAlternatives()); 
            // InternalMyDsl.g:185:3: ( rule__TypeGraphe__Alternatives )
            // InternalMyDsl.g:185:4: rule__TypeGraphe__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TypeGraphe__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeGrapheAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeGraphe"


    // $ANTLR start "ruleCouleurs"
    // InternalMyDsl.g:194:1: ruleCouleurs : ( ( rule__Couleurs__Alternatives ) ) ;
    public final void ruleCouleurs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:198:1: ( ( ( rule__Couleurs__Alternatives ) ) )
            // InternalMyDsl.g:199:2: ( ( rule__Couleurs__Alternatives ) )
            {
            // InternalMyDsl.g:199:2: ( ( rule__Couleurs__Alternatives ) )
            // InternalMyDsl.g:200:3: ( rule__Couleurs__Alternatives )
            {
             before(grammarAccess.getCouleursAccess().getAlternatives()); 
            // InternalMyDsl.g:201:3: ( rule__Couleurs__Alternatives )
            // InternalMyDsl.g:201:4: rule__Couleurs__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Couleurs__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCouleursAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCouleurs"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalMyDsl.g:209:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:213:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:214:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:214:2: ( RULE_STRING )
                    // InternalMyDsl.g:215:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:220:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:220:2: ( RULE_ID )
                    // InternalMyDsl.g:221:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__TypeGraphe__Alternatives"
    // InternalMyDsl.g:230:1: rule__TypeGraphe__Alternatives : ( ( ( 'line' ) ) | ( ( 'bar' ) ) | ( ( 'pie' ) ) );
    public final void rule__TypeGraphe__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:234:1: ( ( ( 'line' ) ) | ( ( 'bar' ) ) | ( ( 'pie' ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:235:2: ( ( 'line' ) )
                    {
                    // InternalMyDsl.g:235:2: ( ( 'line' ) )
                    // InternalMyDsl.g:236:3: ( 'line' )
                    {
                     before(grammarAccess.getTypeGrapheAccess().getLineEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:237:3: ( 'line' )
                    // InternalMyDsl.g:237:4: 'line'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeGrapheAccess().getLineEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:241:2: ( ( 'bar' ) )
                    {
                    // InternalMyDsl.g:241:2: ( ( 'bar' ) )
                    // InternalMyDsl.g:242:3: ( 'bar' )
                    {
                     before(grammarAccess.getTypeGrapheAccess().getBarEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:243:3: ( 'bar' )
                    // InternalMyDsl.g:243:4: 'bar'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeGrapheAccess().getBarEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:247:2: ( ( 'pie' ) )
                    {
                    // InternalMyDsl.g:247:2: ( ( 'pie' ) )
                    // InternalMyDsl.g:248:3: ( 'pie' )
                    {
                     before(grammarAccess.getTypeGrapheAccess().getPieEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:249:3: ( 'pie' )
                    // InternalMyDsl.g:249:4: 'pie'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeGrapheAccess().getPieEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__TypeGraphe__Alternatives"


    // $ANTLR start "rule__Couleurs__Alternatives"
    // InternalMyDsl.g:257:1: rule__Couleurs__Alternatives : ( ( ( 'red' ) ) | ( ( 'blue' ) ) | ( ( 'green' ) ) | ( ( 'pink' ) ) );
    public final void rule__Couleurs__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:261:1: ( ( ( 'red' ) ) | ( ( 'blue' ) ) | ( ( 'green' ) ) | ( ( 'pink' ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt3=1;
                }
                break;
            case 15:
                {
                alt3=2;
                }
                break;
            case 16:
                {
                alt3=3;
                }
                break;
            case 17:
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
                    // InternalMyDsl.g:262:2: ( ( 'red' ) )
                    {
                    // InternalMyDsl.g:262:2: ( ( 'red' ) )
                    // InternalMyDsl.g:263:3: ( 'red' )
                    {
                     before(grammarAccess.getCouleursAccess().getRedEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:264:3: ( 'red' )
                    // InternalMyDsl.g:264:4: 'red'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getCouleursAccess().getRedEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:268:2: ( ( 'blue' ) )
                    {
                    // InternalMyDsl.g:268:2: ( ( 'blue' ) )
                    // InternalMyDsl.g:269:3: ( 'blue' )
                    {
                     before(grammarAccess.getCouleursAccess().getBlueEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:270:3: ( 'blue' )
                    // InternalMyDsl.g:270:4: 'blue'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getCouleursAccess().getBlueEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:274:2: ( ( 'green' ) )
                    {
                    // InternalMyDsl.g:274:2: ( ( 'green' ) )
                    // InternalMyDsl.g:275:3: ( 'green' )
                    {
                     before(grammarAccess.getCouleursAccess().getGreenEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:276:3: ( 'green' )
                    // InternalMyDsl.g:276:4: 'green'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getCouleursAccess().getGreenEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:280:2: ( ( 'pink' ) )
                    {
                    // InternalMyDsl.g:280:2: ( ( 'pink' ) )
                    // InternalMyDsl.g:281:3: ( 'pink' )
                    {
                     before(grammarAccess.getCouleursAccess().getPinkEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:282:3: ( 'pink' )
                    // InternalMyDsl.g:282:4: 'pink'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getCouleursAccess().getPinkEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__Couleurs__Alternatives"


    // $ANTLR start "rule__Programme__Group__0"
    // InternalMyDsl.g:290:1: rule__Programme__Group__0 : rule__Programme__Group__0__Impl rule__Programme__Group__1 ;
    public final void rule__Programme__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:294:1: ( rule__Programme__Group__0__Impl rule__Programme__Group__1 )
            // InternalMyDsl.g:295:2: rule__Programme__Group__0__Impl rule__Programme__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Programme__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Programme__Group__1();

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
    // $ANTLR end "rule__Programme__Group__0"


    // $ANTLR start "rule__Programme__Group__0__Impl"
    // InternalMyDsl.g:302:1: rule__Programme__Group__0__Impl : ( () ) ;
    public final void rule__Programme__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:306:1: ( ( () ) )
            // InternalMyDsl.g:307:1: ( () )
            {
            // InternalMyDsl.g:307:1: ( () )
            // InternalMyDsl.g:308:2: ()
            {
             before(grammarAccess.getProgrammeAccess().getProgrammeAction_0()); 
            // InternalMyDsl.g:309:2: ()
            // InternalMyDsl.g:309:3: 
            {
            }

             after(grammarAccess.getProgrammeAccess().getProgrammeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programme__Group__0__Impl"


    // $ANTLR start "rule__Programme__Group__1"
    // InternalMyDsl.g:317:1: rule__Programme__Group__1 : rule__Programme__Group__1__Impl rule__Programme__Group__2 ;
    public final void rule__Programme__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:321:1: ( rule__Programme__Group__1__Impl rule__Programme__Group__2 )
            // InternalMyDsl.g:322:2: rule__Programme__Group__1__Impl rule__Programme__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Programme__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Programme__Group__2();

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
    // $ANTLR end "rule__Programme__Group__1"


    // $ANTLR start "rule__Programme__Group__1__Impl"
    // InternalMyDsl.g:329:1: rule__Programme__Group__1__Impl : ( 'P' ) ;
    public final void rule__Programme__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:333:1: ( ( 'P' ) )
            // InternalMyDsl.g:334:1: ( 'P' )
            {
            // InternalMyDsl.g:334:1: ( 'P' )
            // InternalMyDsl.g:335:2: 'P'
            {
             before(grammarAccess.getProgrammeAccess().getPKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getProgrammeAccess().getPKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programme__Group__1__Impl"


    // $ANTLR start "rule__Programme__Group__2"
    // InternalMyDsl.g:344:1: rule__Programme__Group__2 : rule__Programme__Group__2__Impl rule__Programme__Group__3 ;
    public final void rule__Programme__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:348:1: ( rule__Programme__Group__2__Impl rule__Programme__Group__3 )
            // InternalMyDsl.g:349:2: rule__Programme__Group__2__Impl rule__Programme__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Programme__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Programme__Group__3();

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
    // $ANTLR end "rule__Programme__Group__2"


    // $ANTLR start "rule__Programme__Group__2__Impl"
    // InternalMyDsl.g:356:1: rule__Programme__Group__2__Impl : ( ':' ) ;
    public final void rule__Programme__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:360:1: ( ( ':' ) )
            // InternalMyDsl.g:361:1: ( ':' )
            {
            // InternalMyDsl.g:361:1: ( ':' )
            // InternalMyDsl.g:362:2: ':'
            {
             before(grammarAccess.getProgrammeAccess().getColonKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getProgrammeAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programme__Group__2__Impl"


    // $ANTLR start "rule__Programme__Group__3"
    // InternalMyDsl.g:371:1: rule__Programme__Group__3 : rule__Programme__Group__3__Impl rule__Programme__Group__4 ;
    public final void rule__Programme__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:375:1: ( rule__Programme__Group__3__Impl rule__Programme__Group__4 )
            // InternalMyDsl.g:376:2: rule__Programme__Group__3__Impl rule__Programme__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Programme__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Programme__Group__4();

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
    // $ANTLR end "rule__Programme__Group__3"


    // $ANTLR start "rule__Programme__Group__3__Impl"
    // InternalMyDsl.g:383:1: rule__Programme__Group__3__Impl : ( ( rule__Programme__NameAssignment_3 ) ) ;
    public final void rule__Programme__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:387:1: ( ( ( rule__Programme__NameAssignment_3 ) ) )
            // InternalMyDsl.g:388:1: ( ( rule__Programme__NameAssignment_3 ) )
            {
            // InternalMyDsl.g:388:1: ( ( rule__Programme__NameAssignment_3 ) )
            // InternalMyDsl.g:389:2: ( rule__Programme__NameAssignment_3 )
            {
             before(grammarAccess.getProgrammeAccess().getNameAssignment_3()); 
            // InternalMyDsl.g:390:2: ( rule__Programme__NameAssignment_3 )
            // InternalMyDsl.g:390:3: rule__Programme__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Programme__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getProgrammeAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programme__Group__3__Impl"


    // $ANTLR start "rule__Programme__Group__4"
    // InternalMyDsl.g:398:1: rule__Programme__Group__4 : rule__Programme__Group__4__Impl rule__Programme__Group__5 ;
    public final void rule__Programme__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:402:1: ( rule__Programme__Group__4__Impl rule__Programme__Group__5 )
            // InternalMyDsl.g:403:2: rule__Programme__Group__4__Impl rule__Programme__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Programme__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Programme__Group__5();

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
    // $ANTLR end "rule__Programme__Group__4"


    // $ANTLR start "rule__Programme__Group__4__Impl"
    // InternalMyDsl.g:410:1: rule__Programme__Group__4__Impl : ( '{' ) ;
    public final void rule__Programme__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:414:1: ( ( '{' ) )
            // InternalMyDsl.g:415:1: ( '{' )
            {
            // InternalMyDsl.g:415:1: ( '{' )
            // InternalMyDsl.g:416:2: '{'
            {
             before(grammarAccess.getProgrammeAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getProgrammeAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programme__Group__4__Impl"


    // $ANTLR start "rule__Programme__Group__5"
    // InternalMyDsl.g:425:1: rule__Programme__Group__5 : rule__Programme__Group__5__Impl rule__Programme__Group__6 ;
    public final void rule__Programme__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:429:1: ( rule__Programme__Group__5__Impl rule__Programme__Group__6 )
            // InternalMyDsl.g:430:2: rule__Programme__Group__5__Impl rule__Programme__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Programme__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Programme__Group__6();

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
    // $ANTLR end "rule__Programme__Group__5"


    // $ANTLR start "rule__Programme__Group__5__Impl"
    // InternalMyDsl.g:437:1: rule__Programme__Group__5__Impl : ( 'donner' ) ;
    public final void rule__Programme__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:441:1: ( ( 'donner' ) )
            // InternalMyDsl.g:442:1: ( 'donner' )
            {
            // InternalMyDsl.g:442:1: ( 'donner' )
            // InternalMyDsl.g:443:2: 'donner'
            {
             before(grammarAccess.getProgrammeAccess().getDonnerKeyword_5()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getProgrammeAccess().getDonnerKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programme__Group__5__Impl"


    // $ANTLR start "rule__Programme__Group__6"
    // InternalMyDsl.g:452:1: rule__Programme__Group__6 : rule__Programme__Group__6__Impl rule__Programme__Group__7 ;
    public final void rule__Programme__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:456:1: ( rule__Programme__Group__6__Impl rule__Programme__Group__7 )
            // InternalMyDsl.g:457:2: rule__Programme__Group__6__Impl rule__Programme__Group__7
            {
            pushFollow(FOLLOW_5);
            rule__Programme__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Programme__Group__7();

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
    // $ANTLR end "rule__Programme__Group__6"


    // $ANTLR start "rule__Programme__Group__6__Impl"
    // InternalMyDsl.g:464:1: rule__Programme__Group__6__Impl : ( '{' ) ;
    public final void rule__Programme__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:468:1: ( ( '{' ) )
            // InternalMyDsl.g:469:1: ( '{' )
            {
            // InternalMyDsl.g:469:1: ( '{' )
            // InternalMyDsl.g:470:2: '{'
            {
             before(grammarAccess.getProgrammeAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getProgrammeAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programme__Group__6__Impl"


    // $ANTLR start "rule__Programme__Group__7"
    // InternalMyDsl.g:479:1: rule__Programme__Group__7 : rule__Programme__Group__7__Impl rule__Programme__Group__8 ;
    public final void rule__Programme__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:483:1: ( rule__Programme__Group__7__Impl rule__Programme__Group__8 )
            // InternalMyDsl.g:484:2: rule__Programme__Group__7__Impl rule__Programme__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__Programme__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Programme__Group__8();

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
    // $ANTLR end "rule__Programme__Group__7"


    // $ANTLR start "rule__Programme__Group__7__Impl"
    // InternalMyDsl.g:491:1: rule__Programme__Group__7__Impl : ( ( ( rule__Programme__DonnerAssignment_7 ) ) ( ( rule__Programme__DonnerAssignment_7 )* ) ) ;
    public final void rule__Programme__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:495:1: ( ( ( ( rule__Programme__DonnerAssignment_7 ) ) ( ( rule__Programme__DonnerAssignment_7 )* ) ) )
            // InternalMyDsl.g:496:1: ( ( ( rule__Programme__DonnerAssignment_7 ) ) ( ( rule__Programme__DonnerAssignment_7 )* ) )
            {
            // InternalMyDsl.g:496:1: ( ( ( rule__Programme__DonnerAssignment_7 ) ) ( ( rule__Programme__DonnerAssignment_7 )* ) )
            // InternalMyDsl.g:497:2: ( ( rule__Programme__DonnerAssignment_7 ) ) ( ( rule__Programme__DonnerAssignment_7 )* )
            {
            // InternalMyDsl.g:497:2: ( ( rule__Programme__DonnerAssignment_7 ) )
            // InternalMyDsl.g:498:3: ( rule__Programme__DonnerAssignment_7 )
            {
             before(grammarAccess.getProgrammeAccess().getDonnerAssignment_7()); 
            // InternalMyDsl.g:499:3: ( rule__Programme__DonnerAssignment_7 )
            // InternalMyDsl.g:499:4: rule__Programme__DonnerAssignment_7
            {
            pushFollow(FOLLOW_9);
            rule__Programme__DonnerAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getProgrammeAccess().getDonnerAssignment_7()); 

            }

            // InternalMyDsl.g:502:2: ( ( rule__Programme__DonnerAssignment_7 )* )
            // InternalMyDsl.g:503:3: ( rule__Programme__DonnerAssignment_7 )*
            {
             before(grammarAccess.getProgrammeAccess().getDonnerAssignment_7()); 
            // InternalMyDsl.g:504:3: ( rule__Programme__DonnerAssignment_7 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_STRING && LA4_0<=RULE_ID)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:504:4: rule__Programme__DonnerAssignment_7
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Programme__DonnerAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getProgrammeAccess().getDonnerAssignment_7()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programme__Group__7__Impl"


    // $ANTLR start "rule__Programme__Group__8"
    // InternalMyDsl.g:513:1: rule__Programme__Group__8 : rule__Programme__Group__8__Impl rule__Programme__Group__9 ;
    public final void rule__Programme__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:517:1: ( rule__Programme__Group__8__Impl rule__Programme__Group__9 )
            // InternalMyDsl.g:518:2: rule__Programme__Group__8__Impl rule__Programme__Group__9
            {
            pushFollow(FOLLOW_8);
            rule__Programme__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Programme__Group__9();

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
    // $ANTLR end "rule__Programme__Group__8"


    // $ANTLR start "rule__Programme__Group__8__Impl"
    // InternalMyDsl.g:525:1: rule__Programme__Group__8__Impl : ( ( rule__Programme__Group_8__0 )* ) ;
    public final void rule__Programme__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:529:1: ( ( ( rule__Programme__Group_8__0 )* ) )
            // InternalMyDsl.g:530:1: ( ( rule__Programme__Group_8__0 )* )
            {
            // InternalMyDsl.g:530:1: ( ( rule__Programme__Group_8__0 )* )
            // InternalMyDsl.g:531:2: ( rule__Programme__Group_8__0 )*
            {
             before(grammarAccess.getProgrammeAccess().getGroup_8()); 
            // InternalMyDsl.g:532:2: ( rule__Programme__Group_8__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==25) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:532:3: rule__Programme__Group_8__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Programme__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getProgrammeAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programme__Group__8__Impl"


    // $ANTLR start "rule__Programme__Group__9"
    // InternalMyDsl.g:540:1: rule__Programme__Group__9 : rule__Programme__Group__9__Impl rule__Programme__Group__10 ;
    public final void rule__Programme__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:544:1: ( rule__Programme__Group__9__Impl rule__Programme__Group__10 )
            // InternalMyDsl.g:545:2: rule__Programme__Group__9__Impl rule__Programme__Group__10
            {
            pushFollow(FOLLOW_11);
            rule__Programme__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Programme__Group__10();

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
    // $ANTLR end "rule__Programme__Group__9"


    // $ANTLR start "rule__Programme__Group__9__Impl"
    // InternalMyDsl.g:552:1: rule__Programme__Group__9__Impl : ( '}' ) ;
    public final void rule__Programme__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:556:1: ( ( '}' ) )
            // InternalMyDsl.g:557:1: ( '}' )
            {
            // InternalMyDsl.g:557:1: ( '}' )
            // InternalMyDsl.g:558:2: '}'
            {
             before(grammarAccess.getProgrammeAccess().getRightCurlyBracketKeyword_9()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getProgrammeAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programme__Group__9__Impl"


    // $ANTLR start "rule__Programme__Group__10"
    // InternalMyDsl.g:567:1: rule__Programme__Group__10 : rule__Programme__Group__10__Impl rule__Programme__Group__11 ;
    public final void rule__Programme__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:571:1: ( rule__Programme__Group__10__Impl rule__Programme__Group__11 )
            // InternalMyDsl.g:572:2: rule__Programme__Group__10__Impl rule__Programme__Group__11
            {
            pushFollow(FOLLOW_6);
            rule__Programme__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Programme__Group__11();

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
    // $ANTLR end "rule__Programme__Group__10"


    // $ANTLR start "rule__Programme__Group__10__Impl"
    // InternalMyDsl.g:579:1: rule__Programme__Group__10__Impl : ( 'colonne' ) ;
    public final void rule__Programme__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:583:1: ( ( 'colonne' ) )
            // InternalMyDsl.g:584:1: ( 'colonne' )
            {
            // InternalMyDsl.g:584:1: ( 'colonne' )
            // InternalMyDsl.g:585:2: 'colonne'
            {
             before(grammarAccess.getProgrammeAccess().getColonneKeyword_10()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getProgrammeAccess().getColonneKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programme__Group__10__Impl"


    // $ANTLR start "rule__Programme__Group__11"
    // InternalMyDsl.g:594:1: rule__Programme__Group__11 : rule__Programme__Group__11__Impl rule__Programme__Group__12 ;
    public final void rule__Programme__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:598:1: ( rule__Programme__Group__11__Impl rule__Programme__Group__12 )
            // InternalMyDsl.g:599:2: rule__Programme__Group__11__Impl rule__Programme__Group__12
            {
            pushFollow(FOLLOW_5);
            rule__Programme__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Programme__Group__12();

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
    // $ANTLR end "rule__Programme__Group__11"


    // $ANTLR start "rule__Programme__Group__11__Impl"
    // InternalMyDsl.g:606:1: rule__Programme__Group__11__Impl : ( '{' ) ;
    public final void rule__Programme__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:610:1: ( ( '{' ) )
            // InternalMyDsl.g:611:1: ( '{' )
            {
            // InternalMyDsl.g:611:1: ( '{' )
            // InternalMyDsl.g:612:2: '{'
            {
             before(grammarAccess.getProgrammeAccess().getLeftCurlyBracketKeyword_11()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getProgrammeAccess().getLeftCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programme__Group__11__Impl"


    // $ANTLR start "rule__Programme__Group__12"
    // InternalMyDsl.g:621:1: rule__Programme__Group__12 : rule__Programme__Group__12__Impl rule__Programme__Group__13 ;
    public final void rule__Programme__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:625:1: ( rule__Programme__Group__12__Impl rule__Programme__Group__13 )
            // InternalMyDsl.g:626:2: rule__Programme__Group__12__Impl rule__Programme__Group__13
            {
            pushFollow(FOLLOW_8);
            rule__Programme__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Programme__Group__13();

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
    // $ANTLR end "rule__Programme__Group__12"


    // $ANTLR start "rule__Programme__Group__12__Impl"
    // InternalMyDsl.g:633:1: rule__Programme__Group__12__Impl : ( ( ( rule__Programme__ColonneAssignment_12 ) ) ( ( rule__Programme__ColonneAssignment_12 )* ) ) ;
    public final void rule__Programme__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:637:1: ( ( ( ( rule__Programme__ColonneAssignment_12 ) ) ( ( rule__Programme__ColonneAssignment_12 )* ) ) )
            // InternalMyDsl.g:638:1: ( ( ( rule__Programme__ColonneAssignment_12 ) ) ( ( rule__Programme__ColonneAssignment_12 )* ) )
            {
            // InternalMyDsl.g:638:1: ( ( ( rule__Programme__ColonneAssignment_12 ) ) ( ( rule__Programme__ColonneAssignment_12 )* ) )
            // InternalMyDsl.g:639:2: ( ( rule__Programme__ColonneAssignment_12 ) ) ( ( rule__Programme__ColonneAssignment_12 )* )
            {
            // InternalMyDsl.g:639:2: ( ( rule__Programme__ColonneAssignment_12 ) )
            // InternalMyDsl.g:640:3: ( rule__Programme__ColonneAssignment_12 )
            {
             before(grammarAccess.getProgrammeAccess().getColonneAssignment_12()); 
            // InternalMyDsl.g:641:3: ( rule__Programme__ColonneAssignment_12 )
            // InternalMyDsl.g:641:4: rule__Programme__ColonneAssignment_12
            {
            pushFollow(FOLLOW_9);
            rule__Programme__ColonneAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getProgrammeAccess().getColonneAssignment_12()); 

            }

            // InternalMyDsl.g:644:2: ( ( rule__Programme__ColonneAssignment_12 )* )
            // InternalMyDsl.g:645:3: ( rule__Programme__ColonneAssignment_12 )*
            {
             before(grammarAccess.getProgrammeAccess().getColonneAssignment_12()); 
            // InternalMyDsl.g:646:3: ( rule__Programme__ColonneAssignment_12 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_ID)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:646:4: rule__Programme__ColonneAssignment_12
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Programme__ColonneAssignment_12();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getProgrammeAccess().getColonneAssignment_12()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programme__Group__12__Impl"


    // $ANTLR start "rule__Programme__Group__13"
    // InternalMyDsl.g:655:1: rule__Programme__Group__13 : rule__Programme__Group__13__Impl rule__Programme__Group__14 ;
    public final void rule__Programme__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:659:1: ( rule__Programme__Group__13__Impl rule__Programme__Group__14 )
            // InternalMyDsl.g:660:2: rule__Programme__Group__13__Impl rule__Programme__Group__14
            {
            pushFollow(FOLLOW_8);
            rule__Programme__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Programme__Group__14();

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
    // $ANTLR end "rule__Programme__Group__13"


    // $ANTLR start "rule__Programme__Group__13__Impl"
    // InternalMyDsl.g:667:1: rule__Programme__Group__13__Impl : ( ( rule__Programme__Group_13__0 )* ) ;
    public final void rule__Programme__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:671:1: ( ( ( rule__Programme__Group_13__0 )* ) )
            // InternalMyDsl.g:672:1: ( ( rule__Programme__Group_13__0 )* )
            {
            // InternalMyDsl.g:672:1: ( ( rule__Programme__Group_13__0 )* )
            // InternalMyDsl.g:673:2: ( rule__Programme__Group_13__0 )*
            {
             before(grammarAccess.getProgrammeAccess().getGroup_13()); 
            // InternalMyDsl.g:674:2: ( rule__Programme__Group_13__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==25) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:674:3: rule__Programme__Group_13__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Programme__Group_13__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getProgrammeAccess().getGroup_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programme__Group__13__Impl"


    // $ANTLR start "rule__Programme__Group__14"
    // InternalMyDsl.g:682:1: rule__Programme__Group__14 : rule__Programme__Group__14__Impl rule__Programme__Group__15 ;
    public final void rule__Programme__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:686:1: ( rule__Programme__Group__14__Impl rule__Programme__Group__15 )
            // InternalMyDsl.g:687:2: rule__Programme__Group__14__Impl rule__Programme__Group__15
            {
            pushFollow(FOLLOW_12);
            rule__Programme__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Programme__Group__15();

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
    // $ANTLR end "rule__Programme__Group__14"


    // $ANTLR start "rule__Programme__Group__14__Impl"
    // InternalMyDsl.g:694:1: rule__Programme__Group__14__Impl : ( '}' ) ;
    public final void rule__Programme__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:698:1: ( ( '}' ) )
            // InternalMyDsl.g:699:1: ( '}' )
            {
            // InternalMyDsl.g:699:1: ( '}' )
            // InternalMyDsl.g:700:2: '}'
            {
             before(grammarAccess.getProgrammeAccess().getRightCurlyBracketKeyword_14()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getProgrammeAccess().getRightCurlyBracketKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programme__Group__14__Impl"


    // $ANTLR start "rule__Programme__Group__15"
    // InternalMyDsl.g:709:1: rule__Programme__Group__15 : rule__Programme__Group__15__Impl rule__Programme__Group__16 ;
    public final void rule__Programme__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:713:1: ( rule__Programme__Group__15__Impl rule__Programme__Group__16 )
            // InternalMyDsl.g:714:2: rule__Programme__Group__15__Impl rule__Programme__Group__16
            {
            pushFollow(FOLLOW_6);
            rule__Programme__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Programme__Group__16();

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
    // $ANTLR end "rule__Programme__Group__15"


    // $ANTLR start "rule__Programme__Group__15__Impl"
    // InternalMyDsl.g:721:1: rule__Programme__Group__15__Impl : ( 'graphe' ) ;
    public final void rule__Programme__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:725:1: ( ( 'graphe' ) )
            // InternalMyDsl.g:726:1: ( 'graphe' )
            {
            // InternalMyDsl.g:726:1: ( 'graphe' )
            // InternalMyDsl.g:727:2: 'graphe'
            {
             before(grammarAccess.getProgrammeAccess().getGrapheKeyword_15()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getProgrammeAccess().getGrapheKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programme__Group__15__Impl"


    // $ANTLR start "rule__Programme__Group__16"
    // InternalMyDsl.g:736:1: rule__Programme__Group__16 : rule__Programme__Group__16__Impl rule__Programme__Group__17 ;
    public final void rule__Programme__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:740:1: ( rule__Programme__Group__16__Impl rule__Programme__Group__17 )
            // InternalMyDsl.g:741:2: rule__Programme__Group__16__Impl rule__Programme__Group__17
            {
            pushFollow(FOLLOW_5);
            rule__Programme__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Programme__Group__17();

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
    // $ANTLR end "rule__Programme__Group__16"


    // $ANTLR start "rule__Programme__Group__16__Impl"
    // InternalMyDsl.g:748:1: rule__Programme__Group__16__Impl : ( '{' ) ;
    public final void rule__Programme__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:752:1: ( ( '{' ) )
            // InternalMyDsl.g:753:1: ( '{' )
            {
            // InternalMyDsl.g:753:1: ( '{' )
            // InternalMyDsl.g:754:2: '{'
            {
             before(grammarAccess.getProgrammeAccess().getLeftCurlyBracketKeyword_16()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getProgrammeAccess().getLeftCurlyBracketKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programme__Group__16__Impl"


    // $ANTLR start "rule__Programme__Group__17"
    // InternalMyDsl.g:763:1: rule__Programme__Group__17 : rule__Programme__Group__17__Impl rule__Programme__Group__18 ;
    public final void rule__Programme__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:767:1: ( rule__Programme__Group__17__Impl rule__Programme__Group__18 )
            // InternalMyDsl.g:768:2: rule__Programme__Group__17__Impl rule__Programme__Group__18
            {
            pushFollow(FOLLOW_8);
            rule__Programme__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Programme__Group__18();

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
    // $ANTLR end "rule__Programme__Group__17"


    // $ANTLR start "rule__Programme__Group__17__Impl"
    // InternalMyDsl.g:775:1: rule__Programme__Group__17__Impl : ( ( ( rule__Programme__GrapheAssignment_17 ) ) ( ( rule__Programme__GrapheAssignment_17 )* ) ) ;
    public final void rule__Programme__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:779:1: ( ( ( ( rule__Programme__GrapheAssignment_17 ) ) ( ( rule__Programme__GrapheAssignment_17 )* ) ) )
            // InternalMyDsl.g:780:1: ( ( ( rule__Programme__GrapheAssignment_17 ) ) ( ( rule__Programme__GrapheAssignment_17 )* ) )
            {
            // InternalMyDsl.g:780:1: ( ( ( rule__Programme__GrapheAssignment_17 ) ) ( ( rule__Programme__GrapheAssignment_17 )* ) )
            // InternalMyDsl.g:781:2: ( ( rule__Programme__GrapheAssignment_17 ) ) ( ( rule__Programme__GrapheAssignment_17 )* )
            {
            // InternalMyDsl.g:781:2: ( ( rule__Programme__GrapheAssignment_17 ) )
            // InternalMyDsl.g:782:3: ( rule__Programme__GrapheAssignment_17 )
            {
             before(grammarAccess.getProgrammeAccess().getGrapheAssignment_17()); 
            // InternalMyDsl.g:783:3: ( rule__Programme__GrapheAssignment_17 )
            // InternalMyDsl.g:783:4: rule__Programme__GrapheAssignment_17
            {
            pushFollow(FOLLOW_9);
            rule__Programme__GrapheAssignment_17();

            state._fsp--;


            }

             after(grammarAccess.getProgrammeAccess().getGrapheAssignment_17()); 

            }

            // InternalMyDsl.g:786:2: ( ( rule__Programme__GrapheAssignment_17 )* )
            // InternalMyDsl.g:787:3: ( rule__Programme__GrapheAssignment_17 )*
            {
             before(grammarAccess.getProgrammeAccess().getGrapheAssignment_17()); 
            // InternalMyDsl.g:788:3: ( rule__Programme__GrapheAssignment_17 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_STRING && LA8_0<=RULE_ID)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:788:4: rule__Programme__GrapheAssignment_17
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Programme__GrapheAssignment_17();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getProgrammeAccess().getGrapheAssignment_17()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programme__Group__17__Impl"


    // $ANTLR start "rule__Programme__Group__18"
    // InternalMyDsl.g:797:1: rule__Programme__Group__18 : rule__Programme__Group__18__Impl rule__Programme__Group__19 ;
    public final void rule__Programme__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:801:1: ( rule__Programme__Group__18__Impl rule__Programme__Group__19 )
            // InternalMyDsl.g:802:2: rule__Programme__Group__18__Impl rule__Programme__Group__19
            {
            pushFollow(FOLLOW_8);
            rule__Programme__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Programme__Group__19();

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
    // $ANTLR end "rule__Programme__Group__18"


    // $ANTLR start "rule__Programme__Group__18__Impl"
    // InternalMyDsl.g:809:1: rule__Programme__Group__18__Impl : ( ( rule__Programme__Group_18__0 )* ) ;
    public final void rule__Programme__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:813:1: ( ( ( rule__Programme__Group_18__0 )* ) )
            // InternalMyDsl.g:814:1: ( ( rule__Programme__Group_18__0 )* )
            {
            // InternalMyDsl.g:814:1: ( ( rule__Programme__Group_18__0 )* )
            // InternalMyDsl.g:815:2: ( rule__Programme__Group_18__0 )*
            {
             before(grammarAccess.getProgrammeAccess().getGroup_18()); 
            // InternalMyDsl.g:816:2: ( rule__Programme__Group_18__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==25) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:816:3: rule__Programme__Group_18__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Programme__Group_18__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getProgrammeAccess().getGroup_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programme__Group__18__Impl"


    // $ANTLR start "rule__Programme__Group__19"
    // InternalMyDsl.g:824:1: rule__Programme__Group__19 : rule__Programme__Group__19__Impl rule__Programme__Group__20 ;
    public final void rule__Programme__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:828:1: ( rule__Programme__Group__19__Impl rule__Programme__Group__20 )
            // InternalMyDsl.g:829:2: rule__Programme__Group__19__Impl rule__Programme__Group__20
            {
            pushFollow(FOLLOW_13);
            rule__Programme__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Programme__Group__20();

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
    // $ANTLR end "rule__Programme__Group__19"


    // $ANTLR start "rule__Programme__Group__19__Impl"
    // InternalMyDsl.g:836:1: rule__Programme__Group__19__Impl : ( '}' ) ;
    public final void rule__Programme__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:840:1: ( ( '}' ) )
            // InternalMyDsl.g:841:1: ( '}' )
            {
            // InternalMyDsl.g:841:1: ( '}' )
            // InternalMyDsl.g:842:2: '}'
            {
             before(grammarAccess.getProgrammeAccess().getRightCurlyBracketKeyword_19()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getProgrammeAccess().getRightCurlyBracketKeyword_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programme__Group__19__Impl"


    // $ANTLR start "rule__Programme__Group__20"
    // InternalMyDsl.g:851:1: rule__Programme__Group__20 : rule__Programme__Group__20__Impl ;
    public final void rule__Programme__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:855:1: ( rule__Programme__Group__20__Impl )
            // InternalMyDsl.g:856:2: rule__Programme__Group__20__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Programme__Group__20__Impl();

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
    // $ANTLR end "rule__Programme__Group__20"


    // $ANTLR start "rule__Programme__Group__20__Impl"
    // InternalMyDsl.g:862:1: rule__Programme__Group__20__Impl : ( '}' ) ;
    public final void rule__Programme__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:866:1: ( ( '}' ) )
            // InternalMyDsl.g:867:1: ( '}' )
            {
            // InternalMyDsl.g:867:1: ( '}' )
            // InternalMyDsl.g:868:2: '}'
            {
             before(grammarAccess.getProgrammeAccess().getRightCurlyBracketKeyword_20()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getProgrammeAccess().getRightCurlyBracketKeyword_20()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programme__Group__20__Impl"


    // $ANTLR start "rule__Programme__Group_8__0"
    // InternalMyDsl.g:878:1: rule__Programme__Group_8__0 : rule__Programme__Group_8__0__Impl rule__Programme__Group_8__1 ;
    public final void rule__Programme__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:882:1: ( rule__Programme__Group_8__0__Impl rule__Programme__Group_8__1 )
            // InternalMyDsl.g:883:2: rule__Programme__Group_8__0__Impl rule__Programme__Group_8__1
            {
            pushFollow(FOLLOW_5);
            rule__Programme__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Programme__Group_8__1();

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
    // $ANTLR end "rule__Programme__Group_8__0"


    // $ANTLR start "rule__Programme__Group_8__0__Impl"
    // InternalMyDsl.g:890:1: rule__Programme__Group_8__0__Impl : ( ',' ) ;
    public final void rule__Programme__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:894:1: ( ( ',' ) )
            // InternalMyDsl.g:895:1: ( ',' )
            {
            // InternalMyDsl.g:895:1: ( ',' )
            // InternalMyDsl.g:896:2: ','
            {
             before(grammarAccess.getProgrammeAccess().getCommaKeyword_8_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getProgrammeAccess().getCommaKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programme__Group_8__0__Impl"


    // $ANTLR start "rule__Programme__Group_8__1"
    // InternalMyDsl.g:905:1: rule__Programme__Group_8__1 : rule__Programme__Group_8__1__Impl ;
    public final void rule__Programme__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:909:1: ( rule__Programme__Group_8__1__Impl )
            // InternalMyDsl.g:910:2: rule__Programme__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Programme__Group_8__1__Impl();

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
    // $ANTLR end "rule__Programme__Group_8__1"


    // $ANTLR start "rule__Programme__Group_8__1__Impl"
    // InternalMyDsl.g:916:1: rule__Programme__Group_8__1__Impl : ( ( rule__Programme__DonnerAssignment_8_1 ) ) ;
    public final void rule__Programme__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:920:1: ( ( ( rule__Programme__DonnerAssignment_8_1 ) ) )
            // InternalMyDsl.g:921:1: ( ( rule__Programme__DonnerAssignment_8_1 ) )
            {
            // InternalMyDsl.g:921:1: ( ( rule__Programme__DonnerAssignment_8_1 ) )
            // InternalMyDsl.g:922:2: ( rule__Programme__DonnerAssignment_8_1 )
            {
             before(grammarAccess.getProgrammeAccess().getDonnerAssignment_8_1()); 
            // InternalMyDsl.g:923:2: ( rule__Programme__DonnerAssignment_8_1 )
            // InternalMyDsl.g:923:3: rule__Programme__DonnerAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Programme__DonnerAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getProgrammeAccess().getDonnerAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programme__Group_8__1__Impl"


    // $ANTLR start "rule__Programme__Group_13__0"
    // InternalMyDsl.g:932:1: rule__Programme__Group_13__0 : rule__Programme__Group_13__0__Impl rule__Programme__Group_13__1 ;
    public final void rule__Programme__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:936:1: ( rule__Programme__Group_13__0__Impl rule__Programme__Group_13__1 )
            // InternalMyDsl.g:937:2: rule__Programme__Group_13__0__Impl rule__Programme__Group_13__1
            {
            pushFollow(FOLLOW_5);
            rule__Programme__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Programme__Group_13__1();

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
    // $ANTLR end "rule__Programme__Group_13__0"


    // $ANTLR start "rule__Programme__Group_13__0__Impl"
    // InternalMyDsl.g:944:1: rule__Programme__Group_13__0__Impl : ( ',' ) ;
    public final void rule__Programme__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:948:1: ( ( ',' ) )
            // InternalMyDsl.g:949:1: ( ',' )
            {
            // InternalMyDsl.g:949:1: ( ',' )
            // InternalMyDsl.g:950:2: ','
            {
             before(grammarAccess.getProgrammeAccess().getCommaKeyword_13_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getProgrammeAccess().getCommaKeyword_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programme__Group_13__0__Impl"


    // $ANTLR start "rule__Programme__Group_13__1"
    // InternalMyDsl.g:959:1: rule__Programme__Group_13__1 : rule__Programme__Group_13__1__Impl ;
    public final void rule__Programme__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:963:1: ( rule__Programme__Group_13__1__Impl )
            // InternalMyDsl.g:964:2: rule__Programme__Group_13__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Programme__Group_13__1__Impl();

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
    // $ANTLR end "rule__Programme__Group_13__1"


    // $ANTLR start "rule__Programme__Group_13__1__Impl"
    // InternalMyDsl.g:970:1: rule__Programme__Group_13__1__Impl : ( ( rule__Programme__ColonneAssignment_13_1 ) ) ;
    public final void rule__Programme__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:974:1: ( ( ( rule__Programme__ColonneAssignment_13_1 ) ) )
            // InternalMyDsl.g:975:1: ( ( rule__Programme__ColonneAssignment_13_1 ) )
            {
            // InternalMyDsl.g:975:1: ( ( rule__Programme__ColonneAssignment_13_1 ) )
            // InternalMyDsl.g:976:2: ( rule__Programme__ColonneAssignment_13_1 )
            {
             before(grammarAccess.getProgrammeAccess().getColonneAssignment_13_1()); 
            // InternalMyDsl.g:977:2: ( rule__Programme__ColonneAssignment_13_1 )
            // InternalMyDsl.g:977:3: rule__Programme__ColonneAssignment_13_1
            {
            pushFollow(FOLLOW_2);
            rule__Programme__ColonneAssignment_13_1();

            state._fsp--;


            }

             after(grammarAccess.getProgrammeAccess().getColonneAssignment_13_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programme__Group_13__1__Impl"


    // $ANTLR start "rule__Programme__Group_18__0"
    // InternalMyDsl.g:986:1: rule__Programme__Group_18__0 : rule__Programme__Group_18__0__Impl rule__Programme__Group_18__1 ;
    public final void rule__Programme__Group_18__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:990:1: ( rule__Programme__Group_18__0__Impl rule__Programme__Group_18__1 )
            // InternalMyDsl.g:991:2: rule__Programme__Group_18__0__Impl rule__Programme__Group_18__1
            {
            pushFollow(FOLLOW_5);
            rule__Programme__Group_18__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Programme__Group_18__1();

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
    // $ANTLR end "rule__Programme__Group_18__0"


    // $ANTLR start "rule__Programme__Group_18__0__Impl"
    // InternalMyDsl.g:998:1: rule__Programme__Group_18__0__Impl : ( ',' ) ;
    public final void rule__Programme__Group_18__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1002:1: ( ( ',' ) )
            // InternalMyDsl.g:1003:1: ( ',' )
            {
            // InternalMyDsl.g:1003:1: ( ',' )
            // InternalMyDsl.g:1004:2: ','
            {
             before(grammarAccess.getProgrammeAccess().getCommaKeyword_18_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getProgrammeAccess().getCommaKeyword_18_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programme__Group_18__0__Impl"


    // $ANTLR start "rule__Programme__Group_18__1"
    // InternalMyDsl.g:1013:1: rule__Programme__Group_18__1 : rule__Programme__Group_18__1__Impl ;
    public final void rule__Programme__Group_18__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1017:1: ( rule__Programme__Group_18__1__Impl )
            // InternalMyDsl.g:1018:2: rule__Programme__Group_18__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Programme__Group_18__1__Impl();

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
    // $ANTLR end "rule__Programme__Group_18__1"


    // $ANTLR start "rule__Programme__Group_18__1__Impl"
    // InternalMyDsl.g:1024:1: rule__Programme__Group_18__1__Impl : ( ( rule__Programme__GrapheAssignment_18_1 ) ) ;
    public final void rule__Programme__Group_18__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1028:1: ( ( ( rule__Programme__GrapheAssignment_18_1 ) ) )
            // InternalMyDsl.g:1029:1: ( ( rule__Programme__GrapheAssignment_18_1 ) )
            {
            // InternalMyDsl.g:1029:1: ( ( rule__Programme__GrapheAssignment_18_1 ) )
            // InternalMyDsl.g:1030:2: ( rule__Programme__GrapheAssignment_18_1 )
            {
             before(grammarAccess.getProgrammeAccess().getGrapheAssignment_18_1()); 
            // InternalMyDsl.g:1031:2: ( rule__Programme__GrapheAssignment_18_1 )
            // InternalMyDsl.g:1031:3: rule__Programme__GrapheAssignment_18_1
            {
            pushFollow(FOLLOW_2);
            rule__Programme__GrapheAssignment_18_1();

            state._fsp--;


            }

             after(grammarAccess.getProgrammeAccess().getGrapheAssignment_18_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programme__Group_18__1__Impl"


    // $ANTLR start "rule__Graphe__Group__0"
    // InternalMyDsl.g:1040:1: rule__Graphe__Group__0 : rule__Graphe__Group__0__Impl rule__Graphe__Group__1 ;
    public final void rule__Graphe__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1044:1: ( rule__Graphe__Group__0__Impl rule__Graphe__Group__1 )
            // InternalMyDsl.g:1045:2: rule__Graphe__Group__0__Impl rule__Graphe__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Graphe__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Graphe__Group__1();

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
    // $ANTLR end "rule__Graphe__Group__0"


    // $ANTLR start "rule__Graphe__Group__0__Impl"
    // InternalMyDsl.g:1052:1: rule__Graphe__Group__0__Impl : ( ( rule__Graphe__NameAssignment_0 ) ) ;
    public final void rule__Graphe__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1056:1: ( ( ( rule__Graphe__NameAssignment_0 ) ) )
            // InternalMyDsl.g:1057:1: ( ( rule__Graphe__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:1057:1: ( ( rule__Graphe__NameAssignment_0 ) )
            // InternalMyDsl.g:1058:2: ( rule__Graphe__NameAssignment_0 )
            {
             before(grammarAccess.getGrapheAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:1059:2: ( rule__Graphe__NameAssignment_0 )
            // InternalMyDsl.g:1059:3: rule__Graphe__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Graphe__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getGrapheAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graphe__Group__0__Impl"


    // $ANTLR start "rule__Graphe__Group__1"
    // InternalMyDsl.g:1067:1: rule__Graphe__Group__1 : rule__Graphe__Group__1__Impl rule__Graphe__Group__2 ;
    public final void rule__Graphe__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1071:1: ( rule__Graphe__Group__1__Impl rule__Graphe__Group__2 )
            // InternalMyDsl.g:1072:2: rule__Graphe__Group__1__Impl rule__Graphe__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Graphe__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Graphe__Group__2();

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
    // $ANTLR end "rule__Graphe__Group__1"


    // $ANTLR start "rule__Graphe__Group__1__Impl"
    // InternalMyDsl.g:1079:1: rule__Graphe__Group__1__Impl : ( '{' ) ;
    public final void rule__Graphe__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1083:1: ( ( '{' ) )
            // InternalMyDsl.g:1084:1: ( '{' )
            {
            // InternalMyDsl.g:1084:1: ( '{' )
            // InternalMyDsl.g:1085:2: '{'
            {
             before(grammarAccess.getGrapheAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getGrapheAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graphe__Group__1__Impl"


    // $ANTLR start "rule__Graphe__Group__2"
    // InternalMyDsl.g:1094:1: rule__Graphe__Group__2 : rule__Graphe__Group__2__Impl rule__Graphe__Group__3 ;
    public final void rule__Graphe__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1098:1: ( rule__Graphe__Group__2__Impl rule__Graphe__Group__3 )
            // InternalMyDsl.g:1099:2: rule__Graphe__Group__2__Impl rule__Graphe__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Graphe__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Graphe__Group__3();

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
    // $ANTLR end "rule__Graphe__Group__2"


    // $ANTLR start "rule__Graphe__Group__2__Impl"
    // InternalMyDsl.g:1106:1: rule__Graphe__Group__2__Impl : ( 'data' ) ;
    public final void rule__Graphe__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1110:1: ( ( 'data' ) )
            // InternalMyDsl.g:1111:1: ( 'data' )
            {
            // InternalMyDsl.g:1111:1: ( 'data' )
            // InternalMyDsl.g:1112:2: 'data'
            {
             before(grammarAccess.getGrapheAccess().getDataKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getGrapheAccess().getDataKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graphe__Group__2__Impl"


    // $ANTLR start "rule__Graphe__Group__3"
    // InternalMyDsl.g:1121:1: rule__Graphe__Group__3 : rule__Graphe__Group__3__Impl rule__Graphe__Group__4 ;
    public final void rule__Graphe__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1125:1: ( rule__Graphe__Group__3__Impl rule__Graphe__Group__4 )
            // InternalMyDsl.g:1126:2: rule__Graphe__Group__3__Impl rule__Graphe__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Graphe__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Graphe__Group__4();

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
    // $ANTLR end "rule__Graphe__Group__3"


    // $ANTLR start "rule__Graphe__Group__3__Impl"
    // InternalMyDsl.g:1133:1: rule__Graphe__Group__3__Impl : ( '=' ) ;
    public final void rule__Graphe__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1137:1: ( ( '=' ) )
            // InternalMyDsl.g:1138:1: ( '=' )
            {
            // InternalMyDsl.g:1138:1: ( '=' )
            // InternalMyDsl.g:1139:2: '='
            {
             before(grammarAccess.getGrapheAccess().getEqualsSignKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getGrapheAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graphe__Group__3__Impl"


    // $ANTLR start "rule__Graphe__Group__4"
    // InternalMyDsl.g:1148:1: rule__Graphe__Group__4 : rule__Graphe__Group__4__Impl rule__Graphe__Group__5 ;
    public final void rule__Graphe__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1152:1: ( rule__Graphe__Group__4__Impl rule__Graphe__Group__5 )
            // InternalMyDsl.g:1153:2: rule__Graphe__Group__4__Impl rule__Graphe__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Graphe__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Graphe__Group__5();

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
    // $ANTLR end "rule__Graphe__Group__4"


    // $ANTLR start "rule__Graphe__Group__4__Impl"
    // InternalMyDsl.g:1160:1: rule__Graphe__Group__4__Impl : ( ( rule__Graphe__DataAssignment_4 ) ) ;
    public final void rule__Graphe__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1164:1: ( ( ( rule__Graphe__DataAssignment_4 ) ) )
            // InternalMyDsl.g:1165:1: ( ( rule__Graphe__DataAssignment_4 ) )
            {
            // InternalMyDsl.g:1165:1: ( ( rule__Graphe__DataAssignment_4 ) )
            // InternalMyDsl.g:1166:2: ( rule__Graphe__DataAssignment_4 )
            {
             before(grammarAccess.getGrapheAccess().getDataAssignment_4()); 
            // InternalMyDsl.g:1167:2: ( rule__Graphe__DataAssignment_4 )
            // InternalMyDsl.g:1167:3: rule__Graphe__DataAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Graphe__DataAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getGrapheAccess().getDataAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graphe__Group__4__Impl"


    // $ANTLR start "rule__Graphe__Group__5"
    // InternalMyDsl.g:1175:1: rule__Graphe__Group__5 : rule__Graphe__Group__5__Impl rule__Graphe__Group__6 ;
    public final void rule__Graphe__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1179:1: ( rule__Graphe__Group__5__Impl rule__Graphe__Group__6 )
            // InternalMyDsl.g:1180:2: rule__Graphe__Group__5__Impl rule__Graphe__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__Graphe__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Graphe__Group__6();

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
    // $ANTLR end "rule__Graphe__Group__5"


    // $ANTLR start "rule__Graphe__Group__5__Impl"
    // InternalMyDsl.g:1187:1: rule__Graphe__Group__5__Impl : ( ',' ) ;
    public final void rule__Graphe__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1191:1: ( ( ',' ) )
            // InternalMyDsl.g:1192:1: ( ',' )
            {
            // InternalMyDsl.g:1192:1: ( ',' )
            // InternalMyDsl.g:1193:2: ','
            {
             before(grammarAccess.getGrapheAccess().getCommaKeyword_5()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getGrapheAccess().getCommaKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graphe__Group__5__Impl"


    // $ANTLR start "rule__Graphe__Group__6"
    // InternalMyDsl.g:1202:1: rule__Graphe__Group__6 : rule__Graphe__Group__6__Impl rule__Graphe__Group__7 ;
    public final void rule__Graphe__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1206:1: ( rule__Graphe__Group__6__Impl rule__Graphe__Group__7 )
            // InternalMyDsl.g:1207:2: rule__Graphe__Group__6__Impl rule__Graphe__Group__7
            {
            pushFollow(FOLLOW_15);
            rule__Graphe__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Graphe__Group__7();

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
    // $ANTLR end "rule__Graphe__Group__6"


    // $ANTLR start "rule__Graphe__Group__6__Impl"
    // InternalMyDsl.g:1214:1: rule__Graphe__Group__6__Impl : ( 'type' ) ;
    public final void rule__Graphe__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1218:1: ( ( 'type' ) )
            // InternalMyDsl.g:1219:1: ( 'type' )
            {
            // InternalMyDsl.g:1219:1: ( 'type' )
            // InternalMyDsl.g:1220:2: 'type'
            {
             before(grammarAccess.getGrapheAccess().getTypeKeyword_6()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getGrapheAccess().getTypeKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graphe__Group__6__Impl"


    // $ANTLR start "rule__Graphe__Group__7"
    // InternalMyDsl.g:1229:1: rule__Graphe__Group__7 : rule__Graphe__Group__7__Impl rule__Graphe__Group__8 ;
    public final void rule__Graphe__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1233:1: ( rule__Graphe__Group__7__Impl rule__Graphe__Group__8 )
            // InternalMyDsl.g:1234:2: rule__Graphe__Group__7__Impl rule__Graphe__Group__8
            {
            pushFollow(FOLLOW_18);
            rule__Graphe__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Graphe__Group__8();

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
    // $ANTLR end "rule__Graphe__Group__7"


    // $ANTLR start "rule__Graphe__Group__7__Impl"
    // InternalMyDsl.g:1241:1: rule__Graphe__Group__7__Impl : ( '=' ) ;
    public final void rule__Graphe__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1245:1: ( ( '=' ) )
            // InternalMyDsl.g:1246:1: ( '=' )
            {
            // InternalMyDsl.g:1246:1: ( '=' )
            // InternalMyDsl.g:1247:2: '='
            {
             before(grammarAccess.getGrapheAccess().getEqualsSignKeyword_7()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getGrapheAccess().getEqualsSignKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graphe__Group__7__Impl"


    // $ANTLR start "rule__Graphe__Group__8"
    // InternalMyDsl.g:1256:1: rule__Graphe__Group__8 : rule__Graphe__Group__8__Impl rule__Graphe__Group__9 ;
    public final void rule__Graphe__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1260:1: ( rule__Graphe__Group__8__Impl rule__Graphe__Group__9 )
            // InternalMyDsl.g:1261:2: rule__Graphe__Group__8__Impl rule__Graphe__Group__9
            {
            pushFollow(FOLLOW_16);
            rule__Graphe__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Graphe__Group__9();

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
    // $ANTLR end "rule__Graphe__Group__8"


    // $ANTLR start "rule__Graphe__Group__8__Impl"
    // InternalMyDsl.g:1268:1: rule__Graphe__Group__8__Impl : ( ( rule__Graphe__TypeAssignment_8 ) ) ;
    public final void rule__Graphe__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1272:1: ( ( ( rule__Graphe__TypeAssignment_8 ) ) )
            // InternalMyDsl.g:1273:1: ( ( rule__Graphe__TypeAssignment_8 ) )
            {
            // InternalMyDsl.g:1273:1: ( ( rule__Graphe__TypeAssignment_8 ) )
            // InternalMyDsl.g:1274:2: ( rule__Graphe__TypeAssignment_8 )
            {
             before(grammarAccess.getGrapheAccess().getTypeAssignment_8()); 
            // InternalMyDsl.g:1275:2: ( rule__Graphe__TypeAssignment_8 )
            // InternalMyDsl.g:1275:3: rule__Graphe__TypeAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Graphe__TypeAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getGrapheAccess().getTypeAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graphe__Group__8__Impl"


    // $ANTLR start "rule__Graphe__Group__9"
    // InternalMyDsl.g:1283:1: rule__Graphe__Group__9 : rule__Graphe__Group__9__Impl rule__Graphe__Group__10 ;
    public final void rule__Graphe__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1287:1: ( rule__Graphe__Group__9__Impl rule__Graphe__Group__10 )
            // InternalMyDsl.g:1288:2: rule__Graphe__Group__9__Impl rule__Graphe__Group__10
            {
            pushFollow(FOLLOW_11);
            rule__Graphe__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Graphe__Group__10();

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
    // $ANTLR end "rule__Graphe__Group__9"


    // $ANTLR start "rule__Graphe__Group__9__Impl"
    // InternalMyDsl.g:1295:1: rule__Graphe__Group__9__Impl : ( ',' ) ;
    public final void rule__Graphe__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1299:1: ( ( ',' ) )
            // InternalMyDsl.g:1300:1: ( ',' )
            {
            // InternalMyDsl.g:1300:1: ( ',' )
            // InternalMyDsl.g:1301:2: ','
            {
             before(grammarAccess.getGrapheAccess().getCommaKeyword_9()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getGrapheAccess().getCommaKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graphe__Group__9__Impl"


    // $ANTLR start "rule__Graphe__Group__10"
    // InternalMyDsl.g:1310:1: rule__Graphe__Group__10 : rule__Graphe__Group__10__Impl rule__Graphe__Group__11 ;
    public final void rule__Graphe__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1314:1: ( rule__Graphe__Group__10__Impl rule__Graphe__Group__11 )
            // InternalMyDsl.g:1315:2: rule__Graphe__Group__10__Impl rule__Graphe__Group__11
            {
            pushFollow(FOLLOW_15);
            rule__Graphe__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Graphe__Group__11();

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
    // $ANTLR end "rule__Graphe__Group__10"


    // $ANTLR start "rule__Graphe__Group__10__Impl"
    // InternalMyDsl.g:1322:1: rule__Graphe__Group__10__Impl : ( 'colonne' ) ;
    public final void rule__Graphe__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1326:1: ( ( 'colonne' ) )
            // InternalMyDsl.g:1327:1: ( 'colonne' )
            {
            // InternalMyDsl.g:1327:1: ( 'colonne' )
            // InternalMyDsl.g:1328:2: 'colonne'
            {
             before(grammarAccess.getGrapheAccess().getColonneKeyword_10()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getGrapheAccess().getColonneKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graphe__Group__10__Impl"


    // $ANTLR start "rule__Graphe__Group__11"
    // InternalMyDsl.g:1337:1: rule__Graphe__Group__11 : rule__Graphe__Group__11__Impl rule__Graphe__Group__12 ;
    public final void rule__Graphe__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1341:1: ( rule__Graphe__Group__11__Impl rule__Graphe__Group__12 )
            // InternalMyDsl.g:1342:2: rule__Graphe__Group__11__Impl rule__Graphe__Group__12
            {
            pushFollow(FOLLOW_5);
            rule__Graphe__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Graphe__Group__12();

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
    // $ANTLR end "rule__Graphe__Group__11"


    // $ANTLR start "rule__Graphe__Group__11__Impl"
    // InternalMyDsl.g:1349:1: rule__Graphe__Group__11__Impl : ( '=' ) ;
    public final void rule__Graphe__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1353:1: ( ( '=' ) )
            // InternalMyDsl.g:1354:1: ( '=' )
            {
            // InternalMyDsl.g:1354:1: ( '=' )
            // InternalMyDsl.g:1355:2: '='
            {
             before(grammarAccess.getGrapheAccess().getEqualsSignKeyword_11()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getGrapheAccess().getEqualsSignKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graphe__Group__11__Impl"


    // $ANTLR start "rule__Graphe__Group__12"
    // InternalMyDsl.g:1364:1: rule__Graphe__Group__12 : rule__Graphe__Group__12__Impl rule__Graphe__Group__13 ;
    public final void rule__Graphe__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1368:1: ( rule__Graphe__Group__12__Impl rule__Graphe__Group__13 )
            // InternalMyDsl.g:1369:2: rule__Graphe__Group__12__Impl rule__Graphe__Group__13
            {
            pushFollow(FOLLOW_16);
            rule__Graphe__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Graphe__Group__13();

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
    // $ANTLR end "rule__Graphe__Group__12"


    // $ANTLR start "rule__Graphe__Group__12__Impl"
    // InternalMyDsl.g:1376:1: rule__Graphe__Group__12__Impl : ( ( rule__Graphe__ColonneAssignment_12 ) ) ;
    public final void rule__Graphe__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1380:1: ( ( ( rule__Graphe__ColonneAssignment_12 ) ) )
            // InternalMyDsl.g:1381:1: ( ( rule__Graphe__ColonneAssignment_12 ) )
            {
            // InternalMyDsl.g:1381:1: ( ( rule__Graphe__ColonneAssignment_12 ) )
            // InternalMyDsl.g:1382:2: ( rule__Graphe__ColonneAssignment_12 )
            {
             before(grammarAccess.getGrapheAccess().getColonneAssignment_12()); 
            // InternalMyDsl.g:1383:2: ( rule__Graphe__ColonneAssignment_12 )
            // InternalMyDsl.g:1383:3: rule__Graphe__ColonneAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__Graphe__ColonneAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getGrapheAccess().getColonneAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graphe__Group__12__Impl"


    // $ANTLR start "rule__Graphe__Group__13"
    // InternalMyDsl.g:1391:1: rule__Graphe__Group__13 : rule__Graphe__Group__13__Impl rule__Graphe__Group__14 ;
    public final void rule__Graphe__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1395:1: ( rule__Graphe__Group__13__Impl rule__Graphe__Group__14 )
            // InternalMyDsl.g:1396:2: rule__Graphe__Group__13__Impl rule__Graphe__Group__14
            {
            pushFollow(FOLLOW_16);
            rule__Graphe__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Graphe__Group__14();

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
    // $ANTLR end "rule__Graphe__Group__13"


    // $ANTLR start "rule__Graphe__Group__13__Impl"
    // InternalMyDsl.g:1403:1: rule__Graphe__Group__13__Impl : ( ( rule__Graphe__Group_13__0 )* ) ;
    public final void rule__Graphe__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1407:1: ( ( ( rule__Graphe__Group_13__0 )* ) )
            // InternalMyDsl.g:1408:1: ( ( rule__Graphe__Group_13__0 )* )
            {
            // InternalMyDsl.g:1408:1: ( ( rule__Graphe__Group_13__0 )* )
            // InternalMyDsl.g:1409:2: ( rule__Graphe__Group_13__0 )*
            {
             before(grammarAccess.getGrapheAccess().getGroup_13()); 
            // InternalMyDsl.g:1410:2: ( rule__Graphe__Group_13__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==25) ) {
                    int LA10_1 = input.LA(2);

                    if ( ((LA10_1>=RULE_STRING && LA10_1<=RULE_ID)) ) {
                        alt10=1;
                    }


                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:1410:3: rule__Graphe__Group_13__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Graphe__Group_13__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getGrapheAccess().getGroup_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graphe__Group__13__Impl"


    // $ANTLR start "rule__Graphe__Group__14"
    // InternalMyDsl.g:1418:1: rule__Graphe__Group__14 : rule__Graphe__Group__14__Impl rule__Graphe__Group__15 ;
    public final void rule__Graphe__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1422:1: ( rule__Graphe__Group__14__Impl rule__Graphe__Group__15 )
            // InternalMyDsl.g:1423:2: rule__Graphe__Group__14__Impl rule__Graphe__Group__15
            {
            pushFollow(FOLLOW_19);
            rule__Graphe__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Graphe__Group__15();

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
    // $ANTLR end "rule__Graphe__Group__14"


    // $ANTLR start "rule__Graphe__Group__14__Impl"
    // InternalMyDsl.g:1430:1: rule__Graphe__Group__14__Impl : ( ',' ) ;
    public final void rule__Graphe__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1434:1: ( ( ',' ) )
            // InternalMyDsl.g:1435:1: ( ',' )
            {
            // InternalMyDsl.g:1435:1: ( ',' )
            // InternalMyDsl.g:1436:2: ','
            {
             before(grammarAccess.getGrapheAccess().getCommaKeyword_14()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getGrapheAccess().getCommaKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graphe__Group__14__Impl"


    // $ANTLR start "rule__Graphe__Group__15"
    // InternalMyDsl.g:1445:1: rule__Graphe__Group__15 : rule__Graphe__Group__15__Impl rule__Graphe__Group__16 ;
    public final void rule__Graphe__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1449:1: ( rule__Graphe__Group__15__Impl rule__Graphe__Group__16 )
            // InternalMyDsl.g:1450:2: rule__Graphe__Group__15__Impl rule__Graphe__Group__16
            {
            pushFollow(FOLLOW_15);
            rule__Graphe__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Graphe__Group__16();

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
    // $ANTLR end "rule__Graphe__Group__15"


    // $ANTLR start "rule__Graphe__Group__15__Impl"
    // InternalMyDsl.g:1457:1: rule__Graphe__Group__15__Impl : ( 'bagColor' ) ;
    public final void rule__Graphe__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1461:1: ( ( 'bagColor' ) )
            // InternalMyDsl.g:1462:1: ( 'bagColor' )
            {
            // InternalMyDsl.g:1462:1: ( 'bagColor' )
            // InternalMyDsl.g:1463:2: 'bagColor'
            {
             before(grammarAccess.getGrapheAccess().getBagColorKeyword_15()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getGrapheAccess().getBagColorKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graphe__Group__15__Impl"


    // $ANTLR start "rule__Graphe__Group__16"
    // InternalMyDsl.g:1472:1: rule__Graphe__Group__16 : rule__Graphe__Group__16__Impl rule__Graphe__Group__17 ;
    public final void rule__Graphe__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1476:1: ( rule__Graphe__Group__16__Impl rule__Graphe__Group__17 )
            // InternalMyDsl.g:1477:2: rule__Graphe__Group__16__Impl rule__Graphe__Group__17
            {
            pushFollow(FOLLOW_20);
            rule__Graphe__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Graphe__Group__17();

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
    // $ANTLR end "rule__Graphe__Group__16"


    // $ANTLR start "rule__Graphe__Group__16__Impl"
    // InternalMyDsl.g:1484:1: rule__Graphe__Group__16__Impl : ( '=' ) ;
    public final void rule__Graphe__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1488:1: ( ( '=' ) )
            // InternalMyDsl.g:1489:1: ( '=' )
            {
            // InternalMyDsl.g:1489:1: ( '=' )
            // InternalMyDsl.g:1490:2: '='
            {
             before(grammarAccess.getGrapheAccess().getEqualsSignKeyword_16()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getGrapheAccess().getEqualsSignKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graphe__Group__16__Impl"


    // $ANTLR start "rule__Graphe__Group__17"
    // InternalMyDsl.g:1499:1: rule__Graphe__Group__17 : rule__Graphe__Group__17__Impl rule__Graphe__Group__18 ;
    public final void rule__Graphe__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1503:1: ( rule__Graphe__Group__17__Impl rule__Graphe__Group__18 )
            // InternalMyDsl.g:1504:2: rule__Graphe__Group__17__Impl rule__Graphe__Group__18
            {
            pushFollow(FOLLOW_13);
            rule__Graphe__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Graphe__Group__18();

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
    // $ANTLR end "rule__Graphe__Group__17"


    // $ANTLR start "rule__Graphe__Group__17__Impl"
    // InternalMyDsl.g:1511:1: rule__Graphe__Group__17__Impl : ( ( rule__Graphe__BagColorAssignment_17 ) ) ;
    public final void rule__Graphe__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1515:1: ( ( ( rule__Graphe__BagColorAssignment_17 ) ) )
            // InternalMyDsl.g:1516:1: ( ( rule__Graphe__BagColorAssignment_17 ) )
            {
            // InternalMyDsl.g:1516:1: ( ( rule__Graphe__BagColorAssignment_17 ) )
            // InternalMyDsl.g:1517:2: ( rule__Graphe__BagColorAssignment_17 )
            {
             before(grammarAccess.getGrapheAccess().getBagColorAssignment_17()); 
            // InternalMyDsl.g:1518:2: ( rule__Graphe__BagColorAssignment_17 )
            // InternalMyDsl.g:1518:3: rule__Graphe__BagColorAssignment_17
            {
            pushFollow(FOLLOW_2);
            rule__Graphe__BagColorAssignment_17();

            state._fsp--;


            }

             after(grammarAccess.getGrapheAccess().getBagColorAssignment_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graphe__Group__17__Impl"


    // $ANTLR start "rule__Graphe__Group__18"
    // InternalMyDsl.g:1526:1: rule__Graphe__Group__18 : rule__Graphe__Group__18__Impl ;
    public final void rule__Graphe__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1530:1: ( rule__Graphe__Group__18__Impl )
            // InternalMyDsl.g:1531:2: rule__Graphe__Group__18__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Graphe__Group__18__Impl();

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
    // $ANTLR end "rule__Graphe__Group__18"


    // $ANTLR start "rule__Graphe__Group__18__Impl"
    // InternalMyDsl.g:1537:1: rule__Graphe__Group__18__Impl : ( '}' ) ;
    public final void rule__Graphe__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1541:1: ( ( '}' ) )
            // InternalMyDsl.g:1542:1: ( '}' )
            {
            // InternalMyDsl.g:1542:1: ( '}' )
            // InternalMyDsl.g:1543:2: '}'
            {
             before(grammarAccess.getGrapheAccess().getRightCurlyBracketKeyword_18()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getGrapheAccess().getRightCurlyBracketKeyword_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graphe__Group__18__Impl"


    // $ANTLR start "rule__Graphe__Group_13__0"
    // InternalMyDsl.g:1553:1: rule__Graphe__Group_13__0 : rule__Graphe__Group_13__0__Impl rule__Graphe__Group_13__1 ;
    public final void rule__Graphe__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1557:1: ( rule__Graphe__Group_13__0__Impl rule__Graphe__Group_13__1 )
            // InternalMyDsl.g:1558:2: rule__Graphe__Group_13__0__Impl rule__Graphe__Group_13__1
            {
            pushFollow(FOLLOW_5);
            rule__Graphe__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Graphe__Group_13__1();

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
    // $ANTLR end "rule__Graphe__Group_13__0"


    // $ANTLR start "rule__Graphe__Group_13__0__Impl"
    // InternalMyDsl.g:1565:1: rule__Graphe__Group_13__0__Impl : ( ',' ) ;
    public final void rule__Graphe__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1569:1: ( ( ',' ) )
            // InternalMyDsl.g:1570:1: ( ',' )
            {
            // InternalMyDsl.g:1570:1: ( ',' )
            // InternalMyDsl.g:1571:2: ','
            {
             before(grammarAccess.getGrapheAccess().getCommaKeyword_13_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getGrapheAccess().getCommaKeyword_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graphe__Group_13__0__Impl"


    // $ANTLR start "rule__Graphe__Group_13__1"
    // InternalMyDsl.g:1580:1: rule__Graphe__Group_13__1 : rule__Graphe__Group_13__1__Impl ;
    public final void rule__Graphe__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1584:1: ( rule__Graphe__Group_13__1__Impl )
            // InternalMyDsl.g:1585:2: rule__Graphe__Group_13__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Graphe__Group_13__1__Impl();

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
    // $ANTLR end "rule__Graphe__Group_13__1"


    // $ANTLR start "rule__Graphe__Group_13__1__Impl"
    // InternalMyDsl.g:1591:1: rule__Graphe__Group_13__1__Impl : ( ( rule__Graphe__ColonneAssignment_13_1 ) ) ;
    public final void rule__Graphe__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1595:1: ( ( ( rule__Graphe__ColonneAssignment_13_1 ) ) )
            // InternalMyDsl.g:1596:1: ( ( rule__Graphe__ColonneAssignment_13_1 ) )
            {
            // InternalMyDsl.g:1596:1: ( ( rule__Graphe__ColonneAssignment_13_1 ) )
            // InternalMyDsl.g:1597:2: ( rule__Graphe__ColonneAssignment_13_1 )
            {
             before(grammarAccess.getGrapheAccess().getColonneAssignment_13_1()); 
            // InternalMyDsl.g:1598:2: ( rule__Graphe__ColonneAssignment_13_1 )
            // InternalMyDsl.g:1598:3: rule__Graphe__ColonneAssignment_13_1
            {
            pushFollow(FOLLOW_2);
            rule__Graphe__ColonneAssignment_13_1();

            state._fsp--;


            }

             after(grammarAccess.getGrapheAccess().getColonneAssignment_13_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graphe__Group_13__1__Impl"


    // $ANTLR start "rule__Colonne__Group__0"
    // InternalMyDsl.g:1607:1: rule__Colonne__Group__0 : rule__Colonne__Group__0__Impl rule__Colonne__Group__1 ;
    public final void rule__Colonne__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1611:1: ( rule__Colonne__Group__0__Impl rule__Colonne__Group__1 )
            // InternalMyDsl.g:1612:2: rule__Colonne__Group__0__Impl rule__Colonne__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Colonne__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Colonne__Group__1();

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
    // $ANTLR end "rule__Colonne__Group__0"


    // $ANTLR start "rule__Colonne__Group__0__Impl"
    // InternalMyDsl.g:1619:1: rule__Colonne__Group__0__Impl : ( () ) ;
    public final void rule__Colonne__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1623:1: ( ( () ) )
            // InternalMyDsl.g:1624:1: ( () )
            {
            // InternalMyDsl.g:1624:1: ( () )
            // InternalMyDsl.g:1625:2: ()
            {
             before(grammarAccess.getColonneAccess().getColonneAction_0()); 
            // InternalMyDsl.g:1626:2: ()
            // InternalMyDsl.g:1626:3: 
            {
            }

             after(grammarAccess.getColonneAccess().getColonneAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne__Group__0__Impl"


    // $ANTLR start "rule__Colonne__Group__1"
    // InternalMyDsl.g:1634:1: rule__Colonne__Group__1 : rule__Colonne__Group__1__Impl rule__Colonne__Group__2 ;
    public final void rule__Colonne__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1638:1: ( rule__Colonne__Group__1__Impl rule__Colonne__Group__2 )
            // InternalMyDsl.g:1639:2: rule__Colonne__Group__1__Impl rule__Colonne__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Colonne__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Colonne__Group__2();

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
    // $ANTLR end "rule__Colonne__Group__1"


    // $ANTLR start "rule__Colonne__Group__1__Impl"
    // InternalMyDsl.g:1646:1: rule__Colonne__Group__1__Impl : ( ( rule__Colonne__NameAssignment_1 ) ) ;
    public final void rule__Colonne__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1650:1: ( ( ( rule__Colonne__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1651:1: ( ( rule__Colonne__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1651:1: ( ( rule__Colonne__NameAssignment_1 ) )
            // InternalMyDsl.g:1652:2: ( rule__Colonne__NameAssignment_1 )
            {
             before(grammarAccess.getColonneAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1653:2: ( rule__Colonne__NameAssignment_1 )
            // InternalMyDsl.g:1653:3: rule__Colonne__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Colonne__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getColonneAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne__Group__1__Impl"


    // $ANTLR start "rule__Colonne__Group__2"
    // InternalMyDsl.g:1661:1: rule__Colonne__Group__2 : rule__Colonne__Group__2__Impl rule__Colonne__Group__3 ;
    public final void rule__Colonne__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1665:1: ( rule__Colonne__Group__2__Impl rule__Colonne__Group__3 )
            // InternalMyDsl.g:1666:2: rule__Colonne__Group__2__Impl rule__Colonne__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__Colonne__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Colonne__Group__3();

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
    // $ANTLR end "rule__Colonne__Group__2"


    // $ANTLR start "rule__Colonne__Group__2__Impl"
    // InternalMyDsl.g:1673:1: rule__Colonne__Group__2__Impl : ( '{' ) ;
    public final void rule__Colonne__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1677:1: ( ( '{' ) )
            // InternalMyDsl.g:1678:1: ( '{' )
            {
            // InternalMyDsl.g:1678:1: ( '{' )
            // InternalMyDsl.g:1679:2: '{'
            {
             before(grammarAccess.getColonneAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getColonneAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne__Group__2__Impl"


    // $ANTLR start "rule__Colonne__Group__3"
    // InternalMyDsl.g:1688:1: rule__Colonne__Group__3 : rule__Colonne__Group__3__Impl rule__Colonne__Group__4 ;
    public final void rule__Colonne__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1692:1: ( rule__Colonne__Group__3__Impl rule__Colonne__Group__4 )
            // InternalMyDsl.g:1693:2: rule__Colonne__Group__3__Impl rule__Colonne__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Colonne__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Colonne__Group__4();

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
    // $ANTLR end "rule__Colonne__Group__3"


    // $ANTLR start "rule__Colonne__Group__3__Impl"
    // InternalMyDsl.g:1700:1: rule__Colonne__Group__3__Impl : ( 'label' ) ;
    public final void rule__Colonne__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1704:1: ( ( 'label' ) )
            // InternalMyDsl.g:1705:1: ( 'label' )
            {
            // InternalMyDsl.g:1705:1: ( 'label' )
            // InternalMyDsl.g:1706:2: 'label'
            {
             before(grammarAccess.getColonneAccess().getLabelKeyword_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getColonneAccess().getLabelKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne__Group__3__Impl"


    // $ANTLR start "rule__Colonne__Group__4"
    // InternalMyDsl.g:1715:1: rule__Colonne__Group__4 : rule__Colonne__Group__4__Impl rule__Colonne__Group__5 ;
    public final void rule__Colonne__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1719:1: ( rule__Colonne__Group__4__Impl rule__Colonne__Group__5 )
            // InternalMyDsl.g:1720:2: rule__Colonne__Group__4__Impl rule__Colonne__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Colonne__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Colonne__Group__5();

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
    // $ANTLR end "rule__Colonne__Group__4"


    // $ANTLR start "rule__Colonne__Group__4__Impl"
    // InternalMyDsl.g:1727:1: rule__Colonne__Group__4__Impl : ( '=' ) ;
    public final void rule__Colonne__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1731:1: ( ( '=' ) )
            // InternalMyDsl.g:1732:1: ( '=' )
            {
            // InternalMyDsl.g:1732:1: ( '=' )
            // InternalMyDsl.g:1733:2: '='
            {
             before(grammarAccess.getColonneAccess().getEqualsSignKeyword_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getColonneAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne__Group__4__Impl"


    // $ANTLR start "rule__Colonne__Group__5"
    // InternalMyDsl.g:1742:1: rule__Colonne__Group__5 : rule__Colonne__Group__5__Impl rule__Colonne__Group__6 ;
    public final void rule__Colonne__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1746:1: ( rule__Colonne__Group__5__Impl rule__Colonne__Group__6 )
            // InternalMyDsl.g:1747:2: rule__Colonne__Group__5__Impl rule__Colonne__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__Colonne__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Colonne__Group__6();

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
    // $ANTLR end "rule__Colonne__Group__5"


    // $ANTLR start "rule__Colonne__Group__5__Impl"
    // InternalMyDsl.g:1754:1: rule__Colonne__Group__5__Impl : ( ( rule__Colonne__LabelAssignment_5 ) ) ;
    public final void rule__Colonne__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1758:1: ( ( ( rule__Colonne__LabelAssignment_5 ) ) )
            // InternalMyDsl.g:1759:1: ( ( rule__Colonne__LabelAssignment_5 ) )
            {
            // InternalMyDsl.g:1759:1: ( ( rule__Colonne__LabelAssignment_5 ) )
            // InternalMyDsl.g:1760:2: ( rule__Colonne__LabelAssignment_5 )
            {
             before(grammarAccess.getColonneAccess().getLabelAssignment_5()); 
            // InternalMyDsl.g:1761:2: ( rule__Colonne__LabelAssignment_5 )
            // InternalMyDsl.g:1761:3: rule__Colonne__LabelAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Colonne__LabelAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getColonneAccess().getLabelAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne__Group__5__Impl"


    // $ANTLR start "rule__Colonne__Group__6"
    // InternalMyDsl.g:1769:1: rule__Colonne__Group__6 : rule__Colonne__Group__6__Impl rule__Colonne__Group__7 ;
    public final void rule__Colonne__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1773:1: ( rule__Colonne__Group__6__Impl rule__Colonne__Group__7 )
            // InternalMyDsl.g:1774:2: rule__Colonne__Group__6__Impl rule__Colonne__Group__7
            {
            pushFollow(FOLLOW_22);
            rule__Colonne__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Colonne__Group__7();

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
    // $ANTLR end "rule__Colonne__Group__6"


    // $ANTLR start "rule__Colonne__Group__6__Impl"
    // InternalMyDsl.g:1781:1: rule__Colonne__Group__6__Impl : ( ',' ) ;
    public final void rule__Colonne__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1785:1: ( ( ',' ) )
            // InternalMyDsl.g:1786:1: ( ',' )
            {
            // InternalMyDsl.g:1786:1: ( ',' )
            // InternalMyDsl.g:1787:2: ','
            {
             before(grammarAccess.getColonneAccess().getCommaKeyword_6()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getColonneAccess().getCommaKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne__Group__6__Impl"


    // $ANTLR start "rule__Colonne__Group__7"
    // InternalMyDsl.g:1796:1: rule__Colonne__Group__7 : rule__Colonne__Group__7__Impl rule__Colonne__Group__8 ;
    public final void rule__Colonne__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1800:1: ( rule__Colonne__Group__7__Impl rule__Colonne__Group__8 )
            // InternalMyDsl.g:1801:2: rule__Colonne__Group__7__Impl rule__Colonne__Group__8
            {
            pushFollow(FOLLOW_15);
            rule__Colonne__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Colonne__Group__8();

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
    // $ANTLR end "rule__Colonne__Group__7"


    // $ANTLR start "rule__Colonne__Group__7__Impl"
    // InternalMyDsl.g:1808:1: rule__Colonne__Group__7__Impl : ( 'color' ) ;
    public final void rule__Colonne__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1812:1: ( ( 'color' ) )
            // InternalMyDsl.g:1813:1: ( 'color' )
            {
            // InternalMyDsl.g:1813:1: ( 'color' )
            // InternalMyDsl.g:1814:2: 'color'
            {
             before(grammarAccess.getColonneAccess().getColorKeyword_7()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getColonneAccess().getColorKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne__Group__7__Impl"


    // $ANTLR start "rule__Colonne__Group__8"
    // InternalMyDsl.g:1823:1: rule__Colonne__Group__8 : rule__Colonne__Group__8__Impl rule__Colonne__Group__9 ;
    public final void rule__Colonne__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1827:1: ( rule__Colonne__Group__8__Impl rule__Colonne__Group__9 )
            // InternalMyDsl.g:1828:2: rule__Colonne__Group__8__Impl rule__Colonne__Group__9
            {
            pushFollow(FOLLOW_20);
            rule__Colonne__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Colonne__Group__9();

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
    // $ANTLR end "rule__Colonne__Group__8"


    // $ANTLR start "rule__Colonne__Group__8__Impl"
    // InternalMyDsl.g:1835:1: rule__Colonne__Group__8__Impl : ( '=' ) ;
    public final void rule__Colonne__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1839:1: ( ( '=' ) )
            // InternalMyDsl.g:1840:1: ( '=' )
            {
            // InternalMyDsl.g:1840:1: ( '=' )
            // InternalMyDsl.g:1841:2: '='
            {
             before(grammarAccess.getColonneAccess().getEqualsSignKeyword_8()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getColonneAccess().getEqualsSignKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne__Group__8__Impl"


    // $ANTLR start "rule__Colonne__Group__9"
    // InternalMyDsl.g:1850:1: rule__Colonne__Group__9 : rule__Colonne__Group__9__Impl rule__Colonne__Group__10 ;
    public final void rule__Colonne__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1854:1: ( rule__Colonne__Group__9__Impl rule__Colonne__Group__10 )
            // InternalMyDsl.g:1855:2: rule__Colonne__Group__9__Impl rule__Colonne__Group__10
            {
            pushFollow(FOLLOW_13);
            rule__Colonne__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Colonne__Group__10();

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
    // $ANTLR end "rule__Colonne__Group__9"


    // $ANTLR start "rule__Colonne__Group__9__Impl"
    // InternalMyDsl.g:1862:1: rule__Colonne__Group__9__Impl : ( ( rule__Colonne__ColorAssignment_9 ) ) ;
    public final void rule__Colonne__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1866:1: ( ( ( rule__Colonne__ColorAssignment_9 ) ) )
            // InternalMyDsl.g:1867:1: ( ( rule__Colonne__ColorAssignment_9 ) )
            {
            // InternalMyDsl.g:1867:1: ( ( rule__Colonne__ColorAssignment_9 ) )
            // InternalMyDsl.g:1868:2: ( rule__Colonne__ColorAssignment_9 )
            {
             before(grammarAccess.getColonneAccess().getColorAssignment_9()); 
            // InternalMyDsl.g:1869:2: ( rule__Colonne__ColorAssignment_9 )
            // InternalMyDsl.g:1869:3: rule__Colonne__ColorAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Colonne__ColorAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getColonneAccess().getColorAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne__Group__9__Impl"


    // $ANTLR start "rule__Colonne__Group__10"
    // InternalMyDsl.g:1877:1: rule__Colonne__Group__10 : rule__Colonne__Group__10__Impl ;
    public final void rule__Colonne__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1881:1: ( rule__Colonne__Group__10__Impl )
            // InternalMyDsl.g:1882:2: rule__Colonne__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Colonne__Group__10__Impl();

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
    // $ANTLR end "rule__Colonne__Group__10"


    // $ANTLR start "rule__Colonne__Group__10__Impl"
    // InternalMyDsl.g:1888:1: rule__Colonne__Group__10__Impl : ( '}' ) ;
    public final void rule__Colonne__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1892:1: ( ( '}' ) )
            // InternalMyDsl.g:1893:1: ( '}' )
            {
            // InternalMyDsl.g:1893:1: ( '}' )
            // InternalMyDsl.g:1894:2: '}'
            {
             before(grammarAccess.getColonneAccess().getRightCurlyBracketKeyword_10()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getColonneAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne__Group__10__Impl"


    // $ANTLR start "rule__Donner__Group__0"
    // InternalMyDsl.g:1904:1: rule__Donner__Group__0 : rule__Donner__Group__0__Impl rule__Donner__Group__1 ;
    public final void rule__Donner__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1908:1: ( rule__Donner__Group__0__Impl rule__Donner__Group__1 )
            // InternalMyDsl.g:1909:2: rule__Donner__Group__0__Impl rule__Donner__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Donner__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Donner__Group__1();

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
    // $ANTLR end "rule__Donner__Group__0"


    // $ANTLR start "rule__Donner__Group__0__Impl"
    // InternalMyDsl.g:1916:1: rule__Donner__Group__0__Impl : ( () ) ;
    public final void rule__Donner__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1920:1: ( ( () ) )
            // InternalMyDsl.g:1921:1: ( () )
            {
            // InternalMyDsl.g:1921:1: ( () )
            // InternalMyDsl.g:1922:2: ()
            {
             before(grammarAccess.getDonnerAccess().getDonnerAction_0()); 
            // InternalMyDsl.g:1923:2: ()
            // InternalMyDsl.g:1923:3: 
            {
            }

             after(grammarAccess.getDonnerAccess().getDonnerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Donner__Group__0__Impl"


    // $ANTLR start "rule__Donner__Group__1"
    // InternalMyDsl.g:1931:1: rule__Donner__Group__1 : rule__Donner__Group__1__Impl rule__Donner__Group__2 ;
    public final void rule__Donner__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1935:1: ( rule__Donner__Group__1__Impl rule__Donner__Group__2 )
            // InternalMyDsl.g:1936:2: rule__Donner__Group__1__Impl rule__Donner__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__Donner__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Donner__Group__2();

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
    // $ANTLR end "rule__Donner__Group__1"


    // $ANTLR start "rule__Donner__Group__1__Impl"
    // InternalMyDsl.g:1943:1: rule__Donner__Group__1__Impl : ( ( rule__Donner__NameAssignment_1 ) ) ;
    public final void rule__Donner__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1947:1: ( ( ( rule__Donner__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1948:1: ( ( rule__Donner__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1948:1: ( ( rule__Donner__NameAssignment_1 ) )
            // InternalMyDsl.g:1949:2: ( rule__Donner__NameAssignment_1 )
            {
             before(grammarAccess.getDonnerAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1950:2: ( rule__Donner__NameAssignment_1 )
            // InternalMyDsl.g:1950:3: rule__Donner__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Donner__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDonnerAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Donner__Group__1__Impl"


    // $ANTLR start "rule__Donner__Group__2"
    // InternalMyDsl.g:1958:1: rule__Donner__Group__2 : rule__Donner__Group__2__Impl rule__Donner__Group__3 ;
    public final void rule__Donner__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1962:1: ( rule__Donner__Group__2__Impl rule__Donner__Group__3 )
            // InternalMyDsl.g:1963:2: rule__Donner__Group__2__Impl rule__Donner__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Donner__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Donner__Group__3();

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
    // $ANTLR end "rule__Donner__Group__2"


    // $ANTLR start "rule__Donner__Group__2__Impl"
    // InternalMyDsl.g:1970:1: rule__Donner__Group__2__Impl : ( '(' ) ;
    public final void rule__Donner__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1974:1: ( ( '(' ) )
            // InternalMyDsl.g:1975:1: ( '(' )
            {
            // InternalMyDsl.g:1975:1: ( '(' )
            // InternalMyDsl.g:1976:2: '('
            {
             before(grammarAccess.getDonnerAccess().getLeftParenthesisKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getDonnerAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Donner__Group__2__Impl"


    // $ANTLR start "rule__Donner__Group__3"
    // InternalMyDsl.g:1985:1: rule__Donner__Group__3 : rule__Donner__Group__3__Impl rule__Donner__Group__4 ;
    public final void rule__Donner__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1989:1: ( rule__Donner__Group__3__Impl rule__Donner__Group__4 )
            // InternalMyDsl.g:1990:2: rule__Donner__Group__3__Impl rule__Donner__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__Donner__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Donner__Group__4();

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
    // $ANTLR end "rule__Donner__Group__3"


    // $ANTLR start "rule__Donner__Group__3__Impl"
    // InternalMyDsl.g:1997:1: rule__Donner__Group__3__Impl : ( ( rule__Donner__LinkAssignment_3 ) ) ;
    public final void rule__Donner__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2001:1: ( ( ( rule__Donner__LinkAssignment_3 ) ) )
            // InternalMyDsl.g:2002:1: ( ( rule__Donner__LinkAssignment_3 ) )
            {
            // InternalMyDsl.g:2002:1: ( ( rule__Donner__LinkAssignment_3 ) )
            // InternalMyDsl.g:2003:2: ( rule__Donner__LinkAssignment_3 )
            {
             before(grammarAccess.getDonnerAccess().getLinkAssignment_3()); 
            // InternalMyDsl.g:2004:2: ( rule__Donner__LinkAssignment_3 )
            // InternalMyDsl.g:2004:3: rule__Donner__LinkAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Donner__LinkAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDonnerAccess().getLinkAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Donner__Group__3__Impl"


    // $ANTLR start "rule__Donner__Group__4"
    // InternalMyDsl.g:2012:1: rule__Donner__Group__4 : rule__Donner__Group__4__Impl ;
    public final void rule__Donner__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2016:1: ( rule__Donner__Group__4__Impl )
            // InternalMyDsl.g:2017:2: rule__Donner__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Donner__Group__4__Impl();

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
    // $ANTLR end "rule__Donner__Group__4"


    // $ANTLR start "rule__Donner__Group__4__Impl"
    // InternalMyDsl.g:2023:1: rule__Donner__Group__4__Impl : ( ')' ) ;
    public final void rule__Donner__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2027:1: ( ( ')' ) )
            // InternalMyDsl.g:2028:1: ( ')' )
            {
            // InternalMyDsl.g:2028:1: ( ')' )
            // InternalMyDsl.g:2029:2: ')'
            {
             before(grammarAccess.getDonnerAccess().getRightParenthesisKeyword_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getDonnerAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Donner__Group__4__Impl"


    // $ANTLR start "rule__Programme__NameAssignment_3"
    // InternalMyDsl.g:2039:1: rule__Programme__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__Programme__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2043:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2044:2: ( ruleEString )
            {
            // InternalMyDsl.g:2044:2: ( ruleEString )
            // InternalMyDsl.g:2045:3: ruleEString
            {
             before(grammarAccess.getProgrammeAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getProgrammeAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programme__NameAssignment_3"


    // $ANTLR start "rule__Programme__DonnerAssignment_7"
    // InternalMyDsl.g:2054:1: rule__Programme__DonnerAssignment_7 : ( ruleDonner ) ;
    public final void rule__Programme__DonnerAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2058:1: ( ( ruleDonner ) )
            // InternalMyDsl.g:2059:2: ( ruleDonner )
            {
            // InternalMyDsl.g:2059:2: ( ruleDonner )
            // InternalMyDsl.g:2060:3: ruleDonner
            {
             before(grammarAccess.getProgrammeAccess().getDonnerDonnerParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleDonner();

            state._fsp--;

             after(grammarAccess.getProgrammeAccess().getDonnerDonnerParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programme__DonnerAssignment_7"


    // $ANTLR start "rule__Programme__DonnerAssignment_8_1"
    // InternalMyDsl.g:2069:1: rule__Programme__DonnerAssignment_8_1 : ( ruleDonner ) ;
    public final void rule__Programme__DonnerAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2073:1: ( ( ruleDonner ) )
            // InternalMyDsl.g:2074:2: ( ruleDonner )
            {
            // InternalMyDsl.g:2074:2: ( ruleDonner )
            // InternalMyDsl.g:2075:3: ruleDonner
            {
             before(grammarAccess.getProgrammeAccess().getDonnerDonnerParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDonner();

            state._fsp--;

             after(grammarAccess.getProgrammeAccess().getDonnerDonnerParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programme__DonnerAssignment_8_1"


    // $ANTLR start "rule__Programme__ColonneAssignment_12"
    // InternalMyDsl.g:2084:1: rule__Programme__ColonneAssignment_12 : ( ruleColonne ) ;
    public final void rule__Programme__ColonneAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2088:1: ( ( ruleColonne ) )
            // InternalMyDsl.g:2089:2: ( ruleColonne )
            {
            // InternalMyDsl.g:2089:2: ( ruleColonne )
            // InternalMyDsl.g:2090:3: ruleColonne
            {
             before(grammarAccess.getProgrammeAccess().getColonneColonneParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleColonne();

            state._fsp--;

             after(grammarAccess.getProgrammeAccess().getColonneColonneParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programme__ColonneAssignment_12"


    // $ANTLR start "rule__Programme__ColonneAssignment_13_1"
    // InternalMyDsl.g:2099:1: rule__Programme__ColonneAssignment_13_1 : ( ruleColonne ) ;
    public final void rule__Programme__ColonneAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2103:1: ( ( ruleColonne ) )
            // InternalMyDsl.g:2104:2: ( ruleColonne )
            {
            // InternalMyDsl.g:2104:2: ( ruleColonne )
            // InternalMyDsl.g:2105:3: ruleColonne
            {
             before(grammarAccess.getProgrammeAccess().getColonneColonneParserRuleCall_13_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColonne();

            state._fsp--;

             after(grammarAccess.getProgrammeAccess().getColonneColonneParserRuleCall_13_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programme__ColonneAssignment_13_1"


    // $ANTLR start "rule__Programme__GrapheAssignment_17"
    // InternalMyDsl.g:2114:1: rule__Programme__GrapheAssignment_17 : ( ruleGraphe ) ;
    public final void rule__Programme__GrapheAssignment_17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2118:1: ( ( ruleGraphe ) )
            // InternalMyDsl.g:2119:2: ( ruleGraphe )
            {
            // InternalMyDsl.g:2119:2: ( ruleGraphe )
            // InternalMyDsl.g:2120:3: ruleGraphe
            {
             before(grammarAccess.getProgrammeAccess().getGrapheGrapheParserRuleCall_17_0()); 
            pushFollow(FOLLOW_2);
            ruleGraphe();

            state._fsp--;

             after(grammarAccess.getProgrammeAccess().getGrapheGrapheParserRuleCall_17_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programme__GrapheAssignment_17"


    // $ANTLR start "rule__Programme__GrapheAssignment_18_1"
    // InternalMyDsl.g:2129:1: rule__Programme__GrapheAssignment_18_1 : ( ruleGraphe ) ;
    public final void rule__Programme__GrapheAssignment_18_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2133:1: ( ( ruleGraphe ) )
            // InternalMyDsl.g:2134:2: ( ruleGraphe )
            {
            // InternalMyDsl.g:2134:2: ( ruleGraphe )
            // InternalMyDsl.g:2135:3: ruleGraphe
            {
             before(grammarAccess.getProgrammeAccess().getGrapheGrapheParserRuleCall_18_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGraphe();

            state._fsp--;

             after(grammarAccess.getProgrammeAccess().getGrapheGrapheParserRuleCall_18_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Programme__GrapheAssignment_18_1"


    // $ANTLR start "rule__Graphe__NameAssignment_0"
    // InternalMyDsl.g:2144:1: rule__Graphe__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Graphe__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2148:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2149:2: ( ruleEString )
            {
            // InternalMyDsl.g:2149:2: ( ruleEString )
            // InternalMyDsl.g:2150:3: ruleEString
            {
             before(grammarAccess.getGrapheAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGrapheAccess().getNameEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graphe__NameAssignment_0"


    // $ANTLR start "rule__Graphe__DataAssignment_4"
    // InternalMyDsl.g:2159:1: rule__Graphe__DataAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Graphe__DataAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2163:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:2164:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:2164:2: ( ( ruleEString ) )
            // InternalMyDsl.g:2165:3: ( ruleEString )
            {
             before(grammarAccess.getGrapheAccess().getDataDonnerCrossReference_4_0()); 
            // InternalMyDsl.g:2166:3: ( ruleEString )
            // InternalMyDsl.g:2167:4: ruleEString
            {
             before(grammarAccess.getGrapheAccess().getDataDonnerEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGrapheAccess().getDataDonnerEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getGrapheAccess().getDataDonnerCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graphe__DataAssignment_4"


    // $ANTLR start "rule__Graphe__TypeAssignment_8"
    // InternalMyDsl.g:2178:1: rule__Graphe__TypeAssignment_8 : ( ruleTypeGraphe ) ;
    public final void rule__Graphe__TypeAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2182:1: ( ( ruleTypeGraphe ) )
            // InternalMyDsl.g:2183:2: ( ruleTypeGraphe )
            {
            // InternalMyDsl.g:2183:2: ( ruleTypeGraphe )
            // InternalMyDsl.g:2184:3: ruleTypeGraphe
            {
             before(grammarAccess.getGrapheAccess().getTypeTypeGrapheEnumRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeGraphe();

            state._fsp--;

             after(grammarAccess.getGrapheAccess().getTypeTypeGrapheEnumRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graphe__TypeAssignment_8"


    // $ANTLR start "rule__Graphe__ColonneAssignment_12"
    // InternalMyDsl.g:2193:1: rule__Graphe__ColonneAssignment_12 : ( ( ruleEString ) ) ;
    public final void rule__Graphe__ColonneAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2197:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:2198:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:2198:2: ( ( ruleEString ) )
            // InternalMyDsl.g:2199:3: ( ruleEString )
            {
             before(grammarAccess.getGrapheAccess().getColonneColonneCrossReference_12_0()); 
            // InternalMyDsl.g:2200:3: ( ruleEString )
            // InternalMyDsl.g:2201:4: ruleEString
            {
             before(grammarAccess.getGrapheAccess().getColonneColonneEStringParserRuleCall_12_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGrapheAccess().getColonneColonneEStringParserRuleCall_12_0_1()); 

            }

             after(grammarAccess.getGrapheAccess().getColonneColonneCrossReference_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graphe__ColonneAssignment_12"


    // $ANTLR start "rule__Graphe__ColonneAssignment_13_1"
    // InternalMyDsl.g:2212:1: rule__Graphe__ColonneAssignment_13_1 : ( ( ruleEString ) ) ;
    public final void rule__Graphe__ColonneAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2216:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:2217:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:2217:2: ( ( ruleEString ) )
            // InternalMyDsl.g:2218:3: ( ruleEString )
            {
             before(grammarAccess.getGrapheAccess().getColonneColonneCrossReference_13_1_0()); 
            // InternalMyDsl.g:2219:3: ( ruleEString )
            // InternalMyDsl.g:2220:4: ruleEString
            {
             before(grammarAccess.getGrapheAccess().getColonneColonneEStringParserRuleCall_13_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGrapheAccess().getColonneColonneEStringParserRuleCall_13_1_0_1()); 

            }

             after(grammarAccess.getGrapheAccess().getColonneColonneCrossReference_13_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graphe__ColonneAssignment_13_1"


    // $ANTLR start "rule__Graphe__BagColorAssignment_17"
    // InternalMyDsl.g:2231:1: rule__Graphe__BagColorAssignment_17 : ( ruleCouleurs ) ;
    public final void rule__Graphe__BagColorAssignment_17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2235:1: ( ( ruleCouleurs ) )
            // InternalMyDsl.g:2236:2: ( ruleCouleurs )
            {
            // InternalMyDsl.g:2236:2: ( ruleCouleurs )
            // InternalMyDsl.g:2237:3: ruleCouleurs
            {
             before(grammarAccess.getGrapheAccess().getBagColorCouleursEnumRuleCall_17_0()); 
            pushFollow(FOLLOW_2);
            ruleCouleurs();

            state._fsp--;

             after(grammarAccess.getGrapheAccess().getBagColorCouleursEnumRuleCall_17_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graphe__BagColorAssignment_17"


    // $ANTLR start "rule__Colonne__NameAssignment_1"
    // InternalMyDsl.g:2246:1: rule__Colonne__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Colonne__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2250:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2251:2: ( ruleEString )
            {
            // InternalMyDsl.g:2251:2: ( ruleEString )
            // InternalMyDsl.g:2252:3: ruleEString
            {
             before(grammarAccess.getColonneAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getColonneAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne__NameAssignment_1"


    // $ANTLR start "rule__Colonne__LabelAssignment_5"
    // InternalMyDsl.g:2261:1: rule__Colonne__LabelAssignment_5 : ( ruleEString ) ;
    public final void rule__Colonne__LabelAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2265:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2266:2: ( ruleEString )
            {
            // InternalMyDsl.g:2266:2: ( ruleEString )
            // InternalMyDsl.g:2267:3: ruleEString
            {
             before(grammarAccess.getColonneAccess().getLabelEStringParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getColonneAccess().getLabelEStringParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne__LabelAssignment_5"


    // $ANTLR start "rule__Colonne__ColorAssignment_9"
    // InternalMyDsl.g:2276:1: rule__Colonne__ColorAssignment_9 : ( ruleCouleurs ) ;
    public final void rule__Colonne__ColorAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2280:1: ( ( ruleCouleurs ) )
            // InternalMyDsl.g:2281:2: ( ruleCouleurs )
            {
            // InternalMyDsl.g:2281:2: ( ruleCouleurs )
            // InternalMyDsl.g:2282:3: ruleCouleurs
            {
             before(grammarAccess.getColonneAccess().getColorCouleursEnumRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleCouleurs();

            state._fsp--;

             after(grammarAccess.getColonneAccess().getColorCouleursEnumRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Colonne__ColorAssignment_9"


    // $ANTLR start "rule__Donner__NameAssignment_1"
    // InternalMyDsl.g:2291:1: rule__Donner__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Donner__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2295:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2296:2: ( ruleEString )
            {
            // InternalMyDsl.g:2296:2: ( ruleEString )
            // InternalMyDsl.g:2297:3: ruleEString
            {
             before(grammarAccess.getDonnerAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDonnerAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Donner__NameAssignment_1"


    // $ANTLR start "rule__Donner__LinkAssignment_3"
    // InternalMyDsl.g:2306:1: rule__Donner__LinkAssignment_3 : ( ruleEString ) ;
    public final void rule__Donner__LinkAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2310:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2311:2: ( ruleEString )
            {
            // InternalMyDsl.g:2311:2: ( ruleEString )
            // InternalMyDsl.g:2312:3: ruleEString
            {
             before(grammarAccess.getDonnerAccess().getLinkEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDonnerAccess().getLinkEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Donner__LinkAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});

}