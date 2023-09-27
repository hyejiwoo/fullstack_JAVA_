package com.company.day004;

public class A021 {
	public static void main(String[] args) {
		// #1. 같은 자료형간의 연산
		int v1 = 1 + 2; // 실수 > 정수, 사이즈 int = int + int;
		int v2 = 10 / 3; // int = int / int
		float v3 = 1.2f + 3.4f; // float = float + float
		double v4 = 5.6 / 2.0; // double = double / double
		System.out.println(v1 + "\tv" + v2 + "\t" + v3 + "\t" + v4);

		
		// #2. int 보다 작은 자료형
		byte b1 = 1; // b1[1]
		byte b2 = 2; // b1[2]
		byte v51 = 1 + 2;// byte = int = int
		byte v52 = (byte) ((b1) + (b2)); // int = int = int
		byte v53 = (byte) (b1 + b2);
		System.out.println("v5 v52 v53");

		
		// #3. 다른 자료형간의 연산
		double v6 = 1 + 2.3; // double int + double
		int v7 = 1 + (int) 2.3;
		int v8 = 1 + (int) 2.3;
		System.out.println(v6 + "wt" + v7 + "wt" + v8);

		
		// 4. ex
		/*
		 * byte d3=3; short d3=5; 1. error ox byte v9 =d3+d4; 2. byte v9 고정~ 오류안나게 short
		 * v10= d3+d4 3. byte v10 고정~ 오류안나게 int v11 = d3+d4 4. error ox
		 *
		 */
		// byte v9 = d3+d4 !q{ error ox]

		
		byte d3 = 3;
		short d4 = 5; // 1. error ox
		byte v9 = (byte) (d3 + d4); // 2. byte v9 고정~ 오류안나게
		short v10 = (short) (d3 + d4); // 3. byte v10 고정~ 오류안나게
		int v11 = d3 + d4; // 4. error ox

//		byte d3 =3;		short d4 = 5;		//class error  0
//		byte v9 =0;

	}
}