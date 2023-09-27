package com.company.day002_3;

public class Homework002 {
	public static void main(String[] args) {
		// GIGO
		// 변수
		// 입력
		int kor = 100, eng = 100, math = 99, total = 0;
		// 처리
		total = kor + eng + math;
		// 출력 : 299

		System.out.println("총점 : " + total); // A
		System.out.printf("총점 : %d" , total); // B

//		GIGO
//		입력
//		int kor=100, eng=100, math=99, total=0;
//		처리
//		total = kor+eng+math;
//		출력
//		System.out.println("총점 : %d", total);
	}
}
