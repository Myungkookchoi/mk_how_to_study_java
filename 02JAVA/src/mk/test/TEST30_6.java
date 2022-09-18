package mk.test;

import java.util.Scanner;

public class TEST30_6 {
	public static void tri() {
		Scanner sc = new Scanner(System.in);
		System.out.println("밑변 길이 >>");
		double input1 = sc.nextInt();
		System.out.println("높이 길이 >>");
		double input2 = sc.nextInt();
		double tri = (input1 * input2) / 2;
		System.out.println(tri);
		sc.close();
	}

	public static void squ() {
		Scanner sc = new Scanner(System.in);
		System.out.println("밑변 길이 >>");
		double input1 = sc.nextInt();
		System.out.println("높이 길이 >>");
		double input2 = sc.nextInt();
		double squ = (input1 * input2);
		System.out.println(squ);
		sc.close();
	}

	public static void cur() {
		Scanner sc = new Scanner(System.in);
		System.out.println("반지름 길이 >>");
		double input1 = sc.nextInt();
		double cur = (input1 * input1 * 3.14);
		System.out.println(cur);
		sc.close();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("도형 입력 (삼각형, 사각형, 원)>>");
		String input1 = sc.nextLine();
		switch (input1) {
		case "삼각형":
			tri();
			break;
		case "사각형":
			squ();
			break;
		case "원":
			cur();
			break;
		default:
			System.out.println("잘못입력");
			break;
		}
		sc.close();
	}
}
