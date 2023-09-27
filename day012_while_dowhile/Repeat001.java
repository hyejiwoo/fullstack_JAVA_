package com.company.day012_while_dowhile;

public class Repeat001 {
	public static void main(String[] args) {
		//for : 순서 개수를 알고 싶을때
		//while : 개수를 모를때
		//do while : 무조건 1번은 실행을 해야할때(할배들도 안 쓰는 코드) ex)체험판 끝나고 30일 지났다고 알려줄때
		// 1for 2while 3do while

		//1
		System.out.println("\n\nfor-ver");
		for(int i=1; i<4; i++) {// <=(같거나~) 이거 보다는,  <> 이거를 더 선호}
			System.out.println(i + "\t");
		}

		//2
		System.out.println("\n\nwhile-ver");
		int i = 1;  //#2 초기문 : for()안에 있던 초기문을 while은 위 쪽으로
		while(i<4) {	//#0    		#1 while
			System.out.println(i + "\t");
		i++;}		//#3 증감문

		//3
		System.out.println("\n\ndowhile-ver");
		i = 10;
		do{	//##1.  무조건 한 번은 실행!
			System.out.println(i + "\t");
			i++;
		}while(i<4);	//##2.


	}
}





