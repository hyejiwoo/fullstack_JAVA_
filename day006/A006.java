package com.company.day006;

public class A006 {
	public static void main(String[] args) {
//		int a = 10;
//		//Q1 a가 2의 배수이면서 5의 배수라면 true. 아니라면 false
//		System.out.println(a%2 == 0);
//		System.out.println();
//		//Q2 a가 2의 배수이거나 3의 배수라면 true. 아니라면 false
//		System.out.println();
//		//Q3 a가 3의 배수가 아니라면 true. 맞다면 false
//		System.out.println();

		int a = 10;
		// Q1 a가 2의 배수이면서 5의 배수라면 true. 아니라면 false
		System.out.println(a % 2 == 0 && a % 5 == 0);
		// Q2 a가 2의 배수이거나 3의 배수라면 true. 아니라면 false
		System.out.println(a % 2 == 0 || a % 5 == 0);
		// Q3 a가 3의 배수가 아니라면 true. 맞다면 false
		System.out.println(!(a % 3 == 0));
		System.out.println(a % 3 != 0);
	}
}
