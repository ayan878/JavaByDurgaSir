package methodOverloading;


class Animal{ }
class Monkey extends Animal{}

public class Case_06{
	public void methodOne(Animal a) {
		System.out.println("Animal version");
	}
	public void methodOne(Monkey m) {
		System.out.println("Monkey version");
	}
	public static void main(String[] args){
		Case_06 t=new Case_06();
		Animal a=new Animal();
		t.methodOne(a);//Animal version
		Monkey m=new Monkey();
		t.methodOne(m);//Monkey version
		Animal a1=new Monkey(); 
		t.methodOne(a1);//Animal version In overloading method resolution is always based on reference type and 
						//	runtime object won't play any role in overloading. 
	}
}