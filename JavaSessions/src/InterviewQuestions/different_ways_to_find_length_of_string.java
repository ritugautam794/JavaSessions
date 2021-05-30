package InterviewQuestions;

public class different_ways_to_find_length_of_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = " testingabc";
	
		//1. length() method
		System.out.println(str.length());
		
		//2. convert to char array
		System.out.println(str.toCharArray().length);
		
		//3. lastindex of str
		System.out.println(str.lastIndexOf(""));
		
		//4. for loop
		int count =0;
		for(char c: str.toCharArray()) {
			count++;
		}
		System.out.println(count);
		
		//5. split()
		System.out.println(str.split("").length);
		
		//6. StringBuilder
		 int l = new StringBuilder(str).length();
		 System.out.println(l);
		 
		 //7.
		 System.out.println(getLength("heyi m the best"));
		

	}
	
	public static int getLength(String s) {
		int i = 0;
		try {
			while(true) {
				s.charAt(i);
				i++;
			}
		}catch(IndexOutOfBoundsException e) {
			return i;
		}
	}

}
