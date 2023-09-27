package com.company.day004;

import java.util.Scanner;

public class Repeat {
	public static void main(String[] args) {

		int kor = 0;
		int eng = 0;
		int math = 0;
		int total = 0;
		int avg = 0;

		Scanner scanner = new Scanner(System.in);

		kor = scanner.nextInt();
		System.out.println("국어 점수 입력 :");

		eng = scanner.nextInt();
		System.out.println("영어 점수 입력 :");

		math = scanner.nextInt();
		System.out.println("수학 점수 입력 :");

		total = kor + eng + math;
		System.out.println("총점 : ");

		avg = total / 3;
		System.out.println("평균 :");

	}
}
