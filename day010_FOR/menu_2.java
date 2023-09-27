package com.company.day010_FOR;

import java.util.Scanner;

public class menu_2 {
	public static void main(String[] args) {
		// 변수
		int num = 0;
		String ac = "입력받은 번호가", f = "이라면", d = "입니다.", activ = "기능";

		Scanner scanner = new Scanner(System.in);

		// 입력
		System.out.print("======BANK======");
		System.out.print(
				"\n" + "1. 추가" + "\n" + "2. 조회" + "\n" + "3. 입금" + "\n" + "4. 출금" + "\n" + "5. 삭제" + "\n" + "9. 종료");
		System.out.println("\n" + "입력>>>");
		num = scanner.nextInt();

		// ver0 입력받은 번호가 num이라면 추가기능 입니다.

		// ver1 (입력받은 번호가 num이라면) {추가기능 입니다.}

		// ver2 if(입력받은 번호가 num이라면) { result = active +"기능" }

		// ver3 if(num==0) {result = active + "기능"}

	}
}
