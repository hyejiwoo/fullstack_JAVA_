package com.company.day008_IF;

import java.util.Scanner;

public class IF010 {
	public static void main(String[] args) {
		//GIGO 
		//변수 
		int num = 0;  String result="남자";
		Scanner scanner = new Scanner(System.in);

		
		System.out.println("숫자를 입력해주세요 > ");
		num = scanner.nextInt();
		
		if(num%2==0) {result = "여자";}
		
		//삼항연산자 result = num%2==0?"여자 ":result;
		
		
		System.out.println(result);
	}
}
