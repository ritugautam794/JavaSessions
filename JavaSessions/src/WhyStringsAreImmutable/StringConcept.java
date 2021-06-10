package WhyStringsAreImmutable;

public class StringConcept {

	public static void main(String[] args) {

		String s1 = "Java";
		String s2 = "Java";
		System.out.println(s1);
		System.out.println(s2);
		s2 = "hello";
		String s3 = "c++";
		System.out.println(s2);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1);
		System.out.println(s3);
		
//		String str = "knowledge";
//		This, as usual, creates a string containing "knowledge" and assigns it a reference str. Simple enough?
//		Lets perform some more functions:
//
//		// assigns a new reference to the 
//		// same string "knowledge"
//		String s = str;     
//		Let’s see how the below statement works:
//
//		  str = str.concat(" base");
//		
//		When the above statement is executed, the VM takes the value of String str, i.e. "knowledge" and appends
//		" base", giving us the value "knowledge base". Now, since Strings are immutable, the VM can’t assign this
//		value to str, so it creates a new String object, gives it a value "knowledge base", and gives it a reference 
//		str.
//
//		An important point to note here is that, while the String object is immutable, its reference variable
//		is not. 

	}

}
