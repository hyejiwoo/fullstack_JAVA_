package com.company.day016_arr2;

import java.util.Arrays;

public class Arr2011_1 {
	public static void main(String[] args) {
		//ver1
		int[] arr11= {1, 2, 3};
		int[] arr12 = new int[3];
		
		//ver2
		int[][] arr21 = new int[2][3];  //층, 칸
		int[][] arr22 = new int[][] {{1, 1}, {2, 3, 4}}; //##
		System.out.println(Arrays.toString(arr22)); 
		System.out.println(arr22.length);  //배열의 층
		System.out.println(arr22[0].length);  //배열 0층 칸
		System.out.println(arr22[0].length);  //배열 1층 칸
		
		//ver3
		int[][] arr3 = new int[2][3];
		//ver3-1 눈에 보이게
		int data=1;
//		arr3[0][0] = data++;
//		arr3[0][1] = data++;
//		arr3[0][2] = data++;
//		
//		arr3[1][0] = data++;
//		arr3[1][1] = data++;
//		arr3[1][2] = data++;
//		System.out.println(Arrays.deepToString(arr3)); 
		
		//ver3-2 칸 정리
		for(int ch=0; ch<arr3.length; ch++) {
			for(int kan=0; kan<arr3[ch].length; kan++) { arr3[ch][kan] = data++;} 
		}
		System.out.println(Arrays.toString(arr3)); 
	}
	

}
