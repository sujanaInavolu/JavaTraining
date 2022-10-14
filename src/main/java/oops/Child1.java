package oops;

public class Child1 extends Parent {
	String favColor;
	String favFood;

	void show() {
		System.out.println("show from child1");
	}

	public void Child1() {

	}

	public void Child1(String color) {
		this.favColor = color;
	}
	public void Child1(String color,String food) {
		this.favColor = color;
		this.favFood = food;
	}
}
