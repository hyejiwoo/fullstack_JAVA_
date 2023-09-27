package com.company.day007_operator;

import java.util.Scanner;

public class A013 {
	public static void main(String[] args) {
//		학번 담을 자료형선택해 학번이라 변수명을 정하고 입력
//		국어점수 담을 자료형선택해 kor이라 변수명을 정하고 입력
//		영어점수 담을 자료형선택해 eng이라 변수명을 정하고 입력
//		수학점수 담을 자료형선택해 math이라 변수명을 정하고 입력
//		
//		총 점수 담을 자료형선택해 tot이라 변수명을 정하고 총점을 구하시오
//		평균점수 담을 자료형(float)선택해 avg이라 변수명을 정하고 평균 구하시오.

		/*
		 * 6. 평균 점수에 따라 95 이상이면 장학생을 구하시오(삼항연산자이용) 7. 평균점수에 따라 90이상 수,9 80이상 우,8 70이상
		 * 미,7 60 이상 양,6 나머지 가를 남기고 점수대별 lv를 체크하시오. (삼항연산자이용) 8. 평균이 60 이상이면 "합격" 아니면
		 * "불합격"을 구하시오(삼항연산자이용)
		 * 
		 */

		// 변수

		String num = "";
		String result = "";
		String level = "";
		String st = "";
		
		int kor = 0;
		int eng = 0;
		int math = 0;
		int tot = 0;
		float avg = 0.0f;

		Scanner scanner = new Scanner(System.in);

		// 입력
		System.out.println("학번 입력  >");
		num = scanner.nextLine();

		System.out.println("국어점수입력 >");
		kor = scanner.nextInt();

		System.out.println("영어점수입력 >");
		eng = scanner.nextInt();

		System.out.println("수학점수입력 >");
		math = scanner.nextInt();

		System.out.println(tot > 95 ? "장학생" : "");

		// 처리
		tot = kor + eng + math;
		avg = tot / 3.0f;

		level = (avg >= 90 ? "수(lv9)" : "8");

		result = (avg >= 60 ? "합격" : "불합격");

		st = (tot >= 95 ? "장학생" : " ");

		System.out.println(":::::::::::::::::::::::::::::::::::::");
		System.out.println(":: GREEN IT SCORE ::");
		System.out.println(":::::::::::::::::::::::::::::::::::::");

		System.out.println("학번" + "\t" + "국어" + "\t" + "영어" + "\t" + "수학" + "\t" + "총점" + "\t" + "평균" + "\t" + "합격여부"
				+ "\t" + "레벨" + "\t" + "장학생");

		System.out.println(num + "\t" + kor + "\t" + eng + "\t" + math + "\t" + tot + "\t" + avg + "\t" + result + "\t"
				+ level + "\t" + st);

	}

}
