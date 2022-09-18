package mk.alone.study;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Numbering_Comma {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("###,###");
		Scanner sc = new Scanner(System.in);
		System.out.println("금액을 입력해주세요.(단위 : 원)");
		int a = sc.nextInt();
		String b = df.format(a);
		System.out.println(b);
		sc.close();
	}
}
