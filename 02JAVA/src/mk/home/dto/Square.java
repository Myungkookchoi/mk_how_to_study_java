package mk.home.dto;

public class Square {
	public double width = 0;
	public double height = 0;

	public void area() {
		System.out.println("넓이 : " + width * height);
	}

	public void periphery() {
		System.out.println("둘레 : " + (width * 2 + height * 2));
	}
}
