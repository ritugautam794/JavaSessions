package InterviewQuestionsTricky;

public class HowManyObjects {

	public static void main(String[] args) {
		// How many objects are created below
		
		String s = new String("hello world");//2 objects ...1. hello world in string constant pool + 2. class object for string s1
        String s2 = new String("hello world");//1 object...new class object for s2 but "hello world" string is already present in pool 
        		
        // so total 3 till now
        		
        String s3 = "hello world"; //"hello world" already available in string pool
        String s4= "hello world";
        
        //total 3 till now
	}

}
