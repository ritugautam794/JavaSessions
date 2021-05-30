package CanMainMethodbeOverloaded;

public class Test {
	// JVM will start execution from Main() Public sttaic void main with String[]
	// args aruguments
	public static void main(String[] args) {
		System.out.println("Main Method-1");
		main(10);
		main("hello");
		main(10, 20);
	}

	public static void main(int a) {
		System.out.println("Main Method-2");
	}

	public static void main(String a) {
		System.out.println("Main Method-3");
	}

	public static void main(int a, int b) {
		System.out.println("Main Method-4");
	}

}
