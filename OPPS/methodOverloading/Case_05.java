
//In general var-arg method will get less priority that is if no other method matched then
//only var-arg method will get chance for execution it is almost same as default case inside
//switch

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
		t.methodOne(10);//general method  and var method both are match but priority is general method bcz it is old concept
	}
}