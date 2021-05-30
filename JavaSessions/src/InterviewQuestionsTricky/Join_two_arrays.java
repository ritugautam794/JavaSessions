package InterviewQuestionsTricky;

import java.util.Arrays;
import java.util.stream.Stream;

import com.google.common.collect.ObjectArrays;

public class Join_two_arrays {
	/*
	 * 1. streams
	 * 2. google guvwa
	 * 
	 */

	public static void main(String[] args) {
		
		String[] small = {"a", "b", "c"};
		String[] caps = {"A","B","C"};
		
		Stream<String> s = Arrays.stream(small);
		Stream<String> c = Arrays.stream(caps);
		
		String fullteam[] = Stream.concat(s, c).toArray(size->new String[size]);
		for(String str: fullteam) {
			System.out.println(str);
		}
		
		
		//google guvwa 
		
		String[] full = ObjectArrays.concat(s, c);
		
		
		

	}

}
