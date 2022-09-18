package mk.test;

import java.util.Arrays;
import java.util.Scanner;

public class TEST19 {
	public static void Q1() {
		System.out.println("문제 1) 배열 a에 1,2,3 을 넣은 후 배열 내의 모든 값에 2를 더한 값인 3,4,5로 변경한"
				+ "\n다음에 배열의 내용을 화면에 출력하는 순서도와 코드를 구현하여 보자.");

		int a[] = new int[3];
		int i = 0;
		int j = 1;
		while (i < a.length) {
			while (j < 4) {
				a[i] = j;
				i++;
				j++;
			}
			System.out.println(Arrays.toString(a));
		}
		i = 0;
		j = 1;
		while (i < a.length) {
			while (j < 4) {
				a[i] = j + 2;
				i++;
				j++;
			}
			System.out.println(Arrays.toString(a));
		}
	}

	public static void Q2() {
		System.out.println("문제 2) 배열 a[10]에 3의 배수를 넣은 다음에 배열의 내용을 출력하는 순서도와" + "\n의사코드를 만들어 보자.");
		int a[] = new int[10];
		int i = 0;
		int j = 3;
		int k = 1;
		while (i < a.length) {
			while (j <= 30) {
				while (k <= 10) {
					a[i] = j;
					k++;
					j = k * 3;
					i++;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

	public static void Q3() {
		System.out.println(
				"문제 3) 배열 a[100]에 1부터 100까지의 숫자를 순서대로 넣은 다음 배열의 인덱스가\r\n" + "짝수인 배열에 들어 있는 값만 출력하는 코드를 만들어 보자.");

		int a[] = new int[100];
		int i = 0;
		int j = 0;
		while (i < a.length) {
			while (j < a.length) {
				j++;
				a[i] = j;
				if (a[i] % 2 == 0) {
					System.out.println(a[i]);

				}
				i++;
			}
		}
	}

	public static void Q4() {
		System.out
				.println("문제 4) 배열 a[]={12,1,5,3,6,8,5,3}를 만든 다음에 배열의 모든 내용을 더한 값을\r\n" + "sum에 저장하여 출력하는 코드를 만들어 보자.");
		int a[] = { 12, 1, 5, 3, 6, 8, 5, 3 };
		int i = 0;
		int sum = 0;
		for (; i < a.length; i++) {
			sum = a[i] + sum;
		}
		System.out.println(sum);
	}

	public static void Q5() {
		System.out.println(
				"문제 5) a[]={12,1,5,3,6,8,5,3}의 a배열에서 배열 안의 숫자가 짝수인 12,6,8 의 값을\r\n" + "더한 결과 값을 출력하는 프로그램을 작성해 보자.");
		int a[] = { 12, 1, 5, 3, 6, 8, 5, 3 };
		int i = 0;
		int sum = 0;
		for (; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				sum = a[i] + sum;
			}
		}
		System.out.println(sum);
	}

	public static void Q6() {
		System.out.println("문제 6) a[]={12,1,51,3,6,8,5}의 a배열에서 가장 큰 값과 가장 작은 값을 더하는\r\n" + "프로그램을 작성해 보자.");
		int a[] = { 12, 1, 51, 3, 6, 8, 5 };
		int max = a[0];
		int min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			} else if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("최댓값 : " + max);
		System.out.println("최솟값 : " + min);
		int total = max + min;
		System.out.println("최댓값 + 최솟값 = " + total);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		while (i != 1) {
			System.out.println("===============================");
			System.out.println("문제 번호를 입력하세요.(1~6) 종료는 0");
			int input = sc.nextInt();
			switch (input) {
			case 1:
				Q1();
				continue;
			case 2:
				Q2();
				continue;
			case 3:
				Q3();
				continue;
			case 4:
				Q4();
				continue;
			case 5:
				Q5();
				continue;
			case 6:
				Q6();
				continue;
			case 0:
				System.out.println("종료");
				break;
			default:
				System.out.println("Error");
				break;
			}
			break;
		}
		sc.close();
	}
}
