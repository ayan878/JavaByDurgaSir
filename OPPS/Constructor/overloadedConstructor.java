package Constructor;

public class overloadedConstructor {

	public overloadedConstructor(double d) {
		this(10);
		System.out.println("double-arg Constructor");
	}
	public overloadedConstructor(int i) {
		this();
		System.out.println("int-arg Constructor");
	}
	public overloadedConstructor() {
		System.out.println("no-arg Constructor");
	}
	public static void main(String[] args) {

		overloadedConstructor con = new overloadedConstructor(10.5);
		//Output:
		//	no-arg Constructor
		//	int-arg Constructor
		//	double-arg Constructor	

		overloadedConstructor cons =new overloadedConstructor(10);
		//Output:
		//	no-arg Constructor
		//	int-arg Constructor

		overloadedConstructor co = new overloadedConstructor();
		//Output:
		//	no-arg Constructor
		
	}

}
