package com.company.day004;

import java.util.Scanner;

public class A020 {
	public static void main(String[] args) {
		// GIGO
		// 변수
		int kor = 0, eng = 0, math = 0, total = 0;
		float avg = 0.0f;
		Scanner scanner = new Scanner(System.in);

		// 입력
		System.out.print("국어점수 입력: ");
		kor = scanner.nextInt();

		System.out.print("영어점수 입력: ");
		eng = scanner.nextInt();

		System.out.print("수학점수  입력: ");
		math = scanner.nextInt();

		// 처리
		total = kor + eng + math;
		avg = (float) total / 3;
		// avg =total/3.0f;
		// avg = total/(float)3;

		// 출력
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println(":: GREEN IT SCORE ::");
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("국어\t영어\t수학\t총점\t평균\t");
		System.out.println(kor + "\t" + eng + "\t" + math + "\t" + total + "\t" + avg + "\t");

	}
}