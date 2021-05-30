package Basics;

public class IncrementDecrement {

	public static void main(String[] args) {
		// i++ post increment 
		//i--  post decrement
		//++i  pre increment
		//--i  pre decrement
		
		int x= 1;
		int y= x++; //post increment
		
		//Here first x is assigned to y and then incremented to 1
		System.out.println(x); //2
		System.out.println(y); //1
		
		int a = 2;
		int b = ++a; //Pre increment-- First a is incremented then assigned to b
		
		System.out.println(a); //3
		System.out.println(b); //3
		
		//Pre decrement
		//first decrement then assign
		
		int p= 10;
		int q= --p;
		
		System.out.println(p); //9
		System.out.println(q);//9
		
		
		//Post decrement
		//first assign then decrement
				
		int r= 10;
		int s= r--;
				
		System.out.println(r); //9
		System.out.println(s);//10

	}

}
