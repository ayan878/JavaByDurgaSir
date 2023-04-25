package methodOverriding;


// Case 02:
//both method are not static than resolution is take care by jvm based on runtime object. but it can't override it get CE. bcz we cant override non-static method to static method
public class methodHidingCase02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// Method Hiding
	class parent{
		// here the methodOne is object level 
		public void methodOne() {
			System.out.println("Parent methodOne");
		}
	}
	class child extends parent{
		// here the methodOne is a class level hence we can't override methodOne
		public static void methodOne() {
			
		}
	}

}
