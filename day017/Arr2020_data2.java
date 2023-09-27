package com.company.day017;

public class Arr2020_data2 {
	public static void main(String[] args) {
		String[][] avengers = new String[2][3];
		String[] data2 = new String[] { "아이언맨", "헐크", "호크아이", "토르", "블랙팬서", "블랙위도우" };
		int index = 0;

//		ver1
//		avengers[0][0] = data2[index++];
//		avengers[0][1] = data2[index++];

// 		ver2
		for (int ch = 0; ch < avengers.length; ch++) {
			for (int kan = 0; kan < avengers[ch].length; kan++) {
				avengers[ch][kan] = data2[index++];
				System.out.print(avengers[ch][kan] + "\t");
			}
			System.out.println();
		}

//		for (int ch = 0; ch < avengers.length; ch++) {
//		for (int kan = 0; kan < avengers[ch].length; kan++) {
//			System.out.print(avengers[ch][kan] + "\t");
//		}
//			System.out.println();
//	}

	}
}
