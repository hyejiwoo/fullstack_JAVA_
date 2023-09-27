package com.company.day016_arr2;

public class Arr2008 {
	public static void main(String[] args) {
		float[][] f1 = { { 1.1f, 1.2f, 1.3f }, { 1.4f, 1.5f, 1.6f } };

		// ver3
		for (int ch = 0; ch < f1.length; ch++) {
			for (int kan = 0; kan < f1[ch].length; kan++) { // 층의 - 칸의 -갯수
				System.out.print(f1[ch][kan] + "\t");
			}
			System.out.println();
		}
	}
}
