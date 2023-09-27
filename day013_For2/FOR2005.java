package com.company.day013_For2;

public class FOR2005 {
	public static void main(String[] args) {

		// ver1
		System.out.println("Ver1");
		System.out.print("1");
		System.out.print("2");
		System.out.print("3");
		System.out.print("4\n");

		System.out.print("1");
		System.out.print("2");
		System.out.print("3");
		System.out.print("4\n");

		System.out.print("1");
		System.out.print("2");
		System.out.print("3");
		System.out.print("4\n");

		System.out.print("1");
		System.out.print("2");
		System.out.print("3");
		System.out.print("4\n");

		// ver2
		System.out.println("\n\nVer2");

		for (int i = 1; i < 5; i++) {
			System.out.print(i);
		}
		System.out.println();
		for (int i = 1; i < 5; i++) {
			System.out.print(i);
		}
		System.out.println();
		for (int i = 1; i < 5; i++) {
			System.out.print(i);
		}
		System.out.println();
		for (int i = 1; i < 5; i++) {
			System.out.print(i);
		}
		System.out.println();

		// ver3

		System.out.println("\n\nVer3");
		for (int a = 1; a < 5; a++) {
			for (int i = 1; i < 5; i++) {
				System.out.print(i);
			}
			System.out.println();

		}
	}
}