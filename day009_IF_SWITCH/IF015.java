package com.company.day009_IF_SWITCH;

import java.util.Scanner;

public class IF015 {
	public static void main(String[] args) {
		//변수
		String stdid="";
		int kor=0, eng=0, math=0, tot=0;
		float avg=0f;
		String result = "";
		String retest ="불합격", grade="가", good="-";
		
		Scanner scanner = new Scanner(System.in);
		
		//입력
		System.out.print("학번 입력 > ");
		stdid=scanner.next();
		System.out.print("국어 입력 > ");
		kor=scanner.nextInt();
		System.out.print("영어 입력 > ");
		eng=scanner.nextInt();
		System.out.print("수학 입력 > ");
		math=scanner.nextInt();
		
		//처리
		tot = kor+eng+math;
		avg = tot/3f;
		// 1. 장학생
		if (avg >= 95) {good="장학생"; }

		
		// 2. 합격, 재시험, 불합격
		if (avg >=70) {
			retest="합격";
			if (kor<40 || eng<40 || math<40) {retest="재시험";}
		}

				
		// 3. 성적 처리 수우미양가
		if(avg>=90) 	 {grade="수";}
		else if(avg>=80) {grade="우";}
		else if(avg>=70) {grade="미";}
		else if(avg>=60) {grade="양";}
		
		
		result += stdid + "\t" + kor + "\t" + eng + "\t" + math;
		result += "\t"+ tot + "\t" + String.format("%.2f", avg);
		result += "\t" + retest + "\t" + good + "\t" + grade;
		
		//출력
		System.out.println("=========================================================================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t합격여부\t장학생\t레벨");
		System.out.println("=========================================================================================");
		System.out.println(result);

		

    }
    
}
