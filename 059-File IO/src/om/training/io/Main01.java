package om.training.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main01 {
	public static void main(String[] args) throws IOException {
		InputStream is;
		is = new FileInputStream("hello.txt");
		// Reading as byte stream
		while (true) {
			int i = is.read();
			if (i == -1)
				break;
			char ch = (char) i;
			System.out.print(ch);
		}

		is.close();

	}
}
