package com.company.day018;

public class Method009 {
	public static void main(String[] args) {
		double a =1.2;
		double b = 3.4;
		double res = add(a,b);
		//public static 리터값 메서드명 (파라미터) {해야할일}
		//public static double add(doubla a6, doubleb6) {해야할일}
		System.out.println(res);
	}
	public static double add(double a, double b) {
		return a + b;
	}

}
