package com.company.day016_arr2;

public class Arr2019 {
	public static void main(String[] args) {
		float[][] f1 = new float[2][3];
		float data = 1.1f;

		for (int ch = 0; ch < f1.length; ch++, data = 2.1f) {
			for (int kan = 0; kan < f1[ch].length; kan++) {
				{
					f1[ch][kan] = data;
					data +=0.1f;
				}
			}
		}

		for (int ch = 0; ch < f1.length; ch++) {
			for (int kan = 0; kan < f1[ch].length; kan++) {
				{
					System.out.printf("%.1f \t", f1[ch][kan]);
				}
			}
			System.out.println();
		}
	}
}
