package InterviewQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWordsInString {

	public static void main(String[] args) {
		
		duplicateWords("Java is not a very good java language is but ok good");
		duplicateWords("Java java");
		duplicateWords("Java java java java");

	}
	
	public static void duplicateWords(String s) {
		//1. Spilt the string in array of words
		//2. Create hashmap with words and wordscount
		//3. check each word in wordcount and if is present ,
		//   add the count by 1 else add it first time if not present
		//4. create a set of only key values
		
		String words[]= s.split(" ");
		
		Map<String,Integer> wordcount = new HashMap<String,Integer>();
		
		for(String word:words ) {
			if(wordcount.containsKey(word)) {
				wordcount.put(word.toLowerCase(), wordcount.get(word)+1);
			}else {
				wordcount.put(word.toLowerCase(), 1);
			}
		}
		
		System.out.println(wordcount);
		
		Set<String> keySetofWords = wordcount.keySet();
		
		for(String word: keySetofWords ) {
			if(wordcount.get(word)>1) {
				System.out.println(word+" "+wordcount.get(word));
			}
		}
		
		System.out.println("******************************************");
	}

}
