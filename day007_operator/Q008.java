package com.company.day007_operator;

public class Q008 {
	public static void main(String[] args) {
		int a = 3, b=5, c=7;
		System.out.println(false&& ++a>b);
		// false, dead code!
		System.out.println(true | a++>b);
		// true, true | 4>5(false)
		System.out.println(true^b++>b);
		// true, true ^ false
	}
}
