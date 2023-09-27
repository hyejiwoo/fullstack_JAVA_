package com.company.day007_operator;

public class A012 {
	public static void main(String[] args) {
		//먼저	값			  비교 조건 대입
		//()[]  ++ --  */+-   <>    &    =
		// int 보다 작은 아이들~byte short char long -> 연산 시 int 로 자동변환
		
		char ch = 'A';
		System.out.println('C'-ch);
		/*  2
		 * 
		 * 	char - char
		 *  'C' - 'A'
		 *  int = int - int
		 *  int = 'C'(67)  - 'A'(65)
		 * */
		System.out.println('5'-'4');
		/* 53-52 =  1
		 * 
		 * ((int)'5' -"-" + (int)'4'); //53	
		 * */
		System.out.println(ch+1);
		/*  66  'A'(65)+1
		 * 
		 *  1. 문자는 저장시 숫자로, 출력 문자로
		 * 
		 * */
		System.out.println(++ch);
		/*  'B'
		 */
		System.out.println(ch++);
		/*  'B'
		 *
		 * 	(ch++) -> 출력 후 연산
		 */
		System.out.println(ch); //'C'
	}
}
