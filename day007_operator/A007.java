package com.company.day007_operator;

public class A007 {
	public static void main(String[] args) {
		// #1. 삼향연산자
		System.out.println("#1. 삼향연산자");
		// (조건)? 참 : 거짓
		int a = 10;
		String result = (a > -1) ? "양수" : "음수";
		System.out.println(result);

		int v1 = 3 > a ? 3 : a;
		System.out.println(v1);
		System.out.println(a % 2 == 0 ? "짝수" : "음수");

		// #2. 대입연산자
		int v2; // v2 [0]
		v2 = 10; // v2 [10]
		// v2 = v2+3; //v2 [10+3] 더한다음에 대입
		v2 += 3;
		System.out.println(v2);

		v2 = 10;
		/* v2=v2-3; */ v2 -= 3;
		System.out.println(v2 -= 10);
		v2 = 10;
		/* v2=v2*3; */ v2 *= 3;
		System.out.println(v2 *= 3);
		v2 = 10;
		/* v2=v2/3; */ v2 /= 3;
		System.out.println(v2 /= 3);
		v2 = 10;
		/* v2=v2%3; */ v2 %= 3;
		System.out.println(v2 %= 3);
		v2 = 10;
		/* v2=v2|3; */ v2 |= 3;
		System.out.println(v2 |= 3);
		v2 = 10;
		/* v2=v2<<3; */ v2 <<= 3;
		System.out.println(v2 <<= 3);
		v2 = 10;
		/* v2=v2>>3; */ v2 >>= 3;
		System.out.println(v2 >>= 3);

		// A008 ~ A012 (1) ~11:10

	} // end main
} // end class
