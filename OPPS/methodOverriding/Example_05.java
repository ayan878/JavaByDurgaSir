package methodOverriding;

//We should override Parent class abstract methods in Child classes to provide
//implementation.

abstract class parent{
	public abstract void methodOne(); 	
}
class child extends parent{
	public void methodOne() {
		System.out.println("Abstract Implementation");
	}
}
public class Example_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent p =new child();
		p.methodOne();
	}
}
