package methodOverriding;

//co-variant: Child return type need not be same as Parent return type and it is only applicable for object types but for primitives type
//return type must be same or child but parent like Object->String,Stringbuffer and Number->int,float,long,double while overriding method 
public class Example_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	class Parent{
		public Object methodOne() {
			return null;
		}
	}
	class Child{
		public String methodOne() {
			return null;
		}
				
	}
}
