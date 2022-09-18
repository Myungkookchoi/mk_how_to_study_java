package com.human.ex;

import java.util.Scanner;

public class Alone {

	public static void test1() {
		System.out.println("1. 세로와 가로를 입력 받아 사각형의 넓이를 만드는 순서도와 프로그램을 만들어 보자.");
		Scanner sc = new Scanner(System.in);
		System.out.print("가로 : ");
		String a1 = sc.nextLine();
		int a = Integer.parseInt(a1);
		System.out.print("세로 : ");
		String b1 = sc.nextLine();
		int b = Integer.parseInt(b1);
		System.out.println("넓이 : " + a * b + "입니다.");
		sc.close();
	}

	public static void test2() {
		System.out.println("2. 세로 가로 높이를 입력 받아 사각기둥의 부피를 만드는 순서도와 프로그램을 만들어보자.");
		Scanner sc = new Scanner(System.in);
		System.out.print("가로 : ");
		String a1 = sc.nextLine();
		int a = Integer.parseInt(a1);
		System.out.print("세로 : ");
		String b1 = sc.nextLine();
		int b = Integer.parseInt(b1);
		System.out.println("높이 : ");
		String c1 = sc.nextLine();
		int c = Integer.parseInt(c1);
		System.out.println("넓이 : " + a * b * c + "입니다.");
		sc.close();
	}

	public static void test3() {
		System.out.println("3. a 센치미터가 몇 미터 몇 센치인지 출력하는 프로그램을 구현 하시오.");
		Scanner sc = new Scanner(System.in);
		System.out.print("cm : ");
		String a1 = sc.nextLine();
		double a = Double.parseDouble(a1);
		System.out.print(a / 100 + "m, ");
		System.out.println(a + "cm 입니다.");
		sc.close();
	}

	public static void test4() {
		System.out.println("4. 잔디의 가격은 1 제곱 미터에 a원일 때 윗변이 b,아래변이 c, 높이d인 사다리꼴에 잔디를 심으려면 얼마의 비용이 드는지 구하는 순서도를 작성하시오.");
		Scanner f = new Scanner(System.in);
		System.out.print("윗변 : ");
		String a1 = f.nextLine();
		int a = Integer.parseInt(a1);
		System.out.print("아래변 : ");
		String b1 = f.nextLine();
		int b = Integer.parseInt(b1);
		System.out.println("높이 : ");
		String c1 = f.nextLine();
		int c = Integer.parseInt(c1);
		double all = ((a + b) * c) / 2d;
		System.out.println("넓이는 " + all + " 입니다.");
		System.out.println("가격 : ");
		String d1 = f.nextLine();
		int d = Integer.parseInt(d1);
		System.out.println("가격은 " + (all * d) + "원 입니다.");
		f.close();
	}

	public static void test5() {
		System.out.println(
				"5. 이름 나이 키를 입력받은 화면에 출력하는 프로그램을 작성해 보자. 출력결과: 당신의 이름은 홍길동 입니다.당신의 나이는 23입니다. 당신의 키는 165.5 입니다.");
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String a1 = sc.nextLine();
		String a = a1;
		System.out.print("나이 : ");
		String b1 = sc.nextLine();
		int b = Integer.parseInt(b1);
		System.out.print("키 : ");
		String c1 = sc.nextLine();
		int c = Integer.parseInt(c1);
		System.out.println("당신의 이름은 " + a + "입니다." + "\t" + "당신의 나이는" + b + "입니다." + "\t" + "당신의 키는" + c + "입니다.");
		sc.close();
	}

	public static void test6() {
		System.out.println("6. 두수를 입력받아 두수의 차를 출력하는 프로그램을 작성해보자.");
		Scanner sc = new Scanner(System.in);
		System.out.print("A : ");
		String a1 = sc.nextLine();
		int a = Integer.parseInt(a1);
		System.out.print("B : ");
		String b1 = sc.nextLine();
		int b = Integer.parseInt(b1);
		int c;
		if (a > b) {
			c = a - b;
		} else {
			c = b - a;
			System.out.println("두 수의 차는 " + c + "입니다.");
		}
		sc.close();
	}

	public static void test7() {
		System.out.println("7. 다음은 국어,영어,수학 점수를 입력 받아 평균을 구하여 다음과 같이 출력하는 프로그램을 만들어보자. 출력결과: 국어:80 영어:70 수학:90 평균:80");
		Scanner scanner = new Scanner(System.in);
		System.out.println("국어 점수 : ");
		String a1 = scanner.nextLine();
		int a = Integer.parseInt(a1);
		System.out.println("영어 점수 : ");
		String b1 = scanner.nextLine();
		int b = Integer.parseInt(b1);
		System.out.println("수학 점수 : ");
		String c1 = scanner.nextLine();
		int c = Integer.parseInt(c1);
		double d = (a + b + c) / 3;
		System.out.println("국어:" + a + "\t" + "영어:" + b + "\t" + "수학:" + c + "\n" + "평균:" + d);
		scanner.close();
	}

	public static void test8() {
		System.out.println("8. 키를 m로 소수점 2째 자리까지 입력받아 cm로 바꿔주는 프로그램을 만들어 보자.");
		Scanner sc = new Scanner(System.in);
		System.out.println("키 (m로 적어주세요.): ");
		String a1 = sc.nextLine();
		double a = Double.parseDouble(a1);
		System.out.println(a * 100 + "cm 입니다.");
		sc.close();

	}

	public static void test9() {
		System.out.println("9. 상장의 가로, 세로, 높이를 입력받아 부피를 구하는 프로그램을 만들어 보자.");
		Scanner sc = new Scanner(System.in);
		System.out.print("가로 : ");
		String a1 = sc.nextLine();
		int a = Integer.parseInt(a1);
		System.out.print("세로 : ");
		String b1 = sc.nextLine();
		int b = Integer.parseInt(b1);
		System.out.println("높이 : ");
		String c1 = sc.nextLine();
		int c = Integer.parseInt(c1);
		System.out.println("부피 : " + a * b * c + "입니다.");
		sc.close();
	}

	public static void test10() {
		System.out.println(
				"10. 연필 한박스에 12자루의 연필이 들어 있고 연필 1자루는 1000원 이다. 소비자가 몇 박스의 연필과 몇자루의 연필을 구매할 것인지 입력 받아 계산해주는 프로그램을 만들어보자");
		Scanner sc = new Scanner(System.in);
		System.out.println("연필을 구매할 갯수를 입력해주세요.");
		String a1 = sc.nextLine();
		int a = Integer.parseInt(a1);
		System.out.println("박스:" + (a / 12) + "개\t" + " 자루:" + a % 12 + " 총 :" + a + "자루 입니다." + " 금액:" + (a * 1000));
		sc.close();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("문제 번호를 입력해주세요. \n종료는 stop");
		System.out.println("\n");
		System.out.print("입력 >>");

		String a = sc.nextLine();
		String a1 = a;

		if (a1.equals("1")) {
			test1();
		} else if (a1.equals("2")) {
			test2();
		} else if (a1.equals("3")) {
			test3();
		} else if (a1.equals("4")) {
			test4();
		} else if (a1.equals("5")) {
			test5();
		} else if (a1.equals("6")) {
			test6();
		} else if (a1.equals("7")) {
			test7();
		} else if (a1.equals("8")) {
			test8();
		} else if (a1.equals("9")) {
			test9();
		} else if (a1.equals("10")) {
			test10();
		} else if (a1.equals("stop")) {
			System.out.println("Stop");
		} else {
			System.out.println("Error");
		}
		sc.close();
	}
}