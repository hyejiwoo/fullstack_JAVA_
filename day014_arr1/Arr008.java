package com.company.day014_arr1;

import java.util.Arrays;

public class Arr008 {
	public static void main(String[] args) {

		String []datas = {"아이언맨","헐크","캡틴"};
		String[] arrname = new String[3];

		String data ="";
		arrname [0] = datas[0];
		arrname [1] = datas[1];
		arrname [2] = datas[2];


			for(int i = 0; i<arrname.length; i++) {
				arrname[i] = datas[i];
			}


		for(int i=0; i<arrname.length; i++) {
			System.out.println(arrname[i]);
		}
	}
}
