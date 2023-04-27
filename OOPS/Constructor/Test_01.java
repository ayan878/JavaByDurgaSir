package Constructor;

public class Test_01 {
	// This is method bcz return type concept not applicable for constructor even void.
	// it is legal to use method name same as class name but not recommended
	// the only modifiers allowed are public, default, protected, private.
	 void Test_01() {
		System.out.println("This is Method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t =new Test();
	}

}
