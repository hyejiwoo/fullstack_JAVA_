package com.company.day016_arr2;

public class Arr2003 {
	public static void main(String[] args) {
		int[][] da2 = { { 100, 200, 300 }, { 400, 500, 600 } };

		// ver3
		for (int ch = 0; ch < da2.length; ch++) {
			for (int kan = 0; kan < da2[ch].length; kan++) { // 층의 - 칸의 -갯수
				System.out.print(da2[ch][kan] + "\t");
			}
			System.out.println();
		}

	}
}
