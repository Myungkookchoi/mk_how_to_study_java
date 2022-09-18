package mk.test;

import java.util.Scanner;

public class TEST15 {
	public static void Q1() {
		System.out.println("(a > 14) \n (a <=12 || a>22) \n (a > 5 && a <= 9)");
	}

	public static void Q2() {
		// (a > 14)
		int a = 5;
		if (a > 14)
			System.out.println(false);
		else
			System.out.println(true);
		System.out.println("(a <12 && a>=22)" + "\n" + "(!(a > 5 && a <= 9))");

	}

	public static void Q3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력");
		int a = sc.nextInt();
		boolean b = (a % 3 == 0 || a % 7 == 0);
		boolean c = (a % 2 == 0 && a % 5 == 0);
		boolean d = (b == true && c == true);
		if (d == true) {
			System.out.println("3또는 7의 배수");
			System.out.println("2와 5의 배수");
		} else if (c == true) {
			System.out.println("2와 5의 배수");
		} else if (b == true) {
			System.out.println("3또는 7의 배수");
		} else {
			System.out.println("3또는 7의 배수도 아니고 2와 5의 배수도 아닙니다.");
		}
		sc.close();
	}

	public static void Q4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("x값 입력");
		int x = sc.nextInt();
		System.out.println("y값 입력");
		int y = sc.nextInt();
		// 1번 = (-x,+y)
		// 2번 = (+x,+y)
		// 3번 = (+x,-y)
		// 4번 = (-x,-y)
		boolean a = (x < 0 && y > 0);
		boolean b = (x > 0 && y > 0);
		boolean c = (x > 0 && y < 0);
		boolean d = (x < 0 && y < 0);
		if (a == true)
			System.out.println("1번");
		else if (b == true)
			System.out.println("2번");
		else if (c == true)
			System.out.println("3번");
		else if (d == true)
			System.out.println("4번");
		else
			System.out.println("x,y축 위에 있습니다.");
		sc.close();
	}

	public static void Q5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력해주세요. >>");
		int a = sc.nextInt();
		System.out.println("카드결제를 하시겠습니까? (Yes or No)");
		String b = sc.next();
		int c = 1300;
		int d = 1600;
		int cc = c - 100;
		int cd = d - 100;

		if (a <= 15 && b.equals("Yes")) {
			System.out.println(cc + "원 입니다.");
		} else if (a <= 15 && b.equals("No")) {
			System.out.println(c + "원 입니다.");
		} else if (a > 15 && b.equals("Yes")) {
			System.out.println(cd + "원 입니다.");
		} else if (a > 15 && b.equals("No")) {
			System.out.println(d + "원 입니다.");
		}
		sc.close();
	}

	public static void Q6() {
		Scanner sc = new Scanner(System.in);

//		a. 밥을 먹었으면 ‘밥을 먹었음’ 이 출력 되고 밥을 먹지 않았으면 아무것도 출력되지 않음.

//		System.out.println("밥을 먹었나요?");
//		String a = sc.next();
//		if (a.equals("네"))
//			System.out.println("밥을 먹었음");
//		else
//			System.out.println("...");

//		b. 빵을 먹었으면 ‘빵을 먹었음’이 출력되고 빵을 먹지 않았으면 ‘밥을 먹었음’이 출력됨

//		System.out.println("빵을 먹었나요?");
//		String a = sc.next();
//		if (a.equals("네"))
//			System.out.println("빵을 먹었음");
//		else
//			System.out.println("밥을 먹었음");

//		c. 밥을 먹었으면 ‘밥을 먹었음’ 먹지 않았으면 ‘빵을 먹었음’이 출력되도록 구현.

//		System.out.println("밥을 먹었나요?");
//		String a = sc.next();
//		if (a.equals("네"))
//			System.out.println("밥을 먹었음");
//		else
//			System.out.println("빵을 먹었음");

//		d. 밥을 먹었으면 ‘밥을 먹었음’ 먹지 않았으면 ‘아무것도 안먹었음’이 출력 되도록 구현.

//		System.out.println("밥을 먹었나요?");
//		String a = sc.next();
//		if (a.equals("네"))
//			System.out.println("밥을 먹었음");
//		else
//			System.out.println("아무것도 안 먹었음");

//		e. 식사로 ‘밥’과 ‘빵’이 있고 후식으로 국,우유, 아이스크림, 커피가 있는데 밥을 먹으면
//		국과 아이스크림중 하나를 빵을 먹으면 우유 커피 중 하나를 후식으로 먹을수 있다.
		System.out.println("식사를 뭐 하셨나요?(밥 or 빵)");
		String a = sc.next();
		switch (a) {
		case "밥":
			System.out.println("후식으로 국과 아이스크림 중 하나를 골라주세요.");
			break;
		case "빵":
			System.out.println("후식으로 우유와 커피 중 하나를 골라주에요.");
			break;
		default:
			System.out.println("Error");
			break;
		}
		sc.close();
	}

	public static void Q7() {

		int i = (new java.util.Date()).getDay();
		switch (i) {
		case 0:
			System.out.println("오늘은 일요일 입니다.");
			break;
		case 1:
			System.out.println("오늘은 월요일 입니다.");
			break;
		case 2:
			System.out.println("오늘은 화요일 입니다.");
			break;
		case 3:
			System.out.println("오늘은 수요일 입니다.");
			break;
		case 4:
			System.out.println("오늘은 목요일 입니다.");
			break;
		case 5:
			System.out.println("오늘은 금요일 입니다.");
			break;
		case 6:
			System.out.println("오늘은 토요일 입니다.");
			break;
		default:
			System.out.println("Error");
			break;
		}

	}

	public static void Q8() {
		Scanner sc = new Scanner(System.in);
		System.out.println("사이즈를 입력해주세요. >>");
		int a = sc.nextInt();

		boolean s = (90 <= a && a < 95);
		boolean m = (95 <= a && a < 100);
		boolean l = (100 <= a && a < 105);
		boolean xl = (105 <= a && a < 110);
		boolean xxl = (110 <= a);
		if (s == true)
			System.out.println("S");
		else if (m == true)
			System.out.println("M");
		else if (l == true)
			System.out.println("L");
		else if (xl == true)
			System.out.println("XL");
		else if (xxl == true)
			System.out.println("XXL");
		else
			System.out.println("Error");
		sc.close();
	}

	public static void Q9() {
		Scanner sc = new Scanner(System.in);
		System.out.println("java 성적 입력 >>");
		int java = sc.nextInt();
		System.out.println("html 성적 입력 >>");
		int html = sc.nextInt();
		System.out.println("db 성적 입력 >>");
		int db = sc.nextInt();
		int all = (java + html + db);
		double ave = all / 3;
		if (ave >= 60) {
			if (java < 40 && html > 40 && db > 40)
				System.out.println("java " + java + "점으로 과락, 총점 : " + all + ", 평균 : " + ave + ". 최종결과 : 합격");
			else if (java > 40 && html < 40 && db > 40)
				System.out.println("html " + html + "점으로 과락, 총점 : " + all + ", 평균 : " + ave + ". 최종결과 : 합격");
			else if (java > 40 && html > 40 && db < 40)
				System.out.println("db " + db + "점으로 과락, 총점 : " + all + ", 평균 : " + ave + ". 최종결과 : 합격");
			else
				System.out.println("총점 : " + all + ", 평균 : " + ave + ". 최종결과 : 합격");
		} else {
			if (java > 40 && html > 40 && db > 40)
				System.out.println("총점 : " + all + ", 평균 : " + ave + ". 최종결과 : 불합격");
			else if (java > 40 && html > 40 && db <= 40)
				System.out.println("db " + db + "점으로 과락, 총점 : " + all + ", 평균 : " + ave + ". 최종결과 : 불합격");
			else if (java > 40 && html <= 40 && db > 40)
				System.out.println("html " + html + "점으로 과락, 총점 : " + all + ", 평균 : " + ave + ". 최종결과 : 불합격");
			else if (java <= 40 && html > 40 && db > 40)
				System.out.println("java " + java + "점으로 과락, 총점 : " + all + ", 평균 : " + ave + ". 최종결과 : 불합격");
			else if (java > 40 && html <= 40 && db <= 40)
				System.out.println("html " + html + "점으로 과락, " + "db " + db + "점으로 과락, 총점 : " + all + ", 평균 : " + ave
						+ ". 최종결과 : 불합격");
			else if (java <= 40 && html > 40 && db <= 40)
				System.out.println("java " + java + "점으로 과락, " + "db " + db + "점으로 과락, 총점 : " + all + ", 평균 : " + ave
						+ ". 최종결과 : 불합격");
			else if (java <= 40 && html <= 40 && db > 40)
				System.out.println("java " + java + "점으로 과락, " + "html " + html + "점으로 과락, 총점 : " + all + ", 평균 : "
						+ ave + ". 최종결과 : 불합격");
			else if (java <= 40 && html <= 40 && db <= 40)
				System.out.println("java " + java + "점으로 과락, " + "html " + html + "점으로 과락, " + "db " + db
						+ "점으로 과락, 총점 : " + all + ", 평균 : " + ave + ". 최종결과 : 불합격");

		}
		sc.close();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문제 번호 입력(1 ~ 17) >>");
		int a = sc.nextInt();
		switch (a) {
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
		case 5:
			Q5();
			break;
		case 6:
			Q6();
			break;
		case 7:
			Q7();
			break;
		case 8:
			Q8();
			break;
		case 9:
			Q9();
			break;
		default:
			System.out.println("Error");
			break;
		}
		sc.close();
	}

}
