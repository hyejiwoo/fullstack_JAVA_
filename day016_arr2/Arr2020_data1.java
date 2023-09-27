package com.company.day016_arr2;

public class Arr2020_data1 {
	public static void main(String[] args) {
		String[][] avengers = new String[2][3];
		String [][] data1 = new String[][]	{	{"아이언맨","헐크","호크아이"},
																					{"토르","블랙팬서","블랙위도우"}};
//		ver1		
//		avengers[0][0] = data1[0][0];																			
//		avengers[0][1] = data1[0][1];
		
//		ver2																					
		for(int ch = 0; ch < avengers.length; ch++) {
			for(int kan = 0; kan < avengers[ch].length; kan++) {
				avengers[ch][kan] = data1[ch][kan];
				System.out.print(avengers[ch][kan] + "\t");
			}
			System.out.println();
		}
		
//		for (int ch = 0; ch < avengers.length; ch++) {
//			for (int kan = 0; kan < avengers[ch].length; kan++) {
//				System.out.print(avengers[ch][kan] + "\t");
//			}
//				System.out.println();
//		}
		
	}
}
