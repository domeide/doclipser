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

import static com.zenika.doclipser.dsl.resource.URIs.isDockerfileFile;

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
