package com.company.day012_while_dowhile;

public class Repeat004 {
	public static void main(String[] args) {

		// 해야할일1, 합구하기(누적), 2.출력결과물 만들기 () 3+ 6 +9

		// ver1

		// ver2
		// int sum=0; String result="";
		// if(만약 1이 3의 배수라면) {result =((sum==0)? "":"+")+1; sum+=1;}

		// ver3
		// if(1%3==0) {result =((sum==0)? "":"+")+1; sum+=1;}

		int sum =0;
		String result="";

		for(int i=1; i<11; i++) {
			if(i%3==0) {result+=((sum==0)?"":"+")+i; sum+=i;}

		}
		System.out.println(result + "="+sum);


		sum =0;
		result="";
		int i=1;
		while( i<11) {
			if(i%3==0) {result+=((sum==0)?"":"+")+i; sum+=i;}
			i++;
		}
		System.out.println(result + "="+sum);



		sum =0;
		result="";
		i=1;
		do{
			if(i%3==0) {result+=((sum==0)?"":"+")+i; sum+=i;}
			i++;
		}while(i<11);
		System.out.println(result + "="+sum);
	}
}



/*
 * 	System.out.println("\n\n1.For");
	int sum = 0;
	String result = " ";
	for (int i = 1; i < 11; i++) {
		if (i % 3 == 0) {
			result += i;
			System.out.print(((sum++ != 0) ? "+" : "") + i);
		}
	}
	System.out.println(result + "=" + sum);

	System.out.println("\n\n2.While");
	sum = 0;
	result = "";
	int i = 1;
	while (i < 11) {
		if (i % 3 == 0) {
			result += i;
			System.out.println(((sum++ != 0) ? "+" : "") + i);
		}
		i++;
	}
	System.out.println(result + "+" + sum);

	System.out.println("\n\n3.do While");
	sum = 0;
	result = "";
	i = 1;
	do {
		if (i % 3 == 0) {
			result += i;
			System.out.println(((sum++ != 0) ? "+" : "") + i);
		}
		i++;
	} while (i < 11);
	System.out.println(result + "+" + sum);

}
 *
 * */
