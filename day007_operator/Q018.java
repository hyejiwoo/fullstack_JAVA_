package com.company.day007_operator;

public class Q018 {
	public static void main(String[] args) {
		//변수
		int a = 13;
		int result1=0, result2=0;
		
		//입력
		//처리
		result1 = a%10==0? a/10: (a/10)+1; // 큰 10의 배수
		result2 = (result1*10) - a;

		//출력
		System.out.println(result2);
		
	}
}
