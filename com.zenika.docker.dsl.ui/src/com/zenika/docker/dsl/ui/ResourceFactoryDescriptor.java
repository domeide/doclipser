package com.zenika.docker.dsl.ui;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.IResourceFactory;

/**
 * Class that obtains instances of <code>{@link IResourceFactory}</code> from Guice.
 *
 */
class ResourceFactoryDescriptor implements Resource.Factory.Descriptor {
  private final InjectorProvider injectorProvider;

  ResourceFactoryDescriptor(InjectorProvider injectorProvider) {
    this.injectorProvider = injectorProvider;
  }

  @Override public Resource.Factory createFactory() {
    return injectorProvider.getInjector().getInstance(IResourceFactory.class);
  }
}