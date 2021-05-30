package CanMainMethodbeOverloaded;

public class A {

	public static void main(String[] args) {
		System.out.println("Inside A main method");
		B.main(args); // Running this program will give java.lang.StackOverflowError
		//delete last line and then run to run without any error

	}

}
