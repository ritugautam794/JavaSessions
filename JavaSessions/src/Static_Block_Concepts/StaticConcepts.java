package Static_Block_Concepts;

public class StaticConcepts {

	// static block is always executed when the class is loaded even before main
	// method is called

	static {
		System.out.println("Static block A");
	}
	static {
		System.out.println("Static block B");
	}
	static {
		System.out.println("Static block C");
	}

	public static void main(String[] args) {
		System.out.println("main method");
	}

	static {
		System.out.println("Static block D");
	}

}
