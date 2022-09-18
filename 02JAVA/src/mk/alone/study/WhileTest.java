package mk.alone.study;

public class WhileTest {
	public static void main(String[] args) {
		{
			int i = 0;
			while (i < 4) {
				System.out.println("안녕");
				i++;
			}
		}
		{
			int i = 0;
			while (i < 4) {
				i++;
				System.out.println(i);
			}
		}
		{
			int i = 0;
			int sum = 0;
			while (i < 10) {
				i++;
				sum = sum + i;
			}
			System.out.println(sum);
		}
		{
			int sum4 = 0;
			int c = 8;
			while (c < 20) {
				c++;
				if (c % 2 == 1) {
					sum4 = sum4 + c;
				}
			}
			System.out.println(sum4);
		}
	}

}
