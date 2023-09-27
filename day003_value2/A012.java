package com.company.day003_value2;

import java.util.Scanner;

public class A012 {
	public static void main(String[] args) {
		// 정수형 입력 연습_년도
		// GIGO
		// 변수
		int y = 0;
		Scanner scanner = new Scanner(System.in);

		// 입력
		System.out.print("올해 년도를 입력해주세요>");
		y = scanner.nextInt();

		// 처리
		// 출력
		System.out.println("올해는" + y + "년도입니다.");
	}
}
