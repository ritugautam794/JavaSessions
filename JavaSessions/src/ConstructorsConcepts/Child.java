package ConstructorsConcepts;

public class Child extends Parent {

	public Child() {
		System.out.println("Child Class constructor");
	}

	public static void main(String[] args) {
		// when child class is inheriting parent class and object of child is created
		// 1.compiler checks if parent class const is avilable
		// 2. then checks if child class const is avilable

		Child obj = new Child();

	}

}
