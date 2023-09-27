package com.company.day013_For2;

public class For2006 {
	public static void main(String[] args) {

			//ver1		보이는대로
			System.out.println("Ver1");
			System.out.print("1"); System.out.println();
			System.out.print("2"); System.out.print("2"); System.out.println();
			System.out.print("3"); System.out.print("3"); System.out.print("3"); System.out.println();
			System.out.print("4"); System.out.print("4"); System.out.print("4"); System.out.print("4"); System.out.println();

			//ver2		칸정리
			System.out.println("\n\nVer2");
			for(int i = 1; i<=1; i++) {System.out.print("1");} System.out.println();
			for(int i = 1; i<=2; i++) {System.out.print("2");} System.out.println();
			for(int i = 1; i<=3; i++) {System.out.print("3");} System.out.println();
			for(int i = 1; i<=4; i++) {System.out.print("4");} System.out.println();

			//ver3		총정리 {반복} {변수} for{시작; 종료; 변화}
			// ver3에서 볼록이 먼저 넣고 for 하기

			System.out.println("\n\nVer3");
			for(int ch=1; ch<=4; ch++) {
				for(int i = 1; i<=ch; i++) {
						System.out.print(ch);
					}
					System.out.println();
				}


	}
}
