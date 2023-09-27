package com.company.day010_FOR;

import java.util.Scanner;

public class menu {
	public static void main(String[] args) {
		// 변수
		int num = 0;
		String result = "입력받은 번호가";

		Scanner scanner = new Scanner(System.in);

		// 입력
		System.out.print("======BANK======");
		System.out.print(
				"\n" + "1.추가" + "\n" + "2. 조회" + "\n" + "3. 입금" + "\n" + "4. 출금" + "\n" + "5. 삭제" + "\n" + "9. 종료");
		System.out.println("\n" + "입력>>>");
		num = scanner.nextInt();

		// ver0 입력받은 번호가 num이라면 추가기능 입니다.

		// ver1 (입력받은 번호가 num이라면) {추가기능 입니다.}

		// ver2 if(입력받은 번호가 num이라면) { result = active +"기능" }

		// ver3 if(num==0) {result = active + "기능"}




		result += (num == 1) ? num + "이라면 추가기능 입니다."
				: (num == 2) ? num + "이라면 조회기능 입니다."
				: (num == 3) ? num + "이라면 입금기능 입니다."
				: (num == 4) ? num + "이라면 출금기능 입니다."
				: (num == 5) ? num + "이라면 삭제기능 입니다."
				: (num == 9) ? num + "이라면 종료기능 입니다." : "잘못 선택됨!";

		System.out.println(result);
	}

}
