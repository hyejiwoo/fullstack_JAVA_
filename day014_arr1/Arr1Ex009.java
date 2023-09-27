package com.company.day014_arr1;

import java.util.Arrays;

public class Arr1Ex009 {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50 };
		int box = 0;

		//ver0
		// 10을 box에 누적
		// 20을 box에 누적
		
		// ver1 
		// box에 10 누적
		// box에 20 누적
		// box에 30 누적

		// ver2 누적 코드
		// box += arr[0];
		// box += arr[1];
		// box += arr[2];

		for (int i = 0; i < arr.length; i++) {
			box += arr[i];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("sum" + "=" + box);
	}
}
