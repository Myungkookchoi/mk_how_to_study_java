package com.human.ex;
//1. 사용자 정의 데이터 클래스 정의
//class Human {
//	public String name = "";
//	public int age = 0;
//	public double height = 0;
//}
class a {
	public String b = "";
	public int c = 0;
	public double d = 0;
}

public class Test {
	public static void main(String[] args) {
		//2. 사용을 위한 클래스 선언
		a h1 = new a();
		//3. 클래스 데이터 입력
		h1.b = "choi";
		h1.c = 26;
		h1.d = 170.5;
		//4. 클래스 데이터 출력
		System.out.println("name:" + h1.b);
		System.out.println("age:" + h1.c);
		System.out.println("heigt" + h1.d);
	}
}