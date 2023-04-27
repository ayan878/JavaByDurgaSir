package methodOverriding;

class Parent {
	public void property(){
		System.out.println("cash+land+gold");
	}
	public void marry() {
		System.out.println("subbalakshmi"); //overridden method
	}


}
class Child extends Parent{ 

	//overriding method
	public void marry() {
		System.out.println("3sha/4me/9tara/anushka");
		//overriding method
	}
}
public class Example_01 {
	public static void main(String[] args){
		Parent p=new Parent();
		p.marry();//subbalakshmi(parent method)
		Child c=new Child();
		c.marry();//Trisha/nayanatara/anushka(child method)
		Parent p1=new Child();
		p1.marry();//Trisha/nayanatara/anushka(child method) In overriding method resolution is always takes care by JVM based on runtime
		// object hence overriding is also considered as runtime polymorphism or dynamic polymorphism or late binding.
	}
}