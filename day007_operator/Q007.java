package com.company.day007_operator;

public class Q007 {
	public static void main(String[] args) {
		System.out.println(false&&true);
		// false
		System.out.println(false^(10>=3));
		// true, false ^ true = true
		System.out.println((10<=3) || (10>3));
		// true, false || true
		System.out.println(!(10<=3));
		// true, !false 반대!!!
	}
}
