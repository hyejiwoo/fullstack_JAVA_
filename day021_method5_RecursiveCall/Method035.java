package com.company.day021_method5_RecursiveCall;

public class Method035 {
	public static int fact(int a) {
		//4*(3*2*1)
		// 1) 빠져나올 공간
		if(a==1) return a;		
		// 2) 해야할일
		
		// 3) 자기자신 호출
		return a*fact(--a);
	}

	public static void main(String[] args) {
		System.out.println("● 팩토리얼");

		int result = fact(4);
		System.out.println(result);
	}
}

/*
 * 
 * fact(0) {}
 * fact(1) {1* 											 return 1; }  //빠져나옴조건 : 1이라면 *
 * fact(2) {2*	fact(1)  					return2*(1)}
 * fact(3) {3* 	fact(2)  			   return3*(2*1)}
 * fact(4) {4* fact(3)  		  return4*(3*2*1)}
 * */
 