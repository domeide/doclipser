package com.zenika.docker.dsl.resource;

import static com.zenika.docker.dsl.resource.URIs.isDockerfileFile;

import org.eclipse.xtext.resource.impl.DefaultResourceServiceProvider;
import org.eclipse.emf.common.util.URI;

/**
 * Class that provides services (e.g. validation, content description, encoding)
 * to "Dockerfile" files.
 *
 * @see org.eclipse.xtext.resource.IResourceServiceProvider
 *
 */
public class DockerfileResourceServiceProvider extends
		DefaultResourceServiceProvider {

	/**
	 * Indicates that this service provider can only handle URIs that refers to
	 * a "Dockerfile" file.
	 * 
	 * @param uri
	 *            the URI to check. It may be {@code null}.
	 * @return {@code true} if the given URI refers to a "Dockerfile" file;
	 *         {@code false} otherwise.
	 */
	@Override
	public boolean canHandle(URI uri) {
		return isDockerfileFile(uri);
	}
}
