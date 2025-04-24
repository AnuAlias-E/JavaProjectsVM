package om.training.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Main07 {
	public static void main(String[] args) throws IOException {
		InputStream is = null;
		Reader reader = null;
		BufferedReader br = null;

		try {
			is = new FileInputStream("hello.txt");
			reader = new InputStreamReader(is);
			br = new BufferedReader(reader);
		} catch (FileNotFoundException e) {
			System.err.println("Some error while opening the file");
			// System.exit(0);
		}
		while (true) {

			try {
				String str = br.readLine();
				if (str == null) {
					break;
				}

				System.out.println(str);
			} catch (IOException e) {
				System.err.println("Some error while reading the file");
				System.exit(0);
			}

		}
		try {
			br.close();
			reader.close();
			is.close();
		} catch (IOException e) {
			System.err.println("Some error while closing the file");
			System.exit(0);
		}
	}
}
