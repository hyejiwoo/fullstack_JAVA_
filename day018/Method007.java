package com.company.day018;

import java.util.Scanner;

public class Method007 {
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int c = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("숫자 1 >");
		a = scanner.nextInt();
		System.out.println("숫자 2 >");
		b = scanner.nextInt();
		System.out.println("숫자 3 >");
		c = scanner.nextInt();

		int res3 = max(a, b, c);
		// public static 리턴값 메소드명(파라미터)
		// public static int max(int a, int b, int c){최대값}
		System.out.println("최대값 :" + res3);
	}

	// ver1
	// int result =1;
	// if(result < b) {result = b;}
	// if(result < c) {result = c;}
	// return result ;

	// ver2
	// return a>b? a:c : b>c? b:c;
	//

	// ver3
	// Math.max
	// public static int max(int a, int b)
	// return Math.max(a,b)==a? Math.max(a,c) : Math.max(b,c);

	public static int max(int a, int b, int c) {
		return Math.max(a, b)==a? Math.max(a, c) : Math.max(b, c) ;
	}
}
