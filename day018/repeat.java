package com.company.day018;

import java.util.Scanner;

public class repeat {
	public static void main(String[] args) {
		System.out.println("=====1번======");
		
		String good = "GOOD!";
			
			for(int i = 1; i < 2; i++) {
				System.out.println(good);
			}

			int i = 1; 
			while(i < 2 ) {
				System.out.println(good);
				i++;
			}
			
			i =1;
			do {
				System.out.println(good);
			i++;}while(i < 2);
	
	
	}
}
