package com.company.day012_For;

import java.util.Scanner;

public class Repeat {
	public static void main(String[] args) {
		int kor=-1, eng=-1, math=-1, tot=0;
		double avg = 0.0;
		String name="",
				korlv="",englv="",mathlv="",
				jang = "", pass="", lv="";
		Scanner scanner = new Scanner(System.in);

		System.out.println("이름 입력 >");
		name = scanner.next();
		for(;!(kor>=0 && kor<=100);) {
			System.out.println("국어 입력>");
			kor = scanner.nextInt();
		}
		for(;!(eng>0 && eng<100);) {
			System.out.println("영어 입력>");
			eng = scanner.nextInt();
		}
		for(;!(math>0 && math<100);) {
			System.out.println("수학 입력>");
			math = scanner.nextInt();
		}

		tot = kor+eng+math;
		avg = tot/3.0;
		jang = avg>=95? "장학생":"";
		pass = avg<70? "불합격": kor<40||eng<40||math<40? "재시험":"합격";

		for(int i=0; i<(int)avg/10; i++)
		{lv+="★";}
		korlv += kor + "(" + (kor>=90?"수" : kor>=80?"우": kor>=70?"미": kor>=60?"양": "가") +")";
		englv  += eng + "(" + (eng>=90?"수" : eng>=80?"우": eng>=70?"미": eng>=60?"양": "가") +")";
		mathlv += math + "(" + (math>=90?"수" : math>=80?"우": math>=70?"미": math>=60?"양": "가") +")";

		System.out.println("===============================================================================================");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t합격여부\t장학생\t레벨");
		System.out.println("===============================================================================================");
		System.out.println(name + "\t" + korlv + "\t" + englv + "\t" + mathlv + "\t" + tot + "\t" + String.format("%.2f", avg) + "\t" + pass + "\t" + jang + "\t"+ lv);

	}
}