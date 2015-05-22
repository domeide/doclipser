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
package com.zenika.doclipser.api;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

import org.eclipse.core.runtime.FileLocator;

import com.google.common.io.ByteSource;
import com.google.common.io.Resources;

public class DockerConfig {
    private final String version;
    private final String uri;
    private final String username;
    private final String password;
    private final String email;
    private final String serverAddress;
    private final String dockerCertPath;
    private final String propertiesFileFullPath;

    public DockerConfig() {
        final URL url = Resources.getResource(Constants.PROPERTY_FILE_NAME);
        Properties properties = readPropertyFile(url);
        
        
        version = properties.getProperty(Constants.PROPERTY_DOCKER_API_VERSION);
        uri = properties.getProperty(Constants.PROPERTY_DOCKER_URI);
        username = properties.getProperty(Constants.PROPERTY_USERNAME);
        password = properties.getProperty(Constants.PROPERTY_PASSWORD);
        email = properties.getProperty(Constants.PROPERTY_EMAIL);
        serverAddress = properties
                .getProperty(Constants.PROPERTY_DOCKER_SERVER_ADDRESS);
        dockerCertPath = properties
                .getProperty(Constants.PROPERTY_DOCKER_CERT_PATH);

        URL fullUrl = null;
        try {
            fullUrl = FileLocator.resolve(url);
        } catch (IOException e) {
            e.printStackTrace();
        }
        propertiesFileFullPath = fullUrl == null ? null : fullUrl.getPath();
    }

    private Properties readPropertyFile(URL url) {
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

    public String getVersion() {
        return version;
    }

    public String getUri() {
        return uri;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getServerAddress() {
        return serverAddress;
    }

    public String getDockerCertPath() {
        return dockerCertPath;
    }

    public String getPropertiesFileFullPath() {
        return propertiesFileFullPath;
    }
}
