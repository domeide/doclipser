package com.zenika.docker.api;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.net.URL;
import java.util.Properties;

import org.apache.commons.io.IOUtils;
import org.apache.commons.io.LineIterator;
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

import com.github.dockerjava.api.model.Info;
import com.github.dockerjava.core.DockerClientBuilder;
import com.github.dockerjava.core.DockerClientConfig;
import com.google.common.io.ByteSource;
import com.google.common.io.Resources;

public class DockerClientJavaApi implements DockerClient {

	private final String version;
	private final String uri;
	private final String username;
	private final String password;
	private final String email;
	private final String serverAddress;
	private final String dockerCertPath;

	private final DockerClientConfig dockerConfig;
	private final com.github.dockerjava.api.DockerClient dockerClient;

	public DockerClientJavaApi() {
		Properties properties = getPropertyFile();
		version = properties.getProperty(Constants.PROPERTY_DOCKER_API_VERSION);
		uri = properties.getProperty(Constants.PROPERTY_DOCKER_URI);
		username = properties.getProperty(Constants.PROPERTY_USERNAME);
		password = properties.getProperty(Constants.PROPERTY_PASSWORD);
		email = properties.getProperty(Constants.PROPERTY_EMAIL);
		serverAddress = properties
				.getProperty(Constants.PROPERTY_DOCKER_SERVER_ADDRESS);
		dockerCertPath = properties
				.getProperty(Constants.PROPERTY_DOCKER_CERT_PATH);

		dockerConfig = DockerClientConfig.createDefaultConfigBuilder()
				.withVersion(version).withUri(uri).withUsername(username)
				.withPassword(password).withEmail(email)
				.withServerAddress(serverAddress)
				.withDockerCertPath(dockerCertPath).build();

		dockerClient = DockerClientBuilder.getInstance(dockerConfig).build();
	}

	private Properties getPropertyFile() {
		final URL url = Resources.getResource(Constants.PROPERTY_FILE_NAME);
		final ByteSource byteSource = Resources.asByteSource(url);
		final Properties properties = new Properties();
		InputStream inputStream = null;
		try {
			inputStream = byteSource.openBufferedStream();
			properties.load(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (final IOException ioException) {
					ioException.printStackTrace();
				}
			}
		}
		return properties;
	}

	@Override
	public void infoCommand() {
		Info info = dockerClient.infoCmd().exec();
		System.out.print(info);
	}

	@Override
	public void defaultBuildCommand(String buildContext) {
		File baseDir = new File(buildContext);
		InputStream response = dockerClient.buildImageCmd(baseDir).exec();
		StringWriter logwriter = new StringWriter();
		MessageConsole dockerConsole = findConsole(Constants.CONSOLE_NAME);
		MessageConsoleStream dockerConsoleOut = dockerConsole.newMessageStream();
		dockerConsoleOut.println(">>> Building " + buildContext + "/Dockerfile with default options");
		dockerConsoleOut.println("");

		try {
			dockerConsoleOut.flush();
			LineIterator itr = IOUtils.lineIterator(response, "UTF-8");
			while (itr.hasNext()) {
				String line = itr.next();
				logwriter.write(line);
				dockerConsoleOut.println(line);
				dockerConsoleOut.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			IOUtils.closeQuietly(response);
		}

		dockerConsoleOut.println("");
		dockerConsoleOut.println("<<< Build ended");
	}

	@Override
	public void defaultRunCommand(String buildContext) {
	}

	private MessageConsole findConsole(String name) {
		ConsolePlugin plugin = ConsolePlugin.getDefault();
		IConsoleManager conMan = plugin.getConsoleManager();
		IConsole[] existing = conMan.getConsoles();
		for (int i = 0; i < existing.length; i++)
			if (name.equals(existing[i].getName()))
				return (MessageConsole) existing[i];
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

		return dockerConsole;

	}
}
