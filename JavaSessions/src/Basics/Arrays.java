package Basics;

public class Arrays {

	public static void main(String[] args) {
		// Arrays : variable to store various values of same data type
		// Disadvantage :1. they always store same type of data(Same data types).--solved via object arrays
		//               2. They have fixed length.  - to overcome use collections-dynamic arrays- array lists, hastables
		// 
		
		
	    //1. Integer Array
		
		int a[] = new int[3];
		a[0]= 1;
		a[1]= 2;
		a[2]= 3;
	
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a.length);
		
		// System.err.println(a[3]); // error : java.lang.ArrayIndexOutOfBoundsException:
		
	
		//2. Char Array	
		char b[]= new char[3];
		b[0]= '1';
		b[1]= 'c';
		b[2]= '@';
		
		System.out.println(b[2]);
		
		//3. Boolean array	
	    boolean x[] =  new boolean[2];
	    x[0]= true;
	    x[1]= false;
	    
	    System.out.println(x[1]);
	    
	    //4. double array 
	    double y[] = new double[2];
	    y[0] = 11.11;
	    y[1] = 12.22;
	    
	    System.out.println(y[1]);
	    
	    //5. String array
	    
	    String s[] = new String[3];
	    s[0] = "hello";
	    s[1] = "world";
	    System.out.println(s[0]);
	    
	    Object ob[] = new Object[5];
	    ob[0] = "hello";
	    ob[1]= 'c';
	    ob[2]= true;
	    ob[3]= 11.22;
	    ob[4]= 12; 
	    
	    System.out.println(ob[3]);
	    		
	    

	}

}
