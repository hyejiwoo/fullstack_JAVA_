package com.company.day018;

import java.util.Scanner;

public class repeat2 {
	public static void main(String[] args) {
		
	
		System.out.println("=====2번======");
		
		String result = "";
		String again="다시도전";
		Scanner scanner =  new Scanner(System.in);
		
		//ver1
		while(!result.equals("RED")) {
			System.out.println("빨강의 스펠링은?");
			result = scanner.next()	;
		}
		
		//ver2
		while(true) {
			System.out.println("빨강의 스펠링은?");
			result = scanner.next()	;
					if(!result.equals("RED")) {result = "정답입니다."; break;}
					System.out.println(result);
		}
		
		//ver3
		while(!result.equals("RED")) {
			System.out.println("빨강의 스펠링은?");
			result = scanner.next()	;
			result = result.equals("red")? "정답입니다." : "다시도전";
			System.out.println(result);
		}

//		
//		while(true) {
//		while(true)	{
//					if( result) {	
//						System.out.println("축하합니다!");
//					}break;
//					else if( result) {
//						System.out.println("다시도전!");
//					}
//			}System.out.println();
//		}

	}
}
