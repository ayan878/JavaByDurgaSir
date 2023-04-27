package Interfaces;

//	if we can't reduce Access modifier scope like public to default 
interface A{
	public void methodOne();
	public void methodTwo();
}
class B implements A{
	public void methodOne() {
		System.out.println("This is method One");
	}
	public void methodTwo(){
		System.out.println("This is method Two");
	} 
}
public class Example_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		b.methodOne();
		b.methodTwo();
	}

}
