package com.company.day003_value2;

public class A008_2 {
	public static void main(String[] args) {
		// #4 char
		/*
		 * 저장시 : 문자 , 숫자 유니코드 입력 -> 유니코드표 -> 메모리저장[정수] 출력시 : 메모리에 저장된 정수값을 -> 유니코드표 ->
		 * 문자
		 */
		// #4-1. 문자
		char ch1 = 'A';
		char ch2 = '가';
		char ch3 = '0';
		System.out.println(ch1 + "\t" + ch2 + "\t" + ch3);

		// #4-2. 숫자 숫자를 넣어도 문자로 인식함
		char ch4 = 65;
		char ch5 = 0xac00; // 0x=가
		char ch6 = 49;
		System.out.println(ch4 + "\t" + ch5 + "\t" + ch6);

		// #4-3. 유니코드
		char ch7 = '\u0041';
		char ch8 = '\uac00';
		char ch9 = '\u0030';
		System.out.println(ch7 + "\t" + ch7 + "\t" + ch9);
		System.out.println((int) ch7 + "\t" + (int) ch8 + "\t" + (int) ch9);

		// #5. 참조형 - 문자열
		String str = "ABC"; // char ch1 ="A";
		// String : 클래스, " " : 주소 가지고 있음
		// str ["ABC"의 주소 ] <--- 1000번지 "ABC"
		System.out.println(str);

	}
}
