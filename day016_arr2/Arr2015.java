package com.company.day016_arr2;

public class Arr2015 {
	public static void main(String[] args) {
		char[][] ch1 = new char[2][3];
		char data = 'A';

//		ver2
//		char[][] ch2 = { { 'A', 'B', 'C' }, { 'D', 'E', 'F' } };

		for (int ch = 0; ch < ch1.length; ch++) {
			for (int kan = 0; kan < ch1[ch].length; kan++) {
				{
					ch1[ch][kan] = data++;
				}
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
