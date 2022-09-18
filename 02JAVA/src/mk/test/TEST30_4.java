package mk.test;

import java.util.Scanner;

public class TEST30_4 {
	public static void Cal(int day, int i) {
		int a = 1;
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		for (int x = day; x - 1 > 0; x--) {
			System.out.print("\t");
		}
		for (int j = day; j < i + day; j++) {
			System.out.print(a + "\t");
			if (a == 8 - day || a == 15 - day || a == 22 - day || a == 29 - day || a == 36 - day) {
				System.out.println("");
			}
			a++;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("시작 요일 입력 : (1. 일 2. 월 3. 화 4. 수 5. 목 6. 금 7. 토)");
		int day = sc.nextInt();
		System.out.println("일수 입력 : ");
		int i = sc.nextInt();
		Cal(day, i);

	}
}
