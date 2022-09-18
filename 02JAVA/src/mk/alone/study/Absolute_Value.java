package mk.alone.study;

import java.util.Scanner;

public class Absolute_Value {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		if (input < 0) {
			System.out.println(input * -1);
		} else {
			System.out.println(input);

//		int i = 0;
//		do {
//			System.out.println(i + "hi");
//			i++;
//		} while (i < 10);

//		int i = 0;
//		while (i < 10) {
//			System.out.println(i + "Hi");
//			i++;
//		}

//		for (int i = 0; i < 10; i++) {
//			System.out.println(i + "Hi");
//		}

		}
		sc.close();
	}
}
