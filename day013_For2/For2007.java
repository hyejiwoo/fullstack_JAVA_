package com.company.day013_For2;

public class For2007 {
	public static void main(String[] args) {
		// ver1
		System.out.println("Ver1");
		System.out.print("4");
		System.out.print("4");
		System.out.print("4");
		System.out.print("4");
		System.out.println();
		System.out.print("3");
		System.out.print("3");
		System.out.print("3");
		System.out.println();
		System.out.print("2");
		System.out.print("2");
		System.out.println();
		System.out.print("1");
		System.out.println();

		// ver2
		System.out.println("\n\nVer2");
		for (int kan = 1; kan < 5; kan++) {
			System.out.print("4");
		}
		System.out.println();
		for (int kan = 1; kan < 4; kan++) {
			System.out.print("3");
		}
		System.out.println();
		for (int kan = 1; kan < 3; kan++) {
			System.out.print("2");
		}
		System.out.println();
		for (int kan = 1; kan < 2; kan++) {
			System.out.print("1");
		}
		System.out.println();

		// ver3
		System.out.println("\n\nVer3");
		for (int ch = 4; ch >= 1; ch--) {
			for (int kan = 1; kan < (2 + ch - 1); kan++) {
				System.out.print(ch);
			}
			System.out.println();
		}

	}
}
