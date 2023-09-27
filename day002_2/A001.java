package com.company.day002_2;

public class A001 {
	public static void main(String [] args) {
			//(1) 자료형 변수이름
			//정수형 자료형 변수이름 wallet
			//1,2,3 자료형 박스이름wallet
			int	wallet;
			System.out.println("지갑에 있는 돈(1)" + 100000);

			//(2) A==B 대입
			wallet = 00000;
			System.out.println("지갑에 있는 돈(1)" + wallet); //100000

			//(3) 변수 = 현하는 수
			wallet = 30000;
			System.out.println("지갑에 있는 돈(2)" + wallet); //30000

		   //(4)	A=B
			wallet = 300000 - 120000;
			System.out.println("지갑에 있는 돈(3)" + wallet); //18000
	}
}
