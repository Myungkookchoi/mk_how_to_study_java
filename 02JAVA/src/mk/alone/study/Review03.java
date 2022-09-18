package mk.alone.study;

import java.util.Arrays;
import java.util.Scanner;

public class Review03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[3];
		System.out.println(Arrays.toString(a));
		for (int j = 0; j < 3; j++) {
			a[j] = j + 1;
		}
		System.out.println(Arrays.toString(a));
		for (int i = 0; i < 3; i++) {
			System.out.println(a[i]);
		}
		System.out.println(Arrays.toString(a));
		sc.close();
	}
}
