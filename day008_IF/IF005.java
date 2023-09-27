package com.company.day008_IF;

import java.util.Scanner;

public class IF005 {
	public static void main(String[] args) {
		int a =0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자 1개를 입력해주세요 >");
		a = scanner.nextInt();
		/*
		 * 처리
		 * 
		 * -1  =>  1  음수라면 *-1   ,  -
		 *  1  =>  1  
		 * -3  =>  3  음수라면 *-1   ,  -
		 * 
		 * */
		//int result =0; result = -num;
		
			if(a>0) {System.out.println(a +"절대값 :" + a);}
		else {System.out.println(a + "절대값 :" + -a);}
	}
}
