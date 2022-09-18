package mk.test;

//import java.text.DecimalFormat;
import java.util.Scanner;

public class TEST16 {
	public static void Q1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("성인은 1 / 초, 중, 고교생은 2를 입력해주세요.");
		int a = sc.nextInt();
		if (a == 1) {
			System.out.println("성인) 체중 입력 >>");
			double x = sc.nextDouble();
			System.out.println("성인) 키 입력 >>");
			double y = sc.nextDouble();
			double bmi = (x / ((y - 100) * 0.9)) * 100;

			if (bmi < 100)
				System.out.println("성인) 체중 미달");
			else if (100 <= bmi && bmi < 110)
				System.out.println("성인) 정상");
			else if (110 <= bmi && bmi < 120)
				System.out.println("성인) 경도 비만");
			else if (120 <= bmi && bmi < 150)
				System.out.println("성인) 중도 비만");
			else if (150 <= bmi)
				System.out.println("성인) 고도 비만");
		} else if (a == 2) {
			System.out.println("청소년) 체중 입력 >>");
			double x = sc.nextDouble();
			System.out.println("청소년) 키 입력 >>");
			double y = sc.nextDouble();
			double bmi = (x / ((y - 100) * 0.9)) * 100;

			if (bmi < 95)
				System.out.println("청소년) 체중 미달");
			else if (95 <= bmi && bmi < 100)
				System.out.println("청소년) 정상");
			else if (100 <= bmi && bmi < 130)
				System.out.println("청소년) 경도 비만");
			else if (130 <= bmi && bmi < 150)
				System.out.println("청소년) 중도 비만");
			else if (150 <= bmi)
				System.out.println("청소년) 고도 비만");
		} else {
			System.out.println("Error");
		}
		sc.close();
	}

	public static void Q2() {
		System.out.println("목 둘레를 적어주세요. >>");
		Scanner sc = new Scanner(System.in);
		int neck = sc.nextInt();
		boolean ns = (33 <= neck && neck <= 35);
		boolean nm = (36 <= neck && neck <= 37);
		boolean nl = (38 <= neck && neck <= 39);
		boolean nxl = (41 <= neck && neck <= 42);
		boolean nxxl = (43 <= neck && neck <= 45);

		System.out.println("가슴 둘레를 적어주세요. >>");
		int chest = sc.nextInt();
		boolean cs = (86 <= chest && chest <= 91);
		boolean cm = (96 <= chest && chest <= 102);
		boolean cl = (107 <= chest && chest <= 112);
		boolean cxl = (117 <= chest && chest <= 122);
		boolean cxxl = (127 <= chest && chest <= 132);

		System.out.println("팔 길이를 적어주세요. >>");
		int arm = sc.nextInt();
		boolean as = (78 <= arm && arm <= 81);
		boolean am = (81 < arm && arm <= 84);
		boolean al = (84 < arm && arm <= 86);
		boolean axl = (86 < arm && arm <= 89);
		boolean axxl = (89 < arm && arm <= 91);

		System.out.println("허리 둘레를 적어주세요. >>");
		int waist = sc.nextInt();
		boolean ws = (28 <= waist && waist <= 29);
		boolean wm = (30 <= waist && waist <= 31);
		boolean wl = (32 <= waist && waist <= 34);
		boolean wxl = (34 <= waist && waist <= 37);
		boolean wxxl = (38 <= waist && waist <= 40);

		System.out.println("한국 사이즈를 적어주세요. >>");
		int size = sc.nextInt();
		boolean s = (size >= 90 && size < 95);
		boolean m = (size >= 95 && size < 100);
		boolean l = (size >= 100 && size < 105);
		boolean xl = (size >= 105 && size < 110);
		boolean xxl = (size >= 110);

		if (ns == true)
			System.out.println("미국 사이즈로 S 입니다.");
		else if (nm == true)
			System.out.println("미국 사이즈로 M 입니다.");
		else if (nl == true)
			System.out.println("미국 사이즈로 l 입니다.");
		else if (nxl == true)
			System.out.println("미국 사이즈로 xl 입니다.");
		else if (nxxl == true)
			System.out.println("미국 사이즈로 xxl 입니다.");
		else
			System.out.println("미국 사이즈로 없습니다.");

		if (cs == true)
			System.out.println("미국 사이즈로 S 입니다.");
		else if (cm == true)
			System.out.println("미국 사이즈로 M 입니다.");
		else if (cl == true)
			System.out.println("미국 사이즈로 l 입니다.");
		else if (cxl == true)
			System.out.println("미국 사이즈로 xl 입니다.");
		else if (cxxl == true)
			System.out.println("미국 사이즈로 xxl 입니다.");
		else
			System.out.println("미국 사이즈로 없습니다.");

		if (as == true)
			System.out.println("미국 사이즈로 S 입니다.");
		else if (am == true)
			System.out.println("미국 사이즈로 M 입니다.");
		else if (al == true)
			System.out.println("미국 사이즈로 l 입니다.");
		else if (axl == true)
			System.out.println("미국 사이즈로 xl 입니다.");
		else if (axxl == true)
			System.out.println("미국 사이즈로 xxl 입니다.");
		else
			System.out.println("미국 사이즈로 없습니다.");

		if (ws == true)
			System.out.println("미국 사이즈로 S 입니다.");
		else if (wm == true)
			System.out.println("미국 사이즈로 M 입니다.");
		else if (wl == true)
			System.out.println("미국 사이즈로 l 입니다.");
		else if (wxl == true)
			System.out.println("미국 사이즈로 xl 입니다.");
		else if (wxxl == true)
			System.out.println("미국 사이즈로 xxl 입니다.");
		else
			System.out.println("미국 사이즈로 없습니다.");

		if (s == true)
			System.out.println("미국 사이즈로 S 입니다.");
		else if (m == true)
			System.out.println("미국 사이즈로 M 입니다.");
		else if (l == true)
			System.out.println("미국 사이즈로 l 입니다.");
		else if (xl == true)
			System.out.println("미국 사이즈로 xl 입니다.");
		else if (xxl == true)
			System.out.println("미국 사이즈로 xxl 입니다.");
		else
			System.out.println("미국 사이즈로 없습니다.");
		sc.close();
	}

	public static void Q3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("계산기");
		System.out.println("첫 번째 수 입력 >> ");
		double a = sc.nextDouble();
		System.out.println("1. + 2. - 3. * 4. /");
		int b = sc.nextInt();
		System.out.println("두 번째 수 입력 >> ");
		double c = sc.nextDouble();
		switch (b) {
		case 1:
			System.out.println(a + c);
			break;
		case 2:
			System.out.println(a - c);
			break;
		case 3:
			System.out.println(a * c);
			break;
		case 4:
			System.out.println((a / c));
			break;
		}
		sc.close();
	}

	public static void Q4() {
		Scanner sc = new Scanner(System.in);
		double a = (Math.random() * 3);
		boolean rock = (0 <= a && a < 1);
		boolean scissors = (1 <= a && a < 2);
		boolean paper = (2 <= a && a < 3);
		System.out.println("가위, 바위, 보를 입력해주세요.");
		String b = sc.next();
		if (b.equals("바위")) {
			System.out.println("당신 : 바위");
			if (rock == true && scissors == false && paper == false) {
				System.out.println("컴퓨터 : 바위");
				System.out.println("비김");
			} else if ((rock == false && scissors == true && paper == false)) {
				System.out.println("컴퓨터 : 가위");
				System.out.println("승리");
			} else if ((rock == false && scissors == false && paper == true)) {
				System.out.println("컴퓨터 : 보");
				System.out.println("패배");
			}
		} else if (b.equals("가위")) {
			System.out.println("당신 : 가위");
			if (rock == true && scissors == false && paper == false) {
				System.out.println("컴퓨터 : 바위");
				System.out.println("패배");
			} else if ((rock == false && scissors == true && paper == false)) {
				System.out.println("컴퓨터 : 가위");
				System.out.println("비김");
			} else if ((rock == false && scissors == false && paper == true)) {
				System.out.println("컴퓨터 : 보");
				System.out.println("승리");
			}
		} else if (b.equals("보")) {
			System.out.println("당신 : 보");
			if (rock == true && scissors == false && paper == false) {
				System.out.println("컴퓨터 : 바위");
				System.out.println("승리");
			} else if ((rock == false && scissors == true && paper == false)) {
				System.out.println("컴퓨터 : 가위");
				System.out.println("패배");
			} else if ((rock == false && scissors == false && paper == true)) {
				System.out.println("컴퓨터 : 보");
				System.out.println("비김");
			}
		} else {
			System.out.println("Error");
		}

		sc.close();
	}

	public static void Q5() {
		double a = (Math.random() * 5 + 6);
		int b = (int) a;
		System.out.println(b);
	}

	public static void Q6() {
		double a = (Math.random() * 45);
		int b = (int) a;
		System.out.println(b);
	}

	public static void Q7() {
		double a = (Math.random() * 3);
		boolean rock = (0 <= a && a < 1);
		boolean scissors = (1 <= a && a < 2);
		boolean paper = (2 <= a && a < 3);
		if ((rock == true && scissors == false && paper == false)) {
			System.out.println("컴퓨터 : 바위");
		} else if ((rock == false && scissors == true && paper == false)) {
			System.out.println("컴퓨터 : 가위");
		} else if ((rock == false && scissors == false && paper == true)) {
			System.out.println("컴퓨터 : 보");
		} else {
			System.out.println("Error");
		}
	}

	public static void Q8() {
//		DecimalFormat df = new DecimalFormat("###,###");
		Scanner sc = new Scanner(System.in);
		System.out.println("금액을 입력해주세요.(단위 : 만원)");
		int a = sc.nextInt();
		double tax1 = (a * 0.06) * 1000;
		double tax2 = ((a * 0.15) - 108);
		double tax3 = ((a * 0.24) - 522);
		double tax4 = ((a * 0.35) - 1490);
		double tax5 = ((a * 0.38) - 1940);
		double tax6 = ((a * 0.4) - 2540);
		double tax7 = ((a * 0.42) - 3540);

		if (a <= 1200) {
			System.out.println("세액은 " + tax1 + "만원 입니다.");
		} else if (1200 < a && a <= 4600) {
			System.out.println("세액은 " + tax2 + "만원 입니다.");
		} else if (4600 < a && a <= 8800) {
			System.out.println("세액은 " + tax3 + "만원 입니다.");
		} else if (8800 < a && a <= 15000) {
			System.out.println("세액은 " + tax4 + "만원 입니다.");
		} else if (15000 < a && a <= 30000) {
			System.out.println("세액은 " + tax5 + "만원 입니다.");
		} else if (30000 < a && a <= 50000) {
			System.out.println("세액은 " + tax6 + "만원 입니다.");
		} else if (50000 < a) {
			System.out.println("세액은 " + tax7 + "만원 입니다.");
		} else {
			System.out.println("Error");
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
		default :
			System.out.println("Error");
			break;
		}
		sc.close();
	}
}
