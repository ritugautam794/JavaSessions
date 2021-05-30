package Collections_ArrayLists;

import java.util.Hashtable;

public class HashtableConcept {

	public static void main(String[] args) {

		Hashtable h = new Hashtable();

		h.put("A", "HELLO");
		h.put("B", "WORLD");
		h.put(1, "HEY");
		h.put(2, 12.33);

		System.out.println(h.size());

		h.remove("B");

		System.out.println(h.size());

		Hashtable<Integer, Integer> h2 = new Hashtable<Integer, Integer>();

		h2.put(1, 100);
		h2.put(2, 200);
		// h2.put("he", "hehe"); not allowed
		h2.remove(2);
		
		

	}

}
