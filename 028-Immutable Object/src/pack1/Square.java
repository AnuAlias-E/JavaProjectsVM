package pack1;

public class Square {

	final private int size;
	
	public Square(int size) {
		
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public int getArea() {
		return size*size;
	}
	@Override
	public String toString() {
		return "Square [size=" + size + ", Size=" + getSize() + ", Area=" + getArea() + "]";
	}

	public Square enLarge(int bySize) {
		//this.size=size+bySize;
		Square temp=new Square(this.size+bySize);
		return temp;
	}
	
}
