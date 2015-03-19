package com.zenika.docker.dsl.ui;

import static com.zenika.docker.dsl.ui.internal.DockerfileDslActivator.COM_ZENIKA_DOCKER_DSL_DOCKERFILEDSL;

import com.google.inject.Injector;
import com.zenika.docker.dsl.ui.internal.DockerfileDslActivator;

public class InjectorProvider {
	public Injector getInjector() {
		return DockerfileDslActivator.getInstance().getInjector(
				COM_ZENIKA_DOCKER_DSL_DOCKERFILEDSL);
	}
}
