package OOPSConcepts;

public class MthodOverloading {

	public static void main(String[] args) {
		//overloading - having multiple methods with same name but different parameters
		//1. Main method can also be overloaded
		//2. duplicate methods- same name + same parameter not allowed
		
		MthodOverloading ob = new MthodOverloading();
		ob.sum();
		ob.sum(10);
		ob.sum(10, 20);

	}
	
	public static void main() {
		//main method can be overloaded with different parameters
	}

	
	public void sum() {
		System.out.println("O-Prarameters");
	}
	
	public void sum(int i) {
		System.out.println("1-parameters");
	}
	
	public void sum(int i,int j) {
		System.out.println("2 parameters");
	}
}
