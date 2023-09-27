package com.company.day014_arr1;

import java.util.Arrays;

public class Arr1Ex003 {
	public static void main(String[] args) {
		// <모음 갯수 구하기>

		// new 사용하여 문자열 배열 ch 52개 만들기
		char ch[] = new char[52];

		// 대문자 A~Z, a~z까지 52개의 데이터를 for를 이용하여 ch 배열에 데이터를 대입
		// 1. 데이터 타입

		// ver 0
		// 만약 25이 Z 그 다음 데이터를 소문자로 'a' 초기화
		// 만약 data가 Z라면 그 다음 데이터를 소문자로 'a' 초기화

		// ver1
		// if (만약 25번이 Z라면 그 다음 데이터를) {소문자로 'a'로 초기화}
		// if(data가 Z라면 그 다음 데이터를 ){ 소문자로 'a'로 초기화}

		// for문을 이용하여 모음의 갯수를 구하라.
		// char data = 'A';
		// for(int i=0; i<ch.lenght; i++){
		// if (만약 25번이 Z라면) {그 다음 데이터를 소문자로 } -'a'로 초기화}
		// if (data가 Z라면 } {그 다음 데이터를 소문자로 } -'a'로 초기화}
		// }

		// 모음 : a e i o u / A E I O U


		//ch[0] = data++;
		//ch[1] = data++;
		//ch[2] = data++;
		//ch[3] = data++;
		// for(int i = 0; i <= ch.lenght; i++){
		/*		if(ch[i] == 'a' || ..||.. 'u' || 'A'..||..'U'){
		 * 		cnt++;}
		 * 	}
		 * 
		 * switch 버전
		 * 
		 * switch (ch[i]){
		 * case 'a' : case 'e' : case 'i' : case 'o' : case 'u':
		 * case 'A' : case 'E' : case 'I' : case 'O' : case 'U':
		 * } syso(ch[i]);
		 * 
		 * 
		 * */
		// 숫자 변환
		
		char A = 'A';
		int AInt = A;
		System.out.println(AInt);

		char Z = 'Z';
		int ZInt = Z;
		System.out.println(ZInt);

		int num = 0;
		for (int i = 0; i < ch.length; i++) {
			int tmp = A + num;
			num++;
			ch[i] = (char) tmp;
			if (tmp == 'Z') {
				A = 'a';
				num = 0;
			}
		}
		System.out.println(Arrays.toString(ch));

		//새로운 배열 생성
		
		char arr[] = { 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u' };

		int cnt = 0;
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (ch[i] == arr[j]) {
					cnt++;
				}
			}
		}
		System.out.println("모음의 갯수 : " + cnt);
	}
}
