package mk.test;

import java.util.Scanner;

class evr {
	public double kor = 0;
	public double eng = 0;
	public double math = 0;

	public evr(double kor, double eng, double math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public void ever() {
		System.out.println("총점 : " + (kor + eng + math));
		System.out.println("평균 : " + (kor + eng + math) / 3);
	}
}

public class TEST31_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수 >>");
		double kor = Double.parseDouble(sc.nextLine());
		System.out.println("영어 점수 >>");
		double eng = Double.parseDouble(sc.nextLine());
		System.out.println("수학 점수 >>");
		double math = Double.parseDouble(sc.nextLine());
		evr e1 = new evr(kor, eng, math);
		e1.ever();
		sc.close();
	}
}
