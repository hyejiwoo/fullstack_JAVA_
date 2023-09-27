package com.company.day016_arr2;

public class Arr2020_if {
	public static void main(String[] args) {
		String[][] avengers = new String[2][3];
		String data[] = { "아이언맨", "헐크", "호크아이", "토르", "블랙팬서", "블랙위도우" };

		//if else 버전
		for (int ch = 0; ch < avengers.length; ch++) {
			for (int kan = 0; kan < avengers[ch].length; kan++) {
				if (ch == 0) {
					avengers[ch][kan] = data[kan];
				} else if (ch == 1) {
					avengers[ch][kan] = data[kan + 3];
				}
				System.out.print(avengers[ch][kan] + "\t");
			}
		}

	}
}
