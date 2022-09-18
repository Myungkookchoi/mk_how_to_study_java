package mk.home.offline;

import java.util.Arrays;

public class MyClass_arraysForWhile {
	public static void main(String[] args) {
		int a[] = new int[3];
		System.out.println(Arrays.toString(a));
		int sum = 0;
		for (int count = 0; count < 3; count++) {
			a[count] = count + 1;
		}
		for (int count = 0; count < 3; count++) {
			sum = sum + a[count];
			System.out.println(a[count]);
		}
		System.out.println(Arrays.toString(a));
		System.out.println(sum);
	}
}
