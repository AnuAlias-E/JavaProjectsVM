
public class Square {
	private int size;

	int getArea() {
		return size*size;
	}
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		if(size<0) {
			System.out.println("Invalid Size");
			return;
		}
		this.size = size;
	}
	

}
