package Static_Block_Concepts;

public class Static_ques6 {
	
	String name;
	static int age;
	
	static {
		Static_ques6 ob = new Static_ques6();
		ob.name = "mohan";
		age = 76;
		System.out.println(ob.name+"  "+age);
	}

	
	

	public static void main(String[] args) {
		
		
	}

}
