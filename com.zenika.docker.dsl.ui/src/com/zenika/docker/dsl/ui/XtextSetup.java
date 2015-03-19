package com.zenika.docker.dsl.ui;

import static com.zenika.docker.dsl.resource.DockerfileContentHandler.DOCKERFILE_FILE_CONTENT_TYPE;
import static org.eclipse.emf.ecore.resource.ContentHandler.Registry.HIGH_PRIORITY;

import org.eclipse.emf.ecore.resource.ContentHandler;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.IResourceServiceProvider;

import com.google.inject.Provider;
import com.zenika.docker.dsl.resource.DockerfileContentHandler;

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
