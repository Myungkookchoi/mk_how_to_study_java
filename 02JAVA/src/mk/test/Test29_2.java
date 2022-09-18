package mk.test;

import java.util.Scanner;

public class Test29_2 {
	public static void hello() {
		System.out.println("안녕하세요");
	}

	public static void main(String[] args) {
		System.out.println("숫자 입력");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		for (int i = 0; i < input; i++) {
			hello();
		}
		sc.close();
	}
}
