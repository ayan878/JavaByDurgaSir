package methodOverriding;

class parent6{
	public void methodOne(int... i) {
		System.out.println("Parent");	
	}
}
class child6 extends parent6{

	public void methodOne(int...i) {
		System.out.println("Child");
	}
}
public class methodOverridingVar_arg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent5 p = new parent5();
		p.methodOne(10); // Parent
		child6 c =new child6();
		c.methodOne(10); // Child
		parent6 pc = new child6();
	
		pc.methodOne(10); // Child (here pc calling the parent methodOne by child class object so it is overriding)

	}

}
// Note: we can only override var-arg method to var-arg method
