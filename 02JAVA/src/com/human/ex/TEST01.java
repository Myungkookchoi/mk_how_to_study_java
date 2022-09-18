package com.human.ex;

public class TEST01 {

	public static void main(String[] args) {
		// 문제 0)
		int a = 8 % 5;
		System.out.println(a);
		a = a * 1;
		System.out.println(a);
		int b = 5 * 5;
		System.out.println(b);
		b = b + 3;
		System.out.println(b);
		System.out.println(a + b);

		// 문제 1)
		int c = 5 + 3;
		System.out.println(c);
		int sum1 = c * 6;
		System.out.println(sum1);

		// 문제 2)
		int d = 8 % 5;
		System.out.println(d);
		int sum2 = d * 1;
		System.out.println(sum2);
		int e = 5 * 5;
		System.out.println(e);
		int sum3 = e + 3;
		System.out.println(sum3);
		System.out.println(sum2 + sum3);

		// 문제 3)5%6+(3+3*2)를 한 줄에 하나씩 연산하는 자바 코드
		int f = 3 * 2;
		System.out.println(f);
		f = f + 3;
		System.out.println(f);
		int g = 5 % 6;
		System.out.println(g);
		System.out.println(f + g);

		// 문제 4) 2%6+3+(2+5)+3/2를 한 줄에 하나씩 연산하는 자바코드 (변수 3개 필요함.)
		int h = 2 + 5;
		System.out.println(h);
		int i = 2 % 6;
		System.out.println(i);
		int j = 3 / 2;
		System.out.println(j);
		h = i + h + j;
		System.out.println(h);

		// 문제 5) a=b=40; a=5+3=8*4; 다음 코드중 잘못된 부분을 찾아서 잘못된 이유를 설명해 보자.
		// a=b=40 : 두개 변수에 상수값을 넣을 수 없음.
		// a=5+3=8*4 : 두 개의 변수값을 하나의 상수에 넣을 수 없음.

		System.out.println(3 + 3 + "hello"); // 1)6hello
		System.out.println("hello" + 4 + 4);// 3)hello44
		String name = "홍길동";
		int age = 5;
		System.out.println("이름은" + name + "나이는" + age);

	}
}