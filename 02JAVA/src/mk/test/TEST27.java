package mk.test;

import java.util.Scanner;

public class TEST27 {
	public static void Q1() {
		System.out.println("1) 다음 문자열을 출력 할 수 있는 기찻길 순서도 의사 코드를 만들어 보자.\r\n"
				+ "1. *엔터**엔터***엔터****엔터*****엔터******엔터*******엔터\r\n"
				+ "2. *******엔터******엔터*****엔터****엔터***엔터**엔터*엔터\r\n"
				+ "3. 공간공간공간공간공간공간*엔터공간공간공간공간공간**엔터공간공간공간공간***엔터공간공간공간" + "\n****엔터공간공간*****엔터공간******엔터*******엔터");
		System.out.println("1)");
		for (int i = 1; i < 8; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		System.out.println("2)");
		for (int i = 8; i > 1; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		System.out.println("3)");
		for (int i = 8; i > 1; i--) {
			for (int j = 2; j < i; j++) {
				System.out.print(" ");
			}
			for (int y = 9; y > i; y--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public static void Q2() {
		System.out.println("Q1.");
		for (int i = 0; i < 5; i++) {
			System.out.print("*");
		}
		System.out.println("");
	}

	public static void Q3() {
		System.out.println("Q2.");
		for (int i = 0; i < 5; i++) {
			System.out.println("*");
		}
	}

	public static void Q4() {
		System.out.println("Q3.");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public static void Q5() {
		System.out.println("Q4.");
		for (int i = 2; i < 7; i++) {
			for (int j = 1; j < 6; j++) {
				System.out.print(i);
			}
			System.out.println("");
		}
	}

	public static void Q6() {
		System.out.println("Q5.");
		for (int i = 2; i < 7; i++) {
			for (int j = 1; j < 6; j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
	}

	public static void Q7() {
		System.out.println("Q6.");
		int a = 1;
		for (int i = 0; i < 5; i++) {
			for (int j = a; j < a + 5; j++) {
				System.out.print(j);
			}
			a++;
			System.out.println("");
		}
	}

	public static void Q8() {
		System.out.println("Q7.");
		int b = 5;
		for (int i = 0; i < 5; i++) {
			for (int j = b; j < b + 5; j++) {
				System.out.print(j);
			}
			b--;
			System.out.println("");
		}
	}

	public static void Q9() {
		System.out.println("Q8.");
		for (int i = 1; i < 6; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public static void Q10() {
		System.out.println("Q9.");
		for (int i = 6; i > 1; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public static void Q11() {
		System.out.println("Q10.");
		for (int i = 6; i > 1; i--) {
			for (int y = 6; y > i; y--) {
				System.out.print(" ");
			}
			for (int j = 1; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public static void Q12() {
		System.out.println("Q11.");
		for (int i = 6; i > 1; i--) {
			for (int j = 2; j < i; j++) {
				System.out.print(" ");
			}
			for (int y = 7; y > i; y--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public static void Q13() {
		System.out.println("Q12.");
		for (int i = 1; i < 6; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}

			System.out.println("");
		}
		for (int i = 5; i > 1; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public static void Q14() {
		System.out.println("Q13.");
		for (int i = 6; i > 1; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for (int i = 2; i < 7; i++) {
			if (i == 6) {
				break;
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");

			}
			System.out.println("");
		}
	}

	public static void Q15() {
		System.out.println("Q.14");
		for (int i = 6; i > 1; i--) {
			if (i == 2) {
				break;
			}
			for (int y = 6; y > i; y--) {
				System.out.print(" ");
			}
			for (int j = 1; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for (int i = 6; i > 1; i--) {
			for (int j = 2; j < i; j++) {
				System.out.print(" ");
			}
			for (int y = 7; y > i; y--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public static void Q16() {
		System.out.println("Q.15");
		for (int i = 6; i > 1; i--) {
			if (i == 2) {
				break;
			}
			for (int j = 2; j < i; j++) {
				System.out.print(" ");
			}
			for (int y = 7; y > i; y--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for (int i = 6; i > 1; i--) {
			for (int y = 6; y > i; y--) {
				System.out.print(" ");
			}
			for (int j = 1; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public static void Q17() {
		System.out.println("Q.16");
		for (int i = 0; i < 5; i++) {
			for (int j = 1; j < 5 - i; j++) {
				System.out.print(" ");
			}
			for (int x = 0; x < i * 2 + 1; x++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public static void Q18() {
		System.out.println("Q.17");
		for (int i = 5; i > 0; i--) {
			for (int j = 6; j > 0 + i; j--) {
				if (j == 6) {
					continue;
				}
				System.out.print(" ");
			}
			for (int x = 2; x < i * 2 + 1; x++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public static void Q19() {
		System.out.println("Q.18");
		for (int i = 0; i < 5; i++) {
			for (int j = 1; j < 5 - i; j++) {
				System.out.print(" ");
			}
			for (int x = 0; x < i * 2 + 1; x++) {
				System.out.print("*");
			}
			System.out.println("");
			if (i == 3) {
				break;
			}
		}
		for (int i = 5; i > 0; i--) {
			for (int j = 6; j > 0 + i; j--) {
				if (j == 6) {
					continue;
				}
				System.out.print(" ");
			}
			for (int x = 2; x < i * 2 + 1; x++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public static void Q20() {
		System.out.println("Q.19");
		int i, j;
		int z = 1;
		for (i = 5; i <= 5; i -= z) {
			for (j = 0; j < 5; j++) {
				if (i > j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for (j = 5; j > 0; j--) {
				if (i < j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}

			}
			System.out.println("");
			if (i == 1) {
				z = -1;
			}
		}
	}

	public static void Q21() {
		System.out.println("Q.20");
		int i, j;
		int z = 1;
		for (i = 5; i <= 5; i -= z) {
			for (j = 5; j > 0; j--) {
				if (i > j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.print(" ");
			for (j = 0; j < 6; j++) {
				if (i > j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}

			System.out.println("");
			if (i == 1) {
				z = -1;
			}
		}
	}

	public static void Q22() {
		System.out.println("Q.21");
		int i, j;
		for (i = 5; i > 0; i--) {
			for (j = 6; j > 0 + i; j--) {
				if (j == 6) {
					continue;
				}
				System.out.print(" ");
			}
			for (int x = 2; x < i * 2 + 1; x++) {
				System.out.print("*");
			}
			System.out.println("");
			if (i == 2) {
				break;
			}
		}
		for (i = 0; i < 5; i++) {
			for (j = 1; j < 5 - i; j++) {
				System.out.print(" ");
			}
			for (int x = 0; x < i * 2 + 1; x++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (1 != 0) {
			System.out.println("문제 번호 1~22. 종료 0");
			int input = sc.nextInt();
			if (input == 1) {
				Q1();
			} else if (input == 2) {
				Q2();
			} else if (input == 3) {
				Q3();
			} else if (input == 4) {
				Q4();
			} else if (input == 5) {
				Q5();
			} else if (input == 6) {
				Q6();
			} else if (input == 7) {
				Q7();
			} else if (input == 8) {
				Q8();
			} else if (input == 9) {
				Q9();
			} else if (input == 10) {
				Q10();
			} else if (input == 11) {
				Q11();
			} else if (input == 12) {
				Q12();
			} else if (input == 13) {
				Q13();
			} else if (input == 14) {
				Q14();
			} else if (input == 15) {
				Q15();
			} else if (input == 16) {
				Q16();
			} else if (input == 17) {
				Q17();
			} else if (input == 18) {
				Q18();
			} else if (input == 19) {
				Q19();
			} else if (input == 20) {
				Q20();
			} else if (input == 21) {
				Q21();
			} else if (input == 22) {
				Q22();
			} else if (input == 0) {
				System.out.println("STOP");
				break;
			} else {
				System.out.println("Error");
			}
		}
		sc.close();
	}
}
