package com.company.day008_IF;

import java.util.Scanner;

public class IF007 {
	public static void main(String[] args) {
		int year=0; String result="평년";
		Scanner scanner = new Scanner(System.in);
				
		System.out.println("원하는 년도를 입력해주세요 >");
		year =scanner.nextInt();
				
	    if(year%4==0 && year%100!=0 || year%400==0) {result ="윤년";}
		
		System.out.println(year + "년도는" +result + "입니다.");
		
		
	}
}
