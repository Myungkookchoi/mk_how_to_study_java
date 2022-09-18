package mk.test;

import java.util.Scanner;

class Car1 {

	public String carName = "";
	public int speed = 0;
	public int speedUp = 10;
	public int speedDown = -10;

	public void statement() {
		System.out.println(String.format("현재 차종 : %s, 속력은 %dKm 입니다.", carName, speed));
	}

	public void speedUp() {
		if (speed > 90) {
			System.out.println("속도를 더 높일 수 없습니다.");
		} else {
			System.out.println("현재 차의 속도를 10 높임");
			speed = speed + speedUp;
		}
	}

	public void speedDown() {
		if (speed == 0) {
			System.out.println("속도를 더 낮출 수 없습니다.");
		} else {
			System.out.println("현재 차의 속도를 10 낮춤");
			speed = speed + speedDown;
		}
	}

	public Car1(String carName) {
		this.carName = carName;
	}

	public void gear() {
		if (speed <= 10) {
			System.out.println("기어 1단");
		} else if (speed <= 20) {
			System.out.println("기어 2단");
		} else if (speed <= 30) {
			System.out.println("기어 3단");
		} else if (speed <= 40) {
			System.out.println("기어 4단");
		} else if (speed <= 50) {
			System.out.println("기어 5단");
		} else if (speed <= 60) {
			System.out.println("기어 6단");
		} else if (speed <= 70) {
			System.out.println("기어 7단");
		} else if (speed <= 80) {
			System.out.println("기어 8단");
		} else if (speed <= 90) {
			System.out.println("기어 9단");
		} else if (speed <= 100) {
			System.out.println("기어 10단");
		}
		//10단 기어 미쵸;;
	}
}

public class TEST32_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Car1 c1 = new Car1("소나타");
		boolean car = true;
		System.out.println("시동을 겁니다.");
		while (car) {
			c1.statement();
			System.out.println("1. 속도 올리기 2. 속도 내리기 3. 시동끄기");
			int input = Integer.parseInt(sc.nextLine());
			if (input == 1) {
				c1.speedUp();
				c1.gear();
			} else if (input == 2) {
				c1.speedDown();
				c1.gear();
			} else if (input == 3) {
				System.out.println("시동을 끕니다.");
				car = false;
			}
		}
		sc.close();
	}
}