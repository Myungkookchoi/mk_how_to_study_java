package mk.test;

import java.util.Arrays;
import java.util.Scanner;

public class TEST20 {
	public static void Q1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.배열에 5개의 숫자를 입력받아 넣은 다음 숫자 하나를 입력받아 해당 숫자가 몇번째\r\n" + "인덱스에 들어 있는지 출력하는 프로그램을 만들어 보자.");
		int a[] = new int[5];
		int i = 0;
		for (; i < a.length; i++) {
			System.out.println("입력 >>");
			int input = sc.nextInt();
			a[i] = input;
		}
		System.out.println(Arrays.toString(a));

		System.out.println("확인 할 숫자 입력 >>");
		int input = sc.nextInt();

		for (i = 0; i < a.length; i++) {
			if (a[i] == input) {
				System.out.println(i + 1 + "번째에 있습니다.");
				break;
			}
		}
		sc.close();
	}

	public static void Q2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("2.배열에 5개의 숫자를 입력받아 넣은 다음 숫자 하나를 입력받아 해당 숫자가 몇번째\r\n" + "인덱스에 들어 있는지 출력하는 프로그램을 만들어 보자.");
		int a[] = new int[5];
		int i = 0;
		for (; i < a.length; i++) {
			System.out.println("입력 >>");
			int input = sc.nextInt();
			a[i] = input;
		}
		System.out.println(Arrays.toString(a));

		System.out.println("확인 할 숫자 입력 >>");
		int input = sc.nextInt();

		for (i = 0; i < a.length; i++) {
			if (a[i] == input) {
				System.out.println(i + "인덱스에 있습니다.");
				break;
			}
		}
	}

	public static void Q3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("3.배열 크기를 입력받아 배열 크기 만큼 1,2,3,1,2,3,1,2,3 … 숫자를 순서대로 배열안에\r\n" + "넣은 다음 배열의 내용을 출력해 보자.");
		int input = sc.nextInt();
		int arr[] = new int[input];
		int j = 0;
		for (int i = 0; i < arr.length; i++) {

			if (i % 3 == 1) {
				j = 2;
			} else if (i % 3 == 2) {
				j = 3;
			} else if (i % 3 == 0) {
				j = 1;
			}
			arr[i] = j;
		}
		System.out.println(j);
		System.out.println(Arrays.toString(arr));
		sc.close();
	}

	public static void Q4() {
		System.out.println("4.배열에 들어있는 내용을 정순과 역순으로 저장하는 새로운 배열을 만들어 출력해 보자.\r\n"
				+ "ex)배열에 1,2,3이 들어 있으면 1,2,3,3,2,1 이 들어 있는 배열\r\n"
				+ "ex)배열에 7,15,23,15,23 이 들어 있으면 23,15,23,15,7,7,15,23,15,23 이 들어 있는\r\n" + "배열");
		boolean t = true;
		while (t) {
			Scanner sc = new Scanner(System.in);
			System.out.println("정순 or 역순 을 입력해주세요. 종료는 종료를 입력해주세요.");
			String input = sc.next();
			if (input.equals("정순")) {
				System.out.println("배열의 크기를 정해주세요.");
				int arrsize = sc.nextInt();
				int arr[] = new int[arrsize];
				for (int i = 0; i < arr.length; i++) {
					System.out.println("배열 안 에 넣을 숫자를 입력 해 주세요.");
					System.out.print(i + 1 + "번째 숫자 >>");
					int arrnumber = sc.nextInt();
					arr[i] = arrnumber;
				}
				int rearr[] = new int[(arr.length * 2)];
				for (int i = 0, j = 0; j < arr.length; i++, j++) {
					rearr[j] = arr[i];
				}
				for (int i = arr.length - 1, j = arr.length; i >= 0; i--, j++) {
					rearr[j] = arr[i];
				}
				System.out.println(" ");
				System.out.println(Arrays.toString(arr));
				System.out.println(Arrays.toString(rearr));

			} else if (input.equals("역순")) {
				System.out.println("배열의 크기를 정해주세요.");
				int arrsize = sc.nextInt();
				int arr[] = new int[arrsize];
				for (int i = 0; i < arr.length; i++) {
					System.out.println("배열 안 에 넣을 숫자를 입력 해 주세요.");
					System.out.print(i + 1 + "번째 숫자 >>");
					int arrnumber = sc.nextInt();
					arr[i] = arrnumber;
				}
				int rearr[] = new int[(arr.length * 2)];
				for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
					rearr[j] = arr[i];
				}
				for (int i = 0, j = rearr.length - arr.length; j < rearr.length; i++, j++) {
					rearr[j] = arr[i];
				}
				System.out.println(Arrays.toString(arr));
				System.out.println(Arrays.toString(rearr));
			} else if (input.equals("종료")) {
				System.out.println("종료");
				break;
			} else {
				System.out.println("Error");
				continue;
			}
			sc.close();
		}
	}

	public static void Q5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("5.컴퓨터에서 주사위던지는 프로그램을 구현하였을때 던져서 나온수의 빈도(회수)를 구하는\r\n" + "프로그램을 작성해 보자.");
		int dice[] = new int[6];
		int diceeyes[] = { 1, 2, 3, 4, 5, 6 };
		int i = 0;
		while (i != 9) {
			System.out.println("주사위 굴리기 : 1, 종료 : 0");
			int input = sc.nextInt();
			if (input == 1) {
				int random = (int) (Math.random() * 6 + 1);
				if (random == 1) {
					dice[0] = dice[0] + 1;
					System.out.println("주사위 결과 : " + random);
				} else if (random == 2) {
					dice[1] = dice[1] + 1;
					System.out.println("주사위 결과 : " + random);
				} else if (random == 3) {
					dice[2] = dice[2] + 1;
					System.out.println("주사위 결과 : " + random);
				} else if (random == 4) {
					dice[3] = dice[3] + 1;
					System.out.println("주사위 결과 : " + random);
				} else if (random == 5) {
					dice[4] = dice[4] + 1;
					System.out.println("주사위 결과 : " + random);
				} else if (random == 6) {
					dice[5] = dice[5] + 1;
					System.out.println("주사위 결과 : " + random);
				}
				System.out.println("주사위 눈 :			" + Arrays.toString(diceeyes));
				System.out.println("주사위 눈 나온 횟수 :		" + Arrays.toString(dice));
				System.out.println(" ");
			} else if (input == 0) {
				System.out.println("종료");
				break;
			} else {
				System.out.println("Error");
				continue;
			}
		}
		System.out.println("=======================결 과=======================");
		System.out.println("주사위 눈 :			" + Arrays.toString(diceeyes));
		System.out.println("주사위 눈 나온 횟수 :		" + Arrays.toString(dice));
		System.out.println("==================================================");
		sc.close();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean a = true;
		while (a) {
			System.out.println("문제 번호 입력(1~5), 종료는 0");
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
			} else if (input == 0) {
				System.out.println("종료");
				a = false;
			} else {
				System.out.println("Error");
			}
			sc.close();
		}
	}
}
