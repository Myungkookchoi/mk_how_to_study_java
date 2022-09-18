package mk.alone.making;

import java.util.Scanner;

public class AaaAA {
	public static void main(String[] args) {
		int total = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			int money = Integer.parseInt(sc.nextLine());
			total = money + total;
			System.out.println(total);
		}

	}
}
