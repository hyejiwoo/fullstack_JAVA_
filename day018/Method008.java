package com.company.day018;

public class Method008 {
	public static void main(String[] args) {
		String a = "CHOCO";
		String b = "MILK";
		String res = add(a,b);
		//public static 리터값 메소드명(파라미터) {}
		//public static String add(String a, String b) {}		
		System.out.println(res);
	}
	public static String add(String a, String b) {
		return "맛있는\t" + a + b;
	}
}
