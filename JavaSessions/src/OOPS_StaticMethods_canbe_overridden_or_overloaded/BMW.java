package OOPS_StaticMethods_canbe_overridden_or_overloaded;

public class BMW extends Car{
	
	@Override
	public void start() {
		System.out.println("BMW---car");
	}
	
//	@Override
//	public void refuel() {   // gives error that we cant override static methods from parent class
//		System.out.println("BMW--Refuel");
//	}
	
	public static void refuel() { //adding 'static' doesnt give error, let us allow to override
		System.out.println("BMW--Refuel");
	}
	
//	@Override //when we add annotation to tell compilier that we are overriding this method
//	public static void accelerate() { 
//		System.out.println("BMW---accelerate");
//	}
	
	
	
	
	

	
	

}
