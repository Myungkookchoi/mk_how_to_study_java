package com.human.ex3;

public class JavaClass {

	public static void main(String[] args) {
		// 클래스선언
//		Human h1; // 스택에 Human클래스의 주소를 담을 수 있는 변수 선언
//		// 힙에 Human클래스 저장공간을 힙에 생성하고 생성된주소를 스택에 h2에 저장
//		// System.out.println(h1); Human h1=null;	
//		Human h2 = new Human();
//		System.out.println(h2);
//		h2.name = "홍길동";
//		h2.age = 19;
//		h2.height = 123.5;
//		System.out.println(h2);
//
//		Human h3 = new Human("홍길남", 19, 123.5);
//		System.out.println(h3);

		// 객체 비교
		Human h1 = new Human("홍길동", 10, 166.5);
		Human h2 = new Human("홍길동", +10, 166.5);
		Human h3 = h1;
		Human h4 = new Human();
		
		
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h4);
		
		System.out.println(h1 == h2);	// h1과 h2의 객체비교
		System.out.println(h1 == h3);	// h1과 h3의 객체비교
		// == 은 객체의 주소비교
		
		System.out.println(h1.equals(h2));	// h1과 h2의 객체비교
		System.out.println(h1.equals(h3));	// h1과 h3의 객체비교
		// 원래는 h1.equals(h2)는 false 가 나와야하지만 hashCode때문에 결과값이 true로 변경됨.

		// 모든 클래스는 Object를 상속받고, Object를 상속받으려면 Object가 가지고 있는것들을 사용 할 수 있다.
		// .equals는 객체를 비교하기 위해서 사용되는 메소드이다.
		// Object에 있어서 만들지 않아도 사용할 수 있다.
		// public class Human extends Object{ 
	}

}