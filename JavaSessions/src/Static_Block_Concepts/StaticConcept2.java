package Static_Block_Concepts;

public class StaticConcept2 {
	// How can we run any program without making any object

	static {
		System.out.println("static block A");
	}

	public static void main(String[] args) {
		System.out.println("main method");
		test();
		StaticConcept2.test();
	}

	static {
		System.out.println("static block B");
	}

	public static void test() {
		System.out.println("static test method");
	}

}
