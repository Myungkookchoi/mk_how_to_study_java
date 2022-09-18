package com.human.ex;

import com.human.dto.City;

public class TEST06 {

	public static void main(String[] args) {
		City c1 = new City();
		c1.city = "천안시";
		c1.citizen = 150;
		c1.town.town1 = "두정동";
		c1.town.town2 = "성정동";
		c1.town.town3 = "신부동";

		City c2 = new City();
		c2.city = "아산시";
		c2.citizen=130;
		c2.town.town1 = "온양1동";
		c2.town.town2 = "온양2동";
		c2.town.town3 = "온양3동";
		
		City c3 = new City();
		c3.city = "수원시";
		c3.citizen = 200;
		c3.town.town1 = "매교동";
		c3.town.town2 = "곡선동";
		c3.town.town3 = "메탄동";
		
		System.out.println(String.format("%s에는 %d명이 살고있고, %s,%s,%s이 있습니다.", c1.city, c1.citizen, c1.town.town1, c1.town.town2, c1.town.town3));
		System.out.println(String.format("%s에는 %d명이 살고있고, %s,%s,%s이 있습니다.", c2.city, c2.citizen, c2.town.town1, c2.town.town2, c2.town.town3));
		System.out.println(String.format("%s에는 %d명이 살고있고, %s,%s,%s이 있습니다.", c3.city, c3.citizen, c3.town.town1, c3.town.town2, c3.town.town3));
		
	}

}
