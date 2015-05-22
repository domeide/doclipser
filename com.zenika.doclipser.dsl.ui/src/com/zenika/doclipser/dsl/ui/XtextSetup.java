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
package com.zenika.doclipser.dsl.ui;

import static com.zenika.doclipser.dsl.resource.DockerfileContentHandler.DOCKERFILE_FILE_CONTENT_TYPE;
import static org.eclipse.emf.ecore.resource.ContentHandler.Registry.HIGH_PRIORITY;

import org.eclipse.emf.ecore.resource.ContentHandler;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.IResourceServiceProvider;

import com.google.inject.Provider;
import com.zenika.doclipser.dsl.resource.DockerfileContentHandler;

public class XtextSetup {

      static void configureXtextToWorkWithFileNames(InjectorProvider injectorProvider) {
        register(new DockerfileContentHandler());
        register(new ResourceFactoryDescriptor(injectorProvider));
        register(new ResourceServiceProvider(injectorProvider));
      }
     
      private static void register(ContentHandler h) {
        ContentHandler.Registry registry = ContentHandler.Registry.INSTANCE;
        registry.put(HIGH_PRIORITY, h);
      }
     
      private static void register(Resource.Factory.Descriptor d) {
        Resource.Factory.Registry registry = Resource.Factory.Registry.INSTANCE;
        registry.getContentTypeToFactoryMap().put(DOCKERFILE_FILE_CONTENT_TYPE, d);
      }
     
      private static void register(Provider<IResourceServiceProvider> p) {
        IResourceServiceProvider.Registry registry = IResourceServiceProvider.Registry.INSTANCE;
        registry.getContentTypeToFactoryMap().put(DOCKERFILE_FILE_CONTENT_TYPE, p);
      }
}
