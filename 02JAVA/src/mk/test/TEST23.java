package mk.test;

import java.util.Scanner;

public class TEST23 {

	public static void Q1() {
		System.out.println("문제 1) 상위 왼쪽의 이미지를 기본으로 원하는 결과를 출력할 수 있도록 a값을 설정할 수 있는 코드를 구현해 보자.");
		int a = 10;
		System.out.println("11");
		if (a > 5) {
			System.out.println("12");
			if (a > 7) {
				System.out.println("02");
			} else {
				System.out.println("03");
			}
			System.out.println("04");
			if (a > 9) {
				System.out.println("05");
			} else {
				System.out.println("06");
			}
			System.out.println("07");
		} else {
			System.out.println("13");
			System.out.println("05");
		}
		System.out.println("14");
	}

	public static void Q2() {
		System.out.println("문제 2) 조건문안에 반복문을 사용할 수 있다. 왼쪽 순서도를 보고 원하는 결과를 출력할 수 있도록 a값을 설정할 수 있는 코드를 구현해 보자.");
		int i = 1;
		if (i == 0) {
			System.out.println("11");
			int j = 0;
			System.out.println("13");
			for (j = 0; j < 3; j++) {
				System.out.println("14");
			}
			System.out.println("15");
		} else {
			System.out.println("12");
			i = i - 1;
			System.out.println("16");
		}
		System.out.println("17");
	}

	public static void Q3() {
		System.out.println("문제 3) 조건문안에 반복문을 사용할 수있고 반복문안에 조건문을 사용할 수 있다. "
				+ "\n상위 가운데 이미지를 보면 조건문안에 반복문이 있는 것을 확인할 수 있다. " + "\n상위 맨오른쪽을 보면 반복문 안에 조건문이 있는것을 확인할 수 있다. "
				+ "\n상위 왼쪽 2개의 이미지를 원하는 결과를 출력할 수 있도록 a값을 설정할 수 있는 코드를 구현해 보자.");
		int i = 0;
		System.out.println("01");
		if (i == 0) {
			System.out.println("02");
			for (int j = 0; j < 3; j++) {
				System.out.println("04");
			}
			System.out.println("06");
		} else {
			System.out.println("03");
		}
		System.out.println("07");
		System.out.println("위에는 왼쪽 이미지===================== 아래는 오른쪽 이미지");
		int j = 0;
		System.out.println("01");
		for (j = 0; j < 3; j++) {
			System.out.println("02");
			if (j == 2) {
				System.out.println("03");
			} else {
				System.out.println("04");
			}
		}
		System.out.println("05");
	}

	public static void Q4() {
		System.out.println("문제 4) 다음 페이지의 왼쪽 이미지를 보고 원하는 결과를 출력할 수 있도록 a값을 설정할 수 있는 코드를 구현해 보자.");
		int a = 2;
		System.out.println("01");
		if (a == 0) {
			System.out.println("02");
			for (int i = 0; i < 3; i++) {
				System.out.println("04");
			}
			System.out.println("05");
			a = 2;
			System.out.println("08");
		} else {
			System.out.println("03");
			if (a == 2) {
				System.out.println("07");
				for (int i = 0; i < 3; i++) {
					System.out.println("13");
					if (i == 2) {
						System.out.println("07");
					} else {
						System.out.println("12");
					}
					System.out.println("11");
				}
				System.out.println("14");
				a = 0;
				System.out.println("09");
			} else {
				System.out.println("06");
			}
		}
		System.out.println("10");
	}

	public static void Q5() {
		System.out.println("문제 5) 다음 페이지의 오른쪽 이미지를 보고 원하는 결과를 출력할 수 있도록 a값을 설정할 수 있는 코드를 구현해 보자.");
		int a = 1;
		System.out.println(a); // 1
		if (a == 1) {
			a = 3;
			System.out.println(a); // 3
			a = 4;
			System.out.println(a); // 4
		} else {
			a = 6;
			System.out.println(a); // 6
			while (a < 8) {
				a++;
				System.out.println(a); // 7,8
			}
			System.out.println(a); // 8
		}
		a = 5;
		System.out.println(a); // 5
		a = a + 2;
		System.out.println(a); // 7
		if (a == 7) {
			a = 11;
			System.out.println(a); // 11
			while (a < 12) {
				a++;
				System.out.println(a); // 12
			}
			System.out.println(a); // 13
		} else {
			a = 16;
			System.out.println(a); // 16
		}
		a = 13;
		System.out.println(a); // 13
		while (a < 16) {
			a++;
			System.out.println(a);// 14,15,16
			if (a == 17) {
				a = 22;
				System.out.println(a);// 22
			} else {
				a = 21;
				System.out.println(a); // 21
			}
			a = 18;
			System.out.println(a);// 18
		}
		a = 19;
		System.out.println(a); // 19
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		while (i == 0) {
			System.out.println("문제 번호 입력(1~5) 종료는 0");
			int input = sc.nextInt();
			if (input == 1) {
				Q1();
			} else if (input == 2) {
				Q2();
			} else if (input == 3) {
				Q3();
			} else if (input == 4) {
				Q4();
			} else if (input == 5) {
				Q5();
			} else if (input == 0) {
				System.out.println("종료");
				break;
			} else {
				System.out.println("잘못 입력");
			}
		}
		sc.close();
	}
}
