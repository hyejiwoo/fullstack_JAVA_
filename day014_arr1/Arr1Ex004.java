package com.company.day014_arr1;

public class Arr1Ex004 {
	public static void main(String[] args) {
		char ch[] = { 'B', 'a', 'n', 'a', 'n', 'a' };

		// ver0
		// 'B'가 대문자의 범위라면 a(97) = 'A'(65)+32
		// 'B'가 소문자의 범위라면 A(65) = 'a'(97)-32

		// ver1
		// if('B'가 대문자의 범위라면) {a(97) = 'A'(65)+32}
		// if('B'가 소문자의 범위라면) {A(65) = 'a'(97)-32}

		// ver2

		char A = 'A';
		int AInt = A;
		System.out.println(AInt); // 65

		char a = 'a';
		int aInt = a;
		System.out.println(aInt); // 97

		System.out.println("=========================");

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'A' && ch[i] <= 'Z') {
				ch[i] += 32;															// 32 or ('a' - 'A')
			} else if (ch[i] >= 'a' && ch[i] <= 'z') {	
				ch[i] -= 32;
			}
		}

		// 대괄호, 쉼표 코드
		for (int i = 0; i < ch.length; i++) {
			if (i == 0) {
				System.out.print("[" + ch[i] + ",");
			} else if (0 < i && i < ch.length - 1) {
				System.out.print(ch[i] + ",");
			} else if (i == ch.length - 1) {
				System.out.print(ch[i] + "]" + "\n");
			}
		}

		System.out.println();

	}
}
