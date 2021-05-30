package InterviewQuestionsTricky;

import java.util.StringJoiner;

public class String_Joiners {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringJoiner sj = new StringJoiner(";","{","}");
		sj.add("tom");
		sj.add("jerry");
		sj.add("lusy");
		
		System.out.println(sj);
		
		sj.add("risha").add("rita").add("rubai");
		System.out.println(sj);

	}

}
