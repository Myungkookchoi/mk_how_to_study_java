package com.human.ex;

import com.human.dto.Tree;
import com.human.dto.Owner;
import java.util.Scanner;

public class TEST07_01 {
	public static void Owner() {
		Owner o1 = new Owner("Sophia", 25, "121543515");

		Owner o2 = new Owner("Maya", 20, "304958304");

		Owner o3 = new Owner("Lara", 34, "9465416521");

		Owner o4 = new Owner("Mila", 41, "2834452532");

		Owner o5 = new Owner("Charlotte", 38, "6451263423");

		Owner o6 = new Owner("Erin", 5, "56165648491");

		System.out.println(
				String.format("Owner name is %s, %d years old, " + "PhoneNumber is %s.", o1.O_name, o1.O_age, o1.O_pn));
		System.out.println(
				String.format("Owner name is %s, %d years old, " + "PhoneNumber is %s.", o2.O_name, o2.O_age, o2.O_pn));
		System.out.println(
				String.format("Owner name is %s, %d years old, " + "PhoneNumber is %s.", o3.O_name, o3.O_age, o3.O_pn));
		System.out.println(
				String.format("Owner name is %s, %d years old, " + "PhoneNumber is %s.", o4.O_name, o4.O_age, o4.O_pn));
		System.out.println(
				String.format("Owner name is %s, %d years old, " + "PhoneNumber is %s.", o5.O_name, o5.O_age, o5.O_pn));
		System.out.println(
				String.format("Owner name is %s, %d years old, " + "PhoneNumber is %s.", o6.O_name, o6.O_age, o6.O_pn));
	}

	public static void Tree() {
		Tree t1 = new Tree("Mango", 4, 4, 50, 7, 200);

		Tree t2 = new Tree("Papaya", 6, 4, 50, 6, 375);

		Tree t3 = new Tree("Banana Palm", 5, 5, 50, 7, 500);

		Tree t4 = new Tree("Lemon", 8, 8, 50, 1, 750);

		System.out.println(String.format(
				"%s를 만드는데 %d시간이 걸리고, %d의 경험치를 받으며, 총 %d그루를 지을 수 있고, 현재 %d그루가 있습니다. " + "%s를 만드는데 %dGold가 필요합니다",
				t1.name, t1.time, t1.exp, t1.all, t1.now, t1.name, t1.gold));
		System.out.println(String.format(
				"%s를 만드는데 %d시간이 걸리고, %d의 경험치를 받으며, 총 %d그루를 지을 수 있고, 현재 %d그루가 있습니다. " + "%s를 만드는데 %dGold가 필요합니다",
				t2.name, t2.time, t2.exp, t2.all, t2.now, t2.name, t2.gold));
		System.out.println(String.format(
				"%s를 만드는데 %d시간이 걸리고, %d의 경험치를 받으며, 총 %d그루를 지을 수 있고, 현재 %d그루가 있습니다. " + "%s를 만드는데 %dGold가 필요합니다",
				t3.name, t3.time, t3.exp, t3.all, t3.now, t3.name, t3.gold));
		System.out.println(String.format(
				"%s를 만드는데 %d시간이 걸리고, %d의 경험치를 받으며, 총 %d그루를 지을 수 있고, 현재 %d그루가 있습니다. " + "%s를 만드는데 %dGold가 필요합니다",
				t4.name, t4.time, t4.exp, t4.all, t4.now, t4.name, t4.gold));

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Tree information is 1, Owner information is 2, You want stop is 0");
		String a = sc.nextLine();
		int a1 = Integer.parseInt(a);
		switch (a1) {
		case 1:
			Tree();
			break;
		case 2:
			Owner();
			break;
		case 0:
			System.out.println("stop");
			break;
		default:
			System.out.println("Error");
			break;
		}
		sc.close();
	}
}
