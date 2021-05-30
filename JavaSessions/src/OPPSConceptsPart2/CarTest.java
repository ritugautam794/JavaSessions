package OPPSConceptsPart2;

public class CarTest {

	public static void main(String[] args) {
		
		BMW b = new BMW();
		
		b.start();   //bmw  -- start
		//static polymorphism /compile time polymorphism
		b.stop();    //car
		b.refeul();  //car
		b.theftsafety();  //bmw
		b.engine();
		
		
		System.out.println("*********************");
		
		Car c = new Car();
		
		c.start();
		c.stop();
		c.refeul();
		c.engine();
		
		System.out.println("*********************");
		//top casting
		// Run time polymorphism /Dynamic polymorphism-
		// when child class object is referred by parent class reference variable
		Car c1 = new BMW();
		c1.start();
		c1.stop();
		c1.refeul();
		c1.engine();

		//Down Casting
	//	 BMW b1 = new Car(); 
		 // not allowed -parent class object cannot be referred by child class ref variable
		
		BMW B1 =(BMW) new Car(); //allowed syntactically but gives error while running/runtime
		//java.lang.ClassCastException

	}

}
