package FinalVsFInallyVsFinalize;

public class FinallyConcept {

	public static void main(String[] args) {
		// 
		
		test1();
		System.out.println("**************************");
		test2();
		System.out.println("**************************");
		division();
		System.out.println("**************************");
		division2();

	}
	
	public static void test1() {
		try {
			System.out.println("inside the test1 method");
			throw new RuntimeException("test1");
		}catch(Exception e){
			System.out.println("inside the catch block of test1");	
		}
		finally {
			System.out.println("inside the finally block of test1");
		}
	}
	
	public static void test2() {
		try {
			System.out.println("inside try block of test2 method");
		}finally {
			System.out.println("inside the finally block of test2 ");
		}
	}

	
	public static void division() {
		
		int i = 10;
		try {
			System.out.println("inside divison method");
			int k =i/0;
		} catch(ArithmeticException e ){
			System.out.println("inside catch block of division method");
			System.out.println("divisom by zero error");
	    }finally {
	    	System.out.println("execute this code even after any exception");
		
	}
	}
		
		public static void division2() {
			
			int i = 10;
			try {
				System.out.println("inside divison method2");
				int k =i/0;
			} catch(NullPointerException e ){//incorrect exception..hence we get exception
				System.out.println("inside catch block of division method2");
				System.out.println("divisom by zero error2");
		    }finally {
		    	System.out.println("execute this code even after any exception2");
			
		}
	  
}
}
