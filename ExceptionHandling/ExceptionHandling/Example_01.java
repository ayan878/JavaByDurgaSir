package ExceptionHandling; 
//	JVM call all the method recursively(stack) after exception occur and check which method have handling code.
//  if JVM not found handling code the it destroy stack recursively.
//	JVM hand over the responsibility of the exception handling to Default exception handler and it just print the exception information
public class Example_01 
{
	public static void main(String[] args){
		doStuff();
	}
	public static void doStuff(){
		doMoreStuff();
	}
	public static void doMoreStuff(){
		System.out.println(10/0);
	}

}
