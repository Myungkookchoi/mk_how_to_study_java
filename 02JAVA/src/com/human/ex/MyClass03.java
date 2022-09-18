package com.human.ex;

public class MyClass03 {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		// SC를 통해서 사용자의 입력은 받음 / System.in : 키보드 입력
		System.out.print("정수 입력>>");
		// 사용자의 입력을 유도하는 칸
		String st = sc.nextLine();
		// 사용자의 입력을 받아오는 코드 / 입력 >> 123 을 해야지 넘어옴.
		int i = Integer.parseInt(st);
		// 문자열을 정수로 바꾸는 법.
		System.out.println(i);
		sc.close();
		char b = 'a';
		System.out.println(b+1);
	}

}
