package mk.test;

import java.util.Scanner;

public class TEST29 {
	public static int dollor(int dollor) {
		int won = dollor * 1161;
		return won;
	}

	public static int cup(int cup) {
		int won = cup * 1000;
		return won;
	}

	public static double celsius(double input2) {
		double tem = (input2 - 32) * 5 / 9;
		return tem;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (1 != 0) {
			System.out.println("문제 번호 입력 1~3 종료는 0");
			int input = sc.nextInt();
			if (input == 1) {
				System.out.println("달러를 입력하세요.");
				int input2 = sc.nextInt();
				int dollor = dollor(input2);
				System.out.println(dollor + "원 입니다.");
			} else if (input == 2) {
				System.out.println("구입할 컵의 개수를 입력해주세요. (컵 1개에 1,000원)");
				int input2 = sc.nextInt();
				int cup = cup(input2);
				System.out.println(cup + "원 입니다.");
			} else if (input == 3) {
				System.out.println("화씨(°F)를 입력해주세요.");
				double input2 = sc.nextDouble();
				double celsius = celsius(input2);
				System.out.println(celsius + "°C");
			} else if (input == 0) {
				System.out.println("종료");
				break;
			} else {
				System.out.println("Error");
			}
		}
		sc.close();
	}
}
