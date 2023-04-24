package OOPS;



public class Overloading {

	public void methodOne() {
		System.out.println("no-arg method");
	}
	public void methodOne(int i) {
		System.out.println("int-arg method"); //overloaded methods
	}
	public void methodOne(float d) {
		System.out.println("double-arg method");
	}
	public static void main(String[] args) {
		Overloading t=new Overloading();
		t.methodOne();//no-arg method
		t.methodOne(10);//int-arg method
		t.methodOne(10.5f);//double-arg method
	} 
}

