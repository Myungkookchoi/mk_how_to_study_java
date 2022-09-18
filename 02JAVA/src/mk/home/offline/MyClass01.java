package mk.home.offline;

import java.util.Arrays;

public class MyClass01 {
	public static int function3() {
		int r = 10;
		r += 11;
		return r;
	}

	public static int[] function6(int a[]) {
		int rValue[] = a;
		rValue[0] = 11;
		a[1] = 12;
		return rValue;
	}

	public static int[] function7(int a[]) {
		int rValue[] = new int[a.length];
		rValue[0] = a[0];
		rValue[1] = a[1];
		rValue[0] = 13;
		a[1] = 14;
		return rValue;
	}

	public static void main(String[] args) {
//		int a = function3();
//		System.out.println(a);
//		a++;
//		System.out.println(function3());
//		System.out.println(a);
		int arr[] = { 1, 2 };

		function6(arr);
		System.out.println(Arrays.toString(arr));

		int rArr[] = function7(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(rArr));

		rArr[1] = 9;
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(rArr));
	}

}
