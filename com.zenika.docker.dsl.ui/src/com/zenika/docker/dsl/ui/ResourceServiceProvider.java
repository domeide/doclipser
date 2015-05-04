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
package com.zenika.docker.dsl.ui;

import org.eclipse.xtext.resource.IResourceServiceProvider;

import com.google.inject.Provider;

/**
 * Guice provider of <code>{@link IResourceServiceProvider}</code>s.
 *
 */
class ResourceServiceProvider implements Provider<IResourceServiceProvider> {
  private final InjectorProvider injectorProvider;

  ResourceServiceProvider(InjectorProvider injectorProvider) {
    this.injectorProvider = injectorProvider;
  }

  @Override public IResourceServiceProvider get() {
    return injectorProvider.getInjector().getInstance(IResourceServiceProvider.class);
  }
}