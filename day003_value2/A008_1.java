package com.company.day003_value2;

public class A008_1 {
	public static void main(String[] args) {
		// 0. 자바의 종류형 분류 (기본형)과 (참조형)
		// 1. 기본형 : 논리형, 정수형, 실수형
		// #1 boolean
		// #2 byte short int long
		// #3 float double
		// #4 char --> A008_2

		System.out.println("#1.  boolean"); // true / false★
		boolean b1 = false;
		System.out.println(b1);
		b1 = true;
		System.out.println(b1);
		b1 = false;
		System.out.println(b1);

		System.out.println("2. 정수 byte short int long");
		byte by = 1;
		short sh = 2;
		int in = 3;
		long lo = -4L;
		System.out.println(by);
		System.out.println(sh);
		System.out.println(in);
		System.out.println(lo);

		System.out.println("#3. 실수");
		float f1 = 3.14f;
		double d = 3.14;
		System.out.println(f1);
		System.out.println(d);

		// #3-1. float 정밀도 확인 - 7자리보장
		float fper1 = 1.1234567f;
		float fper2 = 1.0000007f; // 0 6 개
		float fper3 = 1.00000001f; // 0 7 개
		System.out.println(fper1); // 1.1234567
		System.out.println(fper2); // 1.0000001
		System.out.println(fper3); // 1.0

		// #3-2. double 정밀도 확인 - 자리보장
		double dper1 = 1.123456789123456;
		double dper2 = 1.000000000000001; // 0 14개
		double dper3 = 1.0000000000000001; // 0 15개
		System.out.println(dper1); // 1.12345678912346
		System.out.println(dper2); // 1.000000000000001
		System.out.println(dper3); // 1.0

	}
}
