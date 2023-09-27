package com.company.day012_while_dowhile;

public class RepeatEx001 {
	public static void main(String[] args) {
		// ver0 1~20까지의 정수중에서 2또는 3의 배수가 아닌 수의 총합
		// ver1 만약 1이 2또는 3의 배수가 아니라면 총합 더해주기
		// ver2 if(만약 1이 2또는 3의 배수가 아니라면) {총합 더해주기)

		// ver3 int sum=0;
		// if(!(1%2==0 || 1%3==0 )) {sum +=1;}
		// if(!(3%2==0 || 3%3==0 )) {sum +=3;}

		// if(1%2!=0 && 1%3!=0) {sum +=1;}
		// if(2%2!=0 && 2%3!=0) {sum +=2;}

		// ver4 for {} {변수} for(시작;종료;변화)

		// for
		int sum = 0;
		for (int i = 1; i < 21; i++) {
			if (!(i % 2 == 0 || i % 3 == 0)) {
				sum += i;
			}
		}
		System.out.println(sum);

		// while
		sum = 0;
		int i = 1;
		while (i < 21) {
			if (!(i % 2 == 0 || i % 3 == 0)) {
				sum += i;
			}
			i++;
		}
		System.out.println(sum);

		// do while
		sum = 0;
		i = 1;
		do {
			if (!(i % 2 == 0 || i % 3 == 0)) {
				sum += i;
			}
			i++;
		} while (i < 21);
		System.out.println(sum);

	}
}
