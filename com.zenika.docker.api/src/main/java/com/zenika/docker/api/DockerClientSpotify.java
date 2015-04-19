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
import com.spotify.docker.client.DockerClient.ListContainersParam;
import com.spotify.docker.client.DockerClient.LogsParameter;
import com.spotify.docker.client.DockerException;
import com.spotify.docker.client.DockerTimeoutException;
import com.spotify.docker.client.LogStream;
import com.spotify.docker.client.ProgressHandler;
import com.spotify.docker.client.messages.Container;
import com.spotify.docker.client.messages.ContainerConfig;
import com.spotify.docker.client.messages.ContainerCreation;
import com.spotify.docker.client.messages.ContainerInfo;
import com.spotify.docker.client.messages.HostConfig;
import com.spotify.docker.client.messages.PortBinding;
import com.spotify.docker.client.messages.ProgressMessage;

public class DockerClientSpotify implements DockerClient {

	private final DockerClientMessageConsole messageConsole;
	private final com.spotify.docker.client.DockerClient dockerClient;
	private DockerConfig dockerConfig;

	public DockerClientSpotify() {
		messageConsole = new DockerClientMessageConsole(Constants.CONSOLE_NAME);
		dockerConfig = new DockerConfig();

		final String endpoint = dockerConfig.getUri();
		final String dockerCertPath = dockerConfig.getDockerCertPath();

		final DefaultDockerClient.Builder builder = new DefaultDockerClient.Builder();
		builder.uri(endpoint);
		builder.readTimeoutMillis(DefaultDockerClient.NO_TIMEOUT);

		if (dockerCertPath != null && !dockerCertPath.isEmpty()) {
			try {
				builder.dockerCertificates(new DockerCertificates(Paths
						.get(dockerCertPath)));
			} catch (DockerCertificateException e) {
				messageConsole.getDockerConsoleOut().println(
						"[ERROR] " + e.toString());
			}
		}

		dockerClient = builder.build();
	}

	@Override
	public void defaultBuildCommand(String eclipseProjectName,
			String dockerBuildContext) {
		String imageName = ImageNameBuilder.buildImageName(eclipseProjectName,
				dockerBuildContext);
		Path baseDir = new File(dockerBuildContext).toPath();

		messageConsole.getDockerConsoleOut().println(
				"\n[INFO] Invoking docker build command (buildContext="
						+ dockerBuildContext + ", image=" + imageName + ")");

		try {
			dockerClient.build(baseDir, imageName, new ProgressHandler() {
				public void progress(ProgressMessage message)
						throws DockerException {
					messageConsole.getDockerConsoleOut().print(
							"[INFO] " + message.stream());
				}
			});

			messageConsole.getDockerConsoleOut().println(
					"[INFO] docker build completed");
		} catch (DockerTimeoutException e) {
			printDockerTimeoutExceptionMessage();
		} catch (DockerException e) {
			messageConsole.getDockerConsoleOut().println(
					"[ERROR] " + e.toString());
		} catch (InterruptedException e) {
			messageConsole.getDockerConsoleOut().println(
					"[ERROR] " + e.toString());
		} catch (IOException e) {
			messageConsole.getDockerConsoleOut().println(
					"[ERROR] " + e.toString());
		}
	}

	private void printDockerTimeoutExceptionMessage() {
		messageConsole.getDockerConsoleOut().println("[ERROR] Docker is not responding. Possible causes are: ");
		messageConsole.getDockerConsoleOut().println("    1) Docker engine is not started or not installed.");
		messageConsole.getDockerConsoleOut().println("\tPlease refer to https://docs.docker.com/installation/.");
		messageConsole.getDockerConsoleOut().println("    2) Doclipser is not configured correctly:");
		messageConsole.getDockerConsoleOut().println("\tPlease verify properties file and edit it as needed.");
		messageConsole.getDockerConsoleOut().println("\tProperties file can be found here: " + dockerConfig.getPropertiesFileFullPath());
	}

	@Override
	public void defaultRunCommand(String eclipseProjectName,
			String dockerBuildContext) {
		try {

			String imageName = ImageNameBuilder.buildImageName(
					eclipseProjectName, dockerBuildContext);
			String containerName = imageName + "_1";

			messageConsole.getDockerConsoleOut().println(
					"\n[INFO] Invoking docker run command (image=" + imageName
							+ ", container=" + containerName + ")");

			// Create container with exposed ports
			final String[] ports = {}; // {"8080"};
			final ContainerConfig config = ContainerConfig.builder()
					.image(imageName).exposedPorts(ports).build();

			// Bind container ports to host ports
			final Map<String, List<PortBinding>> portBindings = new HashMap<String, List<PortBinding>>();
			for (String port : ports) {
				List<PortBinding> hostPorts = new ArrayList<PortBinding>();
				hostPorts.add(PortBinding.of("0.0.0.0", port));
				portBindings.put(port, hostPorts);
			}
			final HostConfig hostConfig = HostConfig.builder()
					.portBindings(portBindings).publishAllPorts(true).build();

			final ContainerCreation creation = dockerClient.createContainer(
					config, containerName);
			final String id = creation.id();

			// Start container
			dockerClient.startContainer(id, hostConfig);

			LogStream stream = dockerClient.logs(id, LogsParameter.TIMESTAMPS,
					LogsParameter.STDERR, LogsParameter.STDOUT,
					LogsParameter.FOLLOW);

			while (stream.hasNext()) {
				messageConsole.getDockerConsoleOut().print(
						"[INFO] "
								+ containerName
								+ " | "
								+ com.google.common.base.Charsets.UTF_8
										.decode(stream.next().content()));
			}

			dockerClient.removeContainer(id);

			messageConsole.getDockerConsoleOut().println(
					"[INFO] docker run completed (container_id=" + id + ")");

		} catch (DockerTimeoutException e) {
			printDockerTimeoutExceptionMessage();
		} catch (DockerException e) {
			messageConsole.getDockerConsoleOut().println(
					"[ERROR] " + e.toString());
		} catch (InterruptedException e) {
			messageConsole.getDockerConsoleOut().println(
					"[ERROR] " + e.toString());
		}
	}

