package com.company.minibank;

import java.util.Scanner;

public class Minibank_counter {
	public static void main(String[] args) {
		int plus = 0;
		char userid = ' ';
		char userpw = ' ';
		int age = 0;
		int remain = 0;
		int money = 0;
		char del = ' ';
		boolean se = true;

		Scanner scanner = new Scanner(System.in);

		while (se) {
			System.out.println("Welcom! (주)CodeJohns Bank\n====BANK====");
			System.out.println("* 1.추가\n* 2.조회\n* 3.입금\n* 4.출금\n* 5.삭제\n* 9.종료\n");
			System.out.println("입력>>>");
			plus = scanner.nextInt();

			switch (plus) {
			case 1:
				System.out.println("아이디  입력:");
				userid = scanner.next().charAt(0);
				System.out.println("비밀번호 입력:");
				userpw = scanner.next().charAt(0);
				System.out.println("나이 입력:");
				age = scanner.nextInt();
				System.out.println("잔액 입력:");
				money = scanner.nextInt();
				break;
			case 2:
				System.out.println("id :");
				userid = scanner.next().charAt(0);
				System.out.println("pass :");
				userpw = scanner.next().charAt(0);
			
				if (userid != userid && userpw != userpw) { // warning
					System.out.println("다시 확인해주세요.");
				}
					else if (userid == 0 && userpw == 0) {
						System.out.println("계좌가 없습니다."); // 해당 문구 출력 안됨
				}
					else if (userid == userid && userpw == userpw) { // warning
						System.out.println("==계좌조회"); // 해당 문구 정상 출력
						System.out.println("ID : " + userid);
						System.out.println("PASS : " + userpw);
						System.out.println("나이 : " + age);
						System.out.println("잔액 : " + money);
				}
				break;
		
			case 3:
				System.out.println("id :");
				userid = scanner.next().charAt(0);
				System.out.println("pass :b");
				userpw = scanner.next().charAt(0);
				System.out.println("입금 :");
				money += scanner.nextInt();
				System.out.println("===입금완료");
				System.out.println("잔액 :" + money);
				break;
			case 4:
				System.out.println("id :");
				userid = scanner.next().charAt(0);
				System.out.println("pass :b");
				userpw = scanner.next().charAt(0);
				System.out.println("출금 :");
				remain = scanner.nextInt();
				if (remain > money) {
					System.out.println("잔액이 부족합니다.");
				} else {
					System.out.println("===출금완료");
					System.out.println("잔액 :" + (remain - money));
				}
				break;
			case 5:
				System.out.println("계좌를 삭제하시겠습니까? (Y/N)");
				del = scanner.next().charAt(0);
				if (del == 'Y' || del == 'y') {
//					userid = 0;
//					userpw = 0;
//					age = 0;
//					remain = 0;
//					money = 0;
					// 받은 데이터 삭제
					System.out.println("삭제완료");
				} else if (del == 'N' || del == 'n') {
					System.out.println(":)");
				}
				break;
			case 9:
				System.out.println("종료기능 입니다.");
				se = false;
			}

		}

	}
}
