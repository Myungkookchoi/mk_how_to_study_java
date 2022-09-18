package mk.alone.making;

import java.util.Scanner;

public class Calculator {
	public static void Plus(double a, double b) {

		double c = a + b;
		while (0 != 1) {
			System.out.println("= " + c);
			Scanner sc = new Scanner(System.in);
			System.out.print(">>");
			String sign = sc.nextLine();
			Scanner sc1 = new Scanner(System.in);
			System.out.print(">>");
			double d = sc.nextDouble();
			if (sign.equals("+")) {
				Plus(c, d);
			} else if (sign.equals("-")) {
				Minus(c, d);
			} else if (sign.equals("*")) {
				Multiply(c, d);
			} else if (sign.equals("/")) {
				Division(c, d);
			} else {
				System.out.println("Error");
				break;
			}
			sc.close();
			sc1.close();
		}

	}

	public static void Minus(double a, double b) {

		double c = a - b;
		while (0 != 1) {
			System.out.println("= " + c);
			Scanner sc = new Scanner(System.in);
			System.out.print(">>");
			String sign = sc.nextLine();
			Scanner sc1 = new Scanner(System.in);
			System.out.print(">>");
			double d = sc1.nextDouble();
			if (sign.equals("+")) {
				Plus(c, d);
			} else if (sign.equals("-")) {
				Minus(c, d);
			} else if (sign.equals("*")) {
				Multiply(c, d);
			} else if (sign.equals("/")) {
				Division(c, d);
			} else {
				System.out.println("Error");
				break;
			}
			sc.close();
			sc1.close();
		}

	}

	public static void Multiply(double a, double b) {

		double c = a * b;
		while (0 != 1) {
			System.out.println("= " + c);
			Scanner sc = new Scanner(System.in);
			System.out.print(">>");
			String sign = sc.nextLine();
			Scanner sc1 = new Scanner(System.in);
			System.out.print(">>");
			double d = sc1.nextDouble();
			if (sign.equals("+")) {
				Plus(c, d);
			} else if (sign.equals("-")) {
				Minus(c, d);
			} else if (sign.equals("*")) {
				Multiply(c, d);
			} else if (sign.equals("/")) {
				Division(c, d);
			} else {
				System.out.println("Error");
				break;
			}
			sc.close();
			sc1.close();
		}

	}

	public static void Division(double a, double b) {

		double c = a / b;
		while (0 != 1) {
			System.out.println("= " + c);
			Scanner sc = new Scanner(System.in);
			System.out.print(">>");
			String sign = sc.nextLine();
			Scanner sc1 = new Scanner(System.in);
			System.out.print(">>");
			double d = sc1.nextDouble();
			if (sign.equals("+")) {
				Plus(c, d);
			} else if (sign.equals("-")) {
				Minus(c, d);
			} else if (sign.equals("*")) {
				Multiply(c, d);
			} else if (sign.equals("/")) {
				Division(c, d);
			} else {
				System.out.println("Error");
				break;
			}
			sc.close();
			sc1.close();
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print(">>");
		double a = sc.nextDouble();
		Scanner sc1 = new Scanner(System.in);
		System.out.print(">>");
		String sign = sc1.nextLine();
		Scanner sc2 = new Scanner(System.in);
		System.out.print(">>");
		double b = sc.nextDouble();
		if (sign.equals("+")) {
			Plus(a, b);
		} else if (sign.equals("-")) {
			Minus(a, b);
		} else if (sign.equals("*")) {
			Multiply(a, b);
		} else if (sign.equals("/")) {
			Division(a, b);
		} else {
			System.out.println("Error");
		}
		sc.close();
		sc1.close();
		sc2.close();

	}
}