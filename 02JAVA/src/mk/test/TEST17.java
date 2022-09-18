package mk.test;

import java.util.Scanner;

public class TEST17 {

	public static void Q1() {
		System.out.println("문제 1) 다음 이미지에서 조건 부분이 a>5라고 할때 출력 결과가 다음과 같이 나오도록 a값 설정과 순서도와 코드를 만들어 보자.");

		System.out.println("왼쪽 이미지 에서 1번 절차문의 경우 01,02,03이 출력 되다.");
		System.out.println("" + "		int a = 6;\r\n" + "		System.out.println(\"01\");\r\n"
				+ "		boolean b = a > 5;\r\n" + "		System.out.println(\"02\");\r\n"
				+ "		if (b == true) {\r\n" + "		System.out.println(\"03\");");
		System.out.println("");
		System.out.print("출력 값 >> ");
		int a = 6;
		System.out.print("01,");
		boolean b = a > 5;
		System.out.print("02,");
		if (b == true) {
			System.out.println("03");
		}
		System.out.println("");

		System.out.println("문제 1-2) 2번 조건문에서 01,02,04가 출력되도록 a값을 설정하여 코드를 만들어보자.");
		System.out.println("" + "		int c = 1;\r\n" + "		System.out.println(\"01\");\r\n"
				+ "		if (c == 1) {\r\n" + "			System.out.println(\"02\");\r\n" + "		} else {\r\n"
				+ "			System.out.println(\"03\");\r\n" + "		}\r\n" + "		System.out.println(\"04\");");
		System.out.println("");
		System.out.print("출력 값 >> ");
		int c = 1;
		System.out.print("01,");
		if (c == 1) {
			System.out.print("02,");
		} else {
			System.out.print("03,");
		}
		System.out.println("04");
		System.out.println("");

		System.out.println("문제 1-3) 2번 조건문에서 01,03,04가 출력 되도록 a값을 설정하여 코드를 만들어보자.");
		System.out.println("" + "		int d = 1;\r\n" + "		System.out.println(\"01\");\r\n"
				+ "		if (d != 1) {\r\n" + "			System.out.println(\"02\");\r\n" + "		} else {\r\n"
				+ "			System.out.println(\"03\");\r\n" + "		}\r\n" + "		System.out.println(\"04\");");
		System.out.println("");
		System.out.print("출력 값 >> ");
		int d = 1;
		System.out.print("01,");
		if (d != 1) {
			System.out.print("02,");
		} else {
			System.out.print("03,");
		}
		System.out.println("04");
		System.out.println("");

		System.out.println("문제 1-4) 3번 반복문에서 01,03이 출력 되도록a값을 설정하여 코드를 만들어 보자.");
		System.out.println("" + "		int e = 0;\r\n" + "		System.out.println(\"01\");\r\n"
				+ "		for (e = 0; e < 0; e++) {\r\n" + "			System.out.println(\"02\");\r\n" + "		}\r\n"
				+ "		System.out.println(\"03\");");
		System.out.println("");
		System.out.print("출력 값 >> ");
		int e = 0;
		System.out.print("01,");
		for (e = 0; e < 0; e++) {
			System.out.print("02,");
		}
		System.out.println("03");
		System.out.println("");

		System.out.println("문제 1-5) 3번 반복문에서 01,02,03이 출력 되도록 a값을 설정하여 코드를 만들어 보자.");
		System.out.println("" + "		int f = 0;\r\n" + "		System.out.println(\"01\");\r\n"
				+ "		for (f = 0; f < 1; f++) {\r\n" + "			System.out.println(\"02\");\r\n" + "		}\r\n"
				+ "		System.out.println(\"03\");");
		System.out.println("");
		System.out.print("출력 값 >> ");
		int f = 0;
		System.out.print("01,");
		for (f = 0; f < 1; f++) {
			System.out.print("02,");
		}
		System.out.println("03");
		System.out.println("");

		System.out.println("문제 1-6) 3번 반복문에서 01,02,02,02,03이 출력 되도록 a값을 " + "설정하여 코드를 만들어 보자. "
				+ "\n상위와 같은 형태의 출력이 가능하도록 기찻길을 만들어 " + "출력되도록 구현해보자.");
		System.out.println("" + "		int g = 0;\r\n" + "		System.out.println(\"01\");\r\n"
				+ "		for (g = 0; g < 3; g++) {\r\n" + "			System.out.println(\"02\");\r\n" + "		}\r\n"
				+ "		System.out.println(\"03\");");
		System.out.println("");
		System.out.print("출력 값 >> ");
		int g = 0;
		System.out.print("01,");
		for (g = 0; g < 3; g++) {
			System.out.print("02,");
		}
		System.out.println("03");
		System.out.println("");
	}

	public static void Q2() {
		System.out.println("문제 2)아래 왼쪽 이미지의 순서도를 코드로 작성해 보고 무엇이 출력되는지 확인해 보자.");
		int a = 2;
		int b = 1;
		b++;
		System.out.println(String.format("(%d, %d)", a, b));
		for (b = 1; b < 15; a++) {
			a = a + 1;
			b = b + a;
		}
		System.out.println(String.format("(%d, %d)", a, b));
	}

