package Collections_ArrayLists;

import java.util.Iterator;
import java.util.LinkedList;



public class LinkedListConcepts {

	public static void main(String[] args) {
	
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("test");
		ll.add("selenium");
		ll.add("RFT");
		ll.add("RPA");
		
		System.out.println(ll);
		
		// addFirst()
		ll.addFirst("Ritu");
		//addLast();
		ll.addLast("Gautam");
		
		System.out.println(ll);
		System.out.println(ll.get(1));
		
		ll.set(4, "qa2");
		System.out.println(ll);
		ll.removeFirst();
		System.out.println(ll);
		ll.removeLast();
		System.out.println(ll);
		
		ll.remove(2);
		System.out.println(ll);
		
		//**********for loop********************
		System.out.println("****for loop values********");
		for(int i=0;i<ll.size(); i++) {
			System.out.println(ll.get(i));
		}
		
		//*****************iterator****************
		System.out.println("**********iterator values**********");
		Iterator<String> it= ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//************advance for loop*************
		System.out.println("************advance for values*********");
		for(String s:ll) {	
			System.out.println(s);
		}
		
		//***********while loop**************
		System.out.println("************ while loop *********");
		int n=0;
		while(ll.size()>n) {
			System.out.println(ll.get(n));
			n++;
		}
	}

}
