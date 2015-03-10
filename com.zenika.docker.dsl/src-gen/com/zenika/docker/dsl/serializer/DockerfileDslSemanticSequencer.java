package com.zenika.docker.dsl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.zenika.docker.dsl.dockerfileDsl.Cmd;
import com.zenika.docker.dsl.dockerfileDsl.Dockerfile;
import com.zenika.docker.dsl.dockerfileDsl.DockerfileDslPackage;
import com.zenika.docker.dsl.dockerfileDsl.From;
import com.zenika.docker.dsl.services.DockerfileDslGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;

@SuppressWarnings("all")
public class DockerfileDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DockerfileDslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == DockerfileDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case DockerfileDslPackage.CMD:
				if(context == grammarAccess.getCmdRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_Cmd(context, (Cmd) semanticObject); 
					return; 
				}
				else break;
			case DockerfileDslPackage.DOCKERFILE:
				if(context == grammarAccess.getDockerfileRule()) {
					sequence_Dockerfile(context, (Dockerfile) semanticObject); 
					return; 
				}
				else break;
			case DockerfileDslPackage.FROM:
				if(context == grammarAccess.getFromRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_From(context, (From) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (executable=STRING? params+=STRING? params+=STRING*)
	 */
	protected void sequence_Cmd(EObject context, Cmd semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     instructions+=Instruction*
	 */
	protected void sequence_Dockerfile(EObject context, Dockerfile semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID tag=TAG_ID?)
	 */
	protected void sequence_From(EObject context, From semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
