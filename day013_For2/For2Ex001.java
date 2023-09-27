package com.company.day013_For2;

public class For2Ex001 {
	public static void main(String[] args) {

		// ======결과
		// 1+5=6
		// 2+4=6
		// 3+3=6
		// 4+2=6
		// 5+1=6
		// *3

		// ======힌트
		// 만약 x+y = b => (x+y) ==b
		// 첫번째 주사위 : 1~b 1 2 3 4 5
		// 두번째 주사위 : 1~b 5 4 3 2 1

		// Ver01
		// 만약 x+y = b => (x+y) ==b
		// if(만약 첫 번째 주사위가 1이고 두 번재 주사위가 1일때 눈이 합이 6이라면) {1+1=6}

		// Ver02
		System.out.println("\n\n2.Ver2");
		if (1 + 1 == 6) {
			System.out.println(1 + "+" + 1 + "=" + 6);
		}
		if (1 + 2 == 6) {
			System.out.println(1 + "+" + 2 + "=" + 6);
		}
		if (1 + 3 == 6) {
			System.out.println(1 + "+" + 3 + "=" + 6);
		}
		if (1 + 4 == 6) {
			System.out.println(1 + "+" + 4 + "=" + 6);
		}
		if (1 + 5 == 6) {
			System.out.println(1 + "+" + 5 + "=" + 6);
		}
		if (1 + 6 == 6) {
			System.out.println(1 + "+" + 6 + "=" + 6);
		}
		if (2 + 1 == 6) {
			System.out.println(2 + "+" + 1 + "=" + 6);
		}
		if (2 + 2 == 6) {
			System.out.println(2 + "+" + 2 + "=" + 6);
		}
		if (2 + 3 == 6) {
			System.out.println(2 + "+" + 3 + "=" + 6);
		}
		if (2 + 4 == 6) {
			System.out.println(2 + "+" + 4 + "=" + 6);
		}
		if (2 + 5 == 6) {
			System.out.println(2 + "+" + 5 + "=" + 6);
		}
		if (2 + 6 == 6) {
			System.out.println(2 + "+" + 6 + "=" + 6);
		}

		// Ver03
		System.out.println("\n\n3.Ver3");
		for (int y = 1; y <= 6; y++) {
			if (1 + y == 6) {
				System.out.println(1 + "+" + y + "=" + 6);
			}
		}
		for (int y = 1; y <= 6; y++) {
			if (2 + y == 6) {
				System.out.println(2 + "+" + y + "=" + 6);
			}
		}
		for (int y = 1; y <= 6; y++) {
			if (3 + y == 6) {
				System.out.println(3 + "+" + y + "=" + 6);
			}
		}
		for (int y = 1; y <= 6; y++) {
			if (4 + y == 6) {
				System.out.println(4 + "+" + y + "=" + 6);
			}
		}
		for (int y = 1; y <= 6; y++) {
			if (5 + y == 6) {
				System.out.println(5 + "+" + y + "=" + 6);
			}
		}
		for (int y = 1; y <= 6; y++) {
			if (6 + y == 6) {
				System.out.println(6 + "+" + y + "=" + 6);
			}
		}

		// Ver01 : for
		System.out.println("\n\nVer01 : for");
		for (int y = 6; y >= 1; y--)
			for (int x = 1; x <= 6; x++) {
				if (x + y == 6) {
					System.out.println(x + "+" + y + "=" + 6);
				}
			}

		// Ver02 : while
		System.out.println("\n\nVer02 : while");
		int y = 5;
		int x = 0;
		while (y >= 0) {
			while (x < 5) {
				if (x + y == 6) {
					y--;
				}
				x++;
				System.out.println(x + "+" + y + "=" + 6);
			}
		}

		// Ver03 : do while
//		System.out.println("\n\nVer03 : do while");
//		y = 5;
//		x = 0;
//
//			do {
//				if(x+y ==6) {
//
//					y--;{
//						x++;}while(y>=0)
//							while(x<5) {
//								System.out.println();
//				}
//						System.out.println();
//
//			}

	}
}
