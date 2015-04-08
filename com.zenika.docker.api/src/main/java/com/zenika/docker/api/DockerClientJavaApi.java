package com.zenika.docker.api;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;

import org.apache.commons.io.IOUtils;
import org.apache.commons.io.LineIterator;

import com.github.dockerjava.api.command.CreateContainerResponse;
import com.github.dockerjava.api.command.EventCallback;
import com.github.dockerjava.api.model.Event;
import com.github.dockerjava.api.model.ExposedPort;
import com.github.dockerjava.api.model.Info;
import com.github.dockerjava.api.model.Ports;
import com.github.dockerjava.core.DockerClientBuilder;
import com.github.dockerjava.core.DockerClientConfig;

public class DockerClientJavaApi implements DockerClient {

	private final DockerClientMessageConsole messageConsole;
	private final com.github.dockerjava.api.DockerClient dockerClient;

	public DockerClientJavaApi() {
		messageConsole = new DockerClientMessageConsole(Constants.CONSOLE_NAME);
		DockerConfig dockerConfig = new DockerConfig();
		
		DockerClientConfig dockerClientConfig = DockerClientConfig.createDefaultConfigBuilder()
				.withVersion(dockerConfig.getVersion()).withUri(dockerConfig.getUri()).withUsername(dockerConfig.getUsername())
				.withPassword(dockerConfig.getPassword()).withEmail(dockerConfig.getEmail())
				.withServerAddress(dockerConfig.getServerAddress())
				.withDockerCertPath(dockerConfig.getDockerCertPath()).build();

		dockerClient = DockerClientBuilder.getInstance(dockerClientConfig).build();
		
		EventCallback eventCallback = new EventCallback() {
			   @Override
			   public void onEvent(Event event) {
			      // this callback method is called on a separate thread
				   messageConsole.getDockerConsoleOut().println("event: " + event);
			   }

			@Override
			public boolean isReceiving() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void onCompletion(int arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onException(Throwable arg0) {
				// TODO Auto-generated method stub
				
			}
			};

			// start event processing thread
			dockerClient.eventsCmd(eventCallback).exec();
		

	}

	@Override
	public void infoCommand() {
		Info info = dockerClient.infoCmd().exec();
		System.out.print(info);
	}

	@Override
	public void defaultBuildCommand(String eclipseProjectName, String dockerBuildContext) {
		File baseDir = new File(dockerBuildContext);
		InputStream response = dockerClient.buildImageCmd(baseDir).exec();
		StringWriter logwriter = new StringWriter();
		messageConsole.getDockerConsoleOut().println(">>> Building " + dockerBuildContext + "/Dockerfile with default options");
		messageConsole.getDockerConsoleOut().println("");

		try {
			messageConsole.getDockerConsoleOut().flush();
			LineIterator itr = IOUtils.lineIterator(response, "UTF-8");
			while (itr.hasNext()) {
				String line = itr.next();
				logwriter.write(line);
				messageConsole.getDockerConsoleOut().println(line);
				messageConsole.getDockerConsoleOut().flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			IOUtils.closeQuietly(response);
		}

		messageConsole.getDockerConsoleOut().println("");
		messageConsole.getDockerConsoleOut().println("<<< Build ended");
	}

	@Override
	public void defaultRunCommand(String eclipseProjectName, String dockerBuildContext) {
		ExposedPort tcp8080 = ExposedPort.tcp(8080);

		CreateContainerResponse container = dockerClient.createContainerCmd("mariolet/my-tomcat")
		   .withCmd("true")
		   .withExposedPorts(tcp8080)
		   .exec();

		Ports portBindings = new Ports();
		portBindings.bind(tcp8080, Ports.Binding(80));

		dockerClient.startContainerCmd(container.getId())
		   .withPortBindings(portBindings)
		   .exec();
	}

	@Override
	public void defaultRmCommand(String eclipseProjectName, String dockerBuildContext) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void defaultPsCommand() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void defaultLogsCommand(String eclipseProjectName, String dockerBuildContext) {
		// TODO Auto-generated method stub
		
	}


}
