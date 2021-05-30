package Basics;

public class StringConcatenation {

	public static void main(String[] args) {
		// TODO 
		//1. To learn about "+" operator in concatenation for strings and numbers...
		// ..it takes place from left to right
		// 2. Difference between print and println
		//println-- it prints on console and move cursor to next line.
		
		int a = 100;
		int b = 200;
		
		String x= "hello";
		String y= "world";
		
		System.out.println(a+b);
		System.out.println(x+y);
		System.out.println(a+x+b+y);
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		
		System.out.println("hello");
		System.out.print("next line wont be in new line");
		System.out.println("hello again");
		System.out.println("this will be in new line");
		

	}

}
