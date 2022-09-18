package mk.test;

import java.util.Arrays;
import java.util.Scanner;

public class TEST28 {

	public static void Q1() {
		System.out.println("문제 1) 1~50까지의 짝수를 출력하는 코드를 만들어 보자.");
		for (int i = 1; i < 51; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

	public static void Q2() {
		System.out.println("문제 2) 1~100사이의 10의 배수을 출력하는 코드를 만들어 보자. 어떤 숫자가 배수 인지\r\n"
				+ "아닌지 알고 싶으면 7로 나눈 나머지가 0이면 7의 배수이고 아니면 7의 배수가 아니다.");
		for (int i = 1; i < 101; i++) {
			if (i % 10 == 0) {
				System.out.println(i);
			}
		}
	}

	public static void Q3() {
		System.out.println("문제 3) 30~300까지의 6의 배수의 합을 출력하는 코드를 만들어 보자.");
		int sum = 0;
		for (int i = 30; i < 300; i++) {
			if (i % 6 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

	public static void Q4() {
		System.out.println("문제 4) 숫자를 하나 입력 받아 1부터 입력한 수까지 순서대로 화면에 출력 되도록 코드를 만들어 보자.");
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력 >> ");
		int input = sc.nextInt();
		for (; input > 0; input--) {
			System.out.println(input);
			sc.close();
		}
	}

	public static void Q5() {
		System.out.println("문제 5) 사용자에게 두 수를 입력받아 두 수의 사이에 있는 모든 수를 오름차 순으로\r\n"
				+ "출력하는 순서도와 프로그램을 만들어 보자. 예)5 9 입력시 6 7 8 더한 결과를 얻음");
		Scanner sc = new Scanner(System.in);
		System.out.println("1 >>");
		int input1 = sc.nextInt();
		System.out.println("2 >>");
		int input2 = sc.nextInt();
		int sum = 0;
		for (; input1 > input2 + 1;) {
			--input1;
			sum += input1;
			sc.close();
		}
		for (; input2 > input1 + 1;) {
			--input2;
			sum += input2;
		}
		System.out.println(sum);
	}

	public static void Q6() {
		System.out.println("문제 6) 두수를 입력 받아 사이에 있는 짝수를 화면에 오름차 순으로 출력 되도록 순서도와\r\n" + "프로그램을 만들어 보자.");
		Scanner sc = new Scanner(System.in);
		System.out.println("1 >>");
		int input1 = sc.nextInt();
		System.out.println("2 >>");
		int input2 = sc.nextInt();
		if (input1 == input2) {
			System.out.println("같음");
		}
		for (; input1 > input2;) {
			++input2;
			if (input2 % 2 == 0) {
				System.out.println(input2);
			}
		}
		for (; input2 > input1;) {
			++input1;
			if (input1 % 2 == 0) {
				System.out.println(input1);
			}
		}
	}

	public static void Q7() {
		System.out.println("문제 7) 1-2+3-4+5-6……+99-100의 결과를 구하는 프로그램을 작성해 보자.");
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sum -= i;
			} else {
				sum += i;
			}
		}
		System.out.println(sum);
	}

	public static void Q8() {
		System.out.println("문제 8) 1/2+2/3+3/4+4/5+ 5/6+6/7+....+99/100의 결과를 구하는 프로그램을 작성해 보자.");
		double sum = 0;
		for (double i = 1; i < 100; i++) {
			sum = sum + i;
			sum = sum / (i + 1);
		}
		System.out.println(sum);
	}

	public static void Q9() {
		System.out.println("문제 9) 피보나치 수열을 10개를 순서대로 출력하는 프로그램을 작성해 보자. 피보나치 수열이 무엇인지는 웹사이트를 검색해서 스스로 알아보자.");
		int a1 = 1;
		int a2 = 1;
		int a3;

		System.out.println(a1);
		System.out.println(a2);
		for (int i = 0; i < 8; i++) {
			a3 = a1 + a2;
			System.out.println(a3);
			a1 = a2;
			a2 = a3;
		}
	}

	public static void Q10() {
		System.out.println("문제 10) 원하는 색의 전구와 밝기를 입력 받아 처리하는 프로그램을 만들어 보자. 사용자가\r\n"
				+ "원하는 밝기와 색상을 입력받아 원하는 결과를 출력 받자. 아래 설명한 내용대로 운영\r\n" + "되도록 기술 하자.");
		// 초기 변수값 : color=”빨강” brightness =50
		// 값의 범위 : color=빨강,노랑,파랑 brightness는 0~100
		// 제안사항 : brightness의 숫자 변경은 1씩 가능하다. brightness값이 10이라면 다음
		// brightness값은 11 이나 9 만 가능하다. 10을 50으로 변경하려면 반복문을 사용해야 한다.
		// 사용자입력변수 : colorInput, brightnessInput
		// 최종결과값출력 : p(“현재 색상은”+color+”밝기는”+brightness+”이다”);
		String color = "빨강";
		int brightness = 50;
		Scanner sc = new Scanner(System.in);
		while (1 != 0) {
			System.out.println("현재 색상은 " + color + ", 밝기는 " + brightness + "입니다.");
			System.out.println("메뉴 1. 색 변경 2. 밝기 조절 0. 종료");
			int input = sc.nextInt();
			if (input == 1) {
				System.out.println("색 변경 메뉴");
				System.out.println("빨강, 노랑, 파랑 중 원하시는 색을 입력해주세요.");
				String colorInput = sc.next();
				if (colorInput.equals("빨강")) {
					color = "빨강";
				} else if (colorInput.equals("노랑")) {
					color = "노랑";
				} else if (colorInput.equals("파랑")) {
					color = "파랑";
				} else {
					System.out.println("잘못입력하셨습니다.");
				}
			} else if (input == 2) {
				while (1 != 0) {
					System.out.println("밝기 조절 메뉴 | 현재 밝기 : " + brightness);
					System.out.println("1. 밝기 올리기 2. 밝기 내리기 0. 종료");
					int brightnessInput = sc.nextInt();
					if (brightnessInput == 1) {
						if (brightness == 50) {
							System.out.println("밝기가 최대입니다.");
						} else {
							System.out.println("밝기를 올립니다.");
							brightness += 1;
						}
					} else if (brightnessInput == 2) {
						if (brightness == 0) {
							System.out.println("밝기가 최저입니다.");
						} else {
							System.out.println("밝기를 내립니다.");
							brightness -= 1;
						}
					} else if (brightnessInput == 0) {
						System.out.println("종료합니다");
						break;
					} else {
						System.out.println("잘못 입력하셨습니다.");
					}
				}
			}
		}

	}

	public static void Q11() {
		System.out.println("문제 11) 1-2+3-4+5-6……+99-100의 결과를 구하는 순서도와 프로그램을 작성해 보자.");
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sum -= i;
			} else {
				sum += i;
			}
		}
		System.out.println(sum);
	}

	public static void Q12() {
		System.out.println("문제 12) 1/2+2/3+3/4+4/5+ 5/6+6/7+....+99/100의 결과를 구하는 순서도와 프로그램을 작성해 보자.");
		double sum = 0;
		for (double i = 1; i < 100; i++) {
			sum = sum + i;
			sum = sum / (i + 1);
		}
		System.out.println(sum);
	}

	public static void Q13() {
		System.out.println("문제 13) 다음과 같이 출력 되도록 프로그램을 완성해 보자.");
		int i = 1;
		int j = 1;
		int a = 1;
		for (j = 1; j < 6; j++) {
			if (i == 1 || i == 11 || i == 21) {
				for (i = a; i < a + 5; i++) {
					System.out.print(i + " ");
				}
				a += 5;
			} else if (i == 6 || i == 16) {
				for (i = a + 4; i > a - 1; i--) {
					System.out.print(i + " ");
				}
				a += 5;
				i += 6;
			}
			System.out.println("");
		}
	}

	public static void Q14() {
		Scanner sc = new Scanner(System.in);
		System.out.println("문제 14) 해당 달의 시작 요일과 일수를 입력 받아 달력을 출력해 보자.\\t 탭을 이용해서 만들어 보자.");
		System.out.println("요일 입력 : (1. 일 2. 월 3. 화 4. 수 5. 목 6. 금 7. 토)");
		int day = sc.nextInt();
		System.out.println("일수 입력 : ");
		int i = sc.nextInt();
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
		sc.close();
	}

	public static void Q15() {
		System.out.println("문제 15) 배열 1,2,3,4,5,6,7,8,9 에서 이동방향, 이동칸수, 채울수자를 입력 받아 배열의\r\n" + "내용을 변경후 출력해보자.");
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int subarr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		Scanner sc = new Scanner(System.in);
		System.out.println("이동방향 : >>");
		String input1 = sc.next();
		System.out.println("이동칸수 : >>");
		int input2 = sc.nextInt();
		System.out.println("채울숫자 : >>");
		int input3 = sc.nextInt();
		if (input1.equals("왼쪽")) {
			for (int i = 0; i < (arr.length - input2); i++) {
				arr[i] = arr[input2 + i];
			}
			for (int i = 9; i - input2 < arr.length; i++) {
				arr[i - input2] = input3;
			}
		} else if (input1.equals("오른쪽")) {
			for (int i = 0; i < (arr.length - input2); i++) {
				arr[input2 + i] = subarr[i];
			}
			for (int i = 0; i < input2; i++) {
				arr[i] = input3;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void Q16() {
		Scanner sc = new Scanner(System.in);
		System.out.println("문제 16)배열 1,2,3,4,5,6,7,8,9 에서 회전방향과 회수를 입력받아 배열 내용을\r\n" + "회전시키고 출력해보자.");
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int subarr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println("회전방향");
		String input1 = sc.next();
		int input2 = sc.nextInt();
		if (input1.equals("왼쪽")) {
			for (int i = 0; i < arr.length - input2; i++) {
				arr[i] = subarr[input2 + i];
			}
			for (int i = arr.length; i - input2 < arr.length; i++) {
				arr[i - input2] = subarr[i - arr.length];
			}
		} else if (input1.equals("오른쪽")) {
			input2 = arr.length - input2;
			for (int i = 0; i < arr.length - input2; i++) {
				arr[i] = subarr[input2 + i];
			}
			for (int i = arr.length; i - input2 < arr.length; i++) {
				arr[i - input2] = subarr[i - arr.length];
			}
		}
		System.out.println(Arrays.toString(arr));
		sc.close();
	}

	public static void Q17() {
		System.out.println("문제 17)배열을 100개 선언하여 0~99까지 넣은 다음 i=2 부터 50까지 i를 제외한 i의\r\n"
				+ "배수와 같은 인덱스에 0를 넣은 다음 배열에 0이 아닌 수를 출력해 보자. 출력 결과가 모두\r\n" + "소수인데 이유를 생각해 보자.\r\n" + "");
		int a[] = new int[100];
		for (int i = 0; i < 100; i++) {
			a[i] = i;
		}
		for (int i = 2; i < 50; i++) {
			for (int j = i + 1; j < 100; j++) {
				if (j % i == 0) {
					a[j] = 0;
				}
			}
		}
		for (int i = 0; i < 100; i++) {
			if (a[i] != 0) {
				System.out.print(a[i] + " ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("문제번호 입력 (1~17). 종료는 0.");
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
			} else if (input == 0) {
				System.out.println("종료");
				break;
			} else {
				System.out.println("Error");
			}
		}
	}
}