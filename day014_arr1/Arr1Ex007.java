package com.company.day014_arr1;

public class Arr1Ex007 {
	public static void main(String[] args) {
		int[] su = { -3, -5, -1, -7, -9 };
		int rank = 1;

		// 1. 몇등인지 수동계산
		// -7과 -3을 비교해서 -7이 작다면 등수 늘리기 rank++; -7 : 2등
		// -7과 -5을 비교해서 -7이 작다면 등수 늘리기 rank++; -7 : 3등
		// -7과 -1을 비교해서 -7이 작다면 등수 늘리기 rank++; -7 : 4등
		// -7과 -9을 비교해서 -7이 작다면 등수 늘리기 rank++; -7 : ----
		// -7과 -7을 비교해서 -7이 작다면 등수 늘리기 rank++; -7 : ----

		// 2.if문 이용해서 구조 확인
		// if(su[4]과 su[0]을 비교해서 -7이 작다면){rank++;}
		// if(su[4]과 su[1]을 비교해서 -7이 작다면){rank++;}
		// if(su[4]과 su[2]을 비교해서 -7이 작다면){rank++;}

//			-7은 su 배열의 인덱스 4번에 들어있다. -> su[4]
//			if(su[4] && su[0]) {rank++;}
//			if(su[4] && su[1]) {rank++;}
//			if(su[4] && su[2]) {rank++;}
//

		for (int i = 0; i < su.length; i++) {
			if (su[4] > -7) {
				rank++;
			} else if (su[i] > -7) {
				rank++;
			}
		}
		System.out.println("su[4]요소의 등수 : " + rank + "등");
	}
}
