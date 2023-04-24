package methodOverloading;

class Case_05{
	public void methodOne(int i) {
		System.out.println("general method");
	}
	public void methodOne(int...i) {
		System.out.println("var-arg method");
	}
	public static void main(String[] args){
		Case_05 t=new Case_05();
		t.methodOne();//var-arg method
		t.methodOne(10,20);//var-arg method
		t.methodOne(10);//general method 
	}
}