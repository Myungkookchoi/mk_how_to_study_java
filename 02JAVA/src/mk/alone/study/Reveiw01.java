package mk.alone.study;

import com.human.dto.Characters;

public class Reveiw01 {

	public static void main(String[] args) {
		Characters c1 = new Characters("Worrior", "Double Slash", 5);
		Characters c2 = new Characters("Wizard", "Ancient Spear", 20);
		Characters c3 = new Characters("Healer", "Salvation", 40);
		Characters c4 = new Characters("Gunslinger", "Rain of Bullet", 8);
		
		System.out.println(c1);
		System.out.println("This Character is "+c1.job+"."+c1.skill+" is "+"have "+c1.skillCooldown+"seconds.");
		System.out.println(c2);
		System.out.println("This Character is "+c2.job+"."+c2.skill+" is "+"have "+c2.skillCooldown+"seconds.");
		System.out.println(c3);
		System.out.println("This Character is "+c3.job+"."+c3.skill+" is "+"have "+c3.skillCooldown+"seconds.");
		System.out.println(c4);
		System.out.println("This Character is "+c4.job+"."+c4.skill+" is "+"have "+c4.skillCooldown+"seconds.");
		
	}
}
