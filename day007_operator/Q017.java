package com.company.day007_operator;

public class Q017 {
	public static void main(String[] args) {
		char ch = 'A', ch1='A';
		// a: 97, A: 65 - 32차이
		
		System.out.println((char)(ch+32));
		System.out.println(ch+=32); //ch[a]
		System.out.println(ch1+='a'-'A'); //ch[a]
	}
}
