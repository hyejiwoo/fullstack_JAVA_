package com.company.day013_For2;

public class FOR2002 {
	public static void main(String[] args) {

		// 4. 층 칸 구조파악
		// **** 1층일 때 별이 4개 -줄바꿈
		// **** 2층일 때 별이 4개
		// ****
		// ****

		for (int a = 1; a <= 4; a++) {
			for (int i = 1; i <= 4; i++) {
				System.out.print("★");
			}
			System.out.println();
		}
	}
}