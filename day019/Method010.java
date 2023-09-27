package com.company.day019;

import java.util.Scanner;

public class Method010 {
	public static void main(String[] args) {
		//대문자를 소문자로
		
			//입력
			char ch = 'A';
			Scanner scanner = new Scanner(System.in);
			
			//출력
			System.out.println("소문자 변환 프로그램입니다. \n 문자 입력 >");
			ch = scanner.next().charAt(0);
			char res =lower(ch);
			System.out.println(res);		//'a'
	
	}
	public static char lower(char a) {
		if(a == 0) {
			System.out.print(a);
		} else if (0 < a && 1< a + 1) {
			System.out.print(a);
		}
		return a;
	}
}
