package om.training.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Main02 {
	public static void main(String[] args) throws IOException {
		OutputStream os;
		os = new FileOutputStream("welcome.txt");
		String str = "I am fine...\nHope you are doing good...\nPlease visit us!!!";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			os.write(ch);
		}
		os.flush();// Input and output operations are done by operating system ..Some files have
					// data , so we need to explicitly clear the data
		os.close();
	}
}
