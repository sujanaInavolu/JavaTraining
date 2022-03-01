package oops;

public class Inheritance {
	public static void main(String[] args) {
int speed;
Vehicle v1 = new MarutiSwift( "Red", 20);
System.out.println("Car Color: "+v1.color);
System.out.println("Car present speed:"+v1.curSpeed);
System.out.println("Music:"+v1.ourSpeed);
v1.speedUp(30);
System.out.println("Car after speedup:"+v1.curSpeed);
int ecoSpeed;
MarutiSwiftDezire v2 = new MarutiSwiftDezire();
System.out.println("Dezire speed is:"+v2.curSpeed);
MarutiSwiftDezire dezire = new MarutiSwiftDezire();
System.out.println("Dezire ECO speed is:" +dezire.economySpeed);
	}
}
