package com.company.day007_operator;

public class Q016 {
	public static void main(String[] args) {
		char ch = 'z';
		boolean result;

				
		//입력
		//처리
		result = (ch>='A' & ch<='Z') || (ch>='a' & ch<='z') || (ch>='0' & ch<='9');
		
		//출력
		System.out.println(result);
		System.out.println();
	}
}
