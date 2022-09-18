package mk.test;

import java.util.Scanner;

public class TEST22 {
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
				continue;
			} else if (sign == 2) {// 빼기
				System.out.println(x + " - " + y + " =?");
				int a = sc.nextInt();
				if (x - y == a) {
					System.out.println("정답");
				} else {
					System.out.println("오답");
				}
				continue;
			} else if (sign == 3) {// 곱하기
				System.out.println(x + " * " + y + " =?");
				int a = sc.nextInt();
				if (x * y == a) {
					System.out.println("정답");
				} else {
					System.out.println("오답");
				}
				continue;
			} else if (sign == 4) {// 나누기
				System.out.println(x + " / " + y + " =?");
				int a = sc.nextInt();
				if (x / y == a) {
					System.out.println("정답");
				} else {
					System.out.println("오답");
				}
				continue;
			}
		}
		sc.close();
	}

	public static void Q7() {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int total = 0;
		while (i == 0) {
			mean();
			int input1 = sc.nextInt();
			if (input1 == 1) { // 성인
				System.out.println("대인을 선택하셨습니다.");
				System.out.println("");
				System.out.println("1. 주간권(1일권) 2. 오후권(오후3시~) 3. 윈터야간권(오후5시~) 4. 2일권 을 선택해주세요. 처음으로 돌아가실려면 0을 입력해주세요.");
				System.out.println("(1)		(2)		(3)		(4)");
				int input2 = sc.nextInt();
				if (input2 == 1) {
					System.out.println("1. 주간권(1일권)을 선택하셨습니다. 처음으로 돌아가실려면 0을 입력해주세요.");
					System.out.println("몇 장 구매를 하시겠습니까?");
					int input3 = sc.nextInt();
					if (input3 == 0) {
						System.out.println("처음으로 돌아갑니다.");
						continue;
					} else {
						System.out.println("1. 주간권(1일권)이 " + input3 + " 장이 선택되었습니다.");
						total = total + (46000 * input3);
					}
				} else if (input2 == 2) {
					System.out.println("2. 오후권(오후3시~)을 선택하셨습니다. 처음으로 돌아가실려면 0을 입력해주세요.");
					System.out.println("몇 장 구매를 하시겠습니까?");
					int input3 = sc.nextInt();
					if (input3 == 0) {
						System.out.println("처음으로 돌아갑니다.");
						continue;
					} else {
						System.out.println("2. 오후권(오후3시~)이 " + input3 + " 장이 선택되었습니다.");
						total = total + (38000 * input3);
					}
				} else if (input2 == 3) {
					System.out.println("3. 윈터야간권(오후5시~)을 선택하셨습니다. 처음으로 돌아가실려면 0을 입력해주세요.");
					System.out.println("몇 장 구매를 하시겠습니까?");
					int input3 = sc.nextInt();
					if (input3 == 0) {
						System.out.println("처음으로 돌아갑니다.");
						continue;
					} else {
						System.out.println("3. 윈터야간권(오후5시~)이 " + input3 + " 장이 선택되었습니다.");
						total = total + (20000 * input3);
					}
				} else if (input2 == 4) {
					System.out.println("4. 2일권을 선택하셨습니다. 처음으로 돌아가실려면 0을 입력해주세요.");
					System.out.println("몇 장 구매를 하시겠습니까?");
					int input3 = sc.nextInt();
					if (input3 == 0) {
						System.out.println("처음으로 돌아갑니다.");
						continue;
					} else {
						System.out.println("4. 2일권이 " + input3 + " 장이 선택되었습니다.");
						total = total + (74000 * input3);
					}
				} else if (input2 == 0) {
					System.out.println("처음으로 돌아갑니다.");
					continue;
				}
				continue;
			} else if (input1 == 1) { // 청소년
				System.out.println("청소년을 선택하셨습니다.");
				System.out.println("");
				System.out.println("1. 주간권(1일권) 2. 오후권(오후3시~) 3. 윈터야간권(오후5시~) 4. 2일권 을 선택해주세요. 처음으로 돌아가실려면 0을 입력해주세요.");
				System.out.println("(1)		(2)		(3)		(4)");
				int input2 = sc.nextInt();
				if (input2 == 1) {
					System.out.println("1. 주간권(1일권)을 선택하셨습니다. 처음으로 돌아가실려면 0을 입력해주세요.");
					System.out.println("몇 장 구매를 하시겠습니까?");
					int input3 = sc.nextInt();
					if (input3 == 0) {
						System.out.println("처음으로 돌아갑니다.");
						continue;
					} else {
						System.out.println("1. 주간권(1일권)이 " + input3 + " 장이 선택되었습니다.");
						total = total + (39000 * input3);
					}
				} else if (input2 == 2) {
					System.out.println("2. 오후권(오후3시~)을 선택하셨습니다. 처음으로 돌아가실려면 0을 입력해주세요.");
					System.out.println("몇 장 구매를 하시겠습니까?");
					int input3 = sc.nextInt();
					if (input3 == 0) {
						System.out.println("처음으로 돌아갑니다.");
						continue;
					} else {
						System.out.println("2. 오후권(오후3시~)이 " + input3 + " 장이 선택되었습니다.");
						total = total + (32000 * input3);
					}
				} else if (input2 == 3) {
					System.out.println("3. 윈터야간권(오후5시~)을 선택하셨습니다. 처음으로 돌아가실려면 0을 입력해주세요.");
					System.out.println("몇 장 구매를 하시겠습니까?");
					int input3 = sc.nextInt();
					if (input3 == 0) {
						System.out.println("처음으로 돌아갑니다.");
						continue;
					} else {
						System.out.println("3. 윈터야간권(오후5시~)이 " + input3 + " 장이 선택되었습니다.");
						total = total + (17000 * input3);
					}
				} else if (input2 == 4) {
					System.out.println("4. 2일권을 선택하셨습니다. 처음으로 돌아가실려면 0을 입력해주세요.");
					System.out.println("몇 장 구매를 하시겠습니까?");
					int input3 = sc.nextInt();
					if (input3 == 0) {
						System.out.println("처음으로 돌아갑니다.");
						continue;
					} else {
						System.out.println("4. 2일권이 " + input3 + " 장이 선택되었습니다.");
						total = total + (62000 * input3);
					}
				} else if (input2 == 0) {
					System.out.println("처음으로 돌아갑니다.");
					continue;
				}
				continue;
			} else if (input1 == 1) { // 노인
				System.out.println("소인/경로를 선택하셨습니다.");
				System.out.println("");
				System.out.println("1. 주간권(1일권) 2. 오후권(오후3시~) 3. 윈터야간권(오후5시~) 4. 2일권 을 선택해주세요. 처음으로 돌아가실려면 0을 입력해주세요.");
				System.out.println("(1)		(2)		(3)		(4)");
				int input2 = sc.nextInt();
				if (input2 == 1) {
					System.out.println("1. 주간권(1일권)을 선택하셨습니다. 처음으로 돌아가실려면 0을 입력해주세요.");
					System.out.println("몇 장 구매를 하시겠습니까?");
					int input3 = sc.nextInt();
					if (input3 == 0) {
						System.out.println("처음으로 돌아갑니다.");
						continue;
					} else {
						System.out.println("1. 주간권(1일권)이 " + input3 + " 장이 선택되었습니다.");
						total = total + (36000 * input3);
					}
				} else if (input2 == 2) {
					System.out.println("2. 오후권(오후3시~)을 선택하셨습니다. 처음으로 돌아가실려면 0을 입력해주세요.");
					System.out.println("몇 장 구매를 하시겠습니까?");
					int input3 = sc.nextInt();
					if (input3 == 0) {
						System.out.println("처음으로 돌아갑니다.");
						continue;
					} else {
						System.out.println("2. 오후권(오후3시~)이 " + input3 + " 장이 선택되었습니다.");
						total = total + (29000 * input3);
					}
				} else if (input2 == 3) {
					System.out.println("3. 윈터야간권(오후5시~)을 선택하셨습니다. 처음으로 돌아가실려면 0을 입력해주세요.");
					System.out.println("몇 장 구매를 하시겠습니까?");
					int input3 = sc.nextInt();
					if (input3 == 0) {
						System.out.println("처음으로 돌아갑니다.");
						continue;
					} else {
						System.out.println("3. 윈터야간권(오후5시~)이 " + input3 + " 장이 선택되었습니다.");
						total = total + (16000 * input3);
					}
				} else if (input2 == 4) {
					System.out.println("4. 2일권을 선택하셨습니다. 처음으로 돌아가실려면 0을 입력해주세요.");
					System.out.println("몇 장 구매를 하시겠습니까?");
					int input3 = sc.nextInt();
					if (input3 == 0) {
						System.out.println("처음으로 돌아갑니다.");
						continue;
					} else {
						System.out.println("4. 2일권이 " + input3 + " 장이 선택되었습니다.");
						total = total + (58000 * input3);
					}
				} else if (input2 == 0) {
					System.out.println("처음으로 돌아갑니다.");
					continue;
				}
				continue;

			} else if (input1 == 4) {
				if (total == 0) {
					System.out.println("총 금액 : " + total);
					continue;
				}
				System.out.println("총 금액 : " + total);
				break;
			}
		}
		sc.close();
	}

	public static void mean() {
		System.out.println(
				"=================================================================================================");
		System.out.println("|	종류		|	대인		|	청소년		|	소인/경로		|");
		System.out.println(
				"=================================================================================================");
		System.out.println("|	주간권(1일권)	|	46,000원		|	39,000원		|	36,000원		|");
		System.out.println(
				"=================================================================================================");
		System.out.println("|	오후권(오후3시~)	|	38,000원		|	32,000원		|	29,000원		|");
		System.out.println(
				"=================================================================================================");
		System.out.println("|	윈터야간권(오후5시~)	|	20,000원		|	17,000원		|	16,000원		|");
		System.out.println(
				"=================================================================================================");
		System.out.println("|	2일권		|	74,000원		|	62,000원		|	58,000원		|");
		System.out.println(
				"=================================================================================================");
		System.out.println("");
		System.out.println("\"1. 대인 2. 청소년 3. 소인/경로 4. 총 금액 \"를 숫자로 입력해주세요");
	}

	public static void Q8() {
		Scanner sc = new Scanner(System.in);
		int computer = (int) ((Math.random() * 50) + 1);
		int i = 0;
		int trry = 1;
		while (i == 0) {
			System.out.print(trry + " 번 째 >>");
			int input = sc.nextInt();
			System.out.println("");
			if (computer == input) {
				System.out.println("정답입니다");
				System.out.println(trry + " 번 째에 맞추셨습니다.");
				trry++;
				break;
			} else if (computer > input) {
				System.out.println("Up");
				trry++;
			} else if (computer < input) {
				System.out.println("Down");
				trry++;
			}
		}
		sc.close();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문제 번호를 입력(5~8)");
		int a = sc.nextInt();
		switch (a) {
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
		default:
			System.out.println("시스템 에러");
			break;
		}
		sc.close();
	}
}
