package com.company.day003_value2;

import java.util.Scanner;

public class A014 {
	public static void main(String[] args) {
		// GIGO
		// 변수
		float f = 0.0f;
		double d = 0.0; // #처리 기본단위가 들어있기 때문에 -f 넣지 않아도 오류 안 나;
		Scanner scanner = new Scanner(System.in);

		// 입력
		// 2. 실수는 정수보다 크다.
		System.out.println("실수 입력1 > "); // f = scanner.nextInt();
		f = scanner.nextFloat(); // 7

		System.out.println("실수 입력2 > ");
		d = scanner.nextDouble(); // 15

		// 처리
		// 출력
		System.out.println(f + "/" + d);

	}
}
