package methodOverloading;

class Case_01
{
	public void methodOne(int i)
	{
		System.out.println("int-arg method");
	}
	public void methodOne(float f) //overloaded methods
	{
		System.out.println("float-arg method");
	}
	public static void main(String[] args)
	{
		Case_01 t=new Case_01();
		t.methodOne('a');//int-arg method (int i promote to char)
		t.methodOne(10l);//float-arg method (float f promote to long)
		//t.methodOne(10.5);//C.E:cannot find symbol
	}
}