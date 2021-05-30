package Static_Block_Concepts;

public class static_ques9 {

	static {
		System.out.println("static block");
	}
	
	{
		System.out.println("initialization block");
	}
	
	static_ques9(){
		System.out.println("constructor");
	}

	public static void main(String[] args) {
	 System.out.println("main method");
	 new static_ques9();
	}

}
