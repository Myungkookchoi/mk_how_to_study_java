package com.human.ex;

class Hu {
	public String name = "";
	public int age = 0;
	public double height = 0;
}

class Dog {
	public String name = "";
	public int age = 0;
	public String eyeColor = "";
}

public class MyClass04 {
	public static void main(String[] args) {
		Hu h1 = new Hu();
		h1.name = "홍길동";
		h1.age = 23;
		h1.height = 165.5;
		Dog dog = new Dog();
		dog.eyeColor = "Yellow";

		System.out.println("name:" + h1.name);
		System.out.println("age:" + h1.age);
		System.out.println("height:" + h1.height);
		System.out.println("name:" + h1.name);
		System.out.println("age:" + h1.age);
		System.out.println("eyeColor:" + dog.eyeColor);

	}

}