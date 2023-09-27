package com.company.day006;

public class A001 {
	public static void main(String[] args) {
		/*
		1. 먼저() 
		2. 값을 구하고 (++,--,*,/,<<, >>)
		3. 비교 ( <, >)
		4. 조건( &&, ||)후
		5. 대입(==)
		*/
			
		//1. 산술 연산자
		int a = 10, b=3;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		//num%2  => 0,1 중의 나머지 값이 옴.
		//num%3  => 0,1,2 중의 나머지 값이 옴.
		//num%4  => 0,1,2,3 중의 나머지 값이 옴.
		//num%9  => 0,1,2,3,4,5,6,7,8 중의 나머지 값이 옴.
		  
		
		//2. 비교 연산자 (< , > , <=, >=, == < !=)
		System.out.println(a>b);    //a가 b보다 크다 true-초과
		System.out.println(a<b);    //a가 b보다 작다 false-초과
		System.out.println(a>=b);   //a가 b보다 크거나 같다 true-이상
		System.out.println(a<=b);   //a가 b보다 작거나 같다 true-이하
		System.out.println(a==b);   //a와 b가 같다 false
		System.out.println(a!=b);   //a와 b가 다르다 true
		
		boolean c =true;
//		System.out.println(a>c);
		//A002
		 
 	}
}
