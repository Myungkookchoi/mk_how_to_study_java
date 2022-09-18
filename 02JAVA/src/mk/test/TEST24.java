package mk.test;

public class TEST24 {

	public static void main(String[] args) {
		int a = 0;
		System.out.println("01");
		if (a == 0) {
			for (int i = 0; i < 3; i++) {
				System.out.println("07");
				if (i == 1) {
					for (int j = 0; j < 3; j++) {
						System.out.println("08");
					}
				}
				System.out.println("06");

				if (i == 2) {
					for (int j = 0; j < 3; j++) {
						System.out.println("05");
					}
				}
				System.out.println("02");
			}
			System.out.println("09");
		}

		System.out.println("위는 왼쪽이미지 ===================== 아래는 오른쪽이미지");
		int i = 0;
		System.out.println("01");
		for (i = 0; i < 3; i++) {
			System.out.println("04");
			for (int j = 0; j < 3; j++) {
				System.out.println("03");
				for (int x = 0; x < 3; x++) {
					System.out.println("07");
				}
				System.out.println("06");
			}
			System.out.println("02");
		}
		System.out.println("05");
	}
}
