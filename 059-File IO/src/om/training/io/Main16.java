package om.training.io;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

import com.training.model.CourseItem;

public class Main16 {
	public static void main(String[] args) {

		try {

			InputStream is = new FileInputStream("courseItem.dat");
			ObjectInputStream ois = new ObjectInputStream(is);
			CourseItem bi = (CourseItem) ois.readObject();
			System.out.println(bi);

			ois.close();
			is.close();

		} catch (Throwable e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
			System.exit(0);
		}

	}
}
