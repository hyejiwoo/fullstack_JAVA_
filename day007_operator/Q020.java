package com.company.day007_operator;

import java.util.Scanner;

public class Q020 {
	public static void main(String[] args) {
		//변수
		int year;
		boolean yun; // true false 판단용
		String result="";
		
		Scanner scanner = new Scanner(System.in);
		
		//입력
		System.out.print("년도 입력: ");
		year = scanner.nextInt();
		
		//처리
		yun = ((year%4==0) && !(year%100==0)) || (year%400==0); 
		result = yun==true? "윤년" : "평년";
		
		//출력
		System.out.println(result);
	}
}
