package com.human.ex2;

public class MyClass01 {

	public static void main(String[] args) {
		// Car클래스 가져다가 사용해 보기
		
		Car c1 = new Car("모닝", 50000);
		System.out.println(c1.name);
		System.out.println(c1.price);

		Car c2 = new Car("Morning", 70000, "금호", 2022);
		System.out.println(c2.name);
		System.out.println(c2.price);
		System.out.println(c2.t1.tname);
		System.out.println(c2.t1.tyear);
		
		System.out.println(c2);
		System.out.println(c1);
	}

}

//나무 소유자		//생성자추가	//toString추가해서 정보를 출력해보자.
