package OOPSConcepts;

public class LocalVSGlobalVariables {
	
	//global variables
	String Name = "Tom";
	int age = 23;
	

	public static void main(String[] args) {
		int i = 20;
		
		LocalVSGlobalVariables ob = new LocalVSGlobalVariables();
	    // System.out.println(Name);//cannot make static reference to non=static field names
		
		System.out.println(ob.Name);
		System.out.println(ob.age);
		
	}
	
	//non-static method
	public int sum() {
		int i= 2;
		int j= 5;
		int k = i+j;
				
	    return k;
	}

}
