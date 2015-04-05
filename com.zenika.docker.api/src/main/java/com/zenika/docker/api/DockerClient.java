package com.zenika.docker.api;

public interface DockerClient {
	void infoCommand();
	void defaultBuildCommand(String buildContext);
	void defaultRunCommand(String buildContext);
	void defaultRmCommand(String buildContext);
	void defaultPsCommand(String buildContext);
	void defaultLogsCommand(String buildContext);
}
