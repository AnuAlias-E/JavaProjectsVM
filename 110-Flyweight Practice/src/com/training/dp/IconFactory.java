package com.training.dp;

import java.util.HashMap;
import java.util.Map;

public class IconFactory {
	private static final Map<String, Icon> iconCache = new HashMap<>();

	public Icon getIcon(String key) {
		if (iconCache.containsKey(key)) {
			return iconCache.get(key);
		} else {
			Icon icon;
			if (key.equals("File")) {
				icon = new FileIcon("document", "document.png");
			} else if (key.equals("Folder")) {
				icon = new FolderIcon("blue", "folder.png");
			} else {
				throw new IllegalArgumentException("Unsuporrted icon type" + key);
			}
			iconCache.put(key, icon);
			return icon;
		}
	}
}
