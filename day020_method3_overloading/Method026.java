package com.company.day020_method3_overloading;

import java.util.Scanner;

public class Method026 {
	public static void main(String[] args) {
		System.out.println("● 유저정보처리 배열 + 메서드");
		//	Q. 메서드를 이용하여 다음 프로그램을 작성하시오.
		String[][] users= {{"aaa", "111", "한국"}, {"bbb", "222", "호주"},{"ccc", "333", "중국"}};
		//	#1. 사용자에게 입력을 받는 메서드를 입력하세요.
		who_are_you(users); //사용자에게 입력을 받는 메서드
		//	#2. 정보를 출력해주는 메서드를 작성하시오.
		who_pass_change(users);	
	}
	
	public static void who_are_you(String[][] users) {
		String [][]users1 =new String[0][0];
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("아이디를 입력하시오 > " + users1);
		 

	}
	
	public static void who_pass_change(String[][] users) {
		System.out.println();
		return;
	}
	
}
