package Basics;

public class NullFacts {

	static Object ob;
	static String str;
	static NullFacts nf;

	public static void main(String[] args) {
		// 1. case sensitive
		// Object obj = Null; - not allowed
		// Object obj = null;

		// 2. default reference value would be null
		System.out.println(ob);
		System.out.println(str);
		System.out.println(nf);

		// 3.Integer is a class and i is the refrence variable which is point to null
		// but it cant be assigned to a different primitive data type
		Integer i = null;
		Integer j = i; // this is  allowed
		// int j =i; // This is not allowed
		// java.lang.NullPointerException: Cannot invoke "java.lang.Integer.intValue()"
		// because "i" is null

		
		// 4. instanceof
		Integer a = null;
		Integer b = 10;
		System.out.println("4-----------------------");
		System.out.println(a instanceof Integer); // even though a is instanceof integer but currently its null
		System.out.println(b instanceof Integer);

		
		// 5. static and nonstatic methods
		NullFacts obj = null;
		obj.sum();
		NullFacts.sum();
		//obj.send(); //null pointer exception bcz no objects only ref variable
		
		
		//6. == and !=
		 System.out.println(null == null);
		 System.out.println(null != null);
		 
		 //7. string concepts
		 String s1 = null;
		 Integer i1 = null;
		 Double d1 = null;
		 
		 String s2 = (String)null;
		 Integer i2= (Integer)null;
		 System.out.println(s2+" tax");
		// System.out.println(s2.length());//Nullpointer exception
		 System.out.println(i2);
		 System.out.println(s1);
		 System.out.println(i1);
		 System.out.println(d1);
		 
		 
	}
	

	public static void sum() {
		System.out.println("sum...");

	}

	public void send() {
		System.out.println("sendmail...");

	}
}
