package com.company.day012_while_dowhile;

public class RepeatEx002 {
	public static void main(String[] args) {
		// ver0 1+(1+2)+(1+2+3)+......(1+2+3+....+10)=220
		// ver1 누적 : [box] -> int sub=0; 총합 : 220 -> total=0;

		// 1회차 1 = 1 sub[1] total[0 + 1(sub)]
		// 2회차 [1]+2 = 4 sub[1]+2 total[1+3(sub)]
		// 3회차 [1]+2 + [1+2]+3
		// = = 6 sub[1+2]+3 total[1+5(sub)]

		// 1회차 sub total
		// 1 sub[0+1] total[0] + total[0+1]
		// sub+=1 total +=sub
		// 2회차
		// 4 = 1(1+2) , >> 새롭게 (1+2)이 추가
		// sub[0+1]+2 total[1] + sub[0+1]+2
		// sub+=2 total+=sub


		/*
		 * sub+=1; total+=sub; sub+=2; total+=sub; sub+=3; total+=sub;
		 */


		// for
		System.out.println("\n\n1. FOR");
		int sub=0; int total = 0;
		for (int i = 1; i < 11; i++)
			{sub += i;		total += sub; }
		System.out.println("=" + total);

		// while
		System.out.println("\n\n2. WHILE");
		sub=0; total = 0;
		int i=1;
		while(i < 11)
			{sub += i;		total += sub; i++;}
		System.out.println("=" + total);

		// do while
		System.out.println("\n\n3. do WHILE");
		sub=0; total = 0; i=1;
		do{
			sub += i;		total += sub;
		i++;}while(i<11);
		System.out.println("=" + total);


	}
}
