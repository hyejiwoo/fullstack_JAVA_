package com.company.day004;

import java.util.Scanner;

public class homework_Day004 {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		float result = 0.0f;

		Scanner scanner = new Scanner(System.in);

		System.out.print("숫자 1 입력>");
		num1 = scanner.nextInt();
		System.out.print("숫자 2 입력>");
		num2 = scanner.nextInt();

		result = num1 + num2;
		System.out.print(num1 + "/" + num2 + "=" + result);
	}
}
