package com.company.day020_method3_overloading;

public class Method015 {
	public static void main(String[] args) {
		System.out.println("[BASIC] 1. 매개변수의 자료형");
		//public static 리턴값 (파라미터)
		print(4);	//public staic void print(int a)
		print(1.2);
		print('A');
		print("HAPPY");
		
		System.out.println("[BASIC] 2. 매개변수의 갯수");
		//public static 리턴값 (파라미터)
		print(1, 2);	//public staic void print(int a)
		print(1.2, 1.3);
		print("3" , "5");
	
		
		
	}
	//	1. 매개변수 자료형
	private static int print(char a) {System.out.println(a); return (0);} // void 대신 int 를 주는 경우 마지막에 리턴 0 주기.
	public static void print(int a) {System.out.println(a);}
	public static void print(double a) {System.out.println(a);}
	public static void print(String a) {System.out.println(a);}

	
	//	2. 매개변수 갯수
	public static void print(int a, int b) {System.out.println(a+b);}
	public static void print(double a, double b) {System.out.println(a+b);}
	public static void print(String a, String b) {System.out.println(a+b);}
}
