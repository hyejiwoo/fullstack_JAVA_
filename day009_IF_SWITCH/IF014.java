package com.company.day009_IF_SWITCH;

import java.util.Scanner;

public class IF014 {
	public static void main(String[] args) {
		//IF만 이용해서 성적처리 프로그램을 작성
		/*
		 * 0) 학번 담을 자료형 선택해 stdid라 변수명을 정하고 입력 받으시오.
		 * 1) 국어점수 담을 자료형 선택해 kor이라 변수명을 정하고 입력 받으시오.
		 * 2) 영어점수 담을 자료형 선택해 eng이라 변수명을 정하고 입력 받으시오.
		 * 3) 영어점수 담을 자료형 선택해 math이라 변수명을 정하고 입력 받으시오.
		 * 4) 총점점수 담을 자료형 선택해 tot이라 변수명을 정하고 총점 구하시오.
		 * 5) 평균점수 담을 자료형(float) 선택해 avg 이라 변수명을 정하고 평균 구하시오.
		 * 6) 평균 95 이상이면 장학생으로 처리하시오.
		 * 7) 평균 점수 90이상 수, 80이상 우, 70이상 미, 60이상 양, 나머지 가로 처리하시오.
		 * 
		 * */
		
		String stdid ="";
		int kor=0, eng=0, math=0, tot=0;
		float avg = 0.0f;
		String pass = "불합격", lv = "가", st = "-";
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("학번 입력 >");
		stdid = scanner.next();
		System.out.println("국어점수 입력 >");
		kor = scanner.nextInt();
		System.out.println("영어점수 입력 >");
		eng = scanner.nextInt();
		System.out.println("수학점수 입력 >");
		math = scanner.nextInt();
				
		tot = kor + eng + math;
		avg = (float)tot/3;
	
		/* 장학생 */
		if(avg>=95) st="장학생";
		
		/* 합격 */
		if(avg>=70) {
			pass="합격";
			if(kor <40 || eng <40 || math<40) {pass="재시험";}
		}
		
		/* 레벨 */
		if(avg>=90) {lv ="수";}
		else if(avg>=80) {lv ="우";}
		else if(avg>=70) {lv ="미";}
		else if(avg>=60) {lv ="양";}
		/*else  lv="가"는 제외.*/
		
		System.out.println("====================================================================================================");
		System.out.println("학번\t" + "국어\t" + "영어\t" + "수학\t" + "총점\t" + "평균\t" + "합격여부\t" + "레벨\t" + "장학생\t");
		System.out.println("====================================================================================================");
		System.out.println(stdid + "\t" + kor + "\t" + eng + "\t" + math + "\t" + tot + "\t" + avg + "\t"+ pass  + "\t" + lv  + "\t" + st);	
			
	}		
	
}
