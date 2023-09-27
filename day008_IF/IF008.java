package com.company.day008_IF;

import java.util.Scanner;

public class IF008 {
	public static void main(String[] args) {
		//GIGO 
		//변수 
		Scanner scanner = new Scanner(System.in);
		char ch ='\u0000'; //' ';
		String result = "기타";
		//입력 
		System.out.println("알파벳을 입력하시오 >");
		ch = scanner.next().charAt(0);
		//처리 
		if(ch >= 'A' && ch <= 'Z') {result ="대문자";}
			else if(ch >= 'a' && ch <= 'a') {result ="소문자";}
			
			result = ch >= 'A' && ch <= 'Z'?"대문자" :
					 ch >= 'a' && ch <= 'z'?"소문자" : result;
		//출력
				System.out.println(ch + "는" + result);
		
	}
}
