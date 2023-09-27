package com.company.day010_FOR;

import java.io.InputStream;
import java.util.Scanner;

public class For012 {
	public static void main(String[] args) {
		int start = 0, end = 0, sum = 0;
		String result ="";
		Scanner scanner = new Scanner(System.in);

		System.out.println("숫자 1 입력 :");
		start=scanner.nextInt();
		//2#   5#
		// 입력
		System.out.println("숫자 2 입력 :");
		end=scanner.nextInt();
		//5#   2#
		// 처리+출력


			//			5		5<2			5>=2
			for(int i=start; start<end? i<=end : i>=end; i++) {	//4  3
				sum +=i;	//sum[0+5+4]
				result += ((i==start)? " " : "+") + i;	//5
				// i -- 처리
				if(!(start<end)) {i=2;}	//5-2=3	/4-2=2
			}

			System.out.println(result + "=" + sum);
	}

}

