package com.company.day013_For2;

public class FOR2003 {
	public static void main(String[] args) {

		// ver1

		System.out.print("*\n");
		System.out.print("**\n");
		System.out.print("***\n");
		System.out.print("****\n");

		// ver2
		for (int kan = 1; kan <= 1; kan++) {
			System.out.print("*");
		}
		System.out.println();
		for (int kan = 1; kan <= 2; kan++) {
			System.out.print("*");
		}
		System.out.println();
		for (int kan = 1; kan <= 3; kan++) {
			System.out.print("*");
		}
		System.out.println();
		for (int kan = 1; kan <= 4; kan++) {
			System.out.print("*");
		}
		System.out.println();

		// ver3

		for (int ch = 1; ch <= 4; ch++) {
			for (int kan = 1; kan <= ch; kan++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}