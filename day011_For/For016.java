package com.company.day011_For;

import java.util.Scanner;

public class For016 {
	public static void main(String[] args) {
		//내가 짠 코드 = 쓰렉이 ㅎ
		//평균 점수에 따라  95졈 이상이면 장학생을 구하시요
		//구거
		int kor=0, eng =0, math=0, tot=0;
		float avg = 0.0f;
		String result ="";
		String retest = "불합격", name =" ", good ="", grade ="가", level="";
		Scanner scanner = new Scanner(System.in);

		System.out.println("이름 입력 >");
		name = scanner.next();
		System.out.println("국어 입력 >");
		kor = scanner.nextInt();
		System.out.println("영어 입력 >");
		eng = scanner.nextInt();
		System.out.println("수학 입력 >");
		math = scanner.nextInt();


		//처리
		tot = kor+eng+math;
		avg= tot/3f;


		//합격 여부
		if (avg >=70) {
			retest="합격";
			if (kor<40 || eng<40 || math<40) {retest="재시험";}
		}else if(kor<70 || eng<70 || math<70) {retest="불합격";}


		//성적 처리 수우미양가
		if(kor>=90 || eng>=90 || math>=90) {grade="수";}
		else if(kor>=80 || eng>=80 || math>=80) {grade="우";}
		else if(kor>=70 || eng>=70 || math>=70) {grade="미";}
		else if(kor>=60 || eng>=60 || math>=60 ) {grade="양";}

		//장학생
		if (avg >= 95) good="장학생";

		//레벨
		if (avg >=90) {level = "★★★★★★★★★";}
		else if(avg>=80) {level ="★★★★★★★★";}

		result += name + "\t" + kor + "(" + grade + ")" + "\t" + eng +"(" + grade + ")"+ "\t" + math + "(" + grade + ")";
		result += "\t"+ tot + "\t" + String.format("%.2f", avg) + "\t" + retest + "\t" + good + "\t" + level;

		System.out.println("===============================================================================================");
		System.out.println("이름" + "\t" +"국어"+"\t"+"영어"+"\t"+"수학"+"\t"+"총점"+"\t"+"평균"+"\t"+"합격여부"+"\t"+"장학생"+"\t"+"레벨");
		System.out.println("===============================================================================================");
		System.out.println(result);

	}
}
