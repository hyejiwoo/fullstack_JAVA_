package com.company.day014_arr1;

import java.util.Arrays;

public class Arr1Ex008 {
	public static void main(String[] args) {
		int[] su = { -3, -5, -1, -9, -7 };
		int max = -99999, min = 99999;

		// ver1 {-3,-5,-1,-7};
		// ver2 수동계산
		// 만약 -3이 max보다 크다면 max에 담기 if(-3이 max 보다 크다면) {max =-3;} //-3
		// 만약 -5가 max보다 크다면 max에 담기 if(-5이 max 보다 크다면) {max =-5;} //-3
		// 만약 -1이 max보다 크다면 max에 담기 if(-1이 max 보다 크다면) {max =-1;} //-1

		// ver3
		// if(su[0] > max) {max == su[0];}
		// if(su[0] < min) {min== su[0];}
		// if(su[1] > max) {max == su[1];}
		// if(su[1] < min) {min == su[1];}

		for (int i = 0; i < su.length; i++) {
			for (int j = 0; j < su.length; j++) {
				if (su[i] > max) {
					max = su[i];
				} else if (su[i] < min) {
					min = su[i];
				}
			}
		}
		System.out.println(Arrays.toString(su));
		System.out.println("최대값 : " + max + "," + "최소값 :" + min);
	}
}
