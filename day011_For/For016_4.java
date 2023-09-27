package com.company.day011_For;

import java.util.Scanner;

public class For016_4 {
	public static void main(String[] args) {
		String name = "";
		int kor=-1, eng=-1, math=-1, total=0;
		double avg = 0.0;
		String jang = "", pass="", lv="",
				korlv="",englv="",mathlv="";
		Scanner scanner = new Scanner(System.in);

		System.out.println("이름 입력 >");
		name = scanner.next();
		for(;;) {
		if(!(kor>=0 || kor<=100)) {
			System.out.println("국어입력>");
			kor = scanner.nextInt();
		}
		else if(eng<0 || eng>100) {
			System.out.println("영어>");
			eng = scanner.nextInt();
		}
		else if(math>0 || math<100) {
			System.out.println("수학>");
			math = scanner.nextInt();
		}else {break;}
	 }

	}
}
