package com.company.day009_IF_SWITCH;

import java.util.Scanner;

public class IF012 {
	public static void main(String[] args) {
		//문자 a 또는 A, b 또는 C또는 C를 입력하시오 >
		//문자 a 또는 A 면 apple
		//문자 b 또는 B 면 banana
		//문자 c 또는 C 면 coconut
		
		Scanner scanner = new Scanner(System.in);
		char ch ='\u0000'; //' ';
		String result = "기타";
		
		System.out.println("문자 a 또는 A, b 또는 C또는 C를 입력하시오 >");
		ch = scanner.next().charAt(0);
		
		//ver1
		if(ch == 'A') {result=ch + "는 apple 이다.";}
		else if(ch=='a' ) {result=ch + "는 apple 이다.";}	
		if(ch == 'B') {result=ch + "는 banana 이다.";}
		else if(ch=='b' ) {result=ch + "는 banana 이다.";}	
		if(ch == 'C') {result=ch + "는 coconut 이다.";}
		else if(ch=='c' ) {result=ch + "는 coconut 이다.";}	
		
		//ver2
		if(ch == 'A' || ch == 'a') {result=ch + "는 apple 이다.";}
		else if(ch =='B' || ch == 'b'){result=ch + "는 banana 이다.";}
		else if(ch == 'C' || ch == 'c') {result=ch + "는 coconut 이다.";}
		
		
		System.out.println(result);

	}
}
