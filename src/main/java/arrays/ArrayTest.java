package arrays;

public class ArrayTest {
	public static void main(String[] args) {
		String[] names = new String[5];
		names[2] = "krishna";
		System.out.println("name at third position : " + names[2]);
		names[4] = "venkat";
		System.out.println("name at fifth position : " + names[4]);
		System.out.println("last element :" + names[4]);
		printLastelement(names);
		String[] depts = {"cse","it","ece"};
		printLastelement(depts);
	}

	private static void printLastelement(String[] xyz) {
		int n = xyz.length;
		System.out.println("last element : "+xyz[n-1]);
	}
}
//insert string krishna at 3 position of the array
//size-10 lastindex-9
//size-5 li-4
//size-8 li-7
//size-20 li-19
//size-n li-n-1