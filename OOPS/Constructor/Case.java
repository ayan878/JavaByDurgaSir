package Constructor;

//	We can use either super() (or) this() but not both simultaneously.
public class Case {

	public static void main(String[] args) {
		
	}
class Case_01{
Case_01()
{
System.out.println("constructor");
//super(); //CE: call to super must be first statement
}
}
//	We can use either super() (or) this() but not both simultaneously.
class Case_02{
	Case_02(){
	super();
	// this(); CE: call to this must be first statement
}
}
//	 We can use super() (or) this() only inside constructor. If we are using anywhere else we will get compile time error.
class Case_03{
	
//	super();
	
}
}
