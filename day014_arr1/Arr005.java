package com.company.day014_arr1;

import java.util.Arrays;

public class Arr005 {
	public static void main(String[] args) {
		//new

		int [] arr={1,2,3};   //1,2,3이라는 초기 값을 아는 경우

		int [] arr1 = new int[3];
		//1. new 		공간 빌려오게 해당자료형 갯수만큼
		//     구조 =>  int 자료형 [갯수]
		System.out.println(arr1);	//[I@3d012ddd
		System.out.println(Arrays.toString(arr1));	//[0, 0, 0]

		//2. 값 대입부분 for로 줄이기
		//ver0 arr[0] = 10; arr[1] = 20; arr[2] =30;
		//ver1
		arr[0] = (0+1)*10;
		arr[1] = (1+1)*10;
		arr[2] = (2+1)*10;

		//ver2
		int data =0;
		arr[0] = data; data+=10;
		arr[1] = data; data+=10;
		arr[2] = data; data+=10;
			for(int i = 0; i<arr.length; i++) {
				arr[i] = data; data+=10;
			}

		//3. for문으로 출력
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}

	}
}
