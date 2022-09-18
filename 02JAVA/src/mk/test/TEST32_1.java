package mk.test;

import java.util.Scanner;

class Tv {

	public static Scanner sc = new Scanner(System.in);
	public boolean tv = true;
	public int ch = 1;
	public int vol = 5;

	public Tv() {

	}

	public void chChange() {
		boolean isChFlag = true;
		while (isChFlag) {
			System.out.println("현재 채널 : " + ch);
			System.out.println("1. 채널 올리기 2. 채널 내리기 3. 나가기");
			int input = Integer.parseInt(sc.nextLine());
			if (input == 1) {
				ch += 1;
				if (ch > 10) {
					ch = 1;
				}
				isChFlag = false;
			} else if (input == 2) {
				if (ch == 1) {
					ch = 10;
				} else {
					ch -= 1;
				}
				isChFlag = false;
			} else if (input == 3) {
				System.out.println("TV 화면으로 나갑니다.");
				isChFlag = false;
			} else {
				System.out.println("Error");
			}
		}
	}

	public void volChange() {
		boolean isVolFlag = true;
		while (isVolFlag) {
			System.out.println("현재 볼륨 : " + vol);
			System.out.println("1. 볼륨 올리기 2. 볼륨 내리기 3. 나가기 ");
			int input = Integer.parseInt(sc.nextLine());
			if (input == 1) {
				if (vol == 30) {
					System.out.println("현재 볼륨이 최대입니다.");
				} else {
					vol += 1;
				}
			} else if (input == 2) {
				if (vol == 0) {
					System.out.println("현재 볼륨이 최소입니다.");
				} else {
					vol -= 1;
				}
			} else if (input == 3) {
				System.out.println("TV 화면으로 나갑니다.");
				isVolFlag = false;
			} else {
				System.out.println("Error");
			}
		}
	}

	public void tvView() {
		while (tv) {
			System.out.println("1. 채널 변경 2. 볼륨 변경 3. TV끄기)");
			System.out.println("현재 채널 : " + ch);
			System.out.println("현재 볼륨 : " + vol);
			int input = Integer.parseInt(sc.nextLine());
			if (input == 1) {
				chChange();
			} else if (input == 2) {
				volChange();
			} else if (input == 3) {
				System.out.println("TV를 끕니다.");
				tv = false;
			} else {
				System.out.println("잘못입력");
			}
		}
	}
}

public class TEST32_1 {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("TV를 키시겠습니까? 1. YES 2.NO");
		int input = Integer.parseInt(sc.nextLine());
		if (input == 1) {
			Tv Tv = new Tv();
			Tv.tvView();
		} else {
			System.out.println("TV 안 보기.");
		}
	}
}
