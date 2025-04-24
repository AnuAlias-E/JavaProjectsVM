package om.training.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import com.training.model.CourseItem;

public class Main15 {
	public static void main(String[] args) {
		try {
			CourseItem ci = new CourseItem("HTML", 40, 4500.00);

			OutputStream os = new FileOutputStream("courseItem.dat");
			ObjectOutputStream oos = new ObjectOutputStream(os);
			oos.writeObject(ci);

			oos.flush();
			oos.close();
			os.close();
		} catch (Throwable e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
			System.exit(0);
		}
	}
}
