package com.company.day004;

public class A022 {
	public static void main(String[] args) {

		int in = 10;
		double dou = 1.2;
		byte a = 10;
		byte b = 20;

//		-------q1 연산 시 - 큰자료형
		double result1 = in + dou; // double = int + double
		int result2 = (int) (in + dou); // int = int + int

//		-------q2 int 보다 작은 정수형- byte short char 연산 시
		int c1 = a + b;
		byte c2 = (byte) (a + b);

		System.out.println(result1 + "\n" + result2);
		System.out.println(c1 + "\n" + c2);
	}
}
