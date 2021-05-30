package Basics;

public class ComparisionOperators {

	public static void main(String[] args) {
		// Comparison operators: >< >= <= == != 
		//& | 
		
		int a = 10;
		int b = 20;
		
		if(a>b) {
			System.out.println("a is greatest");	
		}else {
			System.out.println("b is greatest");
		}

	
		int x = 100;
		int y = 500;
		int z = 200; 
	
	//to find the highest of three numbers
	
		if(x>y & x>z) { 
			System.out.println("x is highest");
		}else if(y>z)
		{
			System.out.println("y is greatest");
		}else {
			System.out.println("z is greatest");
		}

  }
}
