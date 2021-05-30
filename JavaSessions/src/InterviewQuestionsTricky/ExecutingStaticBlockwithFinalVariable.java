package InterviewQuestionsTricky;

public class ExecutingStaticBlockwithFinalVariable {

	public static void main(String[] args) {
		// Execeuting static block with final variable and without final variable
		
		System.out.println(Main.x);
		System.out.println("************************");
		System.out.println(Main2.x);

	}
}

class Main {
	public static final int x = 100;

	static {
		System.out.println("Main Class..static block");
	}
}

class Main2 {
	public static int x = 200;

	static {
		System.out.println("Main2 Class..static block");
	}
}
