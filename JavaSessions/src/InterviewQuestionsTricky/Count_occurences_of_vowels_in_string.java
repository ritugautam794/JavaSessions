package InterviewQuestionsTricky;

import java.util.function.IntPredicate;

import com.google.common.base.CharMatcher;
import com.sun.net.httpserver.Filter;

public class Count_occurences_of_vowels_in_string {

	/*
	 * 3 ways: 1. java method 2. java8 - streams 3. google guvava api
	 */

	public static boolean isVowel(int c) {
		return c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c == 'o'
				|| c == 'u';
	}

	public static void main(String[] args) {

		String str = " Hello, there.Lets see how vowels you have? ";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (isVowel(str.charAt(i))) {
				count++;
			}
		}

		System.out.println(count);

		System.out.println("--------Using java streams-----------");

		IntPredicate vowel = new IntPredicate() {
			@Override
			public boolean test(int c) {
				return c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'e' || c == 'i'
						|| c == 'o' || c == 'u';
			}
		};

		String s = "hey there";
		long count1 = s.chars().filter(vowel).count();
		System.out.println(count1);

		System.out.println("--------Using Google Guava-----------");

		int count3 = CharMatcher.anyOf("aeiouAEIOU").countIn(s);

		System.out.println(count3);

	}

}
