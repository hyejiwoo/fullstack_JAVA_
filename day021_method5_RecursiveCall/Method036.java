package com.company.day021_method5_RecursiveCall;

import java.util.Arrays;

public class Method036 {

	public static int getGCD(int max, int min) {		
		// 1071%1029 !=0 gcd(1029, 1071%1029) : 1029(최대공약수)
		// 12%3 != 0 gcd(3, 12%3) : 3 (최대공약수)
		
		//	1) 빠져나갈 조건
		int calc = max%min;
		if(calc == 0) 
		{return min;}
																		// 42는 21로 나누어 떨어진다. 최대 공약수는 21이다.
		//	2) 처리내용
		
		//	3) 자기자신 호출
		//ver0
		return getGCD(calc, min);
		
		//ver 1
//		 return max%min == 0 ? min : getGCD(max%min, min);
		
	}

	public static void main(String[] args) {
		System.out.println("● 최대공약수, 최소공배수");
		int[] anwser = new int[2];
		int n = 2;
		int m = 5;
		int GCD = getGCD(Math.min(n, m), Math.max(n, m));
		anwser[0] = GCD; // 최대공약수
		anwser[1] = (n * m) / GCD; // 최소공배수 = (small*big)/최대공약수
		System.out.println(Arrays.toString(anwser));
		
	}
}




/*	<유클리드 호제법>
 * 순서
 * 1) max%min == 0		즉, 0으로 떨지면 => 최대공약수이다. =>  return하라.
 * 2) max%min 한 나머지. 		1)에서 !=0 이었다면 나머지.
 * 3) min%나머지의 나머지        2)에서 !=0 이었다면 나머지.	
 * 4) min%나머지 == 0 				최대공약수.
 * 
 * 
 * */