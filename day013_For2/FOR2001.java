package com.company.day013_For2;

public class FOR2001 {
	public static void main(String[] args) {
		// 1. 눈에 보이는 그대로
		System.out.println("\n\n1.");
		System.out.println("[" + 1 + "층]");
		for (int hosil = 1; hosil < 4; hosil++) {
			System.out.println(hosil + "호실\t");
		}
		System.out.println();

//			System.out.println("[" + 2 + "층]");
//			System.out.println(1+"호실\t");
//			System.out.println(2+"호실\t");
//			System.out.println(3+"호실\t");		System.out.println();

		// 2. for 1개로 (칸)
		System.out.println("\n\n2. ");
		System.out.println("\n\n1.");
		System.out.println("[" + 1 + "층]");
		for (int hosil = 1; hosil < 4; hosil++) {
			System.out.println(hosil + "호실\t");
		}
		System.out.println();

		// 3. for 2개로 (층)
		System.out.println("\n\n3.");
		for (int ch = 1; ch < 4; ch++) { /// 층
			System.out.println("[" + ch + "층]");
			/////////////////////// 칸 시작
			for (int hosil = 1; hosil < 4; hosil++) {
				System.out.println(hosil + "호실\t");
			}
			////////////////////////// 칸끝
			System.out.println();

		}

	}// end main
}// end class

/*
 * [1층] 1호실 2호실 3호실 [2층] 1호실 2호실 3호실
 *
 *
 */
