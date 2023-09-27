package com.company.day004;

public class A017 {
	public static void main(String[] args) {
		// 1. 캐스팅 방법 - 오류나는 이유 체크
		int v1 = (int) 1.2; // 4B = 8B (double) 실수를 정수에 넣었음! 4byte[ | | | ] <- 1.2 (double : 8byte) [ | | |
							// | | | | ]
		long v2 = 10; // 8B = 4B 8byte[ | | | | | | | ] <- 10 4byte[ | | | ]
		float v3 = (float) 3.14; // 4B(float) = 8B (double) double형이
									// 더 큰데 float에 넣음 4byte[ | | | ] <- 3.14 (double : 8byte) [ | | | | | | | ]
		double v4 = 3.14f; // 8B(double) = 4B(float) 8byte[ | | | | | | | ] <- 3.14 4byte[ | | | ]
		float v1_test = 10;
		System.out.println(v1_test); // 10.0
		System.out.printf("%.1f\n", v4);
		System.out.printf("%.2f\n", v4);
		System.out.printf("%.3f\n", v4);
		System.out.printf("%.4f\n", v4);
		System.out.printf("%.5f\n", v4);
		System.out.printf("%.6f\n", v4);

		// 2. 자동타입변환 - byte < short , char < int < long < float < double
		double v21 = 3.14f; // long (8byte) = float(4byte)
		float v22 = 3L; // float (4byte) = long(8byte) ◎ 실수 > 정수
		long v31 = 10; // long (8byte) = int(4byte)
		short v24 = 10; // short(2byte) = int(4byte) ◎ short 범위
		byte v25 = 10; // byte(1byte) = int(4byte) ◎ byte 범위 (-128 ~ 127)

		// 1bit (0,1) -1byte(8but)
		// 2^0(1) 2^1(2) 2^2(4) 2^3(8) 2^4(16) 2^5(32) 2^1(6)(128)`` 2^7(28) 8^7(256)
		// 0.1
		// (0,1)(0,1) 00 01 10 11
		// -128~0(128-1)

		// 3. 강제타입변환
		byte v311 = 1;
		double v32 = v311; // 실수 > 정수
		v311 = (byte) v32; // 정수(1byte) = 실수(8byte)
		System.out.println(10 / 3); // 3 정수/정수 = 정수
		System.out.println(10 / 3.0); // 3.333 정수/실수 = 실수
		System.out.println(10.0 / 3); // 3.333 실수/정수 = 실수

		// 4. ex1 다음의 결과가 나오게 코드를 수정하세요.
		int ca = 10, cb = 3;

		System.out.println(10f / 3); // 결과 : 3.333333
		System.out.println(10 / 3f);
		System.out.println(10f / 3f);
		System.out.println(10f / cb); // 결과 : 3.333333

		System.out.println(ca / 3f); // 결과 : 3.333333
		System.out.println(ca / (float) 3);// 결과 : 3.333333

		System.out.println((float) 10 / cb);// 결과 : 3.333333
		System.out.println((float) ca / cb);// 결과 : 3.333333

		// 5. ex2 A018 A019 A020

		/// 정수
		// v3byte O)
		// 정수(byte) = 실수(1byte) 실수 (8byte)

	} // end main
} // end class
