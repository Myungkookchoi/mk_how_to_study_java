package mk.alone.study;

public class MyClass_Function {
	public static int sum(int a, int b) {
		int sum = 0;
		sum = a + b;
		return sum;
	}

	public static void main(String[] args) {
		int a = sum(1, 2);
		int b = a + sum(2, 2);
		System.out.println(a + b);
	}
}
