package mk.alone.making;

import java.util.Scanner;

public class Calculator02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(">>");
		double a = sc.nextDouble();
		System.out.print(">>");
		String sign = sc.next();
		System.out.print(">>");
		double b = sc.nextDouble();
		if (sign.equals("+")) {
			plus(a, b);
		} else if (sign.equals("-")) {
			minus(a, b);
		} else if (sign.equals("*")) {
			multiply(a, b);
		} else if (sign.equals("/")) {
			division(a, b);
		} else {
			System.out.println("Error");
		}
		sc.close();
	}

	public static void plus(double a, double b) {
		Scanner sc = new Scanner(System.in);
		double c = (a + b);
		System.out.print(">>");
		String sign = sc.next();
		if (sign.equals("=")) {
			total(c);
		} else {
			System.out.print(">>");
			double d = sc.nextDouble();
			if (sign.equals("+")) {
				plus(c, d);
			} else if (sign.equals("-")) {
				minus(c, d);
			} else if (sign.equals("*")) {
				multiply(c, d);
			} else if (sign.equals("/")) {
				division(c, d);
			} else {
				System.out.println("Error");
			}
			sc.close();
		}
	}

	public static void minus(double a, double b) {
		Scanner sc = new Scanner(System.in);
		double c = (a - b);
		System.out.print(">>");
		String sign = sc.next();
		if (sign.equals("=")) {
			total(c);
		} else {
			System.out.print(">>");
			double d = sc.nextDouble();
			if (sign.equals("+")) {
				plus(c, d);
			} else if (sign.equals("-")) {
				minus(c, d);
			} else if (sign.equals("*")) {
				multiply(c, d);
			} else if (sign.equals("/")) {
				division(c, d);
			} else {
				System.out.println("Error");
			}
			sc.close();
		}
	}

	public static void multiply(double a, double b) {
		Scanner sc = new Scanner(System.in);
		double c = (a * b);
		System.out.print(">>");
		String sign = sc.next();
		if (sign.equals("=")) {
			total(c);
		} else {
			System.out.print(">>");
			double d = sc.nextDouble();
			if (sign.equals("+")) {
				plus(c, d);
			} else if (sign.equals("-")) {
				minus(c, d);
			} else if (sign.equals("*")) {
				multiply(c, d);
			} else if (sign.equals("/")) {
				division(c, d);
			} else {
				System.out.println("Error");
			}
			sc.close();
		}
	}

	public static void division(double a, double b) {
		Scanner sc = new Scanner(System.in);
		double c = (a / b);
		System.out.print(">>");
		String sign = sc.next();
		if (sign.equals("=")) {
			total(c);
		} else {
			System.out.print(">>");
			double d = sc.nextDouble();
			if (sign.equals("+")) {
				plus(c, d);
			} else if (sign.equals("-")) {
				minus(c, d);
			} else if (sign.equals("*")) {
				multiply(c, d);
			} else if (sign.equals("/")) {
				division(c, d);
			} else {
				System.out.println("Error");
			}
			sc.close();
		}
	}

	public static void total(double a) {
		System.out.println("Total : " + a);
	}

}