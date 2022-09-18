package com.human.ex3;

public class Human2 {
	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = "홍길동";
		String str3 = new String("홍길동");
		String str4 = new String("홍길동");
		if (str1 == str2) {
			System.out.println("str1==2"); // true	O
		}
		if (str1 == str3) {
			System.out.println("str1==3"); // false	O
		}
		if (str1 == str4) {
			System.out.println("str1==4"); // false	O
		}
		if (str1.equals(str2)) {
			System.out.println("str1 equal 2"); // true	O
		}
		if (str1.equals(str3)) {
			System.out.println("str1 equal 3"); // true	O
		}
		if (str1.equals(str4)) {
			System.out.println("str1 equal 4"); // true	O
		}
	}
}