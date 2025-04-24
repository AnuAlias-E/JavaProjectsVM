package com.training.ui;

import com.training.dp.Icon;
import com.training.dp.IconFactory;

public class Main01 {
	public static void main(String[] args) {

		IconFactory iconFactory = new IconFactory();
		Icon fileICon1 = iconFactory.getIcon("File");
		fileICon1.draw(100, 100);

		Icon fileICon2 = iconFactory.getIcon("File");
		fileICon2.draw(150, 150);

		Icon folderICon1 = iconFactory.getIcon("Folder");
		folderICon1.draw(200, 200);
		Icon folderICon2 = iconFactory.getIcon("Folder");
		folderICon2.draw(250, 250);

	}
}
