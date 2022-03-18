package oops;

public class MarutiSwift extends Vehicle {
	public MarutiSwift(String color, int speed) {
		this.color = color;
		this.curSpeed = speed; 
	}

	@Override
	void speedUp(int speed) {
		curSpeed = curSpeed + speed;
	}

}
