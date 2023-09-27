package com.company.day014_arr1;

import java.util.Arrays;

public class Arr1Ex006 {
	public static void main(String[] args) {
		// 양수중에서 홀수의 합
		int[] su = { -3, 5, -1, 9, -7, 2, -11 };
		
		// ver0 양수중에서 홀수의 합

		// ver1 -3이 양수면서 홀수라면 box에 담기
		// 5가 양수면서 홀수라면 box에 담기
		// -1이 양수면서 홀수라면 box에 담기

		// ver2
		// if(-3이 양수면서 홀수라면) {box에 담기}
		// if(5가 양수면서 홀수라면) {box에 담기}
		// if(-1이 양수면서 홀수라면) {box에 담기}

		// ver3
		// if(su[0]>0 && su[0]%2==1) {box+=su[0]}
		// if(su[1]>0 && su[1]%2==1) {box+=su[1]}
		// if(su[2]>0 && su[2]%2==1) {box+=su[2]}

		int cnt = 0;
		for (int i = 0; i < su.length; i++) {
			if (su[i] >= 0 && su[i] % 2 == 1) {
				cnt += su[i];
			}
		}
		System.out.println(Arrays.toString(su)); //Arrays.toString() -> 배열 su 대괄호 처리해서 출력됨.
		System.out.println("양수중에서 홀수의 합:" + cnt);

	}
}


//변수(선생님 풀이)
// int size = su.length;
// int box = 0;