package Constructor;

public class nestedMethod {

	public static void methodOne() {
		methodTwo();
	}
	public static void methodTwo() {
		methodOne();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodOne();//	R.E:StackoverflowError
		System.out.println("hello");
	}

}
