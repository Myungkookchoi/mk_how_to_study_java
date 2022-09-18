package mk.alone.study;

public class MyClass_while_for_dowhile {
	public static void main(String[] args) {
		int i = 0;
		int a = 3;
		int b = 2;

		// while 문
		i = 1;
		while (!(i % a == 0 && i % b == 0)) {
			i++;
		}
		System.out.println(i);

		// for문
		for (i = 1; !(i % a == 0 && i % b == 0); i++) {
		}
		System.out.println(i);

		// do while 문
		i = 0;
		do {
			i++;
		} while (!(i % a == 0 && i % b == 0));
		System.out.println(i);
		
	}	
}
