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