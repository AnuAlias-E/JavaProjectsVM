package om.training.io;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

import com.training.model.BillItem;

public class Main14 {
	public static void main(String[] args) {
		try {

			InputStream is = new FileInputStream("billItem.dat");
			ObjectInputStream ois = new ObjectInputStream(is);
			BillItem bi = (BillItem) ois.readObject();
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
