package com.company.day010_FOR;

import java.util.Scanner;

public class For005 {
	public static void main(String[] args) {
		// 1~10에서 3의 배수의 개수
		int a = 0;
		// ver0 1~10 까지의 3의배수 개수 : 3

		System.out.println("1~10까지 3의 배수 갯수 :");
		// ver1 int cnt = 0;
		// if(1이 3의 배수라면) {개수카운트}
		// if(2이 3의 배수라면) {개수카운트}
		// if(3이 3의 배수라면) {개수카운트}

		// ver3 int cnt = 0;
		// if(1%3==0) {개수카운트}
		// if(2%3==0) {개수카운트}
		// if(3%3==0) {개수카운트}

		for (int i = 1; i <= 10; i++) {
			if (i % 3 == 0) {
				a += i;
			}
		}
		System.out.println(a);

	}
}
