package OOPSConcepts;

public class StaticNonStaticMethods {
	//global variables: these will be available to all the methods with condition on how to access
	// depending upon static or non static
	
	String name =" tom"; 
	static int age = 20;
			
	
	public static void main(String [] args) {
		//To access non-static methods are variables, we need object reference to class object
		
		StaticNonStaticMethods ob = new StaticNonStaticMethods();
		ob.nonstatic();
		System.out.println(ob.name);
		
		
		//To access static method and variables
		
		System.out.println(age);
		System.out.println(StaticNonStaticMethods.age);
		
		statictest(); //direct call for static methods
		StaticNonStaticMethods.statictest(); // using classname.property
		
		//3. can i call static methods using object reference--yes but warning is provided
		ob.statictest();
			
	}

	
	public void nonstatic() {
		System.out.println("I'm non-static method and needs class object");		
	}
	
	public static void statictest() {
		System.out.println("I'm static method and freely avilable to be accessed directly");
		
	}
}
