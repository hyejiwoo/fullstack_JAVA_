package com.company.day016_arr2;

public class Arr2001 {
	public static void main(String[] args) {

		int[][] da1 = { { 1, 2, 3 }, { 4, 5, 6 } };

		// ver3
		for (int kan = 0; kan < da1.length; kan++) {
			for (int ch = 0; ch < da1[kan].length; ch++) { // 층의 - 칸의 -갯수
				System.out.print(da1[kan][ch] + "\t");
			}
			System.out.println();
		}
	}
}
