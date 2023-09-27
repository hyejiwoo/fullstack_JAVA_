package com.company.day008_IF;

import java.util.Scanner;

public class IF003_t {
	public static void main(String[] args) {
		int num =0;
		String result="";
		Scanner Scanner; Scanner = new Scanner(System.in);
		
		System.out.println("숫자 한 개 입력 >");
		
		num = Scanner.nextInt();
		
		if(num<0) {System.out.println("양수") ;}
		else if(num>0)  {System.out.println("음수");}
		else 	{System.out.println("Zero");}

//		  package com.company.day008;
//
//		  import java.util.Scanner;
//
//		  public class IF003 {
//		  	public static void main(String[] args) {
//		  		//변수
//		  		int num=0;
//		  		String result="";
//		  		Scanner sc = new Scanner(System.in);
//		  		
//		  		//입력
//		  		System.out.print("숫자 한개 입력 > ");
//		  		num = sc.nextInt();
//		  		
//		  		//처리
//		  		if(num>0) {result = "양수";}
//		  		else if (num==0) {result = "zero";}
//		  		else {result = "음수";}
//		  		
//		  		// 추가!!!
////		  		result = num>0? "양수" :
////		  				 num<0? "음수" : "zero";
//		  		
//		  		//출력
		  	System.out.println(result);
//		  	}
//		  }

		  
	}
}
