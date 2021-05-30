package InterviewQuestionsTricky;

public class Char_occorences_using_Streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(charCount("testing is always done with fresh mind",'s'));
		System.out.println(charCount2("testing is always done with fresh mind",'s','i'));


	}
	
	public static long charCount(String str, char c) {
		return (long) str.chars().filter(e->(char)e==c).count();
	}
	
	public static long charCount2(String str, char c1, char c2) {
		return (long) str.chars().filter(e->(char)e==c1|| (char)e==c2).count();
	}

}
