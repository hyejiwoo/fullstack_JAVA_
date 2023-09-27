package com.company.day011_For;

import java.util.Scanner;

public class For015_2 {
	public static void main(String[] args) {
		// 변수
		int num1 = -1, num2 = -1;
		char op = '\u0000';
		String result = "";
		Scanner scanner = new Scanner(System.in);

		// 입력 + 처리 + 출력
		for (;;) { // 1-1 무한반복 1-2 조건 아니면 처리
			if (num1 < 0 || num1 > 100) {
				System.out.print("1. 정수를 하나 입력 (0~100 사이) > ");
				num1 = scanner.nextInt();
			} else if (num2 < 0 || num2 > 100) {
				System.out.print("2. 정수를 하나 입력 (0~100 사이) > ");
				num2 = scanner.nextInt();
			} else if (!(op == '+' || op == '-' || op == '*' || op == '/'));

			{
				System.out.print("3. 연산자를 입력 (+, -, *, /) > ");
				op = scanner.next().charAt(0);
			}
			{
				break;
			}

		}
		// 처리

		result += " " + num1 + op + num2 + "=";

		switch (op) {
		case '+':
			result += num1 + num2;
			break;
		case '-':
			result += num1 - num2;
			break;
		case '*':
			result += num1 * num2;
			break;
		case '/':
			result += String.format("%.2f", num1 / num2);
			break;
		}

		System.out.println(result);

	}
}