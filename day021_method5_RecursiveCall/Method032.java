package com.company.day021_method5_RecursiveCall;

public class Method032 {
	
	
	public static void hello(int a) {
		System.out.println("hello" + a);

		if(a<1)return;

		hello(--a);

	}

	public static void main(String[] args) {
			hello(5);
	
	}
}
