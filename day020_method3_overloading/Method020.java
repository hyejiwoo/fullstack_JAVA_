package com.company.day020_method3_overloading;

import java.util.Arrays;

public class Method020 {
	public static void main(String[] args) {
		System.out.println("● 숫자배열의 10씩 값 증가 프로그램");
		//	Q. 다음 이차원배열의 값이 10씩 증가되는 프로그램을 작성하시오.
		
		char [] abc = {'a', 'b','c'};
		upperTo(abc);
		System.out.println("main에서의 abc : " + Arrays.toString(abc));
 	}
	public static void upperTo(char[] abc) {
		// ver0   A = a 처리 65 97
		//				B = b 처리 66 98
		//				C = c	처리 67  99	
		//소문자의 범위라면
		if (abc [0] >= 'a' && abc[0] <= 'z') {abc[0] -= 'a' -'A';}
		if (abc [0] >= 'a' && abc[0] <= 'z') {abc[1] -= 'b' -'B';}
		if (abc [0] >= 'a' && abc[0] <= 'z') {abc[2] -= 'c' -'B';}
		else {System.out.println(Arrays.toString(abc));}
//		return (0);
	}
	
}
