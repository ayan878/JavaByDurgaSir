package Constructor;

//	this and super only talks about object, instance related variable
//  we can't use this and super in static area.
class Parent{
	String s ="Parent Variable";
}
class Child extends Parent{
	String s="Child Variable";	
	public void methodOne() {
		System.out.println(s); //Child Variable
		System.out.println(this.s);// current class instance object (Child Variable
		System.out.println(super.s);//Parent class instance object (Parent Variable)
	}

}
public class superAndThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c= new Child();
		c.methodOne();
	}

}
