package collections;

import java.util.HashSet;
import java.util.Set;

import oops.Child1;
import oops.Parent;

public class SetExamples {
	public static void main(String[] args) {
		int a;
		String name;
		Student std1 = new Student();
		Parent P1 = new Parent();
		Child1 C1 = new Child1();
		int[] numbers = new int[5];
		String[] deparments = new String[5];
		Student[] stds = new Student[5];
		Parent[] prnts = new Parent[5];
		Child1[] children = new Child1[5];

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
