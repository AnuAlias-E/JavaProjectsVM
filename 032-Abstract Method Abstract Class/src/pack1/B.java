package pack1;

public class B extends A {
	@Override
	public void test1() {
		System.out.println("B test1");
	}
//	public void test2() {//Cannot overiide final method in Class A
//		System.out.println("B test2");
//	}

	@Override
	public void test3() {

		System.out.println("B test3");
	}

}
