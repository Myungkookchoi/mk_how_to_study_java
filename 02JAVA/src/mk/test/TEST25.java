package mk.test;

import java.util.Scanner;

public class TEST25 {

	public static void Q1() {
		System.out.println("1. 1**********************1");
		System.out.print("1. ");
		for (int i = 1; i > 0; i--) {
			System.out.print(i);
			for (int j = 0; j < 11; j++) {
				System.out.print("**");
			}
			System.out.print(i);
		}
	}

	public static void Q2() {
		System.out.println("2. *****1*****1*****1*****1");
		System.out.print("2. ");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.print(1);
		}
	}

	public static void Q3() {
		System.out.println("3. 2*****2*****2*****2*****");
		System.out.print("3. ");
		for (int i = 0; i < 4; i++) {
			System.out.print(2);
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
		}
	}

	public static void Q4() {
		System.out.println("4. 21**********************1");
		System.out.print("4. ");
		System.out.print(2);
		for (int i = 1; i > 0; i--) {
			System.out.print(i);
			for (int j = 0; j < 11; j++) {
				System.out.print("**");
			}
			System.out.print(i);
		}
	}

	public static void Q5() {
		System.out.println("5. 1****21****21****21****2");
		System.out.print("5. ");
		for (int x = 4; x > 0; x--) {
			for (int i = 1; i < 2;) {
				System.out.print(i);
				i++;
				for (int j = 0; j < 4; j++) {
					System.out.print("*");
				}
				System.out.print(i);
			}
		}
	}

	public static void Q6() {
		System.out.println("6. 1111****21111****21111****21111****2");
		System.out.print("6. ");
		for (int j = 0; j < 4; j++) {
			int a = 1;
			for (int x = 0; x < 4; x++) {
				System.out.print(a);
			}
			for (int i = 0; i < 4; i++) {
				System.out.print("*");
			}
			a++;
			System.out.print(a);
		}
	}

	public static void Q7() {
		System.out.println("7. 1111****22221111****22221111****2222");
		System.out.print("7. ");
		for (int i = 0; i < 3; i++) {
			int a = 1;
			for (int j = 0; j < 4; j++) {
				System.out.print(a);
			}
			a++;
			for (int x = 0; x < 4; x++) {
				System.out.print("*");
			}
			for (int y = 0; y < 4; y++) {
				System.out.print(a);
			}
		}
	}

	public static void Q8() {
		System.out.println("8. 111122223333444411112222333344441111222233334444");
		System.out.print("8. ");
		for (int a = 0; a < 3; a++) {
			for (int i = 1; i < 5; i++) {
				for (int j = 0; j < 4; j++) {
					System.out.print(i);
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (1 != 0) {
			System.out.println("");
			System.out.println("문제 번호 입력 (1~8) 종료는 0");
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
			} else if (a == 0) {
				break;
			} else {
				System.out.println("잘못입력");
			}
		}
		sc.close();
	}
}

//1. 1/**/**/**/**/**/**/**/**/**/**/**/1
//2. *****1/*****1/*****1/*****1
//3. 2*****/2*****/2*****/2*****
//4. 2/1/**/**/**/**/**/**/**/**/**/**/**/1
//5. 1****2/1****2/1****2/1****2
//6. 1111****2/1111****2/1111****2/1111****2
//7. 1111****2222/1111****2222/1111****2222
//8. 1111222233334444/1111222233334444/1111222233334444