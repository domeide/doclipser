package com.zenika.docker.dsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.zenika.docker.dsl.services.DockerfileDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDockerfileDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_TAG_ID", "RULE_SL_COMMENT", "RULE_INT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'CMD'", "'['", "','", "']'", "'FROM'"
    };
    public static final int RULE_TAG_ID=6;
    public static final int RULE_ID=5;
    public static final int RULE_WS=10;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_SL_COMMENT=7;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_INT=8;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalDockerfileDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDockerfileDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDockerfileDslParser.tokenNames; }
    public String getGrammarFileName() { return "../com.zenika.docker.dsl/src-gen/com/zenika/docker/dsl/parser/antlr/internal/InternalDockerfileDsl.g"; }



     	private DockerfileDslGrammarAccess grammarAccess;
     	
        public InternalDockerfileDslParser(TokenStream input, DockerfileDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Dockerfile";	
       	}
       	
       	@Override
       	protected DockerfileDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleDockerfile"
    // ../com.zenika.docker.dsl/src-gen/com/zenika/docker/dsl/parser/antlr/internal/InternalDockerfileDsl.g:67:1: entryRuleDockerfile returns [EObject current=null] : iv_ruleDockerfile= ruleDockerfile EOF ;
    public final EObject entryRuleDockerfile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDockerfile = null;


        try {
            // ../com.zenika.docker.dsl/src-gen/com/zenika/docker/dsl/parser/antlr/internal/InternalDockerfileDsl.g:68:2: (iv_ruleDockerfile= ruleDockerfile EOF )
            // ../com.zenika.docker.dsl/src-gen/com/zenika/docker/dsl/parser/antlr/internal/InternalDockerfileDsl.g:69:2: iv_ruleDockerfile= ruleDockerfile EOF
            {
             newCompositeNode(grammarAccess.getDockerfileRule()); 
            pushFollow(FOLLOW_ruleDockerfile_in_entryRuleDockerfile75);
            iv_ruleDockerfile=ruleDockerfile();

            state._fsp--;

             current =iv_ruleDockerfile; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDockerfile85); 

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
    // $ANTLR end "entryRuleDockerfile"


    // $ANTLR start "ruleDockerfile"
    // ../com.zenika.docker.dsl/src-gen/com/zenika/docker/dsl/parser/antlr/internal/InternalDockerfileDsl.g:76:1: ruleDockerfile returns [EObject current=null] : ( (lv_instructions_0_0= ruleInstruction ) )* ;
    public final EObject ruleDockerfile() throws RecognitionException {
        EObject current = null;

        EObject lv_instructions_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.zenika.docker.dsl/src-gen/com/zenika/docker/dsl/parser/antlr/internal/InternalDockerfileDsl.g:79:28: ( ( (lv_instructions_0_0= ruleInstruction ) )* )
            // ../com.zenika.docker.dsl/src-gen/com/zenika/docker/dsl/parser/antlr/internal/InternalDockerfileDsl.g:80:1: ( (lv_instructions_0_0= ruleInstruction ) )*
            {
            // ../com.zenika.docker.dsl/src-gen/com/zenika/docker/dsl/parser/antlr/internal/InternalDockerfileDsl.g:80:1: ( (lv_instructions_0_0= ruleInstruction ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12||LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.zenika.docker.dsl/src-gen/com/zenika/docker/dsl/parser/antlr/internal/InternalDockerfileDsl.g:81:1: (lv_instructions_0_0= ruleInstruction )
            	    {
            	    // ../com.zenika.docker.dsl/src-gen/com/zenika/docker/dsl/parser/antlr/internal/InternalDockerfileDsl.g:81:1: (lv_instructions_0_0= ruleInstruction )
            	    // ../com.zenika.docker.dsl/src-gen/com/zenika/docker/dsl/parser/antlr/internal/InternalDockerfileDsl.g:82:3: lv_instructions_0_0= ruleInstruction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDockerfileAccess().getInstructionsInstructionParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInstruction_in_ruleDockerfile130);
            	    lv_instructions_0_0=ruleInstruction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDockerfileRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"instructions",
            	            		lv_instructions_0_0, 
            	            		"Instruction");
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
    // $ANTLR end "ruleDockerfile"


    // $ANTLR start "entryRuleInstruction"
    // ../com.zenika.docker.dsl/src-gen/com/zenika/docker/dsl/parser/antlr/internal/InternalDockerfileDsl.g:106:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // ../com.zenika.docker.dsl/src-gen/com/zenika/docker/dsl/parser/antlr/internal/InternalDockerfileDsl.g:107:2: (iv_ruleInstruction= ruleInstruction EOF )
            // ../com.zenika.docker.dsl/src-gen/com/zenika/docker/dsl/parser/antlr/internal/InternalDockerfileDsl.g:108:2: iv_ruleInstruction= ruleInstruction EOF
            {
             newCompositeNode(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_ruleInstruction_in_entryRuleInstruction166);
            iv_ruleInstruction=ruleInstruction();

            state._fsp--;

             current =iv_ruleInstruction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstruction176); 

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
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // ../com.zenika.docker.dsl/src-gen/com/zenika/docker/dsl/parser/antlr/internal/InternalDockerfileDsl.g:115:1: ruleInstruction returns [EObject current=null] : (this_From_0= ruleFrom | this_Cmd_1= ruleCmd ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        EObject this_From_0 = null;

        EObject this_Cmd_1 = null;


         enterRule(); 
            
        try {
            // ../com.zenika.docker.dsl/src-gen/com/zenika/docker/dsl/parser/antlr/internal/InternalDockerfileDsl.g:118:28: ( (this_From_0= ruleFrom | this_Cmd_1= ruleCmd ) )
            // ../com.zenika.docker.dsl/src-gen/com/zenika/docker/dsl/parser/antlr/internal/InternalDockerfileDsl.g:119:1: (this_From_0= ruleFrom | this_Cmd_1= ruleCmd )
            {
            // ../com.zenika.docker.dsl/src-gen/com/zenika/docker/dsl/parser/antlr/internal/InternalDockerfileDsl.g:119:1: (this_From_0= ruleFrom | this_Cmd_1= ruleCmd )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../com.zenika.docker.dsl/src-gen/com/zenika/docker/dsl/parser/antlr/internal/InternalDockerfileDsl.g:120:5: this_From_0= ruleFrom
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getFromParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleFrom_in_ruleInstruction223);
                    this_From_0=ruleFrom();

                    state._fsp--;

                     
                            current = this_From_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.zenika.docker.dsl/src-gen/com/zenika/docker/dsl/parser/antlr/internal/InternalDockerfileDsl.g:130:5: this_Cmd_1= ruleCmd
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getCmdParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleCmd_in_ruleInstruction250);
                    this_Cmd_1=ruleCmd();

                    state._fsp--;

                     
                            current = this_Cmd_1; 
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
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleCmd"
    // ../com.zenika.docker.dsl/src-gen/com/zenika/docker/dsl/parser/antlr/internal/InternalDockerfileDsl.g:146:1: entryRuleCmd returns [EObject current=null] : iv_ruleCmd= ruleCmd EOF ;
    public final EObject entryRuleCmd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCmd = null;


        try {
            // ../com.zenika.docker.dsl/src-gen/com/zenika/docker/dsl/parser/antlr/internal/InternalDockerfileDsl.g:147:2: (iv_ruleCmd= ruleCmd EOF )
            // ../com.zenika.docker.dsl/src-gen/com/zenika/docker/dsl/parser/antlr/internal/InternalDockerfileDsl.g:148:2: iv_ruleCmd= ruleCmd EOF
            {
             newCompositeNode(grammarAccess.getCmdRule()); 
            pushFollow(FOLLOW_ruleCmd_in_entryRuleCmd285);
            iv_ruleCmd=ruleCmd();

            state._fsp--;

             current =iv_ruleCmd; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCmd295); 

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
    // $ANTLR end "entryRuleCmd"


    // $ANTLR start "ruleCmd"
    // ../com.zenika.docker.dsl/src-gen/com/zenika/docker/dsl/parser/antlr/internal/InternalDockerfileDsl.g:155:1: ruleCmd returns [EObject current=null] : ( () otherlv_1= 'CMD' otherlv_2= '[' ( (lv_executable_3_0= RULE_STRING ) )? ( (lv_params_4_0= RULE_STRING ) )? (otherlv_5= ',' ( (lv_params_6_0= RULE_STRING ) ) )* otherlv_7= ']' ) ;
    public final EObject ruleCmd() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_executable_3_0=null;
        Token lv_params_4_0=null;
        Token otherlv_5=null;
        Token lv_params_6_0=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../com.zenika.docker.dsl/src-gen/com/zenika/docker/dsl/parser/antlr/internal/InternalDockerfileDsl.g:158:28: ( ( () otherlv_1= 'CMD' otherlv_2= '[' ( (lv_executable_3_0= RULE_STRING ) )? ( (lv_params_4_0= RULE_STRING ) )? (otherlv_5= ',' ( (lv_params_6_0= RULE_STRING ) ) )* otherlv_7= ']' ) )
            // ../com.zenika.docker.dsl/src-gen/com/zenika/docker/dsl/parser/antlr/internal/InternalDockerfileDsl.g:159:1: ( () otherlv_1= 'CMD' otherlv_2= '[' ( (lv_executable_3_0= RULE_STRING ) )? ( (lv_params_4_0= RULE_STRING ) )? (otherlv_5= ',' ( (lv_params_6_0= RULE_STRING ) ) )* otherlv_7= ']' )
            {
            // ../com.zenika.docker.dsl/src-gen/com/zenika/docker/dsl/parser/antlr/internal/InternalDockerfileDsl.g:159:1: ( () otherlv_1= 'CMD' otherlv_2= '[' ( (lv_executable_3_0= RULE_STRING ) )? ( (lv_params_4_0= RULE_STRING ) )? (otherlv_5= ',' ( (lv_params_6_0= RULE_STRING ) ) )* otherlv_7= ']' )
            // ../com.zenika.docker.dsl/src-gen/com/zenika/docker/dsl/parser/antlr/internal/InternalDockerfileDsl.g:159:2: () otherlv_1= 'CMD' otherlv_2= '[' ( (lv_executable_3_0= RULE_STRING ) )? ( (lv_params_4_0= RULE_STRING ) )? (otherlv_5= ',' ( (lv_params_6_0= RULE_STRING ) ) )* otherlv_7= ']'
            {
            // ../com.zenika.docker.dsl/src-gen/com/zenika/docker/dsl/parser/antlr/internal/InternalDockerfileDsl.g:159:2: ()
            // ../com.zenika.docker.dsl/src-gen/com/zenika/docker/dsl/parser/antlr/internal/InternalDockerfileDsl.g:160:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCmdAccess().getCmdAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleCmd341); 

                	newLeafNode(otherlv_1, grammarAccess.getCmdAccess().getCMDKeyword_1());
                
            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleCmd353); 

                	newLeafNode(otherlv_2, grammarAccess.getCmdAccess().getLeftSquareBracketKeyword_2());
                
            // ../com.zenika.docker.dsl/src-gen/com/zenika/docker/dsl/parser/antlr/internal/InternalDockerfileDsl.g:173:1: ( (lv_executable_3_0= RULE_STRING ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../com.zenika.docker.dsl/src-gen/com/zenika/docker/dsl/parser/antlr/internal/InternalDockerfileDsl.g:174:1: (lv_executable_3_0= RULE_STRING )
                    {
                    // ../com.zenika.docker.dsl/src-gen/com/zenika/docker/dsl/parser/antlr/internal/InternalDockerfileDsl.g:174:1: (lv_executable_3_0= RULE_STRING )
                    // ../com.zenika.docker.dsl/src-gen/com/zenika/docker/dsl/parser/antlr/internal/InternalDockerfileDsl.g:175:3: lv_executable_3_0= RULE_STRING
                    {
                    lv_executable_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCmd370); 

                    			newLeafNode(lv_executable_3_0, grammarAccess.getCmdAccess().getExecutableSTRINGTerminalRuleCall_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCmdRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"executable",
                            		lv_executable_3_0, 
                            		"STRING");
                    	    

                    }


                    }
                    break;

            }

            // ../com.zenika.docker.dsl/src-gen/com/zenika/docker/dsl/parser/antlr/internal/InternalDockerfileDsl.g:191:3: ( (lv_params_4_0= RULE_STRING ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../com.zenika.docker.dsl/src-gen/com/zenika/docker/dsl/parser/antlr/internal/InternalDockerfileDsl.g:192:1: (lv_params_4_0= RULE_STRING )
                    {
                    // ../com.zenika.docker.dsl/src-gen/com/zenika/docker/dsl/parser/antlr/internal/InternalDockerfileDsl.g:192:1: (lv_params_4_0= RULE_STRING )
                    // ../com.zenika.docker.dsl/src-gen/com/zenika/docker/dsl/parser/antlr/internal/InternalDockerfileDsl.g:193:3: lv_params_4_0= RULE_STRING
                    {
                    lv_params_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCmd393); 

                    			newLeafNode(lv_params_4_0, grammarAccess.getCmdAccess().getParamsSTRINGTerminalRuleCall_4_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCmdRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"params",
                            		lv_params_4_0, 
                            		"STRING");
                    	    

                    }


                    }
                    break;

            }

            // ../com.zenika.docker.dsl/src-gen/com/zenika/docker/dsl/parser/antlr/internal/InternalDockerfileDsl.g:209:3: (otherlv_5= ',' ( (lv_params_6_0= RULE_STRING ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../com.zenika.docker.dsl/src-gen/com/zenika/docker/dsl/parser/antlr/internal/InternalDockerfileDsl.g:209:5: otherlv_5= ',' ( (lv_params_6_0= RULE_STRING ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleCmd412); 

            	        	newLeafNode(otherlv_5, grammarAccess.getCmdAccess().getCommaKeyword_5_0());
            	        
            	    // ../com.zenika.docker.dsl/src-gen/com/zenika/docker/dsl/parser/antlr/internal/InternalDockerfileDsl.g:213:1: ( (lv_params_6_0= RULE_STRING ) )
            	    // ../com.zenika.docker.dsl/src-gen/com/zenika/docker/dsl/parser/antlr/internal/InternalDockerfileDsl.g:214:1: (lv_params_6_0= RULE_STRING )
            	    {
            	    // ../com.zenika.docker.dsl/src-gen/com/zenika/docker/dsl/parser/antlr/internal/InternalDockerfileDsl.g:214:1: (lv_params_6_0= RULE_STRING )
            	    // ../com.zenika.docker.dsl/src-gen/com/zenika/docker/dsl/parser/antlr/internal/InternalDockerfileDsl.g:215:3: lv_params_6_0= RULE_STRING
            	    {
            	    lv_params_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCmd429); 

            	    			newLeafNode(lv_params_6_0, grammarAccess.getCmdAccess().getParamsSTRINGTerminalRuleCall_5_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getCmdRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"params",
            	            		lv_params_6_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleCmd448); 

                	newLeafNode(otherlv_7, grammarAccess.getCmdAccess().getRightSquareBracketKeyword_6());
                

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
    // $ANTLR end "ruleCmd"


    // $ANTLR start "entryRuleFrom"
    // ../com.zenika.docker.dsl/src-gen/com/zenika/docker/dsl/parser/antlr/internal/InternalDockerfileDsl.g:243:1: entryRuleFrom returns [EObject current=null] : iv_ruleFrom= ruleFrom EOF ;
    public final EObject entryRuleFrom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFrom = null;


        try {
            // ../com.zenika.docker.dsl/src-gen/com/zenika/docker/dsl/parser/antlr/internal/InternalDockerfileDsl.g:244:2: (iv_ruleFrom= ruleFrom EOF )
            // ../com.zenika.docker.dsl/src-gen/com/zenika/docker/dsl/parser/antlr/internal/InternalDockerfileDsl.g:245:2: iv_ruleFrom= ruleFrom EOF
            {
             newCompositeNode(grammarAccess.getFromRule()); 
            pushFollow(FOLLOW_ruleFrom_in_entryRuleFrom484);
            iv_ruleFrom=ruleFrom();

            state._fsp--;

             current =iv_ruleFrom; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFrom494); 

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
    // $ANTLR end "entryRuleFrom"


    // $ANTLR start "ruleFrom"
    // ../com.zenika.docker.dsl/src-gen/com/zenika/docker/dsl/parser/antlr/internal/InternalDockerfileDsl.g:252:1: ruleFrom returns [EObject current=null] : (otherlv_0= 'FROM' ( (lv_name_1_0= RULE_ID ) ) ( (lv_tag_2_0= RULE_TAG_ID ) )? ) ;
    public final EObject ruleFrom() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_tag_2_0=null;

         enterRule(); 
            
        try {
            // ../com.zenika.docker.dsl/src-gen/com/zenika/docker/dsl/parser/antlr/internal/InternalDockerfileDsl.g:255:28: ( (otherlv_0= 'FROM' ( (lv_name_1_0= RULE_ID ) ) ( (lv_tag_2_0= RULE_TAG_ID ) )? ) )
            // ../com.zenika.docker.dsl/src-gen/com/zenika/docker/dsl/parser/antlr/internal/InternalDockerfileDsl.g:256:1: (otherlv_0= 'FROM' ( (lv_name_1_0= RULE_ID ) ) ( (lv_tag_2_0= RULE_TAG_ID ) )? )
            {
            // ../com.zenika.docker.dsl/src-gen/com/zenika/docker/dsl/parser/antlr/internal/InternalDockerfileDsl.g:256:1: (otherlv_0= 'FROM' ( (lv_name_1_0= RULE_ID ) ) ( (lv_tag_2_0= RULE_TAG_ID ) )? )
            // ../com.zenika.docker.dsl/src-gen/com/zenika/docker/dsl/parser/antlr/internal/InternalDockerfileDsl.g:256:3: otherlv_0= 'FROM' ( (lv_name_1_0= RULE_ID ) ) ( (lv_tag_2_0= RULE_TAG_ID ) )?
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleFrom531); 

                	newLeafNode(otherlv_0, grammarAccess.getFromAccess().getFROMKeyword_0());
                
            // ../com.zenika.docker.dsl/src-gen/com/zenika/docker/dsl/parser/antlr/internal/InternalDockerfileDsl.g:260:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.zenika.docker.dsl/src-gen/com/zenika/docker/dsl/parser/antlr/internal/InternalDockerfileDsl.g:261:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.zenika.docker.dsl/src-gen/com/zenika/docker/dsl/parser/antlr/internal/InternalDockerfileDsl.g:261:1: (lv_name_1_0= RULE_ID )
            // ../com.zenika.docker.dsl/src-gen/com/zenika/docker/dsl/parser/antlr/internal/InternalDockerfileDsl.g:262:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFrom548); 

            			newLeafNode(lv_name_1_0, grammarAccess.getFromAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFromRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../com.zenika.docker.dsl/src-gen/com/zenika/docker/dsl/parser/antlr/internal/InternalDockerfileDsl.g:278:2: ( (lv_tag_2_0= RULE_TAG_ID ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_TAG_ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../com.zenika.docker.dsl/src-gen/com/zenika/docker/dsl/parser/antlr/internal/InternalDockerfileDsl.g:279:1: (lv_tag_2_0= RULE_TAG_ID )
                    {
                    // ../com.zenika.docker.dsl/src-gen/com/zenika/docker/dsl/parser/antlr/internal/InternalDockerfileDsl.g:279:1: (lv_tag_2_0= RULE_TAG_ID )
                    // ../com.zenika.docker.dsl/src-gen/com/zenika/docker/dsl/parser/antlr/internal/InternalDockerfileDsl.g:280:3: lv_tag_2_0= RULE_TAG_ID
                    {
                    lv_tag_2_0=(Token)match(input,RULE_TAG_ID,FOLLOW_RULE_TAG_ID_in_ruleFrom570); 

                    			newLeafNode(lv_tag_2_0, grammarAccess.getFromAccess().getTagTAG_IDTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFromRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"tag",
                            		lv_tag_2_0, 
                            		"TAG_ID");
                    	    

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
    // $ANTLR end "ruleFrom"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleDockerfile_in_entryRuleDockerfile75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDockerfile85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleDockerfile130 = new BitSet(new long[]{0x0000000000011002L});
    public static final BitSet FOLLOW_ruleInstruction_in_entryRuleInstruction166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstruction176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFrom_in_ruleInstruction223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCmd_in_ruleInstruction250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCmd_in_entryRuleCmd285 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCmd295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleCmd341 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleCmd353 = new BitSet(new long[]{0x000000000000C010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCmd370 = new BitSet(new long[]{0x000000000000C010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCmd393 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleCmd412 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCmd429 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_15_in_ruleCmd448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFrom_in_entryRuleFrom484 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFrom494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleFrom531 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFrom548 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_TAG_ID_in_ruleFrom570 = new BitSet(new long[]{0x0000000000000002L});

}