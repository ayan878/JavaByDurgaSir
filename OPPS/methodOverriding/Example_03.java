package methodOverloading;

class Parent{
	private void methodOne() {
	}
}
class Child extends Parent {
	private void methodOne() {
	}		
}

public class Example_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Overring Concept not applicable for private methods");
// program is not getting error but overriding concept not perform bcz of private method
	}
}
