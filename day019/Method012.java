package com.company.day019;

import java.util.Scanner;

public class Method012 {
	public static void main(String[] args) {
		//변수
		int num1 = 0;
		int num2 = 0;
		float result = 0.0f;
		char op = '\u0000';
		
		Scanner scanner = new Scanner(System.in);
		
		
		//입력
		System.out.println("정수 한개입력  >");
		num1 = scanner.nextInt();
		System.out.println("연산자 한개입력  >");
		op = scanner.next().charAt(0);
		System.out.println("정수 한개입력  >");
		num2 = scanner.nextInt();		

		num1 = inputNum();
		//1. 숫자 정수를 입력 받아주는 기능.
		// 리턴값 : int 메서드명 : inputNum 파라미터: X
		op = inputOpper();
		// 2. 문자를 입력 받아주는 기능.
		// 리턴값 : char 메서드명 : inputOpper 파라미터: X
		num2 = inputNum();		
		
		
		//처리
		result = clac(num1, num2, op);
		//3. 숫자 두개와 OP를 입력 받아 각 연산에 맞는 계산 결과값
		
		
		//출력
		show (num1, num2, op, result);
		// 4. 숫자 두개와 OP, 결과물을 입력받아 출력해주는 기능
		System.out.println(show(num1, num2, op, result));
		
	}
		public static int  inputNum() {
			Scanner scanner = new Scanner(System.in);
			System.out.println("숫자입력");
			return scanner.nextInt();
		}
		public static char  inputOpper() {
			Scanner scanner = new Scanner(System.in);
			System.out.println("연산자 입력");
			return scanner.next().charAt(0);
		}
		public static float clac(int num1, int num2, char op) {
			float result = 0.0f;
			switch(op) {
			case '+' : result += num1 + num2; break;
			case '-' : result += num1 -  num2; break;
			case '*' : result += num1 *  num2; break;
			case '/' : result += num1 /(float) num2; break;
			}
			return result;
		}
		public static String  show(int num1, int num2, char op, float result) {
			System.out.println("" + num1 + op + num2  + "=" + ((op!='/')? (int)result : String.format("%.2f", result)));
			
			return "";
		}
	
}
