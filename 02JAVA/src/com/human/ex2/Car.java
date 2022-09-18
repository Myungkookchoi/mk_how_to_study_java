package com.human.ex2;

public class Car {
	public String name = "";
	public int price = 0;

	public Tire t1 = new Tire();

	public Car() {
	}

	public Car(String name, int price) {
		super();
		this.name = name;
		this.price = price;
		//super는 부모거를 건드림, this는 자식거를 건드림(자세한건 나중에 배움)
		
	}

	public Car(String name, int price, Tire t1) {
		this(name, price);
		this.t1 = t1;
	}

	public Car(String name, int price, String tName, int tYear) {
		this(name, price);
		this.t1.tname = tName;
		this.t1.tyear = tYear;
		
		
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", price=" + price + ", t1=" + t1 + "]";
	}

}
