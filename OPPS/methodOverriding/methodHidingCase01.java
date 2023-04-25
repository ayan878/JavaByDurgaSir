package methodOverriding;

// Case 01:
// both method are not static than resolution is take care by jvm based on runtime object. but it can't override it get CE bcz we cant override static method to non-static method
public class methodHidingCase01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// Method Hiding
	class parent{
		// here the static methodOne is class level 
		public static void methodOne() {
			System.out.println("Parent methodOne");
		}
	}
	class child1 extends parent{
		// here the methodOne is a object level hence we can't override methodOne
		public void methodOne() {
			
		}
	}

}
