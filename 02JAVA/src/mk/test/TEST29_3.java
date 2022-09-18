package mk.test;

import java.util.Scanner;

public class TEST29_3 {
	public static int sum(int a, int b) {
		int sum = 0;
		if (a < b) {
			for (int i = a; i < b + 1; i++) {
				sum = sum + i;
			}
			return sum;
		} else if (a > b) {
			for (int i = b; i < a + 1; i++) {
				sum = sum + i;
			}
		}

		return sum;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input1 = sc.nextInt();
		int input2 = sc.nextInt();
		int sum = sum(input1, input2);
		System.out.println(sum);
	}
}
