package mk.home.dto;

public class Human {
	public String name = "";
	public int age = 0;
	public double hieght = 0;

	public Human() {
	}

	public Human(String name, int age, double hieght) {
		super();
		this.name = name;
		this.age = age;
		this.hieght = hieght;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", hieght=" + hieght + "]";
	}

}
