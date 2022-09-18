package mk.home.online;

import java.util.Arrays;

import mk.home.dto.Human;

public class MyClass02 {

	public static void main(String[] args) {

		int arr1[] = new int[5];
		int[] arr2 = new int[5];
//		int[] arr3;
//		arr3 = new int[5];
//		int arr[] = { 0, 0, 0, 0, 0, };

		// int arr5[];
		// arr[]5={0,0,0,0,0};

		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		arr1[3] = 40;
		arr1[4] = 50;
		// arr1[5]=10;

		// arr1[인덱스] 이런 형태 하나가 변수 하나랑 동일함
//		int sum = arr1[1] + arr[4] + 10;
		arr1[0] = arr1[1] + arr1[2];

		arr2[0] = arr1[0];
		arr2[1] = arr1[1];
		arr2[2] = arr1[2];
		arr2[3] = arr1[3];
		arr2[4] = arr1[4];

		System.out.println(arr2[0]);
		System.out.println(java.util.Arrays.toString(arr2));

		double arrDouble[] = new double[3];
		arrDouble[0] = 1.1;
		arrDouble[1] = 1.2;
		arrDouble[2] = 1.3;

		System.out.println(java.util.Arrays.toString(arrDouble));

		Human arrHuman[] = new Human[3];
		arrHuman[0] = new Human();
		arrHuman[0].age = 10;

		arrHuman[1] = new Human("홍길동", 5, 12);
		arrHuman[2] = new Human();

		System.out.println(Arrays.toString(arrHuman));

	}

}