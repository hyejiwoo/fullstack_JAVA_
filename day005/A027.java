package com.company.day005;

public class A027 {
	public static void main(String[] args) {
		// 1. 자료형의 기본 : 기본형 | 참조형
		// byte(1byte) - short(2byte) - int(4byte) - long(8byte)
		// 1bit - 0, 1
		// 1byte = 1*8bit = 2^8(256) -2^7~2^7-1(0포함)=-128~127
		// 2byte = 2*8bit = 2^16(65536) -2^15~2^15-1(0포함)=-32768~32767
		// 4byte = 4*8bit = 2^32 -2^31~2^31-1(0포함)=-21억~21억(10자리수)
		// 8byte = 8*8bit = 2^64 -2^63~2^63-1(0포함)=

		// byte b = 128; -> 오류가 뜨는 이유는?
		// Type mismatch : cannot convert from into byte

		// 1-2-4-8-16-32-64-128-256-512-1024-2048
		// 2^0 2^1 2^2 ^3 ^4 ^5 ^7 ^8 ...

		// 오류가 뜨는 이유와, 계산하는 방법 보기

		final float PI = 3.14F;
		// PI = 3.141592F; //error:The final local variable PI cannot be assigned. It
		// must be blank and not using a compound assignment
	}
}
