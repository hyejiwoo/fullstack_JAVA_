package com.company.day011_For;

import java.util.Scanner;

public class For013 {
	public static void main(String[] args) {
		// 1. 예상되는 결과 //1234 ->> 5부터 안나옴 for 빠져나오기.
//		for (int i = 1; i < 11; i++) {
//			if (i == 5) {
//				break;
//			}
//			System.out.println(i + "\t");
//		}
//		System.out.println();

		// 2. 예상되는 결과 // 1234 (5 skip) 678910
//		for (int i = 1; i < 11; i++) {
//			if (i == 5) {
//				continue;
//			}
//			System.out.println(i + "\t");
//		}
//		System.out.println();

		// 3. 무한반복 for(;;){빠져나올장치}
		Scanner scanner = new Scanner(System.in);
		char loof = '\u0000', loof2 = '\u0000';

		for (;;) { // 3-1. for(;;) 무한반복
			System.out.println("Hello :)");
			// 3-2. 빠져나올 장치
			System.out.println("더 인사할래요? O/X? ");
			loof = scanner.next().charAt(0);
			if (loof == 'X') {break;}
		}

		//조건식 for 안에 써주기 가능
		for (; loof2 != 'X';) { // 3-1. for(;;) 무한반복
			System.out.println("HI:)");
			// 3-2. 빠져나올 장치
			System.out.println("더 인사할래요? O/X? ");
			loof2 = scanner.next().charAt(0);
		}
			System.out.println();


		// Q. 1을 입력할때까지 무한반복. for(;;)
		int num = -1;
		for(; num !=1;) {
			System.out.println("1을 입력 받으세요.");
			num = scanner.nextInt();
		}
			//빠져나올 장치
			System.out.println("입력한 숫자는 " + num + "입니다.");

	}
}





