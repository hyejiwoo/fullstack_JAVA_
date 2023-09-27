package com.company.day011_For;

import java.util.Scanner;

public class For014 {
	public static void main(String[] args) {
		//PI 값을 입력 받는 프로그램을 작성하시오.
		//for를 이용하여 3.14 정답이 아닐 시 무한 반복으로 작동하는 프로그램입니다.

		//변수
		double PI = 0.0;
		String result ="다시도전";
		Scanner scanner = new Scanner(System.in);


		//입력+처리+출력
		/* *힌트 : for(;;) {
		 * 		PI 값은 얼마입니까? >
		 * 		만약 3.14를 입력했다면 정답! 출력 - 빠져나오기 (break)
		 * 		아니라면 다시도전 출력
		 * 		}
		 */

		//ver1
		for(;;) {
			System.out.println("PI값은 얼마입니까? >");
			PI = scanner.nextDouble();
			if (PI == 3.14) {result="정답!"; break;}
			else{System.out.println(result);}
		}

		System.out.println(result);

		//ver2

		for(;PI==3.14;) {
			System.out.println("PI값은 얼마입니까? >");
			PI = scanner.nextDouble();
			System.out.println(PI!=3.14? result:"정답!");break;
		}
		
	}
}

