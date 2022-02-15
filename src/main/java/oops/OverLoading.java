package oops;

public class OverLoading {
	public static void main(String[] args) {
		String name = "sujana";
		print(name);
		int number = 2;
		print(number);
		print(13);
		print("krishna");
		print("suji", 5);
		System.out.println("output is: "+print("suji", 5));
	}

	public static void print(String name) {
		// print is the method name
		// name is the input argument
		// name is of type string
		// void is return type
		System.out.println(name);
	}

	public static void print(int number) {
		System.out.println(number);
	}
	public static int print(int number1,int number2) {

		return number1+number2;
	}
	public static String print(String name, int number) {
		//System.out.println("name is: "+name + " and number is: "+number +" and he is software engineer" +"\n"+"he stays in USA");
		return "name is: "+name + " and number is: "+number +" and he is software engineer" +"\n"+"he stays in USA";
	}
}
