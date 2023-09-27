package com.company.day018;

public class Method001 {
	// →1. 함수정의 
	public static void washer() { //#3-2. 여기서부터
		System.out.println("세탁을 합니다.");	//#4. 
	}//#3-3. 여기까지 처리해줄게.
	 /*																													*/
	 /*																													*/
	// 0. JVM 클래스가 로드되면 가장 우선 실행(static을 먼저 찾음.)
	public static void main(String[] args) {
			// →2. 메소드 사용 - 코드를 재사용, 명령어들의 모음. {}, 메서드 이름만 호출
	washer();	//#3-1. 이름만 호출하면
	washer();	
	line();			// =============
	 /*																													*/
	 /*																													*/
	}
		public static void line() {System.out.println("=====");}
}

/*
 * method001. java		<--- javac method001.java
 * method001.java		<---java method001
 * ---------------------------------------[Runtime Data Area]
 * [method area - 클래스정보(공통공간), static, final ]
 * (↓ method001 이라는 클래스의 정보가 올라감)
 * #1. class method001 - washer / main
 * ---------------------------------------
 *  [heap - 동적]						|	[java stack - 임시]
 * 													|	#4. [println(){}    ] ↓꺼짐5
 * 													|	#3. [washer(){}  	  ] ↓꺼짐6
 * 													|	#2. [main{}			  ] ↓꺼짐7
 * ----------------------------------------
 * 
 * */

