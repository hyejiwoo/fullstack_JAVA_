package com.company.day010_FOR;

public class For006 {
	public static void main(String[] args) {
		// ver0 1~10까지의 3의 배수의 합 : 18
		// ver1 1이 3의 배수라면 a 더하기
		// ver1 2이 3의 배수라면 a 더하기
		// ver1 3이 3의 배수라면 a 더하기

		// ver1 if(1이 3의 배수라면) {a 더하기}
		// ver1 if(2이 3의 배수라면) {a 더하기}
		// ver1 if(3이 3의 배수라면) {a 더하기}

		// ver2 if(1%3==0) {a=a+1;}
		// ver2 if(2%3==0) {a=a+2;}
		// ver2 if(3%3==0) {a=a+3;}
		int a = 0;

		for (int i = 1; i <= 10; i++) {
			if (i % 3 == 0) {
				a = a + i;
			}
		}
		System.out.println("1~10까지의 3의 배수의 합 : " + a);

	}
}

//ver1  int cnt = 0;
// 1이 3의 배수라면 배수합 더하기
// 1이 3의 배수라면 배수합 더하기
// 1이 3의 배수라면 배수합 더하기

//ver2  int cnt = 0;
// if(1이 3의 배수라면) {배수합 더하기}
// if(2가 3의 배수라면) {배수합 더하기}
// if(3이 3의 배수라면) {배수합 더하기}

//ver2  int cnt = 0;
// if(1%3==0) {box+=1;}
// if(2%3==0) {box+=2;}
// if(3%3==0) {box+=3;}

/*
 * int a = 0; Scanner scanner = new Scanner(System.in);
 *
 *
 * //for문 안에 syso가 있으면 결과가 엄청 길어짐 System.out.println("1~10까지 3의 배수의 합 :");
 * for(int i = 0; i<=10; i++){ if(i%3==0) a += i; //System.out.println(a + i); }
 * System.out.println(a);
 */