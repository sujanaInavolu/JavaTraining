package oops;

public class Abstraction {

	public static void main(String[] args) {
		Vehicle v1 = new MarutiSwift("Red",20);
		System.out.println("car color: " + v1.color);
		System.out.println("car present speed: " + v1.curSpeed);
		v1.speedUp(30);
		System.out.println("car after speed: " + v1.curSpeed);
	}

}
