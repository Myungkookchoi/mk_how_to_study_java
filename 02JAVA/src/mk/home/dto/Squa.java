package mk.home.dto;

public class Squa {
	public double height = 0;
	public double width = 0;

	
	public Squa(double height, double width) {
		this.height = height;
		this.width = width;
	}

	public void squaArea() {
		System.out.println("넓이 : " + (height * width));
	}

	public void squaPeriphery() {
		System.out.println("둘레 : " + ((height * 2) + (width * 2)));
	}
}
