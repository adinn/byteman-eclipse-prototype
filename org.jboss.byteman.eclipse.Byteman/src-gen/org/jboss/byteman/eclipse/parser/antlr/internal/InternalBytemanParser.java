package org.jboss.byteman.eclipse.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.jboss.byteman.eclipse.services.BytemanGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBytemanParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_EOL", "RULE_START_RULE", "RULE_END_RULE", "RULE_KEYWORD_CLASS", "RULE_KEYWORD_INTERFACE", "RULE_KEYWORD_METHOD", "RULE_ID", "RULE_INIT", "RULE_CLINIT", "RULE_KEYWORD_RETURN", "RULE_INTVAL", "RULE_DOLLAR", "RULE_LPAREN", "RULE_COMMA", "RULE_RPAREN", "RULE_KEYWORD_BIND", "RULE_NOTHING", "RULE_SEMICOLON", "RULE_ASSIGN", "RULE_COLON", "RULE_IF", "RULE_DO", "RULE_KEYWORD_THROW", "RULE_PLUS", "RULE_MINUS", "RULE_TIMES", "RULE_DIV", "RULE_MOD", "RULE_BAND", "RULE_BOR", "RULE_BXOR", "RULE_BNOT", "RULE_OR", "RULE_AND", "RULE_NOT", "RULE_EQ", "RULE_GT", "RULE_GE", "RULE_LE", "RULE_LT", "RULE_NE", "RULE_LSQUARE", "RULE_RSQUARE", "RULE_DOT", "RULE_NEW", "RULE_STRING", "RULE_BOOLEAN", "RULE_FLOATVAL", "RULE_QMARK", "RULE_NULL", "RULE_EXPONENT", "RULE_FLOATTYPESUFFIX", "RULE_INTTYPESUFFIX", "RULE_WS", "RULE_HASH", "RULE_BM_COMMENT", "'HELPER'", "'AT'", "'AFTER'", "'ENTRY'", "'EXIT'", "'LINE'", "'READ'", "'WRITE'", "'INVOKE'", "'CALL'", "'SYNCHRONIZE'", "'THROW'", "'ALL'", "'$#'", "'$!'", "'$^'", "'$@'", "'$*'"
    };
    public static final int T__68=68;
    public static final int RULE_BOOLEAN=50;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int RULE_ID=10;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int RULE_DO=25;
    public static final int RULE_SEMICOLON=21;
    public static final int RULE_OR=36;
    public static final int RULE_EOL=4;
    public static final int RULE_KEYWORD_CLASS=7;
    public static final int RULE_AND=37;
    public static final int RULE_BM_COMMENT=59;
    public static final int RULE_INTTYPESUFFIX=56;
    public static final int T__61=61;
    public static final int RULE_RSQUARE=46;
    public static final int EOF=-1;
    public static final int T__60=60;
    public static final int RULE_NOT=38;
    public static final int RULE_BNOT=35;
    public static final int RULE_LT=43;
    public static final int RULE_ASSIGN=22;
    public static final int RULE_MOD=31;
    public static final int RULE_DOT=47;
    public static final int RULE_INIT=11;
    public static final int RULE_LE=42;
    public static final int RULE_LPAREN=16;
    public static final int RULE_GT=40;
    public static final int RULE_LSQUARE=45;
    public static final int RULE_NOTHING=20;
    public static final int RULE_BOR=33;
    public static final int RULE_GE=41;
    public static final int RULE_CLINIT=12;
    public static final int RULE_BAND=32;
    public static final int RULE_QMARK=52;
    public static final int RULE_KEYWORD_METHOD=9;
    public static final int RULE_PLUS=27;
    public static final int RULE_INTVAL=14;
    public static final int RULE_HASH=58;
    public static final int RULE_COMMA=17;
    public static final int RULE_FLOATVAL=51;
    public static final int RULE_KEYWORD_RETURN=13;
    public static final int RULE_FLOATTYPESUFFIX=55;
    public static final int RULE_START_RULE=5;
    public static final int RULE_NULL=53;
    public static final int RULE_TIMES=29;
    public static final int RULE_KEYWORD_THROW=26;
    public static final int RULE_DOLLAR=15;
    public static final int RULE_MINUS=28;
    public static final int RULE_KEYWORD_BIND=19;
    public static final int RULE_COLON=23;
    public static final int RULE_STRING=49;
    public static final int T__71=71;
    public static final int RULE_END_RULE=6;
    public static final int RULE_NEW=48;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int RULE_NE=44;
    public static final int RULE_EXPONENT=54;
    public static final int RULE_KEYWORD_INTERFACE=8;
    public static final int RULE_BXOR=34;
    public static final int RULE_EQ=39;
    public static final int RULE_DIV=30;
    public static final int RULE_RPAREN=18;
    public static final int RULE_WS=57;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int RULE_IF=24;
    public static final int T__77=77;

    // delegates
    // delegators


        public InternalBytemanParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBytemanParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBytemanParser.tokenNames; }
    public String getGrammarFileName() { return "../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g"; }



     	private BytemanGrammarAccess grammarAccess;
     	
        public InternalBytemanParser(TokenStream input, BytemanGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "DomainModel";	
       	}
       	
       	@Override
       	protected BytemanGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleDomainModel"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:67:1: entryRuleDomainModel returns [EObject current=null] : iv_ruleDomainModel= ruleDomainModel EOF ;
    public final EObject entryRuleDomainModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainModel = null;


        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:68:2: (iv_ruleDomainModel= ruleDomainModel EOF )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:69:2: iv_ruleDomainModel= ruleDomainModel EOF
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
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:76:1: ruleDomainModel returns [EObject current=null] : ( () ( ( (lv_elements_1_0= ruleElement ) ) | this_EOL_2= RULE_EOL )* ) ;
    public final EObject ruleDomainModel() throws RecognitionException {
        EObject current = null;

        Token this_EOL_2=null;
        EObject lv_elements_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:79:28: ( ( () ( ( (lv_elements_1_0= ruleElement ) ) | this_EOL_2= RULE_EOL )* ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:80:1: ( () ( ( (lv_elements_1_0= ruleElement ) ) | this_EOL_2= RULE_EOL )* )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:80:1: ( () ( ( (lv_elements_1_0= ruleElement ) ) | this_EOL_2= RULE_EOL )* )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:80:2: () ( ( (lv_elements_1_0= ruleElement ) ) | this_EOL_2= RULE_EOL )*
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:80:2: ()
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDomainModelAccess().getDomainModelAction_0(),
                        current);
                

            }

            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:86:2: ( ( (lv_elements_1_0= ruleElement ) ) | this_EOL_2= RULE_EOL )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_START_RULE||LA1_0==60) ) {
                    alt1=1;
                }
                else if ( (LA1_0==RULE_EOL) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:86:3: ( (lv_elements_1_0= ruleElement ) )
            	    {
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:86:3: ( (lv_elements_1_0= ruleElement ) )
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:87:1: (lv_elements_1_0= ruleElement )
            	    {
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:87:1: (lv_elements_1_0= ruleElement )
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:88:3: lv_elements_1_0= ruleElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDomainModelAccess().getElementsElementParserRuleCall_1_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleElement_in_ruleDomainModel141);
            	    lv_elements_1_0=ruleElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDomainModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_1_0, 
            	            		"Element");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:105:6: this_EOL_2= RULE_EOL
            	    {
            	    this_EOL_2=(Token)match(input,RULE_EOL,FOLLOW_RULE_EOL_in_ruleDomainModel158); 
            	     
            	        newLeafNode(this_EOL_2, grammarAccess.getDomainModelAccess().getEOLTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end "ruleDomainModel"


    // $ANTLR start "entryRuleElement"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:117:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:118:2: (iv_ruleElement= ruleElement EOF )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:119:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_ruleElement_in_entryRuleElement195);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElement205); 

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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:126:1: ruleElement returns [EObject current=null] : (this_BytemanRule_0= ruleBytemanRule | this_Helper_1= ruleHelper ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_BytemanRule_0 = null;

        EObject this_Helper_1 = null;


         enterRule(); 
            
        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:129:28: ( (this_BytemanRule_0= ruleBytemanRule | this_Helper_1= ruleHelper ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:130:1: (this_BytemanRule_0= ruleBytemanRule | this_Helper_1= ruleHelper )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:130:1: (this_BytemanRule_0= ruleBytemanRule | this_Helper_1= ruleHelper )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_START_RULE) ) {
                alt2=1;
            }
            else if ( (LA2_0==60) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:131:5: this_BytemanRule_0= ruleBytemanRule
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getBytemanRuleParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleBytemanRule_in_ruleElement252);
                    this_BytemanRule_0=ruleBytemanRule();

                    state._fsp--;

                     
                            current = this_BytemanRule_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:141:5: this_Helper_1= ruleHelper
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getHelperParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleHelper_in_ruleElement279);
                    this_Helper_1=ruleHelper();

                    state._fsp--;

                     
                            current = this_Helper_1; 
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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleBytemanRule"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:157:1: entryRuleBytemanRule returns [EObject current=null] : iv_ruleBytemanRule= ruleBytemanRule EOF ;
    public final EObject entryRuleBytemanRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBytemanRule = null;


        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:158:2: (iv_ruleBytemanRule= ruleBytemanRule EOF )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:159:2: iv_ruleBytemanRule= ruleBytemanRule EOF
            {
             newCompositeNode(grammarAccess.getBytemanRuleRule()); 
            pushFollow(FOLLOW_ruleBytemanRule_in_entryRuleBytemanRule314);
            iv_ruleBytemanRule=ruleBytemanRule();

            state._fsp--;

             current =iv_ruleBytemanRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBytemanRule324); 

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
    // $ANTLR end "entryRuleBytemanRule"


    // $ANTLR start "ruleBytemanRule"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:166:1: ruleBytemanRule returns [EObject current=null] : ( ( (lv_name_0_0= RULE_START_RULE ) ) (this_EOL_1= RULE_EOL )* ( (lv_event_2_0= ruleEvent ) ) ( (lv_body_3_0= ruleBody ) ) this_END_RULE_4= RULE_END_RULE this_EOL_5= RULE_EOL ) ;
    public final EObject ruleBytemanRule() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token this_EOL_1=null;
        Token this_END_RULE_4=null;
        Token this_EOL_5=null;
        EObject lv_event_2_0 = null;

        EObject lv_body_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:169:28: ( ( ( (lv_name_0_0= RULE_START_RULE ) ) (this_EOL_1= RULE_EOL )* ( (lv_event_2_0= ruleEvent ) ) ( (lv_body_3_0= ruleBody ) ) this_END_RULE_4= RULE_END_RULE this_EOL_5= RULE_EOL ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:170:1: ( ( (lv_name_0_0= RULE_START_RULE ) ) (this_EOL_1= RULE_EOL )* ( (lv_event_2_0= ruleEvent ) ) ( (lv_body_3_0= ruleBody ) ) this_END_RULE_4= RULE_END_RULE this_EOL_5= RULE_EOL )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:170:1: ( ( (lv_name_0_0= RULE_START_RULE ) ) (this_EOL_1= RULE_EOL )* ( (lv_event_2_0= ruleEvent ) ) ( (lv_body_3_0= ruleBody ) ) this_END_RULE_4= RULE_END_RULE this_EOL_5= RULE_EOL )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:170:2: ( (lv_name_0_0= RULE_START_RULE ) ) (this_EOL_1= RULE_EOL )* ( (lv_event_2_0= ruleEvent ) ) ( (lv_body_3_0= ruleBody ) ) this_END_RULE_4= RULE_END_RULE this_EOL_5= RULE_EOL
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:170:2: ( (lv_name_0_0= RULE_START_RULE ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:171:1: (lv_name_0_0= RULE_START_RULE )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:171:1: (lv_name_0_0= RULE_START_RULE )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:172:3: lv_name_0_0= RULE_START_RULE
            {
            lv_name_0_0=(Token)match(input,RULE_START_RULE,FOLLOW_RULE_START_RULE_in_ruleBytemanRule366); 

            			newLeafNode(lv_name_0_0, grammarAccess.getBytemanRuleAccess().getNameSTART_RULETerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBytemanRuleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"START_RULE");
            	    

            }


            }

            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:188:2: (this_EOL_1= RULE_EOL )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_EOL) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:188:3: this_EOL_1= RULE_EOL
            	    {
            	    this_EOL_1=(Token)match(input,RULE_EOL,FOLLOW_RULE_EOL_in_ruleBytemanRule383); 
            	     
            	        newLeafNode(this_EOL_1, grammarAccess.getBytemanRuleAccess().getEOLTerminalRuleCall_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:192:3: ( (lv_event_2_0= ruleEvent ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:193:1: (lv_event_2_0= ruleEvent )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:193:1: (lv_event_2_0= ruleEvent )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:194:3: lv_event_2_0= ruleEvent
            {
             
            	        newCompositeNode(grammarAccess.getBytemanRuleAccess().getEventEventParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleEvent_in_ruleBytemanRule405);
            lv_event_2_0=ruleEvent();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBytemanRuleRule());
            	        }
                   		set(
                   			current, 
                   			"event",
                    		lv_event_2_0, 
                    		"Event");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:210:2: ( (lv_body_3_0= ruleBody ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:211:1: (lv_body_3_0= ruleBody )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:211:1: (lv_body_3_0= ruleBody )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:212:3: lv_body_3_0= ruleBody
            {
             
            	        newCompositeNode(grammarAccess.getBytemanRuleAccess().getBodyBodyParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleBody_in_ruleBytemanRule426);
            lv_body_3_0=ruleBody();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBytemanRuleRule());
            	        }
                   		set(
                   			current, 
                   			"body",
                    		lv_body_3_0, 
                    		"Body");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_END_RULE_4=(Token)match(input,RULE_END_RULE,FOLLOW_RULE_END_RULE_in_ruleBytemanRule437); 
             
                newLeafNode(this_END_RULE_4, grammarAccess.getBytemanRuleAccess().getEND_RULETerminalRuleCall_4()); 
                
            this_EOL_5=(Token)match(input,RULE_EOL,FOLLOW_RULE_EOL_in_ruleBytemanRule447); 
             
                newLeafNode(this_EOL_5, grammarAccess.getBytemanRuleAccess().getEOLTerminalRuleCall_5()); 
                

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
    // $ANTLR end "ruleBytemanRule"


    // $ANTLR start "entryRuleBody"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:244:1: entryRuleBody returns [EObject current=null] : iv_ruleBody= ruleBody EOF ;
    public final EObject entryRuleBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBody = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_BM_COMMENT", "RULE_EOL");
        	
        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:248:2: (iv_ruleBody= ruleBody EOF )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:249:2: iv_ruleBody= ruleBody EOF
            {
             newCompositeNode(grammarAccess.getBodyRule()); 
            pushFollow(FOLLOW_ruleBody_in_entryRuleBody488);
            iv_ruleBody=ruleBody();

            state._fsp--;

             current =iv_ruleBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBody498); 

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
    // $ANTLR end "entryRuleBody"


    // $ANTLR start "ruleBody"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:259:1: ruleBody returns [EObject current=null] : ( ( (lv_bind_0_0= ruleBind ) )? ( (lv_condition_1_0= ruleCondition ) ) ( (lv_actions_2_0= ruleActions ) ) ) ;
    public final EObject ruleBody() throws RecognitionException {
        EObject current = null;

        EObject lv_bind_0_0 = null;

        EObject lv_condition_1_0 = null;

        EObject lv_actions_2_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_BM_COMMENT", "RULE_EOL");
            
        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:263:28: ( ( ( (lv_bind_0_0= ruleBind ) )? ( (lv_condition_1_0= ruleCondition ) ) ( (lv_actions_2_0= ruleActions ) ) ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:264:1: ( ( (lv_bind_0_0= ruleBind ) )? ( (lv_condition_1_0= ruleCondition ) ) ( (lv_actions_2_0= ruleActions ) ) )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:264:1: ( ( (lv_bind_0_0= ruleBind ) )? ( (lv_condition_1_0= ruleCondition ) ) ( (lv_actions_2_0= ruleActions ) ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:264:2: ( (lv_bind_0_0= ruleBind ) )? ( (lv_condition_1_0= ruleCondition ) ) ( (lv_actions_2_0= ruleActions ) )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:264:2: ( (lv_bind_0_0= ruleBind ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_KEYWORD_BIND) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:265:1: (lv_bind_0_0= ruleBind )
                    {
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:265:1: (lv_bind_0_0= ruleBind )
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:266:3: lv_bind_0_0= ruleBind
                    {
                     
                    	        newCompositeNode(grammarAccess.getBodyAccess().getBindBindParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBind_in_ruleBody548);
                    lv_bind_0_0=ruleBind();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBodyRule());
                    	        }
                           		set(
                           			current, 
                           			"bind",
                            		lv_bind_0_0, 
                            		"Bind");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:282:3: ( (lv_condition_1_0= ruleCondition ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:283:1: (lv_condition_1_0= ruleCondition )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:283:1: (lv_condition_1_0= ruleCondition )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:284:3: lv_condition_1_0= ruleCondition
            {
             
            	        newCompositeNode(grammarAccess.getBodyAccess().getConditionConditionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleCondition_in_ruleBody570);
            lv_condition_1_0=ruleCondition();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBodyRule());
            	        }
                   		set(
                   			current, 
                   			"condition",
                    		lv_condition_1_0, 
                    		"Condition");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:300:2: ( (lv_actions_2_0= ruleActions ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:301:1: (lv_actions_2_0= ruleActions )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:301:1: (lv_actions_2_0= ruleActions )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:302:3: lv_actions_2_0= ruleActions
            {
             
            	        newCompositeNode(grammarAccess.getBodyAccess().getActionsActionsParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleActions_in_ruleBody591);
            lv_actions_2_0=ruleActions();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBodyRule());
            	        }
                   		set(
                   			current, 
                   			"actions",
                    		lv_actions_2_0, 
                    		"Actions");
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleBody"


    // $ANTLR start "entryRuleEvent"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:329:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:330:2: (iv_ruleEvent= ruleEvent EOF )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:331:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent631);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent641); 

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
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:338:1: ruleEvent returns [EObject current=null] : ( ( ( (lv_class_0_0= ruleEventClass ) ) | ( (lv_interface_1_0= ruleEventInterface ) ) ) (this_EOL_2= RULE_EOL )* ( (lv_method_3_0= ruleEventMethod ) ) (this_EOL_4= RULE_EOL )* ( ( (lv_helper_5_0= ruleHelper ) ) (this_EOL_6= RULE_EOL )* )? ( ( (lv_locationSpec_7_0= ruleLocationSpecifier ) ) (this_EOL_8= RULE_EOL )* )? ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token this_EOL_2=null;
        Token this_EOL_4=null;
        Token this_EOL_6=null;
        Token this_EOL_8=null;
        EObject lv_class_0_0 = null;

        EObject lv_interface_1_0 = null;

        EObject lv_method_3_0 = null;

        EObject lv_helper_5_0 = null;

        EObject lv_locationSpec_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:341:28: ( ( ( ( (lv_class_0_0= ruleEventClass ) ) | ( (lv_interface_1_0= ruleEventInterface ) ) ) (this_EOL_2= RULE_EOL )* ( (lv_method_3_0= ruleEventMethod ) ) (this_EOL_4= RULE_EOL )* ( ( (lv_helper_5_0= ruleHelper ) ) (this_EOL_6= RULE_EOL )* )? ( ( (lv_locationSpec_7_0= ruleLocationSpecifier ) ) (this_EOL_8= RULE_EOL )* )? ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:342:1: ( ( ( (lv_class_0_0= ruleEventClass ) ) | ( (lv_interface_1_0= ruleEventInterface ) ) ) (this_EOL_2= RULE_EOL )* ( (lv_method_3_0= ruleEventMethod ) ) (this_EOL_4= RULE_EOL )* ( ( (lv_helper_5_0= ruleHelper ) ) (this_EOL_6= RULE_EOL )* )? ( ( (lv_locationSpec_7_0= ruleLocationSpecifier ) ) (this_EOL_8= RULE_EOL )* )? )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:342:1: ( ( ( (lv_class_0_0= ruleEventClass ) ) | ( (lv_interface_1_0= ruleEventInterface ) ) ) (this_EOL_2= RULE_EOL )* ( (lv_method_3_0= ruleEventMethod ) ) (this_EOL_4= RULE_EOL )* ( ( (lv_helper_5_0= ruleHelper ) ) (this_EOL_6= RULE_EOL )* )? ( ( (lv_locationSpec_7_0= ruleLocationSpecifier ) ) (this_EOL_8= RULE_EOL )* )? )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:342:2: ( ( (lv_class_0_0= ruleEventClass ) ) | ( (lv_interface_1_0= ruleEventInterface ) ) ) (this_EOL_2= RULE_EOL )* ( (lv_method_3_0= ruleEventMethod ) ) (this_EOL_4= RULE_EOL )* ( ( (lv_helper_5_0= ruleHelper ) ) (this_EOL_6= RULE_EOL )* )? ( ( (lv_locationSpec_7_0= ruleLocationSpecifier ) ) (this_EOL_8= RULE_EOL )* )?
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:342:2: ( ( (lv_class_0_0= ruleEventClass ) ) | ( (lv_interface_1_0= ruleEventInterface ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_KEYWORD_CLASS) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_KEYWORD_INTERFACE) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:342:3: ( (lv_class_0_0= ruleEventClass ) )
                    {
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:342:3: ( (lv_class_0_0= ruleEventClass ) )
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:343:1: (lv_class_0_0= ruleEventClass )
                    {
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:343:1: (lv_class_0_0= ruleEventClass )
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:344:3: lv_class_0_0= ruleEventClass
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getClassEventClassParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEventClass_in_ruleEvent688);
                    lv_class_0_0=ruleEventClass();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	        }
                           		set(
                           			current, 
                           			"class",
                            		lv_class_0_0, 
                            		"EventClass");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:361:6: ( (lv_interface_1_0= ruleEventInterface ) )
                    {
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:361:6: ( (lv_interface_1_0= ruleEventInterface ) )
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:362:1: (lv_interface_1_0= ruleEventInterface )
                    {
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:362:1: (lv_interface_1_0= ruleEventInterface )
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:363:3: lv_interface_1_0= ruleEventInterface
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getInterfaceEventInterfaceParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEventInterface_in_ruleEvent715);
                    lv_interface_1_0=ruleEventInterface();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	        }
                           		set(
                           			current, 
                           			"interface",
                            		lv_interface_1_0, 
                            		"EventInterface");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:379:3: (this_EOL_2= RULE_EOL )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_EOL) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:379:4: this_EOL_2= RULE_EOL
            	    {
            	    this_EOL_2=(Token)match(input,RULE_EOL,FOLLOW_RULE_EOL_in_ruleEvent728); 
            	     
            	        newLeafNode(this_EOL_2, grammarAccess.getEventAccess().getEOLTerminalRuleCall_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:383:3: ( (lv_method_3_0= ruleEventMethod ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:384:1: (lv_method_3_0= ruleEventMethod )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:384:1: (lv_method_3_0= ruleEventMethod )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:385:3: lv_method_3_0= ruleEventMethod
            {
             
            	        newCompositeNode(grammarAccess.getEventAccess().getMethodEventMethodParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleEventMethod_in_ruleEvent750);
            lv_method_3_0=ruleEventMethod();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEventRule());
            	        }
                   		set(
                   			current, 
                   			"method",
                    		lv_method_3_0, 
                    		"EventMethod");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:401:2: (this_EOL_4= RULE_EOL )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_EOL) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:401:3: this_EOL_4= RULE_EOL
            	    {
            	    this_EOL_4=(Token)match(input,RULE_EOL,FOLLOW_RULE_EOL_in_ruleEvent762); 
            	     
            	        newLeafNode(this_EOL_4, grammarAccess.getEventAccess().getEOLTerminalRuleCall_3()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:405:3: ( ( (lv_helper_5_0= ruleHelper ) ) (this_EOL_6= RULE_EOL )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==60) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:405:4: ( (lv_helper_5_0= ruleHelper ) ) (this_EOL_6= RULE_EOL )*
                    {
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:405:4: ( (lv_helper_5_0= ruleHelper ) )
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:406:1: (lv_helper_5_0= ruleHelper )
                    {
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:406:1: (lv_helper_5_0= ruleHelper )
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:407:3: lv_helper_5_0= ruleHelper
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getHelperHelperParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleHelper_in_ruleEvent785);
                    lv_helper_5_0=ruleHelper();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	        }
                           		set(
                           			current, 
                           			"helper",
                            		lv_helper_5_0, 
                            		"Helper");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:423:2: (this_EOL_6= RULE_EOL )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==RULE_EOL) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:423:3: this_EOL_6= RULE_EOL
                    	    {
                    	    this_EOL_6=(Token)match(input,RULE_EOL,FOLLOW_RULE_EOL_in_ruleEvent797); 
                    	     
                    	        newLeafNode(this_EOL_6, grammarAccess.getEventAccess().getEOLTerminalRuleCall_4_1()); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:427:5: ( ( (lv_locationSpec_7_0= ruleLocationSpecifier ) ) (this_EOL_8= RULE_EOL )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=61 && LA11_0<=62)||LA11_0==65) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:427:6: ( (lv_locationSpec_7_0= ruleLocationSpecifier ) ) (this_EOL_8= RULE_EOL )*
                    {
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:427:6: ( (lv_locationSpec_7_0= ruleLocationSpecifier ) )
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:428:1: (lv_locationSpec_7_0= ruleLocationSpecifier )
                    {
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:428:1: (lv_locationSpec_7_0= ruleLocationSpecifier )
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:429:3: lv_locationSpec_7_0= ruleLocationSpecifier
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getLocationSpecLocationSpecifierParserRuleCall_5_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLocationSpecifier_in_ruleEvent822);
                    lv_locationSpec_7_0=ruleLocationSpecifier();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	        }
                           		set(
                           			current, 
                           			"locationSpec",
                            		lv_locationSpec_7_0, 
                            		"LocationSpecifier");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:445:2: (this_EOL_8= RULE_EOL )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==RULE_EOL) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:445:3: this_EOL_8= RULE_EOL
                    	    {
                    	    this_EOL_8=(Token)match(input,RULE_EOL,FOLLOW_RULE_EOL_in_ruleEvent834); 
                    	     
                    	        newLeafNode(this_EOL_8, grammarAccess.getEventAccess().getEOLTerminalRuleCall_5_1()); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
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
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleEventClass"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:457:1: entryRuleEventClass returns [EObject current=null] : iv_ruleEventClass= ruleEventClass EOF ;
    public final EObject entryRuleEventClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventClass = null;


        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:458:2: (iv_ruleEventClass= ruleEventClass EOF )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:459:2: iv_ruleEventClass= ruleEventClass EOF
            {
             newCompositeNode(grammarAccess.getEventClassRule()); 
            pushFollow(FOLLOW_ruleEventClass_in_entryRuleEventClass873);
            iv_ruleEventClass=ruleEventClass();

            state._fsp--;

             current =iv_ruleEventClass; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventClass883); 

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
    // $ANTLR end "entryRuleEventClass"


    // $ANTLR start "ruleEventClass"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:466:1: ruleEventClass returns [EObject current=null] : ( ( (lv_keyword_0_0= RULE_KEYWORD_CLASS ) ) ( (lv_name_1_0= ruleQualifiedName ) ) ) ;
    public final EObject ruleEventClass() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_0_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:469:28: ( ( ( (lv_keyword_0_0= RULE_KEYWORD_CLASS ) ) ( (lv_name_1_0= ruleQualifiedName ) ) ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:470:1: ( ( (lv_keyword_0_0= RULE_KEYWORD_CLASS ) ) ( (lv_name_1_0= ruleQualifiedName ) ) )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:470:1: ( ( (lv_keyword_0_0= RULE_KEYWORD_CLASS ) ) ( (lv_name_1_0= ruleQualifiedName ) ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:470:2: ( (lv_keyword_0_0= RULE_KEYWORD_CLASS ) ) ( (lv_name_1_0= ruleQualifiedName ) )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:470:2: ( (lv_keyword_0_0= RULE_KEYWORD_CLASS ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:471:1: (lv_keyword_0_0= RULE_KEYWORD_CLASS )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:471:1: (lv_keyword_0_0= RULE_KEYWORD_CLASS )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:472:3: lv_keyword_0_0= RULE_KEYWORD_CLASS
            {
            lv_keyword_0_0=(Token)match(input,RULE_KEYWORD_CLASS,FOLLOW_RULE_KEYWORD_CLASS_in_ruleEventClass925); 

            			newLeafNode(lv_keyword_0_0, grammarAccess.getEventClassAccess().getKeywordKEYWORD_CLASSTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEventClassRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"keyword",
                    		lv_keyword_0_0, 
                    		"KEYWORD_CLASS");
            	    

            }


            }

            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:488:2: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:489:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:489:1: (lv_name_1_0= ruleQualifiedName )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:490:3: lv_name_1_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getEventClassAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleEventClass951);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEventClassRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"QualifiedName");
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
    // $ANTLR end "ruleEventClass"


    // $ANTLR start "entryRuleEventInterface"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:514:1: entryRuleEventInterface returns [EObject current=null] : iv_ruleEventInterface= ruleEventInterface EOF ;
    public final EObject entryRuleEventInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventInterface = null;


        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:515:2: (iv_ruleEventInterface= ruleEventInterface EOF )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:516:2: iv_ruleEventInterface= ruleEventInterface EOF
            {
             newCompositeNode(grammarAccess.getEventInterfaceRule()); 
            pushFollow(FOLLOW_ruleEventInterface_in_entryRuleEventInterface987);
            iv_ruleEventInterface=ruleEventInterface();

            state._fsp--;

             current =iv_ruleEventInterface; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventInterface997); 

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
    // $ANTLR end "entryRuleEventInterface"


    // $ANTLR start "ruleEventInterface"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:523:1: ruleEventInterface returns [EObject current=null] : ( ( (lv_keyword_0_0= RULE_KEYWORD_INTERFACE ) ) ( (lv_name_1_0= ruleQualifiedName ) ) ) ;
    public final EObject ruleEventInterface() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_0_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:526:28: ( ( ( (lv_keyword_0_0= RULE_KEYWORD_INTERFACE ) ) ( (lv_name_1_0= ruleQualifiedName ) ) ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:527:1: ( ( (lv_keyword_0_0= RULE_KEYWORD_INTERFACE ) ) ( (lv_name_1_0= ruleQualifiedName ) ) )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:527:1: ( ( (lv_keyword_0_0= RULE_KEYWORD_INTERFACE ) ) ( (lv_name_1_0= ruleQualifiedName ) ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:527:2: ( (lv_keyword_0_0= RULE_KEYWORD_INTERFACE ) ) ( (lv_name_1_0= ruleQualifiedName ) )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:527:2: ( (lv_keyword_0_0= RULE_KEYWORD_INTERFACE ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:528:1: (lv_keyword_0_0= RULE_KEYWORD_INTERFACE )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:528:1: (lv_keyword_0_0= RULE_KEYWORD_INTERFACE )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:529:3: lv_keyword_0_0= RULE_KEYWORD_INTERFACE
            {
            lv_keyword_0_0=(Token)match(input,RULE_KEYWORD_INTERFACE,FOLLOW_RULE_KEYWORD_INTERFACE_in_ruleEventInterface1039); 

            			newLeafNode(lv_keyword_0_0, grammarAccess.getEventInterfaceAccess().getKeywordKEYWORD_INTERFACETerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEventInterfaceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"keyword",
                    		lv_keyword_0_0, 
                    		"KEYWORD_INTERFACE");
            	    

            }


            }

            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:545:2: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:546:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:546:1: (lv_name_1_0= ruleQualifiedName )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:547:3: lv_name_1_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getEventInterfaceAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleEventInterface1065);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEventInterfaceRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"QualifiedName");
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
    // $ANTLR end "ruleEventInterface"


    // $ANTLR start "entryRuleEventMethod"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:571:1: entryRuleEventMethod returns [EObject current=null] : iv_ruleEventMethod= ruleEventMethod EOF ;
    public final EObject entryRuleEventMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventMethod = null;


        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:572:2: (iv_ruleEventMethod= ruleEventMethod EOF )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:573:2: iv_ruleEventMethod= ruleEventMethod EOF
            {
             newCompositeNode(grammarAccess.getEventMethodRule()); 
            pushFollow(FOLLOW_ruleEventMethod_in_entryRuleEventMethod1101);
            iv_ruleEventMethod=ruleEventMethod();

            state._fsp--;

             current =iv_ruleEventMethod; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventMethod1111); 

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
    // $ANTLR end "entryRuleEventMethod"


    // $ANTLR start "ruleEventMethod"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:580:1: ruleEventMethod returns [EObject current=null] : (this_KEYWORD_METHOD_0= RULE_KEYWORD_METHOD ( (lv_name_1_0= ruleMethodName ) ) ( (lv_parameterTypes_2_0= ruleParameterTypes ) )? ) ;
    public final EObject ruleEventMethod() throws RecognitionException {
        EObject current = null;

        Token this_KEYWORD_METHOD_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_parameterTypes_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:583:28: ( (this_KEYWORD_METHOD_0= RULE_KEYWORD_METHOD ( (lv_name_1_0= ruleMethodName ) ) ( (lv_parameterTypes_2_0= ruleParameterTypes ) )? ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:584:1: (this_KEYWORD_METHOD_0= RULE_KEYWORD_METHOD ( (lv_name_1_0= ruleMethodName ) ) ( (lv_parameterTypes_2_0= ruleParameterTypes ) )? )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:584:1: (this_KEYWORD_METHOD_0= RULE_KEYWORD_METHOD ( (lv_name_1_0= ruleMethodName ) ) ( (lv_parameterTypes_2_0= ruleParameterTypes ) )? )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:584:2: this_KEYWORD_METHOD_0= RULE_KEYWORD_METHOD ( (lv_name_1_0= ruleMethodName ) ) ( (lv_parameterTypes_2_0= ruleParameterTypes ) )?
            {
            this_KEYWORD_METHOD_0=(Token)match(input,RULE_KEYWORD_METHOD,FOLLOW_RULE_KEYWORD_METHOD_in_ruleEventMethod1147); 
             
                newLeafNode(this_KEYWORD_METHOD_0, grammarAccess.getEventMethodAccess().getKEYWORD_METHODTerminalRuleCall_0()); 
                
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:588:1: ( (lv_name_1_0= ruleMethodName ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:589:1: (lv_name_1_0= ruleMethodName )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:589:1: (lv_name_1_0= ruleMethodName )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:590:3: lv_name_1_0= ruleMethodName
            {
             
            	        newCompositeNode(grammarAccess.getEventMethodAccess().getNameMethodNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleMethodName_in_ruleEventMethod1167);
            lv_name_1_0=ruleMethodName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEventMethodRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"MethodName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:606:2: ( (lv_parameterTypes_2_0= ruleParameterTypes ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_LPAREN) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:607:1: (lv_parameterTypes_2_0= ruleParameterTypes )
                    {
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:607:1: (lv_parameterTypes_2_0= ruleParameterTypes )
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:608:3: lv_parameterTypes_2_0= ruleParameterTypes
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventMethodAccess().getParameterTypesParameterTypesParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameterTypes_in_ruleEventMethod1188);
                    lv_parameterTypes_2_0=ruleParameterTypes();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEventMethodRule());
                    	        }
                           		set(
                           			current, 
                           			"parameterTypes",
                            		lv_parameterTypes_2_0, 
                            		"ParameterTypes");
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
    // $ANTLR end "ruleEventMethod"


    // $ANTLR start "entryRuleMethodName"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:632:1: entryRuleMethodName returns [String current=null] : iv_ruleMethodName= ruleMethodName EOF ;
    public final String entryRuleMethodName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMethodName = null;


        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:633:2: (iv_ruleMethodName= ruleMethodName EOF )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:634:2: iv_ruleMethodName= ruleMethodName EOF
            {
             newCompositeNode(grammarAccess.getMethodNameRule()); 
            pushFollow(FOLLOW_ruleMethodName_in_entryRuleMethodName1226);
            iv_ruleMethodName=ruleMethodName();

            state._fsp--;

             current =iv_ruleMethodName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodName1237); 

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
    // $ANTLR end "entryRuleMethodName"


    // $ANTLR start "ruleMethodName"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:641:1: ruleMethodName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_INIT_1= RULE_INIT | this_CLINIT_2= RULE_CLINIT ) ;
    public final AntlrDatatypeRuleToken ruleMethodName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_INIT_1=null;
        Token this_CLINIT_2=null;

         enterRule(); 
            
        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:644:28: ( (this_ID_0= RULE_ID | this_INIT_1= RULE_INIT | this_CLINIT_2= RULE_CLINIT ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:645:1: (this_ID_0= RULE_ID | this_INIT_1= RULE_INIT | this_CLINIT_2= RULE_CLINIT )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:645:1: (this_ID_0= RULE_ID | this_INIT_1= RULE_INIT | this_CLINIT_2= RULE_CLINIT )
            int alt13=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt13=1;
                }
                break;
            case RULE_INIT:
                {
                alt13=2;
                }
                break;
            case RULE_CLINIT:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:645:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMethodName1277); 

                    		current.merge(this_ID_0);
                        
                     
                        newLeafNode(this_ID_0, grammarAccess.getMethodNameAccess().getIDTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:653:10: this_INIT_1= RULE_INIT
                    {
                    this_INIT_1=(Token)match(input,RULE_INIT,FOLLOW_RULE_INIT_in_ruleMethodName1303); 

                    		current.merge(this_INIT_1);
                        
                     
                        newLeafNode(this_INIT_1, grammarAccess.getMethodNameAccess().getINITTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:661:10: this_CLINIT_2= RULE_CLINIT
                    {
                    this_CLINIT_2=(Token)match(input,RULE_CLINIT,FOLLOW_RULE_CLINIT_in_ruleMethodName1329); 

                    		current.merge(this_CLINIT_2);
                        
                     
                        newLeafNode(this_CLINIT_2, grammarAccess.getMethodNameAccess().getCLINITTerminalRuleCall_2()); 
                        

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
    // $ANTLR end "ruleMethodName"


    // $ANTLR start "entryRuleHelper"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:676:1: entryRuleHelper returns [EObject current=null] : iv_ruleHelper= ruleHelper EOF ;
    public final EObject entryRuleHelper() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHelper = null;


        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:677:2: (iv_ruleHelper= ruleHelper EOF )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:678:2: iv_ruleHelper= ruleHelper EOF
            {
             newCompositeNode(grammarAccess.getHelperRule()); 
            pushFollow(FOLLOW_ruleHelper_in_entryRuleHelper1374);
            iv_ruleHelper=ruleHelper();

            state._fsp--;

             current =iv_ruleHelper; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHelper1384); 

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
    // $ANTLR end "entryRuleHelper"


    // $ANTLR start "ruleHelper"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:685:1: ruleHelper returns [EObject current=null] : ( () otherlv_1= 'HELPER' ( (lv_helper_2_0= ruleQualifiedName ) )? ) ;
    public final EObject ruleHelper() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_helper_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:688:28: ( ( () otherlv_1= 'HELPER' ( (lv_helper_2_0= ruleQualifiedName ) )? ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:689:1: ( () otherlv_1= 'HELPER' ( (lv_helper_2_0= ruleQualifiedName ) )? )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:689:1: ( () otherlv_1= 'HELPER' ( (lv_helper_2_0= ruleQualifiedName ) )? )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:689:2: () otherlv_1= 'HELPER' ( (lv_helper_2_0= ruleQualifiedName ) )?
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:689:2: ()
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:690:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getHelperAccess().getHelperAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,60,FOLLOW_60_in_ruleHelper1430); 

                	newLeafNode(otherlv_1, grammarAccess.getHelperAccess().getHELPERKeyword_1());
                
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:699:1: ( (lv_helper_2_0= ruleQualifiedName ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:700:1: (lv_helper_2_0= ruleQualifiedName )
                    {
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:700:1: (lv_helper_2_0= ruleQualifiedName )
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:701:3: lv_helper_2_0= ruleQualifiedName
                    {
                     
                    	        newCompositeNode(grammarAccess.getHelperAccess().getHelperQualifiedNameParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleHelper1451);
                    lv_helper_2_0=ruleQualifiedName();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getHelperRule());
                    	        }
                           		set(
                           			current, 
                           			"helper",
                            		lv_helper_2_0, 
                            		"QualifiedName");
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
    // $ANTLR end "ruleHelper"


    // $ANTLR start "entryRuleLocationSpecifier"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:725:1: entryRuleLocationSpecifier returns [EObject current=null] : iv_ruleLocationSpecifier= ruleLocationSpecifier EOF ;
    public final EObject entryRuleLocationSpecifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocationSpecifier = null;


        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:726:2: (iv_ruleLocationSpecifier= ruleLocationSpecifier EOF )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:727:2: iv_ruleLocationSpecifier= ruleLocationSpecifier EOF
            {
             newCompositeNode(grammarAccess.getLocationSpecifierRule()); 
            pushFollow(FOLLOW_ruleLocationSpecifier_in_entryRuleLocationSpecifier1488);
            iv_ruleLocationSpecifier=ruleLocationSpecifier();

            state._fsp--;

             current =iv_ruleLocationSpecifier; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocationSpecifier1498); 

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
    // $ANTLR end "entryRuleLocationSpecifier"


    // $ANTLR start "ruleLocationSpecifier"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:734:1: ruleLocationSpecifier returns [EObject current=null] : ( (otherlv_0= 'AT' this_AtLocation_1= ruleAtLocation ) | (otherlv_2= 'AFTER' this_AfterLocation_3= ruleAfterLocation ) | this_AtLine_4= ruleAtLine ) ;
    public final EObject ruleLocationSpecifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_AtLocation_1 = null;

        EObject this_AfterLocation_3 = null;

        EObject this_AtLine_4 = null;


         enterRule(); 
            
        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:737:28: ( ( (otherlv_0= 'AT' this_AtLocation_1= ruleAtLocation ) | (otherlv_2= 'AFTER' this_AfterLocation_3= ruleAfterLocation ) | this_AtLine_4= ruleAtLine ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:738:1: ( (otherlv_0= 'AT' this_AtLocation_1= ruleAtLocation ) | (otherlv_2= 'AFTER' this_AfterLocation_3= ruleAfterLocation ) | this_AtLine_4= ruleAtLine )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:738:1: ( (otherlv_0= 'AT' this_AtLocation_1= ruleAtLocation ) | (otherlv_2= 'AFTER' this_AfterLocation_3= ruleAfterLocation ) | this_AtLine_4= ruleAtLine )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt15=1;
                }
                break;
            case 62:
                {
                alt15=2;
                }
                break;
            case 65:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:738:2: (otherlv_0= 'AT' this_AtLocation_1= ruleAtLocation )
                    {
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:738:2: (otherlv_0= 'AT' this_AtLocation_1= ruleAtLocation )
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:738:4: otherlv_0= 'AT' this_AtLocation_1= ruleAtLocation
                    {
                    otherlv_0=(Token)match(input,61,FOLLOW_61_in_ruleLocationSpecifier1536); 

                        	newLeafNode(otherlv_0, grammarAccess.getLocationSpecifierAccess().getATKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getLocationSpecifierAccess().getAtLocationParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleAtLocation_in_ruleLocationSpecifier1558);
                    this_AtLocation_1=ruleAtLocation();

                    state._fsp--;

                     
                            current = this_AtLocation_1; 
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:752:6: (otherlv_2= 'AFTER' this_AfterLocation_3= ruleAfterLocation )
                    {
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:752:6: (otherlv_2= 'AFTER' this_AfterLocation_3= ruleAfterLocation )
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:752:8: otherlv_2= 'AFTER' this_AfterLocation_3= ruleAfterLocation
                    {
                    otherlv_2=(Token)match(input,62,FOLLOW_62_in_ruleLocationSpecifier1577); 

                        	newLeafNode(otherlv_2, grammarAccess.getLocationSpecifierAccess().getAFTERKeyword_1_0());
                        
                     
                            newCompositeNode(grammarAccess.getLocationSpecifierAccess().getAfterLocationParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleAfterLocation_in_ruleLocationSpecifier1599);
                    this_AfterLocation_3=ruleAfterLocation();

                    state._fsp--;

                     
                            current = this_AfterLocation_3; 
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:767:5: this_AtLine_4= ruleAtLine
                    {
                     
                            newCompositeNode(grammarAccess.getLocationSpecifierAccess().getAtLineParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleAtLine_in_ruleLocationSpecifier1627);
                    this_AtLine_4=ruleAtLine();

                    state._fsp--;

                     
                            current = this_AtLine_4; 
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
    // $ANTLR end "ruleLocationSpecifier"


    // $ANTLR start "entryRuleAtLocation"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:783:1: entryRuleAtLocation returns [EObject current=null] : iv_ruleAtLocation= ruleAtLocation EOF ;
    public final EObject entryRuleAtLocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtLocation = null;


        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:784:2: (iv_ruleAtLocation= ruleAtLocation EOF )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:785:2: iv_ruleAtLocation= ruleAtLocation EOF
            {
             newCompositeNode(grammarAccess.getAtLocationRule()); 
            pushFollow(FOLLOW_ruleAtLocation_in_entryRuleAtLocation1662);
            iv_ruleAtLocation=ruleAtLocation();

            state._fsp--;

             current =iv_ruleAtLocation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtLocation1672); 

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
    // $ANTLR end "entryRuleAtLocation"


    // $ANTLR start "ruleAtLocation"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:792:1: ruleAtLocation returns [EObject current=null] : (this_AtEntry_0= ruleAtEntry | this_AtExit_1= ruleAtExit | this_AtLine_2= ruleAtLine | this_AtRead_3= ruleAtRead | this_AtWrite_4= ruleAtWrite | this_AtInvoke_5= ruleAtInvoke | this_AtSynchronize_6= ruleAtSynchronize | this_AtThrow_7= ruleAtThrow ) ;
    public final EObject ruleAtLocation() throws RecognitionException {
        EObject current = null;

        EObject this_AtEntry_0 = null;

        EObject this_AtExit_1 = null;

        EObject this_AtLine_2 = null;

        EObject this_AtRead_3 = null;

        EObject this_AtWrite_4 = null;

        EObject this_AtInvoke_5 = null;

        EObject this_AtSynchronize_6 = null;

        EObject this_AtThrow_7 = null;


         enterRule(); 
            
        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:795:28: ( (this_AtEntry_0= ruleAtEntry | this_AtExit_1= ruleAtExit | this_AtLine_2= ruleAtLine | this_AtRead_3= ruleAtRead | this_AtWrite_4= ruleAtWrite | this_AtInvoke_5= ruleAtInvoke | this_AtSynchronize_6= ruleAtSynchronize | this_AtThrow_7= ruleAtThrow ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:796:1: (this_AtEntry_0= ruleAtEntry | this_AtExit_1= ruleAtExit | this_AtLine_2= ruleAtLine | this_AtRead_3= ruleAtRead | this_AtWrite_4= ruleAtWrite | this_AtInvoke_5= ruleAtInvoke | this_AtSynchronize_6= ruleAtSynchronize | this_AtThrow_7= ruleAtThrow )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:796:1: (this_AtEntry_0= ruleAtEntry | this_AtExit_1= ruleAtExit | this_AtLine_2= ruleAtLine | this_AtRead_3= ruleAtRead | this_AtWrite_4= ruleAtWrite | this_AtInvoke_5= ruleAtInvoke | this_AtSynchronize_6= ruleAtSynchronize | this_AtThrow_7= ruleAtThrow )
            int alt16=8;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt16=1;
                }
                break;
            case RULE_KEYWORD_RETURN:
            case 64:
                {
                alt16=2;
                }
                break;
            case 65:
                {
                alt16=3;
                }
                break;
            case 66:
                {
                alt16=4;
                }
                break;
            case 67:
                {
                alt16=5;
                }
                break;
            case 68:
            case 69:
                {
                alt16=6;
                }
                break;
            case 70:
                {
                alt16=7;
                }
                break;
            case 71:
                {
                alt16=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:797:5: this_AtEntry_0= ruleAtEntry
                    {
                     
                            newCompositeNode(grammarAccess.getAtLocationAccess().getAtEntryParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAtEntry_in_ruleAtLocation1719);
                    this_AtEntry_0=ruleAtEntry();

                    state._fsp--;

                     
                            current = this_AtEntry_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:807:5: this_AtExit_1= ruleAtExit
                    {
                     
                            newCompositeNode(grammarAccess.getAtLocationAccess().getAtExitParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAtExit_in_ruleAtLocation1746);
                    this_AtExit_1=ruleAtExit();

                    state._fsp--;

                     
                            current = this_AtExit_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:817:5: this_AtLine_2= ruleAtLine
                    {
                     
                            newCompositeNode(grammarAccess.getAtLocationAccess().getAtLineParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleAtLine_in_ruleAtLocation1773);
                    this_AtLine_2=ruleAtLine();

                    state._fsp--;

                     
                            current = this_AtLine_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:827:5: this_AtRead_3= ruleAtRead
                    {
                     
                            newCompositeNode(grammarAccess.getAtLocationAccess().getAtReadParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleAtRead_in_ruleAtLocation1800);
                    this_AtRead_3=ruleAtRead();

                    state._fsp--;

                     
                            current = this_AtRead_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:837:5: this_AtWrite_4= ruleAtWrite
                    {
                     
                            newCompositeNode(grammarAccess.getAtLocationAccess().getAtWriteParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleAtWrite_in_ruleAtLocation1827);
                    this_AtWrite_4=ruleAtWrite();

                    state._fsp--;

                     
                            current = this_AtWrite_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:847:5: this_AtInvoke_5= ruleAtInvoke
                    {
                     
                            newCompositeNode(grammarAccess.getAtLocationAccess().getAtInvokeParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleAtInvoke_in_ruleAtLocation1854);
                    this_AtInvoke_5=ruleAtInvoke();

                    state._fsp--;

                     
                            current = this_AtInvoke_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:857:5: this_AtSynchronize_6= ruleAtSynchronize
                    {
                     
                            newCompositeNode(grammarAccess.getAtLocationAccess().getAtSynchronizeParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleAtSynchronize_in_ruleAtLocation1881);
                    this_AtSynchronize_6=ruleAtSynchronize();

                    state._fsp--;

                     
                            current = this_AtSynchronize_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:867:5: this_AtThrow_7= ruleAtThrow
                    {
                     
                            newCompositeNode(grammarAccess.getAtLocationAccess().getAtThrowParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleAtThrow_in_ruleAtLocation1908);
                    this_AtThrow_7=ruleAtThrow();

                    state._fsp--;

                     
                            current = this_AtThrow_7; 
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
    // $ANTLR end "ruleAtLocation"


    // $ANTLR start "entryRuleAfterLocation"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:883:1: entryRuleAfterLocation returns [EObject current=null] : iv_ruleAfterLocation= ruleAfterLocation EOF ;
    public final EObject entryRuleAfterLocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAfterLocation = null;


        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:884:2: (iv_ruleAfterLocation= ruleAfterLocation EOF )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:885:2: iv_ruleAfterLocation= ruleAfterLocation EOF
            {
             newCompositeNode(grammarAccess.getAfterLocationRule()); 
            pushFollow(FOLLOW_ruleAfterLocation_in_entryRuleAfterLocation1943);
            iv_ruleAfterLocation=ruleAfterLocation();

            state._fsp--;

             current =iv_ruleAfterLocation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAfterLocation1953); 

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
    // $ANTLR end "entryRuleAfterLocation"


    // $ANTLR start "ruleAfterLocation"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:892:1: ruleAfterLocation returns [EObject current=null] : (this_AfterRead_0= ruleAfterRead | this_AfterWrite_1= ruleAfterWrite | this_AfterInvoke_2= ruleAfterInvoke | this_AfterSynchronize_3= ruleAfterSynchronize | this_AtThrow_4= ruleAtThrow ) ;
    public final EObject ruleAfterLocation() throws RecognitionException {
        EObject current = null;

        EObject this_AfterRead_0 = null;

        EObject this_AfterWrite_1 = null;

        EObject this_AfterInvoke_2 = null;

        EObject this_AfterSynchronize_3 = null;

        EObject this_AtThrow_4 = null;


         enterRule(); 
            
        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:895:28: ( (this_AfterRead_0= ruleAfterRead | this_AfterWrite_1= ruleAfterWrite | this_AfterInvoke_2= ruleAfterInvoke | this_AfterSynchronize_3= ruleAfterSynchronize | this_AtThrow_4= ruleAtThrow ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:896:1: (this_AfterRead_0= ruleAfterRead | this_AfterWrite_1= ruleAfterWrite | this_AfterInvoke_2= ruleAfterInvoke | this_AfterSynchronize_3= ruleAfterSynchronize | this_AtThrow_4= ruleAtThrow )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:896:1: (this_AfterRead_0= ruleAfterRead | this_AfterWrite_1= ruleAfterWrite | this_AfterInvoke_2= ruleAfterInvoke | this_AfterSynchronize_3= ruleAfterSynchronize | this_AtThrow_4= ruleAtThrow )
            int alt17=5;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt17=1;
                }
                break;
            case 67:
                {
                alt17=2;
                }
                break;
            case 68:
            case 69:
                {
                alt17=3;
                }
                break;
            case 70:
                {
                alt17=4;
                }
                break;
            case 71:
                {
                alt17=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:897:5: this_AfterRead_0= ruleAfterRead
                    {
                     
                            newCompositeNode(grammarAccess.getAfterLocationAccess().getAfterReadParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAfterRead_in_ruleAfterLocation2000);
                    this_AfterRead_0=ruleAfterRead();

                    state._fsp--;

                     
                            current = this_AfterRead_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:907:5: this_AfterWrite_1= ruleAfterWrite
                    {
                     
                            newCompositeNode(grammarAccess.getAfterLocationAccess().getAfterWriteParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAfterWrite_in_ruleAfterLocation2027);
                    this_AfterWrite_1=ruleAfterWrite();

                    state._fsp--;

                     
                            current = this_AfterWrite_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:917:5: this_AfterInvoke_2= ruleAfterInvoke
                    {
                     
                            newCompositeNode(grammarAccess.getAfterLocationAccess().getAfterInvokeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleAfterInvoke_in_ruleAfterLocation2054);
                    this_AfterInvoke_2=ruleAfterInvoke();

                    state._fsp--;

                     
                            current = this_AfterInvoke_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:927:5: this_AfterSynchronize_3= ruleAfterSynchronize
                    {
                     
                            newCompositeNode(grammarAccess.getAfterLocationAccess().getAfterSynchronizeParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleAfterSynchronize_in_ruleAfterLocation2081);
                    this_AfterSynchronize_3=ruleAfterSynchronize();

                    state._fsp--;

                     
                            current = this_AfterSynchronize_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:937:5: this_AtThrow_4= ruleAtThrow
                    {
                     
                            newCompositeNode(grammarAccess.getAfterLocationAccess().getAtThrowParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleAtThrow_in_ruleAfterLocation2108);
                    this_AtThrow_4=ruleAtThrow();

                    state._fsp--;

                     
                            current = this_AtThrow_4; 
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
    // $ANTLR end "ruleAfterLocation"


    // $ANTLR start "entryRuleAtEntry"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:953:1: entryRuleAtEntry returns [EObject current=null] : iv_ruleAtEntry= ruleAtEntry EOF ;
    public final EObject entryRuleAtEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtEntry = null;


        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:954:2: (iv_ruleAtEntry= ruleAtEntry EOF )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:955:2: iv_ruleAtEntry= ruleAtEntry EOF
            {
             newCompositeNode(grammarAccess.getAtEntryRule()); 
            pushFollow(FOLLOW_ruleAtEntry_in_entryRuleAtEntry2143);
            iv_ruleAtEntry=ruleAtEntry();

            state._fsp--;

             current =iv_ruleAtEntry; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtEntry2153); 

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
    // $ANTLR end "entryRuleAtEntry"


    // $ANTLR start "ruleAtEntry"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:962:1: ruleAtEntry returns [EObject current=null] : ( () otherlv_1= 'ENTRY' ) ;
    public final EObject ruleAtEntry() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:965:28: ( ( () otherlv_1= 'ENTRY' ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:966:1: ( () otherlv_1= 'ENTRY' )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:966:1: ( () otherlv_1= 'ENTRY' )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:966:2: () otherlv_1= 'ENTRY'
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:966:2: ()
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:967:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAtEntryAccess().getAtEntryAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,63,FOLLOW_63_in_ruleAtEntry2199); 

                	newLeafNode(otherlv_1, grammarAccess.getAtEntryAccess().getENTRYKeyword_1());
                

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
    // $ANTLR end "ruleAtEntry"


    // $ANTLR start "entryRuleAtExit"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:984:1: entryRuleAtExit returns [EObject current=null] : iv_ruleAtExit= ruleAtExit EOF ;
    public final EObject entryRuleAtExit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtExit = null;


        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:985:2: (iv_ruleAtExit= ruleAtExit EOF )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:986:2: iv_ruleAtExit= ruleAtExit EOF
            {
             newCompositeNode(grammarAccess.getAtExitRule()); 
            pushFollow(FOLLOW_ruleAtExit_in_entryRuleAtExit2235);
            iv_ruleAtExit=ruleAtExit();

            state._fsp--;

             current =iv_ruleAtExit; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtExit2245); 

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
    // $ANTLR end "entryRuleAtExit"


    // $ANTLR start "ruleAtExit"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:993:1: ruleAtExit returns [EObject current=null] : ( () (otherlv_1= 'EXIT' | this_KEYWORD_RETURN_2= RULE_KEYWORD_RETURN ) ) ;
    public final EObject ruleAtExit() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_KEYWORD_RETURN_2=null;

         enterRule(); 
            
        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:996:28: ( ( () (otherlv_1= 'EXIT' | this_KEYWORD_RETURN_2= RULE_KEYWORD_RETURN ) ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:997:1: ( () (otherlv_1= 'EXIT' | this_KEYWORD_RETURN_2= RULE_KEYWORD_RETURN ) )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:997:1: ( () (otherlv_1= 'EXIT' | this_KEYWORD_RETURN_2= RULE_KEYWORD_RETURN ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:997:2: () (otherlv_1= 'EXIT' | this_KEYWORD_RETURN_2= RULE_KEYWORD_RETURN )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:997:2: ()
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:998:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAtExitAccess().getAtExitAction_0(),
                        current);
                

            }

            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1003:2: (otherlv_1= 'EXIT' | this_KEYWORD_RETURN_2= RULE_KEYWORD_RETURN )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==64) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_KEYWORD_RETURN) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1003:4: otherlv_1= 'EXIT'
                    {
                    otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleAtExit2292); 

                        	newLeafNode(otherlv_1, grammarAccess.getAtExitAccess().getEXITKeyword_1_0());
                        

                    }
                    break;
                case 2 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1008:6: this_KEYWORD_RETURN_2= RULE_KEYWORD_RETURN
                    {
                    this_KEYWORD_RETURN_2=(Token)match(input,RULE_KEYWORD_RETURN,FOLLOW_RULE_KEYWORD_RETURN_in_ruleAtExit2309); 
                     
                        newLeafNode(this_KEYWORD_RETURN_2, grammarAccess.getAtExitAccess().getKEYWORD_RETURNTerminalRuleCall_1_1()); 
                        

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
    // $ANTLR end "ruleAtExit"


    // $ANTLR start "entryRuleAtLine"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1020:1: entryRuleAtLine returns [EObject current=null] : iv_ruleAtLine= ruleAtLine EOF ;
    public final EObject entryRuleAtLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtLine = null;


        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1021:2: (iv_ruleAtLine= ruleAtLine EOF )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1022:2: iv_ruleAtLine= ruleAtLine EOF
            {
             newCompositeNode(grammarAccess.getAtLineRule()); 
            pushFollow(FOLLOW_ruleAtLine_in_entryRuleAtLine2345);
            iv_ruleAtLine=ruleAtLine();

            state._fsp--;

             current =iv_ruleAtLine; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtLine2355); 

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
    // $ANTLR end "entryRuleAtLine"


    // $ANTLR start "ruleAtLine"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1029:1: ruleAtLine returns [EObject current=null] : ( () otherlv_1= 'LINE' ( (lv_line_2_0= RULE_INTVAL ) ) ) ;
    public final EObject ruleAtLine() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_line_2_0=null;

         enterRule(); 
            
        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1032:28: ( ( () otherlv_1= 'LINE' ( (lv_line_2_0= RULE_INTVAL ) ) ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1033:1: ( () otherlv_1= 'LINE' ( (lv_line_2_0= RULE_INTVAL ) ) )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1033:1: ( () otherlv_1= 'LINE' ( (lv_line_2_0= RULE_INTVAL ) ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1033:2: () otherlv_1= 'LINE' ( (lv_line_2_0= RULE_INTVAL ) )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1033:2: ()
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1034:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAtLineAccess().getAtLineAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,65,FOLLOW_65_in_ruleAtLine2401); 

                	newLeafNode(otherlv_1, grammarAccess.getAtLineAccess().getLINEKeyword_1());
                
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1043:1: ( (lv_line_2_0= RULE_INTVAL ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1044:1: (lv_line_2_0= RULE_INTVAL )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1044:1: (lv_line_2_0= RULE_INTVAL )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1045:3: lv_line_2_0= RULE_INTVAL
            {
            lv_line_2_0=(Token)match(input,RULE_INTVAL,FOLLOW_RULE_INTVAL_in_ruleAtLine2418); 

            			newLeafNode(lv_line_2_0, grammarAccess.getAtLineAccess().getLineINTVALTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAtLineRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"line",
                    		lv_line_2_0, 
                    		"INTVAL");
            	    

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
    // $ANTLR end "ruleAtLine"


    // $ANTLR start "entryRuleAtRead"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1069:1: entryRuleAtRead returns [EObject current=null] : iv_ruleAtRead= ruleAtRead EOF ;
    public final EObject entryRuleAtRead() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtRead = null;


        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1070:2: (iv_ruleAtRead= ruleAtRead EOF )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1071:2: iv_ruleAtRead= ruleAtRead EOF
            {
             newCompositeNode(grammarAccess.getAtReadRule()); 
            pushFollow(FOLLOW_ruleAtRead_in_entryRuleAtRead2459);
            iv_ruleAtRead=ruleAtRead();

            state._fsp--;

             current =iv_ruleAtRead; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtRead2469); 

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
    // $ANTLR end "entryRuleAtRead"


    // $ANTLR start "ruleAtRead"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1078:1: ruleAtRead returns [EObject current=null] : (this_AtReadField_0= ruleAtReadField | this_AtReadLocal_1= ruleAtReadLocal ) ;
    public final EObject ruleAtRead() throws RecognitionException {
        EObject current = null;

        EObject this_AtReadField_0 = null;

        EObject this_AtReadLocal_1 = null;


         enterRule(); 
            
        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1081:28: ( (this_AtReadField_0= ruleAtReadField | this_AtReadLocal_1= ruleAtReadLocal ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1082:1: (this_AtReadField_0= ruleAtReadField | this_AtReadLocal_1= ruleAtReadLocal )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1082:1: (this_AtReadField_0= ruleAtReadField | this_AtReadLocal_1= ruleAtReadLocal )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==66) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==RULE_DOLLAR) ) {
                    alt19=2;
                }
                else if ( (LA19_1==RULE_ID) ) {
                    alt19=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1083:5: this_AtReadField_0= ruleAtReadField
                    {
                     
                            newCompositeNode(grammarAccess.getAtReadAccess().getAtReadFieldParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAtReadField_in_ruleAtRead2516);
                    this_AtReadField_0=ruleAtReadField();

                    state._fsp--;

                     
                            current = this_AtReadField_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1093:5: this_AtReadLocal_1= ruleAtReadLocal
                    {
                     
                            newCompositeNode(grammarAccess.getAtReadAccess().getAtReadLocalParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAtReadLocal_in_ruleAtRead2543);
                    this_AtReadLocal_1=ruleAtReadLocal();

                    state._fsp--;

                     
                            current = this_AtReadLocal_1; 
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
    // $ANTLR end "ruleAtRead"


    // $ANTLR start "entryRuleAtReadField"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1109:1: entryRuleAtReadField returns [EObject current=null] : iv_ruleAtReadField= ruleAtReadField EOF ;
    public final EObject entryRuleAtReadField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtReadField = null;


        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1110:2: (iv_ruleAtReadField= ruleAtReadField EOF )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1111:2: iv_ruleAtReadField= ruleAtReadField EOF
            {
             newCompositeNode(grammarAccess.getAtReadFieldRule()); 
            pushFollow(FOLLOW_ruleAtReadField_in_entryRuleAtReadField2578);
            iv_ruleAtReadField=ruleAtReadField();

            state._fsp--;

             current =iv_ruleAtReadField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtReadField2588); 

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
    // $ANTLR end "entryRuleAtReadField"


    // $ANTLR start "ruleAtReadField"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1118:1: ruleAtReadField returns [EObject current=null] : ( () otherlv_1= 'READ' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_counter_3_0= ruleCounter ) )? ) ;
    public final EObject ruleAtReadField() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_counter_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1121:28: ( ( () otherlv_1= 'READ' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_counter_3_0= ruleCounter ) )? ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1122:1: ( () otherlv_1= 'READ' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_counter_3_0= ruleCounter ) )? )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1122:1: ( () otherlv_1= 'READ' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_counter_3_0= ruleCounter ) )? )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1122:2: () otherlv_1= 'READ' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_counter_3_0= ruleCounter ) )?
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1122:2: ()
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1123:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAtReadFieldAccess().getAtReadFieldAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,66,FOLLOW_66_in_ruleAtReadField2634); 

                	newLeafNode(otherlv_1, grammarAccess.getAtReadFieldAccess().getREADKeyword_1());
                
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1132:1: ( (lv_name_2_0= ruleQualifiedName ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1133:1: (lv_name_2_0= ruleQualifiedName )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1133:1: (lv_name_2_0= ruleQualifiedName )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1134:3: lv_name_2_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getAtReadFieldAccess().getNameQualifiedNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleAtReadField2655);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAtReadFieldRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1150:2: ( (lv_counter_3_0= ruleCounter ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_INTVAL||LA20_0==72) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1151:1: (lv_counter_3_0= ruleCounter )
                    {
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1151:1: (lv_counter_3_0= ruleCounter )
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1152:3: lv_counter_3_0= ruleCounter
                    {
                     
                    	        newCompositeNode(grammarAccess.getAtReadFieldAccess().getCounterCounterParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCounter_in_ruleAtReadField2676);
                    lv_counter_3_0=ruleCounter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAtReadFieldRule());
                    	        }
                           		set(
                           			current, 
                           			"counter",
                            		lv_counter_3_0, 
                            		"Counter");
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
    // $ANTLR end "ruleAtReadField"


    // $ANTLR start "entryRuleAtReadLocal"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1176:1: entryRuleAtReadLocal returns [EObject current=null] : iv_ruleAtReadLocal= ruleAtReadLocal EOF ;
    public final EObject entryRuleAtReadLocal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtReadLocal = null;


        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1177:2: (iv_ruleAtReadLocal= ruleAtReadLocal EOF )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1178:2: iv_ruleAtReadLocal= ruleAtReadLocal EOF
            {
             newCompositeNode(grammarAccess.getAtReadLocalRule()); 
            pushFollow(FOLLOW_ruleAtReadLocal_in_entryRuleAtReadLocal2713);
            iv_ruleAtReadLocal=ruleAtReadLocal();

            state._fsp--;

             current =iv_ruleAtReadLocal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtReadLocal2723); 

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
    // $ANTLR end "entryRuleAtReadLocal"


    // $ANTLR start "ruleAtReadLocal"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1185:1: ruleAtReadLocal returns [EObject current=null] : ( () otherlv_1= 'READ' this_DOLLAR_2= RULE_DOLLAR ( (lv_name_3_0= RULE_ID ) ) ( (lv_counter_4_0= ruleCounter ) )? ) ;
    public final EObject ruleAtReadLocal() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_DOLLAR_2=null;
        Token lv_name_3_0=null;
        AntlrDatatypeRuleToken lv_counter_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1188:28: ( ( () otherlv_1= 'READ' this_DOLLAR_2= RULE_DOLLAR ( (lv_name_3_0= RULE_ID ) ) ( (lv_counter_4_0= ruleCounter ) )? ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1189:1: ( () otherlv_1= 'READ' this_DOLLAR_2= RULE_DOLLAR ( (lv_name_3_0= RULE_ID ) ) ( (lv_counter_4_0= ruleCounter ) )? )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1189:1: ( () otherlv_1= 'READ' this_DOLLAR_2= RULE_DOLLAR ( (lv_name_3_0= RULE_ID ) ) ( (lv_counter_4_0= ruleCounter ) )? )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1189:2: () otherlv_1= 'READ' this_DOLLAR_2= RULE_DOLLAR ( (lv_name_3_0= RULE_ID ) ) ( (lv_counter_4_0= ruleCounter ) )?
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1189:2: ()
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1190:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAtReadLocalAccess().getAtReadLocalAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,66,FOLLOW_66_in_ruleAtReadLocal2769); 

                	newLeafNode(otherlv_1, grammarAccess.getAtReadLocalAccess().getREADKeyword_1());
                
            this_DOLLAR_2=(Token)match(input,RULE_DOLLAR,FOLLOW_RULE_DOLLAR_in_ruleAtReadLocal2780); 
             
                newLeafNode(this_DOLLAR_2, grammarAccess.getAtReadLocalAccess().getDOLLARTerminalRuleCall_2()); 
                
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1203:1: ( (lv_name_3_0= RULE_ID ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1204:1: (lv_name_3_0= RULE_ID )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1204:1: (lv_name_3_0= RULE_ID )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1205:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAtReadLocal2796); 

            			newLeafNode(lv_name_3_0, grammarAccess.getAtReadLocalAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAtReadLocalRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"ID");
            	    

            }


            }

            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1221:2: ( (lv_counter_4_0= ruleCounter ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_INTVAL||LA21_0==72) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1222:1: (lv_counter_4_0= ruleCounter )
                    {
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1222:1: (lv_counter_4_0= ruleCounter )
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1223:3: lv_counter_4_0= ruleCounter
                    {
                     
                    	        newCompositeNode(grammarAccess.getAtReadLocalAccess().getCounterCounterParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCounter_in_ruleAtReadLocal2822);
                    lv_counter_4_0=ruleCounter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAtReadLocalRule());
                    	        }
                           		set(
                           			current, 
                           			"counter",
                            		lv_counter_4_0, 
                            		"Counter");
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
    // $ANTLR end "ruleAtReadLocal"


    // $ANTLR start "entryRuleAfterRead"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1247:1: entryRuleAfterRead returns [EObject current=null] : iv_ruleAfterRead= ruleAfterRead EOF ;
    public final EObject entryRuleAfterRead() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAfterRead = null;


        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1248:2: (iv_ruleAfterRead= ruleAfterRead EOF )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1249:2: iv_ruleAfterRead= ruleAfterRead EOF
            {
             newCompositeNode(grammarAccess.getAfterReadRule()); 
            pushFollow(FOLLOW_ruleAfterRead_in_entryRuleAfterRead2859);
            iv_ruleAfterRead=ruleAfterRead();

            state._fsp--;

             current =iv_ruleAfterRead; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAfterRead2869); 

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
    // $ANTLR end "entryRuleAfterRead"


    // $ANTLR start "ruleAfterRead"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1256:1: ruleAfterRead returns [EObject current=null] : (this_AfterReadField_0= ruleAfterReadField | this_AfterReadLocal_1= ruleAfterReadLocal ) ;
    public final EObject ruleAfterRead() throws RecognitionException {
        EObject current = null;

        EObject this_AfterReadField_0 = null;

        EObject this_AfterReadLocal_1 = null;


         enterRule(); 
            
        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1259:28: ( (this_AfterReadField_0= ruleAfterReadField | this_AfterReadLocal_1= ruleAfterReadLocal ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1260:1: (this_AfterReadField_0= ruleAfterReadField | this_AfterReadLocal_1= ruleAfterReadLocal )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1260:1: (this_AfterReadField_0= ruleAfterReadField | this_AfterReadLocal_1= ruleAfterReadLocal )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==66) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==RULE_DOLLAR) ) {
                    alt22=2;
                }
                else if ( (LA22_1==RULE_ID) ) {
                    alt22=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1261:5: this_AfterReadField_0= ruleAfterReadField
                    {
                     
                            newCompositeNode(grammarAccess.getAfterReadAccess().getAfterReadFieldParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAfterReadField_in_ruleAfterRead2916);
                    this_AfterReadField_0=ruleAfterReadField();

                    state._fsp--;

                     
                            current = this_AfterReadField_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1271:5: this_AfterReadLocal_1= ruleAfterReadLocal
                    {
                     
                            newCompositeNode(grammarAccess.getAfterReadAccess().getAfterReadLocalParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAfterReadLocal_in_ruleAfterRead2943);
                    this_AfterReadLocal_1=ruleAfterReadLocal();

                    state._fsp--;

                     
                            current = this_AfterReadLocal_1; 
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
    // $ANTLR end "ruleAfterRead"


    // $ANTLR start "entryRuleAfterReadField"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1287:1: entryRuleAfterReadField returns [EObject current=null] : iv_ruleAfterReadField= ruleAfterReadField EOF ;
    public final EObject entryRuleAfterReadField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAfterReadField = null;


        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1288:2: (iv_ruleAfterReadField= ruleAfterReadField EOF )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1289:2: iv_ruleAfterReadField= ruleAfterReadField EOF
            {
             newCompositeNode(grammarAccess.getAfterReadFieldRule()); 
            pushFollow(FOLLOW_ruleAfterReadField_in_entryRuleAfterReadField2978);
            iv_ruleAfterReadField=ruleAfterReadField();

            state._fsp--;

             current =iv_ruleAfterReadField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAfterReadField2988); 

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
    // $ANTLR end "entryRuleAfterReadField"


    // $ANTLR start "ruleAfterReadField"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1296:1: ruleAfterReadField returns [EObject current=null] : ( () otherlv_1= 'READ' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_counter_3_0= ruleCounter ) )? ) ;
    public final EObject ruleAfterReadField() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_counter_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1299:28: ( ( () otherlv_1= 'READ' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_counter_3_0= ruleCounter ) )? ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1300:1: ( () otherlv_1= 'READ' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_counter_3_0= ruleCounter ) )? )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1300:1: ( () otherlv_1= 'READ' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_counter_3_0= ruleCounter ) )? )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1300:2: () otherlv_1= 'READ' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_counter_3_0= ruleCounter ) )?
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1300:2: ()
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1301:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAfterReadFieldAccess().getAfterReadFieldAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,66,FOLLOW_66_in_ruleAfterReadField3034); 

                	newLeafNode(otherlv_1, grammarAccess.getAfterReadFieldAccess().getREADKeyword_1());
                
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1310:1: ( (lv_name_2_0= ruleQualifiedName ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1311:1: (lv_name_2_0= ruleQualifiedName )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1311:1: (lv_name_2_0= ruleQualifiedName )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1312:3: lv_name_2_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getAfterReadFieldAccess().getNameQualifiedNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleAfterReadField3055);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAfterReadFieldRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1328:2: ( (lv_counter_3_0= ruleCounter ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_INTVAL||LA23_0==72) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1329:1: (lv_counter_3_0= ruleCounter )
                    {
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1329:1: (lv_counter_3_0= ruleCounter )
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1330:3: lv_counter_3_0= ruleCounter
                    {
                     
                    	        newCompositeNode(grammarAccess.getAfterReadFieldAccess().getCounterCounterParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCounter_in_ruleAfterReadField3076);
                    lv_counter_3_0=ruleCounter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAfterReadFieldRule());
                    	        }
                           		set(
                           			current, 
                           			"counter",
                            		lv_counter_3_0, 
                            		"Counter");
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
    // $ANTLR end "ruleAfterReadField"


    // $ANTLR start "entryRuleAfterReadLocal"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1354:1: entryRuleAfterReadLocal returns [EObject current=null] : iv_ruleAfterReadLocal= ruleAfterReadLocal EOF ;
    public final EObject entryRuleAfterReadLocal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAfterReadLocal = null;


        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1355:2: (iv_ruleAfterReadLocal= ruleAfterReadLocal EOF )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1356:2: iv_ruleAfterReadLocal= ruleAfterReadLocal EOF
            {
             newCompositeNode(grammarAccess.getAfterReadLocalRule()); 
            pushFollow(FOLLOW_ruleAfterReadLocal_in_entryRuleAfterReadLocal3113);
            iv_ruleAfterReadLocal=ruleAfterReadLocal();

            state._fsp--;

             current =iv_ruleAfterReadLocal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAfterReadLocal3123); 

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
    // $ANTLR end "entryRuleAfterReadLocal"


    // $ANTLR start "ruleAfterReadLocal"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1363:1: ruleAfterReadLocal returns [EObject current=null] : ( () otherlv_1= 'READ' this_DOLLAR_2= RULE_DOLLAR ( (lv_name_3_0= RULE_ID ) ) ( (lv_counter_4_0= ruleCounter ) )? ) ;
    public final EObject ruleAfterReadLocal() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_DOLLAR_2=null;
        Token lv_name_3_0=null;
        AntlrDatatypeRuleToken lv_counter_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1366:28: ( ( () otherlv_1= 'READ' this_DOLLAR_2= RULE_DOLLAR ( (lv_name_3_0= RULE_ID ) ) ( (lv_counter_4_0= ruleCounter ) )? ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1367:1: ( () otherlv_1= 'READ' this_DOLLAR_2= RULE_DOLLAR ( (lv_name_3_0= RULE_ID ) ) ( (lv_counter_4_0= ruleCounter ) )? )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1367:1: ( () otherlv_1= 'READ' this_DOLLAR_2= RULE_DOLLAR ( (lv_name_3_0= RULE_ID ) ) ( (lv_counter_4_0= ruleCounter ) )? )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1367:2: () otherlv_1= 'READ' this_DOLLAR_2= RULE_DOLLAR ( (lv_name_3_0= RULE_ID ) ) ( (lv_counter_4_0= ruleCounter ) )?
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1367:2: ()
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1368:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAfterReadLocalAccess().getAfterReadLocalAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,66,FOLLOW_66_in_ruleAfterReadLocal3169); 

                	newLeafNode(otherlv_1, grammarAccess.getAfterReadLocalAccess().getREADKeyword_1());
                
            this_DOLLAR_2=(Token)match(input,RULE_DOLLAR,FOLLOW_RULE_DOLLAR_in_ruleAfterReadLocal3180); 
             
                newLeafNode(this_DOLLAR_2, grammarAccess.getAfterReadLocalAccess().getDOLLARTerminalRuleCall_2()); 
                
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1381:1: ( (lv_name_3_0= RULE_ID ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1382:1: (lv_name_3_0= RULE_ID )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1382:1: (lv_name_3_0= RULE_ID )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1383:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAfterReadLocal3196); 

            			newLeafNode(lv_name_3_0, grammarAccess.getAfterReadLocalAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAfterReadLocalRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"ID");
            	    

            }


            }

            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1399:2: ( (lv_counter_4_0= ruleCounter ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_INTVAL||LA24_0==72) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1400:1: (lv_counter_4_0= ruleCounter )
                    {
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1400:1: (lv_counter_4_0= ruleCounter )
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1401:3: lv_counter_4_0= ruleCounter
                    {
                     
                    	        newCompositeNode(grammarAccess.getAfterReadLocalAccess().getCounterCounterParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCounter_in_ruleAfterReadLocal3222);
                    lv_counter_4_0=ruleCounter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAfterReadLocalRule());
                    	        }
                           		set(
                           			current, 
                           			"counter",
                            		lv_counter_4_0, 
                            		"Counter");
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
    // $ANTLR end "ruleAfterReadLocal"


    // $ANTLR start "entryRuleAtWrite"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1425:1: entryRuleAtWrite returns [EObject current=null] : iv_ruleAtWrite= ruleAtWrite EOF ;
    public final EObject entryRuleAtWrite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtWrite = null;


        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1426:2: (iv_ruleAtWrite= ruleAtWrite EOF )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1427:2: iv_ruleAtWrite= ruleAtWrite EOF
            {
             newCompositeNode(grammarAccess.getAtWriteRule()); 
            pushFollow(FOLLOW_ruleAtWrite_in_entryRuleAtWrite3259);
            iv_ruleAtWrite=ruleAtWrite();

            state._fsp--;

             current =iv_ruleAtWrite; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtWrite3269); 

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
    // $ANTLR end "entryRuleAtWrite"


    // $ANTLR start "ruleAtWrite"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1434:1: ruleAtWrite returns [EObject current=null] : (this_AtWriteField_0= ruleAtWriteField | this_AtWriteLocal_1= ruleAtWriteLocal ) ;
    public final EObject ruleAtWrite() throws RecognitionException {
        EObject current = null;

        EObject this_AtWriteField_0 = null;

        EObject this_AtWriteLocal_1 = null;


         enterRule(); 
            
        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1437:28: ( (this_AtWriteField_0= ruleAtWriteField | this_AtWriteLocal_1= ruleAtWriteLocal ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1438:1: (this_AtWriteField_0= ruleAtWriteField | this_AtWriteLocal_1= ruleAtWriteLocal )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1438:1: (this_AtWriteField_0= ruleAtWriteField | this_AtWriteLocal_1= ruleAtWriteLocal )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==67) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==RULE_ID) ) {
                    alt25=1;
                }
                else if ( (LA25_1==RULE_DOLLAR) ) {
                    alt25=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1439:5: this_AtWriteField_0= ruleAtWriteField
                    {
                     
                            newCompositeNode(grammarAccess.getAtWriteAccess().getAtWriteFieldParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAtWriteField_in_ruleAtWrite3316);
                    this_AtWriteField_0=ruleAtWriteField();

                    state._fsp--;

                     
                            current = this_AtWriteField_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1449:5: this_AtWriteLocal_1= ruleAtWriteLocal
                    {
                     
                            newCompositeNode(grammarAccess.getAtWriteAccess().getAtWriteLocalParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAtWriteLocal_in_ruleAtWrite3343);
                    this_AtWriteLocal_1=ruleAtWriteLocal();

                    state._fsp--;

                     
                            current = this_AtWriteLocal_1; 
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
    // $ANTLR end "ruleAtWrite"


    // $ANTLR start "entryRuleAtWriteField"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1465:1: entryRuleAtWriteField returns [EObject current=null] : iv_ruleAtWriteField= ruleAtWriteField EOF ;
    public final EObject entryRuleAtWriteField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtWriteField = null;


        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1466:2: (iv_ruleAtWriteField= ruleAtWriteField EOF )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1467:2: iv_ruleAtWriteField= ruleAtWriteField EOF
            {
             newCompositeNode(grammarAccess.getAtWriteFieldRule()); 
            pushFollow(FOLLOW_ruleAtWriteField_in_entryRuleAtWriteField3378);
            iv_ruleAtWriteField=ruleAtWriteField();

            state._fsp--;

             current =iv_ruleAtWriteField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtWriteField3388); 

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
    // $ANTLR end "entryRuleAtWriteField"


    // $ANTLR start "ruleAtWriteField"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1474:1: ruleAtWriteField returns [EObject current=null] : ( () otherlv_1= 'WRITE' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_counter_3_0= ruleCounter ) )? ) ;
    public final EObject ruleAtWriteField() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_counter_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1477:28: ( ( () otherlv_1= 'WRITE' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_counter_3_0= ruleCounter ) )? ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1478:1: ( () otherlv_1= 'WRITE' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_counter_3_0= ruleCounter ) )? )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1478:1: ( () otherlv_1= 'WRITE' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_counter_3_0= ruleCounter ) )? )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1478:2: () otherlv_1= 'WRITE' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_counter_3_0= ruleCounter ) )?
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1478:2: ()
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1479:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAtWriteFieldAccess().getAtWriteFieldAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleAtWriteField3434); 

                	newLeafNode(otherlv_1, grammarAccess.getAtWriteFieldAccess().getWRITEKeyword_1());
                
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1488:1: ( (lv_name_2_0= ruleQualifiedName ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1489:1: (lv_name_2_0= ruleQualifiedName )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1489:1: (lv_name_2_0= ruleQualifiedName )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1490:3: lv_name_2_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getAtWriteFieldAccess().getNameQualifiedNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleAtWriteField3455);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAtWriteFieldRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1506:2: ( (lv_counter_3_0= ruleCounter ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_INTVAL||LA26_0==72) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1507:1: (lv_counter_3_0= ruleCounter )
                    {
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1507:1: (lv_counter_3_0= ruleCounter )
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1508:3: lv_counter_3_0= ruleCounter
                    {
                     
                    	        newCompositeNode(grammarAccess.getAtWriteFieldAccess().getCounterCounterParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCounter_in_ruleAtWriteField3476);
                    lv_counter_3_0=ruleCounter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAtWriteFieldRule());
                    	        }
                           		set(
                           			current, 
                           			"counter",
                            		lv_counter_3_0, 
                            		"Counter");
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
    // $ANTLR end "ruleAtWriteField"


    // $ANTLR start "entryRuleAtWriteLocal"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1532:1: entryRuleAtWriteLocal returns [EObject current=null] : iv_ruleAtWriteLocal= ruleAtWriteLocal EOF ;
    public final EObject entryRuleAtWriteLocal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtWriteLocal = null;


        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1533:2: (iv_ruleAtWriteLocal= ruleAtWriteLocal EOF )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1534:2: iv_ruleAtWriteLocal= ruleAtWriteLocal EOF
            {
             newCompositeNode(grammarAccess.getAtWriteLocalRule()); 
            pushFollow(FOLLOW_ruleAtWriteLocal_in_entryRuleAtWriteLocal3513);
            iv_ruleAtWriteLocal=ruleAtWriteLocal();

            state._fsp--;

             current =iv_ruleAtWriteLocal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtWriteLocal3523); 

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
    // $ANTLR end "entryRuleAtWriteLocal"


    // $ANTLR start "ruleAtWriteLocal"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1541:1: ruleAtWriteLocal returns [EObject current=null] : ( () otherlv_1= 'WRITE' this_DOLLAR_2= RULE_DOLLAR ( (lv_name_3_0= RULE_ID ) ) ( (lv_counter_4_0= ruleCounter ) )? ) ;
    public final EObject ruleAtWriteLocal() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_DOLLAR_2=null;
        Token lv_name_3_0=null;
        AntlrDatatypeRuleToken lv_counter_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1544:28: ( ( () otherlv_1= 'WRITE' this_DOLLAR_2= RULE_DOLLAR ( (lv_name_3_0= RULE_ID ) ) ( (lv_counter_4_0= ruleCounter ) )? ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1545:1: ( () otherlv_1= 'WRITE' this_DOLLAR_2= RULE_DOLLAR ( (lv_name_3_0= RULE_ID ) ) ( (lv_counter_4_0= ruleCounter ) )? )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1545:1: ( () otherlv_1= 'WRITE' this_DOLLAR_2= RULE_DOLLAR ( (lv_name_3_0= RULE_ID ) ) ( (lv_counter_4_0= ruleCounter ) )? )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1545:2: () otherlv_1= 'WRITE' this_DOLLAR_2= RULE_DOLLAR ( (lv_name_3_0= RULE_ID ) ) ( (lv_counter_4_0= ruleCounter ) )?
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1545:2: ()
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1546:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAtWriteLocalAccess().getAtWriteLocalAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleAtWriteLocal3569); 

                	newLeafNode(otherlv_1, grammarAccess.getAtWriteLocalAccess().getWRITEKeyword_1());
                
            this_DOLLAR_2=(Token)match(input,RULE_DOLLAR,FOLLOW_RULE_DOLLAR_in_ruleAtWriteLocal3580); 
             
                newLeafNode(this_DOLLAR_2, grammarAccess.getAtWriteLocalAccess().getDOLLARTerminalRuleCall_2()); 
                
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1559:1: ( (lv_name_3_0= RULE_ID ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1560:1: (lv_name_3_0= RULE_ID )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1560:1: (lv_name_3_0= RULE_ID )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1561:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAtWriteLocal3596); 

            			newLeafNode(lv_name_3_0, grammarAccess.getAtWriteLocalAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAtWriteLocalRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"ID");
            	    

            }


            }

            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1577:2: ( (lv_counter_4_0= ruleCounter ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_INTVAL||LA27_0==72) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1578:1: (lv_counter_4_0= ruleCounter )
                    {
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1578:1: (lv_counter_4_0= ruleCounter )
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1579:3: lv_counter_4_0= ruleCounter
                    {
                     
                    	        newCompositeNode(grammarAccess.getAtWriteLocalAccess().getCounterCounterParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCounter_in_ruleAtWriteLocal3622);
                    lv_counter_4_0=ruleCounter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAtWriteLocalRule());
                    	        }
                           		set(
                           			current, 
                           			"counter",
                            		lv_counter_4_0, 
                            		"Counter");
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
    // $ANTLR end "ruleAtWriteLocal"


    // $ANTLR start "entryRuleAfterWrite"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1603:1: entryRuleAfterWrite returns [EObject current=null] : iv_ruleAfterWrite= ruleAfterWrite EOF ;
    public final EObject entryRuleAfterWrite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAfterWrite = null;


        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1604:2: (iv_ruleAfterWrite= ruleAfterWrite EOF )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1605:2: iv_ruleAfterWrite= ruleAfterWrite EOF
            {
             newCompositeNode(grammarAccess.getAfterWriteRule()); 
            pushFollow(FOLLOW_ruleAfterWrite_in_entryRuleAfterWrite3659);
            iv_ruleAfterWrite=ruleAfterWrite();

            state._fsp--;

             current =iv_ruleAfterWrite; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAfterWrite3669); 

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
    // $ANTLR end "entryRuleAfterWrite"


    // $ANTLR start "ruleAfterWrite"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1612:1: ruleAfterWrite returns [EObject current=null] : (this_AfterWriteField_0= ruleAfterWriteField | this_AfterWriteLocal_1= ruleAfterWriteLocal ) ;
    public final EObject ruleAfterWrite() throws RecognitionException {
        EObject current = null;

        EObject this_AfterWriteField_0 = null;

        EObject this_AfterWriteLocal_1 = null;


         enterRule(); 
            
        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1615:28: ( (this_AfterWriteField_0= ruleAfterWriteField | this_AfterWriteLocal_1= ruleAfterWriteLocal ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1616:1: (this_AfterWriteField_0= ruleAfterWriteField | this_AfterWriteLocal_1= ruleAfterWriteLocal )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1616:1: (this_AfterWriteField_0= ruleAfterWriteField | this_AfterWriteLocal_1= ruleAfterWriteLocal )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==67) ) {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==RULE_DOLLAR) ) {
                    alt28=2;
                }
                else if ( (LA28_1==RULE_ID) ) {
                    alt28=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1617:5: this_AfterWriteField_0= ruleAfterWriteField
                    {
                     
                            newCompositeNode(grammarAccess.getAfterWriteAccess().getAfterWriteFieldParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAfterWriteField_in_ruleAfterWrite3716);
                    this_AfterWriteField_0=ruleAfterWriteField();

                    state._fsp--;

                     
                            current = this_AfterWriteField_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1627:5: this_AfterWriteLocal_1= ruleAfterWriteLocal
                    {
                     
                            newCompositeNode(grammarAccess.getAfterWriteAccess().getAfterWriteLocalParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAfterWriteLocal_in_ruleAfterWrite3743);
                    this_AfterWriteLocal_1=ruleAfterWriteLocal();

                    state._fsp--;

                     
                            current = this_AfterWriteLocal_1; 
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
    // $ANTLR end "ruleAfterWrite"


    // $ANTLR start "entryRuleAfterWriteField"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1643:1: entryRuleAfterWriteField returns [EObject current=null] : iv_ruleAfterWriteField= ruleAfterWriteField EOF ;
    public final EObject entryRuleAfterWriteField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAfterWriteField = null;


        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1644:2: (iv_ruleAfterWriteField= ruleAfterWriteField EOF )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1645:2: iv_ruleAfterWriteField= ruleAfterWriteField EOF
            {
             newCompositeNode(grammarAccess.getAfterWriteFieldRule()); 
            pushFollow(FOLLOW_ruleAfterWriteField_in_entryRuleAfterWriteField3778);
            iv_ruleAfterWriteField=ruleAfterWriteField();

            state._fsp--;

             current =iv_ruleAfterWriteField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAfterWriteField3788); 

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
    // $ANTLR end "entryRuleAfterWriteField"


    // $ANTLR start "ruleAfterWriteField"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1652:1: ruleAfterWriteField returns [EObject current=null] : ( () otherlv_1= 'WRITE' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_counter_3_0= ruleCounter ) )? ) ;
    public final EObject ruleAfterWriteField() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_counter_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1655:28: ( ( () otherlv_1= 'WRITE' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_counter_3_0= ruleCounter ) )? ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1656:1: ( () otherlv_1= 'WRITE' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_counter_3_0= ruleCounter ) )? )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1656:1: ( () otherlv_1= 'WRITE' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_counter_3_0= ruleCounter ) )? )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1656:2: () otherlv_1= 'WRITE' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_counter_3_0= ruleCounter ) )?
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1656:2: ()
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1657:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAfterWriteFieldAccess().getAfterWriteFieldAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleAfterWriteField3834); 

                	newLeafNode(otherlv_1, grammarAccess.getAfterWriteFieldAccess().getWRITEKeyword_1());
                
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1666:1: ( (lv_name_2_0= ruleQualifiedName ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1667:1: (lv_name_2_0= ruleQualifiedName )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1667:1: (lv_name_2_0= ruleQualifiedName )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1668:3: lv_name_2_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getAfterWriteFieldAccess().getNameQualifiedNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleAfterWriteField3855);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAfterWriteFieldRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1684:2: ( (lv_counter_3_0= ruleCounter ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_INTVAL||LA29_0==72) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1685:1: (lv_counter_3_0= ruleCounter )
                    {
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1685:1: (lv_counter_3_0= ruleCounter )
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1686:3: lv_counter_3_0= ruleCounter
                    {
                     
                    	        newCompositeNode(grammarAccess.getAfterWriteFieldAccess().getCounterCounterParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCounter_in_ruleAfterWriteField3876);
                    lv_counter_3_0=ruleCounter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAfterWriteFieldRule());
                    	        }
                           		set(
                           			current, 
                           			"counter",
                            		lv_counter_3_0, 
                            		"Counter");
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
    // $ANTLR end "ruleAfterWriteField"


    // $ANTLR start "entryRuleAfterWriteLocal"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1710:1: entryRuleAfterWriteLocal returns [EObject current=null] : iv_ruleAfterWriteLocal= ruleAfterWriteLocal EOF ;
    public final EObject entryRuleAfterWriteLocal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAfterWriteLocal = null;


        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1711:2: (iv_ruleAfterWriteLocal= ruleAfterWriteLocal EOF )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1712:2: iv_ruleAfterWriteLocal= ruleAfterWriteLocal EOF
            {
             newCompositeNode(grammarAccess.getAfterWriteLocalRule()); 
            pushFollow(FOLLOW_ruleAfterWriteLocal_in_entryRuleAfterWriteLocal3913);
            iv_ruleAfterWriteLocal=ruleAfterWriteLocal();

            state._fsp--;

             current =iv_ruleAfterWriteLocal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAfterWriteLocal3923); 

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
    // $ANTLR end "entryRuleAfterWriteLocal"


    // $ANTLR start "ruleAfterWriteLocal"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1719:1: ruleAfterWriteLocal returns [EObject current=null] : ( () otherlv_1= 'WRITE' this_DOLLAR_2= RULE_DOLLAR ( (lv_name_3_0= RULE_ID ) ) ( (lv_counter_4_0= ruleCounter ) )? ) ;
    public final EObject ruleAfterWriteLocal() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_DOLLAR_2=null;
        Token lv_name_3_0=null;
        AntlrDatatypeRuleToken lv_counter_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1722:28: ( ( () otherlv_1= 'WRITE' this_DOLLAR_2= RULE_DOLLAR ( (lv_name_3_0= RULE_ID ) ) ( (lv_counter_4_0= ruleCounter ) )? ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1723:1: ( () otherlv_1= 'WRITE' this_DOLLAR_2= RULE_DOLLAR ( (lv_name_3_0= RULE_ID ) ) ( (lv_counter_4_0= ruleCounter ) )? )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1723:1: ( () otherlv_1= 'WRITE' this_DOLLAR_2= RULE_DOLLAR ( (lv_name_3_0= RULE_ID ) ) ( (lv_counter_4_0= ruleCounter ) )? )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1723:2: () otherlv_1= 'WRITE' this_DOLLAR_2= RULE_DOLLAR ( (lv_name_3_0= RULE_ID ) ) ( (lv_counter_4_0= ruleCounter ) )?
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1723:2: ()
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1724:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAfterWriteLocalAccess().getAfterWriteLocalAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleAfterWriteLocal3969); 

                	newLeafNode(otherlv_1, grammarAccess.getAfterWriteLocalAccess().getWRITEKeyword_1());
                
            this_DOLLAR_2=(Token)match(input,RULE_DOLLAR,FOLLOW_RULE_DOLLAR_in_ruleAfterWriteLocal3980); 
             
                newLeafNode(this_DOLLAR_2, grammarAccess.getAfterWriteLocalAccess().getDOLLARTerminalRuleCall_2()); 
                
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1737:1: ( (lv_name_3_0= RULE_ID ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1738:1: (lv_name_3_0= RULE_ID )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1738:1: (lv_name_3_0= RULE_ID )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1739:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAfterWriteLocal3996); 

            			newLeafNode(lv_name_3_0, grammarAccess.getAfterWriteLocalAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAfterWriteLocalRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"ID");
            	    

            }


            }

            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1755:2: ( (lv_counter_4_0= ruleCounter ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_INTVAL||LA30_0==72) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1756:1: (lv_counter_4_0= ruleCounter )
                    {
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1756:1: (lv_counter_4_0= ruleCounter )
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1757:3: lv_counter_4_0= ruleCounter
                    {
                     
                    	        newCompositeNode(grammarAccess.getAfterWriteLocalAccess().getCounterCounterParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCounter_in_ruleAfterWriteLocal4022);
                    lv_counter_4_0=ruleCounter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAfterWriteLocalRule());
                    	        }
                           		set(
                           			current, 
                           			"counter",
                            		lv_counter_4_0, 
                            		"Counter");
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
    // $ANTLR end "ruleAfterWriteLocal"


    // $ANTLR start "entryRuleAtInvoke"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1781:1: entryRuleAtInvoke returns [EObject current=null] : iv_ruleAtInvoke= ruleAtInvoke EOF ;
    public final EObject entryRuleAtInvoke() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtInvoke = null;


        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1782:2: (iv_ruleAtInvoke= ruleAtInvoke EOF )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1783:2: iv_ruleAtInvoke= ruleAtInvoke EOF
            {
             newCompositeNode(grammarAccess.getAtInvokeRule()); 
            pushFollow(FOLLOW_ruleAtInvoke_in_entryRuleAtInvoke4059);
            iv_ruleAtInvoke=ruleAtInvoke();

            state._fsp--;

             current =iv_ruleAtInvoke; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtInvoke4069); 

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
    // $ANTLR end "entryRuleAtInvoke"


    // $ANTLR start "ruleAtInvoke"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1790:1: ruleAtInvoke returns [EObject current=null] : ( () (otherlv_1= 'INVOKE' | otherlv_2= 'CALL' ) ( (lv_name_3_0= ruleQualifiedName ) ) ( (lv_parameterTypes_4_0= ruleParameterTypes ) )? ( (lv_counter_5_0= ruleCounter ) )? ) ;
    public final EObject ruleAtInvoke() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_parameterTypes_4_0 = null;

        AntlrDatatypeRuleToken lv_counter_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1793:28: ( ( () (otherlv_1= 'INVOKE' | otherlv_2= 'CALL' ) ( (lv_name_3_0= ruleQualifiedName ) ) ( (lv_parameterTypes_4_0= ruleParameterTypes ) )? ( (lv_counter_5_0= ruleCounter ) )? ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1794:1: ( () (otherlv_1= 'INVOKE' | otherlv_2= 'CALL' ) ( (lv_name_3_0= ruleQualifiedName ) ) ( (lv_parameterTypes_4_0= ruleParameterTypes ) )? ( (lv_counter_5_0= ruleCounter ) )? )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1794:1: ( () (otherlv_1= 'INVOKE' | otherlv_2= 'CALL' ) ( (lv_name_3_0= ruleQualifiedName ) ) ( (lv_parameterTypes_4_0= ruleParameterTypes ) )? ( (lv_counter_5_0= ruleCounter ) )? )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1794:2: () (otherlv_1= 'INVOKE' | otherlv_2= 'CALL' ) ( (lv_name_3_0= ruleQualifiedName ) ) ( (lv_parameterTypes_4_0= ruleParameterTypes ) )? ( (lv_counter_5_0= ruleCounter ) )?
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1794:2: ()
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1795:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAtInvokeAccess().getAtInvokeAction_0(),
                        current);
                

            }

            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1800:2: (otherlv_1= 'INVOKE' | otherlv_2= 'CALL' )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==68) ) {
                alt31=1;
            }
            else if ( (LA31_0==69) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1800:4: otherlv_1= 'INVOKE'
                    {
                    otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleAtInvoke4116); 

                        	newLeafNode(otherlv_1, grammarAccess.getAtInvokeAccess().getINVOKEKeyword_1_0());
                        

                    }
                    break;
                case 2 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1805:7: otherlv_2= 'CALL'
                    {
                    otherlv_2=(Token)match(input,69,FOLLOW_69_in_ruleAtInvoke4134); 

                        	newLeafNode(otherlv_2, grammarAccess.getAtInvokeAccess().getCALLKeyword_1_1());
                        

                    }
                    break;

            }

            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1809:2: ( (lv_name_3_0= ruleQualifiedName ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1810:1: (lv_name_3_0= ruleQualifiedName )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1810:1: (lv_name_3_0= ruleQualifiedName )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1811:3: lv_name_3_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getAtInvokeAccess().getNameQualifiedNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleAtInvoke4156);
            lv_name_3_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAtInvokeRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1827:2: ( (lv_parameterTypes_4_0= ruleParameterTypes ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_LPAREN) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1828:1: (lv_parameterTypes_4_0= ruleParameterTypes )
                    {
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1828:1: (lv_parameterTypes_4_0= ruleParameterTypes )
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1829:3: lv_parameterTypes_4_0= ruleParameterTypes
                    {
                     
                    	        newCompositeNode(grammarAccess.getAtInvokeAccess().getParameterTypesParameterTypesParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameterTypes_in_ruleAtInvoke4177);
                    lv_parameterTypes_4_0=ruleParameterTypes();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAtInvokeRule());
                    	        }
                           		set(
                           			current, 
                           			"parameterTypes",
                            		lv_parameterTypes_4_0, 
                            		"ParameterTypes");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1845:3: ( (lv_counter_5_0= ruleCounter ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_INTVAL||LA33_0==72) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1846:1: (lv_counter_5_0= ruleCounter )
                    {
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1846:1: (lv_counter_5_0= ruleCounter )
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1847:3: lv_counter_5_0= ruleCounter
                    {
                     
                    	        newCompositeNode(grammarAccess.getAtInvokeAccess().getCounterCounterParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCounter_in_ruleAtInvoke4199);
                    lv_counter_5_0=ruleCounter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAtInvokeRule());
                    	        }
                           		set(
                           			current, 
                           			"counter",
                            		lv_counter_5_0, 
                            		"Counter");
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
    // $ANTLR end "ruleAtInvoke"


    // $ANTLR start "entryRuleAfterInvoke"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1871:1: entryRuleAfterInvoke returns [EObject current=null] : iv_ruleAfterInvoke= ruleAfterInvoke EOF ;
    public final EObject entryRuleAfterInvoke() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAfterInvoke = null;


        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1872:2: (iv_ruleAfterInvoke= ruleAfterInvoke EOF )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1873:2: iv_ruleAfterInvoke= ruleAfterInvoke EOF
            {
             newCompositeNode(grammarAccess.getAfterInvokeRule()); 
            pushFollow(FOLLOW_ruleAfterInvoke_in_entryRuleAfterInvoke4236);
            iv_ruleAfterInvoke=ruleAfterInvoke();

            state._fsp--;

             current =iv_ruleAfterInvoke; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAfterInvoke4246); 

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
    // $ANTLR end "entryRuleAfterInvoke"


    // $ANTLR start "ruleAfterInvoke"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1880:1: ruleAfterInvoke returns [EObject current=null] : ( () (otherlv_1= 'INVOKE' | otherlv_2= 'CALL' ) ( (lv_name_3_0= ruleQualifiedName ) ) ( (lv_parameterTypes_4_0= ruleParameterTypes ) )? ( (lv_counter_5_0= ruleCounter ) )? ) ;
    public final EObject ruleAfterInvoke() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_parameterTypes_4_0 = null;

        AntlrDatatypeRuleToken lv_counter_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1883:28: ( ( () (otherlv_1= 'INVOKE' | otherlv_2= 'CALL' ) ( (lv_name_3_0= ruleQualifiedName ) ) ( (lv_parameterTypes_4_0= ruleParameterTypes ) )? ( (lv_counter_5_0= ruleCounter ) )? ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1884:1: ( () (otherlv_1= 'INVOKE' | otherlv_2= 'CALL' ) ( (lv_name_3_0= ruleQualifiedName ) ) ( (lv_parameterTypes_4_0= ruleParameterTypes ) )? ( (lv_counter_5_0= ruleCounter ) )? )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1884:1: ( () (otherlv_1= 'INVOKE' | otherlv_2= 'CALL' ) ( (lv_name_3_0= ruleQualifiedName ) ) ( (lv_parameterTypes_4_0= ruleParameterTypes ) )? ( (lv_counter_5_0= ruleCounter ) )? )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1884:2: () (otherlv_1= 'INVOKE' | otherlv_2= 'CALL' ) ( (lv_name_3_0= ruleQualifiedName ) ) ( (lv_parameterTypes_4_0= ruleParameterTypes ) )? ( (lv_counter_5_0= ruleCounter ) )?
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1884:2: ()
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1885:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAfterInvokeAccess().getAfterInvokeAction_0(),
                        current);
                

            }

            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1890:2: (otherlv_1= 'INVOKE' | otherlv_2= 'CALL' )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==68) ) {
                alt34=1;
            }
            else if ( (LA34_0==69) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1890:4: otherlv_1= 'INVOKE'
                    {
                    otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleAfterInvoke4293); 

                        	newLeafNode(otherlv_1, grammarAccess.getAfterInvokeAccess().getINVOKEKeyword_1_0());
                        

                    }
                    break;
                case 2 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1895:7: otherlv_2= 'CALL'
                    {
                    otherlv_2=(Token)match(input,69,FOLLOW_69_in_ruleAfterInvoke4311); 

                        	newLeafNode(otherlv_2, grammarAccess.getAfterInvokeAccess().getCALLKeyword_1_1());
                        

                    }
                    break;

            }

            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1899:2: ( (lv_name_3_0= ruleQualifiedName ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1900:1: (lv_name_3_0= ruleQualifiedName )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1900:1: (lv_name_3_0= ruleQualifiedName )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1901:3: lv_name_3_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getAfterInvokeAccess().getNameQualifiedNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleAfterInvoke4333);
            lv_name_3_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAfterInvokeRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1917:2: ( (lv_parameterTypes_4_0= ruleParameterTypes ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_LPAREN) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1918:1: (lv_parameterTypes_4_0= ruleParameterTypes )
                    {
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1918:1: (lv_parameterTypes_4_0= ruleParameterTypes )
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1919:3: lv_parameterTypes_4_0= ruleParameterTypes
                    {
                     
                    	        newCompositeNode(grammarAccess.getAfterInvokeAccess().getParameterTypesParameterTypesParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameterTypes_in_ruleAfterInvoke4354);
                    lv_parameterTypes_4_0=ruleParameterTypes();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAfterInvokeRule());
                    	        }
                           		set(
                           			current, 
                           			"parameterTypes",
                            		lv_parameterTypes_4_0, 
                            		"ParameterTypes");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1935:3: ( (lv_counter_5_0= ruleCounter ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_INTVAL||LA36_0==72) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1936:1: (lv_counter_5_0= ruleCounter )
                    {
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1936:1: (lv_counter_5_0= ruleCounter )
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1937:3: lv_counter_5_0= ruleCounter
                    {
                     
                    	        newCompositeNode(grammarAccess.getAfterInvokeAccess().getCounterCounterParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCounter_in_ruleAfterInvoke4376);
                    lv_counter_5_0=ruleCounter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAfterInvokeRule());
                    	        }
                           		set(
                           			current, 
                           			"counter",
                            		lv_counter_5_0, 
                            		"Counter");
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
    // $ANTLR end "ruleAfterInvoke"


    // $ANTLR start "entryRuleAtSynchronize"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1961:1: entryRuleAtSynchronize returns [EObject current=null] : iv_ruleAtSynchronize= ruleAtSynchronize EOF ;
    public final EObject entryRuleAtSynchronize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtSynchronize = null;


        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1962:2: (iv_ruleAtSynchronize= ruleAtSynchronize EOF )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1963:2: iv_ruleAtSynchronize= ruleAtSynchronize EOF
            {
             newCompositeNode(grammarAccess.getAtSynchronizeRule()); 
            pushFollow(FOLLOW_ruleAtSynchronize_in_entryRuleAtSynchronize4413);
            iv_ruleAtSynchronize=ruleAtSynchronize();

            state._fsp--;

             current =iv_ruleAtSynchronize; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtSynchronize4423); 

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
    // $ANTLR end "entryRuleAtSynchronize"


    // $ANTLR start "ruleAtSynchronize"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1970:1: ruleAtSynchronize returns [EObject current=null] : ( () otherlv_1= 'SYNCHRONIZE' ( (lv_counter_2_0= ruleCounter ) )? ) ;
    public final EObject ruleAtSynchronize() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_counter_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1973:28: ( ( () otherlv_1= 'SYNCHRONIZE' ( (lv_counter_2_0= ruleCounter ) )? ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1974:1: ( () otherlv_1= 'SYNCHRONIZE' ( (lv_counter_2_0= ruleCounter ) )? )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1974:1: ( () otherlv_1= 'SYNCHRONIZE' ( (lv_counter_2_0= ruleCounter ) )? )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1974:2: () otherlv_1= 'SYNCHRONIZE' ( (lv_counter_2_0= ruleCounter ) )?
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1974:2: ()
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1975:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAtSynchronizeAccess().getAtSynchronizeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,70,FOLLOW_70_in_ruleAtSynchronize4469); 

                	newLeafNode(otherlv_1, grammarAccess.getAtSynchronizeAccess().getSYNCHRONIZEKeyword_1());
                
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1984:1: ( (lv_counter_2_0= ruleCounter ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_INTVAL||LA37_0==72) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1985:1: (lv_counter_2_0= ruleCounter )
                    {
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1985:1: (lv_counter_2_0= ruleCounter )
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:1986:3: lv_counter_2_0= ruleCounter
                    {
                     
                    	        newCompositeNode(grammarAccess.getAtSynchronizeAccess().getCounterCounterParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCounter_in_ruleAtSynchronize4490);
                    lv_counter_2_0=ruleCounter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAtSynchronizeRule());
                    	        }
                           		set(
                           			current, 
                           			"counter",
                            		lv_counter_2_0, 
                            		"Counter");
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
    // $ANTLR end "ruleAtSynchronize"


    // $ANTLR start "entryRuleAfterSynchronize"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2010:1: entryRuleAfterSynchronize returns [EObject current=null] : iv_ruleAfterSynchronize= ruleAfterSynchronize EOF ;
    public final EObject entryRuleAfterSynchronize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAfterSynchronize = null;


        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2011:2: (iv_ruleAfterSynchronize= ruleAfterSynchronize EOF )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2012:2: iv_ruleAfterSynchronize= ruleAfterSynchronize EOF
            {
             newCompositeNode(grammarAccess.getAfterSynchronizeRule()); 
            pushFollow(FOLLOW_ruleAfterSynchronize_in_entryRuleAfterSynchronize4527);
            iv_ruleAfterSynchronize=ruleAfterSynchronize();

            state._fsp--;

             current =iv_ruleAfterSynchronize; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAfterSynchronize4537); 

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
    // $ANTLR end "entryRuleAfterSynchronize"


    // $ANTLR start "ruleAfterSynchronize"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2019:1: ruleAfterSynchronize returns [EObject current=null] : ( () otherlv_1= 'SYNCHRONIZE' ( (lv_counter_2_0= ruleCounter ) )? ) ;
    public final EObject ruleAfterSynchronize() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_counter_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2022:28: ( ( () otherlv_1= 'SYNCHRONIZE' ( (lv_counter_2_0= ruleCounter ) )? ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2023:1: ( () otherlv_1= 'SYNCHRONIZE' ( (lv_counter_2_0= ruleCounter ) )? )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2023:1: ( () otherlv_1= 'SYNCHRONIZE' ( (lv_counter_2_0= ruleCounter ) )? )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2023:2: () otherlv_1= 'SYNCHRONIZE' ( (lv_counter_2_0= ruleCounter ) )?
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2023:2: ()
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2024:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAfterSynchronizeAccess().getAfterSynchronizeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,70,FOLLOW_70_in_ruleAfterSynchronize4583); 

                	newLeafNode(otherlv_1, grammarAccess.getAfterSynchronizeAccess().getSYNCHRONIZEKeyword_1());
                
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2033:1: ( (lv_counter_2_0= ruleCounter ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_INTVAL||LA38_0==72) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2034:1: (lv_counter_2_0= ruleCounter )
                    {
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2034:1: (lv_counter_2_0= ruleCounter )
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2035:3: lv_counter_2_0= ruleCounter
                    {
                     
                    	        newCompositeNode(grammarAccess.getAfterSynchronizeAccess().getCounterCounterParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCounter_in_ruleAfterSynchronize4604);
                    lv_counter_2_0=ruleCounter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAfterSynchronizeRule());
                    	        }
                           		set(
                           			current, 
                           			"counter",
                            		lv_counter_2_0, 
                            		"Counter");
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
    // $ANTLR end "ruleAfterSynchronize"


    // $ANTLR start "entryRuleAtThrow"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2059:1: entryRuleAtThrow returns [EObject current=null] : iv_ruleAtThrow= ruleAtThrow EOF ;
    public final EObject entryRuleAtThrow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtThrow = null;


        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2060:2: (iv_ruleAtThrow= ruleAtThrow EOF )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2061:2: iv_ruleAtThrow= ruleAtThrow EOF
            {
             newCompositeNode(grammarAccess.getAtThrowRule()); 
            pushFollow(FOLLOW_ruleAtThrow_in_entryRuleAtThrow4641);
            iv_ruleAtThrow=ruleAtThrow();

            state._fsp--;

             current =iv_ruleAtThrow; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtThrow4651); 

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
    // $ANTLR end "entryRuleAtThrow"


    // $ANTLR start "ruleAtThrow"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2068:1: ruleAtThrow returns [EObject current=null] : ( () otherlv_1= 'THROW' ( (lv_name_2_0= ruleQualifiedName ) )? ( (lv_counter_3_0= ruleCounter ) )? ) ;
    public final EObject ruleAtThrow() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_counter_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2071:28: ( ( () otherlv_1= 'THROW' ( (lv_name_2_0= ruleQualifiedName ) )? ( (lv_counter_3_0= ruleCounter ) )? ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2072:1: ( () otherlv_1= 'THROW' ( (lv_name_2_0= ruleQualifiedName ) )? ( (lv_counter_3_0= ruleCounter ) )? )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2072:1: ( () otherlv_1= 'THROW' ( (lv_name_2_0= ruleQualifiedName ) )? ( (lv_counter_3_0= ruleCounter ) )? )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2072:2: () otherlv_1= 'THROW' ( (lv_name_2_0= ruleQualifiedName ) )? ( (lv_counter_3_0= ruleCounter ) )?
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2072:2: ()
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2073:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAtThrowAccess().getAtThrowAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,71,FOLLOW_71_in_ruleAtThrow4697); 

                	newLeafNode(otherlv_1, grammarAccess.getAtThrowAccess().getTHROWKeyword_1());
                
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2082:1: ( (lv_name_2_0= ruleQualifiedName ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_ID) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2083:1: (lv_name_2_0= ruleQualifiedName )
                    {
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2083:1: (lv_name_2_0= ruleQualifiedName )
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2084:3: lv_name_2_0= ruleQualifiedName
                    {
                     
                    	        newCompositeNode(grammarAccess.getAtThrowAccess().getNameQualifiedNameParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleAtThrow4718);
                    lv_name_2_0=ruleQualifiedName();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAtThrowRule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_2_0, 
                            		"QualifiedName");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2100:3: ( (lv_counter_3_0= ruleCounter ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_INTVAL||LA40_0==72) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2101:1: (lv_counter_3_0= ruleCounter )
                    {
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2101:1: (lv_counter_3_0= ruleCounter )
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2102:3: lv_counter_3_0= ruleCounter
                    {
                     
                    	        newCompositeNode(grammarAccess.getAtThrowAccess().getCounterCounterParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCounter_in_ruleAtThrow4740);
                    lv_counter_3_0=ruleCounter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAtThrowRule());
                    	        }
                           		set(
                           			current, 
                           			"counter",
                            		lv_counter_3_0, 
                            		"Counter");
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
    // $ANTLR end "ruleAtThrow"


    // $ANTLR start "entryRuleParameterTypes"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2126:1: entryRuleParameterTypes returns [EObject current=null] : iv_ruleParameterTypes= ruleParameterTypes EOF ;
    public final EObject entryRuleParameterTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterTypes = null;


        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2127:2: (iv_ruleParameterTypes= ruleParameterTypes EOF )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2128:2: iv_ruleParameterTypes= ruleParameterTypes EOF
            {
             newCompositeNode(grammarAccess.getParameterTypesRule()); 
            pushFollow(FOLLOW_ruleParameterTypes_in_entryRuleParameterTypes4777);
            iv_ruleParameterTypes=ruleParameterTypes();

            state._fsp--;

             current =iv_ruleParameterTypes; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterTypes4787); 

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
    // $ANTLR end "entryRuleParameterTypes"


    // $ANTLR start "ruleParameterTypes"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2135:1: ruleParameterTypes returns [EObject current=null] : (this_LPAREN_0= RULE_LPAREN () ( ( (lv_paramTypeNames_2_0= ruleParamTypeName ) ) (this_COMMA_3= RULE_COMMA ( (lv_paramTypeNames_4_0= ruleParamTypeName ) ) )* )? this_RPAREN_5= RULE_RPAREN ) ;
    public final EObject ruleParameterTypes() throws RecognitionException {
        EObject current = null;

        Token this_LPAREN_0=null;
        Token this_COMMA_3=null;
        Token this_RPAREN_5=null;
        AntlrDatatypeRuleToken lv_paramTypeNames_2_0 = null;

        AntlrDatatypeRuleToken lv_paramTypeNames_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2138:28: ( (this_LPAREN_0= RULE_LPAREN () ( ( (lv_paramTypeNames_2_0= ruleParamTypeName ) ) (this_COMMA_3= RULE_COMMA ( (lv_paramTypeNames_4_0= ruleParamTypeName ) ) )* )? this_RPAREN_5= RULE_RPAREN ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2139:1: (this_LPAREN_0= RULE_LPAREN () ( ( (lv_paramTypeNames_2_0= ruleParamTypeName ) ) (this_COMMA_3= RULE_COMMA ( (lv_paramTypeNames_4_0= ruleParamTypeName ) ) )* )? this_RPAREN_5= RULE_RPAREN )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2139:1: (this_LPAREN_0= RULE_LPAREN () ( ( (lv_paramTypeNames_2_0= ruleParamTypeName ) ) (this_COMMA_3= RULE_COMMA ( (lv_paramTypeNames_4_0= ruleParamTypeName ) ) )* )? this_RPAREN_5= RULE_RPAREN )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2139:2: this_LPAREN_0= RULE_LPAREN () ( ( (lv_paramTypeNames_2_0= ruleParamTypeName ) ) (this_COMMA_3= RULE_COMMA ( (lv_paramTypeNames_4_0= ruleParamTypeName ) ) )* )? this_RPAREN_5= RULE_RPAREN
            {
            this_LPAREN_0=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleParameterTypes4823); 
             
                newLeafNode(this_LPAREN_0, grammarAccess.getParameterTypesAccess().getLPARENTerminalRuleCall_0()); 
                
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2143:1: ()
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2144:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getParameterTypesAccess().getParameterTypesAction_1(),
                        current);
                

            }

            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2149:2: ( ( (lv_paramTypeNames_2_0= ruleParamTypeName ) ) (this_COMMA_3= RULE_COMMA ( (lv_paramTypeNames_4_0= ruleParamTypeName ) ) )* )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_ID) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2149:3: ( (lv_paramTypeNames_2_0= ruleParamTypeName ) ) (this_COMMA_3= RULE_COMMA ( (lv_paramTypeNames_4_0= ruleParamTypeName ) ) )*
                    {
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2149:3: ( (lv_paramTypeNames_2_0= ruleParamTypeName ) )
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2150:1: (lv_paramTypeNames_2_0= ruleParamTypeName )
                    {
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2150:1: (lv_paramTypeNames_2_0= ruleParamTypeName )
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2151:3: lv_paramTypeNames_2_0= ruleParamTypeName
                    {
                     
                    	        newCompositeNode(grammarAccess.getParameterTypesAccess().getParamTypeNamesParamTypeNameParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParamTypeName_in_ruleParameterTypes4853);
                    lv_paramTypeNames_2_0=ruleParamTypeName();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParameterTypesRule());
                    	        }
                           		add(
                           			current, 
                           			"paramTypeNames",
                            		lv_paramTypeNames_2_0, 
                            		"ParamTypeName");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2167:2: (this_COMMA_3= RULE_COMMA ( (lv_paramTypeNames_4_0= ruleParamTypeName ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==RULE_COMMA) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2167:3: this_COMMA_3= RULE_COMMA ( (lv_paramTypeNames_4_0= ruleParamTypeName ) )
                    	    {
                    	    this_COMMA_3=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleParameterTypes4865); 
                    	     
                    	        newLeafNode(this_COMMA_3, grammarAccess.getParameterTypesAccess().getCOMMATerminalRuleCall_2_1_0()); 
                    	        
                    	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2171:1: ( (lv_paramTypeNames_4_0= ruleParamTypeName ) )
                    	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2172:1: (lv_paramTypeNames_4_0= ruleParamTypeName )
                    	    {
                    	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2172:1: (lv_paramTypeNames_4_0= ruleParamTypeName )
                    	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2173:3: lv_paramTypeNames_4_0= ruleParamTypeName
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getParameterTypesAccess().getParamTypeNamesParamTypeNameParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleParamTypeName_in_ruleParameterTypes4885);
                    	    lv_paramTypeNames_4_0=ruleParamTypeName();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getParameterTypesRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"paramTypeNames",
                    	            		lv_paramTypeNames_4_0, 
                    	            		"ParamTypeName");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);


                    }
                    break;

            }

            this_RPAREN_5=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleParameterTypes4900); 
             
                newLeafNode(this_RPAREN_5, grammarAccess.getParameterTypesAccess().getRPARENTerminalRuleCall_3()); 
                

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
    // $ANTLR end "ruleParameterTypes"


    // $ANTLR start "entryRuleParamTypeName"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2201:1: entryRuleParamTypeName returns [String current=null] : iv_ruleParamTypeName= ruleParamTypeName EOF ;
    public final String entryRuleParamTypeName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleParamTypeName = null;


        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2202:2: (iv_ruleParamTypeName= ruleParamTypeName EOF )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2203:2: iv_ruleParamTypeName= ruleParamTypeName EOF
            {
             newCompositeNode(grammarAccess.getParamTypeNameRule()); 
            pushFollow(FOLLOW_ruleParamTypeName_in_entryRuleParamTypeName4936);
            iv_ruleParamTypeName=ruleParamTypeName();

            state._fsp--;

             current =iv_ruleParamTypeName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParamTypeName4947); 

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
    // $ANTLR end "entryRuleParamTypeName"


    // $ANTLR start "ruleParamTypeName"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2210:1: ruleParamTypeName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_QualifiedName_0= ruleQualifiedName ;
    public final AntlrDatatypeRuleToken ruleParamTypeName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2213:28: (this_QualifiedName_0= ruleQualifiedName )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2215:5: this_QualifiedName_0= ruleQualifiedName
            {
             
                    newCompositeNode(grammarAccess.getParamTypeNameAccess().getQualifiedNameParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleParamTypeName4993);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            		current.merge(this_QualifiedName_0);
                
             
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleParamTypeName"


    // $ANTLR start "entryRuleCounter"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2233:1: entryRuleCounter returns [String current=null] : iv_ruleCounter= ruleCounter EOF ;
    public final String entryRuleCounter() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCounter = null;


        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2234:2: (iv_ruleCounter= ruleCounter EOF )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2235:2: iv_ruleCounter= ruleCounter EOF
            {
             newCompositeNode(grammarAccess.getCounterRule()); 
            pushFollow(FOLLOW_ruleCounter_in_entryRuleCounter5038);
            iv_ruleCounter=ruleCounter();

            state._fsp--;

             current =iv_ruleCounter.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCounter5049); 

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
    // $ANTLR end "entryRuleCounter"


    // $ANTLR start "ruleCounter"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2242:1: ruleCounter returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INTVAL_0= RULE_INTVAL | kw= 'ALL' ) ;
    public final AntlrDatatypeRuleToken ruleCounter() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INTVAL_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2245:28: ( (this_INTVAL_0= RULE_INTVAL | kw= 'ALL' ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2246:1: (this_INTVAL_0= RULE_INTVAL | kw= 'ALL' )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2246:1: (this_INTVAL_0= RULE_INTVAL | kw= 'ALL' )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_INTVAL) ) {
                alt43=1;
            }
            else if ( (LA43_0==72) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2246:6: this_INTVAL_0= RULE_INTVAL
                    {
                    this_INTVAL_0=(Token)match(input,RULE_INTVAL,FOLLOW_RULE_INTVAL_in_ruleCounter5089); 

                    		current.merge(this_INTVAL_0);
                        
                     
                        newLeafNode(this_INTVAL_0, grammarAccess.getCounterAccess().getINTVALTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2255:2: kw= 'ALL'
                    {
                    kw=(Token)match(input,72,FOLLOW_72_in_ruleCounter5113); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCounterAccess().getALLKeyword_1()); 
                        

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
    // $ANTLR end "ruleCounter"


    // $ANTLR start "entryRuleBind"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2268:1: entryRuleBind returns [EObject current=null] : iv_ruleBind= ruleBind EOF ;
    public final EObject entryRuleBind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBind = null;


        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2269:2: (iv_ruleBind= ruleBind EOF )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2270:2: iv_ruleBind= ruleBind EOF
            {
             newCompositeNode(grammarAccess.getBindRule()); 
            pushFollow(FOLLOW_ruleBind_in_entryRuleBind5153);
            iv_ruleBind=ruleBind();

            state._fsp--;

             current =iv_ruleBind; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBind5163); 

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
    // $ANTLR end "entryRuleBind"


    // $ANTLR start "ruleBind"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2277:1: ruleBind returns [EObject current=null] : (this_KEYWORD_BIND_0= RULE_KEYWORD_BIND () (this_NOTHING_2= RULE_NOTHING | ( (lv_bind_3_0= ruleBindings ) ) ) ) ;
    public final EObject ruleBind() throws RecognitionException {
        EObject current = null;

        Token this_KEYWORD_BIND_0=null;
        Token this_NOTHING_2=null;
        EObject lv_bind_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2280:28: ( (this_KEYWORD_BIND_0= RULE_KEYWORD_BIND () (this_NOTHING_2= RULE_NOTHING | ( (lv_bind_3_0= ruleBindings ) ) ) ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2281:1: (this_KEYWORD_BIND_0= RULE_KEYWORD_BIND () (this_NOTHING_2= RULE_NOTHING | ( (lv_bind_3_0= ruleBindings ) ) ) )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2281:1: (this_KEYWORD_BIND_0= RULE_KEYWORD_BIND () (this_NOTHING_2= RULE_NOTHING | ( (lv_bind_3_0= ruleBindings ) ) ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2281:2: this_KEYWORD_BIND_0= RULE_KEYWORD_BIND () (this_NOTHING_2= RULE_NOTHING | ( (lv_bind_3_0= ruleBindings ) ) )
            {
            this_KEYWORD_BIND_0=(Token)match(input,RULE_KEYWORD_BIND,FOLLOW_RULE_KEYWORD_BIND_in_ruleBind5199); 
             
                newLeafNode(this_KEYWORD_BIND_0, grammarAccess.getBindAccess().getKEYWORD_BINDTerminalRuleCall_0()); 
                
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2285:1: ()
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2286:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBindAccess().getBindAction_1(),
                        current);
                

            }

            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2291:2: (this_NOTHING_2= RULE_NOTHING | ( (lv_bind_3_0= ruleBindings ) ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_NOTHING) ) {
                alt44=1;
            }
            else if ( (LA44_0==RULE_ID) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2291:3: this_NOTHING_2= RULE_NOTHING
                    {
                    this_NOTHING_2=(Token)match(input,RULE_NOTHING,FOLLOW_RULE_NOTHING_in_ruleBind5219); 
                     
                        newLeafNode(this_NOTHING_2, grammarAccess.getBindAccess().getNOTHINGTerminalRuleCall_2_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2296:6: ( (lv_bind_3_0= ruleBindings ) )
                    {
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2296:6: ( (lv_bind_3_0= ruleBindings ) )
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2297:1: (lv_bind_3_0= ruleBindings )
                    {
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2297:1: (lv_bind_3_0= ruleBindings )
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2298:3: lv_bind_3_0= ruleBindings
                    {
                     
                    	        newCompositeNode(grammarAccess.getBindAccess().getBindBindingsParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBindings_in_ruleBind5245);
                    lv_bind_3_0=ruleBindings();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBindRule());
                    	        }
                           		set(
                           			current, 
                           			"bind",
                            		lv_bind_3_0, 
                            		"Bindings");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


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
    // $ANTLR end "ruleBind"


    // $ANTLR start "entryRuleBindings"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2322:1: entryRuleBindings returns [EObject current=null] : iv_ruleBindings= ruleBindings EOF ;
    public final EObject entryRuleBindings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBindings = null;


        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2323:2: (iv_ruleBindings= ruleBindings EOF )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2324:2: iv_ruleBindings= ruleBindings EOF
            {
             newCompositeNode(grammarAccess.getBindingsRule()); 
            pushFollow(FOLLOW_ruleBindings_in_entryRuleBindings5282);
            iv_ruleBindings=ruleBindings();

            state._fsp--;

             current =iv_ruleBindings; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBindings5292); 

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
    // $ANTLR end "entryRuleBindings"


    // $ANTLR start "ruleBindings"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2331:1: ruleBindings returns [EObject current=null] : ( ( (lv_bindings_0_0= ruleBinding ) ) (this_SEMICOLON_1= RULE_SEMICOLON ( (lv_bindings_2_0= ruleBinding ) ) )* (this_SEMICOLON_3= RULE_SEMICOLON )? ) ;
    public final EObject ruleBindings() throws RecognitionException {
        EObject current = null;

        Token this_SEMICOLON_1=null;
        Token this_SEMICOLON_3=null;
        EObject lv_bindings_0_0 = null;

        EObject lv_bindings_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2334:28: ( ( ( (lv_bindings_0_0= ruleBinding ) ) (this_SEMICOLON_1= RULE_SEMICOLON ( (lv_bindings_2_0= ruleBinding ) ) )* (this_SEMICOLON_3= RULE_SEMICOLON )? ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2335:1: ( ( (lv_bindings_0_0= ruleBinding ) ) (this_SEMICOLON_1= RULE_SEMICOLON ( (lv_bindings_2_0= ruleBinding ) ) )* (this_SEMICOLON_3= RULE_SEMICOLON )? )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2335:1: ( ( (lv_bindings_0_0= ruleBinding ) ) (this_SEMICOLON_1= RULE_SEMICOLON ( (lv_bindings_2_0= ruleBinding ) ) )* (this_SEMICOLON_3= RULE_SEMICOLON )? )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2335:2: ( (lv_bindings_0_0= ruleBinding ) ) (this_SEMICOLON_1= RULE_SEMICOLON ( (lv_bindings_2_0= ruleBinding ) ) )* (this_SEMICOLON_3= RULE_SEMICOLON )?
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2335:2: ( (lv_bindings_0_0= ruleBinding ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2336:1: (lv_bindings_0_0= ruleBinding )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2336:1: (lv_bindings_0_0= ruleBinding )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2337:3: lv_bindings_0_0= ruleBinding
            {
             
            	        newCompositeNode(grammarAccess.getBindingsAccess().getBindingsBindingParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleBinding_in_ruleBindings5338);
            lv_bindings_0_0=ruleBinding();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBindingsRule());
            	        }
                   		add(
                   			current, 
                   			"bindings",
                    		lv_bindings_0_0, 
                    		"Binding");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2353:2: (this_SEMICOLON_1= RULE_SEMICOLON ( (lv_bindings_2_0= ruleBinding ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==RULE_SEMICOLON) ) {
                    int LA45_1 = input.LA(2);

                    if ( (LA45_1==RULE_ID) ) {
                        alt45=1;
                    }


                }


                switch (alt45) {
            	case 1 :
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2353:3: this_SEMICOLON_1= RULE_SEMICOLON ( (lv_bindings_2_0= ruleBinding ) )
            	    {
            	    this_SEMICOLON_1=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleBindings5350); 
            	     
            	        newLeafNode(this_SEMICOLON_1, grammarAccess.getBindingsAccess().getSEMICOLONTerminalRuleCall_1_0()); 
            	        
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2357:1: ( (lv_bindings_2_0= ruleBinding ) )
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2358:1: (lv_bindings_2_0= ruleBinding )
            	    {
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2358:1: (lv_bindings_2_0= ruleBinding )
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2359:3: lv_bindings_2_0= ruleBinding
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBindingsAccess().getBindingsBindingParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBinding_in_ruleBindings5370);
            	    lv_bindings_2_0=ruleBinding();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBindingsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"bindings",
            	            		lv_bindings_2_0, 
            	            		"Binding");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2375:4: (this_SEMICOLON_3= RULE_SEMICOLON )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_SEMICOLON) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2375:5: this_SEMICOLON_3= RULE_SEMICOLON
                    {
                    this_SEMICOLON_3=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleBindings5384); 
                     
                        newLeafNode(this_SEMICOLON_3, grammarAccess.getBindingsAccess().getSEMICOLONTerminalRuleCall_2()); 
                        

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
    // $ANTLR end "ruleBindings"


    // $ANTLR start "entryRuleBinding"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2387:1: entryRuleBinding returns [EObject current=null] : iv_ruleBinding= ruleBinding EOF ;
    public final EObject entryRuleBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinding = null;


        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2388:2: (iv_ruleBinding= ruleBinding EOF )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2389:2: iv_ruleBinding= ruleBinding EOF
            {
             newCompositeNode(grammarAccess.getBindingRule()); 
            pushFollow(FOLLOW_ruleBinding_in_entryRuleBinding5421);
            iv_ruleBinding=ruleBinding();

            state._fsp--;

             current =iv_ruleBinding; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinding5431); 

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
    // $ANTLR end "entryRuleBinding"


    // $ANTLR start "ruleBinding"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2396:1: ruleBinding returns [EObject current=null] : ( ( (lv_bindVariable_0_0= ruleBindVariable ) ) ( (this_ASSIGN_1= RULE_ASSIGN ( (lv_value_2_0= ruleExpression ) ) ) | ( (this_COLON_3= RULE_COLON ( (lv_typename_4_0= ruleTypeName ) ) ) (this_ASSIGN_5= RULE_ASSIGN ( (lv_value_6_0= ruleExpression ) ) )? ) ) ) ;
    public final EObject ruleBinding() throws RecognitionException {
        EObject current = null;

        Token this_ASSIGN_1=null;
        Token this_COLON_3=null;
        Token this_ASSIGN_5=null;
        AntlrDatatypeRuleToken lv_bindVariable_0_0 = null;

        EObject lv_value_2_0 = null;

        AntlrDatatypeRuleToken lv_typename_4_0 = null;

        EObject lv_value_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2399:28: ( ( ( (lv_bindVariable_0_0= ruleBindVariable ) ) ( (this_ASSIGN_1= RULE_ASSIGN ( (lv_value_2_0= ruleExpression ) ) ) | ( (this_COLON_3= RULE_COLON ( (lv_typename_4_0= ruleTypeName ) ) ) (this_ASSIGN_5= RULE_ASSIGN ( (lv_value_6_0= ruleExpression ) ) )? ) ) ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2400:1: ( ( (lv_bindVariable_0_0= ruleBindVariable ) ) ( (this_ASSIGN_1= RULE_ASSIGN ( (lv_value_2_0= ruleExpression ) ) ) | ( (this_COLON_3= RULE_COLON ( (lv_typename_4_0= ruleTypeName ) ) ) (this_ASSIGN_5= RULE_ASSIGN ( (lv_value_6_0= ruleExpression ) ) )? ) ) )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2400:1: ( ( (lv_bindVariable_0_0= ruleBindVariable ) ) ( (this_ASSIGN_1= RULE_ASSIGN ( (lv_value_2_0= ruleExpression ) ) ) | ( (this_COLON_3= RULE_COLON ( (lv_typename_4_0= ruleTypeName ) ) ) (this_ASSIGN_5= RULE_ASSIGN ( (lv_value_6_0= ruleExpression ) ) )? ) ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2400:2: ( (lv_bindVariable_0_0= ruleBindVariable ) ) ( (this_ASSIGN_1= RULE_ASSIGN ( (lv_value_2_0= ruleExpression ) ) ) | ( (this_COLON_3= RULE_COLON ( (lv_typename_4_0= ruleTypeName ) ) ) (this_ASSIGN_5= RULE_ASSIGN ( (lv_value_6_0= ruleExpression ) ) )? ) )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2400:2: ( (lv_bindVariable_0_0= ruleBindVariable ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2401:1: (lv_bindVariable_0_0= ruleBindVariable )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2401:1: (lv_bindVariable_0_0= ruleBindVariable )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2402:3: lv_bindVariable_0_0= ruleBindVariable
            {
             
            	        newCompositeNode(grammarAccess.getBindingAccess().getBindVariableBindVariableParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleBindVariable_in_ruleBinding5477);
            lv_bindVariable_0_0=ruleBindVariable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBindingRule());
            	        }
                   		set(
                   			current, 
                   			"bindVariable",
                    		lv_bindVariable_0_0, 
                    		"BindVariable");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2418:2: ( (this_ASSIGN_1= RULE_ASSIGN ( (lv_value_2_0= ruleExpression ) ) ) | ( (this_COLON_3= RULE_COLON ( (lv_typename_4_0= ruleTypeName ) ) ) (this_ASSIGN_5= RULE_ASSIGN ( (lv_value_6_0= ruleExpression ) ) )? ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_ASSIGN) ) {
                alt48=1;
            }
            else if ( (LA48_0==RULE_COLON) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2418:3: (this_ASSIGN_1= RULE_ASSIGN ( (lv_value_2_0= ruleExpression ) ) )
                    {
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2418:3: (this_ASSIGN_1= RULE_ASSIGN ( (lv_value_2_0= ruleExpression ) ) )
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2418:4: this_ASSIGN_1= RULE_ASSIGN ( (lv_value_2_0= ruleExpression ) )
                    {
                    this_ASSIGN_1=(Token)match(input,RULE_ASSIGN,FOLLOW_RULE_ASSIGN_in_ruleBinding5490); 
                     
                        newLeafNode(this_ASSIGN_1, grammarAccess.getBindingAccess().getASSIGNTerminalRuleCall_1_0_0()); 
                        
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2422:1: ( (lv_value_2_0= ruleExpression ) )
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2423:1: (lv_value_2_0= ruleExpression )
                    {
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2423:1: (lv_value_2_0= ruleExpression )
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2424:3: lv_value_2_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getBindingAccess().getValueExpressionParserRuleCall_1_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleBinding5510);
                    lv_value_2_0=ruleExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBindingRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_2_0, 
                            		"Expression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2441:6: ( (this_COLON_3= RULE_COLON ( (lv_typename_4_0= ruleTypeName ) ) ) (this_ASSIGN_5= RULE_ASSIGN ( (lv_value_6_0= ruleExpression ) ) )? )
                    {
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2441:6: ( (this_COLON_3= RULE_COLON ( (lv_typename_4_0= ruleTypeName ) ) ) (this_ASSIGN_5= RULE_ASSIGN ( (lv_value_6_0= ruleExpression ) ) )? )
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2441:7: (this_COLON_3= RULE_COLON ( (lv_typename_4_0= ruleTypeName ) ) ) (this_ASSIGN_5= RULE_ASSIGN ( (lv_value_6_0= ruleExpression ) ) )?
                    {
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2441:7: (this_COLON_3= RULE_COLON ( (lv_typename_4_0= ruleTypeName ) ) )
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2441:8: this_COLON_3= RULE_COLON ( (lv_typename_4_0= ruleTypeName ) )
                    {
                    this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleBinding5530); 
                     
                        newLeafNode(this_COLON_3, grammarAccess.getBindingAccess().getCOLONTerminalRuleCall_1_1_0_0()); 
                        
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2445:1: ( (lv_typename_4_0= ruleTypeName ) )
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2446:1: (lv_typename_4_0= ruleTypeName )
                    {
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2446:1: (lv_typename_4_0= ruleTypeName )
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2447:3: lv_typename_4_0= ruleTypeName
                    {
                     
                    	        newCompositeNode(grammarAccess.getBindingAccess().getTypenameTypeNameParserRuleCall_1_1_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeName_in_ruleBinding5550);
                    lv_typename_4_0=ruleTypeName();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBindingRule());
                    	        }
                           		set(
                           			current, 
                           			"typename",
                            		lv_typename_4_0, 
                            		"TypeName");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }

                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2463:3: (this_ASSIGN_5= RULE_ASSIGN ( (lv_value_6_0= ruleExpression ) ) )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==RULE_ASSIGN) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2463:4: this_ASSIGN_5= RULE_ASSIGN ( (lv_value_6_0= ruleExpression ) )
                            {
                            this_ASSIGN_5=(Token)match(input,RULE_ASSIGN,FOLLOW_RULE_ASSIGN_in_ruleBinding5563); 
                             
                                newLeafNode(this_ASSIGN_5, grammarAccess.getBindingAccess().getASSIGNTerminalRuleCall_1_1_1_0()); 
                                
                            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2467:1: ( (lv_value_6_0= ruleExpression ) )
                            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2468:1: (lv_value_6_0= ruleExpression )
                            {
                            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2468:1: (lv_value_6_0= ruleExpression )
                            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2469:3: lv_value_6_0= ruleExpression
                            {
                             
                            	        newCompositeNode(grammarAccess.getBindingAccess().getValueExpressionParserRuleCall_1_1_1_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleExpression_in_ruleBinding5583);
                            lv_value_6_0=ruleExpression();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getBindingRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"value",
                                    		lv_value_6_0, 
                                    		"Expression");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }


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
    // $ANTLR end "ruleBinding"


    // $ANTLR start "entryRuleBindVariable"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2493:1: entryRuleBindVariable returns [String current=null] : iv_ruleBindVariable= ruleBindVariable EOF ;
    public final String entryRuleBindVariable() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBindVariable = null;


        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2494:2: (iv_ruleBindVariable= ruleBindVariable EOF )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2495:2: iv_ruleBindVariable= ruleBindVariable EOF
            {
             newCompositeNode(grammarAccess.getBindVariableRule()); 
            pushFollow(FOLLOW_ruleBindVariable_in_entryRuleBindVariable5624);
            iv_ruleBindVariable=ruleBindVariable();

            state._fsp--;

             current =iv_ruleBindVariable.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBindVariable5635); 

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
    // $ANTLR end "entryRuleBindVariable"


    // $ANTLR start "ruleBindVariable"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2502:1: ruleBindVariable returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleBindVariable() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2505:28: (this_ID_0= RULE_ID )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2506:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBindVariable5674); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getBindVariableAccess().getIDTerminalRuleCall()); 
                

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
    // $ANTLR end "ruleBindVariable"


    // $ANTLR start "entryRuleTypeName"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2521:1: entryRuleTypeName returns [String current=null] : iv_ruleTypeName= ruleTypeName EOF ;
    public final String entryRuleTypeName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeName = null;


        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2522:2: (iv_ruleTypeName= ruleTypeName EOF )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2523:2: iv_ruleTypeName= ruleTypeName EOF
            {
             newCompositeNode(grammarAccess.getTypeNameRule()); 
            pushFollow(FOLLOW_ruleTypeName_in_entryRuleTypeName5719);
            iv_ruleTypeName=ruleTypeName();

            state._fsp--;

             current =iv_ruleTypeName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeName5730); 

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
    // $ANTLR end "entryRuleTypeName"


    // $ANTLR start "ruleTypeName"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2530:1: ruleTypeName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_QualifiedName_0= ruleQualifiedName ;
    public final AntlrDatatypeRuleToken ruleTypeName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2533:28: (this_QualifiedName_0= ruleQualifiedName )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2535:5: this_QualifiedName_0= ruleQualifiedName
            {
             
                    newCompositeNode(grammarAccess.getTypeNameAccess().getQualifiedNameParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleTypeName5776);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            		current.merge(this_QualifiedName_0);
                
             
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleTypeName"


    // $ANTLR start "entryRuleCondition"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2553:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2554:2: (iv_ruleCondition= ruleCondition EOF )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2555:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_ruleCondition_in_entryRuleCondition5820);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondition5830); 

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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2562:1: ruleCondition returns [EObject current=null] : (this_IF_0= RULE_IF this_Expression_1= ruleExpression ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token this_IF_0=null;
        EObject this_Expression_1 = null;


         enterRule(); 
            
        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2565:28: ( (this_IF_0= RULE_IF this_Expression_1= ruleExpression ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2566:1: (this_IF_0= RULE_IF this_Expression_1= ruleExpression )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2566:1: (this_IF_0= RULE_IF this_Expression_1= ruleExpression )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2566:2: this_IF_0= RULE_IF this_Expression_1= ruleExpression
            {
            this_IF_0=(Token)match(input,RULE_IF,FOLLOW_RULE_IF_in_ruleCondition5866); 
             
                newLeafNode(this_IF_0, grammarAccess.getConditionAccess().getIFTerminalRuleCall_0()); 
                
             
                    newCompositeNode(grammarAccess.getConditionAccess().getExpressionParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleExpression_in_ruleCondition5887);
            this_Expression_1=ruleExpression();

            state._fsp--;

             
                    current = this_Expression_1; 
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleActions"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2587:1: entryRuleActions returns [EObject current=null] : iv_ruleActions= ruleActions EOF ;
    public final EObject entryRuleActions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActions = null;


        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2588:2: (iv_ruleActions= ruleActions EOF )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2589:2: iv_ruleActions= ruleActions EOF
            {
             newCompositeNode(grammarAccess.getActionsRule()); 
            pushFollow(FOLLOW_ruleActions_in_entryRuleActions5922);
            iv_ruleActions=ruleActions();

            state._fsp--;

             current =iv_ruleActions; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActions5932); 

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
    // $ANTLR end "entryRuleActions"


    // $ANTLR start "ruleActions"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2596:1: ruleActions returns [EObject current=null] : ( () this_DO_1= RULE_DO ( ( (lv_actionList_2_0= ruleActionList ) ) | this_NOTHING_3= RULE_NOTHING ) ) ;
    public final EObject ruleActions() throws RecognitionException {
        EObject current = null;

        Token this_DO_1=null;
        Token this_NOTHING_3=null;
        EObject lv_actionList_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2599:28: ( ( () this_DO_1= RULE_DO ( ( (lv_actionList_2_0= ruleActionList ) ) | this_NOTHING_3= RULE_NOTHING ) ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2600:1: ( () this_DO_1= RULE_DO ( ( (lv_actionList_2_0= ruleActionList ) ) | this_NOTHING_3= RULE_NOTHING ) )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2600:1: ( () this_DO_1= RULE_DO ( ( (lv_actionList_2_0= ruleActionList ) ) | this_NOTHING_3= RULE_NOTHING ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2600:2: () this_DO_1= RULE_DO ( ( (lv_actionList_2_0= ruleActionList ) ) | this_NOTHING_3= RULE_NOTHING )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2600:2: ()
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2601:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getActionsAccess().getActionsAction_0(),
                        current);
                

            }

            this_DO_1=(Token)match(input,RULE_DO,FOLLOW_RULE_DO_in_ruleActions5977); 
             
                newLeafNode(this_DO_1, grammarAccess.getActionsAccess().getDOTerminalRuleCall_1()); 
                
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2610:1: ( ( (lv_actionList_2_0= ruleActionList ) ) | this_NOTHING_3= RULE_NOTHING )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_ID||(LA49_0>=RULE_KEYWORD_RETURN && LA49_0<=RULE_LPAREN)||LA49_0==RULE_KEYWORD_THROW||LA49_0==RULE_BNOT||LA49_0==RULE_NOT||(LA49_0>=RULE_NEW && LA49_0<=RULE_FLOATVAL)||(LA49_0>=73 && LA49_0<=77)) ) {
                alt49=1;
            }
            else if ( (LA49_0==RULE_NOTHING) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2610:2: ( (lv_actionList_2_0= ruleActionList ) )
                    {
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2610:2: ( (lv_actionList_2_0= ruleActionList ) )
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2611:1: (lv_actionList_2_0= ruleActionList )
                    {
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2611:1: (lv_actionList_2_0= ruleActionList )
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2612:3: lv_actionList_2_0= ruleActionList
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionsAccess().getActionListActionListParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleActionList_in_ruleActions5998);
                    lv_actionList_2_0=ruleActionList();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActionsRule());
                    	        }
                           		set(
                           			current, 
                           			"actionList",
                            		lv_actionList_2_0, 
                            		"ActionList");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2629:6: this_NOTHING_3= RULE_NOTHING
                    {
                    this_NOTHING_3=(Token)match(input,RULE_NOTHING,FOLLOW_RULE_NOTHING_in_ruleActions6015); 
                     
                        newLeafNode(this_NOTHING_3, grammarAccess.getActionsAccess().getNOTHINGTerminalRuleCall_2_1()); 
                        

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
    // $ANTLR end "ruleActions"


    // $ANTLR start "entryRuleActionList"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2641:1: entryRuleActionList returns [EObject current=null] : iv_ruleActionList= ruleActionList EOF ;
    public final EObject entryRuleActionList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionList = null;


        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2642:2: (iv_ruleActionList= ruleActionList EOF )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2643:2: iv_ruleActionList= ruleActionList EOF
            {
             newCompositeNode(grammarAccess.getActionListRule()); 
            pushFollow(FOLLOW_ruleActionList_in_entryRuleActionList6051);
            iv_ruleActionList=ruleActionList();

            state._fsp--;

             current =iv_ruleActionList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionList6061); 

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
    // $ANTLR end "entryRuleActionList"


    // $ANTLR start "ruleActionList"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2650:1: ruleActionList returns [EObject current=null] : ( ( (lv_actions_0_0= ruleAction ) ) (this_SEMICOLON_1= RULE_SEMICOLON ( (lv_actions_2_0= ruleAction ) ) )* (this_SEMICOLON_3= RULE_SEMICOLON )? ) ;
    public final EObject ruleActionList() throws RecognitionException {
        EObject current = null;

        Token this_SEMICOLON_1=null;
        Token this_SEMICOLON_3=null;
        EObject lv_actions_0_0 = null;

        EObject lv_actions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2653:28: ( ( ( (lv_actions_0_0= ruleAction ) ) (this_SEMICOLON_1= RULE_SEMICOLON ( (lv_actions_2_0= ruleAction ) ) )* (this_SEMICOLON_3= RULE_SEMICOLON )? ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2654:1: ( ( (lv_actions_0_0= ruleAction ) ) (this_SEMICOLON_1= RULE_SEMICOLON ( (lv_actions_2_0= ruleAction ) ) )* (this_SEMICOLON_3= RULE_SEMICOLON )? )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2654:1: ( ( (lv_actions_0_0= ruleAction ) ) (this_SEMICOLON_1= RULE_SEMICOLON ( (lv_actions_2_0= ruleAction ) ) )* (this_SEMICOLON_3= RULE_SEMICOLON )? )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2654:2: ( (lv_actions_0_0= ruleAction ) ) (this_SEMICOLON_1= RULE_SEMICOLON ( (lv_actions_2_0= ruleAction ) ) )* (this_SEMICOLON_3= RULE_SEMICOLON )?
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2654:2: ( (lv_actions_0_0= ruleAction ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2655:1: (lv_actions_0_0= ruleAction )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2655:1: (lv_actions_0_0= ruleAction )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2656:3: lv_actions_0_0= ruleAction
            {
             
            	        newCompositeNode(grammarAccess.getActionListAccess().getActionsActionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAction_in_ruleActionList6107);
            lv_actions_0_0=ruleAction();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getActionListRule());
            	        }
                   		add(
                   			current, 
                   			"actions",
                    		lv_actions_0_0, 
                    		"Action");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2672:2: (this_SEMICOLON_1= RULE_SEMICOLON ( (lv_actions_2_0= ruleAction ) ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==RULE_SEMICOLON) ) {
                    int LA50_1 = input.LA(2);

                    if ( (LA50_1==RULE_ID||(LA50_1>=RULE_KEYWORD_RETURN && LA50_1<=RULE_LPAREN)||LA50_1==RULE_KEYWORD_THROW||LA50_1==RULE_BNOT||LA50_1==RULE_NOT||(LA50_1>=RULE_NEW && LA50_1<=RULE_FLOATVAL)||(LA50_1>=73 && LA50_1<=77)) ) {
                        alt50=1;
                    }


                }


                switch (alt50) {
            	case 1 :
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2672:3: this_SEMICOLON_1= RULE_SEMICOLON ( (lv_actions_2_0= ruleAction ) )
            	    {
            	    this_SEMICOLON_1=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleActionList6119); 
            	     
            	        newLeafNode(this_SEMICOLON_1, grammarAccess.getActionListAccess().getSEMICOLONTerminalRuleCall_1_0()); 
            	        
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2676:1: ( (lv_actions_2_0= ruleAction ) )
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2677:1: (lv_actions_2_0= ruleAction )
            	    {
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2677:1: (lv_actions_2_0= ruleAction )
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2678:3: lv_actions_2_0= ruleAction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getActionListAccess().getActionsActionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAction_in_ruleActionList6139);
            	    lv_actions_2_0=ruleAction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getActionListRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"actions",
            	            		lv_actions_2_0, 
            	            		"Action");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2694:4: (this_SEMICOLON_3= RULE_SEMICOLON )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_SEMICOLON) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2694:5: this_SEMICOLON_3= RULE_SEMICOLON
                    {
                    this_SEMICOLON_3=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleActionList6153); 
                     
                        newLeafNode(this_SEMICOLON_3, grammarAccess.getActionListAccess().getSEMICOLONTerminalRuleCall_2()); 
                        

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
    // $ANTLR end "ruleActionList"


    // $ANTLR start "entryRuleAction"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2706:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2707:2: (iv_ruleAction= ruleAction EOF )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2708:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction6190);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction6200); 

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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2715:1: ruleAction returns [EObject current=null] : (this_Expression_0= ruleExpression | this_ReturnExpr_1= ruleReturnExpr | this_ThrowExpr_2= ruleThrowExpr ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_Expression_0 = null;

        EObject this_ReturnExpr_1 = null;

        EObject this_ThrowExpr_2 = null;


         enterRule(); 
            
        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2718:28: ( (this_Expression_0= ruleExpression | this_ReturnExpr_1= ruleReturnExpr | this_ThrowExpr_2= ruleThrowExpr ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2719:1: (this_Expression_0= ruleExpression | this_ReturnExpr_1= ruleReturnExpr | this_ThrowExpr_2= ruleThrowExpr )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2719:1: (this_Expression_0= ruleExpression | this_ReturnExpr_1= ruleReturnExpr | this_ThrowExpr_2= ruleThrowExpr )
            int alt52=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_INTVAL:
            case RULE_DOLLAR:
            case RULE_LPAREN:
            case RULE_BNOT:
            case RULE_NOT:
            case RULE_NEW:
            case RULE_STRING:
            case RULE_BOOLEAN:
            case RULE_FLOATVAL:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
                {
                alt52=1;
                }
                break;
            case RULE_KEYWORD_RETURN:
                {
                alt52=2;
                }
                break;
            case RULE_KEYWORD_THROW:
                {
                alt52=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2720:5: this_Expression_0= ruleExpression
                    {
                     
                            newCompositeNode(grammarAccess.getActionAccess().getExpressionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleExpression_in_ruleAction6247);
                    this_Expression_0=ruleExpression();

                    state._fsp--;

                     
                            current = this_Expression_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2730:5: this_ReturnExpr_1= ruleReturnExpr
                    {
                     
                            newCompositeNode(grammarAccess.getActionAccess().getReturnExprParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleReturnExpr_in_ruleAction6274);
                    this_ReturnExpr_1=ruleReturnExpr();

                    state._fsp--;

                     
                            current = this_ReturnExpr_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2740:5: this_ThrowExpr_2= ruleThrowExpr
                    {
                     
                            newCompositeNode(grammarAccess.getActionAccess().getThrowExprParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleThrowExpr_in_ruleAction6301);
                    this_ThrowExpr_2=ruleThrowExpr();

                    state._fsp--;

                     
                            current = this_ThrowExpr_2; 
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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleExpression"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2756:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2757:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2758:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression6336);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression6346); 

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2765:1: ruleExpression returns [EObject current=null] : this_AssignmentExpr_0= ruleAssignmentExpr ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AssignmentExpr_0 = null;


         enterRule(); 
            
        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2768:28: (this_AssignmentExpr_0= ruleAssignmentExpr )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2770:5: this_AssignmentExpr_0= ruleAssignmentExpr
            {
             
                    newCompositeNode(grammarAccess.getExpressionAccess().getAssignmentExprParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleAssignmentExpr_in_ruleExpression6392);
            this_AssignmentExpr_0=ruleAssignmentExpr();

            state._fsp--;

             
                    current = this_AssignmentExpr_0; 
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleReturnExpr"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2786:1: entryRuleReturnExpr returns [EObject current=null] : iv_ruleReturnExpr= ruleReturnExpr EOF ;
    public final EObject entryRuleReturnExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnExpr = null;


        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2787:2: (iv_ruleReturnExpr= ruleReturnExpr EOF )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2788:2: iv_ruleReturnExpr= ruleReturnExpr EOF
            {
             newCompositeNode(grammarAccess.getReturnExprRule()); 
            pushFollow(FOLLOW_ruleReturnExpr_in_entryRuleReturnExpr6426);
            iv_ruleReturnExpr=ruleReturnExpr();

            state._fsp--;

             current =iv_ruleReturnExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReturnExpr6436); 

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
    // $ANTLR end "entryRuleReturnExpr"


    // $ANTLR start "ruleReturnExpr"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2795:1: ruleReturnExpr returns [EObject current=null] : ( ( (lv_op_0_0= RULE_KEYWORD_RETURN ) ) ( (lv_operand1_1_0= ruleExpression ) )? ) ;
    public final EObject ruleReturnExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_0=null;
        EObject lv_operand1_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2798:28: ( ( ( (lv_op_0_0= RULE_KEYWORD_RETURN ) ) ( (lv_operand1_1_0= ruleExpression ) )? ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2799:1: ( ( (lv_op_0_0= RULE_KEYWORD_RETURN ) ) ( (lv_operand1_1_0= ruleExpression ) )? )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2799:1: ( ( (lv_op_0_0= RULE_KEYWORD_RETURN ) ) ( (lv_operand1_1_0= ruleExpression ) )? )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2799:2: ( (lv_op_0_0= RULE_KEYWORD_RETURN ) ) ( (lv_operand1_1_0= ruleExpression ) )?
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2799:2: ( (lv_op_0_0= RULE_KEYWORD_RETURN ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2800:1: (lv_op_0_0= RULE_KEYWORD_RETURN )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2800:1: (lv_op_0_0= RULE_KEYWORD_RETURN )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2801:3: lv_op_0_0= RULE_KEYWORD_RETURN
            {
            lv_op_0_0=(Token)match(input,RULE_KEYWORD_RETURN,FOLLOW_RULE_KEYWORD_RETURN_in_ruleReturnExpr6478); 

            			newLeafNode(lv_op_0_0, grammarAccess.getReturnExprAccess().getOpKEYWORD_RETURNTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getReturnExprRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"op",
                    		lv_op_0_0, 
                    		"KEYWORD_RETURN");
            	    

            }


            }

            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2817:2: ( (lv_operand1_1_0= ruleExpression ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_ID||(LA53_0>=RULE_INTVAL && LA53_0<=RULE_LPAREN)||LA53_0==RULE_BNOT||LA53_0==RULE_NOT||(LA53_0>=RULE_NEW && LA53_0<=RULE_FLOATVAL)||(LA53_0>=73 && LA53_0<=77)) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2818:1: (lv_operand1_1_0= ruleExpression )
                    {
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2818:1: (lv_operand1_1_0= ruleExpression )
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2819:3: lv_operand1_1_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getReturnExprAccess().getOperand1ExpressionParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleReturnExpr6504);
                    lv_operand1_1_0=ruleExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getReturnExprRule());
                    	        }
                           		set(
                           			current, 
                           			"operand1",
                            		lv_operand1_1_0, 
                            		"Expression");
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
    // $ANTLR end "ruleReturnExpr"


    // $ANTLR start "entryRuleThrowExpr"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2843:1: entryRuleThrowExpr returns [EObject current=null] : iv_ruleThrowExpr= ruleThrowExpr EOF ;
    public final EObject entryRuleThrowExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThrowExpr = null;


        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2844:2: (iv_ruleThrowExpr= ruleThrowExpr EOF )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2845:2: iv_ruleThrowExpr= ruleThrowExpr EOF
            {
             newCompositeNode(grammarAccess.getThrowExprRule()); 
            pushFollow(FOLLOW_ruleThrowExpr_in_entryRuleThrowExpr6541);
            iv_ruleThrowExpr=ruleThrowExpr();

            state._fsp--;

             current =iv_ruleThrowExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleThrowExpr6551); 

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
    // $ANTLR end "entryRuleThrowExpr"


    // $ANTLR start "ruleThrowExpr"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2852:1: ruleThrowExpr returns [EObject current=null] : ( ( (lv_op_0_0= RULE_KEYWORD_THROW ) ) ( (lv_operand1_1_0= ruleExpression ) ) ) ;
    public final EObject ruleThrowExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_0=null;
        EObject lv_operand1_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2855:28: ( ( ( (lv_op_0_0= RULE_KEYWORD_THROW ) ) ( (lv_operand1_1_0= ruleExpression ) ) ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2856:1: ( ( (lv_op_0_0= RULE_KEYWORD_THROW ) ) ( (lv_operand1_1_0= ruleExpression ) ) )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2856:1: ( ( (lv_op_0_0= RULE_KEYWORD_THROW ) ) ( (lv_operand1_1_0= ruleExpression ) ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2856:2: ( (lv_op_0_0= RULE_KEYWORD_THROW ) ) ( (lv_operand1_1_0= ruleExpression ) )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2856:2: ( (lv_op_0_0= RULE_KEYWORD_THROW ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2857:1: (lv_op_0_0= RULE_KEYWORD_THROW )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2857:1: (lv_op_0_0= RULE_KEYWORD_THROW )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2858:3: lv_op_0_0= RULE_KEYWORD_THROW
            {
            lv_op_0_0=(Token)match(input,RULE_KEYWORD_THROW,FOLLOW_RULE_KEYWORD_THROW_in_ruleThrowExpr6593); 

            			newLeafNode(lv_op_0_0, grammarAccess.getThrowExprAccess().getOpKEYWORD_THROWTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getThrowExprRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"op",
                    		lv_op_0_0, 
                    		"KEYWORD_THROW");
            	    

            }


            }

            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2874:2: ( (lv_operand1_1_0= ruleExpression ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2875:1: (lv_operand1_1_0= ruleExpression )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2875:1: (lv_operand1_1_0= ruleExpression )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2876:3: lv_operand1_1_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getThrowExprAccess().getOperand1ExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleThrowExpr6619);
            lv_operand1_1_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getThrowExprRule());
            	        }
                   		set(
                   			current, 
                   			"operand1",
                    		lv_operand1_1_0, 
                    		"Expression");
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
    // $ANTLR end "ruleThrowExpr"


    // $ANTLR start "entryRuleAssignmentExpr"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2900:1: entryRuleAssignmentExpr returns [EObject current=null] : iv_ruleAssignmentExpr= ruleAssignmentExpr EOF ;
    public final EObject entryRuleAssignmentExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignmentExpr = null;


        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2901:2: (iv_ruleAssignmentExpr= ruleAssignmentExpr EOF )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2902:2: iv_ruleAssignmentExpr= ruleAssignmentExpr EOF
            {
             newCompositeNode(grammarAccess.getAssignmentExprRule()); 
            pushFollow(FOLLOW_ruleAssignmentExpr_in_entryRuleAssignmentExpr6655);
            iv_ruleAssignmentExpr=ruleAssignmentExpr();

            state._fsp--;

             current =iv_ruleAssignmentExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignmentExpr6665); 

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
    // $ANTLR end "entryRuleAssignmentExpr"


    // $ANTLR start "ruleAssignmentExpr"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2909:1: ruleAssignmentExpr returns [EObject current=null] : (this_OperatorExpr_0= ruleOperatorExpr ( () ( (lv_op_2_0= RULE_ASSIGN ) ) ( (lv_operand2_3_0= ruleAssignmentExpr ) ) )? ) ;
    public final EObject ruleAssignmentExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_OperatorExpr_0 = null;

        EObject lv_operand2_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2912:28: ( (this_OperatorExpr_0= ruleOperatorExpr ( () ( (lv_op_2_0= RULE_ASSIGN ) ) ( (lv_operand2_3_0= ruleAssignmentExpr ) ) )? ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2913:1: (this_OperatorExpr_0= ruleOperatorExpr ( () ( (lv_op_2_0= RULE_ASSIGN ) ) ( (lv_operand2_3_0= ruleAssignmentExpr ) ) )? )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2913:1: (this_OperatorExpr_0= ruleOperatorExpr ( () ( (lv_op_2_0= RULE_ASSIGN ) ) ( (lv_operand2_3_0= ruleAssignmentExpr ) ) )? )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2914:5: this_OperatorExpr_0= ruleOperatorExpr ( () ( (lv_op_2_0= RULE_ASSIGN ) ) ( (lv_operand2_3_0= ruleAssignmentExpr ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getAssignmentExprAccess().getOperatorExprParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleOperatorExpr_in_ruleAssignmentExpr6712);
            this_OperatorExpr_0=ruleOperatorExpr();

            state._fsp--;

             
                    current = this_OperatorExpr_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2922:1: ( () ( (lv_op_2_0= RULE_ASSIGN ) ) ( (lv_operand2_3_0= ruleAssignmentExpr ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_ASSIGN) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2922:2: () ( (lv_op_2_0= RULE_ASSIGN ) ) ( (lv_operand2_3_0= ruleAssignmentExpr ) )
                    {
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2922:2: ()
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2923:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getAssignmentExprAccess().getAssignmentExprOperand1Action_1_0(),
                                current);
                        

                    }

                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2928:2: ( (lv_op_2_0= RULE_ASSIGN ) )
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2929:1: (lv_op_2_0= RULE_ASSIGN )
                    {
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2929:1: (lv_op_2_0= RULE_ASSIGN )
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2930:3: lv_op_2_0= RULE_ASSIGN
                    {
                    lv_op_2_0=(Token)match(input,RULE_ASSIGN,FOLLOW_RULE_ASSIGN_in_ruleAssignmentExpr6738); 

                    			newLeafNode(lv_op_2_0, grammarAccess.getAssignmentExprAccess().getOpASSIGNTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAssignmentExprRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"op",
                            		lv_op_2_0, 
                            		"ASSIGN");
                    	    

                    }


                    }

                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2946:2: ( (lv_operand2_3_0= ruleAssignmentExpr ) )
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2947:1: (lv_operand2_3_0= ruleAssignmentExpr )
                    {
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2947:1: (lv_operand2_3_0= ruleAssignmentExpr )
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2948:3: lv_operand2_3_0= ruleAssignmentExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssignmentExprAccess().getOperand2AssignmentExprParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAssignmentExpr_in_ruleAssignmentExpr6764);
                    lv_operand2_3_0=ruleAssignmentExpr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssignmentExprRule());
                    	        }
                           		set(
                           			current, 
                           			"operand2",
                            		lv_operand2_3_0, 
                            		"AssignmentExpr");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


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
    // $ANTLR end "ruleAssignmentExpr"


    // $ANTLR start "entryRuleOperatorExpr"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2972:1: entryRuleOperatorExpr returns [EObject current=null] : iv_ruleOperatorExpr= ruleOperatorExpr EOF ;
    public final EObject entryRuleOperatorExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperatorExpr = null;


        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2973:2: (iv_ruleOperatorExpr= ruleOperatorExpr EOF )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2974:2: iv_ruleOperatorExpr= ruleOperatorExpr EOF
            {
             newCompositeNode(grammarAccess.getOperatorExprRule()); 
            pushFollow(FOLLOW_ruleOperatorExpr_in_entryRuleOperatorExpr6802);
            iv_ruleOperatorExpr=ruleOperatorExpr();

            state._fsp--;

             current =iv_ruleOperatorExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperatorExpr6812); 

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
    // $ANTLR end "entryRuleOperatorExpr"


    // $ANTLR start "ruleOperatorExpr"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2981:1: ruleOperatorExpr returns [EObject current=null] : (this_PlusMinusOperand_0= rulePlusMinusOperand ( () ( ( (lv_op_2_1= RULE_PLUS | lv_op_2_2= RULE_MINUS ) ) ) ( (lv_operand2_3_0= rulePlusMinusOperand ) ) )* ) ;
    public final EObject ruleOperatorExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_PlusMinusOperand_0 = null;

        EObject lv_operand2_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2984:28: ( (this_PlusMinusOperand_0= rulePlusMinusOperand ( () ( ( (lv_op_2_1= RULE_PLUS | lv_op_2_2= RULE_MINUS ) ) ) ( (lv_operand2_3_0= rulePlusMinusOperand ) ) )* ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2985:1: (this_PlusMinusOperand_0= rulePlusMinusOperand ( () ( ( (lv_op_2_1= RULE_PLUS | lv_op_2_2= RULE_MINUS ) ) ) ( (lv_operand2_3_0= rulePlusMinusOperand ) ) )* )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2985:1: (this_PlusMinusOperand_0= rulePlusMinusOperand ( () ( ( (lv_op_2_1= RULE_PLUS | lv_op_2_2= RULE_MINUS ) ) ) ( (lv_operand2_3_0= rulePlusMinusOperand ) ) )* )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2986:5: this_PlusMinusOperand_0= rulePlusMinusOperand ( () ( ( (lv_op_2_1= RULE_PLUS | lv_op_2_2= RULE_MINUS ) ) ) ( (lv_operand2_3_0= rulePlusMinusOperand ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getOperatorExprAccess().getPlusMinusOperandParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePlusMinusOperand_in_ruleOperatorExpr6859);
            this_PlusMinusOperand_0=rulePlusMinusOperand();

            state._fsp--;

             
                    current = this_PlusMinusOperand_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2994:1: ( () ( ( (lv_op_2_1= RULE_PLUS | lv_op_2_2= RULE_MINUS ) ) ) ( (lv_operand2_3_0= rulePlusMinusOperand ) ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( ((LA56_0>=RULE_PLUS && LA56_0<=RULE_MINUS)) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2994:2: () ( ( (lv_op_2_1= RULE_PLUS | lv_op_2_2= RULE_MINUS ) ) ) ( (lv_operand2_3_0= rulePlusMinusOperand ) )
            	    {
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2994:2: ()
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:2995:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getOperatorExprAccess().getOperatorExprOperand1Action_1_0(),
            	                current);
            	        

            	    }

            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3000:2: ( ( (lv_op_2_1= RULE_PLUS | lv_op_2_2= RULE_MINUS ) ) )
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3001:1: ( (lv_op_2_1= RULE_PLUS | lv_op_2_2= RULE_MINUS ) )
            	    {
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3001:1: ( (lv_op_2_1= RULE_PLUS | lv_op_2_2= RULE_MINUS ) )
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3002:1: (lv_op_2_1= RULE_PLUS | lv_op_2_2= RULE_MINUS )
            	    {
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3002:1: (lv_op_2_1= RULE_PLUS | lv_op_2_2= RULE_MINUS )
            	    int alt55=2;
            	    int LA55_0 = input.LA(1);

            	    if ( (LA55_0==RULE_PLUS) ) {
            	        alt55=1;
            	    }
            	    else if ( (LA55_0==RULE_MINUS) ) {
            	        alt55=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 55, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt55) {
            	        case 1 :
            	            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3003:3: lv_op_2_1= RULE_PLUS
            	            {
            	            lv_op_2_1=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_ruleOperatorExpr6887); 

            	            			newLeafNode(lv_op_2_1, grammarAccess.getOperatorExprAccess().getOpPLUSTerminalRuleCall_1_1_0_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getOperatorExprRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"op",
            	                    		lv_op_2_1, 
            	                    		"PLUS");
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3018:8: lv_op_2_2= RULE_MINUS
            	            {
            	            lv_op_2_2=(Token)match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_ruleOperatorExpr6907); 

            	            			newLeafNode(lv_op_2_2, grammarAccess.getOperatorExprAccess().getOpMINUSTerminalRuleCall_1_1_0_1()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getOperatorExprRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"op",
            	                    		lv_op_2_2, 
            	                    		"MINUS");
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3036:2: ( (lv_operand2_3_0= rulePlusMinusOperand ) )
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3037:1: (lv_operand2_3_0= rulePlusMinusOperand )
            	    {
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3037:1: (lv_operand2_3_0= rulePlusMinusOperand )
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3038:3: lv_operand2_3_0= rulePlusMinusOperand
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOperatorExprAccess().getOperand2PlusMinusOperandParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePlusMinusOperand_in_ruleOperatorExpr6936);
            	    lv_operand2_3_0=rulePlusMinusOperand();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOperatorExprRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"operand2",
            	            		lv_operand2_3_0, 
            	            		"PlusMinusOperand");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop56;
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
    // $ANTLR end "ruleOperatorExpr"


    // $ANTLR start "entryRulePlusMinusOperand"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3062:1: entryRulePlusMinusOperand returns [EObject current=null] : iv_rulePlusMinusOperand= rulePlusMinusOperand EOF ;
    public final EObject entryRulePlusMinusOperand() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusMinusOperand = null;


        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3063:2: (iv_rulePlusMinusOperand= rulePlusMinusOperand EOF )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3064:2: iv_rulePlusMinusOperand= rulePlusMinusOperand EOF
            {
             newCompositeNode(grammarAccess.getPlusMinusOperandRule()); 
            pushFollow(FOLLOW_rulePlusMinusOperand_in_entryRulePlusMinusOperand6974);
            iv_rulePlusMinusOperand=rulePlusMinusOperand();

            state._fsp--;

             current =iv_rulePlusMinusOperand; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlusMinusOperand6984); 

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
    // $ANTLR end "entryRulePlusMinusOperand"


    // $ANTLR start "rulePlusMinusOperand"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3071:1: rulePlusMinusOperand returns [EObject current=null] : (this_TimesDivOperand_0= ruleTimesDivOperand ( () ( ( (lv_op_2_1= RULE_TIMES | lv_op_2_2= RULE_DIV | lv_op_2_3= RULE_MOD ) ) ) ( (lv_operand2_3_0= ruleTimesDivOperand ) ) )* ) ;
    public final EObject rulePlusMinusOperand() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        EObject this_TimesDivOperand_0 = null;

        EObject lv_operand2_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3074:28: ( (this_TimesDivOperand_0= ruleTimesDivOperand ( () ( ( (lv_op_2_1= RULE_TIMES | lv_op_2_2= RULE_DIV | lv_op_2_3= RULE_MOD ) ) ) ( (lv_operand2_3_0= ruleTimesDivOperand ) ) )* ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3075:1: (this_TimesDivOperand_0= ruleTimesDivOperand ( () ( ( (lv_op_2_1= RULE_TIMES | lv_op_2_2= RULE_DIV | lv_op_2_3= RULE_MOD ) ) ) ( (lv_operand2_3_0= ruleTimesDivOperand ) ) )* )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3075:1: (this_TimesDivOperand_0= ruleTimesDivOperand ( () ( ( (lv_op_2_1= RULE_TIMES | lv_op_2_2= RULE_DIV | lv_op_2_3= RULE_MOD ) ) ) ( (lv_operand2_3_0= ruleTimesDivOperand ) ) )* )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3076:5: this_TimesDivOperand_0= ruleTimesDivOperand ( () ( ( (lv_op_2_1= RULE_TIMES | lv_op_2_2= RULE_DIV | lv_op_2_3= RULE_MOD ) ) ) ( (lv_operand2_3_0= ruleTimesDivOperand ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getPlusMinusOperandAccess().getTimesDivOperandParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleTimesDivOperand_in_rulePlusMinusOperand7031);
            this_TimesDivOperand_0=ruleTimesDivOperand();

            state._fsp--;

             
                    current = this_TimesDivOperand_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3084:1: ( () ( ( (lv_op_2_1= RULE_TIMES | lv_op_2_2= RULE_DIV | lv_op_2_3= RULE_MOD ) ) ) ( (lv_operand2_3_0= ruleTimesDivOperand ) ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( ((LA58_0>=RULE_TIMES && LA58_0<=RULE_MOD)) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3084:2: () ( ( (lv_op_2_1= RULE_TIMES | lv_op_2_2= RULE_DIV | lv_op_2_3= RULE_MOD ) ) ) ( (lv_operand2_3_0= ruleTimesDivOperand ) )
            	    {
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3084:2: ()
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3085:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getPlusMinusOperandAccess().getPlusMinusOperandOperand1Action_1_0(),
            	                current);
            	        

            	    }

            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3090:2: ( ( (lv_op_2_1= RULE_TIMES | lv_op_2_2= RULE_DIV | lv_op_2_3= RULE_MOD ) ) )
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3091:1: ( (lv_op_2_1= RULE_TIMES | lv_op_2_2= RULE_DIV | lv_op_2_3= RULE_MOD ) )
            	    {
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3091:1: ( (lv_op_2_1= RULE_TIMES | lv_op_2_2= RULE_DIV | lv_op_2_3= RULE_MOD ) )
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3092:1: (lv_op_2_1= RULE_TIMES | lv_op_2_2= RULE_DIV | lv_op_2_3= RULE_MOD )
            	    {
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3092:1: (lv_op_2_1= RULE_TIMES | lv_op_2_2= RULE_DIV | lv_op_2_3= RULE_MOD )
            	    int alt57=3;
            	    switch ( input.LA(1) ) {
            	    case RULE_TIMES:
            	        {
            	        alt57=1;
            	        }
            	        break;
            	    case RULE_DIV:
            	        {
            	        alt57=2;
            	        }
            	        break;
            	    case RULE_MOD:
            	        {
            	        alt57=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 57, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt57) {
            	        case 1 :
            	            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3093:3: lv_op_2_1= RULE_TIMES
            	            {
            	            lv_op_2_1=(Token)match(input,RULE_TIMES,FOLLOW_RULE_TIMES_in_rulePlusMinusOperand7059); 

            	            			newLeafNode(lv_op_2_1, grammarAccess.getPlusMinusOperandAccess().getOpTIMESTerminalRuleCall_1_1_0_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getPlusMinusOperandRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"op",
            	                    		lv_op_2_1, 
            	                    		"TIMES");
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3108:8: lv_op_2_2= RULE_DIV
            	            {
            	            lv_op_2_2=(Token)match(input,RULE_DIV,FOLLOW_RULE_DIV_in_rulePlusMinusOperand7079); 

            	            			newLeafNode(lv_op_2_2, grammarAccess.getPlusMinusOperandAccess().getOpDIVTerminalRuleCall_1_1_0_1()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getPlusMinusOperandRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"op",
            	                    		lv_op_2_2, 
            	                    		"DIV");
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3123:8: lv_op_2_3= RULE_MOD
            	            {
            	            lv_op_2_3=(Token)match(input,RULE_MOD,FOLLOW_RULE_MOD_in_rulePlusMinusOperand7099); 

            	            			newLeafNode(lv_op_2_3, grammarAccess.getPlusMinusOperandAccess().getOpMODTerminalRuleCall_1_1_0_2()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getPlusMinusOperandRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"op",
            	                    		lv_op_2_3, 
            	                    		"MOD");
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3141:2: ( (lv_operand2_3_0= ruleTimesDivOperand ) )
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3142:1: (lv_operand2_3_0= ruleTimesDivOperand )
            	    {
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3142:1: (lv_operand2_3_0= ruleTimesDivOperand )
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3143:3: lv_operand2_3_0= ruleTimesDivOperand
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPlusMinusOperandAccess().getOperand2TimesDivOperandParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTimesDivOperand_in_rulePlusMinusOperand7128);
            	    lv_operand2_3_0=ruleTimesDivOperand();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPlusMinusOperandRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"operand2",
            	            		lv_operand2_3_0, 
            	            		"TimesDivOperand");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop58;
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
    // $ANTLR end "rulePlusMinusOperand"


    // $ANTLR start "entryRuleTimesDivOperand"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3167:1: entryRuleTimesDivOperand returns [EObject current=null] : iv_ruleTimesDivOperand= ruleTimesDivOperand EOF ;
    public final EObject entryRuleTimesDivOperand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimesDivOperand = null;


        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3168:2: (iv_ruleTimesDivOperand= ruleTimesDivOperand EOF )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3169:2: iv_ruleTimesDivOperand= ruleTimesDivOperand EOF
            {
             newCompositeNode(grammarAccess.getTimesDivOperandRule()); 
            pushFollow(FOLLOW_ruleTimesDivOperand_in_entryRuleTimesDivOperand7166);
            iv_ruleTimesDivOperand=ruleTimesDivOperand();

            state._fsp--;

             current =iv_ruleTimesDivOperand; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimesDivOperand7176); 

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
    // $ANTLR end "entryRuleTimesDivOperand"


    // $ANTLR start "ruleTimesDivOperand"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3176:1: ruleTimesDivOperand returns [EObject current=null] : ( (this_BitwiseOperand_0= ruleBitwiseOperand ( () ( ( (lv_op_2_1= RULE_BAND | lv_op_2_2= RULE_BOR | lv_op_2_3= RULE_BXOR ) ) ) ( (lv_operand2_3_0= ruleBitwiseOperand ) ) )* ) | ( ( (lv_op_4_0= RULE_BNOT ) ) ( (lv_operand1_5_0= ruleBitwiseOperand ) ) ) ) ;
    public final EObject ruleTimesDivOperand() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_4_0=null;
        EObject this_BitwiseOperand_0 = null;

        EObject lv_operand2_3_0 = null;

        EObject lv_operand1_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3179:28: ( ( (this_BitwiseOperand_0= ruleBitwiseOperand ( () ( ( (lv_op_2_1= RULE_BAND | lv_op_2_2= RULE_BOR | lv_op_2_3= RULE_BXOR ) ) ) ( (lv_operand2_3_0= ruleBitwiseOperand ) ) )* ) | ( ( (lv_op_4_0= RULE_BNOT ) ) ( (lv_operand1_5_0= ruleBitwiseOperand ) ) ) ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3180:1: ( (this_BitwiseOperand_0= ruleBitwiseOperand ( () ( ( (lv_op_2_1= RULE_BAND | lv_op_2_2= RULE_BOR | lv_op_2_3= RULE_BXOR ) ) ) ( (lv_operand2_3_0= ruleBitwiseOperand ) ) )* ) | ( ( (lv_op_4_0= RULE_BNOT ) ) ( (lv_operand1_5_0= ruleBitwiseOperand ) ) ) )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3180:1: ( (this_BitwiseOperand_0= ruleBitwiseOperand ( () ( ( (lv_op_2_1= RULE_BAND | lv_op_2_2= RULE_BOR | lv_op_2_3= RULE_BXOR ) ) ) ( (lv_operand2_3_0= ruleBitwiseOperand ) ) )* ) | ( ( (lv_op_4_0= RULE_BNOT ) ) ( (lv_operand1_5_0= ruleBitwiseOperand ) ) ) )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_ID||(LA61_0>=RULE_INTVAL && LA61_0<=RULE_LPAREN)||LA61_0==RULE_NOT||(LA61_0>=RULE_NEW && LA61_0<=RULE_FLOATVAL)||(LA61_0>=73 && LA61_0<=77)) ) {
                alt61=1;
            }
            else if ( (LA61_0==RULE_BNOT) ) {
                alt61=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3180:2: (this_BitwiseOperand_0= ruleBitwiseOperand ( () ( ( (lv_op_2_1= RULE_BAND | lv_op_2_2= RULE_BOR | lv_op_2_3= RULE_BXOR ) ) ) ( (lv_operand2_3_0= ruleBitwiseOperand ) ) )* )
                    {
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3180:2: (this_BitwiseOperand_0= ruleBitwiseOperand ( () ( ( (lv_op_2_1= RULE_BAND | lv_op_2_2= RULE_BOR | lv_op_2_3= RULE_BXOR ) ) ) ( (lv_operand2_3_0= ruleBitwiseOperand ) ) )* )
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3181:5: this_BitwiseOperand_0= ruleBitwiseOperand ( () ( ( (lv_op_2_1= RULE_BAND | lv_op_2_2= RULE_BOR | lv_op_2_3= RULE_BXOR ) ) ) ( (lv_operand2_3_0= ruleBitwiseOperand ) ) )*
                    {
                     
                            newCompositeNode(grammarAccess.getTimesDivOperandAccess().getBitwiseOperandParserRuleCall_0_0()); 
                        
                    pushFollow(FOLLOW_ruleBitwiseOperand_in_ruleTimesDivOperand7224);
                    this_BitwiseOperand_0=ruleBitwiseOperand();

                    state._fsp--;

                     
                            current = this_BitwiseOperand_0; 
                            afterParserOrEnumRuleCall();
                        
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3189:1: ( () ( ( (lv_op_2_1= RULE_BAND | lv_op_2_2= RULE_BOR | lv_op_2_3= RULE_BXOR ) ) ) ( (lv_operand2_3_0= ruleBitwiseOperand ) ) )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( ((LA60_0>=RULE_BAND && LA60_0<=RULE_BXOR)) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3189:2: () ( ( (lv_op_2_1= RULE_BAND | lv_op_2_2= RULE_BOR | lv_op_2_3= RULE_BXOR ) ) ) ( (lv_operand2_3_0= ruleBitwiseOperand ) )
                    	    {
                    	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3189:2: ()
                    	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3190:5: 
                    	    {

                    	            current = forceCreateModelElementAndSet(
                    	                grammarAccess.getTimesDivOperandAccess().getTimesDivOperandOperand1Action_0_1_0(),
                    	                current);
                    	        

                    	    }

                    	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3195:2: ( ( (lv_op_2_1= RULE_BAND | lv_op_2_2= RULE_BOR | lv_op_2_3= RULE_BXOR ) ) )
                    	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3196:1: ( (lv_op_2_1= RULE_BAND | lv_op_2_2= RULE_BOR | lv_op_2_3= RULE_BXOR ) )
                    	    {
                    	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3196:1: ( (lv_op_2_1= RULE_BAND | lv_op_2_2= RULE_BOR | lv_op_2_3= RULE_BXOR ) )
                    	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3197:1: (lv_op_2_1= RULE_BAND | lv_op_2_2= RULE_BOR | lv_op_2_3= RULE_BXOR )
                    	    {
                    	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3197:1: (lv_op_2_1= RULE_BAND | lv_op_2_2= RULE_BOR | lv_op_2_3= RULE_BXOR )
                    	    int alt59=3;
                    	    switch ( input.LA(1) ) {
                    	    case RULE_BAND:
                    	        {
                    	        alt59=1;
                    	        }
                    	        break;
                    	    case RULE_BOR:
                    	        {
                    	        alt59=2;
                    	        }
                    	        break;
                    	    case RULE_BXOR:
                    	        {
                    	        alt59=3;
                    	        }
                    	        break;
                    	    default:
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 59, 0, input);

                    	        throw nvae;
                    	    }

                    	    switch (alt59) {
                    	        case 1 :
                    	            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3198:3: lv_op_2_1= RULE_BAND
                    	            {
                    	            lv_op_2_1=(Token)match(input,RULE_BAND,FOLLOW_RULE_BAND_in_ruleTimesDivOperand7252); 

                    	            			newLeafNode(lv_op_2_1, grammarAccess.getTimesDivOperandAccess().getOpBANDTerminalRuleCall_0_1_1_0_0()); 
                    	            		

                    	            	        if (current==null) {
                    	            	            current = createModelElement(grammarAccess.getTimesDivOperandRule());
                    	            	        }
                    	                   		setWithLastConsumed(
                    	                   			current, 
                    	                   			"op",
                    	                    		lv_op_2_1, 
                    	                    		"BAND");
                    	            	    

                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3213:8: lv_op_2_2= RULE_BOR
                    	            {
                    	            lv_op_2_2=(Token)match(input,RULE_BOR,FOLLOW_RULE_BOR_in_ruleTimesDivOperand7272); 

                    	            			newLeafNode(lv_op_2_2, grammarAccess.getTimesDivOperandAccess().getOpBORTerminalRuleCall_0_1_1_0_1()); 
                    	            		

                    	            	        if (current==null) {
                    	            	            current = createModelElement(grammarAccess.getTimesDivOperandRule());
                    	            	        }
                    	                   		setWithLastConsumed(
                    	                   			current, 
                    	                   			"op",
                    	                    		lv_op_2_2, 
                    	                    		"BOR");
                    	            	    

                    	            }
                    	            break;
                    	        case 3 :
                    	            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3228:8: lv_op_2_3= RULE_BXOR
                    	            {
                    	            lv_op_2_3=(Token)match(input,RULE_BXOR,FOLLOW_RULE_BXOR_in_ruleTimesDivOperand7292); 

                    	            			newLeafNode(lv_op_2_3, grammarAccess.getTimesDivOperandAccess().getOpBXORTerminalRuleCall_0_1_1_0_2()); 
                    	            		

                    	            	        if (current==null) {
                    	            	            current = createModelElement(grammarAccess.getTimesDivOperandRule());
                    	            	        }
                    	                   		setWithLastConsumed(
                    	                   			current, 
                    	                   			"op",
                    	                    		lv_op_2_3, 
                    	                    		"BXOR");
                    	            	    

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }

                    	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3246:2: ( (lv_operand2_3_0= ruleBitwiseOperand ) )
                    	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3247:1: (lv_operand2_3_0= ruleBitwiseOperand )
                    	    {
                    	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3247:1: (lv_operand2_3_0= ruleBitwiseOperand )
                    	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3248:3: lv_operand2_3_0= ruleBitwiseOperand
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTimesDivOperandAccess().getOperand2BitwiseOperandParserRuleCall_0_1_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleBitwiseOperand_in_ruleTimesDivOperand7321);
                    	    lv_operand2_3_0=ruleBitwiseOperand();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTimesDivOperandRule());
                    	    	        }
                    	           		set(
                    	           			current, 
                    	           			"operand2",
                    	            		lv_operand2_3_0, 
                    	            		"BitwiseOperand");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop60;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3265:6: ( ( (lv_op_4_0= RULE_BNOT ) ) ( (lv_operand1_5_0= ruleBitwiseOperand ) ) )
                    {
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3265:6: ( ( (lv_op_4_0= RULE_BNOT ) ) ( (lv_operand1_5_0= ruleBitwiseOperand ) ) )
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3265:7: ( (lv_op_4_0= RULE_BNOT ) ) ( (lv_operand1_5_0= ruleBitwiseOperand ) )
                    {
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3265:7: ( (lv_op_4_0= RULE_BNOT ) )
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3266:1: (lv_op_4_0= RULE_BNOT )
                    {
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3266:1: (lv_op_4_0= RULE_BNOT )
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3267:3: lv_op_4_0= RULE_BNOT
                    {
                    lv_op_4_0=(Token)match(input,RULE_BNOT,FOLLOW_RULE_BNOT_in_ruleTimesDivOperand7348); 

                    			newLeafNode(lv_op_4_0, grammarAccess.getTimesDivOperandAccess().getOpBNOTTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTimesDivOperandRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"op",
                            		lv_op_4_0, 
                            		"BNOT");
                    	    

                    }


                    }

                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3283:2: ( (lv_operand1_5_0= ruleBitwiseOperand ) )
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3284:1: (lv_operand1_5_0= ruleBitwiseOperand )
                    {
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3284:1: (lv_operand1_5_0= ruleBitwiseOperand )
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3285:3: lv_operand1_5_0= ruleBitwiseOperand
                    {
                     
                    	        newCompositeNode(grammarAccess.getTimesDivOperandAccess().getOperand1BitwiseOperandParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBitwiseOperand_in_ruleTimesDivOperand7374);
                    lv_operand1_5_0=ruleBitwiseOperand();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTimesDivOperandRule());
                    	        }
                           		set(
                           			current, 
                           			"operand1",
                            		lv_operand1_5_0, 
                            		"BitwiseOperand");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


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
        }
        return current;
    }
    // $ANTLR end "ruleTimesDivOperand"


    // $ANTLR start "entryRuleBitwiseOperand"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3309:1: entryRuleBitwiseOperand returns [EObject current=null] : iv_ruleBitwiseOperand= ruleBitwiseOperand EOF ;
    public final EObject entryRuleBitwiseOperand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseOperand = null;


        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3310:2: (iv_ruleBitwiseOperand= ruleBitwiseOperand EOF )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3311:2: iv_ruleBitwiseOperand= ruleBitwiseOperand EOF
            {
             newCompositeNode(grammarAccess.getBitwiseOperandRule()); 
            pushFollow(FOLLOW_ruleBitwiseOperand_in_entryRuleBitwiseOperand7411);
            iv_ruleBitwiseOperand=ruleBitwiseOperand();

            state._fsp--;

             current =iv_ruleBitwiseOperand; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBitwiseOperand7421); 

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
    // $ANTLR end "entryRuleBitwiseOperand"


    // $ANTLR start "ruleBitwiseOperand"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3318:1: ruleBitwiseOperand returns [EObject current=null] : ( (this_LogicalOperand_0= ruleLogicalOperand | this_NotOperand_1= ruleNotOperand ) ( () ( ( (lv_op_3_1= RULE_OR | lv_op_3_2= RULE_AND ) ) ) ( ( (lv_operand2_4_1= ruleNotOperand | lv_operand2_4_2= ruleLogicalOperand ) ) ) )* ) ;
    public final EObject ruleBitwiseOperand() throws RecognitionException {
        EObject current = null;

        Token lv_op_3_1=null;
        Token lv_op_3_2=null;
        EObject this_LogicalOperand_0 = null;

        EObject this_NotOperand_1 = null;

        EObject lv_operand2_4_1 = null;

        EObject lv_operand2_4_2 = null;


         enterRule(); 
            
        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3321:28: ( ( (this_LogicalOperand_0= ruleLogicalOperand | this_NotOperand_1= ruleNotOperand ) ( () ( ( (lv_op_3_1= RULE_OR | lv_op_3_2= RULE_AND ) ) ) ( ( (lv_operand2_4_1= ruleNotOperand | lv_operand2_4_2= ruleLogicalOperand ) ) ) )* ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3322:1: ( (this_LogicalOperand_0= ruleLogicalOperand | this_NotOperand_1= ruleNotOperand ) ( () ( ( (lv_op_3_1= RULE_OR | lv_op_3_2= RULE_AND ) ) ) ( ( (lv_operand2_4_1= ruleNotOperand | lv_operand2_4_2= ruleLogicalOperand ) ) ) )* )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3322:1: ( (this_LogicalOperand_0= ruleLogicalOperand | this_NotOperand_1= ruleNotOperand ) ( () ( ( (lv_op_3_1= RULE_OR | lv_op_3_2= RULE_AND ) ) ) ( ( (lv_operand2_4_1= ruleNotOperand | lv_operand2_4_2= ruleLogicalOperand ) ) ) )* )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3322:2: (this_LogicalOperand_0= ruleLogicalOperand | this_NotOperand_1= ruleNotOperand ) ( () ( ( (lv_op_3_1= RULE_OR | lv_op_3_2= RULE_AND ) ) ) ( ( (lv_operand2_4_1= ruleNotOperand | lv_operand2_4_2= ruleLogicalOperand ) ) ) )*
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3322:2: (this_LogicalOperand_0= ruleLogicalOperand | this_NotOperand_1= ruleNotOperand )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_ID||(LA62_0>=RULE_INTVAL && LA62_0<=RULE_LPAREN)||(LA62_0>=RULE_NEW && LA62_0<=RULE_FLOATVAL)||(LA62_0>=73 && LA62_0<=77)) ) {
                alt62=1;
            }
            else if ( (LA62_0==RULE_NOT) ) {
                alt62=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3323:5: this_LogicalOperand_0= ruleLogicalOperand
                    {
                     
                            newCompositeNode(grammarAccess.getBitwiseOperandAccess().getLogicalOperandParserRuleCall_0_0()); 
                        
                    pushFollow(FOLLOW_ruleLogicalOperand_in_ruleBitwiseOperand7469);
                    this_LogicalOperand_0=ruleLogicalOperand();

                    state._fsp--;

                     
                            current = this_LogicalOperand_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3333:5: this_NotOperand_1= ruleNotOperand
                    {
                     
                            newCompositeNode(grammarAccess.getBitwiseOperandAccess().getNotOperandParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleNotOperand_in_ruleBitwiseOperand7496);
                    this_NotOperand_1=ruleNotOperand();

                    state._fsp--;

                     
                            current = this_NotOperand_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3341:2: ( () ( ( (lv_op_3_1= RULE_OR | lv_op_3_2= RULE_AND ) ) ) ( ( (lv_operand2_4_1= ruleNotOperand | lv_operand2_4_2= ruleLogicalOperand ) ) ) )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( ((LA65_0>=RULE_OR && LA65_0<=RULE_AND)) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3341:3: () ( ( (lv_op_3_1= RULE_OR | lv_op_3_2= RULE_AND ) ) ) ( ( (lv_operand2_4_1= ruleNotOperand | lv_operand2_4_2= ruleLogicalOperand ) ) )
            	    {
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3341:3: ()
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3342:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getBitwiseOperandAccess().getBitwiseOperandOperand1Action_1_0(),
            	                current);
            	        

            	    }

            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3347:2: ( ( (lv_op_3_1= RULE_OR | lv_op_3_2= RULE_AND ) ) )
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3348:1: ( (lv_op_3_1= RULE_OR | lv_op_3_2= RULE_AND ) )
            	    {
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3348:1: ( (lv_op_3_1= RULE_OR | lv_op_3_2= RULE_AND ) )
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3349:1: (lv_op_3_1= RULE_OR | lv_op_3_2= RULE_AND )
            	    {
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3349:1: (lv_op_3_1= RULE_OR | lv_op_3_2= RULE_AND )
            	    int alt63=2;
            	    int LA63_0 = input.LA(1);

            	    if ( (LA63_0==RULE_OR) ) {
            	        alt63=1;
            	    }
            	    else if ( (LA63_0==RULE_AND) ) {
            	        alt63=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 63, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt63) {
            	        case 1 :
            	            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3350:3: lv_op_3_1= RULE_OR
            	            {
            	            lv_op_3_1=(Token)match(input,RULE_OR,FOLLOW_RULE_OR_in_ruleBitwiseOperand7525); 

            	            			newLeafNode(lv_op_3_1, grammarAccess.getBitwiseOperandAccess().getOpORTerminalRuleCall_1_1_0_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getBitwiseOperandRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"op",
            	                    		lv_op_3_1, 
            	                    		"OR");
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3365:8: lv_op_3_2= RULE_AND
            	            {
            	            lv_op_3_2=(Token)match(input,RULE_AND,FOLLOW_RULE_AND_in_ruleBitwiseOperand7545); 

            	            			newLeafNode(lv_op_3_2, grammarAccess.getBitwiseOperandAccess().getOpANDTerminalRuleCall_1_1_0_1()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getBitwiseOperandRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"op",
            	                    		lv_op_3_2, 
            	                    		"AND");
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3383:2: ( ( (lv_operand2_4_1= ruleNotOperand | lv_operand2_4_2= ruleLogicalOperand ) ) )
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3384:1: ( (lv_operand2_4_1= ruleNotOperand | lv_operand2_4_2= ruleLogicalOperand ) )
            	    {
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3384:1: ( (lv_operand2_4_1= ruleNotOperand | lv_operand2_4_2= ruleLogicalOperand ) )
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3385:1: (lv_operand2_4_1= ruleNotOperand | lv_operand2_4_2= ruleLogicalOperand )
            	    {
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3385:1: (lv_operand2_4_1= ruleNotOperand | lv_operand2_4_2= ruleLogicalOperand )
            	    int alt64=2;
            	    int LA64_0 = input.LA(1);

            	    if ( (LA64_0==RULE_NOT) ) {
            	        alt64=1;
            	    }
            	    else if ( (LA64_0==RULE_ID||(LA64_0>=RULE_INTVAL && LA64_0<=RULE_LPAREN)||(LA64_0>=RULE_NEW && LA64_0<=RULE_FLOATVAL)||(LA64_0>=73 && LA64_0<=77)) ) {
            	        alt64=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 64, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt64) {
            	        case 1 :
            	            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3386:3: lv_operand2_4_1= ruleNotOperand
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getBitwiseOperandAccess().getOperand2NotOperandParserRuleCall_1_2_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleNotOperand_in_ruleBitwiseOperand7576);
            	            lv_operand2_4_1=ruleNotOperand();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getBitwiseOperandRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"operand2",
            	                    		lv_operand2_4_1, 
            	                    		"NotOperand");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3401:8: lv_operand2_4_2= ruleLogicalOperand
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getBitwiseOperandAccess().getOperand2LogicalOperandParserRuleCall_1_2_0_1()); 
            	            	    
            	            pushFollow(FOLLOW_ruleLogicalOperand_in_ruleBitwiseOperand7595);
            	            lv_operand2_4_2=ruleLogicalOperand();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getBitwiseOperandRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"operand2",
            	                    		lv_operand2_4_2, 
            	                    		"LogicalOperand");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop65;
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
    // $ANTLR end "ruleBitwiseOperand"


    // $ANTLR start "entryRuleNotOperand"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3427:1: entryRuleNotOperand returns [EObject current=null] : iv_ruleNotOperand= ruleNotOperand EOF ;
    public final EObject entryRuleNotOperand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotOperand = null;


        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3428:2: (iv_ruleNotOperand= ruleNotOperand EOF )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3429:2: iv_ruleNotOperand= ruleNotOperand EOF
            {
             newCompositeNode(grammarAccess.getNotOperandRule()); 
            pushFollow(FOLLOW_ruleNotOperand_in_entryRuleNotOperand7636);
            iv_ruleNotOperand=ruleNotOperand();

            state._fsp--;

             current =iv_ruleNotOperand; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotOperand7646); 

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
    // $ANTLR end "entryRuleNotOperand"


    // $ANTLR start "ruleNotOperand"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3436:1: ruleNotOperand returns [EObject current=null] : ( ( (lv_op_0_0= RULE_NOT ) ) ( (lv_operand1_1_0= ruleLogicalOperand ) ) ) ;
    public final EObject ruleNotOperand() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_0=null;
        EObject lv_operand1_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3439:28: ( ( ( (lv_op_0_0= RULE_NOT ) ) ( (lv_operand1_1_0= ruleLogicalOperand ) ) ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3440:1: ( ( (lv_op_0_0= RULE_NOT ) ) ( (lv_operand1_1_0= ruleLogicalOperand ) ) )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3440:1: ( ( (lv_op_0_0= RULE_NOT ) ) ( (lv_operand1_1_0= ruleLogicalOperand ) ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3440:2: ( (lv_op_0_0= RULE_NOT ) ) ( (lv_operand1_1_0= ruleLogicalOperand ) )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3440:2: ( (lv_op_0_0= RULE_NOT ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3441:1: (lv_op_0_0= RULE_NOT )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3441:1: (lv_op_0_0= RULE_NOT )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3442:3: lv_op_0_0= RULE_NOT
            {
            lv_op_0_0=(Token)match(input,RULE_NOT,FOLLOW_RULE_NOT_in_ruleNotOperand7688); 

            			newLeafNode(lv_op_0_0, grammarAccess.getNotOperandAccess().getOpNOTTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNotOperandRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"op",
                    		lv_op_0_0, 
                    		"NOT");
            	    

            }


            }

            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3458:2: ( (lv_operand1_1_0= ruleLogicalOperand ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3459:1: (lv_operand1_1_0= ruleLogicalOperand )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3459:1: (lv_operand1_1_0= ruleLogicalOperand )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3460:3: lv_operand1_1_0= ruleLogicalOperand
            {
             
            	        newCompositeNode(grammarAccess.getNotOperandAccess().getOperand1LogicalOperandParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleLogicalOperand_in_ruleNotOperand7714);
            lv_operand1_1_0=ruleLogicalOperand();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNotOperandRule());
            	        }
                   		set(
                   			current, 
                   			"operand1",
                    		lv_operand1_1_0, 
                    		"LogicalOperand");
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
    // $ANTLR end "ruleNotOperand"


    // $ANTLR start "entryRuleLogicalOperand"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3484:1: entryRuleLogicalOperand returns [EObject current=null] : iv_ruleLogicalOperand= ruleLogicalOperand EOF ;
    public final EObject entryRuleLogicalOperand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOperand = null;


        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3485:2: (iv_ruleLogicalOperand= ruleLogicalOperand EOF )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3486:2: iv_ruleLogicalOperand= ruleLogicalOperand EOF
            {
             newCompositeNode(grammarAccess.getLogicalOperandRule()); 
            pushFollow(FOLLOW_ruleLogicalOperand_in_entryRuleLogicalOperand7750);
            iv_ruleLogicalOperand=ruleLogicalOperand();

            state._fsp--;

             current =iv_ruleLogicalOperand; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalOperand7760); 

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
    // $ANTLR end "entryRuleLogicalOperand"


    // $ANTLR start "ruleLogicalOperand"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3493:1: ruleLogicalOperand returns [EObject current=null] : (this_ComparisonOperand_0= ruleComparisonOperand ( () ( ( (lv_op_2_1= RULE_EQ | lv_op_2_2= RULE_GT | lv_op_2_3= RULE_GE | lv_op_2_4= RULE_LE | lv_op_2_5= RULE_LT | lv_op_2_6= RULE_NE ) ) ) ( (lv_operand2_3_0= ruleComparisonOperand ) ) )* ) ;
    public final EObject ruleLogicalOperand() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        Token lv_op_2_5=null;
        Token lv_op_2_6=null;
        EObject this_ComparisonOperand_0 = null;

        EObject lv_operand2_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3496:28: ( (this_ComparisonOperand_0= ruleComparisonOperand ( () ( ( (lv_op_2_1= RULE_EQ | lv_op_2_2= RULE_GT | lv_op_2_3= RULE_GE | lv_op_2_4= RULE_LE | lv_op_2_5= RULE_LT | lv_op_2_6= RULE_NE ) ) ) ( (lv_operand2_3_0= ruleComparisonOperand ) ) )* ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3497:1: (this_ComparisonOperand_0= ruleComparisonOperand ( () ( ( (lv_op_2_1= RULE_EQ | lv_op_2_2= RULE_GT | lv_op_2_3= RULE_GE | lv_op_2_4= RULE_LE | lv_op_2_5= RULE_LT | lv_op_2_6= RULE_NE ) ) ) ( (lv_operand2_3_0= ruleComparisonOperand ) ) )* )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3497:1: (this_ComparisonOperand_0= ruleComparisonOperand ( () ( ( (lv_op_2_1= RULE_EQ | lv_op_2_2= RULE_GT | lv_op_2_3= RULE_GE | lv_op_2_4= RULE_LE | lv_op_2_5= RULE_LT | lv_op_2_6= RULE_NE ) ) ) ( (lv_operand2_3_0= ruleComparisonOperand ) ) )* )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3498:5: this_ComparisonOperand_0= ruleComparisonOperand ( () ( ( (lv_op_2_1= RULE_EQ | lv_op_2_2= RULE_GT | lv_op_2_3= RULE_GE | lv_op_2_4= RULE_LE | lv_op_2_5= RULE_LT | lv_op_2_6= RULE_NE ) ) ) ( (lv_operand2_3_0= ruleComparisonOperand ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getLogicalOperandAccess().getComparisonOperandParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleComparisonOperand_in_ruleLogicalOperand7807);
            this_ComparisonOperand_0=ruleComparisonOperand();

            state._fsp--;

             
                    current = this_ComparisonOperand_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3506:1: ( () ( ( (lv_op_2_1= RULE_EQ | lv_op_2_2= RULE_GT | lv_op_2_3= RULE_GE | lv_op_2_4= RULE_LE | lv_op_2_5= RULE_LT | lv_op_2_6= RULE_NE ) ) ) ( (lv_operand2_3_0= ruleComparisonOperand ) ) )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( ((LA67_0>=RULE_EQ && LA67_0<=RULE_NE)) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3506:2: () ( ( (lv_op_2_1= RULE_EQ | lv_op_2_2= RULE_GT | lv_op_2_3= RULE_GE | lv_op_2_4= RULE_LE | lv_op_2_5= RULE_LT | lv_op_2_6= RULE_NE ) ) ) ( (lv_operand2_3_0= ruleComparisonOperand ) )
            	    {
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3506:2: ()
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3507:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getLogicalOperandAccess().getLogicalOperandOperand1Action_1_0(),
            	                current);
            	        

            	    }

            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3512:2: ( ( (lv_op_2_1= RULE_EQ | lv_op_2_2= RULE_GT | lv_op_2_3= RULE_GE | lv_op_2_4= RULE_LE | lv_op_2_5= RULE_LT | lv_op_2_6= RULE_NE ) ) )
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3513:1: ( (lv_op_2_1= RULE_EQ | lv_op_2_2= RULE_GT | lv_op_2_3= RULE_GE | lv_op_2_4= RULE_LE | lv_op_2_5= RULE_LT | lv_op_2_6= RULE_NE ) )
            	    {
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3513:1: ( (lv_op_2_1= RULE_EQ | lv_op_2_2= RULE_GT | lv_op_2_3= RULE_GE | lv_op_2_4= RULE_LE | lv_op_2_5= RULE_LT | lv_op_2_6= RULE_NE ) )
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3514:1: (lv_op_2_1= RULE_EQ | lv_op_2_2= RULE_GT | lv_op_2_3= RULE_GE | lv_op_2_4= RULE_LE | lv_op_2_5= RULE_LT | lv_op_2_6= RULE_NE )
            	    {
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3514:1: (lv_op_2_1= RULE_EQ | lv_op_2_2= RULE_GT | lv_op_2_3= RULE_GE | lv_op_2_4= RULE_LE | lv_op_2_5= RULE_LT | lv_op_2_6= RULE_NE )
            	    int alt66=6;
            	    switch ( input.LA(1) ) {
            	    case RULE_EQ:
            	        {
            	        alt66=1;
            	        }
            	        break;
            	    case RULE_GT:
            	        {
            	        alt66=2;
            	        }
            	        break;
            	    case RULE_GE:
            	        {
            	        alt66=3;
            	        }
            	        break;
            	    case RULE_LE:
            	        {
            	        alt66=4;
            	        }
            	        break;
            	    case RULE_LT:
            	        {
            	        alt66=5;
            	        }
            	        break;
            	    case RULE_NE:
            	        {
            	        alt66=6;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 66, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt66) {
            	        case 1 :
            	            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3515:3: lv_op_2_1= RULE_EQ
            	            {
            	            lv_op_2_1=(Token)match(input,RULE_EQ,FOLLOW_RULE_EQ_in_ruleLogicalOperand7835); 

            	            			newLeafNode(lv_op_2_1, grammarAccess.getLogicalOperandAccess().getOpEQTerminalRuleCall_1_1_0_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getLogicalOperandRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"op",
            	                    		lv_op_2_1, 
            	                    		"EQ");
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3530:8: lv_op_2_2= RULE_GT
            	            {
            	            lv_op_2_2=(Token)match(input,RULE_GT,FOLLOW_RULE_GT_in_ruleLogicalOperand7855); 

            	            			newLeafNode(lv_op_2_2, grammarAccess.getLogicalOperandAccess().getOpGTTerminalRuleCall_1_1_0_1()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getLogicalOperandRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"op",
            	                    		lv_op_2_2, 
            	                    		"GT");
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3545:8: lv_op_2_3= RULE_GE
            	            {
            	            lv_op_2_3=(Token)match(input,RULE_GE,FOLLOW_RULE_GE_in_ruleLogicalOperand7875); 

            	            			newLeafNode(lv_op_2_3, grammarAccess.getLogicalOperandAccess().getOpGETerminalRuleCall_1_1_0_2()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getLogicalOperandRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"op",
            	                    		lv_op_2_3, 
            	                    		"GE");
            	            	    

            	            }
            	            break;
            	        case 4 :
            	            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3560:8: lv_op_2_4= RULE_LE
            	            {
            	            lv_op_2_4=(Token)match(input,RULE_LE,FOLLOW_RULE_LE_in_ruleLogicalOperand7895); 

            	            			newLeafNode(lv_op_2_4, grammarAccess.getLogicalOperandAccess().getOpLETerminalRuleCall_1_1_0_3()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getLogicalOperandRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"op",
            	                    		lv_op_2_4, 
            	                    		"LE");
            	            	    

            	            }
            	            break;
            	        case 5 :
            	            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3575:8: lv_op_2_5= RULE_LT
            	            {
            	            lv_op_2_5=(Token)match(input,RULE_LT,FOLLOW_RULE_LT_in_ruleLogicalOperand7915); 

            	            			newLeafNode(lv_op_2_5, grammarAccess.getLogicalOperandAccess().getOpLTTerminalRuleCall_1_1_0_4()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getLogicalOperandRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"op",
            	                    		lv_op_2_5, 
            	                    		"LT");
            	            	    

            	            }
            	            break;
            	        case 6 :
            	            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3590:8: lv_op_2_6= RULE_NE
            	            {
            	            lv_op_2_6=(Token)match(input,RULE_NE,FOLLOW_RULE_NE_in_ruleLogicalOperand7935); 

            	            			newLeafNode(lv_op_2_6, grammarAccess.getLogicalOperandAccess().getOpNETerminalRuleCall_1_1_0_5()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getLogicalOperandRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"op",
            	                    		lv_op_2_6, 
            	                    		"NE");
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3608:2: ( (lv_operand2_3_0= ruleComparisonOperand ) )
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3609:1: (lv_operand2_3_0= ruleComparisonOperand )
            	    {
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3609:1: (lv_operand2_3_0= ruleComparisonOperand )
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3610:3: lv_operand2_3_0= ruleComparisonOperand
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLogicalOperandAccess().getOperand2ComparisonOperandParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleComparisonOperand_in_ruleLogicalOperand7964);
            	    lv_operand2_3_0=ruleComparisonOperand();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLogicalOperandRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"operand2",
            	            		lv_operand2_3_0, 
            	            		"ComparisonOperand");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop67;
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
    // $ANTLR end "ruleLogicalOperand"


    // $ANTLR start "entryRuleComparisonOperand"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3634:1: entryRuleComparisonOperand returns [EObject current=null] : iv_ruleComparisonOperand= ruleComparisonOperand EOF ;
    public final EObject entryRuleComparisonOperand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonOperand = null;


        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3635:2: (iv_ruleComparisonOperand= ruleComparisonOperand EOF )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3636:2: iv_ruleComparisonOperand= ruleComparisonOperand EOF
            {
             newCompositeNode(grammarAccess.getComparisonOperandRule()); 
            pushFollow(FOLLOW_ruleComparisonOperand_in_entryRuleComparisonOperand8002);
            iv_ruleComparisonOperand=ruleComparisonOperand();

            state._fsp--;

             current =iv_ruleComparisonOperand; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparisonOperand8012); 

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
    // $ANTLR end "entryRuleComparisonOperand"


    // $ANTLR start "ruleComparisonOperand"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3643:1: ruleComparisonOperand returns [EObject current=null] : this_AccessExpr_0= ruleAccessExpr ;
    public final EObject ruleComparisonOperand() throws RecognitionException {
        EObject current = null;

        EObject this_AccessExpr_0 = null;


         enterRule(); 
            
        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3646:28: (this_AccessExpr_0= ruleAccessExpr )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3648:5: this_AccessExpr_0= ruleAccessExpr
            {
             
                    newCompositeNode(grammarAccess.getComparisonOperandAccess().getAccessExprParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleAccessExpr_in_ruleComparisonOperand8058);
            this_AccessExpr_0=ruleAccessExpr();

            state._fsp--;

             
                    current = this_AccessExpr_0; 
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleComparisonOperand"


    // $ANTLR start "entryRuleAccessExpr"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3664:1: entryRuleAccessExpr returns [EObject current=null] : iv_ruleAccessExpr= ruleAccessExpr EOF ;
    public final EObject entryRuleAccessExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccessExpr = null;


        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3665:2: (iv_ruleAccessExpr= ruleAccessExpr EOF )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3666:2: iv_ruleAccessExpr= ruleAccessExpr EOF
            {
             newCompositeNode(grammarAccess.getAccessExprRule()); 
            pushFollow(FOLLOW_ruleAccessExpr_in_entryRuleAccessExpr8092);
            iv_ruleAccessExpr=ruleAccessExpr();

            state._fsp--;

             current =iv_ruleAccessExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAccessExpr8102); 

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
    // $ANTLR end "entryRuleAccessExpr"


    // $ANTLR start "ruleAccessExpr"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3673:1: ruleAccessExpr returns [EObject current=null] : (this_AccessBaseExpr_0= ruleAccessBaseExpr ( ( () ( (lv_op_2_0= RULE_LSQUARE ) ) ( (lv_operand2_3_0= ruleExpression ) ) this_RSQUARE_4= RULE_RSQUARE ) | ( () ( (lv_op_6_0= RULE_DOT ) ) ( (lv_value_7_0= RULE_ID ) ) ( (lv_args_8_0= ruleCallArguments ) )? ) )* ) ;
    public final EObject ruleAccessExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        Token this_RSQUARE_4=null;
        Token lv_op_6_0=null;
        Token lv_value_7_0=null;
        EObject this_AccessBaseExpr_0 = null;

        EObject lv_operand2_3_0 = null;

        EObject lv_args_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3676:28: ( (this_AccessBaseExpr_0= ruleAccessBaseExpr ( ( () ( (lv_op_2_0= RULE_LSQUARE ) ) ( (lv_operand2_3_0= ruleExpression ) ) this_RSQUARE_4= RULE_RSQUARE ) | ( () ( (lv_op_6_0= RULE_DOT ) ) ( (lv_value_7_0= RULE_ID ) ) ( (lv_args_8_0= ruleCallArguments ) )? ) )* ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3677:1: (this_AccessBaseExpr_0= ruleAccessBaseExpr ( ( () ( (lv_op_2_0= RULE_LSQUARE ) ) ( (lv_operand2_3_0= ruleExpression ) ) this_RSQUARE_4= RULE_RSQUARE ) | ( () ( (lv_op_6_0= RULE_DOT ) ) ( (lv_value_7_0= RULE_ID ) ) ( (lv_args_8_0= ruleCallArguments ) )? ) )* )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3677:1: (this_AccessBaseExpr_0= ruleAccessBaseExpr ( ( () ( (lv_op_2_0= RULE_LSQUARE ) ) ( (lv_operand2_3_0= ruleExpression ) ) this_RSQUARE_4= RULE_RSQUARE ) | ( () ( (lv_op_6_0= RULE_DOT ) ) ( (lv_value_7_0= RULE_ID ) ) ( (lv_args_8_0= ruleCallArguments ) )? ) )* )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3678:5: this_AccessBaseExpr_0= ruleAccessBaseExpr ( ( () ( (lv_op_2_0= RULE_LSQUARE ) ) ( (lv_operand2_3_0= ruleExpression ) ) this_RSQUARE_4= RULE_RSQUARE ) | ( () ( (lv_op_6_0= RULE_DOT ) ) ( (lv_value_7_0= RULE_ID ) ) ( (lv_args_8_0= ruleCallArguments ) )? ) )*
            {
             
                    newCompositeNode(grammarAccess.getAccessExprAccess().getAccessBaseExprParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleAccessBaseExpr_in_ruleAccessExpr8149);
            this_AccessBaseExpr_0=ruleAccessBaseExpr();

            state._fsp--;

             
                    current = this_AccessBaseExpr_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3686:1: ( ( () ( (lv_op_2_0= RULE_LSQUARE ) ) ( (lv_operand2_3_0= ruleExpression ) ) this_RSQUARE_4= RULE_RSQUARE ) | ( () ( (lv_op_6_0= RULE_DOT ) ) ( (lv_value_7_0= RULE_ID ) ) ( (lv_args_8_0= ruleCallArguments ) )? ) )*
            loop69:
            do {
                int alt69=3;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==RULE_LSQUARE) ) {
                    alt69=1;
                }
                else if ( (LA69_0==RULE_DOT) ) {
                    alt69=2;
                }


                switch (alt69) {
            	case 1 :
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3686:2: ( () ( (lv_op_2_0= RULE_LSQUARE ) ) ( (lv_operand2_3_0= ruleExpression ) ) this_RSQUARE_4= RULE_RSQUARE )
            	    {
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3686:2: ( () ( (lv_op_2_0= RULE_LSQUARE ) ) ( (lv_operand2_3_0= ruleExpression ) ) this_RSQUARE_4= RULE_RSQUARE )
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3686:3: () ( (lv_op_2_0= RULE_LSQUARE ) ) ( (lv_operand2_3_0= ruleExpression ) ) this_RSQUARE_4= RULE_RSQUARE
            	    {
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3686:3: ()
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3687:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAccessExprAccess().getAccessExprOperand1Action_1_0_0(),
            	                current);
            	        

            	    }

            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3692:2: ( (lv_op_2_0= RULE_LSQUARE ) )
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3693:1: (lv_op_2_0= RULE_LSQUARE )
            	    {
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3693:1: (lv_op_2_0= RULE_LSQUARE )
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3694:3: lv_op_2_0= RULE_LSQUARE
            	    {
            	    lv_op_2_0=(Token)match(input,RULE_LSQUARE,FOLLOW_RULE_LSQUARE_in_ruleAccessExpr8176); 

            	    			newLeafNode(lv_op_2_0, grammarAccess.getAccessExprAccess().getOpLSQUARETerminalRuleCall_1_0_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getAccessExprRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"op",
            	            		lv_op_2_0, 
            	            		"LSQUARE");
            	    	    

            	    }


            	    }

            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3710:2: ( (lv_operand2_3_0= ruleExpression ) )
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3711:1: (lv_operand2_3_0= ruleExpression )
            	    {
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3711:1: (lv_operand2_3_0= ruleExpression )
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3712:3: lv_operand2_3_0= ruleExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAccessExprAccess().getOperand2ExpressionParserRuleCall_1_0_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExpression_in_ruleAccessExpr8202);
            	    lv_operand2_3_0=ruleExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAccessExprRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"operand2",
            	            		lv_operand2_3_0, 
            	            		"Expression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    this_RSQUARE_4=(Token)match(input,RULE_RSQUARE,FOLLOW_RULE_RSQUARE_in_ruleAccessExpr8213); 
            	     
            	        newLeafNode(this_RSQUARE_4, grammarAccess.getAccessExprAccess().getRSQUARETerminalRuleCall_1_0_3()); 
            	        

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3733:6: ( () ( (lv_op_6_0= RULE_DOT ) ) ( (lv_value_7_0= RULE_ID ) ) ( (lv_args_8_0= ruleCallArguments ) )? )
            	    {
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3733:6: ( () ( (lv_op_6_0= RULE_DOT ) ) ( (lv_value_7_0= RULE_ID ) ) ( (lv_args_8_0= ruleCallArguments ) )? )
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3733:7: () ( (lv_op_6_0= RULE_DOT ) ) ( (lv_value_7_0= RULE_ID ) ) ( (lv_args_8_0= ruleCallArguments ) )?
            	    {
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3733:7: ()
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3734:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAccessExprAccess().getAccessExprOperand1Action_1_1_0(),
            	                current);
            	        

            	    }

            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3739:2: ( (lv_op_6_0= RULE_DOT ) )
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3740:1: (lv_op_6_0= RULE_DOT )
            	    {
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3740:1: (lv_op_6_0= RULE_DOT )
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3741:3: lv_op_6_0= RULE_DOT
            	    {
            	    lv_op_6_0=(Token)match(input,RULE_DOT,FOLLOW_RULE_DOT_in_ruleAccessExpr8246); 

            	    			newLeafNode(lv_op_6_0, grammarAccess.getAccessExprAccess().getOpDOTTerminalRuleCall_1_1_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getAccessExprRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"op",
            	            		lv_op_6_0, 
            	            		"DOT");
            	    	    

            	    }


            	    }

            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3757:2: ( (lv_value_7_0= RULE_ID ) )
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3758:1: (lv_value_7_0= RULE_ID )
            	    {
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3758:1: (lv_value_7_0= RULE_ID )
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3759:3: lv_value_7_0= RULE_ID
            	    {
            	    lv_value_7_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAccessExpr8268); 

            	    			newLeafNode(lv_value_7_0, grammarAccess.getAccessExprAccess().getValueIDTerminalRuleCall_1_1_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getAccessExprRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"value",
            	            		lv_value_7_0, 
            	            		"ID");
            	    	    

            	    }


            	    }

            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3775:2: ( (lv_args_8_0= ruleCallArguments ) )?
            	    int alt68=2;
            	    int LA68_0 = input.LA(1);

            	    if ( (LA68_0==RULE_LPAREN) ) {
            	        alt68=1;
            	    }
            	    switch (alt68) {
            	        case 1 :
            	            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3776:1: (lv_args_8_0= ruleCallArguments )
            	            {
            	            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3776:1: (lv_args_8_0= ruleCallArguments )
            	            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3777:3: lv_args_8_0= ruleCallArguments
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getAccessExprAccess().getArgsCallArgumentsParserRuleCall_1_1_3_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleCallArguments_in_ruleAccessExpr8294);
            	            lv_args_8_0=ruleCallArguments();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getAccessExprRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"args",
            	                    		lv_args_8_0, 
            	                    		"CallArguments");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop69;
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
    // $ANTLR end "ruleAccessExpr"


    // $ANTLR start "entryRuleAccessBaseExpr"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3801:1: entryRuleAccessBaseExpr returns [EObject current=null] : iv_ruleAccessBaseExpr= ruleAccessBaseExpr EOF ;
    public final EObject entryRuleAccessBaseExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccessBaseExpr = null;


        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3802:2: (iv_ruleAccessBaseExpr= ruleAccessBaseExpr EOF )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3803:2: iv_ruleAccessBaseExpr= ruleAccessBaseExpr EOF
            {
             newCompositeNode(grammarAccess.getAccessBaseExprRule()); 
            pushFollow(FOLLOW_ruleAccessBaseExpr_in_entryRuleAccessBaseExpr8334);
            iv_ruleAccessBaseExpr=ruleAccessBaseExpr();

            state._fsp--;

             current =iv_ruleAccessBaseExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAccessBaseExpr8344); 

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
    // $ANTLR end "entryRuleAccessBaseExpr"


    // $ANTLR start "ruleAccessBaseExpr"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3810:1: ruleAccessBaseExpr returns [EObject current=null] : (this_BuiltinExpr_0= ruleBuiltinExpr | this_SimpleExpr_1= ruleSimpleExpr ) ;
    public final EObject ruleAccessBaseExpr() throws RecognitionException {
        EObject current = null;

        EObject this_BuiltinExpr_0 = null;

        EObject this_SimpleExpr_1 = null;


         enterRule(); 
            
        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3813:28: ( (this_BuiltinExpr_0= ruleBuiltinExpr | this_SimpleExpr_1= ruleSimpleExpr ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3814:1: (this_BuiltinExpr_0= ruleBuiltinExpr | this_SimpleExpr_1= ruleSimpleExpr )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3814:1: (this_BuiltinExpr_0= ruleBuiltinExpr | this_SimpleExpr_1= ruleSimpleExpr )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==RULE_ID) ) {
                int LA70_1 = input.LA(2);

                if ( (LA70_1==EOF||LA70_1==RULE_END_RULE||(LA70_1>=RULE_COMMA && LA70_1<=RULE_RPAREN)||(LA70_1>=RULE_SEMICOLON && LA70_1<=RULE_ASSIGN)||(LA70_1>=RULE_IF && LA70_1<=RULE_DO)||(LA70_1>=RULE_PLUS && LA70_1<=RULE_BXOR)||(LA70_1>=RULE_OR && LA70_1<=RULE_AND)||(LA70_1>=RULE_EQ && LA70_1<=RULE_DOT)) ) {
                    alt70=2;
                }
                else if ( (LA70_1==RULE_LPAREN) ) {
                    alt70=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 70, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA70_0>=RULE_INTVAL && LA70_0<=RULE_LPAREN)||(LA70_0>=RULE_NEW && LA70_0<=RULE_FLOATVAL)||(LA70_0>=73 && LA70_0<=77)) ) {
                alt70=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3815:5: this_BuiltinExpr_0= ruleBuiltinExpr
                    {
                     
                            newCompositeNode(grammarAccess.getAccessBaseExprAccess().getBuiltinExprParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleBuiltinExpr_in_ruleAccessBaseExpr8391);
                    this_BuiltinExpr_0=ruleBuiltinExpr();

                    state._fsp--;

                     
                            current = this_BuiltinExpr_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3825:5: this_SimpleExpr_1= ruleSimpleExpr
                    {
                     
                            newCompositeNode(grammarAccess.getAccessBaseExprAccess().getSimpleExprParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSimpleExpr_in_ruleAccessBaseExpr8418);
                    this_SimpleExpr_1=ruleSimpleExpr();

                    state._fsp--;

                     
                            current = this_SimpleExpr_1; 
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
    // $ANTLR end "ruleAccessBaseExpr"


    // $ANTLR start "entryRuleBuiltinExpr"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3841:1: entryRuleBuiltinExpr returns [EObject current=null] : iv_ruleBuiltinExpr= ruleBuiltinExpr EOF ;
    public final EObject entryRuleBuiltinExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuiltinExpr = null;


        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3842:2: (iv_ruleBuiltinExpr= ruleBuiltinExpr EOF )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3843:2: iv_ruleBuiltinExpr= ruleBuiltinExpr EOF
            {
             newCompositeNode(grammarAccess.getBuiltinExprRule()); 
            pushFollow(FOLLOW_ruleBuiltinExpr_in_entryRuleBuiltinExpr8453);
            iv_ruleBuiltinExpr=ruleBuiltinExpr();

            state._fsp--;

             current =iv_ruleBuiltinExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBuiltinExpr8463); 

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
    // $ANTLR end "entryRuleBuiltinExpr"


    // $ANTLR start "ruleBuiltinExpr"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3850:1: ruleBuiltinExpr returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_ID ) ) ( (lv_args_2_0= ruleCallArguments ) ) ) ;
    public final EObject ruleBuiltinExpr() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        EObject lv_args_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3853:28: ( ( () ( (lv_value_1_0= RULE_ID ) ) ( (lv_args_2_0= ruleCallArguments ) ) ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3854:1: ( () ( (lv_value_1_0= RULE_ID ) ) ( (lv_args_2_0= ruleCallArguments ) ) )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3854:1: ( () ( (lv_value_1_0= RULE_ID ) ) ( (lv_args_2_0= ruleCallArguments ) ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3854:2: () ( (lv_value_1_0= RULE_ID ) ) ( (lv_args_2_0= ruleCallArguments ) )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3854:2: ()
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3855:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBuiltinExprAccess().getBuiltinExprAction_0(),
                        current);
                

            }

            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3860:2: ( (lv_value_1_0= RULE_ID ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3861:1: (lv_value_1_0= RULE_ID )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3861:1: (lv_value_1_0= RULE_ID )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3862:3: lv_value_1_0= RULE_ID
            {
            lv_value_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBuiltinExpr8514); 

            			newLeafNode(lv_value_1_0, grammarAccess.getBuiltinExprAccess().getValueIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBuiltinExprRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3878:2: ( (lv_args_2_0= ruleCallArguments ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3879:1: (lv_args_2_0= ruleCallArguments )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3879:1: (lv_args_2_0= ruleCallArguments )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3880:3: lv_args_2_0= ruleCallArguments
            {
             
            	        newCompositeNode(grammarAccess.getBuiltinExprAccess().getArgsCallArgumentsParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleCallArguments_in_ruleBuiltinExpr8540);
            lv_args_2_0=ruleCallArguments();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBuiltinExprRule());
            	        }
                   		set(
                   			current, 
                   			"args",
                    		lv_args_2_0, 
                    		"CallArguments");
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
    // $ANTLR end "ruleBuiltinExpr"


    // $ANTLR start "entryRuleSimpleExpr"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3904:1: entryRuleSimpleExpr returns [EObject current=null] : iv_ruleSimpleExpr= ruleSimpleExpr EOF ;
    public final EObject entryRuleSimpleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleExpr = null;


        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3905:2: (iv_ruleSimpleExpr= ruleSimpleExpr EOF )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3906:2: iv_ruleSimpleExpr= ruleSimpleExpr EOF
            {
             newCompositeNode(grammarAccess.getSimpleExprRule()); 
            pushFollow(FOLLOW_ruleSimpleExpr_in_entryRuleSimpleExpr8576);
            iv_ruleSimpleExpr=ruleSimpleExpr();

            state._fsp--;

             current =iv_ruleSimpleExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleExpr8586); 

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
    // $ANTLR end "entryRuleSimpleExpr"


    // $ANTLR start "ruleSimpleExpr"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3913:1: ruleSimpleExpr returns [EObject current=null] : (this_VariableExpr_0= ruleVariableExpr | this_ConstantExpr_1= ruleConstantExpr | this_BracketedExpr_2= ruleBracketedExpr | this_NewExpr_3= ruleNewExpr ) ;
    public final EObject ruleSimpleExpr() throws RecognitionException {
        EObject current = null;

        EObject this_VariableExpr_0 = null;

        EObject this_ConstantExpr_1 = null;

        EObject this_BracketedExpr_2 = null;

        EObject this_NewExpr_3 = null;


         enterRule(); 
            
        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3916:28: ( (this_VariableExpr_0= ruleVariableExpr | this_ConstantExpr_1= ruleConstantExpr | this_BracketedExpr_2= ruleBracketedExpr | this_NewExpr_3= ruleNewExpr ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3917:1: (this_VariableExpr_0= ruleVariableExpr | this_ConstantExpr_1= ruleConstantExpr | this_BracketedExpr_2= ruleBracketedExpr | this_NewExpr_3= ruleNewExpr )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3917:1: (this_VariableExpr_0= ruleVariableExpr | this_ConstantExpr_1= ruleConstantExpr | this_BracketedExpr_2= ruleBracketedExpr | this_NewExpr_3= ruleNewExpr )
            int alt71=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_DOLLAR:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
                {
                alt71=1;
                }
                break;
            case RULE_INTVAL:
            case RULE_STRING:
            case RULE_BOOLEAN:
            case RULE_FLOATVAL:
                {
                alt71=2;
                }
                break;
            case RULE_LPAREN:
                {
                alt71=3;
                }
                break;
            case RULE_NEW:
                {
                alt71=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }

            switch (alt71) {
                case 1 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3918:5: this_VariableExpr_0= ruleVariableExpr
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleExprAccess().getVariableExprParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleVariableExpr_in_ruleSimpleExpr8633);
                    this_VariableExpr_0=ruleVariableExpr();

                    state._fsp--;

                     
                            current = this_VariableExpr_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3928:5: this_ConstantExpr_1= ruleConstantExpr
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleExprAccess().getConstantExprParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleConstantExpr_in_ruleSimpleExpr8660);
                    this_ConstantExpr_1=ruleConstantExpr();

                    state._fsp--;

                     
                            current = this_ConstantExpr_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3938:5: this_BracketedExpr_2= ruleBracketedExpr
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleExprAccess().getBracketedExprParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleBracketedExpr_in_ruleSimpleExpr8687);
                    this_BracketedExpr_2=ruleBracketedExpr();

                    state._fsp--;

                     
                            current = this_BracketedExpr_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3948:5: this_NewExpr_3= ruleNewExpr
                    {
                     
                            newCompositeNode(grammarAccess.getSimpleExprAccess().getNewExprParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleNewExpr_in_ruleSimpleExpr8714);
                    this_NewExpr_3=ruleNewExpr();

                    state._fsp--;

                     
                            current = this_NewExpr_3; 
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
    // $ANTLR end "ruleSimpleExpr"


    // $ANTLR start "entryRuleNewExpr"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3964:1: entryRuleNewExpr returns [EObject current=null] : iv_ruleNewExpr= ruleNewExpr EOF ;
    public final EObject entryRuleNewExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNewExpr = null;


        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3965:2: (iv_ruleNewExpr= ruleNewExpr EOF )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3966:2: iv_ruleNewExpr= ruleNewExpr EOF
            {
             newCompositeNode(grammarAccess.getNewExprRule()); 
            pushFollow(FOLLOW_ruleNewExpr_in_entryRuleNewExpr8749);
            iv_ruleNewExpr=ruleNewExpr();

            state._fsp--;

             current =iv_ruleNewExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNewExpr8759); 

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
    // $ANTLR end "entryRuleNewExpr"


    // $ANTLR start "ruleNewExpr"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3973:1: ruleNewExpr returns [EObject current=null] : ( () ( (lv_op_1_0= RULE_NEW ) ) ( (lv_value_2_0= ruleQualifiedName ) ) ( (lv_params_3_0= ruleCallArguments ) ) ) ;
    public final EObject ruleNewExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_0=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;

        EObject lv_params_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3976:28: ( ( () ( (lv_op_1_0= RULE_NEW ) ) ( (lv_value_2_0= ruleQualifiedName ) ) ( (lv_params_3_0= ruleCallArguments ) ) ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3977:1: ( () ( (lv_op_1_0= RULE_NEW ) ) ( (lv_value_2_0= ruleQualifiedName ) ) ( (lv_params_3_0= ruleCallArguments ) ) )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3977:1: ( () ( (lv_op_1_0= RULE_NEW ) ) ( (lv_value_2_0= ruleQualifiedName ) ) ( (lv_params_3_0= ruleCallArguments ) ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3977:2: () ( (lv_op_1_0= RULE_NEW ) ) ( (lv_value_2_0= ruleQualifiedName ) ) ( (lv_params_3_0= ruleCallArguments ) )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3977:2: ()
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3978:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getNewExprAccess().getNewExprAction_0(),
                        current);
                

            }

            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3983:2: ( (lv_op_1_0= RULE_NEW ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3984:1: (lv_op_1_0= RULE_NEW )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3984:1: (lv_op_1_0= RULE_NEW )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:3985:3: lv_op_1_0= RULE_NEW
            {
            lv_op_1_0=(Token)match(input,RULE_NEW,FOLLOW_RULE_NEW_in_ruleNewExpr8810); 

            			newLeafNode(lv_op_1_0, grammarAccess.getNewExprAccess().getOpNEWTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNewExprRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"op",
                    		lv_op_1_0, 
                    		"NEW");
            	    

            }


            }

            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4001:2: ( (lv_value_2_0= ruleQualifiedName ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4002:1: (lv_value_2_0= ruleQualifiedName )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4002:1: (lv_value_2_0= ruleQualifiedName )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4003:3: lv_value_2_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getNewExprAccess().getValueQualifiedNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleNewExpr8836);
            lv_value_2_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNewExprRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4019:2: ( (lv_params_3_0= ruleCallArguments ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4020:1: (lv_params_3_0= ruleCallArguments )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4020:1: (lv_params_3_0= ruleCallArguments )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4021:3: lv_params_3_0= ruleCallArguments
            {
             
            	        newCompositeNode(grammarAccess.getNewExprAccess().getParamsCallArgumentsParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleCallArguments_in_ruleNewExpr8857);
            lv_params_3_0=ruleCallArguments();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNewExprRule());
            	        }
                   		set(
                   			current, 
                   			"params",
                    		lv_params_3_0, 
                    		"CallArguments");
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
    // $ANTLR end "ruleNewExpr"


    // $ANTLR start "entryRuleVariableExpr"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4045:1: entryRuleVariableExpr returns [EObject current=null] : iv_ruleVariableExpr= ruleVariableExpr EOF ;
    public final EObject entryRuleVariableExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableExpr = null;


        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4046:2: (iv_ruleVariableExpr= ruleVariableExpr EOF )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4047:2: iv_ruleVariableExpr= ruleVariableExpr EOF
            {
             newCompositeNode(grammarAccess.getVariableExprRule()); 
            pushFollow(FOLLOW_ruleVariableExpr_in_entryRuleVariableExpr8893);
            iv_ruleVariableExpr=ruleVariableExpr();

            state._fsp--;

             current =iv_ruleVariableExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableExpr8903); 

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
    // $ANTLR end "entryRuleVariableExpr"


    // $ANTLR start "ruleVariableExpr"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4054:1: ruleVariableExpr returns [EObject current=null] : (this_SimpleName_0= ruleSimpleName | this_IndexedSpecialVar_1= ruleIndexedSpecialVar | this_SpecialVar_2= ruleSpecialVar ) ;
    public final EObject ruleVariableExpr() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleName_0 = null;

        EObject this_IndexedSpecialVar_1 = null;

        EObject this_SpecialVar_2 = null;


         enterRule(); 
            
        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4057:28: ( (this_SimpleName_0= ruleSimpleName | this_IndexedSpecialVar_1= ruleIndexedSpecialVar | this_SpecialVar_2= ruleSpecialVar ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4058:1: (this_SimpleName_0= ruleSimpleName | this_IndexedSpecialVar_1= ruleIndexedSpecialVar | this_SpecialVar_2= ruleSpecialVar )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4058:1: (this_SimpleName_0= ruleSimpleName | this_IndexedSpecialVar_1= ruleIndexedSpecialVar | this_SpecialVar_2= ruleSpecialVar )
            int alt72=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt72=1;
                }
                break;
            case RULE_DOLLAR:
                {
                int LA72_2 = input.LA(2);

                if ( (LA72_2==RULE_INTVAL) ) {
                    alt72=2;
                }
                else if ( (LA72_2==RULE_ID) ) {
                    alt72=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 72, 2, input);

                    throw nvae;
                }
                }
                break;
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
                {
                alt72=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }

            switch (alt72) {
                case 1 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4059:5: this_SimpleName_0= ruleSimpleName
                    {
                     
                            newCompositeNode(grammarAccess.getVariableExprAccess().getSimpleNameParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSimpleName_in_ruleVariableExpr8950);
                    this_SimpleName_0=ruleSimpleName();

                    state._fsp--;

                     
                            current = this_SimpleName_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4069:5: this_IndexedSpecialVar_1= ruleIndexedSpecialVar
                    {
                     
                            newCompositeNode(grammarAccess.getVariableExprAccess().getIndexedSpecialVarParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleIndexedSpecialVar_in_ruleVariableExpr8977);
                    this_IndexedSpecialVar_1=ruleIndexedSpecialVar();

                    state._fsp--;

                     
                            current = this_IndexedSpecialVar_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4079:5: this_SpecialVar_2= ruleSpecialVar
                    {
                     
                            newCompositeNode(grammarAccess.getVariableExprAccess().getSpecialVarParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleSpecialVar_in_ruleVariableExpr9004);
                    this_SpecialVar_2=ruleSpecialVar();

                    state._fsp--;

                     
                            current = this_SpecialVar_2; 
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
    // $ANTLR end "ruleVariableExpr"


    // $ANTLR start "entryRuleCallArguments"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4095:1: entryRuleCallArguments returns [EObject current=null] : iv_ruleCallArguments= ruleCallArguments EOF ;
    public final EObject entryRuleCallArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCallArguments = null;


        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4096:2: (iv_ruleCallArguments= ruleCallArguments EOF )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4097:2: iv_ruleCallArguments= ruleCallArguments EOF
            {
             newCompositeNode(grammarAccess.getCallArgumentsRule()); 
            pushFollow(FOLLOW_ruleCallArguments_in_entryRuleCallArguments9039);
            iv_ruleCallArguments=ruleCallArguments();

            state._fsp--;

             current =iv_ruleCallArguments; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCallArguments9049); 

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
    // $ANTLR end "entryRuleCallArguments"


    // $ANTLR start "ruleCallArguments"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4104:1: ruleCallArguments returns [EObject current=null] : (this_LPAREN_0= RULE_LPAREN () ( ( (lv_args_2_0= ruleExpression ) ) (this_COMMA_3= RULE_COMMA ( (lv_args_4_0= ruleExpression ) ) )* )? this_RPAREN_5= RULE_RPAREN ) ;
    public final EObject ruleCallArguments() throws RecognitionException {
        EObject current = null;

        Token this_LPAREN_0=null;
        Token this_COMMA_3=null;
        Token this_RPAREN_5=null;
        EObject lv_args_2_0 = null;

        EObject lv_args_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4107:28: ( (this_LPAREN_0= RULE_LPAREN () ( ( (lv_args_2_0= ruleExpression ) ) (this_COMMA_3= RULE_COMMA ( (lv_args_4_0= ruleExpression ) ) )* )? this_RPAREN_5= RULE_RPAREN ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4108:1: (this_LPAREN_0= RULE_LPAREN () ( ( (lv_args_2_0= ruleExpression ) ) (this_COMMA_3= RULE_COMMA ( (lv_args_4_0= ruleExpression ) ) )* )? this_RPAREN_5= RULE_RPAREN )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4108:1: (this_LPAREN_0= RULE_LPAREN () ( ( (lv_args_2_0= ruleExpression ) ) (this_COMMA_3= RULE_COMMA ( (lv_args_4_0= ruleExpression ) ) )* )? this_RPAREN_5= RULE_RPAREN )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4108:2: this_LPAREN_0= RULE_LPAREN () ( ( (lv_args_2_0= ruleExpression ) ) (this_COMMA_3= RULE_COMMA ( (lv_args_4_0= ruleExpression ) ) )* )? this_RPAREN_5= RULE_RPAREN
            {
            this_LPAREN_0=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleCallArguments9085); 
             
                newLeafNode(this_LPAREN_0, grammarAccess.getCallArgumentsAccess().getLPARENTerminalRuleCall_0()); 
                
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4112:1: ()
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4113:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCallArgumentsAccess().getCallArgumentsAction_1(),
                        current);
                

            }

            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4118:2: ( ( (lv_args_2_0= ruleExpression ) ) (this_COMMA_3= RULE_COMMA ( (lv_args_4_0= ruleExpression ) ) )* )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==RULE_ID||(LA74_0>=RULE_INTVAL && LA74_0<=RULE_LPAREN)||LA74_0==RULE_BNOT||LA74_0==RULE_NOT||(LA74_0>=RULE_NEW && LA74_0<=RULE_FLOATVAL)||(LA74_0>=73 && LA74_0<=77)) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4118:3: ( (lv_args_2_0= ruleExpression ) ) (this_COMMA_3= RULE_COMMA ( (lv_args_4_0= ruleExpression ) ) )*
                    {
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4118:3: ( (lv_args_2_0= ruleExpression ) )
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4119:1: (lv_args_2_0= ruleExpression )
                    {
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4119:1: (lv_args_2_0= ruleExpression )
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4120:3: lv_args_2_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getCallArgumentsAccess().getArgsExpressionParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleCallArguments9115);
                    lv_args_2_0=ruleExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCallArgumentsRule());
                    	        }
                           		add(
                           			current, 
                           			"args",
                            		lv_args_2_0, 
                            		"Expression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4136:2: (this_COMMA_3= RULE_COMMA ( (lv_args_4_0= ruleExpression ) ) )*
                    loop73:
                    do {
                        int alt73=2;
                        int LA73_0 = input.LA(1);

                        if ( (LA73_0==RULE_COMMA) ) {
                            alt73=1;
                        }


                        switch (alt73) {
                    	case 1 :
                    	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4136:3: this_COMMA_3= RULE_COMMA ( (lv_args_4_0= ruleExpression ) )
                    	    {
                    	    this_COMMA_3=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleCallArguments9127); 
                    	     
                    	        newLeafNode(this_COMMA_3, grammarAccess.getCallArgumentsAccess().getCOMMATerminalRuleCall_2_1_0()); 
                    	        
                    	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4140:1: ( (lv_args_4_0= ruleExpression ) )
                    	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4141:1: (lv_args_4_0= ruleExpression )
                    	    {
                    	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4141:1: (lv_args_4_0= ruleExpression )
                    	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4142:3: lv_args_4_0= ruleExpression
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCallArgumentsAccess().getArgsExpressionParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleExpression_in_ruleCallArguments9147);
                    	    lv_args_4_0=ruleExpression();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCallArgumentsRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"args",
                    	            		lv_args_4_0, 
                    	            		"Expression");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop73;
                        }
                    } while (true);


                    }
                    break;

            }

            this_RPAREN_5=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleCallArguments9162); 
             
                newLeafNode(this_RPAREN_5, grammarAccess.getCallArgumentsAccess().getRPARENTerminalRuleCall_3()); 
                

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
    // $ANTLR end "ruleCallArguments"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4170:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4171:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4172:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName9198);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName9209); 

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4179:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (this_DOT_1= RULE_DOT this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_DOT_1=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4182:28: ( (this_ID_0= RULE_ID (this_DOT_1= RULE_DOT this_ID_2= RULE_ID )* ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4183:1: (this_ID_0= RULE_ID (this_DOT_1= RULE_DOT this_ID_2= RULE_ID )* )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4183:1: (this_ID_0= RULE_ID (this_DOT_1= RULE_DOT this_ID_2= RULE_ID )* )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4183:6: this_ID_0= RULE_ID (this_DOT_1= RULE_DOT this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName9249); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4190:1: (this_DOT_1= RULE_DOT this_ID_2= RULE_ID )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==RULE_DOT) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4190:6: this_DOT_1= RULE_DOT this_ID_2= RULE_ID
            	    {
            	    this_DOT_1=(Token)match(input,RULE_DOT,FOLLOW_RULE_DOT_in_ruleQualifiedName9270); 

            	    		current.merge(this_DOT_1);
            	        
            	     
            	        newLeafNode(this_DOT_1, grammarAccess.getQualifiedNameAccess().getDOTTerminalRuleCall_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName9290); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop75;
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleSimpleName"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4212:1: entryRuleSimpleName returns [EObject current=null] : iv_ruleSimpleName= ruleSimpleName EOF ;
    public final EObject entryRuleSimpleName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleName = null;


        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4213:2: (iv_ruleSimpleName= ruleSimpleName EOF )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4214:2: iv_ruleSimpleName= ruleSimpleName EOF
            {
             newCompositeNode(grammarAccess.getSimpleNameRule()); 
            pushFollow(FOLLOW_ruleSimpleName_in_entryRuleSimpleName9337);
            iv_ruleSimpleName=ruleSimpleName();

            state._fsp--;

             current =iv_ruleSimpleName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleName9347); 

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
    // $ANTLR end "entryRuleSimpleName"


    // $ANTLR start "ruleSimpleName"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4221:1: ruleSimpleName returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_ID ) ) ) ;
    public final EObject ruleSimpleName() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4224:28: ( ( () ( (lv_value_1_0= RULE_ID ) ) ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4225:1: ( () ( (lv_value_1_0= RULE_ID ) ) )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4225:1: ( () ( (lv_value_1_0= RULE_ID ) ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4225:2: () ( (lv_value_1_0= RULE_ID ) )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4225:2: ()
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4226:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSimpleNameAccess().getSimpleNameAction_0(),
                        current);
                

            }

            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4231:2: ( (lv_value_1_0= RULE_ID ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4232:1: (lv_value_1_0= RULE_ID )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4232:1: (lv_value_1_0= RULE_ID )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4233:3: lv_value_1_0= RULE_ID
            {
            lv_value_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSimpleName9398); 

            			newLeafNode(lv_value_1_0, grammarAccess.getSimpleNameAccess().getValueIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSimpleNameRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleSimpleName"


    // $ANTLR start "entryRuleIndexedSpecialVar"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4257:1: entryRuleIndexedSpecialVar returns [EObject current=null] : iv_ruleIndexedSpecialVar= ruleIndexedSpecialVar EOF ;
    public final EObject entryRuleIndexedSpecialVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexedSpecialVar = null;


        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4258:2: (iv_ruleIndexedSpecialVar= ruleIndexedSpecialVar EOF )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4259:2: iv_ruleIndexedSpecialVar= ruleIndexedSpecialVar EOF
            {
             newCompositeNode(grammarAccess.getIndexedSpecialVarRule()); 
            pushFollow(FOLLOW_ruleIndexedSpecialVar_in_entryRuleIndexedSpecialVar9439);
            iv_ruleIndexedSpecialVar=ruleIndexedSpecialVar();

            state._fsp--;

             current =iv_ruleIndexedSpecialVar; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIndexedSpecialVar9449); 

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
    // $ANTLR end "entryRuleIndexedSpecialVar"


    // $ANTLR start "ruleIndexedSpecialVar"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4266:1: ruleIndexedSpecialVar returns [EObject current=null] : ( () ( (lv_op_1_0= RULE_DOLLAR ) ) ( (lv_value_2_0= RULE_INTVAL ) ) ) ;
    public final EObject ruleIndexedSpecialVar() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_0=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4269:28: ( ( () ( (lv_op_1_0= RULE_DOLLAR ) ) ( (lv_value_2_0= RULE_INTVAL ) ) ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4270:1: ( () ( (lv_op_1_0= RULE_DOLLAR ) ) ( (lv_value_2_0= RULE_INTVAL ) ) )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4270:1: ( () ( (lv_op_1_0= RULE_DOLLAR ) ) ( (lv_value_2_0= RULE_INTVAL ) ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4270:2: () ( (lv_op_1_0= RULE_DOLLAR ) ) ( (lv_value_2_0= RULE_INTVAL ) )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4270:2: ()
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4271:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getIndexedSpecialVarAccess().getIndexedSpecialVarAction_0(),
                        current);
                

            }

            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4276:2: ( (lv_op_1_0= RULE_DOLLAR ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4277:1: (lv_op_1_0= RULE_DOLLAR )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4277:1: (lv_op_1_0= RULE_DOLLAR )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4278:3: lv_op_1_0= RULE_DOLLAR
            {
            lv_op_1_0=(Token)match(input,RULE_DOLLAR,FOLLOW_RULE_DOLLAR_in_ruleIndexedSpecialVar9500); 

            			newLeafNode(lv_op_1_0, grammarAccess.getIndexedSpecialVarAccess().getOpDOLLARTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIndexedSpecialVarRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"op",
                    		lv_op_1_0, 
                    		"DOLLAR");
            	    

            }


            }

            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4294:2: ( (lv_value_2_0= RULE_INTVAL ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4295:1: (lv_value_2_0= RULE_INTVAL )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4295:1: (lv_value_2_0= RULE_INTVAL )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4296:3: lv_value_2_0= RULE_INTVAL
            {
            lv_value_2_0=(Token)match(input,RULE_INTVAL,FOLLOW_RULE_INTVAL_in_ruleIndexedSpecialVar9522); 

            			newLeafNode(lv_value_2_0, grammarAccess.getIndexedSpecialVarAccess().getValueINTVALTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIndexedSpecialVarRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"INTVAL");
            	    

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
    // $ANTLR end "ruleIndexedSpecialVar"


    // $ANTLR start "entryRuleSpecialVar"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4320:1: entryRuleSpecialVar returns [EObject current=null] : iv_ruleSpecialVar= ruleSpecialVar EOF ;
    public final EObject entryRuleSpecialVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecialVar = null;


        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4321:2: (iv_ruleSpecialVar= ruleSpecialVar EOF )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4322:2: iv_ruleSpecialVar= ruleSpecialVar EOF
            {
             newCompositeNode(grammarAccess.getSpecialVarRule()); 
            pushFollow(FOLLOW_ruleSpecialVar_in_entryRuleSpecialVar9563);
            iv_ruleSpecialVar=ruleSpecialVar();

            state._fsp--;

             current =iv_ruleSpecialVar; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpecialVar9573); 

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
    // $ANTLR end "entryRuleSpecialVar"


    // $ANTLR start "ruleSpecialVar"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4329:1: ruleSpecialVar returns [EObject current=null] : ( () ( ( (lv_op_1_0= '$#' ) ) | ( (lv_op_2_0= '$!' ) ) | ( (lv_op_3_0= '$^' ) ) | ( (lv_op_4_0= '$@' ) ) | ( (lv_op_5_0= '$*' ) ) | ( ( (lv_op_6_0= RULE_DOLLAR ) ) ( (lv_value_7_0= RULE_ID ) ) ) ) ) ;
    public final EObject ruleSpecialVar() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_0=null;
        Token lv_op_2_0=null;
        Token lv_op_3_0=null;
        Token lv_op_4_0=null;
        Token lv_op_5_0=null;
        Token lv_op_6_0=null;
        Token lv_value_7_0=null;

         enterRule(); 
            
        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4332:28: ( ( () ( ( (lv_op_1_0= '$#' ) ) | ( (lv_op_2_0= '$!' ) ) | ( (lv_op_3_0= '$^' ) ) | ( (lv_op_4_0= '$@' ) ) | ( (lv_op_5_0= '$*' ) ) | ( ( (lv_op_6_0= RULE_DOLLAR ) ) ( (lv_value_7_0= RULE_ID ) ) ) ) ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4333:1: ( () ( ( (lv_op_1_0= '$#' ) ) | ( (lv_op_2_0= '$!' ) ) | ( (lv_op_3_0= '$^' ) ) | ( (lv_op_4_0= '$@' ) ) | ( (lv_op_5_0= '$*' ) ) | ( ( (lv_op_6_0= RULE_DOLLAR ) ) ( (lv_value_7_0= RULE_ID ) ) ) ) )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4333:1: ( () ( ( (lv_op_1_0= '$#' ) ) | ( (lv_op_2_0= '$!' ) ) | ( (lv_op_3_0= '$^' ) ) | ( (lv_op_4_0= '$@' ) ) | ( (lv_op_5_0= '$*' ) ) | ( ( (lv_op_6_0= RULE_DOLLAR ) ) ( (lv_value_7_0= RULE_ID ) ) ) ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4333:2: () ( ( (lv_op_1_0= '$#' ) ) | ( (lv_op_2_0= '$!' ) ) | ( (lv_op_3_0= '$^' ) ) | ( (lv_op_4_0= '$@' ) ) | ( (lv_op_5_0= '$*' ) ) | ( ( (lv_op_6_0= RULE_DOLLAR ) ) ( (lv_value_7_0= RULE_ID ) ) ) )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4333:2: ()
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4334:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSpecialVarAccess().getSpecialVarAction_0(),
                        current);
                

            }

            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4339:2: ( ( (lv_op_1_0= '$#' ) ) | ( (lv_op_2_0= '$!' ) ) | ( (lv_op_3_0= '$^' ) ) | ( (lv_op_4_0= '$@' ) ) | ( (lv_op_5_0= '$*' ) ) | ( ( (lv_op_6_0= RULE_DOLLAR ) ) ( (lv_value_7_0= RULE_ID ) ) ) )
            int alt76=6;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt76=1;
                }
                break;
            case 74:
                {
                alt76=2;
                }
                break;
            case 75:
                {
                alt76=3;
                }
                break;
            case 76:
                {
                alt76=4;
                }
                break;
            case 77:
                {
                alt76=5;
                }
                break;
            case RULE_DOLLAR:
                {
                alt76=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }

            switch (alt76) {
                case 1 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4339:3: ( (lv_op_1_0= '$#' ) )
                    {
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4339:3: ( (lv_op_1_0= '$#' ) )
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4340:1: (lv_op_1_0= '$#' )
                    {
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4340:1: (lv_op_1_0= '$#' )
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4341:3: lv_op_1_0= '$#'
                    {
                    lv_op_1_0=(Token)match(input,73,FOLLOW_73_in_ruleSpecialVar9626); 

                            newLeafNode(lv_op_1_0, grammarAccess.getSpecialVarAccess().getOpDollarSignNumberSignKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSpecialVarRule());
                    	        }
                           		setWithLastConsumed(current, "op", lv_op_1_0, "$#");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4355:6: ( (lv_op_2_0= '$!' ) )
                    {
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4355:6: ( (lv_op_2_0= '$!' ) )
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4356:1: (lv_op_2_0= '$!' )
                    {
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4356:1: (lv_op_2_0= '$!' )
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4357:3: lv_op_2_0= '$!'
                    {
                    lv_op_2_0=(Token)match(input,74,FOLLOW_74_in_ruleSpecialVar9663); 

                            newLeafNode(lv_op_2_0, grammarAccess.getSpecialVarAccess().getOpDollarSignExclamationMarkKeyword_1_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSpecialVarRule());
                    	        }
                           		setWithLastConsumed(current, "op", lv_op_2_0, "$!");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4371:6: ( (lv_op_3_0= '$^' ) )
                    {
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4371:6: ( (lv_op_3_0= '$^' ) )
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4372:1: (lv_op_3_0= '$^' )
                    {
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4372:1: (lv_op_3_0= '$^' )
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4373:3: lv_op_3_0= '$^'
                    {
                    lv_op_3_0=(Token)match(input,75,FOLLOW_75_in_ruleSpecialVar9700); 

                            newLeafNode(lv_op_3_0, grammarAccess.getSpecialVarAccess().getOpDollarSignCircumflexAccentKeyword_1_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSpecialVarRule());
                    	        }
                           		setWithLastConsumed(current, "op", lv_op_3_0, "$^");
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4387:6: ( (lv_op_4_0= '$@' ) )
                    {
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4387:6: ( (lv_op_4_0= '$@' ) )
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4388:1: (lv_op_4_0= '$@' )
                    {
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4388:1: (lv_op_4_0= '$@' )
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4389:3: lv_op_4_0= '$@'
                    {
                    lv_op_4_0=(Token)match(input,76,FOLLOW_76_in_ruleSpecialVar9737); 

                            newLeafNode(lv_op_4_0, grammarAccess.getSpecialVarAccess().getOpDollarSignCommercialAtKeyword_1_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSpecialVarRule());
                    	        }
                           		setWithLastConsumed(current, "op", lv_op_4_0, "$@");
                    	    

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4403:6: ( (lv_op_5_0= '$*' ) )
                    {
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4403:6: ( (lv_op_5_0= '$*' ) )
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4404:1: (lv_op_5_0= '$*' )
                    {
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4404:1: (lv_op_5_0= '$*' )
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4405:3: lv_op_5_0= '$*'
                    {
                    lv_op_5_0=(Token)match(input,77,FOLLOW_77_in_ruleSpecialVar9774); 

                            newLeafNode(lv_op_5_0, grammarAccess.getSpecialVarAccess().getOpDollarSignAsteriskKeyword_1_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSpecialVarRule());
                    	        }
                           		setWithLastConsumed(current, "op", lv_op_5_0, "$*");
                    	    

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4419:6: ( ( (lv_op_6_0= RULE_DOLLAR ) ) ( (lv_value_7_0= RULE_ID ) ) )
                    {
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4419:6: ( ( (lv_op_6_0= RULE_DOLLAR ) ) ( (lv_value_7_0= RULE_ID ) ) )
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4419:7: ( (lv_op_6_0= RULE_DOLLAR ) ) ( (lv_value_7_0= RULE_ID ) )
                    {
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4419:7: ( (lv_op_6_0= RULE_DOLLAR ) )
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4420:1: (lv_op_6_0= RULE_DOLLAR )
                    {
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4420:1: (lv_op_6_0= RULE_DOLLAR )
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4421:3: lv_op_6_0= RULE_DOLLAR
                    {
                    lv_op_6_0=(Token)match(input,RULE_DOLLAR,FOLLOW_RULE_DOLLAR_in_ruleSpecialVar9811); 

                    			newLeafNode(lv_op_6_0, grammarAccess.getSpecialVarAccess().getOpDOLLARTerminalRuleCall_1_5_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSpecialVarRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"op",
                            		lv_op_6_0, 
                            		"DOLLAR");
                    	    

                    }


                    }

                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4437:2: ( (lv_value_7_0= RULE_ID ) )
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4438:1: (lv_value_7_0= RULE_ID )
                    {
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4438:1: (lv_value_7_0= RULE_ID )
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4439:3: lv_value_7_0= RULE_ID
                    {
                    lv_value_7_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSpecialVar9833); 

                    			newLeafNode(lv_value_7_0, grammarAccess.getSpecialVarAccess().getValueIDTerminalRuleCall_1_5_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSpecialVarRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_7_0, 
                            		"ID");
                    	    

                    }


                    }


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
    // $ANTLR end "ruleSpecialVar"


    // $ANTLR start "entryRuleBracketedExpr"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4463:1: entryRuleBracketedExpr returns [EObject current=null] : iv_ruleBracketedExpr= ruleBracketedExpr EOF ;
    public final EObject entryRuleBracketedExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBracketedExpr = null;


        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4464:2: (iv_ruleBracketedExpr= ruleBracketedExpr EOF )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4465:2: iv_ruleBracketedExpr= ruleBracketedExpr EOF
            {
             newCompositeNode(grammarAccess.getBracketedExprRule()); 
            pushFollow(FOLLOW_ruleBracketedExpr_in_entryRuleBracketedExpr9876);
            iv_ruleBracketedExpr=ruleBracketedExpr();

            state._fsp--;

             current =iv_ruleBracketedExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBracketedExpr9886); 

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
    // $ANTLR end "entryRuleBracketedExpr"


    // $ANTLR start "ruleBracketedExpr"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4472:1: ruleBracketedExpr returns [EObject current=null] : (this_LPAREN_0= RULE_LPAREN this_Expression_1= ruleExpression this_RPAREN_2= RULE_RPAREN ) ;
    public final EObject ruleBracketedExpr() throws RecognitionException {
        EObject current = null;

        Token this_LPAREN_0=null;
        Token this_RPAREN_2=null;
        EObject this_Expression_1 = null;


         enterRule(); 
            
        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4475:28: ( (this_LPAREN_0= RULE_LPAREN this_Expression_1= ruleExpression this_RPAREN_2= RULE_RPAREN ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4476:1: (this_LPAREN_0= RULE_LPAREN this_Expression_1= ruleExpression this_RPAREN_2= RULE_RPAREN )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4476:1: (this_LPAREN_0= RULE_LPAREN this_Expression_1= ruleExpression this_RPAREN_2= RULE_RPAREN )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4476:2: this_LPAREN_0= RULE_LPAREN this_Expression_1= ruleExpression this_RPAREN_2= RULE_RPAREN
            {
            this_LPAREN_0=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleBracketedExpr9922); 
             
                newLeafNode(this_LPAREN_0, grammarAccess.getBracketedExprAccess().getLPARENTerminalRuleCall_0()); 
                
             
                    newCompositeNode(grammarAccess.getBracketedExprAccess().getExpressionParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleExpression_in_ruleBracketedExpr9943);
            this_Expression_1=ruleExpression();

            state._fsp--;

             
                    current = this_Expression_1; 
                    afterParserOrEnumRuleCall();
                
            this_RPAREN_2=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleBracketedExpr9953); 
             
                newLeafNode(this_RPAREN_2, grammarAccess.getBracketedExprAccess().getRPARENTerminalRuleCall_2()); 
                

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
    // $ANTLR end "ruleBracketedExpr"


    // $ANTLR start "entryRuleConstantExpr"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4501:1: entryRuleConstantExpr returns [EObject current=null] : iv_ruleConstantExpr= ruleConstantExpr EOF ;
    public final EObject entryRuleConstantExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantExpr = null;


        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4502:2: (iv_ruleConstantExpr= ruleConstantExpr EOF )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4503:2: iv_ruleConstantExpr= ruleConstantExpr EOF
            {
             newCompositeNode(grammarAccess.getConstantExprRule()); 
            pushFollow(FOLLOW_ruleConstantExpr_in_entryRuleConstantExpr9988);
            iv_ruleConstantExpr=ruleConstantExpr();

            state._fsp--;

             current =iv_ruleConstantExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantExpr9998); 

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
    // $ANTLR end "entryRuleConstantExpr"


    // $ANTLR start "ruleConstantExpr"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4510:1: ruleConstantExpr returns [EObject current=null] : (this_IntConstantExpr_0= ruleIntConstantExpr | this_StringConstantExpr_1= ruleStringConstantExpr | this_BooleanConstantExpr_2= ruleBooleanConstantExpr | this_FloatConstantExpr_3= ruleFloatConstantExpr ) ;
    public final EObject ruleConstantExpr() throws RecognitionException {
        EObject current = null;

        EObject this_IntConstantExpr_0 = null;

        EObject this_StringConstantExpr_1 = null;

        EObject this_BooleanConstantExpr_2 = null;

        EObject this_FloatConstantExpr_3 = null;


         enterRule(); 
            
        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4513:28: ( (this_IntConstantExpr_0= ruleIntConstantExpr | this_StringConstantExpr_1= ruleStringConstantExpr | this_BooleanConstantExpr_2= ruleBooleanConstantExpr | this_FloatConstantExpr_3= ruleFloatConstantExpr ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4514:1: (this_IntConstantExpr_0= ruleIntConstantExpr | this_StringConstantExpr_1= ruleStringConstantExpr | this_BooleanConstantExpr_2= ruleBooleanConstantExpr | this_FloatConstantExpr_3= ruleFloatConstantExpr )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4514:1: (this_IntConstantExpr_0= ruleIntConstantExpr | this_StringConstantExpr_1= ruleStringConstantExpr | this_BooleanConstantExpr_2= ruleBooleanConstantExpr | this_FloatConstantExpr_3= ruleFloatConstantExpr )
            int alt77=4;
            switch ( input.LA(1) ) {
            case RULE_INTVAL:
                {
                alt77=1;
                }
                break;
            case RULE_STRING:
                {
                alt77=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt77=3;
                }
                break;
            case RULE_FLOATVAL:
                {
                alt77=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }

            switch (alt77) {
                case 1 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4515:5: this_IntConstantExpr_0= ruleIntConstantExpr
                    {
                     
                            newCompositeNode(grammarAccess.getConstantExprAccess().getIntConstantExprParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleIntConstantExpr_in_ruleConstantExpr10045);
                    this_IntConstantExpr_0=ruleIntConstantExpr();

                    state._fsp--;

                     
                            current = this_IntConstantExpr_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4525:5: this_StringConstantExpr_1= ruleStringConstantExpr
                    {
                     
                            newCompositeNode(grammarAccess.getConstantExprAccess().getStringConstantExprParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleStringConstantExpr_in_ruleConstantExpr10072);
                    this_StringConstantExpr_1=ruleStringConstantExpr();

                    state._fsp--;

                     
                            current = this_StringConstantExpr_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4535:5: this_BooleanConstantExpr_2= ruleBooleanConstantExpr
                    {
                     
                            newCompositeNode(grammarAccess.getConstantExprAccess().getBooleanConstantExprParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleBooleanConstantExpr_in_ruleConstantExpr10099);
                    this_BooleanConstantExpr_2=ruleBooleanConstantExpr();

                    state._fsp--;

                     
                            current = this_BooleanConstantExpr_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4545:5: this_FloatConstantExpr_3= ruleFloatConstantExpr
                    {
                     
                            newCompositeNode(grammarAccess.getConstantExprAccess().getFloatConstantExprParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleFloatConstantExpr_in_ruleConstantExpr10126);
                    this_FloatConstantExpr_3=ruleFloatConstantExpr();

                    state._fsp--;

                     
                            current = this_FloatConstantExpr_3; 
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
    // $ANTLR end "ruleConstantExpr"


    // $ANTLR start "entryRuleIntConstantExpr"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4561:1: entryRuleIntConstantExpr returns [EObject current=null] : iv_ruleIntConstantExpr= ruleIntConstantExpr EOF ;
    public final EObject entryRuleIntConstantExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntConstantExpr = null;


        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4562:2: (iv_ruleIntConstantExpr= ruleIntConstantExpr EOF )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4563:2: iv_ruleIntConstantExpr= ruleIntConstantExpr EOF
            {
             newCompositeNode(grammarAccess.getIntConstantExprRule()); 
            pushFollow(FOLLOW_ruleIntConstantExpr_in_entryRuleIntConstantExpr10161);
            iv_ruleIntConstantExpr=ruleIntConstantExpr();

            state._fsp--;

             current =iv_ruleIntConstantExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntConstantExpr10171); 

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
    // $ANTLR end "entryRuleIntConstantExpr"


    // $ANTLR start "ruleIntConstantExpr"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4570:1: ruleIntConstantExpr returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INTVAL ) ) ) ;
    public final EObject ruleIntConstantExpr() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4573:28: ( ( () ( (lv_value_1_0= RULE_INTVAL ) ) ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4574:1: ( () ( (lv_value_1_0= RULE_INTVAL ) ) )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4574:1: ( () ( (lv_value_1_0= RULE_INTVAL ) ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4574:2: () ( (lv_value_1_0= RULE_INTVAL ) )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4574:2: ()
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4575:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getIntConstantExprAccess().getIntConstantExprAction_0(),
                        current);
                

            }

            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4580:2: ( (lv_value_1_0= RULE_INTVAL ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4581:1: (lv_value_1_0= RULE_INTVAL )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4581:1: (lv_value_1_0= RULE_INTVAL )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4582:3: lv_value_1_0= RULE_INTVAL
            {
            lv_value_1_0=(Token)match(input,RULE_INTVAL,FOLLOW_RULE_INTVAL_in_ruleIntConstantExpr10222); 

            			newLeafNode(lv_value_1_0, grammarAccess.getIntConstantExprAccess().getValueINTVALTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIntConstantExprRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"INTVAL");
            	    

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
    // $ANTLR end "ruleIntConstantExpr"


    // $ANTLR start "entryRuleStringConstantExpr"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4606:1: entryRuleStringConstantExpr returns [EObject current=null] : iv_ruleStringConstantExpr= ruleStringConstantExpr EOF ;
    public final EObject entryRuleStringConstantExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringConstantExpr = null;


        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4607:2: (iv_ruleStringConstantExpr= ruleStringConstantExpr EOF )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4608:2: iv_ruleStringConstantExpr= ruleStringConstantExpr EOF
            {
             newCompositeNode(grammarAccess.getStringConstantExprRule()); 
            pushFollow(FOLLOW_ruleStringConstantExpr_in_entryRuleStringConstantExpr10263);
            iv_ruleStringConstantExpr=ruleStringConstantExpr();

            state._fsp--;

             current =iv_ruleStringConstantExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringConstantExpr10273); 

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
    // $ANTLR end "entryRuleStringConstantExpr"


    // $ANTLR start "ruleStringConstantExpr"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4615:1: ruleStringConstantExpr returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringConstantExpr() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4618:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4619:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4619:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4619:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4619:2: ()
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4620:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStringConstantExprAccess().getStringConstantExprAction_0(),
                        current);
                

            }

            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4625:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4626:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4626:1: (lv_value_1_0= RULE_STRING )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4627:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringConstantExpr10324); 

            			newLeafNode(lv_value_1_0, grammarAccess.getStringConstantExprAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStringConstantExprRule());
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
    // $ANTLR end "ruleStringConstantExpr"


    // $ANTLR start "entryRuleBooleanConstantExpr"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4651:1: entryRuleBooleanConstantExpr returns [EObject current=null] : iv_ruleBooleanConstantExpr= ruleBooleanConstantExpr EOF ;
    public final EObject entryRuleBooleanConstantExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanConstantExpr = null;


        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4652:2: (iv_ruleBooleanConstantExpr= ruleBooleanConstantExpr EOF )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4653:2: iv_ruleBooleanConstantExpr= ruleBooleanConstantExpr EOF
            {
             newCompositeNode(grammarAccess.getBooleanConstantExprRule()); 
            pushFollow(FOLLOW_ruleBooleanConstantExpr_in_entryRuleBooleanConstantExpr10365);
            iv_ruleBooleanConstantExpr=ruleBooleanConstantExpr();

            state._fsp--;

             current =iv_ruleBooleanConstantExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanConstantExpr10375); 

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
    // $ANTLR end "entryRuleBooleanConstantExpr"


    // $ANTLR start "ruleBooleanConstantExpr"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4660:1: ruleBooleanConstantExpr returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_BOOLEAN ) ) ) ;
    public final EObject ruleBooleanConstantExpr() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4663:28: ( ( () ( (lv_value_1_0= RULE_BOOLEAN ) ) ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4664:1: ( () ( (lv_value_1_0= RULE_BOOLEAN ) ) )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4664:1: ( () ( (lv_value_1_0= RULE_BOOLEAN ) ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4664:2: () ( (lv_value_1_0= RULE_BOOLEAN ) )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4664:2: ()
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4665:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBooleanConstantExprAccess().getBooleanConstantExprAction_0(),
                        current);
                

            }

            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4670:2: ( (lv_value_1_0= RULE_BOOLEAN ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4671:1: (lv_value_1_0= RULE_BOOLEAN )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4671:1: (lv_value_1_0= RULE_BOOLEAN )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4672:3: lv_value_1_0= RULE_BOOLEAN
            {
            lv_value_1_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleBooleanConstantExpr10426); 

            			newLeafNode(lv_value_1_0, grammarAccess.getBooleanConstantExprAccess().getValueBOOLEANTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBooleanConstantExprRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"BOOLEAN");
            	    

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
    // $ANTLR end "ruleBooleanConstantExpr"


    // $ANTLR start "entryRuleFloatConstantExpr"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4696:1: entryRuleFloatConstantExpr returns [EObject current=null] : iv_ruleFloatConstantExpr= ruleFloatConstantExpr EOF ;
    public final EObject entryRuleFloatConstantExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatConstantExpr = null;


        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4697:2: (iv_ruleFloatConstantExpr= ruleFloatConstantExpr EOF )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4698:2: iv_ruleFloatConstantExpr= ruleFloatConstantExpr EOF
            {
             newCompositeNode(grammarAccess.getFloatConstantExprRule()); 
            pushFollow(FOLLOW_ruleFloatConstantExpr_in_entryRuleFloatConstantExpr10467);
            iv_ruleFloatConstantExpr=ruleFloatConstantExpr();

            state._fsp--;

             current =iv_ruleFloatConstantExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatConstantExpr10477); 

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
    // $ANTLR end "entryRuleFloatConstantExpr"


    // $ANTLR start "ruleFloatConstantExpr"
    // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4705:1: ruleFloatConstantExpr returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_FLOATVAL ) ) ) ;
    public final EObject ruleFloatConstantExpr() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4708:28: ( ( () ( (lv_value_1_0= RULE_FLOATVAL ) ) ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4709:1: ( () ( (lv_value_1_0= RULE_FLOATVAL ) ) )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4709:1: ( () ( (lv_value_1_0= RULE_FLOATVAL ) ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4709:2: () ( (lv_value_1_0= RULE_FLOATVAL ) )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4709:2: ()
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4710:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFloatConstantExprAccess().getFloatConstantExprAction_0(),
                        current);
                

            }

            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4715:2: ( (lv_value_1_0= RULE_FLOATVAL ) )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4716:1: (lv_value_1_0= RULE_FLOATVAL )
            {
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4716:1: (lv_value_1_0= RULE_FLOATVAL )
            // ../org.jboss.byteman.eclipse.Byteman/src-gen/org/jboss/byteman/eclipse/parser/antlr/internal/InternalByteman.g:4717:3: lv_value_1_0= RULE_FLOATVAL
            {
            lv_value_1_0=(Token)match(input,RULE_FLOATVAL,FOLLOW_RULE_FLOATVAL_in_ruleFloatConstantExpr10528); 

            			newLeafNode(lv_value_1_0, grammarAccess.getFloatConstantExprAccess().getValueFLOATVALTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFloatConstantExprRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"FLOATVAL");
            	    

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
    // $ANTLR end "ruleFloatConstantExpr"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleDomainModel_in_entryRuleDomainModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_ruleDomainModel141 = new BitSet(new long[]{0x1000000000000032L});
    public static final BitSet FOLLOW_RULE_EOL_in_ruleDomainModel158 = new BitSet(new long[]{0x1000000000000032L});
    public static final BitSet FOLLOW_ruleElement_in_entryRuleElement195 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElement205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBytemanRule_in_ruleElement252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHelper_in_ruleElement279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBytemanRule_in_entryRuleBytemanRule314 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBytemanRule324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_START_RULE_in_ruleBytemanRule366 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_RULE_EOL_in_ruleBytemanRule383 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleBytemanRule405 = new BitSet(new long[]{0x0000000001080000L});
    public static final BitSet FOLLOW_ruleBody_in_ruleBytemanRule426 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_END_RULE_in_ruleBytemanRule437 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_EOL_in_ruleBytemanRule447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBody_in_entryRuleBody488 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBody498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBind_in_ruleBody548 = new BitSet(new long[]{0x0000000001080000L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleBody570 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleActions_in_ruleBody591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent631 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventClass_in_ruleEvent688 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_ruleEventInterface_in_ruleEvent715 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_RULE_EOL_in_ruleEvent728 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_ruleEventMethod_in_ruleEvent750 = new BitSet(new long[]{0x7000000000000032L,0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EOL_in_ruleEvent762 = new BitSet(new long[]{0x7000000000000032L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHelper_in_ruleEvent785 = new BitSet(new long[]{0x6000000000000012L,0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EOL_in_ruleEvent797 = new BitSet(new long[]{0x6000000000000012L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocationSpecifier_in_ruleEvent822 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_EOL_in_ruleEvent834 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleEventClass_in_entryRuleEventClass873 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventClass883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KEYWORD_CLASS_in_ruleEventClass925 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEventClass951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventInterface_in_entryRuleEventInterface987 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventInterface997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KEYWORD_INTERFACE_in_ruleEventInterface1039 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEventInterface1065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventMethod_in_entryRuleEventMethod1101 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventMethod1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KEYWORD_METHOD_in_ruleEventMethod1147 = new BitSet(new long[]{0x0000000000001C00L});
    public static final BitSet FOLLOW_ruleMethodName_in_ruleEventMethod1167 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleParameterTypes_in_ruleEventMethod1188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodName_in_entryRuleMethodName1226 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodName1237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMethodName1277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INIT_in_ruleMethodName1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CLINIT_in_ruleMethodName1329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHelper_in_entryRuleHelper1374 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHelper1384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleHelper1430 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleHelper1451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocationSpecifier_in_entryRuleLocationSpecifier1488 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocationSpecifier1498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleLocationSpecifier1536 = new BitSet(new long[]{0xE000000000002000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleAtLocation_in_ruleLocationSpecifier1558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleLocationSpecifier1577 = new BitSet(new long[]{0xE000000000002000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleAfterLocation_in_ruleLocationSpecifier1599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtLine_in_ruleLocationSpecifier1627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtLocation_in_entryRuleAtLocation1662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtLocation1672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtEntry_in_ruleAtLocation1719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtExit_in_ruleAtLocation1746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtLine_in_ruleAtLocation1773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtRead_in_ruleAtLocation1800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtWrite_in_ruleAtLocation1827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtInvoke_in_ruleAtLocation1854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtSynchronize_in_ruleAtLocation1881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtThrow_in_ruleAtLocation1908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAfterLocation_in_entryRuleAfterLocation1943 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAfterLocation1953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAfterRead_in_ruleAfterLocation2000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAfterWrite_in_ruleAfterLocation2027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAfterInvoke_in_ruleAfterLocation2054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAfterSynchronize_in_ruleAfterLocation2081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtThrow_in_ruleAfterLocation2108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtEntry_in_entryRuleAtEntry2143 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtEntry2153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleAtEntry2199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtExit_in_entryRuleAtExit2235 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtExit2245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleAtExit2292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KEYWORD_RETURN_in_ruleAtExit2309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtLine_in_entryRuleAtLine2345 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtLine2355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleAtLine2401 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RULE_INTVAL_in_ruleAtLine2418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtRead_in_entryRuleAtRead2459 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtRead2469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtReadField_in_ruleAtRead2516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtReadLocal_in_ruleAtRead2543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtReadField_in_entryRuleAtReadField2578 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtReadField2588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleAtReadField2634 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAtReadField2655 = new BitSet(new long[]{0x0000000000004002L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleCounter_in_ruleAtReadField2676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtReadLocal_in_entryRuleAtReadLocal2713 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtReadLocal2723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleAtReadLocal2769 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_DOLLAR_in_ruleAtReadLocal2780 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAtReadLocal2796 = new BitSet(new long[]{0x0000000000004002L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleCounter_in_ruleAtReadLocal2822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAfterRead_in_entryRuleAfterRead2859 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAfterRead2869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAfterReadField_in_ruleAfterRead2916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAfterReadLocal_in_ruleAfterRead2943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAfterReadField_in_entryRuleAfterReadField2978 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAfterReadField2988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleAfterReadField3034 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAfterReadField3055 = new BitSet(new long[]{0x0000000000004002L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleCounter_in_ruleAfterReadField3076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAfterReadLocal_in_entryRuleAfterReadLocal3113 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAfterReadLocal3123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleAfterReadLocal3169 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_DOLLAR_in_ruleAfterReadLocal3180 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAfterReadLocal3196 = new BitSet(new long[]{0x0000000000004002L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleCounter_in_ruleAfterReadLocal3222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtWrite_in_entryRuleAtWrite3259 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtWrite3269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtWriteField_in_ruleAtWrite3316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtWriteLocal_in_ruleAtWrite3343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtWriteField_in_entryRuleAtWriteField3378 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtWriteField3388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleAtWriteField3434 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAtWriteField3455 = new BitSet(new long[]{0x0000000000004002L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleCounter_in_ruleAtWriteField3476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtWriteLocal_in_entryRuleAtWriteLocal3513 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtWriteLocal3523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleAtWriteLocal3569 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_DOLLAR_in_ruleAtWriteLocal3580 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAtWriteLocal3596 = new BitSet(new long[]{0x0000000000004002L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleCounter_in_ruleAtWriteLocal3622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAfterWrite_in_entryRuleAfterWrite3659 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAfterWrite3669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAfterWriteField_in_ruleAfterWrite3716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAfterWriteLocal_in_ruleAfterWrite3743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAfterWriteField_in_entryRuleAfterWriteField3778 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAfterWriteField3788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleAfterWriteField3834 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAfterWriteField3855 = new BitSet(new long[]{0x0000000000004002L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleCounter_in_ruleAfterWriteField3876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAfterWriteLocal_in_entryRuleAfterWriteLocal3913 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAfterWriteLocal3923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleAfterWriteLocal3969 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_DOLLAR_in_ruleAfterWriteLocal3980 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAfterWriteLocal3996 = new BitSet(new long[]{0x0000000000004002L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleCounter_in_ruleAfterWriteLocal4022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtInvoke_in_entryRuleAtInvoke4059 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtInvoke4069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleAtInvoke4116 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_69_in_ruleAtInvoke4134 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAtInvoke4156 = new BitSet(new long[]{0x0000000000014002L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleParameterTypes_in_ruleAtInvoke4177 = new BitSet(new long[]{0x0000000000004002L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleCounter_in_ruleAtInvoke4199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAfterInvoke_in_entryRuleAfterInvoke4236 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAfterInvoke4246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleAfterInvoke4293 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_69_in_ruleAfterInvoke4311 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAfterInvoke4333 = new BitSet(new long[]{0x0000000000014002L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleParameterTypes_in_ruleAfterInvoke4354 = new BitSet(new long[]{0x0000000000004002L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleCounter_in_ruleAfterInvoke4376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtSynchronize_in_entryRuleAtSynchronize4413 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtSynchronize4423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleAtSynchronize4469 = new BitSet(new long[]{0x0000000000004002L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleCounter_in_ruleAtSynchronize4490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAfterSynchronize_in_entryRuleAfterSynchronize4527 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAfterSynchronize4537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleAfterSynchronize4583 = new BitSet(new long[]{0x0000000000004002L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleCounter_in_ruleAfterSynchronize4604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtThrow_in_entryRuleAtThrow4641 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtThrow4651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleAtThrow4697 = new BitSet(new long[]{0x0000000000004402L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAtThrow4718 = new BitSet(new long[]{0x0000000000004002L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleCounter_in_ruleAtThrow4740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterTypes_in_entryRuleParameterTypes4777 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterTypes4787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleParameterTypes4823 = new BitSet(new long[]{0x0000000000040400L});
    public static final BitSet FOLLOW_ruleParamTypeName_in_ruleParameterTypes4853 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleParameterTypes4865 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ruleParamTypeName_in_ruleParameterTypes4885 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleParameterTypes4900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParamTypeName_in_entryRuleParamTypeName4936 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParamTypeName4947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleParamTypeName4993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCounter_in_entryRuleCounter5038 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCounter5049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTVAL_in_ruleCounter5089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleCounter5113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBind_in_entryRuleBind5153 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBind5163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KEYWORD_BIND_in_ruleBind5199 = new BitSet(new long[]{0x0000000000100400L});
    public static final BitSet FOLLOW_RULE_NOTHING_in_ruleBind5219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindings_in_ruleBind5245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindings_in_entryRuleBindings5282 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBindings5292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinding_in_ruleBindings5338 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleBindings5350 = new BitSet(new long[]{0x0000000000100400L});
    public static final BitSet FOLLOW_ruleBinding_in_ruleBindings5370 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleBindings5384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinding_in_entryRuleBinding5421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinding5431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindVariable_in_ruleBinding5477 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_RULE_ASSIGN_in_ruleBinding5490 = new BitSet(new long[]{0x000F00480001C400L,0x0000000000003E00L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBinding5510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleBinding5530 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ruleTypeName_in_ruleBinding5550 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_RULE_ASSIGN_in_ruleBinding5563 = new BitSet(new long[]{0x000F00480001C400L,0x0000000000003E00L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBinding5583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindVariable_in_entryRuleBindVariable5624 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBindVariable5635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBindVariable5674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeName_in_entryRuleTypeName5719 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeName5730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTypeName5776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition5820 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondition5830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IF_in_ruleCondition5866 = new BitSet(new long[]{0x000F00480001C400L,0x0000000000003E00L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCondition5887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActions_in_entryRuleActions5922 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActions5932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DO_in_ruleActions5977 = new BitSet(new long[]{0x000F00480411E400L,0x0000000000003E00L});
    public static final BitSet FOLLOW_ruleActionList_in_ruleActions5998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NOTHING_in_ruleActions6015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionList_in_entryRuleActionList6051 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionList6061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_ruleActionList6107 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleActionList6119 = new BitSet(new long[]{0x000F00480401E400L,0x0000000000003E00L});
    public static final BitSet FOLLOW_ruleAction_in_ruleActionList6139 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleActionList6153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction6190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction6200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAction6247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturnExpr_in_ruleAction6274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleThrowExpr_in_ruleAction6301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression6336 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression6346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpr_in_ruleExpression6392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturnExpr_in_entryRuleReturnExpr6426 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReturnExpr6436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KEYWORD_RETURN_in_ruleReturnExpr6478 = new BitSet(new long[]{0x000F00480001C402L,0x0000000000003E00L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReturnExpr6504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleThrowExpr_in_entryRuleThrowExpr6541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleThrowExpr6551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KEYWORD_THROW_in_ruleThrowExpr6593 = new BitSet(new long[]{0x000F00480001C400L,0x0000000000003E00L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleThrowExpr6619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpr_in_entryRuleAssignmentExpr6655 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignmentExpr6665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperatorExpr_in_ruleAssignmentExpr6712 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_RULE_ASSIGN_in_ruleAssignmentExpr6738 = new BitSet(new long[]{0x000F00480001C400L,0x0000000000003E00L});
    public static final BitSet FOLLOW_ruleAssignmentExpr_in_ruleAssignmentExpr6764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperatorExpr_in_entryRuleOperatorExpr6802 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperatorExpr6812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusMinusOperand_in_ruleOperatorExpr6859 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_RULE_PLUS_in_ruleOperatorExpr6887 = new BitSet(new long[]{0x000F00480001C400L,0x0000000000003E00L});
    public static final BitSet FOLLOW_RULE_MINUS_in_ruleOperatorExpr6907 = new BitSet(new long[]{0x000F00480001C400L,0x0000000000003E00L});
    public static final BitSet FOLLOW_rulePlusMinusOperand_in_ruleOperatorExpr6936 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_rulePlusMinusOperand_in_entryRulePlusMinusOperand6974 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlusMinusOperand6984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimesDivOperand_in_rulePlusMinusOperand7031 = new BitSet(new long[]{0x00000000E0000002L});
    public static final BitSet FOLLOW_RULE_TIMES_in_rulePlusMinusOperand7059 = new BitSet(new long[]{0x000F00480001C400L,0x0000000000003E00L});
    public static final BitSet FOLLOW_RULE_DIV_in_rulePlusMinusOperand7079 = new BitSet(new long[]{0x000F00480001C400L,0x0000000000003E00L});
    public static final BitSet FOLLOW_RULE_MOD_in_rulePlusMinusOperand7099 = new BitSet(new long[]{0x000F00480001C400L,0x0000000000003E00L});
    public static final BitSet FOLLOW_ruleTimesDivOperand_in_rulePlusMinusOperand7128 = new BitSet(new long[]{0x00000000E0000002L});
    public static final BitSet FOLLOW_ruleTimesDivOperand_in_entryRuleTimesDivOperand7166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimesDivOperand7176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseOperand_in_ruleTimesDivOperand7224 = new BitSet(new long[]{0x0000000700000002L});
    public static final BitSet FOLLOW_RULE_BAND_in_ruleTimesDivOperand7252 = new BitSet(new long[]{0x000F00400001C400L,0x0000000000003E00L});
    public static final BitSet FOLLOW_RULE_BOR_in_ruleTimesDivOperand7272 = new BitSet(new long[]{0x000F00400001C400L,0x0000000000003E00L});
    public static final BitSet FOLLOW_RULE_BXOR_in_ruleTimesDivOperand7292 = new BitSet(new long[]{0x000F00400001C400L,0x0000000000003E00L});
    public static final BitSet FOLLOW_ruleBitwiseOperand_in_ruleTimesDivOperand7321 = new BitSet(new long[]{0x0000000700000002L});
    public static final BitSet FOLLOW_RULE_BNOT_in_ruleTimesDivOperand7348 = new BitSet(new long[]{0x000F00400001C400L,0x0000000000003E00L});
    public static final BitSet FOLLOW_ruleBitwiseOperand_in_ruleTimesDivOperand7374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBitwiseOperand_in_entryRuleBitwiseOperand7411 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBitwiseOperand7421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOperand_in_ruleBitwiseOperand7469 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_ruleNotOperand_in_ruleBitwiseOperand7496 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_RULE_OR_in_ruleBitwiseOperand7525 = new BitSet(new long[]{0x000F00400001C400L,0x0000000000003E00L});
    public static final BitSet FOLLOW_RULE_AND_in_ruleBitwiseOperand7545 = new BitSet(new long[]{0x000F00400001C400L,0x0000000000003E00L});
    public static final BitSet FOLLOW_ruleNotOperand_in_ruleBitwiseOperand7576 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_ruleLogicalOperand_in_ruleBitwiseOperand7595 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_ruleNotOperand_in_entryRuleNotOperand7636 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotOperand7646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NOT_in_ruleNotOperand7688 = new BitSet(new long[]{0x000F00000001C400L,0x0000000000003E00L});
    public static final BitSet FOLLOW_ruleLogicalOperand_in_ruleNotOperand7714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOperand_in_entryRuleLogicalOperand7750 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalOperand7760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparisonOperand_in_ruleLogicalOperand7807 = new BitSet(new long[]{0x00001F8000000002L});
    public static final BitSet FOLLOW_RULE_EQ_in_ruleLogicalOperand7835 = new BitSet(new long[]{0x000F00000001C400L,0x0000000000003E00L});
    public static final BitSet FOLLOW_RULE_GT_in_ruleLogicalOperand7855 = new BitSet(new long[]{0x000F00000001C400L,0x0000000000003E00L});
    public static final BitSet FOLLOW_RULE_GE_in_ruleLogicalOperand7875 = new BitSet(new long[]{0x000F00000001C400L,0x0000000000003E00L});
    public static final BitSet FOLLOW_RULE_LE_in_ruleLogicalOperand7895 = new BitSet(new long[]{0x000F00000001C400L,0x0000000000003E00L});
    public static final BitSet FOLLOW_RULE_LT_in_ruleLogicalOperand7915 = new BitSet(new long[]{0x000F00000001C400L,0x0000000000003E00L});
    public static final BitSet FOLLOW_RULE_NE_in_ruleLogicalOperand7935 = new BitSet(new long[]{0x000F00000001C400L,0x0000000000003E00L});
    public static final BitSet FOLLOW_ruleComparisonOperand_in_ruleLogicalOperand7964 = new BitSet(new long[]{0x00001F8000000002L});
    public static final BitSet FOLLOW_ruleComparisonOperand_in_entryRuleComparisonOperand8002 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparisonOperand8012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAccessExpr_in_ruleComparisonOperand8058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAccessExpr_in_entryRuleAccessExpr8092 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAccessExpr8102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAccessBaseExpr_in_ruleAccessExpr8149 = new BitSet(new long[]{0x0000A00000000002L});
    public static final BitSet FOLLOW_RULE_LSQUARE_in_ruleAccessExpr8176 = new BitSet(new long[]{0x000F00480001C400L,0x0000000000003E00L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAccessExpr8202 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_RULE_RSQUARE_in_ruleAccessExpr8213 = new BitSet(new long[]{0x0000A00000000002L});
    public static final BitSet FOLLOW_RULE_DOT_in_ruleAccessExpr8246 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAccessExpr8268 = new BitSet(new long[]{0x0000A00000010002L});
    public static final BitSet FOLLOW_ruleCallArguments_in_ruleAccessExpr8294 = new BitSet(new long[]{0x0000A00000000002L});
    public static final BitSet FOLLOW_ruleAccessBaseExpr_in_entryRuleAccessBaseExpr8334 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAccessBaseExpr8344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltinExpr_in_ruleAccessBaseExpr8391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleExpr_in_ruleAccessBaseExpr8418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltinExpr_in_entryRuleBuiltinExpr8453 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBuiltinExpr8463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBuiltinExpr8514 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleCallArguments_in_ruleBuiltinExpr8540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleExpr_in_entryRuleSimpleExpr8576 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleExpr8586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableExpr_in_ruleSimpleExpr8633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantExpr_in_ruleSimpleExpr8660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBracketedExpr_in_ruleSimpleExpr8687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNewExpr_in_ruleSimpleExpr8714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNewExpr_in_entryRuleNewExpr8749 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNewExpr8759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NEW_in_ruleNewExpr8810 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleNewExpr8836 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleCallArguments_in_ruleNewExpr8857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableExpr_in_entryRuleVariableExpr8893 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableExpr8903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleName_in_ruleVariableExpr8950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndexedSpecialVar_in_ruleVariableExpr8977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialVar_in_ruleVariableExpr9004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCallArguments_in_entryRuleCallArguments9039 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCallArguments9049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleCallArguments9085 = new BitSet(new long[]{0x000F00480005C400L,0x0000000000003E00L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCallArguments9115 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleCallArguments9127 = new BitSet(new long[]{0x000F00480001C400L,0x0000000000003E00L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCallArguments9147 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleCallArguments9162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName9198 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName9209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName9249 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_RULE_DOT_in_ruleQualifiedName9270 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName9290 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_ruleSimpleName_in_entryRuleSimpleName9337 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleName9347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSimpleName9398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndexedSpecialVar_in_entryRuleIndexedSpecialVar9439 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIndexedSpecialVar9449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOLLAR_in_ruleIndexedSpecialVar9500 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RULE_INTVAL_in_ruleIndexedSpecialVar9522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialVar_in_entryRuleSpecialVar9563 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpecialVar9573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleSpecialVar9626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleSpecialVar9663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleSpecialVar9700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleSpecialVar9737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleSpecialVar9774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOLLAR_in_ruleSpecialVar9811 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSpecialVar9833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBracketedExpr_in_entryRuleBracketedExpr9876 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBracketedExpr9886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleBracketedExpr9922 = new BitSet(new long[]{0x000F00480001C400L,0x0000000000003E00L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBracketedExpr9943 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleBracketedExpr9953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantExpr_in_entryRuleConstantExpr9988 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantExpr9998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntConstantExpr_in_ruleConstantExpr10045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringConstantExpr_in_ruleConstantExpr10072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanConstantExpr_in_ruleConstantExpr10099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatConstantExpr_in_ruleConstantExpr10126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntConstantExpr_in_entryRuleIntConstantExpr10161 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntConstantExpr10171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTVAL_in_ruleIntConstantExpr10222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringConstantExpr_in_entryRuleStringConstantExpr10263 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringConstantExpr10273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringConstantExpr10324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanConstantExpr_in_entryRuleBooleanConstantExpr10365 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanConstantExpr10375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleBooleanConstantExpr10426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatConstantExpr_in_entryRuleFloatConstantExpr10467 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatConstantExpr10477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOATVAL_in_ruleFloatConstantExpr10528 = new BitSet(new long[]{0x0000000000000002L});

}