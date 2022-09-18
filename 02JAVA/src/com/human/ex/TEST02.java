package com.human.ex;

public class TEST02 {
	public static void main(String[] args) {
		//		문제1. 다음 코드를 보고 1~6번까지 각각 어떤 문제가 있는지 확인하여 설명해보고 문제가 발생하지 않도록 변경해 보자.
//		boolean b = true;
//		int i = 1;
//		short s = 2;
//		char c = 'a';
//		float f = 1.234; // 1 - float f = 1.234f; 으로 수정
//		short s2 = s + c; // 2 - short+char=int
//		short s3 = s + s; // 3 - short+short=int
//		char c2 = c + s; // 4 - char+short=int
//		int i2 = c + s; // 5 - 맞음
//		int i3 = b + i; // 6 - boolean형의 자동 형변환 및 강제 형변환이 불가능

		//		문제2. 다음 출력 결과가 무엇인지 확인해 보고 이유를 이야기해 보자. 
		//		 * 1) 3+3+“hello” 2) 3*“hello” 3)“hello”+4+4 +는 이항연산자로 왼쪽에서 오른쪽으로 2개 항씩 연산 된다.
//		System.out.println(3 + 3 + "hello"); // 1)출력값 == 6hello 이유)3+3=6, int형인 6과 문자열인"Hello"는 더하면 6"Hello"가 된다.
//		System.out.println(3 * "hello"); // 2) 출력값 == 없음. 이유)실수와 문자열을 곱할 수 없다.
//		System.out.println("hello" + 4 + 4);// 3)출력값 == hello44 이유)문자열+실수형=문자열이 되어서 "Hello44"가 된다
//
//		//		문제3. 잘못된 점을 설명하시오. int a=“10”; double d=(double) “123.3”;
//		int a = "10" // 정수형인 int에 문자열을 넣으면 안 된다. int a = 10; 으로 수정.
//		double d = (double) "123.3" // 실수형인 double에 문자열을 넣어서 안 된다. double d = (double) 123.3;으로 수정
//		
		//		문제4. String name= “홍길동”; int age=5 일때 변수에 값을 넣어서 다음과 같이 출력하는 프로그램을 만들어 보자.
		//		“이름은 홍길동 나이는 5 입니다.”
		
		{
			String name = "홍길동";
			int age = 5;
			System.out.println("이름은"+name+"나이는"+age+"입니다");
		}
		//		문제5. ‘a’+1의 결과는 어떤 자료형에 저장해야 되는가? 
		//		답)	int형 결과값은 98.
		
		//		문제6. 다음 계산결과 자료형의 결과는 어떤 자료형인가? 1) 2.0+1.0/2.0 2)4.2/2+1 3)5+4/5 4)1+2/3d
		//		답)	1) double형 2)double형 3)int형 4)double형
		
		//		문제7. 모든자료형을 기술하고 저장할수 있는데이터 종류와 크기를 설명해보자.
		//		답)	boolean(1byte) - 결과값은 true or false; 
		//			문자형 - char(2byte)
		//			정수형 - byte(1byte), short(2byte), int(4byte), long(8byte)
		//			실수형 - float(4byte), double(8byte)
		
		//		문제8. 다음중 값이 같은 것끼리 짝지어보자. 10 11 0xB 013 012
		//		답)	11 = 0xB = 013
		//			10 = 012
		
	}
}
