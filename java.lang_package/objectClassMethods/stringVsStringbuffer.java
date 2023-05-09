package objectClassMethods;

public class stringVsStringbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= new String("ayan");
		String s1 = new String("ayan");
		System.out.println(s==s1); //false
		System.out.println(s.equals(s1)); //true ,in string class .equal() compare conten.which means it automatically overridden 
		StringBuffer sb= new StringBuffer("ayan");
		StringBuffer sb1 = new StringBuffer("ayan");
		System.out.println(sb==sb1); //false
		System.out.println(sb.equals(sb1)); //false ,in StringBuffer class .equal() compare reference of object.which means it doesn't overridden 

	}

}
