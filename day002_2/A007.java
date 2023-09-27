package com.company.day002_2;

public class A007 {
	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		// 정수형의 데이터를 담을 수 있는 변수 a만들고 a에 10 대입하기
		// 정수형의 데이터를 담을 수 있는 변수 b만들고 b에 3대입하기.

		// 다음의 결과가 나오게 System.out.println을 4번 사용하여 출력하시오
		/*
		 * 10+3=13 10-3=7 10*3=30 10/3=3
		 */
		System.out.printf("%d + %d = %d\n", a, b, a + b);
		System.out.printf("%d - %d = %d\n", a, b, a - b);
		System.out.printf("%d * %d = %d\n", a, b, a * b);
		System.out.printf("%d / %d = %d\n", a, b, a / b);

		// ab =a+b;
		// System.out.println("10+3 = " + ab);
		// ab =a-b;
		// System.out.println("10-3 = " + ab);
		// ab =a*b;
		// System.out.println("10*3 = " + ab);
		// ab =a/b;
		// System.out.println("10/3 = " + ab);

		// java 스타일이 어색하다
		System.out.println();
		System.out.println();
		System.out.println(a + " + " + b + " = " + (a + b));
		System.out.println(a + " - " + b + " = " + (a - b));
		System.out.println(a + " * " + b + " = " + a * b);
		System.out.println(a + " / " + b + " = " + a / b);

	}
}
