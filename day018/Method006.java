package com.company.day018;

import java.util.Scanner;

public class Method006 {
	public static void main(String[] args) {
		int res1 = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("절대값을 구하는 프로그램입니다.\n숫자를 입력하세요.");
			res1 = abs(scanner.nextInt());
			//public static 리턴값 메소드명(파라미터) {해야할일}
			//public static int abs (int a) {절대값}
			//public static 리턴값 메소드명(파라미터)
			//public static 리턴값 메소드명(파라미터)
			System.out.println(res1);
	}
	//ver1
	// int reult = a;
	// if(a<0) {result = a*1;}
	//	return result;
	
	//ver 2
	//public static int abs(int a)
	//{return a<0? -a:a;}
	
	//ver3
	//public static int abs(int a) {return Math.(메소드이용)}
	public static int abs(int i)
	{return Math.abs(i);}
}
