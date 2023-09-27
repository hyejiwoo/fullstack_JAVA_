package com.company.day021_method5_RecursiveCall;

public class Method038 {
	public static int maxArray(int[] arr, int length) {
		// 1) 빠져나갈 조건
		int max = -1;
//		if(lenght == 1) return arr[0];
//		else {arr[5-1] {1,3,9,7,5}}
		if(length == 1)
		return max = arr[0];
		
		//	3) 자기자신 호출
		
		return max;
	}

	// ver1
	// max = arr[0] > arr[1]? arr[0] : arr[1];
	
	/* ver2
	 * max = maxArray(arr, 1) > arr[1]?
	 * 				maxArray(arr, 1) : arr[1];
	 * 
	 * max = maxArray(arr, length - 1) > arr[length - 1]?
	 * 				maxArray(arr, length - 1) : arr[length - 1];
	 * */
		
	/* ver3
	 * 
	   		max = maxArray{{1}, 1} > arr[2-1]?
	   						maxArray{{1}, 1} : arr[2-1];
	 * */
	
	public static void main(String[] args) {
		int arr [] = {1,3,9,7,5};
		System.out.print(maxArray(arr, arr.length));		//9
	}
}


/*
 * 		TESE2		int arr[]	= {1,3};			{1,3}, 2	
 * 							
 * #2		maxArray(arr ,1) {{1}			1				return arr[0]}
 * #1 	maxArray(arr ,2) {{1, 3}}				arr[0] > arr[1]
 * 
 * 
 * 		TESE1		int arr[]	= {1};			{1}, 1
 * 
 * #1		maxArray (arr, 1) {{1}		1		}	
 * 				=> 1개면 arr[0]번째 return. => arr[0] "자기자신"

 * 
 * */







