package mk.alone.study;

import mk.home.dto.Rift;

public class Reveiw02 {

	public static void main(String[] args) {
		Rift c1 = new Rift("Garen", "top", 510, 0, "최근영", 28, "01011111111");
		System.out.println(c1);
		System.out.println(String.format(
				"Champion is %s. %s is %s Liner. %s have %dhp, %dmp." 
		+ "Player is %s. He is %d old. PhoneNumber is %s",
				c1.Champ, c1.Champ, c1.line, c1.Champ, c1.hp, c1.mp, 
				c1.p.name, c1.p.age, c1.p.pn));
		Rift c2 = new Rift("Lee Sin", "JG", 460, 200, "최명국", 25, "01022222222");
		System.out.println(c2);
		System.out.println(String.format(
				"Champion is %s. %s is %s Liner. %s have %dhp, %dmp." 
		+ "Player is %s. He is %d old. PhoneNumber is %s",
				c2.Champ, c2.Champ, c2.line, c2.Champ, c2.hp, c2.mp, 
				c2.p.name, c2.p.age, c2.p.pn));
	}

}
