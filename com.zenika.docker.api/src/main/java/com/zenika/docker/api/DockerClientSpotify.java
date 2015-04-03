package com.zenika.docker.api;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.spotify.docker.client.DefaultDockerClient;
import com.spotify.docker.client.DockerCertificateException;
import com.spotify.docker.client.DockerCertificates;
import com.spotify.docker.client.DockerException;
import com.spotify.docker.client.ProgressHandler;
import com.spotify.docker.client.messages.ContainerConfig;
import com.spotify.docker.client.messages.ContainerCreation;
import com.spotify.docker.client.messages.ContainerInfo;
import com.spotify.docker.client.messages.HostConfig;
import com.spotify.docker.client.messages.PortBinding;
import com.spotify.docker.client.messages.ProgressMessage;

public class DockerClientSpotify implements DockerClient {

	private final DockerClientMessageConsole messageConsole;
	private final com.spotify.docker.client.DockerClient dockerClient;
	private final String imageName = "mariolet/my-tomcat";

	public DockerClientSpotify() {
		messageConsole = new DockerClientMessageConsole(Constants.CONSOLE_NAME);
		DockerConfig dockerConfig = new DockerConfig();
		
	    final String endpoint = dockerConfig.getUri();
	    final String dockerCertPath = dockerConfig.getDockerCertPath();
	    
	    final DefaultDockerClient.Builder builder = new DefaultDockerClient.Builder();
	    builder.uri(endpoint);


		if (dockerCertPath != null && !dockerCertPath.isEmpty()) {
			try {
				builder.dockerCertificates(new DockerCertificates(Paths
						.get(dockerCertPath)));
			} catch (DockerCertificateException e) {
				messageConsole.getDockerConsoleOut().println(e.toString());
			}
		}		

		dockerClient = builder.build();
	}

	@Override
	public void defaultBuildCommand(String buildContext) {
		Path baseDir = new File(buildContext).toPath();
		try {
			dockerClient.build(baseDir, imageName, new ProgressHandler() {
				public void progress(ProgressMessage message)
						throws DockerException {
					messageConsole.getDockerConsoleOut().println(
							message.stream());
				}
			});
		} catch (DockerException e) {
			messageConsole.getDockerConsoleOut().println(e.toString());
		} catch (InterruptedException e) {
			messageConsole.getDockerConsoleOut().println(e.toString());
		} catch (IOException e) {
			messageConsole.getDockerConsoleOut().println(e.toString());
		}
	}

	@Override
	public void defaultRunCommand(String buildContext) {
		try {
			
			// Create container with exposed ports
			final String[] ports = {"8080"};
			final ContainerConfig config = ContainerConfig.builder()
			    .image(imageName).exposedPorts(ports)
			    .build();

			// Bind container ports to host ports
			final Map<String, List<PortBinding>> portBindings = new HashMap<String, List<PortBinding>>();
			for(String port : ports) {
			    List<PortBinding> hostPorts = new ArrayList<PortBinding>();
			    hostPorts.add(PortBinding.of("0.0.0.0", port));
			    //hostPorts.add(PortBinding.of("0.0.0.0", port));
			    
			    portBindings.put(port, hostPorts);
			}
			final HostConfig hostConfig = HostConfig.builder().portBindings(portBindings).build();

			final ContainerCreation creation = dockerClient.createContainer(config);
			final String id = creation.id();

			// Start container
			dockerClient.startContainer(id, hostConfig);
			
		} catch (DockerException e) {
			messageConsole.getDockerConsoleOut().println(e.toString());
		} catch (InterruptedException e) {
			messageConsole.getDockerConsoleOut().println(e.toString());
		}
	}

	@Override
	public void infoCommand() {
		// TODO Auto-generated method stub

	}

}
