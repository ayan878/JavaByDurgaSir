package methodOverriding;

// Method overloading concept not applicable for static method it is method hiding concept
	class parent2{
		public static void methodOne() {
			System.out.println(" Parent Static method One");
		}
	}
class child2 extends parent2{
	public static void methodOne() { 
		System.out.println("Static Child method One");
	}
	public class methodHidingCase03 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	parent2 c = new child2(); 
	c.methodOne();
		}
}
}
