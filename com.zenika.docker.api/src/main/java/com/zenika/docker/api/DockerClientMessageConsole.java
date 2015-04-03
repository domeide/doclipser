package com.zenika.docker.api;

import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleConstants;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.IConsoleView;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;

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
			MessageConsole dockerConsole = new MessageConsole(name, null);
			conMan.addConsoles(new IConsole[] { dockerConsole });
			
			// get current active page
			IWorkbench wb = PlatformUI.getWorkbench();
			IWorkbenchWindow win = wb.getActiveWorkbenchWindow();
			// IWorkbenchPage page = win.getActiveWorkbenchPage();

			// on new versions it may need to be changed to:
			IWorkbenchPage page = win.getActivePage();

			// Reveal the console view
			String id = IConsoleConstants.ID_CONSOLE_VIEW;
			IConsoleView view;
			try {
				view = (IConsoleView) page.showView(id);
				view.display(dockerConsole);
			} catch (PartInitException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			dockerMessageConsole = dockerConsole;
			dockerConsoleOut = dockerMessageConsole.newMessageStream();
		}
		
	public MessageConsoleStream getDockerConsoleOut() {
		return dockerConsoleOut;
	}
}