package com.company.day014_arr1;

import java.util.Arrays;

public class Arr007 {
	public static void main(String[] args) {

		char [] arrchar= new char[5];
		char  data ='A';


		arrchar [0] = data++;
		arrchar [1] = data++;
		arrchar [2] = data++;
		arrchar [3] = data++;
		arrchar [4] = data++;

		for(int i=0; i<arrchar.length; i++) {
			System.out.println(arrchar[i]);
		}
	}
}
