package com.company.day016_arr2;

public class Arr2000 {
	public static void main(String[] args) {
			//1차원 배열								JAVA STACK							HEAP AREA
			int[] num1 = {1, 2};		//num1(stack)[[I@626b2d4a] = 1000번지{1,2(heap)}		
			int[] num2 = {4, 5};		//num2(stack)[[I@5e91993f] = 2000번지{4,5(heap)}		
	
			System.out.println(num1);
			System.out.println(num1.length);		// 몇 칸 빌려왔어?  -> 2
			System.out.println(num1[0]);				// 1
			
			
			//2차원배열
			//층 칸
			
			int [][] num = { {1,2},		//00 01
											{3,4}  };		//10 11

			//ver3
			for(int i = 0; i < num.length; i++) {
				for(int j =0; j < num[i].length; j++) {
					System.out.println(num[i][j]);
				}
			}
			
			for(int i = 0; i < num.length; i++) {
				for(int j =0; j < num[i].length; j++) {
					System.out.println(num.length);				//층의 갯수
					System.out.println(num[0].length);		//0층의 칸의 갯수
				}
			}

			
			for(int i = 0; i < num.length; i++) {
				for(int j =0; j < num[i].length; j++) {
					System.out.println(num[0][0] + "\t");
					System.out.println(num[0][1] + "\t");	System.out.println();
				}
			}
			
			for(int i = 0; i < num.length; i++) {
				for(int j =0; j < num[i].length; j++) {
					System.out.println(num[1][0] + "\t");
					System.out.println(num[1][1] + "\t");	System.out.println();
				}
			}


			
	}
}
