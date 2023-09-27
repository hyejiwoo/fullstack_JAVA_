package com.company.day019;

import java.util.Scanner;

public class repeat {

	public static void main(String[] args) {
		char moon = ' ';
		String result = "끝";
		Scanner scanner = new Scanner(System.in);

		System.out.println("+,-,*,/ 중 하나를 입력해주세요. >");
		moon = scanner.next().charAt(0);

		for (int i = 0; i < 5; i++) {
			result = scanner.next();
			switch (moon) {
			case '+':
				System.out.println(result);
				break;
			case '-':
				System.out.println(result);
				break;
			case '*':
				System.out.println(result);
				break;
			case '/':
				System.out.println(result);
				break;
			}
			if (moon == ' ') {
				System.out.println("다시 입력해주세요.");
				continue;
			}
		}

		while (true) {
			while (true) {
				if (moon == '+' || moon == '-' || moon == '/' || moon == '*') {
					System.out.println(result);
				} else if (moon != ' ') {
					System.out.println("돌아가");
				}
			}

//			do{
//				if(moon == '+' || moon == '-' || moon == '/' || moon == '*'  ) {
//					System.out.println(result);
//				}else if(moon != ' ' ) {
//					System.out.println("돌아가");
//				}
//	}while(moon == ' ');

		}
	}
//	
//	int  [][]arr = new int[2][3];

	/*
	 * 	public static void main(String []args){dog();}
	 * 	 dog();
	 *		
	 * public static String 
	 * 	{System.out.println("멍멍")};
	 * 
	 * */

	
	/*
	 * 	public static void main(String []args){dog();}
	 * 	 dog();
	 * 	{System.out.println("멍멍")};
	 * 
	 * */

}