package com.company.day016_arr2;

public class Arr2014 {
	public static void main(String[] args) {
		int[][] da1 = new int[2][3];
		int data = 101;
		
//		ver1
//		int[][] da2 = { { 101, 102, 103 }, { 104, 105, 106 } };

		for (int ch = 0; ch < da1.length; ch++) {
			for (int kan = 0; kan < da1[ch].length; kan++) 
			{da1[ch][kan] = data++;}
		}

		for (int ch = 0; ch < da1.length; ch++) {
			for (int kan = 0; kan < da1[ch].length; kan++) {
				System.out.print(da1[ch][kan] + "\t");
			}
			System.out.println();
		}
	}
}
