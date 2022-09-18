package mk.home.dto;

public class Rectangle {
	
	public double height = 0;
	public double width = 0;

	public void area() {
		System.out.println("넓이 : " + height * width);
	}

	public void area(double height) {
		System.out.println("넓이 : " + height * width);
	}

	public void periphery() {
		System.out.println("둘래 : " + (height * 2 + width * 2));
	}
}
