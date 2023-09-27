package com.company.day006;

public class A004 {
	public static void main(String[] args) {
		System.out.println(Integer.toBinaryString(5)	);	//0000101
		System.out.println(Integer.toBinaryString(3)	);	//0000011
		
		//계산하는 방식을 알긔..
		// & 두 값이 모두 1 => 모두 1일 때 true.
		// | 두 값이 모두 0 => 모두 0일 때 false.
		//   true1 |false0  = true 1
		//	 false0 |true1  = true 1
		//   true 1 | true 1  = true 1
		//   false 0 | false 0  false 0
		// ^ (xor) 두 값이 다를 때 1(true)
		// ~ (not) 반전 0은 1로, 1은 0으로 
		
		
		System.out.println(5&3);	//1
		/*		0000101
		 * &)   0000011
		 *---------------
		 *      0000001   => 2^0 => 1 
		 * */
		System.out.println(5|3);	//7
		/*		0000101
		 * |)   0000011
		 *---------------
		 *      0000111   => 2^2 + 2^1 + 2^0 => 7
		 * */
		System.out.println(5^3);	//6
		/*		0000101
		 * ^)   0000011
		 *---------------
		 *      0000110   => 2^2(4) + 2^1(2) => 6
		 * */
		System.out.println(~5);
		/*		0000101
		 * ~)   1111010
		 *---------------
		 *		1 음수 				2 0 계산 		 3 -(2^2 + 2^0 + 1) =-6
		 *      1은 음수로 계산하기.  => 2^2(4) + 2^0 + 1 => 4 + 1 + 1 = -6 
		 * */
		
		System.out.println(Integer.toBinaryString(0));  //0
		System.out.println(Integer.toBinaryString(-1)); // 1(32개)
		System.out.println(Integer.toBinaryString(-2)); // 1(31개) + 0(1개)
		/*
		 * Q1 ) 0의 표현 방식이 2개 
		 * 0000 0000  값 얼마? 1. 양수로  2.1계산 3.계산할게 없으면 0 
		 * 1111 1111  값 얼마? 1. 음수로  2.0계산 3.계산할게 없으면 0 
		 * 
		 * Q2 ) 
		 * 11 1111 10	1. 음수 2. 0 계산 3. -2^0+1  = -2
		 * 11 1111 11	1. 음수 2. 0 계산 3. -(0+1)  = -1
		 * 00 0000 00	1. 양수	2. 1 계산 3. 0
		 * 00 0000 01   1. 양수 2. 1 계산 3. 2^0 = 1
		 * 
		 * */
	}
}
