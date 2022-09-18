package mk.alone.making;

import java.util.Arrays;
import java.util.*;

public class Lotto {
//숫자 6개
	public static void L2() {
		int wh = 0;
		while (wh < 5) {
			int a = (int) (Math.random() * 45 + 1);
			int b = (int) (Math.random() * 45 + 1);
			int c = (int) (Math.random() * 45 + 1);
			int d = (int) (Math.random() * 45 + 1);
			int e = (int) (Math.random() * 45 + 1);
			int f = (int) (Math.random() * 45 + 1);
			int arr[] = { a, b, c, d, e, f };
			if (a != b && a != c && a != d && a != e && a != f && b != c && b != d && b != e && b != f && c != d
					&& c != e && c != f && d != e && d != f && e != f) {
				int temp = 0;
				for (int i = 0; i <= 6; i++) {
					for (int j = 0; j < 5; j++) {
						if (arr[j] > arr[j + 1]) {
							temp = arr[j];
							arr[j] = arr[j + 1];
							arr[j + 1] = temp;
						}
					}
				}
				System.out.println(Arrays.toString(arr));
			} else {
				System.out.println("Error");
				System.out.println(Arrays.toString(arr));
			}
			wh++;
		}
	}

	public static void L1(int input) {
		int x = input;
		while (x > 0) {
			int arr[] = new int[6];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = (int) (Math.random() * 45) + 1;
				for (int j = 0; j < i; j++) {
					if (arr[i] == arr[j]) {
						i--;
					}
				}
			}
			int temp = 0;
			for (int a = 0; a <= 6; a++) {
				for (int b = 0; b < 5; b++) {
					if (arr[b] > arr[b + 1]) {
						temp = arr[b];
						arr[b] = arr[b + 1];
						arr[b + 1] = temp;
					}
				}
			}
			System.out.println(Arrays.toString(arr));
			x--;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("추출 갯수 입력 :");
		int input = sc.nextInt();
		L1(input);
		sc.close();
	}
}
