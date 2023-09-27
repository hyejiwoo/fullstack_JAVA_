package com.company.day007_operator;

public class Q004 {
	public static void main(String[] args) {
		System.out.println(10&3);
		/*	2
		 * 1010 & 0011 = 0010
		 * */
		
		System.out.println(10|3);
		/*	11
		 * 1010 | 0011 = 1011
		 * */
		
		System.out.println(10^3);
		/*	9
		 * 1010 ^ 0011 = 1001
		 * */
		
		System.out.println(~10);
		/*	-11
		*0101에서 0개수 세고 1 더해주기
		 * */
		
		System.out.println(Integer.toBinaryString(10));
		//1010
		System.out.println(Integer.toBinaryString(3));
		//11
		
	}
}
