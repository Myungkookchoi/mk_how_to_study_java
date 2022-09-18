package mk.test;

import java.util.Scanner;

public class TEST09 {
//	문제1) 사용자 입력을 받아 10보다 큰지 크지 않은지 출력하는 프로그램을 만들어보자.
//	문제2) 사용자 입력 true를 받아서 ‘true’가 입력되었습니다’. 
//		‘true’가 입력되지 않았습니다.’ 가 출력 되도록 만들어 보자.
//	문제3) 사용자에게 숫자를 입력받아 1004이면 ‘암호가 맞음’ 
//		아니면 ‘암호가 틀림’이 출력되도록 프로그램을 구현해 보자.
//	문제4) ‘안녕’를 입력하면 ‘너도 안녕’, ‘잘자’ 입력하면 ‘너도 잘자’, 
//		‘잘가’ 가 입력되면 ‘너도 잘가’가 출력되도록 프로그램을 구현해 보자.

	public static void Q1() {
		System.out.println("문제1) 사용자 입력을 받아 10보다 큰지 크지 않은지 출력하는 프로그램을 만들어보자.");
		System.out.println("숫자 입력 >>");
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		int a1 = Integer.parseInt(a);
		if (a1 < 10) {
			System.out.println("10보다 작습니다.");
		} else if (a1 == 10) {
			System.out.println("10과 같습니다");
		} else if (a1 > 10) {
			System.out.println("10보다 큽니다.");
		}
		sc.close();
	}

	public static void Q2() {
		System.out.println("문제2) 사용자 입력 true를 받아서 ‘true’가 입력되었습니다’. ‘true’가 입력되지 않았습니다.’ 가 출력 되도록 만들어 보자.");
		System.out.println("입력 >>");
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		if (a.equals("true")) {
			System.out.println("\'true\'가 입력되었습니다.");
		} else {
			System.out.println("\'true\'가 입력되지 않았습니다.");
		}
		sc.close();
	}

	public static void Q3() {
		System.out.println("문제3) 사용자에게 숫자를 입력받아 1004이면 ‘암호가 맞음’ 아니면 ‘암호가 틀림’이 출력되도록 프로그램을 구현해 보자.");
		System.out.println("암호를 입력해주세요.");
		System.out.println("암호 :");
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		int a1 = Integer.parseInt(a);
		if (a1 == 1004) {
			System.out.println("암호가 맞음");
		} else {
			System.out.println("암호가 틀림");
		}
		sc.close();
	}

	public static void Q4() {
		System.out.println("문제4) ‘안녕’를 입력하면 ‘너도 안녕’ ‘잘자’ 입력하면 ‘너도 잘자’ ‘잘가’ 가 입력되면 ‘너도 잘가’" + "가 출력되도록 프로그램을 구현해 보자.");
		Scanner sc = new Scanner(System.in);
		String a = "1";
		while (a != "0") {
			System.out.println("\"안녕\",\"잘자\",\"잘가\" 를 입력해주세요. (종료는 \"그만\"을 입력하세요.)");
			a = sc.next();
			if (a.equals("안녕")) {
				System.out.println("너도 안녕");
			} else if (a.equals("잘자")) {
				System.out.println("너도 잘자");
			} else if (a.equals("잘가")) {
				System.out.println("너도 잘가");
			} else if (a.equals("그만")) {
				System.out.println("종료");
				break;
			} else {
				System.out.println("잘못된 입력");
			}
		}
		sc.close();
	}

	public static void main(String[] agrs) {
		System.out.println("문제 번호 입력(1~4)");
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		int a1 = Integer.parseInt(a);
		switch (a1) {
		case 1:
			Q1();
			break;
		case 2:
			Q2();
			break;
		case 3:
			Q3();
			break;
		case 4:
			Q4();
			break;
		default:
			System.out.println("종료");
			break;

		}
		sc.close();
	}
}