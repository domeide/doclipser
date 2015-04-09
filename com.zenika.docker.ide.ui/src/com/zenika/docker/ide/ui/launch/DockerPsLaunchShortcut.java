package com.zenika.docker.ide.ui.launch;

import org.eclipse.core.resources.IResource;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.ui.ILaunchShortcut2;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;

import com.zenika.docker.api.DockerClient;
import com.zenika.docker.api.DockerClientFactory;

public class DockerPsLaunchShortcut implements ILaunchShortcut2 {

	@Override
	public void launch(ISelection sel, String mode) {
		Display.getDefault().asyncExec(new Runnable() {
			@Override
			public void run() {
				DockerClient dockerClient = DockerClientFactory
						.makeDockerClient();
				dockerClient.defaultPsCommand();
			}
		});
	}

	@Override
	public void launch(IEditorPart editor, String mode) {
		Display.getDefault().asyncExec(new Runnable() {
			@Override
			public void run() {
				DockerClient dockerClient = DockerClientFactory
						.makeDockerClient();
				dockerClient.defaultPsCommand();
			}
		});
	}

	@Override
	public ILaunchConfiguration[] getLaunchConfigurations(ISelection selection) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ILaunchConfiguration[] getLaunchConfigurations(IEditorPart editorpart) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IResource getLaunchableResource(ISelection selection) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IResource getLaunchableResource(IEditorPart editorpart) {
		// TODO Auto-generated method stub
		return null;
	}

}
