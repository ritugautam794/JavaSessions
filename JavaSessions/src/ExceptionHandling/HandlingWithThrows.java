package ExceptionHandling;

public class HandlingWithThrows {

	public static void main(String[] args) throws ArithmeticException {

		throwsKeyword obj = new throwsKeyword();
		System.out.println("Before calling sum");
		obj.sum();
		System.out.println("After calling sum");
	}

	public void sum() throws ArithmeticException{
		try{
			div();
		}
		catch(ArithmeticException e) { 
			e.printStackTrace();
		}
		System.out.println("inside sum");
	}

	public void div() throws ArithmeticException {
		int i = 9 / 0;
		System.out.println("inside div method");
	}

}