	@Override
	public void infoCommand() {
		// TODO Auto-generated method stub

	}

	@Override
	public void defaultRmCommand(String eclipseProjectName,
			String dockerBuildContext) {
		String imageName = ImageNameBuilder.buildImageName(eclipseProjectName,
				dockerBuildContext);
		String containerName = imageName + "_1";
		String containerId = null;

		try {
			messageConsole.getDockerConsoleOut().println(
					"\n[INFO] Removing container " + containerName + ":");

			List<Container> containers = dockerClient
					.listContainers(ListContainersParam.allContainers());

			for (Container c : containers) {
				for (String cName : c.names()) {
					if (cName.equals("/" + containerName)) {
						containerId = c.id();
						break;
					}
				}
			}

			if (containerId == null) {
				messageConsole
						.getDockerConsoleOut()
						.println(
								"[WARNING] No container found with this name. Remove aborted");
				return;
			}

			ContainerInfo info = dockerClient.inspectContainer(containerId);

			if (info.state().running() || info.state().restarting()
					|| info.state().paused()) {
				dockerClient.stopContainer(containerId, 10);
			}

			dockerClient.removeContainer(containerId);

			messageConsole.getDockerConsoleOut().println("[INFO] Remove completed.");

		} catch (DockerTimeoutException e) {
			printDockerTimeoutExceptionMessage();
		} catch (DockerException e) {
			messageConsole.getDockerConsoleOut().println(
					"[ERROR] " + e.toString());
		} catch (InterruptedException e) {
			messageConsole.getDockerConsoleOut().println(
					"[ERROR] " + e.toString());
		}
	}

	@Override
	public void defaultPsCommand() {
		try {
			messageConsole.getDockerConsoleOut().println(
					"\n[INFO] List of running containers:");
			List<Container> containers = dockerClient.listContainers();

			if (containers.isEmpty()) {
				messageConsole.getDockerConsoleOut().println(
						"[INFO] No running container.");
			}

			for (Container c : containers) {
				messageConsole.getDockerConsoleOut().println(
						"[INFO] " + c.toString());
			}

		} catch (DockerTimeoutException e) {
			printDockerTimeoutExceptionMessage();
		} catch (DockerException e) {
			messageConsole.getDockerConsoleOut().println(
					"[ERROR] " + e.toString());
		} catch (InterruptedException e) {
			messageConsole.getDockerConsoleOut().println(
					"[ERROR] " + e.toString());
		}
	}

	@Override
	public void defaultLogsCommand(String eclipseProjectName,
			String dockerBuildContext) {
		String imageName = ImageNameBuilder.buildImageName(eclipseProjectName,
				dockerBuildContext);
		String containerName = imageName + "_1";
		String containerId = null;

		try {
			messageConsole.getDockerConsoleOut().println(
					"\n[INFO] Logs of container " + containerName + ":");

			List<Container> containers = dockerClient
					.listContainers(ListContainersParam.allContainers());

			for (Container c : containers) {
				for (String cName : c.names()) {
					if (cName.equals("/" + containerName)) {
						containerId = c.id();
						break;
					}
				}
			}

			if (containerId == null) {
				messageConsole
						.getDockerConsoleOut()
						.println(
								"[WARNING] No container found with this name. Have you already tried to run the container?");
				return;
			}

			LogStream stream = dockerClient.logs(containerId,
					LogsParameter.TIMESTAMPS, LogsParameter.STDERR,
					LogsParameter.STDOUT);

			while (stream.hasNext()) {
				messageConsole.getDockerConsoleOut().print(
						"[INFO] "
								+ containerName
								+ " | "
								+ com.google.common.base.Charsets.UTF_8
										.decode(stream.next().content()));
			}

		} catch (DockerTimeoutException e) {
			printDockerTimeoutExceptionMessage();
		} catch (DockerException e) {
			messageConsole.getDockerConsoleOut().println(
					"[ERROR] " + e.toString());
		} catch (InterruptedException e) {
			messageConsole.getDockerConsoleOut().println(
					"[ERROR] " + e.toString());
		}

	}
}
