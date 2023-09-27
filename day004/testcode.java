package com.company.day004;

import java.util.Scanner;

public class testcode {
	public static void main(String[] args) {
		// 변수
		int kor = 0;
		int eng = 0;
		int math = 0;
		int total = 0;
		float avg = 0.0f;
		Scanner scanner = new Scanner(System.in);

		// 입력
		System.out.print("국어점수 입력 : ");
		kor = scanner.nextInt();
		System.out.print("영어점수 입력 : ");
		eng = scanner.nextInt();
		System.out.print("수학점수 입력 : ");
		math = scanner.nextInt();

		// 처리
		total = kor + eng + math;
		avg = (float) total / 3;

		// 출력
		System.out.println("::::::::::::::::::::::::::::::::::::::::::");
		System.out.println(":: GREEN IN SCORE ::");
		System.out.println("::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println(kor + "\t" + eng + "\t" + math + "\t" + total + "\t" + avg);
		System.out.printf("소수점 3자리까지: %.3f\n", avg); // 1은 printf
		// math이용
//      Math.
//      avg
//      System.out.printf("소수점 3자리까지: %f", avg);
//      // 2는 연산부
//      // 3은 math
//      // 4는 string

		scanner.close();

	}
}