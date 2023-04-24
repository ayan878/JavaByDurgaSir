package methodOverriding;


// Case 02:
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
