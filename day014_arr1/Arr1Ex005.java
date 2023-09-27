package com.company.day014_arr1;

import java.util.Arrays;

public class Arr1Ex005 {
	public static void main(String[] args) {
		int[] su = { -3, 5, -1, 9, -7 };

		// ver0 -3이 음수라면 카운트
		// ver0 5가 음수라면 카운트

		// ver1 if(-3이 음수라면) {카운트}
		// ver1 if(5가 음수라면) {카운트}

		// ver2 if(su[0]<0){cnt++;}
		// ver2 if(su[1]<0){cnt++;}

		int cnt = 0;
		for (int i = 0; i < su.length; i++) {
			if (su[i] < 1) {
				cnt++;
			}
		}
		System.out.println(Arrays.toString(su));
		System.out.println("음수 카운트 >" + cnt);
		
	}
}
