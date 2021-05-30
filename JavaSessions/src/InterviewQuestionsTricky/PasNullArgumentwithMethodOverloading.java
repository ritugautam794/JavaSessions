package InterviewQuestionsTricky;

public class PasNullArgumentwithMethodOverloading {

	public static void main(String[] args) {
		// create method overloading with object and string objects and check which will be printed
		
		test(null); //string would be called bcz string is more obvious and child class of object
		//it wont allow to overload string buffer argument

	}
	
	public static void test(Object o) {
		System.out.println("object argument");
	}
	
	public static void test(String s) {
		System.out.println("String argument");
	}
	
//	public static void test(StringBuffer s) {
//		System.out.println("String argument");
//	}

}
