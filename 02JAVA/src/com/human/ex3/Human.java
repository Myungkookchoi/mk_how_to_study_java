package com.human.ex3;

import java.util.Objects;

public class Human extends Object { // 클래스 정의
	public String name = "홍길동"; // 필드
	public int age = 20;
	public double height = 160.1;

	public Human() {
	}

	public Human(String name, int age, double height) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
	}

	@Override
	public String toString() { // method
		// int age = 5;
		return "Human [name=" + name + ", age=" + age + ", height=" + height + "]";

	}

	@Override
	public int hashCode() {
		return Objects.hash(age, height, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)	// this는 자기자신
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Human other = (Human) obj;
		return age == other.age && Double.doubleToLongBits(height) == Double.doubleToLongBits(other.height)
				&& Objects.equals(name, other.name);
	}
}
