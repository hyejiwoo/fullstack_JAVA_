package com.company.day007_operator;

public class A008 {
	public static void main(String[] args) {
		int a = 10;
		// Q1) a 가 1이라면 1. 아니라면 0
		// (조건)? 참:거짓
		// (a가 1이라면)? 1:0

		int result1 = (a == 1) ? 1 : 0;
		double result21 = (a > 0) ? a * 1.1 : a * 0.9;
		double result22 = a * ((a > 0) ? a * 1.1 : a * 0.9); // 추가

		System.out.println(a == 1 ? "1" : "0");
		System.out.println(result1);

		// Q2) a 가 양수라면 1.1곱하기, 아니라면 0.9 곱하기
		// (조건)? 참:거짓
		// (a가 양수라면)? *1.1:*0.9
		// double result21 = (a>0)? a*1.1 : a*0.9;
		// double result22 = (a>0)? 1.1 : 0.9;

		System.out.println(result21);
		System.out.println(result22);
		System.out.println(a > -1 ? "11" : "9");

		// Q3)

//		double result23 = (a>0)? a*=1.1 : a*=0.9;
//		System.out.println(result23);
		// 대입 연산자는 항상 마지막에

		double result24 = (a > 0) ? a *= 1.1 : (a *= 0.9);
		System.out.println(result24);

		double result25 = (a > 0) ? a * 1.1 : (a *= 0.9);

		double result26 = (a > 0) ? a * 1 : a * 1.1;
		// doble은 정수를 담을 수 있기 때문에 가능.
		System.out.println(result26);
		System.out.println(a > -1 ? "11" : "9");

		// Q. 다음 코드 확인 - 오류나는 이유?
//		double result23 = (a>0) ? a*=1.1 : (a*=0.9);  
		// 연산자 우선순위 : 대입연산자는 항상 마지막에
		// 결과1만 읽음, 결과2는 안 읽음

		// Q. 다음 코드 확인 - 오류나는 이유?
//		double result24 = (a>0) ? a*1.1 : (a*=0.9);  
		// 결과1과 결과2는 동등해야 함

		// Q. 다음 코드는 가능
//		double result26 = (a>0) ? a*1 : a*1.1;  

		// 출력
		System.out.println("a가 1이라면 1, 아니라면 0 > " + result1);
		System.out.println("a가 양수라면 *1.1, 아니라면 *0.9 > " + result21);
		System.out.println("a가 양수라면 *1.1, 아니라면 *0.9 > " + result22); // 추가

	}
}
