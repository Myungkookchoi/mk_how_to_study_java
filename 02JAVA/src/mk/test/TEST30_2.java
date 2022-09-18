package mk.test;

import java.util.Scanner;

public class TEST30_2 {
	public static int sum(int a, int b) {
		int sum = a + b;
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1 >>");
		int input1 = sc.nextInt();
		System.out.println("2 >>");
		int input2 = sc.nextInt();
		sum(input1, input2);
	}
}
