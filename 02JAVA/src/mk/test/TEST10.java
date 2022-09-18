package mk.test;

import java.util.Scanner;

import java.util.Arrays;

public class TEST10 {
//	문제 0) 배열에 53,6,85,3,5를 넣은 다음 배열의 내용을 화면에 출력해 보자.
//	문제 1) 배열 a[]={12,1,53,6,85,3}를 만든 다음에 배열의 모든 내용을 더한 값을
//	sum에 저장하여 출력하는 코드를 만들어 보자.
//	문제 2) 배열 a에 1,2,3 을 넣은 후 배열 내의 모든 값에 2를 더한 값인 3,4,5로
//	변경한 다음에 배열의 내용을 화면에 인덱스 순서대로 출력해 보고 인덱스 역순으로 출력해보자.
//	문제 3) 배열에 들어있는 값중 짝수만 화면에 출력하시오.
//	문제 4) 인덱스가 홀수인 배열의 값을 출력하시오.

	public static void Q0() {
		System.out.println("문제 0) 배열에 53,6,85,3,5를 넣은 다음 배열의 내용을 화면에 출력해 보자.");
		int a[] = { 53, 6, 85, 3, 5 };
		System.out.println(Arrays.toString(a));
	}

	public static void Q1() {
		System.out.println("문제 1) 배열 a[]={12, 1, 53, 6, 85, 3}를 만든 다음에 배열의 모든 내용을 더한 값을\r\n" + "sum에 저장하여 출력하는 코드를 만들어 보자.");
		int a[] = { 12, 1, 53, 6, 85, 3 };
		int sum = a[0] + a[1] + a[2] + a[3] + a[4] + a[5];
		System.out.println(sum);
	}

	public static void Q2() {
		System.out.println("문제 2) 배열 a에 1,2,3 을 넣은 후 배열 내의 모든 값에 2를 더한 값인 3,4,5로\r\n"
				+ "변경한 다음에 배열의 내용을 화면에 인덱스 순서대로 출력해 보고 인덱스 역순으로 출력해보자.");
		int a[] = { 1, 2, 3 };
		a[0] = a[0] + 2;
		a[1] = a[1] + 2;
		a[2] = a[2] + 2;
		int[] reversa = new int[3];
		for (int i = a.length - 1, j = 0; i >= 0; i--, j++) {
			reversa[j] = a[i];
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(reversa));
	}

	public static void Q3() {
		System.out.println("문제 3) 배열에 들어있는 값중 짝수만 화면에 출력하시오.");
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				System.out.println(a[i]);
			}
		}
	}

	public static void Q4() {
		System.out.println("문제 4) 인덱스가 홀수인 배열의 값을 출력하시오.");
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 1) {
				System.out.println(a[i]);
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("문제번호(0~4) >>");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		switch (a) {
		case 0:
			Q0();
			break;
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
		default:
			System.out.println("Error");
			break;
		}
		sc.close();
	}
}