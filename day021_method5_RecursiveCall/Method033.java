package com.company.day021_method5_RecursiveCall;

public class Method033 {
	
	public static void test(int a) {
		System.out.print(a + "\t");

		if(a<2)return;		
		test(--a);

	}
	
	public static void main(String[] args) {
		test(10);
	}
}
