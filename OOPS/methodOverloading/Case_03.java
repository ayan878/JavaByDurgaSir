package methodOverloading;


public class Case_03 {

	public void methodOne(String s) {
		System.out.println("String version");
	}
	public void methodOne(StringBuffer s) {
		System.out.println("StringBuffer version");
	}
	public static void main(String[] args) {
		Case_03 t=new Case_03();
		t.methodOne("arun");//String version
		t.methodOne(new StringBuffer("sai"));//StringBuffer version
		//t.methodOne(null);//CE : reference to m1() is ambiquous bcz both Strring and stringbuffer  are child class of Object
	}

}