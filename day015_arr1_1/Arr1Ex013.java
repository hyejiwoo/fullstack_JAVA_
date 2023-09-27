package com.company.day015_arr1_1;

import java.util.Arrays;

public class Arr1Ex013 {
	public static void main(String[] args) {
		// 1. 평균 구하시오.
		// 2. 합격 , 재시험, 불합격
		// 평균이 70이상이면 "합격"
		// 단, 세과목중에서 한 과목이라도 40미만이면 합격이 아니라 "재시험"
		// 평균이 70미만이면 무조건 "불합격"을 구하시오.
		// 3. 장학생 - 평균 95점 이상이면 장학생으로 처리하시오.

		// (평균이 70 이상이면) {"합격"} -> if(aver >= 70) {pass = "합격"}
		// (세과목 중에서 한 과목이라도 40점 미만이면) {"재시험"} -> if(< 40) { pass = "재시험"}
		// (평균이 70점 미만이면) {"불합격"} -> if(aver < 70) {pass = "불합격"}
		// (평균이 95점 이상이면) {"장학생"} -> if(aver >= 95) {jang = "장학생"}

		// for(int i = 0; i < aver.length; i++){
		// if(aver >= 70){pass = "합격"}

		String name[] = { "아이언맨", "헐크", "캡틴", "토르", "호크아이" };
		int kor[] = { 100, 20, 90, 70, 35 };
		int eng[] = { 100, 50, 95, 80, 100 };
		int mat[] = { 100, 30, 90, 60, 100 };
		int[] aver = new int[5];
		String pass[] = new String[5];
		String jang[] = new String[5];

		for (int i = 0; i < aver.length; i++) {
			aver[i] = (kor[i] + eng[i] + mat[i]) / 3;
		}
		System.out.println(Arrays.toString(aver));

		for (int i = 0; i < pass.length; i++) {
			if (aver[i] >= 70) {
				pass[i] = "합격";
			} else if (aver[i] < 70) {
				pass[i] = "불합격";
			} 
		}
		
		for(int i = 0; i < pass.length; i++) {
			 if(kor[i] < 40 || eng[i] < 40 || mat[i] < 40) {
				 pass[i] = "재시험";
			 }
		}

		for (int i = 0; i < jang.length; i++) {
			if (aver[i] >= 95) {
				jang[i] = "장학생";
			} else if (aver[i] < 95) {
				jang[i] = "----";
			}
		}

		System.out.println(
				":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("이름 \t 국어 \t 영어 \t 수학 \t 평균 \t 합격여부 \t 장학생");
		System.out.println(
				":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println(name[0] + " \t  " + kor[0] + " \t  " + eng[0] + " \t  " + mat[0] + " \t  " + aver[0]
				+ " \t  " + pass[0] + " \t  " + jang[0]);
		System.out.println(name[1] + " \t   " + kor[1] + "  \t   " + eng[1] + " \t   " + mat[1] + " \t   " + aver[1]
				+ " \t  " + pass[1] + " \t  " + jang[1]);
		System.out.println(name[2] + " \t   " + kor[2] + "  \t   " + eng[2] + " \t   " + mat[2] + " \t   " + aver[2]
				+ " \t  " + pass[2] + " \t  " + jang[2]);
		System.out.println(name[3] + " \t   " + kor[3] + "  \t   " + eng[3] + " \t   " + mat[3] + " \t   " + aver[3]
				+ " \t  " + pass[3] + " \t  " + jang[3]);
		System.out.println(name[4] + " \t   " + kor[4] + "  \t   " + eng[4] + " \t   " + mat[4] + " \t   " + aver[4]
				+ " \t  " + pass[4] + " \t  " + jang[4]);

	}

}
