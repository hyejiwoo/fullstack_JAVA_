package com.company.day016_arr2;

public class Arr2010 {
	public static void main(String[] args) {
		String[][] avengers = { { "아이언맨", "헐크", "호크아이" }, { "토르", "블랙팬서", "블랙위도우" } };

		// ver3
		for (int ch = 0; ch < avengers.length; ch++) {
			for (int kan = 0; kan < avengers[ch].length; kan++) { // 층의 - 칸의 -갯수
				System.out.print(avengers[ch][kan] + "\t");
			}
			System.out.println();
		}
	}
}
