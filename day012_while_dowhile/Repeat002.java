package com.company.day012_while_dowhile;

public class Repeat002 {
	public static void main(String[] args) {

		// {} {변수} for(시작;종료;변화)



		// Q1) 1 2 3 4 5

		// for
		System.out.println("Q1) 1 2 3 4 5");
		for (int i = 1; i < 6; i++) { // i<=5 = i<6
			System.out.print(i + "\t");

			// while
			while (i < 6) {
				System.out.println(i + "\t");
				i++;
			}

			// do while
			i = 1;
			do {
				System.out.println(i + "\t");
				i++;
			} while (i < 6);

		}




		// Q2) 5 4 3 2 1

		// for
		System.out.println("\nQ2) 5 4 3 2 1");
		for (int i = 5; 1 < i; i--) {
			System.out.println(i + "\t");

			// while
			i = 5;
			while (1 < i) {
				System.out.println(i);
				i--;
			}

			// do while

			i = 5;
			do {
				System.out.print(i + "\t");
				i--;
			} while (1 < i);
		}




		// Q3) JAVA1 JAVA2 JAVA3

		// for
		System.out.println("\nQ3) JAVA1  JAVA2  JAVA3");
		for (int i = 1; i < 4; i++) {
			System.out.println("JAVA" + i + "" + "\t");

			// while

			i = 1;
			while (i < 4) {
				System.out.print("JAVA" + i + "" + "\t");
				i++;
			}

			// do while

			i = 1;
			do {
				System.out.print("JAVA" + i + "" + "\t");
				i++;
			} while (i <= 3);

		}
	}
}