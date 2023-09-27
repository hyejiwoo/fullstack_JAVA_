package com.company.day013_For2;

public class For2Ex004 {
	public static void main(String[] args) {

		int sum = 0;
		int start = 1;
		int end = 10;

		for (int i = start; i <= 10; i++) {
			System.out.println(1 + "+..." + 10 + "=" + sum);
			sum = 0;
			start += 10;
			end += 10;

//				for(int i=1; i<=10; i++) {
//					System.out.println(1+ "+..." + 10+"=" +sum);		sum=0;  start+=10;		end+=10;

		}
	}
}
