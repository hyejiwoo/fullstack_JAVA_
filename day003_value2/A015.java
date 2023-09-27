package com.company.day003_value2;

import java.util.Scanner;

public class A015 {
	public static void main(String[] args) {
		// GIGO
		// 변수
		float pie = 0f;
		Scanner scanner = new Scanner(System.in);

		// 입력
		System.out.println("pie값은 얼마입니까 >");
		pie = scanner.nextFloat();

		// 처리
		// 출력
		System.out.println("pie 값은" + pie + "입니다.");
	}
}
