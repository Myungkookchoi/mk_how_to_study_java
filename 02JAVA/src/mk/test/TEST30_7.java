package mk.test;

import java.util.*;

public class TEST30_7 {
	public static void gugu(int input) {
		for (int i = 1; i < 10; i++) {
			System.out.println(input + "단");
			System.out.println(input + "*" + i + "=" + (input * i));
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("단 입력 >>");
		int input = sc.nextInt();
		gugu(input);
	}

}
