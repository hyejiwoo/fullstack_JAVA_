package com.company.day016_arr2;

public class Arr2006 {
	public static void main(String[] args) {
		char[][] ch1 = { { 'A', 'B', 'C' }, { 'B', 'C', 'D' } };

		// ver3
		for (int ch = 0; ch < ch1.length; ch++) {
			for (int kan = 0; kan < ch1[ch].length; kan++) { // 층의 - 칸의 -갯수
				System.out.print(ch1[ch][kan] + "\t");
			}
			System.out.println();
		}
	}
}
