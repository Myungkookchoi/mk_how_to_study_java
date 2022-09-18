package mk.home.dto;

public class Car {

	public String carName = "";
	public int speed = 0;
	public int speedUp = 10;
	public int speedDown = -10;

	public void statement(String carName, int speed) {
		System.out.println(String.format("현재 차종 : %s, 속력은 %d 입니다.", carName, speed));
	}

	public void speedUp() {
		speed = speed + speedUp;
		System.out.println("현재 차의 속도를 10 높임");
	}

	public void speedDown() {
		speed = speed - speedDown;
		System.out.println("현재 차의 속도를 10 낮춤");
	}

	public Car(String carName) {
		this.carName = carName;
	}

}
