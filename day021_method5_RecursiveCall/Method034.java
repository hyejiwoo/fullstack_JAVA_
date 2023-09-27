package com.company.day021_method5_RecursiveCall;

public class Method034 {
	
	public static int plus(int a) {
		System.out.println(a);
	
		if(a<1) return 0;
		
		return a + plus(--a);		
	}
	
		
	public static void main(String[] args) {
		int n = 5;
		System.out.println("1부터" + n + "까지의 합계 :" + plus(n));
		plus(n);
	}


}
