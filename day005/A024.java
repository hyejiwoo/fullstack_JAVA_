package com.company.day005;

import java.util.Scanner;

public class A024 {
	public static void main(String[] args) {
		String str = " ";
		char c = '\u0000';

		Scanner scanner = new Scanner(System.in);

		System.out.print("1. abc를 입력해주세요. >" + str);
		str = scanner.next();
		System.out.println("첫번째 문자 >" + str.charAt(0));
		System.out.println("두번째 문자 >" + str.charAt(1));
		System.out.println("세번째 문자 >" + str.charAt(2));

		char ch = ' ';
		System.out.print("2. 타입을 선택해 주세요! (A/B)" + ch);
		ch = scanner.next().charAt(0);
		System.out.println(ch + "타입");

//		쌤 코드
		// GIGO
		// 변수
		// String str ="";
		// char ch ='\u0000';
		// Scanner scanner = new Scanner(System.in);

		// 입력 + 처리 + 출력 (1) 문자열입력
//		System.out.print("1. abc를 입력해주세요. >" + str);
//		str = scanner.next();		
//		System.out.println("첫번째 문자 >" + str.charAt(0));
//		System.out.println("두번째 문자 >" + str.charAt(1));
//		System.out.println("세번째 문자 >" + str.charAt(2));

		// 입력 + 처리 + 출력 (2) 문자 입력
		// System.out.print("2. 타입을 선택해 주세요! (A/B)");
		// ch = scanner.next().charAt(0);
		// System.out.println(ch + "타입");
	}
}
