package OOPSConcepts;

public class SingletonConcept {

	// In OOP, singleton class is the class which can have only one object(one
	// instance of the class)
	// at one particular point of time
	// How to design singleton class?
	// 1. make constructor as private
	// 2. write public static method(get instance) that has return type a the object
	// of this singleton class

	private static SingletonConcept singleton_instance = null;
	public String str;

	private SingletonConcept() {
		str = "hey i am using singleton class";
	}

	public static SingletonConcept getInstance() {
		if (singleton_instance == null) {
			singleton_instance = new SingletonConcept();
		}
		return singleton_instance;

	}

	public static void main(String[] args) {

		SingletonConcept x = SingletonConcept.getInstance();
		SingletonConcept y = SingletonConcept.getInstance();
		SingletonConcept z = SingletonConcept.getInstance();

		x.str = (x.str).toUpperCase();

		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);

	}

}
