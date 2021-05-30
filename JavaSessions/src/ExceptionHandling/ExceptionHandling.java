package ExceptionHandling;

public class ExceptionHandling {

	int a = 10;
	public static ExceptionHandling ec;

	public static void main(String[] args) {
		// To handle unknown errors/exception while executing the program

		// uncaught exception
//		int i = 9 / 0;
//		System.out.println(i);

		// caught exception
		// Thread.sleep(1000);

		// 1. TRY-CATCH block

		try {
			int j = 9/0;// this code will throw exception
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println("ABC");

	}

}
