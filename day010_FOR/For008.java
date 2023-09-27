package com.company.day010_FOR;

public class For008 {
	public static void main(String[] args) {
		// ver0 1~10 중에서 짝수의 합계를 구하시오.
		// ver1 만약 1이 짝수라면 짝수의 합계 더하기
		// ver1 만약 2가 짝수라면 짝수의 합계 더하기
		// ver1 만약 3이 짝수라면 짝수의 합계 더하기

		// ver2 if(만약 1이 짝수라면) {짝수의 합계 더하기}
		// ver2 if(만약 2가 짝수라면) {짝수의 합계 더하기}
		// ver2 if(만약 3이 짝수라면) {짝수의 합계 더하기}

		// ver3 if(1 % 2 == 0) {even +=1;}
		// ver3 if(2 % 2 == 0) {even +=1;}
		// ver3 if(3 % 2 == 0) {even +=1;}

		int sum = 0;		//{} {변수} 패턴

		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("짝수의 합 : " + sum);
	}
}
