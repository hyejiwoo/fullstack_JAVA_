package com.company.day005;

import java.util.Scanner;

public class A028 {
	public static void main(String[] args) {
		// GIGO
		// 변수
		String name = "";
		int kor = 0;
		int eng = 0;
		int math = 0;
		int total = 0;
		float avg = 0.0f;
		String level = "";
		Scanner scanner = new Scanner(System.in);

		// 입력
		System.out.println("국어점수입력 :");
		kor = scanner.nextInt();
		System.out.println("영어점수입력 :");
		eng = scanner.nextInt();
		System.out.println("수학점수입력 :");
		math = scanner.nextInt();

		// 처리
		total = kor + eng + math;
		avg = total / 3.0f;
		level = "Lv" + (int) avg / 10;
//		Lv10 = 100점 > 필요한 값 10 > 100/10 > 정수/정수는 정수
//		Lv9  = 99,98,,,90 > 필요한 값 9 > 99/10 > 정수/정수는 정수
//		Lv8 ""1

		// 출력
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println(":: GREEN IT SCORE ::");
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("국어\t" + "영어\t" + "수학\t" + "총점\t" + "레벨\t" + "평균\t");
		System.out.println(kor + "\t" + eng + "\t" + math + "\t" + total + "\t" + level + "\t" + avg);
//	

	}
}