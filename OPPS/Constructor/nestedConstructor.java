package Constructor;

public class nestedConstructor {
	
	public nestedConstructor() {
		this(10);
	}
	public nestedConstructor( int i){
		this();
	
}
	public static void main(String[] args) {
		
		//CE: recursive constructor invocation
	}

}
