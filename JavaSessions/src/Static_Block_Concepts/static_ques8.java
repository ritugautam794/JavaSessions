package Static_Block_Concepts;

public class static_ques8 {
	// which one will be called first
	
	static {
		System.out.println("static block");
	}
	
	{
		System.out.println("initialization block");
	}
	
	static_ques8(){
		System.out.println("constructor");
	}

	public static void main(String[] args) {
	 System.out.println("main method");
	}

}
