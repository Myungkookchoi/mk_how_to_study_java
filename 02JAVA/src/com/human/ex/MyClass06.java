package com.human.ex;

import com.human.dto.Human2;

public class MyClass06 {
	public static void main(String[] args) {
		Human2 h1 = new Human2("홍길동", 25, 166.5);
//
//		System.out.println("name:" + h1.name);

		Human2 h2 = new Human2("홍길남", 15, 150.5);

		System.out.println(String.format("Name is %s. Age is %d, Height is %f.", h1.name, h1.age, h1.height));
		System.out.println(h2.name);
	}
}
