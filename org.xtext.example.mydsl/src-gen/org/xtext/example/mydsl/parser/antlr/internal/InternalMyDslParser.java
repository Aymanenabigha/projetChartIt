package org.xtext.example.mydsl.parser.antlr.internal;

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
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'P'", "':'", "'{'", "'donner'", "','", "'}'", "'colonne'", "'graphe'", "'data'", "'='", "'type'", "'bagColor'", "'label'", "'color'", "'('", "')'", "'line'", "'bar'", "'pie'", "'red'", "'blue'", "'green'", "'pink'"
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

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Programme";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProgramme"
    // InternalMyDsl.g:65:1: entryRuleProgramme returns [EObject current=null] : iv_ruleProgramme= ruleProgramme EOF ;
    public final EObject entryRuleProgramme() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgramme = null;


        try {
            // InternalMyDsl.g:65:50: (iv_ruleProgramme= ruleProgramme EOF )
            // InternalMyDsl.g:66:2: iv_ruleProgramme= ruleProgramme EOF
            {
             newCompositeNode(grammarAccess.getProgrammeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgramme=ruleProgramme();

            state._fsp--;

             current =iv_ruleProgramme; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProgramme"


    // $ANTLR start "ruleProgramme"
    // InternalMyDsl.g:72:1: ruleProgramme returns [EObject current=null] : ( () otherlv_1= 'P' otherlv_2= ':' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'donner' otherlv_6= '{' ( (lv_donner_7_0= ruleDonner ) )+ (otherlv_8= ',' ( (lv_donner_9_0= ruleDonner ) ) )* otherlv_10= '}' otherlv_11= 'colonne' otherlv_12= '{' ( (lv_colonne_13_0= ruleColonne ) )+ (otherlv_14= ',' ( (lv_colonne_15_0= ruleColonne ) ) )* otherlv_16= '}' otherlv_17= 'graphe' otherlv_18= '{' ( (lv_graphe_19_0= ruleGraphe ) )+ (otherlv_20= ',' ( (lv_graphe_21_0= ruleGraphe ) ) )* otherlv_22= '}' otherlv_23= '}' ) ;
    public final EObject ruleProgramme() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_donner_7_0 = null;

        EObject lv_donner_9_0 = null;

        EObject lv_colonne_13_0 = null;

        EObject lv_colonne_15_0 = null;

        EObject lv_graphe_19_0 = null;

        EObject lv_graphe_21_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:78:2: ( ( () otherlv_1= 'P' otherlv_2= ':' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'donner' otherlv_6= '{' ( (lv_donner_7_0= ruleDonner ) )+ (otherlv_8= ',' ( (lv_donner_9_0= ruleDonner ) ) )* otherlv_10= '}' otherlv_11= 'colonne' otherlv_12= '{' ( (lv_colonne_13_0= ruleColonne ) )+ (otherlv_14= ',' ( (lv_colonne_15_0= ruleColonne ) ) )* otherlv_16= '}' otherlv_17= 'graphe' otherlv_18= '{' ( (lv_graphe_19_0= ruleGraphe ) )+ (otherlv_20= ',' ( (lv_graphe_21_0= ruleGraphe ) ) )* otherlv_22= '}' otherlv_23= '}' ) )
            // InternalMyDsl.g:79:2: ( () otherlv_1= 'P' otherlv_2= ':' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'donner' otherlv_6= '{' ( (lv_donner_7_0= ruleDonner ) )+ (otherlv_8= ',' ( (lv_donner_9_0= ruleDonner ) ) )* otherlv_10= '}' otherlv_11= 'colonne' otherlv_12= '{' ( (lv_colonne_13_0= ruleColonne ) )+ (otherlv_14= ',' ( (lv_colonne_15_0= ruleColonne ) ) )* otherlv_16= '}' otherlv_17= 'graphe' otherlv_18= '{' ( (lv_graphe_19_0= ruleGraphe ) )+ (otherlv_20= ',' ( (lv_graphe_21_0= ruleGraphe ) ) )* otherlv_22= '}' otherlv_23= '}' )
            {
            // InternalMyDsl.g:79:2: ( () otherlv_1= 'P' otherlv_2= ':' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'donner' otherlv_6= '{' ( (lv_donner_7_0= ruleDonner ) )+ (otherlv_8= ',' ( (lv_donner_9_0= ruleDonner ) ) )* otherlv_10= '}' otherlv_11= 'colonne' otherlv_12= '{' ( (lv_colonne_13_0= ruleColonne ) )+ (otherlv_14= ',' ( (lv_colonne_15_0= ruleColonne ) ) )* otherlv_16= '}' otherlv_17= 'graphe' otherlv_18= '{' ( (lv_graphe_19_0= ruleGraphe ) )+ (otherlv_20= ',' ( (lv_graphe_21_0= ruleGraphe ) ) )* otherlv_22= '}' otherlv_23= '}' )
            // InternalMyDsl.g:80:3: () otherlv_1= 'P' otherlv_2= ':' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'donner' otherlv_6= '{' ( (lv_donner_7_0= ruleDonner ) )+ (otherlv_8= ',' ( (lv_donner_9_0= ruleDonner ) ) )* otherlv_10= '}' otherlv_11= 'colonne' otherlv_12= '{' ( (lv_colonne_13_0= ruleColonne ) )+ (otherlv_14= ',' ( (lv_colonne_15_0= ruleColonne ) ) )* otherlv_16= '}' otherlv_17= 'graphe' otherlv_18= '{' ( (lv_graphe_19_0= ruleGraphe ) )+ (otherlv_20= ',' ( (lv_graphe_21_0= ruleGraphe ) ) )* otherlv_22= '}' otherlv_23= '}'
            {
            // InternalMyDsl.g:80:3: ()
            // InternalMyDsl.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProgrammeAccess().getProgrammeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getProgrammeAccess().getPKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getProgrammeAccess().getColonKeyword_2());
            		
            // InternalMyDsl.g:95:3: ( (lv_name_3_0= ruleEString ) )
            // InternalMyDsl.g:96:4: (lv_name_3_0= ruleEString )
            {
            // InternalMyDsl.g:96:4: (lv_name_3_0= ruleEString )
            // InternalMyDsl.g:97:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getProgrammeAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgrammeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getProgrammeAccess().getLeftCurlyBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getProgrammeAccess().getDonnerKeyword_5());
            		
            otherlv_6=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getProgrammeAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalMyDsl.g:126:3: ( (lv_donner_7_0= ruleDonner ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_STRING && LA1_0<=RULE_ID)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:127:4: (lv_donner_7_0= ruleDonner )
            	    {
            	    // InternalMyDsl.g:127:4: (lv_donner_7_0= ruleDonner )
            	    // InternalMyDsl.g:128:5: lv_donner_7_0= ruleDonner
            	    {

            	    					newCompositeNode(grammarAccess.getProgrammeAccess().getDonnerDonnerParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_donner_7_0=ruleDonner();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProgrammeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"donner",
            	    						lv_donner_7_0,
            	    						"org.xtext.example.mydsl.MyDsl.Donner");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            // InternalMyDsl.g:145:3: (otherlv_8= ',' ( (lv_donner_9_0= ruleDonner ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:146:4: otherlv_8= ',' ( (lv_donner_9_0= ruleDonner ) )
            	    {
            	    otherlv_8=(Token)match(input,15,FOLLOW_4); 

            	    				newLeafNode(otherlv_8, grammarAccess.getProgrammeAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalMyDsl.g:150:4: ( (lv_donner_9_0= ruleDonner ) )
            	    // InternalMyDsl.g:151:5: (lv_donner_9_0= ruleDonner )
            	    {
            	    // InternalMyDsl.g:151:5: (lv_donner_9_0= ruleDonner )
            	    // InternalMyDsl.g:152:6: lv_donner_9_0= ruleDonner
            	    {

            	    						newCompositeNode(grammarAccess.getProgrammeAccess().getDonnerDonnerParserRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_donner_9_0=ruleDonner();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProgrammeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"donner",
            	    							lv_donner_9_0,
            	    							"org.xtext.example.mydsl.MyDsl.Donner");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_10=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_10, grammarAccess.getProgrammeAccess().getRightCurlyBracketKeyword_9());
            		
            otherlv_11=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_11, grammarAccess.getProgrammeAccess().getColonneKeyword_10());
            		
            otherlv_12=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_12, grammarAccess.getProgrammeAccess().getLeftCurlyBracketKeyword_11());
            		
            // InternalMyDsl.g:182:3: ( (lv_colonne_13_0= ruleColonne ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=RULE_STRING && LA3_0<=RULE_ID)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:183:4: (lv_colonne_13_0= ruleColonne )
            	    {
            	    // InternalMyDsl.g:183:4: (lv_colonne_13_0= ruleColonne )
            	    // InternalMyDsl.g:184:5: lv_colonne_13_0= ruleColonne
            	    {

            	    					newCompositeNode(grammarAccess.getProgrammeAccess().getColonneColonneParserRuleCall_12_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_colonne_13_0=ruleColonne();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProgrammeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"colonne",
            	    						lv_colonne_13_0,
            	    						"org.xtext.example.mydsl.MyDsl.Colonne");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            // InternalMyDsl.g:201:3: (otherlv_14= ',' ( (lv_colonne_15_0= ruleColonne ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:202:4: otherlv_14= ',' ( (lv_colonne_15_0= ruleColonne ) )
            	    {
            	    otherlv_14=(Token)match(input,15,FOLLOW_4); 

            	    				newLeafNode(otherlv_14, grammarAccess.getProgrammeAccess().getCommaKeyword_13_0());
            	    			
            	    // InternalMyDsl.g:206:4: ( (lv_colonne_15_0= ruleColonne ) )
            	    // InternalMyDsl.g:207:5: (lv_colonne_15_0= ruleColonne )
            	    {
            	    // InternalMyDsl.g:207:5: (lv_colonne_15_0= ruleColonne )
            	    // InternalMyDsl.g:208:6: lv_colonne_15_0= ruleColonne
            	    {

            	    						newCompositeNode(grammarAccess.getProgrammeAccess().getColonneColonneParserRuleCall_13_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_colonne_15_0=ruleColonne();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProgrammeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"colonne",
            	    							lv_colonne_15_0,
            	    							"org.xtext.example.mydsl.MyDsl.Colonne");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_16=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_16, grammarAccess.getProgrammeAccess().getRightCurlyBracketKeyword_14());
            		
            otherlv_17=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_17, grammarAccess.getProgrammeAccess().getGrapheKeyword_15());
            		
            otherlv_18=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_18, grammarAccess.getProgrammeAccess().getLeftCurlyBracketKeyword_16());
            		
            // InternalMyDsl.g:238:3: ( (lv_graphe_19_0= ruleGraphe ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_ID)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:239:4: (lv_graphe_19_0= ruleGraphe )
            	    {
            	    // InternalMyDsl.g:239:4: (lv_graphe_19_0= ruleGraphe )
            	    // InternalMyDsl.g:240:5: lv_graphe_19_0= ruleGraphe
            	    {

            	    					newCompositeNode(grammarAccess.getProgrammeAccess().getGrapheGrapheParserRuleCall_17_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_graphe_19_0=ruleGraphe();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProgrammeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"graphe",
            	    						lv_graphe_19_0,
            	    						"org.xtext.example.mydsl.MyDsl.Graphe");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            // InternalMyDsl.g:257:3: (otherlv_20= ',' ( (lv_graphe_21_0= ruleGraphe ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:258:4: otherlv_20= ',' ( (lv_graphe_21_0= ruleGraphe ) )
            	    {
            	    otherlv_20=(Token)match(input,15,FOLLOW_4); 

            	    				newLeafNode(otherlv_20, grammarAccess.getProgrammeAccess().getCommaKeyword_18_0());
            	    			
            	    // InternalMyDsl.g:262:4: ( (lv_graphe_21_0= ruleGraphe ) )
            	    // InternalMyDsl.g:263:5: (lv_graphe_21_0= ruleGraphe )
            	    {
            	    // InternalMyDsl.g:263:5: (lv_graphe_21_0= ruleGraphe )
            	    // InternalMyDsl.g:264:6: lv_graphe_21_0= ruleGraphe
            	    {

            	    						newCompositeNode(grammarAccess.getProgrammeAccess().getGrapheGrapheParserRuleCall_18_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_graphe_21_0=ruleGraphe();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProgrammeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"graphe",
            	    							lv_graphe_21_0,
            	    							"org.xtext.example.mydsl.MyDsl.Graphe");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_22=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_22, grammarAccess.getProgrammeAccess().getRightCurlyBracketKeyword_19());
            		
            otherlv_23=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_23, grammarAccess.getProgrammeAccess().getRightCurlyBracketKeyword_20());
            		

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
    // $ANTLR end "ruleProgramme"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:294:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:294:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:295:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:301:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:307:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:308:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:308:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:309:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:317:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleGraphe"
    // InternalMyDsl.g:328:1: entryRuleGraphe returns [EObject current=null] : iv_ruleGraphe= ruleGraphe EOF ;
    public final EObject entryRuleGraphe() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphe = null;


        try {
            // InternalMyDsl.g:328:47: (iv_ruleGraphe= ruleGraphe EOF )
            // InternalMyDsl.g:329:2: iv_ruleGraphe= ruleGraphe EOF
            {
             newCompositeNode(grammarAccess.getGrapheRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphe=ruleGraphe();

            state._fsp--;

             current =iv_ruleGraphe; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGraphe"


    // $ANTLR start "ruleGraphe"
    // InternalMyDsl.g:335:1: ruleGraphe returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'data' otherlv_3= '=' ( ( ruleEString ) ) otherlv_5= ',' otherlv_6= 'type' otherlv_7= '=' ( (lv_type_8_0= ruleTypeGraphe ) ) otherlv_9= ',' otherlv_10= 'colonne' otherlv_11= '=' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ',' otherlv_16= 'bagColor' otherlv_17= '=' ( (lv_bagColor_18_0= ruleCouleurs ) ) otherlv_19= '}' ) ;
    public final EObject ruleGraphe() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        Enumerator lv_type_8_0 = null;

        Enumerator lv_bagColor_18_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:341:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'data' otherlv_3= '=' ( ( ruleEString ) ) otherlv_5= ',' otherlv_6= 'type' otherlv_7= '=' ( (lv_type_8_0= ruleTypeGraphe ) ) otherlv_9= ',' otherlv_10= 'colonne' otherlv_11= '=' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ',' otherlv_16= 'bagColor' otherlv_17= '=' ( (lv_bagColor_18_0= ruleCouleurs ) ) otherlv_19= '}' ) )
            // InternalMyDsl.g:342:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'data' otherlv_3= '=' ( ( ruleEString ) ) otherlv_5= ',' otherlv_6= 'type' otherlv_7= '=' ( (lv_type_8_0= ruleTypeGraphe ) ) otherlv_9= ',' otherlv_10= 'colonne' otherlv_11= '=' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ',' otherlv_16= 'bagColor' otherlv_17= '=' ( (lv_bagColor_18_0= ruleCouleurs ) ) otherlv_19= '}' )
            {
            // InternalMyDsl.g:342:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'data' otherlv_3= '=' ( ( ruleEString ) ) otherlv_5= ',' otherlv_6= 'type' otherlv_7= '=' ( (lv_type_8_0= ruleTypeGraphe ) ) otherlv_9= ',' otherlv_10= 'colonne' otherlv_11= '=' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ',' otherlv_16= 'bagColor' otherlv_17= '=' ( (lv_bagColor_18_0= ruleCouleurs ) ) otherlv_19= '}' )
            // InternalMyDsl.g:343:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'data' otherlv_3= '=' ( ( ruleEString ) ) otherlv_5= ',' otherlv_6= 'type' otherlv_7= '=' ( (lv_type_8_0= ruleTypeGraphe ) ) otherlv_9= ',' otherlv_10= 'colonne' otherlv_11= '=' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ',' otherlv_16= 'bagColor' otherlv_17= '=' ( (lv_bagColor_18_0= ruleCouleurs ) ) otherlv_19= '}'
            {
            // InternalMyDsl.g:343:3: ( (lv_name_0_0= ruleEString ) )
            // InternalMyDsl.g:344:4: (lv_name_0_0= ruleEString )
            {
            // InternalMyDsl.g:344:4: (lv_name_0_0= ruleEString )
            // InternalMyDsl.g:345:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGrapheAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGrapheRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getGrapheAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getGrapheAccess().getDataKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getGrapheAccess().getEqualsSignKeyword_3());
            		
            // InternalMyDsl.g:374:3: ( ( ruleEString ) )
            // InternalMyDsl.g:375:4: ( ruleEString )
            {
            // InternalMyDsl.g:375:4: ( ruleEString )
            // InternalMyDsl.g:376:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGrapheRule());
            					}
            				

            					newCompositeNode(grammarAccess.getGrapheAccess().getDataDonnerCrossReference_4_0());
            				
            pushFollow(FOLLOW_14);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_15); 

            			newLeafNode(otherlv_5, grammarAccess.getGrapheAccess().getCommaKeyword_5());
            		
            otherlv_6=(Token)match(input,21,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getGrapheAccess().getTypeKeyword_6());
            		
            otherlv_7=(Token)match(input,20,FOLLOW_16); 

            			newLeafNode(otherlv_7, grammarAccess.getGrapheAccess().getEqualsSignKeyword_7());
            		
            // InternalMyDsl.g:402:3: ( (lv_type_8_0= ruleTypeGraphe ) )
            // InternalMyDsl.g:403:4: (lv_type_8_0= ruleTypeGraphe )
            {
            // InternalMyDsl.g:403:4: (lv_type_8_0= ruleTypeGraphe )
            // InternalMyDsl.g:404:5: lv_type_8_0= ruleTypeGraphe
            {

            					newCompositeNode(grammarAccess.getGrapheAccess().getTypeTypeGrapheEnumRuleCall_8_0());
            				
            pushFollow(FOLLOW_14);
            lv_type_8_0=ruleTypeGraphe();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGrapheRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_8_0,
            						"org.xtext.example.mydsl.MyDsl.TypeGraphe");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_9, grammarAccess.getGrapheAccess().getCommaKeyword_9());
            		
            otherlv_10=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_10, grammarAccess.getGrapheAccess().getColonneKeyword_10());
            		
            otherlv_11=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_11, grammarAccess.getGrapheAccess().getEqualsSignKeyword_11());
            		
            // InternalMyDsl.g:433:3: ( ( ruleEString ) )
            // InternalMyDsl.g:434:4: ( ruleEString )
            {
            // InternalMyDsl.g:434:4: ( ruleEString )
            // InternalMyDsl.g:435:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGrapheRule());
            					}
            				

            					newCompositeNode(grammarAccess.getGrapheAccess().getColonneColonneCrossReference_12_0());
            				
            pushFollow(FOLLOW_14);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:449:3: (otherlv_13= ',' ( ( ruleEString ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15) ) {
                    int LA8_1 = input.LA(2);

                    if ( ((LA8_1>=RULE_STRING && LA8_1<=RULE_ID)) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:450:4: otherlv_13= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_13=(Token)match(input,15,FOLLOW_4); 

            	    				newLeafNode(otherlv_13, grammarAccess.getGrapheAccess().getCommaKeyword_13_0());
            	    			
            	    // InternalMyDsl.g:454:4: ( ( ruleEString ) )
            	    // InternalMyDsl.g:455:5: ( ruleEString )
            	    {
            	    // InternalMyDsl.g:455:5: ( ruleEString )
            	    // InternalMyDsl.g:456:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getGrapheRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getGrapheAccess().getColonneColonneCrossReference_13_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_15=(Token)match(input,15,FOLLOW_17); 

            			newLeafNode(otherlv_15, grammarAccess.getGrapheAccess().getCommaKeyword_14());
            		
            otherlv_16=(Token)match(input,22,FOLLOW_13); 

            			newLeafNode(otherlv_16, grammarAccess.getGrapheAccess().getBagColorKeyword_15());
            		
            otherlv_17=(Token)match(input,20,FOLLOW_18); 

            			newLeafNode(otherlv_17, grammarAccess.getGrapheAccess().getEqualsSignKeyword_16());
            		
            // InternalMyDsl.g:483:3: ( (lv_bagColor_18_0= ruleCouleurs ) )
            // InternalMyDsl.g:484:4: (lv_bagColor_18_0= ruleCouleurs )
            {
            // InternalMyDsl.g:484:4: (lv_bagColor_18_0= ruleCouleurs )
            // InternalMyDsl.g:485:5: lv_bagColor_18_0= ruleCouleurs
            {

            					newCompositeNode(grammarAccess.getGrapheAccess().getBagColorCouleursEnumRuleCall_17_0());
            				
            pushFollow(FOLLOW_11);
            lv_bagColor_18_0=ruleCouleurs();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGrapheRule());
            					}
            					set(
            						current,
            						"bagColor",
            						lv_bagColor_18_0,
            						"org.xtext.example.mydsl.MyDsl.Couleurs");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_19=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getGrapheAccess().getRightCurlyBracketKeyword_18());
            		

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
    // $ANTLR end "ruleGraphe"


    // $ANTLR start "entryRuleColonne"
    // InternalMyDsl.g:510:1: entryRuleColonne returns [EObject current=null] : iv_ruleColonne= ruleColonne EOF ;
    public final EObject entryRuleColonne() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColonne = null;


        try {
            // InternalMyDsl.g:510:48: (iv_ruleColonne= ruleColonne EOF )
            // InternalMyDsl.g:511:2: iv_ruleColonne= ruleColonne EOF
            {
             newCompositeNode(grammarAccess.getColonneRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColonne=ruleColonne();

            state._fsp--;

             current =iv_ruleColonne; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleColonne"


    // $ANTLR start "ruleColonne"
    // InternalMyDsl.g:517:1: ruleColonne returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'label' otherlv_4= '=' ( (lv_label_5_0= ruleEString ) ) otherlv_6= ',' otherlv_7= 'color' otherlv_8= '=' ( (lv_color_9_0= ruleCouleurs ) ) otherlv_10= '}' ) ;
    public final EObject ruleColonne() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_label_5_0 = null;

        Enumerator lv_color_9_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:523:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'label' otherlv_4= '=' ( (lv_label_5_0= ruleEString ) ) otherlv_6= ',' otherlv_7= 'color' otherlv_8= '=' ( (lv_color_9_0= ruleCouleurs ) ) otherlv_10= '}' ) )
            // InternalMyDsl.g:524:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'label' otherlv_4= '=' ( (lv_label_5_0= ruleEString ) ) otherlv_6= ',' otherlv_7= 'color' otherlv_8= '=' ( (lv_color_9_0= ruleCouleurs ) ) otherlv_10= '}' )
            {
            // InternalMyDsl.g:524:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'label' otherlv_4= '=' ( (lv_label_5_0= ruleEString ) ) otherlv_6= ',' otherlv_7= 'color' otherlv_8= '=' ( (lv_color_9_0= ruleCouleurs ) ) otherlv_10= '}' )
            // InternalMyDsl.g:525:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'label' otherlv_4= '=' ( (lv_label_5_0= ruleEString ) ) otherlv_6= ',' otherlv_7= 'color' otherlv_8= '=' ( (lv_color_9_0= ruleCouleurs ) ) otherlv_10= '}'
            {
            // InternalMyDsl.g:525:3: ()
            // InternalMyDsl.g:526:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getColonneAccess().getColonneAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:532:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:533:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:533:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:534:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getColonneAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColonneRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getColonneAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getColonneAccess().getLabelKeyword_3());
            		
            otherlv_4=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getColonneAccess().getEqualsSignKeyword_4());
            		
            // InternalMyDsl.g:563:3: ( (lv_label_5_0= ruleEString ) )
            // InternalMyDsl.g:564:4: (lv_label_5_0= ruleEString )
            {
            // InternalMyDsl.g:564:4: (lv_label_5_0= ruleEString )
            // InternalMyDsl.g:565:5: lv_label_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getColonneAccess().getLabelEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_14);
            lv_label_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColonneRule());
            					}
            					set(
            						current,
            						"label",
            						lv_label_5_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_20); 

            			newLeafNode(otherlv_6, grammarAccess.getColonneAccess().getCommaKeyword_6());
            		
            otherlv_7=(Token)match(input,24,FOLLOW_13); 

            			newLeafNode(otherlv_7, grammarAccess.getColonneAccess().getColorKeyword_7());
            		
            otherlv_8=(Token)match(input,20,FOLLOW_18); 

            			newLeafNode(otherlv_8, grammarAccess.getColonneAccess().getEqualsSignKeyword_8());
            		
            // InternalMyDsl.g:594:3: ( (lv_color_9_0= ruleCouleurs ) )
            // InternalMyDsl.g:595:4: (lv_color_9_0= ruleCouleurs )
            {
            // InternalMyDsl.g:595:4: (lv_color_9_0= ruleCouleurs )
            // InternalMyDsl.g:596:5: lv_color_9_0= ruleCouleurs
            {

            					newCompositeNode(grammarAccess.getColonneAccess().getColorCouleursEnumRuleCall_9_0());
            				
            pushFollow(FOLLOW_11);
            lv_color_9_0=ruleCouleurs();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColonneRule());
            					}
            					set(
            						current,
            						"color",
            						lv_color_9_0,
            						"org.xtext.example.mydsl.MyDsl.Couleurs");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getColonneAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleColonne"


    // $ANTLR start "entryRuleDonner"
    // InternalMyDsl.g:621:1: entryRuleDonner returns [EObject current=null] : iv_ruleDonner= ruleDonner EOF ;
    public final EObject entryRuleDonner() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDonner = null;


        try {
            // InternalMyDsl.g:621:47: (iv_ruleDonner= ruleDonner EOF )
            // InternalMyDsl.g:622:2: iv_ruleDonner= ruleDonner EOF
            {
             newCompositeNode(grammarAccess.getDonnerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDonner=ruleDonner();

            state._fsp--;

             current =iv_ruleDonner; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDonner"


    // $ANTLR start "ruleDonner"
    // InternalMyDsl.g:628:1: ruleDonner returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_link_3_0= ruleEString ) ) otherlv_4= ')' ) ;
    public final EObject ruleDonner() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_link_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:634:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_link_3_0= ruleEString ) ) otherlv_4= ')' ) )
            // InternalMyDsl.g:635:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_link_3_0= ruleEString ) ) otherlv_4= ')' )
            {
            // InternalMyDsl.g:635:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_link_3_0= ruleEString ) ) otherlv_4= ')' )
            // InternalMyDsl.g:636:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_link_3_0= ruleEString ) ) otherlv_4= ')'
            {
            // InternalMyDsl.g:636:3: ()
            // InternalMyDsl.g:637:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDonnerAccess().getDonnerAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:643:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:644:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:644:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:645:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDonnerAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_21);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDonnerRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getDonnerAccess().getLeftParenthesisKeyword_2());
            		
            // InternalMyDsl.g:666:3: ( (lv_link_3_0= ruleEString ) )
            // InternalMyDsl.g:667:4: (lv_link_3_0= ruleEString )
            {
            // InternalMyDsl.g:667:4: (lv_link_3_0= ruleEString )
            // InternalMyDsl.g:668:5: lv_link_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDonnerAccess().getLinkEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_22);
            lv_link_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDonnerRule());
            					}
            					set(
            						current,
            						"link",
            						lv_link_3_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDonnerAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleDonner"


    // $ANTLR start "ruleTypeGraphe"
    // InternalMyDsl.g:693:1: ruleTypeGraphe returns [Enumerator current=null] : ( (enumLiteral_0= 'line' ) | (enumLiteral_1= 'bar' ) | (enumLiteral_2= 'pie' ) ) ;
    public final Enumerator ruleTypeGraphe() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:699:2: ( ( (enumLiteral_0= 'line' ) | (enumLiteral_1= 'bar' ) | (enumLiteral_2= 'pie' ) ) )
            // InternalMyDsl.g:700:2: ( (enumLiteral_0= 'line' ) | (enumLiteral_1= 'bar' ) | (enumLiteral_2= 'pie' ) )
            {
            // InternalMyDsl.g:700:2: ( (enumLiteral_0= 'line' ) | (enumLiteral_1= 'bar' ) | (enumLiteral_2= 'pie' ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt9=1;
                }
                break;
            case 28:
                {
                alt9=2;
                }
                break;
            case 29:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:701:3: (enumLiteral_0= 'line' )
                    {
                    // InternalMyDsl.g:701:3: (enumLiteral_0= 'line' )
                    // InternalMyDsl.g:702:4: enumLiteral_0= 'line'
                    {
                    enumLiteral_0=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getTypeGrapheAccess().getLineEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeGrapheAccess().getLineEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:709:3: (enumLiteral_1= 'bar' )
                    {
                    // InternalMyDsl.g:709:3: (enumLiteral_1= 'bar' )
                    // InternalMyDsl.g:710:4: enumLiteral_1= 'bar'
                    {
                    enumLiteral_1=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getTypeGrapheAccess().getBarEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeGrapheAccess().getBarEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:717:3: (enumLiteral_2= 'pie' )
                    {
                    // InternalMyDsl.g:717:3: (enumLiteral_2= 'pie' )
                    // InternalMyDsl.g:718:4: enumLiteral_2= 'pie'
                    {
                    enumLiteral_2=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getTypeGrapheAccess().getPieEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTypeGrapheAccess().getPieEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleTypeGraphe"


    // $ANTLR start "ruleCouleurs"
    // InternalMyDsl.g:728:1: ruleCouleurs returns [Enumerator current=null] : ( (enumLiteral_0= 'red' ) | (enumLiteral_1= 'blue' ) | (enumLiteral_2= 'green' ) | (enumLiteral_3= 'pink' ) ) ;
    public final Enumerator ruleCouleurs() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:734:2: ( ( (enumLiteral_0= 'red' ) | (enumLiteral_1= 'blue' ) | (enumLiteral_2= 'green' ) | (enumLiteral_3= 'pink' ) ) )
            // InternalMyDsl.g:735:2: ( (enumLiteral_0= 'red' ) | (enumLiteral_1= 'blue' ) | (enumLiteral_2= 'green' ) | (enumLiteral_3= 'pink' ) )
            {
            // InternalMyDsl.g:735:2: ( (enumLiteral_0= 'red' ) | (enumLiteral_1= 'blue' ) | (enumLiteral_2= 'green' ) | (enumLiteral_3= 'pink' ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt10=1;
                }
                break;
            case 31:
                {
                alt10=2;
                }
                break;
            case 32:
                {
                alt10=3;
                }
                break;
            case 33:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:736:3: (enumLiteral_0= 'red' )
                    {
                    // InternalMyDsl.g:736:3: (enumLiteral_0= 'red' )
                    // InternalMyDsl.g:737:4: enumLiteral_0= 'red'
                    {
                    enumLiteral_0=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getCouleursAccess().getRedEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCouleursAccess().getRedEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:744:3: (enumLiteral_1= 'blue' )
                    {
                    // InternalMyDsl.g:744:3: (enumLiteral_1= 'blue' )
                    // InternalMyDsl.g:745:4: enumLiteral_1= 'blue'
                    {
                    enumLiteral_1=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getCouleursAccess().getBlueEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCouleursAccess().getBlueEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:752:3: (enumLiteral_2= 'green' )
                    {
                    // InternalMyDsl.g:752:3: (enumLiteral_2= 'green' )
                    // InternalMyDsl.g:753:4: enumLiteral_2= 'green'
                    {
                    enumLiteral_2=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getCouleursAccess().getGreenEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCouleursAccess().getGreenEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:760:3: (enumLiteral_3= 'pink' )
                    {
                    // InternalMyDsl.g:760:3: (enumLiteral_3= 'pink' )
                    // InternalMyDsl.g:761:4: enumLiteral_3= 'pink'
                    {
                    enumLiteral_3=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getCouleursAccess().getPinkEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getCouleursAccess().getPinkEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleCouleurs"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000038000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000003C0000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});

}