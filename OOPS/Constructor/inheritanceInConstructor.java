package Constructor;

public class inheritanceInConstructor {

	class P{
		P(int i){}
	}
	class C extends P{
		C(){
			super(10);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//    C c =new C();
    // inheritance not applicable for constructor
	}

}
