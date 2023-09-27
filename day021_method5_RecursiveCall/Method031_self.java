package com.company.day021_method5_RecursiveCall;

public class Method031_self {
	
	/*public static void  리턴값 메서드명(파라미터) {
	}
*/
	
	public static void test(int a) {
		System.out.println("TEST ---- START" + a);
		//1. 빠져나올조건
		if(a<1)return;
		// 2. 처리
		System.out.println(a);
		// 3. 자기 자신 호출
		test(--a);
		System.out.println("TEST ---- END" + a);
	}
	
	public static void main(String[] args) {
		System.out.println("■MAIN ----START!");
		test(3);
		
		System.out.println("■MAIN ----START!");
		
		
	}
}


/* 출력 결과(열리고 닫히는 순서 보기)
 * 
 ■MAIN ----START!
TEST ---- START3
3
TEST ---- START2
2
TEST ---- START1
1
TEST ---- START0
TEST ---- END0
TEST ---- END1
TEST ---- END2
■MAIN ----START!
 * 
 * */


