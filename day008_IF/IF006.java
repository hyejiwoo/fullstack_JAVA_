package com.company.day008_IF;

import java.util.Scanner;

public class IF006 {
	public static void main(String[] args) {
		int num1 =0, num2=0, num3=0, max=0; //제일 큰 값을 담을 변수
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자입력(1)>"+num1);
		num1 =scanner.nextInt();
		System.out.println("숫자입력(2)>"+num1);
		num2 =scanner.nextInt();
		System.out.println("숫자입력(3)>"+num1);
		num3 =scanner.nextInt();
		//처리 max - 제일 큰 값을 담을 변수
		
		max =num1;
		if(max < num2) { max=num2;}
		if(max < num3) { max=num3;}
		
		System.out.println(num1+","+num2+","+num3+"중의 최대값:"+max);
	}
}
