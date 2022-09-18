package mk.alone.study;

import java.util.Arrays;

public class MyClass_Arrays {
	public static void main(String[] args) {
		// 배열 안에 6의 배수 10개를 넣은 다음 인덱스 순으로 출력.
		int arr[] = new int[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = 6 * i;
		}
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
