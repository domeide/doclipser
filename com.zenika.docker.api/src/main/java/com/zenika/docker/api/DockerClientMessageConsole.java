package com.zenika.docker.api;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.osgi.framework.Bundle;

public class DockerClientMessageConsole {
	
	private MessageConsole dockerMessageConsole;
	private MessageConsoleStream dockerConsoleOut;

	public DockerClientMessageConsole(String name) {
			ConsolePlugin plugin = ConsolePlugin.getDefault();
			IConsoleManager conMan = plugin.getConsoleManager();
			IConsole[] existing = conMan.getConsoles();
			for (int i = 0; i < existing.length; i++) {
				if (name.equals(existing[i].getName())) {
					dockerMessageConsole = (MessageConsole) existing[i];
				    dockerConsoleOut = dockerMessageConsole.newMessageStream();
					return;
				}
			}
			
			// no console found, so create a new one
			Bundle bundle = Platform.getBundle("com.zenika.docker.api");
			ImageDescriptor imageDcr = ImageDescriptor.createFromURL(
	              FileLocator.find(bundle,
	                               new Path("icons/docker-solo.gif"),
	                                        null));
			MessageConsole dockerConsole = new MessageConsole(name, imageDcr);
			conMan.addConsoles(new IConsole[] { dockerConsole });
			
			dockerMessageConsole = dockerConsole;
			dockerConsoleOut = dockerMessageConsole.newMessageStream();

//          Currently does not work: win is always null 
//			(I guess because we are not in the main UI Thread)
//			
//			// get current active page
//			IWorkbench wb = PlatformUI.getWorkbench();
//			IWorkbenchWindow win = wb.getActiveWorkbenchWindow();
//			
//			// on new versions it may need to be changed to:
//			IWorkbenchPage page = win.getActivePage();
//
//			// Reveal the console view
//			String id = IConsoleConstants.ID_CONSOLE_VIEW;
//			IConsoleView view;
//			try {
//				view = (IConsoleView) page.showView(id);
//				view.display(dockerConsole);
//			} catch (PartInitException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
		
	public MessageConsoleStream getDockerConsoleOut() {
		return dockerConsoleOut;
	}
}