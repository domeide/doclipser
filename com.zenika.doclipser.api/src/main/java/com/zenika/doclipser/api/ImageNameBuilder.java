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

import java.io.File;

public class ImageNameBuilder {

    public static String buildImageName(String projectName, String buildContext) {
        File file = new File(buildContext);
        String containingFolder = file.getName();
        
        if (projectName.equals(containingFolder)) {
            return projectName.toLowerCase();
        } else {
            return projectName.toLowerCase() + "_" + containingFolder.toLowerCase();
        }
    }
}
