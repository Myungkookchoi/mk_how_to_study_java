package mk.test;

import java.util.Scanner;

public class TEST26 {
	public static void Q1() {
		System.out.println("문제 1) 상위 3개의 이미지를 보고 어떤 결과가 출력되는지 기술 해 보고, 기찻길을 그려보고,순서도를 그려보고, 의사 코드를 만들어 보자.");
		System.out.print("1. ");
		for (int i = 3; i < 6; i++) {
			for (int j = 6; j < 9; j++) {
				System.out.print(i + "" + j + " ");
			}
		}
		System.out.print("\n");
		System.out.print("2. ");
		for (int i = 1; i < 4; i++) {
			for (int j = 4; j < 9; j += 2) {
				System.out.print(i + "" + j + " ");
			}
		}
		System.out.print("\n");
		System.out.print("3. ");
		for (int i = 2; i < 7; i += 2) {
			for (int j = 1; j < 4; j++) {
				System.out.print(i + "" + j + " ");
			}
		}
	}

	public static void Q2() {
		System.out.println("문제 2) 이미지와 같은 형태의 구구단을 출력 할 수 있는 코드를 만들어 보자.");
		for (int i = 1; i < 10; i++) {
			System.out.println(i + "단");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + "*" + j + "= " + (i * j));
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (1 != 0) {
			System.out.println("문제 번호 입력 (1~2) 종료 0");
			int input = sc.nextInt();
			if (input == 1) {
				Q1();
			} else if (input == 2) {
				Q2();
			} else if (input == 0) {
				System.out.println("stop");
				break;
			} else {
				System.out.println("Error");
			}
		}
		sc.close();
	}
}
