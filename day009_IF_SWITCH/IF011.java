package com.company.day009_IF_SWITCH;

import java.util.Scanner;

public class IF011 {
	public static void main(String[] args) {
		//1~5세 사이의 어린이의 나이를 구하시오.
		//1~5세가 아니라면 어린이의 나이는 1~5세 사이가 아닙니다.
		//1~5세라면 어린이의 나이는 3세입니다.
		Scanner scanner = new Scanner(System.in);
		int age = 0; String result="어린이의 나이는 1~5세 사이가 아닙니다.";
		
		System.out.println("어린이의 나이를 입력하시오. >");
		age = scanner.nextInt();
		
		
		//ver1  **if 안에 if 중첩 가능**
		if(age>=1) {;}
		if(age<=5) {;}
		result ="어린이의 나이는" + age + "세 입니다.";
		
		
		
		//ver2
		if(age >= 1 && age <= 5) {result = "어린이의 나이는" + age + "세 입니다.";}	

		
		System.out.println(result);


	}
}
