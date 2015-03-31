package com.zenika.docker.api;

import org.junit.Before;
import org.junit.Test;

public class DockerClientJavaApiTest {
	
	private final String dockerClientClassName = "com.zenika.docker.api.DockerClientJavaApi";
	private DockerClient client;

	@Before
	public void setUp() {
		client = DockerClientFactory
				.makeDockerClient(dockerClientClassName);
	}

	@Test
	public void testInfoCommand() {
		client.infoCommand();
	}

	@Test
	public void testDefaultBuildCommand() {
		String buildContextPath = "src/test/resources/simplestDockerBuildContext";
		client.defaultBuildCommand(buildContextPath);
	}

	@Test
	public void testDefaultRunCommand() {
		String buildContextPath = "src/test/resources/simplestDockerBuildContext";
		client.defaultRunCommand(buildContextPath);
	}

}
