package com.company.day003_value2;

import java.util.Scanner;

public class A011 {
	public static void main(String[] args) {
		// 정수형 입력 연습_나이
		// GIGO
		// 변수
		int age = 0;
		Scanner scanner = new Scanner(System.in);

		// 입력
		System.out.println("당신의 나이는?>");
		age = scanner.nextInt();

		// 처리
		// 출력
		System.out.println("당신의 나이는" + age + "살 입니다.");

	}
}
