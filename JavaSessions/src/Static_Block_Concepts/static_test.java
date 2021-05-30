package Static_Block_Concepts;

public class static_test {

	public static void main(String[] args) {
		// to access private members of the class we should use static method or static block to access
		//from outside that class
		
		int age = Static_question4.createobject();
		System.out.println(age);
		
		System.out.println("********************************************");
		
		System.out.println(Static_ques5.age);
		

	}

}
