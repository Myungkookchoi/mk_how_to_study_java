package com.human.ex;

public class MyClass02 {

	public static void main(String[] args) {
		int a = 5;
		int b = 6;
		int sum = a + b;
		a = 7;
		System.out.println(sum);
		System.out.println(a);
		System.out.println(b);
		sum = a + b;
		System.out.println(sum);
		System.out.println(a);
		System.out.println(b);

		// int a1 = 10000000000l; <- (Error)
		int a1 = (int) 10000000000l;
		// int b1 = 12.24; <- (Error)
		int b1 = (int) 12.24;
		// float c1 = 23.5; <- (Error)
		float c1 = (float) 23.5;
		System.out.println(a1);
		System.out.println(b1);
		System.out.println(c1);

//		int+int==int, long+long=long, float+float==float, double+double= double
//		long+float==float, long+double==double, float+double=double

// short+byte=int
		short s1 = 1;
		byte s2 = 1;
		// s1=s1+s2; // 컴파일 에러
		// s2=s2+s1; // 컴파일 에러
		int s3 = s1 + s2;
		System.out.println(s3);

	}

}
