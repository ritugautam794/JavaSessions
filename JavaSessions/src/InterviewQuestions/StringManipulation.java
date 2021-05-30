package InterviewQuestions;

import java.util.Arrays;

public class StringManipulation {

	public static void main(String[] args) {

		String str = "The rains have started have here";
		String str1 = "The rains Have started have here";

		System.out.println(str.length());

		System.out.println(str.charAt(8));

		System.out.println(str.indexOf("s")); // 1st occurrence of "s"

		System.out.println(str.indexOf("s", 8 + 1)); // 2nd occurrence of "s"
		System.out.println(str.indexOf("s", str.indexOf("s") + 1));

		System.out.println(str.indexOf("have"));
		System.out.println(str.indexOf("have", str.indexOf("have") + 1));
		System.out.println(str.indexOf("hello"));

		// Comparison
		System.out.println(str.equals(str1));
		System.out.println(str.equalsIgnoreCase(str1));

		// substring
		System.out.println(str.substring(2, 10));

		// trim
		String s = "    hello  world   ";
		System.out.println(s.trim());

		System.out.println(s.replace(" ", ""));

		String date = "23/12/2018";

		System.out.println(date.replace("/", "-"));

		// split
		String s2 = "There_is_a_very_beautiful_palace";
		String s3[] = s2.split("_");
		System.out.println(Arrays.toString(s3));
		
		System.out.println(s2.concat("someothervariable"));
		
		String a = "hello";
		String b = "world";
		int c = 100;
		int d = 200;
		
		System.out.println(a+b);
		System.out.println(a+b+c);
		System.out.println(a+b+c+d); //concatenation in string [left -->right]
		System.out.println(c+d+a+b);

	}

}
