package com.company.day009_IF_SWITCH;

import java.util.Scanner;

public class switch004 {
	public static void main(String[] args) {
		int num =0;
		String result ="";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자 1개 입력받기 >");
		num = scanner.nextInt();
		
		switch (num) {
		// case 3 || 4 || 5
		// case 3 , 4 , 5 -> 최신버전만 됨.
		// case 3: case 4: case 5:  -> 제일 안정적. 정답!
		case 3,4,5   : result   = "봄이다."; break;
		case 6,7,8   : result   = "여름이다."; break;
		case 9,10,11 : result = "가을이다."; break;
		case 12,1,2  : result  = "겨울이다."; break;
		}
		System.out.println(result);
	}
}
