package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>(2);
		names.add("krishna");
		names.add("Sudha");
		names.add("Rama");
		System.out.println("Size :" + names.size());
		names.ensureCapacity(10);
		System.out.println("Size :" + names.size());
		names.add("Sujana");
		names.add("krishna");
		names.add("Sudha");
		names.add("Rama");
		names.add("Sujana");
		System.out.println("Size :" + names.size());
		names.trimToSize();
		System.out.println("Size :" + names.size());
		Collections.sort(names);
		if (names.isEmpty()) {
			System.out.println("names list is empty");
		} else {
			System.out.println("names : " + names);
		}
		Collections.reverse(names);
		System.out.println("names : " + names);
	}
}
