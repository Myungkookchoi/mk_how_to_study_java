package mk.home.dto;

public class Player {
	public String name = "";
	public int age = 0;
	public String pn = "";

	public Player() {
	}

	public Player(String name, int age, String pn) {
		super();
		this.name = name;
		this.age = age;
		this.pn = pn;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", pn=" + pn + ", age=" + age + "]";
	}

}
