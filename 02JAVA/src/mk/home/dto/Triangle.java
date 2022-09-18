package mk.home.dto;

public class Triangle {
	public double height = 0;
	public double width = 0;

	public Triangle(double height, double width) {
		this.height = height;
		this.width = width;
	}

	public void tirArea() {
		System.out.println("넓이 : " + ((width * height) / 2));
	}

	public void tirPeriphery() {
		System.out.println("둘레 : " + (width * 3));
	}
	
	
}
