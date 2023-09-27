package com.company.day010_FOR;

public class For011 {
	public static void main(String[] args) {
		// ver0 소문자 a~z까지 모음의 갯수를 출력하시오.

		/*System.out.println('A');
		System.out.println('B');
		System.out.println('C');
		System.out.println('D');
		System.out.println('E');*/

		/*System.out.println('F');//70 (5의 배수)
		System.out.println('G');
		System.out.println('H');
		System.out.println('I');
		System.out.println('J');*/

		// ver1 문자는 저장시 숫자로, 출력은 문자로
		for(char ch='A'; ch<='Z'; ch+=1){
				if(ch%5==0) {System.out.println();}	//5의 배수라면 줄바꿈
				System.out.println(ch);
		}

	}
}
