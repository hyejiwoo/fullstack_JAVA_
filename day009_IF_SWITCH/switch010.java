package com.company.day009_IF_SWITCH;

import java.util.Scanner;

public class switch010 {
	public static void main(String[] args) {
		int num1 = 0, num2 = 0;
		char op = ' ';
		String result1 = "";
//		double result2=0.0;

		Scanner scanner = new Scanner(System.in);

		System.out.println("1.정수을 하나 입력해주세요. >");
		num1 = scanner.nextInt();
		System.out.println("2.정수를 하나 입력해주세요. >");
		num2 = scanner.nextInt();
		System.out.println("3.연산자를 입력해주세요.(+,-,*,/)");
		op = scanner.next().charAt(0);

//		switch (num1) {
//		case 0 : result1 = num1 + num2; break;
//		case 1 : result1 = num1 - num2; break;
//		case 2 : result1 = num1 * num2; break;
//		case 3 : result2 = num1 / (double)num2; break;
//		}
//		System.out.println(result1);

		result1 += "" + num1 + op+ num2 + "=";
		switch (op) {
		case '+':
			result1 += num1 + num2;
			break;
		case '-':
			result1 += num1 - num2;
			break;
		case '*':
			result1 += num1 * num2;
			break;
		case '/':
			result1 += String.format("%.2f", (float) num1 / num2);
			break;
		}
		System.out.println(result1);

	}
}
