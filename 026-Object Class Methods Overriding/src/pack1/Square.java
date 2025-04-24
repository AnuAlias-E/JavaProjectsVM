package pack1;

public class Square {
private int size;

public Square(int size) {
	super();
	this.size = size;
}

public int calculateArea() {
	return this.size*this.size;
}

@Override
public String toString() {
	return "Square [Size=" + size + " Area="+calculateArea()+"]";
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + size;
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (!(obj instanceof Square))
		return false;
	Square other = (Square) obj;
	if (this.size != other.size)
		return false;
	return true;
}



}
