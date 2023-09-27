package com.company.day020_method3_overloading;

import java.util.Arrays;

public class Method019 {
	public static void main1(String[] args) {
		int a = 0;
		int b = 0;
		System.out.println("print(int a, int b) : " + (a +=1) + "\t" + (b+=1));		 
	}
	public static void print  (int[] su2) {
		for (int i = 0; i < su2.length; i++) {
			su2[i] +=10;}
		System.out.println("print(int[] su2) :" + Arrays.toString(su2));
	}
	public static void main(String[] args) {
		print(1, 3);
		int[] su = {1,3,5};
		print(su[0], su[1]);	//#1 예상되는 결과는?
		System.out.println("1. main :" + Arrays.toString(su));
		
		int[] su2 = {1,3,5};
		print(su2);	//#2 예상되는 결과는?
		System.out.println("2. main :" + Arrays.toString(su2));
	}
	private static void print(int i, int j) {
		// TODO Auto-generated method stub
		
	}
}

//대괄호 있으면 callbyreference