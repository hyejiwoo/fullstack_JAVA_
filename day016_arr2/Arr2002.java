package com.company.day016_arr2;

public class Arr2002 {
	public static void main(String[] args) {
		int[][] da1 = { { 10, 20, 30 }, { 40, 50, 60 } };

		// ver3
		for (int ch = 0; ch < da1.length; ch++) { // 층 - da1.length
			for (int kan = 0; kan < da1[ch].length; kan++) { //// 층의 - 칸의 -갯수
				System.out.print(da1[ch][kan] + "\t");
			}
			System.out.println();
		}
	}
}
