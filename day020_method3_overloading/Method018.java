package com.company.day020_method3_overloading;

import java.util.Arrays;

public class Method018 {
	public static int cv(int a) {return a;}
	public static void main(String[] args) {
		System.out.println("STEP1) ");
		int []arr = {1,2,3};
		
		System.out.println("1. arr의 보관은 '주소'이다. >" + arr);
		//I@3d012ddd
		System.out.println("2. arr[0] > " + arr[0] );
		// arr[0] > 1이라는 값 꺼내기
		
		System.out.println("\n\nSTEP2) Call by value");
		System.out.println("메서드 안에서만 사용가능");
		System.out.println(cv(		 1		 ));					//해당값 리턴 1
		System.out.println(cv(arr[0]));		//해당값 리턴
		System.out.println(Arrays.toString(arr));		//해당값 리턴
		
		System.out.println("\n\nSTEP3) call by reference");
		System.out.println("주소를 주면 원본바꾸기");
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[0]);
		cr(arr); // public static 리턴값 메서드명(파라미터);
							// public static void cr(파라미터);
							
	}
	public static void cr(int []arr) {
		for(int i = 0; i<arr.length; i++) {
			arr[i]*=10;
			}
		System.out.println(arr[0]);
	}
}
