package com.company.day006;

public class A005 {
	public static void main(String[] args) {
		//먼저 () 
		// 값을 구하고(++, --, *, /, %, <<, >>)
		//  비교 (< > <= >= != ==)
		//	 조건 후 (&&(n% ) 같아야 true || ! 반대면 true ^ 반대면 true)
		//    대입 (=)
		
		/*
		 * #1. << , >>
		 * 	<< 곱하기 					   나누기>>
		 * 		 256  128  64  32  16  8  4  2  1
		 * */
		System.out.println(16 << 3);  //128	16*2^3
		System.out.println(16 >> 3);  //2	16/2*3
		
		//Q1 ) 3<<2
		System.out.println(3<<2);			//12  3*2^2
		//Q2 ) 다음 계산은?
		int x =2;
		System.out.println(1+x << 33);		//6   3/2^33 
		//  1. 1+2
		//  2. 3  << 33 (32bit - 자바 정수형 기본처리단위 int)
		//  3. 3  <<  1
		//  4. 3  * 2^1
		// 정수(int) 2^33에서 32가 날라감 int->4byte 이므로 33-32 => 2^1	
		
		
	/*	Q3)
		 * 	<< 곱하기 					   나누기>>
		 * 		 256  128  64  32  16  8  4  2  1
		 */ 	
		// << 곱하기
		System.out.println( 3<<1);		//3*2^1	   6
		System.out.println(-3<<1);		//-3*2^1  -6
		System.out.println( 3<<2);		// 3*2^2   12
		System.out.println(-3<<2);		//-3*2^2  -12
		System.out.println();
		System.out.println();
		// >>나누기,  양수(소수버림), 음수(소수올림)
		System.out.println(5>>1);		//5    / 2^1 = 5/2 = 2.5     =2(소수버림)
		System.out.println(-5>>1);		//-5   / 2^1 = -5/2 = -2.5   =-3
		System.out.println(5>>2);		//5    / 2^1 = 5/4 = 1.25    =1
		System.out.println(-5>>2);		//-5   / 2^1 = -5/4 = -1.25  =-2
	
		
	//Q4)
		System.out.println(-19<<3);		// -19*2^3 = -19*8
		System.out.println(-19>>3);		// -19/2^3 = -19/8	=-2.375  =-3
		
		
	//#2.	
		System.out.println(Integer.toBinaryString( 3));
		System.out.println(Integer.toBinaryString(-3));
		// 0000 0000 0000 0000 0000 0000 0011  = 2^1+2^0 =3
		// 1111 1111 1111 1111 1111 1111 1101  = -(2^1+1) =-3
		
		System.out.println( 3 >>> 1);	//1
		//1-1 0000 0000 0000 0000 0000 0000 0000 0011  
		//1-2 0000 0000 0000 0000 0000 0000 0000 001  
		//1-3 2^0=1
		
		System.out.println(-3 >>> 31 );  	//1
		//1-1 1111 1111 1111 1111 1111 1111 1101
		//1-2								   1
		//1-3 0000 0000 0000 0000 0000 0000 0001
	
		System.out.println(-3 >>> 30 );  	//3
		//1-1 1111 1111 1111 1111 1111 1111 1101
		//1-2								   1
		//1-3 0000 0000 0000 0000 0000 0000 0011
		
//		면접질문 : System.out.println(13<<30);  X
	}
}
