package methodOverriding;

//	We should override Parent class abstract methods in Child classes to provide implementation.
abstract class Parent4{
	public abstract void methodOne();
}
class Child4 extends Parent4{
	public void methodOne() {
		System.out.println("Child Method One");
	}
}

public class Example_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent4 p =new Child4();
		p.methodOne();

	}

}
