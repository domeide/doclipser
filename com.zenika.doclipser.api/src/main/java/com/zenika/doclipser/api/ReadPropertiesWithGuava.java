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

import com.google.common.io.ByteSource;
import com.google.common.io.Resources;

/**
 * Reads a properties file and print all the key value pairs to the console.
 * Note: Writing to console is just for convenience here.
 */
public final class ReadPropertiesWithGuava {

    public final static void main(final String[] args) {
        final URL url = Resources.getResource(Constants.PROPERTY_FILE_NAME);
        final ByteSource byteSource = Resources.asByteSource(url);
        final Properties properties = new Properties();
        InputStream inputStream = null;
        try {
            inputStream = byteSource.openBufferedStream();
            properties.load(inputStream);
            properties.list(System.out);
        } catch (final IOException ioException) {
            ioException.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (final IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        }
    }
}