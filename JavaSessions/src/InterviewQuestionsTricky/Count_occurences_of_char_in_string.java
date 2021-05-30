package InterviewQuestionsTricky;

public class Count_occurences_of_char_in_string {

	public static void main(String[] args) {
		
		String str= "hey, i love java.java is the besttest.";
		
		charoccat(str,'j');
		charoccarray(str,'j');
		CharusingStreams(str,"j");
		

	}
	
	public static void CharusingStreams(String s, String ch) {
		long count = s.chars().mapToObj(e->String.valueOf((char)e)).filter(e->e.equals(ch)).count();
		System.out.println("count of"+ch+" : "+count);
	}
	
	public static void charoccat(String s, char ch) {
		int count =0;		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==ch) {
				count++;
			}
		}
		System.out.println("count of"+ch+" : "+count);
	}
	
	public static void charoccarray(String s, char ch) {
		int count =0;		
		for(char c: s.toCharArray()) {
			if(c==ch) {
				count++;
			}
		}
		System.out.println("count of"+ch+" : "+count);
	}

}
