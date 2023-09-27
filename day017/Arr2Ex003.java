package com.company.day017;

public class Arr2Ex003 {
	public static void main(String[] args) {
		int[][] arr = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 }, { 4, 4, 4 } };
		int tot = 0;
		float avg = 0.0f;
		int cnt = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				tot += arr[i][j];
				cnt++;
			}
			avg = tot / (float) cnt;
		}
		System.out.println("총점 : " + tot);
		System.out.println("평균 : " + avg);
	}
}
