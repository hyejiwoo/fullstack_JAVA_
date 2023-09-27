package com.company.day016_arr2;

import java.util.Arrays;

public class Arr2012 {
	public static void main(String[] args) {
		int[][] da1 = new int[2][3];
		int data = 11;
		
		//ver0
		//da1[0][1] = data;		data++;
		
		//ver2
		for(int ch =0; ch< da1.length; ch++) {
			for (int kan = 0; kan < da1[ch].length; kan++) 
				{da1[ch][kan]  = data++;}
			}
		

		for (int ch = 0; ch < da1.length; ch++) {
			for (int kan = 0; kan < da1[ch].length; kan++) {
					System.out.print(da1[ch][kan] + "\t");
			}
			System.out.println();
		}
		
		
		//ver3
		
		
	}
}
