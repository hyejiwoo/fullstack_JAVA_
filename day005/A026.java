package com.company.day005;

import java.util.Scanner;

public class A026 {
	public static void main(String[] args) {
		//GIGO
		//변수
		String name = " ";
		char ban = '\u0000';
		Scanner scanner = new Scanner(System.in);

		//입력
		System.out.println("당신의 이름을 입력하시오 >");
		name = scanner.next();
		System.out.println("당신의 반을 입력하시오(A/B)");
		ban = scanner.next().charAt(0);

		//처리
		//출력
		System.out.println(":::::::::::::::::::::::::: USERINFO");
		System.out.println(":: NAME :" + name);
		System.out.println(":: CLASS :" + ban);
	}
}
