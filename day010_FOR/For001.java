package com.company.day010_FOR;

public class For001 {
	public static void main(String[] args) {

		// Ver 01 반복될 한 줄 복사, 붙여넣기, 숫자 바꾸기
		System.out.println("ver-1");
		System.out.println(1); // 시작
		System.out.println(2); // 변화 1씩 증가
		System.out.println(3); // 종

		System.out.println("\n\nver-2");
		// 반복될 한 줄 복사, 붙여넣기, 숫자 바꾸기
		// { } 바뀌는 변수 패턴 for(시작; 종료; 변화)
		for (int i = 1; i <= 3; i++) {
			System.out.println(i);
		}

		System.out.println("ver-3");
		for (int i = 11; i <= 20; i++) {
			System.out.println(i + "\t");
		}
		System.out.println();
		for (int i = 3; i <= 8; i++) {
			System.out.println(i + "\t");
		}
		System.out.println();
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + "\t");
		}
		System.out.println();
		for (int i = 1; i <= 10; i = i + 2) {
			System.out.println(i + "\t");
		}
		System.out.println();
		for (int i = 2; i <= 10; i = i + 2) {
			System.out.println(i + "\t");
		}

	} // end main
} // end class
