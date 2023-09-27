package com.company.day009_IF_SWITCH;

import java.util.Scanner;

public class switch001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =0; String result = "";
		Scanner scanner = new Scanner(System.in);
		
		//if - ver
				 if(a == 1) {result = "1이다.";}
			else if(a == 2) {result = "2이다.";}
			else if(a == 3) {result = "3이다.";}
			else			{result = "1,2,3이 아니다.";}
			System.out.println(result);
	
			/*
			 * Switch - ver
			 * 
			 * switch (대상) {
			 * case 상태 : 처리내용; break;
			 * case 상태 : 처리내용; break;
			 * case 상태 : 처리내용; break;
			 * default : case 상태가 아닐때 기본처리. 생략가능 
			 * 
			 * 
			 * */
			
			//break 모두 꼭 넣어주기.
			switch( a ) {
			case 1 : result = "1이다.";	break;
			case 2 : result = "2이다.";	break;
			case 3 : result = "3이다.";	break;
			default : result = "1,2,3이 아니다.";
			}
			System.out.println(result);
	}

}
/*+
 * 1. 숫자 한 개 입력받기
 * 2. if 다형식을 이용해서 1,2,3 이다 출력
 * */
