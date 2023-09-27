package com.company.day009_IF_SWITCH;

import java.util.Scanner;

public class IF013 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num1 = 0, num2 = 0;
		char op = '\u0000';     String result="";

		/* Before code */
		//int num1=0, num2=0;
		//int result = 0;
		//double result2 =0.0;
		//char sign = '\u0000';
		
		/* After code */
		System.out.print("1. 정수를 하나 입력해주세요.>");
		num1 = scanner.nextInt();
		System.out.print("2. 정수를 하나 입력해주세요.>");
		num2 = scanner.nextInt();
		System.out.print("3. 연산자를 입력해주세요.(+,-,*,/)>");
		op = scanner.next().charAt(0);
		//sign = scanner.next().charAt(0);
		
		//누적 연산자 result += num1 + sign + num2 + "=";

		/* Before code */
		// if(sign == '+') {result = num1 + num2;System.out.println(result);}
		// else if(sign == '-') {result =num1 - num2;System.out.println(result);}
		// else if(sign == '*') {result =num1 * num2;System.out.println(result);}
		// else if(sign == '/') {result2 =num1 / (double)num2;System.out.println(result2);}

		/* After code */
		if(num1 != (int)num1 || num2 != (int)num2){
		}
	else {
		result += "" +num1 + (char)op + num2 + "=";
		if(op == '+') {result += (num1 + num2);}
		else if (op =='-') {result += (num1 - num2);}
		else if (op =='*') {result += (num1 * num2);}
		else if (op =='/') {result += String.format("%.2f",(float)num1/num2);}
									//result += String.format("%.2f" , num1/(float)num2);
	}
		System.out.println(result);
		
	}
}
