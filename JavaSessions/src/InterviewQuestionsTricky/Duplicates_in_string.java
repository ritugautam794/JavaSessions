package InterviewQuestionsTricky;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Duplicates_in_string {

	public static void main(String[] args) {
		
		duplicatechar("j");
		duplicatechar(null);
		duplicatechar("");
		duplicatechar("javatattaaksht");

	}

	public static void duplicatechar(String str) {
		if (str == null) {
			System.out.println("Null string");
			return;
		}

		if (str.isEmpty()) {
			System.out.println("Empty string");
			return;
		}

		if (str.length() == 1) {
			System.out.println("1 Char string"+str);	
			return;
		}

		char words[]= str.toCharArray();
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
		for(char c: words) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}	
		}
		
	Set<Entry<Character,Integer>> entryset	= map.entrySet();
	for(Entry<Character,Integer> e: entryset) {
		if(e.getValue()>1) {
			System.out.println(e.getKey()+":"+e.getValue());
		}
	}
		
	}

}
