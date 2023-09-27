package com.company.day013_For2;

public class For2Ex002 {
	public static void main(String[] args) {
		// ver 1. 보이는 그대로
		System.out.print("A");
		System.out.println();
		System.out.print("A");
		System.out.print("B");
		System.out.println();
		System.out.print("A");
		System.out.print("B");
		System.out.print("C");
		System.out.println();

		// ver 2. 칸
		System.out.println();
		for (char ch = 'A'; ch <= 'A'; ch++) {
			System.out.print(ch);
		}
		System.out.println();
		for (char ch = 'A'; ch <= 'B'; ch++) {
			System.out.print(ch);
		}
		System.out.println();
		for (char ch = 'A'; ch <= 'C'; ch++) {
			System.out.print(ch);
		}
		System.out.println();

		System.out.println("\n\nVer1");
		for (char ch = 'A'; ch <= 'A'; ch++) {
			for (char kan = 'B'; kan <= 'B'; kan++) {

			}
			System.out.println(ch);
		}
	}
}
