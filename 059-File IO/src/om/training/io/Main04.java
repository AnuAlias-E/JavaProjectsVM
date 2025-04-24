package om.training.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Main04 {
	public static void main(String[] args) {

		OutputStream os = null;
		try {
			os = new FileOutputStream("welcome.txt");
		} catch (FileNotFoundException e) {
			System.err.println("Some error while creating welcome.txt file.");
			System.exit(0);
		}
		String str = "I am fine...\nHope you are doing good...\nPlease visit us!!!\nThank you";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			try {
				os.write(ch);
			} catch (IOException e) {
				System.err.println("Some Error while writing data to the file");
				System.exit(0);
			}
		}
		try {
			os.flush();
			// Input and output operations are done by operating system ..Some files have
			// data , so we need to explicitly clear the data
			os.close();
		} catch (IOException e) {
			System.err.println("Some error while clearing data and closing the ouput stream");
			System.exit(0);
		}

	}
}
