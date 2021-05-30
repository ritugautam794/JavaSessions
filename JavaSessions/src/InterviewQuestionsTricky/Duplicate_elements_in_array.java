package InterviewQuestionsTricky;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;



public class Duplicate_elements_in_array {

	public static void main(String[] args) {
		/* 1.brute force
		 * 2. hashset
		 * 3. hash map
		 * 4. streams
		 */
		
		String infra[] = {"java", "amazon","unisys", "infosys","unisys","java","oracle","infosys","sterlite"};
		int len = infra.length ;
		
		System.out.println("***********brute force******************");
		
		for(int i = 0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				if(infra[i]==infra[j]) {
					System.out.println(infra[i]);
				}
			}
		}
		
		System.out.println("***********Hash Set******************");
		
		Set<String> set = new HashSet<String>();
		for(String e: infra) {
			if(set.add(e)==false) {
				System.out.println(e);
			}
		}
		
		System.out.println("***********Hash Map******************");
		Map<String,Integer> map = new HashMap<String,Integer>();
		for(String e:infra) {
			Integer count = map.get(e);
			if(count==null) {
				map.put(e, 1);
				
			}else {
				map.put(e, ++count);
			}
		}
		//printing duplicate elements
		
		Set<Entry<String,Integer>> entrySet = map.entrySet();
		
		for(Entry<String,Integer> e: entrySet) {
			if(e.getValue()>1) {
				System.out.println(e.getKey());
			}
			
		}
		
		

	}

}
