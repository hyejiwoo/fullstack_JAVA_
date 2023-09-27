package com.company.day005;

import java.util.Scanner;

public class A023 {
	public static void main(String[] args) {
		// 1. 문자 초기화
		// char ch1 =''; error 공백한개라도 있어야 함.
		char ch1 = ' ';
		char ch = '\u0000';
		ch = 'A'; // 저장시에는 숫자, 출력은 문자
		System.out.println(ch); // 'A'
		System.out.println((int) ch); // 65

		// #2 . 문자의 연산 (int 작은 형 - byte, short, char)
		System.out.println(++ch); // A++, 문자 1개 증가, B
		System.out.println(ch + 1); // 67
		// ch +1
		// 'A' +1
		// 'A'(char) +1(int)
		// 'A'(int:65) +1(int) 의 결과물은 int
		System.out.println((char) (ch + 1)); // 'C'

		// #3. 문자 - Scanner로 입력받기
		Scanner scanner = new Scanner(System.in);
		// char C = scanner.nextChar(); //X
		String str = "abc"; // str1000번지 <- 1000번지 ["abc"]
		str = "ab"; // str2000번지 <- 2000번지 ["ab"]
		str = "a";
		str = "";
		str = "abcd";

		System.out.println(str.charAt(0)); // a : 문자열 첫 번째 나옴
		System.out.println(str.charAt(1)); // b : 문자열 두 번째 나옴
		System.out.println(str.charAt(2)); // c : 문자열 세 번째 나옴
		System.out.println(str.charAt(3)); // d : 문자열 네 번째 나옴

		System.out.print("문자열(String) 입력> ");
		str = scanner.next();
		System.out.println("입력한 문자열 : " + str);

		System.out.print("문자(char) 입력> ");
		char c = scanner.next().charAt(0);
		// 문자열.char(0) //문자열에서 첫번째 문자만 뽑아주세요!
		System.out.println("입력한 문자 : " + c);

		// A024, 25, 26 ~ 게시판 확인!

	}// end main
}// end class