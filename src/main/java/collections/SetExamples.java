package collections;

import java.util.HashSet;
import java.util.Set;

public class SetExamples {
	public static void main(String[] args) {
		Set<String> names = new HashSet<>();
		names.add("Krishna");
		names.add("sudha");
		System.out.println("Names Set : " + names);
		names.add(null);
		names.add("krishna");
		names.add("Sudha");
		names.add(null);
		System.out.println("names set : " + names);
		for (String name : names) {
			System.out.println(name);
		}
	}
}
