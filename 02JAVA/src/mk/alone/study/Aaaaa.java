package mk.alone.study;

public class Aaaaa {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i == 3 || i == 6 || i == 9) {
				System.out.print("짝");
			}
			for (int j = 0; j < 10; j++) {
				if (j == 3 || j == 6 || j == 9) {
					System.out.print("짝");
				}
				for (int x = 0; x < 10; x++) {
					if (x == 3 || x == 6 || x == 9) {
						System.out.print("짝");
					}
					System.out.println(i + "" + j + "" + x);
				}
			}

		}
	}
}