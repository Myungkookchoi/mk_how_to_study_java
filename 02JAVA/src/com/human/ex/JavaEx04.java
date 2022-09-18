package com.human.ex;

import java.util.Scanner;

public class JavaEx04 {

	public static void Q1() {
		System.out.println("문제1――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――");
		System.out.println("boolean b=true;");
		System.out.println("int i=1;");
		System.out.println("short s=2;");
		System.out.println("char c='a';");
		System.out.println("float f=1.234; //1 -> 1.234f 1.234를 float로 형변환");
		System.out.println("short s2=s+c; //2 -> (short)(s+c) s+c를 (short)으로 형변환 ");
		System.out.println("short s3=s+s; //3 -> (short)(s+s) s+s를 (short)으로 형변환");
		System.out.println("char c2=c+s; //4 -> (char)(c+s) c+s를 (char)로 형변환");
		System.out.println("int i2=c+s; //5 -> 이상없음");
		System.out.println("int i3=b+i; //6 -> boolean은 연산불가");
		
		System.out.println("――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――");
	}
	public static void Q2() {
		System.out.println("문제2――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――");
		System.out.print("(1) 3+3+\"hello\" -> ");
		System.out.println(3+3+"hello");
		System.out.println("3+3 이 먼저 계산되고 뒤에 문자열이 붙는다");
		System.out.println("(2) 3*\"hello\" -> 오류.");
		System.out.println("숫자와 문자열을 이을때에는 + 사용해야함");
		System.out.print("(3) \"hello\"+4+4 -> ");
		System.out.println("hello"+4+4);
		System.out.println("문자가 먼저 나왔기 때문에 이후는 다 문자열로 인식");
		
		
		System.out.println("――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――");
	}
	public static void Q3() {
		System.out.println("문제3――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――");
		
		System.out.println("int a=\"10\" 과 double d=(double) \"123.3\";");
		System.out.println("두 경우 다 문자열을 정수나 실수변수에 담으려고 하여 오류.");
		
		System.out.println("――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――");
	}
	public static void Q4() {
		System.out.println("문제4――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――");
		String name="홍길동";
		int age=5;
			
		System.out.println("이름은 "+name+" 나이는 "+age+" 입니다");
		System.out.println("――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――");
	}
	public static void Q5() {
		System.out.println("문제5――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――");
		char a='a'+1;
		System.out.println(a);
		System.out.println("'a'+1의 결과는 int형 또는 char형에 저장해야 한다");
		System.out.println("――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――");
	}
	public static void Q6() {
		System.out.println("문제6――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――");
		
		System.out.println(2.0+1.0/2.0);
		System.out.println("(1) 2.0+1.0/2.0 결과의 자료형은 double");
		System.out.println("(2) 4.2/2+1 결과의 자료형은 double");
		System.out.println("(3) 5+4/5 결과의 자료형은 int");
		System.out.println("(4) 1+2/3d 결과의 자료형은 double");
		System.out.println("――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――");
	}
	public static void Q7() {
		System.out.println("문제7――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――");
		System.out.println("boolean : TRUE, FALSE [1byte]");
		System.out.println("byte : -127 ~ 128 [1byte]");
		System.out.println("short : -32768 ~ 32767 [2byte]");
		System.out.println("int : -2147483648 ~ 2147483647 [4byte]");
		System.out.println("long : -9223372036854775808 ~ 9223372036854775807 [8byte]");
		System.out.println("float : -3.4E38 ~ +.4E38 [4byte]");
		System.out.println("double : -1.7E308 ~ 1.7E308[8byte]");
		System.out.println("char : 유니코드문자 [2byte]");
		
		System.out.println("――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――");
	}

	public static void Q8() {
		System.out.println("문제8――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――");
		System.out.println("10 11 0xB 013 012 값이 같은것끼리 짝짓기");
		System.out.println("10 과 0xB");
		System.out.println("11 과 013");
		
		System.out.println("――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――");
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int qNumber=1;
		while(qNumber != 0) {
			System.out.println("문제번호입력(1~5) 종료는0");
			qNumber=scanner.nextInt();
			if(qNumber==1)
				Q1();
			else if(qNumber==2)
				Q2();
			else if(qNumber==3)
				Q3();
			else if(qNumber==4)
				Q4();
			else if(qNumber==5)
				Q5();
			else if(qNumber==6)
				Q6();
			else if(qNumber==7)
				Q7();
			else if(qNumber==8)
				Q8();
			else if(qNumber==0)
				break;
			else {
				System.out.println("잘못된 입력");
			}
				
		}
		

	}

}
