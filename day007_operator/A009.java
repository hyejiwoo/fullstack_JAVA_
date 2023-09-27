package com.company.day007_operator;

public class A009 {
	public static void main(String[] args) {
		int a =1, b=5, c=3; int max=0;
		
		/*()?	참:거짓
		 * 	1. (a와 b사이에 a가 크다면)? a:b 값을 max에 대입
		 *  1. (max와 c사이에 c가 크다면)? c:max 값을 max에 대입
		 *  1. max = (a>b)? a:b;
		 *  1. max =(c>max)? c:max;
		 * */	
		
//		a>b? a:b
//		c<max c:max
		
		System.out.println( a >= b ? "a=max":"b=max");
//		System.out.println();
		System.out.println((a>b) ? a:b);
//		System.out.println((max>c) ? max :c);
	}
}
