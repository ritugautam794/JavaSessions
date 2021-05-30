package InterviewQuestions;

public class ifStringContainsOnlyDigits {
	
	public static boolean isNumeric(CharSequence cs) {
		int len = cs.length();
		if(cs==null || len==0) {
			return false;
		}else {
			for(int i=0;i<len;i++) {
				if(! Character.isDigit(cs.charAt(i))) {
					return false;
				}
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		
		System.out.println(isNumeric(""));
		System.out.println(isNumeric(" "));
//		System.out.println(isNumeric(null)); null pointer exception
		System.out.println(isNumeric("1"));
		System.out.println(isNumeric("a"));
		System.out.println(isNumeric("a1a"));
		System.out.println(isNumeric("1234"));
		System.out.println(isNumeric("\u0967"));
		System.out.println(isNumeric("\u0967\u0968"));
		

	}

}
