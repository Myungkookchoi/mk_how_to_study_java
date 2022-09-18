package com.human.ex;

import com.human.dto.Characters;
import java.util.Scanner;

public class TEST05_01 {

	public static void Characters() {

		String job1 = "Worrior";
		String skill1 = "Double Slash";
		int skillCooldown1 = 5;
		System.out.println("Class : " + job1);
		System.out.println("Skill : " + skill1);
		System.out.println("SkillCoolDown : " + skillCooldown1);

		String job2 = "Wizard";
		String skill2 = "Ancient Spear";
		int skillCooldown2 = 20;
		System.out.println("Class : " + job2);
		System.out.println("Skill : " + skill2);
		System.out.println("SkillCoolDown : " + skillCooldown2);

		String job3 = "Healer";
		String skill3 = "Salvation";
		int skillCooldown3 = 40;
		System.out.println("Class : " + job3);
		System.out.println("Skill : " + skill3);
		System.out.println("SkillCoolDown : " + skillCooldown3);

		String job4 = "Gunslinger";
		String skill4 = "Rain of Bullet";
		int skillCooldown4 = 8;
		System.out.println("Class : " + job4);
		System.out.println("Skill : " + skill4);
		System.out.println("SkillCoolDown : " + skillCooldown4);

	}

	public static void print() {
		Characters c1 = new Characters();
		c1.job = "Worrior";
		c1.skill = "Double Slash";
		c1.skillCooldown = 5;

		Characters c2 = new Characters();
		c2.job = "Wizard";
		c2.skill = "Ancient Spear";
		c2.skillCooldown = 20;

		Characters c3 = new Characters();
		c3.job = "Healer";
		c3.skill = " Salvation";
		c3.skillCooldown = 40;

		Characters c4 = new Characters();
		c4.job = "Gunslinger";
		c4.skill = "Rain of Bullet";
		c4.skillCooldown = 8;

		System.out.println("Your Job is " + c1.job + ".");
		System.out.println("You skill is " + c1.skill + ".");
		System.out.println(c1.skill + " Cooldown is " + c1.skillCooldown + ".");
		System.out.println("");

		System.out.println("Your Job is " + c2.job + ".");
		System.out.println("You skill is " + c2.skill + ".");
		System.out.println(c2.skill + " Cooldown is " + c2.skillCooldown + ".");
		System.out.println("");

		System.out.println("Your Job is " + c3.job + ".");
		System.out.println("You skill is " + c3.skill + ".");
		System.out.println(c3.skill + " Cooldown is " + c3.skillCooldown + ".");
		System.out.println("");

		System.out.println("Your Job is " + c4.job + ".");
		System.out.println("You skill is " + c4.skill + ".");
		System.out.println(c4.skill + " Cooldown is " + c4.skillCooldown + ".");

	}

	public static void main(String[] args) {
		Characters c1 = new Characters();
		c1.job = "Worrior";
		c1.skill = "Double Slash";
		c1.skillCooldown = 5;

		Characters c2 = new Characters();
		c2.job = "Wizard";
		c2.skill = "Ancient Spear";
		c2.skillCooldown = 20;

		Characters c3 = new Characters();
		c3.job = "Healer";
		c3.skill = " Salvation";
		c3.skillCooldown = 40;

		Characters c4 = new Characters();
		c4.job = "Gunslinger";
		c4.skill = "Rain of Bullet";
		c4.skillCooldown = 8;

		Scanner sc = new Scanner(System.in);
		int a = 1;
		while (a != 0) {
			System.out.println("문제번호입력(1~2) 종료는0");
			a = sc.nextInt();
			if (a == 1)
				print();
			else if (a == 2)
				Characters();
			else if (a == 0)
				break;
			else {
				System.out.println("Error");
			}

		}
		sc.close();
	}
}
