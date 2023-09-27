package com.company.day004;

public class A018 {
	public static void main(String[] args) {
		/*
		 * q1) 3을 출력
		 */
		System.out.println((int) 1.5 + (int) 2.7);
		/*
		 * q2 ) 오류나는 코드를 찾고 이유를 적으시오
		 */
		byte b = 1;
		int i = 2;
		long l = 2;
		boolean bl = true;
		float f = 1.1f;
		double d = 1.1;

//	   bl = b;		            //bl 타입을 byte 타입으로			// 1. 형변환은 boolean 빼고 모두 형변환 가능
		
		i = b; // 실수>정수, ◎사이즈 4byte = 1byte
		i = (int) l; // 정수 4byte = 1byte l 앞에 int or int 타입을 long
		l = i; // 실수>정수, ◎사이즈 8byte = 4byte
		f = (float) d; // 실수>정수, ◎사이즈 4byte = 8byte d 앞에 float or d 타입을 float
		d = f; // 실수>정수, ◎사이즈 8byte = 4byte
		f = l; // 실수>정수, ◎사이즈 4byte = 8byte
	}
}
