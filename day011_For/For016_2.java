package com.company.day011_For;

import java.util.Scanner;

public class For016_2 {
	public static void main(String[] args) {
		String name = "";
		int kor, eng, math, total = 0;
		double avg = 0.0;
		String jang = "", pass = "", lv = "", korlv = "", englv = "", mathlv = "";
		Scanner scanner = new Scanner(System.in);

		System.out.println("이름 입력 >");
		name = scanner.next();
		for (;;) {
			System.out.println("국어 입력>");
			kor = scanner.nextInt();
			if (kor >= 0 && kor <= 100) {
				break;
			} // 1-2 범위면 = 잘 봤으면 나와!
		}
		for (;;) {
			System.out.println("영어 입력>");
			eng = scanner.nextInt();
			if (eng >= 0 && eng <= 100) {
				break;
			} // 1-2 범위면 = 잘 봤으면 나와!
		}
		for (;;) {
			System.out.println("수학 입력>");
			math = scanner.nextInt();
			if (math >= 0 && math <= 100) {
				break;
			} // 1-2 범위면 = 잘 봤으면 나와!
		}
		total = kor + eng + math;
		avg = total / 3.0;
		jang = avg >= 95 ? "장학생" : "";
		pass = avg < 70 ? "불합격" : kor < 40 || eng < 40 || math < 40 ? "재시험" : "합격";

		for (int i = 0; i < (int) avg / 10; i++) {
			lv += "★";
		}
		korlv += kor + "(" + (kor >= 90 ? "수" : kor >= 80 ? "우" : kor >= 70 ? "미" : kor >= 60 ? "양" : "가") + ")";
		englv += eng + "(" + (eng >= 90 ? "수" : eng >= 80 ? "우" : eng >= 70 ? "미" : eng >= 60 ? "양" : "가") + ")";
		mathlv += math + "(" + (math >= 90 ? "수" : math >= 80 ? "우" : math >= 70 ? "미" : math >= 60 ? "양" : "가") + ")";

		System.out.println(
				"===============================================================================================");
		System.out.println("이름" + "\t" + "국어" + "\t" + "영어" + "\t" + "수학" + "\t" + "총점" + "\t" + "평균" + "\t" + "합격여부"
				+ "\t" + "장학생" + "\t" + "레벨");
		System.out.println(
				"===============================================================================================");
		System.out.println();

	}
}
