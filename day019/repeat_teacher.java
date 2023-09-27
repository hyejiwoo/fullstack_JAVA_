package com.company.day019;

import java.util.Scanner;

public class repeat_teacher {
	public static void main(String[] args) {
		//(1)
		char moon = ' ';
		String result = "끝";
		Scanner scanner = new Scanner(System.in);
	
		//;; 이거 꼭 확인(무한반복일때)
		for(; !(moon == '+' || moon == '-' || moon == '/' || moon == '*');) {
			System.out.println("+,-,*,/ 중 하나를 입력해주세요. >");
			moon = scanner.next().charAt(0);		
			}
		System.out.println(moon);

		//(2)
			
		//(3)
		
		//(4)
		
		//(5)
	
	}
}

