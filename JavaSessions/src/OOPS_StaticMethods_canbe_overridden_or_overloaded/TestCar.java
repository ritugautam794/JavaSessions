package OOPS_StaticMethods_canbe_overridden_or_overloaded;

public class TestCar {

	public static void main(String[] args) {
		
		BMW b = new BMW();
		b.start(); // normal overriding -non static methods
		b.stop();
		b.refuel();// it says static method should be accessed in static way
		//******static way of accessing refuel() method******************************
		BMW.refuel();//corretct way of accessing static methods by classname
		b.breakdown();
		b.accelerate();
		
		
		BMW.refuel();

	}

}
