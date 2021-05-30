package WhyStringsAreImmutable;

public class StringConcept {

	public static void main(String[] args) {

		String s1 = "Java";
		String s2 = "Java";
		System.out.println(s1);
		System.out.println(s2);
		s2 = "hello";
		String s3 = "c++";

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}

}
