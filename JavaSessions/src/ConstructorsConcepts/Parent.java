package ConstructorsConcepts;

public class Parent {

	public Parent() {
		System.out.println("parent class constructor");

	}

	public Parent(int i) {
		System.out.println("parent class constructor" + i);

	}

	public Parent(int i, int j) {
		System.out.println("parent class constructor i value " + i);
		System.out.println("parent class constructor j value " + j);
	}

}
