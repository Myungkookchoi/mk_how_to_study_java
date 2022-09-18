package mk.home.dto;

public class Circle {
	public double r = 0;
	public double pi = Math.PI;

	public Circle(double r) {
		this.r = r;
	}

	public void circleArea() {
		System.out.println("넓이 : " + (r * r * pi));
	}

	public void circlePeriphery() {
		System.out.println("둘레 : " + (2 * pi * r));
	}
}
