package Static_Block_Concepts;

public class Call_Static_method_from_other_staticmethod {
	
	/*
	 * 1. explain static block in java?
	 * 2. how can we run any program without making any object
	 * 3. can we call one static method from another static method?
	 * 4. how can we create object if we make constructors private?
	 * 5. is it possible to run/compile any java program without main() method?
	 * 6. can we initialize member variables within static block?
	 * 7. Similarity and differences between static block and static method
	 */

	static {
		System.out.println("static block A");
	}

	public static void test() {
		System.out.println("static test method");
	}
	
	public static void Cover() {
		System.out.println("static cover method");
		test();
	}
	
	public static void main(String[] args) {
		System.out.println("main method");
		Cover();
		
	}

	

	

}
