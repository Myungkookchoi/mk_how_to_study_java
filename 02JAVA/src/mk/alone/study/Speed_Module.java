package mk.alone.study;

import java.io.IOException;
import java.util.Scanner;

public class Speed_Module {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
//		int x = 5;
//		double y = 0.0;
//
////		double z = x / y;
//		double z = x % y;
//
//		System.out.println(Double.isInfinite(z));
//		System.out.println(Double.isNaN(z));
//
//		System.out.println(z + 2);

		boolean run = true;
		int speed = 0;
		int keyCode = 0;

		while (run) {
			if (keyCode != 13 && keyCode != 10) {
				System.out.println("--------------------");
				System.out.println("1.증속 | 2.감속 | 3.중지");
				System.out.println("--------------------");
				System.out.print("선택: ");
			}
			keyCode = System.in.read();

			if (keyCode == 49) {
				speed++;
				System.out.println("현재 속도 = " + speed);
			} else if (keyCode == 50) {
				speed--;
				System.out.println("현재 속도 = " + speed);
			} else if (keyCode == 51) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
		sc.close();
	}
}