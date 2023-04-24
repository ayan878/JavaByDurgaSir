package methodOverloading;

//We should override Parent class abstract methods in Child classes to provide
//implementation.

abstract class Parent1{
	public abstract void methodOne(); 	
}
class Child1 extends Parent1{
	public void methodOne() {
		System.out.println("Abstract Implementation");
	}
}
public class Example_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent1 p =new Child1();
		p.methodOne();
	}
}
