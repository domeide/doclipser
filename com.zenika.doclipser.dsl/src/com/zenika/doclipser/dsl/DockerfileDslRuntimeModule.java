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
/*
 * generated by Xtext
 */
package com.zenika.doclipser.dsl;

import org.eclipse.xtext.resource.IResourceServiceProvider;

import com.zenika.doclipser.dsl.resource.DockerfileResourceServiceProvider;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class DockerfileDslRuntimeModule extends com.zenika.doclipser.dsl.AbstractDockerfileDslRuntimeModule {

	  public Class<? extends IResourceServiceProvider> bindIResourceServiceProvider() {
	    return DockerfileResourceServiceProvider.class;
	  }
}