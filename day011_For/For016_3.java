package com.company.day011_For;

import java.util.Scanner;

public class For016_3 {
	public static void main(String[] args) {
		String name = "";
		int kor=-1, eng=-1, math=-1, total=0;
		double avg = 0.0;
		String jang = "", pass="", lv="",
				korlv="",englv="",mathlv="";
		Scanner scanner = new Scanner(System.in);

		System.out.println("이름 입력 >");
		name = scanner.next();
		for(;!(kor>=0 && kor<=100);) {
			System.out.println("국어입력>");
			kor = scanner.nextInt();
		}
		for(;!(eng>0 && eng<100);) {
			System.out.println("영어>");
			eng = scanner.nextInt();
		}
		for(;!(math>0 && math<100);) {
			System.out.println("수학>");
			math = scanner.nextInt();
		}

		total = kor + eng +math;
		avg   = total/3.0;
		jang  = avg>=95? "장학생":"";
		pass  = avg<70? "불합격": kor<40||eng<40||math<40? "재시험":"합격";

		for(int i=0; i<(int)avg/10; i++) {lv+="★";}
		korlv += kor + "(" + (kor>=90?"수" : kor>=80?"우":
						kor>=70?"미": kor>=60?"양": "가") +")";
		englv  += eng + "(" + (eng>=90?"수" : eng>=80?"우":
						eng>=70?"미": eng>=60?"양": "가") +")";
		mathlv += math + "(" + (math>=90?"수" : math>=80?"우":
						math>=70?"미": math>=60?"양": "가") +")";

		System.out.println("===============================================================================================");
		System.out.println("이름" + "\t" +"국어"+"\t"+"영어"+"\t"+"수학"+"\t"+"총점"+"\t"+"평균"+"\t"+"합격여부"+"\t"+"장학생"+"\t"+"레벨");
		System.out.println("===============================================================================================");
		System.out.println(name + "\t" + korlv + "\t" + englv + "\t" + mathlv + "\t" + total + "\t" + String.format("%.2f", avg) + "\t" + pass + "\t" + jang + "\t"+ lv);

	}
}
