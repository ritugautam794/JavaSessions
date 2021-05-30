package Static_Block_Concepts;

public class Static_question4 {
	
	int age;
	private Static_question4() {
		age= 30;
	}
	
	public static int createobject(){
		Static_question4 obj = new Static_question4();
		obj.age = 70;
		return obj.age;
	}

	 static{
		Static_question4 obj = new Static_question4();
	}
	
	public static void main(String[] args) {
		//if we want to access private members of class we can access within same class but 
		// not from outside test_static class
		
		Static_question4 ob= new Static_question4();
		ob.age = 50;
		System.out.println(ob.age);
	

	}

}
