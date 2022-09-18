package mk.test;

import java.util.Scanner;

public class TEST21 {

	public static void Q1() {
		boolean att[] = new boolean[50];
		for (int x = 0; x < att.length; x++) {
			att[x] = true;
		}
		Scanner sc = new Scanner(System.in);
		int i = 0;
		while (i == 0) {
			System.out.println("메뉴======================");
			System.out.println("1. 전체 출석사항");
			System.out.println("2. 결석자 추가");
			System.out.println("3. 출석자 추가");
			System.out.println("6. 프로그램 종료");
			int input = sc.nextInt();
			if (input == 1) {
				System.out.println("1. 전체 출석사항");
				int a = 0;
				for (a = 0; a < 50; a++) {
					System.out.print(a + 1 + "번 : " + att[a]);
					System.out.print("\t");
					if ((a + 1) % 5 == 0) {
						System.out.println("");
					}
				}
			} else if (input == 2) {
				int b = 0;
				while (b == 0) {
					System.out.println("결석자 번호를 입력해주세요. 0. 메뉴");
					int input2 = sc.nextInt();
					if (input2 == 0) {
						break;
					} else if (input2 > 50) {
						System.out.println("시스템 에러");
					} else {
						att[input2 - 1] = false;
						System.out.println(input2 + "번호가 결석처리 되었습니다.");
					}
				}
			} else if (input == 3) {
				int b = 0;
				while (b == 0) {
					System.out.println("출석자 번호를 입력해주세요. 0. 메뉴");
					int input2 = sc.nextInt();
					if (input2 == 0) {
						break;
					} else if (input2 > 50) {
						System.out.println("시스템 에러");
					} else {
						att[input2 - 1] = true;
						System.out.println(input2 + "번호가 출석처리 되었습니다.");
					}
				}
			} else if (input == 6) {
				System.out.println("프로그램을 종료합니다.");
				i = 1;
				break;
			} else {
				System.out.println("시스템 에러");
			}
		}
		sc.close();
	}

	public static void Q2() {
		Scanner sc = new Scanner(System.in);
		int account = 0;
		int i = 0;
		while (i == 0) {
			System.out.println("전체메뉴 : 1. 입금 2. 출금 3. 조회 0. 종료");
			int input = sc.nextInt();
			if (input == 1) {
				System.out.println("입금하실 금액을 입력해주세요.");
				int in = sc.nextInt();
				account = account + in;
			} else if (input == 2) {
				System.out.println("출금하실 금액을 입력해주세요.");
				int out = sc.nextInt();
				account = account - out;
			} else if (input == 3) {
				System.out.println("현재 잔액 : " + account);
			} else if (input == 0) {
				break;
			} else {
				System.out.println("시스템 에러");
			}
		}
		sc.close();

	}

	public static void Q3() {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		while (i == 0) {
			System.out.println("메뉴 1. 동전분류기 2. 종료");
			int input = sc.nextInt();
			if (input == 1) {
				System.out.println("금액을 입력해주세요.");
				int a = sc.nextInt();
				int change1000 = a / 1000;
				int change500 = a % 1000 / 500;
				int change100 = a % 500 / 100;
				int change50 = a % 100 / 50;
				int change10 = a % 50 / 10;
				System.out.println("천원짜리 " + change1000 + "개, 오백원짜리 " + change500 + "개, 백원짜리" + change100 + "개, 오십원짜리 "
						+ change50 + "개, 십원짜리 " + change10 + "개");
			} else if (input == 2) {
				System.out.println("종료합니다.");
				break;
			}
		}
		sc.close();
	}

	public static void Q4() {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		String drinks = " ";
		int coin = 0;
		while (i == 0) {
			System.out.println("1.사이다 700원 2.콜라 500원 3.환타 350원 4.100투입 5.500투입 6.반환");
			int input = sc.nextInt();
			if (input == 1) {
				drinks = drinks + "사이다 ";
				System.out.println("사이다가 입력되었습니다.");
				coin = coin - 700;
			} else if (input == 2) {
				drinks = drinks + " 콜라 ";
				coin = coin - 500;
				System.out.println("콜라가 입력되었습니다.");
			} else if (input == 3) {
				drinks = drinks + " 환타 ";
				System.out.println("환타가 입력되었습니다.");
				coin = coin - 350;
			} else if (input == 4) {
				coin = coin + 100;
				System.out.println("100원 투입되었습니다. \n 현재 금액 : " + coin);
			} else if (input == 5) {
				coin = coin + 500;
				System.out.println("500원 투입되었습니다. \n 현재 금액 : " + coin);
			} else if (input == 6) {
				int change1000 = coin / 1000;
				int change500 = coin % 1000 / 500;
				int change100 = coin % 500 / 100;
				int change50 = coin % 100 / 50;
				System.out.println("음료 : " + drinks + "천원짜리 " + change1000 + "개, 오백원짜리 " + change500 + "개, 백원짜리"
						+ change100 + "개, 오십원짜리 " + change50 + "개");
				break;
			}
		}
		sc.close();
	}

	public static void Q5() {
		int ten = 0;
		int one = 0;
		int han = 0;
		for (han = 0; han < 10; han++) {
			for (ten = 0; ten < 10; ten++) {
				for (one = 0; one < 10; one++) {
					System.out.print(han + "" + ten + "" + one + " ");
					if (han == 3 || han == 6 || han == 9) {
						System.out.print("짝 ");
					}
					if (ten == 3 || ten == 6 || ten == 9) {
						System.out.print("짝 ");
					}
					if (one == 3 || one == 6 || one == 9) {
						System.out.println("짝");
					}

				}
			}
		}
		System.out.println("1000");
	}

	public static void Q6() {
		Scanner sc = new Scanner(System.in);

		int i = 0;
		while (i == 0) {
			int x = (int) ((Math.random() * 100) + 1);
			int y = (int) ((Math.random() * 100) + 1);
			int sign = (int) ((Math.random() * 4) + 1);
			System.out.print("문제 : ");
			if (sign == 1) {// 더하기
				System.out.println(x + " + " + y + " =?");
				int a = sc.nextInt();
				if (x + y == a) {
					System.out.println("정답");
				} else {
					System.out.println("오답");
				}
			} else if (sign == 2) {// 빼기
				System.out.println(x + " - " + y + " =?");
				int a = sc.nextInt();
				if (x - y == a) {
					System.out.println("정답");
				} else {
					System.out.println("오답");
				}
			} else if (sign == 3) {// 곱하기
				System.out.println(x + " * " + y + " =?");
				int a = sc.nextInt();
				if (x * y == a) {
					System.out.println("정답");
				} else {
					System.out.println("오답");
				}
			} else if (sign == 4) {// 나누기
				System.out.println(x + " / " + y + " =?");
				int a = sc.nextInt();
				if (x / y == a) {
					System.out.println("정답");
				} else {
					System.out.println("오답");
				}
			}
		}
		sc.close();
	}

	public static void Q7() {

	}

	public static void main(String[] args) {

	}

}
