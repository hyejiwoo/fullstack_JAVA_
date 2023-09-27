package com.company.day016_arr2;

public class Arr2011 {
	public static void main(String[] args) {
		int[][] da1 = new int[2][3];
			int data = 1;

//			ver0
//			da1[0][1]=data;		data *=10
//			da1[0][1]=data;		data *=10
//			da1[0][1]=data;		data *=10
//			da1[0][1]=data;		data *=10
//			da1[0][1]=data;		data *=10
//			da1[0][1]=data;		data *=10
//			
			//ver1
//			for(int kan =0; kan< da1[0].length; kan++) 
//				{da1[0][kan]  = data;  data*=10;}

			//ver2
			for(int ch =0; ch< da1.length; ch++) {
				for (int kan = 0; kan < da1[ch].length; kan++) 
					{da1[ch][kan]  = data;  data*=10;}
				}
			
			for(int ch =0; ch< da1.length; ch++) { //층 - 배열의 층
				for (int kan = 0; kan < da1[ch].length; kan++) 	// 층의 칸
						System.out.print(da1[ch][kan] + "\t");
			}System.out.println();
			

		// ver3
		

	}
}
