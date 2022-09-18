package com.human.ex;

// import com.human.dto.Characters; 를 안 써주면
// com.human.dto.Characters(경로) h1 = new com.human.dto.Character(경로)(); 다 써줘야댐

import com.human.dto.Characters; //or com.human.dto.*; *은 모든 파일

public class MyClass05 {

	public static void main(String[] args) {
		// 다른 파일로 만든 클래스를 읽어오기
		// java.util.Scanner 랑 같음

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

		System.out.println(c1.job);
		System.out.println(c2.job);
		System.out.println(c3.job);
		System.out.println(c4.job);
	}

}
