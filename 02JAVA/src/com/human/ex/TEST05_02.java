package com.human.ex;

import com.human.dto.Subway;

public class TEST05_02 {

//현실세계의 데이터를 기본자료형 변수에 넣어서 출력해보고 클래스를 업그레이드 해보자.
//핸드폰, 자동차, 가방 등등... 2개 해보자.

	public static void Subway() {

		int s1 = 1;
		String c1 = "Blue";
		String st1 = "서울역";
		System.out.println(s1 + "호선 입니다.");
		System.out.println("Color is" + c1);
		System.out.println(s1 + "호선에는 " + st1 + "이 있습니다");

		int s2 = 2;
		String c2 = "Green";
		String st2 = "강남역";
		System.out.println(s2 + "호선 입니다.");
		System.out.println("Color is" + c2);
		System.out.println(s2 + "호선에는 " + st2 + "이 있습니다");

		int s3 = 3;
		String c3 = "Orange";
		String st3 = "양재역";
		System.out.println(s3 + "호선 입니다.");
		System.out.println("Color is" + c3);
		System.out.println(s3 + "호선에는 " + st3 + "이 있습니다");

		int s4 = 4;
		String c4 = "Sky";
		String st4 = "과천역";
		System.out.println(s4 + "호선 입니다.");
		System.out.println("Color is" + c4);
		System.out.println(s4 + "호선에는 " + st4 + "이 있습니다");
	}

	public static void main(String[] args) {
		Subway s1 = new Subway();
		s1.number = 1;
		s1.color = "Blue";
		s1.station = "서울역";

		Subway s2 = new Subway();
		s2.number = 2;
		s2.color = "Green";
		s2.station = "강남역";

		Subway s3 = new Subway();
		s3.number = 3;
		s3.color = "Orange";
		s3.station = "양재역";

		Subway s4 = new Subway();
		s4.number = 4;
		s4.color = "Sky";
		s4.station = "과천역";

		System.out.println(s1.number + "호선");
		System.out.print("Color is " + s1.color + "\t");
		System.out.println(s1.number + "호선에는 " + s1.station + "이 있습니다");

		System.out.println(s2.number + "호선");
		System.out.print("Color is " + s2.color + "\t");
		System.out.println(s2.number + "호선에는 " + s2.station + "이 있습니다");

		System.out.println(s3.number + "호선");
		System.out.print("Color is " + s3.color + "\t");
		System.out.println(s3.number + "호선에는 " + s3.station + "이 있습니다");

		System.out.println(s4.number + "호선");
		System.out.print("Color is " + s4.color + "\t");
		System.out.println(s4.number + "호선에는 " + s4.station + "이 있습니다");
	}
}
