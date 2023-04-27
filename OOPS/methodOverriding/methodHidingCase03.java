package methodOverriding;

// Method overloading concept not applicable for static method it is method hiding concept
class parent2{
	public static void methodOne() {
		System.out.println("Parent Static method One");
	}
}
class child2 extends parent2{
	public static void methodOne() { 
		System.out.println("Static Child method One");
	}
	public class methodHidingCase03 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			parent2 p =new parent2();
			p.methodOne(); // here runtime object is parent (parent2())
			child2 c2 = new child2(); // here  runtime object is child ( child())
			c2.methodOne();
			parent2 c = new child2(); //In method overriding resolution is always  take care by jvm  based on run type object .here methodOne() method is a object level hence
			// we can't override methodOne() method
			c.methodOne();
		}
	}
}
// Note: in method hidding resolution is always takes care by compiler based on reference type. and  in method hiding the every method must be static call the method
//in this program  c is reference type which calling Parent methodOne which is not override
//Note: If both Parent and Child class methods are non static then it will become overriding and method
//resolution is based on runtime object.