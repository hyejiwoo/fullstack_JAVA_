package com.company.day007_operator;

public class A014 {
	public static void main(String[] args) {
		int money=54320;
		int man=0, che=0, hun=0, ten=0, remain=0;
		//1. 단위 	-원 	54320원
		/*
		 * 2.  
		 * 만원짜리 몇개? 5	54320을 10000으로 나누고 
		 * 					money/10000
		 * 천원짜리 몇개? 4	 4320을 1000으로 나누고	
		 * 					  (money%10000)/1000
		 * 백원짜리 몇개? 3   320을	100으로 나누고
		 * 십원짜리 몇개? 2    20을	10으로 나누고
		 * */
		
		man = money/10000;	//5
		remain = money%10000;	//4320
		
		che = remain/1000;
		remain = remain%1000;
		
		hun = remain/100;
		remain = remain%100;
		
//		remain = remain%10;
//		
//		System.out.println(man + "/" + che + "/" + hun );
//		System.out.println(remain);
		
		ten = remain/10;
		System.out.println("만원" + man + "장, 천원"
								  + che + "장, 백원"
								  + hun + "장, 십원"
								  + ten + "장");			
		
		
	}
}
