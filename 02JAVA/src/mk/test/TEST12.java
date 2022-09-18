package mk.test;

//문제 1. 숫자를 하나 입력 받아 홀수 인지 짝수 인지 구하는 프로그램을 구하여라.

//문제 2. 숫자 2개를 입력 받아 첫번째 숫자가 두번째 숫자의 배수인지 아닌지 출력하는 프로그램을 구하여라.
//문제 3. a 원을 동전으로 바꾸면 500원짜리 몇 개 100원짜리 몇 개가 되는가?
//문제 4. 500원짜리 n개 100원짜리 m개 총 얼마인가?
//문제 5. n초를 입력 받아 시분초로 바꿔보자.
//문제 6. n시간 m분 l초는 총 몇초인가?

import java.util.Scanner;

public class TEST12 {
	public static void Q1() {
		System.out.println("문제 1. 숫자를 하나 입력 받아 홀수 인지 짝수 인지 구하는 프로그램을 구하여라.");
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요. >>");
		int a = sc.nextInt();
		if (a % 2 == 0) {
			if (a == 0)
				System.out.println("a는 0");
			else
				System.out.println("짝수");
		} else if (a % 2 == 1)
			System.out.println("홀수");
		sc.close();
	}

	public static void Q2() {
		System.out.println("문제 2. 숫자 2개를 입력 받아 첫번째 숫자가 두번째 숫자의 배수인지 아닌지 출력하는 프로그램을 구하여라.");
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자 입력 >>");
		long a = sc.nextInt();
		System.out.println("두번째 숫자 입력 >>");
		long b = sc.nextInt();
		if (a > b) {
			if (a % b == 0)
				System.out.println(a + "는 " + b + "의 배수입니다.");
			else if (a % b != 0)
				System.out.println(a + "는 " + b + "배수가 아닙니다.");
			else
				System.out.println("Error");
		} else if (a < b) {
			if (b % a == 0)
				System.out.println(b + "는 " + a + "의 배수입니다.");
			else if (b % a != 0)
				System.out.println(b + "는 " + a + "배수가 아닙니다.");
			else
				System.out.println("Error");
		}
		sc.close();

	}

	public static void Q3() {
		System.out.println("문제 3. a 원을 동전으로 바꾸면 500원짜리 몇 개 100원짜리 몇 개가 되는가?");
		Scanner sc = new Scanner(System.in);
		System.out.println("가격을 입력해주세요. ??");
		int a = sc.nextInt();
		int b = a / 500;
		int c = a % 500;
		int d = c / 100;
		if (c == 0)
			System.out.println(String.format("500원짜리 %d개가 필요합니다.", b));
		else if (b != 0)
			System.out.println(String.format("500원짜리 %d개와 100원짜리 %d개가 필요합니다", b, d));
		sc.close();
	}

	public static void Q4() {
		System.out.println("문제 4. 500원짜리 n개는 100원짜리 m개 총 얼마인가?");
		Scanner sc = new Scanner(System.in);
		System.out.println("500원 갯수를 입력하세요. >>");
		int a = sc.nextInt();
		int b = a * 5;
		System.out.println(String.format("500원짜리 %d개는 100원짜리 %d개입니다.", a, b));
		sc.close();
	}
	
	public static void Q5() {
		System.out.println("문제 5. n초를 입력 받아 시분초로 바꿔보자.");
		Scanner se = new Scanner(System.in);
		System.out.println("시간을 입력해주세요(단위 : 초) \n >>");
		int a = se.nextInt();
		int b = a / 3600;
		int c = a % 3600;
		int d = c / 60;
		int e = c % 60;
		if (c == 0)
			System.out.println(b + "시간입니다.");
		else if (d == 0)
			System.out.println(b + "시간, " + d + "분 입니다.");
		else if (e == 0)
			System.out.println(b + "시간, " + d + "분 입니다.");
		else if (e != 0)
			System.out.println(b + "시간, " + d + "분, " + e + "초 입니다.");
		se.close();
	}

	public static void Q6() {
		System.out.println("문제 6. n시간 m분 l초는 총 몇초인가?");
		Scanner sc = new Scanner(System.in);
		System.out.println("시간 입력 >> ");
		int h = sc.nextInt();
		System.out.println("분 입력 >> ");
		int m = sc.nextInt();
		System.out.println("초 입력 >> ");
		int c = sc.nextInt();
		if (h == 0) {
			if (m != 0) {
				if (c == 0)
					System.out.println(m + "분은 " + (m * 60) + "초 입니다.");
				else if (c > 0)
					System.out.println(m + "분 " + c + "초는 " + ((m * 60) + c) + "초 입니다.");
			} else if (m == 0)
				System.out.println(c + "초는 " + c + "초 입니다.");
		} else if (h > 0) {
			if (m != 0) {
				if (c == 0)
					System.out.println(h + "시간 " + m + "분은 " + ((h * 3600) + (m * 60)) + "초 입니다.");
				else if (c != 0)
					System.out.println(h + "시간 " + m + "분 " + c + "초는 " + ((h * 3600) + (m * 60) + c) + "초 입니다.");
			} else if (h > 0) {
				if (c == 0)
					System.out.println(h + "시간은 " + (h * 3600) + "초 입니다.");
				else if (m == 0)
					System.out.println(h + "시간 " + c + "초는 " + ((h * 3600) + c) + "초 입니다.");
			}
		}
		sc.close();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문제 번호 입력(1~6) >>");
		int a = sc.nextInt();
		switch (a) {
		case 1:
			Q1();
			break;
		case 2:
			Q2();
			break;
		case 3:
			Q3();
			break;
		case 4:
			Q4();
			break;
		case 5:
			Q5();
			break;
		case 6:
			Q6();
			break;
		default:
			System.out.println("Error");
			break;
		}
		sc.close();
	}
}