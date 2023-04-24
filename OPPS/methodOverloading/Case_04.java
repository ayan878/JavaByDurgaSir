package methodOverloading;

public class Case_04 {
	
	public void methodOne(int i,float f) {
		System.out.println("int-float method");
	}
	public void methodOne(float f,int i) {
		System.out.println("float-int method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Case_04 c =new Case_04();
		c.methodOne(10, 10.5f);
		c.methodOne(10.5f, 10);
	}

}
