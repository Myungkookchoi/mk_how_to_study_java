package mk.alone.study;

public class LeastCommonMultiple {

	public static void main(String[] args) {
		// 두 수의 최소공배수
		int a = 33;
		int b = 22;

		int i = 2;
		boolean isFlag = true;
		int result = 0;
		while (isFlag) {
			if (i % a == 0 && i % b == 0) {
				result = i;
				isFlag = false;
			}
			i++;
		}
		System.out.println("최소공배수는 " + result);
		int c = ((a * b) / result);
		System.out.println("최대공약수는 " + c);
	}

}
