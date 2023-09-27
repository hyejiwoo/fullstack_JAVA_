package com.company.day007_operator;

public class Q005 {
	public static void main(String[] args) {
		System.out.println(10<<2);
		//40, 10*2^2 = 40
		System.out.println(10>>2);
		//2, 10/2^2 = 2 (내림)
		System.out.println(-10<<2);
		//-40, -10*2^2 = 40
		System.out.println(-10>>2);
		//-3, -10/2^2 = -3 (올림)
		System.out.println(-10>>>30);
		//3, 2자리 빼고 밀림 -> 11남음
	}
}
