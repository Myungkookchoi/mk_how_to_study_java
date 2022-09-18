package com.human.dto;

public class Cat {
	public int age = 0;
	public String name = "";

	public Cat() {

	}; // default 생성자

	public Cat(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public String toString() {
		return "Cat [age=" + age + ", name=" + name + "]";
	}

}
