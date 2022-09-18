package mk.alone.making;

import java.util.Scanner;

public class LastTTT {
	public static void board1(String input, String zi1) {
		System.out.println(zi1);
		Scanner sc = new Scanner(System.in);
		while (1 != 0) {
			String input2 = sc.next();
			String zi2 = zi1;
			String b = "X";
			if (input2.equals("1") || input2.equals("2") || input2.equals("3") || input2.equals("4")
					|| input2.equals("5") || input2.equals("6") || input2.equals("7") || input2.equals("8")
					|| input2.equals("9")) {
				zi2 = zi2.replace(input2, b);
			} else {
				System.out.println("Error");
			}
			board2(input, zi2);
			sc.close();
		}
	}

	public static void board2(String input, String zi1) {
		System.out.println(zi1);
		Scanner sc = new Scanner(System.in);
		while (1 != 0) {
			String input2 = sc.next();
			String zi2 = zi1;
			String b = "O";
			if (input2.equals("1") || input2.equals("2") || input2.equals("3") || input2.equals("4")
					|| input2.equals("5") || input2.equals("6") || input2.equals("7") || input2.equals("8")
					|| input2.equals("9")) {
				zi2 = zi2.replace(input2, b);
			} else {
				System.out.println("Error");
			}
			board1(input, zi2);
			sc.close();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		String a1 = "1", a2 = "2", a3 = "3", b1 = "4", b2 = "5", b3 = "6", c1 = "7", c2 = "8", c3 = "9";
		String z1 = ("-------------------");
		String zi1 = (z1 + "\n" + "|  " + c1 + "  |  " + c2 + "  |  " + c3 + "  |" + "\n" + z1 + "\n" + "|  " + b1
				+ "  |  " + b2 + "  |  " + b3 + "  |" + "\n" + z1 + "\n" + "|  " + a1 + "  |  " + a2 + "  |  " + a3
				+ "  |" + "\n" + z1);
		String b = "O";
		if (input.equals("1") || input.equals("2") || input.equals("3") || input.equals("4") || input.equals("5")
				|| input.equals("6") || input.equals("7") || input.equals("8") || input.equals("9")) {
			zi1 = zi1.replace(input, b);
		} else {
			System.out.println("Error");
		}
		board1(input, zi1);
		sc.close();
	}
}