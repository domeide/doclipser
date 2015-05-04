/**
 * Copyright (c) 2015 Zenika
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Mario Loriedo @mariolet - Initial implementation
 */
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
		client.defaultBuildCommand(null, buildContextPath);
	}

	@Test
	public void testDefaultRunCommand() {
		String buildContextPath = "src/test/resources/simplestDockerBuildContext";
		client.defaultRunCommand(null, buildContextPath);
	}

}
