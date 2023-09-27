package com.company.day010_FOR;

public class For009 {
	public static void main(String[] args) {
		// ver0 서기1년 ~ 서기 2023년 중에서 윤년의 갯수를 출력 : 490

		//ver1 ~ 3 => 공통 int count=0;

		//ver1 서기 1년이 윤년이라면 갯수 카운트
		//ver1 서기 2년이 윤년이라면 갯수 카운트

		//ver2 if(서기 1년이 윤년이라면) {갯수 카운트}
		//ver2 if(서기 2년이 윤년이라면) {갯수 카운트}

		//ver3 if(1%4==0 && 1%100 != 0 || 1%400==0) {count++}
		//ver3 if(2%4==0 && 2%100 != 0 || 2%400==0) {count++}
		//ver3 if(3%4==0 && 3%100 != 0 || 3%400==0) {count++}

		//ver4 {} {변수} for (시작; 종료; 변화)

		int cnt=0;
		for(int year=1; year<=2023; year++)
		{if(year%4==0 && year%100 != 0 || year%400==0) {cnt++;}}
		System.out.println("서기1년 ~ 서기 2023년 중에서 윤년의 갯수를 출력 :" + cnt);


		}

	}

