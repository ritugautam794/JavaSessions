package Collections_ArrayLists;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcepts {

	public static void main(String[] args) {
		
		int a[] = new int[3]; //array size is fixed here 
		
		//dynamic array-----array list
		//1. can contain duplicate entries
		//2. maintains insertion order
		//3. Not synchronized - multi threading concepts
		//4. allows random access to fetch elements(stored on basis of
		
		ArrayList  a2 = new ArrayList(); //Raw type arraylist
		a2.add(10);
		a2.add(16);
		a2.add(10);
		
		System.out.println("arraylist size"+a2.size());
		
		a2.add("hello");
		a2.add(true);
		a2.add('c');
				
		System.out.println("arraylist size"+a2.size());		
		
		System.out.println(a2.get(4));
		
		//to print all value
		for(int i=0;i<a2.size();i++) {
			System.out.println(a2.get(i));
		}
		
		//Generic VS Non-Generic
		
		ArrayList<Integer> a3 = new ArrayList<Integer>();
		a3.add(9);
		//a3.add("hello");//we get error
		a3.add(30);
		
		ArrayList<String> a4 = new ArrayList<String>();
		a4.add("hello");
		a4.add("How");
		a4.add("Are");
		a4.add("you");
		
		//ArrayList<E> a4 = new ArrayList<E>();
		
		//Employee class objects
		Employee e1 = new Employee("tom",25,"IT");
		Employee e2 = new Employee("Jerry", 30,"QA");
		Employee e3 = new Employee("fox",35,"Admin");
		
		ArrayList<Employee> ar5 = new ArrayList<Employee>();
		ar5.add(e1);
		ar5.add(e2);
		ar5.add(e3);
		
		//Iterator to traverse
		
		Iterator<Employee> it = ar5.iterator();		//it doesn't work basis on index bcz of objects
		
		while(it.hasNext()) {
			Employee emp =it.next();
			System.out.println(emp.name+" "+emp.age+" "+emp.dept);
		}
		
		//**************************************************		
		// addAll()
		
		ArrayList<String> a5 = new ArrayList<String>();
		a5.add("I");
		a5.add("am");
		a5.add("good");
		a5.add("thankyou");
		
		a4.addAll(a5);
		
		for(int i=0; i<a4.size(); i++) {
			System.out.println(a4.get(i));	
		}
		
		// ****************************************************
		// removeAll()
		
		a4.removeAll(a5);
		
		for(int i=0; i<a4.size(); i++) {
			System.out.println(a4.get(i));	
		}
		
		//******************************************************
		// retainAll() - to find intersection of 2 arrayslists
		
		ArrayList<String> a6 = new ArrayList<String>();
		a6.add("I");
		a6.add("not");
		a6.add("good");
		
		a5.retainAll(a6);
		
		for(int i=0; i<a5.size(); i++) {
			System.out.println(a5.get(i));	
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
