package com.zenika.docker.api;

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
