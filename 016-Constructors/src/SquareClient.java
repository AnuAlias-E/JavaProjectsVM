
public class SquareClient {
public static void main(String[] args) {
	Square s= new Square();
	s.setSize(100);
	System.out.println(s.getSize());
	Square s2=new Square(300);
	System.out.println(s2.getSize());
}
}
