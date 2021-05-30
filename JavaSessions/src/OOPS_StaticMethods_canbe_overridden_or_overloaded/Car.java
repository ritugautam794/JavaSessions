package OOPS_StaticMethods_canbe_overridden_or_overloaded;

public class Car {
	
	public void start() {		
		System.out.println("Car---start");
	}
	
	public void stop() {		
		System.out.println("Car---stop");
	}
	
	public static void refuel() {		
		System.out.println("Car---refuel");
	}
	
	public static void accelerate() {		
		System.out.println("Car---accelerate");
	}
	
	public static void breakdown() {		
		System.out.println("Car---breakdown");
	}

}
