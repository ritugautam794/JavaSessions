package InterviewQuestionsTricky;

public class escape_characters_in_java {

	public static void main(String[] args) {
		
/*
 *  print -
 *  1. "hello" with double quotes- put backslash infront of double quote
 *  2. 'hello world'
 *  3. i love "java", "python" and "javascript"
 *  4. i hate /you\
 *  
 *  
 *    
 *  
 */
		
		System.out.println(" \"Hello world\"");
		System.out.println("'hello world'");
		System.out.println("i love \"java\", \"python\" and \"javascript\" ");
		
		System.out.println(getstring("rubai"));
		System.out.println(getstring("12s;lwsl[wpeo"));
		
	}
	
	public static String getstring(String str) {
		String xpath = "//input[@id='" +str+ "']";
		return xpath;
	}

}
