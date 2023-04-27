package methodOverriding;

public class Example_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// While overriding we can't reduce the scope of access modifier.

	class Parent {
	public void methodOne() { }
	}
	class Child extends Parent {
	// protected void methodOne( ) { } CE:methodOne() in Child cannot override methodOne() in Parent
	}
	
}

//Output:
//Compile time error :
//methodOne() in Child cannot override methodOne() in Parent;
//attempting to assign weaker access privileges; was public