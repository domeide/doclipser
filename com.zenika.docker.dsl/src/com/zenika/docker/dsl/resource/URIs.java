package com.zenika.docker.dsl.resource;

import org.eclipse.emf.common.util.URI;

public final class URIs {

	  /**
	   * Indicates whether the given <code>{@link URI}</code> refers to a "Dockerfile" file.
	   * @param uri the given {@code URI}. It may be {@code null}.
	   * @return {@code true} if the given {@code URI} belongs to a "Dockerfile" file, {@code false}
	   * otherwise.
	   */
	  static boolean isDockerfileFile(URI uri) {
	    if (uri == null) return false;
	    String fileName = uri.lastSegment();
	    return "Dockerfile".equals(fileName);
	  }

	  private URIs() {}

}
