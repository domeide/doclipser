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