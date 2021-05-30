package InterviewQuestions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class StringListIterationMethods {

	public static void main(String[] args) {

		ArrayList<String> tvSeries = new ArrayList<String>();
		tvSeries.add("GOT");
		tvSeries.add("Breaking Bad");
		tvSeries.add("Prison Break");
		tvSeries.add("the walking dead");
		tvSeries.add("The big bang theorey");

		// 1. For loop with index
		System.out.println("**********Using for loop with indexing********");
		for (int i = 0; i < tvSeries.size(); i++) {
			System.out.println(tvSeries.get(i));
		}

		// 2. For loop with each iterator
		System.out.println("**********Using for loop with each iterator************");
		for (String show : tvSeries) {
			System.out.println(show);
		}

		// 3. With iterator --Moving forward
		System.out.println("**********Using iterator : -->Forward traverse************");
		Iterator<String> it = tvSeries.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());

		}
		// 4. For loop with each iterator with forEachRemaining() method
		System.out.println("**********iterator with forEachRemaining() ************");
		it = tvSeries.iterator();
		it.forEachRemaining(show->{
			System.out.println(show);
			
		});

		// 5. With iterator --Moving backward
		System.out.println("**********Using iterator :<--backward traverse************");
		ListIterator<String> it2 = tvSeries.listIterator(tvSeries.size());
		while (it2.hasPrevious()) {
			System.out.println(it2.previous());
		}

		// 6. JAVA 8 : Lambda
		System.out.println("**********JAVA 8: forEach Lambda************");
		tvSeries.forEach(shows -> {
			System.out.println(shows);
		});

	}

}
