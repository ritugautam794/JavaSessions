package ExceptionHandling;

public class throwsKeyword {

	public static void main(String[] args) throws ArithmeticException {

		throwsKeyword obj = new throwsKeyword();
		System.out.println("Before calling sum");
		obj.sum();
		System.out.println("After calling sum");
	}

	public void sum() throws ArithmeticException {
		div();
		System.out.println("inside sum");
	}

	public void div() throws ArithmeticException {
		int i = 9 / 0;
		System.out.println("inside div method");
	}

}
