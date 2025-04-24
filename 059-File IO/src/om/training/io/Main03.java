package om.training.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Main03 {
	public static void main(String[] args) {

		InputStream is = null;
		try {
			is = new FileInputStream("hello.txt");
		} catch (FileNotFoundException e) {
			System.err.println("hello.txt not found");
			System.exit(0);

		}
		while (true) {
			try {
				int i;
				i = is.read();
				if (i == -1)
					break;
				char ch = (char) i;
				System.out.print(ch);
			} catch (IOException e) {
				System.err.println("Some error while reading ... from file");
				System.exit(0);
			}
		}

		try {
			is.close();
		} catch (IOException e) {
			System.err.println("Some Error while closing the file");
			System.exit(0);
		}

	}
}
