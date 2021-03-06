package InterviewQuestions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.graalvm.compiler.lir.aarch64.AArch64ArithmeticOp.ExtendedAddSubShiftOp;

public class DuplicateEntriesinArray {

	public static void main(String[] args) {

		String names[] = { "java", "python", "c++", "java", "ruby" };

		// 1. for loop, performance 0(n2)

		for (int i = 0; i < names.length; i++) {
			for (int j = i + 1; j < names.length; j++) {
				if (names[i].equals(names[j])) {
					System.out.println("duplicate element is : " + names[i]);
				}
			}
		}

		System.out.println("**************************");

		// 2. HashSet

		Set<String> store = new HashSet<String>();
		for (String name : names) {
			if (store.add(name) == false) {
				System.out.println("duplicate element is : " + name);
			}

		}

		System.out.println("**************************");
		System.out.println(store);

		// 3. HashMap

		Map<String, Integer> storeMap = new HashMap<String, Integer>();
		for (String name : names) {
			Integer count = storeMap.get(name);
			if (count == null) {
				storeMap.put(name, 1);
			} else {
				storeMap.put(name, ++count);
			}
		}
		
		Set<Entry<String,Integer>> entrySet = storeMap.entrySet();
		
		for(Entry<String,Integer> entry: entrySet ) {
			if(entry.getValue()>1)
				System.out.println("duplicate element is : " + entry.getKey());
		}
			

	}
}
