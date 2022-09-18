package com.human.ex;

import com.human.dto.Car;

public class Making_Car {

	public static void main(String[] args) {
		Car car = new Car();
		car.color="Red";
		car.company="Hundai";
		car.maxSpeed=200;
		car.model="Sonata";
		car.tire.company="KumHo";
		car.tire.mileage=20;
		car.tire.price=50000;
		
		Car newCar = new Car();
		// newCar=car;
		newCar.color="Blue";
		newCar.company=car.company;
		newCar.maxSpeed=car.maxSpeed;
		newCar.model=car.model;
		//newCar.tire=car.tire;
		newCar.tire.company=car.tire.company;
		newCar.tire.mileage=car.tire.mileage;
		newCar.tire.price=car.tire.price;
		
		System.out.println(car.color);
		System.out.println(car.tire.company);
		System.out.println(newCar.color);
		System.out.println(newCar.tire.company);
		
		
	}

}
