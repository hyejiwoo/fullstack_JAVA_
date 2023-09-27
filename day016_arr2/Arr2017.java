package com.company.day016_arr2;

public class Arr2017 {
	public static void main(String[] args) {
		char[][] ch1 = new char[2][3];
		char ch_dae = 'A';

		for (int ch = 0; ch < ch1.length; ch++, ch_dae='a') {
			for (int kan = 0; kan < ch1[ch].length; kan++) {
					{ch1[ch][kan] = ch_dae++;}
			}
		}

		for (int ch = 0; ch < ch1.length; ch++) {
			for (int kan = 0; kan < ch1[ch].length; kan++) {
				System.out.print(ch1[ch][kan] + "\t");
			}
			System.out.println();
		}

	}
}
