package com.human.ex;
// 클래스 관련있는 변수를 묶어서 프로그램으로 구현한 것

// 클래스 관련있는 변수와 메소드를 묶어서 프로그램으로 구현한 것
// 이것 저것 다 묶여진 결과물 == 객체
// 객체 = 식별 가능한 모든 것을 객체라한다. 객체지향 프로그램언어
// 클래스는 선언부와 생성부로 나눠져있다.

class Human {
	public String name;
	public int age;
	public double height;
}
// 사람(관련있는)으로 묶음.
//선언부
//참조데이터

public class TEST04 {

	public static void main(String[] args) {

		Human h1 = new Human(); // 생성부
		h1.name = "홍길동";
		h1.age = 24;
		h1.height = 178.4;

		Human h2= new Human();
		h2.name = "홍길남";
		h2.age = 47;
		h2.height = 168.4;

		Human h3 = new Human();
		h3.name = "홍길수";
		h3.age = 34;
		h3.height = 189.3;

		System.out.println("name:" + h1.name);
		System.out.println("age:" + h1.age);
		System.out.println("height:" + h1.height);
		System.out.println("name:" + h2.name);
		System.out.println("age:" + h2.age);
		System.out.println("height:" + h2.height);
		
	}
}

// 현실세계의 데이터를 기본자료형 변수에 넣어서 출력해보고 클래스를 업그레이드 해보자.
// 핸드폰, 자동차, 가방 등등... 2개 해보자.