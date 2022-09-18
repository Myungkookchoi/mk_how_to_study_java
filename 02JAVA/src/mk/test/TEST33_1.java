package mk.test;

//문제 1) 강아지의 나이, 이름,예방접종 유무 정보를 저장할 수 있는 클래스Dog를 만들어보자.
class Dog {
	public String dogName = "";
	public int dogAge = 0;
	public boolean vaccination = true;

//	문제 3) d.addAge(5);를 실행하고 나면 강아지 나이가 15으로 설정되도록 프로그램에
//	메소드를 추가해 보자.
	public void addAge(int addAge) {
		dogAge = dogAge + addAge;
	}

// 문제 4 5살이상 예방접종을 하지 않은 강아지는 예방접종이 필요한 경우 여서 true를 리턴하고
// 예방접종이 필요 없는 경우 false가 리턴되는 isVaccination메소드를 추가해보자.
	public boolean isVaccination() {
		if (dogAge > 5 && vaccination == false) {
			return true;
		} else {
			return false;
		}
	}

//	문제 2) Dog d=new Dog(“dog1”,10,false); System.out.println(d);
//	의 출력 결과가 “강아지 이름은 dog1이고 나이는 10살입니다”가 출력 되도록 구현해 보자.
	public Dog(String dogName, int dogAge) {
		this.dogName = dogName;
		this.dogAge = dogAge;
	}

	public Dog(String dogName, int dogAge, boolean vaccination) {
		this.dogName = dogName;
		this.dogAge = dogAge;
		this.vaccination = vaccination;
	}

	public String toString() {
		if (vaccination == false) {
			if (dogAge > 5 && vaccination == false) {
				System.out.println("백신이 필요합니다.");
			}
			return "강아지 이름은 " + dogName + "이고 나이는 " + dogAge + "살입니다";

		} else {
			return "Dog [dogName=" + dogName + ", dogAge=" + dogAge + ", vaccination=" + vaccination + "]";
		}
	}

}

class Cat {
	public String catName = "";
	public int catAge = 0;
	public boolean vaccination = true;

	public void addAge(int addAge) {
		catAge = catAge + addAge;
	}

	public boolean isVaccination(int dogAge) {
		if (dogAge > 5 && vaccination == false) {

		}
		return false;
	}

	public Cat(String dogName, int dogAge) {
		this.catName = dogName;
		this.catAge = dogAge;
	}

	public Cat(String catName, int catAge, boolean vaccination) {
		this.catName = catName;
		this.catAge = catAge;
		this.vaccination = vaccination;
	}

	public String toString() {
		if (vaccination == false) {
			if (catAge > 5 && vaccination == false) {
				System.out.println("백신이 필요합니다.");
			}
			return "고양이 이름은 " + catName + "이고 나이는 " + catAge + "살입니다";

		} else {
			return "고양이 이름은 " + catName + "이고 나이는 " + catAge + "살입니다" + "백신 접종 하였습니다.";
		}
	}

}

class Vaccination {
	public int vaccinationCount = 0;
	private static Vaccination instance = new Vaccination();

	private Vaccination() {
	}

	public static Vaccination getInstance() {
		return instance;
	}

	public static Vaccination getInstance(int vc) {
		instance.vaccinationCount = vc;
		return instance;
	}

	public void vaccination(Dog d) {
		if (d.vaccination) {
			System.out.println(d.dogName + "님에게 예방접종을 이미했습니다.");
		} else {
			if (d.dogAge > 5) {
				System.out.println(d.dogName + "님에게 " + vaccinationCount + "번쨰로 예방접종을 하였습니다.");
				d.vaccination = true;
				vaccinationCount++;
			} else {
				System.out.println(d.dogName + "님은 5세이하여서 대상 아님");
			}
		}
	}

	public void vaccination(Cat c) {
		if (c.vaccination) {
			System.out.println(c.catName + "님에게 예방접종을 이미했습니다.");
		} else {
			if (c.catAge > 5) {
				System.out.println(c.catName + "님에게 " + vaccinationCount + "번쨰로 예방접종을 하였습니다.");
				c.vaccination = true;
				vaccinationCount++;
			} else {
				System.out.println(c.catName + "님은 5세이하여서 대상 아님");
			}
		}
	}
}

public class TEST33_1 {

	public static void main(String[] args) {
		Dog d = new Dog("dog1", 10, false);
		System.out.println(d);
		d.addAge(5);
		System.out.println(d.dogAge);
		Vaccination v = Vaccination.getInstance(10);
		v.vaccination(d);
		v.vaccination(d);
		v.vaccination(new Dog("dog2", 3, false));
		Cat c = new Cat("cat1", 13, false);
		Vaccination v2 = Vaccination.getInstance();
		v2.vaccination(c);
	}
}
