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
package com.zenika.doclipser.api;

public interface DockerClient {
	void infoCommand();
	void defaultBuildCommand(String eclipseProjectName, String dockerBuildContext);
	void defaultRunCommand(String eclipseProjectName, String dockerBuildContext);
	void defaultRmCommand(String eclipseProjectName, String dockerBuildContext);
	void defaultPsCommand();
	void defaultLogsCommand(String eclipseProjectName, String dockerBuildContext);
}
