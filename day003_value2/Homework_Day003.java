package com.company.day003_value2;

import java.util.Scanner;

public class Homework_Day003 {
	public static void main(String[] args) {
		// GIGO
		// 변수
		int kor = 0;
		int eng = 0;
		int math = 0;
		int sie = 0;
		int all = 0;
		double av = 0.0f;
		Scanner scanner = new Scanner(System.in);

		// 입력
		System.out.print("국어점수 입력:");
		kor = scanner.nextInt();
		System.out.println("영어점수 입력:");
		eng = scanner.nextInt();
		System.out.println("수학점수 입력:");
		math = scanner.nextInt();
		System.out.println("과학점수 입력:");
		sie = scanner.nextInt();

		// 처리
		all = kor + eng + math + sie;
		av = all / 4;

		// 출력
		System.out.println("총점 :" + all);
		System.out.println("평균 :" + av);
	}
}
