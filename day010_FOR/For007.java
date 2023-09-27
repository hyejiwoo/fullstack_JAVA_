package com.company.day010_FOR;

import javax.sound.midi.Soundbank;

public class For007 {
	public static void main(String[] args) {
		// ver0 1~30의 범위에서 3의 배수이면서 2의 배수인 숫자와 갯수를 구하는 프로그램을 작성하시오.

		// 3의 배수이면서 2의 배수인 숫자
		// 3의 배수 : a%3 == 0 3 (b) 9
		// 2의 배수 : a%2 == 0 2 4 (b) 8 10
		// if (a%3==0 && a%2==0){a 갯수카운트)

		// ver-1 int cnt=0;
		// 1이 3의 배수이면서 2의 배수라면 : 1 {숫자출력, 갯수 카운트}
		// 2가 3의 배수이면서 2의 배수라면 : 2 {숫자출력, 갯수 카운트}

		// ver-2
		// if(1이 3의 배수이면서 2의 배수라면) {숫자출력, 갯수카운트}
		// if(2가 3의 배수이면서 2의 배수라면) {숫자출력, 갯수카운트}

		// ver-3
		// if(1%3==0 && 1%2==0) {++cnt + ".3의 배수이면서 2의 배수인 숫자 :"a+1);}
		// if(2%3==0 && 2%2==0) {++cnt + ".3의 배수이면서 2의 배수인 숫자 :"a+2);}


		int cnt = 0;

		for (int i = 1; i <= 30; i++) {
			cnt += i;
			if (i % 3 == 0 && i % 2 == 0) {
				System.out.println(++cnt +
						".3의 배수이면서 2의 배수인 숫자 : " + i);
			}

		}
			System.out.println("갯수: " + cnt);
	}
}
