package com.company.day009_IF_SWITCH;

import java.util.Scanner;

public class switch002 {
	public static void main(String[] args) {
		int a = 0;
		String result ="해당사항 없음";
		/*default 생략시 "해당사항 없음"이라고 적기.*/
//		default : result = "해당사항 없음"; break;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자 1개 입력받기 >");
		a = scanner.nextInt();
		
		switch ( a ) {	/* 대상 */
		case 3 : result = "봄이다."; break;	/* case 대상의 상태; 처리; break; */
		case 6 : result = "여름이다."; break;
		case 9 : result = "가을이다."; break;
		case 12 : result = "겨울이다."; break;
		}
		System.out.println(result);
		
	}
}
