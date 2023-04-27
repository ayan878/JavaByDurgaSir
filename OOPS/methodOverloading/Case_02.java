package methodOverloading;

public class Case_02
{
	public void methodOne(String s)
	{
		System.out.println("String version");
	}
	public void methodOne(Object o) //Both methods are said to
	//be overloaded methods.
	{
		System.out.println("Object version");
	}
	public static void main(String[] args)
	{
		Case_02 t=new Case_02();
		t.methodOne("arun");//String version
		t.methodOne(new Object());//Object version (Object is parent class of String)
		t.methodOne(null);//String version (null is reference to child class String)
	}
}