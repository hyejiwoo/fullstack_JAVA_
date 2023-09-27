package com.company.day004;

import java.util.Scanner;

public class A019 {
	public static void main(String[] args) {
		// GIGO
		// 변수
		int enum1 = 0, enum2 = 0;
		float result = 0.0f;
		Scanner scanner = new Scanner(System.in);
		
		// 입력
		System.out.println("숫자 1 입력>");
		enum1 = scanner.nextInt();
		System.out.println("숫자 2 입력>");
		enum2 = scanner.nextInt();

		// 처리
		result = (float) enum1 + enum2; // 정수/정수=정수(몫) 10/3=3
		// 소수점나오게 = 3 3.0

		// 출력
		System.out.println(enum1 + "/" + enum2 + "=" + result);
		// System.out.print("10/3"+"="+ result);
		// System.out.println("%d / %d = %.7f\n" , enum1, enum2, result);
	}
}