	public static void Q3() {
		{
			System.out.println("문제 3)아래 오른쪽 이미지의 순서도에서 조건식이 a<5일대 a를 적절히 변경해서 다음과 같이 출력되도록 프로그램을 구현해보자.");
			System.out.println("1. p1,p3,p4,p5,p8,p9");
			System.out.print("   ");
			int a = 0;
			System.out.print("p1,");
			for (a = 5; a < 5; a++) {
				System.out.print("p2,");
			}
			System.out.print("p3,");
			if (a > 1) {
				System.out.print("p4,");
			} else {
				System.out.print("p6,");
			}
			if (a > 1) {
				System.out.print("p5,");
			} else {
				System.out.print("p7,");
			}
			System.out.print("p8,");

			System.out.println("p9");
			System.out.println("");
		}
		{
			System.out.println("2. p1,p2,p3,p6,p7,p8,p9");
			System.out.print("   ");
			int a = 0;
			System.out.print("p1,");
			for (a = 4; a < 5; a++) {
				System.out.print("p2,");
			}
			System.out.print("p3,");
			if (a < 1) {
				System.out.print("p4,");
			} else {
				System.out.print("p6,");
			}
			if (a < 1) {
				System.out.print("p5,");
			} else {
				System.out.print("p7,");
			}
			System.out.print("p8,");

			System.out.println("p9");
			System.out.println("");
		}
		{
			System.out.println("3. p1,p2,p2,p2,p3,p4,p5,p8,p9");
			System.out.print("   ");
			int a = 0;
			System.out.print("p1,");
			for (a = 2; a < 5; a++) {
				System.out.print("p2,");
			}
			System.out.print("p3,");
			if (a > 1) {
				System.out.print("p4,");
			} else {
				System.out.print("p6,");
			}
			if (a > 1) {
				System.out.print("p5,");
			} else {
				System.out.print("p7,");
			}
			System.out.print("p8,");

			System.out.println("p9");
			System.out.println("");

		}

	}

	public static void Q4() {
		System.out.println("문제 4) 1~3를 출력해보자. 이전 순서도에서 ‘안녕’를 출력하는 부분에 i를 넣어서 어떻게 출력되는지 고민해 보고 코드를 만들어 보자");

		int i = 0;
		while (i < 3) {
			i++;
			System.out.println(i);
		}

	}

	public static void Q5() {
		System.out.println("문제 5) 1을 3번 더하는 코드를 만들어 보자.");
		int i = 0;
		int sum = 0;
		while (i < 3) {
			i++;
			System.out.println(i + "+" + sum + "=" + (sum + i));
			sum = sum + i;
		}
		System.out.println(sum);
	}

	public static void Q6() {
		System.out.println("문제 6) 3부터 10을 출력하는 코드를 만들어 보자.");
		int i = 3;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
	}

	public static void Q7() {
		System.out.println("문제 7) 1~10까지의 사이 숫자를 더한 총합을 sum에 넣어 출력하는 코드를 만들어 보자.");
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			System.out.println(String.format("%d + %d = %d", i, sum, (sum + i)));
			sum = sum + i;
		}
		System.out.println("sum = " + sum);
	}

	public static void Q8() {
		System.out.println("문제 8) 15~30까지의 사이 숫자를 더하기 더한 총합을 sum에 넣어 출력하는 코드를 만들어보자.");
		int i = 15;
		int sum = 0;
		while (i <= 30) {
			sum = sum + i;
			i++;
		}
		System.out.println(sum);
	}

	public static void Q9() {
		System.out.println("문제 9) 사용자에게 1부터 9 사이에 숫자를 받아서 사용자가 입력한 숫자에 맞는 구구단의 해당 단을 출력해 보자."
				+ "\n\t예를 들어 사용자가 4를 입력하면 4단을 출력하면 된다.");
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단------");
		System.out.print("숫자 입력 >> ");
		int input = sc.nextInt();
		System.out.println("");
		System.out.println("구구단" + input + "단");
		int i = 1;
		int sum = 0;
		while (i < 10) {
			sum = input * i;
			System.out.println(String.format("%d * %d = %d", input, i, sum));
			i++;
		}
		sc.close();
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int q = 1;
		while (q != 0) {
			System.out.print("Q번호 입력(1~9), Q9는 실행후 종료됨. 종료는 0 >>");
			int a = sc.nextInt();
			if (a == 1) {
				Q1();
			} else if (a == 2) {
				Q2();
			} else if (a == 3) {
				Q3();
			} else if (a == 4) {
				Q4();
			} else if (a == 5) {
				Q5();
			} else if (a == 6) {
				Q6();
			} else if (a == 7) {
				Q7();
			} else if (a == 8) {
				Q8();
			} else if (a == 9) {
				Q9();
				break;
			} else if (a == 0) {
				System.out.println("종료");
				break;
			} else {
				System.out.println("Error");
				break;
			}
		}
		sc.close();
	}
}