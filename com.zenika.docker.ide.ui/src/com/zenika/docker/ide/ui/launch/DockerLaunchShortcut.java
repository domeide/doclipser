package com.zenika.docker.ide.ui.launch;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;

import org.apache.commons.io.IOUtils;
import org.apache.commons.io.LineIterator;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.ui.ILaunchShortcut2;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorPart;

import com.github.dockerjava.api.DockerClient;
import com.github.dockerjava.core.DockerClientBuilder;
import com.github.dockerjava.core.DockerClientConfig;

public class DockerLaunchShortcut implements ILaunchShortcut2 {

	@Override
	public void launch(ISelection sel, String mode) {
		if (sel instanceof IStructuredSelection) {
			Object selected = ((IStructuredSelection) sel).getFirstElement();
			if (selected instanceof IFile) {
				IFile dockerfile = (IFile)selected;
				IPath dockerfilePath = dockerfile.getLocation().removeLastSegments(1);
				
				DockerClientConfig config = DockerClientConfig
						.createDefaultConfigBuilder()
						.withVersion("1.16")
						.withUri("https://192.168.59.103:2376")
						// .withUsername("dockeruser")
						// .withPassword("ilovedocker")
						// .withEmail("dockeruser@github.com")
						// .withServerAddress("https://index.docker.io/v1/")
						.withDockerCertPath(
								"/Users/mariolet/.boot2docker/certs/boot2docker-vm")
						.build();
				DockerClient dockerClient = DockerClientBuilder.getInstance(config)
						.build();
//				Info info = dockerClient.infoCmd().exec();
//				System.out.print(info);
				
				File baseDir = new File(dockerfilePath.toOSString());
				
				InputStream response = dockerClient.buildImageCmd(baseDir).exec();
				
//				File baseDir = new File("/Users/mariolet/GitHub/sublime-docker/language-helloworlds/dockerfile");
//
//				InputStream response = dockerClient.buildImageCmd(baseDir).exec();
//
				StringWriter logwriter = new StringWriter();

				try {
				    LineIterator itr = IOUtils.lineIterator(response, "UTF-8");
				    while (itr.hasNext()) {
				        String line = itr.next();
				        logwriter.write(line);
				        System.out.println(line);
				    }
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
				    IOUtils.closeQuietly(response);
				}
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
