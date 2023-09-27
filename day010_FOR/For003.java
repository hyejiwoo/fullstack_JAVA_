package com.company.day010_FOR;

import java.util.Scanner;

public class For003 {
	public static void main(String[] args) {
		// FOR 구구단
		// 사용자에게 단을 입력받아 FOR문을 이용하여 해당하는 단을 출력해주는 프로그램을 작성하라.
		int a = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.print("원하는 단을 입력해주세요.>");
		a = scanner.nextInt();

		for (int i = 1; i <= 9; i++) {

			// //VER1 - 바뀌는 변수
			// System.out.println("2*1=2");
			// System.out.println(a + "*" + 1 + "=" + (a*1));
			// System.out.println(a + "*" + 2 + "=" + (a*2));

			// VER-2 {}먼저 적기. {변수} for(시작;종료;변화) / 쪼개서 반복할 것 찾기
			// System.out.println(2 + "*" + 1 + "=" + 2*1); //2*1=2
			// System.out.println(2 + "*" + 2 + "=" + 2*2); //2*1=2
			// System.out.println(2 + "*" + 3 + "=" + 2*3); //2*3=6

			// //VER-3단을 입력받고
			// System.out.println(a + "*" + 1 + "=" + a*1); //시작 1
			// System.out.println(a + "*" + 2 + "=" + a*2); //변화 1씩 증가
			// System.out.println(a + "*" + 3 + "=" + a*3); //종료 9

			System.out.println(a + "*" + i + "=" + a * i);

		}
	}
}
