package com.zenika.docker.dsl.ui.contentassist.antlr.internal; 

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
import com.zenika.docker.dsl.services.DockerfileDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDockerfileDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_TAG_ID", "RULE_SL_COMMENT", "RULE_INT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'CMD'", "'['", "']'", "','", "'FROM'"
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
    public String getGrammarFileName() { return "../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g"; }


     
     	private DockerfileDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(DockerfileDslGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleDockerfile"
    // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:60:1: entryRuleDockerfile : ruleDockerfile EOF ;
    public final void entryRuleDockerfile() throws RecognitionException {
        try {
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:61:1: ( ruleDockerfile EOF )
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:62:1: ruleDockerfile EOF
            {
             before(grammarAccess.getDockerfileRule()); 
            pushFollow(FOLLOW_ruleDockerfile_in_entryRuleDockerfile61);
            ruleDockerfile();

            state._fsp--;

             after(grammarAccess.getDockerfileRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDockerfile68); 

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
    // $ANTLR end "entryRuleDockerfile"


    // $ANTLR start "ruleDockerfile"
    // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:69:1: ruleDockerfile : ( ( rule__Dockerfile__InstructionsAssignment )* ) ;
    public final void ruleDockerfile() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:73:2: ( ( ( rule__Dockerfile__InstructionsAssignment )* ) )
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:74:1: ( ( rule__Dockerfile__InstructionsAssignment )* )
            {
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:74:1: ( ( rule__Dockerfile__InstructionsAssignment )* )
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:75:1: ( rule__Dockerfile__InstructionsAssignment )*
            {
             before(grammarAccess.getDockerfileAccess().getInstructionsAssignment()); 
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:76:1: ( rule__Dockerfile__InstructionsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12||LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:76:2: rule__Dockerfile__InstructionsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Dockerfile__InstructionsAssignment_in_ruleDockerfile94);
            	    rule__Dockerfile__InstructionsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getDockerfileAccess().getInstructionsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDockerfile"


    // $ANTLR start "entryRuleInstruction"
    // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:88:1: entryRuleInstruction : ruleInstruction EOF ;
    public final void entryRuleInstruction() throws RecognitionException {
        try {
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:89:1: ( ruleInstruction EOF )
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:90:1: ruleInstruction EOF
            {
             before(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_ruleInstruction_in_entryRuleInstruction122);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getInstructionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstruction129); 

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
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:97:1: ruleInstruction : ( ( rule__Instruction__Alternatives ) ) ;
    public final void ruleInstruction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:101:2: ( ( ( rule__Instruction__Alternatives ) ) )
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:102:1: ( ( rule__Instruction__Alternatives ) )
            {
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:102:1: ( ( rule__Instruction__Alternatives ) )
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:103:1: ( rule__Instruction__Alternatives )
            {
             before(grammarAccess.getInstructionAccess().getAlternatives()); 
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:104:1: ( rule__Instruction__Alternatives )
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:104:2: rule__Instruction__Alternatives
            {
            pushFollow(FOLLOW_rule__Instruction__Alternatives_in_ruleInstruction155);
            rule__Instruction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInstructionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleCmd"
    // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:116:1: entryRuleCmd : ruleCmd EOF ;
    public final void entryRuleCmd() throws RecognitionException {
        try {
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:117:1: ( ruleCmd EOF )
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:118:1: ruleCmd EOF
            {
             before(grammarAccess.getCmdRule()); 
            pushFollow(FOLLOW_ruleCmd_in_entryRuleCmd182);
            ruleCmd();

            state._fsp--;

             after(grammarAccess.getCmdRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCmd189); 

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
    // $ANTLR end "entryRuleCmd"


    // $ANTLR start "ruleCmd"
    // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:125:1: ruleCmd : ( ( rule__Cmd__Group__0 ) ) ;
    public final void ruleCmd() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:129:2: ( ( ( rule__Cmd__Group__0 ) ) )
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:130:1: ( ( rule__Cmd__Group__0 ) )
            {
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:130:1: ( ( rule__Cmd__Group__0 ) )
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:131:1: ( rule__Cmd__Group__0 )
            {
             before(grammarAccess.getCmdAccess().getGroup()); 
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:132:1: ( rule__Cmd__Group__0 )
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:132:2: rule__Cmd__Group__0
            {
            pushFollow(FOLLOW_rule__Cmd__Group__0_in_ruleCmd215);
            rule__Cmd__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCmdAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCmd"


    // $ANTLR start "entryRuleFrom"
    // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:144:1: entryRuleFrom : ruleFrom EOF ;
    public final void entryRuleFrom() throws RecognitionException {
        try {
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:145:1: ( ruleFrom EOF )
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:146:1: ruleFrom EOF
            {
             before(grammarAccess.getFromRule()); 
            pushFollow(FOLLOW_ruleFrom_in_entryRuleFrom242);
            ruleFrom();

            state._fsp--;

             after(grammarAccess.getFromRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFrom249); 

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
    // $ANTLR end "entryRuleFrom"


    // $ANTLR start "ruleFrom"
    // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:153:1: ruleFrom : ( ( rule__From__Group__0 ) ) ;
    public final void ruleFrom() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:157:2: ( ( ( rule__From__Group__0 ) ) )
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:158:1: ( ( rule__From__Group__0 ) )
            {
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:158:1: ( ( rule__From__Group__0 ) )
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:159:1: ( rule__From__Group__0 )
            {
             before(grammarAccess.getFromAccess().getGroup()); 
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:160:1: ( rule__From__Group__0 )
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:160:2: rule__From__Group__0
            {
            pushFollow(FOLLOW_rule__From__Group__0_in_ruleFrom275);
            rule__From__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFromAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFrom"


    // $ANTLR start "rule__Instruction__Alternatives"
    // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:172:1: rule__Instruction__Alternatives : ( ( ruleFrom ) | ( ruleCmd ) );
    public final void rule__Instruction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:176:1: ( ( ruleFrom ) | ( ruleCmd ) )
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
                    // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:177:1: ( ruleFrom )
                    {
                    // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:177:1: ( ruleFrom )
                    // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:178:1: ruleFrom
                    {
                     before(grammarAccess.getInstructionAccess().getFromParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleFrom_in_rule__Instruction__Alternatives311);
                    ruleFrom();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getFromParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:183:6: ( ruleCmd )
                    {
                    // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:183:6: ( ruleCmd )
                    // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:184:1: ruleCmd
                    {
                     before(grammarAccess.getInstructionAccess().getCmdParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleCmd_in_rule__Instruction__Alternatives328);
                    ruleCmd();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getCmdParserRuleCall_1()); 

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
    // $ANTLR end "rule__Instruction__Alternatives"


    // $ANTLR start "rule__Cmd__Group__0"
    // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:196:1: rule__Cmd__Group__0 : rule__Cmd__Group__0__Impl rule__Cmd__Group__1 ;
    public final void rule__Cmd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:200:1: ( rule__Cmd__Group__0__Impl rule__Cmd__Group__1 )
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:201:2: rule__Cmd__Group__0__Impl rule__Cmd__Group__1
            {
            pushFollow(FOLLOW_rule__Cmd__Group__0__Impl_in_rule__Cmd__Group__0358);
            rule__Cmd__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Cmd__Group__1_in_rule__Cmd__Group__0361);
            rule__Cmd__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cmd__Group__0"


    // $ANTLR start "rule__Cmd__Group__0__Impl"
    // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:208:1: rule__Cmd__Group__0__Impl : ( () ) ;
    public final void rule__Cmd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:212:1: ( ( () ) )
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:213:1: ( () )
            {
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:213:1: ( () )
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:214:1: ()
            {
             before(grammarAccess.getCmdAccess().getCmdAction_0()); 
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:215:1: ()
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:217:1: 
            {
            }

             after(grammarAccess.getCmdAccess().getCmdAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cmd__Group__0__Impl"


    // $ANTLR start "rule__Cmd__Group__1"
    // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:227:1: rule__Cmd__Group__1 : rule__Cmd__Group__1__Impl rule__Cmd__Group__2 ;
    public final void rule__Cmd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:231:1: ( rule__Cmd__Group__1__Impl rule__Cmd__Group__2 )
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:232:2: rule__Cmd__Group__1__Impl rule__Cmd__Group__2
            {
            pushFollow(FOLLOW_rule__Cmd__Group__1__Impl_in_rule__Cmd__Group__1419);
            rule__Cmd__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Cmd__Group__2_in_rule__Cmd__Group__1422);
            rule__Cmd__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cmd__Group__1"


    // $ANTLR start "rule__Cmd__Group__1__Impl"
    // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:239:1: rule__Cmd__Group__1__Impl : ( 'CMD' ) ;
    public final void rule__Cmd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:243:1: ( ( 'CMD' ) )
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:244:1: ( 'CMD' )
            {
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:244:1: ( 'CMD' )
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:245:1: 'CMD'
            {
             before(grammarAccess.getCmdAccess().getCMDKeyword_1()); 
            match(input,12,FOLLOW_12_in_rule__Cmd__Group__1__Impl450); 
             after(grammarAccess.getCmdAccess().getCMDKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cmd__Group__1__Impl"


    // $ANTLR start "rule__Cmd__Group__2"
    // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:258:1: rule__Cmd__Group__2 : rule__Cmd__Group__2__Impl rule__Cmd__Group__3 ;
    public final void rule__Cmd__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:262:1: ( rule__Cmd__Group__2__Impl rule__Cmd__Group__3 )
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:263:2: rule__Cmd__Group__2__Impl rule__Cmd__Group__3
            {
            pushFollow(FOLLOW_rule__Cmd__Group__2__Impl_in_rule__Cmd__Group__2481);
            rule__Cmd__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Cmd__Group__3_in_rule__Cmd__Group__2484);
            rule__Cmd__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cmd__Group__2"


    // $ANTLR start "rule__Cmd__Group__2__Impl"
    // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:270:1: rule__Cmd__Group__2__Impl : ( '[' ) ;
    public final void rule__Cmd__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:274:1: ( ( '[' ) )
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:275:1: ( '[' )
            {
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:275:1: ( '[' )
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:276:1: '['
            {
             before(grammarAccess.getCmdAccess().getLeftSquareBracketKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__Cmd__Group__2__Impl512); 
             after(grammarAccess.getCmdAccess().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cmd__Group__2__Impl"


    // $ANTLR start "rule__Cmd__Group__3"
    // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:289:1: rule__Cmd__Group__3 : rule__Cmd__Group__3__Impl rule__Cmd__Group__4 ;
    public final void rule__Cmd__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:293:1: ( rule__Cmd__Group__3__Impl rule__Cmd__Group__4 )
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:294:2: rule__Cmd__Group__3__Impl rule__Cmd__Group__4
            {
            pushFollow(FOLLOW_rule__Cmd__Group__3__Impl_in_rule__Cmd__Group__3543);
            rule__Cmd__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Cmd__Group__4_in_rule__Cmd__Group__3546);
            rule__Cmd__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cmd__Group__3"


    // $ANTLR start "rule__Cmd__Group__3__Impl"
    // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:301:1: rule__Cmd__Group__3__Impl : ( ( rule__Cmd__ExecutableAssignment_3 )? ) ;
    public final void rule__Cmd__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:305:1: ( ( ( rule__Cmd__ExecutableAssignment_3 )? ) )
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:306:1: ( ( rule__Cmd__ExecutableAssignment_3 )? )
            {
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:306:1: ( ( rule__Cmd__ExecutableAssignment_3 )? )
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:307:1: ( rule__Cmd__ExecutableAssignment_3 )?
            {
             before(grammarAccess.getCmdAccess().getExecutableAssignment_3()); 
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:308:1: ( rule__Cmd__ExecutableAssignment_3 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:308:2: rule__Cmd__ExecutableAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Cmd__ExecutableAssignment_3_in_rule__Cmd__Group__3__Impl573);
                    rule__Cmd__ExecutableAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCmdAccess().getExecutableAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cmd__Group__3__Impl"


    // $ANTLR start "rule__Cmd__Group__4"
    // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:318:1: rule__Cmd__Group__4 : rule__Cmd__Group__4__Impl rule__Cmd__Group__5 ;
    public final void rule__Cmd__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:322:1: ( rule__Cmd__Group__4__Impl rule__Cmd__Group__5 )
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:323:2: rule__Cmd__Group__4__Impl rule__Cmd__Group__5
            {
            pushFollow(FOLLOW_rule__Cmd__Group__4__Impl_in_rule__Cmd__Group__4604);
            rule__Cmd__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Cmd__Group__5_in_rule__Cmd__Group__4607);
            rule__Cmd__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cmd__Group__4"


    // $ANTLR start "rule__Cmd__Group__4__Impl"
    // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:330:1: rule__Cmd__Group__4__Impl : ( ( rule__Cmd__ParamsAssignment_4 )? ) ;
    public final void rule__Cmd__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:334:1: ( ( ( rule__Cmd__ParamsAssignment_4 )? ) )
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:335:1: ( ( rule__Cmd__ParamsAssignment_4 )? )
            {
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:335:1: ( ( rule__Cmd__ParamsAssignment_4 )? )
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:336:1: ( rule__Cmd__ParamsAssignment_4 )?
            {
             before(grammarAccess.getCmdAccess().getParamsAssignment_4()); 
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:337:1: ( rule__Cmd__ParamsAssignment_4 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:337:2: rule__Cmd__ParamsAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Cmd__ParamsAssignment_4_in_rule__Cmd__Group__4__Impl634);
                    rule__Cmd__ParamsAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCmdAccess().getParamsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cmd__Group__4__Impl"


    // $ANTLR start "rule__Cmd__Group__5"
    // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:347:1: rule__Cmd__Group__5 : rule__Cmd__Group__5__Impl rule__Cmd__Group__6 ;
    public final void rule__Cmd__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:351:1: ( rule__Cmd__Group__5__Impl rule__Cmd__Group__6 )
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:352:2: rule__Cmd__Group__5__Impl rule__Cmd__Group__6
            {
            pushFollow(FOLLOW_rule__Cmd__Group__5__Impl_in_rule__Cmd__Group__5665);
            rule__Cmd__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Cmd__Group__6_in_rule__Cmd__Group__5668);
            rule__Cmd__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cmd__Group__5"


    // $ANTLR start "rule__Cmd__Group__5__Impl"
    // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:359:1: rule__Cmd__Group__5__Impl : ( ( rule__Cmd__Group_5__0 )* ) ;
    public final void rule__Cmd__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:363:1: ( ( ( rule__Cmd__Group_5__0 )* ) )
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:364:1: ( ( rule__Cmd__Group_5__0 )* )
            {
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:364:1: ( ( rule__Cmd__Group_5__0 )* )
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:365:1: ( rule__Cmd__Group_5__0 )*
            {
             before(grammarAccess.getCmdAccess().getGroup_5()); 
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:366:1: ( rule__Cmd__Group_5__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:366:2: rule__Cmd__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__Cmd__Group_5__0_in_rule__Cmd__Group__5__Impl695);
            	    rule__Cmd__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getCmdAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cmd__Group__5__Impl"


    // $ANTLR start "rule__Cmd__Group__6"
    // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:376:1: rule__Cmd__Group__6 : rule__Cmd__Group__6__Impl ;
    public final void rule__Cmd__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:380:1: ( rule__Cmd__Group__6__Impl )
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:381:2: rule__Cmd__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Cmd__Group__6__Impl_in_rule__Cmd__Group__6726);
            rule__Cmd__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cmd__Group__6"


    // $ANTLR start "rule__Cmd__Group__6__Impl"
    // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:387:1: rule__Cmd__Group__6__Impl : ( ']' ) ;
    public final void rule__Cmd__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:391:1: ( ( ']' ) )
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:392:1: ( ']' )
            {
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:392:1: ( ']' )
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:393:1: ']'
            {
             before(grammarAccess.getCmdAccess().getRightSquareBracketKeyword_6()); 
            match(input,14,FOLLOW_14_in_rule__Cmd__Group__6__Impl754); 
             after(grammarAccess.getCmdAccess().getRightSquareBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cmd__Group__6__Impl"


    // $ANTLR start "rule__Cmd__Group_5__0"
    // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:420:1: rule__Cmd__Group_5__0 : rule__Cmd__Group_5__0__Impl rule__Cmd__Group_5__1 ;
    public final void rule__Cmd__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:424:1: ( rule__Cmd__Group_5__0__Impl rule__Cmd__Group_5__1 )
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:425:2: rule__Cmd__Group_5__0__Impl rule__Cmd__Group_5__1
            {
            pushFollow(FOLLOW_rule__Cmd__Group_5__0__Impl_in_rule__Cmd__Group_5__0799);
            rule__Cmd__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Cmd__Group_5__1_in_rule__Cmd__Group_5__0802);
            rule__Cmd__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cmd__Group_5__0"


    // $ANTLR start "rule__Cmd__Group_5__0__Impl"
    // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:432:1: rule__Cmd__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Cmd__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:436:1: ( ( ',' ) )
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:437:1: ( ',' )
            {
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:437:1: ( ',' )
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:438:1: ','
            {
             before(grammarAccess.getCmdAccess().getCommaKeyword_5_0()); 
            match(input,15,FOLLOW_15_in_rule__Cmd__Group_5__0__Impl830); 
             after(grammarAccess.getCmdAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cmd__Group_5__0__Impl"


    // $ANTLR start "rule__Cmd__Group_5__1"
    // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:451:1: rule__Cmd__Group_5__1 : rule__Cmd__Group_5__1__Impl ;
    public final void rule__Cmd__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:455:1: ( rule__Cmd__Group_5__1__Impl )
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:456:2: rule__Cmd__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Cmd__Group_5__1__Impl_in_rule__Cmd__Group_5__1861);
            rule__Cmd__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cmd__Group_5__1"


    // $ANTLR start "rule__Cmd__Group_5__1__Impl"
    // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:462:1: rule__Cmd__Group_5__1__Impl : ( ( rule__Cmd__ParamsAssignment_5_1 ) ) ;
    public final void rule__Cmd__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:466:1: ( ( ( rule__Cmd__ParamsAssignment_5_1 ) ) )
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:467:1: ( ( rule__Cmd__ParamsAssignment_5_1 ) )
            {
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:467:1: ( ( rule__Cmd__ParamsAssignment_5_1 ) )
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:468:1: ( rule__Cmd__ParamsAssignment_5_1 )
            {
             before(grammarAccess.getCmdAccess().getParamsAssignment_5_1()); 
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:469:1: ( rule__Cmd__ParamsAssignment_5_1 )
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:469:2: rule__Cmd__ParamsAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Cmd__ParamsAssignment_5_1_in_rule__Cmd__Group_5__1__Impl888);
            rule__Cmd__ParamsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getCmdAccess().getParamsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cmd__Group_5__1__Impl"


    // $ANTLR start "rule__From__Group__0"
    // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:483:1: rule__From__Group__0 : rule__From__Group__0__Impl rule__From__Group__1 ;
    public final void rule__From__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:487:1: ( rule__From__Group__0__Impl rule__From__Group__1 )
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:488:2: rule__From__Group__0__Impl rule__From__Group__1
            {
            pushFollow(FOLLOW_rule__From__Group__0__Impl_in_rule__From__Group__0922);
            rule__From__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__From__Group__1_in_rule__From__Group__0925);
            rule__From__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__From__Group__0"


    // $ANTLR start "rule__From__Group__0__Impl"
    // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:495:1: rule__From__Group__0__Impl : ( 'FROM' ) ;
    public final void rule__From__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:499:1: ( ( 'FROM' ) )
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:500:1: ( 'FROM' )
            {
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:500:1: ( 'FROM' )
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:501:1: 'FROM'
            {
             before(grammarAccess.getFromAccess().getFROMKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__From__Group__0__Impl953); 
             after(grammarAccess.getFromAccess().getFROMKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__From__Group__0__Impl"


    // $ANTLR start "rule__From__Group__1"
    // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:514:1: rule__From__Group__1 : rule__From__Group__1__Impl rule__From__Group__2 ;
    public final void rule__From__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:518:1: ( rule__From__Group__1__Impl rule__From__Group__2 )
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:519:2: rule__From__Group__1__Impl rule__From__Group__2
            {
            pushFollow(FOLLOW_rule__From__Group__1__Impl_in_rule__From__Group__1984);
            rule__From__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__From__Group__2_in_rule__From__Group__1987);
            rule__From__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__From__Group__1"


    // $ANTLR start "rule__From__Group__1__Impl"
    // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:526:1: rule__From__Group__1__Impl : ( ( rule__From__NameAssignment_1 ) ) ;
    public final void rule__From__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:530:1: ( ( ( rule__From__NameAssignment_1 ) ) )
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:531:1: ( ( rule__From__NameAssignment_1 ) )
            {
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:531:1: ( ( rule__From__NameAssignment_1 ) )
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:532:1: ( rule__From__NameAssignment_1 )
            {
             before(grammarAccess.getFromAccess().getNameAssignment_1()); 
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:533:1: ( rule__From__NameAssignment_1 )
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:533:2: rule__From__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__From__NameAssignment_1_in_rule__From__Group__1__Impl1014);
            rule__From__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFromAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__From__Group__1__Impl"


    // $ANTLR start "rule__From__Group__2"
    // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:543:1: rule__From__Group__2 : rule__From__Group__2__Impl ;
    public final void rule__From__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:547:1: ( rule__From__Group__2__Impl )
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:548:2: rule__From__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__From__Group__2__Impl_in_rule__From__Group__21044);
            rule__From__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__From__Group__2"


    // $ANTLR start "rule__From__Group__2__Impl"
    // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:554:1: rule__From__Group__2__Impl : ( ( rule__From__TagAssignment_2 )? ) ;
    public final void rule__From__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:558:1: ( ( ( rule__From__TagAssignment_2 )? ) )
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:559:1: ( ( rule__From__TagAssignment_2 )? )
            {
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:559:1: ( ( rule__From__TagAssignment_2 )? )
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:560:1: ( rule__From__TagAssignment_2 )?
            {
             before(grammarAccess.getFromAccess().getTagAssignment_2()); 
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:561:1: ( rule__From__TagAssignment_2 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_TAG_ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:561:2: rule__From__TagAssignment_2
                    {
                    pushFollow(FOLLOW_rule__From__TagAssignment_2_in_rule__From__Group__2__Impl1071);
                    rule__From__TagAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFromAccess().getTagAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__From__Group__2__Impl"


    // $ANTLR start "rule__Dockerfile__InstructionsAssignment"
    // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:578:1: rule__Dockerfile__InstructionsAssignment : ( ruleInstruction ) ;
    public final void rule__Dockerfile__InstructionsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:582:1: ( ( ruleInstruction ) )
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:583:1: ( ruleInstruction )
            {
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:583:1: ( ruleInstruction )
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:584:1: ruleInstruction
            {
             before(grammarAccess.getDockerfileAccess().getInstructionsInstructionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleInstruction_in_rule__Dockerfile__InstructionsAssignment1113);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getDockerfileAccess().getInstructionsInstructionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dockerfile__InstructionsAssignment"


    // $ANTLR start "rule__Cmd__ExecutableAssignment_3"
    // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:593:1: rule__Cmd__ExecutableAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Cmd__ExecutableAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:597:1: ( ( RULE_STRING ) )
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:598:1: ( RULE_STRING )
            {
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:598:1: ( RULE_STRING )
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:599:1: RULE_STRING
            {
             before(grammarAccess.getCmdAccess().getExecutableSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Cmd__ExecutableAssignment_31144); 
             after(grammarAccess.getCmdAccess().getExecutableSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cmd__ExecutableAssignment_3"


    // $ANTLR start "rule__Cmd__ParamsAssignment_4"
    // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:608:1: rule__Cmd__ParamsAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Cmd__ParamsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:612:1: ( ( RULE_STRING ) )
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:613:1: ( RULE_STRING )
            {
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:613:1: ( RULE_STRING )
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:614:1: RULE_STRING
            {
             before(grammarAccess.getCmdAccess().getParamsSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Cmd__ParamsAssignment_41175); 
             after(grammarAccess.getCmdAccess().getParamsSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cmd__ParamsAssignment_4"


    // $ANTLR start "rule__Cmd__ParamsAssignment_5_1"
    // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:623:1: rule__Cmd__ParamsAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__Cmd__ParamsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:627:1: ( ( RULE_STRING ) )
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:628:1: ( RULE_STRING )
            {
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:628:1: ( RULE_STRING )
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:629:1: RULE_STRING
            {
             before(grammarAccess.getCmdAccess().getParamsSTRINGTerminalRuleCall_5_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Cmd__ParamsAssignment_5_11206); 
             after(grammarAccess.getCmdAccess().getParamsSTRINGTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cmd__ParamsAssignment_5_1"


    // $ANTLR start "rule__From__NameAssignment_1"
    // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:638:1: rule__From__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__From__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:642:1: ( ( RULE_ID ) )
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:643:1: ( RULE_ID )
            {
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:643:1: ( RULE_ID )
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:644:1: RULE_ID
            {
             before(grammarAccess.getFromAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__From__NameAssignment_11237); 
             after(grammarAccess.getFromAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__From__NameAssignment_1"


    // $ANTLR start "rule__From__TagAssignment_2"
    // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:653:1: rule__From__TagAssignment_2 : ( RULE_TAG_ID ) ;
    public final void rule__From__TagAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:657:1: ( ( RULE_TAG_ID ) )
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:658:1: ( RULE_TAG_ID )
            {
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:658:1: ( RULE_TAG_ID )
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:659:1: RULE_TAG_ID
            {
             before(grammarAccess.getFromAccess().getTagTAG_IDTerminalRuleCall_2_0()); 
            match(input,RULE_TAG_ID,FOLLOW_RULE_TAG_ID_in_rule__From__TagAssignment_21268); 
             after(grammarAccess.getFromAccess().getTagTAG_IDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__From__TagAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleDockerfile_in_entryRuleDockerfile61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDockerfile68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dockerfile__InstructionsAssignment_in_ruleDockerfile94 = new BitSet(new long[]{0x0000000000011002L});
    public static final BitSet FOLLOW_ruleInstruction_in_entryRuleInstruction122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstruction129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__Alternatives_in_ruleInstruction155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCmd_in_entryRuleCmd182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCmd189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cmd__Group__0_in_ruleCmd215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFrom_in_entryRuleFrom242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFrom249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__From__Group__0_in_ruleFrom275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFrom_in_rule__Instruction__Alternatives311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCmd_in_rule__Instruction__Alternatives328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cmd__Group__0__Impl_in_rule__Cmd__Group__0358 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_rule__Cmd__Group__1_in_rule__Cmd__Group__0361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cmd__Group__1__Impl_in_rule__Cmd__Group__1419 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Cmd__Group__2_in_rule__Cmd__Group__1422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Cmd__Group__1__Impl450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cmd__Group__2__Impl_in_rule__Cmd__Group__2481 = new BitSet(new long[]{0x000000000000C010L});
    public static final BitSet FOLLOW_rule__Cmd__Group__3_in_rule__Cmd__Group__2484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Cmd__Group__2__Impl512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cmd__Group__3__Impl_in_rule__Cmd__Group__3543 = new BitSet(new long[]{0x000000000000C010L});
    public static final BitSet FOLLOW_rule__Cmd__Group__4_in_rule__Cmd__Group__3546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cmd__ExecutableAssignment_3_in_rule__Cmd__Group__3__Impl573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cmd__Group__4__Impl_in_rule__Cmd__Group__4604 = new BitSet(new long[]{0x000000000000C010L});
    public static final BitSet FOLLOW_rule__Cmd__Group__5_in_rule__Cmd__Group__4607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cmd__ParamsAssignment_4_in_rule__Cmd__Group__4__Impl634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cmd__Group__5__Impl_in_rule__Cmd__Group__5665 = new BitSet(new long[]{0x000000000000C010L});
    public static final BitSet FOLLOW_rule__Cmd__Group__6_in_rule__Cmd__Group__5668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cmd__Group_5__0_in_rule__Cmd__Group__5__Impl695 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__Cmd__Group__6__Impl_in_rule__Cmd__Group__6726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Cmd__Group__6__Impl754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cmd__Group_5__0__Impl_in_rule__Cmd__Group_5__0799 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Cmd__Group_5__1_in_rule__Cmd__Group_5__0802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Cmd__Group_5__0__Impl830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cmd__Group_5__1__Impl_in_rule__Cmd__Group_5__1861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cmd__ParamsAssignment_5_1_in_rule__Cmd__Group_5__1__Impl888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__From__Group__0__Impl_in_rule__From__Group__0922 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__From__Group__1_in_rule__From__Group__0925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__From__Group__0__Impl953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__From__Group__1__Impl_in_rule__From__Group__1984 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__From__Group__2_in_rule__From__Group__1987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__From__NameAssignment_1_in_rule__From__Group__1__Impl1014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__From__Group__2__Impl_in_rule__From__Group__21044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__From__TagAssignment_2_in_rule__From__Group__2__Impl1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_rule__Dockerfile__InstructionsAssignment1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Cmd__ExecutableAssignment_31144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Cmd__ParamsAssignment_41175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Cmd__ParamsAssignment_5_11206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__From__NameAssignment_11237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAG_ID_in_rule__From__TagAssignment_21268 = new BitSet(new long[]{0x0000000000000002L});

}