package com.zenika.docker.ide.ui.launch;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.ui.ILaunchShortcut2;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorPart;

import com.zenika.docker.api.DockerClient;
import com.zenika.docker.api.DockerClientFactory;

public class DockerRunLaunchShortcut implements ILaunchShortcut2 {

	@Override
	public void launch(ISelection sel, String mode) {
		if (sel instanceof IStructuredSelection) {
			Object selected = ((IStructuredSelection) sel).getFirstElement();
			if (selected instanceof IFile) {
				IFile dockerfile = (IFile)selected;
				IPath dockerfilePath = dockerfile.getLocation().removeLastSegments(1);
				DockerClient dockerClient = DockerClientFactory.makeDockerClient();
				dockerClient.defaultRunCommand(dockerfilePath.toOSString());
			}
		}
	}

	@Override
	public void launch(IEditorPart editor, String mode) {
		// TODO Auto-generated method stub

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
