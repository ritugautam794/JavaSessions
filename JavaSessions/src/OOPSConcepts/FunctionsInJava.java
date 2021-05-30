package OOPSConcepts;

public class FunctionsInJava {
    
	
	//Void doent not return anything
	public static void main(String[] args) {
		// This is a static method
		//To access non static method we have to create a object of the class
          
		
		FunctionsInJava ob = new FunctionsInJava();
		//ob is the reference variable which will be referring to the object of FunctionsInJava class
		// after creating the object, a copy of all non-static methods will be given to this object
		ob.test();
		ob.Testing();
		ob.pqr();
		ob.Division(30, 3);
		
		System.out.println("these are not returning anything yet..we need to retrive results in some variables");
		
		int a = ob.pqr();
		System.out.println(a);
		
		String b = ob.Testing();
		System.out.println(b);
		
		int c = ob.Division(30,10);
		System.out.println(c);
		
	}
	
	//Outside the static method we declare and define non-static methods
	//return type = void
	public void test() {  // No input no output
		System.out.println("Test Method");
	}
	
	//return type = int
	public int pqr() { // no input some output
		System.out.println("PQR Mehod");
		int a = 10;
		int b = 20;
		int c= a+b;
		return c ;
	}
	
	//return type = String
	public String Testing() { // no input some output
		System.out.println("Testing Method");
		String s = "Selenium Testing";
		
		return s;
	}
	
	//return type = int
	public int Division(int x, int y) { // some input and some output
		System.out.println("Division Method");
		
		int z= x/y;
		return z; 
	}

}
