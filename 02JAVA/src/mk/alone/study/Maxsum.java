package mk.alone.study;

public class Maxsum {
	public static void main(String[] args) {
		// In Arrays Max number.
		int a[] = { 12, 1, 51, 3, 6, 8, 5 };
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println(max);
		System.out.println(a.length);
	}

}
