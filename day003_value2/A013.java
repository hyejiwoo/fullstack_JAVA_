package com.company.day003_value2;

import java.util.Scanner;

public class A013 {
	public static void main(String[] args) {
		// 정수형 입력 연습_더하기 프로그램
		// GIGO
		// 변수
		// 변수 이름 num1, num2
		int A = 0;
		int B = 0;
		int result = 0;
		Scanner scanner = new Scanner(System.in); // 가비지 콜렉터 -> 안 쓰면 버려

		// 입력
		System.out.println("숫자1 입력>");
		A = scanner.nextInt();
		System.out.println("숫자2 입력>");
		B = scanner.nextInt();

		// 처리
		result = A + B;

		// 출력
		System.out.println(A + "+" + B + "=" + result); // 방법 1

		System.out.printf("%d + %d = %d", A, B, result); // 방법 2
	}
}
