package OPPSConceptsPart2;

public class BMW extends Car {
	
	//when same method with same name and aruguments is present is parent class and child class,
	//it is called method overriding.
	public void start() { //overriden method
		System.out.println("BMW---start");
	}
	
	public void theftsafety() {
		System.out.println("BMW---theft safety");
	}

}
