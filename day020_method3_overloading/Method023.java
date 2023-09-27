package com.company.day020_method3_overloading;

import java.util.Scanner;

public class Method023 {
	public static void main(String[] args) {
		System.out.println("● , 를 기준으로 문자열 분리 프로그램");
		String userinput = "";
		String [] input = {"",""};
		Scanner scanner = new Scanner(System.in);
		
		userinput = user_input();
		user_show(userinput, input);
		
		System.out.println(", 가 들어가게 문자열을 입력하세요 >");
		userinput = scanner.next();
		
		System.out.println(userinput);
	
	}

	private static void user_show(String userinput, String[] input) {		
		userinput = "Hi, sally";
		// 결과 : input[0] <= hi 		input[1] <=sally
		System.out.println("1. hi, sally 문자열에 들어가 있는 h 뽑아오기 :" + userinput.charAt(0));
		System.out.println("2. hi, sally 문자열에 들어가 있는 i 뽑아오기 :" + userinput.charAt(1));
		System.out.println("3. hi, sally 문자열에 들어가 있는 , 뽑아오기 :" + userinput.charAt(2));
		System.out.println("4. input[0] 문자열에 h , i 누적시키기");
		input[0] += userinput.charAt(0);
		input[0] += userinput.charAt(1);
		System.out.println(input[0]);
		
	}
	private static String user_input() {
		return null;
	}
	
	
	
}
