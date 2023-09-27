package com.company.day007_operator;

import java.util.Scanner;

public class Q013 {
	public static void main(String[] args) {
		
		//변수
		int cookies=12, boxs=10, need_box;
		int cookies_cal=0, need_box_cal;
		Scanner scanner = new Scanner(System.in);
		
		//입력
		System.out.print("쿠키 몇 개?> ");
		cookies_cal = scanner.nextInt();
		
		//처리
		need_box = (cookies%boxs)==0 ? cookies/boxs : (cookies/boxs)+1;
		need_box_cal = (cookies_cal%boxs)==0 ? cookies_cal/boxs : (cookies_cal/boxs)+1;

		
		//출력
		System.out.println(cookies_cal + "개 쿠키, 필요한 박스: " + need_box_cal);
		System.out.println("12개 쿠키, 필요한 박스: " + need_box);
	}
}
