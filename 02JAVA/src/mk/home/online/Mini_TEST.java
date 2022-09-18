package mk.home.online;

public class Mini_TEST {

	public static void main(String[] args) {
		int i = 0;
		System.out.println("01");
		for (i = 0; i < 3; i++) {
			System.out.println("04");
			if (i == 2) {
				for (int j = 0; j < 3; j++) {
					System.out.println("03");
				}
			}
			System.out.println("02");
		}
		System.out.println("05");
	}
}
