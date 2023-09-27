package com.company.day018;

public class Method004 {
	public static void main(String[] args) {
		test1(10);
		test2(1.2);
		hap(3, 5);
		disp(7,'*');
		disp(2,'♥');		
	}
	public static void test1(int a) {System.out.println(a);}
	
	public static void test2(double  d) {System.out.println(d);}
	
	public static void hap(int a, int b) {
		int box = 0;
		for(int i = a; i < b; i++)
		{box += i;}
		System.out.println(box);}
	
	public static void disp(int b, char a) {
		String result = "";
		for(int i = 0; i < b; i++) {
			result +=a;
		}
		System.out.println(result);}
	
}
