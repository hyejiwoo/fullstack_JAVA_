package com.company.day017;

public class Arr2021 {
	public static void main(String[] args) {
		int num[][] = new int[4][4];
		int data = 1;

		for (int ch = 0; ch < num.length; ch++) {
			for (int kan = 0; kan < num[kan].length; kan++) {
					num[ch][kan] = data++;
				}
			}

		for (int ch = 0; ch < num.length; ch++) {
			for (int kan = 0; kan < num[kan].length; kan++) {
				{
					System.out.print(num[ch][kan] + "\t");
				}
			}
			System.out.println();
		}

	}
}
