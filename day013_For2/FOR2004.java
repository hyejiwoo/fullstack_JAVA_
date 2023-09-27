package com.company.day013_For2;

public class FOR2004 {
	public static void main(String[] args) {

			//ver1
		    System.out.println("\n\nVer1");
		    System.out.print("****\n");
		    System.out.print("***\n");
		    System.out.print("**\n");
			System.out.print("*\n");

			//ver2
			System.out.println("\n\nVer2");
			for(int kan =1; kan<=4; kan++) {System.out.print("*");}
			System.out.println();
			for(int kan =1; kan<=3; kan++) {System.out.print("*");}
			System.out.println();
			for(int kan =1; kan<=2; kan++) {System.out.print("*");}
			System.out.println();
			for(int kan =1; kan<=1; kan++) {System.out.print("*");}
			System.out.println();

			//ver 3
			System.out.println("\n\nVer3");
			for(int ch =1; ch<=4; ch++) {
				System.out.println(ch + "층");	//층

				for(int kan =1; kan<=(4-ch+1); kan++) {
					System.out.print("*");		//4 3 2 1
				}
				//1234
				//1234
				//1234
				//1234
				System.out.println();
			}

	}
}
