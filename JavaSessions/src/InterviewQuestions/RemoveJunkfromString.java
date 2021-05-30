package InterviewQuestions;

public class RemoveJunkfromString {

	public static void main(String[] args) {
		
		
		String s= "C*~?/.,;':{}][=-+_15:49:50 ??. 0 HELLO THERE";
		
		String s1 = s.replaceAll("[a-zA-Z0-9]", "");
		//this removes all occurrences of a-zA-Z0-9
		String s2 = s.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(s1);
		System.out.println(s2);

	}

}
