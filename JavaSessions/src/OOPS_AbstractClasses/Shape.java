package OOPS_AbstractClasses;

public abstract class Shape {
	// an abstract class can have both abstract and non abstract methods(min 1 abstract method is required)
	String color ;
	
	public Shape(){
		System.out.println("parent class constructor");
	}
	
	public abstract void fill();// no body for abstract method
	
	public void drawing() {
		System.out.println("Shape--non abstract method");
	}

	//Shape s = new Shape();// can't instantiate abstract class
}
