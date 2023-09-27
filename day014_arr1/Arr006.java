package com.company.day014_arr1;

import java.util.Arrays;

public class Arr006 {
	public static void main(String[] args) {

		float [] arrfloat = new float[5];

		//ver2
		float data =1.1f;
		arrfloat [0] = data; data+=0.1f;
		arrfloat [1] = data; data+=0.1f;
		arrfloat [2] = data; data+=0.1f;
		arrfloat [3] = data; data+=0.1f;
		arrfloat [4] = data; data+=0.1f;

		for(int i=0; i<arrfloat.length; i++) {
			System.out.println(String.format("%.1f",arrfloat[i]));
		}
	}
}
