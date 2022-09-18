package mk.alone.making;

import java.util.Arrays;
import java.util.Scanner;

public class MyClass_Arrays_While {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int home[] = new int[9];
		int away[] = new int[9];
		home[0] = 1;
		away[0] = 2;
		System.out.println(home[0]);
		System.out.println(away[0]);
		
//		int retrun = 0;
//		int i = 0;
//		for (i = 0; i < 9; i++) {
//			int input = sc.nextInt(); // method input
//			home[i] = input;
//			System.out.print("Home TEAM : ");
//			System.out.println(Arrays.toString(home)); // [1, 2, 3]
//			continue;
//		}
//		for (int count = 0; count < 9; count++) { // 배열 안 에 있는 수들의 합.
//			retrun = retrun + home[count];
//		}
//		System.out.print("Home TEAM : ");
//		System.out.print(Arrays.toString(home)); // [1, 2, 3]
//		System.out.println(" 총점 : " + retrun);

	}

}

//System.out.println(Arrays.toString(a)); // [0, 0, 0]
//for (int count = 0; count < 5; count++) {
//	a[count] = count + 1; // arr[i] 에서 i값 증가
//}
//System.out.println(Arrays.toString(a)); // [1, 2, 3]

//System.out.println(a[count]);	// a[0], a[1], a[2] 값 출력 => 1 2 3

//for (int count = 0; count < 3; count++) {
//b = b + home[count];
//}
//System.out.print("Home TEAM : ");
//System.out.print(Arrays.toString(home)); // [1, 2, 3]
//System.out.println(" 총점 : " + b);