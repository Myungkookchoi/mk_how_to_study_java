package mk.alone.study;

import java.util.Scanner;

public class MyClass_AND {

	public static void main(String[] args) {
		boolean isFlag1 = true, isFlag2 = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("a");
		int a = sc.nextInt();
		System.out.println("b");
		int b = sc.nextInt();
		System.out.println("c");
		int c = sc.nextInt();
		System.out.println("d");
		int d = sc.nextInt();

		isFlag1 = a > b;
		isFlag2 = c > d;

//		if (isFlag1 == true) {
//			if (isFlag2 == true) {
//				System.out.println("1번 isFlag1은 true isFlag2는 true");
//			} else {
//				System.out.println("2번 isFlag1은 true isFlag2는 false");
//			}
//		} else {
//			if (isFlag2 == true) {
//				System.out.println("3번 isFlag1은 false isFlag2는 true");
//			} else {
//				System.out.println("4번 isFlag1은 false isFlag2는 false");
//
//			}
//
//		}
		if (isFlag1 == true && isFlag2 == true) {
			System.out.println("1번 isFlag1은 true isFlag2는 true");
		} else if (isFlag1 == true && isFlag2 == false) {
			System.out.println("2번 isFlag1은 true isFlag2는 false");
		} else if (isFlag1 == false && isFlag2 == true) {
			System.out.println("3번 isFlag1은 false isFlag2는 true");
		} else {
			System.out.println("4번 isFlag1은 false isFlag2는 false");
		}
		sc.close();

	}
}