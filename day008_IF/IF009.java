package com.company.day008_IF;

import java.util.Scanner;

public class IF009 {
	public static void main(String[] args) {
		//GIGO 
		//변수 
		char ch ='\u0000' , result ='\u0000';//' ';
		Scanner scanner = new Scanner(System.in);
		//입력 
		System.out.println("알파벳을 입력하시오 >");
		ch = scanner.next().charAt(0);
		//처리 
		/*
		 * ver1 
		 * if(대문자의 범위라면){ 소문자로 변환}
		 * else if (소문자의 범위라면){소문자로 변환
		 * */
		
		/* ver1 */	
		if(ch >= 'A' && ch <= 'Z') 
		{result = (char) (ch + ('a'-'A'));}
// 			a(97) = A(65) + 32
//			{ch += ('a' - 'A');} //형변환 필요 없음!
	else if(ch >= 'a' && ch <= 'a') 
//			a(65) = A(97) + 32 //형변환 필요!
		{result = (char) (ch - ('a'-'A'));}
		
	
//			result = ch >= 'A' && <='Z'?
//				(char) (ch+ ('a'-'A')):
//					(char) (ch -('a'-'A'));
		//출력
		System.out.println("입력받는 문자는 " +ch +"변환문자"+result);
	}
}
