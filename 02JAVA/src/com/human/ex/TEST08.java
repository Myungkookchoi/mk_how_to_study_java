package com.human.ex;

import com.human.dto.Owner2;
import com.human.dto.Tree2;

public class TEST08 {

	public static void main(String[] args) {
		Owner2 o1 = new Owner2("Sophia", 25, "121543515");
		Owner2 o2 = new Owner2("Maya", 20, "304958304");
		Owner2 o3 = new Owner2("Lara", 34, "9465416521");
		Owner2 o4 = new Owner2("Mila", 41, "2834452532");

		Tree2 t1 = new Tree2("Mango", 4, 4, 50, 7, 200, o1);
		Tree2 t2 = new Tree2("Papaya", 6, 4, 50, 6, 375, o2);
		Tree2 t3 = new Tree2("Banana Palm", 5, 5, 50, 7, 500, o3);
		Tree2 t4 = new Tree2("Lemon", 8, 8, 50, 1, 750, o4);

		System.out.println(String.format(
				"%s를 만드는데 %d시간이 걸리고, %d의 경험치를 받으며, 총 %d그루를 지을 수 있고, 현재 %d그루가 있습니다. %s를 만드는데 %dGold가 필요합니다." + "\n"
						+ "이 나무의 주인은 %s이고, %d살이며, 전화번호는 %s입니다.",
				t1.name, t1.time, t1.exp, t1.all, t1.now, t1.name, t1.gold, o1.O_name, o1.O_age, o1.O_pn));

		System.out.println(String.format(
				"%s를 만드는데 %d시간이 걸리고, %d의 경험치를 받으며, 총 %d그루를 지을 수 있고, 현재 %d그루가 있습니다. %s를 만드는데 %dGold가 필요합니다." + "\n"
						+ "이 나무의 주인은 %s이고, %d살이며, 전화번호는 %s입니다.",
				t2.name, t2.time, t2.exp, t2.all, t2.now, t2.name, t2.gold, o2.O_name, o2.O_age, o2.O_pn));

		System.out.println(String.format(
				"%s를 만드는데 %d시간이 걸리고, %d의 경험치를 받으며, 총 %d그루를 지을 수 있고, 현재 %d그루가 있습니다. %s를 만드는데 %dGold가 필요합니다." + "\n"
						+ "이 나무의 주인은 %s이고, %d살이며, 전화번호는 %s입니다.",
				t3.name, t3.time, t3.exp, t3.all, t3.now, t3.name, t3.gold, o3.O_name, o3.O_age, o3.O_pn));

		System.out.println(String.format(
				"%s를 만드는데 %d시간이 걸리고, %d의 경험치를 받으며, 총 %d그루를 지을 수 있고, 현재 %d그루가 있습니다. %s를 만드는데 %dGold가 필요합니다." + "\n"
						+ "이 나무의 주인은 %s이고, %d살이며, 전화번호는 %s입니다.",
				t4.name, t4.time, t4.exp, t4.all, t4.now, t4.name, t4.gold, o4.O_name, o4.O_age, o4.O_pn));
		System.out.println("");
		
		System.out.println(o1);
		System.out.println(o2);
		System.out.println(o3);
		System.out.println(o4);
		System.out.println("");
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);
		
	}

}
