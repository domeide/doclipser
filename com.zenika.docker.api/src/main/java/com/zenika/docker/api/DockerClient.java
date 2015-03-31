package com.zenika.docker.api;

public interface DockerClient {
	void infoCommand();
	void defaultBuildCommand(String buildContext);
	void defaultRunCommand(String buildContext);
}
