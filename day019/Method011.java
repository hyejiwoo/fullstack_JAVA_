package com.company.day019;

import java.util.Scanner;

public class Method011 {
	public static void main(String[] args) {
		//대문자를 소문자로
		
			//입력
			char ch = 'A';
			char transText = ' ';
			Scanner scanner = new Scanner(System.in);
			
			//출력
			System.out.println("소문자 변환 프로그램입니다. \n 문자 입력 >");
			ch = scanner.next().charAt(0);
			
			transText(scanner.next().charAt(0));

	}

	private static void transText(char a) {
		System.out.println("입력받은 문자 : " + "변환된 문자 : ");};
	
}


