package com.company.day005;

import java.util.Scanner;

public class A025 {
	public static void main(String[] args) {
		int a = 10, b = 3;
		char op = '+';
		Scanner scanner = new Scanner(System.in);

		// keyword:문자는 저장시 숫자, 출력시 문자
		System.out.println("q1) 대문자 B는 숫자로 변환" + (int) 'B');

		System.out.println("q2) 소문자 a는 숫자로 변환" + (int) 'a');

		System.out.println("q3) '  '는 숫자로 변환" + (int) ' ');

		System.out.println("q4) 'A' - 'a' " + ('A' - 'a')); // -32
		System.out.println('A' - 'a');

		// 1. int -> byte, short, char
		// 2. int 작은애들은 연산시 자동처리는 int
		// 3. 'A' - 'a' char-char => int-int
		// 4. 65-97 char-char => int-int
		System.out.println("q5) 대문자 A를 소문자 a" + (char) ('A' + 32));

		System.out.println("q5-1) 대문자 A를 소문자 a" + (char) ('A' + 32));
		// 1. 65를 97로 변환
		// 2. char + int = int
		// 3. int + int = int
		// 4. int + int = (char)int

		System.out.println("q5-2) 대문자 A를 소문자 a로 변환하기" + (char) ('A' + ('a' - 'A')));

		System.out.println("q6) 변수이용 10+3=13");

		System.out.println("" + a + op + b + "=" + (a + b));
		// 56 = 103
		// +의 두 가지 의미 1) 연산 2) 출력

	}
}
