package com.zenika.docker.api;

public interface DockerClient {
	void infoCommand();
	void defaultBuildCommand(String eclipseProjectName, String dockerBuildContext);
	void defaultRunCommand(String eclipseProjectName, String dockerBuildContext);
	void defaultRmCommand(String eclipseProjectName, String dockerBuildContext);
	void defaultPsCommand();
	void defaultLogsCommand(String eclipseProjectName, String dockerBuildContext);
}
