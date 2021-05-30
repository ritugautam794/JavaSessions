package ConstructorsConcepts;

public class ConstructorwithThisWord {

	int age;
	String name;

	public ConstructorwithThisWord(int age, String name) {
		this.age = age;
		this.name = name;
		System.out.println(this.age);
		System.out.println(this.name);

	}

	public static void main(String[] args) {

		ConstructorwithThisWord obj = new ConstructorwithThisWord(20, "Monika");

	}

}
