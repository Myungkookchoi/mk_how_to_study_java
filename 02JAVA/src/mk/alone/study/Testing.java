package mk.alone.study;

import java.util.Scanner;

public class Testing {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int t = 0;

		if (a < b) {
			if (a < c) {

			} else {
				if (c < b) {
					t = a;
					a = c;
					c = t;
				} else {
					t = a;
					a = b;
					b = t;
				}
			}
		} else {
			if (b < c) {
				t = a;
				a = b;
				c = t;
			}
		}

		if (b > c) {
			t = b;
			b = c;
			c = t;

		} else {

		}
		System.out.println(a + ":" + b + ":" + c);
		sc.close();
	}
}