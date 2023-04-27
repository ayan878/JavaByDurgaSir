package Interfaces;

interface A1{
	public void methodOne();
	public void methodTwo();
}
//	 if we want to implement partial method than we should us abstract class
abstract class B1 implements A{
	public void methodOne() {
		System.out.println("This is method One");
	}
}
public class Example_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		b.methodOne();
		b.methodTwo();
	}

}
