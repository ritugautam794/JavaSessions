package OOPSConcepts;

public class Car {
	// class variables
	int model;
	int wheel;
	
	public static void main(String[] args) {
		// new Car(); is the object 
		// new word is used to create objects for a class
		//a,b,c are just the object references variables

		
		System.out.println("Before chanhing the refrences");
		Car a = new Car();
		Car b = new Car();
		Car c = new Car();
		
		a.model = 2014;
		a.wheel = 4;
		
		b.model = 2015;
		b.wheel = 4;
		
		c.model = 2016;
		b.wheel = 4;
		
		System.out.println(a.model);
				
		
		System.out.println("after shifting the refrences");
		a =b;
		b =c;
		c =a;
		
		System.out.println(a.model);
		System.out.println(b.model);
		System.out.println(c.model);
				
		
	}

}
