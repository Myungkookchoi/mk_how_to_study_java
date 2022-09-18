package com.human.dto;

public class Human2 {
	public String name;
	public int age;
	public double height;

	public Human2() {
	}
	// Human h1 = new Human("홍길동",25,166.5);

	public Human2(String name, int age, double height) {
		super();// 부모에 있는 생성자를 호출
		this.name = name;
		this.age = age;
		this.height = height;
	}
}
