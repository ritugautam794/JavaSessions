package InterviewQuestionsTricky;

import java.util.stream.IntStream;

public class printNumber_withoutanyloops {

	public static void main(String[] args) {
		/*print 1 2 3...100 without any loops
		 *  1. recursion
		 *  InputStream
		 */
		
		System.out.println("***********using recursion*********");
		printNum(1, 20);
		
		IntStream.range(1, 20+1).forEach(e->System.out.println(e));
		

	}
	
	public static void printNum(int start, int end) {
		
		if(start<=end) {
			System.out.println(start);
			printNum(start+1, end);
		}	
		}
		

}
