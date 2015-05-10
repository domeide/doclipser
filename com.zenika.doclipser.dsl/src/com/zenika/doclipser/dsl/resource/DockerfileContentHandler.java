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
package com.zenika.doclipser.dsl.resource;

import org.eclipse.emf.ecore.resource.impl.ContentHandlerImpl;
import static com.zenika.doclipser.dsl.resource.URIs.isDockerfileFile;
import static org.eclipse.emf.ecore.resource.ContentHandler.Validity.VALID;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import org.eclipse.emf.common.util.URI;


public class DockerfileContentHandler extends ContentHandlerImpl {
	
	 /** Content type for "Dockerfile" files. */
	  public static final String DOCKERFILE_FILE_CONTENT_TYPE = "com.zenika.doclipser.dsl.dockerfileDsl.Dockerfile";

	  /**
	   * Indicates that this content handler can only handle URIs that belong to a "Dockerfile" files.
	   * @param uri the URI to check. It may be {@code null}.
	   * @return {@code true} if the given URI belongs to a "Dockerfile" file; {@code false} otherwise.
	   */
	  @Override public boolean canHandle(URI uri) {
	    return isDockerfileFile(uri);
	  }

	  /**
	   * Returns a map of properties that describe the content of the given URI's corresponding input
	   * stream. If the given URI refers to a "Dockerfile" file, this method will mark the contents as valid
	   * and it will assign the content type appropiately.
	   * @param uri the URI for which to determine the content description.
	   * @param inputStream the {@code InputStream} associated with the given URI.
	   * @param options direct what kind of description is needed.
	   * @param context contextual information that content handlers use to store partially computed
	   * results.
	   * @return a map of properties that describe the content of the given URI's corresponding input
	   * stream.
	   * @throws IOException if there is a problem reading the stream.
	   */
	  @Override public Map<String, Object> contentDescription(URI uri, InputStream inputStream,
	      Map<?, ?> options, Map<Object, Object> context) throws IOException {
	    Map<String, Object> description = super.contentDescription(uri, inputStream, options, context);
	    if (canHandle(uri)) {
	      description.put(VALIDITY_PROPERTY, VALID);
	      description.put(CONTENT_TYPE_PROPERTY, DOCKERFILE_FILE_CONTENT_TYPE);
	    }
	    return description;
	  }

}
