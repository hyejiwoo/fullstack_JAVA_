package com.company.day007_operator;

public class Q010 {
	public static void main(String[] args) {
		int a =3, b=7, c = 5;
		System.out.println((a>b)?(a>c)?a:c:(b>c)?b:c);
		//7
/*
	(a>b) ?
	(a>c) ? a[a가 제일 큼] : c[c가 제일 큼] : 
	b>c) ? b[b가 제일 큼] : c[c가 제일 큼]
	제일 큰 수 출력, 삼항연산자 이용
 */

	}
}
