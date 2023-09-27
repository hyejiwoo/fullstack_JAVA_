package com.company.day009_IF_SWITCH;

import java.util.Scanner;

public class switch006 {
	public static void main(String[] args) {
		int jum = 0;
		String result = "";

		Scanner scanner = new Scanner(System.in);

		System.out.println("평균을 입력하시오 >");
		jum = scanner.nextInt();

		switch (jum / 10) {
		case 10:
		case 9:
			result = "수";
			break;
//		case 9, 10 : result = "수"; break;
		case 8:
			result = "우";
			break;
		case 7:
			result = "미";
			break;
		default:
			result = "가";
			break;
		}
		System.out.println(result);
	}
}
