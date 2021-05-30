package ConstructorsConcepts;

public class SuperConcepts extends Parent {

	public SuperConcepts() {
		super();
		// super(10);// now allowed- as only "super: keyword is first statement in the
		// contrsuctor
		System.out.println("Child Class constructor with 0 args");
	}

	public SuperConcepts(int i) {
		super(i);
		System.out.println("Child Class constructor with 1 args");

	}

	public SuperConcepts(int i, int j) {
		super(i, j);
		System.out.println("Child Class constructor with 2 args");
	}

	public static void main(String[] args) {
		// when child class is inheriting parent class and object of child is created
		// . 1.compiler checks if parent class const is avilable
		// 2. then checks if child class const is avilable

		SuperConcepts obj = new SuperConcepts();
		SuperConcepts obj1 = new SuperConcepts(10);
		SuperConcepts obj2 = new SuperConcepts(23, 45);

	}

}
