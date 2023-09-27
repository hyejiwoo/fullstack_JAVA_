package com.company.day009_IF_SWITCH;

import java.util.Scanner;

public class switch003 {
	public static void main(String[] args) {
		String result="";
		char fruit =' ';
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("a,b,c 중에 문자 1개 입력 >");
		fruit = scanner.next().charAt(0);
		
		switch( fruit ) {
		case 'a' : result = "apple"; break;
		case 'b' : result = "banana"; break;
		case 'c' : result = "coconut"; break;
		}
		System.out.println(result);
	}
}
