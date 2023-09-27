package com.company.day010_FOR;

public class For006_2 {
	public static void main(String[] args) {
		// ver1 int total=0; total[0]
		// 1이 3의 배수라면...

		// ver2 int total=0; total[0]
		// if(1이 3의 배수라면) {total 더하기}

		// ver3 int total=0; total[0]
		// if(1%3==0) {total+=1;}

		int total = 0;
		for (int i = 0; i <= 10; i++) {
			System.out.println("1~10 중에서 3의 배수의 합" + total);
		}
	}
}
