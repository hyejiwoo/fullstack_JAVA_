package com.company.day018;

public class Method003 {	
	//										◆washer2(       2);		int d = 2;
	//										◆washer1(       1);		int d = 1;
	public static void washer1(int d) {	
		System.out.println(d + "스푼으로 세탁을 합니다.");
	}
	//										 ◆washer2(			  1, 				"티셔츠");	int d = 1; target = "티셔츠";
	public static void washer2(int d, String target) {
				System.out.println(target + "을(를) 세제" + d  + "스푼으로 세탁을 합니다.");
	}
	
	/*																						*/
	/*																						*/
	public static void main(String[] args) {
			washer1(1);
			washer1(2);
			washer2(1, "티셔츠");	// String은 heap 영역에 저장한 것을 가져와.
			washer2(2, "재킷");
			
			/////////////////////////////////////////////
			myInt(1);	//public static void(리턴값) myInt(메서드명) (재료)
			myInt(2);
			myInt(3);
			
			
			myFloat(1.1f);		// publics static void myFloat(파라미터 알규먼트)
			myFloat(1.2f);		// publics static void myFloat(자료형 변수)
			myFloat(1.3f);		// publics static void myFloat(float a)

			myDouble(1, 2);			// publics static void myDouble(파라미터 알규먼트)
			myDouble(1.1,1.2);	// publics static void myDouble(자료형 변수)
			myDouble('a','b');		// publics static void myDouble(Double a, Double b)
			
			
	}// end main	
	/*																						*/
	/*																						*/
	public static void myInt(int a) {System.out.println(a);}
	public static void myFloat(float a) {System.out.println(a);}
	public static void myDouble(double a, double b) {System.out.println(a+b);}
	//변수명은 같아도 괜찮다.
	
}//end class


/*
 * method002. java		<--- javac method002.java
 * method002.java		<---java method002
 * ---------------------------------------[Runtime Data Area]
 * [method area - 클래스정보(공통공간), static, final ]
 * (↓ method002 이라는 클래스의 정보가 올라감)
 * #1. class method002 - washer1 /washer1/  main
 * ---------------------------------------
 *  [heap - 동적]						|	[java stack - 임시]
 * 													|	#4. [println()	 {*s7			*s8}    	  ] 
 * 													|	#3. [washer1(2){*s6			*s9}  	  ] 기능끝남!
 * 													|	#4. [println()	 {*s3			*s4}    	  ] 
 * 													|	#3. [washer1(1){*s2			*s5}  	  ] 기능끝남!
 * 													|	#2. [main				 {*s1			*s6}		  ] 
 * ----------------------------------------
 * 													|	#8. [println()	 						  {*s11			*s12}     ] 
 *1000번지 "티셔츠" 	<--- |   #7. [washer2(1,	1000번지){*s10			*s13}  	  ] 기능끝남!
 * 													|	#6. [println()	 						  {*s7			*s8}        ] 
 * 													|	#5. [washer1(2)						  {*s6		*s9}  	  	  ] 기능끝남!
 * 													|	#4. [println()	 						  {*s3			*s4}    	  ] 
 * 													|	#3. [washer1(1)						  {*s2			*s5}  	  ] 기능끝남!
 * 													|	#2. [main				 						   {*s1			*s6}		  ] 
 * ----------------------------------------
 * 
 * */
