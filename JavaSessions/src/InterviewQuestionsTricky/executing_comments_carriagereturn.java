package InterviewQuestionsTricky;

public class executing_comments_carriagereturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// this is my comment \u000d
		System.out.println("Hey, I am a comment getting executed");
		System.out.println("i am not a comment");

		int x = 10;
		// \u000d
		x = 20;
		System.out.println(x);
		System.out.println(\u000d); // this is carriage return and move to a new line
		System.out.println("hello programming");

	}

}
