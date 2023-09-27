package com.company.day007_operator;

import java.util.Scanner;

public class Q019 {
	public static void main(String[] args) {
		//변수
		int num=123, result=0;
		int num_input=0, result_input=0;
		
		Scanner scanner = new Scanner(System.in);
		
		//입력
		System.out.print("100~999까지 숫자 입력> ");
		num_input = scanner.nextInt();
		//처리
		result = (num/10)*10 + 1; 
		result_input  =(num_input/10)*10 + 1; 
		// 자릿수 각각 뽑아서 더하기
		
		//출력
		System.out.println("숫자는 123 > " + result);
		System.out.println("숫자 " + num_input + "은 >" + result_input);
		
		System.out.println("숫자" + num + ">" + (num/10)*10 + 1);

	}
}
