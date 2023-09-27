package com.company.day021_method5_RecursiveCall;

public class Method037 {
	public static int fibonacci(int a) {

		// 1) 빠져나올 조건
		if (a <= 2)
			return 1;

		// 3) 자기 자신 호출
		return fibonacci(a - 2) + fibonacci(a-1);

	}

	public static void main(String[] args) {
		System.out.println("● 피보나치 수열");
		// ver 1 보이는 대로 1 1 2 3

		// ver2
		for (int i = 1; i < 5; i++) {
			System.out.println(fibonacci(i) + "\t");
		}
	}
}
