package com.company.day014_arr1;

import java.util.Arrays;

public class Arr1Ex002 {
	public static void main(String[] args) {
		char ch[] = { 'B', 'a', 'n', 'a', 'n', 'a' };
		int upper = 0;
		int so = 0;

		// 만약 'B'가 대문자의 범위라면 대문자 숫자 카운트 증가 - 카운트할 변수 필요
		// 만약 'B'가 소문자의 범위라면 소문자 숫자 카운트 증가 - 카운트할 변수 필요
		// 대문자의 범위 'B' >= 'A' && 'B'<='Z'
		// 소문자의 범위 'B' >='a' && 'B' <= 'Z'
		// 만약 'a'가 대문자의 범위라면 대문자 숫자 카운트 증가 - 카운트할 변수 필요
		// 만약 'a'가 소문자의 범위라면 소문자 숫자 카운트 증가 - 카운트할 변수 필요

		// ver0 만약 'B'가 대문자의 범위라면 대문자 숫자 카운트 증가 - 카운트할 변수 필요
		// 만약 'B'가 소문자의 범위라면 소문자 숫자 카운트 증가 - 카운트할 변수 필요
		// ver0 만약 'A'가 대문자의 범위라면 대문자 숫자 카운트 증가 - 카운트할 변수 필요
		// 만약 'a'가 소문자의 범위라면 소문자 숫자 카운트 증가 - 카운트할 변수 필요

		// ver1
		// if( 만약 'A'가 대문자의 범위라면) { 대문자 숫자 카운트 증가} - 카운트할 변수 필요
		// if(만약 'a'가 소문자의 범위라면) {소문자 숫자 카운트 증가} - 카운트할 변수 필요
		// ver1 if( 만약 'B'가 대문자의 범위라면) { 대문자 숫자 카운트 증가} - 카운트할 변수 필요
		// if(만약 'b'가 소문자의 범위라면) {소문자 숫자 카운트 증가} - 카운트할 변수 필요

		// ver2 if(ch[0] >= 'A' && ch[0] <='Z') {upper++;}
		// else if(ch[0] >= 'a' && ch[0] <='z') {upper++;}
		// if(ch[1] >= 'A' && ch[1] <='Z') {upper++;}
		// else if(ch[1] >= 'a' && ch[1] <='z') {upper++;}

//			for (char c : ch) {
//					System.out.println(c);
//			}

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'A' && ch[i] <= 'Z') {
				upper++;
			} else if (ch[i] >= 'a' && ch[i] <= 'z') {
				so++;
			}
		}

//		System.out.println(Arrays.toString(ch));

		for (int i = 0; i < ch.length; i++) {
			if (i == 0) {
				System.out.print("[" + ch[i] + ", ");
			} else if (0 < i && i < ch.length - 1) {
				System.out.print(ch[i] + ", ");
			} else if (i == ch.length - 1) {
				System.out.print(ch[i] + "]" + "\n");
			}
		}
		System.out.println("대문자의 갯수 : " + upper + ", " + "소문자의 갯수 : " + so);
	}
}
