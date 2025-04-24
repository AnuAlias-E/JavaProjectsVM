
public class Square {
	private int size;

	Square() {
		System.out.println("Default square object is created");
	}

	public Square(int size) {
		setSize(size);
		System.out.println("Square Object is created with size " + size);
	}

	int getArea() {
		return size * size;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		if (size < 0) {
			System.out.println("Invalid Size");
			return;
		}
		this.size = size;
	}

}
