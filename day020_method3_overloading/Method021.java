package com.company.day020_method3_overloading;

import java.util.Arrays;

public class Method021 {
	public static void main(String[] args) {
		// 2차원배열
		int[][] num = { { 1, 3, 5 }, { 2, 4, 6 } };
		print(num);
		System.out.println("main :" + Arrays.deepToString(num));
	}

	private static void print(int[][] num) {
		for (int ch = 0; ch < num.length; ch++) {
			for (int kan = 0; kan < num[ch].length; kan++) {
				num[ch][kan] += 10;
			}
		}
	}

}
