package mk.test;

class Car {

	public String carName = "";
	public int speed = 0;
	public int speedUp = 10;
	public int speedDown = -10;

	public void statement() {
		System.out.println(String.format("현재 차종 : %s, 속력은 %d 입니다.", carName, speed));
	}

	public void speedUp() {
		speed = speed + speedUp;
		System.out.println("현재 차의 속도를 10 높임");
	}

	public void speedDown() {
		speed = speed + speedDown;
		System.out.println("현재 차의 속도를 10 낮춤");
	}

	public Car(String carName) {
		this.carName = carName;
	}

}

public class TEST31_3 {
	public static void main(String[] args) {
		Car c1 = new Car("소나타");
		c1.statement();
		c1.speedUp();
		c1.speedUp();
		c1.statement();
		c1.speedDown();
		c1.statement();

	}
}
