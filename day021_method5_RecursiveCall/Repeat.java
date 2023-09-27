package com.company.day021_method5_RecursiveCall;

public class Repeat {
	public static void main(String[] args) {
		int[][] num = { { 1, 3, 5 }, { 2, 4, 6 } };
		print(num);

	}

	public static void print(int[][] num) {

		for (int ch = 0; ch < num.length; ch++) {
			for (int kan = 0; kan < num[ch].length; kan++) {
				num[ch][kan] += 10;
			}
		}
	}
}
