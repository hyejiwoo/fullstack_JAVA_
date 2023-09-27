package com.company.day007_operator;

public class A015 {
	public static void main(String[] args) {
		// 포폴로 좋음
		double year = 365.2422; // 365일 0.2422일
		year = 365.2422 * 86400; // 초단위

		System.out.println("1. 공전주기를 초단위로" + year);
		System.out.println((int) year / 86400 + "일" + (int) year % 86400 / 3600 + "시간" + (int) year % 3600 / 60 + "분"
				+ (int) year % 60 / 1 + "초");

	} // end main
}// end class

//나무위키-윤년 참고
/*
 * hint1) 1년 365.2422일인데, 365일 5시간 46분 46초 * 초 : 1 1초 분 : 1*60 60초 시 : 1*60*60
 * 3600초 일 : 1*60*60*24 3600*24 86400초
 * 
 * A014 처럼 1원 단위를 사용 = 1초 단위를 사용.
 * 
 * hint2) 일 : 초단위의 시간 / 86400 (일단위로) 시 : (일단위 남은값) / 3600 (시단위로) 분 : (일단위 남은값)ㅇㅎ
 * / 60 (분단위위로) 초 : (일단위 남은값) / 1 (초단위로)
 * 
 * 
 */
