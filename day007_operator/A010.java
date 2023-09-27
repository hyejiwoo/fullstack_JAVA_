package com.company.day007_operator;

import java.util.Scanner;

public class A010 {
	public static void main(String[] args) {
		// 숫자 입력 받아서 절대값
		// GIGO
		Scanner scanner = new Scanner(System.in);
		int input = 0, result = 0;

		System.out.println("숫자한개입력  >");
		input = scanner.nextInt();

		result = (input < 0) ? -input : input;
		System.out.println("입력한 값 :" + input);
		System.out.println("절대값 :" + result);

		// 내 코드 System.out.println("절대값 :" + ((input>10) ? "-10" : "10"));

	}
}
