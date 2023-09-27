package com.company.day003_value2;

public class A009 {
	public static void main(String[] args) {
		// 1. 자료형 - 기본형 / 참조형
		// 2. 기본형 -
		// boolean(1byte)
		// byte(1), -short(2), -int(3:기본단위), -long(8 - 0L 별표),
		// char(2), float(4 0f 별표) -double(8 : 기본단위)
		// 3. 실수는 정수보다 크다 - float > long

		// q1
		boolean b1 = true;
		System.out.println(b1);

		// q2
		byte by = 1;
		System.out.println(by);

		// q3
		short sh = 2;
		System.out.println(sh);

		// q4
		int i = 4;
		System.out.println(i);

		// q5
		long l = 8L;
		System.out.println(l);

		// q6
		float fl = 3.14f;
		double d = 3.14;
		System.out.println(fl + "\t" + d);

		// q7
		char ch = 'A';
		System.out.println(ch + "\t");

		// q8
		char ch2 = ' ';
		System.out.println("|" + ch2 + "|\t" + (int) ch2);
		String str = " ";
		System.out.println("|" + str + "|\t");
	}
}
