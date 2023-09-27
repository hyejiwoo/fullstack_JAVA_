package com.company.day020_method3_overloading;

import java.util.Arrays;

public class Method022 {
	public static void main(String[] args) {
		System.out.println("● 아이언맨과 헐크의 순서변경 프로그램");
		//	Q. 다음 문자열 배열에서 아이언맨과 헐크의 순서를 변경하는 프로그램을 작성하시오.
		String [] name = {"아이언맨", "헐크", "캡틴"};
		disp_swipe(name);
		System.out.println(Arrays.toString(name));
	}
	private static void disp_swipe(String[] name) {	
		String temp = "";
		
		temp = name[0];
		name[0] = name[1];
		name[1] = temp;
			
	}
}
