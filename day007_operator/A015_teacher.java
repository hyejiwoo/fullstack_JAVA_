package com.company.day007_operator;

public class A015_teacher {
	public static void main(String[] args) {
		double year = 365.2422;		//365일 0.2422일
		double remain = 0.0;
		int day=0, hour=0, min=0, sec=0;
		
		day = (int) ((year)/(60*60*24));
		remain =year%(60*60*24);	//나머지 연산자 % 0.2422
		//초단위로 구한 365.2422일 / 초단위로 구한 일
		hour = (int)(remain/(60*60));
		remain = year%(60*60);
		
		min=  (int)(remain/(60));
		sec = (int)(year%60);
		
				
		
		System.out.println("공전주기를 단위로:" + year);
		 ////작은 초단위로 변경
		/*
		 * 1일 365일 0.2422 * 86400 = 365.2422일에 대한 초
		 * 1일 		 86400*1	= 1일
		 * 2일 		 86400*2	= 2일
		 * 3일 		 86400*3	= 3일
		 * 365.2422일		86400*365.2422		
		 
		   hint1)
		 * 1년 365.2422일인데,
		 * 365일 5시간 46분 46초 
		 *  * 
		 * 초	: 1				1초
		 * 분	: 1*60			60초
		 * 시	: 1*60*60		3600초
		 * 일   : 1*60*60*24	3600*24 86400초
		 * 
		 * (A014 처럼 1원 단위를 사용 = 1초 단위를 사용.)
		 
		  hint2)
		 * 일 : 초단위의 시간   / 86400 (일단위로)
		 * 시 :	(일단위 남은값) / 3600 (시단위로)
		 * 분 : (일단위 남은값) / 60 (분단위위로)
		 * 초 : (일단위 남은값) / 1 (초단위로)
		 * 
		 *  **가로 잘**
		 *  
		 */
		
		//2일 365.2422*2 =2일
		
	}
}