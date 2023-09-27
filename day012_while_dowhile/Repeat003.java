package com.company.day012_while_dowhile;

import java.util.Iterator;

public class Repeat003 {
	public static void main(String[] args) {

		// ver0 1~10까지 3의 배수

		// ver1
		// 만약 1이 3의 배수라면 카운트
		// 만약 2가 3의 배수라면 카운트

		// ver2
		// if(만약 1이 3의 배수라면) {카운트}
		// if(만약 2가 3의 배수라면) {카운트}

		// ver3
		// if(1%3==0) {cnt++;}
		// if(2%3==0) {cnt++;}

		// for
		int cnt = 0;
		for (int i = 1; i < 11; i++) {
			if (i % 3 == 0) {
				cnt++;
			}
		}
		System.out.println("1~10까지의 3의 배수 : " + cnt);

		// while
		cnt = 0;
		int i = 1;
		while (i < 11) {
			if (i % 3 == 0) {
				cnt++;
			}
			i++;
		}
		System.out.println("1~10까지의 3의 배수 : " + cnt);

		// do while
		cnt = 0;
		i = 1;
		do {
			if (i % 3 == 0) {
				cnt++;
			}
			i++;
		} while (i < 11);
		System.out.println("1~10까지의 3의 배수 : " + cnt);

	}

}
