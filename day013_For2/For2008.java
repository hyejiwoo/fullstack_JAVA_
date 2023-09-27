package com.company.day013_For2;

public class For2008 {
	public static void main(String[] args) {
		// ver1
		System.out.print("@");
		System.out.print("#");
		System.out.print("#");
		System.out.print("#");
		System.out.println();

		// ver2
		System.out.println("\n\n첫번째 줄의 칸들 분석");
		System.out.print(1 == 1 ? "@" : "#");
		System.out.print(2 == 1 ? "@" : "#");
		System.out.print(3 == 1 ? "@" : "#");
		System.out.print(4 == 1 ? "@" : "#");
		System.out.println();

		System.out.print(1 == 2 ? "@" : "#");
		System.out.print(2 == 2 ? "@" : "#");
		System.out.print(3 == 2 ? "@" : "#");
		System.out.print(4 == 2 ? "@" : "#");

		System.out.println();
		System.out.print(1 == 3 ? "@" : "#");
		System.out.print(2 == 3 ? "@" : "#");
		System.out.print(3 == 3 ? "@" : "#");
		System.out.print(4 == 3 ? "@" : "#");
		System.out.println();

		System.out.print(1 == 4 ? "@" : "#");
		System.out.print(2 == 4 ? "@" : "#");
		System.out.print(3 == 4 ? "@" : "#");
		System.out.print(4 == 4 ? "@" : "#");
		System.out.println();

		// ver3
		System.out.println("\n\n결과");

		String result = "";
		for (int ch = 1; ch <= 4; ch++) {
			for (int kan = 1; kan <= 4; kan++) {
				result = ch == kan ? "@" : "#";
				System.out.print(result);
			}
			System.out.println();
		}
	}
}
