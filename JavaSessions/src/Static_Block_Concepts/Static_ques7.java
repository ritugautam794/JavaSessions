package Static_Block_Concepts;

public class Static_ques7 {
	// will the static codebe executed here or not?
	// ans - it wont be executed
	// bcz - of compiler optimization-performance activities as it wont load the
	// class bcz the var x is
	// available in meta space in the memory and there is no need to compiler to
	// load the class..in class byecode
	//Main.x will be convertd to 20	

	public static void main(String[] args) {
		// Execeuting static block with final variable and without final variable

		System.out.println(Main.x);
		System.out.println("************************");

	}
}

class Main {
	public static final int x = 100;

	static {
		System.out.println("Main Class..static block");
	}
}
