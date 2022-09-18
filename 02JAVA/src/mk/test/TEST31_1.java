package mk.test;

import java.util.Scanner;


class Triangle {
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

class Squa {
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

class Circle {
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

public class TEST31_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("도형 입력 >> (정삼각형, 사각형, 원)");
		String input1 = sc.nextLine();
		if (input1.equals("정삼각형")) {
			System.out.println("한 변의 길이 >>");
			double width = Double.parseDouble(sc.nextLine());
			System.out.println("높이의 길이 >>");
			double height = Double.parseDouble(sc.nextLine());
			Triangle t1 = new Triangle(height, width);
			t1.tirArea();
			t1.tirPeriphery();
		} else if (input1.equals("사각형")) {
			System.out.println("한 변의 길이 >>");
			double width = Double.parseDouble(sc.nextLine());
			System.out.println("높이의 길이 >>");
			double height = Double.parseDouble(sc.nextLine());
			Squa s1 = new Squa(height, width);
			s1.squaArea();
			s1.squaPeriphery();
		} else if (input1.equals("원")) {
			System.out.println("반 지름의 길이 >>");
			double r = Double.parseDouble(sc.nextLine());
			Circle c1 = new Circle(r);
			c1.circleArea();
			c1.circlePeriphery();
		}
		sc.close();
	}
}
