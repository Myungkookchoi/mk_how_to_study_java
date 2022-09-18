package mk.test;

import java.util.Scanner;
//문제 1. 변수 a에 20, b에 0를 넣은 다음 만약에 a가 10보다 크면 a에 b를 넣고 아니면
//b에 a를 넣어서 a,b값을 출력하는 프로그램을 만들어 보자.

//문제 2. 입력한 숫자가 10보다 큰 수인지 아닌지 출력하는 코드를 만들어 보자.

//문제 3. result라는 변수를 선언하고 사용자에게 수를 입력 받아 0이 면 0를 0이아니면 1를
//넣어서 출력하는 프로그램을 구현해 보자.

//문제 5. 입력 받은 숫자의 절대값을 출력하는 프로그램을 만들어 보자.

//문제 6. 두수를 입력해서 큰수에서 작은수를 뺀 차이를 출력하는 프로그램을 구현해 보자.

//문제 7. 입력받은 3개의 숫자 중 가장 큰 수를 출력하는 코드를 구현하시오. 3개중에서
//2개를 선택해서 큰수를 구한후 나머지 하나를 비교해 보면된다.

public class TEST11 {
	public static void Q1() {
		System.out
				.println("문제 1. 변수 a에 20, b에 0를 넣은 다음 만약에 a가 10보다 크면 a에 b를 넣고 아니면 b에 a를 넣어서 a,b값을 출력하는 프로그램을 만들어 보자.");
		int a = 20;
		int b = 0;
		if (a > 10) {
			b = a;
			System.out.println(a);
			System.out.println(b);
		} else if (a < 10) {
			a = b;
			System.out.println(a);
			System.out.println(b);
		} else {
			System.out.println("a == 10");
		}
	}

	public static void Q2() {
		System.out.println("//문제 2. 입력한 숫자가 10보다 큰 수인지 아닌지 출력하는 코드를 만들어 보자.");
		System.out.println(">>");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (a < 10)
			System.out.println("a는 10보다 작습니다.");
		else if (a == 10)
			System.out.println("a는 10과 같습니다.");
		else
			System.out.println("a는 10보다 큽니다.");
		sc.close();

	}

	public static void Q3() {
		System.out.println("문제 3. result라는 변수를 선언하고 사용자에게 수를 입력 받아 0이 면 0를 0이아니면 1를 넣어서 출력하는 프로그램을 구현해 보자.");
		System.out.println(">>");
		Scanner sc = new Scanner(System.in);
		int result = sc.nextInt();
		if (result == 0)
			System.out.println("0");
		else if (result != 0)
			System.out.println("1");
		sc.close();

	}

	public static void Q5() {
		// asldkfj
		System.out.println("문제 5. 입력 받은 숫자의 절대값을 출력하는 프로그램을 만들어 보자.");
		System.out.println(">>");
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double a1 = Math.abs(a);
		System.out.println(a1);
		sc.close();
	}

	public static void Q6() {
		System.out.println("문제 6. 두수를 입력해서 큰수에서 작은수를 뺀 차이를 출력하는 프로그램을 구현해 보자.");
		Scanner sc = new Scanner(System.in);
		System.out.println(">>");
		int a = sc.nextInt();
		System.out.println(">>");
		int b = sc.nextInt();
		if (a >= b)
			System.out.println(a - b);
		else if (a <= b)
			System.out.println(b - a);
		sc.close();

	}

	public static void Q7() {
		System.out.println("문제 7. 입력받은 3개의 숫자 중 가장 큰 수를 출력하는 코드를 구현하시오. 3개중에서 2개를 선택해서 큰수를 구한후 나머지 하나를 비교해 보면된다.");
		Scanner sc = new Scanner(System.in);
		System.out.println(">>");
		int a = sc.nextInt();
		System.out.println(">>");
		int b = sc.nextInt();
		System.out.println(">>");
		int c = sc.nextInt();
		if (a > b) {
			if (a > c)
				System.out.println(a + "가 가장큽니다.");
			else if (a < c)
				System.out.println(c + "가 가장큽니다.");
		} else if (a <= b) {
			if (b > c)
				System.out.println(b + "가 가장큽니다.");
			else if (b < c)
				System.out.println(c + "가 가장큽니다.");
			else
				System.out.println(a + "가 가장큽니다.");
		}
		sc.close();
	}

	public static void main(String[] args) {
		System.out.println("문제번호를 입력하세요.(1~7)");
		Scanner sc = new Scanner(System.in);
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
		case 5:
			Q5();
			break;
		case 6:
			Q6();
			break;
		case 7:
			Q7();
			break;
		case 4:
			System.out.println("문제 없음.");
			break;
		}
		sc.close();
	}
}