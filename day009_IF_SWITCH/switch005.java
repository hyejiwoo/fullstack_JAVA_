package com.company.day009_IF_SWITCH;

import java.util.Scanner;

public class switch005 {
	public static void main(String[] args) {
		String result ="";
		char fruit = ' ';
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("문자 1개 입력 >");
		fruit = scanner.next().charAt(0);
		
		switch(fruit) {
		case 'a','A' : result = "APPLE"; break;
		case 'b','B' : result = "BANANA"; break;
		case 'c','C' : result = "COCONUT"; break;
		}
		System.out.println(result);
	}
}
