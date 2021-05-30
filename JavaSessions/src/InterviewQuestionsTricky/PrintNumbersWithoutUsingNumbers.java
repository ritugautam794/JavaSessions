package InterviewQuestionsTricky;

public class PrintNumbersWithoutUsingNumbers {

	public static void main(String[] args) {
		
		//1. using string
		
		int x = 'a'/'a';
		String y= "..........";
		int len = y.length();
		
		for(int i=x;i<=len*len;i++) {
			System.out.println(i);
		}
		
		// using ascii values 97-a/ 98-b..99-c...100-d
		
		for(int i= x; i<='d';i++) {
			System.out.println(i);
		}
		

	}

}
