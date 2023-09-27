package com.company.day008_IF;

public class IF001 {
	public static void main(String[] args) {
		//1형식
		int a = 0;
		System.out.println("1형식 - 조건을 무조건 읽음");
		if(a==0){System.out.println(a + "는 Zero");}
		if(a==1){System.out.println(a + "는 one ");}	

		//2형식 - if(조건){조건이 참일경우}else{조건이 거짓일 경우}
		System.out.println("2형식 - 맞다/틀리다.");
		a=1;
		if(a==1){System.out.println(a + "는 one");}
		else	{System.out.println(a + "는 Zero가 아니다");}
		
		//3형식 - 조건이 여러개
		a=2;
		
			if(a==0) {System.out.println(a + "는 Zero") ;}
	   else if(a==1) {System.out.println(a + "는 1이다");}
	   else if(a==2) {System.out.println(a + "는 2이다");}
	   else		     {System.out.println(a + "는 0,1,2가 아니다");}
			
	}
}
