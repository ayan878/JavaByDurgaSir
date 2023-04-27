package methodOverriding;

class parent5{
	public void methodOne(int... i) {
		System.out.println("Parent");	
	}
}
class child5 extends parent5{
	public void methodOne(int i) {
		System.out.println("Child overloading");
	}
	public void methodOne(int...i) {
		System.out.println("Child Overring");
	}
}
public class methodOverridingVar_arg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent5 p = new parent5();
		p.methodOne(10); // Parent
		child5 c =new child5();
		c.methodOne(10); // Child
		parent5 pc = new child5();
		pc.methodOne(10); // Parent (here pc calling the parent methodOne by reference so it is overloading)
		pc.methodOne(10); // Child overloading (here pc calling the parent methodOne by child class object so it is overriding)

	}

}
// Note: here the method signature is different so method overriding not applicable.it is method overloading
// in overloading resolution is takes care by compiler based on reference type.