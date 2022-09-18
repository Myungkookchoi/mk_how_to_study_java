package mk.home.dto;

public class Rift {
	public String Champ = "";
	public String line = "";
	public int hp = 0;
	public int mp = 0;

	public Player p = new Player();

	public Rift() {

	}

	public Rift(String champ, String line, int hp, int mp, String name, int age, String pn) {
		super();
		Champ = champ;
		this.line = line;
		this.hp = hp;
		this.mp = mp;
		this.p.name = name;
		this.p.age = age;
		this.p.pn = pn;
	}

	@Override
	public String toString() {
		return "Rift [Champ=" + Champ + ", line=" + line + ", hp=" + hp + ", mp=" + mp + ", p=" + p + "]";
	}

}
