package com.company.day014_arr1;

import java.util.Arrays;

public class Arr001 {
	public static void main(String[] args) {
		// 기본타입 //참조타입

		// 자바 메모리 구조 RUNTYPE DATA AREA
		// method area heap area stack area
		// stack 과 heap
		// 힙 영역 //스택 영역

		// 1차 시간 : 1차원 배열

//			int a = 10;
//			int [] arr = {123};
		// arr 주소 1000을 보관 -> 1000번지 {123}
		// 1꺼내쓰기 arr[0]
		// 2꺼내쓰기 arr[1]
		// 3꺼내쓰기 arr[2]

		int[] arr = null; // null은 상태.
		int[] arr1 = { 1, 2, 3 }; // 0,1,2
		System.out.println(arr); // null //syso ->
		System.out.println(arr1); // [I@515f550a
		System.out.println(Arrays.toString(arr1)); // [1,2,3]

		System.out.println("1꺼내기:" + arr1[0]);
		System.out.println("2꺼내기:" + arr1[1]);
		System.out.println("3꺼내기:" + arr1[2]);

		int[] arr2 = { 1, 2, 3, 4, 5 }; // arr2 [2000번지] ---> 2000번지 {1,2,3,4,5}
		char[] arr3 = { 'A', 'B', 'C' }; // arr3[3000번지] ---> 3000번지 {'A','B','C'}

		System.out.println(arr3[1]);

		int[] arr4 = { 100, 200, 300 };
		System.out.println(arr4[0]);
		System.out.println(arr4[1]);
		System.out.println(arr4[2]);
		System.out.println();

		// for(int i=0; i<=2; i++)
		// for(int i=0; i<3; i++)
		for (int i = 0; i < arr4.length; i++) { // 배열의 갯수
			System.out.println(arr4[i]);
		}

	}
}

/*
 * Arr001. java <- cmd) javac Arr001.java Arr001.class <- cmd)java Arr001
 * ------------------------------------------- RUNTIME DATA AREA 1. METHOD AREA
 * - 코드분석 (class Arr001) -> static 들어가있다. = public static void main (String []
 * args) 해석. (자바의 전원버튼)
 *
 *
 * ------------------------------------------- 2. HEAP 3. Stack
 *
 * | println() 출력하고 사라짐(X) 6번 [I@515f550a{1번지,2번지,3번지} [arr | [I@515f550a] |main
 * [arr | null] -------------------------------------------
 *
 *
 */
