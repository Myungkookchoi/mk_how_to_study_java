package mk.test;

import java.util.Scanner;

public class TEST13 {
	public static void Q1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("a >>");
		int a = Integer.parseInt(sc.nextLine());
		System.out.println("b >>");
		int b = Integer.parseInt(sc.nextLine());
		int c = 0;
		a = c;
		b = a;
		b = c;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		sc.close();
	}

	public static void Q3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("a >>");
		int a = Integer.parseInt(sc.nextLine());
		System.out.println("b >>");
		int b = Integer.parseInt(sc.nextLine());
		System.out.println("c >>");
		int c = Integer.parseInt(sc.nextLine());
		int d = 0;

		if (a < b) {
			if (a > c) {
				d = b;
				b = a;
				a = c;
				c = d;
				System.out.println(a + "\t" + b + "\t" + c);
			} else if (b < c) {
				System.out.println(a + "\t" + b + "\t" + c);
			} else if (b > c) {
				d = b;
				b = c;
				c = d;
				System.out.println(a + "\t" + b + "\t" + c);
			}
		} else if (a > b) {
			if (a < c) {
				d = a;
				a = b;
				b = d;
				System.out.println(a + "\t" + b + "\t" + c);
			} else if (b < c) {
				d = a;
				a = b;
				b = c;
				c = d;
				System.out.println(a + "\t" + b + "\t" + c);
			} else if (b > c) {

				d = a;
				a = c;
				c = d;
				System.out.println(a + "\t" + b + "\t" + c);
			}
		}
		sc.close();
	}

	public static void Q2() {
		// a, b 중 큰 수를 a에 넣어 서 출력하자.
		Scanner sc = new Scanner(System.in);
		System.out.println("a >>");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = 0;
		if (a > b) {
			System.out.println(a + ", " + b);
		} else if (b > a) {
			c = a;
			a = b;
			b = c;
			System.out.println(a + ", " + b);

		}
		sc.close();
	}

	public static void main(String[] args) {
		System.out.println("문제번호 입력(1~3) >>");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		switch (a) {
		case 1:
			Q1();
			break;
		case 3:
			Q3();
			break;
		case 2:
			Q2();
			break;
		default:
			System.out.println("Error");
			break;
		}
		sc.close();
	}
}
