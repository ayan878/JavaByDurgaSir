package String;

public class toStringMethod {
	String name ;int rollno;
	public String toString() {
		return name+" "+rollno;
	}
	public toStringMethod(String name,int rollno) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.rollno=rollno;		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		toStringMethod s =new toStringMethod("Ayan",45);
		System.out.println(s);

	}

}
