package mk.home.online;

import java.util.*;

public class Answer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int a1 = 1;
		int a2 = 1;
		int a3;

		System.out.println(a1);
		System.out.println(a2);
		for (int i = 0; i < input - 2; i++) {
			a3 = a1 + a2;
			System.out.println(a3);
			a1 = a2;
			a2 = a3;
		}
	}
}